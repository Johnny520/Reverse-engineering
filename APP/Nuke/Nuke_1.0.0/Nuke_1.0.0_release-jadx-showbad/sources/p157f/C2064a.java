package p157f;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p064M1.C0994a;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: f.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2064a implements Parcelable {
    public static final Parcelable.Creator<C2064a> CREATOR = new C0994a(1);

    /* JADX INFO: renamed from: d */
    public final int f6916d;

    /* JADX INFO: renamed from: e */
    public final Intent f6917e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2064a(Intent intent, int i5) {
        this.f6916d = i5;
        this.f6917e = intent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i5 = this.f6916d;
        sb.append(i5 != -1 ? i5 != 0 ? String.valueOf(i5) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f6917e);
        sb.append('}');
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        AbstractC1665j.m2985e(parcel, "dest");
        parcel.writeInt(this.f6916d);
        Intent intent = this.f6917e;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i5);
        }
    }
}
