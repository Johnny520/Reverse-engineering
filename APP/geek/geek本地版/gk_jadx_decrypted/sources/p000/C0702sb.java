package p000;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: sb */
/* JADX INFO: loaded from: classes.dex */
public final class C0702sb {

    /* JADX INFO: renamed from: a */
    public final HashMap f4408a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final HashMap f4409b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final HashMap f4410c = new HashMap();

    /* JADX INFO: renamed from: d */
    public ArrayList f4411d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final transient HashMap f4412e = new HashMap();

    /* JADX INFO: renamed from: f */
    public final HashMap f4413f = new HashMap();

    /* JADX INFO: renamed from: g */
    public final Bundle f4414g = new Bundle();

    /* JADX INFO: renamed from: a */
    public final boolean m2328a(int i, int i2, Intent intent) {
        String str = (String) this.f4408a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C0840w1 c0840w1 = (C0840w1) this.f4412e.get(str);
        if (c0840w1 != null) {
            C0675rl c0675rl = c0840w1.f4901a;
            if (this.f4411d.contains(str)) {
                c0675rl.m2295a(c0840w1.f4902b.mo1205D(i2, intent));
                this.f4411d.remove(str);
                return true;
            }
        }
        this.f4413f.remove(str);
        this.f4414g.putParcelable(str, new C0766u1(i2, intent));
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final C0138d4 m2329b(String str, AbstractC0222ff abstractC0222ff, C0675rl c0675rl) {
        int i;
        HashMap map;
        HashMap map2 = this.f4409b;
        if (((Integer) map2.get(str)) == null) {
            AbstractC0467m abstractC0467m = AbstractC0049az.f694a;
            int iNextInt = AbstractC0049az.f694a.mo1772d().nextInt(2147418112);
            while (true) {
                i = iNextInt + 65536;
                Integer numValueOf = Integer.valueOf(i);
                map = this.f4408a;
                if (!map.containsKey(numValueOf)) {
                    break;
                }
                AbstractC0467m abstractC0467m2 = AbstractC0049az.f694a;
                iNextInt = AbstractC0049az.f694a.mo1772d().nextInt(2147418112);
            }
            map.put(Integer.valueOf(i), str);
            map2.put(str, Integer.valueOf(i));
        }
        this.f4412e.put(str, new C0840w1(c0675rl, abstractC0222ff));
        HashMap map3 = this.f4413f;
        if (map3.containsKey(str)) {
            Object obj = map3.get(str);
            map3.remove(str);
            c0675rl.m2295a(obj);
        }
        Bundle bundle = this.f4414g;
        C0766u1 c0766u1 = (C0766u1) bundle.getParcelable(str);
        if (c0766u1 != null) {
            bundle.remove(str);
            c0675rl.m2295a(abstractC0222ff.mo1205D(c0766u1.f4644a, c0766u1.f4645b));
        }
        return new C0138d4(this, 1, str);
    }
}
