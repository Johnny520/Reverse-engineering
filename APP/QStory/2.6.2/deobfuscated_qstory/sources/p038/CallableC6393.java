package p038;

import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedHelpers;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import p032.AbstractC6317;
import p032.C6316;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CallableC6393 implements Callable {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Object f17539;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C6415 f17540;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f17541;

    public /* synthetic */ CallableC6393(C6415 c6415, Object obj, int i) {
        this.f17541 = i;
        this.f17540 = c6415;
        this.f17539 = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.f17541;
        Class cls = Integer.TYPE;
        Class cls2 = Long.TYPE;
        Object obj = this.f17539;
        C6415 c6415 = this.f17540;
        switch (i) {
            case 0:
                C6316 c6316M11826 = C6316.m11826(obj.getClass());
                c6316M11826.f17409.f3617 = "getMsgRecord";
                Object objM11828 = c6316M11826.m11828(obj, new Object[0]);
                long jLongValue = ((Long) AbstractC6317.m11831(cls2, "msgId", objM11828)).longValue();
                ArrayList arrayList = (ArrayList) AbstractC6317.m11831(ArrayList.class, "elements", objM11828);
                StringBuilder sb = new StringBuilder();
                for (Object obj2 : arrayList) {
                    if (((Integer) AbstractC6317.m11831(cls, "elementType", obj2)).intValue() == 1) {
                        sb.append((String) XposedHelpers.callMethod(XposedHelpers.callMethod(obj2, "getTextElement", new Object[0]), "getContent", new Object[0]));
                    }
                }
                c6415.m11927(jLongValue, sb.toString());
                break;
            default:
                long jLongValue2 = ((Long) AbstractC6317.m11831(cls2, "msgId", obj)).longValue();
                ArrayList arrayList2 = (ArrayList) AbstractC6317.m11831(ArrayList.class, "elements", obj);
                StringBuilder sb2 = new StringBuilder();
                for (Object obj3 : arrayList2) {
                    if (((Integer) AbstractC6317.m11831(cls, "elementType", obj3)).intValue() == 1) {
                        sb2.append((String) XposedHelpers.callMethod(XposedHelpers.callMethod(obj3, "getTextElement", new Object[0]), "getContent", new Object[0]));
                    }
                }
                c6415.m11927(jLongValue2, sb2.toString());
                break;
        }
        return null;
    }
}
