package com.bumptech.glide.load.engine.bitmap_recycle;

import android.util.Log;
import androidx.appcompat.app.C0923;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;
import p238.AbstractC8818;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.bitmap_recycle.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3806 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f9747;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f9748;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0923 f9752 = new C0923(15);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3807 f9751 = new C3807(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final HashMap f9750 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final HashMap f9749 = new HashMap();

    public C3806(int i) {
        this.f9748 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final NavigableMap m7003(Class cls) {
        HashMap map = this.f9750;
        NavigableMap navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Object m7004(C3808 c3808, Class cls) {
        C3810 c3810M7005 = m7005(cls);
        Object objM818 = this.f9752.m818(c3808);
        if (objM818 != null) {
            this.f9747 -= c3810M7005.m7013() * c3810M7005.m7014(objM818);
            m7008(c3810M7005.m7014(objM818), cls);
        }
        if (objM818 != null) {
            return objM818;
        }
        if (Log.isLoggable(c3810M7005.m7012(), 2)) {
            Log.v(c3810M7005.m7012(), "Allocated " + c3808.f9755 + " bytes");
        }
        int i = c3808.f9755;
        switch (c3810M7005.f9761) {
            case 0:
                return new byte[i];
            default:
                return new int[i];
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C3810 m7005(Class cls) {
        C3810 c3810;
        HashMap map = this.f9749;
        C3810 c38102 = (C3810) map.get(cls);
        if (c38102 != null) {
            return c38102;
        }
        if (cls.equals(int[].class)) {
            c3810 = new C3810(1);
        } else {
            if (!cls.equals(byte[].class)) {
                C6755.m11869("No array pool found for: ".concat(cls.getSimpleName()));
                return null;
            }
            c3810 = new C3810(0);
        }
        map.put(cls, c3810);
        return c3810;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final synchronized Object m7006(int i, Class cls) {
        C3808 c3808;
        int i2;
        try {
            Integer num = (Integer) m7003(cls).ceilingKey(Integer.valueOf(i));
            boolean z = num != null && ((i2 = this.f9747) == 0 || this.f9748 / i2 >= 2 || num.intValue() <= i * 8);
            C3807 c3807 = this.f9751;
            if (z) {
                int iIntValue = num.intValue();
                InterfaceC3812 interfaceC3812M7010 = (InterfaceC3812) ((ArrayDeque) c3807.f4240).poll();
                if (interfaceC3812M7010 == null) {
                    interfaceC3812M7010 = c3807.m7010();
                }
                c3808 = (C3808) interfaceC3812M7010;
                c3808.f9755 = iIntValue;
                c3808.f9754 = cls;
            } else {
                InterfaceC3812 interfaceC3812M70102 = (InterfaceC3812) ((ArrayDeque) c3807.f4240).poll();
                if (interfaceC3812M70102 == null) {
                    interfaceC3812M70102 = c3807.m7010();
                }
                c3808 = (C3808) interfaceC3812M70102;
                c3808.f9755 = i;
                c3808.f9754 = cls;
            }
        } catch (Throwable th) {
            throw th;
        }
        return m7004(c3808, cls);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7007(int i) {
        while (this.f9747 > i) {
            Object objM817 = this.f9752.m817();
            AbstractC8818.m14029(objM817);
            C3810 c3810M7005 = m7005(objM817.getClass());
            this.f9747 -= c3810M7005.m7013() * c3810M7005.m7014(objM817);
            m7008(c3810M7005.m7014(objM817), objM817.getClass());
            if (Log.isLoggable(c3810M7005.m7012(), 2)) {
                Log.v(c3810M7005.m7012(), "evicted: " + c3810M7005.m7014(objM817));
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m7008(int i, Class cls) {
        NavigableMap navigableMapM7003 = m7003(cls);
        Integer num = (Integer) navigableMapM7003.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapM7003.remove(Integer.valueOf(i));
                return;
            } else {
                navigableMapM7003.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final synchronized void m7009(Object obj) {
        Class<?> cls = obj.getClass();
        C3810 c3810M7005 = m7005(cls);
        int iM7014 = c3810M7005.m7014(obj);
        int iM7013 = c3810M7005.m7013() * iM7014;
        if (iM7013 <= this.f9748 / 2) {
            C3807 c3807 = this.f9751;
            InterfaceC3812 interfaceC3812M7010 = (InterfaceC3812) ((ArrayDeque) c3807.f4240).poll();
            if (interfaceC3812M7010 == null) {
                interfaceC3812M7010 = c3807.m7010();
            }
            C3808 c3808 = (C3808) interfaceC3812M7010;
            c3808.f9755 = iM7014;
            c3808.f9754 = cls;
            this.f9752.m816(c3808, obj);
            NavigableMap navigableMapM7003 = m7003(cls);
            Integer num = (Integer) navigableMapM7003.get(Integer.valueOf(c3808.f9755));
            Integer numValueOf = Integer.valueOf(c3808.f9755);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapM7003.put(numValueOf, Integer.valueOf(iIntValue));
            this.f9747 += iM7013;
            m7007(this.f9748);
        }
    }
}
