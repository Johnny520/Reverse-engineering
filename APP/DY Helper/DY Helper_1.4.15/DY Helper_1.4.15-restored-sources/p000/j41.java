package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class j41 {

    /* JADX INFO: renamed from: α */
    public static volatile java.lang.ClassLoader f5313;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.ConcurrentHashMap f5314 = null;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.j41.f5314 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static void m2850(android.content.Context r6, java.util.List r7) {
            java.lang.String r0 = "DYHelper"
            java.util.Iterator r7 = r7.iterator()
        L6:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L9f
            java.lang.Object r1 = r7.next()
            h41 r1 = (p000.h41) r1
            java.lang.String r2 = r1.f4570
            java.lang.CharSequence r2 = p000.q02.m4660(r2)
            java.lang.String r2 = r2.toString()
            boolean r3 = p000.q02.m4671(r2)
            if (r3 != 0) goto L6
            android.net.Uri r3 = android.net.Uri.parse(r2)     // Catch: java.lang.Throwable -> L50
            java.lang.String r4 = r3.getScheme()     // Catch: java.lang.Throwable -> L50
            if (r4 == 0) goto L52
            boolean r4 = p000.q02.m4671(r4)     // Catch: java.lang.Throwable -> L50
            if (r4 == 0) goto L33
            goto L52
        L33:
            android.content.ContentResolver r2 = r6.getContentResolver()     // Catch: java.lang.Throwable -> L50
            r4 = 0
            r2.delete(r3, r4, r4)     // Catch: java.lang.Throwable -> L50
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L50
            r2.<init>()     // Catch: java.lang.Throwable -> L50
            java.lang.String r4 = "[LIVEPHOTO-MERGE-OFFICIAL-CLEAN] uri="
            r2.append(r4)     // Catch: java.lang.Throwable -> L50
            r2.append(r3)     // Catch: java.lang.Throwable -> L50
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L50
            p000.C0888ux.m5975(r0, r2)     // Catch: java.lang.Throwable -> L50
            goto L87
        L50:
            r2 = move-exception
            goto L8a
        L52:
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L50
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L50
            m2851(r6, r3)     // Catch: java.lang.Throwable -> L50
            boolean r2 = r3.exists()     // Catch: java.lang.Throwable -> L50
            if (r2 == 0) goto L63
            r3.delete()     // Catch: java.lang.Throwable -> L50
        L63:
            java.lang.String r2 = r3.getName()     // Catch: java.lang.Throwable -> L50
            boolean r3 = r3.exists()     // Catch: java.lang.Throwable -> L50
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L50
            r4.<init>()     // Catch: java.lang.Throwable -> L50
            java.lang.String r5 = "[LIVEPHOTO-MERGE-OFFICIAL-CLEAN] file="
            r4.append(r5)     // Catch: java.lang.Throwable -> L50
            r4.append(r2)     // Catch: java.lang.Throwable -> L50
            java.lang.String r2 = ", exists="
            r4.append(r2)     // Catch: java.lang.Throwable -> L50
            r4.append(r3)     // Catch: java.lang.Throwable -> L50
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> L50
            p000.C0888ux.m5975(r0, r2)     // Catch: java.lang.Throwable -> L50
        L87:
            s62 r2 = p000.s62.f9751     // Catch: java.lang.Throwable -> L50
            goto L90
        L8a:
            eo1 r3 = new eo1
            r3.<init>(r2)
            r2 = r3
        L90:
            java.lang.Throwable r2 = p000.fo1.m2190(r2)
            if (r2 == 0) goto L6
            java.lang.String r1 = r1.f4571
            java.lang.String r3 = "[LIVEPHOTO-MERGE-OFFICIAL-CLEAN-FAIL] file="
            p000.AbstractC0602nx.m4145(r3, r1, r0, r2)
            goto L6
        L9f:
            return
    }

    /* JADX INFO: renamed from: β */
    public static void m2851(android.content.Context r9, java.io.File r10) {
            java.lang.String r1 = r10.getAbsolutePath()
            java.lang.String r10 = r10.getName()
            android.net.Uri r0 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            android.net.Uri r2 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
            android.net.Uri r3 = android.provider.MediaStore.Downloads.EXTERNAL_CONTENT_URI
            android.net.Uri[] r0 = new android.net.Uri[]{r0, r2, r3}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            java.util.Iterator r2 = r0.iterator()
        L1a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L7e
            java.lang.Object r0 = r2.next()
            r4 = r0
            android.net.Uri r4 = (android.net.Uri) r4
            android.content.ContentResolver r3 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L62
            java.lang.String r0 = "_id"
            java.lang.String[] r5 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L62
            java.lang.String r6 = "_data=? OR _display_name=?"
            java.lang.String[] r7 = new java.lang.String[]{r1, r10}     // Catch: java.lang.Throwable -> L62
            r8 = 0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L62
            r0 = 0
            if (r3 == 0) goto L70
        L3f:
            boolean r5 = r3.moveToNext()     // Catch: java.lang.Throwable -> L59
            if (r5 == 0) goto L5c
            r5 = 0
            long r5 = r3.getLong(r5)     // Catch: java.lang.Throwable -> L59
            android.net.Uri r5 = android.content.ContentUris.withAppendedId(r4, r5)     // Catch: java.lang.Throwable -> L59
            r5.getClass()     // Catch: java.lang.Throwable -> L59
            android.content.ContentResolver r6 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L59
            r6.delete(r5, r0, r0)     // Catch: java.lang.Throwable -> L59
            goto L3f
        L59:
            r0 = move-exception
            r4 = r0
            goto L64
        L5c:
            r3.close()     // Catch: java.lang.Throwable -> L62
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L62
            goto L70
        L62:
            r0 = move-exception
            goto L6a
        L64:
            throw r4     // Catch: java.lang.Throwable -> L65
        L65:
            r0 = move-exception
            p000.AbstractC0978xb.m6584(r3, r4)     // Catch: java.lang.Throwable -> L62
            throw r0     // Catch: java.lang.Throwable -> L62
        L6a:
            eo1 r3 = new eo1
            r3.<init>(r0)
            r0 = r3
        L70:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L1a
            java.lang.String r3 = "DYHelper"
            java.lang.String r4 = "[LIVEPHOTO-MERGE-OFFICIAL-MEDIASTORE-CLEAN-FAIL] file="
            p000.AbstractC0602nx.m4145(r4, r10, r3, r0)
            goto L1a
        L7e:
            return
    }

    /* JADX INFO: renamed from: γ */
    public static void m2852(java.io.File r4, java.lang.String r5) {
            java.io.File r0 = new java.io.File
            java.io.File r1 = r4.getParentFile()
            java.lang.String r2 = r4.getName()
            java.lang.String r3 = ".raw"
            java.lang.String r2 = p000.AbstractC0602nx.m4129(r2, r3)
            r0.<init>(r1, r2)
            m2853(r0, r5)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r5 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L2a
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeFile(r5)     // Catch: java.lang.Throwable -> L2a
            if (r5 != 0) goto L2c
            p000.s30.m5361(r0, r4)     // Catch: java.lang.Throwable -> L2a
            boolean r4 = r0.exists()     // Catch: java.lang.Throwable -> L47
            if (r4 == 0) goto L47
            goto L44
        L2a:
            r4 = move-exception
            goto L4f
        L2c:
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L2a
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L2a
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> L48
            r2 = 100
            r5.compress(r4, r2, r1)     // Catch: java.lang.Throwable -> L48
            r1.close()     // Catch: java.lang.Throwable -> L2a
            r5.recycle()     // Catch: java.lang.Throwable -> L2a
            boolean r4 = r0.exists()     // Catch: java.lang.Throwable -> L47
            if (r4 == 0) goto L47
        L44:
            r0.delete()     // Catch: java.lang.Throwable -> L47
        L47:
            return
        L48:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L4a
        L4a:
            r5 = move-exception
            p000.AbstractC0978xb.m6584(r1, r4)     // Catch: java.lang.Throwable -> L2a
            throw r5     // Catch: java.lang.Throwable -> L2a
        L4f:
            boolean r5 = r0.exists()     // Catch: java.lang.Throwable -> L58
            if (r5 == 0) goto L58
            r0.delete()     // Catch: java.lang.Throwable -> L58
        L58:
            throw r4
    }

    /* JADX INFO: renamed from: δ */
    public static void m2853(java.io.File r4, java.lang.String r5) {
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r4)
            t41 r1 = p000.C0963wx.f11880     // Catch: java.lang.Throwable -> L5c
            java.lang.String r1 = "User-Agent"
            java.lang.String r2 = "Mozilla/5.0"
            l91 r3 = new l91     // Catch: java.lang.Throwable -> L5c
            r3.<init>(r1, r2)     // Catch: java.lang.Throwable -> L5c
            java.util.Map r1 = p000.ex0.m1971(r3)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r2 = "*/*"
            r5.getClass()     // Catch: java.lang.Throwable -> L5c
            r3 = 0
            vx r5 = p000.C0963wx.m6410(r5, r1, r3, r2)     // Catch: java.lang.Throwable -> L5c
            r1 = 131072(0x20000, float:1.83671E-40)
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L2e
        L22:
            java.io.BufferedInputStream r2 = r5.f11459     // Catch: java.lang.Throwable -> L2e
            int r2 = r2.read(r1)     // Catch: java.lang.Throwable -> L2e
            if (r2 <= 0) goto L30
            r0.write(r1, r3, r2)     // Catch: java.lang.Throwable -> L2e
            goto L22
        L2e:
            r4 = move-exception
            goto L58
        L30:
            r0.flush()     // Catch: java.lang.Throwable -> L2e
            r0.close()
            boolean r0 = r4.exists()     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L4c
            long r0 = r4.length()     // Catch: java.lang.Throwable -> L4a
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L4c
            r5.m6283()
            return
        L4a:
            r4 = move-exception
            goto L54
        L4c:
            java.lang.Exception r4 = new java.lang.Exception     // Catch: java.lang.Throwable -> L4a
            java.lang.String r0 = "下载内容为空"
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L4a
            throw r4     // Catch: java.lang.Throwable -> L4a
        L54:
            r5.m6283()
            throw r4
        L58:
            r5.m6283()     // Catch: java.lang.Throwable -> L5c
            throw r4     // Catch: java.lang.Throwable -> L5c
        L5c:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L5e
        L5e:
            r5 = move-exception
            p000.AbstractC0978xb.m6584(r0, r4)
            throw r5
    }

    /* JADX INFO: renamed from: ε */
    public static java.lang.Object m2854(java.lang.Object r7, java.lang.String r8) {
            java.lang.Class r0 = r7.getClass()
            java.lang.reflect.Method[] r0 = r0.getMethods()
            r0.getClass()
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Le:
            r4 = 0
            if (r3 >= r1) goto L35
            r5 = r0[r3]
            java.lang.String r6 = r5.getName()
            boolean r6 = p000.ln0.m3626(r6, r8)
            if (r6 == 0) goto L32
            java.lang.Class[] r6 = r5.getParameterTypes()
            r6.getClass()
            int r6 = r6.length
            if (r6 != 0) goto L32
            int r6 = r5.getModifiers()
            boolean r6 = java.lang.reflect.Modifier.isStatic(r6)
            if (r6 != 0) goto L32
            goto L36
        L32:
            int r3 = r3 + 1
            goto Le
        L35:
            r5 = r4
        L36:
            if (r5 != 0) goto L65
            java.lang.Class r0 = r7.getClass()
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()
            r0.getClass()
            int r1 = r0.length
        L44:
            if (r2 >= r1) goto L61
            r3 = r0[r2]
            java.lang.String r5 = r3.getName()
            boolean r5 = p000.ln0.m3626(r5, r8)
            if (r5 == 0) goto L5e
            java.lang.Class[] r5 = r3.getParameterTypes()
            r5.getClass()
            int r5 = r5.length
            if (r5 != 0) goto L5e
            r5 = r3
            goto L62
        L5e:
            int r2 = r2 + 1
            goto L44
        L61:
            r5 = r4
        L62:
            if (r5 != 0) goto L65
            return r4
        L65:
            r8 = 1
            r5.setAccessible(r8)
            java.lang.Object r7 = r5.invoke(r7, r4)
            return r7
    }

    /* JADX INFO: renamed from: ζ */
    public static boolean m2855(java.lang.reflect.Method r4) {
            java.lang.String r0 = r4.getName()
            java.lang.String r1 = "encodeLivePhoto"
            boolean r0 = p000.ln0.m3626(r0, r1)
            r1 = 0
            if (r0 == 0) goto L40
            java.lang.Class[] r0 = r4.getParameterTypes()
            int r0 = r0.length
            r2 = 3
            if (r0 != r2) goto L40
            java.lang.Class[] r0 = r4.getParameterTypes()
            r0 = r0[r1]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            boolean r0 = p000.ln0.m3626(r0, r2)
            if (r0 == 0) goto L40
            java.lang.Class[] r0 = r4.getParameterTypes()
            r3 = 1
            r0 = r0[r3]
            boolean r0 = p000.ln0.m3626(r0, r2)
            if (r0 == 0) goto L40
            java.lang.Class[] r4 = r4.getParameterTypes()
            r0 = 2
            r4 = r4[r0]
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r4 = p000.ln0.m3626(r4, r0)
            if (r4 == 0) goto L40
            return r3
        L40:
            return r1
    }

    /* JADX INFO: renamed from: η */
    public static p000.i41 m2856(java.lang.Object r10) {
            java.lang.Class r0 = r10.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L9:
            if (r0 == 0) goto L24
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L24
            java.lang.reflect.Field[] r2 = r0.getDeclaredFields()
            int r3 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            java.util.Collections.addAll(r1, r2)
            java.lang.Class r0 = r0.getSuperclass()
            goto L9
        L24:
            java.util.Iterator r0 = r1.iterator()
        L28:
            boolean r2 = r0.hasNext()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L7f
            java.lang.Object r2 = r0.next()
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            r2.setAccessible(r3)     // Catch: java.lang.Throwable -> L44
            java.lang.Object r2 = r2.get(r10)     // Catch: java.lang.Throwable -> L44
            boolean r5 = r2 instanceof java.util.List     // Catch: java.lang.Throwable -> L44
            if (r5 == 0) goto L46
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L44
            goto L47
        L44:
            r2 = move-exception
            goto L66
        L46:
            r2 = r4
        L47:
            if (r2 == 0) goto L64
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L44
            r5.<init>()     // Catch: java.lang.Throwable -> L44
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L44
        L52:
            boolean r6 = r2.hasNext()     // Catch: java.lang.Throwable -> L44
            if (r6 == 0) goto L6b
            java.lang.Object r6 = r2.next()     // Catch: java.lang.Throwable -> L44
            boolean r7 = r6 instanceof java.lang.String     // Catch: java.lang.Throwable -> L44
            if (r7 == 0) goto L52
            r5.add(r6)     // Catch: java.lang.Throwable -> L44
            goto L52
        L64:
            r5 = r4
            goto L6b
        L66:
            eo1 r5 = new eo1
            r5.<init>(r2)
        L6b:
            boolean r2 = r5 instanceof p000.eo1
            if (r2 == 0) goto L70
            r5 = r4
        L70:
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L7b
            boolean r2 = r5.isEmpty()
            if (r2 != 0) goto L7b
            goto L7c
        L7b:
            r5 = r4
        L7c:
            if (r5 == 0) goto L28
            goto L80
        L7f:
            r5 = r4
        L80:
            if (r5 != 0) goto L84
            jz r5 = p000.C0450jz.f5672
        L84:
            java.util.Iterator r0 = r1.iterator()
        L88:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Ld0
            java.lang.Object r2 = r0.next()
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            java.lang.Class r6 = r2.getType()
            java.lang.Class r7 = java.lang.Integer.TYPE
            boolean r6 = p000.ln0.m3626(r6, r7)
            if (r6 != 0) goto Lae
            java.lang.Class r6 = r2.getType()
            java.lang.Class<java.lang.Integer> r7 = java.lang.Integer.class
            boolean r6 = p000.ln0.m3626(r6, r7)
            if (r6 != 0) goto Lae
            r2 = r4
            goto Lcd
        Lae:
            r2.setAccessible(r3)     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r2 = r2.get(r10)     // Catch: java.lang.Throwable -> Lbc
            boolean r6 = r2 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> Lbc
            if (r6 == 0) goto Lbe
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> Lbc
            goto Lc6
        Lbc:
            r2 = move-exception
            goto Lc0
        Lbe:
            r2 = r4
            goto Lc6
        Lc0:
            eo1 r6 = new eo1
            r6.<init>(r2)
            r2 = r6
        Lc6:
            boolean r6 = r2 instanceof p000.eo1
            if (r6 == 0) goto Lcb
            r2 = r4
        Lcb:
            java.lang.Integer r2 = (java.lang.Integer) r2
        Lcd:
            if (r2 == 0) goto L88
            goto Ld1
        Ld0:
            r2 = r4
        Ld1:
            r0 = 0
            if (r2 == 0) goto Ld9
            int r2 = r2.intValue()
            goto L111
        Ld9:
            java.lang.String r2 = r10.toString()
            java.lang.String r6 = "retCode=(-?\\d+)"
            java.util.regex.Pattern r6 = java.util.regex.Pattern.compile(r6)
            r6.getClass()
            r2.getClass()
            java.util.regex.Matcher r6 = r6.matcher(r2)
            r6.getClass()
            ix0 r2 = p000.v71.m6032(r6, r0, r2)
            if (r2 == 0) goto L10f
            java.util.List r2 = r2.m2824()
            java.lang.Object r2 = p000.AbstractC0984xh.m6641(r3, r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L10f
            r6 = 10
            java.lang.Integer r2 = p000.x02.m6487(r2, r6)
            if (r2 == 0) goto L10f
            int r2 = r2.intValue()
            goto L111
        L10f:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L111:
            java.util.Iterator r6 = r1.iterator()
        L115:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L159
            java.lang.Object r7 = r6.next()
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            java.lang.Class r8 = r7.getType()
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            boolean r8 = p000.ln0.m3626(r8, r9)
            if (r8 != 0) goto L12f
        L12d:
            r7 = r4
            goto L156
        L12f:
            r7.setAccessible(r3)     // Catch: java.lang.Throwable -> L13d
            java.lang.Object r7 = r7.get(r10)     // Catch: java.lang.Throwable -> L13d
            boolean r8 = r7 instanceof java.lang.String     // Catch: java.lang.Throwable -> L13d
            if (r8 == 0) goto L13f
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L13d
            goto L147
        L13d:
            r7 = move-exception
            goto L141
        L13f:
            r7 = r4
            goto L147
        L141:
            eo1 r8 = new eo1
            r8.<init>(r7)
            r7 = r8
        L147:
            boolean r8 = r7 instanceof p000.eo1
            if (r8 == 0) goto L14c
            r7 = r4
        L14c:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L12d
            boolean r8 = p000.q02.m4671(r7)
            if (r8 != 0) goto L12d
        L156:
            if (r7 == 0) goto L115
            goto L15a
        L159:
            r7 = r4
        L15a:
            java.util.Iterator r1 = r1.iterator()
        L15e:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L1a6
            java.lang.Object r6 = r1.next()
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6
            java.lang.Class r8 = r6.getType()
            java.lang.Class r9 = java.lang.Boolean.TYPE
            boolean r8 = p000.ln0.m3626(r8, r9)
            if (r8 != 0) goto L184
            java.lang.Class r8 = r6.getType()
            java.lang.Class<java.lang.Boolean> r9 = java.lang.Boolean.class
            boolean r8 = p000.ln0.m3626(r8, r9)
            if (r8 != 0) goto L184
            r6 = r4
            goto L1a3
        L184:
            r6.setAccessible(r3)     // Catch: java.lang.Throwable -> L192
            java.lang.Object r6 = r6.get(r10)     // Catch: java.lang.Throwable -> L192
            boolean r8 = r6 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L192
            if (r8 == 0) goto L194
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L192
            goto L19c
        L192:
            r6 = move-exception
            goto L196
        L194:
            r6 = r4
            goto L19c
        L196:
            eo1 r8 = new eo1
            r8.<init>(r6)
            r6 = r8
        L19c:
            boolean r8 = r6 instanceof p000.eo1
            if (r8 == 0) goto L1a1
            r6 = r4
        L1a1:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
        L1a3:
            if (r6 == 0) goto L15e
            r4 = r6
        L1a6:
            if (r4 == 0) goto L1ad
            boolean r10 = r4.booleanValue()
            goto L1b7
        L1ad:
            java.lang.String r10 = r10.toString()
            java.lang.String r1 = "hasSaveToAlbum=true"
            boolean r10 = p000.q02.m4654(r10, r1, r0)
        L1b7:
            i41 r0 = new i41
            r0.<init>(r7, r2, r5, r10)
            return r0
    }

    /* JADX INFO: renamed from: θ */
    public static p000.g41 m2857(android.content.Context r26, java.lang.String r27, java.util.List r28, java.util.List r29) {
            r1 = r27
            boolean r0 = r28.isEmpty()
            if (r0 == 0) goto L10
            e41 r0 = new e41
            java.lang.String r1 = "官方合并缺少静态图候选"
            r0.<init>(r1)
            return r0
        L10:
            boolean r0 = r29.isEmpty()
            if (r0 == 0) goto L1e
            e41 r0 = new e41
            java.lang.String r1 = "官方合并缺少视频候选"
            r0.<init>(r1)
            return r0
        L1e:
            java.lang.ClassLoader r0 = p000.j41.f5313
            java.lang.String r2 = "DYHelper"
            r3 = 0
            r4 = 0
            if (r0 != 0) goto L3a
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r0 = r0.getContextClassLoader()
            if (r0 != 0) goto L3a
            java.lang.Class<j41> r0 = p000.j41.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            if (r0 != 0) goto L3a
            r5 = r3
            goto L8c
        L3a:
            java.lang.String r5 = "~795CFE82AE87DC48225355B65A8474AC8888795688CFC505AE0FEA03DD2E4A64886E5A9CE1AA251B943D998A6435981074F0"
            java.lang.String r5 = p000.jf0.m2957(r5)     // Catch: java.lang.Throwable -> L6b
            java.lang.Class r0 = java.lang.Class.forName(r5, r4, r0)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r5 = "Companion"
            java.lang.reflect.Field r0 = r0.getField(r5)     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L6b
            if (r0 != 0) goto L52
        L50:
            r0 = r3
            goto L7a
        L52:
            java.lang.String r5 = "ensureReady"
            java.lang.Object r5 = m2854(r0, r5)     // Catch: java.lang.Throwable -> L6b
            if (r5 != 0) goto L6d
            java.lang.String r5 = "getOrDefault"
            java.lang.Object r5 = m2854(r0, r5)     // Catch: java.lang.Throwable -> L6b
            if (r5 != 0) goto L6d
            java.lang.String r5 = "getOrElse"
            java.lang.Object r5 = m2854(r0, r5)     // Catch: java.lang.Throwable -> L6b
            if (r5 != 0) goto L6d
            goto L50
        L6b:
            r0 = move-exception
            goto L74
        L6d:
            java.lang.String r0 = "albumService"
            java.lang.Object r0 = m2854(r5, r0)     // Catch: java.lang.Throwable -> L6b
            goto L7a
        L74:
            eo1 r5 = new eo1
            r5.<init>(r0)
            r0 = r5
        L7a:
            java.lang.Throwable r5 = p000.fo1.m2190(r0)
            if (r5 != 0) goto L81
            goto L8b
        L81:
            java.lang.String r0 = r5.getMessage()
            java.lang.String r6 = "[LIVEPHOTO-MERGE-OFFICIAL-SERVICE-FAIL] "
            p000.AbstractC0602nx.m4145(r6, r0, r2, r5)
            r0 = r3
        L8b:
            r5 = r0
        L8c:
            if (r5 != 0) goto L96
            e41 r0 = new e41
            java.lang.String r1 = "无法获取 IExternalService.albumService"
            r0.<init>(r1)
            return r0
        L96:
            java.lang.Class r0 = r5.getClass()
            java.lang.String r6 = r0.getName()
            java.util.concurrent.ConcurrentHashMap r7 = p000.j41.f5314
            java.lang.Object r8 = r7.get(r6)
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            r9 = 1
            if (r8 == 0) goto Lab
            goto L116
        Lab:
            r8 = r0
        Lac:
            if (r8 == 0) goto Le0
            java.lang.Class<java.lang.Object> r10 = java.lang.Object.class
            boolean r10 = r8.equals(r10)
            if (r10 != 0) goto Le0
            java.lang.reflect.Method[] r10 = r8.getDeclaredMethods()
            r10.getClass()
            int r11 = r10.length
            r12 = r4
        Lbf:
            if (r12 >= r11) goto Ld0
            r13 = r10[r12]
            r13.getClass()
            boolean r14 = m2855(r13)
            if (r14 == 0) goto Lcd
            goto Ld1
        Lcd:
            int r12 = r12 + 1
            goto Lbf
        Ld0:
            r13 = r3
        Ld1:
            if (r13 == 0) goto Ldb
            r13.setAccessible(r9)
            r7.put(r6, r13)
            r8 = r13
            goto L116
        Ldb:
            java.lang.Class r8 = r8.getSuperclass()
            goto Lac
        Le0:
            java.lang.Class[] r0 = r0.getInterfaces()
            r0.getClass()
            int r8 = r0.length
            r10 = r4
        Le9:
            if (r10 >= r8) goto L115
            r11 = r0[r10]
            java.lang.reflect.Method[] r11 = r11.getMethods()
            r11.getClass()
            int r12 = r11.length
            r13 = r4
        Lf6:
            if (r13 >= r12) goto L107
            r14 = r11[r13]
            r14.getClass()
            boolean r15 = m2855(r14)
            if (r15 == 0) goto L104
            goto L108
        L104:
            int r13 = r13 + 1
            goto Lf6
        L107:
            r14 = r3
        L108:
            if (r14 == 0) goto L112
            r14.setAccessible(r9)
            r7.put(r6, r14)
            r8 = r14
            goto L116
        L112:
            int r10 = r10 + 1
            goto Le9
        L115:
            r8 = r3
        L116:
            if (r8 != 0) goto L120
            e41 r0 = new e41
            java.lang.String r1 = "无法定位 encodeLivePhoto(String,String,long)"
            r0.<init>(r1)
            return r0
        L120:
            java.io.File r6 = new java.io.File
            java.io.File r0 = r26.getCacheDir()
            java.lang.String r7 = "dyhelper_official_livephoto"
            r6.<init>(r0, r7)
            boolean r0 = r6.exists()
            if (r0 != 0) goto L134
            r6.mkdirs()
        L134:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r10 = r29
            java.util.List r11 = p000.AbstractC0984xh.m6662(r10, r9)     // Catch: java.lang.Throwable -> L165
            r12 = r28
            java.util.List r13 = p000.AbstractC0984xh.m6662(r12, r9)     // Catch: java.lang.Throwable -> L165
            int r0 = r10.size()     // Catch: java.lang.Throwable -> L165
            int r14 = r11.size()     // Catch: java.lang.Throwable -> L165
            java.lang.String r15 = ", image="
            java.lang.String r3 = ", video="
            java.lang.String r4 = "/"
            if (r0 > r14) goto L16a
            int r0 = r12.size()     // Catch: java.lang.Throwable -> L165
            int r14 = r13.size()     // Catch: java.lang.Throwable -> L165
            if (r0 <= r14) goto L160
            goto L16a
        L160:
            r16 = r9
            r17 = r11
            goto L1aa
        L165:
            r0 = move-exception
            r23 = r7
            goto L478
        L16a:
            int r0 = r11.size()     // Catch: java.lang.Throwable -> L165
            int r10 = r10.size()     // Catch: java.lang.Throwable -> L165
            int r14 = r13.size()     // Catch: java.lang.Throwable -> L165
            int r12 = r12.size()     // Catch: java.lang.Throwable -> L165
            r16 = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L165
            r9.<init>()     // Catch: java.lang.Throwable -> L165
            r17 = r11
            java.lang.String r11 = "[LIVEPHOTO-MERGE-OFFICIAL-LIMIT] awemeId="
            r9.append(r11)     // Catch: java.lang.Throwable -> L165
            r9.append(r1)     // Catch: java.lang.Throwable -> L165
            r9.append(r3)     // Catch: java.lang.Throwable -> L165
            r9.append(r0)     // Catch: java.lang.Throwable -> L165
            r9.append(r4)     // Catch: java.lang.Throwable -> L165
            r9.append(r10)     // Catch: java.lang.Throwable -> L165
            r9.append(r15)     // Catch: java.lang.Throwable -> L165
            r9.append(r14)     // Catch: java.lang.Throwable -> L165
            r9.append(r4)     // Catch: java.lang.Throwable -> L165
            r9.append(r12)     // Catch: java.lang.Throwable -> L165
            java.lang.String r0 = r9.toString()     // Catch: java.lang.Throwable -> L165
            p000.C0888ux.m5975(r2, r0)     // Catch: java.lang.Throwable -> L165
        L1aa:
            java.util.Iterator r9 = r17.iterator()     // Catch: java.lang.Throwable -> L165
            r0 = 0
            r10 = 0
        L1b0:
            boolean r11 = r9.hasNext()     // Catch: java.lang.Throwable -> L165
            if (r11 == 0) goto L44c
            int r11 = r0 + 1
            java.lang.Object r0 = r9.next()     // Catch: java.lang.Throwable -> L165
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L165
            java.lang.String r12 = "dy_official_lp_video_"
            java.lang.String r14 = ".mp4"
            java.io.File r12 = java.io.File.createTempFile(r12, r14, r6)     // Catch: java.lang.Throwable -> L165
            r7.add(r12)     // Catch: java.lang.Throwable -> L165
            r18 = 0
            r12.getClass()     // Catch: java.lang.Throwable -> L1e2
            m2853(r12, r0)     // Catch: java.lang.Throwable -> L1e2
            boolean r0 = r12.exists()     // Catch: java.lang.Throwable -> L1e2
            if (r0 == 0) goto L1e4
            long r20 = r12.length()     // Catch: java.lang.Throwable -> L1e2
            int r0 = (r20 > r18 ? 1 : (r20 == r18 ? 0 : -1))
            if (r0 <= 0) goto L1e4
            r0 = r16
            goto L1e5
        L1e2:
            r0 = move-exception
            goto L1ea
        L1e4:
            r0 = 0
        L1e5:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L1e2
            goto L1f0
        L1ea:
            eo1 r14 = new eo1     // Catch: java.lang.Throwable -> L165
            r14.<init>(r0)     // Catch: java.lang.Throwable -> L165
            r0 = r14
        L1f0:
            java.lang.Throwable r14 = p000.fo1.m2190(r0)     // Catch: java.lang.Throwable -> L165
            if (r14 != 0) goto L1f7
            goto L1fa
        L1f7:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L165
            r10 = r14
        L1fa:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L165
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L165
            if (r0 == 0) goto L435
            r12.getClass()     // Catch: java.lang.Throwable -> L165
            android.media.MediaMetadataRetriever r0 = new android.media.MediaMetadataRetriever     // Catch: java.lang.Throwable -> L165
            r0.<init>()     // Catch: java.lang.Throwable -> L165
            java.lang.String r14 = r12.getAbsolutePath()     // Catch: java.lang.Throwable -> L23c
            r0.setDataSource(r14)     // Catch: java.lang.Throwable -> L23c
            r14 = 9
            java.lang.String r14 = r0.extractMetadata(r14)     // Catch: java.lang.Throwable -> L23c
            if (r14 == 0) goto L234
            r28 = r0
            r0 = 10
            java.lang.Long r0 = p000.x02.m6489(r14, r0)     // Catch: java.lang.Throwable -> L23e
            if (r0 == 0) goto L236
            long r20 = r0.longValue()     // Catch: java.lang.Throwable -> L23e
            int r14 = (r20 > r18 ? 1 : (r20 == r18 ? 0 : -1))
            if (r14 <= 0) goto L22c
            goto L22d
        L22c:
            r0 = 0
        L22d:
            if (r0 == 0) goto L236
            long r20 = r0.longValue()     // Catch: java.lang.Throwable -> L23e
            goto L238
        L234:
            r28 = r0
        L236:
            r20 = r18
        L238:
            r28.release()     // Catch: java.lang.Throwable -> L243
            goto L243
        L23c:
            r28 = r0
        L23e:
            r28.release()     // Catch: java.lang.Throwable -> L241
        L241:
            r20 = r18
        L243:
            java.util.Iterator r14 = r13.iterator()     // Catch: java.lang.Throwable -> L165
            r0 = 0
        L248:
            boolean r22 = r14.hasNext()     // Catch: java.lang.Throwable -> L165
            if (r22 == 0) goto L433
            r28 = r9
            int r9 = r0 + 1
            java.lang.Object r0 = r14.next()     // Catch: java.lang.Throwable -> L165
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L165
            r29 = r10
            java.lang.String r10 = "dy_official_lp_image_"
            r22 = r12
            java.lang.String r12 = ".jpg"
            java.io.File r10 = java.io.File.createTempFile(r10, r12, r6)     // Catch: java.lang.Throwable -> L165
            r7.add(r10)     // Catch: java.lang.Throwable -> L165
            r10.getClass()     // Catch: java.lang.Throwable -> L27e
            m2852(r10, r0)     // Catch: java.lang.Throwable -> L27e
            boolean r0 = r10.exists()     // Catch: java.lang.Throwable -> L27e
            if (r0 == 0) goto L280
            long r23 = r10.length()     // Catch: java.lang.Throwable -> L27e
            int r0 = (r23 > r18 ? 1 : (r23 == r18 ? 0 : -1))
            if (r0 <= 0) goto L280
            r0 = r16
            goto L281
        L27e:
            r0 = move-exception
            goto L286
        L280:
            r0 = 0
        L281:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L27e
            goto L28c
        L286:
            eo1 r12 = new eo1     // Catch: java.lang.Throwable -> L165
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L165
            r0 = r12
        L28c:
            java.lang.Throwable r12 = p000.fo1.m2190(r0)     // Catch: java.lang.Throwable -> L165
            if (r12 != 0) goto L295
            r12 = r29
            goto L297
        L295:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L165
        L297:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L165
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L165
            if (r0 == 0) goto L418
            int r0 = r17.size()     // Catch: java.lang.Throwable -> L165
            r23 = r7
            int r7 = r13.size()     // Catch: java.lang.Throwable -> L36e
            r24 = r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36e
            r10.<init>()     // Catch: java.lang.Throwable -> L36e
            r29 = r12
            java.lang.String r12 = "[LIVEPHOTO-MERGE-OFFICIAL-TRY] awemeId="
            r10.append(r12)     // Catch: java.lang.Throwable -> L36e
            r10.append(r1)     // Catch: java.lang.Throwable -> L36e
            r10.append(r3)     // Catch: java.lang.Throwable -> L36e
            r10.append(r11)     // Catch: java.lang.Throwable -> L36e
            r10.append(r4)     // Catch: java.lang.Throwable -> L36e
            r10.append(r0)     // Catch: java.lang.Throwable -> L36e
            r10.append(r15)     // Catch: java.lang.Throwable -> L36e
            r10.append(r9)     // Catch: java.lang.Throwable -> L36e
            r10.append(r4)     // Catch: java.lang.Throwable -> L36e
            r10.append(r7)     // Catch: java.lang.Throwable -> L36e
            java.lang.String r0 = r10.toString()     // Catch: java.lang.Throwable -> L36e
            p000.C0888ux.m5975(r2, r0)     // Catch: java.lang.Throwable -> L36e
            java.lang.String r0 = r24.getAbsolutePath()     // Catch: java.lang.Throwable -> L2ee
            java.lang.String r7 = r22.getAbsolutePath()     // Catch: java.lang.Throwable -> L2ee
            java.lang.Long r10 = java.lang.Long.valueOf(r20)     // Catch: java.lang.Throwable -> L2ee
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r7, r10}     // Catch: java.lang.Throwable -> L2ee
            java.lang.Object r0 = r8.invoke(r5, r0)     // Catch: java.lang.Throwable -> L2ee
            goto L2f5
        L2ee:
            r0 = move-exception
            eo1 r7 = new eo1     // Catch: java.lang.Throwable -> L36e
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L36e
            r0 = r7
        L2f5:
            java.lang.Throwable r7 = p000.fo1.m2190(r0)     // Catch: java.lang.Throwable -> L36e
            if (r7 != 0) goto L2ff
            r12 = r29
            r7 = r0
            goto L301
        L2ff:
            r12 = r7
            r7 = 0
        L301:
            if (r7 != 0) goto L30c
            r24 = r2
            r25 = r3
            r10 = r12
            r12 = r26
            goto L424
        L30c:
            i41 r10 = m2856(r7)     // Catch: java.lang.Throwable -> L36e
            int r0 = r10.f4910     // Catch: java.lang.Throwable -> L36e
            if (r0 != 0) goto L3e6
            java.util.List r0 = r10.f4908     // Catch: java.lang.Throwable -> L36e
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L36e
            if (r0 != 0) goto L3e6
            java.util.List r0 = r10.m2613()     // Catch: java.lang.Throwable -> L36e
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L36e
            r1.<init>()     // Catch: java.lang.Throwable -> L36e
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> L36e
        L329:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L36e
            if (r0 == 0) goto L379
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L36e
            r5 = r4
            h41 r5 = (p000.h41) r5     // Catch: java.lang.Throwable -> L36e
            java.lang.String r0 = r5.f4570     // Catch: java.lang.Throwable -> L33e
            m2859(r6, r0)     // Catch: java.lang.Throwable -> L33e
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L33e
            goto L345
        L33e:
            r0 = move-exception
            eo1 r8 = new eo1     // Catch: java.lang.Throwable -> L36e
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L36e
            r0 = r8
        L345:
            java.lang.Throwable r8 = p000.fo1.m2190(r0)     // Catch: java.lang.Throwable -> L36e
            if (r8 == 0) goto L371
            java.lang.String r5 = r5.f4571     // Catch: java.lang.Throwable -> L36e
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L36e
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36e
            r9.<init>()     // Catch: java.lang.Throwable -> L36e
            java.lang.String r11 = "[LIVEPHOTO-MERGE-OFFICIAL-INVALID] file="
            r9.append(r11)     // Catch: java.lang.Throwable -> L36e
            r9.append(r5)     // Catch: java.lang.Throwable -> L36e
            java.lang.String r5 = ", err="
            r9.append(r5)     // Catch: java.lang.Throwable -> L36e
            r9.append(r8)     // Catch: java.lang.Throwable -> L36e
            java.lang.String r5 = r9.toString()     // Catch: java.lang.Throwable -> L36e
            p000.C0888ux.m5975(r2, r5)     // Catch: java.lang.Throwable -> L36e
            goto L371
        L36e:
            r0 = move-exception
            goto L478
        L371:
            boolean r0 = r0 instanceof p000.eo1     // Catch: java.lang.Throwable -> L36e
            if (r0 != 0) goto L329
            r1.add(r4)     // Catch: java.lang.Throwable -> L36e
            goto L329
        L379:
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Throwable -> L36e
            if (r0 != 0) goto L39f
            f41 r0 = new f41     // Catch: java.lang.Throwable -> L36e
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L36e
            java.util.Iterator r1 = r23.iterator()
        L388:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L39e
            java.lang.Object r2 = r1.next()
            java.io.File r2 = (java.io.File) r2
            boolean r3 = r2.exists()     // Catch: java.lang.Throwable -> L388
            if (r3 == 0) goto L388
            r2.delete()     // Catch: java.lang.Throwable -> L388
            goto L388
        L39e:
            return r0
        L39f:
            java.util.List r0 = r10.m2613()     // Catch: java.lang.Throwable -> L36e
            r12 = r26
            m2850(r12, r0)     // Catch: java.lang.Throwable -> L36e
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L36e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36e
            r1.<init>()     // Catch: java.lang.Throwable -> L36e
            java.lang.String r2 = "官方合并返回成功但产物未包含可播放视频: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L36e
            r1.append(r7)     // Catch: java.lang.Throwable -> L36e
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L36e
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L36e
            e41 r1 = new e41     // Catch: java.lang.Throwable -> L36e
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L36e
            if (r0 != 0) goto L3c8
            java.lang.String r0 = "官方合并产物校验失败"
        L3c8:
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L36e
            java.util.Iterator r0 = r23.iterator()
        L3cf:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3e5
            java.lang.Object r2 = r0.next()
            java.io.File r2 = (java.io.File) r2
            boolean r3 = r2.exists()     // Catch: java.lang.Throwable -> L3cf
            if (r3 == 0) goto L3cf
            r2.delete()     // Catch: java.lang.Throwable -> L3cf
            goto L3cf
        L3e5:
            return r1
        L3e6:
            r12 = r26
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L36e
            int r1 = r10.f4910     // Catch: java.lang.Throwable -> L36e
            java.lang.String r10 = r10.f4911     // Catch: java.lang.Throwable -> L36e
            r24 = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36e
            r2.<init>()     // Catch: java.lang.Throwable -> L36e
            r25 = r3
            java.lang.String r3 = "retCode="
            r2.append(r3)     // Catch: java.lang.Throwable -> L36e
            r2.append(r1)     // Catch: java.lang.Throwable -> L36e
            java.lang.String r1 = ", msg="
            r2.append(r1)     // Catch: java.lang.Throwable -> L36e
            r2.append(r10)     // Catch: java.lang.Throwable -> L36e
            java.lang.String r1 = ", result="
            r2.append(r1)     // Catch: java.lang.Throwable -> L36e
            r2.append(r7)     // Catch: java.lang.Throwable -> L36e
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L36e
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L36e
            r10 = r0
            goto L424
        L418:
            r24 = r2
            r25 = r3
            r23 = r7
            r29 = r12
            r12 = r26
            r10 = r29
        L424:
            r1 = r27
            r0 = r9
            r12 = r22
            r7 = r23
            r2 = r24
            r3 = r25
            r9 = r28
            goto L248
        L433:
            r29 = r10
        L435:
            r12 = r26
            r24 = r2
            r25 = r3
            r23 = r7
            r28 = r9
            r1 = r27
            r9 = r28
            r0 = r11
            r7 = r23
            r2 = r24
            r3 = r25
            goto L1b0
        L44c:
            r23 = r7
            e41 r0 = new e41     // Catch: java.lang.Throwable -> L36e
            if (r10 == 0) goto L458
            java.lang.String r1 = r10.getMessage()     // Catch: java.lang.Throwable -> L36e
            if (r1 != 0) goto L45a
        L458:
            java.lang.String r1 = "官方合并所有候选均失败"
        L45a:
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L36e
            java.util.Iterator r1 = r23.iterator()
        L461:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L477
            java.lang.Object r2 = r1.next()
            java.io.File r2 = (java.io.File) r2
            boolean r3 = r2.exists()     // Catch: java.lang.Throwable -> L461
            if (r3 == 0) goto L461
            r2.delete()     // Catch: java.lang.Throwable -> L461
            goto L461
        L477:
            return r0
        L478:
            java.util.Iterator r1 = r23.iterator()
        L47c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L492
            java.lang.Object r2 = r1.next()
            java.io.File r2 = (java.io.File) r2
            boolean r3 = r2.exists()     // Catch: java.lang.Throwable -> L47c
            if (r3 == 0) goto L47c
            r2.delete()     // Catch: java.lang.Throwable -> L47c
            goto L47c
        L492:
            throw r0
    }

    /* JADX INFO: renamed from: ι */
    public static java.util.List m2858(android.content.Context r2, java.lang.String r3, java.util.List r4, java.util.List r5, p000.C0535m3 r6, p000.bf0 r7) {
            r2.getClass()
            g41 r2 = m2857(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L8
            goto Lf
        L8:
            r2 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r2)
            r2 = r4
        Lf:
            java.lang.Throwable r4 = p000.fo1.m2190(r2)
            if (r4 != 0) goto L16
            goto L25
        L16:
            e41 r2 = new e41
            java.lang.String r5 = r4.getMessage()
            if (r5 != 0) goto L22
            java.lang.String r5 = r4.toString()
        L22:
            r2.<init>(r5)
        L25:
            g41 r2 = (p000.g41) r2
            boolean r4 = r2 instanceof p000.f41
            java.lang.String r5 = "DYHelper"
            if (r4 == 0) goto L9f
            r4 = r2
            f41 r4 = (p000.f41) r4
            java.util.ArrayList r4 = r4.f3749
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = p000.AbstractC1021yh.m6889(r4, r1)
            r0.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        L41:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L53
            java.lang.Object r1 = r4.next()
            h41 r1 = (p000.h41) r1
            java.lang.String r1 = r1.f4571
            r0.add(r1)
            goto L41
        L53:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r1 = "[LIVEPHOTO-MERGE-OFFICIAL-DONE] awemeId="
            r4.<init>(r1)
            r4.append(r3)
            java.lang.String r1 = ", saved="
            r4.append(r1)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            p000.C0888ux.m5975(r5, r4)
            f41 r2 = (p000.f41) r2     // Catch: java.lang.Throwable -> L77
            java.util.ArrayList r2 = r2.f3749     // Catch: java.lang.Throwable -> L77
            java.lang.Object r2 = r6.invoke(r2)     // Catch: java.lang.Throwable -> L77
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L77
            goto L7e
        L77:
            r2 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r2)
            r2 = r4
        L7e:
            java.lang.Throwable r4 = p000.fo1.m2190(r2)
            if (r4 != 0) goto L85
            goto L9c
        L85:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r6 = "[LIVEPHOTO-MERGE-OFFICIAL-EXPORT-FAIL] awemeId="
            r2.<init>(r6)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            p000.C0888ux.m5977(r5, r2, r4)
            java.lang.Object r2 = r7.invoke()
            java.util.List r2 = (java.util.List) r2
        L9c:
            java.util.List r2 = (java.util.List) r2
            goto Lb0
        L9f:
            e41 r2 = (p000.e41) r2
            java.lang.String r2 = r2.f3405
            java.lang.String r4 = "[LIVEPHOTO-MERGE-OFFICIAL-FALLBACK] awemeId="
            java.lang.String r6 = ", reason="
            p000.AbstractC0602nx.m4144(r4, r3, r6, r2, r5)
            java.lang.Object r2 = r7.invoke()
            java.util.List r2 = (java.util.List) r2
        Lb0:
            return r2
    }

    /* JADX INFO: renamed from: κ */
    public static void m2859(java.io.File r7, java.lang.String r8) {
            java.io.File r0 = new java.io.File
            r0.<init>(r8)
            boolean r8 = r0.exists()
            if (r8 == 0) goto Lbb
            long r1 = r0.length()
            r3 = 0
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 <= 0) goto Lbb
            byte[] r8 = p000.s30.m5362(r0)
            int r0 = r8.length
            r1 = 16
            if (r0 < r1) goto Lb3
            r0 = 0
            r0 = r8[r0]
            r2 = -1
            if (r0 != r2) goto Lb3
            r0 = 1
            r0 = r8[r0]
            r3 = -40
            if (r0 != r3) goto Lb3
            r0 = 4
        L2c:
            int r3 = r0 + 8
            int r4 = r8.length
            if (r3 >= r4) goto L7a
            r3 = r8[r0]
            r4 = 102(0x66, float:1.43E-43)
            if (r3 != r4) goto L77
            int r3 = r0 + 1
            r3 = r8[r3]
            r4 = 116(0x74, float:1.63E-43)
            if (r3 != r4) goto L77
            int r3 = r0 + 2
            r3 = r8[r3]
            r4 = 121(0x79, float:1.7E-43)
            if (r3 != r4) goto L77
            int r3 = r0 + 3
            r3 = r8[r3]
            r4 = 112(0x70, float:1.57E-43)
            if (r3 != r4) goto L77
            int r3 = r0 + (-4)
            r4 = r8[r3]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 24
            int r5 = r0 + (-3)
            r5 = r8[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << r1
            r4 = r4 | r5
            int r5 = r0 + (-2)
            r5 = r8[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r6 = 8
            int r5 = r5 << r6
            r4 = r4 | r5
            int r5 = r0 + (-1)
            r5 = r8[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r4 = r4 | r5
            if (r4 < r6) goto L77
            int r4 = r4 + r3
            int r5 = r8.length
            if (r4 > r5) goto L77
            r2 = r3
        L77:
            int r0 = r0 + 1
            goto L2c
        L7a:
            if (r2 <= 0) goto Lab
            int r0 = r8.length
            if (r2 >= r0) goto Lab
            java.lang.String r0 = "dy_official_lp_check_"
            java.lang.String r1 = ".mp4"
            java.io.File r7 = java.io.File.createTempFile(r0, r1, r7)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L9e
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L9e
            int r1 = r8.length     // Catch: java.lang.Throwable -> La0
            int r1 = r1 - r2
            r0.write(r8, r2, r1)     // Catch: java.lang.Throwable -> La0
            r0.close()     // Catch: java.lang.Throwable -> L9e
            r7.getClass()     // Catch: java.lang.Throwable -> L9e
            m2860(r7)     // Catch: java.lang.Throwable -> L9e
            r7.delete()     // Catch: java.lang.Throwable -> L9d
        L9d:
            return
        L9e:
            r8 = move-exception
            goto La7
        La0:
            r8 = move-exception
            throw r8     // Catch: java.lang.Throwable -> La2
        La2:
            r1 = move-exception
            p000.AbstractC0978xb.m6584(r0, r8)     // Catch: java.lang.Throwable -> L9e
            throw r1     // Catch: java.lang.Throwable -> L9e
        La7:
            r7.delete()     // Catch: java.lang.Throwable -> Laa
        Laa:
            throw r8
        Lab:
            java.lang.Exception r7 = new java.lang.Exception
            java.lang.String r8 = "官方输出未找到追加 MP4"
            r7.<init>(r8)
            throw r7
        Lb3:
            java.lang.Exception r7 = new java.lang.Exception
            java.lang.String r8 = "官方输出不是有效 JPEG"
            r7.<init>(r8)
            throw r7
        Lbb:
            java.lang.Exception r7 = new java.lang.Exception
            java.lang.String r8 = "官方输出文件不存在或为空"
            r7.<init>(r8)
            throw r7
    }

    /* JADX INFO: renamed from: λ */
    public static void m2860(java.io.File r8) {
            android.media.MediaMetadataRetriever r0 = new android.media.MediaMetadataRetriever
            r0.<init>()
            java.lang.String r8 = r8.getAbsolutePath()     // Catch: java.lang.Throwable -> L23
            r0.setDataSource(r8)     // Catch: java.lang.Throwable -> L23
            r8 = 9
            java.lang.String r8 = r0.extractMetadata(r8)     // Catch: java.lang.Throwable -> L23
            r1 = 0
            r3 = 10
            if (r8 == 0) goto L25
            java.lang.Long r8 = p000.x02.m6489(r8, r3)     // Catch: java.lang.Throwable -> L23
            if (r8 == 0) goto L25
            long r4 = r8.longValue()     // Catch: java.lang.Throwable -> L23
            goto L26
        L23:
            r8 = move-exception
            goto L69
        L25:
            r4 = r1
        L26:
            r8 = 18
            java.lang.String r8 = r0.extractMetadata(r8)     // Catch: java.lang.Throwable -> L23
            r6 = 0
            if (r8 == 0) goto L3a
            java.lang.Integer r8 = p000.x02.m6487(r8, r3)     // Catch: java.lang.Throwable -> L23
            if (r8 == 0) goto L3a
            int r8 = r8.intValue()     // Catch: java.lang.Throwable -> L23
            goto L3b
        L3a:
            r8 = r6
        L3b:
            r7 = 19
            java.lang.String r7 = r0.extractMetadata(r7)     // Catch: java.lang.Throwable -> L23
            if (r7 == 0) goto L4d
            java.lang.Integer r3 = p000.x02.m6487(r7, r3)     // Catch: java.lang.Throwable -> L23
            if (r3 == 0) goto L4d
            int r6 = r3.intValue()     // Catch: java.lang.Throwable -> L23
        L4d:
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 <= 0) goto L61
            if (r8 <= 0) goto L59
            if (r6 <= 0) goto L59
            r0.release()     // Catch: java.lang.Throwable -> L58
        L58:
            return
        L59:
            java.lang.Exception r8 = new java.lang.Exception     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = "视频无有效尺寸"
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L23
            throw r8     // Catch: java.lang.Throwable -> L23
        L61:
            java.lang.Exception r8 = new java.lang.Exception     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = "视频无有效时长"
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L23
            throw r8     // Catch: java.lang.Throwable -> L23
        L69:
            r0.release()     // Catch: java.lang.Throwable -> L6c
        L6c:
            throw r8
    }
}
