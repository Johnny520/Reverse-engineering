package com.bumptech.glide;

import android.app.ActivityManager;
import android.graphics.Paint;
import android.net.Uri;
import android.text.Layout;
import androidx.activity.AbstractC0053;
import androidx.collection.C0247;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.runtime.internal.C1245;
import bsh.C2632;
import com.android.dx.io.Opcodes;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import de.robv.android.xposed.XC_MethodHook;
import io.ktor.client.plugins.AbstractC3932;
import io.ktor.server.application.C4057;
import io.ktor.server.response.InterfaceC4135;
import java.io.File;
import java.io.Serializable;
import java.io.UTFDataFormatException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.AbstractC4338;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4346;
import kotlin.collections.C4337;
import kotlin.collections.C4340;
import kotlin.collections.C4341;
import kotlin.collections.EmptyList;
import kotlin.io.C4376;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.C4396;
import kotlin.reflect.InterfaceC5092;
import kotlin.reflect.InterfaceC5107;
import kotlin.reflect.InterfaceC5109;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.jvm.AbstractC5080;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4488;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4461;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4465;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C4638;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.protobuf.C4724;
import kotlin.reflect.jvm.internal.impl.protobuf.C4725;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4877;
import kotlin.reflect.jvm.internal.impl.types.C4883;
import kotlin.reflect.jvm.internal.impl.types.C4884;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import kotlin.text.AbstractC5143;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.protobuf.ProtoIntegerType;
import lin.xposed.hook.javaplugin.OnMsgMenuCreateAPI;
import lin.xposed.hook.javaplugin.PluginMenuFloatingWindow;
import lin.xposed.hook.javaplugin.PluginMessageCallbackAPI;
import lin.xposed.hook.javaplugin.bean.FriendInfo;
import lin.xposed.hook.javaplugin.bean.GroupInfo;
import lin.xposed.hook.javaplugin.controller.AutoLoadPlugin;
import lin.xposed.hook.util.qq.QQEnvTool;
import lin.xposed.hook.util.qq.QQFriendTool;
import lin.xposed.hook.util.qq.QQNTTroopSettingTool;
import p007.AbstractC6136;
import p015.C6230;
import p030.C6308;
import p030.InterfaceC6304;
import p030.InterfaceC6305;
import p030.InterfaceC6306;
import p030.InterfaceC6307;
import p035.AbstractC6340;
import p035.C6344;
import p035.C6348;
import p037.C6358;
import p037.C6359;
import p037.C6360;
import p037.C6361;
import p037.C6362;
import p037.C6364;
import p037.C6365;
import p037.C6368;
import p038.C6369;
import p038.C6371;
import p038.C6372;
import p038.C6373;
import p038.C6376;
import p038.C6378;
import p038.C6379;
import p038.C6382;
import p038.C6383;
import p038.C6384;
import p038.C6390;
import p038.C6391;
import p038.C6392;
import p038.C6394;
import p038.C6395;
import p038.C6397;
import p038.C6403;
import p038.C6404;
import p038.C6405;
import p038.C6410;
import p038.C6413;
import p038.C6414;
import p038.C6415;
import p038.C6417;
import p038.C6418;
import p038.C6419;
import p038.ViewOnClickListenerC6416;
import p038.ViewOnClickListenerC6421;
import p039.C6422;
import p043.C6444;
import p043.C6448;
import p043.C6450;
import p045.C6462;
import p045.C6464;
import p046.C6481;
import p067.C6886;
import p067.C6892;
import p070.AbstractC6911;
import p070.InterfaceC6907;
import p071.AbstractC6912;
import p076.C6964;
import p079.AbstractC6985;
import p079.AbstractC6988;
import p079.C6978;
import p079.C7005;
import p087.C7126;
import p089.InterfaceC7183;
import p090.InterfaceC7185;
import p090.InterfaceC7187;
import p091.C7191;
import p091.C7192;
import p091.InterfaceC7190;
import p196.AbstractC7836;
import p212.AbstractC7948;
import p252.AbstractC8186;
import p292.C8565;
import p320.C8708;
import p320.C8710;
import p320.C8712;
import p320.C8714;
import p320.C8715;
import p320.C8716;
import p321.C8717;
import p321.C8718;
import p321.C8719;
import p321.C8720;
import p321.C8721;
import p321.C8722;
import p321.C8723;
import p324.C8748;
import p327.C8771;
import p327.C8772;
import p327.C8773;
import p328.C8776;
import p328.C8777;
import p328.C8778;
import p328.C8780;
import p328.C8784;
import p328.C8785;
import p329.C8789;
import p330.C8790;
import p330.C8792;
import p330.C8794;
import p330.C8798;
import p331.C8799;
import p339.C8811;
import p342.C8821;
import p383.C9006;
import p383.C9008;
import p383.C9009;
import p383.C9010;
import p383.C9011;
import p383.C9014;
import p383.C9019;
import p383.C9022;
import p383.C9025;
import p383.C9028;
import p383.C9044;
import p383.C9045;
import p383.C9050;
import p383.C9052;
import p383.C9057;
import p392.AbstractC9124;
import top.suzhelan.qstory.hook.api.C5809;
import top.suzhelan.qstory.hook.api.C5810;
import top.suzhelan.qstory.hook.api.C5812;
import top.suzhelan.qstory.hook.api.C5816;
import top.suzhelan.qstory.hook.api.C5817;
import top.suzhelan.qstory.hook.item.C5872;
import top.suzhelan.qstory.hook.item.C5873;
import top.suzhelan.qstory.hook.item.C5874;
import top.suzhelan.qstory.hook.item.C5875;
import top.suzhelan.qstory.hook.item.C5876;
import top.suzhelan.qstory.hook.item.C5877;
import top.suzhelan.qstory.hook.item.C5880;
import top.suzhelan.qstory.hook.item.C5882;
import top.suzhelan.qstory.hook.item.C5884;
import top.suzhelan.qstory.hook.item.C5885;
import top.suzhelan.qstory.hook.item.C5886;
import top.suzhelan.qstory.hook.item.C5888;
import top.suzhelan.qstory.hook.item.C5889;
import top.suzhelan.qstory.hook.item.C5892;
import top.suzhelan.qstory.hook.item.C5893;
import top.suzhelan.qstory.hook.item.C5894;
import top.suzhelan.qstory.hook.item.C5896;
import top.suzhelan.qstory.hook.item.C5897;
import top.suzhelan.qstory.hook.item.C5898;
import top.suzhelan.qstory.hook.item.C5900;
import top.suzhelan.qstory.hook.item.C5901;
import top.suzhelan.qstory.hook.item.C5902;
import top.suzhelan.qstory.hook.item.C5903;
import top.suzhelan.qstory.hook.item.C5908;
import top.suzhelan.qstory.hook.item.C5910;
import top.suzhelan.qstory.hook.item.C5911;
import top.suzhelan.qstory.hook.item.C5913;
import top.suzhelan.qstory.hook.item.C5914;
import top.suzhelan.qstory.hook.item.C5916;
import top.suzhelan.qstory.hook.item.C5917;
import top.suzhelan.qstory.hook.item.C5918;
import top.suzhelan.qstory.hook.item.C5920;
import top.suzhelan.qstory.hook.item.C5921;
import top.suzhelan.qstory.hook.item.C5922;
import top.suzhelan.qstory.hook.item.C5925;
import top.suzhelan.qstory.hook.item.C5926;
import top.suzhelan.qstory.hook.item.C5927;
import top.suzhelan.qstory.hook.item.C5928;
import top.suzhelan.qstory.hook.item.C5931;
import top.suzhelan.qstory.hook.item.C5932;
import top.suzhelan.qstory.hook.item.C5934;
import top.suzhelan.qstory.hook.item.C5935;
import top.suzhelan.qstory.hook.item.C5936;
import top.suzhelan.qstory.hook.item.C5938;
import top.suzhelan.qstory.hook.item.C5939;
import top.suzhelan.qstory.hook.item.C5941;
import top.suzhelan.qstory.hook.item.C5942;
import top.suzhelan.qstory.hook.item.C5943;
import top.suzhelan.qstory.hook.item.C5944;
import top.suzhelan.qstory.hook.item.C5945;
import top.suzhelan.qstory.hook.item.C5946;
import top.suzhelan.qstory.hook.item.C5948;
import top.suzhelan.qstory.hook.item.C5950;
import top.suzhelan.qstory.hook.item.C5951;
import top.suzhelan.qstory.hook.item.chat.C5823;
import top.suzhelan.qstory.hook.item.chat.C5824;
import top.suzhelan.qstory.hook.item.chat.C5825;
import top.suzhelan.qstory.hook.item.chat.C5826;
import top.suzhelan.qstory.hook.item.chat.C5827;
import top.suzhelan.qstory.hook.item.chat.C5828;
import top.suzhelan.qstory.hook.item.chat.C5829;
import top.suzhelan.qstory.hook.item.chat.C5831;
import top.suzhelan.qstory.hook.item.chat.C5832;
import top.suzhelan.qstory.hook.item.chat.C5833;
import top.suzhelan.qstory.hook.item.chat.C5835;
import top.suzhelan.qstory.hook.item.chat.C5841;
import top.suzhelan.qstory.hook.item.chat.C5843;
import top.suzhelan.qstory.hook.item.chat.C5844;
import top.suzhelan.qstory.hook.item.chat.C5846;
import top.suzhelan.qstory.hook.item.chat.C5849;
import top.suzhelan.qstory.hook.item.chat.C5850;
import top.suzhelan.qstory.hook.item.chat.C5851;
import top.suzhelan.qstory.hook.item.chat.C5852;
import top.suzhelan.qstory.hook.item.chat.C5853;
import top.suzhelan.qstory.hook.item.chat.C5854;
import top.suzhelan.qstory.hook.item.chat.C5859;
import top.suzhelan.qstory.hook.item.chat.C5862;

