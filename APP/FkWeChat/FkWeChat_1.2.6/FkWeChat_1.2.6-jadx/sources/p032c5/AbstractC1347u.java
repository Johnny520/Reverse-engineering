package p032c5;

import bsh.C1259t2;
import p094g5.InterfaceC2518a;

/* JADX INFO: renamed from: c5.u */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1347u implements InterfaceC2518a {

    /* JADX INFO: renamed from: a */
    public final String f3987a;

    public AbstractC1347u(String str) {
        if (str != null) {
            this.f3987a = str;
        } else {
            C1259t2.m5095a("name == null");
            throw null;
        }
    }

    @Override // p094g5.InterfaceC2518a
    public String getName() {
        return this.f3987a;
    }
}
