package p026;

import android.util.Log;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedBridge;
import java.util.ArrayList;
import p010.AbstractC6157;

/* JADX INFO: renamed from: 飘花落叶言世哲兰苏楪子.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6297 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC6296 f17380;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public ArrayList f17381;

    public C6297(AbstractC6296 abstractC6296) {
        this.f17380 = abstractC6296;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m11804(Throwable th) {
        if (this.f17381 == null) {
            this.f17381 = new ArrayList();
        }
        this.f17381.add(th);
        AbstractC6296 abstractC6296 = this.f17380;
        String strSubstring = abstractC6296.getItemPath().substring(abstractC6296.getItemPath().lastIndexOf(AbstractC3056.m6668(-3937561854541563303L)) + 1);
        Log.e(AbstractC3056.m6668(-3937638034376492455L), strSubstring, th);
        String str = AbstractC6157.f16779;
        AbstractC6157.m11574(strSubstring, th.toString(), th, true);
        XposedBridge.log(th);
    }
}
