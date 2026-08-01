package p102h1;

import android.os.Bundle;
import androidx.lifecycle.C0680q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import p010a9.InterfaceC0173a;
import p102h1.InterfaceC2837r;
import p172l8.AbstractC4717x;
import p172l8.C4711r;
import p181m4.AbstractC4967d;
import p181m4.AbstractC4974k;
import p181m4.C4970g;
import p181m4.C4972i;
import p181m4.InterfaceC4973j;
import p185m8.AbstractC5109u0;
import p278t3.AbstractC8099b;

/* JADX INFO: renamed from: h1.w */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2842w implements InterfaceC2837r, InterfaceC4973j {

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC2837r f7403q;

    /* JADX INFO: renamed from: r */
    public C0680q f7404r;

    /* JADX INFO: renamed from: s */
    public C4972i f7405s;

    public C2842w(InterfaceC2837r interfaceC2837r) {
        this.f7403q = interfaceC2837r;
        Object objMo1348c = mo1348c("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = objMo1348c instanceof Bundle ? (Bundle) objMo1348c : null;
        if (bundle != null) {
            m10088h(bundle);
        }
        mo1349d("androidx.savedstate.SavedStateRegistry", new InterfaceC0173a() { // from class: h1.v
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return C2842w.m10085e(this.f7402q);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static Object m10085e(C2842w c2842w) {
        C4711r[] c4711rArr;
        C4972i c4972i = c2842w.f7405s;
        if (c4972i == null) {
            return null;
        }
        Map mapM20768i = AbstractC5109u0.m20768i();
        if (mapM20768i.isEmpty()) {
            c4711rArr = new C4711r[0];
        } else {
            ArrayList arrayList = new ArrayList(mapM20768i.size());
            for (Map.Entry entry : mapM20768i.entrySet()) {
                arrayList.add(AbstractC4717x.m18815a((String) entry.getKey(), entry.getValue()));
            }
            c4711rArr = (C4711r[]) arrayList.toArray(new C4711r[0]);
        }
        Bundle bundleM31314a = AbstractC8099b.m31314a((C4711r[]) Arrays.copyOf(c4711rArr, c4711rArr.length));
        AbstractC4974k.m20079a(bundleM31314a);
        c4972i.m20076e(bundleM31314a);
        if (AbstractC4967d.m20063f(AbstractC4967d.m20058a(bundleM31314a))) {
            return null;
        }
        return bundleM31314a;
    }

    @Override // p102h1.InterfaceC2837r
    /* JADX INFO: renamed from: a */
    public boolean mo1346a(Object obj) {
        return this.f7403q.mo1346a(obj);
    }

    @Override // p102h1.InterfaceC2837r
    /* JADX INFO: renamed from: b */
    public Map mo1347b() {
        return this.f7403q.mo1347b();
    }

    @Override // p102h1.InterfaceC2837r
    /* JADX INFO: renamed from: c */
    public Object mo1348c(String str) {
        return this.f7403q.mo1348c(str);
    }

    @Override // p102h1.InterfaceC2837r
    /* JADX INFO: renamed from: d */
    public InterfaceC2837r.a mo1349d(String str, InterfaceC0173a interfaceC0173a) {
        return this.f7403q.mo1349d(str, interfaceC0173a);
    }

    /* JADX INFO: renamed from: f */
    public final C4972i m10086f() {
        return m10088h(null);
    }

    @Override // androidx.lifecycle.InterfaceC0676o
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C0680q getLifecycle() {
        return m10089i();
    }

    @Override // p181m4.InterfaceC4973j
    public C4970g getSavedStateRegistry() {
        return m10086f().m20073b();
    }

    /* JADX INFO: renamed from: h */
    public final C4972i m10088h(Bundle bundle) {
        C4972i c4972i = this.f7405s;
        if (c4972i != null) {
            return c4972i;
        }
        C4972i c4972iM20078b = C4972i.f15109c.m20078b(this);
        this.f7405s = c4972iM20078b;
        c4972iM20078b.m20075d(bundle);
        return c4972iM20078b;
    }

    /* JADX INFO: renamed from: i */
    public final C0680q m10089i() {
        C0680q c0680q = this.f7404r;
        if (c0680q != null) {
            return c0680q;
        }
        C0680q c0680qM2674a = C0680q.f1991k.m2674a(this);
        this.f7404r = c0680qM2674a;
        return c0680qM2674a;
    }
}
