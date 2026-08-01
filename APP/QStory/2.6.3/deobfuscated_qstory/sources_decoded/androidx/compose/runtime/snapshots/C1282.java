package androidx.compose.runtime.snapshots;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout$SavedState;
import androidx.viewpager.widget.ViewPager$SavedState;
import com.google.android.material.internal.ParcelableSparseArray;
import com.google.android.material.stateful.ExtendableSavedState;
import p122.C7395;
import p124.C7411;
import p124.C7419;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1282 implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f3756;

    public /* synthetic */ C1282(int i) {
        this.f3756 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static SnapshotStateSet m2281(Parcel parcel, ClassLoader classLoader) {
        SnapshotStateSet snapshotStateSet = new SnapshotStateSet();
        C7395 c7395 = C7395.f20047;
        C1265 c1265 = new C1265(AbstractC1280.m2280().mo2210(), c7395);
        if (AbstractC1280.f3746.m393() != null) {
            c1265.f3646 = new C1265(1L, c7395);
        }
        snapshotStateSet.f3645 = c1265;
        if (classLoader == null) {
            classLoader = SnapshotStateSet.class.getClassLoader();
        }
        int i = parcel.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            snapshotStateSet.add(parcel.readValue(classLoader));
        }
        return snapshotStateSet;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static SnapshotStateList m2282(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = C1282.class.getClassLoader();
        }
        int i = parcel.readInt();
        if (i == 0) {
            return new SnapshotStateList();
        }
        C7411 c7411Mo12630 = C7419.f20110.mo12630();
        for (int i2 = 0; i2 < i; i2++) {
            c7411Mo12630.add(parcel.readValue(classLoader));
        }
        return new SnapshotStateList(c7411Mo12630.m12610());
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f3756) {
            case 0:
                return m2282(parcel, classLoader);
            case 1:
                return m2281(parcel, classLoader);
            case 2:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbsSavedState.f6698;
                }
                C5925.m11311("superState must be null");
                return null;
            case 3:
                return new ParcelableSparseArray(parcel, classLoader);
            case 4:
                return new ViewPager$SavedState(parcel, classLoader);
            case 5:
                return new DrawerLayout$SavedState(parcel, classLoader);
            default:
                return new ExtendableSavedState(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f3756) {
            case 0:
                return new SnapshotStateList[i];
            case 1:
                return new SnapshotStateSet[i];
            case 2:
                return new AbsSavedState[i];
            case 3:
                return new ParcelableSparseArray[i];
            case 4:
                return new ViewPager$SavedState[i];
            case 5:
                return new DrawerLayout$SavedState[i];
            default:
                return new ExtendableSavedState[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f3756) {
            case 0:
                return m2282(parcel, null);
            case 1:
                return m2281(parcel, null);
            case 2:
                if (parcel.readParcelable(null) == null) {
                    return AbsSavedState.f6698;
                }
                C5925.m11311("superState must be null");
                return null;
            case 3:
                return new ParcelableSparseArray(parcel, null);
            case 4:
                return new ViewPager$SavedState(parcel, null);
            case 5:
                return new DrawerLayout$SavedState(parcel, null);
            default:
                return new ExtendableSavedState(parcel, null);
        }
    }
}
