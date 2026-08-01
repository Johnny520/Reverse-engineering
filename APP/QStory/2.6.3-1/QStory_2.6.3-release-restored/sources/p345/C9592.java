package p345;

import androidx.activity.AbstractC0900;
import com.alibaba.fastjson2.AbstractC3738;
import kotlin.Result;
import p068.InterfaceC7383;
import p104.AbstractC8005;
import p104.C7981;

/* JADX INFO: renamed from: 飘花落叶言苏世哲楪兰子.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9592 implements InterfaceC9598 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC7383 f25036;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C7981 f25037;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f25038;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f25039;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f25040;

    public C9592(String str, String str2, String str3, C7981 c7981, InterfaceC7383 interfaceC7383) {
        "id";
        "title";
        "description";
        "inputSchema";
        "block";
        this.f25040 = str;
        this.f25039 = str2;
        this.f25038 = str3;
        this.f25037 = c7981;
        this.f25036 = interfaceC7383;
    }

    @Override // p345.InterfaceC9598
    public final String getId() {
        return this.f25040;
    }

    @Override // p345.InterfaceC9598
    public final String getTitle() {
        return this.f25039;
    }

    @Override // p345.InterfaceC9598
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object mo15010(C7981 c7981, AbstractC8005 abstractC8005) {
        Object objM723;
        C7981 c7981M15013 = AbstractC9594.m15013("arguments", c7981);
        if (c7981M15013 == null) {
            c7981M15013 = AbstractC9594.m15018();
        }
        try {
            objM723 = Result.m9304constructorimpl((C7981) this.f25036.invoke(c7981M15013, abstractC8005));
        } catch (Throwable th) {
            objM723 = AbstractC0900.m723(th);
        }
        Throwable thM9307exceptionOrNullimpl = Result.m9307exceptionOrNullimpl(objM723);
        if (thM9307exceptionOrNullimpl == null) {
            return objM723;
        }
        String message = thM9307exceptionOrNullimpl.getMessage();
        if (message == null) {
            message = thM9307exceptionOrNullimpl.toString();
        }
        return AbstractC3738.m6891(message, abstractC8005, true);
    }

    @Override // p345.InterfaceC9598
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7981 mo15011() {
        return this.f25037;
    }

    @Override // p345.InterfaceC9598
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String mo15012() {
        return this.f25038;
    }
}
