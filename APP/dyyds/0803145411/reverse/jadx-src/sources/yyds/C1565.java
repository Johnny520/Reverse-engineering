package yyds;

import android.media.MediaPlayer;
import android.widget.Button;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: yyds.ᛷᛵᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1565 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f7959;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ Object f7960;

    public /* synthetic */ C1565(int i, Object obj) {
        this.f7959 = i;
        this.f7960 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0164  */
    @Override // yyds.InterfaceC0477
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo511(Object obj, Object obj2) {
        Object next;
        Pair pair;
        Object next2;
        MediaPlayer mediaPlayer;
        int i = this.f7959;
        C2746 c2746 = C2746.f13459;
        Object obj3 = this.f7960;
        switch (i) {
            case 0:
                AbstractC2328.m4341(-604159737496430L);
                AbstractC2328.m4341(-604215572071278L);
                return C1938.m3739((C1938) obj2, null, null, (String) ((C0172) obj3).f997, 63);
            case 1:
                C0299 c0299 = (C0299) obj3;
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                ((Button) c0299.f1576).setText(AbstractC2328.m4341((iIntValue <= 0 || iIntValue != iIntValue2) ? -199814336381806L : -199792861545326L));
                ((Button) c0299.f1577).setText(iIntValue > 0 ? AbstractC0897.m1999(new StringBuilder(AbstractC2328.m4341(-199827221283694L)), iIntValue, ')') : AbstractC0897.m1999(new StringBuilder(AbstractC2328.m4341(-199857286054766L)), iIntValue2, ')'));
                return c2746;
            case 2:
                int iM1312 = AbstractC0473.m1312((CharSequence) obj, (char[]) obj3, ((Integer) obj2).intValue(), false);
                if (iM1312 < 0) {
                    return null;
                }
                return new Pair(Integer.valueOf(iM1312), 1);
            case 3:
                List list = (List) obj3;
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (list.size() == 1) {
                    String str = (String) AbstractC1595.m3266(list);
                    int iM1311 = AbstractC0473.m1311(charSequence, str, iIntValue3, false, 4);
                    pair = iM1311 < 0 ? null : new Pair(Integer.valueOf(iM1311), str);
                } else {
                    if (iIntValue3 < 0) {
                        iIntValue3 = 0;
                    }
                    C2807 c2807 = new C2807(iIntValue3, charSequence.length(), 1);
                    boolean z = charSequence instanceof String;
                    int i2 = c2807.f12491;
                    int i3 = c2807.f12493;
                    if (z) {
                        if ((i2 > 0 && iIntValue3 <= i3) || (i2 < 0 && i3 <= iIntValue3)) {
                            while (true) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        next2 = it.next();
                                        String str2 = (String) next2;
                                        if (str2.regionMatches(0, (String) charSequence, iIntValue3, str2.length())) {
                                        }
                                    } else {
                                        next2 = null;
                                    }
                                }
                                String str3 = (String) next2;
                                if (str3 != null) {
                                    pair = new Pair(Integer.valueOf(iIntValue3), str3);
                                } else if (iIntValue3 != i3) {
                                    iIntValue3 += i2;
                                }
                            }
                        }
                    } else if ((i2 > 0 && iIntValue3 <= i3) || (i2 < 0 && i3 <= iIntValue3)) {
                        int i4 = iIntValue3;
                        while (true) {
                            Iterator it2 = list.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    String str4 = (String) next;
                                    if (AbstractC0473.m1291(str4, 0, charSequence, i4, str4.length(), false)) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            String str5 = (String) next;
                            if (str5 != null) {
                                pair = new Pair(Integer.valueOf(i4), str5);
                            } else if (i4 != i3) {
                                i4 += i2;
                            }
                        }
                    }
                }
                if (pair != null) {
                    return new Pair(pair.getFirst(), Integer.valueOf(((String) pair.getSecond()).length()));
                }
                return null;
            default:
                C0074 c0074 = (C0074) obj3;
                int iIntValue4 = ((Integer) obj).intValue();
                AbstractC2328.m4341(-194836469285742L);
                File file = new File(((C2467) obj2).f12182);
                C2336 c2336 = C2336.f11496;
                c2336.m4354(AbstractC2328.m4341(-194291008439150L) + file.getAbsolutePath());
                StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-194338253079406L));
                sb.append(file.exists());
                sb.append(AbstractC2328.m4341(-194376907785070L));
                sb.append(file.exists() ? file.length() : 0L);
                sb.append(AbstractC2328.m4341(-194415562490734L));
                c2336.m4354(sb.toString());
                if (file.exists()) {
                    if (c0074.f642 == iIntValue4 && (mediaPlayer = (MediaPlayer) c0074.f643) != null && mediaPlayer.isPlaying()) {
                        c0074.m461();
                        C0433 c0433 = (C0433) c0074.f638;
                        if (c0433 != null) {
                            c0433.m1207(-1);
                        }
                    } else {
                        c0074.m461();
                        C2615.f12860.getClass();
                        C2615.m4695();
                        try {
                            MediaPlayer mediaPlayer2 = new MediaPlayer();
                            mediaPlayer2.setDataSource(file.getAbsolutePath());
                            mediaPlayer2.prepare();
                            mediaPlayer2.start();
                            mediaPlayer2.setOnCompletionListener(new C2575(2, c0074));
                            c0074.f643 = mediaPlayer2;
                            c0074.f642 = iIntValue4;
                            C0433 c04332 = (C0433) c0074.f638;
                            if (c04332 != null) {
                                c04332.m1207(iIntValue4);
                            }
                        } catch (Exception e) {
                            C2336.f11496.m4358(AbstractC2328.m4341(-194531526607726L), e);
                            AbstractC1960.m3789(AbstractC2328.m4341(-194553001444206L) + e.getMessage());
                        }
                    }
                    break;
                } else {
                    AbstractC1960.m3789(AbstractC2328.m4341(-194445627261806L) + file.getName());
                    c2336.m4353(AbstractC2328.m4341(-194488576934766L) + file.getAbsolutePath());
                }
                return c2746;
        }
    }
}
