package p000;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: Il */
/* JADX INFO: loaded from: classes.dex */
public final class C0372Il implements Parcelable {
    public static final Parcelable.Creator<C0372Il> CREATOR = new C0646P0(9);

    /* JADX INFO: renamed from: a */
    public final IntentSender f1296a;

    /* JADX INFO: renamed from: b */
    public final Intent f1297b;

    /* JADX INFO: renamed from: c */
    public final int f1298c;

    /* JADX INFO: renamed from: d */
    public final int f1299d;

    public C0372Il(IntentSender intentSender, Intent intent, int i, int i2) {
        this.f1296a = intentSender;
        this.f1297b = intent;
        this.f1298c = i;
        this.f1299d = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f1296a, i);
        parcel.writeParcelable(this.f1297b, i);
        parcel.writeInt(this.f1298c);
        parcel.writeInt(this.f1299d);
    }
}
