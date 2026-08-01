package p028F;

import android.R;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.textclassifier.TextClassification;
import p018D.AbstractC0253b;
import p018D.C0254c;
import p018D.C0255d;
import p018D.C0257f;
import p018D.C0259h;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: F.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0344e {

    /* JADX INFO: renamed from: a */
    public final C0345f f1081a;

    /* JADX INFO: renamed from: b */
    public final C0341b f1082b;

    /* JADX INFO: renamed from: c */
    public final C0341b f1083c;

    /* JADX INFO: renamed from: d */
    public final View f1084d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0344e(C0345f c0345f, C0341b c0341b, C0341b c0341b2, View view) {
        this.f1081a = c0345f;
        this.f1082b = c0341b;
        this.f1083c = c0341b2;
        this.f1084d = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX INFO: renamed from: a */
    public final boolean m555a(Menu menu) {
        int i5;
        C0254c c0254c = (C0254c) this.f1082b.mo6a();
        int i6 = 0;
        if (AbstractC1665j.m2981a(c0254c, null)) {
            return false;
        }
        menu.clear();
        ?? r22 = c0254c.f841a;
        int size = r22.size();
        int i7 = 0;
        int i8 = 1;
        int i9 = 1;
        while (i7 < size) {
            AbstractC0253b abstractC0253b = (AbstractC0253b) r22.get(i7);
            if (abstractC0253b instanceof C0255d) {
                i5 = i8 + 1;
                final C0255d c0255d = (C0255d) abstractC0253b;
                MenuItem menuItemAdd = menu.add(i9, i8, i8, c0255d.f842b);
                menuItemAdd.setShowAsAction(2);
                final int i10 = 0;
                menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: F.d
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                        switch (i10) {
                            case 0:
                                ((C0255d) c0255d).f844d.mo1h(((C0344e) this).f1081a);
                                break;
                            default:
                                Context context = (Context) c0255d;
                                TextClassification textClassification = (TextClassification) this;
                                String text = textClassification.getText();
                                PendingIntent activity = PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592);
                                if (Build.VERSION.SDK_INT < 34) {
                                    activity.send();
                                } else {
                                    try {
                                        activity.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
                                    } catch (PendingIntent.CanceledException e5) {
                                        Log.e("TextClassification", "error sending pendingIntent: " + activity + " error: " + e5);
                                        return true;
                                    }
                                }
                                break;
                        }
                        return true;
                    }
                });
            } else {
                if (abstractC0253b instanceof C0259h) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        i5 = i8 + 1;
                        final Context context = this.f1084d.getContext();
                        C0259h c0259h = (C0259h) abstractC0253b;
                        final TextClassification textClassification = c0259h.f851b;
                        int i11 = c0259h.f852c;
                        if (i11 < 0) {
                            MenuItem menuItemAdd2 = menu.add(R.id.textAssist, R.id.textAssist, i8, textClassification.getLabel());
                            menuItemAdd2.setShowAsAction(2);
                            menuItemAdd2.setIcon(textClassification.getIcon());
                            final int i12 = 1;
                            menuItemAdd2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: F.d
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // android.view.MenuItem.OnMenuItemClickListener
                                public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                                    switch (i12) {
                                        case 0:
                                            ((C0255d) context).f844d.mo1h(((C0344e) textClassification).f1081a);
                                            break;
                                        default:
                                            Context context2 = (Context) context;
                                            TextClassification textClassification2 = (TextClassification) textClassification;
                                            String text = textClassification2.getText();
                                            PendingIntent activity = PendingIntent.getActivity(context2, text != null ? text.hashCode() : 0, textClassification2.getIntent(), 201326592);
                                            if (Build.VERSION.SDK_INT < 34) {
                                                activity.send();
                                            } else {
                                                try {
                                                    activity.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
                                                } catch (PendingIntent.CanceledException e5) {
                                                    Log.e("TextClassification", "error sending pendingIntent: " + activity + " error: " + e5);
                                                    return true;
                                                }
                                            }
                                            break;
                                    }
                                    return true;
                                }
                            });
                        } else {
                            int i13 = i11 == 0 ? 1 : i6;
                            RemoteAction remoteAction = (RemoteAction) textClassification.getActions().get(i11);
                            MenuItem menuItemAdd3 = menu.add(R.id.textAssist, i13 != 0 ? 16908353 : i6, i8, remoteAction.getTitle());
                            menuItemAdd3.setShowAsAction(i13 == 0 ? 0 : 2);
                            if (i13 != 0 || remoteAction.shouldShowIcon()) {
                                menuItemAdd3.setIcon(remoteAction.getIcon().loadDrawable(context));
                            }
                            menuItemAdd3.setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC0362w(0, remoteAction));
                        }
                    }
                } else if (abstractC0253b instanceof C0257f) {
                    i9++;
                }
                i7++;
                i6 = 0;
            }
            i8 = i5;
            i7++;
            i6 = 0;
        }
        return true;
    }
}
