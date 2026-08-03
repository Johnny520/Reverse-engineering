package p001A0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import p019K.AbstractC0239b;

/* JADX INFO: renamed from: A0.J */
/* JADX INFO: loaded from: classes.dex */
public final class C0024J extends AbstractC0239b {
    public static final Parcelable.Creator<C0024J> CREATOR = new C0023I(0);

    /* JADX INFO: renamed from: c */
    public CharSequence f62c;

    /* JADX INFO: renamed from: d */
    public boolean f63d;

    public C0024J(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f62c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f63d = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f62c) + "}";
    }

    @Override // p019K.AbstractC0239b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        TextUtils.writeToParcel(this.f62c, parcel, i2);
        parcel.writeInt(this.f63d ? 1 : 0);
    }
}
