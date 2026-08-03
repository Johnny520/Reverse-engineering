package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۦۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
public class C2335<K, V> extends Yue.C5471<K, V> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final java.util.HashMap<K, Yue.C5471.C5474<K, V>> f7600;

    public C2335() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f7600 = r0
            return
    }

    public boolean contains(K r2) {
            r1 = this;
            java.util.HashMap<K, Yue.ۥۡۧۢۥ$ۥ۟۟<K, V>> r0 = r1.f7600
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Override // Yue.C5471
    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public Yue.C5471.C5474<K, V> mo10710(K r2) {
            r1 = this;
            java.util.HashMap<K, Yue.ۥۡۧۢۥ$ۥ۟۟<K, V>> r0 = r1.f7600
            java.lang.Object r2 = r0.get(r2)
            Yue.ۥۡۧۢۥ$ۥ۟۟ r2 = (Yue.C5471.C5474) r2
            return r2
    }

    @Override // Yue.C5471
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public V mo10711(@Yue.InterfaceC4410 K r2, @Yue.InterfaceC4410 V r3) {
            r1 = this;
            Yue.ۥۡۧۢۥ$ۥ۟۟ r0 = r1.mo10710(r2)
            if (r0 == 0) goto L9
            V r2 = r0.f20284
            return r2
        L9:
            java.util.HashMap<K, Yue.ۥۡۧۢۥ$ۥ۟۟<K, V>> r0 = r1.f7600
            Yue.ۥۡۧۢۥ$ۥ۟۟ r3 = r1.m20629(r2, r3)
            r0.put(r2, r3)
            r2 = 0
            return r2
    }

    @Override // Yue.C5471
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public V mo10712(@Yue.InterfaceC4410 K r3) {
            r2 = this;
            java.lang.Object r0 = super.mo10712(r3)
            java.util.HashMap<K, Yue.ۥۡۧۢۥ$ۥ۟۟<K, V>> r1 = r2.f7600
            r1.remove(r3)
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public java.util.Map.Entry<K, V> m10713(K r2) {
            r1 = this;
            boolean r0 = r1.contains(r2)
            if (r0 == 0) goto L11
            java.util.HashMap<K, Yue.ۥۡۧۢۥ$ۥ۟۟<K, V>> r0 = r1.f7600
            java.lang.Object r2 = r0.get(r2)
            Yue.ۥۡۧۢۥ$ۥ۟۟ r2 = (Yue.C5471.C5474) r2
            Yue.ۥۡۧۢۥ$ۥ۟۟<K, V> r2 = r2.f20286
            return r2
        L11:
            r2 = 0
            return r2
    }
}
