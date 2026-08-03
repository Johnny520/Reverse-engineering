package androidx.emoji2.text;

import Yue.C5045;
import Yue.C6740;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7113;
import Yue.InterfaceC7144;
import Yue.InterfaceC8392;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.emoji2.text.C8812;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: androidx.emoji2.text.ۥ */
/* JADX INFO: loaded from: classes.dex */
public final class C1668 {

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ$ۥ, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    public static class C8808 {

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6391
        public static final String f3760 = "emoji2.text.DefaultEmojiConfig";

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @InterfaceC6391
        public static final String f29492 = "androidx.content.action.LOAD_EMOJI_FONT";

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        @InterfaceC6391
        public static final String f29493 = "emojicompat-emoji-font";

        /* JADX INFO: renamed from: ۥ */
        public final C8809 f3761;

        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
        public C8808(@InterfaceC6490 C8809 c8809) {
            this.f3761 = c8809 == null ? m29610() : c8809;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static C8809 m29610() {
            return Build.VERSION.SDK_INT >= 28 ? new C8811() : new C8810();
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ */
        public final C8812.AbstractC8815 m4775(@InterfaceC6391 Context context, @InterfaceC6490 C5045 c5045) {
            if (c5045 == null) {
                return null;
            }
            return new C8830(context, c5045);
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟ */
        public final List<List<byte[]>> m4776(@InterfaceC6391 Signature[] signatureArr) {
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            return Collections.singletonList(arrayList);
        }

        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public C8812.AbstractC8815 m29611(@InterfaceC6391 Context context) {
            return m4775(context, m29615(context));
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final C5045 m29612(@InterfaceC6391 ProviderInfo providerInfo, @InterfaceC6391 PackageManager packageManager) throws PackageManager.NameNotFoundException {
            String str = providerInfo.authority;
            String str2 = providerInfo.packageName;
            return new C5045(str, str2, f29493, m4776(this.f3761.mo4778(packageManager, str2)));
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final boolean m29613(@InterfaceC6490 ProviderInfo providerInfo) {
            ApplicationInfo applicationInfo;
            return (providerInfo == null || (applicationInfo = providerInfo.applicationInfo) == null || (applicationInfo.flags & 1) != 1) ? false : true;
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final ProviderInfo m29614(@InterfaceC6391 PackageManager packageManager) {
            Iterator<ResolveInfo> it = this.f3761.mo29616(packageManager, new Intent(f29492), 0).iterator();
            while (it.hasNext()) {
                ProviderInfo providerInfoMo4777 = this.f3761.mo4777(it.next());
                if (m29613(providerInfoMo4777)) {
                    return providerInfoMo4777;
                }
            }
            return null;
        }

        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
        @InterfaceC8392
        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public C5045 m29615(@InterfaceC6391 Context context) {
            PackageManager packageManager = context.getPackageManager();
            C6740.m21416(packageManager, "Package manager required to locate emoji font provider");
            ProviderInfo providerInfoM29614 = m29614(packageManager);
            if (providerInfoM29614 == null) {
                return null;
            }
            try {
                return m29612(providerInfoM29614, packageManager);
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf(f3760, e);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ$ۥ۟, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    public static class C8809 {
        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ */
        public ProviderInfo mo4777(@InterfaceC6391 ResolveInfo resolveInfo) {
            throw new IllegalStateException("Unable to get provider info prior to API 19");
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟ */
        public Signature[] mo4778(@InterfaceC6391 PackageManager packageManager, @InterfaceC6391 String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public List<ResolveInfo> mo29616(@InterfaceC6391 PackageManager packageManager, @InterfaceC6391 Intent intent, int i) {
            return Collections.emptyList();
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @InterfaceC7113(19)
    public static class C8810 extends C8809 {
        @Override // androidx.emoji2.text.C1668.C8809
        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ */
        public ProviderInfo mo4777(@InterfaceC6391 ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        @Override // androidx.emoji2.text.C1668.C8809
        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟ */
        public List<ResolveInfo> mo29616(@InterfaceC6391 PackageManager packageManager, @InterfaceC6391 Intent intent, int i) {
            return packageManager.queryIntentContentProviders(intent, i);
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ$ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @InterfaceC7113(28)
    public static class C8811 extends C8810 {
        @Override // androidx.emoji2.text.C1668.C8809
        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟ */
        public Signature[] mo4778(@InterfaceC6391 PackageManager packageManager, @InterfaceC6391 String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ */
    public static C8830 m4774(@InterfaceC6391 Context context) {
        return (C8830) new C8808(null).m29611(context);
    }
}
