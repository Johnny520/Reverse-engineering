package p246;

import android.app.Activity;
import android.content.Context;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import androidx.activity.AbstractC0900;
import androidx.fragment.app.AbstractC3146;
import androidx.lifecycle.AbstractC3235;
import androidx.window.area.AbstractC3400;
import com.alibaba.fastjson2.C3762;
import com.bumptech.glide.AbstractC3887;
import com.bumptech.glide.ComponentCallbacks2C3890;
import com.bumptech.glide.ComponentCallbacks2C3896;
import com.bumptech.glide.load.resource.bitmap.C3850;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.google.gson.AbstractC4083;
import com.google.gson.C4085;
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
import kotlin.collections.AbstractC5177;
import kotlin.reflect.jvm.internal.AbstractC5894;
import kotlin.text.AbstractC5964;
import lin.xposed.hook.view.main.itemview.C6395;
import p020.InterfaceC6939;
import p023.AbstractC6957;
import p023.C6959;
import p023.C6973;
import p026.AbstractC7014;
import p026.AbstractC7017;
import p064.C7346;
import p064.C7348;
import p091.C7787;
import p091.C7790;
import p103.C7897;
import p160.C8376;
import p209.C8657;
import p234.AbstractC8800;
import p238.AbstractC8818;
import p242.AbstractC8836;
import p242.C8834;
import p248.C8898;
import p248.C8903;
import p273.C9027;
import p273.C9037;
import p275.C9074;
import p302.C9226;
import p302.InterfaceC9222;
import p303.AbstractC9234;
import p371.C9725;
import retrofit2.C6585;
import retrofit2.InterfaceC6608;
import retrofit2.InterfaceC6619;
import retrofit2.InterfaceC6625;
import top.suzhelan.qstory.entity.PayItem;
import top.suzhelan.qstory.entity.QSResult;

