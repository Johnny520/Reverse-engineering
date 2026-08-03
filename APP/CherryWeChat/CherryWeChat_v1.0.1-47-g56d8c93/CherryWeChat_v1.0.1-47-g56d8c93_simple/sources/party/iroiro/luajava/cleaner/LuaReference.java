package party.iroiro.luajava.cleaner;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import party.iroiro.luajava.cleaner.LuaReferable;

/* JADX INFO: loaded from: classes.dex */
public class LuaReference<T extends LuaReferable> extends PhantomReference<T> {
    private final int ref;

    public LuaReference(T r1, ReferenceQueue<? super T> r2) {
        super(r1, r2);
        this.ref = r1.getReference();
    }

    public int getReference() {
        return this.ref;
    }
}
