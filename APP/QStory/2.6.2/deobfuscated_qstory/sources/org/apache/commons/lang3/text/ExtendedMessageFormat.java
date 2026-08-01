package org.apache.commons.lang3.text;

import bsh.C2641;
import com.alibaba.fastjson2.C2941;
import java.text.Format;
import java.text.MessageFormat;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import org.apache.commons.lang3.AbstractC5692;
import p007.AbstractC6136;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class ExtendedMessageFormat extends MessageFormat {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String EMPTY_PATTERN = "";
    private static final char END_FE = '}';
    private static final char QUOTE = '\'';
    private static final char START_FE = '{';
    private static final char START_FMT = ',';
    private static final long serialVersionUID = -2362048321261811743L;
    private final Map<String, Object> registry;
    private String toPattern;

    public ExtendedMessageFormat(String str, Locale locale, Map<String, Object> map) {
        super("");
        int i = AbstractC5692.f15626;
        setLocale(locale == null ? Locale.getDefault() : locale);
        this.registry = map;
        applyPattern(str);
    }

    private StringBuilder appendQuotedString(String str, ParsePosition parsePosition, StringBuilder sb) {
        if (sb != null) {
            sb.append(QUOTE);
        }
        next(parsePosition);
        int index = parsePosition.getIndex();
        char[] charArray = str.toCharArray();
        for (int index2 = parsePosition.getIndex(); index2 < str.length(); index2++) {
            if (charArray[parsePosition.getIndex()] == '\'') {
                next(parsePosition);
                if (sb == null) {
                    return null;
                }
                sb.append(charArray, index, parsePosition.getIndex() - index);
                return sb;
            }
            next(parsePosition);
        }
        C5919.m11249(AbstractC6136.m11556(index, "Unterminated quoted string at position "));
        return null;
    }

    private boolean containsElements(Collection<?> collection) {
        if (collection == null || collection.isEmpty()) {
            return false;
        }
        return collection.stream().anyMatch(new C2641(5));
    }

    private Format getFormat(String str) {
        if (this.registry != null) {
            int iIndexOf = str.indexOf(44);
            if (iIndexOf > 0) {
                String strTrim = str.substring(0, iIndexOf).trim();
                str.substring(iIndexOf + 1);
                str = strTrim;
            }
            if (this.registry.get(str) != null) {
                C2941.m6336();
            }
        }
        return null;
    }

    private void getQuotedString(String str, ParsePosition parsePosition) {
        appendQuotedString(str, parsePosition, null);
    }

    private String insertFormats(String str, ArrayList<String> arrayList) {
        String str2;
        if (!containsElements(arrayList)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length() * 2);
        int i = 0;
        ParsePosition parsePosition = new ParsePosition(0);
        int i2 = -1;
        while (parsePosition.getIndex() < str.length()) {
            char cCharAt = str.charAt(parsePosition.getIndex());
            if (cCharAt == '\'') {
                appendQuotedString(str, parsePosition, sb);
            } else if (cCharAt != '{') {
                if (cCharAt == '}') {
                    i--;
                }
                sb.append(cCharAt);
                next(parsePosition);
            } else {
                i++;
                sb.append(START_FE);
                sb.append(readArgumentIndex(str, next(parsePosition)));
                if (i == 1 && (str2 = arrayList.get((i2 = i2 + 1))) != null) {
                    sb.append(START_FMT);
                    sb.append(str2);
                }
            }
        }
        return sb.toString();
    }

    private ParsePosition next(ParsePosition parsePosition) {
        parsePosition.setIndex(parsePosition.getIndex() + 1);
        return parsePosition;
    }

    private String parseFormatDescription(String str, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        seekNonWs(str, parsePosition);
        int index2 = parsePosition.getIndex();
        int i = 1;
        while (parsePosition.getIndex() < str.length()) {
            char cCharAt = str.charAt(parsePosition.getIndex());
            if (cCharAt == '\'') {
                getQuotedString(str, parsePosition);
            } else if (cCharAt == '{') {
                i++;
            } else if (cCharAt == '}' && i - 1 == 0) {
                return str.substring(index2, parsePosition.getIndex());
            }
            next(parsePosition);
        }
        C5919.m11249(AbstractC6136.m11556(index, "Unterminated format element at position "));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e A[PHI: r3
  0x003e: PHI (r3v4 char) = (r3v3 char), (r3v8 char), (r3v8 char) binds: [B:7:0x002b, B:9:0x0038, B:10:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int readArgumentIndex(java.lang.String r9, java.text.ParsePosition r10) {
        /*
            r8 = this;
            int r0 = r10.getIndex()
            r8.seekNonWs(r9, r10)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 0
            r3 = r2
        Le:
            if (r3 != 0) goto L5e
            int r4 = r10.getIndex()
            int r5 = r9.length()
            if (r4 >= r5) goto L5e
            int r3 = r10.getIndex()
            char r3 = r9.charAt(r3)
            boolean r4 = java.lang.Character.isWhitespace(r3)
            r5 = 1
            r6 = 125(0x7d, float:1.75E-43)
            r7 = 44
            if (r4 == 0) goto L3e
            r8.seekNonWs(r9, r10)
            int r3 = r10.getIndex()
            char r3 = r9.charAt(r3)
            if (r3 == r7) goto L3e
            if (r3 == r6) goto L3e
            r3 = r5
            goto L5a
        L3e:
            if (r3 == r7) goto L42
            if (r3 != r6) goto L51
        L42:
            int r4 = r1.length()
            if (r4 <= 0) goto L51
            java.lang.String r4 = r1.toString()     // Catch: java.lang.NumberFormatException -> L51
            int r8 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> L51
            return r8
        L51:
            boolean r4 = java.lang.Character.isDigit(r3)
            r4 = r4 ^ r5
            r1.append(r3)
            r3 = r4
        L5a:
            r8.next(r10)
            goto Le
        L5e:
            if (r3 == 0) goto L74
            java.lang.String r8 = "Invalid format argument index at position "
            java.lang.String r1 = ": "
            java.lang.StringBuilder r8 = androidx.activity.AbstractC0053.m148(r0, r8, r1)
            int r10 = r10.getIndex()
            java.lang.String r9 = r9.substring(r0, r10)
            io.ktor.util.C4210.m8613(r9, r8)
            return r2
        L74:
            java.lang.String r8 = "Unterminated format element at position "
            java.lang.String r8 = p007.AbstractC6136.m11556(r0, r8)
            top.suzhelan.qstory.hook.item.C5919.m11249(r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.lang3.text.ExtendedMessageFormat.readArgumentIndex(java.lang.String, java.text.ParsePosition):int");
    }

    private void seekNonWs(String str, ParsePosition parsePosition) {
        char[] charArray = str.toCharArray();
        do {
            C5641 c5641 = AbstractC5647.f15541;
            int index = parsePosition.getIndex();
            c5641.getClass();
            int length = charArray.length;
            int iMo10975 = c5641.mo10975(index, charArray);
            parsePosition.setIndex(parsePosition.getIndex() + iMo10975);
            if (iMo10975 <= 0) {
                return;
            }
        } while (parsePosition.getIndex() < str.length());
    }

    @Override // java.text.MessageFormat
    public final void applyPattern(String str) {
        String formatDescription;
        Format format;
        if (this.registry == null) {
            super.applyPattern(str);
            this.toPattern = super.toPattern();
            return;
        }
        ArrayList<Format> arrayList = new ArrayList();
        ArrayList<String> arrayList2 = new ArrayList<>();
        StringBuilder sb = new StringBuilder(str.length());
        int i = 0;
        ParsePosition parsePosition = new ParsePosition(0);
        char[] charArray = str.toCharArray();
        int i2 = 0;
        while (parsePosition.getIndex() < str.length()) {
            char c = charArray[parsePosition.getIndex()];
            if (c != '\'') {
                if (c == '{') {
                    i2++;
                    seekNonWs(str, parsePosition);
                    int index = parsePosition.getIndex();
                    int argumentIndex = readArgumentIndex(str, next(parsePosition));
                    sb.append(START_FE);
                    sb.append(argumentIndex);
                    seekNonWs(str, parsePosition);
                    if (charArray[parsePosition.getIndex()] == ',') {
                        formatDescription = parseFormatDescription(str, next(parsePosition));
                        format = getFormat(formatDescription);
                        if (format == null) {
                            sb.append(START_FMT);
                            sb.append(formatDescription);
                        }
                    } else {
                        formatDescription = null;
                        format = null;
                    }
                    arrayList.add(format);
                    arrayList2.add(format != null ? formatDescription : null);
                    if (arrayList.size() != i2) {
                        C5919.m11249("The validated expression is false");
                        return;
                    } else if (arrayList2.size() != i2) {
                        C5919.m11249("The validated expression is false");
                        return;
                    } else if (charArray[parsePosition.getIndex()] != '}') {
                        C5919.m11249(AbstractC6136.m11556(index, "Unreadable format element at position "));
                        return;
                    }
                }
                sb.append(charArray[parsePosition.getIndex()]);
                next(parsePosition);
            } else {
                appendQuotedString(str, parsePosition, sb);
            }
        }
        super.applyPattern(sb.toString());
        this.toPattern = insertFormats(super.toPattern(), arrayList2);
        if (containsElements(arrayList)) {
            Format[] formats = getFormats();
            for (Format format2 : arrayList) {
                if (format2 != null) {
                    formats[i] = format2;
                }
                i++;
            }
            super.setFormats(formats);
        }
    }

    @Override // java.text.MessageFormat
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || !(obj instanceof ExtendedMessageFormat)) {
            return false;
        }
        ExtendedMessageFormat extendedMessageFormat = (ExtendedMessageFormat) obj;
        return Objects.equals(this.registry, extendedMessageFormat.registry) && Objects.equals(this.toPattern, extendedMessageFormat.toPattern);
    }

    @Override // java.text.MessageFormat
    public int hashCode() {
        return Objects.hash(this.registry, this.toPattern) + (super.hashCode() * 31);
    }

    @Override // java.text.MessageFormat
    public void setFormat(int i, Format format) {
        throw new UnsupportedOperationException();
    }

    @Override // java.text.MessageFormat
    public void setFormatByArgumentIndex(int i, Format format) {
        throw new UnsupportedOperationException();
    }

    @Override // java.text.MessageFormat
    public void setFormats(Format[] formatArr) {
        throw new UnsupportedOperationException();
    }

    @Override // java.text.MessageFormat
    public void setFormatsByArgumentIndex(Format[] formatArr) {
        throw new UnsupportedOperationException();
    }

    @Override // java.text.MessageFormat
    public String toPattern() {
        return this.toPattern;
    }

    public ExtendedMessageFormat(String str, Locale locale) {
        this(str, locale, null);
    }

    public ExtendedMessageFormat(String str) {
        this(str, Locale.getDefault());
    }

    public ExtendedMessageFormat(String str, Map<String, Object> map) {
        this(str, Locale.getDefault(), map);
    }
}
