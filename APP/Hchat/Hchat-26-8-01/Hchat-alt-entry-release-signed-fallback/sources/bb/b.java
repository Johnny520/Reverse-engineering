package bb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object f638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Object f639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Object f640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile java.lang.reflect.GenericDeclaration f641e;

    public b(android.content.Context r1, h.Hchat.dexkit.DexFinder r2, q8.o r3, j8.n r4, i8.f r5) {
            r0 = this;
            r0.<init>()
            r0.f637a = r1
            r0.f638b = r2
            r0.f639c = r3
            r0.f640d = r4
            return
    }

    public b(r8.g r1, ab.b r2, bb.c r3) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f637a = r1
            r0.f638b = r2
            r0.f639c = r3
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r0.f640d = r1
            return
    }

    public static java.lang.String b(java.lang.String... r4) {
            int r0 = r4.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L10
            r2 = r4[r1]
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto Ld
            return r2
        Ld:
            int r1 = r1 + 1
            goto L2
        L10:
            java.lang.String r4 = ""
            return r4
    }

    public static java.io.InputStream f(java.lang.ClassLoader r10, java.lang.String r11) {
            r0 = 0
            if (r10 == 0) goto L92
            boolean r1 = android.text.TextUtils.isEmpty(r11)
            if (r1 == 0) goto Lb
            goto L92
        Lb:
            java.lang.String r1 = "com.tencent.mm.vfs.w6"
            java.lang.String r2 = "com.tencent.mm.vfs.p6"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            r2 = 0
            r3 = r2
        L15:
            r4 = 2
            if (r3 >= r4) goto L92
            r5 = r1[r3]
            java.lang.Class r5 = h.Hchat.utils.KavaReflector.loadClass(r5, r10)
            if (r5 != 0) goto L22
            goto L8f
        L22:
            java.lang.String r6 = "E"
            java.lang.String r7 = "F"
            java.lang.String[] r6 = new java.lang.String[]{r6, r7}
            r7 = r2
        L2b:
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            if (r7 >= r4) goto L4b
            r9 = r6[r7]
            java.lang.Class[] r8 = new java.lang.Class[]{r8}
            java.lang.reflect.Method r8 = h.Hchat.utils.KavaReflector.findMethod(r5, r9, r8)
            java.lang.Object[] r9 = new java.lang.Object[]{r11}
            java.lang.Object r8 = h.Hchat.utils.KavaReflector.invoke(r8, r0, r9)
            boolean r9 = r8 instanceof java.io.InputStream
            if (r9 == 0) goto L48
            java.io.InputStream r8 = (java.io.InputStream) r8
            return r8
        L48:
            int r7 = r7 + 1
            goto L2b
        L4b:
            java.util.List r4 = h.Hchat.utils.KavaReflector.declaredMethods(r5)
            java.util.Iterator r4 = r4.iterator()
        L53:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L8f
            java.lang.Object r5 = r4.next()
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            int r6 = r5.getModifiers()
            boolean r6 = java.lang.reflect.Modifier.isStatic(r6)
            if (r6 != 0) goto L6a
            goto L53
        L6a:
            java.lang.Class r6 = r5.getReturnType()
            java.lang.Class<java.io.InputStream> r7 = java.io.InputStream.class
            if (r6 == r7) goto L73
            goto L53
        L73:
            java.lang.Class[] r6 = r5.getParameterTypes()
            int r7 = r6.length
            r9 = 1
            if (r7 != r9) goto L53
            r6 = r6[r2]
            if (r6 == r8) goto L80
            goto L53
        L80:
            java.lang.Object[] r6 = new java.lang.Object[]{r11}
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.invoke(r5, r0, r6)
            boolean r6 = r5 instanceof java.io.InputStream
            if (r6 == 0) goto L53
            java.io.InputStream r5 = (java.io.InputStream) r5
            return r5
        L8f:
            int r3 = r3 + 1
            goto L15
        L92:
            return r0
    }

    public static long h(java.lang.Object r5) {
            boolean r0 = r5 instanceof java.lang.Number
            r1 = 0
            if (r0 == 0) goto L11
            java.lang.Number r5 = (java.lang.Number) r5
            long r3 = r5.longValue()
            long r0 = java.lang.Math.max(r1, r3)
            return r0
        L11:
            if (r5 != 0) goto L14
            goto L25
        L14:
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L25
            java.lang.String r5 = r5.trim()     // Catch: java.lang.Throwable -> L25
            long r3 = java.lang.Long.parseLong(r5)     // Catch: java.lang.Throwable -> L25
            long r0 = java.lang.Math.max(r1, r3)     // Catch: java.lang.Throwable -> L25
            return r0
        L25:
            return r1
    }

    public static void i(java.lang.String r1, java.lang.String r2, java.util.LinkedHashMap r3) {
            if (r2 == 0) goto L7
            java.lang.String r2 = r2.trim()
            goto L9
        L7:
            java.lang.String r2 = ""
        L9:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L1f
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L1f
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L1c
            goto L1f
        L1c:
            r3.put(r1, r2)
        L1f:
            return
    }

    public static void r(android.os.AsyncTask r3, java.lang.String r4, java.lang.Object r5) {
            java.lang.Class r0 = r3.getClass()
            java.lang.reflect.Field r4 = h.Hchat.utils.KavaReflector.findFieldRecursive(r0, r4)
            if (r4 != 0) goto Lb
            goto L5f
        Lb:
            java.lang.Class r0 = r4.getType()     // Catch: java.lang.Throwable -> L5f
            java.lang.Class r1 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L5f
            r2 = 0
            if (r0 != r1) goto L26
            boolean r1 = r5 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L5f
            if (r1 == 0) goto L21
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L5f
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L5f
            if (r5 == 0) goto L21
            r2 = 1
        L21:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L5f
            goto L4e
        L26:
            java.lang.Class r1 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L5f
            if (r0 != r1) goto L39
            boolean r1 = r5 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L5f
            if (r1 == 0) goto L34
            java.lang.Number r5 = (java.lang.Number) r5     // Catch: java.lang.Throwable -> L5f
            int r2 = r5.intValue()     // Catch: java.lang.Throwable -> L5f
        L34:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L5f
            goto L4e
        L39:
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L5f
            if (r0 != r1) goto L4e
            boolean r1 = r5 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L5f
            if (r1 == 0) goto L48
            java.lang.Number r5 = (java.lang.Number) r5     // Catch: java.lang.Throwable -> L5f
            long r1 = r5.longValue()     // Catch: java.lang.Throwable -> L5f
            goto L4a
        L48:
            r1 = 0
        L4a:
            java.lang.Long r5 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L5f
        L4e:
            if (r5 == 0) goto L5c
            boolean r1 = r0.isPrimitive()     // Catch: java.lang.Throwable -> L5f
            if (r1 != 0) goto L5c
            boolean r0 = r0.isInstance(r5)     // Catch: java.lang.Throwable -> L5f
            if (r0 == 0) goto L5f
        L5c:
            h.Hchat.utils.KavaReflector.writeField(r4, r3, r5)     // Catch: java.lang.Throwable -> L5f
        L5f:
            return
    }

    public java.lang.String a(java.lang.String r10) {
            r9 = this;
            java.lang.String r0 = ""
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto Lf
            boolean r1 = eh.a.y(r0)
            if (r1 == 0) goto Lf
            return r0
        Lf:
            java.lang.String r1 = "生成视频缩略图失败: "
            java.lang.String r2 = "video_thumb_"
            android.media.MediaMetadataRetriever r3 = new android.media.MediaMetadataRetriever
            r3.<init>()
            r4 = 0
            r3.setDataSource(r10)     // Catch: java.lang.Throwable -> L95
            r5 = 0
            r7 = 2
            android.graphics.Bitmap r5 = r3.getFrameAtTime(r5, r7)     // Catch: java.lang.Throwable -> L95
            if (r5 != 0) goto L2e
            if (r5 == 0) goto L2a
        L27:
            r5.recycle()
        L2a:
            r3.release()     // Catch: java.lang.Throwable -> Lb5
            return r0
        L2e:
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r7 = r9.f637a     // Catch: java.lang.Throwable -> L4a
            android.content.Context r7 = (android.content.Context) r7     // Catch: java.lang.Throwable -> L4a
            java.io.File r7 = r7.getCacheDir()     // Catch: java.lang.Throwable -> L4a
            java.lang.String r8 = "Hchat_media"
            r6.<init>(r7, r8)     // Catch: java.lang.Throwable -> L4a
            boolean r7 = r6.isDirectory()     // Catch: java.lang.Throwable -> L4a
            if (r7 != 0) goto L4e
            boolean r7 = r6.mkdirs()     // Catch: java.lang.Throwable -> L4a
            if (r7 != 0) goto L4e
            goto L27
        L4a:
            r10 = move-exception
            r2 = r4
        L4c:
            r4 = r5
            goto L97
        L4e:
            java.io.File r7 = new java.io.File     // Catch: java.lang.Throwable -> L4a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4a
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L4a
            int r10 = r10.hashCode()     // Catch: java.lang.Throwable -> L4a
            java.lang.String r10 = java.lang.Integer.toHexString(r10)     // Catch: java.lang.Throwable -> L4a
            r8.append(r10)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r10 = ".jpg"
            r8.append(r10)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r10 = r8.toString()     // Catch: java.lang.Throwable -> L4a
            r7.<init>(r6, r10)     // Catch: java.lang.Throwable -> L4a
            java.io.FileOutputStream r10 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L4a
            r10.<init>(r7)     // Catch: java.lang.Throwable -> L4a
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> L90
            r4 = 85
            boolean r2 = r5.compress(r2, r4, r10)     // Catch: java.lang.Throwable -> L90
            if (r2 != 0) goto L85
            r10.close()     // Catch: java.lang.Throwable -> L7e
        L7e:
            r5.recycle()
        L81:
            r3.release()     // Catch: java.lang.Throwable -> Lb5
            goto Lb5
        L85:
            r10.flush()     // Catch: java.lang.Throwable -> L90
            java.lang.String r0 = r7.getAbsolutePath()     // Catch: java.lang.Throwable -> L90
            r10.close()     // Catch: java.lang.Throwable -> L7e
            goto L7e
        L90:
            r2 = move-exception
            r4 = r2
            r2 = r10
            r10 = r4
            goto L4c
        L95:
            r10 = move-exception
            r2 = r4
        L97:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb6
            r5.<init>(r1)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r10 = r10.getMessage()     // Catch: java.lang.Throwable -> Lb6
            r5.append(r10)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r10 = r5.toString()     // Catch: java.lang.Throwable -> Lb6
            r9.c(r10)     // Catch: java.lang.Throwable -> Lb6
            if (r2 == 0) goto Laf
            r2.close()     // Catch: java.lang.Throwable -> Laf
        Laf:
            if (r4 == 0) goto L81
            r4.recycle()
            goto L81
        Lb5:
            return r0
        Lb6:
            r10 = move-exception
            if (r2 == 0) goto Lbc
            r2.close()     // Catch: java.lang.Throwable -> Lbc
        Lbc:
            if (r4 == 0) goto Lc1
            r4.recycle()
        Lc1:
            r3.release()     // Catch: java.lang.Throwable -> Lc4
        Lc4:
            throw r10
    }

    public void c(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "[WeChatVideoApi] "
            java.lang.String r2 = r0.concat(r2)
            i8.i.f(r2)
            return
    }

    public synchronized java.lang.String d(java.lang.ClassLoader r7, java.lang.String r8) {
            r6 = this;
            java.lang.String r0 = "video_"
            monitor-enter(r6)
            boolean r1 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> Ld
            if (r1 == 0) goto L10
            java.lang.String r7 = ""
            monitor-exit(r6)
            return r7
        Ld:
            r7 = move-exception
            goto Lec
        L10:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> Ld
            r1.<init>(r8)     // Catch: java.lang.Throwable -> Ld
            boolean r2 = r1.isFile()     // Catch: java.lang.Throwable -> Ld
            if (r2 == 0) goto L21
            java.lang.String r7 = r1.getAbsolutePath()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r6)
            return r7
        L21:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> Ld
            java.lang.Object r2 = r6.f637a     // Catch: java.lang.Throwable -> Ld
            android.content.Context r2 = (android.content.Context) r2     // Catch: java.lang.Throwable -> Ld
            java.io.File r2 = r2.getCacheDir()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r3 = "Hchat_message_video"
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> Ld
            boolean r2 = r1.isDirectory()     // Catch: java.lang.Throwable -> Ld
            if (r2 != 0) goto L40
            boolean r2 = r1.mkdirs()     // Catch: java.lang.Throwable -> Ld
            if (r2 != 0) goto L40
            java.lang.String r7 = ""
            monitor-exit(r6)
            return r7
        L40:
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> Ld
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld
            r3.<init>(r0)     // Catch: java.lang.Throwable -> Ld
            int r0 = r8.hashCode()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r0 = java.lang.Integer.toHexString(r0)     // Catch: java.lang.Throwable -> Ld
            r3.append(r0)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r0 = ".mp4"
            r3.append(r0)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> Ld
            r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> Ld
            boolean r0 = r2.isFile()     // Catch: java.lang.Throwable -> Ld
            r3 = 0
            if (r0 == 0) goto L74
            long r0 = r2.length()     // Catch: java.lang.Throwable -> Ld
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L74
            java.lang.String r7 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r6)
            return r7
        L74:
            java.io.InputStream r7 = f(r7, r8)     // Catch: java.lang.Throwable -> Ld
            if (r7 != 0) goto L7e
            java.lang.String r7 = ""
            monitor-exit(r6)
            return r7
        L7e:
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lb3
            r0 = 0
            r8.<init>(r2, r0)     // Catch: java.lang.Throwable -> Lb3
            r1 = 8192(0x2000, float:1.148E-41)
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L92
        L88:
            int r5 = r7.read(r1)     // Catch: java.lang.Throwable -> L92
            if (r5 <= 0) goto L94
            r8.write(r1, r0, r5)     // Catch: java.lang.Throwable -> L92
            goto L88
        L92:
            r0 = move-exception
            goto Lb5
        L94:
            r8.close()     // Catch: java.lang.Throwable -> Lb3
            r7.close()     // Catch: java.lang.Throwable -> Lb1
            boolean r7 = r2.isFile()     // Catch: java.lang.Throwable -> Ld
            if (r7 == 0) goto Lad
            long r7 = r2.length()     // Catch: java.lang.Throwable -> Ld
            int r7 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r7 <= 0) goto Lad
            java.lang.String r7 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> Ld
            goto Laf
        Lad:
            java.lang.String r7 = ""
        Laf:
            monitor-exit(r6)
            return r7
        Lb1:
            r7 = move-exception
            goto Lc7
        Lb3:
            r8 = move-exception
            goto Lbe
        Lb5:
            r8.close()     // Catch: java.lang.Throwable -> Lb9
            goto Lbd
        Lb9:
            r8 = move-exception
            r0.addSuppressed(r8)     // Catch: java.lang.Throwable -> Lb3
        Lbd:
            throw r0     // Catch: java.lang.Throwable -> Lb3
        Lbe:
            r7.close()     // Catch: java.lang.Throwable -> Lc2
            goto Lc6
        Lc2:
            r7 = move-exception
            r8.addSuppressed(r7)     // Catch: java.lang.Throwable -> Lb1
        Lc6:
            throw r8     // Catch: java.lang.Throwable -> Lb1
        Lc7:
            boolean r8 = r2.exists()     // Catch: java.lang.Throwable -> Ld
            if (r8 == 0) goto Ld0
            r2.delete()     // Catch: java.lang.Throwable -> Ld
        Ld0:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld
            r8.<init>()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r0 = "读取视频VFS路径异常: "
            r8.append(r0)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r7 = r7.getMessage()     // Catch: java.lang.Throwable -> Ld
            r8.append(r7)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r7 = r8.toString()     // Catch: java.lang.Throwable -> Ld
            r6.c(r7)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r7 = ""
            monitor-exit(r6)
            return r7
        Lec:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Ld
            throw r7
    }

    public android.os.AsyncTask e() {
            r5 = this;
            java.lang.String r0 = "发送视频失败: Task类型不匹配 "
            java.lang.Object r1 = r5.f638b
            h.Hchat.dexkit.DexFinder r1 = (h.Hchat.dexkit.DexFinder) r1
            java.lang.Class<?> r1 = r1.sendVideoTaskClass
            r2 = 0
            if (r1 != 0) goto Lc
            return r2
        Lc:
            r3 = 0
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L29
            java.lang.reflect.Constructor r4 = h.Hchat.utils.KavaReflector.findConstructor(r1, r4)     // Catch: java.lang.Throwable -> L29
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L29
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.newInstance(r4, r3)     // Catch: java.lang.Throwable -> L29
            boolean r4 = r3 instanceof android.os.AsyncTask     // Catch: java.lang.Throwable -> L29
            if (r4 != 0) goto L2b
            java.lang.String r3 = r1.getName()     // Catch: java.lang.Throwable -> L29
            java.lang.String r0 = r0.concat(r3)     // Catch: java.lang.Throwable -> L29
            r5.c(r0)     // Catch: java.lang.Throwable -> L29
            return r2
        L29:
            r0 = move-exception
            goto L2e
        L2b:
            android.os.AsyncTask r3 = (android.os.AsyncTask) r3
            return r3
        L2e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "创建视频发送Task失败: "
            r3.<init>(r4)
            java.lang.String r1 = r1.getName()
            r3.append(r1)
            java.lang.String r1 = " "
            r3.append(r1)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r5.c(r0)
            return r2
    }

    public java.util.LinkedHashMap g(java.lang.String r11) {
            r10 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            boolean r1 = android.text.TextUtils.isEmpty(r11)
            if (r1 == 0) goto Ld
            goto Lcb
        Ld:
            r1 = 60
            int r1 = r11.indexOf(r1)
            if (r1 >= 0) goto L17
            goto Lcb
        L17:
            org.xmlpull.v1.XmlPullParser r2 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L9f
            java.io.StringReader r3 = new java.io.StringReader     // Catch: java.lang.Throwable -> L9f
            java.lang.String r11 = r11.substring(r1)     // Catch: java.lang.Throwable -> L9f
            r3.<init>(r11)     // Catch: java.lang.Throwable -> L9f
            r11 = r2
            b8.a r11 = (b8.a) r11     // Catch: java.lang.Throwable -> L9f
            r11.f1068n = r3     // Catch: java.lang.Throwable -> L9f
            r1 = 0
            r11.f1075u = r1     // Catch: java.lang.Throwable -> L9f
            r11.C = r1     // Catch: java.lang.Throwable -> L9f
            r4 = 0
            r11.f1079y = r4     // Catch: java.lang.Throwable -> L9f
            r11.f1077w = r4     // Catch: java.lang.Throwable -> L9f
            r11.A = r1     // Catch: java.lang.Throwable -> L9f
            r5 = -1
            r11.B = r5     // Catch: java.lang.Throwable -> L9f
            r11.f1071q = r1     // Catch: java.lang.Throwable -> L9f
            r11.f1072r = r1     // Catch: java.lang.Throwable -> L9f
            r11.f1073s = r1     // Catch: java.lang.Throwable -> L9f
            r11.f1074t = r1     // Catch: java.lang.Throwable -> L9f
            r11.f1064j = r1     // Catch: java.lang.Throwable -> L9f
            r11.f1062h = r4     // Catch: java.lang.Throwable -> L9f
            r11.f504e0 = r3     // Catch: java.lang.Throwable -> L9f
            r11 = r2
            c8.b r11 = (c8.b) r11     // Catch: java.lang.Throwable -> L9f
            int r11 = r11.f1075u     // Catch: java.lang.Throwable -> L9f
            r3 = r4
        L4c:
            r5 = 1
            if (r11 == r5) goto Lcb
            r5 = 2
            if (r11 != r5) goto Laf
            r11 = r2
            c8.b r11 = (c8.b) r11     // Catch: java.lang.Throwable -> L9f
            java.lang.String r11 = r11.f1079y     // Catch: java.lang.Throwable -> L9f
            java.lang.String r3 = ""
            if (r11 == 0) goto L66
            java.lang.String r11 = r11.trim()     // Catch: java.lang.Throwable -> L9f
            java.util.Locale r5 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L9f
            java.lang.String r11 = r11.toLowerCase(r5)     // Catch: java.lang.Throwable -> L9f
            goto L67
        L66:
            r11 = r3
        L67:
            r5 = r1
        L68:
            r6 = r2
            c8.b r6 = (c8.b) r6     // Catch: java.lang.Throwable -> L9f
            int r6 = r6.B     // Catch: java.lang.Throwable -> L9f
            if (r5 >= r6) goto Lad
            r6 = r2
            c8.b r6 = (c8.b) r6     // Catch: java.lang.Throwable -> L9f
            int r7 = r6.B     // Catch: java.lang.Throwable -> L9f
            if (r5 >= r7) goto La7
            java.lang.String[] r6 = r6.D     // Catch: java.lang.Throwable -> L9f
            int r7 = r5 * 4
            int r8 = r7 + 2
            r6 = r6[r8]     // Catch: java.lang.Throwable -> L9f
            if (r6 == 0) goto L8b
            java.lang.String r6 = r6.trim()     // Catch: java.lang.Throwable -> L9f
            java.util.Locale r8 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L9f
            java.lang.String r6 = r6.toLowerCase(r8)     // Catch: java.lang.Throwable -> L9f
            goto L8c
        L8b:
            r6 = r3
        L8c:
            r8 = r2
            c8.b r8 = (c8.b) r8     // Catch: java.lang.Throwable -> L9f
            int r9 = r8.B     // Catch: java.lang.Throwable -> L9f
            if (r5 >= r9) goto La1
            java.lang.String[] r8 = r8.D     // Catch: java.lang.Throwable -> L9f
            int r7 = r7 + 3
            r7 = r8[r7]     // Catch: java.lang.Throwable -> L9f
            i(r6, r7, r0)     // Catch: java.lang.Throwable -> L9f
            int r5 = r5 + 1
            goto L68
        L9f:
            r11 = move-exception
            goto Lcc
        La1:
            java.lang.IndexOutOfBoundsException r11 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.Throwable -> L9f
            r11.<init>()     // Catch: java.lang.Throwable -> L9f
            throw r11     // Catch: java.lang.Throwable -> L9f
        La7:
            java.lang.IndexOutOfBoundsException r11 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.Throwable -> L9f
            r11.<init>()     // Catch: java.lang.Throwable -> L9f
            throw r11     // Catch: java.lang.Throwable -> L9f
        Lad:
            r3 = r11
            goto Lc3
        Laf:
            r5 = 4
            if (r11 != r5) goto Lbf
            if (r3 == 0) goto Lbf
            r11 = r2
            c8.b r11 = (c8.b) r11     // Catch: java.lang.Throwable -> L9f
            java.lang.String r11 = r11.h()     // Catch: java.lang.Throwable -> L9f
            i(r3, r11, r0)     // Catch: java.lang.Throwable -> L9f
            goto Lc3
        Lbf:
            r5 = 3
            if (r11 != r5) goto Lc3
            r3 = r4
        Lc3:
            r11 = r2
            b8.a r11 = (b8.a) r11     // Catch: java.lang.Throwable -> L9f
            int r11 = r11.z()     // Catch: java.lang.Throwable -> L9f
            goto L4c
        Lcb:
            return r0
        Lcc:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "解析视频reserved4失败: "
            r1.<init>(r2)
            java.lang.String r11 = r11.getMessage()
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r10.c(r11)
            return r0
    }

    public void j(java.lang.String r8) {
            r7 = this;
            java.lang.Object r0 = r7.f640d
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            if (r8 == 0) goto Lf
            java.lang.CharSequence r8 = og.m.R0(r8)
            java.lang.String r8 = r8.toString()
            goto L10
        Lf:
            r8 = 0
        L10:
            if (r8 != 0) goto L14
            java.lang.String r8 = ""
        L14:
            og.k r1 = bb.l.f693c
            boolean r1 = zb.c.b(r8)
            if (r1 != 0) goto L1d
            goto L53
        L1d:
            g8.i r1 = wb.en.c()
            if (r1 == 0) goto L37
            h.Hchat.hooks.api.model.WeChatContact r1 = r1.n(r8)
            if (r1 == 0) goto L37
            int r2 = r1.gender
            if (r2 == 0) goto L37
            java.lang.String r1 = r1.getRegion()
            boolean r1 = og.m.t0(r1)
            if (r1 == 0) goto L53
        L37:
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.Object r3 = r0.get(r8)
            java.lang.Long r3 = (java.lang.Long) r3
            if (r3 == 0) goto L48
            long r3 = r3.longValue()
            goto L4a
        L48:
            r3 = 0
        L4a:
            long r3 = r1 - r3
            r5 = 600000(0x927c0, double:2.964394E-318)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L54
        L53:
            return
        L54:
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.put(r8, r1)
            o8.j r0 = h.Hchat.hooks.api.core.WeChatApis.tasks()
            if (r0 == 0) goto L6b
            bb.a r1 = new bb.a
            r2 = 0
            r1.<init>(r7, r8, r2)
            r0.d(r1)
            return
        L6b:
            java.lang.Thread r0 = new java.lang.Thread
            bb.a r1 = new bb.a
            r2 = 1
            r1.<init>(r7, r8, r2)
            r0.<init>(r1)
            r0.start()
            return
    }

    public void k(java.lang.String r6) {
            r5 = this;
            java.lang.String r0 = "real_tail_profile_refresh_"
            boolean r1 = r5.l(r6)     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            boolean r1 = r5.m(r6)     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto L26
            goto L11
        Lf:
            r6 = move-exception
            goto L27
        L11:
            o8.j r1 = h.Hchat.hooks.api.core.WeChatApis.tasks()     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto L26
            java.lang.String r0 = r0.concat(r6)     // Catch: java.lang.Throwable -> Lf
            bb.a r2 = new bb.a     // Catch: java.lang.Throwable -> Lf
            r3 = 2
            r2.<init>(r5, r6, r3)     // Catch: java.lang.Throwable -> Lf
            r3 = 2500(0x9c4, double:1.235E-320)
            r1.f(r0, r3, r2)     // Catch: java.lang.Throwable -> Lf
        L26:
            return
        L27:
            java.lang.Object r0 = r5.f638b
            ab.b r0 = (ab.b) r0
            java.lang.String r1 = "联系人资料预取失败"
            r0.invoke(r1, r6)
            return
    }

    public boolean l(java.lang.String r14) {
            r13 = this;
            java.lang.Object r0 = r13.f637a
            r8.g r0 = (r8.g) r0
            h.Hchat.dexkit.DexFinder r1 = r0.f11624e
            java.util.List<java.lang.reflect.Method> r1 = r1.getContactAddMethods
            r2 = 0
            if (r1 == 0) goto L10c
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L10c
            java.lang.Object r3 = r1.next()
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            r3.getClass()
            java.lang.Class r4 = r3.getDeclaringClass()
            r5 = 0
            if (r4 == 0) goto L62
            java.lang.Object r6 = r13.p(r4)
            if (r6 == 0) goto L2c
            goto L63
        L2c:
            h.Hchat.dexkit.DexFinder r6 = r0.f11624e
            java.lang.Object r7 = ig.a.A(r6, r4)
            if (r7 == 0) goto L36
            r6 = r7
            goto L63
        L36:
            java.lang.Class[] r7 = r4.getInterfaces()
            r7.getClass()
            int r8 = r7.length
            r9 = r2
        L3f:
            if (r9 < r8) goto L4a
            java.lang.Class r4 = r4.getSuperclass()
            java.lang.Object r6 = ig.a.A(r6, r4)
            goto L63
        L4a:
            r10 = r7[r9]
            r10.getClass()
            java.lang.Object r11 = r13.p(r10)
            if (r11 == 0) goto L57
            r6 = r11
            goto L63
        L57:
            java.lang.Object r10 = ig.a.A(r6, r10)
            if (r10 == 0) goto L5f
            r6 = r10
            goto L63
        L5f:
            int r9 = r9 + 1
            goto L3f
        L62:
            r6 = r5
        L63:
            if (r6 == 0) goto Lf
            java.lang.Class[] r4 = r3.getParameterTypes()
            r7 = 1
            if (r4 == 0) goto Lbf
            int r8 = r4.length
            java.lang.String r9 = ""
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            r11 = 2
            if (r8 != r11) goto L8b
            r8 = r4[r2]
            boolean r8 = gg.l.a(r8, r10)
            if (r8 == 0) goto L8b
            r8 = r4[r7]
            boolean r8 = gg.l.a(r8, r10)
            if (r8 == 0) goto L8b
            java.lang.Object[] r5 = new java.lang.Object[r11]
            r5[r2] = r14
            r5[r7] = r9
            goto Lbf
        L8b:
            int r8 = r4.length
            r12 = 3
            if (r8 != r12) goto Lbf
            r8 = r4[r2]
            boolean r8 = gg.l.a(r8, r10)
            if (r8 == 0) goto Lbf
            r8 = r4[r7]
            boolean r8 = gg.l.a(r8, r10)
            if (r8 == 0) goto Lbf
            r8 = r4[r11]
            java.lang.Class r10 = java.lang.Integer.TYPE
            boolean r8 = gg.l.a(r8, r10)
            if (r8 != 0) goto Lb3
            r4 = r4[r11]
            java.lang.Class<java.lang.Integer> r8 = java.lang.Integer.class
            boolean r4 = gg.l.a(r4, r8)
            if (r4 == 0) goto Lbf
        Lb3:
            java.lang.Object[] r5 = new java.lang.Object[r12]
            r5[r2] = r14
            r5[r7] = r9
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r5[r11] = r4
        Lbf:
            if (r5 == 0) goto Lf
            java.lang.Class r4 = r3.getDeclaringClass()
            boolean r4 = r4.isInstance(r6)
            if (r4 == 0) goto Lcc
            goto Lfe
        Lcc:
            java.lang.Class r4 = r6.getClass()
            java.lang.String r8 = r3.getName()
            java.lang.Class[] r9 = r3.getParameterTypes()
            int r10 = r9.length
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r10)
            java.lang.Class[] r9 = (java.lang.Class[]) r9
            java.lang.reflect.Method r4 = h.Hchat.utils.KavaReflector.findDeclaredMethod(r4, r8, r9)
            if (r4 == 0) goto Le7
            r3 = r4
            goto Lfe
        Le7:
            java.lang.Class r4 = r6.getClass()
            java.lang.String r8 = r3.getName()
            java.lang.Class[] r3 = r3.getParameterTypes()
            int r9 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r9)
            java.lang.Class[] r3 = (java.lang.Class[]) r3
            java.lang.reflect.Method r3 = h.Hchat.utils.KavaReflector.findMethod(r4, r8, r3)
        Lfe:
            if (r3 == 0) goto Lf
            int r4 = r5.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r5, r4)
            boolean r3 = h.Hchat.utils.KavaReflector.invokeSuccessfully(r3, r6, r4)
            if (r3 == 0) goto Lf
            return r7
        L10c:
            return r2
    }

    public boolean m(java.lang.String r14) {
            r13 = this;
            java.lang.reflect.GenericDeclaration r0 = r13.f641e
            java.lang.Class r0 = (java.lang.Class) r0
            r1 = 1
            r2 = 0
            r3 = 182(0xb6, float:2.55E-43)
            r4 = 0
            if (r0 == 0) goto Lc
            goto L2c
        Lc:
            java.lang.Object r0 = r13.f637a     // Catch: java.lang.Throwable -> L19
            r8.g r0 = (r8.g) r0     // Catch: java.lang.Throwable -> L19
            h.Hchat.dexkit.DexFinder r0 = r0.f11624e     // Catch: java.lang.Throwable -> L19
            java.lang.String r5 = "/cgi-bin/micromsg-bin/getcontact"
            java.lang.Class r0 = r0.findNativeNetSceneClass(r5, r3)     // Catch: java.lang.Throwable -> L19
            goto L24
        L19:
            r0 = move-exception
            java.lang.Object r5 = r13.f638b
            ab.b r5 = (ab.b) r5
            java.lang.String r6 = "定位联系人资料请求失败"
            r5.invoke(r6, r0)
            r0 = r4
        L24:
            if (r0 == 0) goto L29
            r13.f641e = r0
            goto L2a
        L29:
            r0 = r4
        L2a:
            if (r0 == 0) goto Ld0
        L2c:
            java.util.List r0 = h.Hchat.utils.KavaReflector.declaredConstructors(r0)
            java.util.Iterator r0 = r0.iterator()
        L34:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto Ld0
            java.lang.Object r5 = r0.next()
            java.lang.reflect.Constructor r5 = (java.lang.reflect.Constructor) r5
            java.lang.Class[] r6 = r5.getParameterTypes()
            if (r6 == 0) goto L49
            int r7 = r6.length
            if (r7 != 0) goto L4c
        L49:
            r7 = r4
            goto Lae
        L4c:
            int r7 = r6.length
            java.lang.Object[] r7 = new java.lang.Object[r7]
            int r8 = r6.length
            r9 = r2
            r10 = r9
        L52:
            if (r9 < r8) goto L57
            if (r10 == 0) goto L49
            goto Lae
        L57:
            r11 = r6[r9]
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            boolean r12 = gg.l.a(r11, r12)
            if (r12 == 0) goto L65
            r7[r9] = r14
            r10 = r1
            goto Lab
        L65:
            java.lang.Class r12 = java.lang.Integer.TYPE
            boolean r12 = gg.l.a(r11, r12)
            if (r12 != 0) goto La5
            java.lang.Class<java.lang.Integer> r12 = java.lang.Integer.class
            boolean r12 = gg.l.a(r11, r12)
            if (r12 == 0) goto L76
            goto La5
        L76:
            java.lang.Class r12 = java.lang.Long.TYPE
            boolean r12 = gg.l.a(r11, r12)
            if (r12 != 0) goto L9c
            java.lang.Class<java.lang.Long> r12 = java.lang.Long.class
            boolean r12 = gg.l.a(r11, r12)
            if (r12 == 0) goto L87
            goto L9c
        L87:
            java.lang.Class r12 = java.lang.Boolean.TYPE
            boolean r12 = gg.l.a(r11, r12)
            if (r12 != 0) goto L97
            java.lang.Class<java.lang.Boolean> r12 = java.lang.Boolean.class
            boolean r11 = gg.l.a(r11, r12)
            if (r11 == 0) goto L49
        L97:
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            r7[r9] = r11
            goto Lab
        L9c:
            r11 = 0
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r7[r9] = r11
            goto Lab
        La5:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            r7[r9] = r11
        Lab:
            int r9 = r9 + 1
            goto L52
        Lae:
            if (r7 == 0) goto L34
            java.lang.Object[] r6 = new java.lang.Object[]{r7}
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.newInstance(r5, r6)
            if (r5 == 0) goto L34
            r6 = -1
            java.lang.String r7 = "getType"
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> Lcd
            java.lang.Object r7 = h.Hchat.utils.KavaReflector.invokeMethod(r5, r7, r8)     // Catch: java.lang.Throwable -> Lcd
            boolean r8 = r7 instanceof java.lang.Number     // Catch: java.lang.Throwable -> Lcd
            if (r8 == 0) goto Lcd
            java.lang.Number r7 = (java.lang.Number) r7     // Catch: java.lang.Throwable -> Lcd
            int r6 = r7.intValue()     // Catch: java.lang.Throwable -> Lcd
        Lcd:
            if (r6 != r3) goto L34
            r4 = r5
        Ld0:
            if (r4 == 0) goto Le3
            m8.a r14 = h.Hchat.hooks.api.core.WeChatApis.network()
            if (r14 == 0) goto Le3
            m8.c r14 = r14.f8777a
            boolean r14 = r14.j(r4)
            if (r14 != r1) goto Le1
            goto Le2
        Le1:
            r1 = r2
        Le2:
            r2 = r1
        Le3:
            return r2
    }

    public j8.r n(java.lang.String r14) {
            r13 = this;
            java.lang.String r0 = "totallen"
            java.lang.Object r1 = r13.f638b
            h.Hchat.dexkit.DexFinder r1 = (h.Hchat.dexkit.DexFinder) r1
            java.lang.reflect.Method r1 = r1.videoInfoByFileNameMethod
            boolean r2 = android.text.TextUtils.isEmpty(r14)
            r3 = 0
            if (r2 != 0) goto L136
            if (r1 == 0) goto L136
            boolean r2 = h.Hchat.utils.KavaReflector.isStatic(r1)
            if (r2 != 0) goto L19
            goto L136
        L19:
            java.lang.Object[] r14 = new java.lang.Object[]{r14}     // Catch: java.lang.Throwable -> Lf2
            java.lang.Object r14 = h.Hchat.utils.KavaReflector.invoke(r1, r3, r14)     // Catch: java.lang.Throwable -> Lf2
            if (r14 != 0) goto L25
            goto L136
        L25:
            java.lang.Class r1 = r14.getClass()     // Catch: java.lang.Throwable -> Lf2
            java.lang.reflect.GenericDeclaration r2 = r13.f641e     // Catch: java.lang.Throwable -> Lf2
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch: java.lang.Throwable -> Lf2
            if (r2 == 0) goto L3a
            java.lang.Class r4 = r2.getDeclaringClass()     // Catch: java.lang.Throwable -> Lf2
            boolean r4 = r4.isAssignableFrom(r1)     // Catch: java.lang.Throwable -> Lf2
            if (r4 == 0) goto L3a
            goto L6a
        L3a:
            java.util.List r1 = h.Hchat.utils.KavaReflector.declaredMethods(r1)     // Catch: java.lang.Throwable -> Lf2
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Lf2
            r2 = r3
        L43:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> Lf2
            if (r4 == 0) goto L68
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> Lf2
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4     // Catch: java.lang.Throwable -> Lf2
            java.lang.Class[] r5 = r4.getParameterTypes()     // Catch: java.lang.Throwable -> Lf2
            int r5 = r5.length     // Catch: java.lang.Throwable -> Lf2
            if (r5 != 0) goto L43
            java.lang.Class r5 = r4.getReturnType()     // Catch: java.lang.Throwable -> Lf2
            java.lang.Class<android.content.ContentValues> r6 = android.content.ContentValues.class
            if (r5 == r6) goto L5f
            goto L43
        L5f:
            if (r2 == 0) goto L63
            r2 = r3
            goto L6a
        L63:
            java.lang.reflect.Method r2 = h.Hchat.utils.KavaReflector.accessible(r4)     // Catch: java.lang.Throwable -> Lf2
            goto L43
        L68:
            r13.f641e = r2     // Catch: java.lang.Throwable -> Lf2
        L6a:
            r1 = 0
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Lf2
            java.lang.Object r14 = h.Hchat.utils.KavaReflector.invoke(r2, r14, r4)     // Catch: java.lang.Throwable -> Lf2
            android.content.ContentValues r14 = (android.content.ContentValues) r14     // Catch: java.lang.Throwable -> Lf2
            if (r14 != 0) goto L77
            goto L136
        L77:
            java.lang.String r2 = "reserved4"
            java.lang.String r2 = r14.getAsString(r2)     // Catch: java.lang.Throwable -> Lf2
            java.util.LinkedHashMap r2 = r13.g(r2)     // Catch: java.lang.Throwable -> Lf2
            java.lang.String r4 = "md5"
            java.lang.Object r4 = r2.get(r4)     // Catch: java.lang.Throwable -> Lf2
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> Lf2
            java.lang.String r5 = "newmd5"
            java.lang.Object r5 = r2.get(r5)     // Catch: java.lang.Throwable -> Lf2
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> Lf2
            java.lang.String r6 = "videomd5"
            java.lang.String r6 = r14.getAsString(r6)     // Catch: java.lang.Throwable -> Lf2
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6}     // Catch: java.lang.Throwable -> Lf2
            java.lang.String r6 = b(r4)     // Catch: java.lang.Throwable -> Lf2
            java.lang.String r4 = "cdnvideourl"
            java.lang.Object r4 = r2.get(r4)     // Catch: java.lang.Throwable -> Lf2
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> Lf2
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> Lf2
            java.lang.String r7 = b(r4)     // Catch: java.lang.Throwable -> Lf2
            java.lang.String r4 = "aeskey"
            java.lang.Object r4 = r2.get(r4)     // Catch: java.lang.Throwable -> Lf2
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> Lf2
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> Lf2
            java.lang.String r8 = b(r4)     // Catch: java.lang.Throwable -> Lf2
            java.lang.String r4 = "length"
            java.lang.Object r4 = r2.get(r4)     // Catch: java.lang.Throwable -> Lf2
            long r4 = h(r4)     // Catch: java.lang.Throwable -> Lf2
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> Lf2
            long r9 = h(r2)     // Catch: java.lang.Throwable -> Lf2
            java.lang.Long r0 = r14.getAsLong(r0)     // Catch: java.lang.Throwable -> Lf2
            long r11 = h(r0)     // Catch: java.lang.Throwable -> Lf2
            r0 = 3
            long[] r2 = new long[r0]     // Catch: java.lang.Throwable -> Lf2
            r2[r1] = r4     // Catch: java.lang.Throwable -> Lf2
            r4 = 1
            r2[r4] = r9     // Catch: java.lang.Throwable -> Lf2
            r4 = 2
            r2[r4] = r11     // Catch: java.lang.Throwable -> Lf2
        Le4:
            r4 = 0
            if (r1 >= r0) goto Lf5
            r9 = r2[r1]     // Catch: java.lang.Throwable -> Lf2
            int r11 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r11 <= 0) goto Lef
            goto Lf6
        Lef:
            int r1 = r1 + 1
            goto Le4
        Lf2:
            r0 = move-exception
            r14 = r0
            goto L121
        Lf5:
            r9 = r4
        Lf6:
            java.lang.String r0 = "filenowsize"
            java.lang.Long r14 = r14.getAsLong(r0)     // Catch: java.lang.Throwable -> Lf2
            long r0 = h(r14)     // Catch: java.lang.Throwable -> Lf2
            boolean r14 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> Lf2
            if (r14 == 0) goto L11b
            boolean r14 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> Lf2
            if (r14 == 0) goto L11b
            boolean r14 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> Lf2
            if (r14 == 0) goto L11b
            int r14 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r14 > 0) goto L11b
            int r14 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r14 > 0) goto L11b
            goto L136
        L11b:
            j8.r r5 = new j8.r     // Catch: java.lang.Throwable -> Lf2
            r5.<init>(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> Lf2
            return r5
        L121:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "读取视频下载信息失败: "
            r0.<init>(r1)
            java.lang.String r14 = r14.getMessage()
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            r13.c(r14)
        L136:
            return r3
    }

    public java.lang.String o(java.lang.String r8) {
            r7 = this;
            java.lang.Object r0 = r7.f638b
            h.Hchat.dexkit.DexFinder r0 = (h.Hchat.dexkit.DexFinder) r0
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            java.lang.String r2 = ""
            if (r1 == 0) goto Le
            goto L72
        Le:
            java.io.File r1 = new java.io.File
            r1.<init>(r8)
            boolean r3 = r1.isFile()
            if (r3 == 0) goto L1e
            java.lang.String r8 = r1.getAbsolutePath()
            return r8
        L1e:
            java.lang.reflect.Method r1 = r0.videoPathMethod
            if (r1 != 0) goto L23
            goto L72
        L23:
            boolean r3 = h.Hchat.utils.KavaReflector.isStatic(r1)     // Catch: java.lang.Throwable -> L82
            r4 = 0
            if (r3 == 0) goto L2b
            goto L61
        L2b:
            java.lang.Class r5 = r1.getDeclaringClass()     // Catch: java.lang.Throwable -> L82
            java.lang.Object r6 = ig.a.A(r0, r5)     // Catch: java.lang.Throwable -> L82
            if (r6 == 0) goto L37
            r4 = r6
            goto L61
        L37:
            java.lang.reflect.Method r0 = r0.videoPathOwnerGetterMethod     // Catch: java.lang.Throwable -> L82
            if (r0 == 0) goto L61
            boolean r6 = h.Hchat.utils.KavaReflector.isStatic(r0)     // Catch: java.lang.Throwable -> L82
            if (r6 == 0) goto L61
            java.lang.Class[] r6 = r0.getParameterTypes()     // Catch: java.lang.Throwable -> L82
            int r6 = r6.length     // Catch: java.lang.Throwable -> L82
            if (r6 != 0) goto L61
            java.lang.Class r6 = r0.getReturnType()     // Catch: java.lang.Throwable -> L82
            boolean r6 = r5.isAssignableFrom(r6)     // Catch: java.lang.Throwable -> L82
            if (r6 != 0) goto L53
            goto L61
        L53:
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L82
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invoke(r0, r4, r6)     // Catch: java.lang.Throwable -> L82
            boolean r5 = r5.isInstance(r0)     // Catch: java.lang.Throwable -> L82
            if (r5 == 0) goto L61
            r4 = r0
        L61:
            if (r3 != 0) goto L66
            if (r4 != 0) goto L66
            goto L72
        L66:
            java.lang.Object[] r8 = new java.lang.Object[]{r8}     // Catch: java.lang.Throwable -> L82
            java.lang.Object r8 = h.Hchat.utils.KavaReflector.invoke(r1, r4, r8)     // Catch: java.lang.Throwable -> L82
            boolean r0 = r8 instanceof java.lang.String     // Catch: java.lang.Throwable -> L82
            if (r0 != 0) goto L73
        L72:
            return r2
        L73:
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L82
            java.lang.Class r0 = r1.getDeclaringClass()     // Catch: java.lang.Throwable -> L82
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Throwable -> L82
            java.lang.String r8 = r7.d(r0, r8)     // Catch: java.lang.Throwable -> L82
            return r8
        L82:
            r8 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "解析视频消息路径失败: "
            r0.<init>(r1)
            java.lang.String r8 = r8.getMessage()
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r7.c(r8)
            return r2
    }

    public java.lang.Object p(java.lang.Class r5) {
            r4 = this;
            java.lang.Object r0 = r4.f637a
            r8.g r0 = (r8.g) r0
            h.Hchat.dexkit.DexFinder r0 = r0.f11624e
            java.util.List<java.lang.reflect.Method> r0 = r0.getContactServiceGetters
            r1 = 0
            if (r0 == 0) goto L36
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L36
            java.lang.Object r2 = r0.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            java.lang.Class r3 = r2.getReturnType()
            boolean r3 = r5.isAssignableFrom(r3)
            if (r3 != 0) goto L26
            goto Lf
        L26:
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.invoke(r2, r1, r3)
            if (r2 == 0) goto Lf
            boolean r3 = r5.isInstance(r2)
            if (r3 == 0) goto Lf
            return r2
        L36:
            return r1
    }

    public boolean q(java.lang.String r11, java.lang.String r12) {
            r10 = this;
            java.lang.String r0 = ""
            java.lang.Object r1 = r10.f637a
            android.content.Context r1 = (android.content.Context) r1
            boolean r2 = android.text.TextUtils.isEmpty(r11)
            r3 = 0
            if (r2 != 0) goto L102
            boolean r2 = android.text.TextUtils.isEmpty(r12)
            if (r2 == 0) goto L15
            goto L102
        L15:
            boolean r2 = eh.a.y(r12)
            if (r2 != 0) goto L2d
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "发送视频失败: 文件不存在 "
            r11.<init>(r0)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.c(r11)
            return r3
        L2d:
            java.lang.Object r2 = r10.f638b
            h.Hchat.dexkit.DexFinder r2 = (h.Hchat.dexkit.DexFinder) r2
            java.lang.Class<?> r2 = r2.sendVideoTaskClass
            if (r2 == 0) goto Lfc
            java.lang.String r2 = r10.a(r12)     // Catch: java.lang.Throwable -> L45
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L45
            if (r4 == 0) goto L48
            java.lang.String r11 = "发送视频失败: 缩略图不可用"
            r10.c(r11)     // Catch: java.lang.Throwable -> L45
            return r3
        L45:
            r11 = move-exception
            goto Le6
        L48:
            android.os.AsyncTask r4 = r10.e()     // Catch: java.lang.Throwable -> L45
            if (r4 != 0) goto L4f
            return r3
        L4f:
            java.lang.String r5 = "a"
            r6 = 0
            r(r4, r5, r6)     // Catch: java.lang.Throwable -> L45
            java.lang.String r5 = "b"
            java.lang.Object r6 = r10.f639c     // Catch: java.lang.Throwable -> L45
            q8.o r6 = (q8.o) r6     // Catch: java.lang.Throwable -> L45
            android.app.Activity r6 = r6.a()     // Catch: java.lang.Throwable -> L45
            if (r6 == 0) goto L62
            r1 = r6
        L62:
            r(r4, r5, r1)     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = "c"
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L45
            r(r4, r1, r5)     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = "d"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L45
            r(r4, r1, r5)     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = "e"
            android.media.MediaMetadataRetriever r5 = new android.media.MediaMetadataRetriever     // Catch: java.lang.Throwable -> L45
            r5.<init>()     // Catch: java.lang.Throwable -> L45
            r5.setDataSource(r12)     // Catch: java.lang.Throwable -> L8b
            r6 = 9
            java.lang.String r6 = r5.extractMetadata(r6)     // Catch: java.lang.Throwable -> L8b
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L8b
            if (r7 == 0) goto L90
        L8b:
            r5.release()     // Catch: java.lang.Throwable -> L8e
        L8e:
            r6 = r3
            goto La4
        L90:
            long r6 = java.lang.Long.parseLong(r6)     // Catch: java.lang.Throwable -> L8b
            r8 = 999(0x3e7, double:4.936E-321)
            long r6 = r6 + r8
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r8
            r8 = 0
            long r6 = java.lang.Math.max(r8, r6)     // Catch: java.lang.Throwable -> L8b
            int r6 = (int) r6
            r5.release()     // Catch: java.lang.Throwable -> La4
        La4:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L45
            r(r4, r1, r5)     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = "f"
            r(r4, r1, r12)     // Catch: java.lang.Throwable -> L45
            java.lang.String r12 = "g"
            r(r4, r12, r2)     // Catch: java.lang.Throwable -> L45
            java.lang.String r12 = "h"
            r(r4, r12, r11)     // Catch: java.lang.Throwable -> L45
            java.lang.String r11 = "i"
            r(r4, r11, r0)     // Catch: java.lang.Throwable -> L45
            java.lang.String r11 = "p"
            r(r4, r11, r0)     // Catch: java.lang.Throwable -> L45
            java.lang.String r11 = "r"
            r(r4, r11, r0)     // Catch: java.lang.Throwable -> L45
            java.lang.String r11 = "s"
            r(r4, r11, r0)     // Catch: java.lang.Throwable -> L45
            java.lang.String r11 = "j"
            java.lang.Boolean r12 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L45
            r(r4, r11, r12)     // Catch: java.lang.Throwable -> L45
            java.lang.String r11 = "l"
            r(r4, r11, r12)     // Catch: java.lang.Throwable -> L45
            java.lang.String r11 = "m"
            r(r4, r11, r12)     // Catch: java.lang.Throwable -> L45
            java.lang.Object[] r11 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L45
            r4.execute(r11)     // Catch: java.lang.Throwable -> L45
            r3 = 1
            goto Lfb
        Le6:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "发送视频异常: "
            r12.<init>(r0)
            java.lang.String r11 = r11.getMessage()
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r10.c(r11)
        Lfb:
            return r3
        Lfc:
            java.lang.String r11 = "发送视频失败: API未就绪"
            r10.c(r11)
            return r3
        L102:
            java.lang.String r11 = "发送视频失败: talker/videoPath为空"
            r10.c(r11)
            return r3
    }
}
