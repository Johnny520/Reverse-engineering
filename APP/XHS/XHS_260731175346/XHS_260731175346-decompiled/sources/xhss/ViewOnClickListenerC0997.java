package xhss;

/* JADX INFO: renamed from: xhss.ᲁᲇᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0997 implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ xhss.C0935 f3258;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f3259;

    public /* synthetic */ ViewOnClickListenerC0997(xhss.C0935 r1, int r2) {
            r0 = this;
            r0.f3259 = r2
            r0.f3258 = r1
            r0.<init>()
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r13) {
            r12 = this;
            int r0 = r12.f3259
            xhss.ᲁᛳᛵᛷ r12 = r12.f3258
            switch(r0) {
                case 0: goto L2b;
                case 1: goto L1b;
                case 2: goto Lb;
                default: goto L7;
            }
        L7:
            r12.m1536(r13)
            return
        Lb:
            xhss.ᛱᛴᛳᛴ r0 = r12.f3025
            android.widget.EditText r1 = r12.f3029
            if (r1 == 0) goto L14
            r0.m62(r1)
        L14:
            com.kongzue.dialogx.interfaces.AbstractC0001.m34(r13)
            r12.m1536(r13)
            return
        L1b:
            xhss.ᛱᛴᛳᛴ r0 = r12.f3025
            android.widget.EditText r1 = r12.f3029
            if (r1 == 0) goto L24
            r0.m62(r1)
        L24:
            com.kongzue.dialogx.interfaces.AbstractC0001.m34(r13)
            r12.m1536(r13)
            return
        L2b:
            xhss.ᛱᛴᛳᛴ r0 = r12.f3025
            android.widget.EditText r1 = r12.f3029
            if (r1 == 0) goto L34
            r0.m62(r1)
        L34:
            com.kongzue.dialogx.interfaces.AbstractC0001.m34(r13)
            xhss.ᛱᛴᛳᛴ r1 = r0.f225
            xhss.ᛷᲈᛸᛳ r0 = r0.f231
            if (r0 == 0) goto L1db
            boolean r2 = r0 instanceof xhss.InterfaceC0826
            if (r2 == 0) goto L4e
            xhss.ᛸᲈᲁᲇ r0 = (xhss.InterfaceC0826) r0
            boolean r0 = r0.mo360(r1)
            if (r0 != 0) goto L1de
            r12.m1536(r13)
            goto L1de
        L4e:
            boolean r2 = r0 instanceof xhss.C0742
            if (r2 == 0) goto L1de
            xhss.ᛸᛳᛴᛵ r0 = (xhss.C0742) r0
            int r2 = r0.f2492
            r3 = 0
            r4 = 0
            java.lang.Object r0 = r0.f2491
            switch(r2) {
                case 0: goto L1a1;
                case 1: goto L12b;
                case 2: goto Lf3;
                default: goto L5d;
            }
        L5d:
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            xhss.ᲀᛸᛷᛱ r1 = (xhss.C0885) r1
            xhss.ᛳᛱᛲᛲ r2 = xhss.C0229.f861
            java.util.ArrayList r1 = r1.f2844
            java.lang.String[] r4 = new java.lang.String[r4]
            java.lang.Object[] r0 = r0.toArray(r4)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r4 = -10737879976005(0xfffff63be47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r4)
            r4 = -10772239714373(0xfffff633e47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r4)
            r2.getClass()
            r4 = -36069597087813(0xffffdf31e47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r4)
            r4 = -36091071924293(0xffffdf2ce47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r4)
            r4 = -36048122251333(0xffffdf36e47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r4)
            if (r1 == 0) goto Lc9
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r1 = r1.iterator()
        La3:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto Lbf
            java.lang.Object r5 = r1.next()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            java.lang.Object r5 = xhss.AbstractC0193.m447(r5, r0)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto La3
            r4.add(r5)
            goto La3
        Lbf:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto Lc6
            r3 = r4
        Lc6:
            if (r3 == 0) goto Lc9
            goto Lcb
        Lc9:
            xhss.ᛵᛷᛶᛱ r3 = xhss.C0492.f1802
        Lcb:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>(r3)
            r2.getClass()
            r1 = -35223488530501(0xffffdff6e47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r1)
            xhss.ᛶᛳᲀᲇ r1 = xhss.C0229.f881
            xhss.ᛴᛲᛱᲇ[] r2 = xhss.C0229.f847
            r3 = 7
            r2 = r2[r3]
            r1.m980(r2, r0)
            r0 = -7284726270021(0xfffff95fe47a77bb, double:NaN)
            java.lang.String r0 = xhss.AbstractC0775.m1313(r0)
            xhss.C0915.m1502(r0)
            goto L1d7
        Lf3:
            java.lang.String[] r0 = (java.lang.String[]) r0
            xhss.ᲀᛸᛷᛱ r1 = (xhss.C0885) r1
            xhss.ᛳᛱᛲᛲ r3 = xhss.C0229.f861
            java.util.ArrayList r1 = r1.f2844
            xhss.ᛴᛳᛳᲀ r2 = new xhss.ᛴᛳᛳᲀ
            r4 = -2586032048197(0xfffffda5e47a77bb, double:NaN)
            java.lang.String r5 = xhss.AbstractC0775.m1313(r4)
            r6 = -2628981721157(0xfffffd9be47a77bb, double:NaN)
            java.lang.String r6 = xhss.AbstractC0775.m1313(r6)
            r7 = 0
            r8 = 14
            java.lang.Class<xhss.ᛳᛱᛲᛲ> r4 = xhss.C0229.class
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r3.getClass()
            xhss.C0229.m508(r1, r0, r2)
            r0 = -6593236535365(0xfffffa00e47a77bb, double:NaN)
            java.lang.String r0 = xhss.AbstractC0775.m1313(r0)
            xhss.C0915.m1502(r0)
            goto L1d7
        L12b:
            java.lang.String[] r0 = (java.lang.String[]) r0
            xhss.ᲀᛸᛷᛱ r1 = (xhss.C0885) r1
            xhss.ᛳᛱᛲᛲ r6 = xhss.C0229.f861
            java.util.ArrayList r1 = r1.f2844
            xhss.ᛴᛳᛳᲀ r5 = new xhss.ᛴᛳᛳᲀ
            r7 = -9372080375877(0xfffff779e47a77bb, double:NaN)
            java.lang.String r8 = xhss.AbstractC0775.m1313(r7)
            r9 = -9440799852613(0xfffff769e47a77bb, double:NaN)
            java.lang.String r9 = xhss.AbstractC0775.m1313(r9)
            r10 = 0
            r11 = 6
            java.lang.Class<xhss.ᛳᛱᛲᛲ> r7 = xhss.C0229.class
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r6.getClass()
            xhss.C0229.m508(r1, r0, r5)
            java.lang.ref.WeakReference r0 = xhss.AbstractC0990.f3211     // Catch: java.lang.Throwable -> L177
            if (r0 == 0) goto L17d
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L177
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch: java.lang.Throwable -> L177
            if (r0 == 0) goto L17d
            xhss.AbstractC0990.m1626(r0, r4)     // Catch: java.lang.Throwable -> L177
            xhss.ᲇᲁᛱᛸ r0 = xhss.C1085.f3497     // Catch: java.lang.Throwable -> L177
            r1 = -260644847061061(0xffff12f1e47a77bb, double:NaN)
            java.lang.String r1 = xhss.AbstractC0775.m1313(r1)     // Catch: java.lang.Throwable -> L177
            r0.getClass()     // Catch: java.lang.Throwable -> L177
            xhss.C1085.m1750(r1)     // Catch: java.lang.Throwable -> L177
            xhss.ᛵᛷᲈᛶ r3 = xhss.C0500.f1817     // Catch: java.lang.Throwable -> L177
            goto L17d
        L177:
            r0 = move-exception
            xhss.ᲈᛳᛱᲇ r3 = new xhss.ᲈᛳᛱᲇ
            r3.<init>(r0)
        L17d:
            java.lang.Throwable r0 = xhss.AbstractC0134.m364(r3)
            if (r0 == 0) goto L194
            xhss.ᲇᲁᛱᛸ r1 = xhss.C1085.f3497
            r2 = -260773696079941(0xffff12d3e47a77bb, double:NaN)
            java.lang.String r2 = xhss.AbstractC0775.m1313(r2)
            r1.getClass()
            xhss.C1085.m1764(r2, r0)
        L194:
            r0 = -6898179213381(0xfffff9b9e47a77bb, double:NaN)
            java.lang.String r0 = xhss.AbstractC0775.m1313(r0)
            xhss.C0915.m1502(r0)
            goto L1d7
        L1a1:
            java.lang.String[] r0 = (java.lang.String[]) r0
            xhss.ᲀᛸᛷᛱ r1 = (xhss.C0885) r1
            xhss.ᛳᛱᛲᛲ r3 = xhss.C0229.f861
            java.util.ArrayList r1 = r1.f2844
            xhss.ᛴᛳᛳᲀ r2 = new xhss.ᛴᛳᛳᲀ
            r4 = -8341288224837(0xfffff869e47a77bb, double:NaN)
            java.lang.String r5 = xhss.AbstractC0775.m1313(r4)
            r6 = -8414302668869(0xfffff858e47a77bb, double:NaN)
            java.lang.String r6 = xhss.AbstractC0775.m1313(r6)
            r7 = 0
            r8 = 15
            java.lang.Class<xhss.ᛳᛱᛲᛲ> r4 = xhss.C0229.class
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r3.getClass()
            xhss.C0229.m508(r1, r0, r2)
            r0 = -6919654049861(0xfffff9b4e47a77bb, double:NaN)
            java.lang.String r0 = xhss.AbstractC0775.m1313(r0)
            xhss.C0915.m1502(r0)
        L1d7:
            r12.m1536(r13)
            goto L1de
        L1db:
            r12.m1536(r13)
        L1de:
            return
    }
}
