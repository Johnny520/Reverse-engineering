package p242q8;

import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import p025bc.AbstractC0255e;
import p062e8.C0829c;
import p099h.Hchat.utils.KavaReflector;
import p360y4.C5995c;

/* JADX INFO: renamed from: q8.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3451f extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Constructor f11183a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3447b f11184b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Class f11185c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Class f11186d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Class f11187e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Class f11188f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C3453h f11189g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3451f(C3453h c3453h, Constructor constructor, C3447b c3447b, Class cls, Class cls2, Class cls3, Class cls4) {
        this.f11189g = c3453h;
        this.f11183a = constructor;
        this.f11184b = c3447b;
        this.f11185c = cls;
        this.f11186d = cls2;
        this.f11187e = cls3;
        this.f11188f = cls4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        C3453h c3453h = this.f11189g;
        try {
            Map map = (Map) methodHookParam.getResult();
            if (map == null) {
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(map);
            C0829c c0829c = c3453h.f11196c;
            if (c0829c.f2490l != null) {
                for (Object obj : map.values()) {
                    if (obj != null && c0829c.f2490l.isInstance(obj)) {
                        Object[] objArr = methodHookParam.args;
                        Object obj2 = (objArr == null || objArr.length <= 0) ? null : objArr[0];
                        if (obj2 == null) {
                            return;
                        }
                        Object objNewInstance = KavaReflector.newInstance(this.f11183a, obj2);
                        C5995c.m10733d(objNewInstance, this.f11184b);
                        linkedHashMap.put("SettingGroup_Main_Other_Hchat", objNewInstance);
                        methodHookParam.setResult(linkedHashMap);
                        return;
                    }
                }
            }
            Object objM7235e = C3453h.m7235e(c3453h, map, this.f11185c, new Class[]{this.f11186d, this.f11187e});
            if (objM7235e == null) {
                return;
            }
            Object obj3 = map.get(objM7235e);
            if (obj3 instanceof Iterable) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = ((Iterable) obj3).iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(it.next());
                }
                linkedHashSet.add(this.f11188f);
                linkedHashMap.put(objM7235e, linkedHashSet);
                methodHookParam.setResult(linkedHashMap);
            }
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:SettingsInjector] [Modern] ClassesProvider 注入失败: "), th2);
        }
    }
}
