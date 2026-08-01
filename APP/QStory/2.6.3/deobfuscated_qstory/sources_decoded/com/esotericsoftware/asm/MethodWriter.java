package com.esotericsoftware.asm;

import bsh.C2633;
import com.android.dx.cf.attrib.AttAnnotationDefault;
import com.android.dx.cf.attrib.AttCode;
import com.android.dx.cf.attrib.AttDeprecated;
import com.android.dx.cf.attrib.AttExceptions;
import com.android.dx.cf.attrib.AttLineNumberTable;
import com.android.dx.cf.attrib.AttLocalVariableTable;
import com.android.dx.cf.attrib.AttLocalVariableTypeTable;
import com.android.dx.cf.attrib.AttRuntimeInvisibleAnnotations;
import com.android.dx.cf.attrib.AttRuntimeInvisibleParameterAnnotations;
import com.android.dx.cf.attrib.AttRuntimeVisibleAnnotations;
import com.android.dx.cf.attrib.AttRuntimeVisibleParameterAnnotations;
import com.android.dx.cf.attrib.AttSignature;
import com.android.dx.cf.attrib.AttSynthetic;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.pool.TypePool;
import p009.AbstractC6183;

/* JADX INFO: loaded from: classes.dex */
class MethodWriter extends MethodVisitor {
    private ByteVector $;
    private int A;
    private Handler B;
    private Handler C;
    private int D;
    private ByteVector E;
    private int F;
    private ByteVector G;
    private int H;
    private ByteVector I;
    private Attribute J;
    private boolean K;
    private int L;
    private final int M;
    private Label N;
    private Label O;
    private Label P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private AnnotationWriter U;
    private AnnotationWriter V;
    private AnnotationWriter W;
    private AnnotationWriter X;
    private int Y;
    private int Z;
    final ClassWriter b;
    private int c;
    private final int d;
    private final int e;
    private final String f;
    String g;
    int h;
    int i;
    int j;
    int[] k;
    private ByteVector l;
    private AnnotationWriter m;
    private AnnotationWriter n;
    private AnnotationWriter[] o;
    private AnnotationWriter[] p;
    private Attribute q;
    private ByteVector r;
    private int s;
    private int t;
    private int u;
    private ByteVector v;
    private int w;
    private int[] x;
    private int[] z;

    public MethodWriter(ClassWriter classWriter, int i, String str, String str2, String str3, String[] strArr, boolean z, boolean z2) {
        super(327680);
        this.r = new ByteVector();
        if (classWriter.D == null) {
            classWriter.D = this;
        } else {
            classWriter.E.mv = this;
        }
        classWriter.E = this;
        this.b = classWriter;
        this.c = i;
        if (MethodDescription.CONSTRUCTOR_INTERNAL_NAME.equals(str)) {
            this.c |= net.bytebuddy.jar.asm.Opcodes.ASM8;
        }
        this.d = classWriter.newUTF8(str);
        this.e = classWriter.newUTF8(str2);
        this.f = str2;
        this.g = str3;
        if (strArr != null && strArr.length > 0) {
            int length = strArr.length;
            this.j = length;
            this.k = new int[length];
            for (int i2 = 0; i2 < this.j; i2++) {
                this.k[i2] = classWriter.newClass(strArr[i2]);
            }
        }
        this.M = z2 ? 0 : z ? 1 : 2;
        if (z || z2) {
            int argumentsAndReturnSizes = Type.getArgumentsAndReturnSizes(this.f) >> 2;
            argumentsAndReturnSizes = (i & 8) != 0 ? argumentsAndReturnSizes - 1 : argumentsAndReturnSizes;
            this.t = argumentsAndReturnSizes;
            this.T = argumentsAndReturnSizes;
            Label label = new Label();
            this.N = label;
            label.a |= 8;
            visitLabel(label);
        }
    }

