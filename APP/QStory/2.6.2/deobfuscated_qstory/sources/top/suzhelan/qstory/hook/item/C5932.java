package top.suzhelan.qstory.hook.item;

import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractC4343;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.text.AbstractC5143;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6293;
import top.suzhelan.qstory.hook.api.C5811;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世楪兰哲;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5932 extends AbstractC6293 {
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final Object m11262(C5932 c5932, Object obj, Class cls) {
        try {
            Field[] declaredFields = obj.getClass().getDeclaredFields();
            "getDeclaredFields(...)";
            declaredFields.getClass();
            for (Field field : declaredFields) {
                if (cls.isAssignableFrom(field.getType())) {
                    field.setAccessible(true);
                    return field.get(obj);
                }
            }
            for (Class<? super Object> superclass = obj.getClass().getSuperclass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                Field[] declaredFields2 = superclass.getDeclaredFields();
                "getDeclaredFields(...)";
                declaredFields2.getClass();
                for (Field field2 : declaredFields2) {
                    if (cls.isAssignableFrom(field2.getType())) {
                        field2.setAccessible(true);
                        return field2.get(obj);
                    }
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        "loader";
        classLoader.getClass();
        try {
            m11264(classLoader);
            m11263(classLoader);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m11263(ClassLoader classLoader) {
        Object next;
        try {
            Class<?> clsLoadClass = classLoader.loadClass("com.tencent.mobileqq.profilecard.base.component.AbsProfileHeaderComponent");
            Class<?> clsLoadClass2 = classLoader.loadClass("com.tencent.mobileqq.data.Card");
            ArrayList arrayList = new ArrayList();
            Method[] declaredMethods = clsLoadClass.getDeclaredMethods();
            "getDeclaredMethods(...)";
            declaredMethods.getClass();
            for (Method method : declaredMethods) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1 && AbstractC4394.m8917(parameterTypes[0], clsLoadClass2)) {
                    String name = method.getName();
                    name.getClass();
                    if (AbstractC5143.m10171(name, "handleVoteBtnClickForGuestProfile", false) || AbstractC5143.m10171(name, "handleVote", false) || AbstractC5143.m10171(name, "onVote", false) || AbstractC5143.m10171(name, "Vote", false) || AbstractC5143.m10171(name, "vote", false)) {
                        arrayList.add(method);
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (AbstractC4394.m8917(((Method) next).getName(), "handleVoteBtnClickForGuestProfile")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            Method method2 = (Method) next;
            if (method2 == null) {
                method2 = (Method) AbstractC4343.m8830(arrayList);
            }
            if (method2 != null) {
                XposedBridge.hookMethod(method2, new C5811(this, 6));
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a8  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m11264(java.lang.ClassLoader r17) {
        /*
            r16 = this;
            r0 = r17
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r2 = -3937756708617848231(0xc95a4722faebfa59, double:-2.3440650023827714E45)
            java.lang.String r2 = com.bumptech.glide.AbstractC3056.m6668(r2)     // Catch: java.lang.Exception -> Lb8
            java.lang.Class r2 = r0.loadClass(r2)     // Catch: java.lang.Exception -> Lb8
            r3 = -3937756498164450727(0xc95a4753faebfa59, double:-2.344131697726688E45)
            java.lang.String r3 = com.bumptech.glide.AbstractC3056.m6668(r3)     // Catch: java.lang.Exception -> Lb8
            java.lang.Class r3 = r0.loadClass(r3)     // Catch: java.lang.Exception -> Lb8
            r4 = -3937756352135562663(0xc95a4775faebfa59, double:-2.3441779761285892E45)
            java.lang.String r4 = com.bumptech.glide.AbstractC3056.m6668(r4)     // Catch: java.lang.Exception -> Lb8
            java.lang.Class r0 = r0.loadClass(r4)     // Catch: java.lang.Exception -> Lb8
            r0.getClass()     // Catch: java.lang.Exception -> Lb8
            r3.getClass()     // Catch: java.lang.Exception -> Lb8
            java.lang.Class<android.widget.ImageView> r4 = android.widget.ImageView.class
            java.lang.reflect.Method[] r5 = r0.getDeclaredMethods()     // Catch: java.lang.Exception -> Lb8
            r6 = -3937714304405734823(0xc95a6db3faebfa59, double:-2.357503433617213E45)
            com.bumptech.glide.AbstractC3056.m6668(r6)     // Catch: java.lang.Exception -> Lb8
            r5.getClass()     // Catch: java.lang.Exception -> Lb8
            int r8 = r5.length     // Catch: java.lang.Exception -> Lb8
            r9 = 0
            r10 = r9
        L45:
            r11 = 1
            if (r10 >= r8) goto L66
            r12 = r5[r10]     // Catch: java.lang.Exception -> Lb8
            java.lang.Class[] r13 = r12.getParameterTypes()     // Catch: java.lang.Exception -> Lb8
            int r14 = r13.length     // Catch: java.lang.Exception -> Lb8
            r15 = 2
            if (r14 != r15) goto L63
            r14 = r13[r9]     // Catch: java.lang.Exception -> Lb8
            boolean r14 = kotlin.jvm.internal.AbstractC4394.m8917(r14, r3)     // Catch: java.lang.Exception -> Lb8
            if (r14 == 0) goto L63
            r13 = r13[r11]     // Catch: java.lang.Exception -> Lb8
            boolean r13 = kotlin.jvm.internal.AbstractC4394.m8917(r13, r4)     // Catch: java.lang.Exception -> Lb8
            if (r13 == 0) goto L63
            goto L67
        L63:
            int r10 = r10 + 1
            goto L45
        L66:
            r12 = 0
        L67:
            java.lang.reflect.Method[] r2 = r2.getDeclaredMethods()     // Catch: java.lang.Exception -> Lb8
            com.bumptech.glide.AbstractC3056.m6668(r6)     // Catch: java.lang.Exception -> Lb8
            r2.getClass()     // Catch: java.lang.Exception -> Lb8
            int r4 = r2.length     // Catch: java.lang.Exception -> Lb8
            r5 = r9
        L73:
            if (r5 >= r4) goto Lb8
            r6 = r2[r5]     // Catch: java.lang.Exception -> Lb8
            java.lang.String r7 = r6.getName()     // Catch: java.lang.Exception -> Lb8
            r13 = -3937634001402201511(0xc95ab6bcfaebfa59, double:-2.3829524712744963E45)
            java.lang.String r8 = com.bumptech.glide.AbstractC3056.m6668(r13)     // Catch: java.lang.Exception -> Lb8
            boolean r7 = kotlin.jvm.internal.AbstractC4394.m8917(r7, r8)     // Catch: java.lang.Exception -> Lb8
            if (r7 == 0) goto La8
            java.lang.Class[] r7 = r6.getParameterTypes()     // Catch: java.lang.Exception -> Lb8
            int r7 = r7.length     // Catch: java.lang.Exception -> Lb8
            if (r7 != r11) goto La8
            java.lang.Class[] r7 = r6.getParameterTypes()     // Catch: java.lang.Exception -> Lb8
            r7 = r7[r9]     // Catch: java.lang.Exception -> Lb8
            boolean r8 = kotlin.jvm.internal.AbstractC4394.m8917(r7, r1)     // Catch: java.lang.Exception -> Lb8
            if (r8 != 0) goto Lab
            java.lang.Class r7 = r7.getSuperclass()     // Catch: java.lang.Exception -> Lb8
            boolean r7 = kotlin.jvm.internal.AbstractC4394.m8917(r7, r1)     // Catch: java.lang.Exception -> Lb8
            if (r7 == 0) goto La8
            goto Lab
        La8:
            r8 = r16
            goto Lb5
        Lab:
            top.suzhelan.qstory.hook.item.飘花落叶言子苏世楪哲兰 r7 = new top.suzhelan.qstory.hook.item.飘花落叶言子苏世楪哲兰     // Catch: java.lang.Exception -> Lb8
            r8 = r16
            r7.<init>(r8, r3, r0, r12)     // Catch: java.lang.Exception -> Lb8
            de.robv.android.xposed.XposedBridge.hookMethod(r6, r7)     // Catch: java.lang.Exception -> Lb8
        Lb5:
            int r5 = r5 + 1
            goto L73
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: top.suzhelan.qstory.hook.item.C5932.m11264(java.lang.ClassLoader):void");
    }
}
