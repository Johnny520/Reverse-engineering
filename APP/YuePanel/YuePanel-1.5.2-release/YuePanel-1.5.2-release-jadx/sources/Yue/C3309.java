package Yue;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3309 {
    /* JADX INFO: renamed from: ۥ */
    public static InputConnection m378(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            ViewParent parent = view.getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    break;
                }
                if (parent instanceof InterfaceC8529) {
                    editorInfo.hintText = ((InterfaceC8529) parent).m4518();
                    break;
                }
                parent = parent.getParent();
            }
        }
        return inputConnection;
    }
}
