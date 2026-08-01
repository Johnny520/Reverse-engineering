package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new C3164(0);

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final boolean f7050;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final ArrayList f7051;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final ArrayList f7052;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final CharSequence f7053;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final int f7054;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int f7055;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int[] f7056;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final int f7057;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final CharSequence f7058;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final String f7059;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final int f7060;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ArrayList f7061;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int[] f7062;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int[] f7063;

    public BackStackRecordState(C3165 c3165) {
        int size = c3165.f7192.size();
        this.f7063 = new int[size * 6];
        if (!c3165.f7201) {
            C6755.m11870("Not on back stack");
            throw null;
        }
        this.f7061 = new ArrayList(size);
        this.f7062 = new int[size];
        this.f7056 = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C3189 c3189 = (C3189) c3165.f7192.get(i2);
            int i3 = i + 1;
            this.f7063[i] = c3189.f7319;
            ArrayList arrayList = this.f7061;
            AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = c3189.f7318;
            arrayList.add(abstractComponentCallbacksC3171 != null ? abstractComponentCallbacksC3171.f7246 : null);
            int[] iArr = this.f7063;
            iArr[i3] = c3189.f7317 ? 1 : 0;
            iArr[i + 2] = c3189.f7316;
            iArr[i + 3] = c3189.f7315;
            int i4 = i + 5;
            iArr[i + 4] = c3189.f7314;
            i += 6;
            iArr[i4] = c3189.f7321;
            this.f7062[i2] = c3189.f7320.ordinal();
            this.f7056[i2] = c3189.f7322.ordinal();
        }
        this.f7055 = c3165.f7187;
        this.f7059 = c3165.f7204;
        this.f7060 = c3165.f7193;
        this.f7057 = c3165.f7205;
        this.f7058 = c3165.f7202;
        this.f7054 = c3165.f7203;
        this.f7053 = c3165.f7195;
        this.f7052 = c3165.f7194;
        this.f7051 = c3165.f7198;
        this.f7050 = c3165.f7199;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f7063);
        parcel.writeStringList(this.f7061);
        parcel.writeIntArray(this.f7062);
        parcel.writeIntArray(this.f7056);
        parcel.writeInt(this.f7055);
        parcel.writeString(this.f7059);
        parcel.writeInt(this.f7060);
        parcel.writeInt(this.f7057);
        TextUtils.writeToParcel(this.f7058, parcel, 0);
        parcel.writeInt(this.f7054);
        TextUtils.writeToParcel(this.f7053, parcel, 0);
        parcel.writeStringList(this.f7052);
        parcel.writeStringList(this.f7051);
        parcel.writeInt(this.f7050 ? 1 : 0);
    }

    public BackStackRecordState(Parcel parcel) {
        this.f7063 = parcel.createIntArray();
        this.f7061 = parcel.createStringArrayList();
        this.f7062 = parcel.createIntArray();
        this.f7056 = parcel.createIntArray();
        this.f7055 = parcel.readInt();
        this.f7059 = parcel.readString();
        this.f7060 = parcel.readInt();
        this.f7057 = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f7058 = (CharSequence) creator.createFromParcel(parcel);
        this.f7054 = parcel.readInt();
        this.f7053 = (CharSequence) creator.createFromParcel(parcel);
        this.f7052 = parcel.createStringArrayList();
        this.f7051 = parcel.createStringArrayList();
        this.f7050 = parcel.readInt() != 0;
    }
}
