package p000;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: i5 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0302i5 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f4271a = new LinkedHashMap();

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f4272b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    public final ArrayList f4273c;

    /* JADX INFO: renamed from: d */
    public final transient LinkedHashMap f4274d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashMap f4275e;

    /* JADX INFO: renamed from: f */
    public final Bundle f4276f;

    public AbstractC0302i5() {
        new LinkedHashMap();
        this.f4273c = new ArrayList();
        this.f4274d = new LinkedHashMap();
        this.f4275e = new LinkedHashMap();
        this.f4276f = new Bundle();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m2270a(int i, int i2, Intent intent) {
        String str = (String) this.f4271a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        vi0.m5701t(this.f4274d.get(str));
        this.f4275e.remove(str);
        this.f4276f.putParcelable(str, new C0154e5(intent, i2));
        return true;
    }
}
