CREATE TABLE public."Contacts"
(
    name text COLLATE pg_catalog."default"
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public."Contacts"
    OWNER to postgres;

INSERT INTO public."Contacts"(name) VALUES ('Sean');
INSERT INTO public."Contacts"(name) VALUES ('Dave');
INSERT INTO public."Contacts"(name) VALUES ('Steve');
INSERT INTO public."Contacts"(name) VALUES ('Susan');
INSERT INTO public."Contacts"(name) VALUES ('Mary');
INSERT INTO public."Contacts"(name) VALUES ('Herbert');
