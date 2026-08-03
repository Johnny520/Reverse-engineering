package party.iroiro.luajava.cleaner;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import party.iroiro.luajava.cleaner.LuaReferable;

/* JADX INFO: loaded from: classes.dex */
public class LuaReference<T extends LuaReferable> extends PhantomReference<T> {
    private final int ref;

    public LuaReference(T t, ReferenceQueue<? super T> referenceQueue) {
        super(t, referenceQueue);
        this.ref = t.getReference();
    }

    public int getReference() {
        return this.ref;
    }
}
