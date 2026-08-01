package net.bytebuddy.jar.asm;

import androidx.activity.AbstractC0053;
import com.android.dx.cf.attrib.AttAnnotationDefault;
import com.android.dx.cf.attrib.AttBootstrapMethods;
import com.android.dx.cf.attrib.AttCode;
import com.android.dx.cf.attrib.AttConstantValue;
import com.android.dx.cf.attrib.AttDeprecated;
import com.android.dx.cf.attrib.AttEnclosingMethod;
import com.android.dx.cf.attrib.AttExceptions;
import com.android.dx.cf.attrib.AttInnerClasses;
import com.android.dx.cf.attrib.AttRuntimeInvisibleAnnotations;
import com.android.dx.cf.attrib.AttRuntimeInvisibleParameterAnnotations;
import com.android.dx.cf.attrib.AttRuntimeVisibleAnnotations;
import com.android.dx.cf.attrib.AttRuntimeVisibleParameterAnnotations;
import com.android.dx.cf.attrib.AttSignature;
import com.android.dx.cf.attrib.AttSourceDebugExtension;
import com.android.dx.cf.attrib.AttSourceFile;
import com.android.dx.cf.attrib.AttSynthetic;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.dynamic.ClassFileLocator;
import net.bytebuddy.pool.TypePool;
import p007.AbstractC6136;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class ClassReader {
    static final int EXPAND_ASM_INSNS = 256;
    public static final int EXPAND_FRAMES = 8;
    private static final int INPUT_STREAM_DATA_CHUNK_SIZE = 4096;
    private static final int MAX_BUFFER_SIZE = 1048576;
    public static final int SKIP_CODE = 1;
    public static final int SKIP_DEBUG = 2;
    public static final int SKIP_FRAMES = 4;

    @Deprecated(forRemoval = false)
    public final byte[] b;
    private final int[] bootstrapMethodOffsets;
    final byte[] classFileBuffer;
    private final ConstantDynamic[] constantDynamicValues;
    private final String[] constantUtf8Values;
    private final int[] cpInfoOffsets;
    public final int header;
    private final int maxStringLength;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054 A[PHI: r8
  0x0054: PHI (r8v3 int) = (r8v0 int), (r8v1 int), (r8v4 int) binds: [B:12:0x0044, B:22:0x0060, B:18:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ClassReader(byte[] r11, int r12, boolean r13) {
        /*
            r10 = this;
            r10.<init>()
            r10.classFileBuffer = r11
            r10.b = r11
            if (r13 == 0) goto L21
            int r13 = r12 + 6
            short r0 = r10.readShort(r13)
            r1 = 70
            if (r0 > r1) goto L14
            goto L21
        L14:
            short r10 = r10.readShort(r13)
            java.lang.String r10 = stringConcat$0(r10)
            top.suzhelan.qstory.hook.item.C5919.m11249(r10)
            r10 = 0
            throw r10
        L21:
            int r13 = r12 + 8
            int r13 = r10.readUnsignedShort(r13)
            int[] r0 = new int[r13]
            r10.cpInfoOffsets = r0
            java.lang.String[] r0 = new java.lang.String[r13]
            r10.constantUtf8Values = r0
            int r12 = r12 + 10
            r0 = 0
            r1 = 1
            r2 = r0
            r3 = r2
            r4 = r1
        L36:
            if (r4 >= r13) goto L66
            int[] r5 = r10.cpInfoOffsets
            int r6 = r4 + 1
            int r7 = r12 + 1
            r5[r4] = r7
            r5 = r11[r12]
            r8 = 3
            r9 = 5
            switch(r5) {
                case 1: goto L5b;
                case 2: goto L47;
                case 3: goto L4d;
                case 4: goto L4d;
                case 5: goto L56;
                case 6: goto L56;
                case 7: goto L54;
                case 8: goto L54;
                case 9: goto L4d;
                case 10: goto L4d;
                case 11: goto L4d;
                case 12: goto L4d;
                case 13: goto L47;
                case 14: goto L47;
                case 15: goto L53;
                case 16: goto L54;
                case 17: goto L50;
                case 18: goto L4c;
                case 19: goto L54;
                case 20: goto L54;
                default: goto L47;
            }
        L47:
            top.suzhelan.qstory.hook.item.C5919.m11245()
            r10 = 0
            throw r10
        L4c:
            r3 = r1
        L4d:
            r4 = r6
            r8 = r9
            goto L64
        L50:
            r2 = r1
            r3 = r2
            goto L4d
        L53:
            r8 = 4
        L54:
            r4 = r6
            goto L64
        L56:
            int r4 = r4 + 2
            r8 = 9
            goto L64
        L5b:
            int r4 = r10.readUnsignedShort(r7)
            int r8 = r8 + r4
            if (r8 <= r0) goto L54
            r4 = r6
            r0 = r8
        L64:
            int r12 = r12 + r8
            goto L36
        L66:
            r10.maxStringLength = r0
            r10.header = r12
            r11 = 0
            if (r2 == 0) goto L70
            net.bytebuddy.jar.asm.ConstantDynamic[] r12 = new net.bytebuddy.jar.asm.ConstantDynamic[r13]
            goto L71
        L70:
            r12 = r11
        L71:
            r10.constantDynamicValues = r12
            if (r3 == 0) goto L79
            int[] r11 = r10.readBootstrapMethodsAttribute(r0)
        L79:
            r10.bootstrapMethodOffsets = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.jar.asm.ClassReader.<init>(byte[], int, boolean):void");
    }

    private static int computeBufferSize(InputStream inputStream) throws IOException {
        int iAvailable = inputStream.available();
        if (iAvailable < 256) {
            return 4096;
        }
        return Math.min(iAvailable, MAX_BUFFER_SIZE);
    }

    private void computeImplicitFrame(Context context) {
        int i;
        String str = context.currentMethodDescriptor;
        Object[] objArr = context.currentFrameLocalTypes;
        int i2 = 0;
        if ((context.currentMethodAccessFlags & 8) == 0) {
            if (MethodDescription.CONSTRUCTOR_INTERNAL_NAME.equals(context.currentMethodName)) {
                objArr[0] = Opcodes.UNINITIALIZED_THIS;
            } else {
                objArr[0] = readClass(this.header + 2, context.charBuffer);
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
                                    context.currentFrameLocalCount = i2;
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

    private void createDebugLabel(int i, Label[] labelArr) {
        if (labelArr[i] == null) {
            Label label = readLabel(i, labelArr);
            label.flags = (short) (label.flags | 1);
        }
    }

    private Label createLabel(int i, Label[] labelArr) {
        Label label = readLabel(i, labelArr);
        label.flags = (short) (label.flags & (-2));
        return label;
    }

    private int getTypeAnnotationBytecodeOffset(int[] iArr, int i) {
        if (iArr == null || i >= iArr.length || readByte(iArr[i]) < 67) {
            return -1;
        }
        return readUnsignedShort(iArr[i] + 1);
    }

    private Attribute readAttribute(Attribute[] attributeArr, String str, int i, int i2, char[] cArr, int i3, Label[] labelArr) {
        if (i2 > this.classFileBuffer.length - i) {
            C5919.m11245();
            return null;
        }
        for (Attribute attribute : attributeArr) {
            if (attribute.type.equals(str)) {
                return attribute.read(this, i, i2, cArr, i3, labelArr);
            }
        }
        return new Attribute(str).read(this, i, i2, null, -1, null);
    }

    private int[] readBootstrapMethodsAttribute(int i) {
        char[] cArr = new char[i];
        int firstAttributeOffset = getFirstAttributeOffset();
        for (int unsignedShort = readUnsignedShort(firstAttributeOffset - 2); unsignedShort > 0; unsignedShort--) {
            String utf8 = readUTF8(firstAttributeOffset, cArr);
            int i2 = readInt(firstAttributeOffset + 2);
            int i3 = firstAttributeOffset + 6;
            if (AttBootstrapMethods.ATTRIBUTE_NAME.equals(utf8)) {
                int unsignedShort2 = readUnsignedShort(i3);
                int[] iArr = new int[unsignedShort2];
                int unsignedShort3 = firstAttributeOffset + 8;
                for (int i4 = 0; i4 < unsignedShort2; i4++) {
                    iArr[i4] = unsignedShort3;
                    unsignedShort3 += (readUnsignedShort(unsignedShort3 + 2) * 2) + 4;
                }
                return iArr;
            }
            firstAttributeOffset = i3 + i2;
        }
        C5919.m11245();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x03e9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void readCode(net.bytebuddy.jar.asm.MethodVisitor r40, net.bytebuddy.jar.asm.Context r41, int r42) {
        /*
            Method dump skipped, instruction units count: 3120
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.jar.asm.ClassReader.readCode(net.bytebuddy.jar.asm.MethodVisitor, net.bytebuddy.jar.asm.Context, int):void");
    }

    private ConstantDynamic readConstantDynamic(int i, char[] cArr) {
        ConstantDynamic constantDynamic = this.constantDynamicValues[i];
        if (constantDynamic != null) {
            return constantDynamic;
        }
        int[] iArr = this.cpInfoOffsets;
        int i2 = iArr[i];
        int i3 = iArr[readUnsignedShort(i2 + 2)];
        String utf8 = readUTF8(i3, cArr);
        String utf82 = readUTF8(i3 + 2, cArr);
        int i4 = this.bootstrapMethodOffsets[readUnsignedShort(i2)];
        Handle handle = (Handle) readConst(readUnsignedShort(i4), cArr);
        int unsignedShort = readUnsignedShort(i4 + 2);
        Object[] objArr = new Object[unsignedShort];
        int i5 = i4 + 4;
        for (int i6 = 0; i6 < unsignedShort; i6++) {
            objArr[i6] = readConst(readUnsignedShort(i5), cArr);
            i5 += 2;
        }
        ConstantDynamic[] constantDynamicArr = this.constantDynamicValues;
        ConstantDynamic constantDynamic2 = new ConstantDynamic(utf8, utf82, handle, objArr);
        constantDynamicArr[i] = constantDynamic2;
        return constantDynamic2;
    }

    private int readElementValue(AnnotationVisitor annotationVisitor, int i, String str, char[] cArr) {
        byte[] bArr = this.classFileBuffer;
        int i2 = 0;
        if (annotationVisitor == null) {
            int i3 = bArr[i] & DefaultClassResolver.NAME;
            return i3 != 64 ? i3 != 91 ? i3 != 101 ? i + 3 : i + 5 : readElementValues(null, i + 1, false, cArr) : readElementValues(null, i + 3, true, cArr);
        }
        int i4 = i + 1;
        int i5 = bArr[i] & DefaultClassResolver.NAME;
        if (i5 == 64) {
            return readElementValues(annotationVisitor.visitAnnotation(str, readUTF8(i4, cArr)), i + 3, true, cArr);
        }
        if (i5 != 70) {
            if (i5 == 83) {
                annotationVisitor.visit(str, Short.valueOf((short) readInt(this.cpInfoOffsets[readUnsignedShort(i4)])));
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
                    annotationVisitor.visit(str, readInt(this.cpInfoOffsets[readUnsignedShort(i4)]) == 0 ? Boolean.FALSE : Boolean.TRUE);
                    return i + 3;
                }
                if (i5 == 91) {
                    int unsignedShort = readUnsignedShort(i4);
                    int i6 = i + 3;
                    if (unsignedShort == 0) {
                        return readElementValues(annotationVisitor.visitArray(str), i + 1, false, cArr);
                    }
                    int i7 = this.classFileBuffer[i6] & DefaultClassResolver.NAME;
                    if (i7 == 70) {
                        float[] fArr = new float[unsignedShort];
                        while (i2 < unsignedShort) {
                            fArr[i2] = Float.intBitsToFloat(readInt(this.cpInfoOffsets[readUnsignedShort(i6 + 1)]));
                            i6 += 3;
                            i2++;
                        }
                        annotationVisitor.visit(str, fArr);
                        return i6;
                    }
                    if (i7 == 83) {
                        short[] sArr = new short[unsignedShort];
                        while (i2 < unsignedShort) {
                            sArr[i2] = (short) readInt(this.cpInfoOffsets[readUnsignedShort(i6 + 1)]);
                            i6 += 3;
                            i2++;
                        }
                        annotationVisitor.visit(str, sArr);
                        return i6;
                    }
                    if (i7 == 90) {
                        boolean[] zArr = new boolean[unsignedShort];
                        for (int i8 = 0; i8 < unsignedShort; i8++) {
                            zArr[i8] = readInt(this.cpInfoOffsets[readUnsignedShort(i6 + 1)]) != 0;
                            i6 += 3;
                        }
                        annotationVisitor.visit(str, zArr);
                        return i6;
                    }
                    if (i7 == 73) {
                        int[] iArr = new int[unsignedShort];
                        while (i2 < unsignedShort) {
                            iArr[i2] = readInt(this.cpInfoOffsets[readUnsignedShort(i6 + 1)]);
                            i6 += 3;
                            i2++;
                        }
                        annotationVisitor.visit(str, iArr);
                        return i6;
                    }
                    if (i7 == 74) {
                        long[] jArr = new long[unsignedShort];
                        while (i2 < unsignedShort) {
                            jArr[i2] = readLong(this.cpInfoOffsets[readUnsignedShort(i6 + 1)]);
                            i6 += 3;
                            i2++;
                        }
                        annotationVisitor.visit(str, jArr);
                        return i6;
                    }
                    switch (i7) {
                        case 66:
                            byte[] bArr2 = new byte[unsignedShort];
                            while (i2 < unsignedShort) {
                                bArr2[i2] = (byte) readInt(this.cpInfoOffsets[readUnsignedShort(i6 + 1)]);
                                i6 += 3;
                                i2++;
                            }
                            annotationVisitor.visit(str, bArr2);
                            return i6;
                        case 67:
                            char[] cArr2 = new char[unsignedShort];
                            while (i2 < unsignedShort) {
                                cArr2[i2] = (char) readInt(this.cpInfoOffsets[readUnsignedShort(i6 + 1)]);
                                i6 += 3;
                                i2++;
                            }
                            annotationVisitor.visit(str, cArr2);
                            return i6;
                        case 68:
                            double[] dArr = new double[unsignedShort];
                            while (i2 < unsignedShort) {
                                dArr[i2] = Double.longBitsToDouble(readLong(this.cpInfoOffsets[readUnsignedShort(i6 + 1)]));
                                i6 += 3;
                                i2++;
                            }
                            annotationVisitor.visit(str, dArr);
                            return i6;
                        default:
                            return readElementValues(annotationVisitor.visitArray(str), i + 1, false, cArr);
                    }
                }
                switch (i5) {
                    case 66:
                        annotationVisitor.visit(str, Byte.valueOf((byte) readInt(this.cpInfoOffsets[readUnsignedShort(i4)])));
                        return i + 3;
                    case 67:
                        annotationVisitor.visit(str, Character.valueOf((char) readInt(this.cpInfoOffsets[readUnsignedShort(i4)])));
                        return i + 3;
                    case 68:
                        break;
                    default:
                        C5919.m11245();
                        return 0;
                }
            }
        }
        annotationVisitor.visit(str, readConst(readUnsignedShort(i4), cArr));
        return i + 3;
    }

    private int readElementValues(AnnotationVisitor annotationVisitor, int i, boolean z, char[] cArr) {
        int unsignedShort = readUnsignedShort(i);
        int elementValue = i + 2;
        if (!z) {
            while (true) {
                int i2 = unsignedShort - 1;
                if (unsignedShort <= 0) {
                    break;
                }
                elementValue = readElementValue(annotationVisitor, elementValue, null, cArr);
                unsignedShort = i2;
            }
        } else {
            while (true) {
                int i3 = unsignedShort - 1;
                if (unsignedShort <= 0) {
                    break;
                }
                elementValue = readElementValue(annotationVisitor, elementValue + 2, readUTF8(elementValue, cArr), cArr);
                unsignedShort = i3;
            }
        }
        if (annotationVisitor != null) {
            annotationVisitor.visitEnd();
        }
        return elementValue;
    }

    private int readField(ClassVisitor classVisitor, Context context, int i) {
        int i2;
        int i3;
        int i4;
        Context context2 = context;
        char[] cArr = context2.charBuffer;
        int unsignedShort = readUnsignedShort(i);
        String utf8 = readUTF8(i + 2, cArr);
        String utf82 = readUTF8(i + 4, cArr);
        int unsignedShort2 = readUnsignedShort(i + 6);
        int i5 = i + 8;
        int i6 = unsignedShort;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        String utf83 = null;
        Object obj = null;
        Attribute attribute = null;
        while (true) {
            int i11 = unsignedShort2 - 1;
            if (unsignedShort2 <= 0) {
                break;
            }
            int i12 = i7;
            String utf84 = readUTF8(i5, cArr);
            int i13 = readInt(i5 + 2);
            int i14 = i5 + 6;
            if (AttConstantValue.ATTRIBUTE_NAME.equals(utf84)) {
                int unsignedShort3 = readUnsignedShort(i14);
                obj = unsignedShort3 == 0 ? null : readConst(unsignedShort3, cArr);
            } else if (AttSignature.ATTRIBUTE_NAME.equals(utf84)) {
                utf83 = readUTF8(i14, cArr);
            } else {
                if (AttDeprecated.ATTRIBUTE_NAME.equals(utf84)) {
                    i4 = 131072 | i6;
                } else if (AttSynthetic.ATTRIBUTE_NAME.equals(utf84)) {
                    i4 = i6 | 4096;
                } else {
                    if (AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME.equals(utf84)) {
                        i7 = i14;
                        i2 = i7;
                        i14 = i8;
                        i3 = i13;
                    } else {
                        if ("RuntimeVisibleTypeAnnotations".equals(utf84)) {
                            i2 = i14;
                            i9 = i2;
                        } else if (AttRuntimeInvisibleAnnotations.ATTRIBUTE_NAME.equals(utf84)) {
                            i2 = i14;
                            i3 = i13;
                            i7 = i12;
                        } else if ("RuntimeInvisibleTypeAnnotations".equals(utf84)) {
                            i2 = i14;
                            i10 = i2;
                        } else {
                            i2 = i14;
                            int i15 = i8;
                            i3 = i13;
                            Attribute attribute2 = readAttribute(context2.attributePrototypes, utf84, i2, i3, cArr, -1, null);
                            attribute2.nextAttribute = attribute;
                            attribute = attribute2;
                            i9 = i9;
                            i14 = i15;
                            i7 = i12;
                            i10 = i10;
                        }
                        i14 = i8;
                        i3 = i13;
                        i7 = i12;
                    }
                    int i16 = i2 + i3;
                    context2 = context;
                    i8 = i14;
                    i5 = i16;
                    unsignedShort2 = i11;
                }
                i2 = i14;
                i6 = i4;
                i14 = i8;
                i3 = i13;
                i7 = i12;
                int i162 = i2 + i3;
                context2 = context;
                i8 = i14;
                i5 = i162;
                unsignedShort2 = i11;
            }
            i2 = i14;
            i14 = i8;
            i3 = i13;
            i7 = i12;
            int i1622 = i2 + i3;
            context2 = context;
            i8 = i14;
            i5 = i1622;
            unsignedShort2 = i11;
        }
        int i17 = i7;
        int i18 = i8;
        int i19 = i9;
        int i20 = i10;
        FieldVisitor fieldVisitorVisitField = classVisitor.visitField(i6, utf8, utf82, utf83, obj);
        if (fieldVisitorVisitField == null) {
            return i5;
        }
        if (i17 != 0) {
            int unsignedShort4 = readUnsignedShort(i17);
            int elementValues = i17 + 2;
            while (true) {
                int i21 = unsignedShort4 - 1;
                if (unsignedShort4 <= 0) {
                    break;
                }
                elementValues = readElementValues(fieldVisitorVisitField.visitAnnotation(readUTF8(elementValues, cArr), true), elementValues + 2, true, cArr);
                unsignedShort4 = i21;
            }
        }
        if (i18 != 0) {
            int unsignedShort5 = readUnsignedShort(i18);
            int elementValues2 = i18 + 2;
            while (true) {
                int i22 = unsignedShort5 - 1;
                if (unsignedShort5 <= 0) {
                    break;
                }
                elementValues2 = readElementValues(fieldVisitorVisitField.visitAnnotation(readUTF8(elementValues2, cArr), false), elementValues2 + 2, true, cArr);
                unsignedShort5 = i22;
            }
        }
        if (i19 != 0) {
            int unsignedShort6 = readUnsignedShort(i19);
            int elementValues3 = i19 + 2;
            while (true) {
                int i23 = unsignedShort6 - 1;
                if (unsignedShort6 <= 0) {
                    break;
                }
                int typeAnnotationTarget = readTypeAnnotationTarget(context, elementValues3);
                elementValues3 = readElementValues(fieldVisitorVisitField.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, readUTF8(typeAnnotationTarget, cArr), true), typeAnnotationTarget + 2, true, cArr);
                unsignedShort6 = i23;
            }
        }
        if (i20 != 0) {
            int unsignedShort7 = readUnsignedShort(i20);
            int elementValues4 = i20 + 2;
            while (true) {
                int i24 = unsignedShort7 - 1;
                if (unsignedShort7 <= 0) {
                    break;
                }
                int typeAnnotationTarget2 = readTypeAnnotationTarget(context, elementValues4);
                elementValues4 = readElementValues(fieldVisitorVisitField.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, readUTF8(typeAnnotationTarget2, cArr), false), typeAnnotationTarget2 + 2, true, cArr);
                unsignedShort7 = i24;
            }
        }
        while (attribute != null) {
            Attribute attribute3 = attribute.nextAttribute;
            attribute.nextAttribute = null;
            fieldVisitorVisitField.visitAttribute(attribute);
            attribute = attribute3;
        }
        fieldVisitorVisitField.visitEnd();
        return i5;
    }

    private int readMethod(ClassVisitor classVisitor, Context context, int i) {
        int i2;
        char[] cArr;
        int i3;
        int i4;
        int i5;
        char[] cArr2;
        ClassReader classReader = this;
        char[] cArr3 = context.charBuffer;
        context.currentMethodAccessFlags = classReader.readUnsignedShort(i);
        context.currentMethodName = classReader.readUTF8(i + 2, cArr3);
        int i6 = i + 4;
        context.currentMethodDescriptor = classReader.readUTF8(i6, cArr3);
        int unsignedShort = classReader.readUnsignedShort(i + 6);
        int i7 = i + 8;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        Attribute attribute = null;
        int unsignedShort2 = 0;
        int i12 = 0;
        int i13 = 0;
        String[] strArr = null;
        boolean z = false;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            int i18 = unsignedShort - 1;
            if (unsignedShort <= 0) {
                break;
            }
            int i19 = i8;
            String utf8 = classReader.readUTF8(i7, cArr3);
            int i20 = classReader.readInt(i7 + 2);
            int i21 = i9;
            int i22 = i7 + 6;
            int i23 = i19;
            if (AttCode.ATTRIBUTE_NAME.equals(utf8)) {
                if ((context.parsingOptions & 1) == 0) {
                    i17 = i22;
                }
            } else if (AttExceptions.ATTRIBUTE_NAME.equals(utf8)) {
                int unsignedShort3 = classReader.readUnsignedShort(i22);
                int i24 = i7 + 8;
                strArr = new String[unsignedShort3];
                for (int i25 = 0; i25 < unsignedShort3; i25++) {
                    strArr[i25] = classReader.readClass(i24, cArr3);
                    i24 += 2;
                }
                i14 = i22;
            } else if (AttSignature.ATTRIBUTE_NAME.equals(utf8)) {
                unsignedShort2 = classReader.readUnsignedShort(i22);
            } else if (AttDeprecated.ATTRIBUTE_NAME.equals(utf8)) {
                context.currentMethodAccessFlags |= 131072;
            } else if (AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME.equals(utf8)) {
                i23 = i22;
            } else if ("RuntimeVisibleTypeAnnotations".equals(utf8)) {
                i4 = i22;
                cArr2 = cArr3;
                i5 = i20;
                i7 = i22 + i5;
                cArr3 = cArr2;
                unsignedShort = i18;
                i9 = i21;
                i8 = i23;
                i10 = i4;
            } else if (AttAnnotationDefault.ATTRIBUTE_NAME.equals(utf8)) {
                i13 = i22;
            } else {
                if (AttSynthetic.ATTRIBUTE_NAME.equals(utf8)) {
                    context.currentMethodAccessFlags |= 4096;
                    i4 = i10;
                    cArr2 = cArr3;
                    i5 = i20;
                    z = true;
                } else if (AttRuntimeInvisibleAnnotations.ATTRIBUTE_NAME.equals(utf8)) {
                    i21 = i22;
                } else if ("RuntimeInvisibleTypeAnnotations".equals(utf8)) {
                    i11 = i22;
                } else if (AttRuntimeVisibleParameterAnnotations.ATTRIBUTE_NAME.equals(utf8)) {
                    i15 = i22;
                } else if (AttRuntimeInvisibleParameterAnnotations.ATTRIBUTE_NAME.equals(utf8)) {
                    i16 = i22;
                } else if ("MethodParameters".equals(utf8)) {
                    i12 = i22;
                } else {
                    i4 = i10;
                    i5 = i20;
                    Attribute attribute2 = classReader.readAttribute(context.attributePrototypes, utf8, i22, i5, cArr3, -1, null);
                    cArr2 = cArr3;
                    attribute2.nextAttribute = attribute;
                    attribute = attribute2;
                    i11 = i11;
                }
                i7 = i22 + i5;
                cArr3 = cArr2;
                unsignedShort = i18;
                i9 = i21;
                i8 = i23;
                i10 = i4;
            }
            i4 = i10;
            cArr2 = cArr3;
            i5 = i20;
            i7 = i22 + i5;
            cArr3 = cArr2;
            unsignedShort = i18;
            i9 = i21;
            i8 = i23;
            i10 = i4;
        }
        int i26 = i8;
        int i27 = i9;
        int i28 = i10;
        char[] cArr4 = cArr3;
        int i29 = i11;
        int i30 = i13;
        int i31 = i12;
        MethodVisitor methodVisitorVisitMethod = classVisitor.visitMethod(context.currentMethodAccessFlags, context.currentMethodName, context.currentMethodDescriptor, unsignedShort2 == 0 ? null : classReader.readUtf(unsignedShort2, cArr4), strArr);
        if (methodVisitorVisitMethod == null) {
            return i7;
        }
        if (methodVisitorVisitMethod instanceof MethodWriter) {
            MethodWriter methodWriter = (MethodWriter) methodVisitorVisitMethod;
            i3 = i30;
            boolean z2 = (context.currentMethodAccessFlags & 131072) != 0;
            int unsignedShort4 = classReader.readUnsignedShort(i6);
            int i32 = unsignedShort2;
            i2 = i31;
            cArr = cArr4;
            boolean zCanCopyMethodAttributes = methodWriter.canCopyMethodAttributes(classReader, z, z2, unsignedShort4, i32, i14);
            classReader = classReader;
            if (zCanCopyMethodAttributes) {
                methodWriter.setMethodAttributesSource(i, i7 - i);
                return i7;
            }
        } else {
            i2 = i31;
            cArr = cArr4;
            i3 = i30;
        }
        if (i2 != 0 && (context.parsingOptions & 2) == 0) {
            int i33 = classReader.readByte(i2);
            int i34 = i2 + 1;
            while (true) {
                int i35 = i33 - 1;
                if (i33 <= 0) {
                    break;
                }
                methodVisitorVisitMethod.visitParameter(classReader.readUTF8(i34, cArr), classReader.readUnsignedShort(i34 + 2));
                i34 += 4;
                i33 = i35;
            }
        }
        if (i3 != 0) {
            AnnotationVisitor annotationVisitorVisitAnnotationDefault = methodVisitorVisitMethod.visitAnnotationDefault();
            classReader.readElementValue(annotationVisitorVisitAnnotationDefault, i3, null, cArr);
            if (annotationVisitorVisitAnnotationDefault != null) {
                annotationVisitorVisitAnnotationDefault.visitEnd();
            }
        }
        if (i26 != 0) {
            int unsignedShort5 = classReader.readUnsignedShort(i26);
            int elementValues = i26 + 2;
            while (true) {
                int i36 = unsignedShort5 - 1;
                if (unsignedShort5 <= 0) {
                    break;
                }
                elementValues = classReader.readElementValues(methodVisitorVisitMethod.visitAnnotation(classReader.readUTF8(elementValues, cArr), true), elementValues + 2, true, cArr);
                unsignedShort5 = i36;
            }
        }
        if (i27 != 0) {
            int unsignedShort6 = classReader.readUnsignedShort(i27);
            int elementValues2 = i27 + 2;
            while (true) {
                int i37 = unsignedShort6 - 1;
                if (unsignedShort6 <= 0) {
                    break;
                }
                elementValues2 = classReader.readElementValues(methodVisitorVisitMethod.visitAnnotation(classReader.readUTF8(elementValues2, cArr), false), elementValues2 + 2, true, cArr);
                unsignedShort6 = i37;
            }
        }
        if (i28 != 0) {
            int unsignedShort7 = classReader.readUnsignedShort(i28);
            int elementValues3 = i28 + 2;
            while (true) {
                int i38 = unsignedShort7 - 1;
                if (unsignedShort7 <= 0) {
                    break;
                }
                int typeAnnotationTarget = classReader.readTypeAnnotationTarget(context, elementValues3);
                elementValues3 = classReader.readElementValues(methodVisitorVisitMethod.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, classReader.readUTF8(typeAnnotationTarget, cArr), true), typeAnnotationTarget + 2, true, cArr);
                unsignedShort7 = i38;
            }
        }
        if (i29 != 0) {
            int unsignedShort8 = classReader.readUnsignedShort(i29);
            int elementValues4 = i29 + 2;
            while (true) {
                int i39 = unsignedShort8 - 1;
                if (unsignedShort8 <= 0) {
                    break;
                }
                int typeAnnotationTarget2 = classReader.readTypeAnnotationTarget(context, elementValues4);
                elementValues4 = classReader.readElementValues(methodVisitorVisitMethod.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, classReader.readUTF8(typeAnnotationTarget2, cArr), false), typeAnnotationTarget2 + 2, true, cArr);
                unsignedShort8 = i39;
            }
        }
        int i40 = i15;
        if (i40 != 0) {
            classReader.readParameterAnnotations(methodVisitorVisitMethod, context, i40, true);
        }
        int i41 = i16;
        if (i41 != 0) {
            classReader.readParameterAnnotations(methodVisitorVisitMethod, context, i41, false);
        }
        while (attribute != null) {
            Attribute attribute3 = attribute.nextAttribute;
            attribute.nextAttribute = null;
            methodVisitorVisitMethod.visitAttribute(attribute);
            attribute = attribute3;
        }
        int i42 = i17;
        if (i42 != 0) {
            methodVisitorVisitMethod.visitCode();
            classReader.readCode(methodVisitorVisitMethod, context, i42);
        }
        methodVisitorVisitMethod.visitEnd();
        return i7;
    }

    private void readModuleAttributes(ClassVisitor classVisitor, Context context, int i, int i2, String str) {
        String[] strArr;
        char[] cArr = context.charBuffer;
        int i3 = i + 6;
        ModuleVisitor moduleVisitorVisitModule = classVisitor.visitModule(readModule(i, cArr), readUnsignedShort(i + 2), readUTF8(i + 4, cArr));
        if (moduleVisitorVisitModule == null) {
            return;
        }
        if (str != null) {
            moduleVisitorVisitModule.visitMainClass(str);
        }
        if (i2 != 0) {
            int unsignedShort = readUnsignedShort(i2);
            int i4 = i2 + 2;
            while (true) {
                int i5 = unsignedShort - 1;
                if (unsignedShort <= 0) {
                    break;
                }
                moduleVisitorVisitModule.visitPackage(readPackage(i4, cArr));
                i4 += 2;
                unsignedShort = i5;
            }
        }
        int unsignedShort2 = readUnsignedShort(i3);
        int i6 = i + 8;
        while (true) {
            int i7 = unsignedShort2 - 1;
            if (unsignedShort2 <= 0) {
                break;
            }
            String module = readModule(i6, cArr);
            int unsignedShort3 = readUnsignedShort(i6 + 2);
            String utf8 = readUTF8(i6 + 4, cArr);
            i6 += 6;
            moduleVisitorVisitModule.visitRequire(module, unsignedShort3, utf8);
            unsignedShort2 = i7;
        }
        int unsignedShort4 = readUnsignedShort(i6);
        int i8 = i6 + 2;
        while (true) {
            int i9 = unsignedShort4 - 1;
            String[] strArr2 = null;
            if (unsignedShort4 <= 0) {
                break;
            }
            String str2 = readPackage(i8, cArr);
            int unsignedShort5 = readUnsignedShort(i8 + 2);
            int unsignedShort6 = readUnsignedShort(i8 + 4);
            i8 += 6;
            if (unsignedShort6 != 0) {
                strArr2 = new String[unsignedShort6];
                for (int i10 = 0; i10 < unsignedShort6; i10++) {
                    strArr2[i10] = readModule(i8, cArr);
                    i8 += 2;
                }
            }
            moduleVisitorVisitModule.visitExport(str2, unsignedShort5, strArr2);
            unsignedShort4 = i9;
        }
        int unsignedShort7 = readUnsignedShort(i8);
        int i11 = i8 + 2;
        while (true) {
            int i12 = unsignedShort7 - 1;
            if (unsignedShort7 <= 0) {
                break;
            }
            String str3 = readPackage(i11, cArr);
            int unsignedShort8 = readUnsignedShort(i11 + 2);
            int unsignedShort9 = readUnsignedShort(i11 + 4);
            i11 += 6;
            if (unsignedShort9 != 0) {
                strArr = new String[unsignedShort9];
                for (int i13 = 0; i13 < unsignedShort9; i13++) {
                    strArr[i13] = readModule(i11, cArr);
                    i11 += 2;
                }
            } else {
                strArr = null;
            }
            moduleVisitorVisitModule.visitOpen(str3, unsignedShort8, strArr);
            unsignedShort7 = i12;
        }
        int unsignedShort10 = readUnsignedShort(i11);
        int i14 = i11 + 2;
        while (true) {
            int i15 = unsignedShort10 - 1;
            if (unsignedShort10 <= 0) {
                break;
            }
            moduleVisitorVisitModule.visitUse(readClass(i14, cArr));
            i14 += 2;
            unsignedShort10 = i15;
        }
        int unsignedShort11 = readUnsignedShort(i14);
        int i16 = i14 + 2;
        while (true) {
            int i17 = unsignedShort11 - 1;
            if (unsignedShort11 <= 0) {
                moduleVisitorVisitModule.visitEnd();
                return;
            }
            String str4 = readClass(i16, cArr);
            int unsignedShort12 = readUnsignedShort(i16 + 2);
            i16 += 4;
            String[] strArr3 = new String[unsignedShort12];
            for (int i18 = 0; i18 < unsignedShort12; i18++) {
                strArr3[i18] = readClass(i16, cArr);
                i16 += 2;
            }
            moduleVisitorVisitModule.visitProvide(str4, strArr3);
            unsignedShort11 = i17;
        }
    }

    private void readParameterAnnotations(MethodVisitor methodVisitor, Context context, int i, boolean z) {
        int elementValues = i + 1;
        int i2 = this.classFileBuffer[i] & DefaultClassResolver.NAME;
        methodVisitor.visitAnnotableParameterCount(i2, z);
        char[] cArr = context.charBuffer;
        for (int i3 = 0; i3 < i2; i3++) {
            int unsignedShort = readUnsignedShort(elementValues);
            elementValues += 2;
            while (true) {
                int i4 = unsignedShort - 1;
                if (unsignedShort > 0) {
                    elementValues = readElementValues(methodVisitor.visitParameterAnnotation(i3, readUTF8(elementValues, cArr), z), elementValues + 2, true, cArr);
                    unsignedShort = i4;
                }
            }
        }
    }

    private int readRecordComponent(ClassVisitor classVisitor, Context context, int i) {
        int i2;
        int i3;
        Attribute attribute;
        char[] cArr = context.charBuffer;
        String utf8 = readUTF8(i, cArr);
        String utf82 = readUTF8(i + 2, cArr);
        int unsignedShort = readUnsignedShort(i + 4);
        int i4 = i + 6;
        int i5 = 0;
        Attribute attribute2 = null;
        int i6 = 0;
        String utf83 = null;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int i9 = unsignedShort - 1;
            if (unsignedShort <= 0) {
                break;
            }
            String utf84 = readUTF8(i4, cArr);
            int i10 = readInt(i4 + 2);
            int i11 = i4 + 6;
            if (AttSignature.ATTRIBUTE_NAME.equals(utf84)) {
                utf83 = readUTF8(i11, cArr);
                int i12 = i5;
                i2 = i11;
                i11 = i12;
            } else {
                if (AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME.equals(utf84)) {
                    i7 = i11;
                    attribute = attribute2;
                    i3 = i10;
                    i11 = i5;
                    i2 = i7;
                } else if ("RuntimeVisibleTypeAnnotations".equals(utf84)) {
                    i2 = i11;
                } else if (AttRuntimeInvisibleAnnotations.ATTRIBUTE_NAME.equals(utf84)) {
                    i8 = i11;
                    attribute = attribute2;
                    i3 = i10;
                    i11 = i5;
                    i2 = i8;
                } else if ("RuntimeInvisibleTypeAnnotations".equals(utf84)) {
                    i6 = i11;
                    attribute = attribute2;
                    i3 = i10;
                    i11 = i5;
                    i2 = i6;
                } else {
                    int i13 = i5;
                    i2 = i11;
                    Attribute attribute3 = attribute2;
                    i3 = i10;
                    Attribute attribute4 = readAttribute(context.attributePrototypes, utf84, i2, i3, cArr, -1, null);
                    attribute4.nextAttribute = attribute3;
                    attribute = attribute4;
                    i11 = i13;
                    i6 = i6;
                }
                int i14 = i2 + i3;
                i5 = i11;
                i4 = i14;
                attribute2 = attribute;
                unsignedShort = i9;
            }
            attribute = attribute2;
            i3 = i10;
            int i142 = i2 + i3;
            i5 = i11;
            i4 = i142;
            attribute2 = attribute;
            unsignedShort = i9;
        }
        int i15 = i5;
        Attribute attribute5 = attribute2;
        int i16 = i6;
        RecordComponentVisitor recordComponentVisitorVisitRecordComponent = classVisitor.visitRecordComponent(utf8, utf82, utf83);
        if (recordComponentVisitorVisitRecordComponent == null) {
            return i4;
        }
        if (i7 != 0) {
            int unsignedShort2 = readUnsignedShort(i7);
            int elementValues = i7 + 2;
            while (true) {
                int i17 = unsignedShort2 - 1;
                if (unsignedShort2 <= 0) {
                    break;
                }
                elementValues = readElementValues(recordComponentVisitorVisitRecordComponent.visitAnnotation(readUTF8(elementValues, cArr), true), elementValues + 2, true, cArr);
                unsignedShort2 = i17;
            }
        }
        if (i8 != 0) {
            int unsignedShort3 = readUnsignedShort(i8);
            int elementValues2 = i8 + 2;
            while (true) {
                int i18 = unsignedShort3 - 1;
                if (unsignedShort3 <= 0) {
                    break;
                }
                elementValues2 = readElementValues(recordComponentVisitorVisitRecordComponent.visitAnnotation(readUTF8(elementValues2, cArr), false), elementValues2 + 2, true, cArr);
                unsignedShort3 = i18;
            }
        }
        if (i15 != 0) {
            int unsignedShort4 = readUnsignedShort(i15);
            int elementValues3 = i15 + 2;
            while (true) {
                int i19 = unsignedShort4 - 1;
                if (unsignedShort4 <= 0) {
                    break;
                }
                int typeAnnotationTarget = readTypeAnnotationTarget(context, elementValues3);
                elementValues3 = readElementValues(recordComponentVisitorVisitRecordComponent.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, readUTF8(typeAnnotationTarget, cArr), true), typeAnnotationTarget + 2, true, cArr);
                unsignedShort4 = i19;
            }
        }
        if (i16 != 0) {
            int unsignedShort5 = readUnsignedShort(i16);
            int elementValues4 = i16 + 2;
            while (true) {
                int i20 = unsignedShort5 - 1;
                if (unsignedShort5 <= 0) {
                    break;
                }
                int typeAnnotationTarget2 = readTypeAnnotationTarget(context, elementValues4);
                elementValues4 = readElementValues(recordComponentVisitorVisitRecordComponent.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, readUTF8(typeAnnotationTarget2, cArr), false), typeAnnotationTarget2 + 2, true, cArr);
                unsignedShort5 = i20;
            }
        }
        Attribute attribute6 = attribute5;
        while (attribute6 != null) {
            Attribute attribute7 = attribute6.nextAttribute;
            attribute6.nextAttribute = null;
            recordComponentVisitorVisitRecordComponent.visitAttribute(attribute6);
            attribute6 = attribute7;
        }
        recordComponentVisitorVisitRecordComponent.visitEnd();
        return i4;
    }

    private int readStackMapFrame(int i, boolean z, boolean z2, Context context) {
        int verificationTypeInfo;
        int i2;
        ClassReader classReader;
        char[] cArr = context.charBuffer;
        Label[] labelArr = context.currentMethodLabels;
        if (z) {
            verificationTypeInfo = i + 1;
            i2 = this.classFileBuffer[i] & DefaultClassResolver.NAME;
        } else {
            context.currentFrameOffset = -1;
            verificationTypeInfo = i;
            i2 = 255;
        }
        context.currentFrameLocalCountDelta = 0;
        if (i2 < 64) {
            context.currentFrameType = 3;
            context.currentFrameStackCount = 0;
            classReader = this;
        } else if (i2 < 128) {
            i2 -= 64;
            classReader = this;
            verificationTypeInfo = classReader.readVerificationTypeInfo(verificationTypeInfo, context.currentFrameStackTypes, 0, cArr, labelArr);
            context.currentFrameType = 4;
            context.currentFrameStackCount = 1;
        } else {
            if (i2 < 247) {
                C5919.m11245();
                return 0;
            }
            int unsignedShort = readUnsignedShort(verificationTypeInfo);
            int i3 = verificationTypeInfo;
            verificationTypeInfo = i3 + 2;
            if (i2 == 247) {
                classReader = this;
                verificationTypeInfo = classReader.readVerificationTypeInfo(verificationTypeInfo, context.currentFrameStackTypes, 0, cArr, labelArr);
                context.currentFrameType = 4;
                context.currentFrameStackCount = 1;
            } else {
                if (i2 >= 248 && i2 < 251) {
                    context.currentFrameType = 2;
                    int i4 = 251 - i2;
                    context.currentFrameLocalCountDelta = i4;
                    context.currentFrameLocalCount -= i4;
                    context.currentFrameStackCount = 0;
                } else if (i2 == 251) {
                    context.currentFrameType = 3;
                    context.currentFrameStackCount = 0;
                } else if (i2 < 255) {
                    int i5 = i2 - 251;
                    int i6 = z2 ? context.currentFrameLocalCount : 0;
                    int i7 = i5;
                    while (i7 > 0) {
                        verificationTypeInfo = readVerificationTypeInfo(verificationTypeInfo, context.currentFrameLocalTypes, i6, cArr, labelArr);
                        i7--;
                        i6++;
                    }
                    classReader = this;
                    context.currentFrameType = 1;
                    context.currentFrameLocalCountDelta = i5;
                    context.currentFrameLocalCount += i5;
                    context.currentFrameStackCount = 0;
                } else {
                    classReader = this;
                    int unsignedShort2 = classReader.readUnsignedShort(verificationTypeInfo);
                    int verificationTypeInfo2 = i3 + 4;
                    context.currentFrameType = 0;
                    context.currentFrameLocalCountDelta = unsignedShort2;
                    context.currentFrameLocalCount = unsignedShort2;
                    for (int i8 = 0; i8 < unsignedShort2; i8++) {
                        verificationTypeInfo2 = classReader.readVerificationTypeInfo(verificationTypeInfo2, context.currentFrameLocalTypes, i8, cArr, labelArr);
                    }
                    int unsignedShort3 = classReader.readUnsignedShort(verificationTypeInfo2);
                    verificationTypeInfo = verificationTypeInfo2 + 2;
                    context.currentFrameStackCount = unsignedShort3;
                    for (int i9 = 0; i9 < unsignedShort3; i9++) {
                        verificationTypeInfo = classReader.readVerificationTypeInfo(verificationTypeInfo, context.currentFrameStackTypes, i9, cArr, labelArr);
                    }
                }
                classReader = this;
            }
            i2 = unsignedShort;
        }
        int i10 = i2 + 1 + context.currentFrameOffset;
        context.currentFrameOffset = i10;
        classReader.createLabel(i10, labelArr);
        return verificationTypeInfo;
    }

    private static byte[] readStream(InputStream inputStream, boolean z) throws IOException {
        if (inputStream == null) {
            C5919.m11246("Class not found");
            return null;
        }
        int iComputeBufferSize = computeBufferSize(inputStream);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[iComputeBufferSize];
                int i = 0;
                while (true) {
                    int i2 = inputStream.read(bArr, 0, iComputeBufferSize);
                    if (i2 == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i2);
                    i++;
                }
                byteArrayOutputStream.flush();
                if (i == 1) {
                    byteArrayOutputStream.close();
                    return bArr;
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                if (z) {
                    inputStream.close();
                }
                return byteArray;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } finally {
            if (z) {
                inputStream.close();
            }
        }
    }

    private String readStringish(int i, char[] cArr) {
        return readUTF8(this.cpInfoOffsets[readUnsignedShort(i)], cArr);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int readTypeAnnotationTarget(net.bytebuddy.jar.asm.Context r10, int r11) {
        /*
            r9 = this;
            int r0 = r9.readInt(r11)
            int r1 = r0 >>> 24
            r2 = 1
            if (r1 == 0) goto L6e
            if (r1 == r2) goto L6e
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            switch(r1) {
                case 16: goto L6b;
                case 17: goto L6b;
                case 18: goto L6b;
                case 19: goto L68;
                case 20: goto L68;
                case 21: goto L68;
                case 22: goto L6e;
                case 23: goto L6b;
                default: goto L10;
            }
        L10:
            r4 = 0
            switch(r1) {
                case 64: goto L23;
                case 65: goto L23;
                case 66: goto L6b;
                case 67: goto L1f;
                case 68: goto L1f;
                case 69: goto L1f;
                case 70: goto L1f;
                case 71: goto L18;
                case 72: goto L18;
                case 73: goto L18;
                case 74: goto L18;
                case 75: goto L18;
                default: goto L14;
            }
        L14:
            top.suzhelan.qstory.hook.item.C5919.m11245()
            return r4
        L18:
            r1 = -16776961(0xffffffffff0000ff, float:-1.7014636E38)
            r0 = r0 & r1
            int r11 = r11 + 4
            goto L73
        L1f:
            r0 = r0 & r3
        L20:
            int r11 = r11 + 3
            goto L73
        L23:
            r0 = r0 & r3
            int r1 = r11 + 1
            int r1 = r9.readUnsignedShort(r1)
            int r11 = r11 + 3
            net.bytebuddy.jar.asm.Label[] r3 = new net.bytebuddy.jar.asm.Label[r1]
            r10.currentLocalVariableAnnotationRangeStarts = r3
            net.bytebuddy.jar.asm.Label[] r3 = new net.bytebuddy.jar.asm.Label[r1]
            r10.currentLocalVariableAnnotationRangeEnds = r3
            int[] r3 = new int[r1]
            r10.currentLocalVariableAnnotationRangeIndices = r3
        L38:
            if (r4 >= r1) goto L73
            int r3 = r9.readUnsignedShort(r11)
            int r5 = r11 + 2
            int r5 = r9.readUnsignedShort(r5)
            int r6 = r11 + 4
            int r6 = r9.readUnsignedShort(r6)
            int r11 = r11 + 6
            net.bytebuddy.jar.asm.Label[] r7 = r10.currentLocalVariableAnnotationRangeStarts
            net.bytebuddy.jar.asm.Label[] r8 = r10.currentMethodLabels
            net.bytebuddy.jar.asm.Label r8 = r9.createLabel(r3, r8)
            r7[r4] = r8
            net.bytebuddy.jar.asm.Label[] r7 = r10.currentLocalVariableAnnotationRangeEnds
            int r3 = r3 + r5
            net.bytebuddy.jar.asm.Label[] r5 = r10.currentMethodLabels
            net.bytebuddy.jar.asm.Label r3 = r9.createLabel(r3, r5)
            r7[r4] = r3
            int[] r3 = r10.currentLocalVariableAnnotationRangeIndices
            r3[r4] = r6
            int r4 = r4 + 1
            goto L38
        L68:
            r0 = r0 & r3
            int r11 = r11 + r2
            goto L73
        L6b:
            r0 = r0 & (-256(0xffffffffffffff00, float:NaN))
            goto L20
        L6e:
            r1 = -65536(0xffffffffffff0000, float:NaN)
            r0 = r0 & r1
            int r11 = r11 + 2
        L73:
            r10.currentTypeAnnotationTarget = r0
            int r0 = r9.readByte(r11)
            if (r0 != 0) goto L7d
            r9 = 0
            goto L85
        L7d:
            net.bytebuddy.jar.asm.TypePath r1 = new net.bytebuddy.jar.asm.TypePath
            byte[] r9 = r9.classFileBuffer
            r1.<init>(r9, r11)
            r9 = r1
        L85:
            r10.currentTypeAnnotationTargetPath = r9
            int r11 = r11 + r2
            int r0 = r0 * 2
            int r0 = r0 + r11
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.jar.asm.ClassReader.readTypeAnnotationTarget(net.bytebuddy.jar.asm.Context, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0050 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int[] readTypeAnnotations(net.bytebuddy.jar.asm.MethodVisitor r15, net.bytebuddy.jar.asm.Context r16, int r17, boolean r18) {
        /*
            r14 = this;
            r0 = r16
            r1 = r17
            char[] r2 = r0.charBuffer
            int r3 = r14.readUnsignedShort(r1)
            int[] r4 = new int[r3]
            r5 = 2
            int r1 = r1 + r5
            r6 = 0
        Lf:
            if (r6 >= r3) goto L89
            r4[r6] = r1
            int r7 = r14.readInt(r1)
            int r8 = r7 >>> 24
            r9 = 23
            r10 = 0
            if (r8 == r9) goto L50
            switch(r8) {
                case 16: goto L50;
                case 17: goto L50;
                case 18: goto L50;
                default: goto L21;
            }
        L21:
            switch(r8) {
                case 64: goto L2b;
                case 65: goto L2b;
                case 66: goto L50;
                case 67: goto L50;
                case 68: goto L50;
                case 69: goto L50;
                case 70: goto L50;
                case 71: goto L28;
                case 72: goto L28;
                case 73: goto L28;
                case 74: goto L28;
                case 75: goto L28;
                default: goto L24;
            }
        L24:
            top.suzhelan.qstory.hook.item.C5919.m11245()
            return r10
        L28:
            int r1 = r1 + 4
            goto L52
        L2b:
            int r9 = r1 + 1
            int r9 = r14.readUnsignedShort(r9)
            int r1 = r1 + 3
        L33:
            int r11 = r9 + (-1)
            if (r9 <= 0) goto L52
            int r9 = r14.readUnsignedShort(r1)
            int r12 = r1 + 2
            int r12 = r14.readUnsignedShort(r12)
            int r1 = r1 + 6
            net.bytebuddy.jar.asm.Label[] r13 = r0.currentMethodLabels
            r14.createLabel(r9, r13)
            int r9 = r9 + r12
            net.bytebuddy.jar.asm.Label[] r12 = r0.currentMethodLabels
            r14.createLabel(r9, r12)
            r9 = r11
            goto L33
        L50:
            int r1 = r1 + 3
        L52:
            int r9 = r14.readByte(r1)
            r11 = 66
            r12 = 1
            if (r8 != r11) goto L7b
            if (r9 != 0) goto L5e
            goto L65
        L5e:
            net.bytebuddy.jar.asm.TypePath r10 = new net.bytebuddy.jar.asm.TypePath
            byte[] r8 = r14.classFileBuffer
            r10.<init>(r8, r1)
        L65:
            int r1 = p007.AbstractC6136.m11541(r9, r5, r12, r1)
            java.lang.String r8 = r14.readUTF8(r1, r2)
            int r1 = r1 + r5
            r7 = r7 & (-256(0xffffffffffffff00, float:NaN))
            r11 = r18
            net.bytebuddy.jar.asm.AnnotationVisitor r7 = r15.visitTryCatchAnnotation(r7, r10, r8, r11)
            int r1 = r14.readElementValues(r7, r1, r12, r2)
            goto L86
        L7b:
            r11 = r18
            r7 = 3
            int r1 = p007.AbstractC6136.m11541(r9, r5, r7, r1)
            int r1 = r14.readElementValues(r10, r1, r12, r2)
        L86:
            int r6 = r6 + 1
            goto Lf
        L89:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.jar.asm.ClassReader.readTypeAnnotations(net.bytebuddy.jar.asm.MethodVisitor, net.bytebuddy.jar.asm.Context, int, boolean):int[]");
    }

    private String readUtf(int i, int i2, char[] cArr) {
        int i3;
        int i4 = i2 + i;
        byte[] bArr = this.classFileBuffer;
        int i5 = 0;
        while (i < i4) {
            int i6 = i + 1;
            byte b = bArr[i];
            if ((b & 128) == 0) {
                cArr[i5] = (char) (b & 127);
                i5++;
                i = i6;
            } else {
                if ((b & 224) == 192) {
                    i3 = i5 + 1;
                    i += 2;
                    cArr[i5] = (char) (((b & 31) << 6) + (bArr[i6] & 63));
                } else {
                    i3 = i5 + 1;
                    int i7 = i + 2;
                    i += 3;
                    cArr[i5] = (char) (((b & 15) << 12) + ((bArr[i6] & 63) << 6) + (bArr[i7] & 63));
                }
                i5 = i3;
            }
        }
        return new String(cArr, 0, i5);
    }

    private int readVerificationTypeInfo(int i, Object[] objArr, int i2, char[] cArr, Label[] labelArr) {
        int i3 = i + 1;
        switch (this.classFileBuffer[i] & DefaultClassResolver.NAME) {
            case 0:
                objArr[i2] = Opcodes.TOP;
                return i3;
            case 1:
                objArr[i2] = Opcodes.INTEGER;
                return i3;
            case 2:
                objArr[i2] = Opcodes.FLOAT;
                return i3;
            case 3:
                objArr[i2] = Opcodes.DOUBLE;
                return i3;
            case 4:
                objArr[i2] = Opcodes.LONG;
                return i3;
            case 5:
                objArr[i2] = Opcodes.NULL;
                return i3;
            case 6:
                objArr[i2] = Opcodes.UNINITIALIZED_THIS;
                return i3;
            case 7:
                objArr[i2] = readClass(i3, cArr);
                break;
            case 8:
                objArr[i2] = createLabel(readUnsignedShort(i3), labelArr);
                break;
            default:
                C5919.m11245();
                return 0;
        }
        return i + 3;
    }

    private static /* synthetic */ String stringConcat$0(short s) {
        return AbstractC6136.m11556(s, "Unsupported class file major version ");
    }

    private static /* synthetic */ String stringConcat$1(String str) {
        return AbstractC0053.m136(str, ClassFileLocator.CLASS_FILE_EXTENSION);
    }

    public void accept(ClassVisitor classVisitor, Attribute[] attributeArr, int i) {
        Context context;
        ClassReader classReader;
        Context context2;
        String str;
        int i2;
        int i3;
        String utf8;
        int i4;
        String str2;
        String str3;
        int i5;
        Context context3 = new Context();
        context3.attributePrototypes = attributeArr;
        context3.parsingOptions = i;
        char[] cArr = new char[this.maxStringLength];
        context3.charBuffer = cArr;
        int i6 = this.header;
        int unsignedShort = readUnsignedShort(i6);
        String str4 = readClass(i6 + 2, cArr);
        String str5 = readClass(i6 + 4, cArr);
        int unsignedShort2 = readUnsignedShort(i6 + 6);
        String[] strArr = new String[unsignedShort2];
        int i7 = i6 + 8;
        for (int i8 = 0; i8 < unsignedShort2; i8++) {
            strArr[i8] = readClass(i7, cArr);
            i7 += 2;
        }
        int firstAttributeOffset = getFirstAttributeOffset();
        int unsignedShort3 = readUnsignedShort(firstAttributeOffset - 2);
        String str6 = null;
        String utf = null;
        String str7 = null;
        int i9 = 0;
        int i10 = 0;
        String utf82 = null;
        int i11 = 0;
        int i12 = 0;
        String str8 = null;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        Attribute attribute = null;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (unsignedShort3 > 0) {
            int i20 = firstAttributeOffset;
            String utf83 = readUTF8(i20, cArr);
            int i21 = readInt(i20 + 2);
            String str9 = str6;
            int i22 = i20 + 6;
            String str10 = utf;
            if (AttSourceFile.ATTRIBUTE_NAME.equals(utf83)) {
                utf8 = readUTF8(i22, cArr);
                i5 = unsignedShort;
                i3 = i22;
                str2 = str4;
                utf = str10;
                i4 = i21;
                context2 = context3;
            } else {
                if (AttInnerClasses.ATTRIBUTE_NAME.equals(utf83)) {
                    i5 = unsignedShort;
                    i3 = i22;
                    i18 = i3;
                } else if (AttEnclosingMethod.ATTRIBUTE_NAME.equals(utf83)) {
                    i5 = unsignedShort;
                    i3 = i22;
                    i10 = i3;
                } else {
                    if ("NestHost".equals(utf83)) {
                        str7 = readClass(i22, cArr);
                    } else if ("NestMembers".equals(utf83)) {
                        i5 = unsignedShort;
                        i3 = i22;
                        i16 = i3;
                    } else if ("PermittedSubclasses".equals(utf83)) {
                        i5 = unsignedShort;
                        i3 = i22;
                        i17 = i3;
                    } else if (AttSignature.ATTRIBUTE_NAME.equals(utf83)) {
                        utf82 = readUTF8(i22, cArr);
                    } else if (AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME.equals(utf83)) {
                        i5 = unsignedShort;
                        i3 = i22;
                        i9 = i3;
                    } else if ("RuntimeVisibleTypeAnnotations".equals(utf83)) {
                        i5 = unsignedShort;
                        i3 = i22;
                        i14 = i3;
                    } else {
                        if (AttDeprecated.ATTRIBUTE_NAME.equals(utf83)) {
                            i5 = 131072 | unsignedShort;
                        } else if (AttSynthetic.ATTRIBUTE_NAME.equals(utf83)) {
                            i5 = unsignedShort | 4096;
                        } else if (AttSourceDebugExtension.ATTRIBUTE_NAME.equals(utf83)) {
                            if (i21 > this.classFileBuffer.length - i22) {
                                C5919.m11245();
                                return;
                            }
                            utf = readUtf(i22, i21, new char[i21]);
                            i5 = unsignedShort;
                            i3 = i22;
                            context2 = context3;
                            utf8 = str9;
                            i4 = i21;
                            str2 = str4;
                        } else if (AttRuntimeInvisibleAnnotations.ATTRIBUTE_NAME.equals(utf83)) {
                            i5 = unsignedShort;
                            i3 = i22;
                            i13 = i3;
                        } else if ("RuntimeInvisibleTypeAnnotations".equals(utf83)) {
                            i5 = unsignedShort;
                            i3 = i22;
                            i15 = i3;
                        } else if ("Record".equals(utf83)) {
                            i5 = 65536 | unsignedShort;
                            i3 = i22;
                            i19 = i3;
                        } else if ("Module".equals(utf83)) {
                            i5 = unsignedShort;
                            i3 = i22;
                            i11 = i3;
                        } else if ("ModuleMainClass".equals(utf83)) {
                            str8 = readClass(i22, cArr);
                        } else if ("ModulePackages".equals(utf83)) {
                            i5 = unsignedShort;
                            i3 = i22;
                            i12 = i3;
                        } else {
                            if (AttBootstrapMethods.ATTRIBUTE_NAME.equals(utf83)) {
                                context2 = context3;
                                str = str10;
                                i2 = unsignedShort;
                                i3 = i22;
                                utf8 = str9;
                                i4 = i21;
                                str2 = str4;
                                str3 = str7;
                            } else {
                                context2 = context3;
                                str = str10;
                                utf8 = str9;
                                str2 = str4;
                                str3 = str7;
                                i2 = unsignedShort;
                                i3 = i22;
                                i4 = i21;
                                Attribute attribute2 = readAttribute(attributeArr, utf83, i3, i4, cArr, -1, null);
                                attribute2.nextAttribute = attribute;
                                attribute = attribute2;
                            }
                            utf = str;
                            str7 = str3;
                            i5 = i2;
                        }
                        i3 = i22;
                    }
                    i5 = unsignedShort;
                    i3 = i22;
                }
                utf = str10;
                utf8 = str9;
                i4 = i21;
                context2 = context3;
                str2 = str4;
            }
            int i23 = i3 + i4;
            unsignedShort3--;
            unsignedShort = i5;
            str6 = utf8;
            context3 = context2;
            str4 = str2;
            firstAttributeOffset = i23;
        }
        String str11 = str6;
        Context context4 = context3;
        String str12 = str4;
        String str13 = utf;
        String str14 = str7;
        Attribute attribute3 = attribute;
        classVisitor.visit(readInt(this.cpInfoOffsets[1] - 7), unsignedShort, str12, utf82, str5, strArr);
        if ((i & 2) == 0 && (str11 != null || str13 != null)) {
            classVisitor.visitSource(str11, str13);
        }
        if (i11 != 0) {
            context = context4;
            classReader = this;
            classReader.readModuleAttributes(classVisitor, context, i11, i12, str8);
        } else {
            context = context4;
            classReader = this;
        }
        if (str14 != null) {
            classVisitor.visitNestHost(str14);
        }
        if (i10 != 0) {
            String str15 = classReader.readClass(i10, cArr);
            int unsignedShort4 = classReader.readUnsignedShort(i10 + 2);
            classVisitor.visitOuterClass(str15, unsignedShort4 == 0 ? null : classReader.readUTF8(classReader.cpInfoOffsets[unsignedShort4], cArr), unsignedShort4 == 0 ? null : classReader.readUTF8(classReader.cpInfoOffsets[unsignedShort4] + 2, cArr));
        }
        if (i9 != 0) {
            int unsignedShort5 = classReader.readUnsignedShort(i9);
            int elementValues = i9 + 2;
            while (true) {
                int i24 = unsignedShort5 - 1;
                if (unsignedShort5 <= 0) {
                    break;
                }
                elementValues = classReader.readElementValues(classVisitor.visitAnnotation(classReader.readUTF8(elementValues, cArr), true), elementValues + 2, true, cArr);
                unsignedShort5 = i24;
            }
        }
        int i25 = i13;
        if (i25 != 0) {
            int unsignedShort6 = classReader.readUnsignedShort(i25);
            int elementValues2 = i25 + 2;
            while (true) {
                int i26 = unsignedShort6 - 1;
                if (unsignedShort6 <= 0) {
                    break;
                }
                elementValues2 = classReader.readElementValues(classVisitor.visitAnnotation(classReader.readUTF8(elementValues2, cArr), false), elementValues2 + 2, true, cArr);
                unsignedShort6 = i26;
            }
        }
        int i27 = i14;
        if (i27 != 0) {
            int unsignedShort7 = classReader.readUnsignedShort(i27);
            int elementValues3 = i27 + 2;
            while (true) {
                int i28 = unsignedShort7 - 1;
                if (unsignedShort7 <= 0) {
                    break;
                }
                int typeAnnotationTarget = classReader.readTypeAnnotationTarget(context, elementValues3);
                elementValues3 = classReader.readElementValues(classVisitor.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, classReader.readUTF8(typeAnnotationTarget, cArr), true), typeAnnotationTarget + 2, true, cArr);
                unsignedShort7 = i28;
            }
        }
        int i29 = i15;
        if (i29 != 0) {
            int unsignedShort8 = classReader.readUnsignedShort(i29);
            int elementValues4 = i29 + 2;
            while (true) {
                int i30 = unsignedShort8 - 1;
                if (unsignedShort8 <= 0) {
                    break;
                }
                int typeAnnotationTarget2 = classReader.readTypeAnnotationTarget(context, elementValues4);
                elementValues4 = classReader.readElementValues(classVisitor.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, classReader.readUTF8(typeAnnotationTarget2, cArr), false), typeAnnotationTarget2 + 2, true, cArr);
                unsignedShort8 = i30;
            }
        }
        while (attribute3 != null) {
            Attribute attribute4 = attribute3.nextAttribute;
            attribute3.nextAttribute = null;
            classVisitor.visitAttribute(attribute3);
            attribute3 = attribute4;
        }
        int i31 = i16;
        if (i31 != 0) {
            int unsignedShort9 = classReader.readUnsignedShort(i31);
            int i32 = i31 + 2;
            while (true) {
                int i33 = unsignedShort9 - 1;
                if (unsignedShort9 <= 0) {
                    break;
                }
                classVisitor.visitNestMember(classReader.readClass(i32, cArr));
                i32 += 2;
                unsignedShort9 = i33;
            }
        }
        int i34 = i17;
        if (i34 != 0) {
            int unsignedShort10 = classReader.readUnsignedShort(i34);
            int i35 = i34 + 2;
            while (true) {
                int i36 = unsignedShort10 - 1;
                if (unsignedShort10 <= 0) {
                    break;
                }
                classVisitor.visitPermittedSubclass(classReader.readClass(i35, cArr));
                i35 += 2;
                unsignedShort10 = i36;
            }
        }
        int i37 = i18;
        if (i37 != 0) {
            int unsignedShort11 = classReader.readUnsignedShort(i37);
            int i38 = i37 + 2;
            while (true) {
                int i39 = unsignedShort11 - 1;
                if (unsignedShort11 <= 0) {
                    break;
                }
                classVisitor.visitInnerClass(classReader.readClass(i38, cArr), classReader.readClass(i38 + 2, cArr), classReader.readUTF8(i38 + 4, cArr), classReader.readUnsignedShort(i38 + 6));
                i38 += 8;
                unsignedShort11 = i39;
            }
        }
        int i40 = i19;
        if (i40 != 0) {
            int unsignedShort12 = classReader.readUnsignedShort(i40);
            int recordComponent = i40 + 2;
            while (true) {
                int i41 = unsignedShort12 - 1;
                if (unsignedShort12 <= 0) {
                    break;
                }
                recordComponent = classReader.readRecordComponent(classVisitor, context, recordComponent);
                unsignedShort12 = i41;
            }
        }
        int unsignedShort13 = classReader.readUnsignedShort(i7);
        int field = i7 + 2;
        while (true) {
            int i42 = unsignedShort13 - 1;
            if (unsignedShort13 <= 0) {
                break;
            }
            field = classReader.readField(classVisitor, context, field);
            unsignedShort13 = i42;
        }
        int unsignedShort14 = classReader.readUnsignedShort(field);
        int method = field + 2;
        while (true) {
            int i43 = unsignedShort14 - 1;
            if (unsignedShort14 <= 0) {
                classVisitor.visitEnd();
                return;
            } else {
                method = classReader.readMethod(classVisitor, context, method);
                unsignedShort14 = i43;
            }
        }
    }

    public int getAccess() {
        return readUnsignedShort(this.header);
    }

    public String getClassName() {
        return readClass(this.header + 2, new char[this.maxStringLength]);
    }

    public final int getFirstAttributeOffset() {
        int i = this.header;
        int unsignedShort = (readUnsignedShort(i + 6) * 2) + i + 8;
        int unsignedShort2 = readUnsignedShort(unsignedShort);
        int i2 = unsignedShort + 2;
        while (true) {
            int i3 = unsignedShort2 - 1;
            if (unsignedShort2 <= 0) {
                break;
            }
            int unsignedShort3 = readUnsignedShort(i2 + 6);
            i2 += 8;
            while (true) {
                int i4 = unsignedShort3 - 1;
                if (unsignedShort3 > 0) {
                    i2 += readInt(i2 + 2) + 6;
                    unsignedShort3 = i4;
                }
            }
            unsignedShort2 = i3;
        }
        int unsignedShort4 = readUnsignedShort(i2);
        int i5 = i2 + 2;
        while (true) {
            int i6 = unsignedShort4 - 1;
            if (unsignedShort4 <= 0) {
                return i5 + 2;
            }
            int unsignedShort5 = readUnsignedShort(i5 + 6);
            i5 += 8;
            while (true) {
                int i7 = unsignedShort5 - 1;
                if (unsignedShort5 > 0) {
                    i5 += readInt(i5 + 2) + 6;
                    unsignedShort5 = i7;
                }
            }
            unsignedShort4 = i6;
        }
    }

    public String[] getInterfaces() {
        int i = this.header + 6;
        int unsignedShort = readUnsignedShort(i);
        String[] strArr = new String[unsignedShort];
        if (unsignedShort > 0) {
            char[] cArr = new char[this.maxStringLength];
            for (int i2 = 0; i2 < unsignedShort; i2++) {
                i += 2;
                strArr[i2] = readClass(i, cArr);
            }
        }
        return strArr;
    }

    public int getItem(int i) {
        return this.cpInfoOffsets[i];
    }

    public int getItemCount() {
        return this.cpInfoOffsets.length;
    }

    public int getMaxStringLength() {
        return this.maxStringLength;
    }

    public String getSuperName() {
        return readClass(this.header + 4, new char[this.maxStringLength]);
    }

    public int readByte(int i) {
        return this.classFileBuffer[i] & DefaultClassResolver.NAME;
    }

    public byte[] readBytes(int i, int i2) {
        byte[] bArr = new byte[i2];
        System.arraycopy(this.classFileBuffer, i, bArr, 0, i2);
        return bArr;
    }

    public String readClass(int i, char[] cArr) {
        return readStringish(i, cArr);
    }

    public Object readConst(int i, char[] cArr) {
        int i2 = this.cpInfoOffsets[i];
        byte b = this.classFileBuffer[i2 - 1];
        switch (b) {
            case 3:
                return Integer.valueOf(readInt(i2));
            case 4:
                return Float.valueOf(Float.intBitsToFloat(readInt(i2)));
            case 5:
                return Long.valueOf(readLong(i2));
            case 6:
                return Double.valueOf(Double.longBitsToDouble(readLong(i2)));
            case 7:
                return Type.getObjectType(readUTF8(i2, cArr));
            case 8:
                return readUTF8(i2, cArr);
            default:
                switch (b) {
                    case 15:
                        int i3 = readByte(i2);
                        int i4 = this.cpInfoOffsets[readUnsignedShort(i2 + 1)];
                        int i5 = this.cpInfoOffsets[readUnsignedShort(i4 + 2)];
                        return new Handle(i3, readClass(i4, cArr), readUTF8(i5, cArr), readUTF8(i5 + 2, cArr), this.classFileBuffer[i4 - 1] == 11);
                    case 16:
                        return Type.getMethodType(readUTF8(i2, cArr));
                    case 17:
                        return readConstantDynamic(i, cArr);
                    default:
                        C5919.m11245();
                        return null;
                }
        }
    }

    public int readInt(int i) {
        byte[] bArr = this.classFileBuffer;
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

    public String readModule(int i, char[] cArr) {
        return readStringish(i, cArr);
    }

    public String readPackage(int i, char[] cArr) {
        return readStringish(i, cArr);
    }

    public short readShort(int i) {
        byte[] bArr = this.classFileBuffer;
        return (short) ((bArr[i + 1] & DefaultClassResolver.NAME) | ((bArr[i] & DefaultClassResolver.NAME) << 8));
    }

    public String readUTF8(int i, char[] cArr) {
        int unsignedShort = readUnsignedShort(i);
        if (i == 0 || unsignedShort == 0) {
            return null;
        }
        return readUtf(unsignedShort, cArr);
    }

    public int readUnsignedShort(int i) {
        byte[] bArr = this.classFileBuffer;
        return (bArr[i + 1] & DefaultClassResolver.NAME) | ((bArr[i] & DefaultClassResolver.NAME) << 8);
    }

    public void readBytecodeInstructionOffset(int i) {
    }

    public final String readUtf(int i, char[] cArr) {
        String[] strArr = this.constantUtf8Values;
        String str = strArr[i];
        if (str != null) {
            return str;
        }
        int i2 = this.cpInfoOffsets[i];
        String utf = readUtf(i2 + 2, readUnsignedShort(i2), cArr);
        strArr[i] = utf;
        return utf;
    }

    public ClassReader(byte[] bArr, int i, int i2) {
        this(bArr, i, true);
    }

    public ClassReader(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public ClassReader(InputStream inputStream) {
        this(readStream(inputStream, false));
    }

    public ClassReader(String str) {
        this(readStream(ClassLoader.getSystemResourceAsStream(stringConcat$1(str.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/'))), true));
    }

    public void accept(ClassVisitor classVisitor, int i) {
        accept(classVisitor, new Attribute[0], i);
    }
}
