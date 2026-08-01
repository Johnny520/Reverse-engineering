package p089g0;

import android.R;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import android.view.textclassifier.TextClassification;

/* JADX INFO: renamed from: g0.c1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2455c1 {

    /* JADX INFO: renamed from: a */
    public static final C2455c1 f6642a = new C2455c1();

    /* JADX INFO: renamed from: a */
    public static boolean m8886a(Context context, TextClassification textClassification, MenuItem menuItem) throws PendingIntent.CanceledException {
        C2479o0.f6703a.m8935a(context, textClassification);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m8887b(RemoteAction remoteAction, MenuItem menuItem) throws PendingIntent.CanceledException {
        C2479o0.f6703a.m8936b(remoteAction.getActionIntent());
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m8888c(Menu menu, int i10, final Context context, final TextClassification textClassification) {
        MenuItem menuItemAdd = menu.add(R.id.textAssist, R.id.textAssist, i10, textClassification.getLabel());
        menuItemAdd.setShowAsAction(2);
        menuItemAdd.setIcon(textClassification.getIcon());
        menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: g0.a1
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return C2455c1.m8886a(context, textClassification, menuItem);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final void m8889d(Menu menu, int i10, Context context, TextClassification textClassification, int i11) {
        if (i11 < 0) {
            m8888c(menu, i10, context, textClassification);
        } else {
            m8890e(menu, i10, context, i11 == 0, (RemoteAction) textClassification.getActions().get(i11));
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m8890e(Menu menu, int i10, Context context, boolean z10, final RemoteAction remoteAction) {
        MenuItem menuItemAdd = menu.add(R.id.textAssist, z10 ? 16908353 : 0, i10, remoteAction.getTitle());
        menuItemAdd.setShowAsAction(z10 ? 2 : 0);
        if (z10 || remoteAction.shouldShowIcon()) {
            menuItemAdd.setIcon(remoteAction.getIcon().loadDrawable(context));
        }
        menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: g0.b1
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return C2455c1.m8887b(remoteAction, menuItem);
            }
        });
    }
}
