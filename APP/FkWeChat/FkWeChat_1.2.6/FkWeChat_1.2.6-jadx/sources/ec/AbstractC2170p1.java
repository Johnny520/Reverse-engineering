package ec;

import ec.AbstractC2170p1;
import java.io.Closeable;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p228p8.AbstractC5972b;
import p228p8.InterfaceC5980j;

/* JADX INFO: renamed from: ec.p1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2170p1 extends AbstractC2149k0 implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: s */
    public static final a f5997s = new a(null);

    /* JADX INFO: renamed from: ec.p1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC5972b {
        public a() {
            super(AbstractC2149k0.f5980r, new InterfaceC0184l() { // from class: ec.o1
                @Override // p010a9.InterfaceC0184l
                /* JADX INFO: renamed from: m */
                public final Object mo27m(Object obj) {
                    return AbstractC2170p1.a.m7886c((InterfaceC5980j.b) obj);
                }
            });
        }

        /* JADX INFO: renamed from: c */
        public static AbstractC2170p1 m7886c(InterfaceC5980j.b bVar) {
            if (bVar instanceof AbstractC2170p1) {
                return (AbstractC2170p1) bVar;
            }
            return null;
        }

        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }
    }
}
