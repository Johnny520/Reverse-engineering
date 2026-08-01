package p075l;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0744b extends C0753k implements Map {

    /* JADX INFO: renamed from: h */
    public C0743a f2515h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final Set entrySet() {
        if (this.f2515h == null) {
            this.f2515h = new C0743a(0, this);
        }
        C0743a c0743a = this.f2515h;
        if (c0743a.f2510a == null) {
            c0743a.f2510a = new C0750h(c0743a, 0);
        }
        return c0743a.f2510a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final Set keySet() {
        if (this.f2515h == null) {
            this.f2515h = new C0743a(0, this);
        }
        C0743a c0743a = this.f2515h;
        if (c0743a.f2511b == null) {
            c0743a.f2511b = new C0750h(c0743a, 1);
        }
        return c0743a.f2511b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.f2556c;
        int i2 = this.f2556c;
        int[] iArr = this.f2554a;
        if (iArr.length < size) {
            Object[] objArr = this.f2555b;
            m1413a(size);
            if (this.f2556c > 0) {
                System.arraycopy(iArr, 0, this.f2554a, 0, i2);
                System.arraycopy(objArr, 0, this.f2555b, 0, i2 << 1);
            }
            C0753k.m1412b(iArr, objArr, i2);
        }
        if (this.f2556c != i2) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final Collection values() {
        if (this.f2515h == null) {
            this.f2515h = new C0743a(0, this);
        }
        C0743a c0743a = this.f2515h;
        if (c0743a.f2512c == null) {
            c0743a.f2512c = new C0752j(c0743a);
        }
        return c0743a.f2512c;
    }
}
