package p081fc;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import p025bc.C0257g;
import p025bc.InterfaceC0254d;
import p110hc.InterfaceC1704a;
import p110hc.InterfaceC1706c;
import p128ic.C2036a;
import p128ic.C2037b;
import p351xe.C5796q;

/* JADX INFO: renamed from: fc.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1199b extends C1203f {

    /* JADX INFO: renamed from: g */
    public int f4027g;

    /* JADX INFO: renamed from: h */
    public int f4028h;

    /* JADX INFO: renamed from: i */
    public Map f4029i;

    /* JADX INFO: renamed from: j */
    public Map f4030j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1199b(C0257g c0257g) {
        super(c0257g);
        this.f4027g = 1;
        Map map = Collections.EMPTY_MAP;
        this.f4029i = map;
        this.f4030j = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p081fc.C1203f
    /* JADX INFO: renamed from: a */
    public final C1203f mo3251a(char c10) {
        this.f4035a.append(c10);
        this.f4028h++;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p081fc.C1203f
    /* JADX INFO: renamed from: b */
    public final C1203f mo3252b(String str) {
        this.f4035a.append(str);
        this.f4028h = str.length() + this.f4028h;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p081fc.C1203f
    /* JADX INFO: renamed from: c */
    public final void mo3253c(C1199b c1199b) {
        this.f4027g--;
        int length = this.f4035a.length();
        for (Map.Entry entry : c1199b.f4029i.entrySet()) {
            m3265v((InterfaceC1704a) entry.getValue(), ((Integer) entry.getKey()).intValue() + length);
        }
        for (Map.Entry entry2 : c1199b.f4030j.entrySet()) {
            int iIntValue = ((Integer) entry2.getKey()).intValue() + this.f4027g;
            Integer num = (Integer) entry2.getValue();
            num.intValue();
            if (this.f4030j.isEmpty()) {
                this.f4030j = new TreeMap();
            }
            this.f4030j.put(Integer.valueOf(iIntValue), num);
        }
        this.f4027g += c1199b.f4027g;
        this.f4028h = c1199b.f4028h;
        this.f4035a.append((CharSequence) c1199b.f4035a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p081fc.C1203f
    /* JADX INFO: renamed from: d */
    public final C1203f mo3254d(char c10) {
        this.f4035a.append(c10);
        this.f4028h++;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p081fc.C1203f
    /* JADX INFO: renamed from: e */
    public final C1203f mo3255e(String str) {
        this.f4035a.append(str);
        this.f4028h = str.length() + this.f4028h;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p081fc.C1203f
    /* JADX INFO: renamed from: f */
    public final void mo3256f() {
        this.f4035a.append(this.f4039e);
        this.f4027g++;
        this.f4028h = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p081fc.C1203f
    /* JADX INFO: renamed from: g */
    public final void mo3257g() {
        this.f4035a.append(this.f4036b);
        this.f4028h = this.f4036b.length() + this.f4028h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p081fc.C1203f
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ C1203f mo3258h(String str) {
        m3264u(str);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p081fc.C1203f
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ C1203f mo3259i(String str) {
        m3264u(str);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p081fc.C1203f
    /* JADX INFO: renamed from: j */
    public final void mo3260j(InterfaceC1704a interfaceC1704a) {
        if (interfaceC1704a == null) {
            return;
        }
        m3265v(interfaceC1704a, this.f4035a.length());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p081fc.C1203f
    /* JADX INFO: renamed from: k */
    public final void mo3261k(InterfaceC1706c interfaceC1706c) {
        if (interfaceC1706c == null) {
            return;
        }
        mo3260j(new C2037b(interfaceC1706c));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p081fc.C1203f
    /* JADX INFO: renamed from: l */
    public final void mo3262l(C2036a c2036a) {
        m3265v(c2036a, this.f4035a.length() - this.f4028h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p081fc.C1203f
    /* JADX INFO: renamed from: m */
    public final void mo3263m(int i9) {
        if (i9 == 0) {
            return;
        }
        int i10 = this.f4027g;
        if (this.f4030j.isEmpty()) {
            this.f4030j = new TreeMap();
        }
        this.f4030j.put(Integer.valueOf(i10), Integer.valueOf(i9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public final void m3264u(String str) {
        int i9;
        String str2 = this.f4039e;
        boolean zContains = str.contains(str2);
        StringBuilder sb2 = this.f4035a;
        if (!zContains) {
            sb2.append(str);
            return;
        }
        sb2.append(str.replace(str2, str2 + this.f4036b));
        int i10 = this.f4027g;
        C5796q c5796q = C5796q.f23542b;
        if (!str.isEmpty() && str2 != null && !str2.isEmpty()) {
            int length = str2.length();
            int i11 = 0;
            i9 = 0;
            while (true) {
                int iIndexOf = str.indexOf(str2, i11);
                if (iIndexOf == -1) {
                    break;
                }
                i9++;
                i11 = iIndexOf + length;
            }
        } else {
            i9 = 0;
        }
        this.f4027g = i10 + i9;
        this.f4028h = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public final void m3265v(InterfaceC1704a interfaceC1704a, int i9) {
        if (this.f4029i.isEmpty()) {
            this.f4029i = new HashMap();
        }
        this.f4029i.put(Integer.valueOf(i9), interfaceC1704a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public final InterfaceC0254d m3266w() {
        String string = this.f4035a.toString();
        this.f4035a = null;
        return new C1198a(string, this.f4030j, this.f4029i);
    }
}
