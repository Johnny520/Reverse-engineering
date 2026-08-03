package p332wb;

import android.content.Context;
import gg.AbstractC1416l;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.HttpUrl;
import p025bc.C0260j;
import p054dg.AbstractC0793l;
import p080fb.C1107c;
import p080fb.C1109c1;
import p080fb.C1113d1;
import p080fb.C1125g1;
import p080fb.C1165q1;
import p198nb.C2924a;
import p218og.AbstractC3137a;
import p218og.AbstractC3156t;
import p276sf.C3959f;
import tf.AbstractC4167n;
import tf.C4173t;

/* JADX INFO: renamed from: wb.vt */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5420vt {

    /* JADX INFO: renamed from: a */
    public static final ConcurrentHashMap f21558a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public static volatile String f21559b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[LOOP:1: B:44:0x0092->B:87:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C5518yt m9757a(Context context) {
        Object next;
        List list;
        boolean z9;
        Object c3959f;
        String str = f21559b;
        f21559b = null;
        if (str != null) {
            C5518yt c5518yt = (C5518yt) f21558a.get(str);
            if (c5518yt != null) {
                return c5518yt;
            }
            C1125g1 c1125g1 = C1125g1.f3676a;
            File file = new File(C1125g1.m2872p(context), C1125g1.m2869m(str).concat(".json"));
            try {
                c3959f = file.isFile() ? c1125g1.m2874c(AbstractC0793l.m2028h0(file, AbstractC3137a.f10177a)) : null;
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            if (c3959f instanceof C3959f) {
                c3959f = null;
            }
            C1113d1 c1113d1 = (C1113d1) c3959f;
            if (c1113d1 != null) {
                C1125g1 c1125g12 = C1125g1.f3676a;
                if (!C1125g1.m2864h(c1113d1.f3640e)) {
                    c1113d1 = null;
                }
            }
            if (c1113d1 != null) {
                return m9760d(c1113d1);
            }
            return null;
        }
        C1125g1 c1125g13 = C1125g1.f3676a;
        Iterator it = C1125g1.m2865i(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C1113d1 c1113d12 = (C1113d1) next;
            C1109c1 c1109c1 = c1113d12.f3650o;
            boolean z10 = false;
            if (c1109c1 != null) {
                if (!c1109c1.f3607f) {
                    c1109c1 = null;
                }
                if (c1109c1 != null && ((list = c1113d12.f3640e) == null || !list.isEmpty())) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        C1107c c1107c = (C1107c) it2.next();
                        if (AbstractC1416l.m3825a(c1107c.f3587d, c1109c1.f3602a)) {
                            if (!AbstractC1416l.m3825a(c1107c.f3597n, "interrupted") && !AbstractC1416l.m3825a(c1107c.f3597n, "error")) {
                                List list2 = c1107c.f3593j;
                                if (list2 == null || !list2.isEmpty()) {
                                    Iterator it3 = list2.iterator();
                                    while (it3.hasNext()) {
                                        if (((C1165q1) it3.next()).f3880g.equals("interrupted")) {
                                        }
                                    }
                                }
                                z9 = false;
                                if (z9) {
                                }
                            }
                            z9 = true;
                            if (z9) {
                            }
                        } else {
                            z9 = false;
                            if (z9) {
                                z10 = true;
                                break;
                            }
                        }
                    }
                }
            }
            if (z10) {
                break;
            }
        }
        C1113d1 c1113d13 = (C1113d1) next;
        if (c1113d13 != null) {
            return m9760d(c1113d13);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static C5518yt m9758b() {
        C1125g1 c1125g1 = C1125g1.f3676a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String string = UUID.randomUUID().toString();
        string.getClass();
        return m9760d(new C1113d1(AbstractC3156t.m6737a0(string, "-", HttpUrl.FRAGMENT_ENCODE_SET, false), "新对话", jCurrentTimeMillis, jCurrentTimeMillis, C4173t.f13710g, null, null, null, 65472));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static ArrayList m9759c() {
        Collection collectionValues = f21558a.values();
        collectionValues.getClass();
        Collection<C5518yt> collection = collectionValues;
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(collection));
        for (C5518yt c5518yt : collection) {
            c5518yt.getClass();
            arrayList.add(C5518yt.m9924N(c5518yt));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            C1125g1 c1125g1 = C1125g1.f3676a;
            if (C1125g1.m2864h(((C1113d1) obj).f3640e)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static C5518yt m9760d(C1113d1 c1113d1) {
        c1113d1.getClass();
        Object objComputeIfAbsent = f21558a.computeIfAbsent(c1113d1.f3636a, new C0260j(new C2924a(c1113d1, 27), 13));
        objComputeIfAbsent.getClass();
        return (C5518yt) objComputeIfAbsent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static LinkedHashSet m9761e() {
        Collection collectionValues = f21558a.values();
        collectionValues.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (((C5518yt) obj).m9936L()) {
                arrayList.add(obj);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((C5518yt) it.next()).f22271a);
        }
        return linkedHashSet;
    }
}
