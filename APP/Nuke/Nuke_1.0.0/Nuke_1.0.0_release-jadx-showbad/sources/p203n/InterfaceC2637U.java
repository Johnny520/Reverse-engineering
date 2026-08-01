package p203n;

import p197m.EnumC2517B;

/* JADX INFO: renamed from: n.U */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2637U {
    /* JADX INFO: renamed from: a */
    Object mo4476a();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    default boolean m4585b(EnumC2517B enumC2517B, EnumC2517B enumC2517B2) {
        return enumC2517B.equals(mo4476a()) && enumC2517B2.equals(mo4477c());
    }

    /* JADX INFO: renamed from: c */
    Object mo4477c();
}
