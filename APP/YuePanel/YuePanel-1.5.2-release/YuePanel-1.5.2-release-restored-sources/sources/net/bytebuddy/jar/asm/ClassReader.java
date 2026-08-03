package net.bytebuddy.jar.asm;

import Yue.C3626;
import Yue.C5445;
import Yue.C8149;
import Yue.C8273;
import Yue.C8578;
import com.android.p001dx.p002cf.attrib.AttAnnotationDefault;
import com.android.p001dx.p002cf.attrib.AttBootstrapMethods;
import com.android.p001dx.p002cf.attrib.AttCode;
import com.android.p001dx.p002cf.attrib.AttConstantValue;
import com.android.p001dx.p002cf.attrib.AttDeprecated;
import com.android.p001dx.p002cf.attrib.AttEnclosingMethod;
import com.android.p001dx.p002cf.attrib.AttExceptions;
import com.android.p001dx.p002cf.attrib.AttInnerClasses;
import com.android.p001dx.p002cf.attrib.AttLineNumberTable;
import com.android.p001dx.p002cf.attrib.AttLocalVariableTable;
import com.android.p001dx.p002cf.attrib.AttLocalVariableTypeTable;
import com.android.p001dx.p002cf.attrib.AttRuntimeInvisibleAnnotations;
import com.android.p001dx.p002cf.attrib.AttRuntimeInvisibleParameterAnnotations;
import com.android.p001dx.p002cf.attrib.AttRuntimeVisibleAnnotations;
import com.android.p001dx.p002cf.attrib.AttRuntimeVisibleParameterAnnotations;
import com.android.p001dx.p002cf.attrib.AttSignature;
import com.android.p001dx.p002cf.attrib.AttSourceDebugExtension;
import com.android.p001dx.p002cf.attrib.AttSourceFile;
import com.android.p001dx.p002cf.attrib.AttSynthetic;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: loaded from: classes2.dex */
public class ClassReader {
    static final int EXPAND_ASM_INSNS = 256;
    public static final int EXPAND_FRAMES = 8;
    private static final int INPUT_STREAM_DATA_CHUNK_SIZE = 4096;
    private static final int MAX_BUFFER_SIZE = 1048576;
    public static final int SKIP_CODE = 1;
    public static final int SKIP_DEBUG = 2;
    public static final int SKIP_FRAMES = 4;

