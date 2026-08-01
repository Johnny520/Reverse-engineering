package com.bumptech.glide.load.engine;

import android.app.Activity;
import android.view.Menu;
import android.view.View;
import androidx.compose.animation.core.C0325;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.internal.C1245;
import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.graphics.C1599;
import androidx.compose.ui.platform.actionmodecallback.MenuItemOption;
import androidx.core.view.C2242;
import androidx.recyclerview.widget.AbstractC2484;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.C2549;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.DialogX$THEME;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4461;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C4647;
import kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4642;
import kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4643;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4767;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4748;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4755;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4758;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4766;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4770;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4771;
import lin.xposed.hook.javaplugin.view.C5548;
import p046.C6476;
import p050.AbstractC6535;
import p052.InterfaceC6542;
import p079.AbstractC6988;
import p112.C7327;
import p218.AbstractC7970;
import p229.ExecutorServiceC8042;
import p257.C8197;
import p257.C8207;
import p257.C8226;
import p257.C8239;
import p261.AbstractC8247;
import p315.C8671;
import p345.AbstractC8838;
import p345.C8839;
import top.suzhelan.plugin.sdk.online.presenter.C5804;
import top.suzhelan.sticker.sdk.presenter.C5979;
import top.suzhelan.sticker.sdk.widget.CustomRecycleView;
import top.suzhelan.sticker.sdk.widget.FollowLinearLayout;
import top.yukonga.miuix.kmp.theme.ColorSchemeMode;
import top.yukonga.miuix.kmp.theme.ThemeColorSpec;
import top.yukonga.miuix.kmp.theme.ThemePaletteStyle;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3004 implements InterfaceC4642 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Object f9531;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Object f9532;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public Object f9533;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public Object f9534;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f9535;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f9536;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object f9537;

    public C3004(ColorSchemeMode colorSchemeMode) {
        C8839 c8839M14475 = AbstractC8838.m14475();
        long jM2870 = AbstractC1581.m2870(4280777463L);
        long j = C1599.f4693;
        long jM28702 = AbstractC1581.m2870(4278219741L);
        long jM28703 = AbstractC1581.m2870(4288268273L);
        long jM28704 = AbstractC1581.m2870(4293993762L);
        long jM28705 = AbstractC1581.m2870(4281206275L);
        long jM28706 = AbstractC1581.m2870(4294957782L);
        long jM28707 = AbstractC1581.m2870(4280630884L);
        long jM28708 = AbstractC1581.m2870(4284971411L);
        long jM28709 = AbstractC1581.m2870(4280630884L);
        long jM287010 = AbstractC1581.m2870(4284971155L);
        long jM287011 = AbstractC1581.m2870(4282669180L);
        long jM287012 = AbstractC1581.m2870(4281569252L);
        long jM287013 = AbstractC1581.m2870(4283453520L);
        long jM287014 = AbstractC1581.m2870(4282598211L);
        long jM287015 = AbstractC1581.m2870(4292467161L);
        long jM287016 = AbstractC1581.m2870(4282335039L);
        long jM287017 = AbstractC1581.m2870(4286151033L);
        long jM287018 = AbstractC1581.m2870(4282400832L);
        long jM287019 = AbstractC1581.m2870(4285559152L);
        long jM287020 = AbstractC1581.m2870(4282598211L);
        long jM287021 = AbstractC1581.m2870(4286348412L);
        long jM287022 = AbstractC1581.m2870(4283387727L);
        long jM287023 = AbstractC1581.m2870(4287993237L);
        long jM287024 = AbstractC1581.m2870(4281023316L);
        long jM287025 = AbstractC1581.m2870(4282878207L);
        long jM287026 = AbstractC1581.m2870(4283453520L);
        long jM287027 = AbstractC1581.m2870(4280558628L);
        long jM287028 = AbstractC1581.m2870(3875536895L);
        long jM287029 = AbstractC1581.m2870(4286086806L);
        long j2 = C1599.f4695;
        C8839 c8839 = new C8839(jM2870, j, jM28702, jM28703, jM28704, j, jM28705, jM28706, jM28707, jM28708, jM28709, jM287010, jM287011, jM287012, j, jM287013, j, jM287014, jM287015, jM287016, jM287017, jM287018, jM287019, jM287020, jM287021, jM287022, jM287023, jM287024, jM287025, jM287026, jM287027, jM287028, jM287029, j2, AbstractC1581.m2870(4294111986L), AbstractC1581.m2870(4280558628L), AbstractC1581.m2870(3439329279L), AbstractC1581.m2870(2164260863L), AbstractC1581.m2872(1728053247), AbstractC1581.m2870(4284900966L), AbstractC1581.m2870(4280558628L), AbstractC1581.m2870(3875536895L), AbstractC1581.m2870(4285756275L), AbstractC1581.m2870(4280558628L), AbstractC1581.m2870(4284900966L), AbstractC1581.m2870(4281150765L), AbstractC1581.m2870(4293519849L), AbstractC1581.m2870(4282400832L), AbstractC1581.m2870(4281940281L), C1599.m2940(0.6f, j2), AbstractC1581.m2872(1299876518), AbstractC1581.m2870(4284328703L), AbstractC1581.m2872(654311423));
        ThemeColorSpec themeColorSpec = ThemeColorSpec.Spec2021;
        ThemePaletteStyle themePaletteStyle = ThemePaletteStyle.TonalSpot;
        colorSchemeMode.getClass();
        themeColorSpec.getClass();
        themePaletteStyle.getClass();
        this.f9537 = AbstractC1367.m2465(colorSchemeMode);
        this.f9535 = AbstractC1367.m2465(c8839M14475);
        this.f9536 = AbstractC1367.m2465(c8839);
        this.f9532 = AbstractC1367.m2465(null);
        this.f9531 = AbstractC1367.m2465(themeColorSpec);
        this.f9533 = AbstractC1367.m2465(themePaletteStyle);
        this.f9534 = AbstractC1367.m2465(null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m6429(Menu menu, MenuItemOption menuItemOption, InterfaceC6542 interfaceC6542) {
        if (interfaceC6542 != null && menu.findItem(menuItemOption.getId()) == null) {
            m6430(menu, menuItemOption);
        } else {
            if (interfaceC6542 != null || menu.findItem(menuItemOption.getId()) == null) {
                return;
            }
            menu.removeItem(menuItemOption.getId());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m6430(Menu menu, MenuItemOption menuItemOption) {
        menu.add(0, menuItemOption.getId(), menuItemOption.getOrder(), menuItemOption.getTitleResource()).setShowAsAction(1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C1599 m6431() {
        return (C1599) ((AbstractC1347) ((InterfaceC1395) this.f9532)).getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4642
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public void mo979(C4690 c4690, C4748 c4748) {
        ((HashMap) this.f9535).put(c4690, new C4758(new C4755(c4748)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public ThemeColorSpec m6432() {
        return (ThemeColorSpec) ((AbstractC1347) ((InterfaceC1395) this.f9531)).getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4642, kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4643
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo980() {
        C4647 c4647 = (C4647) this.f9536;
        C4687 c4687 = (C4687) this.f9531;
        HashMap map = (HashMap) this.f9535;
        map.getClass();
        boolean zM9253 = false;
        if (c4687.equals(AbstractC6535.f17938)) {
            Object obj = map.get(C4690.m9340("value"));
            C4758 c4758 = obj instanceof C4758 ? (C4758) obj : null;
            if (c4758 != null) {
                Object obj2 = c4758.f13901;
                C4755 c4755 = obj2 instanceof C4755 ? (C4755) obj2 : null;
                if (c4755 != null) {
                    zM9253 = c4647.m9253(c4755.f13895.f13892);
                }
            }
        }
        if (zM9253 || c4647.m9253(c4687)) {
            return;
        }
        ((List) this.f9533).add(new C6476(((AbstractC6988) this.f9532).mo9035(), map, (InterfaceC4461) this.f9534));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4642
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public InterfaceC4643 mo983(C4690 c4690) {
        return new C0325((C4647) this.f9537, c4690, this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4642
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public void mo987(C4690 c4690, Object obj) {
        AbstractC4767 abstractC4767M9505 = C4766.m9505(obj, ((C4647) this.f9537).f13579);
        if (abstractC4767M9505 == null) {
            abstractC4767M9505 = new C4771("Unsupported annotation argument: " + c4690);
        }
        ((HashMap) this.f9535).put(c4690, abstractC4767M9505);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public ThemePaletteStyle m6433() {
        return (ThemePaletteStyle) ((AbstractC1347) ((InterfaceC1395) this.f9533)).getValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public void m6434(String str) {
        C8197.m13693();
        ((C8239) this.f9535).m13747();
        C8207.m13712(str, "错误").mo13702("确定", new C5548(5));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public void m6435() {
        int bindingAdapterPosition;
        C2549 c2549 = (C2549) this.f9533;
        if (c2549 == null) {
            AbstractC4394.m8918("viewPager");
            throw null;
        }
        View childAt = c2549.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView == null) {
            return;
        }
        C2549 c25492 = (C2549) this.f9533;
        if (c25492 == null) {
            AbstractC4394.m8918("viewPager");
            throw null;
        }
        AbstractC2484 abstractC2484M4706 = recyclerView.m4706(c25492.getCurrentItem());
        C8671 c8671 = abstractC2484M4706 instanceof C8671 ? (C8671) abstractC2484M4706 : null;
        if (c8671 == null || (bindingAdapterPosition = c8671.getBindingAdapterPosition()) == -1) {
            return;
        }
        C2549 c25493 = (C2549) this.f9533;
        if (c25493 == null) {
            AbstractC4394.m8918("viewPager");
            throw null;
        }
        if (bindingAdapterPosition != c25493.getCurrentItem()) {
            return;
        }
        FollowLinearLayout followLinearLayout = (FollowLinearLayout) this.f9532;
        if (followLinearLayout != null) {
            followLinearLayout.setFollowRecycleView((CustomRecycleView) c8671.m14342(R.id.rv_sticker_list));
        } else {
            AbstractC4394.m8918("rootView");
            throw null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4642
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public InterfaceC4642 mo989(C4687 c4687, C4690 c4690) {
        ArrayList arrayList = new ArrayList();
        return new C1245(((C4647) this.f9537).mo9252(c4687, InterfaceC4461.f13087, arrayList), this, c4690, arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4642
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public void mo990(C4690 c4690, C4687 c4687, C4690 c46902) {
        ((HashMap) this.f9535).put(c4690, new C4770(c4687, c46902));
    }

    public C3004(Activity activity, int i) {
        switch (i) {
            case 5:
                activity.getClass();
                this.f9537 = activity;
                C8226 c8226 = new C8226();
                c8226.f22704 = AbstractC8247.f22825;
                c8226.f22703 = -1.0f;
                c8226.f22706 = true;
                c8226.f22702 = c8226;
                c8226.f11577 = DialogX$THEME.AUTO;
                this.f9535 = c8226;
                this.f9536 = new C5804(this);
                break;
            default:
                this.f9537 = activity;
                C8239 c8239M13743 = C8239.m13743();
                c8239M13743.f11577 = DialogX$THEME.AUTO;
                this.f9535 = c8239M13743;
                this.f9536 = new C5979(this);
                break;
        }
    }

    public C3004(C4647 c4647, AbstractC6988 abstractC6988, C4687 c4687, List list, InterfaceC4461 interfaceC4461) {
        this.f9536 = c4647;
        this.f9532 = abstractC6988;
        this.f9531 = c4687;
        this.f9533 = list;
        this.f9534 = interfaceC4461;
        this.f9537 = c4647;
        this.f9535 = new HashMap();
    }

    public C3004(InterfaceC6542 interfaceC6542) {
        this.f9537 = interfaceC6542;
        this.f9535 = C7327.f19541;
        this.f9536 = null;
        this.f9532 = null;
        this.f9531 = null;
        this.f9533 = null;
        this.f9534 = null;
    }

    public C3004(ExecutorServiceC8042 executorServiceC8042, ExecutorServiceC8042 executorServiceC80422, ExecutorServiceC8042 executorServiceC80423, ExecutorServiceC8042 executorServiceC80424, C3007 c3007, C3007 c30072) {
        this.f9534 = AbstractC7970.m13433(150, new C2242(this, 9));
        this.f9537 = executorServiceC8042;
        this.f9535 = executorServiceC80422;
        this.f9536 = executorServiceC80423;
        this.f9532 = executorServiceC80424;
        this.f9531 = c3007;
        this.f9533 = c30072;
    }
}
