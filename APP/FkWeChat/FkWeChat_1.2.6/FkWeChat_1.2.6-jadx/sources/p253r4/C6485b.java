package p253r4;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import okhttp3.internal.url._UrlKt;
import p117i.C3036a;

/* JADX INFO: renamed from: r4.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C6485b extends AbstractC6484a {

    /* JADX INFO: renamed from: d */
    public final SparseIntArray f20366d;

    /* JADX INFO: renamed from: e */
    public final Parcel f20367e;

    /* JADX INFO: renamed from: f */
    public final int f20368f;

    /* JADX INFO: renamed from: g */
    public final int f20369g;

    /* JADX INFO: renamed from: h */
    public final String f20370h;

    /* JADX INFO: renamed from: i */
    public int f20371i;

    /* JADX INFO: renamed from: j */
    public int f20372j;

    /* JADX INFO: renamed from: k */
    public int f20373k;

    public C6485b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), _UrlKt.FRAGMENT_ENCODE_SET, new C3036a(), new C3036a(), new C3036a());
    }

    @Override // p253r4.AbstractC6484a
    /* JADX INFO: renamed from: A */
    public void mo25686A(byte[] bArr) {
        Parcel parcel = this.f20367e;
        if (bArr == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(bArr.length);
            this.f20367e.writeByteArray(bArr);
        }
    }

    @Override // p253r4.AbstractC6484a
    /* JADX INFO: renamed from: C */
    public void mo25688C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f20367e, 0);
    }

    @Override // p253r4.AbstractC6484a
    /* JADX INFO: renamed from: E */
    public void mo25690E(int i10) {
        this.f20367e.writeInt(i10);
    }

    @Override // p253r4.AbstractC6484a
    /* JADX INFO: renamed from: G */
    public void mo25692G(Parcelable parcelable) {
        this.f20367e.writeParcelable(parcelable, 0);
    }

    @Override // p253r4.AbstractC6484a
    /* JADX INFO: renamed from: I */
    public void mo25694I(String str) {
        this.f20367e.writeString(str);
    }

    @Override // p253r4.AbstractC6484a
    /* JADX INFO: renamed from: a */
    public void mo25700a() {
        int i10 = this.f20371i;
        if (i10 >= 0) {
            int i11 = this.f20366d.get(i10);
            int iDataPosition = this.f20367e.dataPosition();
            this.f20367e.setDataPosition(i11);
            this.f20367e.writeInt(iDataPosition - i11);
            this.f20367e.setDataPosition(iDataPosition);
        }
    }

    @Override // p253r4.AbstractC6484a
    /* JADX INFO: renamed from: b */
    public AbstractC6484a mo25701b() {
        Parcel parcel = this.f20367e;
        int iDataPosition = parcel.dataPosition();
        int i10 = this.f20372j;
        if (i10 == this.f20368f) {
            i10 = this.f20369g;
        }
        return new C6485b(parcel, iDataPosition, i10, this.f20370h + "  ", this.f20363a, this.f20364b, this.f20365c);
    }

    @Override // p253r4.AbstractC6484a
    /* JADX INFO: renamed from: g */
    public boolean mo25706g() {
        return this.f20367e.readInt() != 0;
    }

    @Override // p253r4.AbstractC6484a
    /* JADX INFO: renamed from: i */
    public byte[] mo25708i() {
        int i10 = this.f20367e.readInt();
        if (i10 < 0) {
            return null;
        }
        byte[] bArr = new byte[i10];
        this.f20367e.readByteArray(bArr);
        return bArr;
    }

    @Override // p253r4.AbstractC6484a
    /* JADX INFO: renamed from: k */
    public CharSequence mo25710k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f20367e);
    }

    @Override // p253r4.AbstractC6484a
    /* JADX INFO: renamed from: m */
    public boolean mo25712m(int i10) {
        while (true) {
            int i11 = this.f20372j;
            int i12 = this.f20369g;
            int i13 = this.f20373k;
            if (i11 >= i12) {
                return i13 == i10;
            }
            if (i13 == i10) {
                return true;
            }
            if (String.valueOf(i13).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f20367e.setDataPosition(this.f20372j);
            int i14 = this.f20367e.readInt();
            this.f20373k = this.f20367e.readInt();
            this.f20372j += i14;
        }
    }

    @Override // p253r4.AbstractC6484a
    /* JADX INFO: renamed from: o */
    public int mo25714o() {
        return this.f20367e.readInt();
    }

    @Override // p253r4.AbstractC6484a
    /* JADX INFO: renamed from: q */
    public Parcelable mo25716q() {
        return this.f20367e.readParcelable(getClass().getClassLoader());
    }

    @Override // p253r4.AbstractC6484a
    /* JADX INFO: renamed from: s */
    public String mo25718s() {
        return this.f20367e.readString();
    }

    @Override // p253r4.AbstractC6484a
    /* JADX INFO: renamed from: w */
    public void mo25722w(int i10) {
        mo25700a();
        this.f20371i = i10;
        this.f20366d.put(i10, this.f20367e.dataPosition());
        mo25690E(0);
        mo25690E(i10);
    }

    @Override // p253r4.AbstractC6484a
    /* JADX INFO: renamed from: y */
    public void mo25724y(boolean z10) {
        this.f20367e.writeInt(z10 ? 1 : 0);
    }

    public C6485b(Parcel parcel, int i10, int i11, String str, C3036a c3036a, C3036a c3036a2, C3036a c3036a3) {
        super(c3036a, c3036a2, c3036a3);
        this.f20366d = new SparseIntArray();
        this.f20371i = -1;
        this.f20373k = -1;
        this.f20367e = parcel;
        this.f20368f = i10;
        this.f20369g = i11;
        this.f20372j = i10;
        this.f20370h = str;
    }
}
