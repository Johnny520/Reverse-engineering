package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: renamed from: xA */
/* JADX INFO: loaded from: classes.dex */
public final class C2705xA extends AbstractC2393q {
    public static final Parcelable.Creator<C2705xA> CREATOR = new C2342p(8);

    /* JADX INFO: renamed from: c */
    public CharSequence f9280c;

    /* JADX INFO: renamed from: d */
    public boolean f9281d;

    public C2705xA(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f9280c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f9281d = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f9280c) + "}";
    }

    @Override // p000.AbstractC2393q, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.f9280c, parcel, i);
        parcel.writeInt(this.f9281d ? 1 : 0);
    }
}
