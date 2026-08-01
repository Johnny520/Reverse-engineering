package com.equationl.ncnnandroidppocr;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import bsh.C3466;
import com.equationl.ncnnandroidppocr.bean.DrawModel;
import com.equationl.ncnnandroidppocr.bean.OcrResult;
import com.equationl.ncnnandroidppocr.bean.OcrTextLineResult;
import com.equationl.ncnnandroidppocr.cpp.OCRNative;
import java.util.Iterator;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import net.bytebuddy.jar.asm.Opcodes;
import p050.AbstractC7176;
import p068.InterfaceC7372;

/* JADX INFO: renamed from: com.equationl.ncnnandroidppocr.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3903 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6016 f10175 = AbstractC6019.m10773(new InterfaceC7372() { // from class: com.equationl.ncnnandroidppocr.OCR$ocrNative$2
        @Override // p068.InterfaceC7372
        public final OCRNative invoke() {
            return new OCRNative();
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int[] f10174 = {Opcodes.V_PREVIEW, -16711936, -16776961, -256, -65281, -16711681, Color.rgb(128, 0, 0), Color.rgb(0, 128, 0), Color.rgb(0, 0, 128), Color.rgb(128, 128, 0), Color.rgb(128, 0, 128), Color.rgb(0, 128, 128)};

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.Throwable] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final OcrResult m7451(String str, DrawModel drawModel) {
        Bitmap bitmap;
        Bitmap bitmapDecodeFile;
        OcrResult ocrResult;
        drawModel.getClass();
        OcrResult ocrResultDetectImagePath = ((OCRNative) this.f10175.getValue()).detectImagePath(str);
        OcrResult ocrResult2 = null;
        if (ocrResultDetectImagePath == null) {
            return null;
        }
        if (drawModel == DrawModel.None || (bitmapDecodeFile = BitmapFactory.decodeFile(str)) == null) {
            bitmap = null;
        } else {
            int i = 1;
            Bitmap bitmapCopy = bitmapDecodeFile.copy(Bitmap.Config.ARGB_8888, true);
            Canvas canvas = new Canvas(bitmapCopy);
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(3.0f);
            paint.setAntiAlias(true);
            Paint paint2 = new Paint();
            paint2.setTextSize(24.0f);
            paint2.setAntiAlias(true);
            Paint paint3 = new Paint();
            paint3.setStyle(Paint.Style.FILL);
            paint3.setColor(-1);
            int i2 = 0;
            for (Object obj : ocrResultDetectImagePath.getTextLines()) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    ?? r17 = ocrResult2;
                    AbstractC7176.m12479();
                    throw r17;
                }
                OcrTextLineResult ocrTextLineResult = (OcrTextLineResult) obj;
                int[] iArr = this.f10174;
                int i4 = iArr[i2 % iArr.length];
                paint.setColor(i4);
                paint2.setColor(i4);
                if (ocrTextLineResult.getPoints().size() == 4) {
                    Path path = new Path();
                    path.moveTo(ocrTextLineResult.getPoints().get(0).x, ocrTextLineResult.getPoints().get(0).y);
                    path.lineTo(ocrTextLineResult.getPoints().get(i).x, ocrTextLineResult.getPoints().get(i).y);
                    ocrResult = ocrResult2;
                    path.lineTo(ocrTextLineResult.getPoints().get(2).x, ocrTextLineResult.getPoints().get(2).y);
                    path.lineTo(ocrTextLineResult.getPoints().get(3).x, ocrTextLineResult.getPoints().get(3).y);
                    path.close();
                    canvas.drawPath(path, paint);
                } else {
                    ocrResult = ocrResult2;
                }
                if (drawModel == DrawModel.Full && !ocrTextLineResult.getPoints().isEmpty()) {
                    String text = ocrTextLineResult.getText();
                    if (text.length() > 0) {
                        Iterator it = ocrTextLineResult.getPoints().iterator();
                        if (!it.hasNext()) {
                            C3466.m5896();
                            return ocrResult;
                        }
                        int i5 = ((Point) it.next()).x;
                        while (it.hasNext()) {
                            int i6 = ((Point) it.next()).x;
                            if (i5 > i6) {
                                i5 = i6;
                            }
                        }
                        float f = i5;
                        Iterator it2 = ocrTextLineResult.getPoints().iterator();
                        if (!it2.hasNext()) {
                            C3466.m5896();
                            return ocrResult;
                        }
                        int i7 = ((Point) it2.next()).y;
                        while (it2.hasNext()) {
                            int i8 = ((Point) it2.next()).y;
                            if (i7 > i8) {
                                i7 = i8;
                            }
                        }
                        float f2 = i7;
                        float fMeasureText = paint2.measureText(text);
                        float textSize = paint2.getTextSize();
                        float f3 = (f2 - textSize) - 5.0f < 0.0f ? textSize + 5.0f : f2 - 5.0f;
                        canvas.drawRect(f, f3 - textSize, fMeasureText + f, f3 + 5.0f, paint3);
                        canvas.drawText(text, f, f3, paint2);
                    } else {
                        continue;
                    }
                }
                i2 = i3;
                ocrResult2 = ocrResult;
                i = 1;
            }
            bitmapCopy.getClass();
            bitmap = bitmapCopy;
        }
        return OcrResult.copy$default(ocrResultDetectImagePath, null, 0L, null, bitmap, 7, null);
    }
}
