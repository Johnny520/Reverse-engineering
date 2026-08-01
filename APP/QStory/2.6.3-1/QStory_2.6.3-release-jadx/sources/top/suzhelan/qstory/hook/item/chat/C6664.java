package top.suzhelan.qstory.hook.item.chat;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.material.textfield.ViewOnClickListenerC4015;
import de.robv.android.xposed.XposedBridge;
import io.ktor.client.plugins.AbstractC4765;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5976;
import lin.xposed.hook.util.p011qq.QQNTSendMsgUtils;
import lin.xposed.hook.util.p011qq.QQSessionUtils;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7140;
import p045.C7149;
import p049.AbstractC7165;
import p052.AbstractC7187;
import p303.AbstractC9234;
import top.suzhelan.qstory.hook.api.C6642;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲苏楪兰;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6664 extends AbstractC7140 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final long f16318 = 200;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public long f16319;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C7149 f16320;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f16321;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static Drawable m11802() {
        try {
            Context context = AbstractC7187.f17852;
            int identifier = context.getResources().getIdentifier(AbstractC9234.m14532("喵喵喵喵喵喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜喵呜喵~喵喵喵喵呜呜喵呜~喵喵喵喵喵呜喵喵~喵喵喵呜呜喵喵喵"), AbstractC9234.m14531(1542), context.getPackageName());
            if (identifier != 0) {
                return context.getDrawable(identifier);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final Bitmap m11803(C6664 c6664) {
        BitmapDrawable bitmapDrawableM8862;
        try {
            File file = new File(AbstractC4765.m8874().concat(AbstractC9234.m14532("喵呜喵呜呜呜喵喵~喵呜喵呜呜呜呜喵~喵呜喵喵呜喵呜呜~喵呜喵喵喵呜呜喵~喵喵喵呜喵呜喵呜~喵喵喵喵喵喵呜喵~喵喵喵喵喵呜呜喵")));
            if (file.exists() && (bitmapDrawableM8862 = AbstractC4765.m8862(AbstractC7187.f17852, file.getAbsolutePath())) != null) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDrawableM8862.getIntrinsicWidth(), bitmapDrawableM8862.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                AbstractC9234.m14531(2224);
                bitmapCreateBitmap.getClass();
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                bitmapDrawableM8862.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                bitmapDrawableM8862.draw(canvas);
                return bitmapCreateBitmap;
            }
            Drawable drawableM11802 = m11802();
            if (drawableM11802 == null) {
                return null;
            }
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(drawableM11802.getIntrinsicWidth(), drawableM11802.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            AbstractC9234.m14531(2224);
            bitmapCreateBitmap2.getClass();
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableM11802.setBounds(0, 0, canvas2.getWidth(), canvas2.getHeight());
            drawableM11802.draw(canvas2);
            return bitmapCreateBitmap2;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final void m11804(C6664 c6664, Object obj) {
        Object objM12418;
        try {
            try {
                objM12418 = obj.getClass().getMethod(AbstractC9234.m14531(164), null).invoke(obj, null);
            } catch (Exception unused) {
                objM12418 = AbstractC7165.m12418(Object.class, AbstractC9234.m14531(1909), obj);
            }
            if (objM12418 == null) {
                return;
            }
            ArrayList arrayList = (ArrayList) AbstractC7165.m12418(ArrayList.class, AbstractC9234.m14531(152), objM12418);
            Object currentContact = QQSessionUtils.getCurrentContact();
            if (arrayList == null || currentContact == null) {
                return;
            }
            Iterator it = arrayList.iterator();
            AbstractC9234.m14531(1253);
            it.getClass();
            boolean z = false;
            boolean z2 = false;
            while (it.hasNext()) {
                Integer num = (Integer) AbstractC7165.m12418(Integer.TYPE, AbstractC9234.m14531(338), it.next());
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
            Long l = (Long) AbstractC7165.m12418(Long.TYPE, AbstractC9234.m14532("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜喵喵喵喵呜~喵喵喵喵喵喵喵呜"), objM12418);
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
    public static final ImageView m11805(C6664 c6664, Object obj) {
        try {
            Field[] declaredFields = obj.getClass().getDeclaredFields();
            AbstractC9234.m14531(1985);
            declaredFields.getClass();
            for (Field field : declaredFields) {
                String name = field.getType().getName();
                if (name.equals(AbstractC9234.m14531(2214)) || AbstractC5976.m10735(name, AbstractC9234.m14532("喵喵呜呜呜呜呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵呜"), false)) {
                    field.setAccessible(true);
                    Object obj2 = field.get(obj);
                    if (obj2 != null) {
                        Method[] methods = obj2.getClass().getMethods();
                        AbstractC9234.m14531(2215);
                        methods.getClass();
                        for (Method method : methods) {
                            if (AbstractC5227.m9466(method.getName(), AbstractC9234.m14531(2216)) && method.getParameterCount() == 0) {
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

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        AbstractC9234.m14531(1257);
        classLoader.getClass();
        this.f16320 = new C7149(AbstractC9234.m14531(2223));
        new Thread(new RunnableC6671()).start();
        Method[] declaredMethods = classLoader.loadClass(AbstractC9234.m14531(2213)).getDeclaredMethods();
        AbstractC9234.m14531(1555);
        declaredMethods.getClass();
        for (Method method : declaredMethods) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 3 && AbstractC5227.m9466(parameterTypes[0], Integer.TYPE) && AbstractC5227.m9466(parameterTypes[2], List.class)) {
                XposedBridge.hookMethod(method, new C6642(this, 16));
                return;
            }
        }
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return AbstractC9234.m14531(2222);
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final View.OnClickListener mo11806() {
        return new ViewOnClickListenerC4015(this, 7);
    }
}
