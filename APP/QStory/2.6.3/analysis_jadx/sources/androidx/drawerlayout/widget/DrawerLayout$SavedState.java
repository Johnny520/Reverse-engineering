package androidx.drawerlayout.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.snapshots.C1282;
import androidx.customview.view.AbsSavedState;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class DrawerLayout$SavedState extends AbsSavedState {
    public static final Parcelable.Creator<DrawerLayout$SavedState> CREATOR = new C1282(5);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int f6700;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f6701;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final int f6702;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final int f6703;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f6704;

    public DrawerLayout$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f6704 = 0;
        this.f6704 = parcel.readInt();
        this.f6701 = parcel.readInt();
        this.f6700 = parcel.readInt();
        this.f6702 = parcel.readInt();
        this.f6703 = parcel.readInt();
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f6704);
        parcel.writeInt(this.f6701);
        parcel.writeInt(this.f6700);
        parcel.writeInt(this.f6702);
        parcel.writeInt(this.f6703);
    }
}
