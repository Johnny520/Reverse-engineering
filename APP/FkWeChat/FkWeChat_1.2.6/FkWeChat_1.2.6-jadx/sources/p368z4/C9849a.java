package p368z4;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Objects;
import java.util.function.Function;

/* JADX INFO: renamed from: z4.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C9849a {

    /* JADX INFO: renamed from: a */
    public Function f33268a;

    /* JADX INFO: renamed from: b */
    public a f33269b;

    /* JADX INFO: renamed from: c */
    public HashMap f33270c = new HashMap();

    /* JADX INFO: renamed from: d */
    public HashMap f33271d = new HashMap();

    /* JADX INFO: renamed from: e */
    public ReferenceQueue f33272e = new ReferenceQueue();

    /* JADX INFO: renamed from: f */
    public int f33273f;

    /* JADX INFO: renamed from: g */
    public int f33274g;

    /* JADX INFO: renamed from: h */
    public int f33275h;

    /* JADX INFO: renamed from: z4.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public enum a {
        Weak,
        Soft
    }

    public C9849a(Function function, a aVar) {
        Objects.requireNonNull(function, "creator must not be null");
        Objects.requireNonNull(aVar, "type must not be null");
        this.f33268a = function;
        this.f33269b = aVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m38262a() {
        while (true) {
            Reference referencePoll = this.f33272e.poll();
            if (referencePoll == null) {
                return;
            }
            Object obj = this.f33271d.get(referencePoll);
            if (obj != null) {
                this.f33270c.remove(obj);
            }
            this.f33271d.remove(referencePoll);
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m38263b() {
        m38262a();
        this.f33270c.clear();
        this.f33271d.clear();
        this.f33275h = 0;
        this.f33274g = 0;
        this.f33273f = 0;
    }

    /* JADX INFO: renamed from: c */
    public synchronized Object m38264c(Object obj) {
        Object obj2;
        try {
            Objects.requireNonNull(obj, "key must not be null");
            int i10 = this.f33273f + 1;
            this.f33273f = i10;
            if (i10 == 1000) {
                m38262a();
                this.f33275h = 0;
                this.f33274g = 0;
                this.f33273f = 0;
            }
            Reference reference = (Reference) this.f33270c.get(obj);
            if (reference != null && (obj2 = reference.get()) != null) {
                this.f33274g++;
                return obj2;
            }
            this.f33275h++;
            Object objApply = this.f33268a.apply(obj);
            Objects.requireNonNull(objApply, "ValueReference cache create value may not return null.");
            Reference weakReference = this.f33269b == a.Weak ? new WeakReference(objApply, this.f33272e) : new SoftReference(objApply, this.f33272e);
            this.f33270c.put(obj, weakReference);
            this.f33271d.put(weakReference, obj);
            return objApply;
        } catch (Throwable th) {
            throw th;
        }
    }
}
