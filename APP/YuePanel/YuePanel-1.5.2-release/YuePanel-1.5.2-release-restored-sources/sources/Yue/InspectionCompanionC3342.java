package Yue;

import Yue.C6898;
import Yue.InterfaceC7144;
import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
@InterfaceC7113(29)
public final class InspectionCompanionC3342 implements InspectionCompanion {

    /* JADX INFO: renamed from: ۥ */
    public boolean f235 = false;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f236;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f5285;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f5286;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f5287;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int f5288;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int f5289;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public int f5290;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int f5291;

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۡۨ$ۥ */
    public class C0113 implements IntFunction<String> {
        public C0113() {
        }

        /* JADX DEBUG: Method merged with bridge method: apply(I)Ljava/lang/Object; */
        @Override // java.util.function.IntFunction
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public String apply(int i) {
            return i != 0 ? i != 1 ? String.valueOf(i) : "uniform" : "none";
        }
    }

    public void mapProperties(@InterfaceC6391 PropertyMapper propertyMapper) {
        this.f236 = propertyMapper.mapInt("autoSizeMaxTextSize", C6898.C1110.f18395);
        this.f5285 = propertyMapper.mapInt("autoSizeMinTextSize", C6898.C1110.f18396);
        this.f5286 = propertyMapper.mapInt("autoSizeStepGranularity", C6898.C1110.f18398);
        this.f5287 = propertyMapper.mapIntEnum("autoSizeTextType", C6898.C1110.f18399, new C0113());
        this.f5288 = propertyMapper.mapObject("backgroundTint", C6898.C1110.f18403);
        this.f5289 = propertyMapper.mapObject("backgroundTintMode", C6898.C1110.f18404);
        this.f5290 = propertyMapper.mapObject("drawableTint", C6898.C1110.f18465);
        this.f5291 = propertyMapper.mapObject("drawableTintMode", C6898.C1110.f18466);
        this.f235 = true;
    }

    /* JADX DEBUG: Method merged with bridge method: readProperties(Ljava/lang/Object;Landroid/view/inspector/PropertyReader;)V */
    /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
    public void readProperties(@InterfaceC6391 C3343 c3343, @InterfaceC6391 PropertyReader propertyReader) {
        if (!this.f235) {
            throw C3275.m346();
        }
        propertyReader.readInt(this.f236, c3343.getAutoSizeMaxTextSize());
        propertyReader.readInt(this.f5285, c3343.getAutoSizeMinTextSize());
        propertyReader.readInt(this.f5286, c3343.getAutoSizeStepGranularity());
        propertyReader.readIntEnum(this.f5287, c3343.getAutoSizeTextType());
        propertyReader.readObject(this.f5288, c3343.getBackgroundTintList());
        propertyReader.readObject(this.f5289, c3343.getBackgroundTintMode());
        propertyReader.readObject(this.f5290, c3343.getCompoundDrawableTintList());
        propertyReader.readObject(this.f5291, c3343.getCompoundDrawableTintMode());
    }
}
