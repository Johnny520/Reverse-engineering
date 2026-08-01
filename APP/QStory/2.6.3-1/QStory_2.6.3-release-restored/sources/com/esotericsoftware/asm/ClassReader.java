package com.esotericsoftware.asm;

import com.android.p002dx.p003cf.attrib.AttAnnotationDefault;
import com.android.p002dx.p003cf.attrib.AttBootstrapMethods;
import com.android.p002dx.p003cf.attrib.AttCode;
import com.android.p002dx.p003cf.attrib.AttConstantValue;
import com.android.p002dx.p003cf.attrib.AttDeprecated;
import com.android.p002dx.p003cf.attrib.AttEnclosingMethod;
import com.android.p002dx.p003cf.attrib.AttExceptions;
import com.android.p002dx.p003cf.attrib.AttInnerClasses;
import com.android.p002dx.p003cf.attrib.AttLineNumberTable;
import com.android.p002dx.p003cf.attrib.AttLocalVariableTable;
import com.android.p002dx.p003cf.attrib.AttLocalVariableTypeTable;
import com.android.p002dx.p003cf.attrib.AttRuntimeInvisibleAnnotations;
import com.android.p002dx.p003cf.attrib.AttRuntimeInvisibleParameterAnnotations;
import com.android.p002dx.p003cf.attrib.AttRuntimeVisibleAnnotations;
import com.android.p002dx.p003cf.attrib.AttRuntimeVisibleParameterAnnotations;
import com.android.p002dx.p003cf.attrib.AttSignature;
import com.android.p002dx.p003cf.attrib.AttSourceDebugExtension;
import com.android.p002dx.p003cf.attrib.AttSourceFile;
import com.android.p002dx.p003cf.attrib.AttSynthetic;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.google.protobuf.DescriptorProtos$Edition;
import java.io.IOException;
import java.io.InputStream;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.dynamic.ClassFileLocator;
import net.bytebuddy.pool.TypePool;
import p025.AbstractC7012;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: loaded from: classes.dex */
public class ClassReader {
    public static final int EXPAND_FRAMES = 8;
    public static final int SKIP_CODE = 1;
    public static final int SKIP_DEBUG = 2;
    public static final int SKIP_FRAMES = 4;

    /* JADX INFO: renamed from: a */
    private final int[] f109a;

    /* JADX INFO: renamed from: b */
    public final byte[] f110b;

    /* JADX INFO: renamed from: c */
    private final String[] f111c;

    /* JADX INFO: renamed from: d */
    private final int f112d;
    public final int header;

