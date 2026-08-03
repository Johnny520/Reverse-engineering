package th;

import java.util.ArrayList;
import java.util.Iterator;
import okhttp3.HttpUrl;
import p071f1.AbstractC1018n0;
import p071f1.InterfaceC1037z;
import p117i0.C1829f1;
import p118i1.C1902b;
import p339x1.AbstractC5618k;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: th.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4213e {

    /* JADX INFO: renamed from: a */
    public C1902b f13817a;

    /* JADX INFO: renamed from: c */
    public C1902b f13819c;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C4217i f13827k;

    /* JADX INFO: renamed from: b */
    public final ArrayList f13818b = new ArrayList();

    /* JADX INFO: renamed from: d */
    public int f13820d = 1;

    /* JADX INFO: renamed from: e */
    public final C1829f1 f13821e = new C1829f1(0.0f);

    /* JADX INFO: renamed from: f */
    public int f13822f = 1;

    /* JADX INFO: renamed from: g */
    public final String[] f13823g = {HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET};

    /* JADX INFO: renamed from: h */
    public final int[] f13824h = {-1, -1};

    /* JADX INFO: renamed from: i */
    public final int[] f13825i = {-1, -1};

    /* JADX INFO: renamed from: j */
    public final AbstractC1018n0[] f13826j = new AbstractC1018n0[2];

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4213e(C4217i c4217i) {
        this.f13827k = c4217i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C1902b m8480a(int i9) {
        InterfaceC1037z interfaceC1037zM10165u = AbstractC5618k.m10165u(this.f13827k);
        while (true) {
            ArrayList arrayList = this.f13818b;
            if (arrayList.size() > i9) {
                return (C1902b) arrayList.get(i9);
            }
            arrayList.add(interfaceC1037zM10165u.mo2557c());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m8481b() {
        InterfaceC1037z interfaceC1037zM10165u = AbstractC5618k.m10165u(this.f13827k);
        C1902b c1902b = this.f13817a;
        if (c1902b != null) {
            interfaceC1037zM10165u.mo2555a(c1902b);
        }
        this.f13817a = null;
        ArrayList arrayList = this.f13818b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            interfaceC1037zM10165u.mo2555a((C1902b) it.next());
        }
        arrayList.clear();
        C1902b c1902b2 = this.f13819c;
        if (c1902b2 != null) {
            interfaceC1037zM10165u.mo2555a(c1902b2);
        }
        this.f13819c = null;
        AbstractC1018n0[] abstractC1018n0Arr = this.f13826j;
        AbstractC4165l.m8387v0(0, abstractC1018n0Arr.length, null, abstractC1018n0Arr);
        String[] strArr = this.f13823g;
        AbstractC4165l.m8387v0(0, strArr.length, HttpUrl.FRAGMENT_ENCODE_SET, strArr);
        AbstractC4165l.m8390y0(this.f13824h, -1);
        AbstractC4165l.m8390y0(this.f13825i, -1);
    }
}
