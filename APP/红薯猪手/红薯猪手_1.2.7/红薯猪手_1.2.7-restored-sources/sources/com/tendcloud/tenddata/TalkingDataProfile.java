package com.tendcloud.tenddata;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class TalkingDataProfile extends JSONObject {

    /* JADX INFO: renamed from: a */
    private static final String f36a = "name";

    /* JADX INFO: renamed from: b */
    private static final String f37b = "type";

    /* JADX INFO: renamed from: c */
    private static final String f38c = "gender";

    /* JADX INFO: renamed from: d */
    private static final String f39d = "age";

    /* JADX INFO: renamed from: e */
    private static final String f40e = "property1";

    /* JADX INFO: renamed from: f */
    private static final String f41f = "property2";

    /* JADX INFO: renamed from: g */
    private static final String f42g = "property3";

    /* JADX INFO: renamed from: h */
    private static final String f43h = "property4";

    /* JADX INFO: renamed from: i */
    private static final String f44i = "property5";

    /* JADX INFO: renamed from: j */
    private static final String f45j = "property6";

    /* JADX INFO: renamed from: k */
    private static final String f46k = "property7";

    /* JADX INFO: renamed from: l */
    private static final String f47l = "property8";

    /* JADX INFO: renamed from: m */
    private static final String f48m = "property9";

    /* JADX INFO: renamed from: n */
    private static final String f49n = "property10";

    private TalkingDataProfile() {
    }

    public static TalkingDataProfile createProfile() {
        return new TalkingDataProfile();
    }

    public TalkingDataProfile setAge(int i) {
        try {
            put(f39d, i);
        } catch (Throwable th) {
            C0115h.m529a("set age error ", th);
        }
        return this;
    }

    public TalkingDataProfile setGender(TalkingDataGender talkingDataGender) {
        try {
            put(f38c, talkingDataGender.index());
        } catch (Throwable th) {
            C0115h.m529a("set gender error ", th);
        }
        return this;
    }

    public TalkingDataProfile setName(String str) {
        try {
            put(f36a, str);
        } catch (Throwable th) {
            C0115h.m529a("set name error ", th);
        }
        return this;
    }

    public TalkingDataProfile setProperty1(Object obj) {
        try {
            if ((obj instanceof String) || (obj instanceof Number)) {
                put(f40e, obj);
            }
        } catch (Throwable th) {
            C0115h.m529a("set property1 error ", th);
        }
        return this;
    }

    public TalkingDataProfile setProperty10(Object obj) {
        try {
            if ((obj instanceof String) || (obj instanceof Number)) {
                put(f49n, obj);
            }
        } catch (Throwable th) {
            C0115h.m529a("set property10 error ", th);
        }
        return this;
    }

    public TalkingDataProfile setProperty2(Object obj) {
        try {
            if ((obj instanceof String) || (obj instanceof Number)) {
                put(f41f, obj);
            }
        } catch (Throwable th) {
            C0115h.m529a("set property2 error ", th);
        }
        return this;
    }

    public TalkingDataProfile setProperty3(Object obj) {
        try {
            if ((obj instanceof String) || (obj instanceof Number)) {
                put(f42g, obj);
            }
        } catch (Throwable th) {
            C0115h.m529a("set property3 error ", th);
        }
        return this;
    }

    public TalkingDataProfile setProperty4(Object obj) {
        try {
            if ((obj instanceof String) || (obj instanceof Number)) {
                put(f43h, obj);
            }
        } catch (Throwable th) {
            C0115h.m529a("set property4 error ", th);
        }
        return this;
    }

    public TalkingDataProfile setProperty5(Object obj) {
        try {
            if ((obj instanceof String) || (obj instanceof Number)) {
                put(f44i, obj);
            }
        } catch (Throwable th) {
            C0115h.m529a("set property5 error ", th);
        }
        return this;
    }

    public TalkingDataProfile setProperty6(Object obj) {
        try {
            if ((obj instanceof String) || (obj instanceof Number)) {
                put(f45j, obj);
            }
        } catch (Throwable th) {
            C0115h.m529a("set property6 error ", th);
        }
        return this;
    }

    public TalkingDataProfile setProperty7(Object obj) {
        try {
            if ((obj instanceof String) || (obj instanceof Number)) {
                put(f46k, obj);
            }
        } catch (Throwable th) {
            C0115h.m529a("set property7 error ", th);
        }
        return this;
    }

    public TalkingDataProfile setProperty8(Object obj) {
        try {
            if ((obj instanceof String) || (obj instanceof Number)) {
                put(f47l, obj);
            }
        } catch (Throwable th) {
            C0115h.m529a("set property8 error ", th);
        }
        return this;
    }

    public TalkingDataProfile setProperty9(Object obj) {
        try {
            if ((obj instanceof String) || (obj instanceof Number)) {
                put(f48m, obj);
            }
        } catch (Throwable th) {
            C0115h.m529a("set property9 error ", th);
        }
        return this;
    }

    public TalkingDataProfile setType(TalkingDataProfileType talkingDataProfileType) {
        try {
            put(f37b, talkingDataProfileType.index());
        } catch (Throwable th) {
            C0115h.m529a("set type error ", th);
        }
        return this;
    }
}
