package na;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;

/* JADX INFO: renamed from: na.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2923k {

    /* JADX INFO: renamed from: a */
    public final Set f9538a;

    /* JADX INFO: renamed from: b */
    public final Set f9539b;

    /* JADX INFO: renamed from: c */
    public final Set f9540c;

    /* JADX INFO: renamed from: d */
    public final Set f9541d;

    /* JADX INFO: renamed from: e */
    public final Set f9542e;

    /* JADX INFO: renamed from: f */
    public final ConcurrentHashMap f9543f;

    /* JADX INFO: renamed from: g */
    public final ConcurrentHashMap f9544g;

    /* JADX INFO: renamed from: h */
    public final ConcurrentHashMap f9545h;

    /* JADX INFO: renamed from: i */
    public final ConcurrentHashMap f9546i;

    /* JADX INFO: renamed from: j */
    public final ConcurrentLinkedDeque f9547j;

    /* JADX INFO: renamed from: k */
    public final ConcurrentHashMap f9548k;

    /* JADX INFO: renamed from: l */
    public final Map f9549l;

    /* JADX INFO: renamed from: m */
    public final ConcurrentHashMap f9550m;

    /* JADX INFO: renamed from: n */
    public final ConcurrentHashMap f9551n;

    /* JADX INFO: renamed from: o */
    public final Set f9552o;

    /* JADX INFO: renamed from: p */
    public final Set f9553p;

    /* JADX INFO: renamed from: q */
    public final Set f9554q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2923k() {
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        setNewSetFromMap.getClass();
        this.f9538a = setNewSetFromMap;
        Set setNewSetFromMap2 = Collections.newSetFromMap(new ConcurrentHashMap());
        setNewSetFromMap2.getClass();
        this.f9539b = setNewSetFromMap2;
        Set setNewSetFromMap3 = Collections.newSetFromMap(new ConcurrentHashMap());
        setNewSetFromMap3.getClass();
        this.f9540c = setNewSetFromMap3;
        Set setNewSetFromMap4 = Collections.newSetFromMap(new ConcurrentHashMap());
        setNewSetFromMap4.getClass();
        this.f9541d = setNewSetFromMap4;
        Set setNewSetFromMap5 = Collections.newSetFromMap(new ConcurrentHashMap());
        setNewSetFromMap5.getClass();
        this.f9542e = setNewSetFromMap5;
        this.f9543f = new ConcurrentHashMap();
        this.f9544g = new ConcurrentHashMap();
        this.f9545h = new ConcurrentHashMap();
        this.f9546i = new ConcurrentHashMap();
        this.f9547j = new ConcurrentLinkedDeque();
        this.f9548k = new ConcurrentHashMap();
        Map mapSynchronizedMap = Collections.synchronizedMap(new WeakHashMap());
        mapSynchronizedMap.getClass();
        this.f9549l = mapSynchronizedMap;
        this.f9550m = new ConcurrentHashMap();
        this.f9551n = new ConcurrentHashMap();
        Set setNewSetFromMap6 = Collections.newSetFromMap(new ConcurrentHashMap());
        setNewSetFromMap6.getClass();
        this.f9552o = setNewSetFromMap6;
        Set setNewSetFromMap7 = Collections.newSetFromMap(new ConcurrentHashMap());
        setNewSetFromMap7.getClass();
        this.f9553p = setNewSetFromMap7;
        Set setNewSetFromMap8 = Collections.newSetFromMap(new ConcurrentHashMap());
        setNewSetFromMap8.getClass();
        this.f9554q = setNewSetFromMap8;
    }
}
