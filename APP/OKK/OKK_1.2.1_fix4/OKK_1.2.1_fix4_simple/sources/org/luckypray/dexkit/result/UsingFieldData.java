package org.luckypray.dexkit.result;

import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.result.FieldData;
import org.luckypray.dexkit.schema.FieldMeta;
import org.luckypray.dexkit.schema.UsingFieldMeta;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: loaded from: classes.dex */
public final class UsingFieldData {

    /* JADX INFO: renamed from: -Companion */
    public static final Companion f4422Companion = null;
    private final FieldData field;
    private final FieldUsingType usingType;

    /* JADX INFO: renamed from: org.luckypray.dexkit.result.UsingFieldData$-Companion */
    public static final class Companion {
        private Companion() {
        }

        public final UsingFieldData from(DexKitBridge r3, UsingFieldMeta r4) {
            AbstractC0307g.m703e(r3, "bridge");
            AbstractC0307g.m703e(r4, "usingFieldMeta");
            FieldData.Companion r02 = FieldData.f4420Companion;
            FieldMeta r1 = r4.getField();
            AbstractC0307g.m700b(r1);
            FieldData r32 = r02.from(r3, r1);
            byte r03 = r4.getUsingType();
            if (r03 != 1) goto L6;
            FieldUsingType r42 = FieldUsingType.Read;
        L9:
            return new UsingFieldData(r32, r42);
        L6:
            if (r03 != 2) goto L11;
            r42 = FieldUsingType.Write;
            goto L9
        L11:
            throw new IllegalArgumentException(AbstractC0324d.m720c("Unknown using type: ", r4.getUsingType()));
        }

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }
    }

    static {
        f4422Companion = new Companion(null);
    }

    public UsingFieldData(FieldData r2, FieldUsingType r3) {
        AbstractC0307g.m703e(r2, "field");
        AbstractC0307g.m703e(r3, "usingType");
        this.field = r2;
        this.usingType = r3;
    }

    public static /* synthetic */ UsingFieldData copy$default(UsingFieldData r02, FieldData r1, FieldUsingType r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r02.field;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r02.usingType;
    L9:
        return r02.copy(r1, r2);
    }

    public final FieldData component1() {
        return this.field;
    }

    public final FieldUsingType component2() {
        return this.usingType;
    }

    public final UsingFieldData copy(FieldData r2, FieldUsingType r3) {
        AbstractC0307g.m703e(r2, "field");
        AbstractC0307g.m703e(r3, "usingType");
        return new UsingFieldData(r2, r3);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof UsingFieldData) == true) goto L8;
        return false;
    L8:
        UsingFieldData r52 = (UsingFieldData) r5;
        if (AbstractC0307g.m699a(this.field, r52.field) == true) goto L12;
        return false;
    L12:
        if (this.usingType == r52.usingType) goto L14;
        return false;
    L14:
        return true;
    }

    public final FieldData getField() {
        return this.field;
    }

    public final FieldUsingType getUsingType() {
        return this.usingType;
    }

    public int hashCode() {
        int r02 = this.field.hashCode() * 31;
        return this.usingType.hashCode() + r02;
    }

    public String toString() {
        return "UsingFieldData(field=" + this.field + ", usingType=" + this.usingType + ")";
    }
}
