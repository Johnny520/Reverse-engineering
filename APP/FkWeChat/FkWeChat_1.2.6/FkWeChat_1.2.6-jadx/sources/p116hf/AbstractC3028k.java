package p116hf;

import java.io.Serializable;
import p086ff.AbstractC2438f;
import p086ff.InterfaceC2436d;

/* JADX INFO: renamed from: hf.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3028k implements InterfaceC2436d, Serializable {
    private static final long serialVersionUID = 7535258609338176893L;

    public abstract String getName();

    public Object readResolve() {
        return AbstractC2438f.m8840l(getName());
    }
}
