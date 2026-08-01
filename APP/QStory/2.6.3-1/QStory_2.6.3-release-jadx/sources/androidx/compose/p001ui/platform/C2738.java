package androidx.compose.p001ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.activity.AbstractC0900;
import androidx.appcompat.widget.C1041;
import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.compose.foundation.lazy.layout.C1554;
import androidx.compose.p001ui.graphics.C2437;
import androidx.compose.p001ui.node.C2593;
import androidx.compose.p001ui.text.font.InterfaceC2825;
import androidx.compose.runtime.AbstractC2154;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.AbstractC2207;
import androidx.compose.runtime.C2153;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2169;
import androidx.compose.runtime.C2188;
import androidx.compose.runtime.C2193;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2195;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.InterfaceC2230;
import androidx.compose.runtime.composer.gapbuffer.C2068;
import androidx.compose.runtime.composer.gapbuffer.C2070;
import androidx.compose.runtime.internal.AbstractC2089;
import androidx.compose.runtime.tooling.AbstractC2133;
import androidx.lifecycle.InterfaceC3221;
import androidx.lifecycle.InterfaceC3254;
import androidx.lifecycle.compose.AbstractC3195;
import androidx.window.area.AbstractC3400;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.Lambda;
import p050.AbstractC7176;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p070.InterfaceC7391;
import p070.InterfaceC7396;
import p124.C8144;
import p124.InterfaceC8146;
import p132.AbstractC8177;
import p132.C8173;
import p146.C8331;
import p147.AbstractC8333;
import p158.C8368;
import p158.InterfaceC8366;
import p158.InterfaceC8369;
import p221.C8735;
import p227.C8766;
import p227.C8767;
import p227.C8769;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2738 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C8767 f5939;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC3254 f5940;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC8366 f5941;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC3221 f5942;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC2207 f5943;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final View f5944;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C2437 f5945;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C2700 f5946;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final ComponentCallbacks2C2739 f5947;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f5948;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final InterfaceC7372 f5949;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final InterfaceC2825 f5950;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C2734 f5951;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C2656 f5952;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C2593 f5953;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final InterfaceC2230 f5954;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC8146 f5955;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Configuration f5956;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C8766 f5957;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C2655 f5958;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C2735 f5959;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final InterfaceC2230 f5960;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C2730 f5961;

    public C2738(C2738 c2738, View view, AbstractC2207 abstractC2207, InterfaceC3221 interfaceC3221, InterfaceC8366 interfaceC8366, InterfaceC3254 interfaceC3254) {
        C8767 c8767;
        Configuration configuration;
        InterfaceC2230 interfaceC2230M3034;
        C2730 c2730;
        C2655 c2655;
        C2735 c2735;
        C2734 c2734;
        InterfaceC2825 c2742;
        InterfaceC2230 interfaceC2230M3035;
        C2656 c2656;
        C2437 c2437;
        C2593 c2593;
        C8766 c8766;
        View view2;
        boolean zM9466 = AbstractC5227.m9466((c2738 == null || (view2 = c2738.f5944) == null) ? null : view2.getContext(), view.getContext());
        this.f5944 = view;
        this.f5943 = abstractC2207;
        this.f5942 = interfaceC3221;
        this.f5941 = interfaceC8366;
        this.f5940 = interfaceC3254;
        if (zM9466) {
            c2738.getClass();
            c8767 = c2738.f5939;
        } else {
            c8767 = new C8767();
        }
        this.f5939 = c8767;
        this.f5957 = (c2738 == null || (c8766 = c2738.f5957) == null) ? new C8766() : c8766;
        if (zM9466) {
            c2738.getClass();
            configuration = c2738.f5956;
        } else {
            configuration = new Configuration(view.getContext().getResources().getConfiguration());
        }
        this.f5956 = configuration;
        if (zM9466) {
            c2738.getClass();
            interfaceC2230M3034 = c2738.f5960;
        } else {
            interfaceC2230M3034 = AbstractC2202.m3034(new Configuration(configuration));
        }
        this.f5960 = interfaceC2230M3034;
        if (zM9466) {
            c2738.getClass();
            c2730 = c2738.f5961;
        } else {
            Context context = view.getContext();
            c2730 = new C2730();
            Object systemService = context.getSystemService("accessibility");
            systemService.getClass();
        }
        this.f5961 = c2730;
        if (zM9466) {
            c2738.getClass();
            c2655 = c2738.f5958;
        } else {
            c2655 = new C2655(view.getContext());
        }
        this.f5958 = c2655;
        if (zM9466) {
            c2738.getClass();
            c2735 = c2738.f5959;
        } else {
            c2735 = new C2735(view.getContext());
        }
        this.f5959 = c2735;
        if (zM9466) {
            c2738.getClass();
            c2734 = c2738.f5951;
        } else {
            c2734 = new C2734(c2735);
        }
        this.f5951 = c2734;
        if (zM9466) {
            c2738.getClass();
            c2742 = c2738.f5950;
        } else {
            view.getContext();
            c2742 = new C2742();
        }
        this.f5950 = c2742;
        if (zM9466) {
            c2738.getClass();
            interfaceC2230M3035 = c2738.f5954;
        } else {
            interfaceC2230M3035 = AbstractC2202.m3035(AbstractC3400.m5652(view.getContext()), C2188.f4264);
        }
        this.f5954 = interfaceC2230M3035;
        this.f5955 = view == (c2738 != null ? c2738.f5944 : null) ? c2738.f5955 : new C8144(view);
        if (zM9466) {
            c2738.getClass();
            c2656 = c2738.f5952;
        } else {
            c2656 = new C2656(ViewConfiguration.get(view.getContext()));
        }
        this.f5952 = c2656;
        this.f5953 = (c2738 == null || (c2593 = c2738.f5953) == null) ? new C2593() : c2593;
        this.f5946 = new C2700();
        this.f5945 = (c2738 == null || (c2437 = c2738.f5945) == null) ? new C2437() : c2437;
        this.f5949 = new InterfaceC7372() { // from class: androidx.compose.ui.platform.ComposeViewContext$calculateWindowSizeLambda$1
            {
                super(0);
            }

            @Override // p068.InterfaceC7372
            public final C2752 invoke() {
                this.this$0.getClass();
                boolean zM13916 = C8735.m13916(0L, 0L);
                C2738 c27382 = this.this$0;
                if (zM13916) {
                    return AbstractC2751.m4177(c27382.f5944);
                }
                c27382.getClass();
                return new C2752(0L, AbstractC7176.m12463(this.this$0.f5944.getContext()).mo1899(AbstractC1298.m1700(0L)));
            }
        };
        this.f5947 = new ComponentCallbacks2C2739(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m4159(Configuration configuration) {
        int iUpdateFrom = this.f5956.updateFrom(configuration);
        if (iUpdateFrom != 0) {
            Iterator it = this.f5939.f22316.entrySet().iterator();
            while (it.hasNext()) {
                C8769 c8769 = (C8769) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (c8769 == null || Configuration.needNewResources(iUpdateFrom, c8769.f22319)) {
                    it.remove();
                }
            }
            this.f5960.setValue(new Configuration(configuration));
            C8766 c8766 = this.f5957;
            synchronized (c8766) {
                c8766.f22315.m1349();
            }
            if ((268435456 & iUpdateFrom) != 0) {
                this.f5954.setValue(AbstractC3400.m5652(this.f5944.getContext()));
            }
            if (((-1342235264) & iUpdateFrom) != 0) {
                C2700 c2700 = this.f5946;
                InterfaceC7372 interfaceC7372 = this.f5949;
                InterfaceC2230 interfaceC2230 = c2700.f5712;
                if (interfaceC2230 != null) {
                    ((AbstractC2182) interfaceC2230).setValue(interfaceC7372.invoke());
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m4160() {
        int i = this.f5948 + 1;
        this.f5948 = i;
        if (i == 1) {
            View view = this.f5944;
            Context context = view.getContext();
            ComponentCallbacks2C2739 componentCallbacks2C2739 = this.f5947;
            context.registerComponentCallbacks(componentCallbacks2C2739);
            m4159(view.getResources().getConfiguration());
            boolean zHasWindowFocus = view.hasWindowFocus();
            C2700 c2700 = this.f5946;
            ((AbstractC2182) c2700.f5711).setValue(Boolean.valueOf(zHasWindowFocus));
            InterfaceC2230 interfaceC2230 = c2700.f5712;
            InterfaceC7372 interfaceC7372 = this.f5949;
            if (interfaceC2230 == null) {
                c2700.f5713 = interfaceC7372;
            }
            if (interfaceC2230 != null) {
                ((AbstractC2182) interfaceC2230).setValue(interfaceC7372.invoke());
            }
            view.getViewTreeObserver().addOnWindowFocusChangeListener(componentCallbacks2C2739);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m4161() {
        int i = this.f5948 - 1;
        this.f5948 = i;
        if (i < 0) {
            Log.e("ComposeViewContext", "View count has dropped below 0");
            this.f5948 = 0;
        }
        if (this.f5948 == 0) {
            View view = this.f5944;
            Context context = view.getContext();
            ComponentCallbacks2C2739 componentCallbacks2C2739 = this.f5947;
            context.unregisterComponentCallbacks(componentCallbacks2C2739);
            C2700 c2700 = this.f5946;
            if (c2700.f5712 == null) {
                c2700.f5713 = null;
            }
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(componentCallbacks2C2739);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m4162(final ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719, final InterfaceC7383 interfaceC7383, InterfaceC2208 interfaceC2208, final int i) {
        final boolean z;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(123858079);
        int i2 = (i & 6) == 0 ? (c2159.m2938(viewTreeObserverOnGlobalLayoutListenerC2719) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= c2159.m2938(interfaceC7383) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c2159.m2938(this) ? 256 : 128;
        }
        if (c2159.m2903(i2 & 1, (i2 & 147) != 146)) {
            Object tag = viewTreeObserverOnGlobalLayoutListenerC2719.getTag(C0328R.id.inspection_slot_table_set);
            LinkedHashMap linkedHashMap = null;
            Set set = (!(tag instanceof Set) || ((tag instanceof InterfaceC7396) && !(tag instanceof InterfaceC7391))) ? null : (Set) tag;
            if (set == null) {
                Object parent = viewTreeObserverOnGlobalLayoutListenerC2719.getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(C0328R.id.inspection_slot_table_set) : null;
                set = (!(tag2 instanceof Set) || ((tag2 instanceof InterfaceC7396) && !(tag2 instanceof InterfaceC7391))) ? null : (Set) tag2;
            }
            if (set != null) {
                set.add(c2159.m2928());
                c2159.f4216 = true;
                c2159.f4191 = true;
                c2159.f4205.m2624();
                c2159.f4198.m2624();
                C2070 c2070 = c2159.f4197;
                C2068 c2068 = c2070.f3914;
                c2070.f3910 = c2068.f3885;
                c2070.f3909 = c2068.f3884;
            }
            Object objM2905 = c2159.m2905();
            InterfaceC8366 interfaceC8366 = this.f5941;
            C2188 c2188 = C2204.f4319;
            if (objM2905 == c2188) {
                Object parent2 = viewTreeObserverOnGlobalLayoutListenerC2719.getParent();
                parent2.getClass();
                View view2 = (View) parent2;
                Object tag3 = view2.getTag(C0328R.id.compose_view_saveable_id_tag);
                String strValueOf = tag3 instanceof String ? (String) tag3 : null;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(view2.getId());
                }
                final String strM717 = AbstractC0900.m717("SaveableStateRegistry:", strValueOf);
                final C8368 savedStateRegistry = interfaceC8366.getSavedStateRegistry();
                Bundle bundleM13322 = savedStateRegistry.m13322(strM717);
                if (bundleM13322 != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str : bundleM13322.keySet()) {
                        ArrayList parcelableArrayList = bundleM13322.getParcelableArrayList(str);
                        parcelableArrayList.getClass();
                        linkedHashMap.put(str, parcelableArrayList);
                    }
                }
                C0209xcceb09c3 c0209xcceb09c3 = new InterfaceC7387() { // from class: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1
                    @Override // p068.InterfaceC7387
                    public final Boolean invoke(Object obj) {
                        return Boolean.valueOf(AbstractC2751.m4176(obj));
                    }
                };
                C2169 c2169 = AbstractC8177.f19919;
                final C8173 c8173 = new C8173(linkedHashMap, c0209xcceb09c3);
                if (savedStateRegistry.m13321(strM717) != null) {
                    z = false;
                    C2749 c2749 = new C2749(c8173, new InterfaceC7372() { // from class: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m3998invoke() {
                            if (z) {
                                C8368 c8368 = savedStateRegistry;
                                String str2 = strM717;
                                c8368.getClass();
                                str2.getClass();
                                C8331 c8331 = c8368.f20766;
                                synchronized (c8331.f20708) {
                                }
                            }
                        }

                        @Override // p068.InterfaceC7372
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m3998invoke();
                            return C6008.f15084;
                        }
                    });
                    c2159.m2946(c2749);
                    objM2905 = c2749;
                } else {
                    try {
                        savedStateRegistry.m13320(strM717, new InterfaceC8369() { // from class: androidx.compose.ui.platform.飘花落叶言子苏哲世兰楪
                            @Override // p158.InterfaceC8369
                            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                            public final Bundle mo725() {
                                Map mapMo2044 = c8173.mo2044();
                                Bundle bundle = new Bundle();
                                for (Map.Entry entry : mapMo2044.entrySet()) {
                                    String str2 = (String) entry.getKey();
                                    List list = (List) entry.getValue();
                                    bundle.putParcelableArrayList(str2, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                                }
                                return bundle;
                            }
                        });
                        z = true;
                    } catch (IllegalArgumentException unused) {
                        z = false;
                    }
                    C2749 c27492 = new C2749(c8173, new InterfaceC7372() { // from class: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m3998invoke() {
                            if (z) {
                                C8368 c8368 = savedStateRegistry;
                                String str2 = strM717;
                                c8368.getClass();
                                str2.getClass();
                                C8331 c8331 = c8368.f20766;
                                synchronized (c8331.f20708) {
                                }
                            }
                        }

                        @Override // p068.InterfaceC7372
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m3998invoke();
                            return C6008.f15084;
                        }
                    });
                    c2159.m2946(c27492);
                    objM2905 = c27492;
                }
            }
            final C2749 c27493 = (C2749) objM2905;
            boolean zM2938 = c2159.m2938(c27493);
            Object objM29052 = c2159.m2905();
            if (zM2938 || objM29052 == c2188) {
                objM29052 = new InterfaceC7387() { // from class: androidx.compose.ui.platform.ComposeViewContext$ProvideCompositionLocals$1$1
                    {
                        super(1);
                    }

                    @Override // p068.InterfaceC7387
                    public final InterfaceC2195 invoke(C2153 c2153) {
                        return new C1554(c27493, 8);
                    }
                };
                c2159.m2946(objM29052);
            }
            AbstractC2202.m3044(C6008.f15084, (InterfaceC7387) objM29052, c2159);
            C2193 c2193 = AbstractC2737.f5923;
            boolean zBooleanValue = ((Boolean) c2159.m2943(c2193)).booleanValue() | viewTreeObserverOnGlobalLayoutListenerC2719.getScrollCaptureInProgress$ui();
            boolean zM2920 = c2159.m2920(viewTreeObserverOnGlobalLayoutListenerC2719.getView());
            Object objM29053 = c2159.m2905();
            if (zM2920 || objM29053 == c2188) {
                viewTreeObserverOnGlobalLayoutListenerC2719.getView();
                objM29053 = new C2679();
                c2159.m2946(objM29053);
            }
            AbstractC2202.m3046(new C1041[]{AbstractC3195.f7338.mo2988(this.f5942), AbstractC8333.f20714.mo2988(interfaceC8366), AbstractC2670.f5679.mo2988(this.f5939), AbstractC2670.f5678.mo2988(this.f5957), AbstractC2670.f5681.mo2988(viewTreeObserverOnGlobalLayoutListenerC2719.getContext()), AbstractC2133.f4131.mo2988(set), AbstractC2670.f5682.mo2988(viewTreeObserverOnGlobalLayoutListenerC2719.getConfiguration()), AbstractC8177.f19919.mo2988(c27493), AbstractC2670.f5677.mo2988(viewTreeObserverOnGlobalLayoutListenerC2719.getView()), c2193.mo2988(Boolean.valueOf(zBooleanValue)), AbstractC2737.f5921.mo2988(viewTreeObserverOnGlobalLayoutListenerC2719.getViewConfiguration()), AbstractC2154.f4167.mo2988((C2679) objM29053)}, AbstractC2089.m2749(1317454175, new InterfaceC7383() { // from class: androidx.compose.ui.platform.ComposeViewContext$ProvideCompositionLocals$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(InterfaceC2208 interfaceC22082, int i3) {
                    C2159 c21592 = (C2159) interfaceC22082;
                    if (!c21592.m2903(i3 & 1, (i3 & 3) != 2)) {
                        c21592.m2899();
                        return;
                    }
                    c21592.m2952(866651995);
                    AbstractC2737.m4158(viewTreeObserverOnGlobalLayoutListenerC2719, this.f5958, interfaceC7383, c21592, 0);
                    c21592.m2937(false);
                }

                /* JADX INFO: renamed from: androidx.compose.ui.platform.ComposeViewContext$ProvideCompositionLocals$2$1 */
                /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
                @Metadata(m150d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m151d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "invoke", "(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V", "<anonymous>"}, m152k = 3, m153mv = {2, 1, 0})
                public static final class C02071 extends Lambda implements InterfaceC7383 {
                    final /* synthetic */ InterfaceC7383 $content;
                    final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC2719 $owner;
                    final /* synthetic */ C2738 this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C02071(ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719, C2738 c2738, InterfaceC7383 interfaceC7383) {
                        super(2);
                        this.$owner = viewTreeObserverOnGlobalLayoutListenerC2719;
                        this.this$0 = c2738;
                        this.$content = interfaceC7383;
                    }

                    public final void invoke(InterfaceC2208 interfaceC2208, int i) {
                        C2159 c2159 = (C2159) interfaceC2208;
                        if (c2159.m2903(i & 1, (i & 3) != 2)) {
                            AbstractC2737.m4158(this.$owner, this.this$0.f5958, this.$content, c2159, 0);
                        } else {
                            c2159.m2899();
                        }
                    }

                    @Override // p068.InterfaceC7383
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((InterfaceC2208) obj, ((Number) obj2).intValue());
                        return C6008.f15084;
                    }
                }

                @Override // p068.InterfaceC7383
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((InterfaceC2208) obj, ((Number) obj2).intValue());
                    return C6008.f15084;
                }
            }, c2159), c2159, 56);
        } else {
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new InterfaceC7383() { // from class: androidx.compose.ui.platform.ComposeViewContext$ProvideCompositionLocals$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(InterfaceC2208 interfaceC22082, int i3) {
                    this.$tmp4_rcvr.m4162(viewTreeObserverOnGlobalLayoutListenerC2719, interfaceC7383, interfaceC22082, AbstractC2202.m3031(i | 1));
                }

                @Override // p068.InterfaceC7383
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((InterfaceC2208) obj, ((Number) obj2).intValue());
                    return C6008.f15084;
                }
            };
        }
    }
}
