package Yue;

import Yue.InterfaceC1632.InterfaceC1635;

/* JADX INFO: renamed from: Yue.ۥ۟۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5792(version = "1.3")
@Yue.InterfaceC2310
public abstract class AbstractC0045<B extends Yue.InterfaceC1632.InterfaceC1635, E extends B> implements Yue.InterfaceC1632.InterfaceC1637<E> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC2825<Yue.InterfaceC1632.InterfaceC1635, E> f102;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC1632.InterfaceC1637<?> f103;

    public AbstractC0045(@Yue.InterfaceC4418 Yue.InterfaceC1632.InterfaceC1637<B> r2, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super Yue.InterfaceC1632.InterfaceC1635, ? extends E> r3) {
            r1 = this;
            java.lang.String r0 = "baseKey"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "safeCast"
            Yue.C3329.m13906(r3, r0)
            r1.<init>()
            r1.f102 = r3
            boolean r3 = r2 instanceof Yue.AbstractC0045
            if (r3 == 0) goto L17
            Yue.ۥ۟۟ۡ r2 = (Yue.AbstractC0045) r2
            Yue.ۥ۟ۧۦۥ$ۥ۟۟<?> r2 = r2.f103
        L17:
            r1.f103 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final boolean m380(@Yue.InterfaceC4418 Yue.InterfaceC1632.InterfaceC1637<?> r2) {
            r1 = this;
            java.lang.String r0 = "key"
            Yue.C3329.m13906(r2, r0)
            if (r2 == r1) goto Le
            Yue.ۥ۟ۧۦۥ$ۥ۟۟<?> r0 = r1.f103
            if (r0 != r2) goto Lc
            goto Le
        Lc:
            r2 = 0
            goto Lf
        Le:
            r2 = 1
        Lf:
            return r2
    }

    /* JADX WARN: Incorrect return type in method signature: (LYue/ۥ۟ۧۦۥ$ۥ۟;)TE; */
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final Yue.InterfaceC1632.InterfaceC1635 m381(@Yue.InterfaceC4418 Yue.InterfaceC1632.InterfaceC1635 r2) {
            r1 = this;
            java.lang.String r0 = "element"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥۣ۠ۡ۟<Yue.ۥ۟ۧۦۥ$ۥ۟, E extends B> r0 = r1.f102
            java.lang.Object r2 = r0.invoke(r2)
            Yue.ۥ۟ۧۦۥ$ۥ۟ r2 = (Yue.InterfaceC1632.InterfaceC1635) r2
            return r2
    }
}
