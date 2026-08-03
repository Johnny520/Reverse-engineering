package Yue;

import Yue.InterfaceC7144;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5078<E> extends AbstractC5076 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6490
    public final Activity f12029;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6391
    public final Context f12030;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6391
    public final Handler f12031;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final int f12032;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final FragmentManager f12033;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC5078(@InterfaceC6391 Context context, @InterfaceC6391 Handler handler, int i) {
        this(context instanceof Activity ? (Activity) context : null, context, handler, i);
    }

    @Override // Yue.AbstractC5076
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ */
    public View mo15627(int i) {
        return null;
    }

    @Override // Yue.AbstractC5076
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public boolean mo15628() {
        return true;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public Activity m15669() {
        return this.f12029;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public Context m15670() {
        return this.f12030;
    }

    @InterfaceC6391
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public Handler m15671() {
        return this.f12031;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void mo15672(@InterfaceC6391 String str, @InterfaceC6490 FileDescriptor fileDescriptor, @InterfaceC6391 PrintWriter printWriter, @InterfaceC6490 String[] strArr) {
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public abstract E mo15673();

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public LayoutInflater mo15674() {
        return LayoutInflater.from(this.f12030);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public int mo15675() {
        return this.f12032;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean mo15676() {
        return true;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m15677(@InterfaceC6391 Fragment fragment, @InterfaceC6391 String[] strArr, int i) {
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public boolean mo15678(@InterfaceC6391 Fragment fragment) {
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public boolean mo15679(@InterfaceC6391 String str) {
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m15680(@InterfaceC6391 Fragment fragment, @InterfaceC6391 Intent intent, int i) {
        m15681(fragment, intent, i, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m15681(@InterfaceC6391 Fragment fragment, @InterfaceC6391 Intent intent, int i, @InterfaceC6490 Bundle bundle) {
        if (i != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        C4187.m12080(this.f12030, intent, bundle);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void m15682(@InterfaceC6391 Fragment fragment, @InterfaceC6391 IntentSender intentSender, int i, @InterfaceC6490 Intent intent, int i2, int i3, int i4, @InterfaceC6490 Bundle bundle) throws IntentSender.SendIntentException {
        if (i != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        C3090.m6319(this.f12029, intentSender, i, intent, i2, i3, i4, bundle);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void mo15683() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AbstractC5078(@InterfaceC6391 FragmentActivity fragmentActivity) {
        this(fragmentActivity, fragmentActivity, new Handler(), 0);
    }

    public AbstractC5078(@InterfaceC6490 Activity activity, @InterfaceC6391 Context context, @InterfaceC6391 Handler handler, int i) {
        this.f12033 = new C5084();
        this.f12029 = activity;
        this.f12030 = (Context) C6740.m21416(context, "context == null");
        this.f12031 = (Handler) C6740.m21416(handler, "handler == null");
        this.f12032 = i;
    }
}
