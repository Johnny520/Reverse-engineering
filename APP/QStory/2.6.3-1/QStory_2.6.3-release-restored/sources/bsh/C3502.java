package bsh;

import androidx.collection.C1123;
import com.alibaba.fastjson2.reader.C3531;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.function.Function;
import p025.AbstractC7012;
import p307.AbstractC9323;

/* JADX INFO: renamed from: bsh.飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3502 implements Function {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f8352;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f8353;

    public /* synthetic */ C3502(Object obj, int i) {
        this.f8353 = i;
        this.f8352 = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.f8353;
        Object obj2 = this.f8352;
        switch (i) {
            case 0:
                NameSpace nameSpace = (NameSpace) obj2;
                String str = (String) obj;
                if (nameSpace == null) {
                    return null;
                }
                try {
                    return nameSpace.getVariableImpl(str, false);
                } catch (Exception unused) {
                    return null;
                }
            case 1:
                StringBuilder sbM12143 = AbstractC7012.m12143((String) obj, " ");
                sbM12143.append((String) ((Iterator) obj2).next());
                return sbM12143.toString();
            case 2:
                return ((AbstractC9323) obj).mo14554(obj2);
            case 3:
                try {
                    return ((Method) obj2).invoke(obj, null);
                } catch (Throwable th) {
                    C1123.m1403("create instance error", th);
                    return null;
                }
            case 4:
                Type type = (Type) obj2;
                Collection collection = (Collection) obj;
                return (collection.isEmpty() && (type instanceof Class)) ? EnumSet.noneOf((Class) type) : EnumSet.copyOf(collection);
            default:
                C3531 c3531 = (C3531) obj2;
                Collection collection2 = (Collection) obj;
                if (collection2.isEmpty()) {
                    Type type2 = c3531.f8533;
                    if (type2 instanceof Class) {
                        return EnumSet.noneOf((Class) type2);
                    }
                }
                return EnumSet.copyOf(collection2);
        }
    }
}
