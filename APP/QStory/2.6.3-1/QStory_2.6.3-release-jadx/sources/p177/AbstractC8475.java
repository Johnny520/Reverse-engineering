package p177;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import androidx.appcompat.app.RunnableC0946;
import androidx.collection.C1115;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import p180.AbstractC8492;

/* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8475 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final ThreadLocal f21101 = new ThreadLocal();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final WeakHashMap f21100 = new WeakHashMap(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Object f21099 = new Object();

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c6  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface m13471(Context context, int i, TypedValue typedValue, int i2, AbstractC8471 abstractC8471, boolean z, boolean z2) throws Exception {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceM13494 = null;
        if (string.startsWith("res/")) {
            int i3 = typedValue.assetCookie;
            C1115 c1115 = AbstractC8492.f21147;
            Typeface typeface = (Typeface) c1115.m1392(AbstractC8492.m13493(resources, i, string, i3, i2));
            int i4 = 21;
            if (typeface != null) {
                if (abstractC8471 != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0946(abstractC8471, i4, typeface));
                }
                typefaceM13494 = typeface;
            } else if (!z2) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        InterfaceC8469 interfaceC8469M13466 = AbstractC8471.m13466(resources.getXml(i), resources);
                        if (interfaceC8469M13466 == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (abstractC8471 != null) {
                                abstractC8471.m13467(-3);
                            }
                        } else {
                            typefaceM13494 = AbstractC8492.m13494(context, interfaceC8469M13466, resources, i, string, typedValue.assetCookie, i2, abstractC8471, z);
                        }
                    } else {
                        int i5 = typedValue.assetCookie;
                        Typeface typefaceMo12629 = AbstractC8492.f21148.mo12629(context, resources, i, string);
                        if (typefaceMo12629 != null) {
                            c1115.m1391(AbstractC8492.m13493(resources, i, string, i5, i2), typefaceMo12629);
                        }
                        if (abstractC8471 != null) {
                            if (typefaceMo12629 != null) {
                                new Handler(Looper.getMainLooper()).post(new RunnableC0946(abstractC8471, i4, typefaceMo12629));
                            } else {
                                abstractC8471.m13467(-3);
                            }
                        }
                        typefaceM13494 = typefaceMo12629;
                    }
                } catch (IOException e) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), e);
                    if (abstractC8471 != null) {
                        abstractC8471.m13467(-3);
                    }
                } catch (XmlPullParserException e2) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), e2);
                    if (abstractC8471 != null) {
                    }
                }
            }
        } else if (abstractC8471 != null) {
            abstractC8471.m13467(-3);
        }
        if (typefaceM13494 != null || abstractC8471 != null || z2) {
            return typefaceM13494;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
