package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final og.k f3516a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.Set f3517b = null;

    static {
            og.k r0 = new og.k
            java.lang.String r1 = "(?<![A-Za-z0-9_])/(?:storage|sdcard|data|mnt|system|vendor|product|apex)(?:/[^\\s\\\"'`<>|]+)+"
            r0.<init>(r1)
            fb.f0.f3516a = r0
            java.lang.String r33 = "sql"
            java.lang.String r34 = "bsh"
            java.lang.String r2 = "txt"
            java.lang.String r3 = "md"
            java.lang.String r4 = "java"
            java.lang.String r5 = "kt"
            java.lang.String r6 = "kts"
            java.lang.String r7 = "xml"
            java.lang.String r8 = "json"
            java.lang.String r9 = "jsonl"
            java.lang.String r10 = "prop"
            java.lang.String r11 = "properties"
            java.lang.String r12 = "log"
            java.lang.String r13 = "csv"
            java.lang.String r14 = "tsv"
            java.lang.String r15 = "html"
            java.lang.String r16 = "htm"
            java.lang.String r17 = "css"
            java.lang.String r18 = "js"
            java.lang.String r19 = "ts"
            java.lang.String r20 = "py"
            java.lang.String r21 = "sh"
            java.lang.String r22 = "c"
            java.lang.String r23 = "cc"
            java.lang.String r24 = "cpp"
            java.lang.String r25 = "h"
            java.lang.String r26 = "hpp"
            java.lang.String r27 = "gradle"
            java.lang.String r28 = "toml"
            java.lang.String r29 = "yaml"
            java.lang.String r30 = "yml"
            java.lang.String r31 = "ini"
            java.lang.String r32 = "conf"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34}
            java.util.Set r0 = tf.d0.W(r0)
            fb.f0.f3517b = r0
            return
    }

    public static java.io.File a(java.io.File r1) {
            java.io.File r1 = r1.getCanonicalFile()     // Catch: java.lang.Throwable -> L5
            goto Lc
        L5:
            r1 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r1)
            r1 = r0
        Lc:
            boolean r0 = r1 instanceof sf.f
            if (r0 == 0) goto L12
            r1 = 0
        L12:
            java.io.File r1 = (java.io.File) r1
            return r1
    }

    public static java.lang.String b(java.lang.String r1) {
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            r0 = 12
            char[] r0 = new char[r0]
            r0 = {x0014: FILL_ARRAY_DATA , data: [34, 39, 96, 44, 59, -244, 12290, -229, 41, -247, 93, 12305} // fill-array
            java.lang.String r1 = og.m.S0(r1, r0)
            return r1
    }

    public static java.util.ArrayList c(java.lang.String r5) {
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            og.d r1 = new og.d
            r1.<init>(r5)
        La:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3a
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.CharSequence r2 = og.m.R0(r2)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = b(r2)
            java.lang.String r3 = "/"
            r4 = 0
            boolean r3 = og.t.d0(r2, r3, r4)
            if (r3 == 0) goto La
            java.io.File r3 = new java.io.File
            r3.<init>(r2)
            boolean r3 = r3.exists()
            if (r3 == 0) goto La
            r0.add(r2)
            goto La
        L3a:
            og.k r1 = fb.f0.f3516a
            ng.c r5 = og.k.c(r1, r5)
            f.i0 r1 = new f.i0
            r1.<init>(r5)
        L45:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L65
            java.lang.Object r5 = r1.next()
            og.f r5 = (og.f) r5
            og.i r5 = (og.i) r5
            java.lang.String r5 = r5.c()
            java.lang.String r5 = b(r5)
            boolean r2 = og.m.t0(r5)
            if (r2 != 0) goto L45
            r0.add(r5)
            goto L45
        L65:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r0 = r0.iterator()
        L6e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L89
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            java.io.File r1 = a(r2)
            if (r1 == 0) goto L6e
            r5.add(r1)
            goto L6e
        L89:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r5 = r5.iterator()
        L97:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto Lb2
            java.lang.Object r2 = r5.next()
            r3 = r2
            java.io.File r3 = (java.io.File) r3
            java.lang.String r3 = r3.getPath()
            boolean r3 = r0.add(r3)
            if (r3 == 0) goto L97
            r1.add(r2)
            goto L97
        Lb2:
            return r1
    }

    public static java.lang.String d(java.lang.String r3, java.lang.String r4) {
            r3.getClass()
            java.lang.String r3 = org.json.JSONObject.quote(r3)
            r3.getClass()
            java.lang.String r0 = ">\n"
            java.lang.String r1 = "\n</local_file>"
            java.lang.String r2 = "<local_file path="
            java.lang.String r3 = bc.e.k(r2, r3, r0, r4, r1)
            return r3
    }

    public static java.lang.String e(java.lang.String r3, java.lang.String r4) {
            r3.getClass()
            java.lang.String r0 = "image/"
            r1 = 0
            boolean r2 = og.t.d0(r4, r0, r1)
            if (r2 == 0) goto Ld
            return r4
        Ld:
            java.lang.String r4 = java.net.URLConnection.guessContentTypeFromName(r3)
            if (r4 == 0) goto L1e
            boolean r0 = og.t.d0(r4, r0, r1)
            if (r0 == 0) goto L1a
            goto L1b
        L1a:
            r4 = 0
        L1b:
            if (r4 == 0) goto L1e
            return r4
        L1e:
            java.io.File r4 = new java.io.File
            r4.<init>(r3)
            java.lang.String r3 = dg.l.c0(r4)
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r4)
            r3.getClass()
            int r4 = r3.hashCode()
            switch(r4) {
                case 102340: goto L65;
                case 105441: goto L59;
                case 111145: goto L4d;
                case 3268712: goto L44;
                case 3645340: goto L38;
                default: goto L37;
            }
        L37:
            goto L6d
        L38:
            java.lang.String r4 = "webp"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L41
            goto L6d
        L41:
            java.lang.String r3 = "image/webp"
            return r3
        L44:
            java.lang.String r4 = "jpeg"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L62
            goto L6d
        L4d:
            java.lang.String r4 = "png"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L56
            goto L6d
        L56:
            java.lang.String r3 = "image/png"
            return r3
        L59:
            java.lang.String r4 = "jpg"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L62
            goto L6d
        L62:
            java.lang.String r3 = "image/jpeg"
            return r3
        L65:
            java.lang.String r4 = "gif"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L70
        L6d:
            java.lang.String r3 = ""
            return r3
        L70:
            java.lang.String r3 = "image/gif"
            return r3
    }

    public static fb.e0 f(java.lang.String r1) {
            java.util.ArrayList r1 = c(r1)
            tf.u r0 = tf.u.f13168g
            fb.e0 r1 = g(r1, r0)
            return r1
    }

    public static fb.e0 g(java.util.List r19, java.util.Map r20) {
            boolean r0 = r19.isEmpty()
            tf.t r1 = tf.t.f13167g
            java.lang.String r2 = ""
            if (r0 == 0) goto L10
            fb.e0 r0 = new fb.e0
            r0.<init>(r2, r1, r1)
            return r0
        L10:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r19.iterator()
        L28:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L3e
            java.lang.Object r5 = r4.next()
            java.io.File r5 = (java.io.File) r5
            java.io.File r5 = a(r5)
            if (r5 == 0) goto L28
            r0.add(r5)
            goto L28
        L3e:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r0 = r0.iterator()
        L4c:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L67
            java.lang.Object r6 = r0.next()
            r7 = r6
            java.io.File r7 = (java.io.File) r7
            java.lang.String r7 = r7.getPath()
            boolean r7 = r4.add(r7)
            if (r7 == 0) goto L4c
            r5.add(r6)
            goto L4c
        L67:
            r0 = 12
            java.util.List r0 = tf.m.L1(r0, r5)
            java.util.Iterator r4 = r0.iterator()
        L71:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L38c
            java.lang.Object r0 = r4.next()
            r5 = r0
            java.io.File r5 = (java.io.File) r5
            boolean r0 = r5.exists()
            if (r0 != 0) goto L9d
            java.lang.String r0 = r5.getPath()
            r0.getClass()
            java.lang.String r5 = "文件不存在"
            java.lang.String r0 = d(r0, r5)
            r3.add(r0)
        L94:
            r6 = r20
        L96:
            r18 = r1
            r16 = r4
            r15 = r9
            goto L385
        L9d:
            boolean r0 = r5.isDirectory()
            if (r0 == 0) goto L10e
            java.io.File[] r0 = r5.listFiles()
            if (r0 == 0) goto Lc1
            fb.r r6 = new fb.r
            r7 = 2
            r6.<init>(r7)
            c9.a0 r7 = new c9.a0
            r8 = 10
            r7.<init>(r6, r8)
            java.util.List r0 = tf.l.H0(r0, r7)
            r6 = 120(0x78, float:1.68E-43)
            java.util.List r0 = tf.m.L1(r6, r0)
            goto Lc2
        Lc1:
            r0 = 0
        Lc2:
            if (r0 != 0) goto Lc6
            r11 = r1
            goto Lc7
        Lc6:
            r11 = r0
        Lc7:
            e9.h r15 = new e9.h
            r0 = 29
            r15.<init>(r0)
            r16 = 30
            java.lang.String r12 = "\n"
            r13 = 0
            r14 = 0
            java.lang.String r0 = tf.m.A1(r11, r12, r13, r14, r15, r16)
            boolean r6 = og.m.t0(r0)
            if (r6 == 0) goto Le0
            java.lang.String r0 = "目录为空或无法读取"
        Le0:
            java.lang.String r6 = r5.getPath()
            r6.getClass()
            java.lang.String r0 = d(r6, r0)
            r3.add(r0)
            java.lang.String r0 = r5.getName()
            boolean r6 = og.m.t0(r0)
            if (r6 == 0) goto Lfc
            java.lang.String r0 = r5.getPath()
        Lfc:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "读取目录: "
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r10.add(r0)
            goto L94
        L10e:
            boolean r0 = r5.isFile()
            if (r0 == 0) goto L36c
            java.lang.String r0 = r5.getPath()
            r6 = r20
            java.lang.Object r0 = r6.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L124
            r7 = r2
            goto L125
        L124:
            r7 = r0
        L125:
            java.lang.String r0 = r5.getPath()
            r0.getClass()
            java.lang.String r0 = e(r0, r7)
            boolean r8 = og.m.t0(r0)
            java.lang.String r11 = " bytes"
            java.lang.String r12 = "，大小="
            if (r8 != 0) goto L194
            long r7 = r5.length()
            r13 = 10485760(0xa00000, double:5.180654E-317)
            int r7 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r7 > 0) goto L182
            java.lang.String r7 = r5.getPath()
            r9.add(r7)
            java.lang.String r7 = r5.getPath()
            r7.getClass()
            long r13 = r5.length()
            java.lang.String r8 = "图片，类型="
            java.lang.StringBuilder r0 = eh.a.v(r8, r0, r12, r13)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = d(r7, r0)
            r3.add(r0)
            java.lang.String r0 = r5.getName()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "读取图片: "
            r5.<init>(r7)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r10.add(r0)
            goto L96
        L182:
            java.lang.String r0 = r5.getPath()
            r0.getClass()
            java.lang.String r5 = "图片超过 10 MB，未发送给模型"
            java.lang.String r0 = d(r0, r5)
            r3.add(r0)
            goto L96
        L194:
            java.lang.String r0 = "text/"
            r8 = 0
            boolean r0 = og.t.d0(r7, r0, r8)
            if (r0 != 0) goto L1b2
            java.lang.String r0 = dg.l.c0(r5)
            java.util.Locale r14 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r14)
            r0.getClass()
            java.util.Set r14 = fb.f0.f3517b
            boolean r0 = r14.contains(r0)
            if (r0 == 0) goto L1b7
        L1b2:
            r18 = r1
            r15 = r9
            goto L23a
        L1b7:
            java.io.FileInputStream r14 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L222
            r14.<init>(r5)     // Catch: java.lang.Throwable -> L222
            r15 = r9
            long r8 = r5.length()     // Catch: java.lang.Throwable -> L215
            r16 = r14
            r13 = 4096(0x1000, double:2.0237E-320)
            long r8 = java.lang.Math.min(r13, r8)     // Catch: java.lang.Throwable -> L20f
            int r8 = (int) r8     // Catch: java.lang.Throwable -> L20f
            byte[] r8 = new byte[r8]     // Catch: java.lang.Throwable -> L20f
            r9 = r16
            int r13 = r9.read(r8)     // Catch: java.lang.Throwable -> L1f5
            if (r13 > 0) goto L1d6
        L1d4:
            r13 = 1
            goto L1e7
        L1d6:
            r14 = 0
            r16 = 0
        L1d9:
            if (r14 < r13) goto L1e0
            int r8 = r16 * 10
            if (r8 >= r13) goto L1e6
            goto L1d4
        L1e0:
            r0 = r8[r14]     // Catch: java.lang.Throwable -> L1f5
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 != 0) goto L1fa
        L1e6:
            r13 = 0
        L1e7:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r13)     // Catch: java.lang.Throwable -> L1f5
            r9.close()     // Catch: java.lang.Throwable -> L1f1
            r18 = r1
            goto L22c
        L1f1:
            r0 = move-exception
            r18 = r1
            goto L226
        L1f5:
            r0 = move-exception
            r18 = r1
        L1f8:
            r1 = r0
            goto L21a
        L1fa:
            r18 = r1
            r1 = 9
            if (r0 < r1) goto L208
            r1 = 14
            if (r1 > r0) goto L20a
            r1 = 32
            if (r0 >= r1) goto L20a
        L208:
            int r16 = r16 + 1
        L20a:
            int r14 = r14 + 1
            r1 = r18
            goto L1d9
        L20f:
            r0 = move-exception
            r18 = r1
            r9 = r16
            goto L1f8
        L215:
            r0 = move-exception
            r18 = r1
            r9 = r14
            goto L1f8
        L21a:
            throw r1     // Catch: java.lang.Throwable -> L21b
        L21b:
            r0 = move-exception
            ig.a.i(r9, r1)     // Catch: java.lang.Throwable -> L220
            throw r0     // Catch: java.lang.Throwable -> L220
        L220:
            r0 = move-exception
            goto L226
        L222:
            r0 = move-exception
            r18 = r1
            r15 = r9
        L226:
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L22c:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r8 = r0 instanceof sf.f
            if (r8 == 0) goto L233
            r0 = r1
        L233:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r13 = r0.booleanValue()
            goto L23b
        L23a:
            r13 = 1
        L23b:
            if (r13 == 0) goto L321
            java.lang.String r1 = r5.getPath()
            r1.getClass()
            long r7 = r5.length()
            r11 = 524288(0x80000, double:2.590327E-318)
            int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            java.lang.String r7 = "读取失败: "
            if (r0 > 0) goto L276
            java.nio.charset.Charset r0 = og.a.f9804a     // Catch: java.lang.Throwable -> L258
            java.lang.String r0 = dg.l.h0(r5, r0)     // Catch: java.lang.Throwable -> L258
            goto L25f
        L258:
            r0 = move-exception
            sf.f r8 = new sf.f
            r8.<init>(r0)
            r0 = r8
        L25f:
            java.lang.Throwable r8 = sf.g.b(r0)
            if (r8 != 0) goto L266
            goto L26e
        L266:
            java.lang.String r0 = r8.getMessage()
            java.lang.String r0 = wb.en.g(r7, r0)
        L26e:
            java.lang.String r0 = (java.lang.String) r0
            r16 = r4
            r17 = r5
            goto L304
        L276:
            java.io.RandomAccessFile r8 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L2e8
            java.lang.String r0 = "r"
            r8.<init>(r5, r0)     // Catch: java.lang.Throwable -> L2e8
            r0 = 262144(0x40000, float:3.67342E-40)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L2dc
            int r9 = r8.read(r0)     // Catch: java.lang.Throwable -> L2dc
            long r11 = r5.length()     // Catch: java.lang.Throwable -> L2dc
            r13 = 262144(0x40000, double:1.295163E-318)
            long r11 = java.lang.Math.min(r13, r11)     // Catch: java.lang.Throwable -> L2dc
            int r11 = (int) r11     // Catch: java.lang.Throwable -> L2dc
            byte[] r12 = new byte[r11]     // Catch: java.lang.Throwable -> L2dc
            long r13 = r5.length()     // Catch: java.lang.Throwable -> L2dc
            r16 = r4
            r17 = r5
            long r4 = (long) r11
            long r13 = r13 - r4
            r4 = 0
            int r11 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r11 >= 0) goto L2a4
            r13 = r4
        L2a4:
            r8.seek(r13)     // Catch: java.lang.Throwable -> L2d9
            int r4 = r8.read(r12)     // Catch: java.lang.Throwable -> L2d9
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2d9
            r5.<init>()     // Catch: java.lang.Throwable -> L2d9
            java.lang.String r11 = new java.lang.String     // Catch: java.lang.Throwable -> L2d9
            if (r9 >= 0) goto L2b5
            r9 = 0
        L2b5:
            java.nio.charset.Charset r13 = og.a.f9804a     // Catch: java.lang.Throwable -> L2d9
            r14 = 0
            r11.<init>(r0, r14, r9, r13)     // Catch: java.lang.Throwable -> L2d9
            r5.append(r11)     // Catch: java.lang.Throwable -> L2d9
            java.lang.String r0 = "\n\n... 文件中间内容已截断 ...\n\n"
            r5.append(r0)     // Catch: java.lang.Throwable -> L2d9
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L2d9
            if (r4 >= 0) goto L2c8
            r4 = 0
        L2c8:
            r14 = 0
            r0.<init>(r12, r14, r4, r13)     // Catch: java.lang.Throwable -> L2d9
            r5.append(r0)     // Catch: java.lang.Throwable -> L2d9
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L2d9
            r8.close()     // Catch: java.lang.Throwable -> L2d7
            goto L2f3
        L2d7:
            r0 = move-exception
            goto L2ed
        L2d9:
            r0 = move-exception
        L2da:
            r4 = r0
            goto L2e2
        L2dc:
            r0 = move-exception
            r16 = r4
            r17 = r5
            goto L2da
        L2e2:
            throw r4     // Catch: java.lang.Throwable -> L2e3
        L2e3:
            r0 = move-exception
            ig.a.i(r8, r4)     // Catch: java.lang.Throwable -> L2d7
            throw r0     // Catch: java.lang.Throwable -> L2d7
        L2e8:
            r0 = move-exception
            r16 = r4
            r17 = r5
        L2ed:
            sf.f r4 = new sf.f
            r4.<init>(r0)
            r0 = r4
        L2f3:
            java.lang.Throwable r4 = sf.g.b(r0)
            if (r4 != 0) goto L2fa
            goto L302
        L2fa:
            java.lang.String r0 = r4.getMessage()
            java.lang.String r0 = wb.en.g(r7, r0)
        L302:
            java.lang.String r0 = (java.lang.String) r0
        L304:
            java.lang.String r0 = d(r1, r0)
            r3.add(r0)
            java.lang.String r0 = r17.getName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "读取文件: "
            r1.<init>(r4)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r10.add(r0)
            goto L385
        L321:
            r16 = r4
            r17 = r5
            java.lang.String r0 = r17.getPath()
            r0.getClass()
            boolean r1 = og.m.t0(r7)
            if (r1 == 0) goto L334
            java.lang.String r7 = "未知"
        L334:
            long r4 = r17.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r8 = "二进制文件，类型="
            r1.<init>(r8)
            r1.append(r7)
            r1.append(r12)
            r1.append(r4)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = d(r0, r1)
            r3.add(r0)
            java.lang.String r0 = r17.getName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "检查文件: "
            r1.<init>(r4)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r10.add(r0)
            goto L385
        L36c:
            r6 = r20
            r18 = r1
            r16 = r4
            r17 = r5
            r15 = r9
            java.lang.String r0 = r17.getPath()
            r0.getClass()
            java.lang.String r1 = "不是普通文件或目录"
            java.lang.String r0 = d(r0, r1)
            r3.add(r0)
        L385:
            r9 = r15
            r4 = r16
            r1 = r18
            goto L71
        L38c:
            r15 = r9
            fb.e0 r0 = new fb.e0
            r7 = 0
            r8 = 62
            java.lang.String r4 = "\n\n"
            r5 = 0
            r6 = 0
            java.lang.String r1 = tf.m.A1(r3, r4, r5, r6, r7, r8)
            r2 = 120000(0x1d4c0, float:1.68156E-40)
            java.lang.String r1 = og.m.P0(r2, r1)
            java.util.Set r2 = tf.m.T1(r15)
            java.util.List r2 = tf.m.P1(r2)
            java.util.Set r3 = tf.m.T1(r10)
            java.util.List r3 = tf.m.P1(r3)
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static fb.e0 h(java.lang.String r9, java.util.ArrayList r10) {
            r9.getClass()
            java.io.File r0 = new java.io.File
            java.lang.CharSequence r1 = og.m.R0(r9)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.io.File r0 = a(r0)
            java.lang.String r1 = "读取失败: "
            tf.t r2 = tf.t.f13167g
            if (r0 == 0) goto Lb2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r10 = r10.iterator()
        L23:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L39
            java.lang.Object r4 = r10.next()
            java.io.File r4 = (java.io.File) r4
            java.io.File r4 = a(r4)
            if (r4 == 0) goto L23
            r3.add(r4)
            goto L23
        L39:
            boolean r10 = r3.isEmpty()
            if (r10 == 0) goto L40
            goto L9e
        L40:
            java.util.Iterator r10 = r3.iterator()
        L44:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L9e
            java.lang.Object r3 = r10.next()
            java.io.File r3 = (java.io.File) r3
            java.lang.String r4 = r0.getPath()
            java.lang.String r5 = r3.getPath()
            boolean r4 = gg.l.a(r4, r5)
            r5 = 1
            if (r4 != 0) goto L91
            java.lang.String r4 = r0.getPath()
            r4.getClass()
            java.lang.String r3 = r3.getPath()
            r3.getClass()
            char[] r6 = new char[r5]
            char r7 = java.io.File.separatorChar
            r8 = 0
            r6[r8] = r7
            java.lang.String r3 = og.m.U0(r3, r6)
            java.lang.String r6 = java.io.File.separator
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r3)
            r7.append(r6)
            java.lang.String r3 = r7.toString()
            boolean r3 = og.t.d0(r4, r3, r8)
            if (r3 == 0) goto L90
            goto L91
        L90:
            r5 = r8
        L91:
            if (r5 == 0) goto L44
            java.util.List r9 = a.a.x0(r0)
            tf.u r10 = tf.u.f13168g
            fb.e0 r9 = g(r9, r10)
            return r9
        L9e:
            fb.e0 r10 = new fb.e0
            java.lang.String r0 = "只能读取用户消息中明确提供的路径或其子项"
            java.lang.String r0 = d(r9, r0)
            java.lang.String r9 = r1.concat(r9)
            java.util.List r9 = a.a.x0(r9)
            r10.<init>(r0, r2, r9)
            return r10
        Lb2:
            fb.e0 r10 = new fb.e0
            java.lang.String r0 = "路径无效"
            java.lang.String r0 = d(r9, r0)
            java.lang.String r9 = r1.concat(r9)
            java.util.List r9 = a.a.x0(r9)
            r10.<init>(r0, r2, r9)
            return r10
    }
}
