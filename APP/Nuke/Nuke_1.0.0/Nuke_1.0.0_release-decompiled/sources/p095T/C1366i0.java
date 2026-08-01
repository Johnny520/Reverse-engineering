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

/* JADX INFO: renamed from: T.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1366i0 extends AbstractC2091w implements Parcelable, InterfaceC2083o {
    public static final Parcelable.Creator<C1366i0> CREATOR = new C1364h0();

    /* JADX INFO: renamed from: e */
    public final InterfaceC1334Q0 f4810e;

    /* JADX INFO: renamed from: f */
    public C1332P0 f4811f;

    public C1366i0(Object obj, InterfaceC1334Q0 interfaceC1334Q0) {
        this.f4810e = interfaceC1334Q0;
        AbstractC2074f abstractC2074fM3834j = AbstractC2082n.m3834j();
        C1332P0 c1332p0 = new C1332P0(abstractC2074fM3834j.mo3791g(), obj);
        if (!(abstractC2074fM3834j instanceof C2069a)) {
            c1332p0.f7011b = new C1332P0(1, obj);
        }
        this.f4811f = c1332p0;
    }

    @Override // p158f0.InterfaceC2090v
    /* JADX INFO: renamed from: a */
    public final AbstractC2092x mo2410a() {
        return this.f4811f;
    }

    @Override // p158f0.InterfaceC2090v
    /* JADX INFO: renamed from: b */
    public final AbstractC2092x mo2505b(AbstractC2092x abstractC2092x, AbstractC2092x abstractC2092x2, AbstractC2092x abstractC2092x3) {
        if (this.f4810e.mo2498a(((C1332P0) abstractC2092x2).f4763c, ((C1332P0) abstractC2092x3).f4763c)) {
            return abstractC2092x2;
        }
        return null;
    }

    @Override // p158f0.InterfaceC2090v
    /* JADX INFO: renamed from: c */
    public final void mo2411c(AbstractC2092x abstractC2092x) {
        AbstractC1665j.m2983c(abstractC2092x, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.f4811f = (C1332P0) abstractC2092x;
    }

    @Override // p158f0.InterfaceC2083o
    /* JADX INFO: renamed from: d */
    public final InterfaceC1334Q0 mo2506d() {
        return this.f4810e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p095T.InterfaceC1339T0
    public final Object getValue() {
        return ((C1332P0) AbstractC2082n.m3844t(this.f4811f, this)).f4763c;
    }

    @Override // p095T.InterfaceC1347Y
    public final void setValue(Object obj) {
        AbstractC2074f abstractC2074fM3834j;
        C1332P0 c1332p0 = (C1332P0) AbstractC2082n.m3832h(this.f4811f);
        if (this.f4810e.mo2498a(c1332p0.f4763c, obj)) {
            return;
        }
        C1332P0 c1332p02 = this.f4811f;
        synchronized (AbstractC2082n.f6972c) {
            abstractC2074fM3834j = AbstractC2082n.m3834j();
            ((C1332P0) AbstractC2082n.m3839o(c1332p02, this, abstractC2074fM3834j, c1332p0)).f4763c = obj;
        }
        AbstractC2082n.m3838n(abstractC2074fM3834j, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((C1332P0) AbstractC2082n.m3832h(this.f4811f)).f4763c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int i6;
        parcel.writeValue(getValue());
        C1357e c1357e = C1357e.f4795g;
        InterfaceC1334Q0 interfaceC1334Q0 = this.f4810e;
        if (AbstractC1665j.m2981a(interfaceC1334Q0, c1357e)) {
            i6 = 0;
        } else if (AbstractC1665j.m2981a(interfaceC1334Q0, C1357e.f4798j)) {
            i6 = 1;
        } else {
            if (!AbstractC1665j.m2981a(interfaceC1334Q0, C1357e.f4796h)) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i6 = 2;
        }
        parcel.writeInt(i6);
    }
}
