package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: gi */
/* JADX INFO: loaded from: classes.dex */
public final class C1459gi implements Parcelable {
    public static final Parcelable.Creator<C1459gi> CREATOR = new C2342p(4);

    /* JADX INFO: renamed from: a */
    public final Bundle f5178a;

    public C1459gi(Bundle bundle) {
        this.f5178a = bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f5178a);
    }

    public C1459gi(Parcel parcel, ClassLoader classLoader) {
        Bundle bundle = parcel.readBundle();
        this.f5178a = bundle;
        if (classLoader == null || bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
    }
}
