package androidx.core.view;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p180.C8494;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C3071 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C3058 f6876;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3058 f6877;

    static {
        int i = Build.VERSION.SDK_INT;
        f6876 = (i >= 36 ? new C3053() : i >= 35 ? new C3054() : i >= 34 ? new C3066() : i >= 31 ? new C3065() : i >= 30 ? new C3068() : i >= 29 ? new C3067() : new C3064()).mo4616().f6866.mo4581().f6866.mo4578().f6866.mo4577();
    }

    public C3071(C3058 c3058) {
        this.f6877 = c3058;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3071)) {
            return false;
        }
        C3071 c3071 = (C3071) obj;
        return mo4602() == c3071.mo4602() && mo4579() == c3071.mo4579() && Objects.equals(mo4607(), c3071.mo4607()) && Objects.equals(mo4580(), c3071.mo4580()) && Objects.equals(mo4582(), c3071.mo4582());
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(mo4602()), Boolean.valueOf(mo4579()), mo4607(), mo4580(), mo4582());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public List<Rect> mo4599(int i) {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public C3058 mo4577() {
        return this.f6877;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public C3058 mo4578() {
        return this.f6877;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public C3058 mo4581() {
        return this.f6877;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public boolean mo4602() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public boolean mo4579() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public boolean mo4605(int i) {
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public C8494 mo4607() {
        return C8494.f21151;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public C8494 mo4694() {
        return mo4607();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public C3058 mo4609(int i, int i2, int i3, int i4) {
        return f6876;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public C8494 mo4695() {
        return mo4607();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public C3087 mo4582() {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public List<Rect> mo4611(int i) {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public C8494 mo4696() {
        return mo4607();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public C8494 mo4580() {
        return C8494.f21151;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public C8494 mo4612(int i) {
        return C8494.f21151;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public C8494 mo4613(int i) {
        if ((i & 8) == 0) {
            return C8494.f21151;
        }
        C6755.m11869("Unable to query the maximum insets for IME");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public void mo4608() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public void mo4594(Rect[][] rectArr) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public void mo4595(Rect[][] rectArr) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public void mo4596(int i) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public void mo4576(C8494 c8494) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public void mo4597(C3058 c3058) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public void mo4600(C3058 c3058) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public void mo4601(View view) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public void mo4603(C8494[] c8494Arr) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public void mo4604(C8494 c8494) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public void mo4606(C3092 c3092) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public void mo4610(View view) {
    }
}
