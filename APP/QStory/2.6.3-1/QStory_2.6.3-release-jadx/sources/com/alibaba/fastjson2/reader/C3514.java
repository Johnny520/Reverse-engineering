package com.alibaba.fastjson2.reader;

import androidx.collection.C1123;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.util.AbstractC3693;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3514 extends AbstractC3630 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C3514 f8495 = new C3514(Object[].class);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long f8494 = AbstractC3693.m6334("[O");

    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo6023(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        Object objMo6744;
        if (!abstractC3732.mo6711()) {
            if (!abstractC3732.mo6701()) {
                if (abstractC3732.f9538 == '{') {
                    abstractC3732.mo6733();
                    if (abstractC3732.mo6689() == InterfaceC3621.f8931) {
                        abstractC3732.mo6744();
                    }
                }
                if (abstractC3732.mo6739()) {
                    String strMo6744 = abstractC3732.mo6744();
                    if (strMo6744 != null && !strMo6744.isEmpty()) {
                        if ("@value".equals(strMo6744)) {
                            abstractC3732.mo6733();
                            Object objMo6023 = mo6023(abstractC3732, type, obj, j);
                            abstractC3732.mo6712();
                            return objMo6023;
                        }
                    }
                }
                C1123.m1410(abstractC3732.mo6730("TODO"));
                return null;
            }
            Object[] objArrCopyOf = new Object[16];
            int i = 0;
            while (!abstractC3732.mo6702()) {
                int i2 = i + 1;
                if (i2 - objArrCopyOf.length > 0) {
                    int length = objArrCopyOf.length;
                    int i3 = length + (length >> 1);
                    if (i3 - i2 < 0) {
                        i3 = i2;
                    }
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                }
                char c = abstractC3732.f9538;
                if (c == '\"') {
                    objMo6744 = abstractC3732.mo6744();
                } else if (c == '+') {
                    objMo6744 = abstractC3732.mo6752();
                } else if (c != 'S') {
                    if (c == '[') {
                        objMo6744 = abstractC3732.mo6685();
                    } else if (c == 'f') {
                        objMo6744 = Boolean.valueOf(abstractC3732.mo6668());
                    } else if (c == 'n') {
                        abstractC3732.mo6762();
                        objMo6744 = null;
                    } else if (c != 't') {
                        if (c != '{') {
                            if (c != '-' && c != '.') {
                                switch (c) {
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                        break;
                                    default:
                                        C1123.m1410(abstractC3732.mo6730(null));
                                        return null;
                                }
                            }
                            objMo6744 = abstractC3732.mo6752();
                        } else {
                            objMo6744 = abstractC3732.mo6700(Object.class);
                        }
                    }
                } else {
                    if (!abstractC3732.mo6707()) {
                        C1123.m1410("Expected Set format but parsing failed: ".concat(abstractC3732.mo6730(null)));
                        return null;
                    }
                    objMo6744 = abstractC3732.mo6700(HashSet.class);
                }
                objArrCopyOf[i] = objMo6744;
                i = i2;
            }
            abstractC3732.mo6705();
            return Arrays.copyOf(objArrCopyOf, i);
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Object mo6029(Collection collection, long j) {
        Object[] objArr = new Object[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return objArr;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo6027(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        AbstractC3732 abstractC37322;
        long j2;
        Object objValueOf;
        if (abstractC3732.mo6743() == -110) {
            abstractC37322 = abstractC3732;
            j2 = j;
            InterfaceC3621 interfaceC3621Mo6724 = abstractC37322.mo6724(f8494, j2, Object[].class);
            if (interfaceC3621Mo6724 != this) {
                return interfaceC3621Mo6724.mo6027(abstractC37322, type, obj, j2);
            }
        } else {
            abstractC37322 = abstractC3732;
            j2 = j;
        }
        int iMo6792 = abstractC37322.mo6792();
        if (iMo6792 == -1) {
            return null;
        }
        Object[] objArr = new Object[iMo6792];
        for (int i = 0; i < iMo6792; i++) {
            byte bMo6743 = abstractC37322.mo6743();
            if (bMo6743 >= 73 && bMo6743 <= 125) {
                objValueOf = abstractC37322.mo6744();
            } else if (bMo6743 == -110) {
                InterfaceC3621 interfaceC3621Mo67242 = abstractC37322.mo6724(0L, j2, Object.class);
                if (interfaceC3621Mo67242 != null) {
                    long j3 = j2;
                    AbstractC3732 abstractC37323 = abstractC37322;
                    objValueOf = interfaceC3621Mo67242.mo6027(abstractC37323, null, null, j3);
                    abstractC37322 = abstractC37323;
                    j2 = j3;
                } else {
                    objValueOf = abstractC37322.mo6684();
                }
            } else if (bMo6743 == -81) {
                abstractC37322.mo6733();
                objValueOf = null;
            } else if (bMo6743 == -79) {
                abstractC37322.mo6733();
                objValueOf = Boolean.TRUE;
            } else if (bMo6743 == -80) {
                abstractC37322.mo6733();
                objValueOf = Boolean.FALSE;
            } else {
                objValueOf = bMo6743 == -66 ? Long.valueOf(abstractC37322.mo6769()) : abstractC37322.mo6684();
            }
            objArr[i] = objValueOf;
        }
        return objArr;
    }
}
