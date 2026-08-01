package com.google.protobuf;

import androidx.activity.AbstractC0053;
import bsh.C2632;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世楪哲兰子苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3412 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static String m7527(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length);
        for (byte b : bArr) {
            if (b == 34) {
                sb.append("\\\"");
            } else if (b == 39) {
                sb.append("\\'");
            } else if (b != 92) {
                switch (b) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b < 32 || b > 126) {
                            sb.append('\\');
                            sb.append((char) (((b >>> 6) & 3) + 48));
                            sb.append((char) (((b >>> 3) & 7) + 48));
                            sb.append((char) ((b & 7) + 48));
                        } else {
                            sb.append((char) b);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static int m7528(String str, byte[] bArr, int i, int i2) {
        byte[] bytes = str.getBytes(AbstractC3401.f11054);
        if (bytes.length - i > i2) {
            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
        }
        System.arraycopy(bytes, 0, bArr, i, bytes.length);
        return i + bytes.length;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static String m7529(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(str);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static int m7530(C3418 c3418, Object obj, Object obj2) {
        return C3679.m7913(c3418.f11077, 2, obj2) + C3679.m7913(c3418.f11079, 1, obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static void m7531(AbstractC3461 abstractC3461, C3418 c3418, Object obj, Object obj2) {
        C3679.m7911(abstractC3461, c3418.f11079, 1, obj);
        C3679.m7911(abstractC3461, c3418.f11077, 2, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ff  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m7532(com.google.protobuf.AbstractC3473 r9, com.google.protobuf.C3711 r10, com.google.protobuf.C3696 r11, com.google.protobuf.C3662 r12, com.google.protobuf.InterfaceC3434 r13, int r14) {
        /*
            Method dump skipped, instruction units count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractC3412.m7532(com.google.protobuf.飘花落叶言子世苏兰哲楪, com.google.protobuf.飘花落叶言苏子哲兰世楪, com.google.protobuf.飘花落叶言楪苏子哲兰世, com.google.protobuf.飘花落叶言楪子哲世苏兰, com.google.protobuf.飘花落叶言世苏兰子楪哲, int):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static String m7533(String str, C3656 c3656, int i) {
        StringBuilder sb = new StringBuilder(str);
        DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto = c3656.f11350;
        if (descriptorProtos$FieldDescriptorProto.hasExtendee()) {
            sb.append('(');
            sb.append(c3656.f11343);
            sb.append(')');
        } else {
            sb.append(descriptorProtos$FieldDescriptorProto.getName());
        }
        if (i != -1) {
            sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
            sb.append(i);
            sb.append(']');
        }
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static void m7534(AbstractC3532 abstractC3532, Map map, AbstractC3461 abstractC3461) {
        boolean messageSetWireFormat = abstractC3532.getDescriptorForType().m7889().getMessageSetWireFormat();
        for (Map.Entry entry : map.entrySet()) {
            C3656 c3656 = (C3656) entry.getKey();
            Object value = entry.getValue();
            if (messageSetWireFormat && c3656.f11350.hasExtendee() && c3656.m7870() == Descriptors$FieldDescriptor$Type.MESSAGE && !c3656.mo7819()) {
                abstractC3461.mo7672(c3656.f11350.getNumber(), (InterfaceC3452) value);
            } else {
                C3679.m7909(c3656, value, abstractC3461);
            }
        }
        C3703 unknownFields = abstractC3532.getUnknownFields();
        if (messageSetWireFormat) {
            unknownFields.writeAsMessageSetTo(abstractC3461);
        } else {
            unknownFields.writeTo(abstractC3461);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static AbstractMap.SimpleImmutableEntry m7535(C3418 c3418, AbstractC3473 abstractC3473, C3696 c3696) {
        Object objM7536 = c3418.f11078;
        WireFormat$FieldType wireFormat$FieldType = c3418.f11077;
        WireFormat$FieldType wireFormat$FieldType2 = c3418.f11079;
        Object objM75362 = c3418.f11076;
        while (true) {
            int iMo7718 = abstractC3473.mo7718();
            if (iMo7718 == 0) {
                break;
            }
            if (iMo7718 == (wireFormat$FieldType2.getWireType() | 8)) {
                objM7536 = m7536(abstractC3473, c3696, wireFormat$FieldType2, objM7536);
            } else if (iMo7718 == (wireFormat$FieldType.getWireType() | 16)) {
                objM75362 = m7536(abstractC3473, c3696, wireFormat$FieldType, objM75362);
            } else if (!abstractC3473.mo7710(iMo7718)) {
                break;
            }
        }
        return new AbstractMap.SimpleImmutableEntry(objM7536, objM75362);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static Object m7536(AbstractC3473 abstractC3473, C3696 c3696, WireFormat$FieldType wireFormat$FieldType, Object obj) {
        int i = AbstractC3417.f11073[wireFormat$FieldType.ordinal()];
        if (i == 1) {
            InterfaceC3449 builder = ((InterfaceC3440) obj).toBuilder();
            abstractC3473.mo7729(builder, c3696);
            return builder.buildPartial();
        }
        if (i == 2) {
            return Integer.valueOf(abstractC3473.mo7737());
        }
        if (i != 3) {
            C3679 c3679 = C3679.f11472;
            return abstractC3473.m7715(wireFormat$FieldType, WireFormat$Utf8Validation.STRICT);
        }
        C2632.m5294("Groups are not allowed in maps.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static void m7537(InterfaceC3441 interfaceC3441, String str, ArrayList arrayList) {
        for (C3656 c3656 : interfaceC3441.getDescriptorForType().m7888()) {
            if (c3656.m7867() && !interfaceC3441.hasField(c3656)) {
                StringBuilder sbM149 = AbstractC0053.m149(str);
                sbM149.append(c3656.f11350.getName());
                arrayList.add(sbM149.toString());
            }
        }
        for (Map.Entry entry : interfaceC3441.getAllFields().entrySet()) {
            C3656 c36562 = (C3656) entry.getKey();
            Object value = entry.getValue();
            if (c36562.m7876() == Descriptors$FieldDescriptor$JavaType.MESSAGE) {
                if (c36562.mo7819()) {
                    Iterator it = ((List) value).iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        m7537((InterfaceC3441) it.next(), m7533(str, c36562, i), arrayList);
                        i++;
                    }
                } else if (interfaceC3441.hasField(c36562)) {
                    m7537((InterfaceC3441) value, m7533(str, c36562, -1), arrayList);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static String m7538(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < ' ' || cCharAt > '~' || cCharAt == '\'' || cCharAt == '\"' || cCharAt == '\\') {
                return m7527(str.getBytes(AbstractC3401.f11054));
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static boolean m7539(ByteBuffer byteBuffer, int i, int i2) {
        AbstractC3412 abstractC3412 = AbstractC3723.f11538;
        int i3 = i2 - 7;
        int i4 = i;
        while (i4 < i3 && (byteBuffer.getLong(i4) & (-9187201950435737472L)) == 0) {
            i4 += 8;
        }
        int i5 = (i4 - i) + i;
        while (i5 < i2) {
            int i6 = i5 + 1;
            byte b = byteBuffer.get(i5);
            if (b >= 0) {
                i5 = i6;
            } else if (b < -32) {
                if (i6 >= i2 || b < -62 || byteBuffer.get(i6) > -65) {
                    return false;
                }
                i5 += 2;
            } else if (b < -16) {
                if (i6 >= i2 - 1) {
                    return false;
                }
                int i7 = i5 + 2;
                byte b2 = byteBuffer.get(i6);
                if (b2 > -65) {
                    return false;
                }
                if (b == -32 && b2 < -96) {
                    return false;
                }
                if ((b == -19 && b2 >= -96) || byteBuffer.get(i7) > -65) {
                    return false;
                }
                i5 += 3;
            } else {
                if (i6 >= i2 - 2) {
                    return false;
                }
                int i8 = i5 + 2;
                byte b3 = byteBuffer.get(i6);
                if (b3 > -65) {
                    return false;
                }
                if ((((b3 + 112) + (b << 28)) >> 30) != 0) {
                    return false;
                }
                int i9 = i5 + 3;
                if (byteBuffer.get(i8) > -65) {
                    return false;
                }
                i5 += 4;
                if (byteBuffer.get(i9) > -65) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static int m7540(AbstractC3532 abstractC3532, Map map) {
        boolean messageSetWireFormat = abstractC3532.getDescriptorForType().m7889().getMessageSetWireFormat();
        int iM7652 = 0;
        for (Map.Entry entry : map.entrySet()) {
            C3656 c3656 = (C3656) entry.getKey();
            Object value = entry.getValue();
            iM7652 = ((messageSetWireFormat && c3656.f11350.hasExtendee() && c3656.m7870() == Descriptors$FieldDescriptor$Type.MESSAGE && !c3656.mo7819()) ? AbstractC3461.m7652(3, (InterfaceC3452) value) + AbstractC3461.m7649(2, c3656.f11350.getNumber()) + (AbstractC3461.m7655(1) * 2) : C3679.m7919(c3656, value)) + iM7652;
        }
        C3703 unknownFields = abstractC3532.getUnknownFields();
        return (messageSetWireFormat ? unknownFields.getSerializedSizeAsMessageSet() : unknownFields.getSerializedSize()) + iM7652;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static boolean m7541(byte b) {
        return b > -65;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public abstract int mo7542(String str, byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public abstract String mo7543(int i, byte[] bArr, int i2);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public boolean mo7544(ByteBuffer byteBuffer, int i, int i2) {
        return m7539(byteBuffer, i, i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public abstract boolean mo7545(int i, byte[] bArr, int i2);
}
