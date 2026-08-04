package yyds;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: renamed from: yyds.ᲇᲇᛷᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2553 implements InterfaceC1549 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f12615;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ Class f12616;

    public /* synthetic */ C2553(Class cls, int i) {
        this.f12615 = i;
        this.f12616 = cls;
    }

    @Override // yyds.InterfaceC1549
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
    public final Object mo371(Object obj) {
        int i = this.f12615;
        boolean z = false;
        Class cls = this.f12616;
        switch (i) {
            case 0:
                Method method = (Method) obj;
                if (!Modifier.isStatic(method.getModifiers()) && method.getParameterCount() == 0 && cls.isAssignableFrom(method.getReturnType())) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                Field field = (Field) obj;
                if (Modifier.isStatic(field.getModifiers()) && cls.isAssignableFrom(field.getType())) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
