package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: gi */
/* JADX INFO: loaded from: classes.dex */
public final class C1459gi implements Parcelable {
    public static final Parcelable.Creator<C1459gi> CREATOR = null;

    /* JADX INFO: renamed from: a */
    public final Bundle f5178a;

    static {
        CREATOR = new C2342p(4);
    }

    public C1459gi(Bundle r1) {
        this.f5178a = r1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        r1.writeBundle(this.f5178a);
    }

    public C1459gi(Parcel r1, ClassLoader r2) {
        Bundle r12 = r1.readBundle();
        this.f5178a = r12;
        if (r2 == null) goto L7;
        if (r12 == null) goto L8;
        r12.setClassLoader(r2);
        return;
    L8:
        return;
    }
}
