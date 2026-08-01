package ad;

import java.util.Iterator;
import p036c9.InterfaceC1400a;
import p215oc.C5706c;
import p300uc.InterfaceC8645a;
import p375zc.AbstractC9939c;

/* JADX INFO: renamed from: ad.d0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0249d0 implements Iterator, InterfaceC1400a {

    /* JADX INFO: renamed from: q */
    public final AbstractC9939c f613q;

    /* JADX INFO: renamed from: r */
    public final C0295w0 f614r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC8645a f615s;

    /* JADX INFO: renamed from: t */
    public boolean f616t;

    /* JADX INFO: renamed from: u */
    public boolean f617u;

    public C0249d0(AbstractC9939c abstractC9939c, C0295w0 c0295w0, InterfaceC8645a interfaceC8645a) {
        abstractC9939c.getClass();
        c0295w0.getClass();
        interfaceC8645a.getClass();
        this.f613q = abstractC9939c;
        this.f614r = c0295w0;
        this.f615s = interfaceC8645a;
        this.f616t = true;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f617u) {
            return false;
        }
        if (this.f614r.mo596H() == 9) {
            this.f617u = true;
            this.f614r.m617l((byte) 9);
            if (this.f614r.m593E()) {
                byte bMo596H = this.f614r.mo596H();
                C0295w0 c0295w0 = this.f614r;
                if (bMo596H == 8) {
                    AbstractC0239a.m588z(c0295w0, "There is a start of the new array after the one parsed to sequence. ARRAY_WRAPPED mode doesn't merge consecutive arrays.\nIf you need to parse a stream of arrays, please use WHITESPACE_SEPARATED mode instead.", 0, null, 6, null);
                    C5706c.m23089a();
                    return false;
                }
                c0295w0.m628x();
            }
            return false;
        }
        if (this.f614r.m593E() || this.f617u) {
            return true;
        }
        C0295w0 c0295w02 = this.f614r;
        String strM653c = AbstractC0242b.m653c((byte) 9);
        int i10 = c0295w02.f592a;
        int i11 = i10 - 1;
        AbstractC0239a.m588z(c0295w02, "Expected " + strM653c + ", but had '" + ((i10 == c0295w02.mo592D().length() || i11 < 0) ? "EOF" : String.valueOf(c0295w02.mo592D().charAt(i11))) + "' instead", i11, null, 4, null);
        C5706c.m23089a();
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (this.f616t) {
            this.f616t = false;
        } else {
            this.f614r.mo618m(',');
        }
        return new C0301z0(this.f613q, EnumC0268j1.f652s, this.f614r, this.f615s.mo15953a(), null).mo660D(this.f615s);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
