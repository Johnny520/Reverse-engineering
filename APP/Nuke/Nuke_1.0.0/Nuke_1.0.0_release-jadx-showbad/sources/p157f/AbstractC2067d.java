package p157f;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: f.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2067d {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f6918a = new LinkedHashMap();

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f6919b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    public final ArrayList f6920c;

    /* JADX INFO: renamed from: d */
    public final transient LinkedHashMap f6921d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashMap f6922e;

    /* JADX INFO: renamed from: f */
    public final Bundle f6923f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC2067d() {
        new LinkedHashMap();
        this.f6920c = new ArrayList();
        this.f6921d = new LinkedHashMap();
        this.f6922e = new LinkedHashMap();
        this.f6923f = new Bundle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m3786a(int i5, int i6, Intent intent) {
        String str = (String) this.f6918a.get(Integer.valueOf(i5));
        if (str == null) {
            return false;
        }
        AbstractC0231b.m408s(this.f6921d.get(str));
        this.f6922e.remove(str);
        this.f6923f.putParcelable(str, new C2064a(intent, i6));
        return true;
    }
}
