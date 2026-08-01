package p063e7;

import java.util.List;
import java.util.Set;
import p010a9.InterfaceC0188p;
import p281t6.InterfaceC8141d0;

/* JADX INFO: renamed from: e7.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2042i {

    /* JADX INFO: renamed from: e7.i$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC8141d0 {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC8141d0 f5714c;

        public a(InterfaceC8141d0 interfaceC8141d0) {
            this.f5714c = interfaceC8141d0;
        }

        @Override // p282t7.InterfaceC8197u
        /* JADX INFO: renamed from: a */
        public Set mo7356a() {
            return this.f5714c.mo7356a();
        }

        @Override // p282t7.InterfaceC8197u
        /* JADX INFO: renamed from: b */
        public boolean mo7357b() {
            return this.f5714c.mo7357b();
        }

        @Override // p282t7.InterfaceC8197u
        /* JADX INFO: renamed from: c */
        public void mo7358c(InterfaceC0188p interfaceC0188p) {
            InterfaceC8141d0.b.m31613a(this, interfaceC0188p);
        }

        @Override // p282t7.InterfaceC8197u
        /* JADX INFO: renamed from: d */
        public List mo7359d(String str) {
            str.getClass();
            return this.f5714c.mo7359d(str);
        }

        @Override // p282t7.InterfaceC8197u
        public boolean isEmpty() {
            return this.f5714c.isEmpty();
        }

        @Override // p282t7.InterfaceC8197u
        public Set names() {
            return this.f5714c.names();
        }
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC8141d0 m7355b(InterfaceC8141d0 interfaceC8141d0) {
        return new a(interfaceC8141d0);
    }
}
