package com.google.android.material.textfield;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import p171.C8436;

/* JADX INFO: renamed from: com.google.android.material.textfield.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4024 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final CheckableImageButton f11094;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Context f11095;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4027 f11096;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final TextInputLayout f11097;

    public AbstractC4024(C4027 c4027) {
        this.f11097 = c4027.f11125;
        this.f11096 = c4027;
        this.f11095 = c4027.getContext();
        this.f11094 = c4027.f11122;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public View.OnClickListener mo7779() {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public View.OnFocusChangeListener mo7780() {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public int mo7781() {
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public int mo7782() {
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m7814() {
        this.f11096.m7818(false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public AccessibilityManager.TouchExplorationStateChangeListener mo7815() {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public View.OnFocusChangeListener mo7788() {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public boolean mo7810() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public boolean mo7816(int i) {
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public boolean mo7811() {
        return this instanceof C4031;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo7809() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo7783() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public void mo7778() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public void mo7786() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public void mo7812(AccessibilityEvent accessibilityEvent) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public void mo7813(C8436 c8436) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public void mo7787(boolean z) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public void mo7789(EditText editText) {
    }
}
