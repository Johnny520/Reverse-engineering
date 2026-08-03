package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: Jw */
/* JADX INFO: loaded from: classes.dex */
public class C0426Jw implements Parcelable {
    public static final Parcelable.Creator<C0426Jw> CREATOR = null;

    /* JADX INFO: renamed from: a */
    public InterfaceC1058Yk f1406a;

    static {
        CREATOR = new C0646P0(23);
    }

    /* JADX INFO: renamed from: a */
    public void mo882a(int r1, Bundle r2) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        monitor-enter(this);
    L6:
        th = move-exception;
        throw th;
    L4:
        if (this.f1406a != null) goto L8;
        this.f1406a = new BinderC0383Iw(this);     // Catch: Throwable -> L6
    L8:
        r1.writeStrongBinder(this.f1406a.asBinder());     // Catch: Throwable -> L6
        monitor-exit(this);     // Catch: Throwable -> L6
    }
}
