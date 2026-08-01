package com.google.protobuf;

import androidx.appcompat.widget.C0140;
import bsh.C2633;
import com.google.protobuf.C3595;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p009.AbstractC6183;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言苏子楪世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3716 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C3716 f11530;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C3716 f11531;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C3716 f11532;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f11533 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f11534;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3697 f11535;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3699 f11536;

    static {
        int i = C3699.f11503;
        C3699 c3699 = AbstractC3700.f11504;
        f11531 = new C3716(c3699, C3697.m7947(), false);
        f11530 = new C3716(c3699, C3697.m7947(), true);
        C3716 c3716 = new C3716(c3699, C3697.m7947(), false);
        c3716.f11533 = AbstractC3720.f11542;
        f11532 = c3716;
        new C3340();
    }

    public C3716(C3699 c3699, C3697 c3697, boolean z) {
        this.f11536 = c3699;
        this.f11535 = c3697;
        this.f11534 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m7974(C3704 c3704, C0140 c0140, boolean z) {
        if (c3704.isEmpty()) {
            return;
        }
        for (Map.Entry<Integer, C3709> entry : c3704.asMap().entrySet()) {
            int iIntValue = entry.getKey().intValue();
            C3709 value = entry.getValue();
            m7975(iIntValue, 0, value.f11528, c0140, z);
            m7975(iIntValue, 5, value.f11527, c0140, z);
            m7975(iIntValue, 1, value.f11526, c0140, z);
            m7975(iIntValue, 2, value.f11525, c0140, z);
            for (C3704 c37042 : value.f11524) {
                c0140.m590(entry.getKey().toString());
                c0140.m592();
                c0140.m590("{");
                c0140.m593();
                ((StringBuilder) c0140.f599).append("  ");
                m7974(c37042, c0140, z);
                c0140.m591();
                c0140.m590("}");
                c0140.m593();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static void m7975(int i, int i2, List list, C0140 c0140, boolean z) {
        String string;
        for (Object obj : list) {
            c0140.m590(String.valueOf(i));
            c0140.m590(":");
            c0140.m592();
            int i3 = i2 & 7;
            if (i3 == 0) {
                if (z) {
                    string = "UNKNOWN_VARINT [REDACTED]";
                } else {
                    long jLongValue = ((Long) obj).longValue();
                    boolean z2 = AbstractC3720.f11542;
                    string = jLongValue >= 0 ? Long.toString(jLongValue) : BigInteger.valueOf(jLongValue & Long.MAX_VALUE).setBit(63).toString();
                }
                c0140.m590(string);
            } else if (i3 == 1) {
                c0140.m590(z ? "UNKNOWN_FIXED64 [REDACTED]" : String.format(null, "0x%016x", (Long) obj));
            } else if (i3 == 2) {
                try {
                    C3704 from = C3704.parseFrom((ByteString) obj);
                    c0140.m590("{");
                    c0140.m593();
                    ((StringBuilder) c0140.f599).append("  ");
                    m7974(from, c0140, z);
                    c0140.m591();
                    c0140.m590("}");
                } catch (InvalidProtocolBufferException unused) {
                    if (z) {
                        c0140.m590("UNKNOWN_STRING [REDACTED]");
                    } else {
                        c0140.m590("\"");
                        boolean z3 = AbstractC3720.f11542;
                        c0140.m590(AbstractC3413.m7514(((ByteString) obj).toByteArray()));
                        c0140.m590("\"");
                    }
                }
            } else if (i3 == 3) {
                m7974((C3704) obj, c0140, z);
            } else {
                if (i3 != 5) {
                    C5925.m11310(AbstractC6183.m11588(i2, "Bad tag: "));
                    return;
                }
                c0140.m590(z ? "UNKNOWN_FIXED32 [REDACTED]" : String.format(null, "0x%08x", (Integer) obj));
            }
            c0140.m593();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C3716 m7976() {
        ThreadLocal threadLocal = AbstractC3382.f11031;
        if (threadLocal.get() == ProtobufToStringOutput$OutputMode.DEFAULT_FORMAT) {
            boolean z = AbstractC3720.f11542;
            return f11532;
        }
        if (threadLocal.get() == ProtobufToStringOutput$OutputMode.DEBUG_FORMAT) {
            boolean z2 = AbstractC3720.f11542;
            return f11530;
        }
        boolean z3 = AbstractC3720.f11542;
        return f11531;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String m7977(InterfaceC3442 interfaceC3442) {
        try {
            StringBuilder sb = new StringBuilder();
            if (this.f11534) {
                try {
                    sb.append((CharSequence) "");
                } catch (IOException e) {
                    throw new IllegalStateException(e);
                }
            }
            interfaceC3442.getDescriptorForType();
            m7979(interfaceC3442, new C0140(sb, this.f11533));
            return sb.toString();
        } catch (IOException e2) {
            C2633.m5337(e2);
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m7978(com.google.protobuf.C3657 r7, java.lang.Object r8, androidx.appcompat.widget.C0140 r9) {
        /*
            Method dump skipped, instruction units count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C3716.m7978(com.google.protobuf.飘花落叶言楪子兰世苏哲, java.lang.Object, androidx.appcompat.widget.飘花落叶言子兰世楪哲苏):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7979(InterfaceC3442 interfaceC3442, C0140 c0140) {
        if (interfaceC3442.getDescriptorForType().f11373.equals("google.protobuf.Any")) {
            C3663 descriptorForType = interfaceC3442.getDescriptorForType();
            C3657 c3657M7878 = descriptorForType.m7878(1);
            C3657 c3657M78782 = descriptorForType.m7878(2);
            if (c3657M7878 != null && c3657M7878.m7857() == Descriptors$FieldDescriptor$Type.STRING && c3657M78782 != null && c3657M78782.m7857() == Descriptors$FieldDescriptor$Type.BYTES) {
                String str = (String) interfaceC3442.getField(c3657M7878);
                if (!str.isEmpty()) {
                    Object field = interfaceC3442.getField(c3657M78782);
                    try {
                        this.f11536.getClass();
                        String[] strArrSplit = str.split("/");
                        if (strArrSplit.length <= 1) {
                            throw new InvalidProtocolBufferException("Invalid type url found: ".concat(str));
                        }
                        C3663 c3663 = (C3663) Collections.EMPTY_MAP.get(strArrSplit[strArrSplit.length - 1]);
                        if (c3663 != null) {
                            C3595.C3596 c3596NewBuilderForType = C3595.getDefaultInstance(c3663).newBuilderForType();
                            c3596NewBuilderForType.mergeFrom((ByteString) field, this.f11535);
                            c0140.m590("[");
                            c0140.m590(str);
                            c0140.m590("]");
                            c0140.m592();
                            c0140.m590("{");
                            c0140.m593();
                            ((StringBuilder) c0140.f599).append("  ");
                            m7979(c3596NewBuilderForType, c0140);
                            c0140.m591();
                            c0140.m590("}");
                            c0140.m593();
                            return;
                        }
                    } catch (InvalidProtocolBufferException unused) {
                    }
                }
            }
        }
        for (Map.Entry entry : interfaceC3442.getAllFields().entrySet()) {
            C3657 c3657 = (C3657) entry.getKey();
            Object value = entry.getValue();
            if (c3657.m7859()) {
                ArrayList<C3717> arrayList = new ArrayList();
                Iterator it = ((List) value).iterator();
                while (it.hasNext()) {
                    arrayList.add(new C3717(c3657, it.next()));
                }
                Collections.sort(arrayList);
                for (C3717 c3717 : arrayList) {
                    Object obj = c3717.f11537;
                    if (obj == null) {
                        obj = c3717.f11539;
                    }
                    m7978(c3657, obj, c0140);
                }
            } else if (c3657.mo7806()) {
                Iterator it2 = ((List) value).iterator();
                while (it2.hasNext()) {
                    m7978(c3657, it2.next(), c0140);
                }
            } else {
                m7978(c3657, value, c0140);
            }
        }
        m7974(interfaceC3442.getUnknownFields(), c0140, this.f11534);
    }
}
