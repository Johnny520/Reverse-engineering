package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p */
/* JADX INFO: loaded from: classes.dex */
public final class C2342p implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8221a;

    public /* synthetic */ C2342p(int r1) {
        this.f8221a = r1;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel r2, ClassLoader r3) {
        switch(this.f8221a) {
            case 0: goto L25;
            case 1: goto L23;
            case 2: goto L21;
            case 3: goto L19;
            case 4: goto L17;
            case 5: goto L15;
            case 6: goto L13;
            case 7: goto L11;
            case 8: goto L9;
            case 9: goto L7;
            default: goto L5;
        };
    L5:
        return new C0187EE(r2, r3);
    L7:
        return new C2491sB(r2, r3);
    L9:
        return new C2705xA(r2, r3);
    L11:
        return new C2254my(r2, r3);
    L13:
        return new C2775yv(r2, r3);
    L15:
        return new C0205Eq(r2, r3);
    L17:
        return new C1459gi(r2, r3);
    L19:
        return new C0920Vb(r2, r3);
    L21:
        return new C1530i8(r2, r3);
    L23:
        return new C1124a6(r2, r3);
    L25:
        if (r2.readParcelable(r3) != null) goto L29;
        return AbstractC2393q.f8396b;
    L29:
        throw new IllegalStateException("superState must be null");
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int r2) {
        switch(this.f8221a) {
            case 0: goto L25;
            case 1: goto L23;
            case 2: goto L21;
            case 3: goto L19;
            case 4: goto L17;
            case 5: goto L15;
            case 6: goto L13;
            case 7: goto L11;
            case 8: goto L9;
            case 9: goto L7;
            default: goto L5;
        };
    L5:
        return new C0187EE[r2];
    L7:
        return new C2491sB[r2];
    L9:
        return new C2705xA[r2];
    L11:
        return new C2254my[r2];
    L13:
        return new C2775yv[r2];
    L15:
        return new C0205Eq[r2];
    L17:
        return new C1459gi[r2];
    L19:
        return new C0920Vb[r2];
    L21:
        return new C1530i8[r2];
    L23:
        return new C1124a6[r2];
    L25:
        return new AbstractC2393q[r2];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel r3) {
        switch(this.f8221a) {
            case 0: goto L25;
            case 1: goto L23;
            case 2: goto L21;
            case 3: goto L19;
            case 4: goto L17;
            case 5: goto L15;
            case 6: goto L13;
            case 7: goto L11;
            case 8: goto L9;
            case 9: goto L7;
            default: goto L5;
        };
    L5:
        return new C0187EE(r3, null);
    L7:
        return new C2491sB(r3, null);
    L9:
        return new C2705xA(r3, null);
    L11:
        return new C2254my(r3, null);
    L13:
        return new C2775yv(r3, null);
    L15:
        return new C0205Eq(r3, null);
    L17:
        return new C1459gi(r3, null);
    L19:
        return new C0920Vb(r3, null);
    L21:
        return new C1530i8(r3, null);
    L23:
        return new C1124a6(r3, null);
    L25:
        if (r3.readParcelable(null) != null) goto L29;
        return AbstractC2393q.f8396b;
    L29:
        throw new IllegalStateException("superState must be null");
    }
}
