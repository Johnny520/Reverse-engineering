package p230p8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p051db.C0763a;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;
import p218og.AbstractC3149m;
import p304uf.C4329c;
import tf.AbstractC4167n;
import tf.C4173t;

/* JADX INFO: renamed from: p8.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3348c {

    /* JADX INFO: renamed from: a */
    public final String f10769a;

    /* JADX INFO: renamed from: b */
    public final List f10770b;

    /* JADX INFO: renamed from: c */
    public final String f10771c;

    /* JADX INFO: renamed from: d */
    public final String f10772d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3348c(String str, ArrayList arrayList, String str2, String str3, int i9) {
        List list = (i9 & 2) != 0 ? C4173t.f13710g : arrayList;
        str2 = (i9 & 4) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str2;
        str3 = (i9 & 8) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str3;
        this.f10769a = str;
        this.f10770b = list;
        this.f10771c = str2;
        this.f10772d = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C4329c m7064a() {
        C4329c c4329cM7E = AbstractC0000a.m7E();
        String str = this.f10769a;
        if (AbstractC3149m.m6721t0(str)) {
            str = null;
        }
        if (str != null) {
            c4329cM7E.add(new C0763a(0, str));
        }
        Iterator it = m7065b().iterator();
        while (it.hasNext()) {
            c4329cM7E.add(new C0763a(1, (String) it.next()));
        }
        String str2 = this.f10771c;
        String str3 = AbstractC3149m.m6721t0(str2) ? null : str2;
        if (str3 != null) {
            c4329cM7E.add(new C0763a(2, str3));
        }
        return AbstractC0000a.m90t(c4329cM7E);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final ArrayList m7065b() {
        List list = this.f10770b;
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C3350d) it.next()).f10775a);
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3348c)) {
            return false;
        }
        C3348c c3348c = (C3348c) obj;
        return this.f10769a.equals(c3348c.f10769a) && this.f10770b.equals(c3348c.f10770b) && this.f10771c.equals(c3348c.f10771c) && this.f10772d.equals(c3348c.f10772d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f10772d.hashCode() + AbstractC0921a.m2244g(AbstractC2091b.m5158e(this.f10770b, this.f10769a.hashCode() * 31, 31), 31, this.f10771c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PreparedSnsForward(text=");
        sb2.append(this.f10769a);
        sb2.append(", imageItems=");
        sb2.append(this.f10770b);
        sb2.append(", video=");
        return AbstractC2091b.m5164k(sb2, this.f10771c, ", videoThumb=", this.f10772d, ")");
    }
}
