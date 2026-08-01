package p072O0;

import p056K2.C0891q;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1178c;
import p096T0.AbstractC1407g;
import p096T0.C1410j;
import p127Z2.AbstractC1784a;

/* JADX INFO: renamed from: O0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1036g {

    /* JADX INFO: renamed from: a */
    public int f3228a;

    /* JADX INFO: renamed from: b */
    public float f3229b;

    /* JADX INFO: renamed from: c */
    public final Object f3230c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1036g(int i5, C1032c c1032c) {
        this.f3228a = i5;
        this.f3230c = c1032c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float m2111a(int i5, boolean z5, boolean z6, boolean z7) {
        boolean z8;
        C1410j c1410j = (C1410j) this.f3230c;
        int i6 = 1;
        if (z5) {
            int iM2701d = AbstractC1407g.m2701d(c1410j.f5044f, i5, z5);
            z8 = i5 == c1410j.f5044f.getLineStart(iM2701d) || i5 == c1410j.m2710f(iM2701d);
        }
        int i7 = i5 * 4;
        if (!z7) {
            i6 = z8 ? 2 : 3;
        } else if (z8) {
            i6 = 0;
        }
        int i8 = i7 + i6;
        if (this.f3228a == i8) {
            return this.f3229b;
        }
        float fM2712h = z7 ? c1410j.m2712h(i5, z5) : c1410j.m2713i(i5, z5);
        if (z6) {
            this.f3228a = i8;
            this.f3229b = fM2712h;
        }
        return fM2712h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m2112b(float f2, AbstractC1178c abstractC1178c) {
        C1035f c1035f;
        if (abstractC1178c instanceof C1035f) {
            c1035f = (C1035f) abstractC1178c;
            int i5 = c1035f.f3227i;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c1035f.f3227i = i5 - Integer.MIN_VALUE;
            } else {
                c1035f = new C1035f(this, abstractC1178c);
            }
        }
        Object objMo0g = c1035f.f3225g;
        int i6 = c1035f.f3227i;
        if (i6 == 0) {
            AbstractC1784a.m3205S(objMo0g);
            C1032c c1032c = (C1032c) this.f3230c;
            Float f5 = new Float(f2);
            c1035f.f3227i = 1;
            objMo0g = c1032c.mo0g(f5, c1035f);
            EnumC1152a enumC1152a = EnumC1152a.f3788d;
            if (objMo0g == enumC1152a) {
                return enumC1152a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1784a.m3205S(objMo0g);
        }
        this.f3229b += ((Number) objMo0g).floatValue();
        return C0891q.f2780a;
    }

    public C1036g(C1410j c1410j) {
        this.f3230c = c1410j;
        this.f3228a = -1;
    }
}
