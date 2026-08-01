package p254r5;

import p020b5.C0996b;
import p309v5.AbstractC8826h;
import p309v5.AbstractC8834p;
import p376zd.C9987e;

/* JADX INFO: renamed from: r5.f0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6498f0 extends AbstractC8834p implements InterfaceC6489b {

    /* JADX INFO: renamed from: r */
    public final AbstractC6487a[] f20408r;

    public C6498f0(int i10) {
        super(i10 > 1);
        if (i10 >= 1) {
            this.f20408r = new AbstractC6487a[i10];
        } else {
            C9987e.m38645a("size < 1");
            throw null;
        }
    }

    /* JADX INFO: renamed from: x */
    public static AbstractC6487a m25765x(int i10) {
        throw new C0996b("invalid constant pool index " + AbstractC8826h.m33898g(i10));
    }

    @Override // p254r5.InterfaceC6489b
    public AbstractC6487a get(int i10) {
        try {
            AbstractC6487a abstractC6487a = this.f20408r[i10];
            if (abstractC6487a == null) {
                m25765x(i10);
            }
            return abstractC6487a;
        } catch (IndexOutOfBoundsException unused) {
            return m25765x(i10);
        }
    }

    @Override // p254r5.InterfaceC6489b
    /* JADX INFO: renamed from: j */
    public AbstractC6487a mo25732j(int i10) {
        try {
            return this.f20408r[i10];
        } catch (IndexOutOfBoundsException unused) {
            return m25765x(i10);
        }
    }

    @Override // p254r5.InterfaceC6489b
    /* JADX INFO: renamed from: p */
    public AbstractC6487a mo25733p(int i10) {
        if (i10 == 0) {
            return null;
        }
        return get(i10);
    }

    @Override // p254r5.InterfaceC6489b
    public int size() {
        return this.f20408r.length;
    }

    /* JADX INFO: renamed from: w */
    public void m25766w(int i10, AbstractC6487a abstractC6487a) {
        int i11;
        AbstractC6487a abstractC6487a2;
        m33929u();
        boolean z10 = abstractC6487a != null && abstractC6487a.mo25728h();
        if (i10 < 1) {
            C9987e.m38645a("n < 1");
            return;
        }
        if (z10) {
            AbstractC6487a[] abstractC6487aArr = this.f20408r;
            if (i10 == abstractC6487aArr.length - 1) {
                C9987e.m38645a("(n == size - 1) && cst.isCategory2()");
                return;
            }
            abstractC6487aArr[i10 + 1] = null;
        }
        if (abstractC6487a != null) {
            AbstractC6487a[] abstractC6487aArr2 = this.f20408r;
            if (abstractC6487aArr2[i10] == null && (abstractC6487a2 = abstractC6487aArr2[i10 - 1]) != null && abstractC6487a2.mo25728h()) {
                this.f20408r[i11] = null;
            }
        }
        this.f20408r[i10] = abstractC6487a;
    }
}
