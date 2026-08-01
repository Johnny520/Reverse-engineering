package p079f8;

import ec.C2122d1;
import io.ktor.utils.p131io.InterfaceC3468g;
import java.io.InputStream;
import p097g8.AbstractC2542a;
import p097g8.InterfaceC2546e;
import p215oc.AbstractC5715j;
import p228p8.InterfaceC5980j;

/* JADX INFO: renamed from: f8.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2353c {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC3468g m8546a(InputStream inputStream, InterfaceC5980j interfaceC5980j, InterfaceC2546e interfaceC2546e) {
        inputStream.getClass();
        interfaceC5980j.getClass();
        interfaceC2546e.getClass();
        return new C2352b(AbstractC5715j.m23132a(inputStream), interfaceC5980j);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC3468g m8547b(InputStream inputStream, InterfaceC5980j interfaceC5980j, InterfaceC2546e interfaceC2546e, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC5980j = C2122d1.m7727b();
        }
        if ((i10 & 2) != 0) {
            interfaceC2546e = AbstractC2542a.m9060a();
        }
        return m8546a(inputStream, interfaceC5980j, interfaceC2546e);
    }
}
