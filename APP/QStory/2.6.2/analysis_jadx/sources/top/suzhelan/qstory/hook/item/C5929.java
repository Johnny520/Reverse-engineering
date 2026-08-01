package top.suzhelan.qstory.hook.item;

import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5929 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C5928 f16117;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16118;

    public /* synthetic */ C5929(C5928 c5928, int i) {
        this.f16118 = i;
        this.f16117 = c5928;
    }

    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object obj;
        int i = this.f16118;
        AbstractC3056.m6668(-3937697365054719399L);
        methodHookParam.getClass();
        switch (i) {
            case 0:
                C5928 c5928 = this.f16117;
                CopyOnWriteArraySet copyOnWriteArraySet = c5928.f16112;
                if (c5928.f17376.booleanValue()) {
                    c5928.m11260();
                    Object[] objArr = methodHookParam.args;
                    AbstractC3056.m6668(-3937732158584784295L);
                    objArr.getClass();
                    int length = objArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            obj = null;
                        } else {
                            obj = objArr[i2];
                            if (obj != null) {
                                Class<?>[] interfaces = obj.getClass().getInterfaces();
                                AbstractC3056.m6668(-3937770070261106087L);
                                interfaces.getClass();
                                for (Class<?> cls : interfaces) {
                                    if (!cls.getName().equals(AbstractC3056.m6668(-3937770014426531239L))) {
                                    }
                                }
                            }
                            i2++;
                        }
                    }
                    if (obj != null) {
                        Class<?> cls2 = obj.getClass();
                        if (!copyOnWriteArraySet.contains(cls2.getName())) {
                            copyOnWriteArraySet.add(cls2.getName());
                            try {
                                XposedHelpers.findAndHookMethod(cls2, AbstractC3056.m6668(-3937769043763922343L), new Object[]{AbstractC3056.m6668(-3937768983634380199L), Integer.TYPE, String.class, new C5929(c5928, 1)});
                            } catch (Exception unused) {
                                return;
                            }
                        }
                    }
                    break;
                }
                break;
            case 1:
                Object obj2 = methodHookParam.args[0];
                if (obj2 != null) {
                    this.f16117.m11259(obj2.getClass());
                }
                break;
            case 2:
                if (this.f16117.f17376.booleanValue()) {
                    methodHookParam.setResult(Double.valueOf(this.f16117.f16115));
                }
                break;
            case 3:
                if (this.f16117.f17376.booleanValue()) {
                    methodHookParam.setResult(Double.valueOf(this.f16117.f16116));
                }
                break;
            default:
                C5928 c59282 = this.f16117;
                if (c59282.f17376.booleanValue()) {
                    c59282.m11260();
                    Object obj3 = methodHookParam.args[0];
                    if (obj3 != null) {
                        c59282.m11259(obj3.getClass());
                    }
                    break;
                }
                break;
        }
    }
}
