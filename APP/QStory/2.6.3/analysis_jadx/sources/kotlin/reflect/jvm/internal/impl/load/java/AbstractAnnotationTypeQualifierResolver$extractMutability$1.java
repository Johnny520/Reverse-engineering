package kotlin.reflect.jvm.internal.impl.load.java;

import androidx.compose.foundation.text.C1012;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import p052.InterfaceC6558;
import p073.C6931;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class AbstractAnnotationTypeQualifierResolver$extractMutability$1 extends FunctionReferenceImpl implements InterfaceC6558 {
    public AbstractAnnotationTypeQualifierResolver$extractMutability$1(Object obj) {
        super(1, obj, C4610.class, "extractMutability", "extractMutability(Ljava/lang/Object;)Lorg/jetbrains/kotlin/load/java/typeEnhancement/WithMigrationStatus;", 0);
    }

    @Override // p052.InterfaceC6558
    public final C6931 invoke(Object obj) {
        MutabilityQualifier mutabilityQualifier;
        obj.getClass();
        C4610 c4610 = (C4610) this.receiver;
        LinkedHashMap linkedHashMap = C4610.f13468;
        C4687 c4687M9221 = c4610.m9221(obj);
        if (c4687M9221 == null) {
            return null;
        }
        if (AbstractC4616.f13505.contains(c4687M9221)) {
            mutabilityQualifier = MutabilityQualifier.READ_ONLY;
        } else {
            if (!AbstractC4616.f13507.contains(c4687M9221)) {
                return null;
            }
            mutabilityQualifier = MutabilityQualifier.MUTABLE;
        }
        ReportLevel reportLevel = (ReportLevel) ((C1012) c4610.f13470.f22244).invoke(c4687M9221);
        if (reportLevel.isIgnore() || reportLevel.isWarning()) {
            return null;
        }
        return new C6931(mutabilityQualifier, reportLevel.isWarning());
    }
}
