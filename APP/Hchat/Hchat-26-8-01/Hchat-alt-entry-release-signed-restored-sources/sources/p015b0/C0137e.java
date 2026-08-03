package p015b0;

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
import gg.AbstractC1416l;
import p372z.AbstractC6054b;
import p372z.AbstractC6057e;
import p372z.C6055c;
import p372z.C6056d;
import p372z.C6058f;
import p372z.C6060h;

/* JADX INFO: renamed from: b0.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0137e {

    /* JADX INFO: renamed from: a */
    public final C0139f f356a;

    /* JADX INFO: renamed from: b */
    public final C0131b f357b;

    /* JADX INFO: renamed from: c */
    public final C0131b f358c;

    /* JADX INFO: renamed from: d */
    public final View f359d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0137e(C0139f c0139f, C0131b c0131b, C0131b c0131b2, View view) {
        this.f356a = c0139f;
        this.f357b = c0131b;
        this.f358c = c0131b2;
        this.f359d = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX INFO: renamed from: a */
    public final boolean m713a(Menu menu) {
        int i9;
        C6055c c6055c = (C6055c) this.f357b.invoke();
        int i10 = 0;
        if (AbstractC1416l.m3825a(c6055c, null)) {
            return false;
        }
        menu.clear();
        ?? r2 = c6055c.f24520a;
        int size = r2.size();
        int i11 = 0;
        int i12 = 1;
        int i13 = 1;
        while (i11 < size) {
            AbstractC6054b abstractC6054b = (AbstractC6054b) r2.get(i11);
            if (abstractC6054b instanceof C6056d) {
                i9 = i12 + 1;
                Object obj = abstractC6054b.f24518a;
                final C6056d c6056d = (C6056d) abstractC6054b;
                MenuItem menuItemAdd = menu.add(i13, AbstractC1416l.m3825a(obj, AbstractC6057e.f24524a) ? R.id.cut : AbstractC1416l.m3825a(obj, AbstractC6057e.f24525b) ? R.id.copy : AbstractC1416l.m3825a(obj, AbstractC6057e.f24526c) ? R.id.paste : AbstractC1416l.m3825a(obj, AbstractC6057e.f24527d) ? R.id.selectAll : AbstractC1416l.m3825a(obj, AbstractC6057e.f24528e) ? R.id.autofill : i12, i12, c6056d.f24521b);
                menuItemAdd.setShowAsAction(2);
                final int i14 = 0;
                menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: b0.d
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                        switch (i14) {
                            case 0:
                                ((C6056d) c6056d).f24523d.invoke(((C0137e) this).f356a);
                                break;
                            default:
                                Context context = (Context) c6056d;
                                TextClassification textClassification = (TextClassification) this;
                                String text = textClassification.getText();
                                PendingIntent activity = PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592);
                                if (Build.VERSION.SDK_INT < 34) {
                                    activity.send();
                                } else {
                                    try {
                                        activity.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
                                    } catch (PendingIntent.CanceledException e6) {
                                        Log.e("TextClassification", "error sending pendingIntent: " + activity + " error: " + e6);
                                        return true;
                                    }
                                }
                                break;
                        }
                        return true;
                    }
                });
            } else {
                if (abstractC6054b instanceof C6060h) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        i9 = i12 + 1;
                        final Context context = this.f359d.getContext();
                        C6060h c6060h = (C6060h) abstractC6054b;
                        final TextClassification textClassification = c6060h.f24530b;
                        int i15 = c6060h.f24531c;
                        if (i15 < 0) {
                            MenuItem menuItemAdd2 = menu.add(R.id.textAssist, R.id.textAssist, i12, textClassification.getLabel());
                            menuItemAdd2.setShowAsAction(2);
                            menuItemAdd2.setIcon(textClassification.getIcon());
                            final int i16 = 1;
                            menuItemAdd2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: b0.d
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // android.view.MenuItem.OnMenuItemClickListener
                                public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                                    switch (i16) {
                                        case 0:
                                            ((C6056d) context).f24523d.invoke(((C0137e) textClassification).f356a);
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
                                                } catch (PendingIntent.CanceledException e6) {
                                                    Log.e("TextClassification", "error sending pendingIntent: " + activity + " error: " + e6);
                                                    return true;
                                                }
                                            }
                                            break;
                                    }
                                    return true;
                                }
                            });
                        } else {
                            int i17 = i15 == 0 ? 1 : i10;
                            final RemoteAction remoteAction = (RemoteAction) textClassification.getActions().get(i15);
                            MenuItem menuItemAdd3 = menu.add(R.id.textAssist, i17 != 0 ? 16908353 : i10, i12, remoteAction.getTitle());
                            menuItemAdd3.setShowAsAction(i17 == 0 ? 0 : 2);
                            if (i17 != 0 || remoteAction.shouldShowIcon()) {
                                menuItemAdd3.setIcon(remoteAction.getIcon().loadDrawable(context));
                            }
                            menuItemAdd3.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: b0.f0
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // android.view.MenuItem.OnMenuItemClickListener
                                public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                                    PendingIntent actionIntent = remoteAction.getActionIntent();
                                    if (Build.VERSION.SDK_INT < 34) {
                                        actionIntent.send();
                                        return true;
                                    }
                                    try {
                                        actionIntent.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
                                    } catch (PendingIntent.CanceledException e6) {
                                        Log.e("TextClassification", "error sending pendingIntent: " + actionIntent + " error: " + e6);
                                    }
                                    return true;
                                }
                            });
                        }
                    }
                } else if (abstractC6054b instanceof C6058f) {
                    i13++;
                }
                i11++;
                i10 = 0;
            }
            i12 = i9;
            i11++;
            i10 = 0;
        }
        return true;
    }
}
