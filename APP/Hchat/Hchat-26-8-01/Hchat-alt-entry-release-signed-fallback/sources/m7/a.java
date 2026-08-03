package m7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends m7.f {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f8733n;

    public final java.lang.Integer V(int r3) {
            r2 = this;
            java.lang.String r0 = "manifest"
            m7.j r0 = r2.O(r0)
            if (r0 != 0) goto L9
            goto L21
        L9:
            m7.c r3 = r0.X(r3)
            if (r3 == 0) goto L21
            v7.k0 r0 = r3.T()
            v7.k0 r1 = v7.k0.f14171n
            if (r0 == r1) goto L18
            goto L21
        L18:
            int r3 = r3.O()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            return r3
        L21:
            r3 = 0
            return r3
    }

    public final java.lang.String W(int r3) {
            r2 = this;
            java.lang.String r0 = "manifest"
            m7.j r0 = r2.O(r0)
            if (r0 != 0) goto L9
            goto L1d
        L9:
            m7.c r3 = r0.X(r3)
            if (r3 == 0) goto L1d
            v7.k0 r0 = r3.T()
            v7.k0 r1 = v7.k0.f14178u
            if (r0 == r1) goto L18
            goto L1d
        L18:
            java.lang.String r3 = r3.S()
            return r3
        L1d:
            r3 = 0
            return r3
    }

    public final java.lang.String X() {
            r4 = this;
            java.lang.String r0 = "manifest"
            m7.j r0 = r4.O(r0)
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            java.lang.String r2 = "package"
            m7.c r0 = r0.W(r2)
            if (r0 == 0) goto L20
            v7.k0 r2 = r0.T()
            v7.k0 r3 = v7.k0.f14178u
            if (r2 == r3) goto L1b
            goto L20
        L1b:
            java.lang.String r0 = r0.S()
            return r0
        L20:
            return r1
    }

    public final int Y() {
            r4 = this;
            int r0 = r4.f8733n
            if (r0 != 0) goto L34
            java.lang.String r0 = "manifest"
            m7.j r0 = r4.O(r0)
            if (r0 != 0) goto Le
            r0 = 0
            goto L14
        Le:
            java.lang.String r1 = "application"
            m7.j r0 = r0.O(r1)
        L14:
            r1 = 0
            if (r0 != 0) goto L18
            goto L2e
        L18:
            r2 = 16842754(0x1010002, float:2.3693564E-38)
            m7.c r0 = r0.X(r2)
            if (r0 == 0) goto L2e
            v7.k0 r2 = r0.T()
            v7.k0 r3 = v7.k0.f14166i
            if (r2 == r3) goto L2a
            goto L2e
        L2a:
            int r1 = r0.O()
        L2e:
            int r0 = r1 >> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            r4.f8733n = r0
        L34:
            int r0 = r4.f8733n
            return r0
    }

    public final java.lang.Boolean Z() {
            r3 = this;
            java.lang.String r0 = "manifest"
            m7.j r0 = r3.O(r0)
            if (r0 != 0) goto L9
            goto L1a
        L9:
            java.lang.String r1 = "coreApp"
            m7.c r0 = r0.W(r1)
            if (r0 != 0) goto L12
            goto L1a
        L12:
            v7.k0 r1 = r0.T()
            v7.k0 r2 = v7.k0.f14173p
            if (r1 == r2) goto L1c
        L1a:
            r0 = 0
            return r0
        L1c:
            int r0 = r0.O()
            if (r0 == 0) goto L24
            r0 = 1
            goto L25
        L24:
            r0 = 0
        L25:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }

    @Override // m7.i, m7.q
    public final java.lang.String toString() {
            r4 = this;
            r4.S()
            m7.r r0 = r4.f8750l
            if (r0 != 0) goto Le
            m7.r r0 = new m7.r
            r0.<init>(r4)
            r4.f8750l = r0
        Le:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<m7.a> r1 = m7.a.class
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = "{package="
            r0.append(r1)
            java.lang.String r1 = r4.X()
            r0.append(r1)
            java.lang.String r1 = ", versionCode="
            r0.append(r1)
            r1 = 16843291(0x101021b, float:2.369507E-38)
            java.lang.Integer r1 = r4.V(r1)
            r0.append(r1)
            java.lang.String r1 = ", versionName="
            r0.append(r1)
            r1 = 16843292(0x101021c, float:2.3695071E-38)
            java.lang.String r1 = r4.W(r1)
            r0.append(r1)
            java.lang.String r1 = ", compileSdkVersion="
            r0.append(r1)
            r1 = 16844146(0x1010572, float:2.3697465E-38)
            java.lang.Integer r1 = r4.V(r1)
            r0.append(r1)
            java.lang.String r1 = ", compileSdkVersionCodename="
            r0.append(r1)
            r1 = 16844147(0x1010573, float:2.3697468E-38)
            java.lang.String r1 = r4.W(r1)
            r0.append(r1)
            java.lang.String r1 = "manifest"
            java.lang.String r2 = "uses-permission"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            java.util.Iterator r1 = r4.P(r1)
            com.alibaba.fastjson2.writer.b r2 = new com.alibaba.fastjson2.writer.b
            r3 = 29
            r2.<init>(r3)
            boolean r3 = r1.hasNext()
            if (r3 != 0) goto L80
            z7.h r1 = z7.h.f22606g
            goto L86
        L80:
            z7.g r3 = new z7.g
            r3.<init>(r1, r2)
            r1 = r3
        L86:
            java.util.List r1 = be.h.b0(r1)
            java.lang.String r2 = ", PERMISSIONS["
            r0.append(r2)
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L94:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lac
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            if (r2 == 0) goto La7
            java.lang.String r2 = ", "
            r0.append(r2)
        La7:
            r0.append(r3)
            r2 = 1
            goto L94
        Lac:
            java.lang.String r1 = "]}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
