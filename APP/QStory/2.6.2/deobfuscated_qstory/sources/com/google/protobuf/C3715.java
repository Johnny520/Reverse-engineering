package com.google.protobuf;

import androidx.appcompat.widget.C0140;
import bsh.C2632;
import com.google.protobuf.C3594;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p007.AbstractC6136;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言苏子楪世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3715 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C3715 f11525;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C3715 f11526;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C3715 f11527;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f11528 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f11529;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3696 f11530;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3698 f11531;

    static {
        int i = C3698.f11498;
        C3698 c3698 = AbstractC3699.f11499;
        f11526 = new C3715(c3698, C3696.m7960(), false);
        f11525 = new C3715(c3698, C3696.m7960(), true);
        C3715 c3715 = new C3715(c3698, C3696.m7960(), false);
        c3715.f11528 = AbstractC3719.f11537;
        f11527 = c3715;
        new C3339();
    }

    public C3715(C3698 c3698, C3696 c3696, boolean z) {
        this.f11531 = c3698;
        this.f11530 = c3696;
        this.f11529 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m7987(C3703 c3703, C0140 c0140, boolean z) {
        if (c3703.isEmpty()) {
            return;
        }
        for (Map.Entry<Integer, C3708> entry : c3703.asMap().entrySet()) {
            int iIntValue = entry.getKey().intValue();
            C3708 value = entry.getValue();
            m7988(iIntValue, 0, value.f11523, c0140, z);
            m7988(iIntValue, 5, value.f11522, c0140, z);
            m7988(iIntValue, 1, value.f11521, c0140, z);
            m7988(iIntValue, 2, value.f11520, c0140, z);
            for (C3703 c37032 : value.f11519) {
                c0140.m589(entry.getKey().toString());
                c0140.m591();
                c0140.m589("{");
                c0140.m592();
                ((StringBuilder) c0140.f599).append("  ");
                m7987(c37032, c0140, z);
                c0140.m590();
                c0140.m589("}");
                c0140.m592();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static void m7988(int i, int i2, List list, C0140 c0140, boolean z) {
        String string;
        for (Object obj : list) {
            c0140.m589(String.valueOf(i));
            c0140.m589(":");
            c0140.m591();
            int i3 = i2 & 7;
            if (i3 == 0) {
                if (z) {
                    string = "UNKNOWN_VARINT [REDACTED]";
                } else {
                    long jLongValue = ((Long) obj).longValue();
                    boolean z2 = AbstractC3719.f11537;
                    string = jLongValue >= 0 ? Long.toString(jLongValue) : BigInteger.valueOf(jLongValue & Long.MAX_VALUE).setBit(63).toString();
                }
                c0140.m589(string);
            } else if (i3 == 1) {
                c0140.m589(z ? "UNKNOWN_FIXED64 [REDACTED]" : String.format(null, "0x%016x", (Long) obj));
            } else if (i3 == 2) {
                try {
                    C3703 from = C3703.parseFrom((ByteString) obj);
                    c0140.m589("{");
                    c0140.m592();
                    ((StringBuilder) c0140.f599).append("  ");
                    m7987(from, c0140, z);
                    c0140.m590();
                    c0140.m589("}");
                } catch (InvalidProtocolBufferException unused) {
                    if (z) {
                        c0140.m589("UNKNOWN_STRING [REDACTED]");
                    } else {
                        c0140.m589("\"");
                        boolean z3 = AbstractC3719.f11537;
                        c0140.m589(AbstractC3412.m7527(((ByteString) obj).toByteArray()));
                        c0140.m589("\"");
                    }
                }
            } else if (i3 == 3) {
                m7987((C3703) obj, c0140, z);
            } else {
                if (i3 != 5) {
                    C5919.m11249(AbstractC6136.m11556(i2, "Bad tag: "));
                    return;
                }
                c0140.m589(z ? "UNKNOWN_FIXED32 [REDACTED]" : String.format(null, "0x%08x", (Integer) obj));
            }
            c0140.m592();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C3715 m7989() {
        ThreadLocal threadLocal = AbstractC3381.f11026;
        if (threadLocal.get() == ProtobufToStringOutput$OutputMode.DEFAULT_FORMAT) {
            boolean z = AbstractC3719.f11537;
            return f11527;
        }
        if (threadLocal.get() == ProtobufToStringOutput$OutputMode.DEBUG_FORMAT) {
            boolean z2 = AbstractC3719.f11537;
            return f11525;
        }
        boolean z3 = AbstractC3719.f11537;
        return f11526;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String m7990(InterfaceC3441 interfaceC3441) {
        try {
            StringBuilder sb = new StringBuilder();
            if (this.f11529) {
                try {
                    sb.append((CharSequence) "");
                } catch (IOException e) {
                    throw new IllegalStateException(e);
                }
            }
            interfaceC3441.getDescriptorForType();
            m7992(interfaceC3441, new C0140(sb, this.f11528));
            return sb.toString();
        } catch (IOException e2) {
            C2632.m5292(e2);
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
    public final void m7991(com.google.protobuf.C3656 r7, java.lang.Object r8, androidx.appcompat.widget.C0140 r9) {
        /*
            Method dump skipped, instruction units count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C3715.m7991(com.google.protobuf.飘花落叶言楪子兰世苏哲, java.lang.Object, androidx.appcompat.widget.飘花落叶言子兰世楪哲苏):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7992(InterfaceC3441 interfaceC3441, C0140 c0140) {
        if (interfaceC3441.getDescriptorForType().f11368.equals("google.protobuf.Any")) {
            C3662 descriptorForType = interfaceC3441.getDescriptorForType();
            C3656 c3656M7891 = descriptorForType.m7891(1);
            C3656 c3656M78912 = descriptorForType.m7891(2);
            if (c3656M7891 != null && c3656M7891.m7870() == Descriptors$FieldDescriptor$Type.STRING && c3656M78912 != null && c3656M78912.m7870() == Descriptors$FieldDescriptor$Type.BYTES) {
                String str = (String) interfaceC3441.getField(c3656M7891);
                if (!str.isEmpty()) {
                    Object field = interfaceC3441.getField(c3656M78912);
                    try {
                        this.f11531.getClass();
                        String[] strArrSplit = str.split("/");
                        if (strArrSplit.length <= 1) {
                            throw new InvalidProtocolBufferException("Invalid type url found: ".concat(str));
                        }
                        C3662 c3662 = (C3662) Collections.EMPTY_MAP.get(strArrSplit[strArrSplit.length - 1]);
                        if (c3662 != null) {
                            C3594.C3595 c3595NewBuilderForType = C3594.getDefaultInstance(c3662).newBuilderForType();
                            c3595NewBuilderForType.mergeFrom((ByteString) field, this.f11530);
                            c0140.m589("[");
                            c0140.m589(str);
                            c0140.m589("]");
                            c0140.m591();
                            c0140.m589("{");
                            c0140.m592();
                            ((StringBuilder) c0140.f599).append("  ");
                            m7992(c3595NewBuilderForType, c0140);
                            c0140.m590();
                            c0140.m589("}");
                            c0140.m592();
                            return;
                        }
                    } catch (InvalidProtocolBufferException unused) {
                    }
                }
            }
        }
        for (Map.Entry entry : interfaceC3441.getAllFields().entrySet()) {
            C3656 c3656 = (C3656) entry.getKey();
            Object value = entry.getValue();
            if (c3656.m7872()) {
                ArrayList<C3716> arrayList = new ArrayList();
                Iterator it = ((List) value).iterator();
                while (it.hasNext()) {
                    arrayList.add(new C3716(c3656, it.next()));
                }
                Collections.sort(arrayList);
                for (C3716 c3716 : arrayList) {
                    Object obj = c3716.f11532;
                    if (obj == null) {
                        obj = c3716.f11534;
                    }
                    m7991(c3656, obj, c0140);
                }
            } else if (c3656.mo7819()) {
                Iterator it2 = ((List) value).iterator();
                while (it2.hasNext()) {
                    m7991(c3656, it2.next(), c0140);
                }
            } else {
                m7991(c3656, value, c0140);
            }
        }
        m7987(interfaceC3441.getUnknownFields(), c0140, this.f11529);
    }
}
