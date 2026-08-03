package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.codec.BeanInfo;
import com.alibaba.fastjson2.codec.FieldInfo;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.TreeMap;
import java.util.function.Consumer;

/* JADX INFO: renamed from: com.alibaba.fastjson2.writer.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0639a implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1992a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ObjectWriterCreator f1993b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ FieldInfo f1994c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Class f1995d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ long f1996e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ObjectWriterProvider f1997f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ BeanInfo f1998g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ TreeMap f1999h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0639a(ObjectWriterCreator objectWriterCreator, FieldInfo fieldInfo, long j3, BeanInfo beanInfo, ObjectWriterProvider objectWriterProvider, Class cls, TreeMap treeMap) {
        this.f1992a = 2;
        this.f1993b = objectWriterCreator;
        this.f1994c = fieldInfo;
        this.f1996e = j3;
        this.f1998g = beanInfo;
        this.f1997f = objectWriterProvider;
        this.f1995d = cls;
        this.f1999h = treeMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f1992a) {
            case 0:
                this.f1993b.lambda$createObjectWriter$0(this.f1994c, this.f1995d, this.f1996e, this.f1997f, this.f1998g, this.f1999h, (Field) obj);
                break;
            case 1:
                this.f1993b.lambda$createObjectWriter$1(this.f1994c, this.f1995d, this.f1996e, this.f1997f, this.f1998g, this.f1999h, (Field) obj);
                break;
            default:
                this.f1993b.lambda$createObjectWriter$2(this.f1994c, this.f1996e, this.f1998g, this.f1997f, this.f1995d, this.f1999h, (Method) obj);
                break;
        }
    }

    public /* synthetic */ C0639a(ObjectWriterCreator objectWriterCreator, FieldInfo fieldInfo, Class cls, long j3, ObjectWriterProvider objectWriterProvider, BeanInfo beanInfo, TreeMap treeMap, int i9) {
        this.f1992a = i9;
        this.f1993b = objectWriterCreator;
        this.f1994c = fieldInfo;
        this.f1995d = cls;
        this.f1996e = j3;
        this.f1997f = objectWriterProvider;
        this.f1998g = beanInfo;
        this.f1999h = treeMap;
    }
}
