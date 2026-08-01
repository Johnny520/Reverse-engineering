package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class g81 {
    /* JADX INFO: renamed from: α */
    public static final long m2269(int r4, int r5) {
            if (r4 < 0) goto L5
            if (r5 < 0) goto L5
            goto L23
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "start and end cannot be negative. [start: "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r1 = ", end: "
            r0.append(r1)
            r0.append(r5)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            p000.bm0.m982(r0)
        L23:
            long r0 = (long) r4
            r4 = 32
            long r0 = r0 << r4
            long r4 = (long) r5
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r2
            long r4 = r4 | r0
            int r0 = p000.r32.f9253
            return r4
    }

    /* JADX INFO: renamed from: β */
    public static final p000.AbstractC0401in m2270(p000.AbstractC0401in r0, p000.AbstractC0401in r1) {
            if (r0 == 0) goto L16
            android.graphics.RenderEffect r1 = r1.m2766()
            android.graphics.RenderEffect r0 = r0.m2766()
            android.graphics.RenderEffect r0 = p000.AbstractC0671p1.m4358(r1, r0)
            r0.getClass()
            a3 r1 = new a3
            r1.<init>(r0)
        L16:
            return r1
    }

    /* JADX INFO: renamed from: δ */
    public static boolean m2271(p000.ze1 r0, p000.ze1 r1, int r2, int r3, int r4, int r5) {
            if (r2 == r3) goto L5
            if (r2 <= r3) goto L2d
            goto L2b
        L5:
            if (r4 == r5) goto La
            if (r4 >= r5) goto L2d
            goto L2b
        La:
            java.lang.String r0 = r0.f13064
            r2 = 10
            java.lang.Integer r0 = p000.x02.m6487(r0, r2)
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == 0) goto L1c
            int r0 = r0.intValue()
            goto L1d
        L1c:
            r0 = r3
        L1d:
            java.lang.String r1 = r1.f13064
            java.lang.Integer r1 = p000.x02.m6487(r1, r2)
            if (r1 == 0) goto L29
            int r3 = r1.intValue()
        L29:
            if (r0 >= r3) goto L2d
        L2b:
            r0 = 1
            return r0
        L2d:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ε */
    public static java.io.File m2272(android.app.Activity r12, android.net.Uri r13) {
            java.io.File r0 = new java.io.File
            java.io.File r1 = r12.getCacheDir()
            java.lang.String r2 = "dyhelper_pet_task_image"
            r0.<init>(r1, r2)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L1f
            boolean r1 = r0.mkdirs()
            if (r1 == 0) goto L18
            goto L1f
        L18:
            java.lang.String r12 = "无法创建宿主图片缓存目录"
            p000.C1080.m7279(r12)
            r12 = 0
            return r12
        L1f:
            long r1 = java.lang.System.currentTimeMillis()
            r3 = 86400000(0x5265c00, double:4.2687272E-316)
            long r1 = r1 - r3
            java.io.File[] r3 = r0.listFiles()
            r4 = 0
            if (r3 == 0) goto L61
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r6 = r3.length
            r7 = r4
        L35:
            if (r7 >= r6) goto L4d
            r8 = r3[r7]
            boolean r9 = r8.isFile()
            if (r9 == 0) goto L4a
            long r9 = r8.lastModified()
            int r9 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r9 >= 0) goto L4a
            r5.add(r8)
        L4a:
            int r7 = r7 + 1
            goto L35
        L4d:
            java.util.Iterator r1 = r5.iterator()
        L51:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L61
            java.lang.Object r2 = r1.next()
            java.io.File r2 = (java.io.File) r2
            r2.delete()
            goto L51
        L61:
            android.content.ContentResolver r1 = r12.getContentResolver()
            java.lang.String r1 = r1.getType(r13)
            r2 = 0
            if (r1 == 0) goto L76
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r3)
            r1.getClass()
            goto L77
        L76:
            r1 = r2
        L77:
            if (r1 != 0) goto L7b
            java.lang.String r1 = ""
        L7b:
            android.webkit.MimeTypeMap r3 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r3 = r3.getExtensionFromMimeType(r1)
            if (r3 == 0) goto La6
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r5)
            r3.getClass()
            java.lang.String r5 = "[a-z0-9]{1,5}"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            r5.getClass()
            java.util.regex.Matcher r5 = r5.matcher(r3)
            boolean r5 = r5.matches()
            if (r5 == 0) goto La2
            goto La3
        La2:
            r3 = r2
        La3:
            if (r3 == 0) goto La6
            goto La8
        La6:
            java.lang.String r3 = "jpg"
        La8:
            java.lang.String r5 = "."
            java.lang.String r3 = r5.concat(r3)
            java.lang.String r5 = "pet_"
            java.io.File r0 = java.io.File.createTempFile(r5, r3, r0)
            android.content.ContentResolver r12 = r12.getContentResolver()     // Catch: java.lang.Throwable -> L151
            java.io.InputStream r12 = r12.openInputStream(r13)     // Catch: java.lang.Throwable -> L151
            if (r12 == 0) goto L171
            java.io.FileOutputStream r13 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L163
            r0.getClass()     // Catch: java.lang.Throwable -> L163
            r13.<init>(r0)     // Catch: java.lang.Throwable -> L163
            r3 = 8192(0x2000, float:1.148E-41)
            java.io.BufferedOutputStream r5 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L163
            r5.<init>(r13, r3)     // Catch: java.lang.Throwable -> L163
            byte[] r13 = new byte[r3]     // Catch: java.lang.Throwable -> Le5
            r6 = 0
            r8 = r6
        Ld2:
            int r3 = r12.read(r13)     // Catch: java.lang.Throwable -> Le5
            if (r3 < 0) goto Lf0
            long r10 = (long) r3     // Catch: java.lang.Throwable -> Le5
            long r8 = r8 + r10
            r10 = 31457280(0x1e00000, double:1.55419614E-316)
            int r10 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r10 > 0) goto Le8
            r5.write(r13, r4, r3)     // Catch: java.lang.Throwable -> Le5
            goto Ld2
        Le5:
            r13 = move-exception
            goto L165
        Le8:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Le5
            java.lang.String r1 = "图片超过 30MB 安全上限"
            r13.<init>(r1)     // Catch: java.lang.Throwable -> Le5
            throw r13     // Catch: java.lang.Throwable -> Le5
        Lf0:
            r5.close()     // Catch: java.lang.Throwable -> L163
            r12.close()     // Catch: java.lang.Throwable -> L151
            int r12 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r12 <= 0) goto L15b
            android.graphics.BitmapFactory$Options r12 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> L151
            r12.<init>()     // Catch: java.lang.Throwable -> L151
            r13 = 1
            r12.inJustDecodeBounds = r13     // Catch: java.lang.Throwable -> L151
            java.lang.String r13 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L151
            android.graphics.BitmapFactory.decodeFile(r13, r12)     // Catch: java.lang.Throwable -> L151
            int r13 = r12.outWidth     // Catch: java.lang.Throwable -> L151
            if (r13 <= 0) goto L153
            int r13 = r12.outHeight     // Catch: java.lang.Throwable -> L151
            if (r13 <= 0) goto L153
            java.lang.String r13 = "r86c859e3375e752"
            java.lang.String r3 = r0.getName()     // Catch: java.lang.Throwable -> L151
            int r4 = r12.outWidth     // Catch: java.lang.Throwable -> L151
            int r12 = r12.outHeight     // Catch: java.lang.Throwable -> L151
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L151
            r5.<init>()     // Catch: java.lang.Throwable -> L151
            java.lang.String r6 = "SAF 图片已缓存 file="
            r5.append(r6)     // Catch: java.lang.Throwable -> L151
            r5.append(r3)     // Catch: java.lang.Throwable -> L151
            java.lang.String r3 = " bytes="
            r5.append(r3)     // Catch: java.lang.Throwable -> L151
            r5.append(r8)     // Catch: java.lang.Throwable -> L151
            java.lang.String r3 = " size="
            r5.append(r3)     // Catch: java.lang.Throwable -> L151
            r5.append(r4)     // Catch: java.lang.Throwable -> L151
            java.lang.String r3 = "x"
            r5.append(r3)     // Catch: java.lang.Throwable -> L151
            r5.append(r12)     // Catch: java.lang.Throwable -> L151
            java.lang.String r12 = " mime="
            r5.append(r12)     // Catch: java.lang.Throwable -> L151
            r5.append(r1)     // Catch: java.lang.Throwable -> L151
            java.lang.String r12 = r5.toString()     // Catch: java.lang.Throwable -> L151
            r1 = 4
            p000.C0888ux.m5988(r13, r12, r2, r1, r2)     // Catch: java.lang.Throwable -> L151
            return r0
        L151:
            r12 = move-exception
            goto L179
        L153:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L151
            java.lang.String r13 = "所选文件不是可识别的图片"
            r12.<init>(r13)     // Catch: java.lang.Throwable -> L151
            throw r12     // Catch: java.lang.Throwable -> L151
        L15b:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L151
            java.lang.String r13 = "所选图片为空"
            r12.<init>(r13)     // Catch: java.lang.Throwable -> L151
            throw r12     // Catch: java.lang.Throwable -> L151
        L163:
            r13 = move-exception
            goto L16b
        L165:
            throw r13     // Catch: java.lang.Throwable -> L166
        L166:
            r1 = move-exception
            p000.AbstractC0978xb.m6584(r5, r13)     // Catch: java.lang.Throwable -> L163
            throw r1     // Catch: java.lang.Throwable -> L163
        L16b:
            throw r13     // Catch: java.lang.Throwable -> L16c
        L16c:
            r1 = move-exception
            p000.AbstractC0978xb.m6584(r12, r13)     // Catch: java.lang.Throwable -> L151
            throw r1     // Catch: java.lang.Throwable -> L151
        L171:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L151
            java.lang.String r13 = "系统无法打开所选图片"
            r12.<init>(r13)     // Catch: java.lang.Throwable -> L151
            throw r12     // Catch: java.lang.Throwable -> L151
        L179:
            r0.delete()
            throw r12
    }

    /* JADX INFO: renamed from: ζ */
    public static p000.ta1 m2273(int r16, java.lang.String r17, java.util.List r18) {
            java.lang.CharSequence r0 = p000.q02.m4660(r17)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "__smart__"
            boolean r0 = p000.ln0.m3626(r0, r1)
            ua1 r1 = p000.ua1.f10667
            ua1 r2 = p000.ua1.f10666
            ua1 r3 = p000.ua1.f10665
            r4 = 10
            java.lang.String r5 = " price="
            java.lang.String r6 = "response.food_info.list["
            r7 = 0
            r8 = 0
            if (r0 == 0) goto L1ca
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r9 = r18.iterator()
        L27:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L4e
            java.lang.Object r10 = r9.next()
            r11 = r10
            ze1 r11 = (p000.ze1) r11
            java.lang.String r12 = r11.f13071
            boolean r12 = p000.x02.m6485(r12, r6, r7)
            if (r12 == 0) goto L27
            java.lang.String r11 = r11.f13064
            java.lang.Integer r11 = p000.x02.m6487(r11, r4)
            if (r11 == 0) goto L27
            int r11 = r11.intValue()
            if (r11 <= 0) goto L27
            r0.add(r10)
            goto L27
        L4e:
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L5c
            ta1 r0 = new ta1
            java.lang.String r1 = "smart catalog empty"
            r0.<init>(r8, r3, r1)
            return r0
        L5c:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L65:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L87
            java.lang.Object r4 = r0.next()
            r9 = r4
            ze1 r9 = (p000.ze1) r9
            java.lang.Integer r9 = r9.f13066
            if (r9 == 0) goto L7b
            int r9 = r9.intValue()
            goto L7c
        L7b:
            r9 = -1
        L7c:
            if (r9 < 0) goto L80
            r6 = 1
            goto L81
        L80:
            r6 = r7
        L81:
            if (r6 == 0) goto L65
            r3.add(r4)
            goto L65
        L87:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L95
            ta1 r0 = new ta1
            java.lang.String r1 = "smart no valid price"
            r0.<init>(r8, r2, r1)
            return r0
        L95:
            if (r16 >= 0) goto L99
            r0 = r7
            goto L9b
        L99:
            r0 = r16
        L9b:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r3.iterator()
        La4:
            boolean r4 = r3.hasNext()
            java.lang.String r9 = "Required value was null."
            if (r4 == 0) goto Lcb
            java.lang.Object r4 = r3.next()
            r10 = r4
            ze1 r10 = (p000.ze1) r10
            java.lang.Integer r10 = r10.f13066
            if (r10 == 0) goto Lc6
            int r9 = r10.intValue()
            if (r9 > r0) goto Lbf
            r9 = 1
            goto Lc0
        Lbf:
            r9 = r7
        Lc0:
            if (r9 == 0) goto La4
            r2.add(r4)
            goto La4
        Lc6:
            p000.C1080.m7279(r9)
            r0 = 0
            return r0
        Lcb:
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto Ldd
            ta1 r2 = new ta1
            java.lang.String r3 = "smart no food within maxPrice="
            java.lang.String r0 = p000.a12.m17(r3, r0)
            r2.<init>(r8, r1, r0)
            return r2
        Ldd:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r2.iterator()
        Le6:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L108
            java.lang.Object r3 = r2.next()
            r4 = r3
            ze1 r4 = (p000.ze1) r4
            java.lang.Integer r4 = r4.f13068
            if (r4 == 0) goto Lfc
            int r4 = r4.intValue()
            goto Lfd
        Lfc:
            r4 = r7
        Lfd:
            if (r4 <= 0) goto L101
            r4 = 1
            goto L102
        L101:
            r4 = r7
        L102:
            if (r4 == 0) goto Le6
            r1.add(r3)
            goto Le6
        L108:
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L11c
            ta1 r1 = new ta1
            java.lang.String r2 = "smart no positive closeness within maxPrice="
            java.lang.String r0 = p000.a12.m17(r2, r0)
            ua1 r2 = p000.ua1.f10668
            r1.<init>(r8, r2, r0)
            return r1
        L11c:
            java.util.Iterator r0 = r1.iterator()
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c2
            java.lang.Object r1 = r0.next()
        L12a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L198
            java.lang.Object r2 = r0.next()
            r10 = r2
            ze1 r10 = (p000.ze1) r10
            r11 = r1
            ze1 r11 = (p000.ze1) r11
            java.lang.Integer r1 = r10.f13066
            if (r1 == 0) goto L193
            int r14 = r1.intValue()
            java.lang.Integer r1 = r11.f13066
            if (r1 == 0) goto L18e
            int r15 = r1.intValue()
            java.lang.Integer r1 = r10.f13068
            if (r1 == 0) goto L189
            int r12 = r1.intValue()
            java.lang.Integer r1 = r11.f13068
            if (r1 == 0) goto L184
            int r13 = r1.intValue()
            if (r14 == 0) goto L174
            if (r15 != 0) goto L15f
            goto L174
        L15f:
            long r1 = (long) r12
            long r3 = (long) r15
            long r1 = r1 * r3
            long r3 = (long) r13
            long r6 = (long) r14
            long r3 = r3 * r6
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L16f
            if (r1 <= 0) goto L16d
        L16b:
            r1 = 1
            goto L17d
        L16d:
            r1 = 0
            goto L17d
        L16f:
            boolean r1 = m2271(r10, r11, r12, r13, r14, r15)
            goto L17d
        L174:
            if (r14 == r15) goto L179
            if (r14 != 0) goto L16d
            goto L16b
        L179:
            boolean r1 = m2271(r10, r11, r12, r13, r14, r15)
        L17d:
            if (r1 == 0) goto L181
            r1 = r10
            goto L182
        L181:
            r1 = r11
        L182:
            r7 = 0
            goto L12a
        L184:
            p000.C1080.m7279(r9)
            r0 = 0
            return r0
        L189:
            p000.C1080.m7279(r9)
            r0 = 0
            return r0
        L18e:
            p000.C1080.m7279(r9)
            r0 = 0
            return r0
        L193:
            p000.C1080.m7279(r9)
            r0 = 0
            return r0
        L198:
            ze1 r1 = (p000.ze1) r1
            ta1 r0 = new ta1
            java.lang.String r2 = r1.f13064
            java.lang.Integer r3 = r1.f13066
            java.lang.Integer r4 = r1.f13068
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "smart foodId="
            r6.<init>(r7)
            r6.append(r2)
            r6.append(r5)
            r6.append(r3)
            java.lang.String r2 = " closeness="
            r6.append(r2)
            r6.append(r4)
            java.lang.String r2 = r6.toString()
            r0.<init>(r1, r8, r2)
            return r0
        L1c2:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Empty collection can't be reduced."
            r0.<init>(r1)
            throw r0
        L1ca:
            java.lang.CharSequence r0 = p000.q02.m4660(r17)
            java.lang.String r0 = r0.toString()
            java.lang.Integer r0 = p000.x02.m6486(r0)
            java.lang.String r7 = "foodId="
            if (r0 == 0) goto L25c
            int r9 = r0.intValue()
            if (r9 <= 0) goto L1e1
            goto L1e2
        L1e1:
            r0 = r8
        L1e2:
            if (r0 == 0) goto L25c
            int r0 = r0.intValue()
            java.util.Iterator r9 = r18.iterator()
        L1ec:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L213
            java.lang.Object r10 = r9.next()
            r11 = r10
            ze1 r11 = (p000.ze1) r11
            java.lang.String r12 = r11.f13064
            java.lang.Integer r12 = p000.x02.m6487(r12, r4)
            if (r12 != 0) goto L203
        L201:
            r12 = 0
            goto L1ec
        L203:
            int r12 = r12.intValue()
            if (r12 != r0) goto L201
            java.lang.String r11 = r11.f13071
            r12 = 0
            boolean r11 = p000.x02.m6485(r11, r6, r12)
            if (r11 == 0) goto L1ec
            goto L215
        L213:
            r12 = 0
            r10 = r8
        L215:
            ze1 r10 = (p000.ze1) r10
            if (r10 != 0) goto L223
            ta1 r1 = new ta1
            java.lang.String r0 = p000.a12.m17(r7, r0)
            r1.<init>(r8, r3, r0)
            return r1
        L223:
            java.lang.Integer r3 = r10.f13066
            if (r3 == 0) goto L252
            int r2 = r3.intValue()
            if (r16 >= 0) goto L22e
            goto L230
        L22e:
            r12 = r16
        L230:
            if (r2 < 0) goto L23f
            if (r2 <= r12) goto L235
            goto L23f
        L235:
            ta1 r1 = new ta1
            java.lang.String r0 = p000.AbstractC0602nx.m4125(r0, r2, r7, r5)
            r1.<init>(r10, r8, r0)
            return r1
        L23f:
            ta1 r3 = new ta1
            java.lang.String r4 = " maxPrice="
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4136(r7, r0, r5, r2, r4)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            r3.<init>(r8, r1, r0)
            return r3
        L252:
            ta1 r1 = new ta1
            java.lang.String r0 = p000.a12.m17(r7, r0)
            r1.<init>(r8, r2, r0)
            return r1
        L25c:
            ta1 r0 = new ta1
            ua1 r1 = p000.ua1.f10664
            r2 = r17
            java.lang.String r2 = r7.concat(r2)
            r0.<init>(r8, r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: η */
    public static final p000.r92 m2274(android.view.View r3) {
        L0:
            r0 = 0
            if (r3 == 0) goto L22
            r1 = 2131297161(0x7f090389, float:1.821226E38)
            java.lang.Object r1 = r3.getTag(r1)
            boolean r2 = r1 instanceof p000.r92
            if (r2 == 0) goto L11
            r92 r1 = (p000.r92) r1
            goto L12
        L11:
            r1 = r0
        L12:
            if (r1 == 0) goto L15
            return r1
        L15:
            android.view.ViewParent r3 = p000.p91.m4429(r3)
            boolean r1 = r3 instanceof android.view.View
            if (r1 == 0) goto L20
            android.view.View r3 = (android.view.View) r3
            goto L0
        L20:
            r3 = r0
            goto L0
        L22:
            return r0
    }

    /* JADX INFO: renamed from: θ */
    public static final int m2275(int r1, int r2, int r3) {
            if (r3 <= 0) goto L18
            if (r1 < r2) goto L5
            goto L1c
        L5:
            int r0 = r2 % r3
            if (r0 < 0) goto La
            goto Lb
        La:
            int r0 = r0 + r3
        Lb:
            int r1 = r1 % r3
            if (r1 < 0) goto Lf
            goto L10
        Lf:
            int r1 = r1 + r3
        L10:
            int r0 = r0 - r1
            int r0 = r0 % r3
            if (r0 < 0) goto L15
            goto L16
        L15:
            int r0 = r0 + r3
        L16:
            int r2 = r2 - r0
            return r2
        L18:
            if (r3 >= 0) goto L31
            if (r1 > r2) goto L1d
        L1c:
            return r2
        L1d:
            int r3 = -r3
            int r1 = r1 % r3
            if (r1 < 0) goto L22
            goto L23
        L22:
            int r1 = r1 + r3
        L23:
            int r0 = r2 % r3
            if (r0 < 0) goto L28
            goto L29
        L28:
            int r0 = r0 + r3
        L29:
            int r1 = r1 - r0
            int r1 = r1 % r3
            if (r1 < 0) goto L2e
            goto L2f
        L2e:
            int r1 = r1 + r3
        L2f:
            int r1 = r1 + r2
            return r1
        L31:
            java.lang.String r1 = "Step is zero."
            p000.C1080.m7275(r1)
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ι */
    public static void m2276(byte r2, byte r3, byte r4, byte r5, char[] r6, int r7) {
            boolean r0 = m2279(r3)
            if (r0 != 0) goto L41
            int r0 = r2 << 28
            int r1 = r3 + 112
            int r1 = r1 + r0
            int r0 = r1 >> 30
            if (r0 != 0) goto L41
            boolean r0 = m2279(r4)
            if (r0 != 0) goto L41
            boolean r0 = m2279(r5)
            if (r0 != 0) goto L41
            r2 = r2 & 7
            int r2 = r2 << 18
            r3 = r3 & 63
            int r3 = r3 << 12
            r2 = r2 | r3
            r3 = r4 & 63
            int r3 = r3 << 6
            r2 = r2 | r3
            r3 = r5 & 63
            r2 = r2 | r3
            int r3 = r2 >>> 10
            r4 = 55232(0xd7c0, float:7.7397E-41)
            int r3 = r3 + r4
            char r3 = (char) r3
            r6[r7] = r3
            int r7 = r7 + 1
            r2 = r2 & 1023(0x3ff, float:1.434E-42)
            r3 = 56320(0xdc00, float:7.8921E-41)
            int r2 = r2 + r3
            char r2 = (char) r2
            r6[r7] = r2
            return
        L41:
            java.lang.String r2 = "Invalid UTF-8"
            p000.C1080.m7275(r2)
            return
    }

    /* JADX INFO: renamed from: κ */
    public static void m2277(byte r2, byte r3, byte r4, char[] r5, int r6) {
            boolean r0 = m2279(r3)
            if (r0 != 0) goto L2a
            r0 = -32
            r1 = -96
            if (r2 != r0) goto Le
            if (r3 < r1) goto L2a
        Le:
            r0 = -19
            if (r2 != r0) goto L14
            if (r3 >= r1) goto L2a
        L14:
            boolean r0 = m2279(r4)
            if (r0 != 0) goto L2a
            r2 = r2 & 15
            int r2 = r2 << 12
            r3 = r3 & 63
            int r3 = r3 << 6
            r2 = r2 | r3
            r3 = r4 & 63
            r2 = r2 | r3
            char r2 = (char) r2
            r5[r6] = r2
            return
        L2a:
            java.lang.String r2 = "Invalid UTF-8"
            p000.C1080.m7275(r2)
            return
    }

    /* JADX INFO: renamed from: λ */
    public static void m2278(byte r1, byte r2, char[] r3, int r4) {
            r0 = -62
            if (r1 < r0) goto L1b
            boolean r0 = m2279(r2)
            if (r0 != 0) goto L15
            r1 = r1 & 31
            int r1 = r1 << 6
            r2 = r2 & 63
            r1 = r1 | r2
            char r1 = (char) r1
            r3[r4] = r1
            return
        L15:
            java.lang.String r1 = "Invalid UTF-8: Illegal trailing byte in 2 bytes utf"
            p000.C1080.m7275(r1)
            return
        L1b:
            java.lang.String r1 = "Invalid UTF-8: Illegal leading byte in 2 bytes utf"
            p000.C1080.m7275(r1)
            return
    }

    /* JADX INFO: renamed from: μ */
    public static boolean m2279(byte r1) {
            r0 = -65
            if (r1 <= r0) goto L6
            r1 = 1
            return r1
        L6:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ν */
    public static java.util.LinkedHashSet m2280(java.lang.Object... r2) {
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            int r1 = r2.length
            int r1 = p000.ex0.m1970(r1)
            r0.<init>(r1)
            p000.AbstractC0312g7.m2260(r2, r0)
            return r0
    }

    /* JADX INFO: renamed from: ξ */
    public static p000.C0571n2 m2281(java.lang.String r8) {
            java.lang.String r0 = "HTTP/1."
            r1 = 0
            boolean r0 = p000.x02.m6485(r8, r0, r1)
            zj1 r2 = p000.zj1.f13130
            zj1 r3 = p000.zj1.f13131
            r4 = 4
            r5 = 32
            java.lang.String r6 = "Unexpected status line: "
            if (r0 == 0) goto L43
            int r0 = r8.length()
            r1 = 9
            if (r0 < r1) goto L39
            r0 = 8
            char r0 = r8.charAt(r0)
            if (r0 != r5) goto L39
            r0 = 7
            char r0 = r8.charAt(r0)
            int r0 = r0 + (-48)
            if (r0 == 0) goto L58
            r2 = 1
            if (r0 != r2) goto L2f
            goto L57
        L2f:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r8 = r6.concat(r8)
            r0.<init>(r8)
            throw r0
        L39:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r8 = r6.concat(r8)
            r0.<init>(r8)
            throw r0
        L43:
            java.lang.String r0 = "ICY "
            boolean r0 = p000.x02.m6485(r8, r0, r1)
            if (r0 == 0) goto L4d
            r1 = r4
            goto L58
        L4d:
            java.lang.String r0 = "SOURCETABLE "
            boolean r0 = p000.x02.m6485(r8, r0, r1)
            if (r0 == 0) goto La8
            r1 = 12
        L57:
            r2 = r3
        L58:
            int r0 = r8.length()
            int r3 = r1 + 3
            if (r0 < r3) goto L9e
            java.lang.String r0 = r8.substring(r1, r3)
            r7 = 10
            java.lang.Integer r0 = p000.x02.m6487(r0, r7)
            if (r0 == 0) goto L94
            int r0 = r0.intValue()
            int r7 = r8.length()
            if (r7 <= r3) goto L8c
            char r3 = r8.charAt(r3)
            if (r3 != r5) goto L82
            int r1 = r1 + r4
            java.lang.String r8 = r8.substring(r1)
            goto L8e
        L82:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r8 = r6.concat(r8)
            r0.<init>(r8)
            throw r0
        L8c:
            java.lang.String r8 = ""
        L8e:
            n2 r1 = new n2
            r1.<init>(r2, r0, r8)
            return r1
        L94:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r8 = r6.concat(r8)
            r0.<init>(r8)
            throw r0
        L9e:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r8 = r6.concat(r8)
            r0.<init>(r8)
            throw r0
        La8:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r8 = r6.concat(r8)
            r0.<init>(r8)
            throw r0
    }

    /* JADX INFO: renamed from: ο */
    public static java.util.LinkedHashSet m2282(java.util.Set r2, java.lang.Iterable r3) {
            r2.getClass()
            r3.getClass()
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L16
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            int r0 = r0.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L17
        L16:
            r0 = 0
        L17:
            if (r0 == 0) goto L23
            int r0 = r0.intValue()
            int r1 = r2.size()
            int r1 = r1 + r0
            goto L29
        L23:
            int r0 = r2.size()
            int r1 = r0 * 2
        L29:
            int r0 = p000.ex0.m1970(r1)
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>(r0)
            java.util.Collection r2 = (java.util.Collection) r2
            r1.addAll(r2)
            p000.AbstractC0984xh.m6660(r1, r3)
            return r1
    }

    /* JADX INFO: renamed from: π */
    public static p000.dg1 m2283(java.lang.ClassLoader r12) {
            java.lang.String r0 = "~782EF7E56DAA90CE216196979186EE07173230C07EC7B955655043860B0572D2407B2ADEC0485C53499C7F8EBC934EA3B314464AB988001F724BB5704A39B0EDA1F21A7FA62536758DB0270633EDBED2222E0CA39BFE2BD4B4BC8BFF9FDF5DA944B52ACC3A9791CED475140667EE"
            java.lang.String r0 = p000.jf0.m2957(r0)
            r1 = 1
            java.lang.Class.forName(r0, r1, r12)
            java.lang.String r0 = "~795CFE82AE87DC48225355B65A8474AC8888795688CFC505AE15E25FD8225B77922376F7D093130C882A9CBA64129A107BE6"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.Class r0 = java.lang.Class.forName(r0, r1, r12)
            java.lang.String r2 = "~794CAD4569E61E2D43B867359EB6123EE8F803FCDE2CE5CBCC882C4DF60C83B55AD3262C3530C1D94C839F8FE2D00D998C988938DED9"
            java.lang.String r2 = p000.jf0.m2957(r2)
            java.lang.Class r4 = java.lang.Class.forName(r2, r1, r12)
            java.lang.String r2 = "~79044D352DBF0EB9246C3DE0650F68A274DC64A27A148E69EA74DBD3D638B077E59FCB03"
            java.lang.String r2 = p000.jf0.m2957(r2)
            java.lang.Class r2 = java.lang.Class.forName(r2, r1, r12)
            java.lang.String r3 = "p70"
            java.lang.Class r8 = java.lang.Class.forName(r3, r1, r12)
            java.lang.reflect.Method[] r12 = r0.getMethods()
            r12.getClass()
            int r0 = r12.length
            r3 = 0
            r5 = r3
        L38:
            r6 = 0
            if (r5 >= r0) goto L68
            r7 = r12[r5]
            int r9 = r7.getModifiers()
            boolean r9 = java.lang.reflect.Modifier.isStatic(r9)
            if (r9 == 0) goto L65
            java.lang.String r9 = r7.getName()
            java.lang.String r10 = "getService"
            boolean r9 = p000.ln0.m3626(r9, r10)
            if (r9 == 0) goto L65
            java.lang.Class[] r9 = r7.getParameterTypes()
            java.lang.Class<java.lang.Class> r10 = java.lang.Class.class
            java.lang.Class[] r10 = new java.lang.Class[]{r10}
            boolean r9 = java.util.Arrays.equals(r9, r10)
            if (r9 == 0) goto L65
            r5 = r7
            goto L69
        L65:
            int r5 = r5 + 1
            goto L38
        L68:
            r5 = r6
        L69:
            if (r5 == 0) goto Led
            java.lang.reflect.Method[] r12 = r4.getMethods()
            r12.getClass()
            int r0 = r12.length
        L73:
            if (r3 >= r0) goto L99
            r7 = r12[r3]
            java.lang.Class[] r9 = r7.getParameterTypes()
            r9.getClass()
            int r9 = r9.length
            if (r9 != 0) goto L96
            java.lang.Class r9 = r7.getReturnType()
            java.lang.String r9 = r9.getName()
            java.lang.String r10 = "~7978C51E2BF10182948ED6FF3D5888FCAAC2ED466438382620E7ABFCD1AA5C97EB5E0F44E16F76BED4E798BCCD0F1F49DD1C27B07B1E9D10A08299"
            java.lang.String r10 = p000.jf0.m2957(r10)
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L96
            goto L9a
        L96:
            int r3 = r3 + 1
            goto L73
        L99:
            r7 = r6
        L9a:
            if (r7 == 0) goto Le7
            java.lang.reflect.Method[] r12 = r2.getMethods()
            r12.getClass()
            ss1 r12 = p000.AbstractC0312g7.m2232(r12)
            t00 r0 = new t00
            r2 = 7
            r0.<init>(r8, r2)
            y30 r2 = new y30
            r2.<init>(r12, r1, r0)
            x30 r12 = new x30
            r12.<init>(r2)
        Lb7:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto Ld1
            java.lang.Object r0 = r12.next()
            r2 = r0
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "ensurePluginWithLoading"
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 != 0) goto Lb7
            r6 = r0
        Ld1:
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            r5.setAccessible(r1)
            r7.setAccessible(r1)
            if (r6 == 0) goto Lde
            r6.setAccessible(r1)
        Lde:
            dg1 r3 = new dg1
            r11 = r7
            r7 = r6
            r6 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        Le7:
            java.lang.String r12 = "未找到宿主 IM 分享服务访问器"
            p000.ql1.m4936(r12)
            return r6
        Led:
            java.lang.String r12 = "未找到宿主 IM 服务查询入口"
            p000.ql1.m4936(r12)
            return r6
    }

    /* JADX INFO: renamed from: ρ */
    public static final p000.C0004a3 m2284(p000.C0063b3 r0, java.lang.String r1) {
            r0.getClass()
            android.graphics.RuntimeShader r0 = r0.f1437
            android.graphics.RenderEffect r0 = p000.AbstractC1124.m7321(r0, r1)
            r0.getClass()
            a3 r1 = new a3
            r1.<init>(r0)
            return r1
    }

    /* JADX INFO: renamed from: σ */
    public static p000.eg1 m2285(android.app.Activity r26, p000.ky1 r27, android.net.Uri r28) {
            r1 = r27
            kz r2 = p000.C0493kz.f6332
            java.lang.String r3 = "r86c859e3375e752"
            r26.getClass()
            java.lang.String r4 = r1.f6322
            r28.getClass()
            boolean r0 = p000.AbstractC0976x9.m6529()
            bg1 r10 = p000.bg1.f1703
            if (r0 != 0) goto L21
            eg1 r5 = new eg1
            r6 = 0
            r7 = -1
            r8 = -1
            java.lang.String r9 = "火星图片任务仅限内测用户使用"
            r5.<init>(r6, r7, r8, r9, r10)
            return r5
        L21:
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r5 = android.os.Looper.getMainLooper()
            boolean r0 = p000.ln0.m3626(r0, r5)
            if (r0 == 0) goto L3a
            eg1 r5 = new eg1
            r6 = 0
            r7 = -1
            r8 = -1
            java.lang.String r9 = "图片发送不能在主线程等待"
            r5.<init>(r6, r7, r8, r9, r10)
            return r5
        L3a:
            int r0 = r1.f6325
            r5 = 1
            if (r0 != r5) goto L4b5
            boolean r0 = p000.q02.m4671(r4)
            if (r0 == 0) goto L47
            goto L4b5
        L47:
            java.util.concurrent.atomic.AtomicReference r0 = p000.ry1.f9578
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L5f
            java.lang.Class r0 = r0.getClass()
            java.lang.ClassLoader r0 = r0.getClassLoader()
            if (r0 == 0) goto L5f
        L59:
            r7 = r28
            r6 = r0
            r0 = r26
            goto L68
        L5f:
            java.lang.Class r0 = r26.getClass()
            java.lang.ClassLoader r0 = r0.getClassLoader()
            goto L59
        L68:
            java.io.File r7 = m2272(r0, r7)     // Catch: java.lang.Throwable -> L490
            r6.getClass()
            java.lang.String r8 = "ready"
            r9 = 0
            r10 = 0
            dg1 r11 = m2283(r6)     // Catch: java.lang.Throwable -> L137
            java.lang.reflect.Method r12 = r11.f3154
            java.lang.Class r13 = r11.f3152
            java.lang.reflect.Method r14 = r11.f3153
            long r15 = java.lang.System.nanoTime()
            r17 = 5000000000(0x12a05f200, double:2.470328229E-314)
            long r15 = r15 + r17
            java.lang.Object[] r0 = new java.lang.Object[]{r13}     // Catch: java.lang.Throwable -> La5
            java.lang.Object r0 = r14.invoke(r10, r0)     // Catch: java.lang.Throwable -> La5
            if (r0 != 0) goto L93
            goto L9b
        L93:
            java.lang.Object r0 = r12.invoke(r0, r10)     // Catch: java.lang.Throwable -> La5
            if (r0 == 0) goto L9b
            r0 = r5
            goto L9c
        L9b:
            r0 = r9
        L9c:
            if (r0 == 0) goto La7
            cg1 r0 = new cg1     // Catch: java.lang.Throwable -> La5
            r0.<init>(r8, r5, r9)     // Catch: java.lang.Throwable -> La5
            goto L150
        La5:
            r0 = move-exception
            goto Laa
        La7:
            r17 = r10
            goto Lb0
        Laa:
            java.lang.Throwable r0 = m2291(r0)
            r17 = r0
        Lb0:
            java.lang.reflect.Method r0 = r11.f3155
            if (r0 != 0) goto Lb6
        Lb4:
            r0 = r10
            goto Ld7
        Lb6:
            java.lang.Class r11 = r11.f3156
            if (r11 != 0) goto Lbb
            goto Lb4
        Lbb:
            java.lang.Class[] r11 = new java.lang.Class[]{r11}     // Catch: java.lang.Throwable -> Ld2
            rh0 r9 = new rh0     // Catch: java.lang.Throwable -> Ld2
            r9.<init>(r5)     // Catch: java.lang.Throwable -> Ld2
            java.lang.Object r9 = java.lang.reflect.Proxy.newProxyInstance(r6, r11, r9)     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r11 = "dyhelperPetElfImage"
            java.lang.Object[] r9 = new java.lang.Object[]{r11, r9}     // Catch: java.lang.Throwable -> Ld2
            r0.invoke(r10, r9)     // Catch: java.lang.Throwable -> Ld2
            goto Lb4
        Ld2:
            r0 = move-exception
            java.lang.Throwable r0 = m2291(r0)
        Ld7:
            if (r0 == 0) goto Ldb
            r17 = r0
        Ldb:
            java.lang.Object[] r0 = new java.lang.Object[]{r13}     // Catch: java.lang.Throwable -> Lf8
            java.lang.Object r0 = r14.invoke(r10, r0)     // Catch: java.lang.Throwable -> Lf8
            if (r0 != 0) goto Le6
            goto Lee
        Le6:
            java.lang.Object r0 = r12.invoke(r0, r10)     // Catch: java.lang.Throwable -> Lf8
            if (r0 == 0) goto Lee
            r0 = r5
            goto Lef
        Lee:
            r0 = 0
        Lef:
            if (r0 == 0) goto Lff
            cg1 r0 = new cg1     // Catch: java.lang.Throwable -> Lf8
            r9 = 0
            r0.<init>(r8, r5, r9)     // Catch: java.lang.Throwable -> Lf8
            goto L150
        Lf8:
            r0 = move-exception
            java.lang.Throwable r0 = m2291(r0)
            r17 = r0
        Lff:
            r18 = 250(0xfa, double:1.235E-321)
            java.lang.Thread.sleep(r18)     // Catch: java.lang.InterruptedException -> L127
            long r18 = java.lang.System.nanoTime()
            int r0 = (r18 > r15 ? 1 : (r18 == r15 ? 0 : -1))
            if (r0 < 0) goto Ldb
            if (r17 == 0) goto L11d
            java.lang.String r0 = r17.getMessage()
            if (r0 != 0) goto L11f
            java.lang.Class r0 = r17.getClass()
            java.lang.String r0 = r0.getSimpleName()
            goto L11f
        L11d:
            java.lang.String r0 = "IM 分享服务仍未注册"
        L11f:
            cg1 r8 = new cg1
            r9 = 0
            r8.<init>(r0, r9, r5)
        L125:
            r0 = r8
            goto L150
        L127:
            r9 = 0
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            cg1 r0 = new cg1
            java.lang.String r8 = "等待宿主分享服务时线程被中断"
            r0.<init>(r8, r9, r5)
            goto L150
        L137:
            r0 = move-exception
            java.lang.Throwable r0 = m2291(r0)
            cg1 r8 = new cg1
            java.lang.String r11 = r0.getMessage()
            if (r11 != 0) goto L14c
            java.lang.Class r0 = r0.getClass()
            java.lang.String r11 = r0.getSimpleName()
        L14c:
            r8.<init>(r11, r9, r9)
            goto L125
        L150:
            boolean r8 = r0.f2107
            bg1 r16 = p000.bg1.f1708
            r9 = 4
            if (r8 != 0) goto L18f
            r7.delete()
            boolean r1 = r0.f2108
            if (r1 == 0) goto L160
            bg1 r16 = p000.bg1.f1705
        L160:
            r22 = r16
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "图片宿主服务未就绪 retryable="
            r2.<init>(r4)
            r2.append(r1)
            java.lang.String r1 = " detail="
            r2.append(r1)
            java.lang.String r0 = r0.f2109
            r2.append(r0)
            java.lang.String r1 = r2.toString()
            p000.C0888ux.m5979(r3, r1, r10, r9, r10)
            java.lang.String r1 = "图片发送服务未就绪: "
            java.lang.String r21 = r1.concat(r0)
            eg1 r17 = new eg1
            r18 = 0
            r19 = -1
            r20 = -1
            r17.<init>(r18, r19, r20, r21, r22)
            return r17
        L18f:
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r0.<init>(r5)
            java.util.concurrent.atomic.AtomicReference r8 = new java.util.concurrent.atomic.AtomicReference
            r8.<init>()
            java.util.concurrent.atomic.AtomicReference r24 = new java.util.concurrent.atomic.AtomicReference
            r24.<init>()
            java.lang.String r11 = "~782EF7E56DAA90CE216196979186EE07173230C07EC7B955655043860B0572D2407B2ADEC0485C53499C7F8EBC934EA3B314464AB988001F724BB5704A39B0EDA1F21A7FA62536758DB0270633EDBED2222E0CA39BFE2BD4B4BC8BFF9FDF5DA944B52ACC3A9791CED475140667EE"
            java.lang.String r11 = p000.jf0.m2957(r11)     // Catch: java.lang.Throwable -> L1d2
            java.lang.Class r11 = java.lang.Class.forName(r11, r5, r6)     // Catch: java.lang.Throwable -> L1d2
            java.lang.String r12 = "~7958639031A1A3555FFBD7E3E2CA3675A9033CAA03209EDEE70F5726DABA68B891882D861BFF0578ED8D991464924F96C0695E"
            java.lang.String r12 = p000.jf0.m2957(r12)     // Catch: java.lang.Throwable -> L1d2
            java.lang.Class r12 = java.lang.Class.forName(r12, r5, r6)     // Catch: java.lang.Throwable -> L1d2
            java.lang.String r13 = "~792076A9B9C3897798B4A2A50E99D3E242DBA6B193EF7A482FC1A71CE494839C8CD5B7BFB6235D086BAE98F49F"
            java.lang.String r13 = p000.jf0.m2957(r13)     // Catch: java.lang.Throwable -> L1d2
            java.lang.Class r13 = java.lang.Class.forName(r13, r5, r6)     // Catch: java.lang.Throwable -> L1d2
            java.lang.Object[] r14 = r13.getEnumConstants()     // Catch: java.lang.Throwable -> L1d2
            if (r14 == 0) goto L45f
            int r15 = r14.length     // Catch: java.lang.Throwable -> L1d2
            r17 = r5
            r5 = 0
        L1c6:
            if (r5 >= r15) goto L1f0
            r9 = r14[r5]     // Catch: java.lang.Throwable -> L1d2
            boolean r10 = r9 instanceof java.lang.Enum     // Catch: java.lang.Throwable -> L1d2
            if (r10 == 0) goto L1d5
            r10 = r9
            java.lang.Enum r10 = (java.lang.Enum) r10     // Catch: java.lang.Throwable -> L1d2
            goto L1d6
        L1d2:
            r0 = move-exception
            goto L467
        L1d5:
            r10 = 0
        L1d6:
            if (r10 == 0) goto L1dd
            java.lang.String r10 = r10.name()     // Catch: java.lang.Throwable -> L1d2
            goto L1de
        L1dd:
            r10 = 0
        L1de:
            java.lang.String r1 = "LYNX"
            boolean r1 = p000.ln0.m3626(r10, r1)     // Catch: java.lang.Throwable -> L1d2
            if (r1 == 0) goto L1e9
            r23 = r9
            goto L1f2
        L1e9:
            int r5 = r5 + 1
            r1 = r27
            r9 = 4
            r10 = 0
            goto L1c6
        L1f0:
            r23 = 0
        L1f2:
            if (r23 == 0) goto L45f
            java.lang.Class[] r1 = new java.lang.Class[]{r12}     // Catch: java.lang.Throwable -> L1d2
            zh0 r5 = new zh0     // Catch: java.lang.Throwable -> L1d2
            r9 = 2
            r5.<init>(r8, r0, r9)     // Catch: java.lang.Throwable -> L1d2
            java.lang.Object r22 = java.lang.reflect.Proxy.newProxyInstance(r6, r1, r5)     // Catch: java.lang.Throwable -> L1d2
            java.lang.reflect.Method[] r1 = r11.getMethods()     // Catch: java.lang.Throwable -> L1d2
            r1.getClass()     // Catch: java.lang.Throwable -> L1d2
            int r5 = r1.length     // Catch: java.lang.Throwable -> L1d2
            r6 = 0
        L20b:
            if (r6 >= r5) goto L24d
            r10 = r1[r6]     // Catch: java.lang.Throwable -> L1d2
            java.lang.Class[] r14 = r10.getParameterTypes()     // Catch: java.lang.Throwable -> L1d2
            int r15 = r14.length     // Catch: java.lang.Throwable -> L1d2
            r18 = r9
            r9 = 3
            if (r15 != r9) goto L248
            java.lang.Class<java.util.Map> r9 = java.util.Map.class
            r26 = 0
            r15 = r14[r26]     // Catch: java.lang.Throwable -> L1d2
            boolean r9 = r9.isAssignableFrom(r15)     // Catch: java.lang.Throwable -> L1d2
            if (r9 == 0) goto L248
            r9 = r14[r17]     // Catch: java.lang.Throwable -> L1d2
            java.lang.String r9 = r9.getName()     // Catch: java.lang.Throwable -> L1d2
            java.lang.String r15 = r12.getName()     // Catch: java.lang.Throwable -> L1d2
            boolean r9 = r9.equals(r15)     // Catch: java.lang.Throwable -> L1d2
            if (r9 == 0) goto L248
            r9 = r14[r18]     // Catch: java.lang.Throwable -> L1d2
            java.lang.String r9 = r9.getName()     // Catch: java.lang.Throwable -> L1d2
            java.lang.String r14 = r13.getName()     // Catch: java.lang.Throwable -> L1d2
            boolean r9 = r9.equals(r14)     // Catch: java.lang.Throwable -> L1d2
            if (r9 == 0) goto L248
            r19 = r10
            goto L251
        L248:
            int r6 = r6 + 1
            r9 = r18
            goto L20b
        L24d:
            r18 = r9
            r19 = 0
        L251:
            if (r19 == 0) goto L457
            r1 = 0
            java.lang.reflect.Constructor r5 = r11.getDeclaredConstructor(r1)     // Catch: java.lang.Throwable -> L1d2
            java.lang.Object r20 = r5.newInstance(r1)     // Catch: java.lang.Throwable -> L1d2
            java.lang.String r1 = "type"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r18)     // Catch: java.lang.Throwable -> L1d2
            l91 r9 = new l91     // Catch: java.lang.Throwable -> L1d2
            r9.<init>(r1, r5)     // Catch: java.lang.Throwable -> L1d2
            java.lang.String r1 = "cid"
            l91 r10 = new l91     // Catch: java.lang.Throwable -> L1d2
            r10.<init>(r1, r4)     // Catch: java.lang.Throwable -> L1d2
            java.lang.String r1 = "content"
            l91 r11 = new l91     // Catch: java.lang.Throwable -> L1d2
            r11.<init>(r1, r2)     // Catch: java.lang.Throwable -> L1d2
            java.lang.String r1 = "path"
            java.lang.String r4 = r7.getAbsolutePath()     // Catch: java.lang.Throwable -> L1d2
            l91 r12 = new l91     // Catch: java.lang.Throwable -> L1d2
            r12.<init>(r1, r4)     // Catch: java.lang.Throwable -> L1d2
            java.lang.String r1 = "need_snack_bar"
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L1d2
            l91 r13 = new l91     // Catch: java.lang.Throwable -> L1d2
            r13.<init>(r1, r4)     // Catch: java.lang.Throwable -> L1d2
            java.lang.String r1 = "snack_bar_bottom_offset"
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L1d2
            l91 r14 = new l91     // Catch: java.lang.Throwable -> L1d2
            r14.<init>(r1, r5)     // Catch: java.lang.Throwable -> L1d2
            java.lang.String r1 = "log_extra"
            java.lang.String r5 = "enter_from"
            java.lang.String r6 = "dyhelper_pet_task"
            l91 r15 = new l91     // Catch: java.lang.Throwable -> L1d2
            r15.<init>(r5, r6)     // Catch: java.lang.Throwable -> L1d2
            java.lang.String r5 = "enter_method"
            java.lang.String r6 = "configured_image_task"
            l91 r4 = new l91     // Catch: java.lang.Throwable -> L1d2
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L1d2
            l91[] r4 = new p000.l91[]{r15, r4}     // Catch: java.lang.Throwable -> L1d2
            java.util.Map r4 = p000.ex0.m1972(r4)     // Catch: java.lang.Throwable -> L1d2
            l91 r15 = new l91     // Catch: java.lang.Throwable -> L1d2
            r15.<init>(r1, r4)     // Catch: java.lang.Throwable -> L1d2
            l91[] r1 = new p000.l91[]{r9, r10, r11, r12, r13, r14, r15}     // Catch: java.lang.Throwable -> L1d2
            java.util.LinkedHashMap r21 = p000.ex0.m1969(r1)     // Catch: java.lang.Throwable -> L1d2
            android.os.Handler r1 = new android.os.Handler     // Catch: java.lang.Throwable -> L1d2
            android.os.Looper r4 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L1d2
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L1d2
            o90 r18 = new o90     // Catch: java.lang.Throwable -> L1d2
            r25 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)     // Catch: java.lang.Throwable -> L1d2
            r4 = r18
            r0 = r25
            boolean r1 = r1.post(r4)     // Catch: java.lang.Throwable -> L1d2
            if (r1 == 0) goto L44f
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.InterruptedException -> L2e1
            r4 = 60
            boolean r9 = r0.await(r4, r1)     // Catch: java.lang.InterruptedException -> L2e1
            goto L2e9
        L2e1:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            r9 = 0
        L2e9:
            if (r9 != 0) goto L307
            java.lang.String r0 = r7.getName()
            java.lang.String r1 = "图片 Bridge 等待超时，缓存稍后清理 file="
            java.lang.String r0 = p000.lz1.m3687(r1, r0)
            r1 = 4
            r2 = 0
            p000.C0888ux.m5979(r3, r0, r2, r1, r2)
            eg1 r4 = new eg1
            r5 = 0
            r6 = -1
            r7 = -1
            java.lang.String r8 = "图片发送等待超时，请稍后检查会话"
            bg1 r9 = p000.bg1.f1707
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        L307:
            r7.delete()
            java.lang.Object r0 = r24.get()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            bg1 r14 = p000.bg1.f1706
            java.lang.String r1 = "图片发送失败: "
            if (r0 == 0) goto L336
            java.lang.String r2 = "图片 Bridge 调用失败"
            p000.C0888ux.m5977(r3, r2, r0)
            java.lang.String r2 = r0.getMessage()
            if (r2 != 0) goto L329
            java.lang.Class r0 = r0.getClass()
            java.lang.String r2 = r0.getSimpleName()
        L329:
            java.lang.String r13 = r1.concat(r2)
            eg1 r9 = new eg1
            r10 = 0
            r11 = -1
            r12 = -1
            r9.<init>(r10, r11, r12, r13, r14)
            return r9
        L336:
            java.lang.Object r0 = r8.get()
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L33f
            r0 = r2
        L33f:
            java.lang.String r4 = "code"
            java.lang.Object r5 = r0.get(r4)
            boolean r6 = r5 instanceof java.lang.Number
            r7 = -1
            if (r6 == 0) goto L352
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
        L350:
            r10 = r5
            goto L365
        L352:
            if (r5 != 0) goto L355
            goto L364
        L355:
            java.lang.String r5 = r5.toString()
            java.lang.Integer r5 = p000.x02.m6486(r5)
            if (r5 == 0) goto L364
            int r5 = r5.intValue()
            goto L350
        L364:
            r10 = r7
        L365:
            java.lang.String r5 = "data"
            java.lang.Object r5 = r0.get(r5)
            boolean r6 = r5 instanceof java.util.Map
            if (r6 == 0) goto L372
            java.util.Map r5 = (java.util.Map) r5
            goto L373
        L372:
            r5 = 0
        L373:
            if (r5 == 0) goto L3a4
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            int r8 = r5.size()
            r6.<init>(r8)
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L386:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L3a5
            java.lang.Object r8 = r5.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r9 = r8.getKey()
            java.lang.Object r8 = r8.getValue()
            if (r9 == 0) goto L386
            java.lang.String r9 = r9.toString()
            r6.put(r9, r8)
            goto L386
        L3a4:
            r6 = 0
        L3a5:
            if (r6 != 0) goto L3a8
            goto L3a9
        L3a8:
            r2 = r6
        L3a9:
            java.lang.Object r4 = r2.get(r4)
            boolean r5 = r4 instanceof java.lang.Number
            if (r5 == 0) goto L3bb
            java.lang.Number r4 = (java.lang.Number) r4
            int r7 = r4.intValue()
        L3b7:
            r11 = r7
            r4 = r17
            goto L3cd
        L3bb:
            if (r4 != 0) goto L3be
            goto L3b7
        L3be:
            java.lang.String r4 = r4.toString()
            java.lang.Integer r4 = p000.x02.m6486(r4)
            if (r4 == 0) goto L3b7
            int r7 = r4.intValue()
            goto L3b7
        L3cd:
            if (r10 != r4) goto L3d3
            if (r11 != r4) goto L3d3
            r9 = r4
            goto L3d4
        L3d3:
            r9 = 0
        L3d4:
            ry1 r4 = p000.ry1.f9602
            java.lang.String r4 = p000.ry1.m5197(r27)
            if (r9 == 0) goto L3e4
            java.lang.String r0 = "图片已通过官方发送链提交给 "
            java.lang.String r0 = r0.concat(r4)
        L3e2:
            r12 = r0
            goto L426
        L3e4:
            java.lang.String r5 = "message"
            java.lang.Object r6 = r2.get(r5)
            if (r6 == 0) goto L3f2
            java.lang.String r6 = r6.toString()
            if (r6 != 0) goto L421
        L3f2:
            java.lang.String r6 = "msg"
            java.lang.Object r2 = r2.get(r6)
            if (r2 == 0) goto L3ff
            java.lang.String r6 = r2.toString()
            goto L421
        L3ff:
            java.lang.Object r2 = r0.get(r5)
            if (r2 == 0) goto L40a
            java.lang.String r2 = r2.toString()
            goto L40b
        L40a:
            r2 = 0
        L40b:
            if (r2 != 0) goto L420
            java.lang.Object r0 = r0.get(r6)
            if (r0 == 0) goto L418
            java.lang.String r0 = r0.toString()
            goto L419
        L418:
            r0 = 0
        L419:
            if (r0 != 0) goto L41e
            java.lang.String r6 = "宿主未返回成功状态"
            goto L421
        L41e:
            r6 = r0
            goto L421
        L420:
            r6 = r2
        L421:
            java.lang.String r0 = p000.lz1.m3687(r1, r6)
            goto L3e2
        L426:
            java.lang.String r0 = " bridge="
            java.lang.String r1 = " image="
            java.lang.String r2 = "图片回调 name="
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4135(r10, r2, r4, r0, r1)
            r0.append(r11)
            java.lang.String r1 = " success="
            r0.append(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            r1 = 4
            r2 = 0
            p000.C0888ux.m5988(r3, r0, r2, r1, r2)
            eg1 r8 = new eg1
            if (r9 == 0) goto L44a
            r13 = r2
            goto L44b
        L44a:
            r13 = r14
        L44b:
            r8.<init>(r9, r10, r11, r12, r13)
            return r8
        L44f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1d2
            java.lang.String r1 = "无法提交图片 Bridge 主线程调用"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1d2
            throw r0     // Catch: java.lang.Throwable -> L1d2
        L457:
            java.lang.NoSuchMethodException r0 = new java.lang.NoSuchMethodException     // Catch: java.lang.Throwable -> L1d2
            java.lang.String r1 = "未找到图片 Bridge 三参数入口"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1d2
            throw r0     // Catch: java.lang.Throwable -> L1d2
        L45f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1d2
            java.lang.String r1 = "未找到 LYNX Bridge 平台"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1d2
            throw r0     // Catch: java.lang.Throwable -> L1d2
        L467:
            r7.delete()
            java.lang.Throwable r0 = m2291(r0)
            java.lang.String r1 = "图片 Bridge 初始化失败"
            p000.C0888ux.m5977(r3, r1, r0)
            java.lang.String r1 = r0.getMessage()
            if (r1 != 0) goto L481
            java.lang.Class r0 = r0.getClass()
            java.lang.String r1 = r0.getSimpleName()
        L481:
            java.lang.String r0 = "图片发送链初始化失败: "
            java.lang.String r15 = r0.concat(r1)
            eg1 r11 = new eg1
            r12 = 0
            r13 = -1
            r14 = -1
            r11.<init>(r12, r13, r14, r15, r16)
            return r11
        L490:
            r0 = move-exception
            java.lang.String r1 = "SAF 图片缓存失败"
            p000.C0888ux.m5977(r3, r1, r0)
            java.lang.String r1 = r0.getMessage()
            if (r1 != 0) goto L4a4
            java.lang.Class r0 = r0.getClass()
            java.lang.String r1 = r0.getSimpleName()
        L4a4:
            java.lang.String r0 = "读取图片失败: "
            java.lang.String r6 = r0.concat(r1)
            eg1 r2 = new eg1
            r3 = 0
            r4 = -1
            r5 = -1
            bg1 r7 = p000.bg1.f1704
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        L4b5:
            eg1 r5 = new eg1
            r6 = 0
            r7 = -1
            r8 = -1
            java.lang.String r9 = "只支持有效的单聊会话"
            r5.<init>(r6, r7, r8, r9, r10)
            return r5
    }

    /* JADX INFO: renamed from: τ */
    public static final void m2286(p000.h81 r3, int r4, java.lang.Object r5) {
            java.lang.Object[] r0 = r3.f4625
            int r1 = r3.f4626
            o61[] r2 = r3.f4621
            int r3 = r3.f4622
            int r3 = r3 + (-1)
            r3 = r2[r3]
            int r3 = r3.f7965
            int r1 = r1 - r3
            int r1 = r1 + r4
            r0[r1] = r5
            return
    }

    /* JADX INFO: renamed from: υ */
    public static final void m2287(p000.h81 r3, int r4, java.lang.Object r5, int r6, java.lang.Object r7) {
            int r0 = r3.f4626
            o61[] r1 = r3.f4621
            int r2 = r3.f4622
            int r2 = r2 + (-1)
            r1 = r1[r2]
            int r1 = r1.f7965
            int r0 = r0 - r1
            java.lang.Object[] r3 = r3.f4625
            int r4 = r4 + r0
            r3[r4] = r5
            int r0 = r0 + r6
            r3[r0] = r7
            return
    }

    /* JADX INFO: renamed from: φ */
    public static java.util.Set m2288(java.lang.Object r0) {
            java.util.Set r0 = java.util.Collections.singleton(r0)
            r0.getClass()
            return r0
    }

    /* JADX INFO: renamed from: χ */
    public static final long m2289(long r5, long r7) {
            r0 = 32
            long r1 = r5 >> r0
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            long r2 = r7 >> r0
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            float r2 = r2 * r1
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r3
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            long r6 = r7 & r3
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            float r6 = r6 * r5
            int r5 = java.lang.Float.floatToRawIntBits(r2)
            long r7 = (long) r5
            int r5 = java.lang.Float.floatToRawIntBits(r6)
            long r5 = (long) r5
            long r7 = r7 << r0
            long r5 = r5 & r3
            long r5 = r5 | r7
            return r5
    }

    /* JADX INFO: renamed from: ψ */
    public static final void m2290(p000.x52 r12, p000.a80 r13) {
            r0 = r12
            q01 r0 = (p000.q01) r0
            q01 r1 = r0.f8771
            boolean r1 = r1.f8784
            if (r1 != 0) goto Le
            java.lang.String r1 = "visitSubtreeIf called on an unattached node"
            p000.am0.m178(r1)
        Le:
            k21 r1 = new k21
            r2 = 16
            q01[] r3 = new p000.q01[r2]
            r1.<init>(r3)
            q01 r0 = r0.f8771
            q01 r3 = r0.f8776
            if (r3 != 0) goto L21
            p000.h62.m2386(r1, r0)
            goto L24
        L21:
            r1.m3127(r3)
        L24:
            int r0 = r1.f5718
            if (r0 == 0) goto Lbb
            int r0 = r0 + (-1)
            java.lang.Object r0 = r1.m3136(r0)
            q01 r0 = (p000.q01) r0
            int r3 = r0.f8774
            r4 = 262144(0x40000, float:3.67342E-40)
            r3 = r3 & r4
            if (r3 == 0) goto Lb6
            r3 = r0
        L38:
            if (r3 == 0) goto Lb6
            boolean r5 = r3.f8784
            if (r5 == 0) goto Lb6
            int r5 = r3.f8773
            r5 = r5 & r4
            if (r5 == 0) goto Lb3
            r5 = 0
            r6 = r3
            r7 = r5
        L46:
            if (r6 == 0) goto Lb3
            boolean r8 = r6 instanceof p000.x52
            if (r8 == 0) goto L79
            x52 r6 = (p000.x52) r6
            java.lang.Object r8 = r12.mo3887()
            java.lang.Object r9 = r6.mo3887()
            boolean r8 = p000.ln0.m3626(r8, r9)
            if (r8 == 0) goto L6d
            java.lang.Class r8 = r12.getClass()
            java.lang.Class r9 = r6.getClass()
            if (r8 != r9) goto L6d
            java.lang.Object r6 = r13.invoke(r6)
            w52 r6 = (p000.w52) r6
            goto L6f
        L6d:
            w52 r6 = p000.w52.f11573
        L6f:
            w52 r8 = p000.w52.f11575
            if (r6 != r8) goto L74
            goto Lbb
        L74:
            w52 r8 = p000.w52.f11574
            if (r6 == r8) goto L24
            goto Lae
        L79:
            int r8 = r6.f8773
            r8 = r8 & r4
            if (r8 == 0) goto Lae
            boolean r8 = r6 instanceof p000.C1014ya
            if (r8 == 0) goto Lae
            r8 = r6
            ya r8 = (p000.C1014ya) r8
            q01 r8 = r8.f12512
            r9 = 0
        L88:
            r10 = 1
            if (r8 == 0) goto Lab
            int r11 = r8.f8773
            r11 = r11 & r4
            if (r11 == 0) goto La8
            int r9 = r9 + 1
            if (r9 != r10) goto L96
            r6 = r8
            goto La8
        L96:
            if (r7 != 0) goto L9f
            k21 r7 = new k21
            q01[] r10 = new p000.q01[r2]
            r7.<init>(r10)
        L9f:
            if (r6 == 0) goto La5
            r7.m3127(r6)
            r6 = r5
        La5:
            r7.m3127(r8)
        La8:
            q01 r8 = r8.f8776
            goto L88
        Lab:
            if (r9 != r10) goto Lae
            goto L46
        Lae:
            q01 r6 = p000.h62.m2387(r7)
            goto L46
        Lb3:
            q01 r3 = r3.f8776
            goto L38
        Lb6:
            p000.h62.m2386(r1, r0)
            goto L24
        Lbb:
            return
    }

    /* JADX INFO: renamed from: ω */
    public static java.lang.Throwable m2291(java.lang.Throwable r1) {
            boolean r0 = r1 instanceof java.lang.reflect.InvocationTargetException
            if (r0 == 0) goto L8
            r0 = r1
            java.lang.reflect.InvocationTargetException r0 = (java.lang.reflect.InvocationTargetException) r0
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto L13
            java.lang.Throwable r0 = r0.getTargetException()
            if (r0 != 0) goto L12
            goto L13
        L12:
            return r0
        L13:
            java.lang.Throwable r0 = r1.getCause()
            if (r0 != 0) goto L1a
            return r1
        L1a:
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public abstract void mo2292();
}
