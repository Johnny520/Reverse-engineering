package com.bumptech.glide.load.engine.bitmap_recycle;

import android.util.Log;
import androidx.appcompat.app.C0076;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;
import p222.AbstractC7989;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.bitmap_recycle.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2974 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f9402;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f9403;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0076 f9407 = new C0076(15);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2975 f9406 = new C2975(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final HashMap f9405 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final HashMap f9404 = new HashMap();

    public C2974(int i) {
        this.f9403 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final NavigableMap m6443(Class cls) {
        HashMap map = this.f9405;
        NavigableMap navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Object m6444(C2976 c2976, Class cls) {
        C2978 c2978M6445 = m6445(cls);
        Object objM258 = this.f9407.m258(c2976);
        if (objM258 != null) {
            this.f9402 -= c2978M6445.m6453() * c2978M6445.m6454(objM258);
            m6448(c2978M6445.m6454(objM258), cls);
        }
        if (objM258 != null) {
            return objM258;
        }
        if (Log.isLoggable(c2978M6445.m6452(), 2)) {
            Log.v(c2978M6445.m6452(), "Allocated " + c2976.f9410 + " bytes");
        }
        int i = c2976.f9410;
        switch (c2978M6445.f9416) {
            case 0:
                return new byte[i];
            default:
                return new int[i];
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C2978 m6445(Class cls) {
        C2978 c2978;
        HashMap map = this.f9404;
        C2978 c29782 = (C2978) map.get(cls);
        if (c29782 != null) {
            return c29782;
        }
        if (cls.equals(int[].class)) {
            c2978 = new C2978(1);
        } else {
            if (!cls.equals(byte[].class)) {
                C5925.m11310("No array pool found for: ".concat(cls.getSimpleName()));
                return null;
            }
            c2978 = new C2978(0);
        }
        map.put(cls, c2978);
        return c2978;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final synchronized Object m6446(int i, Class cls) {
        C2976 c2976;
        int i2;
        try {
            Integer num = (Integer) m6443(cls).ceilingKey(Integer.valueOf(i));
            boolean z = num != null && ((i2 = this.f9402) == 0 || this.f9403 / i2 >= 2 || num.intValue() <= i * 8);
            C2975 c2975 = this.f9406;
            if (z) {
                int iIntValue = num.intValue();
                InterfaceC2980 interfaceC2980M6450 = (InterfaceC2980) ((ArrayDeque) c2975.f3895).poll();
                if (interfaceC2980M6450 == null) {
                    interfaceC2980M6450 = c2975.m6450();
                }
                c2976 = (C2976) interfaceC2980M6450;
                c2976.f9410 = iIntValue;
                c2976.f9409 = cls;
            } else {
                InterfaceC2980 interfaceC2980M64502 = (InterfaceC2980) ((ArrayDeque) c2975.f3895).poll();
                if (interfaceC2980M64502 == null) {
                    interfaceC2980M64502 = c2975.m6450();
                }
                c2976 = (C2976) interfaceC2980M64502;
                c2976.f9410 = i;
                c2976.f9409 = cls;
            }
        } catch (Throwable th) {
            throw th;
        }
        return m6444(c2976, cls);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m6447(int i) {
        while (this.f9402 > i) {
            Object objM257 = this.f9407.m257();
            AbstractC7989.m13470(objM257);
            C2978 c2978M6445 = m6445(objM257.getClass());
            this.f9402 -= c2978M6445.m6453() * c2978M6445.m6454(objM257);
            m6448(c2978M6445.m6454(objM257), objM257.getClass());
            if (Log.isLoggable(c2978M6445.m6452(), 2)) {
                Log.v(c2978M6445.m6452(), "evicted: " + c2978M6445.m6454(objM257));
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m6448(int i, Class cls) {
        NavigableMap navigableMapM6443 = m6443(cls);
        Integer num = (Integer) navigableMapM6443.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapM6443.remove(Integer.valueOf(i));
                return;
            } else {
                navigableMapM6443.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final synchronized void m6449(Object obj) {
        Class<?> cls = obj.getClass();
        C2978 c2978M6445 = m6445(cls);
        int iM6454 = c2978M6445.m6454(obj);
        int iM6453 = c2978M6445.m6453() * iM6454;
        if (iM6453 <= this.f9403 / 2) {
            C2975 c2975 = this.f9406;
            InterfaceC2980 interfaceC2980M6450 = (InterfaceC2980) ((ArrayDeque) c2975.f3895).poll();
            if (interfaceC2980M6450 == null) {
                interfaceC2980M6450 = c2975.m6450();
            }
            C2976 c2976 = (C2976) interfaceC2980M6450;
            c2976.f9410 = iM6454;
            c2976.f9409 = cls;
            this.f9407.m256(c2976, obj);
            NavigableMap navigableMapM6443 = m6443(cls);
            Integer num = (Integer) navigableMapM6443.get(Integer.valueOf(c2976.f9410));
            Integer numValueOf = Integer.valueOf(c2976.f9410);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapM6443.put(numValueOf, Integer.valueOf(iIntValue));
            this.f9402 += iM6453;
            m6447(this.f9403);
        }
    }
}
