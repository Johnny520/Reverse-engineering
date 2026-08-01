package defpackage;

/* JADX INFO: renamed from: ᛱᛶᛵᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0114 extends defpackage.AbstractC1990 {
    public AbstractC0114(defpackage.C2300 r1, android.view.WindowInsets r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.C0377
    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.AbstractC0114
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ᛱᛶᛵᲁ r5 = (defpackage.AbstractC0114) r5
            android.view.WindowInsets r1 = r4.f9129
            android.view.WindowInsets r3 = r5.f9129
            boolean r1 = java.util.Objects.equals(r1, r3)
            if (r1 == 0) goto L28
            r1 = 0
            boolean r1 = java.util.Objects.equals(r1, r1)
            if (r1 == 0) goto L28
            int r4 = r4.f9127
            int r5 = r5.f9127
            boolean r4 = defpackage.AbstractC2148.m3561(r4, r5)
            if (r4 == 0) goto L28
            return r0
        L28:
            return r2
    }

    @Override // defpackage.C0377
    public int hashCode() {
            r0 = this;
            android.view.WindowInsets r0 = r0.f9129
            int r0 = r0.hashCode()
            return r0
    }

    @Override // defpackage.C0377
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public defpackage.C2300 mo628() {
            r1 = this;
            android.view.WindowInsets r1 = r1.f9129
            android.view.WindowInsets r1 = r1.consumeDisplayCutout()
            r0 = 0
            ᲈᛸᛱᲀ r1 = defpackage.C2300.m3730(r0, r1)
            return r1
    }

    @Override // defpackage.C0377
    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public defpackage.C0570 mo629() {
            r1 = this;
            android.view.WindowInsets r1 = r1.f9129
            android.view.DisplayCutout r1 = r1.getDisplayCutout()
            if (r1 != 0) goto La
            r1 = 0
            return r1
        La:
            ᛳᲇᛲᲈ r0 = new ᛳᲇᛲᲈ
            r0.<init>(r1)
            return r0
    }
}
