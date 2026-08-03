package Yue;

import Yue.C6898;
import Yue.InterfaceC7144;
import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۢۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
@InterfaceC7113(29)
public final class InspectionCompanionC3319 implements InspectionCompanion {

    /* JADX INFO: renamed from: ۥ */
    public boolean f224 = false;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f225;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f5216;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f5217;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f5218;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int f5219;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int f5220;

    public void mapProperties(@InterfaceC6391 PropertyMapper propertyMapper) {
        this.f225 = propertyMapper.mapObject("backgroundTint", C6898.C1110.f18403);
        this.f5216 = propertyMapper.mapObject("backgroundTintMode", C6898.C1110.f18404);
        this.f5217 = propertyMapper.mapObject("buttonTint", C6898.C1110.f18418);
        this.f5218 = propertyMapper.mapObject("buttonTintMode", C6898.C1110.f18419);
        this.f5219 = propertyMapper.mapObject("drawableTint", C6898.C1110.f18465);
        this.f5220 = propertyMapper.mapObject("drawableTintMode", C6898.C1110.f18466);
        this.f224 = true;
    }

    /* JADX DEBUG: Method merged with bridge method: readProperties(Ljava/lang/Object;Landroid/view/inspector/PropertyReader;)V */
    /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
    public void readProperties(@InterfaceC6391 C3320 c3320, @InterfaceC6391 PropertyReader propertyReader) {
        if (!this.f224) {
            throw C3275.m346();
        }
        propertyReader.readObject(this.f225, c3320.getBackgroundTintList());
        propertyReader.readObject(this.f5216, c3320.getBackgroundTintMode());
        propertyReader.readObject(this.f5217, c3320.getButtonTintList());
        propertyReader.readObject(this.f5218, c3320.getButtonTintMode());
        propertyReader.readObject(this.f5219, c3320.getCompoundDrawableTintList());
        propertyReader.readObject(this.f5220, c3320.getCompoundDrawableTintMode());
    }
}
