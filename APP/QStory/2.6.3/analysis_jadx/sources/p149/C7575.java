package p149;

import android.os.Parcel;
import android.util.SparseIntArray;
import androidx.activity.AbstractC0053;
import androidx.collection.C0257;

/* JADX INFO: renamed from: 飘花落叶言子兰苏楪世哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7575 extends AbstractC7576 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f20498;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Parcel f20499;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final SparseIntArray f20500;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final String f20501;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int f20502;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f20503;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f20504;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f20505;

    public C7575(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0257(0), new C0257(0), new C0257(0));
    }

    @Override // p149.AbstractC7576
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean mo12798(int i) {
        while (true) {
            int i2 = this.f20505;
            int i3 = this.f20503;
            if (i2 >= this.f20502) {
                return i3 == i;
            }
            if (i3 == i) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i4 = this.f20505;
            Parcel parcel = this.f20499;
            parcel.setDataPosition(i4);
            int i5 = parcel.readInt();
            this.f20503 = parcel.readInt();
            this.f20505 += i5;
        }
    }

    @Override // p149.AbstractC7576
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7575 mo12799() {
        Parcel parcel = this.f20499;
        int iDataPosition = parcel.dataPosition();
        int i = this.f20505;
        if (i == this.f20498) {
            i = this.f20502;
        }
        return new C7575(parcel, iDataPosition, i, AbstractC0053.m151(new StringBuilder(), this.f20501, "  "), this.f20508, this.f20507, this.f20506);
    }

    @Override // p149.AbstractC7576
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo12800(int i) {
        int i2 = this.f20504;
        SparseIntArray sparseIntArray = this.f20500;
        Parcel parcel = this.f20499;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(iDataPosition - i3);
            parcel.setDataPosition(iDataPosition);
        }
        this.f20504 = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public C7575(Parcel parcel, int i, int i2, String str, C0257 c0257, C0257 c02572, C0257 c02573) {
        super(c0257, c02572, c02573);
        this.f20500 = new SparseIntArray();
        this.f20504 = -1;
        this.f20503 = -1;
        this.f20499 = parcel;
        this.f20498 = i;
        this.f20502 = i2;
        this.f20505 = i;
        this.f20501 = str;
    }
}
