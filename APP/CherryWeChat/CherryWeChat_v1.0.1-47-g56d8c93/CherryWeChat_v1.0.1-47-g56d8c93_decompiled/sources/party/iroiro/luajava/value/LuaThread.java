package party.iroiro.luajava.value;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface LuaThread {
    LuaValue[] eval(String str);

    LuaValue from(double d);

    LuaValue from(long j);

    LuaValue from(String str);

    LuaValue from(ByteBuffer byteBuffer);

    LuaValue from(boolean z);

    LuaValue fromNull();

    LuaValue get(String str);

    void register(String str, LuaFunction luaFunction);

    LuaValue require(String str);

    void set(String str, Object obj);
}
