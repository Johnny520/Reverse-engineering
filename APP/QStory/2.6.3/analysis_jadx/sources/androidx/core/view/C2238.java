package androidx.core.view;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p164.C7665;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C2238 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C2225 f6531;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2225 f6532;

    static {
        int i = Build.VERSION.SDK_INT;
        f6531 = (i >= 36 ? new C2220() : i >= 35 ? new C2221() : i >= 34 ? new C2233() : i >= 31 ? new C2232() : i >= 30 ? new C2235() : i >= 29 ? new C2234() : new C2231()).mo4056().f6521.mo4021().f6521.mo4018().f6521.mo4017();
    }

    public C2238(C2225 c2225) {
        this.f6532 = c2225;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2238)) {
            return false;
        }
        C2238 c2238 = (C2238) obj;
        return mo4042() == c2238.mo4042() && mo4019() == c2238.mo4019() && Objects.equals(mo4047(), c2238.mo4047()) && Objects.equals(mo4020(), c2238.mo4020()) && Objects.equals(mo4022(), c2238.mo4022());
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(mo4042()), Boolean.valueOf(mo4019()), mo4047(), mo4020(), mo4022());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public List<Rect> mo4039(int i) {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public C2225 mo4017() {
        return this.f6532;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public C2225 mo4018() {
        return this.f6532;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public C2225 mo4021() {
        return this.f6532;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public boolean mo4042() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public boolean mo4019() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public boolean mo4045(int i) {
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public C7665 mo4047() {
        return C7665.f20806;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public C7665 mo4134() {
        return mo4047();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public C2225 mo4049(int i, int i2, int i3, int i4) {
        return f6531;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public C7665 mo4135() {
        return mo4047();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public C2254 mo4022() {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public List<Rect> mo4051(int i) {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public C7665 mo4136() {
        return mo4047();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public C7665 mo4020() {
        return C7665.f20806;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public C7665 mo4052(int i) {
        return C7665.f20806;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public C7665 mo4053(int i) {
        if ((i & 8) == 0) {
            return C7665.f20806;
        }
        C5925.m11310("Unable to query the maximum insets for IME");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public void mo4048() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public void mo4034(Rect[][] rectArr) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public void mo4035(Rect[][] rectArr) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public void mo4036(int i) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public void mo4016(C7665 c7665) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public void mo4037(C2225 c2225) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public void mo4040(C2225 c2225) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public void mo4041(View view) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public void mo4043(C7665[] c7665Arr) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public void mo4044(C7665 c7665) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public void mo4046(C2259 c2259) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public void mo4050(View view) {
    }
}
