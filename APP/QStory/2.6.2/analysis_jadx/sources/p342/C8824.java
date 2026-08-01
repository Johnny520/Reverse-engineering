package p342;

import android.content.res.AssetManager;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import bsh.C2632;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.AbstractC3065;
import com.equationl.ncnnandroidppocr.C3070;
import com.equationl.ncnnandroidppocr.bean.Device;
import com.equationl.ncnnandroidppocr.bean.DrawModel;
import com.equationl.ncnnandroidppocr.bean.ImageSize;
import com.equationl.ncnnandroidppocr.bean.OcrResult;
import com.equationl.ncnnandroidppocr.bean.OcrTextLineResult;
import com.equationl.ncnnandroidppocr.bean.OcrTextResult;
import com.equationl.ncnnandroidppocr.cpp.OCRNative;
import io.ktor.client.plugins.AbstractC3932;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Result;
import kotlin.text.AbstractC5143;
import lin.xposed.hook.javaplugin.bean.OcrText;
import p010.AbstractC6157;
import p035.AbstractC6340;
import p253.AbstractC8189;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言苏哲世子楪兰.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8824 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static volatile C3070 f24814;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8824 f24815;

    static {
        AbstractC3056.m6668(-3937358054048400807L);
        AbstractC3056.m6668(-3937356885817296295L);
        AbstractC3056.m6668(-3937357693271147943L);
        AbstractC3056.m6668(-3937357551537227175L);
        AbstractC3056.m6668(-3937357504292586919L);
        AbstractC3056.m6668(-3937357362558666151L);
        f24815 = new C8824();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final ArrayList m14468(String str) {
        AbstractC3056.m6668(-3937358011098727847L);
        str.getClass();
        if (AbstractC5143.m10164(str)) {
            AbstractC6157.m11573(AbstractC3056.m6668(-3937357950969185703L), AbstractC3056.m6668(-3937358054048400807L));
            return new ArrayList();
        }
        File file = new File(str);
        if (!file.isFile()) {
            AbstractC6157.m11573(AbstractC3056.m6668(-3937357882249708967L) + file.getAbsolutePath(), AbstractC3056.m6668(-3937358054048400807L));
            return new ArrayList();
        }
        C8824 c8824 = f24815;
        C3070 c3070M14470 = f24814;
        if (c3070M14470 != null) {
            c8824.getClass();
        } else {
            synchronized (c8824) {
                c3070M14470 = f24814;
                if (c3070M14470 == null) {
                    c8824.getClass();
                    c3070M14470 = m14470();
                }
            }
        }
        String absolutePath = file.getAbsolutePath();
        AbstractC3056.m6668(-3937776744640284071L);
        absolutePath.getClass();
        OcrResult ocrResultM6904 = c3070M14470.m6904(absolutePath, DrawModel.None);
        if (ocrResultM6904 == null) {
            C5919.m11250(AbstractC3056.m6668(-3937697292040275367L));
            return null;
        }
        List<OcrTextLineResult> textLines = ocrResultM6904.getTextLines();
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
    public static final String m14469(String str) {
        String text;
        AbstractC3056.m6668(-3937358011098727847L);
        str.getClass();
        if (AbstractC5143.m10164(str)) {
            AbstractC6157.m11573(AbstractC3056.m6668(-3937357950969185703L), AbstractC3056.m6668(-3937358054048400807L));
            return AbstractC3056.m6668(-3937561979095614887L);
        }
        File file = new File(str);
        if (!file.isFile()) {
            AbstractC6157.m11573(AbstractC3056.m6668(-3937357882249708967L) + file.getAbsolutePath(), AbstractC3056.m6668(-3937358054048400807L));
            return AbstractC3056.m6668(-3937561979095614887L);
        }
        C8824 c8824 = f24815;
        C3070 c3070M14470 = f24814;
        if (c3070M14470 != null) {
            c8824.getClass();
        } else {
            synchronized (c8824) {
                c3070M14470 = f24814;
                if (c3070M14470 == null) {
                    c8824.getClass();
                    c3070M14470 = m14470();
                }
            }
        }
        String absolutePath = file.getAbsolutePath();
        AbstractC3056.m6668(-3937776744640284071L);
        absolutePath.getClass();
        OcrResult ocrResultM6904 = c3070M14470.m6904(absolutePath, DrawModel.None);
        String string = (ocrResultM6904 == null || (text = ocrResultM6904.getText()) == null) ? null : AbstractC5143.m10150(text).toString();
        return string == null ? AbstractC3056.m6668(-3937561979095614887L) : string;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C3070 m14470() throws IllegalAccessException, IOException, InvocationTargetException {
        String str = AbstractC6340.f17463;
        str.getClass();
        File file = new File(AbstractC3932.m8321(AbstractC3056.m6668(-3937357126335464871L)));
        if (!file.exists()) {
            file.mkdirs();
        }
        AssetManager assetManager = (AssetManager) AssetManager.class.getDeclaredConstructor(null).newInstance(null);
        Object objInvoke = AssetManager.class.getMethod(AbstractC3056.m6668(-3937357057615988135L), String.class).invoke(assetManager, str);
        Integer num = objInvoke instanceof Integer ? (Integer) objInvoke : null;
        if ((num != null ? num.intValue() : 0) == 0) {
            C5919.m11246(AbstractC3056.m6668(-3937357010371347879L).concat(str));
            return null;
        }
        assetManager.getClass();
        try {
            for (String str2 : AbstractC8189.m13659(AbstractC3056.m6668(-3937357693271147943L), AbstractC3056.m6668(-3937357551537227175L), AbstractC3056.m6668(-3937357504292586919L), AbstractC3056.m6668(-3937357362558666151L))) {
                C8824 c8824 = f24815;
                String str3 = AbstractC3056.m6668(-3937357177875072423L) + str2;
                File file2 = new File(file, str2);
                c8824.getClass();
                InputStream inputStreamOpen = assetManager.open(str3);
                try {
                    AbstractC0455.m1166(file2, inputStreamOpen);
                    AbstractC3065.m6841(inputStreamOpen, null);
                } finally {
                }
            }
            m14471(assetManager);
            C3070 c3070 = new C3070();
            String absolutePath = new File(file, AbstractC3056.m6668(-3937357693271147943L)).getAbsolutePath();
            AbstractC3056.m6668(-3937776744640284071L);
            absolutePath.getClass();
            String absolutePath2 = new File(file, AbstractC3056.m6668(-3937357551537227175L)).getAbsolutePath();
            AbstractC3056.m6668(-3937776744640284071L);
            absolutePath2.getClass();
            String absolutePath3 = new File(file, AbstractC3056.m6668(-3937357504292586919L)).getAbsolutePath();
            AbstractC3056.m6668(-3937776744640284071L);
            absolutePath3.getClass();
            String absolutePath4 = new File(file, AbstractC3056.m6668(-3937357362558666151L)).getAbsolutePath();
            AbstractC3056.m6668(-3937776744640284071L);
            absolutePath4.getClass();
            ImageSize imageSize = ImageSize.Size720;
            Device device = Device.CPU;
            imageSize.getClass();
            device.getClass();
            if (((OCRNative) c3070.f9825.getValue()).loadModelByPath(absolutePath, absolutePath2, absolutePath3, absolutePath4, imageSize.ordinal(), device.ordinal(), true)) {
                f24814 = c3070;
                return c3070;
            }
            ((OCRNative) c3070.f9825.getValue()).release();
            C2632.m5294(AbstractC3056.m6668(-3937357246594549159L));
            return null;
        } catch (Throwable th) {
            m14471(assetManager);
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m14471(AssetManager assetManager) {
        try {
            Result.m8755constructorimpl(AssetManager.class.getMethod(AbstractC3056.m6668(-3937356967421674919L), null).invoke(assetManager, null));
        } catch (Throwable th) {
            Result.m8755constructorimpl(new Result.Failure(th));
        }
    }
}
