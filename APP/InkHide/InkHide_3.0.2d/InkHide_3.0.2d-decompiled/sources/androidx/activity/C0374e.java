package androidx.activity;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.C0379a;
import androidx.activity.result.C0380b;
import androidx.fragment.app.C0442t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import p006D.AbstractC0079h;
import p014H.C0142a;

/* JADX INFO: renamed from: androidx.activity.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0374e {

    /* JADX INFO: renamed from: a */
    public Random f882a = new Random();

    /* JADX INFO: renamed from: b */
    public final HashMap f883b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final HashMap f884c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final HashMap f885d = new HashMap();

    /* JADX INFO: renamed from: e */
    public ArrayList f886e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final transient HashMap f887f = new HashMap();

    /* JADX INFO: renamed from: g */
    public final HashMap f888g = new HashMap();

    /* JADX INFO: renamed from: h */
    public final Bundle f889h = new Bundle();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m632a(int i2, int i3, Intent intent) {
        String str = (String) this.f883b.get(Integer.valueOf(i2));
        if (str == null) {
            return false;
        }
        C0380b c0380b = (C0380b) this.f887f.get(str);
        if (c0380b != null) {
            C0442t c0442t = c0380b.f911a;
            if (this.f886e.contains(str)) {
                c0442t.m852a(c0380b.f912b.mo204K(i3, intent));
                this.f886e.remove(str);
                return true;
            }
        }
        this.f888g.remove(str);
        this.f889h.putParcelable(str, new C0379a(i3, intent));
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final C0142a m633b(String str, AbstractC0079h abstractC0079h, C0442t c0442t) {
        int i2;
        HashMap map;
        HashMap map2 = this.f884c;
        if (((Integer) map2.get(str)) == null) {
            int iNextInt = this.f882a.nextInt(2147418112);
            while (true) {
                i2 = iNextInt + 65536;
                map = this.f883b;
                if (!map.containsKey(Integer.valueOf(i2))) {
                    break;
                }
                iNextInt = this.f882a.nextInt(2147418112);
            }
            map.put(Integer.valueOf(i2), str);
            map2.put(str, Integer.valueOf(i2));
        }
        this.f887f.put(str, new C0380b(c0442t, abstractC0079h));
        HashMap map3 = this.f888g;
        if (map3.containsKey(str)) {
            Object obj = map3.get(str);
            map3.remove(str);
            c0442t.m852a(obj);
        }
        Bundle bundle = this.f889h;
        C0379a c0379a = (C0379a) bundle.getParcelable(str);
        if (c0379a != null) {
            bundle.remove(str);
            c0442t.m852a(abstractC0079h.mo204K(c0379a.f909a, c0379a.f910b));
        }
        return new C0142a(this, str);
    }
}
