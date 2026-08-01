package p076f5;

import bsh.C1259t2;
import java.util.ArrayList;
import okhttp3.internal.url._UrlKt;
import p045d5.AbstractC1887i;
import p045d5.C1888j;
import p045d5.C1904z;
import p094g5.InterfaceC2527j;
import p254r5.AbstractC6487a;
import p254r5.C6496e0;
import p254r5.C6506k;
import p254r5.C6509n;
import p254r5.C6510o;
import p254r5.C6513r;
import p254r5.C6517v;
import p269s5.C7188c;
import p309v5.AbstractC8826h;
import p309v5.C8822d;

/* JADX INFO: renamed from: f5.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C2292d implements C1888j.c {

    /* JADX INFO: renamed from: a */
    public final C8822d f6275a;

    public C2292d(C8822d c8822d, InterfaceC2527j interfaceC2527j) {
        if (c8822d == null) {
            C1259t2.m5095a("bytes == null");
            throw null;
        }
        if (interfaceC2527j != null) {
            this.f6275a = c8822d;
        } else {
            C1259t2.m5095a("observer == null");
            throw null;
        }
    }

    @Override // p045d5.C1888j.c
    /* JADX INFO: renamed from: a */
    public void mo6695a(int i10, int i11, int i12, C1904z c1904z, int i13) {
        int size = c1904z.size();
        StringBuilder sb2 = new StringBuilder((size * 20) + 100);
        sb2.append(m8354j(i11));
        if (i13 != 0) {
            sb2.append(" // padding: " + AbstractC8826h.m33901j(i13));
        }
        sb2.append('\n');
        for (int i14 = 0; i14 < size; i14++) {
            sb2.append("  ");
            sb2.append(AbstractC8826h.m33895d(c1904z.m6941A(i14)));
            sb2.append(": ");
            sb2.append(AbstractC8826h.m33898g(c1904z.m6947y(i14)));
            sb2.append('\n');
        }
        sb2.append("  default: ");
        sb2.append(AbstractC8826h.m33898g(c1904z.m6946x()));
        throw null;
    }

    @Override // p045d5.C1888j.c
    /* JADX INFO: renamed from: b */
    public void mo6696b(int i10, int i11, int i12, int i13, C7188c c7188c, int i14) {
        String string;
        String strM33897f = i12 <= 3 ? AbstractC8826h.m33897f(i13) : AbstractC8826h.m33898g(i13);
        boolean z10 = i12 == 1;
        String strConcat = _UrlKt.FRAGMENT_ENCODE_SET;
        if (i10 == 132) {
            StringBuilder sb2 = new StringBuilder(", #");
            sb2.append(i12 <= 3 ? AbstractC8826h.m33893b(i14) : AbstractC8826h.m33894c(i14));
            string = sb2.toString();
        } else {
            string = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        if (c7188c.m28408B()) {
            strConcat = (z10 ? "," : " //").concat(" category-2");
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(m8354j(i11));
        sb3.append(z10 ? " // " : " ");
        sb3.append(strM33897f);
        sb3.append(string);
        sb3.append(strConcat);
        throw null;
    }

    @Override // p045d5.C1888j.c
    /* JADX INFO: renamed from: c */
    public void mo6697c(int i10, int i11, int i12, AbstractC6487a abstractC6487a, int i13) {
        String str;
        if (abstractC6487a instanceof C6513r) {
            mo6699e(i10, i11, i12, null);
            return;
        }
        if (abstractC6487a instanceof C6510o) {
            m8357m(i10, i11, i12, i13);
            return;
        }
        if (abstractC6487a instanceof C6517v) {
            m8358n(i10, i11, i12, ((C6517v) abstractC6487a).m25801u());
            return;
        }
        if (abstractC6487a instanceof C6509n) {
            m8356l(i10, i11, i12, ((C6509n) abstractC6487a).mo25796s());
            return;
        }
        if (abstractC6487a instanceof C6506k) {
            m8355k(i10, i11, i12, ((C6506k) abstractC6487a).mo25797t());
            return;
        }
        if (i13 == 0) {
            str = _UrlKt.FRAGMENT_ENCODE_SET;
        } else if (i10 == 197) {
            str = ", " + AbstractC8826h.m33897f(i13);
        } else {
            str = ", " + AbstractC8826h.m33898g(i13);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m8354j(i11));
        sb2.append(" ");
        sb2.append(abstractC6487a);
        sb2.append(str);
        throw null;
    }

    @Override // p045d5.C1888j.c
    /* JADX INFO: renamed from: d */
    public int mo6698d() {
        return -1;
    }

    @Override // p045d5.C1888j.c
    /* JADX INFO: renamed from: e */
    public void mo6699e(int i10, int i11, int i12, C7188c c7188c) {
        m8354j(i11);
        throw null;
    }

    @Override // p045d5.C1888j.c
    /* JADX INFO: renamed from: f */
    public void mo6700f(int i10, int i11, int i12, int i13) {
        String strM33898g = i12 <= 3 ? AbstractC8826h.m33898g(i13) : AbstractC8826h.m33901j(i13);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m8354j(i11));
        sb2.append(" ");
        sb2.append(strM33898g);
        throw null;
    }

    @Override // p045d5.C1888j.c
    /* JADX INFO: renamed from: h */
    public void mo6702h(int i10, int i11, C6496e0 c6496e0, ArrayList arrayList) {
        String str = i11 == 1 ? " // " : " ";
        String strMo6828g = c6496e0.m25760n().m28418n().mo6828g();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m8354j(i10));
        sb2.append(str);
        sb2.append(strMo6828g);
        throw null;
    }

    @Override // p045d5.C1888j.c
    /* JADX INFO: renamed from: i */
    public void mo6703i(int i10, int i11, int i12) {
        m8354j(i11);
        throw null;
    }

    /* JADX INFO: renamed from: j */
    public final String m8354j(int i10) {
        int iM33856l = this.f6275a.m33856l(i10);
        String strM6737b = AbstractC1887i.m6737b(iM33856l);
        if (iM33856l == 196) {
            strM6737b = strM6737b + " " + AbstractC1887i.m6737b(this.f6275a.m33856l(i10 + 1));
        }
        return AbstractC8826h.m33898g(i10) + ": " + strM6737b;
    }

    /* JADX INFO: renamed from: k */
    public final void m8355k(int i10, int i11, int i12, long j10) {
        String str;
        if (i12 != 1) {
            str = " #" + AbstractC8826h.m33902k(j10);
        } else {
            str = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m8354j(i11));
        sb2.append(str);
        sb2.append(" // ");
        sb2.append(Double.longBitsToDouble(j10));
        throw null;
    }

    /* JADX INFO: renamed from: l */
    public final void m8356l(int i10, int i11, int i12, int i13) {
        String str;
        if (i12 != 1) {
            str = " #" + AbstractC8826h.m33901j(i13);
        } else {
            str = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m8354j(i11));
        sb2.append(str);
        sb2.append(" // ");
        sb2.append(Float.intBitsToFloat(i13));
        throw null;
    }

    /* JADX INFO: renamed from: m */
    public final void m8357m(int i10, int i11, int i12, int i13) {
        String str;
        String str2 = i12 == 1 ? " // " : " ";
        int iM33856l = this.f6275a.m33856l(i11);
        if (i12 == 1 || iM33856l == 16) {
            str = "#" + AbstractC8826h.m33893b(i13);
        } else if (iM33856l == 17) {
            str = "#" + AbstractC8826h.m33894c(i13);
        } else {
            str = "#" + AbstractC8826h.m33895d(i13);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m8354j(i11));
        sb2.append(str2);
        sb2.append(str);
        throw null;
    }

    /* JADX INFO: renamed from: n */
    public final void m8358n(int i10, int i11, int i12, long j10) {
        String str = i12 == 1 ? " // " : " #";
        String strM33893b = i12 == 1 ? AbstractC8826h.m33893b((int) j10) : AbstractC8826h.m33896e(j10);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m8354j(i11));
        sb2.append(str);
        sb2.append(strM33893b);
        throw null;
    }

    @Override // p045d5.C1888j.c
    /* JADX INFO: renamed from: g */
    public void mo6701g(int i10) {
    }
}
