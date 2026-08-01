package ad;

import java.util.Iterator;
import okhttp3.internal.http2.Http2;
import p300uc.InterfaceC8645a;
import p300uc.InterfaceC8662p;
import p375zc.AbstractC9939c;
import p375zc.EnumC9937b;
import p375zc.InterfaceC9971w;
import sb.AbstractC7291q;
import sb.InterfaceC7282h;

/* JADX INFO: renamed from: ad.m0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0275m0 {

    /* JADX INFO: renamed from: ad.m0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC7282h {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Iterator f675a;

        public a(Iterator it) {
            this.f675a = it;
        }

        @Override // sb.InterfaceC7282h
        public Iterator iterator() {
            return this.f675a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC7282h m810a(AbstractC9939c abstractC9939c, InterfaceC0290u interfaceC0290u, InterfaceC8645a interfaceC8645a, EnumC9937b enumC9937b) {
        abstractC9939c.getClass();
        interfaceC0290u.getClass();
        interfaceC8645a.getClass();
        enumC9937b.getClass();
        return AbstractC7291q.m28880h(new a(AbstractC0252e0.m743a(enumC9937b, abstractC9939c, AbstractC0297x0.m870a(abstractC9939c, interfaceC0290u, new char[Http2.INITIAL_MAX_FRAME_SIZE]), interfaceC8645a)));
    }

    /* JADX INFO: renamed from: b */
    public static final void m811b(AbstractC9939c abstractC9939c, InterfaceC0292v interfaceC0292v, InterfaceC8662p interfaceC8662p, Object obj) {
        abstractC9939c.getClass();
        interfaceC0292v.getClass();
        interfaceC8662p.getClass();
        new C0241a1(interfaceC0292v, abstractC9939c, EnumC0268j1.f652s, new InterfaceC9971w[EnumC0268j1.m790c().size()]).mo632G(interfaceC8662p, obj);
    }
}
