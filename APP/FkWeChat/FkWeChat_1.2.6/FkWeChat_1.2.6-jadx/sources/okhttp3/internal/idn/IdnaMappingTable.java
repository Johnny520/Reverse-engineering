package okhttp3.internal.idn;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1061t;
import p172l8.C4700i0;
import p376zd.InterfaceC9997j;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001a"}, m16758d2 = {"Lokhttp3/internal/idn/IdnaMappingTable;", _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "sections", "ranges", "mappings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", _UrlKt.FRAGMENT_ENCODE_SET, "codePoint", "findSectionsIndex", "(I)I", "position", "limit", "findRangesOffset", "(III)I", "Lzd/j;", "sink", _UrlKt.FRAGMENT_ENCODE_SET, "map", "(ILzd/j;)Z", "Ljava/lang/String;", "getSections", "()Ljava/lang/String;", "getRanges", "getMappings", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class IdnaMappingTable {
    private final String mappings;
    private final String ranges;
    private final String sections;

    public IdnaMappingTable(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.sections = str;
        this.ranges = str2;
        this.mappings = str3;
    }

    private final int findRangesOffset(int codePoint, int position, int limit) {
        int i10;
        int i11 = codePoint & 127;
        int i12 = limit - 1;
        while (true) {
            if (position > i12) {
                i10 = (-position) - 1;
                break;
            }
            i10 = (position + i12) / 2;
            int iM3843d = AbstractC1061t.m3843d(i11, this.ranges.charAt(i10 * 4));
            if (iM3843d >= 0) {
                if (iM3843d <= 0) {
                    break;
                }
                position = i10 + 1;
            } else {
                i12 = i10 - 1;
            }
        }
        return i10 >= 0 ? i10 * 4 : ((-i10) - 2) * 4;
    }

    private final int findSectionsIndex(int codePoint) {
        int i10;
        int i11 = (codePoint & 2097024) >> 7;
        int length = (this.sections.length() / 4) - 1;
        int i12 = 0;
        while (true) {
            if (i12 > length) {
                i10 = (-i12) - 1;
                break;
            }
            i10 = (i12 + length) / 2;
            int iM3843d = AbstractC1061t.m3843d(i11, IdnaMappingTableKt.read14BitInt(this.sections, i10 * 4));
            if (iM3843d >= 0) {
                if (iM3843d <= 0) {
                    break;
                }
                i12 = i10 + 1;
            } else {
                length = i10 - 1;
            }
        }
        return i10 >= 0 ? i10 * 4 : ((-i10) - 2) * 4;
    }

    public final String getMappings() {
        return this.mappings;
    }

    public final String getRanges() {
        return this.ranges;
    }

    public final String getSections() {
        return this.sections;
    }

    public final boolean map(int codePoint, InterfaceC9997j sink) {
        sink.getClass();
        int iFindSectionsIndex = findSectionsIndex(codePoint);
        int iFindRangesOffset = findRangesOffset(codePoint, IdnaMappingTableKt.read14BitInt(this.sections, iFindSectionsIndex + 2), iFindSectionsIndex + 4 < this.sections.length() ? IdnaMappingTableKt.read14BitInt(this.sections, iFindSectionsIndex + 6) : this.ranges.length() / 4);
        char cCharAt = this.ranges.charAt(iFindRangesOffset + 1);
        if (cCharAt >= 0 && cCharAt < '@') {
            int i10 = IdnaMappingTableKt.read14BitInt(this.ranges, iFindRangesOffset + 2);
            sink.mo38711i0(this.mappings, i10, cCharAt + i10);
            return true;
        }
        if ('@' <= cCharAt && cCharAt < 'P') {
            sink.mo38732w(codePoint - (this.ranges.charAt(iFindRangesOffset + 3) | (((cCharAt & 15) << 14) | (this.ranges.charAt(iFindRangesOffset + 2) << 7))));
            return true;
        }
        if ('P' <= cCharAt && cCharAt < '`') {
            sink.mo38732w(codePoint + (this.ranges.charAt(iFindRangesOffset + 3) | ((cCharAt & 15) << 14) | (this.ranges.charAt(iFindRangesOffset + 2) << 7)));
            return true;
        }
        if (cCharAt == 'w') {
            C4700i0 c4700i0 = C4700i0.f13910a;
            return true;
        }
        if (cCharAt == 'x') {
            sink.mo38732w(codePoint);
            return true;
        }
        if (cCharAt == 'y') {
            sink.mo38732w(codePoint);
            return false;
        }
        if (cCharAt == 'z') {
            sink.writeByte(this.ranges.charAt(iFindRangesOffset + 2));
            return true;
        }
        if (cCharAt == '{') {
            sink.writeByte(this.ranges.charAt(iFindRangesOffset + 2) | 128);
            return true;
        }
        if (cCharAt == '|') {
            sink.writeByte(this.ranges.charAt(iFindRangesOffset + 2));
            sink.writeByte(this.ranges.charAt(iFindRangesOffset + 3));
            return true;
        }
        if (cCharAt == '}') {
            sink.writeByte(this.ranges.charAt(iFindRangesOffset + 2) | 128);
            sink.writeByte(this.ranges.charAt(iFindRangesOffset + 3));
            return true;
        }
        if (cCharAt == '~') {
            sink.writeByte(this.ranges.charAt(iFindRangesOffset + 2));
            sink.writeByte(this.ranges.charAt(iFindRangesOffset + 3) | 128);
            return true;
        }
        if (cCharAt == 127) {
            sink.writeByte(this.ranges.charAt(iFindRangesOffset + 2) | 128);
            sink.writeByte(this.ranges.charAt(iFindRangesOffset + 3) | 128);
            return true;
        }
        throw new IllegalStateException(("unexpected rangesIndex for " + codePoint).toString());
    }
}
