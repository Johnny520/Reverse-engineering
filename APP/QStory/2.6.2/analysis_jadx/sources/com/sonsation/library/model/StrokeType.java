package com.sonsation.library.model;

import kotlin.Metadata;
import kotlin.enums.AbstractC4363;
import kotlin.enums.InterfaceC4364;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/sonsation/library/model/StrokeType;", "", "type", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;II)V", "getType", "()I", "INSIDE", "CENTER", "OUTSIDE", "library_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StrokeType {
    private static final /* synthetic */ InterfaceC4364 $ENTRIES;
    private static final /* synthetic */ StrokeType[] $VALUES;
    private final int type;
    public static final StrokeType INSIDE = new StrokeType("INSIDE", 0, 0);
    public static final StrokeType CENTER = new StrokeType("CENTER", 1, 1);
    public static final StrokeType OUTSIDE = new StrokeType("OUTSIDE", 2, 2);

    private static final /* synthetic */ StrokeType[] $values() {
        return new StrokeType[]{INSIDE, CENTER, OUTSIDE};
    }

    static {
        StrokeType[] strokeTypeArr$values = $values();
        $VALUES = strokeTypeArr$values;
        $ENTRIES = AbstractC4363.m8876(strokeTypeArr$values);
    }

    private StrokeType(String str, int i, int i2) {
        this.type = i2;
    }

    public static InterfaceC4364 getEntries() {
        return $ENTRIES;
    }

    public static StrokeType valueOf(String str) {
        return (StrokeType) Enum.valueOf(StrokeType.class, str);
    }

    public static StrokeType[] values() {
        return (StrokeType[]) $VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }
}
