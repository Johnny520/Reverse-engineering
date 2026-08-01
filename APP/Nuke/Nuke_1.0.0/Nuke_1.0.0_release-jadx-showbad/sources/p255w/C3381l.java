package p255w;

import java.util.List;
import p011B4.AbstractC0231b;
import p027E4.C0330q;
import p029F0.AbstractC0389a0;
import p029F0.AbstractC0391b0;
import p029F0.AbstractC0395d0;
import p029F0.C0393c0;
import p153e1.C2014j;
import p153e1.EnumC2017m;
import p169h0.C2197f;
import p238t.AbstractC3204b;
import p260x.C3436s;

/* JADX INFO: renamed from: w.l */
/* JADX INFO: loaded from: classes.dex */
public final class C3381l {

    /* JADX INFO: renamed from: a */
    public final int f10535a;

    /* JADX INFO: renamed from: b */
    public final List f10536b;

    /* JADX INFO: renamed from: c */
    public final C2197f f10537c;

    /* JADX INFO: renamed from: d */
    public final EnumC2017m f10538d;

    /* JADX INFO: renamed from: e */
    public final int f10539e;

    /* JADX INFO: renamed from: f */
    public final long f10540f;

    /* JADX INFO: renamed from: g */
    public final Object f10541g;

    /* JADX INFO: renamed from: h */
    public final Object f10542h;

    /* JADX INFO: renamed from: i */
    public final C3436s f10543i;

    /* JADX INFO: renamed from: j */
    public int f10544j;

    /* JADX INFO: renamed from: k */
    public final int f10545k;

    /* JADX INFO: renamed from: l */
    public final int f10546l;

    /* JADX INFO: renamed from: m */
    public final int f10547m;

    /* JADX INFO: renamed from: n */
    public boolean f10548n;

    /* JADX INFO: renamed from: o */
    public int f10549o = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: p */
    public final int[] f10550p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3381l(int i5, List list, C2197f c2197f, EnumC2017m enumC2017m, int i6, int i7, int i8, long j5, Object obj, Object obj2, C3436s c3436s, long j6) {
        this.f10535a = i5;
        this.f10536b = list;
        this.f10537c = c2197f;
        this.f10538d = enumC2017m;
        this.f10539e = i8;
        this.f10540f = j5;
        this.f10541g = obj;
        this.f10542h = obj2;
        this.f10543i = c3436s;
        int size = list.size();
        int i9 = 0;
        int iMax = 0;
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC0391b0 abstractC0391b0 = (AbstractC0391b0) list.get(i10);
            i9 += abstractC0391b0.f1207e;
            iMax = Math.max(iMax, abstractC0391b0.f1206d);
        }
        this.f10545k = i9;
        int i11 = i9 + this.f10539e;
        this.f10546l = i11 >= 0 ? i11 : 0;
        this.f10547m = iMax;
        this.f10550p = new int[this.f10536b.size() * 2];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final long m5616a(int i5) {
        int i6;
        long j5;
        if (i5 == 0 && this.f10536b.size() == 0) {
            i6 = this.f10544j;
            j5 = 0;
        } else {
            int i7 = i5 * 2;
            int[] iArr = this.f10550p;
            int i8 = iArr[i7];
            i6 = iArr[i7 + 1];
            j5 = i8;
        }
        return (4294967295L & ((long) i6)) | (j5 << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m5617b(AbstractC0389a0 abstractC0389a0) {
        C0393c0 c0393c0 = C0393c0.f1212f;
        if (this.f10549o == Integer.MIN_VALUE) {
            AbstractC3204b.m5475a("position() should be called first");
        }
        List list = this.f10536b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            AbstractC0391b0 abstractC0391b0 = (AbstractC0391b0) list.get(i5);
            int i6 = abstractC0391b0.f1207e;
            long jM5616a = m5616a(i5);
            AbstractC0231b.m408s(this.f10543i.f10726a.m4272g(this.f10541g));
            long jM3702c = C2014j.m3702c(jM5616a, this.f10540f);
            int i7 = AbstractC0395d0.f1218b;
            abstractC0389a0.getClass();
            AbstractC0389a0.m657a(abstractC0389a0, abstractC0391b0);
            abstractC0391b0.mo666i0(C2014j.m3702c(jM3702c, abstractC0391b0.f1210h), 0.0f, c0393c0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m5618c(int i5, int i6, int i7) {
        this.f10544j = i5;
        this.f10549o = i7;
        List list = this.f10536b;
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            AbstractC0391b0 abstractC0391b0 = (AbstractC0391b0) list.get(i8);
            int i9 = i8 * 2;
            C2197f c2197f = this.f10537c;
            if (c2197f == null) {
                AbstractC3204b.m5476b("null horizontalAlignment when isVertical == true");
                throw new C0330q();
            }
            int iM4018a = c2197f.m4018a(abstractC0391b0.f1206d, i6, this.f10538d);
            int[] iArr = this.f10550p;
            iArr[i9] = iM4018a;
            iArr[i9 + 1] = i5;
            i5 += abstractC0391b0.f1207e;
        }
    }
}
