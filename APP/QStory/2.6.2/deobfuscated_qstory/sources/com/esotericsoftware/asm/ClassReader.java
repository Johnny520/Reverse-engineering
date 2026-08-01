package com.esotericsoftware.asm;

import com.android.dx.cf.attrib.AttBootstrapMethods;
import com.android.dx.cf.attrib.AttConstantValue;
import com.android.dx.cf.attrib.AttDeprecated;
import com.android.dx.cf.attrib.AttEnclosingMethod;
import com.android.dx.cf.attrib.AttInnerClasses;
import com.android.dx.cf.attrib.AttLineNumberTable;
import com.android.dx.cf.attrib.AttLocalVariableTable;
import com.android.dx.cf.attrib.AttLocalVariableTypeTable;
import com.android.dx.cf.attrib.AttRuntimeInvisibleAnnotations;
import com.android.dx.cf.attrib.AttRuntimeVisibleAnnotations;
import com.android.dx.cf.attrib.AttSignature;
import com.android.dx.cf.attrib.AttSourceDebugExtension;
import com.android.dx.cf.attrib.AttSourceFile;
import com.android.dx.cf.attrib.AttSynthetic;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.InputStream;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.dynamic.ClassFileLocator;
import net.bytebuddy.pool.TypePool;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: loaded from: classes.dex */
public class ClassReader {
    public static final int EXPAND_FRAMES = 8;
    public static final int SKIP_CODE = 1;
    public static final int SKIP_DEBUG = 2;
    public static final int SKIP_FRAMES = 4;
    private final int[] a;
    public final byte[] b;
    private final String[] c;
    private final int d;
    public final int header;

    public ClassReader(byte[] bArr, int i, int i2) {
        this.b = bArr;
        if (readShort(i + 6) > 52) {
            C5919.m11245();
            throw null;
        }
        int[] iArr = new int[readUnsignedShort(i + 8)];
        this.a = iArr;
        int length = iArr.length;
        this.c = new String[length];
        int i3 = i + 10;
        int i4 = 0;
        int i5 = 1;
        while (i5 < length) {
            int i6 = i3 + 1;
            this.a[i5] = i6;
            byte b = bArr[i3];
            int unsignedShort = 3;
            if (b == 1) {
                unsignedShort = 3 + readUnsignedShort(i6);
                if (unsignedShort > i4) {
                    i4 = unsignedShort;
                }
            } else if (b == 15) {
                unsignedShort = 4;
            } else if (b != 18 && b != 3 && b != 4) {
                if (b != 5 && b != 6) {
                    switch (b) {
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                            unsignedShort = 5;
                            break;
                    }
                } else {
                    i5++;
                    unsignedShort = 9;
                }
            } else {
                unsignedShort = 5;
            }
            i3 += unsignedShort;
            i5++;
        }
        this.d = i4;
        this.header = i3;
    }

