package com.android.dx.cf.cst;

/* JADX INFO: loaded from: classes.dex */
public final class ConstantPoolParser {
    private final com.android.dx.util.ByteArray bytes;
    private int endOffset;
    private com.android.dx.cf.iface.ParseObserver observer;
    private final int[] offsets;
    private final com.android.dx.rop.cst.StdConstantPool pool;

    public ConstantPoolParser(com.android.dx.util.ByteArray r2) {
            r1 = this;
            r1.<init>()
            r0 = 8
            int r0 = r2.getUnsignedShort(r0)
            r1.bytes = r2
            com.android.dx.rop.cst.StdConstantPool r2 = new com.android.dx.rop.cst.StdConstantPool
            r2.<init>(r0)
            r1.pool = r2
            int[] r2 = new int[r0]
            r1.offsets = r2
            r2 = -1
            r1.endOffset = r2
            return
    }

    private void determineOffsets() {
            r6 = this;
            r0 = 10
            r1 = 1
            r2 = r1
        L4:
            int[] r3 = r6.offsets
            int r4 = r3.length
            if (r2 >= r4) goto L72
            r3[r2] = r0
            com.android.dx.util.ByteArray r3 = r6.bytes
            int r3 = r3.getUnsignedByte(r0)
            switch(r3) {
                case 1: goto L3f;
                case 2: goto L14;
                case 3: goto L31;
                case 4: goto L31;
                case 5: goto L3b;
                case 6: goto L3b;
                case 7: goto L35;
                case 8: goto L35;
                case 9: goto L31;
                case 10: goto L31;
                case 11: goto L31;
                case 12: goto L31;
                case 13: goto L14;
                case 14: goto L14;
                case 15: goto L38;
                case 16: goto L35;
                case 17: goto L14;
                case 18: goto L31;
                default: goto L14;
            }
        L14:
            com.android.dx.cf.iface.ParseException r1 = new com.android.dx.cf.iface.ParseException     // Catch: com.android.dx.cf.iface.ParseException -> L2f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: com.android.dx.cf.iface.ParseException -> L2f
            r4.<init>()     // Catch: com.android.dx.cf.iface.ParseException -> L2f
            java.lang.String r5 = "unknown tag byte: "
            r4.append(r5)     // Catch: com.android.dx.cf.iface.ParseException -> L2f
            java.lang.String r3 = com.android.dx.util.Hex.u1(r3)     // Catch: com.android.dx.cf.iface.ParseException -> L2f
            r4.append(r3)     // Catch: com.android.dx.cf.iface.ParseException -> L2f
            java.lang.String r3 = r4.toString()     // Catch: com.android.dx.cf.iface.ParseException -> L2f
            r1.<init>(r3)     // Catch: com.android.dx.cf.iface.ParseException -> L2f
            throw r1     // Catch: com.android.dx.cf.iface.ParseException -> L2f
        L2f:
            r1 = move-exception
            goto L4d
        L31:
            int r0 = r0 + 5
        L33:
            r3 = r1
            goto L4b
        L35:
            int r0 = r0 + 3
            goto L33
        L38:
            int r0 = r0 + 4
            goto L33
        L3b:
            int r0 = r0 + 9
            r3 = 2
            goto L4b
        L3f:
            com.android.dx.util.ByteArray r3 = r6.bytes     // Catch: com.android.dx.cf.iface.ParseException -> L2f
            int r4 = r0 + 1
            int r3 = r3.getUnsignedShort(r4)     // Catch: com.android.dx.cf.iface.ParseException -> L2f
            int r3 = r3 + 3
            int r0 = r0 + r3
            goto L33
        L4b:
            int r2 = r2 + r3
            goto L4
        L4d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "...while preparsing cst "
            r3.append(r4)
            java.lang.String r2 = com.android.dx.util.Hex.u2(r2)
            r3.append(r2)
            java.lang.String r2 = " at offset "
            r3.append(r2)
            java.lang.String r0 = com.android.dx.util.Hex.u4(r0)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.addContext(r0)
            throw r1
        L72:
            r6.endOffset = r0
            return
    }

    private static int getMethodHandleTypeForKind(int r3) {
            switch(r3) {
                case 1: goto L2b;
                case 2: goto L29;
                case 3: goto L27;
                case 4: goto L25;
                case 5: goto L23;
                case 6: goto L21;
                case 7: goto L1f;
                case 8: goto L1d;
                case 9: goto L1a;
                default: goto L3;
            }
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "invalid kind: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L1a:
            r3 = 8
            return r3
        L1d:
            r3 = 6
            return r3
        L1f:
            r3 = 7
            return r3
        L21:
            r3 = 4
            return r3
        L23:
            r3 = 5
            return r3
        L25:
            r3 = 0
            return r3
        L27:
            r3 = 2
            return r3
        L29:
            r3 = 1
            return r3
        L2b:
            r3 = 3
            return r3
    }

