package p165;

import android.os.Parcel;
import android.util.SparseIntArray;
import androidx.activity.AbstractC0900;
import androidx.collection.C1104;

/* JADX INFO: renamed from: 飘花落叶言子兰苏楪世哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8404 extends AbstractC8405 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f20843;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Parcel f20844;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final SparseIntArray f20845;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final String f20846;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int f20847;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f20848;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f20849;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f20850;

    public C8404(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C1104(0), new C1104(0), new C1104(0));
    }

    @Override // p165.AbstractC8405
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean mo13357(int i) {
        while (true) {
            int i2 = this.f20850;
            int i3 = this.f20848;
            if (i2 >= this.f20847) {
                return i3 == i;
            }
            if (i3 == i) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i4 = this.f20850;
            Parcel parcel = this.f20844;
            parcel.setDataPosition(i4);
            int i5 = parcel.readInt();
            this.f20848 = parcel.readInt();
            this.f20850 += i5;
        }
    }

    @Override // p165.AbstractC8405
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8404 mo13358() {
        Parcel parcel = this.f20844;
        int iDataPosition = parcel.dataPosition();
        int i = this.f20850;
        if (i == this.f20843) {
            i = this.f20847;
        }
        return new C8404(parcel, iDataPosition, i, AbstractC0900.m711(new StringBuilder(), this.f20846, "  "), this.f20853, this.f20852, this.f20851);
    }

    @Override // p165.AbstractC8405
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo13359(int i) {
        int i2 = this.f20849;
        SparseIntArray sparseIntArray = this.f20845;
        Parcel parcel = this.f20844;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(iDataPosition - i3);
            parcel.setDataPosition(iDataPosition);
        }
        this.f20849 = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public C8404(Parcel parcel, int i, int i2, String str, C1104 c1104, C1104 c11042, C1104 c11043) {
        super(c1104, c11042, c11043);
        this.f20845 = new SparseIntArray();
        this.f20849 = -1;
        this.f20848 = -1;
        this.f20844 = parcel;
        this.f20843 = i;
        this.f20847 = i2;
        this.f20850 = i;
        this.f20846 = str;
    }
}
