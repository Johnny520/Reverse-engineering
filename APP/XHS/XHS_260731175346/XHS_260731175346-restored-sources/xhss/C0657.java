package xhss;

/* JADX INFO: renamed from: xhss.ᛷᛵᛲᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0657 implements android.widget.AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final /* synthetic */ xhss.C0885 f2253;

    public C0657(xhss.C0885 r1) {
            r0 = this;
            r0.<init>()
            r0.f2253 = r1
            return
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView r5, android.view.View r6, int r7, long r8) {
            r4 = this;
            xhss.ᲀᛸᛷᛱ r4 = r4.f2253
            java.util.HashMap r5 = r4.f2846
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            java.lang.Object r5 = r5.get(r8)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r8 = 1
            if (r5 != 0) goto L13
            r5 = r8
            goto L17
        L13:
            boolean r5 = r5.booleanValue()
        L17:
            if (r5 != 0) goto L1b
            goto Lcb
        L1b:
            com.kongzue.dialogx.interfaces.AbstractC0001.m34(r6)
            long r5 = java.lang.System.currentTimeMillis()
            long r0 = r4.f2859
            long r0 = r5 - r0
            r2 = 100
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 <= 0) goto Lcb
            r4.f2859 = r5
            float r5 = r4.f2848
            xhss.ᲁᛳᛵᛷ r6 = r4.f226
            com.kongzue.dialogx.util.views.MaxRelativeLayout r6 = r6.f3023
            float r6 = r6.getY()
            float r5 = r5 - r6
            float r5 = java.lang.Math.abs(r5)
            r6 = 1097859072(0x41700000, float:15.0)
            int r6 = r4.m64(r6)
            float r6 = (float) r6
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L4a
            goto Lcb
        L4a:
            r4.f2850 = r7
            int r5 = r4.f2852
            int r5 = xhss.AbstractC0390.m784(r5)
            if (r5 == 0) goto Lc3
            if (r5 == r8) goto Lbd
            r6 = 2
            if (r5 == r6) goto L5a
            goto Lcb
        L5a:
            java.util.ArrayList r5 = r4.f2844
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            boolean r5 = r5.contains(r6)
            java.util.ArrayList r6 = r4.f2844
            if (r5 == 0) goto L71
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r7)
            r6.remove(r5)
            goto L78
        L71:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            r6.add(r5)
        L78:
            xhss.ᛲᛳᛴᛳ r5 = r4.f2849
            r5.notifyDataSetInvalidated()
            java.util.ArrayList r5 = r4.f2844
            int r5 = r5.size()
            int[] r5 = new int[r5]
            r4.f2847 = r5
            java.util.ArrayList r5 = r4.f2844
            int r5 = r5.size()
            java.lang.CharSequence[] r5 = new java.lang.CharSequence[r5]
            r4.f2858 = r5
            r5 = 0
        L92:
            java.util.ArrayList r6 = r4.f2844
            int r6 = r6.size()
            if (r5 >= r6) goto Lcb
            int[] r6 = r4.f2847
            java.util.ArrayList r7 = r4.f2844
            java.lang.Object r7 = r7.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r6[r5] = r7
            java.lang.CharSequence[] r6 = r4.f2858
            java.util.ArrayList r7 = r4.f2854
            int[] r8 = r4.f2847
            r8 = r8[r5]
            java.lang.Object r7 = r7.get(r8)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r6[r5] = r7
            int r5 = r5 + 1
            goto L92
        Lbd:
            xhss.ᛲᛳᛴᛳ r4 = r4.f2849
            r4.notifyDataSetInvalidated()
            return
        Lc3:
            xhss.ᲇᛶᲈᛸ r5 = new xhss.ᲇᛶᲈᛸ
            r5.<init>(r4, r8)
            com.kongzue.dialogx.interfaces.AbstractC0001.m43(r5)
        Lcb:
            return
    }
}
