package p077f6;

import p024b9.AbstractC1061t;
import p038ce.InterfaceC1519a;

/* JADX INFO: renamed from: f6.q0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2331q0 {

    /* JADX INFO: renamed from: f6.q0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC2331q0 {

        /* JADX INFO: renamed from: a */
        public final Throwable f6379a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC2327o0 f6380b;

        public a(Throwable th, InterfaceC2327o0 interfaceC2327o0) {
            th.getClass();
            interfaceC2327o0.getClass();
            this.f6379a = th;
            this.f6380b = interfaceC2327o0;
        }

        @Override // p077f6.InterfaceC2331q0
        /* JADX INFO: renamed from: a */
        public InterfaceC2327o0 mo8499a() {
            return this.f6380b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC1061t.m3842c(this.f6379a, aVar.f6379a) && AbstractC1061t.m3842c(this.f6380b, aVar.f6380b);
        }

        public int hashCode() {
            return (this.f6379a.hashCode() * 31) + this.f6380b.hashCode();
        }

        public String toString() {
            return "Error(result=" + this.f6379a + ", referenceLinkHandler=" + this.f6380b + ")";
        }
    }

    /* JADX INFO: renamed from: f6.q0$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements InterfaceC2331q0 {

        /* JADX INFO: renamed from: a */
        public final InterfaceC2327o0 f6381a;

        public b(InterfaceC2327o0 interfaceC2327o0) {
            interfaceC2327o0.getClass();
            this.f6381a = interfaceC2327o0;
        }

        @Override // p077f6.InterfaceC2331q0
        /* JADX INFO: renamed from: a */
        public InterfaceC2327o0 mo8499a() {
            return this.f6381a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC1061t.m3842c(this.f6381a, ((b) obj).f6381a);
        }

        public int hashCode() {
            return this.f6381a.hashCode();
        }

        public String toString() {
            return "Loading(referenceLinkHandler=" + this.f6381a + ")";
        }
    }

    /* JADX INFO: renamed from: f6.q0$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c implements InterfaceC2331q0 {

        /* JADX INFO: renamed from: a */
        public final InterfaceC1519a f6382a;

        /* JADX INFO: renamed from: b */
        public final String f6383b;

        /* JADX INFO: renamed from: c */
        public final boolean f6384c;

        /* JADX INFO: renamed from: d */
        public final InterfaceC2327o0 f6385d;

        public c(InterfaceC1519a interfaceC1519a, String str, boolean z10, InterfaceC2327o0 interfaceC2327o0) {
            interfaceC1519a.getClass();
            str.getClass();
            interfaceC2327o0.getClass();
            this.f6382a = interfaceC1519a;
            this.f6383b = str;
            this.f6384c = z10;
            this.f6385d = interfaceC2327o0;
        }

        @Override // p077f6.InterfaceC2331q0
        /* JADX INFO: renamed from: a */
        public InterfaceC2327o0 mo8499a() {
            return this.f6385d;
        }

        /* JADX INFO: renamed from: b */
        public final String m8500b() {
            return this.f6383b;
        }

        /* JADX INFO: renamed from: c */
        public final InterfaceC1519a m8501c() {
            return this.f6382a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC1061t.m3842c(this.f6382a, cVar.f6382a) && AbstractC1061t.m3842c(this.f6383b, cVar.f6383b) && this.f6384c == cVar.f6384c && AbstractC1061t.m3842c(this.f6385d, cVar.f6385d);
        }

        public int hashCode() {
            return (((((this.f6382a.hashCode() * 31) + this.f6383b.hashCode()) * 31) + Boolean.hashCode(this.f6384c)) * 31) + this.f6385d.hashCode();
        }

        public String toString() {
            return "Success(node=" + this.f6382a + ", content=" + this.f6383b + ", linksLookedUp=" + this.f6384c + ", referenceLinkHandler=" + this.f6385d + ")";
        }
    }

    /* JADX INFO: renamed from: a */
    InterfaceC2327o0 mo8499a();
}
