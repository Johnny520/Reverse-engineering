package p000;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: bc */
/* JADX INFO: loaded from: classes.dex */
public final class C0063bc {

    /* JADX INFO: renamed from: a */
    public final HashMap f709a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final HashMap f710b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final HashMap f711c = new HashMap();

    /* JADX INFO: renamed from: d */
    public ArrayList f712d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final transient HashMap f713e = new HashMap();

    /* JADX INFO: renamed from: f */
    public final HashMap f714f = new HashMap();

    /* JADX INFO: renamed from: g */
    public final Bundle f715g = new Bundle();

    /* JADX INFO: renamed from: a */
    public final boolean m512a(int i, int i2, Intent intent) {
        String str = (String) this.f709a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C0840w1 c0840w1 = (C0840w1) this.f713e.get(str);
        if (c0840w1 != null) {
            C0748tl c0748tl = c0840w1.f5025a;
            if (this.f712d.contains(str)) {
                c0748tl.m2417a(c0840w1.f5026b.mo1266N(i2, intent));
                this.f712d.remove(str);
                return true;
            }
        }
        this.f714f.remove(str);
        this.f715g.putParcelable(str, new C0765u1(i2, intent));
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final C0138d4 m513b(String str, AbstractC0259gf abstractC0259gf, C0748tl c0748tl) {
        int i;
        HashMap map;
        HashMap map2 = this.f710b;
        if (((Integer) map2.get(str)) == null) {
            AbstractC0467m abstractC0467m = AbstractC0316hz.f2289a;
            int iNextInt = AbstractC0316hz.f2289a.mo1789d().nextInt(2147418112);
            while (true) {
                i = iNextInt + 65536;
                Integer numValueOf = Integer.valueOf(i);
                map = this.f709a;
                if (!map.containsKey(numValueOf)) {
                    break;
                }
                AbstractC0467m abstractC0467m2 = AbstractC0316hz.f2289a;
                iNextInt = AbstractC0316hz.f2289a.mo1789d().nextInt(2147418112);
            }
            map.put(Integer.valueOf(i), str);
            map2.put(str, Integer.valueOf(i));
        }
        this.f713e.put(str, new C0840w1(c0748tl, abstractC0259gf));
        HashMap map3 = this.f714f;
        if (map3.containsKey(str)) {
            Object obj = map3.get(str);
            map3.remove(str);
            c0748tl.m2417a(obj);
        }
        Bundle bundle = this.f715g;
        C0765u1 c0765u1 = (C0765u1) bundle.getParcelable(str);
        if (c0765u1 != null) {
            bundle.remove(str);
            c0748tl.m2417a(abstractC0259gf.mo1266N(c0765u1.f4602a, c0765u1.f4603b));
        }
        return new C0138d4(this, 1, str);
    }
}
