package p000;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: Il */
/* JADX INFO: loaded from: classes.dex */
public final class C0372Il implements Parcelable {
    public static final Parcelable.Creator<C0372Il> CREATOR = null;

    /* JADX INFO: renamed from: a */
    public final IntentSender f1296a;

    /* JADX INFO: renamed from: b */
    public final Intent f1297b;

    /* JADX INFO: renamed from: c */
    public final int f1298c;

    /* JADX INFO: renamed from: d */
    public final int f1299d;

    static {
        CREATOR = new C0646P0(9);
    }

    public C0372Il(IntentSender r1, Intent r2, int r3, int r4) {
        this.f1296a = r1;
        this.f1297b = r2;
        this.f1298c = r3;
        this.f1299d = r4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        r2.writeParcelable(this.f1296a, r3);
        r2.writeParcelable(this.f1297b, r3);
        r2.writeInt(this.f1298c);
        r2.writeInt(this.f1299d);
    }
}
