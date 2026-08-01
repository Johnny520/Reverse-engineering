package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class g60 extends d {
    public static final Parcelable.Creator<g60> CREATOR = null;
    public CharSequence c;
    public boolean d;

    static {
        CREATOR = new c(8);
    }

    public g60(Parcel r1, ClassLoader r2) {
        super(r1, r2);
        this.c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(r1);
        boolean r22 = true;
        if (r1.readInt() == 1) goto L6;
        r22 = false;
    L6:
        this.d = r22;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + this.c + "}";
    }

    @Override // defpackage.d, android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        super.writeToParcel(r2, r3);
        TextUtils.writeToParcel(this.c, r2, r3);
        r2.writeInt(this.d ? 1 : 0);
    }
}
