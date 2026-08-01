package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class ActivityResult implements Parcelable {
    public static final Parcelable.Creator<ActivityResult> CREATOR = new C0345a();

    /* JADX INFO: renamed from: q */
    public final int f985q;

    /* JADX INFO: renamed from: r */
    public final Intent f986r;

    /* JADX INFO: renamed from: androidx.activity.result.ActivityResult$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class C0345a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ActivityResult createFromParcel(Parcel parcel) {
            return new ActivityResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ActivityResult[] newArray(int i10) {
            return new ActivityResult[i10];
        }
    }

    public ActivityResult(Parcel parcel) {
        this.f985q = parcel.readInt();
        this.f986r = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    /* JADX INFO: renamed from: a */
    public static String m1098a(int i10) {
        return i10 != -1 ? i10 != 0 ? String.valueOf(i10) : "RESULT_CANCELED" : "RESULT_OK";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + m1098a(this.f985q) + ", data=" + this.f986r + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f985q);
        parcel.writeInt(this.f986r == null ? 0 : 1);
        Intent intent = this.f986r;
        if (intent != null) {
            intent.writeToParcel(parcel, i10);
        }
    }

    public ActivityResult(int i10, Intent intent) {
        this.f985q = i10;
        this.f986r = intent;
    }
}
