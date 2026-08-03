package Yue;

import Yue.C6898;
import Yue.InterfaceC7144;
import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
@InterfaceC7113(29)
public final class InspectionCompanionC3310 implements InspectionCompanion {

    /* JADX INFO: renamed from: ۥ */
    public boolean f212 = false;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f213;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f5199;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f5200;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f5201;

    public void mapProperties(@InterfaceC6391 PropertyMapper propertyMapper) {
        this.f213 = propertyMapper.mapObject("backgroundTint", C6898.C1110.f18403);
        this.f5199 = propertyMapper.mapObject("backgroundTintMode", C6898.C1110.f18404);
        this.f5200 = propertyMapper.mapObject("tint", C6898.C1110.f18591);
        this.f5201 = propertyMapper.mapObject("tintMode", C6898.C1110.f18592);
        this.f212 = true;
    }

    /* JADX DEBUG: Method merged with bridge method: readProperties(Ljava/lang/Object;Landroid/view/inspector/PropertyReader;)V */
    /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
    public void readProperties(@InterfaceC6391 C3311 c3311, @InterfaceC6391 PropertyReader propertyReader) {
        if (!this.f212) {
            throw C3275.m346();
        }
        propertyReader.readObject(this.f213, c3311.getBackgroundTintList());
        propertyReader.readObject(this.f5199, c3311.getBackgroundTintMode());
        propertyReader.readObject(this.f5200, c3311.getImageTintList());
        propertyReader.readObject(this.f5201, c3311.getImageTintMode());
    }
}
