package p000a;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.KeyEvent;
import androidx.emoji2.text.C1094c;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Set;
import p000a.C0671kb;
import p000a.C0691lc;

/* JADX INFO: renamed from: a.Q5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0296Q5 {

    /* JADX INFO: renamed from: a */
    public final C1094c.d f1078a;

    /* JADX INFO: renamed from: b */
    public final C0671kb f1079b;

    /* JADX INFO: renamed from: c */
    public final C0277P4 f1080c;

    /* JADX INFO: renamed from: a.Q5$a */
    public static class a implements b<C0431Xf> {

        /* JADX INFO: renamed from: a */
        public C0431Xf f1081a;

        /* JADX INFO: renamed from: b */
        public final C1094c.d f1082b;

        public a(C0431Xf c0431Xf, C1094c.d dVar) {
            this.f1081a = c0431Xf;
            this.f1082b = dVar;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p000a.C0296Q5.b
        /* JADX INFO: renamed from: a */
        public final C0431Xf mo839a() {
            return this.f1081a;
        }

        @Override // p000a.C0296Q5.b
        /* JADX INFO: renamed from: b */
        public final boolean mo840b(CharSequence charSequence, int i, int i2, C0359Tf c0359Tf) {
            if ((c0359Tf.f1358c & 4) > 0) {
                return true;
            }
            if (this.f1081a == null) {
                this.f1081a = new C0431Xf(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            this.f1082b.getClass();
            this.f1081a.setSpan(new C0377Uf(c0359Tf), i, i2, 33);
            return true;
        }
    }

    /* JADX INFO: renamed from: a.Q5$b */
    public interface b<T> {
        /* JADX INFO: renamed from: a */
        T mo839a();

        /* JADX INFO: renamed from: b */
        boolean mo840b(CharSequence charSequence, int i, int i2, C0359Tf c0359Tf);
    }

    /* JADX INFO: renamed from: a.Q5$c */
    public static class c implements b<c> {

        /* JADX INFO: renamed from: a */
        public final String f1083a;

        public c(String str) {
            this.f1083a = str;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p000a.C0296Q5.b
        /* JADX INFO: renamed from: a */
        public final c mo839a() {
            return this;
        }

        @Override // p000a.C0296Q5.b
        /* JADX INFO: renamed from: b */
        public final boolean mo840b(CharSequence charSequence, int i, int i2, C0359Tf c0359Tf) {
            if (!TextUtils.equals(charSequence.subSequence(i, i2), this.f1083a)) {
                return true;
            }
            c0359Tf.f1358c = (c0359Tf.f1358c & 3) | 4;
            return false;
        }
    }

    /* JADX INFO: renamed from: a.Q5$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public int f1084a = 1;

        /* JADX INFO: renamed from: b */
        public final C0671kb.a f1085b;

        /* JADX INFO: renamed from: c */
        public C0671kb.a f1086c;

        /* JADX INFO: renamed from: d */
        public C0671kb.a f1087d;

        /* JADX INFO: renamed from: e */
        public int f1088e;

        /* JADX INFO: renamed from: f */
        public int f1089f;

        public d(C0671kb.a aVar) {
            this.f1085b = aVar;
            this.f1086c = aVar;
        }

        /* JADX INFO: renamed from: a */
        public final void m841a() {
            this.f1084a = 1;
            this.f1086c = this.f1085b;
            this.f1089f = 0;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m842b() {
            C0633ib c0633ibM972b = this.f1086c.f2510b.m972b();
            int iM849a = c0633ibM972b.m849a(6);
            return !(iM849a == 0 || ((ByteBuffer) c0633ibM972b.f1105d).get(iM849a + c0633ibM972b.f1102a) == 0) || this.f1088e == 65039;
        }
    }

    public C0296Q5(C0671kb c0671kb, C1094c.d dVar, C0277P4 c0277p4, Set set) {
        this.f1078a = dVar;
        this.f1079b = c0671kb;
        this.f1080c = c0277p4;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            m838c(str, 0, str.length(), 1, true, new c(str));
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m836a(Editable editable, KeyEvent keyEvent, boolean z) {
        AbstractC0313R5[] abstractC0313R5Arr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (abstractC0313R5Arr = (AbstractC0313R5[]) editable.getSpans(selectionStart, selectionEnd, AbstractC0313R5.class)) != null && abstractC0313R5Arr.length > 0) {
                for (AbstractC0313R5 abstractC0313R5 : abstractC0313R5Arr) {
                    int spanStart = editable.getSpanStart(abstractC0313R5);
                    int spanEnd = editable.getSpanEnd(abstractC0313R5);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m837b(CharSequence charSequence, int i, int i2, C0359Tf c0359Tf) {
        if ((c0359Tf.f1358c & 3) == 0) {
            C0277P4 c0277p4 = this.f1080c;
            C0633ib c0633ibM972b = c0359Tf.m972b();
            int iM849a = c0633ibM972b.m849a(8);
            if (iM849a != 0) {
                ((ByteBuffer) c0633ibM972b.f1105d).getShort(iM849a + c0633ibM972b.f1102a);
            }
            c0277p4.getClass();
            ThreadLocal<StringBuilder> threadLocal = C0277P4.f965b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = c0277p4.f966a;
            String string = sb.toString();
            int i3 = C0691lc.f2563a;
            boolean zM1553a = C0691lc.a.m1553a(textPaint, string);
            int i4 = c0359Tf.f1358c & 4;
            c0359Tf.f1358c = zM1553a ? i4 | 2 : i4 | 1;
        }
        return (c0359Tf.f1358c & 3) == 2;
    }

    /* JADX INFO: renamed from: c */
    public final <T> T m838c(CharSequence charSequence, int i, int i2, int i3, boolean z, b<T> bVar) {
        int i4;
        char c2;
        d dVar = new d(this.f1079b.f2507c);
        int iCodePointAt = Character.codePointAt(charSequence, i);
        boolean zMo840b = true;
        int i5 = 0;
        int iCharCount = i;
        loop0: while (true) {
            i4 = iCharCount;
            while (iCharCount < i2 && i5 < i3 && zMo840b) {
                SparseArray<C0671kb.a> sparseArray = dVar.f1086c.f2509a;
                C0671kb.a aVar = sparseArray == null ? null : sparseArray.get(iCodePointAt);
                if (dVar.f1084a == 2) {
                    if (aVar != null) {
                        dVar.f1086c = aVar;
                        dVar.f1089f++;
                    } else {
                        if (iCodePointAt == 65038) {
                            dVar.m841a();
                        } else if (iCodePointAt != 65039) {
                            C0671kb.a aVar2 = dVar.f1086c;
                            if (aVar2.f2510b != null) {
                                if (dVar.f1089f != 1) {
                                    dVar.f1087d = aVar2;
                                    dVar.m841a();
                                } else if (dVar.m842b()) {
                                    dVar.f1087d = dVar.f1086c;
                                    dVar.m841a();
                                } else {
                                    dVar.m841a();
                                }
                                c2 = 3;
                            } else {
                                dVar.m841a();
                            }
                        }
                        c2 = 1;
                    }
                    c2 = 2;
                } else if (aVar == null) {
                    dVar.m841a();
                    c2 = 1;
                } else {
                    dVar.f1084a = 2;
                    dVar.f1086c = aVar;
                    dVar.f1089f = 1;
                    c2 = 2;
                }
                dVar.f1088e = iCodePointAt;
                if (c2 == 1) {
                    iCharCount = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                    if (iCharCount < i2) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                } else if (c2 == 2) {
                    int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                    if (iCharCount2 < i2) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                    }
                    iCharCount = iCharCount2;
                } else if (c2 == 3) {
                    if (z || !m837b(charSequence, i4, iCharCount, dVar.f1087d.f2510b)) {
                        zMo840b = bVar.mo840b(charSequence, i4, iCharCount, dVar.f1087d.f2510b);
                        i5++;
                    }
                }
            }
            break loop0;
        }
        if (dVar.f1084a == 2 && dVar.f1086c.f2510b != null && ((dVar.f1089f > 1 || dVar.m842b()) && i5 < i3 && zMo840b && (z || !m837b(charSequence, i4, iCharCount, dVar.f1086c.f2510b)))) {
            bVar.mo840b(charSequence, i4, iCharCount, dVar.f1086c.f2510b);
        }
        return bVar.mo839a();
    }
}
