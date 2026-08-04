package yyds;

import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᲈᛸᛶᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2718 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final ArrayList f13347;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final List f13348;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C1618 f13349;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C2014 f13350;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public List f13351;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C2729 f13352;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int f13353;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final boolean f13354;

    public C2718(C1618 c1618, C2014 c2014, C2729 c2729, boolean z) {
        List listM1806;
        this.f13349 = c1618;
        this.f13350 = c2014;
        this.f13352 = c2729;
        this.f13354 = z;
        C1860 c1860 = C1860.f9345;
        this.f13348 = c1860;
        this.f13351 = c1860;
        this.f13347 = new ArrayList();
        C0082 c0082 = c1618.f8234;
        c2729.f13425.getClass();
        URI uriM475 = c0082.m475();
        if (uriM475.getHost() == null) {
            listM1806 = AbstractC0795.m1806(new Proxy[]{Proxy.NO_PROXY});
        } else {
            List<Proxy> listSelect = c1618.f8239.select(uriM475);
            listM1806 = (listSelect == null || listSelect.isEmpty()) ? AbstractC0795.m1806(new Proxy[]{Proxy.NO_PROXY}) : AbstractC0795.m1807(listSelect);
        }
        this.f13348 = listM1806;
        this.f13353 = 0;
        c2729.f13425.getClass();
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final boolean m4827() {
        return this.f13353 < this.f13348.size() || !this.f13347.isEmpty();
    }
}
