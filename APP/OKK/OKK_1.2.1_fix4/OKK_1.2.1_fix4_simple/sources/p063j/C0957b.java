package p063j;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: j.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0957b extends C0966k implements Map {

    /* JADX INFO: renamed from: h */
    public C0956a f3391h;

    public C0957b(C0966k r5) {
        int r02 = r5.f3432c;
        m2317b(r02);
        int r2 = 0;
        if (this.f3432c != 0) goto L6;
        if (r02 <= 0) goto L8;
        System.arraycopy(r5.f3430a, 0, this.f3430a, 0, r02);
        System.arraycopy(r5.f3431b, 0, this.f3431b, 0, r02 << 1);
        this.f3432c = r02;
        return;
    L8:
        return;
    L6:
        if (r2 >= r02) goto L11;
        put(r5.m2322h(r2), r5.m2324j(r2));
        r2 = r2 + 1;
        goto L6
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.f3391h != null) goto L5;
        this.f3391h = new C0956a(0, this);
    L5:
        C0956a r02 = this.f3391h;
        if (r02.f3386a != null) goto L9;
        r02.f3386a = new C0963h(r02, 0);
    L9:
        return r02.f3386a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f3391h != null) goto L5;
        this.f3391h = new C0956a(0, this);
    L5:
        C0956a r02 = this.f3391h;
        if (r02.f3387b != null) goto L9;
        r02.f3387b = new C0963h(r02, 1);
    L9:
        return r02.f3387b;
    }

    @Override // java.util.Map
    public final void putAll(Map r3) {
        int r02 = this.f3432c;
        m2317b(r3.size() + r02);
        Iterator r32 = r3.entrySet().iterator();
    L4:
        if (r32.hasNext() == false) goto L6;
        Map.Entry r03 = (Map.Entry) r32.next();
        put(r03.getKey(), r03.getValue());
        goto L4
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f3391h != null) goto L5;
        this.f3391h = new C0956a(0, this);
    L5:
        C0956a r02 = this.f3391h;
        if (r02.f3388c != null) goto L9;
        r02.f3388c = new C0965j(r02);
    L9:
        return r02.f3388c;
    }
}
