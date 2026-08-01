package com.google.protobuf;

import androidx.activity.AbstractC0900;
import bsh.C3466;
import io.ktor.util.C5043;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世楪哲兰子苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4245 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static String m8073(byte[] bArr) {
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
    public static int m8074(String str, byte[] bArr, int i, int i2) {
        byte[] bytes = str.getBytes(AbstractC4234.f11404);
        if (bytes.length - i > i2) {
            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
        }
        System.arraycopy(bytes, 0, bArr, i, bytes.length);
        return i + bytes.length;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static String m8075(List list) {
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
    public static int m8076(C4251 c4251, Object obj, Object obj2) {
        return C4512.m8459(c4251.f11427, 2, obj2) + C4512.m8459(c4251.f11429, 1, obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static void m8077(AbstractC4294 abstractC4294, C4251 c4251, Object obj, Object obj2) {
        C4512.m8457(abstractC4294, c4251.f11429, 1, obj);
        C4512.m8457(abstractC4294, c4251.f11427, 2, obj2);
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
    */
    public static boolean m8078(AbstractC4306 abstractC4306, C4544 c4544, C4529 c4529, C4495 c4495, InterfaceC4267 interfaceC4267, int i) {
        InterfaceC4285 interfaceC4285;
        Object[] objArr;
        Object objM8441;
        C4410 c4410Mo8104;
        int i2 = 0;
        C4489 c4489M8437 = null;
        C4410 c4410Mo81042 = null;
        if (c4495.m8435().getMessageSetWireFormat() && i == 11) {
            ByteString byteStringMo8278 = null;
            while (true) {
                int iMo8264 = abstractC4306.mo8264();
                if (iMo8264 == 0) {
                    break;
                }
                if (iMo8264 != 16) {
                    if (iMo8264 != 26) {
                        if (iMo8264 == 12 || !abstractC4306.mo8256(iMo8264)) {
                            break;
                        }
                    } else {
                        if (i2 != 0 && c4410Mo81042 != null) {
                            C4529 c45292 = C4529.f11846;
                        }
                        byteStringMo8278 = abstractC4306.mo8278();
                    }
                } else {
                    int iMo8263 = abstractC4306.mo8263();
                    if (iMo8263 != 0 && (c4529 instanceof C4525)) {
                        c4410Mo81042 = interfaceC4267.mo8104((C4525) c4529, c4495, iMo8263);
                    }
                    i2 = iMo8263;
                }
            }
            abstractC4306.mo8271(12);
            if (byteStringMo8278 != null && i2 != 0) {
                if (c4410Mo81042 != null) {
                    C4489 c4489 = c4410Mo81042.f11551;
                    InterfaceC4285 interfaceC42852 = c4410Mo81042.f11550;
                    if (interfaceC4267.hasField(c4489)) {
                        interfaceC4267.setField(c4489, interfaceC4267.mo8101(byteStringMo8278, c4529, c4489, interfaceC42852));
                        return true;
                    }
                    C4529 c45293 = C4529.f11846;
                    interfaceC4267.setField(c4489, new C4215(interfaceC42852, c4529, byteStringMo8278));
                    return true;
                }
                if (c4544 != null) {
                    C4541 c4541 = C4541.f11868;
                    C4540 c4540 = new C4540();
                    c4540.m8520(byteStringMo8278);
                    c4544.m8527(i2, c4540.m8519());
                    return true;
                }
            }
        } else {
            int i3 = i & 7;
            int i4 = i >>> 3;
            int iBinarySearch = Arrays.binarySearch(c4495.f11713, i4);
            if (iBinarySearch < 0) {
                iBinarySearch = (~iBinarySearch) - 1;
            }
            if (iBinarySearch < 0 || i4 >= c4495.f11712[iBinarySearch]) {
                if (interfaceC4267.mo8103() == MessageReflection$MergeTarget$ContainerType.MESSAGE) {
                    c4489M8437 = c4495.m8437(i4);
                    interfaceC4285 = null;
                } else {
                    interfaceC4285 = null;
                }
                if (c4489M8437 != null) {
                    objArr = false;
                    i2 = 1;
                    if (i2 == 0) {
                        return c4544 != null ? c4544.m8526(i, abstractC4306) : abstractC4306.mo8256(i);
                    }
                    if (objArr == true) {
                        int iMo8286 = abstractC4306.mo8286(abstractC4306.mo8260());
                        if (c4489M8437.mo8366() == WireFormat$FieldType.ENUM) {
                            while (abstractC4306.mo8269() > 0) {
                                int iMo8283 = abstractC4306.mo8283();
                                if (c4489M8437.m8412()) {
                                    C4496 c4496M8443 = c4489M8437.m8424().mo7905(iMo8283);
                                    if (c4496M8443 != null) {
                                        interfaceC4267.addRepeatedField(c4489M8437, c4496M8443);
                                    } else if (c4544 != null) {
                                        c4544.m8531(i4, iMo8283);
                                    }
                                } else {
                                    interfaceC4267.addRepeatedField(c4489M8437, c4489M8437.m8424().m8441(iMo8283));
                                }
                            }
                        } else {
                            while (abstractC4306.mo8269() > 0) {
                                interfaceC4267.addRepeatedField(c4489M8437, abstractC4306.m8261(c4489M8437.mo8366(), interfaceC4267.mo8102(c4489M8437)));
                            }
                        }
                        abstractC4306.mo8285(iMo8286);
                        return true;
                    }
                    int i5 = AbstractC4270.f11464[c4489M8437.m8416().ordinal()];
                    if (i5 == 1) {
                        interfaceC4267.mo8118(abstractC4306, c4529, c4489M8437, interfaceC4285);
                        return true;
                    }
                    if (i5 == 2) {
                        interfaceC4267.mo8100(abstractC4306, c4529, c4489M8437, interfaceC4285);
                        return true;
                    }
                    if (i5 != 3) {
                        objM8441 = abstractC4306.m8261(c4489M8437.mo8366(), interfaceC4267.mo8102(c4489M8437));
                    } else {
                        int iMo82832 = abstractC4306.mo8283();
                        if (c4489M8437.m8412()) {
                            C4496 c4496M84432 = c4489M8437.m8424().mo7905(iMo82832);
                            if (c4496M84432 != null) {
                                objM8441 = c4496M84432;
                            } else if (c4544 != null) {
                                c4544.m8531(i4, iMo82832);
                            }
                        } else {
                            objM8441 = c4489M8437.m8424().m8441(iMo82832);
                        }
                    }
                    if (c4489M8437.mo8365()) {
                        interfaceC4267.addRepeatedField(c4489M8437, objM8441);
                        return true;
                    }
                    interfaceC4267.setField(c4489M8437, objM8441);
                    return true;
                }
                WireFormat$FieldType wireFormat$FieldTypeMo8366 = c4489M8437.mo8366();
                C4512 c4512 = C4512.f11822;
                if (i3 == wireFormat$FieldTypeMo8366.getWireType()) {
                    objArr = false;
                } else if (c4489M8437.m8414()) {
                    c4489M8437.mo8366();
                    if (i3 == 2) {
                        objArr = true;
                    }
                }
                if (i2 == 0) {
                }
            } else {
                if ((c4529 instanceof C4525) && (c4410Mo8104 = interfaceC4267.mo8104((C4525) c4529, c4495, i4)) != null) {
                    c4489M8437 = c4410Mo8104.f11551;
                    interfaceC4285 = c4410Mo8104.f11550;
                    if (interfaceC4285 == null && c4489M8437.m8422() == Descriptors$FieldDescriptor$JavaType.MESSAGE) {
                        C5043.m9164(c4489M8437.f11693, "Message-typed extension lacked default instance: ");
                        return false;
                    }
                }
                if (c4489M8437 != null) {
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static String m8079(String str, C4489 c4489, int i) {
        StringBuilder sb = new StringBuilder(str);
        DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto = c4489.f11700;
        if (descriptorProtos$FieldDescriptorProto.hasExtendee()) {
            sb.append('(');
            sb.append(c4489.f11693);
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
    public static void m8080(AbstractC4365 abstractC4365, Map map, AbstractC4294 abstractC4294) {
        boolean messageSetWireFormat = abstractC4365.getDescriptorForType().m8435().getMessageSetWireFormat();
        for (Map.Entry entry : map.entrySet()) {
            C4489 c4489 = (C4489) entry.getKey();
            Object value = entry.getValue();
            if (messageSetWireFormat && c4489.f11700.hasExtendee() && c4489.m8416() == Descriptors$FieldDescriptor$Type.MESSAGE && !c4489.mo8365()) {
                abstractC4294.mo8218(c4489.f11700.getNumber(), (InterfaceC4285) value);
            } else {
                C4512.m8455(c4489, value, abstractC4294);
            }
        }
        C4536 unknownFields = abstractC4365.getUnknownFields();
        if (messageSetWireFormat) {
            unknownFields.writeAsMessageSetTo(abstractC4294);
        } else {
            unknownFields.writeTo(abstractC4294);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static AbstractMap.SimpleImmutableEntry m8081(C4251 c4251, AbstractC4306 abstractC4306, C4529 c4529) {
        Object objM8082 = c4251.f11428;
        WireFormat$FieldType wireFormat$FieldType = c4251.f11427;
        WireFormat$FieldType wireFormat$FieldType2 = c4251.f11429;
        Object objM80822 = c4251.f11426;
        while (true) {
            int iMo8264 = abstractC4306.mo8264();
            if (iMo8264 == 0) {
                break;
            }
            if (iMo8264 == (wireFormat$FieldType2.getWireType() | 8)) {
                objM8082 = m8082(abstractC4306, c4529, wireFormat$FieldType2, objM8082);
            } else if (iMo8264 == (wireFormat$FieldType.getWireType() | 16)) {
                objM80822 = m8082(abstractC4306, c4529, wireFormat$FieldType, objM80822);
            } else if (!abstractC4306.mo8256(iMo8264)) {
                break;
            }
        }
        return new AbstractMap.SimpleImmutableEntry(objM8082, objM80822);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static Object m8082(AbstractC4306 abstractC4306, C4529 c4529, WireFormat$FieldType wireFormat$FieldType, Object obj) {
        int i = AbstractC4250.f11423[wireFormat$FieldType.ordinal()];
        if (i == 1) {
            InterfaceC4282 builder = ((InterfaceC4273) obj).toBuilder();
            abstractC4306.mo8275(builder, c4529);
            return builder.buildPartial();
        }
        if (i == 2) {
            return Integer.valueOf(abstractC4306.mo8283());
        }
        if (i != 3) {
            C4512 c4512 = C4512.f11822;
            return abstractC4306.m8261(wireFormat$FieldType, WireFormat$Utf8Validation.STRICT);
        }
        C3466.m5899("Groups are not allowed in maps.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static void m8083(InterfaceC4274 interfaceC4274, String str, ArrayList arrayList) {
        for (C4489 c4489 : interfaceC4274.getDescriptorForType().m8434()) {
            if (c4489.m8413() && !interfaceC4274.hasField(c4489)) {
                StringBuilder sbM700 = AbstractC0900.m700(str);
                sbM700.append(c4489.f11700.getName());
                arrayList.add(sbM700.toString());
            }
        }
        for (Map.Entry entry : interfaceC4274.getAllFields().entrySet()) {
            C4489 c44892 = (C4489) entry.getKey();
            Object value = entry.getValue();
            if (c44892.m8422() == Descriptors$FieldDescriptor$JavaType.MESSAGE) {
                if (c44892.mo8365()) {
                    Iterator it = ((List) value).iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        m8083((InterfaceC4274) it.next(), m8079(str, c44892, i), arrayList);
                        i++;
                    }
                } else if (interfaceC4274.hasField(c44892)) {
                    m8083((InterfaceC4274) value, m8079(str, c44892, -1), arrayList);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static String m8084(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < ' ' || cCharAt > '~' || cCharAt == '\'' || cCharAt == '\"' || cCharAt == '\\') {
                return m8073(str.getBytes(AbstractC4234.f11404));
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static boolean m8085(ByteBuffer byteBuffer, int i, int i2) {
        AbstractC4245 abstractC4245 = AbstractC4556.f11888;
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
    public static int m8086(AbstractC4365 abstractC4365, Map map) {
        boolean messageSetWireFormat = abstractC4365.getDescriptorForType().m8435().getMessageSetWireFormat();
        int iM8198 = 0;
        for (Map.Entry entry : map.entrySet()) {
            C4489 c4489 = (C4489) entry.getKey();
            Object value = entry.getValue();
            iM8198 = ((messageSetWireFormat && c4489.f11700.hasExtendee() && c4489.m8416() == Descriptors$FieldDescriptor$Type.MESSAGE && !c4489.mo8365()) ? AbstractC4294.m8198(3, (InterfaceC4285) value) + AbstractC4294.m8195(2, c4489.f11700.getNumber()) + (AbstractC4294.m8201(1) * 2) : C4512.m8465(c4489, value)) + iM8198;
        }
        C4536 unknownFields = abstractC4365.getUnknownFields();
        return (messageSetWireFormat ? unknownFields.getSerializedSizeAsMessageSet() : unknownFields.getSerializedSize()) + iM8198;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static boolean m8087(byte b) {
        return b > -65;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public abstract int mo8088(String str, byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public abstract String mo8089(int i, byte[] bArr, int i2);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public boolean mo8090(ByteBuffer byteBuffer, int i, int i2) {
        return m8085(byteBuffer, i, i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public abstract boolean mo8091(int i, byte[] bArr, int i2);
}
