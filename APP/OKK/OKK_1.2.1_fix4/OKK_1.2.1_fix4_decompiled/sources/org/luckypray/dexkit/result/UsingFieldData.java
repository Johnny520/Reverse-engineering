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

    /* JADX INFO: renamed from: -Companion, reason: not valid java name */
    public static final Companion f4422Companion = new Companion(null);
    private final FieldData field;
    private final FieldUsingType usingType;

    /* JADX INFO: renamed from: org.luckypray.dexkit.result.UsingFieldData$-Companion, reason: invalid class name */
    public static final class Companion {
        private Companion() {
        }

        public final UsingFieldData from(DexKitBridge dexKitBridge, UsingFieldMeta usingFieldMeta) {
            FieldUsingType fieldUsingType;
            AbstractC0307g.m703e(dexKitBridge, "bridge");
            AbstractC0307g.m703e(usingFieldMeta, "usingFieldMeta");
            FieldData.Companion companion = FieldData.f4420Companion;
            FieldMeta field = usingFieldMeta.getField();
            AbstractC0307g.m700b(field);
            FieldData fieldDataFrom = companion.from(dexKitBridge, field);
            byte usingType = usingFieldMeta.getUsingType();
            if (usingType == 1) {
                fieldUsingType = FieldUsingType.Read;
            } else {
                if (usingType != 2) {
                    throw new IllegalArgumentException(AbstractC0324d.m720c("Unknown using type: ", usingFieldMeta.getUsingType()));
                }
                fieldUsingType = FieldUsingType.Write;
            }
            return new UsingFieldData(fieldDataFrom, fieldUsingType);
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }
    }

    public UsingFieldData(FieldData fieldData, FieldUsingType fieldUsingType) {
        AbstractC0307g.m703e(fieldData, "field");
        AbstractC0307g.m703e(fieldUsingType, "usingType");
        this.field = fieldData;
        this.usingType = fieldUsingType;
    }

    public static /* synthetic */ UsingFieldData copy$default(UsingFieldData usingFieldData, FieldData fieldData, FieldUsingType fieldUsingType, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            fieldData = usingFieldData.field;
        }
        if ((i2 & 2) != 0) {
            fieldUsingType = usingFieldData.usingType;
        }
        return usingFieldData.copy(fieldData, fieldUsingType);
    }

    public final FieldData component1() {
        return this.field;
    }

    public final FieldUsingType component2() {
        return this.usingType;
    }

    public final UsingFieldData copy(FieldData fieldData, FieldUsingType fieldUsingType) {
        AbstractC0307g.m703e(fieldData, "field");
        AbstractC0307g.m703e(fieldUsingType, "usingType");
        return new UsingFieldData(fieldData, fieldUsingType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsingFieldData)) {
            return false;
        }
        UsingFieldData usingFieldData = (UsingFieldData) obj;
        return AbstractC0307g.m699a(this.field, usingFieldData.field) && this.usingType == usingFieldData.usingType;
    }

    public final FieldData getField() {
        return this.field;
    }

    public final FieldUsingType getUsingType() {
        return this.usingType;
    }

    public int hashCode() {
        return this.usingType.hashCode() + (this.field.hashCode() * 31);
    }

    public String toString() {
        return "UsingFieldData(field=" + this.field + ", usingType=" + this.usingType + ")";
    }
}
