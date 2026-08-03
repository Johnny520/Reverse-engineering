package p000a;

import java.util.Map;

/* JADX INFO: renamed from: a.I1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0148I1 extends AbstractC0461Z9 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f519d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f520e;

    public /* synthetic */ C0148I1(int i, Object obj) {
        this.f519d = i;
        this.f520e = obj;
    }

    @Override // p000a.AbstractC0461Z9
    /* JADX INFO: renamed from: a */
    public final void mo410a() {
        switch (this.f519d) {
            case 0:
                ((C0166J1) this.f520e).clear();
                break;
            default:
                ((C0202L1) this.f520e).clear();
                break;
        }
    }

    @Override // p000a.AbstractC0461Z9
    /* JADX INFO: renamed from: b */
    public final Object mo411b(int i, int i2) {
        switch (this.f519d) {
            case 0:
                return ((C0166J1) this.f520e).f2220b[(i << 1) + i2];
            default:
                return ((C0202L1) this.f520e).f688b[i];
        }
    }

    @Override // p000a.AbstractC0461Z9
    /* JADX INFO: renamed from: c */
    public final Map mo412c() {
        switch (this.f519d) {
            case 0:
                return (C0166J1) this.f520e;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    @Override // p000a.AbstractC0461Z9
    /* JADX INFO: renamed from: d */
    public final int mo413d() {
        switch (this.f519d) {
            case 0:
                return ((C0166J1) this.f520e).f2221c;
            default:
                return ((C0202L1) this.f520e).f689c;
        }
    }

    @Override // p000a.AbstractC0461Z9
    /* JADX INFO: renamed from: e */
    public final int mo414e(Object obj) {
        switch (this.f519d) {
            case 0:
                return ((C0166J1) this.f520e).m1433e(obj);
            default:
                C0202L1 c0202l1 = (C0202L1) this.f520e;
                return obj == null ? c0202l1.m575d() : c0202l1.m574c(obj.hashCode(), obj);
        }
    }

    @Override // p000a.AbstractC0461Z9
    /* JADX INFO: renamed from: f */
    public final int mo415f(Object obj) {
        switch (this.f519d) {
            case 0:
                return ((C0166J1) this.f520e).m1435g(obj);
            default:
                C0202L1 c0202l1 = (C0202L1) this.f520e;
                return obj == null ? c0202l1.m575d() : c0202l1.m574c(obj.hashCode(), obj);
        }
    }

    @Override // p000a.AbstractC0461Z9
    /* JADX INFO: renamed from: g */
    public final void mo416g(Object obj, Object obj2) {
        switch (this.f519d) {
            case 0:
                ((C0166J1) this.f520e).put(obj, obj2);
                break;
            default:
                ((C0202L1) this.f520e).add(obj);
                break;
        }
    }

    @Override // p000a.AbstractC0461Z9
    /* JADX INFO: renamed from: h */
    public final void mo417h(int i) {
        switch (this.f519d) {
            case 0:
                ((C0166J1) this.f520e).m1437i(i);
                break;
            default:
                ((C0202L1) this.f520e).m576e(i);
                break;
        }
    }

    @Override // p000a.AbstractC0461Z9
    /* JADX INFO: renamed from: i */
    public final Object mo418i(int i, Object obj) {
        switch (this.f519d) {
            case 0:
                int i2 = (i << 1) + 1;
                Object[] objArr = ((C0166J1) this.f520e).f2220b;
                Object obj2 = objArr[i2];
                objArr[i2] = obj;
                return obj2;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }
}
