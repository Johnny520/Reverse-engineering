package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zg0 extends q43 {
    public volatile q43 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ir0 d;
    public final /* synthetic */ j63 e;
    public final /* synthetic */ ah0 f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public zg0(ah0 ah0Var, boolean z, boolean z2, ir0 ir0Var, j63 j63Var) {
        this.f = ah0Var;
        this.b = z;
        this.c = z2;
        this.d = ir0Var;
        this.e = j63Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0083 A[SYNTHETIC] */
    @Override // defpackage.q43
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(l41 l41Var) throws IOException {
        Iterator it;
        if (this.b) {
            l41Var.P();
            return null;
        }
        q43 q43VarC = this.a;
        if (q43VarC == null) {
            ir0 ir0Var = this.d;
            r43 r43Var = this.f;
            j63 j63Var = this.e;
            x21 x21Var = ir0Var.d;
            x21Var.getClass();
            ConcurrentHashMap concurrentHashMap = x21Var.i;
            if (r43Var == x21.j) {
                r43Var = x21Var;
                it = ir0Var.e.iterator();
                boolean z = false;
                while (true) {
                    if (it.hasNext()) {
                        r43 r43Var2 = (r43) it.next();
                        if (z) {
                            q43 q43VarA = r43Var2.a(ir0Var, j63Var);
                            if (q43VarA != null) {
                                q43VarC = q43VarA;
                                break;
                            }
                        } else if (r43Var2 == r43Var) {
                            z = true;
                        }
                    } else {
                        if (z) {
                            s.g("GSON cannot serialize or deserialize ", j63Var);
                            return null;
                        }
                        q43VarC = ir0Var.c(j63Var);
                    }
                }
                this.a = q43VarC;
            } else {
                Class cls = j63Var.a;
                r43 r43Var3 = (r43) concurrentHashMap.get(cls);
                if (r43Var3 != null) {
                    if (r43Var3 == r43Var) {
                    }
                    it = ir0Var.e.iterator();
                    boolean z2 = false;
                    while (true) {
                        if (it.hasNext()) {
                        }
                    }
                    this.a = q43VarC;
                } else {
                    v21 v21Var = (v21) cls.getAnnotation(v21.class);
                    if (v21Var != null) {
                        Class clsValue = v21Var.value();
                        if (r43.class.isAssignableFrom(clsValue)) {
                            r43 r43Var4 = (r43) x21Var.h.D(new j63(clsValue), true).a();
                            r43 r43Var5 = (r43) concurrentHashMap.putIfAbsent(cls, r43Var4);
                            if (r43Var5 != null) {
                                r43Var4 = r43Var5;
                            }
                            if (r43Var4 == r43Var) {
                            }
                        }
                    }
                    it = ir0Var.e.iterator();
                    boolean z22 = false;
                    while (true) {
                        if (it.hasNext()) {
                        }
                    }
                    this.a = q43VarC;
                }
            }
        }
        return q43VarC.b(l41Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0082 A[SYNTHETIC] */
    @Override // defpackage.q43
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(o41 o41Var, Object obj) throws IOException {
        Iterator it;
        if (this.c) {
            o41Var.p();
            return;
        }
        q43 q43VarC = this.a;
        if (q43VarC == null) {
            ir0 ir0Var = this.d;
            r43 r43Var = this.f;
            j63 j63Var = this.e;
            x21 x21Var = ir0Var.d;
            x21Var.getClass();
            ConcurrentHashMap concurrentHashMap = x21Var.i;
            if (r43Var == x21.j) {
                r43Var = x21Var;
                it = ir0Var.e.iterator();
                boolean z = false;
                while (true) {
                    if (it.hasNext()) {
                        r43 r43Var2 = (r43) it.next();
                        if (z) {
                            q43 q43VarA = r43Var2.a(ir0Var, j63Var);
                            if (q43VarA != null) {
                                q43VarC = q43VarA;
                                break;
                            }
                        } else if (r43Var2 == r43Var) {
                            z = true;
                        }
                    } else {
                        if (z) {
                            s.g("GSON cannot serialize or deserialize ", j63Var);
                            return;
                        }
                        q43VarC = ir0Var.c(j63Var);
                    }
                }
                this.a = q43VarC;
            } else {
                Class cls = j63Var.a;
                r43 r43Var3 = (r43) concurrentHashMap.get(cls);
                if (r43Var3 != null) {
                    if (r43Var3 == r43Var) {
                    }
                    it = ir0Var.e.iterator();
                    boolean z2 = false;
                    while (true) {
                        if (it.hasNext()) {
                        }
                    }
                    this.a = q43VarC;
                } else {
                    v21 v21Var = (v21) cls.getAnnotation(v21.class);
                    if (v21Var != null) {
                        Class clsValue = v21Var.value();
                        if (r43.class.isAssignableFrom(clsValue)) {
                            r43 r43Var4 = (r43) x21Var.h.D(new j63(clsValue), true).a();
                            r43 r43Var5 = (r43) concurrentHashMap.putIfAbsent(cls, r43Var4);
                            if (r43Var5 != null) {
                                r43Var4 = r43Var5;
                            }
                            if (r43Var4 == r43Var) {
                            }
                        }
                    }
                    it = ir0Var.e.iterator();
                    boolean z22 = false;
                    while (true) {
                        if (it.hasNext()) {
                        }
                    }
                    this.a = q43VarC;
                }
            }
        }
        q43VarC.c(o41Var, obj);
    }
}
