package yyds;

import android.R;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: yyds.ᛵᲇᛲᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1215 {
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    static TextView m2474(View view) {
        if (!(view instanceof TextView)) {
            View viewFindViewById = view.findViewById(R.id.message);
            if (viewFindViewById instanceof TextView) {
                return (TextView) viewFindViewById;
            }
            C0188.m798("You must include a TextView with an ID value of message (xml code: android:id=\"@android:id/message\", java code: view.setId(android.R.id.message))");
            return null;
        }
        if (view.getId() == -1) {
            view.setId(R.id.message);
        } else if (view.getId() != 16908299) {
            C0188.m798("You must set the ID value of TextView to android.R.id.message");
            return null;
        }
        return (TextView) view;
    }

    void cancel();

    void setDuration(int i);

    void setGravity(int i, int i2, int i3);

    void setMargin(float f, float f2);

    void setText(CharSequence charSequence);

    void setView(View view);

    void show();
}