    /* JADX INFO: renamed from: b */
    @Deprecated
    public final byte[] f4225b;
    private final int[] bootstrapMethodOffsets;
    final byte[] classFileBuffer;
    private final ConstantDynamic[] constantDynamicValues;
    private final String[] constantUtf8Values;
    private final int[] cpInfoOffsets;
    public final int header;
    private final int maxStringLength;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ClassReader(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    private static int computeBufferSize(InputStream inputStream) throws IOException {
        int iAvailable = inputStream.available();
        if (iAvailable < 256) {
            return 4096;
        }
        return Math.min(iAvailable, 1048576);
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
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Removed duplicated region for block: B:233:0x0822  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x085b  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0862  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0882  */
    /* JADX WARN: Type update failed for variable: r43v0 ??, new type: net.bytebuddy.jar.asm.MethodVisitor
    jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 35181. Try increasing type updates limit count.
    	at jadx.core.dex.visitors.typeinference.TypeUpdateInfo.requestUpdate(TypeUpdateInfo.java:37)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:224)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:507)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:513)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:507)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:513)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:507)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:507)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:507)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:507)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.ifListener(TypeUpdate.java:640)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.ifListener(TypeUpdate.java:640)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:513)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:513)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:507)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.ifListener(TypeUpdate.java:640)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:507)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:513)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:513)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:513)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:513)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:513)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arrayPutListener(TypeUpdate.java:616)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arrayGetListener(TypeUpdate.java:572)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.ifListener(TypeUpdate.java:640)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:399)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:86)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:72)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$0(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:186:0x0513 -> B:232:0x0820). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void readCode(MethodVisitor methodVisitor, Context context, int i) {
        Label[] labelArr;
        int i2;
        int i3;
        int i4;
        Label[] labelArr2;
        Attribute attribute;
        int i5;
        int i6;
        Attribute attribute2;
        int i7;
        int[] iArr;
        String utf8;
        int i8;
        int i9;
        int[] iArr2;
        int[] iArr3;
        int i10;
        int i11;
        int i12;
        boolean z;
        int i13;
        int i14;
        boolean z2;
        int typeAnnotationBytecodeOffset;
        int i15;
        int i16;
        int[] iArr4;
        int i17;
        char[] cArr;
        char[] cArr2;
        char c;
        boolean z3;
        int i18;
        int i19;
        int i20;
        int i21;
        int typeAnnotationBytecodeOffset2;
        int i22;
        int[] iArr5;
        int i23;
        int i24;
        int i25;
        boolean z4;
        int i26;
        int i27;
        int i28;
        int[] iArr6;
        int[] iArr7;
        char[] cArr3;
        boolean z5;
        Label[] labelArr3;
        int i29;
        int unsignedShort;
        int[] iArr8;
        Label[] labelArr4;
        int i30;
        int i31;
        int i32;
        MethodVisitor methodVisitor2 = methodVisitor;
        Context context2 = context;
        byte[] bArr = this.classFileBuffer;
        char[] cArr4 = context2.charBuffer;
        int unsignedShort2 = readUnsignedShort(i);
        int unsignedShort3 = readUnsignedShort(i + 2);
        int i33 = readInt(i + 4);
        int i34 = i + 8;
        if (i33 > this.classFileBuffer.length - i34) {
            throw new IllegalArgumentException();
        }
        int i35 = i34 + i33;
        Label[] labelArr5 = new Label[i33 + 1];
        context2.currentMethodLabels = labelArr5;
        int i36 = i34;
        while (i36 < i35) {
            int i37 = i36 - i34;
            switch (bArr[i36] & 255) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                case 69:
                case 70:
                case 71:
                case 72:
                case 73:
                case 74:
                case 75:
                case 76:
                case 77:
                case 78:
                case 79:
                case 80:
                case 81:
                case 82:
                case 83:
                case 84:
                case 85:
                case 86:
                case 87:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                case 93:
                case 94:
                case 95:
                case 96:
                case 97:
                case 98:
                case 99:
                case 100:
                case 101:
                case 102:
                case 103:
                case 104:
                case 105:
                case 106:
                case 107:
                case 108:
                case 109:
                case 110:
                case 111:
                case 112:
                case 113:
                case 114:
                case 115:
                case 116:
                case 117:
                case 118:
                case 119:
                case 120:
                case 121:
                case 122:
                case 123:
                case 124:
                case 125:
                case 126:
                case 127:
                case 128:
                case 129:
                case 130:
                case 131:
                case 133:
                case 134:
                case 135:
                case 136:
                case 137:
                case 138:
                case 139:
                case 140:
                case 141:
                case 142:
                case 143:
                case 144:
                case 145:
                case 146:
                case 147:
                case 148:
                case 149:
                case 150:
                case 151:
                case 152:
                case 172:
                case 173:
                case 174:
                case 175:
                case 176:
                case 177:
                case 190:
                case 191:
                case 194:
                case 195:
                    i36++;
                    break;
                case 16:
                case 18:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 169:
                case 188:
                    i36 += 2;
                    break;
                case 17:
                case 19:
                case 20:
                case 132:
                case 178:
                case 179:
                case 180:
                case 181:
                case 182:
                case 183:
                case 184:
                case 187:
                case 189:
                case 192:
                case 193:
                    i36 += 3;
                    break;
                case 153:
                case 154:
                case 155:
                case 156:
                case 157:
                case 158:
                case 159:
                case 160:
                case 161:
                case 162:
                case 163:
                case 164:
                case 165:
                case 166:
                case 167:
                case 168:
                case 198:
                case 199:
                    createLabel(i37 + readShort(i36 + 1), labelArr5);
                    i36 += 3;
                    break;
                case 170:
                    int i38 = i36 + (4 - (i37 & 3));
                    createLabel(readInt(i38) + i37, labelArr5);
                    int i39 = (readInt(i38 + 8) - readInt(i38 + 4)) + 1;
                    i36 = i38 + 12;
                    while (true) {
                        int i40 = i39 - 1;
                        if (i39 > 0) {
                            createLabel(readInt(i36) + i37, labelArr5);
                            i36 += 4;
                            i39 = i40;
                        }
                    }
                    break;
                case 171:
                    int i41 = i36 + (4 - (i37 & 3));
                    createLabel(readInt(i41) + i37, labelArr5);
                    int i42 = readInt(i41 + 4);
                    i36 = i41 + 8;
                    while (true) {
                        int i43 = i42 - 1;
                        if (i42 > 0) {
                            createLabel(readInt(i36 + 4) + i37, labelArr5);
                            i36 += 8;
                            i42 = i43;
                        }
                    }
                    break;
                case 185:
                case 186:
                    i36 += 5;
                    break;
                case 196:
                    int i44 = bArr[i36 + 1] & 255;
                    if (i44 != 132) {
                        if (i44 != 169) {
                            switch (i44) {
                                default:
                                    switch (i44) {
                                        case 54:
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                            break;
                                        default:
                                            throw new IllegalArgumentException();
                                    }
                                case 21:
                                case 22:
                                case 23:
                                case 24:
                                case 25:
                                    i36 += 4;
                                    break;
                            }
                        }
                        i36 += 4;
                    } else {
                        i36 += 6;
                    }
                    break;
                case 197:
                    i36 += 4;
                    break;
                case 200:
                case 201:
                case com.android.p001dx.p004io.Opcodes.REM_INT_LIT8 /* 220 */:
                    createLabel(i37 + readInt(i36 + 1), labelArr5);
                    i36 += 5;
                    break;
                case com.android.p001dx.p004io.Opcodes.REM_FLOAT_2ADDR /* 202 */:
                case com.android.p001dx.p004io.Opcodes.ADD_DOUBLE_2ADDR /* 203 */:
                case com.android.p001dx.p004io.Opcodes.SUB_DOUBLE_2ADDR /* 204 */:
                case com.android.p001dx.p004io.Opcodes.MUL_DOUBLE_2ADDR /* 205 */:
                case com.android.p001dx.p004io.Opcodes.DIV_DOUBLE_2ADDR /* 206 */:
                case com.android.p001dx.p004io.Opcodes.REM_DOUBLE_2ADDR /* 207 */:
                case com.android.p001dx.p004io.Opcodes.ADD_INT_LIT16 /* 208 */:
                case com.android.p001dx.p004io.Opcodes.RSUB_INT /* 209 */:
                case com.android.p001dx.p004io.Opcodes.MUL_INT_LIT16 /* 210 */:
                case com.android.p001dx.p004io.Opcodes.DIV_INT_LIT16 /* 211 */:
                case com.android.p001dx.p004io.Opcodes.REM_INT_LIT16 /* 212 */:
                case com.android.p001dx.p004io.Opcodes.AND_INT_LIT16 /* 213 */:
                case com.android.p001dx.p004io.Opcodes.OR_INT_LIT16 /* 214 */:
                case com.android.p001dx.p004io.Opcodes.XOR_INT_LIT16 /* 215 */:
                case com.android.p001dx.p004io.Opcodes.ADD_INT_LIT8 /* 216 */:
                case com.android.p001dx.p004io.Opcodes.RSUB_INT_LIT8 /* 217 */:
                case com.android.p001dx.p004io.Opcodes.MUL_INT_LIT8 /* 218 */:
                case com.android.p001dx.p004io.Opcodes.DIV_INT_LIT8 /* 219 */:
                    createLabel(i37 + readUnsignedShort(i36 + 1), labelArr5);
                    i36 += 3;
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        }
        int unsignedShort4 = readUnsignedShort(i36);
        int i45 = i36 + 2;
        while (true) {
            int i46 = unsignedShort4 - 1;
            if (unsignedShort4 > 0) {
                Label labelCreateLabel = createLabel(readUnsignedShort(i45), labelArr5);
                Label labelCreateLabel2 = createLabel(readUnsignedShort(i45 + 2), labelArr5);
                Label labelCreateLabel3 = createLabel(readUnsignedShort(i45 + 4), labelArr5);
                String utf82 = readUTF8(this.cpInfoOffsets[readUnsignedShort(i45 + 6)], cArr4);
                i45 += 8;
                methodVisitor2.visitTryCatchBlock(labelCreateLabel, labelCreateLabel2, labelCreateLabel3, utf82);
                unsignedShort4 = i46;
                i35 = i35;
            } else {
                int i47 = i35;
                int unsignedShort5 = readUnsignedShort(i45);
                int i48 = i45 + 2;
                int[] typeAnnotations = null;
                boolean z6 = true;
                int i49 = 0;
                int[] typeAnnotations2 = null;
                int i50 = 0;
                Attribute attribute3 = null;
                int i51 = 0;
                int i52 = 0;
                while (true) {
                    int i53 = unsignedShort5 - 1;
                    if (unsignedShort5 > 0) {
                        String utf83 = readUTF8(i48, cArr4);
                        int i54 = readInt(i48 + 2);
                        int i55 = i48 + 6;
                        if (!AttLocalVariableTable.ATTRIBUTE_NAME.equals(utf83)) {
                            iArr8 = typeAnnotations;
                            if (AttLocalVariableTypeTable.ATTRIBUTE_NAME.equals(utf83)) {
                                labelArr4 = labelArr5;
                                i30 = i55;
                                i52 = i30;
                                i32 = i33;
                                i31 = i47;
                                typeAnnotations = iArr8;
                            } else if (AttLineNumberTable.ATTRIBUTE_NAME.equals(utf83)) {
                                if ((context2.parsingOptions & 2) == 0) {
                                    int unsignedShort6 = readUnsignedShort(i55);
                                    int i56 = i48 + 8;
                                    while (true) {
                                        int i57 = unsignedShort6 - 1;
                                        if (unsignedShort6 > 0) {
                                            int unsignedShort7 = readUnsignedShort(i56);
                                            int unsignedShort8 = readUnsignedShort(i56 + 2);
                                            i56 += 4;
                                            createDebugLabel(unsignedShort7, labelArr5);
                                            labelArr5[unsignedShort7].addLineNumber(unsignedShort8);
                                            unsignedShort6 = i57;
                                        }
                                    }
                                }
                                labelArr4 = labelArr5;
                                i30 = i55;
                                i32 = i33;
                                i31 = i47;
                                typeAnnotations = iArr8;
                            } else if ("RuntimeVisibleTypeAnnotations".equals(utf83)) {
                                typeAnnotations = readTypeAnnotations(methodVisitor2, context2, i55, true);
                                labelArr4 = labelArr5;
                                i30 = i55;
                                i32 = i33;
                                i31 = i47;
                            } else {
                                if ("RuntimeInvisibleTypeAnnotations".equals(utf83)) {
                                    typeAnnotations2 = readTypeAnnotations(methodVisitor2, context2, i55, false);
                                } else if ("StackMapTable".equals(utf83)) {
                                    if ((context2.parsingOptions & 4) == 0) {
                                        i49 = i48 + 8;
                                        i50 = i55 + i54;
                                    }
                                } else if (!"StackMap".equals(utf83)) {
                                    labelArr4 = labelArr5;
                                    i30 = i55;
                                    i31 = i47;
                                    i32 = i33;
                                    Attribute attribute4 = readAttribute(context2.attributePrototypes, utf83, i55, i54, cArr4, i, labelArr4);
                                    attribute4.nextAttribute = attribute3;
                                    attribute3 = attribute4;
                                    typeAnnotations = iArr8;
                                    z6 = z6;
                                    i48 = i30 + i54;
                                    labelArr5 = labelArr4;
                                    unsignedShort5 = i53;
                                    i47 = i31;
                                    i33 = i32;
                                } else if ((context2.parsingOptions & 4) == 0) {
                                    i49 = i48 + 8;
                                    i50 = i55 + i54;
                                    labelArr4 = labelArr5;
                                    i30 = i55;
                                    i32 = i33;
                                    i31 = i47;
                                    typeAnnotations = iArr8;
                                    z6 = false;
                                }
                                labelArr4 = labelArr5;
                                i30 = i55;
                                i32 = i33;
                                i31 = i47;
                                typeAnnotations = iArr8;
                            }
                        } else if ((context2.parsingOptions & 2) == 0) {
                            int unsignedShort9 = readUnsignedShort(i55);
                            int i58 = i48 + 8;
                            while (true) {
                                int i59 = unsignedShort9 - 1;
                                if (unsignedShort9 > 0) {
                                    int unsignedShort10 = readUnsignedShort(i58);
                                    createDebugLabel(unsignedShort10, labelArr5);
                                    createDebugLabel(unsignedShort10 + readUnsignedShort(i58 + 2), labelArr5);
                                    i58 += 10;
                                    unsignedShort9 = i59;
                                    typeAnnotations = typeAnnotations;
                                } else {
                                    labelArr4 = labelArr5;
                                    i30 = i55;
                                    i51 = i30;
                                    i32 = i33;
                                    i31 = i47;
                                }
                            }
                        } else {
                            iArr8 = typeAnnotations;
                            labelArr4 = labelArr5;
                            i30 = i55;
                            i32 = i33;
                            i31 = i47;
                            typeAnnotations = iArr8;
                        }
                        i48 = i30 + i54;
                        labelArr5 = labelArr4;
                        unsignedShort5 = i53;
                        i47 = i31;
                        i33 = i32;
                    } else {
                        int[] iArr9 = typeAnnotations;
                        boolean z7 = z6;
                        Label[] labelArr6 = labelArr5;
                        int i60 = i33;
                        int i61 = i47;
                        Attribute attribute5 = attribute3;
                        boolean z8 = (context2.parsingOptions & 8) != 0;
                        if (i49 != 0) {
                            context2.currentFrameOffset = -1;
                            context2.currentFrameType = 0;
                            context2.currentFrameLocalCount = 0;
                            context2.currentFrameLocalCountDelta = 0;
                            context2.currentFrameLocalTypes = new Object[unsignedShort3];
                            context2.currentFrameStackCount = 0;
                            context2.currentFrameStackTypes = new Object[unsignedShort2];
                            if (z8) {
                                computeImplicitFrame(context2);
                            }
                            int i62 = i49;
                            while (true) {
                                i2 = i50;
                                if (i62 < i2 - 2) {
                                    if (bArr[i62] != 8 || (unsignedShort = readUnsignedShort(i62 + 1)) < 0) {
                                        labelArr3 = labelArr6;
                                        i29 = i60;
                                    } else {
                                        i29 = i60;
                                        if (unsignedShort >= i29 || (bArr[i34 + unsignedShort] & 255) != 187) {
                                            labelArr3 = labelArr6;
                                        } else {
                                            labelArr3 = labelArr6;
                                            createLabel(unsignedShort, labelArr3);
                                        }
                                    }
                                    i62++;
                                    i60 = i29;
                                    i50 = i2;
                                    labelArr6 = labelArr3;
                                } else {
                                    labelArr = labelArr6;
                                }
                            }
                        } else {
                            labelArr = labelArr6;
                            i2 = i50;
                        }
                        int i63 = i60;
                        if (!z8 || (context2.parsingOptions & 256) == 0) {
                            i3 = i63;
                            i4 = i2;
                            labelArr2 = labelArr;
                            attribute = attribute5;
                            i5 = 0;
                        } else {
                            i3 = i63;
                            i4 = i2;
                            attribute = attribute5;
                            i5 = 0;
                            labelArr2 = labelArr;
                            methodVisitor.visitFrame(-1, unsignedShort3, null, 0, null);
                        }
                        int[] iArr10 = iArr9;
                        int typeAnnotationBytecodeOffset3 = getTypeAnnotationBytecodeOffset(iArr10, i5);
                        int[] iArr11 = typeAnnotations2;
                        int typeAnnotationBytecodeOffset4 = getTypeAnnotationBytecodeOffset(iArr11, i5);
                        int i64 = (context2.parsingOptions & 256) == 0 ? 33 : i5;
                        int i65 = typeAnnotationBytecodeOffset4;
                        int i66 = i5;
                        int i67 = i66;
                        int i68 = i34;
                        int i69 = i49;
                        int i70 = typeAnnotationBytecodeOffset3;
                        int i71 = i67;
                        while (true) {
                            int i72 = i61;
                            if (i68 >= i72) {
                                int[] iArr12 = iArr11;
                                int[] iArr13 = iArr10;
                                int i73 = unsignedShort2;
                                int i74 = unsignedShort3;
                                Label[] labelArr7 = labelArr2;
                                Label label = labelArr7[i3];
                                if (label != null) {
                                    methodVisitor2.visitLabel(label);
                                }
                                int i75 = i51;
                                if (i75 != 0 && (context2.parsingOptions & 2) == 0) {
                                    int i76 = i52;
                                    if (i76 != 0) {
                                        int unsignedShort11 = readUnsignedShort(i76) * 3;
                                        int[] iArr14 = new int[unsignedShort11];
                                        int i77 = i76 + 2;
                                        while (unsignedShort11 > 0) {
                                            iArr14[unsignedShort11 - 1] = i77 + 6;
                                            iArr14[unsignedShort11 - 2] = readUnsignedShort(i77 + 8);
                                            unsignedShort11 -= 3;
                                            iArr14[unsignedShort11] = readUnsignedShort(i77);
                                            i77 += 10;
                                        }
                                        iArr = iArr14;
                                    } else {
                                        iArr = null;
                                    }
                                    int unsignedShort12 = readUnsignedShort(i75);
                                    int i78 = i75 + 2;
                                    while (true) {
                                        int i79 = unsignedShort12 - 1;
                                        if (unsignedShort12 > 0) {
                                            int unsignedShort13 = readUnsignedShort(i78);
                                            int unsignedShort14 = readUnsignedShort(i78 + 2);
                                            String utf84 = readUTF8(i78 + 4, cArr4);
                                            String utf85 = readUTF8(i78 + 6, cArr4);
                                            int unsignedShort15 = readUnsignedShort(i78 + 8);
                                            int i80 = i78 + 10;
                                            if (iArr != null) {
                                                for (int i81 = i5; i81 < iArr.length; i81 += 3) {
                                                    if (iArr[i81] == unsignedShort13 && iArr[i81 + 1] == unsignedShort15) {
                                                        utf8 = readUTF8(iArr[i81 + 2], cArr4);
                                                    }
                                                }
                                                utf8 = null;
                                            } else {
                                                utf8 = null;
                                            }
                                            methodVisitor.visitLocalVariable(utf84, utf85, utf8, labelArr7[unsignedShort13], labelArr7[unsignedShort13 + unsignedShort14], unsignedShort15);
                                            iArr12 = iArr12;
                                            unsignedShort12 = i79;
                                            i78 = i80;
                                            i5 = 0;
                                            iArr = iArr;
                                        }
                                    }
                                }
                                int[] iArr15 = iArr12;
                                int i82 = 65;
                                int i83 = 64;
                                if (iArr13 != null) {
                                    int length = iArr13.length;
                                    int i84 = 0;
                                    while (i84 < length) {
                                        int i85 = iArr13[i84];
                                        int i86 = readByte(i85);
                                        if (i86 == 64 || i86 == i82) {
                                            int typeAnnotationTarget = readTypeAnnotationTarget(context2, i85);
                                            i6 = i84;
                                            attribute2 = attribute;
                                            i7 = length;
                                            readElementValues(methodVisitor.visitLocalVariableAnnotation(context2.currentTypeAnnotationTarget, context2.currentTypeAnnotationTargetPath, context2.currentLocalVariableAnnotationRangeStarts, context2.currentLocalVariableAnnotationRangeEnds, context2.currentLocalVariableAnnotationRangeIndices, readUTF8(typeAnnotationTarget, cArr4), true), typeAnnotationTarget + 2, true, cArr4);
                                        } else {
                                            i6 = i84;
                                            attribute2 = attribute;
                                            i7 = length;
                                        }
                                        i84 = i6 + 1;
                                        length = i7;
                                        attribute = attribute2;
                                        i82 = 65;
                                    }
                                }
                                Attribute attribute6 = attribute;
                                if (iArr15 != null) {
                                    int length2 = iArr15.length;
                                    int i87 = 0;
                                    while (i87 < length2) {
                                        int i88 = iArr15[i87];
                                        int i89 = readByte(i88);
                                        if (i89 == i83 || i89 == 65) {
                                            int typeAnnotationTarget2 = readTypeAnnotationTarget(context2, i88);
                                            readElementValues(methodVisitor.visitLocalVariableAnnotation(context2.currentTypeAnnotationTarget, context2.currentTypeAnnotationTargetPath, context2.currentLocalVariableAnnotationRangeStarts, context2.currentLocalVariableAnnotationRangeEnds, context2.currentLocalVariableAnnotationRangeIndices, readUTF8(typeAnnotationTarget2, cArr4), false), typeAnnotationTarget2 + 2, true, cArr4);
                                        }
                                        i87++;
                                        i83 = 64;
                                    }
                                }
                                Attribute attribute7 = attribute6;
                                while (attribute7 != null) {
                                    Attribute attribute8 = attribute7.nextAttribute;
                                    attribute7.nextAttribute = null;
                                    methodVisitor2.visitAttribute(attribute7);
                                    attribute7 = attribute8;
                                }
                                methodVisitor2.visitMaxs(i73, i74);
                                return;
                            }
                            int i90 = i68 - i34;
                            readBytecodeInstructionOffset(i90);
                            int i91 = i71;
                            int i92 = unsignedShort2;
                            Label[] labelArr8 = labelArr2;
                            Label label2 = labelArr8[i90];
                            int i93 = i69;
                            if (label2 != null) {
                                label2.accept(methodVisitor2, (context2.parsingOptions & 2) == 0);
                            }
                            int i94 = i91;
                            int stackMapFrame = i93;
                            while (true) {
                                if (stackMapFrame != 0) {
                                    int i95 = stackMapFrame;
                                    int i96 = context2.currentFrameOffset;
                                    i10 = unsignedShort3;
                                    if (i96 == i90 || i96 == -1) {
                                        if (i96 != -1) {
                                            boolean z9 = z7;
                                            if (!z9 || z8) {
                                                i26 = i95;
                                                i27 = i72;
                                                i28 = i68;
                                                iArr6 = iArr11;
                                                iArr7 = iArr10;
                                                cArr3 = cArr4;
                                                z5 = z9;
                                                methodVisitor.visitFrame(-1, context2.currentFrameLocalCount, context2.currentFrameLocalTypes, context2.currentFrameStackCount, context2.currentFrameStackTypes);
                                            } else {
                                                i26 = i95;
                                                cArr3 = cArr4;
                                                z5 = z9;
                                                i27 = i72;
                                                i28 = i68;
                                                iArr6 = iArr11;
                                                iArr7 = iArr10;
                                                methodVisitor.visitFrame(context2.currentFrameType, context2.currentFrameLocalCountDelta, context2.currentFrameLocalTypes, context2.currentFrameStackCount, context2.currentFrameStackTypes);
                                            }
                                            i94 = 0;
                                        } else {
                                            i26 = i95;
                                            i27 = i72;
                                            i28 = i68;
                                            iArr6 = iArr11;
                                            iArr7 = iArr10;
                                            boolean z10 = z7;
                                            cArr3 = cArr4;
                                            z5 = z10;
                                        }
                                        if (i26 < i4) {
                                            stackMapFrame = readStackMapFrame(i26, z5, z8, context2);
                                            i68 = i28;
                                            unsignedShort3 = i10;
                                            i72 = i27;
                                            iArr11 = iArr6;
                                            iArr10 = iArr7;
                                        } else {
                                            i68 = i28;
                                            unsignedShort3 = i10;
                                            i72 = i27;
                                            iArr11 = iArr6;
                                            iArr10 = iArr7;
                                            stackMapFrame = 0;
                                        }
                                        char[] cArr5 = cArr3;
                                        z7 = z5;
                                        cArr4 = cArr5;
                                    } else {
                                        i8 = i95;
                                        i9 = i72;
                                        i11 = i68;
                                        iArr2 = iArr11;
                                        iArr3 = iArr10;
                                    }
                                } else {
                                    i8 = stackMapFrame;
                                    i9 = i72;
                                    iArr2 = iArr11;
                                    iArr3 = iArr10;
                                    i10 = unsignedShort3;
                                    i11 = i68;
                                }
                            }
                            boolean z11 = z7;
                            char[] cArr6 = cArr4;
                            if (i94 != 0) {
                                if ((context2.parsingOptions & 8) != 0) {
                                    methodVisitor.visitFrame(256, 0, null, 0, null);
                                }
                                i12 = 0;
                            } else {
                                i12 = i94;
                            }
                            int i97 = bArr[i11] & 255;
                            switch (i97) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                case 46:
                                case 47:
                                case 48:
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                case 85:
                                case 86:
                                case 87:
                                case 88:
                                case 89:
                                case 90:
                                case 91:
                                case 92:
                                case 93:
                                case 94:
                                case 95:
                                case 96:
                                case 97:
                                case 98:
                                case 99:
                                case 100:
                                case 101:
                                case 102:
                                case 103:
                                case 104:
                                case 105:
                                case 106:
                                case 107:
                                case 108:
                                case 109:
                                case 110:
                                case 111:
                                case 112:
                                case 113:
                                case 114:
                                case 115:
                                case 116:
                                case 117:
                                case 118:
                                case 119:
                                case 120:
                                case 121:
                                case 122:
                                case 123:
                                case 124:
                                case 125:
                                case 126:
                                case 127:
                                case 128:
                                case 129:
                                case 130:
                                case 131:
                                case 133:
                                case 134:
                                case 135:
                                case 136:
                                case 137:
                                case 138:
                                case 139:
                                case 140:
                                case 141:
                                case 142:
                                case 143:
                                case 144:
                                case 145:
                                case 146:
                                case 147:
                                case 148:
                                case 149:
                                case 150:
                                case 151:
                                case 152:
                                case 172:
                                case 173:
                                case 174:
                                case 175:
                                case 176:
                                case 177:
                                case 190:
                                case 191:
                                case 194:
                                case 195:
                                    z = z8;
                                    i13 = i8;
                                    i14 = i4;
                                    z2 = true;
                                    methodVisitor2 = methodVisitor;
                                    z7 = z11;
                                    cArr4 = cArr6;
                                    methodVisitor2.visitInsn(i97);
                                    i68 = i11 + 1;
                                    typeAnnotationBytecodeOffset = i70;
                                    i15 = i66;
                                    i16 = i12;
                                    iArr4 = iArr3;
                                    if (iArr4 != null || i15 >= iArr4.length || typeAnnotationBytecodeOffset > i90) {
                                        context2 = context;
                                        typeAnnotationBytecodeOffset2 = i65;
                                        i22 = i67;
                                        iArr5 = iArr2;
                                        while (iArr5 != null && i22 < iArr5.length && typeAnnotationBytecodeOffset2 <= i90) {
                                            if (typeAnnotationBytecodeOffset2 != i90) {
                                                int typeAnnotationTarget3 = readTypeAnnotationTarget(context2, iArr5[i22]);
                                                i23 = i16;
                                                i24 = typeAnnotationBytecodeOffset;
                                                i25 = i90;
                                                readElementValues(methodVisitor2.visitInsnAnnotation(context2.currentTypeAnnotationTarget, context2.currentTypeAnnotationTargetPath, readUTF8(typeAnnotationTarget3, cArr4), false), typeAnnotationTarget3 + 2, true, cArr4);
                                            } else {
                                                i23 = i16;
                                                i24 = typeAnnotationBytecodeOffset;
                                                i25 = i90;
                                            }
                                            i22++;
                                            typeAnnotationBytecodeOffset2 = getTypeAnnotationBytecodeOffset(iArr5, i22);
                                            i16 = i23;
                                            typeAnnotationBytecodeOffset = i24;
                                            i90 = i25;
                                        }
                                        i5 = 0;
                                        i66 = i15;
                                        i67 = i22;
                                        iArr11 = iArr5;
                                        iArr10 = iArr4;
                                        labelArr2 = labelArr8;
                                        i71 = i16;
                                        i70 = typeAnnotationBytecodeOffset;
                                        unsignedShort2 = i92;
                                        unsignedShort3 = i10;
                                        i69 = i13;
                                        i61 = i9;
                                        i4 = i14;
                                        z8 = z;
                                        i65 = typeAnnotationBytecodeOffset2;
                                    } else {
                                        if (typeAnnotationBytecodeOffset == i90) {
                                            z4 = z2;
                                            int typeAnnotationTarget4 = readTypeAnnotationTarget(context, iArr4[i15]);
                                            readElementValues(methodVisitor2.visitInsnAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, readUTF8(typeAnnotationTarget4, cArr4), z4), typeAnnotationTarget4 + 2, z4, cArr4);
                                        } else {
                                            z4 = z2;
                                        }
                                        i15++;
                                        typeAnnotationBytecodeOffset = getTypeAnnotationBytecodeOffset(iArr4, i15);
                                        z2 = z4;
                                        if (iArr4 != null) {
                                        }
                                        context2 = context;
                                        typeAnnotationBytecodeOffset2 = i65;
                                        i22 = i67;
                                        iArr5 = iArr2;
                                        while (iArr5 != null) {
                                            if (typeAnnotationBytecodeOffset2 != i90) {
                                            }
                                            i22++;
                                            typeAnnotationBytecodeOffset2 = getTypeAnnotationBytecodeOffset(iArr5, i22);
                                            i16 = i23;
                                            typeAnnotationBytecodeOffset = i24;
                                            i90 = i25;
                                        }
                                        i5 = 0;
                                        i66 = i15;
                                        i67 = i22;
                                        iArr11 = iArr5;
                                        iArr10 = iArr4;
                                        labelArr2 = labelArr8;
                                        i71 = i16;
                                        i70 = typeAnnotationBytecodeOffset;
                                        unsignedShort2 = i92;
                                        unsignedShort3 = i10;
                                        i69 = i13;
                                        i61 = i9;
                                        i4 = i14;
                                        z8 = z;
                                        i65 = typeAnnotationBytecodeOffset2;
                                    }
                                    break;
                                case 16:
                                case 188:
                                    z = z8;
                                    i13 = i8;
                                    i14 = i4;
                                    z2 = true;
                                    methodVisitor2 = methodVisitor;
                                    z7 = z11;
                                    cArr4 = cArr6;
                                    methodVisitor2.visitIntInsn(i97, bArr[i11 + 1]);
                                    i68 = i11 + 2;
                                    typeAnnotationBytecodeOffset = i70;
                                    i15 = i66;
                                    i16 = i12;
                                    iArr4 = iArr3;
                                    if (iArr4 != null) {
                                    }
                                    context2 = context;
                                    typeAnnotationBytecodeOffset2 = i65;
                                    i22 = i67;
                                    iArr5 = iArr2;
                                    while (iArr5 != null) {
                                    }
                                    i5 = 0;
                                    i66 = i15;
                                    i67 = i22;
                                    iArr11 = iArr5;
                                    iArr10 = iArr4;
                                    labelArr2 = labelArr8;
                                    i71 = i16;
                                    i70 = typeAnnotationBytecodeOffset;
                                    unsignedShort2 = i92;
                                    unsignedShort3 = i10;
                                    i69 = i13;
                                    i61 = i9;
                                    i4 = i14;
                                    z8 = z;
                                    i65 = typeAnnotationBytecodeOffset2;
                                    break;
                                case 17:
                                    z = z8;
                                    i13 = i8;
                                    i14 = i4;
                                    z2 = true;
                                    methodVisitor2 = methodVisitor;
                                    z7 = z11;
                                    cArr4 = cArr6;
                                    methodVisitor2.visitIntInsn(i97, readShort(i11 + 1));
                                    i68 = i11 + 3;
                                    typeAnnotationBytecodeOffset = i70;
                                    i15 = i66;
                                    i16 = i12;
                                    iArr4 = iArr3;
                                    if (iArr4 != null) {
                                    }
                                    context2 = context;
                                    typeAnnotationBytecodeOffset2 = i65;
                                    i22 = i67;
                                    iArr5 = iArr2;
                                    while (iArr5 != null) {
                                    }
                                    i5 = 0;
                                    i66 = i15;
                                    i67 = i22;
                                    iArr11 = iArr5;
                                    iArr10 = iArr4;
                                    labelArr2 = labelArr8;
                                    i71 = i16;
                                    i70 = typeAnnotationBytecodeOffset;
                                    unsignedShort2 = i92;
                                    unsignedShort3 = i10;
                                    i69 = i13;
                                    i61 = i9;
                                    i4 = i14;
                                    z8 = z;
                                    i65 = typeAnnotationBytecodeOffset2;
                                    break;
                                case 18:
                                    z = z8;
                                    i13 = i8;
                                    i14 = i4;
                                    z2 = true;
                                    methodVisitor2 = methodVisitor;
                                    z7 = z11;
                                    cArr4 = cArr6;
                                    methodVisitor2.visitLdcInsn(readConst(bArr[i11 + 1] & 255, cArr4));
                                    i68 = i11 + 2;
                                    typeAnnotationBytecodeOffset = i70;
                                    i15 = i66;
                                    i16 = i12;
                                    iArr4 = iArr3;
                                    if (iArr4 != null) {
                                    }
                                    context2 = context;
                                    typeAnnotationBytecodeOffset2 = i65;
                                    i22 = i67;
                                    iArr5 = iArr2;
                                    while (iArr5 != null) {
                                    }
                                    i5 = 0;
                                    i66 = i15;
                                    i67 = i22;
                                    iArr11 = iArr5;
                                    iArr10 = iArr4;
                                    labelArr2 = labelArr8;
                                    i71 = i16;
                                    i70 = typeAnnotationBytecodeOffset;
                                    unsignedShort2 = i92;
                                    unsignedShort3 = i10;
                                    i69 = i13;
                                    i61 = i9;
                                    i4 = i14;
                                    z8 = z;
                                    i65 = typeAnnotationBytecodeOffset2;
                                    break;
                                case 19:
                                case 20:
                                    z = z8;
                                    i13 = i8;
                                    i14 = i4;
                                    z2 = true;
                                    methodVisitor2 = methodVisitor;
                                    z7 = z11;
                                    cArr4 = cArr6;
                                    methodVisitor2.visitLdcInsn(readConst(readUnsignedShort(i11 + 1), cArr4));
                                    i68 = i11 + 3;
                                    typeAnnotationBytecodeOffset = i70;
                                    i15 = i66;
                                    i16 = i12;
                                    iArr4 = iArr3;
                                    if (iArr4 != null) {
                                    }
                                    context2 = context;
                                    typeAnnotationBytecodeOffset2 = i65;
                                    i22 = i67;
                                    iArr5 = iArr2;
                                    while (iArr5 != null) {
                                    }
                                    i5 = 0;
                                    i66 = i15;
                                    i67 = i22;
                                    iArr11 = iArr5;
                                    iArr10 = iArr4;
                                    labelArr2 = labelArr8;
                                    i71 = i16;
                                    i70 = typeAnnotationBytecodeOffset;
                                    unsignedShort2 = i92;
                                    unsignedShort3 = i10;
                                    i69 = i13;
                                    i61 = i9;
                                    i4 = i14;
                                    z8 = z;
                                    i65 = typeAnnotationBytecodeOffset2;
                                    break;
                                case 21:
                                case 22:
                                case 23:
                                case 24:
                                case 25:
                                case 54:
                                case 55:
                                case 56:
                                case 57:
                                case 58:
                                case 169:
                                    z = z8;
                                    i13 = i8;
                                    i14 = i4;
                                    z2 = true;
                                    methodVisitor2 = methodVisitor;
                                    z7 = z11;
                                    cArr4 = cArr6;
                                    methodVisitor2.visitVarInsn(i97, bArr[i11 + 1] & 255);
                                    i68 = i11 + 2;
                                    typeAnnotationBytecodeOffset = i70;
                                    i15 = i66;
                                    i16 = i12;
                                    iArr4 = iArr3;
                                    if (iArr4 != null) {
                                    }
                                    context2 = context;
                                    typeAnnotationBytecodeOffset2 = i65;
                                    i22 = i67;
                                    iArr5 = iArr2;
                                    while (iArr5 != null) {
                                    }
                                    i5 = 0;
                                    i66 = i15;
                                    i67 = i22;
                                    iArr11 = iArr5;
                                    iArr10 = iArr4;
                                    labelArr2 = labelArr8;
                                    i71 = i16;
                                    i70 = typeAnnotationBytecodeOffset;
                                    unsignedShort2 = i92;
                                    unsignedShort3 = i10;
                                    i69 = i13;
                                    i61 = i9;
                                    i4 = i14;
                                    z8 = z;
                                    i65 = typeAnnotationBytecodeOffset2;
                                    break;
                                case 26:
                                case 27:
                                case 28:
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                case 33:
                                case 34:
                                case 35:
                                case 36:
                                case 37:
                                case 38:
                                case 39:
                                case 40:
                                case 41:
                                case 42:
                                case 43:
                                case 44:
                                case 45:
                                    z = z8;
                                    i13 = i8;
                                    i14 = i4;
                                    z2 = true;
                                    methodVisitor2 = methodVisitor;
                                    z7 = z11;
                                    cArr4 = cArr6;
                                    int i98 = i97 - 26;
                                    methodVisitor2.visitVarInsn((i98 >> 2) + 21, i98 & 3);
                                    i68 = i11 + 1;
                                    typeAnnotationBytecodeOffset = i70;
                                    i15 = i66;
                                    i16 = i12;
                                    iArr4 = iArr3;
                                    if (iArr4 != null) {
                                    }
                                    context2 = context;
                                    typeAnnotationBytecodeOffset2 = i65;
                                    i22 = i67;
                                    iArr5 = iArr2;
                                    while (iArr5 != null) {
                                    }
                                    i5 = 0;
                                    i66 = i15;
                                    i67 = i22;
                                    iArr11 = iArr5;
                                    iArr10 = iArr4;
                                    labelArr2 = labelArr8;
                                    i71 = i16;
                                    i70 = typeAnnotationBytecodeOffset;
                                    unsignedShort2 = i92;
                                    unsignedShort3 = i10;
                                    i69 = i13;
                                    i61 = i9;
                                    i4 = i14;
                                    z8 = z;
                                    i65 = typeAnnotationBytecodeOffset2;
                                    break;
                                case 59:
                                case 60:
                                case 61:
                                case 62:
                                case 63:
                                case 64:
                                case 65:
                                case 66:
                                case 67:
                                case 68:
                                case 69:
                                case 70:
                                case 71:
                                case 72:
                                case 73:
                                case 74:
                                case 75:
                                case 76:
                                case 77:
                                case 78:
                                    z = z8;
                                    i13 = i8;
                                    i14 = i4;
                                    z2 = true;
                                    methodVisitor2 = methodVisitor;
                                    z7 = z11;
                                    cArr4 = cArr6;
                                    int i99 = i97 - 59;
                                    methodVisitor2.visitVarInsn((i99 >> 2) + 54, i99 & 3);
                                    i68 = i11 + 1;
                                    typeAnnotationBytecodeOffset = i70;
                                    i15 = i66;
                                    i16 = i12;
                                    iArr4 = iArr3;
                                    if (iArr4 != null) {
                                    }
                                    context2 = context;
                                    typeAnnotationBytecodeOffset2 = i65;
                                    i22 = i67;
                                    iArr5 = iArr2;
                                    while (iArr5 != null) {
                                    }
                                    i5 = 0;
                                    i66 = i15;
                                    i67 = i22;
                                    iArr11 = iArr5;
                                    iArr10 = iArr4;
                                    labelArr2 = labelArr8;
                                    i71 = i16;
                                    i70 = typeAnnotationBytecodeOffset;
                                    unsignedShort2 = i92;
                                    unsignedShort3 = i10;
                                    i69 = i13;
                                    i61 = i9;
                                    i4 = i14;
                                    z8 = z;
                                    i65 = typeAnnotationBytecodeOffset2;
                                    break;
                                case 132:
                                    z = z8;
                                    i13 = i8;
                                    i14 = i4;
                                    z2 = true;
                                    methodVisitor2 = methodVisitor;
                                    z7 = z11;
                                    cArr4 = cArr6;
                                    methodVisitor2.visitIincInsn(bArr[i11 + 1] & 255, bArr[i11 + 2]);
                                    i68 = i11 + 3;
                                    typeAnnotationBytecodeOffset = i70;
                                    i15 = i66;
                                    i16 = i12;
                                    iArr4 = iArr3;
                                    if (iArr4 != null) {
                                    }
                                    context2 = context;
                                    typeAnnotationBytecodeOffset2 = i65;
                                    i22 = i67;
                                    iArr5 = iArr2;
                                    while (iArr5 != null) {
                                    }
                                    i5 = 0;
                                    i66 = i15;
                                    i67 = i22;
                                    iArr11 = iArr5;
                                    iArr10 = iArr4;
                                    labelArr2 = labelArr8;
                                    i71 = i16;
                                    i70 = typeAnnotationBytecodeOffset;
                                    unsignedShort2 = i92;
                                    unsignedShort3 = i10;
                                    i69 = i13;
                                    i61 = i9;
                                    i4 = i14;
                                    z8 = z;
                                    i65 = typeAnnotationBytecodeOffset2;
                                    break;
                                case 153:
                                case 154:
                                case 155:
                                case 156:
                                case 157:
                                case 158:
                                case 159:
                                case 160:
                                case 161:
                                case 162:
                                case 163:
                                case 164:
                                case 165:
                                case 166:
                                case 167:
                                case 168:
                                case 198:
                                case 199:
                                    z = z8;
                                    i13 = i8;
                                    i14 = i4;
                                    z2 = true;
                                    methodVisitor2 = methodVisitor;
                                    z7 = z11;
                                    cArr4 = cArr6;
                                    methodVisitor2.visitJumpInsn(i97, labelArr8[readShort(i11 + 1) + i90]);
                                    i68 = i11 + 3;
                                    typeAnnotationBytecodeOffset = i70;
                                    i15 = i66;
                                    i16 = i12;
                                    iArr4 = iArr3;
                                    if (iArr4 != null) {
                                    }
                                    context2 = context;
                                    typeAnnotationBytecodeOffset2 = i65;
                                    i22 = i67;
                                    iArr5 = iArr2;
                                    while (iArr5 != null) {
                                    }
                                    i5 = 0;
                                    i66 = i15;
                                    i67 = i22;
                                    iArr11 = iArr5;
                                    iArr10 = iArr4;
                                    labelArr2 = labelArr8;
                                    i71 = i16;
                                    i70 = typeAnnotationBytecodeOffset;
                                    unsignedShort2 = i92;
                                    unsignedShort3 = i10;
                                    i69 = i13;
                                    i61 = i9;
                                    i4 = i14;
                                    z8 = z;
                                    i65 = typeAnnotationBytecodeOffset2;
                                    break;
                                case 170:
                                    z = z8;
                                    i13 = i8;
                                    i14 = i4;
                                    z2 = true;
                                    methodVisitor2 = methodVisitor;
                                    z7 = z11;
                                    cArr4 = cArr6;
                                    int i100 = i11 + (4 - (i90 & 3));
                                    Label label3 = labelArr8[readInt(i100) + i90];
                                    int i101 = readInt(i100 + 4);
                                    int i102 = readInt(i100 + 8);
                                    i68 = i100 + 12;
                                    int i103 = (i102 - i101) + 1;
                                    Label[] labelArr9 = new Label[i103];
                                    for (int i104 = 0; i104 < i103; i104++) {
                                        labelArr9[i104] = labelArr8[readInt(i68) + i90];
                                        i68 += 4;
                                    }
                                    methodVisitor2.visitTableSwitchInsn(i101, i102, label3, labelArr9);
                                    typeAnnotationBytecodeOffset = i70;
                                    i15 = i66;
                                    i16 = i12;
                                    iArr4 = iArr3;
                                    if (iArr4 != null) {
                                    }
                                    context2 = context;
                                    typeAnnotationBytecodeOffset2 = i65;
                                    i22 = i67;
                                    iArr5 = iArr2;
                                    while (iArr5 != null) {
                                    }
                                    i5 = 0;
                                    i66 = i15;
                                    i67 = i22;
                                    iArr11 = iArr5;
                                    iArr10 = iArr4;
                                    labelArr2 = labelArr8;
                                    i71 = i16;
                                    i70 = typeAnnotationBytecodeOffset;
                                    unsignedShort2 = i92;
                                    unsignedShort3 = i10;
                                    i69 = i13;
                                    i61 = i9;
                                    i4 = i14;
                                    z8 = z;
                                    i65 = typeAnnotationBytecodeOffset2;
                                    break;
                                case 171:
                                    z = z8;
                                    i13 = i8;
                                    i14 = i4;
                                    z2 = true;
                                    methodVisitor2 = methodVisitor;
                                    z7 = z11;
                                    cArr4 = cArr6;
                                    int i105 = i11 + (4 - (i90 & 3));
                                    Label label4 = labelArr8[readInt(i105) + i90];
                                    int i106 = readInt(i105 + 4);
                                    i68 = i105 + 8;
                                    int[] iArr16 = new int[i106];
                                    Label[] labelArr10 = new Label[i106];
                                    for (int i107 = 0; i107 < i106; i107++) {
                                        iArr16[i107] = readInt(i68);
                                        labelArr10[i107] = labelArr8[readInt(i68 + 4) + i90];
                                        i68 += 8;
                                    }
                                    methodVisitor2.visitLookupSwitchInsn(label4, iArr16, labelArr10);
                                    typeAnnotationBytecodeOffset = i70;
                                    i15 = i66;
                                    i16 = i12;
                                    iArr4 = iArr3;
                                    if (iArr4 != null) {
                                    }
                                    context2 = context;
                                    typeAnnotationBytecodeOffset2 = i65;
                                    i22 = i67;
                                    iArr5 = iArr2;
                                    while (iArr5 != null) {
                                    }
                                    i5 = 0;
                                    i66 = i15;
                                    i67 = i22;
                                    iArr11 = iArr5;
                                    iArr10 = iArr4;
                                    labelArr2 = labelArr8;
                                    i71 = i16;
                                    i70 = typeAnnotationBytecodeOffset;
                                    unsignedShort2 = i92;
                                    unsignedShort3 = i10;
                                    i69 = i13;
                                    i61 = i9;
                                    i4 = i14;
                                    z8 = z;
                                    i65 = typeAnnotationBytecodeOffset2;
                                    break;
                                case 178:
                                case 179:
                                case 180:
                                case 181:
                                case 182:
                                case 183:
                                case 184:
                                case 185:
                                    z = z8;
                                    i13 = i8;
                                    i14 = i4;
                                    methodVisitor2 = methodVisitor;
                                    int i108 = this.cpInfoOffsets[readUnsignedShort(i11 + 1)];
                                    int i109 = this.cpInfoOffsets[readUnsignedShort(i108 + 2)];
                                    String str = readClass(i108, cArr6);
                                    String utf86 = readUTF8(i109, cArr6);
                                    String utf87 = readUTF8(i109 + 2, cArr6);
                                    if (i97 < 182) {
                                        methodVisitor2.visitFieldInsn(i97, str, utf86, utf87);
                                        i17 = i97;
                                        z7 = z11;
                                        z2 = true;
                                        cArr4 = cArr6;
                                    } else {
                                        z7 = z11;
                                        cArr4 = cArr6;
                                        z2 = true;
                                        i17 = i97;
                                        methodVisitor.visitMethodInsn(i97, str, utf86, utf87, bArr[i108 + (-1)] == 11);
                                    }
                                    i68 = i17 == 185 ? i11 + 5 : i11 + 3;
                                    typeAnnotationBytecodeOffset = i70;
                                    i15 = i66;
                                    i16 = i12;
                                    iArr4 = iArr3;
                                    if (iArr4 != null) {
                                    }
                                    context2 = context;
                                    typeAnnotationBytecodeOffset2 = i65;
                                    i22 = i67;
                                    iArr5 = iArr2;
                                    while (iArr5 != null) {
                                    }
                                    i5 = 0;
                                    i66 = i15;
                                    i67 = i22;
                                    iArr11 = iArr5;
                                    iArr10 = iArr4;
                                    labelArr2 = labelArr8;
                                    i71 = i16;
                                    i70 = typeAnnotationBytecodeOffset;
                                    unsignedShort2 = i92;
                                    unsignedShort3 = i10;
                                    i69 = i13;
                                    i61 = i9;
                                    i4 = i14;
                                    z8 = z;
                                    i65 = typeAnnotationBytecodeOffset2;
                                    break;
                                case 186:
                                    i13 = i8;
                                    cArr = cArr6;
                                    methodVisitor2 = methodVisitor;
                                    int i110 = this.cpInfoOffsets[readUnsignedShort(i11 + 1)];
                                    int i111 = this.cpInfoOffsets[readUnsignedShort(i110 + 2)];
                                    String utf88 = readUTF8(i111, cArr);
                                    String utf89 = readUTF8(i111 + 2, cArr);
                                    int i112 = this.bootstrapMethodOffsets[readUnsignedShort(i110)];
                                    Handle handle = (Handle) readConst(readUnsignedShort(i112), cArr);
                                    int unsignedShort16 = readUnsignedShort(i112 + 2);
                                    z = z8;
                                    Object[] objArr = new Object[unsignedShort16];
                                    int i113 = i112 + 4;
                                    i14 = i4;
                                    int i114 = 0;
                                    while (i114 < unsignedShort16) {
                                        objArr[i114] = readConst(readUnsignedShort(i113), cArr);
                                        i113 += 2;
                                        i114++;
                                        unsignedShort16 = unsignedShort16;
                                    }
                                    methodVisitor2.visitInvokeDynamicInsn(utf88, utf89, handle, objArr);
                                    i68 = i11 + 5;
                                    z7 = z11;
                                    typeAnnotationBytecodeOffset = i70;
                                    i15 = i66;
                                    i16 = i12;
                                    iArr4 = iArr3;
                                    z2 = true;
                                    cArr4 = cArr;
                                    if (iArr4 != null) {
                                    }
                                    context2 = context;
                                    typeAnnotationBytecodeOffset2 = i65;
                                    i22 = i67;
                                    iArr5 = iArr2;
                                    while (iArr5 != null) {
                                    }
                                    i5 = 0;
                                    i66 = i15;
                                    i67 = i22;
                                    iArr11 = iArr5;
                                    iArr10 = iArr4;
                                    labelArr2 = labelArr8;
                                    i71 = i16;
                                    i70 = typeAnnotationBytecodeOffset;
                                    unsignedShort2 = i92;
                                    unsignedShort3 = i10;
                                    i69 = i13;
                                    i61 = i9;
                                    i4 = i14;
                                    z8 = z;
                                    i65 = typeAnnotationBytecodeOffset2;
                                    break;
                                case 187:
                                case 189:
                                case 192:
                                case 193:
                                    i13 = i8;
                                    cArr2 = cArr6;
                                    c = 132;
                                    z3 = true;
                                    methodVisitor2 = methodVisitor;
                                    methodVisitor2.visitTypeInsn(i97, readClass(i11 + 1, cArr2));
                                    i18 = i11 + 3;
                                    z2 = z3;
                                    z = z8;
                                    i14 = i4;
                                    z7 = z11;
                                    typeAnnotationBytecodeOffset = i70;
                                    i15 = i66;
                                    iArr4 = iArr3;
                                    i68 = i18;
                                    cArr4 = cArr2;
                                    i16 = i12;
                                    if (iArr4 != null) {
                                    }
                                    context2 = context;
                                    typeAnnotationBytecodeOffset2 = i65;
                                    i22 = i67;
                                    iArr5 = iArr2;
                                    while (iArr5 != null) {
                                    }
                                    i5 = 0;
                                    i66 = i15;
                                    i67 = i22;
                                    iArr11 = iArr5;
                                    iArr10 = iArr4;
                                    labelArr2 = labelArr8;
                                    i71 = i16;
                                    i70 = typeAnnotationBytecodeOffset;
                                    unsignedShort2 = i92;
                                    unsignedShort3 = i10;
                                    i69 = i13;
                                    i61 = i9;
                                    i4 = i14;
                                    z8 = z;
                                    i65 = typeAnnotationBytecodeOffset2;
                                    break;
                                case 196:
                                    i13 = i8;
                                    cArr2 = cArr6;
                                    z3 = true;
                                    methodVisitor2 = methodVisitor;
                                    int i115 = bArr[i11 + 1] & 255;
                                    c = 132;
                                    if (i115 == 132) {
                                        methodVisitor2.visitIincInsn(readUnsignedShort(i11 + 2), readShort(i11 + 4));
                                        i18 = i11 + 6;
                                    } else {
                                        methodVisitor2.visitVarInsn(i115, readUnsignedShort(i11 + 2));
                                        i18 = i11 + 4;
                                    }
                                    z2 = z3;
                                    z = z8;
                                    i14 = i4;
                                    z7 = z11;
                                    typeAnnotationBytecodeOffset = i70;
                                    i15 = i66;
                                    iArr4 = iArr3;
                                    i68 = i18;
                                    cArr4 = cArr2;
                                    i16 = i12;
                                    if (iArr4 != null) {
                                    }
                                    context2 = context;
                                    typeAnnotationBytecodeOffset2 = i65;
                                    i22 = i67;
                                    iArr5 = iArr2;
                                    while (iArr5 != null) {
                                    }
                                    i5 = 0;
                                    i66 = i15;
                                    i67 = i22;
                                    iArr11 = iArr5;
                                    iArr10 = iArr4;
                                    labelArr2 = labelArr8;
                                    i71 = i16;
                                    i70 = typeAnnotationBytecodeOffset;
                                    unsignedShort2 = i92;
                                    unsignedShort3 = i10;
                                    i69 = i13;
                                    i61 = i9;
                                    i4 = i14;
                                    z8 = z;
                                    i65 = typeAnnotationBytecodeOffset2;
                                    break;
                                case 197:
                                    i13 = i8;
                                    methodVisitor2 = methodVisitor;
                                    cArr = cArr6;
                                    methodVisitor2.visitMultiANewArrayInsn(readClass(i11 + 1, cArr), bArr[i11 + 3] & 255);
                                    i68 = i11 + 4;
                                    z2 = true;
                                    z = z8;
                                    i14 = i4;
                                    z7 = z11;
                                    typeAnnotationBytecodeOffset = i70;
                                    i15 = i66;
                                    i16 = i12;
                                    iArr4 = iArr3;
                                    cArr4 = cArr;
                                    if (iArr4 != null) {
                                    }
                                    context2 = context;
                                    typeAnnotationBytecodeOffset2 = i65;
                                    i22 = i67;
                                    iArr5 = iArr2;
                                    while (iArr5 != null) {
                                    }
                                    i5 = 0;
                                    i66 = i15;
                                    i67 = i22;
                                    iArr11 = iArr5;
                                    iArr10 = iArr4;
                                    labelArr2 = labelArr8;
                                    i71 = i16;
                                    i70 = typeAnnotationBytecodeOffset;
                                    unsignedShort2 = i92;
                                    unsignedShort3 = i10;
                                    i69 = i13;
                                    i61 = i9;
                                    i4 = i14;
                                    z8 = z;
                                    i65 = typeAnnotationBytecodeOffset2;
                                    break;
                                case 200:
                                case 201:
                                    i13 = i8;
                                    methodVisitor2 = methodVisitor;
                                    methodVisitor2.visitJumpInsn(i97 - i64, labelArr8[readInt(i11 + 1) + i90]);
                                    i68 = i11 + 5;
                                    z2 = true;
                                    z = z8;
                                    i14 = i4;
                                    typeAnnotationBytecodeOffset = i70;
                                    i15 = i66;
                                    i16 = i12;
                                    iArr4 = iArr3;
                                    z7 = z11;
                                    cArr4 = cArr6;
                                    if (iArr4 != null) {
                                    }
                                    context2 = context;
                                    typeAnnotationBytecodeOffset2 = i65;
                                    i22 = i67;
                                    iArr5 = iArr2;
                                    while (iArr5 != null) {
                                    }
                                    i5 = 0;
                                    i66 = i15;
                                    i67 = i22;
                                    iArr11 = iArr5;
                                    iArr10 = iArr4;
                                    labelArr2 = labelArr8;
                                    i71 = i16;
                                    i70 = typeAnnotationBytecodeOffset;
                                    unsignedShort2 = i92;
                                    unsignedShort3 = i10;
                                    i69 = i13;
                                    i61 = i9;
                                    i4 = i14;
                                    z8 = z;
                                    i65 = typeAnnotationBytecodeOffset2;
                                    break;
                                case com.android.p001dx.p004io.Opcodes.REM_FLOAT_2ADDR /* 202 */:
                                case com.android.p001dx.p004io.Opcodes.ADD_DOUBLE_2ADDR /* 203 */:
                                case com.android.p001dx.p004io.Opcodes.SUB_DOUBLE_2ADDR /* 204 */:
                                case com.android.p001dx.p004io.Opcodes.MUL_DOUBLE_2ADDR /* 205 */:
                                case com.android.p001dx.p004io.Opcodes.DIV_DOUBLE_2ADDR /* 206 */:
                                case com.android.p001dx.p004io.Opcodes.REM_DOUBLE_2ADDR /* 207 */:
                                case com.android.p001dx.p004io.Opcodes.ADD_INT_LIT16 /* 208 */:
                                case com.android.p001dx.p004io.Opcodes.RSUB_INT /* 209 */:
                                case com.android.p001dx.p004io.Opcodes.MUL_INT_LIT16 /* 210 */:
                                case com.android.p001dx.p004io.Opcodes.DIV_INT_LIT16 /* 211 */:
                                case com.android.p001dx.p004io.Opcodes.REM_INT_LIT16 /* 212 */:
                                case com.android.p001dx.p004io.Opcodes.AND_INT_LIT16 /* 213 */:
                                case com.android.p001dx.p004io.Opcodes.OR_INT_LIT16 /* 214 */:
                                case com.android.p001dx.p004io.Opcodes.XOR_INT_LIT16 /* 215 */:
                                case com.android.p001dx.p004io.Opcodes.ADD_INT_LIT8 /* 216 */:
                                case com.android.p001dx.p004io.Opcodes.RSUB_INT_LIT8 /* 217 */:
                                case com.android.p001dx.p004io.Opcodes.MUL_INT_LIT8 /* 218 */:
                                case com.android.p001dx.p004io.Opcodes.DIV_INT_LIT8 /* 219 */:
                                    i13 = i8;
                                    methodVisitor2 = methodVisitor;
                                    int i116 = i97 < 218 ? i97 - 49 : i97 - 20;
                                    Label label5 = labelArr8[readUnsignedShort(i11 + 1) + i90];
                                    if (i116 == 167 || i116 == 168) {
                                        i19 = 1;
                                        methodVisitor2.visitJumpInsn(i116 + 33, label5);
                                        i20 = i12;
                                    } else {
                                        if (i116 < 167) {
                                            i19 = 1;
                                            i21 = ((i116 + 1) ^ 1) - 1;
                                        } else {
                                            i19 = 1;
                                            i21 = i116 ^ 1;
                                        }
                                        methodVisitor2.visitJumpInsn(i21, createLabel(i90 + 3, labelArr8));
                                        methodVisitor2.visitJumpInsn(200, label5);
                                        i20 = i19;
                                    }
                                    z2 = i19;
                                    z = z8;
                                    i14 = i4;
                                    typeAnnotationBytecodeOffset = i70;
                                    i15 = i66;
                                    iArr4 = iArr3;
                                    int i117 = i20;
                                    i68 = i11 + 3;
                                    i16 = i117;
                                    z7 = z11;
                                    cArr4 = cArr6;
                                    if (iArr4 != null) {
                                    }
                                    context2 = context;
                                    typeAnnotationBytecodeOffset2 = i65;
                                    i22 = i67;
                                    iArr5 = iArr2;
                                    while (iArr5 != null) {
                                    }
                                    i5 = 0;
                                    i66 = i15;
                                    i67 = i22;
                                    iArr11 = iArr5;
                                    iArr10 = iArr4;
                                    labelArr2 = labelArr8;
                                    i71 = i16;
                                    i70 = typeAnnotationBytecodeOffset;
                                    unsignedShort2 = i92;
                                    unsignedShort3 = i10;
                                    i69 = i13;
                                    i61 = i9;
                                    i4 = i14;
                                    z8 = z;
                                    i65 = typeAnnotationBytecodeOffset2;
                                    break;
                                case com.android.p001dx.p004io.Opcodes.REM_INT_LIT8 /* 220 */:
                                    i13 = i8;
                                    methodVisitor2 = methodVisitor;
                                    methodVisitor2.visitJumpInsn(200, labelArr8[readInt(i11 + 1) + i90]);
                                    i68 = i11 + 5;
                                    z = z8;
                                    i14 = i4;
                                    typeAnnotationBytecodeOffset = i70;
                                    i15 = i66;
                                    iArr4 = iArr3;
                                    i16 = 1;
                                    z2 = true;
                                    z7 = z11;
                                    cArr4 = cArr6;
                                    if (iArr4 != null) {
                                    }
                                    context2 = context;
                                    typeAnnotationBytecodeOffset2 = i65;
                                    i22 = i67;
                                    iArr5 = iArr2;
                                    while (iArr5 != null) {
                                    }
                                    i5 = 0;
                                    i66 = i15;
                                    i67 = i22;
                                    iArr11 = iArr5;
                                    iArr10 = iArr4;
                                    labelArr2 = labelArr8;
                                    i71 = i16;
                                    i70 = typeAnnotationBytecodeOffset;
                                    unsignedShort2 = i92;
                                    unsignedShort3 = i10;
                                    i69 = i13;
                                    i61 = i9;
                                    i4 = i14;
                                    z8 = z;
                                    i65 = typeAnnotationBytecodeOffset2;
                                    break;
                                default:
                                    throw new AssertionError();
                            }
                        }
                    }
                }
            }
        }
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

    /* JADX WARN: Removed duplicated region for block: B:98:0x020c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int readElementValue(AnnotationVisitor annotationVisitor, int i, String str, char[] cArr) {
        int i2 = 0;
        if (annotationVisitor == null) {
            int i3 = this.classFileBuffer[i] & 255;
            return i3 != 64 ? i3 != 91 ? i3 != 101 ? i + 3 : i + 5 : readElementValues(null, i + 1, false, cArr) : readElementValues(null, i + 3, true, cArr);
        }
        int i4 = i + 1;
        int i5 = this.classFileBuffer[i] & 255;
        if (i5 == 64) {
            return readElementValues(annotationVisitor.visitAnnotation(str, readUTF8(i4, cArr)), i + 3, true, cArr);
        }
        if (i5 == 70) {
            annotationVisitor.visit(str, readConst(readUnsignedShort(i4), cArr));
        } else if (i5 == 83) {
            annotationVisitor.visit(str, Short.valueOf((short) readInt(this.cpInfoOffsets[readUnsignedShort(i4)])));
        } else if (i5 == 99) {
            annotationVisitor.visit(str, Type.getType(readUTF8(i4, cArr)));
        } else {
            if (i5 == 101) {
                annotationVisitor.visitEnum(str, readUTF8(i4, cArr), readUTF8(i + 3, cArr));
                return i + 5;
            }
            if (i5 == 115) {
                annotationVisitor.visit(str, readUTF8(i4, cArr));
            } else if (i5 != 73 && i5 != 74) {
                if (i5 == 90) {
                    annotationVisitor.visit(str, readInt(this.cpInfoOffsets[readUnsignedShort(i4)]) == 0 ? Boolean.FALSE : Boolean.TRUE);
                } else {
                    if (i5 == 91) {
                        int unsignedShort = readUnsignedShort(i4);
                        int i6 = i + 3;
                        if (unsignedShort == 0) {
                            return readElementValues(annotationVisitor.visitArray(str), i + 1, false, cArr);
                        }
                        int i7 = this.classFileBuffer[i6] & 255;
                        if (i7 == 70) {
                            float[] fArr = new float[unsignedShort];
                            while (i2 < unsignedShort) {
                                fArr[i2] = Float.intBitsToFloat(readInt(this.cpInfoOffsets[readUnsignedShort(i6 + 1)]));
                                i6 += 3;
                                i2++;
                            }
                            annotationVisitor.visit(str, fArr);
                        } else if (i7 == 83) {
                            short[] sArr = new short[unsignedShort];
                            while (i2 < unsignedShort) {
                                sArr[i2] = (short) readInt(this.cpInfoOffsets[readUnsignedShort(i6 + 1)]);
                                i6 += 3;
                                i2++;
                            }
                            annotationVisitor.visit(str, sArr);
                        } else if (i7 == 90) {
                            boolean[] zArr = new boolean[unsignedShort];
                            for (int i8 = 0; i8 < unsignedShort; i8++) {
                                zArr[i8] = readInt(this.cpInfoOffsets[readUnsignedShort(i6 + 1)]) != 0;
                                i6 += 3;
                            }
                            annotationVisitor.visit(str, zArr);
                        } else if (i7 == 73) {
                            int[] iArr = new int[unsignedShort];
                            while (i2 < unsignedShort) {
                                iArr[i2] = readInt(this.cpInfoOffsets[readUnsignedShort(i6 + 1)]);
                                i6 += 3;
                                i2++;
                            }
                            annotationVisitor.visit(str, iArr);
                        } else if (i7 != 74) {
                            switch (i7) {
                                case 66:
                                    byte[] bArr = new byte[unsignedShort];
                                    while (i2 < unsignedShort) {
                                        bArr[i2] = (byte) readInt(this.cpInfoOffsets[readUnsignedShort(i6 + 1)]);
                                        i6 += 3;
                                        i2++;
                                    }
                                    annotationVisitor.visit(str, bArr);
                                    break;
                                case 67:
                                    char[] cArr2 = new char[unsignedShort];
                                    while (i2 < unsignedShort) {
                                        cArr2[i2] = (char) readInt(this.cpInfoOffsets[readUnsignedShort(i6 + 1)]);
                                        i6 += 3;
                                        i2++;
                                    }
                                    annotationVisitor.visit(str, cArr2);
                                    break;
                                case 68:
                                    double[] dArr = new double[unsignedShort];
                                    while (i2 < unsignedShort) {
                                        dArr[i2] = Double.longBitsToDouble(readLong(this.cpInfoOffsets[readUnsignedShort(i6 + 1)]));
                                        i6 += 3;
                                        i2++;
                                    }
                                    annotationVisitor.visit(str, dArr);
                                    break;
                                default:
                                    return readElementValues(annotationVisitor.visitArray(str), i + 1, false, cArr);
                            }
                        } else {
                            long[] jArr = new long[unsignedShort];
                            while (i2 < unsignedShort) {
                                jArr[i2] = readLong(this.cpInfoOffsets[readUnsignedShort(i6 + 1)]);
                                i6 += 3;
                                i2++;
                            }
                            annotationVisitor.visit(str, jArr);
                        }
                        return i6;
                    }
                    switch (i5) {
                        case 66:
                            annotationVisitor.visit(str, Byte.valueOf((byte) readInt(this.cpInfoOffsets[readUnsignedShort(i4)])));
                            break;
                        case 67:
                            annotationVisitor.visit(str, Character.valueOf((char) readInt(this.cpInfoOffsets[readUnsignedShort(i4)])));
                            break;
                        case 68:
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                }
            }
        }
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
        Context context2 = context;
        char[] cArr = context2.charBuffer;
        int unsignedShort = readUnsignedShort(i);
        String utf8 = readUTF8(i + 2, cArr);
        String utf82 = readUTF8(i + 4, cArr);
        int unsignedShort2 = readUnsignedShort(i + 6);
        int i4 = i + 8;
        int i5 = unsignedShort;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        Attribute attribute = null;
        String utf83 = null;
        Object obj = null;
        while (true) {
            int i10 = unsignedShort2 - 1;
            if (unsignedShort2 <= 0) {
                break;
            }
            String utf84 = readUTF8(i4, cArr);
            int i11 = readInt(i4 + 2);
            int i12 = i4 + 6;
            if (AttConstantValue.ATTRIBUTE_NAME.equals(utf84)) {
                int unsignedShort3 = readUnsignedShort(i12);
                obj = unsignedShort3 == 0 ? null : readConst(unsignedShort3, cArr);
            } else if (AttSignature.ATTRIBUTE_NAME.equals(utf84)) {
                utf83 = readUTF8(i12, cArr);
            } else {
                if (AttDeprecated.ATTRIBUTE_NAME.equals(utf84)) {
                    i3 = 131072 | i5;
                } else if (AttSynthetic.ATTRIBUTE_NAME.equals(utf84)) {
                    i3 = i5 | 4096;
                } else {
                    if (AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME.equals(utf84)) {
                        i9 = i12;
                        i2 = i9;
                    } else if ("RuntimeVisibleTypeAnnotations".equals(utf84)) {
                        i7 = i12;
                        i2 = i7;
                    } else if (AttRuntimeInvisibleAnnotations.ATTRIBUTE_NAME.equals(utf84)) {
                        i8 = i12;
                        i2 = i8;
                    } else if ("RuntimeInvisibleTypeAnnotations".equals(utf84)) {
                        i6 = i12;
                        i2 = i6;
                    } else {
                        i2 = i12;
                        Attribute attribute2 = attribute;
                        attribute = readAttribute(context2.attributePrototypes, utf84, i2, i11, cArr, -1, null);
                        attribute.nextAttribute = attribute2;
                        i8 = i8;
                        i9 = i9;
                        i6 = i6;
                        i7 = i7;
                    }
                    i4 = i2 + i11;
                    context2 = context;
                    unsignedShort2 = i10;
                }
                i5 = i3;
            }
            i2 = i12;
            i4 = i2 + i11;
            context2 = context;
            unsignedShort2 = i10;
        }
        Attribute attribute3 = attribute;
        int i13 = i6;
        int i14 = i7;
        int i15 = i8;
        int i16 = i9;
        FieldVisitor fieldVisitorVisitField = classVisitor.visitField(i5, utf8, utf82, utf83, obj);
        if (fieldVisitorVisitField == null) {
            return i4;
        }
        if (i16 != 0) {
            int unsignedShort4 = readUnsignedShort(i16);
            int elementValues = i16 + 2;
            while (true) {
                int i17 = unsignedShort4 - 1;
                if (unsignedShort4 <= 0) {
                    break;
                }
                elementValues = readElementValues(fieldVisitorVisitField.visitAnnotation(readUTF8(elementValues, cArr), true), elementValues + 2, true, cArr);
                unsignedShort4 = i17;
            }
        }
        if (i15 != 0) {
            int unsignedShort5 = readUnsignedShort(i15);
            int elementValues2 = i15 + 2;
            while (true) {
                int i18 = unsignedShort5 - 1;
                if (unsignedShort5 <= 0) {
                    break;
                }
                elementValues2 = readElementValues(fieldVisitorVisitField.visitAnnotation(readUTF8(elementValues2, cArr), false), elementValues2 + 2, true, cArr);
                unsignedShort5 = i18;
            }
        }
        if (i14 != 0) {
            int unsignedShort6 = readUnsignedShort(i14);
            int elementValues3 = i14 + 2;
            while (true) {
                int i19 = unsignedShort6 - 1;
                if (unsignedShort6 <= 0) {
                    break;
                }
                int typeAnnotationTarget = readTypeAnnotationTarget(context, elementValues3);
                elementValues3 = readElementValues(fieldVisitorVisitField.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, readUTF8(typeAnnotationTarget, cArr), true), typeAnnotationTarget + 2, true, cArr);
                unsignedShort6 = i19;
            }
        }
        if (i13 != 0) {
            int unsignedShort7 = readUnsignedShort(i13);
            int elementValues4 = i13 + 2;
            while (true) {
                int i20 = unsignedShort7 - 1;
                if (unsignedShort7 <= 0) {
                    break;
                }
                int typeAnnotationTarget2 = readTypeAnnotationTarget(context, elementValues4);
                elementValues4 = readElementValues(fieldVisitorVisitField.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, readUTF8(typeAnnotationTarget2, cArr), false), typeAnnotationTarget2 + 2, true, cArr);
                unsignedShort7 = i20;
            }
        }
        while (true) {
            Attribute attribute4 = attribute3;
            if (attribute4 == null) {
                fieldVisitorVisitField.visitEnd();
                return i4;
            }
            attribute3 = attribute4.nextAttribute;
            attribute4.nextAttribute = null;
            fieldVisitorVisitField.visitAttribute(attribute4);
        }
    }

    private int readMethod(ClassVisitor classVisitor, Context context, int i) {
        int i2;
        int i3;
        char[] cArr = context.charBuffer;
        context.currentMethodAccessFlags = readUnsignedShort(i);
        context.currentMethodName = readUTF8(i + 2, cArr);
        int i4 = i + 4;
        context.currentMethodDescriptor = readUTF8(i4, cArr);
        int unsignedShort = readUnsignedShort(i + 6);
        int i5 = i + 8;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int unsignedShort2 = 0;
        Attribute attribute = null;
        boolean z = false;
        int i11 = 0;
        String[] strArr = null;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int i16 = unsignedShort - 1;
            if (unsignedShort <= 0) {
                break;
            }
            String utf8 = readUTF8(i5, cArr);
            int i17 = readInt(i5 + 2);
            int i18 = unsignedShort2;
            int i19 = i5 + 6;
            int i20 = i6;
            if (!AttCode.ATTRIBUTE_NAME.equals(utf8)) {
                if (AttExceptions.ATTRIBUTE_NAME.equals(utf8)) {
                    int unsignedShort3 = readUnsignedShort(i19);
                    String[] strArr2 = new String[unsignedShort3];
                    int i21 = i5 + 8;
                    int i22 = i7;
                    for (int i23 = 0; i23 < unsignedShort3; i23++) {
                        strArr2[i23] = readClass(i21, cArr);
                        i21 += 2;
                    }
                    strArr = strArr2;
                    i11 = i19;
                    i6 = i20;
                    i7 = i22;
                    unsignedShort2 = i18;
                    i3 = i11;
                } else {
                    i2 = i7;
                    if (AttSignature.ATTRIBUTE_NAME.equals(utf8)) {
                        i3 = i19;
                        i6 = i20;
                        i7 = i2;
                        unsignedShort2 = readUnsignedShort(i19);
                    } else if (AttDeprecated.ATTRIBUTE_NAME.equals(utf8)) {
                        context.currentMethodAccessFlags |= 131072;
                        i6 = i20;
                        i7 = i2;
                    } else if (AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME.equals(utf8)) {
                        i8 = i19;
                        i6 = i20;
                        i7 = i2;
                        unsignedShort2 = i18;
                        i3 = i8;
                    } else if ("RuntimeVisibleTypeAnnotations".equals(utf8)) {
                        i6 = i19;
                        i7 = i2;
                        unsignedShort2 = i18;
                        i3 = i6;
                    } else if (AttAnnotationDefault.ATTRIBUTE_NAME.equals(utf8)) {
                        i9 = i19;
                        i6 = i20;
                        i7 = i2;
                        unsignedShort2 = i18;
                        i3 = i9;
                    } else if (AttSynthetic.ATTRIBUTE_NAME.equals(utf8)) {
                        context.currentMethodAccessFlags |= 4096;
                        i6 = i20;
                        i7 = i2;
                        z = true;
                    } else if (AttRuntimeInvisibleAnnotations.ATTRIBUTE_NAME.equals(utf8)) {
                        i7 = i19;
                        i6 = i20;
                        unsignedShort2 = i18;
                        i3 = i7;
                    } else if ("RuntimeInvisibleTypeAnnotations".equals(utf8)) {
                        i12 = i19;
                        i6 = i20;
                        i7 = i2;
                        unsignedShort2 = i18;
                        i3 = i12;
                    } else if (AttRuntimeVisibleParameterAnnotations.ATTRIBUTE_NAME.equals(utf8)) {
                        i13 = i19;
                        i6 = i20;
                        i7 = i2;
                        unsignedShort2 = i18;
                        i3 = i13;
                    } else if (AttRuntimeInvisibleParameterAnnotations.ATTRIBUTE_NAME.equals(utf8)) {
                        i14 = i19;
                        i6 = i20;
                        i7 = i2;
                        unsignedShort2 = i18;
                        i3 = i14;
                    } else if ("MethodParameters".equals(utf8)) {
                        i10 = i19;
                        i6 = i20;
                        i7 = i2;
                        unsignedShort2 = i18;
                        i3 = i10;
                    } else {
                        i3 = i19;
                        Attribute attribute2 = readAttribute(context.attributePrototypes, utf8, i19, i17, cArr, -1, null);
                        attribute2.nextAttribute = attribute;
                        attribute = attribute2;
                        unsignedShort2 = i18;
                        i6 = i20;
                        i7 = i2;
                        i8 = i8;
                        i9 = i9;
                        i10 = i10;
                    }
                }
                i5 = i3 + i17;
                unsignedShort = i16;
            } else if ((context.parsingOptions & 1) == 0) {
                i15 = i19;
                i6 = i20;
                unsignedShort2 = i18;
                i3 = i15;
                i5 = i3 + i17;
                unsignedShort = i16;
            } else {
                i2 = i7;
                i6 = i20;
                i7 = i2;
            }
            i3 = i19;
            unsignedShort2 = i18;
            i5 = i3 + i17;
            unsignedShort = i16;
        }
        int i24 = i6;
        int i25 = i7;
        int i26 = i8;
        int i27 = i9;
        int i28 = i10;
        int i29 = unsignedShort2;
        MethodVisitor methodVisitorVisitMethod = classVisitor.visitMethod(context.currentMethodAccessFlags, context.currentMethodName, context.currentMethodDescriptor, i29 == 0 ? null : readUtf(i29, cArr), strArr);
        if (methodVisitorVisitMethod == null) {
            return i5;
        }
        if (methodVisitorVisitMethod instanceof MethodWriter) {
            MethodWriter methodWriter = (MethodWriter) methodVisitorVisitMethod;
            if (methodWriter.canCopyMethodAttributes(this, z, (context.currentMethodAccessFlags & 131072) != 0, readUnsignedShort(i4), i29, i11)) {
                methodWriter.setMethodAttributesSource(i, i5 - i);
                return i5;
            }
        }
        if (i28 != 0 && (context.parsingOptions & 2) == 0) {
            int i30 = readByte(i28);
            int i31 = i28 + 1;
            while (true) {
                int i32 = i30 - 1;
                if (i30 <= 0) {
                    break;
                }
                methodVisitorVisitMethod.visitParameter(readUTF8(i31, cArr), readUnsignedShort(i31 + 2));
                i31 += 4;
                i30 = i32;
            }
        }
        if (i27 != 0) {
            AnnotationVisitor annotationVisitorVisitAnnotationDefault = methodVisitorVisitMethod.visitAnnotationDefault();
            readElementValue(annotationVisitorVisitAnnotationDefault, i27, null, cArr);
            if (annotationVisitorVisitAnnotationDefault != null) {
                annotationVisitorVisitAnnotationDefault.visitEnd();
            }
        }
        if (i26 != 0) {
            int unsignedShort4 = readUnsignedShort(i26);
            int elementValues = i26 + 2;
            while (true) {
                int i33 = unsignedShort4 - 1;
                if (unsignedShort4 <= 0) {
                    break;
                }
                elementValues = readElementValues(methodVisitorVisitMethod.visitAnnotation(readUTF8(elementValues, cArr), true), elementValues + 2, true, cArr);
                unsignedShort4 = i33;
            }
        }
        if (i25 != 0) {
            int unsignedShort5 = readUnsignedShort(i25);
            int elementValues2 = i25 + 2;
            while (true) {
                int i34 = unsignedShort5 - 1;
                if (unsignedShort5 <= 0) {
                    break;
                }
                elementValues2 = readElementValues(methodVisitorVisitMethod.visitAnnotation(readUTF8(elementValues2, cArr), false), elementValues2 + 2, true, cArr);
                unsignedShort5 = i34;
            }
        }
        if (i24 != 0) {
            int unsignedShort6 = readUnsignedShort(i24);
            int elementValues3 = i24 + 2;
            while (true) {
                int i35 = unsignedShort6 - 1;
                if (unsignedShort6 <= 0) {
                    break;
                }
                int typeAnnotationTarget = readTypeAnnotationTarget(context, elementValues3);
                elementValues3 = readElementValues(methodVisitorVisitMethod.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, readUTF8(typeAnnotationTarget, cArr), true), typeAnnotationTarget + 2, true, cArr);
                unsignedShort6 = i35;
            }
        }
        int i36 = i12;
        if (i36 != 0) {
            int unsignedShort7 = readUnsignedShort(i36);
            int elementValues4 = i36 + 2;
            while (true) {
                int i37 = unsignedShort7 - 1;
                if (unsignedShort7 <= 0) {
                    break;
                }
                int typeAnnotationTarget2 = readTypeAnnotationTarget(context, elementValues4);
                elementValues4 = readElementValues(methodVisitorVisitMethod.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, readUTF8(typeAnnotationTarget2, cArr), false), typeAnnotationTarget2 + 2, true, cArr);
                unsignedShort7 = i37;
            }
        }
        int i38 = i13;
        if (i38 != 0) {
            readParameterAnnotations(methodVisitorVisitMethod, context, i38, true);
        }
        int i39 = i14;
        if (i39 != 0) {
            readParameterAnnotations(methodVisitorVisitMethod, context, i39, false);
        }
        while (attribute != null) {
            Attribute attribute3 = attribute.nextAttribute;
            attribute.nextAttribute = null;
            methodVisitorVisitMethod.visitAttribute(attribute);
            attribute = attribute3;
        }
        int i40 = i15;
        if (i40 != 0) {
            methodVisitorVisitMethod.visitCode();
            readCode(methodVisitorVisitMethod, context, i40);
        }
        methodVisitorVisitMethod.visitEnd();
        return i5;
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
        int i2 = this.classFileBuffer[i] & 255;
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
        Context context2 = context;
        char[] cArr = context2.charBuffer;
        String utf8 = readUTF8(i, cArr);
        String utf82 = readUTF8(i + 2, cArr);
        int unsignedShort = readUnsignedShort(i + 4);
        int i3 = i + 6;
        int i4 = 0;
        Attribute attribute = null;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        String utf83 = null;
        while (true) {
            int i8 = unsignedShort - 1;
            if (unsignedShort <= 0) {
                break;
            }
            String utf84 = readUTF8(i3, cArr);
            int i9 = readInt(i3 + 2);
            int i10 = i3 + 6;
            if (AttSignature.ATTRIBUTE_NAME.equals(utf84)) {
                utf83 = readUTF8(i10, cArr);
                i2 = i10;
            } else if (AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME.equals(utf84)) {
                i7 = i10;
                i2 = i7;
            } else if ("RuntimeVisibleTypeAnnotations".equals(utf84)) {
                i5 = i10;
                i2 = i5;
            } else if (AttRuntimeInvisibleAnnotations.ATTRIBUTE_NAME.equals(utf84)) {
                i6 = i10;
                i2 = i6;
            } else if ("RuntimeInvisibleTypeAnnotations".equals(utf84)) {
                i4 = i10;
                i2 = i4;
            } else {
                i2 = i10;
                Attribute attribute2 = attribute;
                attribute = readAttribute(context2.attributePrototypes, utf84, i2, i9, cArr, -1, null);
                attribute.nextAttribute = attribute2;
                i7 = i7;
                i6 = i6;
                i5 = i5;
                i4 = i4;
            }
            i3 = i2 + i9;
            context2 = context;
            unsignedShort = i8;
        }
        int i11 = i4;
        Attribute attribute3 = attribute;
        int i12 = i5;
        int i13 = i6;
        int i14 = i7;
        RecordComponentVisitor recordComponentVisitorVisitRecordComponent = classVisitor.visitRecordComponent(utf8, utf82, utf83);
        if (recordComponentVisitorVisitRecordComponent == null) {
            return i3;
        }
        if (i14 != 0) {
            int unsignedShort2 = readUnsignedShort(i14);
            int elementValues = i14 + 2;
            while (true) {
                int i15 = unsignedShort2 - 1;
                if (unsignedShort2 <= 0) {
                    break;
                }
                elementValues = readElementValues(recordComponentVisitorVisitRecordComponent.visitAnnotation(readUTF8(elementValues, cArr), true), elementValues + 2, true, cArr);
                unsignedShort2 = i15;
            }
        }
        if (i13 != 0) {
            int unsignedShort3 = readUnsignedShort(i13);
            int elementValues2 = i13 + 2;
            while (true) {
                int i16 = unsignedShort3 - 1;
                if (unsignedShort3 <= 0) {
                    break;
                }
                elementValues2 = readElementValues(recordComponentVisitorVisitRecordComponent.visitAnnotation(readUTF8(elementValues2, cArr), false), elementValues2 + 2, true, cArr);
                unsignedShort3 = i16;
            }
        }
        if (i12 != 0) {
            int unsignedShort4 = readUnsignedShort(i12);
            int elementValues3 = i12 + 2;
            while (true) {
                int i17 = unsignedShort4 - 1;
                if (unsignedShort4 <= 0) {
                    break;
                }
                int typeAnnotationTarget = readTypeAnnotationTarget(context, elementValues3);
                elementValues3 = readElementValues(recordComponentVisitorVisitRecordComponent.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, readUTF8(typeAnnotationTarget, cArr), true), typeAnnotationTarget + 2, true, cArr);
                unsignedShort4 = i17;
            }
        }
        if (i11 != 0) {
            int unsignedShort5 = readUnsignedShort(i11);
            int elementValues4 = i11 + 2;
            while (true) {
                int i18 = unsignedShort5 - 1;
                if (unsignedShort5 <= 0) {
                    break;
                }
                int typeAnnotationTarget2 = readTypeAnnotationTarget(context, elementValues4);
                elementValues4 = readElementValues(recordComponentVisitorVisitRecordComponent.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, readUTF8(typeAnnotationTarget2, cArr), false), typeAnnotationTarget2 + 2, true, cArr);
                unsignedShort5 = i18;
            }
        }
        Attribute attribute4 = attribute3;
        while (attribute4 != null) {
            Attribute attribute5 = attribute4.nextAttribute;
            attribute4.nextAttribute = null;
            recordComponentVisitorVisitRecordComponent.visitAttribute(attribute4);
            attribute4 = attribute5;
        }
        recordComponentVisitorVisitRecordComponent.visitEnd();
        return i3;
    }

    private int readStackMapFrame(int i, boolean z, boolean z2, Context context) {
        int verificationTypeInfo;
        int i2;
        char[] cArr = context.charBuffer;
        Label[] labelArr = context.currentMethodLabels;
        if (z) {
            verificationTypeInfo = i + 1;
            i2 = this.classFileBuffer[i] & 255;
        } else {
            context.currentFrameOffset = -1;
            verificationTypeInfo = i;
            i2 = 255;
        }
        context.currentFrameLocalCountDelta = 0;
        if (i2 < 64) {
            context.currentFrameType = 3;
            context.currentFrameStackCount = 0;
        } else if (i2 < 128) {
            i2 -= 64;
            verificationTypeInfo = readVerificationTypeInfo(verificationTypeInfo, context.currentFrameStackTypes, 0, cArr, labelArr);
            context.currentFrameType = 4;
            context.currentFrameStackCount = 1;
        } else {
            if (i2 < 247) {
                throw new IllegalArgumentException();
            }
            int unsignedShort = readUnsignedShort(verificationTypeInfo);
            int i3 = verificationTypeInfo + 2;
            if (i2 == 247) {
                verificationTypeInfo = readVerificationTypeInfo(i3, context.currentFrameStackTypes, 0, cArr, labelArr);
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
                    verificationTypeInfo = i3;
                    int i7 = i5;
                    while (i7 > 0) {
                        verificationTypeInfo = readVerificationTypeInfo(verificationTypeInfo, context.currentFrameLocalTypes, i6, cArr, labelArr);
                        i7--;
                        i6++;
                    }
                    context.currentFrameType = 1;
                    context.currentFrameLocalCountDelta = i5;
                    context.currentFrameLocalCount += i5;
                    context.currentFrameStackCount = 0;
                } else {
                    int unsignedShort2 = readUnsignedShort(i3);
                    int verificationTypeInfo2 = verificationTypeInfo + 4;
                    context.currentFrameType = 0;
                    context.currentFrameLocalCountDelta = unsignedShort2;
                    context.currentFrameLocalCount = unsignedShort2;
                    for (int i8 = 0; i8 < unsignedShort2; i8++) {
                        verificationTypeInfo2 = readVerificationTypeInfo(verificationTypeInfo2, context.currentFrameLocalTypes, i8, cArr, labelArr);
                    }
                    int unsignedShort3 = readUnsignedShort(verificationTypeInfo2);
                    verificationTypeInfo = verificationTypeInfo2 + 2;
                    context.currentFrameStackCount = unsignedShort3;
                    for (int i9 = 0; i9 < unsignedShort3; i9++) {
                        verificationTypeInfo = readVerificationTypeInfo(verificationTypeInfo, context.currentFrameStackTypes, i9, cArr, labelArr);
                    }
                }
                verificationTypeInfo = i3;
            }
            i2 = unsignedShort;
        }
        int i10 = context.currentFrameOffset + i2 + 1;
        context.currentFrameOffset = i10;
        createLabel(i10, labelArr);
        return verificationTypeInfo;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[IF]}, finally: {[IF, INVOKE] complete} */
    private static byte[] readStream(InputStream inputStream, boolean z) throws IOException {
        if (inputStream == null) {
            throw new IOException("Class not found");
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
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int readTypeAnnotationTarget(Context context, int i) {
        int i2;
        int i3;
        int i4 = readInt(i);
        int i5 = i4 >>> 24;
        if (i5 != 0 && i5 != 1) {
            switch (i5) {
                case 16:
                case 17:
                case 18:
                case 23:
                    i2 = i4 & C5445.f13388;
                    i3 = i + 3;
                    break;
                case 19:
                case 20:
                case 21:
                    i2 = i4 & C8273.f24692;
                    i3 = i + 1;
                    break;
                case 22:
                    break;
                default:
                    switch (i5) {
                        case 64:
                        case 65:
                            i2 = i4 & C8273.f24692;
                            int unsignedShort = readUnsignedShort(i + 1);
                            i3 = i + 3;
                            context.currentLocalVariableAnnotationRangeStarts = new Label[unsignedShort];
                            context.currentLocalVariableAnnotationRangeEnds = new Label[unsignedShort];
                            context.currentLocalVariableAnnotationRangeIndices = new int[unsignedShort];
                            for (int i6 = 0; i6 < unsignedShort; i6++) {
                                int unsignedShort2 = readUnsignedShort(i3);
                                int unsignedShort3 = readUnsignedShort(i3 + 2);
                                int unsignedShort4 = readUnsignedShort(i3 + 4);
                                i3 += 6;
                                context.currentLocalVariableAnnotationRangeStarts[i6] = createLabel(unsignedShort2, context.currentMethodLabels);
                                context.currentLocalVariableAnnotationRangeEnds[i6] = createLabel(unsignedShort2 + unsignedShort3, context.currentMethodLabels);
                                context.currentLocalVariableAnnotationRangeIndices[i6] = unsignedShort4;
                            }
                            break;
                        case 66:
                            break;
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                            i2 = i4 & C8273.f24692;
                            i3 = i + 3;
                            break;
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                            i2 = i4 & (-16776961);
                            i3 = i + 4;
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                    break;
            }
        } else {
            i2 = i4 & (-65536);
            i3 = i + 2;
        }
        context.currentTypeAnnotationTarget = i2;
        int i7 = readByte(i3);
        context.currentTypeAnnotationTargetPath = i7 == 0 ? null : new TypePath(this.classFileBuffer, i3);
        return i3 + 1 + (i7 * 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int[] readTypeAnnotations(MethodVisitor methodVisitor, Context context, int i, boolean z) {
        int i2;
        char[] cArr = context.charBuffer;
        int unsignedShort = readUnsignedShort(i);
        int[] iArr = new int[unsignedShort];
        int elementValues = i + 2;
        for (int i3 = 0; i3 < unsignedShort; i3++) {
            iArr[i3] = elementValues;
            int i4 = readInt(elementValues);
            int i5 = i4 >>> 24;
            if (i5 != 23) {
                switch (i5) {
                    default:
                        switch (i5) {
                            case 64:
                            case 65:
                                int unsignedShort2 = readUnsignedShort(elementValues + 1);
                                i2 = elementValues + 3;
                                while (true) {
                                    int i6 = unsignedShort2 - 1;
                                    if (unsignedShort2 > 0) {
                                        int unsignedShort3 = readUnsignedShort(i2);
                                        int unsignedShort4 = readUnsignedShort(i2 + 2);
                                        i2 += 6;
                                        createLabel(unsignedShort3, context.currentMethodLabels);
                                        createLabel(unsignedShort3 + unsignedShort4, context.currentMethodLabels);
                                        unsignedShort2 = i6;
                                    }
                                    break;
                                }
                                break;
                            case 66:
                            case 67:
                            case 68:
                            case 69:
                            case 70:
                                break;
                            case 71:
                            case 72:
                            case 73:
                            case 74:
                            case 75:
                                i2 = elementValues + 4;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    case 16:
                    case 17:
                    case 18:
                        i2 = elementValues + 3;
                        break;
                }
            }
            int i7 = readByte(i2);
            if (i5 == 66) {
                TypePath typePath = i7 != 0 ? new TypePath(this.classFileBuffer, i2) : null;
                int i8 = i2 + (i7 * 2) + 1;
                elementValues = readElementValues(methodVisitor.visitTryCatchAnnotation(i4 & C5445.f13388, typePath, readUTF8(i8, cArr), z), i8 + 2, true, cArr);
            } else {
                elementValues = readElementValues(null, i2 + (i7 * 2) + 3, true, cArr);
            }
        }
        return iArr;
    }

    private int readVerificationTypeInfo(int i, Object[] objArr, int i2, char[] cArr, Label[] labelArr) {
        int i3 = i + 1;
        switch (this.classFileBuffer[i] & 255) {
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
                throw new IllegalArgumentException();
        }
        return i + 3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void accept(ClassVisitor classVisitor, int i) {
        accept(classVisitor, new Attribute[0], i);
    }

    public int getAccess() {
        return readUnsignedShort(this.header);
    }

    public String getClassName() {
        return readClass(this.header + 2, new char[this.maxStringLength]);
    }

    public final int getFirstAttributeOffset() {
        int i = this.header;
        int unsignedShort = i + 8 + (readUnsignedShort(i + 6) * 2);
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
        return this.classFileBuffer[i] & 255;
    }

    public void readBytecodeInstructionOffset(int i) {
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
                        throw new IllegalArgumentException();
                }
        }
    }

    public int readInt(int i) {
        byte[] bArr = this.classFileBuffer;
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public Label readLabel(int i, Label[] labelArr) {
        if (labelArr[i] == null) {
            labelArr[i] = new Label();
        }
        return labelArr[i];
    }

    public long readLong(int i) {
        return (((long) readInt(i)) << 32) | (((long) readInt(i + 4)) & C8578.f25466);
    }

    public String readModule(int i, char[] cArr) {
        return readStringish(i, cArr);
    }

    public String readPackage(int i, char[] cArr) {
        return readStringish(i, cArr);
    }

    public short readShort(int i) {
        byte[] bArr = this.classFileBuffer;
        return (short) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
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
        return (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public ClassReader(byte[] bArr, int i, int i2) {
        this(bArr, i, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void accept(ClassVisitor classVisitor, Attribute[] attributeArr, int i) {
        int i2;
        int i3;
        int i4;
        String[] strArr;
        Context context = new Context();
        context.attributePrototypes = attributeArr;
        context.parsingOptions = i;
        char[] cArr = new char[this.maxStringLength];
        context.charBuffer = cArr;
        int i5 = this.header;
        int unsignedShort = readUnsignedShort(i5);
        String str = readClass(i5 + 2, cArr);
        String str2 = readClass(i5 + 4, cArr);
        int unsignedShort2 = readUnsignedShort(i5 + 6);
        String[] strArr2 = new String[unsignedShort2];
        int i6 = i5 + 8;
        for (int i7 = 0; i7 < unsignedShort2; i7++) {
            strArr2[i7] = readClass(i6, cArr);
            i6 += 2;
        }
        int firstAttributeOffset = getFirstAttributeOffset();
        int i8 = unsignedShort;
        int unsignedShort3 = readUnsignedShort(firstAttributeOffset - 2);
        String utf = null;
        String utf8 = null;
        int i9 = 0;
        String utf82 = null;
        int i10 = 0;
        String str3 = null;
        String str4 = null;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        Attribute attribute = null;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (unsignedShort3 > 0) {
            String utf83 = readUTF8(firstAttributeOffset, cArr);
            int i20 = readInt(firstAttributeOffset + 2);
            int i21 = firstAttributeOffset + 6;
            String str5 = utf;
            if (AttSourceFile.ATTRIBUTE_NAME.equals(utf83)) {
                i2 = i21;
                utf8 = readUTF8(i21, cArr);
            } else if (AttInnerClasses.ATTRIBUTE_NAME.equals(utf83)) {
                i18 = i21;
                i2 = i18;
            } else if (AttEnclosingMethod.ATTRIBUTE_NAME.equals(utf83)) {
                i11 = i21;
                i2 = i11;
            } else if ("NestHost".equals(utf83)) {
                i2 = i21;
                str4 = readClass(i21, cArr);
            } else if ("NestMembers".equals(utf83)) {
                i16 = i21;
                i2 = i16;
            } else if ("PermittedSubclasses".equals(utf83)) {
                i17 = i21;
                i2 = i17;
            } else {
                if (AttSignature.ATTRIBUTE_NAME.equals(utf83)) {
                    utf82 = readUTF8(i21, cArr);
                } else if (AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME.equals(utf83)) {
                    i12 = i21;
                    i2 = i12;
                } else if ("RuntimeVisibleTypeAnnotations".equals(utf83)) {
                    i14 = i21;
                    i2 = i14;
                } else if (AttDeprecated.ATTRIBUTE_NAME.equals(utf83)) {
                    i8 |= 131072;
                } else if (AttSynthetic.ATTRIBUTE_NAME.equals(utf83)) {
                    i8 |= 4096;
                } else if (AttSourceDebugExtension.ATTRIBUTE_NAME.equals(utf83)) {
                    if (i20 > this.classFileBuffer.length - i21) {
                        throw new IllegalArgumentException();
                    }
                    utf = readUtf(i21, i20, new char[i20]);
                    i2 = i21;
                    i3 = i6;
                    i4 = i20;
                    strArr = strArr2;
                    firstAttributeOffset = i2 + i4;
                    unsignedShort3--;
                    strArr2 = strArr;
                    i6 = i3;
                } else if (AttRuntimeInvisibleAnnotations.ATTRIBUTE_NAME.equals(utf83)) {
                    i13 = i21;
                    i2 = i13;
                } else if ("RuntimeInvisibleTypeAnnotations".equals(utf83)) {
                    i15 = i21;
                    i2 = i15;
                } else if ("Record".equals(utf83)) {
                    i8 |= 65536;
                    i19 = i21;
                    i2 = i19;
                } else if ("Module".equals(utf83)) {
                    i9 = i21;
                    i2 = i9;
                } else if ("ModuleMainClass".equals(utf83)) {
                    str3 = readClass(i21, cArr);
                } else if ("ModulePackages".equals(utf83)) {
                    i10 = i21;
                    i2 = i10;
                } else {
                    if (AttBootstrapMethods.ATTRIBUTE_NAME.equals(utf83)) {
                        i2 = i21;
                        i3 = i6;
                        i4 = i20;
                        strArr = strArr2;
                        utf = str5;
                    } else {
                        i2 = i21;
                        i3 = i6;
                        i4 = i20;
                        strArr = strArr2;
                        Attribute attribute2 = readAttribute(attributeArr, utf83, i2, i20, cArr, -1, null);
                        attribute2.nextAttribute = attribute;
                        attribute = attribute2;
                        i8 = i8;
                        utf = str5;
                        utf8 = utf8;
                    }
                    firstAttributeOffset = i2 + i4;
                    unsignedShort3--;
                    strArr2 = strArr;
                    i6 = i3;
                }
                i2 = i21;
            }
            i3 = i6;
            i4 = i20;
            strArr = strArr2;
            utf = str5;
            firstAttributeOffset = i2 + i4;
            unsignedShort3--;
            strArr2 = strArr;
            i6 = i3;
        }
        String str6 = utf;
        String str7 = utf8;
        int i22 = i6;
        String[] strArr3 = strArr2;
        Attribute attribute3 = attribute;
        classVisitor.visit(readInt(this.cpInfoOffsets[1] - 7), i8, str, utf82, str2, strArr3);
        if ((i & 2) == 0 && (str7 != null || str6 != null)) {
            classVisitor.visitSource(str7, str6);
        }
        if (i9 != 0) {
            readModuleAttributes(classVisitor, context, i9, i10, str3);
        }
        String str8 = str4;
        if (str8 != null) {
            classVisitor.visitNestHost(str8);
        }
        int i23 = i11;
        if (i23 != 0) {
            String str9 = readClass(i23, cArr);
            int unsignedShort4 = readUnsignedShort(i23 + 2);
            classVisitor.visitOuterClass(str9, unsignedShort4 == 0 ? null : readUTF8(this.cpInfoOffsets[unsignedShort4], cArr), unsignedShort4 == 0 ? null : readUTF8(this.cpInfoOffsets[unsignedShort4] + 2, cArr));
        }
        int i24 = i12;
        if (i24 != 0) {
            int unsignedShort5 = readUnsignedShort(i24);
            int elementValues = i24 + 2;
            while (true) {
                int i25 = unsignedShort5 - 1;
                if (unsignedShort5 <= 0) {
                    break;
                }
                elementValues = readElementValues(classVisitor.visitAnnotation(readUTF8(elementValues, cArr), true), elementValues + 2, true, cArr);
                unsignedShort5 = i25;
            }
        }
        int i26 = i13;
        if (i26 != 0) {
            int unsignedShort6 = readUnsignedShort(i26);
            int elementValues2 = i26 + 2;
            while (true) {
                int i27 = unsignedShort6 - 1;
                if (unsignedShort6 <= 0) {
                    break;
                }
                elementValues2 = readElementValues(classVisitor.visitAnnotation(readUTF8(elementValues2, cArr), false), elementValues2 + 2, true, cArr);
                unsignedShort6 = i27;
            }
        }
        int i28 = i14;
        if (i28 != 0) {
            int unsignedShort7 = readUnsignedShort(i28);
            int elementValues3 = i28 + 2;
            while (true) {
                int i29 = unsignedShort7 - 1;
                if (unsignedShort7 <= 0) {
                    break;
                }
                int typeAnnotationTarget = readTypeAnnotationTarget(context, elementValues3);
                elementValues3 = readElementValues(classVisitor.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, readUTF8(typeAnnotationTarget, cArr), true), typeAnnotationTarget + 2, true, cArr);
                unsignedShort7 = i29;
            }
        }
        int i30 = i15;
        if (i30 != 0) {
            int unsignedShort8 = readUnsignedShort(i30);
            int elementValues4 = i30 + 2;
            while (true) {
                int i31 = unsignedShort8 - 1;
                if (unsignedShort8 <= 0) {
                    break;
                }
                int typeAnnotationTarget2 = readTypeAnnotationTarget(context, elementValues4);
                elementValues4 = readElementValues(classVisitor.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, readUTF8(typeAnnotationTarget2, cArr), false), typeAnnotationTarget2 + 2, true, cArr);
                unsignedShort8 = i31;
            }
        }
        while (attribute3 != null) {
            Attribute attribute4 = attribute3.nextAttribute;
            attribute3.nextAttribute = null;
            classVisitor.visitAttribute(attribute3);
            attribute3 = attribute4;
        }
        int i32 = i16;
        if (i32 != 0) {
            int unsignedShort9 = readUnsignedShort(i32);
            int i33 = i32 + 2;
            while (true) {
                int i34 = unsignedShort9 - 1;
                if (unsignedShort9 <= 0) {
                    break;
                }
                classVisitor.visitNestMember(readClass(i33, cArr));
                i33 += 2;
                unsignedShort9 = i34;
            }
        }
        int i35 = i17;
        if (i35 != 0) {
            int unsignedShort10 = readUnsignedShort(i35);
            int i36 = i35 + 2;
            while (true) {
                int i37 = unsignedShort10 - 1;
                if (unsignedShort10 <= 0) {
                    break;
                }
                classVisitor.visitPermittedSubclass(readClass(i36, cArr));
                i36 += 2;
                unsignedShort10 = i37;
            }
        }
        int i38 = i18;
        if (i38 != 0) {
            int unsignedShort11 = readUnsignedShort(i38);
            int i39 = i38 + 2;
            while (true) {
                int i40 = unsignedShort11 - 1;
                if (unsignedShort11 <= 0) {
                    break;
                }
                classVisitor.visitInnerClass(readClass(i39, cArr), readClass(i39 + 2, cArr), readUTF8(i39 + 4, cArr), readUnsignedShort(i39 + 6));
                i39 += 8;
                unsignedShort11 = i40;
            }
        }
        int i41 = i19;
        if (i41 != 0) {
            int unsignedShort12 = readUnsignedShort(i41);
            int recordComponent = i41 + 2;
            while (true) {
                int i42 = unsignedShort12 - 1;
                if (unsignedShort12 <= 0) {
                    break;
                }
                recordComponent = readRecordComponent(classVisitor, context, recordComponent);
                unsignedShort12 = i42;
            }
        }
        int unsignedShort13 = readUnsignedShort(i22);
        int field = i22 + 2;
        while (true) {
            int i43 = unsignedShort13 - 1;
            if (unsignedShort13 <= 0) {
                break;
            }
            field = readField(classVisitor, context, field);
            unsignedShort13 = i43;
        }
        int unsignedShort14 = readUnsignedShort(field);
        int method = field + 2;
        while (true) {
            int i44 = unsignedShort14 - 1;
            if (unsignedShort14 <= 0) {
                classVisitor.visitEnd();
                return;
            } else {
                method = readMethod(classVisitor, context, method);
                unsignedShort14 = i44;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063 A[PHI: r8
  0x0063: PHI (r8v3 int) = (r8v0 int), (r8v1 int), (r8v4 int) binds: [B:12:0x0052, B:22:0x006f, B:18:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClassReader(byte[] bArr, int i, boolean z) {
        this.classFileBuffer = bArr;
        this.f4225b = bArr;
        if (z) {
            int i2 = i + 6;
            if (readShort(i2) > 66) {
                throw new IllegalArgumentException("Unsupported class file major version " + ((int) readShort(i2)));
            }
        }
        int unsignedShort = readUnsignedShort(i + 8);
        this.cpInfoOffsets = new int[unsignedShort];
        this.constantUtf8Values = new String[unsignedShort];
        int i3 = i + 10;
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        int i5 = 1;
        while (i5 < unsignedShort) {
            int i6 = i5 + 1;
            int i7 = i3 + 1;
            this.cpInfoOffsets[i5] = i7;
            int unsignedShort2 = 3;
            switch (bArr[i3]) {
                case 1:
                    unsignedShort2 = 3 + readUnsignedShort(i7);
                    if (unsignedShort2 > i4) {
                        i5 = i6;
                        i4 = unsignedShort2;
                    } else {
                        i5 = i6;
                    }
                    i3 += unsignedShort2;
                    break;
                case 2:
                case 13:
                case 14:
                default:
                    throw new IllegalArgumentException();
                case 3:
                case 4:
                case 9:
                case 10:
                case 11:
                case 12:
                    i5 = i6;
                    unsignedShort2 = 5;
                    i3 += unsignedShort2;
                    break;
                case 5:
                case 6:
                    i5 += 2;
                    unsignedShort2 = 9;
                    i3 += unsignedShort2;
                    break;
                case 7:
                case 8:
                case 16:
                case 19:
                case 20:
                    break;
                case 15:
                    unsignedShort2 = 4;
                    i5 = i6;
                    i3 += unsignedShort2;
                    break;
                case 17:
                    z2 = true;
                    z3 = true;
                    i5 = i6;
                    unsignedShort2 = 5;
                    i3 += unsignedShort2;
                    break;
                case 18:
                    z3 = true;
                    i5 = i6;
                    unsignedShort2 = 5;
                    i3 += unsignedShort2;
                    break;
            }
        }
        this.maxStringLength = i4;
        this.header = i3;
        this.constantDynamicValues = z2 ? new ConstantDynamic[unsignedShort] : null;
        this.bootstrapMethodOffsets = z3 ? readBootstrapMethodsAttribute(i4) : null;
    }

    private String readUtf(int i, int i2, char[] cArr) {
        int i3;
        int i4 = i2 + i;
        byte[] bArr = this.classFileBuffer;
        int i5 = 0;
        while (i < i4) {
            int i6 = i + 1;
            byte b = bArr[i];
            if ((b & C3626.f423) == 0) {
                cArr[i5] = (char) (b & C3626.f6362);
                i5++;
                i = i6;
            } else {
                if ((b & 224) == 192) {
                    i3 = i5 + 1;
                    i += 2;
                    cArr[i5] = (char) (((b & 31) << 6) + (bArr[i6] & C8149.f3255));
                } else {
                    i3 = i5 + 1;
                    int i7 = i + 2;
                    i += 3;
                    cArr[i5] = (char) (((b & 15) << 12) + ((bArr[i6] & C8149.f3255) << 6) + (bArr[i7] & C8149.f3255));
                }
                i5 = i3;
            }
        }
        return new String(cArr, 0, i5);
    }

    public ClassReader(InputStream inputStream) throws IOException {
        this(readStream(inputStream, false));
    }

    public ClassReader(String str) throws IOException {
        this(readStream(ClassLoader.getSystemResourceAsStream(str.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/') + ".class"), true));
    }
}
