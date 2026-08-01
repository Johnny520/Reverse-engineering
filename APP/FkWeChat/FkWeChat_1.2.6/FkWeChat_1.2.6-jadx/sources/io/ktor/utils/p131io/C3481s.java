package io.ktor.utils.p131io;

import ec.AbstractC2162n1;
import ec.InterfaceC2125e0;
import java.util.concurrent.CancellationException;
import p010a9.InterfaceC0184l;
import p024b9.C1055q;
import p172l8.C4700i0;

/* JADX INFO: renamed from: io.ktor.utils.io.s */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3481s {

    /* JADX INFO: renamed from: a */
    public final Throwable f9683a;

    /* JADX INFO: renamed from: io.ktor.utils.io.s$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class a extends C1055q implements InterfaceC0184l {

        /* JADX INFO: renamed from: y */
        public static final a f9684y = new a();

        public a() {
            super(1, C3483u.class, "<init>", "<init>(Ljava/lang/Throwable;)V", 0);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final C3483u mo27m(Throwable th) {
            return new C3483u(th);
        }
    }

    public C3481s(Throwable th) {
        this.f9683a = th;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Throwable m12994c(C3481s c3481s, InterfaceC0184l interfaceC0184l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC0184l = a.f9684y;
        }
        return c3481s.m12996b(interfaceC0184l);
    }

    /* JADX INFO: renamed from: a */
    public final C4700i0 m12995a(InterfaceC0184l interfaceC0184l) throws Throwable {
        interfaceC0184l.getClass();
        Throwable thM12996b = m12996b(interfaceC0184l);
        if (thM12996b == null) {
            return null;
        }
        throw thM12996b;
    }

    /* JADX INFO: renamed from: b */
    public final Throwable m12996b(InterfaceC0184l interfaceC0184l) {
        interfaceC0184l.getClass();
        Object obj = this.f9683a;
        if (obj == null) {
            return null;
        }
        return obj instanceof InterfaceC2125e0 ? ((InterfaceC2125e0) obj).mo5383a() : obj instanceof CancellationException ? AbstractC2162n1.m7845a(((CancellationException) obj).getMessage(), this.f9683a) : (Throwable) interfaceC0184l.mo27m(obj);
    }
}
