package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class rz0 {
    public final /* synthetic */ int a;
    public final gu0 b;
    public final gu0 c;
    public final gu0 d;
    public final gu0 e;
    public final Serializable f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: rz0[] */
    /* JADX WARN: Multi-variable type inference failed */
    public rz0(rz0[] rz0VarArr) {
        int i = 0;
        this.a = 0;
        this.f = rz0VarArr;
        int length = rz0VarArr.length;
        gu0[] gu0VarArr = new gu0[length];
        for (int i2 = 0; i2 < length; i2++) {
            gu0VarArr[i2] = ((rz0[]) this.f)[i2].b();
        }
        int i3 = 1;
        this.b = new gu0(1, new la3(gu0VarArr, i));
        int length2 = ((rz0[]) this.f).length;
        gu0[] gu0VarArr2 = new gu0[length2];
        for (int i4 = 0; i4 < length2; i4++) {
            gu0VarArr2[i4] = ((rz0[]) this.f)[i4].d();
        }
        this.c = new gu0(0, new fu0(gu0VarArr2, i));
        int length3 = ((rz0[]) this.f).length;
        gu0[] gu0VarArr3 = new gu0[length3];
        for (int i5 = 0; i5 < length3; i5++) {
            gu0VarArr3[i5] = ((rz0[]) this.f)[i5].c();
        }
        this.d = new gu0(1, new la3(gu0VarArr3, i3));
        int length4 = ((rz0[]) this.f).length;
        gu0[] gu0VarArr4 = new gu0[length4];
        for (int i6 = 0; i6 < length4; i6++) {
            gu0VarArr4[i6] = ((rz0[]) this.f)[i6].a();
        }
        this.e = new gu0(0, new fu0(gu0VarArr4, i3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final gu0 a() {
        int i = this.a;
        return this.e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final gu0 b() {
        int i = this.a;
        return this.b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final gu0 c() {
        int i = this.a;
        return this.d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final gu0 d() {
        int i = this.a;
        return this.c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        int i = this.a;
        Object obj = this.f;
        switch (i) {
            case 0:
                return mg.p0((rz0[]) obj, null, null, 57);
            default:
                return "RectRulers(" + ((String) obj) + ')';
        }
    }

    public rz0(String str) {
        this.a = 1;
        this.f = str;
        this.b = new gu0(1, null);
        this.c = new gu0(0, null);
        this.d = new gu0(1, null);
        this.e = new gu0(0, null);
    }
}
