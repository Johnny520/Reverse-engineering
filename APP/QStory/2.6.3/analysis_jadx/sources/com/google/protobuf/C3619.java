package com.google.protobuf;

import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪兰子苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C3619 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public volatile boolean f11264 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC3644[] f11265;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public String[] f11266;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC3649[] f11267;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3663 f11268;

    public C3619(C3663 c3663, String[] strArr) {
        this.f11268 = c3663;
        this.f11266 = strArr;
        this.f11267 = new InterfaceC3649[c3663.f11374.length];
        this.f11265 = new InterfaceC3644[c3663.f11370.length];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static InterfaceC3649 m7825(C3619 c3619, C3657 c3657) {
        c3619.getClass();
        if (c3657.f11346 != c3619.f11268) {
            C5925.m11310("FieldDescriptor does not match message type.");
            return null;
        }
        if (!c3657.f11355.hasExtendee()) {
            return c3619.f11267[c3657.f11354];
        }
        C5925.m11310("This type does not have extensions.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static InterfaceC3644 m7826(C3619 c3619, C3594 c3594) {
        c3619.getClass();
        if (c3594.f11227 == c3619.f11268) {
            return c3619.f11265[c3594.f11231];
        }
        C5925.m11310("OneofDescriptor does not match message type.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m7827(Class cls, Class cls2) {
        Class cls3;
        Class cls4;
        if (this.f11264) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f11264) {
                    return;
                }
                int length = this.f11267.length;
                int i = 0;
                int i2 = 0;
                while (true) {
                    String str = null;
                    if (i2 >= length) {
                        break;
                    }
                    C3657 c3657 = this.f11268.f11374[i2];
                    C3594 c3594 = c3657.f11345;
                    if (c3594 != null) {
                        int i3 = c3594.f11231 + length;
                        String[] strArr = this.f11266;
                        if (i3 < strArr.length) {
                            str = strArr[i3];
                        }
                    }
                    String str2 = str;
                    if (c3657.mo7806()) {
                        if (c3657.m7863() == Descriptors$FieldDescriptor$JavaType.MESSAGE) {
                            boolean zM7859 = c3657.m7859();
                            InterfaceC3649[] interfaceC3649Arr = this.f11267;
                            if (zM7859) {
                                interfaceC3649Arr[i2] = new C3645(c3657, cls);
                            } else {
                                interfaceC3649Arr[i2] = new C3632(cls, cls2, this.f11266[i2]);
                            }
                        } else {
                            Descriptors$FieldDescriptor$JavaType descriptors$FieldDescriptor$JavaTypeM7863 = c3657.m7863();
                            Descriptors$FieldDescriptor$JavaType descriptors$FieldDescriptor$JavaType = Descriptors$FieldDescriptor$JavaType.ENUM;
                            InterfaceC3649[] interfaceC3649Arr2 = this.f11267;
                            if (descriptors$FieldDescriptor$JavaTypeM7863 == descriptors$FieldDescriptor$JavaType) {
                                interfaceC3649Arr2[i2] = new C3646(c3657, this.f11266[i2], cls, cls2);
                            } else {
                                interfaceC3649Arr2[i2] = new C3635(cls, cls2, this.f11266[i2]);
                            }
                        }
                        cls3 = cls;
                        cls4 = cls2;
                    } else if (c3657.m7863() == Descriptors$FieldDescriptor$JavaType.MESSAGE) {
                        cls3 = cls;
                        cls4 = cls2;
                        this.f11267[i2] = new C3615(c3657, this.f11266[i2], cls3, cls4, str2);
                    } else {
                        cls3 = cls;
                        cls4 = cls2;
                        if (c3657.m7863() == Descriptors$FieldDescriptor$JavaType.ENUM) {
                            this.f11267[i2] = new C3633(c3657, this.f11266[i2], cls3, cls4, str2);
                        } else {
                            Descriptors$FieldDescriptor$JavaType descriptors$FieldDescriptor$JavaTypeM78632 = c3657.m7863();
                            Descriptors$FieldDescriptor$JavaType descriptors$FieldDescriptor$JavaType2 = Descriptors$FieldDescriptor$JavaType.STRING;
                            InterfaceC3649[] interfaceC3649Arr3 = this.f11267;
                            if (descriptors$FieldDescriptor$JavaTypeM78632 == descriptors$FieldDescriptor$JavaType2) {
                                interfaceC3649Arr3[i2] = new C3614(c3657, this.f11266[i2], cls3, cls4, str2);
                            } else {
                                interfaceC3649Arr3[i2] = new C3636(c3657, this.f11266[i2], cls3, cls4, str2);
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
                    C3663 c3663 = this.f11268;
                    if (i >= c3663.f11370.length) {
                        this.f11264 = true;
                        this.f11266 = null;
                        return;
                    }
                    int i4 = c3663.f11369;
                    InterfaceC3644[] interfaceC3644Arr = this.f11265;
                    if (i < i4) {
                        interfaceC3644Arr[i] = new C3647(c3663, this.f11266[i + length], cls5, cls6);
                    } else {
                        interfaceC3644Arr[i] = new C3618(c3663, i);
                    }
                    i++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
