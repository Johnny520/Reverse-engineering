package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class C8879 implements Parcelable {
    public static final Parcelable.Creator<C8879> CREATOR = new C1699();

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public ArrayList<String> f29716;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public ArrayList<String> f29717;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public C1689[] f29718;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public int f29719;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public String f29720;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public ArrayList<String> f29721;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public ArrayList<C8865> f29722;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public ArrayList<FragmentManager.C8857> f29723;

    /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟ۤ$ۥ */
    public class C1699 implements Parcelable.Creator<C8879> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public C8879 createFromParcel(Parcel parcel) {
            return new C8879(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
        public C8879[] newArray(int i) {
            return new C8879[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8879() {
        this.f29720 = null;
        this.f29721 = new ArrayList<>();
        this.f29722 = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f29716);
        parcel.writeStringList(this.f29717);
        parcel.writeTypedArray(this.f29718, i);
        parcel.writeInt(this.f29719);
        parcel.writeString(this.f29720);
        parcel.writeStringList(this.f29721);
        parcel.writeTypedList(this.f29722);
        parcel.writeTypedList(this.f29723);
    }

    public C8879(Parcel parcel) {
        this.f29720 = null;
        this.f29721 = new ArrayList<>();
        this.f29722 = new ArrayList<>();
        this.f29716 = parcel.createStringArrayList();
        this.f29717 = parcel.createStringArrayList();
        this.f29718 = (C1689[]) parcel.createTypedArray(C1689.CREATOR);
        this.f29719 = parcel.readInt();
        this.f29720 = parcel.readString();
        this.f29721 = parcel.createStringArrayList();
        this.f29722 = parcel.createTypedArrayList(C8865.CREATOR);
        this.f29723 = parcel.createTypedArrayList(FragmentManager.C8857.CREATOR);
    }
}
