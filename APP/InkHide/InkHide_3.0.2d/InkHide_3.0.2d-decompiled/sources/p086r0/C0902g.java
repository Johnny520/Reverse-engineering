package p086r0;

import android.content.ContentValues;
import de.robv.android.xposed.XC_MethodHook;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0307q;
import p054c0.AbstractC0509a;
import p102z0.AbstractC1126i;
import p102z0.C1124g;

/* JADX INFO: renamed from: r0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0902g extends AbstractC0509a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3183a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0908i f3184b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0902g(C0908i c0908i, int i2) {
        this.f3183a = i2;
        this.f3184b = c0908i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p054c0.AbstractC0509a
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object obj;
        Object obj2;
        Integer asInteger;
        String asString;
        int i2 = this.f3183a;
        AbstractC0223g.m418e(methodHookParam, "param");
        switch (i2) {
            case 0:
                this.f3184b.f3208b = methodHookParam.thisObject;
                break;
            case 1:
                Object[] objArr = methodHookParam.args;
                AbstractC0223g.m417d(objArr, "args");
                int length = objArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length) {
                        obj = objArr[i3];
                        if (!(obj instanceof String)) {
                            i3++;
                        }
                    } else {
                        obj = null;
                    }
                }
                String str = obj instanceof String ? (String) obj : null;
                this.f3184b.getClass();
                if (str != null) {
                    String lowerCase = str.toLowerCase(Locale.ROOT);
                    AbstractC0223g.m417d(lowerCase, "toLowerCase(...)");
                    if (lowerCase.equals("message") || AbstractC0307q.m538h0(lowerCase, false, "message_") || lowerCase.endsWith("_message")) {
                        this.f3184b.f3207a = methodHookParam.thisObject;
                        C0908i c0908i = this.f3184b;
                        Object[] objArr2 = methodHookParam.args;
                        AbstractC0223g.m417d(objArr2, "args");
                        int length2 = objArr2.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 < length2) {
                                obj2 = objArr2[i4];
                                if (!(obj2 instanceof ContentValues)) {
                                    i4++;
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        ContentValues contentValues = obj2 instanceof ContentValues ? (ContentValues) obj2 : null;
                        c0908i.getClass();
                        if (contentValues != null) {
                            boolean z2 = AbstractC1126i.f3786a;
                            if (C1124g.m2442r() && (asInteger = contentValues.getAsInteger("type")) != null && asInteger.intValue() == 10000 && (asString = contentValues.getAsString("content")) != null && !AbstractC0299i.m511i0(asString, "[已阻止]", false)) {
                                List list = C0908i.f3204f;
                                if (list == null || !list.isEmpty()) {
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        if (AbstractC0299i.m511i0(asString, (String) it.next(), true)) {
                                            if (!C0908i.m1953f(asString)) {
                                                contentValues.put("content", C0908i.m1951b(null));
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            default:
                this.f3184b.f3208b = methodHookParam.thisObject;
                break;
        }
    }
}
