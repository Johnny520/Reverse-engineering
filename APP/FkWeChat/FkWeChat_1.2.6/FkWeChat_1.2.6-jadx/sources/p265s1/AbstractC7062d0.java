package p265s1;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import p265s1.AbstractC7168z0;

/* JADX INFO: renamed from: s1.d0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7062d0 {
    /* JADX INFO: renamed from: a */
    public static final BlendMode m27777a(int i10) {
        AbstractC7168z0.a aVar = AbstractC7168z0.f23700a;
        return AbstractC7168z0.m28276E(i10, aVar.m28308a()) ? BlendMode.CLEAR : AbstractC7168z0.m28276E(i10, aVar.m28331x()) ? BlendMode.SRC : AbstractC7168z0.m28276E(i10, aVar.m28314g()) ? BlendMode.DST : AbstractC7168z0.m28276E(i10, aVar.m28306B()) ? BlendMode.SRC_OVER : AbstractC7168z0.m28276E(i10, aVar.m28318k()) ? BlendMode.DST_OVER : AbstractC7168z0.m28276E(i10, aVar.m28333z()) ? BlendMode.SRC_IN : AbstractC7168z0.m28276E(i10, aVar.m28316i()) ? BlendMode.DST_IN : AbstractC7168z0.m28276E(i10, aVar.m28305A()) ? BlendMode.SRC_OUT : AbstractC7168z0.m28276E(i10, aVar.m28317j()) ? BlendMode.DST_OUT : AbstractC7168z0.m28276E(i10, aVar.m28332y()) ? BlendMode.SRC_ATOP : AbstractC7168z0.m28276E(i10, aVar.m28315h()) ? BlendMode.DST_ATOP : AbstractC7168z0.m28276E(i10, aVar.m28307C()) ? BlendMode.XOR : AbstractC7168z0.m28276E(i10, aVar.m28327t()) ? BlendMode.PLUS : AbstractC7168z0.m28276E(i10, aVar.m28324q()) ? BlendMode.MODULATE : AbstractC7168z0.m28276E(i10, aVar.m28329v()) ? BlendMode.SCREEN : AbstractC7168z0.m28276E(i10, aVar.m28326s()) ? BlendMode.OVERLAY : AbstractC7168z0.m28276E(i10, aVar.m28312e()) ? BlendMode.DARKEN : AbstractC7168z0.m28276E(i10, aVar.m28322o()) ? BlendMode.LIGHTEN : AbstractC7168z0.m28276E(i10, aVar.m28311d()) ? BlendMode.COLOR_DODGE : AbstractC7168z0.m28276E(i10, aVar.m28310c()) ? BlendMode.COLOR_BURN : AbstractC7168z0.m28276E(i10, aVar.m28320m()) ? BlendMode.HARD_LIGHT : AbstractC7168z0.m28276E(i10, aVar.m28330w()) ? BlendMode.SOFT_LIGHT : AbstractC7168z0.m28276E(i10, aVar.m28313f()) ? BlendMode.DIFFERENCE : AbstractC7168z0.m28276E(i10, aVar.m28319l()) ? BlendMode.EXCLUSION : AbstractC7168z0.m28276E(i10, aVar.m28325r()) ? BlendMode.MULTIPLY : AbstractC7168z0.m28276E(i10, aVar.m28321n()) ? BlendMode.HUE : AbstractC7168z0.m28276E(i10, aVar.m28328u()) ? BlendMode.SATURATION : AbstractC7168z0.m28276E(i10, aVar.m28309b()) ? BlendMode.COLOR : AbstractC7168z0.m28276E(i10, aVar.m28323p()) ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    /* JADX INFO: renamed from: b */
    public static final PorterDuff.Mode m27778b(int i10) {
        AbstractC7168z0.a aVar = AbstractC7168z0.f23700a;
        return AbstractC7168z0.m28276E(i10, aVar.m28308a()) ? PorterDuff.Mode.CLEAR : AbstractC7168z0.m28276E(i10, aVar.m28331x()) ? PorterDuff.Mode.SRC : AbstractC7168z0.m28276E(i10, aVar.m28314g()) ? PorterDuff.Mode.DST : AbstractC7168z0.m28276E(i10, aVar.m28306B()) ? PorterDuff.Mode.SRC_OVER : AbstractC7168z0.m28276E(i10, aVar.m28318k()) ? PorterDuff.Mode.DST_OVER : AbstractC7168z0.m28276E(i10, aVar.m28333z()) ? PorterDuff.Mode.SRC_IN : AbstractC7168z0.m28276E(i10, aVar.m28316i()) ? PorterDuff.Mode.DST_IN : AbstractC7168z0.m28276E(i10, aVar.m28305A()) ? PorterDuff.Mode.SRC_OUT : AbstractC7168z0.m28276E(i10, aVar.m28317j()) ? PorterDuff.Mode.DST_OUT : AbstractC7168z0.m28276E(i10, aVar.m28332y()) ? PorterDuff.Mode.SRC_ATOP : AbstractC7168z0.m28276E(i10, aVar.m28315h()) ? PorterDuff.Mode.DST_ATOP : AbstractC7168z0.m28276E(i10, aVar.m28307C()) ? PorterDuff.Mode.XOR : AbstractC7168z0.m28276E(i10, aVar.m28327t()) ? PorterDuff.Mode.ADD : AbstractC7168z0.m28276E(i10, aVar.m28329v()) ? PorterDuff.Mode.SCREEN : AbstractC7168z0.m28276E(i10, aVar.m28326s()) ? PorterDuff.Mode.OVERLAY : AbstractC7168z0.m28276E(i10, aVar.m28312e()) ? PorterDuff.Mode.DARKEN : AbstractC7168z0.m28276E(i10, aVar.m28322o()) ? PorterDuff.Mode.LIGHTEN : AbstractC7168z0.m28276E(i10, aVar.m28324q()) ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }
}
