package p054dg;

import java.io.File;
import java.util.Iterator;
import ng.C3010h;
import ng.InterfaceC3012j;
import p036c9.C0499x;
import p085fg.InterfaceC1231l;

/* JADX INFO: renamed from: dg.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0791j implements InterfaceC3012j {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2371a = 0;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1231l f2372b;

    /* JADX INFO: renamed from: c */
    public final Object f2373c;

    /* JADX INFO: renamed from: d */
    public final Object f2374d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0791j(InterfaceC3012j interfaceC3012j, InterfaceC1231l interfaceC1231l, InterfaceC1231l interfaceC1231l2) {
        interfaceC3012j.getClass();
        interfaceC1231l.getClass();
        this.f2373c = interfaceC3012j;
        this.f2372b = interfaceC1231l;
        this.f2374d = interfaceC1231l2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // ng.InterfaceC3012j
    public final Iterator iterator() {
        switch (this.f2371a) {
            case 0:
                return new C0789h(this);
            default:
                return new C3010h(this);
        }
    }

    public C0791j(File file, EnumC0792k enumC0792k, C0499x c0499x) {
        this.f2373c = file;
        this.f2374d = enumC0792k;
        this.f2372b = c0499x;
    }
}
