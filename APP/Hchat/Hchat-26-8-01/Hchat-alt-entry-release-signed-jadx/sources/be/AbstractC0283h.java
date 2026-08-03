package be;

import ac.AbstractC0063p;
import ac.C0048a;
import ac.C0050c;
import ac.C0051d;
import ac.C0052e;
import ac.C0053f;
import ac.C0054g;
import ac.C0055h;
import ac.C0056i;
import ac.C0058k;
import ac.C0065r;
import ac.C0066s;
import ac.SharedPreferencesC0062o;
import af.C0084g;
import android.content.ContentValues;
import android.content.Context;
import android.util.Log;
import bsh.org.objectweb.asm.Opcodes;
import ca.C0532s;
import com.alibaba.fastjson2.JSONB;
import gg.AbstractC1416l;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UTFDataFormatException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import md.C2825b;
import na.C2913a;
import na.C2922j;
import okhttp3.HttpUrl;
import okio.C3193a;
import org.luckypray.dexkit.DexKitBridge;
import p000a.AbstractC0000a;
import p007a7.AbstractC0018a;
import p009a9.C0031h;
import p014b.C0126e;
import p015b0.C0151q;
import p021b6.C0193a;
import p021b6.C0194b;
import p021b6.C0195c;
import p021b6.C0196d;
import p021b6.C0197e;
import p021b6.C0198f;
import p021b6.C0199g;
import p021b6.C0201i;
import p025bc.AbstractC0255e;
import p036c9.C0415a0;
import p036c9.C0505z;
import p037cb.C0545f;
import p057e1.C0808c;
import p057e1.C0809d;
import p061e5.C0826a;
import p065eb.C0868g;
import p068eh.AbstractC0921a;
import p074f5.EnumC1065a;
import p074f5.EnumC1067c;
import p077f8.AbstractC1089i;
import p078f9.C1095f;
import p078f9.C1097h;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1235p;
import p088g0.C1258b;
import p092g4.AbstractC1341a;
import p094g6.AbstractC1355c;
import p096g8.C1360a;
import p096g8.C1368i;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.ContactLabelBean;
import p099h.Hchat.hooks.api.model.WeChatContact;
import p099h.Hchat.hooks.api.model.WeChatMessage;
import p099h.Hchat.hooks.api.runtime.WeChatDatabaseApi;
import p099h.Hchat.utils.KavaReflector;
import p100h0.C1543p0;
import p106h8.C1624a;
import p115hh.C1718c;
import p115hh.C1719d;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.C1876r1;
import p117i0.InterfaceC1807a;
import p119i2.AbstractC1923e0;
import p119i2.C1941n0;
import p136j8.AbstractC2091b;
import p136j8.C2104o;
import p143jh.C2137a;
import p143jh.C2138b;
import p143jh.C2139c;
import p143jh.C2140d;
import p143jh.C2141e;
import p143jh.C2142f;
import p143jh.C2143g;
import p143jh.C2144h;
import p143jh.C2145i;
import p143jh.C2146j;
import p143jh.C2147k;
import p143jh.C2148l;
import p143jh.C2149m;
import p143jh.C2150n;
import p143jh.C2151o;
import p143jh.C2152p;
import p150k5.C2272w;
import p153k8.C2339c;
import p153k8.C2355s;
import p159l0.C2429k;
import p162l3.C2458l;
import p162l3.C2469w;
import p167l8.C2527b;
import p172lg.C2564d;
import p177m2.InterfaceC2760d;
import p178m3.C2776b;
import p199nd.AbstractC2963b0;
import p207o5.AbstractC3050e;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p218og.C3145i;
import p218og.C3147k;
import p218og.EnumC3148l;
import p222p.AbstractC3199a;
import p259r9.AbstractC3754e0;
import p266s0.C3874d;
import p266s0.C3878h;
import p276sf.C3958e;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3961h;
import p276sf.C3962i;
import p276sf.C3966m;
import p276sf.C3968o;
import p276sf.EnumC3957d;
import p276sf.InterfaceC3956c;
import p281t3.AbstractC4106c;
import p293u2.C4234d;
import p293u2.C4235e;
import p293u2.C4244n;
import p293u2.EnumC4243m;
import p293u2.InterfaceC4233c;
import p300ub.AbstractC4302b;
import p302ud.C4309e;
import p302ud.C4322r;
import p308v1.InterfaceC4412n0;
import p309v2.AbstractC4443b;
import p309v2.InterfaceC4442a;
import p327w5.InterfaceC4686a;
import p332wb.AbstractC4855en;
import p332wb.C5026jv;
import p339x1.C5601f;
import p339x1.C5660y;
import p339x1.InterfaceC5605g;
import p351xe.C5787h;
import p356y0.AbstractC5839a;
import p356y0.InterfaceC5853o;
import p379z7.C6107c;
import p379z7.C6113i;
import tf.AbstractC4156d0;
import tf.AbstractC4165l;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.AbstractC4178y;
import tf.C4173t;

