package p332wb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.view.MenuItem;
import android.widget.ImageView;
import gg.AbstractC1416l;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p071f1.InterfaceC0998d0;
import p080fb.C1099a;
import p080fb.C1100a0;
import p080fb.C1107c;
import p080fb.C1165q1;
import p085fg.InterfaceC1231l;
import p099h.Hchat.utils.KavaReflector;
import p218og.AbstractC3149m;
import p218og.C3143g;
import p218og.C3145i;
import p218og.InterfaceC3142f;
import p222p.AbstractC3199a;
import p276sf.C3967n;
import p297u6.C4276c;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: wb.sr */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5319sr implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f20712g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0133  */
    @Override // p085fg.InterfaceC1231l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        String str;
        switch (this.f20712g) {
            case 0:
                C1107c c1107c = (C1107c) obj;
                c1107c.getClass();
                return AbstractC4166m.m8415m1(c1107c.f3593j);
            case 1:
                C1165q1 c1165q1 = (C1165q1) obj;
                c1165q1.getClass();
                return c1165q1.f3874a;
            case 2:
                C1100a0 c1100a0 = (C1100a0) obj;
                c1100a0.getClass();
                return c1100a0.f3545b;
            case 3:
                C1099a c1099a = (C1099a) obj;
                c1099a.getClass();
                return "附件: ".concat(c1099a.f3539a);
            case 4:
                String str2 = (String) obj;
                str2.getClass();
                return "- ".concat(str2);
            case 5:
                C1107c c1107c2 = (C1107c) obj;
                c1107c2.getClass();
                return AbstractC4166m.m8415m1(c1107c2.f3593j);
            case 6:
                C1165q1 c1165q12 = (C1165q1) obj;
                c1165q12.getClass();
                return c1165q12.f3889p;
            case 7:
                ((String) obj).getClass();
                return Boolean.valueOf(!AbstractC3149m.m6721t0(r9));
            case 8:
                InterfaceC0998d0 interfaceC0998d0 = (InterfaceC0998d0) obj;
                interfaceC0998d0.getClass();
                interfaceC0998d0.mo2538f(180.0f);
                return C3967n.f12976a;
            case 9:
                C1100a0 c1100a02 = (C1100a0) obj;
                c1100a02.getClass();
                return c1100a02.f3545b;
            case 10:
                C1107c c1107c3 = (C1107c) obj;
                c1107c3.getClass();
                return Boolean.valueOf(AbstractC1416l.m3825a(c1107c3.f3584a, "user"));
            case 11:
                C1107c c1107c4 = (C1107c) obj;
                c1107c4.getClass();
                return c1107c4.f3585b;
            case 12:
                C1107c c1107c5 = (C1107c) obj;
                c1107c5.getClass();
                return Boolean.valueOf(AbstractC1416l.m3825a(c1107c5.f3584a, "tool") && !AbstractC3149m.m6721t0(c1107c5.f3587d));
            case 13:
                String str3 = (String) obj;
                str3.getClass();
                return str3;
            case 14:
                C5026jv c5026jv = (C5026jv) obj;
                c5026jv.getClass();
                return c5026jv.f18249a;
            case 15:
                return C3967n.f12976a;
            case 16:
                Context context = (Context) obj;
                List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0);
                ArrayList arrayList = new ArrayList(listQueryIntentActivities.size());
                int size = listQueryIntentActivities.size();
                for (int i9 = 0; i9 < size; i9++) {
                    ResolveInfo resolveInfo = listQueryIntentActivities.get(i9);
                    ResolveInfo resolveInfo2 = resolveInfo;
                    if (!context.getPackageName().equals(resolveInfo2.activityInfo.packageName)) {
                        ActivityInfo activityInfo = resolveInfo2.activityInfo;
                        if (activityInfo.exported && ((str = activityInfo.permission) == null || context.checkSelfPermission(str) == 0)) {
                            arrayList.add(resolveInfo);
                        }
                    }
                }
                return arrayList;
            case 17:
                Member memberMo8594a = ((C4276c) obj).mo8594a();
                memberMo8594a.getClass();
                return memberMo8594a;
            case 18:
                return new C4276c((Member) obj);
            case 19:
                InterfaceC3142f interfaceC3142f = (InterfaceC3142f) obj;
                interfaceC3142f.getClass();
                return AbstractC3149m.m6703R0((String) ((C3143g) ((C3145i) interfaceC3142f).m6676a()).get(1)).toString();
            case 20:
                ((String) obj).getClass();
                return Boolean.valueOf(!AbstractC3149m.m6721t0(r9));
            case 21:
                return String.format(Locale.US, "%02x", Arrays.copyOf(new Object[]{Integer.valueOf(((Byte) obj).byteValue() & 255)}, 1));
            case 22:
                obj.getClass();
                Class<?> cls = obj.getClass();
                Class cls2 = Integer.TYPE;
                cls2.getClass();
                return KavaReflector.findMethod(cls, "onMMMenuItemSelected", MenuItem.class, cls2);
            case 23:
                Field field = (Field) obj;
                field.getClass();
                return Boolean.valueOf(Activity.class.isAssignableFrom(field.getType()));
            case 24:
                Field field2 = (Field) obj;
                field2.getClass();
                return Boolean.valueOf(AbstractC1416l.m3825a(field2.getType(), String.class));
            case 25:
                String str4 = (String) obj;
                return AbstractC3199a.m6839l(str4, str4);
            case 26:
                String str5 = (String) obj;
                str5.getClass();
                return Boolean.valueOf(str5.length() > 0);
            case 27:
                Field field3 = (Field) obj;
                field3.getClass();
                return Boolean.valueOf(ImageView.class.isAssignableFrom(field3.getType()));
            default:
                Field field4 = (Field) obj;
                field4.getClass();
                return Boolean.valueOf(Modifier.isStatic(field4.getModifiers()));
        }
    }
}
