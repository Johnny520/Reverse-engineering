package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: Jw */
/* JADX INFO: loaded from: classes.dex */
public class C0426Jw implements Parcelable {
    public static final Parcelable.Creator<C0426Jw> CREATOR = new C0646P0(23);

    /* JADX INFO: renamed from: a */
    public InterfaceC1058Yk f1406a;

    /* JADX INFO: renamed from: a */
    public void mo882a(int i, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            try {
                if (this.f1406a == null) {
                    this.f1406a = new BinderC0383Iw(this);
                }
                parcel.writeStrongBinder(this.f1406a.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
