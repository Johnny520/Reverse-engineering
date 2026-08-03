package party.iroiro.luajava.value;

import java.nio.ByteBuffer;
import party.iroiro.luajava.Lua;

/* JADX INFO: loaded from: classes.dex */
public interface LuaValue extends LuaTableTrait {
    LuaValue[] call(Object... objArr);

    void push(Lua lua);

    Lua state();

    boolean toBoolean();

    ByteBuffer toBuffer();

    long toInteger();

    Object toJavaObject();

    double toNumber();

    <T> T toProxy(Class<T> cls);

    Object toProxy(Class<?>[] clsArr, Lua.Conversion conversion);

    String toString();

    Lua.LuaType type();
}
