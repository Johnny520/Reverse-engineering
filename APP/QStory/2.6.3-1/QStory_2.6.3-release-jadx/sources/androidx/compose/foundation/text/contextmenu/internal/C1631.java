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
import kotlin.jvm.internal.AbstractC5227;
import p137.AbstractC8215;
import p137.AbstractC8218;
import p137.C8214;
import p137.C8216;
import p137.C8217;
import p137.C8220;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1631 implements InterfaceC1630 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final View f2607;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C1635 f2608;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1635 f2609;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1650 f2610;

    public C1631(C1650 c1650, C1635 c1635, C1635 c16352, View view) {
        this.f2610 = c1650;
        this.f2609 = c1635;
        this.f2608 = c16352;
        this.f2607 = view;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m2185(Menu menu) {
        int i;
        C8217 c8217 = (C8217) this.f2609.invoke();
        final int i2 = 0;
        if (AbstractC5227.m9466(c8217, null)) {
            return false;
        }
        menu.clear();
        List list = c8217.f20379;
        int size = list.size();
        final int i3 = 1;
        int i4 = 0;
        int i5 = 1;
        int i6 = 1;
        while (i4 < size) {
            AbstractC8218 abstractC8218 = (AbstractC8218) list.get(i4);
            if (abstractC8218 instanceof C8216) {
                i = i5 + 1;
                Object obj = abstractC8218.f20380;
                final C8216 c8216 = (C8216) abstractC8218;
                MenuItem menuItemAdd = menu.add(i6, AbstractC5227.m9466(obj, AbstractC8215.f20374) ? R.id.cut : AbstractC5227.m9466(obj, AbstractC8215.f20373) ? R.id.copy : AbstractC5227.m9466(obj, AbstractC8215.f20372) ? R.id.paste : AbstractC5227.m9466(obj, AbstractC8215.f20371) ? R.id.selectAll : AbstractC5227.m9466(obj, AbstractC8215.f20370) ? R.id.autofill : i5, i5, c8216.f20377);
                menuItemAdd.setShowAsAction(2);
                menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪世兰苏哲
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                        int i7 = i2;
                        Object obj2 = this;
                        Object obj3 = c8216;
                        switch (i7) {
                            case 0:
                                ((C8216) obj3).f20375.invoke(((C1631) obj2).f2610);
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
                if (abstractC8218 instanceof C8220) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        i = i5 + 1;
                        final Context context = this.f2607.getContext();
                        C8220 c8220 = (C8220) abstractC8218;
                        final TextClassification textClassification = c8220.f20383;
                        int i7 = c8220.f20382;
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
                                            ((C8216) obj3).f20375.invoke(((C1631) obj2).f2610);
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
                } else if (abstractC8218 instanceof C8214) {
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
