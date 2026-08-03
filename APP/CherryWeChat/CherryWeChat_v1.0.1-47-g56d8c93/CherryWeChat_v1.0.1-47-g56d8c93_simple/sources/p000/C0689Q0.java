package p000;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: Q0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0689Q0 implements Parcelable {
    public static final Parcelable.Creator<C0689Q0> CREATOR = null;

    /* JADX INFO: renamed from: a */
    public final int f2217a;

    /* JADX INFO: renamed from: b */
    public final Intent f2218b;

    static {
        CREATOR = new C0646P0(0);
    }

    public C0689Q0(Intent r1, int r2) {
        this.f2217a = r2;
        this.f2218b = r1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("ActivityResult{resultCode=");
        int r2 = this.f2217a;
        if (r2 == (-1)) goto L7;
        if (r2 == 0) goto L6;
        String r1 = String.valueOf(r2);
    L8:
        r0.append(r1);
        r0.append(", data=");
        r0.append(this.f2218b);
        r0.append('}');
        return r0.toString();
    L6:
        r1 = "RESULT_CANCELED";
        goto L8
    L7:
        r1 = "RESULT_OK";
        goto L8
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        r3.writeInt(this.f2217a);
        Intent r0 = this.f2218b;
        if (r0 != null) goto L5;
        int r1 = 0;
    L6:
        r3.writeInt(r1);
        if (r0 == null) goto L10;
        r0.writeToParcel(r3, r4);
        return;
    L10:
        return;
    L5:
        r1 = 1;
        goto L6
    }
}
