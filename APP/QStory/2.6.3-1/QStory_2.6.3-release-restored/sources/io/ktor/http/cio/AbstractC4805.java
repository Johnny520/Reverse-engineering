package io.ktor.http.cio;

import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.compose.foundation.lazy.C1594;
import androidx.core.view.C3075;
import androidx.window.area.AbstractC3400;
import com.materialkolor.dynamiccolor.C4639;
import io.ktor.http.cio.internals.AbstractC4782;
import io.ktor.http.cio.internals.C4785;
import io.ktor.http.cio.internals.C4786;
import io.ktor.http.cio.internals.C4788;
import io.ktor.util.C5043;
import io.ktor.utils.p007io.AbstractC5076;
import io.ktor.utils.p007io.C5081;
import io.ktor.utils.p007io.InterfaceC5084;
import java.util.List;
import java.util.Set;
import kotlin.AbstractC6017;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5179;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5976;
import net.bytebuddy.pool.TypePool;
import p050.AbstractC7176;
import p191.AbstractC8568;
import p252.AbstractC8944;
import p252.C8928;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.http.cio.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4805 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C3075 f12563;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Set f12564 = AbstractC5179.m9404(new Character[]{'/', '?', '#', '@'});

    static {
        List listM12490 = AbstractC7176.m12490("HTTP/1.0", "HTTP/1.1");
        listM12490.getClass();
        int i = 12;
        f12563 = AbstractC1298.m1719(listM12490, new C4639(i), new C1594(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a A[Catch: all -> 0x0059, TRY_LEAVE, TryCatch #2 {all -> 0x0059, blocks: (B:20:0x0055, B:29:0x0081, B:32:0x008a), top: B:52:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bf A[Catch: all -> 0x00c6, TryCatch #1 {all -> 0x00c6, blocks: (B:36:0x00bb, B:38:0x00bf, B:42:0x00ca), top: B:50:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m8926(InterfaceC5084 interfaceC5084, ContinuationImpl continuationImpl) throws Throwable {
        HttpParserKt$parseResponse$1 httpParserKt$parseResponse$1;
        Throwable th;
        C4785 c4785;
        InterfaceC5084 interfaceC50842;
        C4788 c4788;
        C4785 c47852;
        CharSequence charSequence;
        C4785 c47853;
        int i;
        CharSequence charSequence2;
        C4806 c4806;
        if (continuationImpl instanceof HttpParserKt$parseResponse$1) {
            httpParserKt$parseResponse$1 = (HttpParserKt$parseResponse$1) continuationImpl;
            int i2 = httpParserKt$parseResponse$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                httpParserKt$parseResponse$1.label = i2 - Integer.MIN_VALUE;
            } else {
                httpParserKt$parseResponse$1 = new HttpParserKt$parseResponse$1(continuationImpl);
            }
        }
        Object obj = httpParserKt$parseResponse$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = httpParserKt$parseResponse$1.label;
        if (i3 == 0) {
            AbstractC6017.m10769(obj);
            C4785 c47854 = new C4785();
            C4788 c47882 = new C4788();
            try {
                httpParserKt$parseResponse$1.L$0 = interfaceC5084;
                httpParserKt$parseResponse$1.L$1 = c47854;
                httpParserKt$parseResponse$1.L$2 = c47882;
                httpParserKt$parseResponse$1.label = 1;
                Object objM9231 = AbstractC5076.m9231(interfaceC5084, c47854, 8192, httpParserKt$parseResponse$1);
                if (objM9231 != coroutineSingletons) {
                    interfaceC50842 = interfaceC5084;
                    c4788 = c47882;
                    c47852 = c47854;
                    obj = objM9231;
                    if (((Boolean) obj).booleanValue()) {
                    }
                }
                return coroutineSingletons;
            } catch (Throwable th2) {
                th = th2;
                c4785 = c47854;
            }
        } else if (i3 == 1) {
            c4788 = (C4788) httpParserKt$parseResponse$1.L$2;
            c47852 = (C4785) httpParserKt$parseResponse$1.L$1;
            interfaceC50842 = (InterfaceC5084) httpParserKt$parseResponse$1.L$0;
            try {
                AbstractC6017.m10769(obj);
                if (((Boolean) obj).booleanValue()) {
                    return null;
                }
                c4788.f12525 = c47852.f12513;
                String strM8932 = m8932(c47852, c4788);
                int iM8933 = m8933(c47852, c4788);
                AbstractC3400.m5630(c47852, c4788);
                CharSequence charSequenceSubSequence = c47852.subSequence(c4788.f12526, c4788.f12525);
                c4788.f12526 = c4788.f12525;
                httpParserKt$parseResponse$1.L$0 = c47852;
                httpParserKt$parseResponse$1.L$1 = strM8932;
                httpParserKt$parseResponse$1.L$2 = charSequenceSubSequence;
                httpParserKt$parseResponse$1.I$0 = iM8933;
                httpParserKt$parseResponse$1.label = 2;
                Object objM8929 = m8929(interfaceC50842, c47852, c4788, httpParserKt$parseResponse$1);
                if (objM8929 != coroutineSingletons) {
                    charSequence = strM8932;
                    c47853 = c47852;
                    i = iM8933;
                    charSequence2 = charSequenceSubSequence;
                    obj = objM8929;
                    c4806 = (C4806) obj;
                    if (c4806 == null) {
                    }
                    return new C4795(charSequence, i, charSequence2, c4806, c47853);
                }
                return coroutineSingletons;
            } catch (Throwable th3) {
                th = th3;
                c4785 = c47852;
            }
        } else {
            if (i3 != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i4 = httpParserKt$parseResponse$1.I$0;
            CharSequence charSequence3 = (CharSequence) httpParserKt$parseResponse$1.L$2;
            CharSequence charSequence4 = (CharSequence) httpParserKt$parseResponse$1.L$1;
            c4785 = (C4785) httpParserKt$parseResponse$1.L$0;
            try {
                AbstractC6017.m10769(obj);
                i = i4;
                charSequence2 = charSequence3;
                charSequence = charSequence4;
                c47853 = c4785;
                try {
                    c4806 = (C4806) obj;
                    if (c4806 == null) {
                        c4806 = new C4806(c47853);
                    }
                    return new C4795(charSequence, i, charSequence2, c4806, c47853);
                } catch (Throwable th4) {
                    th = th4;
                    c4785 = c47853;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
        c4785.m8896();
        throw th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008f A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:13:0x0037, B:30:0x0086, B:33:0x008f, B:35:0x0097, B:43:0x00c0, B:45:0x00cd, B:47:0x00d3, B:49:0x00d9, B:60:0x00fe, B:61:0x0105, B:62:0x0106, B:63:0x010d, B:64:0x010e, B:65:0x0130, B:39:0x00ad, B:41:0x00b5, B:42:0x00ba, B:26:0x0072), top: B:69:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f5 A[Catch: all -> 0x00fb, TRY_LEAVE, TryCatch #1 {all -> 0x00fb, blocks: (B:53:0x00ef, B:56:0x00f5), top: B:70:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2, types: [io.ktor.http.cio.HttpParserKt$parseRequest$1] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0083 -> B:30:0x0086). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m8927(C5081 c5081, ContinuationImpl continuationImpl) throws Throwable {
        C4785 httpParserKt$parseRequest$1;
        C4788 c4788;
        HttpParserKt$parseRequest$1 httpParserKt$parseRequest$12;
        C4785 c4785;
        InterfaceC5084 interfaceC5084;
        Object objM9231;
        CharSequence charSequenceSubSequence;
        C8928 c8928;
        CharSequence charSequence;
        CharSequence charSequence2;
        C4806 c4806;
        if (continuationImpl instanceof HttpParserKt$parseRequest$1) {
            HttpParserKt$parseRequest$1 httpParserKt$parseRequest$13 = (HttpParserKt$parseRequest$1) continuationImpl;
            int i = httpParserKt$parseRequest$13.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                httpParserKt$parseRequest$13.label = i - Integer.MIN_VALUE;
                httpParserKt$parseRequest$1 = httpParserKt$parseRequest$13;
            } else {
                httpParserKt$parseRequest$1 = new HttpParserKt$parseRequest$1(continuationImpl);
            }
        }
        Object obj = httpParserKt$parseRequest$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = httpParserKt$parseRequest$1.label;
        try {
            if (i2 == 0) {
                AbstractC6017.m10769(obj);
                C4785 c47852 = new C4785();
                c4788 = new C4788();
                httpParserKt$parseRequest$12 = httpParserKt$parseRequest$1;
                c4785 = c47852;
                interfaceC5084 = c5081;
                httpParserKt$parseRequest$12.L$0 = interfaceC5084;
                httpParserKt$parseRequest$12.L$1 = c4785;
                httpParserKt$parseRequest$12.L$2 = c4788;
                httpParserKt$parseRequest$12.label = 1;
                objM9231 = AbstractC5076.m9231(interfaceC5084, c4785, 8192, httpParserKt$parseRequest$12);
                if (objM9231 != coroutineSingletons) {
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    CharSequence charSequence3 = (CharSequence) httpParserKt$parseRequest$1.L$3;
                    CharSequence charSequence4 = (CharSequence) httpParserKt$parseRequest$1.L$2;
                    C8928 c89282 = (C8928) httpParserKt$parseRequest$1.L$1;
                    c4785 = (C4785) httpParserKt$parseRequest$1.L$0;
                    AbstractC6017.m10769(obj);
                    charSequence2 = charSequence3;
                    charSequence = charSequence4;
                    c8928 = c89282;
                    C4785 c47853 = c4785;
                    try {
                        c4806 = (C4806) obj;
                        if (c4806 != null) {
                            return new C4798(c8928, charSequence, charSequence2, c4806, c47853);
                        }
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        httpParserKt$parseRequest$1 = c47853;
                        httpParserKt$parseRequest$1.m8896();
                        throw th;
                    }
                }
                C4788 c47882 = (C4788) httpParserKt$parseRequest$1.L$2;
                C4785 c47854 = (C4785) httpParserKt$parseRequest$1.L$1;
                InterfaceC5084 interfaceC50842 = (InterfaceC5084) httpParserKt$parseRequest$1.L$0;
                try {
                    AbstractC6017.m10769(obj);
                    HttpParserKt$parseRequest$1 httpParserKt$parseRequest$14 = httpParserKt$parseRequest$1;
                    c4785 = c47854;
                    c4788 = c47882;
                    if (((Boolean) obj).booleanValue()) {
                        return null;
                    }
                    int i3 = c4785.f12513;
                    c4788.f12525 = i3;
                    if (c4788.f12526 != i3) {
                        C8928 c8928M8928 = m8928(c4785, c4788);
                        AbstractC3400.m5630(c4785, c4788);
                        int i4 = c4788.f12526;
                        int iM5647 = AbstractC3400.m5647(c4785, c4788);
                        int i5 = iM5647 - i4;
                        if (i5 <= 0) {
                            charSequenceSubSequence = "";
                        } else if (i5 == 1 && c4785.charAt(i4) == '/') {
                            c4788.f12526 = iM5647;
                            charSequenceSubSequence = "/";
                        } else {
                            charSequenceSubSequence = c4785.subSequence(i4, iM5647);
                            c4788.f12526 = iM5647;
                        }
                        String strM8932 = m8932(c4785, c4788);
                        AbstractC3400.m5630(c4785, c4788);
                        if (c4788.f12526 != c4788.f12525) {
                            throw new ParserException("Extra characters in request line: " + c4785.subSequence(c4788.f12526, c4788.f12525).toString());
                        }
                        if (charSequenceSubSequence.length() == 0) {
                            throw new ParserException("URI is not specified");
                        }
                        if (strM8932.length() == 0) {
                            throw new ParserException("HTTP version is not specified");
                        }
                        httpParserKt$parseRequest$14.L$0 = c4785;
                        httpParserKt$parseRequest$14.L$1 = c8928M8928;
                        httpParserKt$parseRequest$14.L$2 = charSequenceSubSequence;
                        httpParserKt$parseRequest$14.L$3 = strM8932;
                        httpParserKt$parseRequest$14.label = 2;
                        Object objM8929 = m8929(interfaceC50842, c4785, c4788, httpParserKt$parseRequest$14);
                        if (objM8929 != coroutineSingletons) {
                            c8928 = c8928M8928;
                            obj = objM8929;
                            charSequence = charSequenceSubSequence;
                            charSequence2 = strM8932;
                            C4785 c478532 = c4785;
                            c4806 = (C4806) obj;
                            if (c4806 != null) {
                            }
                            return null;
                        }
                        return coroutineSingletons;
                    }
                    interfaceC5084 = interfaceC50842;
                    httpParserKt$parseRequest$12 = httpParserKt$parseRequest$14;
                    httpParserKt$parseRequest$12.L$0 = interfaceC5084;
                    httpParserKt$parseRequest$12.L$1 = c4785;
                    httpParserKt$parseRequest$12.L$2 = c4788;
                    httpParserKt$parseRequest$12.label = 1;
                    objM9231 = AbstractC5076.m9231(interfaceC5084, c4785, 8192, httpParserKt$parseRequest$12);
                    if (objM9231 != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    interfaceC50842 = interfaceC5084;
                    obj = objM9231;
                    httpParserKt$parseRequest$14 = httpParserKt$parseRequest$12;
                    if (((Boolean) obj).booleanValue()) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    httpParserKt$parseRequest$1 = c47854;
                    httpParserKt$parseRequest$1.m8896();
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C8928 m8928(C4785 c4785, C4788 c4788) {
        AbstractC3400.m5630(c4785, c4788);
        C8928 c8928 = (C8928) AbstractC5176.m9340(C3075.m4701(AbstractC4782.f12508, c4785, c4788.f12526, c4788.f12525, new C1594(10), 8));
        if (c8928 != null) {
            c4788.f12526 = c8928.f22719.length() + c4788.f12526;
            return c8928;
        }
        int iM5647 = AbstractC3400.m5647(c4785, c4788);
        CharSequence charSequenceSubSequence = c4785.subSequence(c4788.f12526, iM5647);
        c4788.f12526 = iM5647;
        return new C8928(charSequenceSubSequence.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00cc, code lost:
    
        m8931(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00cf, code lost:
    
        throw r20;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077 A[Catch: all -> 0x007b, TryCatch #1 {all -> 0x007b, blocks: (B:23:0x006f, B:25:0x0077, B:29:0x007f, B:32:0x008a, B:35:0x009a, B:38:0x00a6, B:40:0x00ab, B:56:0x00df, B:43:0x00b5, B:52:0x00cc, B:53:0x00cf, B:54:0x00d0, B:55:0x00d7, B:57:0x00f6, B:58:0x00fd, B:59:0x00fe, B:61:0x0108), top: B:69:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007f A[Catch: all -> 0x007b, TryCatch #1 {all -> 0x007b, blocks: (B:23:0x006f, B:25:0x0077, B:29:0x007f, B:32:0x008a, B:35:0x009a, B:38:0x00a6, B:40:0x00ab, B:56:0x00df, B:43:0x00b5, B:52:0x00cc, B:53:0x00cf, B:54:0x00d0, B:55:0x00d7, B:57:0x00f6, B:58:0x00fd, B:59:0x00fe, B:61:0x0108), top: B:69:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x006b -> B:69:0x006f). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m8929(InterfaceC5084 interfaceC5084, C4785 c4785, C4788 c4788, ContinuationImpl continuationImpl) throws Throwable {
        HttpParserKt$parseHeaders$2 httpParserKt$parseHeaders$2;
        C4785 c47852;
        C4806 c4806;
        HttpParserKt$parseHeaders$2 httpParserKt$parseHeaders$22;
        InterfaceC5084 interfaceC50842;
        C4788 c47882;
        Throwable th;
        Object objM9231;
        C4806 c48062;
        int iM8930;
        int iM8891;
        int i;
        Throwable th2;
        if (continuationImpl instanceof HttpParserKt$parseHeaders$2) {
            httpParserKt$parseHeaders$2 = (HttpParserKt$parseHeaders$2) continuationImpl;
            int i2 = httpParserKt$parseHeaders$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                httpParserKt$parseHeaders$2.label = i2 - Integer.MIN_VALUE;
            } else {
                httpParserKt$parseHeaders$2 = new HttpParserKt$parseHeaders$2(continuationImpl);
            }
        }
        Object obj = httpParserKt$parseHeaders$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = httpParserKt$parseHeaders$2.label;
        Throwable th3 = null;
        int i4 = 8192;
        if (i3 == 0) {
            AbstractC6017.m10769(obj);
            c47852 = c4785;
            c4806 = new C4806(c47852);
            httpParserKt$parseHeaders$22 = httpParserKt$parseHeaders$2;
            interfaceC50842 = interfaceC5084;
            c47882 = c4788;
            httpParserKt$parseHeaders$22.L$0 = interfaceC50842;
            httpParserKt$parseHeaders$22.L$1 = c47852;
            httpParserKt$parseHeaders$22.L$2 = c47882;
            httpParserKt$parseHeaders$22.L$3 = c4806;
            httpParserKt$parseHeaders$22.label = 1;
            objM9231 = AbstractC5076.m9231(interfaceC50842, c47852, i4, httpParserKt$parseHeaders$22);
            if (objM9231 != coroutineSingletons) {
            }
        } else {
            if (i3 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            C4806 c48063 = (C4806) httpParserKt$parseHeaders$2.L$3;
            C4788 c47883 = (C4788) httpParserKt$parseHeaders$2.L$2;
            C4785 c47853 = (C4785) httpParserKt$parseHeaders$2.L$1;
            InterfaceC5084 interfaceC50843 = (InterfaceC5084) httpParserKt$parseHeaders$2.L$0;
            try {
                AbstractC6017.m10769(obj);
                httpParserKt$parseHeaders$22 = httpParserKt$parseHeaders$2;
                c47882 = c47883;
                c48062 = c48063;
                c47852 = c47853;
            } catch (Throwable th4) {
                th = th4;
                c48063.m8936();
                throw th;
            }
            try {
                if (((Boolean) obj).booleanValue()) {
                    c48062.m8936();
                    return th3;
                }
                int i5 = c47852.f12513;
                c47882.f12525 = i5;
                int i6 = c47882.f12526;
                int i7 = i5 - i6;
                if (i7 == 0) {
                    String[] strArr = AbstractC8944.f22758;
                    C4786 c4786M8939 = c48062.m8939("Host");
                    if (c4786M8939 != null) {
                        m8934(c4786M8939);
                    }
                    return c48062;
                }
                if (i7 >= i4) {
                    throw new IllegalStateException("Header line length limit exceeded");
                }
                try {
                    iM8930 = m8930(c47852, c47882);
                    iM8891 = AbstractC4782.m8891(c47852, i6, iM8930);
                    i = c47882.f12525;
                    int i8 = c47882.f12526;
                    while (i8 < i) {
                        char cCharAt = c47852.charAt(i8);
                        if (!AbstractC8568.m13623(cCharAt) && cCharAt != '\t') {
                            break;
                        }
                        i8++;
                    }
                    if (i8 >= i) {
                        c47882.f12526 = i;
                        th2 = th3;
                    } else {
                        int i9 = i8;
                        int i10 = i9;
                        while (i9 < i) {
                            Throwable th5 = th3;
                            char cCharAt2 = c47852.charAt(i9);
                            if (cCharAt2 != '\t') {
                                if (cCharAt2 == '\n' || cCharAt2 == '\r') {
                                    break;
                                }
                                if (cCharAt2 != ' ') {
                                    i10 = i9;
                                }
                            }
                            i9++;
                            th3 = th5;
                        }
                        th2 = th3;
                        c47882.f12526 = i8;
                        c47882.f12525 = i10 + 1;
                    }
                    httpParserKt$parseHeaders$22.L$0 = interfaceC50842;
                    httpParserKt$parseHeaders$22.L$1 = c47852;
                    httpParserKt$parseHeaders$22.L$2 = c47882;
                    httpParserKt$parseHeaders$22.L$3 = c4806;
                    httpParserKt$parseHeaders$22.label = 1;
                    objM9231 = AbstractC5076.m9231(interfaceC50842, c47852, i4, httpParserKt$parseHeaders$22);
                    if (objM9231 != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    interfaceC50843 = interfaceC50842;
                    obj = objM9231;
                    c48062 = c4806;
                    if (((Boolean) obj).booleanValue()) {
                    }
                } catch (Throwable th6) {
                    th = th6;
                    c48063 = c4806;
                    c48063.m8936();
                    throw th;
                }
                int i11 = c47882.f12526;
                int i12 = c47882.f12525;
                int iM88912 = AbstractC4782.m8891(c47852, i11, i12);
                c47882.f12526 = i;
                c48062.m8937(iM8891, iM88912, i6, iM8930, i11, i12);
                th3 = th2;
                interfaceC50842 = interfaceC50843;
                c4806 = c48062;
                i4 = 8192;
            } catch (Throwable th7) {
                th = th7;
                c48063 = c48062;
                c48063.m8936();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final int m8930(C4785 c4785, C4788 c4788) {
        int i = c4788.f12525;
        for (int i2 = c4788.f12526; i2 < i; i2++) {
            char cCharAt = c4785.charAt(i2);
            if (cCharAt == ':' && i2 != c4788.f12526) {
                c4788.f12526 = i2 + 1;
                return i2;
            }
            if (AbstractC5227.m9464(cCharAt, 32) <= 0 || AbstractC5976.m10722("\"(),/:;<=>?@[\\]{}", cCharAt)) {
                int i3 = c4788.f12526;
                if (cCharAt == ':') {
                    throw new ParserException("Empty header names are not allowed as per RFC7230.");
                }
                if (i2 == i3) {
                    throw new ParserException("Multiline headers via line folding is not supported since it is deprecated as per RFC7230.");
                }
                m8931(c4785, cCharAt);
                throw null;
            }
        }
        throw new ParserException("No colon in HTTP header in " + c4785.subSequence(c4788.f12526, c4788.f12525).toString() + " in builder: \n" + ((Object) c4785));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m8931(C4785 c4785, char c) {
        throw new ParserException("Character with code " + (c & 255) + " is not allowed in header names, \n" + ((Object) c4785));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final String m8932(C4785 c4785, C4788 c4788) {
        AbstractC3400.m5630(c4785, c4788);
        int i = c4788.f12526;
        int i2 = c4788.f12525;
        if (i >= i2) {
            C5043.m9174(c4785, "Failed to parse version: ");
            return null;
        }
        String str = (String) AbstractC5176.m9340(C3075.m4701(f12563, c4785, i, i2, new C1594(11), 8));
        if (str != null) {
            c4788.f12526 = str.length() + c4788.f12526;
            return str;
        }
        int iM5647 = AbstractC3400.m5647(c4785, c4788);
        CharSequence charSequenceSubSequence = c4785.subSequence(c4788.f12526, iM5647);
        c4788.f12526 = iM5647;
        throw new ParserException("Unsupported HTTP version: " + ((Object) charSequenceSubSequence));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
    
        r6.f12526 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0071, code lost:
    
        return r2;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int m8933(C4785 c4785, C4788 c4788) {
        char cCharAt;
        AbstractC3400.m5630(c4785, c4788);
        int i = c4788.f12525;
        int i2 = c4788.f12526;
        int i3 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            cCharAt = c4785.charAt(i2);
            if (cCharAt == ' ') {
                if (i3 < 100 || i3 > 999) {
                    throw new ParserException("Status-code must be 3-digit. Status received: " + i3 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
                }
                i = i2;
            } else {
                if ('0' > cCharAt || cCharAt >= ':') {
                    break;
                }
                i3 = (i3 * 10) + (cCharAt - '0');
                i2++;
            }
        }
        throw new NumberFormatException("Illegal digit " + cCharAt + " in status code " + c4785.subSequence(c4788.f12526, AbstractC3400.m5647(c4785, c4788)).toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final void m8934(C4786 c4786) {
        if (AbstractC5976.m10719(c4786, ":")) {
            throw new ParserException("Host header with ':' should contains port: " + ((Object) c4786));
        }
        for (int i = 0; i < c4786.length(); i++) {
            Character chValueOf = Character.valueOf(c4786.charAt(i));
            Set set = f12564;
            if (set.contains(chValueOf)) {
                throw new ParserException("Host cannot contain any of the following symbols: " + set);
            }
        }
    }
}
