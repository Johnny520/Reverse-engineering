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
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.AbstractC3066;
import java.io.IOException;
import java.util.List;
import kotlin.C5176;
import org.xmlpull.v1.XmlPullParserException;
import p052.InterfaceC6543;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p121.AbstractC7389;
import p121.C7385;
import p121.C7387;
import p121.C7388;
import p121.C7391;
import p121.InterfaceC7392;
import p177.AbstractC7743;
import p177.AbstractC7747;
import p177.AbstractC7749;
import p177.C7744;
import top.suzhelan.qstory.hook.item.chat.C5856;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0802 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C2090 f2292 = new C2090(30);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m1627(InterfaceC2129 interfaceC2129, C1242 c1242, InterfaceC1373 interfaceC1373, int i) {
        int i2;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(1392105195);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (c1324.m2360(interfaceC2129) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c1324.m2378(c1242) ? 32 : 16;
        }
        if (c1324.m2343(i2 & 1, (i2 & 19) != 18)) {
            AbstractC3056.m6704(interfaceC2129, AbstractC0833.f2369, c1242, c1324, ((i2 << 6) & 7168) | (i2 & 14) | 432);
        } else {
            c1324.m2339();
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new C0811(interfaceC2129, c1242, i, i3);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m1628(InterfaceC7392 interfaceC7392, InterfaceC0827 interfaceC0827, InterfaceC6543 interfaceC6543, InterfaceC1373 interfaceC1373, int i) {
        int i2;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(-2040393164);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? c1324.m2360(interfaceC7392) : c1324.m2378(interfaceC7392) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? c1324.m2360(interfaceC0827) : c1324.m2378(interfaceC0827) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c1324.m2378(interfaceC6543) ? 256 : 128;
        }
        boolean z = false;
        int i3 = 1;
        if (c1324.m2343(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32 || ((i2 & 64) != 0 && c1324.m2360(interfaceC0827));
            Object objM2345 = c1324.m2345();
            C1353 c1353 = C1369.f3974;
            if (z2 || objM2345 == c1353) {
                objM2345 = new C0800(new C5856(new C0793(interfaceC0827, i3, interfaceC6543), 20));
                c1324.m2386(objM2345);
            }
            C0800 c0800 = (C0800) objM2345;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && c1324.m2378(interfaceC7392))) {
                z = true;
            }
            Object objM23452 = c1324.m2345();
            if (z || objM23452 == c1353) {
                objM23452 = new C0794(interfaceC7392, 1);
                c1324.m2386(objM23452);
            }
            AbstractC2091.m3835(c0800, (InterfaceC6543) objM23452, f2292, AbstractC1254.m2189(1315155414, new C0806(interfaceC0827, interfaceC7392), c1324), c1324, 3456, 0);
        } else {
            c1324.m2339();
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new C0695(interfaceC7392, interfaceC0827, interfaceC6543, i, 2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m1629(final int i, final long j, InterfaceC1373 interfaceC1373, final int i2) throws XmlPullParserException, IOException {
        final int i3;
        int i4;
        C1389 c1389M2375;
        InterfaceC6554 interfaceC6554;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(-1240244237);
        if ((i2 & 6) == 0) {
            i3 = i;
            i4 = i2 | (c1324.m2362(i3) ? 4 : 2);
        } else {
            i3 = i;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c1324.m2361(j) ? 32 : 16;
        }
        if (c1324.m2343(i4 & 1, (i4 & 19) != 18)) {
            Context context = (Context) c1324.m2383(AbstractC1835.f5336);
            boolean zM2360 = ((i4 & 14) == 4) | c1324.m2360(context);
            Object objM2345 = c1324.m2345();
            C1353 c1353 = C1369.f3974;
            if (zM2360 || objM2345 == c1353) {
                objM2345 = Integer.valueOf(context.obtainStyledAttributes(new int[]{i3}).getResourceId(0, -1));
                c1324.m2386(objM2345);
            }
            int iIntValue = ((Number) objM2345).intValue();
            if (iIntValue == -1) {
                c1389M2375 = c1324.m2375();
                if (c1389M2375 != null) {
                    final int i5 = 1;
                    interfaceC6554 = new InterfaceC6554() { // from class: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪哲兰世苏
                        @Override // p052.InterfaceC6554
                        public final Object invoke(Object obj, Object obj2) throws XmlPullParserException, IOException {
                            int i6 = i5;
                            C5176 c5176 = C5176.f14739;
                            int i7 = i2;
                            long j2 = j;
                            int i8 = i3;
                            InterfaceC1373 interfaceC13732 = (InterfaceC1373) obj;
                            ((Integer) obj2).intValue();
                            switch (i6) {
                                case 0:
                                    AbstractC0802.m1629(i8, j2, interfaceC13732, AbstractC1367.m2471(i7 | 1));
                                    break;
                                default:
                                    AbstractC0802.m1629(i8, j2, interfaceC13732, AbstractC1367.m2471(i7 | 1));
                                    break;
                            }
                            return c5176;
                        }
                    };
                    c1389M2375.f4034 = interfaceC6554;
                }
                return;
            }
            AbstractC1528 abstractC1528M6847 = AbstractC3066.m6847(c1324, iIntValue);
            boolean z = (i4 & 112) == 32;
            Object objM23452 = c1324.m2345();
            if (z || objM23452 == c1353) {
                objM23452 = j == 16 ? null : new C1607(j, 5);
                c1324.m2386(objM23452);
            }
            AbstractC0643.m1454(AbstractC1445.m2582(AbstractC0619.m1379(C2125.f6276, AbstractC7743.f21004), abstractC1528M6847, null, C1704.f4975, 0.0f, (C1607) objM23452, 22), c1324, 0);
        } else {
            c1324.m2339();
        }
        c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            final int i6 = 0;
            interfaceC6554 = new InterfaceC6554() { // from class: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪哲兰世苏
                @Override // p052.InterfaceC6554
                public final Object invoke(Object obj, Object obj2) throws XmlPullParserException, IOException {
                    int i62 = i6;
                    C5176 c5176 = C5176.f14739;
                    int i7 = i2;
                    long j2 = j;
                    int i8 = i;
                    InterfaceC1373 interfaceC13732 = (InterfaceC1373) obj;
                    ((Integer) obj2).intValue();
                    switch (i62) {
                        case 0:
                            AbstractC0802.m1629(i8, j2, interfaceC13732, AbstractC1367.m2471(i7 | 1));
                            break;
                        default:
                            AbstractC0802.m1629(i8, j2, interfaceC13732, AbstractC1367.m2471(i7 | 1));
                            break;
                    }
                    return c5176;
                }
            };
            c1389M2375.f4034 = interfaceC6554;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m1630(final InterfaceC7392 interfaceC7392, final C7388 c7388, InterfaceC1373 interfaceC1373, int i) {
        final Context context;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(1904307118);
        int i2 = (c1324.m2360(interfaceC7392) ? 4 : 2) | i | (c1324.m2378(c7388) ? 32 : 16);
        if (c1324.m2343(i2 & 1, (i2 & 19) != 18)) {
            if (Build.VERSION.SDK_INT >= 28) {
                c1324.m2392(-1009482584);
                context = (Context) c1324.m2383(AbstractC1835.f5336);
                c1324.m2377(false);
            } else {
                c1324.m2392(-1009433480);
                c1324.m2377(false);
                context = null;
            }
            boolean zM2378 = c1324.m2378(c7388) | ((i2 & 14) == 4) | c1324.m2378(context);
            Object objM2345 = c1324.m2345();
            if (zM2378 || objM2345 == C1369.f3974) {
                objM2345 = new InterfaceC6558() { // from class: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪兰世苏哲
                    @Override // p052.InterfaceC6558
                    public final Object invoke(Object obj) {
                        C7744 c7744 = (C7744) obj;
                        List list = c7388.f20034;
                        int size = list.size();
                        final int i3 = 0;
                        for (int i4 = 0; i4 < size; i4++) {
                            AbstractC7389 abstractC7389 = (AbstractC7389) list.get(i4);
                            final int i5 = 2;
                            final int i6 = 1;
                            if (abstractC7389 instanceof C7387) {
                                final C7387 c7387 = (C7387) abstractC7389;
                                C7744.m13103(c7744, new InterfaceC6554() { // from class: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪兰世哲苏
                                    @Override // p052.InterfaceC6554
                                    public final Object invoke(Object obj2, Object obj3) {
                                        int i7 = i3;
                                        Object obj4 = c7387;
                                        switch (i7) {
                                            case 0:
                                                ((Integer) obj3).getClass();
                                                C1324 c13242 = (C1324) ((InterfaceC1373) obj2);
                                                c13242.m2392(666084174);
                                                String str = ((C7387) obj4).f20032;
                                                c13242.m2377(false);
                                                return str;
                                            case 1:
                                                ((Integer) obj3).getClass();
                                                C1324 c13243 = (C1324) ((InterfaceC1373) obj2);
                                                c13243.m2392(950061013);
                                                String strValueOf = String.valueOf(((TextClassification) obj4).getLabel());
                                                c13243.m2377(false);
                                                return strValueOf;
                                            default:
                                                ((Integer) obj3).intValue();
                                                C1324 c13244 = (C1324) ((InterfaceC1373) obj2);
                                                c13244.m2392(-1376593684);
                                                String string = ((RemoteAction) obj4).getTitle().toString();
                                                c13244.m2377(false);
                                                return string;
                                        }
                                    }
                                }, c7387.f20031 != 0 ? new C1242(-1930700965, true, new C0801(c7387, i3)) : null, new C0793(c7387, 2, interfaceC7392), 6);
                            } else if (abstractC7389 instanceof C7391) {
                                if (Build.VERSION.SDK_INT >= 28) {
                                    C7391 c7391 = (C7391) abstractC7389;
                                    Context context2 = context;
                                    if (context2 != null) {
                                        int i7 = c7391.f20037;
                                        final TextClassification textClassification = c7391.f20038;
                                        if (i7 < 0) {
                                            InterfaceC6554 interfaceC6554 = new InterfaceC6554() { // from class: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪兰世哲苏
                                                @Override // p052.InterfaceC6554
                                                public final Object invoke(Object obj2, Object obj3) {
                                                    int i72 = i6;
                                                    Object obj4 = textClassification;
                                                    switch (i72) {
                                                        case 0:
                                                            ((Integer) obj3).getClass();
                                                            C1324 c13242 = (C1324) ((InterfaceC1373) obj2);
                                                            c13242.m2392(666084174);
                                                            String str = ((C7387) obj4).f20032;
                                                            c13242.m2377(false);
                                                            return str;
                                                        case 1:
                                                            ((Integer) obj3).getClass();
                                                            C1324 c13243 = (C1324) ((InterfaceC1373) obj2);
                                                            c13243.m2392(950061013);
                                                            String strValueOf = String.valueOf(((TextClassification) obj4).getLabel());
                                                            c13243.m2377(false);
                                                            return strValueOf;
                                                        default:
                                                            ((Integer) obj3).intValue();
                                                            C1324 c13244 = (C1324) ((InterfaceC1373) obj2);
                                                            c13244.m2392(-1376593684);
                                                            String string = ((RemoteAction) obj4).getTitle().toString();
                                                            c13244.m2377(false);
                                                            return string;
                                                    }
                                                }
                                            };
                                            Drawable icon = textClassification.getIcon();
                                            C7744.m13103(c7744, interfaceC6554, icon != null ? new C1242(-1123224187, true, new C0801(icon, i6)) : null, new C0793(context2, 3, textClassification), 6);
                                        } else {
                                            final RemoteAction remoteAction = (RemoteAction) textClassification.getActions().get(i7);
                                            C7744.m13103(c7744, new InterfaceC6554() { // from class: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪兰世哲苏
                                                @Override // p052.InterfaceC6554
                                                public final Object invoke(Object obj2, Object obj3) {
                                                    int i72 = i5;
                                                    Object obj4 = remoteAction;
                                                    switch (i72) {
                                                        case 0:
                                                            ((Integer) obj3).getClass();
                                                            C1324 c13242 = (C1324) ((InterfaceC1373) obj2);
                                                            c13242.m2392(666084174);
                                                            String str = ((C7387) obj4).f20032;
                                                            c13242.m2377(false);
                                                            return str;
                                                        case 1:
                                                            ((Integer) obj3).getClass();
                                                            C1324 c13243 = (C1324) ((InterfaceC1373) obj2);
                                                            c13243.m2392(950061013);
                                                            String strValueOf = String.valueOf(((TextClassification) obj4).getLabel());
                                                            c13243.m2377(false);
                                                            return strValueOf;
                                                        default:
                                                            ((Integer) obj3).intValue();
                                                            C1324 c13244 = (C1324) ((InterfaceC1373) obj2);
                                                            c13244.m2392(-1376593684);
                                                            String string = ((RemoteAction) obj4).getTitle().toString();
                                                            c13244.m2377(false);
                                                            return string;
                                                    }
                                                }
                                            }, ((i7 == 0) || remoteAction.shouldShowIcon()) ? new C1242(-1261173016, true, new C0801(remoteAction, i5)) : null, new C0794(remoteAction, 2), 6);
                                        }
                                    }
                                }
                            } else if (abstractC7389 instanceof C7385) {
                                c7744.f21014.add(AbstractC7747.f21024);
                            }
                        }
                        return C5176.f14739;
                    }
                };
                c1324.m2386(objM2345);
            }
            AbstractC7749.m13107(null, null, (InterfaceC6558) objM2345, c1324, 0, 3);
        } else {
            c1324.m2339();
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new C0806(interfaceC7392, c7388, i);
        }
    }
}
