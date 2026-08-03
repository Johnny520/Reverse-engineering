package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۤۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C2871 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f9268;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f9269;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f9270;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f9271;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f9272;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f9273;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f9274;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f9275;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f9276;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f9277;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f9278;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f9279;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f9280;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f9281;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f9282;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f9283;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f9284;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f9285;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f9286;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f9287;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f9288;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f9289;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f9290;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f9291;

    static {
            r0 = 852(0x354, float:1.194E-42)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C2871() {
            r0 = this;
            r0.<init>()
            return
    }

    private static native /* synthetic */ java.lang.String yue_xin_awa(int r0);

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static void m12334(java.lang.String r7, Yue.C4338 r8, java.lang.String r9) {
            com.google.gson.JsonObject r0 = Yue.C2946.m12540(r7)
            de.robv.android.xposed.XposedBridge.log(r7)
            r7 = 15
            java.lang.String r7 = yue_xin_awa(r7)
            com.google.gson.JsonArray r7 = r0.getAsJsonArray(r7)
            java.util.Iterator r7 = r7.iterator()
        L15:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Lb0
            java.lang.Object r0 = r7.next()
            com.google.gson.JsonElement r0 = (com.google.gson.JsonElement) r0
            com.google.gson.JsonObject r0 = r0.getAsJsonObject()
            r1 = 16
            java.lang.String r2 = yue_xin_awa(r1)
            com.google.gson.JsonElement r2 = r0.get(r2)
            java.lang.String r2 = r2.getAsString()
            boolean r3 = r2.equals(r9)
            r4 = 18
            r5 = 17
            if (r3 == 0) goto L5f
            java.lang.String r7 = yue_xin_awa(r5)
            com.google.gson.JsonElement r7 = r0.get(r7)
            java.lang.String r7 = r7.getAsString()
            java.lang.String r9 = yue_xin_awa(r4)
            com.google.gson.JsonElement r9 = r0.get(r9)
            int r9 = r9.getAsInt()
            r8.m17058(r2)
            r8.m17057(r7)
            r8.m17064(r9)
            goto Lb0
        L5f:
            r2 = 19
            java.lang.String r2 = yue_xin_awa(r2)     // Catch: java.lang.Throwable -> L15
            com.google.gson.JsonArray r0 = r0.getAsJsonArray(r2)     // Catch: java.lang.Throwable -> L15
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L15
        L6d:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L15
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L15
            com.google.gson.JsonElement r2 = (com.google.gson.JsonElement) r2     // Catch: java.lang.Throwable -> L15
            com.google.gson.JsonObject r2 = r2.getAsJsonObject()     // Catch: java.lang.Throwable -> L15
            java.lang.String r3 = yue_xin_awa(r1)     // Catch: java.lang.Throwable -> L15
            com.google.gson.JsonElement r3 = r2.get(r3)     // Catch: java.lang.Throwable -> L15
            java.lang.String r3 = r3.getAsString()     // Catch: java.lang.Throwable -> L15
            boolean r6 = r3.equals(r9)     // Catch: java.lang.Throwable -> L15
            if (r6 == 0) goto L6d
            java.lang.String r0 = yue_xin_awa(r5)     // Catch: java.lang.Throwable -> L15
            com.google.gson.JsonElement r0 = r2.get(r0)     // Catch: java.lang.Throwable -> L15
            java.lang.String r0 = r0.getAsString()     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = yue_xin_awa(r4)     // Catch: java.lang.Throwable -> L15
            com.google.gson.JsonElement r1 = r2.get(r1)     // Catch: java.lang.Throwable -> L15
            int r1 = r1.getAsInt()     // Catch: java.lang.Throwable -> L15
            r8.m17058(r3)     // Catch: java.lang.Throwable -> L15
            r8.m17057(r0)     // Catch: java.lang.Throwable -> L15
            r8.m17064(r1)     // Catch: java.lang.Throwable -> L15
        Lb0:
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static java.lang.String m12335() {
            android.content.Context r0 = Yue.C0421.m1606()     // Catch: java.lang.Throwable -> L3e
            java.lang.ClassLoader r1 = Yue.C0421.m1607()     // Catch: java.lang.Throwable -> L3e
            r2 = 20
            java.lang.String r2 = yue_xin_awa(r2)     // Catch: java.lang.Throwable -> L3e
            java.lang.Class r1 = r1.loadClass(r2)     // Catch: java.lang.Throwable -> L3e
            r2 = 21
            java.lang.String r2 = yue_xin_awa(r2)     // Catch: java.lang.Throwable -> L3e
            r3 = 22
            java.lang.String r3 = yue_xin_awa(r3)     // Catch: java.lang.Throwable -> L3e
            r4 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L3e
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r3, r4}     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r0 = de.robv.android.xposed.XposedHelpers.callStaticMethod(r1, r2, r0)     // Catch: java.lang.Throwable -> L3e
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0     // Catch: java.lang.Throwable -> L3e
            r1 = 23
            java.lang.String r1 = yue_xin_awa(r1)     // Catch: java.lang.Throwable -> L3e
            r2 = 14
            java.lang.String r2 = yue_xin_awa(r2)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = r0.getString(r1, r2)     // Catch: java.lang.Throwable -> L3e
            return r0
        L3e:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native Yue.C4338 m12336(java.lang.String r0, java.lang.String r1);
}
