package p026;

import android.util.Log;
import de.robv.android.xposed.XposedBridge;
import java.util.ArrayList;
import p010.AbstractC6188;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言世哲兰苏子楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6315 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC6314 f17429;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public ArrayList f17430;

    public C6315(AbstractC6314 abstractC6314) {
        this.f17429 = abstractC6314;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m11832(Throwable th) {
        if (this.f17430 == null) {
            this.f17430 = new ArrayList();
        }
        this.f17430.add(th);
        AbstractC6314 abstractC6314 = this.f17429;
        String strSubstring = abstractC6314.getItemPath().substring(abstractC6314.getItemPath().lastIndexOf(AbstractC8405.m13973("喵呜喵呜呜呜喵喵")) + 1);
        Log.e(AbstractC8405.m13972(773), strSubstring, th);
        String str = AbstractC6188.f17016;
        AbstractC6188.m11605(strSubstring, th.toString(), th, true);
        XposedBridge.log(th);
    }
}
