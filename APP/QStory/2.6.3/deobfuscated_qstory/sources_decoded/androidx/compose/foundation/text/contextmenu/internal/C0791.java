package androidx.compose.foundation.text.contextmenu.internal;

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
import java.util.List;
import kotlin.jvm.internal.AbstractC4395;
import p121.AbstractC7386;
import p121.AbstractC7389;
import p121.C7385;
import p121.C7387;
import p121.C7388;
import p121.C7391;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0791 implements InterfaceC0790 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final View f2262;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C0795 f2263;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0795 f2264;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0810 f2265;

    public C0791(C0810 c0810, C0795 c0795, C0795 c07952, View view) {
        this.f2265 = c0810;
        this.f2264 = c0795;
        this.f2263 = c07952;
        this.f2262 = view;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m1625(Menu menu) {
        int i;
        C7388 c7388 = (C7388) this.f2264.invoke();
        final int i2 = 0;
        if (AbstractC4395.m8907(c7388, null)) {
            return false;
        }
        menu.clear();
        List list = c7388.f20034;
        int size = list.size();
        final int i3 = 1;
        int i4 = 0;
        int i5 = 1;
        int i6 = 1;
        while (i4 < size) {
            AbstractC7389 abstractC7389 = (AbstractC7389) list.get(i4);
            if (abstractC7389 instanceof C7387) {
                i = i5 + 1;
                Object obj = abstractC7389.f20035;
                final C7387 c7387 = (C7387) abstractC7389;
                MenuItem menuItemAdd = menu.add(i6, AbstractC4395.m8907(obj, AbstractC7386.f20029) ? R.id.cut : AbstractC4395.m8907(obj, AbstractC7386.f20028) ? R.id.copy : AbstractC4395.m8907(obj, AbstractC7386.f20027) ? R.id.paste : AbstractC4395.m8907(obj, AbstractC7386.f20026) ? R.id.selectAll : AbstractC4395.m8907(obj, AbstractC7386.f20025) ? R.id.autofill : i5, i5, c7387.f20032);
                menuItemAdd.setShowAsAction(2);
                menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪世兰苏哲
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                        int i7 = i2;
                        Object obj2 = this;
                        Object obj3 = c7387;
                        switch (i7) {
                            case 0:
                                ((C7387) obj3).f20030.invoke(((C0791) obj2).f2265);
                                break;
                            default:
                                Context context = (Context) obj3;
                                TextClassification textClassification = (TextClassification) obj2;
                                String text = textClassification.getText();
                                PendingIntent activity = PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592);
                                if (Build.VERSION.SDK_INT < 34) {
                                    activity.send();
                                } else {
                                    try {
                                        activity.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
                                    } catch (PendingIntent.CanceledException e) {
                                        Log.e("TextClassification", "error sending pendingIntent: " + activity + " error: " + e);
                                    }
                                }
                                break;
                        }
                        return true;
                    }
                });
            } else {
                if (abstractC7389 instanceof C7391) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        i = i5 + 1;
                        final Context context = this.f2262.getContext();
                        C7391 c7391 = (C7391) abstractC7389;
                        final TextClassification textClassification = c7391.f20038;
                        int i7 = c7391.f20037;
                        if (i7 < 0) {
                            MenuItem menuItemAdd2 = menu.add(R.id.textAssist, R.id.textAssist, i5, textClassification.getLabel());
                            menuItemAdd2.setShowAsAction(2);
                            menuItemAdd2.setIcon(textClassification.getIcon());
                            menuItemAdd2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪世兰苏哲
                                @Override // android.view.MenuItem.OnMenuItemClickListener
                                public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                                    int i72 = i3;
                                    Object obj2 = textClassification;
                                    Object obj3 = context;
                                    switch (i72) {
                                        case 0:
                                            ((C7387) obj3).f20030.invoke(((C0791) obj2).f2265);
                                            break;
                                        default:
                                            Context context2 = (Context) obj3;
                                            TextClassification textClassification2 = (TextClassification) obj2;
                                            String text = textClassification2.getText();
                                            PendingIntent activity = PendingIntent.getActivity(context2, text != null ? text.hashCode() : 0, textClassification2.getIntent(), 201326592);
                                            if (Build.VERSION.SDK_INT < 34) {
                                                activity.send();
                                            } else {
                                                try {
                                                    activity.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
                                                } catch (PendingIntent.CanceledException e) {
                                                    Log.e("TextClassification", "error sending pendingIntent: " + activity + " error: " + e);
                                                }
                                            }
                                            break;
                                    }
                                    return true;
                                }
                            });
                        } else {
                            int i8 = i7 == 0 ? 1 : i2;
                            final RemoteAction remoteAction = (RemoteAction) textClassification.getActions().get(i7);
                            MenuItem menuItemAdd3 = menu.add(R.id.textAssist, i8 != 0 ? 16908353 : i2, i5, remoteAction.getTitle());
                            menuItemAdd3.setShowAsAction(i8 == 0 ? 0 : 2);
                            if (i8 != 0 || remoteAction.shouldShowIcon()) {
                                menuItemAdd3.setIcon(remoteAction.getIcon().loadDrawable(context));
                            }
                            menuItemAdd3.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子世楪兰苏哲
                                @Override // android.view.MenuItem.OnMenuItemClickListener
                                public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                                    PendingIntent actionIntent = remoteAction.getActionIntent();
                                    if (Build.VERSION.SDK_INT < 34) {
                                        actionIntent.send();
                                        return true;
                                    }
                                    try {
                                        actionIntent.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
                                    } catch (PendingIntent.CanceledException e) {
                                        Log.e("TextClassification", "error sending pendingIntent: " + actionIntent + " error: " + e);
                                    }
                                    return true;
                                }
                            });
                        }
                    }
                } else if (abstractC7389 instanceof C7385) {
                    i6++;
                }
                i4++;
                i2 = 0;
            }
            i5 = i;
            i4++;
            i2 = 0;
        }
        return true;
    }
}
