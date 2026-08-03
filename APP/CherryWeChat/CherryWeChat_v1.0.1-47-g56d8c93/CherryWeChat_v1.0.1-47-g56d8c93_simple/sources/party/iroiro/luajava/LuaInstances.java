package party.iroiro.luajava;

import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class LuaInstances<T> {
    private int freeEntries;
    private final ArrayList<Object> instances;
    private int lastFreeId;

    public static class Token<T> {

        /* JADX INFO: renamed from: id */
        public final int f8317id;
        public final Consumer<T> setter;

        public interface Consumer<T> {
            void accept(T r1);
        }

        public /* synthetic */ Token(int r1, Consumer r2, C23641 r3) {
            this(r1, r2);
        }

        private Token(int r1, Consumer<T> r2) {
            this.f8317id = r1;
            this.setter = r2;
        }
    }

    public LuaInstances() {
        this.instances = new ArrayList();
        this.freeEntries = 0;
        this.lastFreeId = -1;
    }

    public static /* synthetic */ void access$000(LuaInstances r0, int r1, Object r2) {
        r0.set(r1, r2);
    }

    private synchronized void set(int r2, T r3) {
        monitor-enter(this);
        this.instances.set(r2, r3);     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    public synchronized int add(T r1) {
        monitor-enter(this);
        int r12 = addNullable(r1);     // Catch: Throwable -> L6
        monitor-exit(this);
        return r12;
    L6:
        th = move-exception;
        throw th;
    }

    public synchronized int addNullable(T r3) {
        monitor-enter(this);
        int r0 = this.lastFreeId;     // Catch: Throwable -> L6
        if (r0 != (-1)) goto L8;
        r0 = this.instances.size();     // Catch: Throwable -> L6
        this.instances.add(r3);     // Catch: Throwable -> L6
    L9:
        monitor-exit(this);
        return r0;
    L8:
        Object r1 = this.instances.get(r0);     // Catch: Throwable -> L6
        Objects.requireNonNull(r1);     // Catch: Throwable -> L6
        this.lastFreeId = ((Integer) r1).intValue();     // Catch: Throwable -> L6
        this.instances.set(r0, r3);     // Catch: Throwable -> L6
        this.freeEntries--;
    L6:
        th = move-exception;
        throw th;
    }

    public synchronized T get(int r2) {
        monitor-enter(this);
        T r22 = (T) this.instances.get(r2);
        Objects.requireNonNull(r22);     // Catch: Throwable -> L6
        monitor-exit(this);
        return r22;
    L6:
        th = move-exception;
        throw th;
    }

    public synchronized void remove(int r3) {
        monitor-enter(this);
    L6:
        th = move-exception;
        throw th;
    L4:
        if (r3 != (this.instances.size() - 1)) goto L8;
        this.instances.remove(r3);     // Catch: Throwable -> L6
    L9:
        monitor-exit(this);
        return;
    L8:
        this.instances.set(r3, Integer.valueOf(this.lastFreeId));     // Catch: Throwable -> L6
        this.lastFreeId = r3;     // Catch: Throwable -> L6
        this.freeEntries++;
        goto L9
    }

    public synchronized int size() {
        monitor-enter(this);
        int r0 = this.instances.size() - this.freeEntries;
        monitor-exit(this);
        return r0;
    L7:
        th = move-exception;
        throw th;
    }

    public synchronized Token<T> add() {
        monitor-enter(this);
        C23641 r0 = null;
        final int r1 = addNullable(null);     // Catch: Throwable -> L7
        Token<T> r2 = new Token(r1, new C23641(this, r1), r0);     // Catch: Throwable -> L7
        monitor-exit(this);
        return r2;
    L7:
        th = move-exception;
        throw th;
    }
}
