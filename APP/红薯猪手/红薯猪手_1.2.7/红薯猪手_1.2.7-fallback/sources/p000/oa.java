package p000;

/* JADX INFO: loaded from: classes.dex */
public final class oa {
    public oa() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static java.lang.String m332(byte[] r9, byte[] r10) {
            int r0 = p000.pa.f898
            r1 = 1
            r2 = 2
            r3 = 0
            if (r0 == 0) goto L8
            goto L2e
        L8:
            p000.pa.f898 = r1
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            int r4 = r0.length
            r5 = r3
        L14:
            if (r5 >= r4) goto L2e
            r6 = r0[r5]
            java.lang.String r6 = r6.getClassName()
            java.lang.Class<۟.oa> r7 = p000.oa.class
            java.lang.String r7 = r7.getName()
            boolean r6 = r6.startsWith(r7)
            if (r6 == 0) goto L2b
            p000.pa.f898 = r2
            goto L2e
        L2b:
            int r5 = r5 + 1
            goto L14
        L2e:
            int r0 = p000.pa.f898
            if (r0 == r2) goto L3a
            java.lang.String r10 = new java.lang.String
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            r10.<init>(r9, r0)
            goto L61
        L3a:
            java.lang.String r0 = new java.lang.String
            int r2 = android.os.Build.VERSION.SDK_INT
            int r2 = r2 + 99
            r4 = 120(0x78, float:1.68E-43)
            if (r2 >= r4) goto L47
            byte[] r9 = new byte[r3]
            goto L5b
        L47:
            int r4 = r9.length
            int r5 = r10.length
            r6 = r3
        L4a:
            if (r6 >= r4) goto L5b
            if (r2 < r5) goto L4f
            r2 = r3
        L4f:
            r7 = r9[r6]
            r8 = r10[r2]
            r7 = r7 ^ r8
            byte r7 = (byte) r7
            r9[r6] = r7
            int r6 = r6 + 1
            int r2 = r2 + r1
            goto L4a
        L5b:
            java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
            r0.<init>(r9, r10)
            r10 = r0
        L61:
            return r10
    }
}
