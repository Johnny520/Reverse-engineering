package p091;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Path;
import android.text.Editable;
import android.text.Selection;
import android.util.Log;
import android.view.ViewGroup;
import androidx.appcompat.app.C0955;
import androidx.compose.animation.core.InterfaceC1181;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.engine.InterfaceC3821;
import com.kongzue.dialogx.util.views.InterfaceC4589;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.coroutines.InterfaceC5193;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5554;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5555;
import p048.C7157;
import p182.C8512;
import p183.C8529;
import p234.InterfaceC8802;
import p238.AbstractC8813;
import p246.InterfaceC8881;
import p248.InterfaceC8893;
import p250.C8911;
import p250.C8913;
import p273.C9037;
import p302.C9226;
import p302.InterfaceC9220;
import p302.InterfaceC9222;
import p302.InterfaceC9230;
import p331.C9491;
import p361.C9663;

/* JADX INFO: renamed from: 飘花落叶言世楪哲苏子兰.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C7787 implements InterfaceC5555, InterfaceC8802, InterfaceC8881, InterfaceC8893, InterfaceC9230, InterfaceC5193, InterfaceC4589, InterfaceC9220, InterfaceC1181 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f18941;

    public /* synthetic */ C7787(int i) {
        this.f18941 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final float m12817(float f, float[] fArr, float[] fArr2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float fAbs = Math.abs(f);
        float fSignum = Math.signum(f);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            return fSignum * fArr2[iBinarySearch];
        }
        int i = -(iBinarySearch + 1);
        int i2 = i - 1;
        if (i2 >= fArr.length - 1) {
            float f6 = fArr[fArr.length - 1];
            float f7 = fArr2[fArr.length - 1];
            if (f6 == 0.0f) {
                return 0.0f;
            }
            return (f7 / f6) * f;
        }
        if (i2 == -1) {
            float f8 = fArr[0];
            f4 = fArr2[0];
            f5 = f8;
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            float f9 = fArr[i2];
            float f10 = fArr[i];
            f2 = fArr2[i2];
            f3 = f9;
            f4 = fArr2[i];
            f5 = f10;
        }
        return (((f4 - f2) * Math.max(0.0f, Math.min(1.0f, f3 == f5 ? 0.0f : (fAbs - f3) / (f5 - f3)))) + f2) * fSignum;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final void m12818(ViewGroup viewGroup) {
        int i = C9491.f24792;
        viewGroup.removeAllViews();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006c A[EDGE_INSN: B:92:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085], EDGE_INSN: B:93:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085, LOOP_LABEL: LOOP:2: B:47:0x006e->B:58:0x0085]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a2 A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m12819(C8512 c8512, Editable editable, int i, int i2, boolean z) {
        int iMin;
        if (editable != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z) {
                    int iMax = Math.max(i, 0);
                    int length = editable.length();
                    if (selectionStart < 0 || length < selectionStart || iMax < 0) {
                        selectionStart = -1;
                        int iMax2 = Math.max(i2, 0);
                        iMin = editable.length();
                        if (selectionEnd >= 0 || iMin < selectionEnd || iMax2 < 0) {
                            iMin = -1;
                            if (selectionStart != -1 && iMin != -1) {
                            }
                        } else {
                            loop2: while (true) {
                                boolean z2 = false;
                                while (true) {
                                    if (iMax2 == 0) {
                                        iMin = selectionEnd;
                                        break loop2;
                                    }
                                    if (selectionEnd >= iMin) {
                                        if (z2) {
                                            break;
                                        }
                                    } else {
                                        char cCharAt = editable.charAt(selectionEnd);
                                        if (z2) {
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
                                            z2 = true;
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
                            boolean z3 = false;
                            while (true) {
                                if (iMax == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart >= 0) {
                                    char cCharAt2 = editable.charAt(selectionStart);
                                    if (z3) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(cCharAt2)) {
                                        iMax--;
                                    } else {
                                        if (Character.isHighSurrogate(cCharAt2)) {
                                            break loop0;
                                        }
                                        z3 = true;
                                    }
                                } else {
                                    if (z3) {
                                        break loop0;
                                    }
                                    selectionStart = 0;
                                }
                            }
                            iMax--;
                        }
                        selectionStart = -1;
                        int iMax22 = Math.max(i2, 0);
                        iMin = editable.length();
                        if (selectionEnd >= 0) {
                            iMin = -1;
                            if (selectionStart != -1) {
                            }
                        }
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i, 0);
                    iMin = Math.min(selectionEnd + i2, editable.length());
                }
                C8529[] c8529Arr = (C8529[]) editable.getSpans(selectionStart, iMin, C8529.class);
                if (c8529Arr != null && c8529Arr.length > 0) {
                    for (C8529 c8529 : c8529Arr) {
                        int spanStart = editable.getSpanStart(c8529);
                        int spanEnd = editable.getSpanEnd(c8529);
                        selectionStart = Math.min(spanStart, selectionStart);
                        iMin = Math.max(spanEnd, iMin);
                    }
                    int iMax3 = Math.max(selectionStart, 0);
                    int iMin2 = Math.min(iMin, editable.length());
                    c8512.beginBatchEdit();
                    editable.delete(iMax3, iMin2);
                    c8512.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static Path m12820(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    @Override // p234.InterfaceC8802
    public Object create() {
        return new ArrayList();
    }

    @Override // p246.InterfaceC8881
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public File mo12213(InterfaceC9222 interfaceC9222) {
        return null;
    }

    @Override // androidx.compose.animation.core.InterfaceC1181
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public float mo1411(float f) {
        return 1.0f - ((float) Math.pow(1.0f - f, 3.0d));
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5555
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public InterfaceC5554 mo9826(int i) {
        switch (this.f18941) {
            case 0:
                return ProtoBuf$Modality.valueOf(i);
            default:
                return ProtoBuf$Visibility.valueOf(i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public void m12821() {
        C9037 c9037 = new C9037();
        c9037.f22959 = "历史公告日志";
        c9037.mo14280();
        c9037.f22971 = "加载中";
        c9037.mo14280();
        c9037.f22970 = "确认";
        c9037.mo14280();
        c9037.m14290();
        C9663.m15049().m15077().mo11722(new C7157(this, c9037, 1));
    }

    @Override // p302.InterfaceC9230
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public EncodeStrategy mo853(C9226 c9226) {
        return EncodeStrategy.SOURCE;
    }

    @Override // com.kongzue.dialogx.util.views.InterfaceC4589
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public boolean mo8642() {
        return false;
    }

    @Override // p302.InterfaceC9225
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public boolean mo859(Object obj, File file, C9226 c9226) throws Throwable {
        try {
            AbstractC8813.m14022(((C8913) ((C8911) ((InterfaceC3821) obj).get()).f22629.f20627).f22642.f23570.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public Signature[] mo12822(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // p246.InterfaceC8881
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo12215(InterfaceC9222 interfaceC9222, C0955 c0955) {
    }

    @Override // p302.InterfaceC9220
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo7151(byte[] bArr, Object obj, MessageDigest messageDigest) {
    }
}
