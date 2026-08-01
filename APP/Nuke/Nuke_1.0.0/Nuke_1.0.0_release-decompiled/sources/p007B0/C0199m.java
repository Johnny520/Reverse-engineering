package p007B0;

import p029F0.InterfaceC0430v;
import p105V.C1483e;
import p154e2.C2029h;
import p186k.C2404A;
import p186k.C2433o;

/* JADX INFO: renamed from: B0.m */
/* JADX INFO: loaded from: classes.dex */
public class C0199m {

    /* JADX INFO: renamed from: a */
    public final C1483e f694a = new C1483e(new C0198l[16]);

    /* JADX INFO: renamed from: b */
    public final C2404A f695b = new C2404A(10);

    /* JADX INFO: renamed from: a */
    public boolean mo304a(C2433o c2433o, InterfaceC0430v interfaceC0430v, C2029h c2029h, boolean z5) {
        C1483e c1483e = this.f694a;
        Object[] objArr = c1483e.f5181d;
        int i5 = c1483e.f5183f;
        boolean z6 = false;
        for (int i6 = 0; i6 < i5; i6++) {
            z6 = ((C0198l) objArr[i6]).mo304a(c2433o, interfaceC0430v, c2029h, z5) || z6;
        }
        return z6;
    }

    /* JADX INFO: renamed from: b */
    public void mo305b(C2029h c2029h) {
        C1483e c1483e = this.f694a;
        int i5 = c1483e.f5183f;
        while (true) {
            i5--;
            if (-1 >= i5) {
                return;
            }
            if (((C0198l) c1483e.f5181d[i5]).f687d.f793e == 0) {
                c1483e.m2762k(i5);
            }
        }
    }
}
