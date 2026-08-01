package p358y9;

import p081fa.InterfaceC2393u;
import p213oa.C5692c;
import p215oc.C5725t;

/* JADX INFO: renamed from: y9.t */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC9647t {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC2393u m37721a(InterfaceC9649u interfaceC9649u, C5692c c5692c, boolean z10, int i10, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: findPackage");
            return null;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return interfaceC9649u.mo32983c(c5692c, z10);
    }
}
