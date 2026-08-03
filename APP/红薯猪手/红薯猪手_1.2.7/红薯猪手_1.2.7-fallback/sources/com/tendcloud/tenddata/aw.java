package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public final class aw {
    private static final java.lang.String a = "Archimedes_p";
    private static final int b = 1000000000;

    public aw() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int a() {
            com.tendcloud.tenddata.n$b r0 = com.tendcloud.tenddata.n.b.AES_DATA_LOCK     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = r0.toString()     // Catch: java.lang.Throwable -> L29
            com.tendcloud.tenddata.n.getFileLock(r1)     // Catch: java.lang.Throwable -> L29
            int[][] r1 = b()     // Catch: java.lang.Throwable -> L29
            int r1 = com.tendcloud.tenddata.at.a(r1)     // Catch: java.lang.Throwable -> L29
            if (r1 != 0) goto L21
            java.security.SecureRandom r1 = com.tendcloud.tenddata.y.b()     // Catch: java.lang.Throwable -> L29
            r2 = 1000000000(0x3b9aca00, float:0.0047237873)
            int r1 = r1.nextInt(r2)     // Catch: java.lang.Throwable -> L29
            a(r1)     // Catch: java.lang.Throwable -> L29
        L21:
            java.lang.String r0 = r0.toString()
            com.tendcloud.tenddata.n.releaseFileLock(r0)
            return r1
        L29:
            com.tendcloud.tenddata.n$b r0 = com.tendcloud.tenddata.n.b.AES_DATA_LOCK
            java.lang.String r0 = r0.toString()
            com.tendcloud.tenddata.n.releaseFileLock(r0)
            r0 = 0
            return r0
    }

    private static void a(int r11) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 16
            r0.<init>(r1)
            r1 = 0
            r2 = r1
        L9:
            r3 = 3
            int[] r4 = new int[r3]
            r5 = 7
            int[] r6 = new int[r5]
            int[] r7 = new int[r5]
            java.security.SecureRandom r8 = com.tendcloud.tenddata.y.b()
            r9 = r1
        L16:
            if (r9 >= r3) goto L23
            r10 = 1000(0x3e8, float:1.401E-42)
            int r10 = r8.nextInt(r10)
            r4[r9] = r10
            int r9 = r9 + 1
            goto L16
        L23:
            r3 = r1
        L24:
            if (r3 >= r5) goto L31
            r9 = 100
            int r9 = r8.nextInt(r9)
            r6[r3] = r9
            int r3 = r3 + 1
            goto L24
        L31:
            r3 = r1
        L32:
            r8 = 1
            if (r3 >= r5) goto L6a
            r9 = r4[r1]
            r10 = r6[r3]
            int r9 = r9 * r10
            int r9 = r9 * r10
            int r9 = r9 * r10
            r8 = r4[r8]
            int r8 = r8 * r10
            int r8 = r8 * r10
            int r8 = r8 + r9
            r9 = 2
            r9 = r4[r9]
            int r9 = r9 * r10
            int r9 = r9 + r8
            int r9 = r9 + r11
            r7[r3] = r9
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r9 = r6[r3]
            r8.append(r9)
            java.lang.String r9 = ","
            r8.append(r9)
            r10 = r7[r3]
            r8.append(r10)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r0.add(r8)
            int r3 = r3 + 1
            goto L32
        L6a:
            boolean r3 = a(r0, r11)
            if (r3 == 0) goto L71
            goto L77
        L71:
            r0.clear()
            int r2 = r2 + r8
            if (r2 < r5) goto L9
        L77:
            java.lang.String r11 = "Archimedes_p"
            r1 = 4
            if (r8 >= r1) goto L99
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            r1.append(r8)
            java.lang.String r11 = r1.toString()
            int r1 = r8 + (-1)
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            com.tendcloud.tenddata.av.a(r11, r1)
            int r8 = r8 + 1
            goto L77
        L99:
            r2 = 6
            if (r1 >= r2) goto Lb9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r11)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            int r3 = r1 + (-1)
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            com.tendcloud.tenddata.av.b(r2, r3)
            int r1 = r1 + 1
            goto L99
        Lb9:
            r11 = 8
            if (r2 >= r11) goto Le0
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            android.content.Context r1 = com.tendcloud.tenddata.ab.g
            java.lang.String r1 = r1.getPackageName()
            r11.append(r1)
            r11.append(r2)
            java.lang.String r11 = r11.toString()
            int r1 = r2 + (-1)
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            com.tendcloud.tenddata.av.c(r11, r1)
            int r2 = r2 + 1
            goto Lb9
        Le0:
            return
    }

    private static boolean a(java.util.ArrayList<java.lang.String> r4, int r5) {
            r0 = 0
            java.lang.String r1 = ""
            r2 = r0
        L4:
            r3 = 4
            if (r2 >= r3) goto L14
            java.lang.Object r3 = r4.get(r2)     // Catch: java.lang.Throwable -> L20
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = r1.concat(r3)     // Catch: java.lang.Throwable -> L20
            int r2 = r2 + 1
            goto L4
        L14:
            r4 = 2
            int[][] r4 = a(r1, r3, r4)     // Catch: java.lang.Throwable -> L20
            int r4 = com.tendcloud.tenddata.at.a(r4)     // Catch: java.lang.Throwable -> L20
            if (r5 != r4) goto L20
            r0 = 1
        L20:
            return r0
    }

    private static int[][] a(java.lang.String r7, int r8, int r9) {
            r0 = 2
            int[] r0 = new int[r0]
            r1 = 1
            r0[r1] = r9
            r1 = 0
            r0[r1] = r8
            java.lang.Class r2 = java.lang.Integer.TYPE
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r2, r0)
            int[][] r0 = (int[][]) r0
            java.lang.String r2 = ","
            java.lang.String[] r7 = r7.split(r2)
            r2 = r1
            r3 = r2
        L19:
            if (r2 >= r8) goto L30
            r4 = r1
        L1c:
            if (r4 >= r9) goto L2d
            r5 = r0[r2]
            r6 = r7[r3]
            int r6 = java.lang.Integer.parseInt(r6)
            r5[r4] = r6
            int r3 = r3 + 1
            int r4 = r4 + 1
            goto L1c
        L2d:
            int r2 = r2 + 1
            goto L19
        L30:
            return r0
    }

    private static int[][] b() {
            r0 = 0
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La2
            r1.<init>()     // Catch: java.lang.Throwable -> La2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La2
            r2.<init>()     // Catch: java.lang.Throwable -> La2
            r3 = 0
            r4 = 1
            r5 = r3
        Le:
            java.lang.String r6 = "Archimedes_p"
            r7 = 4
            if (r4 >= r7) goto L34
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La2
            r7.<init>()     // Catch: java.lang.Throwable -> La2
            r7.append(r6)     // Catch: java.lang.Throwable -> La2
            r7.append(r4)     // Catch: java.lang.Throwable -> La2
            java.lang.String r6 = r7.toString()     // Catch: java.lang.Throwable -> La2
            java.lang.String r6 = com.tendcloud.tenddata.av.a(r6)     // Catch: java.lang.Throwable -> La2
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> La2
            if (r7 != 0) goto L31
            r1.add(r6)     // Catch: java.lang.Throwable -> La2
            int r5 = r5 + 1
        L31:
            int r4 = r4 + 1
            goto Le
        L34:
            r4 = r7
        L35:
            r8 = 6
            if (r4 >= r8) goto L59
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La2
            r8.<init>()     // Catch: java.lang.Throwable -> La2
            r8.append(r6)     // Catch: java.lang.Throwable -> La2
            r8.append(r4)     // Catch: java.lang.Throwable -> La2
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> La2
            java.lang.String r8 = com.tendcloud.tenddata.av.b(r8)     // Catch: java.lang.Throwable -> La2
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> La2
            if (r9 != 0) goto L56
            r1.add(r8)     // Catch: java.lang.Throwable -> La2
            int r5 = r5 + 1
        L56:
            int r4 = r4 + 1
            goto L35
        L59:
            if (r5 >= r7) goto L84
        L5b:
            r4 = 8
            if (r8 >= r4) goto L84
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La2
            r4.<init>()     // Catch: java.lang.Throwable -> La2
            android.content.Context r5 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> La2
            java.lang.String r5 = r5.getPackageName()     // Catch: java.lang.Throwable -> La2
            r4.append(r5)     // Catch: java.lang.Throwable -> La2
            r4.append(r8)     // Catch: java.lang.Throwable -> La2
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> La2
            java.lang.String r4 = com.tendcloud.tenddata.av.c(r4)     // Catch: java.lang.Throwable -> La2
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> La2
            if (r5 != 0) goto L81
            r1.add(r4)     // Catch: java.lang.Throwable -> La2
        L81:
            int r8 = r8 + 1
            goto L5b
        L84:
            int r4 = r1.size()     // Catch: java.lang.Throwable -> La2
            if (r4 >= r7) goto L8b
            return r0
        L8b:
            if (r3 >= r7) goto L99
            java.lang.Object r4 = r1.get(r3)     // Catch: java.lang.Throwable -> La2
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> La2
            r2.append(r4)     // Catch: java.lang.Throwable -> La2
            int r3 = r3 + 1
            goto L8b
        L99:
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> La2
            r2 = 2
            int[][] r0 = a(r1, r7, r2)     // Catch: java.lang.Throwable -> La2
        La2:
            return r0
    }
}
