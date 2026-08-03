package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: j5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2084j5 implements Parcelable {
    public static final Parcelable.Creator<C2084j5> CREATOR = null;

    /* JADX INFO: renamed from: a */
    public final ArrayList f7344a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f7345b;

    static {
        CREATOR = new C0646P0(3);
    }

    public C2084j5(Parcel r2) {
        this.f7344a = r2.createStringArrayList();
        this.f7345b = r2.createTypedArrayList(C1527i5.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        r1.writeStringList(this.f7344a);
        r1.writeTypedList(this.f7345b);
    }
}
