package com.bumptech.glide;

import java.util.HashSet;
import java.util.Set;
import p154e2.C2029h;
import p154e2.InterfaceC2022a;
import p171h2.InterfaceC2236c;
import p195l2.AbstractC2511o;

/* JADX INFO: renamed from: com.bumptech.glide.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1946o implements InterfaceC2022a {

    /* JADX INFO: renamed from: a */
    public final C2029h f6605a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ComponentCallbacks2C1947p f6606b;

    public C1946o(ComponentCallbacks2C1947p componentCallbacks2C1947p, C2029h c2029h) {
        this.f6606b = componentCallbacks2C1947p;
        this.f6605a = c2029h;
    }

    @Override // p154e2.InterfaceC2022a
    /* JADX INFO: renamed from: a */
    public final void mo3612a(boolean z5) {
        if (z5) {
            synchronized (this.f6606b) {
                C2029h c2029h = this.f6605a;
                for (InterfaceC2236c interfaceC2236c : AbstractC2511o.m4456e((Set) c2029h.f6763f)) {
                    if (!interfaceC2236c.mo4052b() && !interfaceC2236c.mo4055e()) {
                        interfaceC2236c.clear();
                        if (c2029h.f6762e) {
                            ((HashSet) c2029h.f6764g).add(interfaceC2236c);
                        } else {
                            interfaceC2236c.mo4058h();
                        }
                    }
                }
            }
        }
    }
}
