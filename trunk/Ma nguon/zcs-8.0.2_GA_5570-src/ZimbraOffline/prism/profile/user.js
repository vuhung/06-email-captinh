user_pref("spellchecker.dictionary", "@install.locale@");

user_pref("browser.cache.disk.capacity", "12288");
user_pref("browser.cache.memory.capacity", "3072");
user_pref("browser.sessionhistory.max_total_viewers", "0");
user_pref("config.trim_on_minimize", "true");
user_pref("geo.enabled", "false");
user_pref("keyword.enabled", "false");
user_pref("network.http.keep-alive-timeout", "600");
user_pref("network.http.max-connections-per-server", "6");
user_pref("network.http.max-persistent-connections-per-server", "4");
user_pref("network.http.request.max-start-delay", "1");
user_pref("network.http.pipelining", "true");
user_pref("network.http.pipelining.firstrequest", "true");
user_pref("network.http.pipelining.maxrequests", "3");
user_pref("network.prefetch-next", "false");

user_pref("capability.principal.codebase.p1.granted", "UniversalXPConnect UniversalBrowserRead UniversalBrowserWrite UniversalPreferencesRead UniversalPreferencesWrite UniversalFileRead");
user_pref("capability.principal.codebase.p1.subjectName", "");
user_pref("signed.applets.codebase_principal_support", true);

// let prism forget the last printer used so that the system default printer can get selected
user_pref("print.print_printer", "");

// set it to true to enable about:config access. use shift-f7 to toggle it.
user_pref("prism.shortcut.aboutConfig.enabled", true);

// disable quick-find
user_pref("accessibility.typeaheadfind", false);
user_pref("accessibility.typeaheadfind.flashBar", 0); 
