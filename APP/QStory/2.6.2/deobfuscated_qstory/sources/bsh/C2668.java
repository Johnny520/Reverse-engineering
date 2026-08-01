package bsh;

import androidx.collection.C0276;
import com.alibaba.fastjson2.reader.C2697;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.function.Function;
import p007.AbstractC6136;
import p291.AbstractC8502;

/* JADX INFO: renamed from: bsh.飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2668 implements Function {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f8005;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f8006;

    public /* synthetic */ C2668(Object obj, int i) {
        this.f8006 = i;
        this.f8005 = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.f8006;
        Object obj2 = this.f8005;
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
                StringBuilder sbM11553 = AbstractC6136.m11553((String) obj, " ");
                sbM11553.append((String) ((Iterator) obj2).next());
                return sbM11553.toString();
            case 2:
                return ((AbstractC8502) obj).mo13976(obj2);
            case 3:
                try {
                    return ((Method) obj2).invoke(obj, null);
                } catch (Throwable th) {
                    C0276.m842("create instance error", th);
                    return null;
                }
            case 4:
                Type type = (Type) obj2;
                Collection collection = (Collection) obj;
                return (collection.isEmpty() && (type instanceof Class)) ? EnumSet.noneOf((Class) type) : EnumSet.copyOf(collection);
            default:
                C2697 c2697 = (C2697) obj2;
                Collection collection2 = (Collection) obj;
                if (collection2.isEmpty()) {
                    Type type2 = c2697.f8186;
                    if (type2 instanceof Class) {
                        return EnumSet.noneOf((Class) type2);
                    }
                }
                return EnumSet.copyOf(collection2);
        }
    }
}
