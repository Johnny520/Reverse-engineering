package androidx.appcompat.app;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import lin.xposed.hook.util.qq.QQNTSendMsgUtils;
import lin.xposed.hook.util.qq.QQSessionUtils;
import p033.AbstractC6336;
import p287.AbstractC8405;
import top.suzhelan.qstory.hook.item.C5925;
import top.suzhelan.qstory.hook.item.chat.C5842;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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

    public ViewOnClickListenerC0070(C5842 c5842, Object obj, Object obj2) {
        AbstractC8405.m13972(1909);
        AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵呜喵喵~喵喵喵喵呜呜呜呜~喵喵喵呜喵呜喵呜");
        this.f219 = c5842;
        this.f221 = obj;
        this.f222 = obj2;
        try {
            Object objM11859 = AbstractC6336.m11859(ArrayList.class, AbstractC8405.m13972(152), obj);
            AbstractC8405.m13972(1588);
            objM11859.getClass();
            this.f220 = (ArrayList) objM11859;
        } catch (Exception e) {
            C5925.m11313(e);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0055 A[Catch: Exception -> 0x0076, TryCatch #3 {Exception -> 0x0076, blocks: (B:5:0x0015, B:7:0x0032, B:11:0x0042, B:13:0x0046, B:16:0x004d, B:17:0x0055, B:20:0x0063, B:22:0x0067, B:25:0x006e), top: B:62:0x0015 }] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r11) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.ViewOnClickListenerC0070.onClick(android.view.View):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean m245() {
        try {
            Iterator it = ((ArrayList) this.f220).iterator();
            AbstractC8405.m13972(1253);
            it.getClass();
            while (it.hasNext()) {
                Object next = it.next();
                Integer num = (Integer) AbstractC6336.m11859(Integer.TYPE, AbstractC8405.m13972(338), next);
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
                Long l = (Long) AbstractC6336.m11859(Long.TYPE, AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜喵喵喵喵呜~喵喵喵喵喵喵喵呜"), obj);
                ArrayList arrayList = new ArrayList();
                arrayList.add(l);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(QQSessionUtils.getCurrentContact());
                QQNTSendMsgUtils.forwardMsg(arrayList, this.f222, arrayList2);
                return true;
            }
            return false;
        } catch (Exception e) {
            C5925.m11313(e);
            return false;
        }
    }

    public ViewOnClickListenerC0070(String str, View view) {
        this.f221 = view;
        this.f222 = str;
    }
}
