package yyds;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.view.ContextMenu;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C0038;
import androidx.lifecycle.SavedStateHandleAttacher;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: yyds.ᲇᛷᛱᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC2473 implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC2345, InterfaceC0538, InterfaceC2657, InterfaceC2164 {

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public static final Object f12218 = new Object();

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final EnumC1464 f12219;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public C0038 f12220;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public C0644 f12222;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final ArrayList f12223;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final C0052 f12224;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public C1424 f12225;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final int f12226 = -1;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final String f12228 = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final C2791 f12221 = new C2791(1);

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final boolean f12227 = true;

    public AbstractComponentCallbacksC2473() {
        InterfaceC1801 interfaceC1801;
        Object obj;
        new RunnableC0871(8, this);
        this.f12219 = EnumC1464.f6968;
        new C2505();
        new AtomicInteger();
        this.f12223 = new ArrayList();
        this.f12224 = new C0052(23, this);
        this.f12220 = new C0038(this);
        this.f12225 = new C1424(this);
        ArrayList arrayList = this.f12223;
        C0052 c0052 = this.f12224;
        if (arrayList.contains(c0052)) {
            return;
        }
        if (this.f12226 < 0) {
            arrayList.add(c0052);
            return;
        }
        AbstractComponentCallbacksC2473 abstractComponentCallbacksC2473 = (AbstractComponentCallbacksC2473) c0052.f551;
        abstractComponentCallbacksC2473.f12225.m2891();
        EnumC1464 enumC1464 = abstractComponentCallbacksC2473.f12220.f313;
        if (enumC1464 != EnumC1464.f6971 && enumC1464 != EnumC1464.f6967) {
            C0188.m798("Failed requirement.");
            return;
        }
        Iterator it = ((C0422) ((C0328) abstractComponentCallbacksC2473.f12225.f6734).f1721).iterator();
        while (true) {
            C1702 c1702 = (C1702) it;
            if (!c1702.hasNext()) {
                interfaceC1801 = null;
                break;
            }
            Map.Entry entry = (Map.Entry) c1702.next();
            String str = (String) entry.getKey();
            interfaceC1801 = (InterfaceC1801) entry.getValue();
            if (AbstractC1544.m3188(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                break;
            }
        }
        if (interfaceC1801 == null) {
            C0442 c0442 = new C0442((C0328) abstractComponentCallbacksC2473.f12225.f6734, abstractComponentCallbacksC2473);
            C0422 c0422 = (C0422) ((C0328) abstractComponentCallbacksC2473.f12225.f6734).f1721;
            C2598 c2598Mo1181 = c0422.mo1181("androidx.lifecycle.internal.SavedStateHandlesProvider");
            if (c2598Mo1181 != null) {
                obj = c2598Mo1181.f12796;
            } else {
                C2598 c2598 = new C2598("androidx.lifecycle.internal.SavedStateHandlesProvider", c0442);
                c0422.f2167++;
                C2598 c25982 = c0422.f2168;
                if (c25982 == null) {
                    c0422.f2166 = c2598;
                    c0422.f2168 = c2598;
                } else {
                    c25982.f12793 = c2598;
                    c2598.f12795 = c25982;
                    c0422.f2168 = c2598;
                }
                obj = null;
            }
            if (((InterfaceC1801) obj) != null) {
                C0188.m798("SavedStateProvider with the given key is already registered");
                return;
            }
            abstractComponentCallbacksC2473.f12220.m122(new SavedStateHandleAttacher(c0442));
        }
        abstractComponentCallbacksC2473.f12225.m2893(null);
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final FragmentActivity getActivity() {
        return null;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f12228);
        sb.append(")");
        return sb.toString();
    }

    @Override // yyds.InterfaceC2345
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final C0038 mo14() {
        return this.f12220;
    }

    @Override // yyds.InterfaceC2164
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final C0328 mo16() {
        return (C0328) this.f12225.f6734;
    }

    @Override // yyds.InterfaceC2657
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final AbstractC0729 mo17() {
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final C2791 m4525() {
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    @Override // yyds.InterfaceC0538
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final C2225 mo19() {
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }
}
