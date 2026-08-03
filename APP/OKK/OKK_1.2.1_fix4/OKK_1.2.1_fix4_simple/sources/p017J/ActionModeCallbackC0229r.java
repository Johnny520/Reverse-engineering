package p017J;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.Editable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: J.r */
/* JADX INFO: loaded from: classes.dex */
public final class ActionModeCallbackC0229r implements ActionMode.Callback {

    /* JADX INFO: renamed from: a */
    public final ActionMode.Callback f465a;

    /* JADX INFO: renamed from: b */
    public final TextView f466b;

    /* JADX INFO: renamed from: c */
    public Class f467c;

    /* JADX INFO: renamed from: d */
    public Method f468d;

    /* JADX INFO: renamed from: e */
    public boolean f469e;

    /* JADX INFO: renamed from: f */
    public boolean f470f;

    public ActionModeCallbackC0229r(ActionMode.Callback r1, TextView r2) {
        this.f465a = r1;
        this.f466b = r2;
        this.f470f = false;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode r2, MenuItem r3) {
        return this.f465a.onActionItemClicked(r2, r3);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode r2, Menu r3) {
        return this.f465a.onCreateActionMode(r2, r3);
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode r2) {
        this.f465a.onDestroyActionMode(r2);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode r14, Menu r15) {
        TextView r1 = this.f466b;
        Context r2 = r1.getContext();
        PackageManager r3 = r2.getPackageManager();
        if (this.f470f == true) goto L58;
        this.f470f = true;
        Class<?> r4 = Class.forName("com.android.internal.view.menu.MenuBuilder");     // Catch: Throwable -> L7
        this.f467c = r4;     // Catch: Throwable -> L7
        this.f468d = r4.getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});     // Catch: Throwable -> L7
        this.f469e = true;     // Catch: Throwable -> L7
    L7:
        this.f467c = null;
        this.f468d = null;
        this.f469e = false;
    L58:
        if (this.f469e == true) goto L11;
    L13:
        Method r42 = r15.getClass().getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});     // Catch: Throwable -> L55
    L15:
        int r5 = r15.size() - 1;
    L17:
        if (r5 < 0) goto L24;
        MenuItem r8 = r15.getItem(r5);     // Catch: Throwable -> L55 Throwable -> L55 Throwable -> L55
        if (r8.getIntent() == null) goto L23;
        if ("android.intent.action.PROCESS_TEXT".equals(r8.getIntent().getAction()) == false) goto L23;
        r42.invoke(r15, new Object[]{Integer.valueOf(r5)});     // Catch: Throwable -> L55 Throwable -> L55 Throwable -> L55
    L23:
        r5 = r5 - 1;
        goto L17
    L24:
        ArrayList r43 = new ArrayList();
        if ((r2 instanceof Activity) == false) goto L41;
        Iterator<ResolveInfo> r52 = r3.queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0).iterator();
    L29:
        if (r52.hasNext() == false) goto L41;
        ResolveInfo r9 = r52.next();
        if (r2.getPackageName().equals(r9.activityInfo.packageName) == true) goto L40;
        ActivityInfo r10 = r9.activityInfo;
        if (r10.exported == false) goto L29;
        String r102 = r10.permission;
        if (r102 == null) goto L40;
        if (r2.checkSelfPermission(r102) != 0) goto L29;
    L40:
        r43.add(r9);
    L41:
        int r22 = 0;
    L43:
        if (r22 >= r43.size()) goto L54;
        ResolveInfo r53 = (ResolveInfo) r43.get(r22);
        MenuItem r92 = r15.add(0, 0, r22 + 100, r53.loadLabel(r3));
        Intent r103 = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        if ((r1 instanceof Editable) == true) goto L47;
    L51:
        boolean r11 = false;
    L52:
        Intent r104 = r103.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !r11);
        ActivityInfo r54 = r53.activityInfo;
        r92.setIntent(r104.setClassName(r54.packageName, r54.name)).setShowAsAction(1);
        r22 = r22 + 1;
        goto L43
    L47:
        if (r1.onCheckIsTextEditor() == false) goto L51;
        if (r1.isEnabled() == false) goto L51;
        r11 = true;
        goto L52
    L11:
        if (this.f467c.isInstance(r15) == false) goto L13;
        r42 = this.f468d;     // Catch: Throwable -> L55
    L54:
        return this.f465a.onPrepareActionMode(r14, r15);
    }
}
