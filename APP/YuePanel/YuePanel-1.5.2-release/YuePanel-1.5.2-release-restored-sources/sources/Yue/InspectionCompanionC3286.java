package Yue;

import Yue.C6898;
import Yue.InterfaceC7144;
import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;

/* JADX INFO: renamed from: Yue.ۥ۟ۡ۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
@InterfaceC7113(29)
public final class InspectionCompanionC3286 implements InspectionCompanion {

    /* JADX INFO: renamed from: ۥ */
    public boolean f192 = false;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f193;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f5162;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f5163;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f5164;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int f5165;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int f5166;

    public void mapProperties(@InterfaceC6391 PropertyMapper propertyMapper) {
        this.f193 = propertyMapper.mapObject("backgroundTint", C6898.C1110.f18403);
        this.f5162 = propertyMapper.mapObject("backgroundTintMode", C6898.C1110.f18404);
        this.f5163 = propertyMapper.mapObject("buttonTint", C6898.C1110.f18418);
        this.f5164 = propertyMapper.mapObject("buttonTintMode", C6898.C1110.f18419);
        this.f5165 = propertyMapper.mapObject("drawableTint", C6898.C1110.f18465);
        this.f5166 = propertyMapper.mapObject("drawableTintMode", C6898.C1110.f18466);
        this.f192 = true;
    }

    /* JADX DEBUG: Method merged with bridge method: readProperties(Ljava/lang/Object;Landroid/view/inspector/PropertyReader;)V */
    /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
    public void readProperties(@InterfaceC6391 C3287 c3287, @InterfaceC6391 PropertyReader propertyReader) {
        if (!this.f192) {
            throw C3275.m346();
        }
        propertyReader.readObject(this.f193, c3287.getBackgroundTintList());
        propertyReader.readObject(this.f5162, c3287.getBackgroundTintMode());
        propertyReader.readObject(this.f5163, c3287.getButtonTintList());
        propertyReader.readObject(this.f5164, c3287.getButtonTintMode());
        propertyReader.readObject(this.f5165, c3287.getCompoundDrawableTintList());
        propertyReader.readObject(this.f5166, c3287.getCompoundDrawableTintMode());
    }
}
