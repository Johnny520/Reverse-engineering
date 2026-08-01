package p266y;

import com.bumptech.glide.AbstractC1923e;
import p000A.C0099z;
import p056K2.C0891q;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1178c;
import p105V.C1483e;
import p127Z2.AbstractC1784a;
import p204n0.C2684c;

/* JADX INFO: renamed from: y.c */
/* JADX INFO: loaded from: classes.dex */
public final class C3473c {

    /* JADX INFO: renamed from: a */
    public final C1483e f10788a = new C1483e(new C3475e[16]);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0063 -> B:19:0x0066). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5709a(C2684c c2684c, AbstractC1178c abstractC1178c) {
        C3472b c3472b;
        C2684c c2684c2;
        int i5;
        Object[] objArr;
        int i6;
        if (abstractC1178c instanceof C3472b) {
            c3472b = (C3472b) abstractC1178c;
            int i7 = c3472b.f10787m;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                c3472b.f10787m = i7 - Integer.MIN_VALUE;
            } else {
                c3472b = new C3472b(this, abstractC1178c);
            }
        }
        Object obj = c3472b.f10785k;
        int i8 = c3472b.f10787m;
        if (i8 == 0) {
            AbstractC1784a.m3205S(obj);
            C1483e c1483e = this.f10788a;
            Object[] objArr2 = c1483e.f5181d;
            int i9 = c1483e.f5183f;
            c2684c2 = c2684c;
            i5 = i9;
            objArr = objArr2;
            i6 = 0;
            if (i6 < i5) {
            }
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i5 = c3472b.f10784j;
            i6 = c3472b.f10783i;
            objArr = c3472b.f10782h;
            C2684c c2684c3 = c3472b.f10781g;
            AbstractC1784a.m3205S(obj);
            c2684c2 = c2684c3;
            i6++;
            if (i6 < i5) {
                C3475e c3475e = (C3475e) objArr[i6];
                C0099z c0099z = new C0099z(25, c2684c2);
                c3472b.f10781g = c2684c2;
                c3472b.f10782h = objArr;
                c3472b.f10783i = i6;
                c3472b.f10784j = i5;
                c3472b.f10787m = 1;
                Object objM3472j = AbstractC1923e.m3472j(c3475e, c0099z, c3472b);
                EnumC1152a enumC1152a = EnumC1152a.f3788d;
                if (objM3472j == enumC1152a) {
                    return enumC1152a;
                }
                i6++;
                if (i6 < i5) {
                    return C0891q.f2780a;
                }
            }
        }
    }
}
