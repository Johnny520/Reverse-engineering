package Yue;

import Yue.C6898;
import Yue.InterfaceC7144;
import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;

/* JADX INFO: renamed from: Yue.ۥ۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
@InterfaceC7113(29)
public final class InspectionCompanionC3276 implements InspectionCompanion {

    /* JADX INFO: renamed from: ۥ */
    public boolean f185 = false;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f186;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f5148;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f5149;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f5150;

    public void mapProperties(@InterfaceC6391 PropertyMapper propertyMapper) {
        this.f186 = propertyMapper.mapObject("backgroundTint", C6898.C1110.f18403);
        this.f5148 = propertyMapper.mapObject("backgroundTintMode", C6898.C1110.f18404);
        this.f5149 = propertyMapper.mapObject("drawableTint", C6898.C1110.f18465);
        this.f5150 = propertyMapper.mapObject("drawableTintMode", C6898.C1110.f18466);
        this.f185 = true;
    }

    /* JADX DEBUG: Method merged with bridge method: readProperties(Ljava/lang/Object;Landroid/view/inspector/PropertyReader;)V */
    /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
    public void readProperties(@InterfaceC6391 C3277 c3277, @InterfaceC6391 PropertyReader propertyReader) {
        if (!this.f185) {
            throw C3275.m346();
        }
        propertyReader.readObject(this.f186, c3277.getBackgroundTintList());
        propertyReader.readObject(this.f5148, c3277.getBackgroundTintMode());
        propertyReader.readObject(this.f5149, c3277.getCompoundDrawableTintList());
        propertyReader.readObject(this.f5150, c3277.getCompoundDrawableTintMode());
    }
}
