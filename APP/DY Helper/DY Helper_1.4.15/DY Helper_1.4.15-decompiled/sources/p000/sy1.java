package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sy1 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f10084;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.C1000xx f10085;

    public /* synthetic */ sy1(p000.C1000xx r1, int r2) {
            r0 = this;
            r0.f10084 = r2
            r0.f10085 = r1
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r12) {
            r11 = this;
            int r0 = r11.f10084
            s62 r1 = p000.s62.f9751
            java.lang.String r2 = ""
            r3 = 0
            r4 = 1
            xx r11 = r11.f10085
            switch(r0) {
                case 0: goto L116;
                default: goto Ld;
            }
        Ld:
            java.lang.String r0 = r11.f12357
            java.lang.String r5 = r11.f12360
            java.lang.String r6 = r11.f12366
            java.lang.String r7 = r11.f12355
            java.lang.String r8 = r11.f12356
            android.widget.TextView r12 = (android.widget.TextView) r12
            r12.getClass()
            int r9 = r12.getId()
            r10 = 2131297113(0x7f090359, float:1.8212162E38)
            if (r9 != r10) goto L2e
            int r11 = android.graphics.Color.parseColor(r8)
            r12.setTextColor(r11)
            goto L115
        L2e:
            r10 = 2131297125(0x7f090365, float:1.8212186E38)
            if (r9 != r10) goto L38
        L33:
            p000.lz1.m3699(r7, r12, r3, r4)
            goto L115
        L38:
            r10 = 2131297122(0x7f090362, float:1.821218E38)
            if (r9 == r10) goto L115
            r10 = 2131297126(0x7f090366, float:1.8212188E38)
            if (r9 == r10) goto L112
            r10 = 2131297128(0x7f090368, float:1.8212192E38)
            if (r9 != r10) goto L49
            goto L112
        L49:
            r10 = 2131297130(0x7f09036a, float:1.8212196E38)
            if (r9 != r10) goto L53
            p000.lz1.m3699(r6, r12, r3, r4)
            goto L115
        L53:
            r10 = 2131297121(0x7f090361, float:1.8212178E38)
            if (r9 != r10) goto L61
            int r11 = android.graphics.Color.parseColor(r8)
            r12.setTextColor(r11)
            goto L115
        L61:
            r8 = 2131297115(0x7f09035b, float:1.8212166E38)
            if (r9 == r8) goto L10a
            r8 = 2131297123(0x7f090363, float:1.8212182E38)
            if (r9 != r8) goto L6d
            goto L10a
        L6d:
            r8 = 2131297118(0x7f09035e, float:1.8212172E38)
            if (r9 != r8) goto L7d
            java.lang.String r11 = r11.f12349
            int r11 = android.graphics.Color.parseColor(r11)
            r12.setTextColor(r11)
            goto L115
        L7d:
            java.lang.CharSequence r11 = r12.getText()
            if (r11 == 0) goto L88
            java.lang.String r11 = r11.toString()
            goto L89
        L88:
            r11 = r3
        L89:
            if (r11 != 0) goto L8c
            goto L8d
        L8c:
            r2 = r11
        L8d:
            int r11 = r2.hashCode()
            switch(r11) {
                case -1864099483: goto L101;
                case -1355801983: goto Lf0;
                case -931420377: goto Le7;
                case 8635: goto Ld6;
                case 10022: goto Lc5;
                case 24533015: goto Lbc;
                case 32707929: goto Lb3;
                case 576499029: goto La9;
                case 652858391: goto La0;
                case 890238996: goto L96;
                default: goto L94;
            }
        L94:
            goto L115
        L96:
            java.lang.String r11 = "火花好友"
            boolean r11 = r2.equals(r11)
            if (r11 != 0) goto Lf9
            goto L115
        La0:
            java.lang.String r11 = "刷新数据"
            boolean r11 = r2.equals(r11)
            if (r11 == 0) goto L115
            goto L33
        La9:
            java.lang.String r11 = "自定义人员续火"
            boolean r11 = r2.equals(r11)
            if (r11 != 0) goto L33
            goto L115
        Lb3:
            java.lang.String r11 = "自定义"
            boolean r11 = r2.equals(r11)
            if (r11 != 0) goto Lf9
            goto L115
        Lbc:
            java.lang.String r11 = "待续期"
            boolean r11 = r2.equals(r11)
            if (r11 != 0) goto Lf9
            goto L115
        Lc5:
            java.lang.String r11 = "✦"
            boolean r11 = r2.equals(r11)
            if (r11 != 0) goto Lce
            goto L115
        Lce:
            int r11 = android.graphics.Color.parseColor(r6)
            r12.setTextColor(r11)
            goto L115
        Ld6:
            java.lang.String r11 = "↻"
            boolean r11 = r2.equals(r11)
            if (r11 != 0) goto Ldf
            goto L115
        Ldf:
            int r11 = android.graphics.Color.parseColor(r5)
            r12.setTextColor(r11)
            goto L115
        Le7:
            java.lang.String r11 = "功能未激活"
            boolean r11 = r2.equals(r11)
            if (r11 != 0) goto L33
            goto L115
        Lf0:
            java.lang.String r11 = "返回消息列表并重新进入"
            boolean r11 = r2.equals(r11)
            if (r11 != 0) goto Lf9
            goto L115
        Lf9:
            int r11 = android.graphics.Color.parseColor(r0)
            r12.setTextColor(r11)
            goto L115
        L101:
            java.lang.String r11 = "一键续火花"
            boolean r11 = r2.equals(r11)
            if (r11 != 0) goto L33
            goto L115
        L10a:
            int r11 = android.graphics.Color.parseColor(r0)
            r12.setTextColor(r11)
            goto L115
        L112:
            p000.lz1.m3699(r5, r12, r3, r4)
        L115:
            return r1
        L116:
            android.widget.TextView r12 = (android.widget.TextView) r12
            r12.getClass()
            java.lang.CharSequence r0 = r12.getText()
            if (r0 == 0) goto L126
            java.lang.String r0 = r0.toString()
            goto L127
        L126:
            r0 = r3
        L127:
            if (r0 != 0) goto L12a
            goto L12b
        L12a:
            r2 = r0
        L12b:
            java.lang.String r0 = "暂无火花数据"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L139
            java.lang.String r11 = r11.f12355
            p000.lz1.m3699(r11, r12, r3, r4)
            goto L154
        L139:
            java.lang.String r0 = "请先进入消息页面浏览好友列表"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L14b
            java.lang.String r11 = r11.f12357
            int r11 = android.graphics.Color.parseColor(r11)
            r12.setTextColor(r11)
            goto L154
        L14b:
            java.lang.String r11 = r11.f12356
            int r11 = android.graphics.Color.parseColor(r11)
            r12.setTextColor(r11)
        L154:
            return r1
    }
}
