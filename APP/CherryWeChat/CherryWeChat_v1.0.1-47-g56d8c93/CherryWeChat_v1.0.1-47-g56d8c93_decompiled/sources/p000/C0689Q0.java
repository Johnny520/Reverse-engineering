package p000;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: Q0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0689Q0 implements Parcelable {
    public static final Parcelable.Creator<C0689Q0> CREATOR = new C0646P0(0);

    /* JADX INFO: renamed from: a */
    public final int f2217a;

    /* JADX INFO: renamed from: b */
    public final Intent f2218b;

    public C0689Q0(Intent intent, int i) {
        this.f2217a = i;
        this.f2218b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.f2217a;
        sb.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f2218b);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2217a);
        Intent intent = this.f2218b;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
