package p000;

/* JADX INFO: loaded from: classes.dex */
public final class w8 {

    /* JADX INFO: renamed from: ۥۣ۠, reason: contains not printable characters */
    public static final long f1126 = 0;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public int f1127;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public long f1128;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f1129;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final android.net.Uri f1130;

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public final int f1131;

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public final java.util.List<p000.rb> f1132;

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public final int f1133;

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public final int f1134;

    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public final boolean f1135;

    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public final boolean f1136;

    /* JADX INFO: renamed from: ۥ۟ۧ, reason: contains not printable characters */
    public final boolean f1137;

    /* JADX INFO: renamed from: ۥ۟ۨ, reason: contains not printable characters */
    public final float f1138;

    /* JADX INFO: renamed from: ۥ۠, reason: contains not printable characters */
    public final float f1139;

    /* JADX INFO: renamed from: ۥ۠۟, reason: contains not printable characters */
    public final float f1140;

    /* JADX INFO: renamed from: ۥ۠۠, reason: contains not printable characters */
    public final boolean f1141;

    /* JADX INFO: renamed from: ۥ۠ۡ, reason: contains not printable characters */
    public final android.graphics.Bitmap.Config f1142;

    /* JADX INFO: renamed from: ۥ۠ۢ, reason: contains not printable characters */
    public final int f1143;

    public static final class a {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public android.net.Uri f1144;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public int f1145;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public android.graphics.Bitmap.Config f1146;

        /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
        public int f1147;

        public a(android.net.Uri r1, android.graphics.Bitmap.Config r2) {
                r0 = this;
                r0.<init>()
                r0.f1144 = r1
                r1 = 0
                r0.f1145 = r1
                r0.f1146 = r2
                return
        }
    }

    static {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r1 = 5
            long r0 = r0.toNanos(r1)
            p000.w8.f1126 = r0
            return
    }

    public w8(android.net.Uri r1, int r2, int r3, int r4, android.graphics.Bitmap.Config r5, int r6) {
            r0 = this;
            r0.<init>()
            r0.f1130 = r1
            r0.f1131 = r2
            r1 = 0
            r0.f1132 = r1
            r0.f1133 = r3
            r0.f1134 = r4
            r1 = 0
            r0.f1135 = r1
            r0.f1136 = r1
            r0.f1137 = r1
            r2 = 0
            r0.f1138 = r2
            r0.f1139 = r2
            r0.f1140 = r2
            r0.f1141 = r1
            r0.f1142 = r5
            r0.f1143 = r6
            return
    }

    public final java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Request{"
            r0.<init>(r1)
            int r1 = r6.f1131
            if (r1 <= 0) goto Lf
            r0.append(r1)
            goto L14
        Lf:
            android.net.Uri r1 = r6.f1130
            r0.append(r1)
        L14:
            java.util.List<۟.rb> r1 = r6.f1132
            r2 = 32
            if (r1 == 0) goto L3d
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L3d
            java.util.List<۟.rb> r1 = r6.f1132
            java.util.Iterator r1 = r1.iterator()
        L26:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L3d
            java.lang.Object r3 = r1.next()
            ۟.rb r3 = (p000.rb) r3
            r0.append(r2)
            java.lang.String r3 = r3.m381()
            r0.append(r3)
            goto L26
        L3d:
            r1 = 41
            int r3 = r6.f1133
            r4 = 44
            if (r3 <= 0) goto L5a
            java.lang.String r3 = " resize("
            r0.append(r3)
            int r3 = r6.f1133
            r0.append(r3)
            r0.append(r4)
            int r3 = r6.f1134
            r0.append(r3)
            r0.append(r1)
        L5a:
            boolean r3 = r6.f1135
            if (r3 == 0) goto L63
            java.lang.String r3 = " centerCrop"
            r0.append(r3)
        L63:
            boolean r3 = r6.f1136
            if (r3 == 0) goto L6c
            java.lang.String r3 = " centerInside"
            r0.append(r3)
        L6c:
            float r3 = r6.f1138
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L96
            java.lang.String r3 = " rotation("
            r0.append(r3)
            float r3 = r6.f1138
            r0.append(r3)
            boolean r3 = r6.f1141
            if (r3 == 0) goto L93
            java.lang.String r3 = " @ "
            r0.append(r3)
            float r3 = r6.f1139
            r0.append(r3)
            r0.append(r4)
            float r3 = r6.f1140
            r0.append(r3)
        L93:
            r0.append(r1)
        L96:
            android.graphics.Bitmap$Config r1 = r6.f1142
            if (r1 == 0) goto La2
            r0.append(r2)
            android.graphics.Bitmap$Config r1 = r6.f1142
            r0.append(r1)
        La2:
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final boolean m453() {
            r1 = this;
            int r0 = r1.f1133
            if (r0 != 0) goto Lb
            int r0 = r1.f1134
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.lang.String m454() {
            r5 = this;
            long r0 = java.lang.System.nanoTime()
            long r2 = r5.f1128
            long r0 = r0 - r2
            long r2 = p000.w8.f1126
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = 43
            if (r2 <= 0) goto L2d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = r5.m456()
            r2.append(r4)
            r2.append(r3)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = r3.toSeconds(r0)
            r2.append(r0)
            r0 = 115(0x73, float:1.61E-43)
            r2.append(r0)
            goto L4a
        L2d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = r5.m456()
            r2.append(r4)
            r2.append(r3)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = r3.toMillis(r0)
            r2.append(r0)
            java.lang.String r0 = "ms"
            r2.append(r0)
        L4a:
            java.lang.String r0 = r2.toString()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final boolean m455() {
            r2 = this;
            boolean r0 = r2.m453()
            if (r0 != 0) goto L10
            float r0 = r2.f1138
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto Le
            goto L10
        Le:
            r0 = 0
            goto L11
        L10:
            r0 = 1
        L11:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final java.lang.String m456() {
            r2 = this;
            java.lang.String r0 = "[R"
            java.lang.StringBuilder r0 = p000.c4.m108(r0)
            int r1 = r2.f1127
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
