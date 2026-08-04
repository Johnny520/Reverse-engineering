package yyds;

import android.text.Editable;
import android.widget.EditText;
import com.kongzue.dialogx.interfaces.AbstractC0041;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: yyds.ᛶᛲᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1290 implements InterfaceC1376 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ boolean f5933;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ LinkedHashMap f5934;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ LinkedHashMap f5935;

    public /* synthetic */ C1290(boolean z, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        this.f5933 = z;
        this.f5934 = linkedHashMap;
        this.f5935 = linkedHashMap2;
    }

    @Override // yyds.InterfaceC1376
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final boolean mo912(AbstractC0041 abstractC0041) {
        Pair pair;
        String string;
        Object c2658;
        String string2;
        String string3;
        boolean z = this.f5933;
        LinkedHashMap linkedHashMap = this.f5934;
        LinkedHashMap linkedHashMap2 = this.f5935;
        if (!z) {
            AbstractC1960.m3789(AbstractC2328.m4341(-104277083849582L));
            return true;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        Iterator it = linkedHashMap.entrySet().iterator();
        while (true) {
            pair = null;
            pair = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            Editable text = ((EditText) entry.getValue()).getText();
            if (text != null && (string2 = text.toString()) != null && (string3 = AbstractC0473.m1314(string2).toString()) != null) {
                String str2 = string3.length() > 0 ? string3 : null;
                if (str2 != null) {
                    linkedHashMap3.put(str, str2);
                }
            }
        }
        C1509 c1509 = C1509.f7142;
        C1677 c1677 = C1677.f8554;
        AbstractC2328.m4341(-580627611681646L);
        C0568 c0568 = new C0568();
        for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
            String str3 = (String) entry2.getKey();
            String str4 = (String) entry2.getValue();
            String string4 = AbstractC0473.m1314(str3).toString();
            String string5 = AbstractC0473.m1314(str4).toString();
            if (string4.length() > 0 && string5.length() > 0) {
                c0568.f2744.put(string4, new C0754(string5));
            }
        }
        if (c0568.f2744.f8026 == 0) {
            string = AbstractC2328.m4341(-580670561354606L);
        } else {
            string = c0568.toString();
            AbstractC2328.m4341(-580674856321902L);
        }
        c1509.getClass();
        AbstractC2328.m4341(-25606167888750L);
        C1509.f7127.m1581(C1509.f7179[2], string);
        C1677 c16772 = C1677.f8554;
        AbstractC2328.m4341(-580975504032622L);
        synchronized (c16772) {
            try {
                WeakReference weakReference = C1677.f8556;
                Object obj = weakReference != null ? weakReference.get() : null;
                Method method = C1677.f8552;
                if (obj != null && method != null) {
                    pair = new Pair(obj, method);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        LinkedHashMap linkedHashMapM3422 = c16772.m3422();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(linkedHashMap2.keySet());
        linkedHashSet.addAll(linkedHashMapM3422.keySet());
        for (String str5 : linkedHashSet) {
            String strM3424 = (String) linkedHashMapM3422.get(str5);
            if (strM3424 != null || (strM3424 = C1677.f8554.m3424(str5)) != null) {
                C1677.f8554.m3423(str5, strM3424);
                if (pair != null) {
                    try {
                        c2658 = ((Method) pair.component2()).invoke(pair.component1(), str5, strM3424, Boolean.TRUE, Boolean.FALSE);
                    } catch (Throwable th2) {
                        c2658 = new C2658(th2);
                    }
                    Throwable thM4249 = C2248.m4249(c2658);
                    if (thM4249 != null) {
                        C2336.f11496.m4355(AbstractC2328.m4341(-581052813443950L) + str5, thM4249);
                    }
                }
            }
        }
        AbstractC1960.m3789(AbstractC2328.m4341(linkedHashMap3.isEmpty() ? -104350098293614L : -104388752999278L));
        return false;
    }
}
