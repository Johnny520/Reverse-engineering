package p042;

import android.util.Log;
import de.robv.android.xposed.XposedBridge;
import java.util.ArrayList;
import p026.AbstractC7017;
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言世哲兰苏子楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7144 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC7143 f17774;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public ArrayList f17775;

    public C7144(AbstractC7143 abstractC7143) {
        this.f17774 = abstractC7143;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m12391(Throwable th) {
        if (this.f17775 == null) {
            this.f17775 = new ArrayList();
        }
        this.f17775.add(th);
        AbstractC7143 abstractC7143 = this.f17774;
        String strSubstring = abstractC7143.getItemPath().substring(abstractC7143.getItemPath().lastIndexOf(AbstractC9234.m14532("喵呜喵呜呜呜喵喵")) + 1);
        Log.e(AbstractC9234.m14531(773), strSubstring, th);
        String str = AbstractC7017.f17361;
        AbstractC7017.m12164(strSubstring, th.toString(), th, true);
        XposedBridge.log(th);
    }
}
