package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class m21 extends r21 {
    public final boolean j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m21(k21 k21Var) {
        super(true);
        boolean z = true;
        Q(k21Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = r21.i;
        ms msVar = (ms) atomicReferenceFieldUpdater.get(this);
        ns nsVar = msVar instanceof ns ? (ns) msVar : null;
        if (nsVar == null) {
            z = false;
            break;
        }
        r21 r21VarJ = nsVar.j();
        while (!r21VarJ.L()) {
            ms msVar2 = (ms) atomicReferenceFieldUpdater.get(r21VarJ);
            ns nsVar2 = msVar2 instanceof ns ? (ns) msVar2 : null;
            if (nsVar2 == null) {
                z = false;
                break;
            }
            r21VarJ = nsVar2.j();
        }
        this.j = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.r21
    public final boolean L() {
        return this.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.r21
    public final boolean M() {
        return true;
    }
}
