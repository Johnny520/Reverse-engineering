package org.apache.commons.lang3.text;

import bsh.C2664;
import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import net.bytebuddy.asm.Advice;
import org.apache.commons.lang3.AbstractC5686;
import org.apache.commons.lang3.AbstractC5692;
import org.apache.commons.lang3.AbstractC5695;
import org.apache.commons.lang3.C5691;
import org.apache.commons.lang3.ObjectUtils$Null;
import p009.AbstractC6183;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class StrBuilder implements CharSequence, Appendable, Serializable {
    static final int CAPACITY = 32;
    private static final long serialVersionUID = 7628716375283629643L;
    protected char[] buffer;
    private String newLine;
    private String nullText;
    protected int size;

    public StrBuilder(String str) {
        if (str == null) {
            this.buffer = new char[32];
        } else {
            this.buffer = new char[str.length() + 32];
            append(str);
        }
    }

    private void deleteImpl(int i, int i2, int i3) {
        char[] cArr = this.buffer;
        System.arraycopy(cArr, i2, cArr, i, this.size - i2);
        this.size -= i3;
    }

    private static /* synthetic */ char[] lambda$ensureCapacity$0(int i) {
        return new char[i * 2];
    }

    private /* synthetic */ char[] lambda$minimizeCapacity$1() {
        return new char[length()];
    }

    private static /* synthetic */ char[] lambda$toCharArray$2(int i) {
        return new char[i];
    }

    private static /* synthetic */ char[] lambda$toCharArray$3(int i) {
        return new char[i];
    }

    private StrBuilder replaceImpl(AbstractC5648 abstractC5648, String str, int i, int i2, int i3) {
        StrBuilder strBuilder;
        String str2;
        if (abstractC5648 != null && this.size != 0) {
            int iM11058 = AbstractC5695.m11058(str);
            int i4 = i;
            while (i4 < i2 && i3 != 0) {
                int iMo11032 = abstractC5648.mo11032(i4, this.buffer);
                if (iMo11032 > 0) {
                    strBuilder = this;
                    str2 = str;
                    strBuilder.replaceImpl(i4, i4 + iMo11032, iMo11032, str2, iM11058);
                    i2 = (i2 - iMo11032) + iM11058;
                    i4 = (i4 + iM11058) - 1;
                    if (i3 > 0) {
                        i3--;
                    }
                } else {
                    strBuilder = this;
                    str2 = str;
                }
                i4++;
                this = strBuilder;
                str = str2;
            }
        }
        return this;
    }

    public StrBuilder append(boolean z) {
        int i = this.size;
        if (z) {
            ensureCapacity(i + 4);
            char[] cArr = this.buffer;
            int i2 = this.size;
            int i3 = i2 + 1;
            this.size = i3;
            cArr[i2] = Advice.OffsetMapping.ForOrigin.Renderer.ForTypeName.SYMBOL;
            int i4 = i2 + 2;
            this.size = i4;
            cArr[i3] = Advice.OffsetMapping.ForOrigin.Renderer.ForReturnTypeName.SYMBOL;
            this.size = i2 + 3;
            cArr[i4] = 'u';
        } else {
            ensureCapacity(i + 5);
            char[] cArr2 = this.buffer;
            int i5 = this.size;
            int i6 = i5 + 1;
            this.size = i6;
            cArr2[i5] = 'f';
            int i7 = i5 + 2;
            this.size = i7;
            cArr2[i6] = 'a';
            int i8 = i5 + 3;
            this.size = i8;
            cArr2[i7] = 'l';
            this.size = i5 + 4;
            cArr2[i8] = Advice.OffsetMapping.ForOrigin.Renderer.ForJavaSignature.SYMBOL;
        }
        char[] cArr3 = this.buffer;
        int i9 = this.size;
        this.size = i9 + 1;
        cArr3[i9] = 'e';
        return this;
    }

    public <T> StrBuilder appendAll(T... tArr) {
        if (!AbstractC5686.m11052(tArr)) {
            for (T t : tArr) {
                append(t);
            }
        }
        return this;
    }

    public StrBuilder appendFixedWidthPadLeft(Object obj, int i, char c) {
        if (i > 0) {
            ensureCapacity(this.size + i);
            ObjectUtils$Null objectUtils$Null = AbstractC5692.f15625;
            String nullText = obj == null ? getNullText() : obj.toString();
            if (nullText == null) {
                nullText = "";
            }
            int length = nullText.length();
            if (length >= i) {
                nullText.getChars(length - i, length, this.buffer, this.size);
            } else {
                int i2 = this.size;
                int i3 = (i - length) + i2;
                Arrays.fill(this.buffer, i2, i3, c);
                nullText.getChars(0, length, this.buffer, i3);
            }
            this.size += i;
        }
        return this;
    }

    public StrBuilder appendFixedWidthPadRight(Object obj, int i, char c) {
        if (i > 0) {
            ensureCapacity(this.size + i);
            ObjectUtils$Null objectUtils$Null = AbstractC5692.f15625;
            String nullText = obj == null ? getNullText() : obj.toString();
            if (nullText == null) {
                nullText = "";
            }
            int length = nullText.length();
            char[] cArr = this.buffer;
            int i2 = this.size;
            if (length >= i) {
                nullText.getChars(0, i, cArr, i2);
            } else {
                nullText.getChars(0, length, cArr, i2);
                int i3 = this.size + length;
                Arrays.fill(this.buffer, i3, (i3 + i) - length, c);
            }
            this.size += i;
        }
        return this;
    }

    public StrBuilder appendNewLine() {
        String str = this.newLine;
        if (str != null) {
            return append(str);
        }
        append(System.lineSeparator());
        return this;
    }

    public StrBuilder appendNull() {
        String str = this.nullText;
        return str == null ? this : append(str);
    }

    public StrBuilder appendPadding(int i, char c) {
        if (i >= 0) {
            ensureCapacity(this.size + i);
            for (int i2 = 0; i2 < i; i2++) {
                char[] cArr = this.buffer;
                int i3 = this.size;
                this.size = i3 + 1;
                cArr[i3] = c;
            }
        }
        return this;
    }

    public StrBuilder appendSeparator(char c, char c2) {
        if (isNotEmpty()) {
            append(c);
            return this;
        }
        append(c2);
        return this;
    }

    public void appendTo(Appendable appendable) throws IOException {
        if (appendable instanceof Writer) {
            ((Writer) appendable).write(this.buffer, 0, this.size);
            return;
        }
        if (appendable instanceof StringBuilder) {
            ((StringBuilder) appendable).append(this.buffer, 0, this.size);
            return;
        }
        if (appendable instanceof StringBuffer) {
            ((StringBuffer) appendable).append(this.buffer, 0, this.size);
        } else if (appendable instanceof CharBuffer) {
            ((CharBuffer) appendable).put(this.buffer, 0, this.size);
        } else {
            appendable.append(this);
        }
    }

    public StrBuilder appendWithSeparators(Iterable<?> iterable, String str) {
        if (iterable != null) {
            String string = Objects.toString(str, "");
            Iterator<?> it = iterable.iterator();
            while (it.hasNext()) {
                append(it.next());
                if (it.hasNext()) {
                    append(string);
                }
            }
        }
        return this;
    }

    public StrBuilder appendln(boolean z) {
        return append(z).appendNewLine();
    }

    public Reader asReader() {
        return new C5646(this);
    }

    public C5647 asTokenizer() {
        return new C5645(this);
    }

    public Writer asWriter() {
        return new C5644(this);
    }

    public int capacity() {
        return this.buffer.length;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        if (i < 0 || i >= length()) {
            throw new StringIndexOutOfBoundsException(i);
        }
        return this.buffer[i];
    }

    public StrBuilder clear() {
        this.size = 0;
        return this;
    }

    public boolean contains(char c) {
        char[] cArr = this.buffer;
        for (int i = 0; i < this.size; i++) {
            if (cArr[i] == c) {
                return true;
            }
        }
        return false;
    }

    public StrBuilder delete(int i, int i2) {
        int iValidateRange = validateRange(i, i2);
        int i3 = iValidateRange - i;
        if (i3 > 0) {
            deleteImpl(i, iValidateRange, i3);
        }
        return this;
    }

    public StrBuilder deleteAll(char c) {
        int i = 0;
        while (i < this.size) {
            if (this.buffer[i] == c) {
                int i2 = i;
                do {
                    i2++;
                    if (i2 >= this.size) {
                        break;
                    }
                } while (this.buffer[i2] == c);
                int i3 = i2 - i;
                deleteImpl(i, i2, i3);
                i = i2 - i3;
            }
            i++;
        }
        return this;
    }

    public StrBuilder deleteCharAt(int i) {
        if (i < 0 || i >= this.size) {
            throw new StringIndexOutOfBoundsException(i);
        }
        deleteImpl(i, i + 1, 1);
        return this;
    }

    public StrBuilder deleteFirst(char c) {
        for (int i = 0; i < this.size; i++) {
            if (this.buffer[i] == c) {
                deleteImpl(i, i + 1, 1);
                return this;
            }
        }
        return this;
    }

    public boolean endsWith(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length == 0) {
            return true;
        }
        int i = this.size;
        if (length > i) {
            return false;
        }
        int i2 = i - length;
        int i3 = 0;
        while (i3 < length) {
            if (this.buffer[i2] != str.charAt(i3)) {
                return false;
            }
            i3++;
            i2++;
        }
        return true;
    }

    public StrBuilder ensureCapacity(int i) {
        char[] cArr = this.buffer;
        if (i > cArr.length) {
            int i2 = this.size;
            char[] cArrLambda$ensureCapacity$0 = lambda$ensureCapacity$0(i);
            System.arraycopy(cArr, 0, cArrLambda$ensureCapacity$0, 0, i2);
            this.buffer = cArrLambda$ensureCapacity$0;
        }
        return this;
    }

    public boolean equals(StrBuilder strBuilder) {
        int i;
        if (this == strBuilder) {
            return true;
        }
        if (strBuilder == null || (i = this.size) != strBuilder.size) {
            return false;
        }
        char[] cArr = this.buffer;
        char[] cArr2 = strBuilder.buffer;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (cArr[i2] != cArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public boolean equalsIgnoreCase(StrBuilder strBuilder) {
        if (this == strBuilder) {
            return true;
        }
        int i = this.size;
        if (i != strBuilder.size) {
            return false;
        }
        char[] cArr = this.buffer;
        char[] cArr2 = strBuilder.buffer;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            char c = cArr[i2];
            char c2 = cArr2[i2];
            if (c != c2 && Character.toUpperCase(c) != Character.toUpperCase(c2)) {
                return false;
            }
        }
        return true;
    }

    public void getChars(int i, int i2, char[] cArr, int i3) {
        if (i < 0) {
            throw new StringIndexOutOfBoundsException(i);
        }
        if (i2 < 0 || i2 > length()) {
            throw new StringIndexOutOfBoundsException(i2);
        }
        if (i > i2) {
            throw new StringIndexOutOfBoundsException("end < start");
        }
        System.arraycopy(this.buffer, i, cArr, i3, i2 - i);
    }

    public String getNewLineText() {
        return this.newLine;
    }

    public String getNullText() {
        return this.nullText;
    }

    public int hashCode() {
        char[] cArr = this.buffer;
        int i = 0;
        for (int i2 = this.size - 1; i2 >= 0; i2--) {
            i = (i * 31) + cArr[i2];
        }
        return i;
    }

    public int indexOf(AbstractC5648 abstractC5648, int i) {
        int i2;
        int iMax = Math.max(i, 0);
        if (abstractC5648 == null || iMax >= (i2 = this.size)) {
            return -1;
        }
        char[] cArr = this.buffer;
        while (iMax < i2) {
            if (abstractC5648.mo11032(iMax, cArr) > 0) {
                return iMax;
            }
            iMax++;
        }
        return -1;
    }

    public StrBuilder insert(int i, boolean z) {
        validateIndex(i);
        int i2 = this.size;
        if (z) {
            ensureCapacity(i2 + 4);
            char[] cArr = this.buffer;
            System.arraycopy(cArr, i, cArr, i + 4, this.size - i);
            char[] cArr2 = this.buffer;
            cArr2[i] = Advice.OffsetMapping.ForOrigin.Renderer.ForTypeName.SYMBOL;
            cArr2[i + 1] = Advice.OffsetMapping.ForOrigin.Renderer.ForReturnTypeName.SYMBOL;
            cArr2[i + 2] = 'u';
            cArr2[i + 3] = 'e';
            this.size += 4;
            return this;
        }
        ensureCapacity(i2 + 5);
        char[] cArr3 = this.buffer;
        System.arraycopy(cArr3, i, cArr3, i + 5, this.size - i);
        char[] cArr4 = this.buffer;
        cArr4[i] = 'f';
        cArr4[i + 1] = 'a';
        cArr4[i + 2] = 'l';
        cArr4[i + 3] = Advice.OffsetMapping.ForOrigin.Renderer.ForJavaSignature.SYMBOL;
        cArr4[i + 4] = 'e';
        this.size += 5;
        return this;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean isNotEmpty() {
        return this.size > 0;
    }

    public int lastIndexOf(String str, int i) {
        if (str == null) {
            return -1;
        }
        int length = length();
        int length2 = str.length();
        if (i > length) {
            i = length;
        }
        if (i < 0 || length2 > length) {
            return -1;
        }
        if (length2 == 0) {
            return i;
        }
        if (i + length2 > length) {
            i = length - length2;
        }
        char cCharAt = str.charAt(0);
        while (true) {
            if (charAt(i) == cCharAt) {
                int i2 = 1;
                for (int i3 = length2 - 1; i2 <= i3; i3--) {
                    if (charAt(i + i2) == str.charAt(i2) && charAt(i + i3) == str.charAt(i3)) {
                        i2++;
                    } else {
                        i--;
                        if (i < 0) {
                            return -1;
                        }
                    }
                }
                return i;
            }
            i--;
            if (i < 0) {
                return -1;
            }
        }
    }

    public String leftString(int i) {
        if (i <= 0) {
            return "";
        }
        int i2 = this.size;
        char[] cArr = this.buffer;
        return i >= i2 ? new String(cArr, 0, i2) : new String(cArr, 0, i);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.size;
    }

    public String midString(int i, int i2) {
        int i3;
        if (i < 0) {
            i = 0;
        }
        if (i2 <= 0 || i >= (i3 = this.size)) {
            return "";
        }
        int i4 = i + i2;
        char[] cArr = this.buffer;
        return i3 <= i4 ? new String(cArr, i, i3 - i) : new String(cArr, i, i2);
    }

    public StrBuilder minimizeCapacity() {
        if (this.buffer.length > length()) {
            char[] cArr = this.buffer;
            int i = this.size;
            char[] cArrLambda$minimizeCapacity$1 = lambda$minimizeCapacity$1();
            System.arraycopy(cArr, 0, cArrLambda$minimizeCapacity$1, 0, i);
            this.buffer = cArrLambda$minimizeCapacity$1;
        }
        return this;
    }

    public int readFrom(Readable readable) throws IOException {
        int i = this.size;
        if (readable instanceof Reader) {
            Reader reader = (Reader) readable;
            ensureCapacity(i + 1);
            while (true) {
                char[] cArr = this.buffer;
                int i2 = this.size;
                int i3 = reader.read(cArr, i2, cArr.length - i2);
                if (i3 == -1) {
                    break;
                }
                int i4 = this.size + i3;
                this.size = i4;
                ensureCapacity(i4 + 1);
            }
        } else if (readable instanceof CharBuffer) {
            CharBuffer charBuffer = (CharBuffer) readable;
            int iRemaining = charBuffer.remaining();
            ensureCapacity(this.size + iRemaining);
            charBuffer.get(this.buffer, this.size, iRemaining);
            this.size += iRemaining;
        } else {
            while (true) {
                ensureCapacity(this.size + 1);
                char[] cArr2 = this.buffer;
                int i5 = this.size;
                int i6 = readable.read(CharBuffer.wrap(cArr2, i5, cArr2.length - i5));
                if (i6 == -1) {
                    break;
                }
                this.size += i6;
            }
        }
        return this.size - i;
    }

    public StrBuilder replace(int i, int i2, String str) {
        int iValidateRange = validateRange(i, i2);
        replaceImpl(i, iValidateRange, iValidateRange - i, str, AbstractC5695.m11058(str));
        return this;
    }

    public StrBuilder replaceAll(String str, String str2) {
        int iM11058 = AbstractC5695.m11058(str);
        if (iM11058 > 0) {
            int iM110582 = AbstractC5695.m11058(str2);
            int iIndexOf = indexOf(str, 0);
            while (iIndexOf >= 0) {
                replaceImpl(iIndexOf, iIndexOf + iM11058, iM11058, str2, iM110582);
                iIndexOf = indexOf(str, iIndexOf + iM110582);
            }
        }
        return this;
    }

    public StrBuilder replaceFirst(String str, String str2) {
        int iIndexOf;
        int iM11058 = AbstractC5695.m11058(str);
        if (iM11058 <= 0 || (iIndexOf = indexOf(str, 0)) < 0) {
            return this;
        }
        replaceImpl(iIndexOf, iIndexOf + iM11058, iM11058, str2, AbstractC5695.m11058(str2));
        return this;
    }

    public StrBuilder reverse() {
        int i = this.size;
        if (i != 0) {
            int i2 = i / 2;
            char[] cArr = this.buffer;
            int i3 = i - 1;
            int i4 = 0;
            while (i4 < i2) {
                char c = cArr[i4];
                cArr[i4] = cArr[i3];
                cArr[i3] = c;
                i4++;
                i3--;
            }
        }
        return this;
    }

    public String rightString(int i) {
        if (i <= 0) {
            return "";
        }
        int i2 = this.size;
        char[] cArr = this.buffer;
        return i >= i2 ? new String(cArr, 0, i2) : new String(cArr, i2 - i, i);
    }

    public StrBuilder setCharAt(int i, char c) {
        if (i < 0 || i >= length()) {
            throw new StringIndexOutOfBoundsException(i);
        }
        this.buffer[i] = c;
        return this;
    }

    public StrBuilder setLength(int i) {
        if (i < 0) {
            throw new StringIndexOutOfBoundsException(i);
        }
        int i2 = this.size;
        if (i < i2) {
            this.size = i;
            return this;
        }
        if (i > i2) {
            ensureCapacity(i);
            Arrays.fill(this.buffer, this.size, i, (char) 0);
            this.size = i;
        }
        return this;
    }

    public StrBuilder setNewLineText(String str) {
        this.newLine = str;
        return this;
    }

    public StrBuilder setNullText(String str) {
        if (AbstractC5695.m11059(str)) {
            str = null;
        }
        this.nullText = str;
        return this;
    }

    public int size() {
        return this.size;
    }

    public boolean startsWith(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length == 0) {
            return true;
        }
        if (length > this.size) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (this.buffer[i] != str.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        if (i < 0) {
            throw new StringIndexOutOfBoundsException(i);
        }
        if (i2 > this.size) {
            throw new StringIndexOutOfBoundsException(i2);
        }
        if (i <= i2) {
            return substring(i, i2);
        }
        throw new StringIndexOutOfBoundsException(i2 - i);
    }

    public String substring(int i, int i2) {
        return new String(this.buffer, i, validateRange(i, i2) - i);
    }

    public char[] toCharArray(int i, int i2) {
        int iValidateRange = validateRange(i, i2) - i;
        if (iValidateRange == 0) {
            return AbstractC5686.f15619;
        }
        char[] cArr = this.buffer;
        char[] cArrLambda$toCharArray$3 = lambda$toCharArray$3(iValidateRange);
        System.arraycopy(cArr, i, cArrLambda$toCharArray$3, 0, iValidateRange);
        return cArrLambda$toCharArray$3;
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return new String(this.buffer, 0, this.size);
    }

    public StringBuffer toStringBuffer() {
        StringBuffer stringBuffer = new StringBuffer(this.size);
        stringBuffer.append(this.buffer, 0, this.size);
        return stringBuffer;
    }

    public StringBuilder toStringBuilder() {
        StringBuilder sb = new StringBuilder(this.size);
        sb.append(this.buffer, 0, this.size);
        return sb;
    }

    public StrBuilder trim() {
        int i = this.size;
        if (i != 0) {
            char[] cArr = this.buffer;
            int i2 = 0;
            while (i2 < i && cArr[i2] <= ' ') {
                i2++;
            }
            while (i2 < i && cArr[i - 1] <= ' ') {
                i--;
            }
            int i3 = this.size;
            if (i < i3) {
                delete(i, i3);
            }
            if (i2 > 0) {
                delete(0, i2);
            }
        }
        return this;
    }

    public void validateIndex(int i) {
        if (i < 0 || i > this.size) {
            throw new StringIndexOutOfBoundsException(i);
        }
    }

    public int validateRange(int i, int i2) {
        if (i < 0) {
            throw new StringIndexOutOfBoundsException(i);
        }
        int i3 = this.size;
        if (i2 > i3) {
            i2 = i3;
        }
        if (i <= i2) {
            return i2;
        }
        throw new StringIndexOutOfBoundsException("end < start");
    }

    public String build() {
        return toString();
    }

    public StrBuilder appendln(char c) {
        return append(c).appendNewLine();
    }

    public StrBuilder appendln(char[] cArr) {
        return append(cArr).appendNewLine();
    }

    public StrBuilder appendln(char[] cArr, int i, int i2) {
        return append(cArr, i, i2).appendNewLine();
    }

    public StrBuilder appendln(double d) {
        return append(d).appendNewLine();
    }

    public StrBuilder appendln(float f) {
        return append(f).appendNewLine();
    }

    public String substring(int i) {
        return substring(i, this.size);
    }

    public StrBuilder appendSeparator(char c) {
        if (isNotEmpty()) {
            append(c);
        }
        return this;
    }

    public StrBuilder appendln(int i) {
        return append(i).appendNewLine();
    }

    public StrBuilder appendln(long j) {
        return append(j).appendNewLine();
    }

    public StrBuilder appendSeparator(char c, int i) {
        if (i > 0) {
            append(c);
        }
        return this;
    }

    public StrBuilder appendln(Object obj) {
        return append(obj).appendNewLine();
    }

    public StrBuilder appendSeparator(String str) {
        return appendSeparator(str, (String) null);
    }

    public StrBuilder appendln(StrBuilder strBuilder) {
        return append(strBuilder).appendNewLine();
    }

    public StrBuilder replace(AbstractC5648 abstractC5648, String str, int i, int i2, int i3) {
        return replaceImpl(abstractC5648, str, i, validateRange(i, i2), i3);
    }

    public StrBuilder appendSeparator(String str, int i) {
        if (str != null && i > 0) {
            append(str);
        }
        return this;
    }

    public StrBuilder appendln(StrBuilder strBuilder, int i, int i2) {
        return append(strBuilder, i, i2).appendNewLine();
    }

    public boolean contains(String str) {
        return indexOf(str, 0) >= 0;
    }

    public StrBuilder appendAll(Iterator<?> it) {
        if (it != null) {
            it.forEachRemaining(new C2664(this, 4));
        }
        return this;
    }

    public StrBuilder appendSeparator(String str, String str2) {
        if (isEmpty()) {
            str = str2;
        }
        if (str != null) {
            append(str);
        }
        return this;
    }

    public StrBuilder appendln(String str) {
        return append(str).appendNewLine();
    }

    public boolean contains(AbstractC5648 abstractC5648) {
        return indexOf(abstractC5648, 0) >= 0;
    }

    public StrBuilder appendAll(Iterable<?> iterable) {
        if (iterable != null) {
            iterable.forEach(new C2664(this, 4));
        }
        return this;
    }

    public StrBuilder appendln(String str, int i, int i2) {
        return append(str, i, i2).appendNewLine();
    }

    public StrBuilder appendln(String str, Object... objArr) {
        return append(str, objArr).appendNewLine();
    }

    public char[] toCharArray() {
        int i = this.size;
        if (i == 0) {
            return AbstractC5686.f15619;
        }
        char[] cArr = this.buffer;
        char[] cArrLambda$toCharArray$2 = lambda$toCharArray$2(i);
        System.arraycopy(cArr, 0, cArrLambda$toCharArray$2, 0, i);
        return cArrLambda$toCharArray$2;
    }

    public StrBuilder appendln(StringBuffer stringBuffer) {
        return append(stringBuffer).appendNewLine();
    }

    public StrBuilder deleteFirst(String str) {
        int iIndexOf;
        int iM11058 = AbstractC5695.m11058(str);
        if (iM11058 > 0 && (iIndexOf = indexOf(str, 0)) >= 0) {
            deleteImpl(iIndexOf, iIndexOf + iM11058, iM11058);
        }
        return this;
    }

    public StrBuilder appendln(StringBuffer stringBuffer, int i, int i2) {
        return append(stringBuffer, i, i2).appendNewLine();
    }

    public StrBuilder appendln(StringBuilder sb) {
        return append(sb).appendNewLine();
    }

    public StrBuilder(int i) {
        this.buffer = new char[i <= 0 ? 32 : i];
    }

    public StrBuilder appendln(StringBuilder sb, int i, int i2) {
        return append(sb, i, i2).appendNewLine();
    }

    public StrBuilder deleteFirst(AbstractC5648 abstractC5648) {
        return replace(abstractC5648, null, 0, this.size, 1);
    }

    public StrBuilder() {
        this(32);
    }

    public StrBuilder replaceFirst(char c, char c2) {
        if (c != c2) {
            for (int i = 0; i < this.size; i++) {
                char[] cArr = this.buffer;
                if (cArr[i] == c) {
                    cArr[i] = c2;
                    return this;
                }
            }
        }
        return this;
    }

    public int indexOf(char c, int i) {
        int iMax = Math.max(i, 0);
        if (iMax >= this.size) {
            return -1;
        }
        char[] cArr = this.buffer;
        while (iMax < this.size) {
            if (cArr[iMax] == c) {
                return iMax;
            }
            iMax++;
        }
        return -1;
    }

    public StrBuilder replaceFirst(AbstractC5648 abstractC5648, String str) {
        return replace(abstractC5648, str, 0, this.size, 1);
    }

    public boolean equals(Object obj) {
        return (obj instanceof StrBuilder) && equals((StrBuilder) obj);
    }

    public int indexOf(String str) {
        return indexOf(str, 0);
    }

    public StrBuilder replaceAll(char c, char c2) {
        if (c != c2) {
            for (int i = 0; i < this.size; i++) {
                char[] cArr = this.buffer;
                if (cArr[i] == c) {
                    cArr[i] = c2;
                }
            }
        }
        return this;
    }

    public int indexOf(String str, int i) {
        return C5691.f15623.m11056(i, this, str);
    }

    public StrBuilder deleteAll(String str) {
        int iM11058 = AbstractC5695.m11058(str);
        if (iM11058 > 0) {
            int iIndexOf = indexOf(str, 0);
            while (iIndexOf >= 0) {
                deleteImpl(iIndexOf, iIndexOf + iM11058, iM11058);
                iIndexOf = indexOf(str, iIndexOf);
            }
        }
        return this;
    }

    public int indexOf(AbstractC5648 abstractC5648) {
        return indexOf(abstractC5648, 0);
    }

    public StrBuilder appendWithSeparators(Iterator<?> it, String str) {
        if (it != null) {
            String string = Objects.toString(str, "");
            while (it.hasNext()) {
                append(it.next());
                if (it.hasNext()) {
                    append(string);
                }
            }
        }
        return this;
    }

    public int indexOf(char c) {
        return indexOf(c, 0);
    }

    public StrBuilder replaceAll(AbstractC5648 abstractC5648, String str) {
        return replace(abstractC5648, str, 0, this.size, -1);
    }

    public StrBuilder deleteAll(AbstractC5648 abstractC5648) {
        return replace(abstractC5648, null, 0, this.size, -1);
    }

    public char[] getChars(char[] cArr) {
        int length = length();
        if (cArr == null || cArr.length < length) {
            cArr = new char[length];
        }
        System.arraycopy(this.buffer, 0, cArr, 0, length);
        return cArr;
    }

    public StrBuilder appendWithSeparators(Object[] objArr, String str) {
        if (objArr != null && objArr.length > 0) {
            String string = Objects.toString(str, "");
            append(objArr[0]);
            for (int i = 1; i < objArr.length; i++) {
                append(string);
                append(objArr[i]);
            }
        }
        return this;
    }

    private void replaceImpl(int i, int i2, int i3, String str, int i4) {
        int i5 = (this.size - i3) + i4;
        if (i4 != i3) {
            ensureCapacity(i5);
            char[] cArr = this.buffer;
            System.arraycopy(cArr, i2, cArr, i + i4, this.size - i2);
            this.size = i5;
        }
        if (i4 > 0) {
            str.getChars(0, i4, this.buffer, i);
        }
    }

    public StrBuilder appendFixedWidthPadRight(int i, int i2, char c) {
        return appendFixedWidthPadRight(String.valueOf(i), i2, c);
    }

    public StrBuilder appendFixedWidthPadLeft(int i, int i2, char c) {
        return appendFixedWidthPadLeft(String.valueOf(i), i2, c);
    }

    public int lastIndexOf(char c) {
        return lastIndexOf(c, this.size - 1);
    }

    public int lastIndexOf(char c, int i) {
        int i2 = this.size;
        if (i >= i2) {
            i = i2 - 1;
        }
        if (i < 0) {
            return -1;
        }
        while (i >= 0) {
            if (this.buffer[i] == c) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public int lastIndexOf(String str) {
        return lastIndexOf(str, this.size - 1);
    }

    public int lastIndexOf(AbstractC5648 abstractC5648) {
        return lastIndexOf(abstractC5648, this.size);
    }

    public int lastIndexOf(AbstractC5648 abstractC5648, int i) {
        int i2 = this.size;
        if (i >= i2) {
            i = i2 - 1;
        }
        if (abstractC5648 == null || i < 0) {
            return -1;
        }
        char[] cArr = this.buffer;
        while (i >= 0) {
            if (abstractC5648.mo11032(i, cArr) > 0) {
                return i;
            }
            i--;
        }
        return -1;
    }

    @Override // java.lang.Appendable
    public StrBuilder append(char c) {
        ensureCapacity(length() + 1);
        char[] cArr = this.buffer;
        int i = this.size;
        this.size = i + 1;
        cArr[i] = c;
        return this;
    }

    public StrBuilder append(char[] cArr) {
        if (cArr == null) {
            return appendNull();
        }
        int length = cArr.length;
        if (length > 0) {
            int length2 = length();
            ensureCapacity(length2 + length);
            System.arraycopy(cArr, 0, this.buffer, length2, length);
            this.size += length;
        }
        return this;
    }

    public StrBuilder insert(int i, char c) {
        validateIndex(i);
        ensureCapacity(this.size + 1);
        char[] cArr = this.buffer;
        System.arraycopy(cArr, i, cArr, i + 1, this.size - i);
        this.buffer[i] = c;
        this.size++;
        return this;
    }

    public StrBuilder append(char[] cArr, int i, int i2) {
        if (cArr == null) {
            return appendNull();
        }
        if (i >= 0 && i <= cArr.length) {
            if (i2 < 0 || i + i2 > cArr.length) {
                throw new StringIndexOutOfBoundsException(AbstractC6183.m11588(i2, "Invalid length: "));
            }
            if (i2 > 0) {
                int length = length();
                ensureCapacity(length + i2);
                System.arraycopy(cArr, i, this.buffer, length, i2);
                this.size += i2;
            }
            return this;
        }
        throw new StringIndexOutOfBoundsException(AbstractC6183.m11588(i2, "Invalid startIndex: "));
    }

    public StrBuilder insert(int i, char[] cArr) {
        validateIndex(i);
        if (cArr == null) {
            return insert(i, this.nullText);
        }
        int length = cArr.length;
        if (length > 0) {
            ensureCapacity(this.size + length);
            char[] cArr2 = this.buffer;
            System.arraycopy(cArr2, i, cArr2, i + length, this.size - i);
            System.arraycopy(cArr, 0, this.buffer, i, length);
            this.size += length;
        }
        return this;
    }

    public StrBuilder insert(int i, char[] cArr, int i2, int i3) {
        validateIndex(i);
        if (cArr == null) {
            return insert(i, this.nullText);
        }
        if (i2 >= 0 && i2 <= cArr.length) {
            if (i3 < 0 || i2 + i3 > cArr.length) {
                throw new StringIndexOutOfBoundsException(AbstractC6183.m11588(i3, "Invalid length: "));
            }
            if (i3 > 0) {
                ensureCapacity(this.size + i3);
                char[] cArr2 = this.buffer;
                System.arraycopy(cArr2, i, cArr2, i + i3, this.size - i);
                System.arraycopy(cArr, i2, this.buffer, i, i3);
                this.size += i3;
            }
            return this;
        }
        throw new StringIndexOutOfBoundsException(AbstractC6183.m11588(i2, "Invalid offset: "));
    }

    public StrBuilder append(CharBuffer charBuffer) {
        if (charBuffer == null) {
            return appendNull();
        }
        if (charBuffer.hasArray()) {
            int iRemaining = charBuffer.remaining();
            int length = length();
            ensureCapacity(length + iRemaining);
            System.arraycopy(charBuffer.array(), charBuffer.position() + charBuffer.arrayOffset(), this.buffer, length, iRemaining);
            this.size += iRemaining;
            return this;
        }
        append(charBuffer.toString());
        return this;
    }

    public StrBuilder append(CharBuffer charBuffer, int i, int i2) {
        if (charBuffer == null) {
            return appendNull();
        }
        if (charBuffer.hasArray()) {
            int iRemaining = charBuffer.remaining();
            if (i < 0 || i > iRemaining) {
                throw new StringIndexOutOfBoundsException("startIndex must be valid");
            }
            if (i2 >= 0 && i + i2 <= iRemaining) {
                int length = length();
                ensureCapacity(length + i2);
                System.arraycopy(charBuffer.array(), charBuffer.position() + charBuffer.arrayOffset() + i, this.buffer, length, i2);
                this.size += i2;
                return this;
            }
            throw new StringIndexOutOfBoundsException("length must be valid");
        }
        append(charBuffer.toString(), i, i2);
        return this;
    }

    public StrBuilder insert(int i, double d) {
        return insert(i, String.valueOf(d));
    }

    public StrBuilder insert(int i, float f) {
        return insert(i, String.valueOf(f));
    }

    public StrBuilder insert(int i, int i2) {
        return insert(i, String.valueOf(i2));
    }

    public StrBuilder insert(int i, long j) {
        return insert(i, String.valueOf(j));
    }

    public StrBuilder insert(int i, Object obj) {
        if (obj == null) {
            return insert(i, this.nullText);
        }
        return insert(i, obj.toString());
    }

    @Override // java.lang.Appendable
    public StrBuilder append(CharSequence charSequence) {
        if (charSequence == null) {
            return appendNull();
        }
        if (charSequence instanceof StrBuilder) {
            return append((StrBuilder) charSequence);
        }
        if (charSequence instanceof StringBuilder) {
            return append((StringBuilder) charSequence);
        }
        if (charSequence instanceof StringBuffer) {
            return append((StringBuffer) charSequence);
        }
        if (charSequence instanceof CharBuffer) {
            return append((CharBuffer) charSequence);
        }
        return append(charSequence.toString());
    }

    public StrBuilder insert(int i, String str) {
        int length;
        validateIndex(i);
        if (str == null) {
            str = this.nullText;
        }
        if (str != null && (length = str.length()) > 0) {
            int i2 = this.size + length;
            ensureCapacity(i2);
            char[] cArr = this.buffer;
            System.arraycopy(cArr, i, cArr, i + length, this.size - i);
            this.size = i2;
            str.getChars(0, length, this.buffer, i);
        }
        return this;
    }

    @Override // java.lang.Appendable
    public StrBuilder append(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            return appendNull();
        }
        return append(charSequence.toString(), i, i2);
    }

    public StrBuilder append(double d) {
        return append(String.valueOf(d));
    }

    public StrBuilder append(float f) {
        return append(String.valueOf(f));
    }

    public StrBuilder append(int i) {
        return append(String.valueOf(i));
    }

    public StrBuilder append(long j) {
        return append(String.valueOf(j));
    }

    public StrBuilder append(Object obj) {
        if (obj == null) {
            return appendNull();
        }
        if (obj instanceof CharSequence) {
            return append((CharSequence) obj);
        }
        return append(obj.toString());
    }

    public StrBuilder append(StrBuilder strBuilder) {
        if (strBuilder == null) {
            return appendNull();
        }
        int length = strBuilder.length();
        if (length > 0) {
            int length2 = length();
            ensureCapacity(length2 + length);
            System.arraycopy(strBuilder.buffer, 0, this.buffer, length2, length);
            this.size += length;
        }
        return this;
    }

    public StrBuilder append(StrBuilder strBuilder, int i, int i2) {
        int i3;
        if (strBuilder == null) {
            return appendNull();
        }
        if (i >= 0 && i <= strBuilder.length()) {
            if (i2 < 0 || (i3 = i + i2) > strBuilder.length()) {
                throw new StringIndexOutOfBoundsException("length must be valid");
            }
            if (i2 > 0) {
                int length = length();
                ensureCapacity(length + i2);
                strBuilder.getChars(i, i3, this.buffer, length);
                this.size += i2;
            }
            return this;
        }
        throw new StringIndexOutOfBoundsException("startIndex must be valid");
    }

    public StrBuilder append(String str) {
        if (str == null) {
            return appendNull();
        }
        int length = str.length();
        if (length > 0) {
            int length2 = length();
            ensureCapacity(length2 + length);
            str.getChars(0, length, this.buffer, length2);
            this.size += length;
        }
        return this;
    }

    public StrBuilder append(String str, int i, int i2) {
        int i3;
        if (str == null) {
            return appendNull();
        }
        if (i >= 0 && i <= str.length()) {
            if (i2 < 0 || (i3 = i + i2) > str.length()) {
                throw new StringIndexOutOfBoundsException("length must be valid");
            }
            if (i2 > 0) {
                int length = length();
                ensureCapacity(length + i2);
                str.getChars(i, i3, this.buffer, length);
                this.size += i2;
            }
            return this;
        }
        throw new StringIndexOutOfBoundsException("startIndex must be valid");
    }

    public StrBuilder append(String str, Object... objArr) {
        return append(String.format(str, objArr));
    }

    public StrBuilder append(StringBuffer stringBuffer) {
        if (stringBuffer == null) {
            return appendNull();
        }
        int length = stringBuffer.length();
        if (length > 0) {
            int length2 = length();
            ensureCapacity(length2 + length);
            stringBuffer.getChars(0, length, this.buffer, length2);
            this.size += length;
        }
        return this;
    }

    public StrBuilder append(StringBuffer stringBuffer, int i, int i2) {
        int i3;
        if (stringBuffer == null) {
            return appendNull();
        }
        if (i >= 0 && i <= stringBuffer.length()) {
            if (i2 < 0 || (i3 = i + i2) > stringBuffer.length()) {
                throw new StringIndexOutOfBoundsException("length must be valid");
            }
            if (i2 > 0) {
                int length = length();
                ensureCapacity(length + i2);
                stringBuffer.getChars(i, i3, this.buffer, length);
                this.size += i2;
            }
            return this;
        }
        throw new StringIndexOutOfBoundsException("startIndex must be valid");
    }

    public StrBuilder append(StringBuilder sb) {
        if (sb == null) {
            return appendNull();
        }
        int length = sb.length();
        if (length > 0) {
            int length2 = length();
            ensureCapacity(length2 + length);
            sb.getChars(0, length, this.buffer, length2);
            this.size += length;
        }
        return this;
    }

    public StrBuilder append(StringBuilder sb, int i, int i2) {
        int i3;
        if (sb == null) {
            return appendNull();
        }
        if (i >= 0 && i <= sb.length()) {
            if (i2 < 0 || (i3 = i + i2) > sb.length()) {
                throw new StringIndexOutOfBoundsException("length must be valid");
            }
            if (i2 > 0) {
                int length = length();
                ensureCapacity(length + i2);
                sb.getChars(i, i3, this.buffer, length);
                this.size += i2;
            }
            return this;
        }
        throw new StringIndexOutOfBoundsException("startIndex must be valid");
    }
}
