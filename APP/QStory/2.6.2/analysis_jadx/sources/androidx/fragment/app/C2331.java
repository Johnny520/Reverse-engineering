package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2331 implements Parcelable.Creator {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f6840;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f6840) {
            case 0:
                return new BackStackRecordState(parcel);
            case 1:
                return new BackStackState(parcel);
            case 2:
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = new FragmentManager$LaunchedFragmentInfo();
                fragmentManager$LaunchedFragmentInfo.f6726 = parcel.readString();
                fragmentManager$LaunchedFragmentInfo.f6725 = parcel.readInt();
                return fragmentManager$LaunchedFragmentInfo;
            case 3:
                FragmentManagerState fragmentManagerState = new FragmentManagerState();
                fragmentManagerState.f6727 = null;
                fragmentManagerState.f6730 = new ArrayList();
                fragmentManagerState.f6731 = new ArrayList();
                fragmentManagerState.f6734 = parcel.createStringArrayList();
                fragmentManagerState.f6732 = parcel.createStringArrayList();
                fragmentManagerState.f6733 = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
                fragmentManagerState.f6728 = parcel.readInt();
                fragmentManagerState.f6727 = parcel.readString();
                fragmentManagerState.f6730 = parcel.createStringArrayList();
                fragmentManagerState.f6731 = parcel.createTypedArrayList(BackStackState.CREATOR);
                fragmentManagerState.f6729 = parcel.createTypedArrayList(FragmentManager$LaunchedFragmentInfo.CREATOR);
                return fragmentManagerState;
            case 4:
                return new FragmentState(parcel);
            default:
                FragmentTabHost$SavedState fragmentTabHost$SavedState = new FragmentTabHost$SavedState(parcel);
                fragmentTabHost$SavedState.f6749 = parcel.readString();
                return fragmentTabHost$SavedState;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f6840) {
            case 0:
                return new BackStackRecordState[i];
            case 1:
                return new BackStackState[i];
            case 2:
                return new FragmentManager$LaunchedFragmentInfo[i];
            case 3:
                return new FragmentManagerState[i];
            case 4:
                return new FragmentState[i];
            default:
                return new FragmentTabHost$SavedState[i];
        }
    }
}
