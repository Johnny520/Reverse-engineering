package p163;

import android.util.Log;
import androidx.activity.AbstractC0900;
import androidx.window.core.VerificationMode;
import androidx.window.core.WindowStrictModeException;
import com.bumptech.glide.AbstractC3898;
import io.ktor.util.C5043;
import java.util.Arrays;
import java.util.Collection;
import kotlin.collections.AbstractC5179;
import kotlin.collections.EmptyList;
import p050.AbstractC7176;
import p068.InterfaceC7387;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言子兰苏哲世楪.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8398 extends AbstractC3898 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final WindowStrictModeException f20829;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final VerificationMode f20830;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f20831;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f20832;

    public C8398(Object obj, String str, C8397 c8397, VerificationMode verificationMode) {
        Collection collectionAsList;
        obj.getClass();
        verificationMode.getClass();
        this.f20832 = obj;
        this.f20831 = str;
        this.f20830 = verificationMode;
        WindowStrictModeException windowStrictModeException = new WindowStrictModeException(str + " value: " + obj);
        StackTraceElement[] stackTrace = windowStrictModeException.getStackTrace();
        stackTrace.getClass();
        int length = stackTrace.length + (-2);
        length = length < 0 ? 0 : length;
        if (length < 0) {
            C6755.m11873(AbstractC0900.m722(length, "Requested element count ", " is less than zero."));
            throw null;
        }
        if (length == 0) {
            collectionAsList = EmptyList.INSTANCE;
        } else {
            int length2 = stackTrace.length;
            if (length >= length2) {
                collectionAsList = AbstractC5179.m9405(stackTrace);
            } else if (length == 1) {
                collectionAsList = AbstractC7176.m12487(stackTrace[length2 - 1]);
            } else {
                collectionAsList = Arrays.asList(AbstractC5179.m9390(stackTrace, length2 - length, length2));
                collectionAsList.getClass();
            }
        }
        windowStrictModeException.setStackTrace((StackTraceElement[]) collectionAsList.toArray(new StackTraceElement[0]));
        this.f20829 = windowStrictModeException;
    }

    @Override // com.bumptech.glide.AbstractC3898
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final Object mo7432() throws WindowStrictModeException {
        int i = AbstractC8399.f20833[this.f20830.ordinal()];
        if (i == 1) {
            throw this.f20829;
        }
        if (i != 2) {
            if (i == 3) {
                return null;
            }
            C5043.m9170();
            return null;
        }
        Object obj = this.f20832;
        obj.getClass();
        Log.d("飘花落叶言子楪苏世哲兰", this.f20831 + " value: " + obj);
        return null;
    }

    @Override // com.bumptech.glide.AbstractC3898
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final AbstractC3898 mo7429(String str, InterfaceC7387 interfaceC7387) {
        return this;
    }
}
