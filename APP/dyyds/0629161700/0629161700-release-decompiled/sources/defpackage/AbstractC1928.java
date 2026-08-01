package defpackage;

/* JADX INFO: renamed from: ᲁᲁᛷᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1928 extends defpackage.AbstractC1379 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final android.view.WindowInsets.Builder f8367;

    public AbstractC1928() {
            r1 = this;
            r1.<init>()
            android.view.WindowInsets$Builder r0 = new android.view.WindowInsets$Builder
            r0.<init>()
            r1.f8367 = r0
            return
    }

    public AbstractC1928(defpackage.C2300 r2) {
            r1 = this;
            r1.<init>(r2)
            android.view.WindowInsets r2 = r2.m3731()
            if (r2 == 0) goto Lf
            android.view.WindowInsets$Builder r0 = new android.view.WindowInsets$Builder
            r0.<init>(r2)
            goto L14
        Lf:
            android.view.WindowInsets$Builder r0 = new android.view.WindowInsets$Builder
            r0.<init>()
        L14:
            r1.f8367 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public void m3353(defpackage.C1032 r1) {
            r0 = this;
            android.view.WindowInsets$Builder r0 = r0.f8367
            android.graphics.Insets r1 = r1.m1987()
            r0.setSystemWindowInsets(r1)
            return
    }

    @Override // defpackage.AbstractC1379
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public defpackage.C2300 mo2550() {
            r3 = this;
            r3.m2549()
            android.view.WindowInsets$Builder r0 = r3.f8367
            android.view.WindowInsets r0 = r0.build()
            r1 = 0
            ᲈᛸᛱᲀ r0 = defpackage.C2300.m3730(r1, r0)
            ᛲᲇᲀᲈ r2 = r0.f9727
            r2.mo1129(r1)
            r2.mo1128(r1)
            android.graphics.Rect[][] r1 = r3.f6019
            r2.mo1117(r1)
            android.graphics.Rect[][] r3 = r3.f6020
            r2.mo1124(r3)
            return r0
    }
}
