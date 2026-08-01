package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.compose.material.ripple.RunnableC1107;
import androidx.lifecycle.AbstractC2402;
import androidx.lifecycle.AbstractC2435;
import androidx.lifecycle.C2386;
import androidx.lifecycle.C2423;
import androidx.lifecycle.C2424;
import androidx.lifecycle.C2428;
import androidx.lifecycle.InterfaceC2405;
import androidx.lifecycle.InterfaceC2421;
import androidx.lifecycle.InterfaceC2427;
import androidx.lifecycle.Lifecycle$Event;
import java.util.LinkedHashMap;
import p116.C7341;
import p130.C7501;
import p142.C7537;
import p142.C7538;
import p142.InterfaceC7536;
import p160.AbstractC7635;
import p160.C7634;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2355 implements InterfaceC2405, InterfaceC7536, InterfaceC2421 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public InterfaceC2427 f6963;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C2423 f6965;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final RunnableC1107 f6966;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractComponentCallbacksC2338 f6967;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C2386 f6962 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public C7537 f6964 = null;

    public C2355(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338, C2423 c2423, RunnableC1107 runnableC1107) {
        this.f6967 = abstractComponentCallbacksC2338;
        this.f6965 = c2423;
        this.f6966 = runnableC1107;
    }

    @Override // androidx.lifecycle.InterfaceC2405
    public final AbstractC7635 getDefaultViewModelCreationExtras() {
        Application application;
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = this.f6967;
        Context applicationContext = abstractComponentCallbacksC2338.m4425().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        C7634 c7634 = new C7634(0);
        LinkedHashMap linkedHashMap = c7634.f20729;
        if (application != null) {
            linkedHashMap.put(C2424.f7067, application);
        }
        linkedHashMap.put(AbstractC2435.f7099, abstractComponentCallbacksC2338);
        linkedHashMap.put(AbstractC2435.f7098, this);
        Bundle bundle = abstractComponentCallbacksC2338.f6904;
        if (bundle != null) {
            linkedHashMap.put(AbstractC2435.f7097, bundle);
        }
        return c7634;
    }

    @Override // androidx.lifecycle.InterfaceC2405
    public final InterfaceC2427 getDefaultViewModelProviderFactory() {
        Application application;
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = this.f6967;
        InterfaceC2427 defaultViewModelProviderFactory = abstractComponentCallbacksC2338.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(abstractComponentCallbacksC2338.f6912)) {
            this.f6963 = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f6963 == null) {
            Context applicationContext = abstractComponentCallbacksC2338.m4425().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.f6963 = new C2428(application, abstractComponentCallbacksC2338, abstractComponentCallbacksC2338.f6904);
        }
        return this.f6963;
    }

    @Override // androidx.lifecycle.InterfaceC2388
    public final AbstractC2402 getLifecycle() {
        m4466();
        return this.f6962;
    }

    @Override // p142.InterfaceC7536
    public final C7538 getSavedStateRegistry() {
        m4466();
        return this.f6964.f20423;
    }

    @Override // androidx.lifecycle.InterfaceC2421
    public final C2423 getViewModelStore() {
        m4466();
        return this.f6965;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m4466() {
        if (this.f6962 == null) {
            this.f6962 = new C2386(this, true);
            C7537 c7537 = new C7537(new C7501(this, new C7341(this, 4)));
            this.f6964 = c7537;
            c7537.m12730();
            this.f6966.run();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m4467(Lifecycle$Event lifecycle$Event) {
        this.f6962.m4489(lifecycle$Event);
    }
}
