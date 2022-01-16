CREATE TABLE gregorianDates {
    dateId INT AUTO_INCREMENT PRIMARY_KEY,
    date DATE NOT NULL
}

CREATE TABLE tithis {
    tithiId INT AUTO_INCREMENT PRIMARY_KEY,
    dateId INT NOT NULL,
    day VARCHAR (20) NOT NULL,
    month VARCHAR (20) NOT NULL,
    year VARCHAR (20) NOT NULL,
    paksha VARCHAR (20) NOT NULL,
    sunriseTime VARCHAR (20) NOT NULL,
    sunsetTime VARCHAR (20) NOT NULL,
    nakshatra VARCHAR (20) NOT NULL,
    CONSTRAINT fk_tithis_date_id
    FOREIGN KEY (dateId)
    REFERENCES gregorianDates(id)
    ON DELETE CASCADE
    ON UPDATE CASCADE
}


CREATE TABLE festivals {
    festivalId INT AUTO_INCREMENT PRIMARY_KEY,
    dateId INT NOT NULL,
    tithiId INT NOT NULL,
    description varchar(200) NOT NULL,
    CONSTRAINT fk_festivals_date_id
    FOREIGN KEY (dateId)
    REFERENCES gregorianDates(id)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
    CONSTRAINT fk_festival_tithi_id
    FOREIGN KEY (tithiId)
    REFERENCES tithis(tithiId)
    ON DELETE CASCADE
    ON UPDATE CASCADE
};