    private void parse() {
            r9 = this;
            r9.determineOffsets()
            com.android.dx.cf.iface.ParseObserver r0 = r9.observer
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L39
            com.android.dx.util.ByteArray r3 = r9.bytes
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "constant_pool_count: "
            r4.append(r5)
            int[] r5 = r9.offsets
            int r5 = r5.length
            java.lang.String r5 = com.android.dx.util.Hex.u2(r5)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r5 = 8
            r6 = 2
            r0.parsed(r3, r5, r6, r4)
            com.android.dx.cf.iface.ParseObserver r0 = r9.observer
            com.android.dx.util.ByteArray r3 = r9.bytes
            r4 = 10
            java.lang.String r5 = "\nconstant_pool:"
            r0.parsed(r3, r4, r1, r5)
            com.android.dx.cf.iface.ParseObserver r0 = r9.observer
            r0.changeIndent(r2)
        L39:
            java.util.BitSet r0 = new java.util.BitSet
            int[] r3 = r9.offsets
            int r3 = r3.length
            r0.<init>(r3)
            r3 = r2
        L42:
            int[] r4 = r9.offsets
            int r5 = r4.length
            if (r3 >= r5) goto L59
            r4 = r4[r3]
            if (r4 == 0) goto L56
            com.android.dx.rop.cst.StdConstantPool r4 = r9.pool
            com.android.dx.rop.cst.Constant r4 = r4.getOrNull(r3)
            if (r4 != 0) goto L56
            r9.parse0(r3, r0)
        L56:
            int r3 = r3 + 1
            goto L42
        L59:
            com.android.dx.cf.iface.ParseObserver r3 = r9.observer
            if (r3 == 0) goto Le1
        L5d:
            int[] r3 = r9.offsets
            int r3 = r3.length
            if (r2 >= r3) goto Ld0
            com.android.dx.rop.cst.StdConstantPool r3 = r9.pool
            com.android.dx.rop.cst.Constant r3 = r3.getOrNull(r2)
            if (r3 != 0) goto L6b
            goto Lcd
        L6b:
            int[] r4 = r9.offsets
            r4 = r4[r2]
            int r5 = r9.endOffset
            int r6 = r2 + 1
        L73:
            int[] r7 = r9.offsets
            int r8 = r7.length
            if (r6 >= r8) goto L81
            r7 = r7[r6]
            if (r7 == 0) goto L7e
            r5 = r7
            goto L81
        L7e:
            int r6 = r6 + 1
            goto L73
        L81:
            boolean r6 = r0.get(r2)
            if (r6 == 0) goto La9
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = com.android.dx.util.Hex.u2(r2)
            r6.append(r7)
            java.lang.String r7 = ": utf8{\""
            r6.append(r7)
            java.lang.String r3 = r3.toHuman()
            r6.append(r3)
            java.lang.String r3 = "\"}"
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            goto Lc5
        La9:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = com.android.dx.util.Hex.u2(r2)
            r6.append(r7)
            java.lang.String r7 = ": "
            r6.append(r7)
            java.lang.String r3 = r3.toString()
            r6.append(r3)
            java.lang.String r3 = r6.toString()
        Lc5:
            com.android.dx.cf.iface.ParseObserver r6 = r9.observer
            com.android.dx.util.ByteArray r7 = r9.bytes
            int r5 = r5 - r4
            r6.parsed(r7, r4, r5, r3)
        Lcd:
            int r2 = r2 + 1
            goto L5d
        Ld0:
            com.android.dx.cf.iface.ParseObserver r0 = r9.observer
            r2 = -1
            r0.changeIndent(r2)
            com.android.dx.cf.iface.ParseObserver r0 = r9.observer
            com.android.dx.util.ByteArray r2 = r9.bytes
            int r3 = r9.endOffset
            java.lang.String r4 = "end constant_pool"
            r0.parsed(r2, r3, r1, r4)
        Le1:
            return
    }

