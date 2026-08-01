package com.equationl.ncnnandroidppocr.cpp;

import com.davemorrissey.labs.subscaleview.BuildConfig;
import com.equationl.ncnnandroidppocr.bean.OcrResult;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001JJ\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0086 ¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0086 ¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/equationl/ncnnandroidppocr/cpp/OCRNative;", "", "", "detParamPath", "detModelPath", "recParamPath", "recModelPath", "", "sizeid", "cpugpu", "", "useFp16", "loadModelByPath", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZ)Z", "Lkotlin/飘花落叶言子楪兰苏哲世;", BuildConfig.BUILD_TYPE, "()V", "imagePath", "Lcom/equationl/ncnnandroidppocr/bean/OcrResult;", "detectImagePath", "(Ljava/lang/String;)Lcom/equationl/ncnnandroidppocr/bean/OcrResult;", "ncnnAndroidPPOCR_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class OCRNative {
    static {
        System.loadLibrary("ppocrv5ncnn");
    }

    public final native OcrResult detectImagePath(String imagePath);

    public final native boolean loadModelByPath(String detParamPath, String detModelPath, String recParamPath, String recModelPath, int sizeid, int cpugpu, boolean useFp16);

    public final native void release();
}
