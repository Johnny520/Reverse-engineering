package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class g60 extends AbstractC0133d {
    public static final Parcelable.Creator<g60> CREATOR = new C0086c(8);

    /* JADX INFO: renamed from: c */
    public CharSequence f2031c;

    /* JADX INFO: renamed from: d */
    public boolean f2032d;

    public g60(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2031c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2032d = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f2031c) + "}";
    }

    @Override // p000.AbstractC0133d, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.f2031c, parcel, i);
        parcel.writeInt(this.f2032d ? 1 : 0);
    }
}
