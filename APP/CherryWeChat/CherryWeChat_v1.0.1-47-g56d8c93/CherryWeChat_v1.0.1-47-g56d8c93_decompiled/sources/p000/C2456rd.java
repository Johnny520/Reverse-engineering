package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: rd */
/* JADX INFO: loaded from: classes.dex */
public final class C2456rd implements Iterator, InterfaceC0545Mm {

    /* JADX INFO: renamed from: a */
    public int f8650a = -1;

    /* JADX INFO: renamed from: b */
    public int f8651b;

    /* JADX INFO: renamed from: c */
    public int f8652c;

    /* JADX INFO: renamed from: d */
    public C0286Gl f8653d;

    /* JADX INFO: renamed from: e */
    public int f8654e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2499sd f8655f;

    public C2456rd(C2499sd c2499sd) {
        this.f8655f = c2499sd;
        int iM1639f = AbstractC0828TB.m1639f(0, ((CharSequence) c2499sd.f8787d).length());
        this.f8651b = iM1639f;
        this.f8652c = iM1639f;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4947a() {
        C0208Et c0208Et;
        int i = this.f8652c;
        if (i < 0) {
            this.f8650a = 0;
            this.f8653d = null;
            return;
        }
        C2499sd c2499sd = this.f8655f;
        int i2 = c2499sd.f8785b;
        if (i2 > 0) {
            int i3 = this.f8654e + 1;
            this.f8654e = i3;
            if (i3 >= i2) {
                this.f8653d = new C0286Gl(this.f8651b, AbstractC2564tz.m5053N((CharSequence) c2499sd.f8787d), 1);
                this.f8652c = -1;
            } else if (i <= ((CharSequence) c2499sd.f8787d).length() && (c0208Et = (C0208Et) c2499sd.f8786c.mo446d((CharSequence) c2499sd.f8787d, Integer.valueOf(this.f8652c))) != null) {
                int iIntValue = ((Number) c0208Et.f613a).intValue();
                int iIntValue2 = ((Number) c0208Et.f614b).intValue();
                this.f8653d = AbstractC0828TB.m1632J(this.f8651b, iIntValue);
                int i4 = iIntValue + iIntValue2;
                this.f8651b = i4;
                this.f8652c = i4 + (iIntValue2 == 0 ? 1 : 0);
            } else {
                this.f8653d = new C0286Gl(this.f8651b, AbstractC2564tz.m5053N((CharSequence) c2499sd.f8787d), 1);
                this.f8652c = -1;
            }
        }
        this.f8650a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f8650a == -1) {
            m4947a();
        }
        return this.f8650a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f8650a == -1) {
            m4947a();
        }
        if (this.f8650a == 0) {
            throw new NoSuchElementException();
        }
        C0286Gl c0286Gl = this.f8653d;
        this.f8653d = null;
        this.f8650a = -1;
        return c0286Gl;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
