package p109hb;

import android.app.Activity;
import android.content.SharedPreferences;
import be.AbstractC0283h;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p000a.AbstractC0000a;
import p003a2.C0014a;
import p014b.C0126e;
import p037cb.C0545f;
import p051db.C0763a;
import p051db.C0765c;
import p051db.C0769g;
import p085fg.InterfaceC1231l;
import p153k8.C2356t;
import p276sf.C3967n;
import p332wb.C5026jv;
import tf.AbstractC4167n;

/* JADX INFO: renamed from: hb.a0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1668a0 implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C1684i0 f5501g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f5502h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Set f5503i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Activity f5504j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ List f5505k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ List f5506l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ int f5507m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ C0126e f5508n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1668a0(C1684i0 c1684i0, int i9, Set set, Activity activity, List list, List list2, int i10, C0126e c0126e) {
        this.f5501g = c1684i0;
        this.f5502h = i9;
        this.f5503i = set;
        this.f5504j = activity;
        this.f5505k = list;
        this.f5506l = list2;
        this.f5507m = i10;
        this.f5508n = c0126e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    @Override // p085fg.InterfaceC1231l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) throws JSONException {
        Long lValueOf;
        long jLongValue;
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutBoolean;
        long j3;
        C1684i0 c1684i0 = this.f5501g;
        int i9 = this.f5502h;
        Set set = this.f5503i;
        Activity activity = this.f5504j;
        List list = this.f5505k;
        List list2 = this.f5506l;
        int i10 = this.f5507m;
        C0126e c0126e = this.f5508n;
        Long l10 = (Long) obj;
        long jLongValue2 = l10.longValue();
        c1684i0.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i9 == 0) {
            if (jLongValue2 <= jCurrentTimeMillis) {
                l10 = null;
            }
            jLongValue = l10 != null ? l10.longValue() : 0L;
        } else if (i9 != 2) {
            long jM170F = C0014a.m170F(jLongValue2, i9, set, jCurrentTimeMillis);
            lValueOf = jM170F > jCurrentTimeMillis ? Long.valueOf(jM170F) : null;
            if (lValueOf == null) {
                jLongValue = lValueOf.longValue();
            }
        } else {
            if (!set.isEmpty()) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(jLongValue2);
                if (!set.contains(Integer.valueOf(calendar.get(7)))) {
                    jLongValue2 = C0014a.m173b(jLongValue2, i9, set);
                }
                long jM170F2 = C0014a.m170F(jLongValue2, i9, set, jCurrentTimeMillis);
                if (jM170F2 > jCurrentTimeMillis) {
                }
                if (lValueOf == null) {
                }
            }
        }
        if (jLongValue <= 0) {
            c1684i0.m4288e(activity, "计划时间需要晚于当前时间");
        } else {
            C0769g c0769g = new C0769g(c1684i0.f5582a.f12143a);
            Activity activity2 = activity;
            long j4 = jLongValue;
            C0765c c0765cM182p = C0014a.m182p();
            ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C1697t c1697t = (C1697t) it.next();
                c1697t.getClass();
                JSONObject jSONObject = new JSONObject();
                C0765c c0765c = c0765cM182p;
                Activity activity3 = activity2;
                int i11 = i9;
                jSONObject.put("msgId", c1697t.f5646a);
                jSONObject.put("type", c1697t.f5647b);
                jSONObject.put("sourceTalker", c1697t.f5648c);
                Set set2 = set;
                jSONObject.put("content", c1697t.f5649d);
                C0769g c0769g2 = c0769g;
                jSONObject.put("imagePath", c1697t.f5650e);
                Iterator it2 = it;
                jSONObject.put("createTime", c1697t.f5651f);
                jSONObject.put("voicePath", c1697t.f5653h);
                jSONObject.put("voiceDurationMillis", c1697t.f5654i);
                jSONObject.put("voiceFileName", c1697t.f5655j);
                C2356t c2356t = c1697t.f5652g;
                if (c2356t != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    j3 = j4;
                    jSONObject2.put("msgId", c2356t.f7741a);
                    jSONObject2.put("sourceTalker", c2356t.f7742b);
                    jSONObject2.put("content", c2356t.f7743c);
                    jSONObject2.put("retrType", c2356t.f7744d);
                    jSONObject2.put("msgFromScene", c2356t.f7745e);
                    jSONObject2.put("fileName", c2356t.f7746f);
                    jSONObject2.put("length", c2356t.f7747g);
                    jSONObject.put("retransmit", jSONObject2);
                } else {
                    j3 = j4;
                }
                String string = jSONObject.toString();
                string.getClass();
                arrayList.add(new C0763a(8, string));
                activity2 = activity3;
                c0765cM182p = c0765c;
                i9 = i11;
                set = set2;
                c0769g = c0769g2;
                it = it2;
                j4 = j3;
            }
            C0765c c0765c2 = c0765cM182p;
            Activity activity4 = activity2;
            int i12 = i9;
            Set set3 = set;
            C0769g c0769g3 = c0769g;
            long j5 = j4;
            ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(list2));
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((C5026jv) it3.next()).f18249a);
            }
            C0765c c0765cM1980a = C0765c.m1980a(c0765c2, 8, null, null, null, arrayList2, j5, i12, set3, 0, 0, false, null, 0L, 0, 0, "定时转发[H]", 0, 0, arrayList, i10, AbstractC0000a.m99x0(Long.valueOf(j5)), 458269);
            SharedPreferences sharedPreferences = c0769g3.f2319a;
            if (sharedPreferences != null && (editorEdit = sharedPreferences.edit()) != null && (editorPutBoolean = editorEdit.putBoolean("scheduled_task_enable", true)) != null) {
                editorPutBoolean.apply();
            }
            c0769g3.m1984d(C0014a.m184r(c0765cM1980a));
            C0545f c0545f = AbstractC0283h.f824a;
            if (c0545f != null) {
                c0545f.m1554r();
            }
            c0126e.m640r(c1684i0.f5583b);
            c1684i0.m4288e(activity4, "定时任务已保存");
        }
        return C3967n.f12976a;
    }
}
