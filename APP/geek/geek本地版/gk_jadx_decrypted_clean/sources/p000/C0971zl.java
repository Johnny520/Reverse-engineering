package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: zl */
/* JADX INFO: loaded from: classes.dex */
public final class C0971zl implements Parcelable {
    public static final Parcelable.Creator<C0971zl> CREATOR = new C0729t1(6);

    /* JADX INFO: renamed from: a */
    public ArrayList f5564a;

    /* JADX INFO: renamed from: b */
    public ArrayList f5565b;

    /* JADX INFO: renamed from: c */
    public C0094c7[] f5566c;

    /* JADX INFO: renamed from: d */
    public int f5567d;

    /* JADX INFO: renamed from: e */
    public String f5568e;

    /* JADX INFO: renamed from: f */
    public ArrayList f5569f;

    /* JADX INFO: renamed from: g */
    public ArrayList f5570g;

    /* JADX INFO: renamed from: h */
    public ArrayList f5571h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f5564a);
        parcel.writeStringList(this.f5565b);
        parcel.writeTypedArray(this.f5566c, i);
        parcel.writeInt(this.f5567d);
        parcel.writeString(this.f5568e);
        parcel.writeStringList(this.f5569f);
        parcel.writeTypedList(this.f5570g);
        parcel.writeTypedList(this.f5571h);
    }
}
