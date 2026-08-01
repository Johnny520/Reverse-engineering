package defpackage;

/* JADX INFO: renamed from: ᲇᛲᛷᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2004 implements defpackage.InterfaceC0391 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.Object f8655;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f8656;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.Object f8657;

    public C2004(android.content.res.Resources r2, defpackage.InterfaceC0391 r3) {
            r1 = this;
            r0 = 0
            r1.f8656 = r0
            r1.<init>()
            r1.f8655 = r2
            r1.f8657 = r3
            return
    }

    public /* synthetic */ C2004(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f8656 = r2
            r0.f8657 = r1
            r0.f8655 = r3
            r0.<init>()
            return
    }

    @Override // defpackage.InterfaceC0391
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final defpackage.InterfaceC1901 mo382(java.lang.Object r12, int r13, int r14, defpackage.C0533 r15) {
            r11 = this;
            int r2 = r11.f8656
            r6 = 0
            switch(r2) {
                case 0: goto L9d;
                case 1: goto L7e;
                default: goto L6;
            }
        L6:
            r1 = r12
            java.io.InputStream r1 = (java.io.InputStream) r1
            boolean r2 = r1 instanceof defpackage.C2250
            r3 = 0
            if (r2 == 0) goto L13
            ᲈᛵᲈᛲ r1 = (defpackage.C2250) r1
            r7 = r1
            r8 = r3
            goto L1f
        L13:
            ᲈᛵᲈᛲ r2 = new ᲈᛵᲈᛲ
            java.lang.Object r4 = r11.f8655
            ᲇᛶᛳᛱ r4 = (defpackage.C2063) r4
            r2.<init>(r1, r4)
            r1 = 1
            r8 = r1
            r7 = r2
        L1f:
            java.util.ArrayDeque r9 = defpackage.C0125.f1035
            monitor-enter(r9)
            java.lang.Object r1 = r9.poll()     // Catch: java.lang.Throwable -> L7b
            ᛱᛷᛳᛸ r1 = (defpackage.C0125) r1     // Catch: java.lang.Throwable -> L7b
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L7b
            if (r1 != 0) goto L30
            ᛱᛷᛳᛸ r1 = new ᛱᛷᛳᛸ
            r1.<init>()
        L30:
            r10 = r1
            r10.f1037 = r7
            ᛴᲇᲇᛸ r1 = new ᛴᲇᲇᛸ
            r1.<init>(r10)
            ᲁᛷᛵ r5 = new ᲁᛷᛵ
            r2 = 10
            r5.<init>(r7, r10, r2, r3)
            java.lang.Object r0 = r11.f8657     // Catch: java.lang.Throwable -> L66
            ᛸᛳᲀᛱ r0 = (defpackage.C1459) r0     // Catch: java.lang.Throwable -> L66
            ᛷᛸᛱᛸ r2 = new ᛷᛸᛱᛸ     // Catch: java.lang.Throwable -> L66
            java.util.ArrayList r3 = r0.f6413     // Catch: java.lang.Throwable -> L66
            ᲇᛶᛳᛱ r4 = r0.f6414     // Catch: java.lang.Throwable -> L66
            r2.<init>(r1, r3, r4)     // Catch: java.lang.Throwable -> L66
            r3 = r14
            r4 = r15
            r1 = r2
            r2 = r13
            ᛱᲀᛴᲁ r0 = r0.m2660(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L66
            r10.f1036 = r6
            r10.f1037 = r6
            monitor-enter(r9)
            r9.offer(r10)     // Catch: java.lang.Throwable -> L63
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L63
            if (r8 == 0) goto L62
            r7.m3637()
        L62:
            return r0
        L63:
            r0 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L63
            throw r0
        L66:
            r0 = move-exception
            r10.f1036 = r6
            r10.f1037 = r6
            java.util.ArrayDeque r1 = defpackage.C0125.f1035
            monitor-enter(r1)
            r1.offer(r10)     // Catch: java.lang.Throwable -> L78
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L78
            if (r8 == 0) goto L77
            r7.m3637()
        L77:
            throw r0
        L78:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L78
            throw r0
        L7b:
            r0 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L7b
            throw r0
        L7e:
            r1 = r12
            android.net.Uri r1 = (android.net.Uri) r1
            java.lang.Object r5 = r11.f8657
            ᲀᲀᲇᲈ r5 = (defpackage.C1750) r5
            ᲁᛸᛸ r1 = r5.m3134(r1, r15)
            if (r1 != 0) goto L8c
            goto L9c
        L8c:
            ᛳᲇᛲᛷ r1 = (defpackage.C0568) r1
            java.lang.Object r1 = r1.get()
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            java.lang.Object r0 = r11.f8655
            ᛸᲈᲇᲁ r0 = (defpackage.InterfaceC1612) r0
            ᛱᲀᛴᲁ r6 = defpackage.AbstractC0729.m1638(r0, r1, r13, r14)
        L9c:
            return r6
        L9d:
            java.lang.Object r5 = r11.f8657
            ᛲᲈᛷᛲ r5 = (defpackage.InterfaceC0391) r5
            ᲁᛸᛸ r1 = r5.mo382(r12, r13, r14, r15)
            java.lang.Object r0 = r11.f8655
            android.content.res.Resources r0 = (android.content.res.Resources) r0
            if (r1 != 0) goto Lac
            goto Lb1
        Lac:
            ᛱᲀᛴᲁ r6 = new ᛱᲀᛴᲁ
            r6.<init>(r0, r1)
        Lb1:
            return r6
    }

    @Override // defpackage.InterfaceC0391
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final boolean mo383(java.lang.Object r2, defpackage.C0533 r3) {
            r1 = this;
            int r0 = r1.f8656
            switch(r0) {
                case 0: goto L16;
                case 1: goto L9;
                default: goto L5;
            }
        L5:
            java.io.InputStream r2 = (java.io.InputStream) r2
            r1 = 1
            return r1
        L9:
            android.net.Uri r2 = (android.net.Uri) r2
            java.lang.String r1 = "android.resource"
            java.lang.String r2 = r2.getScheme()
            boolean r1 = r1.equals(r2)
            return r1
        L16:
            java.lang.Object r1 = r1.f8657
            ᛲᲈᛷᛲ r1 = (defpackage.InterfaceC0391) r1
            boolean r1 = r1.mo383(r2, r3)
            return r1
    }
}
