package p220p4;

import java.util.Comparator;
import p049I2.AbstractC0797o;
import p254v4.C3368o;

/* JADX INFO: renamed from: p4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2892a implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9147a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [M3.b.a(org.luckypray.dexkit.DexKitBridge):void, q2.n.<clinit>():void] */
    public /* synthetic */ C2892a(int i5) {
        this.f9147a = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f9147a) {
            case 0:
                return AbstractC0797o.m1386k(((C3368o) obj).f10462g, ((C3368o) obj2).f10462g);
            default:
                return ((Comparable) obj).compareTo((Comparable) obj2);
        }
    }
}
