package com.equationl.ncnnandroidppocr.bean;

import android.graphics.Bitmap;
import androidx.activity.AbstractC0053;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4385;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\nHÆ\u0003J9\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/equationl/ncnnandroidppocr/bean/OcrResult;", "", "text", "", "inferenceTime", "", "textLines", "", "Lcom/equationl/ncnnandroidppocr/bean/OcrTextLineResult;", "drawBitmap", "Landroid/graphics/Bitmap;", "(Ljava/lang/String;JLjava/util/List;Landroid/graphics/Bitmap;)V", "getDrawBitmap", "()Landroid/graphics/Bitmap;", "getInferenceTime", "()J", "getText", "()Ljava/lang/String;", "getTextLines", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ncnnAndroidPPOCR_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class OcrResult {
    private final Bitmap drawBitmap;
    private final long inferenceTime;
    private final String text;
    private final List<OcrTextLineResult> textLines;

    public OcrResult(String str, long j, List<OcrTextLineResult> list, Bitmap bitmap) {
        str.getClass();
        list.getClass();
        this.text = str;
        this.inferenceTime = j;
        this.textLines = list;
        this.drawBitmap = bitmap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OcrResult copy$default(OcrResult ocrResult, String str, long j, List list, Bitmap bitmap, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ocrResult.text;
        }
        if ((i & 2) != 0) {
            j = ocrResult.inferenceTime;
        }
        if ((i & 4) != 0) {
            list = ocrResult.textLines;
        }
        if ((i & 8) != 0) {
            bitmap = ocrResult.drawBitmap;
        }
        return ocrResult.copy(str, j, list, bitmap);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getInferenceTime() {
        return this.inferenceTime;
    }

    public final List<OcrTextLineResult> component3() {
        return this.textLines;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Bitmap getDrawBitmap() {
        return this.drawBitmap;
    }

    public final OcrResult copy(String text, long inferenceTime, List<OcrTextLineResult> textLines, Bitmap drawBitmap) {
        text.getClass();
        textLines.getClass();
        return new OcrResult(text, inferenceTime, textLines, drawBitmap);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OcrResult)) {
            return false;
        }
        OcrResult ocrResult = (OcrResult) other;
        return AbstractC4395.m8907(this.text, ocrResult.text) && this.inferenceTime == ocrResult.inferenceTime && AbstractC4395.m8907(this.textLines, ocrResult.textLines) && AbstractC4395.m8907(this.drawBitmap, ocrResult.drawBitmap);
    }

    public final Bitmap getDrawBitmap() {
        return this.drawBitmap;
    }

    public final long getInferenceTime() {
        return this.inferenceTime;
    }

    public final String getText() {
        return this.text;
    }

    public final List<OcrTextLineResult> getTextLines() {
        return this.textLines;
    }

    public int hashCode() {
        int iM160 = AbstractC0053.m160(this.textLines, AbstractC0053.m142(this.text.hashCode() * 31, 31, this.inferenceTime), 31);
        Bitmap bitmap = this.drawBitmap;
        return iM160 + (bitmap == null ? 0 : bitmap.hashCode());
    }

    public String toString() {
        return "OcrResult(text=" + this.text + ", inferenceTime=" + this.inferenceTime + ", textLines=" + this.textLines + ", drawBitmap=" + this.drawBitmap + ")";
    }

    public /* synthetic */ OcrResult(String str, long j, List list, Bitmap bitmap, int i, AbstractC4385 abstractC4385) {
        this(str, j, list, (i & 8) != 0 ? null : bitmap);
    }
}
