* Ｄｅｓｃｒｉｐｔｉｏｎ
    * REST service for receiving contacts, with regex filtering

* Ｈｏｗ ｔｏ ｒｕｎ
    * Install Postgres
    * Create a table "contacts"
    * Fill data
    * Run project through the IDE
    * Sample request
        * http://localhost:8080/hello/contacts?nameFilter=^A.*$
        * http://localhost:8080/hello/contacts?nameFilter=^.*[aei].*$