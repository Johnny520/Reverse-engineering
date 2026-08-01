package com.alibaba.fastjson2.reader;

import android.graphics.ImageDecoder;
import android.text.PrecomputedText;
import android.text.TextPaint;
import android.view.DisplayCutout;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC3576 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ ImageDecoder.Source m6107(Object obj) {
        return (ImageDecoder.Source) obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ boolean m6113(Object obj) {
        return obj instanceof DisplayCutout;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ void m6115(Object obj) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ boolean m6116(CharSequence charSequence) {
        return charSequence instanceof PrecomputedText;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ DisplayCutout m6126(Object obj) {
        return (DisplayCutout) obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static /* synthetic */ PrecomputedText.Params.Builder m6127(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }
}
