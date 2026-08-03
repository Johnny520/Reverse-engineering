package Yue;

import Yue.InterfaceC7144;
import android.app.RemoteInput;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: Yue.ۥۡۦۣۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C7086 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final String f21422 = "android.remoteinput.results";

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final String f21423 = "android.remoteinput.resultsData";

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final String f21424 = "android.remoteinput.dataTypeResultsData";

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final String f21425 = "android.remoteinput.resultsSource";

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int f21426 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int f21427 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final int f21428 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int f21429 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final int f21430 = 2;

    /* JADX INFO: renamed from: ۥ */
    public final String f2668;

    /* JADX INFO: renamed from: ۥ۟ */
    public final CharSequence f2669;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final CharSequence[] f21431;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final boolean f21432;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final int f21433;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final Bundle f21434;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final Set<String> f21435;

    /* JADX INFO: renamed from: Yue.ۥۡۦۣۨ$ۥ */
    @InterfaceC7113(20)
    public static class C1163 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static void m3377(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public static RemoteInput m3378(C7086 c7086) {
            RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(c7086.m22131()).setLabel(c7086.m22130()).setChoices(c7086.m22127()).setAllowFreeFormInput(c7086.m22125()).addExtras(c7086.m22129());
            Set<String> setM22126 = c7086.m22126();
            if (setM22126 != null) {
                Iterator<String> it = setM22126.iterator();
                while (it.hasNext()) {
                    C1164.m22136(builderAddExtras, it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                C7088.m3384(builderAddExtras, c7086.m22128());
            }
            return builderAddExtras.build();
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static C7086 m22133(Object obj) {
            RemoteInput remoteInput = (RemoteInput) obj;
            C7089 c7089M3385 = new C7089(remoteInput.getResultKey()).m22142(remoteInput.getLabel()).m22140(remoteInput.getChoices()).m22139(remoteInput.getAllowFreeFormInput()).m3385(remoteInput.getExtras());
            Set<String> setM3380 = C1164.m3380(remoteInput);
            if (setM3380 != null) {
                Iterator<String> it = setM3380.iterator();
                while (it.hasNext()) {
                    c7089M3385.m22138(it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                c7089M3385.m22141(C7088.m3383(remoteInput));
            }
            return c7089M3385.m3386();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static Bundle m22134(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۣۨ$ۥ۟ */
    @InterfaceC7113(26)
    public static class C1164 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static void m3379(C7086 c7086, Intent intent, Map<String, Uri> map) {
            RemoteInput.addDataResultToIntent(C7086.m22116(c7086), intent, map);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static Set<String> m3380(Object obj) {
            return ((RemoteInput) obj).getAllowedDataTypes();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static Map<String, Uri> m22135(Intent intent, String str) {
            return RemoteInput.getDataResultsFromIntent(intent, str);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static RemoteInput.Builder m22136(RemoteInput.Builder builder, String str, boolean z) {
            return builder.setAllowDataType(str, z);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۣۨ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7113(28)
    public static class C7087 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static int m3381(Intent intent) {
            return RemoteInput.getResultsSource(intent);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static void m3382(Intent intent, int i) {
            RemoteInput.setResultsSource(intent, i);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۣۨ$ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC7113(29)
    public static class C7088 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static int m3383(Object obj) {
            return ((RemoteInput) obj).getEditChoicesBeforeSending();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static RemoteInput.Builder m3384(RemoteInput.Builder builder, int i) {
            return builder.setEditChoicesBeforeSending(i);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۣۨ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class C7089 {

        /* JADX INFO: renamed from: ۥ */
        public final String f2670;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public CharSequence f21437;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public CharSequence[] f21438;

        /* JADX INFO: renamed from: ۥ۟ */
        public final Set<String> f2671 = new HashSet();

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final Bundle f21436 = new Bundle();

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public boolean f21439 = true;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public int f21440 = 0;

        public C7089(@InterfaceC6391 String str) {
            if (str == null) {
                throw new IllegalArgumentException("Result key can't be null");
            }
            this.f2670 = str;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ */
        public C7089 m3385(@InterfaceC6391 Bundle bundle) {
            if (bundle != null) {
                this.f21436.putAll(bundle);
            }
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟ */
        public C7086 m3386() {
            return new C7086(this.f2670, this.f21437, this.f21438, this.f21439, this.f21440, this.f21436, this.f2671);
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public Bundle m22137() {
            return this.f21436;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public C7089 m22138(@InterfaceC6391 String str, boolean z) {
            if (z) {
                this.f2671.add(str);
            } else {
                this.f2671.remove(str);
            }
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public C7089 m22139(boolean z) {
            this.f21439 = z;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public C7089 m22140(@InterfaceC6490 CharSequence[] charSequenceArr) {
            this.f21438 = charSequenceArr;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public C7089 m22141(int i) {
            this.f21440 = i;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public C7089 m22142(@InterfaceC6490 CharSequence charSequence) {
            this.f21437 = charSequence;
            return this;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۣۨ$ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC7090 {
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۣۨ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC7091 {
    }

    public C7086(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, int i, Bundle bundle, Set<String> set) {
        this.f2668 = str;
        this.f2669 = charSequence;
        this.f21431 = charSequenceArr;
        this.f21432 = z;
        this.f21433 = i;
        this.f21434 = bundle;
        this.f21435 = set;
        if (m22128() == 2 && !m22125()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static void m3375(@InterfaceC6391 C7086 c7086, @InterfaceC6391 Intent intent, @InterfaceC6391 Map<String, Uri> map) {
        C1164.m3379(c7086, intent, map);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static void m3376(@InterfaceC6391 C7086[] c7086Arr, @InterfaceC6391 Intent intent, @InterfaceC6391 Bundle bundle) {
        C1163.m3377(m22117(c7086Arr), intent, bundle);
    }

    @InterfaceC7113(20)
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static RemoteInput m22116(C7086 c7086) {
        return C1163.m3378(c7086);
    }

    @InterfaceC7113(20)
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static RemoteInput[] m22117(C7086[] c7086Arr) {
        if (c7086Arr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[c7086Arr.length];
        for (int i = 0; i < c7086Arr.length; i++) {
            remoteInputArr[i] = m22116(c7086Arr[i]);
        }
        return remoteInputArr;
    }

    @InterfaceC7113(20)
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static C7086 m22118(RemoteInput remoteInput) {
        return C1163.m22133(remoteInput);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static Intent m22119(Intent intent) {
        ClipData clipData = intent.getClipData();
        if (clipData == null) {
            return null;
        }
        ClipDescription description = clipData.getDescription();
        if (description.hasMimeType("text/vnd.android.intent") && description.getLabel().toString().contentEquals(f21422)) {
            return clipData.getItemAt(0).getIntent();
        }
        return null;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static Map<String, Uri> m22120(@InterfaceC6391 Intent intent, @InterfaceC6391 String str) {
        return C1164.m22135(intent, str);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static String m22121(String str) {
        return f21424 + str;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static Bundle m22122(@InterfaceC6391 Intent intent) {
        return C1163.m22134(intent);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static int m22123(@InterfaceC6391 Intent intent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C7087.m3381(intent);
        }
        Intent intentM22119 = m22119(intent);
        if (intentM22119 == null) {
            return 0;
        }
        return intentM22119.getExtras().getInt(f21425, 0);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static void m22124(@InterfaceC6391 Intent intent, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            C7087.m3382(intent, i);
            return;
        }
        Intent intentM22119 = m22119(intent);
        if (intentM22119 == null) {
            intentM22119 = new Intent();
        }
        intentM22119.putExtra(f21425, i);
        intent.setClipData(ClipData.newIntent(f21422, intentM22119));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean m22125() {
        return this.f21432;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public Set<String> m22126() {
        return this.f21435;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public CharSequence[] m22127() {
        return this.f21431;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public int m22128() {
        return this.f21433;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public Bundle m22129() {
        return this.f21434;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public CharSequence m22130() {
        return this.f2669;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public String m22131() {
        return this.f2668;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public boolean m22132() {
        return (m22125() || (m22127() != null && m22127().length != 0) || m22126() == null || m22126().isEmpty()) ? false : true;
    }
}
