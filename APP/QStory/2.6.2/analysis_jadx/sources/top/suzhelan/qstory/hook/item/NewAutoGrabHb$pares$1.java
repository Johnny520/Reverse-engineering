package top.suzhelan.qstory.hook.item;

import android.content.Context;
import android.content.Intent;
import bsh.C2660;
import com.alibaba.fastjson2.InterfaceC2915;
import com.alibaba.fastjson2.JSONObject;
import com.android.dx.io.Opcodes;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedHelpers;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URLEncoder;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.collections.AbstractC4343;
import kotlin.collections.EmptyList;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.jvm.internal.AbstractC5061;
import kotlin.text.AbstractC5138;
import kotlin.text.AbstractC5143;
import kotlin.text.Regex;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.InterfaceC5400;
import lin.xposed.hook.util.qq.QQEnvTool;
import p007.AbstractC6136;
import p010.AbstractC6154;
import p035.AbstractC6340;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p322.C8724;
import p322.C8725;
import p322.C8726;
import p322.C8727;
import p391.C9114;
import p392.AbstractC9121;
import p392.C9117;
import p392.C9119;
import p392.C9122;
import p392.C9125;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "top.suzhelan.qstory.hook.item.NewAutoGrabHb$pares$1", f = "NewAutoGrabHb.kt", l = {194, Opcodes.AND_INT_LIT16}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class NewAutoGrabHb$pares$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ String $authkey;
    final /* synthetic */ String $billNo;
    final /* synthetic */ String $notice;
    final /* synthetic */ Ref$ObjectRef<String> $peerUid;
    final /* synthetic */ int $redChannel;
    final /* synthetic */ Ref$ObjectRef<String> $senderName;
    final /* synthetic */ long $senderUin;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ C5951 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewAutoGrabHb$pares$1(int i, String str, String str2, Ref$ObjectRef<String> ref$ObjectRef, long j, C5951 c5951, String str3, Ref$ObjectRef<String> ref$ObjectRef2, InterfaceC4356<? super NewAutoGrabHb$pares$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$redChannel = i;
        this.$authkey = str;
        this.$billNo = str2;
        this.$peerUid = ref$ObjectRef;
        this.$senderUin = j;
        this.this$0 = c5951;
        this.$notice = str3;
        this.$senderName = ref$ObjectRef2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new NewAutoGrabHb$pares$1(this.$redChannel, this.$authkey, this.$billNo, this.$peerUid, this.$senderUin, this.this$0, this.$notice, this.$senderName, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((NewAutoGrabHb$pares$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws ExecutionException, InterruptedException, TimeoutException {
        long j;
        long j2;
        String string;
        int i;
        String string2;
        Collection collectionM8816;
        Object objM10495;
        String strM6668;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        C5175 c5175 = C5175.f14739;
        if (i2 == 0) {
            AbstractC5184.m10206(obj);
            int i3 = this.$redChannel;
            String str = this.$authkey;
            str.getClass();
            String str2 = this.$billNo;
            str2.getClass();
            C8725 c8725 = new C8725(str, str2, this.$peerUid.element, i3, String.valueOf(this.$senderUin));
            C8724.f24590.getClass();
            Class clsM14400 = C8724.m14400();
            Object qRouteApi = QQEnvTool.getQRouteApi(AbstractC9121.m14657(AbstractC3056.m6668(-3937602154219701671L)));
            C9125 c9125M14680 = C9125.m14680(qRouteApi.getClass());
            c9125M14680.f25506 = String.class;
            c9125M14680.f25504 = AbstractC3056.m6668(-3937601948061271463L);
            String str3 = (String) c9125M14680.m14684(qRouteApi, new Object[0]);
            String pSkey = QQEnvTool.getPSkey(AbstractC3056.m6668(-3937601840687089063L));
            String currentUin = QQEnvTool.getCurrentUin();
            String currentAccountNickName = QQEnvTool.getCurrentAccountNickName();
            StringBuilder sb = new StringBuilder();
            AbstractC6136.m11547(-3937598035346064807L, sb, -3937597597259400615L);
            j = -3937598035346064807L;
            AbstractC6136.m11531(sb, c8725.f24594, -3937675727009482151L);
            sb.append(AbstractC3056.m6668(-3937597597259400615L));
            AbstractC6136.m11533(sb, c8725.f24596, -3937675765664187815L);
            sb.append(AbstractC3056.m6668(-3937597597259400615L));
            String str4 = c8725.f24593;
            AbstractC6136.m11531(sb, str4, -3937675632520201639L);
            AbstractC6136.m11547(-3937597597259400615L, sb, -3937595638754313639L);
            AbstractC6136.m11547(-3937675679764841895L, sb, -3937597597259400615L);
            AbstractC6136.m11531(sb, str4, -3937675619635299751L);
            AbstractC6136.m11544(-3937597597259400615L, sb, currentAccountNickName);
            AbstractC6136.m11547(-3937675611045365159L, sb, -3937597597259400615L);
            AbstractC6136.m11547(-3937561652678100391L, sb, -3937675550915823015L);
            sb.append(AbstractC3056.m6668(-3937597597259400615L));
            AbstractC6136.m11531(sb, c8725.f24595, -3937675452131575207L);
            AbstractC6136.m11544(-3937597597259400615L, sb, currentUin);
            AbstractC6136.m11547(-3937675439246673319L, sb, -3937597597259400615L);
            AbstractC6136.m11531(sb, c8725.f24592, -3937675383412098471L);
            AbstractC6136.m11547(-3937597597259400615L, sb, -3937595638754313639L);
            AbstractC6136.m11547(-3937675396297000359L, sb, -3937597597259400615L);
            sb.append(AbstractC3056.m6668(-3937561652678100391L));
            String string3 = sb.toString();
            AbstractC3056.m6668(-3937690351373125031L);
            Object objM14654 = C9119.m14654(new Object[]{AbstractC6340.f17460}, new Class[]{Context.class}, AbstractC9121.m14657(AbstractC3056.m6668(-3937602270183818663L)));
            objM14654.getClass();
            C9125 c9125M146802 = C9125.m14680(objM14654.getClass());
            Class cls = Integer.TYPE;
            c9125M146802.m14683(String.class, String.class, cls, String.class, String.class, String.class);
            c9125M146802.f25506 = AbstractC9121.m14657(AbstractC3056.m6668(-3937675297512752551L));
            c9125M146802.f25504 = AbstractC3056.m6668(-3937601844982056359L);
            String strM66682 = AbstractC3056.m6668(-3937612084184090023L);
            int i4 = c8725.f24591;
            String str5 = (String) C9117.m14649(String.class, AbstractC3056.m6668(-3937601784852514215L), c9125M146802.m14684(objM14654, currentUin, strM66682, Integer.valueOf(i4), string3, pSkey, str3));
            str5.getClass();
            Object objM14655 = C9119.m14655(AbstractC9121.m14657(AbstractC3056.m6668(-3937599306656384423L)), new Object[0]);
            objM14655.getClass();
            j2 = -3937597597259400615L;
            XposedHelpers.callMethod(C9117.m14649(null, AbstractC3056.m6668(-3937598885749589415L), objM14655), AbstractC3056.m6668(-3937598920109327783L), new Class[]{String.class}, new Object[]{AbstractC3056.m6668(-3937598834209981863L)});
            XposedHelpers.callMethod(C9117.m14649(null, AbstractC3056.m6668(-3937612054119318951L), objM14655), AbstractC3056.m6668(-3937598920109327783L), new Class[]{String.class}, new Object[]{str5});
            XposedHelpers.callMethod(C9117.m14649(null, AbstractC3056.m6668(-3937611951040103847L), objM14655), AbstractC3056.m6668(-3937598920109327783L), new Class[]{String.class}, new Object[]{String.valueOf(i4)});
            XposedHelpers.callMethod(C9117.m14649(null, AbstractC3056.m6668(-3937598748310635943L), objM14655), AbstractC3056.m6668(-3937598920109327783L), new Class[]{cls}, new Object[]{0});
            Object objCallMethod = XposedHelpers.callMethod(objM14655, AbstractC3056.m6668(-3937598778375407015L), new Object[0]);
            AbstractC3056.m6668(-3937713411052537255L);
            objCallMethod.getClass();
            byte[] bArrM14401 = C8724.m14401((byte[]) objCallMethod);
            C9117 c9117M14648 = C9117.m14648(AbstractC9121.m14657(AbstractC3056.m6668(-3937593001644393895L)));
            c9117M14648.f25490 = AbstractC3056.m6668(-3937601501384672679L);
            Object objM146542 = C9119.m14654(new Object[]{(Context) c9117M14648.m14653(null), clsM14400}, new Class[]{Context.class, Class.class}, AbstractC9121.m14657(AbstractC3056.m6668(-3937601664593429927L)));
            AbstractC3056.m6668(-3937764177565975975L);
            objM146542.getClass();
            Intent intent = (Intent) objM146542;
            intent.putExtra(AbstractC3056.m6668(-3937601411190359463L), AbstractC3056.m6668(-3937601394010490279L));
            intent.putExtra(AbstractC3056.m6668(-3937589565670557095L), bArrM14401);
            intent.putExtra(AbstractC3056.m6668(-3937558637611058599L), 30000L);
            C9125 c9125M146803 = C9125.m14680(intent.getClass());
            c9125M146803.f25504 = AbstractC3056.m6668(-3937598593691813287L);
            c9125M146803.m14683(AbstractC9121.m14657(AbstractC3056.m6668(-3937598473432728999L)));
            C9122 c9122 = AbstractC9121.f25497;
            Class clsM14657 = AbstractC9121.m14657(AbstractC3056.m6668(-3937598473432728999L));
            AbstractC3056.m6668(-3937822932718585255L);
            clsM14657.getClass();
            Object objNewProxyInstance = Proxy.newProxyInstance(c9122, new Class[]{clsM14657}, new C2660(c8725, 3));
            AbstractC3056.m6668(-3937728482092778919L);
            objNewProxyInstance.getClass();
            c9125M146803.m14684(intent, objNewProxyInstance);
            Object appRuntime = QQEnvTool.getAppRuntime();
            appRuntime.getClass();
            AbstractC5061.m10031(appRuntime, AbstractC3056.m6668(-3937598327403840935L), intent);
            Object obj2 = c8725.f24597.get(10L, TimeUnit.SECONDS);
            AbstractC3056.m6668(-3937714957240763815L);
            obj2.getClass();
            JSONObject jSONObjectM6316 = InterfaceC2915.m6316((String) obj2);
            AbstractC3056.m6668(-3937758684302804391L);
            jSONObjectM6316.getClass();
            string = jSONObjectM6316.getString(AbstractC3056.m6668(-3937611800716248487L));
            if (string == null) {
                C8726.f24599.getClass();
                C9114 c9114 = C8726.f24598;
                String strM66683 = AbstractC3056.m6668(-3937758619878294951L);
                c9114.getClass();
                if (c9114.f25485.getBoolean(strM66683, false)) {
                    C5951 c5951 = this.this$0;
                    String strM66684 = AbstractC3056.m6668(-3937758542568883623L);
                    String str6 = this.$notice;
                    str6.getClass();
                    String str7 = this.$senderName.element;
                    AbstractC3056.m6668(-3937758473849406887L);
                    str7.getClass();
                    String str8 = this.$peerUid.element;
                    c5951.getClass();
                    AbstractC6154.m11561(C5951.m11267(strM66684, str6, str7, str8));
                    C5951 c59512 = this.this$0;
                    String strM66685 = AbstractC3056.m6668(-3937758542568883623L);
                    String str9 = this.$notice;
                    str9.getClass();
                    String str10 = this.$senderName.element;
                    AbstractC3056.m6668(-3937758473849406887L);
                    str10.getClass();
                    String str11 = this.$peerUid.element;
                    c59512.getClass();
                    C5951.m11266(strM66685, str9, str10, str11);
                    return c5175;
                }
            } else {
                JSONObject jSONObject = jSONObjectM6316.getJSONObject(AbstractC3056.m6668(-3937611727701804455L));
                String string4 = jSONObject.getString(AbstractC3056.m6668(-3937661089760937383L));
                String string5 = jSONObject.getString(AbstractC3056.m6668(-3937661098350871975L));
                string5.getClass();
                int i5 = Integer.parseInt(string5);
                string4.getClass();
                i = i5 / Integer.parseInt(string4);
                C5951 c59513 = this.this$0;
                String str12 = this.$notice;
                str12.getClass();
                String str13 = this.$peerUid.element;
                c59513.getClass();
                C8726.f24599.getClass();
                C9114 c91142 = C8726.f24598;
                String strM14641 = c91142.m14641(AbstractC3056.m6668(-3937662532869948839L), AbstractC3056.m6668(-3937561979095614887L));
                if (strM14641.length() <= 0 || !new Regex(AbstractC5138.m10128(strM14641, AbstractC3056.m6668(-3937648784679634343L), AbstractC3056.m6668(-3937561979095614887L))).matches(str13)) {
                    String strM146412 = c91142.m14641(AbstractC3056.m6668(-3937662459855504807L), AbstractC3056.m6668(-3937561979095614887L));
                    if (strM146412.length() > 0) {
                        if (strM146412.endsWith(AbstractC3056.m6668(-3937661407588517287L))) {
                            strM146412 = AbstractC5143.m10170(1, strM146412);
                        }
                        List<String> listSplit = new Regex(AbstractC3056.m6668(-3937661416178451879L)).split(strM146412, 0);
                        if (!listSplit.isEmpty()) {
                            ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
                            while (listIterator.hasPrevious()) {
                                if (listIterator.previous().length() != 0) {
                                    collectionM8816 = AbstractC4343.m8816(listIterator.nextIndex() + 1, listSplit);
                                    break;
                                }
                            }
                        }
                        collectionM8816 = EmptyList.INSTANCE;
                        boolean z = false;
                        String[] strArr = (String[]) collectionM8816.toArray(new String[0]);
                        int length = strArr.length;
                        int i6 = 0;
                        while (i6 < length) {
                            String str14 = strArr[i6];
                            if (AbstractC5143.m10171(str12, str14, z)) {
                                string2 = AbstractC3056.m6668(-3937757971338233255L).concat(str14);
                                break;
                            }
                            i6++;
                            z = false;
                        }
                    }
                    int i7 = c91142.f25485.getInt(AbstractC3056.m6668(-3937662300941714855L), 0);
                    if (i7 <= 0 || i >= i7) {
                        string2 = null;
                    } else {
                        BigDecimal bigDecimalDivide = new BigDecimal(i7).divide(new BigDecimal(100));
                        RoundingMode roundingMode = RoundingMode.HALF_UP;
                        String string6 = bigDecimalDivide.setScale(2, roundingMode).toString();
                        AbstractC3056.m6668(-3937690351373125031L);
                        string6.getClass();
                        String string7 = new BigDecimal(i).divide(new BigDecimal(100)).setScale(2, roundingMode).toString();
                        AbstractC3056.m6668(-3937690351373125031L);
                        string7.getClass();
                        StringBuilder sb2 = new StringBuilder();
                        AbstractC6136.m11544(-3937757919798625703L, sb2, string7);
                        sb2.append(AbstractC3056.m6668(-3937757949863396775L));
                        sb2.append(string6);
                        sb2.append((char) 20803);
                        string2 = sb2.toString();
                    }
                } else {
                    string2 = AbstractC3056.m6668(-3937758074417448359L);
                }
                if (string2 == null) {
                    C5951 c59514 = this.this$0;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = string;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.I$0 = i;
                    this.label = 1;
                    c59514.getClass();
                    C8726.f24599.getClass();
                    C9114 c91143 = C8726.f24598;
                    String strM66686 = AbstractC3056.m6668(-3937662610179360167L);
                    c91143.getClass();
                    int i8 = c91143.f25485.getInt(strM66686, 0);
                    if (i8 <= 0 || (objM10495 = AbstractC5398.m10495(i8, this)) != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        objM10495 = c5175;
                    }
                    if (objM10495 != coroutineSingletons) {
                    }
                }
                C8726.f24599.getClass();
                C9114 c91144 = C8726.f24598;
                String strM66687 = AbstractC3056.m6668(-3937758619878294951L);
                c91144.getClass();
                if (c91144.f25485.getBoolean(strM66687, false)) {
                    C5951 c59515 = this.this$0;
                    String strConcat = AbstractC3056.m6668(-3937758370770191783L).concat(string2);
                    String str15 = this.$notice;
                    str15.getClass();
                    String str16 = this.$senderName.element;
                    AbstractC3056.m6668(-3937758473849406887L);
                    str16.getClass();
                    String str17 = this.$peerUid.element;
                    c59515.getClass();
                    AbstractC6154.m11561(C5951.m11267(strConcat, str15, str16, str17));
                    C5951 c59516 = this.this$0;
                    String strConcat2 = AbstractC3056.m6668(-3937758370770191783L).concat(string2);
                    String str18 = this.$notice;
                    str18.getClass();
                    String str19 = this.$senderName.element;
                    AbstractC3056.m6668(-3937758473849406887L);
                    str19.getClass();
                    String str20 = this.$peerUid.element;
                    c59516.getClass();
                    C5951.m11266(strConcat2, str18, str19, str20);
                    return c5175;
                }
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                C5919.m11250(AbstractC3056.m6668(-3937693499584152999L));
                return null;
            }
            AbstractC5184.m10206(obj);
            return c5175;
        }
        i = this.I$0;
        string = (String) this.L$3;
        AbstractC5184.m10206(obj);
        j2 = -3937597597259400615L;
        j = -3937598035346064807L;
        String str21 = string;
        int i9 = this.$redChannel;
        String str22 = this.$authkey;
        str22.getClass();
        String str23 = this.$billNo;
        str23.getClass();
        String str24 = this.$notice;
        str24.getClass();
        C8727 c8727 = new C8727(str22, i9, str23, str24, this.$peerUid.element, String.valueOf(this.$senderUin), str21);
        C8724.f24590.getClass();
        Class clsM144002 = C8724.m14400();
        String currentUin2 = QQEnvTool.getCurrentUin();
        String currentAccountNickName2 = QQEnvTool.getCurrentAccountNickName();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(AbstractC3056.m6668(-3937598280159200679L), null);
        linkedHashMap.put(AbstractC3056.m6668(-3937598288749135271L), c8727.f24604);
        linkedHashMap.put(AbstractC3056.m6668(-3937598185669920167L), AbstractC3056.m6668(-3937561652678100391L));
        linkedHashMap.put(AbstractC3056.m6668(-3937598220029658535L), AbstractC3056.m6668(-3937561652678100391L));
        linkedHashMap.put(AbstractC3056.m6668(-3937598125540378023L), AbstractC3056.m6668(-3937561652678100391L));
        linkedHashMap.put(AbstractC3056.m6668(-3937598164195083687L), c8727.f24601);
        linkedHashMap.put(AbstractC3056.m6668(-3937598061115868583L), String.valueOf(c8727.f24605));
        linkedHashMap.put(AbstractC3056.m6668(-3937611800716248487L), c8727.f24608);
        String strM66688 = AbstractC3056.m6668(-3937598095475606951L);
        String str25 = c8727.f24600;
        linkedHashMap.put(strM66688, str25);
        linkedHashMap.put(AbstractC3056.m6668(j), c8727.f24603);
        linkedHashMap.put(AbstractC3056.m6668(-3937597927971882407L), AbstractC3056.m6668(-3937595638754313639L));
        linkedHashMap.put(AbstractC3056.m6668(-3937597970921555367L), null);
        linkedHashMap.put(AbstractC3056.m6668(-3937597854957438375L), c8727.f24602);
        linkedHashMap.put(AbstractC3056.m6668(-3937597885022209447L), str25);
        linkedHashMap.put(AbstractC3056.m6668(-3937597786237961639L), null);
        linkedHashMap.put(AbstractC3056.m6668(-3937597816302732711L), null);
        linkedHashMap.put(AbstractC3056.m6668(-3937597717518484903L), currentAccountNickName2);
        linkedHashMap.put(AbstractC3056.m6668(-3937586675157566887L), currentUin2);
        linkedHashMap.put(AbstractC3056.m6668(-3937597738993321383L), null);
        linkedHashMap.put(AbstractC3056.m6668(-3937597635914106279L), null);
        linkedHashMap.put(AbstractC3056.m6668(-3937597670273844647L), null);
        StringBuilder sb3 = new StringBuilder();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str26 = (String) entry.getValue();
            if (str26 != null) {
                if (sb3.length() > 0) {
                    sb3.append(AbstractC3056.m6668(-3937589638685001127L));
                }
                sb3.append((String) entry.getKey());
                sb3.append(AbstractC3056.m6668(j2));
                sb3.append(str26);
            }
        }
        Class clsM146572 = AbstractC9121.m14657(AbstractC3056.m6668(-3937614820078257575L));
        clsM146572.getClass();
        String strM66689 = AbstractC3056.m6668(-3937614618214794663L);
        C9117 c9117M146482 = C9117.m14648(clsM146572);
        c9117M146482.f25490 = strM66689;
        c9117M146482.f25489 = null;
        String str27 = (String) AbstractC5061.m10031(c9117M146482.m14653(null), AbstractC3056.m6668(-3937614588150023591L), c8727.f24611);
        String currentUin3 = QQEnvTool.getCurrentUin();
        Class clsM146573 = AbstractC9121.m14657(AbstractC3056.m6668(-3937600440527750567L));
        String str28 = c8727.f24607;
        Object objM146543 = C9119.m14654(new Object[]{str28, str27, currentUin3}, new Class[]{String.class, String.class, String.class}, clsM146573);
        AbstractC3056.m6668(-3937823151761917351L);
        objM146543.getClass();
        c8727.f24609 = objM146543;
        Class clsM146574 = AbstractC9121.m14657(AbstractC3056.m6668(-3937600440527750567L));
        Class clsM146575 = AbstractC9121.m14657(AbstractC3056.m6668(-3937600200009581991L));
        Class clsM146576 = AbstractC9121.m14657(AbstractC3056.m6668(-3937597571489596839L));
        Object obj3 = c8727.f24612;
        C9125 c9125M14679 = C9125.m14679(obj3);
        c9125M14679.f25504 = AbstractC3056.m6668(-3937614893092701607L);
        Class cls2 = Boolean.TYPE;
        c9125M14679.m14683(String.class, clsM146574, Map.class, cls2, cls2, clsM146575);
        c9125M14679.f25506 = clsM146576;
        Boolean bool = Boolean.TRUE;
        Object objM14684 = c9125M14679.m14684(obj3, c8727.f24611, objM146543, linkedHashMap, bool, bool, null);
        objM14684.getClass();
        c8727.f24610 = objM14684;
        C9125 c9125M146804 = C9125.m14680(objM14684.getClass());
        c9125M146804.f25504 = AbstractC3056.m6668(-3937599358195991975L);
        c9125M146804.f25506 = Map.class;
        Object obj4 = c8727.f24610;
        if (obj4 == null) {
            AbstractC4394.m8918(AbstractC3056.m6668(-3937614893092701607L));
            throw null;
        }
        Object objM146842 = c9125M146804.m14684(obj4, new Object[0]);
        AbstractC3056.m6668(-3937822984258192807L);
        objM146842.getClass();
        Map map = (Map) objM146842;
        Object objM146552 = C9119.m14655(AbstractC9121.m14657(AbstractC3056.m6668(-3937599306656384423L)), new Object[0]);
        objM146552.getClass();
        C9125 c9125M146805 = C9125.m14680(AbstractC9121.m14657(AbstractC3056.m6668(-3937599104792921511L)));
        c9125M146805.f25504 = AbstractC3056.m6668(-3937599001713706407L);
        c9125M146805.m14683(String.class);
        try {
            StringBuilder sb4 = new StringBuilder();
            for (Map.Entry entry2 : map.entrySet()) {
                String str29 = (String) entry2.getValue();
                if (str29 != null) {
                    if (sb4.length() > 0) {
                        sb4.append(AbstractC3056.m6668(-3937589638685001127L));
                    }
                    sb4.append((String) entry2.getKey());
                    sb4.append(AbstractC3056.m6668(j2));
                    sb4.append(URLEncoder.encode(str29, AbstractC3056.m6668(-3937557589639038375L)));
                }
            }
            strM6668 = sb4.toString();
            AbstractC3056.m6668(-3937690351373125031L);
        } catch (UnsupportedEncodingException unused) {
            strM6668 = AbstractC3056.m6668(-3937561979095614887L);
        }
        try {
            Object objInvoke = ((Method) c9125M146805.m14686()).invoke(null, strM6668);
            AbstractC5061.m10031(AbstractC5061.m10024(null, AbstractC3056.m6668(-3937598885749589415L), objM146552), AbstractC3056.m6668(-3937598920109327783L), str28);
            AbstractC5061.m10031(AbstractC5061.m10024(null, AbstractC3056.m6668(-3937598851389851047L), objM146552), AbstractC3056.m6668(-3937598920109327783L), objInvoke);
            byte[] bArr = (byte[]) AbstractC5061.m10031(objM146552, AbstractC3056.m6668(-3937598778375407015L), new Object[0]);
            C8724.f24590.getClass();
            byte[] bArrM144012 = C8724.m14401(bArr);
            C9117 c9117M146483 = C9117.m14648(AbstractC9121.m14657(AbstractC3056.m6668(-3937593001644393895L)));
            c9117M146483.f25490 = AbstractC3056.m6668(-3937601501384672679L);
            Object objM146544 = C9119.m14654(new Object[]{(Context) c9117M146483.m14653(null), clsM144002}, new Class[]{Context.class, Class.class}, AbstractC9121.m14657(AbstractC3056.m6668(-3937601664593429927L)));
            AbstractC3056.m6668(-3937764177565975975L);
            objM146544.getClass();
            Intent intent2 = (Intent) objM146544;
            intent2.putExtra(AbstractC3056.m6668(-3937601411190359463L), AbstractC3056.m6668(-3937601394010490279L));
            intent2.putExtra(AbstractC3056.m6668(-3937589565670557095L), bArrM144012);
            intent2.putExtra(AbstractC3056.m6668(-3937558637611058599L), 30000L);
            C9125 c9125M146806 = C9125.m14680(intent2.getClass());
            c9125M146806.f25504 = AbstractC3056.m6668(-3937598593691813287L);
            c9125M146806.m14683(AbstractC9121.m14657(AbstractC3056.m6668(-3937598473432728999L)));
            C9122 c91222 = AbstractC9121.f25497;
            Class clsM146577 = AbstractC9121.m14657(AbstractC3056.m6668(-3937598473432728999L));
            AbstractC3056.m6668(-3937822932718585255L);
            clsM146577.getClass();
            Object objNewProxyInstance2 = Proxy.newProxyInstance(c91222, new Class[]{clsM146577}, new C2660(c8727, 2));
            AbstractC3056.m6668(-3937728482092778919L);
            objNewProxyInstance2.getClass();
            c9125M146806.m14684(intent2, objNewProxyInstance2);
            Object appRuntime2 = QQEnvTool.getAppRuntime();
            appRuntime2.getClass();
            AbstractC5061.m10031(appRuntime2, AbstractC3056.m6668(-3937598327403840935L), intent2);
            Object obj5 = c8727.f24606.get();
            AbstractC3056.m6668(-3937714957240763815L);
            obj5.getClass();
            C8726.f24599.getClass();
            C9114 c91145 = C8726.f24598;
            String strM146413 = c91145.m14641(AbstractC3056.m6668(-3937662485625308583L), AbstractC3056.m6668(-3937561979095614887L));
            int i10 = c91145.f25485.getInt(AbstractC3056.m6668(-3937758409424897447L), 0);
            C5951 c59517 = this.this$0;
            String str30 = this.$peerUid.element;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = null;
            this.L$7 = null;
            this.L$8 = null;
            this.L$9 = null;
            this.L$10 = null;
            this.I$0 = i;
            this.I$1 = i10;
            this.label = 2;
            return c59517.m11269((String) obj5, str30, strM146413, i10, this) == coroutineSingletons ? coroutineSingletons : c5175;
        } catch (Exception e) {
            C5919.m11252(e);
            return null;
        }
    }
}
