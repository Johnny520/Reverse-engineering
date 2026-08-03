package Yue;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: Yue.ۥۡۦۦ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7121 extends AbstractC4256 {

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public int f21480;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public int f21481;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public LayoutInflater f21482;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public AbstractC7121(Context context, int i, Cursor cursor) {
        super(context, cursor);
        this.f21481 = i;
        this.f21480 = i;
        this.f21482 = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // Yue.AbstractC4256
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public View mo12285(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f21482.inflate(this.f21481, viewGroup, false);
    }

    @Override // Yue.AbstractC4256
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public View mo12286(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f21482.inflate(this.f21480, viewGroup, false);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m22231(int i) {
        this.f21481 = i;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m22232(int i) {
        this.f21480 = i;
    }

    @Deprecated
    public AbstractC7121(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f21481 = i;
        this.f21480 = i;
        this.f21482 = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public AbstractC7121(Context context, int i, Cursor cursor, int i2) {
        super(context, cursor, i2);
        this.f21481 = i;
        this.f21480 = i;
        this.f21482 = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
