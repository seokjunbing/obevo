CREATE TABLE TABLE_A (
	A_ID    INT	NOT NULL,
	B_ID    INT	NOT NULL,
	STRING_FIELD	VARCHAR(30)	NULL,
	TIMESTAMP_FIELD	TIMESTAMP	NULL,
	C_ID    INT	NULL,
	MYNEWCOL INT NULL,
    CONSTRAINT PK PRIMARY KEY (A_ID)
) IN ${defaultTablespace}
GO
ALTER TABLE TABLE_A ADD FOREIGN KEY FK_B (B_ID) REFERENCES TABLE_B(B_ID)
GO
CREATE INDEX TABLE_A_IND1 ON TABLE_A(C_ID)
GO
