package p000a;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: a.mg */
/* JADX INFO: loaded from: classes.dex */
public final class C0714mg extends AbstractC0695lg {

    /* JADX INFO: renamed from: d */
    public final SparseIntArray f2697d;

    /* JADX INFO: renamed from: e */
    public final Parcel f2698e;

    /* JADX INFO: renamed from: f */
    public final int f2699f;

    /* JADX INFO: renamed from: g */
    public final int f2700g;

    /* JADX INFO: renamed from: h */
    public final String f2701h;

    /* JADX INFO: renamed from: i */
    public int f2702i;

    /* JADX INFO: renamed from: j */
    public int f2703j;

    /* JADX INFO: renamed from: k */
    public int f2704k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0714mg(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0166J1(), new C0166J1(), new C0166J1());
    }

    @Override // p000a.AbstractC0695lg
    /* JADX INFO: renamed from: a */
    public final C0714mg mo1564a() {
        Parcel parcel = this.f2698e;
        int iDataPosition = parcel.dataPosition();
        int i = this.f2703j;
        if (i == this.f2699f) {
            i = this.f2700g;
        }
        return new C0714mg(parcel, iDataPosition, i, C0944z.m2228h(new StringBuilder(), this.f2701h, "  "), this.f2598a, this.f2599b, this.f2600c);
    }

    @Override // p000a.AbstractC0695lg
    /* JADX INFO: renamed from: e */
    public final boolean mo1568e() {
        return this.f2698e.readInt() != 0;
    }

    @Override // p000a.AbstractC0695lg
    /* JADX INFO: renamed from: f */
    public final byte[] mo1569f() {
        Parcel parcel = this.f2698e;
        int i = parcel.readInt();
        if (i < 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        parcel.readByteArray(bArr);
        return bArr;
    }

    @Override // p000a.AbstractC0695lg
    /* JADX INFO: renamed from: g */
    public final CharSequence mo1570g() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f2698e);
    }

    @Override // p000a.AbstractC0695lg
    /* JADX INFO: renamed from: h */
    public final boolean mo1571h(int i) {
        while (this.f2703j < this.f2700g) {
            int i2 = this.f2704k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i3 = this.f2703j;
            Parcel parcel = this.f2698e;
            parcel.setDataPosition(i3);
            int i4 = parcel.readInt();
            this.f2704k = parcel.readInt();
            this.f2703j += i4;
        }
        return this.f2704k == i;
    }

    @Override // p000a.AbstractC0695lg
    /* JADX INFO: renamed from: i */
    public final int mo1572i() {
        return this.f2698e.readInt();
    }

    @Override // p000a.AbstractC0695lg
    /* JADX INFO: renamed from: j */
    public final <T extends Parcelable> T mo1573j() {
        return (T) this.f2698e.readParcelable(C0714mg.class.getClassLoader());
    }

    @Override // p000a.AbstractC0695lg
    /* JADX INFO: renamed from: k */
    public final String mo1574k() {
        return this.f2698e.readString();
    }

    @Override // p000a.AbstractC0695lg
    /* JADX INFO: renamed from: m */
    public final void mo1576m(int i) {
        m1628u();
        this.f2702i = i;
        this.f2697d.put(i, this.f2698e.dataPosition());
        mo1580q(0);
        mo1580q(i);
    }

    @Override // p000a.AbstractC0695lg
    /* JADX INFO: renamed from: n */
    public final void mo1577n(boolean z) {
        this.f2698e.writeInt(z ? 1 : 0);
    }

    @Override // p000a.AbstractC0695lg
    /* JADX INFO: renamed from: o */
    public final void mo1578o(byte[] bArr) {
        Parcel parcel = this.f2698e;
        if (bArr == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
    }

    @Override // p000a.AbstractC0695lg
    /* JADX INFO: renamed from: p */
    public final void mo1579p(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f2698e, 0);
    }

    @Override // p000a.AbstractC0695lg
    /* JADX INFO: renamed from: q */
    public final void mo1580q(int i) {
        this.f2698e.writeInt(i);
    }

    @Override // p000a.AbstractC0695lg
    /* JADX INFO: renamed from: r */
    public final void mo1581r(Parcelable parcelable) {
        this.f2698e.writeParcelable(parcelable, 0);
    }

    @Override // p000a.AbstractC0695lg
    /* JADX INFO: renamed from: s */
    public final void mo1582s(String str) {
        this.f2698e.writeString(str);
    }

    /* JADX INFO: renamed from: u */
    public final void m1628u() {
        int i = this.f2702i;
        if (i >= 0) {
            int i2 = this.f2697d.get(i);
            Parcel parcel = this.f2698e;
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i2);
            parcel.writeInt(iDataPosition - i2);
            parcel.setDataPosition(iDataPosition);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0714mg(Parcel parcel, int i, int i2, String str, C0166J1<String, Method> c0166j1, C0166J1<String, Method> c0166j12, C0166J1<String, Class> c0166j13) {
        super(c0166j1, c0166j12, c0166j13);
        this.f2697d = new SparseIntArray();
        this.f2702i = -1;
        this.f2704k = -1;
        this.f2698e = parcel;
        this.f2699f = i;
        this.f2700g = i2;
        this.f2703j = i;
        this.f2701h = str;
    }
}
