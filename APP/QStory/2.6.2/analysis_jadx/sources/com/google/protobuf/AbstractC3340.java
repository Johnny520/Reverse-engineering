package com.google.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世兰子哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3340 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C3705 f10960;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final AbstractC3709 f10961;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Class f10962;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    static {
        Class<GeneratedMessage> cls;
        Class cls2 = AbstractC3546.f11193;
        AbstractC3709 abstractC3709 = null;
        try {
            cls = GeneratedMessage.class;
            boolean z = GeneratedMessage.alwaysUseFieldBuilders;
        } catch (Throwable unused) {
            cls = null;
        }
        f10962 = cls;
        try {
            Class cls3 = AbstractC3546.f11193;
            if (AbstractC3731.class != 0) {
                abstractC3709 = (AbstractC3709) AbstractC3731.class.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused2) {
        }
        f10961 = abstractC3709;
        f10960 = new C3705();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static void m7360(int i, List list, C3426 c3426) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC3461 abstractC3461 = (AbstractC3461) c3426.f11084;
        int i2 = 0;
        if (!(list instanceof InterfaceC3424)) {
            while (i2 < list.size()) {
                abstractC3461.mo7670(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        InterfaceC3424 interfaceC3424 = (InterfaceC3424) list;
        while (i2 < list.size()) {
            Object objMo7503 = interfaceC3424.mo7503(i2);
            if (objMo7503 instanceof String) {
                abstractC3461.mo7670(i, (String) objMo7503);
            } else {
                abstractC3461.mo7679(i, (ByteString) objMo7503);
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static void m7361(int i, List list, C3426 c3426, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof C3429;
        AbstractC3461 abstractC3461 = (AbstractC3461) c3426.f11084;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    abstractC3461.mo7661(i, (jLongValue >> 63) ^ (jLongValue << 1));
                    i2++;
                }
                return;
            }
            abstractC3461.mo7668(i, 2);
            int iM7654 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM7654 += AbstractC3461.m7654(((Long) list.get(i3)).longValue());
            }
            abstractC3461.mo7658(iM7654);
            while (i2 < list.size()) {
                long jLongValue2 = ((Long) list.get(i2)).longValue();
                abstractC3461.mo7660((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                i2++;
            }
            return;
        }
        C3429 c3429 = (C3429) list;
        if (!z) {
            while (i2 < c3429.f11090) {
                long jM7581 = c3429.m7581(i2);
                abstractC3461.mo7661(i, (jM7581 >> 63) ^ (jM7581 << 1));
                i2++;
            }
            return;
        }
        abstractC3461.mo7668(i, 2);
        int iM76542 = 0;
        for (int i4 = 0; i4 < c3429.f11090; i4++) {
            iM76542 += AbstractC3461.m7654(c3429.m7581(i4));
        }
        abstractC3461.mo7658(iM76542);
        while (i2 < c3429.f11090) {
            long jM75812 = c3429.m7581(i2);
            abstractC3461.mo7660((jM75812 >> 63) ^ (jM75812 << 1));
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static void m7362(int i, List list, C3426 c3426, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof C3612;
        AbstractC3461 abstractC3461 = (AbstractC3461) c3426.f11084;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    abstractC3461.mo7659(i, (iIntValue >> 31) ^ (iIntValue << 1));
                    i2++;
                }
                return;
            }
            abstractC3461.mo7668(i, 2);
            int iM7657 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM7657 += AbstractC3461.m7657(((Integer) list.get(i3)).intValue());
            }
            abstractC3461.mo7658(iM7657);
            while (i2 < list.size()) {
                int iIntValue2 = ((Integer) list.get(i2)).intValue();
                abstractC3461.mo7658((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                i2++;
            }
            return;
        }
        C3612 c3612 = (C3612) list;
        if (!z) {
            while (i2 < c3612.f11247) {
                int iM7827 = c3612.m7827(i2);
                abstractC3461.mo7659(i, (iM7827 >> 31) ^ (iM7827 << 1));
                i2++;
            }
            return;
        }
        abstractC3461.mo7668(i, 2);
        int iM76572 = 0;
        for (int i4 = 0; i4 < c3612.f11247; i4++) {
            iM76572 += AbstractC3461.m7657(c3612.m7827(i4));
        }
        abstractC3461.mo7658(iM76572);
        while (i2 < c3612.f11247) {
            int iM78272 = c3612.m7827(i2);
            abstractC3461.mo7658((iM78272 >> 31) ^ (iM78272 << 1));
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static void m7363(int i, List list, C3426 c3426, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof C3429;
        AbstractC3461 abstractC3461 = (AbstractC3461) c3426.f11084;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC3461.mo7666(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            abstractC3461.mo7668(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                boolean z3 = AbstractC3461.f11124;
                i3 += 8;
            }
            abstractC3461.mo7658(i3);
            while (i2 < list.size()) {
                abstractC3461.mo7665(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        C3429 c3429 = (C3429) list;
        if (!z) {
            while (i2 < c3429.f11090) {
                abstractC3461.mo7666(i, c3429.m7581(i2));
                i2++;
            }
            return;
        }
        abstractC3461.mo7668(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c3429.f11090; i6++) {
            c3429.m7581(i6);
            boolean z4 = AbstractC3461.f11124;
            i5 += 8;
        }
        abstractC3461.mo7658(i5);
        while (i2 < c3429.f11090) {
            abstractC3461.mo7665(c3429.m7581(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static void m7364(int i, List list, C3426 c3426, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof C3612;
        AbstractC3461 abstractC3461 = (AbstractC3461) c3426.f11084;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC3461.mo7678(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abstractC3461.mo7668(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                boolean z3 = AbstractC3461.f11124;
                i3 += 4;
            }
            abstractC3461.mo7658(i3);
            while (i2 < list.size()) {
                abstractC3461.mo7667(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C3612 c3612 = (C3612) list;
        if (!z) {
            while (i2 < c3612.f11247) {
                abstractC3461.mo7678(i, c3612.m7827(i2));
                i2++;
            }
            return;
        }
        abstractC3461.mo7668(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c3612.f11247; i6++) {
            c3612.m7827(i6);
            boolean z4 = AbstractC3461.f11124;
            i5 += 4;
        }
        abstractC3461.mo7658(i5);
        while (i2 < c3612.f11247) {
            abstractC3461.mo7667(c3612.m7827(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static void m7365(int i, List list, C3426 c3426, InterfaceC3344 interfaceC3344) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            c3426.m7563(i, list.get(i2), interfaceC3344);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static void m7366(int i, List list, C3426 c3426, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof C3429;
        AbstractC3461 abstractC3461 = (AbstractC3461) c3426.f11084;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC3461.mo7661(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            abstractC3461.mo7668(i, 2);
            int iM7651 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM7651 += AbstractC3461.m7651(((Long) list.get(i3)).longValue());
            }
            abstractC3461.mo7658(iM7651);
            while (i2 < list.size()) {
                abstractC3461.mo7660(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        C3429 c3429 = (C3429) list;
        if (!z) {
            while (i2 < c3429.f11090) {
                abstractC3461.mo7661(i, c3429.m7581(i2));
                i2++;
            }
            return;
        }
        abstractC3461.mo7668(i, 2);
        int iM76512 = 0;
        for (int i4 = 0; i4 < c3429.f11090; i4++) {
            iM76512 += AbstractC3461.m7651(c3429.m7581(i4));
        }
        abstractC3461.mo7658(iM76512);
        while (i2 < c3429.f11090) {
            abstractC3461.mo7660(c3429.m7581(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static void m7367(int i, List list, C3426 c3426, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof C3612;
        AbstractC3461 abstractC3461 = (AbstractC3461) c3426.f11084;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC3461.mo7659(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abstractC3461.mo7668(i, 2);
            int iM7648 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM7648 += AbstractC3461.m7648(((Integer) list.get(i3)).intValue());
            }
            abstractC3461.mo7658(iM7648);
            while (i2 < list.size()) {
                abstractC3461.mo7658(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C3612 c3612 = (C3612) list;
        if (!z) {
            while (i2 < c3612.f11247) {
                abstractC3461.mo7659(i, c3612.m7827(i2));
                i2++;
            }
            return;
        }
        abstractC3461.mo7668(i, 2);
        int iM76482 = 0;
        for (int i4 = 0; i4 < c3612.f11247; i4++) {
            iM76482 += AbstractC3461.m7648(c3612.m7827(i4));
        }
        abstractC3461.mo7658(iM76482);
        while (i2 < c3612.f11247) {
            abstractC3461.mo7658(c3612.m7827(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static int m7368(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C3612)) {
            int iM7657 = 0;
            while (i < size) {
                iM7657 += AbstractC3461.m7657(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM7657;
        }
        C3612 c3612 = (C3612) list;
        int iM76572 = 0;
        while (i < size) {
            iM76572 += AbstractC3461.m7657(c3612.m7827(i));
            i++;
        }
        return iM76572;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static int m7369(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C3429)) {
            int iM7651 = 0;
            while (i < size) {
                iM7651 += AbstractC3461.m7651(((Long) list.get(i)).longValue());
                i++;
            }
            return iM7651;
        }
        C3429 c3429 = (C3429) list;
        int iM76512 = 0;
        while (i < size) {
            iM76512 += AbstractC3461.m7651(c3429.m7581(i));
            i++;
        }
        return iM76512;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static int m7370(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C3612)) {
            int iM7651 = 0;
            while (i < size) {
                iM7651 += AbstractC3461.m7651(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM7651;
        }
        C3612 c3612 = (C3612) list;
        int iM76512 = 0;
        while (i < size) {
            iM76512 += AbstractC3461.m7651(c3612.m7827(i));
            i++;
        }
        return iM76512;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int m7371(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC3461.m7655(i) + 8) * size;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static int m7372(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC3461.m7655(i) + 4) * size;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static int m7373(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C3612)) {
            int iM7651 = 0;
            while (i < size) {
                iM7651 += AbstractC3461.m7651(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM7651;
        }
        C3612 c3612 = (C3612) list;
        int iM76512 = 0;
        while (i < size) {
            iM76512 += AbstractC3461.m7651(c3612.m7827(i));
            i++;
        }
        return iM76512;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static void m7374(int i, List list, C3426 c3426, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c3426.m7569(i, list, z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static void m7375(int i, List list, C3426 c3426, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c3426.m7566(i, list, z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static void m7376(int i, List list, C3426 c3426, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof C3612;
        AbstractC3461 abstractC3461 = (AbstractC3461) c3426.f11084;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC3461.mo7664(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abstractC3461.mo7668(i, 2);
            int iM7651 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM7651 += AbstractC3461.m7651(((Integer) list.get(i3)).intValue());
            }
            abstractC3461.mo7658(iM7651);
            while (i2 < list.size()) {
                abstractC3461.mo7663(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C3612 c3612 = (C3612) list;
        if (!z) {
            while (i2 < c3612.f11247) {
                abstractC3461.mo7664(i, c3612.m7827(i2));
                i2++;
            }
            return;
        }
        abstractC3461.mo7668(i, 2);
        int iM76512 = 0;
        for (int i4 = 0; i4 < c3612.f11247; i4++) {
            iM76512 += AbstractC3461.m7651(c3612.m7827(i4));
        }
        abstractC3461.mo7658(iM76512);
        while (i2 < c3612.f11247) {
            abstractC3461.mo7663(c3612.m7827(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static void m7377(int i, List list, C3426 c3426, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c3426.m7559(i, list, z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static void m7378(int i, List list, C3426 c3426, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof C3638;
        AbstractC3461 abstractC3461 = (AbstractC3461) c3426.f11084;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    float fFloatValue = ((Float) list.get(i2)).floatValue();
                    abstractC3461.getClass();
                    abstractC3461.mo7678(i, Float.floatToRawIntBits(fFloatValue));
                    i2++;
                }
                return;
            }
            abstractC3461.mo7668(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).getClass();
                boolean z3 = AbstractC3461.f11124;
                i3 += 4;
            }
            abstractC3461.mo7658(i3);
            while (i2 < list.size()) {
                abstractC3461.mo7667(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        C3638 c3638 = (C3638) list;
        if (!z) {
            while (i2 < c3638.f11307) {
                c3638.m7854(i2);
                float f = c3638.f11306[i2];
                abstractC3461.getClass();
                abstractC3461.mo7678(i, Float.floatToRawIntBits(f));
                i2++;
            }
            return;
        }
        abstractC3461.mo7668(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c3638.f11307; i6++) {
            c3638.m7854(i6);
            float f2 = c3638.f11306[i6];
            boolean z4 = AbstractC3461.f11124;
            i5 += 4;
        }
        abstractC3461.mo7658(i5);
        while (i2 < c3638.f11307) {
            c3638.m7854(i2);
            abstractC3461.mo7667(Float.floatToRawIntBits(c3638.f11306[i2]));
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static void m7379(int i, List list, C3426 c3426, InterfaceC3344 interfaceC3344) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            c3426.m7567(i, list.get(i2), interfaceC3344);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static Object m7380(Object obj, int i, int i2, Object obj2, AbstractC3709 abstractC3709) {
        if (obj2 == null) {
            obj2 = abstractC3709.mo7963(obj);
        }
        ((C3705) abstractC3709).getClass();
        ((C3706) obj2).m7965(i << 3, Long.valueOf(i2));
        return obj2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static boolean m7381(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static void m7382(int i, List list, C3426 c3426, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof C3590;
        AbstractC3461 abstractC3461 = (AbstractC3461) c3426.f11084;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC3461.m7677(i, ((Double) list.get(i2)).doubleValue());
                    i2++;
                }
                return;
            }
            abstractC3461.mo7668(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).getClass();
                boolean z3 = AbstractC3461.f11124;
                i3 += 8;
            }
            abstractC3461.mo7658(i3);
            while (i2 < list.size()) {
                abstractC3461.mo7665(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        C3590 c3590 = (C3590) list;
        if (!z) {
            while (i2 < c3590.f11208) {
                c3590.m7807(i2);
                abstractC3461.m7677(i, c3590.f11207[i2]);
                i2++;
            }
            return;
        }
        abstractC3461.mo7668(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c3590.f11208; i6++) {
            c3590.m7807(i6);
            double d = c3590.f11207[i6];
            boolean z4 = AbstractC3461.f11124;
            i5 += 8;
        }
        abstractC3461.mo7658(i5);
        while (i2 < c3590.f11208) {
            c3590.m7807(i2);
            abstractC3461.mo7665(Double.doubleToRawLongBits(c3590.f11207[i2]));
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static void m7383(int i, List list, C3426 c3426, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof C3612;
        AbstractC3461 abstractC3461 = (AbstractC3461) c3426.f11084;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC3461.mo7664(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abstractC3461.mo7668(i, 2);
            int iM7651 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM7651 += AbstractC3461.m7651(((Integer) list.get(i3)).intValue());
            }
            abstractC3461.mo7658(iM7651);
            while (i2 < list.size()) {
                abstractC3461.mo7663(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C3612 c3612 = (C3612) list;
        if (!z) {
            while (i2 < c3612.f11247) {
                abstractC3461.mo7664(i, c3612.m7827(i2));
                i2++;
            }
            return;
        }
        abstractC3461.mo7668(i, 2);
        int iM76512 = 0;
        for (int i4 = 0; i4 < c3612.f11247; i4++) {
            iM76512 += AbstractC3461.m7651(c3612.m7827(i4));
        }
        abstractC3461.mo7658(iM76512);
        while (i2 < c3612.f11247) {
            abstractC3461.mo7663(c3612.m7827(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static void m7384(int i, List list, C3426 c3426, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof C3534;
        AbstractC3461 abstractC3461 = (AbstractC3461) c3426.f11084;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC3461.mo7676(i, ((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            abstractC3461.mo7668(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).getClass();
                boolean z3 = AbstractC3461.f11124;
                i3++;
            }
            abstractC3461.mo7658(i3);
            while (i2 < list.size()) {
                abstractC3461.mo7682(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        C3534 c3534 = (C3534) list;
        if (!z) {
            while (i2 < c3534.f11175) {
                c3534.m7773(i2);
                abstractC3461.mo7676(i, c3534.f11174[i2]);
                i2++;
            }
            return;
        }
        abstractC3461.mo7668(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c3534.f11175; i6++) {
            c3534.m7773(i6);
            boolean z4 = c3534.f11174[i6];
            boolean z5 = AbstractC3461.f11124;
            i5++;
        }
        abstractC3461.mo7658(i5);
        while (i2 < c3534.f11175) {
            c3534.m7773(i2);
            abstractC3461.mo7682(c3534.f11174[i2] ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static void m7385(int i, List list, C3426 c3426) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((AbstractC3461) c3426.f11084).mo7679(i, (ByteString) list.get(i2));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static int m7386(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C3612)) {
            int iM7648 = 0;
            while (i < size) {
                iM7648 += AbstractC3461.m7648(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM7648;
        }
        C3612 c3612 = (C3612) list;
        int iM76482 = 0;
        while (i < size) {
            iM76482 += AbstractC3461.m7648(c3612.m7827(i));
            i++;
        }
        return iM76482;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static int m7387(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C3429)) {
            int iM7654 = 0;
            while (i < size) {
                iM7654 += AbstractC3461.m7654(((Long) list.get(i)).longValue());
                i++;
            }
            return iM7654;
        }
        C3429 c3429 = (C3429) list;
        int iM76542 = 0;
        while (i < size) {
            iM76542 += AbstractC3461.m7654(c3429.m7581(i));
            i++;
        }
        return iM76542;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static Object m7388(Object obj, int i, List list, InterfaceC3396 interfaceC3396, Object obj2, AbstractC3709 abstractC3709) {
        if (interfaceC3396 == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!interfaceC3396.m7511(iIntValue)) {
                    obj2 = m7380(obj, i, iIntValue, obj2, abstractC3709);
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
            if (interfaceC3396.m7511(iIntValue2)) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                obj2 = m7380(obj, i, iIntValue2, obj2, abstractC3709);
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
    public static void m7389(AbstractC3709 abstractC3709, Object obj, Object obj2) {
        ((C3705) abstractC3709).getClass();
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        C3706 c3706M7964 = generatedMessageLite.unknownFields;
        C3706 c3706 = ((GeneratedMessageLite) obj2).unknownFields;
        C3706 c37062 = C3706.f11511;
        if (!c37062.equals(c3706)) {
            if (c37062.equals(c3706M7964)) {
                c3706M7964 = C3706.m7964(c3706M7964, c3706);
            } else {
                c3706M7964.getClass();
                if (!c3706.equals(c37062)) {
                    c3706M7964.m7969();
                    int i = c3706M7964.f11516 + c3706.f11516;
                    c3706M7964.m7968(i);
                    System.arraycopy(c3706.f11515, 0, c3706M7964.f11515, c3706M7964.f11516, c3706.f11516);
                    System.arraycopy(c3706.f11514, 0, c3706M7964.f11514, c3706M7964.f11516, c3706.f11516);
                    c3706M7964.f11516 = i;
                }
            }
        }
        generatedMessageLite.unknownFields = c3706M7964;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static int m7390(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C3429)) {
            int iM7651 = 0;
            while (i < size) {
                iM7651 += AbstractC3461.m7651(((Long) list.get(i)).longValue());
                i++;
            }
            return iM7651;
        }
        C3429 c3429 = (C3429) list;
        int iM76512 = 0;
        while (i < size) {
            iM76512 += AbstractC3461.m7651(c3429.m7581(i));
            i++;
        }
        return iM76512;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static Object m7391(Object obj, int i, AbstractList abstractList, InterfaceC3397 interfaceC3397, Object obj2, AbstractC3709 abstractC3709) {
        if (interfaceC3397 == null) {
            return obj2;
        }
        int size = abstractList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) abstractList.get(i3);
            int iIntValue = num.intValue();
            if (interfaceC3397.mo7359(iIntValue) != null) {
                if (i3 != i2) {
                    abstractList.set(i2, num);
                }
                i2++;
            } else {
                obj2 = m7380(obj, i, iIntValue, obj2, abstractC3709);
            }
        }
        if (i2 != size) {
            abstractList.subList(i2, size).clear();
        }
        return obj2;
    }
}
