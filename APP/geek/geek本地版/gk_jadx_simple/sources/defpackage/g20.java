package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class g20 extends d {
    public static final Parcelable.Creator<g20> CREATOR = null;
    public boolean c;

    static {
        CREATOR = new c(6);
    }

    public g20(Parcel r1, ClassLoader r2) {
        super(r1, r2);
        this.c = ((Boolean) r1.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.c + "}";
    }

    @Override // defpackage.d, android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        super.writeToParcel(r1, r2);
        r1.writeValue(Boolean.valueOf(this.c));
    }
}
