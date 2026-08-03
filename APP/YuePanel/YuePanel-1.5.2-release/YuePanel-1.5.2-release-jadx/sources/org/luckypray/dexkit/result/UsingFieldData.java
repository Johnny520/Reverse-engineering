package org.luckypray.dexkit.result;

import Yue.C4335;
import Yue.C5499;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.result.FieldData;
import org.luckypray.dexkit.schema.FieldMeta;
import org.luckypray.dexkit.schema.UsingFieldMeta;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6211(m2698d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m2699d2 = {"Lorg/luckypray/dexkit/result/UsingFieldData;", "", "field", "Lorg/luckypray/dexkit/result/FieldData;", "usingType", "Lorg/luckypray/dexkit/result/FieldUsingType;", "(Lorg/luckypray/dexkit/result/FieldData;Lorg/luckypray/dexkit/result/FieldUsingType;)V", "getField", "()Lorg/luckypray/dexkit/result/FieldData;", "getUsingType", "()Lorg/luckypray/dexkit/result/FieldUsingType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "-Companion", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
public final class UsingFieldData {

    /* JADX INFO: renamed from: -Companion, reason: not valid java name */
    @InterfaceC6399
    public static final Companion f30972Companion = new Companion(null);

    @InterfaceC6399
    private final FieldData field;

    @InterfaceC6399
    private final FieldUsingType usingType;

    /* JADX INFO: renamed from: org.luckypray.dexkit.result.UsingFieldData$-Companion, reason: invalid class name */
    @InterfaceC6211(m2698d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\bj\u0002`\t¨\u0006\n"}, m2699d2 = {"Lorg/luckypray/dexkit/result/UsingFieldData$-Companion;", "", "()V", "from", "Lorg/luckypray/dexkit/result/UsingFieldData;", "bridge", "Lorg/luckypray/dexkit/DexKitBridge;", "usingFieldMeta", "Lorg/luckypray/dexkit/schema/-UsingFieldMeta;", "Lorg/luckypray/dexkit/InnerUsingFieldMeta;", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.result.UsingFieldData.-Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        public final UsingFieldData from(@InterfaceC6399 DexKitBridge dexKitBridge, @InterfaceC6399 UsingFieldMeta usingFieldMeta) {
            FieldUsingType fieldUsingType;
            C5499.m17103(dexKitBridge, "bridge");
            C5499.m17103(usingFieldMeta, "usingFieldMeta");
            FieldData.Companion companion = FieldData.INSTANCE;
            FieldMeta field = usingFieldMeta.getField();
            C5499.m17100(field);
            FieldData fieldDataFrom = companion.from(dexKitBridge, field);
            byte usingType = usingFieldMeta.getUsingType();
            if (usingType == 1) {
                fieldUsingType = FieldUsingType.Read;
            } else {
                if (usingType != 2) {
                    throw new IllegalArgumentException("Unknown using type: " + ((int) usingFieldMeta.getUsingType()));
                }
                fieldUsingType = FieldUsingType.Write;
            }
            return new UsingFieldData(fieldDataFrom, fieldUsingType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    public UsingFieldData(@InterfaceC6399 FieldData fieldData, @InterfaceC6399 FieldUsingType fieldUsingType) {
        C5499.m17103(fieldData, "field");
        C5499.m17103(fieldUsingType, "usingType");
        this.field = fieldData;
        this.usingType = fieldUsingType;
    }

    public static /* synthetic */ UsingFieldData copy$default(UsingFieldData usingFieldData, FieldData fieldData, FieldUsingType fieldUsingType, int i, Object obj) {
        if ((i & 1) != 0) {
            fieldData = usingFieldData.field;
        }
        if ((i & 2) != 0) {
            fieldUsingType = usingFieldData.usingType;
        }
        return usingFieldData.copy(fieldData, fieldUsingType);
    }

    @InterfaceC6399
    public final FieldData component1() {
        return this.field;
    }

    @InterfaceC6399
    public final FieldUsingType component2() {
        return this.usingType;
    }

    @InterfaceC6399
    public final UsingFieldData copy(@InterfaceC6399 FieldData fieldData, @InterfaceC6399 FieldUsingType fieldUsingType) {
        C5499.m17103(fieldData, "field");
        C5499.m17103(fieldUsingType, "usingType");
        return new UsingFieldData(fieldData, fieldUsingType);
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsingFieldData)) {
            return false;
        }
        UsingFieldData usingFieldData = (UsingFieldData) obj;
        return C5499.m17094(this.field, usingFieldData.field) && this.usingType == usingFieldData.usingType;
    }

    @InterfaceC6399
    public final FieldData getField() {
        return this.field;
    }

    @InterfaceC6399
    public final FieldUsingType getUsingType() {
        return this.usingType;
    }

    public int hashCode() {
        return (this.field.hashCode() * 31) + this.usingType.hashCode();
    }

    @InterfaceC6399
    public String toString() {
        return "UsingFieldData(field=" + this.field + ", usingType=" + this.usingType + ")";
    }
}