    public ClassReader(byte[] bArr, int i, int i2) {
        this.f110b = bArr;
        if (readShort(i + 6) > 52) {
            C6755.m11865();
            throw null;
        }
        int[] iArr = new int[readUnsignedShort(i + 8)];
        this.f109a = iArr;
        int length = iArr.length;
        this.f111c = new String[length];
        int i3 = i + 10;
        int i4 = 0;
        int i5 = 1;
        while (i5 < length) {
            int i6 = i3 + 1;
            this.f109a[i5] = i6;
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
        this.f112d = i4;
        this.header = i3;
    }

    /* JADX INFO: renamed from: a */
    private void m55a(MethodVisitor methodVisitor, Context context, int i) {
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
        byte[] bArr3 = classReader3.f110b;
        char[] cArr2 = context.f156c;
        int unsignedShort3 = classReader3.readUnsignedShort(i24);
        int unsignedShort4 = classReader3.readUnsignedShort(i24 + 2);
        int i25 = classReader3.readInt(i24 + 4);
        int i26 = i24 + 8;
        int i27 = i26 + i25;
        Label[] labelArr4 = new Label[i25 + 2];
        context.f161h = labelArr4;
        classReader3.readLabel(i25 + 1, labelArr4);
        int i28 = i26;
        while (i28 < i27) {
            int i29 = i28 - i26;
            switch (ClassWriter.f114a[bArr3[i28] & DefaultClassResolver.NAME]) {
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
            methodVisitor3.visitTryCatchBlock(classReader3.readLabel(classReader3.readUnsignedShort(i28 + 2), labelArr4), classReader3.readLabel(classReader3.readUnsignedShort(i28 + 4), labelArr4), classReader3.readLabel(classReader3.readUnsignedShort(i34 + 6), labelArr4), classReader3.readUTF8(classReader3.f109a[classReader3.readUnsignedShort(i36)], cArr2));
            unsignedShort5 = i35 - 1;
            i28 = i36;
        }
        int i37 = i28 + 2;
        boolean z10 = (context.f155b & 8) != 0;
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
        int[] iArrM57a = null;
        while (unsignedShort6 > 0) {
            String utf8 = classReader3.readUTF8(i43 + 2, cArr2);
            if (!AttLocalVariableTable.ATTRIBUTE_NAME.equals(utf8)) {
                iArr4 = iArrM57a;
                z3 = z10;
                if (AttLocalVariableTypeTable.ATTRIBUTE_NAME.equals(utf8)) {
                    Label[] labelArr5 = labelArr4;
                    classReader = classReader3;
                    labelArr2 = labelArr5;
                    i41 = i43 + 8;
                    bArr = bArr3;
                    iArrM57a = iArr4;
                    z4 = z3;
                } else if (AttLineNumberTable.ATTRIBUTE_NAME.equals(utf8)) {
                    if ((context.f155b & 2) == 0) {
                        int unsignedShort9 = classReader3.readUnsignedShort(i43 + 8);
                        int i44 = i43;
                        while (unsignedShort9 > 0) {
                            int unsignedShort10 = classReader3.readUnsignedShort(i44 + 10);
                            if (labelArr4[unsignedShort10] == null) {
                                i21 = unsignedShort9;
                                classReader3.readLabel(unsignedShort10, labelArr4).f218a |= 1;
                            } else {
                                i21 = unsignedShort9;
                            }
                            Label label = labelArr4[unsignedShort10];
                            while (label.f219b > 0) {
                                if (label.f228k == null) {
                                    label.f228k = new Label();
                                }
                                label = label.f228k;
                            }
                            label.f219b = classReader3.readUnsignedShort(i44 + 12);
                            i44 += 4;
                            unsignedShort9 = i21 - 1;
                        }
                    }
                    z8 = false;
                } else if ("RuntimeVisibleTypeAnnotations".equals(utf8)) {
                    boolean z12 = z9;
                    iArrM57a = classReader3.m57a(methodVisitor3, context, i43 + 8, z12);
                    unsignedShort7 = (iArrM57a.length == 0 || classReader3.readByte(iArrM57a[0]) < 67) ? -1 : classReader3.readUnsignedShort(iArrM57a[0] + (z12 ? 1 : 0));
                    Label[] labelArr6 = labelArr4;
                    classReader = classReader3;
                    labelArr2 = labelArr6;
                    bArr = bArr3;
                    z4 = z3;
                    z9 = true;
                } else if ("RuntimeInvisibleTypeAnnotations".equals(utf8)) {
                    z6 = false;
                    int[] iArrM57a2 = classReader3.m57a(methodVisitor3, context, i43 + 8, false);
                    if (iArrM57a2.length == 0 || classReader3.readByte(iArrM57a2[0]) < 67) {
                        z9 = true;
                        unsignedShort8 = -1;
                    } else {
                        z9 = true;
                        unsignedShort8 = classReader3.readUnsignedShort(iArrM57a2[0] + 1);
                    }
                    Label[] labelArr7 = labelArr4;
                    classReader = classReader3;
                    labelArr2 = labelArr7;
                    iArr6 = iArrM57a2;
                    bArr = bArr3;
                    z7 = z6;
                    iArrM57a = iArr4;
                    z4 = z3;
                } else {
                    boolean z13 = false;
                    z9 = true;
                    if ("StackMapTable".equals(utf8)) {
                        z8 = z13;
                        if ((context.f155b & 4) == 0) {
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
                            iArrM57a = iArr4;
                            z4 = z3;
                        }
                    } else if ("StackMap".equals(utf8)) {
                        z8 = z13;
                        if ((context.f155b & 4) == 0) {
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
                            iArrM57a = iArr4;
                            z4 = z3;
                        }
                    } else {
                        int i47 = 0;
                        Attribute attribute2 = attribute;
                        while (true) {
                            Attribute[] attributeArr = context.f154a;
                            char[] cArr3 = cArr2;
                            if (i47 < attributeArr.length) {
                                if (attributeArr[i47].type.equals(utf8)) {
                                    str2 = utf8;
                                    i20 = i47;
                                    bArr2 = bArr3;
                                    cArr2 = cArr3;
                                    iArr5 = iArr4;
                                    z5 = z3;
                                    Attribute attribute3 = context.f154a[i47].read(classReader3, i43 + 8, classReader3.readInt(i43 + 4), cArr2, i24, labelArr4);
                                    Label[] labelArr10 = labelArr4;
                                    classReader2 = classReader3;
                                    labelArr3 = labelArr10;
                                    if (attribute3 != null) {
                                        attribute3.f105a = attribute2;
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
                                iArrM57a = iArr4;
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
            } else if ((context.f155b & 2) == 0) {
                int i48 = i43 + 8;
                int unsignedShort13 = classReader3.readUnsignedShort(i48);
                int i49 = i43;
                while (unsignedShort13 > 0) {
                    int[] iArr7 = iArrM57a;
                    int i50 = i49 + 10;
                    boolean z14 = z10;
                    int unsignedShort14 = classReader3.readUnsignedShort(i50);
                    if (labelArr4[unsignedShort14] == null) {
                        i22 = i50;
                        i23 = unsignedShort14;
                        classReader3.readLabel(unsignedShort14, labelArr4).f218a |= 1;
                    } else {
                        i22 = i50;
                        i23 = unsignedShort14;
                    }
                    int unsignedShort15 = classReader3.readUnsignedShort(i49 + 12) + i23;
                    if (labelArr4[unsignedShort15] == null) {
                        classReader3.readLabel(unsignedShort15, labelArr4).f218a |= 1;
                    }
                    unsignedShort13--;
                    i49 = i22;
                    iArrM57a = iArr7;
                    z10 = z14;
                }
                int[] iArr8 = iArrM57a;
                Label[] labelArr13 = labelArr4;
                classReader = classReader3;
                labelArr2 = labelArr13;
                z4 = z10;
                i40 = i48;
                bArr = bArr3;
                iArrM57a = iArr8;
                i43 = classReader.readInt(i43 + 4) + 6 + i43;
                unsignedShort6--;
                ClassReader classReader52 = classReader;
                labelArr4 = labelArr2;
                classReader3 = classReader52;
                i24 = i;
                bArr3 = bArr;
                z10 = z4;
            } else {
                iArr4 = iArrM57a;
                z3 = z10;
                z8 = false;
            }
            Label[] labelArr14 = labelArr4;
            classReader = classReader3;
            labelArr2 = labelArr14;
            z6 = z8;
            bArr = bArr3;
            z7 = z6;
            iArrM57a = iArr4;
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
        int[] iArr9 = iArrM57a;
        boolean z15 = z10;
        byte[] bArr4 = bArr3;
        int i51 = 0;
        if (i38 != 0) {
            context.f167o = -1;
            context.f168p = 0;
            context.f169q = 0;
            context.f170r = 0;
            context.f172t = 0;
            context.f171s = new Object[unsignedShort4];
            context.f173u = new Object[unsignedShort3];
            z = z15;
            if (z) {
                classReader6.m54a(context);
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
                label2.f228k = null;
                methodVisitor3.visitLabel(label2);
                if ((context.f155b & 2) == 0 && (i19 = label2.f219b) > 0) {
                    methodVisitor3.visitLineNumber(i19, label2);
                    for (Label label3 = label2.f228k; label3 != null; label3 = label3.f228k) {
                        methodVisitor3.visitLineNumber(label3.f219b, label2);
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
                    int i57 = context5.f167o;
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
                            methodVisitor2.visitFrame(-1, context5.f169q, context5.f171s, context5.f172t, context5.f173u);
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
                            methodVisitor4.visitFrame(context5.f168p, context5.f170r, context5.f171s, context5.f172t, context5.f173u);
                            methodVisitor2 = methodVisitor;
                        }
                        if (i42 > 0) {
                            int iM45a = classReader6.m45a(i16, z2, z, context5);
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
                            i38 = iM45a;
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
            switch (ClassWriter.f114a[i66]) {
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
                    int i69 = classReader6.f109a[classReader6.readUnsignedShort(i61 + 1)];
                    boolean z20 = bArr4[i69 + (-1)] == 11 ? z9 : false;
                    String str3 = classReader6.readClass(i69, cArr4);
                    int i70 = classReader6.f109a[classReader6.readUnsignedShort(i69 + 2)];
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
                    int i71 = classReader6.f109a[classReader6.readUnsignedShort(i61 + 1)];
                    int i72 = context.f157d[classReader6.readUnsignedShort(i71)];
                    Handle handle = (Handle) classReader6.readConst(classReader6.readUnsignedShort(i72), cArr4);
                    int unsignedShort16 = classReader6.readUnsignedShort(i72 + 2);
                    Object[] objArr = new Object[unsignedShort16];
                    int i73 = i72 + 4;
                    int i74 = 0;
                    while (true) {
                        int i75 = i71;
                        if (i74 >= unsignedShort16) {
                            int i76 = classReader6.f109a[classReader6.readUnsignedShort(i75 + 2)];
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
                    int iM49a = classReader6.m49a(context, iArr3[i7]);
                    i11 = i7;
                    i12 = i6;
                    boolean z21 = z9;
                    classReader6.m47a(iM49a + 2, cArr4, z21, methodVisitor5.visitInsnAnnotation(context.f162i, context.f163j, classReader6.readUTF8(iM49a, cArr4), z21));
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
                    int iM49a2 = classReader6.m49a(context, iArr11[i92]);
                    i9 = i92;
                    i10 = unsignedShort;
                    context4 = context5;
                    classReader6.m47a(iM49a2 + 2, cArr4, true, methodVisitor5.visitInsnAnnotation(context.f162i, context.f163j, classReader6.readUTF8(iM49a2, cArr4), false));
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
        if ((context.f155b & 2) == 0 && (i2 = i40) != 0) {
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
                    int iM49a3 = classReader7.m49a(context, iArr12[i100]);
                    iArr = iArr12;
                    classReader7.m47a(iM49a3 + 2, cArr5, true, methodVisitor.visitLocalVariableAnnotation(context.f162i, context.f163j, context.f164l, context.f165m, context.f166n, classReader7.readUTF8(iM49a3, cArr5), true));
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
                    int iM49a4 = classReader7.m49a(context, iArr15[i101]);
                    classReader7.m47a(iM49a4 + 2, cArr5, true, methodVisitor.visitLocalVariableAnnotation(context.f162i, context.f163j, context.f164l, context.f165m, context.f166n, classReader7.readUTF8(iM49a4, cArr5), false));
                }
            }
        }
        Attribute attribute4 = attribute;
        while (attribute4 != null) {
            Attribute attribute5 = attribute4.f105a;
            attribute4.f105a = null;
            methodVisitor.visitAttribute(attribute4);
            attribute4 = attribute5;
        }
        methodVisitor.visitMaxs(unsignedShort3, unsignedShort4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x01bc, code lost:
    
        if (r6 == 0) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e6  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int m58b(ClassVisitor classVisitor, Context context, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Attribute attribute;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        char[] cArr = context.f156c;
        context.f158e = readUnsignedShort(i);
        context.f159f = readUTF8(i + 2, cArr);
        context.f160g = readUTF8(i + 4, cArr);
        int i14 = i + 6;
        int unsignedShort = readUnsignedShort(i14);
        int i15 = i14;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        Attribute attributeM51a = null;
        int i21 = 0;
        int i22 = 0;
        String utf8 = null;
        String[] strArr = null;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        while (unsignedShort > 0) {
            String utf82 = readUTF8(i15 + 2, cArr);
            if (!AttCode.ATTRIBUTE_NAME.equals(utf82)) {
                if (AttExceptions.ATTRIBUTE_NAME.equals(utf82)) {
                    int unsignedShort2 = readUnsignedShort(i15 + 8);
                    String[] strArr2 = new String[unsignedShort2];
                    i4 = i17;
                    int i26 = i15 + 10;
                    i3 = i16;
                    for (int i27 = 0; i27 < unsignedShort2; i27++) {
                        strArr2[i27] = readClass(i26, cArr);
                        i26 += 2;
                    }
                    i24 = i26;
                    strArr = strArr2;
                } else {
                    i3 = i16;
                    i4 = i17;
                    if (AttSignature.ATTRIBUTE_NAME.equals(utf82)) {
                        utf8 = readUTF8(i15 + 8, cArr);
                    } else {
                        if (AttDeprecated.ATTRIBUTE_NAME.equals(utf82)) {
                            i12 = context.f158e;
                            i13 = 131072;
                        } else if (AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME.equals(utf82)) {
                            i21 = i15 + 8;
                        } else if ("RuntimeVisibleTypeAnnotations".equals(utf82)) {
                            i17 = i15 + 8;
                            i10 = unsignedShort;
                            i16 = i3;
                            i7 = i15;
                        } else if (AttAnnotationDefault.ATTRIBUTE_NAME.equals(utf82)) {
                            i16 = i15 + 8;
                            i7 = i15;
                            i17 = i4;
                            i10 = unsignedShort;
                        } else if (AttSynthetic.ATTRIBUTE_NAME.equals(utf82)) {
                            i12 = context.f158e;
                            i13 = 266240;
                        } else if (AttRuntimeInvisibleAnnotations.ATTRIBUTE_NAME.equals(utf82)) {
                            i22 = i15 + 8;
                        } else if ("RuntimeInvisibleTypeAnnotations".equals(utf82)) {
                            i18 = i15 + 8;
                        } else if (AttRuntimeVisibleParameterAnnotations.ATTRIBUTE_NAME.equals(utf82)) {
                            i20 = i15 + 8;
                        } else if (AttRuntimeInvisibleParameterAnnotations.ATTRIBUTE_NAME.equals(utf82)) {
                            i19 = i15 + 8;
                        } else if ("MethodParameters".equals(utf82)) {
                            i23 = i15 + 8;
                        } else {
                            Attribute[] attributeArr = context.f154a;
                            int i28 = i18;
                            int i29 = i15 + 8;
                            int i30 = readInt(i15 + 4);
                            int i31 = unsignedShort;
                            i5 = i28;
                            i6 = i3;
                            i7 = i15;
                            attribute = attributeM51a;
                            i8 = i19;
                            i9 = i4;
                            i10 = i31;
                            i11 = i20;
                            attributeM51a = m51a(attributeArr, utf82, i29, i30, cArr, -1, null);
                            if (attributeM51a != null) {
                                attributeM51a.f105a = attribute;
                                i16 = i6;
                                i17 = i9;
                                i18 = i5;
                            } else {
                                i16 = i6;
                                i17 = i9;
                                i18 = i5;
                                attributeM51a = attribute;
                            }
                            i19 = i8;
                            i20 = i11;
                        }
                        context.f158e = i12 | i13;
                        i8 = i19;
                        i11 = i20;
                        i9 = i4;
                        i6 = i3;
                        i10 = unsignedShort;
                        i7 = i15;
                        i5 = i18;
                        attribute = attributeM51a;
                        i16 = i6;
                        i17 = i9;
                        i18 = i5;
                        attributeM51a = attribute;
                        i19 = i8;
                        i20 = i11;
                    }
                }
                i17 = i4;
                i16 = i3;
                i10 = unsignedShort;
                i7 = i15;
            } else if ((context.f155b & 1) == 0) {
                i25 = i15 + 8;
                i10 = unsignedShort;
                i7 = i15;
            } else {
                i6 = i16;
                i9 = i17;
                i8 = i19;
                i11 = i20;
                i10 = unsignedShort;
                i7 = i15;
                i5 = i18;
                attribute = attributeM51a;
                i16 = i6;
                i17 = i9;
                i18 = i5;
                attributeM51a = attribute;
                i19 = i8;
                i20 = i11;
            }
            i15 = readInt(i7 + 4) + 6 + i7;
            unsignedShort = i10 - 1;
        }
        int i32 = i16;
        int i33 = i17;
        int i34 = i18;
        int i35 = i19;
        int i36 = i20;
        int i37 = i15;
        boolean z = true;
        Attribute attribute2 = attributeM51a;
        int i38 = i37 + 2;
        int i39 = i22;
        int i40 = i21;
        MethodVisitor methodVisitorVisitMethod = classVisitor.visitMethod(context.f158e, context.f159f, context.f160g, utf8, strArr);
        String str = utf8;
        String[] strArr3 = strArr;
        if (methodVisitorVisitMethod == null) {
            return i38;
        }
        if (methodVisitorVisitMethod instanceof MethodWriter) {
            MethodWriter methodWriter = (MethodWriter) methodVisitorVisitMethod;
            if (methodWriter.f257b.f126M == this && str == methodWriter.f262g) {
                int i41 = methodWriter.f265j;
                if (strArr3 != null) {
                    if (strArr3.length == i41) {
                        int length = strArr3.length - 1;
                        while (length >= 0) {
                            int i42 = i24 - 2;
                            i2 = i38;
                            if (methodWriter.f266k[length] == readUnsignedShort(i42)) {
                                length--;
                                i24 = i42;
                                i38 = i2;
                            }
                        }
                        int i43 = i38;
                        methodWriter.f263h = i14;
                        methodWriter.f264i = i43 - i14;
                        return i43;
                    }
                }
            } else {
                i2 = i38;
            }
        }
        if (i23 != 0) {
            int i44 = this.f110b[i23] & DefaultClassResolver.NAME;
            int i45 = i23 + 1;
            while (i44 > 0) {
                methodVisitorVisitMethod.visitParameter(readUTF8(i45, cArr), readUnsignedShort(i45 + 2));
                i44--;
                i45 += 4;
            }
        }
        if (i32 != 0) {
            AnnotationVisitor annotationVisitorVisitAnnotationDefault = methodVisitorVisitMethod.visitAnnotationDefault();
            m46a(i32, cArr, (String) null, annotationVisitorVisitAnnotationDefault);
            if (annotationVisitorVisitAnnotationDefault != null) {
                annotationVisitorVisitAnnotationDefault.visitEnd();
            }
        }
        if (i40 != 0) {
            int unsignedShort3 = readUnsignedShort(i40);
            int iM47a = i40 + 2;
            while (unsignedShort3 > 0) {
                boolean z2 = z;
                iM47a = m47a(iM47a + 2, cArr, z2, methodVisitorVisitMethod.visitAnnotation(readUTF8(iM47a, cArr), z2));
                unsignedShort3--;
                z = true;
            }
        }
        if (i39 != 0) {
            int iM47a2 = i39 + 2;
            for (int unsignedShort4 = readUnsignedShort(i39); unsignedShort4 > 0; unsignedShort4--) {
                iM47a2 = m47a(iM47a2 + 2, cArr, true, methodVisitorVisitMethod.visitAnnotation(readUTF8(iM47a2, cArr), false));
            }
        }
        if (i33 != 0) {
            int iM47a3 = i33 + 2;
            for (int unsignedShort5 = readUnsignedShort(i33); unsignedShort5 > 0; unsignedShort5--) {
                int iM49a = m49a(context, iM47a3);
                iM47a3 = m47a(iM49a + 2, cArr, true, methodVisitorVisitMethod.visitTypeAnnotation(context.f162i, context.f163j, readUTF8(iM49a, cArr), true));
            }
        }
        if (i34 != 0) {
            int iM47a4 = i34 + 2;
            for (int unsignedShort6 = readUnsignedShort(i34); unsignedShort6 > 0; unsignedShort6--) {
                int iM49a2 = m49a(context, iM47a4);
                iM47a4 = m47a(iM49a2 + 2, cArr, true, methodVisitorVisitMethod.visitTypeAnnotation(context.f162i, context.f163j, readUTF8(iM49a2, cArr), false));
            }
        }
        if (i36 != 0) {
            m59b(methodVisitorVisitMethod, context, i36, true);
        }
        if (i35 != 0) {
            m59b(methodVisitorVisitMethod, context, i35, false);
        }
        Attribute attribute3 = attribute2;
        while (attribute3 != null) {
            Attribute attribute4 = attribute3.f105a;
            attribute3.f105a = null;
            methodVisitorVisitMethod.visitAttribute(attribute3);
            attribute3 = attribute4;
        }
        int i46 = i25;
        if (i46 != 0) {
            methodVisitorVisitMethod.visitCode();
            m55a(methodVisitorVisitMethod, context, i46);
        }
        methodVisitorVisitMethod.visitEnd();
        return i2;
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
        char[] cArr = new char[classReader2.f112d];
        Context context = new Context();
        context.f154a = attributeArr;
        context.f155b = i;
        context.f156c = cArr;
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
        int iM44a = classReader2.m44a();
        int i8 = iM44a;
        int i9 = unsignedShort;
        int unsignedShort3 = classReader2.readUnsignedShort(iM44a);
        String utf8 = null;
        String strM52a = null;
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
                        utf83 = classReader2.readUTF8(classReader2.f109a[unsignedShort4], cArr);
                        utf82 = classReader2.readUTF8(classReader2.f109a[unsignedShort4] + 2, cArr);
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
                            strM52a = classReader2.m52a(i8 + 8, i15, new char[i15]);
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
                                context.f157d = iArr;
                                classReader = classReader2;
                                i2 = unsignedShort2;
                                strArr = strArr2;
                                str = str9;
                                str2 = str10;
                                i3 = i10;
                                str3 = str7;
                                str4 = str8;
                                str6 = strM52a;
                                str5 = utf82;
                                attribute = attribute2;
                            } else {
                                strArr = strArr2;
                                str = str9;
                                str2 = str10;
                                str3 = str7;
                                str4 = str8;
                                str5 = utf82;
                                str6 = strM52a;
                                i2 = unsignedShort2;
                                i3 = i10;
                                Attribute attributeM51a = classReader2.m51a(attributeArr, utf85, i8 + 8, classReader2.readInt(i8 + 4), cArr, -1, null);
                                classReader = classReader2;
                                attribute = attribute2;
                                if (attributeM51a != null) {
                                    attributeM51a.f105a = attribute;
                                    attribute2 = attributeM51a;
                                }
                                utf8 = str2;
                                strM52a = str6;
                                utf82 = str5;
                                i10 = i3;
                            }
                            attribute2 = attribute;
                            utf8 = str2;
                            strM52a = str6;
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
        String str17 = strM52a;
        classVisitor.visit(classReader3.readInt(classReader3.f109a[1] - 7), i9, str16, utf84, str13, strArr3);
        if ((i & 2) == 0 && (str12 != null || str17 != null)) {
            classVisitor.visitSource(str12, str17);
        }
        if (str14 != null) {
            classVisitor.visitOuterClass(str14, utf83, str15);
        }
        if (i18 != 0) {
            int unsignedShort7 = classReader3.readUnsignedShort(i18);
            int iM47a = i18 + 2;
            while (unsignedShort7 > 0) {
                boolean z2 = z;
                iM47a = classReader3.m47a(iM47a + 2, cArr, z2, classVisitor.visitAnnotation(classReader3.readUTF8(iM47a, cArr), z2));
                unsignedShort7--;
                z = true;
            }
        }
        if (i11 != 0) {
            int iM47a2 = i11 + 2;
            for (int unsignedShort8 = classReader3.readUnsignedShort(i11); unsignedShort8 > 0; unsignedShort8--) {
                iM47a2 = classReader3.m47a(iM47a2 + 2, cArr, true, classVisitor.visitAnnotation(classReader3.readUTF8(iM47a2, cArr), false));
            }
        }
        int i19 = i12;
        if (i19 != 0) {
            int iM47a3 = i19 + 2;
            for (int unsignedShort9 = classReader3.readUnsignedShort(i19); unsignedShort9 > 0; unsignedShort9--) {
                int iM49a = classReader3.m49a(context, iM47a3);
                iM47a3 = classReader3.m47a(iM49a + 2, cArr, true, classVisitor.visitTypeAnnotation(context.f162i, context.f163j, classReader3.readUTF8(iM49a, cArr), true));
            }
        }
        int i20 = i13;
        if (i20 != 0) {
            int iM47a4 = i20 + 2;
            for (int unsignedShort10 = classReader3.readUnsignedShort(i20); unsignedShort10 > 0; unsignedShort10--) {
                int iM49a2 = classReader3.m49a(context, iM47a4);
                iM47a4 = classReader3.m47a(iM49a2 + 2, cArr, true, classVisitor.visitTypeAnnotation(context.f162i, context.f163j, classReader3.readUTF8(iM49a2, cArr), false));
            }
        }
        Attribute attribute3 = attribute2;
        while (attribute3 != null) {
            Attribute attribute4 = attribute3.f105a;
            attribute3.f105a = null;
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
        int iM48a = (i17 * 2) + classReader3.header + 10;
        for (int unsignedShort12 = classReader3.readUnsignedShort(iM48a - 2); unsignedShort12 > 0; unsignedShort12--) {
            iM48a = classReader3.m48a(classVisitor, context, iM48a);
        }
        int iM58b = iM48a + 2;
        for (int unsignedShort13 = classReader3.readUnsignedShort(iM48a); unsignedShort13 > 0; unsignedShort13--) {
            iM58b = classReader3.m58b(classVisitor, context, iM58b);
        }
        classVisitor.visitEnd();
    }

    public int getAccess() {
        return readUnsignedShort(this.header);
    }

    public String getClassName() {
        return readClass(this.header + 2, new char[this.f112d]);
    }

    public String[] getInterfaces() {
        int i = this.header + 6;
        int unsignedShort = readUnsignedShort(i);
        String[] strArr = new String[unsignedShort];
        if (unsignedShort > 0) {
            char[] cArr = new char[this.f112d];
            for (int i2 = 0; i2 < unsignedShort; i2++) {
                i += 2;
                strArr[i2] = readClass(i, cArr);
            }
        }
        return strArr;
    }

    public int getItem(int i) {
        return this.f109a[i];
    }

    public int getItemCount() {
        return this.f109a.length;
    }

    public int getMaxStringLength() {
        return this.f112d;
    }

    public String getSuperName() {
        return readClass(this.header + 4, new char[this.f112d]);
    }

    public int readByte(int i) {
        return this.f110b[i] & DefaultClassResolver.NAME;
    }

    public String readClass(int i, char[] cArr) {
        return readUTF8(this.f109a[readUnsignedShort(i)], cArr);
    }

    public Object readConst(int i, char[] cArr) {
        int i2 = this.f109a[i];
        byte b = this.f110b[i2 - 1];
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
                int[] iArr = this.f109a;
                int i4 = iArr[readUnsignedShort(i2 + 1)];
                boolean z = this.f110b[i4 + (-1)] == 11;
                String str = readClass(i4, cArr);
                int i5 = iArr[readUnsignedShort(i4 + 2)];
                return new Handle(i3, str, readUTF8(i5, cArr), readUTF8(i5 + 2, cArr), z);
        }
    }

    public int readInt(int i) {
        byte[] bArr = this.f110b;
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
        byte[] bArr = this.f110b;
        return (short) ((bArr[i + 1] & DefaultClassResolver.NAME) | ((bArr[i] & DefaultClassResolver.NAME) << 8));
    }

    public String readUTF8(int i, char[] cArr) {
        int unsignedShort = readUnsignedShort(i);
        if (i == 0 || unsignedShort == 0) {
            return null;
        }
        String[] strArr = this.f111c;
        String str = strArr[unsignedShort];
        if (str != null) {
            return str;
        }
        int i2 = this.f109a[unsignedShort];
        String strM52a = m52a(i2 + 2, readUnsignedShort(i2), cArr);
        strArr[unsignedShort] = strM52a;
        return strM52a;
    }

    public int readUnsignedShort(int i) {
        byte[] bArr = this.f110b;
        return (bArr[i + 1] & DefaultClassResolver.NAME) | ((bArr[i] & DefaultClassResolver.NAME) << 8);
    }

    public ClassReader(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/'));
        stringBuffer.append(ClassFileLocator.CLASS_FILE_EXTENSION);
        this(m56a(ClassLoader.getSystemResourceAsStream(stringBuffer.toString()), true));
    }

    public ClassReader(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public ClassReader(InputStream inputStream) {
        this(m56a(inputStream, false));
    }

    /* JADX INFO: renamed from: b */
    private void m59b(MethodVisitor methodVisitor, Context context, int i, boolean z) {
        int iM47a = i + 1;
        int i2 = this.f110b[i] & DefaultClassResolver.NAME;
        int length = Type.getArgumentTypes(context.f160g).length - i2;
        int i3 = 0;
        while (i3 < length) {
            AnnotationVisitor annotationVisitorVisitParameterAnnotation = methodVisitor.visitParameterAnnotation(i3, "Ljava/lang/Synthetic;", false);
            if (annotationVisitorVisitParameterAnnotation != null) {
                annotationVisitorVisitParameterAnnotation.visitEnd();
            }
            i3++;
        }
        char[] cArr = context.f156c;
        while (i3 < i2 + length) {
            iM47a += 2;
            for (int unsignedShort = readUnsignedShort(iM47a); unsignedShort > 0; unsignedShort--) {
                iM47a = m47a(iM47a + 2, cArr, true, methodVisitor.visitParameterAnnotation(i3, readUTF8(iM47a, cArr), z));
            }
            i3++;
        }
    }

    public void accept(ClassVisitor classVisitor, int i) {
        accept(classVisitor, new Attribute[0], i);
    }

    /* JADX INFO: renamed from: a */
    private int m45a(int i, boolean z, boolean z2, Context context) {
        int iM50a;
        int i2;
        ClassReader classReader;
        char[] cArr = context.f156c;
        Label[] labelArr = context.f161h;
        if (z) {
            int i3 = i + 1;
            i2 = this.f110b[i] & DefaultClassResolver.NAME;
            iM50a = i3;
        } else {
            context.f167o = -1;
            iM50a = i;
            i2 = 255;
        }
        int i4 = 0;
        context.f170r = 0;
        if (i2 < 64) {
            context.f168p = 3;
            context.f172t = 0;
            classReader = this;
        } else if (i2 < 128) {
            i2 -= 64;
            classReader = this;
            iM50a = classReader.m50a(context.f173u, 0, iM50a, cArr, labelArr);
            context.f168p = 4;
            context.f172t = 1;
        } else {
            int unsignedShort = readUnsignedShort(iM50a);
            int i5 = iM50a;
            iM50a = i5 + 2;
            if (i2 == 247) {
                classReader = this;
                iM50a = classReader.m50a(context.f173u, 0, iM50a, cArr, labelArr);
                context.f168p = 4;
                context.f172t = 1;
            } else {
                if (i2 >= 248 && i2 < 251) {
                    context.f168p = 2;
                    int i6 = 251 - i2;
                    context.f170r = i6;
                    context.f169q -= i6;
                } else if (i2 != 251) {
                    if (i2 >= 255) {
                        classReader = this;
                        context.f168p = 0;
                        int unsignedShort2 = classReader.readUnsignedShort(iM50a);
                        int iM50a2 = i5 + 4;
                        context.f170r = unsignedShort2;
                        context.f169q = unsignedShort2;
                        int i7 = 0;
                        while (unsignedShort2 > 0) {
                            iM50a2 = classReader.m50a(context.f171s, i7, iM50a2, cArr, labelArr);
                            unsignedShort2--;
                            i7++;
                        }
                        int unsignedShort3 = classReader.readUnsignedShort(iM50a2);
                        iM50a = iM50a2 + 2;
                        context.f172t = unsignedShort3;
                        while (true) {
                            int i8 = i4;
                            if (unsignedShort3 <= 0) {
                                break;
                            }
                            i4 = i8 + 1;
                            iM50a = classReader.m50a(context.f173u, i8, iM50a, cArr, labelArr);
                            unsignedShort3--;
                        }
                    } else {
                        int i9 = i2 - 251;
                        int i10 = z2 ? context.f169q : 0;
                        int i11 = i9;
                        while (i11 > 0) {
                            iM50a = m50a(context.f171s, i10, iM50a, cArr, labelArr);
                            i11--;
                            i10++;
                        }
                        classReader = this;
                        context.f168p = 1;
                        context.f170r = i9;
                        context.f169q += i9;
                        context.f172t = 0;
                    }
                } else {
                    context.f168p = 3;
                }
                context.f172t = 0;
                classReader = this;
            }
            i2 = unsignedShort;
        }
        int i12 = i2 + 1 + context.f167o;
        context.f167o = i12;
        classReader.readLabel(i12, labelArr);
        return iM50a;
    }

    /* JADX INFO: renamed from: a */
    private int m46a(int i, char[] cArr, String str, AnnotationVisitor annotationVisitor) {
        byte[] bArr = this.f110b;
        int i2 = 0;
        if (annotationVisitor == null) {
            int i3 = bArr[i] & DefaultClassResolver.NAME;
            return i3 != 64 ? i3 != 91 ? i3 != 101 ? i + 3 : i + 5 : m47a(i + 1, cArr, false, (AnnotationVisitor) null) : m47a(i + 3, cArr, true, (AnnotationVisitor) null);
        }
        int i4 = i + 1;
        int i5 = bArr[i] & DefaultClassResolver.NAME;
        if (i5 == 64) {
            return m47a(i + 3, cArr, true, annotationVisitor.visitAnnotation(str, readUTF8(i4, cArr)));
        }
        if (i5 != 70) {
            if (i5 == 83) {
                annotationVisitor.visit(str, new Short((short) readInt(this.f109a[readUnsignedShort(i4)])));
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
                    annotationVisitor.visit(str, readInt(this.f109a[readUnsignedShort(i4)]) == 0 ? Boolean.FALSE : Boolean.TRUE);
                    return i + 3;
                }
                if (i5 == 91) {
                    int unsignedShort = readUnsignedShort(i4);
                    int i6 = i + 3;
                    if (unsignedShort == 0) {
                        return m47a(i + 1, cArr, false, annotationVisitor.visitArray(str));
                    }
                    int i7 = i + 4;
                    int i8 = this.f110b[i6] & DefaultClassResolver.NAME;
                    if (i8 == 70) {
                        float[] fArr = new float[unsignedShort];
                        while (i2 < unsignedShort) {
                            fArr[i2] = Float.intBitsToFloat(readInt(this.f109a[readUnsignedShort(i7)]));
                            i7 += 3;
                            i2++;
                        }
                        annotationVisitor.visit(str, fArr);
                    } else if (i8 == 83) {
                        short[] sArr = new short[unsignedShort];
                        while (i2 < unsignedShort) {
                            sArr[i2] = (short) readInt(this.f109a[readUnsignedShort(i7)]);
                            i7 += 3;
                            i2++;
                        }
                        annotationVisitor.visit(str, sArr);
                    } else if (i8 == 90) {
                        boolean[] zArr = new boolean[unsignedShort];
                        for (int i9 = 0; i9 < unsignedShort; i9++) {
                            zArr[i9] = readInt(this.f109a[readUnsignedShort(i7)]) != 0;
                            i7 += 3;
                        }
                        annotationVisitor.visit(str, zArr);
                    } else if (i8 == 73) {
                        int[] iArr = new int[unsignedShort];
                        while (i2 < unsignedShort) {
                            iArr[i2] = readInt(this.f109a[readUnsignedShort(i7)]);
                            i7 += 3;
                            i2++;
                        }
                        annotationVisitor.visit(str, iArr);
                    } else if (i8 != 74) {
                        switch (i8) {
                            case 66:
                                byte[] bArr2 = new byte[unsignedShort];
                                while (i2 < unsignedShort) {
                                    bArr2[i2] = (byte) readInt(this.f109a[readUnsignedShort(i7)]);
                                    i7 += 3;
                                    i2++;
                                }
                                annotationVisitor.visit(str, bArr2);
                                break;
                            case 67:
                                char[] cArr2 = new char[unsignedShort];
                                while (i2 < unsignedShort) {
                                    cArr2[i2] = (char) readInt(this.f109a[readUnsignedShort(i7)]);
                                    i7 += 3;
                                    i2++;
                                }
                                annotationVisitor.visit(str, cArr2);
                                break;
                            case 68:
                                double[] dArr = new double[unsignedShort];
                                while (i2 < unsignedShort) {
                                    dArr[i2] = Double.longBitsToDouble(readLong(this.f109a[readUnsignedShort(i7)]));
                                    i7 += 3;
                                    i2++;
                                }
                                annotationVisitor.visit(str, dArr);
                                break;
                            default:
                                return m47a(i + 1, cArr, false, annotationVisitor.visitArray(str));
                        }
                    } else {
                        long[] jArr = new long[unsignedShort];
                        while (i2 < unsignedShort) {
                            jArr[i2] = readLong(this.f109a[readUnsignedShort(i7)]);
                            i7 += 3;
                            i2++;
                        }
                        annotationVisitor.visit(str, jArr);
                    }
                    return i7 - 1;
                }
                switch (i5) {
                    case 66:
                        annotationVisitor.visit(str, new Byte((byte) readInt(this.f109a[readUnsignedShort(i4)])));
                        return i + 3;
                    case 67:
                        annotationVisitor.visit(str, new Character((char) readInt(this.f109a[readUnsignedShort(i4)])));
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

    /* JADX INFO: renamed from: a */
    private int m47a(int i, char[] cArr, boolean z, AnnotationVisitor annotationVisitor) {
        int unsignedShort = readUnsignedShort(i);
        int iM46a = i + 2;
        if (z) {
            while (unsignedShort > 0) {
                iM46a = m46a(iM46a + 2, cArr, readUTF8(iM46a, cArr), annotationVisitor);
                unsignedShort--;
            }
        } else {
            while (unsignedShort > 0) {
                iM46a = m46a(iM46a, cArr, (String) null, annotationVisitor);
                unsignedShort--;
            }
        }
        if (annotationVisitor != null) {
            annotationVisitor.visitEnd();
        }
        return iM46a;
    }

    /* JADX INFO: renamed from: a */
    private int m48a(ClassVisitor classVisitor, Context context, int i) {
        int i2;
        Context context2 = context;
        char[] cArr = context2.f156c;
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
        Attribute attributeM51a = null;
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
                    Attribute attribute = attributeM51a;
                    int i12 = i7;
                    int i13 = i9;
                    attributeM51a = m51a(context2.f154a, utf84, i4 + 8, readInt(i4 + 4), cArr, -1, null);
                    if (attributeM51a != null) {
                        attributeM51a.f105a = attribute;
                    } else {
                        attributeM51a = attribute;
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
        Attribute attribute2 = attributeM51a;
        int i15 = i4 + 2;
        FieldVisitor fieldVisitorVisitField = classVisitor.visitField(i5, utf8, utf82, utf83, obj);
        if (fieldVisitorVisitField == null) {
            return i15;
        }
        if (i14 != 0) {
            int iM47a = i14 + 2;
            for (int unsignedShort4 = readUnsignedShort(i14); unsignedShort4 > 0; unsignedShort4--) {
                iM47a = m47a(iM47a + 2, cArr, true, fieldVisitorVisitField.visitAnnotation(readUTF8(iM47a, cArr), true));
            }
        }
        if (i7 != 0) {
            int iM47a2 = i7 + 2;
            for (int unsignedShort5 = readUnsignedShort(i7); unsignedShort5 > 0; unsignedShort5--) {
                iM47a2 = m47a(iM47a2 + 2, cArr, true, fieldVisitorVisitField.visitAnnotation(readUTF8(iM47a2, cArr), false));
            }
        }
        if (i8 != 0) {
            int iM47a3 = i8 + 2;
            for (int unsignedShort6 = readUnsignedShort(i8); unsignedShort6 > 0; unsignedShort6--) {
                int iM49a = m49a(context, iM47a3);
                iM47a3 = m47a(iM49a + 2, cArr, true, fieldVisitorVisitField.visitTypeAnnotation(context.f162i, context.f163j, readUTF8(iM49a, cArr), true));
            }
        }
        if (i9 != 0) {
            int iM47a4 = i9 + 2;
            for (int unsignedShort7 = readUnsignedShort(i9); unsignedShort7 > 0; unsignedShort7--) {
                int iM49a2 = m49a(context, iM47a4);
                iM47a4 = m47a(iM49a2 + 2, cArr, true, fieldVisitorVisitField.visitTypeAnnotation(context.f162i, context.f163j, readUTF8(iM49a2, cArr), false));
            }
        }
        Attribute attribute3 = attribute2;
        while (attribute3 != null) {
            Attribute attribute4 = attribute3.f105a;
            attribute3.f105a = null;
            fieldVisitorVisitField.visitAttribute(attribute3);
            attribute3 = attribute4;
        }
        fieldVisitorVisitField.visitEnd();
        return i15;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int m49a(Context context, int i) {
        int i2;
        int i3;
        int i4 = readInt(i);
        int i5 = i4 >>> 24;
        if (i5 == 0 || i5 == 1) {
            i2 = i4 & net.bytebuddy.jar.asm.Opcodes.V_PREVIEW;
            i3 = i + 2;
        } else if (i5 != 64 && i5 != 65) {
            switch (i5) {
                case 19:
                case 20:
                case 21:
                    i2 = i4 & (-16777216);
                    i3 = i + 1;
                    break;
                case 22:
                    break;
                default:
                    switch (i5) {
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                            i2 = i4 & (-16776961);
                            i3 = i + 4;
                            break;
                        default:
                            i2 = i4 & (i5 < 67 ? -256 : -16777216);
                            i3 = i + 3;
                            break;
                    }
                    break;
            }
        } else {
            i2 = i4 & (-16777216);
            int unsignedShort = readUnsignedShort(i + 1);
            context.f164l = new Label[unsignedShort];
            context.f165m = new Label[unsignedShort];
            context.f166n = new int[unsignedShort];
            i3 = i + 3;
            for (int i6 = 0; i6 < unsignedShort; i6++) {
                int unsignedShort2 = readUnsignedShort(i3);
                int unsignedShort3 = readUnsignedShort(i3 + 2);
                context.f164l[i6] = readLabel(unsignedShort2, context.f161h);
                context.f165m[i6] = readLabel(unsignedShort2 + unsignedShort3, context.f161h);
                context.f166n[i6] = readUnsignedShort(i3 + 4);
                i3 += 6;
            }
        }
        int i7 = readByte(i3);
        context.f162i = i2;
        context.f163j = i7 == 0 ? null : new TypePath(this.f110b, i3);
        return (i7 * 2) + i3 + 1;
    }

    /* JADX INFO: renamed from: a */
    private int m50a(Object[] objArr, int i, int i2, char[] cArr, Label[] labelArr) {
        int i3 = i2 + 1;
        switch (this.f110b[i2] & DefaultClassResolver.NAME) {
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

    /* JADX INFO: renamed from: a */
    private Attribute m51a(Attribute[] attributeArr, String str, int i, int i2, char[] cArr, int i3, Label[] labelArr) {
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

    /* JADX INFO: renamed from: a */
    private String m52a(int i, int i2, char[] cArr) {
        int i3;
        int i4 = i2 + i;
        byte[] bArr = this.f110b;
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

    /* JADX INFO: renamed from: a */
    public void m60a(ClassWriter classWriter) {
        char[] cArr = new char[this.f112d];
        int length = this.f109a.length;
        Item[] itemArr = new Item[length];
        int i = 1;
        while (true) {
            int[] iArr = this.f109a;
            if (i >= length) {
                int i2 = iArr[1] - 1;
                classWriter.f131d.putByteArray(this.f110b, i2, this.header - i2);
                classWriter.f132e = itemArr;
                classWriter.f133f = (int) (((double) length) * 0.75d);
                classWriter.f130c = length;
                return;
            }
            int i3 = iArr[i];
            byte b = this.f110b[i3 - 1];
            Item item = new Item(i);
            if (b == 1) {
                String[] strArr = this.f111c;
                String strM52a = strArr[i];
                if (strM52a == null) {
                    int i4 = this.f109a[i];
                    strM52a = m52a(i4 + 2, readUnsignedShort(i4), cArr);
                    strArr[i] = strM52a;
                }
                item.m103a(b, strM52a, null, null);
            } else if (b == 15) {
                int i5 = this.f109a[readUnsignedShort(i3 + 1)];
                int i6 = this.f109a[readUnsignedShort(i5 + 2)];
                item.m103a(readByte(i3) + 20, readClass(i5, cArr), readUTF8(i6, cArr), readUTF8(i6 + 2, cArr));
            } else if (b == 18) {
                if (classWriter.f115A == null) {
                    m53a(classWriter, itemArr, cArr);
                }
                int i7 = this.f109a[readUnsignedShort(i3 + 2)];
                item.m105a(readUTF8(i7, cArr), readUTF8(i7 + 2, cArr), readUnsignedShort(i3));
            } else if (b == 3) {
                item.m101a(readInt(i3));
            } else if (b != 4) {
                if (b == 5) {
                    item.m104a(readLong(i3));
                } else if (b != 6) {
                    switch (b) {
                        case 9:
                        case 10:
                        case 11:
                            int i8 = this.f109a[readUnsignedShort(i3 + 2)];
                            item.m103a(b, readClass(i3, cArr), readUTF8(i8, cArr), readUTF8(i8 + 2, cArr));
                            break;
                        case 12:
                            item.m103a(b, readUTF8(i3, cArr), readUTF8(i3 + 2, cArr), null);
                            break;
                        default:
                            item.m103a(b, readUTF8(i3, cArr), null, null);
                            break;
                    }
                } else {
                    item.m99a(Double.longBitsToDouble(readLong(i3)));
                }
                i++;
            } else {
                item.m100a(Float.intBitsToFloat(readInt(i3)));
            }
            int i9 = item.f216j % length;
            item.f217k = itemArr[i9];
            itemArr[i9] = item;
            i++;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m53a(ClassWriter classWriter, Item[] itemArr, char[] cArr) {
        int iM44a = m44a();
        for (int unsignedShort = readUnsignedShort(iM44a); unsignedShort > 0; unsignedShort--) {
            if (AttBootstrapMethods.ATTRIBUTE_NAME.equals(readUTF8(iM44a + 2, cArr))) {
                int unsignedShort2 = readUnsignedShort(iM44a + 8);
                int i = iM44a + 10;
                int i2 = i;
                for (int i3 = 0; i3 < unsignedShort2; i3++) {
                    int i4 = (i2 - iM44a) - 10;
                    int iHashCode = readConst(readUnsignedShort(i2), cArr).hashCode();
                    for (int unsignedShort3 = readUnsignedShort(i2 + 2); unsignedShort3 > 0; unsignedShort3--) {
                        iHashCode ^= readConst(readUnsignedShort(i2 + 4), cArr).hashCode();
                        i2 += 2;
                    }
                    i2 += 4;
                    Item item = new Item(i3);
                    item.m102a(i4, iHashCode & Integer.MAX_VALUE);
                    int length = item.f216j % itemArr.length;
                    item.f217k = itemArr[length];
                    itemArr[length] = item;
                }
                int i5 = readInt(iM44a + 4);
                ByteVector byteVector = new ByteVector(i5 + 62);
                byteVector.putByteArray(this.f110b, i, i5 - 2);
                classWriter.f153z = unsignedShort2;
                classWriter.f115A = byteVector;
                return;
            }
            iM44a += readInt(iM44a + 4) + 6;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m54a(Context context) {
        int i;
        String str = context.f160g;
        Object[] objArr = context.f171s;
        int i2 = 0;
        if ((context.f158e & 8) == 0) {
            if (MethodDescription.CONSTRUCTOR_INTERNAL_NAME.equals(context.f159f)) {
                objArr[0] = Opcodes.UNINITIALIZED_THIS;
            } else {
                objArr[0] = readClass(this.header + 2, context.f156c);
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
                                    context.f169q = i2;
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

    /* JADX INFO: renamed from: a */
    private int m44a() {
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
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static byte[] m56a(InputStream inputStream, boolean z) throws IOException {
        if (inputStream == null) {
            C6755.m11866("Class not found");
            return null;
        }
        try {
            byte[] bArr = new byte[inputStream.available()];
            int i = 0;
            while (true) {
                int i2 = inputStream.read(bArr, i, bArr.length - i);
                if (i2 == -1) {
                    break;
                }
                i += i2;
                if (i == bArr.length) {
                    int i3 = inputStream.read();
                    if (i3 < 0) {
                        if (z) {
                            inputStream.close();
                        }
                        return bArr;
                    }
                    byte[] bArr2 = new byte[bArr.length + DescriptorProtos$Edition.EDITION_2023_VALUE];
                    System.arraycopy(bArr, 0, bArr2, 0, i);
                    int i4 = i + 1;
                    bArr2[i] = (byte) i3;
                    i = i4;
                    bArr = bArr2;
                }
            }
        } finally {
            if (z) {
                inputStream.close();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int[] m57a(MethodVisitor methodVisitor, Context context, int i, boolean z) {
        int i2;
        char[] cArr = context.f156c;
        int unsignedShort = readUnsignedShort(i);
        int[] iArr = new int[unsignedShort];
        int iM47a = i + 2;
        for (int i3 = 0; i3 < unsignedShort; i3++) {
            iArr[i3] = iM47a;
            int i4 = readInt(iM47a);
            int i5 = i4 >>> 24;
            if (i5 == 0 || i5 == 1) {
                i2 = iM47a + 2;
            } else {
                if (i5 != 64 && i5 != 65) {
                    switch (i5) {
                        case 19:
                        case 20:
                        case 21:
                            i2 = iM47a + 1;
                            break;
                        case 22:
                            break;
                        default:
                            switch (i5) {
                                case 71:
                                case 72:
                                case 73:
                                case 74:
                                case 75:
                                    i2 = iM47a + 4;
                                    break;
                            }
                            break;
                    }
                } else {
                    for (int unsignedShort2 = readUnsignedShort(iM47a + 1); unsignedShort2 > 0; unsignedShort2--) {
                        int unsignedShort3 = readUnsignedShort(iM47a + 3);
                        int unsignedShort4 = readUnsignedShort(iM47a + 5);
                        readLabel(unsignedShort3, context.f161h);
                        readLabel(unsignedShort3 + unsignedShort4, context.f161h);
                        iM47a += 6;
                    }
                }
                i2 = iM47a + 3;
            }
            int i6 = readByte(i2);
            if (i5 == 66) {
                TypePath typePath = i6 != 0 ? new TypePath(this.f110b, i2) : null;
                int iM12133 = AbstractC7012.m12133(i6, 2, 1, i2);
                iM47a = m47a(iM12133 + 2, cArr, true, methodVisitor.visitTryCatchAnnotation(i4, typePath, readUTF8(iM12133, cArr), z));
            } else {
                iM47a = m47a((i6 * 2) + i2 + 3, cArr, true, (AnnotationVisitor) null);
            }
        }
        return iArr;
    }
}
