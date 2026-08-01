package com.google.protobuf;

import androidx.activity.AbstractC0053;
import bsh.C2633;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世楪哲兰子苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3413 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static String m7514(byte[] bArr) {
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
    public static int m7515(String str, byte[] bArr, int i, int i2) {
        byte[] bytes = str.getBytes(AbstractC3402.f11059);
        if (bytes.length - i > i2) {
            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
        }
        System.arraycopy(bytes, 0, bArr, i, bytes.length);
        return i + bytes.length;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static String m7516(List list) {
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
    public static int m7517(C3419 c3419, Object obj, Object obj2) {
        return C3680.m7900(c3419.f11082, 2, obj2) + C3680.m7900(c3419.f11084, 1, obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static void m7518(AbstractC3462 abstractC3462, C3419 c3419, Object obj, Object obj2) {
        C3680.m7898(abstractC3462, c3419.f11084, 1, obj);
        C3680.m7898(abstractC3462, c3419.f11082, 2, obj2);
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
    public static boolean m7519(com.google.protobuf.AbstractC3474 r9, com.google.protobuf.C3712 r10, com.google.protobuf.C3697 r11, com.google.protobuf.C3663 r12, com.google.protobuf.InterfaceC3435 r13, int r14) {
        /*
            Method dump skipped, instruction units count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractC3413.m7519(com.google.protobuf.飘花落叶言子世苏兰哲楪, com.google.protobuf.飘花落叶言苏子哲兰世楪, com.google.protobuf.飘花落叶言楪苏子哲兰世, com.google.protobuf.飘花落叶言楪子哲世苏兰, com.google.protobuf.飘花落叶言世苏兰子楪哲, int):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static String m7520(String str, C3657 c3657, int i) {
        StringBuilder sb = new StringBuilder(str);
        DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto = c3657.f11355;
        if (descriptorProtos$FieldDescriptorProto.hasExtendee()) {
            sb.append('(');
            sb.append(c3657.f11348);
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
    public static void m7521(AbstractC3533 abstractC3533, Map map, AbstractC3462 abstractC3462) {
        boolean messageSetWireFormat = abstractC3533.getDescriptorForType().m7876().getMessageSetWireFormat();
        for (Map.Entry entry : map.entrySet()) {
            C3657 c3657 = (C3657) entry.getKey();
            Object value = entry.getValue();
            if (messageSetWireFormat && c3657.f11355.hasExtendee() && c3657.m7857() == Descriptors$FieldDescriptor$Type.MESSAGE && !c3657.mo7806()) {
                abstractC3462.mo7659(c3657.f11355.getNumber(), (InterfaceC3453) value);
            } else {
                C3680.m7896(c3657, value, abstractC3462);
            }
        }
        C3704 unknownFields = abstractC3533.getUnknownFields();
        if (messageSetWireFormat) {
            unknownFields.writeAsMessageSetTo(abstractC3462);
        } else {
            unknownFields.writeTo(abstractC3462);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static AbstractMap.SimpleImmutableEntry m7522(C3419 c3419, AbstractC3474 abstractC3474, C3697 c3697) {
        Object objM7523 = c3419.f11083;
        WireFormat$FieldType wireFormat$FieldType = c3419.f11082;
        WireFormat$FieldType wireFormat$FieldType2 = c3419.f11084;
        Object objM75232 = c3419.f11081;
        while (true) {
            int iMo7705 = abstractC3474.mo7705();
            if (iMo7705 == 0) {
                break;
            }
            if (iMo7705 == (wireFormat$FieldType2.getWireType() | 8)) {
                objM7523 = m7523(abstractC3474, c3697, wireFormat$FieldType2, objM7523);
            } else if (iMo7705 == (wireFormat$FieldType.getWireType() | 16)) {
                objM75232 = m7523(abstractC3474, c3697, wireFormat$FieldType, objM75232);
            } else if (!abstractC3474.mo7697(iMo7705)) {
                break;
            }
        }
        return new AbstractMap.SimpleImmutableEntry(objM7523, objM75232);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static Object m7523(AbstractC3474 abstractC3474, C3697 c3697, WireFormat$FieldType wireFormat$FieldType, Object obj) {
        int i = AbstractC3418.f11078[wireFormat$FieldType.ordinal()];
        if (i == 1) {
            InterfaceC3450 builder = ((InterfaceC3441) obj).toBuilder();
            abstractC3474.mo7716(builder, c3697);
            return builder.buildPartial();
        }
        if (i == 2) {
            return Integer.valueOf(abstractC3474.mo7724());
        }
        if (i != 3) {
            C3680 c3680 = C3680.f11477;
            return abstractC3474.m7702(wireFormat$FieldType, WireFormat$Utf8Validation.STRICT);
        }
        C2633.m5339("Groups are not allowed in maps.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static void m7524(InterfaceC3442 interfaceC3442, String str, ArrayList arrayList) {
        for (C3657 c3657 : interfaceC3442.getDescriptorForType().m7875()) {
            if (c3657.m7854() && !interfaceC3442.hasField(c3657)) {
                StringBuilder sbM140 = AbstractC0053.m140(str);
                sbM140.append(c3657.f11355.getName());
                arrayList.add(sbM140.toString());
            }
        }
        for (Map.Entry entry : interfaceC3442.getAllFields().entrySet()) {
            C3657 c36572 = (C3657) entry.getKey();
            Object value = entry.getValue();
            if (c36572.m7863() == Descriptors$FieldDescriptor$JavaType.MESSAGE) {
                if (c36572.mo7806()) {
                    Iterator it = ((List) value).iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        m7524((InterfaceC3442) it.next(), m7520(str, c36572, i), arrayList);
                        i++;
                    }
                } else if (interfaceC3442.hasField(c36572)) {
                    m7524((InterfaceC3442) value, m7520(str, c36572, -1), arrayList);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static String m7525(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < ' ' || cCharAt > '~' || cCharAt == '\'' || cCharAt == '\"' || cCharAt == '\\') {
                return m7514(str.getBytes(AbstractC3402.f11059));
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static boolean m7526(ByteBuffer byteBuffer, int i, int i2) {
        AbstractC3413 abstractC3413 = AbstractC3724.f11543;
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
    public static int m7527(AbstractC3533 abstractC3533, Map map) {
        boolean messageSetWireFormat = abstractC3533.getDescriptorForType().m7876().getMessageSetWireFormat();
        int iM7639 = 0;
        for (Map.Entry entry : map.entrySet()) {
            C3657 c3657 = (C3657) entry.getKey();
            Object value = entry.getValue();
            iM7639 = ((messageSetWireFormat && c3657.f11355.hasExtendee() && c3657.m7857() == Descriptors$FieldDescriptor$Type.MESSAGE && !c3657.mo7806()) ? AbstractC3462.m7639(3, (InterfaceC3453) value) + AbstractC3462.m7636(2, c3657.f11355.getNumber()) + (AbstractC3462.m7642(1) * 2) : C3680.m7906(c3657, value)) + iM7639;
        }
        C3704 unknownFields = abstractC3533.getUnknownFields();
        return (messageSetWireFormat ? unknownFields.getSerializedSizeAsMessageSet() : unknownFields.getSerializedSize()) + iM7639;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static boolean m7528(byte b) {
        return b > -65;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public abstract int mo7529(String str, byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public abstract String mo7530(int i, byte[] bArr, int i2);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public boolean mo7531(ByteBuffer byteBuffer, int i, int i2) {
        return m7526(byteBuffer, i, i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public abstract boolean mo7532(int i, byte[] bArr, int i2);
}
