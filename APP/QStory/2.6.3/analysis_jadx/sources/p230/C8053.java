package p230;

import android.app.Activity;
import android.content.Context;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import androidx.activity.AbstractC0053;
import androidx.fragment.app.AbstractC2313;
import androidx.lifecycle.AbstractC2402;
import androidx.window.area.AbstractC2567;
import com.alibaba.fastjson2.C2929;
import com.bumptech.glide.AbstractC3055;
import com.bumptech.glide.ComponentCallbacks2C3058;
import com.bumptech.glide.ComponentCallbacks2C3064;
import com.bumptech.glide.load.resource.bitmap.C3018;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.google.gson.AbstractC3251;
import com.google.gson.C3253;
import com.google.gson.JsonIOException;
import com.google.gson.Strictness;
import com.google.gson.stream.JsonToken;
import io.ktor.server.config.ApplicationConfigurationException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC4345;
import kotlin.reflect.jvm.internal.AbstractC5062;
import kotlin.text.AbstractC5132;
import lin.xposed.hook.view.main.itemview.C5565;
import p004.InterfaceC6110;
import p007.AbstractC6128;
import p007.C6130;
import p007.C6144;
import p010.AbstractC6185;
import p010.AbstractC6188;
import p048.C6517;
import p048.C6519;
import p075.C6958;
import p075.C6961;
import p087.C7068;
import p144.C7547;
import p193.C7828;
import p218.AbstractC7971;
import p222.AbstractC7989;
import p226.AbstractC8007;
import p226.C8005;
import p232.C8069;
import p232.C8074;
import p257.C8198;
import p257.C8208;
import p259.C8245;
import p286.C8397;
import p286.InterfaceC8393;
import p287.AbstractC8405;
import p355.C8896;
import retrofit2.C5755;
import retrofit2.InterfaceC5778;
import retrofit2.InterfaceC5789;
import retrofit2.InterfaceC5795;
import top.suzhelan.qstory.entity.PayItem;
import top.suzhelan.qstory.entity.QSResult;

