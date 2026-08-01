package p047I0;

import android.os.Bundle;
import p011B4.AbstractC0231b;
import p121Y1.C1753n;
import p234s1.C3175g;

/* JADX INFO: renamed from: I0.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0774z extends C1753n {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ViewOnAttachStateChangeListenerC0667E f2515f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0774z(ViewOnAttachStateChangeListenerC0667E viewOnAttachStateChangeListenerC0667E) {
        super(25);
        this.f2515f = viewOnAttachStateChangeListenerC0667E;
    }

    @Override // p121Y1.C1753n
    /* JADX INFO: renamed from: A */
    public final C3175g mo1321A(int i5) {
        ViewOnAttachStateChangeListenerC0667E viewOnAttachStateChangeListenerC0667E = this.f2515f;
        if (i5 != 1) {
            if (i5 == 2) {
                return mo1324z(viewOnAttachStateChangeListenerC0667E.f2136o);
            }
            throw new IllegalArgumentException(AbstractC0231b.m398i("Unknown focus type: ", i5));
        }
        int i6 = viewOnAttachStateChangeListenerC0667E.f2137p;
        if (i6 == Integer.MIN_VALUE) {
            return null;
        }
        return mo1324z(i6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:610:0x01a9, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:152:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x06ec  */
    @Override // p121Y1.C1753n
    /* JADX INFO: renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo1322H(int r21, int r22, android.os.Bundle r23) {
        /*
            Method dump skipped, instruction units count: 2198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p047I0.C0774z.mo1322H(int, int, android.os.Bundle):boolean");
    }

    @Override // p121Y1.C1753n
    /* JADX INFO: renamed from: y */
    public final void mo1323y(int i5, C3175g c3175g, String str, Bundle bundle) {
        this.f2515f.m1145c(i5, c3175g, str, bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x06ec  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x06fe  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0783  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0786  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x080c A[LOOP:9: B:396:0x07ef->B:407:0x080c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:418:0x082d  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0832  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0854  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x086c  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0879  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x08a1  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0954  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x09a3  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x09a6  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x09ba  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0a39  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x0a3c  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x0a50  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x0a96  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x0aa9  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x0aad  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x0abc  */
    /* JADX WARN: Removed duplicated region for block: B:594:0x0bfc  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x0c00  */
    /* JADX WARN: Removed duplicated region for block: B:598:0x0c0d  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x0c29  */
    /* JADX WARN: Removed duplicated region for block: B:611:0x0c55  */
    /* JADX WARN: Removed duplicated region for block: B:653:0x0812 A[EDGE_INSN: B:653:0x0812->B:409:0x0812 BREAK  A[LOOP:9: B:396:0x07ef->B:407:0x080c], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v61, types: [L2.u] */
    /* JADX WARN: Type inference failed for: r2v62, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v63, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v66 */
    /* JADX WARN: Type inference failed for: r3v67, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v68 */
    /* JADX WARN: Type inference failed for: r3v69, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v75, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v76, types: [java.util.ArrayList] */
    @Override // p121Y1.C1753n
    /* JADX INFO: renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p234s1.C3175g mo1324z(int r47) {
        /*
            Method dump skipped, instruction units count: 3206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p047I0.C0774z.mo1324z(int):s1.g");
    }
}
