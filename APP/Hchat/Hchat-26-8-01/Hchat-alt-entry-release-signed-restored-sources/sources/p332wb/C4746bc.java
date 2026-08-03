package p332wb;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import okhttp3.HttpUrl;
import p085fg.InterfaceC1231l;
import p117i0.C1808a0;
import p117i0.InterfaceC1809a1;
import p218og.AbstractC3149m;
import p251r.C3623h;
import p266s0.C3874d;
import p276sf.C3967n;
import tf.AbstractC4166m;
import tf.AbstractC4167n;

/* JADX INFO: renamed from: wb.bc */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4746bc implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f16009g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ SharedPreferences f16010h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f16011i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f16012j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4746bc(SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, int i9) {
        this.f16009g = i9;
        this.f16010h = sharedPreferences;
        this.f16011i = interfaceC1809a1;
        this.f16012j = interfaceC1809a12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f16009g) {
            case 0:
                ((C1808a0) obj).getClass();
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                this.f16011i.setValue(bool);
                InterfaceC1809a1 interfaceC1809a1 = this.f16012j;
                if (zBooleanValue) {
                    interfaceC1809a1.setValue(Boolean.FALSE);
                }
                this.f16010h.edit().putBoolean("game_emoji_fixed_result", zBooleanValue).putBoolean("game_emoji_pick_before_send", zBooleanValue ? false : ((Boolean) interfaceC1809a1.getValue()).booleanValue()).apply();
                break;
            case 2:
                Boolean bool2 = (Boolean) obj;
                boolean zBooleanValue2 = bool2.booleanValue();
                this.f16011i.setValue(bool2);
                InterfaceC1809a1 interfaceC1809a12 = this.f16012j;
                if (zBooleanValue2) {
                    interfaceC1809a12.setValue(Boolean.FALSE);
                }
                this.f16010h.edit().putBoolean("game_emoji_pick_before_send", zBooleanValue2).putBoolean("game_emoji_fixed_result", zBooleanValue2 ? false : ((Boolean) interfaceC1809a12.getValue()).booleanValue()).apply();
                break;
            case 3:
                Boolean bool3 = (Boolean) obj;
                boolean zBooleanValue3 = bool3.booleanValue();
                this.f16011i.setValue(bool3);
                SharedPreferences sharedPreferences = this.f16010h;
                SharedPreferences.Editor editorPutBoolean = sharedPreferences.edit().putBoolean("block_at_all_notification_enable", zBooleanValue3);
                if (zBooleanValue3 && !sharedPreferences.contains("block_at_all_notification_groups")) {
                    editorPutBoolean.putString("block_at_all_notification_groups", HttpUrl.FRAGMENT_ENCODE_SET);
                    this.f16012j.setValue(Boolean.FALSE);
                }
                editorPutBoolean.apply();
                break;
            case 4:
                if (((Boolean) obj).booleanValue()) {
                    this.f16011i.setValue(Boolean.TRUE);
                } else {
                    AbstractC4855en.m9269m(this.f16012j, Boolean.FALSE, this.f16010h, "zombie_check_auto_delete", false);
                }
                break;
            case 5:
                String str = (String) obj;
                str.getClass();
                this.f16011i.setValue(str);
                this.f16012j.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                this.f16010h.edit().putString("text_speech_tts_engine", str).putString("text_speech_tts_voice", HttpUrl.FRAGMENT_ENCODE_SET).apply();
                break;
            case 6:
                List list = (List) obj;
                list.getClass();
                ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C5292s0) it.next()).f20550a);
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (!AbstractC3149m.m6721t0((String) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                Set setM8412U1 = AbstractC4166m.m8412U1(arrayList2);
                InterfaceC1809a1 interfaceC1809a13 = this.f16011i;
                interfaceC1809a13.setValue(setM8412U1);
                this.f16010h.edit().putString("targets", AbstractC4955ho.m9316D5((Set) interfaceC1809a13.getValue())).apply();
                this.f16012j.setValue(C5415vo.f21486a);
                break;
            case 7:
                List list2 = (List) obj;
                list2.getClass();
                C5292s0 c5292s0 = (C5292s0) AbstractC4166m.m8424v1(list2);
                String str2 = c5292s0 != null ? c5292s0.f20550a : null;
                if (str2 == null) {
                    str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                InterfaceC1809a1 interfaceC1809a14 = this.f16011i;
                interfaceC1809a14.setValue(str2);
                this.f16010h.edit().putString("audio_transform_last_talker", (String) interfaceC1809a14.getValue()).apply();
                this.f16012j.setValue(C4831e.f16739b);
                break;
            case 8:
                C3623h c3623h = (C3623h) obj;
                c3623h.getClass();
                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19720a0, 3);
                C3623h.m7604a(c3623h, null, new C3874d(-2000869548, new C5332t7(this.f16010h, this.f16011i, this.f16012j, 8), true), 3);
                break;
            case 9:
                List list3 = (List) obj;
                list3.getClass();
                ArrayList arrayList3 = new ArrayList(AbstractC4167n.m8429e1(list3));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((C5292s0) it2.next()).f20550a);
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : arrayList3) {
                    if (!AbstractC3149m.m6721t0((String) obj3)) {
                        arrayList4.add(obj3);
                    }
                }
                Set setM8412U12 = AbstractC4166m.m8412U1(arrayList4);
                InterfaceC1809a1 interfaceC1809a15 = this.f16011i;
                interfaceC1809a15.setValue(setM8412U12);
                this.f16010h.edit().putString("targets", AbstractC4955ho.m9316D5((Set) interfaceC1809a15.getValue())).apply();
                this.f16012j.setValue(C5217po.f20027a);
                break;
            case 10:
                C3623h c3623h2 = (C3623h) obj;
                c3623h2.getClass();
                C3623h.m7604a(c3623h2, null, AbstractC5193p0.f19603J2, 3);
                C3623h.m7604a(c3623h2, null, new C3874d(-907854332, new C5332t7(this.f16010h, this.f16011i, this.f16012j, 5), true), 3);
                break;
            case 11:
                C3623h c3623h3 = (C3623h) obj;
                c3623h3.getClass();
                C3623h.m7604a(c3623h3, null, AbstractC5193p0.f19858r2, 3);
                C3623h.m7604a(c3623h3, null, new C3874d(-751119238, new C5332t7(this.f16010h, this.f16011i, this.f16012j, 10), true), 3);
                break;
            case 12:
                C3623h c3623h4 = (C3623h) obj;
                c3623h4.getClass();
                C3623h.m7604a(c3623h4, null, AbstractC5193p0.f19582G2, 3);
                C3623h.m7604a(c3623h4, null, new C3874d(-1836299073, new C5332t7(this.f16010h, this.f16011i, this.f16012j, 11), true), 3);
                break;
            default:
                String str3 = (String) obj;
                str3.getClass();
                this.f16011i.setValue(str3);
                this.f16012j.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                this.f16010h.edit().putString("text_voice_engine", str3).putString("text_voice_tts_voice", HttpUrl.FRAGMENT_ENCODE_SET).apply();
                break;
        }
        return C3967n.f12976a;
    }
}
