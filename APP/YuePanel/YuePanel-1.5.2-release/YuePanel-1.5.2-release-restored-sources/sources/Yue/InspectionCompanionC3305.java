package Yue;

import Yue.C6898;
import Yue.InterfaceC7144;
import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
@InterfaceC7113(29)
public final class InspectionCompanionC3305 implements InspectionCompanion {

    /* JADX INFO: renamed from: ۥ */
    public boolean f205 = false;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f206;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f5196;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f5197;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f5198;

    public void mapProperties(@InterfaceC6391 PropertyMapper propertyMapper) {
        this.f206 = propertyMapper.mapObject("backgroundTint", C6898.C1110.f18403);
        this.f5196 = propertyMapper.mapObject("backgroundTintMode", C6898.C1110.f18404);
        this.f5197 = propertyMapper.mapObject("drawableTint", C6898.C1110.f18465);
        this.f5198 = propertyMapper.mapObject("drawableTintMode", C6898.C1110.f18466);
        this.f205 = true;
    }

    /* JADX DEBUG: Method merged with bridge method: readProperties(Ljava/lang/Object;Landroid/view/inspector/PropertyReader;)V */
    /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
    public void readProperties(@InterfaceC6391 C3306 c3306, @InterfaceC6391 PropertyReader propertyReader) {
        if (!this.f205) {
            throw C3275.m346();
        }
        propertyReader.readObject(this.f206, c3306.getBackgroundTintList());
        propertyReader.readObject(this.f5196, c3306.getBackgroundTintMode());
        propertyReader.readObject(this.f5197, c3306.getCompoundDrawableTintList());
        propertyReader.readObject(this.f5198, c3306.getCompoundDrawableTintMode());
    }
}