    private void a(MethodVisitor methodVisitor, Context context, int i) {
        boolean z;
        Context context2;
        int[] iArr;
        int i2;
        int[] iArr2;
        int i3;
        String str;
        Context context3;
        int i4;
        int i5;
        int i6;
        int i7;
        int unsignedShort;
        int[] iArr3;
        int i8;
        int i9;
        int i10;
        Context context4;
        int i11;
        int i12;
        int i13;
        boolean z2;
        Label[] labelArr;
        int i14;
        MethodVisitor methodVisitor2;
        int i15;
        int i16;
        int i17;
        int i18;
        char[] cArr;
        int i19;
        int unsignedShort2;
        int[] iArr4;
        boolean z3;
        ClassReader classReader;
        Label[] labelArr2;
        byte[] bArr;
        boolean z4;
        ClassReader classReader2;
        Label[] labelArr3;
        int i20;
        String str2;
        byte[] bArr2;
        int[] iArr5;
        boolean z5;
        boolean z6;
        int i21;
        boolean z7;
        boolean z8;
        int i22;
        int i23;
        ClassReader classReader3 = this;
        MethodVisitor methodVisitor3 = methodVisitor;
        int i24 = i;
        byte[] bArr3 = classReader3.b;
        char[] cArr2 = context.c;
        int unsignedShort3 = classReader3.readUnsignedShort(i24);
        int unsignedShort4 = classReader3.readUnsignedShort(i24 + 2);
        int i25 = classReader3.readInt(i24 + 4);
        int i26 = i24 + 8;
        int i27 = i26 + i25;
        Label[] labelArr4 = new Label[i25 + 2];
        context.h = labelArr4;
        classReader3.readLabel(i25 + 1, labelArr4);
        int i28 = i26;
        while (i28 < i27) {
            int i29 = i28 - i26;
            switch (ClassWriter.a[bArr3[i28] & DefaultClassResolver.NAME]) {
                case 0:
                case 4:
                    i28++;
                    break;
                case 1:
                case 3:
                case 11:
                    i28 += 2;
                    break;
                case 2:
                case 5:
                case 6:
                case 12:
                case 13:
                    i28 += 3;
                    break;
                case 7:
                case 8:
                    i28 += 5;
                    break;
                case 9:
                    classReader3.readLabel(classReader3.readShort(i28 + 1) + i29, labelArr4);
                    i28 += 3;
                    break;
                case 10:
                    classReader3.readLabel(classReader3.readInt(i28 + 1) + i29, labelArr4);
                    i28 += 5;
                    break;
                case 14:
                    int i30 = (i28 + 4) - (i29 & 3);
                    classReader3.readLabel(classReader3.readInt(i30) + i29, labelArr4);
                    for (int i31 = (classReader3.readInt(i30 + 8) - classReader3.readInt(i30 + 4)) + 1; i31 > 0; i31--) {
                        classReader3.readLabel(classReader3.readInt(i30 + 12) + i29, labelArr4);
                        i30 += 4;
                    }
                    i28 = i30 + 12;
                    break;
                case 15:
                    int i32 = (i28 + 4) - (i29 & 3);
                    classReader3.readLabel(classReader3.readInt(i32) + i29, labelArr4);
                    for (int i33 = classReader3.readInt(i32 + 4); i33 > 0; i33--) {
                        classReader3.readLabel(classReader3.readInt(i32 + 12) + i29, labelArr4);
                        i32 += 8;
                    }
                    i28 = i32 + 8;
                    break;
                case 16:
                default:
                    break;
                case 17:
                    i28 = (bArr3[i28 + 1] & DefaultClassResolver.NAME) == 132 ? i28 + 6 : i28 + 4;
                    break;
            }
        }
        boolean z9 = true;
        int unsignedShort5 = classReader3.readUnsignedShort(i28);
        while (unsignedShort5 > 0) {
            int i34 = i28;
            int i35 = unsignedShort5;
            int i36 = i34 + 8;
            methodVisitor3.visitTryCatchBlock(classReader3.readLabel(classReader3.readUnsignedShort(i28 + 2), labelArr4), classReader3.readLabel(classReader3.readUnsignedShort(i28 + 4), labelArr4), classReader3.readLabel(classReader3.readUnsignedShort(i34 + 6), labelArr4), classReader3.readUTF8(classReader3.a[classReader3.readUnsignedShort(i36)], cArr2));
            unsignedShort5 = i35 - 1;
            i28 = i36;
        }
        int i37 = i28 + 2;
        boolean z10 = (context.b & 8) != 0;
        boolean z11 = true;
        int unsignedShort6 = classReader3.readUnsignedShort(i37);
        int i38 = 0;
        int i39 = 0;
        int[] iArr6 = null;
        int i40 = 0;
        int i41 = 0;
        Attribute attribute = null;
        int i42 = 0;
        int unsignedShort7 = -1;
        int unsignedShort8 = -1;
        int i43 = i37;
        int[] iArrA = null;
        while (unsignedShort6 > 0) {
            String utf8 = classReader3.readUTF8(i43 + 2, cArr2);
            if (!AttLocalVariableTable.ATTRIBUTE_NAME.equals(utf8)) {
                iArr4 = iArrA;
                z3 = z10;
                if (AttLocalVariableTypeTable.ATTRIBUTE_NAME.equals(utf8)) {
                    Label[] labelArr5 = labelArr4;
                    classReader = classReader3;
                    labelArr2 = labelArr5;
                    i41 = i43 + 8;
                    bArr = bArr3;
                    iArrA = iArr4;
                    z4 = z3;
                } else if (AttLineNumberTable.ATTRIBUTE_NAME.equals(utf8)) {
                    if ((context.b & 2) == 0) {
                        int unsignedShort9 = classReader3.readUnsignedShort(i43 + 8);
                        int i44 = i43;
                        while (unsignedShort9 > 0) {
                            int unsignedShort10 = classReader3.readUnsignedShort(i44 + 10);
                            if (labelArr4[unsignedShort10] == null) {
                                i21 = unsignedShort9;
                                classReader3.readLabel(unsignedShort10, labelArr4).a |= 1;
                            } else {
                                i21 = unsignedShort9;
                            }
                            Label label = labelArr4[unsignedShort10];
                            while (label.b > 0) {
                                if (label.k == null) {
                                    label.k = new Label();
                                }
                                label = label.k;
                            }
                            label.b = classReader3.readUnsignedShort(i44 + 12);
                            i44 += 4;
                            unsignedShort9 = i21 - 1;
                        }
                    }
                    z8 = false;
                } else if ("RuntimeVisibleTypeAnnotations".equals(utf8)) {
                    boolean z12 = z9;
                    iArrA = classReader3.a(methodVisitor3, context, i43 + 8, z12);
                    unsignedShort7 = (iArrA.length == 0 || classReader3.readByte(iArrA[0]) < 67) ? -1 : classReader3.readUnsignedShort(iArrA[0] + (z12 ? 1 : 0));
                    Label[] labelArr6 = labelArr4;
                    classReader = classReader3;
                    labelArr2 = labelArr6;
                    bArr = bArr3;
                    z4 = z3;
                    z9 = true;
                } else if ("RuntimeInvisibleTypeAnnotations".equals(utf8)) {
                    z6 = false;
                    int[] iArrA2 = classReader3.a(methodVisitor3, context, i43 + 8, false);
                    if (iArrA2.length == 0 || classReader3.readByte(iArrA2[0]) < 67) {
                        z9 = true;
                        unsignedShort8 = -1;
                    } else {
                        z9 = true;
                        unsignedShort8 = classReader3.readUnsignedShort(iArrA2[0] + 1);
                    }
                    Label[] labelArr7 = labelArr4;
                    classReader = classReader3;
                    labelArr2 = labelArr7;
                    iArr6 = iArrA2;
                    bArr = bArr3;
                    z7 = z6;
                    iArrA = iArr4;
                    z4 = z3;
                } else {
                    boolean z13 = false;
                    z9 = true;
                    if ("StackMapTable".equals(utf8)) {
                        z8 = z13;
                        if ((context.b & 4) == 0) {
                            int i45 = classReader3.readInt(i43 + 4);
                            int unsignedShort11 = classReader3.readUnsignedShort(i43 + 8);
                            Label[] labelArr8 = labelArr4;
                            classReader = classReader3;
                            labelArr2 = labelArr8;
                            i38 = i43 + 10;
                            i39 = i45;
                            bArr = bArr3;
                            i42 = unsignedShort11;
                            z7 = z13;
                            iArrA = iArr4;
                            z4 = z3;
                        }
                    } else if ("StackMap".equals(utf8)) {
                        z8 = z13;
                        if ((context.b & 4) == 0) {
                            int i46 = classReader3.readInt(i43 + 4);
                            int unsignedShort12 = classReader3.readUnsignedShort(i43 + 8);
                            Label[] labelArr9 = labelArr4;
                            classReader = classReader3;
                            labelArr2 = labelArr9;
                            i38 = i43 + 10;
                            z11 = false;
                            i39 = i46;
                            bArr = bArr3;
                            i42 = unsignedShort12;
                            iArrA = iArr4;
                            z4 = z3;
                        }
                    } else {
                        int i47 = 0;
                        Attribute attribute2 = attribute;
                        while (true) {
                            Attribute[] attributeArr = context.a;
                            char[] cArr3 = cArr2;
                            if (i47 < attributeArr.length) {
                                if (attributeArr[i47].type.equals(utf8)) {
                                    str2 = utf8;
                                    i20 = i47;
                                    bArr2 = bArr3;
                                    cArr2 = cArr3;
                                    iArr5 = iArr4;
                                    z5 = z3;
                                    Attribute attribute3 = context.a[i47].read(classReader3, i43 + 8, classReader3.readInt(i43 + 4), cArr2, i24, labelArr4);
                                    Label[] labelArr10 = labelArr4;
                                    classReader2 = classReader3;
                                    labelArr3 = labelArr10;
                                    if (attribute3 != null) {
                                        attribute3.a = attribute2;
                                        attribute2 = attribute3;
                                    }
                                } else {
                                    Label[] labelArr11 = labelArr4;
                                    classReader2 = classReader3;
                                    labelArr3 = labelArr11;
                                    i20 = i47;
                                    str2 = utf8;
                                    bArr2 = bArr3;
                                    cArr2 = cArr3;
                                    iArr5 = iArr4;
                                    z5 = z3;
                                }
                                i47 = i20 + 1;
                                ClassReader classReader4 = classReader2;
                                labelArr4 = labelArr3;
                                classReader3 = classReader4;
                                i24 = i;
                                utf8 = str2;
                                bArr3 = bArr2;
                                z3 = z5;
                                iArr4 = iArr5;
                            } else {
                                Label[] labelArr12 = labelArr4;
                                classReader = classReader3;
                                labelArr2 = labelArr12;
                                bArr = bArr3;
                                cArr2 = cArr3;
                                z4 = z3;
                                attribute = attribute2;
                                iArrA = iArr4;
                            }
                        }
                    }
                }
                i43 = classReader.readInt(i43 + 4) + 6 + i43;
                unsignedShort6--;
                ClassReader classReader5 = classReader;
                labelArr4 = labelArr2;
                classReader3 = classReader5;
                i24 = i;
                bArr3 = bArr;
                z10 = z4;
            } else if ((context.b & 2) == 0) {
                int i48 = i43 + 8;
                int unsignedShort13 = classReader3.readUnsignedShort(i48);
                int i49 = i43;
                while (unsignedShort13 > 0) {
                    int[] iArr7 = iArrA;
                    int i50 = i49 + 10;
                    boolean z14 = z10;
                    int unsignedShort14 = classReader3.readUnsignedShort(i50);
                    if (labelArr4[unsignedShort14] == null) {
                        i22 = i50;
                        i23 = unsignedShort14;
                        classReader3.readLabel(unsignedShort14, labelArr4).a |= 1;
                    } else {
                        i22 = i50;
                        i23 = unsignedShort14;
                    }
                    int unsignedShort15 = classReader3.readUnsignedShort(i49 + 12) + i23;
                    if (labelArr4[unsignedShort15] == null) {
                        classReader3.readLabel(unsignedShort15, labelArr4).a |= 1;
                    }
                    unsignedShort13--;
                    i49 = i22;
                    iArrA = iArr7;
                    z10 = z14;
                }
                int[] iArr8 = iArrA;
                Label[] labelArr13 = labelArr4;
                classReader = classReader3;
                labelArr2 = labelArr13;
                z4 = z10;
                i40 = i48;
                bArr = bArr3;
                iArrA = iArr8;
                i43 = classReader.readInt(i43 + 4) + 6 + i43;
                unsignedShort6--;
                ClassReader classReader52 = classReader;
                labelArr4 = labelArr2;
                classReader3 = classReader52;
                i24 = i;
                bArr3 = bArr;
                z10 = z4;
            } else {
                iArr4 = iArrA;
                z3 = z10;
                z8 = false;
            }
            Label[] labelArr14 = labelArr4;
            classReader = classReader3;
            labelArr2 = labelArr14;
            z6 = z8;
            bArr = bArr3;
            z7 = z6;
            iArrA = iArr4;
            z4 = z3;
            i43 = classReader.readInt(i43 + 4) + 6 + i43;
            unsignedShort6--;
            ClassReader classReader522 = classReader;
            labelArr4 = labelArr2;
            classReader3 = classReader522;
            i24 = i;
            bArr3 = bArr;
            z10 = z4;
        }
        Label[] labelArr15 = labelArr4;
        ClassReader classReader6 = classReader3;
        Label[] labelArr16 = labelArr15;
        int[] iArr9 = iArrA;
        boolean z15 = z10;
        byte[] bArr4 = bArr3;
        int i51 = 0;
        if (i38 != 0) {
            context.o = -1;
            context.p = 0;
            context.q = 0;
            context.r = 0;
            context.t = 0;
            context.s = new Object[unsignedShort4];
            context.u = new Object[unsignedShort3];
            z = z15;
            if (z) {
                classReader6.a(context);
            }
            for (int i52 = i38; i52 < (i38 + i39) - 2; i52++) {
                if (bArr4[i52] == 8 && (unsignedShort2 = classReader6.readUnsignedShort(i52 + 1)) >= 0 && unsignedShort2 < i25 && (bArr4[i26 + unsignedShort2] & DefaultClassResolver.NAME) == 187) {
                    classReader6.readLabel(unsignedShort2, labelArr16);
                }
            }
            context2 = context;
        } else {
            z = z15;
            context2 = null;
        }
        int i53 = 0;
        int i54 = 0;
        int i55 = i26;
        while (i55 < i27) {
            int i56 = i55 - i26;
            Label label2 = labelArr16[i56];
            if (label2 != null) {
                context3 = context2;
                label2.k = null;
                methodVisitor3.visitLabel(label2);
                if ((context.b & 2) == 0 && (i19 = label2.b) > 0) {
                    methodVisitor3.visitLineNumber(i19, label2);
                    for (Label label3 = label2.k; label3 != null; label3 = label3.k) {
                        methodVisitor3.visitLineNumber(label3.b, label2);
                    }
                }
            } else {
                context3 = context2;
            }
            Context context5 = context3;
            while (true) {
                if (context5 == null) {
                    i4 = -1;
                } else {
                    int i57 = context5.o;
                    if (i57 == i56 || i57 == -1) {
                        if (i57 == -1) {
                            boolean z16 = z11;
                            i13 = i26;
                            z2 = z16;
                            labelArr = labelArr16;
                            i14 = i55;
                            methodVisitor2 = methodVisitor3;
                            i15 = i27;
                            i16 = i38;
                            i17 = i56;
                            i18 = i25;
                            cArr = cArr2;
                        } else if (!z11 || z) {
                            boolean z17 = z11;
                            i13 = i26;
                            z2 = z17;
                            labelArr = labelArr16;
                            i14 = i55;
                            i15 = i27;
                            i16 = i38;
                            i17 = i56;
                            i18 = i25;
                            cArr = cArr2;
                            methodVisitor2 = methodVisitor;
                            methodVisitor2.visitFrame(-1, context5.q, context5.s, context5.t, context5.u);
                        } else {
                            labelArr = labelArr16;
                            MethodVisitor methodVisitor4 = methodVisitor3;
                            i16 = i38;
                            i18 = i25;
                            cArr = cArr2;
                            i15 = i27;
                            i17 = i56;
                            i14 = i55;
                            boolean z18 = z11;
                            i13 = i26;
                            z2 = z18;
                            methodVisitor4.visitFrame(context5.p, context5.r, context5.s, context5.t, context5.u);
                            methodVisitor2 = methodVisitor;
                        }
                        if (i42 > 0) {
                            int iA = classReader6.a(i16, z2, z, context5);
                            i42--;
                            int i58 = i13;
                            z11 = z2;
                            i26 = i58;
                            methodVisitor3 = methodVisitor2;
                            cArr2 = cArr;
                            i56 = i17;
                            i25 = i18;
                            i55 = i14;
                            i27 = i15;
                            i38 = iA;
                            labelArr16 = labelArr;
                        } else {
                            int i59 = i13;
                            z11 = z2;
                            i26 = i59;
                            cArr2 = cArr;
                            i56 = i17;
                            i25 = i18;
                            labelArr16 = labelArr;
                            i55 = i14;
                            i27 = i15;
                            context5 = null;
                            i38 = i16;
                            methodVisitor3 = methodVisitor2;
                        }
                    } else {
                        i4 = -1;
                    }
                }
            }
            boolean z19 = z11;
            int i60 = i26;
            Label[] labelArr17 = labelArr16;
            int i61 = i55;
            MethodVisitor methodVisitor5 = methodVisitor3;
            int i62 = i27;
            int i63 = i38;
            int i64 = i56;
            int i65 = i25;
            char[] cArr4 = cArr2;
            int i66 = bArr4[i61] & DefaultClassResolver.NAME;
            switch (ClassWriter.a[i66]) {
                case 0:
                    i5 = i63;
                    methodVisitor5.visitInsn(i66);
                    i6 = i61 + 1;
                    i7 = i53;
                    unsignedShort = unsignedShort7;
                    iArr3 = iArr9;
                    break;
                case 1:
                    i5 = i63;
                    methodVisitor5.visitIntInsn(i66, bArr4[i61 + 1]);
                    i6 = i61 + 2;
                    i7 = i53;
                    unsignedShort = unsignedShort7;
                    iArr3 = iArr9;
                    break;
                case 2:
                    i5 = i63;
                    methodVisitor5.visitIntInsn(i66, classReader6.readShort(i61 + 1));
                    i7 = i53;
                    unsignedShort = unsignedShort7;
                    iArr3 = iArr9;
                    break;
                case 3:
                    i5 = i63;
                    methodVisitor5.visitVarInsn(i66, bArr4[i61 + 1] & DefaultClassResolver.NAME);
                    i6 = i61 + 2;
                    i7 = i53;
                    unsignedShort = unsignedShort7;
                    iArr3 = iArr9;
                    break;
                case 4:
                    i5 = i63;
                    if (i66 > 54) {
                        int i67 = i66 - 59;
                        methodVisitor5.visitVarInsn((i67 >> 2) + 54, i67 & 3);
                    } else {
                        int i68 = i66 - 26;
                        methodVisitor5.visitVarInsn((i68 >> 2) + 21, i68 & 3);
                    }
                    i6 = i61 + 1;
                    i7 = i53;
                    unsignedShort = unsignedShort7;
                    iArr3 = iArr9;
                    break;
                case 5:
                    i5 = i63;
                    methodVisitor5.visitTypeInsn(i66, classReader6.readClass(i61 + 1, cArr4));
                    i7 = i53;
                    unsignedShort = unsignedShort7;
                    iArr3 = iArr9;
                    break;
                case 6:
                case 7:
                    i5 = i63;
                    int i69 = classReader6.a[classReader6.readUnsignedShort(i61 + 1)];
                    boolean z20 = bArr4[i69 + (-1)] == 11 ? z9 : false;
                    String str3 = classReader6.readClass(i69, cArr4);
                    int i70 = classReader6.a[classReader6.readUnsignedShort(i69 + 2)];
                    String utf82 = classReader6.readUTF8(i70, cArr4);
                    String utf83 = classReader6.readUTF8(i70 + 2, cArr4);
                    if (i66 < 182) {
                        methodVisitor5.visitFieldInsn(i66, str3, utf82, utf83);
                    } else {
                        methodVisitor5.visitMethodInsn(i66, str3, utf82, utf83, z20);
                    }
                    i6 = i66 == 185 ? i61 + 5 : i61 + 3;
                    i7 = i53;
                    unsignedShort = unsignedShort7;
                    iArr3 = iArr9;
                    break;
                case 8:
                    i5 = i63;
                    int i71 = classReader6.a[classReader6.readUnsignedShort(i61 + 1)];
                    int i72 = context.d[classReader6.readUnsignedShort(i71)];
                    Handle handle = (Handle) classReader6.readConst(classReader6.readUnsignedShort(i72), cArr4);
                    int unsignedShort16 = classReader6.readUnsignedShort(i72 + 2);
                    Object[] objArr = new Object[unsignedShort16];
                    int i73 = i72 + 4;
                    int i74 = 0;
                    while (true) {
                        int i75 = i71;
                        if (i74 >= unsignedShort16) {
                            int i76 = classReader6.a[classReader6.readUnsignedShort(i75 + 2)];
                            methodVisitor5.visitInvokeDynamicInsn(classReader6.readUTF8(i76, cArr4), classReader6.readUTF8(i76 + 2, cArr4), handle, objArr);
                            i6 = i61 + 5;
                            i7 = i53;
                            unsignedShort = unsignedShort7;
                            iArr3 = iArr9;
                        } else {
                            objArr[i74] = classReader6.readConst(classReader6.readUnsignedShort(i73), cArr4);
                            i73 += 2;
                            i74++;
                            i71 = i75;
                        }
                        break;
                    }
                    break;
                case 9:
                    i5 = i63;
                    methodVisitor5.visitJumpInsn(i66, labelArr17[classReader6.readShort(i61 + 1) + i64]);
                    i6 = i61 + 3;
                    i7 = i53;
                    unsignedShort = unsignedShort7;
                    iArr3 = iArr9;
                    break;
                case 10:
                    i5 = i63;
                    methodVisitor5.visitJumpInsn(i66 - 33, labelArr17[classReader6.readInt(i61 + 1) + i64]);
                    i6 = i61 + 5;
                    i7 = i53;
                    unsignedShort = unsignedShort7;
                    iArr3 = iArr9;
                    break;
                case 11:
                    i5 = i63;
                    methodVisitor5.visitLdcInsn(classReader6.readConst(bArr4[i61 + 1] & DefaultClassResolver.NAME, cArr4));
                    i6 = i61 + 2;
                    i7 = i53;
                    unsignedShort = unsignedShort7;
                    iArr3 = iArr9;
                    break;
                case 12:
                    i5 = i63;
                    methodVisitor5.visitLdcInsn(classReader6.readConst(classReader6.readUnsignedShort(i61 + 1), cArr4));
                    i6 = i61 + 3;
                    i7 = i53;
                    unsignedShort = unsignedShort7;
                    iArr3 = iArr9;
                    break;
                case 13:
                    i5 = i63;
                    methodVisitor5.visitIincInsn(bArr4[i61 + 1] & DefaultClassResolver.NAME, bArr4[i61 + 2]);
                    i6 = i61 + 3;
                    i7 = i53;
                    unsignedShort = unsignedShort7;
                    iArr3 = iArr9;
                    break;
                case 14:
                    int i77 = (i61 + 4) - (i64 & 3);
                    int i78 = classReader6.readInt(i77) + i64;
                    int i79 = classReader6.readInt(i77 + 4);
                    int i80 = classReader6.readInt(i77 + 8);
                    int i81 = (i80 - i79) + 1;
                    Label[] labelArr18 = new Label[i81];
                    i6 = i77 + 12;
                    i5 = i63;
                    for (int i82 = 0; i82 < i81; i82++) {
                        labelArr18[i82] = labelArr17[classReader6.readInt(i6) + i64];
                        i6 += 4;
                    }
                    methodVisitor5.visitTableSwitchInsn(i79, i80, labelArr17[i78], labelArr18);
                    i7 = i53;
                    unsignedShort = unsignedShort7;
                    iArr3 = iArr9;
                    break;
                case 15:
                    int i83 = (i61 + 4) - (i64 & 3);
                    int i84 = classReader6.readInt(i83) + i64;
                    int i85 = classReader6.readInt(i83 + 4);
                    int[] iArr10 = new int[i85];
                    Label[] labelArr19 = new Label[i85];
                    int i86 = i83 + 8;
                    for (int i87 = 0; i87 < i85; i87++) {
                        iArr10[i87] = classReader6.readInt(i86);
                        int i88 = i86;
                        labelArr19[i87] = labelArr17[classReader6.readInt(i88 + 4) + i64];
                        i86 = i88 + 8;
                    }
                    int i89 = i86;
                    methodVisitor5.visitLookupSwitchInsn(labelArr17[i84], iArr10, labelArr19);
                    i5 = i63;
                    i7 = i53;
                    unsignedShort = unsignedShort7;
                    i6 = i89;
                    iArr3 = iArr9;
                    break;
                case 16:
                default:
                    methodVisitor5.visitMultiANewArrayInsn(classReader6.readClass(i61 + 1, cArr4), bArr4[i61 + 3] & DefaultClassResolver.NAME);
                    i6 = i61 + 4;
                    i5 = i63;
                    i7 = i53;
                    unsignedShort = unsignedShort7;
                    iArr3 = iArr9;
                    break;
                case 17:
                    int i90 = bArr4[i61 + 1] & DefaultClassResolver.NAME;
                    if (i90 == 132) {
                        methodVisitor5.visitIincInsn(classReader6.readUnsignedShort(i61 + 2), classReader6.readShort(i61 + 4));
                        i8 = i61 + 6;
                    } else {
                        methodVisitor5.visitVarInsn(i90, classReader6.readUnsignedShort(i61 + 2));
                        i8 = i61 + 4;
                    }
                    i5 = i63;
                    unsignedShort = unsignedShort7;
                    iArr3 = iArr9;
                    i6 = i8;
                    i7 = i53;
                    break;
            }
            while (iArr3 != null && i7 < iArr3.length && unsignedShort <= i64) {
                if (unsignedShort == i64) {
                    int iA2 = classReader6.a(context, iArr3[i7]);
                    i11 = i7;
                    i12 = i6;
                    boolean z21 = z9;
                    classReader6.a(iA2 + 2, cArr4, z21, methodVisitor5.visitInsnAnnotation(context.i, context.j, classReader6.readUTF8(iA2, cArr4), z21));
                } else {
                    i11 = i7;
                    i12 = i6;
                }
                i7 = i11 + 1;
                unsignedShort = (i7 >= iArr3.length || classReader6.readByte(iArr3[i7]) < 67) ? i4 : classReader6.readUnsignedShort(iArr3[i7] + 1);
                i6 = i12;
                z9 = true;
            }
            i53 = i7;
            int i91 = i6;
            int i92 = i54;
            int[] iArr11 = iArr6;
            int unsignedShort17 = unsignedShort8;
            while (iArr11 != null && i92 < iArr11.length && unsignedShort17 <= i64) {
                if (unsignedShort17 == i64) {
                    int iA3 = classReader6.a(context, iArr11[i92]);
                    i9 = i92;
                    i10 = unsignedShort;
                    context4 = context5;
                    classReader6.a(iA3 + 2, cArr4, true, methodVisitor5.visitInsnAnnotation(context.i, context.j, classReader6.readUTF8(iA3, cArr4), false));
                } else {
                    i9 = i92;
                    i10 = unsignedShort;
                    context4 = context5;
                }
                i92 = i9 + 1;
                unsignedShort17 = (i92 >= iArr11.length || classReader6.readByte(iArr11[i92]) < 67) ? i4 : classReader6.readUnsignedShort(iArr11[i92] + 1);
                unsignedShort = i10;
                context5 = context4;
            }
            i54 = i92;
            Context context6 = context5;
            i51 = 0;
            z11 = z19;
            i26 = i60;
            unsignedShort8 = unsignedShort17;
            iArr9 = iArr3;
            labelArr16 = labelArr17;
            i27 = i62;
            z9 = true;
            i55 = i91;
            methodVisitor3 = methodVisitor5;
            context2 = context6;
            unsignedShort7 = unsignedShort;
            iArr6 = iArr11;
            cArr2 = cArr4;
            i25 = i65;
            i38 = i5;
        }
        Label[] labelArr20 = labelArr16;
        MethodVisitor methodVisitor6 = methodVisitor3;
        int i93 = i25;
        int[] iArr12 = iArr9;
        char[] cArr5 = cArr2;
        int[] iArr13 = iArr6;
        Label label4 = labelArr20[i93];
        if (label4 != null) {
            methodVisitor6.visitLabel(label4);
        }
        if ((context.b & 2) == 0 && (i2 = i40) != 0) {
            int i94 = i41;
            if (i94 != 0) {
                int i95 = i94 + 2;
                int unsignedShort18 = classReader6.readUnsignedShort(i94) * 3;
                int[] iArr14 = new int[unsignedShort18];
                int i96 = i95;
                while (unsignedShort18 > 0) {
                    iArr14[unsignedShort18 - 1] = i96 + 6;
                    iArr14[unsignedShort18 - 2] = classReader6.readUnsignedShort(i96 + 8);
                    unsignedShort18 -= 3;
                    iArr14[unsignedShort18] = classReader6.readUnsignedShort(i96);
                    i96 += 10;
                }
                iArr2 = iArr14;
            } else {
                iArr2 = null;
            }
            int unsignedShort19 = classReader6.readUnsignedShort(i2);
            int i97 = i2 + 2;
            while (unsignedShort19 > 0) {
                int unsignedShort20 = classReader6.readUnsignedShort(i97);
                int unsignedShort21 = classReader6.readUnsignedShort(i97 + 2);
                int unsignedShort22 = classReader6.readUnsignedShort(i97 + 8);
                if (iArr2 != null) {
                    for (int i98 = i51; i98 < iArr2.length; i98 += 3) {
                        if (iArr2[i98] == unsignedShort20 && iArr2[i98 + 1] == unsignedShort22) {
                            String utf84 = classReader6.readUTF8(iArr2[i98 + 2], cArr5);
                            i3 = unsignedShort22;
                            str = utf84;
                        }
                    }
                    i3 = unsignedShort22;
                    str = null;
                } else {
                    i3 = unsignedShort22;
                    str = null;
                }
                methodVisitor.visitLocalVariable(classReader6.readUTF8(i97 + 4, cArr5), classReader6.readUTF8(i97 + 6, cArr5), str, labelArr20[unsignedShort20], labelArr20[unsignedShort20 + unsignedShort21], i3);
                i97 += 10;
                unsignedShort19--;
                classReader6 = classReader6;
                iArr13 = iArr13;
                i51 = 0;
                iArr2 = iArr2;
            }
        }
        int[] iArr15 = iArr13;
        ClassReader classReader7 = classReader6;
        int i99 = 32;
        if (iArr12 != null) {
            int i100 = 0;
            while (i100 < iArr12.length) {
                if ((classReader7.readByte(iArr12[i100]) >> 1) == i99) {
                    int iA4 = classReader7.a(context, iArr12[i100]);
                    iArr = iArr12;
                    classReader7.a(iA4 + 2, cArr5, true, methodVisitor.visitLocalVariableAnnotation(context.i, context.j, context.l, context.m, context.n, classReader7.readUTF8(iA4, cArr5), true));
                } else {
                    iArr = iArr12;
                }
                i100++;
                iArr12 = iArr;
                i99 = 32;
            }
        }
        if (iArr15 != null) {
            for (int i101 = 0; i101 < iArr15.length; i101++) {
                if ((classReader7.readByte(iArr15[i101]) >> 1) == 32) {
                    int iA5 = classReader7.a(context, iArr15[i101]);
                    classReader7.a(iA5 + 2, cArr5, true, methodVisitor.visitLocalVariableAnnotation(context.i, context.j, context.l, context.m, context.n, classReader7.readUTF8(iA5, cArr5), false));
                }
            }
        }
        Attribute attribute4 = attribute;
        while (attribute4 != null) {
            Attribute attribute5 = attribute4.a;
            attribute4.a = null;
            methodVisitor.visitAttribute(attribute4);
            attribute4 = attribute5;
        }
        methodVisitor.visitMaxs(unsignedShort3, unsignedShort4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x01bc, code lost:
    
        if (r6 == 0) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int b(com.esotericsoftware.asm.ClassVisitor r27, com.esotericsoftware.asm.Context r28, int r29) {
        /*
            Method dump skipped, instruction units count: 711
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.asm.ClassReader.b(com.esotericsoftware.asm.ClassVisitor, com.esotericsoftware.asm.Context, int):int");
    }

    public void accept(ClassVisitor classVisitor, Attribute[] attributeArr, int i) {
        String[] strArr;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i2;
        int i3;
        ClassReader classReader;
        Attribute attribute;
        int i4;
        ClassReader classReader2 = this;
        int i5 = classReader2.header;
        char[] cArr = new char[classReader2.d];
        Context context = new Context();
        context.a = attributeArr;
        context.b = i;
        context.c = cArr;
        int unsignedShort = classReader2.readUnsignedShort(i5);
        String str7 = classReader2.readClass(i5 + 2, cArr);
        String str8 = classReader2.readClass(i5 + 4, cArr);
        int unsignedShort2 = classReader2.readUnsignedShort(i5 + 6);
        String[] strArr2 = new String[unsignedShort2];
        int i6 = i5 + 8;
        for (int i7 = 0; i7 < unsignedShort2; i7++) {
            strArr2[i7] = classReader2.readClass(i6, cArr);
            i6 += 2;
        }
        int iA = classReader2.a();
        int i8 = iA;
        int i9 = unsignedShort;
        int unsignedShort3 = classReader2.readUnsignedShort(iA);
        String utf8 = null;
        String strA = null;
        String utf82 = null;
        int i10 = 0;
        int i11 = 0;
        String utf83 = null;
        String utf84 = null;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        Attribute attribute2 = null;
        String str9 = null;
        while (unsignedShort3 > 0) {
            String utf85 = classReader2.readUTF8(i8 + 2, cArr);
            String str10 = utf8;
            if (AttSourceFile.ATTRIBUTE_NAME.equals(utf85)) {
                utf8 = classReader2.readUTF8(i8 + 8, cArr);
                classReader = classReader2;
                str4 = str8;
                i2 = unsignedShort2;
                strArr = strArr2;
                str = str9;
                str3 = str7;
            } else {
                if (AttInnerClasses.ATTRIBUTE_NAME.equals(utf85)) {
                    classReader = classReader2;
                    i14 = i8 + 8;
                } else if (AttEnclosingMethod.ATTRIBUTE_NAME.equals(utf85)) {
                    String str11 = classReader2.readClass(i8 + 8, cArr);
                    int unsignedShort4 = classReader2.readUnsignedShort(i8 + 10);
                    if (unsignedShort4 != 0) {
                        utf83 = classReader2.readUTF8(classReader2.a[unsignedShort4], cArr);
                        utf82 = classReader2.readUTF8(classReader2.a[unsignedShort4] + 2, cArr);
                    }
                    str3 = str7;
                    i2 = unsignedShort2;
                    strArr = strArr2;
                    utf8 = str10;
                    str = str11;
                    str4 = str8;
                    classReader = classReader2;
                } else {
                    if (AttSignature.ATTRIBUTE_NAME.equals(utf85)) {
                        utf84 = classReader2.readUTF8(i8 + 8, cArr);
                    } else if (AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME.equals(utf85)) {
                        i10 = i8 + 8;
                    } else if ("RuntimeVisibleTypeAnnotations".equals(utf85)) {
                        classReader = classReader2;
                        i12 = i8 + 8;
                    } else {
                        if (AttDeprecated.ATTRIBUTE_NAME.equals(utf85)) {
                            i4 = 131072;
                        } else if (AttSynthetic.ATTRIBUTE_NAME.equals(utf85)) {
                            i4 = 266240;
                        } else if (AttSourceDebugExtension.ATTRIBUTE_NAME.equals(utf85)) {
                            int i15 = classReader2.readInt(i8 + 4);
                            strA = classReader2.a(i8 + 8, i15, new char[i15]);
                        } else if (AttRuntimeInvisibleAnnotations.ATTRIBUTE_NAME.equals(utf85)) {
                            classReader = classReader2;
                            i11 = i8 + 8;
                        } else if ("RuntimeInvisibleTypeAnnotations".equals(utf85)) {
                            classReader = classReader2;
                            i13 = i8 + 8;
                        } else {
                            if (AttBootstrapMethods.ATTRIBUTE_NAME.equals(utf85)) {
                                int unsignedShort5 = classReader2.readUnsignedShort(i8 + 8);
                                int[] iArr = new int[unsignedShort5];
                                int unsignedShort6 = i8 + 10;
                                int i16 = 0;
                                while (i16 < unsignedShort5) {
                                    iArr[i16] = unsignedShort6;
                                    unsignedShort6 += (classReader2.readUnsignedShort(unsignedShort6 + 2) + 2) << 1;
                                    i16++;
                                    unsignedShort5 = unsignedShort5;
                                }
                                context.d = iArr;
                                classReader = classReader2;
                                i2 = unsignedShort2;
                                strArr = strArr2;
                                str = str9;
                                str2 = str10;
                                i3 = i10;
                                str3 = str7;
                                str4 = str8;
                                str6 = strA;
                                str5 = utf82;
                                attribute = attribute2;
                            } else {
                                strArr = strArr2;
                                str = str9;
                                str2 = str10;
                                str3 = str7;
                                str4 = str8;
                                str5 = utf82;
                                str6 = strA;
                                i2 = unsignedShort2;
                                i3 = i10;
                                Attribute attributeA = classReader2.a(attributeArr, utf85, i8 + 8, classReader2.readInt(i8 + 4), cArr, -1, null);
                                classReader = classReader2;
                                attribute = attribute2;
                                if (attributeA != null) {
                                    attributeA.a = attribute;
                                    attribute2 = attributeA;
                                }
                                utf8 = str2;
                                strA = str6;
                                utf82 = str5;
                                i10 = i3;
                            }
                            attribute2 = attribute;
                            utf8 = str2;
                            strA = str6;
                            utf82 = str5;
                            i10 = i3;
                        }
                        classReader = classReader2;
                        i9 |= i4;
                    }
                    classReader = classReader2;
                }
                i2 = unsignedShort2;
                strArr = strArr2;
                str = str9;
                utf8 = str10;
                str3 = str7;
                str4 = str8;
            }
            i8 = classReader.readInt(i8 + 4) + 6 + i8;
            unsignedShort3--;
            classReader2 = classReader;
            str7 = str3;
            str8 = str4;
            unsignedShort2 = i2;
            str9 = str;
            strArr2 = strArr;
        }
        ClassReader classReader3 = classReader2;
        String str12 = utf8;
        String str13 = str8;
        int i17 = unsignedShort2;
        String[] strArr3 = strArr2;
        String str14 = str9;
        boolean z = true;
        String str15 = utf82;
        int i18 = i10;
        String str16 = str7;
        String str17 = strA;
        classVisitor.visit(classReader3.readInt(classReader3.a[1] - 7), i9, str16, utf84, str13, strArr3);
        if ((i & 2) == 0 && (str12 != null || str17 != null)) {
            classVisitor.visitSource(str12, str17);
        }
        if (str14 != null) {
            classVisitor.visitOuterClass(str14, utf83, str15);
        }
        if (i18 != 0) {
            int unsignedShort7 = classReader3.readUnsignedShort(i18);
            int iA2 = i18 + 2;
            while (unsignedShort7 > 0) {
                boolean z2 = z;
                iA2 = classReader3.a(iA2 + 2, cArr, z2, classVisitor.visitAnnotation(classReader3.readUTF8(iA2, cArr), z2));
                unsignedShort7--;
                z = true;
            }
        }
        if (i11 != 0) {
            int iA3 = i11 + 2;
            for (int unsignedShort8 = classReader3.readUnsignedShort(i11); unsignedShort8 > 0; unsignedShort8--) {
                iA3 = classReader3.a(iA3 + 2, cArr, true, classVisitor.visitAnnotation(classReader3.readUTF8(iA3, cArr), false));
            }
        }
        int i19 = i12;
        if (i19 != 0) {
            int iA4 = i19 + 2;
            for (int unsignedShort9 = classReader3.readUnsignedShort(i19); unsignedShort9 > 0; unsignedShort9--) {
                int iA5 = classReader3.a(context, iA4);
                iA4 = classReader3.a(iA5 + 2, cArr, true, classVisitor.visitTypeAnnotation(context.i, context.j, classReader3.readUTF8(iA5, cArr), true));
            }
        }
        int i20 = i13;
        if (i20 != 0) {
            int iA6 = i20 + 2;
            for (int unsignedShort10 = classReader3.readUnsignedShort(i20); unsignedShort10 > 0; unsignedShort10--) {
                int iA7 = classReader3.a(context, iA6);
                iA6 = classReader3.a(iA7 + 2, cArr, true, classVisitor.visitTypeAnnotation(context.i, context.j, classReader3.readUTF8(iA7, cArr), false));
            }
        }
        Attribute attribute3 = attribute2;
        while (attribute3 != null) {
            Attribute attribute4 = attribute3.a;
            attribute3.a = null;
            classVisitor.visitAttribute(attribute3);
            attribute3 = attribute4;
        }
        int i21 = i14;
        if (i21 != 0) {
            int i22 = i21 + 2;
            for (int unsignedShort11 = classReader3.readUnsignedShort(i21); unsignedShort11 > 0; unsignedShort11--) {
                classVisitor.visitInnerClass(classReader3.readClass(i22, cArr), classReader3.readClass(i22 + 2, cArr), classReader3.readUTF8(i22 + 4, cArr), classReader3.readUnsignedShort(i22 + 6));
                i22 += 8;
            }
        }
        int iA8 = (i17 * 2) + classReader3.header + 10;
        for (int unsignedShort12 = classReader3.readUnsignedShort(iA8 - 2); unsignedShort12 > 0; unsignedShort12--) {
            iA8 = classReader3.a(classVisitor, context, iA8);
        }
        int iB = iA8 + 2;
        for (int unsignedShort13 = classReader3.readUnsignedShort(iA8); unsignedShort13 > 0; unsignedShort13--) {
            iB = classReader3.b(classVisitor, context, iB);
        }
        classVisitor.visitEnd();
    }

    public int getAccess() {
        return readUnsignedShort(this.header);
    }

    public String getClassName() {
        return readClass(this.header + 2, new char[this.d]);
    }

    public String[] getInterfaces() {
        int i = this.header + 6;
        int unsignedShort = readUnsignedShort(i);
        String[] strArr = new String[unsignedShort];
        if (unsignedShort > 0) {
            char[] cArr = new char[this.d];
            for (int i2 = 0; i2 < unsignedShort; i2++) {
                i += 2;
                strArr[i2] = readClass(i, cArr);
            }
        }
        return strArr;
    }

    public int getItem(int i) {
        return this.a[i];
    }

    public int getItemCount() {
        return this.a.length;
    }

    public int getMaxStringLength() {
        return this.d;
    }

    public String getSuperName() {
        return readClass(this.header + 4, new char[this.d]);
    }

    public int readByte(int i) {
        return this.b[i] & DefaultClassResolver.NAME;
    }

    public String readClass(int i, char[] cArr) {
        return readUTF8(this.a[readUnsignedShort(i)], cArr);
    }

    public Object readConst(int i, char[] cArr) {
        int i2 = this.a[i];
        byte b = this.b[i2 - 1];
        if (b == 16) {
            return Type.getMethodType(readUTF8(i2, cArr));
        }
        switch (b) {
            case 3:
                return new Integer(readInt(i2));
            case 4:
                return new Float(Float.intBitsToFloat(readInt(i2)));
            case 5:
                return new Long(readLong(i2));
            case 6:
                return new Double(Double.longBitsToDouble(readLong(i2)));
            case 7:
                return Type.getObjectType(readUTF8(i2, cArr));
            case 8:
                return readUTF8(i2, cArr);
            default:
                int i3 = readByte(i2);
                int[] iArr = this.a;
                int i4 = iArr[readUnsignedShort(i2 + 1)];
                boolean z = this.b[i4 + (-1)] == 11;
                String str = readClass(i4, cArr);
                int i5 = iArr[readUnsignedShort(i4 + 2)];
                return new Handle(i3, str, readUTF8(i5, cArr), readUTF8(i5 + 2, cArr), z);
        }
    }

    public int readInt(int i) {
        byte[] bArr = this.b;
        return (bArr[i + 3] & DefaultClassResolver.NAME) | ((bArr[i] & DefaultClassResolver.NAME) << 24) | ((bArr[i + 1] & DefaultClassResolver.NAME) << 16) | ((bArr[i + 2] & DefaultClassResolver.NAME) << 8);
    }

    public Label readLabel(int i, Label[] labelArr) {
        if (labelArr[i] == null) {
            labelArr[i] = new Label();
        }
        return labelArr[i];
    }

    public long readLong(int i) {
        return (((long) readInt(i + 4)) & 4294967295L) | (((long) readInt(i)) << 32);
    }

    public short readShort(int i) {
        byte[] bArr = this.b;
        return (short) ((bArr[i + 1] & DefaultClassResolver.NAME) | ((bArr[i] & DefaultClassResolver.NAME) << 8));
    }

    public String readUTF8(int i, char[] cArr) {
        int unsignedShort = readUnsignedShort(i);
        if (i == 0 || unsignedShort == 0) {
            return null;
        }
        String[] strArr = this.c;
        String str = strArr[unsignedShort];
        if (str != null) {
            return str;
        }
        int i2 = this.a[unsignedShort];
        String strA = a(i2 + 2, readUnsignedShort(i2), cArr);
        strArr[unsignedShort] = strA;
        return strA;
    }

    public int readUnsignedShort(int i) {
        byte[] bArr = this.b;
        return (bArr[i + 1] & DefaultClassResolver.NAME) | ((bArr[i] & DefaultClassResolver.NAME) << 8);
    }

    public ClassReader(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/'));
        stringBuffer.append(ClassFileLocator.CLASS_FILE_EXTENSION);
        this(a(ClassLoader.getSystemResourceAsStream(stringBuffer.toString()), true));
    }

    public ClassReader(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public ClassReader(InputStream inputStream) {
        this(a(inputStream, false));
    }

    private void b(MethodVisitor methodVisitor, Context context, int i, boolean z) {
        int iA = i + 1;
        int i2 = this.b[i] & DefaultClassResolver.NAME;
        int length = Type.getArgumentTypes(context.g).length - i2;
        int i3 = 0;
        while (i3 < length) {
            AnnotationVisitor annotationVisitorVisitParameterAnnotation = methodVisitor.visitParameterAnnotation(i3, "Ljava/lang/Synthetic;", false);
            if (annotationVisitorVisitParameterAnnotation != null) {
                annotationVisitorVisitParameterAnnotation.visitEnd();
            }
            i3++;
        }
        char[] cArr = context.c;
        while (i3 < i2 + length) {
            iA += 2;
            for (int unsignedShort = readUnsignedShort(iA); unsignedShort > 0; unsignedShort--) {
                iA = a(iA + 2, cArr, true, methodVisitor.visitParameterAnnotation(i3, readUTF8(iA, cArr), z));
            }
            i3++;
        }
    }

    public void accept(ClassVisitor classVisitor, int i) {
        accept(classVisitor, new Attribute[0], i);
    }

    private int a(int i, boolean z, boolean z2, Context context) {
        int iA;
        int i2;
        ClassReader classReader;
        char[] cArr = context.c;
        Label[] labelArr = context.h;
        if (z) {
            int i3 = i + 1;
            i2 = this.b[i] & DefaultClassResolver.NAME;
            iA = i3;
        } else {
            context.o = -1;
            iA = i;
            i2 = 255;
        }
        int i4 = 0;
        context.r = 0;
        if (i2 < 64) {
            context.p = 3;
            context.t = 0;
            classReader = this;
        } else if (i2 < 128) {
            i2 -= 64;
            classReader = this;
            iA = classReader.a(context.u, 0, iA, cArr, labelArr);
            context.p = 4;
            context.t = 1;
        } else {
            int unsignedShort = readUnsignedShort(iA);
            int i5 = iA;
            iA = i5 + 2;
            if (i2 == 247) {
                classReader = this;
                iA = classReader.a(context.u, 0, iA, cArr, labelArr);
                context.p = 4;
                context.t = 1;
            } else {
                if (i2 >= 248 && i2 < 251) {
                    context.p = 2;
                    int i6 = 251 - i2;
                    context.r = i6;
                    context.q -= i6;
                } else if (i2 != 251) {
                    if (i2 >= 255) {
                        classReader = this;
                        context.p = 0;
                        int unsignedShort2 = classReader.readUnsignedShort(iA);
                        int iA2 = i5 + 4;
                        context.r = unsignedShort2;
                        context.q = unsignedShort2;
                        int i7 = 0;
                        while (unsignedShort2 > 0) {
                            iA2 = classReader.a(context.s, i7, iA2, cArr, labelArr);
                            unsignedShort2--;
                            i7++;
                        }
                        int unsignedShort3 = classReader.readUnsignedShort(iA2);
                        iA = iA2 + 2;
                        context.t = unsignedShort3;
                        while (true) {
                            int i8 = i4;
                            if (unsignedShort3 <= 0) {
                                break;
                            }
                            i4 = i8 + 1;
                            iA = classReader.a(context.u, i8, iA, cArr, labelArr);
                            unsignedShort3--;
                        }
                    } else {
                        int i9 = i2 - 251;
                        int i10 = z2 ? context.q : 0;
                        int i11 = i9;
                        while (i11 > 0) {
                            iA = a(context.s, i10, iA, cArr, labelArr);
                            i11--;
                            i10++;
                        }
                        classReader = this;
                        context.p = 1;
                        context.r = i9;
                        context.q += i9;
                        context.t = 0;
                    }
                } else {
                    context.p = 3;
                }
                context.t = 0;
                classReader = this;
            }
            i2 = unsignedShort;
        }
        int i12 = i2 + 1 + context.o;
        context.o = i12;
        classReader.readLabel(i12, labelArr);
        return iA;
    }

    private int a(int i, char[] cArr, String str, AnnotationVisitor annotationVisitor) {
        byte[] bArr = this.b;
        int i2 = 0;
        if (annotationVisitor == null) {
            int i3 = bArr[i] & DefaultClassResolver.NAME;
            return i3 != 64 ? i3 != 91 ? i3 != 101 ? i + 3 : i + 5 : a(i + 1, cArr, false, (AnnotationVisitor) null) : a(i + 3, cArr, true, (AnnotationVisitor) null);
        }
        int i4 = i + 1;
        int i5 = bArr[i] & DefaultClassResolver.NAME;
        if (i5 == 64) {
            return a(i + 3, cArr, true, annotationVisitor.visitAnnotation(str, readUTF8(i4, cArr)));
        }
        if (i5 != 70) {
            if (i5 == 83) {
                annotationVisitor.visit(str, new Short((short) readInt(this.a[readUnsignedShort(i4)])));
                return i + 3;
            }
            if (i5 == 99) {
                annotationVisitor.visit(str, Type.getType(readUTF8(i4, cArr)));
                return i + 3;
            }
            if (i5 == 101) {
                annotationVisitor.visitEnum(str, readUTF8(i4, cArr), readUTF8(i + 3, cArr));
                return i + 5;
            }
            if (i5 == 115) {
                annotationVisitor.visit(str, readUTF8(i4, cArr));
                return i + 3;
            }
            if (i5 != 73 && i5 != 74) {
                if (i5 == 90) {
                    annotationVisitor.visit(str, readInt(this.a[readUnsignedShort(i4)]) == 0 ? Boolean.FALSE : Boolean.TRUE);
                    return i + 3;
                }
                if (i5 == 91) {
                    int unsignedShort = readUnsignedShort(i4);
                    int i6 = i + 3;
                    if (unsignedShort == 0) {
                        return a(i + 1, cArr, false, annotationVisitor.visitArray(str));
                    }
                    int i7 = i + 4;
                    int i8 = this.b[i6] & DefaultClassResolver.NAME;
                    if (i8 == 70) {
                        float[] fArr = new float[unsignedShort];
                        while (i2 < unsignedShort) {
                            fArr[i2] = Float.intBitsToFloat(readInt(this.a[readUnsignedShort(i7)]));
                            i7 += 3;
                            i2++;
                        }
                        annotationVisitor.visit(str, fArr);
                    } else if (i8 == 83) {
                        short[] sArr = new short[unsignedShort];
                        while (i2 < unsignedShort) {
                            sArr[i2] = (short) readInt(this.a[readUnsignedShort(i7)]);
                            i7 += 3;
                            i2++;
                        }
                        annotationVisitor.visit(str, sArr);
                    } else if (i8 == 90) {
                        boolean[] zArr = new boolean[unsignedShort];
                        for (int i9 = 0; i9 < unsignedShort; i9++) {
                            zArr[i9] = readInt(this.a[readUnsignedShort(i7)]) != 0;
                            i7 += 3;
                        }
                        annotationVisitor.visit(str, zArr);
                    } else if (i8 == 73) {
                        int[] iArr = new int[unsignedShort];
                        while (i2 < unsignedShort) {
                            iArr[i2] = readInt(this.a[readUnsignedShort(i7)]);
                            i7 += 3;
                            i2++;
                        }
                        annotationVisitor.visit(str, iArr);
                    } else if (i8 != 74) {
                        switch (i8) {
                            case 66:
                                byte[] bArr2 = new byte[unsignedShort];
                                while (i2 < unsignedShort) {
                                    bArr2[i2] = (byte) readInt(this.a[readUnsignedShort(i7)]);
                                    i7 += 3;
                                    i2++;
                                }
                                annotationVisitor.visit(str, bArr2);
                                break;
                            case 67:
                                char[] cArr2 = new char[unsignedShort];
                                while (i2 < unsignedShort) {
                                    cArr2[i2] = (char) readInt(this.a[readUnsignedShort(i7)]);
                                    i7 += 3;
                                    i2++;
                                }
                                annotationVisitor.visit(str, cArr2);
                                break;
                            case 68:
                                double[] dArr = new double[unsignedShort];
                                while (i2 < unsignedShort) {
                                    dArr[i2] = Double.longBitsToDouble(readLong(this.a[readUnsignedShort(i7)]));
                                    i7 += 3;
                                    i2++;
                                }
                                annotationVisitor.visit(str, dArr);
                                break;
                            default:
                                return a(i + 1, cArr, false, annotationVisitor.visitArray(str));
                        }
                    } else {
                        long[] jArr = new long[unsignedShort];
                        while (i2 < unsignedShort) {
                            jArr[i2] = readLong(this.a[readUnsignedShort(i7)]);
                            i7 += 3;
                            i2++;
                        }
                        annotationVisitor.visit(str, jArr);
                    }
                    return i7 - 1;
                }
                switch (i5) {
                    case 66:
                        annotationVisitor.visit(str, new Byte((byte) readInt(this.a[readUnsignedShort(i4)])));
                        return i + 3;
                    case 67:
                        annotationVisitor.visit(str, new Character((char) readInt(this.a[readUnsignedShort(i4)])));
                        return i + 3;
                    case 68:
                        break;
                    default:
                        return i4;
                }
            }
        }
        annotationVisitor.visit(str, readConst(readUnsignedShort(i4), cArr));
        return i + 3;
    }

    private int a(int i, char[] cArr, boolean z, AnnotationVisitor annotationVisitor) {
        int unsignedShort = readUnsignedShort(i);
        int iA = i + 2;
        if (z) {
            while (unsignedShort > 0) {
                iA = a(iA + 2, cArr, readUTF8(iA, cArr), annotationVisitor);
                unsignedShort--;
            }
        } else {
            while (unsignedShort > 0) {
                iA = a(iA, cArr, (String) null, annotationVisitor);
                unsignedShort--;
            }
        }
        if (annotationVisitor != null) {
            annotationVisitor.visitEnd();
        }
        return iA;
    }

    private int a(ClassVisitor classVisitor, Context context, int i) {
        int i2;
        Context context2 = context;
        char[] cArr = context2.c;
        int unsignedShort = readUnsignedShort(i);
        String utf8 = readUTF8(i + 2, cArr);
        String utf82 = readUTF8(i + 4, cArr);
        int i3 = i + 6;
        int i4 = i3;
        int i5 = unsignedShort;
        int unsignedShort2 = readUnsignedShort(i3);
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        Attribute attributeA = null;
        String utf83 = null;
        Object obj = null;
        while (unsignedShort2 > 0) {
            String utf84 = readUTF8(i4 + 2, cArr);
            if (AttConstantValue.ATTRIBUTE_NAME.equals(utf84)) {
                int unsignedShort3 = readUnsignedShort(i4 + 8);
                obj = unsignedShort3 == 0 ? null : readConst(unsignedShort3, cArr);
            } else if (AttSignature.ATTRIBUTE_NAME.equals(utf84)) {
                utf83 = readUTF8(i4 + 8, cArr);
            } else {
                if (AttDeprecated.ATTRIBUTE_NAME.equals(utf84)) {
                    i2 = 131072;
                } else if (AttSynthetic.ATTRIBUTE_NAME.equals(utf84)) {
                    i2 = 266240;
                } else if (AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME.equals(utf84)) {
                    i6 = i4 + 8;
                } else if ("RuntimeVisibleTypeAnnotations".equals(utf84)) {
                    i8 = i4 + 8;
                } else if (AttRuntimeInvisibleAnnotations.ATTRIBUTE_NAME.equals(utf84)) {
                    i7 = i4 + 8;
                } else if ("RuntimeInvisibleTypeAnnotations".equals(utf84)) {
                    i9 = i4 + 8;
                } else {
                    int i10 = i6;
                    int i11 = i8;
                    Attribute attribute = attributeA;
                    int i12 = i7;
                    int i13 = i9;
                    attributeA = a(context2.a, utf84, i4 + 8, readInt(i4 + 4), cArr, -1, null);
                    if (attributeA != null) {
                        attributeA.a = attribute;
                    } else {
                        attributeA = attribute;
                    }
                    i9 = i13;
                    i6 = i10;
                    i8 = i11;
                    i7 = i12;
                }
                i5 = i2 | i5;
            }
            i4 += readInt(i4 + 4) + 6;
            unsignedShort2--;
            context2 = context;
        }
        int i14 = i6;
        Attribute attribute2 = attributeA;
        int i15 = i4 + 2;
        FieldVisitor fieldVisitorVisitField = classVisitor.visitField(i5, utf8, utf82, utf83, obj);
        if (fieldVisitorVisitField == null) {
            return i15;
        }
        if (i14 != 0) {
            int iA = i14 + 2;
            for (int unsignedShort4 = readUnsignedShort(i14); unsignedShort4 > 0; unsignedShort4--) {
                iA = a(iA + 2, cArr, true, fieldVisitorVisitField.visitAnnotation(readUTF8(iA, cArr), true));
            }
        }
        if (i7 != 0) {
            int iA2 = i7 + 2;
            for (int unsignedShort5 = readUnsignedShort(i7); unsignedShort5 > 0; unsignedShort5--) {
                iA2 = a(iA2 + 2, cArr, true, fieldVisitorVisitField.visitAnnotation(readUTF8(iA2, cArr), false));
            }
        }
        if (i8 != 0) {
            int iA3 = i8 + 2;
            for (int unsignedShort6 = readUnsignedShort(i8); unsignedShort6 > 0; unsignedShort6--) {
                int iA4 = a(context, iA3);
                iA3 = a(iA4 + 2, cArr, true, fieldVisitorVisitField.visitTypeAnnotation(context.i, context.j, readUTF8(iA4, cArr), true));
            }
        }
        if (i9 != 0) {
            int iA5 = i9 + 2;
            for (int unsignedShort7 = readUnsignedShort(i9); unsignedShort7 > 0; unsignedShort7--) {
                int iA6 = a(context, iA5);
                iA5 = a(iA6 + 2, cArr, true, fieldVisitorVisitField.visitTypeAnnotation(context.i, context.j, readUTF8(iA6, cArr), false));
            }
        }
        Attribute attribute3 = attribute2;
        while (attribute3 != null) {
            Attribute attribute4 = attribute3.a;
            attribute3.a = null;
            fieldVisitorVisitField.visitAttribute(attribute3);
            attribute3 = attribute4;
        }
        fieldVisitorVisitField.visitEnd();
        return i15;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int a(com.esotericsoftware.asm.Context r9, int r10) {
        /*
            r8 = this;
            int r0 = r8.readInt(r10)
            int r1 = r0 >>> 24
            r2 = 1
            if (r1 == 0) goto L75
            if (r1 == r2) goto L75
            r3 = 64
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r1 == r3) goto L2f
            r3 = 65
            if (r1 == r3) goto L2f
            switch(r1) {
                case 19: goto L2c;
                case 20: goto L2c;
                case 21: goto L2c;
                case 22: goto L75;
                default: goto L18;
            }
        L18:
            switch(r1) {
                case 71: goto L25;
                case 72: goto L25;
                case 73: goto L25;
                case 74: goto L25;
                case 75: goto L25;
                default: goto L1b;
            }
        L1b:
            r3 = 67
            if (r1 >= r3) goto L21
            r4 = -256(0xffffffffffffff00, float:NaN)
        L21:
            r0 = r0 & r4
            int r10 = r10 + 3
            goto L7a
        L25:
            r1 = -16776961(0xffffffffff0000ff, float:-1.7014636E38)
            r0 = r0 & r1
            int r10 = r10 + 4
            goto L7a
        L2c:
            r0 = r0 & r4
            int r10 = r10 + r2
            goto L7a
        L2f:
            r0 = r0 & r4
            int r1 = r10 + 1
            int r1 = r8.readUnsignedShort(r1)
            com.esotericsoftware.asm.Label[] r3 = new com.esotericsoftware.asm.Label[r1]
            r9.l = r3
            com.esotericsoftware.asm.Label[] r3 = new com.esotericsoftware.asm.Label[r1]
            r9.m = r3
            int[] r3 = new int[r1]
            r9.n = r3
            int r10 = r10 + 3
            r3 = 0
        L45:
            if (r3 >= r1) goto L7a
            int r4 = r8.readUnsignedShort(r10)
            int r5 = r10 + 2
            int r5 = r8.readUnsignedShort(r5)
            com.esotericsoftware.asm.Label[] r6 = r9.l
            com.esotericsoftware.asm.Label[] r7 = r9.h
            com.esotericsoftware.asm.Label r7 = r8.readLabel(r4, r7)
            r6[r3] = r7
            com.esotericsoftware.asm.Label[] r6 = r9.m
            int r4 = r4 + r5
            com.esotericsoftware.asm.Label[] r5 = r9.h
            com.esotericsoftware.asm.Label r4 = r8.readLabel(r4, r5)
            r6[r3] = r4
            int[] r4 = r9.n
            int r5 = r10 + 4
            int r5 = r8.readUnsignedShort(r5)
            r4[r3] = r5
            int r10 = r10 + 6
            int r3 = r3 + 1
            goto L45
        L75:
            r1 = -65536(0xffffffffffff0000, float:NaN)
            r0 = r0 & r1
            int r10 = r10 + 2
        L7a:
            int r1 = r8.readByte(r10)
            r9.i = r0
            if (r1 != 0) goto L84
            r8 = 0
            goto L8c
        L84:
            com.esotericsoftware.asm.TypePath r0 = new com.esotericsoftware.asm.TypePath
            byte[] r8 = r8.b
            r0.<init>(r8, r10)
            r8 = r0
        L8c:
            r9.j = r8
            int r10 = r10 + r2
            int r1 = r1 * 2
            int r1 = r1 + r10
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.asm.ClassReader.a(com.esotericsoftware.asm.Context, int):int");
    }

    private int a(Object[] objArr, int i, int i2, char[] cArr, Label[] labelArr) {
        int i3 = i2 + 1;
        switch (this.b[i2] & DefaultClassResolver.NAME) {
            case 0:
                objArr[i] = Opcodes.TOP;
                return i3;
            case 1:
                objArr[i] = Opcodes.INTEGER;
                return i3;
            case 2:
                objArr[i] = Opcodes.FLOAT;
                return i3;
            case 3:
                objArr[i] = Opcodes.DOUBLE;
                return i3;
            case 4:
                objArr[i] = Opcodes.LONG;
                return i3;
            case 5:
                objArr[i] = Opcodes.NULL;
                return i3;
            case 6:
                objArr[i] = Opcodes.UNINITIALIZED_THIS;
                return i3;
            case 7:
                objArr[i] = readClass(i3, cArr);
                break;
            default:
                objArr[i] = readLabel(readUnsignedShort(i3), labelArr);
                break;
        }
        return i2 + 3;
    }

    private Attribute a(Attribute[] attributeArr, String str, int i, int i2, char[] cArr, int i3, Label[] labelArr) {
        int i4 = 0;
        while (i4 < attributeArr.length) {
            boolean zEquals = attributeArr[i4].type.equals(str);
            Attribute[] attributeArr2 = attributeArr;
            ClassReader classReader = this;
            if (zEquals) {
                return attributeArr2[i4].read(classReader, i, i2, cArr, i3, labelArr);
            }
            i4++;
            attributeArr = attributeArr2;
            this = classReader;
        }
        return new Attribute(str).read(this, i, i2, null, -1, null);
    }

    private String a(int i, int i2, char[] cArr) {
        int i3;
        int i4 = i2 + i;
        byte[] bArr = this.b;
        int i5 = 0;
        char c = 0;
        char c2 = 0;
        while (i < i4) {
            int i6 = i + 1;
            byte b = bArr[i];
            if (c == 0) {
                int i7 = b & DefaultClassResolver.NAME;
                if (i7 < 128) {
                    cArr[i5] = (char) i7;
                    i5++;
                } else if (i7 >= 224 || i7 <= 191) {
                    c2 = (char) (b & 15);
                    c = 2;
                } else {
                    i3 = b & 31;
                    c2 = (char) i3;
                    c = 1;
                }
            } else if (c == 1) {
                cArr[i5] = (char) ((b & 63) | (c2 << 6));
                i5++;
                c = 0;
            } else if (c == 2) {
                i3 = (b & 63) | (c2 << 6);
                c2 = (char) i3;
                c = 1;
            }
            i = i6;
        }
        return new String(cArr, 0, i5);
    }

    public void a(ClassWriter classWriter) {
        char[] cArr = new char[this.d];
        int length = this.a.length;
        Item[] itemArr = new Item[length];
        int i = 1;
        while (true) {
            int[] iArr = this.a;
            if (i >= length) {
                int i2 = iArr[1] - 1;
                classWriter.d.putByteArray(this.b, i2, this.header - i2);
                classWriter.e = itemArr;
                classWriter.f = (int) (((double) length) * 0.75d);
                classWriter.c = length;
                return;
            }
            int i3 = iArr[i];
            byte b = this.b[i3 - 1];
            Item item = new Item(i);
            if (b == 1) {
                String[] strArr = this.c;
                String strA = strArr[i];
                if (strA == null) {
                    int i4 = this.a[i];
                    strA = a(i4 + 2, readUnsignedShort(i4), cArr);
                    strArr[i] = strA;
                }
                item.a(b, strA, null, null);
            } else if (b == 15) {
                int i5 = this.a[readUnsignedShort(i3 + 1)];
                int i6 = this.a[readUnsignedShort(i5 + 2)];
                item.a(readByte(i3) + 20, readClass(i5, cArr), readUTF8(i6, cArr), readUTF8(i6 + 2, cArr));
            } else if (b == 18) {
                if (classWriter.A == null) {
                    a(classWriter, itemArr, cArr);
                }
                int i7 = this.a[readUnsignedShort(i3 + 2)];
                item.a(readUTF8(i7, cArr), readUTF8(i7 + 2, cArr), readUnsignedShort(i3));
            } else if (b == 3) {
                item.a(readInt(i3));
            } else if (b != 4) {
                if (b == 5) {
                    item.a(readLong(i3));
                } else if (b != 6) {
                    switch (b) {
                        case 9:
                        case 10:
                        case 11:
                            int i8 = this.a[readUnsignedShort(i3 + 2)];
                            item.a(b, readClass(i3, cArr), readUTF8(i8, cArr), readUTF8(i8 + 2, cArr));
                            break;
                        case 12:
                            item.a(b, readUTF8(i3, cArr), readUTF8(i3 + 2, cArr), null);
                            break;
                        default:
                            item.a(b, readUTF8(i3, cArr), null, null);
                            break;
                    }
                } else {
                    item.a(Double.longBitsToDouble(readLong(i3)));
                }
                i++;
            } else {
                item.a(Float.intBitsToFloat(readInt(i3)));
            }
            int i9 = item.j % length;
            item.k = itemArr[i9];
            itemArr[i9] = item;
            i++;
        }
    }

    private void a(ClassWriter classWriter, Item[] itemArr, char[] cArr) {
        int iA = a();
        for (int unsignedShort = readUnsignedShort(iA); unsignedShort > 0; unsignedShort--) {
            if (AttBootstrapMethods.ATTRIBUTE_NAME.equals(readUTF8(iA + 2, cArr))) {
                int unsignedShort2 = readUnsignedShort(iA + 8);
                int i = iA + 10;
                int i2 = i;
                for (int i3 = 0; i3 < unsignedShort2; i3++) {
                    int i4 = (i2 - iA) - 10;
                    int iHashCode = readConst(readUnsignedShort(i2), cArr).hashCode();
                    for (int unsignedShort3 = readUnsignedShort(i2 + 2); unsignedShort3 > 0; unsignedShort3--) {
                        iHashCode ^= readConst(readUnsignedShort(i2 + 4), cArr).hashCode();
                        i2 += 2;
                    }
                    i2 += 4;
                    Item item = new Item(i3);
                    item.a(i4, iHashCode & Integer.MAX_VALUE);
                    int length = item.j % itemArr.length;
                    item.k = itemArr[length];
                    itemArr[length] = item;
                }
                int i5 = readInt(iA + 4);
                ByteVector byteVector = new ByteVector(i5 + 62);
                byteVector.putByteArray(this.b, i, i5 - 2);
                classWriter.z = unsignedShort2;
                classWriter.A = byteVector;
                return;
            }
            iA += readInt(iA + 4) + 6;
        }
    }

    private void a(Context context) {
        int i;
        String str = context.g;
        Object[] objArr = context.s;
        int i2 = 0;
        if ((context.e & 8) == 0) {
            if (MethodDescription.CONSTRUCTOR_INTERNAL_NAME.equals(context.f)) {
                objArr[0] = Opcodes.UNINITIALIZED_THIS;
            } else {
                objArr[0] = readClass(this.header + 2, context.c);
            }
            i2 = 1;
        }
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt = str.charAt(i3);
            if (cCharAt == 'F') {
                i = i2 + 1;
                objArr[i2] = Opcodes.FLOAT;
            } else if (cCharAt != 'L') {
                if (cCharAt != 'S' && cCharAt != 'I') {
                    if (cCharAt == 'J') {
                        i = i2 + 1;
                        objArr[i2] = Opcodes.LONG;
                    } else if (cCharAt != 'Z') {
                        if (cCharAt != '[') {
                            switch (cCharAt) {
                                case 'B':
                                case 'C':
                                    break;
                                case 'D':
                                    i = i2 + 1;
                                    objArr[i2] = Opcodes.DOUBLE;
                                    break;
                                default:
                                    context.q = i2;
                                    return;
                            }
                        } else {
                            while (str.charAt(i4) == '[') {
                                i4++;
                            }
                            if (str.charAt(i4) == 'L') {
                                do {
                                    i4++;
                                } while (str.charAt(i4) != ';');
                            }
                            int i5 = i4 + 1;
                            objArr[i2] = str.substring(i3, i5);
                            i3 = i5;
                            i2++;
                        }
                    }
                }
                i = i2 + 1;
                objArr[i2] = Opcodes.INTEGER;
            } else {
                int i6 = i4;
                while (str.charAt(i6) != ';') {
                    i6++;
                }
                objArr[i2] = str.substring(i4, i6);
                i2++;
                i3 = i6 + 1;
            }
            i2 = i;
            i3 = i4;
        }
    }

    private int a() {
        int i = this.header;
        int unsignedShort = (readUnsignedShort(i + 6) * 2) + i + 8;
        for (int unsignedShort2 = readUnsignedShort(unsignedShort); unsignedShort2 > 0; unsignedShort2--) {
            for (int unsignedShort3 = readUnsignedShort(unsignedShort + 8); unsignedShort3 > 0; unsignedShort3--) {
                unsignedShort += readInt(unsignedShort + 12) + 6;
            }
            unsignedShort += 8;
        }
        int i2 = unsignedShort + 2;
        for (int unsignedShort4 = readUnsignedShort(i2); unsignedShort4 > 0; unsignedShort4--) {
            for (int unsignedShort5 = readUnsignedShort(i2 + 8); unsignedShort5 > 0; unsignedShort5--) {
                i2 += readInt(i2 + 12) + 6;
            }
            i2 += 8;
        }
        return i2 + 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0024, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        if (r2 >= r0.length) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        r3 = new byte[r2];
        java.lang.System.arraycopy(r0, 0, r3, 0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r0 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static byte[] a(java.io.InputStream r5, boolean r6) throws java.io.IOException {
        /*
            if (r5 == 0) goto L4b
            int r0 = r5.available()     // Catch: java.lang.Throwable -> L1d
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L1d
            r1 = 0
            r2 = r1
        La:
            int r3 = r0.length     // Catch: java.lang.Throwable -> L1d
            int r3 = r3 - r2
            int r3 = r5.read(r0, r2, r3)     // Catch: java.lang.Throwable -> L1d
            r4 = -1
            if (r3 != r4) goto L25
            int r3 = r0.length     // Catch: java.lang.Throwable -> L1d
            if (r2 >= r3) goto L1f
            byte[] r3 = new byte[r2]     // Catch: java.lang.Throwable -> L1d
            java.lang.System.arraycopy(r0, r1, r3, r1, r2)     // Catch: java.lang.Throwable -> L1d
            r0 = r3
            goto L1f
        L1d:
            r0 = move-exception
            goto L45
        L1f:
            if (r6 == 0) goto L24
            r5.close()
        L24:
            return r0
        L25:
            int r2 = r2 + r3
            int r3 = r0.length     // Catch: java.lang.Throwable -> L1d
            if (r2 != r3) goto La
            int r3 = r5.read()     // Catch: java.lang.Throwable -> L1d
            if (r3 >= 0) goto L35
            if (r6 == 0) goto L34
            r5.close()
        L34:
            return r0
        L35:
            int r4 = r0.length     // Catch: java.lang.Throwable -> L1d
            int r4 = r4 + 1000
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L1d
            java.lang.System.arraycopy(r0, r1, r4, r1, r2)     // Catch: java.lang.Throwable -> L1d
            int r0 = r2 + 1
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L1d
            r4[r2] = r3     // Catch: java.lang.Throwable -> L1d
            r2 = r0
            r0 = r4
            goto La
        L45:
            if (r6 == 0) goto L4a
            r5.close()
        L4a:
            throw r0
        L4b:
            java.lang.String r5 = "Class not found"
            top.suzhelan.qstory.hook.item.C5919.m11246(r5)
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.asm.ClassReader.a(java.io.InputStream, boolean):byte[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int[] a(com.esotericsoftware.asm.MethodVisitor r15, com.esotericsoftware.asm.Context r16, int r17, boolean r18) {
        /*
            r14 = this;
            r0 = r16
            r1 = r17
            char[] r2 = r0.c
            int r3 = r14.readUnsignedShort(r1)
            int[] r4 = new int[r3]
            r5 = 2
            int r1 = r1 + r5
            r6 = 0
        Lf:
            if (r6 >= r3) goto L92
            r4[r6] = r1
            int r7 = r14.readInt(r1)
            int r8 = r7 >>> 24
            r9 = 1
            if (r8 == 0) goto L59
            if (r8 == r9) goto L59
            r10 = 64
            if (r8 == r10) goto L35
            r10 = 65
            if (r8 == r10) goto L35
            switch(r8) {
                case 19: goto L32;
                case 20: goto L32;
                case 21: goto L32;
                case 22: goto L59;
                default: goto L29;
            }
        L29:
            switch(r8) {
                case 71: goto L2f;
                case 72: goto L2f;
                case 73: goto L2f;
                case 74: goto L2f;
                case 75: goto L2f;
                default: goto L2c;
            }
        L2c:
            int r1 = r1 + 3
            goto L5b
        L2f:
            int r1 = r1 + 4
            goto L5b
        L32:
            int r1 = r1 + 1
            goto L5b
        L35:
            int r10 = r1 + 1
            int r10 = r14.readUnsignedShort(r10)
        L3b:
            if (r10 <= 0) goto L2c
            int r11 = r1 + 3
            int r11 = r14.readUnsignedShort(r11)
            int r12 = r1 + 5
            int r12 = r14.readUnsignedShort(r12)
            com.esotericsoftware.asm.Label[] r13 = r0.h
            r14.readLabel(r11, r13)
            int r11 = r11 + r12
            com.esotericsoftware.asm.Label[] r12 = r0.h
            r14.readLabel(r11, r12)
            int r1 = r1 + 6
            int r10 = r10 + (-1)
            goto L3b
        L59:
            int r1 = r1 + 2
        L5b:
            int r10 = r14.readByte(r1)
            r11 = 66
            r12 = 0
            if (r8 != r11) goto L83
            if (r10 != 0) goto L67
            goto L6e
        L67:
            com.esotericsoftware.asm.TypePath r12 = new com.esotericsoftware.asm.TypePath
            byte[] r8 = r14.b
            r12.<init>(r8, r1)
        L6e:
            int r1 = p007.AbstractC6136.m11541(r10, r5, r9, r1)
            int r8 = r1 + 2
            java.lang.String r1 = r14.readUTF8(r1, r2)
            r11 = r18
            com.esotericsoftware.asm.AnnotationVisitor r1 = r15.visitTryCatchAnnotation(r7, r12, r1, r11)
            int r1 = r14.a(r8, r2, r9, r1)
            goto L8e
        L83:
            r11 = r18
            int r1 = r1 + 3
            int r10 = r10 * 2
            int r10 = r10 + r1
            int r1 = r14.a(r10, r2, r9, r12)
        L8e:
            int r6 = r6 + 1
            goto Lf
        L92:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.asm.ClassReader.a(com.esotericsoftware.asm.MethodVisitor, com.esotericsoftware.asm.Context, int, boolean):int[]");
    }
}