    private com.android.dx.rop.cst.Constant parse0(int r7, java.util.BitSet r8) {
            r6 = this;
            java.lang.String r0 = " at offset "
            java.lang.String r1 = "...while parsing cst "
            com.android.dx.rop.cst.StdConstantPool r2 = r6.pool
            com.android.dx.rop.cst.Constant r2 = r2.getOrNull(r7)
            if (r2 == 0) goto Ld
            return r2
        Ld:
            int[] r2 = r6.offsets
            r2 = r2[r7]
            com.android.dx.util.ByteArray r3 = r6.bytes     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            int r3 = r3.getUnsignedByte(r2)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            switch(r3) {
                case 1: goto L1c3;
                case 2: goto L1a;
                case 3: goto L1b6;
                case 4: goto L1a9;
                case 5: goto L19c;
                case 6: goto L18f;
                case 7: goto L172;
                case 8: goto L165;
                case 9: goto L143;
                case 10: goto L121;
                case 11: goto Lff;
                case 12: goto Ldb;
                case 13: goto L1a;
                case 14: goto L1a;
                case 15: goto L6b;
                case 16: goto L57;
                case 17: goto L1a;
                case 18: goto L3b;
                default: goto L1a;
            }     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
        L1a:
            com.android.dx.cf.iface.ParseException r8 = new com.android.dx.cf.iface.ParseException     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            r4.<init>()     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            java.lang.String r5 = "unknown tag byte: "
            r4.append(r5)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            java.lang.String r3 = com.android.dx.util.Hex.u1(r3)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            r4.append(r3)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            java.lang.String r3 = r4.toString()     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            r8.<init>(r3)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            throw r8     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
        L35:
            r8 = move-exception
            goto L1d1
        L38:
            r8 = move-exception
            goto L1f7
        L3b:
            com.android.dx.util.ByteArray r3 = r6.bytes     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            int r4 = r2 + 1
            int r3 = r3.getUnsignedShort(r4)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            com.android.dx.util.ByteArray r4 = r6.bytes     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            int r5 = r2 + 3
            int r4 = r4.getUnsignedShort(r5)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            com.android.dx.rop.cst.Constant r8 = r6.parse0(r4, r8)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            com.android.dx.rop.cst.CstNat r8 = (com.android.dx.rop.cst.CstNat) r8     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            com.android.dx.rop.cst.CstInvokeDynamic r8 = com.android.dx.rop.cst.CstInvokeDynamic.make(r3, r8)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            goto L1cb
        L57:
            com.android.dx.util.ByteArray r3 = r6.bytes     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            int r4 = r2 + 1
            int r3 = r3.getUnsignedShort(r4)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            com.android.dx.rop.cst.Constant r8 = r6.parse0(r3, r8)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            com.android.dx.rop.cst.CstString r8 = (com.android.dx.rop.cst.CstString) r8     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            com.android.dx.rop.cst.CstProtoRef r8 = com.android.dx.rop.cst.CstProtoRef.make(r8)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            goto L1cb
        L6b:
            com.android.dx.util.ByteArray r3 = r6.bytes     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            int r4 = r2 + 1
            int r3 = r3.getUnsignedByte(r4)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            com.android.dx.util.ByteArray r4 = r6.bytes     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            int r5 = r2 + 2
            int r4 = r4.getUnsignedShort(r5)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            switch(r3) {
                case 1: goto Lcb;
                case 2: goto Lcb;
                case 3: goto Lcb;
                case 4: goto Lcb;
                case 5: goto Lc4;
                case 6: goto L9c;
                case 7: goto L9c;
                case 8: goto Lc4;
                case 9: goto L95;
                default: goto L7e;
            }     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
        L7e:
            com.android.dx.cf.iface.ParseException r8 = new com.android.dx.cf.iface.ParseException     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            r4.<init>()     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            java.lang.String r5 = "Unsupported MethodHandle kind: "
            r4.append(r5)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            r4.append(r3)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            java.lang.String r3 = r4.toString()     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            r8.<init>(r3)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            throw r8     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
        L95:
            com.android.dx.rop.cst.Constant r8 = r6.parse0(r4, r8)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            com.android.dx.rop.cst.CstInterfaceMethodRef r8 = (com.android.dx.rop.cst.CstInterfaceMethodRef) r8     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            goto Ld1
        L9c:
            com.android.dx.rop.cst.Constant r8 = r6.parse0(r4, r8)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            boolean r4 = r8 instanceof com.android.dx.rop.cst.CstMethodRef     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            if (r4 != 0) goto Ld1
            boolean r4 = r8 instanceof com.android.dx.rop.cst.CstInterfaceMethodRef     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            if (r4 == 0) goto La9
            goto Ld1
        La9:
            com.android.dx.cf.iface.ParseException r3 = new com.android.dx.cf.iface.ParseException     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            r4.<init>()     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            java.lang.String r5 = "Unsupported ref constant type for MethodHandle "
            r4.append(r5)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            java.lang.Class r8 = r8.getClass()     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            r4.append(r8)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            java.lang.String r8 = r4.toString()     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            r3.<init>(r8)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            throw r3     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
        Lc4:
            com.android.dx.rop.cst.Constant r8 = r6.parse0(r4, r8)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            com.android.dx.rop.cst.CstMethodRef r8 = (com.android.dx.rop.cst.CstMethodRef) r8     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            goto Ld1
        Lcb:
            com.android.dx.rop.cst.Constant r8 = r6.parse0(r4, r8)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            com.android.dx.rop.cst.CstFieldRef r8 = (com.android.dx.rop.cst.CstFieldRef) r8     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
        Ld1:
            int r3 = getMethodHandleTypeForKind(r3)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            com.android.dx.rop.cst.CstMethodHandle r8 = com.android.dx.rop.cst.CstMethodHandle.make(r3, r8)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            goto L1cb
        Ldb:
            com.android.dx.util.ByteArray r3 = r6.bytes     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            int r4 = r2 + 1
            int r3 = r3.getUnsignedShort(r4)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            com.android.dx.rop.cst.Constant r3 = r6.parse0(r3, r8)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            com.android.dx.rop.cst.CstString r3 = (com.android.dx.rop.cst.CstString) r3     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            com.android.dx.util.ByteArray r4 = r6.bytes     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            int r5 = r2 + 3
            int r4 = r4.getUnsignedShort(r5)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            com.android.dx.rop.cst.Constant r8 = r6.parse0(r4, r8)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            com.android.dx.rop.cst.CstString r8 = (com.android.dx.rop.cst.CstString) r8     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            com.android.dx.rop.cst.CstNat r4 = new com.android.dx.rop.cst.CstNat     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            r4.<init>(r3, r8)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
        Lfc:
            r8 = r4
            goto L1cb
        Lff:
            com.android.dx.util.ByteArray r3 = r6.bytes     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            int r4 = r2 + 1
            int r3 = r3.getUnsignedShort(r4)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            com.android.dx.rop.cst.Constant r3 = r6.parse0(r3, r8)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            com.android.dx.rop.cst.CstType r3 = (com.android.dx.rop.cst.CstType) r3     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            com.android.dx.util.ByteArray r4 = r6.bytes     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            int r5 = r2 + 3
            int r4 = r4.getUnsignedShort(r5)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            com.android.dx.rop.cst.Constant r8 = r6.parse0(r4, r8)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            com.android.dx.rop.cst.CstNat r8 = (com.android.dx.rop.cst.CstNat) r8     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            com.android.dx.rop.cst.CstInterfaceMethodRef r4 = new com.android.dx.rop.cst.CstInterfaceMethodRef     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            r4.<init>(r3, r8)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            goto Lfc
        L121:
            com.android.dx.util.ByteArray r3 = r6.bytes     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            int r4 = r2 + 1
            int r3 = r3.getUnsignedShort(r4)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            com.android.dx.rop.cst.Constant r3 = r6.parse0(r3, r8)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            com.android.dx.rop.cst.CstType r3 = (com.android.dx.rop.cst.CstType) r3     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            com.android.dx.util.ByteArray r4 = r6.bytes     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            int r5 = r2 + 3
            int r4 = r4.getUnsignedShort(r5)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            com.android.dx.rop.cst.Constant r8 = r6.parse0(r4, r8)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            com.android.dx.rop.cst.CstNat r8 = (com.android.dx.rop.cst.CstNat) r8     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            com.android.dx.rop.cst.CstMethodRef r4 = new com.android.dx.rop.cst.CstMethodRef     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            r4.<init>(r3, r8)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            goto Lfc
        L143:
            com.android.dx.util.ByteArray r3 = r6.bytes     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            int r4 = r2 + 1
            int r3 = r3.getUnsignedShort(r4)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            com.android.dx.rop.cst.Constant r3 = r6.parse0(r3, r8)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            com.android.dx.rop.cst.CstType r3 = (com.android.dx.rop.cst.CstType) r3     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            com.android.dx.util.ByteArray r4 = r6.bytes     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            int r5 = r2 + 3
            int r4 = r4.getUnsignedShort(r5)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            com.android.dx.rop.cst.Constant r8 = r6.parse0(r4, r8)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            com.android.dx.rop.cst.CstNat r8 = (com.android.dx.rop.cst.CstNat) r8     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            com.android.dx.rop.cst.CstFieldRef r4 = new com.android.dx.rop.cst.CstFieldRef     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            r4.<init>(r3, r8)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            goto Lfc
        L165:
            com.android.dx.util.ByteArray r3 = r6.bytes     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            int r4 = r2 + 1
            int r3 = r3.getUnsignedShort(r4)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            com.android.dx.rop.cst.Constant r8 = r6.parse0(r3, r8)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            goto L1cb
        L172:
            com.android.dx.util.ByteArray r3 = r6.bytes     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            int r4 = r2 + 1
            int r3 = r3.getUnsignedShort(r4)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            com.android.dx.rop.cst.Constant r8 = r6.parse0(r3, r8)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            com.android.dx.rop.cst.CstString r8 = (com.android.dx.rop.cst.CstString) r8     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            com.android.dx.rop.cst.CstType r3 = new com.android.dx.rop.cst.CstType     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            java.lang.String r8 = r8.getString()     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            com.android.dx.rop.type.Type r8 = com.android.dx.rop.type.Type.internClassName(r8)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            r3.<init>(r8)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
        L18d:
            r8 = r3
            goto L1cb
        L18f:
            com.android.dx.util.ByteArray r8 = r6.bytes     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            int r3 = r2 + 1
            long r3 = r8.getLong(r3)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            com.android.dx.rop.cst.CstDouble r8 = com.android.dx.rop.cst.CstDouble.make(r3)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            goto L1cb
        L19c:
            com.android.dx.util.ByteArray r8 = r6.bytes     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            int r3 = r2 + 1
            long r3 = r8.getLong(r3)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            com.android.dx.rop.cst.CstLong r8 = com.android.dx.rop.cst.CstLong.make(r3)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            goto L1cb
        L1a9:
            com.android.dx.util.ByteArray r8 = r6.bytes     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            int r3 = r2 + 1
            int r8 = r8.getInt(r3)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            com.android.dx.rop.cst.CstFloat r8 = com.android.dx.rop.cst.CstFloat.make(r8)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            goto L1cb
        L1b6:
            com.android.dx.util.ByteArray r8 = r6.bytes     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            int r3 = r2 + 1
            int r8 = r8.getInt(r3)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            com.android.dx.rop.cst.CstInteger r8 = com.android.dx.rop.cst.CstInteger.make(r8)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            goto L1cb
        L1c3:
            com.android.dx.rop.cst.CstString r3 = r6.parseUtf8(r2)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            r8.set(r7)     // Catch: java.lang.RuntimeException -> L35 com.android.dx.cf.iface.ParseException -> L38
            goto L18d
        L1cb:
            com.android.dx.rop.cst.StdConstantPool r0 = r6.pool
            r0.set(r7, r8)
            return r8
        L1d1:
            com.android.dx.cf.iface.ParseException r3 = new com.android.dx.cf.iface.ParseException
            r3.<init>(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r1)
            java.lang.String r7 = com.android.dx.util.Hex.u2(r7)
            r8.append(r7)
            r8.append(r0)
            java.lang.String r7 = com.android.dx.util.Hex.u4(r2)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r3.addContext(r7)
            throw r3
        L1f7:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r7 = com.android.dx.util.Hex.u2(r7)
            r3.append(r7)
            r3.append(r0)
            java.lang.String r7 = com.android.dx.util.Hex.u4(r2)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r8.addContext(r7)
            throw r8
    }

