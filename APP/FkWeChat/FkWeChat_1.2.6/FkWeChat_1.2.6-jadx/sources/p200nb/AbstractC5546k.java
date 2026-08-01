package p200nb;

import p024b9.AbstractC1043k;
import p200nb.InterfaceC5541f;
import p229p9.InterfaceC6056z;

/* JADX INFO: renamed from: nb.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5546k implements InterfaceC5541f {

    /* JADX INFO: renamed from: a */
    public final String f17334a;

    /* JADX INFO: renamed from: nb.k$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC5546k {

        /* JADX INFO: renamed from: b */
        public static final a f17335b = new a();

        public a() {
            super("must be a member function", null);
        }

        @Override // p200nb.InterfaceC5541f
        /* JADX INFO: renamed from: c */
        public boolean mo22563c(InterfaceC6056z interfaceC6056z) {
            interfaceC6056z.getClass();
            return interfaceC6056z.mo12679k0() != null;
        }
    }

    /* JADX INFO: renamed from: nb.k$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC5546k {

        /* JADX INFO: renamed from: b */
        public static final b f17336b = new b();

        public b() {
            super("must be a member or an extension function", null);
        }

        @Override // p200nb.InterfaceC5541f
        /* JADX INFO: renamed from: c */
        public boolean mo22563c(InterfaceC6056z interfaceC6056z) {
            interfaceC6056z.getClass();
            return (interfaceC6056z.mo12679k0() == null && interfaceC6056z.mo12682q0() == null) ? false : true;
        }
    }

    public AbstractC5546k(String str) {
        this.f17334a = str;
    }

    @Override // p200nb.InterfaceC5541f
    /* JADX INFO: renamed from: a */
    public String mo22561a(InterfaceC6056z interfaceC6056z) {
        return InterfaceC5541f.a.m22571a(this, interfaceC6056z);
    }

    @Override // p200nb.InterfaceC5541f
    /* JADX INFO: renamed from: b */
    public String mo22562b() {
        return this.f17334a;
    }

    public /* synthetic */ AbstractC5546k(String str, AbstractC1043k abstractC1043k) {
        this(str);
    }
}
