package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: renamed from: xA */
/* JADX INFO: loaded from: classes.dex */
public final class C2705xA extends AbstractC2393q {
    public static final Parcelable.Creator<C2705xA> CREATOR = null;

    /* JADX INFO: renamed from: c */
    public CharSequence f9280c;

    /* JADX INFO: renamed from: d */
    public boolean f9281d;

    static {
        CREATOR = new C2342p(8);
    }

    public C2705xA(Parcel r1, ClassLoader r2) {
        super(r1, r2);
        this.f9280c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(r1);
        boolean r22 = true;
        if (r1.readInt() == 1) goto L6;
        r22 = false;
    L6:
        this.f9281d = r22;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + this.f9280c + "}";
    }

    @Override // p000.AbstractC2393q, android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        super.writeToParcel(r2, r3);
        TextUtils.writeToParcel(this.f9280c, r2, r3);
        r2.writeInt(this.f9281d ? 1 : 0);
    }
}
