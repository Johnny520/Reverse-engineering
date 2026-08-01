package androidx.compose.foundation.text.contextmenu.internal;

import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.textclassifier.TextClassification;
import androidx.compose.foundation.layout.AbstractC1460;
import androidx.compose.foundation.layout.AbstractC1484;
import androidx.compose.foundation.lazy.layout.C1536;
import androidx.compose.foundation.text.contextmenu.provider.AbstractC1673;
import androidx.compose.foundation.text.contextmenu.provider.InterfaceC1667;
import androidx.compose.p001ui.C2958;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.draw.AbstractC2280;
import androidx.compose.p001ui.graphics.C2442;
import androidx.compose.p001ui.graphics.painter.AbstractC2363;
import androidx.compose.p001ui.layout.C2539;
import androidx.compose.p001ui.platform.AbstractC2670;
import androidx.compose.p001ui.window.AbstractC2924;
import androidx.compose.p001ui.window.C2923;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2188;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.internal.AbstractC2089;
import androidx.compose.runtime.internal.C2077;
import com.bumptech.glide.AbstractC3888;
import com.bumptech.glide.AbstractC3898;
import java.io.IOException;
import java.util.List;
import kotlin.C6008;
import org.xmlpull.v1.XmlPullParserException;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p137.AbstractC8218;
import p137.C8214;
import p137.C8216;
import p137.C8217;
import p137.C8220;
import p137.InterfaceC8221;
import p193.AbstractC8572;
import p193.AbstractC8576;
import p193.AbstractC8578;
import p193.C8573;
import top.suzhelan.qstory.hook.item.chat.C6686;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1642 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C2923 f2637 = new C2923(30);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m2187(InterfaceC2962 interfaceC2962, C2077 c2077, InterfaceC2208 interfaceC2208, int i) {
        int i2;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(1392105195);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (c2159.m2920(interfaceC2962) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c2159.m2938(c2077) ? 32 : 16;
        }
        if (c2159.m2903(i2 & 1, (i2 & 19) != 18)) {
            AbstractC3888.m7264(interfaceC2962, AbstractC1673.f2714, c2077, c2159, ((i2 << 6) & 7168) | (i2 & 14) | 432);
        } else {
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new C1651(interfaceC2962, c2077, i, i3);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m2188(InterfaceC8221 interfaceC8221, InterfaceC1667 interfaceC1667, InterfaceC7372 interfaceC7372, InterfaceC2208 interfaceC2208, int i) {
        int i2;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(-2040393164);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? c2159.m2920(interfaceC8221) : c2159.m2938(interfaceC8221) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? c2159.m2920(interfaceC1667) : c2159.m2938(interfaceC1667) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c2159.m2938(interfaceC7372) ? 256 : 128;
        }
        boolean z = false;
        int i3 = 1;
        if (c2159.m2903(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32 || ((i2 & 64) != 0 && c2159.m2920(interfaceC1667));
            Object objM2905 = c2159.m2905();
            C2188 c2188 = C2204.f4319;
            if (z2 || objM2905 == c2188) {
                objM2905 = new C1640(new C6686(new C1633(interfaceC1667, i3, interfaceC7372), 20));
                c2159.m2946(objM2905);
            }
            C1640 c1640 = (C1640) objM2905;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && c2159.m2938(interfaceC8221))) {
                z = true;
            }
            Object objM29052 = c2159.m2905();
            if (z || objM29052 == c2188) {
                objM29052 = new C1634(interfaceC8221, 1);
                c2159.m2946(objM29052);
            }
            AbstractC2924.m4395(c1640, (InterfaceC7372) objM29052, f2637, AbstractC2089.m2749(1315155414, new C1646(interfaceC1667, interfaceC8221), c2159), c2159, 3456, 0);
        } else {
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new C1536(interfaceC8221, interfaceC1667, interfaceC7372, i, 2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m2189(final int i, final long j, InterfaceC2208 interfaceC2208, final int i2) throws XmlPullParserException, IOException {
        final int i3;
        int i4;
        C2224 c2224M2935;
        InterfaceC7383 interfaceC7383;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(-1240244237);
        if ((i2 & 6) == 0) {
            i3 = i;
            i4 = i2 | (c2159.m2922(i3) ? 4 : 2);
        } else {
            i3 = i;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c2159.m2921(j) ? 32 : 16;
        }
        if (c2159.m2903(i4 & 1, (i4 & 19) != 18)) {
            Context context = (Context) c2159.m2943(AbstractC2670.f5681);
            boolean zM2920 = ((i4 & 14) == 4) | c2159.m2920(context);
            Object objM2905 = c2159.m2905();
            C2188 c2188 = C2204.f4319;
            if (zM2920 || objM2905 == c2188) {
                objM2905 = Integer.valueOf(context.obtainStyledAttributes(new int[]{i3}).getResourceId(0, -1));
                c2159.m2946(objM2905);
            }
            int iIntValue = ((Number) objM2905).intValue();
            if (iIntValue == -1) {
                c2224M2935 = c2159.m2935();
                if (c2224M2935 != null) {
                    final int i5 = 1;
                    interfaceC7383 = new InterfaceC7383() { // from class: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪哲兰世苏
                        @Override // p068.InterfaceC7383
                        public final Object invoke(Object obj, Object obj2) throws XmlPullParserException, IOException {
                            int i6 = i5;
                            C6008 c6008 = C6008.f15084;
                            int i7 = i2;
                            long j2 = j;
                            int i8 = i3;
                            InterfaceC2208 interfaceC22082 = (InterfaceC2208) obj;
                            ((Integer) obj2).intValue();
                            switch (i6) {
                                case 0:
                                    AbstractC1642.m2189(i8, j2, interfaceC22082, AbstractC2202.m3031(i7 | 1));
                                    break;
                                default:
                                    AbstractC1642.m2189(i8, j2, interfaceC22082, AbstractC2202.m3031(i7 | 1));
                                    break;
                            }
                            return c6008;
                        }
                    };
                    c2224M2935.f4379 = interfaceC7383;
                }
                return;
            }
            AbstractC2363 abstractC2363M7407 = AbstractC3898.m7407(c2159, iIntValue);
            boolean z = (i4 & 112) == 32;
            Object objM29052 = c2159.m2905();
            if (z || objM29052 == c2188) {
                objM29052 = j == 16 ? null : new C2442(j, 5);
                c2159.m2946(objM29052);
            }
            AbstractC1484.m2014(AbstractC2280.m3142(AbstractC1460.m1939(C2958.f6621, AbstractC8572.f21349), abstractC2363M7407, null, C2539.f5320, 0.0f, (C2442) objM29052, 22), c2159, 0);
        } else {
            c2159.m2899();
        }
        c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            final int i6 = 0;
            interfaceC7383 = new InterfaceC7383() { // from class: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪哲兰世苏
                @Override // p068.InterfaceC7383
                public final Object invoke(Object obj, Object obj2) throws XmlPullParserException, IOException {
                    int i62 = i6;
                    C6008 c6008 = C6008.f15084;
                    int i7 = i2;
                    long j2 = j;
                    int i8 = i;
                    InterfaceC2208 interfaceC22082 = (InterfaceC2208) obj;
                    ((Integer) obj2).intValue();
                    switch (i62) {
                        case 0:
                            AbstractC1642.m2189(i8, j2, interfaceC22082, AbstractC2202.m3031(i7 | 1));
                            break;
                        default:
                            AbstractC1642.m2189(i8, j2, interfaceC22082, AbstractC2202.m3031(i7 | 1));
                            break;
                    }
                    return c6008;
                }
            };
            c2224M2935.f4379 = interfaceC7383;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m2190(final InterfaceC8221 interfaceC8221, final C8217 c8217, InterfaceC2208 interfaceC2208, int i) {
        final Context context;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(1904307118);
        int i2 = (c2159.m2920(interfaceC8221) ? 4 : 2) | i | (c2159.m2938(c8217) ? 32 : 16);
        if (c2159.m2903(i2 & 1, (i2 & 19) != 18)) {
            if (Build.VERSION.SDK_INT >= 28) {
                c2159.m2952(-1009482584);
                context = (Context) c2159.m2943(AbstractC2670.f5681);
                c2159.m2937(false);
            } else {
                c2159.m2952(-1009433480);
                c2159.m2937(false);
                context = null;
            }
            boolean zM2938 = c2159.m2938(c8217) | ((i2 & 14) == 4) | c2159.m2938(context);
            Object objM2905 = c2159.m2905();
            if (zM2938 || objM2905 == C2204.f4319) {
                objM2905 = new InterfaceC7387() { // from class: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪兰世苏哲
                    @Override // p068.InterfaceC7387
                    public final Object invoke(Object obj) {
                        C8573 c8573 = (C8573) obj;
                        List list = c8217.f20379;
                        int size = list.size();
                        final int i3 = 0;
                        for (int i4 = 0; i4 < size; i4++) {
                            AbstractC8218 abstractC8218 = (AbstractC8218) list.get(i4);
                            final int i5 = 2;
                            final int i6 = 1;
                            if (abstractC8218 instanceof C8216) {
                                final C8216 c8216 = (C8216) abstractC8218;
                                C8573.m13662(c8573, new InterfaceC7383() { // from class: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪兰世哲苏
                                    @Override // p068.InterfaceC7383
                                    public final Object invoke(Object obj2, Object obj3) {
                                        int i7 = i3;
                                        Object obj4 = c8216;
                                        switch (i7) {
                                            case 0:
                                                ((Integer) obj3).getClass();
                                                C2159 c21592 = (C2159) ((InterfaceC2208) obj2);
                                                c21592.m2952(666084174);
                                                String str = ((C8216) obj4).f20377;
                                                c21592.m2937(false);
                                                return str;
                                            case 1:
                                                ((Integer) obj3).getClass();
                                                C2159 c21593 = (C2159) ((InterfaceC2208) obj2);
                                                c21593.m2952(950061013);
                                                String strValueOf = String.valueOf(((TextClassification) obj4).getLabel());
                                                c21593.m2937(false);
                                                return strValueOf;
                                            default:
                                                ((Integer) obj3).intValue();
                                                C2159 c21594 = (C2159) ((InterfaceC2208) obj2);
                                                c21594.m2952(-1376593684);
                                                String string = ((RemoteAction) obj4).getTitle().toString();
                                                c21594.m2937(false);
                                                return string;
                                        }
                                    }
                                }, c8216.f20376 != 0 ? new C2077(-1930700965, true, new C1641(c8216, i3)) : null, new C1633(c8216, 2, interfaceC8221), 6);
                            } else if (abstractC8218 instanceof C8220) {
                                if (Build.VERSION.SDK_INT >= 28) {
                                    C8220 c8220 = (C8220) abstractC8218;
                                    Context context2 = context;
                                    if (context2 != null) {
                                        int i7 = c8220.f20382;
                                        final TextClassification textClassification = c8220.f20383;
                                        if (i7 < 0) {
                                            InterfaceC7383 interfaceC7383 = new InterfaceC7383() { // from class: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪兰世哲苏
                                                @Override // p068.InterfaceC7383
                                                public final Object invoke(Object obj2, Object obj3) {
                                                    int i72 = i6;
                                                    Object obj4 = textClassification;
                                                    switch (i72) {
                                                        case 0:
                                                            ((Integer) obj3).getClass();
                                                            C2159 c21592 = (C2159) ((InterfaceC2208) obj2);
                                                            c21592.m2952(666084174);
                                                            String str = ((C8216) obj4).f20377;
                                                            c21592.m2937(false);
                                                            return str;
                                                        case 1:
                                                            ((Integer) obj3).getClass();
                                                            C2159 c21593 = (C2159) ((InterfaceC2208) obj2);
                                                            c21593.m2952(950061013);
                                                            String strValueOf = String.valueOf(((TextClassification) obj4).getLabel());
                                                            c21593.m2937(false);
                                                            return strValueOf;
                                                        default:
                                                            ((Integer) obj3).intValue();
                                                            C2159 c21594 = (C2159) ((InterfaceC2208) obj2);
                                                            c21594.m2952(-1376593684);
                                                            String string = ((RemoteAction) obj4).getTitle().toString();
                                                            c21594.m2937(false);
                                                            return string;
                                                    }
                                                }
                                            };
                                            Drawable icon = textClassification.getIcon();
                                            C8573.m13662(c8573, interfaceC7383, icon != null ? new C2077(-1123224187, true, new C1641(icon, i6)) : null, new C1633(context2, 3, textClassification), 6);
                                        } else {
                                            final RemoteAction remoteAction = (RemoteAction) textClassification.getActions().get(i7);
                                            C8573.m13662(c8573, new InterfaceC7383() { // from class: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪兰世哲苏
                                                @Override // p068.InterfaceC7383
                                                public final Object invoke(Object obj2, Object obj3) {
                                                    int i72 = i5;
                                                    Object obj4 = remoteAction;
                                                    switch (i72) {
                                                        case 0:
                                                            ((Integer) obj3).getClass();
                                                            C2159 c21592 = (C2159) ((InterfaceC2208) obj2);
                                                            c21592.m2952(666084174);
                                                            String str = ((C8216) obj4).f20377;
                                                            c21592.m2937(false);
                                                            return str;
                                                        case 1:
                                                            ((Integer) obj3).getClass();
                                                            C2159 c21593 = (C2159) ((InterfaceC2208) obj2);
                                                            c21593.m2952(950061013);
                                                            String strValueOf = String.valueOf(((TextClassification) obj4).getLabel());
                                                            c21593.m2937(false);
                                                            return strValueOf;
                                                        default:
                                                            ((Integer) obj3).intValue();
                                                            C2159 c21594 = (C2159) ((InterfaceC2208) obj2);
                                                            c21594.m2952(-1376593684);
                                                            String string = ((RemoteAction) obj4).getTitle().toString();
                                                            c21594.m2937(false);
                                                            return string;
                                                    }
                                                }
                                            }, ((i7 == 0) || remoteAction.shouldShowIcon()) ? new C2077(-1261173016, true, new C1641(remoteAction, i5)) : null, new C1634(remoteAction, 2), 6);
                                        }
                                    }
                                }
                            } else if (abstractC8218 instanceof C8214) {
                                c8573.f21359.add(AbstractC8576.f21369);
                            }
                        }
                        return C6008.f15084;
                    }
                };
                c2159.m2946(objM2905);
            }
            AbstractC8578.m13666(null, null, (InterfaceC7387) objM2905, c2159, 0, 3);
        } else {
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new C1646(interfaceC8221, c8217, i);
        }
    }
}
