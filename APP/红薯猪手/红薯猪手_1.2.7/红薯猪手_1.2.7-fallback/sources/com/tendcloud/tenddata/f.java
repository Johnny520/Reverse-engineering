package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class f {
    public static final android.os.Parcelable.Creator<com.tendcloud.tenddata.f> e = null;
    public boolean a;
    public int b;
    public final java.lang.String c;
    public final int d;
    private final com.tendcloud.tenddata.m.a f;


    static {
            com.tendcloud.tenddata.f$1 r0 = new com.tendcloud.tenddata.f$1
            r0.<init>()
            com.tendcloud.tenddata.f.e = r0
            return
    }

    public f(int r5) {
            r4 = this;
            java.lang.String r0 = "/"
            r4.<init>()
            r4.d = r5
            java.lang.String r1 = a(r5)
            r4.c = r1
            com.tendcloud.tenddata.m$a r5 = com.tendcloud.tenddata.m.a.get(r5)
            r4.f = r5
            com.tendcloud.tenddata.m$d r1 = r4.d()
            if (r5 == 0) goto L69
            java.lang.String r2 = "cpuacct"
            com.tendcloud.tenddata.m$b r2 = r5.getGroup(r2)     // Catch: java.lang.Throwable -> L61
            java.lang.String r3 = "cpu"
            com.tendcloud.tenddata.m$b r5 = r5.getGroup(r3)     // Catch: java.lang.Throwable -> L61
            java.lang.String r5 = r5.group     // Catch: java.lang.Throwable -> L61
            if (r5 == 0) goto L5e
            java.lang.String r3 = "bg_non_interactive"
            boolean r5 = r5.contains(r3)     // Catch: java.lang.Throwable -> L61
            r3 = 1
            if (r5 != 0) goto L34
            r5 = r3
            goto L35
        L34:
            r5 = 0
        L35:
            r4.a = r5     // Catch: java.lang.Throwable -> L61
            java.lang.String r5 = r2.group     // Catch: java.lang.Throwable -> L61
            java.lang.String[] r5 = r5.split(r0)     // Catch: java.lang.Throwable -> L61
            int r5 = r5.length     // Catch: java.lang.Throwable -> L61
            if (r5 <= r3) goto L57
            java.lang.String r5 = r2.group     // Catch: java.lang.Throwable -> L61
            java.lang.String[] r5 = r5.split(r0)     // Catch: java.lang.Throwable -> L61
            r5 = r5[r3]     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = "uid_"
            java.lang.String r2 = ""
            java.lang.String r5 = r5.replace(r0, r2)     // Catch: java.lang.Throwable -> L61
            int r5 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.Throwable -> L61
        L54:
            r4.b = r5     // Catch: java.lang.Throwable -> L61
            goto L69
        L57:
            if (r1 == 0) goto L69
        L59:
            int r5 = r1.getUid()     // Catch: java.lang.Throwable -> L61
            goto L54
        L5e:
            if (r1 == 0) goto L69
            goto L59
        L61:
            if (r1 == 0) goto L69
            int r5 = r1.getUid()
            r4.b = r5
        L69:
            return
    }

    public f(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = r2.readString()
            r1.c = r0
            int r0 = r2.readInt()
            r1.d = r0
            java.lang.Class<com.tendcloud.tenddata.m$a> r0 = com.tendcloud.tenddata.m.a.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r2.readParcelable(r0)
            com.tendcloud.tenddata.m$a r0 = (com.tendcloud.tenddata.m.a) r0
            r1.f = r0
            byte r2 = r2.readByte()
            if (r2 == 0) goto L25
            r2 = 1
            goto L26
        L25:
            r2 = 0
        L26:
            r1.a = r2
            return
    }

    public static java.lang.String a(int r5) {
            r0 = 0
            java.lang.String r1 = "/proc/%d/cmdline"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L28
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L28
            r2[r3] = r4     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = java.lang.String.format(r1, r2)     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = com.tendcloud.tenddata.m.readFile(r1)     // Catch: java.lang.Throwable -> L28
            java.lang.String r0 = r1.trim()     // Catch: java.lang.Throwable -> L28
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L28
            com.tendcloud.tenddata.m$c r5 = com.tendcloud.tenddata.m.c.get(r5)     // Catch: java.lang.Throwable -> L28
            java.lang.String r5 = r5.getComm()     // Catch: java.lang.Throwable -> L28
            return r5
        L28:
            return r0
    }

    public java.lang.String a() {
            r2 = this;
            java.lang.String r0 = r2.c     // Catch: java.lang.Throwable -> Lc
            java.lang.String r1 = ":"
            java.lang.String[] r0 = r0.split(r1)     // Catch: java.lang.Throwable -> Lc
            r1 = 0
            r0 = r0[r1]     // Catch: java.lang.Throwable -> Lc
            return r0
        Lc:
            java.lang.String r0 = ""
            return r0
    }

    public java.lang.String b() {
            r4 = this;
            java.lang.String r0 = ":"
            java.lang.String r1 = r4.c     // Catch: java.lang.Throwable -> L24
            java.lang.String[] r1 = r1.split(r0)     // Catch: java.lang.Throwable -> L24
            int r1 = r1.length     // Catch: java.lang.Throwable -> L24
            r2 = 1
            if (r1 <= r2) goto L24
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L24
            r1.<init>()     // Catch: java.lang.Throwable -> L24
            r1.append(r0)     // Catch: java.lang.Throwable -> L24
            java.lang.String r3 = r4.c     // Catch: java.lang.Throwable -> L24
            java.lang.String[] r0 = r3.split(r0)     // Catch: java.lang.Throwable -> L24
            r0 = r0[r2]     // Catch: java.lang.Throwable -> L24
            r1.append(r0)     // Catch: java.lang.Throwable -> L24
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L24
            return r0
        L24:
            java.lang.String r0 = ""
            return r0
    }

    public com.tendcloud.tenddata.m.a c() {
            r1 = this;
            com.tendcloud.tenddata.m$a r0 = r1.f
            return r0
    }

    public final com.tendcloud.tenddata.m.d d() {
            r1 = this;
            int r0 = r1.d     // Catch: java.lang.Throwable -> L7
            com.tendcloud.tenddata.m$d r0 = com.tendcloud.tenddata.m.d.get(r0)     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    public com.tendcloud.tenddata.m.c e() {
            r1 = this;
            int r0 = r1.d     // Catch: java.lang.Throwable -> L7
            com.tendcloud.tenddata.m$c r0 = com.tendcloud.tenddata.m.c.get(r0)     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }
}
