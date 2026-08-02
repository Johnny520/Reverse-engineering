package p000;

import com.dokar.quickjs.binding.JsObject;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jh2 {

    /* JADX INFO: renamed from: a */
    public final Object f5035a = new Object();

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f5036b = new LinkedHashMap(16, 0.75f, true);

    /* JADX INFO: renamed from: c */
    public long f5037c = 1;

    /* JADX INFO: renamed from: d */
    public boolean f5038d;

    /* JADX INFO: renamed from: a */
    public final JsObject m2499a(Object obj) {
        JsObject jsObject;
        synchronized (this.f5035a) {
            try {
                if (this.f5038d) {
                    throw new sd2("HOST_OBJECT_RELEASED", "The raw host object is no longer available.", false, null, null, 28);
                }
                if (this.f5036b.size() >= 256) {
                    Set setEntrySet = this.f5036b.entrySet();
                    setEntrySet.getClass();
                    Map.Entry entry = (Map.Entry) AbstractC0142du.m1160p0(setEntrySet);
                    if (entry != null) {
                        this.f5036b.remove(entry.getKey());
                    }
                }
                String strValueOf = String.valueOf(this.f5037c);
                long j = this.f5037c;
                long j2 = 1;
                if (j != Long.MAX_VALUE) {
                    j2 = 1 + j;
                }
                this.f5037c = j2;
                String name = obj.getClass().getName();
                this.f5036b.put(strValueOf, new ih2(name, obj));
                jsObject = new JsObject(we1.m5876q0(new ow1("__nukeHostObject", Boolean.TRUE), new ow1("id", strValueOf), new ow1("className", name)));
            } catch (Throwable th) {
                throw th;
            }
        }
        return jsObject;
    }

    /* JADX INFO: renamed from: b */
    public final ih2 m2500b(String str) {
        ih2 ih2Var;
        str.getClass();
        synchronized (this.f5035a) {
            try {
                if (this.f5038d) {
                    throw new sd2("HOST_OBJECT_RELEASED", "The raw host object is no longer available.", false, null, null, 28);
                }
                ih2Var = (ih2) this.f5036b.get(str);
                if (ih2Var == null) {
                    throw new sd2("HOST_OBJECT_RELEASED", "The raw host object is no longer available.", false, null, null, 28);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ih2Var;
    }
}
