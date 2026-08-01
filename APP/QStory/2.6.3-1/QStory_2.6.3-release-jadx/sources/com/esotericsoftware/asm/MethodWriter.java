package com.esotericsoftware.asm;

import bsh.C3466;
import com.android.p002dx.p003cf.attrib.AttAnnotationDefault;
import com.android.p002dx.p003cf.attrib.AttCode;
import com.android.p002dx.p003cf.attrib.AttDeprecated;
import com.android.p002dx.p003cf.attrib.AttExceptions;
import com.android.p002dx.p003cf.attrib.AttLineNumberTable;
import com.android.p002dx.p003cf.attrib.AttLocalVariableTable;
import com.android.p002dx.p003cf.attrib.AttLocalVariableTypeTable;
import com.android.p002dx.p003cf.attrib.AttRuntimeInvisibleAnnotations;
import com.android.p002dx.p003cf.attrib.AttRuntimeInvisibleParameterAnnotations;
import com.android.p002dx.p003cf.attrib.AttRuntimeVisibleAnnotations;
import com.android.p002dx.p003cf.attrib.AttRuntimeVisibleParameterAnnotations;
import com.android.p002dx.p003cf.attrib.AttSignature;
import com.android.p002dx.p003cf.attrib.AttSynthetic;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.pool.TypePool;
import p025.AbstractC7012;

/* JADX INFO: loaded from: classes.dex */
class MethodWriter extends MethodVisitor {

    /* JADX INFO: renamed from: $ */
    private ByteVector f230$;

    /* JADX INFO: renamed from: A */
    private int f231A;

    /* JADX INFO: renamed from: B */
    private Handler f232B;

    /* JADX INFO: renamed from: C */
    private Handler f233C;

    /* JADX INFO: renamed from: D */
    private int f234D;

    /* JADX INFO: renamed from: E */
    private ByteVector f235E;

    /* JADX INFO: renamed from: F */
    private int f236F;

    /* JADX INFO: renamed from: G */
    private ByteVector f237G;

    /* JADX INFO: renamed from: H */
    private int f238H;

    /* JADX INFO: renamed from: I */
    private ByteVector f239I;

    /* JADX INFO: renamed from: J */
    private Attribute f240J;

    /* JADX INFO: renamed from: K */
    private boolean f241K;

    /* JADX INFO: renamed from: L */
    private int f242L;

    /* JADX INFO: renamed from: M */
    private final int f243M;

    /* JADX INFO: renamed from: N */
    private Label f244N;

    /* JADX INFO: renamed from: O */
    private Label f245O;

    /* JADX INFO: renamed from: P */
    private Label f246P;

    /* JADX INFO: renamed from: Q */
    private int f247Q;

    /* JADX INFO: renamed from: R */
    private int f248R;

    /* JADX INFO: renamed from: S */
    private int f249S;

    /* JADX INFO: renamed from: T */
    private int f250T;

    /* JADX INFO: renamed from: U */
    private AnnotationWriter f251U;

    /* JADX INFO: renamed from: V */
    private AnnotationWriter f252V;

    /* JADX INFO: renamed from: W */
    private AnnotationWriter f253W;

    /* JADX INFO: renamed from: X */
    private AnnotationWriter f254X;

    /* JADX INFO: renamed from: Y */
    private int f255Y;

    /* JADX INFO: renamed from: Z */
    private int f256Z;

    /* JADX INFO: renamed from: b */
    final ClassWriter f257b;

    /* JADX INFO: renamed from: c */
    private int f258c;

    /* JADX INFO: renamed from: d */
    private final int f259d;

    /* JADX INFO: renamed from: e */
    private final int f260e;

    /* JADX INFO: renamed from: f */
    private final String f261f;

    /* JADX INFO: renamed from: g */
    String f262g;

    /* JADX INFO: renamed from: h */
    int f263h;

    /* JADX INFO: renamed from: i */
    int f264i;

    /* JADX INFO: renamed from: j */
    int f265j;

    /* JADX INFO: renamed from: k */
    int[] f266k;

    /* JADX INFO: renamed from: l */
    private ByteVector f267l;

    /* JADX INFO: renamed from: m */
    private AnnotationWriter f268m;

    /* JADX INFO: renamed from: n */
    private AnnotationWriter f269n;

    /* JADX INFO: renamed from: o */
    private AnnotationWriter[] f270o;

    /* JADX INFO: renamed from: p */
    private AnnotationWriter[] f271p;

    /* JADX INFO: renamed from: q */
    private Attribute f272q;

    /* JADX INFO: renamed from: r */
    private ByteVector f273r;

    /* JADX INFO: renamed from: s */
    private int f274s;

    /* JADX INFO: renamed from: t */
    private int f275t;

    /* JADX INFO: renamed from: u */
    private int f276u;

    /* JADX INFO: renamed from: v */
    private ByteVector f277v;

    /* JADX INFO: renamed from: w */
    private int f278w;

    /* JADX INFO: renamed from: x */
    private int[] f279x;

    /* JADX INFO: renamed from: z */
    private int[] f280z;

