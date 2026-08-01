package p042W;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.security.PrivilegedAction;
import java.util.ArrayList;

/* JADX INFO: renamed from: W.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0351w implements PrivilegedAction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Class f798a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0351w(Class cls) {
        this.f798a = cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.security.PrivilegedAction
    public final Object run() {
        Field[] declaredFields = this.f798a.getDeclaredFields();
        ArrayList arrayList = new ArrayList(declaredFields.length);
        for (Field field : declaredFields) {
            if (field.isEnumConstant()) {
                arrayList.add(field);
            }
        }
        Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
        AccessibleObject.setAccessible(fieldArr, true);
        return fieldArr;
    }
}
