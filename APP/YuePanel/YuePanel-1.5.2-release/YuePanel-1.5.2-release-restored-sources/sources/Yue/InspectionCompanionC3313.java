package Yue;

import Yue.C6898;
import Yue.InterfaceC7144;
import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
@InterfaceC7113(29)
public final class InspectionCompanionC3313 implements InspectionCompanion {

    /* JADX INFO: renamed from: ۥ */
    public boolean f216 = false;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f217;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f5205;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f5206;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f5207;

    public void mapProperties(@InterfaceC6391 PropertyMapper propertyMapper) {
        this.f217 = propertyMapper.mapObject("backgroundTint", C6898.C1110.f18403);
        this.f5205 = propertyMapper.mapObject("backgroundTintMode", C6898.C1110.f18404);
        this.f5206 = propertyMapper.mapObject("tint", C6898.C1110.f18591);
        this.f5207 = propertyMapper.mapObject("tintMode", C6898.C1110.f18592);
        this.f216 = true;
    }

    /* JADX DEBUG: Method merged with bridge method: readProperties(Ljava/lang/Object;Landroid/view/inspector/PropertyReader;)V */
    /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
    public void readProperties(@InterfaceC6391 C3314 c3314, @InterfaceC6391 PropertyReader propertyReader) {
        if (!this.f216) {
            throw C3275.m346();
        }
        propertyReader.readObject(this.f217, c3314.getBackgroundTintList());
        propertyReader.readObject(this.f5205, c3314.getBackgroundTintMode());
        propertyReader.readObject(this.f5206, c3314.getImageTintList());
        propertyReader.readObject(this.f5207, c3314.getImageTintMode());
    }
}
