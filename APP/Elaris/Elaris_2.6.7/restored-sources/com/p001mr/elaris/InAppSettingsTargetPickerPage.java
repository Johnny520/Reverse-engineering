package com.p001mr.elaris;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Space;
import android.widget.TextView;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p000.AbstractC0008a7;
import p000.AbstractC0260i5;
import p000.C0244h5;
import p000.C0298k8;
import p000.C0563z6;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
final class InAppSettingsTargetPickerPage {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private InAppSettingsTargetPickerPage() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void clearSelectedTroops(LinkedHashSet linkedHashSet, TextView textView, List list, Runnable[] runnableArr, View view) {
        linkedHashSet.clear();
        textView.setText("已选择 0 / " + list.size());
        runnableArr[0].run();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static View emptyPickerRow(InAppSettings inAppSettings) {
        TextView textViewText = inAppSettings.text("暂无匹配结果", 13, InAppSettings.SUB, 0);
        textViewText.setGravity(17);
        textViewText.setPadding(0, inAppSettings.m139dp(26.0f), 0, inAppSettings.m139dp(26.0f));
        return textViewText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static View friendPickRow(InAppSettings inAppSettings, final C0244h5 c0244h5, final LinkedHashSet<String> linkedHashSet, final TextView textView, final int i, final Runnable runnable) {
        LinearLayout linearLayout = new LinearLayout(inAppSettings.activity);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setPadding(inAppSettings.m139dp(14.0f), inAppSettings.m139dp(6.0f), inAppSettings.m139dp(10.0f), inAppSettings.m139dp(6.0f));
        linearLayout.setMinimumHeight(inAppSettings.m139dp(56.0f));
        boolean zContains = linkedHashSet.contains(c0244h5.f348a);
        linearLayout.setBackground(inAppSettings.rowBackground());
        LinearLayout linearLayout2 = new LinearLayout(inAppSettings.activity);
        linearLayout2.setOrientation(1);
        String strM511a = c0244h5.f349b;
        if (strM511a.length() <= 0) {
            strM511a = c0244h5.m511a();
        }
        TextView textViewText = inAppSettings.text(strM511a, 14, zContains ? InAppSettings.BLUE : InAppSettings.TEXT, 1);
        TextView textViewText2 = inAppSettings.text(c0244h5.m511a(), 12, InAppSettings.SUB, 0);
        textViewText2.setPadding(0, inAppSettings.m139dp(4.0f), 0, 0);
        linearLayout2.addView(textViewText);
        linearLayout2.addView(textViewText2);
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView textViewText3 = inAppSettings.text(zContains ? "✓" : "", 12, InAppSettings.BLUE, 1);
        textViewText3.setGravity(17);
        textViewText3.setBackground(inAppSettings.checkCircleDrawable(zContains));
        linearLayout.addView(textViewText3, new LinearLayout.LayoutParams(inAppSettings.m139dp(24.0f), inAppSettings.m139dp(24.0f)));
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.mr.elaris.InAppSettingsTargetPickerPage.20
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                boolean zContains2 = linkedHashSet.contains(c0244h5.f348a);
                LinkedHashSet linkedHashSet2 = linkedHashSet;
                if (zContains2) {
                    linkedHashSet2.remove(c0244h5.f348a);
                } else {
                    linkedHashSet2.add(c0244h5.f348a);
                }
                TextView textView2 = textView;
                if (textView2 != null) {
                    textView2.setText("已选择 " + linkedHashSet.size() + " / " + i);
                }
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        return linearLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void invertSelectedTroops(List list, LinkedHashSet linkedHashSet, TextView textView, Runnable[] runnableArr, View view) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0563z6 c0563z6 = (C0563z6) it.next();
            boolean zContains = linkedHashSet.contains(c0563z6.f1138a);
            String str = c0563z6.f1138a;
            if (zContains) {
                linkedHashSet.remove(str);
            } else {
                linkedHashSet.add(str);
            }
        }
        textView.setText("已选择 " + linkedHashSet.size() + " / " + list.size());
        runnableArr[0].run();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static TextView linkButton(InAppSettings inAppSettings, String str) {
        int i = InAppSettings.BLUE;
        TextView textViewText = inAppSettings.text(str, 14, i, 1);
        textViewText.setGravity(17);
        textViewText.setPadding(inAppSettings.m139dp(12.0f), inAppSettings.m139dp(7.0f), inAppSettings.m139dp(12.0f), inAppSettings.m139dp(7.0f));
        textViewText.setBackground(inAppSettings.roundWithStroke(inAppSettings.mixForSurface(i, 0.93f), inAppSettings.m139dp(15.0f), inAppSettings.mixForSurface(i, 0.75f), 1));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, inAppSettings.m139dp(36.0f));
        layoutParams.rightMargin = inAppSettings.m139dp(8.0f);
        textViewText.setLayoutParams(layoutParams);
        return textViewText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void mergeSelectedFriendPlaceholders(List<C0244h5> list, LinkedHashSet<String> linkedHashSet) {
        if (list == null || linkedHashSet == null) {
            return;
        }
        for (String str : linkedHashSet) {
            Iterator<C0244h5> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    C0244h5 next = it.next();
                    if (next == null || !str.equals(next.f348a)) {
                    }
                } else if (AbstractC0260i5.m534H0(str)) {
                    list.add(new C0244h5(str, "已选好友", ""));
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void refreshFriendPickerRows(InAppSettings inAppSettings, LinearLayout linearLayout, ArrayList arrayList, LinkedHashSet linkedHashSet, TextView textView, List list, Runnable[] runnableArr) {
        linearLayout.removeAllViews();
        if (arrayList.isEmpty()) {
            linearLayout.addView(emptyPickerRow(inAppSettings));
        } else {
            Iterator it = arrayList.iterator();
            boolean z = true;
            while (it.hasNext()) {
                if (!z) {
                    linearLayout.addView(inAppSettings.divider());
                }
                z = false;
                InAppSettings inAppSettings2 = inAppSettings;
                linearLayout.addView(friendPickRow(inAppSettings2, (C0244h5) it.next(), linkedHashSet, textView, list.size(), runnableArr[0]));
                inAppSettings = inAppSettings2;
            }
        }
        updatePickerListHeight(inAppSettings, linearLayout, Math.max(1, arrayList.size()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void refreshTroopPickerRows(InAppSettings inAppSettings, LinearLayout linearLayout, ArrayList arrayList, LinkedHashSet linkedHashSet, TextView textView, List list, Runnable[] runnableArr) {
        linearLayout.removeAllViews();
        if (arrayList.isEmpty()) {
            linearLayout.addView(emptyPickerRow(inAppSettings));
        } else {
            Iterator it = arrayList.iterator();
            boolean z = true;
            while (it.hasNext()) {
                if (!z) {
                    linearLayout.addView(inAppSettings.divider());
                }
                z = false;
                InAppSettings inAppSettings2 = inAppSettings;
                linearLayout.addView(troopPickRow(inAppSettings2, (C0563z6) it.next(), linkedHashSet, textView, list.size(), runnableArr[0]));
                inAppSettings = inAppSettings2;
            }
        }
        updatePickerListHeight(inAppSettings, linearLayout, Math.max(1, arrayList.size()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void saveFriendPickerSelection(InAppSettings inAppSettings, LinkedHashSet linkedHashSet, TextView textView, TextView textView2, List list, AlertDialog alertDialog, View view) {
        ArrayList<C0298k8> arrayListM217n = AbstractC0152f.m217n(inAppSettings.getKeepFireTargets());
        ArrayList arrayList = new ArrayList();
        for (C0298k8 c0298k8 : arrayListM217n) {
            if (c0298k8 != null && c0298k8.f497a == 2) {
                arrayList.add(c0298k8);
            }
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (AbstractC0260i5.m534H0(str)) {
                arrayList.add(new C0298k8(str, 1));
            }
        }
        String strM213j = AbstractC0152f.m213j(arrayList);
        AbstractC0152f.m223t(strM213j);
        AbstractC0152f.m224u();
        if (textView != null) {
            textView.setText(AbstractC0152f.m229z());
        }
        if (textView2 != null) {
            textView2.setText(inAppSettings.selectedTargetsCompactPreview(AbstractC0152f.m217n(strM213j), AbstractC0008a7.m56m(), list));
        }
        alertDialog.dismiss();
        inAppSettings.toast("已选择 " + linkedHashSet.size() + " 个好友");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void saveTroopPickerSelection(InAppSettings inAppSettings, LinkedHashSet linkedHashSet, TextView textView, TextView textView2, List list, AlertDialog alertDialog, boolean z, View view) {
        StringBuilder sb = new StringBuilder();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (sb.length() > 0) {
                sb.append('\n');
            }
            sb.append(str);
        }
        String strM68y = AbstractC0008a7.m68y(sb.toString());
        if (z) {
            ArrayList<C0298k8> arrayListM217n = AbstractC0152f.m217n(inAppSettings.getKeepFireTargets());
            ArrayList arrayList = new ArrayList();
            for (C0298k8 c0298k8 : arrayListM217n) {
                if (c0298k8 != null && c0298k8.f497a == 1) {
                    arrayList.add(c0298k8);
                }
            }
            Iterator it2 = AbstractC0008a7.m64u(strM68y).iterator();
            while (it2.hasNext()) {
                arrayList.add(new C0298k8((String) it2.next(), 2));
            }
            AbstractC0152f.m223t(AbstractC0152f.m213j(arrayList));
            AbstractC0152f.m224u();
        } else {
            String strM68y2 = AbstractC0008a7.m68y(strM68y);
            try {
                HookEntry.setRuntimeString(Prefs.KEY_CLOCK_IN_GROUPS, strM68y2);
                Context contextM48e = AbstractC0008a7.m48e();
                if (contextM48e != null) {
                    contextM48e.getSharedPreferences(Prefs.PREFS_NAME, 0).edit().putString(Prefs.KEY_CLOCK_IN_GROUPS, strM68y2).putLong(Prefs.KEY_CONFIG_VERSION, System.currentTimeMillis()).apply();
                }
            } catch (Throwable unused) {
            }
        }
        if (textView != null) {
            textView.setText(z ? AbstractC0152f.m229z() : inAppSettings.clockInCountText());
        }
        if (textView2 != null) {
            textView2.setText(z ? inAppSettings.keepFireTargetsCompactPreview() : inAppSettings.selectedGroupsPreview(AbstractC0008a7.m64u(strM68y), list));
        }
        alertDialog.dismiss();
        inAppSettings.toast("已选择 " + linkedHashSet.size() + " 个群");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void selectAllTroops(LinkedHashSet linkedHashSet, List list, TextView textView, Runnable[] runnableArr, View view) {
        linkedHashSet.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((C0563z6) it.next()).f1138a);
        }
        textView.setText("已选择 " + linkedHashSet.size() + " / " + list.size());
        runnableArr[0].run();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void showFriendPicker(final InAppSettings inAppSettings, final TextView textView, final TextView textView2) {
        final ArrayList arrayList = new ArrayList();
        final LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C0298k8 c0298k8 : AbstractC0152f.m217n(inAppSettings.getKeepFireTargets())) {
            if (c0298k8.f497a == 1) {
                linkedHashSet.add(c0298k8.f498b);
            }
        }
        mergeSelectedFriendPlaceholders(arrayList, linkedHashSet);
        final ArrayList arrayList2 = new ArrayList(arrayList);
        final String[] strArr = {""};
        LinearLayout linearLayout = new LinearLayout(inAppSettings.activity);
        linearLayout.setOrientation(1);
        linearLayout.setTag("elaris_dialog_surface");
        linearLayout.setPadding(inAppSettings.m139dp(18.0f), inAppSettings.m139dp(14.0f), inAppSettings.m139dp(18.0f), inAppSettings.m139dp(12.0f));
        linearLayout.setBackground(inAppSettings.dialogPanel());
        LinearLayout linearLayout2 = new LinearLayout(inAppSettings.activity);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        TextView textViewText = inAppSettings.text("选择好友", 20, InAppSettings.TEXT, 1);
        textViewText.setPadding(inAppSettings.m139dp(2.0f), 0, 0, 0);
        linearLayout2.addView(textViewText, new LinearLayout.LayoutParams(0, -2, 1.0f));
        final TextView textViewText2 = inAppSettings.text("正在加载好友...", 13, InAppSettings.SUB, 0);
        textViewText2.setGravity(5);
        linearLayout2.addView(textViewText2, new LinearLayout.LayoutParams(-2, -2));
        linearLayout.addView(linearLayout2);
        EditText editTextInput = inAppSettings.input("搜索好友昵称或 QQ号/UID", "");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, inAppSettings.m139dp(40.0f));
        layoutParams.topMargin = inAppSettings.m139dp(10.0f);
        linearLayout.addView(editTextInput, layoutParams);
        ScrollView scrollView = new ScrollView(inAppSettings.activity);
        scrollView.setOverScrollMode(2);
        scrollView.setClipToPadding(false);
        scrollView.setVerticalFadingEdgeEnabled(true);
        scrollView.setFadingEdgeLength(inAppSettings.m139dp(16.0f));
        scrollView.setBackground(inAppSettings.roundWithStroke(InAppSettings.CARD, inAppSettings.m139dp(16.0f), InAppSettings.STROKE, 1));
        final LinearLayout linearLayout3 = new LinearLayout(inAppSettings.activity);
        linearLayout3.setOrientation(1);
        scrollView.addView(linearLayout3, new FrameLayout.LayoutParams(-1, -2));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, inAppSettings.m139dp(96.0f));
        layoutParams2.topMargin = inAppSettings.m139dp(10.0f);
        linearLayout.addView(scrollView, layoutParams2);
        final Runnable[] runnableArr = new Runnable[1];
        runnableArr[0] = new Runnable() { // from class: com.mr.elaris.InAppSettingsTargetPickerPage.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.lang.Runnable
            public void run() {
                InAppSettingsTargetPickerPage.refreshFriendPickerRows(inAppSettings, linearLayout3, arrayList2, linkedHashSet, textViewText2, arrayList, runnableArr);
            }
        };
        final Runnable[] runnableArr2 = {new Runnable() { // from class: com.mr.elaris.InAppSettingsTargetPickerPage.2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.lang.Runnable
            public void run() {
                String str = strArr[0];
                if (str == null) {
                    str = "";
                }
                arrayList2.clear();
                for (C0244h5 c0244h5 : arrayList) {
                    if (str.length() != 0) {
                        if ((c0244h5.f349b + " " + c0244h5.f350c + " " + c0244h5.f348a).toLowerCase(Locale.ROOT).contains(str)) {
                        }
                    }
                    arrayList2.add(c0244h5);
                }
                runnableArr[0].run();
            }
        }};
        runnableArr[0].run();
        editTextInput.addTextChangedListener(new TextWatcher() { // from class: com.mr.elaris.InAppSettingsTargetPickerPage.3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                strArr[0] = charSequence == null ? "" : charSequence.toString().trim().toLowerCase(Locale.ROOT);
                runnableArr2[0].run();
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        LinearLayout linearLayout4 = new LinearLayout(inAppSettings.activity);
        linearLayout4.setOrientation(0);
        linearLayout4.setPadding(0, inAppSettings.m139dp(8.0f), 0, inAppSettings.m139dp(10.0f));
        TextView textViewLinkButton = linkButton(inAppSettings, "全选");
        TextView textViewLinkButton2 = linkButton(inAppSettings, "清空");
        TextView textViewLinkButton3 = linkButton(inAppSettings, "反选");
        textViewLinkButton.setOnClickListener(new View.OnClickListener() { // from class: com.mr.elaris.InAppSettingsTargetPickerPage.4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                linkedHashSet.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(((C0244h5) it.next()).f348a);
                }
                textViewText2.setText("已选择 " + linkedHashSet.size() + " / " + arrayList.size());
                runnableArr[0].run();
            }
        });
        textViewLinkButton2.setOnClickListener(new View.OnClickListener() { // from class: com.mr.elaris.InAppSettingsTargetPickerPage.5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                linkedHashSet.clear();
                textViewText2.setText("已选择 0 / " + arrayList.size());
                runnableArr[0].run();
            }
        });
        textViewLinkButton3.setOnClickListener(new View.OnClickListener() { // from class: com.mr.elaris.InAppSettingsTargetPickerPage.6
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                for (C0244h5 c0244h5 : arrayList) {
                    LinkedHashSet linkedHashSet2 = linkedHashSet;
                    String str = c0244h5.f348a;
                    String str2 = c0244h5.f348a;
                    boolean zContains = linkedHashSet2.contains(str);
                    LinkedHashSet linkedHashSet3 = linkedHashSet;
                    if (zContains) {
                        linkedHashSet3.remove(str2);
                    } else {
                        linkedHashSet3.add(str2);
                    }
                }
                textViewText2.setText("已选择 " + linkedHashSet.size() + " / " + arrayList.size());
                runnableArr[0].run();
            }
        });
        linearLayout4.addView(textViewLinkButton);
        linearLayout4.addView(textViewLinkButton2);
        linearLayout4.addView(textViewLinkButton3);
        linearLayout.addView(linearLayout4);
        LinearLayout linearLayout5 = new LinearLayout(inAppSettings.activity);
        linearLayout5.setGravity(21);
        TextView textViewDialogButton = inAppSettings.dialogButton("取消", false);
        TextView textViewDialogButton2 = inAppSettings.dialogButton("保存", true);
        linearLayout5.addView(textViewDialogButton, new LinearLayout.LayoutParams(inAppSettings.m139dp(96.0f), inAppSettings.m139dp(40.0f)));
        linearLayout5.addView(new Space(inAppSettings.activity), new LinearLayout.LayoutParams(inAppSettings.m139dp(10.0f), 1));
        linearLayout5.addView(textViewDialogButton2, new LinearLayout.LayoutParams(inAppSettings.m139dp(96.0f), inAppSettings.m139dp(40.0f)));
        linearLayout.addView(linearLayout5);
        final AlertDialog alertDialogCreate = new AlertDialog.Builder(inAppSettings.activity).create();
        alertDialogCreate.setView(linearLayout, 0, 0, 0, 0);
        alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.mr.elaris.InAppSettingsTargetPickerPage.7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.content.DialogInterface.OnShowListener
            public void onShow(DialogInterface dialogInterface) {
                inAppSettings.applyDialogWindowStyle(alertDialogCreate);
            }
        });
        textViewDialogButton.setOnClickListener(new View.OnClickListener() { // from class: com.mr.elaris.InAppSettingsTargetPickerPage.8
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                alertDialogCreate.dismiss();
            }
        });
        textViewDialogButton2.setOnClickListener(new View.OnClickListener() { // from class: com.mr.elaris.InAppSettingsTargetPickerPage.9
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InAppSettingsTargetPickerPage.saveFriendPickerSelection(inAppSettings, linkedHashSet, textView, textView2, arrayList, alertDialogCreate, view);
            }
        });
        final boolean[] zArr = {false};
        final Runnable runnable = new Runnable() { // from class: com.mr.elaris.InAppSettingsTargetPickerPage.10
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.lang.Runnable
            public void run() {
                boolean[] zArr2 = zArr;
                if (zArr2[0]) {
                    return;
                }
                zArr2[0] = true;
                alertDialogCreate.show();
                inAppSettings.applyDialogWindowStyle(alertDialogCreate);
            }
        };
        new Handler(Looper.getMainLooper()).postDelayed(runnable, 600L);
        new Thread(new Runnable() { // from class: com.mr.elaris.InAppSettingsTargetPickerPage.11
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Multi-variable search result rejected for r18v6, resolved type: boolean */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:157:0x02b2  */
            /* JADX WARN: Removed duplicated region for block: B:158:0x02b4  */
            /* JADX WARN: Removed duplicated region for block: B:177:0x036a  */
            /* JADX WARN: Removed duplicated region for block: B:205:0x0419  */
            /* JADX WARN: Removed duplicated region for block: B:305:0x0604  */
            /* JADX WARN: Removed duplicated region for block: B:308:0x060b  */
            /* JADX WARN: Removed duplicated region for block: B:311:0x0620  */
            /* JADX WARN: Removed duplicated region for block: B:337:0x029b A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:405:0x03d6 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:411:0x02ab A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:47:0x00b6  */
            /* JADX WARN: Removed duplicated region for block: B:70:0x0105  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void run() throws IllegalAccessException, InvocationTargetException {
                ClassLoader classLoader;
                Class<?> cls;
                Object objM657t1;
                String[] strArr2;
                int i;
                Object objInvoke;
                int size;
                ArrayList arrayList3;
                ArrayList arrayListM650r0;
                Object[] enumConstants;
                Class<?>[] clsArr;
                String strM569T;
                int i2;
                Method declaredMethod;
                Object objInvoke2;
                Object objM631l;
                Class<?> cls2;
                Method method;
                Context contextHostContext;
                Activity activity = inAppSettings.activity;
                if (activity != null) {
                    try {
                        classLoader = activity.getClassLoader();
                    } catch (Throwable unused) {
                        classLoader = null;
                    }
                } else {
                    classLoader = null;
                }
                ArrayList arrayList4 = AbstractC0260i5.f382c;
                if (arrayList4 == null || arrayList4.isEmpty() || System.currentTimeMillis() - AbstractC0260i5.f381b >= 60000) {
                    try {
                        contextHostContext = HookEntry.hostContext();
                    } catch (Throwable unused2) {
                    }
                    ClassLoader classLoader2 = contextHostContext != null ? contextHostContext.getClassLoader() : AbstractC0260i5.class.getClassLoader();
                    if (classLoader2 == null) {
                        classLoader2 = classLoader;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (classLoader2 == null) {
                        AbstractC0260i5.m582X0("classLoader null");
                        arrayListM650r0 = new ArrayList();
                    } else {
                        Object objM631l2 = AbstractC0260i5.m631l(classLoader2);
                        int i3 = 0;
                        if (objM631l2 == null) {
                            HookEntry.logAlways("friend-list kernel skipped reason=runtime null");
                        } else {
                            HookEntry.logAlways("friend-list kernel runtime=".concat(objM631l2.getClass().getName()));
                            try {
                                cls = Class.forName("com.tencent.qqnt.kernel.api.IKernelService", false, classLoader2);
                            } catch (Throwable unused3) {
                                cls = null;
                            }
                            int i4 = 2;
                            if (cls != null) {
                                Class<?>[] clsArr2 = {Class.class, String.class};
                                for (Class<?> superclass = objM631l2.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
                                    try {
                                        declaredMethod = superclass.getDeclaredMethod("getRuntimeService", clsArr2);
                                        declaredMethod.setAccessible(true);
                                        break;
                                    } catch (Throwable unused4) {
                                    }
                                }
                                declaredMethod = null;
                                if (declaredMethod != null) {
                                    try {
                                        declaredMethod.setAccessible(true);
                                        objM657t1 = declaredMethod.invoke(objM631l2, cls, "");
                                    } catch (Throwable unused5) {
                                    }
                                    if (objM657t1 == null) {
                                        for (Method method2 : AbstractC0260i5.m628k(objM631l2.getClass())) {
                                            Class<?>[] parameterTypes = method2.getParameterTypes();
                                            if (parameterTypes.length == 2 && parameterTypes[0] == Class.class && parameterTypes[1] == String.class) {
                                                method2.setAccessible(true);
                                                objInvoke2 = method2.invoke(objM631l2, cls, "");
                                                if (objInvoke2 != null) {
                                                    objM657t1 = objInvoke2;
                                                    break;
                                                }
                                            } else if (parameterTypes.length == 1 && parameterTypes[0] == Class.class) {
                                                method2.setAccessible(true);
                                                objInvoke2 = method2.invoke(objM631l2, cls);
                                                if (objInvoke2 != null) {
                                                    objM657t1 = objInvoke2;
                                                    break;
                                                }
                                            }
                                        }
                                        objM657t1 = null;
                                    }
                                    if (objM657t1 == null) {
                                        objM657t1 = AbstractC0260i5.m657t1(classLoader2, "com.tencent.qqnt.kernel.api.IKernelService");
                                        if (objM657t1 == null && (objM657t1 = AbstractC0260i5.m661v(AbstractC0260i5.m617g2(objM631l2), "getKernelService")) == null) {
                                            objM657t1 = AbstractC0260i5.m661v(objM631l2, "getKernelService");
                                        }
                                    }
                                    if (objM657t1 == null) {
                                        HookEntry.logAlways("friend-list kernel skipped reason=kernel service null runtime=".concat(objM631l2.getClass().getName()));
                                    } else {
                                        HookEntry.logAlways("friend-list kernel service=".concat(objM657t1.getClass().getName()));
                                    }
                                    Object objM661v = AbstractC0260i5.m661v(objM657t1, "getBuddyService");
                                    if (objM661v == null && (objM661v = AbstractC0260i5.m661v(objM657t1, "getBuddyListService")) == null) {
                                        objM661v = AbstractC0260i5.m661v(objM657t1, "getRelationService");
                                    }
                                    if (objM661v == null) {
                                        objM661v = AbstractC0260i5.m661v(AbstractC0260i5.m617g2(objM631l2), "getBuddyService");
                                    }
                                    Object obj = objM661v;
                                    if (obj == null) {
                                        HookEntry.logAlways("friend-list kernel skipped reason=buddy service null".concat(objM657t1 != null ? ", kernel=".concat(objM657t1.getClass().getName()) : ""));
                                    } else {
                                        HookEntry.logAlways("friend-list kernel buddy=".concat(obj.getClass().getName()));
                                        String strM515B = AbstractC0260i5.m515B(AbstractC0260i5.m653s0(AbstractC0260i5.m664w(objM631l2, "getCurrentAccountUid"), AbstractC0260i5.m664w(objM631l2, "getCurrentAccountUin"), AbstractC0260i5.m664w(objM631l2, "getAccount"), AbstractC0260i5.m664w(objM631l2, "getAccountUin"), AbstractC0260i5.m601c2(objM631l2, "currentUid", "currentUin", "mCurrentUid", "mCurrentUin", "account", "uin", "longAccountUin")));
                                        String[] strArr3 = strM515B.length() == 0 ? new String[]{""} : new String[]{strM515B, ""};
                                        String[] strArr4 = {"KNOMAL", "NOMAL", "NORMAL", "KLETTER", "LETTER", "ALL", "FRIEND", "BUDDY", ""};
                                        int length = strArr3.length;
                                        int i5 = 0;
                                        while (i5 < length) {
                                            String str = strArr3[i5];
                                            int i6 = i3;
                                            while (i6 < 9) {
                                                String str2 = strArr4[i6];
                                                for (Method method3 : AbstractC0260i5.m628k(obj.getClass())) {
                                                    i = i3;
                                                    if ("getBuddyListFromCache".equals(method3.getName())) {
                                                        Class<?>[] parameterTypes2 = method3.getParameterTypes();
                                                        if (parameterTypes2.length == i4 && parameterTypes2[i] == String.class) {
                                                            try {
                                                                method3.setAccessible(true);
                                                                Class<?> cls3 = parameterTypes2[1];
                                                                if (cls3 != null) {
                                                                    if (cls3 == String.class) {
                                                                        clsArr = parameterTypes2;
                                                                        strArr2 = strArr3;
                                                                        strM569T = str2 == null ? "" : str2;
                                                                    } else {
                                                                        if (cls3.isEnum() && (enumConstants = cls3.getEnumConstants()) != null && enumConstants.length != 0) {
                                                                            String str3 = str2 == null ? "" : str2;
                                                                            clsArr = parameterTypes2;
                                                                            int length2 = enumConstants.length;
                                                                            strArr2 = strArr3;
                                                                            int i7 = i;
                                                                            while (true) {
                                                                                if (i7 < length2) {
                                                                                    strM569T = enumConstants[i7];
                                                                                    if (strM569T != null) {
                                                                                        i2 = length2;
                                                                                        if (str3.equalsIgnoreCase(String.valueOf(strM569T))) {
                                                                                            break;
                                                                                        }
                                                                                    } else {
                                                                                        i2 = length2;
                                                                                    }
                                                                                    i7++;
                                                                                    length2 = i2;
                                                                                } else if (str3.length() == 0) {
                                                                                    strM569T = enumConstants[i];
                                                                                }
                                                                            }
                                                                        }
                                                                        strM569T = null;
                                                                    }
                                                                    if (strM569T != null) {
                                                                        try {
                                                                            if (!clsArr[1].isEnum()) {
                                                                                strM569T = AbstractC0260i5.m569T(clsArr[1]);
                                                                            }
                                                                        } catch (Throwable th) {
                                                                            th = th;
                                                                            StringBuilder sb = new StringBuilder("friend-list buddy cache invoke failed method=");
                                                                            StringBuilder sb2 = new StringBuilder();
                                                                            sb2.append(method3.getDeclaringClass().getName());
                                                                            sb2.append('#');
                                                                            sb2.append(method3.getName());
                                                                            sb2.append('(');
                                                                            Class<?>[] parameterTypes3 = method3.getParameterTypes();
                                                                            Throwable th2 = th;
                                                                            for (int i8 = i; i8 < parameterTypes3.length; i8++) {
                                                                                if (i8 > 0) {
                                                                                    sb2.append(',');
                                                                                }
                                                                                Class<?> cls4 = parameterTypes3[i8];
                                                                                sb2.append(cls4 == null ? "?" : cls4.getName());
                                                                            }
                                                                            sb2.append(')');
                                                                            sb.append(sb2.toString());
                                                                            sb.append(", error=");
                                                                            sb.append(th2.getClass().getSimpleName());
                                                                            sb.append(": ");
                                                                            sb.append(th2.getMessage());
                                                                            HookEntry.logAlways(sb.toString());
                                                                            i3 = i;
                                                                            strArr3 = strArr2;
                                                                            i4 = 2;
                                                                        }
                                                                    }
                                                                    objInvoke = method3.invoke(obj, str != null ? "" : str, strM569T);
                                                                    size = linkedHashMap.size();
                                                                    int i9 = i5;
                                                                    arrayList3 = new ArrayList();
                                                                    int i10 = i6;
                                                                    int i11 = length;
                                                                    Object obj2 = objInvoke;
                                                                    AbstractC0260i5.m539J(obj2, arrayList3, linkedHashMap, str, 0, Collections.newSetFromMap(new IdentityHashMap()));
                                                                    if (!arrayList3.isEmpty()) {
                                                                        LinkedHashMap linkedHashMapM646q = AbstractC0260i5.m646q(obj, "getBuddyRemark", arrayList3);
                                                                        LinkedHashMap linkedHashMapM646q2 = AbstractC0260i5.m646q(obj, "getBuddyNick", arrayList3);
                                                                        Iterator it = arrayList3.iterator();
                                                                        while (it.hasNext()) {
                                                                            String str4 = (String) it.next();
                                                                            int i12 = size;
                                                                            C0244h5 c0244h5 = (C0244h5) linkedHashMap.get(str4);
                                                                            LinkedHashMap linkedHashMap2 = linkedHashMapM646q;
                                                                            Iterator it2 = it;
                                                                            String str5 = str;
                                                                            AbstractC0260i5.m654s1(linkedHashMap, str4, AbstractC0260i5.m653s0((String) linkedHashMapM646q.get(str4), (String) linkedHashMapM646q2.get(str4), c0244h5 == null ? "" : c0244h5.f349b), c0244h5 == null ? "" : c0244h5.f350c);
                                                                            str = str5;
                                                                            size = i12;
                                                                            linkedHashMapM646q = linkedHashMap2;
                                                                            it = it2;
                                                                        }
                                                                    }
                                                                    String str6 = str;
                                                                    String str7 = "default";
                                                                    if (linkedHashMap.size() - size > 0) {
                                                                        StringBuilder sb3 = new StringBuilder("friend-list kernel cache hit account=");
                                                                        sb3.append((str6 == null || str6.length() == 0) ? "default" : str6);
                                                                        sb3.append(", reqType=");
                                                                        if (str2 != null && str2.length() != 0) {
                                                                            str7 = str2;
                                                                        }
                                                                        sb3.append(str7);
                                                                        sb3.append(", count=");
                                                                        sb3.append(linkedHashMap.size());
                                                                        HookEntry.logAlways(sb3.toString());
                                                                        arrayListM650r0 = AbstractC0260i5.m650r0(classLoader2, "kernel-buddy-cache", linkedHashMap);
                                                                    } else {
                                                                        int size2 = obj2 == null ? i : obj2 instanceof Collection ? ((Collection) obj2).size() : obj2 instanceof Map ? ((Map) obj2).size() : obj2.getClass().isArray() ? Array.getLength(obj2) : 1;
                                                                        if (size2 > 0) {
                                                                            StringBuilder sb4 = new StringBuilder("friend-list kernel cache ignored account=");
                                                                            sb4.append((str6 == null || str6.length() == 0) ? "default" : str6);
                                                                            sb4.append(", reqType=");
                                                                            if (str2 != null && str2.length() != 0) {
                                                                                str7 = str2;
                                                                            }
                                                                            sb4.append(str7);
                                                                            sb4.append(", rawSize=");
                                                                            sb4.append(size2);
                                                                            HookEntry.logAlways(sb4.toString());
                                                                        }
                                                                        i6 = i10 + 1;
                                                                        length = i11;
                                                                        i5 = i9;
                                                                        i3 = i;
                                                                        str = str6;
                                                                        strArr3 = strArr2;
                                                                        i4 = 2;
                                                                    }
                                                                }
                                                                clsArr = parameterTypes2;
                                                                strArr2 = strArr3;
                                                                strM569T = null;
                                                                if (strM569T != null) {
                                                                }
                                                                objInvoke = method3.invoke(obj, str != null ? "" : str, strM569T);
                                                                size = linkedHashMap.size();
                                                                int i92 = i5;
                                                                arrayList3 = new ArrayList();
                                                                int i102 = i6;
                                                                int i112 = length;
                                                                Object obj22 = objInvoke;
                                                                AbstractC0260i5.m539J(obj22, arrayList3, linkedHashMap, str, 0, Collections.newSetFromMap(new IdentityHashMap()));
                                                                if (!arrayList3.isEmpty()) {
                                                                }
                                                                String str62 = str;
                                                                String str72 = "default";
                                                                if (linkedHashMap.size() - size > 0) {
                                                                }
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                strArr2 = strArr3;
                                                            }
                                                        }
                                                    }
                                                    i3 = i;
                                                }
                                                strArr2 = strArr3;
                                                i = i3;
                                                objInvoke = null;
                                                size = linkedHashMap.size();
                                                int i922 = i5;
                                                arrayList3 = new ArrayList();
                                                int i1022 = i6;
                                                int i1122 = length;
                                                Object obj222 = objInvoke;
                                                AbstractC0260i5.m539J(obj222, arrayList3, linkedHashMap, str, 0, Collections.newSetFromMap(new IdentityHashMap()));
                                                if (!arrayList3.isEmpty()) {
                                                }
                                                String str622 = str;
                                                String str722 = "default";
                                                if (linkedHashMap.size() - size > 0) {
                                                }
                                            }
                                            i5++;
                                            i3 = i3;
                                            i4 = 2;
                                        }
                                    }
                                }
                            }
                        }
                        boolean z = i3;
                        String[] strArr5 = {"com.tencent.qqnt.ntrelation.friendsinfo.api.IQQFriendsInfoApi", "com.tencent.qqnt.ntrelation.friendsinfo.api.IFriendsInfoService", "com.tencent.qqnt.relation.api.IFriendListApi", "com.tencent.qqnt.relation.api.IFriendListRepoApi", "com.tencent.qqnt.relation.api.IFriendListService", "com.tencent.qqnt.relation.api.IRelationApi", "com.tencent.mobileqq.relation.api.IFriendListApi", "com.tencent.mobileqq.relation.api.IFriendListRepoApi", "com.tencent.mobileqq.relation.api.IRelationApi", "com.tencent.mobileqq.friend.api.IFriendListApi", "com.tencent.mobileqq.friend.api.IFriendDataService", "com.tencent.mobileqq.friend.api.IFriendHandlerService", "com.tencent.mobileqq.friend.api.IFriendService"};
                        int i13 = z ? 1 : 0;
                        while (true) {
                            if (i13 < 13) {
                                Object objM657t12 = AbstractC0260i5.m657t1(classLoader2, strArr5[i13]);
                                if (objM657t12 != null) {
                                    int size3 = linkedHashMap.size();
                                    AbstractC0260i5.m536I(objM657t12, linkedHashMap, true);
                                    if (linkedHashMap.size() > size3) {
                                        arrayListM650r0 = AbstractC0260i5.m650r0(classLoader2, "nt-friend-api", linkedHashMap);
                                        break;
                                    }
                                }
                                i13++;
                            } else {
                                Object objM631l3 = AbstractC0260i5.m631l(classLoader2);
                                if (objM631l3 == null) {
                                    objM631l = AbstractC0260i5.m631l(classLoader2);
                                    if (objM631l != null) {
                                        AbstractC0260i5.m582X0("all sources empty");
                                        arrayListM650r0 = new ArrayList();
                                    } else {
                                        int size4 = linkedHashMap.size();
                                        AbstractC0260i5.m536I(objM631l, linkedHashMap, false);
                                        if (linkedHashMap.size() > size4) {
                                            arrayListM650r0 = AbstractC0260i5.m650r0(classLoader2, "recent-c2c", linkedHashMap);
                                        }
                                    }
                                } else {
                                    Iterator it3 = AbstractC0260i5.m628k(objM631l3.getClass()).iterator();
                                    while (true) {
                                        boolean zHasNext = it3.hasNext();
                                        cls2 = Integer.TYPE;
                                        if (!zHasNext) {
                                            method = null;
                                            break;
                                        }
                                        method = (Method) it3.next();
                                        Class<?>[] parameterTypes4 = method.getParameterTypes();
                                        if ("getManager".equals(method.getName()) && parameterTypes4.length == 1 && parameterTypes4[z ? 1 : 0] == cls2) {
                                            try {
                                                method.setAccessible(true);
                                                break;
                                            } catch (Throwable unused6) {
                                            }
                                        }
                                    }
                                    if (method != null) {
                                        ArrayList<Integer> arrayList5 = new ArrayList();
                                        try {
                                            for (Field field : AbstractC0260i5.m625j(Class.forName("com.tencent.mobileqq.app.QQManagerFactory", z, classLoader2))) {
                                                String lowerCase = field.getName().toLowerCase(Locale.ROOT);
                                                if (lowerCase.contains("friend") || lowerCase.contains("contact") || lowerCase.contains("relation") || lowerCase.contains("buddy")) {
                                                    if (field.getType() == cls2 || field.getType() == Integer.class) {
                                                        field.setAccessible(true);
                                                        Object obj3 = field.get(null);
                                                        if ((obj3 instanceof Number) && !arrayList5.contains(Integer.valueOf(((Number) obj3).intValue()))) {
                                                            arrayList5.add(Integer.valueOf(((Number) obj3).intValue()));
                                                        }
                                                    }
                                                }
                                            }
                                        } catch (Throwable unused7) {
                                        }
                                        int[] iArr = {50, 51, 52, 46, 47, 48, 1, 3, 10, 30, 34};
                                        for (int i14 = 0; i14 < 11; i14++) {
                                            int i15 = iArr[i14];
                                            if (!arrayList5.contains(Integer.valueOf(i15))) {
                                                arrayList5.add(Integer.valueOf(i15));
                                            }
                                        }
                                        for (Integer num : arrayList5) {
                                            try {
                                                num.getClass();
                                                Object objInvoke3 = method.invoke(objM631l3, num);
                                                if (objInvoke3 != null) {
                                                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                                    try {
                                                        AbstractC0260i5.m536I(objInvoke3, linkedHashMap3, true);
                                                        if (!linkedHashMap3.isEmpty()) {
                                                            linkedHashMap.putAll(linkedHashMap3);
                                                            arrayListM650r0 = AbstractC0260i5.m650r0(classLoader2, "old-friend-manager", linkedHashMap);
                                                            break;
                                                        }
                                                        continue;
                                                    } catch (Throwable unused8) {
                                                        continue;
                                                    }
                                                }
                                            } catch (Throwable unused9) {
                                            }
                                        }
                                        objM631l = AbstractC0260i5.m631l(classLoader2);
                                        if (objM631l != null) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    arrayListM650r0 = new ArrayList(arrayList4);
                }
                final ArrayList arrayList6 = new ArrayList(arrayListM650r0);
                inAppSettings.activity.runOnUiThread(new Runnable() { // from class: com.mr.elaris.InAppSettingsTargetPickerPage.11.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // java.lang.Runnable
                    public void run() {
                        String str8;
                        arrayList.clear();
                        arrayList.addAll(arrayList6);
                        RunnableC011711 runnableC011711 = RunnableC011711.this;
                        InAppSettingsTargetPickerPage.mergeSelectedFriendPlaceholders(arrayList, linkedHashSet);
                        RunnableC011711 runnableC0117112 = RunnableC011711.this;
                        TextView textView3 = textViewText2;
                        if (arrayList.isEmpty()) {
                            str8 = "暂无好友列表";
                        } else {
                            str8 = "已选择 " + linkedHashSet.size() + " / " + arrayList.size();
                        }
                        textView3.setText(str8);
                        runnableArr2[0].run();
                        RunnableC011711 runnableC0117113 = RunnableC011711.this;
                        boolean z2 = zArr[0];
                        runnable.run();
                        if (!arrayList.isEmpty() || z2) {
                            return;
                        }
                        inAppSettings.toast("暂无好友列表；请先进入 QQ 联系人或聊天页后再试");
                    }
                });
            }
        }, "Elaris-FriendPickerLoad").start();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void showTroopPicker(final InAppSettings inAppSettings, final TextView textView, final TextView textView2, String str, final boolean z) {
        final ArrayList arrayListM56m = AbstractC0008a7.m56m();
        if (arrayListM56m.isEmpty()) {
            inAppSettings.toast("暂无群列表；请重新进入 QQ 设置后再试");
            return;
        }
        final LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (z) {
            for (C0298k8 c0298k8 : AbstractC0152f.m217n(str)) {
                if (c0298k8.f497a == 2) {
                    linkedHashSet.add(c0298k8.f498b);
                }
            }
        } else {
            linkedHashSet.addAll(AbstractC0008a7.m64u(str));
        }
        final ArrayList arrayList = new ArrayList(arrayListM56m);
        LinearLayout linearLayout = new LinearLayout(inAppSettings.activity);
        linearLayout.setOrientation(1);
        linearLayout.setTag("elaris_dialog_surface");
        linearLayout.setPadding(inAppSettings.m139dp(18.0f), inAppSettings.m139dp(14.0f), inAppSettings.m139dp(18.0f), inAppSettings.m139dp(12.0f));
        linearLayout.setBackground(inAppSettings.dialogPanel());
        LinearLayout linearLayout2 = new LinearLayout(inAppSettings.activity);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        TextView textViewText = inAppSettings.text("选择群", 20, InAppSettings.TEXT, 1);
        textViewText.setPadding(inAppSettings.m139dp(2.0f), 0, 0, 0);
        linearLayout2.addView(textViewText, new LinearLayout.LayoutParams(0, -2, 1.0f));
        final TextView textViewText2 = inAppSettings.text("已选择 " + linkedHashSet.size() + " / " + arrayListM56m.size(), 13, InAppSettings.SUB, 0);
        textViewText2.setGravity(5);
        linearLayout2.addView(textViewText2, new LinearLayout.LayoutParams(-2, -2));
        linearLayout.addView(linearLayout2);
        EditText editTextInput = inAppSettings.input("搜索群名或群号", "");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, inAppSettings.m139dp(40.0f));
        layoutParams.topMargin = inAppSettings.m139dp(10.0f);
        linearLayout.addView(editTextInput, layoutParams);
        ScrollView scrollView = new ScrollView(inAppSettings.activity);
        scrollView.setOverScrollMode(2);
        scrollView.setClipToPadding(false);
        scrollView.setVerticalFadingEdgeEnabled(true);
        scrollView.setFadingEdgeLength(inAppSettings.m139dp(16.0f));
        scrollView.setBackground(inAppSettings.roundWithStroke(InAppSettings.CARD, inAppSettings.m139dp(16.0f), InAppSettings.STROKE, 1));
        final LinearLayout linearLayout3 = new LinearLayout(inAppSettings.activity);
        linearLayout3.setOrientation(1);
        scrollView.addView(linearLayout3, new FrameLayout.LayoutParams(-1, -2));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, inAppSettings.m139dp(96.0f));
        layoutParams2.topMargin = inAppSettings.m139dp(10.0f);
        linearLayout.addView(scrollView, layoutParams2);
        final Runnable[] runnableArr = {runnable};
        Runnable runnable = new Runnable() { // from class: com.mr.elaris.InAppSettingsTargetPickerPage.12
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.lang.Runnable
            public void run() {
                InAppSettingsTargetPickerPage.refreshTroopPickerRows(inAppSettings, linearLayout3, arrayList, linkedHashSet, textViewText2, arrayListM56m, runnableArr);
            }
        };
        runnable.run();
        editTextInput.addTextChangedListener(new TextWatcher() { // from class: com.mr.elaris.InAppSettingsTargetPickerPage.13
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                String lowerCase = charSequence == null ? "" : charSequence.toString().trim().toLowerCase();
                arrayList.clear();
                for (C0563z6 c0563z6 : arrayListM56m) {
                    String str2 = c0563z6.f1139b;
                    String lowerCase2 = str2 == null ? "" : str2.toLowerCase();
                    if (lowerCase.length() == 0 || c0563z6.f1138a.contains(lowerCase) || lowerCase2.contains(lowerCase)) {
                        arrayList.add(c0563z6);
                    }
                }
                runnableArr[0].run();
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        LinearLayout linearLayout4 = new LinearLayout(inAppSettings.activity);
        linearLayout4.setOrientation(0);
        linearLayout4.setPadding(0, inAppSettings.m139dp(8.0f), 0, inAppSettings.m139dp(10.0f));
        TextView textViewLinkButton = linkButton(inAppSettings, "全选");
        TextView textViewLinkButton2 = linkButton(inAppSettings, "清空");
        TextView textViewLinkButton3 = linkButton(inAppSettings, "反选");
        textViewLinkButton.setOnClickListener(new View.OnClickListener() { // from class: com.mr.elaris.InAppSettingsTargetPickerPage.14
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InAppSettingsTargetPickerPage.selectAllTroops(linkedHashSet, arrayListM56m, textViewText2, runnableArr, view);
            }
        });
        textViewLinkButton2.setOnClickListener(new View.OnClickListener() { // from class: com.mr.elaris.InAppSettingsTargetPickerPage.15
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InAppSettingsTargetPickerPage.clearSelectedTroops(linkedHashSet, textViewText2, arrayListM56m, runnableArr, view);
            }
        });
        textViewLinkButton3.setOnClickListener(new View.OnClickListener() { // from class: com.mr.elaris.InAppSettingsTargetPickerPage.16
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InAppSettingsTargetPickerPage.invertSelectedTroops(arrayListM56m, linkedHashSet, textViewText2, runnableArr, view);
            }
        });
        linearLayout4.addView(textViewLinkButton);
        linearLayout4.addView(textViewLinkButton2);
        linearLayout4.addView(textViewLinkButton3);
        linearLayout.addView(linearLayout4);
        LinearLayout linearLayout5 = new LinearLayout(inAppSettings.activity);
        linearLayout5.setGravity(21);
        TextView textViewDialogButton = inAppSettings.dialogButton("取消", false);
        TextView textViewDialogButton2 = inAppSettings.dialogButton("保存", true);
        linearLayout5.addView(textViewDialogButton, new LinearLayout.LayoutParams(inAppSettings.m139dp(96.0f), inAppSettings.m139dp(40.0f)));
        linearLayout5.addView(new Space(inAppSettings.activity), new LinearLayout.LayoutParams(inAppSettings.m139dp(10.0f), 1));
        linearLayout5.addView(textViewDialogButton2, new LinearLayout.LayoutParams(inAppSettings.m139dp(96.0f), inAppSettings.m139dp(40.0f)));
        linearLayout.addView(linearLayout5);
        final AlertDialog alertDialogCreate = new AlertDialog.Builder(inAppSettings.activity).create();
        alertDialogCreate.setView(linearLayout, 0, 0, 0, 0);
        alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.mr.elaris.InAppSettingsTargetPickerPage.17
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.content.DialogInterface.OnShowListener
            public void onShow(DialogInterface dialogInterface) {
                inAppSettings.applyDialogWindowStyle(alertDialogCreate);
            }
        });
        textViewDialogButton.setOnClickListener(new View.OnClickListener() { // from class: com.mr.elaris.InAppSettingsTargetPickerPage.18
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                alertDialogCreate.dismiss();
            }
        });
        textViewDialogButton2.setOnClickListener(new View.OnClickListener() { // from class: com.mr.elaris.InAppSettingsTargetPickerPage.19
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InAppSettingsTargetPickerPage.saveTroopPickerSelection(inAppSettings, linkedHashSet, textView, textView2, arrayListM56m, alertDialogCreate, z, view);
            }
        });
        alertDialogCreate.show();
        inAppSettings.applyDialogWindowStyle(alertDialogCreate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void toggleTroopSelection(LinkedHashSet linkedHashSet, C0563z6 c0563z6, TextView textView, int i, Runnable runnable, View view) {
        boolean zContains = linkedHashSet.contains(c0563z6.f1138a);
        String str = c0563z6.f1138a;
        if (zContains) {
            linkedHashSet.remove(str);
        } else {
            linkedHashSet.add(str);
        }
        textView.setText("已选择 " + linkedHashSet.size() + " / " + i);
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static View troopPickRow(InAppSettings inAppSettings, final C0563z6 c0563z6, final LinkedHashSet<String> linkedHashSet, final TextView textView, final int i, final Runnable runnable) {
        LinearLayout linearLayout = new LinearLayout(inAppSettings.activity);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setPadding(inAppSettings.m139dp(14.0f), inAppSettings.m139dp(6.0f), inAppSettings.m139dp(10.0f), inAppSettings.m139dp(6.0f));
        linearLayout.setMinimumHeight(inAppSettings.m139dp(56.0f));
        String str = c0563z6.f1138a;
        String str2 = c0563z6.f1138a;
        boolean zContains = linkedHashSet.contains(str);
        linearLayout.setBackground(inAppSettings.rowBackground());
        LinearLayout linearLayout2 = new LinearLayout(inAppSettings.activity);
        linearLayout2.setOrientation(1);
        String str3 = c0563z6.f1139b;
        if (str3 == null || str3.length() == 0) {
            str3 = str2;
        }
        TextView textViewText = inAppSettings.text(str3, 14, zContains ? InAppSettings.BLUE : InAppSettings.TEXT, 1);
        TextView textViewText2 = inAppSettings.text(str2, 12, InAppSettings.SUB, 0);
        textViewText2.setPadding(0, inAppSettings.m139dp(4.0f), 0, 0);
        linearLayout2.addView(textViewText);
        linearLayout2.addView(textViewText2);
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView textViewText3 = inAppSettings.text(zContains ? "✓" : "", 12, InAppSettings.BLUE, 1);
        textViewText3.setGravity(17);
        textViewText3.setBackground(inAppSettings.checkCircleDrawable(zContains));
        linearLayout.addView(textViewText3, new LinearLayout.LayoutParams(inAppSettings.m139dp(24.0f), inAppSettings.m139dp(24.0f)));
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.mr.elaris.InAppSettingsTargetPickerPage.21
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InAppSettingsTargetPickerPage.toggleTroopSelection(linkedHashSet, c0563z6, textView, i, runnable, view);
            }
        });
        return linearLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void updatePickerListHeight(InAppSettings inAppSettings, LinearLayout linearLayout, int i) {
        try {
            View view = (View) linearLayout.getParent();
            if (view instanceof ScrollView) {
                int iMin = Math.min(inAppSettings.m139dp(330.0f), (i * inAppSettings.m139dp(56.0f)) + inAppSettings.m139dp(2.0f));
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null || layoutParams.height == iMin) {
                    return;
                }
                layoutParams.height = iMin;
                view.setLayoutParams(layoutParams);
            }
        } catch (Throwable unused) {
        }
    }
}
