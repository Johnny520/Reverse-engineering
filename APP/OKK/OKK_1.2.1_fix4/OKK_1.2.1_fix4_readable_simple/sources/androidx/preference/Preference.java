package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import org.luckypray.dexkit.C1031R;
import p032R.AbstractC0318a;
import p083u.AbstractC1083b;
import p089x0.C1121e;

/* JADX INFO: loaded from: classes.dex */
public class Preference implements Comparable<Preference> {

    /* JADX INFO: renamed from: a */
    public final Context f1508a;

    /* JADX INFO: renamed from: b */
    public final int f1509b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f1510c;

    /* JADX INFO: renamed from: d */
    public final CharSequence f1511d;

    /* JADX INFO: renamed from: e */
    public final String f1512e;

    /* JADX INFO: renamed from: f */
    public final Object f1513f;

    /* JADX INFO: renamed from: g */
    public C1121e f1514g;

    public Preference(Context r5, AttributeSet r6, int r7) {
        this.f1509b = Integer.MAX_VALUE;
        this.f1508a = r5;
        TypedArray r52 = r5.obtainStyledAttributes(r6, AbstractC0318a.f603f, r7, 0);
        r52.getResourceId(23, r52.getResourceId(0, 0));
        String r62 = r52.getString(26);
        if (r62 != null) goto L5;
        r62 = r52.getString(6);
    L5:
        this.f1512e = r62;
        CharSequence r63 = r52.getText(34);
        if (r63 != null) goto L8;
        r63 = r52.getText(4);
    L8:
        this.f1510c = r63;
        CharSequence r64 = r52.getText(33);
        if (r64 != null) goto L11;
        r64 = r52.getText(7);
    L11:
        this.f1511d = r64;
        this.f1509b = r52.getInt(28, r52.getInt(8, Integer.MAX_VALUE));
        if (r52.getString(22) != null) goto L14;
        r52.getString(13);
    L14:
        r52.getResourceId(27, r52.getResourceId(3, C1031R.layout.preference));
        r52.getResourceId(35, r52.getResourceId(9, 0));
        r52.getBoolean(21, r52.getBoolean(2, true));
        boolean r65 = r52.getBoolean(30, r52.getBoolean(5, true));
        r52.getBoolean(29, r52.getBoolean(1, true));
        AbstractC1083b.m2569c(r52, 19, 10);
        r52.getBoolean(16, r52.getBoolean(16, r65));
        r52.getBoolean(17, r52.getBoolean(17, r65));
        if (r52.hasValue(18) == false) goto L18;
        this.f1513f = mo1264c(r52, 18);
    L20:
        r52.getBoolean(31, r52.getBoolean(12, true));
        if (r52.hasValue(32) == false) goto L23;
        r52.getBoolean(32, r52.getBoolean(14, true));
    L23:
        r52.getBoolean(24, r52.getBoolean(15, false));
        r52.getBoolean(25, r52.getBoolean(25, true));
        r52.getBoolean(20, r52.getBoolean(20, false));
        r52.recycle();
        return;
    L18:
        if (r52.hasValue(11) == false) goto L20;
        this.f1513f = mo1264c(r52, 11);
        goto L20
    }

    /* JADX INFO: renamed from: a */
    public CharSequence mo1265a() {
        C1121e r02 = this.f1514g;
        if (r02 == null) goto L7;
        return r02.m2639h(this);
    L7:
        return this.f1511d;
    }

    /* JADX INFO: renamed from: b */
    public void mo1263b() {
    }

    /* JADX INFO: renamed from: c */
    public Object mo1264c(TypedArray r1, int r2) {
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Preference r3) {
        Preference r32 = r3;
        int r02 = r32.f1509b;
        int r1 = this.f1509b;
        if (r1 != r02) goto L14;
        CharSequence r33 = r32.f1510c;
        CharSequence r03 = this.f1510c;
        if (r03 != r33) goto L8;
        return 0;
    L8:
        if (r03 != null) goto L10;
        return 1;
    L10:
        if (r33 != null) goto L13;
        return -1;
    L13:
        return r03.toString().compareToIgnoreCase(r33.toString());
    L14:
        return r1 - r02;
    }

    public final String toString() {
        StringBuilder r02 = new StringBuilder();
        CharSequence r1 = this.f1510c;
        if (TextUtils.isEmpty(r1) == true) goto L5;
        r02.append(r1);
        r02.append(' ');
    L5:
        CharSequence r12 = mo1265a();
        if (TextUtils.isEmpty(r12) == true) goto L9;
        r02.append(r12);
        r02.append(' ');
    L9:
        if (r02.length() <= 0) goto L12;
        r02.setLength(r02.length() - 1);
    L12:
        return r02.toString();
    }

    public Preference(Context r3, AttributeSet r4) {
        this(r3, r4, AbstractC1083b.m2568b(r3, C1031R.attr.preferenceStyle, R.attr.preferenceStyle));
    }
}
