package androidx.core.view;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p164.C7664;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C2238 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C2225 f6530;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2225 f6531;

    static {
        int i = Build.VERSION.SDK_INT;
        f6530 = (i >= 36 ? new C2220() : i >= 35 ? new C2221() : i >= 34 ? new C2233() : i >= 31 ? new C2232() : i >= 30 ? new C2235() : i >= 29 ? new C2234() : new C2231()).mo4046().f6520.mo4011().f6520.mo4008().f6520.mo4007();
    }

    public C2238(C2225 c2225) {
        this.f6531 = c2225;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2238)) {
            return false;
        }
        C2238 c2238 = (C2238) obj;
        return mo4032() == c2238.mo4032() && mo4009() == c2238.mo4009() && Objects.equals(mo4037(), c2238.mo4037()) && Objects.equals(mo4010(), c2238.mo4010()) && Objects.equals(mo4012(), c2238.mo4012());
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(mo4032()), Boolean.valueOf(mo4009()), mo4037(), mo4010(), mo4012());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public List<Rect> mo4029(int i) {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public C2225 mo4007() {
        return this.f6531;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public C2225 mo4008() {
        return this.f6531;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public C2225 mo4011() {
        return this.f6531;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public boolean mo4032() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public boolean mo4009() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public boolean mo4035(int i) {
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public C7664 mo4037() {
        return C7664.f20811;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public C7664 mo4124() {
        return mo4037();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public C2225 mo4039(int i, int i2, int i3, int i4) {
        return f6530;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public C7664 mo4125() {
        return mo4037();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public C2254 mo4012() {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public List<Rect> mo4041(int i) {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public C7664 mo4126() {
        return mo4037();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public C7664 mo4010() {
        return C7664.f20811;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public C7664 mo4042(int i) {
        return C7664.f20811;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public C7664 mo4043(int i) {
        if ((i & 8) == 0) {
            return C7664.f20811;
        }
        C5919.m11249("Unable to query the maximum insets for IME");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public void mo4038() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public void mo4024(Rect[][] rectArr) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public void mo4025(Rect[][] rectArr) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public void mo4026(int i) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public void mo4006(C7664 c7664) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public void mo4027(C2225 c2225) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public void mo4030(C2225 c2225) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public void mo4031(View view) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public void mo4033(C7664[] c7664Arr) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public void mo4034(C7664 c7664) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public void mo4036(C2259 c2259) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public void mo4040(View view) {
    }
}
