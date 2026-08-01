package defpackage;

/* JADX INFO: renamed from: ᲇᛱᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1990 extends defpackage.AbstractC2148 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public defpackage.C1032 f8623;

    public AbstractC1990(defpackage.C2300 r1, android.view.WindowInsets r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.f8623 = r1
            return
    }

    @Override // defpackage.C0377
    /* JADX INFO: renamed from: ᛲᛴᲇᛳ */
    public final defpackage.C1032 mo1116() {
            r4 = this;
            ᛶᛳᛴᛲ r0 = r4.f8623
            if (r0 != 0) goto L1c
            android.view.WindowInsets r0 = r4.f9129
            int r1 = r0.getStableInsetLeft()
            int r2 = r0.getStableInsetTop()
            int r3 = r0.getStableInsetRight()
            int r0 = r0.getStableInsetBottom()
            ᛶᛳᛴᛲ r0 = defpackage.C1032.m1985(r1, r2, r3, r0)
            r4.f8623 = r0
        L1c:
            return r0
    }

    @Override // defpackage.C0377
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public defpackage.C2300 mo1125() {
            r1 = this;
            android.view.WindowInsets r1 = r1.f9129
            android.view.WindowInsets r1 = r1.consumeSystemWindowInsets()
            r0 = 0
            ᲈᛸᛱᲀ r1 = defpackage.C2300.m3730(r0, r1)
            return r1
    }

    @Override // defpackage.C0377
    /* JADX INFO: renamed from: ᲀᛳᲀᛵ */
    public boolean mo1127() {
            r0 = this;
            android.view.WindowInsets r0 = r0.f9129
            boolean r0 = r0.isConsumed()
            return r0
    }

    @Override // defpackage.C0377
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public defpackage.C2300 mo1130() {
            r1 = this;
            android.view.WindowInsets r1 = r1.f9129
            android.view.WindowInsets r1 = r1.consumeStableInsets()
            r0 = 0
            ᲈᛸᛱᲀ r1 = defpackage.C2300.m3730(r0, r1)
            return r1
    }
}
