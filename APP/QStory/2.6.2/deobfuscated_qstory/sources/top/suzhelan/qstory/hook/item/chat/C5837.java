package top.suzhelan.qstory.hook.item.chat;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.AbstractC3056;
import com.google.android.material.textfield.ViewOnClickListenerC3182;
import de.robv.android.xposed.XposedBridge;
import io.ktor.client.plugins.AbstractC3932;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.text.AbstractC5143;
import lin.xposed.hook.util.qq.QQNTSendMsgUtils;
import lin.xposed.hook.util.qq.QQSessionUtils;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6293;
import p028.C6301;
import p032.AbstractC6317;
import p035.AbstractC6340;
import p392.AbstractC9124;
import top.suzhelan.qstory.hook.api.C5811;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰楪哲;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5837 extends AbstractC6293 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final long f15983 = 200;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public long f15984;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C6301 f15985;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f15986;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static Drawable m11189() {
        try {
            Context context = AbstractC6340.f17460;
            int identifier = context.getResources().getIdentifier("repeat", "drawable", context.getPackageName());
            if (identifier != 0) {
                return context.getDrawable(identifier);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final Bitmap m11190(C5837 c5837) {
        BitmapDrawable bitmapDrawableM14665;
        try {
            File file = new File(AbstractC3932.m8313().concat("/+1.png"));
            if (file.exists() && (bitmapDrawableM14665 = AbstractC9124.m14665(AbstractC6340.f17460, file.getAbsolutePath())) != null) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDrawableM14665.getIntrinsicWidth(), bitmapDrawableM14665.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                "createBitmap(...)";
                bitmapCreateBitmap.getClass();
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                bitmapDrawableM14665.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                bitmapDrawableM14665.draw(canvas);
                return bitmapCreateBitmap;
            }
            Drawable drawableM11189 = m11189();
            if (drawableM11189 == null) {
                return null;
            }
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(drawableM11189.getIntrinsicWidth(), drawableM11189.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            "createBitmap(...)";
            bitmapCreateBitmap2.getClass();
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableM11189.setBounds(0, 0, canvas2.getWidth(), canvas2.getHeight());
            drawableM11189.draw(canvas2);
            return bitmapCreateBitmap2;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final void m11191(C5837 c5837, Object obj) {
        Object objM11831;
        try {
            try {
                objM11831 = obj.getClass().getMethod("getMsgRecord", null).invoke(obj, null);
            } catch (Exception unused) {
                objM11831 = AbstractC6317.m11831(Object.class, "msgRecord", obj);
            }
            if (objM11831 == null) {
                return;
            }
            ArrayList arrayList = (ArrayList) AbstractC6317.m11831(ArrayList.class, "elements", objM11831);
            Object currentContact = QQSessionUtils.getCurrentContact();
            if (arrayList == null || currentContact == null) {
                return;
            }
            Iterator it = arrayList.iterator();
            "iterator(...)";
            it.getClass();
            boolean z = false;
            boolean z2 = false;
            while (it.hasNext()) {
                Integer num = (Integer) AbstractC6317.m11831(Integer.TYPE, "elementType", it.next());
                if (num != null && num.intValue() == 7) {
                    z = true;
                }
                if (num == null || num.intValue() != 2) {
                    if (num == null || num.intValue() != 5) {
                        if (num != null && num.intValue() == 10) {
                        }
                    }
                }
                z2 = true;
            }
            if (z) {
                QQNTSendMsgUtils.sendMsg(currentContact, arrayList);
                return;
            }
            if (!z2) {
                QQNTSendMsgUtils.sendMsg(currentContact, arrayList);
                return;
            }
            Long l = (Long) AbstractC6317.m11831(Long.TYPE, "msgId", objM11831);
            long jLongValue = l != null ? l.longValue() : 0L;
            if (jLongValue != 0) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Long.valueOf(jLongValue));
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(currentContact);
                QQNTSendMsgUtils.forwardMsg(arrayList2, currentContact, arrayList3);
            }
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final ImageView m11192(C5837 c5837, Object obj) {
        try {
            Field[] declaredFields = obj.getClass().getDeclaredFields();
            "getDeclaredFields(...)";
            declaredFields.getClass();
            for (Field field : declaredFields) {
                String name = field.getType().getName();
                if (name.equals("kotlin.Lazy") || AbstractC5143.m10171(name, "Lazy", false)) {
                    field.setAccessible(true);
                    Object obj2 = field.get(obj);
                    if (obj2 != null) {
                        Method[] methods = obj2.getClass().getMethods();
                        "getMethods(...)";
                        methods.getClass();
                        for (Method method : methods) {
                            if (AbstractC4394.m8917(method.getName(), "getValue") && method.getParameterCount() == 0) {
                                method.setAccessible(true);
                                Object objInvoke = method.invoke(obj2, null);
                                if (objInvoke instanceof ImageView) {
                                    return (ImageView) objInvoke;
                                }
                            }
                        }
                    }
                }
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        "classLoader";
        classLoader.getClass();
        this.f15985 = new C6301("RepetitionPlus");
        new Thread(new RunnableC5840()).start();
        Method[] declaredMethods = classLoader.loadClass("com.tencent.mobileqq.aio.msglist.holder.component.msgfollow.AIOMsgFollowComponent").getDeclaredMethods();
        "getDeclaredMethods(...)";
        declaredMethods.getClass();
        for (Method method : declaredMethods) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 3 && AbstractC4394.m8917(parameterTypes[0], Integer.TYPE) && AbstractC4394.m8917(parameterTypes[2], List.class)) {
                XposedBridge.hookMethod(method, new C5811(this, 16));
                return;
            }
        }
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return "QQ\u81ea\u5e26\u7684\u590d\u8bfb\u4f4d\u7f6e \u504f\u4e0b \u5bb9\u6613\u574f \u8bf7\u52ff\u548c\u6d88\u606f\u590d\u8bfb\u540c\u65f6\u5f00\u542f \u5426\u5219\u4e0d\u4f1a\u53d1\u751f\u4ec0\u4e48 \u70b9\u51fb\u53ef\u4ee5\u914d\u7f6e\u4e00\u4e9b\u53c2\u6570";
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final View.OnClickListener mo11193() {
        return new ViewOnClickListenerC3182(this, 7);
    }
}
