package p255r4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;
import okio.C3193a;
import p311v4.C4453d0;
import p326w4.C4682b;
import p326w4.C4683c;
import p326w4.InterfaceC4685e;

/* JADX INFO: renamed from: r4.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3671g extends AbstractC3700u0 {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f11925f;

    /* JADX INFO: renamed from: g */
    public final TreeMap f11926g;

    /* JADX INFO: renamed from: h */
    public Object f11927h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3671g(C3689p c3689p, int i9) {
        super("call_site_ids", c3689p, 4);
        this.f11925f = i9;
        switch (i9) {
            case 1:
                super("class_defs", c3689p, 4);
                this.f11926g = new TreeMap();
                this.f11927h = null;
                break;
            default:
                this.f11926g = new TreeMap();
                this.f11927h = new TreeMap();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3688o0
    /* JADX INFO: renamed from: c */
    public final Collection mo7652c() {
        switch (this.f11925f) {
            case 0:
                break;
            default:
                ArrayList arrayList = (ArrayList) this.f11927h;
                if (arrayList == null) {
                    break;
                }
                break;
        }
        return this.f11926g.values();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3700u0
    /* JADX INFO: renamed from: k */
    public final void mo7651k() {
        switch (this.f11925f) {
            case 0:
                Iterator it = this.f11926g.values().iterator();
                int i9 = 0;
                while (it.hasNext()) {
                    ((C3669f) it.next()).m7711g(i9);
                    i9++;
                }
                break;
            default:
                TreeMap treeMap = this.f11926g;
                int size = treeMap.size();
                this.f11927h = new ArrayList(size);
                Iterator it2 = treeMap.keySet().iterator();
                int iM7653l = 0;
                while (it2.hasNext()) {
                    iM7653l = m7653l(iM7653l, size - iM7653l, (C4683c) it2.next());
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public int m7653l(int i9, int i10, C4683c c4683c) {
        C3679k c3679k = (C3679k) this.f11926g.get(c4683c);
        if (c3679k == null || c3679k.f12039g >= 0) {
            return i9;
        }
        if (i10 < 0) {
            C3193a.m6825o(c4683c, "class circularity with ");
            return 0;
        }
        int i11 = i10 - 1;
        C4453d0 c4453d0 = c3679k.f11949j;
        if (c4453d0 != null) {
            i9 = m7653l(i9, i11, c4453d0.f14784g);
        }
        C3698t0 c3698t0 = c3679k.f11950k;
        InterfaceC4685e interfaceC4685e = c3698t0 == null ? C4682b.f15591i : c3698t0.f12032k;
        int size = interfaceC4685e.size();
        for (int i12 = 0; i12 < size; i12++) {
            i9 = m7653l(i9, i11, interfaceC4685e.getType(i12));
        }
        c3679k.m7711g(i9);
        ((ArrayList) this.f11927h).add(c3679k);
        return i9 + 1;
    }
}
