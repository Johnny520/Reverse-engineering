package Yue;

import Yue.C5746;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

/* JADX INFO: renamed from: Yue.ۥ۟ۨ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4259 extends AbstractC3442<Cursor> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final C5746<Cursor>.C0857 f8752;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public Uri f8753;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public String[] f8754;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public String f8755;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public String[] f8756;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public String f8757;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public Cursor f8758;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public C3674 f8759;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4259(@InterfaceC6391 Context context) {
        super(context);
        this.f8752 = new C5746.C0857();
    }

    @Override // Yue.AbstractC3442, Yue.C5746
    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public void mo9059(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo9059(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.f8753);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.f8754));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.f8755);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.f8756));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.f8757);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.f8758);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.f14254);
    }

    @Override // Yue.C5746
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void mo12296() {
        super.mo12296();
        mo12298();
        Cursor cursor = this.f8758;
        if (cursor != null && !cursor.isClosed()) {
            this.f8758.close();
        }
        this.f8758 = null;
    }

    @Override // Yue.C5746
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void mo12297() {
        Cursor cursor = this.f8758;
        if (cursor != null) {
            mo12295(cursor);
        }
        if (m17826() || this.f8758 == null) {
            m17812();
        }
    }

    @Override // Yue.C5746
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void mo12298() {
        m2422();
    }

    @Override // Yue.AbstractC3442
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ */
    public void mo9062() {
        super.mo9062();
        synchronized (this) {
            try {
                C3674 c3674 = this.f8759;
                if (c3674 != null) {
                    c3674.m741();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۟۠(Ljava/lang/Object;)V */
    @Override // Yue.C5746
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public void mo12295(Cursor cursor) {
        if (m17816()) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        Cursor cursor2 = this.f8758;
        this.f8758 = cursor;
        if (m17817()) {
            super.mo12295(cursor);
        }
        if (cursor2 == null || cursor2 == cursor || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public String[] m12300() {
        return this.f8754;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public String m12301() {
        return this.f8755;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public String[] m12302() {
        return this.f8756;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public String m12303() {
        return this.f8757;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public Uri m12304() {
        return this.f8753;
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟ۡۧ()Ljava/lang/Object; */
    @Override // Yue.AbstractC3442
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public Cursor mo9067() {
        synchronized (this) {
            if (m9066()) {
                throw new C6576();
            }
            this.f8759 = new C3674();
        }
        try {
            Cursor cursorM1136 = C4181.m1136(m17813().getContentResolver(), this.f8753, this.f8754, this.f8755, this.f8756, this.f8757, this.f8759);
            if (cursorM1136 != null) {
                try {
                    cursorM1136.getCount();
                    cursorM1136.registerContentObserver(this.f8752);
                } catch (RuntimeException e) {
                    cursorM1136.close();
                    throw e;
                }
            }
            synchronized (this) {
                this.f8759 = null;
            }
            return cursorM1136;
        } catch (Throwable th) {
            synchronized (this) {
                this.f8759 = null;
                throw th;
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟ۡۨ(Ljava/lang/Object;)V */
    @Override // Yue.AbstractC3442
    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public void mo9068(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public void m12307(@InterfaceC6490 String[] strArr) {
        this.f8754 = strArr;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m12308(@InterfaceC6490 String str) {
        this.f8755 = str;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m12309(@InterfaceC6490 String[] strArr) {
        this.f8756 = strArr;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public void m12310(@InterfaceC6490 String str) {
        this.f8757 = str;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public void m12311(@InterfaceC6391 Uri uri) {
        this.f8753 = uri;
    }

    public C4259(@InterfaceC6391 Context context, @InterfaceC6391 Uri uri, @InterfaceC6490 String[] strArr, @InterfaceC6490 String str, @InterfaceC6490 String[] strArr2, @InterfaceC6490 String str2) {
        super(context);
        this.f8752 = new C5746.C0857();
        this.f8753 = uri;
        this.f8754 = strArr;
        this.f8755 = str;
        this.f8756 = strArr2;
        this.f8757 = str2;
    }
}
