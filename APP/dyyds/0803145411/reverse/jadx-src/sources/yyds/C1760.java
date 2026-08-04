package yyds;

import android.R;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: yyds.ᛸᛴᛷᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1760 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f8837;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public int f8838;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public Object f8839;

    public C1760(int i, byte b) {
        this.f8837 = i;
        switch (i) {
            case 5:
                this.f8838 = 1;
                this.f8839 = null;
                break;
            default:
                this.f8838 = 1;
                this.f8839 = Collections.singletonList(null);
                break;
        }
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static void m3496(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = AbstractC1544.m3197(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e) {
            Log.w("SupportSQLite", "delete failed: ", e);
        }
    }

    public String toString() {
        switch (this.f8837) {
            case 4:
                return new String((char[]) this.f8839, 0, this.f8838 + 1);
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public void m3497(int i, C0313 c0313) {
        while (true) {
            int i2 = i >> 1;
            if (i2 == 0) {
                break;
            }
            C0313[] c0313Arr = (C0313[]) this.f8839;
            C0313 c03132 = c0313Arr[i2];
            long j = c0313.f1636 - c03132.f1636;
            if (0 < j || 0 == j) {
                break;
            }
            c03132.f1637 = i;
            c0313Arr[i] = c03132;
            i = i2;
        }
        ((C0313[]) this.f8839)[i] = c0313;
        c0313.f1637 = i;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public void m3498(C0644 c0644) {
        while (c0644 != null) {
            int i = 0;
            while (true) {
                int i2 = this.f8838;
                C0644[] c0644Arr = (C0644[]) this.f8839;
                if (i >= i2) {
                    if (i2 >= c0644Arr.length) {
                        C0644[] c0644Arr2 = new C0644[c0644Arr.length + 6];
                        System.arraycopy(c0644Arr, 0, c0644Arr2, 0, i2);
                        this.f8839 = c0644Arr2;
                        c0644Arr = c0644Arr2;
                    }
                    int i3 = this.f8838;
                    this.f8838 = i3 + 1;
                    c0644Arr[i3] = c0644;
                } else if (((String) c0644Arr[i].f3099).equals((String) c0644.f3099)) {
                    break;
                } else {
                    i++;
                }
            }
            c0644 = (C0644) c0644.f3101;
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public void m3499(char c) {
        int i = this.f8838 + 1;
        this.f8838 = i;
        char[] cArr = (char[]) this.f8839;
        if (cArr.length <= i) {
            char[] cArr2 = new char[(cArr.length * 2) + 1];
            System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
            this.f8839 = cArr2;
            cArr = cArr2;
        }
        cArr[this.f8838] = c;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public void m3500(C0313 c0313) {
        C0313[] c0313Arr;
        C0313 c03132;
        int i = c0313.f1637;
        if (i == -1) {
            C0188.m798("Failed requirement.");
            return;
        }
        int i2 = this.f8838;
        C0313[] c0313Arr2 = (C0313[]) this.f8839;
        C0313 c03133 = c0313Arr2[i2];
        c0313.f1637 = -1;
        c0313Arr2[i2] = null;
        this.f8838 = i2 - 1;
        if (c0313 == c03133) {
            return;
        }
        long j = c03133.f1636 - c0313.f1636;
        byte b = 0 >= j ? 0 == j ? (byte) 0 : (byte) 1 : (byte) -1;
        if (b == 0) {
            c0313Arr2[i] = c03133;
            c03133.f1637 = i;
            return;
        }
        if (b >= 0) {
            m3497(i, c03133);
            return;
        }
        while (true) {
            int i3 = i << 1;
            int i4 = i3 + 1;
            int i5 = this.f8838;
            if (i4 > i5) {
                if (i3 > i5) {
                    break;
                }
                c0313Arr = (C0313[]) this.f8839;
                c03132 = c0313Arr[i3];
            } else {
                c0313Arr = (C0313[]) this.f8839;
                c03132 = c0313Arr[i3];
                C0313 c03134 = c0313Arr[i4];
                if (0 >= c03134.f1636 - c03132.f1636) {
                    c03132 = c03134;
                }
            }
            long j2 = c03132.f1636 - c03133.f1636;
            if (0 < j2 || 0 == j2) {
                break;
            }
            int i6 = c03132.f1637;
            c03132.f1637 = i;
            c0313Arr[i] = c03132;
            i = i6;
        }
        ((C0313[]) this.f8839)[i] = c03133;
        c03133.f1637 = i;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public DialogC0194 m3501() {
        C0493 c0493 = (C0493) this.f8839;
        ContextThemeWrapper contextThemeWrapper = c0493.f2419;
        DialogC0194 dialogC0194 = new DialogC0194(contextThemeWrapper, this.f8838);
        View view = c0493.f2418;
        C2239 c2239 = dialogC0194.f1149;
        if (view != null) {
            c2239.f11045 = view;
        } else {
            CharSequence charSequence = c0493.f2425;
            if (charSequence != null) {
                c2239.f11067 = charSequence;
                TextView textView = c2239.f11061;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c0493.f2423;
            if (drawable != null) {
                c2239.f11062 = drawable;
                ImageView imageView = c2239.f11060;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c2239.f11060.setImageDrawable(drawable);
                }
            }
        }
        if (c0493.f2421 != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c0493.f2420.inflate(c2239.f11053, (ViewGroup) null);
            int i = c0493.f2417 ? c2239.f11063 : c2239.f11051;
            ListAdapter c0304 = c0493.f2421;
            if (c0304 == null) {
                c0304 = new C0304(contextThemeWrapper, i, R.id.text1, null);
            }
            c2239.f11052 = c0304;
            c2239.f11065 = c0493.f2422;
            if (c0493.f2416 != null) {
                alertController$RecycleListView.setOnItemClickListener(new C2756(c0493, c2239));
            }
            if (c0493.f2417) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c2239.f11049 = alertController$RecycleListView;
        }
        dialogC0194.setCancelable(true);
        dialogC0194.setCanceledOnTouchOutside(true);
        dialogC0194.setOnCancelListener(null);
        dialogC0194.setOnDismissListener(null);
        DialogInterfaceOnKeyListenerC2346 dialogInterfaceOnKeyListenerC2346 = c0493.f2424;
        if (dialogInterfaceOnKeyListenerC2346 != null) {
            dialogC0194.setOnKeyListener(dialogInterfaceOnKeyListenerC2346);
        }
        return dialogC0194;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public void m3502(C0574 c0574, int i, int i2) {
        ((C1491) this.f8839).m2998(new C1519(c0574), i, i2);
    }

    public C1760(C1491 c1491, int i) {
        this.f8837 = 7;
        this.f8839 = c1491;
        this.f8837 = 7;
        this.f8838 = i;
    }

    public C1760(Context context) {
        this.f8837 = 0;
        int iM819 = DialogC0194.m819(context, 0);
        this.f8839 = new C0493(new ContextThemeWrapper(context, DialogC0194.m819(context, iM819)));
        this.f8838 = iM819;
    }

    public /* synthetic */ C1760(char c, int i) {
        this.f8837 = i;
    }

    public C1760(int i, ArrayList arrayList) {
        this.f8837 = i;
        switch (i) {
            case 8:
                this.f8839 = arrayList;
                break;
            default:
                this.f8838 = 0;
                this.f8839 = arrayList;
                break;
        }
    }

    public C1760(RunnableC1650 runnableC1650, int i) {
        this.f8837 = 2;
        this.f8839 = runnableC1650;
        this.f8838 = i;
    }
}
