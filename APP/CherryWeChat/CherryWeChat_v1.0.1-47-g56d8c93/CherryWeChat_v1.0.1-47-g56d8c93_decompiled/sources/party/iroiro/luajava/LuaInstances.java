package party.iroiro.luajava;

import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class LuaInstances<T> {
    private final ArrayList<Object> instances = new ArrayList<>();
    private int freeEntries = 0;
    private int lastFreeId = -1;

    public static class Token<T> {

        /* JADX INFO: renamed from: id */
        public final int f8317id;
        public final Consumer<T> setter;

        public interface Consumer<T> {
            void accept(T t);
        }

        private Token(int i, Consumer<T> consumer) {
            this.f8317id = i;
            this.setter = consumer;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void set(int i, T t) {
        this.instances.set(i, t);
    }

    public synchronized int add(T t) {
        return addNullable(t);
    }

    public synchronized int addNullable(T t) {
        int size;
        try {
            size = this.lastFreeId;
            if (size == -1) {
                size = this.instances.size();
                this.instances.add(t);
            } else {
                Object obj = this.instances.get(size);
                Objects.requireNonNull(obj);
                this.lastFreeId = ((Integer) obj).intValue();
                this.instances.set(size, t);
                this.freeEntries--;
            }
        } catch (Throwable th) {
            throw th;
        }
        return size;
    }

    public synchronized T get(int i) {
        T t;
        t = (T) this.instances.get(i);
        Objects.requireNonNull(t);
        return t;
    }

    public synchronized void remove(int i) {
        try {
            if (i == this.instances.size() - 1) {
                this.instances.remove(i);
            } else {
                this.instances.set(i, Integer.valueOf(this.lastFreeId));
                this.lastFreeId = i;
                this.freeEntries++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized int size() {
        return this.instances.size() - this.freeEntries;
    }

    public synchronized Token<T> add() {
        final int iAddNullable;
        iAddNullable = addNullable(null);
        return new Token<>(iAddNullable, new Token.Consumer<T>() { // from class: party.iroiro.luajava.LuaInstances.1
            @Override // party.iroiro.luajava.LuaInstances.Token.Consumer
            public void accept(T t) {
                LuaInstances.this.set(iAddNullable, t);
            }
        });
    }
}
