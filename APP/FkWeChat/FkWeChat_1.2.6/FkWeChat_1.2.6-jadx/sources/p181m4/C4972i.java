package p181m4;

import android.os.Bundle;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1043k;
import p172l8.C4700i0;
import p181m4.C4972i;
import p207o4.C5635b;

/* JADX INFO: renamed from: m4.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4972i {

    /* JADX INFO: renamed from: c */
    public static final a f15109c = new a(null);

    /* JADX INFO: renamed from: a */
    public final C5635b f15110a;

    /* JADX INFO: renamed from: b */
    public final C4970g f15111b;

    public C4972i(C5635b c5635b) {
        this.f15110a = c5635b;
        this.f15111b = new C4970g(c5635b);
    }

    /* JADX INFO: renamed from: a */
    public static final C4972i m20072a(InterfaceC4973j interfaceC4973j) {
        return f15109c.m20078b(interfaceC4973j);
    }

    /* JADX INFO: renamed from: b */
    public final C4970g m20073b() {
        return this.f15111b;
    }

    /* JADX INFO: renamed from: c */
    public final void m20074c() {
        this.f15110a.m22815f();
    }

    /* JADX INFO: renamed from: d */
    public final void m20075d(Bundle bundle) {
        this.f15110a.m22816g(bundle);
    }

    /* JADX INFO: renamed from: e */
    public final void m20076e(Bundle bundle) {
        bundle.getClass();
        this.f15110a.m22817h(bundle);
    }

    /* JADX INFO: renamed from: m4.i$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static C4700i0 m20077a(InterfaceC4973j interfaceC4973j) {
            interfaceC4973j.getLifecycle().mo2628a(new C4966c(interfaceC4973j));
            return C4700i0.f13910a;
        }

        /* JADX INFO: renamed from: b */
        public final C4972i m20078b(final InterfaceC4973j interfaceC4973j) {
            interfaceC4973j.getClass();
            return new C4972i(new C5635b(interfaceC4973j, new InterfaceC0173a() { // from class: m4.h
                @Override // p010a9.InterfaceC0173a
                public final Object invoke() {
                    return C4972i.a.m20077a(interfaceC4973j);
                }
            }), null);
        }

        public a() {
        }
    }

    public /* synthetic */ C4972i(C5635b c5635b, AbstractC1043k abstractC1043k) {
        this(c5635b);
    }
}
