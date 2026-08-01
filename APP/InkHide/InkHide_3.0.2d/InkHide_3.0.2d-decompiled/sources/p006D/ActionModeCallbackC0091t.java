package p006D;

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
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: renamed from: D.t */
/* JADX INFO: loaded from: classes.dex */
public final class ActionModeCallbackC0091t implements ActionMode.Callback {

    /* JADX INFO: renamed from: a */
    public final ActionMode.Callback f360a;

    /* JADX INFO: renamed from: b */
    public final TextView f361b;

    /* JADX INFO: renamed from: c */
    public Class f362c;

    /* JADX INFO: renamed from: d */
    public Method f363d;

    /* JADX INFO: renamed from: e */
    public boolean f364e;

    /* JADX INFO: renamed from: f */
    public boolean f365f = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ActionModeCallbackC0091t(ActionMode.Callback callback, TextView textView) {
        this.f360a = callback;
        this.f361b = textView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f360a.onActionItemClicked(actionMode, menuItem);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.f360a.onCreateActionMode(actionMode, menu);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.f360a.onDestroyActionMode(actionMode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        String str;
        TextView textView = this.f361b;
        Context context = textView.getContext();
        PackageManager packageManager = context.getPackageManager();
        boolean z2 = this.f365f;
        Class cls = Integer.TYPE;
        if (!z2) {
            this.f365f = true;
            try {
                Class<?> cls2 = Class.forName("com.android.internal.view.menu.MenuBuilder");
                this.f362c = cls2;
                this.f363d = cls2.getDeclaredMethod("removeItemAt", cls);
                this.f364e = true;
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                this.f362c = null;
                this.f363d = null;
                this.f364e = false;
            }
        }
        try {
            Method declaredMethod = (this.f364e && this.f362c.isInstance(menu)) ? this.f363d : menu.getClass().getDeclaredMethod("removeItemAt", cls);
            for (int size = menu.size() - 1; size >= 0; size--) {
                MenuItem item = menu.getItem(size);
                if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                    declaredMethod.invoke(menu, Integer.valueOf(size));
                }
            }
            ArrayList arrayList = new ArrayList();
            if (context instanceof Activity) {
                for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0)) {
                    if (!context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                        ActivityInfo activityInfo = resolveInfo.activityInfo;
                        if (activityInfo.exported && ((str = activityInfo.permission) == null || context.checkSelfPermission(str) == 0)) {
                        }
                    }
                    arrayList.add(resolveInfo);
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ResolveInfo resolveInfo2 = (ResolveInfo) arrayList.get(i2);
                MenuItem menuItemAdd = menu.add(0, 0, i2 + 100, resolveInfo2.loadLabel(packageManager));
                Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !((textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled()));
                ActivityInfo activityInfo2 = resolveInfo2.activityInfo;
                menuItemAdd.setIntent(intentPutExtra.setClassName(activityInfo2.packageName, activityInfo2.name)).setShowAsAction(1);
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
        }
        return this.f360a.onPrepareActionMode(actionMode, menu);
    }
}
