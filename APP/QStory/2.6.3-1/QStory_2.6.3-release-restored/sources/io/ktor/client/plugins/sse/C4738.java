package io.ktor.client.plugins.sse;

import io.ktor.utils.p007io.AbstractC5076;
import io.ktor.utils.p007io.InterfaceC5084;
import kotlin.AbstractC6017;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.AbstractC5971;
import kotlin.text.AbstractC5976;
import kotlin.time.C5989;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C6134;
import p261.C8982;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.client.plugins.sse.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4738 implements InterfaceC6233 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final boolean f12455;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f12456;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC5192 f12457;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public String f12458;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC5084 f12459;

    public C4738(C4736 c4736, InterfaceC5084 interfaceC5084, InterfaceC5192 interfaceC5192) {
        interfaceC5084.getClass();
        interfaceC5192.getClass();
        this.f12459 = interfaceC5084;
        this.f12457 = interfaceC5192;
        C5989.m10748(c4736.f12452);
        this.f12456 = c4736.f12451;
        this.f12455 = c4736.f12450;
        new C6134(new DefaultClientSSESession$_incoming$1(this, null), EmptyCoroutineContext.INSTANCE, -2, BufferOverflow.SUSPEND);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e9, code lost:
    
        if (r2 == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f1, code lost:
    
        if (kotlin.text.AbstractC5976.m10731(r2) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f3, code lost:
    
        r3.L$0 = r15;
        r3.L$1 = r14;
        r3.L$2 = r13;
        r3.L$3 = r12;
        r3.L$4 = r11;
        r3.L$5 = r5;
        r3.I$0 = r1;
        r3.I$1 = r0;
        r3.label = 2;
        r2 = io.ktor.utils.p007io.AbstractC5076.m9230(r14, Integer.MAX_VALUE, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0109, code lost:
    
        if (r2 != r4) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x010f, code lost:
    
        if (r2 == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0113, code lost:
    
        r8 = r14;
        r14 = r5;
        r5 = r15;
        r15 = r8;
        r8 = r11;
        r11 = r13;
        r13 = r12;
        r12 = r19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0233  */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, java.lang.Long] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0109 -> B:30:0x010d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x0229 -> B:92:0x022d). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m8844(C4738 c4738, InterfaceC5084 interfaceC5084, ContinuationImpl continuationImpl) {
        DefaultClientSSESession$parseEvent$1 defaultClientSSESession$parseEvent$1;
        String str;
        StringBuilder sb;
        StringBuilder sb2;
        Ref$ObjectRef ref$ObjectRef;
        String str2;
        C4738 c47382;
        InterfaceC5084 interfaceC50842;
        int i;
        int i2;
        String str3;
        StringBuilder sb3;
        InterfaceC5084 interfaceC50843;
        int i3;
        Long lM10697;
        String str4;
        String str5;
        c4738.getClass();
        if (continuationImpl instanceof DefaultClientSSESession$parseEvent$1) {
            defaultClientSSESession$parseEvent$1 = (DefaultClientSSESession$parseEvent$1) continuationImpl;
            int i4 = defaultClientSSESession$parseEvent$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                defaultClientSSESession$parseEvent$1.label = i4 - Integer.MIN_VALUE;
            } else {
                defaultClientSSESession$parseEvent$1 = new DefaultClientSSESession$parseEvent$1(c4738, continuationImpl);
            }
        }
        Object objM9230 = defaultClientSSESession$parseEvent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = defaultClientSSESession$parseEvent$1.label;
        if (i5 == 0) {
            str = null;
            AbstractC6017.m10769(objM9230);
            sb = new StringBuilder();
            sb2 = new StringBuilder();
            ref$ObjectRef = new Ref$ObjectRef();
            str2 = c4738.f12458;
            defaultClientSSESession$parseEvent$1.L$0 = c4738;
            defaultClientSSESession$parseEvent$1.L$1 = interfaceC5084;
            defaultClientSSESession$parseEvent$1.L$2 = sb;
            defaultClientSSESession$parseEvent$1.L$3 = sb2;
            defaultClientSSESession$parseEvent$1.L$4 = ref$ObjectRef;
            defaultClientSSESession$parseEvent$1.L$5 = str2;
            defaultClientSSESession$parseEvent$1.I$0 = 0;
            defaultClientSSESession$parseEvent$1.I$1 = 0;
            defaultClientSSESession$parseEvent$1.label = 1;
            objM9230 = AbstractC5076.m9230(interfaceC5084, Integer.MAX_VALUE, defaultClientSSESession$parseEvent$1);
            if (objM9230 != coroutineSingletons) {
                c47382 = c4738;
                interfaceC50842 = interfaceC5084;
                i = 0;
                i2 = 0;
            }
            return coroutineSingletons;
        }
        if (i5 == 1) {
            str = null;
            i = defaultClientSSESession$parseEvent$1.I$1;
            i2 = defaultClientSSESession$parseEvent$1.I$0;
            str2 = (String) defaultClientSSESession$parseEvent$1.L$5;
            ref$ObjectRef = (Ref$ObjectRef) defaultClientSSESession$parseEvent$1.L$4;
            sb2 = (StringBuilder) defaultClientSSESession$parseEvent$1.L$3;
            sb = (StringBuilder) defaultClientSSESession$parseEvent$1.L$2;
            interfaceC50842 = (InterfaceC5084) defaultClientSSESession$parseEvent$1.L$1;
            c47382 = (C4738) defaultClientSSESession$parseEvent$1.L$0;
            AbstractC6017.m10769(objM9230);
        } else {
            if (i5 != 2) {
                if (i5 != 3) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = defaultClientSSESession$parseEvent$1.I$1;
                i2 = defaultClientSSESession$parseEvent$1.I$0;
                String str6 = (String) defaultClientSSESession$parseEvent$1.L$6;
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) defaultClientSSESession$parseEvent$1.L$5;
                String str7 = (String) defaultClientSSESession$parseEvent$1.L$4;
                StringBuilder sb4 = (StringBuilder) defaultClientSSESession$parseEvent$1.L$3;
                StringBuilder sb5 = (StringBuilder) defaultClientSSESession$parseEvent$1.L$2;
                InterfaceC5084 interfaceC50844 = (InterfaceC5084) defaultClientSSESession$parseEvent$1.L$1;
                str = null;
                C4738 c47383 = (C4738) defaultClientSSESession$parseEvent$1.L$0;
                AbstractC6017.m10769(objM9230);
                Object objM92302 = objM9230;
                char c = 3;
                String str8 = str6;
                C4738 c47384 = c47383;
                char c2 = 65535;
                StringBuilder sb6 = sb4;
                String str9 = str7;
                boolean z = false;
                String str10 = (String) objM92302;
                if (str10 != null) {
                    StringBuilder sb7 = sb5;
                    String str11 = str8;
                    str3 = str10;
                    String str12 = str9;
                    StringBuilder sb8 = sb6;
                    if (!AbstractC5976.m10731(str3)) {
                        sb3 = sb7;
                        sb6 = sb8;
                        interfaceC50843 = interfaceC50844;
                        str9 = str12;
                        if (AbstractC5971.m10698(str3, ":", false)) {
                            c47384.getClass();
                            sb6.append(AbstractC5976.m10706(AbstractC5976.m10706(str3, ":"), " "));
                            sb6.append("\r\n");
                            i = 1;
                        } else {
                            String strM10713 = AbstractC5976.m10713(str3, ":");
                            i3 = i;
                            String strM10706 = AbstractC5976.m10706(AbstractC5976.m10700(str3, ":", ""), " ");
                            int iHashCode = strM10713.hashCode();
                            if (iHashCode == 3355) {
                                if (strM10713.equals("id")) {
                                    z = false;
                                    if (!AbstractC5976.m10735(strM10706, "\u0000", false)) {
                                        str11 = strM10706;
                                    }
                                }
                                i = i3;
                                defaultClientSSESession$parseEvent$1.L$0 = c47384;
                                defaultClientSSESession$parseEvent$1.L$1 = interfaceC50843;
                                defaultClientSSESession$parseEvent$1.L$2 = sb3;
                                defaultClientSSESession$parseEvent$1.L$3 = sb6;
                                defaultClientSSESession$parseEvent$1.L$4 = str9;
                                defaultClientSSESession$parseEvent$1.L$5 = ref$ObjectRef2;
                                defaultClientSSESession$parseEvent$1.L$6 = str11;
                                defaultClientSSESession$parseEvent$1.I$0 = i2;
                                defaultClientSSESession$parseEvent$1.I$1 = i;
                                c = 3;
                                defaultClientSSESession$parseEvent$1.label = 3;
                                c2 = 65535;
                                objM92302 = AbstractC5076.m9230(interfaceC50843, Integer.MAX_VALUE, defaultClientSSESession$parseEvent$1);
                                if (objM92302 != coroutineSingletons) {
                                    String str13 = str11;
                                    sb5 = sb3;
                                    str8 = str13;
                                    interfaceC50844 = interfaceC50843;
                                    String str102 = (String) objM92302;
                                    if (str102 != null) {
                                    }
                                }
                                return coroutineSingletons;
                            }
                            if (iHashCode == 3076010) {
                                if (strM10713.equals("data")) {
                                    sb3.append(strM10706);
                                    sb3.append("\r\n");
                                    i = i3;
                                    i2 = 1;
                                }
                            } else if (iHashCode == 96891546) {
                                if (strM10713.equals("event")) {
                                    str9 = strM10706;
                                }
                            } else if (iHashCode == 108405416 && strM10713.equals("retry") && (lM10697 = AbstractC5971.m10697(strM10706)) != null) {
                                long jLongValue = lM10697.longValue();
                                c47384.getClass();
                                ref$ObjectRef2.element = new Long(jLongValue);
                            }
                        }
                        z = false;
                        defaultClientSSESession$parseEvent$1.L$0 = c47384;
                        defaultClientSSESession$parseEvent$1.L$1 = interfaceC50843;
                        defaultClientSSESession$parseEvent$1.L$2 = sb3;
                        defaultClientSSESession$parseEvent$1.L$3 = sb6;
                        defaultClientSSESession$parseEvent$1.L$4 = str9;
                        defaultClientSSESession$parseEvent$1.L$5 = ref$ObjectRef2;
                        defaultClientSSESession$parseEvent$1.L$6 = str11;
                        defaultClientSSESession$parseEvent$1.I$0 = i2;
                        defaultClientSSESession$parseEvent$1.I$1 = i;
                        c = 3;
                        defaultClientSSESession$parseEvent$1.label = 3;
                        c2 = 65535;
                        objM92302 = AbstractC5076.m9230(interfaceC50843, Integer.MAX_VALUE, defaultClientSSESession$parseEvent$1);
                        if (objM92302 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                    c47384.f12458 = str11;
                    StringBuilder sb9 = sb7;
                    String strM10710 = i2 != 0 ? AbstractC5976.m10710(sb9.toString(), "\r\n") : str;
                    Long l = (Long) ref$ObjectRef2.element;
                    if (i != 0) {
                        String strM107102 = AbstractC5976.m10710(sb8.toString(), "\r\n");
                        String str14 = str12;
                        str4 = strM10710;
                        sb6 = sb8;
                        str9 = str14;
                        str5 = strM107102;
                    } else {
                        String str15 = str12;
                        str4 = strM10710;
                        sb6 = sb8;
                        str9 = str15;
                        str5 = str;
                    }
                    interfaceC50843 = interfaceC50844;
                    sb3 = sb9;
                    C8982 c8982 = new C8982(str4, str9, str11, l, str5);
                    String str16 = str5;
                    if (str4 != null || str11 != null || str9 != null || l != null || str16 != null) {
                        return c8982;
                    }
                    i3 = i;
                    z = false;
                    i = i3;
                    defaultClientSSESession$parseEvent$1.L$0 = c47384;
                    defaultClientSSESession$parseEvent$1.L$1 = interfaceC50843;
                    defaultClientSSESession$parseEvent$1.L$2 = sb3;
                    defaultClientSSESession$parseEvent$1.L$3 = sb6;
                    defaultClientSSESession$parseEvent$1.L$4 = str9;
                    defaultClientSSESession$parseEvent$1.L$5 = ref$ObjectRef2;
                    defaultClientSSESession$parseEvent$1.L$6 = str11;
                    defaultClientSSESession$parseEvent$1.I$0 = i2;
                    defaultClientSSESession$parseEvent$1.I$1 = i;
                    c = 3;
                    defaultClientSSESession$parseEvent$1.label = 3;
                    c2 = 65535;
                    objM92302 = AbstractC5076.m9230(interfaceC50843, Integer.MAX_VALUE, defaultClientSSESession$parseEvent$1);
                    if (objM92302 != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                return str;
            }
            str = null;
            i = defaultClientSSESession$parseEvent$1.I$1;
            i2 = defaultClientSSESession$parseEvent$1.I$0;
            str2 = (String) defaultClientSSESession$parseEvent$1.L$5;
            ref$ObjectRef = (Ref$ObjectRef) defaultClientSSESession$parseEvent$1.L$4;
            sb2 = (StringBuilder) defaultClientSSESession$parseEvent$1.L$3;
            sb = (StringBuilder) defaultClientSSESession$parseEvent$1.L$2;
            interfaceC50842 = (InterfaceC5084) defaultClientSSESession$parseEvent$1.L$1;
            c47382 = (C4738) defaultClientSSESession$parseEvent$1.L$0;
            AbstractC6017.m10769(objM9230);
            str3 = (String) objM9230;
        }
        str3 = (String) objM9230;
    }

    @Override // kotlinx.coroutines.InterfaceC6233
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final InterfaceC5192 mo2990() {
        return this.f12457;
    }
}
