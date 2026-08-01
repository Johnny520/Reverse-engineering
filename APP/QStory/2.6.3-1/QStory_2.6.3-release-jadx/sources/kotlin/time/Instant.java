package kotlin.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import net.bytebuddy.pool.TypePool;
import p321.C9452;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00060\u0002j\u0002`\u0003:\u0001.B\u0019\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0011\u001a\u00020\u00102\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0086\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0086\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\u0018\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020!2\b\u0010\u001c\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0006H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010%¨\u0006/"}, m151d2 = {"Lkotlin/time/Instant;", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "epochSeconds", "", "nanosecondsOfSecond", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JI)V", "", "writeReplace", "()Ljava/lang/Object;", "Ljava/io/ObjectInputStream;", "Lkotlin/internal/ReadObjectParameterType;", "input", "Lkotlin/飘花落叶言子楪兰苏哲世;", "readObject", "(Ljava/io/ObjectInputStream;)V", "toEpochMilliseconds", "()J", "Lkotlin/time/飘花落叶言子楪世苏哲兰;", "duration", "plus-LRDsOJo", "(J)Lkotlin/time/Instant;", "plus", "minus-LRDsOJo", "minus", "other", "minus-UwyO8pc", "(Lkotlin/time/Instant;)J", "compareTo", "(Lkotlin/time/Instant;)I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getEpochSeconds", "I", "getNanosecondsOfSecond", "Companion", "kotlin/time/飘花落叶言子楪世兰苏哲", "kotlin-stdlib"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 48)
public final class Instant implements Comparable<Instant>, Serializable {
    private final long epochSeconds;
    private final int nanosecondsOfSecond;
    public static final C5985 Companion = new C5985();
    private static final Instant MIN = new Instant(-31557014167219200L, 0);
    private static final Instant MAX = new Instant(31556889864403199L, 999999999);

    public Instant(long j, int i) {
        this.epochSeconds = j;
        this.nanosecondsOfSecond = i;
        if (-31557014167219200L > j || j >= 31556889864403200L) {
            C6755.m11869("Instant exceeds minimum or maximum instant");
            throw null;
        }
    }

    private final void readObject(ObjectInputStream input) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        int i = AbstractC5984.f15051;
        return new InstantSerialized(getEpochSeconds(), getNanosecondsOfSecond());
    }

    @Override // java.lang.Comparable
    public int compareTo(Instant other) {
        other.getClass();
        int iM9463 = AbstractC5227.m9463(this.epochSeconds, other.epochSeconds);
        return iM9463 != 0 ? iM9463 : AbstractC5227.m9464(this.nanosecondsOfSecond, other.nanosecondsOfSecond);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Instant)) {
            return false;
        }
        Instant instant = (Instant) other;
        return this.epochSeconds == instant.epochSeconds && this.nanosecondsOfSecond == instant.nanosecondsOfSecond;
    }

    public final long getEpochSeconds() {
        return this.epochSeconds;
    }

    public final int getNanosecondsOfSecond() {
        return this.nanosecondsOfSecond;
    }

    public int hashCode() {
        return (this.nanosecondsOfSecond * 51) + Long.hashCode(this.epochSeconds);
    }

    /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
    public final Instant m10742minusLRDsOJo(long duration) {
        return m10744plusLRDsOJo(C5989.m10752(duration));
    }

    /* JADX INFO: renamed from: minus-UwyO8pc, reason: not valid java name */
    public final long m10743minusUwyO8pc(Instant other) {
        other.getClass();
        C9452 c9452 = C5989.f15057;
        return C5989.m10753(AbstractC5992.m10766(this.epochSeconds - other.epochSeconds, DurationUnit.SECONDS), AbstractC5992.m10765(this.nanosecondsOfSecond - other.nanosecondsOfSecond, DurationUnit.NANOSECONDS));
    }

    /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
    public final Instant m10744plusLRDsOJo(long duration) {
        C9452 c9452 = C5989.f15057;
        long jM10755 = C5989.m10755(duration, DurationUnit.SECONDS);
        int iM10747 = C5989.m10747(duration);
        if (jM10755 == 0 && iM10747 == 0) {
            return this;
        }
        long j = this.epochSeconds;
        long j2 = j + jM10755;
        if ((j ^ j2) < 0 && (jM10755 ^ j) >= 0) {
            return duration > 0 ? MAX : MIN;
        }
        int i = this.nanosecondsOfSecond + iM10747;
        Companion.getClass();
        return C5985.m10745(i, j2);
    }

    public final long toEpochMilliseconds() {
        long j = this.epochSeconds;
        long j2 = 1000;
        if (j >= 0) {
            if (j != 1) {
                if (j != 0) {
                    long j3 = j * 1000;
                    if (j3 / 1000 != j) {
                        return Long.MAX_VALUE;
                    }
                    j2 = j3;
                } else {
                    j2 = 0;
                }
            }
            long j4 = this.nanosecondsOfSecond / 1000000;
            long j5 = j2 + j4;
            if ((j2 ^ j5) >= 0 || (j4 ^ j2) < 0) {
                return j5;
            }
            return Long.MAX_VALUE;
        }
        long j6 = j + 1;
        if (j6 != 1) {
            if (j6 != 0) {
                long j7 = j6 * 1000;
                if (j7 / 1000 != j6) {
                    return Long.MIN_VALUE;
                }
                j2 = j7;
            } else {
                j2 = 0;
            }
        }
        long j8 = (this.nanosecondsOfSecond / 1000000) - 1000;
        long j9 = j2 + j8;
        if ((j2 ^ j9) >= 0 || (j8 ^ j2) < 0) {
            return j9;
        }
        return Long.MIN_VALUE;
    }

    public String toString() {
        long j;
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        long epochSeconds = getEpochSeconds();
        long j2 = epochSeconds / 86400;
        if ((epochSeconds ^ 86400) < 0 && j2 * 86400 != epochSeconds) {
            j2--;
        }
        long j3 = epochSeconds % 86400;
        int i = (int) (j3 + (86400 & (((j3 ^ 86400) & ((-j3) | j3)) >> 63)));
        long j4 = 719468 + j2;
        if (j4 < 0) {
            long j5 = ((j2 + 719469) / 146097) - 1;
            j = j5 * 400;
            j4 += (-j5) * 146097;
        } else {
            j = 0;
        }
        long j6 = ((400 * j4) + 591) / 146097;
        long j7 = j4 - ((j6 / 400) + (((j6 / 4) + (365 * j6)) - (j6 / 100)));
        if (j7 < 0) {
            j6--;
            j7 = j4 - ((j6 / 400) + (((j6 / 4) + (365 * j6)) - (j6 / 100)));
        }
        int i2 = (int) j7;
        int i3 = ((i2 * 5) + 2) / 153;
        int i4 = ((i3 + 2) % 12) + 1;
        int i5 = (i2 - (((i3 * 306) + 5) / 10)) + 1;
        int i6 = (int) (j6 + j + ((long) (i3 / 10)));
        int i7 = i / 3600;
        int i8 = i - (i7 * 3600);
        int i9 = i8 / 60;
        int i10 = i8 - (i9 * 60);
        int nanosecondsOfSecond = getNanosecondsOfSecond();
        int i11 = 0;
        if (Math.abs(i6) < 1000) {
            StringBuilder sb2 = new StringBuilder();
            if (i6 >= 0) {
                sb2.append(i6 + 10000);
                sb2.deleteCharAt(0).getClass();
            } else {
                sb2.append(i6 - 10000);
                sb2.deleteCharAt(1).getClass();
            }
            sb.append((CharSequence) sb2);
        } else {
            if (i6 >= 10000) {
                sb.append(SignatureVisitor.EXTENDS);
            }
            sb.append(i6);
        }
        sb.append(SignatureVisitor.SUPER);
        AbstractC5992.m10758(sb, sb, i4);
        sb.append(SignatureVisitor.SUPER);
        AbstractC5992.m10758(sb, sb, i5);
        sb.append('T');
        AbstractC5992.m10758(sb, sb, i7);
        sb.append(':');
        AbstractC5992.m10758(sb, sb, i9);
        sb.append(':');
        AbstractC5992.m10758(sb, sb, i10);
        if (nanosecondsOfSecond != 0) {
            sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
            while (true) {
                int i12 = i11 + 1;
                iArr = AbstractC5992.f15067;
                if (nanosecondsOfSecond % iArr[i12] != 0) {
                    break;
                }
                i11 = i12;
            }
            int i13 = i11 - (i11 % 3);
            String strValueOf = String.valueOf((nanosecondsOfSecond / iArr[i13]) + iArr[9 - i13]);
            strValueOf.getClass();
            sb.append(strValueOf.substring(1));
        }
        sb.append('Z');
        return sb.toString();
    }
}
