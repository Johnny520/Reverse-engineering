package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۟۠ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5792(version = "1.3")
public abstract class AbstractC0044 implements Yue.InterfaceC1632.InterfaceC1635 {

    @Yue.InterfaceC4418
    private final Yue.InterfaceC1632.InterfaceC1637<?> key;

    public AbstractC0044(@Yue.InterfaceC4418 Yue.InterfaceC1632.InterfaceC1637<?> r2) {
            r1 = this;
            java.lang.String r0 = "key"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.key = r2
            return
    }

    @Override // Yue.InterfaceC1632.InterfaceC1635, Yue.InterfaceC1632
    public <R> R fold(R r1, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super R, ? super Yue.InterfaceC1632.InterfaceC1635, ? extends R> r2) {
            r0 = this;
            java.lang.Object r1 = Yue.InterfaceC1632.InterfaceC1635.C1636.m7908(r0, r1, r2)
            return r1
    }

    @Override // Yue.InterfaceC1632.InterfaceC1635, Yue.InterfaceC1632
    @Yue.InterfaceC4543
    public <E extends Yue.InterfaceC1632.InterfaceC1635> E get(@Yue.InterfaceC4418 Yue.InterfaceC1632.InterfaceC1637<E> r1) {
            r0 = this;
            Yue.ۥ۟ۧۦۥ$ۥ۟ r1 = Yue.InterfaceC1632.InterfaceC1635.C1636.m7909(r0, r1)
            return r1
    }

    @Override // Yue.InterfaceC1632.InterfaceC1635
    @Yue.InterfaceC4418
    public Yue.InterfaceC1632.InterfaceC1637<?> getKey() {
            r1 = this;
            Yue.ۥ۟ۧۦۥ$ۥ۟۟<?> r0 = r1.key
            return r0
    }

    @Override // Yue.InterfaceC1632.InterfaceC1635, Yue.InterfaceC1632
    @Yue.InterfaceC4418
    public Yue.InterfaceC1632 minusKey(@Yue.InterfaceC4418 Yue.InterfaceC1632.InterfaceC1637<?> r1) {
            r0 = this;
            Yue.ۥ۟ۧۦۥ r1 = Yue.InterfaceC1632.InterfaceC1635.C1636.m7910(r0, r1)
            return r1
    }

    @Override // Yue.InterfaceC1632
    @Yue.InterfaceC4418
    public Yue.InterfaceC1632 plus(@Yue.InterfaceC4418 Yue.InterfaceC1632 r1) {
            r0 = this;
            Yue.ۥ۟ۧۦۥ r1 = Yue.InterfaceC1632.InterfaceC1635.C1636.m7911(r0, r1)
            return r1
    }
}
