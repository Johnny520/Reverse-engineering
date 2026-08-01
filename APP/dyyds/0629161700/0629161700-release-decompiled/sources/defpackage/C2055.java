package defpackage;

/* JADX INFO: renamed from: ᲇᛵᲁᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2055 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final android.util.SparseArray f8849;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public defpackage.C0948 f8850;

    public C2055(int r2) {
            r1 = this;
            r1.<init>()
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>(r2)
            r1.f8849 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m3456(defpackage.C0948 r4, int r5, int r6) {
            r3 = this;
            int r0 = r4.m1900(r5)
            android.util.SparseArray r3 = r3.f8849
            java.lang.Object r0 = r3.get(r0)
            ᲇᛵᲁᛲ r0 = (defpackage.C2055) r0
            r1 = 1
            if (r0 != 0) goto L1b
            ᲇᛵᲁᛲ r0 = new ᲇᛵᲁᛲ
            r0.<init>(r1)
            int r2 = r4.m1900(r5)
            r3.put(r2, r0)
        L1b:
            if (r6 <= r5) goto L22
            int r5 = r5 + r1
            r0.m3456(r4, r5, r6)
            return
        L22:
            r0.f8850 = r4
            return
    }
}
