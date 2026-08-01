package bsh;

import androidx.collection.C0276;
import com.alibaba.fastjson2.reader.C2698;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.function.Function;
import p009.AbstractC6183;
import p291.AbstractC8494;

/* JADX INFO: renamed from: bsh.飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2669 implements Function {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f8007;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f8008;

    public /* synthetic */ C2669(Object obj, int i) {
        this.f8008 = i;
        this.f8007 = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.f8008;
        Object obj2 = this.f8007;
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
                StringBuilder sbM11584 = AbstractC6183.m11584((String) obj, " ");
                sbM11584.append((String) ((Iterator) obj2).next());
                return sbM11584.toString();
            case 2:
                return ((AbstractC8494) obj).mo13995(obj2);
            case 3:
                try {
                    return ((Method) obj2).invoke(obj, null);
                } catch (Throwable th) {
                    C0276.m843("create instance error", th);
                    return null;
                }
            case 4:
                Type type = (Type) obj2;
                Collection collection = (Collection) obj;
                return (collection.isEmpty() && (type instanceof Class)) ? EnumSet.noneOf((Class) type) : EnumSet.copyOf(collection);
            default:
                C2698 c2698 = (C2698) obj2;
                Collection collection2 = (Collection) obj;
                if (collection2.isEmpty()) {
                    Type type2 = c2698.f8188;
                    if (type2 instanceof Class) {
                        return EnumSet.noneOf((Class) type2);
                    }
                }
                return EnumSet.copyOf(collection2);
        }
    }
}
