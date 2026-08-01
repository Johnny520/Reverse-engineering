package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: cm */
/* JADX INFO: loaded from: classes.dex */
public final class C0109cm implements Parcelable {
    public static final Parcelable.Creator<C0109cm> CREATOR = new C0729t1(7);

    /* JADX INFO: renamed from: a */
    public final String f967a;

    /* JADX INFO: renamed from: b */
    public final String f968b;

    /* JADX INFO: renamed from: c */
    public final boolean f969c;

    /* JADX INFO: renamed from: d */
    public final int f970d;

    /* JADX INFO: renamed from: e */
    public final int f971e;

    /* JADX INFO: renamed from: f */
    public final String f972f;

    /* JADX INFO: renamed from: g */
    public final boolean f973g;

    /* JADX INFO: renamed from: h */
    public final boolean f974h;

    /* JADX INFO: renamed from: i */
    public final boolean f975i;

    /* JADX INFO: renamed from: j */
    public final Bundle f976j;

    /* JADX INFO: renamed from: k */
    public final boolean f977k;

    /* JADX INFO: renamed from: l */
    public final int f978l;

    /* JADX INFO: renamed from: m */
    public Bundle f979m;

    public C0109cm(AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml) {
        this.f967a = abstractComponentCallbacksC0489ml.getClass().getName();
        this.f968b = abstractComponentCallbacksC0489ml.f3245e;
        this.f969c = abstractComponentCallbacksC0489ml.f3253m;
        this.f970d = abstractComponentCallbacksC0489ml.f3262v;
        this.f971e = abstractComponentCallbacksC0489ml.f3263w;
        this.f972f = abstractComponentCallbacksC0489ml.f3264x;
        this.f973g = abstractComponentCallbacksC0489ml.f3225A;
        this.f974h = abstractComponentCallbacksC0489ml.f3252l;
        this.f975i = abstractComponentCallbacksC0489ml.f3266z;
        this.f976j = abstractComponentCallbacksC0489ml.f3246f;
        this.f977k = abstractComponentCallbacksC0489ml.f3265y;
        this.f978l = abstractComponentCallbacksC0489ml.f3235K.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f967a);
        sb.append(" (");
        sb.append(this.f968b);
        sb.append(")}:");
        if (this.f969c) {
            sb.append(" fromLayout");
        }
        int i = this.f971e;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f972f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f973g) {
            sb.append(" retainInstance");
        }
        if (this.f974h) {
            sb.append(" removing");
        }
        if (this.f975i) {
            sb.append(" detached");
        }
        if (this.f977k) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f967a);
        parcel.writeString(this.f968b);
        parcel.writeInt(this.f969c ? 1 : 0);
        parcel.writeInt(this.f970d);
        parcel.writeInt(this.f971e);
        parcel.writeString(this.f972f);
        parcel.writeInt(this.f973g ? 1 : 0);
        parcel.writeInt(this.f974h ? 1 : 0);
        parcel.writeInt(this.f975i ? 1 : 0);
        parcel.writeBundle(this.f976j);
        parcel.writeInt(this.f977k ? 1 : 0);
        parcel.writeBundle(this.f979m);
        parcel.writeInt(this.f978l);
    }

    public C0109cm(Parcel parcel) {
        this.f967a = parcel.readString();
        this.f968b = parcel.readString();
        this.f969c = parcel.readInt() != 0;
        this.f970d = parcel.readInt();
        this.f971e = parcel.readInt();
        this.f972f = parcel.readString();
        this.f973g = parcel.readInt() != 0;
        this.f974h = parcel.readInt() != 0;
        this.f975i = parcel.readInt() != 0;
        this.f976j = parcel.readBundle();
        this.f977k = parcel.readInt() != 0;
        this.f979m = parcel.readBundle();
        this.f978l = parcel.readInt();
    }
}
