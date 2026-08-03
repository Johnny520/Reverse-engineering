package Yue;

import Yue.C6898;
import Yue.InterfaceC7144;
import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: renamed from: Yue.ۥۢۡۨۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
@InterfaceC7113(29)
public final class InspectionCompanionC7938 implements InspectionCompanion {

    /* JADX INFO: renamed from: ۥ */
    public boolean f3127 = false;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f3128;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f23617;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f23618;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f23619;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int f23620;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int f23621;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public int f23622;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int f23623;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public int f23624;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public int f23625;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public int f23626;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public int f23627;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public int f23628;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public int f23629;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public int f23630;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public int f23631;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public int f23632;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public int f23633;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public int f23634;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int f23635;

    public void mapProperties(@InterfaceC6391 PropertyMapper propertyMapper) {
        this.f3128 = propertyMapper.mapObject("collapseContentDescription", C6898.C1110.f18427);
        this.f23617 = propertyMapper.mapObject("collapseIcon", C6898.C1110.f18428);
        this.f23618 = propertyMapper.mapInt("contentInsetEnd", C6898.C1110.f18442);
        this.f23619 = propertyMapper.mapInt("contentInsetEndWithActions", C6898.C1110.f18443);
        this.f23620 = propertyMapper.mapInt("contentInsetLeft", C6898.C1110.f18444);
        this.f23621 = propertyMapper.mapInt("contentInsetRight", C6898.C1110.f18445);
        this.f23622 = propertyMapper.mapInt("contentInsetStart", C6898.C1110.f18446);
        this.f23623 = propertyMapper.mapInt("contentInsetStartWithNavigation", C6898.C1110.f18447);
        this.f23624 = propertyMapper.mapObject("logo", C6898.C1110.f18513);
        this.f23625 = propertyMapper.mapObject("logoDescription", C6898.C1110.f18514);
        this.f23626 = propertyMapper.mapObject(C7683.f23124, C6898.C1110.f18517);
        this.f23627 = propertyMapper.mapObject("navigationContentDescription", C6898.C1110.f18519);
        this.f23628 = propertyMapper.mapObject("navigationIcon", C6898.C1110.f18520);
        this.f23629 = propertyMapper.mapResourceId("popupTheme", C6898.C1110.f18532);
        this.f23630 = propertyMapper.mapObject("subtitle", C6898.C1110.f18562);
        this.f23631 = propertyMapper.mapObject(C6468.f16546, C6898.C1110.f18593);
        this.f23632 = propertyMapper.mapInt("titleMarginBottom", C6898.C1110.f18595);
        this.f23633 = propertyMapper.mapInt("titleMarginEnd", C6898.C1110.f18596);
        this.f23634 = propertyMapper.mapInt("titleMarginStart", C6898.C1110.f18597);
        this.f23635 = propertyMapper.mapInt("titleMarginTop", C6898.C1110.f18598);
        this.f3127 = true;
    }

    /* JADX DEBUG: Method merged with bridge method: readProperties(Ljava/lang/Object;Landroid/view/inspector/PropertyReader;)V */
    /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
    public void readProperties(@InterfaceC6391 Toolbar toolbar, @InterfaceC6391 PropertyReader propertyReader) {
        if (!this.f3127) {
            throw C3275.m346();
        }
        propertyReader.readObject(this.f3128, toolbar.getCollapseContentDescription());
        propertyReader.readObject(this.f23617, toolbar.getCollapseIcon());
        propertyReader.readInt(this.f23618, toolbar.getContentInsetEnd());
        propertyReader.readInt(this.f23619, toolbar.getContentInsetEndWithActions());
        propertyReader.readInt(this.f23620, toolbar.getContentInsetLeft());
        propertyReader.readInt(this.f23621, toolbar.getContentInsetRight());
        propertyReader.readInt(this.f23622, toolbar.getContentInsetStart());
        propertyReader.readInt(this.f23623, toolbar.getContentInsetStartWithNavigation());
        propertyReader.readObject(this.f23624, toolbar.getLogo());
        propertyReader.readObject(this.f23625, toolbar.getLogoDescription());
        propertyReader.readObject(this.f23626, toolbar.getMenu());
        propertyReader.readObject(this.f23627, toolbar.getNavigationContentDescription());
        propertyReader.readObject(this.f23628, toolbar.getNavigationIcon());
        propertyReader.readResourceId(this.f23629, toolbar.getPopupTheme());
        propertyReader.readObject(this.f23630, toolbar.getSubtitle());
        propertyReader.readObject(this.f23631, toolbar.getTitle());
        propertyReader.readInt(this.f23632, toolbar.getTitleMarginBottom());
        propertyReader.readInt(this.f23633, toolbar.getTitleMarginEnd());
        propertyReader.readInt(this.f23634, toolbar.getTitleMarginStart());
        propertyReader.readInt(this.f23635, toolbar.getTitleMarginTop());
    }
}
