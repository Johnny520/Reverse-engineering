package p046d6;

import android.os.Looper;
import android.view.Choreographer;
import bsh.org.objectweb.asm.Opcodes;
import java.util.Random;
import p000a.AbstractC0000a;
import p077f8.AbstractC1089i;
import p136j8.C2104o;
import p295u4.C4264n;
import p357y1.C5911n0;

/* JADX INFO: renamed from: d6.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0716m extends ThreadLocal {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2153a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f2153a) {
            case 0:
                return new char[Opcodes.ACC_NATIVE];
            case 1:
                return new Random();
            case 2:
                return new C4264n();
            default:
                Choreographer choreographer = Choreographer.getInstance();
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper != null) {
                    C5911n0 c5911n0 = new C5911n0(choreographer, AbstractC0000a.m4C(looperMyLooper));
                    return AbstractC1089i.m2786q0(c5911n0, c5911n0.f23995r);
                }
                C2104o.m5276A("no Looper on this thread");
                return null;
        }
    }
}
