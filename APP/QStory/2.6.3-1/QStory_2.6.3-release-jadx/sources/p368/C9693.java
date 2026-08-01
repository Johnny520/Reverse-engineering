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
import p303.AbstractC9234;
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
        AbstractC9234.m14532(AbstractC9234.m14531(3277));
        AbstractC9234.m14531(3278);
        AbstractC9234.m14531(3268);
        AbstractC9234.m14531(3269);
        AbstractC9234.m14531(3270);
        AbstractC9234.m14531(3271);
        f25351 = new C9693();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final ArrayList m15087(String str) {
        AbstractC9234.m14531(3264);
        str.getClass();
        if (AbstractC5976.m10731(str)) {
            AbstractC7017.m12163(AbstractC9234.m14531(3265), AbstractC9234.m14532("喵喵呜呜呜呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵喵呜喵喵喵~喵喵呜呜呜呜喵呜~喵喵喵呜喵喵喵呜~喵喵喵喵喵呜喵呜~喵喵喵喵呜呜喵呜"));
            return new ArrayList();
        }
        File file = new File(str);
        if (!file.isFile()) {
            AbstractC7017.m12163(AbstractC9234.m14531(3266) + file.getAbsolutePath(), AbstractC9234.m14532("喵喵呜呜呜呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵喵呜喵喵喵~喵喵呜呜呜呜喵呜~喵喵喵呜喵喵喵呜~喵喵喵喵喵呜喵呜~喵喵喵喵呜呜喵呜"));
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
        AbstractC9234.m14531(2114);
        absolutePath.getClass();
        OcrResult ocrResultM7451 = c3903M15089.m7451(absolutePath, DrawModel.None);
        if (ocrResultM7451 == null) {
            C6755.m11870(AbstractC9234.m14531(1413));
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
        AbstractC9234.m14531(3264);
        str.getClass();
        if (AbstractC5976.m10731(str)) {
            AbstractC7017.m12163(AbstractC9234.m14531(3265), AbstractC9234.m14532("喵喵呜呜呜呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵喵呜喵喵喵~喵喵呜呜呜呜喵呜~喵喵喵呜喵喵喵呜~喵喵喵喵喵呜喵呜~喵喵喵喵呜呜喵呜"));
            return "";
        }
        File file = new File(str);
        if (!file.isFile()) {
            AbstractC7017.m12163(AbstractC9234.m14531(3266) + file.getAbsolutePath(), AbstractC9234.m14532("喵喵呜呜呜呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵喵呜喵喵喵~喵喵呜呜呜呜喵呜~喵喵喵呜喵喵喵呜~喵喵喵喵喵呜喵呜~喵喵喵喵呜呜喵呜"));
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
        AbstractC9234.m14531(2114);
        absolutePath.getClass();
        OcrResult ocrResultM7451 = c3903M15089.m7451(absolutePath, DrawModel.None);
        String string = (ocrResultM7451 == null || (text = ocrResultM7451.getText()) == null) ? null : AbstractC5976.m10714(text).toString();
        return string == null ? "" : string;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C3903 m15089() throws IllegalAccessException, IOException, InvocationTargetException {
        String str = AbstractC7187.f17855;
        str.getClass();
        File file = new File(AbstractC4765.m8870(AbstractC9234.m14532("喵喵喵呜呜呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵喵呜喵喵喵")));
        if (!file.exists()) {
            file.mkdirs();
        }
        AssetManager assetManager = (AssetManager) AssetManager.class.getDeclaredConstructor(null).newInstance(null);
        Object objInvoke = AssetManager.class.getMethod(AbstractC9234.m14531(3274), String.class).invoke(assetManager, str);
        Integer num = objInvoke instanceof Integer ? (Integer) objInvoke : null;
        if ((num != null ? num.intValue() : 0) == 0) {
            C6755.m11866(AbstractC9234.m14531(3275).concat(str));
            return null;
        }
        assetManager.getClass();
        try {
            for (String str2 : AbstractC7176.m12490(AbstractC9234.m14531(3268), AbstractC9234.m14531(3269), AbstractC9234.m14531(3270), AbstractC9234.m14531(3271))) {
                C9693 c9693 = f25351;
                String str3 = AbstractC9234.m14531(3273) + str2;
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
            String absolutePath = new File(file, AbstractC9234.m14531(3268)).getAbsolutePath();
            AbstractC9234.m14531(2114);
            absolutePath.getClass();
            String absolutePath2 = new File(file, AbstractC9234.m14531(3269)).getAbsolutePath();
            AbstractC9234.m14531(2114);
            absolutePath2.getClass();
            String absolutePath3 = new File(file, AbstractC9234.m14531(3270)).getAbsolutePath();
            AbstractC9234.m14531(2114);
            absolutePath3.getClass();
            String absolutePath4 = new File(file, AbstractC9234.m14531(3271)).getAbsolutePath();
            AbstractC9234.m14531(2114);
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
            C3466.m5899(AbstractC9234.m14531(3272));
            return null;
        } catch (Throwable th) {
            m15090(assetManager);
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m15090(AssetManager assetManager) {
        try {
            Result.m9304constructorimpl(AssetManager.class.getMethod(AbstractC9234.m14532("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜喵呜呜~喵喵喵喵喵喵喵喵"), null).invoke(assetManager, null));
        } catch (Throwable th) {
            Result.m9304constructorimpl(new Result.Failure(th));
        }
    }
}
