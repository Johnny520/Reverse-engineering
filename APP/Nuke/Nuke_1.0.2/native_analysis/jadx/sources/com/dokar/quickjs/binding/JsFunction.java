package com.dokar.quickjs.binding;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class JsFunction {
    private final boolean isAsync;
    private final String name;

    public JsFunction(String str, boolean z) {
        str.getClass();
        this.name = str;
        this.isAsync = z;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean isAsync() {
        return this.isAsync;
    }
}
