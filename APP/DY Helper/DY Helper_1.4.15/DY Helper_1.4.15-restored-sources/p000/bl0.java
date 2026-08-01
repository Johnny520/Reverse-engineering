package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bl0 implements p000.e80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f1773;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f1774;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f1775;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ java.lang.Object f1776;

    public /* synthetic */ bl0(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.f1773 = r4
            r0.f1774 = r1
            r0.f1775 = r2
            r0.f1776 = r3
            r0.<init>()
            return
    }

    @Override // p000.e80
    public final java.lang.Object invoke(java.lang.Object r8, java.lang.Object r9) {
            r7 = this;
            int r0 = r7.f1773
            java.lang.String r1 = "该功能仅限内测用户使用"
            r2 = 0
            s62 r3 = p000.s62.f9751
            java.lang.Object r4 = r7.f1776
            java.lang.Object r5 = r7.f1775
            java.lang.Object r7 = r7.f1774
            switch(r0) {
                case 0: goto La1;
                case 1: goto L4c;
                default: goto L10;
            }
        L10:
            android.content.Context r7 = (android.content.Context) r7
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            android.app.Activity r4 = (android.app.Activity) r4
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            android.widget.Switch r9 = (android.widget.Switch) r9
            bv1 r0 = p000.bv1.f1853
            r9.getClass()
            java.lang.String r0 = "pet_elf_auto_task_enabled"
            if (r8 == 0) goto L3b
            boolean r6 = p000.AbstractC0976x9.m6529()
            if (r6 != 0) goto L3b
            android.widget.Toast r7 = android.widget.Toast.makeText(r7, r1, r2)
            r7.show()
            p000.ui1.m5871(r0, r2)
            r9.setChecked(r2)
            goto L4b
        L3b:
            p000.ui1.m5871(r0, r8)
            if (r8 == 0) goto L41
            goto L43
        L41:
            r2 = 8
        L43:
            r5.setVisibility(r2)
            if (r8 == 0) goto L4b
            p000.pg1.m4533(r4)
        L4b:
            return r3
        L4c:
            android.content.Context r7 = (android.content.Context) r7
            od r5 = (p000.EnumC0619od) r5
            android.app.Activity r4 = (android.app.Activity) r4
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            android.widget.Switch r9 = (android.widget.Switch) r9
            r9.getClass()
            if (r8 == 0) goto L70
            boolean r0 = p000.AbstractC0976x9.m6528()
            if (r0 != 0) goto L70
            r9.setChecked(r2)
            android.widget.Toast r7 = android.widget.Toast.makeText(r7, r1, r2)
            r7.show()
            goto La0
        L70:
            r5.getClass()
            boolean r7 = p000.ui1.m5867()
            if (r7 != 0) goto L7a
            goto L99
        L7a:
            int r7 = r5.ordinal()
            if (r7 == 0) goto L91
            r9 = 1
            if (r7 == r9) goto L8e
            r9 = 2
            if (r7 != r9) goto L89
            java.lang.String r7 = "pet_elf_camp_auto_water"
            goto L93
        L89:
            p000.C1080.m7272()
            r3 = 0
            goto La0
        L8e:
            java.lang.String r7 = "pet_elf_camp_auto_plant"
            goto L93
        L91:
            java.lang.String r7 = "pet_elf_camp_auto_harvest"
        L93:
            p000.ui1.m5871(r7, r8)
            p000.xn0.m6701()
        L99:
            boolean r7 = p000.dd1.m1714()
            p000.dd1.m1716(r4, r7)
        La0:
            return r3
        La1:
            java.util.LinkedHashSet r7 = (java.util.LinkedHashSet) r7
            android.widget.TextView r5 = (android.widget.TextView) r5
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.lang.Integer r8 = (java.lang.Integer) r8
            r8.getClass()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Lb8
            r7.add(r8)
            goto Lbb
        Lb8:
            r7.remove(r8)
        Lbb:
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto Lce
            int r7 = r4.size()
            java.lang.String r8 = "选择图片（共 "
            java.lang.String r9 = " 张）"
            java.lang.String r7 = p000.AbstractC0602nx.m4127(r8, r7, r9)
            goto Le0
        Lce:
            int r7 = r7.size()
            int r8 = r4.size()
            java.lang.String r9 = " / "
            java.lang.String r0 = " 张"
            java.lang.String r1 = "已选 "
            java.lang.String r7 = p000.AbstractC0602nx.m4128(r1, r7, r9, r8, r0)
        Le0:
            r5.setText(r7)
            return r3
    }
}
