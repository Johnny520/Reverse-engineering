package party.iroiro.luajava.value;

import java.nio.ByteBuffer;
import party.iroiro.luajava.Lua;

/* JADX INFO: loaded from: classes.dex */
public interface LuaValue extends LuaTableTrait {
    LuaValue[] call(Object... r1);

    void push(Lua r1);

    Lua state();

    boolean toBoolean();

    ByteBuffer toBuffer();

    long toInteger();

    Object toJavaObject();

    double toNumber();

    <T> T toProxy(Class<T> r1);

    Object toProxy(Class<?>[] r1, Lua.Conversion r2);

    String toString();

    Lua.LuaType type();
}
