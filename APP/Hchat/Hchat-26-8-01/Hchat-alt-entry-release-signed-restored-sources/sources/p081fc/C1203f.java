package p081fc;

import mh.AbstractC2846d;
import mh.InterfaceC2844b;
import okhttp3.HttpUrl;
import p025bc.C0257g;
import p110hc.InterfaceC1704a;
import p110hc.InterfaceC1706c;
import p128ic.C2036a;
import p351xe.AbstractC5798s;

/* JADX INFO: renamed from: fc.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C1203f {

    /* JADX INFO: renamed from: f */
    public static final InterfaceC2844b f4034f = AbstractC2846d.m6274b(C1203f.class);

    /* JADX INFO: renamed from: a */
    public StringBuilder f4035a;

    /* JADX INFO: renamed from: b */
    public String f4036b;

    /* JADX INFO: renamed from: c */
    public int f4037c;

    /* JADX INFO: renamed from: d */
    public final String f4038d;

    /* JADX INFO: renamed from: e */
    public final String f4039e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1203f(C0257g c0257g) {
        this.f4035a = new StringBuilder();
        this.f4036b = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f4037c = 0;
        c0257g.getClass();
        this.f4038d = c0257g.f721G;
        this.f4039e = c0257g.f720F;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public C1203f mo3251a(char c10) {
        this.f4035a.append(c10);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public C1203f mo3252b(String str) {
        this.f4035a.append(str);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public void mo3253c(C1199b c1199b) {
        this.f4035a.append(c1199b.f4035a.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public /* bridge */ C1203f mo3254d(char c10) {
        return mo3251a(c10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public /* bridge */ C1203f mo3255e(String str) {
        return mo3252b(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public void mo3256f() {
        this.f4035a.append(this.f4039e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public void mo3257g() {
        this.f4035a.append(this.f4036b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public C1203f mo3258h(String str) {
        String str2 = this.f4039e;
        boolean zContains = str.contains(str2);
        StringBuilder sb2 = this.f4035a;
        if (!zContains) {
            sb2.append(str);
            return this;
        }
        sb2.append(str.replace(str2, str2 + this.f4036b));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public /* bridge */ C1203f mo3259i(String str) {
        return mo3258h(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final void m3267n() {
        int i9 = this.f4037c - 1;
        this.f4037c = i9;
        if (i9 < 0) {
            f4034f.mo6268v("Indent < 0");
            this.f4037c = 0;
        }
        m3273t();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final void m3268o() {
        this.f4037c++;
        m3273t();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final void m3269p() {
        mo3256f();
        mo3257g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final void m3270q() {
        m3269p();
        mo3251a('}');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final void m3271r(String str) {
        m3269p();
        mo3252b(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final void m3272s(int i9) {
        if (i9 == 0) {
            m3269p();
        } else {
            m3269p();
            mo3263m(i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final void m3273t() {
        String string;
        int i9 = this.f4037c;
        String str = AbstractC5798s.f23545a;
        if (i9 < 1) {
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            String str2 = this.f4038d;
            if (i9 == 1) {
                string = str2;
            } else {
                StringBuilder sb2 = new StringBuilder(str2.length() * i9);
                for (int i10 = 0; i10 < i9; i10++) {
                    sb2.append(str2);
                }
                string = sb2.toString();
            }
        }
        this.f4036b = string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f4035a.toString();
    }

    public C1203f() {
        this.f4035a = new StringBuilder();
        this.f4036b = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f4037c = 0;
        this.f4038d = "    ";
        this.f4039e = C0257g.f714Z;
    }

    /* JADX INFO: renamed from: j */
    public void mo3260j(InterfaceC1704a interfaceC1704a) {
    }

    /* JADX INFO: renamed from: k */
    public void mo3261k(InterfaceC1706c interfaceC1706c) {
    }

    /* JADX INFO: renamed from: l */
    public void mo3262l(C2036a c2036a) {
    }

    /* JADX INFO: renamed from: m */
    public void mo3263m(int i9) {
    }
}
