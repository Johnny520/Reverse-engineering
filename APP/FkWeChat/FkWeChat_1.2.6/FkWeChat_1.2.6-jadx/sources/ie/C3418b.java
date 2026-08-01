package ie;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.AbstractC5166e;
import me.C5164c;
import me.C5168g;
import ne.AbstractC5591c;
import ne.InterfaceC5590b;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p185m8.AbstractC5112w;
import p185m8.AbstractC5114x;
import p185m8.AbstractC5116y;
import p217oe.InterfaceC5742d;
import p299ub.AbstractC8621f0;

/* JADX INFO: renamed from: ie.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3418b implements InterfaceC5742d {

    /* JADX INFO: renamed from: b */
    public static final a f9420b = new a(null);

    @Override // p217oe.InterfaceC5742d
    /* JADX INFO: renamed from: a */
    public List mo12784a(C5164c.a aVar, C5168g c5168g, AbstractC5166e.a aVar2) {
        aVar.getClass();
        c5168g.getClass();
        aVar2.getClass();
        InterfaceC5590b interfaceC5590bM21216a = aVar2.m21216a();
        if (!AbstractC1061t.m3842c(aVar2.m21218c(), interfaceC5590bM21216a)) {
            return AbstractC5114x.m20800o();
        }
        CharSequence charSequenceM21187d = aVar.m21187d();
        int i10 = 0;
        if (!AbstractC8621f0.m33124Z(charSequenceM21187d, '|', false, 2, null)) {
            return AbstractC5114x.m20800o();
        }
        List listM12783a = C3417a.f9416h.m12783a(charSequenceM21187d);
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(listM12783a, 10));
        int i11 = 0;
        for (Object obj : listM12783a) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC5114x.m20810y();
            }
            arrayList.add(Boolean.valueOf((i11 > 0 && i11 < AbstractC5114x.m20802q(listM12783a)) || !AbstractC8621f0.m33156p0((String) obj)));
            i11 = i12;
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((Boolean) it.next()).booleanValue() && (i10 = i10 + 1) < 0) {
                    AbstractC5114x.m20809x();
                }
            }
        }
        if (i10 == 0) {
            return AbstractC5114x.m20800o();
        }
        CharSequence charSequenceM12786c = m12786c(aVar, interfaceC5590bM21216a);
        return charSequenceM12786c == null ? AbstractC5114x.m20800o() : f9420b.m12787a(charSequenceM12786c) == i10 ? AbstractC5112w.m20789e(new C3417a(aVar, interfaceC5590bM21216a, c5168g, i10)) : AbstractC5114x.m20800o();
    }

    @Override // p217oe.InterfaceC5742d
    /* JADX INFO: renamed from: b */
    public boolean mo12785b(C5164c.a aVar, InterfaceC5590b interfaceC5590b) {
        aVar.getClass();
        interfaceC5590b.getClass();
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final CharSequence m12786c(C5164c.a aVar, InterfaceC5590b interfaceC5590b) {
        String strM21188e = aVar.m21188e();
        if (strM21188e == null) {
            return null;
        }
        InterfaceC5590b interfaceC5590bMo22672e = interfaceC5590b.mo22672e(aVar.m21195l());
        if (AbstractC5591c.m22693e(interfaceC5590bMo22672e, interfaceC5590b)) {
            return AbstractC5591c.m22691c(interfaceC5590bMo22672e, strM21188e);
        }
        return null;
    }

    /* JADX INFO: renamed from: ie.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m12787a(CharSequence charSequence) {
            charSequence.getClass();
            int iM12788b = m12788b(charSequence, 0);
            if (iM12788b < charSequence.length() && charSequence.charAt(iM12788b) == '|') {
                iM12788b++;
            }
            int i10 = 0;
            while (iM12788b < charSequence.length()) {
                int iM12788b2 = m12788b(charSequence, iM12788b);
                if (iM12788b2 < charSequence.length() && charSequence.charAt(iM12788b2) == ':') {
                    iM12788b2 = m12788b(charSequence, iM12788b2 + 1);
                }
                int i11 = 0;
                while (iM12788b2 < charSequence.length() && charSequence.charAt(iM12788b2) == '-') {
                    iM12788b2++;
                    i11++;
                }
                if (i11 < 1) {
                    return 0;
                }
                i10++;
                iM12788b = m12788b(charSequence, iM12788b2);
                if (iM12788b < charSequence.length() && charSequence.charAt(iM12788b) == ':') {
                    iM12788b = m12788b(charSequence, iM12788b + 1);
                }
                if (iM12788b >= charSequence.length() || charSequence.charAt(iM12788b) != '|') {
                    break;
                }
                iM12788b = m12788b(charSequence, iM12788b + 1);
            }
            if (iM12788b == charSequence.length()) {
                return i10;
            }
            return 0;
        }

        /* JADX INFO: renamed from: b */
        public final int m12788b(CharSequence charSequence, int i10) {
            charSequence.getClass();
            while (i10 < charSequence.length() && (charSequence.charAt(i10) == ' ' || charSequence.charAt(i10) == '\t')) {
                i10++;
            }
            return i10;
        }

        public a() {
        }
    }
}
