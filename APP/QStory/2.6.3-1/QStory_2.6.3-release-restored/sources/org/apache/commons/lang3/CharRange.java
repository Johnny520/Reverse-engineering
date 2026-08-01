package org.apache.commons.lang3;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Objects;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
final class CharRange implements Iterable<Character>, Serializable {
    static final CharRange[] EMPTY_ARRAY = new CharRange[0];
    private static final long serialVersionUID = 8270183163158333422L;
    private final char end;
    private transient String iToString;
    private final boolean negated;
    private final char start;

    private CharRange(char c, char c2, boolean z) {
        if (c > c2) {
            c2 = c;
            c = c2;
        }
        this.start = c;
        this.end = c2;
        this.negated = z;
    }

    /* JADX INFO: renamed from: is */
    public static CharRange m530is(char c) {
        return new CharRange(c, c, false);
    }

    public static CharRange isIn(char c, char c2) {
        return new CharRange(c, c2, false);
    }

    public static CharRange isNot(char c) {
        return new CharRange(c, c, true);
    }

    public static CharRange isNotIn(char c, char c2) {
        return new CharRange(c, c2, true);
    }

    public boolean contains(CharRange charRange) {
        Objects.requireNonNull(charRange, "range");
        boolean z = this.negated;
        boolean z2 = charRange.negated;
        if (z) {
            return z2 ? this.start >= charRange.start && this.end <= charRange.end : charRange.end < this.start || charRange.start > this.end;
        }
        char c = this.start;
        return z2 ? c == 0 && this.end == 65535 : c <= charRange.start && this.end >= charRange.end;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CharRange)) {
            return false;
        }
        CharRange charRange = (CharRange) obj;
        return this.start == charRange.start && this.end == charRange.end && this.negated == charRange.negated;
    }

    public char getEnd() {
        return this.end;
    }

    public char getStart() {
        return this.start;
    }

    public int hashCode() {
        return (this.end * 7) + this.start + 'S' + (this.negated ? 1 : 0);
    }

    public boolean isNegated() {
        return this.negated;
    }

    @Override // java.lang.Iterable
    public Iterator<Character> iterator() {
        return new C6529(this);
    }

    public String toString() {
        if (this.iToString == null) {
            StringBuilder sb = new StringBuilder(4);
            if (isNegated()) {
                sb.append('^');
            }
            sb.append(this.start);
            if (this.start != this.end) {
                sb.append(SignatureVisitor.SUPER);
                sb.append(this.end);
            }
            this.iToString = sb.toString();
        }
        return this.iToString;
    }

    public boolean contains(char c) {
        return (c >= this.start && c <= this.end) != this.negated;
    }
}
