package p015b0;

import android.R;
import android.content.res.Resources;
import android.os.Build;
import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.InterfaceC0572r;
import p056e0.C1966e;
import p189n.AbstractC5285t2;
import p251r2.AbstractC6468f;
import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: b0.g3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0769g3 {

    /* JADX INFO: renamed from: t */
    public static final EnumC0769g3 f2297t;

    /* JADX INFO: renamed from: u */
    public static final EnumC0769g3 f2298u;

    /* JADX INFO: renamed from: v */
    public static final EnumC0769g3 f2299v;

    /* JADX INFO: renamed from: w */
    public static final EnumC0769g3 f2300w;

    /* JADX INFO: renamed from: x */
    public static final EnumC0769g3 f2301x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC0769g3[] f2302y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ InterfaceC7197a f2303z;

    /* JADX INFO: renamed from: q */
    public final Object f2304q;

    /* JADX INFO: renamed from: r */
    public final int f2305r;

    /* JADX INFO: renamed from: s */
    public final int f2306s;

    static {
        C1966e c1966e = C1966e.f5474a;
        f2297t = new EnumC0769g3("Cut", 0, c1966e.m7119c(), R.string.cut, R.attr.actionModeCutDrawable);
        f2298u = new EnumC0769g3("Copy", 1, c1966e.m7118b(), R.string.copy, R.attr.actionModeCopyDrawable);
        f2299v = new EnumC0769g3("Paste", 2, c1966e.m7120d(), R.string.paste, R.attr.actionModePasteDrawable);
        f2300w = new EnumC0769g3("SelectAll", 3, c1966e.m7121e(), R.string.selectAll, R.attr.actionModeSelectAllDrawable);
        f2301x = new EnumC0769g3("Autofill", 4, c1966e.m7117a(), Build.VERSION.SDK_INT <= 26 ? AbstractC5285t2.f16232a : R.string.autofill, 0);
        EnumC0769g3[] enumC0769g3ArrM2890a = m2890a();
        f2302y = enumC0769g3ArrM2890a;
        f2303z = AbstractC7198b.m28437a(enumC0769g3ArrM2890a);
    }

    public EnumC0769g3(String str, int i10, Object obj, int i11, int i12) {
        this.f2304q = obj;
        this.f2305r = i11;
        this.f2306s = i12;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC0769g3[] m2890a() {
        return new EnumC0769g3[]{f2297t, f2298u, f2299v, f2300w, f2301x};
    }

    public static EnumC0769g3 valueOf(String str) {
        return (EnumC0769g3) Enum.valueOf(EnumC0769g3.class, str);
    }

    public static EnumC0769g3[] values() {
        return (EnumC0769g3[]) f2302y.clone();
    }

    /* JADX INFO: renamed from: c */
    public final int m2891c() {
        return this.f2306s;
    }

    /* JADX INFO: renamed from: g */
    public final Object m2892g() {
        return this.f2304q;
    }

    /* JADX INFO: renamed from: h */
    public final String m2893h(Resources resources) {
        return resources.getString(this.f2305r);
    }

    /* JADX INFO: renamed from: i */
    public final String m2894i(InterfaceC0572r interfaceC0572r, int i10) {
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(-309609081, i10, -1, "androidx.compose.foundation.text.TextContextMenuItems.resolvedString (ContextMenu.android.kt:188)");
        }
        String strM25642a = AbstractC6468f.m25642a(this.f2305r, interfaceC0572r, 0);
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return strM25642a;
    }
}
