package p176m1;

import bsh.org.objectweb.asm.Opcodes;
import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;
import p071f1.C1030t0;
import p071f1.C1034w;
import p292u1.AbstractC4229a;

/* JADX INFO: renamed from: m1.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2728e {

    /* JADX INFO: renamed from: a */
    public final String f8839a;

    /* JADX INFO: renamed from: b */
    public final float f8840b;

    /* JADX INFO: renamed from: c */
    public final float f8841c;

    /* JADX INFO: renamed from: d */
    public final float f8842d;

    /* JADX INFO: renamed from: e */
    public final float f8843e;

    /* JADX INFO: renamed from: f */
    public final long f8844f;

    /* JADX INFO: renamed from: g */
    public final int f8845g;

    /* JADX INFO: renamed from: h */
    public final boolean f8846h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f8847i;

    /* JADX INFO: renamed from: j */
    public final C2726d f8848j;

    /* JADX INFO: renamed from: k */
    public boolean f8849k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2728e(String str, float f3, float f10, float f11, float f12, long j3, int i9, boolean z9, int i10) {
        str = (i10 & 1) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str;
        long j4 = (i10 & 32) != 0 ? C1034w.f3263g : j3;
        int i11 = (i10 & 64) != 0 ? 5 : i9;
        boolean z10 = (i10 & 128) != 0 ? false : z9;
        this.f8839a = str;
        this.f8840b = f3;
        this.f8841c = f10;
        this.f8842d = f11;
        this.f8843e = f12;
        this.f8844f = j4;
        this.f8845g = i11;
        this.f8846h = z10;
        ArrayList arrayList = new ArrayList();
        this.f8847i = arrayList;
        C2726d c2726d = new C2726d(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.f8848j = c2726d;
        arrayList.add(c2726d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m6148a(C2728e c2728e, List list, C1030t0 c1030t0, int i9) {
        int i10;
        if ((i9 & 2) != 0) {
            int i11 = AbstractC2735h0.f8909a;
            i10 = 0;
        } else {
            i10 = 1;
        }
        if ((i9 & Opcodes.ACC_NATIVE) != 0) {
            int i12 = AbstractC2735h0.f8909a;
        }
        if ((i9 & Opcodes.ACC_INTERFACE) != 0) {
            int i13 = AbstractC2735h0.f8909a;
        }
        if (c2728e.f8849k) {
            AbstractC4229a.m8494b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ArrayList arrayList = c2728e.f8847i;
        ((C2726d) arrayList.get(arrayList.size() - 1)).f8836j.add(new C2741k0(HttpUrl.FRAGMENT_ENCODE_SET, list, i10, c1030t0, 1.0f, null, 1.0f, 0.0f, 0, 0, 4.0f, 0.0f, 1.0f, 0.0f));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final C2730f m6149b() {
        if (this.f8849k) {
            AbstractC4229a.m8494b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (true) {
            ArrayList arrayList = this.f8847i;
            if (arrayList.size() <= 1) {
                C2726d c2726d = this.f8848j;
                C2730f c2730f = new C2730f(this.f8839a, this.f8840b, this.f8841c, this.f8842d, this.f8843e, new C2733g0(c2726d.f8827a, c2726d.f8828b, c2726d.f8829c, c2726d.f8830d, c2726d.f8831e, c2726d.f8832f, c2726d.f8833g, c2726d.f8834h, c2726d.f8835i, c2726d.f8836j), this.f8844f, this.f8845g, this.f8846h);
                this.f8849k = true;
                return c2730f;
            }
            if (this.f8849k) {
                AbstractC4229a.m8494b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            C2726d c2726d2 = (C2726d) arrayList.remove(arrayList.size() - 1);
            ((C2726d) arrayList.get(arrayList.size() - 1)).f8836j.add(new C2733g0(c2726d2.f8827a, c2726d2.f8828b, c2726d2.f8829c, c2726d2.f8830d, c2726d2.f8831e, c2726d2.f8832f, c2726d2.f8833g, c2726d2.f8834h, c2726d2.f8835i, c2726d2.f8836j));
        }
    }
}
