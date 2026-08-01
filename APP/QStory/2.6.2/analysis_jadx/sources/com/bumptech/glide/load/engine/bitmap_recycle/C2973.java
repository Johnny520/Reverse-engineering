package com.bumptech.glide.load.engine.bitmap_recycle;

import android.util.Log;
import androidx.appcompat.app.C0076;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;
import p222.AbstractC7988;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.bitmap_recycle.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2973 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f9400;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f9401;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0076 f9405 = new C0076(15);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2974 f9404 = new C2974(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final HashMap f9403 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final HashMap f9402 = new HashMap();

    public C2973(int i) {
        this.f9401 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final NavigableMap m6385(Class cls) {
        HashMap map = this.f9403;
        NavigableMap navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Object m6386(C2975 c2975, Class cls) {
        C2977 c2977M6387 = m6387(cls);
        Object objM257 = this.f9405.m257(c2975);
        if (objM257 != null) {
            this.f9400 -= c2977M6387.m6395() * c2977M6387.m6396(objM257);
            m6390(c2977M6387.m6396(objM257), cls);
        }
        if (objM257 != null) {
            return objM257;
        }
        if (Log.isLoggable(c2977M6387.m6394(), 2)) {
            Log.v(c2977M6387.m6394(), "Allocated " + c2975.f9408 + " bytes");
        }
        int i = c2975.f9408;
        switch (c2977M6387.f9414) {
            case 0:
                return new byte[i];
            default:
                return new int[i];
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C2977 m6387(Class cls) {
        C2977 c2977;
        HashMap map = this.f9402;
        C2977 c29772 = (C2977) map.get(cls);
        if (c29772 != null) {
            return c29772;
        }
        if (cls.equals(int[].class)) {
            c2977 = new C2977(1);
        } else {
            if (!cls.equals(byte[].class)) {
                C5919.m11249("No array pool found for: ".concat(cls.getSimpleName()));
                return null;
            }
            c2977 = new C2977(0);
        }
        map.put(cls, c2977);
        return c2977;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final synchronized Object m6388(int i, Class cls) {
        C2975 c2975;
        int i2;
        try {
            Integer num = (Integer) m6385(cls).ceilingKey(Integer.valueOf(i));
            boolean z = num != null && ((i2 = this.f9400) == 0 || this.f9401 / i2 >= 2 || num.intValue() <= i * 8);
            C2974 c2974 = this.f9404;
            if (z) {
                int iIntValue = num.intValue();
                InterfaceC2979 interfaceC2979M6392 = (InterfaceC2979) ((ArrayDeque) c2974.f3894).poll();
                if (interfaceC2979M6392 == null) {
                    interfaceC2979M6392 = c2974.m6392();
                }
                c2975 = (C2975) interfaceC2979M6392;
                c2975.f9408 = iIntValue;
                c2975.f9407 = cls;
            } else {
                InterfaceC2979 interfaceC2979M63922 = (InterfaceC2979) ((ArrayDeque) c2974.f3894).poll();
                if (interfaceC2979M63922 == null) {
                    interfaceC2979M63922 = c2974.m6392();
                }
                c2975 = (C2975) interfaceC2979M63922;
                c2975.f9408 = i;
                c2975.f9407 = cls;
            }
        } catch (Throwable th) {
            throw th;
        }
        return m6386(c2975, cls);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m6389(int i) {
        while (this.f9400 > i) {
            Object objM256 = this.f9405.m256();
            AbstractC7988.m13442(objM256);
            C2977 c2977M6387 = m6387(objM256.getClass());
            this.f9400 -= c2977M6387.m6395() * c2977M6387.m6396(objM256);
            m6390(c2977M6387.m6396(objM256), objM256.getClass());
            if (Log.isLoggable(c2977M6387.m6394(), 2)) {
                Log.v(c2977M6387.m6394(), "evicted: " + c2977M6387.m6396(objM256));
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m6390(int i, Class cls) {
        NavigableMap navigableMapM6385 = m6385(cls);
        Integer num = (Integer) navigableMapM6385.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapM6385.remove(Integer.valueOf(i));
                return;
            } else {
                navigableMapM6385.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final synchronized void m6391(Object obj) {
        Class<?> cls = obj.getClass();
        C2977 c2977M6387 = m6387(cls);
        int iM6396 = c2977M6387.m6396(obj);
        int iM6395 = c2977M6387.m6395() * iM6396;
        if (iM6395 <= this.f9401 / 2) {
            C2974 c2974 = this.f9404;
            InterfaceC2979 interfaceC2979M6392 = (InterfaceC2979) ((ArrayDeque) c2974.f3894).poll();
            if (interfaceC2979M6392 == null) {
                interfaceC2979M6392 = c2974.m6392();
            }
            C2975 c2975 = (C2975) interfaceC2979M6392;
            c2975.f9408 = iM6396;
            c2975.f9407 = cls;
            this.f9405.m255(c2975, obj);
            NavigableMap navigableMapM6385 = m6385(cls);
            Integer num = (Integer) navigableMapM6385.get(Integer.valueOf(c2975.f9408));
            Integer numValueOf = Integer.valueOf(c2975.f9408);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapM6385.put(numValueOf, Integer.valueOf(iIntValue));
            this.f9400 += iM6395;
            m6389(this.f9401);
        }
    }
}
