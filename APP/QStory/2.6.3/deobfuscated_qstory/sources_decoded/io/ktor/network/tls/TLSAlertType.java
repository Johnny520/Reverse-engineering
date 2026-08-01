package io.ktor.network.tls;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.AbstractC4364;
import kotlin.enums.InterfaceC4365;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\"\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#¨\u0006$"}, d2 = {"Lio/ktor/network/tls/TLSAlertType;", "", "", "code", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;II)V", "I", "getCode", "()I", "Companion", "io/ktor/network/tls/飘花落叶言子楪世兰哲苏", "DecryptionFailed_RESERVED", "CloseNotify", "UnexpectedMessage", "BadRecordMac", "RecordOverflow", "DecompressionFailure", "HandshakeFailure", "NoCertificate_RESERVED", "BadCertificate", "UnsupportedCertificate", "CertificateRevoked", "CertificateExpired", "CertificateUnknown", "IllegalParameter", "UnknownCa", "AccessDenied", "DecodeError", "DecryptError", "ExportRestriction_RESERVED", "ProtocolVersion", "InsufficientSecurity", "InternalError", "UserCanceled", "NoRenegotiation", "UnsupportedExtension", "ktor-network-tls"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TLSAlertType {
    private static final /* synthetic */ InterfaceC4365 $ENTRIES;
    private static final /* synthetic */ TLSAlertType[] $VALUES;
    public static final C4032 Companion;
    private static final TLSAlertType[] byCode;
    private final int code;
    public static final TLSAlertType DecryptionFailed_RESERVED = new TLSAlertType("DecryptionFailed_RESERVED", 0, 21);
    public static final TLSAlertType CloseNotify = new TLSAlertType("CloseNotify", 1, 0);
    public static final TLSAlertType UnexpectedMessage = new TLSAlertType("UnexpectedMessage", 2, 10);
    public static final TLSAlertType BadRecordMac = new TLSAlertType("BadRecordMac", 3, 20);
    public static final TLSAlertType RecordOverflow = new TLSAlertType("RecordOverflow", 4, 22);
    public static final TLSAlertType DecompressionFailure = new TLSAlertType("DecompressionFailure", 5, 30);
    public static final TLSAlertType HandshakeFailure = new TLSAlertType("HandshakeFailure", 6, 40);
    public static final TLSAlertType NoCertificate_RESERVED = new TLSAlertType("NoCertificate_RESERVED", 7, 41);
    public static final TLSAlertType BadCertificate = new TLSAlertType("BadCertificate", 8, 42);
    public static final TLSAlertType UnsupportedCertificate = new TLSAlertType("UnsupportedCertificate", 9, 43);
    public static final TLSAlertType CertificateRevoked = new TLSAlertType("CertificateRevoked", 10, 44);
    public static final TLSAlertType CertificateExpired = new TLSAlertType("CertificateExpired", 11, 45);
    public static final TLSAlertType CertificateUnknown = new TLSAlertType("CertificateUnknown", 12, 46);
    public static final TLSAlertType IllegalParameter = new TLSAlertType("IllegalParameter", 13, 47);
    public static final TLSAlertType UnknownCa = new TLSAlertType("UnknownCa", 14, 48);
    public static final TLSAlertType AccessDenied = new TLSAlertType("AccessDenied", 15, 49);
    public static final TLSAlertType DecodeError = new TLSAlertType("DecodeError", 16, 50);
    public static final TLSAlertType DecryptError = new TLSAlertType("DecryptError", 17, 51);
    public static final TLSAlertType ExportRestriction_RESERVED = new TLSAlertType("ExportRestriction_RESERVED", 18, 60);
    public static final TLSAlertType ProtocolVersion = new TLSAlertType("ProtocolVersion", 19, 70);
    public static final TLSAlertType InsufficientSecurity = new TLSAlertType("InsufficientSecurity", 20, 71);
    public static final TLSAlertType InternalError = new TLSAlertType("InternalError", 21, 80);
    public static final TLSAlertType UserCanceled = new TLSAlertType("UserCanceled", 22, 90);
    public static final TLSAlertType NoRenegotiation = new TLSAlertType("NoRenegotiation", 23, 100);
    public static final TLSAlertType UnsupportedExtension = new TLSAlertType("UnsupportedExtension", 24, 110);

    private static final /* synthetic */ TLSAlertType[] $values() {
        return new TLSAlertType[]{DecryptionFailed_RESERVED, CloseNotify, UnexpectedMessage, BadRecordMac, RecordOverflow, DecompressionFailure, HandshakeFailure, NoCertificate_RESERVED, BadCertificate, UnsupportedCertificate, CertificateRevoked, CertificateExpired, CertificateUnknown, IllegalParameter, UnknownCa, AccessDenied, DecodeError, DecryptError, ExportRestriction_RESERVED, ProtocolVersion, InsufficientSecurity, InternalError, UserCanceled, NoRenegotiation, UnsupportedExtension};
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Object next;
        TLSAlertType[] tLSAlertTypeArr$values = $values();
        $VALUES = tLSAlertTypeArr$values;
        $ENTRIES = AbstractC4364.m8866(tLSAlertTypeArr$values);
        Companion = new C4032();
        TLSAlertType[] tLSAlertTypeArr = new TLSAlertType[256];
        for (int i = 0; i < 256; i++) {
            Iterator<E> it = getEntries().iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (((TLSAlertType) next).code == i) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            tLSAlertTypeArr[i] = next;
        }
        byCode = tLSAlertTypeArr;
    }

    private TLSAlertType(String str, int i, int i2) {
        this.code = i2;
    }

    public static InterfaceC4365 getEntries() {
        return $ENTRIES;
    }

    public static TLSAlertType valueOf(String str) {
        return (TLSAlertType) Enum.valueOf(TLSAlertType.class, str);
    }

    public static TLSAlertType[] values() {
        return (TLSAlertType[]) $VALUES.clone();
    }

    public final int getCode() {
        return this.code;
    }
}
