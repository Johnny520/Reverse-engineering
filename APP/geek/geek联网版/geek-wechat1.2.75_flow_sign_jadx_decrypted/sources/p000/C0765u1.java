package p000;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: u1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0765u1 implements Parcelable {
    public static final Parcelable.Creator<C0765u1> CREATOR = new C0728t1(0);

    /* JADX INFO: renamed from: a */
    public final int f4602a;

    /* JADX INFO: renamed from: b */
    public final Intent f4603b;

    public C0765u1(int i, Intent intent) {
        this.f4602a = i;
        this.f4603b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.f4602a;
        sb.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f4603b);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f4602a);
        Intent intent = this.f4603b;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }

    public C0765u1(Parcel parcel) {
        this.f4602a = parcel.readInt();
        this.f4603b = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
