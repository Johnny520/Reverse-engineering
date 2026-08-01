package p190n0;

import android.content.Context;
import android.os.LocaleList;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import p043d3.C1868d;
import p043d3.C1869e;
import p185m8.AbstractC5116y;
import p215oc.C5729x;

/* JADX INFO: renamed from: n0.x3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5458x3 {

    /* JADX INFO: renamed from: a */
    public static final C5458x3 f16794a = new C5458x3();

    /* JADX INFO: renamed from: n0.x3$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f16795a;

        static {
            int[] iArr = new int[EnumC5413q0.values().length];
            try {
                iArr[EnumC5413q0.f16661q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5413q0.f16662r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f16795a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public final TextClassifier m22224a(Context context, EnumC5413q0 enumC5413q0) {
        String str;
        TextClassificationManager textClassificationManager = (TextClassificationManager) context.getSystemService(TextClassificationManager.class);
        int i10 = a.f16795a[enumC5413q0.ordinal()];
        if (i10 == 1) {
            str = "edittext";
        } else {
            if (i10 != 2) {
                C5729x.m23182a();
                return null;
            }
            str = "textview";
        }
        AbstractC5452w3.m22182a();
        return textClassificationManager.createTextClassificationSession(AbstractC5446v3.m22181a(context.getPackageName(), str).build());
    }

    /* JADX INFO: renamed from: b */
    public final boolean m22225b(TextClassification textClassification) {
        if (textClassification.getIcon() == null && TextUtils.isEmpty(textClassification.getLabel())) {
            return false;
        }
        return (textClassification.getIntent() == null && textClassification.getOnClickListener() == null) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public final LocaleList m22226c(C1869e c1869e) {
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(c1869e, 10));
        Iterator<E> it = c1869e.iterator();
        while (it.hasNext()) {
            arrayList.add(((C1868d) it.next()).m6625a());
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
