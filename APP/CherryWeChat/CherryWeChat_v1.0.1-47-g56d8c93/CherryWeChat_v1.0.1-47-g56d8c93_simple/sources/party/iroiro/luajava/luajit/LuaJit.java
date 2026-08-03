package party.iroiro.luajava.luajit;

import java.util.concurrent.atomic.AtomicReference;
import party.iroiro.luajava.AbstractLua;
import party.iroiro.luajava.Lua;
import party.iroiro.luajava.LuaException;
import party.iroiro.luajava.LuaNatives;

/* JADX INFO: loaded from: classes.dex */
public class LuaJit extends AbstractLua {
    private static final AtomicReference<LuaJitNatives> natives = null;

    static {
        natives = new AtomicReference();
    }

    public LuaJit() {
        super(getNatives());
    }

    private static LuaNatives getNatives() {
        AtomicReference<LuaJitNatives> r0 = natives;
        monitor-enter(r0);
    L8:
        th = move-exception;
        throw th;
    L5:
        if (r0.get() == null) goto L19;
    L13:
        LuaJitNatives r1 = r0.get();     // Catch: Throwable -> L8
        monitor-exit(r0);     // Catch: Throwable -> L8
        return r1;
    L19:
        r0.set(new LuaJitNatives());     // Catch: Throwable -> L8 IllegalStateException -> L10
    L10:
        e = move-exception;
        throw new LinkageError("Unable to find natives or init", e);     // Catch: Throwable -> L8
    }

    @Override // party.iroiro.luajava.AbstractLua
    public LuaException.LuaError convertError(int r3) {
        if (r3 == 0) goto L26;
        if (r3 == 1) goto L24;
        if (r3 == 2) goto L22;
        if (r3 == 3) goto L20;
        if (r3 == 4) goto L18;
        if (r3 != 5) goto L16;
        return LuaException.LuaError.HANDLER;
    L16:
        throw new LuaException(LuaException.LuaError.RUNTIME, "Unrecognized error code");
    L18:
        return LuaException.LuaError.MEMORY;
    L20:
        return LuaException.LuaError.SYNTAX;
    L22:
        return LuaException.LuaError.RUNTIME;
    L24:
        return LuaException.LuaError.YIELD;
    L26:
        return LuaException.LuaError.f8316OK;
    }

    @Override // party.iroiro.luajava.AbstractLua
    public Lua.LuaType convertType(int r3) {
        switch(r3) {
            case -1: goto L24;
            case 0: goto L22;
            case 1: goto L20;
            case 2: goto L18;
            case 3: goto L16;
            case 4: goto L14;
            case 5: goto L12;
            case 6: goto L10;
            case 7: goto L8;
            case 8: goto L6;
            default: goto L4;
        };
    L4:
        throw new LuaException(LuaException.LuaError.RUNTIME, "Unrecognized type code");
    L6:
        return Lua.LuaType.THREAD;
    L8:
        return Lua.LuaType.USERDATA;
    L10:
        return Lua.LuaType.FUNCTION;
    L12:
        return Lua.LuaType.TABLE;
    L14:
        return Lua.LuaType.STRING;
    L16:
        return Lua.LuaType.NUMBER;
    L18:
        return Lua.LuaType.LIGHTUSERDATA;
    L20:
        return Lua.LuaType.BOOLEAN;
    L22:
        return Lua.LuaType.NIL;
    L24:
        return Lua.LuaType.NONE;
    }

    @Override // party.iroiro.luajava.AbstractLua
    public AbstractLua newThread(long r2, int r4, AbstractLua r5) {
        return new LuaJit(r2, r4, r5);
    }

    public LuaJit(long r7, int r9, AbstractLua r10) {
        super(r10.getLuaNatives(), r7, r9, r10);
    }
}
