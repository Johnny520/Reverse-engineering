package io.ktor.utils.io.core;

import kotlin.Metadata;
import kotlin.enums.AbstractC4363;
import kotlin.enums.InterfaceC4364;
import net.bytebuddy.description.method.MethodDescription;
import p058.C6855;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lio/ktor/utils/io/core/ByteOrder;", "", "Ljava/nio/ByteOrder;", "nioOrder", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;ILjava/nio/ByteOrder;)V", "Ljava/nio/ByteOrder;", "getNioOrder", "()Ljava/nio/ByteOrder;", "Companion", "飘花落叶言世子楪哲苏兰/飘花落叶言子楪世苏哲兰", "BIG_ENDIAN", "LITTLE_ENDIAN", "ktor-io"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ByteOrder {
    private static final /* synthetic */ InterfaceC4364 $ENTRIES;
    private static final /* synthetic */ ByteOrder[] $VALUES;
    public static final ByteOrder BIG_ENDIAN;
    public static final C6855 Companion;
    public static final ByteOrder LITTLE_ENDIAN;

    /* JADX INFO: renamed from: native, reason: not valid java name */
    private static final ByteOrder f12713native;
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
        $ENTRIES = AbstractC4363.m8876(byteOrderArr$values);
        Companion = new C6855();
        java.nio.ByteOrder byteOrderNativeOrder = java.nio.ByteOrder.nativeOrder();
        byteOrderNativeOrder.getClass();
        f12713native = byteOrderNativeOrder != byteOrder ? byteOrder4 : byteOrder2;
    }

    private ByteOrder(String str, int i, java.nio.ByteOrder byteOrder) {
        this.nioOrder = byteOrder;
    }

    public static InterfaceC4364 getEntries() {
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
