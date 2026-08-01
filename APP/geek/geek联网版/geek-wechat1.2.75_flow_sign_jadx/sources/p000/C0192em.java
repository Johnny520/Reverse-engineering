package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: em */
/* JADX INFO: loaded from: classes.dex */
public final class C0192em implements Parcelable {
    public static final Parcelable.Creator<C0192em> CREATOR = new C0728t1(7);

    /* JADX INFO: renamed from: a */
    public final String f1592a;

    /* JADX INFO: renamed from: b */
    public final String f1593b;

    /* JADX INFO: renamed from: c */
    public final boolean f1594c;

    /* JADX INFO: renamed from: d */
    public final int f1595d;

    /* JADX INFO: renamed from: e */
    public final int f1596e;

    /* JADX INFO: renamed from: f */
    public final String f1597f;

    /* JADX INFO: renamed from: g */
    public final boolean f1598g;

    /* JADX INFO: renamed from: h */
    public final boolean f1599h;

    /* JADX INFO: renamed from: i */
    public final boolean f1600i;

    /* JADX INFO: renamed from: j */
    public final Bundle f1601j;

    /* JADX INFO: renamed from: k */
    public final boolean f1602k;

    /* JADX INFO: renamed from: l */
    public final int f1603l;

    /* JADX INFO: renamed from: m */
    public Bundle f1604m;

    public C0192em(AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol) {
        this.f1592a = abstractComponentCallbacksC0563ol.getClass().getName();
        this.f1593b = abstractComponentCallbacksC0563ol.f3490e;
        this.f1594c = abstractComponentCallbacksC0563ol.f3498m;
        this.f1595d = abstractComponentCallbacksC0563ol.f3507v;
        this.f1596e = abstractComponentCallbacksC0563ol.f3508w;
        this.f1597f = abstractComponentCallbacksC0563ol.f3509x;
        this.f1598g = abstractComponentCallbacksC0563ol.f3470A;
        this.f1599h = abstractComponentCallbacksC0563ol.f3497l;
        this.f1600i = abstractComponentCallbacksC0563ol.f3511z;
        this.f1601j = abstractComponentCallbacksC0563ol.f3491f;
        this.f1602k = abstractComponentCallbacksC0563ol.f3510y;
        this.f1603l = abstractComponentCallbacksC0563ol.f3480K.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f1592a);
        sb.append(" (");
        sb.append(this.f1593b);
        sb.append(")}:");
        if (this.f1594c) {
            sb.append(" fromLayout");
        }
        int i = this.f1596e;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f1597f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f1598g) {
            sb.append(" retainInstance");
        }
        if (this.f1599h) {
            sb.append(" removing");
        }
        if (this.f1600i) {
            sb.append(" detached");
        }
        if (this.f1602k) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1592a);
        parcel.writeString(this.f1593b);
        parcel.writeInt(this.f1594c ? 1 : 0);
        parcel.writeInt(this.f1595d);
        parcel.writeInt(this.f1596e);
        parcel.writeString(this.f1597f);
        parcel.writeInt(this.f1598g ? 1 : 0);
        parcel.writeInt(this.f1599h ? 1 : 0);
        parcel.writeInt(this.f1600i ? 1 : 0);
        parcel.writeBundle(this.f1601j);
        parcel.writeInt(this.f1602k ? 1 : 0);
        parcel.writeBundle(this.f1604m);
        parcel.writeInt(this.f1603l);
    }

    public C0192em(Parcel parcel) {
        this.f1592a = parcel.readString();
        this.f1593b = parcel.readString();
        this.f1594c = parcel.readInt() != 0;
        this.f1595d = parcel.readInt();
        this.f1596e = parcel.readInt();
        this.f1597f = parcel.readString();
        this.f1598g = parcel.readInt() != 0;
        this.f1599h = parcel.readInt() != 0;
        this.f1600i = parcel.readInt() != 0;
        this.f1601j = parcel.readBundle();
        this.f1602k = parcel.readInt() != 0;
        this.f1604m = parcel.readBundle();
        this.f1603l = parcel.readInt();
    }
}
