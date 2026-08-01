package bsh;

import java.io.Serializable;
import java.util.EmptyStackException;
import java.util.Stack;

/* JADX INFO: renamed from: bsh.f1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1174f1 implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: q */
    public final Stack f3548q = new Stack();

    public C1174f1(C1182g3 c1182g3) {
        m4317f(c1182g3);
    }

    /* JADX INFO: renamed from: a */
    public void m4312a() {
        this.f3548q.clear();
    }

    /* JADX INFO: renamed from: b */
    public C1174f1 m4313b() {
        C1174f1 c1174f1 = new C1174f1();
        c1174f1.f3548q.addAll(this.f3548q);
        return c1174f1;
    }

    /* JADX INFO: renamed from: c */
    public int m4314c() {
        return this.f3548q.size();
    }

    /* JADX INFO: renamed from: d */
    public C1182g3 m4315d(int i10) {
        int size = this.f3548q.size();
        return i10 >= size ? C1182g3.f3563M : ((C1182g3[]) this.f3548q.toArray(new C1182g3[size]))[(size - 1) - i10];
    }

    /* JADX INFO: renamed from: e */
    public C1182g3 m4316e() {
        try {
            return (C1182g3) this.f3548q.pop();
        } catch (EmptyStackException unused) {
            throw new C1211l2("pop on empty CallStack");
        }
    }

    /* JADX INFO: renamed from: f */
    public void m4317f(C1182g3 c1182g3) {
        this.f3548q.push(c1182g3);
    }

    /* JADX INFO: renamed from: g */
    public C1182g3 m4318g(C1182g3 c1182g3) {
        C1182g3 c1182g32 = (C1182g3) this.f3548q.pop();
        this.f3548q.push(c1182g3);
        return c1182g32;
    }

    /* JADX INFO: renamed from: h */
    public C1182g3 m4319h() {
        return (C1182g3) this.f3548q.peek();
    }

    public synchronized String toString() {
        StringBuilder sb2;
        try {
            sb2 = new StringBuilder();
            sb2.append("CallStack:\n");
            for (int size = this.f3548q.size() - 1; size >= 0; size += -1) {
                sb2.append("\t" + this.f3548q.get(size) + "\n");
            }
        } catch (Throwable th) {
            throw th;
        }
        return sb2.toString();
    }

    public C1174f1() {
    }
}
