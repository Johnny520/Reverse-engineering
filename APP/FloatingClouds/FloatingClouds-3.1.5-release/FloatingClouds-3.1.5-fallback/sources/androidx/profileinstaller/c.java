package androidx.profileinstaller;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.profileinstaller.c.a f948a = null;

    public class a implements androidx.profileinstaller.c.InterfaceC0021c {
        @Override // androidx.profileinstaller.c.InterfaceC0021c
        public final void a(int r1, java.io.Serializable r2) {
                r0 = this;
                return
        }

        @Override // androidx.profileinstaller.c.InterfaceC0021c
        public final void b() {
                r0 = this;
                return
        }
    }

    public class b implements androidx.profileinstaller.c.InterfaceC0021c {
        @Override // androidx.profileinstaller.c.InterfaceC0021c
        public final void a(int r4, java.io.Serializable r5) {
                r3 = this;
                switch(r4) {
                    case 1: goto L21;
                    case 2: goto L1e;
                    case 3: goto L1b;
                    case 4: goto L18;
                    case 5: goto L15;
                    case 6: goto L12;
                    case 7: goto Lf;
                    case 8: goto Lc;
                    case 9: goto L3;
                    case 10: goto L9;
                    case 11: goto L6;
                    default: goto L3;
                }
            L3:
                java.lang.String r0 = ""
                goto L23
            L6:
                java.lang.String r0 = "RESULT_DELETE_SKIP_FILE_SUCCESS"
                goto L23
            L9:
                java.lang.String r0 = "RESULT_INSTALL_SKIP_FILE_SUCCESS"
                goto L23
            Lc:
                java.lang.String r0 = "RESULT_PARSE_EXCEPTION"
                goto L23
            Lf:
                java.lang.String r0 = "RESULT_IO_EXCEPTION"
                goto L23
            L12:
                java.lang.String r0 = "RESULT_BASELINE_PROFILE_NOT_FOUND"
                goto L23
            L15:
                java.lang.String r0 = "RESULT_DESIRED_FORMAT_UNSUPPORTED"
                goto L23
            L18:
                java.lang.String r0 = "RESULT_NOT_WRITABLE"
                goto L23
            L1b:
                java.lang.String r0 = "RESULT_UNSUPPORTED_ART_VERSION"
                goto L23
            L1e:
                java.lang.String r0 = "RESULT_ALREADY_INSTALLED"
                goto L23
            L21:
                java.lang.String r0 = "RESULT_INSTALL_SUCCESS"
            L23:
                r1 = 6
                java.lang.String r2 = "ProfileInstaller"
                if (r4 == r1) goto L33
                r1 = 7
                if (r4 == r1) goto L33
                r1 = 8
                if (r4 == r1) goto L33
                android.util.Log.d(r2, r0)
                return
            L33:
                java.lang.Throwable r5 = (java.lang.Throwable) r5
                android.util.Log.e(r2, r0, r5)
                return
        }

        @Override // androidx.profileinstaller.c.InterfaceC0021c
        public final void b() {
                r2 = this;
                java.lang.String r0 = "ProfileInstaller"
                java.lang.String r1 = "DIAGNOSTIC_PROFILE_IS_COMPRESSED"
                android.util.Log.d(r0, r1)
                return
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.c$c, reason: collision with other inner class name */
    public interface InterfaceC0021c {
        void a(int r1, java.io.Serializable r2);

        void b();
    }

    static {
            androidx.profileinstaller.c$a r0 = new androidx.profileinstaller.c$a
            r0.<init>()
            androidx.profileinstaller.c.f948a = r0
            return
    }

    public static void a(android.content.pm.PackageInfo r2, java.io.File r3) {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "profileinstaller_profileWrittenFor_lastUpdateTime.dat"
            r0.<init>(r3, r1)
            java.io.DataOutputStream r3 = new java.io.DataOutputStream     // Catch: java.io.IOException -> L24
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L24
            r1.<init>(r0)     // Catch: java.io.IOException -> L24
            r3.<init>(r1)     // Catch: java.io.IOException -> L24
            long r0 = r2.lastUpdateTime     // Catch: java.lang.Throwable -> L1a
            r3.writeLong(r0)     // Catch: java.lang.Throwable -> L1a
            r3.close()     // Catch: java.io.IOException -> L24
            return
        L1a:
            r2 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L1f
            goto L23
        L1f:
            r3 = move-exception
            r2.addSuppressed(r3)     // Catch: java.io.IOException -> L24
        L23:
            throw r2     // Catch: java.io.IOException -> L24
        L24:
            return
    }

    public static void b(android.content.Context r18, java.util.concurrent.Executor r19, androidx.profileinstaller.c.InterfaceC0021c r20, boolean r21) {
            r1 = r18
            r5 = r20
            android.content.Context r0 = r1.getApplicationContext()
            java.lang.String r2 = r0.getPackageName()
            android.content.pm.ApplicationInfo r3 = r0.getApplicationInfo()
            android.content.res.AssetManager r4 = r0.getAssets()
            java.io.File r0 = new java.io.File
            java.lang.String r3 = r3.sourceDir
            r0.<init>(r3)
            java.lang.String r6 = r0.getName()
            android.content.pm.PackageManager r0 = r1.getPackageManager()
            r8 = 7
            r9 = 0
            android.content.pm.PackageInfo r10 = r0.getPackageInfo(r2, r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L290
            java.io.File r11 = r1.getFilesDir()
            java.lang.String r3 = "ProfileInstaller"
            r12 = 0
            if (r21 != 0) goto L8c
            java.io.File r0 = new java.io.File
            java.lang.String r7 = "profileinstaller_profileWrittenFor_lastUpdateTime.dat"
            r0.<init>(r11, r7)
            boolean r7 = r0.exists()
            if (r7 != 0) goto L41
        L3f:
            r0 = r9
            goto L6f
        L41:
            java.io.DataInputStream r7 = new java.io.DataInputStream     // Catch: java.io.IOException -> L3f
            java.io.FileInputStream r14 = new java.io.FileInputStream     // Catch: java.io.IOException -> L3f
            r14.<init>(r0)     // Catch: java.io.IOException -> L3f
            r7.<init>(r14)     // Catch: java.io.IOException -> L3f
            long r14 = r7.readLong()     // Catch: java.lang.Throwable -> L64
            r7.close()     // Catch: java.io.IOException -> L3f
            r16 = r14
            long r13 = r10.lastUpdateTime
            int r0 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
            if (r0 != 0) goto L5c
            r0 = 1
            goto L5d
        L5c:
            r0 = r9
        L5d:
            if (r0 == 0) goto L6f
            r7 = 2
            r5.a(r7, r12)
            goto L6f
        L64:
            r0 = move-exception
            r13 = r0
            r7.close()     // Catch: java.lang.Throwable -> L6a
            goto L6e
        L6a:
            r0 = move-exception
            r13.addSuppressed(r0)     // Catch: java.io.IOException -> L3f
        L6e:
            throw r13     // Catch: java.io.IOException -> L3f
        L6f:
            if (r0 != 0) goto L72
            goto L8c
        L72:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Skipping profile installation for "
            r0.<init>(r2)
            java.lang.String r2 = r1.getPackageName()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r3, r0)
            androidx.profileinstaller.d.c(r1, r9)
            goto L28f
        L8c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r7 = "Installing profile for "
            r0.<init>(r7)
            java.lang.String r7 = r1.getPackageName()
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r3, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            java.io.File r7 = new java.io.File
            java.io.File r3 = new java.io.File
            java.lang.String r13 = "/data/misc/profiles/cur/0"
            r3.<init>(r13, r2)
            java.lang.String r2 = "primary.prof"
            r7.<init>(r3, r2)
            androidx.profileinstaller.b r2 = new androidx.profileinstaller.b
            java.lang.String r13 = "dexopt/baseline.prof"
            r3 = r4
            r4 = r19
            r2.<init>(r3, r4, r5, r6, r7)
            byte[] r4 = r2.c
            if (r4 != 0) goto Lca
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3 = 3
            r2.b(r3, r0)
        Lc7:
            r7 = 1
            goto L284
        Lca:
            boolean r0 = r7.exists()
            r6 = 4
            if (r0 == 0) goto Ldd
            boolean r0 = r7.canWrite()
            if (r0 != 0) goto Ldb
            r2.b(r6, r12)
            goto Lc7
        Ldb:
            r7 = 1
            goto Le1
        Ldd:
            r7.createNewFile()     // Catch: java.io.IOException -> L280
            goto Ldb
        Le1:
            r2.f = r7
            byte[] r7 = a.Kc.f153a
            r14 = 6
            java.io.FileInputStream r0 = r2.a(r3, r13)     // Catch: java.io.IOException -> Lec java.io.FileNotFoundException -> Lf1
            r13 = r0
            goto Lf6
        Lec:
            r0 = move-exception
            r5.a(r8, r0)
            goto Lf5
        Lf1:
            r0 = move-exception
            r5.a(r14, r0)
        Lf5:
            r13 = r12
        Lf6:
            java.lang.String r15 = "Invalid magic"
            r14 = 8
            if (r13 == 0) goto L146
            byte[] r0 = a.C0435w1.P(r13, r6)     // Catch: java.lang.Throwable -> L11b java.lang.IllegalStateException -> L11d java.io.IOException -> L11f
            boolean r0 = java.util.Arrays.equals(r7, r0)     // Catch: java.lang.Throwable -> L11b java.lang.IllegalStateException -> L11d java.io.IOException -> L11f
            if (r0 == 0) goto L121
            byte[] r0 = a.C0435w1.P(r13, r6)     // Catch: java.lang.Throwable -> L11b java.lang.IllegalStateException -> L11d java.io.IOException -> L11f
            java.lang.String r9 = r2.e     // Catch: java.lang.Throwable -> L11b java.lang.IllegalStateException -> L11d java.io.IOException -> L11f
            a.g5[] r9 = a.Kc.g(r13, r0, r9)     // Catch: java.lang.Throwable -> L11b java.lang.IllegalStateException -> L11d java.io.IOException -> L11f
            r13.close()     // Catch: java.io.IOException -> L114
            goto L13a
        L114:
            r0 = move-exception
            r5.a(r8, r0)
            goto L13a
        L119:
            r1 = r0
            goto L13d
        L11b:
            r0 = move-exception
            goto L119
        L11d:
            r0 = move-exception
            goto L127
        L11f:
            r0 = move-exception
            goto L133
        L121:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L11b java.lang.IllegalStateException -> L11d java.io.IOException -> L11f
            r0.<init>(r15)     // Catch: java.lang.Throwable -> L11b java.lang.IllegalStateException -> L11d java.io.IOException -> L11f
            throw r0     // Catch: java.lang.Throwable -> L11b java.lang.IllegalStateException -> L11d java.io.IOException -> L11f
        L127:
            r5.a(r14, r0)     // Catch: java.lang.Throwable -> L11b
            r13.close()     // Catch: java.io.IOException -> L12e
            goto L139
        L12e:
            r0 = move-exception
            r5.a(r8, r0)
            goto L139
        L133:
            r5.a(r8, r0)     // Catch: java.lang.Throwable -> L11b
            r13.close()     // Catch: java.io.IOException -> L12e
        L139:
            r9 = r12
        L13a:
            r2.g = r9
            goto L146
        L13d:
            r13.close()     // Catch: java.io.IOException -> L141
            goto L145
        L141:
            r0 = move-exception
            r5.a(r8, r0)
        L145:
            throw r1
        L146:
            a.g5[] r0 = r2.g
            if (r0 == 0) goto L1a9
            int r9 = android.os.Build.VERSION.SDK_INT
            r13 = 34
            if (r9 <= r13) goto L151
            goto L1a9
        L151:
            switch(r9) {
                case 31: goto L155;
                case 32: goto L155;
                case 33: goto L155;
                case 34: goto L155;
                default: goto L154;
            }
        L154:
            goto L1a9
        L155:
            java.lang.String r9 = "dexopt/baseline.profm"
            java.io.FileInputStream r3 = r2.a(r3, r9)     // Catch: java.lang.IllegalStateException -> L178 java.io.IOException -> L17a java.io.FileNotFoundException -> L17c
            if (r3 == 0) goto L190
            byte[] r9 = a.Kc.b     // Catch: java.lang.Throwable -> L17e
            byte[] r13 = a.C0435w1.P(r3, r6)     // Catch: java.lang.Throwable -> L17e
            boolean r9 = java.util.Arrays.equals(r9, r13)     // Catch: java.lang.Throwable -> L17e
            if (r9 == 0) goto L181
            byte[] r6 = a.C0435w1.P(r3, r6)     // Catch: java.lang.Throwable -> L17e
            a.g5[] r0 = a.Kc.d(r3, r6, r4, r0)     // Catch: java.lang.Throwable -> L17e
            r2.g = r0     // Catch: java.lang.Throwable -> L17e
            r3.close()     // Catch: java.lang.IllegalStateException -> L178 java.io.IOException -> L17a java.io.FileNotFoundException -> L17c
            r0 = r2
            goto L1a6
        L178:
            r0 = move-exception
            goto L196
        L17a:
            r0 = move-exception
            goto L19c
        L17c:
            r0 = move-exception
            goto L1a0
        L17e:
            r0 = move-exception
            r4 = r0
            goto L187
        L181:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L17e
            r0.<init>(r15)     // Catch: java.lang.Throwable -> L17e
            throw r0     // Catch: java.lang.Throwable -> L17e
        L187:
            r3.close()     // Catch: java.lang.Throwable -> L18b
            goto L18f
        L18b:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch: java.lang.IllegalStateException -> L178 java.io.IOException -> L17a java.io.FileNotFoundException -> L17c
        L18f:
            throw r4     // Catch: java.lang.IllegalStateException -> L178 java.io.IOException -> L17a java.io.FileNotFoundException -> L17c
        L190:
            if (r3 == 0) goto L1a5
            r3.close()     // Catch: java.lang.IllegalStateException -> L178 java.io.IOException -> L17a java.io.FileNotFoundException -> L17c
            goto L1a5
        L196:
            r2.g = r12
            r5.a(r14, r0)
            goto L1a5
        L19c:
            r5.a(r8, r0)
            goto L1a5
        L1a0:
            r3 = 9
            r5.a(r3, r0)
        L1a5:
            r0 = r12
        L1a6:
            if (r0 == 0) goto L1a9
            r2 = r0
        L1a9:
            androidx.profileinstaller.c$c r3 = r2.b
            a.g5[] r0 = r2.g
            java.lang.String r4 = "This device doesn't support aot. Did you call deviceSupportsAotProfile()?"
            if (r0 == 0) goto L1ff
            byte[] r5 = r2.c
            if (r5 != 0) goto L1b6
            goto L1ff
        L1b6:
            boolean r6 = r2.f
            if (r6 == 0) goto L1f9
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch: java.lang.IllegalStateException -> L1d5 java.io.IOException -> L1d7
            r6.<init>()     // Catch: java.lang.IllegalStateException -> L1d5 java.io.IOException -> L1d7
            r6.write(r7)     // Catch: java.lang.Throwable -> L1d9
            r6.write(r5)     // Catch: java.lang.Throwable -> L1d9
            boolean r0 = a.Kc.i(r6, r5, r0)     // Catch: java.lang.Throwable -> L1d9
            if (r0 != 0) goto L1dc
            r0 = 5
            r3.a(r0, r12)     // Catch: java.lang.Throwable -> L1d9
            r2.g = r12     // Catch: java.lang.Throwable -> L1d9
            r6.close()     // Catch: java.lang.IllegalStateException -> L1d5 java.io.IOException -> L1d7
            goto L1ff
        L1d5:
            r0 = move-exception
            goto L1ef
        L1d7:
            r0 = move-exception
            goto L1f3
        L1d9:
            r0 = move-exception
            r5 = r0
            goto L1e6
        L1dc:
            byte[] r0 = r6.toByteArray()     // Catch: java.lang.Throwable -> L1d9
            r2.h = r0     // Catch: java.lang.Throwable -> L1d9
            r6.close()     // Catch: java.lang.IllegalStateException -> L1d5 java.io.IOException -> L1d7
            goto L1f6
        L1e6:
            r6.close()     // Catch: java.lang.Throwable -> L1ea
            goto L1ee
        L1ea:
            r0 = move-exception
            r5.addSuppressed(r0)     // Catch: java.lang.IllegalStateException -> L1d5 java.io.IOException -> L1d7
        L1ee:
            throw r5     // Catch: java.lang.IllegalStateException -> L1d5 java.io.IOException -> L1d7
        L1ef:
            r3.a(r14, r0)
            goto L1f6
        L1f3:
            r3.a(r8, r0)
        L1f6:
            r2.g = r12
            goto L1ff
        L1f9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L1ff:
            byte[] r0 = r2.h
            if (r0 != 0) goto L207
            r0 = 0
            r7 = 1
            goto L26e
        L207:
            boolean r3 = r2.f
            if (r3 == 0) goto L27a
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L236 java.io.IOException -> L25b java.io.FileNotFoundException -> L25e
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L236 java.io.IOException -> L25b java.io.FileNotFoundException -> L25e
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L24f
            java.io.File r0 = r2.d     // Catch: java.lang.Throwable -> L24f
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L24f
            r0 = 512(0x200, float:7.17E-43)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L243
        L21b:
            int r5 = r3.read(r0)     // Catch: java.lang.Throwable -> L243
            if (r5 <= 0) goto L226
            r6 = 0
            r4.write(r0, r6, r5)     // Catch: java.lang.Throwable -> L243
            goto L21b
        L226:
            r7 = 1
            r2.b(r7, r12)     // Catch: java.lang.Throwable -> L240
            r4.close()     // Catch: java.lang.Throwable -> L23d
            r3.close()     // Catch: java.lang.Throwable -> L236 java.io.IOException -> L238 java.io.FileNotFoundException -> L23a
            r2.h = r12
            r2.g = r12
            r0 = r7
            goto L26e
        L236:
            r0 = move-exception
            goto L275
        L238:
            r0 = move-exception
            goto L261
        L23a:
            r0 = move-exception
        L23b:
            r3 = 6
            goto L269
        L23d:
            r0 = move-exception
        L23e:
            r4 = r0
            goto L252
        L240:
            r0 = move-exception
        L241:
            r5 = r0
            goto L246
        L243:
            r0 = move-exception
            r7 = 1
            goto L241
        L246:
            r4.close()     // Catch: java.lang.Throwable -> L24a
            goto L24e
        L24a:
            r0 = move-exception
            r5.addSuppressed(r0)     // Catch: java.lang.Throwable -> L23d
        L24e:
            throw r5     // Catch: java.lang.Throwable -> L23d
        L24f:
            r0 = move-exception
            r7 = 1
            goto L23e
        L252:
            r3.close()     // Catch: java.lang.Throwable -> L256
            goto L25a
        L256:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch: java.lang.Throwable -> L236 java.io.IOException -> L238 java.io.FileNotFoundException -> L23a
        L25a:
            throw r4     // Catch: java.lang.Throwable -> L236 java.io.IOException -> L238 java.io.FileNotFoundException -> L23a
        L25b:
            r0 = move-exception
            r7 = 1
            goto L261
        L25e:
            r0 = move-exception
            r7 = 1
            goto L23b
        L261:
            r2.b(r8, r0)     // Catch: java.lang.Throwable -> L236
        L264:
            r2.h = r12
            r2.g = r12
            goto L26d
        L269:
            r2.b(r3, r0)     // Catch: java.lang.Throwable -> L236
            goto L264
        L26d:
            r0 = 0
        L26e:
            if (r0 == 0) goto L273
            a(r10, r11)
        L273:
            r6 = r0
            goto L285
        L275:
            r2.h = r12
            r2.g = r12
            throw r0
        L27a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L280:
            r7 = 1
            r2.b(r6, r12)
        L284:
            r6 = 0
        L285:
            if (r6 == 0) goto L28b
            if (r21 == 0) goto L28b
            r9 = r7
            goto L28c
        L28b:
            r9 = 0
        L28c:
            androidx.profileinstaller.d.c(r1, r9)
        L28f:
            return
        L290:
            r0 = move-exception
            r5.a(r8, r0)
            r6 = 0
            androidx.profileinstaller.d.c(r1, r6)
            return
    }
}