/* JADX INFO: renamed from: 飘花落叶言楪世子苏兰哲.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8053 implements InterfaceC5795, InterfaceC5789 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f22224;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object f22225;

    public C8053(int i) {
        switch (i) {
            case 5:
                this.f22225 = new LinkedHashMap();
                this.f22224 = "";
                break;
            default:
                this.f22225 = new C2929(1000L);
                this.f22224 = AbstractC7971.m13461(10, new C6961(13));
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C3018 m13541(ImageDecoder.Source source, int i, int i2, C8397 c8397) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new C8005(i, i2, c8397));
        if (AbstractC8007.m13493(drawableDecodeDrawable)) {
            return new C3018(AbstractC8007.m13483(drawableDecodeDrawable), 2);
        }
        C7547.m12769(drawableDecodeDrawable, "Received unexpected drawable type for animated image, failing: ");
        return null;
    }

    @Override // retrofit2.InterfaceC5795
    public void onFailure(InterfaceC5778 interfaceC5778, Throwable th) {
        AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵喵喵呜喵喵");
        AbstractC8405.m13973("喵喵喵喵喵呜呜呜");
        C8198.m13710();
        AbstractC6185.m11592(AbstractC8405.m13972(3133));
        AbstractC6188.m11604(th, AbstractC8405.m13972(3134));
    }

    @Override // retrofit2.InterfaceC5795
    public void onResponse(InterfaceC5778 interfaceC5778, C5755 c5755) {
        AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵喵喵呜喵喵");
        AbstractC8405.m13972(1239);
        C8198.m13710();
        QSResult qSResult = (QSResult) c5755.f15756;
        if (qSResult == null) {
            AbstractC6185.m11592(AbstractC8405.m13972(3133));
            String strM13972 = AbstractC8405.m13972(3134);
            String str = AbstractC6188.f17016;
            AbstractC6188.m11604(strM13972, AbstractC8405.m13973("喵喵呜喵喵喵喵呜~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵呜喵喵呜喵喵喵~喵喵呜喵呜喵喵呜~喵喵喵喵喵喵呜呜~喵喵喵喵喵呜呜喵"));
            return;
        }
        ((C8208) this.f22225).m13730();
        C8049 c8049 = (C8049) this.f22224;
        String msg = qSResult.getMsg();
        AbstractC8405.m13972(1250);
        msg.getClass();
        Object data = qSResult.getData();
        AbstractC8405.m13972(3135);
        data.getClass();
        List list = (List) data;
        Activity activityM6653 = AbstractC3055.m6653();
        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((PayItem) it.next()).getName());
        }
        C8208 c8208 = new C8208();
        c8208.f22614 = AbstractC8405.m13972(3143);
        c8208.mo13721();
        C5565 c5565 = new C5565(activityM6653, arrayList, list, 7);
        c8208.f11597 = c5565;
        if (c8208.f11584) {
            c5565.mo8068(c8208);
        }
        c8208.mo13722(msg);
        c8208.mo13719(AbstractC8405.m13972(3144), new C8896(c8049, 0));
        c8208.m13731();
    }

    @Override // retrofit2.InterfaceC5789
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public Object mo4159(Object obj) {
        Charset charsetM11529;
        AbstractC6128 abstractC6128 = (AbstractC6128) obj;
        C3253 c3253 = (C3253) this.f22225;
        C6130 c6130 = abstractC6128.f16750;
        if (c6130 == null) {
            InterfaceC6110 interfaceC6110Mo11167 = abstractC6128.mo11167();
            C6144 c6144Mo11165 = abstractC6128.mo11165();
            if (c6144Mo11165 == null || (charsetM11529 = C6144.m11529(c6144Mo11165)) == null) {
                charsetM11529 = AbstractC5132.f14688;
            }
            c6130 = new C6130(interfaceC6110Mo11167, charsetM11529);
            abstractC6128.f16750 = c6130;
        }
        C8245 c8245 = new C8245(c6130);
        Strictness strictness = c3253.f10946;
        if (strictness == null) {
            strictness = Strictness.LEGACY_STRICT;
        }
        c8245.m13815(strictness);
        try {
            Object objMo7323 = ((AbstractC3251) this.f22224).mo7323(c8245);
            if (c8245.m13787() == JsonToken.END_DOCUMENT) {
                return objMo7323;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            abstractC6128.close();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C8053 m13542(String str) {
        String strM10037 = AbstractC5062.m10037((String) this.f22224, str);
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f22225;
        if (linkedHashMap.containsKey(strM10037) || linkedHashMap.containsKey(AbstractC5062.m10037(strM10037, "size"))) {
            return new C8053(linkedHashMap, strM10037);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public String m13543(InterfaceC8393 interfaceC8393) {
        String str;
        synchronized (((C2929) this.f22225)) {
            str = (String) ((C2929) this.f22225).m6384(interfaceC8393);
        }
        if (str == null) {
            C8054 c8054 = (C8054) ((C7828) this.f22224).acquire();
            try {
                interfaceC8393.mo6468(c8054.f22227);
                byte[] bArrDigest = c8054.f22227.digest();
                char[] cArr = AbstractC7989.f22070;
                synchronized (cArr) {
                    for (int i = 0; i < bArrDigest.length; i++) {
                        byte b = bArrDigest[i];
                        int i2 = b & DefaultClassResolver.NAME;
                        int i3 = i * 2;
                        char[] cArr2 = AbstractC7989.f22071;
                        cArr[i3] = cArr2[i2 >>> 4];
                        cArr[i3 + 1] = cArr2[b & 15];
                    }
                    str = new String(cArr);
                }
            } finally {
                ((C7828) this.f22224).mo3989(c8054);
            }
        }
        synchronized (((C2929) this.f22225)) {
            ((C2929) this.f22225).m6381(interfaceC8393, str);
        }
        return str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public ComponentCallbacks2C3064 m13544(Context context, ComponentCallbacks2C3058 componentCallbacks2C3058, AbstractC2402 abstractC2402, AbstractC2313 abstractC2313, boolean z) {
        AbstractC7989.m13473();
        AbstractC7989.m13473();
        HashMap map = (HashMap) this.f22225;
        ComponentCallbacks2C3064 componentCallbacks2C3064 = (ComponentCallbacks2C3064) map.get(abstractC2402);
        if (componentCallbacks2C3064 != null) {
            return componentCallbacks2C3064;
        }
        C8069 c8069 = new C8069(abstractC2402);
        C6958 c6958 = (C6958) this.f22224;
        C6961 c6961 = new C6961(this, abstractC2313);
        c6958.getClass();
        ComponentCallbacks2C3064 componentCallbacks2C30642 = new ComponentCallbacks2C3064(componentCallbacks2C3058, c8069, c6961, context);
        map.put(abstractC2402, componentCallbacks2C30642);
        c8069.mo12277(new C8074(this, abstractC2402));
        if (z) {
            componentCallbacks2C30642.mo6775();
        }
        return componentCallbacks2C30642;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public ArrayList m13545() throws ApplicationConfigurationException {
        Map map = (Map) this.f22225;
        String str = (String) this.f22224;
        String str2 = (String) map.get(AbstractC5062.m10037(str, "size"));
        if (str2 == null) {
            throw new ApplicationConfigurationException(AbstractC0053.m158("Property ", str, ".size not found."));
        }
        C6519 c6519M5067 = AbstractC2567.m5067(0, Integer.parseInt(str2));
        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(c6519M5067, 10));
        Iterator it = c6519M5067.iterator();
        while (true) {
            C6517 c6517 = (C6517) it;
            if (!c6517.f17823) {
                return arrayList;
            }
            Object obj = map.get(AbstractC5062.m10037(str, String.valueOf(c6517.nextInt())));
            obj.getClass();
            arrayList.add((String) obj);
        }
    }

    public /* synthetic */ C8053(Object obj, Object obj2) {
        this.f22225 = obj;
        this.f22224 = obj2;
    }

    public C8053(C6958 c6958) {
        this.f22225 = new HashMap();
        this.f22224 = c6958;
    }

    public C8053(Context context, String str, C7068 c7068) {
        context.getClass();
        str.getClass();
        this.f22225 = str;
        this.f22224 = c7068;
    }

    public C8053(LinkedHashMap linkedHashMap, String str) {
        linkedHashMap.getClass();
        str.getClass();
        this.f22225 = linkedHashMap;
        this.f22224 = str;
    }
}
