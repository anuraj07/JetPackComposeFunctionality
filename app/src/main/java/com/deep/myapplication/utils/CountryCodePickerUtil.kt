package com.deep.myapplication.utils

import java.util.*

class CountryCodePickerUtil(
    val nameCode: String,
    val code: String,
    val fullName: String
) {}

fun getFlagEmojiFor(countryCode: String): String {
    return when (countryCode.lowercase()) {
        "ad" -> "🇦🇩"
        "ae" -> "🇦🇪"
        "af" -> "🇦🇫"
        "ag" -> "🇦🇬"
        "ai" -> "🇦🇮"
        "al" -> "🇦🇱"
        "am" -> "🇦🇲"
        "ao" -> "🇦🇴"
        "aq" -> "🇦🇶"
        "ar" -> "🇦🇷"
        "as" -> "🇦🇸"
        "at" -> "🇦🇹"
        "au" -> "🇦🇺"
        "aw" -> "🇦🇼"
        "ax" -> "🇦🇽"
        "az" -> "🇦🇿"
        "ba" -> "🇧🇦"
        "bb" -> "🇧🇧"
        "bd" -> "🇧🇩"
        "be" -> "🇧🇪"
        "bf" -> "🇧🇫"
        "bg" -> "🇧🇬"
        "bh" -> "🇧🇭"
        "bi" -> "🇧🇮"
        "bj" -> "🇧🇯"
        "bl" -> "🇧🇱"
        "bm" -> "🇧🇲"
        "bn" -> "🇧🇳"
        "bo" -> "🇧🇴"
        "bq" -> "🇧🇶"
        "br" -> "🇧🇷"
        "bs" -> "🇧🇸"
        "bt" -> "🇧🇹"
        "bv" -> "🇧🇻"
        "bw" -> "🇧🇼"
        "by" -> "🇧🇾"
        "bz" -> "🇧🇿"
        "ca" -> "🇨🇦"
        "cc" -> "🇨🇨"
        "cd" -> "🇨🇩"
        "cf" -> "🇨🇫"
        "cg" -> "🇨🇬"
        "ch" -> "🇨🇭"
        "ci" -> "🇨🇮"
        "ck" -> "🇨🇰"
        "cl" -> "🇨🇱"
        "cm" -> "🇨🇲"
        "cn" -> "🇨🇳"
        "co" -> "🇨🇴"
        "cr" -> "🇨🇷"
        "cu" -> "🇨🇺"
        "cv" -> "🇨🇻"
        "cw" -> "🇨🇼"
        "cx" -> "🇨🇽"
        "cy" -> "🇨🇾"
        "cz" -> "🇨🇿"
        "de" -> "🇩🇪"
        "dj" -> "🇩🇯"
        "dk" -> "🇩🇰"
        "dm" -> "🇩🇲"
        "do" -> "🇩🇴"
        "dz" -> "🇩🇿"
        "ec" -> "🇪🇨"
        "ee" -> "🇪🇪"
        "eg" -> "🇪🇬"
        "eh" -> "🇪🇭"
        "er" -> "🇪🇷"
        "es" -> "🇪🇸"
        "et" -> "🇪🇹"
        "fi" -> "🇫🇮"
        "fj" -> "🇫🇯"
        "fk" -> "🇫🇰"
        "fm" -> "🇫🇲"
        "fo" -> "🇫🇴"
        "fr" -> "🇫🇷"
        "ga" -> "🇬🇦"
        "gb" -> "🇬🇧"
        "gd" -> "🇬🇩"
        "ge" -> "🇬🇪"
        "gf" -> "🇬🇫"
        "gg" -> "🇬🇬"
        "gh" -> "🇬🇭"
        "gi" -> "🇬🇮"
        "gl" -> "🇬🇱"
        "gm" -> "🇬🇲"
        "gn" -> "🇬🇳"
        "gp" -> "🇬🇵"
        "gq" -> "🇬🇶"
        "gr" -> "🇬🇷"
        "gs" -> "🇬🇸"
        "gt" -> "🇬🇹"
        "gu" -> "🇬🇺"
        "gw" -> "🇬🇼"
        "gy" -> "🇬🇾"
        "hk" -> "🇭🇰"
        "hm" -> "🇭🇲"
        "hn" -> "🇭🇳"
        "hr" -> "🇭🇷"
        "ht" -> "🇭🇹"
        "hu" -> "🇭🇺"
        "id" -> "🇮🇩"
        "ie" -> "🇮🇪"
        "il" -> "🇮🇱"
        "im" -> "🇮🇲"
        "in" -> "🇮🇳"
        "io" -> "🇮🇴"
        "iq" -> "🇮🇶"
        "ir" -> "🇮🇷"
        "is" -> "🇮🇸"
        "it" -> "🇮🇹"
        "je" -> "🇯🇪"
        "jm" -> "🇯🇲"
        "jo" -> "🇯🇴"
        "jp" -> "🇯🇵"
        "ke" -> "🇰🇪"
        "kg" -> "🇰🇬"
        "kh" -> "🇰🇭"
        "ki" -> "🇰🇮"
        "km" -> "🇰🇲"
        "kn" -> "🇰🇳"
        "kp" -> "🇰🇵"
        "kr" -> "🇰🇷"
        "kw" -> "🇰🇼"
        "ky" -> "🇰🇾"
        "kz" -> "🇰🇿"
        "la" -> "🇱🇦"
        "lb" -> "🇱🇧"
        "lc" -> "🇱🇨"
        "li" -> "🇱🇮"
        "lk" -> "🇱🇰"
        "lr" -> "🇱🇷"
        "ls" -> "🇱🇸"
        "lt" -> "🇱🇹"
        "lu" -> "🇱🇺"
        "lv" -> "🇱🇻"
        "ly" -> "🇱🇾"
        "ma" -> "🇲🇦"
        "mc" -> "🇲🇨"
        "md" -> "🇲🇩"
        "me" -> "🇲🇪"
        "mf" -> "🇲🇫"
        "mg" -> "🇲🇬"
        "mh" -> "🇲🇭"
        "mk" -> "🇲🇰"
        "ml" -> "🇲🇱"
        "mm" -> "🇲🇲"
        "mn" -> "🇲🇳"
        "mo" -> "🇲🇴"
        "mp" -> "🇲🇵"
        "mq" -> "🇲🇶"
        "mr" -> "🇲🇷"
        "ms" -> "🇲🇸"
        "mt" -> "🇲🇹"
        "mu" -> "🇲🇺"
        "mv" -> "🇲🇻"
        "mw" -> "🇲🇼"
        "mx" -> "🇲🇽"
        "my" -> "🇲🇾"
        "mz" -> "🇲🇿"
        "na" -> "🇳🇦"
        "nc" -> "🇳🇨"
        "ne" -> "🇳🇪"
        "nf" -> "🇳🇫"
        "ng" -> "🇳🇬"
        "ni" -> "🇳🇮"
        "nl" -> "🇳🇱"
        "no" -> "🇳🇴"
        "np" -> "🇳🇵"
        "nr" -> "🇳🇷"
        "nu" -> "🇳🇺"
        "nz" -> "🇳🇿"
        "om" -> "🇴🇲"
        "pa" -> "🇵🇦"
        "pe" -> "🇵🇪"
        "pf" -> "🇵🇫"
        "pg" -> "🇵🇬"
        "ph" -> "🇵🇭"
        "pk" -> "🇵🇰"
        "pl" -> "🇵🇱"
        "pm" -> "🇵🇲"
        "pn" -> "🇵🇳"
        "pr" -> "🇵🇷"
        "ps" -> "🇵🇸"
        "pt" -> "🇵🇹"
        "pw" -> "🇵🇼"
        "py" -> "🇵🇾"
        "qa" -> "🇶🇦"
        "re" -> "🇷🇪"
        "ro" -> "🇷🇴"
        "rs" -> "🇷🇸"
        "ru" -> "🇷🇺"
        "rw" -> "🇷🇼"
        "sa" -> "🇸🇦"
        "sb" -> "🇸🇧"
        "sc" -> "🇸🇨"
        "sd" -> "🇸🇩"
        "se" -> "🇸🇪"
        "sg" -> "🇸🇬"
        "sh" -> "🇸🇭"
        "si" -> "🇸🇮"
        "sj" -> "🇸🇯"
        "sk" -> "🇸🇰"
        "sl" -> "🇸🇱"
        "sm" -> "🇸🇲"
        "sn" -> "🇸🇳"
        "so" -> "🇸🇴"
        "sr" -> "🇸🇷"
        "ss" -> "🇸🇸"
        "st" -> "🇸🇹"
        "sv" -> "🇸🇻"
        "sx" -> "🇸🇽"
        "sy" -> "🇸🇾"
        "sz" -> "🇸🇿"
        "tc" -> "🇹🇨"
        "td" -> "🇹🇩"
        "tf" -> "🇹🇫"
        "tg" -> "🇹🇬"
        "th" -> "🇹🇭"
        "tj" -> "🇹🇯"
        "tk" -> "🇹🇰"
        "tl" -> "🇹🇱"
        "tm" -> "🇹🇲"
        "tn" -> "🇹🇳"
        "to" -> "🇹🇴"
        "tr" -> "🇹🇷"
        "tt" -> "🇹🇹"
        "tv" -> "🇹🇻"
        "tw" -> "🇹🇼"
        "tz" -> "🇹🇿"
        "ua" -> "🇺🇦"
        "ug" -> "🇺🇬"
        "um" -> "🇺🇲"
        "us" -> "🇺🇸"
        "uy" -> "🇺🇾"
        "uz" -> "🇺🇿"
        "va" -> "🇻🇦"
        "vc" -> "🇻🇨"
        "ve" -> "🇻🇪"
        "vg" -> "🇻🇬"
        "vi" -> "🇻🇮"
        "vn" -> "🇻🇳"
        "vu" -> "🇻🇺"
        "wf" -> "🇼🇫"
        "ws" -> "🇼🇸"
        "xk" -> "🇽🇰"
        "ye" -> "🇾🇪"
        "yt" -> "🇾🇹"
        "za" -> "🇿🇦"
        "zm" -> "🇿🇲"
        "zw" -> "🇿🇼"
        else -> " "
    }
}

