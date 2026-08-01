package com.google.protobuf;

import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪兰子苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C3618 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public volatile boolean f11259 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC3643[] f11260;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public String[] f11261;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC3648[] f11262;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3662 f11263;

    public C3618(C3662 c3662, String[] strArr) {
        this.f11263 = c3662;
        this.f11261 = strArr;
        this.f11262 = new InterfaceC3648[c3662.f11369.length];
        this.f11260 = new InterfaceC3643[c3662.f11365.length];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static InterfaceC3648 m7838(C3618 c3618, C3656 c3656) {
        c3618.getClass();
        if (c3656.f11341 != c3618.f11263) {
            C5919.m11249("FieldDescriptor does not match message type.");
            return null;
        }
        if (!c3656.f11350.hasExtendee()) {
            return c3618.f11262[c3656.f11349];
        }
        C5919.m11249("This type does not have extensions.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static InterfaceC3643 m7839(C3618 c3618, C3593 c3593) {
        c3618.getClass();
        if (c3593.f11222 == c3618.f11263) {
            return c3618.f11260[c3593.f11226];
        }
        C5919.m11249("OneofDescriptor does not match message type.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m7840(Class cls, Class cls2) {
        Class cls3;
        Class cls4;
        if (this.f11259) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f11259) {
                    return;
                }
                int length = this.f11262.length;
                int i = 0;
                int i2 = 0;
                while (true) {
                    String str = null;
                    if (i2 >= length) {
                        break;
                    }
                    C3656 c3656 = this.f11263.f11369[i2];
                    C3593 c3593 = c3656.f11340;
                    if (c3593 != null) {
                        int i3 = c3593.f11226 + length;
                        String[] strArr = this.f11261;
                        if (i3 < strArr.length) {
                            str = strArr[i3];
                        }
                    }
                    String str2 = str;
                    if (c3656.mo7819()) {
                        if (c3656.m7876() == Descriptors$FieldDescriptor$JavaType.MESSAGE) {
                            boolean zM7872 = c3656.m7872();
                            InterfaceC3648[] interfaceC3648Arr = this.f11262;
                            if (zM7872) {
                                interfaceC3648Arr[i2] = new C3644(c3656, cls);
                            } else {
                                interfaceC3648Arr[i2] = new C3631(cls, cls2, this.f11261[i2]);
                            }
                        } else {
                            Descriptors$FieldDescriptor$JavaType descriptors$FieldDescriptor$JavaTypeM7876 = c3656.m7876();
                            Descriptors$FieldDescriptor$JavaType descriptors$FieldDescriptor$JavaType = Descriptors$FieldDescriptor$JavaType.ENUM;
                            InterfaceC3648[] interfaceC3648Arr2 = this.f11262;
                            if (descriptors$FieldDescriptor$JavaTypeM7876 == descriptors$FieldDescriptor$JavaType) {
                                interfaceC3648Arr2[i2] = new C3645(c3656, this.f11261[i2], cls, cls2);
                            } else {
                                interfaceC3648Arr2[i2] = new C3634(cls, cls2, this.f11261[i2]);
                            }
                        }
                        cls3 = cls;
                        cls4 = cls2;
                    } else if (c3656.m7876() == Descriptors$FieldDescriptor$JavaType.MESSAGE) {
                        cls3 = cls;
                        cls4 = cls2;
                        this.f11262[i2] = new C3614(c3656, this.f11261[i2], cls3, cls4, str2);
                    } else {
                        cls3 = cls;
                        cls4 = cls2;
                        if (c3656.m7876() == Descriptors$FieldDescriptor$JavaType.ENUM) {
                            this.f11262[i2] = new C3632(c3656, this.f11261[i2], cls3, cls4, str2);
                        } else {
                            Descriptors$FieldDescriptor$JavaType descriptors$FieldDescriptor$JavaTypeM78762 = c3656.m7876();
                            Descriptors$FieldDescriptor$JavaType descriptors$FieldDescriptor$JavaType2 = Descriptors$FieldDescriptor$JavaType.STRING;
                            InterfaceC3648[] interfaceC3648Arr3 = this.f11262;
                            if (descriptors$FieldDescriptor$JavaTypeM78762 == descriptors$FieldDescriptor$JavaType2) {
                                interfaceC3648Arr3[i2] = new C3613(c3656, this.f11261[i2], cls3, cls4, str2);
                            } else {
                                interfaceC3648Arr3[i2] = new C3635(c3656, this.f11261[i2], cls3, cls4, str2);
                            }
                        }
                    }
                    i2++;
                    cls = cls3;
                    cls2 = cls4;
                }
                Class cls5 = cls;
                Class cls6 = cls2;
                while (true) {
                    C3662 c3662 = this.f11263;
                    if (i >= c3662.f11365.length) {
                        this.f11259 = true;
                        this.f11261 = null;
                        return;
                    }
                    int i4 = c3662.f11364;
                    InterfaceC3643[] interfaceC3643Arr = this.f11260;
                    if (i < i4) {
                        interfaceC3643Arr[i] = new C3646(c3662, this.f11261[i + length], cls5, cls6);
                    } else {
                        interfaceC3643Arr[i] = new C3617(c3662, i);
                    }
                    i++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
