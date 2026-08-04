package yyds;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: yyds.ᲁᛶᲇᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2267 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final int f11178;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int f11182;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C2133 f11179 = new C2133(27);

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C1075 f11180 = new C1075(0);

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final HashMap f11181 = new HashMap();

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final HashMap f11183 = new HashMap();

    public C2267(int i) {
        this.f11178 = i;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final Object m4268(C0305 c0305, Class cls) {
        C2161 c2161M4274 = m4274(cls);
        Object objM4060 = this.f11179.m4060(c0305);
        if (objM4060 != null) {
            this.f11182 -= c2161M4274.m4128() * c2161M4274.m4127(objM4060);
            m4269(cls, c2161M4274.m4127(objM4060));
        }
        if (objM4060 != null) {
            return objM4060;
        }
        if (Log.isLoggable(c2161M4274.m4129(), 2)) {
            Log.v(c2161M4274.m4129(), "Allocated " + c0305.f1608 + " bytes");
        }
        int i = c0305.f1608;
        switch (c2161M4274.f10626) {
            case 0:
                return new byte[i];
            default:
                return new int[i];
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m4269(Class cls, int i) {
        NavigableMap navigableMapM4273 = m4273(cls);
        Integer num = (Integer) navigableMapM4273.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapM4273.remove(Integer.valueOf(i));
                return;
            } else {
                navigableMapM4273.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m4270(int i) {
        while (this.f11182 > i) {
            Object objM4067 = this.f11179.m4067();
            AbstractC0319.m990(objM4067);
            C2161 c2161M4274 = m4274(objM4067.getClass());
            this.f11182 -= c2161M4274.m4128() * c2161M4274.m4127(objM4067);
            m4269(objM4067.getClass(), c2161M4274.m4127(objM4067));
            if (Log.isLoggable(c2161M4274.m4129(), 2)) {
                Log.v(c2161M4274.m4129(), "evicted: " + c2161M4274.m4127(objM4067));
            }
        }
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final synchronized void m4271(Object obj) {
        Class<?> cls = obj.getClass();
        C2161 c2161M4274 = m4274(cls);
        int iM4127 = c2161M4274.m4127(obj);
        int iM4128 = c2161M4274.m4128() * iM4127;
        if (iM4128 <= this.f11178 / 2) {
            C1075 c1075 = this.f11180;
            InterfaceC1490 interfaceC1490M2282 = (InterfaceC1490) ((ArrayDeque) c1075.f3409).poll();
            if (interfaceC1490M2282 == null) {
                interfaceC1490M2282 = c1075.m2282();
            }
            C0305 c0305 = (C0305) interfaceC1490M2282;
            c0305.f1608 = iM4127;
            c0305.f1609 = cls;
            this.f11179.m4062(c0305, obj);
            NavigableMap navigableMapM4273 = m4273(cls);
            Integer num = (Integer) navigableMapM4273.get(Integer.valueOf(c0305.f1608));
            Integer numValueOf = Integer.valueOf(c0305.f1608);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapM4273.put(numValueOf, Integer.valueOf(iIntValue));
            this.f11182 += iM4128;
            m4270(this.f11178);
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final synchronized Object m4272(Class cls, int i) {
        C0305 c0305;
        int i2;
        try {
            Integer num = (Integer) m4273(cls).ceilingKey(Integer.valueOf(i));
            boolean z = num != null && ((i2 = this.f11182) == 0 || this.f11178 / i2 >= 2 || num.intValue() <= i * 8);
            C1075 c1075 = this.f11180;
            if (z) {
                int iIntValue = num.intValue();
                InterfaceC1490 interfaceC1490M2282 = (InterfaceC1490) ((ArrayDeque) c1075.f3409).poll();
                if (interfaceC1490M2282 == null) {
                    interfaceC1490M2282 = c1075.m2282();
                }
                c0305 = (C0305) interfaceC1490M2282;
                c0305.f1608 = iIntValue;
                c0305.f1609 = cls;
            } else {
                InterfaceC1490 interfaceC1490M22822 = (InterfaceC1490) ((ArrayDeque) c1075.f3409).poll();
                if (interfaceC1490M22822 == null) {
                    interfaceC1490M22822 = c1075.m2282();
                }
                c0305 = (C0305) interfaceC1490M22822;
                c0305.f1608 = i;
                c0305.f1609 = cls;
            }
        } catch (Throwable th) {
            throw th;
        }
        return m4268(c0305, cls);
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final NavigableMap m4273(Class cls) {
        HashMap map = this.f11181;
        NavigableMap navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C2161 m4274(Class cls) {
        C2161 c2161;
        HashMap map = this.f11183;
        C2161 c21612 = (C2161) map.get(cls);
        if (c21612 != null) {
            return c21612;
        }
        if (cls.equals(int[].class)) {
            c2161 = new C2161(1);
        } else {
            if (!cls.equals(byte[].class)) {
                C0188.m798("No array pool found for: ".concat(cls.getSimpleName()));
                return null;
            }
            c2161 = new C2161(0);
        }
        map.put(cls, c2161);
        return c2161;
    }
}
