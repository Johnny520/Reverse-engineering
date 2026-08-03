package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۠ۤ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7669 extends C7432<Integer> implements InterfaceC7588<Integer> {
    public C7669(int i) {
        super(1, Integer.MAX_VALUE, EnumC3602.DROP_OLDEST);
        mo19612(Integer.valueOf(i));
    }

    /* JADX DEBUG: Method merged with bridge method: getValue()Ljava/lang/Object; */
    @Override // Yue.InterfaceC7588
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public Integer getValue() {
        Integer numValueOf;
        synchronized (this) {
            numValueOf = Integer.valueOf(m23296().intValue());
        }
        return numValueOf;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public final boolean m24405(int i) {
        boolean zMo19612;
        synchronized (this) {
            zMo19612 = mo19612(Integer.valueOf(m23296().intValue() + i));
        }
        return zMo19612;
    }
}
