package p075;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Path;
import android.util.Log;
import android.view.ViewGroup;
import androidx.appcompat.app.C0108;
import androidx.compose.animation.core.InterfaceC0335;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.engine.InterfaceC2989;
import com.kongzue.dialogx.util.views.InterfaceC3757;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.coroutines.InterfaceC4361;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4722;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4723;
import p032.C6328;
import p218.InterfaceC7973;
import p222.AbstractC7984;
import p230.InterfaceC8052;
import p232.InterfaceC8064;
import p234.C8082;
import p234.C8084;
import p257.C8208;
import p286.C8397;
import p286.InterfaceC8391;
import p286.InterfaceC8393;
import p286.InterfaceC8401;
import p287.AbstractC8405;
import p315.C8662;
import p345.C8834;

/* JADX INFO: renamed from: 飘花落叶言世楪哲苏子兰.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C6958 implements InterfaceC4723, InterfaceC7973, InterfaceC8052, InterfaceC8064, InterfaceC8401, InterfaceC4361, InterfaceC3757, InterfaceC8391, InterfaceC0335 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f18596;

    public /* synthetic */ C6958(int i) {
        this.f18596 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final float m12258(float f, float[] fArr, float[] fArr2) {
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
    public static final void m12259(ViewGroup viewGroup) {
        int i = C8662.f24447;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m12260(p166.C7683 r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p075.C6958.m12260(飘花落叶言子哲苏兰世楪.飘花落叶言子楪世苏兰哲, android.text.Editable, int, int, boolean):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static Path m12261(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    @Override // p218.InterfaceC7973
    public Object create() {
        return new ArrayList();
    }

    @Override // p230.InterfaceC8052
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public File mo11654(InterfaceC8393 interfaceC8393) {
        return null;
    }

    @Override // androidx.compose.animation.core.InterfaceC0335
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public float mo851(float f) {
        return 1.0f - ((float) Math.pow(1.0f - f, 3.0d));
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4723
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public InterfaceC4722 mo9267(int i) {
        switch (this.f18596) {
            case 0:
                return ProtoBuf$Modality.valueOf(i);
            default:
                return ProtoBuf$Visibility.valueOf(i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public void m12262() {
        C8208 c8208 = new C8208();
        c8208.f22614 = AbstractC8405.m13972(3131);
        c8208.mo13721();
        c8208.f22626 = AbstractC8405.m13972(1241);
        c8208.mo13721();
        c8208.f22625 = AbstractC8405.m13973("呜喵喵呜喵呜喵喵~呜呜喵呜喵呜喵喵~呜呜喵呜喵呜喵喵~呜喵喵喵喵喵喵喵~呜呜喵喵呜喵呜呜~呜呜喵喵呜喵喵喵");
        c8208.mo13721();
        c8208.m13731();
        C8834.m14490().m14518().mo11163(new C6328(this, c8208, 1));
    }

    @Override // p286.InterfaceC8401
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public EncodeStrategy mo293(C8397 c8397) {
        return EncodeStrategy.SOURCE;
    }

    @Override // com.kongzue.dialogx.util.views.InterfaceC3757
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public boolean mo8083() {
        return false;
    }

    @Override // p286.InterfaceC8396
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public boolean mo299(Object obj, File file, C8397 c8397) throws Throwable {
        try {
            AbstractC7984.m13463(((C8084) ((C8082) ((InterfaceC2989) obj).get()).f22284.f20282).f22297.f23225.asReadOnlyBuffer(), file);
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
    public Signature[] mo12263(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // p230.InterfaceC8052
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo11656(InterfaceC8393 interfaceC8393, C0108 c0108) {
    }

    @Override // p286.InterfaceC8391
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo6591(byte[] bArr, Object obj, MessageDigest messageDigest) {
    }
}
