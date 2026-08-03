package p350xd;

import java.util.List;
import md.AbstractC2828e;
import mh.AbstractC2846d;
import mh.InterfaceC2844b;
import p302ud.InterfaceC4314j;
import p302ud.InterfaceC4318n;

/* JADX INFO: renamed from: xd.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5774a extends AbstractC2828e implements InterfaceC4318n {

    /* JADX INFO: renamed from: j */
    public static final InterfaceC2844b f23505j = AbstractC2846d.m6274b(AbstractC5774a.class);

    /* JADX INFO: renamed from: i */
    public InterfaceC4318n f23506i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC5774a(InterfaceC4318n interfaceC4318n) {
        this.f23506i = interfaceC4318n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public List mo8673i() {
        return mo8675u();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4318n
    /* JADX INFO: renamed from: l */
    public boolean mo8674l(InterfaceC4314j interfaceC4314j, InterfaceC4314j interfaceC4314j2) {
        f23505j.mo6254h(getClass(), "Replace sub block not supported for class \"{}\"");
        return false;
    }
}