    public MethodWriter(ClassWriter classWriter, int i, String str, String str2, String str3, String[] strArr, boolean z, boolean z2) {
        super(327680);
        this.f273r = new ByteVector();
        if (classWriter.f118D == null) {
            classWriter.f118D = this;
        } else {
            classWriter.f119E.f229mv = this;
        }
        classWriter.f119E = this;
        this.f257b = classWriter;
        this.f258c = i;
        if (MethodDescription.CONSTRUCTOR_INTERNAL_NAME.equals(str)) {
            this.f258c |= net.bytebuddy.jar.asm.Opcodes.ASM8;
        }
        this.f259d = classWriter.newUTF8(str);
        this.f260e = classWriter.newUTF8(str2);
        this.f261f = str2;
        this.f262g = str3;
        if (strArr != null && strArr.length > 0) {
            int length = strArr.length;
            this.f265j = length;
            this.f266k = new int[length];
            for (int i2 = 0; i2 < this.f265j; i2++) {
                this.f266k[i2] = classWriter.newClass(strArr[i2]);
            }
        }
        this.f243M = z2 ? 0 : z ? 1 : 2;
        if (z || z2) {
            int argumentsAndReturnSizes = Type.getArgumentsAndReturnSizes(this.f261f) >> 2;
            argumentsAndReturnSizes = (i & 8) != 0 ? argumentsAndReturnSizes - 1 : argumentsAndReturnSizes;
            this.f275t = argumentsAndReturnSizes;
            this.f250T = argumentsAndReturnSizes;
            Label label = new Label();
            this.f244N = label;
            label.f218a |= 8;
            visitLabel(label);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m126b(Frame frame) {
        int[] iArr = frame.f191c;
        int[] iArr2 = frame.f192d;
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
        int iM115a = m115a(frame.f190b.f220c, i3, i7);
        int i9 = 0;
        while (i3 > 0) {
            int i10 = iArr[i9];
            int i11 = iM115a + 1;
            this.f280z[iM115a] = i10;
            if (i10 == 16777220 || i10 == 16777219) {
                i9++;
            }
            i9++;
            i3--;
            iM115a = i11;
        }
        while (i < iArr2.length) {
            int i12 = iArr2[i];
            int i13 = iM115a + 1;
            this.f280z[iM115a] = i12;
            if (i12 == 16777220 || i12 == 16777219) {
                i++;
            }
            i++;
            iM115a = i13;
        }
        m125b();
    }

    /* JADX INFO: renamed from: c */
    private void m128c() {
        int i;
        char c;
        int i2;
        int[] iArr = this.f280z;
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = 0;
        int i6 = 3;
        if ((this.f257b.f129b & com.android.p002dx.p005io.Opcodes.MAX_VALUE) < 50) {
            this.f277v.putShort(iArr[0]).putShort(i3);
            int i7 = i3 + 3;
            m118a(3, i7);
            this.f277v.putShort(i4);
            m118a(i7, i4 + i7);
            return;
        }
        int[] iArr2 = this.f279x;
        int i8 = iArr2[1];
        int i9 = this.f276u == 0 ? iArr[0] : (iArr[0] - iArr2[0]) - 1;
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
                if (this.f280z[i10] != this.f279x[i10]) {
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
            this.f277v.putByte(i9);
            return;
        }
        if (c == '@') {
            this.f277v.putByte(i9 + 64);
            m118a(i3 + 3, i3 + 4);
            return;
        }
        if (c == 247) {
            this.f277v.putByte(247).putShort(i9);
            m118a(i3 + 3, i3 + 4);
            return;
        }
        if (c == 248) {
            this.f277v.putByte(i + com.android.p002dx.p005io.Opcodes.INVOKE_POLYMORPHIC_RANGE).putShort(i9);
            return;
        }
        if (c == 251) {
            this.f277v.putByte(com.android.p002dx.p005io.Opcodes.INVOKE_POLYMORPHIC_RANGE).putShort(i9);
            return;
        }
        ByteVector byteVector = this.f277v;
        if (c == 252) {
            int i11 = i2;
            byteVector.putByte(i + com.android.p002dx.p005io.Opcodes.INVOKE_POLYMORPHIC_RANGE).putShort(i9);
            m118a(i8 + i11, i3 + i11);
        } else {
            byteVector.putByte(com.android.p002dx.p005io.Opcodes.CONST_METHOD_TYPE).putShort(i9).putShort(i3);
            int i12 = i3 + 3;
            m118a(i2, i12);
            this.f277v.putShort(i4);
            m118a(i12, i4 + i12);
        }
    }

    /* JADX INFO: renamed from: d */
    private void m129d() {
        int i;
        int iM124b;
        int i2;
        int i3;
        int i4;
        int iM124b2;
        int i5;
        int i6;
        ByteVector byteVector = this.f273r;
        byte[] bArr = byteVector.f107a;
        int[] iArr = new int[0];
        int[] iArr2 = new int[0];
        boolean[] zArr = new boolean[byteVector.f108b];
        int i7 = 3;
        int i8 = 3;
        while (true) {
            if (i8 == i7) {
                i8 = 2;
            }
            int iM116a = 0;
            while (true) {
                int i9 = 168;
                int i10 = 8;
                int i11 = i7;
                int i12 = 4;
                boolean z = true;
                if (iM116a < bArr.length) {
                    int i13 = bArr[iM116a] & DefaultClassResolver.NAME;
                    switch (ClassWriter.f114a[i13]) {
                        case 0:
                        case 4:
                            iM116a++;
                            i5 = 0;
                            break;
                        case 1:
                        case 3:
                        case 11:
                            iM116a += 2;
                            i5 = 0;
                            break;
                        case 2:
                        case 5:
                        case 6:
                        case 12:
                        case 13:
                            iM116a += 3;
                            i5 = 0;
                            break;
                        case 7:
                        case 8:
                        case 10:
                            iM116a += 5;
                            i5 = 0;
                            break;
                        case 9:
                            if (i13 > 201) {
                                i13 = i13 < 218 ? i13 - 49 : i13 - 20;
                                iM124b2 = m127c(bArr, iM116a + 1);
                            } else {
                                iM124b2 = m124b(bArr, iM116a + 1);
                            }
                            int iM117a = m117a(iArr, iArr2, iM116a, iM124b2 + iM116a);
                            if ((iM117a < -32768 || iM117a > 32767) && !zArr[iM116a]) {
                                int i14 = (i13 == 167 || i13 == 168) ? 2 : 5;
                                zArr[iM116a] = true;
                                i5 = i14;
                            } else {
                                i5 = 0;
                            }
                            iM116a += 3;
                            break;
                        case 14:
                            if (i8 == 1) {
                                i6 = -(m117a(iArr, iArr2, 0, iM116a) & 3);
                            } else if (zArr[iM116a]) {
                                i5 = 0;
                                int i15 = (iM116a + 4) - (iM116a & 3);
                                iM116a = (((m116a(bArr, i15 + 8) - m116a(bArr, i15 + 4)) + 1) * 4) + 12 + i15;
                            } else {
                                i6 = iM116a & 3;
                                zArr[iM116a] = true;
                            }
                            i5 = i6;
                            int i152 = (iM116a + 4) - (iM116a & 3);
                            iM116a = (((m116a(bArr, i152 + 8) - m116a(bArr, i152 + 4)) + 1) * 4) + 12 + i152;
                            break;
                        case 15:
                            if (i8 == 1) {
                                i5 = -(m117a(iArr, iArr2, 0, iM116a) & 3);
                            } else if (zArr[iM116a]) {
                                i5 = 0;
                            } else {
                                i5 = iM116a & 3;
                                zArr[iM116a] = true;
                            }
                            int i16 = (iM116a + 4) - (iM116a & 3);
                            iM116a = AbstractC7012.m12133(m116a(bArr, i16 + 4), 8, 8, i16);
                            break;
                        case 17:
                            if ((bArr[iM116a + 1] & DefaultClassResolver.NAME) == 132) {
                                iM116a += 6;
                            }
                            i5 = 0;
                        case 16:
                        default:
                            iM116a += 4;
                            i5 = 0;
                            break;
                    }
                    if (i5 != 0) {
                        int[] iArr3 = new int[iArr.length + 1];
                        int[] iArr4 = new int[iArr2.length + 1];
                        System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                        System.arraycopy(iArr2, 0, iArr4, 0, iArr2.length);
                        iArr3[iArr.length] = iM116a;
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
                        ByteVector byteVector2 = new ByteVector(this.f273r.f108b);
                        int i17 = 0;
                        while (i17 < this.f273r.f108b) {
                            int i18 = bArr[i17] & DefaultClassResolver.NAME;
                            boolean z2 = z;
                            switch (ClassWriter.f114a[i18]) {
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
                                        iM124b = m127c(bArr, i17 + 1);
                                    } else {
                                        iM124b = m124b(bArr, i17 + 1);
                                    }
                                    int iM117a2 = m117a(iArr, iArr2, i17, iM124b + i17);
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
                                            iM117a2 -= 3;
                                            byteVector2.putInt(iM117a2);
                                        }
                                        i = i19;
                                        byteVector2.putInt(iM117a2);
                                    } else {
                                        i = i19;
                                        byteVector2.putByte(i18);
                                        byteVector2.putShort(iM117a2);
                                    }
                                    i17 += 3;
                                    break;
                                case 10:
                                    i2 = i10;
                                    int iM117a3 = m117a(iArr, iArr2, i17, m116a(bArr, i17 + 1) + i17);
                                    byteVector2.putByte(i18);
                                    byteVector2.putInt(iM117a3);
                                    i17 += 5;
                                    i = i2;
                                    break;
                                case 14:
                                    i2 = i10;
                                    int i20 = (i17 + 4) - (i17 & 3);
                                    byteVector2.putByte(170);
                                    i12 = 4;
                                    byteVector2.putByteArray(null, 0, (4 - (byteVector2.f108b % 4)) % 4);
                                    byteVector2.putInt(m117a(iArr, iArr2, i17, m116a(bArr, i20) + i17));
                                    int iM116a2 = m116a(bArr, i20 + 4);
                                    byteVector2.putInt(iM116a2);
                                    int i21 = i20 + 12;
                                    byteVector2.putInt(m116a(bArr, i20 + 8));
                                    for (int iM116a3 = (m116a(bArr, i20 + 8) - iM116a2) + 1; iM116a3 > 0; iM116a3--) {
                                        int iM116a4 = m116a(bArr, i21) + i17;
                                        i21 += 4;
                                        byteVector2.putInt(m117a(iArr, iArr2, i17, iM116a4));
                                    }
                                    i17 = i21;
                                    i = i2;
                                    break;
                                case 15:
                                    i3 = i10;
                                    int i22 = (i17 + 4) - (i17 & 3);
                                    byteVector2.putByte(171);
                                    byteVector2.putByteArray(null, 0, (4 - (byteVector2.f108b % 4)) % 4);
                                    byteVector2.putInt(m117a(iArr, iArr2, i17, m116a(bArr, i22) + i17));
                                    int iM116a5 = m116a(bArr, i22 + 4);
                                    int i23 = i22 + 8;
                                    byteVector2.putInt(iM116a5);
                                    while (iM116a5 > 0) {
                                        byteVector2.putInt(m116a(bArr, i23));
                                        int iM116a6 = m116a(bArr, i23 + 4) + i17;
                                        i23 += 8;
                                        byteVector2.putInt(m117a(iArr, iArr2, i17, iM116a6));
                                        iM116a5--;
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
                        if (this.f243M == 0) {
                            for (Label label = this.f244N; label != null; label = label.f226i) {
                                int i24 = label.f220c - 3;
                                if (i24 >= 0 && zArr[i24]) {
                                    label.f218a |= 16;
                                }
                                m123a(iArr, iArr2, label);
                            }
                            if (this.f257b.f121H != null) {
                                int i25 = 0;
                                while (true) {
                                    Item[] itemArr = this.f257b.f121H;
                                    if (i25 < itemArr.length) {
                                        Item item = itemArr[i25];
                                        if (item != null && item.f210b == 31) {
                                            item.f211c = m117a(iArr, iArr2, 0, item.f211c);
                                        }
                                        i25++;
                                    }
                                }
                            }
                        } else if (this.f276u > 0) {
                            this.f257b.f125L = z3;
                        }
                        for (Handler handler = this.f232B; handler != null; handler = handler.f208f) {
                            m123a(iArr, iArr2, handler.f203a);
                            m123a(iArr, iArr2, handler.f204b);
                            m123a(iArr, iArr2, handler.f205c);
                        }
                        int i26 = 0;
                        while (i26 < 2) {
                            ByteVector byteVector3 = i26 == 0 ? this.f235E : this.f237G;
                            if (byteVector3 != null) {
                                byte[] bArr2 = byteVector3.f107a;
                                for (int i27 = 0; i27 < byteVector3.f108b; i27 += 10) {
                                    int iM127c = m127c(bArr2, i27);
                                    int iM117a4 = m117a(iArr, iArr2, 0, iM127c);
                                    m122a(bArr2, i27, iM117a4);
                                    int i28 = i27 + 2;
                                    m122a(bArr2, i28, m117a(iArr, iArr2, 0, iM127c + m127c(bArr2, i28)) - iM117a4);
                                }
                            }
                            i26++;
                        }
                        ByteVector byteVector4 = this.f239I;
                        if (byteVector4 != null) {
                            byte[] bArr3 = byteVector4.f107a;
                            for (int i29 = 0; i29 < this.f239I.f108b; i29 += 4) {
                                m122a(bArr3, i29, m117a(iArr, iArr2, 0, m127c(bArr3, i29)));
                            }
                        }
                        for (Attribute attribute = this.f240J; attribute != null; attribute = attribute.f105a) {
                            Label[] labels = attribute.getLabels();
                            if (labels != null) {
                                for (int length = labels.length - 1; length >= 0; length--) {
                                    m123a(iArr, iArr2, labels[length]);
                                }
                            }
                        }
                        this.f273r = byteVector2;
                        return;
                    }
                    i7 = 3;
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private void m130e() {
        if (this.f243M == 0) {
            Label label = new Label();
            Frame frame = new Frame();
            label.f225h = frame;
            frame.f190b = label;
            ByteVector byteVector = this.f273r;
            label.m113a(this, byteVector.f108b, byteVector.f107a);
            this.f245O.f226i = label;
            this.f245O = label;
        } else {
            this.f246P.f224g = this.f248R;
        }
        this.f246P = null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0059. Please report as an issue. */
    /* JADX INFO: renamed from: f */
    private void m131f() {
        int i;
        int i2;
        int i3;
        int iM115a = m115a(0, this.f261f.length() + 1, 0);
        int i4 = this.f258c;
        if ((i4 & 8) == 0) {
            int i5 = i4 & net.bytebuddy.jar.asm.Opcodes.ASM8;
            int[] iArr = this.f280z;
            if (i5 == 0) {
                i3 = iM115a + 1;
                ClassWriter classWriter = this.f257b;
                iArr[iM115a] = classWriter.m80c(classWriter.f122I) | 24117248;
            } else {
                i3 = iM115a + 1;
                iArr[iM115a] = 6;
            }
            iM115a = i3;
        }
        int i6 = 1;
        while (true) {
            int i7 = i6 + 1;
            char cCharAt = this.f261f.charAt(i6);
            if (cCharAt == 'F') {
                i = iM115a + 1;
                this.f280z[iM115a] = 2;
            } else if (cCharAt != 'L') {
                if (cCharAt != 'S' && cCharAt != 'I') {
                    if (cCharAt == 'J') {
                        i = iM115a + 1;
                        this.f280z[iM115a] = 4;
                    } else if (cCharAt != 'Z') {
                        if (cCharAt != '[') {
                            switch (cCharAt) {
                                case 'D':
                                    i2 = iM115a + 1;
                                    this.f280z[iM115a] = 3;
                                    break;
                            }
                            this.f280z[1] = iM115a - 3;
                            m125b();
                            return;
                        }
                        while (this.f261f.charAt(i7) == '[') {
                            i7++;
                        }
                        if (this.f261f.charAt(i7) == 'L') {
                            do {
                                i7++;
                            } while (this.f261f.charAt(i7) != ';');
                        }
                        i2 = iM115a + 1;
                        i7++;
                        this.f280z[iM115a] = this.f257b.m80c(this.f261f.substring(i6, i7)) | 24117248;
                        i6 = i7;
                        iM115a = i2;
                    }
                }
                i = iM115a + 1;
                this.f280z[iM115a] = 1;
            } else {
                int i8 = i7;
                while (this.f261f.charAt(i8) != ';') {
                    i8++;
                }
                this.f280z[iM115a] = this.f257b.m80c(this.f261f.substring(i7, i8)) | 24117248;
                iM115a++;
                i6 = i8 + 1;
            }
            iM115a = i;
            i6 = i7;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m133a(ByteVector byteVector) {
        int i;
        int i2;
        int i3;
        ByteVector byteVector2 = byteVector;
        int i4 = this.f258c;
        byteVector2.putShort(i4 & (~(((i4 & 262144) / 64) | 917504))).putShort(this.f259d).putShort(this.f260e);
        int i5 = this.f263h;
        if (i5 != 0) {
            byteVector2.putByteArray(this.f257b.f126M.f110b, i5, this.f264i);
            return;
        }
        int iM37a = this.f273r.f108b > 0 ? 1 : 0;
        if (this.f265j > 0) {
            iM37a++;
        }
        int i6 = this.f258c;
        if ((i6 & 4096) != 0 && ((this.f257b.f129b & com.android.p002dx.p005io.Opcodes.MAX_VALUE) < 49 || (i6 & 262144) != 0)) {
            iM37a++;
        }
        if ((i6 & 131072) != 0) {
            iM37a++;
        }
        if (this.f262g != null) {
            iM37a++;
        }
        if (this.f230$ != null) {
            iM37a++;
        }
        if (this.f267l != null) {
            iM37a++;
        }
        if (this.f268m != null) {
            iM37a++;
        }
        if (this.f269n != null) {
            iM37a++;
        }
        if (this.f251U != null) {
            iM37a++;
        }
        if (this.f252V != null) {
            iM37a++;
        }
        if (this.f270o != null) {
            iM37a++;
        }
        if (this.f271p != null) {
            iM37a++;
        }
        Attribute attribute = this.f272q;
        if (attribute != null) {
            iM37a += attribute.m37a();
        }
        byteVector2.putShort(iM37a);
        int i7 = this.f273r.f108b;
        if (i7 > 0) {
            int iM38a = (this.f231A * 8) + i7 + 12;
            ByteVector byteVector3 = this.f235E;
            if (byteVector3 != null) {
                iM38a += byteVector3.f108b + 8;
            }
            ByteVector byteVector4 = this.f237G;
            if (byteVector4 != null) {
                iM38a += byteVector4.f108b + 8;
            }
            ByteVector byteVector5 = this.f239I;
            if (byteVector5 != null) {
                iM38a += byteVector5.f108b + 8;
            }
            ByteVector byteVector6 = this.f277v;
            if (byteVector6 != null) {
                iM38a += byteVector6.f108b + 8;
            }
            AnnotationWriter annotationWriter = this.f253W;
            if (annotationWriter != null) {
                iM38a += annotationWriter.m35a() + 8;
            }
            AnnotationWriter annotationWriter2 = this.f254X;
            if (annotationWriter2 != null) {
                iM38a += annotationWriter2.m35a() + 8;
            }
            Attribute attribute2 = this.f240J;
            if (attribute2 != null) {
                ClassWriter classWriter = this.f257b;
                ByteVector byteVector7 = this.f273r;
                i3 = 2;
                i = 262144;
                iM38a += attribute2.m38a(classWriter, byteVector7.f107a, byteVector7.f108b, this.f274s, this.f275t);
            } else {
                i = 262144;
                i3 = 2;
            }
            byteVector2.putShort(this.f257b.newUTF8(AttCode.ATTRIBUTE_NAME)).putInt(iM38a);
            byteVector2.putShort(this.f274s).putShort(this.f275t);
            ByteVector byteVectorPutInt = byteVector2.putInt(this.f273r.f108b);
            ByteVector byteVector8 = this.f273r;
            byteVectorPutInt.putByteArray(byteVector8.f107a, 0, byteVector8.f108b);
            byteVector2.putShort(this.f231A);
            if (this.f231A > 0) {
                for (Handler handler = this.f232B; handler != null; handler = handler.f208f) {
                    byteVector2.putShort(handler.f203a.f220c).putShort(handler.f204b.f220c).putShort(handler.f205c.f220c).putShort(handler.f207e);
                }
            }
            int iM37a2 = this.f235E != null ? 1 : 0;
            if (this.f237G != null) {
                iM37a2++;
            }
            if (this.f239I != null) {
                iM37a2++;
            }
            if (this.f277v != null) {
                iM37a2++;
            }
            if (this.f253W != null) {
                iM37a2++;
            }
            if (this.f254X != null) {
                iM37a2++;
            }
            Attribute attribute3 = this.f240J;
            if (attribute3 != null) {
                iM37a2 += attribute3.m37a();
            }
            byteVector2.putShort(iM37a2);
            if (this.f235E != null) {
                byteVector2.putShort(this.f257b.newUTF8(AttLocalVariableTable.ATTRIBUTE_NAME));
                byteVector2.putInt(this.f235E.f108b + 2).putShort(this.f234D);
                ByteVector byteVector9 = this.f235E;
                byteVector2.putByteArray(byteVector9.f107a, 0, byteVector9.f108b);
            }
            if (this.f237G != null) {
                byteVector2.putShort(this.f257b.newUTF8(AttLocalVariableTypeTable.ATTRIBUTE_NAME));
                byteVector2.putInt(this.f237G.f108b + 2).putShort(this.f236F);
                ByteVector byteVector10 = this.f237G;
                byteVector2.putByteArray(byteVector10.f107a, 0, byteVector10.f108b);
            }
            if (this.f239I != null) {
                byteVector2.putShort(this.f257b.newUTF8(AttLineNumberTable.ATTRIBUTE_NAME));
                byteVector2.putInt(this.f239I.f108b + 2).putShort(this.f238H);
                ByteVector byteVector11 = this.f239I;
                byteVector2.putByteArray(byteVector11.f107a, 0, byteVector11.f108b);
            }
            if (this.f277v != null) {
                ClassWriter classWriter2 = this.f257b;
                byteVector2.putShort(classWriter2.newUTF8((classWriter2.f129b & com.android.p002dx.p005io.Opcodes.MAX_VALUE) >= 50 ? "StackMapTable" : "StackMap"));
                byteVector2.putInt(this.f277v.f108b + 2).putShort(this.f276u);
                ByteVector byteVector12 = this.f277v;
                byteVector2.putByteArray(byteVector12.f107a, 0, byteVector12.f108b);
            }
            if (this.f253W != null) {
                byteVector2.putShort(this.f257b.newUTF8("RuntimeVisibleTypeAnnotations"));
                this.f253W.m36a(byteVector2);
            }
            if (this.f254X != null) {
                byteVector2.putShort(this.f257b.newUTF8("RuntimeInvisibleTypeAnnotations"));
                this.f254X.m36a(byteVector2);
            }
            Attribute attribute4 = this.f240J;
            if (attribute4 != null) {
                ClassWriter classWriter3 = this.f257b;
                ByteVector byteVector13 = this.f273r;
                i2 = i3;
                attribute4.m39a(classWriter3, byteVector13.f107a, byteVector13.f108b, this.f275t, this.f274s, byteVector);
                byteVector2 = byteVector;
            } else {
                i2 = i3;
            }
        } else {
            i = 262144;
            i2 = 2;
        }
        if (this.f265j > 0) {
            byteVector2.putShort(this.f257b.newUTF8(AttExceptions.ATTRIBUTE_NAME)).putInt((this.f265j * i2) + i2);
            byteVector2.putShort(this.f265j);
            for (int i8 = 0; i8 < this.f265j; i8++) {
                byteVector2.putShort(this.f266k[i8]);
            }
        }
        int i9 = this.f258c;
        if ((i9 & 4096) != 0) {
            ClassWriter classWriter4 = this.f257b;
            if ((classWriter4.f129b & com.android.p002dx.p005io.Opcodes.MAX_VALUE) < 49 || (i9 & i) != 0) {
                byteVector2.putShort(classWriter4.newUTF8(AttSynthetic.ATTRIBUTE_NAME)).putInt(0);
            }
        }
        if ((this.f258c & 131072) != 0) {
            byteVector2.putShort(this.f257b.newUTF8(AttDeprecated.ATTRIBUTE_NAME)).putInt(0);
        }
        if (this.f262g != null) {
            byteVector2.putShort(this.f257b.newUTF8(AttSignature.ATTRIBUTE_NAME)).putInt(i2).putShort(this.f257b.newUTF8(this.f262g));
        }
        if (this.f230$ != null) {
            byteVector2.putShort(this.f257b.newUTF8("MethodParameters"));
            byteVector2.putInt(this.f230$.f108b + 1).putByte(this.f256Z);
            ByteVector byteVector14 = this.f230$;
            byteVector2.putByteArray(byteVector14.f107a, 0, byteVector14.f108b);
        }
        if (this.f267l != null) {
            byteVector2.putShort(this.f257b.newUTF8(AttAnnotationDefault.ATTRIBUTE_NAME));
            byteVector2.putInt(this.f267l.f108b);
            ByteVector byteVector15 = this.f267l;
            byteVector2.putByteArray(byteVector15.f107a, 0, byteVector15.f108b);
        }
        if (this.f268m != null) {
            byteVector2.putShort(this.f257b.newUTF8(AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME));
            this.f268m.m36a(byteVector2);
        }
        if (this.f269n != null) {
            byteVector2.putShort(this.f257b.newUTF8(AttRuntimeInvisibleAnnotations.ATTRIBUTE_NAME));
            this.f269n.m36a(byteVector2);
        }
        if (this.f251U != null) {
            byteVector2.putShort(this.f257b.newUTF8("RuntimeVisibleTypeAnnotations"));
            this.f251U.m36a(byteVector2);
        }
        if (this.f252V != null) {
            byteVector2.putShort(this.f257b.newUTF8("RuntimeInvisibleTypeAnnotations"));
            this.f252V.m36a(byteVector2);
        }
        if (this.f270o != null) {
            byteVector2.putShort(this.f257b.newUTF8(AttRuntimeVisibleParameterAnnotations.ATTRIBUTE_NAME));
            AnnotationWriter.m34a(this.f270o, this.f249S, byteVector2);
        }
        if (this.f271p != null) {
            byteVector2.putShort(this.f257b.newUTF8(AttRuntimeInvisibleParameterAnnotations.ATTRIBUTE_NAME));
            AnnotationWriter.m34a(this.f271p, this.f249S, byteVector2);
        }
        Attribute attribute5 = this.f272q;
        if (attribute5 != null) {
            attribute5.m39a(this.f257b, null, 0, -1, -1, byteVector2);
        }
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public AnnotationVisitor visitAnnotation(String str, boolean z) {
        ByteVector byteVector = new ByteVector();
        byteVector.putShort(this.f257b.newUTF8(str)).putShort(0);
        AnnotationWriter annotationWriter = new AnnotationWriter(this.f257b, true, byteVector, byteVector, 2);
        if (z) {
            annotationWriter.f103g = this.f268m;
            this.f268m = annotationWriter;
            return annotationWriter;
        }
        annotationWriter.f103g = this.f269n;
        this.f269n = annotationWriter;
        return annotationWriter;
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public AnnotationVisitor visitAnnotationDefault() {
        ByteVector byteVector = new ByteVector();
        this.f267l = byteVector;
        return new AnnotationWriter(this.f257b, false, byteVector, null, 0);
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public void visitAttribute(Attribute attribute) {
        if (attribute.isCodeAttribute()) {
            attribute.f105a = this.f240J;
            this.f240J = attribute;
        } else {
            attribute.f105a = this.f272q;
            this.f272q = attribute;
        }
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public void visitFieldInsn(int i, String str, String str2, String str3) {
        int i2;
        int i3;
        this.f255Y = this.f273r.f108b;
        Item itemM78a = this.f257b.m78a(str, str2, str3);
        Label label = this.f246P;
        if (label != null) {
            if (this.f243M == 0) {
                label.f225h.m95a(i, 0, this.f257b, itemM78a);
            } else {
                char cCharAt = str3.charAt(0);
                int i4 = -2;
                switch (i) {
                    case 178:
                        i2 = ((cCharAt == 'D' || cCharAt == 'J') ? 2 : 1) + this.f247Q;
                        break;
                    case 179:
                        i3 = this.f247Q;
                        if (cCharAt != 'D' && cCharAt != 'J') {
                            i4 = -1;
                        }
                        i2 = i3 + i4;
                        break;
                    case 180:
                        i2 = this.f247Q + ((cCharAt == 'D' || cCharAt == 'J') ? 1 : 0);
                        break;
                    default:
                        i3 = this.f247Q;
                        if (cCharAt == 'D' || cCharAt == 'J') {
                            i4 = -3;
                        }
                        i2 = i3 + i4;
                        break;
                }
                if (i2 > this.f248R) {
                    this.f248R = i2;
                }
                this.f247Q = i2;
            }
        }
        this.f273r.m42b(i, itemM78a.f209a);
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public void visitFrame(int i, int i2, Object[] objArr, int i3, Object[] objArr2) {
        int i4;
        ByteVector byteVector;
        int i5;
        if (this.f243M == 0) {
            return;
        }
        int i6 = 0;
        if (i == -1) {
            if (this.f279x == null) {
                m131f();
            }
            this.f250T = i2;
            int iM115a = m115a(this.f273r.f108b, i2, i3);
            for (int i7 = 0; i7 < i2; i7++) {
                Object obj = objArr[i7];
                if (obj instanceof String) {
                    this.f280z[iM115a] = 24117248 | this.f257b.m80c((String) obj);
                    iM115a++;
                } else {
                    boolean z = obj instanceof Integer;
                    int[] iArr = this.f280z;
                    if (z) {
                        iArr[iM115a] = ((Integer) obj).intValue();
                        iM115a++;
                    } else {
                        iArr[iM115a] = this.f257b.m68a("", ((Label) obj).f220c) | 25165824;
                        iM115a++;
                    }
                }
            }
            while (i6 < i3) {
                Object obj2 = objArr2[i6];
                if (obj2 instanceof String) {
                    this.f280z[iM115a] = this.f257b.m80c((String) obj2) | 24117248;
                    iM115a++;
                } else {
                    boolean z2 = obj2 instanceof Integer;
                    int[] iArr2 = this.f280z;
                    if (z2) {
                        i5 = iM115a + 1;
                        iArr2[iM115a] = ((Integer) obj2).intValue();
                    } else {
                        i5 = iM115a + 1;
                        iArr2[iM115a] = this.f257b.m68a("", ((Label) obj2).f220c) | 25165824;
                    }
                    iM115a = i5;
                }
                i6++;
            }
            m125b();
        } else {
            if (this.f277v == null) {
                this.f277v = new ByteVector();
                i4 = this.f273r.f108b;
            } else {
                i4 = (this.f273r.f108b - this.f278w) - 1;
                if (i4 < 0) {
                    if (i == 3) {
                        return;
                    }
                    C3466.m5901();
                    return;
                }
            }
            if (i == 0) {
                this.f250T = i2;
                this.f277v.putByte(com.android.p002dx.p005io.Opcodes.CONST_METHOD_TYPE).putShort(i4).putShort(i2);
                for (int i8 = 0; i8 < i2; i8++) {
                    m121a(objArr[i8]);
                }
                this.f277v.putShort(i3);
                while (i6 < i3) {
                    m121a(objArr2[i6]);
                    i6++;
                }
            } else if (i != 1) {
                int i9 = com.android.p002dx.p005io.Opcodes.INVOKE_POLYMORPHIC_RANGE;
                if (i == 2) {
                    this.f250T -= i2;
                    byteVector = this.f277v;
                    i9 = com.android.p002dx.p005io.Opcodes.INVOKE_POLYMORPHIC_RANGE - i2;
                } else if (i == 3) {
                    byteVector = this.f277v;
                    if (i4 < 64) {
                        byteVector.putByte(i4);
                    }
                } else if (i == 4) {
                    ByteVector byteVector2 = this.f277v;
                    if (i4 < 64) {
                        byteVector2.putByte(i4 + 64);
                    } else {
                        byteVector2.putByte(247).putShort(i4);
                    }
                    m121a(objArr2[0]);
                }
                byteVector.putByte(i9).putShort(i4);
            } else {
                this.f250T += i2;
                this.f277v.putByte(i2 + com.android.p002dx.p005io.Opcodes.INVOKE_POLYMORPHIC_RANGE).putShort(i4);
                while (i6 < i2) {
                    m121a(objArr[i6]);
                    i6++;
                }
            }
            this.f278w = this.f273r.f108b;
            this.f276u++;
        }
        this.f274s = Math.max(this.f274s, i3);
        this.f275t = Math.max(this.f275t, this.f250T);
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public void visitIincInsn(int i, int i2) {
        int i3;
        this.f255Y = this.f273r.f108b;
        Label label = this.f246P;
        if (label != null && this.f243M == 0) {
            label.f225h.m95a(132, i, (ClassWriter) null, (Item) null);
        }
        if (this.f243M != 2 && (i3 = i + 1) > this.f275t) {
            this.f275t = i3;
        }
        if (i > 255 || i2 > 127 || i2 < -128) {
            this.f273r.putByte(196).m42b(132, i).putShort(i2);
        } else {
            this.f273r.putByte(132).m41a(i, i2);
        }
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public void visitInsn(int i) {
        ByteVector byteVector = this.f273r;
        this.f255Y = byteVector.f108b;
        byteVector.putByte(i);
        Label label = this.f246P;
        if (label != null) {
            if (this.f243M == 0) {
                label.f225h.m95a(i, 0, (ClassWriter) null, (Item) null);
            } else {
                int i2 = this.f247Q + Frame.f189a[i];
                if (i2 > this.f248R) {
                    this.f248R = i2;
                }
                this.f247Q = i2;
            }
            if ((i < 172 || i > 177) && i != 191) {
                return;
            }
            m130e();
        }
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public AnnotationVisitor visitInsnAnnotation(int i, TypePath typePath, String str, boolean z) {
        ByteVector byteVector = new ByteVector();
        AnnotationWriter.m33a((i & (-16776961)) | (this.f255Y << 8), typePath, byteVector);
        byteVector.putShort(this.f257b.newUTF8(str)).putShort(0);
        AnnotationWriter annotationWriter = new AnnotationWriter(this.f257b, true, byteVector, byteVector, byteVector.f108b - 2);
        if (z) {
            annotationWriter.f103g = this.f253W;
            this.f253W = annotationWriter;
            return annotationWriter;
        }
        annotationWriter.f103g = this.f254X;
        this.f254X = annotationWriter;
        return annotationWriter;
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public void visitIntInsn(int i, int i2) {
        this.f255Y = this.f273r.f108b;
        Label label = this.f246P;
        if (label != null) {
            if (this.f243M == 0) {
                label.f225h.m95a(i, i2, (ClassWriter) null, (Item) null);
            } else if (i != 188) {
                int i3 = this.f247Q + 1;
                if (i3 > this.f248R) {
                    this.f248R = i3;
                }
                this.f247Q = i3;
            }
        }
        ByteVector byteVector = this.f273r;
        if (i == 17) {
            byteVector.m42b(i, i2);
        } else {
            byteVector.m41a(i, i2);
        }
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public void visitInvokeDynamicInsn(String str, String str2, Handle handle, Object... objArr) {
        this.f255Y = this.f273r.f108b;
        Item itemM77a = this.f257b.m77a(str, str2, handle, objArr);
        int argumentsAndReturnSizes = itemM77a.f211c;
        Label label = this.f246P;
        if (label != null) {
            if (this.f243M == 0) {
                label.f225h.m95a(186, 0, this.f257b, itemM77a);
            } else {
                if (argumentsAndReturnSizes == 0) {
                    argumentsAndReturnSizes = Type.getArgumentsAndReturnSizes(str2);
                    itemM77a.f211c = argumentsAndReturnSizes;
                }
                int i = (this.f247Q - (argumentsAndReturnSizes >> 2)) + (argumentsAndReturnSizes & 3) + 1;
                if (i > this.f248R) {
                    this.f248R = i;
                }
                this.f247Q = i;
            }
        }
        this.f273r.m42b(186, itemM77a.f209a);
        this.f273r.putShort(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    @Override // com.esotericsoftware.asm.MethodVisitor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void visitJumpInsn(int i, Label label) {
        this.f255Y = this.f273r.f108b;
        Label label2 = this.f246P;
        Label label3 = null;
        if (label2 != null) {
            if (this.f243M == 0) {
                label2.f225h.m95a(i, 0, (ClassWriter) null, (Item) null);
                label.m108a().f218a |= 16;
                m119a(0, label);
                if (i != 167) {
                    label3 = new Label();
                }
            } else if (i == 168) {
                int i2 = label.f218a;
                if ((i2 & 512) == 0) {
                    label.f218a = i2 | 512;
                    this.f242L++;
                }
                label2.f218a |= 128;
                m119a(this.f247Q + 1, label);
                label3 = new Label();
            } else {
                int i3 = this.f247Q + Frame.f189a[i];
                this.f247Q = i3;
                m119a(i3, label);
            }
        }
        if ((label.f218a & 2) != 0) {
            int i4 = label.f220c;
            ByteVector byteVector = this.f273r;
            if (i4 - byteVector.f108b < -32768) {
                int i5 = 200;
                if (i == 167) {
                    byteVector.putByte(i5);
                    ByteVector byteVector2 = this.f273r;
                    label.m110a(this, byteVector2, byteVector2.f108b - 1, true);
                } else if (i == 168) {
                    i5 = 201;
                    byteVector.putByte(i5);
                    ByteVector byteVector22 = this.f273r;
                    label.m110a(this, byteVector22, byteVector22.f108b - 1, true);
                } else {
                    if (label3 != null) {
                        label3.f218a |= 16;
                    }
                    byteVector.putByte(i <= 166 ? ((i + 1) ^ 1) - 1 : i ^ 1);
                    this.f273r.putShort(8);
                    this.f273r.putByte(200);
                    ByteVector byteVector222 = this.f273r;
                    label.m110a(this, byteVector222, byteVector222.f108b - 1, true);
                }
            } else {
                this.f273r.putByte(i);
                ByteVector byteVector3 = this.f273r;
                label.m110a(this, byteVector3, byteVector3.f108b - 1, false);
            }
        }
        if (this.f246P != null) {
            if (label3 != null) {
                visitLabel(label3);
            }
            if (i == 167) {
                m130e();
            }
        }
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public void visitLabel(Label label) {
        boolean z = this.f241K;
        ByteVector byteVector = this.f273r;
        this.f241K = z | label.m113a(this, byteVector.f108b, byteVector.f107a);
        int i = label.f218a;
        if ((i & 1) != 0) {
            return;
        }
        int i2 = this.f243M;
        if (i2 != 0) {
            if (i2 == 1) {
                Label label2 = this.f246P;
                if (label2 != null) {
                    label2.f224g = this.f248R;
                    m119a(this.f247Q, label);
                }
                this.f246P = label;
                this.f247Q = 0;
                this.f248R = 0;
                Label label3 = this.f245O;
                if (label3 != null) {
                    label3.f226i = label;
                }
                this.f245O = label;
                return;
            }
            return;
        }
        Label label4 = this.f246P;
        if (label4 != null) {
            if (label.f220c == label4.f220c) {
                label4.f218a |= i & 16;
                label.f225h = label4.f225h;
                return;
            }
            m119a(0, label);
        }
        this.f246P = label;
        if (label.f225h == null) {
            Frame frame = new Frame();
            label.f225h = frame;
            frame.f190b = label;
        }
        Label label5 = this.f245O;
        if (label5 != null) {
            if (label.f220c == label5.f220c) {
                label5.f218a |= label.f218a & 16;
                label.f225h = label5.f225h;
                this.f246P = label5;
                return;
            }
            label5.f226i = label;
        }
        this.f245O = label;
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public void visitLdcInsn(Object obj) {
        ByteVector byteVector;
        int i;
        this.f255Y = this.f273r.f108b;
        Item itemM74a = this.f257b.m74a(obj);
        Label label = this.f246P;
        if (label != null) {
            if (this.f243M == 0) {
                label.f225h.m95a(18, 0, this.f257b, itemM74a);
            } else {
                int i2 = itemM74a.f210b;
                int i3 = (i2 == 5 || i2 == 6) ? this.f247Q + 2 : this.f247Q + 1;
                if (i3 > this.f248R) {
                    this.f248R = i3;
                }
                this.f247Q = i3;
            }
        }
        int i4 = itemM74a.f209a;
        int i5 = itemM74a.f210b;
        if (i5 == 5 || i5 == 6) {
            byteVector = this.f273r;
            i = 20;
        } else {
            byteVector = this.f273r;
            if (i4 < 256) {
                byteVector.m41a(18, i4);
                return;
            }
            i = 19;
        }
        byteVector.m42b(i, i4);
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public void visitLineNumber(int i, Label label) {
        if (this.f239I == null) {
            this.f239I = new ByteVector();
        }
        this.f238H++;
        this.f239I.putShort(label.f220c);
        this.f239I.putShort(i);
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public void visitLocalVariable(String str, String str2, String str3, Label label, Label label2, int i) {
        if (str3 != null) {
            if (this.f237G == null) {
                this.f237G = new ByteVector();
            }
            this.f236F++;
            this.f237G.putShort(label.f220c).putShort(label2.f220c - label.f220c).putShort(this.f257b.newUTF8(str)).putShort(this.f257b.newUTF8(str3)).putShort(i);
        }
        if (this.f235E == null) {
            this.f235E = new ByteVector();
        }
        this.f234D++;
        this.f235E.putShort(label.f220c).putShort(label2.f220c - label.f220c).putShort(this.f257b.newUTF8(str)).putShort(this.f257b.newUTF8(str2)).putShort(i);
        if (this.f243M != 2) {
            char cCharAt = str2.charAt(0);
            int i2 = i + ((cCharAt == 'J' || cCharAt == 'D') ? 2 : 1);
            if (i2 > this.f275t) {
                this.f275t = i2;
            }
        }
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public AnnotationVisitor visitLocalVariableAnnotation(int i, TypePath typePath, Label[] labelArr, Label[] labelArr2, int[] iArr, String str, boolean z) {
        ByteVector byteVector = new ByteVector();
        byteVector.putByte(i >>> 24).putShort(labelArr.length);
        for (int i2 = 0; i2 < labelArr.length; i2++) {
            byteVector.putShort(labelArr[i2].f220c).putShort(labelArr2[i2].f220c - labelArr[i2].f220c).putShort(iArr[i2]);
        }
        if (typePath == null) {
            byteVector.putByte(0);
        } else {
            byte[] bArr = typePath.f285a;
            int i3 = typePath.f286b;
            byteVector.putByteArray(bArr, i3, (bArr[i3] * 2) + 1);
        }
        byteVector.putShort(this.f257b.newUTF8(str)).putShort(0);
        AnnotationWriter annotationWriter = new AnnotationWriter(this.f257b, true, byteVector, byteVector, byteVector.f108b - 2);
        if (z) {
            annotationWriter.f103g = this.f253W;
            this.f253W = annotationWriter;
            return annotationWriter;
        }
        annotationWriter.f103g = this.f254X;
        this.f254X = annotationWriter;
        return annotationWriter;
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public void visitLookupSwitchInsn(Label label, int[] iArr, Label[] labelArr) {
        ByteVector byteVector = this.f273r;
        int i = byteVector.f108b;
        this.f255Y = i;
        byteVector.putByte(171);
        ByteVector byteVector2 = this.f273r;
        byteVector2.putByteArray(null, 0, (4 - (byteVector2.f108b % 4)) % 4);
        label.m110a(this, this.f273r, i, true);
        this.f273r.putInt(labelArr.length);
        for (int i2 = 0; i2 < labelArr.length; i2++) {
            this.f273r.putInt(iArr[i2]);
            labelArr[i2].m110a(this, this.f273r, i, true);
        }
        m120a(label, labelArr);
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
        this.f255Y = this.f273r.f108b;
        Item itemM79a = this.f257b.m79a(str, str2, str3, z);
        int argumentsAndReturnSizes = itemM79a.f211c;
        Label label = this.f246P;
        if (label != null) {
            if (this.f243M == 0) {
                label.f225h.m95a(i, 0, this.f257b, itemM79a);
            } else {
                if (argumentsAndReturnSizes == 0) {
                    argumentsAndReturnSizes = Type.getArgumentsAndReturnSizes(str3);
                    itemM79a.f211c = argumentsAndReturnSizes;
                }
                int i2 = this.f247Q;
                int i3 = i == 184 ? (i2 - (argumentsAndReturnSizes >> 2)) + (argumentsAndReturnSizes & 3) + 1 : (i2 - (argumentsAndReturnSizes >> 2)) + (argumentsAndReturnSizes & 3);
                if (i3 > this.f248R) {
                    this.f248R = i3;
                }
                this.f247Q = i3;
            }
        }
        if (i != 185) {
            this.f273r.m42b(i, itemM79a.f209a);
            return;
        }
        if (argumentsAndReturnSizes == 0) {
            argumentsAndReturnSizes = Type.getArgumentsAndReturnSizes(str3);
            itemM79a.f211c = argumentsAndReturnSizes;
        }
        this.f273r.m42b(185, itemM79a.f209a).m41a(argumentsAndReturnSizes >> 2, 0);
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public void visitMultiANewArrayInsn(String str, int i) {
        this.f255Y = this.f273r.f108b;
        Item itemM75a = this.f257b.m75a(str);
        Label label = this.f246P;
        if (label != null) {
            if (this.f243M == 0) {
                label.f225h.m95a(197, i, this.f257b, itemM75a);
            } else {
                this.f247Q = (1 - i) + this.f247Q;
            }
        }
        this.f273r.m42b(197, itemM75a.f209a).putByte(i);
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public void visitParameter(String str, int i) {
        if (this.f230$ == null) {
            this.f230$ = new ByteVector();
        }
        this.f256Z++;
        this.f230$.putShort(str == null ? 0 : this.f257b.newUTF8(str)).putShort(i);
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public AnnotationVisitor visitParameterAnnotation(int i, String str, boolean z) {
        ByteVector byteVector = new ByteVector();
        if ("Ljava/lang/Synthetic;".equals(str)) {
            this.f249S = Math.max(this.f249S, i + 1);
            return new AnnotationWriter(this.f257b, false, byteVector, null, 0);
        }
        byteVector.putShort(this.f257b.newUTF8(str)).putShort(0);
        AnnotationWriter annotationWriter = new AnnotationWriter(this.f257b, true, byteVector, byteVector, 2);
        if (z) {
            if (this.f270o == null) {
                this.f270o = new AnnotationWriter[Type.getArgumentTypes(this.f261f).length];
            }
            AnnotationWriter[] annotationWriterArr = this.f270o;
            annotationWriter.f103g = annotationWriterArr[i];
            annotationWriterArr[i] = annotationWriter;
            return annotationWriter;
        }
        if (this.f271p == null) {
            this.f271p = new AnnotationWriter[Type.getArgumentTypes(this.f261f).length];
        }
        AnnotationWriter[] annotationWriterArr2 = this.f271p;
        annotationWriter.f103g = annotationWriterArr2[i];
        annotationWriterArr2[i] = annotationWriter;
        return annotationWriter;
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public void visitTableSwitchInsn(int i, int i2, Label label, Label... labelArr) {
        ByteVector byteVector = this.f273r;
        int i3 = byteVector.f108b;
        this.f255Y = i3;
        byteVector.putByte(170);
        ByteVector byteVector2 = this.f273r;
        byteVector2.putByteArray(null, 0, (4 - (byteVector2.f108b % 4)) % 4);
        label.m110a(this, this.f273r, i3, true);
        this.f273r.putInt(i).putInt(i2);
        for (Label label2 : labelArr) {
            label2.m110a(this, this.f273r, i3, true);
        }
        m120a(label, labelArr);
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public AnnotationVisitor visitTryCatchAnnotation(int i, TypePath typePath, String str, boolean z) {
        ByteVector byteVector = new ByteVector();
        AnnotationWriter.m33a(i, typePath, byteVector);
        byteVector.putShort(this.f257b.newUTF8(str)).putShort(0);
        AnnotationWriter annotationWriter = new AnnotationWriter(this.f257b, true, byteVector, byteVector, byteVector.f108b - 2);
        if (z) {
            annotationWriter.f103g = this.f253W;
            this.f253W = annotationWriter;
            return annotationWriter;
        }
        annotationWriter.f103g = this.f254X;
        this.f254X = annotationWriter;
        return annotationWriter;
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public void visitTryCatchBlock(Label label, Label label2, Label label3, String str) {
        this.f231A++;
        Handler handler = new Handler();
        handler.f203a = label;
        handler.f204b = label2;
        handler.f205c = label3;
        handler.f206d = str;
        handler.f207e = str != null ? this.f257b.newClass(str) : 0;
        Handler handler2 = this.f233C;
        if (handler2 == null) {
            this.f232B = handler;
        } else {
            handler2.f208f = handler;
        }
        this.f233C = handler;
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public AnnotationVisitor visitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        ByteVector byteVector = new ByteVector();
        AnnotationWriter.m33a(i, typePath, byteVector);
        byteVector.putShort(this.f257b.newUTF8(str)).putShort(0);
        AnnotationWriter annotationWriter = new AnnotationWriter(this.f257b, true, byteVector, byteVector, byteVector.f108b - 2);
        if (z) {
            annotationWriter.f103g = this.f251U;
            this.f251U = annotationWriter;
            return annotationWriter;
        }
        annotationWriter.f103g = this.f252V;
        this.f252V = annotationWriter;
        return annotationWriter;
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public void visitTypeInsn(int i, String str) {
        this.f255Y = this.f273r.f108b;
        Item itemM75a = this.f257b.m75a(str);
        Label label = this.f246P;
        if (label != null) {
            if (this.f243M == 0) {
                label.f225h.m95a(i, this.f273r.f108b, this.f257b, itemM75a);
            } else if (i == 187) {
                int i2 = this.f247Q + 1;
                if (i2 > this.f248R) {
                    this.f248R = i2;
                }
                this.f247Q = i2;
            }
        }
        this.f273r.m42b(i, itemM75a.f209a);
    }

    @Override // com.esotericsoftware.asm.MethodVisitor
    public void visitVarInsn(int i, int i2) {
        this.f255Y = this.f273r.f108b;
        Label label = this.f246P;
        if (label != null) {
            if (this.f243M == 0) {
                label.f225h.m95a(i, i2, (ClassWriter) null, (Item) null);
            } else if (i == 169) {
                label.f218a |= 256;
                label.f223f = this.f247Q;
                m130e();
            } else {
                int i3 = this.f247Q + Frame.f189a[i];
                if (i3 > this.f248R) {
                    this.f248R = i3;
                }
                this.f247Q = i3;
            }
        }
        if (this.f243M != 2) {
            int i4 = (i == 22 || i == 24 || i == 55 || i == 57) ? i2 + 2 : i2 + 1;
            if (i4 > this.f275t) {
                this.f275t = i4;
            }
        }
        if (i2 >= 4 || i == 169) {
            ByteVector byteVector = this.f273r;
            if (i2 >= 256) {
                byteVector.putByte(196).m42b(i, i2);
            } else {
                byteVector.m41a(i, i2);
            }
        } else {
            this.f273r.putByte((i < 54 ? ((i - 21) << 2) + 26 : ((i - 54) << 2) + 59) + i2);
        }
        if (i < 54 || this.f243M != 0 || this.f231A <= 0) {
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

    /* JADX INFO: renamed from: b */
    private void m125b() {
        if (this.f279x != null) {
            if (this.f277v == null) {
                this.f277v = new ByteVector();
            }
            m128c();
            this.f276u++;
        }
        this.f279x = this.f280z;
        this.f280z = null;
    }

    /* JADX INFO: renamed from: b */
    public static short m124b(byte[] bArr, int i) {
        return (short) ((bArr[i + 1] & DefaultClassResolver.NAME) | ((bArr[i] & DefaultClassResolver.NAME) << 8));
    }

    /* JADX INFO: renamed from: c */
    public static int m127c(byte[] bArr, int i) {
        return (bArr[i + 1] & DefaultClassResolver.NAME) | ((bArr[i] & DefaultClassResolver.NAME) << 8);
    }

    /* JADX INFO: renamed from: a */
    private int m115a(int i, int i2, int i3) {
        int i4 = i2 + 3 + i3;
        int[] iArr = this.f280z;
        if (iArr == null || iArr.length < i4) {
            this.f280z = new int[i4];
        }
        int[] iArr2 = this.f280z;
        iArr2[0] = i;
        iArr2[1] = i2;
        iArr2[2] = i3;
        return 3;
    }

    /* JADX INFO: renamed from: a */
    public static int m116a(byte[] bArr, int i) {
        return (bArr[i + 3] & DefaultClassResolver.NAME) | ((bArr[i] & DefaultClassResolver.NAME) << 24) | ((bArr[i + 1] & DefaultClassResolver.NAME) << 16) | ((bArr[i + 2] & DefaultClassResolver.NAME) << 8);
    }

    /* JADX INFO: renamed from: a */
    public static int m117a(int[] iArr, int[] iArr2, int i, int i2) {
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

    /* JADX INFO: renamed from: a */
    private void m118a(int i, int i2) {
        char c;
        ByteVector byteVectorPutByte;
        int iNewClass;
        while (i < i2) {
            int i3 = this.f280z[i];
            int i4 = (-268435456) & i3;
            if (i4 == 0) {
                int i5 = i3 & 1048575;
                int i6 = i3 & 267386880;
                if (i6 != 24117248) {
                    ByteVector byteVector = this.f277v;
                    if (i6 != 25165824) {
                        byteVector.putByte(i5);
                        i++;
                    } else {
                        byteVectorPutByte = byteVector.putByte(8);
                        iNewClass = this.f257b.f121H[i5].f211c;
                    }
                } else {
                    byteVectorPutByte = this.f277v.putByte(7);
                    ClassWriter classWriter = this.f257b;
                    iNewClass = classWriter.newClass(classWriter.f121H[i5].f213g);
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
                            stringBuffer.append(this.f257b.f121H[i3 & 1048575].f213g);
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
                        byteVectorPutByte = this.f277v.putByte(7);
                        iNewClass = this.f257b.newClass(stringBuffer.toString());
                    }
                }
            }
            byteVectorPutByte.putShort(iNewClass);
            i++;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m119a(int i, Label label) {
        Edge edge = new Edge();
        edge.f174a = i;
        edge.f175b = label;
        Label label2 = this.f246P;
        edge.f176c = label2.f227j;
        label2.f227j = edge;
    }

    /* JADX INFO: renamed from: a */
    public final int m132a() {
        int iM35a;
        if (this.f263h != 0) {
            return this.f264i + 6;
        }
        int i = this.f273r.f108b;
        if (i <= 0) {
            iM35a = 8;
        } else {
            if (i > 65535) {
                C3466.m5899("Method code too large!");
                return 0;
            }
            this.f257b.newUTF8(AttCode.ATTRIBUTE_NAME);
            iM35a = AbstractC7012.m12133(this.f231A, 8, this.f273r.f108b + 18, 8);
            if (this.f235E != null) {
                this.f257b.newUTF8(AttLocalVariableTable.ATTRIBUTE_NAME);
                iM35a += this.f235E.f108b + 8;
            }
            if (this.f237G != null) {
                this.f257b.newUTF8(AttLocalVariableTypeTable.ATTRIBUTE_NAME);
                iM35a += this.f237G.f108b + 8;
            }
            if (this.f239I != null) {
                this.f257b.newUTF8(AttLineNumberTable.ATTRIBUTE_NAME);
                iM35a += this.f239I.f108b + 8;
            }
            if (this.f277v != null) {
                ClassWriter classWriter = this.f257b;
                classWriter.newUTF8((classWriter.f129b & com.android.p002dx.p005io.Opcodes.MAX_VALUE) >= 50 ? "StackMapTable" : "StackMap");
                iM35a += this.f277v.f108b + 8;
            }
            if (this.f253W != null) {
                this.f257b.newUTF8("RuntimeVisibleTypeAnnotations");
                iM35a += this.f253W.m35a() + 8;
            }
            if (this.f254X != null) {
                this.f257b.newUTF8("RuntimeInvisibleTypeAnnotations");
                iM35a += this.f254X.m35a() + 8;
            }
            Attribute attribute = this.f240J;
            if (attribute != null) {
                ClassWriter classWriter2 = this.f257b;
                ByteVector byteVector = this.f273r;
                iM35a += attribute.m38a(classWriter2, byteVector.f107a, byteVector.f108b, this.f274s, this.f275t);
            }
        }
        if (this.f265j > 0) {
            this.f257b.newUTF8(AttExceptions.ATTRIBUTE_NAME);
            iM35a = AbstractC7012.m12133(this.f265j, 2, 8, iM35a);
        }
        int i2 = this.f258c;
        if ((i2 & 4096) != 0) {
            ClassWriter classWriter3 = this.f257b;
            if ((65535 & classWriter3.f129b) < 49 || (262144 & i2) != 0) {
                classWriter3.newUTF8(AttSynthetic.ATTRIBUTE_NAME);
                iM35a += 6;
            }
        }
        if ((this.f258c & 131072) != 0) {
            this.f257b.newUTF8(AttDeprecated.ATTRIBUTE_NAME);
            iM35a += 6;
        }
        if (this.f262g != null) {
            this.f257b.newUTF8(AttSignature.ATTRIBUTE_NAME);
            this.f257b.newUTF8(this.f262g);
            iM35a += 8;
        }
        if (this.f230$ != null) {
            this.f257b.newUTF8("MethodParameters");
            iM35a += this.f230$.f108b + 7;
        }
        if (this.f267l != null) {
            this.f257b.newUTF8(AttAnnotationDefault.ATTRIBUTE_NAME);
            iM35a += this.f267l.f108b + 6;
        }
        if (this.f268m != null) {
            this.f257b.newUTF8(AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME);
            iM35a += this.f268m.m35a() + 8;
        }
        if (this.f269n != null) {
            this.f257b.newUTF8(AttRuntimeInvisibleAnnotations.ATTRIBUTE_NAME);
            iM35a += this.f269n.m35a() + 8;
        }
        if (this.f251U != null) {
            this.f257b.newUTF8("RuntimeVisibleTypeAnnotations");
            iM35a += this.f251U.m35a() + 8;
        }
        if (this.f252V != null) {
            this.f257b.newUTF8("RuntimeInvisibleTypeAnnotations");
            iM35a += this.f252V.m35a() + 8;
        }
        if (this.f270o != null) {
            this.f257b.newUTF8(AttRuntimeVisibleParameterAnnotations.ATTRIBUTE_NAME);
            AnnotationWriter[] annotationWriterArr = this.f270o;
            int length = ((annotationWriterArr.length - this.f249S) * 2) + 7 + iM35a;
            for (int length2 = annotationWriterArr.length - 1; length2 >= this.f249S; length2--) {
                AnnotationWriter annotationWriter = this.f270o[length2];
                length += annotationWriter == null ? 0 : annotationWriter.m35a();
            }
            iM35a = length;
        }
        if (this.f271p != null) {
            this.f257b.newUTF8(AttRuntimeInvisibleParameterAnnotations.ATTRIBUTE_NAME);
            AnnotationWriter[] annotationWriterArr2 = this.f271p;
            int length3 = ((annotationWriterArr2.length - this.f249S) * 2) + 7 + iM35a;
            for (int length4 = annotationWriterArr2.length - 1; length4 >= this.f249S; length4--) {
                AnnotationWriter annotationWriter2 = this.f271p[length4];
                length3 += annotationWriter2 == null ? 0 : annotationWriter2.m35a();
            }
            iM35a = length3;
        }
        Attribute attribute2 = this.f272q;
        return attribute2 != null ? iM35a + attribute2.m38a(this.f257b, null, 0, -1, -1) : iM35a;
    }

    /* JADX INFO: renamed from: a */
    private void m120a(Label label, Label[] labelArr) {
        Label label2 = this.f246P;
        if (label2 != null) {
            if (this.f243M == 0) {
                label2.f225h.m95a(171, 0, (ClassWriter) null, (Item) null);
                m119a(0, label);
                label.m108a().f218a |= 16;
                for (int i = 0; i < labelArr.length; i++) {
                    m119a(0, labelArr[i]);
                    labelArr[i].m108a().f218a |= 16;
                }
            } else {
                int i2 = this.f247Q - 1;
                this.f247Q = i2;
                m119a(i2, label);
                for (Label label3 : labelArr) {
                    m119a(this.f247Q, label3);
                }
            }
            m130e();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m121a(Object obj) {
        if (obj instanceof String) {
            this.f277v.putByte(7).putShort(this.f257b.newClass((String) obj));
            return;
        }
        boolean z = obj instanceof Integer;
        ByteVector byteVector = this.f277v;
        if (z) {
            byteVector.putByte(((Integer) obj).intValue());
        } else {
            byteVector.putByte(8).putShort(((Label) obj).f220c);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m122a(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >>> 8);
        bArr[i + 1] = (byte) i2;
    }

    /* JADX INFO: renamed from: a */
    public static void m123a(int[] iArr, int[] iArr2, Label label) {
        if ((label.f218a & 4) == 0) {
            label.f220c = m117a(iArr, iArr2, 0, label.f220c);
            label.f218a |= 4;
        }
    }
}
