package party.iroiro.luajava.value;

import party.iroiro.luajava.Lua;
import party.iroiro.luajava.LuaException;
import party.iroiro.luajava.cleaner.LuaReferable;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRefLuaValue extends AbstractLuaValue<Lua> implements LuaReferable {
    private final int ref;

    public AbstractRefLuaValue(Lua r1, Lua.LuaType r2) {
        super(r1, r2);
        this.ref = r1.ref();
    }

    @Override // party.iroiro.luajava.value.AbstractLuaValue, party.iroiro.luajava.value.LuaValue
    public LuaValue[] call(Object... r8) {
        int r0 = this.f8319L.getTop();
        push(this.f8319L);
        int r1 = r8.length;
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L5;
        this.f8319L.push(r8[r3], Lua.Conversion.SEMI);
        r3 = r3 + 1;
        goto L3
    L5:
        this.f8319L.pCall(r8.length, -1);
        int r82 = this.f8319L.getTop() - r0;
        LuaValue[] r02 = new LuaValue[r82];
    L6:
        if (r2 >= r82) goto L8;
        r02[(r82 - r2) - 1] = this.f8319L.get();
        r2 = r2 + 1;
        goto L6
    L8:
        return r02;
    }

    @Override // party.iroiro.luajava.cleaner.LuaReferable
    public int getReference() {
        return this.ref;
    }

    @Override // party.iroiro.luajava.value.LuaValue
    public void push(Lua r3) {
        if (r3.getMainState() != this.f8319L.getMainState()) goto L7;
        r3.refGet(this.ref);
        return;
    L7:
        throw new LuaException(LuaException.LuaError.MEMORY, "Unable to pass Lua values between different Lua states");
    }

    @Override // party.iroiro.luajava.value.LuaValue
    public Object toJavaObject() {
        push(this.f8319L);
        Object r0 = this.f8319L.toObject(-1);
        this.f8319L.pop(1);
        return r0;
    }
}
