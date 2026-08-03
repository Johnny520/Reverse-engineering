package Yue;

import java.io.Serializable;
import java.lang.Enum;

/* JADX INFO: renamed from: Yue.ۥ۠ۡ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7470(version = "1.8")
public final class C4656<T extends Enum<T>> extends AbstractC2986<T> implements InterfaceC4654<T>, Serializable {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final T[] f9983;

    public C4656(@InterfaceC6399 T[] tArr) {
        C5499.m17103(tArr, "entries");
        this.f9983 = tArr;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    private final Object m13998() {
        return new C4657(this.f9983);
    }

    @Override // Yue.AbstractC2979, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return m1608((Enum) obj);
        }
        return false;
    }

    @Override // Yue.AbstractC2986, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return m14000((Enum) obj);
        }
        return -1;
    }

    @Override // Yue.AbstractC2986, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return m14001((Enum) obj);
        }
        return -1;
    }

    @Override // Yue.AbstractC2986, Yue.AbstractC2979
    /* JADX INFO: renamed from: ۥ */
    public int mo41() {
        return this.f9983.length;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public boolean m1608(@InterfaceC6399 T t) {
        C5499.m17103(t, "element");
        return ((Enum) C3411.m7895(this.f9983, t.ordinal())) == t;
    }

    /* JADX DEBUG: Method merged with bridge method: get(I)Ljava/lang/Object; */
    @Override // Yue.AbstractC2986, java.util.List
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public T get(int i) {
        AbstractC2986.f4328.m52(i, this.f9983.length);
        return this.f9983[i];
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int m14000(@InterfaceC6399 T t) {
        C5499.m17103(t, "element");
        int iOrdinal = t.ordinal();
        if (((Enum) C3411.m7895(this.f9983, iOrdinal)) == t) {
            return iOrdinal;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int m14001(@InterfaceC6399 T t) {
        C5499.m17103(t, "element");
        return indexOf(t);
    }
}
