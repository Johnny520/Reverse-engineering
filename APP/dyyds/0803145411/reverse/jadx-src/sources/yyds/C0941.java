package yyds;

import java.lang.reflect.Field;
import java.util.Iterator;

/* JADX INFO: renamed from: yyds.ᛴᲀᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0941 extends AbstractC0171 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int f4333;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ Class f4334;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public /* synthetic */ Object f4335;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public Class f4336;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0941(Class cls, InterfaceC0274 interfaceC0274) {
        super(interfaceC0274);
        this.f4334 = cls;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        if (r7 != r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065 A[RETURN] */
    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo474(Object obj) throws Throwable {
        Class superclass;
        C2746 c2746;
        Object obj2;
        C1728 c1728 = (C1728) this.f4335;
        int i = this.f4333;
        if (i == 0) {
            AbstractC1544.m3189(obj);
            superclass = this.f4334;
            c2746 = C2746.f13459;
            if (superclass != null) {
            }
            return c2746;
        }
        if (i != 1) {
            C0188.m800(AbstractC2328.m4341(-999069095461742L));
            return null;
        }
        superclass = this.f4336;
        AbstractC1544.m3189(obj);
        superclass = superclass.getSuperclass();
        c2746 = C2746.f13459;
        if (superclass != null || superclass.equals(Object.class)) {
            return c2746;
        }
        Field[] declaredFields = superclass.getDeclaredFields();
        AbstractC2328.m4341(-998970311213934L);
        InterfaceC1240 interfaceC1240M3935 = AbstractC2070.m3935(declaredFields);
        this.f4335 = c1728;
        this.f4336 = superclass;
        this.f4333 = 1;
        c1728.getClass();
        Iterator it = interfaceC1240M3935.iterator();
        boolean zHasNext = it.hasNext();
        EnumC1765 enumC1765 = EnumC1765.f8858;
        if (zHasNext) {
            c1728.f8728 = it;
            c1728.f8729 = 2;
            c1728.f8730 = this;
            obj2 = enumC1765;
        } else {
            obj2 = c2746;
        }
        if (obj2 == enumC1765) {
            if (obj2 == enumC1765) {
                return enumC1765;
            }
        } else if (obj2 == enumC1765) {
        }
        superclass = superclass.getSuperclass();
        c2746 = C2746.f13459;
        if (superclass != null) {
        }
        return c2746;
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final InterfaceC0274 mo630(Object obj, InterfaceC0274 interfaceC0274) {
        C0941 c0941 = new C0941(this.f4334, interfaceC0274);
        c0941.f4335 = obj;
        return c0941;
    }

    @Override // yyds.InterfaceC0477
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final Object mo511(Object obj, Object obj2) {
        return ((C0941) mo630((C1728) obj, (InterfaceC0274) obj2)).mo474(C2746.f13459);
    }
}
