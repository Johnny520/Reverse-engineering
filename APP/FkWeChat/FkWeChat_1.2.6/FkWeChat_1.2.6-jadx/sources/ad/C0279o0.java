package ad;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1052o0;
import p024b9.AbstractC1061t;
import p185m8.AbstractC5068b1;
import p185m8.AbstractC5071c1;
import p185m8.AbstractC5109u0;
import p329wc.AbstractC9216d;
import p329wc.AbstractC9224l;
import p329wc.InterfaceC9218f;
import p345xc.InterfaceC9485c;
import p361yc.AbstractC9784y0;
import p375zc.AbstractC9939c;
import p375zc.AbstractC9956k0;
import p375zc.AbstractC9957l;
import p375zc.AbstractC9960m0;
import p375zc.AbstractC9961n;
import p375zc.C9944e0;
import p375zc.C9950h0;

/* JADX INFO: renamed from: ad.o0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C0279o0 extends AbstractC0245c {

    /* JADX INFO: renamed from: h */
    public final C9950h0 f681h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC9218f f682i;

    /* JADX INFO: renamed from: j */
    public int f683j;

    /* JADX INFO: renamed from: k */
    public boolean f684k;

    public /* synthetic */ C0279o0(AbstractC9939c abstractC9939c, C9950h0 c9950h0, String str, InterfaceC9218f interfaceC9218f, int i10, AbstractC1043k abstractC1043k) {
        this(abstractC9939c, c9950h0, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : interfaceC9218f);
    }

    /* JADX INFO: renamed from: B0 */
    public final AbstractC9957l m836B0(String str) {
        str.getClass();
        return (AbstractC9957l) mo693y0().get(str);
    }

    @Override // ad.AbstractC0245c
    /* JADX INFO: renamed from: C0 */
    public C9950h0 mo693y0() {
        return this.f681h;
    }

    /* JADX INFO: renamed from: D0 */
    public final boolean m838D0(InterfaceC9218f interfaceC9218f, int i10) {
        boolean z10 = (mo673b().m38514f().m38557j() || interfaceC9218f.mo35895i(i10) || !interfaceC9218f.mo35894h(i10).mo35889c()) ? false : true;
        this.f684k = z10;
        return z10;
    }

    @Override // ad.AbstractC0245c, p345xc.InterfaceC9487e
    /* JADX INFO: renamed from: c */
    public InterfaceC9485c mo674c(InterfaceC9218f interfaceC9218f) {
        interfaceC9218f.getClass();
        if (interfaceC9218f != this.f682i) {
            return super.mo674c(interfaceC9218f);
        }
        AbstractC9939c abstractC9939cMo673b = mo673b();
        AbstractC9957l abstractC9957lM679l0 = m679l0();
        String strMo35888a = this.f682i.mo35888a();
        if (abstractC9957lM679l0 instanceof C9950h0) {
            return new C0279o0(abstractC9939cMo673b, (C9950h0) abstractC9957lM679l0, m692x0(), this.f682i);
        }
        throw AbstractC0246c0.m700f(-1, "Expected " + AbstractC1052o0.m3807b(C9950h0.class).mo3794w() + ", but had " + AbstractC1052o0.m3807b(abstractC9957lM679l0.getClass()).mo3794w() + " as the serialized body of " + strMo35888a + " at element: " + m38019h0(), abstractC9957lM679l0.toString());
    }

    @Override // ad.AbstractC0245c, p345xc.InterfaceC9485c
    /* JADX INFO: renamed from: d */
    public void mo675d(InterfaceC9218f interfaceC9218f) {
        Set setM20503l;
        interfaceC9218f.getClass();
        if (AbstractC0261h0.m772l(interfaceC9218f, mo673b()) || (interfaceC9218f.mo35896j() instanceof AbstractC9216d)) {
            return;
        }
        AbstractC0261h0.m773m(interfaceC9218f, mo673b());
        if (this.f610g.m38562o()) {
            Set setM38086a = AbstractC9784y0.m38086a(interfaceC9218f);
            Map map = (Map) AbstractC9960m0.m38573a(mo673b()).m844a(interfaceC9218f, AbstractC0261h0.m766f());
            Set setKeySet = map != null ? map.keySet() : null;
            if (setKeySet == null) {
                setKeySet = AbstractC5068b1.m20483e();
            }
            setM20503l = AbstractC5071c1.m20503l(setM38086a, setKeySet);
        } else {
            setM20503l = AbstractC9784y0.m38086a(interfaceC9218f);
        }
        for (String str : mo693y0().keySet()) {
            if (!setM20503l.contains(str) && !AbstractC1061t.m3842c(str, m692x0())) {
                throw AbstractC0246c0.m699e(-1, "Encountered an unknown key '" + str + "' at element: " + m38019h0() + "\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: " + ((Object) AbstractC0246c0.m704j(mo693y0().toString(), 0, 1, null)));
            }
        }
    }

    @Override // p361yc.AbstractC9748q1
    /* JADX INFO: renamed from: e0 */
    public String mo839e0(InterfaceC9218f interfaceC9218f, int i10) {
        Object next;
        interfaceC9218f.getClass();
        AbstractC0261h0.m773m(interfaceC9218f, mo673b());
        String strMo35892f = interfaceC9218f.mo35892f(i10);
        if (!this.f610g.m38562o() || mo693y0().keySet().contains(strMo35892f)) {
            return strMo35892f;
        }
        Map mapM765e = AbstractC0261h0.m765e(mo673b(), interfaceC9218f);
        Iterator<T> it = mo693y0().keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Integer num = (Integer) mapM765e.get((String) next);
            if (num != null && num.intValue() == i10) {
                break;
            }
        }
        String str = (String) next;
        return str != null ? str : strMo35892f;
    }

    @Override // ad.AbstractC0245c
    /* JADX INFO: renamed from: k0 */
    public AbstractC9957l mo678k0(String str) {
        str.getClass();
        return (AbstractC9957l) AbstractC5109u0.m20769j(mo693y0(), str);
    }

    @Override // ad.AbstractC0245c, p345xc.InterfaceC9487e
    /* JADX INFO: renamed from: p */
    public boolean mo683p() {
        return !this.f684k && super.mo683p();
    }

    @Override // p345xc.InterfaceC9485c
    /* JADX INFO: renamed from: v */
    public int mo788v(InterfaceC9218f interfaceC9218f) {
        interfaceC9218f.getClass();
        while (this.f683j < interfaceC9218f.mo35891e()) {
            int i10 = this.f683j;
            this.f683j = i10 + 1;
            String strMo37836Y = mo37836Y(interfaceC9218f, i10);
            int i11 = this.f683j - 1;
            this.f684k = false;
            if (mo693y0().containsKey(strMo37836Y) || m838D0(interfaceC9218f, i11)) {
                if (this.f610g.m38554g()) {
                    AbstractC9939c abstractC9939cMo673b = mo673b();
                    boolean zMo35895i = interfaceC9218f.mo35895i(i11);
                    InterfaceC9218f interfaceC9218fMo35894h = interfaceC9218f.mo35894h(i11);
                    if (!zMo35895i || interfaceC9218fMo35894h.mo35889c() || !(m836B0(strMo37836Y) instanceof C9944e0)) {
                        if (AbstractC1061t.m3842c(interfaceC9218fMo35894h.mo35896j(), AbstractC9224l.b.f31485a)) {
                            if (interfaceC9218fMo35894h.mo35889c() && (m836B0(strMo37836Y) instanceof C9944e0)) {
                                return i11;
                            }
                            AbstractC9957l abstractC9957lM836B0 = m836B0(strMo37836Y);
                            AbstractC9956k0 abstractC9956k0 = abstractC9957lM836B0 instanceof AbstractC9956k0 ? (AbstractC9956k0) abstractC9957lM836B0 : null;
                            String strM38579f = abstractC9956k0 != null ? AbstractC9961n.m38579f(abstractC9956k0) : null;
                            if (strM38579f == null) {
                                return i11;
                            }
                            int iM768h = AbstractC0261h0.m768h(interfaceC9218fMo35894h, abstractC9939cMo673b, strM38579f);
                            boolean z10 = !abstractC9939cMo673b.m38514f().m38557j() && interfaceC9218fMo35894h.mo35889c();
                            if (iM768h != -3 || ((!zMo35895i && !z10) || m838D0(interfaceC9218f, i11))) {
                            }
                        }
                    }
                }
                return i11;
            }
        }
        return -1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0279o0(AbstractC9939c abstractC9939c, C9950h0 c9950h0, String str, InterfaceC9218f interfaceC9218f) {
        super(abstractC9939c, c9950h0, str, null);
        abstractC9939c.getClass();
        c9950h0.getClass();
        this.f681h = c9950h0;
        this.f682i = interfaceC9218f;
    }
}
