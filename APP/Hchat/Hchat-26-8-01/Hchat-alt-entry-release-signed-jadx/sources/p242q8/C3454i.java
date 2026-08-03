package p242q8;

import android.content.Intent;
import java.lang.reflect.Method;
import java.util.concurrent.CopyOnWriteArrayList;
import p036c9.C0425c2;
import p099h.Hchat.utils.KavaReflector;
import p125i8.C2002f;
import p258r8.C3744i;

/* JADX INFO: renamed from: q8.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3454i {

    /* JADX INFO: renamed from: a */
    public final C2002f f11203a;

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArrayList f11204b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c */
    public volatile boolean f11205c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3454i(C2002f c2002f) {
        this.f11203a = c2002f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final int m7254a(Class cls) {
        int i9 = 0;
        for (Method method : KavaReflector.declaredMethods(cls)) {
            if (method != null) {
                String name = method.getName();
                if ("startActivity".equals(name) || "startActivityForResult".equals(name)) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes != null && parameterTypes.length != 0) {
                        int length = parameterTypes.length;
                        int i10 = 0;
                        while (true) {
                            if (i10 >= length) {
                                break;
                            }
                            if (parameterTypes[i10] == Intent.class) {
                                C3744i.f12154b.m7763b(method, new C0425c2(11, this, method, false));
                                i9++;
                                break;
                            }
                            i10++;
                        }
                    }
                }
            }
        }
        return i9;
    }
}
