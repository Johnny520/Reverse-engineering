package io.ktor.http;

import kotlin.Metadata;
import kotlin.enums.AbstractC4364;
import kotlin.enums.InterfaceC4365;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lio/ktor/http/RangeUnits;", "", "", "unitToken", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getUnitToken", "()Ljava/lang/String;", "Bytes", "None", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RangeUnits {
    private static final /* synthetic */ InterfaceC4365 $ENTRIES;
    private static final /* synthetic */ RangeUnits[] $VALUES;
    public static final RangeUnits Bytes = new RangeUnits("Bytes", 0, "bytes");
    public static final RangeUnits None = new RangeUnits("None", 1, "none");
    private final String unitToken;

    private static final /* synthetic */ RangeUnits[] $values() {
        return new RangeUnits[]{Bytes, None};
    }

    static {
        RangeUnits[] rangeUnitsArr$values = $values();
        $VALUES = rangeUnitsArr$values;
        $ENTRIES = AbstractC4364.m8866(rangeUnitsArr$values);
    }

    private RangeUnits(String str, int i, String str2) {
        this.unitToken = str2;
    }

    public static InterfaceC4365 getEntries() {
        return $ENTRIES;
    }

    public static RangeUnits valueOf(String str) {
        return (RangeUnits) Enum.valueOf(RangeUnits.class, str);
    }

    public static RangeUnits[] values() {
        return (RangeUnits[]) $VALUES.clone();
    }

    public final String getUnitToken() {
        return this.unitToken;
    }
}
