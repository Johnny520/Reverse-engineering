package p179m2;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.runtime.AbstractC0473c5;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1067w;
import p102h1.AbstractC2840u;
import p102h1.InterfaceC2837r;
import p119i1.InterfaceC3116b0;
import p165l1.AbstractC4510p;
import p172l8.C4700i0;
import p172l8.InterfaceC4695g;
import p181m4.C4970g;
import p181m4.InterfaceC4973j;

/* JADX INFO: renamed from: m2.r1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4900r1 {

    /* JADX INFO: renamed from: a */
    public static final Class[] f14740a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: m2.r1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0173a {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ boolean f14741r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ C4970g f14742s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ String f14743t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, C4970g c4970g, String str) {
            super(0);
            this.f14741r = z10;
            this.f14742s = c4970g;
            this.f14743t = str;
        }

        /* JADX INFO: renamed from: a */
        public final void m19670a() {
            if (this.f14741r) {
                this.f14742s.m20071e(this.f14743t);
            }
        }

        @Override // p010a9.InterfaceC0173a
        public /* bridge */ /* synthetic */ Object invoke() {
            m19670a();
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: m2.r1$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public static final b f14744r = new b();

        public b() {
            super(1);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo27m(Object obj) {
            return Boolean.valueOf(AbstractC4900r1.m19667e(obj));
        }
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m19663a(InterfaceC2837r interfaceC2837r) {
        return m19668f(interfaceC2837r.mo1347b());
    }

    /* JADX INFO: renamed from: b */
    public static final C4890p1 m19664b(View view, InterfaceC4973j interfaceC4973j) {
        Object parent = view.getParent();
        parent.getClass();
        View view2 = (View) parent;
        Object tag = view2.getTag(AbstractC4510p.f13107I);
        String strValueOf = tag instanceof String ? (String) tag : null;
        if (strValueOf == null) {
            strValueOf = String.valueOf(view2.getId());
        }
        return m19665c(strValueOf, interfaceC4973j);
    }

    /* JADX INFO: renamed from: c */
    public static final C4890p1 m19665c(String str, InterfaceC4973j interfaceC4973j) {
        boolean z10;
        String str2 = InterfaceC2837r.class.getSimpleName() + ':' + str;
        C4970g savedStateRegistry = interfaceC4973j.getSavedStateRegistry();
        Bundle bundleM20067a = savedStateRegistry.m20067a(str2);
        final InterfaceC2837r interfaceC2837rM10079b = AbstractC2840u.m10079b(bundleM20067a != null ? m19669g(bundleM20067a) : null, b.f14744r);
        try {
            savedStateRegistry.m20069c(str2, new C4970g.b() { // from class: m2.q1
                @Override // p181m4.C4970g.b
                /* JADX INFO: renamed from: a */
                public final Bundle mo2609a() {
                    return AbstractC4900r1.m19663a(interfaceC2837rM10079b);
                }
            });
            z10 = true;
        } catch (IllegalArgumentException unused) {
            z10 = false;
        }
        return new C4890p1(interfaceC2837rM10079b, new a(z10, savedStateRegistry, str2));
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m19667e(Object obj) {
        if (obj instanceof InterfaceC3116b0) {
            InterfaceC3116b0 interfaceC3116b0 = (InterfaceC3116b0) obj;
            if (interfaceC3116b0.mo1518c() != AbstractC0473c5.m1572k() && interfaceC3116b0.mo1518c() != AbstractC0473c5.m1579r() && interfaceC3116b0.mo1518c() != AbstractC0473c5.m1576o()) {
                return false;
            }
            Object value = interfaceC3116b0.getValue();
            if (value == null) {
                return true;
            }
            return m19667e(value);
        }
        if ((obj instanceof InterfaceC4695g) && (obj instanceof Serializable)) {
            return false;
        }
        for (Class cls : f14740a) {
            if (cls.isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static final Bundle m19668f(Map map) {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
        }
        return bundle;
    }

    /* JADX INFO: renamed from: g */
    public static final Map m19669g(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : bundle.keySet()) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(str);
            parcelableArrayList.getClass();
            linkedHashMap.put(str, parcelableArrayList);
        }
        return linkedHashMap;
    }
}
