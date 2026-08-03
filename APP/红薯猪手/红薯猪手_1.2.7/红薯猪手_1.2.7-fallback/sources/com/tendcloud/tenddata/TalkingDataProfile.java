package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class TalkingDataProfile extends org.json.JSONObject {
    private static final java.lang.String a = "name";
    private static final java.lang.String b = "type";
    private static final java.lang.String c = "gender";
    private static final java.lang.String d = "age";
    private static final java.lang.String e = "property1";
    private static final java.lang.String f = "property2";
    private static final java.lang.String g = "property3";
    private static final java.lang.String h = "property4";
    private static final java.lang.String i = "property5";
    private static final java.lang.String j = "property6";
    private static final java.lang.String k = "property7";
    private static final java.lang.String l = "property8";
    private static final java.lang.String m = "property9";
    private static final java.lang.String n = "property10";

    private TalkingDataProfile() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.tendcloud.tenddata.TalkingDataProfile createProfile() {
            com.tendcloud.tenddata.TalkingDataProfile r0 = new com.tendcloud.tenddata.TalkingDataProfile
            r0.<init>()
            return r0
    }

    public com.tendcloud.tenddata.TalkingDataProfile setAge(int r2) {
            r1 = this;
            java.lang.String r0 = "age"
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> L6
            goto Lc
        L6:
            r2 = move-exception
            java.lang.String r0 = "set age error "
            com.tendcloud.tenddata.h.a(r0, r2)
        Lc:
            return r1
    }

    public com.tendcloud.tenddata.TalkingDataProfile setGender(com.tendcloud.tenddata.TalkingDataGender r2) {
            r1 = this;
            java.lang.String r0 = "gender"
            int r2 = r2.index()     // Catch: java.lang.Throwable -> La
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> La
            goto L10
        La:
            r2 = move-exception
            java.lang.String r0 = "set gender error "
            com.tendcloud.tenddata.h.a(r0, r2)
        L10:
            return r1
    }

    public com.tendcloud.tenddata.TalkingDataProfile setName(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "name"
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> L6
            goto Lc
        L6:
            r2 = move-exception
            java.lang.String r0 = "set name error "
            com.tendcloud.tenddata.h.a(r0, r2)
        Lc:
            return r1
    }

    public com.tendcloud.tenddata.TalkingDataProfile setProperty1(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.String     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L8
            boolean r0 = r2 instanceof java.lang.Number     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L14
        L8:
            java.lang.String r0 = "property1"
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> Le
            goto L14
        Le:
            r2 = move-exception
            java.lang.String r0 = "set property1 error "
            com.tendcloud.tenddata.h.a(r0, r2)
        L14:
            return r1
    }

    public com.tendcloud.tenddata.TalkingDataProfile setProperty10(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.String     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L8
            boolean r0 = r2 instanceof java.lang.Number     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L14
        L8:
            java.lang.String r0 = "property10"
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> Le
            goto L14
        Le:
            r2 = move-exception
            java.lang.String r0 = "set property10 error "
            com.tendcloud.tenddata.h.a(r0, r2)
        L14:
            return r1
    }

    public com.tendcloud.tenddata.TalkingDataProfile setProperty2(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.String     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L8
            boolean r0 = r2 instanceof java.lang.Number     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L14
        L8:
            java.lang.String r0 = "property2"
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> Le
            goto L14
        Le:
            r2 = move-exception
            java.lang.String r0 = "set property2 error "
            com.tendcloud.tenddata.h.a(r0, r2)
        L14:
            return r1
    }

    public com.tendcloud.tenddata.TalkingDataProfile setProperty3(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.String     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L8
            boolean r0 = r2 instanceof java.lang.Number     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L14
        L8:
            java.lang.String r0 = "property3"
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> Le
            goto L14
        Le:
            r2 = move-exception
            java.lang.String r0 = "set property3 error "
            com.tendcloud.tenddata.h.a(r0, r2)
        L14:
            return r1
    }

    public com.tendcloud.tenddata.TalkingDataProfile setProperty4(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.String     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L8
            boolean r0 = r2 instanceof java.lang.Number     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L14
        L8:
            java.lang.String r0 = "property4"
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> Le
            goto L14
        Le:
            r2 = move-exception
            java.lang.String r0 = "set property4 error "
            com.tendcloud.tenddata.h.a(r0, r2)
        L14:
            return r1
    }

    public com.tendcloud.tenddata.TalkingDataProfile setProperty5(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.String     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L8
            boolean r0 = r2 instanceof java.lang.Number     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L14
        L8:
            java.lang.String r0 = "property5"
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> Le
            goto L14
        Le:
            r2 = move-exception
            java.lang.String r0 = "set property5 error "
            com.tendcloud.tenddata.h.a(r0, r2)
        L14:
            return r1
    }

    public com.tendcloud.tenddata.TalkingDataProfile setProperty6(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.String     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L8
            boolean r0 = r2 instanceof java.lang.Number     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L14
        L8:
            java.lang.String r0 = "property6"
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> Le
            goto L14
        Le:
            r2 = move-exception
            java.lang.String r0 = "set property6 error "
            com.tendcloud.tenddata.h.a(r0, r2)
        L14:
            return r1
    }

    public com.tendcloud.tenddata.TalkingDataProfile setProperty7(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.String     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L8
            boolean r0 = r2 instanceof java.lang.Number     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L14
        L8:
            java.lang.String r0 = "property7"
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> Le
            goto L14
        Le:
            r2 = move-exception
            java.lang.String r0 = "set property7 error "
            com.tendcloud.tenddata.h.a(r0, r2)
        L14:
            return r1
    }

    public com.tendcloud.tenddata.TalkingDataProfile setProperty8(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.String     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L8
            boolean r0 = r2 instanceof java.lang.Number     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L14
        L8:
            java.lang.String r0 = "property8"
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> Le
            goto L14
        Le:
            r2 = move-exception
            java.lang.String r0 = "set property8 error "
            com.tendcloud.tenddata.h.a(r0, r2)
        L14:
            return r1
    }

    public com.tendcloud.tenddata.TalkingDataProfile setProperty9(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.String     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L8
            boolean r0 = r2 instanceof java.lang.Number     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L14
        L8:
            java.lang.String r0 = "property9"
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> Le
            goto L14
        Le:
            r2 = move-exception
            java.lang.String r0 = "set property9 error "
            com.tendcloud.tenddata.h.a(r0, r2)
        L14:
            return r1
    }

    public com.tendcloud.tenddata.TalkingDataProfile setType(com.tendcloud.tenddata.TalkingDataProfileType r2) {
            r1 = this;
            java.lang.String r0 = "type"
            int r2 = r2.index()     // Catch: java.lang.Throwable -> La
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> La
            goto L10
        La:
            r2 = move-exception
            java.lang.String r0 = "set type error "
            com.tendcloud.tenddata.h.a(r0, r2)
        L10:
            return r1
    }
}
