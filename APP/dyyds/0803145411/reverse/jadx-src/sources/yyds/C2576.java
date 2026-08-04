package yyds;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.im.core.model.Message;
import com.p000ss.android.ugc.aweme.yyds.R;
import com.ss.android.ugc.aweme.comment.model.Comment;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: yyds.ᲇᲈᲈᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2576 extends AbstractC1861 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public /* synthetic */ Object f12703;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f12704;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f12705;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2576(Object obj, Object obj2, InterfaceC0274 interfaceC0274, int i) {
        super(2, interfaceC0274);
        this.f12705 = i;
        this.f12703 = obj;
        this.f12704 = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0322  */
    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo474(Object obj) throws Throwable {
        Long lM1692;
        long j;
        String strM4341;
        String strM43412;
        int i = 2;
        boolean z = false;
        InterfaceC0274 interfaceC0274 = null;
        switch (this.f12705) {
            case 0:
                AbstractC1544.m3189(obj);
                File file = (File) this.f12704;
                try {
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
                    String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
                    long jLongValue = (strExtractMetadata == null || (lM1692 = AbstractC0733.m1692(strExtractMetadata)) == null) ? 0L : lM1692.longValue();
                    mediaMetadataRetriever.release();
                    long j2 = jLongValue / 1000;
                    String str = String.format(AbstractC2328.m4341(-195948865815406L), Arrays.copyOf(new Object[]{Long.valueOf(j2 / 60), Long.valueOf(j2 % 60)}, 2));
                    AbstractC2328.m4341(-195991815488366L);
                    return str;
                } catch (Exception e) {
                    C2336.f11496.m4355(AbstractC2328.m4341(-195807131894638L), e);
                    return AbstractC2328.m4341(-195923096011630L);
                }
            case 1:
                AbstractC1544.m3189(obj);
                C0947 c0947 = (C0947) this.f12703;
                int i2 = c0947.f4410;
                Button button = (Button) ((C0119) this.f12704).f812;
                if (i2 > 0) {
                    button.setText(AbstractC2328.m4341(-237455429763950L) + c0947.f4410 + ')');
                } else {
                    button.setText(AbstractC2328.m4341(-237481199567726L));
                    button.setEnabled(true);
                }
                return C2746.f13459;
            case 2:
                AbstractC1544.m3189(obj);
                AbstractC2667.m4760((File) this.f12704, AbstractC2797.m4923().m515((Comment) this.f12703));
                return C2746.f13459;
            case 3:
                ArrayList arrayList = (ArrayList) this.f12704;
                AbstractC1544.m3189(obj);
                C2701 c2701 = C2701.f13261;
                Context context = (Context) this.f12703;
                c2701.getClass();
                C2701.m4807(context);
                C0763 c0763M1709 = C0763.m1709(context);
                c0763M1709.f3532 = false;
                View viewInflate = AbstractC1115.m2309(context).inflate(R.layout.decorated_emoji_dialog_layout, (ViewGroup) null, false);
                if (((LinearLayout) AbstractC1741.m3479(viewInflate, R.id.emoji_container)) == null) {
                    C0188.m789(AbstractC2328.m4341(-1741488552313710L).concat(viewInflate.getResources().getResourceName(R.id.emoji_container)));
                    return null;
                }
                AbstractC2328.m4341(-151551788876654L);
                c0763M1709.f3518 = AbstractC2328.m4341(-151607623451502L) + arrayList.size() + ')';
                c0763M1709.mo1719();
                c0763M1709.f3522 = new C1807(context, arrayList, (LinearLayout) viewInflate, i);
                c0763M1709.mo1719();
                c0763M1709.f3530 = AbstractC2328.m4341(-151637688222574L);
                c0763M1709.mo1719();
                c0763M1709.m1715(context);
                return c0763M1709;
            case 4:
                Message message = (Message) this.f12703;
                AbstractC1544.m3189(obj);
                try {
                    C2701 c27012 = C2701.f13261;
                    C1221 c1221 = C1221.f5600;
                    String str2 = AbstractC2328.m4341(-995959539139438L) + message.getMsgId();
                    String strM43413 = AbstractC2328.m4341(-995998193845102L);
                    c1221.getClass();
                    String strM2480 = C1221.m2480(str2, strM43413);
                    c27012.getClass();
                    File fileM4805 = C2701.m4805(strM2480);
                    AtomicLong atomicLong = AbstractC1108.f5116;
                    AbstractC2328.m4341(-383325404037998L);
                    AbstractC2667.m4760(fileM4805, AbstractC2797.m4923().m515(message));
                    AbstractC1960.m3789(AbstractC2328.m4341(-996019668681582L) + fileM4805.getName());
                    C1327 c1327 = C1327.f6093;
                    C1327.m2618((Context) this.f12704);
                    break;
                } catch (Exception e2) {
                    AbstractC1960.m3789(AbstractC2328.m4341(-996045438485358L) + e2.getMessage());
                }
                return C2746.f13459;
            case 5:
                AbstractC1544.m3189(obj);
                Object obj2 = this.f12703;
                String str3 = ((EnumC0868) this.f12704).f3984;
                if (!(obj2 instanceof C2658)) {
                    AbstractC1960.m3789(str3.concat(AbstractC2328.m4341(-192117754987374L)));
                }
                Throwable thM4249 = C2248.m4249(obj2);
                if (thM4249 != null && !(thM4249 instanceof C1792)) {
                    C2336.f11496.m4358(AbstractC0897.m1988(new StringBuilder(AbstractC2328.m4341(-192143524791150L)), str3, -192156409693038L), thM4249);
                    String message2 = thM4249.getMessage();
                    if (message2 == null) {
                        message2 = AbstractC2328.m4341(-192177884529518L);
                    }
                    AbstractC1960.m3789(message2);
                }
                return C2746.f13459;
            case 6:
                AbstractC1544.m3189(obj);
                C0561 c0561 = C0561.f2672;
                String strM1407 = C0561.m1407((EnumC0868) this.f12703);
                Bitmap bitmapM1410 = AbstractC0473.m1313(strM1407) ? null : C0561.m1410(strM1407);
                Object obj3 = C0561.f2676[((EnumC0868) this.f12703).ordinal()];
                EnumC0868 enumC0868 = (EnumC0868) this.f12703;
                String str4 = (String) this.f12704;
                synchronized (obj3) {
                    try {
                        if (AbstractC1544.m3188(C0561.m1414(enumC0868), str4) && AbstractC1544.m3188(C0561.m1407(enumC0868), strM1407)) {
                            if (AbstractC0473.m1313(strM1407) || bitmapM1410 != null) {
                                synchronized (C0561.f2673) {
                                    C0561.f2671.put(enumC0868, new C2726(bitmapM1410, str4));
                                }
                            } else {
                                C0561.m1406(enumC0868, AbstractC2328.m4341(-796986589217646L));
                                String strM1405 = C0561.m1405();
                                C0561.m1404(enumC0868, strM1405);
                                synchronized (C0561.f2673) {
                                    C0561.f2671.put(enumC0868, new C2726(null, strM1405));
                                }
                            }
                            z = true;
                        }
                        synchronized (C0561.f2673) {
                            EnumMap enumMap = C0561.f2677;
                            if (AbstractC1544.m3188(enumMap.get(enumC0868), str4)) {
                                enumMap.remove(enumC0868);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (z) {
                    C1223 c1223 = new C1223(8, (EnumC0868) this.f12703);
                    if (AbstractC1544.m3188(Looper.myLooper(), Looper.getMainLooper())) {
                        c1223.mo731();
                    } else {
                        C0561.f2670.post(new RunnableC0309(5, c1223));
                    }
                }
                return C2746.f13459;
            case 7:
                AbstractC1544.m3189(obj);
                AbstractC1960.m3789(AbstractC2328.m4341(-614093996852078L) + ((C0837) ((C0172) this.f12703).f997).f3860);
                ((NotificationManager) this.f12704).cancel(1001);
                return C2746.f13459;
            case 8:
                AbstractC1544.m3189(obj);
                Object systemService = ((Context) this.f12703).getSystemService(AbstractC2328.m4341(-563658195895150L));
                AbstractC2328.m4341(-563714030469998L);
                ((NotificationManager) systemService).cancel(1001);
                AbstractC1960.m3789(AbstractC2328.m4341(-564010383213422L) + ((Exception) this.f12704).getMessage());
                return C2746.f13459;
            case 9:
                AbstractC1544.m3189(obj);
                C1014 c1014 = (C1014) this.f12703;
                if (c1014.f4604) {
                    C1327 c13272 = C1327.f6093;
                    C1327.m2618((Context) this.f12704);
                }
                AbstractC1960.m3789(c1014.f4606);
                return C2746.f13459;
            case 10:
                AbstractC1544.m3189(obj);
                C0093 c0093 = (C0093) this.f12703;
                C2280 c2280 = (C2280) this.f12704;
                C0805 c0805 = C0093.f691;
                C1127 c1127 = c0093.f704;
                AbstractC2328.m4341(-217531076477806L);
                long j3 = c2280.f11220;
                long j4 = c2280.f11219;
                if (j4 < 0) {
                    j4 = 0;
                }
                boolean z2 = j3 > 0;
                if (z2) {
                    j = 0;
                    c0093.f701 = AbstractC0598.m1483((float) (j4 / j3), 0.0f, 1.0f);
                    ((ProgressBar) c1127.f5192).setIndeterminate(false);
                    float fM1483 = AbstractC0598.m1483(c0093.f701, 0.0f, 1.0f);
                    ValueAnimator valueAnimator = c0093.f694;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float f = c0093.f702;
                    if (fM1483 < f || Math.abs(fM1483 - f) < 5.0E-4f) {
                        c0093.m499(fM1483);
                    } else {
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(c0093.f702, fM1483);
                        valueAnimatorOfFloat.setDuration(150L);
                        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
                        valueAnimatorOfFloat.addUpdateListener(new C2405(0, c0093));
                        valueAnimatorOfFloat.start();
                        c0093.f694 = valueAnimatorOfFloat;
                    }
                } else {
                    j = 0;
                    c0093.f701 = 0.0f;
                    ValueAnimator valueAnimator2 = c0093.f694;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    c0093.f694 = null;
                    c0093.f702 = 0.0f;
                    ((ProgressBar) c1127.f5192).setProgress(0);
                    ((ProgressBar) c1127.f5192).setIndeterminate(true);
                    c1127.f5188.setText(AbstractC2328.m4341(-217569731183470L));
                    c0093.f707.m2246(0.0f, true);
                    c0093.f696.m361(0.0f, true);
                }
                if (!c0093.f693) {
                    c1127.f5194.setText(AbstractC2328.m4341(-217582616085358L));
                }
                if (z2) {
                    c0805.getClass();
                    strM4341 = C0805.m1854(j3);
                } else {
                    strM4341 = AbstractC2328.m4341(-217599795954542L);
                }
                TextView textView = c1127.f5189;
                StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-217612680856430L));
                c0805.getClass();
                sb.append(C0805.m1854(j4));
                sb.append(AbstractC2328.m4341(-217634155692910L));
                sb.append(strM4341);
                textView.setText(sb.toString());
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j5 = c0093.f698;
                if (j <= j5 && j5 < j4) {
                    if (jElapsedRealtime > c0093.f692) {
                        double d = (jElapsedRealtime - r10) / 1000.0d;
                        long j6 = j4 - j5;
                        if (d > 0.0d) {
                            double d2 = j6 / d;
                            double d3 = c0093.f705;
                            if (d3 > 0.0d) {
                                d2 = (d2 * 0.3d) + (d3 * 0.7d);
                            }
                            c0093.f705 = d2;
                        }
                    }
                }
                c0093.f692 = jElapsedRealtime;
                c0093.f698 = j4;
                if (!c0093.f693) {
                    double d4 = c0093.f705;
                    String strConcat = d4 > 0.0d ? C0805.m1854(AbstractC0181.m746(d4)).concat(AbstractC2328.m4341(-217651335562094L)) : AbstractC2328.m4341(-217664220463982L);
                    if (z2) {
                        double d5 = c0093.f705;
                        if (d5 > 0.0d) {
                            long j7 = j3 - j4;
                            if (j7 < j) {
                                j7 = j;
                            }
                            long jM746 = AbstractC0181.m746(j7 / d5);
                            long j8 = jM746 < j ? j : jM746;
                            if (j8 < 1) {
                                strM43412 = AbstractC2328.m4341(-225098808853358L);
                            } else if (j8 < 60) {
                                strM43412 = AbstractC2328.m4341(-225120283689838L) + j8 + (char) 31186;
                            } else if (j8 < 3600) {
                                strM43412 = AbstractC2328.m4341(-225137463559022L) + (j8 / 60) + (char) 20998 + (j8 % 60) + (char) 31186;
                            } else {
                                strM43412 = AbstractC2328.m4341(-225154643428206L) + (j8 / 3600) + (char) 26102 + ((j8 % 3600) / 60) + (char) 20998;
                            }
                        } else {
                            strM43412 = !z2 ? AbstractC2328.m4341(-217689990267758L) : AbstractC2328.m4341(-217720055038830L);
                        }
                        c1127.f5191.setText(AbstractC2328.m4341(-217745824842606L) + strConcat + AbstractC2328.m4341(-217763004711790L) + strM43412);
                    }
                }
                return C2746.f13459;
            case 11:
                AbstractC1544.m3189(obj);
                C0093 c00932 = (C0093) this.f12703;
                ValueAnimator valueAnimator3 = c00932.f694;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                }
                c00932.f694 = null;
                c00932.m498();
                try {
                    C0912 c0912 = c00932.f700;
                    if (c0912 != null) {
                        c0912.m2031();
                    }
                    break;
                } catch (Exception unused) {
                }
                c00932.f700 = null;
                Dialog dialog = (Dialog) this.f12704;
                if (dialog == null) {
                    return null;
                }
                dialog.dismiss();
                return C2746.f13459;
            case 12:
                AbstractC1544.m3189(obj);
                InterfaceC2213 interfaceC2213Mo119 = ((InterfaceC0990) this.f12703).mo119();
                C0135 c0135 = C0135.f836;
                AbstractC0974 abstractC0974 = (AbstractC0974) interfaceC2213Mo119.mo423(c0135);
                C2539 c2539 = new C2539(true);
                c2539.m2166(null);
                C1647 c1647 = new C1647(c2539, (InterfaceC0477) this.f12704, interfaceC0274, 6);
                InterfaceC2213 interfaceC2213M989 = AbstractC0319.m989(C2586.f12764, abstractC0974, true);
                C1206 c1206 = AbstractC0221.f1238;
                if (interfaceC2213M989 != c1206 && interfaceC2213M989.mo423(c0135) == null) {
                    interfaceC2213M989 = interfaceC2213M989.mo422(c1206);
                }
                AbstractC0191 c0289 = new C0289(interfaceC2213M989, true);
                c0289.m813(4, c0289, c1647);
                while (c2539.m2163() instanceof InterfaceC2067) {
                    try {
                        return AbstractC2217.m4197(abstractC0974, new C2793(c2539, null, 3));
                    } catch (InterruptedException unused2) {
                    }
                }
                return c2539.m2167();
            case 13:
                AbstractC1544.m3189(obj);
                ((C2585) this.f12703).f12743.setText((String) this.f12704);
                return C2746.f13459;
            case 14:
                AbstractC1544.m3189(obj);
                ((C1279) this.f12703).mo371((ArrayList) this.f12704);
                return C2746.f13459;
            case 15:
                AbstractC1544.m3189(obj);
                ((C0046) this.f12703).mo371((ArrayList) this.f12704);
                return C2746.f13459;
            case 16:
                AbstractC1544.m3189(obj);
                ((C1279) this.f12703).mo371((C1404) this.f12704);
                return C2746.f13459;
            case 17:
                AbstractC1544.m3189(obj);
                ((C1785) this.f12703).mo371((ArrayList) this.f12704);
                return C2746.f13459;
            default:
                AbstractC1544.m3189(obj);
                ((InterfaceC1549) this.f12703).mo371((List) this.f12704);
                return C2746.f13459;
        }
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final InterfaceC0274 mo630(Object obj, InterfaceC0274 interfaceC0274) {
        int i = this.f12705;
        Object obj2 = this.f12704;
        switch (i) {
            case 0:
                return new C2576((C2355) this.f12703, (File) obj2, interfaceC0274, 0);
            case 1:
                return new C2576((C0947) this.f12703, (C0119) obj2, interfaceC0274, 1);
            case 2:
                return new C2576((Comment) this.f12703, (File) obj2, interfaceC0274, 2);
            case 3:
                return new C2576((Context) this.f12703, (ArrayList) obj2, interfaceC0274, 3);
            case 4:
                return new C2576((Message) this.f12703, (Context) obj2, interfaceC0274, 4);
            case 5:
                return new C2576(this.f12703, (EnumC0868) obj2, interfaceC0274, 5);
            case 6:
                return new C2576((EnumC0868) this.f12703, (String) obj2, interfaceC0274, 6);
            case 7:
                return new C2576((C0172) this.f12703, (NotificationManager) obj2, interfaceC0274, 7);
            case 8:
                return new C2576((Context) this.f12703, (Exception) obj2, interfaceC0274, 8);
            case 9:
                return new C2576((C1014) this.f12703, (Context) obj2, interfaceC0274, 9);
            case 10:
                return new C2576((C0093) this.f12703, (C2280) obj2, interfaceC0274, 10);
            case 11:
                return new C2576((C0093) this.f12703, (Dialog) obj2, interfaceC0274, 11);
            case 12:
                C2576 c2576 = new C2576((InterfaceC0477) obj2, interfaceC0274);
                c2576.f12703 = obj;
                return c2576;
            case 13:
                return new C2576((C2585) this.f12703, (String) obj2, interfaceC0274, 13);
            case 14:
                return new C2576((C1279) this.f12703, (ArrayList) obj2, interfaceC0274, 14);
            case 15:
                return new C2576((C0046) this.f12703, (ArrayList) obj2, interfaceC0274, 15);
            case 16:
                return new C2576((C1279) this.f12703, (C1404) obj2, interfaceC0274, 16);
            case 17:
                return new C2576((C1785) this.f12703, (ArrayList) obj2, interfaceC0274, 17);
            default:
                return new C2576((InterfaceC1549) this.f12703, (List) obj2, interfaceC0274, 18);
        }
    }

    @Override // yyds.InterfaceC0477
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final Object mo511(Object obj, Object obj2) throws Throwable {
        int i = this.f12705;
        C2746 c2746 = C2746.f13459;
        InterfaceC0990 interfaceC0990 = (InterfaceC0990) obj;
        InterfaceC0274 interfaceC0274 = (InterfaceC0274) obj2;
        switch (i) {
            case 0:
                break;
            case 1:
                ((C2576) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
                break;
            case 2:
                ((C2576) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
                break;
            case 3:
                break;
            case 4:
                ((C2576) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
                break;
            case 5:
                ((C2576) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
                break;
            case 6:
                ((C2576) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
                break;
            case 7:
                ((C2576) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
                break;
            case 8:
                ((C2576) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
                break;
            case 9:
                ((C2576) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
                break;
            case 10:
                ((C2576) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                ((C2576) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
                break;
            case 14:
                ((C2576) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
                break;
            case 15:
                ((C2576) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
                break;
            case 16:
                ((C2576) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
                break;
            case 17:
                ((C2576) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
                break;
            default:
                ((C2576) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
                break;
        }
        return c2746;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2576(InterfaceC0477 interfaceC0477, InterfaceC0274 interfaceC0274) {
        super(2, interfaceC0274);
        this.f12705 = 12;
        this.f12704 = interfaceC0477;
    }
}
