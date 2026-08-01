package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new C2331(0);

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final boolean f6705;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final ArrayList f6706;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final ArrayList f6707;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final CharSequence f6708;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final int f6709;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int f6710;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int[] f6711;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final int f6712;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final CharSequence f6713;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final String f6714;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final int f6715;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ArrayList f6716;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int[] f6717;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int[] f6718;

    public BackStackRecordState(C2332 c2332) {
        int size = c2332.f6847.size();
        this.f6718 = new int[size * 6];
        if (!c2332.f6856) {
            C5925.m11311("Not on back stack");
            throw null;
        }
        this.f6716 = new ArrayList(size);
        this.f6717 = new int[size];
        this.f6711 = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C2356 c2356 = (C2356) c2332.f6847.get(i2);
            int i3 = i + 1;
            this.f6718[i] = c2356.f6974;
            ArrayList arrayList = this.f6716;
            AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = c2356.f6973;
            arrayList.add(abstractComponentCallbacksC2338 != null ? abstractComponentCallbacksC2338.f6901 : null);
            int[] iArr = this.f6718;
            iArr[i3] = c2356.f6972 ? 1 : 0;
            iArr[i + 2] = c2356.f6971;
            iArr[i + 3] = c2356.f6970;
            int i4 = i + 5;
            iArr[i + 4] = c2356.f6969;
            i += 6;
            iArr[i4] = c2356.f6976;
            this.f6717[i2] = c2356.f6975.ordinal();
            this.f6711[i2] = c2356.f6977.ordinal();
        }
        this.f6710 = c2332.f6842;
        this.f6714 = c2332.f6859;
        this.f6715 = c2332.f6848;
        this.f6712 = c2332.f6860;
        this.f6713 = c2332.f6857;
        this.f6709 = c2332.f6858;
        this.f6708 = c2332.f6850;
        this.f6707 = c2332.f6849;
        this.f6706 = c2332.f6853;
        this.f6705 = c2332.f6854;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f6718);
        parcel.writeStringList(this.f6716);
        parcel.writeIntArray(this.f6717);
        parcel.writeIntArray(this.f6711);
        parcel.writeInt(this.f6710);
        parcel.writeString(this.f6714);
        parcel.writeInt(this.f6715);
        parcel.writeInt(this.f6712);
        TextUtils.writeToParcel(this.f6713, parcel, 0);
        parcel.writeInt(this.f6709);
        TextUtils.writeToParcel(this.f6708, parcel, 0);
        parcel.writeStringList(this.f6707);
        parcel.writeStringList(this.f6706);
        parcel.writeInt(this.f6705 ? 1 : 0);
    }

    public BackStackRecordState(Parcel parcel) {
        this.f6718 = parcel.createIntArray();
        this.f6716 = parcel.createStringArrayList();
        this.f6717 = parcel.createIntArray();
        this.f6711 = parcel.createIntArray();
        this.f6710 = parcel.readInt();
        this.f6714 = parcel.readString();
        this.f6715 = parcel.readInt();
        this.f6712 = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f6713 = (CharSequence) creator.createFromParcel(parcel);
        this.f6709 = parcel.readInt();
        this.f6708 = (CharSequence) creator.createFromParcel(parcel);
        this.f6707 = parcel.createStringArrayList();
        this.f6706 = parcel.createStringArrayList();
        this.f6705 = parcel.readInt() != 0;
    }
}
