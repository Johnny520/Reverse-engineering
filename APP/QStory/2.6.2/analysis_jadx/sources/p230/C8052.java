package p230;

import android.app.Activity;
import android.content.Context;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import androidx.activity.AbstractC0053;
import androidx.fragment.app.AbstractC2313;
import androidx.lifecycle.AbstractC2402;
import com.alibaba.fastjson2.C2928;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.ComponentCallbacks2C3057;
import com.bumptech.glide.ComponentCallbacks2C3063;
import com.bumptech.glide.load.resource.bitmap.C3017;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.google.gson.AbstractC3250;
import com.google.gson.C3252;
import com.google.gson.JsonIOException;
import com.google.gson.Strictness;
import com.google.gson.stream.JsonToken;
import io.ktor.client.plugins.AbstractC3932;
import io.ktor.server.config.ApplicationConfigurationException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC4344;
import kotlin.text.AbstractC5131;
import lin.xposed.hook.view.main.itemview.C5564;
import p000.AbstractC6087;
import p005.InterfaceC6119;
import p010.AbstractC6154;
import p010.AbstractC6157;
import p015.AbstractC6201;
import p015.C6203;
import p015.C6217;
import p048.C6516;
import p048.C6518;
import p075.C6957;
import p075.C6960;
import p087.C7067;
import p144.C7546;
import p175.AbstractC7738;
import p193.C7827;
import p218.AbstractC7970;
import p222.AbstractC7988;
import p226.AbstractC8006;
import p226.C8004;
import p232.C8068;
import p232.C8073;
import p257.C8197;
import p257.C8207;
import p259.C8244;
import p286.C8396;
import p286.InterfaceC8392;
import p352.C8879;
import retrofit2.C5754;
import retrofit2.InterfaceC5777;
import retrofit2.InterfaceC5788;
import retrofit2.InterfaceC5794;
import top.suzhelan.qstory.entity.PayItem;
import top.suzhelan.qstory.entity.QSResult;

