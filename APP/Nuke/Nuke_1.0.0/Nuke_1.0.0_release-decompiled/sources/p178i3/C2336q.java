package p178i3;

import p117X2.AbstractC1665j;
import p160f3.C2135g;
import p160f3.InterfaceC2101D;

/* JADX INFO: renamed from: i3.q */
/* JADX INFO: loaded from: classes.dex */
public final class C2336q implements InterfaceC2101D {

    /* JADX INFO: renamed from: d */
    public final C2338s f7606d;

    /* JADX INFO: renamed from: e */
    public final long f7607e;

    /* JADX INFO: renamed from: f */
    public final Object f7608f;

    /* JADX INFO: renamed from: g */
    public final C2135g f7609g;

    public C2336q(C2338s c2338s, long j5, Object obj, C2135g c2135g) {
        this.f7606d = c2338s;
        this.f7607e = j5;
        this.f7608f = obj;
        this.f7609g = c2135g;
    }

    @Override // p160f3.InterfaceC2101D
    /* JADX INFO: renamed from: a */
    public final void mo3883a() {
        C2338s c2338s = this.f7606d;
        synchronized (c2338s) {
            if (this.f7607e < c2338s.m4157o()) {
                return;
            }
            Object[] objArr = c2338s.f7620k;
            AbstractC1665j.m2982b(objArr);
            long j5 = this.f7607e;
            if (objArr[((int) j5) & (objArr.length - 1)] != this) {
                return;
            }
            AbstractC2339t.m4167c(objArr, j5, AbstractC2339t.f7625a);
            c2338s.m4153h();
        }
    }
}
