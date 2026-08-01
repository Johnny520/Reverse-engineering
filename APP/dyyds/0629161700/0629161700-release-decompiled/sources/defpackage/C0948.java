package defpackage;

/* JADX INFO: renamed from: ᛵᛸᛸᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0948 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final java.lang.ThreadLocal f4245 = null;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public volatile int f4246;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final int f4247;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0302 f4248;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            defpackage.C0948.f4245 = r0
            return
    }

    public C0948(defpackage.C0302 r2, int r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f4246 = r0
            r1.f4248 = r2
            r1.f4247 = r3
            return
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = ", id:"
            r0.append(r1)
            ᲈᛱᛵᛱ r1 = r5.m1901()
            r2 = 4
            int r2 = r1.m2420(r2)
            r3 = 0
            if (r2 == 0) goto L29
            java.lang.Object r4 = r1.f5769
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            int r1 = r1.f5768
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
            ᲈᛱᛵᛱ r1 = r5.m1901()
            r2 = 16
            int r2 = r1.m2420(r2)
            if (r2 == 0) goto L57
            int r4 = r1.f5768
            int r2 = r2 + r4
            java.lang.Object r4 = r1.f5769
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            int r4 = r4.getInt(r2)
            int r4 = r4 + r2
            java.lang.Object r1 = r1.f5769
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            int r1 = r1.getInt(r4)
            goto L58
        L57:
            r1 = r3
        L58:
            if (r3 >= r1) goto L6d
            int r2 = r5.m1900(r3)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r0.append(r2)
            java.lang.String r2 = " "
            r0.append(r2)
            int r3 = r3 + 1
            goto L58
        L6d:
            java.lang.String r5 = r0.toString()
            return r5
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final int m1900(int r3) {
            r2 = this;
            ᲈᛱᛵᛱ r2 = r2.m1901()
            r0 = 16
            int r0 = r2.m2420(r0)
            if (r0 == 0) goto L22
            java.lang.Object r1 = r2.f5769
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            int r2 = r2.f5768
            int r0 = r0 + r2
            int r2 = r1.getInt(r0)
            int r2 = r2 + r0
            int r2 = r2 + 4
            int r3 = r3 * 4
            int r3 = r3 + r2
            int r2 = r1.getInt(r3)
            return r2
        L22:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.C2172 m1901() {
            r4 = this;
            java.lang.ThreadLocal r0 = defpackage.C0948.f4245
            java.lang.Object r1 = r0.get()
            ᲈᛱᛵᛱ r1 = (defpackage.C2172) r1
            if (r1 != 0) goto L12
            ᲈᛱᛵᛱ r1 = new ᲈᛱᛵᛱ
            r1.<init>()
            r0.set(r1)
        L12:
            ᛲᛶᛲᲁ r0 = r4.f4248
            java.lang.Object r0 = r0.f1616
            ᲀᛶᛴᲇ r0 = (defpackage.C1688) r0
            r2 = 6
            int r2 = r0.m2420(r2)
            if (r2 == 0) goto L5e
            int r3 = r0.f5768
            int r2 = r2 + r3
            java.lang.Object r3 = r0.f5769
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r3 = r3.getInt(r2)
            int r3 = r3 + r2
            int r3 = r3 + 4
            int r4 = r4.f4247
            int r4 = r4 * 4
            int r4 = r4 + r3
            java.lang.Object r2 = r0.f5769
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            int r2 = r2.getInt(r4)
            int r2 = r2 + r4
            java.lang.Object r4 = r0.f5769
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            r1.f5769 = r4
            if (r4 == 0) goto L57
            r1.f5768 = r2
            int r4 = r4.getInt(r2)
            int r2 = r2 - r4
            r1.f5767 = r2
            java.lang.Object r4 = r1.f5769
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            short r4 = r4.getShort(r2)
            r1.f5766 = r4
            return r1
        L57:
            r4 = 0
            r1.f5768 = r4
            r1.f5767 = r4
            r1.f5766 = r4
        L5e:
            return r1
    }
}
