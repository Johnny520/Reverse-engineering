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

/* JADX INFO: renamed from: T.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1358e0 extends AbstractC2091w implements Parcelable, InterfaceC2083o, InterfaceC1347Y, InterfaceC1339T0 {
    public static final Parcelable.Creator<C1358e0> CREATOR = new C1356d0(0);

    /* JADX INFO: renamed from: e */
    public C1326M0 f4800e;

    public C1358e0(float f2) {
        AbstractC2074f abstractC2074fM3834j = AbstractC2082n.m3834j();
        C1326M0 c1326m0 = new C1326M0(f2, abstractC2074fM3834j.mo3791g());
        if (!(abstractC2074fM3834j instanceof C2069a)) {
            c1326m0.f7011b = new C1326M0(f2, 1);
        }
        this.f4800e = c1326m0;
    }

    @Override // p158f0.InterfaceC2090v
    /* JADX INFO: renamed from: a */
    public final AbstractC2092x mo2410a() {
        return this.f4800e;
    }

    @Override // p158f0.InterfaceC2090v
    /* JADX INFO: renamed from: b */
    public final AbstractC2092x mo2505b(AbstractC2092x abstractC2092x, AbstractC2092x abstractC2092x2, AbstractC2092x abstractC2092x3) {
        if (((C1326M0) abstractC2092x2).f4751c == ((C1326M0) abstractC2092x3).f4751c) {
            return abstractC2092x2;
        }
        return null;
    }

    @Override // p158f0.InterfaceC2090v
    /* JADX INFO: renamed from: c */
    public final void mo2411c(AbstractC2092x abstractC2092x) {
        AbstractC1665j.m2983c(abstractC2092x, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f4800e = (C1326M0) abstractC2092x;
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
    public final float m2507g() {
        return ((C1326M0) AbstractC2082n.m3844t(this.f4800e, this)).f4751c;
    }

    @Override // p095T.InterfaceC1339T0
    public Object getValue() {
        return Float.valueOf(m2507g());
    }

    /* JADX INFO: renamed from: h */
    public final void m2508h(float f2) {
        AbstractC2074f abstractC2074fM3834j;
        C1326M0 c1326m0 = (C1326M0) AbstractC2082n.m3832h(this.f4800e);
        if (c1326m0.f4751c == f2) {
            return;
        }
        C1326M0 c1326m02 = this.f4800e;
        synchronized (AbstractC2082n.f6972c) {
            abstractC2074fM3834j = AbstractC2082n.m3834j();
            ((C1326M0) AbstractC2082n.m3839o(c1326m02, this, abstractC2074fM3834j, c1326m0)).f4751c = f2;
        }
        AbstractC2082n.m3838n(abstractC2074fM3834j, this);
    }

    @Override // p095T.InterfaceC1347Y
    public void setValue(Object obj) {
        m2508h(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((C1326M0) AbstractC2082n.m3832h(this.f4800e)).f4751c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeFloat(m2507g());
    }
}
