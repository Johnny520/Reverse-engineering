package p375z3;

import android.os.Parcel;
import android.util.SparseIntArray;
import okhttp3.HttpUrl;
import p068eh.AbstractC0921a;
import p069f.C0930e;

/* JADX INFO: renamed from: z3.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6085c extends AbstractC6084b {

    /* JADX INFO: renamed from: d */
    public final SparseIntArray f24581d;

    /* JADX INFO: renamed from: e */
    public final Parcel f24582e;

    /* JADX INFO: renamed from: f */
    public final int f24583f;

    /* JADX INFO: renamed from: g */
    public final int f24584g;

    /* JADX INFO: renamed from: h */
    public final String f24585h;

    /* JADX INFO: renamed from: i */
    public int f24586i;

    /* JADX INFO: renamed from: j */
    public int f24587j;

    /* JADX INFO: renamed from: k */
    public int f24588k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6085c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), HttpUrl.FRAGMENT_ENCODE_SET, new C0930e(), new C0930e(), new C0930e());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p375z3.AbstractC6084b
    /* JADX INFO: renamed from: a */
    public final C6085c mo10816a() {
        Parcel parcel = this.f24582e;
        int iDataPosition = parcel.dataPosition();
        int i9 = this.f24587j;
        if (i9 == this.f24583f) {
            i9 = this.f24584g;
        }
        return new C6085c(parcel, iDataPosition, i9, AbstractC0921a.m2255r(new StringBuilder(), this.f24585h, "  "), this.f24578a, this.f24579b, this.f24580c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p375z3.AbstractC6084b
    /* JADX INFO: renamed from: e */
    public final boolean mo10820e(int i9) {
        while (true) {
            int i10 = this.f24587j;
            int i11 = this.f24588k;
            if (i10 >= this.f24584g) {
                return i11 == i9;
            }
            if (i11 == i9) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i9)) > 0) {
                return false;
            }
            int i12 = this.f24587j;
            Parcel parcel = this.f24582e;
            parcel.setDataPosition(i12);
            int i13 = parcel.readInt();
            this.f24588k = parcel.readInt();
            this.f24587j += i13;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p375z3.AbstractC6084b
    /* JADX INFO: renamed from: h */
    public final void mo10823h(int i9) {
        int i10 = this.f24586i;
        SparseIntArray sparseIntArray = this.f24581d;
        Parcel parcel = this.f24582e;
        if (i10 >= 0) {
            int i11 = sparseIntArray.get(i10);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i11);
            parcel.writeInt(iDataPosition - i11);
            parcel.setDataPosition(iDataPosition);
        }
        this.f24586i = i9;
        sparseIntArray.put(i9, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i9);
    }

    public C6085c(Parcel parcel, int i9, int i10, String str, C0930e c0930e, C0930e c0930e2, C0930e c0930e3) {
        super(c0930e, c0930e2, c0930e3);
        this.f24581d = new SparseIntArray();
        this.f24586i = -1;
        this.f24588k = -1;
        this.f24582e = parcel;
        this.f24583f = i9;
        this.f24584g = i10;
        this.f24587j = i9;
        this.f24585h = str;
    }
}
