package Yue;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: renamed from: Yue.ۥۡۤ۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6647 {

    /* JADX INFO: renamed from: ۥ */
    public final Context f2205;

    /* JADX INFO: renamed from: ۥ۟ */
    public final int f2206;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6391
    public final Intent f17078;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final int f17079;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC6490
    public final Bundle f17080;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC6490
    public final PendingIntent f17081;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final boolean f17082;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6647(@InterfaceC6391 Context context, int i, @InterfaceC6391 Intent intent, int i2, boolean z) {
        this(context, i, intent, i2, null, z);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ */
    public final PendingIntent m3120() {
        Bundle bundle = this.f17080;
        return bundle == null ? C6648.m21254(this.f2205, this.f2206, this.f17078, this.f17079, this.f17082) : C6648.m21253(this.f2205, this.f2206, this.f17078, this.f17079, bundle, this.f17082);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟ */
    public Context m3121() {
        return this.f2205;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int m21246() {
        return this.f17079;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public Intent m21247() {
        return this.f17078;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public Bundle m21248() {
        return this.f17080;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public PendingIntent m21249() {
        return this.f17081;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int m21250() {
        return this.f2206;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean m21251() {
        return this.f17082;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C6647(@InterfaceC6391 Context context, int i, @InterfaceC6391 Intent intent, int i2, @InterfaceC6490 Bundle bundle, boolean z) {
        this.f2205 = context;
        this.f2206 = i;
        this.f17078 = intent;
        this.f17079 = i2;
        this.f17080 = bundle;
        this.f17082 = z;
        this.f17081 = m3120();
    }
}
