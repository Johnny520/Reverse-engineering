package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۟ۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5792(version = "1.1")
public abstract class AbstractC0070<K, V> extends java.util.AbstractMap<K, V> implements java.util.Map<K, V>, Yue.InterfaceC3449 {
    public AbstractC0070() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r1 = this;
            java.util.Set r0 = r1.mo430()
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.Set<K> keySet() {
            r1 = this;
            java.util.Set r0 = r1.mo431()
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    @Yue.InterfaceC4543
    public abstract V put(K r1, V r2);

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
            r1 = this;
            int r0 = r1.mo432()
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.Collection<V> values() {
            r1 = this;
            java.util.Collection r0 = r1.m433()
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public abstract java.util.Set mo430();

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public /* bridge */ java.util.Set<java.lang.Object> mo431() {
            r1 = this;
            java.util.Set r0 = super.keySet()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public /* bridge */ int mo432() {
            r1 = this;
            int r0 = super.size()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public /* bridge */ java.util.Collection<java.lang.Object> m433() {
            r1 = this;
            java.util.Collection r0 = super.values()
            return r0
    }
}