    private void b(Frame frame) {
        int[] iArr = frame.c;
        int[] iArr2 = frame.d;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < iArr.length) {
            int i5 = iArr[i2];
            i4++;
            if (i5 != 16777216) {
                i3 += i4;
                i4 = 0;
            }
            if (i5 == 16777220 || i5 == 16777219) {
                i2++;
            }
            i2++;
        }
        int i6 = 0;
        int i7 = 0;
        while (i6 < iArr2.length) {
            int i8 = iArr2[i6];
            i7++;
            if (i8 == 16777220 || i8 == 16777219) {
                i6++;
            }
            i6++;
        }
        int iA = a(frame.b.c, i3, i7);
        int i9 = 0;
        while (i3 > 0) {
            int i10 = iArr[i9];
            int i11 = iA + 1;
            this.z[iA] = i10;
            if (i10 == 16777220 || i10 == 16777219) {
                i9++;
            }
            i9++;
            i3--;
            iA = i11;
        }
        while (i < iArr2.length) {
            int i12 = iArr2[i];
            int i13 = iA + 1;
            this.z[iA] = i12;
            if (i12 == 16777220 || i12 == 16777219) {
                i++;
            }
            i++;
            iA = i13;
        }
        b();
    }

    private void c() {
        int i;
        char c;
        int i2;
        int[] iArr = this.z;
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = 0;
        int i6 = 3;
        if ((this.b.b & com.android.dx.io.Opcodes.MAX_VALUE) < 50) {
            this.v.putShort(iArr[0]).putShort(i3);
            int i7 = i3 + 3;
            a(3, i7);
            this.v.putShort(i4);
            a(i7, i4 + i7);
            return;
        }
        int[] iArr2 = this.x;
        int i8 = iArr2[1];
        int i9 = this.u == 0 ? iArr[0] : (iArr[0] - iArr2[0]) - 1;
        if (i4 == 0) {
            i = i3 - i8;
            switch (i) {
                case -3:
                case -2:
                case -1:
                    i8 = i3;
                    c = 248;
                    break;
                case 0:
                    c = i9 >= 64 ? (char) 251 : (char) 0;
                    break;
                case 1:
                case 2:
                case 3:
                    c = 252;
                    break;
                default:
                    c = 255;
                    break;
            }
        } else if (i3 == i8 && i4 == 1) {
            c = i9 < 63 ? '@' : (char) 247;
            i = 0;
        } else {
            i = 0;
            c = 255;
        }
        if (c != 255) {
            int i10 = 3;
            while (i5 < i8) {
                i2 = i6;
                if (this.z[i10] != this.x[i10]) {
                    c = 255;
                } else {
                    i10++;
                    i5++;
                    i6 = i2;
                }
            }
            i2 = i6;
        } else {
            i2 = i6;
        }
        if (c == 0) {
            this.v.putByte(i9);
            return;
        }
        if (c == '@') {
            this.v.putByte(i9 + 64);
            a(i3 + 3, i3 + 4);
            return;
        }
        if (c == 247) {
            this.v.putByte(247).putShort(i9);
            a(i3 + 3, i3 + 4);
            return;
        }
        if (c == 248) {
            this.v.putByte(i + com.android.dx.io.Opcodes.INVOKE_POLYMORPHIC_RANGE).putShort(i9);
            return;
        }
        if (c == 251) {
            this.v.putByte(com.android.dx.io.Opcodes.INVOKE_POLYMORPHIC_RANGE).putShort(i9);
            return;
        }
        ByteVector byteVector = this.v;
        if (c == 252) {
            int i11 = i2;
            byteVector.putByte(i + com.android.dx.io.Opcodes.INVOKE_POLYMORPHIC_RANGE).putShort(i9);
            a(i8 + i11, i3 + i11);
        } else {
            byteVector.putByte(com.android.dx.io.Opcodes.CONST_METHOD_TYPE).putShort(i9).putShort(i3);
            int i12 = i3 + 3;
            a(i2, i12);
            this.v.putShort(i4);
            a(i12, i4 + i12);
        }
    }

    private void d() {
        int i;
        int iB;
        int i2;
        int i3;
        int i4;
        int iB2;
        int i5;
        int i6;
        ByteVector byteVector = this.r;
        byte[] bArr = byteVector.a;
        int[] iArr = new int[0];
        int[] iArr2 = new int[0];
        boolean[] zArr = new boolean[byteVector.b];
        int i7 = 3;
        int i8 = 3;
        while (true) {
            if (i8 == i7) {
                i8 = 2;
            }
            int iA = 0;
            while (true) {
                int i9 = 168;
                int i10 = 8;
                int i11 = i7;
                int i12 = 4;
                boolean z = true;
                if (iA < bArr.length) {
                    int i13 = bArr[iA] & DefaultClassResolver.NAME;
                    switch (ClassWriter.a[i13]) {
                        case 0:
                        case 4:
                            iA++;
                            i5 = 0;
                            break;
                        case 1:
                        case 3:
                        case 11:
                            iA += 2;
                            i5 = 0;
                            break;
                        case 2:
                        case 5:
                        case 6:
                        case 12:
                        case 13:
                            iA += 3;
                            i5 = 0;
                            break;
                        case 7:
                        case 8:
                        case 10:
                            iA += 5;
                            i5 = 0;
                            break;
                        case 9:
                            if (i13 > 201) {
                                i13 = i13 < 218 ? i13 - 49 : i13 - 20;
                                iB2 = c(bArr, iA + 1);
                            } else {
                                iB2 = b(bArr, iA + 1);
                            }
                            int iA2 = a(iArr, iArr2, iA, iB2 + iA);
                            if ((iA2 < -32768 || iA2 > 32767) && !zArr[iA]) {
                                int i14 = (i13 == 167 || i13 == 168) ? 2 : 5;
                                zArr[iA] = true;
                                i5 = i14;
                            } else {
                                i5 = 0;
                            }
                            iA += 3;
                            break;
                        case 14:
                            if (i8 == 1) {
                                i6 = -(a(iArr, iArr2, 0, iA) & 3);
                            } else if (zArr[iA]) {
                                i5 = 0;
                                int i15 = (iA + 4) - (iA & 3);
                                iA = (((a(bArr, i15 + 8) - a(bArr, i15 + 4)) + 1) * 4) + 12 + i15;
                            } else {
                                i6 = iA & 3;
                                zArr[iA] = true;
                            }
                            i5 = i6;
                            int i152 = (iA + 4) - (iA & 3);
                            iA = (((a(bArr, i152 + 8) - a(bArr, i152 + 4)) + 1) * 4) + 12 + i152;
                            break;
                        case 15:
                            if (i8 == 1) {
                                i5 = -(a(iArr, iArr2, 0, iA) & 3);
                            } else if (zArr[iA]) {
                                i5 = 0;
                            } else {
                                i5 = iA & 3;
                                zArr[iA] = true;
                            }
                            int i16 = (iA + 4) - (iA & 3);
                            iA = AbstractC6183.m11574(a(bArr, i16 + 4), 8, 8, i16);
                            break;
                        case 17:
                            if ((bArr[iA + 1] & DefaultClassResolver.NAME) == 132) {
                                iA += 6;
                            }
                            i5 = 0;
                        case 16:
                        default:
                            iA += 4;
                            i5 = 0;
                            break;
                    }
                    if (i5 != 0) {
                        int[] iArr3 = new int[iArr.length + 1];
                        int[] iArr4 = new int[iArr2.length + 1];
                        System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                        System.arraycopy(iArr2, 0, iArr4, 0, iArr2.length);
                        iArr3[iArr.length] = iA;
                        iArr4[iArr2.length] = i5;
                        iArr2 = iArr4;
                        iArr = iArr3;
                        if (i5 > 0) {
                            i8 = i11;
                        }
                    }
                    i7 = i11;
                } else {
                    if (i8 < i11) {
                        i8--;
                    }
                    if (i8 == 0) {
                        ByteVector byteVector2 = new ByteVector(this.r.b);
                        int i17 = 0;
                        while (i17 < this.r.b) {
                            int i18 = bArr[i17] & DefaultClassResolver.NAME;
                            boolean z2 = z;
                            switch (ClassWriter.a[i18]) {
                                case 0:
                                case 4:
                                    i = i10;
                                    byteVector2.putByte(i18);
                                    i17++;
                                    break;
                                case 1:
                                case 3:
                                case 11:
                                    i = i10;
                                    byteVector2.putByteArray(bArr, i17, 2);
                                    i17 += 2;
                                    break;
                                case 2:
                                case 5:
                                case 6:
                                case 12:
                                case 13:
                                    i = i10;
                                    byteVector2.putByteArray(bArr, i17, 3);
                                    i17 += 3;
                                    break;
                                case 7:
                                case 8:
                                    i = i10;
                                    byteVector2.putByteArray(bArr, i17, 5);
                                    i17 += 5;
                                    break;
                                case 9:
                                    int i19 = i10;
                                    if (i18 > 201) {
                                        i18 = i18 < 218 ? i18 - 49 : i18 - 20;
                                        iB = c(bArr, i17 + 1);
                                    } else {
                                        iB = b(bArr, i17 + 1);
                                    }
                                    int iA3 = a(iArr, iArr2, i17, iB + i17);
                                    if (zArr[i17]) {
                                        if (i18 == 167) {
                                            byteVector2.putByte(200);
                                        } else if (i18 == i9) {
                                            byteVector2.putByte(201);
                                        } else {
                                            byteVector2.putByte(i18 <= 166 ? ((i18 + 1) ^ 1) - 1 : i18 ^ 1);
                                            i = i19;
                                            byteVector2.putShort(i);
                                            byteVector2.putByte(200);
                                            iA3 -= 3;
                                            byteVector2.putInt(iA3);
                                        }
                                        i = i19;
                                        byteVector2.putInt(iA3);
                                    } else {
                                        i = i19;
                                        byteVector2.putByte(i18);
                                        byteVector2.putShort(iA3);
                                    }
                                    i17 += 3;
                                    break;
                                case 10:
                                    i2 = i10;
                                    int iA4 = a(iArr, iArr2, i17, a(bArr, i17 + 1) + i17);
                                    byteVector2.putByte(i18);
                                    byteVector2.putInt(iA4);
                                    i17 += 5;
                                    i = i2;
                                    break;
                                case 14:
                                    i2 = i10;
                                    int i20 = (i17 + 4) - (i17 & 3);
                                    byteVector2.putByte(170);
                                    i12 = 4;
                                    byteVector2.putByteArray(null, 0, (4 - (byteVector2.b % 4)) % 4);
                                    byteVector2.putInt(a(iArr, iArr2, i17, a(bArr, i20) + i17));
                                    int iA5 = a(bArr, i20 + 4);
                                    byteVector2.putInt(iA5);
                                    int i21 = i20 + 12;
                                    byteVector2.putInt(a(bArr, i20 + 8));
                                    for (int iA6 = (a(bArr, i20 + 8) - iA5) + 1; iA6 > 0; iA6--) {
                                        int iA7 = a(bArr, i21) + i17;
                                        i21 += 4;
                                        byteVector2.putInt(a(iArr, iArr2, i17, iA7));
                                    }
                                    i17 = i21;
                                    i = i2;
                                    break;
                                case 15:
                                    i3 = i10;
                                    int i22 = (i17 + 4) - (i17 & 3);
                                    byteVector2.putByte(171);
                                    byteVector2.putByteArray(null, 0, (4 - (byteVector2.b % 4)) % 4);
                                    byteVector2.putInt(a(iArr, iArr2, i17, a(bArr, i22) + i17));
                                    int iA8 = a(bArr, i22 + 4);
                                    int i23 = i22 + 8;
                                    byteVector2.putInt(iA8);
                                    while (iA8 > 0) {
                                        byteVector2.putInt(a(bArr, i23));
                                        int iA9 = a(bArr, i23 + 4) + i17;
                                        i23 += 8;
                                        byteVector2.putInt(a(iArr, iArr2, i17, iA9));
                                        iA8--;
                                    }
                                    i17 = i23;
                                    i = i3;
                                    i12 = 4;
                                    break;
                                case 16:
                                default:
                                    i3 = i10;
                                    i4 = i12;
                                    byteVector2.putByteArray(bArr, i17, i4);
                                    i17 += 4;
                                    i = i3;
                                    i12 = 4;
                                    break;
                                case 17:
                                    i3 = i10;
                                    if ((bArr[i17 + 1] & DefaultClassResolver.NAME) == 132) {
                                        byteVector2.putByteArray(bArr, i17, 6);
                                        i17 += 6;
                                        i = i3;
                                        i12 = 4;
                                    } else {
                                        i4 = 4;
                                        byteVector2.putByteArray(bArr, i17, i4);
                                        i17 += 4;
                                        i = i3;
                                        i12 = 4;
                                    }
                                    break;
                            }
                            i10 = i;
                            z = z2;
                            i9 = 168;
                        }
                        boolean z3 = z;
                        if (this.M == 0) {
                            for (Label label = this.N; label != null; label = label.i) {
                                int i24 = label.c - 3;
                                if (i24 >= 0 && zArr[i24]) {
                                    label.a |= 16;
                                }
                                a(iArr, iArr2, label);
                            }
                            if (this.b.H != null) {
                                int i25 = 0;
                                while (true) {
                                    Item[] itemArr = this.b.H;
                                    if (i25 < itemArr.length) {
                                        Item item = itemArr[i25];
                                        if (item != null && item.b == 31) {
                                            item.c = a(iArr, iArr2, 0, item.c);
                                        }
                                        i25++;
                                    }
                                }
                            }
                        } else if (this.u > 0) {
                            this.b.L = z3;
                        }
                        for (Handler handler = this.B; handler != null; handler = handler.f) {
                            a(iArr, iArr2, handler.a);
                            a(iArr, iArr2, handler.b);
                            a(iArr, iArr2, handler.c);
                        }
                        int i26 = 0;
                        while (i26 < 2) {
                            ByteVector byteVector3 = i26 == 0 ? this.E : this.G;
                            if (byteVector3 != null) {
                                byte[] bArr2 = byteVector3.a;
                                for (int i27 = 0; i27 < byteVector3.b; i27 += 10) {
                                    int iC = c(bArr2, i27);
                                    int iA10 = a(iArr, iArr2, 0, iC);
                                    a(bArr2, i27, iA10);
                                    int i28 = i27 + 2;
                                    a(bArr2, i28, a(iArr, iArr2, 0, iC + c(bArr2, i28)) - iA10);
                                }
                            }
                            i26++;
                        }
                        ByteVector byteVector4 = this.I;
                        if (byteVector4 != null) {
                            byte[] bArr3 = byteVector4.a;
                            for (int i29 = 0; i29 < this.I.b; i29 += 4) {
                                a(bArr3, i29, a(iArr, iArr2, 0, c(bArr3, i29)));
                            }
                        }
                        for (Attribute attribute = this.J; attribute != null; attribute = attribute.a) {
                            Label[] labels = attribute.getLabels();
                            if (labels != null) {
                                for (int length = labels.length - 1; length >= 0; length--) {
                                    a(iArr, iArr2, labels[length]);
                                }
                            }
                        }
                        this.r = byteVector2;
                        return;
                    }
                    i7 = 3;
                }
            }
        }
    }

    private void e() {
        if (this.M == 0) {
            Label label = new Label();
            Frame frame = new Frame();
            label.h = frame;
            frame.b = label;
            ByteVector byteVector = this.r;
            label.a(this, byteVector.b, byteVector.a);
            this.O.i = label;
            this.O = label;
        } else {
            this.P.g = this.R;
        }
        this.P = null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0059. Please report as an issue. */
    private void f() {
        int i;
        int i2;
        int i3;
        int iA = a(0, this.f.length() + 1, 0);
        int i4 = this.c;
        if ((i4 & 8) == 0) {
            int i5 = i4 & net.bytebuddy.jar.asm.Opcodes.ASM8;
            int[] iArr = this.z;
            if (i5 == 0) {
                i3 = iA + 1;
                ClassWriter classWriter = this.b;
                iArr[iA] = classWriter.c(classWriter.I) | 24117248;
            } else {
                i3 = iA + 1;
                iArr[iA] = 6;
            }
            iA = i3;
        }
        int i6 = 1;
        while (true) {
            int i7 = i6 + 1;
            char cCharAt = this.f.charAt(i6);
            if (cCharAt == 'F') {
                i = iA + 1;
                this.z[iA] = 2;
            } else if (cCharAt != 'L') {
                if (cCharAt != 'S' && cCharAt != 'I') {
                    if (cCharAt == 'J') {
                        i = iA + 1;
                        this.z[iA] = 4;
                    } else if (cCharAt != 'Z') {
                        if (cCharAt != '[') {
                            switch (cCharAt) {
                                case 'D':
                                    i2 = iA + 1;
                                    this.z[iA] = 3;
                                    break;
                            }
                            this.z[1] = iA - 3;
                            b();
                            return;
                        }
                        while (this.f.charAt(i7) == '[') {
                            i7++;
                        }
                        if (this.f.charAt(i7) == 'L') {
                            do {
                                i7++;
                            } while (this.f.charAt(i7) != ';');
                        }
                        i2 = iA + 1;
                        i7++;
                        this.z[iA] = this.b.c(this.f.substring(i6, i7)) | 24117248;
                        i6 = i7;
                        iA = i2;
                    }
                }
                i = iA + 1;
                this.z[iA] = 1;
            } else {
                int i8 = i7;
                while (this.f.charAt(i8) != ';') {
                    i8++;
                }
                this.z[iA] = this.b.c(this.f.substring(i7, i8)) | 24117248;
                iA++;
                i6 = i8 + 1;
            }
            iA = i;
            i6 = i7;
        }
    }

    public final void a(ByteVector byteVector) {
        int i;
        int i2;
        int i3;
        ByteVector byteVector2 = byteVector;
        int i4 = this.c;
        byteVector2.putShort(i4 & (~(((i4 & 262144) / 64) | 917504))).putShort(this.d).putShort(this.e);
        int i5 = this.h;
        if (i5 != 0) {
            byteVector2.putByteArray(this.b.M.b, i5, this.i);
            return;
        }
        int iA = this.r.b > 0 ? 1 : 0;
        if (this.j > 0) {
            iA++;
        }
        int i6 = this.c;
        if ((i6 & 4096) != 0 && ((this.b.b & com.android.dx.io.Opcodes.MAX_VALUE) < 49 || (i6 & 262144) != 0)) {
            iA++;
        }
        if ((i6 & 131072) != 0) {
            iA++;
        }
        if (this.g != null) {
            iA++;
        }
        if (this.$ != null) {
            iA++;
        }
        if (this.l != null) {
            iA++;
        }
        if (this.m != null) {
            iA++;
        }
        if (this.n != null) {
            iA++;
        }
        if (this.U != null) {
            iA++;
        }
        if (this.V != null) {
            iA++;
        }
        if (this.o != null) {
            iA++;
        }
        if (this.p != null) {
            iA++;
        }
        Attribute attribute = this.q;
        if (attribute != null) {
            iA += attribute.a();
        }
        byteVector2.putShort(iA);
        int i7 = this.r.b;
        if (i7 > 0) {
            int iA2 = (this.A * 8) + i7 + 12;
            ByteVector byteVector3 = this.E;
            if (byteVector3 != null) {
                iA2 += byteVector3.b + 8;
            }
            ByteVector byteVector4 = this.G;
            if (byteVector4 != null) {
                iA2 += byteVector4.b + 8;
            }
            ByteVector byteVector5 = this.I;
            if (byteVector5 != null) {
                iA2 += byteVector5.b + 8;
            }
            ByteVector byteVector6 = this.v;
            if (byteVector6 != null) {
                iA2 += byteVector6.b + 8;
            }
            AnnotationWriter annotationWriter = this.W;
            if (annotationWriter != null) {
                iA2 += annotationWriter.a() + 8;
            }
            AnnotationWriter annotationWriter2 = this.X;
            if (annotationWriter2 != null) {
                iA2 += annotationWriter2.a() + 8;
            }
            Attribute attribute2 = this.J;
            if (attribute2 != null) {
                ClassWriter classWriter = this.b;
                ByteVector byteVector7 = this.r;
                i3 = 2;
                i = 262144;
                iA2 += attribute2.a(classWriter, byteVector7.a, byteVector7.b, this.s, this.t);
            } else {
                i = 262144;
                i3 = 2;
            }
            byteVector2.putShort(this.b.newUTF8(AttCode.ATTRIBUTE_NAME)).putInt(iA2);
            byteVector2.putShort(this.s).putShort(this.t);
            ByteVector byteVectorPutInt = byteVector2.putInt(this.r.b);
            ByteVector byteVector8 = this.r;
            byteVectorPutInt.putByteArray(byteVector8.a, 0, byteVector8.b);
            byteVector2.putShort(this.A);
            if (this.A > 0) {
                for (Handler handler = this.B; handler != null; handler = handler.f) {
                    byteVector2.putShort(handler.a.c).putShort(handler.b.c).putShort(handler.c.c).putShort(handler.e);
                }
            }
            int iA3 = this.E != null ? 1 : 0;
            if (this.G != null) {
                iA3++;
            }
            if (this.I != null) {
                iA3++;
            }
            if (this.v != null) {
                iA3++;
            }
            if (this.W != null) {
                iA3++;
            }
            if (this.X != null) {
                iA3++;
            }
            Attribute attribute3 = this.J;
            if (attribute3 != null) {
                iA3 += attribute3.a();
            }
            byteVector2.putShort(iA3);
            if (this.E != null) {
                byteVector2.putShort(this.b.newUTF8(AttLocalVariableTable.ATTRIBUTE_NAME));
                byteVector2.putInt(this.E.b + 2).putShort(this.D);
                ByteVector byteVector9 = this.E;
                byteVector2.putByteArray(byteVector9.a, 0, byteVector9.b);
            }
            if (this.G != null) {
                byteVector2.putShort(this.b.newUTF8(AttLocalVariableTypeTable.ATTRIBUTE_NAME));
                byteVector2.putInt(this.G.b + 2).putShort(this.F);
                ByteVector byteVector10 = this.G;
                byteVector2.putByteArray(byteVector10.a, 0, byteVector10.b);
            }
            if (this.I != null) {
                byteVector2.putShort(this.b.newUTF8(AttLineNumberTable.ATTRIBUTE_NAME));
                byteVector2.putInt(this.I.b + 2).putShort(this.H);
                ByteVector byteVector11 = this.I;
                byteVector2.putByteArray(byteVector11.a, 0, byteVector11.b);
            }
            if (this.v != null) {
                ClassWriter classWriter2 = this.b;
                byteVector2.putShort(classWriter2.newUTF8((classWriter2.b & com.android.dx.io.Opcodes.MAX_VALUE) >= 50 ? "StackMapTable" : "StackMap"));
                byteVector2.putInt(this.v.b + 2).putShort(this.u);
                ByteVector byteVector12 = this.v;
                byteVector2.putByteArray(byteVector12.a, 0, byteVector12.b);
            }
            if (this.W != null) {
                byteVector2.putShort(this.b.newUTF8("RuntimeVisibleTypeAnnotations"));
                this.W.a(byteVector2);
            }
            if (this.X != null) {
                byteVector2.putShort(this.b.newUTF8("RuntimeInvisibleTypeAnnotations"));
                this.X.a(byteVector2);
            }
            Attribute attribute4 = this.J;
            if (attribute4 != null) {
                ClassWriter classWriter3 = this.b;
                ByteVector byteVector13 = this.r;
                i2 = i3;
                attribute4.a(classWriter3, byteVector13.a, byteVector13.b, this.t, this.s, byteVector);
                byteVector2 = byteVector;
            } else {
                i2 = i3;
            }
        } else {
            i = 262144;
            i2 = 2;
        }
        if (this.j > 0) {
            byteVector2.putShort(this.b.newUTF8(AttExceptions.ATTRIBUTE_NAME)).putInt((this.j * i2) + i2);
            byteVector2.putShort(this.j);
            for (int i8 = 0; i8 < this.j; i8++) {
                byteVector2.putShort(this.k[i8]);
            }
        }
        int i9 = this.c;
        if ((i9 & 4096) != 0) {
            ClassWriter classWriter4 = this.b;
            if ((classWriter4.b & com.android.dx.io.Opcodes.MAX_VALUE) < 49 || (i9 & i) != 0) {
                byteVector2.putShort(classWriter4.newUTF8(AttSynthetic.ATTRIBUTE_NAME)).putInt(0);
            }
        }
        if ((this.c & 131072) != 0) {
            byteVector2.putShort(this.b.newUTF8(AttDeprecated.ATTRIBUTE_NAME)).putInt(0);
        }
        if (this.g != null) {
            byteVector2.putShort(this.b.newUTF8(AttSignature.ATTRIBUTE_NAME)).putInt(i2).putShort(this.b.newUTF8(this.g));
        }
        if (this.$ != null) {
            byteVector2.putShort(this.b.newUTF8("MethodParameters"));
            byteVector2.putInt(this.$.b + 1).putByte(this.Z);
            ByteVector byteVector14 = this.$;
            byteVector2.putByteArray(byteVector14.a, 0, byteVector14.b);
        }
        if (this.l != null) {
            byteVector2.putShort(this.b.newUTF8(AttAnnotationDefault.ATTRIBUTE_NAME));
            byteVector2.putInt(this.l.b);
            ByteVector byteVector15 = this.l;
            byteVector2.putByteArray(byteVector15.a, 0, byteVector15.b);
        }
        if (this.m != null) {
            byteVector2.putShort(this.b.newUTF8(AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME));
            this.m.a(byteVector2);
        }
        if (this.n != null) {
            byteVector2.putShort(this.b.newUTF8(AttRuntimeInvisibleAnnotations.ATTRIBUTE_NAME));
            this.n.a(byteVector2);
        }
        if (this.U != null) {
            byteVector2.putShort(this.b.newUTF8("RuntimeVisibleTypeAnnotations"));
            this.U.a(byteVector2);
        }
        if (this.V != null) {
            byteVector2.putShort(this.b.newUTF8("RuntimeInvisibleTypeAnnotations"));
            this.V.a(byteVector2);
        }
        if (this.o != null) {
            byteVector2.putShort(this.b.newUTF8(AttRuntimeVisibleParameterAnnotations.ATTRIBUTE_NAME));
            AnnotationWriter.a(this.o, this.S, byteVector2);
        }
        if (this.p != null) {
            byteVector2.putShort(this.b.newUTF8(AttRuntimeInvisibleParameterAnnotations.ATTRIBUTE_NAME));
            AnnotationWriter.a(this.p, this.S, byteVector2);
        }
        Attribute attribute5 = this.q;
        if (attribute5 != null) {
            attribute5.a(this.b, null, 0, -1, -1, byteVector2);
        }
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public AnnotationVisitor visitAnnotation(String str, boolean z) {
        ByteVector byteVector = new ByteVector();
        byteVector.putShort(this.b.newUTF8(str)).putShort(0);
        AnnotationWriter annotationWriter = new AnnotationWriter(this.b, true, byteVector, byteVector, 2);
        if (z) {
            annotationWriter.g = this.m;
            this.m = annotationWriter;
            return annotationWriter;
        }
        annotationWriter.g = this.n;
        this.n = annotationWriter;
        return annotationWriter;
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public AnnotationVisitor visitAnnotationDefault() {
        ByteVector byteVector = new ByteVector();
        this.l = byteVector;
        return new AnnotationWriter(this.b, false, byteVector, null, 0);
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public void visitAttribute(Attribute attribute) {
        if (attribute.isCodeAttribute()) {
            attribute.a = this.J;
            this.J = attribute;
        } else {
            attribute.a = this.q;
            this.q = attribute;
        }
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public void visitFieldInsn(int i, String str, String str2, String str3) {
        int i2;
        int i3;
        this.Y = this.r.b;
        Item itemA = this.b.a(str, str2, str3);
        Label label = this.P;
        if (label != null) {
            if (this.M == 0) {
                label.h.a(i, 0, this.b, itemA);
            } else {
                char cCharAt = str3.charAt(0);
                int i4 = -2;
                switch (i) {
                    case 178:
                        i2 = ((cCharAt == 'D' || cCharAt == 'J') ? 2 : 1) + this.Q;
                        break;
                    case 179:
                        i3 = this.Q;
                        if (cCharAt != 'D' && cCharAt != 'J') {
                            i4 = -1;
                        }
                        i2 = i3 + i4;
                        break;
                    case 180:
                        i2 = this.Q + ((cCharAt == 'D' || cCharAt == 'J') ? 1 : 0);
                        break;
                    default:
                        i3 = this.Q;
                        if (cCharAt == 'D' || cCharAt == 'J') {
                            i4 = -3;
                        }
                        i2 = i3 + i4;
                        break;
                }
                if (i2 > this.R) {
                    this.R = i2;
                }
                this.Q = i2;
            }
        }
        this.r.b(i, itemA.a);
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public void visitFrame(int i, int i2, Object[] objArr, int i3, Object[] objArr2) {
        int i4;
        ByteVector byteVector;
        int i5;
        if (this.M == 0) {
            return;
        }
        int i6 = 0;
        if (i == -1) {
            if (this.x == null) {
                f();
            }
            this.T = i2;
            int iA = a(this.r.b, i2, i3);
            for (int i7 = 0; i7 < i2; i7++) {
                Object obj = objArr[i7];
                if (obj instanceof String) {
                    this.z[iA] = 24117248 | this.b.c((String) obj);
                    iA++;
                } else {
                    boolean z = obj instanceof Integer;
                    int[] iArr = this.z;
                    if (z) {
                        iArr[iA] = ((Integer) obj).intValue();
                        iA++;
                    } else {
                        iArr[iA] = this.b.a("", ((Label) obj).c) | 25165824;
                        iA++;
                    }
                }
            }
            while (i6 < i3) {
                Object obj2 = objArr2[i6];
                if (obj2 instanceof String) {
                    this.z[iA] = this.b.c((String) obj2) | 24117248;
                    iA++;
                } else {
                    boolean z2 = obj2 instanceof Integer;
                    int[] iArr2 = this.z;
                    if (z2) {
                        i5 = iA + 1;
                        iArr2[iA] = ((Integer) obj2).intValue();
                    } else {
                        i5 = iA + 1;
                        iArr2[iA] = this.b.a("", ((Label) obj2).c) | 25165824;
                    }
                    iA = i5;
                }
                i6++;
            }
            b();
        } else {
            if (this.v == null) {
                this.v = new ByteVector();
                i4 = this.r.b;
            } else {
                i4 = (this.r.b - this.w) - 1;
                if (i4 < 0) {
                    if (i == 3) {
                        return;
                    }
                    C2633.m5341();
                    return;
                }
            }
            if (i == 0) {
                this.T = i2;
                this.v.putByte(com.android.dx.io.Opcodes.CONST_METHOD_TYPE).putShort(i4).putShort(i2);
                for (int i8 = 0; i8 < i2; i8++) {
                    a(objArr[i8]);
                }
                this.v.putShort(i3);
                while (i6 < i3) {
                    a(objArr2[i6]);
                    i6++;
                }
            } else if (i != 1) {
                int i9 = com.android.dx.io.Opcodes.INVOKE_POLYMORPHIC_RANGE;
                if (i == 2) {
                    this.T -= i2;
                    byteVector = this.v;
                    i9 = com.android.dx.io.Opcodes.INVOKE_POLYMORPHIC_RANGE - i2;
                } else if (i == 3) {
                    byteVector = this.v;
                    if (i4 < 64) {
                        byteVector.putByte(i4);
                    }
                } else if (i == 4) {
                    ByteVector byteVector2 = this.v;
                    if (i4 < 64) {
                        byteVector2.putByte(i4 + 64);
                    } else {
                        byteVector2.putByte(247).putShort(i4);
                    }
                    a(objArr2[0]);
                }
                byteVector.putByte(i9).putShort(i4);
            } else {
                this.T += i2;
                this.v.putByte(i2 + com.android.dx.io.Opcodes.INVOKE_POLYMORPHIC_RANGE).putShort(i4);
                while (i6 < i2) {
                    a(objArr[i6]);
                    i6++;
                }
            }
            this.w = this.r.b;
            this.u++;
        }
        this.s = Math.max(this.s, i3);
        this.t = Math.max(this.t, this.T);
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public void visitIincInsn(int i, int i2) {
        int i3;
        this.Y = this.r.b;
        Label label = this.P;
        if (label != null && this.M == 0) {
            label.h.a(132, i, (ClassWriter) null, (Item) null);
        }
        if (this.M != 2 && (i3 = i + 1) > this.t) {
            this.t = i3;
        }
        if (i > 255 || i2 > 127 || i2 < -128) {
            this.r.putByte(196).b(132, i).putShort(i2);
        } else {
            this.r.putByte(132).a(i, i2);
        }
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public void visitInsn(int i) {
        ByteVector byteVector = this.r;
        this.Y = byteVector.b;
        byteVector.putByte(i);
        Label label = this.P;
        if (label != null) {
            if (this.M == 0) {
                label.h.a(i, 0, (ClassWriter) null, (Item) null);
            } else {
                int i2 = this.Q + Frame.a[i];
                if (i2 > this.R) {
                    this.R = i2;
                }
                this.Q = i2;
            }
            if ((i < 172 || i > 177) && i != 191) {
                return;
            }
            e();
        }
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public AnnotationVisitor visitInsnAnnotation(int i, TypePath typePath, String str, boolean z) {
        ByteVector byteVector = new ByteVector();
        AnnotationWriter.a((i & (-16776961)) | (this.Y << 8), typePath, byteVector);
        byteVector.putShort(this.b.newUTF8(str)).putShort(0);
        AnnotationWriter annotationWriter = new AnnotationWriter(this.b, true, byteVector, byteVector, byteVector.b - 2);
        if (z) {
            annotationWriter.g = this.W;
            this.W = annotationWriter;
            return annotationWriter;
        }
        annotationWriter.g = this.X;
        this.X = annotationWriter;
        return annotationWriter;
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public void visitIntInsn(int i, int i2) {
        this.Y = this.r.b;
        Label label = this.P;
        if (label != null) {
            if (this.M == 0) {
                label.h.a(i, i2, (ClassWriter) null, (Item) null);
            } else if (i != 188) {
                int i3 = this.Q + 1;
                if (i3 > this.R) {
                    this.R = i3;
                }
                this.Q = i3;
            }
        }
        ByteVector byteVector = this.r;
        if (i == 17) {
            byteVector.b(i, i2);
        } else {
            byteVector.a(i, i2);
        }
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public void visitInvokeDynamicInsn(String str, String str2, Handle handle, Object... objArr) {
        this.Y = this.r.b;
        Item itemA = this.b.a(str, str2, handle, objArr);
        int argumentsAndReturnSizes = itemA.c;
        Label label = this.P;
        if (label != null) {
            if (this.M == 0) {
                label.h.a(186, 0, this.b, itemA);
            } else {
                if (argumentsAndReturnSizes == 0) {
                    argumentsAndReturnSizes = Type.getArgumentsAndReturnSizes(str2);
                    itemA.c = argumentsAndReturnSizes;
                }
                int i = (this.Q - (argumentsAndReturnSizes >> 2)) + (argumentsAndReturnSizes & 3) + 1;
                if (i > this.R) {
                    this.R = i;
                }
                this.Q = i;
            }
        }
        this.r.b(186, itemA.a);
        this.r.putShort(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    @Override // com.esotericsoftware.asm.MethodVisitor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void visitJumpInsn(int r9, com.esotericsoftware.asm.Label r10) {
        /*
            r8 = this;
            com.esotericsoftware.asm.ByteVector r0 = r8.r
            int r0 = r0.b
            r8.Y = r0
            com.esotericsoftware.asm.Label r0 = r8.P
            r1 = 168(0xa8, float:2.35E-43)
            r2 = 167(0xa7, float:2.34E-43)
            r3 = 0
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L5e
            int r6 = r8.M
            if (r6 != 0) goto L2f
            com.esotericsoftware.asm.Frame r0 = r0.h
            r0.a(r9, r3, r5, r5)
            com.esotericsoftware.asm.Label r0 = r10.a()
            int r6 = r0.a
            r6 = r6 | 16
            r0.a = r6
            r8.a(r3, r10)
            if (r9 == r2) goto L5e
            com.esotericsoftware.asm.Label r5 = new com.esotericsoftware.asm.Label
            r5.<init>()
            goto L5e
        L2f:
            if (r9 != r1) goto L52
            int r5 = r10.a
            r6 = r5 & 512(0x200, float:7.17E-43)
            if (r6 != 0) goto L40
            r5 = r5 | 512(0x200, float:7.17E-43)
            r10.a = r5
            int r5 = r8.L
            int r5 = r5 + r4
            r8.L = r5
        L40:
            int r5 = r0.a
            r5 = r5 | 128(0x80, float:1.8E-43)
            r0.a = r5
            int r0 = r8.Q
            int r0 = r0 + r4
            r8.a(r0, r10)
            com.esotericsoftware.asm.Label r5 = new com.esotericsoftware.asm.Label
            r5.<init>()
            goto L5e
        L52:
            int r0 = r8.Q
            int[] r6 = com.esotericsoftware.asm.Frame.a
            r6 = r6[r9]
            int r0 = r0 + r6
            r8.Q = r0
            r8.a(r0, r10)
        L5e:
            int r0 = r10.a
            r0 = r0 & 2
            if (r0 == 0) goto La7
            int r0 = r10.c
            com.esotericsoftware.asm.ByteVector r6 = r8.r
            int r7 = r6.b
            int r0 = r0 - r7
            r7 = -32768(0xffffffffffff8000, float:NaN)
            if (r0 >= r7) goto La7
            r0 = 200(0xc8, float:2.8E-43)
            if (r9 != r2) goto L77
        L73:
            r6.putByte(r0)
            goto L9e
        L77:
            if (r9 != r1) goto L7c
            r0 = 201(0xc9, float:2.82E-43)
            goto L73
        L7c:
            if (r5 == 0) goto L84
            int r1 = r5.a
            r1 = r1 | 16
            r5.a = r1
        L84:
            r1 = 166(0xa6, float:2.33E-43)
            if (r9 > r1) goto L8d
            int r1 = r9 + 1
            r1 = r1 ^ r4
            int r1 = r1 - r4
            goto L8f
        L8d:
            r1 = r9 ^ 1
        L8f:
            r6.putByte(r1)
            com.esotericsoftware.asm.ByteVector r1 = r8.r
            r3 = 8
            r1.putShort(r3)
            com.esotericsoftware.asm.ByteVector r1 = r8.r
            r1.putByte(r0)
        L9e:
            com.esotericsoftware.asm.ByteVector r0 = r8.r
            int r1 = r0.b
            int r1 = r1 - r4
            r10.a(r8, r0, r1, r4)
            goto Lb4
        La7:
            com.esotericsoftware.asm.ByteVector r0 = r8.r
            r0.putByte(r9)
            com.esotericsoftware.asm.ByteVector r0 = r8.r
            int r1 = r0.b
            int r1 = r1 - r4
            r10.a(r8, r0, r1, r3)
        Lb4:
            com.esotericsoftware.asm.Label r10 = r8.P
            if (r10 == 0) goto Lc2
            if (r5 == 0) goto Lbd
            r8.visitLabel(r5)
        Lbd:
            if (r9 != r2) goto Lc2
            r8.e()
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.asm.MethodWriter.visitJumpInsn(int, com.esotericsoftware.asm.Label):void");
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public void visitLabel(Label label) {
        boolean z = this.K;
        ByteVector byteVector = this.r;
        this.K = z | label.a(this, byteVector.b, byteVector.a);
        int i = label.a;
        if ((i & 1) != 0) {
            return;
        }
        int i2 = this.M;
        if (i2 != 0) {
            if (i2 == 1) {
                Label label2 = this.P;
                if (label2 != null) {
                    label2.g = this.R;
                    a(this.Q, label);
                }
                this.P = label;
                this.Q = 0;
                this.R = 0;
                Label label3 = this.O;
                if (label3 != null) {
                    label3.i = label;
                }
                this.O = label;
                return;
            }
            return;
        }
        Label label4 = this.P;
        if (label4 != null) {
            if (label.c == label4.c) {
                label4.a |= i & 16;
                label.h = label4.h;
                return;
            }
            a(0, label);
        }
        this.P = label;
        if (label.h == null) {
            Frame frame = new Frame();
            label.h = frame;
            frame.b = label;
        }
        Label label5 = this.O;
        if (label5 != null) {
            if (label.c == label5.c) {
                label5.a |= label.a & 16;
                label.h = label5.h;
                this.P = label5;
                return;
            }
            label5.i = label;
        }
        this.O = label;
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public void visitLdcInsn(Object obj) {
        ByteVector byteVector;
        int i;
        this.Y = this.r.b;
        Item itemA = this.b.a(obj);
        Label label = this.P;
        if (label != null) {
            if (this.M == 0) {
                label.h.a(18, 0, this.b, itemA);
            } else {
                int i2 = itemA.b;
                int i3 = (i2 == 5 || i2 == 6) ? this.Q + 2 : this.Q + 1;
                if (i3 > this.R) {
                    this.R = i3;
                }
                this.Q = i3;
            }
        }
        int i4 = itemA.a;
        int i5 = itemA.b;
        if (i5 == 5 || i5 == 6) {
            byteVector = this.r;
            i = 20;
        } else {
            byteVector = this.r;
            if (i4 < 256) {
                byteVector.a(18, i4);
                return;
            }
            i = 19;
        }
        byteVector.b(i, i4);
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public void visitLineNumber(int i, Label label) {
        if (this.I == null) {
            this.I = new ByteVector();
        }
        this.H++;
        this.I.putShort(label.c);
        this.I.putShort(i);
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public void visitLocalVariable(String str, String str2, String str3, Label label, Label label2, int i) {
        if (str3 != null) {
            if (this.G == null) {
                this.G = new ByteVector();
            }
            this.F++;
            this.G.putShort(label.c).putShort(label2.c - label.c).putShort(this.b.newUTF8(str)).putShort(this.b.newUTF8(str3)).putShort(i);
        }
        if (this.E == null) {
            this.E = new ByteVector();
        }
        this.D++;
        this.E.putShort(label.c).putShort(label2.c - label.c).putShort(this.b.newUTF8(str)).putShort(this.b.newUTF8(str2)).putShort(i);
        if (this.M != 2) {
            char cCharAt = str2.charAt(0);
            int i2 = i + ((cCharAt == 'J' || cCharAt == 'D') ? 2 : 1);
            if (i2 > this.t) {
                this.t = i2;
            }
        }
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public AnnotationVisitor visitLocalVariableAnnotation(int i, TypePath typePath, Label[] labelArr, Label[] labelArr2, int[] iArr, String str, boolean z) {
        ByteVector byteVector = new ByteVector();
        byteVector.putByte(i >>> 24).putShort(labelArr.length);
        for (int i2 = 0; i2 < labelArr.length; i2++) {
            byteVector.putShort(labelArr[i2].c).putShort(labelArr2[i2].c - labelArr[i2].c).putShort(iArr[i2]);
        }
        if (typePath == null) {
            byteVector.putByte(0);
        } else {
            byte[] bArr = typePath.a;
            int i3 = typePath.b;
            byteVector.putByteArray(bArr, i3, (bArr[i3] * 2) + 1);
        }
        byteVector.putShort(this.b.newUTF8(str)).putShort(0);
        AnnotationWriter annotationWriter = new AnnotationWriter(this.b, true, byteVector, byteVector, byteVector.b - 2);
        if (z) {
            annotationWriter.g = this.W;
            this.W = annotationWriter;
            return annotationWriter;
        }
        annotationWriter.g = this.X;
        this.X = annotationWriter;
        return annotationWriter;
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public void visitLookupSwitchInsn(Label label, int[] iArr, Label[] labelArr) {
        ByteVector byteVector = this.r;
        int i = byteVector.b;
        this.Y = i;
        byteVector.putByte(171);
        ByteVector byteVector2 = this.r;
        byteVector2.putByteArray(null, 0, (4 - (byteVector2.b % 4)) % 4);
        label.a(this, this.r, i, true);
        this.r.putInt(labelArr.length);
        for (int i2 = 0; i2 < labelArr.length; i2++) {
            this.r.putInt(iArr[i2]);
            labelArr[i2].a(this, this.r, i, true);
        }
        a(label, labelArr);
    }

    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.esotericsoftware.asm.MethodVisitor
    public void visitMaxs(int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.asm.MethodWriter.visitMaxs(int, int):void");
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public void visitMethodInsn(int i, String str, String str2, String str3, boolean z) {
        this.Y = this.r.b;
        Item itemA = this.b.a(str, str2, str3, z);
        int argumentsAndReturnSizes = itemA.c;
        Label label = this.P;
        if (label != null) {
            if (this.M == 0) {
                label.h.a(i, 0, this.b, itemA);
            } else {
                if (argumentsAndReturnSizes == 0) {
                    argumentsAndReturnSizes = Type.getArgumentsAndReturnSizes(str3);
                    itemA.c = argumentsAndReturnSizes;
                }
                int i2 = this.Q;
                int i3 = i == 184 ? (i2 - (argumentsAndReturnSizes >> 2)) + (argumentsAndReturnSizes & 3) + 1 : (i2 - (argumentsAndReturnSizes >> 2)) + (argumentsAndReturnSizes & 3);
                if (i3 > this.R) {
                    this.R = i3;
                }
                this.Q = i3;
            }
        }
        if (i != 185) {
            this.r.b(i, itemA.a);
            return;
        }
        if (argumentsAndReturnSizes == 0) {
            argumentsAndReturnSizes = Type.getArgumentsAndReturnSizes(str3);
            itemA.c = argumentsAndReturnSizes;
        }
        this.r.b(185, itemA.a).a(argumentsAndReturnSizes >> 2, 0);
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public void visitMultiANewArrayInsn(String str, int i) {
        this.Y = this.r.b;
        Item itemA = this.b.a(str);
        Label label = this.P;
        if (label != null) {
            if (this.M == 0) {
                label.h.a(197, i, this.b, itemA);
            } else {
                this.Q = (1 - i) + this.Q;
            }
        }
        this.r.b(197, itemA.a).putByte(i);
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public void visitParameter(String str, int i) {
        if (this.$ == null) {
            this.$ = new ByteVector();
        }
        this.Z++;
        this.$.putShort(str == null ? 0 : this.b.newUTF8(str)).putShort(i);
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public AnnotationVisitor visitParameterAnnotation(int i, String str, boolean z) {
        ByteVector byteVector = new ByteVector();
        if ("Ljava/lang/Synthetic;".equals(str)) {
            this.S = Math.max(this.S, i + 1);
            return new AnnotationWriter(this.b, false, byteVector, null, 0);
        }
        byteVector.putShort(this.b.newUTF8(str)).putShort(0);
        AnnotationWriter annotationWriter = new AnnotationWriter(this.b, true, byteVector, byteVector, 2);
        if (z) {
            if (this.o == null) {
                this.o = new AnnotationWriter[Type.getArgumentTypes(this.f).length];
            }
            AnnotationWriter[] annotationWriterArr = this.o;
            annotationWriter.g = annotationWriterArr[i];
            annotationWriterArr[i] = annotationWriter;
            return annotationWriter;
        }
        if (this.p == null) {
            this.p = new AnnotationWriter[Type.getArgumentTypes(this.f).length];
        }
        AnnotationWriter[] annotationWriterArr2 = this.p;
        annotationWriter.g = annotationWriterArr2[i];
        annotationWriterArr2[i] = annotationWriter;
        return annotationWriter;
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public void visitTableSwitchInsn(int i, int i2, Label label, Label... labelArr) {
        ByteVector byteVector = this.r;
        int i3 = byteVector.b;
        this.Y = i3;
        byteVector.putByte(170);
        ByteVector byteVector2 = this.r;
        byteVector2.putByteArray(null, 0, (4 - (byteVector2.b % 4)) % 4);
        label.a(this, this.r, i3, true);
        this.r.putInt(i).putInt(i2);
        for (Label label2 : labelArr) {
            label2.a(this, this.r, i3, true);
        }
        a(label, labelArr);
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public AnnotationVisitor visitTryCatchAnnotation(int i, TypePath typePath, String str, boolean z) {
        ByteVector byteVector = new ByteVector();
        AnnotationWriter.a(i, typePath, byteVector);
        byteVector.putShort(this.b.newUTF8(str)).putShort(0);
        AnnotationWriter annotationWriter = new AnnotationWriter(this.b, true, byteVector, byteVector, byteVector.b - 2);
        if (z) {
            annotationWriter.g = this.W;
            this.W = annotationWriter;
            return annotationWriter;
        }
        annotationWriter.g = this.X;
        this.X = annotationWriter;
        return annotationWriter;
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public void visitTryCatchBlock(Label label, Label label2, Label label3, String str) {
        this.A++;
        Handler handler = new Handler();
        handler.a = label;
        handler.b = label2;
        handler.c = label3;
        handler.d = str;
        handler.e = str != null ? this.b.newClass(str) : 0;
        Handler handler2 = this.C;
        if (handler2 == null) {
            this.B = handler;
        } else {
            handler2.f = handler;
        }
        this.C = handler;
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public AnnotationVisitor visitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        ByteVector byteVector = new ByteVector();
        AnnotationWriter.a(i, typePath, byteVector);
        byteVector.putShort(this.b.newUTF8(str)).putShort(0);
        AnnotationWriter annotationWriter = new AnnotationWriter(this.b, true, byteVector, byteVector, byteVector.b - 2);
        if (z) {
            annotationWriter.g = this.U;
            this.U = annotationWriter;
            return annotationWriter;
        }
        annotationWriter.g = this.V;
        this.V = annotationWriter;
        return annotationWriter;
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public void visitTypeInsn(int i, String str) {
        this.Y = this.r.b;
        Item itemA = this.b.a(str);
        Label label = this.P;
        if (label != null) {
            if (this.M == 0) {
                label.h.a(i, this.r.b, this.b, itemA);
            } else if (i == 187) {
                int i2 = this.Q + 1;
                if (i2 > this.R) {
                    this.R = i2;
                }
                this.Q = i2;
            }
        }
        this.r.b(i, itemA.a);
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public void visitVarInsn(int i, int i2) {
        this.Y = this.r.b;
        Label label = this.P;
        if (label != null) {
            if (this.M == 0) {
                label.h.a(i, i2, (ClassWriter) null, (Item) null);
            } else if (i == 169) {
                label.a |= 256;
                label.f = this.Q;
                e();
            } else {
                int i3 = this.Q + Frame.a[i];
                if (i3 > this.R) {
                    this.R = i3;
                }
                this.Q = i3;
            }
        }
        if (this.M != 2) {
            int i4 = (i == 22 || i == 24 || i == 55 || i == 57) ? i2 + 2 : i2 + 1;
            if (i4 > this.t) {
                this.t = i4;
            }
        }
        if (i2 >= 4 || i == 169) {
            ByteVector byteVector = this.r;
            if (i2 >= 256) {
                byteVector.putByte(196).b(i, i2);
            } else {
                byteVector.a(i, i2);
            }
        } else {
            this.r.putByte((i < 54 ? ((i - 21) << 2) + 26 : ((i - 54) << 2) + 59) + i2);
        }
        if (i < 54 || this.M != 0 || this.A <= 0) {
            return;
        }
        visitLabel(new Label());
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public void visitCode() {
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public void visitEnd() {
    }

    private void b() {
        if (this.x != null) {
            if (this.v == null) {
                this.v = new ByteVector();
            }
            c();
            this.u++;
        }
        this.x = this.z;
        this.z = null;
    }

    public static short b(byte[] bArr, int i) {
        return (short) ((bArr[i + 1] & DefaultClassResolver.NAME) | ((bArr[i] & DefaultClassResolver.NAME) << 8));
    }

    public static int c(byte[] bArr, int i) {
        return (bArr[i + 1] & DefaultClassResolver.NAME) | ((bArr[i] & DefaultClassResolver.NAME) << 8);
    }

    private int a(int i, int i2, int i3) {
        int i4 = i2 + 3 + i3;
        int[] iArr = this.z;
        if (iArr == null || iArr.length < i4) {
            this.z = new int[i4];
        }
        int[] iArr2 = this.z;
        iArr2[0] = i;
        iArr2[1] = i2;
        iArr2[2] = i3;
        return 3;
    }

    public static int a(byte[] bArr, int i) {
        return (bArr[i + 3] & DefaultClassResolver.NAME) | ((bArr[i] & DefaultClassResolver.NAME) << 24) | ((bArr[i + 1] & DefaultClassResolver.NAME) << 16) | ((bArr[i + 2] & DefaultClassResolver.NAME) << 8);
    }

    public static int a(int[] iArr, int[] iArr2, int i, int i2) {
        int i3 = i2 - i;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = iArr[i4];
            if (i < i5 && i5 <= i2) {
                i3 += iArr2[i4];
            } else if (i2 < i5 && i5 <= i) {
                i3 -= iArr2[i4];
            }
        }
        return i3;
    }

    private void a(int i, int i2) {
        char c;
        ByteVector byteVectorPutByte;
        int iNewClass;
        while (i < i2) {
            int i3 = this.z[i];
            int i4 = (-268435456) & i3;
            if (i4 == 0) {
                int i5 = i3 & 1048575;
                int i6 = i3 & 267386880;
                if (i6 != 24117248) {
                    ByteVector byteVector = this.v;
                    if (i6 != 25165824) {
                        byteVector.putByte(i5);
                        i++;
                    } else {
                        byteVectorPutByte = byteVector.putByte(8);
                        iNewClass = this.b.H[i5].c;
                    }
                } else {
                    byteVectorPutByte = this.v.putByte(7);
                    ClassWriter classWriter = this.b;
                    iNewClass = classWriter.newClass(classWriter.H[i5].g);
                }
            } else {
                StringBuffer stringBuffer = new StringBuffer();
                int i7 = i4 >> 28;
                while (true) {
                    int i8 = i7 - 1;
                    if (i7 > 0) {
                        stringBuffer.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
                        i7 = i8;
                    } else {
                        if ((i3 & 267386880) == 24117248) {
                            stringBuffer.append('L');
                            stringBuffer.append(this.b.H[i3 & 1048575].g);
                            c = TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER;
                        } else {
                            int i9 = i3 & 15;
                            if (i9 == 1) {
                                c = 'I';
                            } else if (i9 == 2) {
                                c = 'F';
                            } else if (i9 != 3) {
                                switch (i9) {
                                    case 9:
                                        c = 'Z';
                                        break;
                                    case 10:
                                        c = 'B';
                                        break;
                                    case 11:
                                        c = 'C';
                                        break;
                                    case 12:
                                        c = 'S';
                                        break;
                                    default:
                                        c = 'J';
                                        break;
                                }
                            } else {
                                c = 'D';
                            }
                        }
                        stringBuffer.append(c);
                        byteVectorPutByte = this.v.putByte(7);
                        iNewClass = this.b.newClass(stringBuffer.toString());
                    }
                }
            }
            byteVectorPutByte.putShort(iNewClass);
            i++;
        }
    }

    private void a(int i, Label label) {
        Edge edge = new Edge();
        edge.a = i;
        edge.b = label;
        Label label2 = this.P;
        edge.c = label2.j;
        label2.j = edge;
    }

    public final int a() {
        int iA;
        if (this.h != 0) {
            return this.i + 6;
        }
        int i = this.r.b;
        if (i <= 0) {
            iA = 8;
        } else {
            if (i > 65535) {
                C2633.m5339("Method code too large!");
                return 0;
            }
            this.b.newUTF8(AttCode.ATTRIBUTE_NAME);
            iA = AbstractC6183.m11574(this.A, 8, this.r.b + 18, 8);
            if (this.E != null) {
                this.b.newUTF8(AttLocalVariableTable.ATTRIBUTE_NAME);
                iA += this.E.b + 8;
            }
            if (this.G != null) {
                this.b.newUTF8(AttLocalVariableTypeTable.ATTRIBUTE_NAME);
                iA += this.G.b + 8;
            }
            if (this.I != null) {
                this.b.newUTF8(AttLineNumberTable.ATTRIBUTE_NAME);
                iA += this.I.b + 8;
            }
            if (this.v != null) {
                ClassWriter classWriter = this.b;
                classWriter.newUTF8((classWriter.b & com.android.dx.io.Opcodes.MAX_VALUE) >= 50 ? "StackMapTable" : "StackMap");
                iA += this.v.b + 8;
            }
            if (this.W != null) {
                this.b.newUTF8("RuntimeVisibleTypeAnnotations");
                iA += this.W.a() + 8;
            }
            if (this.X != null) {
                this.b.newUTF8("RuntimeInvisibleTypeAnnotations");
                iA += this.X.a() + 8;
            }
            Attribute attribute = this.J;
            if (attribute != null) {
                ClassWriter classWriter2 = this.b;
                ByteVector byteVector = this.r;
                iA += attribute.a(classWriter2, byteVector.a, byteVector.b, this.s, this.t);
            }
        }
        if (this.j > 0) {
            this.b.newUTF8(AttExceptions.ATTRIBUTE_NAME);
            iA = AbstractC6183.m11574(this.j, 2, 8, iA);
        }
        int i2 = this.c;
        if ((i2 & 4096) != 0) {
            ClassWriter classWriter3 = this.b;
            if ((65535 & classWriter3.b) < 49 || (262144 & i2) != 0) {
                classWriter3.newUTF8(AttSynthetic.ATTRIBUTE_NAME);
                iA += 6;
            }
        }
        if ((this.c & 131072) != 0) {
            this.b.newUTF8(AttDeprecated.ATTRIBUTE_NAME);
            iA += 6;
        }
        if (this.g != null) {
            this.b.newUTF8(AttSignature.ATTRIBUTE_NAME);
            this.b.newUTF8(this.g);
            iA += 8;
        }
        if (this.$ != null) {
            this.b.newUTF8("MethodParameters");
            iA += this.$.b + 7;
        }
        if (this.l != null) {
            this.b.newUTF8(AttAnnotationDefault.ATTRIBUTE_NAME);
            iA += this.l.b + 6;
        }
        if (this.m != null) {
            this.b.newUTF8(AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME);
            iA += this.m.a() + 8;
        }
        if (this.n != null) {
            this.b.newUTF8(AttRuntimeInvisibleAnnotations.ATTRIBUTE_NAME);
            iA += this.n.a() + 8;
        }
        if (this.U != null) {
            this.b.newUTF8("RuntimeVisibleTypeAnnotations");
            iA += this.U.a() + 8;
        }
        if (this.V != null) {
            this.b.newUTF8("RuntimeInvisibleTypeAnnotations");
            iA += this.V.a() + 8;
        }
        if (this.o != null) {
            this.b.newUTF8(AttRuntimeVisibleParameterAnnotations.ATTRIBUTE_NAME);
            AnnotationWriter[] annotationWriterArr = this.o;
            int length = ((annotationWriterArr.length - this.S) * 2) + 7 + iA;
            for (int length2 = annotationWriterArr.length - 1; length2 >= this.S; length2--) {
                AnnotationWriter annotationWriter = this.o[length2];
                length += annotationWriter == null ? 0 : annotationWriter.a();
            }
            iA = length;
        }
        if (this.p != null) {
            this.b.newUTF8(AttRuntimeInvisibleParameterAnnotations.ATTRIBUTE_NAME);
            AnnotationWriter[] annotationWriterArr2 = this.p;
            int length3 = ((annotationWriterArr2.length - this.S) * 2) + 7 + iA;
            for (int length4 = annotationWriterArr2.length - 1; length4 >= this.S; length4--) {
                AnnotationWriter annotationWriter2 = this.p[length4];
                length3 += annotationWriter2 == null ? 0 : annotationWriter2.a();
            }
            iA = length3;
        }
        Attribute attribute2 = this.q;
        return attribute2 != null ? iA + attribute2.a(this.b, null, 0, -1, -1) : iA;
    }

    private void a(Label label, Label[] labelArr) {
        Label label2 = this.P;
        if (label2 != null) {
            if (this.M == 0) {
                label2.h.a(171, 0, (ClassWriter) null, (Item) null);
                a(0, label);
                label.a().a |= 16;
                for (int i = 0; i < labelArr.length; i++) {
                    a(0, labelArr[i]);
                    labelArr[i].a().a |= 16;
                }
            } else {
                int i2 = this.Q - 1;
                this.Q = i2;
                a(i2, label);
                for (Label label3 : labelArr) {
                    a(this.Q, label3);
                }
            }
            e();
        }
    }

    private void a(Object obj) {
        if (obj instanceof String) {
            this.v.putByte(7).putShort(this.b.newClass((String) obj));
            return;
        }
        boolean z = obj instanceof Integer;
        ByteVector byteVector = this.v;
        if (z) {
            byteVector.putByte(((Integer) obj).intValue());
        } else {
            byteVector.putByte(8).putShort(((Label) obj).c);
        }
    }

    public static void a(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >>> 8);
        bArr[i + 1] = (byte) i2;
    }

    public static void a(int[] iArr, int[] iArr2, Label label) {
        if ((label.a & 4) == 0) {
            label.c = a(iArr, iArr2, 0, label.c);
            label.a |= 4;
        }
    }
}
