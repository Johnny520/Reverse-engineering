package p000;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class z90 extends s90 {

    /* JADX INFO: renamed from: a */
    public final boolean f7839a;

    /* JADX INFO: renamed from: b */
    public C0486mt f7840b;

    /* JADX INFO: renamed from: c */
    public r90 f7841c;

    /* JADX INFO: renamed from: d */
    public final WeakReference f7842d;

    /* JADX INFO: renamed from: e */
    public int f7843e;

    /* JADX INFO: renamed from: f */
    public boolean f7844f;

    /* JADX INFO: renamed from: g */
    public boolean f7845g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f7846h;

    /* JADX INFO: renamed from: i */
    public final z31 f7847i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public z90(x90 x90Var, boolean z) {
        new AtomicReference(null);
        this.f7839a = z;
        this.f7840b = new C0486mt();
        r90 r90Var = r90.f5333e;
        this.f7841c = r90Var;
        this.f7846h = new ArrayList();
        this.f7842d = new WeakReference(x90Var);
        this.f7847i = pf1.m3048d(r90Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.s90
    /* JADX INFO: renamed from: a */
    public final void mo4014a(w90 w90Var) {
        v90 c0251gm;
        y90 y90Var;
        x90 x90Var;
        w90Var.getClass();
        m5460d("addObserver");
        r90 r90Var = this.f7841c;
        r90 r90Var2 = r90.f5332d;
        if (r90Var != r90Var2) {
            r90Var2 = r90.f5333e;
        }
        y90 y90Var2 = new y90();
        HashMap map = da0.f1010a;
        boolean z = w90Var instanceof v90;
        boolean z2 = w90Var instanceof InterfaceC0177em;
        int i = 2;
        if (z && z2) {
            c0251gm = new C0251gm((InterfaceC0177em) w90Var, (v90) w90Var);
        } else if (z2) {
            c0251gm = new C0251gm((InterfaceC0177em) w90Var, (v90) null);
        } else if (z) {
            c0251gm = (v90) w90Var;
        } else {
            Class<?> cls = w90Var.getClass();
            if (da0.m673b(cls) == 2) {
                Object obj = da0.f1011b.get(cls);
                obj.getClass();
                List list = (List) obj;
                if (list.size() == 1) {
                    da0.m672a((Constructor) list.get(0), w90Var);
                    throw null;
                }
                int size = list.size();
                InterfaceC0371jx[] interfaceC0371jxArr = new InterfaceC0371jx[size];
                if (size > 0) {
                    da0.m672a((Constructor) list.get(0), w90Var);
                    throw null;
                }
                c0251gm = new rt0(i, interfaceC0371jxArr);
            } else {
                c0251gm = new C0251gm(w90Var);
            }
        }
        y90Var2.f7584b = c0251gm;
        y90Var2.f7583a = r90Var2;
        C0486mt c0486mt = this.f7840b;
        rw0 rw0Var = (rw0) c0486mt.f4036h.get(w90Var);
        if (rw0Var != null) {
            y90Var = rw0Var.f5563e;
        } else {
            HashMap map2 = c0486mt.f4036h;
            rw0 rw0Var2 = new rw0(w90Var, y90Var2);
            c0486mt.f4035g++;
            rw0 rw0Var3 = c0486mt.f4033e;
            if (rw0Var3 == null) {
                c0486mt.f4032d = rw0Var2;
                c0486mt.f4033e = rw0Var2;
            } else {
                rw0Var3.f5564f = rw0Var2;
                rw0Var2.f5565g = rw0Var3;
                c0486mt.f4033e = rw0Var2;
            }
            map2.put(w90Var, rw0Var2);
            y90Var = null;
        }
        if (y90Var == null && (x90Var = (x90) this.f7842d.get()) != null) {
            boolean z3 = this.f7843e != 0 || this.f7844f;
            r90 r90VarM5459c = m5459c(w90Var);
            this.f7843e++;
            while (y90Var2.f7583a.compareTo(r90VarM5459c) < 0 && this.f7840b.f4036h.containsKey(w90Var)) {
                r90 r90Var3 = y90Var2.f7583a;
                ArrayList arrayList = this.f7846h;
                arrayList.add(r90Var3);
                o90 o90Var = q90.Companion;
                r90 r90Var4 = y90Var2.f7583a;
                o90Var.getClass();
                r90Var4.getClass();
                int iOrdinal = r90Var4.ordinal();
                q90 q90Var = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? null : q90.ON_RESUME : q90.ON_START : q90.ON_CREATE;
                if (q90Var == null) {
                    C0921xc.m5133n(y90Var2.f7583a, "no event up from ");
                    return;
                } else {
                    y90Var2.m5223a(x90Var, q90Var);
                    arrayList.remove(arrayList.size() - 1);
                    r90VarM5459c = m5459c(w90Var);
                }
            }
            if (!z3) {
                m5463g();
            }
            this.f7843e--;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.s90
    /* JADX INFO: renamed from: b */
    public final void mo4015b(w90 w90Var) {
        w90Var.getClass();
        m5460d("removeObserver");
        C0486mt c0486mt = this.f7840b;
        WeakHashMap weakHashMap = c0486mt.f4034f;
        HashMap map = c0486mt.f4036h;
        rw0 rw0Var = (rw0) map.get(w90Var);
        if (rw0Var != null) {
            c0486mt.f4035g--;
            if (!weakHashMap.isEmpty()) {
                Iterator it = weakHashMap.keySet().iterator();
                while (it.hasNext()) {
                    ((tw0) it.next()).mo3336a(rw0Var);
                }
            }
            rw0 rw0Var2 = rw0Var.f5565g;
            rw0 rw0Var3 = rw0Var.f5564f;
            if (rw0Var2 != null) {
                rw0Var2.f5564f = rw0Var3;
            } else {
                c0486mt.f4032d = rw0Var3;
            }
            rw0 rw0Var4 = rw0Var.f5564f;
            if (rw0Var4 != null) {
                rw0Var4.f5565g = rw0Var2;
            } else {
                c0486mt.f4033e = rw0Var2;
            }
            rw0Var.f5564f = null;
            rw0Var.f5565g = null;
        }
        map.remove(w90Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final r90 m5459c(w90 w90Var) {
        HashMap map = this.f7840b.f4036h;
        rw0 rw0Var = map.containsKey(w90Var) ? ((rw0) map.get(w90Var)).f5565g : null;
        r90 r90Var = rw0Var != null ? rw0Var.f5563e.f7583a : null;
        ArrayList arrayList = this.f7846h;
        r90 r90Var2 = arrayList.isEmpty() ? null : (r90) arrayList.get(arrayList.size() - 1);
        r90 r90Var3 = this.f7841c;
        r90Var3.getClass();
        if (r90Var == null || r90Var.compareTo(r90Var3) >= 0) {
            r90Var = r90Var3;
        }
        return (r90Var2 == null || r90Var2.compareTo(r90Var) >= 0) ? r90Var : r90Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m5460d(String str) {
        C0680r8 c0680r8;
        if (this.f7839a) {
            if (C0680r8.f5321b != null) {
                c0680r8 = C0680r8.f5321b;
            } else {
                synchronized (C0680r8.class) {
                    try {
                        if (C0680r8.f5321b == null) {
                            C0680r8.f5321b = new C0680r8(0);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                c0680r8 = C0680r8.f5321b;
            }
            ((C0680r8) c0680r8.f5322a).getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m5461e(q90 q90Var) {
        q90Var.getClass();
        m5460d("handleLifecycleEvent");
        m5462f(q90Var.m3210a());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m5462f(r90 r90Var) {
        if (this.f7841c == r90Var) {
            return;
        }
        x90 x90Var = (x90) this.f7842d.get();
        r90 r90Var2 = this.f7841c;
        r90Var2.getClass();
        r90 r90Var3 = r90.f5333e;
        r90 r90Var4 = r90.f5332d;
        if (r90Var2 == r90Var3 && r90Var == r90Var4) {
            throw new IllegalStateException(("State must be at least '" + r90.f5334f + "' to be moved to '" + r90Var + "' in component " + x90Var).toString());
        }
        if (r90Var2 == r90Var4 && r90Var2 != r90Var) {
            throw new IllegalStateException(("State is '" + r90Var4 + "' and cannot be moved to `" + r90Var + "` in component " + x90Var).toString());
        }
        this.f7841c = r90Var;
        if (this.f7844f || this.f7843e != 0) {
            this.f7845g = true;
            return;
        }
        this.f7844f = true;
        m5463g();
        this.f7844f = false;
        if (this.f7841c == r90Var4) {
            this.f7840b = new C0486mt();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        r11.f7845g = false;
        r11.f7847i.m5412i(r11.f7841c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5463g() {
        x90 x90Var = (x90) this.f7842d.get();
        if (x90Var == null) {
            C0921xc.m5134o("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        while (true) {
            C0486mt c0486mt = this.f7840b;
            if (c0486mt.f4035g != 0) {
                rw0 rw0Var = c0486mt.f4032d;
                rw0Var.getClass();
                r90 r90Var = rw0Var.f5563e.f7583a;
                rw0 rw0Var2 = this.f7840b.f4033e;
                rw0Var2.getClass();
                r90 r90Var2 = rw0Var2.f5563e.f7583a;
                if (r90Var == r90Var2 && this.f7841c == r90Var2) {
                    break;
                }
                this.f7845g = false;
                r90 r90Var3 = this.f7841c;
                rw0 rw0Var3 = this.f7840b.f4032d;
                rw0Var3.getClass();
                int iCompareTo = r90Var3.compareTo(rw0Var3.f5563e.f7583a);
                ArrayList arrayList = this.f7846h;
                if (iCompareTo < 0) {
                    C0486mt c0486mt2 = this.f7840b;
                    qw0 qw0Var = new qw0(c0486mt2.f4033e, c0486mt2.f4032d, 1);
                    c0486mt2.f4034f.put(qw0Var, Boolean.FALSE);
                    while (qw0Var.hasNext() && !this.f7845g) {
                        Map.Entry entry = (Map.Entry) qw0Var.next();
                        entry.getClass();
                        w90 w90Var = (w90) entry.getKey();
                        y90 y90Var = (y90) entry.getValue();
                        while (y90Var.f7583a.compareTo(this.f7841c) > 0 && !this.f7845g && this.f7840b.f4036h.containsKey(w90Var)) {
                            o90 o90Var = q90.Companion;
                            r90 r90Var4 = y90Var.f7583a;
                            o90Var.getClass();
                            r90Var4.getClass();
                            int iOrdinal = r90Var4.ordinal();
                            q90 q90Var = iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? null : q90.ON_PAUSE : q90.ON_STOP : q90.ON_DESTROY;
                            if (q90Var == null) {
                                C0921xc.m5133n(y90Var.f7583a, "no event down from ");
                                return;
                            } else {
                                arrayList.add(q90Var.m3210a());
                                y90Var.m5223a(x90Var, q90Var);
                                arrayList.remove(arrayList.size() - 1);
                            }
                        }
                    }
                }
                rw0 rw0Var4 = this.f7840b.f4033e;
                if (!this.f7845g && rw0Var4 != null && this.f7841c.compareTo(rw0Var4.f5563e.f7583a) > 0) {
                    C0486mt c0486mt3 = this.f7840b;
                    c0486mt3.getClass();
                    sw0 sw0Var = new sw0(c0486mt3);
                    c0486mt3.f4034f.put(sw0Var, Boolean.FALSE);
                    while (sw0Var.hasNext() && !this.f7845g) {
                        Map.Entry entry2 = (Map.Entry) sw0Var.next();
                        w90 w90Var2 = (w90) entry2.getKey();
                        y90 y90Var2 = (y90) entry2.getValue();
                        while (y90Var2.f7583a.compareTo(this.f7841c) < 0 && !this.f7845g && this.f7840b.f4036h.containsKey(w90Var2)) {
                            arrayList.add(y90Var2.f7583a);
                            o90 o90Var2 = q90.Companion;
                            r90 r90Var5 = y90Var2.f7583a;
                            o90Var2.getClass();
                            r90Var5.getClass();
                            int iOrdinal2 = r90Var5.ordinal();
                            q90 q90Var2 = iOrdinal2 != 1 ? iOrdinal2 != 2 ? iOrdinal2 != 3 ? null : q90.ON_RESUME : q90.ON_START : q90.ON_CREATE;
                            if (q90Var2 == null) {
                                C0921xc.m5133n(y90Var2.f7583a, "no event up from ");
                                return;
                            } else {
                                y90Var2.m5223a(x90Var, q90Var2);
                                arrayList.remove(arrayList.size() - 1);
                            }
                        }
                    }
                }
            } else {
                break;
            }
        }
    }
}
