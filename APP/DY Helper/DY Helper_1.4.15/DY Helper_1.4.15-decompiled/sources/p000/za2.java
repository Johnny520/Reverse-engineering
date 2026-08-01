package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class za2 extends android.app.Fragment {

    /* JADX INFO: renamed from: ε */
    public p000.C1054zd f13021;

    public za2() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int r12, int r13, android.content.Intent r14) {
            r11 = this;
            r1 = 0
            java.lang.Long r3 = java.lang.Long.valueOf(r1)
            super.onActivityResult(r12, r13, r14)
            r0 = 1905(0x771, float:2.67E-42)
            if (r12 == r0) goto Le
            return
        Le:
            android.app.Activity r12 = r11.getActivity()
            r4 = 0
            if (r14 == 0) goto L1b
            android.net.Uri r0 = r14.getData()
            r6 = r0
            goto L1c
        L1b:
            r6 = r4
        L1c:
            r0 = -1
            if (r13 != r0) goto Le4
            if (r12 == 0) goto Le4
            if (r6 != 0) goto L25
            goto Le4
        L25:
            int r13 = r14.getFlags()     // Catch: java.lang.Throwable -> L35
            android.content.ContentResolver r14 = r12.getContentResolver()     // Catch: java.lang.Throwable -> L35
            r13 = r13 & 1
            r14.takePersistableUriPermission(r6, r13)     // Catch: java.lang.Throwable -> L35
            s62 r13 = p000.s62.f9751     // Catch: java.lang.Throwable -> L35
            goto L3d
        L35:
            r0 = move-exception
            r13 = r0
            eo1 r14 = new eo1
            r14.<init>(r13)
            r13 = r14
        L3d:
            java.lang.Throwable r13 = p000.fo1.m2190(r13)
            if (r13 == 0) goto L4a
            java.lang.String r14 = "rb360b99c73f2f647"
            java.lang.String r0 = "持久化音频 URI 读取权限失败"
            p000.C0888ux.m5977(r14, r0, r13)
        L4a:
            zd r13 = r11.f13021
            if (r13 == 0) goto Le0
            ib2 r14 = p000.ib2.f4981
            java.lang.String r14 = "_display_name"
            android.content.ContentResolver r5 = r12.getContentResolver()     // Catch: java.lang.Throwable -> L7d
            java.lang.String[] r7 = new java.lang.String[]{r14}     // Catch: java.lang.Throwable -> L7d
            r9 = 0
            r10 = 0
            r8 = 0
            android.database.Cursor r5 = r5.query(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L7d
            if (r5 == 0) goto L86
            boolean r0 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L76
            if (r0 != 0) goto L6b
        L69:
            r14 = r4
            goto L79
        L6b:
            int r14 = r5.getColumnIndex(r14)     // Catch: java.lang.Throwable -> L76
            if (r14 < 0) goto L69
            java.lang.String r14 = r5.getString(r14)     // Catch: java.lang.Throwable -> L76
            goto L79
        L76:
            r0 = move-exception
            r14 = r0
            goto L80
        L79:
            r5.close()     // Catch: java.lang.Throwable -> L7d
            goto L8e
        L7d:
            r0 = move-exception
            r14 = r0
            goto L88
        L80:
            throw r14     // Catch: java.lang.Throwable -> L81
        L81:
            r0 = move-exception
            p000.AbstractC0978xb.m6584(r5, r14)     // Catch: java.lang.Throwable -> L7d
            throw r0     // Catch: java.lang.Throwable -> L7d
        L86:
            r14 = r4
            goto L8e
        L88:
            eo1 r0 = new eo1
            r0.<init>(r14)
            r14 = r0
        L8e:
            boolean r0 = r14 instanceof p000.eo1
            if (r0 == 0) goto L93
            goto L94
        L93:
            r4 = r14
        L94:
            java.lang.String r4 = (java.lang.String) r4
            ib2 r14 = p000.ib2.f4981
            android.media.MediaMetadataRetriever r14 = new android.media.MediaMetadataRetriever     // Catch: java.lang.Throwable -> Lc0
            r14.<init>()     // Catch: java.lang.Throwable -> Lc0
            r14.setDataSource(r12, r6)     // Catch: java.lang.Throwable -> Lb5
            r12 = 9
            java.lang.String r12 = r14.extractMetadata(r12)     // Catch: java.lang.Throwable -> Lb5
            if (r12 == 0) goto Lb8
            r0 = 10
            java.lang.Long r12 = p000.x02.m6489(r12, r0)     // Catch: java.lang.Throwable -> Lb5
            if (r12 == 0) goto Lb8
            long r1 = r12.longValue()     // Catch: java.lang.Throwable -> Lb5
            goto Lb8
        Lb5:
            r0 = move-exception
            r12 = r0
            goto Lc3
        Lb8:
            r14.release()     // Catch: java.lang.Throwable -> Lc0
            java.lang.Long r12 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> Lc0
            goto Lcd
        Lc0:
            r0 = move-exception
            r12 = r0
            goto Lc7
        Lc3:
            r14.release()     // Catch: java.lang.Throwable -> Lc0
            throw r12     // Catch: java.lang.Throwable -> Lc0
        Lc7:
            eo1 r14 = new eo1
            r14.<init>(r12)
            r12 = r14
        Lcd:
            boolean r14 = r12 instanceof p000.eo1
            if (r14 == 0) goto Ld2
            goto Ld3
        Ld2:
            r3 = r12
        Ld3:
            java.lang.Number r3 = (java.lang.Number) r3
            long r0 = r3.longValue()
            java.lang.Long r12 = java.lang.Long.valueOf(r0)
            r13.mo10(r6, r4, r12)
        Le0:
            r11.m7120()
            return
        Le4:
            zd r12 = r11.f13021
            if (r12 == 0) goto Leb
            r12.mo10(r4, r4, r3)
        Leb:
            r11.m7120()
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
            java.lang.String r0 = "audio/*"
            r4.setType(r0)
            r1 = 1
            r4.addFlags(r1)
            r1 = 64
            r4.addFlags(r1)
            java.lang.String r1 = "audio/mpeg"
            java.lang.String r2 = "audio/mp3"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r0}
            java.lang.String r1 = "android.intent.extra.MIME_TYPES"
            r4.putExtra(r1, r0)
            r0 = 1905(0x771, float:2.67E-42)
            r3.startActivityForResult(r4, r0)     // Catch: java.lang.Throwable -> L32
            s62 r4 = p000.s62.f9751     // Catch: java.lang.Throwable -> L32
            goto L39
        L32:
            r4 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r4)
            r4 = r0
        L39:
            java.lang.Throwable r4 = p000.fo1.m2190(r4)
            if (r4 == 0) goto L57
            java.lang.String r0 = "rb360b99c73f2f647"
            java.lang.String r1 = "打开音频文件选择器失败"
            p000.C0888ux.m5977(r0, r1, r4)
            zd r4 = r3.f13021
            if (r4 == 0) goto L54
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r1 = 0
            r4.mo10(r1, r1, r0)
        L54:
            r3.m7120()
        L57:
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m7120() {
            r1 = this;
            android.app.FragmentManager r0 = r1.getFragmentManager()     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L15
            android.app.FragmentTransaction r0 = r0.beginTransaction()     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L15
            android.app.FragmentTransaction r1 = r0.remove(r1)     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L15
            r1.commitAllowingStateLoss()     // Catch: java.lang.Throwable -> L15
        L15:
            return
    }
}
