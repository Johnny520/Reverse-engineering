package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class rz0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9827a;

    /* JADX INFO: renamed from: b */
    public final gu0 f9828b;

    /* JADX INFO: renamed from: c */
    public final gu0 f9829c;

    /* JADX INFO: renamed from: d */
    public final gu0 f9830d;

    /* JADX INFO: renamed from: e */
    public final gu0 f9831e;

    /* JADX INFO: renamed from: f */
    public final Serializable f9832f;

    /* JADX WARN: Multi-variable type inference failed */
    public rz0(rz0[] rz0VarArr) {
        int i = 0;
        this.f9827a = 0;
        this.f9832f = rz0VarArr;
        int length = rz0VarArr.length;
        gu0[] gu0VarArr = new gu0[length];
        for (int i2 = 0; i2 < length; i2++) {
            gu0VarArr[i2] = ((rz0[]) this.f9832f)[i2].m4635b();
        }
        int i3 = 1;
        this.f9828b = new gu0(1, new la3(gu0VarArr, i));
        int length2 = ((rz0[]) this.f9832f).length;
        gu0[] gu0VarArr2 = new gu0[length2];
        for (int i4 = 0; i4 < length2; i4++) {
            gu0VarArr2[i4] = ((rz0[]) this.f9832f)[i4].m4637d();
        }
        this.f9829c = new gu0(0, new fu0(gu0VarArr2, i));
        int length3 = ((rz0[]) this.f9832f).length;
        gu0[] gu0VarArr3 = new gu0[length3];
        for (int i5 = 0; i5 < length3; i5++) {
            gu0VarArr3[i5] = ((rz0[]) this.f9832f)[i5].m4636c();
        }
        this.f9830d = new gu0(1, new la3(gu0VarArr3, i3));
        int length4 = ((rz0[]) this.f9832f).length;
        gu0[] gu0VarArr4 = new gu0[length4];
        for (int i6 = 0; i6 < length4; i6++) {
            gu0VarArr4[i6] = ((rz0[]) this.f9832f)[i6].m4634a();
        }
        this.f9831e = new gu0(0, new fu0(gu0VarArr4, i3));
    }

    /* JADX INFO: renamed from: a */
    public final gu0 m4634a() {
        int i = this.f9827a;
        return this.f9831e;
    }

    /* JADX INFO: renamed from: b */
    public final gu0 m4635b() {
        int i = this.f9827a;
        return this.f9828b;
    }

    /* JADX INFO: renamed from: c */
    public final gu0 m4636c() {
        int i = this.f9827a;
        return this.f9830d;
    }

    /* JADX INFO: renamed from: d */
    public final gu0 m4637d() {
        int i = this.f9827a;
        return this.f9829c;
    }

    public final String toString() {
        int i = this.f9827a;
        Object obj = this.f9832f;
        switch (i) {
            case 0:
                return AbstractC0460mg.m3101p0((rz0[]) obj, null, null, 57);
            default:
                return "RectRulers(" + ((String) obj) + ')';
        }
    }

    public rz0(String str) {
        this.f9827a = 1;
        this.f9832f = str;
        this.f9828b = new gu0(1, null);
        this.f9829c = new gu0(0, null);
        this.f9830d = new gu0(1, null);
        this.f9831e = new gu0(0, null);
    }
}
