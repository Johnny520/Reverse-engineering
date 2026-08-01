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
import p116.C7342;
import p130.C7502;
import p142.C7538;
import p142.C7539;
import p142.InterfaceC7537;
import p160.AbstractC7636;
import p160.C7635;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2355 implements InterfaceC2405, InterfaceC7537, InterfaceC2421 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public InterfaceC2427 f6964;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C2423 f6966;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final RunnableC1107 f6967;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractComponentCallbacksC2338 f6968;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C2386 f6963 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public C7538 f6965 = null;

    public C2355(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338, C2423 c2423, RunnableC1107 runnableC1107) {
        this.f6968 = abstractComponentCallbacksC2338;
        this.f6966 = c2423;
        this.f6967 = runnableC1107;
    }

    @Override // androidx.lifecycle.InterfaceC2405
    public final AbstractC7636 getDefaultViewModelCreationExtras() {
        Application application;
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = this.f6968;
        Context applicationContext = abstractComponentCallbacksC2338.m4435().getApplicationContext();
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
        C7635 c7635 = new C7635(0);
        LinkedHashMap linkedHashMap = c7635.f20724;
        if (application != null) {
            linkedHashMap.put(C2424.f7068, application);
        }
        linkedHashMap.put(AbstractC2435.f7100, abstractComponentCallbacksC2338);
        linkedHashMap.put(AbstractC2435.f7099, this);
        Bundle bundle = abstractComponentCallbacksC2338.f6905;
        if (bundle != null) {
            linkedHashMap.put(AbstractC2435.f7098, bundle);
        }
        return c7635;
    }

    @Override // androidx.lifecycle.InterfaceC2405
    public final InterfaceC2427 getDefaultViewModelProviderFactory() {
        Application application;
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = this.f6968;
        InterfaceC2427 defaultViewModelProviderFactory = abstractComponentCallbacksC2338.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(abstractComponentCallbacksC2338.f6913)) {
            this.f6964 = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f6964 == null) {
            Context applicationContext = abstractComponentCallbacksC2338.m4435().getApplicationContext();
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
            this.f6964 = new C2428(application, abstractComponentCallbacksC2338, abstractComponentCallbacksC2338.f6905);
        }
        return this.f6964;
    }

    @Override // androidx.lifecycle.InterfaceC2388
    public final AbstractC2402 getLifecycle() {
        m4476();
        return this.f6963;
    }

    @Override // p142.InterfaceC7537
    public final C7539 getSavedStateRegistry() {
        m4476();
        return this.f6965.f20418;
    }

    @Override // androidx.lifecycle.InterfaceC2421
    public final C2423 getViewModelStore() {
        m4476();
        return this.f6966;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m4476() {
        if (this.f6963 == null) {
            this.f6963 = new C2386(this, true);
            C7538 c7538 = new C7538(new C7502(this, new C7342(this, 4)));
            this.f6965 = c7538;
            c7538.m12759();
            this.f6967.run();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m4477(Lifecycle$Event lifecycle$Event) {
        this.f6963.m4499(lifecycle$Event);
    }
}
