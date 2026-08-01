package p307;

import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.util.AbstractC3700;
import com.alibaba.fastjson2.util.C3663;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Locale;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9252 extends C9250 {

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final Class f23678;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final C3663 f23679;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC9252(String str, int i, long j, String str2, Locale locale, String str3, Type type, Class cls, Field field, Method method, Class cls2) {
        Class cls3;
        super(str, i, j, str2, locale, str3, type, cls, field, method);
        if (type instanceof ParameterizedType) {
            Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
            if (actualTypeArguments.length == 2) {
                Type type2 = actualTypeArguments[0];
                cls3 = actualTypeArguments[1];
            } else {
                cls3 = null;
            }
        }
        cls3 = cls3 == null ? Object.class : cls3;
        C3663 c3663 = cls2 != null ? new C3663(cls, String.class, cls2) : null;
        this.f23678 = cls2;
        this.f23679 = c3663;
        C9368.m14664(AbstractC3700.m6504(cls3));
    }

    @Override // p307.C9250, p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC9352 mo14553(AbstractC3730 abstractC3730, Class cls) {
        Class cls2 = this.f23678;
        if (cls2 == null || !this.f23962.isAssignableFrom(cls)) {
            return super.mo14553(abstractC3730, cls);
        }
        return new C9291(cls2, this.f23959, cls, this.f23679, this.f23956 | Long.MIN_VALUE);
    }
}
