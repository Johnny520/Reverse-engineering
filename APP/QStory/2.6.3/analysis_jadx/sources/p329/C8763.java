package p329;

import androidx.activity.AbstractC0053;
import com.alibaba.fastjson2.AbstractC2905;
import kotlin.Result;
import p052.InterfaceC6554;
import p088.AbstractC7176;
import p088.C7152;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言苏世哲楪兰子.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8763 implements InterfaceC8769 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC6554 f24691;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C7152 f24692;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f24693;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f24694;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f24695;

    public C8763(String str, String str2, String str3, C7152 c7152, InterfaceC6554 interfaceC6554) {
        AbstractC8405.m13973("喵喵喵呜呜喵呜喵~喵喵喵呜喵喵喵呜");
        AbstractC8405.m13973("喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵呜喵喵~喵喵喵喵喵喵喵喵");
        AbstractC8405.m13972(2300);
        AbstractC8405.m13972(2336);
        AbstractC8405.m13973("喵喵喵呜喵喵喵呜~喵喵喵呜呜喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵喵呜呜呜喵");
        this.f24695 = str;
        this.f24694 = str2;
        this.f24693 = str3;
        this.f24692 = c7152;
        this.f24691 = interfaceC6554;
    }

    @Override // p329.InterfaceC8769
    public final String getId() {
        return this.f24695;
    }

    @Override // p329.InterfaceC8769
    public final String getTitle() {
        return this.f24694;
    }

    @Override // p329.InterfaceC8769
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object mo14451(C7152 c7152, AbstractC7176 abstractC7176) {
        Object objM163;
        C7152 c7152M14454 = AbstractC8765.m14454(AbstractC8405.m13972(2486), c7152);
        if (c7152M14454 == null) {
            c7152M14454 = AbstractC8765.m14459();
        }
        try {
            objM163 = Result.m8745constructorimpl((C7152) this.f24691.invoke(c7152M14454, abstractC7176));
        } catch (Throwable th) {
            objM163 = AbstractC0053.m163(th);
        }
        Throwable thM8748exceptionOrNullimpl = Result.m8748exceptionOrNullimpl(objM163);
        if (thM8748exceptionOrNullimpl == null) {
            return objM163;
        }
        String message = thM8748exceptionOrNullimpl.getMessage();
        if (message == null) {
            message = thM8748exceptionOrNullimpl.toString();
        }
        return AbstractC2905.m6331(message, abstractC7176, true);
    }

    @Override // p329.InterfaceC8769
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7152 mo14452() {
        return this.f24692;
    }

    @Override // p329.InterfaceC8769
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String mo14453() {
        return this.f24693;
    }
}
