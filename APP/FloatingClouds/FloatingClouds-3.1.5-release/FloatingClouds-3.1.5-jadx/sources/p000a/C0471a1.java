package p000a;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.appcompat.C0983R;
import androidx.emoji2.text.C1094c;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p000a.C0188K5;
import p000a.C0349T5;

/* JADX INFO: renamed from: a.a1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0471a1 {

    /* JADX INFO: renamed from: a */
    public final EditText f1751a;

    /* JADX INFO: renamed from: b */
    public final C0188K5 f1752b;

    public C0471a1(EditText editText) {
        this.f1751a = editText;
        this.f1752b = new C0188K5(editText);
    }

    /* JADX INFO: renamed from: a */
    public final KeyListener m1146a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        this.f1752b.f654a.getClass();
        if (keyListener instanceof C0278P5) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new C0278P5(keyListener);
    }

    /* JADX INFO: renamed from: b */
    public final void m1147b(AttributeSet attributeSet, int i) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes = this.f1751a.getContext().obtainStyledAttributes(attributeSet, C0983R.styleable.AppCompatTextView, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(C0983R.styleable.AppCompatTextView_emojiCompatEnabled) ? typedArrayObtainStyledAttributes.getBoolean(C0983R.styleable.AppCompatTextView_emojiCompatEnabled, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            m1149d(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final C0242N5 m1148c(InputConnection inputConnection, EditorInfo editorInfo) {
        C0188K5 c0188k5 = this.f1752b;
        if (inputConnection == null) {
            c0188k5.getClass();
            inputConnection = null;
        } else {
            C0188K5.a aVar = c0188k5.f654a;
            aVar.getClass();
            if (!(inputConnection instanceof C0242N5)) {
                inputConnection = new C0242N5(aVar.f655a, inputConnection, editorInfo);
            }
        }
        return (C0242N5) inputConnection;
    }

    /* JADX INFO: renamed from: d */
    public final void m1149d(boolean z) throws Throwable {
        C0349T5 c0349t5 = this.f1752b.f654a.f656b;
        if (c0349t5.f1242c != z) {
            if (c0349t5.f1241b != null) {
                C1094c c1094cM2505a = C1094c.m2505a();
                C0349T5.a aVar = c0349t5.f1241b;
                c1094cM2505a.getClass();
                C0726n9.m1665h(aVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = c1094cM2505a.f4485a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    c1094cM2505a.f4486b.remove(aVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            c0349t5.f1242c = z;
            if (z) {
                C0349T5.m942a(c0349t5.f1240a, C1094c.m2505a().m2506b());
            }
        }
    }
}
