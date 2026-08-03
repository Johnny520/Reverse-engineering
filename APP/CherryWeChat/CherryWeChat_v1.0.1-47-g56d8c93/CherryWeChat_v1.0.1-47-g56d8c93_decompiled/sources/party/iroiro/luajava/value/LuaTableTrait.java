package party.iroiro.luajava.value;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface LuaTableTrait extends Map<LuaValue, LuaValue> {
    LuaValue get(int i);

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Map
    LuaValue get(Object obj);

    LuaValue get(String str);

    LuaValue get(LuaValue luaValue);

    int length();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Map
    LuaValue put(LuaValue luaValue, LuaValue luaValue2);

    LuaValue set(int i, Object obj);

    LuaValue set(Object obj, Object obj2);

    @Override // java.util.Map
    int size();
}
