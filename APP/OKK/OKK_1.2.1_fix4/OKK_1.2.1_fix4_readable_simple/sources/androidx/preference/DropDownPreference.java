package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import org.luckypray.dexkit.C1031R;

/* JADX INFO: loaded from: classes.dex */
public class DropDownPreference extends ListPreference {

    /* JADX INFO: renamed from: j */
    public final ArrayAdapter f1505j;

    public DropDownPreference(Context r4, AttributeSet r5) {
        super(r4, r5, C1031R.attr.dropdownPreferenceStyle);
        ArrayAdapter r52 = new ArrayAdapter(r4, R.layout.simple_spinner_dropdown_item);
        this.f1505j = r52;
        r52.clear();
        CharSequence[] r42 = this.f1506h;
        if (r42 == null) goto L7;
        int r02 = r42.length;
        int r1 = 0;
    L5:
        if (r1 >= r02) goto L9;
        r52.add(r42[r1].toString());
        r1 = r1 + 1;
        goto L5
    L9:
        return;
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: b */
    public final void mo1263b() {
        ArrayAdapter r02 = this.f1505j;
        if (r02 == null) goto L6;
        r02.notifyDataSetChanged();
        return;
    }
}
