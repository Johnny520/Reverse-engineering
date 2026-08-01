package io.ktor.utils.p131io;

import java.nio.charset.Charset;
import p064e8.AbstractC2053f;
import p215oc.C5708d;
import p215oc.InterfaceC5728w;
import p299ub.C8614c;

/* JADX INFO: renamed from: io.ktor.utils.io.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3458b {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC3468g m12903a(String str, Charset charset) {
        str.getClass();
        charset.getClass();
        return m12907e(AbstractC2053f.m7404c(str, charset), 0, 0, 6, null);
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC3468g m12904b(InterfaceC5728w interfaceC5728w) {
        interfaceC5728w.getClass();
        return new C3465e0(interfaceC5728w);
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC3468g m12905c(byte[] bArr, int i10, int i11) {
        bArr.getClass();
        C5708d c5708d = new C5708d();
        c5708d.write(bArr, i10, i11 + i10);
        return m12904b(c5708d);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ InterfaceC3468g m12906d(String str, Charset charset, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            charset = C8614c.f28652b;
        }
        return m12903a(str, charset);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ InterfaceC3468g m12907e(byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        return m12905c(bArr, i10, i11);
    }
}
