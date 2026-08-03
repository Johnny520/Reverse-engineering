package com.alibaba.fastjson2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class JSONValidator {
    private final JSONReader jsonReader;
    private Type type;
    private Boolean validateResult;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public enum Type {
        Object,
        Array,
        Value
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public JSONValidator(JSONReader jSONReader) {
        this.jsonReader = jSONReader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static JSONValidator from(String str) {
        return new JSONValidator(JSONReader.m1666of(str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static JSONValidator fromUtf8(byte[] bArr) {
        return new JSONValidator(JSONReader.m1673of(bArr));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Type getType() {
        if (this.type == null) {
            validate();
        }
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean validate() {
        Boolean bool = this.validateResult;
        try {
            if (bool != null) {
                return bool.booleanValue();
            }
            try {
                char cCurrent = this.jsonReader.current();
                this.jsonReader.skipValue();
                this.jsonReader.close();
                if (cCurrent == '{') {
                    this.type = Type.Object;
                } else if (cCurrent == '[') {
                    this.type = Type.Array;
                } else {
                    this.type = Type.Value;
                }
                boolean zIsEnd = this.jsonReader.isEnd();
                this.validateResult = Boolean.valueOf(zIsEnd);
                return zIsEnd;
            } catch (JSONException | ArrayIndexOutOfBoundsException unused) {
                this.validateResult = Boolean.FALSE;
                this.jsonReader.close();
                return false;
            }
        } catch (Throwable th2) {
            this.jsonReader.close();
            throw th2;
        }
    }

    public static JSONValidator from(JSONReader jSONReader) {
        return new JSONValidator(jSONReader);
    }
}
