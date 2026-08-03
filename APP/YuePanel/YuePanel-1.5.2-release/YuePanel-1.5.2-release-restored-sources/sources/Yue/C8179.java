package Yue;

import Yue.InterfaceC7144;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: Yue.ۥۣۢۦۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
public class C8179 extends AbstractC8178 {

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final boolean f24308 = false;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final String f24309 = "VersionedParcelParcel";

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final SparseIntArray f24310;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final Parcel f24311;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final int f24312;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final int f24313;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final String f24314;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public int f24315;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public int f24316;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public int f24317;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8179(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C3394(), new C3394(), new C3394());
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥ */
    public void mo4207() {
        int i = this.f24315;
        if (i >= 0) {
            int i2 = this.f24310.get(i);
            int iDataPosition = this.f24311.dataPosition();
            this.f24311.setDataPosition(i2);
            this.f24311.writeInt(iDataPosition - i2);
            this.f24311.setDataPosition(iDataPosition);
        }
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥ۟۟ */
    public AbstractC8178 mo26980() {
        Parcel parcel = this.f24311;
        int iDataPosition = parcel.dataPosition();
        int i = this.f24316;
        if (i == this.f24312) {
            i = this.f24313;
        }
        return new C8179(parcel, iDataPosition, i, this.f24314 + "  ", this.f3290, this.f3291, this.f24306);
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public boolean mo26988() {
        return this.f24311.readInt() != 0;
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public Bundle mo26992() {
        return this.f24311.readBundle(getClass().getClassLoader());
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
    public byte[] mo26995() {
        int i = this.f24311.readInt();
        if (i < 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        this.f24311.readByteArray(bArr);
        return bArr;
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ */
    public CharSequence mo26998() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f24311);
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ */
    public double mo27001() {
        return this.f24311.readDouble();
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ */
    public boolean mo27008(int i) {
        while (this.f24316 < this.f24313) {
            int i2 = this.f24317;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f24311.setDataPosition(this.f24316);
            int i3 = this.f24311.readInt();
            this.f24317 = this.f24311.readInt();
            this.f24316 += i3;
        }
        return this.f24317 == i;
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ */
    public float mo27009() {
        return this.f24311.readFloat();
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟ */
    public int mo27014() {
        return this.f24311.readInt();
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ */
    public long mo27019() {
        return this.f24311.readLong();
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥۣ۟۟ */
    public <T extends Parcelable> T mo27024() {
        return (T) this.f24311.readParcelable(getClass().getClassLoader());
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥۣ۟۟ۥ */
    public String mo27031() {
        return this.f24311.readString();
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ */
    public IBinder mo27033() {
        return this.f24311.readStrongBinder();
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥ۟۟ۤ۠ */
    public void mo27037(int i) {
        mo4207();
        this.f24315 = i;
        this.f24310.put(i, this.f24311.dataPosition());
        mo27066(0);
        mo27066(i);
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥ۟۟ۤۤ */
    public void mo27041(boolean z) {
        this.f24311.writeInt(z ? 1 : 0);
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥ۟۟ۤۨ */
    public void mo27045(Bundle bundle) {
        this.f24311.writeBundle(bundle);
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥ۟۟ۥ۠ */
    public void mo27048(byte[] bArr) {
        if (bArr == null) {
            this.f24311.writeInt(-1);
        } else {
            this.f24311.writeInt(bArr.length);
            this.f24311.writeByteArray(bArr);
        }
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥ۟۟ۥۢ */
    public void mo27050(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            this.f24311.writeInt(-1);
        } else {
            this.f24311.writeInt(bArr.length);
            this.f24311.writeByteArray(bArr, i, i2);
        }
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥ۟۟ۥۥ */
    public void mo27053(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f24311, 0);
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥ۟۟ۦ */
    public void mo27057(double d) {
        this.f24311.writeDouble(d);
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥ۟۟ۦۣ */
    public void mo27062(float f) {
        this.f24311.writeFloat(f);
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥ۟۟ۦۧ */
    public void mo27066(int i) {
        this.f24311.writeInt(i);
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥ۟۟ۧۡ */
    public void mo27071(long j) {
        this.f24311.writeLong(j);
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥ۟۟ۧۧ */
    public void mo27077(Parcelable parcelable) {
        this.f24311.writeParcelable(parcelable, 0);
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥ۟۟ۨۤ */
    public void mo27085(String str) {
        this.f24311.writeString(str);
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥ۟۟ۨۦ */
    public void mo27087(IBinder iBinder) {
        this.f24311.writeStrongBinder(iBinder);
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥ۟۟ۨۨ */
    public void mo27089(IInterface iInterface) {
        this.f24311.writeStrongInterface(iInterface);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C8179(Parcel parcel, int i, int i2, String str, C3394<String, Method> c3394, C3394<String, Method> c33942, C3394<String, Class> c33943) {
        super(c3394, c33942, c33943);
        this.f24310 = new SparseIntArray();
        this.f24315 = -1;
        this.f24317 = -1;
        this.f24311 = parcel;
        this.f24312 = i;
        this.f24313 = i2;
        this.f24316 = i;
        this.f24314 = str;
    }
}
