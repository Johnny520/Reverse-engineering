package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: Gi */
/* JADX INFO: loaded from: classes.dex */
public final class C0283Gi implements Parcelable {
    public static final Parcelable.Creator<C0283Gi> CREATOR = new C0646P0(8);

    /* JADX INFO: renamed from: a */
    public final String f910a;

    /* JADX INFO: renamed from: b */
    public final String f911b;

    /* JADX INFO: renamed from: c */
    public final boolean f912c;

    /* JADX INFO: renamed from: d */
    public final int f913d;

    /* JADX INFO: renamed from: e */
    public final int f914e;

    /* JADX INFO: renamed from: f */
    public final String f915f;

    /* JADX INFO: renamed from: g */
    public final boolean f916g;

    /* JADX INFO: renamed from: h */
    public final boolean f917h;

    /* JADX INFO: renamed from: i */
    public final boolean f918i;

    /* JADX INFO: renamed from: j */
    public final boolean f919j;

    /* JADX INFO: renamed from: k */
    public final int f920k;

    /* JADX INFO: renamed from: l */
    public final String f921l;

    /* JADX INFO: renamed from: m */
    public final int f922m;

    /* JADX INFO: renamed from: n */
    public final boolean f923n;

    public C0283Gi(AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi) {
        this.f910a = abstractComponentCallbacksC1503hi.getClass().getName();
        this.f911b = abstractComponentCallbacksC1503hi.f5314e;
        this.f912c = abstractComponentCallbacksC1503hi.f5322m;
        this.f913d = abstractComponentCallbacksC1503hi.f5331v;
        this.f914e = abstractComponentCallbacksC1503hi.f5332w;
        this.f915f = abstractComponentCallbacksC1503hi.f5333x;
        this.f916g = abstractComponentCallbacksC1503hi.f5292A;
        this.f917h = abstractComponentCallbacksC1503hi.f5321l;
        this.f918i = abstractComponentCallbacksC1503hi.f5335z;
        this.f919j = abstractComponentCallbacksC1503hi.f5334y;
        this.f920k = abstractComponentCallbacksC1503hi.f5303L.ordinal();
        this.f921l = abstractComponentCallbacksC1503hi.f5317h;
        this.f922m = abstractComponentCallbacksC1503hi.f5318i;
        this.f923n = abstractComponentCallbacksC1503hi.f5298G;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f910a);
        sb.append(" (");
        sb.append(this.f911b);
        sb.append(")}:");
        if (this.f912c) {
            sb.append(" fromLayout");
        }
        int i = this.f914e;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f915f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f916g) {
            sb.append(" retainInstance");
        }
        if (this.f917h) {
            sb.append(" removing");
        }
        if (this.f918i) {
            sb.append(" detached");
        }
        if (this.f919j) {
            sb.append(" hidden");
        }
        String str2 = this.f921l;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.f922m);
        }
        if (this.f923n) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f910a);
        parcel.writeString(this.f911b);
        parcel.writeInt(this.f912c ? 1 : 0);
        parcel.writeInt(this.f913d);
        parcel.writeInt(this.f914e);
        parcel.writeString(this.f915f);
        parcel.writeInt(this.f916g ? 1 : 0);
        parcel.writeInt(this.f917h ? 1 : 0);
        parcel.writeInt(this.f918i ? 1 : 0);
        parcel.writeInt(this.f919j ? 1 : 0);
        parcel.writeInt(this.f920k);
        parcel.writeString(this.f921l);
        parcel.writeInt(this.f922m);
        parcel.writeInt(this.f923n ? 1 : 0);
    }

    public C0283Gi(Parcel parcel) {
        this.f910a = parcel.readString();
        this.f911b = parcel.readString();
        this.f912c = parcel.readInt() != 0;
        this.f913d = parcel.readInt();
        this.f914e = parcel.readInt();
        this.f915f = parcel.readString();
        this.f916g = parcel.readInt() != 0;
        this.f917h = parcel.readInt() != 0;
        this.f918i = parcel.readInt() != 0;
        this.f919j = parcel.readInt() != 0;
        this.f920k = parcel.readInt();
        this.f921l = parcel.readString();
        this.f922m = parcel.readInt();
        this.f923n = parcel.readInt() != 0;
    }
}
