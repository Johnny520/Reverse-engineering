package top.suzhelan.qstory.hook.item.chat;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.material.textfield.ViewOnClickListenerC3183;
import de.robv.android.xposed.XposedBridge;
import io.ktor.client.plugins.AbstractC3933;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.text.AbstractC5144;
import lin.xposed.hook.util.qq.QQNTSendMsgUtils;
import lin.xposed.hook.util.qq.QQSessionUtils;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6311;
import p029.C6320;
import p033.AbstractC6336;
import p036.AbstractC6358;
import p287.AbstractC8405;
import top.suzhelan.qstory.hook.api.C5812;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲苏楪兰;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5834 extends AbstractC6311 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final long f15973 = 200;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public long f15974;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C6320 f15975;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f15976;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static Drawable m11243() {
        try {
            Context context = AbstractC6358.f17507;
            int identifier = context.getResources().getIdentifier(AbstractC8405.m13973("喵喵喵喵喵喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜喵呜喵~喵喵喵喵呜呜喵呜~喵喵喵喵喵呜喵喵~喵喵喵呜呜喵喵喵"), AbstractC8405.m13972(1542), context.getPackageName());
            if (identifier != 0) {
                return context.getDrawable(identifier);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final Bitmap m11244(C5834 c5834) {
        BitmapDrawable bitmapDrawableM8303;
        try {
            File file = new File(AbstractC3933.m8315().concat(AbstractC8405.m13973("喵呜喵呜呜呜喵喵~喵呜喵呜呜呜呜喵~喵呜喵喵呜喵呜呜~喵呜喵喵喵呜呜喵~喵喵喵呜喵呜喵呜~喵喵喵喵喵喵呜喵~喵喵喵喵喵呜呜喵")));
            if (file.exists() && (bitmapDrawableM8303 = AbstractC3933.m8303(AbstractC6358.f17507, file.getAbsolutePath())) != null) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDrawableM8303.getIntrinsicWidth(), bitmapDrawableM8303.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                AbstractC8405.m13972(2224);
                bitmapCreateBitmap.getClass();
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                bitmapDrawableM8303.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                bitmapDrawableM8303.draw(canvas);
                return bitmapCreateBitmap;
            }
            Drawable drawableM11243 = m11243();
            if (drawableM11243 == null) {
                return null;
            }
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(drawableM11243.getIntrinsicWidth(), drawableM11243.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            AbstractC8405.m13972(2224);
            bitmapCreateBitmap2.getClass();
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableM11243.setBounds(0, 0, canvas2.getWidth(), canvas2.getHeight());
            drawableM11243.draw(canvas2);
            return bitmapCreateBitmap2;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final void m11245(C5834 c5834, Object obj) {
        Object objM11859;
        try {
            try {
                objM11859 = obj.getClass().getMethod(AbstractC8405.m13972(164), null).invoke(obj, null);
            } catch (Exception unused) {
                objM11859 = AbstractC6336.m11859(Object.class, AbstractC8405.m13972(1909), obj);
            }
            if (objM11859 == null) {
                return;
            }
            ArrayList arrayList = (ArrayList) AbstractC6336.m11859(ArrayList.class, AbstractC8405.m13972(152), objM11859);
            Object currentContact = QQSessionUtils.getCurrentContact();
            if (arrayList == null || currentContact == null) {
                return;
            }
            Iterator it = arrayList.iterator();
            AbstractC8405.m13972(1253);
            it.getClass();
            boolean z = false;
            boolean z2 = false;
            while (it.hasNext()) {
                Integer num = (Integer) AbstractC6336.m11859(Integer.TYPE, AbstractC8405.m13972(338), it.next());
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
            Long l = (Long) AbstractC6336.m11859(Long.TYPE, AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜喵喵喵喵呜~喵喵喵喵喵喵喵呜"), objM11859);
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
    public static final ImageView m11246(C5834 c5834, Object obj) {
        try {
            Field[] declaredFields = obj.getClass().getDeclaredFields();
            AbstractC8405.m13972(1985);
            declaredFields.getClass();
            for (Field field : declaredFields) {
                String name = field.getType().getName();
                if (name.equals(AbstractC8405.m13972(2214)) || AbstractC5144.m10176(name, AbstractC8405.m13973("喵喵呜呜呜呜呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵呜"), false)) {
                    field.setAccessible(true);
                    Object obj2 = field.get(obj);
                    if (obj2 != null) {
                        Method[] methods = obj2.getClass().getMethods();
                        AbstractC8405.m13972(2215);
                        methods.getClass();
                        for (Method method : methods) {
                            if (AbstractC4395.m8907(method.getName(), AbstractC8405.m13972(2216)) && method.getParameterCount() == 0) {
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

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        AbstractC8405.m13972(1257);
        classLoader.getClass();
        this.f15975 = new C6320(AbstractC8405.m13972(2223));
        new Thread(new RunnableC5841()).start();
        Method[] declaredMethods = classLoader.loadClass(AbstractC8405.m13972(2213)).getDeclaredMethods();
        AbstractC8405.m13972(1555);
        declaredMethods.getClass();
        for (Method method : declaredMethods) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 3 && AbstractC4395.m8907(parameterTypes[0], Integer.TYPE) && AbstractC4395.m8907(parameterTypes[2], List.class)) {
                XposedBridge.hookMethod(method, new C5812(this, 16));
                return;
            }
        }
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(2222);
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final View.OnClickListener mo11247() {
        return new ViewOnClickListenerC3183(this, 7);
    }
}
