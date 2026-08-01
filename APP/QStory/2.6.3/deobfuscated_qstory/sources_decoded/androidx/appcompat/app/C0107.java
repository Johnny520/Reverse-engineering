package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.bumptech.glide.load.engine.InterfaceC2989;
import com.bumptech.glide.load.resource.bitmap.C3018;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4395;
import kotlinx.serialization.json.internal.AbstractC5490;
import kotlinx.serialization.json.internal.C5489;
import p004.C6095;
import p155.InterfaceC7615;
import p190.DialogInterfaceOnKeyListenerC7799;
import p233.InterfaceC8077;
import p286.C8397;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0107 implements InterfaceC8077, InterfaceC7615 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f314;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f315;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f316;

    public C0107(Context context) {
        this.f316 = 0;
        int iM331 = DialogInterfaceC0104.m331(context, 0);
        this.f315 = new C0084(new ContextThemeWrapper(context, DialogInterfaceC0104.m331(context, iM331)));
        this.f314 = iM331;
    }

    public String toString() {
        switch (this.f316) {
            case 6:
                return new String((char[]) this.f315, 0, this.f314);
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public void m337(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.f315;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.f315 = Arrays.copyOf(cArr, i3);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public DialogInterfaceC0104 m338() {
        C0084 c0084 = (C0084) this.f315;
        DialogInterfaceC0104 dialogInterfaceC0104 = new DialogInterfaceC0104(c0084.f250, this.f314);
        View view = c0084.f246;
        C0106 c0106 = dialogInterfaceC0104.f288;
        if (view != null) {
            c0106.f302 = view;
        } else {
            CharSequence charSequence = c0084.f247;
            if (charSequence != null) {
                c0106.f293 = charSequence;
                TextView textView = c0106.f311;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c0084.f248;
            if (drawable != null) {
                c0106.f313 = drawable;
                ImageView imageView = c0106.f310;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c0106.f310.setImageDrawable(drawable);
                }
            }
        }
        if (c0084.f252 != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c0084.f249.inflate(c0106.f305, (ViewGroup) null);
            int i = c0084.f253 ? c0106.f298 : c0106.f297;
            ListAdapter c0102 = c0084.f252;
            if (c0102 == null) {
                c0102 = new C0102(c0084.f250, i, R.id.text1, null);
            }
            c0106.f306 = c0102;
            c0106.f307 = c0084.f254;
            if (c0084.f251 != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0085(c0084, c0106));
            }
            if (c0084.f253) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c0106.f292 = alertController$RecycleListView;
        }
        dialogInterfaceC0104.setCancelable(true);
        dialogInterfaceC0104.setCanceledOnTouchOutside(true);
        dialogInterfaceC0104.setOnCancelListener(null);
        dialogInterfaceC0104.setOnDismissListener(null);
        DialogInterfaceOnKeyListenerC7799 dialogInterfaceOnKeyListenerC7799 = c0084.f245;
        if (dialogInterfaceOnKeyListenerC7799 != null) {
            dialogInterfaceC0104.setOnKeyListener(dialogInterfaceOnKeyListenerC7799);
        }
        return dialogInterfaceC0104;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean m339(long j) {
        int i = this.f314;
        for (int i2 = 0; i2 < i; i2++) {
            if (((long[]) this.f315)[i2] == j) {
                return true;
            }
        }
        return false;
    }

    @Override // p233.InterfaceC8077
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public InterfaceC2989 mo340(InterfaceC2989 interfaceC2989, C8397 c8397) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) interfaceC2989.get()).compress((Bitmap.CompressFormat) this.f315, this.f314, byteArrayOutputStream);
        interfaceC2989.recycle();
        return new C3018(byteArrayOutputStream.toByteArray());
    }

    @Override // p155.InterfaceC7615
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean mo341(View view) {
        ((BottomSheetBehavior) this.f315).m7025(this.f314);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m342(long j) {
        if (m339(j)) {
            return;
        }
        int i = this.f314;
        long[] jArrCopyOf = (long[]) this.f315;
        if (i >= jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i + 1, jArrCopyOf.length * 2));
            this.f315 = jArrCopyOf;
        }
        jArrCopyOf[i] = j;
        if (i >= this.f314) {
            this.f314 = i + 1;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public void m343(int i, int i2) {
        int[] iArr = (int[]) this.f315;
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
        int i4 = i + 1;
        int i5 = i2 + 1;
        int i6 = iArr[i4];
        iArr[i4] = iArr[i5];
        iArr[i5] = i6;
        int i7 = i + 2;
        int i8 = i2 + 2;
        int i9 = iArr[i7];
        iArr[i7] = iArr[i8];
        iArr[i8] = i9;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public void m344(C6095 c6095) {
        C6095 c60952;
        int i = c6095.f16658;
        if (i == -1) {
            C5925.m11310("Failed requirement.");
            return;
        }
        int i2 = this.f314;
        C6095 c60953 = ((C6095[]) this.f315)[i2];
        c60953.getClass();
        c6095.f16658 = -1;
        ((C6095[]) this.f315)[i2] = null;
        this.f314 = i2 - 1;
        if (c6095 == c60953) {
            return;
        }
        int iM8904 = AbstractC4395.m8904(0L, c60953.f16660 - c6095.f16660);
        if (iM8904 == 0) {
            ((C6095[]) this.f315)[i] = c60953;
            c60953.f16658 = i;
            return;
        }
        if (iM8904 >= 0) {
            m347(i, c60953);
            return;
        }
        while (true) {
            int i3 = i << 1;
            int i4 = i3 + 1;
            int i5 = this.f314;
            if (i4 > i5) {
                if (i3 > i5) {
                    break;
                }
                c60952 = ((C6095[]) this.f315)[i3];
                c60952.getClass();
            } else {
                c60952 = ((C6095[]) this.f315)[i3];
                c60952.getClass();
                C6095 c60954 = ((C6095[]) this.f315)[i4];
                c60954.getClass();
                if (AbstractC4395.m8904(0L, c60954.f16660 - c60952.f16660) >= 0) {
                    c60952 = c60954;
                }
            }
            if (AbstractC4395.m8904(0L, c60952.f16660 - c60953.f16660) <= 0) {
                break;
            }
            int i6 = c60952.f16658;
            c60952.f16658 = i;
            ((C6095[]) this.f315)[i] = c60952;
            i = i6;
        }
        ((C6095[]) this.f315)[i] = c60953;
        c60953.f16658 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public void m345(String str) {
        str.getClass();
        int length = str.length();
        if (length == 0) {
            return;
        }
        m337(this.f314, length);
        str.getChars(0, str.length(), (char[]) this.f315, this.f314);
        this.f314 += length;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public void m346(int i, int i2, int i3) {
        int i4 = this.f314;
        int[] iArrCopyOf = (int[]) this.f315;
        int i5 = i4 + 3;
        if (i5 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            this.f315 = iArrCopyOf;
        }
        iArrCopyOf[i4] = i + i3;
        iArrCopyOf[i4 + 1] = i2 + i3;
        iArrCopyOf[i4 + 2] = i3;
        this.f314 = i5;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void m347(int i, C6095 c6095) {
        while (true) {
            int i2 = i >> 1;
            if (i2 == 0) {
                break;
            }
            C6095 c60952 = ((C6095[]) this.f315)[i2];
            c60952.getClass();
            if (AbstractC4395.m8904(0L, c6095.f16660 - c60952.f16660) <= 0) {
                break;
            }
            c60952.f16658 = i;
            ((C6095[]) this.f315)[i] = c60952;
            i = i2;
        }
        ((C6095[]) this.f315)[i] = c6095;
        c6095.f16658 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public void m348() {
        C5489 c5489 = C5489.f15169;
        char[] cArr = (char[]) this.f315;
        c5489.getClass();
        cArr.getClass();
        synchronized (c5489) {
            int i = c5489.f15170;
            if (cArr.length + i < AbstractC5490.f15172) {
                c5489.f15170 = i + cArr.length;
                c5489.f15171.addLast(cArr);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public void m349(long j) {
        int i = this.f314;
        int i2 = 0;
        while (i2 < i) {
            if (j == ((long[]) this.f315)[i2]) {
                int i3 = this.f314 - 1;
                while (i2 < i3) {
                    long[] jArr = (long[]) this.f315;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.f314--;
                return;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public void m350(int i, int i2, int i3, int i4) {
        int i5 = this.f314;
        int[] iArrCopyOf = (int[]) this.f315;
        int i6 = i5 + 4;
        if (i6 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            this.f315 = iArrCopyOf;
        }
        iArrCopyOf[i5] = i;
        iArrCopyOf[i5 + 1] = i2;
        iArrCopyOf[i5 + 2] = i3;
        iArrCopyOf[i5 + 3] = i4;
        this.f314 = i6;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public void m351(int i, int i2) {
        if (i < i2) {
            int i3 = i - 3;
            for (int i4 = i; i4 < i2; i4 += 3) {
                int[] iArr = (int[]) this.f315;
                int i5 = iArr[i4];
                int i6 = iArr[i2];
                if (i5 < i6 || (i5 == i6 && iArr[i4 + 1] <= iArr[i2 + 1])) {
                    i3 += 3;
                    m343(i3, i4);
                }
            }
            m343(i3 + 3, i2);
            m351(i, i3);
            m351(i3 + 6, i2);
        }
    }

    public /* synthetic */ C0107(Object obj, int i, int i2) {
        this.f316 = i2;
        this.f315 = obj;
        this.f314 = i;
    }

    public C0107() {
        this.f316 = 12;
        this.f315 = Bitmap.CompressFormat.JPEG;
        this.f314 = 100;
    }

    public C0107(ArrayList arrayList) {
        this.f316 = 8;
        this.f315 = arrayList;
    }

    public /* synthetic */ C0107(byte b, int i) {
        this.f316 = i;
    }

    public C0107(int i) {
        this.f316 = 3;
        this.f315 = new int[i];
    }
}
