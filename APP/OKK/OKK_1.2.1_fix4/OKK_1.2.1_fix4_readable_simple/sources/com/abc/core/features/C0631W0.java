package com.abc.core.features;

import java.lang.reflect.Field;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: c0.W0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0631W0 extends AbstractC0635Y0 {

    /* JADX INFO: renamed from: a */
    public final Field f1943a;

    public C0631W0(Field r1) {
        this.f1943a = r1;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof C0631W0) == true) goto L9;
        return false;
    L9:
        if (AbstractC0307g.m699a(this.f1943a, ((C0631W0) r4).f1943a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        return this.f1943a.hashCode();
    }

    public final String toString() {
        return "FieldValue(field=" + this.f1943a + ")";
    }
}
