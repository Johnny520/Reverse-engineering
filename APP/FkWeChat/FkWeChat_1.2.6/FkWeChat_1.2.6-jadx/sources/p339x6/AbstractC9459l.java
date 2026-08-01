package p339x6;

import ec.C2164o;
import ec.InterfaceC2156m;
import java.io.IOException;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.spi.SelectorProvider;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import p010a9.InterfaceC0184l;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p172l8.C4712s;
import p215oc.C5706c;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6324b;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6539h;

/* JADX INFO: renamed from: x6.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9459l implements InterfaceC9457j {

    /* JADX INFO: renamed from: q */
    public final SelectorProvider f32147q;

    /* JADX INFO: renamed from: r */
    public int f32148r;

    /* JADX INFO: renamed from: s */
    public int f32149s;

    /* JADX INFO: renamed from: x6.l$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends CancellationException {
        public a() {
            super("Closed selector");
        }
    }

    public AbstractC9459l() {
        SelectorProvider selectorProviderProvider = SelectorProvider.provider();
        selectorProviderProvider.getClass();
        this.f32147q = selectorProviderProvider;
    }

    /* JADX INFO: renamed from: G */
    public abstract void mo36808G(InterfaceC9455h interfaceC9455h);

    @Override // p339x6.InterfaceC9457j
    /* JADX INFO: renamed from: G0 */
    public final Object mo36859G0(InterfaceC9455h interfaceC9455h, EnumC9454g enumC9454g, InterfaceC5976f interfaceC5976f) throws IOException {
        int iMo36856g0 = interfaceC9455h.mo36856g0();
        int iM36853i = enumC9454g.m36853i();
        if (interfaceC9455h.isClosed()) {
            AbstractC9460m.m36874c();
            C5706c.m23089a();
            return null;
        }
        if ((iMo36856g0 & iM36853i) == 0) {
            AbstractC9460m.m36875d(iMo36856g0, iM36853i);
            C5706c.m23089a();
            return null;
        }
        C2164o c2164o = new C2164o(AbstractC6324b.m24989d(interfaceC5976f), 1);
        c2164o.m7851E();
        c2164o.mo7830B(b.f32150q);
        interfaceC9455h.mo36858y().m36822f(enumC9454g, c2164o);
        if (!c2164o.isCancelled()) {
            mo36808G(interfaceC9455h);
        }
        Object objM7875w = c2164o.m7875w();
        if (objM7875w == AbstractC6325c.m24992g()) {
            AbstractC6539h.m25860c(interfaceC5976f);
        }
        return objM7875w == AbstractC6325c.m24992g() ? objM7875w : C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: K */
    public final void m36861K(int i10) {
        this.f32149s = i10;
    }

    /* JADX INFO: renamed from: L */
    public final void m36862L(SelectionKey selectionKey, InterfaceC9455h interfaceC9455h) {
        selectionKey.attach(interfaceC9455h);
    }

    /* JADX INFO: renamed from: c */
    public final void m36863c(Selector selector, InterfaceC9455h interfaceC9455h) {
        selector.getClass();
        interfaceC9455h.getClass();
        try {
            SelectableChannel selectableChannelMo12830Z = interfaceC9455h.mo12830Z();
            SelectionKey selectionKeyKeyFor = selectableChannelMo12830Z.keyFor(selector);
            int iMo36856g0 = interfaceC9455h.mo36856g0();
            if (selectionKeyKeyFor == null) {
                if (iMo36856g0 != 0) {
                    selectableChannelMo12830Z.register(selector, iMo36856g0, interfaceC9455h);
                }
            } else if (selectionKeyKeyFor.interestOps() != iMo36856g0) {
                selectionKeyKeyFor.interestOps(iMo36856g0);
            }
            if (iMo36856g0 != 0) {
                this.f32148r++;
            }
        } catch (Throwable th) {
            SelectionKey selectionKeyKeyFor2 = interfaceC9455h.mo12830Z().keyFor(selector);
            if (selectionKeyKeyFor2 != null) {
                selectionKeyKeyFor2.cancel();
            }
            m36865h(interfaceC9455h, th);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m36864f(Selector selector, Throwable th) {
        selector.getClass();
        if (th == null) {
            th = new a();
        }
        Set<SelectionKey> setKeys = selector.keys();
        setKeys.getClass();
        for (SelectionKey selectionKey : setKeys) {
            try {
                if (selectionKey.isValid()) {
                    selectionKey.interestOps(0);
                }
            } catch (CancelledKeyException unused) {
            }
            Object objAttachment = selectionKey.attachment();
            InterfaceC9455h interfaceC9455h = objAttachment instanceof InterfaceC9455h ? (InterfaceC9455h) objAttachment : null;
            if (interfaceC9455h != null) {
                m36865h(interfaceC9455h, th);
            }
            selectionKey.cancel();
        }
    }

    @Override // p339x6.InterfaceC9457j
    public final SelectorProvider getProvider() {
        return this.f32147q;
    }

    /* JADX INFO: renamed from: h */
    public final void m36865h(InterfaceC9455h interfaceC9455h, Throwable th) {
        interfaceC9455h.getClass();
        th.getClass();
        C9451d c9451dMo36858y = interfaceC9455h.mo36858y();
        for (EnumC9454g enumC9454g : EnumC9454g.f32134r.m36854a()) {
            InterfaceC2156m interfaceC2156mM36824h = c9451dMo36858y.m36824h(enumC9454g);
            if (interfaceC2156mM36824h != null) {
                C4712s.a aVar = C4712s.f13928r;
                interfaceC2156mM36824h.resumeWith(C4712s.m18798b(AbstractC4713t.m18807a(th)));
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final int m36866j() {
        return this.f32149s;
    }

    /* JADX INFO: renamed from: l */
    public final int m36867l() {
        return this.f32148r;
    }

    /* JADX INFO: renamed from: n */
    public final InterfaceC9455h m36868n(SelectionKey selectionKey) {
        Object objAttachment = selectionKey.attachment();
        if (objAttachment instanceof InterfaceC9455h) {
            return (InterfaceC9455h) objAttachment;
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public final void m36869q(SelectionKey selectionKey) {
        InterfaceC2156m interfaceC2156mM36823g;
        selectionKey.getClass();
        try {
            int i10 = selectionKey.readyOps();
            int iInterestOps = selectionKey.interestOps();
            InterfaceC9455h interfaceC9455hM36868n = m36868n(selectionKey);
            if (interfaceC9455hM36868n == null) {
                selectionKey.cancel();
                this.f32149s++;
                return;
            }
            C9451d c9451dMo36858y = interfaceC9455hM36868n.mo36858y();
            int[] iArrM36855b = EnumC9454g.f32134r.m36855b();
            int length = iArrM36855b.length;
            for (int i11 = 0; i11 < length; i11++) {
                if ((iArrM36855b[i11] & i10) != 0 && (interfaceC2156mM36823g = c9451dMo36858y.m36823g(i11)) != null) {
                    C4712s.a aVar = C4712s.f13928r;
                    interfaceC2156mM36823g.resumeWith(C4712s.m18798b(C4700i0.f13910a));
                }
            }
            int i12 = (~i10) & iInterestOps;
            if (i12 != iInterestOps) {
                selectionKey.interestOps(i12);
            }
            if (i12 != 0) {
                this.f32148r++;
            }
        } catch (Throwable th) {
            selectionKey.cancel();
            this.f32149s++;
            InterfaceC9455h interfaceC9455hM36868n2 = m36868n(selectionKey);
            if (interfaceC9455hM36868n2 != null) {
                m36865h(interfaceC9455hM36868n2, th);
                m36862L(selectionKey, null);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m36870t(Set set, Set set2) {
        set.getClass();
        set2.getClass();
        int size = set.size();
        this.f32148r = set2.size() - size;
        this.f32149s = 0;
        if (size <= 0) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            m36869q((SelectionKey) it.next());
            it.remove();
        }
    }

    /* JADX INFO: renamed from: x6.l$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements InterfaceC0184l {

        /* JADX INFO: renamed from: q */
        public static final b f32150q = new b();

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            m36871a((Throwable) obj);
            return C4700i0.f13910a;
        }

        /* JADX INFO: renamed from: a */
        public final void m36871a(Throwable th) {
        }
    }
}
