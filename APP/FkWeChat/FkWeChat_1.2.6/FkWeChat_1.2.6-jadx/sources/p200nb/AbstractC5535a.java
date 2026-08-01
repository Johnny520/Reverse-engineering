package p200nb;

import java.util.Iterator;
import p036c9.InterfaceC1400a;
import p098g9.InterfaceC2549c;

/* JADX INFO: renamed from: nb.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5535a implements Iterable, InterfaceC1400a {

    /* JADX INFO: renamed from: nb.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static abstract class a {

        /* JADX INFO: renamed from: a */
        public final int f17307a;

        public a(int i10) {
            this.f17307a = i10;
        }

        /* JADX INFO: renamed from: c */
        public final Object m22560c(AbstractC5535a abstractC5535a) {
            abstractC5535a.getClass();
            return abstractC5535a.mo22557a().get(this.f17307a);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract AbstractC5538c mo22557a();

    /* JADX INFO: renamed from: c */
    public abstract AbstractC5561z mo9576c();

    /* JADX INFO: renamed from: e */
    public final void m22558e(InterfaceC2549c interfaceC2549c, Object obj) {
        interfaceC2549c.getClass();
        obj.getClass();
        String strMo3792u = interfaceC2549c.mo3792u();
        strMo3792u.getClass();
        mo22559l(strMo3792u, obj);
    }

    public final boolean isEmpty() {
        return mo22557a().mo22566a() == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return mo22557a().iterator();
    }

    /* JADX INFO: renamed from: l */
    public abstract void mo22559l(String str, Object obj);
}
