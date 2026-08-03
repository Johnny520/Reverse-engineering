package p053df;

import ad.C0069c;
import com.alibaba.fastjson2.writer.C0640b;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;
import p067ef.C0918c;

/* JADX INFO: renamed from: df.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0781i {

    /* JADX INFO: renamed from: f */
    public static final Comparator f2350f = Comparator.comparing(new C0640b(12)).thenComparing(new C0640b(13)).thenComparing(new C0640b(14));

    /* JADX INFO: renamed from: b */
    public final C0069c f2352b;

    /* JADX INFO: renamed from: c */
    public String f2353c;

    /* JADX INFO: renamed from: a */
    public final ArrayList f2351a = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final TreeMap f2354d = new TreeMap(f2350f);

    /* JADX INFO: renamed from: e */
    public final HashMap f2355e = new HashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0781i(C0069c c0069c) {
        this.f2352b = c0069c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final HashMap m2015a() {
        HashMap map = new HashMap();
        for (C0918c c0918c : this.f2351a) {
            map.put(Integer.valueOf(c0918c.f2873a), c0918c.f2875c + "/" + c0918c.f2876d);
        }
        return map;
    }
}
