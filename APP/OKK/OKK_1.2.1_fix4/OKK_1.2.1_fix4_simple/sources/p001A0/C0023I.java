package p001A0;

import android.os.Parcel;
import android.os.Parcelable;
import p019K.AbstractC0239b;
import p037U.C0351K;
import p057g.C0871L0;
import p068l0.C0980b;
import p070m0.C0992b;
import p078r.C1063f;
import p081s0.C1067a;
import p090y0.C1141c;

/* JADX INFO: renamed from: A0.I */
/* JADX INFO: loaded from: classes.dex */
public final class C0023I implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61a;

    public /* synthetic */ C0023I(int r1) {
        this.f61a = r1;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel r2, ClassLoader r3) {
        switch(this.f61a) {
            case 0: goto L25;
            case 1: goto L19;
            case 2: goto L17;
            case 3: goto L15;
            case 4: goto L13;
            case 5: goto L11;
            case 6: goto L9;
            case 7: goto L7;
            default: goto L5;
        };
    L5:
        return new C1141c(r2, r3);
    L7:
        return new C1067a(r2, r3);
    L9:
        return new C1063f(r2, r3);
    L11:
        return new C0992b(r2, r3);
    L13:
        return new C0980b(r2, r3);
    L15:
        return new C0871L0(r2, r3);
    L17:
        return new C0351K(r2, r3);
    L19:
        if (r2.readParcelable(r3) != null) goto L23;
        return AbstractC0239b.f480b;
    L23:
        throw new IllegalStateException("superState must be null");
    L25:
        return new C0024J(r2, r3);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int r2) {
        switch(this.f61a) {
            case 0: goto L21;
            case 1: goto L19;
            case 2: goto L17;
            case 3: goto L15;
            case 4: goto L13;
            case 5: goto L11;
            case 6: goto L9;
            case 7: goto L7;
            default: goto L5;
        };
    L5:
        return new C1141c[r2];
    L7:
        return new C1067a[r2];
    L9:
        return new C1063f[r2];
    L11:
        return new C0992b[r2];
    L13:
        return new C0980b[r2];
    L15:
        return new C0871L0[r2];
    L17:
        return new C0351K[r2];
    L19:
        return new AbstractC0239b[r2];
    L21:
        return new C0024J[r2];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel r3) {
        switch(this.f61a) {
            case 0: goto L25;
            case 1: goto L19;
            case 2: goto L17;
            case 3: goto L15;
            case 4: goto L13;
            case 5: goto L11;
            case 6: goto L9;
            case 7: goto L7;
            default: goto L5;
        };
    L5:
        return new C1141c(r3, null);
    L7:
        return new C1067a(r3, null);
    L9:
        return new C1063f(r3, null);
    L11:
        return new C0992b(r3, null);
    L13:
        return new C0980b(r3, null);
    L15:
        return new C0871L0(r3, null);
    L17:
        return new C0351K(r3, null);
    L19:
        if (r3.readParcelable(null) != null) goto L23;
        return AbstractC0239b.f480b;
    L23:
        throw new IllegalStateException("superState must be null");
    L25:
        return new C0024J(r3, null);
    }
}
