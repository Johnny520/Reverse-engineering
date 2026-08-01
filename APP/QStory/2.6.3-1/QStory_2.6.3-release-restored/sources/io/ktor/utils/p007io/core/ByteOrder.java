package io.ktor.utils.p007io.core;

import kotlin.Metadata;
import kotlin.enums.AbstractC5196;
import kotlin.enums.InterfaceC5197;
import net.bytebuddy.description.method.MethodDescription;
import p074.C7685;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m151d2 = {"Lio/ktor/utils/io/core/ByteOrder;", "", "Ljava/nio/ByteOrder;", "nioOrder", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;ILjava/nio/ByteOrder;)V", "Ljava/nio/ByteOrder;", "getNioOrder", "()Ljava/nio/ByteOrder;", "Companion", "飘花落叶言世子楪哲苏兰/飘花落叶言子楪世苏哲兰", "BIG_ENDIAN", "LITTLE_ENDIAN", "ktor-io"}, m152k = 1, m153mv = {2, 0, 0}, m155xi = 48)
public final class ByteOrder {
    private static final /* synthetic */ InterfaceC5197 $ENTRIES;
    private static final /* synthetic */ ByteOrder[] $VALUES;
    public static final ByteOrder BIG_ENDIAN;
    public static final C7685 Companion;
    public static final ByteOrder LITTLE_ENDIAN;

    /* JADX INFO: renamed from: native, reason: not valid java name */
    private static final ByteOrder f13062native;
    private final java.nio.ByteOrder nioOrder;

    private static final /* synthetic */ ByteOrder[] $values() {
        return new ByteOrder[]{BIG_ENDIAN, LITTLE_ENDIAN};
    }

    static {
        java.nio.ByteOrder byteOrder = java.nio.ByteOrder.BIG_ENDIAN;
        byteOrder.getClass();
        ByteOrder byteOrder2 = new ByteOrder("BIG_ENDIAN", 0, byteOrder);
        BIG_ENDIAN = byteOrder2;
        java.nio.ByteOrder byteOrder3 = java.nio.ByteOrder.LITTLE_ENDIAN;
        byteOrder3.getClass();
        ByteOrder byteOrder4 = new ByteOrder("LITTLE_ENDIAN", 1, byteOrder3);
        LITTLE_ENDIAN = byteOrder4;
        ByteOrder[] byteOrderArr$values = $values();
        $VALUES = byteOrderArr$values;
        $ENTRIES = AbstractC5196.m9425(byteOrderArr$values);
        Companion = new C7685();
        java.nio.ByteOrder byteOrderNativeOrder = java.nio.ByteOrder.nativeOrder();
        byteOrderNativeOrder.getClass();
        f13062native = byteOrderNativeOrder != byteOrder ? byteOrder4 : byteOrder2;
    }

    private ByteOrder(String str, int i, java.nio.ByteOrder byteOrder) {
        this.nioOrder = byteOrder;
    }

    public static InterfaceC5197 getEntries() {
        return $ENTRIES;
    }

    public static ByteOrder valueOf(String str) {
        return (ByteOrder) Enum.valueOf(ByteOrder.class, str);
    }

    public static ByteOrder[] values() {
        return (ByteOrder[]) $VALUES.clone();
    }

    public final java.nio.ByteOrder getNioOrder() {
        return this.nioOrder;
    }
}
