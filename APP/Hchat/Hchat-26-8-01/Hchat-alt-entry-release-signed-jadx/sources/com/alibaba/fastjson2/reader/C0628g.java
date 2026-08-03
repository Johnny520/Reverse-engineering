package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.codec.BeanInfo;
import com.alibaba.fastjson2.util.BeanUtils;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.function.Consumer;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0628g implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1963a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Annotation f1964b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ BeanInfo f1965c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0628g(BeanInfo beanInfo, Annotation annotation, int i9) {
        this.f1963a = i9;
        this.f1965c = beanInfo;
        this.f1964b = annotation;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.alibaba.fastjson2.writer.ObjectWriterProvider.b(com.alibaba.fastjson2.codec.BeanInfo, java.lang.annotation.Annotation, java.lang.reflect.Method):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f1963a) {
            case 0:
                ObjectReaderProvider.lambda$processSeeAlsoAnnotation$10(this.f1964b, this.f1965c, (Method) obj);
                break;
            case 1:
                ObjectReaderProvider.lambda$getCreator$13(this.f1964b, this.f1965c, (Method) obj);
                break;
            case 2:
                ObjectReaderProvider.lambda$getCreator$14(this.f1964b, this.f1965c, (Method) obj);
                break;
            case 3:
                BeanUtils.processJSONType1x(this.f1965c, this.f1964b, (Method) obj);
                break;
            default:
                BeanUtils.processJSONType1x(this.f1965c, this.f1964b, (Method) obj);
                break;
        }
    }

    public /* synthetic */ C0628g(Annotation annotation, BeanInfo beanInfo, int i9) {
        this.f1963a = i9;
        this.f1964b = annotation;
        this.f1965c = beanInfo;
    }
}
