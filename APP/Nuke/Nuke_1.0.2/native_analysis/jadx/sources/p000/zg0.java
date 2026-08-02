package p000;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zg0 extends q43 {

    /* JADX INFO: renamed from: a */
    public volatile q43 f13889a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f13890b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f13891c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ir0 f13892d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ j63 f13893e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ah0 f13894f;

    public zg0(ah0 ah0Var, boolean z, boolean z2, ir0 ir0Var, j63 j63Var) {
        this.f13894f = ah0Var;
        this.f13890b = z;
        this.f13891c = z2;
        this.f13892d = ir0Var;
        this.f13893e = j63Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0083 A[SYNTHETIC] */
    @Override // p000.q43
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo97b(l41 l41Var) throws IOException {
        Iterator it;
        if (this.f13890b) {
            l41Var.m2821P();
            return null;
        }
        q43 q43VarM2386c = this.f13889a;
        if (q43VarM2386c == null) {
            ir0 ir0Var = this.f13892d;
            r43 r43Var = this.f13894f;
            j63 j63Var = this.f13893e;
            x21 x21Var = ir0Var.f4762d;
            x21Var.getClass();
            ConcurrentHashMap concurrentHashMap = x21Var.f12775i;
            if (r43Var == x21.f12773j) {
                r43Var = x21Var;
                it = ir0Var.f4763e.iterator();
                boolean z = false;
                while (true) {
                    if (it.hasNext()) {
                        r43 r43Var2 = (r43) it.next();
                        if (z) {
                            q43 q43VarMo162a = r43Var2.mo162a(ir0Var, j63Var);
                            if (q43VarMo162a != null) {
                                q43VarM2386c = q43VarMo162a;
                                break;
                            }
                        } else if (r43Var2 == r43Var) {
                            z = true;
                        }
                    } else {
                        if (z) {
                            C0676s.m4648g("GSON cannot serialize or deserialize ", j63Var);
                            return null;
                        }
                        q43VarM2386c = ir0Var.m2386c(j63Var);
                    }
                }
                this.f13889a = q43VarM2386c;
            } else {
                Class cls = j63Var.f4904a;
                r43 r43Var3 = (r43) concurrentHashMap.get(cls);
                if (r43Var3 != null) {
                    if (r43Var3 == r43Var) {
                    }
                    it = ir0Var.f4763e.iterator();
                    boolean z2 = false;
                    while (true) {
                        if (it.hasNext()) {
                        }
                    }
                    this.f13889a = q43VarM2386c;
                } else {
                    v21 v21Var = (v21) cls.getAnnotation(v21.class);
                    if (v21Var != null) {
                        Class clsValue = v21Var.value();
                        if (r43.class.isAssignableFrom(clsValue)) {
                            r43 r43Var4 = (r43) x21Var.f12774h.m5031D(new j63(clsValue), true).mo2023a();
                            r43 r43Var5 = (r43) concurrentHashMap.putIfAbsent(cls, r43Var4);
                            if (r43Var5 != null) {
                                r43Var4 = r43Var5;
                            }
                            if (r43Var4 == r43Var) {
                            }
                        }
                    }
                    it = ir0Var.f4763e.iterator();
                    boolean z22 = false;
                    while (true) {
                        if (it.hasNext()) {
                        }
                    }
                    this.f13889a = q43VarM2386c;
                }
            }
        }
        return q43VarM2386c.mo97b(l41Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0082 A[SYNTHETIC] */
    @Override // p000.q43
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo98c(o41 o41Var, Object obj) throws IOException {
        Iterator it;
        if (this.f13891c) {
            o41Var.m3498p();
            return;
        }
        q43 q43VarM2386c = this.f13889a;
        if (q43VarM2386c == null) {
            ir0 ir0Var = this.f13892d;
            r43 r43Var = this.f13894f;
            j63 j63Var = this.f13893e;
            x21 x21Var = ir0Var.f4762d;
            x21Var.getClass();
            ConcurrentHashMap concurrentHashMap = x21Var.f12775i;
            if (r43Var == x21.f12773j) {
                r43Var = x21Var;
                it = ir0Var.f4763e.iterator();
                boolean z = false;
                while (true) {
                    if (it.hasNext()) {
                        r43 r43Var2 = (r43) it.next();
                        if (z) {
                            q43 q43VarMo162a = r43Var2.mo162a(ir0Var, j63Var);
                            if (q43VarMo162a != null) {
                                q43VarM2386c = q43VarMo162a;
                                break;
                            }
                        } else if (r43Var2 == r43Var) {
                            z = true;
                        }
                    } else {
                        if (z) {
                            C0676s.m4648g("GSON cannot serialize or deserialize ", j63Var);
                            return;
                        }
                        q43VarM2386c = ir0Var.m2386c(j63Var);
                    }
                }
                this.f13889a = q43VarM2386c;
            } else {
                Class cls = j63Var.f4904a;
                r43 r43Var3 = (r43) concurrentHashMap.get(cls);
                if (r43Var3 != null) {
                    if (r43Var3 == r43Var) {
                    }
                    it = ir0Var.f4763e.iterator();
                    boolean z2 = false;
                    while (true) {
                        if (it.hasNext()) {
                        }
                    }
                    this.f13889a = q43VarM2386c;
                } else {
                    v21 v21Var = (v21) cls.getAnnotation(v21.class);
                    if (v21Var != null) {
                        Class clsValue = v21Var.value();
                        if (r43.class.isAssignableFrom(clsValue)) {
                            r43 r43Var4 = (r43) x21Var.f12774h.m5031D(new j63(clsValue), true).mo2023a();
                            r43 r43Var5 = (r43) concurrentHashMap.putIfAbsent(cls, r43Var4);
                            if (r43Var5 != null) {
                                r43Var4 = r43Var5;
                            }
                            if (r43Var4 == r43Var) {
                            }
                        }
                    }
                    it = ir0Var.f4763e.iterator();
                    boolean z22 = false;
                    while (true) {
                        if (it.hasNext()) {
                        }
                    }
                    this.f13889a = q43VarM2386c;
                }
            }
        }
        q43VarM2386c.mo98c(o41Var, obj);
    }
}
