package bsh;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.function.Consumer;

/* JADX INFO: renamed from: bsh.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2645 implements Consumer {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Class f7916;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f7917;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f7918 = 1;

    public /* synthetic */ C2645(Class cls, ArrayList arrayList) {
        this.f7916 = cls;
        this.f7917 = arrayList;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f7918;
        ArrayList arrayList = this.f7917;
        Class<?> cls = this.f7916;
        switch (i) {
            case 0:
                Method method = (Method) obj;
                Method[] methodArr = (Method[]) arrayList.stream().filter(new C2644(method, 0)).sorted(new C2648()).toArray(new C2650(1));
                if (methodArr.length == 0 && !AbstractC2667.m5457(cls).hasModifier("abstract")) {
                    throw new RuntimeException(cls.getSimpleName() + " is not abstract and does not override abstract method " + method.getName() + "() in " + method.getDeclaringClass().getSimpleName());
                }
                if (methodArr.length > 0) {
                    int modifiers = method.getModifiers();
                    int modifiers2 = methodArr[0].getModifiers();
                    Class<?> declaringClass = method.getDeclaringClass();
                    int i2 = modifiers & 7;
                    int i3 = modifiers2 & 7;
                    if (i3 == i2 || i2 == 2 || i3 == 1) {
                        return;
                    }
                    if (i2 != 0 || i3 == 2) {
                        C2633.m5339("Cannot reduce the visibility of the inherited method from ".concat(declaringClass.getName()));
                        return;
                    }
                    return;
                }
                return;
            default:
                Field field = (Field) obj;
                int modifiers3 = field.getModifiers();
                if (Modifier.isStatic(modifiers3) || Modifier.isTransient(modifiers3) || field.getDeclaringClass().isAssignableFrom(cls) || "this$0".equals(field.getName())) {
                    return;
                }
                arrayList.add(field);
                return;
        }
    }

    public /* synthetic */ C2645(ArrayList arrayList, Class cls) {
        this.f7917 = arrayList;
        this.f7916 = cls;
    }
}
