package com.equationl.ncnnandroidppocr.bean;

import androidx.activity.AbstractC0053;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/equationl/ncnnandroidppocr/bean/OcrTextResult;", "", "text", "", "id", "", "confidence", "", "(Ljava/lang/String;IF)V", "getConfidence", "()F", "getId", "()I", "getText", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "ncnnAndroidPPOCR_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class OcrTextResult {
    private final float confidence;
    private final int id;
    private final String text;

    public OcrTextResult(String str, int i, float f) {
        str.getClass();
        this.text = str;
        this.id = i;
        this.confidence = f;
    }

    public static /* synthetic */ OcrTextResult copy$default(OcrTextResult ocrTextResult, String str, int i, float f, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = ocrTextResult.text;
        }
        if ((i2 & 2) != 0) {
            i = ocrTextResult.id;
        }
        if ((i2 & 4) != 0) {
            f = ocrTextResult.confidence;
        }
        return ocrTextResult.copy(str, i, f);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getConfidence() {
        return this.confidence;
    }

    public final OcrTextResult copy(String text, int id, float confidence) {
        text.getClass();
        return new OcrTextResult(text, id, confidence);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OcrTextResult)) {
            return false;
        }
        OcrTextResult ocrTextResult = (OcrTextResult) other;
        return AbstractC4395.m8907(this.text, ocrTextResult.text) && this.id == ocrTextResult.id && Float.valueOf(this.confidence).equals(Float.valueOf(ocrTextResult.confidence));
    }

    public final float getConfidence() {
        return this.confidence;
    }

    public final int getId() {
        return this.id;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return Float.hashCode(this.confidence) + AbstractC0053.m144(this.id, this.text.hashCode() * 31, 31);
    }

    public String toString() {
        return "OcrTextResult(text=" + this.text + ", id=" + this.id + ", confidence=" + this.confidence + ")";
    }
}
