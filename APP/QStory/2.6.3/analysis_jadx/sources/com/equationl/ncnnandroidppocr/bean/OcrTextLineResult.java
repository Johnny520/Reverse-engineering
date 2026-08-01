package com.equationl.ncnnandroidppocr.bean;

import android.graphics.Point;
import androidx.activity.AbstractC0053;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4395;
import p009.AbstractC6183;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003¢\u0006\u0002\u0010\rJ\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003HÆ\u0003JG\u0010\u001c\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\nHÖ\u0001J\t\u0010!\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013¨\u0006\""}, d2 = {"Lcom/equationl/ncnnandroidppocr/bean/OcrTextLineResult;", "", "points", "", "Landroid/graphics/Point;", "text", "", "confidence", "", "orientation", "", "textList", "Lcom/equationl/ncnnandroidppocr/bean/OcrTextResult;", "(Ljava/util/List;Ljava/lang/String;FILjava/util/List;)V", "getConfidence", "()F", "getOrientation", "()I", "getPoints", "()Ljava/util/List;", "getText", "()Ljava/lang/String;", "getTextList", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "ncnnAndroidPPOCR_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class OcrTextLineResult {
    private final float confidence;
    private final int orientation;
    private final List<Point> points;
    private final String text;
    private final List<OcrTextResult> textList;

    /* JADX WARN: Multi-variable type inference failed */
    public OcrTextLineResult(List<? extends Point> list, String str, float f, int i, List<OcrTextResult> list2) {
        list.getClass();
        str.getClass();
        list2.getClass();
        this.points = list;
        this.text = str;
        this.confidence = f;
        this.orientation = i;
        this.textList = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OcrTextLineResult copy$default(OcrTextLineResult ocrTextLineResult, List list, String str, float f, int i, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = ocrTextLineResult.points;
        }
        if ((i2 & 2) != 0) {
            str = ocrTextLineResult.text;
        }
        if ((i2 & 4) != 0) {
            f = ocrTextLineResult.confidence;
        }
        if ((i2 & 8) != 0) {
            i = ocrTextLineResult.orientation;
        }
        if ((i2 & 16) != 0) {
            list2 = ocrTextLineResult.textList;
        }
        List list3 = list2;
        float f2 = f;
        return ocrTextLineResult.copy(list, str, f2, i, list3);
    }

    public final List<Point> component1() {
        return this.points;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getConfidence() {
        return this.confidence;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getOrientation() {
        return this.orientation;
    }

    public final List<OcrTextResult> component5() {
        return this.textList;
    }

    public final OcrTextLineResult copy(List<? extends Point> points, String text, float confidence, int orientation, List<OcrTextResult> textList) {
        points.getClass();
        text.getClass();
        textList.getClass();
        return new OcrTextLineResult(points, text, confidence, orientation, textList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OcrTextLineResult)) {
            return false;
        }
        OcrTextLineResult ocrTextLineResult = (OcrTextLineResult) other;
        return AbstractC4395.m8907(this.points, ocrTextLineResult.points) && AbstractC4395.m8907(this.text, ocrTextLineResult.text) && Float.valueOf(this.confidence).equals(Float.valueOf(ocrTextLineResult.confidence)) && this.orientation == ocrTextLineResult.orientation && AbstractC4395.m8907(this.textList, ocrTextLineResult.textList);
    }

    public final float getConfidence() {
        return this.confidence;
    }

    public final int getOrientation() {
        return this.orientation;
    }

    public final List<Point> getPoints() {
        return this.points;
    }

    public final String getText() {
        return this.text;
    }

    public final List<OcrTextResult> getTextList() {
        return this.textList;
    }

    public int hashCode() {
        return this.textList.hashCode() + AbstractC0053.m144(this.orientation, AbstractC0053.m145(AbstractC6183.m11572(this.points.hashCode() * 31, 31, this.text), this.confidence, 31), 31);
    }

    public String toString() {
        return "OcrTextLineResult(points=" + this.points + ", text=" + this.text + ", confidence=" + this.confidence + ", orientation=" + this.orientation + ", textList=" + this.textList + ")";
    }
}
