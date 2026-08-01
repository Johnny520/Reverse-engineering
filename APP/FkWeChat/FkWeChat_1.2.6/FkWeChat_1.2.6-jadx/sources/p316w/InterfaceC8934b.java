package p316w;

import java.util.List;
import p121i3.InterfaceC3175e;
import p263s.AbstractC6635e;

/* JADX INFO: renamed from: w.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC8934b {

    /* JADX INFO: renamed from: w.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC8934b {

        /* JADX INFO: renamed from: a */
        public final int f29592a;

        public a(int i10) {
            this.f29592a = i10;
            if (i10 > 0) {
                return;
            }
            AbstractC6635e.m26318a("Provided count should be larger than zero");
        }

        @Override // p316w.InterfaceC8934b
        /* JADX INFO: renamed from: a */
        public List mo34305a(InterfaceC3175e interfaceC3175e, int i10, int i11) {
            return AbstractC8955i.m34385e(i10, this.f29592a, i11);
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && this.f29592a == ((a) obj).f29592a;
        }

        public int hashCode() {
            return -this.f29592a;
        }
    }

    /* JADX INFO: renamed from: a */
    List mo34305a(InterfaceC3175e interfaceC3175e, int i10, int i11);
}
