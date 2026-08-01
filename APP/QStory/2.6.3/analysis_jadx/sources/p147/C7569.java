package p147;

import android.util.Log;
import androidx.activity.AbstractC0053;
import androidx.window.core.VerificationMode;
import androidx.window.core.WindowStrictModeException;
import com.bumptech.glide.AbstractC3066;
import io.ktor.util.C4211;
import java.util.Arrays;
import java.util.Collection;
import kotlin.collections.AbstractC4347;
import kotlin.collections.EmptyList;
import p034.AbstractC6347;
import p052.InterfaceC6558;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言子兰苏哲世楪.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7569 extends AbstractC3066 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final WindowStrictModeException f20484;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final VerificationMode f20485;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f20486;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f20487;

    public C7569(Object obj, String str, C7568 c7568, VerificationMode verificationMode) {
        Collection collectionAsList;
        obj.getClass();
        verificationMode.getClass();
        this.f20487 = obj;
        this.f20486 = str;
        this.f20485 = verificationMode;
        WindowStrictModeException windowStrictModeException = new WindowStrictModeException(str + " value: " + obj);
        StackTraceElement[] stackTrace = windowStrictModeException.getStackTrace();
        stackTrace.getClass();
        int length = stackTrace.length + (-2);
        length = length < 0 ? 0 : length;
        if (length < 0) {
            C5925.m11314(AbstractC0053.m162(length, "Requested element count ", " is less than zero."));
            throw null;
        }
        if (length == 0) {
            collectionAsList = EmptyList.INSTANCE;
        } else {
            int length2 = stackTrace.length;
            if (length >= length2) {
                collectionAsList = AbstractC4347.m8846(stackTrace);
            } else if (length == 1) {
                collectionAsList = AbstractC6347.m11928(stackTrace[length2 - 1]);
            } else {
                collectionAsList = Arrays.asList(AbstractC4347.m8831(stackTrace, length2 - length, length2));
                collectionAsList.getClass();
            }
        }
        windowStrictModeException.setStackTrace((StackTraceElement[]) collectionAsList.toArray(new StackTraceElement[0]));
        this.f20484 = windowStrictModeException;
    }

    @Override // com.bumptech.glide.AbstractC3066
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final Object mo6872() throws WindowStrictModeException {
        int i = AbstractC7570.f20488[this.f20485.ordinal()];
        if (i == 1) {
            throw this.f20484;
        }
        if (i != 2) {
            if (i == 3) {
                return null;
            }
            C4211.m8611();
            return null;
        }
        Object obj = this.f20487;
        obj.getClass();
        Log.d("飘花落叶言子楪苏世哲兰", this.f20486 + " value: " + obj);
        return null;
    }

    @Override // com.bumptech.glide.AbstractC3066
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final AbstractC3066 mo6869(String str, InterfaceC6558 interfaceC6558) {
        return this;
    }
}
