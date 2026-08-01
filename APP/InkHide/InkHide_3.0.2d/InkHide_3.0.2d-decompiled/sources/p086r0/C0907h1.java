package p086r0;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import org.json.JSONException;
import p001A0.AbstractC0038k;
import p001A0.AbstractC0039l;
import p001A0.C0025Z;
import p001A0.C0035h;
import p001A0.C0047t;
import p009E0.AbstractC0105e;
import p009E0.C0104d;
import p025M0.InterfaceC0193a;
import p025M0.InterfaceC0204l;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0307q;
import p070i0.AbstractC0731a;

/* JADX INFO: renamed from: r0.h1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0907h1 implements InterfaceC0193a, InterfaceC0204l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0919l1 f3202a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [r0.l1.handleHook(android.content.Context, de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam):void] */
    public /* synthetic */ C0907h1(C0919l1 c0919l1) {
        this.f3202a = c0919l1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0015 A[PHI: r1
  0x0015: PHI (r1v1 A0.Z) = (r1v0 A0.Z), (r1v2 A0.Z) binds: [B:3:0x0004, B:9:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    @Override // p025M0.InterfaceC0193a
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7b() {
        boolean z2;
        C0919l1 c0919l1 = this.f3202a;
        C0025Z c0025zM76n = c0919l1.f3280k;
        if (c0025zM76n != null) {
            z2 = (c0025zM76n.f197a.isEmpty() || c0025zM76n.f198b.isEmpty() || c0025zM76n.f199c.isEmpty()) ? false : true;
        } else {
            Context context = c0919l1.f3279j;
            c0025zM76n = context != null ? AbstractC0039l.m76n(context) : null;
            if (c0025zM76n == null) {
            }
        }
        return Boolean.valueOf(z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p025M0.InterfaceC0204l
    /* JADX INFO: renamed from: c */
    public Object mo8c(Object obj) throws JSONException {
        Object c0104d;
        Context context = (Context) obj;
        AbstractC0223g.m418e(context, "appContext");
        C0025Z c0025z = null;
        c0025z = null;
        if (AbstractC0038k.m60a()) {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            String str = applicationInfo != null ? applicationInfo.sourceDir : null;
            if (str == null || AbstractC0307q.m534d0(str)) {
                AbstractC0731a.m1387d("storage dexkit apk path empty");
            } else {
                try {
                    c0104d = (C0025Z) AbstractC0039l.m62B(str, new C0035h(context, 8));
                } catch (Throwable th) {
                    c0104d = new C0104d(th);
                }
                Throwable thM246a = AbstractC0105e.m246a(c0104d);
                if (thM246a != null) {
                    AbstractC0731a.m1387d("storage dexkit resolve fail", thM246a);
                }
                c0025z = (C0025Z) (c0104d instanceof C0104d ? null : c0104d);
            }
        }
        if (c0025z == null) {
            return new C0047t(false, "未找到存储空间聊天记录 Hook 点", true);
        }
        AbstractC0039l.m87y(context, c0025z);
        this.f3202a.f3280k = c0025z;
        return new C0047t(true, "已补全存储空间聊天记录 Hook 点，重启微信后生效", true);
    }
}
