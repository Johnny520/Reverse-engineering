package io.ktor.http.content;

import io.ktor.http.cio.C4791;
import java.util.ArrayList;
import kotlin.AbstractC6017;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.http.content.MultipartKt", m556f = "Multipart.kt", m557l = {130, 135}, m558m = "readAllParts")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class MultipartKt$readAllParts$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public MultipartKt$readAllParts$1(InterfaceC5189<? super MultipartKt$readAllParts$1> interfaceC5189) {
        super(interfaceC5189);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0050 -> B:19:0x0053). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC4809 interfaceC4809;
        ArrayList arrayList;
        Object objM8908;
        this.result = obj;
        int i = (this.label | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.label = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            this.L$0 = null;
            this.label = 1;
            throw null;
        }
        if (i == 1) {
            interfaceC4809 = (InterfaceC4809) this.L$0;
            AbstractC6017.m10769(obj);
            AbstractC4821 abstractC4821 = (AbstractC4821) obj;
            if (abstractC4821 == null) {
                return EmptyList.INSTANCE;
            }
            arrayList = new ArrayList();
            arrayList.add(abstractC4821);
            this.L$0 = interfaceC4809;
            this.L$1 = arrayList;
            this.label = 2;
            C4791 c4791 = (C4791) interfaceC4809;
            objM8908 = c4791.m8908(this);
            if (objM8908 != coroutineSingletons) {
            }
        } else {
            if (i != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ArrayList arrayList2 = (ArrayList) this.L$1;
            InterfaceC4809 interfaceC48092 = (InterfaceC4809) this.L$0;
            AbstractC6017.m10769(obj);
            arrayList = arrayList2;
            interfaceC4809 = interfaceC48092;
            AbstractC4821 abstractC48212 = (AbstractC4821) obj;
            if (abstractC48212 != null) {
                return arrayList;
            }
            arrayList.add(abstractC48212);
            this.L$0 = interfaceC4809;
            this.L$1 = arrayList;
            this.label = 2;
            C4791 c47912 = (C4791) interfaceC4809;
            objM8908 = c47912.m8908(this);
            if (objM8908 != coroutineSingletons) {
                return coroutineSingletons;
            }
            interfaceC4809 = c47912;
            obj = objM8908;
            AbstractC4821 abstractC482122 = (AbstractC4821) obj;
            if (abstractC482122 != null) {
            }
        }
    }
}
