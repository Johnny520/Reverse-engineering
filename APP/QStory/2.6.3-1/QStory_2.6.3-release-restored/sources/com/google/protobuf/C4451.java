package com.google.protobuf;

import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪兰子苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C4451 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public volatile boolean f11609 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC4476[] f11610;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public String[] f11611;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC4481[] f11612;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4495 f11613;

    public C4451(C4495 c4495, String[] strArr) {
        this.f11613 = c4495;
        this.f11611 = strArr;
        this.f11612 = new InterfaceC4481[c4495.f11719.length];
        this.f11610 = new InterfaceC4476[c4495.f11715.length];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static InterfaceC4481 m8384(C4451 c4451, C4489 c4489) {
        c4451.getClass();
        if (c4489.f11691 != c4451.f11613) {
            C6755.m11869("FieldDescriptor does not match message type.");
            return null;
        }
        if (!c4489.f11700.hasExtendee()) {
            return c4451.f11612[c4489.f11699];
        }
        C6755.m11869("This type does not have extensions.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static InterfaceC4476 m8385(C4451 c4451, C4426 c4426) {
        c4451.getClass();
        if (c4426.f11572 == c4451.f11613) {
            return c4451.f11610[c4426.f11576];
        }
        C6755.m11869("OneofDescriptor does not match message type.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m8386(Class cls, Class cls2) {
        Class cls3;
        Class cls4;
        if (this.f11609) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f11609) {
                    return;
                }
                int length = this.f11612.length;
                int i = 0;
                int i2 = 0;
                while (true) {
                    String str = null;
                    if (i2 >= length) {
                        break;
                    }
                    C4489 c4489 = this.f11613.f11719[i2];
                    C4426 c4426 = c4489.f11690;
                    if (c4426 != null) {
                        int i3 = c4426.f11576 + length;
                        String[] strArr = this.f11611;
                        if (i3 < strArr.length) {
                            str = strArr[i3];
                        }
                    }
                    String str2 = str;
                    if (c4489.mo8365()) {
                        if (c4489.m8422() == Descriptors$FieldDescriptor$JavaType.MESSAGE) {
                            boolean zM8418 = c4489.m8418();
                            InterfaceC4481[] interfaceC4481Arr = this.f11612;
                            if (zM8418) {
                                interfaceC4481Arr[i2] = new C4477(c4489, cls);
                            } else {
                                interfaceC4481Arr[i2] = new C4464(cls, cls2, this.f11611[i2]);
                            }
                        } else {
                            Descriptors$FieldDescriptor$JavaType descriptors$FieldDescriptor$JavaTypeM8422 = c4489.m8422();
                            Descriptors$FieldDescriptor$JavaType descriptors$FieldDescriptor$JavaType = Descriptors$FieldDescriptor$JavaType.ENUM;
                            InterfaceC4481[] interfaceC4481Arr2 = this.f11612;
                            if (descriptors$FieldDescriptor$JavaTypeM8422 == descriptors$FieldDescriptor$JavaType) {
                                interfaceC4481Arr2[i2] = new C4478(c4489, this.f11611[i2], cls, cls2);
                            } else {
                                interfaceC4481Arr2[i2] = new C4467(cls, cls2, this.f11611[i2]);
                            }
                        }
                        cls3 = cls;
                        cls4 = cls2;
                    } else if (c4489.m8422() == Descriptors$FieldDescriptor$JavaType.MESSAGE) {
                        cls3 = cls;
                        cls4 = cls2;
                        this.f11612[i2] = new C4447(c4489, this.f11611[i2], cls3, cls4, str2);
                    } else {
                        cls3 = cls;
                        cls4 = cls2;
                        if (c4489.m8422() == Descriptors$FieldDescriptor$JavaType.ENUM) {
                            this.f11612[i2] = new C4465(c4489, this.f11611[i2], cls3, cls4, str2);
                        } else {
                            Descriptors$FieldDescriptor$JavaType descriptors$FieldDescriptor$JavaTypeM84222 = c4489.m8422();
                            Descriptors$FieldDescriptor$JavaType descriptors$FieldDescriptor$JavaType2 = Descriptors$FieldDescriptor$JavaType.STRING;
                            InterfaceC4481[] interfaceC4481Arr3 = this.f11612;
                            if (descriptors$FieldDescriptor$JavaTypeM84222 == descriptors$FieldDescriptor$JavaType2) {
                                interfaceC4481Arr3[i2] = new C4446(c4489, this.f11611[i2], cls3, cls4, str2);
                            } else {
                                interfaceC4481Arr3[i2] = new C4468(c4489, this.f11611[i2], cls3, cls4, str2);
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
                    C4495 c4495 = this.f11613;
                    if (i >= c4495.f11715.length) {
                        this.f11609 = true;
                        this.f11611 = null;
                        return;
                    }
                    int i4 = c4495.f11714;
                    InterfaceC4476[] interfaceC4476Arr = this.f11610;
                    if (i < i4) {
                        interfaceC4476Arr[i] = new C4479(c4495, this.f11611[i + length], cls5, cls6);
                    } else {
                        interfaceC4476Arr[i] = new C4450(c4495, i);
                    }
                    i++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
