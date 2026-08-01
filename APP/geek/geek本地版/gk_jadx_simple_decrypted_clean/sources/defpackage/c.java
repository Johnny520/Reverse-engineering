package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public /* synthetic */ c(int r1) {
        this.a = r1;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel r2, ClassLoader r3) {
        switch(this.a) {
            case 0: goto L23;
            case 1: goto L21;
            case 2: goto L19;
            case 3: goto L17;
            case 4: goto L15;
            case 5: goto L13;
            case 6: goto L11;
            case 7: goto L9;
            case 8: goto L7;
            default: goto L5;
        };
    L5:
        return new i70(r2, r3);
    L7:
        return new g60(r2, r3);
    L9:
        return new t30(r2, r3);
    L11:
        return new g20(r2, r3);
    L13:
        return new vz(r2, r3);
    L15:
        return new lt(r2, r3);
    L17:
        return new be(r2, r3);
    L19:
        return new ba(r2, r3);
    L21:
        return new t7(r2, r3);
    L23:
        if (r2.readParcelable(r3) != null) goto L27;
        return d.b;
    L27:
        throw new IllegalStateException("superState must be null");
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int r2) {
        switch(this.a) {
            case 0: goto L23;
            case 1: goto L21;
            case 2: goto L19;
            case 3: goto L17;
            case 4: goto L15;
            case 5: goto L13;
            case 6: goto L11;
            case 7: goto L9;
            case 8: goto L7;
            default: goto L5;
        };
    L5:
        return new i70[r2];
    L7:
        return new g60[r2];
    L9:
        return new t30[r2];
    L11:
        return new g20[r2];
    L13:
        return new vz[r2];
    L15:
        return new lt[r2];
    L17:
        return new be[r2];
    L19:
        return new ba[r2];
    L21:
        return new t7[r2];
    L23:
        return new d[r2];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel r3) {
        switch(this.a) {
            case 0: goto L23;
            case 1: goto L21;
            case 2: goto L19;
            case 3: goto L17;
            case 4: goto L15;
            case 5: goto L13;
            case 6: goto L11;
            case 7: goto L9;
            case 8: goto L7;
            default: goto L5;
        };
    L5:
        return new i70(r3, null);
    L7:
        return new g60(r3, null);
    L9:
        return new t30(r3, null);
    L11:
        return new g20(r3, null);
    L13:
        return new vz(r3, null);
    L15:
        return new lt(r3, null);
    L17:
        return new be(r3, null);
    L19:
        return new ba(r3, null);
    L21:
        return new t7(r3, null);
    L23:
        if (r3.readParcelable(null) != null) goto L27;
        return d.b;
    L27:
        throw new IllegalStateException("superState must be null");
    }
}
