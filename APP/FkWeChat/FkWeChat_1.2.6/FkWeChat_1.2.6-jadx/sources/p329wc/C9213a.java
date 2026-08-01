package p329wc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p185m8.AbstractC5114x;
import p376zd.C10000k0;

/* JADX INFO: renamed from: wc.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9213a {

    /* JADX INFO: renamed from: a */
    public final String f31444a;

    /* JADX INFO: renamed from: b */
    public List f31445b;

    /* JADX INFO: renamed from: c */
    public final List f31446c;

    /* JADX INFO: renamed from: d */
    public final Set f31447d;

    /* JADX INFO: renamed from: e */
    public final List f31448e;

    /* JADX INFO: renamed from: f */
    public final List f31449f;

    /* JADX INFO: renamed from: g */
    public final List f31450g;

    public C9213a(String str) {
        str.getClass();
        this.f31444a = str;
        this.f31445b = AbstractC5114x.m20800o();
        this.f31446c = new ArrayList();
        this.f31447d = new HashSet();
        this.f31448e = new ArrayList();
        this.f31449f = new ArrayList();
        this.f31450g = new ArrayList();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m35877b(C9213a c9213a, String str, InterfaceC9218f interfaceC9218f, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list = AbstractC5114x.m20800o();
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        c9213a.m35878a(str, interfaceC9218f, list, z10);
    }

    /* JADX INFO: renamed from: a */
    public final void m35878a(String str, InterfaceC9218f interfaceC9218f, List list, boolean z10) {
        str.getClass();
        interfaceC9218f.getClass();
        list.getClass();
        if (!this.f31447d.add(str)) {
            C10000k0.m38754a("Element with name '", str, "' is already registered in ", this.f31444a);
            return;
        }
        this.f31446c.add(str);
        this.f31448e.add(interfaceC9218f);
        this.f31449f.add(list);
        this.f31450g.add(Boolean.valueOf(z10));
    }

    /* JADX INFO: renamed from: c */
    public final List m35879c() {
        return this.f31445b;
    }

    /* JADX INFO: renamed from: d */
    public final List m35880d() {
        return this.f31449f;
    }

    /* JADX INFO: renamed from: e */
    public final List m35881e() {
        return this.f31448e;
    }

    /* JADX INFO: renamed from: f */
    public final List m35882f() {
        return this.f31446c;
    }

    /* JADX INFO: renamed from: g */
    public final List m35883g() {
        return this.f31450g;
    }

    /* JADX INFO: renamed from: h */
    public final void m35884h(List list) {
        list.getClass();
        this.f31445b = list;
    }
}
