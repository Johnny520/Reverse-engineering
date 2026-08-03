package p000;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: rq */
/* JADX INFO: loaded from: classes.dex */
public final class C2469rq extends LinkedHashMap {

    /* JADX INFO: renamed from: b */
    public static final C2469rq f8692b;

    /* JADX INFO: renamed from: a */
    public boolean f8693a = true;

    static {
        C2469rq c2469rq = new C2469rq();
        f8692b = c2469rq;
        c2469rq.f8693a = false;
    }

    /* JADX INFO: renamed from: a */
    public static int m4960a(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof InterfaceC0415Jl) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        Charset charset = AbstractC0501Ll.f1637a;
        int i = length;
        for (byte b : bArr) {
            i = (i * 31) + b;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    /* JADX INFO: renamed from: b */
    public final void m4961b() {
        if (!this.f8693a) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: c */
    public final C2469rq m4962c() {
        if (isEmpty()) {
            return new C2469rq();
        }
        C2469rq c2469rq = new C2469rq(this);
        c2469rq.f8693a = true;
        return c2469rq;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m4961b();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005d A[RETURN] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    for (Map.Entry entry : entrySet()) {
                        if (map.containsKey(entry.getKey())) {
                            Object value = entry.getValue();
                            Object obj2 = map.get(entry.getKey());
                            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                            }
                        }
                    }
                    z = true;
                    if (z) {
                        return true;
                    }
                }
                z = false;
                if (z) {
                }
            } else {
                z = true;
                if (z) {
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iM4960a = 0;
        for (Map.Entry entry : entrySet()) {
            iM4960a += m4960a(entry.getValue()) ^ m4960a(entry.getKey());
        }
        return iM4960a;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m4961b();
        Charset charset = AbstractC0501Ll.f1637a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m4961b();
        for (Object obj : map.keySet()) {
            Charset charset = AbstractC0501Ll.f1637a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m4961b();
        return super.remove(obj);
    }
}