fun getCountriesList(): List<CountryCodePickerUtil> {
    val countries = mutableListOf<CountryCodePickerUtil>()
    countries.add(CountryCodePickerUtil("ad", "376", "Andorra"))
    countries.add(CountryCodePickerUtil("ae", "971", "United Arab Emirates (UAE))"))
    countries.add(CountryCodePickerUtil("af", "93", "Afghanistan"))
    countries.add(CountryCodePickerUtil("ag", "1", "Antigua and Barbuda"))
    countries.add(CountryCodePickerUtil("ai", "1", "Anguilla"))
    countries.add(CountryCodePickerUtil("al", "355", "Albania"))
    countries.add(CountryCodePickerUtil("am", "374", "Armenia"))
    countries.add(CountryCodePickerUtil("ao", "244", "Angola"))
    countries.add(CountryCodePickerUtil("aq", "672", "Antarctica"))
    countries.add(CountryCodePickerUtil("ar", "54", "Argentina"))
    countries.add(CountryCodePickerUtil("as", "1", "American Samoa"))
    countries.add(CountryCodePickerUtil("at", "43", "Austria"))
    countries.add(CountryCodePickerUtil("au", "61", "Australia"))
    countries.add(CountryCodePickerUtil("aw", "297", "Aruba"))
    countries.add(CountryCodePickerUtil("ax", "358", "Åland Islands"))
    countries.add(CountryCodePickerUtil("az", "994", "Azerbaijan"))
    countries.add(CountryCodePickerUtil("ba", "387", "Bosnia And Herzegovina"))
    countries.add(CountryCodePickerUtil("bb", "1", "Barbados"))
    countries.add(CountryCodePickerUtil("bd", "880", "Bangladesh"))
    countries.add(CountryCodePickerUtil("be", "32", "Belgium"))
    countries.add(CountryCodePickerUtil("bf", "226", "Burkina Faso"))
    countries.add(CountryCodePickerUtil("bg", "359", "Bulgaria"))
    countries.add(CountryCodePickerUtil("bh", "973", "Bahrain"))
    countries.add(CountryCodePickerUtil("bi", "257", "Burundi"))
    countries.add(CountryCodePickerUtil("bj", "229", "Benin"))
    countries.add(CountryCodePickerUtil("bl", "590", "Saint Barthélemy"))
    countries.add(CountryCodePickerUtil("bm", "1", "Bermuda"))
    countries.add(CountryCodePickerUtil("bn", "673", "Brunei Darussalam"))
    countries.add(CountryCodePickerUtil("bo", "591", "Bolivia, Plurinational State Of"))
    countries.add(CountryCodePickerUtil("br", "55", "Brazil"))
    countries.add(CountryCodePickerUtil("bs", "1", "Bahamas"))
    countries.add(CountryCodePickerUtil("bt", "975", "Bhutan"))
    countries.add(CountryCodePickerUtil("bw", "267", "Botswana"))
    countries.add(CountryCodePickerUtil("by", "375", "Belarus"))
    countries.add(CountryCodePickerUtil("bz", "501", "Belize"))
    countries.add(CountryCodePickerUtil("ca", "1", "Canada"))
    countries.add(CountryCodePickerUtil("cc", "61", "Cocos (keeling)) Islands"))
    countries.add(CountryCodePickerUtil("cd", "243", "Congo, The Democratic Republic Of The"))
    countries.add(CountryCodePickerUtil("cf", "236", "Central African Republic"))
    countries.add(CountryCodePickerUtil("cg", "242", "Congo"))
    countries.add(CountryCodePickerUtil("ch", "41", "Switzerland"))
    countries.add(CountryCodePickerUtil("ci", "225", "Côte D'ivoire"))
    countries.add(CountryCodePickerUtil("ck", "682", "Cook Islands"))
    countries.add(CountryCodePickerUtil("cl", "56", "Chile"))
    countries.add(CountryCodePickerUtil("cm", "237", "Cameroon"))
    countries.add(CountryCodePickerUtil("cn", "86", "China"))
    countries.add(CountryCodePickerUtil("co", "57", "Colombia"))
    countries.add(CountryCodePickerUtil("cr", "506", "Costa Rica"))
    countries.add(CountryCodePickerUtil("cu", "53", "Cuba"))
    countries.add(CountryCodePickerUtil("cv", "238", "Cape Verde"))
    countries.add(CountryCodePickerUtil("cw", "599", "Curaçao"))
    countries.add(CountryCodePickerUtil("cx", "61", "Christmas Island"))
    countries.add(CountryCodePickerUtil("cy", "357", "Cyprus"))
    countries.add(CountryCodePickerUtil("cz", "420", "Czech Republic"))
    countries.add(CountryCodePickerUtil("de", "49", "Germany"))
    countries.add(CountryCodePickerUtil("dj", "253", "Djibouti"))
    countries.add(CountryCodePickerUtil("dk", "45", "Denmark"))
    countries.add(CountryCodePickerUtil("dm", "1", "Dominica"))
    countries.add(CountryCodePickerUtil("do", "1", "Dominican Republic"))
    countries.add(CountryCodePickerUtil("dz", "213", "Algeria"))
    countries.add(CountryCodePickerUtil("ec", "593", "Ecuador"))
    countries.add(CountryCodePickerUtil("ee", "372", "Estonia"))
    countries.add(CountryCodePickerUtil("eg", "20", "Egypt"))
    countries.add(CountryCodePickerUtil("er", "291", "Eritrea"))
    countries.add(CountryCodePickerUtil("es", "34", "Spain"))
    countries.add(CountryCodePickerUtil("et", "251", "Ethiopia"))
    countries.add(CountryCodePickerUtil("fi", "358", "Finland"))
    countries.add(CountryCodePickerUtil("fj", "679", "Fiji"))
    countries.add(CountryCodePickerUtil("fk", "500", "Falkland Islands (malvinas))"))
    countries.add(CountryCodePickerUtil("fm", "691", "Micronesia, Federated States Of"))
    countries.add(CountryCodePickerUtil("fo", "298", "Faroe Islands"))
    countries.add(CountryCodePickerUtil("fr", "33", "France"))
    countries.add(CountryCodePickerUtil("ga", "241", "Gabon"))
    countries.add(CountryCodePickerUtil("gb", "44", "United Kingdom"))
    countries.add(CountryCodePickerUtil("gd", "1", "Grenada"))
    countries.add(CountryCodePickerUtil("ge", "995", "Georgia"))
    countries.add(CountryCodePickerUtil("gf", "594", "French Guyana"))
    countries.add(CountryCodePickerUtil("gh", "233", "Ghana"))
    countries.add(CountryCodePickerUtil("gi", "350", "Gibraltar"))
    countries.add(CountryCodePickerUtil("gl", "299", "Greenland"))
    countries.add(CountryCodePickerUtil("gm", "220", "Gambia"))
    countries.add(CountryCodePickerUtil("gn", "224", "Guinea"))
    countries.add(CountryCodePickerUtil("gp", "450", "Guadeloupe"))
    countries.add(CountryCodePickerUtil("gq", "240", "Equatorial Guinea"))
    countries.add(CountryCodePickerUtil("gr", "30", "Greece"))
    countries.add(CountryCodePickerUtil("gt", "502", "Guatemala"))
    countries.add(CountryCodePickerUtil("gu", "1", "Guam"))
    countries.add(CountryCodePickerUtil("gw", "245", "Guinea-bissau"))
    countries.add(CountryCodePickerUtil("gy", "592", "Guyana"))
    countries.add(CountryCodePickerUtil("hk", "852", "Hong Kong"))
    countries.add(CountryCodePickerUtil("hn", "504", "Honduras"))
    countries.add(CountryCodePickerUtil("hr", "385", "Croatia"))
    countries.add(CountryCodePickerUtil("ht", "509", "Haiti"))
    countries.add(CountryCodePickerUtil("hu", "36", "Hungary"))
    countries.add(CountryCodePickerUtil("id", "62", "Indonesia"))
    countries.add(CountryCodePickerUtil("ie", "353", "Ireland"))
    countries.add(CountryCodePickerUtil("il", "972", "Israel"))
    countries.add(CountryCodePickerUtil("im", "44", "Isle Of Man"))
    countries.add(CountryCodePickerUtil("is", "354", "Iceland"))
    countries.add(CountryCodePickerUtil("in", "91", "India"))
    countries.add(CountryCodePickerUtil("io", "246", "British Indian Ocean Territory"))
    countries.add(CountryCodePickerUtil("iq", "964", "Iraq"))
    countries.add(CountryCodePickerUtil("ir", "98", "Iran, Islamic Republic Of"))
    countries.add(CountryCodePickerUtil("it", "39", "Italy"))
    countries.add(CountryCodePickerUtil("je", "44", "Jersey "))
    countries.add(CountryCodePickerUtil("jm", "1", "Jamaica"))
    countries.add(CountryCodePickerUtil("jo", "962", "Jordan"))
    countries.add(CountryCodePickerUtil("jp", "81", "Japan"))
    countries.add(CountryCodePickerUtil("ke", "254", "Kenya"))
    countries.add(CountryCodePickerUtil("kg", "996", "Kyrgyzstan"))
    countries.add(CountryCodePickerUtil("kh", "855", "Cambodia"))
    countries.add(CountryCodePickerUtil("ki", "686", "Kiribati"))
    countries.add(CountryCodePickerUtil("km", "269", "Comoros"))
    countries.add(CountryCodePickerUtil("kn", "1", "Saint Kitts and Nevis"))
    countries.add(CountryCodePickerUtil("kp", "850", "North Korea"))
    countries.add(CountryCodePickerUtil("kr", "82", "South Korea"))
    countries.add(CountryCodePickerUtil("kw", "965", "Kuwait"))
    countries.add(CountryCodePickerUtil("ky", "1", "Cayman Islands"))
    countries.add(CountryCodePickerUtil("kz", "7", "Kazakhstan"))
    countries.add(CountryCodePickerUtil("la", "856", "Lao People's Democratic Republic"))
    countries.add(CountryCodePickerUtil("lb", "961", "Lebanon"))
    countries.add(CountryCodePickerUtil("lc", "1", "Saint Lucia"))
    countries.add(CountryCodePickerUtil("li", "423", "Liechtenstein"))
    countries.add(CountryCodePickerUtil("lk", "94", "Sri Lanka"))
    countries.add(CountryCodePickerUtil("lr", "231", "Liberia"))
    countries.add(CountryCodePickerUtil("ls", "266", "Lesotho"))
    countries.add(CountryCodePickerUtil("lt", "370", "Lithuania"))
    countries.add(CountryCodePickerUtil("lu", "352", "Luxembourg"))
    countries.add(CountryCodePickerUtil("lv", "371", "Latvia"))
    countries.add(CountryCodePickerUtil("ly", "218", "Libya"))
    countries.add(CountryCodePickerUtil("ma", "212", "Morocco"))
    countries.add(CountryCodePickerUtil("mc", "377", "Monaco"))
    countries.add(CountryCodePickerUtil("md", "373", "Moldova, Republic Of"))
    countries.add(CountryCodePickerUtil("me", "382", "Montenegro"))
    countries.add(CountryCodePickerUtil("mf", "590", "Saint Martin"))
    countries.add(CountryCodePickerUtil("mg", "261", "Madagascar"))
    countries.add(CountryCodePickerUtil("mh", "692", "Marshall Islands"))
    countries.add(CountryCodePickerUtil("mk", "389", "Macedonia (FYROM))"))
    countries.add(CountryCodePickerUtil("ml", "223", "Mali"))
    countries.add(CountryCodePickerUtil("mm", "95", "Myanmar"))
    countries.add(CountryCodePickerUtil("mn", "976", "Mongolia"))
    countries.add(CountryCodePickerUtil("mo", "853", "Macau"))
    countries.add(CountryCodePickerUtil("mp", "1", "Northern Mariana Islands"))
    countries.add(CountryCodePickerUtil("mq", "596", "Martinique"))
    countries.add(CountryCodePickerUtil("mr", "222", "Mauritania"))
    countries.add(CountryCodePickerUtil("ms", "1", "Montserrat"))
    countries.add(CountryCodePickerUtil("mt", "356", "Malta"))
    countries.add(CountryCodePickerUtil("mu", "230", "Mauritius"))
    countries.add(CountryCodePickerUtil("mv", "960", "Maldives"))
    countries.add(CountryCodePickerUtil("mw", "265", "Malawi"))
    countries.add(CountryCodePickerUtil("mx", "52", "Mexico"))
    countries.add(CountryCodePickerUtil("my", "60", "Malaysia"))
    countries.add(CountryCodePickerUtil("mz", "258", "Mozambique"))
    countries.add(CountryCodePickerUtil("na", "264", "Namibia"))
    countries.add(CountryCodePickerUtil("nc", "687", "New Caledonia"))
    countries.add(CountryCodePickerUtil("ne", "227", "Niger"))
    countries.add(CountryCodePickerUtil("nf", "672", "Norfolk Islands"))
    countries.add(CountryCodePickerUtil("ng", "234", "Nigeria"))
    countries.add(CountryCodePickerUtil("ni", "505", "Nicaragua"))
    countries.add(CountryCodePickerUtil("nl", "31", "Netherlands"))
    countries.add(CountryCodePickerUtil("no", "47", "Norway"))
    countries.add(CountryCodePickerUtil("np", "977", "Nepal"))
    countries.add(CountryCodePickerUtil("nr", "674", "Nauru"))
    countries.add(CountryCodePickerUtil("nu", "683", "Niue"))
    countries.add(CountryCodePickerUtil("nz", "64", "New Zealand"))
    countries.add(CountryCodePickerUtil("om", "968", "Oman"))
    countries.add(CountryCodePickerUtil("pa", "507", "Panama"))
    countries.add(CountryCodePickerUtil("pe", "51", "Peru"))
    countries.add(CountryCodePickerUtil("pf", "689", "French Polynesia"))
    countries.add(CountryCodePickerUtil("pg", "675", "Papua New Guinea"))
    countries.add(CountryCodePickerUtil("ph", "63", "Philippines"))
    countries.add(CountryCodePickerUtil("pk", "92", "Pakistan"))
    countries.add(CountryCodePickerUtil("pl", "48", "Poland"))
    countries.add(CountryCodePickerUtil("pm", "508", "Saint Pierre And Miquelon"))
    countries.add(CountryCodePickerUtil("pn", "870", "Pitcairn Islands"))
    countries.add(CountryCodePickerUtil("pr", "1", "Puerto Rico"))
    countries.add(CountryCodePickerUtil("ps", "970", "Palestine"))
    countries.add(CountryCodePickerUtil("pt", "351", "Portugal"))
    countries.add(CountryCodePickerUtil("pw", "680", "Palau"))
    countries.add(CountryCodePickerUtil("py", "595", "Paraguay"))
    countries.add(CountryCodePickerUtil("qa", "974", "Qatar"))
    countries.add(CountryCodePickerUtil("re", "262", "Réunion"))
    countries.add(CountryCodePickerUtil("ro", "40", "Romania"))
    countries.add(CountryCodePickerUtil("rs", "381", "Serbia"))
    countries.add(CountryCodePickerUtil("ru", "7", "Russian Federation"))
    countries.add(CountryCodePickerUtil("rw", "250", "Rwanda"))
    countries.add(CountryCodePickerUtil("sa", "966", "Saudi Arabia"))
    countries.add(CountryCodePickerUtil("sb", "677", "Solomon Islands"))
    countries.add(CountryCodePickerUtil("sc", "248", "Seychelles"))
    countries.add(CountryCodePickerUtil("sd", "249", "Sudan"))
    countries.add(CountryCodePickerUtil("se", "46", "Sweden"))
    countries.add(CountryCodePickerUtil("sg", "65", "Singapore"))
    countries.add(CountryCodePickerUtil("sh", "290", "Saint Helena, Ascension And Tristan Da Cunha"))
    countries.add(CountryCodePickerUtil("si", "386", "Slovenia"))
    countries.add(CountryCodePickerUtil("sk", "421", "Slovakia"))
    countries.add(CountryCodePickerUtil("sl", "232", "Sierra Leone"))
    countries.add(CountryCodePickerUtil("sm", "378", "San Marino"))
    countries.add(CountryCodePickerUtil("sn", "221", "Senegal"))
    countries.add(CountryCodePickerUtil("so", "252", "Somalia"))
    countries.add(CountryCodePickerUtil("sr", "597", "Suriname"))
    countries.add(CountryCodePickerUtil("ss", "211", "South Sudan"))
    countries.add(CountryCodePickerUtil("st", "239", "Sao Tome And Principe"))
    countries.add(CountryCodePickerUtil("sv", "503", "El Salvador"))
    countries.add(CountryCodePickerUtil("sx", "1", "Sint Maarten"))
    countries.add(CountryCodePickerUtil("sy", "963", "Syrian Arab Republic"))
    countries.add(CountryCodePickerUtil("sz", "268", "Swaziland"))
    countries.add(CountryCodePickerUtil("tc", "1", "Turks and Caicos Islands"))
    countries.add(CountryCodePickerUtil("td", "235", "Chad"))
    countries.add(CountryCodePickerUtil("tg", "228", "Togo"))
    countries.add(CountryCodePickerUtil("th", "66", "Thailand"))
    countries.add(CountryCodePickerUtil("tj", "992", "Tajikistan"))
    countries.add(CountryCodePickerUtil("tk", "690", "Tokelau"))
    countries.add(CountryCodePickerUtil("tl", "670", "Timor-leste"))
    countries.add(CountryCodePickerUtil("tm", "993", "Turkmenistan"))
    countries.add(CountryCodePickerUtil("tn", "216", "Tunisia"))
    countries.add(CountryCodePickerUtil("to", "676", "Tonga"))
    countries.add(CountryCodePickerUtil("tr", "90", "Turkey"))
    countries.add(CountryCodePickerUtil("tt", "1", "Trinidad &amp; Tobago"))
    countries.add(CountryCodePickerUtil("tv", "688", "Tuvalu"))
    countries.add(CountryCodePickerUtil("tw", "886", "Taiwan"))
    countries.add(CountryCodePickerUtil("tz", "255", "Tanzania, United Republic Of"))
    countries.add(CountryCodePickerUtil("ua", "380", "Ukraine"))
    countries.add(CountryCodePickerUtil("ug", "256", "Uganda"))
    countries.add(CountryCodePickerUtil("us", "1", "United States"))
    countries.add(CountryCodePickerUtil("uy", "598", "Uruguay"))
    countries.add(CountryCodePickerUtil("uz", "998", "Uzbekistan"))
    countries.add(CountryCodePickerUtil("va", "379", "Holy See (vatican City State))"))
    countries.add(CountryCodePickerUtil("vc", "1", "Saint Vincent &amp; The Grenadines"))
    countries.add(CountryCodePickerUtil("ve", "58", "Venezuela, Bolivarian Republic Of"))
    countries.add(CountryCodePickerUtil("vg", "1", "British Virgin Islands"))
    countries.add(CountryCodePickerUtil("vi", "1", "US Virgin Islands"))
    countries.add(CountryCodePickerUtil("vn", "84", "Vietnam"))
    countries.add(CountryCodePickerUtil("vu", "678", "Vanuatu"))
    countries.add(CountryCodePickerUtil("wf", "681", "Wallis And Futuna"))
    countries.add(CountryCodePickerUtil("ws", "685", "Samoa"))
    countries.add(CountryCodePickerUtil("xk", "383", "Kosovo"))
    countries.add(CountryCodePickerUtil("ye", "967", "Yemen"))
    countries.add(CountryCodePickerUtil("yt", "262", "Mayotte"))
    countries.add(CountryCodePickerUtil("za", "27", "South Africa"))
    countries.add(CountryCodePickerUtil("zm", "260", "Zambia"))
    countries.add(CountryCodePickerUtil("zw", "263", "Zimbabwe"))
    return countries
}