package Yue;

import Yue.InterfaceC7144;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۡ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7468 extends AbstractC7121 {

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public int[] f22612;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public int[] f22613;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public int f22614;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public InterfaceC1269 f22615;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public InterfaceC1270 f22616;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public String[] f22617;

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۡ۟$ۥ */
    public interface InterfaceC1269 {
        /* JADX INFO: renamed from: ۥ */
        CharSequence m3666(Cursor cursor);
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۡ۟$ۥ۟ */
    public interface InterfaceC1270 {
        /* JADX INFO: renamed from: ۥ */
        boolean m3667(View view, Cursor cursor, int i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public C7468(Context context, int i, Cursor cursor, String[] strArr, int[] iArr) {
        super(context, i, cursor);
        this.f22614 = -1;
        this.f22613 = iArr;
        this.f22617 = strArr;
        m23422(cursor, strArr);
    }

    @Override // Yue.AbstractC4256, Yue.C4257.InterfaceC0371
    /* JADX INFO: renamed from: ۥ */
    public CharSequence mo1220(Cursor cursor) {
        InterfaceC1269 interfaceC1269 = this.f22615;
        if (interfaceC1269 != null) {
            return interfaceC1269.m3666(cursor);
        }
        int i = this.f22614;
        return i > -1 ? cursor.getString(i) : super.mo1220(cursor);
    }

    @Override // Yue.AbstractC4256
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public void mo12281(View view, Context context, Cursor cursor) {
        InterfaceC1270 interfaceC1270 = this.f22616;
        int[] iArr = this.f22613;
        int length = iArr.length;
        int[] iArr2 = this.f22612;
        for (int i = 0; i < length; i++) {
            View viewFindViewById = view.findViewById(iArr[i]);
            if (viewFindViewById != null) {
                if (interfaceC1270 != null ? interfaceC1270.m3667(viewFindViewById, cursor, iArr2[i]) : false) {
                    continue;
                } else {
                    String string = cursor.getString(iArr2[i]);
                    if (string == null) {
                        string = "";
                    }
                    if (viewFindViewById instanceof TextView) {
                        m23430((TextView) viewFindViewById, string);
                    } else {
                        if (!(viewFindViewById instanceof ImageView)) {
                            throw new IllegalStateException(viewFindViewById.getClass().getName() + " is not a  view that can be bounds by this SimpleCursorAdapter");
                        }
                        m23429((ImageView) viewFindViewById, string);
                    }
                }
            }
        }
    }

    @Override // Yue.AbstractC4256
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public Cursor mo12289(Cursor cursor) {
        m23422(cursor, this.f22617);
        return super.mo12289(cursor);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m23421(Cursor cursor, String[] strArr, int[] iArr) {
        this.f22617 = strArr;
        this.f22613 = iArr;
        m23422(cursor, strArr);
        super.mo1221(cursor);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final void m23422(Cursor cursor, String[] strArr) {
        if (cursor == null) {
            this.f22612 = null;
            return;
        }
        int length = strArr.length;
        int[] iArr = this.f22612;
        if (iArr == null || iArr.length != length) {
            this.f22612 = new int[length];
        }
        for (int i = 0; i < length; i++) {
            this.f22612[i] = cursor.getColumnIndexOrThrow(strArr[i]);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public InterfaceC1269 m23423() {
        return this.f22615;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public int m23424() {
        return this.f22614;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public InterfaceC1270 m23425() {
        return this.f22616;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m23426(InterfaceC1269 interfaceC1269) {
        this.f22615 = interfaceC1269;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public void m23427(int i) {
        this.f22614 = i;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public void m23428(InterfaceC1270 interfaceC1270) {
        this.f22616 = interfaceC1270;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public void m23429(ImageView imageView, String str) {
        try {
            imageView.setImageResource(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            imageView.setImageURI(Uri.parse(str));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public void m23430(TextView textView, String str) {
        textView.setText(str);
    }

    public C7468(Context context, int i, Cursor cursor, String[] strArr, int[] iArr, int i2) {
        super(context, i, cursor, i2);
        this.f22614 = -1;
        this.f22613 = iArr;
        this.f22617 = strArr;
        m23422(cursor, strArr);
    }
}
