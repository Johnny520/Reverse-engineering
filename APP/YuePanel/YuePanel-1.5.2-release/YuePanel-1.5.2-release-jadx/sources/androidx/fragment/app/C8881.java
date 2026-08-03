package androidx.fragment.app;

import Yue.InterfaceC6391;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Lifecycle;

/* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class C8881 implements Parcelable {
    public static final Parcelable.Creator<C8881> CREATOR = new C1701();

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final String f29731;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final String f29732;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final boolean f29733;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final int f29734;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final int f29735;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final String f29736;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final boolean f29737;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final boolean f29738;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final boolean f29739;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final boolean f29740;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public final int f29741;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final String f29742;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public final int f29743;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public final boolean f29744;

    /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟ۦ$ۥ */
    public class C1701 implements Parcelable.Creator<C8881> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public C8881 createFromParcel(Parcel parcel) {
            return new C8881(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
        public C8881[] newArray(int i) {
            return new C8881[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8881(Fragment fragment) {
        this.f29731 = fragment.getClass().getName();
        this.f29732 = fragment.mWho;
        this.f29733 = fragment.mFromLayout;
        this.f29734 = fragment.mFragmentId;
        this.f29735 = fragment.mContainerId;
        this.f29736 = fragment.mTag;
        this.f29737 = fragment.mRetainInstance;
        this.f29738 = fragment.mRemoving;
        this.f29739 = fragment.mDetached;
        this.f29740 = fragment.mHidden;
        this.f29741 = fragment.mMaxState.ordinal();
        this.f29742 = fragment.mTargetWho;
        this.f29743 = fragment.mTargetRequestCode;
        this.f29744 = fragment.mUserVisibleHint;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @InterfaceC6391
    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f29731);
        sb.append(" (");
        sb.append(this.f29732);
        sb.append(")}:");
        if (this.f29733) {
            sb.append(" fromLayout");
        }
        if (this.f29735 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f29735));
        }
        String str = this.f29736;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f29736);
        }
        if (this.f29737) {
            sb.append(" retainInstance");
        }
        if (this.f29738) {
            sb.append(" removing");
        }
        if (this.f29739) {
            sb.append(" detached");
        }
        if (this.f29740) {
            sb.append(" hidden");
        }
        if (this.f29742 != null) {
            sb.append(" targetWho=");
            sb.append(this.f29742);
            sb.append(" targetRequestCode=");
            sb.append(this.f29743);
        }
        if (this.f29744) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29731);
        parcel.writeString(this.f29732);
        parcel.writeInt(this.f29733 ? 1 : 0);
        parcel.writeInt(this.f29734);
        parcel.writeInt(this.f29735);
        parcel.writeString(this.f29736);
        parcel.writeInt(this.f29737 ? 1 : 0);
        parcel.writeInt(this.f29738 ? 1 : 0);
        parcel.writeInt(this.f29739 ? 1 : 0);
        parcel.writeInt(this.f29740 ? 1 : 0);
        parcel.writeInt(this.f29741);
        parcel.writeString(this.f29742);
        parcel.writeInt(this.f29743);
        parcel.writeInt(this.f29744 ? 1 : 0);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ */
    public Fragment m4848(@InterfaceC6391 C8876 c8876, @InterfaceC6391 ClassLoader classLoader) {
        Fragment fragmentMo4815 = c8876.mo4815(classLoader, this.f29731);
        fragmentMo4815.mWho = this.f29732;
        fragmentMo4815.mFromLayout = this.f29733;
        fragmentMo4815.mRestored = true;
        fragmentMo4815.mFragmentId = this.f29734;
        fragmentMo4815.mContainerId = this.f29735;
        fragmentMo4815.mTag = this.f29736;
        fragmentMo4815.mRetainInstance = this.f29737;
        fragmentMo4815.mRemoving = this.f29738;
        fragmentMo4815.mDetached = this.f29739;
        fragmentMo4815.mHidden = this.f29740;
        fragmentMo4815.mMaxState = Lifecycle.State.values()[this.f29741];
        fragmentMo4815.mTargetWho = this.f29742;
        fragmentMo4815.mTargetRequestCode = this.f29743;
        fragmentMo4815.mUserVisibleHint = this.f29744;
        return fragmentMo4815;
    }

    public C8881(Parcel parcel) {
        this.f29731 = parcel.readString();
        this.f29732 = parcel.readString();
        this.f29733 = parcel.readInt() != 0;
        this.f29734 = parcel.readInt();
        this.f29735 = parcel.readInt();
        this.f29736 = parcel.readString();
        this.f29737 = parcel.readInt() != 0;
        this.f29738 = parcel.readInt() != 0;
        this.f29739 = parcel.readInt() != 0;
        this.f29740 = parcel.readInt() != 0;
        this.f29741 = parcel.readInt();
        this.f29742 = parcel.readString();
        this.f29743 = parcel.readInt();
        this.f29744 = parcel.readInt() != 0;
    }
}
