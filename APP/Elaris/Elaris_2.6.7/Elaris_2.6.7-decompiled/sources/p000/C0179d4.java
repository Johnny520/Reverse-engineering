package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import java.util.Map;

/* JADX INFO: renamed from: d4 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0179d4 extends XC_MethodHook {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01c9 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01cb A[Catch: all -> 0x0264, TryCatch #2 {all -> 0x0264, blocks: (B:110:0x01c3, B:113:0x01cb, B:117:0x01dc, B:116:0x01d7), top: B:160:0x01c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0191  */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object[] objArr;
        boolean z;
        C0465t4 c0465t4;
        Editable text;
        Context context;
        Bitmap bitmapM648q1;
        Bitmap bitmapM648q12;
        if (!HookEntry.runtimeBool(Prefs.KEY_FAVORITE_EMOTICON_BATCH_SEND) || methodHookParam == null || (objArr = methodHookParam.args) == null || objArr.length == 0) {
            return;
        }
        Object obj = objArr[0];
        if (obj instanceof View) {
            View view = (View) obj;
            Object tag = view.getTag();
            if (tag == null) {
                tag = null;
            } else {
                try {
                    String name = tag.getClass().getName();
                    if (!"com.tencent.mobileqq.emoticonview.FavoriteEmoticonInfo".equals(name) && !name.endsWith(".FavoriteEmoticonInfo")) {
                        if (!name.contains("FavoriteEmoticonInfo")) {
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            if (tag == null) {
                AbstractC0278j4.m729u("favorite emoticon batch click blocked without favorite info");
                AbstractC0278j4.m705B(view, "未识别收藏表情数据，已拦截单独发送");
                methodHookParam.setResult(null);
                return;
            }
            if (methodHookParam.thisObject == null) {
                AbstractC0278j4.m729u("favorite emoticon batch click blocked invalid state");
                AbstractC0278j4.m705B(view, "收藏表情批量发送未就绪，已拦截单独发送");
            } else if (AbstractC0278j4.f467i) {
                EditText editTextM719k = AbstractC0278j4.m719k(view);
                if (editTextM719k == null) {
                    AbstractC0278j4.m729u("favorite emoticon batch input not found object=".concat(AbstractC0278j4.m718j(tag)));
                    AbstractC0278j4.m705B(view, "未找到聊天输入框，已拦截收藏表情单独发送");
                } else {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - AbstractC0278j4.f468j >= 15000) {
                        AbstractC0278j4.f468j = jCurrentTimeMillis;
                        for (Map.Entry entry : AbstractC0278j4.f461c.entrySet()) {
                            C0259i4 c0259i4 = (C0259i4) entry.getValue();
                            if (c0259i4 == null || jCurrentTimeMillis - c0259i4.f378e > 300000) {
                                AbstractC0278j4.f461c.remove(entry.getKey());
                            }
                        }
                    }
                    long jCurrentTimeMillis2 = System.currentTimeMillis() * 1000;
                    long j = AbstractC0278j4.f469k + 1;
                    AbstractC0278j4.f469k = j;
                    String str = "[ELARIS_FAV:" + ((j % 1000) + jCurrentTimeMillis2) + "]";
                    int i = 1;
                    if (!AbstractC0260i5.m600c1(editTextM719k.getHint())) {
                        View view2 = editTextM719k;
                        for (int i2 = 0; i2 < 3; i2++) {
                            Object parent = view2.getParent();
                            if (parent instanceof View) {
                                view2 = (View) parent;
                                if (AbstractC0260i5.m609e2(view2, false) > AbstractC0260i5.m595b0(editTextM719k.getContext(), 320)) {
                                    break;
                                } else if (!AbstractC0260i5.m557P(view2, editTextM719k, 0, new int[]{0})) {
                                }
                            }
                        }
                        z = true;
                        if (z || (context = editTextM719k.getContext()) == null) {
                            c0465t4 = null;
                            C0259i4 c0259i42 = new C0259i4(str, tag, editTextM719k, z);
                            try {
                                text = editTextM719k.getText();
                                if (text == null) {
                                    int selectionStart = editTextM719k.getSelectionStart();
                                    int selectionEnd = editTextM719k.getSelectionEnd();
                                    if (selectionStart < 0 || selectionEnd < 0) {
                                        selectionStart = text.length();
                                        selectionEnd = selectionStart;
                                    }
                                    int iMin = Math.min(selectionStart, selectionEnd);
                                    text.replace(iMin, Math.max(selectionStart, selectionEnd), AbstractC0260i5.m586Y1(editTextM719k, str, tag, z, c0465t4));
                                    editTextM719k.setSelection(Math.min(text.length(), iMin + str.length()));
                                    AbstractC0278j4.f461c.put(str, c0259i42);
                                    synchronized (AbstractC0278j4.class) {
                                        AbstractC0278j4.m712d(null);
                                        C0227g4 c0227g4 = new C0227g4(str, c0259i42);
                                        AbstractC0278j4.f463e = c0227g4;
                                        RunnableC0035c2 runnableC0035c2 = new RunnableC0035c2(c0227g4, c0259i42, str, i);
                                        AbstractC0278j4.f465g = runnableC0035c2;
                                        Handler handler = AbstractC0278j4.f464f;
                                        if (handler == null) {
                                            synchronized (AbstractC0278j4.class) {
                                                try {
                                                    if (AbstractC0278j4.f464f == null) {
                                                        AbstractC0278j4.f464f = new Handler(Looper.getMainLooper());
                                                    }
                                                    handler = AbstractC0278j4.f464f;
                                                } finally {
                                                }
                                            }
                                        }
                                        handler.postDelayed(runnableC0035c2, 1800L);
                                    }
                                    StringBuilder sbM1b = AbstractC0000a.m1b("favorite emoticon batch queued token=", str, " preview=");
                                    sbM1b.append(z ? "on" : "off");
                                    sbM1b.append(" object=");
                                    sbM1b.append(AbstractC0278j4.m718j(tag));
                                    AbstractC0278j4.m729u(sbM1b.toString());
                                    return;
                                }
                            } catch (Throwable th) {
                                AbstractC0278j4.m729u("favorite emoticon batch insert token failed: " + th);
                            }
                            AbstractC0278j4.m705B(view, "收藏表情占位失败，已拦截单独发送");
                        } else {
                            int iM595b0 = AbstractC0260i5.m595b0(context, 34);
                            if (iM595b0 > 0) {
                                bitmapM648q1 = AbstractC0260i5.m648q1(view, iM595b0);
                                if (bitmapM648q1 == null) {
                                    View view3 = view;
                                    for (int i3 = 0; i3 < 5 && view3 != null; i3++) {
                                        Object parent2 = view3.getParent();
                                        if (!(parent2 instanceof View)) {
                                            break;
                                        }
                                        view3 = (View) parent2;
                                        if (AbstractC0260i5.m540J0(view3, iM595b0)) {
                                            Object tag2 = view3 == null ? null : view3.getTag();
                                            if (tag2 != null) {
                                                try {
                                                    String name2 = tag2.getClass().getName();
                                                    if (!"com.tencent.mobileqq.emoticonview.FavoriteEmoticonInfo".equals(name2) && !name2.endsWith(".FavoriteEmoticonInfo") && !name2.contains("FavoriteEmoticonInfo")) {
                                                    }
                                                } catch (Throwable unused2) {
                                                }
                                                if (tag2 != null) {
                                                    bitmapM648q1 = bitmapM648q12;
                                                    break;
                                                } else {
                                                    bitmapM648q1 = bitmapM648q12;
                                                    break;
                                                }
                                            }
                                            tag2 = null;
                                            if ((tag2 != null || tag2 == tag || AbstractC0260i5.m626j0(tag2).equals(AbstractC0260i5.m626j0(tag))) && (bitmapM648q12 = AbstractC0260i5.m648q1(view3, iM595b0)) != null) {
                                                bitmapM648q1 = bitmapM648q12;
                                                break;
                                            }
                                        }
                                    }
                                    bitmapM648q1 = null;
                                }
                                if (bitmapM648q1 == null) {
                                    c0465t4 = new C0465t4(bitmapM648q1, AbstractC0260i5.m595b0(context, 2), iM595b0);
                                }
                                C0259i4 c0259i422 = new C0259i4(str, tag, editTextM719k, z);
                                text = editTextM719k.getText();
                                if (text == null) {
                                }
                                AbstractC0278j4.m705B(view, "收藏表情占位失败，已拦截单独发送");
                            } else {
                                bitmapM648q1 = null;
                                if (bitmapM648q1 == null) {
                                }
                                C0259i4 c0259i4222 = new C0259i4(str, tag, editTextM719k, z);
                                text = editTextM719k.getText();
                                if (text == null) {
                                }
                                AbstractC0278j4.m705B(view, "收藏表情占位失败，已拦截单独发送");
                            }
                        }
                    }
                    z = false;
                    if (z) {
                        c0465t4 = null;
                        C0259i4 c0259i42222 = new C0259i4(str, tag, editTextM719k, z);
                        text = editTextM719k.getText();
                        if (text == null) {
                        }
                        AbstractC0278j4.m705B(view, "收藏表情占位失败，已拦截单独发送");
                    }
                }
            } else {
                AbstractC0278j4.m729u("favorite emoticon batch click blocked without send hook object=".concat(AbstractC0278j4.m718j(tag)));
                AbstractC0278j4.m705B(view, "收藏表情发送入口未就绪，已拦截单独发送");
            }
            methodHookParam.setResult(null);
        }
    }

    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
    }
}
