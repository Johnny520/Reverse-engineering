package androidx.appcompat.app;

import android.view.View;
import com.bumptech.glide.AbstractC3056;
import java.util.ArrayList;
import java.util.Iterator;
import lin.xposed.hook.util.qq.QQNTSendMsgUtils;
import lin.xposed.hook.util.qq.QQSessionUtils;
import p032.AbstractC6317;
import top.suzhelan.qstory.hook.item.C5919;
import top.suzhelan.qstory.hook.item.chat.C5841;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC0070 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Object f219;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Object f220;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f221;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object f222;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f223 = 0;

    public ViewOnClickListenerC0070(C5841 c5841, Object obj, Object obj2) {
        "msgRecord";
        "contact";
        this.f219 = c5841;
        this.f221 = obj;
        this.f222 = obj2;
        try {
            Object objM11831 = AbstractC6317.m11831(ArrayList.class, "elements", obj);
            "getField(...)";
            objM11831.getClass();
            this.f220 = (ArrayList) objM11831;
        } catch (Exception e) {
            C5919.m11252(e);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005b A[Catch: Exception -> 0x007c, TryCatch #1 {Exception -> 0x007c, blocks: (B:5:0x0018, B:7:0x0038, B:11:0x0048, B:13:0x004c, B:16:0x0053, B:17:0x005b, B:20:0x0069, B:22:0x006d, B:25:0x0074), top: B:60:0x0018 }] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r11) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.ViewOnClickListenerC0070.onClick(android.view.View):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean m244() {
        try {
            Iterator it = ((ArrayList) this.f220).iterator();
            "iterator(...)";
            it.getClass();
            while (it.hasNext()) {
                Object next = it.next();
                Integer num = (Integer) AbstractC6317.m11831(Integer.TYPE, "elementType", next);
                if (num != null && num.intValue() == 7) {
                    return false;
                }
                if (num == null || num.intValue() != 2) {
                    if (num == null || num.intValue() != 5) {
                        if (num != null && num.intValue() == 10) {
                        }
                    }
                }
                Object obj = this.f221;
                Long l = (Long) AbstractC6317.m11831(Long.TYPE, "msgId", obj);
                ArrayList arrayList = new ArrayList();
                arrayList.add(l);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(QQSessionUtils.getCurrentContact());
                QQNTSendMsgUtils.forwardMsg(arrayList, this.f222, arrayList2);
                return true;
            }
            return false;
        } catch (Exception e) {
            C5919.m11252(e);
            return false;
        }
    }

    public ViewOnClickListenerC0070(String str, View view) {
        this.f221 = view;
        this.f222 = str;
    }
}
