package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: renamed from: Oq */
/* JADX INFO: loaded from: classes.dex */
public final class C0635Oq extends View.BaseSavedState {
    public static final Parcelable.Creator<C0635Oq> CREATOR = new C0646P0(11);

    /* JADX INFO: renamed from: a */
    public int f2032a;

    public final String toString() {
        StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" CheckedState=");
        int i = this.f2032a;
        return AbstractC0213Ey.m410h(sb, i != 1 ? i != 2 ? "unchecked" : "indeterminate" : "checked", "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Integer.valueOf(this.f2032a));
    }
}
