package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۦۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C2116 {

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۦۢ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(34)
    public static class C2117 {
        public C2117() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4410
        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static java.util.Set<int[]> m10003() {
                java.util.Set r0 = Yue.C2116.C2118.m10004()
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۦۢ$ۥ۟, reason: contains not printable characters */
    public static class C2118 {
        public C2118() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4410
        @android.annotation.SuppressLint({"BanUncheckedReflection"})
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static java.util.Set<int[]> m10004() {
                java.lang.String r0 = "android.text.EmojiConsistency"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L31
                java.lang.String r1 = "getEmojiConsistencySet"
                r2 = 0
                java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Throwable -> L31
                java.lang.Object r0 = r0.invoke(r2, r2)     // Catch: java.lang.Throwable -> L31
                if (r0 != 0) goto L18
                java.util.Set r0 = java.util.Collections.emptySet()     // Catch: java.lang.Throwable -> L31
                return r0
            L18:
                java.util.Set r0 = (java.util.Set) r0     // Catch: java.lang.Throwable -> L31
                java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L31
            L1e:
                boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L31
                if (r2 == 0) goto L30
                java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L31
                boolean r2 = r2 instanceof int[]     // Catch: java.lang.Throwable -> L31
                if (r2 != 0) goto L1e
                java.util.Set r0 = java.util.Collections.emptySet()     // Catch: java.lang.Throwable -> L31
            L30:
                return r0
            L31:
                java.util.Set r0 = java.util.Collections.emptySet()
                return r0
        }
    }

    public C2116() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static java.util.Set<int[]> m10002() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            java.util.Set r0 = Yue.C2116.C2117.m10003()
            return r0
        Lb:
            java.util.Set r0 = Yue.C2116.C2118.m10004()
            return r0
    }
}
