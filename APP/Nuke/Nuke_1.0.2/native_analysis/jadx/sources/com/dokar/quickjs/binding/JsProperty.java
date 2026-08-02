package com.dokar.quickjs.binding;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class JsProperty {
    private final boolean configurable;
    private final boolean enumerable;
    private final String name;
    private final boolean writable;

    public JsProperty(String str, boolean z, boolean z2, boolean z3) {
        str.getClass();
        this.name = str;
        this.configurable = z;
        this.writable = z2;
        this.enumerable = z3;
    }

    public final boolean getConfigurable() {
        return this.configurable;
    }

    public final boolean getEnumerable() {
        return this.enumerable;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getWritable() {
        return this.writable;
    }
}
