package Yue;

import Yue.C6898;
import Yue.InterfaceC7144;
import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
@InterfaceC7113(29)
public final class InspectionCompanionC3315 implements InspectionCompanion {

    /* JADX INFO: renamed from: ۥ */
    public boolean f218 = false;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f219;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f5208;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f5209;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f5210;

    public void mapProperties(@InterfaceC6391 PropertyMapper propertyMapper) {
        this.f219 = propertyMapper.mapObject("backgroundTint", C6898.C1110.f18403);
        this.f5208 = propertyMapper.mapObject("backgroundTintMode", C6898.C1110.f18404);
        this.f5209 = propertyMapper.mapObject("drawableTint", C6898.C1110.f18465);
        this.f5210 = propertyMapper.mapObject("drawableTintMode", C6898.C1110.f18466);
        this.f218 = true;
    }

    /* JADX DEBUG: Method merged with bridge method: readProperties(Ljava/lang/Object;Landroid/view/inspector/PropertyReader;)V */
    /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
    public void readProperties(@InterfaceC6391 C3316 c3316, @InterfaceC6391 PropertyReader propertyReader) {
        if (!this.f218) {
            throw C3275.m346();
        }
        propertyReader.readObject(this.f219, c3316.getBackgroundTintList());
        propertyReader.readObject(this.f5208, c3316.getBackgroundTintMode());
        propertyReader.readObject(this.f5209, c3316.getCompoundDrawableTintList());
        propertyReader.readObject(this.f5210, c3316.getCompoundDrawableTintMode());
    }
}
