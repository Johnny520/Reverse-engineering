package io.ktor.server.http.content;

import kotlin.Metadata;
import kotlin.enums.AbstractC4364;
import kotlin.enums.InterfaceC4365;
import kotlin.jvm.internal.AbstractC4385;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\tj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lio/ktor/server/http/content/CompressedFileType;", "", "", "extension", "encoding", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getExtension", "()Ljava/lang/String;", "getEncoding", "BROTLI", "GZIP", "ktor-server-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CompressedFileType {
    private static final /* synthetic */ InterfaceC4365 $ENTRIES;
    private static final /* synthetic */ CompressedFileType[] $VALUES;
    public static final CompressedFileType BROTLI = new CompressedFileType("BROTLI", 0, "br", null, 2, null);
    public static final CompressedFileType GZIP = new CompressedFileType("GZIP", 1, "gz", "gzip");
    private final String encoding;
    private final String extension;

    private static final /* synthetic */ CompressedFileType[] $values() {
        return new CompressedFileType[]{BROTLI, GZIP};
    }

    static {
        CompressedFileType[] compressedFileTypeArr$values = $values();
        $VALUES = compressedFileTypeArr$values;
        $ENTRIES = AbstractC4364.m8866(compressedFileTypeArr$values);
    }

    public /* synthetic */ CompressedFileType(String str, int i, String str2, String str3, int i2, AbstractC4385 abstractC4385) {
        this(str, i, str2, (i2 & 2) != 0 ? str2 : str3);
    }

    public static InterfaceC4365 getEntries() {
        return $ENTRIES;
    }

    public static CompressedFileType valueOf(String str) {
        return (CompressedFileType) Enum.valueOf(CompressedFileType.class, str);
    }

    public static CompressedFileType[] values() {
        return (CompressedFileType[]) $VALUES.clone();
    }

    public final String getEncoding() {
        return this.encoding;
    }

    public final String getExtension() {
        return this.extension;
    }

    private CompressedFileType(String str, int i, String str2, String str3) {
        this.extension = str2;
        this.encoding = str3;
    }
}
