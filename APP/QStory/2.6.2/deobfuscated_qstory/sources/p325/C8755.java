package p325;

import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3056;
import kotlin.Result;
import p052.InterfaceC6553;
import p088.AbstractC7175;
import p088.C7151;

/* JADX INFO: renamed from: 飘花落叶言苏世哲兰子楪.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8755 implements InterfaceC8761 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC6553 f24666;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C7151 f24667;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f24668;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f24669;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f24670;

    public C8755(String str, String str2, String str3, C7151 c7151, InterfaceC6553 interfaceC6553) {
        "id";
        "title";
        "description";
        "inputSchema";
        "block";
        this.f24670 = str;
        this.f24669 = str2;
        this.f24668 = str3;
        this.f24667 = c7151;
        this.f24666 = interfaceC6553;
    }

    @Override // p325.InterfaceC8761
    public final String getId() {
        return this.f24670;
    }

    @Override // p325.InterfaceC8761
    public final String getTitle() {
        return this.f24669;
    }

    @Override // p325.InterfaceC8761
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object mo14417(C7151 c7151, AbstractC7175 abstractC7175) {
        Object objM162;
        C7151 c7151M14420 = AbstractC8757.m14420(c7151, "arguments");
        if (c7151M14420 == null) {
            c7151M14420 = AbstractC8757.m14425();
        }
        try {
            objM162 = Result.m8755constructorimpl((C7151) this.f24666.invoke(c7151M14420, abstractC7175));
        } catch (Throwable th) {
            objM162 = AbstractC0053.m162(th);
        }
        Throwable thM8758exceptionOrNullimpl = Result.m8758exceptionOrNullimpl(objM162);
        if (thM8758exceptionOrNullimpl == null) {
            return objM162;
        }
        String message = thM8758exceptionOrNullimpl.getMessage();
        if (message == null) {
            message = thM8758exceptionOrNullimpl.toString();
        }
        return AbstractC3056.m6699(message, abstractC7175, true);
    }

    @Override // p325.InterfaceC8761
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7151 mo14418() {
        return this.f24667;
    }

    @Override // p325.InterfaceC8761
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String mo14419() {
        return this.f24668;
    }
}
