package androidx.constraintlayout.core.state;

import java.util.HashMap;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 androidx.constraintlayout.core.state.State$Chain, still in use, count: 1, list:
  (r0v0 androidx.constraintlayout.core.state.State$Chain) from 0x0044: INVOKE 
  (wrap:java.util.Map<java.lang.String, androidx.constraintlayout.core.state.State$Chain>:0x0040: SGET  A[WRAPPED] (LINE:65) androidx.constraintlayout.core.state.State$Chain.chainMap java.util.Map)
  ("spread")
  (r0v0 androidx.constraintlayout.core.state.State$Chain)
 INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)] (LINE:69)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class State$Chain {
    SPREAD,
    SPREAD_INSIDE,
    PACKED;

    public static Map<String, State$Chain> chainMap = new HashMap();
    public static Map<String, Integer> valueMap = new HashMap();

    static {
        chainMap.put("packed", new State$Chain());
        chainMap.put("spread_inside", new State$Chain());
        chainMap.put("spread", new State$Chain());
        valueMap.put("packed", 2);
        valueMap.put("spread_inside", 1);
        valueMap.put("spread", 0);
    }

    private State$Chain() {
    }

    public static State$Chain getChainByString(String str) {
        if (chainMap.containsKey(str)) {
            return chainMap.get(str);
        }
        return null;
    }

    public static int getValueByString(String str) {
        if (valueMap.containsKey(str)) {
            return valueMap.get(str).intValue();
        }
        return -1;
    }

    public static State$Chain valueOf(String str) {
        return (State$Chain) Enum.valueOf(State$Chain.class, str);
    }

    public static State$Chain[] values() {
        return (State$Chain[]) $VALUES.clone();
    }
}
