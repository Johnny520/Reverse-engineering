package Yue;

import Yue.InterfaceC6571;
import java.lang.Comparable;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C4023<T extends Comparable<? super T>> implements InterfaceC6571<T> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final T f8088;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final T f8089;

    public C4023(@InterfaceC6399 T t, @InterfaceC6399 T t2) {
        C5499.m17103(t, "start");
        C5499.m17103(t2, "endExclusive");
        this.f8088 = t;
        this.f8089 = t2;
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        if (obj instanceof C4023) {
            if (!isEmpty() || !((C4023) obj).isEmpty()) {
                C4023 c4023 = (C4023) obj;
                if (!C5499.m17094(mo830(), c4023.mo830()) || !C5499.m17094(mo10383(), c4023.mo10383())) {
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
        return (mo830().hashCode() * 31) + mo10383().hashCode();
    }

    @Override // Yue.InterfaceC6571
    public boolean isEmpty() {
        return InterfaceC6571.C1014.m3030(this);
    }

    @InterfaceC6399
    public String toString() {
        return mo830() + "..<" + mo10383();
    }

    @Override // Yue.InterfaceC6571
    /* JADX INFO: renamed from: ۥ */
    public boolean mo829(@InterfaceC6399 T t) {
        return InterfaceC6571.C1014.m3029(this, t);
    }

    @Override // Yue.InterfaceC6571
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public T mo830() {
        return this.f8088;
    }

    @Override // Yue.InterfaceC6571
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public T mo10383() {
        return this.f8089;
    }
}
