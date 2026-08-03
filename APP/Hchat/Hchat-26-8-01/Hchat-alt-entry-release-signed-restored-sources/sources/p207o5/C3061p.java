package p207o5;

import java.util.Iterator;
import java.util.Set;
import p122i5.AbstractC1988c;
import p150k5.C2245b;
import p150k5.C2247c;
import p228p5.C3323b;
import p271s5.InterfaceC3929a;
import p312v5.InterfaceC4480c;
import p327w5.InterfaceC4686a;

/* JADX INFO: renamed from: o5.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3061p extends AbstractC1988c implements InterfaceC4480c, InterfaceC3929a {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Set f9896j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ String f9897k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ String f9898l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3061p(String str, String str2, Set set) {
        this.f9896j = set;
        this.f9897k = str;
        this.f9898l = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (r0 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        r1 = new java.lang.StringBuilder();
        r0 = r0.m7043a().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
    
        if (r0.hasNext() == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        r3 = (p327w5.InterfaceC4686a) r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007a, code lost:
    
        if (r3.mo863h() == 23) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
    
        r1.append(((p228p5.C3329h) r3).m7049a());
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
    
        return r1.toString();
     */
    @Override // p271s5.InterfaceC3929a
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String mo5873e() {
        C2245b c2245b;
        C3323b c3323b;
        Iterator it = this.f9896j.iterator();
        while (true) {
            if (!it.hasNext()) {
                c2245b = null;
                break;
            }
            c2245b = (C2245b) it.next();
            if (c2245b.getType().equals("Ldalvik/annotation/Signature;")) {
                break;
            }
        }
        if (c2245b != null) {
            Iterator it2 = c2245b.m5493a().iterator();
            while (true) {
                C3052g c3052g = (C3052g) it2;
                if (!c3052g.hasNext()) {
                    c3323b = null;
                    break;
                }
                C2247c c2247c = (C2247c) c3052g.next();
                if (c2247c.m5494a().equals("value")) {
                    InterfaceC4686a interfaceC4686aM5495b = c2247c.m5495b();
                    if (interfaceC4686aM5495b.mo863h() == 28) {
                        c3323b = (C3323b) interfaceC4686aM5495b;
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p271s5.InterfaceC3929a
    public final String getName() {
        return this.f9897k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p312v5.InterfaceC4480c
    public final String getType() {
        return this.f9898l;
    }
}
