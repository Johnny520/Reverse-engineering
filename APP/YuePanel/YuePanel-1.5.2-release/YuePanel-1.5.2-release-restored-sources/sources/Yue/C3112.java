package Yue;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: Yue.ۥ۟۟ۨ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class C3112 implements Parcelable {

    @InterfaceC6391
    public static final Parcelable.Creator<C3112> CREATOR = new C0054();

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final int f4637;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6490
    public final Intent f4638;

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۨ۟$ۥ */
    public class C0054 implements Parcelable.Creator<C3112> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public C3112 createFromParcel(@InterfaceC6391 Parcel parcel) {
            return new C3112(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
        public C3112[] newArray(int i) {
            return new C3112[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3112(int i, @InterfaceC6490 Intent intent) {
        this.f4637 = i;
        this.f4638 = intent;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static String m6350(int i) {
        return i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + m6350(this.f4637) + ", data=" + this.f4638 + C6193.f1885;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@InterfaceC6391 Parcel parcel, int i) {
        parcel.writeInt(this.f4637);
        parcel.writeInt(this.f4638 == null ? 0 : 1);
        Intent intent = this.f4638;
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ */
    public Intent m211() {
        return this.f4638;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public int m212() {
        return this.f4637;
    }

    public C3112(Parcel parcel) {
        this.f4637 = parcel.readInt();
        this.f4638 = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
