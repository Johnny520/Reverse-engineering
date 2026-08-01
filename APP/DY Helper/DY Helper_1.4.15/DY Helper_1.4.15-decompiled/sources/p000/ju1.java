package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ju1 extends android.app.Fragment {

    /* JADX INFO: renamed from: ε */
    public java.lang.String f5587;

    /* JADX INFO: renamed from: ζ */
    public p000.it1 f5588;

    public ju1() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int r5, int r6, android.content.Intent r7) {
            r4 = this;
            java.lang.String r0 = "DYHelper"
            java.lang.String r1 = "导出失败: "
            java.lang.String r2 = "日志导出成功: "
            super.onActivityResult(r5, r6, r7)
            r3 = 1001(0x3e9, float:1.403E-42)
            if (r5 == r3) goto Lf
            goto L110
        Lf:
            r5 = -1
            if (r6 != r5) goto Lf0
            if (r7 != 0) goto L16
            goto Lf0
        L16:
            android.net.Uri r5 = r7.getData()
            java.lang.String r6 = r4.f5587
            if (r5 == 0) goto Lcf
            if (r6 != 0) goto L22
            goto Lcf
        L22:
            android.app.Activity r7 = r4.getActivity()     // Catch: java.lang.Throwable -> L47
            if (r7 == 0) goto L50
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch: java.lang.Throwable -> L47
            if (r7 == 0) goto L50
            java.io.OutputStream r7 = r7.openOutputStream(r5)     // Catch: java.lang.Throwable -> L47
            if (r7 == 0) goto L50
            java.nio.charset.Charset r3 = p000.AbstractC0547mf.f7105     // Catch: java.lang.Throwable -> L49
            byte[] r6 = r6.getBytes(r3)     // Catch: java.lang.Throwable -> L49
            r6.getClass()     // Catch: java.lang.Throwable -> L49
            r7.write(r6)     // Catch: java.lang.Throwable -> L49
            r7.flush()     // Catch: java.lang.Throwable -> L49
            r7.close()     // Catch: java.lang.Throwable -> L47
            goto L50
        L47:
            r5 = move-exception
            goto L82
        L49:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L4b
        L4b:
            r6 = move-exception
            p000.AbstractC0978xb.m6584(r7, r5)     // Catch: java.lang.Throwable -> L47
            throw r6     // Catch: java.lang.Throwable -> L47
        L50:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L47
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L47
            r6.append(r5)     // Catch: java.lang.Throwable -> L47
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> L47
            r6 = 4
            r7 = 0
            p000.C0888ux.m5988(r0, r5, r7, r6, r7)     // Catch: java.lang.Throwable -> L47
            it1 r5 = r4.f5588     // Catch: java.lang.Throwable -> L47
            if (r5 == 0) goto L6c
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L47
            java.lang.String r7 = "日志导出成功"
            r5.invoke(r6, r7)     // Catch: java.lang.Throwable -> L47
        L6c:
            android.app.FragmentManager r5 = r4.getFragmentManager()
            if (r5 == 0) goto L110
            android.app.FragmentTransaction r5 = r5.beginTransaction()
            if (r5 == 0) goto L110
            android.app.FragmentTransaction r4 = r5.remove(r4)
            if (r4 == 0) goto L110
            r4.commitAllowingStateLoss()
            return
        L82:
            java.lang.String r6 = "写入日志文件失败"
            p000.C0888ux.m5977(r0, r6, r5)     // Catch: java.lang.Throwable -> La1
            it1 r6 = r4.f5588     // Catch: java.lang.Throwable -> La1
            if (r6 == 0) goto La3
            java.lang.Boolean r7 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> La1
            java.lang.String r5 = r5.getMessage()     // Catch: java.lang.Throwable -> La1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La1
            r0.<init>(r1)     // Catch: java.lang.Throwable -> La1
            r0.append(r5)     // Catch: java.lang.Throwable -> La1
            java.lang.String r5 = r0.toString()     // Catch: java.lang.Throwable -> La1
            r6.invoke(r7, r5)     // Catch: java.lang.Throwable -> La1
            goto La3
        La1:
            r5 = move-exception
            goto Lb9
        La3:
            android.app.FragmentManager r5 = r4.getFragmentManager()
            if (r5 == 0) goto L110
            android.app.FragmentTransaction r5 = r5.beginTransaction()
            if (r5 == 0) goto L110
            android.app.FragmentTransaction r4 = r5.remove(r4)
            if (r4 == 0) goto L110
            r4.commitAllowingStateLoss()
            goto L110
        Lb9:
            android.app.FragmentManager r6 = r4.getFragmentManager()
            if (r6 == 0) goto Lce
            android.app.FragmentTransaction r6 = r6.beginTransaction()
            if (r6 == 0) goto Lce
            android.app.FragmentTransaction r4 = r6.remove(r4)
            if (r4 == 0) goto Lce
            r4.commitAllowingStateLoss()
        Lce:
            throw r5
        Lcf:
            it1 r5 = r4.f5588
            if (r5 == 0) goto Lda
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            java.lang.String r7 = "导出失败：数据为空"
            r5.invoke(r6, r7)
        Lda:
            android.app.FragmentManager r5 = r4.getFragmentManager()
            if (r5 == 0) goto L110
            android.app.FragmentTransaction r5 = r5.beginTransaction()
            if (r5 == 0) goto L110
            android.app.FragmentTransaction r4 = r5.remove(r4)
            if (r4 == 0) goto L110
            r4.commitAllowingStateLoss()
            return
        Lf0:
            it1 r5 = r4.f5588
            if (r5 == 0) goto Lfb
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            java.lang.String r7 = "导出取消"
            r5.invoke(r6, r7)
        Lfb:
            android.app.FragmentManager r5 = r4.getFragmentManager()
            if (r5 == 0) goto L110
            android.app.FragmentTransaction r5 = r5.beginTransaction()
            if (r5 == 0) goto L110
            android.app.FragmentTransaction r4 = r5.remove(r4)
            if (r4 == 0) goto L110
            r4.commitAllowingStateLoss()
        L110:
            return
    }
}
