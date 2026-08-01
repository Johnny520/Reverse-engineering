package p247qe;

import java.util.List;
import me.AbstractC5166e;
import me.C5164c;
import me.C5168g;
import ne.InterfaceC5590b;
import p080f9.C2363j;
import p185m8.AbstractC5112w;
import p185m8.AbstractC5114x;
import p217oe.InterfaceC5742d;
import p299ub.AbstractC8610a;
import pe.C6068a;

/* JADX INFO: renamed from: qe.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6416a implements InterfaceC5742d {
    @Override // p217oe.InterfaceC5742d
    /* JADX INFO: renamed from: a */
    public List mo12784a(C5164c.a aVar, C5168g c5168g, AbstractC5166e.a aVar2) {
        aVar.getClass();
        c5168g.getClass();
        aVar2.getClass();
        C2363j c2363jM25437d = m25437d(aVar);
        return c2363jM25437d != null ? AbstractC5112w.m20789e(new C6068a(aVar2.m21216a(), c5168g, c2363jM25437d, m25436c(aVar, c2363jM25437d.m8561p()), aVar.m21190g())) : AbstractC5114x.m20800o();
    }

    @Override // p217oe.InterfaceC5742d
    /* JADX INFO: renamed from: b */
    public boolean mo12785b(C5164c.a aVar, InterfaceC5590b interfaceC5590b) {
        aVar.getClass();
        interfaceC5590b.getClass();
        return m25437d(aVar) != null;
    }

    /* JADX INFO: renamed from: c */
    public final int m25436c(C5164c.a aVar, int i10) {
        CharSequence charSequenceM21187d = aVar.m21187d();
        int length = charSequenceM21187d.length() - 1;
        while (length > i10 && AbstractC8610a.m33055c(charSequenceM21187d.charAt(length))) {
            length--;
        }
        while (length > i10 && charSequenceM21187d.charAt(length) == '#' && charSequenceM21187d.charAt(length - 1) != '\\') {
            length--;
        }
        int i11 = length + 1;
        return (i11 < charSequenceM21187d.length() && AbstractC8610a.m33055c(charSequenceM21187d.charAt(length)) && charSequenceM21187d.charAt(i11) == '#') ? aVar.m21191h() + length + 1 : aVar.m21191h() + charSequenceM21187d.length();
    }

    /* JADX INFO: renamed from: d */
    public final C2363j m25437d(C5164c.a aVar) {
        if (aVar.m21192i() != -1) {
            CharSequence charSequenceM21187d = aVar.m21187d();
            int iM23240c = InterfaceC5742d.a.m23240c(InterfaceC5742d.f18111a, charSequenceM21187d, 0, 2, null);
            if (iM23240c < charSequenceM21187d.length() && charSequenceM21187d.charAt(iM23240c) == '#') {
                int i10 = iM23240c;
                for (int i11 = 0; i11 < 6; i11++) {
                    if (i10 < charSequenceM21187d.length() && charSequenceM21187d.charAt(i10) == '#') {
                        i10++;
                    }
                }
                if (i10 >= charSequenceM21187d.length() || AbstractC5114x.m20803r(' ', '\t').contains(Character.valueOf(charSequenceM21187d.charAt(i10)))) {
                    return new C2363j(iM23240c, i10 - 1);
                }
                return null;
            }
        }
        return null;
    }
}
