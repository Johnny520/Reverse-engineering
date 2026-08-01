package defpackage;

/* JADX INFO: renamed from: ᛲᛶᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0307 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public int f1629;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public defpackage.C2055 f1630;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public defpackage.C2055 f1631;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public int f1632;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.C2055 f1633;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public int f1634;

    public C0307(defpackage.C2055 r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f1632 = r0
            r1.f1633 = r2
            r1.f1631 = r2
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final boolean m983() {
            r4 = this;
            ᲇᛵᲁᛲ r0 = r4.f1631
            ᛵᛸᛸᛳ r0 = r0.f8850
            ᲈᛱᛵᛱ r0 = r0.m1901()
            r1 = 6
            int r1 = r0.m2420(r1)
            r2 = 1
            if (r1 == 0) goto L1e
            java.lang.Object r3 = r0.f5769
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r0 = r0.f5768
            int r1 = r1 + r0
            byte r0 = r3.get(r1)
            if (r0 == 0) goto L1e
            return r2
        L1e:
            int r4 = r4.f1629
            r0 = 65039(0xfe0f, float:9.1139E-41)
            if (r4 != r0) goto L26
            return r2
        L26:
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final int m984(int r5) {
            r4 = this;
            ᲇᛵᲁᛲ r0 = r4.f1631
            android.util.SparseArray r0 = r0.f8849
            java.lang.Object r0 = r0.get(r5)
            ᲇᛵᲁᛲ r0 = (defpackage.C2055) r0
            int r1 = r4.f1632
            r2 = 1
            r3 = 2
            if (r1 == r3) goto L1e
            if (r0 != 0) goto L16
            r4.m985()
            goto L5d
        L16:
            r4.f1632 = r3
            r4.f1631 = r0
            r4.f1634 = r2
        L1c:
            r2 = r3
            goto L5d
        L1e:
            if (r0 == 0) goto L28
            r4.f1631 = r0
            int r0 = r4.f1634
            int r0 = r0 + r2
            r4.f1634 = r0
            goto L1c
        L28:
            r0 = 65038(0xfe0e, float:9.1138E-41)
            if (r5 != r0) goto L31
            r4.m985()
            goto L5d
        L31:
            r0 = 65039(0xfe0f, float:9.1139E-41)
            if (r5 != r0) goto L37
            goto L1c
        L37:
            ᲇᛵᲁᛲ r0 = r4.f1631
            ᛵᛸᛸᛳ r1 = r0.f8850
            if (r1 == 0) goto L5a
            int r1 = r4.f1634
            r3 = 3
            if (r1 != r2) goto L54
            boolean r0 = r4.m983()
            if (r0 == 0) goto L50
            ᲇᛵᲁᛲ r0 = r4.f1631
            r4.f1630 = r0
            r4.m985()
            goto L1c
        L50:
            r4.m985()
            goto L5d
        L54:
            r4.f1630 = r0
            r4.m985()
            goto L1c
        L5a:
            r4.m985()
        L5d:
            r4.f1629 = r5
            return r2
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final void m985() {
            r1 = this;
            r0 = 1
            r1.f1632 = r0
            ᲇᛵᲁᛲ r0 = r1.f1633
            r1.f1631 = r0
            r0 = 0
            r1.f1634 = r0
            return
    }
}