/* JADX INFO: renamed from: 飘花落叶言楪世子苏兰哲.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8882 implements InterfaceC6625, InterfaceC6619 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f22569;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object f22570;

    public C8882(int i) {
        switch (i) {
            case 5:
                this.f22570 = new LinkedHashMap();
                this.f22569 = "";
                break;
            default:
                this.f22570 = new C3762(1000L);
                this.f22569 = AbstractC8800.m14020(10, new C7790(13));
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C3850 m14100(ImageDecoder.Source source, int i, int i2, C9226 c9226) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new C8834(i, i2, c9226));
        if (AbstractC8836.m14052(drawableDecodeDrawable)) {
            return new C3850(AbstractC8836.m14042(drawableDecodeDrawable), 2);
        }
        C8376.m13328(drawableDecodeDrawable, "Received unexpected drawable type for animated image, failing: ");
        return null;
    }

    @Override // retrofit2.InterfaceC6625
    public void onFailure(InterfaceC6608 interfaceC6608, Throwable th) {
        AbstractC9234.m14532("喵喵喵呜喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵喵喵呜喵喵");
        AbstractC9234.m14532("喵喵喵喵喵呜呜呜");
        C9027.m14269();
        AbstractC7014.m12151(AbstractC9234.m14531(3133));
        AbstractC7017.m12163(th, AbstractC9234.m14531(3134));
    }

    @Override // retrofit2.InterfaceC6625
    public void onResponse(InterfaceC6608 interfaceC6608, C6585 c6585) {
        AbstractC9234.m14532("喵喵喵呜喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵喵喵呜喵喵");
        AbstractC9234.m14531(1239);
        C9027.m14269();
        QSResult qSResult = (QSResult) c6585.f16101;
        if (qSResult == null) {
            AbstractC7014.m12151(AbstractC9234.m14531(3133));
            String strM14531 = AbstractC9234.m14531(3134);
            String str = AbstractC7017.f17361;
            AbstractC7017.m12163(strM14531, AbstractC9234.m14532("喵喵呜喵喵喵喵呜~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵呜喵喵呜喵喵喵~喵喵呜喵呜喵喵呜~喵喵喵喵喵喵呜呜~喵喵喵喵喵呜呜喵"));
            return;
        }
        ((C9037) this.f22570).m14289();
        C8878 c8878 = (C8878) this.f22569;
        String msg = qSResult.getMsg();
        AbstractC9234.m14531(1250);
        msg.getClass();
        Object data = qSResult.getData();
        AbstractC9234.m14531(3135);
        data.getClass();
        List list = (List) data;
        Activity activityM7213 = AbstractC3887.m7213();
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((PayItem) it.next()).getName());
        }
        C9037 c9037 = new C9037();
        c9037.f22959 = AbstractC9234.m14531(3143);
        c9037.mo14280();
        C6395 c6395 = new C6395(activityM7213, arrayList, list, 7);
        c9037.f11942 = c6395;
        if (c9037.f11929) {
            c6395.mo8627(c9037);
        }
        c9037.mo14281(msg);
        c9037.mo14278(AbstractC9234.m14531(3144), new C9725(c8878, 0));
        c9037.m14290();
    }

    @Override // retrofit2.InterfaceC6619
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public Object mo4719(Object obj) {
        Charset charsetM12088;
        AbstractC6957 abstractC6957 = (AbstractC6957) obj;
        C4085 c4085 = (C4085) this.f22570;
        C6959 c6959 = abstractC6957.f17095;
        if (c6959 == null) {
            InterfaceC6939 interfaceC6939Mo11726 = abstractC6957.mo11726();
            C6973 c6973Mo11724 = abstractC6957.mo11724();
            if (c6973Mo11724 == null || (charsetM12088 = C6973.m12088(c6973Mo11724)) == null) {
                charsetM12088 = AbstractC5964.f15033;
            }
            c6959 = new C6959(interfaceC6939Mo11726, charsetM12088);
            abstractC6957.f17095 = c6959;
        }
        C9074 c9074 = new C9074(c6959);
        Strictness strictness = c4085.f11291;
        if (strictness == null) {
            strictness = Strictness.LEGACY_STRICT;
        }
        c9074.m14374(strictness);
        try {
            Object objMo7882 = ((AbstractC4083) this.f22569).mo7882(c9074);
            if (c9074.m14346() == JsonToken.END_DOCUMENT) {
                return objMo7882;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            abstractC6957.close();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C8882 m14101(String str) {
        String strM10596 = AbstractC5894.m10596((String) this.f22569, str);
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f22570;
        if (linkedHashMap.containsKey(strM10596) || linkedHashMap.containsKey(AbstractC5894.m10596(strM10596, "size"))) {
            return new C8882(linkedHashMap, strM10596);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public String m14102(InterfaceC9222 interfaceC9222) {
        String str;
        synchronized (((C3762) this.f22570)) {
            str = (String) ((C3762) this.f22570).m6944(interfaceC9222);
        }
        if (str == null) {
            C8883 c8883 = (C8883) ((C8657) this.f22569).acquire();
            try {
                interfaceC9222.mo7028(c8883.f22572);
                byte[] bArrDigest = c8883.f22572.digest();
                char[] cArr = AbstractC8818.f22415;
                synchronized (cArr) {
                    for (int i = 0; i < bArrDigest.length; i++) {
                        byte b = bArrDigest[i];
                        int i2 = b & DefaultClassResolver.NAME;
                        int i3 = i * 2;
                        char[] cArr2 = AbstractC8818.f22416;
                        cArr[i3] = cArr2[i2 >>> 4];
                        cArr[i3 + 1] = cArr2[b & 15];
                    }
                    str = new String(cArr);
                }
            } finally {
                ((C8657) this.f22569).mo4549(c8883);
            }
        }
        synchronized (((C3762) this.f22570)) {
            ((C3762) this.f22570).m6941(interfaceC9222, str);
        }
        return str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public ComponentCallbacks2C3896 m14103(Context context, ComponentCallbacks2C3890 componentCallbacks2C3890, AbstractC3235 abstractC3235, AbstractC3146 abstractC3146, boolean z) {
        AbstractC8818.m14032();
        AbstractC8818.m14032();
        HashMap map = (HashMap) this.f22570;
        ComponentCallbacks2C3896 componentCallbacks2C3896 = (ComponentCallbacks2C3896) map.get(abstractC3235);
        if (componentCallbacks2C3896 != null) {
            return componentCallbacks2C3896;
        }
        C8898 c8898 = new C8898(abstractC3235);
        C7787 c7787 = (C7787) this.f22569;
        C7790 c7790 = new C7790(this, abstractC3146);
        c7787.getClass();
        ComponentCallbacks2C3896 componentCallbacks2C38962 = new ComponentCallbacks2C3896(componentCallbacks2C3890, c8898, c7790, context);
        map.put(abstractC3235, componentCallbacks2C38962);
        c8898.mo12836(new C8903(this, abstractC3235));
        if (z) {
            componentCallbacks2C38962.mo7335();
        }
        return componentCallbacks2C38962;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public ArrayList m14104() throws ApplicationConfigurationException {
        Map map = (Map) this.f22570;
        String str = (String) this.f22569;
        String str2 = (String) map.get(AbstractC5894.m10596(str, "size"));
        if (str2 == null) {
            throw new ApplicationConfigurationException(AbstractC0900.m718("Property ", str, ".size not found."));
        }
        C7348 c7348M5627 = AbstractC3400.m5627(0, Integer.parseInt(str2));
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(c7348M5627, 10));
        Iterator it = c7348M5627.iterator();
        while (true) {
            C7346 c7346 = (C7346) it;
            if (!c7346.f18168) {
                return arrayList;
            }
            Object obj = map.get(AbstractC5894.m10596(str, String.valueOf(c7346.nextInt())));
            obj.getClass();
            arrayList.add((String) obj);
        }
    }

    public /* synthetic */ C8882(Object obj, Object obj2) {
        this.f22570 = obj;
        this.f22569 = obj2;
    }

    public C8882(C7787 c7787) {
        this.f22570 = new HashMap();
        this.f22569 = c7787;
    }

    public C8882(Context context, String str, C7897 c7897) {
        context.getClass();
        str.getClass();
        this.f22570 = str;
        this.f22569 = c7897;
    }

    public C8882(LinkedHashMap linkedHashMap, String str) {
        linkedHashMap.getClass();
        str.getClass();
        this.f22570 = linkedHashMap;
        this.f22569 = str;
    }
}
