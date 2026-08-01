package com.google.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世兰子哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3341 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C3706 f10965;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final AbstractC3710 f10966;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Class f10967;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    static {
        Class<GeneratedMessage> cls;
        Class cls2 = AbstractC3547.f11198;
        AbstractC3710 abstractC3710 = null;
        try {
            cls = GeneratedMessage.class;
            boolean z = GeneratedMessage.alwaysUseFieldBuilders;
        } catch (Throwable unused) {
            cls = null;
        }
        f10967 = cls;
        try {
            Class cls3 = AbstractC3547.f11198;
            if (AbstractC3732.class != 0) {
                abstractC3710 = (AbstractC3710) AbstractC3732.class.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused2) {
        }
        f10966 = abstractC3710;
        f10965 = new C3706();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static void m7347(int i, List list, C3427 c3427) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC3462 abstractC3462 = (AbstractC3462) c3427.f11089;
        int i2 = 0;
        if (!(list instanceof InterfaceC3425)) {
            while (i2 < list.size()) {
                abstractC3462.mo7657(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        InterfaceC3425 interfaceC3425 = (InterfaceC3425) list;
        while (i2 < list.size()) {
            Object objMo7490 = interfaceC3425.mo7490(i2);
            if (objMo7490 instanceof String) {
                abstractC3462.mo7657(i, (String) objMo7490);
            } else {
                abstractC3462.mo7666(i, (ByteString) objMo7490);
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static void m7348(int i, List list, C3427 c3427, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof C3430;
        AbstractC3462 abstractC3462 = (AbstractC3462) c3427.f11089;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    abstractC3462.mo7648(i, (jLongValue >> 63) ^ (jLongValue << 1));
                    i2++;
                }
                return;
            }
            abstractC3462.mo7655(i, 2);
            int iM7641 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM7641 += AbstractC3462.m7641(((Long) list.get(i3)).longValue());
            }
            abstractC3462.mo7645(iM7641);
            while (i2 < list.size()) {
                long jLongValue2 = ((Long) list.get(i2)).longValue();
                abstractC3462.mo7647((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                i2++;
            }
            return;
        }
        C3430 c3430 = (C3430) list;
        if (!z) {
            while (i2 < c3430.f11095) {
                long jM7568 = c3430.m7568(i2);
                abstractC3462.mo7648(i, (jM7568 >> 63) ^ (jM7568 << 1));
                i2++;
            }
            return;
        }
        abstractC3462.mo7655(i, 2);
        int iM76412 = 0;
        for (int i4 = 0; i4 < c3430.f11095; i4++) {
            iM76412 += AbstractC3462.m7641(c3430.m7568(i4));
        }
        abstractC3462.mo7645(iM76412);
        while (i2 < c3430.f11095) {
            long jM75682 = c3430.m7568(i2);
            abstractC3462.mo7647((jM75682 >> 63) ^ (jM75682 << 1));
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static void m7349(int i, List list, C3427 c3427, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof C3613;
        AbstractC3462 abstractC3462 = (AbstractC3462) c3427.f11089;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    abstractC3462.mo7646(i, (iIntValue >> 31) ^ (iIntValue << 1));
                    i2++;
                }
                return;
            }
            abstractC3462.mo7655(i, 2);
            int iM7644 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM7644 += AbstractC3462.m7644(((Integer) list.get(i3)).intValue());
            }
            abstractC3462.mo7645(iM7644);
            while (i2 < list.size()) {
                int iIntValue2 = ((Integer) list.get(i2)).intValue();
                abstractC3462.mo7645((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                i2++;
            }
            return;
        }
        C3613 c3613 = (C3613) list;
        if (!z) {
            while (i2 < c3613.f11252) {
                int iM7814 = c3613.m7814(i2);
                abstractC3462.mo7646(i, (iM7814 >> 31) ^ (iM7814 << 1));
                i2++;
            }
            return;
        }
        abstractC3462.mo7655(i, 2);
        int iM76442 = 0;
        for (int i4 = 0; i4 < c3613.f11252; i4++) {
            iM76442 += AbstractC3462.m7644(c3613.m7814(i4));
        }
        abstractC3462.mo7645(iM76442);
        while (i2 < c3613.f11252) {
            int iM78142 = c3613.m7814(i2);
            abstractC3462.mo7645((iM78142 >> 31) ^ (iM78142 << 1));
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static void m7350(int i, List list, C3427 c3427, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof C3430;
        AbstractC3462 abstractC3462 = (AbstractC3462) c3427.f11089;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC3462.mo7653(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            abstractC3462.mo7655(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                boolean z3 = AbstractC3462.f11129;
                i3 += 8;
            }
            abstractC3462.mo7645(i3);
            while (i2 < list.size()) {
                abstractC3462.mo7652(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        C3430 c3430 = (C3430) list;
        if (!z) {
            while (i2 < c3430.f11095) {
                abstractC3462.mo7653(i, c3430.m7568(i2));
                i2++;
            }
            return;
        }
        abstractC3462.mo7655(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c3430.f11095; i6++) {
            c3430.m7568(i6);
            boolean z4 = AbstractC3462.f11129;
            i5 += 8;
        }
        abstractC3462.mo7645(i5);
        while (i2 < c3430.f11095) {
            abstractC3462.mo7652(c3430.m7568(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static void m7351(int i, List list, C3427 c3427, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof C3613;
        AbstractC3462 abstractC3462 = (AbstractC3462) c3427.f11089;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC3462.mo7665(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abstractC3462.mo7655(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                boolean z3 = AbstractC3462.f11129;
                i3 += 4;
            }
            abstractC3462.mo7645(i3);
            while (i2 < list.size()) {
                abstractC3462.mo7654(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C3613 c3613 = (C3613) list;
        if (!z) {
            while (i2 < c3613.f11252) {
                abstractC3462.mo7665(i, c3613.m7814(i2));
                i2++;
            }
            return;
        }
        abstractC3462.mo7655(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c3613.f11252; i6++) {
            c3613.m7814(i6);
            boolean z4 = AbstractC3462.f11129;
            i5 += 4;
        }
        abstractC3462.mo7645(i5);
        while (i2 < c3613.f11252) {
            abstractC3462.mo7654(c3613.m7814(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static void m7352(int i, List list, C3427 c3427, InterfaceC3345 interfaceC3345) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            c3427.m7550(i, list.get(i2), interfaceC3345);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static void m7353(int i, List list, C3427 c3427, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof C3430;
        AbstractC3462 abstractC3462 = (AbstractC3462) c3427.f11089;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC3462.mo7648(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            abstractC3462.mo7655(i, 2);
            int iM7638 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM7638 += AbstractC3462.m7638(((Long) list.get(i3)).longValue());
            }
            abstractC3462.mo7645(iM7638);
            while (i2 < list.size()) {
                abstractC3462.mo7647(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        C3430 c3430 = (C3430) list;
        if (!z) {
            while (i2 < c3430.f11095) {
                abstractC3462.mo7648(i, c3430.m7568(i2));
                i2++;
            }
            return;
        }
        abstractC3462.mo7655(i, 2);
        int iM76382 = 0;
        for (int i4 = 0; i4 < c3430.f11095; i4++) {
            iM76382 += AbstractC3462.m7638(c3430.m7568(i4));
        }
        abstractC3462.mo7645(iM76382);
        while (i2 < c3430.f11095) {
            abstractC3462.mo7647(c3430.m7568(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static void m7354(int i, List list, C3427 c3427, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof C3613;
        AbstractC3462 abstractC3462 = (AbstractC3462) c3427.f11089;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC3462.mo7646(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abstractC3462.mo7655(i, 2);
            int iM7635 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM7635 += AbstractC3462.m7635(((Integer) list.get(i3)).intValue());
            }
            abstractC3462.mo7645(iM7635);
            while (i2 < list.size()) {
                abstractC3462.mo7645(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C3613 c3613 = (C3613) list;
        if (!z) {
            while (i2 < c3613.f11252) {
                abstractC3462.mo7646(i, c3613.m7814(i2));
                i2++;
            }
            return;
        }
        abstractC3462.mo7655(i, 2);
        int iM76352 = 0;
        for (int i4 = 0; i4 < c3613.f11252; i4++) {
            iM76352 += AbstractC3462.m7635(c3613.m7814(i4));
        }
        abstractC3462.mo7645(iM76352);
        while (i2 < c3613.f11252) {
            abstractC3462.mo7645(c3613.m7814(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static int m7355(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C3613)) {
            int iM7644 = 0;
            while (i < size) {
                iM7644 += AbstractC3462.m7644(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM7644;
        }
        C3613 c3613 = (C3613) list;
        int iM76442 = 0;
        while (i < size) {
            iM76442 += AbstractC3462.m7644(c3613.m7814(i));
            i++;
        }
        return iM76442;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static int m7356(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C3430)) {
            int iM7638 = 0;
            while (i < size) {
                iM7638 += AbstractC3462.m7638(((Long) list.get(i)).longValue());
                i++;
            }
            return iM7638;
        }
        C3430 c3430 = (C3430) list;
        int iM76382 = 0;
        while (i < size) {
            iM76382 += AbstractC3462.m7638(c3430.m7568(i));
            i++;
        }
        return iM76382;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static int m7357(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C3613)) {
            int iM7638 = 0;
            while (i < size) {
                iM7638 += AbstractC3462.m7638(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM7638;
        }
        C3613 c3613 = (C3613) list;
        int iM76382 = 0;
        while (i < size) {
            iM76382 += AbstractC3462.m7638(c3613.m7814(i));
            i++;
        }
        return iM76382;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int m7358(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC3462.m7642(i) + 8) * size;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static int m7359(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC3462.m7642(i) + 4) * size;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static int m7360(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C3613)) {
            int iM7638 = 0;
            while (i < size) {
                iM7638 += AbstractC3462.m7638(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM7638;
        }
        C3613 c3613 = (C3613) list;
        int iM76382 = 0;
        while (i < size) {
            iM76382 += AbstractC3462.m7638(c3613.m7814(i));
            i++;
        }
        return iM76382;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static void m7361(int i, List list, C3427 c3427, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c3427.m7556(i, list, z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static void m7362(int i, List list, C3427 c3427, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c3427.m7553(i, list, z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static void m7363(int i, List list, C3427 c3427, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof C3613;
        AbstractC3462 abstractC3462 = (AbstractC3462) c3427.f11089;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC3462.mo7651(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abstractC3462.mo7655(i, 2);
            int iM7638 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM7638 += AbstractC3462.m7638(((Integer) list.get(i3)).intValue());
            }
            abstractC3462.mo7645(iM7638);
            while (i2 < list.size()) {
                abstractC3462.mo7650(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C3613 c3613 = (C3613) list;
        if (!z) {
            while (i2 < c3613.f11252) {
                abstractC3462.mo7651(i, c3613.m7814(i2));
                i2++;
            }
            return;
        }
        abstractC3462.mo7655(i, 2);
        int iM76382 = 0;
        for (int i4 = 0; i4 < c3613.f11252; i4++) {
            iM76382 += AbstractC3462.m7638(c3613.m7814(i4));
        }
        abstractC3462.mo7645(iM76382);
        while (i2 < c3613.f11252) {
            abstractC3462.mo7650(c3613.m7814(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static void m7364(int i, List list, C3427 c3427, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c3427.m7546(i, list, z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static void m7365(int i, List list, C3427 c3427, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof C3639;
        AbstractC3462 abstractC3462 = (AbstractC3462) c3427.f11089;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    float fFloatValue = ((Float) list.get(i2)).floatValue();
                    abstractC3462.getClass();
                    abstractC3462.mo7665(i, Float.floatToRawIntBits(fFloatValue));
                    i2++;
                }
                return;
            }
            abstractC3462.mo7655(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).getClass();
                boolean z3 = AbstractC3462.f11129;
                i3 += 4;
            }
            abstractC3462.mo7645(i3);
            while (i2 < list.size()) {
                abstractC3462.mo7654(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        C3639 c3639 = (C3639) list;
        if (!z) {
            while (i2 < c3639.f11312) {
                c3639.m7841(i2);
                float f = c3639.f11311[i2];
                abstractC3462.getClass();
                abstractC3462.mo7665(i, Float.floatToRawIntBits(f));
                i2++;
            }
            return;
        }
        abstractC3462.mo7655(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c3639.f11312; i6++) {
            c3639.m7841(i6);
            float f2 = c3639.f11311[i6];
            boolean z4 = AbstractC3462.f11129;
            i5 += 4;
        }
        abstractC3462.mo7645(i5);
        while (i2 < c3639.f11312) {
            c3639.m7841(i2);
            abstractC3462.mo7654(Float.floatToRawIntBits(c3639.f11311[i2]));
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static void m7366(int i, List list, C3427 c3427, InterfaceC3345 interfaceC3345) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            c3427.m7554(i, list.get(i2), interfaceC3345);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static Object m7367(Object obj, int i, int i2, Object obj2, AbstractC3710 abstractC3710) {
        if (obj2 == null) {
            obj2 = abstractC3710.mo7950(obj);
        }
        ((C3706) abstractC3710).getClass();
        ((C3707) obj2).m7952(i << 3, Long.valueOf(i2));
        return obj2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static boolean m7368(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static void m7369(int i, List list, C3427 c3427, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof C3591;
        AbstractC3462 abstractC3462 = (AbstractC3462) c3427.f11089;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC3462.m7664(i, ((Double) list.get(i2)).doubleValue());
                    i2++;
                }
                return;
            }
            abstractC3462.mo7655(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).getClass();
                boolean z3 = AbstractC3462.f11129;
                i3 += 8;
            }
            abstractC3462.mo7645(i3);
            while (i2 < list.size()) {
                abstractC3462.mo7652(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        C3591 c3591 = (C3591) list;
        if (!z) {
            while (i2 < c3591.f11213) {
                c3591.m7794(i2);
                abstractC3462.m7664(i, c3591.f11212[i2]);
                i2++;
            }
            return;
        }
        abstractC3462.mo7655(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c3591.f11213; i6++) {
            c3591.m7794(i6);
            double d = c3591.f11212[i6];
            boolean z4 = AbstractC3462.f11129;
            i5 += 8;
        }
        abstractC3462.mo7645(i5);
        while (i2 < c3591.f11213) {
            c3591.m7794(i2);
            abstractC3462.mo7652(Double.doubleToRawLongBits(c3591.f11212[i2]));
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static void m7370(int i, List list, C3427 c3427, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof C3613;
        AbstractC3462 abstractC3462 = (AbstractC3462) c3427.f11089;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC3462.mo7651(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abstractC3462.mo7655(i, 2);
            int iM7638 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM7638 += AbstractC3462.m7638(((Integer) list.get(i3)).intValue());
            }
            abstractC3462.mo7645(iM7638);
            while (i2 < list.size()) {
                abstractC3462.mo7650(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C3613 c3613 = (C3613) list;
        if (!z) {
            while (i2 < c3613.f11252) {
                abstractC3462.mo7651(i, c3613.m7814(i2));
                i2++;
            }
            return;
        }
        abstractC3462.mo7655(i, 2);
        int iM76382 = 0;
        for (int i4 = 0; i4 < c3613.f11252; i4++) {
            iM76382 += AbstractC3462.m7638(c3613.m7814(i4));
        }
        abstractC3462.mo7645(iM76382);
        while (i2 < c3613.f11252) {
            abstractC3462.mo7650(c3613.m7814(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static void m7371(int i, List list, C3427 c3427, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof C3535;
        AbstractC3462 abstractC3462 = (AbstractC3462) c3427.f11089;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC3462.mo7663(i, ((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            abstractC3462.mo7655(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).getClass();
                boolean z3 = AbstractC3462.f11129;
                i3++;
            }
            abstractC3462.mo7645(i3);
            while (i2 < list.size()) {
                abstractC3462.mo7669(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        C3535 c3535 = (C3535) list;
        if (!z) {
            while (i2 < c3535.f11180) {
                c3535.m7760(i2);
                abstractC3462.mo7663(i, c3535.f11179[i2]);
                i2++;
            }
            return;
        }
        abstractC3462.mo7655(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c3535.f11180; i6++) {
            c3535.m7760(i6);
            boolean z4 = c3535.f11179[i6];
            boolean z5 = AbstractC3462.f11129;
            i5++;
        }
        abstractC3462.mo7645(i5);
        while (i2 < c3535.f11180) {
            c3535.m7760(i2);
            abstractC3462.mo7669(c3535.f11179[i2] ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static void m7372(int i, List list, C3427 c3427) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((AbstractC3462) c3427.f11089).mo7666(i, (ByteString) list.get(i2));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static int m7373(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C3613)) {
            int iM7635 = 0;
            while (i < size) {
                iM7635 += AbstractC3462.m7635(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM7635;
        }
        C3613 c3613 = (C3613) list;
        int iM76352 = 0;
        while (i < size) {
            iM76352 += AbstractC3462.m7635(c3613.m7814(i));
            i++;
        }
        return iM76352;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static int m7374(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C3430)) {
            int iM7641 = 0;
            while (i < size) {
                iM7641 += AbstractC3462.m7641(((Long) list.get(i)).longValue());
                i++;
            }
            return iM7641;
        }
        C3430 c3430 = (C3430) list;
        int iM76412 = 0;
        while (i < size) {
            iM76412 += AbstractC3462.m7641(c3430.m7568(i));
            i++;
        }
        return iM76412;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static Object m7375(Object obj, int i, List list, InterfaceC3397 interfaceC3397, Object obj2, AbstractC3710 abstractC3710) {
        if (interfaceC3397 == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!interfaceC3397.m7498(iIntValue)) {
                    obj2 = m7367(obj, i, iIntValue, obj2, abstractC3710);
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
            if (interfaceC3397.m7498(iIntValue2)) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                obj2 = m7367(obj, i, iIntValue2, obj2, abstractC3710);
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
    public static void m7376(AbstractC3710 abstractC3710, Object obj, Object obj2) {
        ((C3706) abstractC3710).getClass();
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        C3707 c3707M7951 = generatedMessageLite.unknownFields;
        C3707 c3707 = ((GeneratedMessageLite) obj2).unknownFields;
        C3707 c37072 = C3707.f11516;
        if (!c37072.equals(c3707)) {
            if (c37072.equals(c3707M7951)) {
                c3707M7951 = C3707.m7951(c3707M7951, c3707);
            } else {
                c3707M7951.getClass();
                if (!c3707.equals(c37072)) {
                    c3707M7951.m7956();
                    int i = c3707M7951.f11521 + c3707.f11521;
                    c3707M7951.m7955(i);
                    System.arraycopy(c3707.f11520, 0, c3707M7951.f11520, c3707M7951.f11521, c3707.f11521);
                    System.arraycopy(c3707.f11519, 0, c3707M7951.f11519, c3707M7951.f11521, c3707.f11521);
                    c3707M7951.f11521 = i;
                }
            }
        }
        generatedMessageLite.unknownFields = c3707M7951;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static int m7377(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C3430)) {
            int iM7638 = 0;
            while (i < size) {
                iM7638 += AbstractC3462.m7638(((Long) list.get(i)).longValue());
                i++;
            }
            return iM7638;
        }
        C3430 c3430 = (C3430) list;
        int iM76382 = 0;
        while (i < size) {
            iM76382 += AbstractC3462.m7638(c3430.m7568(i));
            i++;
        }
        return iM76382;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static Object m7378(Object obj, int i, AbstractList abstractList, InterfaceC3398 interfaceC3398, Object obj2, AbstractC3710 abstractC3710) {
        if (interfaceC3398 == null) {
            return obj2;
        }
        int size = abstractList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) abstractList.get(i3);
            int iIntValue = num.intValue();
            if (interfaceC3398.mo7346(iIntValue) != null) {
                if (i3 != i2) {
                    abstractList.set(i2, num);
                }
                i2++;
            } else {
                obj2 = m7367(obj, i, iIntValue, obj2, abstractC3710);
            }
        }
        if (i2 != size) {
            abstractList.subList(i2, size).clear();
        }
        return obj2;
    }
}
