package p000a;

import android.os.Parcelable;
import androidx.activity.result.AbstractC0981a;
import java.util.HashMap;

/* JADX INFO: renamed from: a.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0527d0 extends AbstractC0489b0<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f1915a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0433Y f1916b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC0981a f1917c;

    public C0527d0(AbstractC0981a abstractC0981a, String str, AbstractC0433Y abstractC0433Y) {
        this.f1917c = abstractC0981a;
        this.f1915a = str;
        this.f1916b = abstractC0433Y;
    }

    /* JADX INFO: renamed from: a */
    public final void m1302a(Object obj) {
        AbstractC0981a abstractC0981a = this.f1917c;
        HashMap map = abstractC0981a.f3639b;
        String str = this.f1915a;
        Integer num = (Integer) map.get(str);
        AbstractC0433Y abstractC0433Y = this.f1916b;
        if (num != null) {
            abstractC0981a.f3641d.add(str);
            try {
                abstractC0981a.mo2279b(num.intValue(), abstractC0433Y, (Parcelable) obj);
                return;
            } catch (Exception e) {
                abstractC0981a.f3641d.remove(str);
                throw e;
            }
        }
        throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC0433Y + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
    }
}
