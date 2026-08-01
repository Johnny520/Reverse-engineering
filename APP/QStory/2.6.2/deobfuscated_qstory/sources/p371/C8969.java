package p371;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import org.apache.commons.lang3.text.translate.NumericEntityUnescaper$OPTION;

/* JADX INFO: renamed from: 飘花落叶言苏子哲兰世楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8969 extends AbstractC8968 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f25206;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f25207 = 1;

    public C8969(NumericEntityUnescaper$OPTION[] numericEntityUnescaper$OPTIONArr) {
        if (numericEntityUnescaper$OPTIONArr.length > 0) {
            this.f25206 = EnumSet.copyOf((Collection) Arrays.asList(numericEntityUnescaper$OPTIONArr));
        } else {
            this.f25206 = EnumSet.copyOf((Collection) Collections.singletonList(NumericEntityUnescaper$OPTION.semiColonRequired));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008f A[Catch: NumberFormatException -> 0x00c9, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x00c9, blocks: (B:54:0x008f, B:55:0x009e), top: B:70:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009e A[Catch: NumberFormatException -> 0x00c9, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x00c9, blocks: (B:54:0x008f, B:55:0x009e), top: B:70:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c0  */
    @Override // p371.AbstractC8968
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo11003(java.lang.CharSequence r8, int r9, java.io.StringWriter r10) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p371.C8969.mo11003(java.lang.CharSequence, int, java.io.StringWriter):int");
    }

    public C8969(AbstractC8968[] abstractC8968Arr) {
        this.f25206 = (AbstractC8968[]) ((Object[]) abstractC8968Arr.clone());
    }
}
