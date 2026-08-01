package p147;

import android.util.Log;
import androidx.activity.AbstractC0053;
import androidx.window.core.VerificationMode;
import androidx.window.core.WindowStrictModeException;
import com.alibaba.fastjson2.AbstractC2904;
import io.ktor.util.C4210;
import java.util.Arrays;
import java.util.Collection;
import kotlin.collections.AbstractC4346;
import kotlin.collections.EmptyList;
import p052.InterfaceC6557;
import p253.AbstractC8189;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言子兰苏哲世楪.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7568 extends AbstractC2904 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final VerificationMode f20489;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String f20490;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object f20491;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final WindowStrictModeException f20492;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7568(Object obj, String str, C7567 c7567, VerificationMode verificationMode) {
        Collection collectionAsList;
        super(16);
        obj.getClass();
        verificationMode.getClass();
        this.f20491 = obj;
        this.f20490 = str;
        this.f20489 = verificationMode;
        WindowStrictModeException windowStrictModeException = new WindowStrictModeException(str + " value: " + obj);
        StackTraceElement[] stackTrace = windowStrictModeException.getStackTrace();
        stackTrace.getClass();
        int length = stackTrace.length + (-2);
        length = length < 0 ? 0 : length;
        if (length < 0) {
            C5919.m11253(AbstractC0053.m161(length, "Requested element count ", " is less than zero."));
            throw null;
        }
        if (length == 0) {
            collectionAsList = EmptyList.INSTANCE;
        } else {
            int length2 = stackTrace.length;
            if (length >= length2) {
                collectionAsList = AbstractC4346.m8850(stackTrace);
            } else if (length == 1) {
                collectionAsList = AbstractC8189.m13660(stackTrace[length2 - 1]);
            } else {
                collectionAsList = Arrays.asList(AbstractC4346.m8862(stackTrace, length2 - length, length2));
                collectionAsList.getClass();
            }
        }
        windowStrictModeException.setStackTrace((StackTraceElement[]) collectionAsList.toArray(new StackTraceElement[0]));
        this.f20492 = windowStrictModeException;
    }

    @Override // com.alibaba.fastjson2.AbstractC2904
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final Object mo6283() throws WindowStrictModeException {
        int i = AbstractC7569.f20493[this.f20489.ordinal()];
        if (i == 1) {
            throw this.f20492;
        }
        if (i != 2) {
            if (i == 3) {
                return null;
            }
            C4210.m8621();
            return null;
        }
        Object obj = this.f20491;
        obj.getClass();
        Log.d("飘花落叶言子楪苏世哲兰", this.f20490 + " value: " + obj);
        return null;
    }

    @Override // com.alibaba.fastjson2.AbstractC2904
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲 */
    public final AbstractC2904 mo6273(String str, InterfaceC6557 interfaceC6557) {
        return this;
    }
}
