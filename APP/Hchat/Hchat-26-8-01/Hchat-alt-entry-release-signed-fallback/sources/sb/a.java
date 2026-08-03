package sb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.Object f12413a = null;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            sb.a.f12413a = r0
            return
    }

    public static void a(java.io.File r7, java.io.File r8, java.lang.String r9) {
            java.lang.String r0 = ".so"
            boolean r1 = r9.endsWith(r0)
            java.lang.String r2 = "-"
            r3 = 0
            if (r1 == 0) goto L1a
            int r1 = r9.length()
            int r1 = r1 + (-3)
            java.lang.String r1 = r9.substring(r3, r1)
            java.lang.String r1 = r1.concat(r2)
            goto L1e
        L1a:
            java.lang.String r1 = r9.concat(r2)
        L1e:
            java.io.File[] r7 = r7.listFiles()
            if (r7 != 0) goto L25
            goto L4f
        L25:
            int r2 = r7.length
        L26:
            if (r3 >= r2) goto L4f
            r4 = r7[r3]
            if (r4 == 0) goto L4c
            boolean r5 = r4.equals(r8)
            if (r5 == 0) goto L33
            goto L4c
        L33:
            java.lang.String r5 = r4.getName()
            boolean r6 = r5.equals(r9)
            if (r6 != 0) goto L49
            boolean r6 = r5.startsWith(r1)
            if (r6 == 0) goto L4c
            boolean r5 = r5.endsWith(r0)
            if (r5 == 0) goto L4c
        L49:
            r4.delete()
        L4c:
            int r3 = r3 + 1
            goto L26
        L4f:
            return
    }

    public static void b(java.util.zip.ZipFile r7, java.util.zip.ZipEntry r8, java.io.File r9, java.lang.String r10, java.io.File r11) {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = ".tmp-"
            java.lang.StringBuilder r1 = bc.e.n(r10, r1)
            int r2 = android.os.Process.myPid()
            r1.append(r2)
            java.lang.String r2 = "-"
            r1.append(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            long r2 = r2.getId()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r9, r1)
            java.util.zip.CRC32 r9 = new java.util.zip.CRC32     // Catch: java.lang.Throwable -> L83
            r9.<init>()     // Catch: java.lang.Throwable -> L83
            java.io.InputStream r7 = r7.getInputStream(r8)     // Catch: java.lang.Throwable -> L83
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lb2
            r2 = 0
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> Lb2
            r3 = 8192(0x2000, float:1.148E-41)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L46
        L39:
            int r4 = r7.read(r3)     // Catch: java.lang.Throwable -> L46
            if (r4 <= 0) goto L48
            r1.write(r3, r2, r4)     // Catch: java.lang.Throwable -> L46
            r9.update(r3, r2, r4)     // Catch: java.lang.Throwable -> L46
            goto L39
        L46:
            r8 = move-exception
            goto Lb4
        L48:
            java.io.FileDescriptor r3 = r1.getFD()     // Catch: java.lang.Throwable -> L46
            r3.sync()     // Catch: java.lang.Throwable -> L46
            r1.close()     // Catch: java.lang.Throwable -> Lb2
            r7.close()     // Catch: java.lang.Throwable -> L83
            long r3 = r8.getCrc()     // Catch: java.lang.Throwable -> L83
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L85
            long r3 = r9.getValue()     // Catch: java.lang.Throwable -> L83
            long r7 = r8.getCrc()     // Catch: java.lang.Throwable -> L83
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 != 0) goto L6c
            goto L85
        L6c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L83
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L83
            r8.<init>()     // Catch: java.lang.Throwable -> L83
            java.lang.String r9 = "Native 缓存 CRC 校验失败: "
            r8.append(r9)     // Catch: java.lang.Throwable -> L83
            r8.append(r10)     // Catch: java.lang.Throwable -> L83
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L83
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L83
            throw r7     // Catch: java.lang.Throwable -> L83
        L83:
            r7 = move-exception
            goto Lc8
        L85:
            r7 = 1
            java.nio.file.Path r8 = r0.toPath()     // Catch: java.lang.Throwable -> L83 java.nio.file.AtomicMoveNotSupportedException -> L9d
            java.nio.file.Path r9 = r11.toPath()     // Catch: java.lang.Throwable -> L83 java.nio.file.AtomicMoveNotSupportedException -> L9d
            r10 = 2
            java.nio.file.CopyOption[] r10 = new java.nio.file.CopyOption[r10]     // Catch: java.lang.Throwable -> L83 java.nio.file.AtomicMoveNotSupportedException -> L9d
            java.nio.file.StandardCopyOption r1 = java.nio.file.StandardCopyOption.ATOMIC_MOVE     // Catch: java.lang.Throwable -> L83 java.nio.file.AtomicMoveNotSupportedException -> L9d
            r10[r2] = r1     // Catch: java.lang.Throwable -> L83 java.nio.file.AtomicMoveNotSupportedException -> L9d
            java.nio.file.StandardCopyOption r1 = java.nio.file.StandardCopyOption.REPLACE_EXISTING     // Catch: java.lang.Throwable -> L83 java.nio.file.AtomicMoveNotSupportedException -> L9d
            r10[r7] = r1     // Catch: java.lang.Throwable -> L83 java.nio.file.AtomicMoveNotSupportedException -> L9d
            java.nio.file.Files.move(r8, r9, r10)     // Catch: java.lang.Throwable -> L83 java.nio.file.AtomicMoveNotSupportedException -> L9d
            goto Lae
        L9d:
            java.nio.file.Path r8 = r0.toPath()     // Catch: java.lang.Throwable -> L83
            java.nio.file.Path r9 = r11.toPath()     // Catch: java.lang.Throwable -> L83
            java.nio.file.CopyOption[] r7 = new java.nio.file.CopyOption[r7]     // Catch: java.lang.Throwable -> L83
            java.nio.file.StandardCopyOption r10 = java.nio.file.StandardCopyOption.REPLACE_EXISTING     // Catch: java.lang.Throwable -> L83
            r7[r2] = r10     // Catch: java.lang.Throwable -> L83
            java.nio.file.Files.move(r8, r9, r7)     // Catch: java.lang.Throwable -> L83
        Lae:
            r0.delete()
            return
        Lb2:
            r8 = move-exception
            goto Lbd
        Lb4:
            r1.close()     // Catch: java.lang.Throwable -> Lb8
            goto Lbc
        Lb8:
            r9 = move-exception
            r8.addSuppressed(r9)     // Catch: java.lang.Throwable -> Lb2
        Lbc:
            throw r8     // Catch: java.lang.Throwable -> Lb2
        Lbd:
            if (r7 == 0) goto Lc7
            r7.close()     // Catch: java.lang.Throwable -> Lc3
            goto Lc7
        Lc3:
            r7 = move-exception
            r8.addSuppressed(r7)     // Catch: java.lang.Throwable -> L83
        Lc7:
            throw r8     // Catch: java.lang.Throwable -> L83
        Lc8:
            r0.delete()
            throw r7
    }

    public static java.io.File c(java.io.File r11, java.lang.String r12) {
            java.io.File r0 = new java.io.File
            r0.<init>(r11, r12)
            boolean r1 = r0.isFile()
            r2 = 0
            if (r1 == 0) goto L16
            long r4 = r0.length()
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 <= 0) goto L16
            goto L17
        L16:
            r0 = 0
        L17:
            java.lang.String r1 = ".so"
            boolean r4 = r12.endsWith(r1)
            java.lang.String r5 = "-"
            r6 = 0
            if (r4 == 0) goto L2c
            int r4 = r12.length()
            int r4 = r4 + (-3)
            java.lang.String r12 = r12.substring(r6, r4)
        L2c:
            java.lang.String r12 = r12.concat(r5)
            java.io.File[] r11 = r11.listFiles()
            if (r11 != 0) goto L37
            return r0
        L37:
            int r4 = r11.length
        L38:
            if (r6 >= r4) goto L70
            r5 = r11[r6]
            if (r5 == 0) goto L6d
            boolean r7 = r5.isFile()
            if (r7 == 0) goto L6d
            long r7 = r5.length()
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 > 0) goto L4d
            goto L6d
        L4d:
            java.lang.String r7 = r5.getName()
            boolean r8 = r7.startsWith(r12)
            if (r8 == 0) goto L6d
            boolean r7 = r7.endsWith(r1)
            if (r7 != 0) goto L5e
            goto L6d
        L5e:
            if (r0 == 0) goto L6c
            long r7 = r5.lastModified()
            long r9 = r0.lastModified()
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 <= 0) goto L6d
        L6c:
            r0 = r5
        L6d:
            int r6 = r6 + 1
            goto L38
        L70:
            return r0
    }

    public static boolean d(android.content.Context r18, java.lang.ClassLoader r19, java.lang.String r20, java.lang.String r21, boolean r22) {
            r1 = r20
            java.lang.String r0 = "h.Hchat"
            r2 = 0
            java.lang.String r3 = r19.toString()     // Catch: java.lang.Throwable -> L38
            java.lang.String r4 = "module="
            int r4 = r3.indexOf(r4)     // Catch: java.lang.Throwable -> L38
            if (r4 < 0) goto L38
            int r4 = r4 + 7
            java.lang.String r5 = ","
            int r5 = r3.indexOf(r5, r4)     // Catch: java.lang.Throwable -> L38
            if (r5 >= 0) goto L21
            java.lang.String r5 = "]"
            int r5 = r3.indexOf(r5, r4)     // Catch: java.lang.Throwable -> L38
        L21:
            if (r5 <= r4) goto L38
            java.lang.String r3 = r3.substring(r4, r5)     // Catch: java.lang.Throwable -> L38
            java.lang.String r3 = r3.trim()     // Catch: java.lang.Throwable -> L38
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L38
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L38
            boolean r4 = r4.exists()     // Catch: java.lang.Throwable -> L38
            if (r4 == 0) goto L38
            goto Lbb
        L38:
            java.lang.Class r3 = r19.getClass()     // Catch: java.lang.Throwable -> L80
        L3c:
            if (r3 == 0) goto L80
            java.util.List r4 = h.Hchat.utils.KavaReflector.declaredFields(r3)     // Catch: java.lang.Throwable -> L80
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L80
        L46:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L80
            if (r5 == 0) goto L79
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L80
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5     // Catch: java.lang.Throwable -> L80
            r6 = r19
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.readField(r5, r6)     // Catch: java.lang.Throwable -> L80
            boolean r7 = r5 instanceof java.lang.String     // Catch: java.lang.Throwable -> L80
            if (r7 == 0) goto L46
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L80
            java.lang.String r7 = ".apk"
            boolean r7 = r5.endsWith(r7)     // Catch: java.lang.Throwable -> L80
            if (r7 == 0) goto L46
            boolean r7 = r5.contains(r0)     // Catch: java.lang.Throwable -> L80
            if (r7 == 0) goto L46
            java.io.File r7 = new java.io.File     // Catch: java.lang.Throwable -> L80
            r7.<init>(r5)     // Catch: java.lang.Throwable -> L80
            boolean r7 = r7.exists()     // Catch: java.lang.Throwable -> L80
            if (r7 == 0) goto L46
            r3 = r5
            goto Lbb
        L79:
            r6 = r19
            java.lang.Class r3 = r3.getSuperclass()     // Catch: java.lang.Throwable -> L80
            goto L3c
        L80:
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> Lba
            java.lang.String r4 = "/data/app"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> Lba
            java.io.File[] r3 = r3.listFiles()     // Catch: java.lang.Throwable -> Lba
            if (r3 == 0) goto Lba
            int r4 = r3.length     // Catch: java.lang.Throwable -> Lba
            r5 = r2
        L8f:
            if (r5 >= r4) goto Lba
            r6 = r3[r5]     // Catch: java.lang.Throwable -> Lba
            if (r6 == 0) goto Lb7
            boolean r7 = r6.isDirectory()     // Catch: java.lang.Throwable -> Lba
            if (r7 == 0) goto Lb7
            java.lang.String r7 = r6.getName()     // Catch: java.lang.Throwable -> Lba
            boolean r7 = r7.contains(r0)     // Catch: java.lang.Throwable -> Lba
            if (r7 == 0) goto Lb7
            java.io.File r7 = new java.io.File     // Catch: java.lang.Throwable -> Lba
            java.lang.String r8 = "base.apk"
            r7.<init>(r6, r8)     // Catch: java.lang.Throwable -> Lba
            boolean r6 = r7.exists()     // Catch: java.lang.Throwable -> Lba
            if (r6 == 0) goto Lb7
            java.lang.String r3 = r7.getAbsolutePath()     // Catch: java.lang.Throwable -> Lba
            goto Lbb
        Lb7:
            int r5 = r5 + 1
            goto L8f
        Lba:
            r3 = 0
        Lbb:
            boolean r0 = android.os.Process.is64Bit()
            if (r0 == 0) goto Lc4
            java.lang.String r0 = "arm64-v8a"
            goto Lc6
        Lc4:
            java.lang.String r0 = "armeabi-v7a"
        Lc6:
            java.lang.String r4 = "lib/"
            java.lang.String r5 = "/"
            java.lang.String r4 = bc.e.j(r4, r0, r5, r1)
            java.io.File r5 = new java.io.File
            java.io.File r6 = new java.io.File
            java.io.File r7 = r18.getCacheDir()
            java.lang.String r8 = "Hchat_native"
            r6.<init>(r7, r8)
            r5.<init>(r6, r0)
            r6 = 1
            if (r3 == 0) goto L1d3
            int r0 = r3.length()     // Catch: java.lang.Throwable -> Lfc
            if (r0 != 0) goto Le9
            goto L1d3
        Le9:
            java.util.zip.ZipFile r7 = new java.util.zip.ZipFile     // Catch: java.lang.Throwable -> Lfc
            r7.<init>(r3)     // Catch: java.lang.Throwable -> Lfc
            java.util.zip.ZipEntry r3 = r7.getEntry(r4)     // Catch: java.lang.Throwable -> Lff
            if (r3 != 0) goto L103
            java.lang.System.loadLibrary(r21)     // Catch: java.lang.Throwable -> Lff
        Lf7:
            r7.close()     // Catch: java.lang.Throwable -> Lfc
            goto L1f3
        Lfc:
            r0 = move-exception
            goto L1e5
        Lff:
            r0 = move-exception
            r3 = r0
            goto L1ca
        L103:
            r5.mkdirs()     // Catch: java.lang.Throwable -> Lff
            long r8 = r3.getCrc()     // Catch: java.lang.Throwable -> Lff
            java.lang.String r4 = e(r8, r1)     // Catch: java.lang.Throwable -> Lff
            java.io.File r8 = new java.io.File     // Catch: java.lang.Throwable -> Lff
            r8.<init>(r5, r4)     // Catch: java.lang.Throwable -> Lff
            java.lang.Object r9 = sb.a.f12413a     // Catch: java.lang.Throwable -> Lff
            monitor-enter(r9)     // Catch: java.lang.Throwable -> Lff
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L195
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L195
            r10.<init>()     // Catch: java.lang.Throwable -> L195
            r10.append(r4)     // Catch: java.lang.Throwable -> L195
            java.lang.String r11 = ".lock"
            r10.append(r11)     // Catch: java.lang.Throwable -> L195
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L195
            r0.<init>(r5, r10)     // Catch: java.lang.Throwable -> L195
            java.io.RandomAccessFile r10 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L195
            java.lang.String r11 = "rw"
            r10.<init>(r0, r11)     // Catch: java.lang.Throwable -> L195
            java.nio.channels.FileChannel r0 = r10.getChannel()     // Catch: java.lang.Throwable -> L18c
            java.nio.channels.FileLock r11 = r0.lock()     // Catch: java.lang.Throwable -> L18c
            long r12 = r3.getSize()     // Catch: java.lang.Throwable -> L164
            boolean r0 = r8.isFile()     // Catch: java.lang.Throwable -> L164
            if (r0 == 0) goto L15d
            long r14 = r8.length()     // Catch: java.lang.Throwable -> L164
            r16 = 0
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 <= 0) goto L15d
            int r0 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r0 < 0) goto L15b
            long r14 = r8.length()     // Catch: java.lang.Throwable -> L164
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 != 0) goto L15d
        L15b:
            r12 = r6
            goto L15e
        L15d:
            r12 = r2
        L15e:
            if (r12 != 0) goto L167
            b(r7, r3, r5, r4, r8)     // Catch: java.lang.Throwable -> L164
            goto L167
        L164:
            r0 = move-exception
            r3 = r0
            goto L1b4
        L167:
            java.lang.String r0 = r8.getAbsolutePath()     // Catch: java.lang.Throwable -> L164 java.lang.UnsatisfiedLinkError -> L16f
            java.lang.System.load(r0)     // Catch: java.lang.Throwable -> L164 java.lang.UnsatisfiedLinkError -> L16f
            goto L183
        L16f:
            r0 = move-exception
            r13 = r0
            if (r12 == 0) goto L1b3
            boolean r0 = r8.delete()     // Catch: java.lang.Throwable -> L164
            if (r0 == 0) goto L19c
            b(r7, r3, r5, r4, r8)     // Catch: java.lang.Throwable -> L164
            java.lang.String r0 = r8.getAbsolutePath()     // Catch: java.lang.Throwable -> L197
            java.lang.System.load(r0)     // Catch: java.lang.Throwable -> L197
        L183:
            a(r5, r8, r1)     // Catch: java.lang.Throwable -> L164
            if (r11 == 0) goto L18f
            r11.close()     // Catch: java.lang.Throwable -> L18c
            goto L18f
        L18c:
            r0 = move-exception
            r3 = r0
            goto L1bf
        L18f:
            r10.close()     // Catch: java.lang.Throwable -> L195
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L195
            goto Lf7
        L195:
            r0 = move-exception
            goto L1c8
        L197:
            r0 = move-exception
            r0.addSuppressed(r13)     // Catch: java.lang.Throwable -> L164
            throw r0     // Catch: java.lang.Throwable -> L164
        L19c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L164
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L164
            r3.<init>()     // Catch: java.lang.Throwable -> L164
            java.lang.String r4 = "无法删除损坏的 Native 缓存: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L164
            r3.append(r8)     // Catch: java.lang.Throwable -> L164
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L164
            r0.<init>(r3, r13)     // Catch: java.lang.Throwable -> L164
            throw r0     // Catch: java.lang.Throwable -> L164
        L1b3:
            throw r13     // Catch: java.lang.Throwable -> L164
        L1b4:
            if (r11 == 0) goto L1be
            r11.close()     // Catch: java.lang.Throwable -> L1ba
            goto L1be
        L1ba:
            r0 = move-exception
            r3.addSuppressed(r0)     // Catch: java.lang.Throwable -> L18c
        L1be:
            throw r3     // Catch: java.lang.Throwable -> L18c
        L1bf:
            r10.close()     // Catch: java.lang.Throwable -> L1c3
            goto L1c7
        L1c3:
            r0 = move-exception
            r3.addSuppressed(r0)     // Catch: java.lang.Throwable -> L195
        L1c7:
            throw r3     // Catch: java.lang.Throwable -> L195
        L1c8:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L195
            throw r0     // Catch: java.lang.Throwable -> Lff
        L1ca:
            r7.close()     // Catch: java.lang.Throwable -> L1ce
            goto L1d2
        L1ce:
            r0 = move-exception
            r3.addSuppressed(r0)     // Catch: java.lang.Throwable -> Lfc
        L1d2:
            throw r3     // Catch: java.lang.Throwable -> Lfc
        L1d3:
            java.io.File r0 = c(r5, r1)     // Catch: java.lang.Throwable -> Lfc
            if (r0 == 0) goto L1e1
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> Lfc
            java.lang.System.load(r0)     // Catch: java.lang.Throwable -> Lfc
            goto L1f3
        L1e1:
            java.lang.System.loadLibrary(r21)     // Catch: java.lang.Throwable -> Lfc
            goto L1f3
        L1e5:
            java.lang.String r3 = "[Hchat:NativeLoader] "
            java.lang.String r4 = " 加载失败: "
            java.lang.StringBuilder r3 = bc.e.o(r3, r1, r4)
            bc.e.s(r0, r3, r0)
            java.lang.System.loadLibrary(r21)     // Catch: java.lang.Throwable -> L1f4
        L1f3:
            return r6
        L1f4:
            r0 = move-exception
            java.lang.String r3 = "[Hchat:NativeLoader] "
            java.lang.String r4 = " loadLibrary 也失败: "
            r5 = r21
            java.lang.StringBuilder r3 = bc.e.o(r3, r5, r4)
            bc.e.s(r0, r3, r0)
            if (r22 == 0) goto L205
            return r2
        L205:
            java.lang.String r2 = "无法加载 "
            java.lang.String r1 = r2.concat(r1)
            ah.a.p(r1, r0)
            r0 = 0
            return r0
    }

    public static java.lang.String e(long r3, java.lang.String r5) {
            r0 = 46
            int r0 = r5.lastIndexOf(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "-"
            r1.<init>(r2)
            java.lang.String r3 = java.lang.Long.toHexString(r3)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            if (r0 > 0) goto L1f
            java.lang.String r3 = r5.concat(r3)
            return r3
        L1f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r1 = 0
            java.lang.String r1 = r5.substring(r1, r0)
            r4.append(r1)
            r4.append(r3)
            java.lang.String r3 = r5.substring(r0)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            return r3
    }
}
