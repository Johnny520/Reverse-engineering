package Yue;

import Yue.C6898;
import Yue.InterfaceC7144;
import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;

/* JADX INFO: renamed from: Yue.ۥ۟ۡ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
@InterfaceC7113(29)
public final class InspectionCompanionC3288 implements InspectionCompanion {

    /* JADX INFO: renamed from: ۥ */
    public boolean f194 = false;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f195;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f5167;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f5168;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f5169;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int f5170;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int f5171;

    public void mapProperties(@InterfaceC6391 PropertyMapper propertyMapper) {
        this.f195 = propertyMapper.mapObject("backgroundTint", C6898.C1110.f18403);
        this.f5167 = propertyMapper.mapObject("backgroundTintMode", C6898.C1110.f18404);
        this.f5168 = propertyMapper.mapObject("checkMarkTint", C6898.C1110.f18421);
        this.f5169 = propertyMapper.mapObject("checkMarkTintMode", C6898.C1110.f18422);
        this.f5170 = propertyMapper.mapObject("drawableTint", C6898.C1110.f18465);
        this.f5171 = propertyMapper.mapObject("drawableTintMode", C6898.C1110.f18466);
        this.f194 = true;
    }

    /* JADX DEBUG: Method merged with bridge method: readProperties(Ljava/lang/Object;Landroid/view/inspector/PropertyReader;)V */
    /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
    public void readProperties(@InterfaceC6391 C3289 c3289, @InterfaceC6391 PropertyReader propertyReader) {
        if (!this.f194) {
            throw C3275.m346();
        }
        propertyReader.readObject(this.f195, c3289.getBackgroundTintList());
        propertyReader.readObject(this.f5167, c3289.getBackgroundTintMode());
        propertyReader.readObject(this.f5168, c3289.getCheckMarkTintList());
        propertyReader.readObject(this.f5169, c3289.getCheckMarkTintMode());
        propertyReader.readObject(this.f5170, c3289.getCompoundDrawableTintList());
        propertyReader.readObject(this.f5171, c3289.getCompoundDrawableTintMode());
    }
}
