package p149;

import android.os.Parcel;
import android.util.SparseIntArray;
import androidx.activity.AbstractC0053;
import androidx.collection.C0257;

/* JADX INFO: renamed from: 飘花落叶言子兰苏楪世哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7574 extends AbstractC7575 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f20503;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Parcel f20504;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final SparseIntArray f20505;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final String f20506;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int f20507;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f20508;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f20509;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f20510;

    public C7574(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0257(0), new C0257(0), new C0257(0));
    }

    @Override // p149.AbstractC7575
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean mo12769(int i) {
        while (true) {
            int i2 = this.f20510;
            int i3 = this.f20508;
            if (i2 >= this.f20507) {
                return i3 == i;
            }
            if (i3 == i) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i4 = this.f20510;
            Parcel parcel = this.f20504;
            parcel.setDataPosition(i4);
            int i5 = parcel.readInt();
            this.f20508 = parcel.readInt();
            this.f20510 += i5;
        }
    }

    @Override // p149.AbstractC7575
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7574 mo12770() {
        Parcel parcel = this.f20504;
        int iDataPosition = parcel.dataPosition();
        int i = this.f20510;
        if (i == this.f20503) {
            i = this.f20507;
        }
        return new C7574(parcel, iDataPosition, i, AbstractC0053.m146(new StringBuilder(), this.f20506, "  "), this.f20513, this.f20512, this.f20511);
    }

    @Override // p149.AbstractC7575
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo12771(int i) {
        int i2 = this.f20509;
        SparseIntArray sparseIntArray = this.f20505;
        Parcel parcel = this.f20504;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(iDataPosition - i3);
            parcel.setDataPosition(iDataPosition);
        }
        this.f20509 = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public C7574(Parcel parcel, int i, int i2, String str, C0257 c0257, C0257 c02572, C0257 c02573) {
        super(c0257, c02572, c02573);
        this.f20505 = new SparseIntArray();
        this.f20509 = -1;
        this.f20508 = -1;
        this.f20504 = parcel;
        this.f20503 = i;
        this.f20507 = i2;
        this.f20510 = i;
        this.f20506 = str;
    }
}
