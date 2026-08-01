package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import lin.xposed.hook.javaplugin.C6385;
import lin.xposed.hook.util.p011qq.QQNTSendMsgUtils;
import lin.xposed.hook.util.p011qq.QQSessionUtils;
import p025.AbstractC7012;
import p045.C7149;
import p049.AbstractC7165;
import p352.C9620;
import top.suzhelan.qstory.hook.item.C6755;
import top.suzhelan.qstory.hook.item.chat.C6672;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC0917 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Object f564;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Object f565;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f566;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object f567;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f568 = 0;

    public ViewOnClickListenerC0917(C6672 c6672, Object obj, Object obj2) {
        "msgRecord";
        "contact";
        this.f564 = c6672;
        this.f566 = obj;
        this.f567 = obj2;
        try {
            Object objM12418 = AbstractC7165.m12418(ArrayList.class, "elements", obj);
            "getField(...)";
            objM12418.getClass();
            this.f565 = (ArrayList) objM12418;
        } catch (Exception e) {
            C6755.m11872(e);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0055 A[Catch: Exception -> 0x0076, TryCatch #3 {Exception -> 0x0076, blocks: (B:5:0x0015, B:7:0x0032, B:11:0x0042, B:13:0x0046, B:16:0x004d, B:17:0x0055, B:20:0x0063, B:22:0x0067, B:25:0x006e), top: B:62:0x0015 }] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        Method method;
        switch (this.f568) {
            case 0:
                View view2 = (View) this.f566;
                if (((Method) this.f565) == null) {
                    Context context = view2.getContext();
                    String str = (String) this.f567;
                    while (context != null) {
                        try {
                            if (!context.isRestricted() && (method = context.getClass().getMethod(str, View.class)) != null) {
                                this.f565 = method;
                                this.f564 = context;
                            }
                            break;
                        } catch (NoSuchMethodException unused) {
                        }
                        context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
                    }
                    int id = view2.getId();
                    C6385.m11440(AbstractC7012.m12144("Could not find method ", str, "(View) in a parent or ancestor Context for android:onClick attribute defined on view "), view2.getClass(), id == -1 ? "" : " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'");
                }
                try {
                    ((Method) this.f565).invoke((Context) this.f564, view);
                } catch (IllegalAccessException e) {
                    C9620.m15032("Could not execute non-public method for android:onClick", e);
                    return;
                } catch (InvocationTargetException e2) {
                    C9620.m15032("Could not execute method for android:onClick", e2);
                    return;
                }
                break;
            default:
                ArrayList arrayList = (ArrayList) this.f565;
                C6672 c6672 = (C6672) this.f564;
                "v";
                view.getClass();
                try {
                    C7149 c7149 = c6672.f16343;
                    int i = c6672.f16341;
                    c7149.getClass();
                    if (((Boolean) c7149.m12399(Boolean.FALSE, "doubleClick")).booleanValue()) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        boolean z = jCurrentTimeMillis - C6672.f16337 >= ((long) i);
                        C6672.f16337 = jCurrentTimeMillis;
                        if (z) {
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            boolean z2 = jCurrentTimeMillis2 - C6672.f16337 >= ((long) i);
                            C6672.f16337 = jCurrentTimeMillis2;
                            if (z2 && !m805()) {
                                QQNTSendMsgUtils.sendMsg(QQSessionUtils.getCurrentContact(), arrayList);
                            }
                        } else if (!m805()) {
                            QQNTSendMsgUtils.sendMsg(QQSessionUtils.getCurrentContact(), arrayList);
                        }
                    }
                } catch (Exception e3) {
                    C6755.m11872(e3);
                    return;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean m805() {
        try {
            Iterator it = ((ArrayList) this.f565).iterator();
            "iterator(...)";
            it.getClass();
            while (it.hasNext()) {
                Object next = it.next();
                Integer num = (Integer) AbstractC7165.m12418(Integer.TYPE, "elementType", next);
                if (num != null && num.intValue() == 7) {
                    return false;
                }
                if (num == null || num.intValue() != 2) {
                    if (num == null || num.intValue() != 5) {
                        if (num != null && num.intValue() == 10) {
                        }
                    }
                }
                Object obj = this.f566;
                Long l = (Long) AbstractC7165.m12418(Long.TYPE, "msgId", obj);
                ArrayList arrayList = new ArrayList();
                arrayList.add(l);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(QQSessionUtils.getCurrentContact());
                QQNTSendMsgUtils.forwardMsg(arrayList, this.f567, arrayList2);
                return true;
            }
            return false;
        } catch (Exception e) {
            C6755.m11872(e);
            return false;
        }
    }

    public ViewOnClickListenerC0917(String str, View view) {
        this.f566 = view;
        this.f567 = str;
    }
}
