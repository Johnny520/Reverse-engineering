package p352;

import android.content.res.AssetManager;
import bsh.C2633;
import com.alibaba.fastjson2.AbstractC2905;
import com.equationl.ncnnandroidppocr.C3071;
import com.equationl.ncnnandroidppocr.bean.Device;
import com.equationl.ncnnandroidppocr.bean.DrawModel;
import com.equationl.ncnnandroidppocr.bean.ImageSize;
import com.equationl.ncnnandroidppocr.bean.OcrResult;
import com.equationl.ncnnandroidppocr.bean.OcrTextLineResult;
import com.equationl.ncnnandroidppocr.bean.OcrTextResult;
import com.equationl.ncnnandroidppocr.cpp.OCRNative;
import io.ktor.client.plugins.AbstractC3933;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Result;
import kotlin.reflect.jvm.internal.AbstractC5062;
import kotlin.text.AbstractC5144;
import lin.xposed.hook.javaplugin.bean.OcrText;
import p010.AbstractC6188;
import p034.AbstractC6347;
import p036.AbstractC6358;
import p287.AbstractC8405;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪兰世子.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8864 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static volatile C3071 f25005;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8864 f25006;

    static {
        AbstractC8405.m13973(AbstractC8405.m13972(3277));
        AbstractC8405.m13972(3278);
        AbstractC8405.m13972(3268);
        AbstractC8405.m13972(3269);
        AbstractC8405.m13972(3270);
        AbstractC8405.m13972(3271);
        f25006 = new C8864();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final ArrayList m14528(String str) {
        AbstractC8405.m13972(3264);
        str.getClass();
        if (AbstractC5144.m10172(str)) {
            AbstractC6188.m11604(AbstractC8405.m13972(3265), AbstractC8405.m13973("喵喵呜呜呜呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵喵呜喵喵喵~喵喵呜呜呜呜喵呜~喵喵喵呜喵喵喵呜~喵喵喵喵喵呜喵呜~喵喵喵喵呜呜喵呜"));
            return new ArrayList();
        }
        File file = new File(str);
        if (!file.isFile()) {
            AbstractC6188.m11604(AbstractC8405.m13972(3266) + file.getAbsolutePath(), AbstractC8405.m13973("喵喵呜呜呜呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵喵呜喵喵喵~喵喵呜呜呜呜喵呜~喵喵喵呜喵喵喵呜~喵喵喵喵喵呜喵呜~喵喵喵喵呜呜喵呜"));
            return new ArrayList();
        }
        C8864 c8864 = f25006;
        C3071 c3071M14530 = f25005;
        if (c3071M14530 != null) {
            c8864.getClass();
        } else {
            synchronized (c8864) {
                c3071M14530 = f25005;
                if (c3071M14530 == null) {
                    c8864.getClass();
                    c3071M14530 = m14530();
                }
            }
        }
        String absolutePath = file.getAbsolutePath();
        AbstractC8405.m13972(2114);
        absolutePath.getClass();
        OcrResult ocrResultM6891 = c3071M14530.m6891(absolutePath, DrawModel.None);
        if (ocrResultM6891 == null) {
            C5925.m11311(AbstractC8405.m13972(1413));
            return null;
        }
        List<OcrTextLineResult> textLines = ocrResultM6891.getTextLines();
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
                ocrTextResult2.id = ocrTextResult.getId();
                arrayList2.add(ocrTextResult2);
            }
            ocrText.textList = arrayList2;
            arrayList.add(ocrText);
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final String m14529(String str) {
        String text;
        AbstractC8405.m13972(3264);
        str.getClass();
        if (AbstractC5144.m10172(str)) {
            AbstractC6188.m11604(AbstractC8405.m13972(3265), AbstractC8405.m13973("喵喵呜呜呜呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵喵呜喵喵喵~喵喵呜呜呜呜喵呜~喵喵喵呜喵喵喵呜~喵喵喵喵喵呜喵呜~喵喵喵喵呜呜喵呜"));
            return "";
        }
        File file = new File(str);
        if (!file.isFile()) {
            AbstractC6188.m11604(AbstractC8405.m13972(3266) + file.getAbsolutePath(), AbstractC8405.m13973("喵喵呜呜呜呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵喵呜喵喵喵~喵喵呜呜呜呜喵呜~喵喵喵呜喵喵喵呜~喵喵喵喵喵呜喵呜~喵喵喵喵呜呜喵呜"));
            return "";
        }
        C8864 c8864 = f25006;
        C3071 c3071M14530 = f25005;
        if (c3071M14530 != null) {
            c8864.getClass();
        } else {
            synchronized (c8864) {
                c3071M14530 = f25005;
                if (c3071M14530 == null) {
                    c8864.getClass();
                    c3071M14530 = m14530();
                }
            }
        }
        String absolutePath = file.getAbsolutePath();
        AbstractC8405.m13972(2114);
        absolutePath.getClass();
        OcrResult ocrResultM6891 = c3071M14530.m6891(absolutePath, DrawModel.None);
        String string = (ocrResultM6891 == null || (text = ocrResultM6891.getText()) == null) ? null : AbstractC5144.m10155(text).toString();
        return string == null ? "" : string;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C3071 m14530() throws IllegalAccessException, IOException, InvocationTargetException {
        String str = AbstractC6358.f17510;
        str.getClass();
        File file = new File(AbstractC3933.m8311(AbstractC8405.m13973("喵喵喵呜呜呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵喵呜喵喵喵")));
        if (!file.exists()) {
            file.mkdirs();
        }
        AssetManager assetManager = (AssetManager) AssetManager.class.getDeclaredConstructor(null).newInstance(null);
        Object objInvoke = AssetManager.class.getMethod(AbstractC8405.m13972(3274), String.class).invoke(assetManager, str);
        Integer num = objInvoke instanceof Integer ? (Integer) objInvoke : null;
        if ((num != null ? num.intValue() : 0) == 0) {
            C5925.m11307(AbstractC8405.m13972(3275).concat(str));
            return null;
        }
        assetManager.getClass();
        try {
            for (String str2 : AbstractC6347.m11931(AbstractC8405.m13972(3268), AbstractC8405.m13972(3269), AbstractC8405.m13972(3270), AbstractC8405.m13972(3271))) {
                C8864 c8864 = f25006;
                String str3 = AbstractC8405.m13972(3273) + str2;
                File file2 = new File(file, str2);
                c8864.getClass();
                InputStream inputStreamOpen = assetManager.open(str3);
                try {
                    AbstractC5062.m10051(file2, inputStreamOpen);
                    AbstractC2905.m6308(inputStreamOpen, null);
                } finally {
                }
            }
            m14531(assetManager);
            C3071 c3071 = new C3071();
            String absolutePath = new File(file, AbstractC8405.m13972(3268)).getAbsolutePath();
            AbstractC8405.m13972(2114);
            absolutePath.getClass();
            String absolutePath2 = new File(file, AbstractC8405.m13972(3269)).getAbsolutePath();
            AbstractC8405.m13972(2114);
            absolutePath2.getClass();
            String absolutePath3 = new File(file, AbstractC8405.m13972(3270)).getAbsolutePath();
            AbstractC8405.m13972(2114);
            absolutePath3.getClass();
            String absolutePath4 = new File(file, AbstractC8405.m13972(3271)).getAbsolutePath();
            AbstractC8405.m13972(2114);
            absolutePath4.getClass();
            ImageSize imageSize = ImageSize.Size720;
            Device device = Device.CPU;
            imageSize.getClass();
            device.getClass();
            if (((OCRNative) c3071.f9830.getValue()).loadModelByPath(absolutePath, absolutePath2, absolutePath3, absolutePath4, imageSize.ordinal(), device.ordinal(), true)) {
                f25005 = c3071;
                return c3071;
            }
            ((OCRNative) c3071.f9830.getValue()).release();
            C2633.m5339(AbstractC8405.m13972(3272));
            return null;
        } catch (Throwable th) {
            m14531(assetManager);
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m14531(AssetManager assetManager) {
        try {
            Result.m8745constructorimpl(AssetManager.class.getMethod(AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜喵呜呜~喵喵喵喵喵喵喵喵"), null).invoke(assetManager, null));
        } catch (Throwable th) {
            Result.m8745constructorimpl(new Result.Failure(th));
        }
    }
}
