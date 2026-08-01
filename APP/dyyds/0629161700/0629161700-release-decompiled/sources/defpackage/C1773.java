package defpackage;

/* JADX INFO: renamed from: ᲀᲇᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1773 extends defpackage.AbstractC0632 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final /* synthetic */ com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout f7838;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.InterfaceC1734 f7839;

    public C1773(com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r1, defpackage.InterfaceC1734 r2) {
            r0 = this;
            r0.f7838 = r1
            r0.f7839 = r2
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // defpackage.AbstractC0632
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final void mo1465() {
            r3 = this;
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r3.f7838
            com.kongzue.dialogx.interfaces.ᛷᲁᛳᛳ r1 = r0.getParentDialog()
            boolean r2 = r0.m280()
            if (r2 == 0) goto Ld
            goto L34
        Ld:
            ᲈᛵᛷᲁ r0 = r0.f399
            if (r0 == 0) goto L17
            if (r1 == 0) goto L17
            r0.mo2296()
            return
        L17:
            r0 = 0
            r3.f3136 = r0
            ᛷᛴᛶᲁ r0 = r3.f3135
            if (r0 == 0) goto L21
            r0.mo1032()
        L21:
            r0 = 1
            ᲀᲀᛲᲈ r1 = r3.f7839     // Catch: java.lang.Throwable -> L35
            androidx.activity.ᛷᲁᛳᛳ r1 = r1.mo3()     // Catch: java.lang.Throwable -> L35
            r1.m9()     // Catch: java.lang.Throwable -> L35
            r3.f3136 = r0
            ᛷᛴᛶᲁ r3 = r3.f3135
            if (r3 == 0) goto L34
            r3.mo1032()
        L34:
            return
        L35:
            r1 = move-exception
            r3.f3136 = r0
            ᛷᛴᛶᲁ r3 = r3.f3135
            if (r3 == 0) goto L3f
            r3.mo1032()
        L3f:
            throw r1
    }
}
