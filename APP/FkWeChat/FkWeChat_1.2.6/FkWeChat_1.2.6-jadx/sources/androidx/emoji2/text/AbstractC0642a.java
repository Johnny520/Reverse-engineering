package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.emoji2.text.C0644c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p292u3.C8500c;
import p320w3.AbstractC9170c;

/* JADX INFO: renamed from: androidx.emoji2.text.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0642a {

    /* JADX INFO: renamed from: androidx.emoji2.text.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final b f1853a;

        public a(b bVar) {
            this.f1853a = bVar == null ? m2501e() : bVar;
        }

        /* JADX INFO: renamed from: e */
        public static b m2501e() {
            return Build.VERSION.SDK_INT >= 28 ? new d() : new c();
        }

        /* JADX INFO: renamed from: a */
        public final C0644c.c m2502a(Context context, C8500c c8500c) {
            if (c8500c == null) {
                return null;
            }
            return new C0646e(context, c8500c);
        }

        /* JADX INFO: renamed from: b */
        public final List m2503b(Signature[] signatureArr) {
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            return Collections.singletonList(arrayList);
        }

        /* JADX INFO: renamed from: c */
        public C0644c.c m2504c(Context context) {
            return m2502a(context, m2508h(context));
        }

        /* JADX INFO: renamed from: d */
        public final C8500c m2505d(ProviderInfo providerInfo, PackageManager packageManager) {
            String str = providerInfo.authority;
            String str2 = providerInfo.packageName;
            return new C8500c(str, str2, "emojicompat-emoji-font", m2503b(this.f1853a.mo2510b(packageManager, str2)));
        }

        /* JADX INFO: renamed from: f */
        public final boolean m2506f(ProviderInfo providerInfo) {
            ApplicationInfo applicationInfo;
            return (providerInfo == null || (applicationInfo = providerInfo.applicationInfo) == null || (applicationInfo.flags & 1) != 1) ? false : true;
        }

        /* JADX INFO: renamed from: g */
        public final ProviderInfo m2507g(PackageManager packageManager) {
            Iterator it = this.f1853a.mo2511c(packageManager, new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
            while (it.hasNext()) {
                ProviderInfo providerInfoMo2509a = this.f1853a.mo2509a((ResolveInfo) it.next());
                if (m2506f(providerInfoMo2509a)) {
                    return providerInfoMo2509a;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: h */
        public C8500c m2508h(Context context) {
            PackageManager packageManager = context.getPackageManager();
            AbstractC9170c.m35615d(packageManager, "Package manager required to locate emoji font provider");
            ProviderInfo providerInfoM2507g = m2507g(packageManager);
            if (providerInfoM2507g == null) {
                return null;
            }
            try {
                return m2505d(providerInfoM2507g, packageManager);
            } catch (PackageManager.NameNotFoundException e10) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e10);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.a$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class b {
        /* JADX INFO: renamed from: a */
        public abstract ProviderInfo mo2509a(ResolveInfo resolveInfo);

        /* JADX INFO: renamed from: b */
        public Signature[] mo2510b(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        /* JADX INFO: renamed from: c */
        public abstract List mo2511c(PackageManager packageManager, Intent intent, int i10);
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.a$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class c extends b {
        @Override // androidx.emoji2.text.AbstractC0642a.b
        /* JADX INFO: renamed from: a */
        public ProviderInfo mo2509a(ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        @Override // androidx.emoji2.text.AbstractC0642a.b
        /* JADX INFO: renamed from: c */
        public List mo2511c(PackageManager packageManager, Intent intent, int i10) {
            return packageManager.queryIntentContentProviders(intent, i10);
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.a$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class d extends c {
        @Override // androidx.emoji2.text.AbstractC0642a.b
        /* JADX INFO: renamed from: b */
        public Signature[] mo2510b(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0646e m2500a(Context context) {
        return (C0646e) new a(null).m2504c(context);
    }
}
