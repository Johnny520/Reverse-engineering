package p000a;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: a.W */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class C0397W implements Parcelable {
    public static final Parcelable.Creator<C0397W> CREATOR = new a();

    /* JADX INFO: renamed from: a */
    public final int f1523a;

    /* JADX INFO: renamed from: b */
    public final Intent f1524b;

    /* JADX INFO: renamed from: a.W$a */
    public class a implements Parcelable.Creator<C0397W> {
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final C0397W createFromParcel(Parcel parcel) {
            return new C0397W(parcel);
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final C0397W[] newArray(int i) {
            return new C0397W[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0397W(Intent intent, int i) {
        this.f1523a = i;
        this.f1524b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.f1523a;
        sb.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f1524b);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1523a);
        Intent intent = this.f1524b;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }

    public C0397W(Parcel parcel) {
        this.f1523a = parcel.readInt();
        this.f1524b = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
