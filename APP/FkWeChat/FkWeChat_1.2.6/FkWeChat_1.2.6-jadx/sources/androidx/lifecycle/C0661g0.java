package androidx.lifecycle;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import p010a9.InterfaceC0173a;
import p172l8.AbstractC4706m;
import p172l8.AbstractC4717x;
import p172l8.C4711r;
import p172l8.InterfaceC4705l;
import p181m4.AbstractC4967d;
import p181m4.AbstractC4974k;
import p181m4.C4970g;
import p185m8.AbstractC5109u0;
import p278t3.AbstractC8099b;

/* JADX INFO: renamed from: androidx.lifecycle.g0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0661g0 implements C4970g.b {

    /* JADX INFO: renamed from: a */
    public final C4970g f1950a;

    /* JADX INFO: renamed from: b */
    public boolean f1951b;

    /* JADX INFO: renamed from: c */
    public Bundle f1952c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC4705l f1953d;

    public C0661g0(C4970g c4970g, final InterfaceC0677o0 interfaceC0677o0) {
        c4970g.getClass();
        interfaceC0677o0.getClass();
        this.f1950a = c4970g;
        this.f1953d = AbstractC4706m.m18787a(new InterfaceC0173a() { // from class: androidx.lifecycle.f0
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return C0661g0.m2608b(interfaceC0677o0);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static C0663h0 m2608b(InterfaceC0677o0 interfaceC0677o0) {
        return AbstractC0657e0.m2606e(interfaceC0677o0);
    }

    @Override // p181m4.C4970g.b
    /* JADX INFO: renamed from: a */
    public Bundle mo2609a() {
        C4711r[] c4711rArr;
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
        Bundle bundleM20079a = AbstractC4974k.m20079a(bundleM31314a);
        Bundle bundle = this.f1952c;
        if (bundle != null) {
            AbstractC4974k.m20080b(bundleM20079a, bundle);
        }
        for (Map.Entry entry2 : m2611d().m2613e().entrySet()) {
            String str = (String) entry2.getKey();
            Bundle bundleMo2609a = ((C0651b0) entry2.getValue()).m2583a().mo2609a();
            if (!AbstractC4967d.m20063f(AbstractC4967d.m20058a(bundleMo2609a))) {
                AbstractC4974k.m20081c(bundleM20079a, str, bundleMo2609a);
            }
        }
        this.f1951b = false;
        return bundleM31314a;
    }

    /* JADX INFO: renamed from: c */
    public final Bundle m2610c(String str) {
        C4711r[] c4711rArr;
        str.getClass();
        m2612e();
        Bundle bundle = this.f1952c;
        if (bundle == null || !AbstractC4967d.m20059b(AbstractC4967d.m20058a(bundle), str)) {
            return null;
        }
        Bundle bundleM20061d = AbstractC4967d.m20061d(AbstractC4967d.m20058a(bundle), str);
        if (bundleM20061d == null) {
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
            bundleM20061d = AbstractC8099b.m31314a((C4711r[]) Arrays.copyOf(c4711rArr, c4711rArr.length));
            AbstractC4974k.m20079a(bundleM20061d);
        }
        AbstractC4974k.m20083e(AbstractC4974k.m20079a(bundle), str);
        if (AbstractC4967d.m20063f(AbstractC4967d.m20058a(bundle))) {
            this.f1952c = null;
        }
        return bundleM20061d;
    }

    /* JADX INFO: renamed from: d */
    public final C0663h0 m2611d() {
        return (C0663h0) this.f1953d.getValue();
    }

    /* JADX INFO: renamed from: e */
    public final void m2612e() {
        C4711r[] c4711rArr;
        if (this.f1951b) {
            return;
        }
        Bundle bundleM20067a = this.f1950a.m20067a("androidx.lifecycle.internal.SavedStateHandlesProvider");
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
        Bundle bundleM20079a = AbstractC4974k.m20079a(bundleM31314a);
        Bundle bundle = this.f1952c;
        if (bundle != null) {
            AbstractC4974k.m20080b(bundleM20079a, bundle);
        }
        if (bundleM20067a != null) {
            AbstractC4974k.m20080b(bundleM20079a, bundleM20067a);
        }
        this.f1952c = bundleM31314a;
        this.f1951b = true;
        m2611d();
    }
}
