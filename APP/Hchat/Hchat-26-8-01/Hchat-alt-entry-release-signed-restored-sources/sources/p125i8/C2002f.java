package p125i8;

import af.C0081d;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import p134j6.C2076n;
import p134j6.InterfaceC2077o;
import p136j8.InterfaceC2102m;
import p210o8.InterfaceC3078b;

/* JADX INFO: renamed from: i8.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2002f implements InterfaceC3078b, InterfaceC2077o, InterfaceC2102m {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f6742g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [h0.q0.c(n6.a, boolean):j6.o] */
    public /* synthetic */ C2002f(int i9) {
        this.f6742g = i9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: THROW 
  (wrap:af.d:0x0012: CONSTRUCTOR 
  (wrap:java.lang.String:STR_CONCAT 
  (r3v0 java.lang.String)
  (wrap:java.lang.Object:?: CAST (java.lang.Object) (wrap:java.lang.String:0x0007: INVOKE (r2v0 java.lang.Object) VIRTUAL call: java.lang.Object.toString():java.lang.String A[MD:():java.lang.String (c), WRAPPED] (LINE:8)))
 A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:15))
 A[MD:(java.lang.String):void (c), WRAPPED] (LINE:19) call: af.d.<init>(java.lang.String):void type: CONSTRUCTOR)
 (LINE:57) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m4936b(Object obj, String str) {
        throw new C0081d(str + ((Object) obj.toString()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p136j8.InterfaceC2102m
    /* JADX INFO: renamed from: a */
    public void mo467a(String str) {
        C2005i.m4939f(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p134j6.InterfaceC2077o
    /* JADX INFO: renamed from: d */
    public Object mo4937d() {
        switch (this.f6742g) {
            case 17:
                return new C2076n(true);
            case 18:
                return new LinkedHashMap();
            case 19:
                return new TreeMap();
            case 20:
                return new ConcurrentHashMap();
            case 21:
                return new ConcurrentSkipListMap();
            case 22:
                return new ArrayList();
            case 23:
                return new LinkedHashSet();
            case 24:
                return new TreeSet();
            default:
                return new ArrayDeque();
        }
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [i8.i.c(r8.g):void] */
    public /* synthetic */ C2002f(Object obj, int i9) {
        this.f6742g = i9;
    }
}
