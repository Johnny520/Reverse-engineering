package sb;

import java.util.Iterator;
import p010a9.InterfaceC0188p;
import p242q8.AbstractC6324b;

/* JADX INFO: renamed from: sb.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7285k {

    /* JADX INFO: renamed from: sb.k$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC7282h {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0188p f24201a;

        public a(InterfaceC0188p interfaceC0188p) {
            this.f24201a = interfaceC0188p;
        }

        @Override // sb.InterfaceC7282h
        public Iterator iterator() {
            return AbstractC7285k.m28873a(this.f24201a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static Iterator m28873a(InterfaceC0188p interfaceC0188p) {
        interfaceC0188p.getClass();
        C7283i c7283i = new C7283i();
        c7283i.m28870C(AbstractC6324b.m24987b(interfaceC0188p, c7283i, c7283i));
        return c7283i;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC7282h m28874b(InterfaceC0188p interfaceC0188p) {
        interfaceC0188p.getClass();
        return new a(interfaceC0188p);
    }
}
