package Yue;

import Yue.C6898;
import Yue.InterfaceC7144;
import android.R;
import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: renamed from: Yue.ۥۡۧۧۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
@InterfaceC7113(29)
public final class InspectionCompanionC7273 implements InspectionCompanion {

    /* JADX INFO: renamed from: ۥ */
    public boolean f2776 = false;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f2777;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f21943;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f21944;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f21945;

    public void mapProperties(@InterfaceC6391 PropertyMapper propertyMapper) {
        this.f2777 = propertyMapper.mapInt("imeOptions", R.attr.imeOptions);
        this.f21943 = propertyMapper.mapInt("maxWidth", R.attr.maxWidth);
        this.f21944 = propertyMapper.mapBoolean("iconifiedByDefault", C6898.C1110.f18489);
        this.f21945 = propertyMapper.mapObject("queryHint", C6898.C1110.f18538);
        this.f2776 = true;
    }

    /* JADX DEBUG: Method merged with bridge method: readProperties(Ljava/lang/Object;Landroid/view/inspector/PropertyReader;)V */
    /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
    public void readProperties(@InterfaceC6391 SearchView searchView, @InterfaceC6391 PropertyReader propertyReader) {
        if (!this.f2776) {
            throw C3275.m346();
        }
        propertyReader.readInt(this.f2777, searchView.getImeOptions());
        propertyReader.readInt(this.f21943, searchView.getMaxWidth());
        propertyReader.readBoolean(this.f21944, searchView.m29129());
        propertyReader.readObject(this.f21945, searchView.getQueryHint());
    }
}
