package p387;

import java.io.StringWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import org.apache.commons.lang3.AbstractC6533;
import org.apache.commons.lang3.text.translate.NumericEntityUnescaper$OPTION;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言苏子哲兰楪世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9799 extends AbstractC9798 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f25541;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f25542 = 1;

    public C9799(NumericEntityUnescaper$OPTION[] numericEntityUnescaper$OPTIONArr) {
        if (numericEntityUnescaper$OPTIONArr.length > 0) {
            this.f25541 = EnumSet.copyOf((Collection) Arrays.asList(numericEntityUnescaper$OPTIONArr));
        } else {
            this.f25541 = EnumSet.copyOf((Collection) Collections.singletonList(NumericEntityUnescaper$OPTION.semiColonRequired));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008f A[Catch: NumberFormatException -> 0x00c9, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x00c9, blocks: (B:54:0x008f, B:55:0x009e), top: B:70:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009e A[Catch: NumberFormatException -> 0x00c9, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x00c9, blocks: (B:54:0x008f, B:55:0x009e), top: B:70:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c0  */
    @Override // p387.AbstractC9798
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo11619(CharSequence charSequence, int i, StringWriter stringWriter) {
        int i2;
        int i3;
        int i4;
        int i5 = this.f25542;
        Object obj = this.f25541;
        switch (i5) {
            case 0:
                for (AbstractC9798 abstractC9798 : (AbstractC9798[]) obj) {
                    int iMo11619 = abstractC9798.mo11619(charSequence, i, stringWriter);
                    if (iMo11619 != 0) {
                        return iMo11619;
                    }
                }
                return 0;
            default:
                EnumSet enumSet = (EnumSet) obj;
                int length = charSequence.length();
                if (charSequence.charAt(i) != '&' || i >= length - 2 || charSequence.charAt(i + 1) != '#') {
                    return 0;
                }
                int i6 = i + 2;
                char cCharAt = charSequence.charAt(i6);
                if (cCharAt == 'x' || cCharAt == 'X') {
                    i6 = i + 3;
                    if (i6 == length) {
                        return 0;
                    }
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                int i7 = i6;
                try {
                    while (i7 < length) {
                        char cCharAt2 = charSequence.charAt(i7);
                        int i8 = AbstractC6533.f15985;
                        if ((cCharAt2 < '0' || cCharAt2 > '9') && ((cCharAt2 < 'a' || cCharAt2 > 'f') && (cCharAt2 < 'A' || cCharAt2 > 'F'))) {
                            i3 = (i7 == length && charSequence.charAt(i7) == ';') ? 1 : 0;
                            if (i3 == 0) {
                                NumericEntityUnescaper$OPTION numericEntityUnescaper$OPTION = NumericEntityUnescaper$OPTION.semiColonRequired;
                                if (enumSet != null && enumSet.contains(numericEntityUnescaper$OPTION)) {
                                    return 0;
                                }
                                NumericEntityUnescaper$OPTION numericEntityUnescaper$OPTION2 = NumericEntityUnescaper$OPTION.errorIfNoSemiColon;
                                if (enumSet != null && enumSet.contains(numericEntityUnescaper$OPTION2)) {
                                    C6755.m11869("Semi-colon required at end of numeric entity");
                                    return 0;
                                }
                            }
                            i4 = i2 == 0 ? Integer.parseInt(charSequence.subSequence(i6, i7).toString(), 16) : Integer.parseInt(charSequence.subSequence(i6, i7).toString(), 10);
                            if (i4 <= 65535) {
                                char[] chars = Character.toChars(i4);
                                stringWriter.write(chars[0]);
                                stringWriter.write(chars[1]);
                            } else {
                                stringWriter.write(i4);
                            }
                            return ((i7 + 2) - i6) + i2 + i3;
                        }
                        i7++;
                    }
                    if (i2 == 0) {
                    }
                    if (i4 <= 65535) {
                    }
                    return ((i7 + 2) - i6) + i2 + i3;
                } catch (NumberFormatException unused) {
                    return 0;
                }
                if (i7 == length) {
                }
                if (i3 == 0) {
                }
                break;
        }
    }

    public C9799(AbstractC9798[] abstractC9798Arr) {
        this.f25541 = (AbstractC9798[]) ((Object[]) abstractC9798Arr.clone());
    }
}
