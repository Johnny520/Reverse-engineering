package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new C2331(4);

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final boolean f6736;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final int f6737;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final String f6738;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final int f6739;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final boolean f6740;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int f6741;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f6742;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final boolean f6743;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final boolean f6744;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final String f6745;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final boolean f6746;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String f6747;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean f6748;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final String f6749;

    public FragmentState(Parcel parcel) {
        this.f6749 = parcel.readString();
        this.f6747 = parcel.readString();
        this.f6748 = parcel.readInt() != 0;
        this.f6742 = parcel.readInt();
        this.f6741 = parcel.readInt();
        this.f6745 = parcel.readString();
        this.f6746 = parcel.readInt() != 0;
        this.f6743 = parcel.readInt() != 0;
        this.f6744 = parcel.readInt() != 0;
        this.f6740 = parcel.readInt() != 0;
        this.f6739 = parcel.readInt();
        this.f6738 = parcel.readString();
        this.f6737 = parcel.readInt();
        this.f6736 = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f6749);
        sb.append(" (");
        sb.append(this.f6747);
        sb.append(")}:");
        if (this.f6748) {
            sb.append(" fromLayout");
        }
        int i = this.f6741;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f6745;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f6746) {
            sb.append(" retainInstance");
        }
        if (this.f6743) {
            sb.append(" removing");
        }
        if (this.f6744) {
            sb.append(" detached");
        }
        if (this.f6740) {
            sb.append(" hidden");
        }
        String str2 = this.f6738;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.f6737);
        }
        if (this.f6736) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6749);
        parcel.writeString(this.f6747);
        parcel.writeInt(this.f6748 ? 1 : 0);
        parcel.writeInt(this.f6742);
        parcel.writeInt(this.f6741);
        parcel.writeString(this.f6745);
        parcel.writeInt(this.f6746 ? 1 : 0);
        parcel.writeInt(this.f6743 ? 1 : 0);
        parcel.writeInt(this.f6744 ? 1 : 0);
        parcel.writeInt(this.f6740 ? 1 : 0);
        parcel.writeInt(this.f6739);
        parcel.writeString(this.f6738);
        parcel.writeInt(this.f6737);
        parcel.writeInt(this.f6736 ? 1 : 0);
    }

    public FragmentState(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        this.f6749 = abstractComponentCallbacksC2338.getClass().getName();
        this.f6747 = abstractComponentCallbacksC2338.f6901;
        this.f6748 = abstractComponentCallbacksC2338.f6891;
        this.f6742 = abstractComponentCallbacksC2338.f6886;
        this.f6741 = abstractComponentCallbacksC2338.f6885;
        this.f6745 = abstractComponentCallbacksC2338.f6888;
        this.f6746 = abstractComponentCallbacksC2338.f6884;
        this.f6743 = abstractComponentCallbacksC2338.f6892;
        this.f6744 = abstractComponentCallbacksC2338.f6883;
        this.f6740 = abstractComponentCallbacksC2338.f6887;
        this.f6739 = abstractComponentCallbacksC2338.f6918.ordinal();
        this.f6738 = abstractComponentCallbacksC2338.f6903;
        this.f6737 = abstractComponentCallbacksC2338.f6904;
        this.f6736 = abstractComponentCallbacksC2338.f6878;
    }
}
