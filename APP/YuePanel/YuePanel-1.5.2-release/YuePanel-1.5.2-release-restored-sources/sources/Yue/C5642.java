package Yue;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C8778;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: Yue.ۥ۠ۦۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5642 extends AbstractC5616 {

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static final String f13781 = "KeyTrigger";

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static final String f13782 = "KeyTrigger";

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static final int f13783 = 5;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public int f13784 = -1;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public String f13785 = null;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public int f13786;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public String f13787;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public String f13788;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public int f13789;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public int f13790;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public View f13791;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public float f13792;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public boolean f13793;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public boolean f13794;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public boolean f13795;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public float f13796;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public Method f13797;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public Method f13798;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public Method f13799;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public float f13800;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public boolean f13801;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public RectF f13802;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public RectF f13803;

    /* JADX INFO: renamed from: Yue.ۥ۠ۦۦ$ۥ */
    public static class C0823 {

        /* JADX INFO: renamed from: ۥ */
        public static final int f1592 = 1;

        /* JADX INFO: renamed from: ۥ۟ */
        public static final int f1593 = 2;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final int f13804 = 4;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static final int f13805 = 5;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final int f13806 = 6;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final int f13807 = 7;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static final int f13808 = 8;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static final int f13809 = 9;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static final int f13810 = 10;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static final int f13811 = 11;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static SparseIntArray f13812;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f13812 = sparseIntArray;
            sparseIntArray.append(C8778.C8789.f29062, 8);
            f13812.append(C8778.C8789.f29066, 4);
            f13812.append(C8778.C8789.f29067, 1);
            f13812.append(C8778.C8789.f29068, 2);
            f13812.append(C8778.C8789.f29063, 7);
            f13812.append(C8778.C8789.f29069, 6);
            f13812.append(C8778.C8789.f29071, 5);
            f13812.append(C8778.C8789.f29065, 9);
            f13812.append(C8778.C8789.f29064, 10);
            f13812.append(C8778.C8789.f29070, 11);
        }

        /* JADX INFO: renamed from: ۥ */
        public static void m2348(C5642 c5642, TypedArray typedArray, Context context) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f13812.get(index)) {
                    case 1:
                        c5642.f13787 = typedArray.getString(index);
                        continue;
                        break;
                    case 2:
                        c5642.f13788 = typedArray.getString(index);
                        continue;
                        break;
                    case 4:
                        c5642.f13785 = typedArray.getString(index);
                        continue;
                        break;
                    case 5:
                        c5642.f13792 = typedArray.getFloat(index, c5642.f13792);
                        continue;
                        break;
                    case 6:
                        c5642.f13789 = typedArray.getResourceId(index, c5642.f13789);
                        continue;
                        break;
                    case 7:
                        if (C6273.f15610) {
                            int resourceId = typedArray.getResourceId(index, c5642.f1572);
                            c5642.f1572 = resourceId;
                            if (resourceId == -1) {
                                c5642.f13602 = typedArray.getString(index);
                            } else {
                                continue;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            c5642.f13602 = typedArray.getString(index);
                        } else {
                            c5642.f1572 = typedArray.getResourceId(index, c5642.f1572);
                        }
                        break;
                    case 8:
                        int integer = typedArray.getInteger(index, c5642.f1571);
                        c5642.f1571 = integer;
                        c5642.f13796 = (integer + 0.5f) / 100.0f;
                        continue;
                        break;
                    case 9:
                        c5642.f13790 = typedArray.getResourceId(index, c5642.f13790);
                        continue;
                        break;
                    case 10:
                        c5642.f13801 = typedArray.getBoolean(index, c5642.f13801);
                        continue;
                        break;
                    case 11:
                        c5642.f13786 = typedArray.getResourceId(index, c5642.f13786);
                        break;
                }
                Log.e("KeyTrigger", "unused attribute 0x" + Integer.toHexString(index) + "   " + f13812.get(index));
            }
        }
    }

    public C5642() {
        int i = AbstractC5616.f13583;
        this.f13786 = i;
        this.f13787 = null;
        this.f13788 = null;
        this.f13789 = i;
        this.f13790 = i;
        this.f13791 = null;
        this.f13792 = 0.1f;
        this.f13793 = true;
        this.f13794 = true;
        this.f13795 = true;
        this.f13796 = Float.NaN;
        this.f13801 = false;
        this.f13802 = new RectF();
        this.f13803 = new RectF();
        this.f13603 = 5;
        this.f13604 = new HashMap<>();
    }

    @Override // Yue.AbstractC5616
    /* JADX INFO: renamed from: ۥ */
    public void mo2325(HashMap<String, AbstractC7544> map) {
    }

    @Override // Yue.AbstractC5616
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo2326(HashSet<String> hashSet) {
    }

    @Override // Yue.AbstractC5616
    /* JADX INFO: renamed from: ۥ۟۟ */
    public void mo17406(Context context, AttributeSet attributeSet) {
        C0823.m2348(this, context.obtainStyledAttributes(attributeSet, C8778.C8789.f29061), context);
    }

    @Override // Yue.AbstractC5616
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public void mo17409(String str, Object obj) {
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cd  */
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m17560(float f, View view) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = true;
        boolean z6 = false;
        if (this.f13790 != AbstractC5616.f13583) {
            if (this.f13791 == null) {
                this.f13791 = ((ViewGroup) view.getParent()).findViewById(this.f13790);
            }
            m17562(this.f13802, this.f13791, this.f13801);
            m17562(this.f13803, view, this.f13801);
            if (this.f13802.intersect(this.f13803)) {
                if (this.f13793) {
                    this.f13793 = false;
                    z = true;
                } else {
                    z = false;
                }
                if (this.f13795) {
                    this.f13795 = false;
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.f13794 = true;
            } else {
                if (this.f13793) {
                    z = false;
                } else {
                    this.f13793 = true;
                    z = true;
                }
                if (this.f13794) {
                    this.f13794 = false;
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.f13795 = true;
                z6 = z4;
                z3 = false;
            }
        } else {
            if (this.f13793) {
                float f2 = this.f13796;
                if ((f - f2) * (this.f13800 - f2) < 0.0f) {
                    this.f13793 = false;
                    z = true;
                }
                if (!this.f13794) {
                    float f3 = this.f13796;
                    float f4 = f - f3;
                    if ((this.f13800 - f3) * f4 < 0.0f && f4 < 0.0f) {
                        this.f13794 = false;
                        z2 = true;
                    }
                    if (this.f13795) {
                        float f5 = this.f13796;
                        float f6 = f - f5;
                        if ((this.f13800 - f5) * f6 >= 0.0f || f6 <= 0.0f) {
                            z5 = false;
                        } else {
                            this.f13795 = false;
                        }
                        z3 = z5;
                    } else {
                        if (Math.abs(f - this.f13796) > this.f13792) {
                            this.f13795 = true;
                        }
                        z3 = false;
                    }
                    z6 = z2;
                } else if (Math.abs(f - this.f13796) > this.f13792) {
                    this.f13794 = true;
                }
                z2 = false;
                if (this.f13795) {
                }
                z6 = z2;
            } else if (Math.abs(f - this.f13796) > this.f13792) {
                this.f13793 = true;
            }
            z = false;
            if (!this.f13794) {
            }
            z2 = false;
            if (this.f13795) {
            }
            z6 = z2;
        }
        this.f13800 = f;
        if (z6 || z || z3) {
            ((C6273) view.getParent()).m19393(this.f13789, z3, f);
        }
        if (this.f13786 != AbstractC5616.f13583) {
            view = ((C6273) view.getParent()).findViewById(this.f13786);
        }
        if (z6 && this.f13787 != null) {
            if (this.f13798 == null) {
                try {
                    this.f13798 = view.getClass().getMethod(this.f13787, null);
                } catch (NoSuchMethodException unused) {
                    Log.e("KeyTrigger", "Could not find method \"" + this.f13787 + "\"on class " + view.getClass().getSimpleName() + " " + C4308.m12437(view));
                }
            }
            try {
                this.f13798.invoke(view, null);
            } catch (Exception unused2) {
                Log.e("KeyTrigger", "Exception in call \"" + this.f13787 + "\"on class " + view.getClass().getSimpleName() + " " + C4308.m12437(view));
            }
        }
        if (z3 && this.f13788 != null) {
            if (this.f13799 == null) {
                try {
                    this.f13799 = view.getClass().getMethod(this.f13788, null);
                } catch (NoSuchMethodException unused3) {
                    Log.e("KeyTrigger", "Could not find method \"" + this.f13788 + "\"on class " + view.getClass().getSimpleName() + " " + C4308.m12437(view));
                }
            }
            try {
                this.f13799.invoke(view, null);
            } catch (Exception unused4) {
                Log.e("KeyTrigger", "Exception in call \"" + this.f13788 + "\"on class " + view.getClass().getSimpleName() + " " + C4308.m12437(view));
            }
        }
        if (!z || this.f13785 == null) {
            return;
        }
        if (this.f13797 == null) {
            try {
                this.f13797 = view.getClass().getMethod(this.f13785, null);
            } catch (NoSuchMethodException unused5) {
                Log.e("KeyTrigger", "Could not find method \"" + this.f13785 + "\"on class " + view.getClass().getSimpleName() + " " + C4308.m12437(view));
            }
        }
        try {
            this.f13797.invoke(view, null);
        } catch (Exception unused6) {
            Log.e("KeyTrigger", "Exception in call \"" + this.f13785 + "\"on class " + view.getClass().getSimpleName() + " " + C4308.m12437(view));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public int m17561() {
        return this.f13784;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final void m17562(RectF rectF, View view, boolean z) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z) {
            view.getMatrix().mapRect(rectF);
        }
    }
}
