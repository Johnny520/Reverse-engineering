package p200nb;

import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1043k;
import p200nb.InterfaceC5541f;
import p229p9.InterfaceC6056z;

/* JADX INFO: renamed from: nb.a0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5536a0 implements InterfaceC5541f {

    /* JADX INFO: renamed from: a */
    public final String f17308a;

    /* JADX INFO: renamed from: nb.a0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC5536a0 {

        /* JADX INFO: renamed from: b */
        public final int f17309b;

        public a(int i10) {
            StringBuilder sb2 = new StringBuilder("must have at least ");
            sb2.append(i10);
            sb2.append(" value parameter");
            sb2.append(i10 > 1 ? "s" : _UrlKt.FRAGMENT_ENCODE_SET);
            super(sb2.toString(), null);
            this.f17309b = i10;
        }

        @Override // p200nb.InterfaceC5541f
        /* JADX INFO: renamed from: c */
        public boolean mo22563c(InterfaceC6056z interfaceC6056z) {
            interfaceC6056z.getClass();
            return interfaceC6056z.mo12680m().size() >= this.f17309b;
        }
    }

    /* JADX INFO: renamed from: nb.a0$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC5536a0 {

        /* JADX INFO: renamed from: b */
        public final int f17310b;

        public b(int i10) {
            super("must have exactly " + i10 + " value parameters", null);
            this.f17310b = i10;
        }

        @Override // p200nb.InterfaceC5541f
        /* JADX INFO: renamed from: c */
        public boolean mo22563c(InterfaceC6056z interfaceC6056z) {
            interfaceC6056z.getClass();
            return interfaceC6056z.mo12680m().size() == this.f17310b;
        }
    }

    /* JADX INFO: renamed from: nb.a0$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC5536a0 {

        /* JADX INFO: renamed from: b */
        public static final c f17311b = new c();

        public c() {
            super("must have no value parameters", null);
        }

        @Override // p200nb.InterfaceC5541f
        /* JADX INFO: renamed from: c */
        public boolean mo22563c(InterfaceC6056z interfaceC6056z) {
            interfaceC6056z.getClass();
            return interfaceC6056z.mo12680m().isEmpty();
        }
    }

    /* JADX INFO: renamed from: nb.a0$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d extends AbstractC5536a0 {

        /* JADX INFO: renamed from: b */
        public static final d f17312b = new d();

        public d() {
            super("must have a single value parameter", null);
        }

        @Override // p200nb.InterfaceC5541f
        /* JADX INFO: renamed from: c */
        public boolean mo22563c(InterfaceC6056z interfaceC6056z) {
            interfaceC6056z.getClass();
            return interfaceC6056z.mo12680m().size() == 1;
        }
    }

    public AbstractC5536a0(String str) {
        this.f17308a = str;
    }

    @Override // p200nb.InterfaceC5541f
    /* JADX INFO: renamed from: a */
    public String mo22561a(InterfaceC6056z interfaceC6056z) {
        return InterfaceC5541f.a.m22571a(this, interfaceC6056z);
    }

    @Override // p200nb.InterfaceC5541f
    /* JADX INFO: renamed from: b */
    public String mo22562b() {
        return this.f17308a;
    }

    public /* synthetic */ AbstractC5536a0(String str, AbstractC1043k abstractC1043k) {
        this(str);
    }
}
