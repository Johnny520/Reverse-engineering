package p277t2;

import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p080f9.AbstractC2367n;
import p080f9.InterfaceC2359f;
import p376zd.C9987e;

/* JADX INFO: renamed from: t2.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8077j {

    /* JADX INFO: renamed from: d */
    public static final a f26960d = new a(null);

    /* JADX INFO: renamed from: e */
    public static final C8077j f26961e = new C8077j(0.0f, AbstractC2367n.m8575b(0.0f, 0.0f), 0, 4, null);

    /* JADX INFO: renamed from: a */
    public final float f26962a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2359f f26963b;

    /* JADX INFO: renamed from: c */
    public final int f26964c;

    public C8077j(float f10, InterfaceC2359f interfaceC2359f, int i10) {
        this.f26962a = f10;
        this.f26963b = interfaceC2359f;
        this.f26964c = i10;
        if (Float.isNaN(f10)) {
            C9987e.m38645a("current must not be NaN");
            throw null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final float m31174b() {
        return this.f26962a;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC2359f m31175c() {
        return this.f26963b;
    }

    /* JADX INFO: renamed from: d */
    public final int m31176d() {
        return this.f26964c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8077j)) {
            return false;
        }
        C8077j c8077j = (C8077j) obj;
        return this.f26962a == c8077j.f26962a && AbstractC1061t.m3842c(this.f26963b, c8077j.f26963b) && this.f26964c == c8077j.f26964c;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f26962a) * 31) + this.f26963b.hashCode()) * 31) + this.f26964c;
    }

    public String toString() {
        return "ProgressBarRangeInfo(current=" + this.f26962a + ", range=" + this.f26963b + ", steps=" + this.f26964c + ')';
    }

    /* JADX INFO: renamed from: t2.j$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C8077j m31177a() {
            return C8077j.f26961e;
        }

        public a() {
        }
    }

    public /* synthetic */ C8077j(float f10, InterfaceC2359f interfaceC2359f, int i10, int i11, AbstractC1043k abstractC1043k) {
        this(f10, interfaceC2359f, (i11 & 4) != 0 ? 0 : i10);
    }
}
