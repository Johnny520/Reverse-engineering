package com.google.android.material.badge;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.internal.C3162;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class BadgeState$State implements Parcelable {
    public static final Parcelable.Creator<BadgeState$State> CREATOR = new C3162(6);

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public Boolean f9948;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public Integer f9949;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public Integer f9950;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public Integer f9951;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public Integer f9952;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public Integer f9953;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public Integer f9954;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public Integer f9955;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public Integer f9956;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public String f9957;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public Locale f9958;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public int f9959;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f9960;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f9961;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public String f9962;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public Integer f9963;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public Integer f9964;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public Boolean f9965;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public Integer f9966;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public int f9967;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public String f9968;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Integer f9969;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Integer f9970;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public Integer f9971;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f9972;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public Integer f9973;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public Integer f9974;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Integer f9975;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Integer f9976;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f9977;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f9977);
        parcel.writeSerializable(this.f9975);
        parcel.writeSerializable(this.f9976);
        parcel.writeSerializable(this.f9970);
        parcel.writeSerializable(this.f9969);
        parcel.writeSerializable(this.f9973);
        parcel.writeSerializable(this.f9974);
        parcel.writeSerializable(this.f9971);
        parcel.writeInt(this.f9972);
        parcel.writeString(this.f9962);
        parcel.writeInt(this.f9961);
        parcel.writeInt(this.f9960);
        parcel.writeInt(this.f9959);
        String str = this.f9957;
        parcel.writeString(str != null ? str.toString() : null);
        String str2 = this.f9968;
        parcel.writeString(str2 != null ? str2.toString() : null);
        parcel.writeInt(this.f9967);
        parcel.writeSerializable(this.f9966);
        parcel.writeSerializable(this.f9964);
        parcel.writeSerializable(this.f9963);
        parcel.writeSerializable(this.f9954);
        parcel.writeSerializable(this.f9953);
        parcel.writeSerializable(this.f9956);
        parcel.writeSerializable(this.f9955);
        parcel.writeSerializable(this.f9949);
        parcel.writeSerializable(this.f9951);
        parcel.writeSerializable(this.f9952);
        parcel.writeSerializable(this.f9965);
        parcel.writeSerializable(this.f9958);
        parcel.writeSerializable(this.f9948);
        parcel.writeSerializable(this.f9950);
    }
}
