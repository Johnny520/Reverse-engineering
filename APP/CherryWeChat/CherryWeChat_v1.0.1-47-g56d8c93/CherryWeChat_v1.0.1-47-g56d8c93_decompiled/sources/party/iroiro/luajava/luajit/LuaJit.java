package party.iroiro.luajava.luajit;

import java.util.concurrent.atomic.AtomicReference;
import party.iroiro.luajava.AbstractLua;
import party.iroiro.luajava.Lua;
import party.iroiro.luajava.LuaException;
import party.iroiro.luajava.LuaNatives;

/* JADX INFO: loaded from: classes.dex */
public class LuaJit extends AbstractLua {
    private static final AtomicReference<LuaJitNatives> natives = new AtomicReference<>();

    public LuaJit() {
        super(getNatives());
    }

    private static LuaNatives getNatives() {
        LuaJitNatives luaJitNatives;
        AtomicReference<LuaJitNatives> atomicReference = natives;
        synchronized (atomicReference) {
            if (atomicReference.get() == null) {
                try {
                    atomicReference.set(new LuaJitNatives());
                } catch (IllegalStateException e) {
                    throw new LinkageError("Unable to find natives or init", e);
                }
            }
            luaJitNatives = atomicReference.get();
        }
        return luaJitNatives;
    }

    @Override // party.iroiro.luajava.AbstractLua
    public LuaException.LuaError convertError(int i) {
        if (i == 0) {
            return LuaException.LuaError.OK;
        }
        if (i == 1) {
            return LuaException.LuaError.YIELD;
        }
        if (i == 2) {
            return LuaException.LuaError.RUNTIME;
        }
        if (i == 3) {
            return LuaException.LuaError.SYNTAX;
        }
        if (i == 4) {
            return LuaException.LuaError.MEMORY;
        }
        if (i == 5) {
            return LuaException.LuaError.HANDLER;
        }
        throw new LuaException(LuaException.LuaError.RUNTIME, "Unrecognized error code");
    }

    @Override // party.iroiro.luajava.AbstractLua
    public Lua.LuaType convertType(int i) {
        switch (i) {
            case -1:
                return Lua.LuaType.NONE;
            case 0:
                return Lua.LuaType.NIL;
            case 1:
                return Lua.LuaType.BOOLEAN;
            case 2:
                return Lua.LuaType.LIGHTUSERDATA;
            case 3:
                return Lua.LuaType.NUMBER;
            case 4:
                return Lua.LuaType.STRING;
            case 5:
                return Lua.LuaType.TABLE;
            case 6:
                return Lua.LuaType.FUNCTION;
            case 7:
                return Lua.LuaType.USERDATA;
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                return Lua.LuaType.THREAD;
            default:
                throw new LuaException(LuaException.LuaError.RUNTIME, "Unrecognized type code");
        }
    }

    @Override // party.iroiro.luajava.AbstractLua
    public AbstractLua newThread(long j, int i, AbstractLua abstractLua) {
        return new LuaJit(j, i, abstractLua);
    }

    public LuaJit(long j, int i, AbstractLua abstractLua) {
        super(abstractLua.getLuaNatives(), j, i, abstractLua);
    }
}
