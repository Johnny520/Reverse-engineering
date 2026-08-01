package defpackage;

/* JADX INFO: renamed from: ᛱᛱᲈᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0028 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public float f492;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public boolean f493;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public float f494;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m337(defpackage.C1069 r3, defpackage.C0438 r4) {
            r2 = this;
            if (r3 == 0) goto L28
            if (r4 == 0) goto L28
            com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r4.f2157
            if (r0 == 0) goto L28
            ᲈᲀᛲᲀ r1 = r4.f2167
            if (r1 != 0) goto Ld
            goto L28
        Ld:
            boolean r1 = r3.m2036()
            if (r1 == 0) goto L1c
            ᛶᲁᛵᛱ r1 = new ᛶᲁᛵᛱ
            r1.<init>(r2, r3, r4, r0)
            r0.setOnTouchListener(r1)
            return
        L1c:
            ᲈᲀᛲᲀ r2 = r4.f2167
            if (r2 == 0) goto L24
            r3 = 0
            r2.mo276(r3)
        L24:
            r2 = 0
            r0.setOnTouchListener(r2)
        L28:
            return
    }
}
