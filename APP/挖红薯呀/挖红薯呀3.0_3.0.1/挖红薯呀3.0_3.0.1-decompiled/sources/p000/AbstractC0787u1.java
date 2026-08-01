package p000;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: u1 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0787u1 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f6097a = new LinkedHashMap();

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f6098b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    public final ArrayList f6099c;

    /* JADX INFO: renamed from: d */
    public final transient LinkedHashMap f6100d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashMap f6101e;

    /* JADX INFO: renamed from: f */
    public final Bundle f6102f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0787u1() {
        new LinkedHashMap();
        this.f6099c = new ArrayList();
        this.f6100d = new LinkedHashMap();
        this.f6101e = new LinkedHashMap();
        this.f6102f = new Bundle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m4243a(int i, int i2, Intent intent) {
        String str = (String) this.f6097a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        AbstractC0748t1.m4160r(this.f6100d.get(str));
        this.f6101e.remove(str);
        this.f6102f.putParcelable(str, new C0599p1(intent, i2));
        return true;
    }
}
