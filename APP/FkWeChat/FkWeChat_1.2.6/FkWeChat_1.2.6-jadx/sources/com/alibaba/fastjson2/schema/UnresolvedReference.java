package com.alibaba.fastjson2.schema;

import com.alibaba.fastjson2.schema.JSONSchema;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class UnresolvedReference extends JSONSchema {
    final String refName;

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class PropertyResolveTask extends ResolveTask {
        final String entryKey;
        final Map<String, JSONSchema> properties;
        final String refName;

        public PropertyResolveTask(Map<String, JSONSchema> map, String str, String str2) {
            this.properties = map;
            this.entryKey = str;
            this.refName = str2;
        }

        @Override // com.alibaba.fastjson2.schema.UnresolvedReference.ResolveTask
        public void resolve(JSONSchema jSONSchema) {
            JSONSchema jSONSchema2;
            Map<String, JSONSchema> map = jSONSchema instanceof ObjectSchema ? ((ObjectSchema) jSONSchema).defs : jSONSchema instanceof ArraySchema ? ((ArraySchema) jSONSchema).defs : null;
            if (map == null || (jSONSchema2 = map.get(this.refName)) == null) {
                return;
            }
            this.properties.put(this.entryKey, jSONSchema2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static abstract class ResolveTask {
        public abstract void resolve(JSONSchema jSONSchema);
    }

    public UnresolvedReference(String str) {
        super(null, null);
        this.refName = str;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public JSONSchema.Type getType() {
        return JSONSchema.Type.UnresolvedReference;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public ValidateResult validateInternal(Object obj) {
        return JSONSchema.SUCCESS;
    }
}
