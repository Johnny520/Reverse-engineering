package p001A0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import p019K.AbstractC0239b;

/* JADX INFO: renamed from: A0.J */
/* JADX INFO: loaded from: classes.dex */
public final class C0024J extends AbstractC0239b {
    public static final Parcelable.Creator<C0024J> CREATOR = null;

    /* JADX INFO: renamed from: c */
    public CharSequence f62c;

    /* JADX INFO: renamed from: d */
    public boolean f63d;

    static {
        CREATOR = new C0023I(0);
    }

    public C0024J(Parcel r1, ClassLoader r2) {
        super(r1, r2);
        this.f62c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(r1);
        boolean r22 = true;
        if (r1.readInt() == 1) goto L6;
        r22 = false;
    L6:
        this.f63d = r22;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + this.f62c + "}";
    }

    @Override // p019K.AbstractC0239b, android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        super.writeToParcel(r2, r3);
        TextUtils.writeToParcel(this.f62c, r2, r3);
        r2.writeInt(this.f63d ? 1 : 0);
    }
}
