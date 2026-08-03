package Yue;

import Yue.InterfaceC3854;
import java.lang.Comparable;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۡۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C4024<T extends Comparable<? super T>> implements InterfaceC3854<T> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final T f8090;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final T f8091;

    public C4024(@InterfaceC6399 T t, @InterfaceC6399 T t2) {
        C5499.m17103(t, "start");
        C5499.m17103(t2, "endInclusive");
        this.f8090 = t;
        this.f8091 = t2;
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        if (obj instanceof C4024) {
            if (!isEmpty() || !((C4024) obj).isEmpty()) {
                C4024 c4024 = (C4024) obj;
                if (!C5499.m17094(mo830(), c4024.mo830()) || !C5499.m17094(mo10384(), c4024.mo10384())) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (mo830().hashCode() * 31) + mo10384().hashCode();
    }

    @Override // Yue.InterfaceC3854, Yue.InterfaceC6571
    public boolean isEmpty() {
        return InterfaceC3854.C0274.m909(this);
    }

    @InterfaceC6399
    public String toString() {
        return mo830() + ".." + mo10384();
    }

    @Override // Yue.InterfaceC3854, Yue.InterfaceC6571
    /* JADX INFO: renamed from: ۥ */
    public boolean mo829(@InterfaceC6399 T t) {
        return InterfaceC3854.C0274.m908(this, t);
    }

    @Override // Yue.InterfaceC3854, Yue.InterfaceC6571
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public T mo830() {
        return this.f8090;
    }

    @Override // Yue.InterfaceC3854
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public T mo10384() {
        return this.f8091;
    }
}
