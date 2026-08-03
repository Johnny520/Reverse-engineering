package ca;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1546g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f1547h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ca.e0 f1548i;

    public /* synthetic */ o(android.app.Activity r2, ca.e0 r3) {
            r1 = this;
            r0 = 1
            r1.f1546g = r0
            r1.<init>()
            r1.f1547h = r2
            r1.f1548i = r3
            return
    }

    public /* synthetic */ o(ca.e0 r1, android.app.Activity r2, int r3) {
            r0 = this;
            r0.f1546g = r3
            r0.f1548i = r1
            r0.f1547h = r2
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.f1546g
            switch(r0) {
                case 0: goto L1a8;
                case 1: goto L120;
                case 2: goto L9e;
                default: goto L5;
            }
        L5:
            p8.c r9 = (p8.c) r9
            r9.getClass()
            ca.e0 r0 = r8.f1548i
            androidx.lifecycle.x r1 = r0.f1495o
            r1.getClass()
            android.app.Activity r2 = r8.f1547h
            r2.getClass()
            java.lang.String r3 = r9.f10316a
            java.lang.String r4 = r9.f10318c
            boolean r5 = og.m.t0(r4)
            if (r5 != 0) goto L39
            java.io.File r9 = new java.io.File
            r9.<init>(r4)
            boolean r4 = r9.isFile()
            if (r4 != 0) goto L2e
            java.lang.String r9 = "朋友圈视频文件不存在"
            goto L96
        L2e:
            java.util.List r9 = a.a.x0(r9)
            java.lang.String r4 = "video/*"
            java.lang.String r9 = r1.Y(r2, r9, r4, r3)
            goto L96
        L39:
            java.util.ArrayList r4 = r9.b()
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L90
            java.util.ArrayList r9 = r9.b()
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = tf.n.e1(r9)
            r4.<init>(r5)
            java.util.Iterator r9 = r9.iterator()
        L54:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L69
            java.lang.Object r5 = r9.next()
            java.lang.String r5 = (java.lang.String) r5
            java.io.File r6 = new java.io.File
            r6.<init>(r5)
            r4.add(r6)
            goto L54
        L69:
            boolean r9 = r4.isEmpty()
            if (r9 == 0) goto L70
            goto L89
        L70:
            java.util.Iterator r9 = r4.iterator()
        L74:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L89
            java.lang.Object r5 = r9.next()
            java.io.File r5 = (java.io.File) r5
            boolean r5 = r5.isFile()
            if (r5 != 0) goto L74
            java.lang.String r9 = "部分朋友圈图片文件不存在"
            goto L96
        L89:
            java.lang.String r9 = "image/*"
            java.lang.String r9 = r1.Y(r2, r4, r9, r3)
            goto L96
        L90:
            java.lang.String r9 = "朋友圈内容为空"
            java.lang.String r9 = androidx.lifecycle.x.a0(r2, r3, r9)
        L96:
            if (r9 == 0) goto L9b
            r0.r(r2, r9)
        L9b:
            sf.n r9 = sf.n.f12433a
            return r9
        L9e:
            p8.c r9 = (p8.c) r9
            r9.getClass()
            ca.e0 r0 = r8.f1548i
            r0.getClass()
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            android.app.Activity r2 = r8.f1547h
            java.lang.String r3 = r2.getPackageName()
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.SnsUploadUI"
            android.content.Intent r1 = r1.setClassName(r3, r4)
            r1.getClass()
            java.lang.String r3 = r9.f10318c
            java.lang.String r4 = r9.f10316a
            boolean r5 = og.m.t0(r3)
            java.lang.String r6 = "Ksnsupload_type"
            java.lang.String r7 = "Kdescription"
            if (r5 != 0) goto Ldf
            r5 = 14
            r1.putExtra(r6, r5)
            java.lang.String r5 = "KSightPath"
            r1.putExtra(r5, r3)
            java.lang.String r3 = "KSightThumbPath"
            java.lang.String r9 = r9.f10319d
            r1.putExtra(r3, r9)
            r1.putExtra(r7, r4)
            goto L114
        Ldf:
            java.util.ArrayList r3 = r9.b()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L106
            java.util.List r3 = r9.f10317b
            boolean r3 = r0.l(r1, r3)
            if (r3 != 0) goto L102
            java.util.ArrayList r9 = r9.b()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            tf.m.N1(r9, r3)
            java.lang.String r9 = "sns_kemdia_path_list"
            r1.putStringArrayListExtra(r9, r3)
        L102:
            r1.putExtra(r7, r4)
            goto L114
        L106:
            boolean r9 = og.m.t0(r4)
            if (r9 != 0) goto L118
            r9 = 9
            r1.putExtra(r6, r9)
            r1.putExtra(r7, r4)
        L114:
            r0.q(r2, r1)
            goto L11d
        L118:
            java.lang.String r9 = "朋友圈内容为空"
            r0.r(r2, r9)
        L11d:
            sf.n r9 = sf.n.f12433a
            return r9
        L120:
            ca.z r9 = (ca.z) r9
            r9.getClass()
            java.lang.String r0 = r9.f1606c
            int r1 = r9.f1604a
            r2 = 1
            android.app.Activity r3 = r8.f1547h
            java.lang.String r4 = "Ksnsupload_type"
            r5 = 4
            r6 = 2
            java.lang.String r7 = "com.tencent.mm.plugin.sns.ui.SnsUploadUI"
            if (r1 == r2) goto L176
            r9 = 0
            if (r1 == r6) goto L159
            if (r1 == r5) goto L13a
            goto L190
        L13a:
            if (r0 == 0) goto L190
            android.content.Intent r9 = new android.content.Intent
            r9.<init>()
            java.lang.String r2 = r3.getPackageName()
            android.content.Intent r9 = r9.setClassName(r2, r7)
            r2 = 14
            r9.putExtra(r4, r2)
            java.lang.String r2 = "KSightPath"
            r9.putExtra(r2, r0)
            java.lang.String r2 = "KSightThumbPath"
            r9.putExtra(r2, r0)
            goto L190
        L159:
            if (r0 == 0) goto L190
            android.content.Intent r9 = new android.content.Intent
            r9.<init>()
            java.lang.String r2 = r3.getPackageName()
            android.content.Intent r9 = r9.setClassName(r2, r7)
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.ArrayList r0 = a.a.k(r0)
            java.lang.String r2 = "sns_kemdia_path_list"
            r9.putStringArrayListExtra(r2, r0)
            goto L190
        L176:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r2 = r3.getPackageName()
            android.content.Intent r0 = r0.setClassName(r2, r7)
            r2 = 9
            r0.putExtra(r4, r2)
            java.lang.String r2 = "Kdescription"
            java.lang.String r9 = r9.f1605b
            r0.putExtra(r2, r9)
            r9 = r0
        L190:
            ca.e0 r0 = r8.f1548i
            if (r9 != 0) goto L1a2
            if (r1 == r6) goto L19c
            if (r1 != r5) goto L199
            goto L19c
        L199:
            java.lang.String r9 = "该收藏类型暂不支持转发到朋友圈"
            goto L19e
        L19c:
            java.lang.String r9 = "收藏媒体文件不存在"
        L19e:
            r0.r(r3, r9)
            goto L1a5
        L1a2:
            r0.q(r3, r9)
        L1a5:
            sf.n r9 = sf.n.f12433a
            return r9
        L1a8:
            ca.z r9 = (ca.z) r9
            r9.getClass()
            ca.e0 r0 = r8.f1548i
            androidx.lifecycle.x r1 = r0.f1495o
            int r2 = r9.f1604a
            java.lang.String r3 = r9.f1605b
            java.lang.String r9 = r9.f1606c
            r1.getClass()
            r3.getClass()
            r4 = 1
            android.app.Activity r5 = r8.f1547h
            if (r2 != r4) goto L1c9
            java.lang.String r9 = "收藏内容为空"
            java.lang.String r9 = androidx.lifecycle.x.a0(r5, r3, r9)
            goto L1fe
        L1c9:
            r3 = 2
            if (r2 == r3) goto L1d2
            r4 = 4
            if (r2 == r4) goto L1d2
            java.lang.String r9 = "该收藏类型暂不支持系统分享"
            goto L1fe
        L1d2:
            java.lang.String r4 = "收藏文件不存在"
            if (r9 == 0) goto L1eb
            boolean r6 = og.m.t0(r9)
            if (r6 != 0) goto L1dd
            goto L1de
        L1dd:
            r9 = 0
        L1de:
            if (r9 == 0) goto L1eb
            java.io.File r6 = new java.io.File
            r6.<init>(r9)
            boolean r9 = r6.isFile()
            if (r9 != 0) goto L1ed
        L1eb:
            r9 = r4
            goto L1fe
        L1ed:
            if (r2 != r3) goto L1f2
            java.lang.String r9 = "image/*"
            goto L1f4
        L1f2:
            java.lang.String r9 = "video/*"
        L1f4:
            java.util.List r2 = a.a.x0(r6)
            java.lang.String r3 = ""
            java.lang.String r9 = r1.Y(r5, r2, r9, r3)
        L1fe:
            if (r9 == 0) goto L203
            r0.r(r5, r9)
        L203:
            sf.n r9 = sf.n.f12433a
            return r9
    }
}
