package p009a9;

import java.lang.reflect.Constructor;
import java.util.Comparator;
import java.util.Locale;
import java.util.Map;
import p007a7.AbstractC0018a;
import p050da.C0759e;
import p051db.C0765c;
import p065eb.C0853a0;
import p065eb.C0859c0;
import p099h.Hchat.hooks.api.model.WeChatSnsPost;
import p109hb.C1697t;
import p115hh.C1724i;
import p115hh.C1727l;
import p115hh.C1730o;
import p136j8.AbstractC2091b;
import p230p8.C3357i;
import p255r4.C3659a;
import p276sf.C3958e;
import p276sf.C3963j;
import p332wb.C5026jv;

/* JADX INFO: renamed from: a9.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0031h implements Comparator {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f100g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [b9.e.b(de.robv.android.xposed.XC_MethodHook$MethodHookParam):void, ba.f.afterHookedMethod(de.robv.android.xposed.XC_MethodHook$MethodHookParam):void, be.h.J(boolean):java.util.List, c9.c2.beforeHookedMethod(de.robv.android.xposed.XC_MethodHook$MethodHookParam):void, db.g.e(java.util.ArrayList):void, db.g.f():java.util.List, g8.l.c(java.lang.String, java.lang.String, int, int):boolean, h.Hchat.hooks.items.script.ScriptPluginRuntime.dispatchOnClickSendBtn(java.lang.String):eb.d0, h.Hchat.hooks.items.script.ScriptPluginRuntime.dispatchOnHandleMsg(h.Hchat.hooks.items.script.ScriptMessageBean):void, h.Hchat.hooks.items.script.ScriptPluginRuntime.dispatchOnImageDownload$lambda$2(h.Hchat.hooks.items.script.ScriptPluginBridge, h.Hchat.hooks.items.script.ScriptMessageBean, java.lang.Object):void, h.Hchat.hooks.items.script.ScriptPluginRuntime.dispatchOnMemberChange(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void, h.Hchat.hooks.items.script.ScriptPluginRuntime.dispatchOnNewFriend(java.lang.String, java.lang.String, int):void, h.Hchat.hooks.items.script.ScriptPluginRuntime.dispatchOnProtobufPacket$lambda$1(h.Hchat.hooks.items.protobuf.ProtobufPacketRuntime$Packet):void, h.Hchat.hooks.items.script.ScriptPluginRuntime.listPlugins(android.content.Context):java.util.List<eb.c0>, h.Hchat.hooks.items.script.ScriptWaBridge.getSnsPostList(int):java.util.List<h.Hchat.hooks.api.model.WeChatSnsPost>, h.Hchat.hooks.items.script.ScriptWaBridge.getSnsPostList(java.lang.String, int):java.util.List<h.Hchat.hooks.api.model.WeChatSnsPost>, hb.r.d(java.lang.String, q9.d):java.lang.String, j6.n.<clinit>():void, n8.c.f(java.lang.String, n8.a):boolean, org.luckypray.dexkit.DexKitBridge.batchFindClassUsingStrings$dexkit_android_release(g6.b):java.util.Map<java.lang.String, hh.j>, org.luckypray.dexkit.DexKitBridge.batchFindMethodUsingStrings$dexkit_android_release(g6.b):java.util.Map<java.lang.String, hh.p>, org.luckypray.dexkit.DexKitBridge.findClass$dexkit_android_release(g6.b):hh.j, org.luckypray.dexkit.DexKitBridge.findClass(ch.c):hh.j, org.luckypray.dexkit.DexKitBridge.findField$dexkit_android_release(g6.b):hh.m, org.luckypray.dexkit.DexKitBridge.findField(ch.d):hh.m, org.luckypray.dexkit.DexKitBridge.findMethod$dexkit_android_release(g6.b):hh.p, org.luckypray.dexkit.DexKitBridge.findMethod(ch.e):hh.p, r4.a.<clinit>():void] */
    public /* synthetic */ C0031h(int i9) {
        this.f100g = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f100g) {
            case 0:
                return AbstractC0018a.m249m((Integer) ((C3958e) obj2).f12961g, (Integer) ((C3958e) obj).f12961g);
            case 1:
                return AbstractC0018a.m249m(((C1724i) obj).f5724j, ((C1724i) obj2).f5724j);
            case 2:
                return AbstractC0018a.m249m(((C1730o) obj).f5750j, ((C1730o) obj2).f5750j);
            case 3:
                return AbstractC0018a.m249m(((C1724i) obj).f5724j, ((C1724i) obj2).f5724j);
            case 4:
                return AbstractC0018a.m249m(((C1727l) obj).f5741j, ((C1727l) obj2).f5741j);
            case 5:
                return AbstractC0018a.m249m(((C1730o) obj).f5750j, ((C1730o) obj2).f5750j);
            case 6:
                return Long.valueOf(((C1697t) obj).f5651f).compareTo(Long.valueOf(((C1697t) obj2).f5651f));
            case 7:
                return Integer.valueOf(((C0759e) obj).f2268b.f2266b).compareTo(Integer.valueOf(((C0759e) obj2).f2268b.f2266b));
            case 8:
                return AbstractC0018a.m249m((Comparable) ((Map.Entry) obj).getValue(), (Comparable) ((Map.Entry) obj2).getValue());
            case 9:
                return Long.valueOf(((C0765c) obj).f2294g).compareTo(Long.valueOf(((C0765c) obj2).f2294g));
            case 10:
                return Long.valueOf(((C0765c) obj).f2294g).compareTo(Long.valueOf(((C0765c) obj2).f2294g));
            case 11:
                String str = ((C0853a0) obj).f2606a.f2626a;
                Locale locale = Locale.US;
                String strM5165l = AbstractC2091b.m5165l(locale, str, locale);
                String lowerCase = ((C0853a0) obj2).f2606a.f2626a.toLowerCase(locale);
                lowerCase.getClass();
                return strM5165l.compareTo(lowerCase);
            case 12:
                String str2 = ((C0853a0) obj).f2606a.f2626a;
                Locale locale2 = Locale.US;
                String strM5165l2 = AbstractC2091b.m5165l(locale2, str2, locale2);
                String lowerCase2 = ((C0853a0) obj2).f2606a.f2626a.toLowerCase(locale2);
                lowerCase2.getClass();
                return strM5165l2.compareTo(lowerCase2);
            case 13:
                String str3 = ((C0853a0) obj).f2606a.f2626a;
                Locale locale3 = Locale.US;
                String strM5165l3 = AbstractC2091b.m5165l(locale3, str3, locale3);
                String lowerCase3 = ((C0853a0) obj2).f2606a.f2626a.toLowerCase(locale3);
                lowerCase3.getClass();
                return strM5165l3.compareTo(lowerCase3);
            case 14:
                String str4 = ((C0853a0) obj).f2606a.f2626a;
                Locale locale4 = Locale.US;
                String strM5165l4 = AbstractC2091b.m5165l(locale4, str4, locale4);
                String lowerCase4 = ((C0853a0) obj2).f2606a.f2626a.toLowerCase(locale4);
                lowerCase4.getClass();
                return strM5165l4.compareTo(lowerCase4);
            case 15:
                String str5 = ((C0853a0) obj).f2606a.f2626a;
                Locale locale5 = Locale.US;
                String strM5165l5 = AbstractC2091b.m5165l(locale5, str5, locale5);
                String lowerCase5 = ((C0853a0) obj2).f2606a.f2626a.toLowerCase(locale5);
                lowerCase5.getClass();
                return strM5165l5.compareTo(lowerCase5);
            case 16:
                String str6 = ((C0853a0) obj).f2606a.f2626a;
                Locale locale6 = Locale.US;
                String strM5165l6 = AbstractC2091b.m5165l(locale6, str6, locale6);
                String lowerCase6 = ((C0853a0) obj2).f2606a.f2626a.toLowerCase(locale6);
                lowerCase6.getClass();
                return strM5165l6.compareTo(lowerCase6);
            case 17:
                String str7 = ((C0859c0) obj).f2626a;
                Locale locale7 = Locale.US;
                String strM5165l7 = AbstractC2091b.m5165l(locale7, str7, locale7);
                String lowerCase7 = ((C0859c0) obj2).f2626a.toLowerCase(locale7);
                lowerCase7.getClass();
                return strM5165l7.compareTo(lowerCase7);
            case 18:
                return Integer.valueOf(((Constructor) obj2).getParameterTypes().length).compareTo(Integer.valueOf(((Constructor) obj).getParameterTypes().length));
            case 19:
                return Long.valueOf(((C1697t) obj).f5651f).compareTo(Long.valueOf(((C1697t) obj2).f5651f));
            case 20:
                String str8 = ((C5026jv) obj).f18250b;
                Locale locale8 = Locale.CHINA;
                String strM5165l8 = AbstractC2091b.m5165l(locale8, str8, locale8);
                String str9 = ((C5026jv) obj2).f18250b;
                locale8.getClass();
                String lowerCase8 = str9.toLowerCase(locale8);
                lowerCase8.getClass();
                return strM5165l8.compareTo(lowerCase8);
            case 21:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 22:
                return AbstractC0018a.m249m((Integer) ((C3963j) obj2).f12973i, (Integer) ((C3963j) obj).f12973i);
            case 23:
                return Integer.valueOf(((Constructor) obj2).getParameterTypes().length).compareTo(Integer.valueOf(((Constructor) obj).getParameterTypes().length));
            case 24:
                return Integer.valueOf(((C3357i) obj).f10827d).compareTo(Integer.valueOf(((C3357i) obj2).f10827d));
            case 25:
                return Long.valueOf(((WeChatSnsPost) obj2).getCreateTimeSeconds()).compareTo(Long.valueOf(((WeChatSnsPost) obj).getCreateTimeSeconds()));
            case 26:
                return Long.valueOf(((WeChatSnsPost) obj2).getCreateTimeSeconds()).compareTo(Long.valueOf(((WeChatSnsPost) obj).getCreateTimeSeconds()));
            case 27:
                return Integer.valueOf(((String) obj2).length()).compareTo(Integer.valueOf(((String) obj).length()));
            case 28:
                return AbstractC0018a.m249m((Integer) ((C3963j) obj2).f12973i, (Integer) ((C3963j) obj).f12973i);
            default:
                int iM7709e = ((C3659a) obj).f11870l.m7709e();
                int iM7709e2 = ((C3659a) obj2).f11870l.m7709e();
                if (iM7709e < iM7709e2) {
                    return -1;
                }
                return iM7709e > iM7709e2 ? 1 : 0;
        }
    }
}
