package com.alibaba.fastjson2.schema;

import com.alibaba.fastjson2.AbstractC1843z;
import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class ArraySchema extends JSONSchema {
    final JSONSchema additionalItem;
    final boolean additionalItems;
    final AllOf allOf;
    final AnyOf anyOf;
    final JSONSchema contains;
    final Map<String, JSONSchema> definitions;
    final Map<String, JSONSchema> defs;
    final boolean encoded;
    JSONSchema itemSchema;
    final int maxContains;
    final int maxLength;
    final int minContains;
    final int minLength;
    final OneOf oneOf;
    final JSONSchema[] prefixItems;
    final boolean typed;
    final boolean uniqueItems;

    /* JADX WARN: Removed duplicated region for block: B:42:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ArraySchema(com.alibaba.fastjson2.JSONObject r10, com.alibaba.fastjson2.schema.JSONSchema r11) {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.schema.ArraySchema.<init>(com.alibaba.fastjson2.JSONObject, com.alibaba.fastjson2.schema.JSONSchema):void");
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Object m6413c(Object[] objArr, int i10) {
        return objArr[i10];
    }

    private ValidateResult validateItems(Object obj, int i10, IntFunction<Object> intFunction) {
        JSONSchema jSONSchema;
        int i11 = this.minLength;
        if (i11 >= 0 && i10 < i11) {
            return new ValidateResult(false, "minLength not match, expect >= %s, but %s", Integer.valueOf(i11), Integer.valueOf(i10));
        }
        int i12 = this.maxLength;
        if (i12 >= 0 && i10 > i12) {
            return new ValidateResult(false, "maxLength not match, expect <= %s, but %s", Integer.valueOf(i12), Integer.valueOf(i10));
        }
        if (!this.additionalItems) {
            JSONSchema[] jSONSchemaArr = this.prefixItems;
            if (i10 > jSONSchemaArr.length) {
                return new ValidateResult(false, "additional items not match, max size %s, but %s", Integer.valueOf(jSONSchemaArr.length), Integer.valueOf(i10));
            }
        }
        boolean z10 = obj instanceof Collection;
        HashSet hashSet = null;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object objApply = intFunction.apply(i14);
            JSONSchema[] jSONSchemaArr2 = this.prefixItems;
            if (i14 < jSONSchemaArr2.length) {
                ValidateResult validateResultValidate = jSONSchemaArr2[i14].validate(objApply);
                if (!validateResultValidate.isSuccess()) {
                    return validateResultValidate;
                }
            } else {
                if (z10 && this.itemSchema == null && (jSONSchema = this.additionalItem) != null) {
                    ValidateResult validateResultValidate2 = jSONSchema.validate(objApply);
                    if (!validateResultValidate2.isSuccess()) {
                        return validateResultValidate2;
                    }
                }
                JSONSchema jSONSchema2 = this.itemSchema;
                if (jSONSchema2 != null) {
                    ValidateResult validateResultValidate3 = jSONSchema2.validate(objApply);
                    if (!validateResultValidate3.isSuccess()) {
                        return validateResultValidate3;
                    }
                }
            }
            JSONSchema jSONSchema3 = this.contains;
            if (jSONSchema3 != null && ((this.minContains > 0 || this.maxContains > 0 || i13 == 0) && jSONSchema3.validate(objApply) == JSONSchema.SUCCESS)) {
                i13++;
            }
            if (this.uniqueItems) {
                if (hashSet == null) {
                    hashSet = new HashSet(i10, 1.0f);
                }
                if (objApply instanceof BigDecimal) {
                    objApply = AbstractC1843z.m6535a((BigDecimal) objApply);
                }
                if (!hashSet.add(objApply)) {
                    return JSONSchema.UNIQUE_ITEMS_NOT_MATCH;
                }
            }
        }
        if (!z10 || this.contains != null) {
            int i15 = this.minContains;
            if (i15 >= 0 && i13 < i15) {
                return new ValidateResult(false, "minContains not match, expect %s, but %s", Integer.valueOf(i15), Integer.valueOf(i13));
            }
            if (z10) {
                if (i13 == 0 && i15 != 0) {
                    return JSONSchema.CONTAINS_NOT_MATCH;
                }
            } else if (this.contains != null && i13 == 0) {
                return JSONSchema.CONTAINS_NOT_MATCH;
            }
            int i16 = this.maxContains;
            if (i16 >= 0 && i13 > i16) {
                return new ValidateResult(false, "maxContains not match, expect %s, but %s", Integer.valueOf(i16), Integer.valueOf(i13));
            }
        }
        AllOf allOf = this.allOf;
        if (allOf != null) {
            ValidateResult validateResultValidate4 = allOf.validate(obj);
            if (!validateResultValidate4.isSuccess()) {
                return validateResultValidate4;
            }
        }
        AnyOf anyOf = this.anyOf;
        if (anyOf != null) {
            ValidateResult validateResultValidate5 = anyOf.validate(obj);
            if (!validateResultValidate5.isSuccess()) {
                return validateResultValidate5;
            }
        }
        OneOf oneOf = this.oneOf;
        if (oneOf != null) {
            ValidateResult validateResultValidate6 = oneOf.validate(obj);
            if (!validateResultValidate6.isSuccess()) {
                return validateResultValidate6;
            }
        }
        return JSONSchema.SUCCESS;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public void accept(Predicate<JSONSchema> predicate) {
        JSONSchema jSONSchema;
        if (!predicate.test(this) || (jSONSchema = this.itemSchema) == null) {
            return;
        }
        jSONSchema.accept(predicate);
    }

    public JSONSchema getItemSchema() {
        return this.itemSchema;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public JSONSchema.Type getType() {
        return JSONSchema.Type.Array;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "array");
        int i10 = this.maxLength;
        if (i10 != -1) {
            jSONObject.put("maxLength", Integer.valueOf(i10));
        }
        int i11 = this.minLength;
        if (i11 != -1) {
            jSONObject.put("minLength", Integer.valueOf(i11));
        }
        JSONSchema jSONSchema = this.itemSchema;
        if (jSONSchema != null) {
            jSONObject.put("items", jSONSchema);
        }
        JSONSchema[] jSONSchemaArr = this.prefixItems;
        if (jSONSchemaArr != null && jSONSchemaArr.length != 0) {
            jSONObject.put("prefixItems", jSONSchemaArr);
        }
        boolean z10 = this.additionalItems;
        if (!z10) {
            jSONObject.put("additionalItems", Boolean.valueOf(z10));
        }
        JSONSchema jSONSchema2 = this.additionalItem;
        if (jSONSchema2 != null) {
            jSONObject.put("additionalItem", jSONSchema2);
        }
        JSONSchema jSONSchema3 = this.contains;
        if (jSONSchema3 != null) {
            jSONObject.put("contains", jSONSchema3);
        }
        int i12 = this.minContains;
        if (i12 != -1) {
            jSONObject.put("minContains", Integer.valueOf(i12));
        }
        int i13 = this.maxContains;
        if (i13 != -1) {
            jSONObject.put("maxContains", Integer.valueOf(i13));
        }
        boolean z11 = this.uniqueItems;
        if (z11) {
            jSONObject.put("uniqueItems", Boolean.valueOf(z11));
        }
        return JSONSchema.injectIfPresent(jSONObject, this.allOf, this.anyOf, this.oneOf);
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public ValidateResult validateInternal(final Object obj) {
        if (obj == null) {
            return this.typed ? JSONSchema.FAIL_INPUT_NULL : JSONSchema.SUCCESS;
        }
        if (this.encoded) {
            if (!(obj instanceof String)) {
                return JSONSchema.FAIL_INPUT_NOT_ENCODED;
            }
            try {
                obj = JSON.parseArray((String) obj);
            } catch (JSONException unused) {
                return JSONSchema.FAIL_INPUT_NOT_ENCODED;
            }
        }
        if (obj instanceof Object[]) {
            final Object[] objArr = (Object[]) obj;
            return validateItems(obj, objArr.length, new IntFunction() { // from class: com.alibaba.fastjson2.schema.a
                @Override // java.util.function.IntFunction
                public final Object apply(int i10) {
                    return ArraySchema.m6413c(objArr, i10);
                }
            });
        }
        if (obj.getClass().isArray()) {
            return validateItems(obj, Array.getLength(obj), new IntFunction() { // from class: com.alibaba.fastjson2.schema.b
                @Override // java.util.function.IntFunction
                public final Object apply(int i10) {
                    return Array.get(obj, i10);
                }
            });
        }
        if (!(obj instanceof Collection)) {
            return this.typed ? JSONSchema.FAIL_TYPE_NOT_MATCH : JSONSchema.SUCCESS;
        }
        Collection collection = (Collection) obj;
        final Iterator it = collection.iterator();
        return validateItems(obj, collection.size(), new IntFunction() { // from class: com.alibaba.fastjson2.schema.c
            @Override // java.util.function.IntFunction
            public final Object apply(int i10) {
                return it.next();
            }
        });
    }
}
