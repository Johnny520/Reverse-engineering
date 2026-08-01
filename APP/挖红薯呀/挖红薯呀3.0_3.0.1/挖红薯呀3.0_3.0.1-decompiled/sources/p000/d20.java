package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class d20 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f944a;

    /* JADX INFO: renamed from: b */
    public final C0190ez f945b;

    /* JADX INFO: renamed from: c */
    public final C0190ez f946c;

    /* JADX INFO: renamed from: d */
    public final C0190ez f947d;

    /* JADX INFO: renamed from: e */
    public final C0190ez f948e;

    /* JADX INFO: renamed from: f */
    public final Serializable f949f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: d20[] */
    /* JADX WARN: Multi-variable type inference failed */
    public d20(d20[] d20VarArr) {
        int i = 0;
        this.f944a = 0;
        this.f949f = d20VarArr;
        int length = d20VarArr.length;
        C0190ez[] c0190ezArr = new C0190ez[length];
        for (int i2 = 0; i2 < length; i2++) {
            c0190ezArr[i2] = ((d20[]) this.f949f)[i2].m625b();
        }
        int i3 = 1;
        this.f945b = new C0190ez(1, new bc1(c0190ezArr, i));
        int length2 = ((d20[]) this.f949f).length;
        C0190ez[] c0190ezArr2 = new C0190ez[length2];
        for (int i4 = 0; i4 < length2; i4++) {
            c0190ezArr2[i4] = ((d20[]) this.f949f)[i4].m627d();
        }
        this.f946c = new C0190ez(0, new C0153dz(c0190ezArr2, i));
        int length3 = ((d20[]) this.f949f).length;
        C0190ez[] c0190ezArr3 = new C0190ez[length3];
        for (int i5 = 0; i5 < length3; i5++) {
            c0190ezArr3[i5] = ((d20[]) this.f949f)[i5].m626c();
        }
        this.f947d = new C0190ez(1, new bc1(c0190ezArr3, i3));
        int length4 = ((d20[]) this.f949f).length;
        C0190ez[] c0190ezArr4 = new C0190ez[length4];
        for (int i6 = 0; i6 < length4; i6++) {
            c0190ezArr4[i6] = ((d20[]) this.f949f)[i6].m624a();
        }
        this.f948e = new C0190ez(0, new C0153dz(c0190ezArr4, i3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C0190ez m624a() {
        int i = this.f944a;
        return this.f948e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final C0190ez m625b() {
        int i = this.f944a;
        return this.f945b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final C0190ez m626c() {
        int i = this.f944a;
        return this.f947d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final C0190ez m627d() {
        int i = this.f944a;
        return this.f946c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        int i = this.f944a;
        Object obj = this.f949f;
        switch (i) {
            case 0:
                return AbstractC0201f9.m1067m0((d20[]) obj, null, 57);
            default:
                return "RectRulers(" + ((String) obj) + ')';
        }
    }

    public d20(String str) {
        this.f944a = 1;
        this.f949f = str;
        this.f945b = new C0190ez(1, null);
        this.f946c = new C0190ez(0, null);
        this.f947d = new C0190ez(1, null);
        this.f948e = new C0190ez(0, null);
    }
}
