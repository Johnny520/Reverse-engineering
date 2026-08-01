package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.activity.AbstractC0053;
import androidx.appcompat.widget.C0194;
import androidx.compose.foundation.lazy.layout.C0713;
import androidx.compose.runtime.AbstractC1319;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.AbstractC1372;
import androidx.compose.runtime.C1318;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1334;
import androidx.compose.runtime.C1353;
import androidx.compose.runtime.C1358;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1360;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.composer.gapbuffer.C1233;
import androidx.compose.runtime.composer.gapbuffer.C1235;
import androidx.compose.runtime.internal.AbstractC1254;
import androidx.compose.runtime.tooling.AbstractC1298;
import androidx.compose.ui.graphics.C1602;
import androidx.compose.ui.node.C1758;
import androidx.compose.ui.text.font.InterfaceC1991;
import androidx.lifecycle.InterfaceC2388;
import androidx.lifecycle.InterfaceC2421;
import androidx.lifecycle.compose.AbstractC2362;
import com.alibaba.fastjson2.AbstractC2904;
import com.davemorrissey.labs.subscaleview.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p054.InterfaceC6561;
import p054.InterfaceC6566;
import p108.C7314;
import p108.InterfaceC7316;
import p116.AbstractC7347;
import p116.C7343;
import p130.C7501;
import p131.AbstractC7503;
import p142.C7538;
import p142.InterfaceC7536;
import p142.InterfaceC7539;
import p205.C7905;
import p211.C7936;
import p211.C7937;
import p211.C7939;
import p253.AbstractC8189;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1903 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C7937 f5593;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC2421 f5594;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC7536 f5595;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC2388 f5596;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC1372 f5597;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final View f5598;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C1602 f5599;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C1865 f5600;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final ComponentCallbacks2C1904 f5601;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f5602;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final InterfaceC6542 f5603;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final InterfaceC1991 f5604;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C1899 f5605;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C1821 f5606;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C1758 f5607;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final InterfaceC1395 f5608;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC7316 f5609;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Configuration f5610;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C7936 f5611;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C1820 f5612;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C1900 f5613;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final InterfaceC1395 f5614;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C1895 f5615;

    public C1903(C1903 c1903, View view, AbstractC1372 abstractC1372, InterfaceC2388 interfaceC2388, InterfaceC7536 interfaceC7536, InterfaceC2421 interfaceC2421) {
        C7937 c7937;
        Configuration configuration;
        InterfaceC1395 interfaceC1395M2465;
        C1895 c1895;
        C1820 c1820;
        C1900 c1900;
        C1899 c1899;
        InterfaceC1991 c1907;
        InterfaceC1395 interfaceC1395M2466;
        C1821 c1821;
        C1602 c1602;
        C1758 c1758;
        C7936 c7936;
        View view2;
        boolean zM8917 = AbstractC4394.m8917((c1903 == null || (view2 = c1903.f5598) == null) ? null : view2.getContext(), view.getContext());
        this.f5598 = view;
        this.f5597 = abstractC1372;
        this.f5596 = interfaceC2388;
        this.f5595 = interfaceC7536;
        this.f5594 = interfaceC2421;
        if (zM8917) {
            c1903.getClass();
            c7937 = c1903.f5593;
        } else {
            c7937 = new C7937();
        }
        this.f5593 = c7937;
        this.f5611 = (c1903 == null || (c7936 = c1903.f5611) == null) ? new C7936() : c7936;
        if (zM8917) {
            c1903.getClass();
            configuration = c1903.f5610;
        } else {
            configuration = new Configuration(view.getContext().getResources().getConfiguration());
        }
        this.f5610 = configuration;
        if (zM8917) {
            c1903.getClass();
            interfaceC1395M2465 = c1903.f5614;
        } else {
            interfaceC1395M2465 = AbstractC1367.m2465(new Configuration(configuration));
        }
        this.f5614 = interfaceC1395M2465;
        if (zM8917) {
            c1903.getClass();
            c1895 = c1903.f5615;
        } else {
            Context context = view.getContext();
            c1895 = new C1895();
            Object systemService = context.getSystemService("accessibility");
            systemService.getClass();
        }
        this.f5615 = c1895;
        if (zM8917) {
            c1903.getClass();
            c1820 = c1903.f5612;
        } else {
            c1820 = new C1820(view.getContext());
        }
        this.f5612 = c1820;
        if (zM8917) {
            c1903.getClass();
            c1900 = c1903.f5613;
        } else {
            c1900 = new C1900(view.getContext());
        }
        this.f5613 = c1900;
        if (zM8917) {
            c1903.getClass();
            c1899 = c1903.f5605;
        } else {
            c1899 = new C1899(c1900);
        }
        this.f5605 = c1899;
        if (zM8917) {
            c1903.getClass();
            c1907 = c1903.f5604;
        } else {
            view.getContext();
            c1907 = new C1907();
        }
        this.f5604 = c1907;
        if (zM8917) {
            c1903.getClass();
            interfaceC1395M2466 = c1903.f5608;
        } else {
            interfaceC1395M2466 = AbstractC1367.m2466(AbstractC2904.m6264(view.getContext()), C1353.f3918);
        }
        this.f5608 = interfaceC1395M2466;
        this.f5609 = view == (c1903 != null ? c1903.f5598 : null) ? c1903.f5609 : new C7314(view);
        if (zM8917) {
            c1903.getClass();
            c1821 = c1903.f5606;
        } else {
            c1821 = new C1821(ViewConfiguration.get(view.getContext()));
        }
        this.f5606 = c1821;
        this.f5607 = (c1903 == null || (c1758 = c1903.f5607) == null) ? new C1758() : c1758;
        this.f5600 = new C1865();
        this.f5599 = (c1903 == null || (c1602 = c1903.f5599) == null) ? new C1602() : c1602;
        this.f5603 = new InterfaceC6542() { // from class: androidx.compose.ui.platform.ComposeViewContext$calculateWindowSizeLambda$1
            {
                super(0);
            }

            @Override // p052.InterfaceC6542
            public final C1917 invoke() {
                this.this$0.getClass();
                boolean zM13329 = C7905.m13329(0L, 0L);
                C1903 c19032 = this.this$0;
                if (zM13329) {
                    return AbstractC1916.m3607(c19032.f5598);
                }
                c19032.getClass();
                return new C1917(0L, AbstractC4921.m9889(this.this$0.f5598.getContext()).mo1329(AbstractC8189.m13654(0L)));
            }
        };
        this.f5601 = new ComponentCallbacks2C1904(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m3589(Configuration configuration) {
        int iUpdateFrom = this.f5610.updateFrom(configuration);
        if (iUpdateFrom != 0) {
            Iterator it = this.f5593.f21974.entrySet().iterator();
            while (it.hasNext()) {
                C7939 c7939 = (C7939) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (c7939 == null || Configuration.needNewResources(iUpdateFrom, c7939.f21977)) {
                    it.remove();
                }
            }
            this.f5614.setValue(new Configuration(configuration));
            C7936 c7936 = this.f5611;
            synchronized (c7936) {
                c7936.f21973.m788();
            }
            if ((268435456 & iUpdateFrom) != 0) {
                this.f5608.setValue(AbstractC2904.m6264(this.f5598.getContext()));
            }
            if (((-1342235264) & iUpdateFrom) != 0) {
                C1865 c1865 = this.f5600;
                InterfaceC6542 interfaceC6542 = this.f5603;
                InterfaceC1395 interfaceC1395 = c1865.f5366;
                if (interfaceC1395 != null) {
                    ((AbstractC1347) interfaceC1395).setValue(interfaceC6542.invoke());
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m3590() {
        int i = this.f5602 + 1;
        this.f5602 = i;
        if (i == 1) {
            View view = this.f5598;
            Context context = view.getContext();
            ComponentCallbacks2C1904 componentCallbacks2C1904 = this.f5601;
            context.registerComponentCallbacks(componentCallbacks2C1904);
            m3589(view.getResources().getConfiguration());
            boolean zHasWindowFocus = view.hasWindowFocus();
            C1865 c1865 = this.f5600;
            ((AbstractC1347) c1865.f5365).setValue(Boolean.valueOf(zHasWindowFocus));
            InterfaceC1395 interfaceC1395 = c1865.f5366;
            InterfaceC6542 interfaceC6542 = this.f5603;
            if (interfaceC1395 == null) {
                c1865.f5367 = interfaceC6542;
            }
            if (interfaceC1395 != null) {
                ((AbstractC1347) interfaceC1395).setValue(interfaceC6542.invoke());
            }
            view.getViewTreeObserver().addOnWindowFocusChangeListener(componentCallbacks2C1904);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m3591() {
        int i = this.f5602 - 1;
        this.f5602 = i;
        if (i < 0) {
            Log.e("ComposeViewContext", "View count has dropped below 0");
            this.f5602 = 0;
        }
        if (this.f5602 == 0) {
            View view = this.f5598;
            Context context = view.getContext();
            ComponentCallbacks2C1904 componentCallbacks2C1904 = this.f5601;
            context.unregisterComponentCallbacks(componentCallbacks2C1904);
            C1865 c1865 = this.f5600;
            if (c1865.f5366 == null) {
                c1865.f5367 = null;
            }
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(componentCallbacks2C1904);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m3592(final ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884, final InterfaceC6553 interfaceC6553, InterfaceC1373 interfaceC1373, final int i) {
        final boolean z;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(123858079);
        int i2 = (i & 6) == 0 ? (c1324.m2368(viewTreeObserverOnGlobalLayoutListenerC1884) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= c1324.m2368(interfaceC6553) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c1324.m2368(this) ? 256 : 128;
        }
        if (c1324.m2333(i2 & 1, (i2 & 147) != 146)) {
            Object tag = viewTreeObserverOnGlobalLayoutListenerC1884.getTag(R.id.inspection_slot_table_set);
            LinkedHashMap linkedHashMap = null;
            Set set = (!(tag instanceof Set) || ((tag instanceof InterfaceC6566) && !(tag instanceof InterfaceC6561))) ? null : (Set) tag;
            if (set == null) {
                Object parent = viewTreeObserverOnGlobalLayoutListenerC1884.getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                set = (!(tag2 instanceof Set) || ((tag2 instanceof InterfaceC6566) && !(tag2 instanceof InterfaceC6561))) ? null : (Set) tag2;
            }
            if (set != null) {
                set.add(c1324.m2358());
                c1324.f3870 = true;
                c1324.f3845 = true;
                c1324.f3859.m2054();
                c1324.f3852.m2054();
                C1235 c1235 = c1324.f3851;
                C1233 c1233 = c1235.f3568;
                c1235.f3564 = c1233.f3539;
                c1235.f3563 = c1233.f3538;
            }
            Object objM2335 = c1324.m2335();
            InterfaceC7536 interfaceC7536 = this.f5595;
            C1353 c1353 = C1369.f3973;
            if (objM2335 == c1353) {
                Object parent2 = viewTreeObserverOnGlobalLayoutListenerC1884.getParent();
                parent2.getClass();
                View view2 = (View) parent2;
                Object tag3 = view2.getTag(R.id.compose_view_saveable_id_tag);
                String strValueOf = tag3 instanceof String ? (String) tag3 : null;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(view2.getId());
                }
                final String strM152 = AbstractC0053.m152("SaveableStateRegistry:", strValueOf);
                final C7538 savedStateRegistry = interfaceC7536.getSavedStateRegistry();
                Bundle bundleM12734 = savedStateRegistry.m12734(strM152);
                if (bundleM12734 != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str : bundleM12734.keySet()) {
                        ArrayList parcelableArrayList = bundleM12734.getParcelableArrayList(str);
                        parcelableArrayList.getClass();
                        linkedHashMap.put(str, parcelableArrayList);
                    }
                }
                DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1 disposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1 = new InterfaceC6557() { // from class: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1
                    @Override // p052.InterfaceC6557
                    public final Boolean invoke(Object obj) {
                        return Boolean.valueOf(AbstractC1916.m3606(obj));
                    }
                };
                C1334 c1334 = AbstractC7347.f19579;
                final C7343 c7343 = new C7343(linkedHashMap, disposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1);
                if (savedStateRegistry.m12733(strM152) != null) {
                    z = false;
                    C1914 c1914 = new C1914(c7343, new InterfaceC6542() { // from class: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m3428invoke() {
                            if (z) {
                                C7538 c7538 = savedStateRegistry;
                                String str2 = strM152;
                                c7538.getClass();
                                str2.getClass();
                                C7501 c7501 = c7538.f20426;
                                synchronized (c7501.f20368) {
                                }
                            }
                        }

                        @Override // p052.InterfaceC6542
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m3428invoke();
                            return C5175.f14739;
                        }
                    });
                    c1324.m2376(c1914);
                    objM2335 = c1914;
                } else {
                    try {
                        savedStateRegistry.m12732(strM152, new InterfaceC7539() { // from class: androidx.compose.ui.platform.飘花落叶言子苏哲世兰楪
                            @Override // p142.InterfaceC7539
                            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                            public final Bundle mo164() {
                                Map mapMo1474 = c7343.mo1474();
                                Bundle bundle = new Bundle();
                                for (Map.Entry entry : mapMo1474.entrySet()) {
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
                    C1914 c19142 = new C1914(c7343, new InterfaceC6542() { // from class: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m3428invoke() {
                            if (z) {
                                C7538 c7538 = savedStateRegistry;
                                String str2 = strM152;
                                c7538.getClass();
                                str2.getClass();
                                C7501 c7501 = c7538.f20426;
                                synchronized (c7501.f20368) {
                                }
                            }
                        }

                        @Override // p052.InterfaceC6542
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m3428invoke();
                            return C5175.f14739;
                        }
                    });
                    c1324.m2376(c19142);
                    objM2335 = c19142;
                }
            }
            final C1914 c19143 = (C1914) objM2335;
            boolean zM2368 = c1324.m2368(c19143);
            Object objM23352 = c1324.m2335();
            if (zM2368 || objM23352 == c1353) {
                objM23352 = new InterfaceC6557() { // from class: androidx.compose.ui.platform.ComposeViewContext$ProvideCompositionLocals$1$1
                    {
                        super(1);
                    }

                    @Override // p052.InterfaceC6557
                    public final InterfaceC1360 invoke(C1318 c1318) {
                        return new C0713(c19143, 8);
                    }
                };
                c1324.m2376(objM23352);
            }
            AbstractC1367.m2475(C5175.f14739, (InterfaceC6557) objM23352, c1324);
            C1358 c1358 = AbstractC1902.f5577;
            boolean zBooleanValue = ((Boolean) c1324.m2373(c1358)).booleanValue() | viewTreeObserverOnGlobalLayoutListenerC1884.getScrollCaptureInProgress$ui();
            boolean zM2350 = c1324.m2350(viewTreeObserverOnGlobalLayoutListenerC1884.getView());
            Object objM23353 = c1324.m2335();
            if (zM2350 || objM23353 == c1353) {
                viewTreeObserverOnGlobalLayoutListenerC1884.getView();
                objM23353 = new C1844();
                c1324.m2376(objM23353);
            }
            AbstractC1367.m2477(new C0194[]{AbstractC2362.f6992.mo2418(this.f5596), AbstractC7503.f20374.mo2418(interfaceC7536), AbstractC1835.f5333.mo2418(this.f5593), AbstractC1835.f5332.mo2418(this.f5611), AbstractC1835.f5335.mo2418(viewTreeObserverOnGlobalLayoutListenerC1884.getContext()), AbstractC1298.f3785.mo2418(set), AbstractC1835.f5336.mo2418(viewTreeObserverOnGlobalLayoutListenerC1884.getConfiguration()), AbstractC7347.f19579.mo2418(c19143), AbstractC1835.f5331.mo2418(viewTreeObserverOnGlobalLayoutListenerC1884.getView()), c1358.mo2418(Boolean.valueOf(zBooleanValue)), AbstractC1902.f5575.mo2418(viewTreeObserverOnGlobalLayoutListenerC1884.getViewConfiguration()), AbstractC1319.f3821.mo2418((C1844) objM23353)}, AbstractC1254.m2179(1317454175, new InterfaceC6553() { // from class: androidx.compose.ui.platform.ComposeViewContext$ProvideCompositionLocals$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(InterfaceC1373 interfaceC13732, int i3) {
                    C1324 c13242 = (C1324) interfaceC13732;
                    if (!c13242.m2333(i3 & 1, (i3 & 3) != 2)) {
                        c13242.m2329();
                        return;
                    }
                    c13242.m2382(866651995);
                    AbstractC1902.m3588(viewTreeObserverOnGlobalLayoutListenerC1884, this.f5612, interfaceC6553, c13242, 0);
                    c13242.m2367(false);
                }

                /* JADX INFO: renamed from: androidx.compose.ui.platform.ComposeViewContext$ProvideCompositionLocals$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
                @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "invoke", "(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
                public static final class AnonymousClass1 extends Lambda implements InterfaceC6553 {
                    final /* synthetic */ InterfaceC6553 $content;
                    final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC1884 $owner;
                    final /* synthetic */ C1903 this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884, C1903 c1903, InterfaceC6553 interfaceC6553) {
                        super(2);
                        this.$owner = viewTreeObserverOnGlobalLayoutListenerC1884;
                        this.this$0 = c1903;
                        this.$content = interfaceC6553;
                    }

                    public final void invoke(InterfaceC1373 interfaceC1373, int i) {
                        C1324 c1324 = (C1324) interfaceC1373;
                        if (c1324.m2333(i & 1, (i & 3) != 2)) {
                            AbstractC1902.m3588(this.$owner, this.this$0.f5612, this.$content, c1324, 0);
                        } else {
                            c1324.m2329();
                        }
                    }

                    @Override // p052.InterfaceC6553
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((InterfaceC1373) obj, ((Number) obj2).intValue());
                        return C5175.f14739;
                    }
                }

                @Override // p052.InterfaceC6553
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((InterfaceC1373) obj, ((Number) obj2).intValue());
                    return C5175.f14739;
                }
            }, c1324), c1324, 56);
        } else {
            c1324.m2329();
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new InterfaceC6553() { // from class: androidx.compose.ui.platform.ComposeViewContext$ProvideCompositionLocals$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(InterfaceC1373 interfaceC13732, int i3) {
                    this.$tmp4_rcvr.m3592(viewTreeObserverOnGlobalLayoutListenerC1884, interfaceC6553, interfaceC13732, AbstractC1367.m2460(i | 1));
                }

                @Override // p052.InterfaceC6553
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((InterfaceC1373) obj, ((Number) obj2).intValue());
                    return C5175.f14739;
                }
            };
        }
    }
}
