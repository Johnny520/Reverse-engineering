package io.ktor.network.tls;

import com.android.dx.io.Opcodes;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.AbstractC4364;
import kotlin.enums.InterfaceC4365;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lio/ktor/network/tls/TLSVersion;", "", "", "code", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;II)V", "I", "getCode", "()I", "Companion", "io/ktor/network/tls/飘花落叶言子楪哲苏世兰", "SSL3", "TLS10", "TLS11", "TLS12", "ktor-network-tls"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TLSVersion {
    private static final /* synthetic */ InterfaceC4365 $ENTRIES;
    private static final /* synthetic */ TLSVersion[] $VALUES;
    public static final C4040 Companion;
    public static final TLSVersion SSL3 = new TLSVersion("SSL3", 0, Opcodes.FILL_ARRAY_DATA_PAYLOAD);
    public static final TLSVersion TLS10 = new TLSVersion("TLS10", 1, 769);
    public static final TLSVersion TLS11 = new TLSVersion("TLS11", 2, 770);
    public static final TLSVersion TLS12 = new TLSVersion("TLS12", 3, 771);
    private static final List<TLSVersion> byOrdinal;
    private final int code;

    private static final /* synthetic */ TLSVersion[] $values() {
        return new TLSVersion[]{SSL3, TLS10, TLS11, TLS12};
    }

    static {
        TLSVersion[] tLSVersionArr$values = $values();
        $VALUES = tLSVersionArr$values;
        $ENTRIES = AbstractC4364.m8866(tLSVersionArr$values);
        Companion = new C4040();
        byOrdinal = getEntries();
    }

    private TLSVersion(String str, int i, int i2) {
        this.code = i2;
    }

    public static InterfaceC4365 getEntries() {
        return $ENTRIES;
    }

    public static TLSVersion valueOf(String str) {
        return (TLSVersion) Enum.valueOf(TLSVersion.class, str);
    }

    public static TLSVersion[] values() {
        return (TLSVersion[]) $VALUES.clone();
    }

    public final int getCode() {
        return this.code;
    }
}
