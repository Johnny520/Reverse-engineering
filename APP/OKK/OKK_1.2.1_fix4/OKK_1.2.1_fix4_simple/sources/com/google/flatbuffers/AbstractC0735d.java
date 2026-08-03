package com.google.flatbuffers;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import p037U.AbstractC0358S;

/* JADX INFO: renamed from: com.google.flatbuffers.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0735d {

    /* JADX INFO: renamed from: bb */
    protected ByteBuffer f2573bb;
    protected int bb_pos;
    AbstractC0736e utf8;
    private int vtable_size;
    private int vtable_start;

    public AbstractC0735d() {
        if (AbstractC0736e.f2574a != null) goto L5;
        AbstractC0736e.f2574a = new C0738g();
    L5:
        this.utf8 = AbstractC0736e.f2574a;
    }

    public static boolean __has_identifier(ByteBuffer r5, String r6) {
        if (r6.length() != 4) goto L13;
        int r2 = 0;
    L5:
        if (r2 >= 4) goto L10;
        if (r6.charAt(r2) != ((char) r5.get((r5.position() + 4) + r2))) goto L8;
        r2 = r2 + 1;
        goto L5
    L8:
        return false;
    L10:
        return true;
    L13:
        throw new AssertionError("FlatBuffers: file identifier must be length 4");
    }

    public static int compareStrings(int r8, int r9, ByteBuffer r10) {
        int r02 = r10.getInt(r8) + r8;
        int r82 = r10.getInt(r9) + r9;
        int r92 = r10.getInt(r02);
        int r1 = r10.getInt(r82);
        int r03 = r02 + 4;
        int r83 = r82 + 4;
        int r2 = Math.min(r92, r1);
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L10;
        int r4 = r3 + r03;
        int r6 = r3 + r83;
        if (r10.get(r4) != r10.get(r6)) goto L7;
        r3 = r3 + 1;
        goto L3
    L7:
        return r10.get(r4) - r10.get(r6);
    L10:
        return r92 - r1;
    }

    public int __indirect(int r2) {
        return this.f2573bb.getInt(r2) + r2;
    }

    public int __offset(int r3) {
        if (r3 < this.vtable_size) goto L7;
        return 0;
    L7:
        return this.f2573bb.getShort(this.vtable_start + r3);
    }

    public void __reset(int r1, ByteBuffer r2) {
        this.f2573bb = r2;
        if (r2 == null) goto L5;
        this.bb_pos = r1;
        int r12 = r1 - r2.getInt(r1);
        this.vtable_start = r12;
        this.vtable_size = this.f2573bb.getShort(r12);
        return;
    L5:
        this.bb_pos = 0;
        this.vtable_start = 0;
        this.vtable_size = 0;
    }

    public String __string(int r3) {
        return __string(r3, this.f2573bb, this.utf8);
    }

    public AbstractC0735d __union(AbstractC0735d r2, int r3) {
        return __union(r2, r3, this.f2573bb);
    }

    public int __vector(int r2) {
        int r22 = r2 + this.bb_pos;
        return (this.f2573bb.getInt(r22) + r22) + 4;
    }

    public ByteBuffer __vector_as_bytebuffer(int r3, int r4) {
        int r32 = __offset(r3);
        if (r32 != 0) goto L6;
        return null;
    L6:
        ByteBuffer r02 = this.f2573bb.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int r1 = __vector(r32);
        r02.position(r1);
        r02.limit((__vector_len(r32) * r4) + r1);
        return r02;
    }

    public ByteBuffer __vector_in_bytebuffer(ByteBuffer r2, int r3, int r4) {
        int r32 = __offset(r3);
        if (r32 != 0) goto L6;
        return null;
    L6:
        int r02 = __vector(r32);
        r2.rewind();
        r2.limit((__vector_len(r32) * r4) + r02);
        r2.position(r02);
        return r2;
    }

    public int __vector_len(int r2) {
        int r22 = r2 + this.bb_pos;
        int r02 = this.f2573bb.getInt(r22) + r22;
        return this.f2573bb.getInt(r02);
    }

    public ByteBuffer getByteBuffer() {
        return this.f2573bb;
    }

    public int keysCompare(Integer r1, Integer r2, ByteBuffer r3) {
        return 0;
    }

    public void sortTables(int[] r5, ByteBuffer r6) {
        Integer[] r02 = new Integer[r5.length];
        int r1 = 0;
        int r2 = 0;
    L4:
        if (r2 >= r5.length) goto L6;
        r02[r2] = Integer.valueOf(r5[r2]);
        r2 = r2 + 1;
        goto L4
    L6:
        Arrays.sort(r02, new C0734c(this, r6));
    L8:
        if (r1 >= r5.length) goto L10;
        r5[r1] = r02[r1].intValue();
        r1 = r1 + 1;
        goto L8
    }

    public static int __indirect(int r02, ByteBuffer r1) {
        return r1.getInt(r02) + r02;
    }

    public static int __offset(int r1, int r2, ByteBuffer r3) {
        int r02 = r3.capacity() - r2;
        return r3.getShort((r1 + r02) - r3.getInt(r02)) + r02;
    }

    public static String __string(int r12, ByteBuffer r13, AbstractC0736e r14) {
        int r02 = r13.getInt(r12) + r12;
        int r122 = r13.getInt(r02);
        int r03 = r02 + 4;
        ((C0738g) r14).getClass();
        if (r13.hasArray() == false) goto L43;
        byte[] r142 = r13.array();
        int r132 = r13.arrayOffset() + r03;
        if (((r132 | r122) | ((r142.length - r132) - r122)) < 0) goto L41;
        int r04 = r132 + r122;
        char[] r123 = new char[r122];
        int r5 = 0;
    L7:
        if (r132 >= r04) goto L12;
        byte r6 = r142[r132];
        if (AbstractC0358S.m857G(r6) == false) goto L12;
        r132 = r132 + 1;
        r123[r5] = (char) r6;
        r5 = r5 + 1;
    L12:
        int r11 = r5;
    L13:
        if (r132 >= r04) goto L119;
        int r52 = r132 + 1;
        byte r62 = r142[r132];
        if (AbstractC0358S.m857G(r62) == true) goto L16;
        if (r62 < (-32)) goto L24;
        if (r62 < (-16)) goto L30;
        if (r52 >= (r04 - 2)) goto L38;
        byte r8 = r142[r52];
        int r53 = r132 + 3;
        byte r7 = r142[r132 + 2];
        r132 = r132 + 4;
        AbstractC0358S.m851A(r62, r8, r7, r142[r53], r123, r11);
        r11 = r11 + 2;
        goto L13
    L38:
        throw new IllegalArgumentException("Invalid UTF-8");
    L30:
        if (r52 >= (r04 - 1)) goto L33;
        int r72 = r132 + 2;
        r132 = r132 + 3;
        AbstractC0358S.m852B(r62, r142[r52], r142[r72], r123, r11);
        r11 = r11 + 1;
        goto L13
    L33:
        throw new IllegalArgumentException("Invalid UTF-8");
    L24:
        if (r52 >= r04) goto L27;
        r132 = r132 + 2;
        AbstractC0358S.m853C(r62, r142[r52], r123, r11);
        r11 = r11 + 1;
        goto L13
    L27:
        throw new IllegalArgumentException("Invalid UTF-8");
    L16:
        int r133 = r11 + 1;
        r123[r11] = (char) r62;
    L17:
        if (r52 >= r04) goto L22;
        byte r63 = r142[r52];
        if (AbstractC0358S.m857G(r63) == false) goto L22;
        r52 = r52 + 1;
        r123[r133] = (char) r63;
        r133 = r133 + 1;
    L22:
        r11 = r133;
        r132 = r52;
        goto L13
    L119:
        return new String(r123, 0, r11);
    L41:
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(r142.length), Integer.valueOf(r132), Integer.valueOf(r122)}));
    L43:
        if (((r03 | r122) | ((r13.limit() - r03) - r122)) < 0) goto L80;
        int r143 = r03 + r122;
        char[] r124 = new char[r122];
        int r54 = 0;
    L45:
        if (r03 >= r143) goto L50;
        byte r64 = r13.get(r03);
        if (AbstractC0358S.m857G(r64) == false) goto L50;
        r03 = r03 + 1;
        r124[r54] = (char) r64;
        r54 = r54 + 1;
    L50:
        int r112 = r54;
    L51:
        if (r03 >= r143) goto L78;
        int r55 = r03 + 1;
        byte r65 = r13.get(r03);
        if (AbstractC0358S.m857G(r65) == true) goto L54;
        if (r65 < (-32)) goto L62;
        if (r65 < (-16)) goto L68;
        if (r55 >= (r143 - 2)) goto L76;
        byte r82 = r13.get(r55);
        int r56 = r03 + 3;
        byte r73 = r13.get(r03 + 2);
        r03 = r03 + 4;
        AbstractC0358S.m851A(r65, r82, r73, r13.get(r56), r124, r112);
        r112 = r112 + 2;
        goto L51
    L76:
        throw new IllegalArgumentException("Invalid UTF-8");
    L68:
        if (r55 >= (r143 - 1)) goto L71;
        int r74 = r03 + 2;
        r03 = r03 + 3;
        AbstractC0358S.m852B(r65, r13.get(r55), r13.get(r74), r124, r112);
        r112 = r112 + 1;
        goto L51
    L71:
        throw new IllegalArgumentException("Invalid UTF-8");
    L62:
        if (r55 >= r143) goto L65;
        r03 = r03 + 2;
        AbstractC0358S.m853C(r65, r13.get(r55), r124, r112);
        r112 = r112 + 1;
        goto L51
    L65:
        throw new IllegalArgumentException("Invalid UTF-8");
    L54:
        int r05 = r112 + 1;
        r124[r112] = (char) r65;
    L55:
        if (r55 >= r143) goto L60;
        byte r66 = r13.get(r55);
        if (AbstractC0358S.m857G(r66) == false) goto L60;
        r55 = r55 + 1;
        r124[r05] = (char) r66;
        r05 = r05 + 1;
    L60:
        r112 = r05;
        r03 = r55;
        goto L51
    L78:
        return new String(r124, 0, r112);
    L80:
        throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(r13.limit()), Integer.valueOf(r03), Integer.valueOf(r122)}));
    }

    public static AbstractC0735d __union(AbstractC0735d r02, int r1, ByteBuffer r2) {
        r02.__reset(__indirect(r1, r2), r2);
        return r02;
    }

    public static int compareStrings(int r7, byte[] r8, ByteBuffer r9) {
        int r02 = r9.getInt(r7) + r7;
        int r72 = r9.getInt(r02);
        int r1 = r8.length;
        int r03 = r02 + 4;
        int r2 = Math.min(r72, r1);
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L10;
        int r4 = r3 + r03;
        if (r9.get(r4) != r8[r3]) goto L7;
        r3 = r3 + 1;
        goto L3
    L7:
        return r9.get(r4) - r8[r3];
    L10:
        return r72 - r1;
    }

    public void __reset() {
        __reset(0, null);
    }
}
