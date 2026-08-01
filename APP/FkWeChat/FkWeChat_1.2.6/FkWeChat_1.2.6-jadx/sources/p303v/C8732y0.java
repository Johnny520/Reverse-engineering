package p303v;

import androidx.compose.runtime.InterfaceC0564p5;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p166l2.AbstractC4606z0;

/* JADX INFO: renamed from: v.y0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m16757d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, m16758d2 = {"Lv/y0;", "Ll2/z0;", "Lv/a1;", _UrlKt.FRAGMENT_ENCODE_SET, "fraction", "Landroidx/compose/runtime/p5;", _UrlKt.FRAGMENT_ENCODE_SET, "widthState", "heightState", _UrlKt.FRAGMENT_ENCODE_SET, "inspectorName", "<init>", "(FLandroidx/compose/runtime/p5;Landroidx/compose/runtime/p5;Ljava/lang/String;)V", "m", "()Lv/a1;", "node", "Ll8/i0;", "n", "(Lv/a1;)V", _UrlKt.FRAGMENT_ENCODE_SET, "other", _UrlKt.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "b", "F", "getFraction", "()F", "c", "Landroidx/compose/runtime/p5;", "getWidthState", "()Landroidx/compose/runtime/p5;", "d", "getHeightState", "e", "Ljava/lang/String;", "getInspectorName", "()Ljava/lang/String;", "foundation_release"}, m16759k = 1, m16760mv = {2, 0, 0}, m16762xi = 48)
final class C8732y0 extends AbstractC4606z0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final float fraction;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final InterfaceC0564p5 widthState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final InterfaceC0564p5 heightState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final String inspectorName;

    public /* synthetic */ C8732y0(float f10, InterfaceC0564p5 interfaceC0564p5, InterfaceC0564p5 interfaceC0564p52, String str, int i10, AbstractC1043k abstractC1043k) {
        this(f10, (i10 & 2) != 0 ? null : interfaceC0564p5, (i10 & 4) != 0 ? null : interfaceC0564p52, str);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C8732y0)) {
            return false;
        }
        C8732y0 c8732y0 = (C8732y0) other;
        return this.fraction == c8732y0.fraction && AbstractC1061t.m3842c(this.widthState, c8732y0.widthState) && AbstractC1061t.m3842c(this.heightState, c8732y0.heightState);
    }

    public int hashCode() {
        InterfaceC0564p5 interfaceC0564p5 = this.widthState;
        int iHashCode = (interfaceC0564p5 != null ? interfaceC0564p5.hashCode() : 0) * 31;
        InterfaceC0564p5 interfaceC0564p52 = this.heightState;
        return ((iHashCode + (interfaceC0564p52 != null ? interfaceC0564p52.hashCode() : 0)) * 31) + Float.hashCode(this.fraction);
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C8684a1 mo1191j() {
        return new C8684a1(this.fraction, this.widthState, this.heightState);
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo1192k(C8684a1 node) {
        node.m33367H2(this.fraction);
        node.m33369J2(this.widthState);
        node.m33368I2(this.heightState);
    }

    public C8732y0(float f10, InterfaceC0564p5 interfaceC0564p5, InterfaceC0564p5 interfaceC0564p52, String str) {
        this.fraction = f10;
        this.widthState = interfaceC0564p5;
        this.heightState = interfaceC0564p52;
        this.inspectorName = str;
    }
}
