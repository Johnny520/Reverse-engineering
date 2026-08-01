package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new C2331(4);

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final boolean f6735;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final int f6736;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final String f6737;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final int f6738;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final boolean f6739;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int f6740;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f6741;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final boolean f6742;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final boolean f6743;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final String f6744;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final boolean f6745;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String f6746;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean f6747;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final String f6748;

    public FragmentState(Parcel parcel) {
        this.f6748 = parcel.readString();
        this.f6746 = parcel.readString();
        this.f6747 = parcel.readInt() != 0;
        this.f6741 = parcel.readInt();
        this.f6740 = parcel.readInt();
        this.f6744 = parcel.readString();
        this.f6745 = parcel.readInt() != 0;
        this.f6742 = parcel.readInt() != 0;
        this.f6743 = parcel.readInt() != 0;
        this.f6739 = parcel.readInt() != 0;
        this.f6738 = parcel.readInt();
        this.f6737 = parcel.readString();
        this.f6736 = parcel.readInt();
        this.f6735 = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f6748);
        sb.append(" (");
        sb.append(this.f6746);
        sb.append(")}:");
        if (this.f6747) {
            sb.append(" fromLayout");
        }
        int i = this.f6740;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f6744;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f6745) {
            sb.append(" retainInstance");
        }
        if (this.f6742) {
            sb.append(" removing");
        }
        if (this.f6743) {
            sb.append(" detached");
        }
        if (this.f6739) {
            sb.append(" hidden");
        }
        String str2 = this.f6737;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.f6736);
        }
        if (this.f6735) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6748);
        parcel.writeString(this.f6746);
        parcel.writeInt(this.f6747 ? 1 : 0);
        parcel.writeInt(this.f6741);
        parcel.writeInt(this.f6740);
        parcel.writeString(this.f6744);
        parcel.writeInt(this.f6745 ? 1 : 0);
        parcel.writeInt(this.f6742 ? 1 : 0);
        parcel.writeInt(this.f6743 ? 1 : 0);
        parcel.writeInt(this.f6739 ? 1 : 0);
        parcel.writeInt(this.f6738);
        parcel.writeString(this.f6737);
        parcel.writeInt(this.f6736);
        parcel.writeInt(this.f6735 ? 1 : 0);
    }

    public FragmentState(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        this.f6748 = abstractComponentCallbacksC2338.getClass().getName();
        this.f6746 = abstractComponentCallbacksC2338.f6900;
        this.f6747 = abstractComponentCallbacksC2338.f6890;
        this.f6741 = abstractComponentCallbacksC2338.f6885;
        this.f6740 = abstractComponentCallbacksC2338.f6884;
        this.f6744 = abstractComponentCallbacksC2338.f6887;
        this.f6745 = abstractComponentCallbacksC2338.f6883;
        this.f6742 = abstractComponentCallbacksC2338.f6891;
        this.f6743 = abstractComponentCallbacksC2338.f6882;
        this.f6739 = abstractComponentCallbacksC2338.f6886;
        this.f6738 = abstractComponentCallbacksC2338.f6917.ordinal();
        this.f6737 = abstractComponentCallbacksC2338.f6902;
        this.f6736 = abstractComponentCallbacksC2338.f6903;
        this.f6735 = abstractComponentCallbacksC2338.f6877;
    }
}
