package com.google.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世兰子哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4173 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C4538 f11310;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final AbstractC4542 f11311;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Class f11312;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    static {
        Class<GeneratedMessage> cls;
        Class cls2 = AbstractC4379.f11543;
        AbstractC4542 abstractC4542 = null;
        try {
            cls = GeneratedMessage.class;
            boolean z = GeneratedMessage.alwaysUseFieldBuilders;
        } catch (Throwable unused) {
            cls = null;
        }
        f11312 = cls;
        try {
            Class cls3 = AbstractC4379.f11543;
            if (AbstractC4564.class != 0) {
                abstractC4542 = (AbstractC4542) AbstractC4564.class.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused2) {
        }
        f11311 = abstractC4542;
        f11310 = new C4538();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static void m7906(int i, List list, C4259 c4259) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC4294 abstractC4294 = (AbstractC4294) c4259.f11434;
        int i2 = 0;
        if (!(list instanceof InterfaceC4257)) {
            while (i2 < list.size()) {
                abstractC4294.mo8216(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        InterfaceC4257 interfaceC4257 = (InterfaceC4257) list;
        while (i2 < list.size()) {
            Object objMo8049 = interfaceC4257.mo8049(i2);
            if (objMo8049 instanceof String) {
                abstractC4294.mo8216(i, (String) objMo8049);
            } else {
                abstractC4294.mo8225(i, (ByteString) objMo8049);
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static void m7907(int i, List list, C4259 c4259, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof C4262;
        AbstractC4294 abstractC4294 = (AbstractC4294) c4259.f11434;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    abstractC4294.mo8207(i, (jLongValue >> 63) ^ (jLongValue << 1));
                    i2++;
                }
                return;
            }
            abstractC4294.mo8214(i, 2);
            int iM8200 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM8200 += AbstractC4294.m8200(((Long) list.get(i3)).longValue());
            }
            abstractC4294.mo8204(iM8200);
            while (i2 < list.size()) {
                long jLongValue2 = ((Long) list.get(i2)).longValue();
                abstractC4294.mo8206((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                i2++;
            }
            return;
        }
        C4262 c4262 = (C4262) list;
        if (!z) {
            while (i2 < c4262.f11440) {
                long jM8127 = c4262.m8127(i2);
                abstractC4294.mo8207(i, (jM8127 >> 63) ^ (jM8127 << 1));
                i2++;
            }
            return;
        }
        abstractC4294.mo8214(i, 2);
        int iM82002 = 0;
        for (int i4 = 0; i4 < c4262.f11440; i4++) {
            iM82002 += AbstractC4294.m8200(c4262.m8127(i4));
        }
        abstractC4294.mo8204(iM82002);
        while (i2 < c4262.f11440) {
            long jM81272 = c4262.m8127(i2);
            abstractC4294.mo8206((jM81272 >> 63) ^ (jM81272 << 1));
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static void m7908(int i, List list, C4259 c4259, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof C4445;
        AbstractC4294 abstractC4294 = (AbstractC4294) c4259.f11434;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    abstractC4294.mo8205(i, (iIntValue >> 31) ^ (iIntValue << 1));
                    i2++;
                }
                return;
            }
            abstractC4294.mo8214(i, 2);
            int iM8203 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM8203 += AbstractC4294.m8203(((Integer) list.get(i3)).intValue());
            }
            abstractC4294.mo8204(iM8203);
            while (i2 < list.size()) {
                int iIntValue2 = ((Integer) list.get(i2)).intValue();
                abstractC4294.mo8204((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                i2++;
            }
            return;
        }
        C4445 c4445 = (C4445) list;
        if (!z) {
            while (i2 < c4445.f11597) {
                int iM8373 = c4445.m8373(i2);
                abstractC4294.mo8205(i, (iM8373 >> 31) ^ (iM8373 << 1));
                i2++;
            }
            return;
        }
        abstractC4294.mo8214(i, 2);
        int iM82032 = 0;
        for (int i4 = 0; i4 < c4445.f11597; i4++) {
            iM82032 += AbstractC4294.m8203(c4445.m8373(i4));
        }
        abstractC4294.mo8204(iM82032);
        while (i2 < c4445.f11597) {
            int iM83732 = c4445.m8373(i2);
            abstractC4294.mo8204((iM83732 >> 31) ^ (iM83732 << 1));
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static void m7909(int i, List list, C4259 c4259, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof C4262;
        AbstractC4294 abstractC4294 = (AbstractC4294) c4259.f11434;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC4294.mo8212(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            abstractC4294.mo8214(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                boolean z3 = AbstractC4294.f11474;
                i3 += 8;
            }
            abstractC4294.mo8204(i3);
            while (i2 < list.size()) {
                abstractC4294.mo8211(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        C4262 c4262 = (C4262) list;
        if (!z) {
            while (i2 < c4262.f11440) {
                abstractC4294.mo8212(i, c4262.m8127(i2));
                i2++;
            }
            return;
        }
        abstractC4294.mo8214(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c4262.f11440; i6++) {
            c4262.m8127(i6);
            boolean z4 = AbstractC4294.f11474;
            i5 += 8;
        }
        abstractC4294.mo8204(i5);
        while (i2 < c4262.f11440) {
            abstractC4294.mo8211(c4262.m8127(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static void m7910(int i, List list, C4259 c4259, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof C4445;
        AbstractC4294 abstractC4294 = (AbstractC4294) c4259.f11434;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC4294.mo8224(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abstractC4294.mo8214(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                boolean z3 = AbstractC4294.f11474;
                i3 += 4;
            }
            abstractC4294.mo8204(i3);
            while (i2 < list.size()) {
                abstractC4294.mo8213(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C4445 c4445 = (C4445) list;
        if (!z) {
            while (i2 < c4445.f11597) {
                abstractC4294.mo8224(i, c4445.m8373(i2));
                i2++;
            }
            return;
        }
        abstractC4294.mo8214(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c4445.f11597; i6++) {
            c4445.m8373(i6);
            boolean z4 = AbstractC4294.f11474;
            i5 += 4;
        }
        abstractC4294.mo8204(i5);
        while (i2 < c4445.f11597) {
            abstractC4294.mo8213(c4445.m8373(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static void m7911(int i, List list, C4259 c4259, InterfaceC4177 interfaceC4177) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            c4259.m8109(i, list.get(i2), interfaceC4177);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static void m7912(int i, List list, C4259 c4259, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof C4262;
        AbstractC4294 abstractC4294 = (AbstractC4294) c4259.f11434;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC4294.mo8207(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            abstractC4294.mo8214(i, 2);
            int iM8197 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM8197 += AbstractC4294.m8197(((Long) list.get(i3)).longValue());
            }
            abstractC4294.mo8204(iM8197);
            while (i2 < list.size()) {
                abstractC4294.mo8206(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        C4262 c4262 = (C4262) list;
        if (!z) {
            while (i2 < c4262.f11440) {
                abstractC4294.mo8207(i, c4262.m8127(i2));
                i2++;
            }
            return;
        }
        abstractC4294.mo8214(i, 2);
        int iM81972 = 0;
        for (int i4 = 0; i4 < c4262.f11440; i4++) {
            iM81972 += AbstractC4294.m8197(c4262.m8127(i4));
        }
        abstractC4294.mo8204(iM81972);
        while (i2 < c4262.f11440) {
            abstractC4294.mo8206(c4262.m8127(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static void m7913(int i, List list, C4259 c4259, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof C4445;
        AbstractC4294 abstractC4294 = (AbstractC4294) c4259.f11434;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC4294.mo8205(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abstractC4294.mo8214(i, 2);
            int iM8194 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM8194 += AbstractC4294.m8194(((Integer) list.get(i3)).intValue());
            }
            abstractC4294.mo8204(iM8194);
            while (i2 < list.size()) {
                abstractC4294.mo8204(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C4445 c4445 = (C4445) list;
        if (!z) {
            while (i2 < c4445.f11597) {
                abstractC4294.mo8205(i, c4445.m8373(i2));
                i2++;
            }
            return;
        }
        abstractC4294.mo8214(i, 2);
        int iM81942 = 0;
        for (int i4 = 0; i4 < c4445.f11597; i4++) {
            iM81942 += AbstractC4294.m8194(c4445.m8373(i4));
        }
        abstractC4294.mo8204(iM81942);
        while (i2 < c4445.f11597) {
            abstractC4294.mo8204(c4445.m8373(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static int m7914(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C4445)) {
            int iM8203 = 0;
            while (i < size) {
                iM8203 += AbstractC4294.m8203(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM8203;
        }
        C4445 c4445 = (C4445) list;
        int iM82032 = 0;
        while (i < size) {
            iM82032 += AbstractC4294.m8203(c4445.m8373(i));
            i++;
        }
        return iM82032;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static int m7915(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C4262)) {
            int iM8197 = 0;
            while (i < size) {
                iM8197 += AbstractC4294.m8197(((Long) list.get(i)).longValue());
                i++;
            }
            return iM8197;
        }
        C4262 c4262 = (C4262) list;
        int iM81972 = 0;
        while (i < size) {
            iM81972 += AbstractC4294.m8197(c4262.m8127(i));
            i++;
        }
        return iM81972;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static int m7916(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C4445)) {
            int iM8197 = 0;
            while (i < size) {
                iM8197 += AbstractC4294.m8197(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM8197;
        }
        C4445 c4445 = (C4445) list;
        int iM81972 = 0;
        while (i < size) {
            iM81972 += AbstractC4294.m8197(c4445.m8373(i));
            i++;
        }
        return iM81972;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int m7917(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC4294.m8201(i) + 8) * size;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static int m7918(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC4294.m8201(i) + 4) * size;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static int m7919(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C4445)) {
            int iM8197 = 0;
            while (i < size) {
                iM8197 += AbstractC4294.m8197(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM8197;
        }
        C4445 c4445 = (C4445) list;
        int iM81972 = 0;
        while (i < size) {
            iM81972 += AbstractC4294.m8197(c4445.m8373(i));
            i++;
        }
        return iM81972;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static void m7920(int i, List list, C4259 c4259, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c4259.m8115(i, list, z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static void m7921(int i, List list, C4259 c4259, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c4259.m8112(i, list, z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static void m7922(int i, List list, C4259 c4259, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof C4445;
        AbstractC4294 abstractC4294 = (AbstractC4294) c4259.f11434;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC4294.mo8210(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abstractC4294.mo8214(i, 2);
            int iM8197 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM8197 += AbstractC4294.m8197(((Integer) list.get(i3)).intValue());
            }
            abstractC4294.mo8204(iM8197);
            while (i2 < list.size()) {
                abstractC4294.mo8209(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C4445 c4445 = (C4445) list;
        if (!z) {
            while (i2 < c4445.f11597) {
                abstractC4294.mo8210(i, c4445.m8373(i2));
                i2++;
            }
            return;
        }
        abstractC4294.mo8214(i, 2);
        int iM81972 = 0;
        for (int i4 = 0; i4 < c4445.f11597; i4++) {
            iM81972 += AbstractC4294.m8197(c4445.m8373(i4));
        }
        abstractC4294.mo8204(iM81972);
        while (i2 < c4445.f11597) {
            abstractC4294.mo8209(c4445.m8373(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static void m7923(int i, List list, C4259 c4259, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c4259.m8105(i, list, z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static void m7924(int i, List list, C4259 c4259, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof C4471;
        AbstractC4294 abstractC4294 = (AbstractC4294) c4259.f11434;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    float fFloatValue = ((Float) list.get(i2)).floatValue();
                    abstractC4294.getClass();
                    abstractC4294.mo8224(i, Float.floatToRawIntBits(fFloatValue));
                    i2++;
                }
                return;
            }
            abstractC4294.mo8214(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).getClass();
                boolean z3 = AbstractC4294.f11474;
                i3 += 4;
            }
            abstractC4294.mo8204(i3);
            while (i2 < list.size()) {
                abstractC4294.mo8213(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        C4471 c4471 = (C4471) list;
        if (!z) {
            while (i2 < c4471.f11657) {
                c4471.m8400(i2);
                float f = c4471.f11656[i2];
                abstractC4294.getClass();
                abstractC4294.mo8224(i, Float.floatToRawIntBits(f));
                i2++;
            }
            return;
        }
        abstractC4294.mo8214(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c4471.f11657; i6++) {
            c4471.m8400(i6);
            float f2 = c4471.f11656[i6];
            boolean z4 = AbstractC4294.f11474;
            i5 += 4;
        }
        abstractC4294.mo8204(i5);
        while (i2 < c4471.f11657) {
            c4471.m8400(i2);
            abstractC4294.mo8213(Float.floatToRawIntBits(c4471.f11656[i2]));
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static void m7925(int i, List list, C4259 c4259, InterfaceC4177 interfaceC4177) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            c4259.m8113(i, list.get(i2), interfaceC4177);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static Object m7926(Object obj, int i, int i2, Object obj2, AbstractC4542 abstractC4542) {
        if (obj2 == null) {
            obj2 = abstractC4542.mo8509(obj);
        }
        ((C4538) abstractC4542).getClass();
        ((C4539) obj2).m8511(i << 3, Long.valueOf(i2));
        return obj2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static boolean m7927(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static void m7928(int i, List list, C4259 c4259, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof C4423;
        AbstractC4294 abstractC4294 = (AbstractC4294) c4259.f11434;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC4294.m8223(i, ((Double) list.get(i2)).doubleValue());
                    i2++;
                }
                return;
            }
            abstractC4294.mo8214(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).getClass();
                boolean z3 = AbstractC4294.f11474;
                i3 += 8;
            }
            abstractC4294.mo8204(i3);
            while (i2 < list.size()) {
                abstractC4294.mo8211(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        C4423 c4423 = (C4423) list;
        if (!z) {
            while (i2 < c4423.f11558) {
                c4423.m8353(i2);
                abstractC4294.m8223(i, c4423.f11557[i2]);
                i2++;
            }
            return;
        }
        abstractC4294.mo8214(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c4423.f11558; i6++) {
            c4423.m8353(i6);
            double d = c4423.f11557[i6];
            boolean z4 = AbstractC4294.f11474;
            i5 += 8;
        }
        abstractC4294.mo8204(i5);
        while (i2 < c4423.f11558) {
            c4423.m8353(i2);
            abstractC4294.mo8211(Double.doubleToRawLongBits(c4423.f11557[i2]));
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static void m7929(int i, List list, C4259 c4259, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof C4445;
        AbstractC4294 abstractC4294 = (AbstractC4294) c4259.f11434;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC4294.mo8210(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abstractC4294.mo8214(i, 2);
            int iM8197 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM8197 += AbstractC4294.m8197(((Integer) list.get(i3)).intValue());
            }
            abstractC4294.mo8204(iM8197);
            while (i2 < list.size()) {
                abstractC4294.mo8209(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C4445 c4445 = (C4445) list;
        if (!z) {
            while (i2 < c4445.f11597) {
                abstractC4294.mo8210(i, c4445.m8373(i2));
                i2++;
            }
            return;
        }
        abstractC4294.mo8214(i, 2);
        int iM81972 = 0;
        for (int i4 = 0; i4 < c4445.f11597; i4++) {
            iM81972 += AbstractC4294.m8197(c4445.m8373(i4));
        }
        abstractC4294.mo8204(iM81972);
        while (i2 < c4445.f11597) {
            abstractC4294.mo8209(c4445.m8373(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static void m7930(int i, List list, C4259 c4259, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof C4367;
        AbstractC4294 abstractC4294 = (AbstractC4294) c4259.f11434;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC4294.mo8222(i, ((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            abstractC4294.mo8214(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).getClass();
                boolean z3 = AbstractC4294.f11474;
                i3++;
            }
            abstractC4294.mo8204(i3);
            while (i2 < list.size()) {
                abstractC4294.mo8228(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        C4367 c4367 = (C4367) list;
        if (!z) {
            while (i2 < c4367.f11525) {
                c4367.m8319(i2);
                abstractC4294.mo8222(i, c4367.f11524[i2]);
                i2++;
            }
            return;
        }
        abstractC4294.mo8214(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c4367.f11525; i6++) {
            c4367.m8319(i6);
            boolean z4 = c4367.f11524[i6];
            boolean z5 = AbstractC4294.f11474;
            i5++;
        }
        abstractC4294.mo8204(i5);
        while (i2 < c4367.f11525) {
            c4367.m8319(i2);
            abstractC4294.mo8228(c4367.f11524[i2] ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static void m7931(int i, List list, C4259 c4259) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((AbstractC4294) c4259.f11434).mo8225(i, (ByteString) list.get(i2));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static int m7932(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C4445)) {
            int iM8194 = 0;
            while (i < size) {
                iM8194 += AbstractC4294.m8194(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM8194;
        }
        C4445 c4445 = (C4445) list;
        int iM81942 = 0;
        while (i < size) {
            iM81942 += AbstractC4294.m8194(c4445.m8373(i));
            i++;
        }
        return iM81942;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static int m7933(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C4262)) {
            int iM8200 = 0;
            while (i < size) {
                iM8200 += AbstractC4294.m8200(((Long) list.get(i)).longValue());
                i++;
            }
            return iM8200;
        }
        C4262 c4262 = (C4262) list;
        int iM82002 = 0;
        while (i < size) {
            iM82002 += AbstractC4294.m8200(c4262.m8127(i));
            i++;
        }
        return iM82002;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static Object m7934(Object obj, int i, List list, InterfaceC4229 interfaceC4229, Object obj2, AbstractC4542 abstractC4542) {
        if (interfaceC4229 == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!interfaceC4229.m8057(iIntValue)) {
                    obj2 = m7926(obj, i, iIntValue, obj2, abstractC4542);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) list.get(i3);
            int iIntValue2 = num.intValue();
            if (interfaceC4229.m8057(iIntValue2)) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                obj2 = m7926(obj, i, iIntValue2, obj2, abstractC4542);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return obj2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static void m7935(AbstractC4542 abstractC4542, Object obj, Object obj2) {
        ((C4538) abstractC4542).getClass();
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        C4539 c4539M8510 = generatedMessageLite.unknownFields;
        C4539 c4539 = ((GeneratedMessageLite) obj2).unknownFields;
        C4539 c45392 = C4539.f11861;
        if (!c45392.equals(c4539)) {
            if (c45392.equals(c4539M8510)) {
                c4539M8510 = C4539.m8510(c4539M8510, c4539);
            } else {
                c4539M8510.getClass();
                if (!c4539.equals(c45392)) {
                    c4539M8510.m8515();
                    int i = c4539M8510.f11866 + c4539.f11866;
                    c4539M8510.m8514(i);
                    System.arraycopy(c4539.f11865, 0, c4539M8510.f11865, c4539M8510.f11866, c4539.f11866);
                    System.arraycopy(c4539.f11864, 0, c4539M8510.f11864, c4539M8510.f11866, c4539.f11866);
                    c4539M8510.f11866 = i;
                }
            }
        }
        generatedMessageLite.unknownFields = c4539M8510;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static int m7936(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C4262)) {
            int iM8197 = 0;
            while (i < size) {
                iM8197 += AbstractC4294.m8197(((Long) list.get(i)).longValue());
                i++;
            }
            return iM8197;
        }
        C4262 c4262 = (C4262) list;
        int iM81972 = 0;
        while (i < size) {
            iM81972 += AbstractC4294.m8197(c4262.m8127(i));
            i++;
        }
        return iM81972;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static Object m7937(Object obj, int i, AbstractList abstractList, InterfaceC4230 interfaceC4230, Object obj2, AbstractC4542 abstractC4542) {
        if (interfaceC4230 == null) {
            return obj2;
        }
        int size = abstractList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) abstractList.get(i3);
            int iIntValue = num.intValue();
            if (interfaceC4230.mo7905(iIntValue) != null) {
                if (i3 != i2) {
                    abstractList.set(i2, num);
                }
                i2++;
            } else {
                obj2 = m7926(obj, i, iIntValue, obj2, abstractC4542);
            }
        }
        if (i2 != size) {
            abstractList.subList(i2, size).clear();
        }
        return obj2;
    }
}
