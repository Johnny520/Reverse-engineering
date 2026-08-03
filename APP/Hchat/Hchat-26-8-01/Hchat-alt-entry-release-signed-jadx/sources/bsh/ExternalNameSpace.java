package bsh;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ExternalNameSpace extends NameSpace {
    private Map<String, Object> externalMap;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ExternalNameSpace(NameSpace nameSpace, String str, Map<String, Object> map) {
        super(nameSpace, str);
        this.externalMap = map == null ? new HashMap<>() : map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String[] lambda$getVariableNames$0(int i9) {
        return new String[i9];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.NameSpace
    public void clear() {
        super.clear();
        this.externalMap.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.NameSpace
    public Variable createVariable(String str, Class cls, Object obj, Modifiers modifiers) {
        LHS lhs = new LHS(this.externalMap, str);
        try {
            lhs.assign(obj, false);
            return new Variable(str, (Class<?>) cls, lhs);
        } catch (UtilEvalError e6) {
            throw new InterpreterError(e6.toString());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Map<String, Object> getMap() {
        return this.externalMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.NameSpace
    public Variable getVariableImpl(String str, boolean z9) {
        Object obj = this.externalMap.get(str);
        if (obj == null && this.externalMap.containsKey(str)) {
            obj = Primitive.NULL;
        }
        if (obj == null) {
            super.unsetVariable(str);
            return super.getVariableImpl(str, z9);
        }
        Variable variableImpl = super.getVariableImpl(str, false);
        return variableImpl == null ? createVariable(str, null, obj, null) : variableImpl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.NameSpace
    public String[] getVariableNames() {
        return (String[]) Stream.concat(Stream.of((Object[]) super.getVariableNames()), this.externalMap.keySet().stream()).toArray(new C0348e(2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setMap(Map<String, Object> map) {
        clear();
        this.externalMap = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.NameSpace
    public void unsetVariable(String str) {
        super.unsetVariable(str);
        this.externalMap.remove(str);
    }

    public ExternalNameSpace() {
        this(null, "External Map Namespace", null);
    }
}
