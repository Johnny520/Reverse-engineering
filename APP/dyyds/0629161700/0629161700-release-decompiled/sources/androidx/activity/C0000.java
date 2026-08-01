package androidx.activity;

/* JADX INFO: renamed from: androidx.activity.ᛷᲁᛳᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0000 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public android.window.OnBackInvokedDispatcher f8;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final android.window.OnBackInvokedCallback f9;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1257 f10;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.RunnableC1959 f11;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1185 f12;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public boolean f13;

    public C0000(defpackage.RunnableC1959 r2) {
            r1 = this;
            r1.<init>()
            r1.f11 = r2
            ᛶᲈᛷᛵ r2 = new ᛶᲈᛷᛵ
            r2.<init>()
            r1.f12 = r2
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r2 < r0) goto L28
            ᛷᛴᛶᲁ r2 = new ᛷᛴᛶᲁ
            r0 = 0
            r2.<init>(r0, r1)
            r1.f10 = r2
            ᛷᛴᛶᲁ r2 = new ᛷᛴᛶᲁ
            r0 = 1
            r2.<init>(r0, r1)
            ᛷᛷᲁᲇ r0 = defpackage.C1318.f5830
            android.window.OnBackInvokedCallback r2 = r0.m2444(r2)
            r1.f9 = r2
        L28:
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final void m7() {
            r7 = this;
            r0 = 1
            r1 = 0
            ᛶᲈᛷᛵ r2 = r7.f12
            if (r2 == 0) goto Le
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto Le
        Lc:
            r2 = r1
            goto L23
        Le:
            java.util.Iterator r2 = r2.iterator()
        L12:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lc
            java.lang.Object r3 = r2.next()
            ᛴᛲᲈᛱ r3 = (defpackage.AbstractC0632) r3
            boolean r3 = r3.f3136
            if (r3 == 0) goto L12
            r2 = r0
        L23:
            android.window.OnBackInvokedDispatcher r3 = r7.f8
            android.window.OnBackInvokedCallback r4 = r7.f9
            if (r3 == 0) goto L44
            if (r4 == 0) goto L44
            ᛷᛷᲁᲇ r5 = defpackage.C1318.f5830
            if (r2 == 0) goto L39
            boolean r6 = r7.f13
            if (r6 != 0) goto L39
            r5.m2445(r3, r1, r4)
            r7.f13 = r0
            return
        L39:
            if (r2 != 0) goto L44
            boolean r0 = r7.f13
            if (r0 == 0) goto L44
            r5.m2443(r3, r4)
            r7.f13 = r1
        L44:
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m8(defpackage.InterfaceC1734 r3, defpackage.C1773 r4) {
            r2 = this;
            androidx.lifecycle.ᛷᲁᛳᛳ r3 = r3.mo0()
            ᛳᲇᲇᛱ r0 = r3.f286
            ᛳᲇᲇᛱ r1 = defpackage.EnumC0578.f2853
            if (r0 != r1) goto Lb
            goto L22
        Lb:
            androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable r0 = new androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable
            r0.<init>(r2, r3, r4)
            java.util.concurrent.CopyOnWriteArrayList r3 = r4.f3137
            r3.add(r0)
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r3 < r0) goto L22
            r2.m7()
            ᛷᛴᛶᲁ r2 = r2.f10
            r4.f3135 = r2
        L22:
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final void m9() {
            r3 = this;
            ᛶᲈᛷᛵ r0 = r3.f12
            int r1 = r0.mo748()
            java.util.ListIterator r0 = r0.listIterator(r1)
        La:
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.previous()
            r2 = r1
            ᛴᛲᲈᛱ r2 = (defpackage.AbstractC0632) r2
            boolean r2 = r2.f3136
            if (r2 == 0) goto La
            goto L1d
        L1c:
            r1 = 0
        L1d:
            ᛴᛲᲈᛱ r1 = (defpackage.AbstractC0632) r1
            if (r1 == 0) goto L25
            r1.mo1465()
            return
        L25:
            ᲁᲈᛳ r3 = r3.f11
            r3.run()
            return
    }
}
