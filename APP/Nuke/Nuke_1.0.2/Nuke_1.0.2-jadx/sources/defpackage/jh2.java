package defpackage;

import com.dokar.quickjs.binding.JsObject;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jh2 {
    public final Object a = new Object();
    public final LinkedHashMap b = new LinkedHashMap(16, 0.75f, true);
    public long c = 1;
    public boolean d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final JsObject a(Object obj) {
        JsObject jsObject;
        synchronized (this.a) {
            try {
                if (this.d) {
                    throw new sd2("HOST_OBJECT_RELEASED", "The raw host object is no longer available.", false, null, null, 28);
                }
                if (this.b.size() >= 256) {
                    Set setEntrySet = this.b.entrySet();
                    setEntrySet.getClass();
                    Map.Entry entry = (Map.Entry) du.p0(setEntrySet);
                    if (entry != null) {
                        this.b.remove(entry.getKey());
                    }
                }
                String strValueOf = String.valueOf(this.c);
                long j = this.c;
                long j2 = 1;
                if (j != Long.MAX_VALUE) {
                    j2 = 1 + j;
                }
                this.c = j2;
                String name = obj.getClass().getName();
                this.b.put(strValueOf, new ih2(name, obj));
                jsObject = new JsObject(we1.q0(new ow1("__nukeHostObject", Boolean.TRUE), new ow1("id", strValueOf), new ow1("className", name)));
            } catch (Throwable th) {
                throw th;
            }
        }
        return jsObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ih2 b(String str) {
        ih2 ih2Var;
        str.getClass();
        synchronized (this.a) {
            try {
                if (this.d) {
                    throw new sd2("HOST_OBJECT_RELEASED", "The raw host object is no longer available.", false, null, null, 28);
                }
                ih2Var = (ih2) this.b.get(str);
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
