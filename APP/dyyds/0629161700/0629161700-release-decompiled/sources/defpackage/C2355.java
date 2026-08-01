package defpackage;

/* JADX INFO: renamed from: ᲈᲇᲀᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2355 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final android.widget.TextView f10165;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1606 f10166;

    public C2355(android.widget.TextView r2) {
            r1 = this;
            r1.<init>()
            r1.f10165 = r2
            ᛸᲈᛸᲈ r0 = new ᛸᲈᛸᲈ
            r0.<init>(r2)
            r1.f10166 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final void m3853(boolean r1) {
            r0 = this;
            ᛸᲈᛸᲈ r0 = r0.f10166
            java.lang.Object r0 = r0.f7101
            ᲈᛷᛲ r0 = (defpackage.AbstractC2279) r0
            r0.mo394(r1)
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m3854(android.util.AttributeSet r4, int r5) {
            r3 = this;
            android.widget.TextView r0 = r3.f10165
            android.content.Context r0 = r0.getContext()
            int[] r1 = defpackage.AbstractC1070.f4782
            r2 = 0
            android.content.res.TypedArray r4 = r0.obtainStyledAttributes(r4, r1, r5, r2)
            r5 = 14
            boolean r0 = r4.hasValue(r5)     // Catch: java.lang.Throwable -> L1b
            r1 = 1
            if (r0 == 0) goto L1d
            boolean r1 = r4.getBoolean(r5, r1)     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r3 = move-exception
            goto L24
        L1d:
            r4.recycle()
            r3.m3853(r1)
            return
        L24:
            r4.recycle()
            throw r3
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final void m3855(boolean r1) {
            r0 = this;
            ᛸᲈᛸᲈ r0 = r0.f10166
            java.lang.Object r0 = r0.f7101
            ᲈᛷᛲ r0 = (defpackage.AbstractC2279) r0
            r0.mo393(r1)
            return
    }
}
