package p332wb;

import android.app.Activity;
import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.UriPermission;
import android.net.Uri;
import android.os.Parcelable;
import android.widget.Toast;
import ca.RunnableC0537x;
import de.robv.android.xposed.XC_MethodHook;
import gg.AbstractC1416l;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import org.json.JSONObject;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p092g4.AbstractC1341a;
import p129ig.AbstractC2043a;
import p218og.AbstractC3137a;
import p218og.AbstractC3149m;
import p259r9.AbstractC3754e0;
import p276sf.C3959f;
import p300ub.AbstractC4302b;
import tf.AbstractC4165l;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: wb.q0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5226q0 extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f20114a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [wb.r0.a(java.lang.Class):void, wb.vq.b(java.lang.Class):void] */
    public /* synthetic */ C5226q0(int i9) {
        this.f20114a = i9;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, THROW, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x075a  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x0817  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x0839  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x054d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:576:0x02bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Uri data;
        Activity activity;
        Object c3959f;
        int iIntValue;
        InputStream inputStreamOpenInputStream;
        JSONObject jSONObjectOptJSONObject;
        Object c3959f2;
        int iIntValue2;
        int i9;
        JSONObject jSONObject;
        OutputStream outputStreamOpenOutputStream;
        Activity activity2;
        InterfaceC1231l interfaceC1231l;
        String absolutePath;
        File file;
        FileOutputStream fileOutputStream;
        Uri uri;
        Uri data2;
        Activity activity3;
        ContentResolver contentResolver;
        Activity activity4;
        InterfaceC1231l interfaceC1231l2;
        String absolutePath2;
        File file2;
        Uri uri2;
        C4925gr c4925gr;
        Object c3959f3;
        Object c3959f4;
        boolean zBooleanValue;
        List<UriPermission> persistedUriPermissions;
        boolean z9;
        List<UriPermission> persistedUriPermissions2;
        boolean z10;
        Object c3959f5;
        int i10 = 0;
        switch (this.f20114a) {
            case 0:
                methodHookParam.getClass();
                Object[] objArr = methodHookParam.args;
                objArr.getClass();
                Object objM8366C0 = AbstractC4165l.m8366C0(0, objArr);
                Integer num = objM8366C0 instanceof Integer ? (Integer) objM8366C0 : null;
                if (num == null) {
                    return;
                }
                int iIntValue3 = num.intValue();
                if (iIntValue3 != 1212371544 && iIntValue3 != 1212371545) {
                    return;
                }
                Object[] objArr2 = methodHookParam.args;
                objArr2.getClass();
                Object objM8366C02 = AbstractC4165l.m8366C0(1, objArr2);
                Integer num2 = objM8366C02 instanceof Integer ? (Integer) objM8366C02 : null;
                if (num2 == null || num2.intValue() != -1) {
                    return;
                }
                Object[] objArr3 = methodHookParam.args;
                objArr3.getClass();
                Object objM8366C03 = AbstractC4165l.m8366C0(2, objArr3);
                Intent intent = objM8366C03 instanceof Intent ? (Intent) objM8366C03 : null;
                if (intent == null || (data = intent.getData()) == null || (activity = C5259r0.f20319d) == null) {
                    return;
                }
                if (iIntValue3 == 1212371544) {
                    List list = AbstractC5098m4.f18835a;
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        i9 = 0;
                        for (String str : AbstractC5098m4.f18835a) {
                            SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(activity, str);
                            JSONObject jSONObject3 = new JSONObject();
                            Map<String, ?> all = sharedPreferencesM8640c.getAll();
                            all.getClass();
                            for (Map.Entry<String, ?> entry : all.entrySet()) {
                                String key = entry.getKey();
                                JSONObject jSONObjectM9729b = AbstractC5098m4.m9729b(entry.getValue());
                                if (jSONObjectM9729b != null) {
                                    jSONObject3.put(key, jSONObjectM9729b);
                                    i9++;
                                }
                            }
                            if (jSONObject3.length() > 0) {
                                jSONObject2.put(str, jSONObject3);
                            }
                        }
                        jSONObject = new JSONObject();
                        jSONObject.put("format", "HchatConfigBackup");
                        jSONObject.put("version", 1);
                        jSONObject.put("appVersion", "5.5.6");
                        jSONObject.put("exportedAt", System.currentTimeMillis());
                        jSONObject.put("prefs", jSONObject2);
                        outputStreamOpenOutputStream = activity.getContentResolver().openOutputStream(data, "wt");
                    } catch (Throwable th2) {
                        c3959f2 = new C3959f(th2);
                    }
                    if (outputStreamOpenOutputStream != null) {
                        try {
                            String string = jSONObject.toString(2);
                            string.getClass();
                            byte[] bytes = string.getBytes(AbstractC3137a.f10177a);
                            bytes.getClass();
                            outputStreamOpenOutputStream.write(bytes);
                            outputStreamOpenOutputStream.close();
                            c3959f2 = Integer.valueOf(i9);
                            iIntValue2 = ((Number) (c3959f2 instanceof C3959f ? 0 : c3959f2)).intValue();
                            if (iIntValue2 > 0) {
                                Toast.makeText(activity, "导出失败", 0).show();
                                return;
                            }
                            Toast.makeText(activity, "已导出 " + iIntValue2 + " 项配置", 0).show();
                            return;
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                AbstractC2043a.m5035i(outputStreamOpenOutputStream, th3);
                                throw th4;
                            }
                        }
                    }
                    iIntValue2 = 0;
                    if (iIntValue2 > 0) {
                    }
                } else {
                    List list2 = AbstractC5098m4.f18835a;
                    try {
                        inputStreamOpenInputStream = activity.getContentResolver().openInputStream(data);
                        if (inputStreamOpenInputStream != null) {
                            try {
                                strM7887e0 = AbstractC3754e0.m7887e0(new InputStreamReader(inputStreamOpenInputStream, AbstractC3137a.f10177a));
                                inputStreamOpenInputStream.close();
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        }
                        if (strM7887e0 == null) {
                            strM7887e0 = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                    } catch (Throwable th5) {
                        c3959f = new C3959f(th5);
                    }
                    if (!AbstractC3149m.m6721t0(strM7887e0)) {
                        JSONObject jSONObject4 = new JSONObject(strM7887e0);
                        if (AbstractC1416l.m3825a(jSONObject4.optString("format"), "HchatConfigBackup") && (jSONObjectOptJSONObject = jSONObject4.optJSONObject("prefs")) != null) {
                            int i11 = 0;
                            for (String str2 : AbstractC5098m4.f18835a) {
                                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(str2);
                                if (jSONObjectOptJSONObject2 != null) {
                                    SharedPreferences.Editor editorClear = AbstractC4302b.m8640c(activity, str2).edit().clear();
                                    Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
                                    while (itKeys.hasNext()) {
                                        String next = itKeys.next();
                                        JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject(next);
                                        if (jSONObjectOptJSONObject3 != null) {
                                            editorClear.getClass();
                                            next.getClass();
                                            if (AbstractC5098m4.m9728a(editorClear, next, jSONObjectOptJSONObject3)) {
                                                i11++;
                                            }
                                        }
                                    }
                                    editorClear.commit();
                                }
                            }
                            c3959f = Integer.valueOf(i11);
                            iIntValue = ((Number) (c3959f instanceof C3959f ? 0 : c3959f)).intValue();
                            if (iIntValue > 0) {
                                Toast.makeText(activity, "导入失败或文件无配置", 0).show();
                                return;
                            }
                            InterfaceC1220a interfaceC1220a = C5259r0.f20318c;
                            if (interfaceC1220a != null) {
                                interfaceC1220a.invoke();
                            }
                            Toast.makeText(activity, "已导入 " + iIntValue + " 项配置，当前设置页已刷新", 1).show();
                            return;
                        }
                    }
                    iIntValue = 0;
                    if (iIntValue > 0) {
                    }
                }
                break;
            case 1:
                methodHookParam.getClass();
                Object[] objArr4 = methodHookParam.args;
                objArr4.getClass();
                Object objM8366C04 = AbstractC4165l.m8366C0(0, objArr4);
                Integer num3 = objM8366C04 instanceof Integer ? (Integer) objM8366C04 : null;
                if (num3 == null || num3.intValue() != 1212371542) {
                    return;
                }
                Object[] objArr5 = methodHookParam.args;
                objArr5.getClass();
                Object objM8366C05 = AbstractC4165l.m8366C0(1, objArr5);
                Integer num4 = objM8366C05 instanceof Integer ? (Integer) objM8366C05 : null;
                if (num4 == null || num4.intValue() != -1) {
                    return;
                }
                Object[] objArr6 = methodHookParam.args;
                objArr6.getClass();
                Object objM8366C06 = AbstractC4165l.m8366C0(2, objArr6);
                Intent intent2 = objM8366C06 instanceof Intent ? (Intent) objM8366C06 : null;
                if (intent2 == null || (activity2 = C4989iq.f17990d) == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Uri data3 = intent2.getData();
                if (data3 != null) {
                    arrayList.add(data3);
                }
                ClipData clipData = intent2.getClipData();
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    while (i10 < itemCount) {
                        try {
                            ClipData.Item itemAt = clipData.getItemAt(i10);
                            if (itemAt != null && (uri = itemAt.getUri()) != null) {
                                arrayList.add(uri);
                            }
                        } catch (Throwable unused) {
                        }
                        i10++;
                    }
                }
                Parcelable parcelableExtra = intent2.getParcelableExtra("android.intent.extra.STREAM");
                Uri uri3 = parcelableExtra instanceof Uri ? (Uri) parcelableExtra : null;
                if (uri3 != null) {
                    arrayList.add(uri3);
                }
                List<Uri> listM8407P1 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList));
                ArrayList arrayList2 = new ArrayList();
                for (Uri uri4 : listM8407P1) {
                    C4989iq c4989iq = C4989iq.f17987a;
                    if (AbstractC1416l.m3825a(uri4.getScheme(), "content")) {
                        try {
                            if ((intent2.getFlags() & 1) != 0) {
                                activity2.getContentResolver().takePersistableUriPermission(uri4, 1);
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                    C4989iq c4989iq2 = C4989iq.f17987a;
                    String str3 = "reply_file";
                    if ("file".equalsIgnoreCase(uri4.getScheme())) {
                        absolutePath = uri4.getPath();
                        if (absolutePath == null) {
                            absolutePath = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        if (AbstractC3149m.m6721t0(absolutePath) || !AbstractC0921a.m2262y(absolutePath)) {
                        }
                    } else {
                        try {
                            String strM9309C6 = AbstractC4955ho.m9309C6(activity2, uri4);
                            if (strM9309C6 == null && (strM9309C6 = uri4.getLastPathSegment()) == null) {
                                strM9309C6 = "reply_file";
                            }
                            Pattern patternCompile = Pattern.compile("[\\\\/:*?\"<>|]");
                            patternCompile.getClass();
                            String strReplaceAll = patternCompile.matcher(strM9309C6).replaceAll("_");
                            strReplaceAll.getClass();
                            String string2 = AbstractC3149m.m6703R0(strReplaceAll).toString();
                            if (!AbstractC3149m.m6721t0(string2)) {
                                str3 = string2;
                            }
                            File file3 = new File(activity2.getFilesDir(), "Hchat/redpacket_reply");
                            file3.mkdirs();
                            file = new File(file3, System.currentTimeMillis() + "_" + str3);
                            inputStreamOpenInputStream = activity2.getContentResolver().openInputStream(uri4);
                        } catch (Throwable unused3) {
                        }
                        if (inputStreamOpenInputStream != null) {
                            try {
                                fileOutputStream = new FileOutputStream(file);
                                try {
                                    AbstractC1341a.m3594j(inputStreamOpenInputStream, fileOutputStream);
                                    fileOutputStream.close();
                                    inputStreamOpenInputStream.close();
                                    absolutePath = file.getAbsolutePath();
                                    if (!file.isFile() || file.length() <= 0) {
                                        absolutePath = null;
                                    }
                                } finally {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        }
                    }
                    if (absolutePath != null) {
                        arrayList2.add(absolutePath);
                    }
                }
                List listM8407P12 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList2));
                if (listM8407P12.isEmpty() || (interfaceC1231l = C4989iq.f17989c) == null) {
                    return;
                }
                interfaceC1231l.invoke(listM8407P12);
                return;
            case 2:
                methodHookParam.getClass();
                Object[] objArr7 = methodHookParam.args;
                objArr7.getClass();
                Object objM8366C07 = AbstractC4165l.m8366C0(0, objArr7);
                Integer num5 = objM8366C07 instanceof Integer ? (Integer) objM8366C07 : null;
                if (num5 != null) {
                    int iIntValue4 = num5.intValue();
                    if (iIntValue4 == 1212371540 || iIntValue4 == 1212371541) {
                        Object[] objArr8 = methodHookParam.args;
                        objArr8.getClass();
                        Object objM8366C08 = AbstractC4165l.m8366C0(1, objArr8);
                        Integer num6 = objM8366C08 instanceof Integer ? (Integer) objM8366C08 : null;
                        if (num6 == null || num6.intValue() != -1) {
                            return;
                        }
                        Object[] objArr9 = methodHookParam.args;
                        objArr9.getClass();
                        Object objM8366C09 = AbstractC4165l.m8366C0(2, objArr9);
                        Intent intent3 = objM8366C09 instanceof Intent ? (Intent) objM8366C09 : null;
                        if (intent3 != null) {
                            C5417vq c5417vq = C5417vq.f21502a;
                            if (iIntValue4 == 1212371540) {
                                Parcelable parcelableExtra2 = intent3.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
                                data2 = parcelableExtra2 instanceof Uri ? (Uri) parcelableExtra2 : null;
                                if (data2 == null) {
                                    data2 = intent3.getData();
                                    if (data2 == null) {
                                        Parcelable parcelableExtra3 = intent3.getParcelableExtra("android.intent.extra.STREAM");
                                        data2 = parcelableExtra3 instanceof Uri ? (Uri) parcelableExtra3 : null;
                                        if (data2 == null) {
                                            ClipData clipData2 = intent3.getClipData();
                                            if (clipData2 == null || clipData2.getItemCount() <= 0) {
                                                data2 = null;
                                                if (data2 == null) {
                                                    data2 = C5417vq.m9753a(intent3.getExtras());
                                                }
                                            } else {
                                                try {
                                                    ClipData.Item itemAt2 = clipData2.getItemAt(0);
                                                    if (itemAt2 != null) {
                                                        data2 = itemAt2.getUri();
                                                        break;
                                                    }
                                                } catch (Throwable unused4) {
                                                }
                                                if (data2 == null) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            C5417vq c5417vq2 = C5417vq.f21502a;
                            if (data2 != null && AbstractC1416l.m3825a(data2.getScheme(), "content")) {
                                try {
                                    if ((intent3.getFlags() & 1) != 0 && (activity3 = C5417vq.f21505d) != null && (contentResolver = activity3.getContentResolver()) != null) {
                                        contentResolver.takePersistableUriPermission(data2, 1);
                                    }
                                    break;
                                } catch (Throwable unused5) {
                                }
                            }
                            InterfaceC1231l interfaceC1231l3 = C5417vq.f21504c;
                            if (interfaceC1231l3 != null) {
                                strM7887e0 = data2 != null ? data2.toString() : null;
                                if (strM7887e0 == null) {
                                    strM7887e0 = HttpUrl.FRAGMENT_ENCODE_SET;
                                }
                                interfaceC1231l3.invoke(strM7887e0);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                methodHookParam.getClass();
                Object[] objArr10 = methodHookParam.args;
                objArr10.getClass();
                Object objM8366C010 = AbstractC4165l.m8366C0(0, objArr10);
                Integer num7 = objM8366C010 instanceof Integer ? (Integer) objM8366C010 : null;
                if (num7 == null || num7.intValue() != 1212371546) {
                    return;
                }
                Object[] objArr11 = methodHookParam.args;
                objArr11.getClass();
                Object objM8366C011 = AbstractC4165l.m8366C0(1, objArr11);
                Integer num8 = objM8366C011 instanceof Integer ? (Integer) objM8366C011 : null;
                if (num8 == null || num8.intValue() != -1) {
                    return;
                }
                Object[] objArr12 = methodHookParam.args;
                objArr12.getClass();
                Object objM8366C012 = AbstractC4165l.m8366C0(2, objArr12);
                Intent intent4 = objM8366C012 instanceof Intent ? (Intent) objM8366C012 : null;
                if (intent4 == null || (activity4 = C5450wq.f21767d) == null) {
                    return;
                }
                ArrayList arrayList3 = new ArrayList();
                Uri data4 = intent4.getData();
                if (data4 != null) {
                    arrayList3.add(data4);
                }
                ClipData clipData3 = intent4.getClipData();
                if (clipData3 != null) {
                    int itemCount2 = clipData3.getItemCount();
                    while (i10 < itemCount2) {
                        try {
                            ClipData.Item itemAt3 = clipData3.getItemAt(i10);
                            if (itemAt3 != null && (uri2 = itemAt3.getUri()) != null) {
                                arrayList3.add(uri2);
                            }
                        } catch (Throwable unused6) {
                        }
                        i10++;
                    }
                }
                Parcelable parcelableExtra4 = intent4.getParcelableExtra("android.intent.extra.STREAM");
                Uri uri5 = parcelableExtra4 instanceof Uri ? (Uri) parcelableExtra4 : null;
                if (uri5 != null) {
                    arrayList3.add(uri5);
                }
                List<Uri> listM8407P13 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList3));
                ArrayList arrayList4 = new ArrayList();
                for (Uri uri6 : listM8407P13) {
                    C5450wq c5450wq = C5450wq.f21764a;
                    if (AbstractC1416l.m3825a(uri6.getScheme(), "content")) {
                        try {
                            if ((intent4.getFlags() & 1) != 0) {
                                activity4.getContentResolver().takePersistableUriPermission(uri6, 1);
                            }
                        } catch (Throwable unused7) {
                        }
                    }
                    C5450wq c5450wq2 = C5450wq.f21764a;
                    String str4 = "scheduled_task_file";
                    if ("file".equalsIgnoreCase(uri6.getScheme())) {
                        absolutePath2 = uri6.getPath();
                        if (absolutePath2 == null) {
                            absolutePath2 = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        if (AbstractC3149m.m6721t0(absolutePath2) || !AbstractC0921a.m2262y(absolutePath2)) {
                        }
                    } else {
                        try {
                            String strM9309C62 = AbstractC4955ho.m9309C6(activity4, uri6);
                            if (strM9309C62 == null && (strM9309C62 = uri6.getLastPathSegment()) == null) {
                                strM9309C62 = "scheduled_task_file";
                            }
                            Pattern patternCompile2 = Pattern.compile("[\\\\/:*?\"<>|]");
                            patternCompile2.getClass();
                            String strReplaceAll2 = patternCompile2.matcher(strM9309C62).replaceAll("_");
                            strReplaceAll2.getClass();
                            String string3 = AbstractC3149m.m6703R0(strReplaceAll2).toString();
                            if (!AbstractC3149m.m6721t0(string3)) {
                                str4 = string3;
                            }
                            File file4 = new File(activity4.getFilesDir(), "Hchat/scheduled_task");
                            file4.mkdirs();
                            try {
                                file2 = new File(file4, System.currentTimeMillis() + "_" + str4);
                                inputStreamOpenInputStream = activity4.getContentResolver().openInputStream(uri6);
                            } catch (Throwable unused8) {
                            }
                        } catch (Throwable unused9) {
                        }
                        if (inputStreamOpenInputStream != null) {
                            try {
                                fileOutputStream = new FileOutputStream(file2);
                                try {
                                    AbstractC1341a.m3594j(inputStreamOpenInputStream, fileOutputStream);
                                    fileOutputStream.close();
                                    inputStreamOpenInputStream.close();
                                    absolutePath2 = file2.getAbsolutePath();
                                    if (!file2.isFile() || file2.length() <= 0) {
                                        absolutePath2 = null;
                                    }
                                } finally {
                                }
                            } finally {
                            }
                        }
                    }
                    if (absolutePath2 != null) {
                        arrayList4.add(absolutePath2);
                    }
                }
                List listM8407P14 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList4));
                if (listM8407P14.isEmpty() || (interfaceC1231l2 = C5450wq.f21766c) == null) {
                    return;
                }
                interfaceC1231l2.invoke(listM8407P14);
                return;
            default:
                methodHookParam.getClass();
                Object[] objArr13 = methodHookParam.args;
                objArr13.getClass();
                Object objM8366C013 = AbstractC4165l.m8366C0(0, objArr13);
                Integer num9 = objM8366C013 instanceof Integer ? (Integer) objM8366C013 : null;
                if (num9 == null || num9.intValue() != 1212371550) {
                    return;
                }
                synchronized (C4958hr.f17734a) {
                    c4925gr = C4958hr.f17736c;
                    C4958hr.f17736c = null;
                }
                if (c4925gr != null) {
                    Object[] objArr14 = methodHookParam.args;
                    objArr14.getClass();
                    Object objM8366C014 = AbstractC4165l.m8366C0(1, objArr14);
                    Integer num10 = objM8366C014 instanceof Integer ? (Integer) objM8366C014 : null;
                    if (num10 == null || num10.intValue() != -1) {
                        return;
                    }
                    Object[] objArr15 = methodHookParam.args;
                    objArr15.getClass();
                    Object objM8366C015 = AbstractC4165l.m8366C0(2, objArr15);
                    Intent intent5 = objM8366C015 instanceof Intent ? (Intent) objM8366C015 : null;
                    if (intent5 != null) {
                        Activity activity5 = c4925gr.f17488a;
                        File file5 = c4925gr.f17489b;
                        ArrayList arrayList5 = new ArrayList();
                        Uri data5 = intent5.getData();
                        if (data5 != null) {
                            arrayList5.add(data5);
                        }
                        ClipData clipData4 = intent5.getClipData();
                        if (clipData4 != null) {
                            int itemCount3 = clipData4.getItemCount();
                            for (int i12 = 0; i12 < itemCount3; i12++) {
                                try {
                                    ClipData.Item itemAt4 = clipData4.getItemAt(i12);
                                    c3959f5 = itemAt4 != null ? itemAt4.getUri() : null;
                                } catch (Throwable th6) {
                                    c3959f5 = new C3959f(th6);
                                }
                                if (c3959f5 instanceof C3959f) {
                                    c3959f5 = null;
                                }
                                Uri uri7 = (Uri) c3959f5;
                                if (uri7 != null) {
                                    arrayList5.add(uri7);
                                }
                            }
                        }
                        List listM8407P15 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList5));
                        ArrayList arrayList6 = new ArrayList();
                        for (Object obj : listM8407P15) {
                            Uri uri8 = (Uri) obj;
                            C4958hr c4958hr = C4958hr.f17734a;
                            if (AbstractC1416l.m3825a(uri8.getScheme(), "content")) {
                                ContentResolver contentResolver2 = activity5.getContentResolver();
                                try {
                                    persistedUriPermissions2 = contentResolver2.getPersistedUriPermissions();
                                    persistedUriPermissions2.getClass();
                                } catch (Throwable th7) {
                                    c3959f3 = new C3959f(th7);
                                }
                                if (persistedUriPermissions2.isEmpty()) {
                                    z10 = false;
                                    c3959f3 = Boolean.valueOf(z10);
                                    Object obj2 = Boolean.FALSE;
                                    if (c3959f3 instanceof C3959f) {
                                        c3959f3 = obj2;
                                    }
                                    if (((Boolean) c3959f3).booleanValue()) {
                                        zBooleanValue = true;
                                    } else {
                                        int flags = intent5.getFlags();
                                        if ((flags & 1) != 0 && (flags & 64) != 0) {
                                            try {
                                                contentResolver2.takePersistableUriPermission(uri8, 1);
                                                persistedUriPermissions = contentResolver2.getPersistedUriPermissions();
                                                persistedUriPermissions.getClass();
                                            } catch (Throwable th8) {
                                                c3959f4 = new C3959f(th8);
                                            }
                                            if (persistedUriPermissions.isEmpty()) {
                                                z9 = false;
                                                c3959f4 = Boolean.valueOf(z9);
                                                Object obj3 = Boolean.FALSE;
                                                if (c3959f4 instanceof C3959f) {
                                                    c3959f4 = obj3;
                                                }
                                                zBooleanValue = ((Boolean) c3959f4).booleanValue();
                                            } else {
                                                for (UriPermission uriPermission : persistedUriPermissions) {
                                                    if (AbstractC1416l.m3825a(uriPermission.getUri(), uri8) && uriPermission.isReadPermission()) {
                                                        z9 = true;
                                                        c3959f4 = Boolean.valueOf(z9);
                                                        Object obj32 = Boolean.FALSE;
                                                        if (c3959f4 instanceof C3959f) {
                                                        }
                                                        zBooleanValue = ((Boolean) c3959f4).booleanValue();
                                                    }
                                                }
                                                z9 = false;
                                                c3959f4 = Boolean.valueOf(z9);
                                                Object obj322 = Boolean.FALSE;
                                                if (c3959f4 instanceof C3959f) {
                                                }
                                                zBooleanValue = ((Boolean) c3959f4).booleanValue();
                                            }
                                            break;
                                        }
                                    }
                                } else {
                                    for (UriPermission uriPermission2 : persistedUriPermissions2) {
                                        if (AbstractC1416l.m3825a(uriPermission2.getUri(), uri8) && uriPermission2.isReadPermission()) {
                                            z10 = true;
                                            c3959f3 = Boolean.valueOf(z10);
                                            Object obj22 = Boolean.FALSE;
                                            if (c3959f3 instanceof C3959f) {
                                            }
                                            if (((Boolean) c3959f3).booleanValue()) {
                                            }
                                        }
                                    }
                                    z10 = false;
                                    c3959f3 = Boolean.valueOf(z10);
                                    Object obj222 = Boolean.FALSE;
                                    if (c3959f3 instanceof C3959f) {
                                    }
                                    if (((Boolean) c3959f3).booleanValue()) {
                                    }
                                }
                            } else {
                                zBooleanValue = false;
                            }
                            if (zBooleanValue) {
                                arrayList6.add(obj);
                            }
                            break;
                        }
                        HashSet hashSet = new HashSet();
                        Iterator it = arrayList6.iterator();
                        while (it.hasNext()) {
                            hashSet.add(((Uri) it.next()).toString());
                        }
                        new Thread(new RunnableC0537x(listM8407P15, activity5, file5, hashSet, c4925gr, 17), "Hchat-Agent-Attachment-Copy").start();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
