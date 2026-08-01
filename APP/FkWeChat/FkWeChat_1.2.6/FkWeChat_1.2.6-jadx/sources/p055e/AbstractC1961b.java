package p055e;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: e.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1961b {

    /* JADX INFO: renamed from: a */
    public final Map f5458a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final Map f5459b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final Map f5460c = new HashMap();

    /* JADX INFO: renamed from: d */
    public ArrayList f5461d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final transient Map f5462e = new HashMap();

    /* JADX INFO: renamed from: f */
    public final Map f5463f = new HashMap();

    /* JADX INFO: renamed from: g */
    public final Bundle f5464g = new Bundle();

    /* JADX INFO: renamed from: e.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a {
    }

    /* JADX INFO: renamed from: a */
    public final void m7105a(int i10, String str) {
        this.f5458a.put(Integer.valueOf(i10), str);
        this.f5459b.put(str, Integer.valueOf(i10));
    }

    /* JADX INFO: renamed from: b */
    public final boolean m7106b(int i10, int i11, Intent intent) {
        String str = (String) this.f5458a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        AbstractC1960a.m7104a(this.f5462e.get(str));
        m7107c(str, i11, intent, null);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m7107c(String str, int i10, Intent intent, a aVar) {
        this.f5463f.remove(str);
        this.f5464g.putParcelable(str, new ActivityResult(i10, intent));
    }

    /* JADX INFO: renamed from: d */
    public final void m7108d(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        this.f5461d = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        this.f5464g.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
        for (int i10 = 0; i10 < stringArrayList.size(); i10++) {
            String str = stringArrayList.get(i10);
            if (this.f5459b.containsKey(str)) {
                Integer num = (Integer) this.f5459b.remove(str);
                if (!this.f5464g.containsKey(str)) {
                    this.f5458a.remove(num);
                }
            }
            m7105a(integerArrayList.get(i10).intValue(), stringArrayList.get(i10));
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m7109e(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f5459b.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f5459b.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f5461d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f5464g.clone());
    }
}
