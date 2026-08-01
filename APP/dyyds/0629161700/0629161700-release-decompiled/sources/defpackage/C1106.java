package defpackage;

/* JADX INFO: renamed from: ᛶᛷᛱᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1106 implements android.widget.AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f4944;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f4945;

    public /* synthetic */ C1106(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f4945 = r1
            r0.f4944 = r2
            r0.<init>()
            return
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView r7, android.view.View r8, int r9, long r10) {
            r6 = this;
            int r7 = r6.f4945
            r10 = 0
            r11 = 2
            r0 = 1097859072(0x41700000, float:15.0)
            r1 = 100
            r3 = 1
            java.lang.Object r6 = r6.f4944
            switch(r7) {
                case 0: goto L1c9;
                case 1: goto Ldb;
                case 2: goto L14;
                default: goto Le;
            }
        Le:
            androidx.appcompat.widget.SearchView r6 = (androidx.appcompat.widget.SearchView) r6
            r6.m47(r9)
            return
        L14:
            ᲀᲇᲈᛳ r6 = (defpackage.C1776) r6
            java.util.HashMap r7 = r6.f7847
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            java.lang.Object r7 = r7.get(r4)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            if (r7 != 0) goto L26
            r7 = r3
            goto L2a
        L26:
            boolean r7 = r7.booleanValue()
        L2a:
            if (r7 != 0) goto L2e
            goto Lda
        L2e:
            com.kongzue.dialogx.interfaces.AbstractC0008.m249(r8)
            long r7 = java.lang.System.currentTimeMillis()
            long r4 = r6.f7849
            long r4 = r7 - r4
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 <= 0) goto Lda
            r6.f7849 = r7
            float r7 = r6.f7843
            ᛷᛷᛸᛱ r8 = r6.f1241
            android.view.View r8 = r8.f5822
            com.kongzue.dialogx.util.views.MaxRelativeLayout r8 = (com.kongzue.dialogx.util.views.MaxRelativeLayout) r8
            float r8 = r8.getY()
            float r7 = r7 - r8
            float r7 = java.lang.Math.abs(r7)
            int r8 = r6.m258(r0)
            float r8 = (float) r8
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L5b
            goto Lda
        L5b:
            r6.f7848 = r9
            int r7 = r6.f7851
            int r7 = defpackage.AbstractC0225.m812(r7)
            if (r7 == 0) goto Ld2
            if (r7 == r3) goto Lcc
            if (r7 == r11) goto L6a
            goto Lda
        L6a:
            java.util.ArrayList r7 = r6.f7853
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
            boolean r7 = r7.contains(r8)
            java.util.ArrayList r8 = r6.f7853
            if (r7 == 0) goto L81
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r9)
            r8.remove(r7)
            goto L88
        L81:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            r8.add(r7)
        L88:
            ᲇᲇᛶᲁ r7 = r6.f7852
            r7.notifyDataSetInvalidated()
            java.util.ArrayList r7 = r6.f7853
            int r7 = r7.size()
            int[] r7 = new int[r7]
            r6.f7855 = r7
            java.util.ArrayList r7 = r6.f7853
            int r7 = r7.size()
            java.lang.CharSequence[] r7 = new java.lang.CharSequence[r7]
            r6.f7844 = r7
        La1:
            java.util.ArrayList r7 = r6.f7853
            int r7 = r7.size()
            if (r10 >= r7) goto Lda
            int[] r7 = r6.f7855
            java.util.ArrayList r8 = r6.f7853
            java.lang.Object r8 = r8.get(r10)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r7[r10] = r8
            java.lang.CharSequence[] r7 = r6.f7844
            java.util.List r8 = r6.f7846
            int[] r9 = r6.f7855
            r9 = r9[r10]
            java.lang.Object r8 = r8.get(r9)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r7[r10] = r8
            int r10 = r10 + 1
            goto La1
        Lcc:
            ᲇᲇᛶᲁ r6 = r6.f7852
            r6.notifyDataSetInvalidated()
            goto Lda
        Ld2:
            ᲈᛷᲀᛷ r7 = new ᲈᛷᲀᛷ
            r7.<init>(r6, r3)
            com.kongzue.dialogx.interfaces.AbstractC0008.m257(r7)
        Lda:
            return
        Ldb:
            ᲀᲀᛲᛴ r6 = (defpackage.C1732) r6
            java.util.ArrayList r7 = r6.f7666
            if (r7 == 0) goto Lf5
            if (r9 < 0) goto Lf5
            int r7 = r7.size()
            if (r9 >= r7) goto Lf5
            java.util.ArrayList r7 = r6.f7666
            java.lang.Object r7 = r7.get(r9)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r9 = r7.intValue()
        Lf5:
            java.util.HashMap r7 = r6.f7682
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            java.lang.Object r7 = r7.get(r4)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            if (r7 != 0) goto L105
            r7 = r3
            goto L109
        L105:
            boolean r7 = r7.booleanValue()
        L109:
            if (r7 != 0) goto L10d
            goto L1c8
        L10d:
            com.kongzue.dialogx.interfaces.AbstractC0008.m249(r8)
            long r7 = java.lang.System.currentTimeMillis()
            long r4 = r6.f7672
            long r4 = r7 - r4
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 <= 0) goto L1c8
            r6.f7672 = r7
            float r7 = r6.f7677
            ᛳᛳᛴᛸ r8 = r6.f4767
            android.widget.RelativeLayout r8 = r8.f2158
            float r8 = r8.getY()
            float r7 = r7 - r8
            float r7 = java.lang.Math.abs(r7)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "#Click:deltaY= "
            r8.<init>(r1)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            com.kongzue.dialogx.interfaces.AbstractC0008.m245(r8)
            int r8 = r6.m258(r0)
            float r8 = (float) r8
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L149
            goto L1c8
        L149:
            r6.f7667 = r9
            java.lang.String r7 = "### onMenuItemClickListener=null"
            com.kongzue.dialogx.interfaces.AbstractC0008.m245(r7)
            int r7 = r6.f7681
            int r7 = defpackage.AbstractC0225.m812(r7)
            if (r7 == 0) goto L1c5
            if (r7 == r3) goto L1bf
            if (r7 == r11) goto L15d
            goto L1c8
        L15d:
            java.util.ArrayList r7 = r6.f7668
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
            boolean r7 = r7.contains(r8)
            java.util.ArrayList r8 = r6.f7668
            if (r7 == 0) goto L174
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r9)
            r8.remove(r7)
            goto L17b
        L174:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            r8.add(r7)
        L17b:
            ᲇᲇᛶᲁ r7 = r6.f7685
            r7.notifyDataSetInvalidated()
            java.util.ArrayList r7 = r6.f7668
            int r7 = r7.size()
            int[] r7 = new int[r7]
            r6.f7671 = r7
            java.util.ArrayList r7 = r6.f7668
            int r7 = r7.size()
            java.lang.CharSequence[] r7 = new java.lang.CharSequence[r7]
            r6.f7675 = r7
        L194:
            java.util.ArrayList r7 = r6.f7668
            int r7 = r7.size()
            if (r10 >= r7) goto L1c8
            int[] r7 = r6.f7671
            java.util.ArrayList r8 = r6.f7668
            java.lang.Object r8 = r8.get(r10)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r7[r10] = r8
            java.lang.CharSequence[] r7 = r6.f7675
            java.util.ArrayList r8 = r6.f7670
            int[] r9 = r6.f7671
            r9 = r9[r10]
            java.lang.Object r8 = r8.get(r9)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r7[r10] = r8
            int r10 = r10 + 1
            goto L194
        L1bf:
            ᲇᲇᛶᲁ r6 = r6.f7685
            r6.notifyDataSetInvalidated()
            goto L1c8
        L1c5:
            r6.m2040()
        L1c8:
            return
        L1c9:
            ᛵᛶᛵᛶ r6 = (defpackage.C0911) r6
            ᛴᛱᲀᛸ r7 = r6.f4146
            r7.setSelection(r9)
            android.widget.AdapterView$OnItemClickListener r10 = r7.getOnItemClickListener()
            if (r10 == 0) goto L1df
            ᛱᛴᛴᛲ r10 = r6.f4145
            long r10 = r10.getItemId(r9)
            r7.performItemClick(r8, r9, r10)
        L1df:
            r6.dismiss()
            return
    }
}
