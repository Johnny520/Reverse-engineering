package p055;

import androidx.compose.runtime.internal.C2080;
import bsh.C3466;
import com.bumptech.glide.AbstractC3888;
import com.google.gson.internal.C4056;
import java.lang.reflect.Method;
import p035.C7092;
import p042.AbstractC7140;
import p049.AbstractC7162;
import p049.AbstractC7166;
import p049.C7164;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C7240 extends AbstractC7140 {
    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) throws ClassNotFoundException {
        Method methodM12414;
        boolean zM7256 = AbstractC3888.m7256();
        Class cls = Boolean.TYPE;
        Class cls2 = Void.TYPE;
        if (!zM7256) {
            m12390(AbstractC7162.m12409("com.tencent.mobileqq.app.QQAppInterface", "notifyMessageReceived", cls2, new Class[]{AbstractC7166.m12425("com.tencent.imcore.message.Message"), cls, cls}), new C7092(5));
            return;
        }
        Class<?> clsLoadClass = classLoader.loadClass("com.tencent.qqnt.notification.NotificationFacade");
        Class clsM12425 = AbstractC7166.m12425("mqq.app.AppRuntime");
        Class clsM124252 = AbstractC7166.m12425("com.tencent.qqnt.kernel.nativeinterface.NotificationCommonInfo");
        Class clsM124253 = AbstractC7166.m12425("com.tencent.qqnt.kernel.nativeinterface.RecentContactInfo");
        C7164 c7164M12413 = C7164.m12413(clsLoadClass);
        C2080 c2080 = c7164M12413.f17803;
        c2080.f3962 = cls2;
        c2080.f3964 = new Class[]{clsM12425, Object.class, clsM124252};
        Method methodM124142 = null;
        try {
            methodM12414 = c7164M12413.m12414();
        } catch (Exception unused) {
            methodM12414 = null;
        }
        if (methodM12414 == null) {
            C7164 c7164M124132 = C7164.m12413(clsLoadClass);
            C2080 c20802 = c7164M124132.f17803;
            c20802.f3962 = cls2;
            c20802.f3964 = new Class[]{clsM12425, Object.class, clsM124252, clsM124253};
            try {
                methodM12414 = c7164M124132.m12414();
            } catch (Exception unused2) {
                methodM12414 = null;
            }
        }
        if (methodM12414 == null) {
            C7164 c7164M124133 = C7164.m12413(clsLoadClass);
            C2080 c20803 = c7164M124133.f17803;
            c20803.f3962 = cls2;
            c20803.f3964 = new Class[]{clsM12425, Object.class, clsM124252, clsM124253, cls};
            try {
                methodM12414 = c7164M124133.m12414();
            } catch (Exception unused3) {
                methodM12414 = null;
            }
        }
        if (methodM12414 == null) {
            C7164 c7164M124134 = C7164.m12413(clsLoadClass);
            C2080 c20804 = c7164M124134.f17803;
            c20804.f3962 = cls2;
            c20804.f3964 = new Class[]{clsM12425, clsM124253, clsM124252, cls};
            try {
                methodM124142 = c7164M124134.m12414();
            } catch (Exception unused4) {
            }
            methodM12414 = methodM124142;
        }
        if (methodM12414 != null) {
            m12390(methodM12414, new C4056(this, clsM124253));
        } else {
            C3466.m5899("始终没有找到合适的方法");
        }
    }
}
