package androidx.activity;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
final class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements defpackage.InterfaceC0708, defpackage.InterfaceC0165 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public defpackage.C0105 f4;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C1773 f5;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final androidx.lifecycle.C0005 f6;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final /* synthetic */ androidx.activity.C0000 f7;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(androidx.activity.C0000 r1, androidx.lifecycle.C0005 r2, defpackage.C1773 r3) {
            r0 = this;
            r0.<init>()
            r0.f7 = r1
            r0.f6 = r2
            r0.f5 = r3
            r2.m110(r0)
            return
    }

    @Override // defpackage.InterfaceC0165
    public final void cancel() {
            r1 = this;
            androidx.lifecycle.ᛷᲁᛳᛳ r0 = r1.f6
            r0.m112(r1)
            ᲀᲇᲁᲇ r0 = r1.f5
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.f3137
            r0.remove(r1)
            ᛱᛵᲇᛱ r0 = r1.f4
            if (r0 == 0) goto L13
            r0.cancel()
        L13:
            r0 = 0
            r1.f4 = r0
            return
    }

    @Override // defpackage.InterfaceC0708
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final void mo6(defpackage.InterfaceC0770 r4, defpackage.EnumC2255 r5) {
            r3 = this;
            ᲈᛶᛱᛲ r4 = defpackage.EnumC2255.ON_START
            if (r5 != r4) goto L27
            androidx.activity.ᛷᲁᛳᛳ r4 = r3.f7
            ᛶᲈᛷᛵ r5 = r4.f12
            ᲀᲇᲁᲇ r0 = r3.f5
            r5.addLast(r0)
            ᛱᛵᲇᛱ r5 = new ᛱᛵᲇᛱ
            r5.<init>(r4, r0)
            java.util.concurrent.CopyOnWriteArrayList r1 = r0.f3137
            r1.add(r5)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto L24
            r4.m7()
            ᛷᛴᛶᲁ r4 = r4.f10
            r0.f3135 = r4
        L24:
            r3.f4 = r5
            return
        L27:
            ᲈᛶᛱᛲ r4 = defpackage.EnumC2255.ON_STOP
            if (r5 != r4) goto L33
            ᛱᛵᲇᛱ r3 = r3.f4
            if (r3 == 0) goto L3a
            r3.cancel()
            return
        L33:
            ᲈᛶᛱᛲ r4 = defpackage.EnumC2255.ON_DESTROY
            if (r5 != r4) goto L3a
            r3.cancel()
        L3a:
            return
    }
}
