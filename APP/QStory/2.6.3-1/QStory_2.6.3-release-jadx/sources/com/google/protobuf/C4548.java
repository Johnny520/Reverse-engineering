package com.google.protobuf;

import androidx.appcompat.widget.C0987;
import bsh.C3466;
import com.google.protobuf.C4427;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p025.AbstractC7012;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言苏子楪世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4548 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C4548 f11875;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C4548 f11876;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C4548 f11877;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f11878 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f11879;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4529 f11880;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4531 f11881;

    static {
        int i = C4531.f11848;
        C4531 c4531 = AbstractC4532.f11849;
        f11876 = new C4548(c4531, C4529.m8506(), false);
        f11875 = new C4548(c4531, C4529.m8506(), true);
        C4548 c4548 = new C4548(c4531, C4529.m8506(), false);
        c4548.f11878 = AbstractC4552.f11887;
        f11877 = c4548;
        new C4172();
    }

    public C4548(C4531 c4531, C4529 c4529, boolean z) {
        this.f11881 = c4531;
        this.f11880 = c4529;
        this.f11879 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m8533(C4536 c4536, C0987 c0987, boolean z) {
        if (c4536.isEmpty()) {
            return;
        }
        for (Map.Entry<Integer, C4541> entry : c4536.asMap().entrySet()) {
            int iIntValue = entry.getKey().intValue();
            C4541 value = entry.getValue();
            m8534(iIntValue, 0, value.f11873, c0987, z);
            m8534(iIntValue, 5, value.f11872, c0987, z);
            m8534(iIntValue, 1, value.f11871, c0987, z);
            m8534(iIntValue, 2, value.f11870, c0987, z);
            for (C4536 c45362 : value.f11869) {
                c0987.m1150(entry.getKey().toString());
                c0987.m1152();
                c0987.m1150("{");
                c0987.m1153();
                ((StringBuilder) c0987.f944).append("  ");
                m8533(c45362, c0987, z);
                c0987.m1151();
                c0987.m1150("}");
                c0987.m1153();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static void m8534(int i, int i2, List list, C0987 c0987, boolean z) {
        String string;
        for (Object obj : list) {
            c0987.m1150(String.valueOf(i));
            c0987.m1150(":");
            c0987.m1152();
            int i3 = i2 & 7;
            if (i3 == 0) {
                if (z) {
                    string = "UNKNOWN_VARINT [REDACTED]";
                } else {
                    long jLongValue = ((Long) obj).longValue();
                    boolean z2 = AbstractC4552.f11887;
                    string = jLongValue >= 0 ? Long.toString(jLongValue) : BigInteger.valueOf(jLongValue & Long.MAX_VALUE).setBit(63).toString();
                }
                c0987.m1150(string);
            } else if (i3 == 1) {
                c0987.m1150(z ? "UNKNOWN_FIXED64 [REDACTED]" : String.format(null, "0x%016x", (Long) obj));
            } else if (i3 == 2) {
                try {
                    C4536 from = C4536.parseFrom((ByteString) obj);
                    c0987.m1150("{");
                    c0987.m1153();
                    ((StringBuilder) c0987.f944).append("  ");
                    m8533(from, c0987, z);
                    c0987.m1151();
                    c0987.m1150("}");
                } catch (InvalidProtocolBufferException unused) {
                    if (z) {
                        c0987.m1150("UNKNOWN_STRING [REDACTED]");
                    } else {
                        c0987.m1150("\"");
                        boolean z3 = AbstractC4552.f11887;
                        c0987.m1150(AbstractC4245.m8073(((ByteString) obj).toByteArray()));
                        c0987.m1150("\"");
                    }
                }
            } else if (i3 == 3) {
                m8533((C4536) obj, c0987, z);
            } else {
                if (i3 != 5) {
                    C6755.m11869(AbstractC7012.m12147(i2, "Bad tag: "));
                    return;
                }
                c0987.m1150(z ? "UNKNOWN_FIXED32 [REDACTED]" : String.format(null, "0x%08x", (Integer) obj));
            }
            c0987.m1153();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C4548 m8535() {
        ThreadLocal threadLocal = AbstractC4214.f11376;
        if (threadLocal.get() == ProtobufToStringOutput$OutputMode.DEFAULT_FORMAT) {
            boolean z = AbstractC4552.f11887;
            return f11877;
        }
        if (threadLocal.get() == ProtobufToStringOutput$OutputMode.DEBUG_FORMAT) {
            boolean z2 = AbstractC4552.f11887;
            return f11875;
        }
        boolean z3 = AbstractC4552.f11887;
        return f11876;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String m8536(InterfaceC4274 interfaceC4274) {
        try {
            StringBuilder sb = new StringBuilder();
            if (this.f11879) {
                try {
                    sb.append((CharSequence) "");
                } catch (IOException e) {
                    throw new IllegalStateException(e);
                }
            }
            interfaceC4274.getDescriptorForType();
            m8538(interfaceC4274, new C0987(sb, this.f11878));
            return sb.toString();
        } catch (IOException e2) {
            C3466.m5897(e2);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x015f, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0167, code lost:
    
        throw r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b8  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m8537(C4489 c4489, Object obj, C0987 c0987) {
        DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto = c4489.f11700;
        if (descriptorProtos$FieldDescriptorProto.hasExtendee()) {
            c0987.m1150("[");
            if (c4489.f11691.m8435().getMessageSetWireFormat() && c4489.m8416() == Descriptors$FieldDescriptor$Type.MESSAGE && c4489.m8415() && c4489.m8421() == c4489.m8417()) {
                c0987.m1150(c4489.m8417().f11718);
            } else {
                c0987.m1150(c4489.f11693);
            }
            c0987.m1150("]");
        } else if (c4489.m8416() == Descriptors$FieldDescriptor$Type.GROUP && c4489.m8417().f11723.getName().toLowerCase(Locale.ROOT).equals(descriptorProtos$FieldDescriptorProto.getName()) && c4489.m8417().f11717.mo8361() == c4489.f11697.mo8361()) {
            if (descriptorProtos$FieldDescriptorProto.hasExtendee()) {
                AbstractC4490 abstractC4490 = c4489.m8417().f11717;
                if ((abstractC4490 instanceof C4495 ? (C4495) abstractC4490 : null) == c4489.m8421()) {
                    c0987.m1150(c4489.m8417().f11723.getName());
                } else {
                    c0987.m1150(descriptorProtos$FieldDescriptorProto.getName());
                }
            } else {
                AbstractC4490 abstractC44902 = c4489.m8417().f11717;
                if ((abstractC44902 instanceof C4495 ? (C4495) abstractC44902 : null) == c4489.f11691) {
                }
            }
        }
        Descriptors$FieldDescriptor$JavaType descriptors$FieldDescriptor$JavaTypeM8422 = c4489.m8422();
        Descriptors$FieldDescriptor$JavaType descriptors$FieldDescriptor$JavaType = Descriptors$FieldDescriptor$JavaType.MESSAGE;
        if (descriptors$FieldDescriptor$JavaTypeM8422 == descriptors$FieldDescriptor$JavaType) {
            c0987.m1152();
            c0987.m1150("{");
            c0987.m1153();
            ((StringBuilder) c0987.f944).append("  ");
        } else {
            c0987.m1150(":");
            c0987.m1152();
        }
        C4497 c4497 = c4489.f11696;
        if (c4497 == null) {
            synchronized (c4489) {
                try {
                    c4497 = c4489.f11696;
                    if (c4497 == null) {
                        if (c4489.f11694 == null) {
                            DescriptorProtos$FieldOptions options = c4489.f11700.getOptions();
                            if (options.hasFeatures()) {
                                options = options.toBuilder().clearFeatures().build();
                            }
                            synchronized (c4489) {
                                if (c4489.f11694 == null) {
                                    c4489.f11694 = options;
                                }
                            }
                        }
                        DescriptorProtos$FieldOptions descriptorProtos$FieldOptions = c4489.f11694;
                        C4497 c4497M8439 = C4497.m8439(descriptorProtos$FieldOptions.getDebugRedact(), false);
                        for (Map.Entry<C4489, Object> entry : descriptorProtos$FieldOptions.getAllFields().entrySet()) {
                            C4497 c4497M8409 = C4489.m8409(entry.getKey(), entry.getValue());
                            c4497M8439 = C4497.m8439(c4497M8439.f11737 || c4497M8409.f11737, c4497M8409.f11736);
                            if (c4497M8439.f11737) {
                                break;
                            }
                        }
                        c4489.f11696 = c4497M8439;
                        c4497 = c4497M8439;
                    }
                } finally {
                }
            }
        }
        if (!this.f11879 || !c4497.f11737) {
            switch (AbstractC4171.f11308[c4489.m8416().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    c0987.m1150(((Integer) obj).toString());
                    break;
                case 4:
                case 5:
                case 6:
                    c0987.m1150(((Long) obj).toString());
                    break;
                case 7:
                    c0987.m1150(((Boolean) obj).toString());
                    break;
                case 8:
                    c0987.m1150(((Float) obj).toString());
                    break;
                case 9:
                    c0987.m1150(((Double) obj).toString());
                    break;
                case 10:
                case 11:
                    int iIntValue = ((Integer) obj).intValue();
                    c0987.m1150(iIntValue >= 0 ? Integer.toString(iIntValue) : Long.toString(((long) iIntValue) & 4294967295L));
                    break;
                case 12:
                case 13:
                    long jLongValue = ((Long) obj).longValue();
                    c0987.m1150(jLongValue >= 0 ? Long.toString(jLongValue) : BigInteger.valueOf(jLongValue & Long.MAX_VALUE).setBit(63).toString());
                    break;
                case 14:
                    c0987.m1150("\"");
                    c0987.m1150(AbstractC4245.m8084((String) obj));
                    c0987.m1150("\"");
                    break;
                case 15:
                    c0987.m1150("\"");
                    if (obj instanceof ByteString) {
                        c0987.m1150(AbstractC4245.m8073(((ByteString) obj).toByteArray()));
                    } else {
                        c0987.m1150(AbstractC4245.m8073((byte[]) obj));
                    }
                    c0987.m1150("\"");
                    break;
                case 16:
                    C4496 c4496 = (C4496) obj;
                    int i = c4496.f11730;
                    DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto = c4496.f11731;
                    if (i == -1) {
                        c0987.m1150(Integer.toString(descriptorProtos$EnumValueDescriptorProto.getNumber()));
                    } else {
                        c0987.m1150(descriptorProtos$EnumValueDescriptorProto.getName());
                    }
                    break;
                case 17:
                case 18:
                    m8538((InterfaceC4274) obj, c0987);
                    break;
            }
        } else {
            c0987.m1150("[REDACTED]");
            if (c4489.m8422() == Descriptors$FieldDescriptor$JavaType.MESSAGE) {
                c0987.m1153();
            }
        }
        if (c4489.m8422() == descriptors$FieldDescriptor$JavaType) {
            c0987.m1151();
            c0987.m1150("}");
        }
        c0987.m1153();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m8538(InterfaceC4274 interfaceC4274, C0987 c0987) {
        if (interfaceC4274.getDescriptorForType().f11718.equals("google.protobuf.Any")) {
            C4495 descriptorForType = interfaceC4274.getDescriptorForType();
            C4489 c4489M8437 = descriptorForType.m8437(1);
            C4489 c4489M84372 = descriptorForType.m8437(2);
            if (c4489M8437 != null && c4489M8437.m8416() == Descriptors$FieldDescriptor$Type.STRING && c4489M84372 != null && c4489M84372.m8416() == Descriptors$FieldDescriptor$Type.BYTES) {
                String str = (String) interfaceC4274.getField(c4489M8437);
                if (!str.isEmpty()) {
                    Object field = interfaceC4274.getField(c4489M84372);
                    try {
                        this.f11881.getClass();
                        String[] strArrSplit = str.split("/");
                        if (strArrSplit.length <= 1) {
                            throw new InvalidProtocolBufferException("Invalid type url found: ".concat(str));
                        }
                        C4495 c4495 = (C4495) Collections.EMPTY_MAP.get(strArrSplit[strArrSplit.length - 1]);
                        if (c4495 != null) {
                            C4427.C4428 c4428NewBuilderForType = C4427.getDefaultInstance(c4495).newBuilderForType();
                            c4428NewBuilderForType.mergeFrom((ByteString) field, this.f11880);
                            c0987.m1150("[");
                            c0987.m1150(str);
                            c0987.m1150("]");
                            c0987.m1152();
                            c0987.m1150("{");
                            c0987.m1153();
                            ((StringBuilder) c0987.f944).append("  ");
                            m8538(c4428NewBuilderForType, c0987);
                            c0987.m1151();
                            c0987.m1150("}");
                            c0987.m1153();
                            return;
                        }
                    } catch (InvalidProtocolBufferException unused) {
                    }
                }
            }
        }
        for (Map.Entry entry : interfaceC4274.getAllFields().entrySet()) {
            C4489 c4489 = (C4489) entry.getKey();
            Object value = entry.getValue();
            if (c4489.m8418()) {
                ArrayList<C4549> arrayList = new ArrayList();
                Iterator it = ((List) value).iterator();
                while (it.hasNext()) {
                    arrayList.add(new C4549(c4489, it.next()));
                }
                Collections.sort(arrayList);
                for (C4549 c4549 : arrayList) {
                    Object obj = c4549.f11882;
                    if (obj == null) {
                        obj = c4549.f11884;
                    }
                    m8537(c4489, obj, c0987);
                }
            } else if (c4489.mo8365()) {
                Iterator it2 = ((List) value).iterator();
                while (it2.hasNext()) {
                    m8537(c4489, it2.next(), c0987);
                }
            } else {
                m8537(c4489, value, c0987);
            }
        }
        m8533(interfaceC4274.getUnknownFields(), c0987, this.f11879);
    }
}
