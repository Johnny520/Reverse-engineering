package top.suzhelan.qstory.p015ui.components;

import android.util.Base64;
import androidx.collection.C1083;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.InterfaceC2208;
import com.alibaba.fastjson2.AbstractC3738;
import io.ktor.client.plugins.AbstractC4765;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C6008;
import kotlin.reflect.InterfaceC5925;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import kotlin.text.AbstractC5976;
import kotlinx.serialization.modules.AbstractC6343;
import lin.xposed.hook.javaplugin.api.QQNTPluginMethod;
import lin.xposed.hook.javaplugin.view.C6380;
import p023.C6975;
import p025.AbstractC7012;
import p068.InterfaceC7383;
import p104.AbstractC8005;
import p104.C7981;
import p105.InterfaceC8013;
import p132.C8168;
import p132.InterfaceC8174;
import p273.C9027;
import p273.C9037;
import p303.AbstractC9234;
import p345.AbstractC9590;
import p345.AbstractC9594;
import p366.InterfaceC9683;

/* JADX INFO: renamed from: top.suzhelan.qstory.ui.components.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6797 implements InterfaceC7383 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16523;

    public /* synthetic */ C6797(int i) {
        this.f16523 = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0550  */
    @Override // p068.InterfaceC7383
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        String string;
        int i = this.f16523;
        C6008 c6008 = C6008.f15084;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC6796.m11901((InterfaceC2208) obj, AbstractC2202.m3031(1));
                return c6008;
            case 1:
                ((Integer) obj).getClass();
                InterfaceC9683 interfaceC9683 = (InterfaceC9683) obj2;
                AbstractC9234.m14532("喵喵喵呜喵呜呜喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜呜呜喵~喵喵喵呜呜喵呜喵~喵喵喵呜呜呜喵喵");
                interfaceC9683.getClass();
                return interfaceC9683.getKey();
            case 2:
                InterfaceC5925 interfaceC5925 = (InterfaceC5925) obj;
                List list = (List) obj2;
                interfaceC5925.getClass();
                list.getClass();
                ArrayList arrayListM10426 = AbstractC5754.m10426(AbstractC6343.f15582, list, true);
                arrayListM10426.getClass();
                return AbstractC5754.m10435(interfaceC5925, arrayListM10426, new C6975(1, list));
            case 3:
                InterfaceC5925 interfaceC59252 = (InterfaceC5925) obj;
                List list2 = (List) obj2;
                interfaceC59252.getClass();
                list2.getClass();
                ArrayList arrayListM104262 = AbstractC5754.m10426(AbstractC6343.f15582, list2, true);
                arrayListM104262.getClass();
                InterfaceC8013 interfaceC8013M10435 = AbstractC5754.m10435(interfaceC59252, arrayListM104262, new C6975(2, list2));
                if (interfaceC8013M10435 != null) {
                    return AbstractC4765.m8872(interfaceC8013M10435);
                }
                return null;
            case 4:
                C8168 c8168 = (C8168) obj2;
                Map map = c8168.f19899;
                C1083 c1083 = c8168.f19897;
                Object[] objArr = c1083.f1225;
                Object[] objArr2 = c1083.f1224;
                long[] jArr = c1083.f1226;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((255 & j) < 128) {
                                    int i5 = (i2 << 3) + i4;
                                    Object obj3 = objArr[i5];
                                    Map mapMo2044 = ((InterfaceC8174) objArr2[i5]).mo2044();
                                    if (mapMo2044.isEmpty()) {
                                        map.remove(obj3);
                                    } else {
                                        map.put(obj3, mapMo2044);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i3 == 8) {
                                if (i2 != length) {
                                    i2++;
                                }
                            }
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            case 5:
                return obj2;
            case 6:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                String str = (String) obj2;
                AbstractC9234.m14532("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜");
                str.getClass();
                C9027.m14269();
                int i6 = 5;
                if (zBooleanValue) {
                    C9037.m14288(str, AbstractC9234.m14531(1260)).mo14278(AbstractC9234.m14532("呜喵喵呜喵呜喵喵~呜呜喵呜喵呜喵喵~呜呜喵呜喵呜喵喵~呜喵喵喵呜呜喵呜~呜呜喵喵呜喵呜呜~呜呜呜呜喵呜呜喵"), new C6380(i6));
                } else {
                    C9037.m14288(str, AbstractC9234.m14531(1258)).mo14278(AbstractC9234.m14532("呜喵喵呜喵呜喵喵~呜呜喵呜喵呜喵喵~呜呜喵呜喵呜喵喵~呜喵喵喵呜呜喵呜~呜呜喵喵呜喵呜呜~呜呜呜呜喵呜呜喵"), new C6380(i6));
                }
                return c6008;
            case 7:
                C7981 c7981 = (C7981) obj;
                String pT4Token = AbstractC7012.m12142("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜", c7981).getPT4Token(AbstractC3738.m6899(AbstractC9234.m14532("喵喵喵呜喵呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜喵喵呜~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵呜喵"), c7981));
                AbstractC9234.m14531(2430);
                pT4Token.getClass();
                return AbstractC3738.m6891(pT4Token, (AbstractC8005) obj2, false);
            case 8:
                C7981 c79812 = (C7981) obj;
                AbstractC9234.m14532("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜");
                c79812.getClass();
                AbstractC9234.m14532("喵喵喵呜喵喵喵呜~喵喵喵呜呜喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵喵呜呜呜喵");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                AbstractC9234.m14531(2295);
                String strM14532 = AbstractC9234.m14532("喵喵喵呜喵喵喵呜~喵喵喵呜呜呜呜喵~喵喵喵呜喵呜喵喵");
                Long lValueOf = Long.valueOf(AbstractC9590.m15009().getBKN(AbstractC3738.m6899(AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵喵喵呜呜喵~喵喵喵呜喵喵喵呜~喵喵喵喵呜呜喵呜~喵喵喵呜呜呜喵喵"), c79812)));
                AbstractC9234.m14532("喵喵喵呜呜喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜呜");
                linkedHashMap.put(strM14532, AbstractC9594.m15024(lValueOf));
                return AbstractC3738.m6853(new C7981(linkedHashMap), (AbstractC8005) obj2);
            case 9:
                C7981 c79813 = (C7981) obj;
                AbstractC9234.m14532("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜");
                c79813.getClass();
                String strM6899 = AbstractC3738.m6899(AbstractC9234.m14532("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵"), c79813);
                AbstractC9234.m14532("喵喵喵呜喵喵喵呜~喵喵喵呜呜喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵喵呜呜呜喵");
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                AbstractC9234.m14531(2295);
                String strM145322 = AbstractC9234.m14532("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵");
                AbstractC9234.m14532("喵喵喵呜呜喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜呜");
                linkedHashMap2.put(strM145322, AbstractC9594.m15024(strM6899));
                String strM14531 = AbstractC9234.m14531(2344);
                Boolean boolValueOf = Boolean.valueOf(AbstractC9590.m15009().isFriend(strM6899));
                AbstractC9234.m14532("喵喵喵呜呜喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜呜");
                linkedHashMap2.put(strM14531, AbstractC9594.m15024(boolValueOf));
                return AbstractC3738.m6853(new C7981(linkedHashMap2), (AbstractC8005) obj2);
            case 10:
                C7981 c79814 = (C7981) obj;
                AbstractC8005 abstractC8005 = (AbstractC8005) obj2;
                AbstractC9234.m14532("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜");
                c79814.getClass();
                String strM68992 = AbstractC3738.m6899(AbstractC9234.m14531(2374), c79814);
                String strM68993 = AbstractC3738.m6899(AbstractC9234.m14532("喵喵喵呜呜喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜呜"), c79814);
                String strM15021 = AbstractC9594.m15021(AbstractC9234.m14531(2377), c79814);
                if (strM15021 == null || (string = AbstractC9590.m15009().getString(strM68992, strM68993, strM15021)) == null) {
                    string = AbstractC9590.m15009().getString(strM68992, strM68993);
                }
                return AbstractC3738.m6891(string != null ? string : "", abstractC8005, false);
            case 11:
                C7981 c79815 = (C7981) obj;
                String gtk = AbstractC7012.m12142("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜", c79815).getGTK(AbstractC3738.m6899(AbstractC9234.m14532("喵喵喵呜喵呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜喵喵呜~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵呜喵"), c79815));
                AbstractC9234.m14531(2431);
                gtk.getClass();
                return AbstractC3738.m6891(gtk, (AbstractC8005) obj2, false);
            case 12:
                C7981 c79816 = (C7981) obj;
                String pskey = AbstractC7012.m12142("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜", c79816).getPskey(AbstractC3738.m6899(AbstractC9234.m14532("喵喵喵呜喵呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜喵喵呜~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵呜喵"), c79816));
                AbstractC9234.m14531(2429);
                pskey.getClass();
                return AbstractC3738.m6891(pskey, (AbstractC8005) obj2, false);
            case 13:
                C7981 c79817 = (C7981) obj;
                return AbstractC3738.m6853(AbstractC7012.m12142("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜", c79817).getNewFriendInfo(AbstractC3738.m6899(AbstractC9234.m14532("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵"), c79817)), (AbstractC8005) obj2);
            case 14:
                C7981 c79818 = (C7981) obj;
                byte[] fileBytes = AbstractC7012.m12142("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜", c79818).readFileBytes(AbstractC3738.m6899(AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵喵喵喵"), c79818));
                AbstractC9234.m14532("喵喵喵呜喵喵喵呜~喵喵喵呜呜喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵喵呜呜呜喵");
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                AbstractC9234.m14531(2295);
                String strM145323 = AbstractC9234.m14532("喵喵喵呜喵喵喵呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜呜喵呜~喵呜喵呜喵喵呜呜~喵呜喵呜呜喵喵喵");
                String strEncodeToString = Base64.encodeToString(fileBytes, 2);
                AbstractC9234.m14532("喵喵喵呜呜喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜呜");
                linkedHashMap3.put(strM145323, AbstractC9594.m15024(strEncodeToString));
                String strM145324 = AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵喵呜呜喵呜");
                Integer numValueOf = Integer.valueOf(fileBytes.length);
                AbstractC9234.m14532("喵喵喵呜呜喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜呜");
                linkedHashMap3.put(strM145324, AbstractC9594.m15024(numValueOf));
                return AbstractC3738.m6853(new C7981(linkedHashMap3), (AbstractC8005) obj2);
            case 15:
                C7981 c79819 = (C7981) obj;
                AbstractC7012.m12142("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜", c79819).writeTextAppendToFile(AbstractC3738.m6899(AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵喵喵喵"), c79819), AbstractC3738.m6899(AbstractC9234.m14532("喵喵喵喵喵呜呜呜~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜喵~喵喵喵呜呜呜喵喵"), c79819));
                return AbstractC3738.m6891(AbstractC9234.m14531(2484), (AbstractC8005) obj2, false);
            case 16:
                C7981 c798110 = (C7981) obj;
                String fileText = AbstractC7012.m12142("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜", c798110).readFileText(AbstractC3738.m6899(AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵喵喵喵"), c798110));
                AbstractC9234.m14531(2483);
                fileText.getClass();
                return AbstractC3738.m6891(fileText, (AbstractC8005) obj2, false);
            case 17:
                C7981 c798111 = (C7981) obj;
                AbstractC8005 abstractC80052 = (AbstractC8005) obj2;
                AbstractC9234.m14532("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜");
                c798111.getClass();
                String strM150212 = AbstractC9594.m15021(AbstractC9234.m14531(2441), c798111);
                String string2 = strM150212 != null ? AbstractC5976.m10714(strM150212).toString() : null;
                if (string2 == null) {
                    string2 = "";
                }
                String strM150213 = AbstractC9594.m15021(AbstractC9234.m14531(2443), c798111);
                String string3 = strM150213 != null ? AbstractC5976.m10714(strM150213).toString() : null;
                String str2 = string3 != null ? string3 : "";
                if (AbstractC5976.m10731(string2) && AbstractC5976.m10731(str2)) {
                    return AbstractC3738.m6891(AbstractC9234.m14531(2449), abstractC80052, true);
                }
                int iM15014 = AbstractC9594.m15014(AbstractC9234.m14532("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵喵呜呜呜呜~喵喵喵喵喵呜呜喵~喵喵喵呜喵喵喵呜"), c798111);
                Integer numValueOf2 = iM15014 > 0 ? Integer.valueOf(iM15014) : null;
                return AbstractC3738.m6853(AbstractC9590.m15009().getMessageList(string2, str2, numValueOf2 != null ? numValueOf2.intValue() : 20), abstractC80052);
            case 18:
                C7981 c798112 = (C7981) obj;
                AbstractC7012.m12142("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜", c798112).writeTextToFile(AbstractC3738.m6899(AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵喵喵喵"), c798112), AbstractC3738.m6899(AbstractC9234.m14532("喵喵喵喵喵呜呜呜~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜喵~喵喵喵呜呜呜喵喵"), c798112));
                return AbstractC3738.m6891(AbstractC9234.m14531(2484), (AbstractC8005) obj2, false);
            case 19:
                C7981 c798113 = (C7981) obj;
                AbstractC7012.m12142("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜", c798113).writeBytesToFile(AbstractC3738.m6899(AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵喵喵喵"), c798113), Base64.decode(AbstractC3738.m6899(AbstractC9234.m14531(2466), c798113), 0));
                return AbstractC3738.m6891(AbstractC9234.m14531(2484), (AbstractC8005) obj2, false);
            case 20:
                C7981 c798114 = (C7981) obj;
                return AbstractC3738.m6853(AbstractC7012.m12142("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜", c798114).scanImageTextDetail(AbstractC3738.m6899(AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵喵喵喵"), c798114)), (AbstractC8005) obj2);
            case 21:
                C7981 c798115 = (C7981) obj;
                String strScanImageText = AbstractC7012.m12142("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜", c798115).scanImageText(AbstractC3738.m6899(AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵喵喵喵"), c798115));
                AbstractC9234.m14531(2485);
                strScanImageText.getClass();
                return AbstractC3738.m6891(strScanImageText, (AbstractC8005) obj2, false);
            case 22:
                C7981 c798116 = (C7981) obj;
                AbstractC8005 abstractC80053 = (AbstractC8005) obj2;
                QQNTPluginMethod qQNTPluginMethodM12142 = AbstractC7012.m12142("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜", c798116);
                String strM68994 = AbstractC3738.m6899(AbstractC9234.m14531(2441), c798116);
                String strM150214 = AbstractC9594.m15021(AbstractC9234.m14531(2443), c798116);
                String string4 = strM150214 != null ? AbstractC5976.m10714(strM150214).toString() : null;
                qQNTPluginMethodM12142.forbidden(strM68994, string4 != null ? string4 : "", AbstractC9594.m15014(AbstractC9234.m14532("喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜"), c798116));
                return AbstractC3738.m6891(AbstractC9234.m14531(2538), abstractC80053, false);
            case 23:
                C7981 c798117 = (C7981) obj;
                return AbstractC3738.m6853(AbstractC7012.m12142("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜", c798117).getGroupMemberList(AbstractC3738.m6899(AbstractC9234.m14531(2441), c798117)), (AbstractC8005) obj2);
            case 24:
                C7981 c798118 = (C7981) obj;
                String memberName = AbstractC7012.m12142("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜", c798118).getMemberName(AbstractC3738.m6899(AbstractC9234.m14531(2441), c798118), AbstractC3738.m6899(AbstractC9234.m14532("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵"), c798118));
                AbstractC9234.m14531(2536);
                memberName.getClass();
                return AbstractC3738.m6891(memberName, (AbstractC8005) obj2, false);
            case 25:
                C7981 c798119 = (C7981) obj;
                return AbstractC3738.m6853(AbstractC7012.m12142("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜", c798119).getGroupInfo(AbstractC3738.m6899(AbstractC9234.m14531(2441), c798119)), (AbstractC8005) obj2);
            case 26:
                C7981 c798120 = (C7981) obj;
                return AbstractC3738.m6853(AbstractC7012.m12142("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜", c798120).getForbiddenList(AbstractC3738.m6899(AbstractC9234.m14531(2441), c798120)), (AbstractC8005) obj2);
            case 27:
                C7981 c798121 = (C7981) obj;
                AbstractC7012.m12142("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜", c798121).setTitle(AbstractC3738.m6899(AbstractC9234.m14531(2441), c798121), AbstractC3738.m6899(AbstractC9234.m14531(2443), c798121), AbstractC3738.m6899(AbstractC9234.m14532("喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵呜喵喵~喵喵喵喵喵喵喵喵"), c798121));
                return AbstractC3738.m6891(AbstractC9234.m14531(2537), (AbstractC8005) obj2, false);
            case 28:
                C7981 c798122 = (C7981) obj;
                AbstractC8005 abstractC80054 = (AbstractC8005) obj2;
                QQNTPluginMethod qQNTPluginMethodM121422 = AbstractC7012.m12142("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜", c798122);
                String strM68995 = AbstractC3738.m6899(AbstractC9234.m14531(2441), c798122);
                String strM68996 = AbstractC3738.m6899(AbstractC9234.m14531(2443), c798122);
                Boolean boolM15017 = AbstractC9594.m15017(AbstractC9234.m14531(2534), c798122);
                qQNTPluginMethodM121422.kick(strM68995, strM68996, boolM15017 != null ? boolM15017.booleanValue() : false);
                return AbstractC3738.m6891(AbstractC9234.m14531(2538), abstractC80054, false);
            default:
                C7981 c798123 = (C7981) obj;
                return AbstractC3738.m6853(AbstractC7012.m12142("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜", c798123).getMemberInfo(AbstractC3738.m6899(AbstractC9234.m14531(2441), c798123), AbstractC3738.m6899(AbstractC9234.m14532("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵"), c798123)), (AbstractC8005) obj2);
        }
    }

    public /* synthetic */ C6797(byte b, int i) {
        this.f16523 = i;
    }
}
