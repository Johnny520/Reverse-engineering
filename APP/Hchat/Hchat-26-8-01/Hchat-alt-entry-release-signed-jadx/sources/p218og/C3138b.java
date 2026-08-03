package p218og;

import bsh.C0353j;
import java.util.Iterator;
import p114hg.InterfaceC1711a;
import p172lg.C2564d;
import p259r9.AbstractC3754e0;
import p276sf.C3958e;

/* JADX INFO: renamed from: og.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3138b implements Iterator, InterfaceC1711a {

    /* JADX INFO: renamed from: g */
    public int f10181g = -1;

    /* JADX INFO: renamed from: h */
    public int f10182h;

    /* JADX INFO: renamed from: i */
    public int f10183i;

    /* JADX INFO: renamed from: j */
    public C2564d f10184j;

    /* JADX INFO: renamed from: k */
    public int f10185k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C3139c f10186l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3138b(C3139c c3139c) {
        this.f10186l = c3139c;
        int iM7909r = AbstractC3754e0.m7909r(0, 0, c3139c.f10187a.length());
        this.f10182h = iM7909r;
        this.f10183i = iM7909r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m6674a() {
        C3139c c3139c = this.f10186l;
        CharSequence charSequence = c3139c.f10187a;
        int i9 = this.f10183i;
        if (i9 < 0) {
            this.f10181g = 0;
            this.f10184j = null;
            return;
        }
        int i10 = c3139c.f10188b;
        if (i10 > 0) {
            int i11 = this.f10185k + 1;
            this.f10185k = i11;
            if (i11 < i10) {
                if (i9 > charSequence.length()) {
                    int i12 = this.f10182h;
                    charSequence.getClass();
                    this.f10184j = new C2564d(i12, charSequence.length() - 1, 1);
                    this.f10183i = -1;
                } else {
                    C3958e c3958e = (C3958e) c3139c.f10189c.invoke(charSequence, Integer.valueOf(this.f10183i));
                    if (c3958e == null) {
                        int i13 = this.f10182h;
                        charSequence.getClass();
                        this.f10184j = new C2564d(i13, charSequence.length() - 1, 1);
                        this.f10183i = -1;
                    } else {
                        int iIntValue = ((Number) c3958e.f12961g).intValue();
                        int iIntValue2 = ((Number) c3958e.f12962h).intValue();
                        this.f10184j = AbstractC3754e0.m7910r0(this.f10182h, iIntValue);
                        int i14 = iIntValue + iIntValue2;
                        this.f10182h = i14;
                        this.f10183i = i14 + (iIntValue2 == 0 ? 1 : 0);
                    }
                }
            }
        }
        this.f10181g = 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f10181g == -1) {
            m6674a();
        }
        return this.f10181g == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        if (this.f10181g == -1) {
            m6674a();
        }
        if (this.f10181g == 0) {
            C0353j.m1307e();
            return null;
        }
        C2564d c2564d = this.f10184j;
        c2564d.getClass();
        this.f10184j = null;
        this.f10181g = -1;
        return c2564d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
