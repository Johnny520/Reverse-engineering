package androidx.compose.foundation.text.contextmenu.internal;

import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.textclassifier.TextClassification;
import androidx.compose.foundation.layout.AbstractC0619;
import androidx.compose.foundation.layout.AbstractC0643;
import androidx.compose.foundation.lazy.layout.C0695;
import androidx.compose.foundation.text.contextmenu.provider.AbstractC0833;
import androidx.compose.foundation.text.contextmenu.provider.InterfaceC0827;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1353;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.internal.AbstractC1254;
import androidx.compose.runtime.internal.C1242;
import androidx.compose.ui.C2125;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.draw.AbstractC1445;
import androidx.compose.ui.graphics.C1607;
import androidx.compose.ui.graphics.painter.AbstractC1528;
import androidx.compose.ui.layout.C1704;
import androidx.compose.ui.platform.AbstractC1835;
import androidx.compose.ui.window.AbstractC2091;
import androidx.compose.ui.window.C2090;
import com.bumptech.glide.AbstractC3055;
import java.io.IOException;
import java.util.List;
import kotlin.C5175;
import org.xmlpull.v1.XmlPullParserException;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p121.AbstractC7388;
import p121.C7384;
import p121.C7386;
import p121.C7387;
import p121.C7390;
import p121.InterfaceC7391;
import p177.AbstractC7742;
import p177.AbstractC7746;
import p177.AbstractC7748;
import p177.C7743;
import top.suzhelan.qstory.hook.item.chat.C5851;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0802 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C2090 f2291 = new C2090(30);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m1617(InterfaceC2129 interfaceC2129, C1242 c1242, InterfaceC1373 interfaceC1373, int i) {
        int i2;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(1392105195);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (c1324.m2350(interfaceC2129) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c1324.m2368(c1242) ? 32 : 16;
        }
        if (c1324.m2333(i2 & 1, (i2 & 19) != 18)) {
            AbstractC3055.m6633(interfaceC2129, AbstractC0833.f2368, c1242, c1324, ((i2 << 6) & 7168) | (i2 & 14) | 432);
        } else {
            c1324.m2329();
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new C0811(interfaceC2129, c1242, i, i3);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m1618(InterfaceC7391 interfaceC7391, InterfaceC0827 interfaceC0827, InterfaceC6542 interfaceC6542, InterfaceC1373 interfaceC1373, int i) {
        int i2;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(-2040393164);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? c1324.m2350(interfaceC7391) : c1324.m2368(interfaceC7391) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? c1324.m2350(interfaceC0827) : c1324.m2368(interfaceC0827) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c1324.m2368(interfaceC6542) ? 256 : 128;
        }
        boolean z = false;
        int i3 = 1;
        if (c1324.m2333(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32 || ((i2 & 64) != 0 && c1324.m2350(interfaceC0827));
            Object objM2335 = c1324.m2335();
            C1353 c1353 = C1369.f3973;
            if (z2 || objM2335 == c1353) {
                objM2335 = new C0800(new C5851(new C0793(interfaceC0827, i3, interfaceC6542), 20));
                c1324.m2376(objM2335);
            }
            C0800 c0800 = (C0800) objM2335;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && c1324.m2368(interfaceC7391))) {
                z = true;
            }
            Object objM23352 = c1324.m2335();
            if (z || objM23352 == c1353) {
                objM23352 = new C0794(interfaceC7391, 1);
                c1324.m2376(objM23352);
            }
            AbstractC2091.m3825(c0800, (InterfaceC6542) objM23352, f2291, AbstractC1254.m2179(1315155414, new C0806(interfaceC0827, interfaceC7391), c1324), c1324, 3456, 0);
        } else {
            c1324.m2329();
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new C0695(interfaceC7391, interfaceC0827, interfaceC6542, i, 2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m1619(final int i, final long j, InterfaceC1373 interfaceC1373, final int i2) throws XmlPullParserException, IOException {
        final int i3;
        int i4;
        C1389 c1389M2365;
        InterfaceC6553 interfaceC6553;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(-1240244237);
        if ((i2 & 6) == 0) {
            i3 = i;
            i4 = i2 | (c1324.m2352(i3) ? 4 : 2);
        } else {
            i3 = i;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c1324.m2351(j) ? 32 : 16;
        }
        if (c1324.m2333(i4 & 1, (i4 & 19) != 18)) {
            Context context = (Context) c1324.m2373(AbstractC1835.f5335);
            boolean zM2350 = ((i4 & 14) == 4) | c1324.m2350(context);
            Object objM2335 = c1324.m2335();
            C1353 c1353 = C1369.f3973;
            if (zM2350 || objM2335 == c1353) {
                objM2335 = Integer.valueOf(context.obtainStyledAttributes(new int[]{i3}).getResourceId(0, -1));
                c1324.m2376(objM2335);
            }
            int iIntValue = ((Number) objM2335).intValue();
            if (iIntValue == -1) {
                c1389M2365 = c1324.m2365();
                if (c1389M2365 != null) {
                    final int i5 = 1;
                    interfaceC6553 = new InterfaceC6553() { // from class: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪哲兰世苏
                        @Override // p052.InterfaceC6553
                        public final Object invoke(Object obj, Object obj2) throws XmlPullParserException, IOException {
                            int i6 = i5;
                            C5175 c5175 = C5175.f14739;
                            int i7 = i2;
                            long j2 = j;
                            int i8 = i3;
                            InterfaceC1373 interfaceC13732 = (InterfaceC1373) obj;
                            ((Integer) obj2).intValue();
                            switch (i6) {
                                case 0:
                                    AbstractC0802.m1619(i8, j2, interfaceC13732, AbstractC1367.m2460(i7 | 1));
                                    break;
                                default:
                                    AbstractC0802.m1619(i8, j2, interfaceC13732, AbstractC1367.m2460(i7 | 1));
                                    break;
                            }
                            return c5175;
                        }
                    };
                    c1389M2365.f4033 = interfaceC6553;
                }
                return;
            }
            AbstractC1528 abstractC1528M6638 = AbstractC3055.m6638(c1324, iIntValue);
            boolean z = (i4 & 112) == 32;
            Object objM23352 = c1324.m2335();
            if (z || objM23352 == c1353) {
                objM23352 = j == 16 ? null : new C1607(j, 5);
                c1324.m2376(objM23352);
            }
            AbstractC0643.m1444(AbstractC1445.m2572(AbstractC0619.m1369(C2125.f6275, AbstractC7742.f21007), abstractC1528M6638, null, C1704.f4974, 0.0f, (C1607) objM23352, 22), c1324, 0);
        } else {
            c1324.m2329();
        }
        c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            final int i6 = 0;
            interfaceC6553 = new InterfaceC6553() { // from class: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪哲兰世苏
                @Override // p052.InterfaceC6553
                public final Object invoke(Object obj, Object obj2) throws XmlPullParserException, IOException {
                    int i62 = i6;
                    C5175 c5175 = C5175.f14739;
                    int i7 = i2;
                    long j2 = j;
                    int i8 = i;
                    InterfaceC1373 interfaceC13732 = (InterfaceC1373) obj;
                    ((Integer) obj2).intValue();
                    switch (i62) {
                        case 0:
                            AbstractC0802.m1619(i8, j2, interfaceC13732, AbstractC1367.m2460(i7 | 1));
                            break;
                        default:
                            AbstractC0802.m1619(i8, j2, interfaceC13732, AbstractC1367.m2460(i7 | 1));
                            break;
                    }
                    return c5175;
                }
            };
            c1389M2365.f4033 = interfaceC6553;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m1620(final InterfaceC7391 interfaceC7391, final C7387 c7387, InterfaceC1373 interfaceC1373, int i) {
        final Context context;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(1904307118);
        int i2 = (c1324.m2350(interfaceC7391) ? 4 : 2) | i | (c1324.m2368(c7387) ? 32 : 16);
        if (c1324.m2333(i2 & 1, (i2 & 19) != 18)) {
            if (Build.VERSION.SDK_INT >= 28) {
                c1324.m2382(-1009482584);
                context = (Context) c1324.m2373(AbstractC1835.f5335);
                c1324.m2367(false);
            } else {
                c1324.m2382(-1009433480);
                c1324.m2367(false);
                context = null;
            }
            boolean zM2368 = c1324.m2368(c7387) | ((i2 & 14) == 4) | c1324.m2368(context);
            Object objM2335 = c1324.m2335();
            if (zM2368 || objM2335 == C1369.f3973) {
                objM2335 = new InterfaceC6557() { // from class: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪兰世苏哲
                    @Override // p052.InterfaceC6557
                    public final Object invoke(Object obj) {
                        C7743 c7743 = (C7743) obj;
                        List list = c7387.f20039;
                        int size = list.size();
                        final int i3 = 0;
                        for (int i4 = 0; i4 < size; i4++) {
                            AbstractC7388 abstractC7388 = (AbstractC7388) list.get(i4);
                            final int i5 = 2;
                            final int i6 = 1;
                            if (abstractC7388 instanceof C7386) {
                                final C7386 c7386 = (C7386) abstractC7388;
                                C7743.m13075(c7743, new InterfaceC6553() { // from class: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪兰世哲苏
                                    @Override // p052.InterfaceC6553
                                    public final Object invoke(Object obj2, Object obj3) {
                                        int i7 = i3;
                                        Object obj4 = c7386;
                                        switch (i7) {
                                            case 0:
                                                ((Integer) obj3).getClass();
                                                C1324 c13242 = (C1324) ((InterfaceC1373) obj2);
                                                c13242.m2382(666084174);
                                                String str = ((C7386) obj4).f20037;
                                                c13242.m2367(false);
                                                return str;
                                            case 1:
                                                ((Integer) obj3).getClass();
                                                C1324 c13243 = (C1324) ((InterfaceC1373) obj2);
                                                c13243.m2382(950061013);
                                                String strValueOf = String.valueOf(((TextClassification) obj4).getLabel());
                                                c13243.m2367(false);
                                                return strValueOf;
                                            default:
                                                ((Integer) obj3).intValue();
                                                C1324 c13244 = (C1324) ((InterfaceC1373) obj2);
                                                c13244.m2382(-1376593684);
                                                String string = ((RemoteAction) obj4).getTitle().toString();
                                                c13244.m2367(false);
                                                return string;
                                        }
                                    }
                                }, c7386.f20036 != 0 ? new C1242(-1930700965, true, new C0801(c7386, i3)) : null, new C0793(c7386, 2, interfaceC7391), 6);
                            } else if (abstractC7388 instanceof C7390) {
                                if (Build.VERSION.SDK_INT >= 28) {
                                    C7390 c7390 = (C7390) abstractC7388;
                                    Context context2 = context;
                                    if (context2 != null) {
                                        int i7 = c7390.f20042;
                                        final TextClassification textClassification = c7390.f20043;
                                        if (i7 < 0) {
                                            InterfaceC6553 interfaceC6553 = new InterfaceC6553() { // from class: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪兰世哲苏
                                                @Override // p052.InterfaceC6553
                                                public final Object invoke(Object obj2, Object obj3) {
                                                    int i72 = i6;
                                                    Object obj4 = textClassification;
                                                    switch (i72) {
                                                        case 0:
                                                            ((Integer) obj3).getClass();
                                                            C1324 c13242 = (C1324) ((InterfaceC1373) obj2);
                                                            c13242.m2382(666084174);
                                                            String str = ((C7386) obj4).f20037;
                                                            c13242.m2367(false);
                                                            return str;
                                                        case 1:
                                                            ((Integer) obj3).getClass();
                                                            C1324 c13243 = (C1324) ((InterfaceC1373) obj2);
                                                            c13243.m2382(950061013);
                                                            String strValueOf = String.valueOf(((TextClassification) obj4).getLabel());
                                                            c13243.m2367(false);
                                                            return strValueOf;
                                                        default:
                                                            ((Integer) obj3).intValue();
                                                            C1324 c13244 = (C1324) ((InterfaceC1373) obj2);
                                                            c13244.m2382(-1376593684);
                                                            String string = ((RemoteAction) obj4).getTitle().toString();
                                                            c13244.m2367(false);
                                                            return string;
                                                    }
                                                }
                                            };
                                            Drawable icon = textClassification.getIcon();
                                            C7743.m13075(c7743, interfaceC6553, icon != null ? new C1242(-1123224187, true, new C0801(icon, i6)) : null, new C0793(context2, 3, textClassification), 6);
                                        } else {
                                            final RemoteAction remoteAction = (RemoteAction) textClassification.getActions().get(i7);
                                            C7743.m13075(c7743, new InterfaceC6553() { // from class: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪兰世哲苏
                                                @Override // p052.InterfaceC6553
                                                public final Object invoke(Object obj2, Object obj3) {
                                                    int i72 = i5;
                                                    Object obj4 = remoteAction;
                                                    switch (i72) {
                                                        case 0:
                                                            ((Integer) obj3).getClass();
                                                            C1324 c13242 = (C1324) ((InterfaceC1373) obj2);
                                                            c13242.m2382(666084174);
                                                            String str = ((C7386) obj4).f20037;
                                                            c13242.m2367(false);
                                                            return str;
                                                        case 1:
                                                            ((Integer) obj3).getClass();
                                                            C1324 c13243 = (C1324) ((InterfaceC1373) obj2);
                                                            c13243.m2382(950061013);
                                                            String strValueOf = String.valueOf(((TextClassification) obj4).getLabel());
                                                            c13243.m2367(false);
                                                            return strValueOf;
                                                        default:
                                                            ((Integer) obj3).intValue();
                                                            C1324 c13244 = (C1324) ((InterfaceC1373) obj2);
                                                            c13244.m2382(-1376593684);
                                                            String string = ((RemoteAction) obj4).getTitle().toString();
                                                            c13244.m2367(false);
                                                            return string;
                                                    }
                                                }
                                            }, ((i7 == 0) || remoteAction.shouldShowIcon()) ? new C1242(-1261173016, true, new C0801(remoteAction, i5)) : null, new C0794(remoteAction, 2), 6);
                                        }
                                    }
                                }
                            } else if (abstractC7388 instanceof C7384) {
                                c7743.f21017.add(AbstractC7746.f21027);
                            }
                        }
                        return C5175.f14739;
                    }
                };
                c1324.m2376(objM2335);
            }
            AbstractC7748.m13079(null, null, (InterfaceC6557) objM2335, c1324, 0, 3);
        } else {
            c1324.m2329();
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new C0806(interfaceC7391, c7387, i);
        }
    }
}
