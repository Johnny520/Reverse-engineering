package qa;

import java.io.IOException;
import java.io.InputStream;
import qa.AbstractC6344a;

/* JADX INFO: renamed from: qa.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6345b implements InterfaceC6362s {

    /* JADX INFO: renamed from: a */
    public static final C6351h f19960a = C6351h.m25181c();

    /* JADX INFO: renamed from: d */
    public final InterfaceC6360q m25023d(InterfaceC6360q interfaceC6360q) throws C6355l {
        if (interfaceC6360q == null || interfaceC6360q.mo13991a()) {
            return interfaceC6360q;
        }
        throw m25024e(interfaceC6360q).m25316a().m25261i(interfaceC6360q);
    }

    /* JADX INFO: renamed from: e */
    public final C6366w m25024e(InterfaceC6360q interfaceC6360q) {
        return interfaceC6360q instanceof AbstractC6344a ? ((AbstractC6344a) interfaceC6360q).m25018h() : new C6366w(interfaceC6360q);
    }

    @Override // qa.InterfaceC6362s
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceC6360q mo25022b(InputStream inputStream, C6351h c6351h) {
        return m25023d(m25027h(inputStream, c6351h));
    }

    @Override // qa.InterfaceC6362s
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public InterfaceC6360q mo25021a(InputStream inputStream, C6351h c6351h) {
        return m25023d(m25028i(inputStream, c6351h));
    }

    /* JADX INFO: renamed from: h */
    public InterfaceC6360q m25027h(InputStream inputStream, C6351h c6351h) throws C6355l {
        try {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return null;
            }
            return m25028i(new AbstractC6344a.a.C10183a(inputStream, C6349f.m25059A(i10, inputStream)), c6351h);
        } catch (IOException e10) {
            throw new C6355l(e10.getMessage());
        }
    }

    /* JADX INFO: renamed from: i */
    public InterfaceC6360q m25028i(InputStream inputStream, C6351h c6351h) throws C6355l {
        C6349f c6349fM25062g = C6349f.m25062g(inputStream);
        InterfaceC6360q interfaceC6360q = (InterfaceC6360q) mo13999c(c6349fM25062g, c6351h);
        try {
            c6349fM25062g.m25081a(0);
            return interfaceC6360q;
        } catch (C6355l e10) {
            throw e10.m25261i(interfaceC6360q);
        }
    }
}
