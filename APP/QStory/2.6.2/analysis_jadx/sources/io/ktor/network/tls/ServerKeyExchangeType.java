package io.ktor.network.tls;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.AbstractC4363;
import kotlin.enums.InterfaceC4364;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lio/ktor/network/tls/ServerKeyExchangeType;", "", "", "code", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;II)V", "I", "getCode", "()I", "Companion", "io/ktor/network/tls/飘花落叶言子楪世哲兰苏", "ExplicitPrime", "ExplicitChar", "NamedCurve", "ktor-network-tls"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ServerKeyExchangeType {
    private static final /* synthetic */ InterfaceC4364 $ENTRIES;
    private static final /* synthetic */ ServerKeyExchangeType[] $VALUES;
    public static final C4033 Companion;
    private static final ServerKeyExchangeType[] byCode;
    private final int code;
    public static final ServerKeyExchangeType ExplicitPrime = new ServerKeyExchangeType("ExplicitPrime", 0, 1);
    public static final ServerKeyExchangeType ExplicitChar = new ServerKeyExchangeType("ExplicitChar", 1, 2);
    public static final ServerKeyExchangeType NamedCurve = new ServerKeyExchangeType("NamedCurve", 2, 3);

    private static final /* synthetic */ ServerKeyExchangeType[] $values() {
        return new ServerKeyExchangeType[]{ExplicitPrime, ExplicitChar, NamedCurve};
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Object next;
        ServerKeyExchangeType[] serverKeyExchangeTypeArr$values = $values();
        $VALUES = serverKeyExchangeTypeArr$values;
        $ENTRIES = AbstractC4363.m8876(serverKeyExchangeTypeArr$values);
        Companion = new C4033();
        ServerKeyExchangeType[] serverKeyExchangeTypeArr = new ServerKeyExchangeType[256];
        for (int i = 0; i < 256; i++) {
            Iterator<E> it = getEntries().iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (((ServerKeyExchangeType) next).code == i) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            serverKeyExchangeTypeArr[i] = next;
        }
        byCode = serverKeyExchangeTypeArr;
    }

    private ServerKeyExchangeType(String str, int i, int i2) {
        this.code = i2;
    }

    public static InterfaceC4364 getEntries() {
        return $ENTRIES;
    }

    public static ServerKeyExchangeType valueOf(String str) {
        return (ServerKeyExchangeType) Enum.valueOf(ServerKeyExchangeType.class, str);
    }

    public static ServerKeyExchangeType[] values() {
        return (ServerKeyExchangeType[]) $VALUES.clone();
    }

    public final int getCode() {
        return this.code;
    }
}