/* JADX INFO: renamed from: 飘花落叶言楪世子苏兰哲.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8052 implements InterfaceC5794, InterfaceC5788 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f22226;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object f22227;

    public C8052(int i) {
        switch (i) {
            case 5:
                this.f22227 = new LinkedHashMap();
                this.f22226 = "";
                break;
            default:
                this.f22227 = new C2928(1000L);
                this.f22226 = AbstractC7970.m13433(10, new C6960(13));
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C3017 m13512(ImageDecoder.Source source, int i, int i2, C8396 c8396) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new C8004(i, i2, c8396));
        if (AbstractC8006.m13465(drawableDecodeDrawable)) {
            return new C3017(AbstractC8006.m13455(drawableDecodeDrawable), 2);
        }
        C7546.m12740(drawableDecodeDrawable, "Received unexpected drawable type for animated image, failing: ");
        return null;
    }

    @Override // retrofit2.InterfaceC5794
    public void onFailure(InterfaceC5777 interfaceC5777, Throwable th) {
        AbstractC3056.m6668(-3937677161528559015L);
        AbstractC3056.m6668(-3937694049339966887L);
        C8197.m13693();
        AbstractC6154.m11561(AbstractC3056.m6668(-3937327044384523687L));
        AbstractC6157.m11573(th, AbstractC3056.m6668(-3937327065859360167L));
    }

    @Override // retrofit2.InterfaceC5794
    public void onResponse(InterfaceC5777 interfaceC5777, C5754 c5754) {
        AbstractC3056.m6668(-3937677161528559015L);
        AbstractC3056.m6668(-3937677148643657127L);
        C8197.m13693();
        QSResult qSResult = (QSResult) c5754.f15756;
        if (qSResult == null) {
            AbstractC6154.m11561(AbstractC3056.m6668(-3937327044384523687L));
            String strM6668 = AbstractC3056.m6668(-3937327065859360167L);
            String str = AbstractC6157.f16779;
            AbstractC6157.m11573(strM6668, AbstractC3056.m6668(-3937633150998676903L));
            return;
        }
        ((C8207) this.f22227).m13713();
        C8048 c8048 = (C8048) this.f22226;
        String msg = qSResult.getMsg();
        AbstractC3056.m6668(-3937694169599051175L);
        msg.getClass();
        Object data = qSResult.getData();
        AbstractC3056.m6668(-3937707213414729127L);
        data.getClass();
        List list = (List) data;
        Activity activityM13031 = AbstractC7738.m13031();
        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((PayItem) it.next()).getName());
        }
        C8207 c8207 = new C8207();
        c8207.f22615 = AbstractC3056.m6668(-3937326344304854439L);
        c8207.mo13704();
        C5564 c5564 = new C5564(activityM13031, arrayList, list, 7);
        c8207.f11592 = c5564;
        if (c8207.f11579) {
            c5564.mo8081(c8207);
        }
        c8207.mo13705(msg);
        c8207.mo13702(AbstractC3056.m6668(-3937326378664592807L), new C8879(c8048, 0));
        c8207.m13714();
    }

    @Override // retrofit2.InterfaceC5788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public Object mo4149(Object obj) {
        Charset charsetM11658;
        AbstractC6201 abstractC6201 = (AbstractC6201) obj;
        C3252 c3252 = (C3252) this.f22227;
        C6203 c6203 = abstractC6201.f16989;
        if (c6203 == null) {
            InterfaceC6119 interfaceC6119Mo11110 = abstractC6201.mo11110();
            C6217 c6217Mo11108 = abstractC6201.mo11108();
            if (c6217Mo11108 == null || (charsetM11658 = C6217.m11658(c6217Mo11108)) == null) {
                charsetM11658 = AbstractC5131.f14688;
            }
            c6203 = new C6203(interfaceC6119Mo11110, charsetM11658);
            abstractC6201.f16989 = c6203;
        }
        C8244 c8244 = new C8244(c6203);
        Strictness strictness = c3252.f10941;
        if (strictness == null) {
            strictness = Strictness.LEGACY_STRICT;
        }
        c8244.m13798(strictness);
        try {
            Object objMo7336 = ((AbstractC3250) this.f22226).mo7336(c8244);
            if (c8244.m13770() == JsonToken.END_DOCUMENT) {
                return objMo7336;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            abstractC6201.close();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C8052 m13513(String str) {
        String strM8308 = AbstractC3932.m8308((String) this.f22226, str);
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f22227;
        if (linkedHashMap.containsKey(strM8308) || linkedHashMap.containsKey(AbstractC3932.m8308(strM8308, "size"))) {
            return new C8052(linkedHashMap, strM8308);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public String m13514(InterfaceC8392 interfaceC8392) {
        String str;
        synchronized (((C2928) this.f22227)) {
            str = (String) ((C2928) this.f22227).m6326(interfaceC8392);
        }
        if (str == null) {
            C8053 c8053 = (C8053) ((C7827) this.f22226).acquire();
            try {
                interfaceC8392.mo6410(c8053.f22229);
                byte[] bArrDigest = c8053.f22229.digest();
                char[] cArr = AbstractC7988.f22073;
                synchronized (cArr) {
                    for (int i = 0; i < bArrDigest.length; i++) {
                        byte b = bArrDigest[i];
                        int i2 = b & DefaultClassResolver.NAME;
                        int i3 = i * 2;
                        char[] cArr2 = AbstractC7988.f22074;
                        cArr[i3] = cArr2[i2 >>> 4];
                        cArr[i3 + 1] = cArr2[b & 15];
                    }
                    str = new String(cArr);
                }
            } finally {
                ((C7827) this.f22226).mo3979(c8053);
            }
        }
        synchronized (((C2928) this.f22227)) {
            ((C2928) this.f22227).m6323(interfaceC8392, str);
        }
        return str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public ComponentCallbacks2C3063 m13515(Context context, ComponentCallbacks2C3057 componentCallbacks2C3057, AbstractC2402 abstractC2402, AbstractC2313 abstractC2313, boolean z) {
        AbstractC7988.m13445();
        AbstractC7988.m13445();
        HashMap map = (HashMap) this.f22227;
        ComponentCallbacks2C3063 componentCallbacks2C3063 = (ComponentCallbacks2C3063) map.get(abstractC2402);
        if (componentCallbacks2C3063 != null) {
            return componentCallbacks2C3063;
        }
        C8068 c8068 = new C8068(abstractC2402);
        C6957 c6957 = (C6957) this.f22226;
        C6960 c6960 = new C6960(this, abstractC2313);
        c6957.getClass();
        ComponentCallbacks2C3063 componentCallbacks2C30632 = new ComponentCallbacks2C3063(componentCallbacks2C3057, c8068, c6960, context);
        map.put(abstractC2402, componentCallbacks2C30632);
        c8068.mo12250(new C8073(this, abstractC2402));
        if (z) {
            componentCallbacks2C30632.mo6730();
        }
        return componentCallbacks2C30632;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public ArrayList m13516() throws ApplicationConfigurationException {
        Map map = (Map) this.f22227;
        String str = (String) this.f22226;
        String str2 = (String) map.get(AbstractC3932.m8308(str, "size"));
        if (str2 == null) {
            throw new ApplicationConfigurationException(AbstractC0053.m156("Property ", str, ".size not found."));
        }
        C6518 c6518M11422 = AbstractC6087.m11422(0, Integer.parseInt(str2));
        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(c6518M11422, 10));
        Iterator it = c6518M11422.iterator();
        while (true) {
            C6516 c6516 = (C6516) it;
            if (!c6516.f17827) {
                return arrayList;
            }
            Object obj = map.get(AbstractC3932.m8308(str, String.valueOf(c6516.nextInt())));
            obj.getClass();
            arrayList.add((String) obj);
        }
    }

    public /* synthetic */ C8052(Object obj, Object obj2) {
        this.f22227 = obj;
        this.f22226 = obj2;
    }

    public C8052(C6957 c6957) {
        this.f22227 = new HashMap();
        this.f22226 = c6957;
    }

    public C8052(Context context, String str, C7067 c7067) {
        context.getClass();
        str.getClass();
        this.f22227 = str;
        this.f22226 = c7067;
    }

    public C8052(LinkedHashMap linkedHashMap, String str) {
        linkedHashMap.getClass();
        str.getClass();
        this.f22227 = linkedHashMap;
        this.f22226 = str;
    }
}
