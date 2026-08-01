package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dd0 implements android.content.DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f3089;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f3090;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f3091;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ java.lang.Object f3092;

    public /* synthetic */ dd0(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.f3089 = r4
            r0.f3090 = r1
            r0.f3091 = r2
            r0.f3092 = r3
            r0.<init>()
            return
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface r10, int r11) {
            r9 = this;
            int r10 = r9.f3089
            r11 = 7
            r0 = 0
            switch(r10) {
                case 0: goto L234;
                case 1: goto L21b;
                case 2: goto L202;
                case 3: goto L195;
                case 4: goto L66;
                default: goto L7;
            }
        L7:
            java.lang.Object r10 = r9.f3090
            android.widget.EditText r10 = (android.widget.EditText) r10
            java.lang.Object r11 = r9.f3091
            android.app.Activity r11 = (android.app.Activity) r11
            java.lang.Object r9 = r9.f3092
            ty1 r9 = (p000.ty1) r9
            android.text.Editable r10 = r10.getText()
            r1 = 0
            if (r10 == 0) goto L1f
            java.lang.String r10 = r10.toString()
            goto L20
        L1f:
            r10 = r1
        L20:
            if (r10 != 0) goto L24
            java.lang.String r10 = ""
        L24:
            java.lang.CharSequence r10 = p000.q02.m4660(r10)
            java.lang.String r10 = r10.toString()
            boolean r2 = p000.q02.m4671(r10)
            if (r2 == 0) goto L3c
            java.lang.String r9 = "分组名称不能为空"
            android.widget.Toast r9 = android.widget.Toast.makeText(r11, r9, r0)
            r9.show()
            goto L65
        L3c:
            ry1 r2 = p000.ry1.f9602
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r4 = "group_"
            java.lang.String r2 = p000.AbstractC0602nx.m4126(r2, r4)
            my1 r3 = new my1
            r4 = 255(0xff, float:3.57E-43)
            r3.<init>(r4, r1, r1)
            java.lang.String r1 = "follow"
            rd r4 = new rd
            r4.<init>()
            p000.ry1.m5248(r2, r10, r3, r1, r4)
            java.lang.String r10 = "分组已创建"
            android.widget.Toast r10 = android.widget.Toast.makeText(r11, r10, r0)
            r10.show()
            r9.invoke()
        L65:
            return
        L66:
            java.lang.Object r10 = r9.f3090
            gz1 r10 = (p000.gz1) r10
            java.lang.Object r11 = r9.f3091
            android.app.Activity r11 = (android.app.Activity) r11
            java.lang.Object r9 = r9.f3092
            cu1 r9 = (p000.cu1) r9
            ry1 r1 = p000.ry1.f9602
            java.lang.String r10 = r10.f4508
            java.lang.String r1 = "spark_person_group_order_v1"
            java.lang.String r2 = "spark_person_groups_v1"
            java.lang.String r3 = "spark_message_groups_v1"
            java.lang.String r4 = "{}"
            boolean r5 = p000.ui1.m5867()
            if (r5 != 0) goto L86
            goto L183
        L86:
            java.lang.CharSequence r5 = p000.q02.m4660(r10)
            java.lang.String r5 = r5.toString()
            boolean r6 = p000.q02.m4671(r5)
            if (r6 != 0) goto L183
            java.lang.String r6 = "default"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L9e
            goto L183
        L9e:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> La8
            java.lang.String r7 = p000.ui1.m5893(r3, r4)     // Catch: java.lang.Throwable -> La8
            r6.<init>(r7)     // Catch: java.lang.Throwable -> La8
            goto Laf
        La8:
            r6 = move-exception
            eo1 r7 = new eo1
            r7.<init>(r6)
            r6 = r7
        Laf:
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            boolean r8 = r6 instanceof p000.eo1
            if (r8 == 0) goto Lb9
            r6 = r7
        Lb9:
            org.json.JSONObject r6 = (org.json.JSONObject) r6
            r6.remove(r5)
            java.lang.Object r7 = p000.ui1.f10844
            java.lang.String r6 = r6.toString()
            r6.getClass()
            p000.ui1.m5875(r3, r6)
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r6 = p000.ui1.m5893(r2, r4)     // Catch: java.lang.Throwable -> Ld4
            r3.<init>(r6)     // Catch: java.lang.Throwable -> Ld4
            goto Ldb
        Ld4:
            r3 = move-exception
            eo1 r6 = new eo1
            r6.<init>(r3)
            r3 = r6
        Ldb:
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            boolean r7 = r3 instanceof p000.eo1
            if (r7 == 0) goto Le5
            r3 = r6
        Le5:
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            java.util.Iterator r6 = r3.keys()
            r6.getClass()
            ss1 r6 = p000.us1.m5951(r6)
            java.util.List r6 = p000.us1.m5948(r6)
            java.util.Iterator r6 = r6.iterator()
        Lfa:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L114
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = r3.optString(r7)
            boolean r8 = p000.ln0.m3626(r8, r5)
            if (r8 == 0) goto Lfa
            r3.remove(r7)
            goto Lfa
        L114:
            java.lang.Object r6 = p000.ui1.f10844
            java.lang.String r3 = r3.toString()
            r3.getClass()
            p000.ui1.m5875(r2, r3)
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L12a
            java.lang.String r3 = p000.ui1.m5893(r1, r4)     // Catch: java.lang.Throwable -> L12a
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L12a
            goto L131
        L12a:
            r2 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r2)
            r2 = r3
        L131:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            boolean r4 = r2 instanceof p000.eo1
            if (r4 == 0) goto L13b
            r2 = r3
        L13b:
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            r2.remove(r5)
            java.lang.Object r3 = p000.ui1.f10844
            java.lang.String r2 = r2.toString()
            r2.getClass()
            p000.ui1.m5875(r1, r2)
            java.lang.String r1 = "spark_group_order_v1"
            ry1 r2 = p000.ry1.f9602
            java.util.ArrayList r2 = p000.ry1.m5237()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L15d:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L174
            java.lang.Object r4 = r2.next()
            r6 = r4
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = p000.ln0.m3626(r6, r5)
            if (r6 != 0) goto L15d
            r3.add(r4)
            goto L15d
        L174:
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>(r3)
            java.lang.String r2 = r2.toString()
            r2.getClass()
            p000.ui1.m5875(r1, r2)
        L183:
            java.util.LinkedHashSet r1 = p000.jz1.f5676
            r1.remove(r10)
            java.lang.String r10 = "分组已删除"
            android.widget.Toast r10 = android.widget.Toast.makeText(r11, r10, r0)
            r10.show()
            r9.invoke()
            return
        L195:
            java.lang.Object r10 = r9.f3090
            xd0 r10 = (p000.xd0) r10
            java.lang.Object r1 = r9.f3091
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            java.lang.Object r9 = r9.f3092
            java.lang.String r9 = (java.lang.String) r9
            be0 r2 = p000.be0.f1670
            yd0 r10 = r2.m934(r10)
            int r10 = r10.ordinal()
            if (r10 == 0) goto L1f0
            r2 = 1
            if (r10 == r2) goto L1f0
            r9 = 4
            if (r10 == r9) goto L1e2
            r9 = 5
            if (r10 == r9) goto L1d4
            if (r10 == r11) goto L1c6
            android.content.Context r9 = r1.getContext()
            java.lang.String r10 = "无法识别联系人身份"
            android.widget.Toast r9 = android.widget.Toast.makeText(r9, r10, r0)
            r9.show()
            goto L201
        L1c6:
            android.content.Context r9 = r1.getContext()
            java.lang.String r10 = "隐藏名单保存失败"
            android.widget.Toast r9 = android.widget.Toast.makeText(r9, r10, r0)
            r9.show()
            goto L201
        L1d4:
            android.content.Context r9 = r1.getContext()
            java.lang.String r10 = "当前账号尚未识别"
            android.widget.Toast r9 = android.widget.Toast.makeText(r9, r10, r0)
            r9.show()
            goto L201
        L1e2:
            android.content.Context r9 = r1.getContext()
            java.lang.String r10 = "该联系人已隐藏"
            android.widget.Toast r9 = android.widget.Toast.makeText(r9, r10, r0)
            r9.show()
            goto L201
        L1f0:
            android.content.Context r10 = r1.getContext()
            java.lang.String r11 = "已隐藏 "
            java.lang.String r9 = r11.concat(r9)
            android.widget.Toast r9 = android.widget.Toast.makeText(r10, r9, r0)
            r9.show()
        L201:
            return
        L202:
            java.lang.Object r10 = r9.f3090
            android.app.Activity r10 = (android.app.Activity) r10
            java.lang.Object r11 = r9.f3091
            xg1 r11 = (p000.xg1) r11
            java.lang.Object r9 = r9.f3092
            android.net.Uri r9 = (android.net.Uri) r9
            java.lang.String r0 = "正在发送 SAF 图片"
            z7 r1 = new z7
            r2 = 13
            r1.<init>(r10, r11, r9, r2)
            p000.wg1.m6380(r10, r0, r1)
            return
        L21b:
            java.lang.Object r10 = r9.f3090
            android.app.Activity r10 = (android.app.Activity) r10
            java.lang.Object r11 = r9.f3091
            yg1 r11 = (p000.yg1) r11
            java.lang.Object r9 = r9.f3092
            android.widget.EditText r9 = (android.widget.EditText) r9
            java.lang.String r0 = "正在按任务数量发送文本"
            z7 r1 = new z7
            r2 = 12
            r1.<init>(r10, r11, r9, r2)
            p000.wg1.m6380(r10, r0, r1)
            return
        L234:
            java.lang.Object r10 = r9.f3090
            xd0 r10 = (p000.xd0) r10
            java.lang.Object r1 = r9.f3091
            nd0 r1 = (p000.nd0) r1
            java.lang.Object r9 = r9.f3092
            java.lang.String r9 = (java.lang.String) r9
            be0 r2 = p000.be0.f1670
            monitor-enter(r2)
            r2.m937()     // Catch: java.lang.Throwable -> L254
            java.lang.String r3 = p000.be0.m929()     // Catch: java.lang.Throwable -> L254
            int r3 = r3.length()     // Catch: java.lang.Throwable -> L254
            if (r3 != 0) goto L256
            yd0 r10 = p000.yd0.f12584     // Catch: java.lang.Throwable -> L254
            monitor-exit(r2)
            goto L27e
        L254:
            r9 = move-exception
            goto L2a2
        L256:
            java.util.List r3 = r2.m943()     // Catch: java.lang.Throwable -> L254
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L254
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L254
            θ r3 = new θ     // Catch: java.lang.Throwable -> L254
            r5 = 16
            r3.<init>(r5, r10)     // Catch: java.lang.Throwable -> L254
            boolean r10 = p000.AbstractC0984xh.m6653(r4, r3)     // Catch: java.lang.Throwable -> L254
            if (r10 != 0) goto L270
            yd0 r10 = p000.yd0.f12583     // Catch: java.lang.Throwable -> L254
            monitor-exit(r2)
            goto L27e
        L270:
            java.lang.String r10 = "remove"
            boolean r10 = r2.m942(r10, r4)     // Catch: java.lang.Throwable -> L254
            if (r10 == 0) goto L27b
            yd0 r10 = p000.yd0.f12581     // Catch: java.lang.Throwable -> L254
            goto L27d
        L27b:
            yd0 r10 = p000.yd0.f12586     // Catch: java.lang.Throwable -> L254
        L27d:
            monitor-exit(r2)
        L27e:
            int r10 = r10.ordinal()
            r2 = 2
            if (r10 == r2) goto L297
            if (r10 == r11) goto L28b
            r1.m4030()
            goto L2a1
        L28b:
            android.app.Activity r9 = r1.f7534
            java.lang.String r10 = "隐藏名单保存失败"
            android.widget.Toast r9 = android.widget.Toast.makeText(r9, r10, r0)
            r9.show()
            goto L2a1
        L297:
            r1.m4030()
            android.app.Activity r10 = r1.f7534
            java.lang.String r11 = "已恢复 "
            p000.a12.m21(r0, r10, r11, r9)
        L2a1:
            return
        L2a2:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L254
            throw r9
    }
}
