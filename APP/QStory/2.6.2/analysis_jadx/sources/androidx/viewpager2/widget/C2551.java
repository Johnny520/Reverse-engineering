package androidx.viewpager2.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: androidx.viewpager2.widget.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2551 implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ViewPager2$SavedState viewPager2$SavedState = new ViewPager2$SavedState(parcel, null);
        viewPager2$SavedState.f7648 = parcel.readInt();
        viewPager2$SavedState.f7646 = parcel.readInt();
        viewPager2$SavedState.f7647 = parcel.readParcelable(null);
        return viewPager2$SavedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ViewPager2$SavedState[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        ViewPager2$SavedState viewPager2$SavedState = new ViewPager2$SavedState(parcel, classLoader);
        viewPager2$SavedState.f7648 = parcel.readInt();
        viewPager2$SavedState.f7646 = parcel.readInt();
        viewPager2$SavedState.f7647 = parcel.readParcelable(classLoader);
        return viewPager2$SavedState;
    }
}
