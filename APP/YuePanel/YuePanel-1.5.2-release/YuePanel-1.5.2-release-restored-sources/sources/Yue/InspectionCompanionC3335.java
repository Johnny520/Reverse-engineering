package Yue;

import Yue.C6898;
import Yue.InterfaceC7144;
import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۡۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
@InterfaceC7113(29)
public final class InspectionCompanionC3335 implements InspectionCompanion {

    /* JADX INFO: renamed from: ۥ */
    public boolean f227 = false;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f228;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f5263;

    public void mapProperties(@InterfaceC6391 PropertyMapper propertyMapper) {
        this.f228 = propertyMapper.mapObject("backgroundTint", C6898.C1110.f18403);
        this.f5263 = propertyMapper.mapObject("backgroundTintMode", C6898.C1110.f18404);
        this.f227 = true;
    }

    /* JADX DEBUG: Method merged with bridge method: readProperties(Ljava/lang/Object;Landroid/view/inspector/PropertyReader;)V */
    /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
    public void readProperties(@InterfaceC6391 C3327 c3327, @InterfaceC6391 PropertyReader propertyReader) {
        if (!this.f227) {
            throw C3275.m346();
        }
        propertyReader.readObject(this.f228, c3327.getBackgroundTintList());
        propertyReader.readObject(this.f5263, c3327.getBackgroundTintMode());
    }
}
