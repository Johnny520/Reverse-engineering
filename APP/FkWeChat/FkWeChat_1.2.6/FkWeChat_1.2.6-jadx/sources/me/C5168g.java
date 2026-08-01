package me;

import be.AbstractC1113a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p080f9.C2363j;
import re.InterfaceC6627f;

/* JADX INFO: renamed from: me.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5168g {

    /* JADX INFO: renamed from: a */
    public int f15785a;

    /* JADX INFO: renamed from: b */
    public final List f15786b = new ArrayList();

    /* JADX INFO: renamed from: me.g$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public final class a {

        /* JADX INFO: renamed from: a */
        public final int f15787a;

        public a() {
            this.f15787a = C5168g.this.m21223c();
        }

        /* JADX INFO: renamed from: a */
        public final void m21227a(AbstractC1113a abstractC1113a) {
            abstractC1113a.getClass();
            C5168g.this.f15786b.add(new InterfaceC6627f.a(new C2363j(this.f15787a, C5168g.this.m21223c()), abstractC1113a));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m21222b(Collection collection) {
        collection.getClass();
        this.f15786b.addAll(collection);
    }

    /* JADX INFO: renamed from: c */
    public final int m21223c() {
        return this.f15785a;
    }

    /* JADX INFO: renamed from: d */
    public final List m21224d() {
        return this.f15786b;
    }

    /* JADX INFO: renamed from: e */
    public final a m21225e() {
        return new a();
    }

    /* JADX INFO: renamed from: f */
    public final void m21226f(int i10) {
        this.f15785a = i10;
    }
}
