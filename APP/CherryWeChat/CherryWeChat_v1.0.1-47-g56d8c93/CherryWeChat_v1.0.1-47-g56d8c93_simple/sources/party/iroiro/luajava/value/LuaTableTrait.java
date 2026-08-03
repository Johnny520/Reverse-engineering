package party.iroiro.luajava.value;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface LuaTableTrait extends Map<LuaValue, LuaValue> {
    @Override // java.util.Map
    /* bridge */ /* synthetic */ default LuaValue get(Object r1) {
        return get(r1);
    }

    LuaValue get(int r1);

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Map, party.iroiro.luajava.value.LuaTableTrait
    LuaValue get(Object r1);

    LuaValue get(String r1);

    LuaValue get(LuaValue r1);

    int length();

    @Override // java.util.Map
    /* bridge */ /* synthetic */ default LuaValue put(LuaValue r1, LuaValue r2) {
        return put(r1, r2);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    LuaValue put(LuaValue r1, LuaValue r2);

    LuaValue set(int r1, Object r2);

    LuaValue set(Object r1, Object r2);

    @Override // java.util.Map
    int size();
}
