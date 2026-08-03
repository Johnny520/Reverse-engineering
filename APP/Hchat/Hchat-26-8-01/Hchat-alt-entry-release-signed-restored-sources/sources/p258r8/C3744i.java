package p258r8;

import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Member;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: r8.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3744i {

    /* JADX INFO: renamed from: b */
    public static final C3744i f12154b = new C3744i();

    /* JADX INFO: renamed from: a */
    public final CopyOnWriteArrayList f12155a = new CopyOnWriteArrayList();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m7762a(XC_MethodHook.Unhook unhook) {
        if (unhook != null) {
            this.f12155a.add(unhook);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final XC_MethodHook.Unhook m7763b(Member member, XC_MethodHook xC_MethodHook) {
        member.getClass();
        xC_MethodHook.getClass();
        XC_MethodHook.Unhook unhookHookMethod = XposedBridge.hookMethod(member, xC_MethodHook);
        if (unhookHookMethod != null) {
            this.f12155a.add(unhookHookMethod);
        }
        unhookHookMethod.getClass();
        return unhookHookMethod;
    }
}
