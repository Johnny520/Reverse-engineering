package Yue;

import Yue.C6898;
import Yue.InterfaceC7144;
import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۤۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
@InterfaceC7113(29)
public final class InspectionCompanionC3351 implements InspectionCompanion {

    /* JADX INFO: renamed from: ۥ */
    public boolean f242 = false;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f243;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f5310;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f5311;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f5312;

    public void mapProperties(@InterfaceC6391 PropertyMapper propertyMapper) {
        this.f243 = propertyMapper.mapObject("backgroundTint", C6898.C1110.f18403);
        this.f5310 = propertyMapper.mapObject("backgroundTintMode", C6898.C1110.f18404);
        this.f5311 = propertyMapper.mapObject("drawableTint", C6898.C1110.f18465);
        this.f5312 = propertyMapper.mapObject("drawableTintMode", C6898.C1110.f18466);
        this.f242 = true;
    }

    /* JADX DEBUG: Method merged with bridge method: readProperties(Ljava/lang/Object;Landroid/view/inspector/PropertyReader;)V */
    /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
    public void readProperties(@InterfaceC6391 C3352 c3352, @InterfaceC6391 PropertyReader propertyReader) {
        if (!this.f242) {
            throw C3275.m346();
        }
        propertyReader.readObject(this.f243, c3352.getBackgroundTintList());
        propertyReader.readObject(this.f5310, c3352.getBackgroundTintMode());
        propertyReader.readObject(this.f5311, c3352.getCompoundDrawableTintList());
        propertyReader.readObject(this.f5312, c3352.getCompoundDrawableTintMode());
    }
}
