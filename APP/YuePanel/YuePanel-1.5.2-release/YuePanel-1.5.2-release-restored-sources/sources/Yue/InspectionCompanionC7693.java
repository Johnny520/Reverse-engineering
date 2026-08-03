package Yue;

import Yue.C6898;
import Yue.InterfaceC7144;
import android.R;
import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;

/* JADX INFO: renamed from: Yue.ۥۢ۠ۦۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
@InterfaceC7113(29)
public final class InspectionCompanionC7693 implements InspectionCompanion {

    /* JADX INFO: renamed from: ۥ */
    public boolean f3023 = false;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f3024;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f23186;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f23187;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f23188;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int f23189;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int f23190;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public int f23191;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int f23192;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public int f23193;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public int f23194;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public int f23195;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public int f23196;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public int f23197;

    public void mapProperties(@InterfaceC6391 PropertyMapper propertyMapper) {
        this.f3024 = propertyMapper.mapObject("textOff", R.attr.textOff);
        this.f23186 = propertyMapper.mapObject("textOn", R.attr.textOn);
        this.f23187 = propertyMapper.mapObject("thumb", R.attr.thumb);
        this.f23188 = propertyMapper.mapBoolean("showText", C6898.C1110.f18551);
        this.f23189 = propertyMapper.mapBoolean("splitTrack", C6898.C1110.f18557);
        this.f23190 = propertyMapper.mapInt("switchMinWidth", C6898.C1110.f18567);
        this.f23191 = propertyMapper.mapInt("switchPadding", C6898.C1110.f18568);
        this.f23192 = propertyMapper.mapInt("thumbTextPadding", C6898.C1110.f18585);
        this.f23193 = propertyMapper.mapObject("thumbTint", C6898.C1110.f18586);
        this.f23194 = propertyMapper.mapObject("thumbTintMode", C6898.C1110.f18587);
        this.f23195 = propertyMapper.mapObject("track", C6898.C1110.f18608);
        this.f23196 = propertyMapper.mapObject("trackTint", C6898.C1110.f18609);
        this.f23197 = propertyMapper.mapObject("trackTintMode", C6898.C1110.f18610);
        this.f3023 = true;
    }

    /* JADX DEBUG: Method merged with bridge method: readProperties(Ljava/lang/Object;Landroid/view/inspector/PropertyReader;)V */
    /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
    public void readProperties(@InterfaceC6391 C7692 c7692, @InterfaceC6391 PropertyReader propertyReader) {
        if (!this.f3023) {
            throw C3275.m346();
        }
        propertyReader.readObject(this.f3024, c7692.getTextOff());
        propertyReader.readObject(this.f23186, c7692.getTextOn());
        propertyReader.readObject(this.f23187, c7692.getThumbDrawable());
        propertyReader.readBoolean(this.f23188, c7692.getShowText());
        propertyReader.readBoolean(this.f23189, c7692.getSplitTrack());
        propertyReader.readInt(this.f23190, c7692.getSwitchMinWidth());
        propertyReader.readInt(this.f23191, c7692.getSwitchPadding());
        propertyReader.readInt(this.f23192, c7692.getThumbTextPadding());
        propertyReader.readObject(this.f23193, c7692.getThumbTintList());
        propertyReader.readObject(this.f23194, c7692.getThumbTintMode());
        propertyReader.readObject(this.f23195, c7692.getTrackDrawable());
        propertyReader.readObject(this.f23196, c7692.getTrackTintList());
        propertyReader.readObject(this.f23197, c7692.getTrackTintMode());
    }
}
