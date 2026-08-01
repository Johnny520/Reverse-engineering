package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p006D.C0085n;

/* JADX INFO: renamed from: androidx.activity.result.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0379a implements Parcelable {
    public static final Parcelable.Creator<C0379a> CREATOR = new C0085n(2);

    /* JADX INFO: renamed from: a */
    public final int f909a;

    /* JADX INFO: renamed from: b */
    public final Intent f910b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0379a(int i2, Intent intent) {
        this.f909a = i2;
        this.f910b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i2 = this.f909a;
        sb.append(i2 != -1 ? i2 != 0 ? String.valueOf(i2) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f910b);
        sb.append('}');
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f909a);
        Intent intent = this.f910b;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i2);
        }
    }

    public C0379a(Parcel parcel) {
        this.f909a = parcel.readInt();
        this.f910b = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
