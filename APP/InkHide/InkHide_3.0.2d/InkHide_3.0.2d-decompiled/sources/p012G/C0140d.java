package p012G;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.Editable;
import android.text.Selection;
import android.util.Log;
import androidx.emoji2.text.C0407v;
import androidx.fragment.app.C0411B;
import androidx.fragment.app.C0448z;
import androidx.lifecycle.AbstractC0460L;
import androidx.lifecycle.InterfaceC0463O;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import p014H.C0144c;
import p020K.C0161a;
import p022L.InterfaceC0176f;
import p027N0.AbstractC0223g;
import p041V.C0322o;
import p041V.InterfaceC0323p;
import p068h.InterfaceC0606y;
import p068h.MenuC0594m;

/* JADX INFO: renamed from: G.d */
/* JADX INFO: loaded from: classes.dex */
public class C0140d implements InterfaceC0463O, InterfaceC0176f, InterfaceC0323p, InterfaceC0606y {

    /* JADX INFO: renamed from: c */
    public static C0140d f438c;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f439b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [D.h.j(android.content.Context):androidx.emoji2.text.q, G.c.<init>():void, androidx.activity.g.onMultiWindowModeChanged(boolean, android.content.res.Configuration):void, androidx.activity.g.onPictureInPictureModeChanged(boolean, android.content.res.Configuration):void, b1.h.t(int, v.h[]):v.h, com.lu.wxmask.MainHook.handleLoadPackage(de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam):void, i0.a.<clinit>():void] */
    public /* synthetic */ C0140d(int i2) {
        this.f439b = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static String m308a(Object[] objArr) {
        AbstractC0223g.m418e(objArr, "objects");
        StringBuffer stringBuffer = new StringBuffer();
        int length = objArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            Object obj = objArr[i2];
            int i4 = i3 + 1;
            if (i3 != 0) {
                stringBuffer.append("  ");
            }
            if (obj == null) {
                stringBuffer.append("null");
            } else if (obj instanceof Throwable) {
                stringBuffer.append(Log.getStackTraceString((Throwable) obj));
            } else if (obj.getClass().isArray()) {
                String string = Arrays.toString((Object[]) obj);
                AbstractC0223g.m417d(string, "toString(this)");
                stringBuffer.append(string);
            } else {
                stringBuffer.append(obj);
            }
            i2++;
            i3 = i4;
        }
        String string2 = stringBuffer.toString();
        AbstractC0223g.m417d(string2, "text.toString()");
        return string2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006c A[EDGE_INSN: B:92:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085], EDGE_INSN: B:93:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085, LOOP_LABEL: LOOP:2: B:47:0x006e->B:58:0x0085]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a2 A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m309d(C0144c c0144c, Editable editable, int i2, int i3, boolean z2) {
        int iMin;
        if (editable != null && i2 >= 0 && i3 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z2) {
                    int iMax = Math.max(i2, 0);
                    int length = editable.length();
                    if (selectionStart < 0 || length < selectionStart || iMax < 0) {
                        selectionStart = -1;
                        int iMax2 = Math.max(i3, 0);
                        iMin = editable.length();
                        if (selectionEnd >= 0 || iMin < selectionEnd || iMax2 < 0) {
                            iMin = -1;
                            if (selectionStart != -1 && iMin != -1) {
                            }
                        } else {
                            loop2: while (true) {
                                boolean z3 = false;
                                while (true) {
                                    if (iMax2 == 0) {
                                        iMin = selectionEnd;
                                        break loop2;
                                    }
                                    if (selectionEnd >= iMin) {
                                        if (z3) {
                                            break;
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
                            if (selectionStart != -1) {
                            }
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
                                        break loop0;
                                    }
                                    selectionStart = 0;
                                }
                            }
                            iMax--;
                        }
                        selectionStart = -1;
                        int iMax22 = Math.max(i3, 0);
                        iMin = editable.length();
                        if (selectionEnd >= 0) {
                            iMin = -1;
                            if (selectionStart != -1) {
                            }
                        }
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i2, 0);
                    iMin = Math.min(selectionEnd + i3, editable.length());
                }
                C0407v[] c0407vArr = (C0407v[]) editable.getSpans(selectionStart, iMin, C0407v.class);
                if (c0407vArr != null && c0407vArr.length > 0) {
                    for (C0407v c0407v : c0407vArr) {
                        int spanStart = editable.getSpanStart(c0407v);
                        int spanEnd = editable.getSpanEnd(c0407v);
                        selectionStart = Math.min(spanStart, selectionStart);
                        iMin = Math.max(spanEnd, iMin);
                    }
                    int iMax3 = Math.max(selectionStart, 0);
                    int iMin2 = Math.min(iMin, editable.length());
                    c0144c.beginBatchEdit();
                    editable.delete(iMax3, iMin2);
                    c0144c.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public Signature[] mo312c(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0463O
    /* JADX INFO: renamed from: e */
    public AbstractC0460L mo313e(Class cls) {
        switch (this.f439b) {
            case 3:
                return new C0161a();
            default:
                return new C0411B(true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public boolean mo314f(CharSequence charSequence) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public void mo315i(int i2, Object[] objArr) {
        AbstractC0223g.m418e(objArr, "objects");
        String strM308a = m308a(objArr);
        if (i2 == 0) {
            Log.v(">>>", strM308a);
            return;
        }
        if (i2 == 1) {
            Log.d(">>>", strM308a);
            return;
        }
        if (i2 == 2) {
            Log.i(">>>", strM308a);
            return;
        }
        if (i2 == 3) {
            Log.w(">>>", strM308a);
        } else if (i2 != 4) {
            Log.d(">>>", strM308a);
        } else {
            Log.e(">>>", strM308a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p022L.InterfaceC0176f
    /* JADX INFO: renamed from: l */
    public void mo141l(int i2, Serializable serializable) {
        String str;
        switch (this.f439b) {
            case 4:
                break;
            default:
                switch (i2) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case 3:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case 4:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case 5:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case 6:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case 7:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case 8:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case 9:
                    default:
                        str = "";
                        break;
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i2 == 6 || i2 == 7 || i2 == 8) {
                    Log.e("ProfileInstaller", str, (Throwable) serializable);
                } else {
                    Log.d("ProfileInstaller", str);
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0606y
    /* JADX INFO: renamed from: m */
    public boolean mo142m(MenuC0594m menuC0594m) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041V.InterfaceC0323p
    /* JADX INFO: renamed from: n */
    public Object mo143n() {
        switch (this.f439b) {
            case 8:
                return new TreeSet();
            case 9:
                return new LinkedHashSet();
            case 10:
                return new ArrayDeque();
            case 11:
                return new ArrayList();
            case 12:
                return new ConcurrentSkipListMap();
            case 13:
                return new ConcurrentHashMap();
            case 14:
                return new TreeMap();
            case 15:
                return new LinkedHashMap();
            default:
                return new C0322o(true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p022L.InterfaceC0176f
    /* JADX INFO: renamed from: r */
    public void mo146r() {
        switch (this.f439b) {
            case 4:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0140d(C0448z c0448z) {
        this.f439b = 21;
    }

    /* JADX INFO: renamed from: g */
    private final void m310g() {
    }

    /* JADX INFO: renamed from: j */
    private final void m311j(int i2, Serializable serializable) {
    }

    @Override // p068h.InterfaceC0606y
    /* JADX INFO: renamed from: b */
    public void mo132b(MenuC0594m menuC0594m, boolean z2) {
    }
}
