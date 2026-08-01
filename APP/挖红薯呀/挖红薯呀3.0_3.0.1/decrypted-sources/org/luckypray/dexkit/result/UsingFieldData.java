package org.luckypray.dexkit.result;

import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.result.FieldData;
import org.luckypray.dexkit.schema.FieldMeta;
import org.luckypray.dexkit.schema.UsingFieldMeta;
import p000.AbstractC0619pl;
import p000.AbstractC0748t1;
import p000.C0921xc;
import p000.p30;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class UsingFieldData {

    /* JADX INFO: renamed from: -Companion, reason: not valid java name */
    public static final Companion f8071Companion = new Companion(null);
    private final FieldData field;
    private final FieldUsingType usingType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public UsingFieldData(FieldData fieldData, FieldUsingType fieldUsingType) {
        fieldData.getClass();
        fieldUsingType.getClass();
        this.field = fieldData;
        this.usingType = fieldUsingType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ UsingFieldData copy$default(UsingFieldData usingFieldData, FieldData fieldData, FieldUsingType fieldUsingType, int i, Object obj) {
        if ((i & 1) != 0) {
            fieldData = usingFieldData.field;
        }
        if ((i & 2) != 0) {
            fieldUsingType = usingFieldData.usingType;
        }
        return usingFieldData.copy(fieldData, fieldUsingType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FieldData component1() {
        return this.field;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FieldUsingType component2() {
        return this.usingType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final UsingFieldData copy(FieldData fieldData, FieldUsingType fieldUsingType) {
        fieldData.getClass();
        fieldUsingType.getClass();
        return new UsingFieldData(fieldData, fieldUsingType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsingFieldData)) {
            return false;
        }
        UsingFieldData usingFieldData = (UsingFieldData) obj;
        return p30.m3002l(this.field, usingFieldData.field) && this.usingType == usingFieldData.usingType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FieldData getField() {
        return this.field;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FieldUsingType getUsingType() {
        return this.usingType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return this.usingType.hashCode() + (this.field.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return "UsingFieldData(field=" + this.field + ", usingType=" + this.usingType + ")";
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.result.UsingFieldData$-Companion, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.result.UsingFieldData.-Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0619pl abstractC0619pl) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final UsingFieldData from(DexKitBridge dexKitBridge, UsingFieldMeta usingFieldMeta) {
            FieldUsingType fieldUsingType;
            dexKitBridge.getClass();
            usingFieldMeta.getClass();
            FieldData.Companion companion = FieldData.f8069Companion;
            FieldMeta field = usingFieldMeta.getField();
            field.getClass();
            FieldData fieldDataFrom = companion.from(dexKitBridge, field);
            byte usingType = usingFieldMeta.getUsingType();
            if (usingType == 1) {
                fieldUsingType = FieldUsingType.Read;
            } else {
                if (usingType != 2) {
                    C0921xc.m5131l(AbstractC0748t1.m4154l("Unknown using type: ", usingFieldMeta.getUsingType()));
                    return null;
                }
                fieldUsingType = FieldUsingType.Write;
            }
            return new UsingFieldData(fieldDataFrom, fieldUsingType);
        }

        private Companion() {
        }
    }
}
