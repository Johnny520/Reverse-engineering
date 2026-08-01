package androidx.compose.runtime.snapshots;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout$SavedState;
import androidx.viewpager.widget.ViewPager$SavedState;
import com.google.android.material.internal.ParcelableSparseArray;
import com.google.android.material.stateful.ExtendableSavedState;
import p138.C8224;
import p140.C8240;
import p140.C8248;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2117 implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f4101;

    public /* synthetic */ C2117(int i) {
        this.f4101 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static SnapshotStateSet m2841(Parcel parcel, ClassLoader classLoader) {
        SnapshotStateSet snapshotStateSet = new SnapshotStateSet();
        C8224 c8224 = C8224.f20392;
        C2100 c2100 = new C2100(AbstractC2115.m2840().mo2770(), c8224);
        if (AbstractC2115.f4091.m953() != null) {
            c2100.f3991 = new C2100(1L, c8224);
        }
        snapshotStateSet.f3990 = c2100;
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
    public static SnapshotStateList m2842(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = C2117.class.getClassLoader();
        }
        int i = parcel.readInt();
        if (i == 0) {
            return new SnapshotStateList();
        }
        C8240 c8240Mo13189 = C8248.f20455.mo13189();
        for (int i2 = 0; i2 < i; i2++) {
            c8240Mo13189.add(parcel.readValue(classLoader));
        }
        return new SnapshotStateList(c8240Mo13189.m13169());
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f4101) {
            case 0:
                return m2842(parcel, classLoader);
            case 1:
                return m2841(parcel, classLoader);
            case 2:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbsSavedState.f7043;
                }
                C6755.m11870("superState must be null");
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
        switch (this.f4101) {
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
        switch (this.f4101) {
            case 0:
                return m2842(parcel, null);
            case 1:
                return m2841(parcel, null);
            case 2:
                if (parcel.readParcelable(null) == null) {
                    return AbsSavedState.f7043;
                }
                C6755.m11870("superState must be null");
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
