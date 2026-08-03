package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: No */
/* JADX INFO: loaded from: classes.dex */
public final class C0590No {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1024Xt f1914a;

    /* JADX INFO: renamed from: b */
    public final List f1915b;

    /* JADX INFO: renamed from: c */
    public final String f1916c;

    public C0590No(Class r1, Class r2, Class r3, List r4, InterfaceC1024Xt r5) {
        this.f1914a = r5;
        if (r4.isEmpty() == true) goto L7;
        this.f1915b = r4;
        this.f1916c = "Failed LoadPath{" + r1.getSimpleName() + "->" + r2.getSimpleName() + "->" + r3.getSimpleName() + "}";
        return;
    L7:
        throw new IllegalArgumentException("Must not be empty.");
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC2389pw m1162a(int r14, int r15, C0307H5 r16, InterfaceC2713xc r17, C2644vt r18) {
        InterfaceC1024Xt r1 = this.f1914a;
        List r2 = (List) r1.mo1935c();
        AbstractC0714Qj.m1488j("Argument must not be null", r2);
        List r3 = this.f1915b;     // Catch: Throwable -> L19
        int r4 = r3.size();     // Catch: Throwable -> L19
        int r6 = 0;
        InterfaceC2389pw r5 = null;
    L4:
        if (r6 >= r4) goto L14;
        r5 = ((C0363Ic) r3.get(r6)).m804a(r14, r15, r16, r17, r18);     // Catch: C0842Tj -> L9 Throwable -> L19
    L11:
        if (r5 != null) goto L14;
        r6 = r6 + 1;
        goto L4
    L9:
        e = move-exception;
        r2.add(e);     // Catch: Throwable -> L19
    L14:
        if (r5 == null) goto L18;
        r1.mo1934a(r2);
        return r5;
    L18:
        throw new C0842Tj(this.f1916c, new ArrayList(r2));     // Catch: Throwable -> L19
    L19:
        th = move-exception;
        r1.mo1934a(r2);
        throw th;
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f1915b.toArray()) + '}';
    }
}
