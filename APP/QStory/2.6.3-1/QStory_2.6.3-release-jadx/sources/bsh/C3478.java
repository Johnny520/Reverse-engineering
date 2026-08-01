package bsh;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.function.Consumer;

/* JADX INFO: renamed from: bsh.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3478 implements Consumer {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Class f8261;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f8262;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f8263 = 1;

    public /* synthetic */ C3478(Class cls, ArrayList arrayList) {
        this.f8261 = cls;
        this.f8262 = arrayList;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f8263;
        ArrayList arrayList = this.f8262;
        Class<?> cls = this.f8261;
        switch (i) {
            case 0:
                Method method = (Method) obj;
                Method[] methodArr = (Method[]) arrayList.stream().filter(new C3477(method, 0)).sorted(new C3481()).toArray(new C3483(1));
                if (methodArr.length == 0 && !AbstractC3500.m6017(cls).hasModifier("abstract")) {
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
                        C3466.m5899("Cannot reduce the visibility of the inherited method from ".concat(declaringClass.getName()));
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

    public /* synthetic */ C3478(ArrayList arrayList, Class cls) {
        this.f8262 = arrayList;
        this.f8261 = cls;
    }
}
