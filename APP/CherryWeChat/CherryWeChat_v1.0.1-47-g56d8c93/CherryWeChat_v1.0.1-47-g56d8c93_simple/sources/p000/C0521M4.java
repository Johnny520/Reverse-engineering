package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: M4 */
/* JADX INFO: loaded from: classes.dex */
public class C0521M4 extends C2520sy implements Map {

    /* JADX INFO: renamed from: d */
    public C0306H4 f1700d;

    /* JADX INFO: renamed from: e */
    public C0392J4 f1701e;

    /* JADX INFO: renamed from: f */
    public C0478L4 f1702f;

    public C0521M4(C0521M4 r2) {
        super(0);
        mo3g(r2);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C0306H4 r0 = this.f1700d;
        if (r0 != null) goto L6;
        C0306H4 r02 = new C0306H4(this);
        this.f1700d = r02;
        return r02;
    L6:
        return r0;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m1005k(Collection r2) {
        Iterator r22 = r2.iterator();
    L4:
        if (r22.hasNext() == false) goto L9;
        if (super.containsKey(r22.next()) == true) goto L4;
        return false;
    L9:
        return true;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C0392J4 r0 = this.f1701e;
        if (r0 != null) goto L6;
        C0392J4 r02 = new C0392J4(this);
        this.f1701e = r02;
        return r02;
    L6:
        return r0;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m1006l(Collection r3) {
        int r0 = this.f8818c;
        Iterator r32 = r3.iterator();
    L4:
        if (r32.hasNext() == false) goto L7;
        super.remove(r32.next());
        goto L4
    L7:
        if (r0 == this.f8818c) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // java.util.Map
    public final void putAll(Map r3) {
        int r0 = this.f8818c;
        m4998b(r3.size() + r0);
        Iterator r32 = r3.entrySet().iterator();
    L4:
        if (r32.hasNext() == false) goto L6;
        Map.Entry r02 = (Map.Entry) r32.next();
        put(r02.getKey(), r02.getValue());
        goto L4
    }

    @Override // java.util.Map
    public final Collection values() {
        C0478L4 r0 = this.f1702f;
        if (r0 != null) goto L6;
        C0478L4 r02 = new C0478L4(this);
        this.f1702f = r02;
        return r02;
    L6:
        return r0;
    }
}
