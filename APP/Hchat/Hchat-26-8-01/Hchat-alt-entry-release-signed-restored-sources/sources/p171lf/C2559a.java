package p171lf;

import ac.C0058k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: lf.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2559a {

    /* JADX INFO: renamed from: a */
    public final C0058k f8295a;

    /* JADX INFO: renamed from: b */
    public final C0058k f8296b;

    /* JADX INFO: renamed from: c */
    public final C2560b[] f8297c;

    /* JADX INFO: renamed from: d */
    public final int f8298d;

    /* JADX INFO: renamed from: e */
    public ArrayList f8299e;

    /* JADX INFO: renamed from: f */
    public HashMap f8300f;

    /* JADX INFO: renamed from: g */
    public List f8301g;

    /* JADX INFO: renamed from: h */
    public int[] f8302h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2559a(C0058k c0058k, int i9, int i10) {
        this.f8295a = c0058k;
        this.f8296b = c0058k.m356g();
        this.f8297c = new C2560b[i9];
        this.f8298d = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m6016a(C2560b c2560b, int i9) {
        if (c2560b.f8307e) {
            return;
        }
        c2560b.f8307e = true;
        c2560b.f8309g = i9;
        this.f8299e.add(c2560b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m6017b(C2560b c2560b, int i9) {
        int i10 = c2560b.f8303a;
        C2560b[] c2560bArr = this.f8297c;
        C2560b c2560b2 = c2560bArr[i10];
        if (c2560b2 != null) {
            m6016a(c2560b2, i9);
        }
        c2560b.f8307e = false;
        c2560b.f8308f = i9;
        c2560bArr[i10] = c2560b;
    }
}
