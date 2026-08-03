package Yue;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* JADX INFO: renamed from: Yue.ۥ۟ۤ۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7113(21)
public class C3679 implements InterfaceC3682 {
    @Override // Yue.InterfaceC3682
    /* JADX INFO: renamed from: ۥ */
    public void mo749(InterfaceC3681 interfaceC3681, float f) {
        m10097(interfaceC3681).m22464(f);
    }

    @Override // Yue.InterfaceC3682
    /* JADX INFO: renamed from: ۥ۟ */
    public float mo750(InterfaceC3681 interfaceC3681) {
        return m10097(interfaceC3681).m22459();
    }

    @Override // Yue.InterfaceC3682
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public float mo10085(InterfaceC3681 interfaceC3681) {
        return mo10095(interfaceC3681) * 2.0f;
    }

    @Override // Yue.InterfaceC3682
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public float mo10086(InterfaceC3681 interfaceC3681) {
        return interfaceC3681.mo10103().getElevation();
    }

    @Override // Yue.InterfaceC3682
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void mo10087(InterfaceC3681 interfaceC3681) {
        mo10089(interfaceC3681, mo750(interfaceC3681));
    }

    @Override // Yue.InterfaceC3682
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void mo10088(InterfaceC3681 interfaceC3681) {
        if (!interfaceC3681.mo10101()) {
            interfaceC3681.setShadowPadding(0, 0, 0, 0);
            return;
        }
        float fMo750 = mo750(interfaceC3681);
        float fMo10095 = mo10095(interfaceC3681);
        int iCeil = (int) Math.ceil(C7180.m22466(fMo750, fMo10095, interfaceC3681.mo10100()));
        int iCeil2 = (int) Math.ceil(C7180.m22467(fMo750, fMo10095, interfaceC3681.mo10100()));
        interfaceC3681.setShadowPadding(iCeil, iCeil2, iCeil, iCeil2);
    }

    @Override // Yue.InterfaceC3682
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void mo10089(InterfaceC3681 interfaceC3681, float f) {
        m10097(interfaceC3681).m22463(f, interfaceC3681.mo10101(), interfaceC3681.mo10100());
        mo10088(interfaceC3681);
    }

    @Override // Yue.InterfaceC3682
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void mo10090(InterfaceC3681 interfaceC3681, @InterfaceC6490 ColorStateList colorStateList) {
        m10097(interfaceC3681).m22462(colorStateList);
    }

    @Override // Yue.InterfaceC3682
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public ColorStateList mo10091(InterfaceC3681 interfaceC3681) {
        return m10097(interfaceC3681).m3461();
    }

    @Override // Yue.InterfaceC3682
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void mo10092(InterfaceC3681 interfaceC3681) {
        mo10089(interfaceC3681, mo750(interfaceC3681));
    }

    @Override // Yue.InterfaceC3682
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public float mo10093(InterfaceC3681 interfaceC3681) {
        return mo10095(interfaceC3681) * 2.0f;
    }

    @Override // Yue.InterfaceC3682
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void mo10094(InterfaceC3681 interfaceC3681, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        interfaceC3681.mo752(new C7179(colorStateList, f));
        View viewMo10103 = interfaceC3681.mo10103();
        viewMo10103.setClipToOutline(true);
        viewMo10103.setElevation(f2);
        mo10089(interfaceC3681, f3);
    }

    @Override // Yue.InterfaceC3682
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public float mo10095(InterfaceC3681 interfaceC3681) {
        return m10097(interfaceC3681).m22460();
    }

    @Override // Yue.InterfaceC3682
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void mo10096(InterfaceC3681 interfaceC3681, float f) {
        interfaceC3681.mo10103().setElevation(f);
    }

    @Override // Yue.InterfaceC3682
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public void mo10084() {
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final C7179 m10097(InterfaceC3681 interfaceC3681) {
        return (C7179) interfaceC3681.mo10102();
    }
}
