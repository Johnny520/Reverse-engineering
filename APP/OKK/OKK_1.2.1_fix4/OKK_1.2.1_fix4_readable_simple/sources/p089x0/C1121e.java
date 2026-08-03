package p089x0;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Path;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.C0498w;
import androidx.fragment.app.C0509i;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.io.Serializable;
import java.util.concurrent.CopyOnWriteArrayList;
import org.luckypray.dexkit.C1031R;
import p034S.InterfaceC0326f;
import p037U.AbstractC0355O;
import p055f.InterfaceC0784o;
import p055f.MenuC0779j;

/* JADX INFO: renamed from: x0.e */
/* JADX INFO: loaded from: classes.dex */
public class C1121e implements InterfaceC0326f, InterfaceC0784o {

    /* JADX INFO: renamed from: b */
    public static C1121e f4286b;

    /* JADX INFO: renamed from: c */
    public static C1121e f4287c;

    /* JADX INFO: renamed from: d */
    public static C1121e f4288d;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4289a;

    public /* synthetic */ C1121e(int r1) {
        this.f4289a = r1;
    }

    /* JADX INFO: renamed from: b */
    public static final int m2635b(int r1) {
        if ((r1 & 2) != 0) goto L5;
        return r1;
    L5:
        return r1 | 64;
    }

