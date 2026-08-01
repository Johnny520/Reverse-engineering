package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p006D.C0085n;

/* JADX INFO: renamed from: androidx.fragment.app.D */
/* JADX INFO: loaded from: classes.dex */
public final class C0413D implements Parcelable {
    public static final Parcelable.Creator<C0413D> CREATOR = new C0085n(6);

    /* JADX INFO: renamed from: a */
    public final String f1237a;

    /* JADX INFO: renamed from: b */
    public final String f1238b;

    /* JADX INFO: renamed from: c */
    public final boolean f1239c;

    /* JADX INFO: renamed from: d */
    public final int f1240d;

    /* JADX INFO: renamed from: e */
    public final int f1241e;

    /* JADX INFO: renamed from: f */
    public final String f1242f;

    /* JADX INFO: renamed from: g */
    public final boolean f1243g;

    /* JADX INFO: renamed from: h */
    public final boolean f1244h;

    /* JADX INFO: renamed from: i */
    public final boolean f1245i;

    /* JADX INFO: renamed from: j */
    public final Bundle f1246j;

    /* JADX INFO: renamed from: k */
    public final boolean f1247k;

    /* JADX INFO: renamed from: l */
    public final int f1248l;

    /* JADX INFO: renamed from: m */
    public Bundle f1249m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0413D(AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l) {
        this.f1237a = abstractComponentCallbacksC0434l.getClass().getName();
        this.f1238b = abstractComponentCallbacksC0434l.f1369f;
        this.f1239c = abstractComponentCallbacksC0434l.f1377n;
        this.f1240d = abstractComponentCallbacksC0434l.f1386w;
        this.f1241e = abstractComponentCallbacksC0434l.f1387x;
        this.f1242f = abstractComponentCallbacksC0434l.f1388y;
        this.f1243g = abstractComponentCallbacksC0434l.f1349B;
        this.f1244h = abstractComponentCallbacksC0434l.f1376m;
        this.f1245i = abstractComponentCallbacksC0434l.f1348A;
        this.f1246j = abstractComponentCallbacksC0434l.f1370g;
        this.f1247k = abstractComponentCallbacksC0434l.f1389z;
        this.f1248l = abstractComponentCallbacksC0434l.f1359L.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f1237a);
        sb.append(" (");
        sb.append(this.f1238b);
        sb.append(")}:");
        if (this.f1239c) {
            sb.append(" fromLayout");
        }
        int i2 = this.f1241e;
        if (i2 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i2));
        }
        String str = this.f1242f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f1243g) {
            sb.append(" retainInstance");
        }
        if (this.f1244h) {
            sb.append(" removing");
        }
        if (this.f1245i) {
            sb.append(" detached");
        }
        if (this.f1247k) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f1237a);
        parcel.writeString(this.f1238b);
        parcel.writeInt(this.f1239c ? 1 : 0);
        parcel.writeInt(this.f1240d);
        parcel.writeInt(this.f1241e);
        parcel.writeString(this.f1242f);
        parcel.writeInt(this.f1243g ? 1 : 0);
        parcel.writeInt(this.f1244h ? 1 : 0);
        parcel.writeInt(this.f1245i ? 1 : 0);
        parcel.writeBundle(this.f1246j);
        parcel.writeInt(this.f1247k ? 1 : 0);
        parcel.writeBundle(this.f1249m);
        parcel.writeInt(this.f1248l);
    }

    public C0413D(Parcel parcel) {
        this.f1237a = parcel.readString();
        this.f1238b = parcel.readString();
        this.f1239c = parcel.readInt() != 0;
        this.f1240d = parcel.readInt();
        this.f1241e = parcel.readInt();
        this.f1242f = parcel.readString();
        this.f1243g = parcel.readInt() != 0;
        this.f1244h = parcel.readInt() != 0;
        this.f1245i = parcel.readInt() != 0;
        this.f1246j = parcel.readBundle();
        this.f1247k = parcel.readInt() != 0;
        this.f1249m = parcel.readBundle();
        this.f1248l = parcel.readInt();
    }
}
