package p198nb;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.provider.Settings;
import bsh.org.objectweb.asm.Opcodes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ng.AbstractC3015m;
import ng.C3004b;
import ng.C3011i;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p023b8.C0205c;
import p054dg.C0795n;
import p218og.AbstractC3149m;
import p276sf.C3959f;
import p304uf.C4329c;
import tf.AbstractC4166m;
import tf.AbstractC4170q;
import tf.C4173t;

/* JADX INFO: renamed from: nb.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2928c {

    /* JADX INFO: renamed from: a */
    public static final C2928c f9573a = new C2928c();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static List m6339a(Context context, String str) {
        context.getClass();
        str.getClass();
        String string = AbstractC3149m.m6703R0(str).toString();
        if (string.length() > 0) {
            return AbstractC0000a.m99x0(string);
        }
        C4329c c4329cM7E = AbstractC0000a.m7E();
        c4329cM7E.add(HttpUrl.FRAGMENT_ENCODE_SET);
        String strM6340c = m6340c(context);
        if (AbstractC3149m.m6721t0(strM6340c)) {
            strM6340c = null;
        }
        if (strM6340c != null) {
            c4329cM7E.add(strM6340c);
        }
        Iterator it = f9573a.m6341b(context).iterator();
        while (it.hasNext()) {
            c4329cM7E.add(((C2930d) it.next()).f9588a);
        }
        return AbstractC4166m.m8418p1(AbstractC0000a.m90t(c4329cM7E));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static String m6340c(Context context) {
        Object c3959f;
        Object obj = HttpUrl.FRAGMENT_ENCODE_SET;
        context.getClass();
        try {
            String string = Settings.Secure.getString(context.getContentResolver(), "tts_default_synth");
            if (string == null) {
                string = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            c3959f = AbstractC3149m.m6703R0(string).toString();
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (!(c3959f instanceof C3959f)) {
            obj = c3959f;
        }
        return (String) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final List m6341b(Context context) {
        Object c3959f;
        Object obj = C4173t.f13710g;
        context.getClass();
        try {
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("android.intent.action.TTS_SERVICE");
            List<ResolveInfo> listQueryIntentServices = Build.VERSION.SDK_INT >= 33 ? packageManager.queryIntentServices(intent, PackageManager.ResolveInfoFlags.of(131072L)) : packageManager.queryIntentServices(intent, Opcodes.ACC_DEPRECATED);
            listQueryIntentServices.getClass();
            C3011i c3011iM6414X = AbstractC3015m.m6414X(new C0795n(listQueryIntentServices, 6), new C2924a(this, packageManager));
            C2926b c2926b = C2926b.f9570n;
            c2926b.getClass();
            C0205c c0205c = new C0205c(7);
            ArrayList arrayList = new ArrayList();
            C3004b c3004b = new C3004b(c3011iM6414X.iterator(), c2926b);
            while (c3004b.hasNext()) {
                arrayList.add(c3004b.next());
            }
            AbstractC4170q.m8431g1(arrayList, c0205c);
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(next);
                    while (it.hasNext()) {
                        arrayList2.add(it.next());
                    }
                    c3959f = arrayList2;
                } else {
                    c3959f = AbstractC0000a.m99x0(next);
                }
            } else {
                c3959f = obj;
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (!(c3959f instanceof C3959f)) {
            obj = c3959f;
        }
        return (List) obj;
    }
}