/* JADX INFO: renamed from: be.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0283h {

    /* JADX INFO: renamed from: a */
    public static volatile C0545f f824a;

    /* JADX INFO: renamed from: b */
    public static volatile String f825b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static String m1121A(int i9, int i10, int i11) {
        StringBuilder sb2 = new StringBuilder(80);
        int i12 = (~i10) & i9;
        int i13 = i9 & i10;
        if ((i13 & 1) != 0) {
            sb2.append("|public");
        }
        if ((i13 & 2) != 0) {
            sb2.append("|private");
        }
        if ((i13 & 4) != 0) {
            sb2.append("|protected");
        }
        if ((i13 & 8) != 0) {
            sb2.append("|static");
        }
        if ((i13 & 16) != 0) {
            sb2.append("|final");
        }
        if ((i13 & 32) != 0) {
            if (i11 == 1) {
                sb2.append("|super");
            } else {
                sb2.append("|synchronized");
            }
        }
        if ((i13 & 64) != 0) {
            if (i11 == 3) {
                sb2.append("|bridge");
            } else {
                sb2.append("|volatile");
            }
        }
        if ((i13 & 128) != 0) {
            if (i11 == 3) {
                sb2.append("|varargs");
            } else {
                sb2.append("|transient");
            }
        }
        if ((i13 & Opcodes.ACC_NATIVE) != 0) {
            sb2.append("|native");
        }
        if ((i13 & Opcodes.ACC_INTERFACE) != 0) {
            sb2.append("|interface");
        }
        if ((i13 & 1024) != 0) {
            sb2.append("|abstract");
        }
        if ((i13 & Opcodes.ACC_STRICT) != 0) {
            sb2.append("|strictfp");
        }
        if ((i13 & 4096) != 0) {
            sb2.append("|synthetic");
        }
        if ((i13 & 8192) != 0) {
            sb2.append("|annotation");
        }
        if ((i13 & 16384) != 0) {
            sb2.append("|enum");
        }
        if ((65536 & i13) != 0) {
            sb2.append("|constructor");
        }
        if ((i13 & Opcodes.ACC_DEPRECATED) != 0) {
            sb2.append("|declared_synchronized");
        }
        if (i12 != 0 || sb2.length() == 0) {
            sb2.append('|');
            sb2.append(AbstractC0000a.m46X0(i12));
        }
        return sb2.substring(1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static final int m1122B(int i9, int i10) {
        return (i9 >> i10) & 31;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static boolean m1123C(WeChatMessage weChatMessage) {
        return weChatMessage.isText() || weChatMessage.isQuote() || weChatMessage.isTransfer();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public static final boolean m1124D(C0809d c0809d) {
        long j3 = c0809d.f2424e;
        return (j3 >>> 32) == (4294967295L & j3) && j3 == c0809d.f2425f && j3 == c0809d.f2426g && j3 == c0809d.f2427h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public static boolean m1125E(List list, Comparable comparable) {
        if (list == null || list.size() != 1) {
            return false;
        }
        return Objects.equals(list.get(0), comparable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public static Object m1126F(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public static InterfaceC3956c m1127G(EnumC3957d enumC3957d, InterfaceC1220a interfaceC1220a) {
        C3966m c3966m = C3966m.f12975a;
        int iOrdinal = enumC3957d.ordinal();
        if (iOrdinal == 0) {
            return new C3962i(interfaceC1220a);
        }
        if (iOrdinal == 1) {
            C3961h c3961h = new C3961h();
            c3961h.f12966g = interfaceC1220a;
            c3961h.f12967h = c3966m;
            return c3961h;
        }
        if (iOrdinal != 2) {
            C3193a.m6822k();
            return null;
        }
        C3968o c3968o = new C3968o();
        c3968o.f12977g = interfaceC1220a;
        c3968o.f12978h = c3966m;
        return c3968o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public static C3962i m1128H(InterfaceC1220a interfaceC1220a) {
        interfaceC1220a.getClass();
        return new C3962i(interfaceC1220a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    /* JADX INFO: renamed from: I */
    public static na.C2913a m1129I(p162l3.C2458l r49) {
        /*
            r0 = r49
            java.lang.String r1 = "hb_reply_group_items_v1"
            r0.getClass()
            java.lang.String r2 = "hb_reply_enable"
            r3 = 0
            android.content.SharedPreferences r4 = r0.m5853b()     // Catch: java.lang.Throwable -> L13
            boolean r2 = r4.getBoolean(r2, r3)     // Catch: java.lang.Throwable -> L13
            goto L14
        L13:
            r2 = r3
        L14:
            r4 = 1
            if (r2 == 0) goto L24
            java.lang.String r5 = "hb_reply_type"
            android.content.SharedPreferences r6 = r0.m5853b()     // Catch: java.lang.Throwable -> L22
            int r5 = r6.getInt(r5, r4)     // Catch: java.lang.Throwable -> L22
            goto L25
        L22:
            r5 = r4
            goto L25
        L24:
            r5 = r3
        L25:
            java.lang.String r6 = "hb_reply_custom_enable"
            android.content.SharedPreferences r7 = r0.m5853b()     // Catch: java.lang.Throwable -> L30
            boolean r6 = r7.getBoolean(r6, r3)     // Catch: java.lang.Throwable -> L30
            goto L31
        L30:
            r6 = r3
        L31:
            r7 = 1000(0x3e8, double:4.94E-321)
            if (r6 == 0) goto L57
            java.lang.String r6 = "hb_reply_delay_value"
            android.content.SharedPreferences r11 = r0.m5853b()     // Catch: java.lang.Throwable -> L40
            int r6 = r11.getInt(r6, r4)     // Catch: java.lang.Throwable -> L40
            goto L41
        L40:
            r6 = r4
        L41:
            if (r6 >= 0) goto L44
            r6 = r3
        L44:
            java.lang.String r11 = "hb_reply_delay_unit"
            android.content.SharedPreferences r12 = r0.m5853b()     // Catch: java.lang.Throwable -> L4f
            int r11 = r12.getInt(r11, r4)     // Catch: java.lang.Throwable -> L4f
            goto L50
        L4f:
            r11 = r4
        L50:
            if (r11 != r4) goto L55
            long r11 = (long) r6
            long r11 = r11 * r7
            goto L59
        L55:
            long r11 = (long) r6
            goto L59
        L57:
            r11 = 0
        L59:
            r6 = 2
            java.lang.String r13 = ""
            if (r5 == r4) goto L68
            if (r5 != r6) goto L61
            goto L68
        L61:
            java.lang.String r14 = "hb_reply_media_paths"
            java.lang.String r14 = r0.m5855d(r14, r13)
            goto L76
        L68:
            java.lang.String r14 = "hb_reply_text"
            java.lang.String r15 = "谢谢老板"
            java.lang.String r14 = r0.m5855d(r14, r15)
            java.lang.String r15 = "hb_reply_templates"
            java.lang.String r14 = r0.m5855d(r15, r14)
        L76:
            java.lang.String r15 = "hb_reply_items_v1"
            java.lang.String r15 = r0.m5855d(r15, r13)
            java.lang.String r6 = "hb_reply_random"
            if (r2 == 0) goto L8d
            boolean r17 = p218og.AbstractC3149m.m6721t0(r15)
            if (r17 != 0) goto L8d
            java.util.List r2 = p007a7.AbstractC0018a.m222J(r15)
        L8a:
            r31 = r2
            goto La1
        L8d:
            if (r2 == 0) goto L9e
            android.content.SharedPreferences r2 = r0.m5853b()     // Catch: java.lang.Throwable -> L98
            boolean r2 = r2.getBoolean(r6, r3)     // Catch: java.lang.Throwable -> L98
            goto L99
        L98:
            r2 = r3
        L99:
            java.util.List r2 = p007a7.AbstractC0018a.m216B(r5, r11, r14, r2)
            goto L8a
        L9e:
            tf.t r2 = tf.C4173t.f13710g
            goto L8a
        La1:
            android.content.SharedPreferences r2 = r0.m5853b()     // Catch: java.lang.Throwable -> Lad
            boolean r2 = r2.contains(r1)     // Catch: java.lang.Throwable -> Lad
            if (r2 != r4) goto Lad
            r2 = r4
            goto Lae
        Lad:
            r2 = r3
        Lae:
            if (r2 == 0) goto Lbb
            java.lang.String r1 = r0.m5855d(r1, r13)
            java.util.List r1 = p007a7.AbstractC0018a.m222J(r1)
            r32 = r1
            goto Lbd
        Lbb:
            r32 = r31
        Lbd:
            na.a r1 = new na.a
            r17 = r7
            boolean r8 = r0.m5856e()
            java.lang.String r2 = "hb_grab_mode"
            android.content.SharedPreferences r7 = r0.m5853b()     // Catch: java.lang.Throwable -> Ld0
            int r2 = r7.getInt(r2, r4)     // Catch: java.lang.Throwable -> Ld0
            goto Ld1
        Ld0:
            r2 = r4
        Ld1:
            java.lang.String r7 = "hb_auto_delay_mode"
            java.lang.String r15 = "hb_auto_delay_value"
            r19 = 0
            int r9 = r0.m5854c(r15, r3)
            java.lang.String r10 = "hb_auto_delay_unit"
            r21 = r1
            int r1 = r0.m5854c(r10, r3)
            r26 = r5
            if (r1 != r4) goto Leb
            long r4 = (long) r9
            long r4 = r4 * r17
            goto Lec
        Leb:
            long r4 = (long) r9
        Lec:
            int r4 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r4 <= 0) goto Lf2
            r4 = 2
            goto Lf3
        Lf2:
            r4 = r3
        Lf3:
            android.content.SharedPreferences r5 = r0.m5853b()     // Catch: java.lang.Throwable -> Lfb
            int r4 = r5.getInt(r7, r4)     // Catch: java.lang.Throwable -> Lfb
        Lfb:
            int r5 = r0.m5854c(r15, r3)
            int r7 = r0.m5854c(r10, r3)
            r1 = 1
            long r9 = (long) r5
            if (r7 != r1) goto L109
            long r9 = r9 * r17
        L109:
            java.lang.String r1 = "hb_auto_delay_random_min"
            android.content.SharedPreferences r5 = r0.m5853b()     // Catch: java.lang.Throwable -> L114
            int r1 = r5.getInt(r1, r3)     // Catch: java.lang.Throwable -> L114
            goto L115
        L114:
            r1 = r3
        L115:
            if (r1 >= 0) goto L118
            r1 = r3
        L118:
            r7 = r4
            long r3 = (long) r1
            java.lang.String r1 = "hb_auto_delay_random_max"
            android.content.SharedPreferences r15 = r0.m5853b()     // Catch: java.lang.Throwable -> L126
            r5 = 0
            int r1 = r15.getInt(r1, r5)     // Catch: java.lang.Throwable -> L126
            goto L127
        L126:
            r1 = 0
        L127:
            if (r1 >= 0) goto L12a
            r1 = 0
        L12a:
            r15 = r6
            long r5 = (long) r1
            java.lang.String r1 = "hb_skip_self"
            r17 = r2
            android.content.SharedPreferences r2 = r0.m5853b()     // Catch: java.lang.Throwable -> L143
            r18 = r3
            r3 = 0
            boolean r1 = r2.getBoolean(r1, r3)     // Catch: java.lang.Throwable -> L146
            r28 = r11
            r11 = r9
            r9 = r17
            r17 = r1
            goto L14d
        L143:
            r18 = r3
            r3 = 0
        L146:
            r28 = r11
            r11 = r9
            r9 = r17
            r17 = r3
        L14d:
            java.lang.String r1 = "hb_auto_mode"
            android.content.SharedPreferences r2 = r0.m5853b()     // Catch: java.lang.Throwable -> L15e
            int r1 = r2.getInt(r1, r3)     // Catch: java.lang.Throwable -> L15e
            r47 = r18
            r18 = r1
            r1 = r47
            goto L162
        L15e:
            r1 = r18
            r18 = 0
        L162:
            java.lang.String r3 = "hb_auto_whitelist"
            java.lang.String r19 = r0.m5855d(r3, r13)
            java.lang.String r3 = "hb_auto_blacklist"
            java.lang.String r20 = r0.m5855d(r3, r13)
            java.lang.String r3 = "hb_kw_mode"
            android.content.SharedPreferences r4 = r0.m5853b()     // Catch: java.lang.Throwable -> L182
            r10 = 0
            int r3 = r4.getInt(r3, r10)     // Catch: java.lang.Throwable -> L183
            r47 = r21
            r21 = r3
            r3 = r15
            r15 = r5
            r6 = r47
            goto L189
        L182:
            r10 = 0
        L183:
            r3 = r15
            r15 = r5
            r6 = r21
            r21 = r10
        L189:
            java.lang.String r4 = "hb_keywords"
            java.lang.String r22 = r0.m5855d(r4, r13)
            android.content.SharedPreferences r4 = r0.m5853b()     // Catch: java.lang.Throwable -> L19a
            boolean r5 = r4.getBoolean(r3, r10)     // Catch: java.lang.Throwable -> L19a
            r30 = r5
            goto L19c
        L19a:
            r30 = r10
        L19c:
            java.lang.String r3 = "hb_notify_system_enable"
            android.content.SharedPreferences r4 = r0.m5853b()     // Catch: java.lang.Throwable -> L1a9
            boolean r5 = r4.getBoolean(r3, r10)     // Catch: java.lang.Throwable -> L1a9
            r33 = r5
            goto L1ab
        L1a9:
            r33 = r10
        L1ab:
            java.lang.String r3 = "hb_notify_toast_enable"
            android.content.SharedPreferences r4 = r0.m5853b()     // Catch: java.lang.Throwable -> L1b8
            boolean r5 = r4.getBoolean(r3, r10)     // Catch: java.lang.Throwable -> L1b8
            r34 = r5
            goto L1ba
        L1b8:
            r34 = r10
        L1ba:
            java.lang.String r3 = "hb_notify_sound_enable"
            android.content.SharedPreferences r4 = r0.m5853b()     // Catch: java.lang.Throwable -> L1c7
            boolean r5 = r4.getBoolean(r3, r10)     // Catch: java.lang.Throwable -> L1c7
            r35 = r5
            goto L1c9
        L1c7:
            r35 = r10
        L1c9:
            java.lang.String r3 = "hb_notify_sound_mode"
            android.content.SharedPreferences r4 = r0.m5853b()     // Catch: java.lang.Throwable -> L1d6
            int r5 = r4.getInt(r3, r10)     // Catch: java.lang.Throwable -> L1d6
            r36 = r5
            goto L1d8
        L1d6:
            r36 = r10
        L1d8:
            java.lang.String r3 = "hb_notify_vibrate_enable"
            android.content.SharedPreferences r4 = r0.m5853b()     // Catch: java.lang.Throwable -> L1e5
            boolean r5 = r4.getBoolean(r3, r10)     // Catch: java.lang.Throwable -> L1e5
            r37 = r5
            goto L1e7
        L1e5:
            r37 = 0
        L1e7:
            java.lang.String r4 = "hb_notify_sound_uri"
            java.lang.String r38 = r0.m5855d(r4, r13)
            java.lang.String r4 = "hb_notify_text"
            java.lang.String r5 = "抢到红包 {amount} 元"
            java.lang.String r39 = r0.m5855d(r4, r5)
            java.lang.String r10 = "hb_notify_toast_text"
            java.lang.String r4 = r0.m5855d(r4, r5)
            java.lang.String r40 = r0.m5855d(r10, r4)
            java.lang.String r4 = "hb_notify_failed_system_enable"
            android.content.SharedPreferences r10 = r0.m5853b()     // Catch: java.lang.Throwable -> L20d
            r3 = 0
            boolean r4 = r10.getBoolean(r4, r3)     // Catch: java.lang.Throwable -> L20e
            r41 = r4
            goto L210
        L20d:
            r3 = 0
        L20e:
            r41 = r3
        L210:
            java.lang.String r4 = "hb_notify_failed_toast_enable"
            android.content.SharedPreferences r10 = r0.m5853b()     // Catch: java.lang.Throwable -> L21d
            boolean r4 = r10.getBoolean(r4, r3)     // Catch: java.lang.Throwable -> L21d
            r42 = r4
            goto L21f
        L21d:
            r42 = 0
        L21f:
            java.lang.String r4 = "hb_notify_failed_text"
            java.lang.String r10 = "未抢到红包"
            java.lang.String r43 = r0.m5855d(r4, r10)
            java.lang.String r13 = "hb_notify_failed_toast_text"
            java.lang.String r4 = r0.m5855d(r4, r10)
            java.lang.String r44 = r0.m5855d(r13, r4)
            java.lang.String r4 = "hb_announce_enable"
            android.content.SharedPreferences r10 = r0.m5853b()     // Catch: java.lang.Throwable -> L23f
            r3 = 0
            boolean r3 = r10.getBoolean(r4, r3)     // Catch: java.lang.Throwable -> L23c
        L23c:
            r45 = r3
            goto L241
        L23f:
            r3 = 0
            goto L23c
        L241:
            java.lang.String r3 = "hb_announce_text"
            java.lang.String r46 = r0.m5855d(r3, r5)
            r10 = r7
            java.lang.String r7 = "旧版全局设置"
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = r14
            r13 = r1
            r6.<init>(r7, r8, r9, r10, r11, r13, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: be.AbstractC0283h.m1129I(l3.l):na.a");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public static List m1130J(boolean z9) {
        Object c3959f;
        Object next;
        String str;
        String str2;
        C5026jv c5026jv;
        C1368i c1368iM9259c = AbstractC4855en.m9259c();
        List listM8402K1 = C4173t.f13710g;
        if (c1368iM9259c != null) {
            C1368i c1368i = c1368iM9259c.m3704G() ? c1368iM9259c : null;
            if (c1368i != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                try {
                    c3959f = c1368i.m3727p();
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                if (c3959f instanceof C3959f) {
                    c3959f = listM8402K1;
                }
                for (ContactLabelBean contactLabelBean : (Iterable) c3959f) {
                    String str3 = contactLabelBean.labelName;
                    if (AbstractC3149m.m6721t0(str3)) {
                        str3 = contactLabelBean.labelId;
                    }
                    if (!AbstractC3149m.m6721t0(str3)) {
                        for (String str4 : contactLabelBean.userNameList) {
                            if (!AbstractC3149m.m6721t0(str4)) {
                                Object arrayList = linkedHashMap.get(str4);
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                    linkedHashMap.put(str4, arrayList);
                                }
                                ((List) arrayList).add(str3);
                            }
                        }
                    }
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC4178y.m8438a0(linkedHashMap.size()));
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    linkedHashMap2.put(entry.getKey(), AbstractC4166m.m8418p1((List) entry.getValue()));
                }
                C1624a c1624aConversations = WeChatApis.conversations();
                List listM4144c = c1624aConversations != null ? c1624aConversations.m4144c() : null;
                if (listM4144c == null) {
                    listM4144c = listM8402K1;
                }
                ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(listM4144c));
                int i9 = 0;
                for (Object obj : listM4144c) {
                    int i10 = i9 + 1;
                    if (i9 < 0) {
                        AbstractC0000a.m32Q0();
                        throw null;
                    }
                    arrayList2.add(new C3958e(((C2527b) obj).f8167a, Integer.valueOf(i9)));
                    i9 = i10;
                }
                C0415a0 c0415a0 = new C0415a0(new C0505z(AbstractC4178y.m8442e0(arrayList2), 2), 21);
                ArrayList<WeChatContact> arrayListM3736y = c1368i.m3736y();
                ArrayList arrayList3 = new ArrayList();
                for (WeChatContact weChatContact : arrayListM3736y) {
                    List list = (List) linkedHashMap2.get(weChatContact.wxId);
                    List list2 = list == null ? listM8402K1 : list;
                    if (AbstractC3149m.m6721t0(weChatContact.wxId)) {
                        c5026jv = null;
                    } else {
                        String str5 = weChatContact.wxId;
                        String strM7883Z = AbstractC3754e0.m7883Z(weChatContact, false);
                        String str6 = weChatContact.avatarUrl;
                        String str7 = weChatContact.avatarBackupUrl;
                        List listM101y0 = AbstractC0000a.m101y0(weChatContact.remarkName, weChatContact.nickname, weChatContact.customWxId);
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj2 : listM101y0) {
                            if (!AbstractC3149m.m6721t0((String) obj2)) {
                                arrayList4.add(obj2);
                            }
                        }
                        c5026jv = new C5026jv(str5, strM7883Z, false, str6, str7, list2, false, AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList4)), 64);
                    }
                    if (c5026jv != null) {
                        arrayList3.add(c5026jv);
                    }
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = new ArrayList();
                for (Object obj3 : arrayList3) {
                    if (hashSet.add(((C5026jv) obj3).f18249a)) {
                        arrayList5.add(obj3);
                    }
                }
                List listM8402K12 = AbstractC4166m.m8402K1(arrayList5, c0415a0);
                if (!z9) {
                    return listM8402K12;
                }
                HashSet hashSet2 = new HashSet();
                Iterator it = listM8402K12.iterator();
                while (it.hasNext()) {
                    hashSet2.add(((C5026jv) it.next()).f18249a);
                }
                C1368i c1368iM9259c2 = AbstractC4855en.m9259c();
                if (c1368iM9259c2 != null) {
                    WeChatApis.contact().getClass();
                    C1360a c1360a = WeChatApis.accountApi;
                    String strM3652c = c1360a != null ? c1360a.m3652c() : null;
                    if (strM3652c == null) {
                        strM3652c = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    for (WeChatContact weChatContact2 : c1368iM9259c2.m3735x()) {
                        LinkedHashMap linkedHashMapM3734w = c1368iM9259c2.m3734w(weChatContact2.wxId);
                        for (String str8 : c1368iM9259c2.m3732u(weChatContact2.wxId)) {
                            str8.getClass();
                            if (!AbstractC3149m.m6721t0(str8) && !str8.equals(strM3652c) && !hashSet2.contains(str8)) {
                                String str9 = (String) linkedHashMapM3734w.get(str8);
                                if (str9 == null) {
                                    str9 = HttpUrl.FRAGMENT_ENCODE_SET;
                                }
                                String string = AbstractC3149m.m6703R0(str9).toString();
                                if (string.length() > 0) {
                                }
                            }
                        }
                    }
                    if (!linkedHashMap3.isEmpty()) {
                        Set setKeySet = linkedHashMap3.keySet();
                        setKeySet.getClass();
                        ArrayList arrayListM3728q = c1368iM9259c2.m3728q(AbstractC4166m.m8407P1(setKeySet));
                        int iM8438a0 = AbstractC4178y.m8438a0(AbstractC4167n.m8429e1(arrayListM3728q));
                        if (iM8438a0 < 16) {
                            iM8438a0 = 16;
                        }
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap(iM8438a0);
                        for (Object obj4 : arrayListM3728q) {
                            linkedHashMap4.put(((WeChatContact) obj4).wxId, obj4);
                        }
                        Set setKeySet2 = linkedHashMap3.keySet();
                        setKeySet2.getClass();
                        Set<String> set = setKeySet2;
                        ArrayList arrayList6 = new ArrayList(AbstractC4167n.m8429e1(set));
                        for (String str10 : set) {
                            WeChatContact weChatContact3 = (WeChatContact) linkedHashMap4.get(str10);
                            Iterator it2 = AbstractC0000a.m101y0(weChatContact3 != null ? weChatContact3.remarkName : null, weChatContact3 != null ? weChatContact3.nickname : null, (String) linkedHashMap3.get(str10)).iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it2.next();
                                String str11 = (String) next;
                                if (str11 != null && !AbstractC3149m.m6721t0(str11)) {
                                    break;
                                }
                            }
                            String str12 = (String) next;
                            if (str12 == null) {
                                str12 = HttpUrl.FRAGMENT_ENCODE_SET;
                            }
                            if (AbstractC3149m.m6721t0(str12)) {
                                str10.getClass();
                                str12 = str10;
                            }
                            str10.getClass();
                            String str13 = weChatContact3 != null ? weChatContact3.avatarUrl : null;
                            String str14 = str13 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str13;
                            String str15 = weChatContact3 != null ? weChatContact3.avatarBackupUrl : null;
                            String str16 = str15 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str15;
                            if (weChatContact3 == null || (str = weChatContact3.customWxId) == null || AbstractC3149m.m6721t0(str)) {
                                str = null;
                            }
                            if (weChatContact3 == null || (str2 = weChatContact3.nickname) == null || AbstractC3149m.m6721t0(str2)) {
                                str2 = null;
                            }
                            String str17 = (String) linkedHashMap3.get(str10);
                            if (str17 == null || AbstractC3149m.m6721t0(str17)) {
                                str17 = null;
                            }
                            arrayList6.add(new C5026jv(str10, str12, false, str14, str16, null, false, AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(AbstractC0000a.m103z0(str, str2, str17, "群成员"))), 96));
                        }
                        listM8402K1 = AbstractC4166m.m8402K1(arrayList6, new C0031h(20));
                    }
                }
                ArrayList arrayListM8397F1 = AbstractC4166m.m8397F1(listM8402K12, listM8402K1);
                HashSet hashSet3 = new HashSet();
                ArrayList arrayList7 = new ArrayList();
                for (Object obj5 : arrayListM8397F1) {
                    if (hashSet3.add(((C5026jv) obj5).f18249a)) {
                        arrayList7.add(obj5);
                    }
                }
                return AbstractC4166m.m8402K1(arrayList7, c0415a0);
            }
        }
        return listM8402K1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public static List m1131K(Collection collection, Function function) {
        if (collection == null || collection.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(function.apply(it.next()));
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public static String m1132L(String str) {
        String string = AbstractC3149m.m6703R0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3149m.m6703R0(str).toString(), "￥", HttpUrl.FRAGMENT_ENCODE_SET, false), "¥", HttpUrl.FRAGMENT_ENCODE_SET, false), "元", HttpUrl.FRAGMENT_ENCODE_SET, false), ",", HttpUrl.FRAGMENT_ENCODE_SET, false)).toString();
        if (AbstractC3149m.m6721t0(string)) {
            return null;
        }
        Pattern patternCompile = Pattern.compile("[0-9]+(?:\\.[0-9]{0,2})?");
        patternCompile.getClass();
        if (patternCompile.matcher(string).matches()) {
            return AbstractC3149m.m6687B0(string, ".");
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public static void m1133M(SharedPreferencesC0062o sharedPreferencesC0062o, C0058k c0058k, byte b10, String str, int i9) {
        HashMap map = sharedPreferencesC0062o.f196f;
        if (b10 == 1) {
            byte[] bArr = (byte[]) c0058k.f178j;
            int i10 = c0058k.f176h;
            c0058k.f176h = i10 + 1;
            map.put(str, new C0050c(i9, bArr[i10] == 1));
            return;
        }
        if (b10 == 2) {
            map.put(str, new C0053f(i9, c0058k.m366q()));
            return;
        }
        if (b10 == 3) {
            map.put(str, new C0052e(i9, Float.intBitsToFloat(c0058k.m366q())));
            return;
        }
        if (b10 == 4) {
            long jM367r = c0058k.m367r(c0058k.f176h);
            c0058k.f176h += 8;
            map.put(str, new C0054g(i9, jM367r));
            return;
        }
        long jM367r2 = c0058k.m367r(c0058k.f176h);
        c0058k.f176h += 8;
        double dLongBitsToDouble = Double.longBitsToDouble(jM367r2);
        C0051d c0051d = new C0051d();
        c0051d.f165a = i9;
        c0051d.f167b = dLongBitsToDouble;
        map.put(str, c0051d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public static void m1134N(SharedPreferencesC0062o sharedPreferencesC0062o, C0058k c0058k, byte b10, String str, int i9, int i10, byte b11) throws Exception {
        Object objM372w;
        byte b12 = b10;
        HashMap map = sharedPreferencesC0062o.f196f;
        boolean z9 = b12 == 9 || b12 == 10 || b12 == 11;
        int iM366q = z9 ? c0058k.m366q() : c0058k.m370u() & 65535;
        int i11 = z9 ? 4 : 2;
        boolean z10 = (b11 & JSONB.Constants.BC_INT32_SHORT_MIN) != 0;
        if (z10 && iM366q != 32) {
            C2104o.m5276A("name size not match");
            return;
        }
        switch (b12) {
            case 9:
                b12 = 6;
                break;
            case 10:
                b12 = 7;
                break;
            case 11:
                b12 = 8;
                break;
        }
        if (b12 == 6) {
            map.put(str, new C0056i(i10, i9 + i11, z10 ? c0058k.m372w(iM366q) : c0058k.m372w(iM366q), iM366q, z10));
            return;
        }
        if (b12 == 7) {
            if (z10) {
                objM372w = c0058k.m372w(iM366q);
            } else {
                c0058k.getClass();
                objM372w = new byte[iM366q];
                System.arraycopy((byte[]) c0058k.f178j, c0058k.f176h, objM372w, 0, iM366q);
                c0058k.f176h += iM366q;
            }
            map.put(str, new C0048a(i10, i9 + i11, objM372w, iM366q, z10));
            return;
        }
        if (z10) {
            map.put(str, new C0055h(i10, i9 + i11, c0058k.m372w(iM366q), iM366q, true));
            return;
        }
        C0058k c0058k2 = sharedPreferencesC0062o.f198h;
        byte[] bArr = (byte[]) c0058k2.f178j;
        int i12 = c0058k2.f176h;
        c0058k2.f176h = i12 + 1;
        int i13 = bArr[i12] & 255;
        String strM372w = c0058k2.m372w(i13);
        C0066s c0066s = (C0066s) sharedPreferencesC0062o.f193c.get(strM372w);
        int i14 = iM366q - (i13 + 1);
        if (i14 < 0) {
            throw new Exception("parse dara failed");
        }
        if (c0066s != null) {
            try {
                map.put(str, new C0055h(i10, i9 + 2, C0066s.m435a((byte[]) c0058k2.f178j, c0058k2.f176h, i14), iM366q, false));
            } catch (Exception e6) {
                Log.e("FastKV", sharedPreferencesC0062o.f192b, e6);
            }
        } else {
            AbstractC1341a.m3597m(sharedPreferencesC0062o, "object with tag: " + strM372w + " without encoder");
        }
        c0058k.f176h = i9 + i11 + iM366q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a3, code lost:
    
        throw new java.lang.Exception("parse dara failed");
     */
    /* JADX INFO: renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m1135O(SharedPreferencesC0062o sharedPreferencesC0062o, boolean z9) {
        int iM366q;
        SharedPreferencesC0062o sharedPreferencesC0062o2;
        if (z9) {
            AbstractC1341a.m3597m(sharedPreferencesC0062o, "miss cipher");
            return false;
        }
        C0058k c0058k = sharedPreferencesC0062o.f198h;
        String str = sharedPreferencesC0062o.f192b;
        c0058k.f176h = 12;
        while (true) {
            try {
                int i9 = c0058k.f176h;
                int i10 = sharedPreferencesC0062o.f194d;
                boolean z10 = true;
                if (i9 >= i10) {
                    if (i9 == i10) {
                        return true;
                    }
                    Log.e("FastKV", str, new Exception("parse dara failed"));
                    return false;
                }
                byte[] bArr = (byte[]) c0058k.f178j;
                int i11 = i9 + 1;
                c0058k.f176h = i11;
                byte b10 = bArr[i9];
                byte b11 = (byte) (b10 & 63);
                if (b11 < 1 || b11 > 11) {
                    break;
                }
                int i12 = i9 + 2;
                c0058k.f176h = i12;
                int i13 = bArr[i11] & 255;
                if (i13 == 0) {
                    throw new IllegalStateException("invalid key size");
                }
                if (b10 < 0) {
                    c0058k.f176h = i12 + i13;
                    if (b11 <= 5) {
                        iM366q = SharedPreferencesC0062o.f190z[b11];
                    } else {
                        if (b11 != 9 && b11 != 10 && b11 != 11) {
                            z10 = false;
                        }
                        iM366q = z10 ? c0058k.m366q() : c0058k.m370u() & 65535;
                    }
                    int i14 = c0058k.f176h + iM366q;
                    c0058k.f176h = i14;
                    sharedPreferencesC0062o.f204n = (i14 - i9) + sharedPreferencesC0062o.f204n;
                    ArrayList arrayList = sharedPreferencesC0062o.f205o;
                    C0065r c0065r = new C0065r();
                    c0065r.f219g = i9;
                    c0065r.f220h = i14;
                    arrayList.add(c0065r);
                } else {
                    String strM372w = c0058k.m372w(i13);
                    int i15 = c0058k.f176h;
                    if (b11 <= 5) {
                        m1133M(sharedPreferencesC0062o, c0058k, b11, strM372w, i15);
                        sharedPreferencesC0062o2 = sharedPreferencesC0062o;
                    } else {
                        sharedPreferencesC0062o2 = sharedPreferencesC0062o;
                        m1134N(sharedPreferencesC0062o2, c0058k, b11, strM372w, i15, i9, b10);
                    }
                    sharedPreferencesC0062o = sharedPreferencesC0062o2;
                }
            } catch (Exception e6) {
                Log.e("FastKV", str, e6);
                return false;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public static final void m1136P(C2429k c2429k, InterfaceC1807a interfaceC1807a, int i9) {
        while (true) {
            int i10 = c2429k.f7984v;
            if (i9 > i10 && i9 < c2429k.f7983u) {
                return;
            }
            if (i10 == 0 && i9 == 0) {
                return;
            }
            c2429k.m5807M();
            if (c2429k.m5839y(c2429k.f7984v)) {
                interfaceC1807a.mo4447k();
            }
            c2429k.m5824j();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public static String m1137Q(String str) {
        String strM1178p0 = m1178p0(str, "title");
        String strM1138R = m1138R(str);
        return AbstractC3149m.m6721t0(strM1138R) ? strM1178p0 : AbstractC4855en.m9264h(strM1178p0, "\n\n引用：", strM1138R);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public static String m1138R(String str) {
        String strM1176o0 = m1176o0(str);
        String strM1174n0 = m1174n0(strM1176o0);
        String strM1178p0 = m1178p0(strM1176o0, "type");
        if (strM1178p0.equals("49") || strM1178p0.equals("57")) {
            String strM1178p02 = m1178p0(m1156e0(strM1174n0), "title");
            if (!AbstractC3149m.m6721t0(strM1178p02)) {
                return strM1178p02;
            }
        }
        return m1186x(m1156e0(strM1174n0), m1178p0(strM1176o0, "title"), m1178p0(str, "refermsg"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    public static HashMap m1139S(InputStream inputStream) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
            try {
                HashMap map = new HashMap();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        return map;
                    }
                    int i9 = Integer.parseInt(line.substring(0, 8), 16);
                    map.put(Integer.valueOf(i9), line.substring(9));
                }
            } finally {
            }
        } catch (Exception e6) {
            throw new C0084g("Failed to read res-map file", e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    public static C2776b m1140T(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j3;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i9 = byteBufferDuplicate.getShort() & 65535;
        if (i9 > 100) {
            C2104o.m5299y("Cannot read metadata.");
            return null;
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i10 = 0;
        while (true) {
            if (i10 >= i9) {
                j3 = -1;
                break;
            }
            int i11 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j3 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i11) {
                break;
            }
            i10++;
        }
        if (j3 != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j3 - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j4 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i12 = 0; i12 < j4; i12++) {
                int i13 = byteBufferDuplicate.getInt();
                long j5 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i13 || 1701669481 == i13) {
                    byteBufferDuplicate.position((int) (j5 + j3));
                    C2776b c2776b = new C2776b();
                    int iPosition = byteBufferDuplicate.position() + AbstractC2091b.m5157d(byteBufferDuplicate, ByteOrder.LITTLE_ENDIAN);
                    c2776b.f9018j = byteBufferDuplicate;
                    c2776b.f9015g = iPosition;
                    int i14 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    c2776b.f9016h = i14;
                    c2776b.f9017i = ((ByteBuffer) c2776b.f9018j).getShort(i14);
                    return c2776b;
                }
            }
        }
        C2104o.m5299y("Cannot read metadata.");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public static Object m1141U(List list) {
        int size = list.size();
        if (size == 0) {
            return null;
        }
        return list.remove(size - 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    public static String m1142V(String str, String str2, String str3) {
        if (AbstractC3149m.m6721t0(str)) {
            return str;
        }
        String strM1022k = AbstractC0255e.m1022k("<", str2, "(?:\\s[^>]*)?>(.*?)</", str2, ">");
        Iterator it = AbstractC4156d0.m8355W(EnumC3148l.IGNORE_CASE, EnumC3148l.DOT_MATCHES_ALL).iterator();
        int i9 = 0;
        while (it.hasNext()) {
            i9 |= ((EnumC3148l) it.next()).f10210g;
        }
        Pattern patternCompile = Pattern.compile(strM1022k, C2469w.m5864f(i9));
        patternCompile.getClass();
        Matcher matcher = patternCompile.matcher(str);
        matcher.getClass();
        C3145i c3145iM238b = AbstractC0018a.m238b(matcher, 0, str);
        if (c3145iM238b == null) {
            return str;
        }
        String strM6678c = c3145iM238b.m6678c();
        String strSubstring = strM6678c.substring(0, AbstractC3149m.m6718q0(strM6678c, '>', 0, 6) + 1);
        String strM2251n = AbstractC0921a.m2251n("</", str2, ">");
        C2564d c2564dM6677b = c3145iM238b.m6677b();
        String str4 = strSubstring + str3 + strM2251n;
        c2564dM6677b.getClass();
        return AbstractC3149m.m6688C0(str, c2564dM6677b.f8312g, c2564dM6677b.f8313h + 1, str4).toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    public static String m1143W(String str, String str2, String str3) {
        return AbstractC3149m.m6721t0(str) ? str : new C3147k(AbstractC0255e.m1022k("<", str2, "(?:\\s[^>]*)?>(.*?)</", str2, ">"), AbstractC4156d0.m8355W(EnumC3148l.IGNORE_CASE, EnumC3148l.DOT_MATCHES_ALL)).m6684e(str, new C0868g(8, str3, str2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X */
    public static final C0126e m1144X(Object obj, Method method, InterfaceC1235p interfaceC1235p) {
        Object obj2;
        Object field;
        method.getClass();
        interfaceC1235p.getClass();
        Class<?> declaringClass = method.getDeclaringClass();
        declaringClass.getClass();
        if (obj == null) {
            obj2 = null;
        } else {
            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
            ArrayDeque arrayDeque = new ArrayDeque();
            setNewSetFromMap.add(obj);
            arrayDeque.add(new C2339c(obj, 0));
            while (!arrayDeque.isEmpty()) {
                C2339c c2339c = (C2339c) arrayDeque.removeFirst();
                obj2 = c2339c.f7665a;
                int i9 = c2339c.f7666b;
                if (declaringClass.isInstance(obj2)) {
                    break;
                }
                if (i9 < 4) {
                    ArrayList arrayList = new ArrayList();
                    for (Class<?> superclass = obj2.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                        for (Field field2 : KavaReflector.declaredFields(superclass)) {
                            if (!Modifier.isStatic(field2.getModifiers()) && !field2.getType().isPrimitive() && !field2.getType().isArray() && (field = KavaReflector.readField(field2, obj2)) != null && AbstractC0921a.m2263z("com.tencent.mm.ui.chatting.component.", field, false)) {
                                arrayList.add(field);
                            }
                        }
                    }
                    for (Object obj3 : arrayList) {
                        if (setNewSetFromMap.add(obj3)) {
                            arrayDeque.add(new C2339c(obj3, i9 + 1));
                        }
                    }
                }
            }
            obj2 = null;
        }
        if (obj2 != null) {
            return new C0126e(obj2, method);
        }
        interfaceC1235p.invoke("未找到多选消息原生退出组件: ".concat(method.getDeclaringClass().getName()), null);
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public static List m1145Y(List list, AbstractC2963b0 abstractC2963b0) {
        if (list != null && !list.isEmpty()) {
            list.add(abstractC2963b0);
            return list;
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(abstractC2963b0);
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    public static List m1146Z(List list, Object obj, Object obj2) {
        if (list == null || list.isEmpty()) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(obj2);
            return arrayList;
        }
        int iIndexOf = list.indexOf(obj);
        if (iIndexOf != -1) {
            list.set(iIndexOf, obj2);
            return list;
        }
        list.add(obj2);
        return list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final C4235e m1147a(Context context) {
        float f3 = context.getResources().getConfiguration().fontScale;
        float f10 = context.getResources().getDisplayMetrics().density;
        InterfaceC4442a interfaceC4442aM8893a = AbstractC4443b.m8893a(f3);
        if (interfaceC4442aM8893a == null) {
            interfaceC4442aM8893a = new C4244n(f3);
        }
        return new C4235e(f10, f3, interfaceC4442aM8893a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a0 */
    public static void m1148a0(WeChatMessage weChatMessage, String str) {
        C2355s c2355s;
        WeChatDatabaseApi weChatDatabaseApiDatabase = WeChatApis.database();
        if (weChatDatabaseApiDatabase != null) {
            WeChatMessage weChatMessageM5660b = (WeChatApis.message() == null || (c2355s = WeChatApis.messageStoreApi) == null) ? null : c2355s.m5660b(weChatMessage.talker);
            if (weChatMessageM5660b == null || weChatMessageM5660b.msgId != weChatMessage.msgId) {
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("content", str);
            contentValues.put("msgType", String.valueOf(weChatMessage.type));
            contentValues.put("isSend", Integer.valueOf(weChatMessage.isSend));
            contentValues.put("digest", m1181s(weChatMessage, str));
            weChatDatabaseApiDatabase.update("rconversation", contentValues, "username=?", new String[]{weChatMessage.talker});
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final C0809d m1149b(float f3, float f10, float f11, float f12, long j3) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
        return new C0809d(f3, f10, f11, f12, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b0 */
    public static List m1150b0(Iterator it) {
        boolean zHasNext = it.hasNext();
        if (!zHasNext) {
            return C6113i.f24665g;
        }
        C6107c c6107c = new C6107c(2);
        while (zHasNext) {
            c6107c.add(it.next());
            zHasNext = it.hasNext();
        }
        if (c6107c.f24644i > 1000) {
            c6107c.mo10863m();
        }
        return c6107c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m1151c(InterfaceC5853o interfaceC5853o, C3874d c3874d, C1836h0 c1836h0, int i9) {
        c1836h0.m4527b0(-1854833411);
        int i10 = (c1836h0.m4534f(interfaceC5853o) ? 4 : 2) | i9;
        if (c1836h0.m4516S(i10 & 1, (i10 & 19) != 18)) {
            Object objM4514P = c1836h0.m4514P();
            if (objM4514P == C1851l.f6155a) {
                objM4514P = C1543p0.f5150a;
                c1836h0.m4545k0(objM4514P);
            }
            InterfaceC4412n0 interfaceC4412n0 = (InterfaceC4412n0) objM4514P;
            int iHashCode = Long.hashCode(c1836h0.f6095T);
            C3878h c3878hM4546l = c1836h0.m4546l();
            InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h0, interfaceC5853o);
            InterfaceC5605g.f22815f.getClass();
            C5660y c5660y = C5601f.f22758b;
            c1836h0.m4531d0();
            if (c1836h0.f6094S) {
                c1836h0.m4544k(c5660y);
            } else {
                c1836h0.m4551n0();
            }
            AbstractC1874r.m4615A(C5601f.f22761e, c1836h0, interfaceC4412n0);
            AbstractC1874r.m4615A(C5601f.f22760d, c1836h0, c3878hM4546l);
            AbstractC1874r.m4615A(C5601f.f22762f, c1836h0, Integer.valueOf(iHashCode));
            AbstractC1874r.m4641w(C5601f.f22763g, c1836h0);
            AbstractC1874r.m4615A(C5601f.f22759c, c1836h0, interfaceC5853oM10543c);
            c3874d.invoke(c1836h0, 6);
            c1836h0.m4553p(true);
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C0151q(interfaceC5853o, c3874d, i9, 5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c0 */
    public static String m1152c0(String str) {
        String strM1165j;
        long jLongValue;
        Iterator it = AbstractC0000a.m101y0("feedesc", "title", "desc", "payerdes", "receiverdes").iterator();
        while (true) {
            if (!it.hasNext()) {
                strM1165j = null;
                break;
            }
            strM1165j = m1165j(m1178p0(str, (String) it.next()));
            if (strM1165j != null) {
                break;
            }
        }
        if (strM1165j != null) {
            return strM1165j;
        }
        Long lM6743g0 = AbstractC3156t.m6743g0(m1186x(m1178p0(str, "total_fee"), m1178p0(str, "feederval"), m1178p0(str, "fee")));
        if (lM6743g0 != null) {
            jLongValue = lM6743g0.longValue();
        } else {
            String strM1165j2 = m1165j(m1186x(m1178p0(str, "feedesc"), m1178p0(str, "title"), m1178p0(str, "desc")));
            Long lM1163i = strM1165j2 != null ? m1163i(strM1165j2) : null;
            if (lM1163i == null) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            jLongValue = lM1163i.longValue();
        }
        BigDecimal bigDecimalMovePointLeft = new BigDecimal(jLongValue).movePointLeft(2);
        String plainString = (bigDecimalMovePointLeft.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalMovePointLeft.stripTrailingZeros()).toPlainString();
        plainString.getClass();
        return plainString;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final Object[] m1153d(int i9, Object obj, Object obj2, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length + 2];
        AbstractC4165l.m8383r0(0, i9, objArr, 6, objArr2);
        AbstractC4165l.m8379n0(i9 + 2, i9, objArr, objArr.length, objArr2);
        objArr2[i9] = obj;
        objArr2[i9 + 1] = obj2;
        return objArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d0 */
    public static String m1154d0(String str) {
        String strM1152c0 = m1152c0(str);
        return AbstractC3149m.m6721t0(strM1152c0) ? m1186x(m1178p0(str, "feedesc"), m1178p0(str, "title"), m1178p0(str, "desc")) : "￥".concat(strM1152c0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final Object[] m1155e(int i9, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        AbstractC4165l.m8383r0(0, i9, objArr, 6, objArr2);
        AbstractC4165l.m8379n0(i9, i9 + 2, objArr, objArr.length, objArr2);
        return objArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e0 */
    public static String m1156e0(String str) {
        return AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(str, "&lt;", "<", false), "&gt;", ">", false), "&amp;", "&", false), "&quot;", "\"", false), "&apos;", "'", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final Object[] m1157f(int i9, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        AbstractC4165l.m8383r0(0, i9, objArr, 6, objArr2);
        AbstractC4165l.m8379n0(i9, i9 + 1, objArr, objArr.length, objArr2);
        return objArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f0 */
    public static C1095f m1158f0(WeChatMessage weChatMessage, String str, Object obj) {
        WeChatDatabaseApi weChatDatabaseApiDatabase = WeChatApis.database();
        if (weChatDatabaseApiDatabase == null) {
            return new C1095f(false, false);
        }
        if (weChatDatabaseApiDatabase.updateNativeMessageContent(weChatMessage.msgId, str, obj)) {
            return new C1095f(true, true);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("content", str);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String strMessageTableForTalker = weChatDatabaseApiDatabase.messageTableForTalker(weChatMessage.talker);
        strMessageTableForTalker.getClass();
        if (AbstractC3149m.m6721t0(strMessageTableForTalker)) {
            strMessageTableForTalker = null;
        }
        if (strMessageTableForTalker != null) {
            linkedHashSet.add(strMessageTableForTalker);
        }
        linkedHashSet.add("message");
        Iterator it = linkedHashSet.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            if (weChatDatabaseApiDatabase.update((String) next, contentValues, "msgId=?", new String[]{String.valueOf(weChatMessage.msgId)}) > 0) {
                return new C1095f(true, false);
            }
        }
        return new C1095f(false, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static boolean m1159g(Collection collection, Predicate predicate) {
        if (collection == null || collection.isEmpty()) {
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!predicate.test(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g0 */
    public static String m1160g0(String str, String str2, String str3) {
        String strM1142V;
        String strM1142V2 = m1142V(str, "title", m1183u(str2));
        String strM1176o0 = m1176o0(strM1142V2);
        if (AbstractC3149m.m6721t0(strM1176o0) || AbstractC3149m.m6721t0(str3)) {
            return strM1142V2;
        }
        String strM1174n0 = m1174n0(strM1176o0);
        if (AbstractC3149m.m6721t0(strM1174n0)) {
            strM1142V = strM1176o0;
        } else {
            String strM1183u = m1183u(str3);
            boolean zM6709h0 = AbstractC3149m.m6709h0(strM1174n0, "&lt;title&gt;", true);
            EnumC3148l enumC3148l = EnumC3148l.DOT_MATCHES_ALL;
            EnumC3148l enumC3148l2 = EnumC3148l.IGNORE_CASE;
            if (zM6709h0 && AbstractC3149m.m6709h0(strM1174n0, "&lt;/title&gt;", true)) {
                strM1183u = new C3147k("&lt;title&gt;.*?&lt;/title&gt;", AbstractC4156d0.m8355W(enumC3148l2, enumC3148l)).m6684e(strM1174n0, new C0532s(strM1183u, 3));
            } else if (AbstractC3149m.m6709h0(strM1174n0, "<title>", true) && AbstractC3149m.m6709h0(strM1174n0, "</title>", true)) {
                strM1183u = new C3147k("<title>.*?</title>", AbstractC4156d0.m8355W(enumC3148l2, enumC3148l)).m6684e(strM1174n0, new C0532s(strM1183u, 4));
            }
            strM1142V = m1142V(strM1176o0, "content", strM1183u);
        }
        String strM1142V3 = m1142V(strM1142V, "title", m1183u(str3));
        return !strM1142V3.equals(strM1176o0) ? AbstractC3156t.m6737a0(strM1142V2, strM1176o0, strM1142V3, false) : strM1142V2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static String m1161h(String str) {
        Object c3959f;
        String strM1132L = m1132L(str);
        if (strM1132L == null) {
            return null;
        }
        Integer numValueOf = Integer.valueOf(AbstractC3149m.m6695J0(strM1132L, '.', HttpUrl.FRAGMENT_ENCODE_SET).length());
        if (!AbstractC3149m.m6710i0(strM1132L, '.')) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        try {
            BigDecimal bigDecimal = new BigDecimal(strM1132L);
            if (bigDecimal.compareTo(BigDecimal.ZERO) < 0) {
                return null;
            }
            c3959f = bigDecimal.setScale(iIntValue, RoundingMode.UNNECESSARY).toPlainString();
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        return (String) (c3959f instanceof C3959f ? null : c3959f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h0 */
    public static void m1162h0(final AbstractC0269a abstractC0269a, C4309e c4309e) {
        try {
            if (abstractC0269a.mo1054h(c4309e)) {
                final int i9 = 0;
                c4309e.f14382v.forEach(new Consumer() { // from class: be.g
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        switch (i9) {
                            case 0:
                                AbstractC0283h.m1162h0(abstractC0269a, (C4309e) obj);
                                break;
                            default:
                                AbstractC0283h.m1164i0(abstractC0269a, (C4322r) obj);
                                break;
                        }
                    }
                });
                final int i10 = 1;
                c4309e.f14380t.forEach(new Consumer() { // from class: be.g
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        switch (i10) {
                            case 0:
                                AbstractC0283h.m1162h0(abstractC0269a, (C4309e) obj);
                                break;
                            default:
                                AbstractC0283h.m1164i0(abstractC0269a, (C4322r) obj);
                                break;
                        }
                    }
                });
            }
        } catch (BootstrapMethodError | Exception | StackOverflowError e6) {
            String str = e6.getClass().getSimpleName() + " in pass: " + abstractC0269a.getClass().getSimpleName();
            c4309e.getClass();
            C5787h.m10468a(c4309e, str, e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static Long m1163i(String str) {
        Object c3959f;
        String strM1132L = m1132L(str);
        if (strM1132L == null || AbstractC3149m.m6721t0(strM1132L)) {
            return null;
        }
        try {
            BigDecimal bigDecimal = new BigDecimal(strM1132L);
            if (bigDecimal.compareTo(BigDecimal.ZERO) < 0) {
                return null;
            }
            c3959f = Long.valueOf(bigDecimal.movePointRight(2).setScale(0, RoundingMode.HALF_UP).longValueExact());
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        Long l10 = (Long) c3959f;
        if (l10 == null) {
            return null;
        }
        if (l10.longValue() >= 0) {
            return l10;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i0 */
    public static void m1164i0(AbstractC0269a abstractC0269a, C4322r c4322r) {
        try {
            if (c4322r.f9217g.mo6236b(C2825b.f9188c)) {
                return;
            }
            abstractC0269a.mo1053g(c4322r);
        } catch (BootstrapMethodError | Exception | StackOverflowError e6) {
            String str = e6.getClass().getSimpleName() + " in pass: " + abstractC0269a.getClass().getSimpleName();
            c4322r.getClass();
            C5787h.m10468a(c4322r, str, e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static String m1165j(String str) {
        String strM6737a0 = AbstractC3156t.m6737a0(str, ",", HttpUrl.FRAGMENT_ENCODE_SET, false);
        Pattern patternCompile = Pattern.compile("[0-9]+(?:\\.[0-9]{1,2})?");
        patternCompile.getClass();
        Matcher matcher = patternCompile.matcher(strM6737a0);
        matcher.getClass();
        C3145i c3145iM238b = AbstractC0018a.m238b(matcher, 0, strM6737a0);
        if (c3145iM238b != null) {
            return m1161h(c3145iM238b.m6678c());
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j0 */
    public static String m1166j0(WeChatMessage weChatMessage, String str) {
        int iM6719r0 = AbstractC3149m.m6719r0(weChatMessage.content, ":\n", 0, false, 6);
        return (weChatMessage.isGroupChat() && weChatMessage.isIncoming() && iM6719r0 > 0) ? weChatMessage.content.substring(0, iM6719r0 + 2).concat(str) : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static boolean m1167k(Collection collection, Predicate predicate) {
        if (collection == null || collection.isEmpty()) {
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (predicate.test(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k0 */
    public static boolean m1168k0(Object obj, String str, int i9) {
        Object c3959f;
        ArrayList<Field> arrayList = new ArrayList();
        for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            List<Field> listDeclaredFields = KavaReflector.declaredFields(superclass);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : listDeclaredFields) {
                Field field = (Field) obj2;
                if (!Modifier.isStatic(field.getModifiers()) && AbstractC1416l.m3825a(field.getType(), Integer.TYPE)) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add((Field) it.next());
            }
        }
        for (Field field2 : arrayList) {
            Object field3 = KavaReflector.readField(field2, obj);
            Integer num = field3 instanceof Integer ? (Integer) field3 : null;
            if (num != null && KavaReflector.writeField(field2, obj, (Object) 1357911)) {
                try {
                    c3959f = Boolean.valueOf(AbstractC3149m.m6709h0(obj.toString(), str + 1357911, false));
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                Object obj3 = Boolean.FALSE;
                if (c3959f instanceof C3959f) {
                    c3959f = obj3;
                }
                boolean zBooleanValue = ((Boolean) c3959f).booleanValue();
                KavaReflector.writeField(field2, obj, num);
                if (zBooleanValue) {
                    return KavaReflector.writeField(field2, obj, Integer.valueOf(i9));
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static String m1169l(long j3) {
        return AbstractC0255e.m1018g(j3, "msg_");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l0 */
    public static void m1170l0(Object obj) {
        Object c3959f;
        ArrayList<Field> arrayList = new ArrayList();
        for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            List<Field> listDeclaredFields = KavaReflector.declaredFields(superclass);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : listDeclaredFields) {
                Field field = (Field) obj2;
                if (!Modifier.isStatic(field.getModifiers()) && AbstractC1416l.m3825a(field.getType(), Long.TYPE)) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add((Field) it.next());
            }
        }
        for (Field field2 : arrayList) {
            Object field3 = KavaReflector.readField(field2, obj);
            Long l10 = field3 instanceof Long ? (Long) field3 : null;
            if (l10 != null && KavaReflector.writeField(field2, obj, (Object) 1357911246813L)) {
                try {
                    c3959f = Boolean.valueOf(AbstractC3149m.m6709h0(obj.toString(), "coverTimeStampMs=1357911246813", false));
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                Object obj3 = Boolean.FALSE;
                if (c3959f instanceof C3959f) {
                    c3959f = obj3;
                }
                boolean zBooleanValue = ((Boolean) c3959f).booleanValue();
                KavaReflector.writeField(field2, obj, l10);
                if (zBooleanValue) {
                    KavaReflector.writeField(field2, obj, (Object) 0L);
                    return;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static final void m1171m(int i9, int i10) {
        if (i9 < 0 || i9 >= i10) {
            C3193a.m6820i(AbstractC3199a.m6837j(i9, "index: ", ", size: ", i10));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008f  */
    /* JADX INFO: renamed from: m0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m1172m0(C0826a c0826a, C2272w c2272w, boolean z9) throws IOException {
        InterfaceC4686a interfaceC4686a = c2272w.f7559m;
        int i9 = c2272w.f7558l;
        if (z9 && EnumC1065a.STATIC.m2688a(i9) && EnumC1065a.FINAL.m2688a(i9) && interfaceC4686a != null) {
            int iMo863h = interfaceC4686a.mo863h();
            boolean z10 = true;
            if (iMo863h == 0) {
                if (((C0194b) interfaceC4686a).f493g != 0) {
                }
                if (z10) {
                }
            } else if (iMo863h == 6) {
                if (((C0199g) interfaceC4686a).f498g != 0) {
                }
                if (z10) {
                }
            } else if (iMo863h == 2) {
                if (((C0201i) interfaceC4686a).f500g != 0) {
                }
                if (z10) {
                }
            } else if (iMo863h == 3) {
                if (((C0195c) interfaceC4686a).f494g != 0) {
                }
                if (z10) {
                }
            } else if (iMo863h == 4) {
                if (((C0198f) interfaceC4686a).f497g != 0) {
                }
                if (z10) {
                }
            } else if (iMo863h == 16) {
                if (((C0197e) interfaceC4686a).f496g != 0.0f) {
                }
                if (z10) {
                }
            } else if (iMo863h != 17) {
                if (iMo863h != 30) {
                    z10 = iMo863h != 31 ? false : true ^ ((C0193a) interfaceC4686a).f492g;
                }
                if (z10) {
                    c0826a.write("# The value of this static final field might be set in the static constructor\n");
                } else {
                    interfaceC4686a = null;
                }
            } else {
                if (((C0196d) interfaceC4686a).f495g != 0.0d) {
                }
                if (z10) {
                }
            }
        }
        c0826a.write(".field ");
        int i10 = c2272w.f7562p;
        Set setCopyOf = i10 == 7 ? Collections.EMPTY_SET : EnumSet.copyOf((Collection) EnumC1067c.m2689a(i10));
        EnumC1065a[] enumC1065aArr = EnumC1065a.f3413n;
        int i11 = 0;
        for (EnumC1065a enumC1065a : enumC1065aArr) {
            if (enumC1065a.f3420k && (enumC1065a.f3416g & i9) != 0) {
                i11++;
            }
        }
        EnumC1065a[] enumC1065aArr2 = new EnumC1065a[i11];
        int i12 = 0;
        for (EnumC1065a enumC1065a2 : enumC1065aArr) {
            if (enumC1065a2.f3420k && (enumC1065a2.f3416g & i9) != 0) {
                enumC1065aArr2[i12] = enumC1065a2;
                i12++;
            }
        }
        for (int i13 = 0; i13 < i11; i13++) {
            c0826a.write(enumC1065aArr2[i13].f3417h);
            c0826a.write(32);
        }
        Iterator it = setCopyOf.iterator();
        while (it.hasNext()) {
            c0826a.write(((EnumC1067c) it.next()).f3427h);
            c0826a.write(32);
        }
        c0826a.mo2079s(c2272w.getName());
        c0826a.write(58);
        c0826a.m7221t(c2272w.getType());
        if (interfaceC4686a != null) {
            c0826a.write(" = ");
            c0826a.mo2076g(interfaceC4686a);
        }
        c0826a.write(10);
        Set setM6493a = AbstractC3050e.m6493a(c2272w.f7556j, c2272w.f7560n);
        if (setM6493a.size() > 0) {
            c0826a.m2081w();
            AbstractC0063p.m407Q(c0826a, setM6493a);
            c0826a.m2080u();
            c0826a.write(".end field\n");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static final void m1173n(int i9, int i10) {
        if (i9 < 0 || i9 > i10) {
            C3193a.m6820i(AbstractC3199a.m6837j(i9, "index: ", ", size: ", i10));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n0 */
    public static String m1174n0(String str) {
        String str2;
        if (!AbstractC3149m.m6721t0(str)) {
            Iterator it = AbstractC4156d0.m8355W(EnumC3148l.IGNORE_CASE, EnumC3148l.DOT_MATCHES_ALL).iterator();
            int i9 = 0;
            while (it.hasNext()) {
                i9 |= ((EnumC3148l) it.next()).f10210g;
            }
            Pattern patternCompile = Pattern.compile("<content(?:\\s[^>]*)?>(.*?)</content>", C2469w.m5864f(i9));
            patternCompile.getClass();
            Matcher matcher = patternCompile.matcher(str);
            matcher.getClass();
            C3145i c3145iM238b = AbstractC0018a.m238b(matcher, 0, str);
            String strM6687B0 = (c3145iM238b == null || (str2 = (String) AbstractC4166m.m8425w1(1, c3145iM238b.m6676a())) == null) ? null : AbstractC3149m.m6687B0(AbstractC3149m.m6686A0(str2, "<![CDATA["), "]]>");
            if (strM6687B0 != null) {
                return strM6687B0;
            }
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static final void m1175o(int i9, int i10, int i11) {
        if (i9 < 0 || i10 > i11) {
            C2104o.m5280e(i11, AbstractC0921a.m2256s(i9, i10, "fromIndex: ", ", toIndex: ", ", size: "));
        } else {
            if (i9 <= i10) {
                return;
            }
            C2104o.m5294t(AbstractC3199a.m6837j(i9, "fromIndex: ", " > toIndex: ", i10));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o0 */
    public static String m1176o0(String str) {
        if (!AbstractC3149m.m6721t0(str)) {
            Iterator it = AbstractC4156d0.m8355W(EnumC3148l.IGNORE_CASE, EnumC3148l.DOT_MATCHES_ALL).iterator();
            int i9 = 0;
            while (it.hasNext()) {
                i9 |= ((EnumC3148l) it.next()).f10210g;
            }
            Pattern patternCompile = Pattern.compile("<refermsg(?:\\s[^>]*)?>(.*?)</refermsg>", C2469w.m5864f(i9));
            patternCompile.getClass();
            Matcher matcher = patternCompile.matcher(str);
            matcher.getClass();
            C3145i c3145iM238b = AbstractC0018a.m238b(matcher, 0, str);
            String strM6678c = c3145iM238b != null ? c3145iM238b.m6678c() : null;
            if (strM6678c != null) {
                return strM6678c;
            }
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static final boolean m1177p(C0808c c0808c, float f3, float f10) {
        float f11 = c0808c.f2416a;
        if (f3 > c0808c.f2418c || f11 > f3) {
            return false;
        }
        return f10 <= c0808c.f2419d && c0808c.f2417b <= f10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p0 */
    public static String m1178p0(String str, String str2) {
        boolean zM6721t0 = AbstractC3149m.m6721t0(str);
        String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (zM6721t0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String strM1022k = AbstractC0255e.m1022k("<", str2, "(?:\\s[^>]*)?>(.*?)</", str2, ">");
        Iterator it = AbstractC4156d0.m8355W(EnumC3148l.IGNORE_CASE, EnumC3148l.DOT_MATCHES_ALL).iterator();
        int i9 = 0;
        while (it.hasNext()) {
            i9 |= ((EnumC3148l) it.next()).f10210g;
        }
        Pattern patternCompile = Pattern.compile(strM1022k, C2469w.m5864f(i9));
        patternCompile.getClass();
        Matcher matcher = patternCompile.matcher(str);
        matcher.getClass();
        C3145i c3145iM238b = AbstractC0018a.m238b(matcher, 0, str);
        String str4 = c3145iM238b != null ? (String) AbstractC4166m.m8425w1(1, c3145iM238b.m6676a()) : null;
        if (str4 != null) {
            str3 = str4;
        }
        return m1156e0(AbstractC3149m.m6687B0(AbstractC3149m.m6686A0(str3, "<![CDATA["), "]]>"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static String m1179q(ByteBuffer byteBuffer) throws UTFDataFormatException {
        StringBuilder sb2 = new StringBuilder();
        while (byteBuffer.hasRemaining()) {
            char c10 = (char) (byteBuffer.get() & 255);
            if (c10 == 0) {
                return sb2.toString();
            }
            if (c10 < 128) {
                sb2.append(c10);
            } else if ((c10 & 224) == 192) {
                byte b10 = byteBuffer.get();
                if ((b10 & JSONB.Constants.BC_INT64_SHORT_MIN) != 128) {
                    throw new UTFDataFormatException("bad second byte");
                }
                sb2.append((char) (((c10 & 31) << 6) | (b10 & 63)));
            } else {
                if ((c10 & 240) != 224) {
                    throw new UTFDataFormatException("bad byte");
                }
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                if ((b11 & JSONB.Constants.BC_INT64_SHORT_MIN) != 128 || (b12 & JSONB.Constants.BC_INT64_SHORT_MIN) != 128) {
                    throw new UTFDataFormatException("bad second or third byte");
                }
                sb2.append((char) (((c10 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63)));
            }
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static C2913a m1180r(C2458l c2458l, List list, C2913a c2913a) {
        Object next;
        String strM5855d = c2458l.m5855d("hb_rule_default_template_id", HttpUrl.FRAGMENT_ENCODE_SET);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C2922j) next).f9512a.equals(strM5855d)) {
                break;
            }
        }
        C2922j c2922j = (C2922j) next;
        if (c2922j == null) {
            return c2913a;
        }
        String str = c2922j.f9513b;
        if (AbstractC3149m.m6721t0(str)) {
            str = "默认规则";
        }
        return AbstractC0063p.m411d(c2922j, str, c2913a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static String m1181s(WeChatMessage weChatMessage, String str) {
        int iM6719r0 = AbstractC3149m.m6719r0(str, ":\n", 0, false, 6);
        if (weChatMessage.isGroupChat() && iM6719r0 > 0) {
            str = str.substring(iM6719r0 + 2);
        }
        return weChatMessage.isTransfer() ? m1154d0(str) : weChatMessage.isQuote() ? m1137Q(str) : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static C1097h m1182t(Context context, long j3) {
        C2355s c2355s;
        WeChatMessage weChatMessageM5661c;
        if (WeChatApis.message() == null || (c2355s = WeChatApis.messageStoreApi) == null || (weChatMessageM5661c = c2355s.m5661c(j3)) == null || !m1123C(weChatMessageM5661c)) {
            return null;
        }
        String strBodyContent = weChatMessageM5661c.bodyContent();
        boolean zIsQuote = weChatMessageM5661c.isQuote();
        boolean zIsTransfer = weChatMessageM5661c.isTransfer();
        return new C1097h(weChatMessageM5661c.msgId, weChatMessageM5661c.talker, zIsTransfer ? m1154d0(strBodyContent) : zIsQuote ? m1137Q(strBodyContent) : strBodyContent, zIsTransfer ? m1152c0(strBodyContent) : zIsQuote ? m1178p0(strBodyContent, "title") : strBodyContent, zIsQuote ? m1138R(strBodyContent) : HttpUrl.FRAGMENT_ENCODE_SET, zIsQuote, zIsTransfer, AbstractC4302b.m8640c(context, "Hchat_edit_message_backup").contains(m1169l(weChatMessageM5661c.msgId)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static String m1183u(String str) {
        return AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(str, "&", "&amp;", false), "<", "&lt;", false), ">", "&gt;", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static List m1184v(Collection collection, Predicate predicate) {
        if (collection == null || collection.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (predicate.test(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static Object m1185w(List list, Predicate predicate) {
        if (list != null && !list.isEmpty()) {
            Object obj = null;
            for (Object obj2 : list) {
                if (predicate.test(obj2)) {
                    if (obj == null) {
                        obj = obj2;
                    }
                }
            }
            return obj;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static String m1186x(String... strArr) {
        String str;
        int length = strArr.length;
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                str = null;
                break;
            }
            str = strArr[i9];
            if (!AbstractC3149m.m6721t0(str)) {
                break;
            }
            i9++;
        }
        return str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static C1258b m1187y(C1258b c1258b, EnumC4243m enumC4243m, C1941n0 c1941n0, InterfaceC4233c interfaceC4233c, InterfaceC2760d interfaceC2760d) {
        if (c1258b != null && enumC4243m == c1258b.f4119a && AbstractC1923e0.m4790h(c1941n0, enumC4243m).equals(c1258b.f4120b) && interfaceC4233c.mo1333d() == c1258b.f4121c.f13904g && interfaceC2760d == c1258b.f4122d) {
            return c1258b;
        }
        C1258b c1258b2 = C1258b.f4118h;
        if (c1258b2 != null && enumC4243m == c1258b2.f4119a && AbstractC1923e0.m4790h(c1941n0, enumC4243m).equals(c1258b2.f4120b) && interfaceC4233c.mo1333d() == c1258b2.f4121c.f13904g && interfaceC2760d == c1258b2.f4122d) {
            return c1258b2;
        }
        C1258b c1258b3 = new C1258b(enumC4243m, AbstractC1923e0.m4790h(c1941n0, enumC4243m), new C4234d(interfaceC4233c.mo1333d(), interfaceC4233c.mo1335q0()), interfaceC2760d);
        C1258b.f4118h = c1258b3;
        return c1258b3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015b  */
    /* JADX INFO: renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1718c m1188z(DexKitBridge dexKitBridge, C2138b c2138b) {
        Object objValueOf;
        Object c3959f;
        dexKitBridge.getClass();
        ArrayList arrayList = new ArrayList();
        int iM3645b = c2138b.m3645b(4);
        int iM3649f = iM3645b != 0 ? c2138b.m3649f(iM3645b) : 0;
        for (int i9 = 0; i9 < iM3649f; i9++) {
            C2137a c2137a = new C2137a();
            int iM3645b2 = c2138b.m3645b(4);
            ByteBuffer byteBufferOrder = null;
            if (iM3645b2 != 0) {
                int iM3644a = c2138b.m3644a((i9 * 4) + c2138b.m3648e(iM3645b2));
                ByteBuffer byteBuffer = c2138b.f4500b;
                byteBuffer.getClass();
                c2137a.m3646c(iM3644a, byteBuffer);
            } else {
                c2137a = null;
            }
            c2137a.getClass();
            int iM3645b3 = c2137a.m3645b(6);
            int iM257u = AbstractC0018a.m257u(iM3645b3 != 0 ? c2137a.f4500b.get(iM3645b3 + c2137a.f4499a) : (byte) 0);
            switch (AbstractC4106c.m8279b(iM257u)) {
                case 0:
                    AbstractC1355c abstractC1355cM5372p = c2137a.m5372p(new C2142f());
                    abstractC1355cM5372p.getClass();
                    C2142f c2142f = (C2142f) abstractC1355cM5372p;
                    int iM3645b4 = c2142f.m3645b(4);
                    objValueOf = Byte.valueOf(iM3645b4 != 0 ? c2142f.f4500b.get(iM3645b4 + c2142f.f4499a) : (byte) 0);
                    break;
                case 1:
                    AbstractC1355c abstractC1355cM5372p2 = c2137a.m5372p(new C2149m());
                    abstractC1355cM5372p2.getClass();
                    C2149m c2149m = (C2149m) abstractC1355cM5372p2;
                    int iM3645b5 = c2149m.m3645b(4);
                    objValueOf = Short.valueOf(iM3645b5 != 0 ? c2149m.f4500b.getShort(iM3645b5 + c2149m.f4499a) : (short) 0);
                    break;
                case 2:
                    AbstractC1355c abstractC1355cM5372p3 = c2137a.m5372p(new C2143g());
                    abstractC1355cM5372p3.getClass();
                    C2143g c2143g = (C2143g) abstractC1355cM5372p3;
                    int iM3645b6 = c2143g.m3645b(4);
                    objValueOf = Short.valueOf(iM3645b6 != 0 ? c2143g.f4500b.getShort(iM3645b6 + c2143g.f4499a) : (short) 0);
                    break;
                case 3:
                    AbstractC1355c abstractC1355cM5372p4 = c2137a.m5372p(new C2146j());
                    abstractC1355cM5372p4.getClass();
                    C2146j c2146j = (C2146j) abstractC1355cM5372p4;
                    int iM3645b7 = c2146j.m3645b(4);
                    objValueOf = Integer.valueOf(iM3645b7 != 0 ? c2146j.f4500b.getInt(iM3645b7 + c2146j.f4499a) : 0);
                    break;
                case 4:
                    AbstractC1355c abstractC1355cM5372p5 = c2137a.m5372p(new C2147k());
                    abstractC1355cM5372p5.getClass();
                    C2147k c2147k = (C2147k) abstractC1355cM5372p5;
                    int iM3645b8 = c2147k.m3645b(4);
                    objValueOf = Long.valueOf(iM3645b8 != 0 ? c2147k.f4500b.getLong(iM3645b8 + c2147k.f4499a) : 0L);
                    break;
                case 5:
                    AbstractC1355c abstractC1355cM5372p6 = c2137a.m5372p(new C2145i());
                    abstractC1355cM5372p6.getClass();
                    C2145i c2145i = (C2145i) abstractC1355cM5372p6;
                    int iM3645b9 = c2145i.m3645b(4);
                    objValueOf = Float.valueOf(iM3645b9 != 0 ? c2145i.f4500b.getFloat(iM3645b9 + c2145i.f4499a) : 0.0f);
                    break;
                case 6:
                    AbstractC1355c abstractC1355cM5372p7 = c2137a.m5372p(new C2144h());
                    abstractC1355cM5372p7.getClass();
                    C2144h c2144h = (C2144h) abstractC1355cM5372p7;
                    int iM3645b10 = c2144h.m3645b(4);
                    objValueOf = Double.valueOf(iM3645b10 != 0 ? c2144h.f4500b.getDouble(iM3645b10 + c2144h.f4499a) : 0.0d);
                    break;
                case 7:
                    AbstractC1355c abstractC1355cM5372p8 = c2137a.m5372p(new C2150n());
                    abstractC1355cM5372p8.getClass();
                    C2150n c2150n = (C2150n) abstractC1355cM5372p8;
                    try {
                        try {
                            int iM3645b11 = c2150n.m3645b(4);
                            String strM3647d = iM3645b11 != 0 ? c2150n.m3647d(iM3645b11 + c2150n.f4499a) : null;
                            strM3647d.getClass();
                            objValueOf = strM3647d;
                        } catch (IllegalArgumentException unused) {
                            int iM3645b12 = c2150n.m3645b(4);
                            if (iM3645b12 != 0) {
                                byteBufferOrder = c2150n.f4500b.duplicate().order(ByteOrder.LITTLE_ENDIAN);
                                int iM3648e = c2150n.m3648e(iM3645b12);
                                byteBufferOrder.position(iM3648e);
                                byteBufferOrder.limit(c2150n.m3649f(iM3645b12) + iM3648e);
                            }
                            byteBufferOrder.getClass();
                            c3959f = AbstractC1089i.m2789s(m1179q(byteBufferOrder));
                            if (C3960g.m8182b(c3959f) != null) {
                                c3959f = HttpUrl.FRAGMENT_ENCODE_SET;
                            }
                            objValueOf = (String) c3959f;
                            arrayList.add(new C1719d(objValueOf, iM257u));
                        }
                    } catch (Throwable th2) {
                        c3959f = new C3959f(th2);
                        if (C3960g.m8182b(c3959f) != null) {
                        }
                        objValueOf = (String) c3959f;
                        arrayList.add(new C1719d(objValueOf, iM257u));
                    }
                    break;
                case 8:
                    AbstractC1355c abstractC1355cM5372p9 = c2137a.m5372p(new C2140d());
                    abstractC1355cM5372p9.getClass();
                    objValueOf = AbstractC1089i.m2795v(dexKitBridge, (C2140d) abstractC1355cM5372p9);
                    break;
                case 9:
                    AbstractC1355c abstractC1355cM5372p10 = c2137a.m5372p(new C2152p());
                    abstractC1355cM5372p10.getClass();
                    objValueOf = AbstractC1341a.m3600p(dexKitBridge, (C2152p) abstractC1355cM5372p10);
                    break;
                case 10:
                    AbstractC1355c abstractC1355cM5372p11 = c2137a.m5372p(new C2151o());
                    abstractC1355cM5372p11.getClass();
                    objValueOf = AbstractC1184v0.m3208r(dexKitBridge, (C2151o) abstractC1355cM5372p11);
                    break;
                case 11:
                    AbstractC1355c abstractC1355cM5372p12 = c2137a.m5372p(new C2138b());
                    abstractC1355cM5372p12.getClass();
                    objValueOf = m1188z(dexKitBridge, (C2138b) abstractC1355cM5372p12);
                    break;
                case 12:
                    AbstractC1355c abstractC1355cM5372p13 = c2137a.m5372p(new C2139c());
                    abstractC1355cM5372p13.getClass();
                    objValueOf = AbstractC0063p.m426s(dexKitBridge, (C2139c) abstractC1355cM5372p13);
                    break;
                case 13:
                    AbstractC1355c abstractC1355cM5372p14 = c2137a.m5372p(new C2148l());
                    abstractC1355cM5372p14.getClass();
                    objValueOf = (C2148l) abstractC1355cM5372p14;
                    break;
                case 14:
                    AbstractC1355c abstractC1355cM5372p15 = c2137a.m5372p(new C2141e());
                    abstractC1355cM5372p15.getClass();
                    C2141e c2141e = (C2141e) abstractC1355cM5372p15;
                    int iM3645b13 = c2141e.m3645b(4);
                    objValueOf = Boolean.valueOf((iM3645b13 == 0 || ((byte) 0) == c2141e.f4500b.get(iM3645b13 + c2141e.f4499a)) ? false : true);
                    break;
                default:
                    C3193a.m6822k();
                    return null;
            }
            arrayList.add(new C1719d(objValueOf, iM257u));
        }
        return new C1718c(dexKitBridge, arrayList);
    }
}
