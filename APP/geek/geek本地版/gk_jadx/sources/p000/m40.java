package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class m40 implements Parcelable {
    public static final Parcelable.Creator<m40> CREATOR = new C0729t1(14);

    /* JADX INFO: renamed from: a */
    public int f3132a;

    /* JADX INFO: renamed from: b */
    public int f3133b;

    /* JADX INFO: renamed from: c */
    public int f3134c;

    /* JADX INFO: renamed from: d */
    public int[] f3135d;

    /* JADX INFO: renamed from: e */
    public int f3136e;

    /* JADX INFO: renamed from: f */
    public int[] f3137f;

    /* JADX INFO: renamed from: g */
    public ArrayList f3138g;

    /* JADX INFO: renamed from: h */
    public boolean f3139h;

    /* JADX INFO: renamed from: i */
    public boolean f3140i;

    /* JADX INFO: renamed from: j */
    public boolean f3141j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3132a);
        parcel.writeInt(this.f3133b);
        parcel.writeInt(this.f3134c);
        if (this.f3134c > 0) {
            parcel.writeIntArray(this.f3135d);
        }
        parcel.writeInt(this.f3136e);
        if (this.f3136e > 0) {
            parcel.writeIntArray(this.f3137f);
        }
        parcel.writeInt(this.f3139h ? 1 : 0);
        parcel.writeInt(this.f3140i ? 1 : 0);
        parcel.writeInt(this.f3141j ? 1 : 0);
        parcel.writeList(this.f3138g);
    }
}
