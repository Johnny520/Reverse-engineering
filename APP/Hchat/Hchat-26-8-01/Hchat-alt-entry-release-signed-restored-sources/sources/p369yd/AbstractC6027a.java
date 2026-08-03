package p369yd;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p000a.AbstractC0000a;
import p302ud.C4305a;
import p302ud.C4320p;
import p350xd.AbstractC5774a;
import p350xd.C5775b;

/* JADX INFO: renamed from: yd.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6027a extends AbstractC5774a {

    /* JADX INFO: renamed from: k */
    public C6028b f24475k;

    /* JADX INFO: renamed from: l */
    public List f24476l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC6027a(C5775b c5775b) {
        super(c5775b);
        this.f24476l = Collections.EMPTY_LIST;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public final int m10789H() {
        int i9;
        Iterator it = this.f24476l.iterator();
        while (it.hasNext()) {
            C4320p c4320pM57c0 = AbstractC0000a.m57c0((C4305a) it.next());
            if (c4320pM57c0 != null && (i9 = c4320pM57c0.f9752i) != 0) {
                return i9;
            }
        }
        return 0;
    }
}
