package androidx.compose.runtime.snapshots;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout$SavedState;
import androidx.viewpager.widget.ViewPager$SavedState;
import com.google.android.material.internal.ParcelableSparseArray;
import com.google.android.material.stateful.ExtendableSavedState;
import p122.C7394;
import p124.C7410;
import p124.C7418;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1282 implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f3755;

    public /* synthetic */ C1282(int i) {
        this.f3755 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static SnapshotStateSet m2271(Parcel parcel, ClassLoader classLoader) {
        SnapshotStateSet snapshotStateSet = new SnapshotStateSet();
        C7394 c7394 = C7394.f20052;
        C1265 c1265 = new C1265(AbstractC1280.m2270().mo2200(), c7394);
        if (AbstractC1280.f3745.m391() != null) {
            c1265.f3645 = new C1265(1L, c7394);
        }
        snapshotStateSet.f3644 = c1265;
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
    public static SnapshotStateList m2272(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = C1282.class.getClassLoader();
        }
        int i = parcel.readInt();
        if (i == 0) {
            return new SnapshotStateList();
        }
        C7410 c7410Mo12603 = C7418.f20115.mo12603();
        for (int i2 = 0; i2 < i; i2++) {
            c7410Mo12603.add(parcel.readValue(classLoader));
        }
        return new SnapshotStateList(c7410Mo12603.m12584());
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f3755) {
            case 0:
                return m2272(parcel, classLoader);
            case 1:
                return m2271(parcel, classLoader);
            case 2:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbsSavedState.f6697;
                }
                C5919.m11250("superState must be null");
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
        switch (this.f3755) {
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
        switch (this.f3755) {
            case 0:
                return m2272(parcel, null);
            case 1:
                return m2271(parcel, null);
            case 2:
                if (parcel.readParcelable(null) == null) {
                    return AbsSavedState.f6697;
                }
                C5919.m11250("superState must be null");
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
