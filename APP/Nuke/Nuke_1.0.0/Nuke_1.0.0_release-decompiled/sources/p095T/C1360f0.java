package p095T;

import android.os.Parcel;
import android.os.Parcelable;
import p117X2.AbstractC1665j;
import p158f0.AbstractC2074f;
import p158f0.AbstractC2082n;
import p158f0.AbstractC2091w;
import p158f0.AbstractC2092x;
import p158f0.C2069a;
import p158f0.InterfaceC2083o;

/* JADX INFO: renamed from: T.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1360f0 extends AbstractC2091w implements Parcelable, InterfaceC2083o, InterfaceC1347Y, InterfaceC1339T0 {
    public static final Parcelable.Creator<C1360f0> CREATOR = new C1356d0(1);

    /* JADX INFO: renamed from: e */
    public C1328N0 f4801e;

    public C1360f0(int i5) {
        AbstractC2074f abstractC2074fM3834j = AbstractC2082n.m3834j();
        C1328N0 c1328n0 = new C1328N0(abstractC2074fM3834j.mo3791g(), i5);
        if (!(abstractC2074fM3834j instanceof C2069a)) {
            c1328n0.f7011b = new C1328N0(1, i5);
        }
        this.f4801e = c1328n0;
    }

    @Override // p158f0.InterfaceC2090v
    /* JADX INFO: renamed from: a */
    public final AbstractC2092x mo2410a() {
        return this.f4801e;
    }

    @Override // p158f0.InterfaceC2090v
    /* JADX INFO: renamed from: b */
    public final AbstractC2092x mo2505b(AbstractC2092x abstractC2092x, AbstractC2092x abstractC2092x2, AbstractC2092x abstractC2092x3) {
        if (((C1328N0) abstractC2092x2).f4753c == ((C1328N0) abstractC2092x3).f4753c) {
            return abstractC2092x2;
        }
        return null;
    }

    @Override // p158f0.InterfaceC2090v
    /* JADX INFO: renamed from: c */
    public final void mo2411c(AbstractC2092x abstractC2092x) {
        AbstractC1665j.m2983c(abstractC2092x, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f4801e = (C1328N0) abstractC2092x;
    }

    @Override // p158f0.InterfaceC2083o
    /* JADX INFO: renamed from: d */
    public final InterfaceC1334Q0 mo2506d() {
        return C1357e.f4798j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public final int m2509g() {
        return ((C1328N0) AbstractC2082n.m3844t(this.f4801e, this)).f4753c;
    }

    @Override // p095T.InterfaceC1339T0
    public Object getValue() {
        return Integer.valueOf(m2509g());
    }

    /* JADX INFO: renamed from: h */
    public final void m2510h(int i5) {
        AbstractC2074f abstractC2074fM3834j;
        C1328N0 c1328n0 = (C1328N0) AbstractC2082n.m3832h(this.f4801e);
        if (c1328n0.f4753c != i5) {
            C1328N0 c1328n02 = this.f4801e;
            synchronized (AbstractC2082n.f6972c) {
                abstractC2074fM3834j = AbstractC2082n.m3834j();
                ((C1328N0) AbstractC2082n.m3839o(c1328n02, this, abstractC2074fM3834j, c1328n0)).f4753c = i5;
            }
            AbstractC2082n.m3838n(abstractC2074fM3834j, this);
        }
    }

    @Override // p095T.InterfaceC1347Y
    public void setValue(Object obj) {
        m2510h(((Number) obj).intValue());
    }

    public final String toString() {
        return "MutableIntState(value=" + ((C1328N0) AbstractC2082n.m3832h(this.f4801e)).f4753c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeInt(m2509g());
    }
}
