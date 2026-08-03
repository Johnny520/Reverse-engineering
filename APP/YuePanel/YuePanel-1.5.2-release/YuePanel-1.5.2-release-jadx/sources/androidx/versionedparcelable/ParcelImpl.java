package androidx.versionedparcelable;

import Yue.C8179;
import Yue.InterfaceC7144;
import Yue.InterfaceC8181;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C1795();

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final InterfaceC8181 f30382;

    /* JADX INFO: renamed from: androidx.versionedparcelable.ParcelImpl$ۥ */
    public static class C1795 implements Parcelable.Creator<ParcelImpl> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
        public ParcelImpl[] newArray(int i) {
            return new ParcelImpl[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ParcelImpl(InterfaceC8181 interfaceC8181) {
        this.f30382 = interfaceC8181;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        new C8179(parcel).m27092(this.f30382);
    }

    /* JADX INFO: renamed from: ۥ */
    public <T extends InterfaceC8181> T m5023() {
        return (T) this.f30382;
    }

    public ParcelImpl(Parcel parcel) {
        this.f30382 = new C8179(parcel).m27035();
    }
}
