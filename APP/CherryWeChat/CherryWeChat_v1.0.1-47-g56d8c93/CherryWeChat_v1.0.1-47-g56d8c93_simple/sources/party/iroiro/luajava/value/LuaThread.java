package party.iroiro.luajava.value;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface LuaThread {
    LuaValue[] eval(String r1);

    LuaValue from(double r1);

    LuaValue from(long r1);

    LuaValue from(String r1);

    LuaValue from(ByteBuffer r1);

    LuaValue from(boolean r1);

    LuaValue fromNull();

    LuaValue get(String r1);

    void register(String r1, LuaFunction r2);

    LuaValue require(String r1);

    void set(String r1, Object r2);
}
