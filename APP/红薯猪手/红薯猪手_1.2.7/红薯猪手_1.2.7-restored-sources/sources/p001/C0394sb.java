package p001;

import java.util.List;

/* JADX INFO: renamed from: ۟.sb */
/* JADX INFO: loaded from: classes.dex */
public final class C0394sb {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ */
    public static List m940(Object obj) {
        if (obj instanceof InterfaceC0321n4) {
            m941("kotlin.collections.MutableList", obj);
            throw null;
        }
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            C0237h4.m1091(C0394sb.class.getName(), e);
            throw e;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟ */
    public static void m941(String str, Object obj) {
        ClassCastException classCastException = new ClassCastException(obj.getClass().getName() + " cannot be cast to " + str);
        C0237h4.m1091(C0394sb.class.getName(), classCastException);
        throw classCastException;
    }
}
