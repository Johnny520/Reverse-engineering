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
import com.bumptech.glide.load.engine.InterfaceC2988;
import com.bumptech.glide.load.resource.bitmap.C3017;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4394;
import kotlinx.serialization.json.internal.AbstractC5489;
import kotlinx.serialization.json.internal.C5488;
import p005.C6104;
import p155.InterfaceC7614;
import p190.DialogInterfaceOnKeyListenerC7798;
import p233.InterfaceC8076;
import p286.C8396;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0107 implements InterfaceC8076, InterfaceC7614 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f314;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f315;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f316;

    public C0107(Context context) {
        this.f316 = 0;
        int iM330 = DialogInterfaceC0104.m330(context, 0);
        this.f315 = new C0084(new ContextThemeWrapper(context, DialogInterfaceC0104.m330(context, iM330)));
        this.f314 = iM330;
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
    public void m336(int i, int i2) {
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
    public DialogInterfaceC0104 m337() {
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
        DialogInterfaceOnKeyListenerC7798 dialogInterfaceOnKeyListenerC7798 = c0084.f245;
        if (dialogInterfaceOnKeyListenerC7798 != null) {
            dialogInterfaceC0104.setOnKeyListener(dialogInterfaceOnKeyListenerC7798);
        }
        return dialogInterfaceC0104;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean m338(long j) {
        int i = this.f314;
        for (int i2 = 0; i2 < i; i2++) {
            if (((long[]) this.f315)[i2] == j) {
                return true;
            }
        }
        return false;
    }

    @Override // p233.InterfaceC8076
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public InterfaceC2988 mo339(InterfaceC2988 interfaceC2988, C8396 c8396) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) interfaceC2988.get()).compress((Bitmap.CompressFormat) this.f315, this.f314, byteArrayOutputStream);
        interfaceC2988.recycle();
        return new C3017(byteArrayOutputStream.toByteArray());
    }

    @Override // p155.InterfaceC7614
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean mo340(View view) {
        ((BottomSheetBehavior) this.f315).m7038(this.f314);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m341(long j) {
        if (m338(j)) {
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
    public void m342(int i, int i2) {
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
    public void m343(C6104 c6104) {
        C6104 c61042;
        int i = c6104.f16668;
        if (i == -1) {
            C5919.m11249("Failed requirement.");
            return;
        }
        int i2 = this.f314;
        C6104 c61043 = ((C6104[]) this.f315)[i2];
        c61043.getClass();
        c6104.f16668 = -1;
        ((C6104[]) this.f315)[i2] = null;
        this.f314 = i2 - 1;
        if (c6104 == c61043) {
            return;
        }
        int iM8914 = AbstractC4394.m8914(0L, c61043.f16670 - c6104.f16670);
        if (iM8914 == 0) {
            ((C6104[]) this.f315)[i] = c61043;
            c61043.f16668 = i;
            return;
        }
        if (iM8914 >= 0) {
            m346(i, c61043);
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
                c61042 = ((C6104[]) this.f315)[i3];
                c61042.getClass();
            } else {
                c61042 = ((C6104[]) this.f315)[i3];
                c61042.getClass();
                C6104 c61044 = ((C6104[]) this.f315)[i4];
                c61044.getClass();
                if (AbstractC4394.m8914(0L, c61044.f16670 - c61042.f16670) >= 0) {
                    c61042 = c61044;
                }
            }
            if (AbstractC4394.m8914(0L, c61042.f16670 - c61043.f16670) <= 0) {
                break;
            }
            int i6 = c61042.f16668;
            c61042.f16668 = i;
            ((C6104[]) this.f315)[i] = c61042;
            i = i6;
        }
        ((C6104[]) this.f315)[i] = c61043;
        c61043.f16668 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public void m344(String str) {
        str.getClass();
        int length = str.length();
        if (length == 0) {
            return;
        }
        m336(this.f314, length);
        str.getChars(0, str.length(), (char[]) this.f315, this.f314);
        this.f314 += length;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public void m345(int i, int i2, int i3) {
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
    public void m346(int i, C6104 c6104) {
        while (true) {
            int i2 = i >> 1;
            if (i2 == 0) {
                break;
            }
            C6104 c61042 = ((C6104[]) this.f315)[i2];
            c61042.getClass();
            if (AbstractC4394.m8914(0L, c6104.f16670 - c61042.f16670) <= 0) {
                break;
            }
            c61042.f16668 = i;
            ((C6104[]) this.f315)[i] = c61042;
            i = i2;
        }
        ((C6104[]) this.f315)[i] = c6104;
        c6104.f16668 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public void m347() {
        C5488 c5488 = C5488.f15169;
        char[] cArr = (char[]) this.f315;
        c5488.getClass();
        cArr.getClass();
        synchronized (c5488) {
            int i = c5488.f15170;
            if (cArr.length + i < AbstractC5489.f15172) {
                c5488.f15170 = i + cArr.length;
                c5488.f15171.addLast(cArr);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public void m348(long j) {
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
    public void m349(int i, int i2, int i3, int i4) {
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
    public void m350(int i, int i2) {
        if (i < i2) {
            int i3 = i - 3;
            for (int i4 = i; i4 < i2; i4 += 3) {
                int[] iArr = (int[]) this.f315;
                int i5 = iArr[i4];
                int i6 = iArr[i2];
                if (i5 < i6 || (i5 == i6 && iArr[i4 + 1] <= iArr[i2 + 1])) {
                    i3 += 3;
                    m342(i3, i4);
                }
            }
            m342(i3 + 3, i2);
            m350(i, i3);
            m350(i3 + 6, i2);
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
