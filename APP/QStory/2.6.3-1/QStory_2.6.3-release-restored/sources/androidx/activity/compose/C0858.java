package androidx.activity.compose;

import androidx.compose.foundation.lazy.C1582;
import androidx.compose.foundation.text.AbstractC1826;
import androidx.compose.foundation.text.contextmenu.provider.AbstractC1673;
import androidx.compose.foundation.text.selection.AbstractC1728;
import androidx.compose.foundation.text.selection.AbstractC1766;
import androidx.compose.material3.AbstractC1986;
import androidx.compose.material3.AbstractC1996;
import androidx.compose.material3.AbstractC1998;
import androidx.compose.material3.AbstractC2013;
import androidx.compose.material3.AbstractC2032;
import androidx.compose.material3.C1975;
import androidx.compose.material3.C1982;
import androidx.compose.material3.C2001;
import androidx.compose.material3.C2021;
import androidx.compose.material3.C2054;
import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.p001ui.graphics.C2406;
import androidx.compose.p001ui.layout.C2532;
import androidx.compose.runtime.AbstractC2209;
import androidx.compose.runtime.C2169;
import androidx.compose.runtime.C2193;
import androidx.compose.runtime.tooling.AbstractC2126;
import androidx.compose.runtime.tooling.AbstractC2133;
import androidx.navigationevent.compose.AbstractC3271;
import com.android.p002dx.p005io.Opcodes;
import kotlin.C6008;
import kotlin.KotlinNothingValueException;
import kotlinx.coroutines.AbstractC6227;
import p068.InterfaceC7372;
import p111.C8036;
import p111.ExecutorC8037;
import p134.AbstractC8186;
import p221.C8722;

/* JADX INFO: renamed from: androidx.activity.compose.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0858 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f366;

    public /* synthetic */ C0858(int i) {
        this.f366 = i;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        switch (this.f366) {
            case 0:
                return C6008.f15084;
            case 1:
                C2193 c2193 = AbstractC0857.f365;
                return null;
            case 2:
                return new C1582(0, 0);
            case 3:
                return new C2406(AbstractC2416.m3442(1308617531));
            case 4:
                C2169 c2169 = AbstractC1826.f3231;
                return null;
            case 5:
                C2193 c21932 = AbstractC1673.f2714;
                return null;
            case 6:
                C8036 c8036 = AbstractC6227.f15375;
                return ExecutorC8037.f19570;
            case 7:
                C2193 c21933 = AbstractC1728.f2875;
                return null;
            case 8:
                return AbstractC1766.f2982;
            case 9:
                int i = AbstractC2013.f3729;
                return C2021.f3735;
            case 10:
                int i2 = AbstractC2013.f3729;
                return C2021.f3734;
            case 11:
                return AbstractC2032.m2588(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, Opcodes.MAX_VALUE);
            case 12:
                C2169 c21692 = AbstractC2032.f3797;
                return Boolean.TRUE;
            case 13:
                C2532 c2532 = AbstractC1986.f3657;
                return Boolean.TRUE;
            case 14:
                return new C8722(48.0f);
            case 15:
                C2169 c21693 = AbstractC1996.f3666;
                return Boolean.FALSE;
            case 16:
                return C1982.f3636;
            case 17:
                return new C1975();
            case 18:
                return new C2054();
            case 19:
                return new C8722(0.0f);
            case 20:
                return AbstractC8186.f20012;
            case 21:
                return new C2001();
            case 22:
                int i3 = AbstractC1998.f3668;
                return C2021.f3733;
            case 23:
                int i4 = AbstractC1998.f3668;
                return C2021.f3736;
            case 24:
                AbstractC2209.m3066("Unexpected call to default provider");
                throw new KotlinNothingValueException();
            case 25:
                throw new IllegalStateException("CompositionLocal LocalHostDefaultProvider not present");
            case 26:
                C2169 c21694 = AbstractC2126.f4123;
                return null;
            case 27:
                C2169 c21695 = AbstractC2133.f4131;
                return null;
            case 28:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            default:
                C2193 c21934 = AbstractC3271.f7446;
                return null;
        }
    }
}
