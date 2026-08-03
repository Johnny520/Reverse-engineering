package l3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final java.lang.ThreadLocal f7825d = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hb.c f7827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f7828c;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            l3.u.f7825d = r0
            return
    }

    public u(hb.c r2, int r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f7828c = r0
            r1.f7827b = r2
            r1.f7826a = r3
            return
    }

    public final int a(int r4) {
            r3 = this;
            m3.a r0 = r3.b()
            r1 = 16
            int r1 = r0.a(r1)
            if (r1 == 0) goto L22
            java.lang.Object r2 = r0.f8716j
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            int r0 = r0.f8713g
            int r1 = r1 + r0
            int r0 = r2.getInt(r1)
            int r0 = r0 + r1
            int r0 = r0 + 4
            int r4 = r4 * 4
            int r4 = r4 + r0
            int r4 = r2.getInt(r4)
            return r4
        L22:
            r4 = 0
            return r4
    }

    public final m3.a b() {
            r4 = this;
            java.lang.ThreadLocal r0 = l3.u.f7825d
            java.lang.Object r1 = r0.get()
            m3.a r1 = (m3.a) r1
            if (r1 != 0) goto L12
            m3.a r1 = new m3.a
            r1.<init>()
            r0.set(r1)
        L12:
            hb.c r0 = r4.f7827b
            java.lang.Object r0 = r0.f5338g
            m3.b r0 = (m3.b) r0
            r2 = 6
            int r2 = r0.a(r2)
            if (r2 == 0) goto L5e
            int r3 = r0.f8713g
            int r2 = r2 + r3
            java.lang.Object r3 = r0.f8716j
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r3 = r3.getInt(r2)
            int r3 = r3 + r2
            int r3 = r3 + 4
            int r2 = r4.f7826a
            int r2 = r2 * 4
            int r2 = r2 + r3
            java.lang.Object r3 = r0.f8716j
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r3 = r3.getInt(r2)
            int r3 = r3 + r2
            java.lang.Object r0 = r0.f8716j
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r1.f8716j = r0
            if (r0 == 0) goto L57
            r1.f8713g = r3
            int r0 = r0.getInt(r3)
            int r3 = r3 - r0
            r1.f8714h = r3
            java.lang.Object r0 = r1.f8716j
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            short r0 = r0.getShort(r3)
            r1.f8715i = r0
            return r1
        L57:
            r0 = 0
            r1.f8713g = r0
            r1.f8714h = r0
            r1.f8715i = r0
        L5e:
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = ", id:"
            r0.append(r1)
            m3.a r1 = r5.b()
            r2 = 4
            int r2 = r1.a(r2)
            r3 = 0
            if (r2 == 0) goto L29
            java.lang.Object r4 = r1.f8716j
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            int r1 = r1.f8713g
            int r2 = r2 + r1
            int r1 = r4.getInt(r2)
            goto L2a
        L29:
            r1 = r3
        L2a:
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = ", codepoints:"
            r0.append(r1)
            m3.a r1 = r5.b()
            r2 = 16
            int r2 = r1.a(r2)
            if (r2 == 0) goto L57
            int r4 = r1.f8713g
            int r2 = r2 + r4
            java.lang.Object r4 = r1.f8716j
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            int r4 = r4.getInt(r2)
            int r4 = r4 + r2
            java.lang.Object r1 = r1.f8716j
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            int r1 = r1.getInt(r4)
            goto L58
        L57:
            r1 = r3
        L58:
            if (r3 >= r1) goto L6d
            int r2 = r5.a(r3)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r0.append(r2)
            java.lang.String r2 = " "
            r0.append(r2)
            int r3 = r3 + 1
            goto L58
        L6d:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