    private void parseIfNecessary() {
            r1 = this;
            int r0 = r1.endOffset
            if (r0 >= 0) goto L7
            r1.parse()
        L7:
            return
    }

    private com.android.dx.rop.cst.CstString parseUtf8(int r3) {
            r2 = this;
            com.android.dx.util.ByteArray r0 = r2.bytes
            int r1 = r3 + 1
            int r0 = r0.getUnsignedShort(r1)
            int r3 = r3 + 3
            com.android.dx.util.ByteArray r1 = r2.bytes
            int r0 = r0 + r3
            com.android.dx.util.ByteArray r3 = r1.slice(r3, r0)
            com.android.dx.rop.cst.CstString r0 = new com.android.dx.rop.cst.CstString     // Catch: java.lang.IllegalArgumentException -> L17
            r0.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L17
            return r0
        L17:
            r3 = move-exception
            com.android.dx.cf.iface.ParseException r0 = new com.android.dx.cf.iface.ParseException
            r0.<init>(r3)
            throw r0
    }

    public int getEndOffset() {
            r1 = this;
            r1.parseIfNecessary()
            int r0 = r1.endOffset
            return r0
    }

    public com.android.dx.rop.cst.StdConstantPool getPool() {
            r1 = this;
            r1.parseIfNecessary()
            com.android.dx.rop.cst.StdConstantPool r0 = r1.pool
            return r0
    }

    public void setObserver(com.android.dx.cf.iface.ParseObserver r1) {
            r0 = this;
            r0.observer = r1
            return
    }
}
