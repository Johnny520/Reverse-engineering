package gb;

import java.util.Set;
import p229p9.InterfaceC6018l1;

/* JADX INFO: renamed from: gb.g0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2665g0 {

    /* JADX INFO: renamed from: a */
    public final EnumC2671h2 f7000a;

    /* JADX INFO: renamed from: b */
    public final Set f7001b;

    /* JADX INFO: renamed from: c */
    public final AbstractC2650c1 f7002c;

    public AbstractC2665g0(EnumC2671h2 enumC2671h2, Set set, AbstractC2650c1 abstractC2650c1) {
        enumC2671h2.getClass();
        this.f7000a = enumC2671h2;
        this.f7001b = set;
        this.f7002c = abstractC2650c1;
    }

    /* JADX INFO: renamed from: a */
    public abstract AbstractC2650c1 mo6984a();

    /* JADX INFO: renamed from: b */
    public abstract EnumC2671h2 mo6985b();

    /* JADX INFO: renamed from: c */
    public abstract Set mo6986c();

    /* JADX INFO: renamed from: d */
    public abstract AbstractC2665g0 mo6987d(InterfaceC6018l1 interfaceC6018l1);

    public abstract int hashCode();
}