    /* JADX INFO: renamed from: c */
    public static Path m2636c(float r1, float r2, float r3, float r4) {
        Path r02 = new Path();
        r02.moveTo(r1, r2);
        r02.lineTo(r3, r4);
        return r02;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m2637e(InputConnection r7, Editable r8, int r9, int r10, boolean r11) {
        if (r8 == null) goto L102;
        if (r7 == null) goto L109;
        if (r9 < 0) goto L103;
        if (r10 < 0) goto L110;
        int r1 = Selection.getSelectionStart(r8);
        int r2 = Selection.getSelectionEnd(r8);
        if (r1 == (-1)) goto L104;
        if (r2 == (-1)) goto L105;
        if (r1 == r2) goto L15;
        return false;
    L15:
        if (r11 == false) goto L71;
        int r92 = Math.max(r9, 0);
        int r112 = r8.length();
        if (r1 < 0) goto L21;
        if (r112 < r1) goto L21;
        if (r92 < 0) goto L21;
    L22:
        boolean r113 = false;
    L23:
        if (r92 == 0) goto L43;
        r1 = r1 - 1;
        if (r1 < 0) goto L27;
        char r5 = r8.charAt(r1);
        if (r113 == true) goto L33;
        if (Character.isSurrogate(r5) == false) goto L38;
        if (Character.isHighSurrogate(r5) == true) goto L21;
        r113 = true;
        goto L23
    L38:
        r92 = r92 - 1;
        goto L23
    L33:
        if (Character.isHighSurrogate(r5) == false) goto L21;
        r92 = r92 - 1;
        goto L22
    L27:
        if (r113 == true) goto L21;
        r1 = 0;
    L43:
        int r93 = Math.max(r10, 0);
        int r102 = r8.length();
        if (r2 < 0) goto L48;
        if (r102 < r2) goto L48;
        if (r93 < 0) goto L48;
    L49:
        boolean r114 = false;
    L50:
        if (r93 == 0) goto L51;
        if (r2 >= r102) goto L53;
        char r52 = r8.charAt(r2);
        if (r114 == true) goto L58;
        if (Character.isSurrogate(r52) == false) goto L63;
        if (Character.isLowSurrogate(r52) == true) goto L48;
        r2 = r2 + 1;
        r114 = true;
        goto L50
    L63:
        r93 = r93 - 1;
        r2 = r2 + 1;
        goto L50
    L58:
        if (Character.isLowSurrogate(r52) == false) goto L48;
        r93 = r93 - 1;
        r2 = r2 + 1;
        goto L49
    L53:
        if (r114 == true) goto L48;
    L68:
        if (r1 == (-1)) goto L106;
        if (r102 == (-1)) goto L112;
    L72:
        C0498w[] r94 = (C0498w[]) r8.getSpans(r1, r102, C0498w.class);
        if (r94 != null) goto L75;
        return false;
    L75:
        if (r94.length <= 0) goto L108;
        int r115 = r94.length;
        int r22 = 0;
    L77:
        if (r22 >= r115) goto L79;
        C0498w r3 = r94[r22];
        int r53 = r8.getSpanStart(r3);
        int r32 = r8.getSpanEnd(r3);
        r1 = Math.min(r53, r1);
        r102 = Math.max(r32, r102);
        r22 = r22 + 1;
        goto L77
    L79:
        int r95 = Math.max(r1, 0);
        int r103 = Math.min(r102, r8.length());
        r7.beginBatchEdit();
        r8.delete(r95, r103);
        r7.endBatchEdit();
        return true;
    L108:
        return false;
    L112:
        return false;
    L106:
        return false;
    L51:
        r102 = r2;
    L48:
        r102 = -1;
    L21:
        r1 = -1;
        goto L43
    L71:
        r1 = Math.max(r1 - r9, 0);
        r102 = Math.min(r2 + r10, r8.length());
        goto L72
    L105:
        return false;
    L104:
        return false;
    L110:
        return false;
    L103:
        return false;
    L109:
        return false;
    L102:
        return false;
    }

    /* JADX INFO: renamed from: g */
    private final void m2638g(int r1, Serializable r2) {
    }

    @Override // p055f.InterfaceC0784o
    /* JADX INFO: renamed from: a */
    public void mo339a(MenuC0779j r1, boolean r2) {
    }

    /* JADX INFO: renamed from: d */
    public Signature[] mo1198d(PackageManager r2, String r3) {
        return r2.getPackageInfo(r3, 64).signatures;
    }

    /* JADX INFO: renamed from: f */
    public boolean mo1221f(CharSequence r1) {
        return false;
    }

    /* JADX INFO: renamed from: h */
    public CharSequence m2639h(Preference r3) {
        switch(this.f4289a) {
            case 6: goto L8;
            default: goto L4;
        };
    L4:
        ListPreference r32 = (ListPreference) r3;
        r32.getClass();
        if (TextUtils.isEmpty(null) == true) goto L7;
        return null;
    L7:
        return r32.f1508a.getString(C1031R.string.not_set);
    L8:
        EditTextPreference r33 = (EditTextPreference) r3;
        r33.getClass();
        if (TextUtils.isEmpty(null) == true) goto L11;
        return null;
    L11:
        return r33.f1508a.getString(C1031R.string.not_set);
    }

    /* JADX INFO: renamed from: i */
    public void m2640i() {
    }

    /* JADX INFO: renamed from: j */
    public void m2641j(AbstractC0355O r1) {
        r1.getClass();
        throw null;
    }

    @Override // p055f.InterfaceC0784o
    /* JADX INFO: renamed from: k */
    public boolean mo345k(MenuC0779j r1) {
        return false;
    }

    @Override // p034S.InterfaceC0326f
    /* JADX INFO: renamed from: n */
    public void mo348n(int r2, Serializable r3) {
        switch(this.f4289a) {
            case 8: goto L13;
            default: goto L5;
        };
    L13:
        return;
    L5:
        if (r2 != 6) goto L7;
    L11:
        Throwable r32 = (Throwable) r3;
        return;
    L7:
        if (r2 == 7) goto L11;
        if (r2 == 8) goto L11;
    }

    public /* synthetic */ C1121e(int r1, Object r2) {
        this.f4289a = r1;
    }

    public C1121e(C0509i r1, int r2) {
        this.f4289a = r2;
        switch(r2) {
            case 26: goto L6;
            default: goto L4;
        };
    L4:
        new CopyOnWriteArrayList();
        return;
    L6:
        this.f4289a = 26;
        new CopyOnWriteArrayList();
    }

    public C1121e(StaggeredGridLayoutManager r1) {
        this.f4289a = 17;
        m2640i();
    }
}
