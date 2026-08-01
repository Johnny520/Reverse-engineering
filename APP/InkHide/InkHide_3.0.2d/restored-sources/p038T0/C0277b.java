package p038T0;

import java.util.HashSet;
import java.util.Iterator;
import p011F0.AbstractC0114b;
import p011F0.EnumC0136x;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: T0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0277b extends AbstractC0114b {

    /* JADX INFO: renamed from: c */
    public final Iterator f643c;

    /* JADX INFO: renamed from: d */
    public final C0286k f644d;

    /* JADX INFO: renamed from: e */
    public final HashSet f645e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0277b(Iterator it) {
        C0286k c0286k = C0286k.f657b;
        AbstractC0223g.m418e(it, "source");
        this.f643c = it;
        this.f644d = c0286k;
        this.f645e = new HashSet();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p011F0.AbstractC0114b
    /* JADX INFO: renamed from: a */
    public final void mo249a() {
        Object next;
        do {
            Iterator it = this.f643c;
            if (!it.hasNext()) {
                this.f410a = EnumC0136x.f431c;
                return;
            } else {
                next = it.next();
                this.f644d.getClass();
            }
        } while (!this.f645e.add(next));
        this.f411b = next;
        this.f410a = EnumC0136x.f429a;
    }
}
