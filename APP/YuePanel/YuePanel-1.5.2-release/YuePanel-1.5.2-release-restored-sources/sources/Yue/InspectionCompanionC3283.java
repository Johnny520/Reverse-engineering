package Yue;

import Yue.C6898;
import Yue.InterfaceC7144;
import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: Yue.ۥ۟ۡ۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
@InterfaceC7113(29)
public final class InspectionCompanionC3283 implements InspectionCompanion {

    /* JADX INFO: renamed from: ۥ */
    public boolean f189 = false;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f190;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f5155;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f5156;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f5157;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int f5158;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int f5159;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public int f5160;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int f5161;

    /* JADX INFO: renamed from: Yue.ۥ۟ۡ۟ۤ$ۥ */
    public class C0100 implements IntFunction<String> {
        public C0100() {
        }

        /* JADX DEBUG: Method merged with bridge method: apply(I)Ljava/lang/Object; */
        @Override // java.util.function.IntFunction
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public String apply(int i) {
            return i != 0 ? i != 1 ? String.valueOf(i) : "uniform" : "none";
        }
    }

    public void mapProperties(@InterfaceC6391 PropertyMapper propertyMapper) {
        this.f190 = propertyMapper.mapInt("autoSizeMaxTextSize", C6898.C1110.f18395);
        this.f5155 = propertyMapper.mapInt("autoSizeMinTextSize", C6898.C1110.f18396);
        this.f5156 = propertyMapper.mapInt("autoSizeStepGranularity", C6898.C1110.f18398);
        this.f5157 = propertyMapper.mapIntEnum("autoSizeTextType", C6898.C1110.f18399, new C0100());
        this.f5158 = propertyMapper.mapObject("backgroundTint", C6898.C1110.f18403);
        this.f5159 = propertyMapper.mapObject("backgroundTintMode", C6898.C1110.f18404);
        this.f5160 = propertyMapper.mapObject("drawableTint", C6898.C1110.f18465);
        this.f5161 = propertyMapper.mapObject("drawableTintMode", C6898.C1110.f18466);
        this.f189 = true;
    }

    /* JADX DEBUG: Method merged with bridge method: readProperties(Ljava/lang/Object;Landroid/view/inspector/PropertyReader;)V */
    /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
    public void readProperties(@InterfaceC6391 C3284 c3284, @InterfaceC6391 PropertyReader propertyReader) {
        if (!this.f189) {
            throw C3275.m346();
        }
        propertyReader.readInt(this.f190, c3284.getAutoSizeMaxTextSize());
        propertyReader.readInt(this.f5155, c3284.getAutoSizeMinTextSize());
        propertyReader.readInt(this.f5156, c3284.getAutoSizeStepGranularity());
        propertyReader.readIntEnum(this.f5157, c3284.getAutoSizeTextType());
        propertyReader.readObject(this.f5158, c3284.getBackgroundTintList());
        propertyReader.readObject(this.f5159, c3284.getBackgroundTintMode());
        propertyReader.readObject(this.f5160, c3284.getCompoundDrawableTintList());
        propertyReader.readObject(this.f5161, c3284.getCompoundDrawableTintMode());
    }
}
