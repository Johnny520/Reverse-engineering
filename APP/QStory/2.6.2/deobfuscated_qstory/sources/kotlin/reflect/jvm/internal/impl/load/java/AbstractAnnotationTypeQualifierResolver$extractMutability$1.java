package kotlin.reflect.jvm.internal.impl.load.java;

import androidx.compose.foundation.text.C1012;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import p052.InterfaceC6557;
import p073.C6930;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class AbstractAnnotationTypeQualifierResolver$extractMutability$1 extends FunctionReferenceImpl implements InterfaceC6557 {
    public AbstractAnnotationTypeQualifierResolver$extractMutability$1(Object obj) {
        super(1, obj, C4609.class, "extractMutability", "extractMutability(Ljava/lang/Object;)Lorg/jetbrains/kotlin/load/java/typeEnhancement/WithMigrationStatus;", 0);
    }

    @Override // p052.InterfaceC6557
    public final C6930 invoke(Object obj) {
        MutabilityQualifier mutabilityQualifier;
        obj.getClass();
        C4609 c4609 = (C4609) this.receiver;
        LinkedHashMap linkedHashMap = C4609.f13464;
        C4686 c4686M9231 = c4609.m9231(obj);
        if (c4686M9231 == null) {
            return null;
        }
        if (AbstractC4615.f13501.contains(c4686M9231)) {
            mutabilityQualifier = MutabilityQualifier.READ_ONLY;
        } else {
            if (!AbstractC4615.f13503.contains(c4686M9231)) {
                return null;
            }
            mutabilityQualifier = MutabilityQualifier.MUTABLE;
        }
        ReportLevel reportLevel = (ReportLevel) ((C1012) c4609.f13466.f22246).invoke(c4686M9231);
        if (reportLevel.isIgnore() || reportLevel.isWarning()) {
            return null;
        }
        return new C6930(mutabilityQualifier, reportLevel.isWarning());
    }
}
