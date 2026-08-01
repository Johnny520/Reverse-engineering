package p004a3;

import androidx.compose.runtime.InterfaceC0564p5;
import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: a3.i0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0045i0 extends InterfaceC0564p5 {
    /* JADX INFO: renamed from: g */
    boolean mo159g();

    /* JADX INFO: renamed from: a3.i0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC0045i0 {

        /* JADX INFO: renamed from: q */
        public final Object f81q;

        /* JADX INFO: renamed from: r */
        public final boolean f82r;

        public /* synthetic */ a(Object obj, boolean z10, int i10, AbstractC1043k abstractC1043k) {
            this(obj, (i10 & 2) != 0 ? true : z10);
        }

        @Override // p004a3.InterfaceC0045i0
        /* JADX INFO: renamed from: g */
        public boolean mo159g() {
            return this.f82r;
        }

        @Override // androidx.compose.runtime.InterfaceC0564p5
        public Object getValue() {
            return this.f81q;
        }

        public a(Object obj, boolean z10) {
            this.f81q = obj;
            this.f82r = z10;
        }
    }
}
