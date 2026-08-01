package p368;

import android.content.res.AssetManager;
import bsh.C3466;
import com.alibaba.fastjson2.AbstractC3738;
import com.equationl.ncnnandroidppocr.C3903;
import com.equationl.ncnnandroidppocr.bean.Device;
import com.equationl.ncnnandroidppocr.bean.DrawModel;
import com.equationl.ncnnandroidppocr.bean.ImageSize;
import com.equationl.ncnnandroidppocr.bean.OcrResult;
import com.equationl.ncnnandroidppocr.bean.OcrTextLineResult;
import com.equationl.ncnnandroidppocr.bean.OcrTextResult;
import com.equationl.ncnnandroidppocr.cpp.OCRNative;
import io.ktor.client.plugins.AbstractC4765;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Result;
import kotlin.reflect.jvm.internal.AbstractC5894;
import kotlin.text.AbstractC5976;
import lin.xposed.hook.javaplugin.bean.OcrText;
import p026.AbstractC7017;
import p050.AbstractC7176;
import p052.AbstractC7187;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪兰世子.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9693 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static volatile C3903 f25350;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9693 f25351;

    static {
        "OcrUtil";
        "paddleocr4";
        "PP_OCRv5_mobile_det.ncnn.param";
        "PP_OCRv5_mobile_det.ncnn.bin";
        "PP_OCRv5_mobile_rec.ncnn.param";
        "PP_OCRv5_mobile_rec.ncnn.bin";
        f25351 = new C9693();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final ArrayList m15087(String str) {
        "imagePath";
        str.getClass();
        if (AbstractC5976.m10731(str)) {
            AbstractC7017.m12163("OCR 跳过识别：图片路径为空", "OcrUtil");
            return new ArrayList();
        }
        File file = new File(str);
        if (!file.isFile()) {
            AbstractC7017.m12163("OCR 跳过识别：图片不存在，path=" + file.getAbsolutePath(), "OcrUtil");
            return new ArrayList();
        }
        C9693 c9693 = f25351;
        C3903 c3903M15089 = f25350;
        if (c3903M15089 != null) {
            c9693.getClass();
        } else {
            synchronized (c9693) {
                c3903M15089 = f25350;
                if (c3903M15089 == null) {
                    c9693.getClass();
                    c3903M15089 = m15089();
                }
            }
        }
        String absolutePath = file.getAbsolutePath();
        "getAbsolutePath(...)";
        absolutePath.getClass();
        OcrResult ocrResultM7451 = c3903M15089.m7451(absolutePath, DrawModel.None);
        if (ocrResultM7451 == null) {
            C6755.m11870("Check failed.");
            return null;
        }
        List<OcrTextLineResult> textLines = ocrResultM7451.getTextLines();
        ArrayList arrayList = new ArrayList();
        for (OcrTextLineResult ocrTextLineResult : textLines) {
            OcrText ocrText = new OcrText();
            ocrText.text = ocrTextLineResult.getText();
            ocrText.confidence = Float.valueOf(ocrTextLineResult.getConfidence());
            ocrText.orientation = ocrTextLineResult.getOrientation();
            ocrText.points = ocrTextLineResult.getPoints();
            ArrayList arrayList2 = new ArrayList();
            for (OcrTextResult ocrTextResult : ocrTextLineResult.getTextList()) {
                OcrText.OcrTextResult ocrTextResult2 = new OcrText.OcrTextResult();
                ocrTextResult2.text = ocrTextResult.getText();
                ocrTextResult2.confidence = Float.valueOf(ocrTextResult.getConfidence());
                ocrTextResult2.f315id = ocrTextResult.getId();
                arrayList2.add(ocrTextResult2);
            }
            ocrText.textList = arrayList2;
            arrayList.add(ocrText);
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final String m15088(String str) {
        String text;
        "imagePath";
        str.getClass();
        if (AbstractC5976.m10731(str)) {
            AbstractC7017.m12163("OCR 跳过识别：图片路径为空", "OcrUtil");
            return "";
        }
        File file = new File(str);
        if (!file.isFile()) {
            AbstractC7017.m12163("OCR 跳过识别：图片不存在，path=" + file.getAbsolutePath(), "OcrUtil");
            return "";
        }
        C9693 c9693 = f25351;
        C3903 c3903M15089 = f25350;
        if (c3903M15089 != null) {
            c9693.getClass();
        } else {
            synchronized (c9693) {
                c3903M15089 = f25350;
                if (c3903M15089 == null) {
                    c9693.getClass();
                    c3903M15089 = m15089();
                }
            }
        }
        String absolutePath = file.getAbsolutePath();
        "getAbsolutePath(...)";
        absolutePath.getClass();
        OcrResult ocrResultM7451 = c3903M15089.m7451(absolutePath, DrawModel.None);
        String string = (ocrResultM7451 == null || (text = ocrResultM7451.getText()) == null) ? null : AbstractC5976.m10714(text).toString();
        return string == null ? "" : string;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C3903 m15089() throws IllegalAccessException, IOException, InvocationTargetException {
        String str = AbstractC7187.f17855;
        str.getClass();
        File file = new File(AbstractC4765.m8870("ocr"));
        if (!file.exists()) {
            file.mkdirs();
        }
        AssetManager assetManager = (AssetManager) AssetManager.class.getDeclaredConstructor(null).newInstance(null);
        Object objInvoke = AssetManager.class.getMethod("addAssetPath", String.class).invoke(assetManager, str);
        Integer num = objInvoke instanceof Integer ? (Integer) objInvoke : null;
        if ((num != null ? num.intValue() : 0) == 0) {
            C6755.m11866("addAssetPath failed: ".concat(str));
            return null;
        }
        assetManager.getClass();
        try {
            for (String str2 : AbstractC7176.m12490("PP_OCRv5_mobile_det.ncnn.param", "PP_OCRv5_mobile_det.ncnn.bin", "PP_OCRv5_mobile_rec.ncnn.param", "PP_OCRv5_mobile_rec.ncnn.bin")) {
                C9693 c9693 = f25351;
                String str3 = "paddleocr4/" + str2;
                File file2 = new File(file, str2);
                c9693.getClass();
                InputStream inputStreamOpen = assetManager.open(str3);
                try {
                    AbstractC5894.m10610(file2, inputStreamOpen);
                    AbstractC3738.m6868(inputStreamOpen, null);
                } finally {
                }
            }
            m15090(assetManager);
            C3903 c3903 = new C3903();
            String absolutePath = new File(file, "PP_OCRv5_mobile_det.ncnn.param").getAbsolutePath();
            "getAbsolutePath(...)";
            absolutePath.getClass();
            String absolutePath2 = new File(file, "PP_OCRv5_mobile_det.ncnn.bin").getAbsolutePath();
            "getAbsolutePath(...)";
            absolutePath2.getClass();
            String absolutePath3 = new File(file, "PP_OCRv5_mobile_rec.ncnn.param").getAbsolutePath();
            "getAbsolutePath(...)";
            absolutePath3.getClass();
            String absolutePath4 = new File(file, "PP_OCRv5_mobile_rec.ncnn.bin").getAbsolutePath();
            "getAbsolutePath(...)";
            absolutePath4.getClass();
            ImageSize imageSize = ImageSize.Size720;
            Device device = Device.CPU;
            imageSize.getClass();
            device.getClass();
            if (((OCRNative) c3903.f10175.getValue()).loadModelByPath(absolutePath, absolutePath2, absolutePath3, absolutePath4, imageSize.ordinal(), device.ordinal(), true)) {
                f25350 = c3903;
                return c3903;
            }
            ((OCRNative) c3903.f10175.getValue()).release();
            C3466.m5899("OCR 模型初始化失败");
            return null;
        } catch (Throwable th) {
            m15090(assetManager);
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m15090(AssetManager assetManager) {
        try {
            Result.m9304constructorimpl(AssetManager.class.getMethod("close", null).invoke(assetManager, null));
        } catch (Throwable th) {
            Result.m9304constructorimpl(new Result.Failure(th));
        }
    }
}
