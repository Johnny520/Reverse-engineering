package xhss;

/* JADX INFO: renamed from: xhss.ᛶᛵᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0561 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final byte[] f1985 = null;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static final byte[] f1986 = null;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static final java.lang.Object[] f1987 = null;

    static {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            xhss.AbstractC0561.f1987 = r0
            r0 = 4
            byte[] r1 = new byte[r0]
            r1 = {x0016: FILL_ARRAY_DATA , data: [112, 114, 111, 0} // fill-array
            xhss.AbstractC0561.f1985 = r1
            byte[] r0 = new byte[r0]
            r0 = {x001c: FILL_ARRAY_DATA , data: [112, 114, 109, 0} // fill-array
            xhss.AbstractC0561.f1986 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static void m997(int r3, int r4, int r5) {
            java.lang.String r0 = "fromIndex: "
            if (r3 < 0) goto L13
            if (r4 > r5) goto L13
            if (r3 > r4) goto L9
            return
        L9:
            java.lang.String r5 = " > toIndex: "
            java.lang.String r3 = xhss.AbstractC0390.m782(r3, r4, r0, r5)
            xhss.C0532.m959(r3)
            return
        L13:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            r2.append(r3)
            java.lang.String r3 = ", toIndex: "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r3 = ", size: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r3 = r2.toString()
            r1.<init>(r3)
            throw r1
    }

    /* JADX INFO: renamed from: ᛱᛳᲁᲈ, reason: contains not printable characters */
    public static final java.lang.Object[] m998(java.util.Collection r5, java.lang.Object[] r6) {
            int r0 = r5.size()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto Le
            int r5 = r6.length
            if (r5 <= 0) goto L1d
            r6[r2] = r1
            return r6
        Le:
            java.util.Iterator r5 = r5.iterator()
            boolean r3 = r5.hasNext()
            if (r3 != 0) goto L1e
            int r5 = r6.length
            if (r5 <= 0) goto L1d
            r6[r2] = r1
        L1d:
            return r6
        L1e:
            int r3 = r6.length
            if (r0 > r3) goto L23
            r0 = r6
            goto L31
        L23:
            java.lang.Class r3 = r6.getClass()
            java.lang.Class r3 = r3.getComponentType()
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r3, r0)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
        L31:
            int r3 = r2 + 1
            java.lang.Object r4 = r5.next()
            r0[r2] = r4
            int r2 = r0.length
            if (r3 < r2) goto L5d
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto L43
            return r0
        L43:
            int r2 = r3 * 3
            int r2 = r2 + 1
            int r2 = r2 >>> 1
            if (r2 > r3) goto L57
            r2 = 2147483645(0x7ffffffd, float:NaN)
            if (r3 >= r2) goto L51
            goto L57
        L51:
            java.lang.OutOfMemoryError r5 = new java.lang.OutOfMemoryError
            r5.<init>()
            throw r5
        L57:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
        L5b:
            r2 = r3
            goto L31
        L5d:
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto L5b
            if (r0 != r6) goto L68
            r6[r3] = r1
            return r6
        L68:
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r0, r3)
            return r5
    }

    /* JADX INFO: renamed from: ᛲᛴᲀᲈ, reason: contains not printable characters */
    public static final java.lang.String m999(xhss.InterfaceC0038 r3) {
            boolean r0 = r3 instanceof xhss.C0817
            if (r0 == 0) goto Lb
            xhss.ᛸᲇᲁᛱ r3 = (xhss.C0817) r3
            java.lang.String r3 = r3.toString()
            return r3
        Lb:
            r0 = 64
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L24
            r1.<init>()     // Catch: java.lang.Throwable -> L24
            r1.append(r3)     // Catch: java.lang.Throwable -> L24
            r1.append(r0)     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = m1011(r3)     // Catch: java.lang.Throwable -> L24
            r1.append(r2)     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L24
            goto L2b
        L24:
            r1 = move-exception
            xhss.ᲈᛳᛱᲇ r2 = new xhss.ᲈᛳᛱᲇ
            r2.<init>(r1)
            r1 = r2
        L2b:
            java.lang.Throwable r2 = xhss.AbstractC0134.m364(r1)
            if (r2 != 0) goto L32
            goto L4d
        L32:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.Class r2 = r3.getClass()
            java.lang.String r2 = r2.getName()
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r3 = m1011(r3)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
        L4d:
            java.lang.String r1 = (java.lang.String) r1
            return r1
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛲ, reason: contains not printable characters */
    public static boolean m1000(java.io.ByteArrayOutputStream r19, byte[] r20, xhss.C0607[] r21) {
            r0 = r19
            r1 = r20
            r2 = r21
            byte[] r3 = xhss.AbstractC0473.f1708
            byte[] r4 = xhss.AbstractC0473.f1710
            byte[] r5 = xhss.AbstractC0473.f1703
            boolean r6 = java.util.Arrays.equals(r1, r5)
            r7 = 4
            r8 = 0
            r9 = 1
            if (r6 == 0) goto L260
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 3
            r1.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream
            r6.<init>()
            int r10 = r2.length     // Catch: java.lang.Throwable -> L63
            xhss.AbstractC0775.m1312(r6, r10)     // Catch: java.lang.Throwable -> L63
            r10 = 2
            r11 = r8
            r12 = r10
        L2c:
            int r13 = r2.length     // Catch: java.lang.Throwable -> L63
            if (r11 >= r13) goto L65
            r13 = r2[r11]     // Catch: java.lang.Throwable -> L63
            long r14 = r13.f2086     // Catch: java.lang.Throwable -> L63
            xhss.AbstractC0775.m1315(r6, r14, r7)     // Catch: java.lang.Throwable -> L63
            long r14 = r13.f2092     // Catch: java.lang.Throwable -> L63
            xhss.AbstractC0775.m1315(r6, r14, r7)     // Catch: java.lang.Throwable -> L63
            int r14 = r13.f2091     // Catch: java.lang.Throwable -> L63
            long r14 = (long) r14     // Catch: java.lang.Throwable -> L63
            xhss.AbstractC0775.m1315(r6, r14, r7)     // Catch: java.lang.Throwable -> L63
            java.lang.String r14 = r13.f2088     // Catch: java.lang.Throwable -> L63
            java.lang.String r13 = r13.f2085     // Catch: java.lang.Throwable -> L63
            java.lang.String r13 = m1020(r14, r13, r5)     // Catch: java.lang.Throwable -> L63
            int r12 = r12 + 14
            java.nio.charset.Charset r14 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L63
            byte[] r15 = r13.getBytes(r14)     // Catch: java.lang.Throwable -> L63
            int r15 = r15.length     // Catch: java.lang.Throwable -> L63
            xhss.AbstractC0775.m1312(r6, r15)     // Catch: java.lang.Throwable -> L63
            int r12 = r12 + r15
            byte[] r13 = r13.getBytes(r14)     // Catch: java.lang.Throwable -> L63
            r6.write(r13)     // Catch: java.lang.Throwable -> L63
            int r11 = r11 + 1
            goto L2c
        L60:
            r1 = r0
            goto L257
        L63:
            r0 = move-exception
            goto L60
        L65:
            byte[] r5 = r6.toByteArray()     // Catch: java.lang.Throwable -> L63
            int r11 = r5.length     // Catch: java.lang.Throwable -> L63
            java.lang.String r13 = ", does not match actual size "
            java.lang.String r14 = "Expected size "
            if (r12 != r11) goto L23b
            xhss.ᛴᲁᲇᛸ r11 = new xhss.ᛴᲁᲇᛸ     // Catch: java.lang.Throwable -> L63
            r11.<init>(r9, r5, r8)     // Catch: java.lang.Throwable -> L63
            r6.close()
            r1.add(r11)
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream
            r5.<init>()
            r6 = r8
            r11 = r6
        L82:
            int r12 = r2.length     // Catch: java.lang.Throwable -> Lb5
            if (r6 >= r12) goto Lb7
            r12 = r2[r6]     // Catch: java.lang.Throwable -> Lb5
            xhss.AbstractC0775.m1312(r5, r6)     // Catch: java.lang.Throwable -> Lb5
            int r11 = r11 + 4
            int r15 = r12.f2087     // Catch: java.lang.Throwable -> Lb5
            xhss.AbstractC0775.m1312(r5, r15)     // Catch: java.lang.Throwable -> Lb5
            int r15 = r12.f2087     // Catch: java.lang.Throwable -> Lb5
            int r15 = r15 * r10
            int r11 = r11 + r15
            int[] r12 = r12.f2090     // Catch: java.lang.Throwable -> Lb5
            int r15 = r12.length     // Catch: java.lang.Throwable -> Lb5
            r17 = r8
        L9a:
            if (r8 >= r15) goto Lac
            r18 = r12[r8]     // Catch: java.lang.Throwable -> Lb5
            r20 = r10
            int r10 = r18 - r17
            xhss.AbstractC0775.m1312(r5, r10)     // Catch: java.lang.Throwable -> Lb5
            int r8 = r8 + 1
            r10 = r20
            r17 = r18
            goto L9a
        Lac:
            r20 = r10
            int r6 = r6 + 1
            r8 = 0
            goto L82
        Lb2:
            r1 = r0
            goto L232
        Lb5:
            r0 = move-exception
            goto Lb2
        Lb7:
            r20 = r10
            byte[] r6 = r5.toByteArray()     // Catch: java.lang.Throwable -> Lb5
            int r8 = r6.length     // Catch: java.lang.Throwable -> Lb5
            if (r11 != r8) goto L216
            xhss.ᛴᲁᲇᛸ r8 = new xhss.ᛴᲁᲇᛸ     // Catch: java.lang.Throwable -> Lb5
            r8.<init>(r3, r6, r9)     // Catch: java.lang.Throwable -> Lb5
            r5.close()
            r1.add(r8)
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream
            r5.<init>()
            r6 = 0
            r8 = 0
        Ld2:
            int r10 = r2.length     // Catch: java.lang.Throwable -> L136
            if (r6 >= r10) goto L150
            r10 = r2[r6]     // Catch: java.lang.Throwable -> L136
            java.util.TreeMap r11 = r10.f2089     // Catch: java.lang.Throwable -> L136
            java.util.Set r11 = r11.entrySet()     // Catch: java.lang.Throwable -> L136
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> L136
            r12 = 0
        Le2:
            boolean r15 = r11.hasNext()     // Catch: java.lang.Throwable -> L136
            if (r15 == 0) goto Lfa
            java.lang.Object r15 = r11.next()     // Catch: java.lang.Throwable -> L136
            java.util.Map$Entry r15 = (java.util.Map.Entry) r15     // Catch: java.lang.Throwable -> L136
            java.lang.Object r15 = r15.getValue()     // Catch: java.lang.Throwable -> L136
            java.lang.Integer r15 = (java.lang.Integer) r15     // Catch: java.lang.Throwable -> L136
            int r15 = r15.intValue()     // Catch: java.lang.Throwable -> L136
            r12 = r12 | r15
            goto Le2
        Lfa:
            java.io.ByteArrayOutputStream r11 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L136
            r11.<init>()     // Catch: java.lang.Throwable -> L136
            m1002(r11, r10)     // Catch: java.lang.Throwable -> L145
            byte[] r15 = r11.toByteArray()     // Catch: java.lang.Throwable -> L145
            r11.close()     // Catch: java.lang.Throwable -> L136
            java.io.ByteArrayOutputStream r11 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L136
            r11.<init>()     // Catch: java.lang.Throwable -> L136
            m1017(r11, r10)     // Catch: java.lang.Throwable -> L13a
            byte[] r10 = r11.toByteArray()     // Catch: java.lang.Throwable -> L13a
            r11.close()     // Catch: java.lang.Throwable -> L136
            xhss.AbstractC0775.m1312(r5, r6)     // Catch: java.lang.Throwable -> L136
            int r11 = r15.length     // Catch: java.lang.Throwable -> L136
            int r11 = r11 + 2
            int r3 = r10.length     // Catch: java.lang.Throwable -> L136
            int r11 = r11 + r3
            int r8 = r8 + 6
            r3 = r10
            long r9 = (long) r11     // Catch: java.lang.Throwable -> L136
            xhss.AbstractC0775.m1315(r5, r9, r7)     // Catch: java.lang.Throwable -> L136
            xhss.AbstractC0775.m1312(r5, r12)     // Catch: java.lang.Throwable -> L136
            r5.write(r15)     // Catch: java.lang.Throwable -> L136
            r5.write(r3)     // Catch: java.lang.Throwable -> L136
            int r8 = r8 + r11
            int r6 = r6 + 1
            r3 = 3
            r9 = 1
            goto Ld2
        L136:
            r0 = move-exception
            r1 = r0
            goto L20d
        L13a:
            r0 = move-exception
            r1 = r0
            r11.close()     // Catch: java.lang.Throwable -> L140
            goto L144
        L140:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: java.lang.Throwable -> L136
        L144:
            throw r1     // Catch: java.lang.Throwable -> L136
        L145:
            r0 = move-exception
            r1 = r0
            r11.close()     // Catch: java.lang.Throwable -> L14b
            goto L14f
        L14b:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: java.lang.Throwable -> L136
        L14f:
            throw r1     // Catch: java.lang.Throwable -> L136
        L150:
            byte[] r2 = r5.toByteArray()     // Catch: java.lang.Throwable -> L136
            int r3 = r2.length     // Catch: java.lang.Throwable -> L136
            if (r8 != r3) goto L1f1
            xhss.ᛴᲁᲇᛸ r3 = new xhss.ᛴᲁᲇᛸ     // Catch: java.lang.Throwable -> L136
            r6 = 1
            r3.<init>(r7, r2, r6)     // Catch: java.lang.Throwable -> L136
            r5.close()
            r1.add(r3)
            int r2 = r1.size()
            int r2 = r2 * 16
            long r2 = (long) r2
            r5 = 12
            long r5 = r5 + r2
            int r2 = r1.size()
            long r2 = (long) r2
            xhss.AbstractC0775.m1315(r0, r2, r7)
            r2 = 0
        L176:
            int r3 = r1.size()
            if (r2 >= r3) goto L1da
            java.lang.Object r3 = r1.get(r2)
            xhss.ᛴᲁᲇᛸ r3 = (xhss.C0412) r3
            int r8 = r3.f1466
            byte[] r9 = r3.f1464
            r10 = 0
            r12 = 1
            if (r8 == r12) goto L1a5
            r12 = r20
            r13 = 3
            if (r8 == r12) goto L1a2
            if (r8 == r13) goto L19f
            if (r8 == r7) goto L19c
            r14 = 5
            if (r8 != r14) goto L19a
            r14 = 4
            goto L1a9
        L19a:
            r0 = 0
            throw r0
        L19c:
            r14 = 3
            goto L1a9
        L19f:
            r14 = 2
            goto L1a9
        L1a2:
            r14 = 1
            goto L1a9
        L1a5:
            r12 = r20
            r13 = 3
            r14 = r10
        L1a9:
            xhss.AbstractC0775.m1315(r0, r14, r7)
            xhss.AbstractC0775.m1315(r0, r5, r7)
            boolean r3 = r3.f1465
            if (r3 == 0) goto L1c8
            int r3 = r9.length
            long r10 = (long) r3
            byte[] r3 = xhss.AbstractC0775.m1306(r9)
            r4.add(r3)
            int r8 = r3.length
            long r8 = (long) r8
            xhss.AbstractC0775.m1315(r0, r8, r7)
            xhss.AbstractC0775.m1315(r0, r10, r7)
            int r3 = r3.length
        L1c5:
            long r8 = (long) r3
            long r5 = r5 + r8
            goto L1d5
        L1c8:
            r4.add(r9)
            int r3 = r9.length
            long r14 = (long) r3
            xhss.AbstractC0775.m1315(r0, r14, r7)
            xhss.AbstractC0775.m1315(r0, r10, r7)
            int r3 = r9.length
            goto L1c5
        L1d5:
            int r2 = r2 + 1
            r20 = r12
            goto L176
        L1da:
            r8 = 0
        L1db:
            int r1 = r4.size()
            if (r8 >= r1) goto L1ed
            java.lang.Object r1 = r4.get(r8)
            byte[] r1 = (byte[]) r1
            r0.write(r1)
            int r8 = r8 + 1
            goto L1db
        L1ed:
            r18 = 1
            goto L386
        L1f1:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L136
            r0.<init>()     // Catch: java.lang.Throwable -> L136
            r0.append(r14)     // Catch: java.lang.Throwable -> L136
            r0.append(r8)     // Catch: java.lang.Throwable -> L136
            r0.append(r13)     // Catch: java.lang.Throwable -> L136
            int r1 = r2.length     // Catch: java.lang.Throwable -> L136
            r0.append(r1)     // Catch: java.lang.Throwable -> L136
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L136
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L136
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L136
            throw r1     // Catch: java.lang.Throwable -> L136
        L20d:
            r5.close()     // Catch: java.lang.Throwable -> L211
            goto L215
        L211:
            r0 = move-exception
            r1.addSuppressed(r0)
        L215:
            throw r1
        L216:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb5
            r0.<init>()     // Catch: java.lang.Throwable -> Lb5
            r0.append(r14)     // Catch: java.lang.Throwable -> Lb5
            r0.append(r11)     // Catch: java.lang.Throwable -> Lb5
            r0.append(r13)     // Catch: java.lang.Throwable -> Lb5
            int r1 = r6.length     // Catch: java.lang.Throwable -> Lb5
            r0.append(r1)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lb5
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lb5
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lb5
            throw r1     // Catch: java.lang.Throwable -> Lb5
        L232:
            r5.close()     // Catch: java.lang.Throwable -> L236
            goto L23a
        L236:
            r0 = move-exception
            r1.addSuppressed(r0)
        L23a:
            throw r1
        L23b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L63
            r0.<init>()     // Catch: java.lang.Throwable -> L63
            r0.append(r14)     // Catch: java.lang.Throwable -> L63
            r0.append(r12)     // Catch: java.lang.Throwable -> L63
            r0.append(r13)     // Catch: java.lang.Throwable -> L63
            int r1 = r5.length     // Catch: java.lang.Throwable -> L63
            r0.append(r1)     // Catch: java.lang.Throwable -> L63
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L63
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L63
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L63
            throw r1     // Catch: java.lang.Throwable -> L63
        L257:
            r6.close()     // Catch: java.lang.Throwable -> L25b
            goto L25f
        L25b:
            r0 = move-exception
            r1.addSuppressed(r0)
        L25f:
            throw r1
        L260:
            byte[] r5 = xhss.AbstractC0473.f1709
            boolean r6 = java.util.Arrays.equals(r1, r5)
            if (r6 == 0) goto L284
            byte[] r1 = m1019(r2, r5)
            int r2 = r2.length
            long r2 = (long) r2
            r6 = 1
            xhss.AbstractC0775.m1315(r0, r2, r6)
            int r2 = r1.length
            long r2 = (long) r2
            xhss.AbstractC0775.m1315(r0, r2, r7)
            byte[] r1 = xhss.AbstractC0775.m1306(r1)
            int r2 = r1.length
            long r2 = (long) r2
            xhss.AbstractC0775.m1315(r0, r2, r7)
            r0.write(r1)
            return r6
        L284:
            r6 = 1
            boolean r5 = java.util.Arrays.equals(r1, r4)
            if (r5 == 0) goto L2f8
            int r1 = r2.length
            long r8 = (long) r1
            xhss.AbstractC0775.m1315(r0, r8, r6)
            int r1 = r2.length
            r3 = 0
        L292:
            if (r3 >= r1) goto L1ed
            r5 = r2[r3]
            java.util.TreeMap r6 = r5.f2089
            int r6 = r6.size()
            int r6 = r6 * r7
            java.lang.String r8 = r5.f2088
            java.lang.String r9 = r5.f2085
            java.lang.String r8 = m1020(r8, r9, r4)
            java.nio.charset.Charset r9 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r10 = r8.getBytes(r9)
            int r10 = r10.length
            xhss.AbstractC0775.m1312(r0, r10)
            int[] r10 = r5.f2090
            int r10 = r10.length
            xhss.AbstractC0775.m1312(r0, r10)
            long r10 = (long) r6
            xhss.AbstractC0775.m1315(r0, r10, r7)
            long r10 = r5.f2086
            xhss.AbstractC0775.m1315(r0, r10, r7)
            byte[] r6 = r8.getBytes(r9)
            r0.write(r6)
            java.util.TreeMap r6 = r5.f2089
            java.util.Set r6 = r6.keySet()
            java.util.Iterator r6 = r6.iterator()
        L2cf:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L2e7
            java.lang.Object r8 = r6.next()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            xhss.AbstractC0775.m1312(r0, r8)
            r8 = 0
            xhss.AbstractC0775.m1312(r0, r8)
            goto L2cf
        L2e7:
            int[] r5 = r5.f2090
            int r6 = r5.length
            r8 = 0
        L2eb:
            if (r8 >= r6) goto L2f5
            r9 = r5[r8]
            xhss.AbstractC0775.m1312(r0, r9)
            int r8 = r8 + 1
            goto L2eb
        L2f5:
            int r3 = r3 + 1
            goto L292
        L2f8:
            byte[] r4 = xhss.AbstractC0473.f1704
            boolean r5 = java.util.Arrays.equals(r1, r4)
            if (r5 == 0) goto L31c
            byte[] r1 = m1019(r2, r4)
            int r2 = r2.length
            long r2 = (long) r2
            r6 = 1
            xhss.AbstractC0775.m1315(r0, r2, r6)
            int r2 = r1.length
            long r2 = (long) r2
            xhss.AbstractC0775.m1315(r0, r2, r7)
            byte[] r1 = xhss.AbstractC0775.m1306(r1)
            int r2 = r1.length
            long r2 = (long) r2
            xhss.AbstractC0775.m1315(r0, r2, r7)
            r0.write(r1)
            return r6
        L31c:
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 == 0) goto L387
            int r1 = r2.length
            xhss.AbstractC0775.m1312(r0, r1)
            int r1 = r2.length
            r8 = 0
        L328:
            if (r8 >= r1) goto L1ed
            r4 = r2[r8]
            java.lang.String r5 = r4.f2088
            java.util.TreeMap r6 = r4.f2089
            java.lang.String r9 = r4.f2085
            java.lang.String r5 = m1020(r5, r9, r3)
            java.nio.charset.Charset r9 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r10 = r5.getBytes(r9)
            int r10 = r10.length
            xhss.AbstractC0775.m1312(r0, r10)
            int r10 = r6.size()
            xhss.AbstractC0775.m1312(r0, r10)
            int[] r10 = r4.f2090
            int r10 = r10.length
            xhss.AbstractC0775.m1312(r0, r10)
            long r10 = r4.f2086
            xhss.AbstractC0775.m1315(r0, r10, r7)
            byte[] r5 = r5.getBytes(r9)
            r0.write(r5)
            java.util.Set r5 = r6.keySet()
            java.util.Iterator r5 = r5.iterator()
        L361:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L375
            java.lang.Object r6 = r5.next()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            xhss.AbstractC0775.m1312(r0, r6)
            goto L361
        L375:
            int[] r4 = r4.f2090
            int r5 = r4.length
            r6 = 0
        L379:
            if (r6 >= r5) goto L383
            r9 = r4[r6]
            xhss.AbstractC0775.m1312(r0, r9)
            int r6 = r6 + 1
            goto L379
        L383:
            int r8 = r8 + 1
            goto L328
        L386:
            return r18
        L387:
            r16 = 0
            return r16
    }

    /* JADX INFO: renamed from: ᛳᛶᛷᲀ, reason: contains not printable characters */
    public static xhss.C0607[] m1001(java.io.ByteArrayInputStream r10, byte[] r11, int r12, xhss.C0607[] r13) {
            int r0 = r10.available()
            r1 = 0
            if (r0 != 0) goto La
            xhss.ᛶᲇᲈᛴ[] r10 = new xhss.C0607[r1]
            return r10
        La:
            int r0 = r13.length
            r2 = 0
            if (r12 != r0) goto L82
            r0 = r1
        Lf:
            if (r0 >= r12) goto L81
            r3 = 2
            xhss.AbstractC0775.m1307(r10, r3)
            long r4 = xhss.AbstractC0775.m1307(r10, r3)
            int r4 = (int) r4
            java.lang.String r5 = new java.lang.String
            byte[] r4 = xhss.AbstractC0775.m1316(r10, r4)
            java.nio.charset.Charset r6 = java.nio.charset.StandardCharsets.UTF_8
            r5.<init>(r4, r6)
            r4 = 4
            long r6 = xhss.AbstractC0775.m1307(r10, r4)
            long r3 = xhss.AbstractC0775.m1307(r10, r3)
            int r3 = (int) r3
            int r4 = r13.length
            if (r4 > 0) goto L34
        L32:
            r4 = r2
            goto L60
        L34:
            java.lang.String r4 = "!"
            int r4 = r5.indexOf(r4)
            if (r4 >= 0) goto L42
            java.lang.String r4 = ":"
            int r4 = r5.indexOf(r4)
        L42:
            if (r4 <= 0) goto L4b
            int r4 = r4 + 1
            java.lang.String r4 = r5.substring(r4)
            goto L4c
        L4b:
            r4 = r5
        L4c:
            r8 = r1
        L4d:
            int r9 = r13.length
            if (r8 >= r9) goto L32
            r9 = r13[r8]
            java.lang.String r9 = r9.f2085
            boolean r9 = r9.equals(r4)
            if (r9 == 0) goto L5d
            r4 = r13[r8]
            goto L60
        L5d:
            int r8 = r8 + 1
            goto L4d
        L60:
            if (r4 == 0) goto L77
            r4.f2092 = r6
            int[] r5 = m1012(r10, r3)
            byte[] r6 = xhss.AbstractC0473.f1708
            boolean r6 = java.util.Arrays.equals(r11, r6)
            if (r6 == 0) goto L74
            r4.f2087 = r3
            r4.f2090 = r5
        L74:
            int r0 = r0 + 1
            goto Lf
        L77:
            java.lang.String r10 = "Missing profile key: "
            java.lang.String r10 = r10.concat(r5)
            xhss.C0532.m950(r10)
            return r2
        L81:
            return r13
        L82:
            java.lang.String r10 = "Mismatched number of dex files found in metadata"
            xhss.C0532.m950(r10)
            return r2
    }

    /* JADX INFO: renamed from: ᛳᛸᛵᲀ, reason: contains not printable characters */
    public static void m1002(java.io.ByteArrayOutputStream r8, xhss.C0607 r9) {
            int r0 = r9.f2091
            int r0 = r0 * 2
            int r0 = r0 + 7
            r0 = r0 & (-8)
            int r0 = r0 / 8
            byte[] r0 = new byte[r0]
            java.util.TreeMap r1 = r9.f2089
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L16:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L5b
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Object r2 = r2.getValue()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r4 = r2 & 2
            r5 = 1
            if (r4 == 0) goto L47
            int r4 = r3 / 8
            r6 = r0[r4]
            int r7 = r3 % 8
            int r7 = r5 << r7
            r6 = r6 | r7
            byte r6 = (byte) r6
            r0[r4] = r6
        L47:
            r2 = r2 & 4
            if (r2 == 0) goto L16
            int r2 = r9.f2091
            int r3 = r3 + r2
            int r2 = r3 / 8
            r4 = r0[r2]
            int r3 = r3 % 8
            int r3 = r5 << r3
            r3 = r3 | r4
            byte r3 = (byte) r3
            r0[r2] = r3
            goto L16
        L5b:
            r8.write(r0)
            return
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static final void m1003(java.io.Closeable r0, java.lang.Throwable r1) {
            if (r0 == 0) goto L10
            if (r1 != 0) goto L8
            r0.close()
            return
        L8:
            r0.close()     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r0 = move-exception
            xhss.AbstractC1178.m1874(r1, r0)
        L10:
            return
    }

    /* JADX INFO: renamed from: ᛳᲈᲈᛲ, reason: contains not printable characters */
    public static boolean m1004(byte r1) {
            r0 = -65
            if (r1 <= r0) goto L6
            r1 = 1
            return r1
        L6:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᛴᲈᛱᛴ, reason: contains not printable characters */
    public static xhss.C0607[] m1005(java.io.ByteArrayInputStream r9, int r10, xhss.C0607[] r11) {
            int r0 = r9.available()
            r1 = 0
            if (r0 != 0) goto La
            xhss.ᛶᲇᲈᛴ[] r9 = new xhss.C0607[r1]
            return r9
        La:
            int r0 = r11.length
            r2 = 0
            if (r10 != r0) goto L54
            java.lang.String[] r0 = new java.lang.String[r10]
            int[] r3 = new int[r10]
            r4 = r1
        L13:
            if (r4 >= r10) goto L32
            r5 = 2
            long r6 = xhss.AbstractC0775.m1307(r9, r5)
            int r6 = (int) r6
            long r7 = xhss.AbstractC0775.m1307(r9, r5)
            int r5 = (int) r7
            r3[r4] = r5
            java.lang.String r5 = new java.lang.String
            byte[] r6 = xhss.AbstractC0775.m1316(r9, r6)
            java.nio.charset.Charset r7 = java.nio.charset.StandardCharsets.UTF_8
            r5.<init>(r6, r7)
            r0[r4] = r5
            int r4 = r4 + 1
            goto L13
        L32:
            if (r1 >= r10) goto L53
            r4 = r11[r1]
            java.lang.String r5 = r4.f2085
            r6 = r0[r1]
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L4d
            r5 = r3[r1]
            r4.f2087 = r5
            int[] r5 = m1012(r9, r5)
            r4.f2090 = r5
            int r1 = r1 + 1
            goto L32
        L4d:
            java.lang.String r9 = "Order of dexfiles in metadata did not match baseline"
            xhss.C0532.m950(r9)
            return r2
        L53:
            return r11
        L54:
            java.lang.String r9 = "Mismatched number of dex files found in metadata"
            xhss.C0532.m950(r9)
            return r2
    }

    /* JADX INFO: renamed from: ᛶᲇᲈᛸ, reason: contains not printable characters */
    public static long m1006(long r4) {
            r0 = 65535(0xffff, double:3.23786E-319)
            long r2 = r4 & r0
            int r2 = (int) r2
            short r2 = (short) r2
            r3 = 16
            long r4 = r4 >>> r3
            long r4 = r4 & r0
            int r4 = (int) r4
            short r4 = (short) r4
            int r5 = r2 + r4
            short r5 = (short) r5
            int r0 = r5 << 9
            int r5 = r5 >>> 23
            r5 = r5 | r0
            short r5 = (short) r5
            int r5 = r5 + r2
            short r5 = (short) r5
            r4 = r4 ^ r2
            short r4 = (short) r4
            int r0 = r2 << 13
            int r1 = r2 >>> 19
            r0 = r0 | r1
            short r0 = (short) r0
            r0 = r0 ^ r4
            short r0 = (short) r0
            int r1 = r4 << 5
            r0 = r0 ^ r1
            short r0 = (short) r0
            int r1 = r4 << 10
            int r4 = r4 >>> 22
            r4 = r4 | r1
            short r4 = (short) r4
            long r1 = (long) r5
            long r1 = r1 << r3
            long r4 = (long) r4
            long r4 = r4 | r1
            long r4 = r4 << r3
            long r0 = (long) r0
            long r4 = r4 | r0
            return r4
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public static java.lang.String m1007(java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
            r0 = -270566221514821(0xffff09ebe47a77bb, double:NaN)
        /* removed unused decoded string */ 
            r0 = -270609171187781(0xffff09e1e47a77bb, double:NaN)
        /* removed unused decoded string */ 
            r0 = -270647825893445(0xffff09d8e47a77bb, double:NaN)
        /* removed unused decoded string */ 
            r0 = -270686480599109(0xffff09cfe47a77bb, double:NaN)
        /* removed unused decoded string */ 
            r0 = 16
            byte[] r1 = new byte[r0]
            java.security.SecureRandom r2 = new java.security.SecureRandom
            r2.<init>()
            r2.nextBytes(r1)
            byte[] r2 = new byte[r0]
            java.security.SecureRandom r3 = new java.security.SecureRandom
            r3.<init>()
            r3.nextBytes(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r10)
            r3.append(r11)
            r3.append(r12)
            java.lang.String r10 = r3.toString()
            javax.crypto.spec.PBEKeySpec r11 = new javax.crypto.spec.PBEKeySpec
            char[] r10 = r10.toCharArray()
            r3 = -270725135304773(0xffff09c6e47a77bb, double:NaN)
        /* removed unused decoded string */ 
            r12 = 10000(0x2710, float:1.4013E-41)
            r3 = 256(0x100, float:3.59E-43)
            r11.<init>(r10, r1, r12, r3)
            r3 = -270798149748805(0xffff09b5e47a77bb, double:NaN)
            java.lang.String r10 = "PBKDF2WithHmacSHA256"
            javax.crypto.SecretKeyFactory r10 = javax.crypto.SecretKeyFactory.getInstance(r10)
            javax.crypto.SecretKey r10 = r10.generateSecret(r11)
            byte[] r10 = r10.getEncoded()
            java.io.ByteArrayOutputStream r11 = new java.io.ByteArrayOutputStream
            r11.<init>()
            java.util.zip.GZIPOutputStream r12 = new java.util.zip.GZIPOutputStream
            r12.<init>(r11)
            java.nio.charset.Charset r3 = xhss.AbstractC0619.f2136     // Catch: java.lang.Throwable -> L10d
            byte[] r9 = r9.getBytes(r3)     // Catch: java.lang.Throwable -> L10d
            r3 = -270888344062021(0xffff09a0e47a77bb, double:NaN)
        /* removed unused decoded string */ // Catch: java.lang.Throwable -> L10d
            r12.write(r9)     // Catch: java.lang.Throwable -> L10d
            r12.close()
            byte[] r9 = r11.toByteArray()
            r11 = -270948473604165(0xffff0992e47a77bb, double:NaN)
            java.lang.String r11 = "AES/CBC/PKCS5Padding"
            javax.crypto.Cipher r11 = javax.crypto.Cipher.getInstance(r11)
            javax.crypto.spec.SecretKeySpec r12 = new javax.crypto.spec.SecretKeySpec
            r3 = -271038667917381(0xffff097de47a77bb, double:NaN)
            java.lang.String r3 = "AES"
            r12.<init>(r10, r3)
            javax.crypto.spec.IvParameterSpec r3 = new javax.crypto.spec.IvParameterSpec
            r3.<init>(r2)
            r4 = 1
            r11.init(r4, r12, r3)
            byte[] r9 = r11.doFinal(r9)
            int r11 = r9.length
            byte[] r12 = new byte[r11]
            int r3 = r9.length
            r5 = 0
            r6 = r5
        Lbf:
            if (r6 >= r3) goto Lcf
            r7 = r9[r6]
            int r8 = r10.length
            int r8 = r6 % r8
            r8 = r10[r8]
            r7 = r7 ^ r8
            byte r7 = (byte) r7
            r12[r6] = r7
            int r6 = r6 + 1
            goto Lbf
        Lcf:
            if (r11 != 0) goto Ld2
            goto Le4
        Ld2:
            byte[] r9 = new byte[r11]
            int r11 = r11 - r4
            if (r11 < 0) goto Le3
            r10 = r5
        Ld8:
            int r3 = r11 - r10
            r4 = r12[r10]
            r9[r3] = r4
            if (r10 == r11) goto Le3
            int r10 = r10 + 1
            goto Ld8
        Le3:
            r12 = r9
        Le4:
            r9 = 32
            byte[] r9 = java.util.Arrays.copyOf(r1, r9)
            java.lang.System.arraycopy(r2, r5, r9, r0, r0)
            int r10 = r9.length
            int r11 = r12.length
            int r0 = r10 + r11
            byte[] r9 = java.util.Arrays.copyOf(r9, r0)
            java.lang.System.arraycopy(r12, r5, r9, r10, r11)
            java.util.Base64$Encoder r10 = java.util.Base64.getEncoder()
            java.util.Base64$Encoder r10 = r10.withoutPadding()
            java.lang.String r9 = r10.encodeToString(r9)
            r10 = -271055847786565(0xffff0979e47a77bb, double:NaN)
        /* removed unused decoded string */ 
            return r9
        L10d:
            r9 = move-exception
            throw r9     // Catch: java.lang.Throwable -> L10f
        L10f:
            r10 = move-exception
            m1003(r12, r9)
            throw r10
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static void m1008(java.lang.StringBuilder r0, java.lang.Object r1, xhss.InterfaceC0645 r2) {
            if (r2 == 0) goto Lc
            java.lang.Object r1 = r2.mo112(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.append(r1)
            return
        Lc:
            if (r1 != 0) goto L10
            r2 = 1
            goto L12
        L10:
            boolean r2 = r1 instanceof java.lang.CharSequence
        L12:
            if (r2 == 0) goto L1a
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.append(r1)
            return
        L1a:
            boolean r2 = r1 instanceof java.lang.Character
            if (r2 == 0) goto L28
            java.lang.Character r1 = (java.lang.Character) r1
            char r1 = r1.charValue()
            r0.append(r1)
            return
        L28:
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public static void m1009(byte r1, byte r2, char[] r3, int r4) {
            r0 = -62
            if (r1 < r0) goto L1b
            boolean r0 = m1004(r2)
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
            xhss.C0532.m959(r1)
            return
        L1b:
            java.lang.String r1 = "Invalid UTF-8: Illegal leading byte in 2 bytes utf"
            xhss.C0532.m959(r1)
            return
    }

    /* JADX INFO: renamed from: ᛸᛲᛷᛱ, reason: contains not printable characters */
    public static xhss.C0607[] m1010(java.io.FileInputStream r7, byte[] r8, byte[] r9, xhss.C0607[] r10) {
            byte[] r0 = xhss.AbstractC0473.f1707
            boolean r1 = java.util.Arrays.equals(r8, r0)
            r2 = 0
            java.lang.String r3 = "Unsupported meta version"
            java.lang.String r4 = "Content found after the end of file"
            r5 = 4
            if (r1 == 0) goto L5b
            byte[] r1 = xhss.AbstractC0473.f1703
            boolean r9 = java.util.Arrays.equals(r1, r9)
            if (r9 != 0) goto L55
            boolean r8 = java.util.Arrays.equals(r8, r0)
            if (r8 == 0) goto L51
            r8 = 1
            long r8 = xhss.AbstractC0775.m1307(r7, r8)
            int r8 = (int) r8
            long r0 = xhss.AbstractC0775.m1307(r7, r5)
            long r5 = xhss.AbstractC0775.m1307(r7, r5)
            int r9 = (int) r5
            int r0 = (int) r0
            byte[] r9 = xhss.AbstractC0775.m1321(r7, r9, r0)
            int r7 = r7.read()
            if (r7 > 0) goto L4d
            java.io.ByteArrayInputStream r7 = new java.io.ByteArrayInputStream
            r7.<init>(r9)
            xhss.ᛶᲇᲈᛴ[] r8 = m1005(r7, r8, r10)     // Catch: java.lang.Throwable -> L43
            r7.close()
            return r8
        L43:
            r8 = move-exception
            r7.close()     // Catch: java.lang.Throwable -> L48
            goto L4c
        L48:
            r7 = move-exception
            r8.addSuppressed(r7)
        L4c:
            throw r8
        L4d:
            xhss.C0532.m950(r4)
            return r2
        L51:
            xhss.C0532.m950(r3)
            return r2
        L55:
            java.lang.String r7 = "Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher"
            xhss.C0532.m950(r7)
            return r2
        L5b:
            byte[] r0 = xhss.AbstractC0473.f1706
            boolean r8 = java.util.Arrays.equals(r8, r0)
            if (r8 == 0) goto L98
            r8 = 2
            long r0 = xhss.AbstractC0775.m1307(r7, r8)
            int r8 = (int) r0
            long r0 = xhss.AbstractC0775.m1307(r7, r5)
            long r5 = xhss.AbstractC0775.m1307(r7, r5)
            int r3 = (int) r5
            int r0 = (int) r0
            byte[] r0 = xhss.AbstractC0775.m1321(r7, r3, r0)
            int r7 = r7.read()
            if (r7 > 0) goto L94
            java.io.ByteArrayInputStream r7 = new java.io.ByteArrayInputStream
            r7.<init>(r0)
            xhss.ᛶᲇᲈᛴ[] r8 = m1001(r7, r9, r8, r10)     // Catch: java.lang.Throwable -> L8a
            r7.close()
            return r8
        L8a:
            r8 = move-exception
            r7.close()     // Catch: java.lang.Throwable -> L8f
            goto L93
        L8f:
            r7 = move-exception
            r8.addSuppressed(r7)
        L93:
            throw r8
        L94:
            xhss.C0532.m950(r4)
            return r2
        L98:
            xhss.C0532.m950(r3)
            return r2
    }

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public static final java.lang.String m1011(java.lang.Object r0) {
            int r0 = java.lang.System.identityHashCode(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            return r0
    }

    /* JADX INFO: renamed from: ᛸᛶᛴᲈ, reason: contains not printable characters */
    public static int[] m1012(java.io.ByteArrayInputStream r5, int r6) {
            int[] r0 = new int[r6]
            r1 = 0
            r2 = r1
        L4:
            if (r1 >= r6) goto L12
            r3 = 2
            long r3 = xhss.AbstractC0775.m1307(r5, r3)
            int r3 = (int) r3
            int r2 = r2 + r3
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4
        L12:
            return r0
    }

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public static void m1013(byte r2, byte r3, byte r4, byte r5, char[] r6, int r7) {
            boolean r0 = m1004(r3)
            if (r0 != 0) goto L41
            int r0 = r2 << 28
            int r1 = r3 + 112
            int r1 = r1 + r0
            int r0 = r1 >> 30
            if (r0 != 0) goto L41
            boolean r0 = m1004(r4)
            if (r0 != 0) goto L41
            boolean r0 = m1004(r5)
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
            xhss.C0532.m959(r2)
            return
    }

    /* JADX INFO: renamed from: ᲀᛷᲁᲀ, reason: contains not printable characters */
    public static final java.lang.Object[] m1014(java.util.Collection r4) {
            int r0 = r4.size()
            if (r0 != 0) goto L7
            goto L11
        L7:
            java.util.Iterator r4 = r4.iterator()
            boolean r1 = r4.hasNext()
            if (r1 != 0) goto L14
        L11:
            java.lang.Object[] r4 = xhss.AbstractC0561.f1987
            return r4
        L14:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
        L17:
            int r2 = r1 + 1
            java.lang.Object r3 = r4.next()
            r0[r1] = r3
            int r1 = r0.length
            if (r2 < r1) goto L43
            boolean r1 = r4.hasNext()
            if (r1 != 0) goto L29
            return r0
        L29:
            int r1 = r2 * 3
            int r1 = r1 + 1
            int r1 = r1 >>> 1
            if (r1 > r2) goto L3d
            r1 = 2147483645(0x7ffffffd, float:NaN)
            if (r2 >= r1) goto L37
            goto L3d
        L37:
            java.lang.OutOfMemoryError r4 = new java.lang.OutOfMemoryError
            r4.<init>()
            throw r4
        L3d:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
        L41:
            r1 = r2
            goto L17
        L43:
            boolean r1 = r4.hasNext()
            if (r1 != 0) goto L41
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r0, r2)
            return r4
    }

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public static java.util.Set m1015() {
            java.lang.String r0 = "android.text.EmojiConsistency"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r1 = "getEmojiConsistencySet"
            r2 = 0
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r0 = r0.invoke(r2, r2)     // Catch: java.lang.Throwable -> L2d
            if (r0 != 0) goto L16
            java.util.Set r0 = java.util.Collections.EMPTY_SET     // Catch: java.lang.Throwable -> L2d
            return r0
        L16:
            java.util.Set r0 = (java.util.Set) r0     // Catch: java.lang.Throwable -> L2d
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L2d
        L1c:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L2d
            boolean r2 = r2 instanceof int[]     // Catch: java.lang.Throwable -> L2d
            if (r2 != 0) goto L1c
            java.util.Set r0 = java.util.Collections.EMPTY_SET     // Catch: java.lang.Throwable -> L2d
        L2c:
            return r0
        L2d:
            java.util.Set r0 = java.util.Collections.EMPTY_SET
            return r0
    }

    /* JADX INFO: renamed from: ᲁᛲᛴᛴ, reason: contains not printable characters */
    public static xhss.C0607[] m1016(java.io.FileInputStream r6, byte[] r7, java.lang.String r8) {
            byte[] r0 = xhss.AbstractC0473.f1709
            boolean r7 = java.util.Arrays.equals(r7, r0)
            r0 = 0
            if (r7 == 0) goto L41
            r7 = 1
            long r1 = xhss.AbstractC0775.m1307(r6, r7)
            int r7 = (int) r1
            r1 = 4
            long r2 = xhss.AbstractC0775.m1307(r6, r1)
            long r4 = xhss.AbstractC0775.m1307(r6, r1)
            int r1 = (int) r4
            int r2 = (int) r2
            byte[] r1 = xhss.AbstractC0775.m1321(r6, r1, r2)
            int r6 = r6.read()
            if (r6 > 0) goto L3b
            java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream
            r6.<init>(r1)
            xhss.ᛶᲇᲈᛴ[] r7 = m1022(r6, r8, r7)     // Catch: java.lang.Throwable -> L31
            r6.close()
            return r7
        L31:
            r7 = move-exception
            r6.close()     // Catch: java.lang.Throwable -> L36
            goto L3a
        L36:
            r6 = move-exception
            r7.addSuppressed(r6)
        L3a:
            throw r7
        L3b:
            java.lang.String r6 = "Content found after the end of file"
            xhss.C0532.m950(r6)
            return r0
        L41:
            java.lang.String r6 = "Unsupported version"
            xhss.C0532.m950(r6)
            return r0
    }

    /* JADX INFO: renamed from: ᲁᛴᛴᛸ, reason: contains not printable characters */
    public static void m1017(java.io.ByteArrayOutputStream r4, xhss.C0607 r5) {
            java.util.TreeMap r5 = r5.f2089
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
            r0 = 0
            r1 = r0
        Lc:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L3b
            java.lang.Object r2 = r5.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Object r2 = r2.getValue()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r2 = r2 & 1
            if (r2 != 0) goto L31
            goto Lc
        L31:
            int r1 = r3 - r1
            xhss.AbstractC0775.m1312(r4, r1)
            xhss.AbstractC0775.m1312(r4, r0)
            r1 = r3
            goto Lc
        L3b:
            return
    }

    /* JADX INFO: renamed from: ᲁᲁᛴᲁ, reason: contains not printable characters */
    public static void m1018(java.io.ByteArrayOutputStream r4, xhss.C0607 r5, java.lang.String r6) {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r1 = r6.getBytes(r0)
            int r1 = r1.length
            xhss.AbstractC0775.m1312(r4, r1)
            int r1 = r5.f2087
            xhss.AbstractC0775.m1312(r4, r1)
            int r1 = r5.f2093
            long r1 = (long) r1
            r3 = 4
            xhss.AbstractC0775.m1315(r4, r1, r3)
            long r1 = r5.f2086
            xhss.AbstractC0775.m1315(r4, r1, r3)
            int r5 = r5.f2091
            long r1 = (long) r5
            xhss.AbstractC0775.m1315(r4, r1, r3)
            byte[] r5 = r6.getBytes(r0)
            r4.write(r5)
            return
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static byte[] m1019(xhss.C0607[] r11, byte[] r12) {
            int r0 = r11.length
            r1 = 0
            r2 = r1
            r3 = r2
        L4:
            if (r2 >= r0) goto L30
            r4 = r11[r2]
            java.lang.String r5 = r4.f2088
            java.lang.String r6 = r4.f2085
            java.lang.String r5 = m1020(r5, r6, r12)
            java.nio.charset.Charset r6 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r5 = r5.getBytes(r6)
            int r5 = r5.length
            int r5 = r5 + 16
            int r6 = r4.f2087
            int r6 = r6 * 2
            int r6 = r6 + r5
            int r5 = r4.f2093
            int r6 = r6 + r5
            int r4 = r4.f2091
            int r4 = r4 * 2
            int r4 = r4 + 7
            r4 = r4 & (-8)
            int r4 = r4 / 8
            int r4 = r4 + r6
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L4
        L30:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>(r3)
            byte[] r2 = xhss.AbstractC0473.f1704
            boolean r2 = java.util.Arrays.equals(r12, r2)
            if (r2 == 0) goto L69
            int r2 = r11.length
            r4 = r1
        L3f:
            if (r4 >= r2) goto L9e
            r5 = r11[r4]
            java.lang.String r6 = r5.f2088
            java.lang.String r7 = r5.f2085
            java.lang.String r6 = m1020(r6, r7, r12)
            m1018(r0, r5, r6)
            m1017(r0, r5)
            int[] r6 = r5.f2090
            int r7 = r6.length
            r8 = r1
            r9 = r8
        L56:
            if (r8 >= r7) goto L63
            r10 = r6[r8]
            int r9 = r10 - r9
            xhss.AbstractC0775.m1312(r0, r9)
            int r8 = r8 + 1
            r9 = r10
            goto L56
        L63:
            m1002(r0, r5)
            int r4 = r4 + 1
            goto L3f
        L69:
            int r2 = r11.length
            r4 = r1
        L6b:
            if (r4 >= r2) goto L7d
            r5 = r11[r4]
            java.lang.String r6 = r5.f2088
            java.lang.String r7 = r5.f2085
            java.lang.String r6 = m1020(r6, r7, r12)
            m1018(r0, r5, r6)
            int r4 = r4 + 1
            goto L6b
        L7d:
            int r12 = r11.length
            r2 = r1
        L7f:
            if (r2 >= r12) goto L9e
            r4 = r11[r2]
            m1017(r0, r4)
            int[] r5 = r4.f2090
            int r6 = r5.length
            r7 = r1
            r8 = r7
        L8b:
            if (r7 >= r6) goto L98
            r9 = r5[r7]
            int r8 = r9 - r8
            xhss.AbstractC0775.m1312(r0, r8)
            int r7 = r7 + 1
            r8 = r9
            goto L8b
        L98:
            m1002(r0, r4)
            int r2 = r2 + 1
            goto L7f
        L9e:
            int r11 = r0.size()
            if (r11 != r3) goto La9
            byte[] r11 = r0.toByteArray()
            return r11
        La9:
            int r11 = r0.size()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "The bytes saved do not match expectation. actual="
            r12.<init>(r0)
            r12.append(r11)
            java.lang.String r11 = " expected="
            r12.append(r11)
            r12.append(r3)
            java.lang.String r11 = r12.toString()
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>(r11)
            throw r12
    }

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public static java.lang.String m1020(java.lang.String r6, java.lang.String r7, byte[] r8) {
            byte[] r0 = xhss.AbstractC0473.f1710
            byte[] r1 = xhss.AbstractC0473.f1708
            boolean r2 = java.util.Arrays.equals(r8, r1)
            java.lang.String r3 = "!"
            java.lang.String r4 = ":"
            if (r2 == 0) goto Lf
            goto L15
        Lf:
            boolean r2 = java.util.Arrays.equals(r8, r0)
            if (r2 == 0) goto L17
        L15:
            r2 = r4
            goto L18
        L17:
            r2 = r3
        L18:
            int r5 = r6.length()
            if (r5 > 0) goto L34
            boolean r6 = r3.equals(r2)
            if (r6 == 0) goto L29
            java.lang.String r6 = r7.replace(r4, r3)
            return r6
        L29:
            boolean r6 = r4.equals(r2)
            if (r6 == 0) goto L87
            java.lang.String r6 = r7.replace(r3, r4)
            return r6
        L34:
            java.lang.String r5 = "classes.dex"
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L3d
            return r6
        L3d:
            boolean r5 = r7.contains(r3)
            if (r5 != 0) goto L71
            boolean r5 = r7.contains(r4)
            if (r5 == 0) goto L4a
            goto L71
        L4a:
            java.lang.String r2 = ".apk"
            boolean r2 = r7.endsWith(r2)
            if (r2 == 0) goto L53
            goto L87
        L53:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r6)
            boolean r6 = java.util.Arrays.equals(r8, r1)
            if (r6 == 0) goto L5f
            goto L65
        L5f:
            boolean r6 = java.util.Arrays.equals(r8, r0)
            if (r6 == 0) goto L66
        L65:
            r3 = r4
        L66:
            r2.append(r3)
            r2.append(r7)
            java.lang.String r6 = r2.toString()
            return r6
        L71:
            boolean r6 = r3.equals(r2)
            if (r6 == 0) goto L7c
            java.lang.String r6 = r7.replace(r4, r3)
            return r6
        L7c:
            boolean r6 = r4.equals(r2)
            if (r6 == 0) goto L87
            java.lang.String r6 = r7.replace(r3, r4)
            return r6
        L87:
            return r7
    }

    /* JADX INFO: renamed from: ᲇᛸᛳᲁ, reason: contains not printable characters */
    public static xhss.InterfaceC0038 m1021(xhss.InterfaceC0038 r2) {
            boolean r0 = r2 instanceof xhss.AbstractC0748
            if (r0 == 0) goto L8
            r0 = r2
            xhss.ᛸᛴᛳᛷ r0 = (xhss.AbstractC0748) r0
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto L25
            xhss.ᛱᛴᛶᛴ r2 = r0.f2509
            if (r2 != 0) goto L25
            xhss.ᛴᛵᛳᛵ r2 = r0.f2508
            xhss.ᛳᛴᲀᲁ r1 = xhss.C0263.f972
            xhss.ᛳᛵᲈᛲ r2 = r2.mo442(r1)
            xhss.ᛲᛶᲇᲇ r2 = (xhss.AbstractC0180) r2
            if (r2 == 0) goto L21
            xhss.ᛸᲇᲁᛱ r1 = new xhss.ᛸᲇᲁᛱ
            r1.<init>(r2, r0)
            goto L22
        L21:
            r1 = r0
        L22:
            r0.f2509 = r1
            return r1
        L25:
            return r2
    }

    /* JADX INFO: renamed from: ᲈᛲᛵᲁ, reason: contains not printable characters */
    public static xhss.C0607[] m1022(java.io.ByteArrayInputStream r19, java.lang.String r20, int r21) {
            r0 = r19
            r1 = r21
            int r2 = r0.available()
            r3 = 0
            if (r2 != 0) goto Le
            xhss.ᛶᲇᲈᛴ[] r0 = new xhss.C0607[r3]
            return r0
        Le:
            xhss.ᛶᲇᲈᛴ[] r2 = new xhss.C0607[r1]
            r4 = r3
        L11:
            r5 = 2
            if (r4 >= r1) goto L50
            long r6 = xhss.AbstractC0775.m1307(r0, r5)
            int r6 = (int) r6
            long r7 = xhss.AbstractC0775.m1307(r0, r5)
            int r14 = (int) r7
            r5 = 4
            long r7 = xhss.AbstractC0775.m1307(r0, r5)
            long r12 = xhss.AbstractC0775.m1307(r0, r5)
            long r9 = xhss.AbstractC0775.m1307(r0, r5)
            xhss.ᛶᲇᲈᛴ r5 = new xhss.ᛶᲇᲈᛴ
            java.lang.String r11 = new java.lang.String
            byte[] r6 = xhss.AbstractC0775.m1316(r0, r6)
            java.nio.charset.Charset r15 = java.nio.charset.StandardCharsets.UTF_8
            r11.<init>(r6, r15)
            int r15 = (int) r7
            int r6 = (int) r9
            int[] r7 = new int[r14]
            java.util.TreeMap r18 = new java.util.TreeMap
            r18.<init>()
            r10 = r20
            r9 = r5
            r16 = r6
            r17 = r7
            r9.<init>(r10, r11, r12, r14, r15, r16, r17, r18)
            r2[r4] = r9
            int r4 = r4 + 1
            goto L11
        L50:
            r4 = r3
        L51:
            if (r4 >= r1) goto L11b
            r6 = r2[r4]
            int r7 = r0.available()
            int r8 = r6.f2093
            int r9 = r6.f2091
            java.util.TreeMap r10 = r6.f2089
            int r7 = r7 - r8
            r8 = r3
        L61:
            int r11 = r0.available()
            r12 = 7
            if (r11 <= r7) goto Lb4
            long r13 = xhss.AbstractC0775.m1307(r0, r5)
            int r11 = (int) r13
            int r8 = r8 + r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            r13 = 1
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            r10.put(r11, r14)
            long r14 = xhss.AbstractC0775.m1307(r0, r5)
            int r11 = (int) r14
        L7f:
            if (r11 <= 0) goto L61
            xhss.AbstractC0775.m1307(r0, r5)
            long r14 = xhss.AbstractC0775.m1307(r0, r13)
            int r14 = (int) r14
            r15 = 6
            if (r14 != r15) goto L90
        L8c:
            r15 = r3
            r16 = r4
            goto Lae
        L90:
            if (r14 != r12) goto L93
            goto L8c
        L93:
            if (r14 <= 0) goto L8c
            xhss.AbstractC0775.m1307(r0, r13)
            r15 = r3
            r16 = r4
            long r3 = xhss.AbstractC0775.m1307(r0, r13)
            int r3 = (int) r3
        La0:
            if (r3 <= 0) goto La8
            xhss.AbstractC0775.m1307(r0, r5)
            int r3 = r3 + (-1)
            goto La0
        La8:
            int r14 = r14 + (-1)
            r3 = r15
            r4 = r16
            goto L93
        Lae:
            int r11 = r11 + (-1)
            r3 = r15
            r4 = r16
            goto L7f
        Lb4:
            r15 = r3
            r16 = r4
            int r3 = r0.available()
            if (r3 != r7) goto L114
            int r3 = r6.f2087
            int[] r3 = m1012(r0, r3)
            r6.f2090 = r3
            int r3 = r9 * 2
            int r3 = r3 + r12
            r3 = r3 & (-8)
            int r3 = r3 / 8
            byte[] r3 = xhss.AbstractC0775.m1316(r0, r3)
            java.util.BitSet r3 = java.util.BitSet.valueOf(r3)
            r4 = r15
        Ld5:
            if (r4 >= r9) goto L10f
            boolean r6 = r3.get(r4)
            if (r6 == 0) goto Ldf
            r6 = r5
            goto Le0
        Ldf:
            r6 = r15
        Le0:
            int r7 = r4 + r9
            boolean r7 = r3.get(r7)
            if (r7 == 0) goto Lea
            r6 = r6 | 4
        Lea:
            if (r6 == 0) goto L10c
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            java.lang.Object r7 = r10.get(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 != 0) goto Lfc
            java.lang.Integer r7 = java.lang.Integer.valueOf(r15)
        Lfc:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            int r7 = r7.intValue()
            r6 = r6 | r7
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r10.put(r8, r6)
        L10c:
            int r4 = r4 + 1
            goto Ld5
        L10f:
            int r4 = r16 + 1
            r3 = r15
            goto L51
        L114:
            java.lang.String r0 = "Read too much data during profile line parse"
            xhss.C0532.m950(r0)
            r0 = 0
            return r0
        L11b:
            return r2
    }

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public static void m1023(byte r2, byte r3, byte r4, char[] r5, int r6) {
            boolean r0 = m1004(r3)
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
            boolean r0 = m1004(r4)
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
            xhss.C0532.m959(r2)
            return
    }

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ */
    public abstract java.lang.reflect.Member mo464();

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ */
    public abstract int mo135(xhss.C0099 r1);

    /* JADX INFO: renamed from: ᲁᛴᲇᛲ, reason: contains not printable characters */
    public /* synthetic */ void m1024() {
            r2 = this;
            java.lang.reflect.Member r0 = r2.mo464()
            boolean r0 = xhss.AbstractC0334.m676(r0)
            if (r0 == 0) goto Lb
            return
        Lb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to make the member \""
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = "\" accessible. Please check if the member is accessible or if the security manager allows it."
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
    }
}
