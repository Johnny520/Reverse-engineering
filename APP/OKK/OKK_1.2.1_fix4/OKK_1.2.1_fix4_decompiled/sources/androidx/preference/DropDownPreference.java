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

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C1031R.attr.dropdownPreferenceStyle);
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_dropdown_item);
        this.f1505j = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.f1506h;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: b */
    public final void mo1263b() {
        ArrayAdapter arrayAdapter = this.f1505j;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }
}
