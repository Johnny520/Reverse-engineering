package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.compose.material.ripple.RunnableC1945;
import androidx.lifecycle.AbstractC3235;
import androidx.lifecycle.AbstractC3268;
import androidx.lifecycle.C3219;
import androidx.lifecycle.C3256;
import androidx.lifecycle.C3257;
import androidx.lifecycle.C3261;
import androidx.lifecycle.InterfaceC3238;
import androidx.lifecycle.InterfaceC3254;
import androidx.lifecycle.InterfaceC3260;
import androidx.lifecycle.Lifecycle$Event;
import java.util.LinkedHashMap;
import p132.C8171;
import p146.C8331;
import p158.C8367;
import p158.C8368;
import p158.InterfaceC8366;
import p176.AbstractC8465;
import p176.C8464;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3188 implements InterfaceC3238, InterfaceC8366, InterfaceC3254 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public InterfaceC3260 f7309;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C3256 f7311;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final RunnableC1945 f7312;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractComponentCallbacksC3171 f7313;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C3219 f7308 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public C8367 f7310 = null;

    public C3188(AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171, C3256 c3256, RunnableC1945 runnableC1945) {
        this.f7313 = abstractComponentCallbacksC3171;
        this.f7311 = c3256;
        this.f7312 = runnableC1945;
    }

    @Override // androidx.lifecycle.InterfaceC3238
    public final AbstractC8465 getDefaultViewModelCreationExtras() {
        Application application;
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = this.f7313;
        Context applicationContext = abstractComponentCallbacksC3171.m4995().getApplicationContext();
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
        C8464 c8464 = new C8464(0);
        LinkedHashMap linkedHashMap = c8464.f21069;
        if (application != null) {
            linkedHashMap.put(C3257.f7413, application);
        }
        linkedHashMap.put(AbstractC3268.f7445, abstractComponentCallbacksC3171);
        linkedHashMap.put(AbstractC3268.f7444, this);
        Bundle bundle = abstractComponentCallbacksC3171.f7250;
        if (bundle != null) {
            linkedHashMap.put(AbstractC3268.f7443, bundle);
        }
        return c8464;
    }

    @Override // androidx.lifecycle.InterfaceC3238
    public final InterfaceC3260 getDefaultViewModelProviderFactory() {
        Application application;
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = this.f7313;
        InterfaceC3260 defaultViewModelProviderFactory = abstractComponentCallbacksC3171.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(abstractComponentCallbacksC3171.f7258)) {
            this.f7309 = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f7309 == null) {
            Context applicationContext = abstractComponentCallbacksC3171.m4995().getApplicationContext();
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
            this.f7309 = new C3261(application, abstractComponentCallbacksC3171, abstractComponentCallbacksC3171.f7250);
        }
        return this.f7309;
    }

    @Override // androidx.lifecycle.InterfaceC3221
    public final AbstractC3235 getLifecycle() {
        m5036();
        return this.f7308;
    }

    @Override // p158.InterfaceC8366
    public final C8368 getSavedStateRegistry() {
        m5036();
        return this.f7310.f20763;
    }

    @Override // androidx.lifecycle.InterfaceC3254
    public final C3256 getViewModelStore() {
        m5036();
        return this.f7311;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m5036() {
        if (this.f7308 == null) {
            this.f7308 = new C3219(this, true);
            C8367 c8367 = new C8367(new C8331(this, new C8171(this, 4)));
            this.f7310 = c8367;
            c8367.m13318();
            this.f7312.run();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m5037(Lifecycle$Event lifecycle$Event) {
        this.f7308.m5059(lifecycle$Event);
    }
}
