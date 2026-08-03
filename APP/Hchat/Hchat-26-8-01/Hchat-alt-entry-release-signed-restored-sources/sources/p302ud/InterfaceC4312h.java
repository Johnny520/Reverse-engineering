package p302ud;

import java.util.List;
import md.AbstractC2828e;
import md.C2825b;
import md.C2829f;
import md.EnumC2824a;
import p012ah.C0086a;
import p081fc.C1203f;
import p082fd.C1212i;

/* JADX INFO: renamed from: ud.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4312h extends InterfaceC4314j {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: ud.h */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p302ud.InterfaceC4314j
    /* JADX INFO: renamed from: b */
    default void mo8672b(C1212i c1212i, C1203f c1203f) {
        AbstractC2828e abstractC2828e = (AbstractC2828e) this;
        C2829f c2829f = abstractC2828e.f9217g;
        EnumC2824a enumC2824a = EnumC2824a.f9166s;
        if (c2829f.mo6235a(enumC2824a)) {
            return;
        }
        for (C4320p c4320p : mo8643g()) {
            if (!c4320p.f9217g.mo6235a(enumC2824a)) {
                c1212i.m3306j(c4320p, c1203f, null);
            }
        }
        if (abstractC2828e.f9217g.mo6237c(C2825b.f9210y) == null) {
            return;
        }
        C0086a.m445d();
    }

    /* JADX INFO: renamed from: g */
    List mo8643g();
}
