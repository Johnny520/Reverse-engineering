package p265s;

import java.util.Arrays;
import java.util.List;
import p071f1.InterfaceC1037z;
import p116i.C1746e0;
import p249qg.InterfaceC3599t;
import p251r.C3632q;
import p293u2.C4231a;
import p308v1.AbstractC4377b1;

/* JADX INFO: renamed from: s.x */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3865x {

    /* JADX INFO: renamed from: b */
    public C4231a f12666b;

    /* JADX INFO: renamed from: c */
    public int f12667c;

    /* JADX INFO: renamed from: d */
    public int f12668d;

    /* JADX INFO: renamed from: f */
    public int f12670f;

    /* JADX INFO: renamed from: g */
    public int f12671g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C3869z f12672h;

    /* JADX INFO: renamed from: a */
    public C3857t[] f12665a = AbstractC3847o.f12588a;

    /* JADX INFO: renamed from: e */
    public int f12669e = 1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3865x(C3869z c3869z) {
        this.f12672h = c3869z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m8034b(C3865x c3865x, C3632q c3632q, InterfaceC3599t interfaceC3599t, InterfaceC1037z interfaceC1037z, int i9, int i10) {
        c3865x.f12672h.getClass();
        long jM7614b = c3632q.m7614b(0);
        c3865x.m8035a(c3632q, interfaceC3599t, interfaceC1037z, i9, i10, (int) (!c3632q.f11755c ? jM7614b & 4294967295L : jM7614b >> 32));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m8035a(C3632q c3632q, InterfaceC3599t interfaceC3599t, InterfaceC1037z interfaceC1037z, int i9, int i10, int i11) {
        C3857t[] c3857tArr;
        List list = c3632q.f11754b;
        C3857t[] c3857tArr2 = this.f12665a;
        int length = c3857tArr2.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                this.f12670f = i9;
                this.f12671g = i10;
                break;
            } else {
                C3857t c3857t = c3857tArr2[i12];
                if (c3857t != null && c3857t.f12636e) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        int size = list.size();
        int length2 = this.f12665a.length;
        while (true) {
            c3857tArr = this.f12665a;
            if (size >= length2) {
                break;
            }
            C3857t c3857t2 = c3857tArr[size];
            if (c3857t2 != null) {
                c3857t2.m8030c();
            }
            size++;
        }
        if (c3857tArr.length != list.size()) {
            this.f12665a = (C3857t[]) Arrays.copyOf(this.f12665a, list.size());
        }
        this.f12666b = new C4231a(c3632q.f11766n);
        this.f12667c = i11;
        this.f12668d = 0;
        this.f12669e = 1;
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            Object objMo8824X = ((AbstractC4377b1) list.get(i13)).mo8824X();
            C3841l c3841l = objMo8824X instanceof C3841l ? (C3841l) objMo8824X : null;
            C3857t[] c3857tArr3 = this.f12665a;
            if (c3841l == null) {
                C3857t c3857t3 = c3857tArr3[i13];
                if (c3857t3 != null) {
                    c3857t3.m8030c();
                }
                this.f12665a[i13] = null;
            } else {
                C3857t c3857t4 = c3857tArr3[i13];
                if (c3857t4 == null) {
                    c3857t4 = new C3857t(interfaceC3599t, interfaceC1037z, new C1746e0(this.f12672h, 17));
                    this.f12665a[i13] = c3857t4;
                }
                c3857t4.f12635d = c3841l.f12575u;
            }
        }
    }
}
