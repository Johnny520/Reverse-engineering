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

    public /* synthetic */ C1121e(int i2) {
        this.f4289a = i2;
    }

    /* JADX INFO: renamed from: b */
    public static final int m2635b(int i2) {
        return (i2 & 2) != 0 ? i2 | 64 : i2;
    }

    /* JADX INFO: renamed from: c */
    public static Path m2636c(float f2, float f3, float f4, float f5) {
        Path path = new Path();
        path.moveTo(f2, f3);
        path.lineTo(f4, f5);
        return path;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0049, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0086, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0070 A[EDGE_INSN: B:91:0x0070->B:48:0x0070 BREAK  A[LOOP:2: B:49:0x0072->B:60:0x0089, LOOP_LABEL: LOOP:2: B:49:0x0072->B:60:0x0089], EDGE_INSN: B:94:0x0070->B:48:0x0070 BREAK  A[LOOP:2: B:49:0x0072->B:60:0x0089]] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a6 A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m2637e(InputConnection inputConnection, Editable editable, int i2, int i3, boolean z2) {
        int iMin;
        if (editable == null || inputConnection == null || i2 < 0 || i3 < 0) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd) {
            return false;
        }
        if (z2) {
            int iMax = Math.max(i2, 0);
            int length = editable.length();
            if (selectionStart < 0 || length < selectionStart || iMax < 0) {
                selectionStart = -1;
                int iMax2 = Math.max(i3, 0);
                iMin = editable.length();
                if (selectionEnd < 0 && iMin >= selectionEnd && iMax2 >= 0) {
                    loop2: while (true) {
                        boolean z3 = false;
                        while (true) {
                            if (iMax2 == 0) {
                                iMin = selectionEnd;
                                break loop2;
                            }
                            if (selectionEnd >= iMin) {
                                if (z3) {
                                    break loop2;
                                }
                            } else {
                                char cCharAt = editable.charAt(selectionEnd);
                                if (z3) {
                                    break;
                                }
                                if (!Character.isSurrogate(cCharAt)) {
                                    iMax2--;
                                    selectionEnd++;
                                } else {
                                    if (Character.isLowSurrogate(cCharAt)) {
                                        break loop2;
                                    }
                                    selectionEnd++;
                                    z3 = true;
                                }
                            }
                        }
                        iMax2--;
                        selectionEnd++;
                    }
                    iMin = -1;
                    return selectionStart == -1 ? false : false;
                }
                iMin = -1;
                if (selectionStart == -1 || iMin == -1) {
                }
            } else {
                loop0: while (true) {
                    boolean z4 = false;
                    while (true) {
                        if (iMax == 0) {
                            break loop0;
                        }
                        selectionStart--;
                        if (selectionStart >= 0) {
                            char cCharAt2 = editable.charAt(selectionStart);
                            if (z4) {
                                break;
                            }
                            if (!Character.isSurrogate(cCharAt2)) {
                                iMax--;
                            } else {
                                if (Character.isHighSurrogate(cCharAt2)) {
                                    break loop0;
                                }
                                z4 = true;
                            }
                        } else {
                            if (z4) {
                                break;
                            }
                            selectionStart = 0;
                        }
                    }
                    iMax--;
                }
                selectionStart = -1;
                int iMax22 = Math.max(i3, 0);
                iMin = editable.length();
                if (selectionEnd < 0) {
                    iMin = -1;
                    if (selectionStart == -1) {
                    }
                }
            }
        } else {
            selectionStart = Math.max(selectionStart - i2, 0);
            iMin = Math.min(selectionEnd + i3, editable.length());
        }
        C0498w[] c0498wArr = (C0498w[]) editable.getSpans(selectionStart, iMin, C0498w.class);
        if (c0498wArr == null || c0498wArr.length <= 0) {
            return false;
        }
        for (C0498w c0498w : c0498wArr) {
            int spanStart = editable.getSpanStart(c0498w);
            int spanEnd = editable.getSpanEnd(c0498w);
            selectionStart = Math.min(spanStart, selectionStart);
            iMin = Math.max(spanEnd, iMin);
        }
        int iMax3 = Math.max(selectionStart, 0);
        int iMin2 = Math.min(iMin, editable.length());
        inputConnection.beginBatchEdit();
        editable.delete(iMax3, iMin2);
        inputConnection.endBatchEdit();
        return true;
    }

    /* JADX INFO: renamed from: g */
    private final void m2638g(int i2, Serializable serializable) {
    }

    @Override // p055f.InterfaceC0784o
    /* JADX INFO: renamed from: a */
    public void mo339a(MenuC0779j menuC0779j, boolean z2) {
    }

    /* JADX INFO: renamed from: d */
    public Signature[] mo1198d(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    /* JADX INFO: renamed from: f */
    public boolean mo1221f(CharSequence charSequence) {
        return false;
    }

    /* JADX INFO: renamed from: h */
    public CharSequence m2639h(Preference preference) {
        switch (this.f4289a) {
            case 6:
                EditTextPreference editTextPreference = (EditTextPreference) preference;
                editTextPreference.getClass();
                if (TextUtils.isEmpty(null)) {
                    return editTextPreference.f1508a.getString(C1031R.string.not_set);
                }
                return null;
            default:
                ListPreference listPreference = (ListPreference) preference;
                listPreference.getClass();
                if (TextUtils.isEmpty(null)) {
                    return listPreference.f1508a.getString(C1031R.string.not_set);
                }
                return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public void m2640i() {
    }

    /* JADX INFO: renamed from: j */
    public void m2641j(AbstractC0355O abstractC0355O) {
        abstractC0355O.getClass();
        throw null;
    }

    @Override // p055f.InterfaceC0784o
    /* JADX INFO: renamed from: k */
    public boolean mo345k(MenuC0779j menuC0779j) {
        return false;
    }

    @Override // p034S.InterfaceC0326f
    /* JADX INFO: renamed from: n */
    public void mo348n(int i2, Serializable serializable) {
        switch (this.f4289a) {
            case 8:
                break;
            default:
                if (i2 == 6 || i2 == 7 || i2 == 8) {
                }
                break;
        }
    }

    public /* synthetic */ C1121e(int i2, Object obj) {
        this.f4289a = i2;
    }

    public C1121e(C0509i c0509i, int i2) {
        this.f4289a = i2;
        switch (i2) {
            case 26:
                this.f4289a = 26;
                new CopyOnWriteArrayList();
                break;
            default:
                new CopyOnWriteArrayList();
                break;
        }
    }

    public C1121e(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f4289a = 17;
        m2640i();
    }
}
