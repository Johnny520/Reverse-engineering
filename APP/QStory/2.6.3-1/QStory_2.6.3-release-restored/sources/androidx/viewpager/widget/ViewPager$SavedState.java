package androidx.viewpager.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.AbstractC0900;
import androidx.compose.runtime.snapshots.C2117;
import androidx.customview.view.AbsSavedState;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class ViewPager$SavedState extends AbsSavedState {
    public static final Parcelable.Creator<ViewPager$SavedState> CREATOR = new C2117(4);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Parcelable f7990;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f7991;

    public ViewPager$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
        this.f7991 = parcel.readInt();
        this.f7990 = parcel.readParcelable(classLoader);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" position=");
        return AbstractC0900.m707(sb, "}", this.f7991);
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f7991);
        parcel.writeParcelable(this.f7990, i);
    }
}
