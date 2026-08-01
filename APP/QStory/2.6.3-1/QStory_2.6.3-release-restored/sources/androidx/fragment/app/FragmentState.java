package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new C3164(4);

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final boolean f7081;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final int f7082;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final String f7083;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final int f7084;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final boolean f7085;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int f7086;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f7087;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final boolean f7088;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final boolean f7089;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final String f7090;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final boolean f7091;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String f7092;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean f7093;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final String f7094;

    public FragmentState(Parcel parcel) {
        this.f7094 = parcel.readString();
        this.f7092 = parcel.readString();
        this.f7093 = parcel.readInt() != 0;
        this.f7087 = parcel.readInt();
        this.f7086 = parcel.readInt();
        this.f7090 = parcel.readString();
        this.f7091 = parcel.readInt() != 0;
        this.f7088 = parcel.readInt() != 0;
        this.f7089 = parcel.readInt() != 0;
        this.f7085 = parcel.readInt() != 0;
        this.f7084 = parcel.readInt();
        this.f7083 = parcel.readString();
        this.f7082 = parcel.readInt();
        this.f7081 = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f7094);
        sb.append(" (");
        sb.append(this.f7092);
        sb.append(")}:");
        if (this.f7093) {
            sb.append(" fromLayout");
        }
        int i = this.f7086;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f7090;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f7091) {
            sb.append(" retainInstance");
        }
        if (this.f7088) {
            sb.append(" removing");
        }
        if (this.f7089) {
            sb.append(" detached");
        }
        if (this.f7085) {
            sb.append(" hidden");
        }
        String str2 = this.f7083;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.f7082);
        }
        if (this.f7081) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7094);
        parcel.writeString(this.f7092);
        parcel.writeInt(this.f7093 ? 1 : 0);
        parcel.writeInt(this.f7087);
        parcel.writeInt(this.f7086);
        parcel.writeString(this.f7090);
        parcel.writeInt(this.f7091 ? 1 : 0);
        parcel.writeInt(this.f7088 ? 1 : 0);
        parcel.writeInt(this.f7089 ? 1 : 0);
        parcel.writeInt(this.f7085 ? 1 : 0);
        parcel.writeInt(this.f7084);
        parcel.writeString(this.f7083);
        parcel.writeInt(this.f7082);
        parcel.writeInt(this.f7081 ? 1 : 0);
    }

    public FragmentState(AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171) {
        this.f7094 = abstractComponentCallbacksC3171.getClass().getName();
        this.f7092 = abstractComponentCallbacksC3171.f7246;
        this.f7093 = abstractComponentCallbacksC3171.f7236;
        this.f7087 = abstractComponentCallbacksC3171.f7231;
        this.f7086 = abstractComponentCallbacksC3171.f7230;
        this.f7090 = abstractComponentCallbacksC3171.f7233;
        this.f7091 = abstractComponentCallbacksC3171.f7229;
        this.f7088 = abstractComponentCallbacksC3171.f7237;
        this.f7089 = abstractComponentCallbacksC3171.f7228;
        this.f7085 = abstractComponentCallbacksC3171.f7232;
        this.f7084 = abstractComponentCallbacksC3171.f7263.ordinal();
        this.f7083 = abstractComponentCallbacksC3171.f7248;
        this.f7082 = abstractComponentCallbacksC3171.f7249;
        this.f7081 = abstractComponentCallbacksC3171.f7223;
    }
}
