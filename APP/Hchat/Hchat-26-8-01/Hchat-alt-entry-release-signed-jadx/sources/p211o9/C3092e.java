package p211o9;

import android.os.Handler;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import p085fg.InterfaceC1231l;
import p099h.Hchat.utils.KavaReflector;
import p222p.AbstractC3199a;
import p222p.C3255s1;
import p230p8.C3360l;
import p230p8.C3367s;
import p244qb.C3488i;
import p249qg.AbstractC3591p;
import p251r.C3631p;
import p251r.C3641z;
import p258r8.C3739d;
import p258r8.C3740e;
import p276sf.C3967n;
import tf.AbstractC4166m;
import wf.InterfaceC5559e;

/* JADX INFO: renamed from: o9.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3092e implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f9987g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [m.a.v(m.a, int):s.l0] */
    public /* synthetic */ C3092e(int i9, C3631p c3631p) {
        this.f9987g = 28;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f9987g) {
            case 0:
                String str = (String) obj;
                str.getClass();
                String strQuote = Pattern.quote(str);
                strQuote.getClass();
                return strQuote;
            case 1:
                String str2 = (String) obj;
                return AbstractC3199a.m6839l(str2, str2);
            case 2:
                String str3 = (String) obj;
                str3.getClass();
                return Boolean.valueOf(str3.length() > 0);
            case 3:
                String str4 = (String) obj;
                return AbstractC3199a.m6839l(str4, str4);
            case 4:
                String str5 = (String) obj;
                str5.getClass();
                return Boolean.valueOf(str5.length() > 0);
            case 5:
                return ((C3255s1) obj).f10366f;
            case 6:
                return ((C3255s1) obj).f10363c;
            case 7:
                return ((C3255s1) obj).f10365e;
            case 8:
                return ((C3255s1) obj).f10361a;
            case 9:
                ((C3360l) obj).getClass();
                return Boolean.TRUE;
            case 10:
                Field field = (Field) obj;
                field.getClass();
                return KavaReflector.readField(field, (Object) null);
            case 11:
                C3367s c3367s = (C3367s) obj;
                c3367s.getClass();
                return c3367s.f10867c;
            case 12:
                Field field2 = (Field) obj;
                field2.getClass();
                return Boolean.valueOf(Collection.class.isAssignableFrom(field2.getType()));
            case 13:
                Class cls = (Class) obj;
                cls.getClass();
                return AbstractC4166m.m8415m1(KavaReflector.declaredMethods(cls));
            case 14:
                Class cls2 = (Class) obj;
                cls2.getClass();
                return AbstractC4166m.m8415m1(KavaReflector.declaredMethods(cls2));
            case 15:
                Class cls3 = (Class) obj;
                cls3.getClass();
                return AbstractC4166m.m8415m1(KavaReflector.declaredConstructors(cls3));
            case 16:
                Method method = (Method) obj;
                method.getClass();
                String genericString = method.toGenericString();
                genericString.getClass();
                return genericString;
            case 17:
                String str6 = (String) obj;
                return AbstractC3199a.m6839l(str6, str6);
            case 18:
                String str7 = (String) obj;
                str7.getClass();
                return Boolean.valueOf(str7.length() > 0);
            case 19:
                String str8 = (String) obj;
                return AbstractC3199a.m6839l(str8, str8);
            case 20:
                String str9 = (String) obj;
                str9.getClass();
                return Boolean.valueOf(str9.length() > 0);
            case 21:
                String str10 = (String) obj;
                str10.getClass();
                String strQuote2 = Pattern.quote(str10);
                strQuote2.getClass();
                return strQuote2;
            case 22:
                C3488i c3488i = (C3488i) obj;
                c3488i.getClass();
                return Boolean.valueOf(c3488i.f11327c);
            case 23:
                C3488i c3488i2 = (C3488i) obj;
                c3488i2.getClass();
                return c3488i2.f11325a;
            case 24:
                C3488i c3488i3 = (C3488i) obj;
                c3488i3.getClass();
                return c3488i3.f11325a;
            case 25:
                InterfaceC5559e interfaceC5559e = (InterfaceC5559e) obj;
                if (interfaceC5559e instanceof AbstractC3591p) {
                    return (AbstractC3591p) interfaceC5559e;
                }
                return null;
            case 26:
                ((Integer) obj).getClass();
                return null;
            case 27:
                List list = (List) obj;
                return new C3641z(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            case 28:
                return C3967n.f12976a;
            default:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                Handler handler = C3740e.f12138a;
                return Boolean.valueOf(C3740e.m7755b(((C3739d) entry.getValue()).f12131b));
        }
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [cb.f.p(boolean):java.lang.reflect.Method, hb.r.d(java.lang.String, q9.d):java.lang.String, hb.r.p():void, o9.p.a(java.lang.String, java.util.Map, java.util.Map):java.lang.String, o9.p.z():void, p.d.<clinit>():void, p8.o.q(p8.v, java.util.concurrent.atomic.AtomicBoolean):p8.c, p8.o.v(java.lang.Object):p8.v, qb.k.e(java.util.Collection):void, qb.k.i(java.util.List):void, qg.p.<clinit>():void, r.h.a(r.h, java.lang.Object, fg.q, int):void, r.z.<clinit>():void, r8.e.a(r8.c):void] */
    public /* synthetic */ C3092e(int i9) {
        this.f9987g = i9;
    }
}
