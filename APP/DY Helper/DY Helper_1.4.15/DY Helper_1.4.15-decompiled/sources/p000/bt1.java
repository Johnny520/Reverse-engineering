package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class bt1 extends android.app.Fragment {

    /* JADX INFO: renamed from: ε */
    public int f1835;

    /* JADX INFO: renamed from: ζ */
    public java.lang.String f1836;

    /* JADX INFO: renamed from: η */
    public p000.e80 f1837;

    public bt1() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f1835 = r0
            return
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int r23, int r24, android.content.Intent r25) {
            r22 = this;
            r1 = r22
            r0 = r23
            java.lang.String r2 = "DYHelper"
            java.lang.String r3 = "操作失败: "
            java.lang.String r4 = "用户配置导出成功: "
            java.lang.String r5 = "用户配置导入失败项: "
            java.lang.String r6 = "导入完成但有 "
            java.lang.String r7 = "用户配置导入成功："
            super.onActivityResult(r23, r24, r25)
            r8 = 1003(0x3eb, float:1.406E-42)
            if (r0 == r8) goto L1c
            r9 = 1004(0x3ec, float:1.407E-42)
            if (r0 == r9) goto L1c
            return
        L1c:
            r9 = -1
            r10 = 1
            r11 = r24
            if (r11 != r9) goto L185
            r9 = 0
            if (r25 == 0) goto L2a
            android.net.Uri r11 = r25.getData()
            goto L2b
        L2a:
            r11 = r9
        L2b:
            if (r11 != 0) goto L2f
            goto L185
        L2f:
            android.app.Activity r11 = r1.getActivity()
            android.net.Uri r12 = r25.getData()
            if (r11 == 0) goto L176
            if (r12 != 0) goto L3d
            goto L176
        L3d:
            int r13 = r1.f1835     // Catch: java.lang.Throwable -> L84
            r14 = 4
            if (r13 == r10) goto Lfd
            if (r0 != r8) goto L46
            goto Lfd
        L46:
            android.content.ContentResolver r0 = r11.getContentResolver()     // Catch: java.lang.Throwable -> L84
            java.io.InputStream r4 = r0.openInputStream(r12)     // Catch: java.lang.Throwable -> L84
            if (r4 == 0) goto Lf5
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> Led
            java.io.ByteArrayOutputStream r8 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> Led
            int r10 = r4.available()     // Catch: java.lang.Throwable -> Led
            r12 = 8192(0x2000, float:1.148E-41)
            int r10 = java.lang.Math.max(r12, r10)     // Catch: java.lang.Throwable -> Led
            r8.<init>(r10)     // Catch: java.lang.Throwable -> Led
            p000.h62.m2364(r4, r8, r12)     // Catch: java.lang.Throwable -> Led
            byte[] r8 = r8.toByteArray()     // Catch: java.lang.Throwable -> Led
            r8.getClass()     // Catch: java.lang.Throwable -> Led
            java.nio.charset.Charset r10 = p000.AbstractC0547mf.f7105     // Catch: java.lang.Throwable -> Led
            r0.<init>(r8, r10)     // Catch: java.lang.Throwable -> Led
            r4.close()     // Catch: java.lang.Throwable -> L84
            boolean r4 = p000.ui1.m5867()     // Catch: java.lang.Throwable -> L84
            if (r4 != 0) goto L87
            android.content.Context r4 = r11.getApplicationContext()     // Catch: java.lang.Throwable -> L84
            r4.getClass()     // Catch: java.lang.Throwable -> L84
            p000.ui1.m5896(r4)     // Catch: java.lang.Throwable -> L84
            goto L87
        L84:
            r0 = move-exception
            goto L14d
        L87:
            ti1 r0 = p000.ui1.m5895(r0)     // Catch: java.lang.Throwable -> L84
            java.util.List r15 = r0.f10394     // Catch: java.lang.Throwable -> L84
            boolean r4 = r0.f10391     // Catch: java.lang.Throwable -> L84
            e80 r8 = r1.f1837
            if (r4 == 0) goto Lb9
            if (r8 == 0) goto L139
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L84
            int r5 = r0.f10392     // Catch: java.lang.Throwable -> L84
            int r0 = r0.f10393     // Catch: java.lang.Throwable -> L84
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L84
            r6.append(r5)     // Catch: java.lang.Throwable -> L84
            java.lang.String r5 = " 个配置文件，"
            r6.append(r5)     // Catch: java.lang.Throwable -> L84
            r6.append(r0)     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = " 个选项"
            r6.append(r0)     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L84
            r8.invoke(r4, r0)     // Catch: java.lang.Throwable -> L84
            goto L139
        Lb9:
            if (r8 == 0) goto Ld5
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L84
            int r4 = r15.size()     // Catch: java.lang.Throwable -> L84
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L84
            r7.append(r4)     // Catch: java.lang.Throwable -> L84
            java.lang.String r4 = " 项失败，请查看 DyLog"
            r7.append(r4)     // Catch: java.lang.Throwable -> L84
            java.lang.String r4 = r7.toString()     // Catch: java.lang.Throwable -> L84
            r8.invoke(r0, r4)     // Catch: java.lang.Throwable -> L84
        Ld5:
            java.lang.String r16 = "; "
            r20 = 0
            r21 = 62
            r17 = 0
            r18 = 0
            r19 = 0
            java.lang.String r0 = p000.AbstractC0984xh.m6644(r15, r16, r17, r18, r19, r20, r21)     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = r5.concat(r0)     // Catch: java.lang.Throwable -> L84
            p000.C0888ux.m5988(r2, r0, r9, r14, r9)     // Catch: java.lang.Throwable -> L84
            goto L139
        Led:
            r0 = move-exception
            r5 = r0
            throw r5     // Catch: java.lang.Throwable -> Lf0
        Lf0:
            r0 = move-exception
            p000.AbstractC0978xb.m6584(r4, r5)     // Catch: java.lang.Throwable -> L84
            throw r0     // Catch: java.lang.Throwable -> L84
        Lf5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L84
            java.lang.String r4 = "无法读取文件"
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L84
            throw r0     // Catch: java.lang.Throwable -> L84
        Lfd:
            java.lang.String r0 = r1.f1836     // Catch: java.lang.Throwable -> L84
            if (r0 != 0) goto L103
            java.lang.String r0 = ""
        L103:
            android.content.ContentResolver r5 = r11.getContentResolver()     // Catch: java.lang.Throwable -> L84
            java.io.OutputStream r5 = r5.openOutputStream(r12)     // Catch: java.lang.Throwable -> L84
            if (r5 == 0) goto L145
            java.nio.charset.Charset r6 = p000.AbstractC0547mf.f7105     // Catch: java.lang.Throwable -> L13d
            byte[] r0 = r0.getBytes(r6)     // Catch: java.lang.Throwable -> L13d
            r0.getClass()     // Catch: java.lang.Throwable -> L13d
            r5.write(r0)     // Catch: java.lang.Throwable -> L13d
            r5.flush()     // Catch: java.lang.Throwable -> L13d
            r5.close()     // Catch: java.lang.Throwable -> L84
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L84
            r0.append(r12)     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L84
            p000.C0888ux.m5988(r2, r0, r9, r14, r9)     // Catch: java.lang.Throwable -> L84
            e80 r0 = r1.f1837     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L139
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L84
            java.lang.String r5 = "用户配置导出成功"
            r0.invoke(r4, r5)     // Catch: java.lang.Throwable -> L84
        L139:
            r1.m1024()
            return
        L13d:
            r0 = move-exception
            r4 = r0
            throw r4     // Catch: java.lang.Throwable -> L140
        L140:
            r0 = move-exception
            p000.AbstractC0978xb.m6584(r5, r4)     // Catch: java.lang.Throwable -> L84
            throw r0     // Catch: java.lang.Throwable -> L84
        L145:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L84
            java.lang.String r4 = "无法打开输出流"
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L84
            throw r0     // Catch: java.lang.Throwable -> L84
        L14d:
            java.lang.String r4 = "用户配置导入导出失败"
            p000.C0888ux.m5977(r2, r4, r0)     // Catch: java.lang.Throwable -> L16c
            e80 r2 = r1.f1837     // Catch: java.lang.Throwable -> L16c
            if (r2 == 0) goto L16e
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L16c
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L16c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16c
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L16c
            r5.append(r0)     // Catch: java.lang.Throwable -> L16c
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L16c
            r2.invoke(r4, r0)     // Catch: java.lang.Throwable -> L16c
            goto L16e
        L16c:
            r0 = move-exception
            goto L172
        L16e:
            r1.m1024()
            return
        L172:
            r1.m1024()
            throw r0
        L176:
            e80 r0 = r1.f1837
            if (r0 == 0) goto L181
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.lang.String r3 = "操作失败：上下文为空"
            r0.invoke(r2, r3)
        L181:
            r1.m1024()
            return
        L185:
            e80 r0 = r1.f1837
            if (r0 == 0) goto L197
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            int r3 = r1.f1835
            if (r3 != r10) goto L192
            java.lang.String r3 = "导出取消"
            goto L194
        L192:
            java.lang.String r3 = "导入取消"
        L194:
            r0.invoke(r2, r3)
        L197:
            r1.m1024()
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m1024() {
            r1 = this;
            android.app.FragmentManager r0 = r1.getFragmentManager()
            if (r0 == 0) goto L15
            android.app.FragmentTransaction r0 = r0.beginTransaction()
            if (r0 == 0) goto L15
            android.app.FragmentTransaction r1 = r0.remove(r1)
            if (r1 == 0) goto L15
            r1.commitAllowingStateLoss()
        L15:
            return
    }
}
