using System;
using System.Collections.Generic;
using System.Text;
using SQLite;

namespace XamarinApp
{
    class RegisterClass
    {
        [PrimaryKey, AutoIncrement]
        public int Id { get; set; }

        public string Name { get; set; }
        public string Username { get; set; }
        public string Password { get; set; }
        
    }
}
