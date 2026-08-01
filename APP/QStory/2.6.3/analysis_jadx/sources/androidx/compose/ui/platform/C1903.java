package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.activity.AbstractC0053;
import androidx.appcompat.widget.C0194;
import androidx.compose.foundation.draganddrop.AbstractC0455;
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
import androidx.window.area.AbstractC2567;
import com.davemorrissey.labs.subscaleview.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.Lambda;
import p034.AbstractC6347;
import p052.InterfaceC6543;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p054.InterfaceC6562;
import p054.InterfaceC6567;
import p108.C7315;
import p108.InterfaceC7317;
import p116.AbstractC7348;
import p116.C7344;
import p130.C7502;
import p131.AbstractC7504;
import p142.C7539;
import p142.InterfaceC7537;
import p142.InterfaceC7540;
import p205.C7906;
import p211.C7937;
import p211.C7938;
import p211.C7940;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1903 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C7938 f5594;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC2421 f5595;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC7537 f5596;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC2388 f5597;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC1372 f5598;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final View f5599;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C1602 f5600;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C1865 f5601;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final ComponentCallbacks2C1904 f5602;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f5603;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final InterfaceC6543 f5604;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final InterfaceC1991 f5605;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C1899 f5606;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C1821 f5607;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C1758 f5608;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final InterfaceC1395 f5609;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC7317 f5610;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Configuration f5611;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C7937 f5612;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C1820 f5613;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C1900 f5614;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final InterfaceC1395 f5615;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C1895 f5616;

    public C1903(C1903 c1903, View view, AbstractC1372 abstractC1372, InterfaceC2388 interfaceC2388, InterfaceC7537 interfaceC7537, InterfaceC2421 interfaceC2421) {
        C7938 c7938;
        Configuration configuration;
        InterfaceC1395 interfaceC1395M2474;
        C1895 c1895;
        C1820 c1820;
        C1900 c1900;
        C1899 c1899;
        InterfaceC1991 c1907;
        InterfaceC1395 interfaceC1395M2475;
        C1821 c1821;
        C1602 c1602;
        C1758 c1758;
        C7937 c7937;
        View view2;
        boolean zM8907 = AbstractC4395.m8907((c1903 == null || (view2 = c1903.f5599) == null) ? null : view2.getContext(), view.getContext());
        this.f5599 = view;
        this.f5598 = abstractC1372;
        this.f5597 = interfaceC2388;
        this.f5596 = interfaceC7537;
        this.f5595 = interfaceC2421;
        if (zM8907) {
            c1903.getClass();
            c7938 = c1903.f5594;
        } else {
            c7938 = new C7938();
        }
        this.f5594 = c7938;
        this.f5612 = (c1903 == null || (c7937 = c1903.f5612) == null) ? new C7937() : c7937;
        if (zM8907) {
            c1903.getClass();
            configuration = c1903.f5611;
        } else {
            configuration = new Configuration(view.getContext().getResources().getConfiguration());
        }
        this.f5611 = configuration;
        if (zM8907) {
            c1903.getClass();
            interfaceC1395M2474 = c1903.f5615;
        } else {
            interfaceC1395M2474 = AbstractC1367.m2474(new Configuration(configuration));
        }
        this.f5615 = interfaceC1395M2474;
        if (zM8907) {
            c1903.getClass();
            c1895 = c1903.f5616;
        } else {
            Context context = view.getContext();
            c1895 = new C1895();
            Object systemService = context.getSystemService("accessibility");
            systemService.getClass();
        }
        this.f5616 = c1895;
        if (zM8907) {
            c1903.getClass();
            c1820 = c1903.f5613;
        } else {
            c1820 = new C1820(view.getContext());
        }
        this.f5613 = c1820;
        if (zM8907) {
            c1903.getClass();
            c1900 = c1903.f5614;
        } else {
            c1900 = new C1900(view.getContext());
        }
        this.f5614 = c1900;
        if (zM8907) {
            c1903.getClass();
            c1899 = c1903.f5606;
        } else {
            c1899 = new C1899(c1900);
        }
        this.f5606 = c1899;
        if (zM8907) {
            c1903.getClass();
            c1907 = c1903.f5605;
        } else {
            view.getContext();
            c1907 = new C1907();
        }
        this.f5605 = c1907;
        if (zM8907) {
            c1903.getClass();
            interfaceC1395M2475 = c1903.f5609;
        } else {
            interfaceC1395M2475 = AbstractC1367.m2475(AbstractC2567.m5092(view.getContext()), C1353.f3919);
        }
        this.f5609 = interfaceC1395M2475;
        this.f5610 = view == (c1903 != null ? c1903.f5599 : null) ? c1903.f5610 : new C7315(view);
        if (zM8907) {
            c1903.getClass();
            c1821 = c1903.f5607;
        } else {
            c1821 = new C1821(ViewConfiguration.get(view.getContext()));
        }
        this.f5607 = c1821;
        this.f5608 = (c1903 == null || (c1758 = c1903.f5608) == null) ? new C1758() : c1758;
        this.f5601 = new C1865();
        this.f5600 = (c1903 == null || (c1602 = c1903.f5600) == null) ? new C1602() : c1602;
        this.f5604 = new InterfaceC6543() { // from class: androidx.compose.ui.platform.ComposeViewContext$calculateWindowSizeLambda$1
            {
                super(0);
            }

            @Override // p052.InterfaceC6543
            public final C1917 invoke() {
                this.this$0.getClass();
                boolean zM13357 = C7906.m13357(0L, 0L);
                C1903 c19032 = this.this$0;
                if (zM13357) {
                    return AbstractC1916.m3617(c19032.f5599);
                }
                c19032.getClass();
                return new C1917(0L, AbstractC6347.m11904(this.this$0.f5599.getContext()).mo1339(AbstractC0455.m1140(0L)));
            }
        };
        this.f5602 = new ComponentCallbacks2C1904(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m3599(Configuration configuration) {
        int iUpdateFrom = this.f5611.updateFrom(configuration);
        if (iUpdateFrom != 0) {
            Iterator it = this.f5594.f21971.entrySet().iterator();
            while (it.hasNext()) {
                C7940 c7940 = (C7940) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (c7940 == null || Configuration.needNewResources(iUpdateFrom, c7940.f21974)) {
                    it.remove();
                }
            }
            this.f5615.setValue(new Configuration(configuration));
            C7937 c7937 = this.f5612;
            synchronized (c7937) {
                c7937.f21970.m789();
            }
            if ((268435456 & iUpdateFrom) != 0) {
                this.f5609.setValue(AbstractC2567.m5092(this.f5599.getContext()));
            }
            if (((-1342235264) & iUpdateFrom) != 0) {
                C1865 c1865 = this.f5601;
                InterfaceC6543 interfaceC6543 = this.f5604;
                InterfaceC1395 interfaceC1395 = c1865.f5367;
                if (interfaceC1395 != null) {
                    ((AbstractC1347) interfaceC1395).setValue(interfaceC6543.invoke());
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m3600() {
        int i = this.f5603 + 1;
        this.f5603 = i;
        if (i == 1) {
            View view = this.f5599;
            Context context = view.getContext();
            ComponentCallbacks2C1904 componentCallbacks2C1904 = this.f5602;
            context.registerComponentCallbacks(componentCallbacks2C1904);
            m3599(view.getResources().getConfiguration());
            boolean zHasWindowFocus = view.hasWindowFocus();
            C1865 c1865 = this.f5601;
            ((AbstractC1347) c1865.f5366).setValue(Boolean.valueOf(zHasWindowFocus));
            InterfaceC1395 interfaceC1395 = c1865.f5367;
            InterfaceC6543 interfaceC6543 = this.f5604;
            if (interfaceC1395 == null) {
                c1865.f5368 = interfaceC6543;
            }
            if (interfaceC1395 != null) {
                ((AbstractC1347) interfaceC1395).setValue(interfaceC6543.invoke());
            }
            view.getViewTreeObserver().addOnWindowFocusChangeListener(componentCallbacks2C1904);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m3601() {
        int i = this.f5603 - 1;
        this.f5603 = i;
        if (i < 0) {
            Log.e("ComposeViewContext", "View count has dropped below 0");
            this.f5603 = 0;
        }
        if (this.f5603 == 0) {
            View view = this.f5599;
            Context context = view.getContext();
            ComponentCallbacks2C1904 componentCallbacks2C1904 = this.f5602;
            context.unregisterComponentCallbacks(componentCallbacks2C1904);
            C1865 c1865 = this.f5601;
            if (c1865.f5367 == null) {
                c1865.f5368 = null;
            }
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(componentCallbacks2C1904);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m3602(final ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884, final InterfaceC6554 interfaceC6554, InterfaceC1373 interfaceC1373, final int i) {
        final boolean z;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(123858079);
        int i2 = (i & 6) == 0 ? (c1324.m2378(viewTreeObserverOnGlobalLayoutListenerC1884) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= c1324.m2378(interfaceC6554) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c1324.m2378(this) ? 256 : 128;
        }
        if (c1324.m2343(i2 & 1, (i2 & 147) != 146)) {
            Object tag = viewTreeObserverOnGlobalLayoutListenerC1884.getTag(R.id.inspection_slot_table_set);
            LinkedHashMap linkedHashMap = null;
            Set set = (!(tag instanceof Set) || ((tag instanceof InterfaceC6567) && !(tag instanceof InterfaceC6562))) ? null : (Set) tag;
            if (set == null) {
                Object parent = viewTreeObserverOnGlobalLayoutListenerC1884.getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                set = (!(tag2 instanceof Set) || ((tag2 instanceof InterfaceC6567) && !(tag2 instanceof InterfaceC6562))) ? null : (Set) tag2;
            }
            if (set != null) {
                set.add(c1324.m2368());
                c1324.f3871 = true;
                c1324.f3846 = true;
                c1324.f3860.m2064();
                c1324.f3853.m2064();
                C1235 c1235 = c1324.f3852;
                C1233 c1233 = c1235.f3569;
                c1235.f3565 = c1233.f3540;
                c1235.f3564 = c1233.f3539;
            }
            Object objM2345 = c1324.m2345();
            InterfaceC7537 interfaceC7537 = this.f5596;
            C1353 c1353 = C1369.f3974;
            if (objM2345 == c1353) {
                Object parent2 = viewTreeObserverOnGlobalLayoutListenerC1884.getParent();
                parent2.getClass();
                View view2 = (View) parent2;
                Object tag3 = view2.getTag(R.id.compose_view_saveable_id_tag);
                String strValueOf = tag3 instanceof String ? (String) tag3 : null;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(view2.getId());
                }
                final String strM157 = AbstractC0053.m157("SaveableStateRegistry:", strValueOf);
                final C7539 savedStateRegistry = interfaceC7537.getSavedStateRegistry();
                Bundle bundleM12763 = savedStateRegistry.m12763(strM157);
                if (bundleM12763 != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str : bundleM12763.keySet()) {
                        ArrayList parcelableArrayList = bundleM12763.getParcelableArrayList(str);
                        parcelableArrayList.getClass();
                        linkedHashMap.put(str, parcelableArrayList);
                    }
                }
                DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1 disposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1 = new InterfaceC6558() { // from class: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1
                    @Override // p052.InterfaceC6558
                    public final Boolean invoke(Object obj) {
                        return Boolean.valueOf(AbstractC1916.m3616(obj));
                    }
                };
                C1334 c1334 = AbstractC7348.f19574;
                final C7344 c7344 = new C7344(linkedHashMap, disposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1);
                if (savedStateRegistry.m12762(strM157) != null) {
                    z = false;
                    C1914 c1914 = new C1914(c7344, new InterfaceC6543() { // from class: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m3438invoke() {
                            if (z) {
                                C7539 c7539 = savedStateRegistry;
                                String str2 = strM157;
                                c7539.getClass();
                                str2.getClass();
                                C7502 c7502 = c7539.f20421;
                                synchronized (c7502.f20363) {
                                }
                            }
                        }

                        @Override // p052.InterfaceC6543
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m3438invoke();
                            return C5176.f14739;
                        }
                    });
                    c1324.m2386(c1914);
                    objM2345 = c1914;
                } else {
                    try {
                        savedStateRegistry.m12761(strM157, new InterfaceC7540() { // from class: androidx.compose.ui.platform.飘花落叶言子苏哲世兰楪
                            @Override // p142.InterfaceC7540
                            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                            public final Bundle mo165() {
                                Map mapMo1484 = c7344.mo1484();
                                Bundle bundle = new Bundle();
                                for (Map.Entry entry : mapMo1484.entrySet()) {
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
                    C1914 c19142 = new C1914(c7344, new InterfaceC6543() { // from class: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m3438invoke() {
                            if (z) {
                                C7539 c7539 = savedStateRegistry;
                                String str2 = strM157;
                                c7539.getClass();
                                str2.getClass();
                                C7502 c7502 = c7539.f20421;
                                synchronized (c7502.f20363) {
                                }
                            }
                        }

                        @Override // p052.InterfaceC6543
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m3438invoke();
                            return C5176.f14739;
                        }
                    });
                    c1324.m2386(c19142);
                    objM2345 = c19142;
                }
            }
            final C1914 c19143 = (C1914) objM2345;
            boolean zM2378 = c1324.m2378(c19143);
            Object objM23452 = c1324.m2345();
            if (zM2378 || objM23452 == c1353) {
                objM23452 = new InterfaceC6558() { // from class: androidx.compose.ui.platform.ComposeViewContext$ProvideCompositionLocals$1$1
                    {
                        super(1);
                    }

                    @Override // p052.InterfaceC6558
                    public final InterfaceC1360 invoke(C1318 c1318) {
                        return new C0713(c19143, 8);
                    }
                };
                c1324.m2386(objM23452);
            }
            AbstractC1367.m2484(C5176.f14739, (InterfaceC6558) objM23452, c1324);
            C1358 c1358 = AbstractC1902.f5578;
            boolean zBooleanValue = ((Boolean) c1324.m2383(c1358)).booleanValue() | viewTreeObserverOnGlobalLayoutListenerC1884.getScrollCaptureInProgress$ui();
            boolean zM2360 = c1324.m2360(viewTreeObserverOnGlobalLayoutListenerC1884.getView());
            Object objM23453 = c1324.m2345();
            if (zM2360 || objM23453 == c1353) {
                viewTreeObserverOnGlobalLayoutListenerC1884.getView();
                objM23453 = new C1844();
                c1324.m2386(objM23453);
            }
            AbstractC1367.m2486(new C0194[]{AbstractC2362.f6993.mo2428(this.f5597), AbstractC7504.f20369.mo2428(interfaceC7537), AbstractC1835.f5334.mo2428(this.f5594), AbstractC1835.f5333.mo2428(this.f5612), AbstractC1835.f5336.mo2428(viewTreeObserverOnGlobalLayoutListenerC1884.getContext()), AbstractC1298.f3786.mo2428(set), AbstractC1835.f5337.mo2428(viewTreeObserverOnGlobalLayoutListenerC1884.getConfiguration()), AbstractC7348.f19574.mo2428(c19143), AbstractC1835.f5332.mo2428(viewTreeObserverOnGlobalLayoutListenerC1884.getView()), c1358.mo2428(Boolean.valueOf(zBooleanValue)), AbstractC1902.f5576.mo2428(viewTreeObserverOnGlobalLayoutListenerC1884.getViewConfiguration()), AbstractC1319.f3822.mo2428((C1844) objM23453)}, AbstractC1254.m2189(1317454175, new InterfaceC6554() { // from class: androidx.compose.ui.platform.ComposeViewContext$ProvideCompositionLocals$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(InterfaceC1373 interfaceC13732, int i3) {
                    C1324 c13242 = (C1324) interfaceC13732;
                    if (!c13242.m2343(i3 & 1, (i3 & 3) != 2)) {
                        c13242.m2339();
                        return;
                    }
                    c13242.m2392(866651995);
                    AbstractC1902.m3598(viewTreeObserverOnGlobalLayoutListenerC1884, this.f5613, interfaceC6554, c13242, 0);
                    c13242.m2377(false);
                }

                /* JADX INFO: renamed from: androidx.compose.ui.platform.ComposeViewContext$ProvideCompositionLocals$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
                @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "invoke", "(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
                public static final class AnonymousClass1 extends Lambda implements InterfaceC6554 {
                    final /* synthetic */ InterfaceC6554 $content;
                    final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC1884 $owner;
                    final /* synthetic */ C1903 this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884, C1903 c1903, InterfaceC6554 interfaceC6554) {
                        super(2);
                        this.$owner = viewTreeObserverOnGlobalLayoutListenerC1884;
                        this.this$0 = c1903;
                        this.$content = interfaceC6554;
                    }

                    public final void invoke(InterfaceC1373 interfaceC1373, int i) {
                        C1324 c1324 = (C1324) interfaceC1373;
                        if (c1324.m2343(i & 1, (i & 3) != 2)) {
                            AbstractC1902.m3598(this.$owner, this.this$0.f5613, this.$content, c1324, 0);
                        } else {
                            c1324.m2339();
                        }
                    }

                    @Override // p052.InterfaceC6554
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((InterfaceC1373) obj, ((Number) obj2).intValue());
                        return C5176.f14739;
                    }
                }

                @Override // p052.InterfaceC6554
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((InterfaceC1373) obj, ((Number) obj2).intValue());
                    return C5176.f14739;
                }
            }, c1324), c1324, 56);
        } else {
            c1324.m2339();
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new InterfaceC6554() { // from class: androidx.compose.ui.platform.ComposeViewContext$ProvideCompositionLocals$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(InterfaceC1373 interfaceC13732, int i3) {
                    this.$tmp4_rcvr.m3602(viewTreeObserverOnGlobalLayoutListenerC1884, interfaceC6554, interfaceC13732, AbstractC1367.m2471(i | 1));
                }

                @Override // p052.InterfaceC6554
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((InterfaceC1373) obj, ((Number) obj2).intValue());
                    return C5176.f14739;
                }
            };
        }
    }
}
