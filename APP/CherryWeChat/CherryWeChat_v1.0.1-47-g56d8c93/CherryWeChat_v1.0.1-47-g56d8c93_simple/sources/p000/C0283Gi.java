package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: Gi */
/* JADX INFO: loaded from: classes.dex */
public final class C0283Gi implements Parcelable {
    public static final Parcelable.Creator<C0283Gi> CREATOR = null;

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

    static {
        CREATOR = new C0646P0(8);
    }

    public C0283Gi(AbstractComponentCallbacksC1503hi r2) {
        this.f910a = r2.getClass().getName();
        this.f911b = r2.f5314e;
        this.f912c = r2.f5322m;
        this.f913d = r2.f5331v;
        this.f914e = r2.f5332w;
        this.f915f = r2.f5333x;
        this.f916g = r2.f5292A;
        this.f917h = r2.f5321l;
        this.f918i = r2.f5335z;
        this.f919j = r2.f5334y;
        this.f920k = r2.f5303L.ordinal();
        this.f921l = r2.f5317h;
        this.f922m = r2.f5318i;
        this.f923n = r2.f5298G;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder(128);
        r0.append("FragmentState{");
        r0.append(this.f910a);
        r0.append(" (");
        r0.append(this.f911b);
        r0.append(")}:");
        if (this.f912c == false) goto L5;
        r0.append(" fromLayout");
    L5:
        int r1 = this.f914e;
        if (r1 == 0) goto L8;
        r0.append(" id=0x");
        r0.append(Integer.toHexString(r1));
    L8:
        String r12 = this.f915f;
        if (r12 == null) goto L14;
        if (r12.isEmpty() == true) goto L14;
        r0.append(" tag=");
        r0.append(r12);
    L14:
        if (this.f916g == false) goto L17;
        r0.append(" retainInstance");
    L17:
        if (this.f917h == false) goto L20;
        r0.append(" removing");
    L20:
        if (this.f918i == false) goto L23;
        r0.append(" detached");
    L23:
        if (this.f919j == false) goto L25;
        r0.append(" hidden");
    L25:
        String r13 = this.f921l;
        if (r13 == null) goto L29;
        r0.append(" targetWho=");
        r0.append(r13);
        r0.append(" targetRequestCode=");
        r0.append(this.f922m);
    L29:
        if (this.f923n == false) goto L32;
        r0.append(" userVisibleHint");
    L32:
        return r0.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        r1.writeString(this.f910a);
        r1.writeString(this.f911b);
        r1.writeInt(this.f912c ? 1 : 0);
        r1.writeInt(this.f913d);
        r1.writeInt(this.f914e);
        r1.writeString(this.f915f);
        r1.writeInt(this.f916g ? 1 : 0);
        r1.writeInt(this.f917h ? 1 : 0);
        r1.writeInt(this.f918i ? 1 : 0);
        r1.writeInt(this.f919j ? 1 : 0);
        r1.writeInt(this.f920k);
        r1.writeString(this.f921l);
        r1.writeInt(this.f922m);
        r1.writeInt(this.f923n ? 1 : 0);
    }

    public C0283Gi(Parcel r4) {
        this.f910a = r4.readString();
        this.f911b = r4.readString();
        boolean r1 = false;
        if (r4.readInt() == 0) goto L5;
        boolean r0 = true;
    L6:
        this.f912c = r0;
        this.f913d = r4.readInt();
        this.f914e = r4.readInt();
        this.f915f = r4.readString();
        if (r4.readInt() == 0) goto L9;
        boolean r02 = true;
    L10:
        this.f916g = r02;
        if (r4.readInt() == 0) goto L13;
        boolean r03 = true;
    L14:
        this.f917h = r03;
        if (r4.readInt() == 0) goto L17;
        boolean r04 = true;
    L18:
        this.f918i = r04;
        if (r4.readInt() == 0) goto L21;
        boolean r05 = true;
    L22:
        this.f919j = r05;
        this.f920k = r4.readInt();
        this.f921l = r4.readString();
        this.f922m = r4.readInt();
        if (r4.readInt() == 0) goto L25;
        r1 = true;
    L25:
        this.f923n = r1;
        return;
    L21:
        r05 = false;
        goto L22
    L17:
        r04 = false;
        goto L18
    L13:
        r03 = false;
        goto L14
    L9:
        r02 = false;
        goto L10
    L5:
        r0 = false;
        goto L6
    }
}
