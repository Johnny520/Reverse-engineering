package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ha2 extends android.app.Fragment {

    /* JADX INFO: renamed from: ε */
    public p000.C0391ic f4671;

    public ha2() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int r9, int r10, android.content.Intent r11) {
            r8 = this;
            super.onActivityResult(r9, r10, r11)
            r0 = 1005(0x3ed, float:1.408E-42)
            if (r9 == r0) goto L8
            return
        L8:
            r9 = -1
            r1 = 0
            if (r10 != r9) goto La5
            if (r11 == 0) goto L13
            android.net.Uri r9 = r11.getData()
            goto L14
        L13:
            r9 = r1
        L14:
            if (r9 != 0) goto L18
            goto La5
        L18:
            android.app.Activity r9 = r8.getActivity()
            android.net.Uri r3 = r11.getData()
            if (r9 == 0) goto L9a
            if (r3 != 0) goto L26
            goto L9a
        L26:
            int r10 = r11.getFlags()     // Catch: java.lang.Throwable -> L36
            android.content.ContentResolver r11 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L36
            r10 = r10 & 1
            r11.takePersistableUriPermission(r3, r10)     // Catch: java.lang.Throwable -> L36
            s62 r10 = p000.s62.f9751     // Catch: java.lang.Throwable -> L36
            goto L3e
        L36:
            r0 = move-exception
            r10 = r0
            eo1 r11 = new eo1
            r11.<init>(r10)
            r10 = r11
        L3e:
            java.lang.Throwable r10 = p000.fo1.m2190(r10)
            if (r10 == 0) goto L4b
            java.lang.String r11 = "DYHelper"
            java.lang.String r0 = "持久化 MP3 URI 读取权限失败"
            p000.C0888ux.m5977(r11, r0, r10)
        L4b:
            ic r10 = r8.f4671
            if (r10 == 0) goto L96
            java.lang.String r11 = "_display_name"
            android.content.ContentResolver r2 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L7b
            java.lang.String[] r4 = new java.lang.String[]{r11}     // Catch: java.lang.Throwable -> L7b
            r6 = 0
            r7 = 0
            r5 = 0
            android.database.Cursor r9 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L7b
            if (r9 == 0) goto L84
            boolean r0 = r9.moveToFirst()     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L76
            int r11 = r9.getColumnIndex(r11)     // Catch: java.lang.Throwable -> L73
            if (r11 < 0) goto L76
            java.lang.String r11 = r9.getString(r11)     // Catch: java.lang.Throwable -> L73
            goto L77
        L73:
            r0 = move-exception
            r11 = r0
            goto L7e
        L76:
            r11 = r1
        L77:
            r9.close()     // Catch: java.lang.Throwable -> L7b
            goto L8b
        L7b:
            r0 = move-exception
            r9 = r0
            goto L86
        L7e:
            throw r11     // Catch: java.lang.Throwable -> L7f
        L7f:
            r0 = move-exception
            p000.AbstractC0978xb.m6584(r9, r11)     // Catch: java.lang.Throwable -> L7b
            throw r0     // Catch: java.lang.Throwable -> L7b
        L84:
            r11 = r1
            goto L8b
        L86:
            eo1 r11 = new eo1
            r11.<init>(r9)
        L8b:
            boolean r9 = r11 instanceof p000.eo1
            if (r9 == 0) goto L90
            goto L91
        L90:
            r1 = r11
        L91:
            java.lang.String r1 = (java.lang.String) r1
            r10.invoke(r3, r1)
        L96:
            r8.m2481()
            return
        L9a:
            ic r9 = r8.f4671
            if (r9 == 0) goto La1
            r9.invoke(r1, r1)
        La1:
            r8.m2481()
            return
        La5:
            ic r9 = r8.f4671
            if (r9 == 0) goto Lac
            r9.invoke(r1, r1)
        Lac:
            r8.m2481()
            return
    }

    @Override // android.app.Fragment
    public final void onCreate(android.os.Bundle r4) {
            r3 = this;
            super.onCreate(r4)
            android.content.Intent r4 = new android.content.Intent
            java.lang.String r0 = "android.intent.action.OPEN_DOCUMENT"
            r4.<init>(r0)
            java.lang.String r0 = "android.intent.category.OPENABLE"
            r4.addCategory(r0)
            java.lang.String r0 = "audio/mpeg"
            r4.setType(r0)
            r1 = 1
            r4.addFlags(r1)
            r1 = 64
            r4.addFlags(r1)
            java.lang.String r1 = "audio/mp3"
            java.lang.String r2 = "audio/*"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2}
            java.lang.String r1 = "android.intent.extra.MIME_TYPES"
            r4.putExtra(r1, r0)
            r0 = 1005(0x3ed, float:1.408E-42)
            r3.startActivityForResult(r4, r0)     // Catch: java.lang.Throwable -> L30
            return
        L30:
            r4 = move-exception
            java.lang.String r0 = "DYHelper"
            java.lang.String r1 = "打开 MP3 文件选择器失败"
            p000.C0888ux.m5977(r0, r1, r4)
            ic r4 = r3.f4671
            if (r4 == 0) goto L40
            r0 = 0
            r4.invoke(r0, r0)
        L40:
            r3.m2481()
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m2481() {
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