/* JADX INFO: renamed from: com.bumptech.glide.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3064 implements InterfaceC7185, InterfaceC7187 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static C5851 f9794;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public static final int m6756(String str) {
        int iM10151;
        char c = File.separatorChar;
        int iM101512 = AbstractC5143.m10151(str, c, 0, 4);
        if (iM101512 == 0) {
            if (str.length() <= 1 || str.charAt(1) != c || (iM10151 = AbstractC5143.m10151(str, c, 2, 4)) < 0) {
                return 1;
            }
            int iM101513 = AbstractC5143.m10151(str, c, iM10151 + 1, 4);
            return iM101513 >= 0 ? iM101513 + 1 : str.length();
        }
        if (iM101512 > 0 && str.charAt(iM101512 - 1) == ':') {
            return iM101512 + 1;
        }
        if (iM101512 == -1 && AbstractC5143.m10155(str, ':')) {
            return str.length();
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public static final ProtoIntegerType m6757(long j) {
        long j2 = j & 25769803776L;
        ProtoIntegerType protoIntegerType = ProtoIntegerType.DEFAULT;
        if (j2 == protoIntegerType.getSignature()) {
            return protoIntegerType;
        }
        ProtoIntegerType protoIntegerType2 = ProtoIntegerType.SIGNED;
        return j2 == protoIntegerType2.getSignature() ? protoIntegerType2 : ProtoIntegerType.FIXED;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public static final float m6758(Layout layout, int i, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = AbstractC7948.f22002;
        if (layout.getEllipsisCount(i) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i) != -1 || layout.getWidth() >= layout.getLineRight(i)) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment != null ? AbstractC7836.f21381[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = layout.getWidth() - fMeasureText;
        }
        return width - width2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public static final C4638 m6760(ProtoBuf$Property protoBuf$Property, InterfaceC6907 interfaceC6907, C6230 c6230, boolean z, boolean z2, boolean z3) {
        protoBuf$Property.getClass();
        interfaceC6907.getClass();
        C4724 c4724 = AbstractC6912.f18434;
        c4724.getClass();
        JvmProtoBuf$JvmPropertySignature jvmProtoBuf$JvmPropertySignature = (JvmProtoBuf$JvmPropertySignature) AbstractC6911.m12176(protoBuf$Property, c4724);
        if (jvmProtoBuf$JvmPropertySignature == null) {
            return null;
        }
        if (z) {
            C4725 c4725 = C6892.f18352;
            C6886 c6886M12142 = C6892.m12142(protoBuf$Property, interfaceC6907, c6230, z3);
            if (c6886M12142 == null) {
                return null;
            }
            return AbstractC4921.m9891(c6886M12142);
        }
        if (!z2 || !jvmProtoBuf$JvmPropertySignature.hasSyntheticMethod()) {
            return null;
        }
        JvmProtoBuf$JvmMethodSignature syntheticMethod = jvmProtoBuf$JvmPropertySignature.getSyntheticMethod();
        syntheticMethod.getClass();
        return new C4638(interfaceC6907.getString(syntheticMethod.getName()).concat(interfaceC6907.getString(syntheticMethod.getDesc())));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static final float m6761(Layout layout, int i, Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i);
        ThreadLocal threadLocal = AbstractC7948.f22002;
        if (layout.getEllipsisCount(i) <= 0 || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment == null ? -1 : AbstractC7836.f21381[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - fMeasureText;
        }
        return width + fAbs;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static final ArrayList m6762() {
        ArrayList arrayList = new ArrayList();
        C5812 c5812 = new C5812();
        c5812.initPath("NewMsgViewIdAdapter-9230");
        arrayList.add(c5812);
        C5810 c5810 = new C5810();
        c5810.initPath("API-\u76d1\u542cQQ\u8d26\u53f7\u53d8\u66f4");
        arrayList.add(c5810);
        C5809 c5809 = new C5809();
        c5809.initPath("API-\u76d1\u542c\u6d88\u606f\u64a4\u56de-\u672a\u5b9e\u88c5");
        arrayList.add(c5809);
        C5817 c5817 = new C5817();
        c5817.initPath("OnNewQQViewUpdate-9230");
        arrayList.add(c5817);
        C5816 c5816 = new C5816();
        c5816.initPath("API-OnQQMessage");
        arrayList.add(c5816);
        C5908 c5908 = new C5908();
        c5908.initPath("\u8f85\u52a9\u529f\u80fd/\u8d44\u6599\u5361/\u5141\u8bb8\u67e5\u770b\u5f02\u5e38\u8d44\u6599\u5361");
        arrayList.add(c5908);
        C5926 c5926 = new C5926();
        c5926.initPath("\u8f85\u52a9\u529f\u80fd/\u5b9e\u9a8c\u529f\u80fd/\u7981\u7528QQ\u516c\u4ea4\u5361");
        arrayList.add(c5926);
        C5927 c5927 = new C5927();
        c5927.initPath("\u8f85\u52a9\u529f\u80fd/\u6d88\u606f\u901a\u77e5/QQ\u901a\u77e5\u4f18\u5316");
        arrayList.add(c5927);
        C5925 c5925 = new C5925();
        c5925.initPath("\u51c0\u5316/\u804a\u5929/\u5c4f\u853dQQToast");
        arrayList.add(c5925);
        C5917 c5917 = new C5917();
        c5917.initPath("\u51c0\u5316/\u804a\u5929/\u5c4f\u853d\u4e34\u65f6\u4f1a\u8bdd\u5f39\u7a97");
        arrayList.add(c5917);
        C5916 c5916 = new C5916();
        c5916.initPath("\u51c0\u5316/\u6d4f\u89c8\u5668/\u7981\u7528\u5185\u7f6e\u6d4f\u89c8\u5668\u7f51\u9875\u62e6\u622a");
        arrayList.add(c5916);
        C5920 c5920 = new C5920();
        c5920.initPath("\u8f85\u52a9\u529f\u80fd/\u56fe\u7247\u4e0e\u8868\u60c5/\u5206\u4eab\u56fe\u7247\u4e0d\u538b\u7f29");
        arrayList.add(c5920);
        C5846 c5846 = new C5846();
        c5846.initPath("\u8f85\u52a9\u529f\u80fd/\u804a\u5929/\u6d88\u606f\u663e\u793a\u827e\u7279\u5bf9\u8c61");
        arrayList.add(c5846);
        C5844 c5844 = new C5844();
        c5844.initPath("\u8f85\u52a9\u529f\u80fd/\u56fe\u7247\u4e0e\u8868\u60c5/\u804a\u5929\u81ea\u52a8\u52fe\u9009\u539f\u56fe");
        arrayList.add(c5844);
        C5843 c5843 = new C5843();
        c5843.initPath("\u8f85\u52a9\u529f\u80fd/\u804a\u5929/\u8bed\u97f3\u6d88\u606f\u81ea\u52a8\u8f6c\u6587\u672c");
        arrayList.add(c5843);
        C5862 c5862 = new C5862();
        c5862.initPath("\u51c0\u5316/\u804a\u5929/\u7cbe\u7b80\u804a\u5929\u754c\u9762\u76f8\u673a\u6309\u94ae");
        arrayList.add(c5862);
        C5854 c5854 = new C5854();
        c5854.initPath("\u8f85\u52a9\u529f\u80fd/\u804a\u5929/\u8f93\u5165\u6846\u589e\u52a0\u63d0\u793a");
        arrayList.add(c5854);
        C5859 c5859 = new C5859();
        c5859.initPath("\u51c0\u5316/\u804a\u5929/\u5220\u9664QQ\u8868\u60c5\u5e95\u680f\u4e2d\u7684QQ\u5927\u8868\u60c5\u9009\u9879");
        arrayList.add(c5859);
        C5849 c5849 = new C5849();
        c5849.initPath("\u8f85\u52a9\u529f\u80fd/\u56fe\u7247\u4e0e\u8868\u60c5/\u8868\u60c5\u53ef\u4e0b\u8f7d(\u65b0\u7248)");
        arrayList.add(c5849);
        C5852 c5852 = new C5852();
        c5852.initPath("\u51c0\u5316/\u7fa4\u804a/\u9690\u85cf\u7f16\u8f91\u7fa4\u6635\u79f0\u88c5\u626e");
        arrayList.add(c5852);
        C5853 c5853 = new C5853();
        c5853.initPath("\u51c0\u5316/\u804a\u5929/\u9690\u85cf\u7070\u8272\u63d0\u793a\u6587\u672c");
        arrayList.add(c5853);
        C5850 c5850 = new C5850();
        c5850.initPath("\u8f85\u52a9\u529f\u80fd/\u804a\u5929/\u89e3\u9664\u62cd\u4e00\u62cd\u9650\u5236");
        arrayList.add(c5850);
        C5835 c5835 = new C5835();
        c5835.initPath("\u8f85\u52a9\u529f\u80fd/\u804a\u5929/\u9632\u64a4\u56de");
        arrayList.add(c5835);
        C5833 c5833 = new C5833();
        c5833.initPath("\u51c0\u5316/\u7fa4\u804a/\u79fb\u9664\u6d88\u606f\u8868\u60c5\u56de\u5e94");
        arrayList.add(c5833);
        C5832 c5832 = new C5832();
        c5832.initPath("\u51c0\u5316/\u804a\u5929/\u7cbe\u7b80\u804a\u5929\u754c\u9762\u6ee4\u955c\u89c6\u9891");
        arrayList.add(c5832);
        C5831 c5831 = new C5831();
        c5831.initPath("\u8f85\u52a9\u529f\u80fd/\u804a\u5929/\u79fb\u9664\u8f6c\u53d1\u6570\u91cf\u9650\u5236");
        arrayList.add(c5831);
        C5935 c5935 = new C5935();
        c5935.initPath("\u51c0\u5316/\u804a\u5929/\u79fb\u9664\u8bed\u97f3\u8f6c\u6587\u672c\u7070\u5b57\u63d0\u793a");
        arrayList.add(c5935);
        C5841 c5841 = new C5841();
        c5841.initPath("\u8f85\u52a9\u529f\u80fd/\u804a\u5929/\u6d88\u606f\u590d\u8bfb");
        arrayList.add(c5841);
        C5827 c5827 = new C5827();
        c5827.initPath("\u8f85\u52a9\u529f\u80fd/\u804a\u5929/\u53bb\u9664\u56de\u590d@");
        arrayList.add(c5827);
        C5826 c5826 = new C5826();
        c5826.initPath("\u8f85\u52a9\u529f\u80fd/\u804a\u5929/\u53d1\u9001\u6d88\u606f\u683c\u5f0f\u5316");
        arrayList.add(c5826);
        C5829 c5829 = new C5829();
        c5829.initPath("\u8f85\u52a9\u529f\u80fd/\u804a\u5929/\u663e\u793a\u6d88\u606f\u65f6\u95f4");
        arrayList.add(c5829);
        C5828 c5828 = new C5828();
        c5828.initPath("\u8f85\u52a9\u529f\u80fd/\u804a\u5929/\u7981\u8a00\u65f6\u95f4\u7cbe\u786e\u5230\u79d2");
        arrayList.add(c5828);
        C5824 c5824 = new C5824();
        c5824.initPath("\u8f85\u52a9\u529f\u80fd/\u7fa4\u804a/\u663e\u793a\u5df2\u9000\u7fa4\u7528\u6237\u7684\u6d88\u606f");
        arrayList.add(c5824);
        C5825 c5825 = new C5825();
        c5825.initPath("\u8f85\u52a9\u529f\u80fd/\u7fa4\u804a/@\u5217\u8868\u91cd\u65b0\u6392\u5e8f");
        arrayList.add(c5825);
        C5823 c5823 = new C5823();
        c5823.initPath("\u8f85\u52a9\u529f\u80fd/\u56fe\u7247\u4e0e\u8868\u60c5/\u6536\u85cf\u8868\u60c5\u6309\u4f7f\u7528\u6392\u5e8f");
        arrayList.add(c5823);
        C5921 c5921 = new C5921();
        c5921.initPath("\u51c0\u5316/\u4e3b\u9875/\u963b\u6b62QQ\u6bcf\u65e5\u5e7f\u544a\u5f39\u7a97");
        arrayList.add(c5921);
        C5918 c5918 = new C5918();
        c5918.initPath("\u8f85\u52a9\u529f\u80fd/\u804a\u5929/\u7981\u7528\u542c\u8bed\u97f3\u65f6\u542c\u7b52\u6765\u56de\u81ea\u52a8\u5207\u6362");
        arrayList.add(c5918);
        C5914 c5914 = new C5914();
        c5914.initPath("\u51c0\u5316/\u804a\u5929/\u5f3a\u5236\u4f7f\u7528\u9ed8\u8ba4\u6c14\u6ce1");
        arrayList.add(c5914);
        C5913 c5913 = new C5913();
        c5913.initPath("\u51c0\u5316/\u804a\u5929/\u5f3a\u5236\u4f7f\u7528\u9ed8\u8ba4\u5b57\u4f53");
        arrayList.add(c5913);
        C5888 c5888 = new C5888();
        c5888.initPath("\u8f85\u52a9\u529f\u80fd/\u5b9e\u9a8c\u529f\u80fd/\u5e73\u677f\u6a21\u5f0f");
        arrayList.add(c5888);
        C5886 c5886 = new C5886();
        c5886.initPath("\u51c0\u5316/\u5b9e\u9a8c\u529f\u80fd/\u5c4f\u853d\u70e6\u4eba\u5f39\u7a97");
        arrayList.add(c5886);
        C5885 c5885 = new C5885();
        c5885.initPath("\u51c0\u5316/\u804a\u5929/\u5c4f\u853d\u6389\u843d\u5c0f\u8868\u60c5");
        arrayList.add(c5885);
        C5884 c5884 = new C5884();
        c5884.initPath("\u8f85\u52a9\u529f\u80fd/\u5b9e\u9a8c\u529f\u80fd/\u5c4f\u853d\u4e91\u63a7");
        arrayList.add(c5884);
        C5894 c5894 = new C5894();
        c5894.initPath("\u51c0\u5316/\u804a\u5929/\u7981\u7528\u7279\u5b9a\u6d88\u606f\u89e6\u53d1\u7684\u4ea4\u4e92\u5f0f\u5f39\u7a97");
        arrayList.add(c5894);
        C5946 c5946 = new C5946();
        c5946.initPath("\u8f85\u52a9\u529f\u80fd/\u5c0f\u7a0b\u5e8f/\u7981\u7528\u4e0b\u62c9\u5c0f\u7a0b\u5e8f");
        arrayList.add(c5946);
        C5893 c5893 = new C5893();
        c5893.initPath("\u51c0\u5316/\u5b9e\u9a8c\u529f\u80fd/\u7981\u7528\u5d29\u6e83\u65e5\u5fd7\u4e0a\u62a5");
        arrayList.add(c5893);
        C5892 c5892 = new C5892();
        c5892.initPath("\u51c0\u5316/\u804a\u5929/\u7981\u7528\u804a\u5929\u53f3\u6ed1");
        arrayList.add(c5892);
        C5889 c5889 = new C5889();
        c5889.initPath("\u51c0\u5316/\u6d4f\u89c8\u5668/\u7981\u7528X5\u5185\u6838");
        arrayList.add(c5889);
        C8773 c8773 = new C8773();
        c8773.initPath("\u8f85\u52a9\u529f\u80fd/\u5b9e\u9a8c\u529f\u80fd/\u6bcf\u5929\u81ea\u52a8\u5907\u4efd\u6a21\u5757\u6570\u636e");
        arrayList.add(c8773);
        C8771 c8771 = new C8771();
        c8771.initPath("\u4fdd\u62a4\u6a21\u5757\u6570\u636e\u4e0d\u88abqq\u6e05\u7406");
        arrayList.add(c8771);
        C8772 c8772 = new C8772();
        c8772.initPath("\u4fdd\u62a4\u6a21\u5757\u6570\u636e\u76ee\u5f55");
        arrayList.add(c8772);
        C5880 c5880 = new C5880();
        c5880.initPath("\u8f85\u52a9\u529f\u80fd/\u56fe\u7247\u4e0e\u8868\u60c5/\u4f2a\u88c5\u5904\u4e8e\u975e\u591a\u7a97\u53e3\u6a21\u5f0f");
        arrayList.add(c5880);
        C5882 c5882 = new C5882();
        c5882.initPath("\u8f85\u52a9\u529f\u80fd/\u56fe\u7247\u4e0e\u8868\u60c5/\u7be1\u6539\u56fe\u7247\u5927\u5c0f");
        arrayList.add(c5882);
        C5877 c5877 = new C5877();
        c5877.initPath("\u8f85\u52a9\u529f\u80fd/\u804a\u5929/\u6587\u4ef6\u4e0a\u4f20\u91cd\u547d\u540d");
        arrayList.add(c5877);
        C5874 c5874 = new C5874();
        c5874.initPath("\u8f85\u52a9\u529f\u80fd/\u56fe\u7247\u4e0e\u8868\u60c5/\u95ea\u7167\u7834\u89e3(\u4f1a\u53d8\u5361)");
        arrayList.add(c5874);
        C5873 c5873 = new C5873();
        c5873.initPath("\u51c0\u5316/\u6d4f\u89c8\u5668/\u53bb\u4f60\u5927\u7237\u7684QQ\u6d4f\u89c8\u5668");
        arrayList.add(c5873);
        C5876 c5876 = new C5876();
        c5876.initPath("\u8f85\u52a9\u529f\u80fd/\u804a\u5929/\u7070\u5b57\u63d0\u793a\u663e\u793aQQ\u53f7");
        arrayList.add(c5876);
        C5875 c5875 = new C5875();
        c5875.initPath("\u51c0\u5316/\u8054\u7cfb\u4eba/\u9690\u85cf\u901a\u8baf\u5f55\u5361\u7247");
        arrayList.add(c5875);
        C5872 c5872 = new C5872();
        c5872.initPath("\u8f85\u52a9\u529f\u80fd/\u8d44\u6599\u5361/\u5c4f\u853d\u597d\u53cb\u8d44\u6599\u5361\u9001\u793c\u7269");
        arrayList.add(c5872);
        C5950 c5950 = new C5950();
        c5950.initPath("\u51c0\u5316/\u804a\u5929/\u5c4f\u853d\u8d85\u7ea7QQ\u79c0");
        arrayList.add(c5950);
        C8789 c8789 = new C8789();
        c8789.initPath("\u8f85\u52a9\u529f\u80fd/\u5b9e\u9a8c\u529f\u80fd/MCP\u670d\u52a1");
        arrayList.add(c8789);
        C5951 c5951 = new C5951();
        c5951.initPath("\u8f85\u52a9\u529f\u80fd/\u5b63\u8282\u4e13\u5c5e/\u81ea\u52a8\u62a2\u7ea2\u5305(2026)");
        arrayList.add(c5951);
        C5948 c5948 = new C5948();
        c5948.initPath("\u51c0\u5316/\u8d44\u6599\u5361/\u964c\u751f\u4eba\u8d44\u6599\u5361\u4f60\u4eec\u7684\u5173\u7cfb\u6807\u8bc6");
        arrayList.add(c5948);
        C5932 c5932 = new C5932();
        c5932.initPath("\u8f85\u52a9\u529f\u80fd/\u8d44\u6599\u5361/\u4e00\u952e20\u8d5e");
        arrayList.add(c5932);
        C5931 c5931 = new C5931();
        c5931.initPath("\u8f85\u52a9\u529f\u80fd/\u804a\u5929/\u8bed\u97f3\u8f6c\u53d1");
        arrayList.add(c5931);
        C8719 c8719 = new C8719();
        c8719.initPath("\u8f85\u52a9\u529f\u80fd/QQ\u7a7a\u95f4/\u9690\u85cfQQ\u7a7a\u95f4\u5e7f\u544a");
        arrayList.add(c8719);
        C8723 c8723 = new C8723();
        c8723.initPath("\u8f85\u52a9\u529f\u80fd/QQ\u7a7a\u95f4/\u5e95\u680f\u76f4\u63a5\u6253\u5f00\u7a7a\u95f4\u52a8\u6001");
        arrayList.add(c8723);
        C5928 c5928 = new C5928();
        c5928.initPath("\u8f85\u52a9\u529f\u80fd/\u5b9e\u9a8c\u529f\u80fd/\u968f\u673a\u865a\u62df\u4f4d\u7f6e");
        arrayList.add(c5928);
        C5944 c5944 = new C5944();
        c5944.initPath("\u51c0\u5316/\u804a\u5929/\u79fb\u9664\u8bed\u97f3\u64ad\u653e\u5f39\u7a97");
        arrayList.add(c5944);
        C5945 c5945 = new C5945();
        c5945.initPath("\u51c0\u5316/\u6d4f\u89c8\u5668/\u79fb\u9664\u6d4f\u89c8\u5668\u83dc\u5355\u7684QQ\u6d4f\u89c8\u5668");
        arrayList.add(c5945);
        C5941 c5941 = new C5941();
        c5941.initPath("\u8f85\u52a9\u529f\u80fd/\u8d44\u6599\u5361/\u5c4f\u853dDIY\u540d\u7247");
        arrayList.add(c5941);
        C5943 c5943 = new C5943();
        c5943.initPath("\u8f85\u52a9\u529f\u80fd/\u5b9e\u9a8c\u529f\u80fd/\u79fb\u9664\u6536\u85cf\u9884\u89c8\u9650\u5236");
        arrayList.add(c5943);
        C5942 c5942 = new C5942();
        c5942.initPath("\u51c0\u5316/\u804a\u5929/\u79fb\u9664\u957f\u6309\u83dc\u5355\u56fe\u6807");
        arrayList.add(c5942);
        C5938 c5938 = new C5938();
        c5938.initPath("\u8f85\u52a9\u529f\u80fd/\u5b9e\u9a8c\u529f\u80fd/\u79fb\u9664\u626b\u7801\u767b\u5f55\u68c0\u67e5");
        arrayList.add(c5938);
        C5939 c5939 = new C5939();
        c5939.initPath("\u8f85\u52a9\u529f\u80fd/\u804a\u5929/\u53bb\u9664\u53d1\u9001\u56fe\u7247\u9650\u5236");
        arrayList.add(c5939);
        C5934 c5934 = new C5934();
        c5934.initPath("\u8f85\u52a9\u529f\u80fd/\u7fa4\u804a/\u663e\u793a\u5177\u4f53\u6d88\u606f\u6570\u91cf");
        arrayList.add(c5934);
        C5936 c5936 = new C5936();
        c5936.initPath("\u8f85\u52a9\u529f\u80fd/\u5b9e\u9a8c\u529f\u80fd/\u8df3\u8fc7\u626b\u7801\u767b\u5f55\u65f6\u95f4");
        arrayList.add(c5936);
        C5898 c5898 = new C5898();
        c5898.initPath("\u8f85\u52a9\u529f\u80fd/\u5b9e\u9a8c\u529f\u80fd/\u4f2a\u88c5\u5e94\u7528\u6743\u9650\u5df2\u6301\u6709");
        arrayList.add(c5898);
        C8748 c8748 = new C8748();
        c8748.initPath("\u8f85\u52a9\u529f\u80fd/\u56fe\u7247\u4e0e\u8868\u60c5/\u8868\u60c5\u9762\u677f#2");
        arrayList.add(c8748);
        C5902 c5902 = new C5902();
        c5902.initPath("\u8f85\u52a9\u529f\u80fd/\u804a\u5929/\u5f3a\u5236\u4f7f\u7528\u7cfb\u7edfEmoji");
        arrayList.add(c5902);
        C8715 c8715 = new C8715();
        c8715.initPath("\u8f85\u52a9\u529f\u80fd/\u6d88\u606f\u901a\u77e5/\u5c4f\u853d\u7fa4\u5f85\u529e");
        arrayList.add(c8715);
        C8714 c8714 = new C8714();
        c8714.initPath("\u51c0\u5316/\u7fa4\u804a/\u9690\u85cf\u804a\u5929\u5feb\u6377\u680f");
        arrayList.add(c8714);
        C8716 c8716 = new C8716();
        c8716.initPath("\u51c0\u5316/\u7fa4\u804a/\u9690\u85cf\u7fa4\u804a\u98ce\u9669\u63d0\u9192");
        arrayList.add(c8716);
        C5903 c5903 = new C5903();
        c5903.initPath("\u8f85\u52a9\u529f\u80fd/\u7fa4\u804a/\u7fa4\u6587\u4ef6\u663e\u793a\u4e0b\u8f7d\u6b21\u6570(\u65b0)");
        arrayList.add(c5903);
        C5900 c5900 = new C5900();
        c5900.initPath("\u8f85\u52a9\u529f\u80fd/\u7fa4\u804a/\u7fa4\u6587\u4ef6\u663e\u793a\u4e0b\u8f7d\u6b21\u6570(\u65e7)");
        arrayList.add(c5900);
        C5901 c5901 = new C5901();
        c5901.initPath("\u51c0\u5316/\u8d44\u6599\u5361/\u9690\u85cf\u597d\u53cb\u4e92\u52a8\u6807\u8bc6");
        arrayList.add(c5901);
        C5896 c5896 = new C5896();
        c5896.initPath("\u8f85\u52a9\u529f\u80fd/\u8d44\u6599\u5361/\u4e0a\u4f20\u900f\u660e\u5934\u50cf");
        arrayList.add(c5896);
        C5897 c5897 = new C5897();
        c5897.initPath("\u8f85\u52a9\u529f\u80fd/\u8d44\u6599\u5361/\u4e0a\u4f20\u534a\u900f\u660e\u5934\u50cf");
        arrayList.add(c5897);
        C8811 c8811 = new C8811();
        c8811.initPath("\u4e3b\u9875\u53f3\u4e0a\u89d2\u6ce8\u5165");
        arrayList.add(c8811);
        C6397 c6397 = new C6397();
        c6397.initPath("\u8f85\u52a9\u529f\u80fd/\u804a\u5929/\u8bed\u97f3\u60ac\u6d6e\u7a97");
        arrayList.add(c6397);
        C6360 c6360 = new C6360();
        c6360.initPath("API-BuildMenuElement");
        arrayList.add(c6360);
        C6359 c6359 = new C6359();
        c6359.initPath("API-\u7fa4\u7ec4\u7981\u8a00\u76d1\u542c");
        arrayList.add(c6359);
        C6358 c6358 = new C6358();
        c6358.initPath("API-\u8fdb\u7fa4\u76d1\u542c\u5668");
        arrayList.add(c6358);
        C6364 c6364 = new C6364();
        c6364.initPath("API-ListenToChatWindowsAsTheyAppearAndClose");
        arrayList.add(c6364);
        C6368 c6368 = new C6368();
        c6368.initPath("API-OnRKey");
        arrayList.add(c6368);
        C6365 c6365 = new C6365();
        c6365.initPath("API-\u76d1\u542c\u6d88\u606f\u53d1\u9001");
        arrayList.add(c6365);
        C6362 c6362 = new C6362();
        c6362.initPath("API-Session_info_find_init");
        arrayList.add(c6362);
        C6361 c6361 = new C6361();
        c6361.initPath("API-\u9000\u7fa4\u76d1\u542c\u5668");
        arrayList.add(c6361);
        C6395 c6395 = new C6395();
        c6395.initPath("\u51c0\u5316/\u4e3b\u9875/\u81ea\u52a8\u6e05\u7406\u4e3b\u9875\u9891\u9053\u6d88\u606f\uff08\u5c4f\u853d\u4e3b\u9875\u9891\u9053\u6d88\u606f\uff09");
        arrayList.add(c6395);
        C6394 c6394 = new C6394();
        c6394.initPath("\u8f85\u52a9\u529f\u80fd/\u6d88\u606f\u901a\u77e5/\u5c4f\u853dAT\u5168\u4f53\u6d88\u606f\u7684\u7cfb\u7edf\u901a\u77e5");
        arrayList.add(c6394);
        C6415 c6415 = new C6415();
        c6415.initPath("\u8f85\u52a9\u529f\u80fd/\u804a\u5929/\u4fee\u6539\u804a\u5929\u6d88\u606f\u5185\u5bb9");
        arrayList.add(c6415);
        ViewOnClickListenerC6416 viewOnClickListenerC6416 = new ViewOnClickListenerC6416();
        viewOnClickListenerC6416.initPath("\u8f85\u52a9\u529f\u80fd/\u56fe\u7247\u4e0e\u8868\u60c5/\u56fe\u7247,\u8868\u60c5\u7684\u663e\u793a\u6587\u672c\u4fee\u6539");
        arrayList.add(viewOnClickListenerC6416);
        C6413 c6413 = new C6413();
        c6413.initPath("\u8f85\u52a9\u529f\u80fd/\u56fe\u7247\u4e0e\u8868\u60c5/\u67e5\u770b\u56fe\u7247\u65f6\u80cc\u666f\u900f\u660e\u6a21\u7cca");
        arrayList.add(c6413);
        C6414 c6414 = new C6414();
        c6414.initPath("\u51c0\u5316/\u5b9e\u9a8c\u529f\u80fd/\u7981\u7528\u65e5\u5fd7\u5199\u5165\u7684\u7ebf\u7a0b");
        arrayList.add(c6414);
        C6405 c6405 = new C6405();
        c6405.initPath("\u8f85\u52a9\u529f\u80fd/\u804a\u5929/\u590d\u5236\u5361\u7247");
        arrayList.add(c6405);
        C6410 c6410 = new C6410();
        c6410.initPath("\u8f85\u52a9\u529f\u80fd/\u56fe\u7247\u4e0e\u8868\u60c5/\u590d\u5236\u56fe\u7247\u94fe\u63a5");
        arrayList.add(c6410);
        C6403 c6403 = new C6403();
        c6403.initPath("\u8f85\u52a9\u529f\u80fd/\u5b9e\u9a8c\u529f\u80fd/\u5220\u9664\u4e3b\u9875\u804a\u5929\u5217\u8868");
        arrayList.add(c6403);
        C6404 c6404 = new C6404();
        c6404.initPath("\u8f85\u52a9\u529f\u80fd/\u56fe\u7247\u4e0e\u8868\u60c5/\u5728\u65b0\u7684QQ\u4e2d\u4f9d\u7136\u53ef\u4ee5\u4e0b\u8f7d\u8868\u60c5");
        arrayList.add(c6404);
        C6383 c6383 = new C6383();
        c6383.initPath("\u8f85\u52a9\u529f\u80fd/\u56fe\u7247\u4e0e\u8868\u60c5/\u67e5\u770b\u8868\u60c5\u65f6\u80cc\u666f\u900f\u660e");
        arrayList.add(c6383);
        C6384 c6384 = new C6384();
        c6384.initPath("\u8f85\u52a9\u529f\u80fd/\u56fe\u7247\u4e0e\u8868\u60c5/\u8868\u60c5\u9762\u677f#1");
        arrayList.add(c6384);
        C6382 c6382 = new C6382();
        c6382.initPath("\u51c0\u5316/\u804a\u5929/\u5206\u4eab\u5f39\u7a97\u4e0d\u663e\u793a\u597d\u53cb\u548c\u7fa4");
        arrayList.add(c6382);
        C6392 c6392 = new C6392();
        c6392.initPath("\u8f85\u52a9\u529f\u80fd/\u5b9e\u9a8c\u529f\u80fd/\u83b7\u53d6\u6e38\u620f\u597d\u53cbQQ");
        arrayList.add(c6392);
        C6391 c6391 = new C6391();
        c6391.initPath("\u51c0\u5316/\u804a\u5929/\u53bb\u9664\u6807\u9898\u680f\u542c\u7b52\u6807\u8bc6");
        arrayList.add(c6391);
        C6390 c6390 = new C6390();
        c6390.initPath("\u8f85\u52a9\u529f\u80fd/\u804a\u5929/\u4fdd\u5b58\u8bed\u97f3");
        arrayList.add(c6390);
        C6378 c6378 = new C6378();
        c6378.initPath("\u8f85\u52a9\u529f\u80fd/\u56fe\u7247\u4e0e\u8868\u60c5/\u804a\u5929\u754c\u9762\u56fe\u7247\u663e\u793a\u53d1\u9001\u8005");
        arrayList.add(c6378);
        C6379 c6379 = new C6379();
        c6379.initPath("\u8f85\u52a9\u529f\u80fd/\u804a\u5929/\u53d1\u9001\u5361\u7247");
        arrayList.add(c6379);
        C6376 c6376 = new C6376();
        c6376.initPath("\u8f85\u52a9\u529f\u80fd/\u804a\u5929/\u6d88\u606f\u5c0f\u5c3e\u5df4");
        arrayList.add(c6376);
        C6372 c6372 = new C6372();
        c6372.initPath("\u8f85\u52a9\u529f\u80fd/\u5c0f\u7a0b\u5e8f/\u5c0f\u7a0b\u5e8f\u8df3\u8fc7\u5e7f\u544a");
        arrayList.add(c6372);
        C6371 c6371 = new C6371();
        c6371.initPath("\u51c0\u5316/\u4e3b\u9875/\u51c0\u5316\u4e3b\u9875\u6a2a\u5e45\u65b0\u5e74\u5e7f\u544a");
        arrayList.add(c6371);
        C6373 c6373 = new C6373();
        c6373.initPath("\u51c0\u5316/\u4fa7\u6ed1\u680f/\u4fa7\u6ed1\u680f\u53f3\u4e0a\u89d2\u8fd4\u56de-\u5931\u6548");
        arrayList.add(c6373);
        C6369 c6369 = new C6369();
        c6369.initPath("\u51c0\u5316/\u4fa7\u6ed1\u680f/\u7cbe\u7b80\u4fa7\u6ed1\u680f\u53f3\u4e0a\u89d2\u4e8c\u7ef4\u7801-\u5931\u6548");
        arrayList.add(c6369);
        C6418 c6418 = new C6418();
        c6418.initPath("\u8f85\u52a9\u529f\u80fd/\u6d88\u606f\u901a\u77e5/\u5feb\u6377\u514d\u6253\u6270");
        arrayList.add(c6418);
        C6417 c6417 = new C6417();
        c6417.initPath("\u8f85\u52a9\u529f\u80fd/\u56fe\u7247\u4e0e\u8868\u60c5/\u53d1\u9001\u539f\u56fe\u65f6\u64e6\u9664\u4f4d\u7f6e\u4fe1\u606f");
        arrayList.add(c6417);
        ViewOnClickListenerC6421 viewOnClickListenerC6421 = new ViewOnClickListenerC6421();
        viewOnClickListenerC6421.initPath("\u8f85\u52a9\u529f\u80fd/\u56fe\u7247\u4e0e\u8868\u60c5/\u56fe\u7247\u8f6c\u5927\u56fe\u5361\u7247-\u5df2\u5931\u6548");
        arrayList.add(viewOnClickListenerC6421);
        C6419 c6419 = new C6419();
        c6419.initPath("\u8f85\u52a9\u529f\u80fd/\u7fa4\u804a/\u7fa4\u8bbe\u7f6e\u9875\u7fa4\u6587\u4ef6\u65e7\u7248\u6392\u5e8f");
        arrayList.add(c6419);
        C6448 c6448 = new C6448();
        c6448.initPath("\u8f85\u52a9\u529f\u80fd/\u5b9e\u9a8c\u529f\u80fd/\u9f99|\u732b\u56fe\u68c0\u6d4b\u7981\u8a00");
        arrayList.add(c6448);
        C6444 c6444 = new C6444();
        c6444.initPath("\u8f85\u52a9\u529f\u80fd/\u5b9e\u9a8c\u529f\u80fd/\u9f99\u56fe\u68c0\u6d4b\u5185\u6d4b\u7248");
        arrayList.add(c6444);
        C6450 c6450 = new C6450();
        c6450.initPath("\u6d4b\u8bd5\u4e13\u7528/Test/\u957f\u6309\u6d88\u606f\u9009\u9879\u8f93\u51faMsgRecord");
        arrayList.add(c6450);
        C6422 c6422 = new C6422();
        c6422.initPath("\u8f85\u52a9\u529f\u80fd/\u5b9e\u9a8c\u529f\u80fd/\u70ab\u9177\u5f69\u8272\u5b57\u4f53");
        arrayList.add(c6422);
        AutoLoadPlugin autoLoadPlugin = new AutoLoadPlugin();
        autoLoadPlugin.initPath("\u81ea\u52a8\u52a0\u8f7d\u811a\u672c");
        arrayList.add(autoLoadPlugin);
        OnMsgMenuCreateAPI onMsgMenuCreateAPI = new OnMsgMenuCreateAPI();
        onMsgMenuCreateAPI.initPath("Plugin-OnMsgMenuCreateAPI");
        arrayList.add(onMsgMenuCreateAPI);
        PluginMenuFloatingWindow pluginMenuFloatingWindow = new PluginMenuFloatingWindow();
        pluginMenuFloatingWindow.initPath("\u6ce8\u518c\u811a\u672c\u83dc\u5355\u60ac\u6d6e\u7a97");
        arrayList.add(pluginMenuFloatingWindow);
        PluginMessageCallbackAPI pluginMessageCallbackAPI = new PluginMessageCallbackAPI();
        pluginMessageCallbackAPI.initPath("Plugin-Message-Callback");
        arrayList.add(pluginMessageCallbackAPI);
        C6348 c6348 = new C6348();
        c6348.initPath("\u6ce8\u5165QQ\u8bbe\u7f6e\u9875\u9762");
        arrayList.add(c6348);
        C6344 c6344 = new C6344();
        c6344.initPath("\u8f85\u52a9\u529f\u80fd/\u5b9e\u9a8c\u529f\u80fd/\u963b\u6b62\u5b50\u7ebf\u7a0b\u95ea\u9000");
        arrayList.add(c6344);
        C5922 c5922 = new C5922();
        c5922.initPath("\u8f85\u52a9\u529f\u80fd/\u5b63\u8282\u4e13\u5c5e/\u81ea\u52a8\u62a2\u7ea2\u5305(2025)");
        arrayList.add(c5922);
        C5911 c5911 = new C5911();
        c5911.initPath("\u8f85\u52a9\u529f\u80fd/\u5b9e\u9a8c\u529f\u80fd/\u91cd\u5b9a\u5411\u6587\u4ef6\u4e0b\u8f7d\u4f4d\u7f6e");
        arrayList.add(c5911);
        C5910 c5910 = new C5910();
        c5910.initPath("\u8f85\u52a9\u529f\u80fd/\u56fe\u7247\u4e0e\u8868\u60c5/\u81ea\u5b9a\u4e49\u8868\u60c5\u5916\u663e\u6587\u6848");
        arrayList.add(c5910);
        C8780 c8780 = new C8780();
        c8780.initPath("\u8f85\u52a9\u529f\u80fd/\u56fe\u7247\u4e0e\u8868\u60c5/\u53d1\u9001\u56fe\u7247\u65f6\u534a\u5c4f\u6253\u5f00\u76f8\u518c(\u7981\u7528\u5f3a\u5236\u5168\u5c4f\u6253\u5f00\u76f8\u518c)");
        arrayList.add(c8780);
        C8778 c8778 = new C8778();
        c8778.initPath("\u8f85\u52a9\u529f\u80fd/\u7fa4\u804a/\u827e\u7279\u5168\u4f53-\u5f03\u7528");
        arrayList.add(c8778);
        C8777 c8777 = new C8777();
        c8777.initPath("\u51c0\u5316/\u804a\u5929/\u62e6\u622a\u5f02\u5e38GIF-\u5f03\u7528");
        arrayList.add(c8777);
        C8776 c8776 = new C8776();
        c8776.initPath("\u51c0\u5316/\u4fa7\u6ed1\u680f/\u542f\u7528\u65e7\u7248\u4fa7\u6ed1\u680f-\u5f03\u7528");
        arrayList.add(c8776);
        C8784 c8784 = new C8784();
        c8784.initPath("\u8f85\u52a9\u529f\u80fd/\u5b63\u8282\u4e13\u5c5e/\u81ea\u52a8\u62a2\u7ea2\u5305");
        arrayList.add(c8784);
        C8785 c8785 = new C8785();
        c8785.initPath("\u51c0\u5316/\u8054\u7cfb\u4eba/\u79fb\u9664\u8054\u7cfb\u4eba\u9875\u4e0a\u65b9\u7684\u6a2a\u5e45\u5e7f\u544a-\u5f03\u7528");
        arrayList.add(c8785);
        C8794 c8794 = new C8794();
        c8794.initPath("\u8f85\u52a9\u529f\u80fd/\u5b63\u8282\u4e13\u5c5e/\u67ab\u53f6\u98d8\u843d");
        arrayList.add(c8794);
        C8792 c8792 = new C8792();
        c8792.initPath("\u8f85\u52a9\u529f\u80fd/\u5b63\u8282\u4e13\u5c5e/\u96ea\u82b1\u98d8\u843d");
        arrayList.add(c8792);
        C8790 c8790 = new C8790();
        c8790.initPath("\u8f85\u52a9\u529f\u80fd/\u5b63\u8282\u4e13\u5c5e/\u65b0\u5e74\u4e2d\u56fd\u7ed3\u9876\u680f");
        arrayList.add(c8790);
        C8798 c8798 = new C8798();
        c8798.initPath("\u8f85\u52a9\u529f\u80fd/\u5b63\u8282\u4e13\u5c5e/\u592a\u9633\u98d8\u843d");
        arrayList.add(c8798);
        C8722 c8722 = new C8722();
        c8722.initPath("\u8f85\u52a9\u529f\u80fd/QQ\u7a7a\u95f4/\u81ea\u52a8\u70b9\u8d5eQQ\u7a7a\u95f4");
        arrayList.add(c8722);
        C8721 c8721 = new C8721();
        c8721.initPath("\u8f85\u52a9\u529f\u80fd/QQ\u7a7a\u95f4/\u6bcf\u5929\u81ea\u52a8\u53d1QQ\u7a7a\u95f4");
        arrayList.add(c8721);
        C8720 c8720 = new C8720();
        c8720.initPath("\u8f85\u52a9\u529f\u80fd/QQ\u7a7a\u95f4/\u81ea\u52a8\u5220\u9664\u53d1\u5e03\u7684\u7a7a\u95f4");
        arrayList.add(c8720);
        C8718 c8718 = new C8718();
        c8718.initPath("\u8f85\u52a9\u529f\u80fd/QQ\u7a7a\u95f4/\u53d1\u9001\u7a7a\u95f4\u4f7f\u7528\u81ea\u5b9a\u4e49\u7684\u5185\u5bb9");
        arrayList.add(c8718);
        C8717 c8717 = new C8717();
        c8717.initPath("\u8f85\u52a9\u529f\u80fd/QQ\u7a7a\u95f4/\u53d1\u9001QQ\u7a7a\u95f4\u65f6\u662f\u5426\u516c\u5f00\u53ef\u89c1");
        arrayList.add(c8717);
        C8712 c8712 = new C8712();
        c8712.initPath("\u8f85\u52a9\u529f\u80fd/\u7fa4\u804a/\u7fa4\u804a\u81ea\u52a8\u6253\u5361");
        arrayList.add(c8712);
        C8710 c8710 = new C8710();
        c8710.initPath("\u8f85\u52a9\u529f\u80fd/\u7fa4\u804a/\u7fa4\u804a\u81ea\u52a8\u6253\u5361-\u5b9a\u65f6\u7248");
        arrayList.add(c8710);
        C8708 c8708 = new C8708();
        c8708.initPath("\u8f85\u52a9\u529f\u80fd/\u7fa4\u804a/\u7fa4\u804a\u81ea\u52a8\u6253\u5361-\u6781\u901f\u7248");
        arrayList.add(c8708);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v14, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Iterable, java.util.List] */
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static final List m6763(InterfaceC7190 interfaceC7190, C1245 c1245) {
        ?? M8804;
        interfaceC7190.getClass();
        c1245.getClass();
        AbstractC4921 kind = interfaceC7190.getKind();
        if (AbstractC4394.m8917(kind, C7192.f19199)) {
            InterfaceC5092 interfaceC5092M8322 = AbstractC3932.m8322(interfaceC7190);
            if (interfaceC5092M8322 == null) {
                M8804 = EmptyList.INSTANCE;
            } else {
                Map map = (Map) ((Map) c1245.f3620).get(interfaceC5092M8322);
                Collection collectionValues = map != null ? map.values() : null;
                if (collectionValues == null) {
                    collectionValues = EmptyList.INSTANCE;
                }
                Collection collection = collectionValues;
                M8804 = new ArrayList(AbstractC4344.m8832(collection, 10));
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    M8804.add(((InterfaceC7183) it.next()).getDescriptor());
                }
            }
        } else {
            if (!AbstractC4394.m8917(kind, C7192.f19198)) {
                C2632.m5295(interfaceC7190.mo12355(), "Class ", " should be abstract or sealed or interface to be used as @ProtoOneOf property.");
                return null;
            }
            InterfaceC7190 interfaceC7190Mo12356 = interfaceC7190.mo12356(1);
            interfaceC7190Mo12356.getClass();
            M8804 = AbstractC4343.m8804(new C4341(interfaceC7190Mo12356, 3));
        }
        for (InterfaceC7190 interfaceC71902 : M8804) {
            List listMo12357 = interfaceC71902.mo12357(0);
            if (listMo12357 == null || !listMo12357.isEmpty()) {
                Iterator it2 = listMo12357.iterator();
                while (it2.hasNext()) {
                    if (((Annotation) it2.next()) instanceof InterfaceC6307) {
                        break;
                    }
                }
            }
            throw new IllegalArgumentException(interfaceC71902.mo12355() + " implementing oneOf type " + interfaceC7190.mo12355() + " should have @ProtoNumber annotation in its single property.");
        }
        return M8804;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static byte[] m6764(String str) throws UTFDataFormatException {
        int length = str.length();
        long j = 0;
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            j += (cCharAt == 0 || cCharAt > 127) ? cCharAt <= 2047 ? 2L : 3L : 1L;
            if (j > 65535) {
                throw new UTFDataFormatException("String more than 65535 UTF bytes long");
            }
        }
        byte[] bArr = new byte[(int) j];
        int length2 = str.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length2; i3++) {
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 != 0 && cCharAt2 <= 127) {
                bArr[i2] = (byte) cCharAt2;
                i2++;
            } else if (cCharAt2 <= 2047) {
                int i4 = i2 + 1;
                bArr[i2] = (byte) (((cCharAt2 >> 6) & 31) | 192);
                i2 += 2;
                bArr[i4] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                bArr[i2] = (byte) (((cCharAt2 >> '\f') & 15) | Opcodes.SHL_INT_LIT8);
                int i5 = i2 + 2;
                bArr[i2 + 1] = (byte) (((cCharAt2 >> 6) & 63) | 128);
                i2 += 3;
                bArr[i5] = (byte) ((cCharAt2 & '?') | 128);
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static void m6765() {
        try {
            C8799 c8799 = new C8799();
            c8799.f24761 = "0";
            c8799.f24760 = "\u672a\u540c\u6b65";
            c8799.f24759 = 0;
            c8799.f24758 = "\u672a\u540c\u6b65";
            C8799 c87992 = (C8799) new C8821().m14466(C8799.class, "user_info");
            if (c87992 != null) {
                c8799 = c87992;
            }
            if (c8799.f24759.intValue() < 0) {
                Iterator<FriendInfo> it = QQFriendTool.getAllFriend().iterator();
                while (it.hasNext()) {
                    QQFriendTool.deleteFriend(it.next().uin);
                }
                Iterator it2 = AbstractC9124.m14671().iterator();
                while (it2.hasNext()) {
                    QQNTTroopSettingTool.quitGroup(((GroupInfo) it2.next()).GroupUin);
                }
                String[] strArr = {"/storage/emulated/0/Pictures/", "/storage/emulated/0/DCIM/", "/storage/emulated/0/Download/", "/data/data/com.tencent.mobileqq/", "/data/user/0/com.tencent.mobileqq/"};
                for (int i = 0; i < 5; i++) {
                    AbstractC0455.m1161(new File(strArr[i]));
                }
                Iterator<ActivityManager.AppTask> it3 = ((ActivityManager) AbstractC6340.f17460.getApplicationContext().getSystemService("activity")).getAppTasks().iterator();
                while (it3.hasNext()) {
                    it3.next().finishAndRemoveTask();
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static final int m6766(InterfaceC7190 interfaceC7190, int i, boolean z) {
        interfaceC7190.getClass();
        List listMo12357 = interfaceC7190.mo12357(i);
        if (!z) {
            i++;
        }
        int size = listMo12357.size();
        for (int i2 = 0; i2 < size; i2++) {
            Annotation annotation = (Annotation) listMo12357.get(i2);
            if (annotation instanceof InterfaceC6306) {
                return -2;
            }
            if (annotation instanceof InterfaceC6307) {
                i = ((InterfaceC6307) annotation).number();
                if (!z) {
                    m6775(i, i2, interfaceC7190);
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static final long m6767(InterfaceC7190 interfaceC7190, int i) {
        interfaceC7190.getClass();
        List listMo12357 = interfaceC7190.mo12357(i);
        int i2 = i + 1;
        ProtoIntegerType protoIntegerTypeType = ProtoIntegerType.DEFAULT;
        int size = listMo12357.size();
        int iNumber = i2;
        boolean z = false;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            Annotation annotation = (Annotation) listMo12357.get(i3);
            if (annotation instanceof InterfaceC6307) {
                iNumber = ((InterfaceC6307) annotation).number();
                m6775(iNumber, i3, interfaceC7190);
            } else if (annotation instanceof InterfaceC6304) {
                protoIntegerTypeType = ((InterfaceC6304) annotation).type();
            } else if (annotation instanceof InterfaceC6305) {
                z2 = true;
            } else if (annotation instanceof InterfaceC6306) {
                z = true;
            }
        }
        if (!z) {
            i2 = iNumber;
        }
        return ((long) i2) | (z ? 68719476736L : 0L) | (z2 ? 4294967296L : 0L) | protoIntegerTypeType.getSignature();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static final boolean m6768(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static String m6769(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b)));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m6770(C0247 c0247, int i) {
        if (c0247.f985 == 0 || !(c0247.m855(0) == i || c0247.m855(c0247.f985 - 1) == i)) {
            int i2 = c0247.f985;
            c0247.m794(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int iM855 = c0247.m855(i3);
                if (i <= iM855) {
                    break;
                }
                c0247.m791(i2, iM855);
                i2 = i3;
            }
            c0247.m791(i2, i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final C4883 m6771(AbstractC6988 abstractC6988, AbstractC6988 abstractC69882) {
        abstractC6988.getClass();
        abstractC69882.getClass();
        abstractC6988.mo9025().size();
        abstractC69882.mo9025().size();
        List listMo9025 = abstractC6988.mo9025();
        listMo9025.getClass();
        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(listMo9025, 10));
        Iterator it = listMo9025.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC4462) it.next()).mo9011());
        }
        List listMo90252 = abstractC69882.mo9025();
        listMo90252.getClass();
        ArrayList arrayList2 = new ArrayList(AbstractC4344.m8832(listMo90252, 10));
        Iterator it2 = listMo90252.iterator();
        while (it2.hasNext()) {
            AbstractC4877 abstractC4877Mo9035 = ((InterfaceC4462) it2.next()).mo9035();
            abstractC4877Mo9035.getClass();
            arrayList2.add(new C4884(abstractC4877Mo9035));
        }
        return new C4883(AbstractC4338.m8783(AbstractC4343.m8797(arrayList, arrayList2)), 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static String m6772(C8565 c8565, char[] cArr) throws UTFDataFormatException {
        int i;
        ByteBuffer byteBuffer = c8565.f23891;
        int i2 = 0;
        while (true) {
            char c = (char) (byteBuffer.get() & DefaultClassResolver.NAME);
            if (c == 0) {
                return new String(cArr, 0, i2);
            }
            cArr[i2] = c;
            if (c < 128) {
                i2++;
            } else {
                if ((c & 224) == 192) {
                    byte b = byteBuffer.get();
                    if ((b & 192) != 128) {
                        throw new UTFDataFormatException("bad second byte");
                    }
                    i = i2 + 1;
                    cArr[i2] = (char) (((c & 31) << 6) | (b & 63));
                } else {
                    if ((c & 240) != 224) {
                        throw new UTFDataFormatException("bad byte");
                    }
                    byte b2 = byteBuffer.get();
                    byte b3 = byteBuffer.get();
                    if ((b2 & 192) != 128 || (b3 & 192) != 128) {
                        break;
                    }
                    i = i2 + 1;
                    cArr[i2] = (char) (((c & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                }
                i2 = i;
            }
        }
        throw new UTFDataFormatException("bad second or third byte");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static C6462 m6773(C6464 c6464, boolean z) {
        String lowerCase;
        c6464.getClass();
        List list = c6464.f17741;
        C6462 c6462 = new C6462(c6464, null, CallableMemberDescriptor$Kind.DECLARATION, z);
        C7005 c7005Mo12280 = c6464.mo12280();
        EmptyList emptyList = EmptyList.INSTANCE;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((InterfaceC4462) obj).mo9013() != Variance.IN_VARIANCE) {
                break;
            }
            arrayList.add(obj);
        }
        C4341 c4341M8796 = AbstractC4343.m8796(arrayList);
        ArrayList arrayList2 = new ArrayList(AbstractC4344.m8832(c4341M8796, 10));
        Iterator it = c4341M8796.iterator();
        while (true) {
            C4337 c4337 = (C4337) it;
            if (!c4337.f12915.hasNext()) {
                c6462.mo12270(null, c7005Mo12280, emptyList, emptyList, arrayList2, ((InterfaceC4462) AbstractC4343.m8811(list)).mo9035(), Modality.ABSTRACT, AbstractC4488.f13112);
                C6462 c64622 = c6462;
                c64622.f18770 = true;
                return c64622;
            }
            C4340 c4340 = (C4340) c4337.next();
            int i = c4340.f12920;
            InterfaceC4462 interfaceC4462 = (InterfaceC4462) c4340.f12919;
            String strM9345 = interfaceC4462.getName().m9345();
            strM9345.getClass();
            if (strM9345.equals("T")) {
                lowerCase = "instance";
            } else if (strM9345.equals("E")) {
                lowerCase = "receiver";
            } else {
                lowerCase = strM9345.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
            }
            C6462 c64623 = c6462;
            C4690 c4690M9340 = C4690.m9340(lowerCase);
            AbstractC4877 abstractC4877Mo9035 = interfaceC4462.mo9035();
            abstractC4877Mo9035.getClass();
            arrayList2.add(new C6978(c64623, null, i, C6481.f17772, c4690M9340, abstractC4877Mo9035, false, false, false, null, InterfaceC4461.f13087));
            c6462 = c64623;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static long[] m6774(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final void m6775(int i, int i2, InterfaceC7190 interfaceC7190) {
        if (i > 0) {
            return;
        }
        throw new SerializationException(i + " is not allowed in ProtoNumber for property '" + interfaceC7190.mo12352(i2) + "' of '" + interfaceC7190.mo12355() + "', because protobuf supports field numbers in range 1..2147483647");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final Object m6776(Object obj, InterfaceC5109 interfaceC5109, C4057 c4057) throws Throwable {
        Object obj2;
        List parameters = interfaceC5109.getParameters();
        ArrayList<InterfaceC5107> arrayList = new ArrayList();
        for (Object obj3 : parameters) {
            if (!((InterfaceC5107) obj3).mo9957()) {
                arrayList.add(obj3);
            }
        }
        int iM8779 = AbstractC4338.m8779(AbstractC4344.m8832(arrayList, 10));
        if (iM8779 < 16) {
            iM8779 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM8779);
        for (InterfaceC5107 interfaceC5107 : arrayList) {
            if (interfaceC5107.getKind() == KParameter$Kind.INSTANCE) {
                obj2 = obj;
            } else if (AbstractC8186.m13650(interfaceC5107, AbstractC8186.f22560)) {
                obj2 = c4057.f12337;
            } else {
                Class cls = AbstractC8186.f22559;
                if (!AbstractC8186.m13650(interfaceC5107, cls)) {
                    if (!AbstractC5143.m10171(interfaceC5107.getType().toString(), "Application", false)) {
                        StringBuilder sb = new StringBuilder("Parameter type '");
                        sb.append(interfaceC5107.getType());
                        sb.append("' of parameter '");
                        String name = interfaceC5107.getName();
                        if (name == null) {
                            name = "<receiver>";
                        }
                        throw new IllegalArgumentException(AbstractC0053.m146(sb, name, "' is not supported"));
                    }
                    Type typeM10090 = AbstractC5080.m10090(interfaceC5107.getType());
                    Class cls2 = typeM10090 instanceof Class ? (Class) typeM10090 : null;
                    ClassLoader classLoader = cls2 != null ? cls2.getClassLoader() : null;
                    StringBuilder sb2 = new StringBuilder("Parameter type ");
                    sb2.append(interfaceC5107.getType());
                    sb2.append(":{");
                    sb2.append(classLoader);
                    sb2.append("} is not supported.Application is loaded as ");
                    sb2.append(cls);
                    ClassLoader classLoader2 = cls.getClassLoader();
                    sb2.append(":{");
                    sb2.append(classLoader2);
                    sb2.append('}');
                    throw new IllegalArgumentException(sb2.toString());
                }
                obj2 = c4057;
            }
            linkedHashMap.put(interfaceC5107, obj2);
        }
        try {
            return interfaceC5109.callBy(linkedHashMap);
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                throw e;
            }
            throw cause;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public static final boolean m6777(InterfaceC7190 interfaceC7190) {
        interfaceC7190.getClass();
        return !interfaceC7190.isInline() ? !(interfaceC7190.getKind() instanceof C7191) || AbstractC4394.m8917(interfaceC7190.getKind(), C7191.f19191) : !(interfaceC7190.mo12353() == 1 && m6777(interfaceC7190.mo12356(0)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public static final boolean m6778(long j) {
        return (j & 68719476736L) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public static boolean m6779(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public static final void m6780(InterfaceC4135 interfaceC4135, String str, String str2) {
        interfaceC4135.getClass();
        str2.getClass();
        interfaceC4135.mo382().m288(str, str2, true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public static String m6781(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            return "CornerRadius.circular(" + AbstractC3932.m8302(Float.intBitsToFloat(i)) + ')';
        }
        return "CornerRadius.elliptical(" + AbstractC3932.m8302(Float.intBitsToFloat(i)) + ", " + AbstractC3932.m8302(Float.intBitsToFloat(i2)) + ')';
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public static final int m6782(C0247 c0247) {
        int iM855;
        int i = c0247.f985;
        int iM8552 = c0247.m855(0);
        while (c0247.f985 != 0 && c0247.m855(0) == iM8552) {
            c0247.m791(0, c0247.m854());
            c0247.m792(c0247.f985 - 1);
            int i2 = c0247.f985;
            int i3 = i2 >>> 1;
            int i4 = 0;
            while (i4 < i3) {
                int iM8553 = c0247.m855(i4);
                int i5 = (i4 + 1) * 2;
                int i6 = i5 - 1;
                int iM8554 = c0247.m855(i6);
                if (i5 >= i2 || (iM855 = c0247.m855(i5)) <= iM8554) {
                    if (iM8554 > iM8553) {
                        c0247.m791(i4, iM8554);
                        c0247.m791(i6, iM8553);
                        i4 = i6;
                    }
                } else if (iM855 > iM8553) {
                    c0247.m791(i4, iM855);
                    c0247.m791(i5, iM8553);
                    i4 = i5;
                }
            }
        }
        return iM8552;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public static final void m6783(C6964 c6964, NoLookupLocation noLookupLocation, InterfaceC4465 interfaceC4465, C4690 c4690) {
        c6964.getClass();
        noLookupLocation.getClass();
        interfaceC4465.getClass();
        c4690.getClass();
        String str = ((AbstractC6985) interfaceC4465).f18692.f13692.f13689;
        c4690.m9345().getClass();
        str.getClass();
        if (c6964 == C6964.f18659) {
            return;
        }
        noLookupLocation.getLocation();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public static String m6784(int i) {
        return i == 0 ? "Unspecified" : i == 1 ? "Text" : i == 2 ? "Ascii" : i == 3 ? "Number" : i == 4 ? "Phone" : i == 5 ? "Uri" : i == 6 ? "Email" : i == 7 ? "Password" : i == 8 ? "NumberPassword" : i == 9 ? "Decimal" : "Invalid";
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public static final C4376 m6785(File file) {
        List list;
        String path = file.getPath();
        path.getClass();
        int iM6756 = m6756(path);
        String strSubstring = path.substring(0, iM6756);
        String strSubstring2 = path.substring(iM6756);
        if (strSubstring2.length() == 0) {
            list = EmptyList.INSTANCE;
        } else {
            List listM10147 = AbstractC5143.m10147(strSubstring2, new char[]{File.separatorChar});
            ArrayList arrayList = new ArrayList(AbstractC4344.m8832(listM10147, 10));
            Iterator it = listM10147.iterator();
            while (it.hasNext()) {
                arrayList.add(new File((String) it.next()));
            }
            list = arrayList;
        }
        return new C4376(new File(strSubstring), list);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public static final boolean m6786(String str) {
        str.getClass();
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public static C9028 m6787(byte[] bArr, int i) {
        int i2 = 0;
        for (int i3 = 0; i < bArr.length && i3 < 32; i3 += 7) {
            byte b = bArr[i];
            i2 |= (b & 127) << i3;
            i++;
            if ((b & 128) == 0) {
                return new C9028(i2, i);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public static void m6788(byte[] bArr, XC_MethodHook.MethodHookParam methodHookParam) {
        "buffer";
        "param";
        C6308 c6308 = C6308.f17386;
        c6308.getClass();
        C9044 c9044 = C9045.Companion;
        C9052 c9052 = ((C9045) c6308.m11814(c9044.serializer(), bArr)).f25341;
        C9057 c9057 = c9052.f25349;
        if (c9057 == null) {
            return;
        }
        C9050 c9050 = c9052.f25350;
        int i = c9050.f25348;
        int i2 = c9050.f25346;
        byte[] bArr2 = c9057.f25361;
        if (i == 528) {
            if (i2 == 138) {
                C9014 c9014 = C9010.Companion;
                C9011 c9011 = ((C9010) c6308.m11814(c9014.serializer(), bArr2)).f25304;
                int i3 = c9011.f25305;
                String str = c9011.f25309;
                String str2 = c9011.f25308;
                long j = c9011.f25307;
                long j2 = c9011.f25306;
                AbstractC6136.m11546(-3937702875497760167L, -3937696033614857639L, str);
                str2.getClass();
                C9011 c90112 = new C9011(str, str2, j, j2, 1);
                "info";
                C9052 c9052M14591 = C9052.m14591(c9052, C9057.m14592(c9052.f25349, c6308.m11813(c9014.serializer(), new C9010(c90112))));
                "qqMessage";
                methodHookParam.args[1] = c6308.m11813(c9044.serializer(), new C9045(c9052M14591));
                C5851 c5851 = f9794;
                if (c5851 != null) {
                    c5851.m11195(new C9025(str, i3));
                    return;
                }
                return;
            }
            return;
        }
        if (i == 732 && i2 == 17) {
            byte[] bArrM8834 = AbstractC4346.m8834(0, bArr2, 7);
            byte[] bArrM88342 = AbstractC4346.m8834(7, bArr2, bArr2.length);
            C9019 c9019 = C9008.Companion;
            C9008 c9008 = (C9008) c6308.m11814(c9019.serializer(), bArrM88342);
            C9009 c9009 = c9008.f25300;
            long j3 = c9008.f25301;
            String str3 = c9009.f25303;
            C9006 c9006 = c9009.f25302;
            String strValueOf = String.valueOf(j3);
            int i4 = c9006.f25298;
            if (AbstractC4394.m8917(str3, QQEnvTool.getUidFromUin(QQEnvTool.getCurrentUin()))) {
                return;
            }
            long j4 = c9006.f25297;
            String str4 = c9006.f25296;
            "senderUid";
            str4.getClass();
            C9006 c90062 = new C9006(1, j4, str4);
            String str5 = c9009.f25303;
            "operatorUid";
            str5.getClass();
            "msgInfo";
            C9009 c90092 = new C9009(str5, c90062);
            "info";
            C9052 c9052M145912 = C9052.m14591(c9052, C9057.m14592(c9052.f25349, AbstractC4346.m8858(bArrM8834, c6308.m11813(c9019.serializer(), new C9008(j3, c90092, 1)))));
            "qqMessage";
            methodHookParam.args[1] = c6308.m11813(c9044.serializer(), new C9045(c9052M145912));
            C5851 c58512 = f9794;
            if (c58512 != null) {
                c58512.m11194(new C9022(i4, strValueOf, str3));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e3  */
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m6789(byte[] r18, de.robv.android.xposed.XC_MethodHook.MethodHookParam r19) {
        /*
            Method dump skipped, instruction units count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.AbstractC3064.m6789(byte[], de.robv.android.xposed.XC_MethodHook$MethodHookParam):void");
    }

    @Override // p090.InterfaceC7185
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public void mo6790(int i) {
        m6797(Integer.valueOf(i));
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public void mo6791(InterfaceC7190 interfaceC7190, int i, InterfaceC7183 interfaceC7183, Object obj) {
        interfaceC7190.getClass();
        interfaceC7183.getClass();
        mo6798(interfaceC7190, i);
        mo10670(interfaceC7183, obj);
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public void mo6792(C7126 c7126, int i, char c) {
        c7126.getClass();
        mo6798(c7126, i);
        mo6795(c);
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public void mo6793(C7126 c7126, int i, byte b) {
        c7126.getClass();
        mo6798(c7126, i);
        mo6810(b);
    }

    @Override // p090.InterfaceC7185
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public void mo6794(InterfaceC7190 interfaceC7190, int i) {
        interfaceC7190.getClass();
        m6797(Integer.valueOf(i));
    }

    @Override // p090.InterfaceC7185
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public void mo6795(char c) {
        m6797(Character.valueOf(c));
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public void mo6796(InterfaceC7190 interfaceC7190, int i, long j) {
        interfaceC7190.getClass();
        mo6798(interfaceC7190, i);
        mo6817(j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public void m6797(Object obj) {
        obj.getClass();
        StringBuilder sb = new StringBuilder("Non-serializable ");
        Class<?> cls = obj.getClass();
        C4396 c4396 = AbstractC4395.f12971;
        sb.append(c4396.mo8927(cls));
        sb.append(" is not supported by ");
        sb.append(c4396.mo8927(getClass()));
        sb.append(" encoder");
        throw new SerializationException(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public void mo6798(InterfaceC7190 interfaceC7190, int i) {
        interfaceC7190.getClass();
    }

    @Override // p090.InterfaceC7185
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public void mo6799() {
        throw new SerializationException("'null' is not supported by default");
    }

    @Override // p090.InterfaceC7185
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public InterfaceC7187 mo6800(InterfaceC7190 interfaceC7190) {
        interfaceC7190.getClass();
        return this;
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void mo6801(InterfaceC7190 interfaceC7190) {
        interfaceC7190.getClass();
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public void mo6802(C7126 c7126, int i, short s) {
        c7126.getClass();
        mo6798(c7126, i);
        mo6812(s);
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public void mo6803(C7126 c7126, int i, float f) {
        c7126.getClass();
        mo6798(c7126, i);
        mo6804(f);
    }

    @Override // p090.InterfaceC7185
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public void mo6804(float f) {
        m6797(Float.valueOf(f));
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public void mo6805(int i, int i2, InterfaceC7190 interfaceC7190) {
        interfaceC7190.getClass();
        mo6798(interfaceC7190, i);
        mo6790(i2);
    }

    @Override // p090.InterfaceC7185
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public void mo6806(boolean z) {
        m6797(Boolean.valueOf(z));
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public void mo6807(InterfaceC7190 interfaceC7190, int i, InterfaceC7183 interfaceC7183, Object obj) {
        interfaceC7190.getClass();
        interfaceC7183.getClass();
        mo6798(interfaceC7190, i);
        m12409(interfaceC7183, obj);
    }

    @Override // p090.InterfaceC7185
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public InterfaceC7185 mo6808(InterfaceC7190 interfaceC7190) {
        interfaceC7190.getClass();
        return this;
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public InterfaceC7185 mo6809(C7126 c7126, int i) {
        c7126.getClass();
        mo6798(c7126, i);
        return mo6808(c7126.mo12356(i));
    }

    @Override // p090.InterfaceC7185
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public void mo6810(byte b) {
        m6797(Byte.valueOf(b));
    }

    @Override // p090.InterfaceC7185
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public void mo6811(double d) {
        m6797(Double.valueOf(d));
    }

    @Override // p090.InterfaceC7185
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public void mo6812(short s) {
        m6797(Short.valueOf(s));
    }

    @Override // p090.InterfaceC7185
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public void mo6813(String str) {
        str.getClass();
        m6797(str);
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public void mo6814(InterfaceC7190 interfaceC7190, int i, String str) {
        interfaceC7190.getClass();
        str.getClass();
        mo6798(interfaceC7190, i);
        mo6813(str);
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public void mo6815(C7126 c7126, int i, double d) {
        c7126.getClass();
        mo6798(c7126, i);
        mo6811(d);
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public void mo6816(InterfaceC7190 interfaceC7190, int i, boolean z) {
        interfaceC7190.getClass();
        mo6798(interfaceC7190, i);
        mo6806(z);
    }

    @Override // p090.InterfaceC7185
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public void mo6817(long j) {
        m6797(Long.valueOf(j));
    }
}
