package kotlin.reflect.jvm.internal.impl.load.java;

import androidx.compose.foundation.text.C1850;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import p068.InterfaceC7387;
import p089.C7760;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class AbstractAnnotationTypeQualifierResolver$extractMutability$1 extends FunctionReferenceImpl implements InterfaceC7387 {
    public AbstractAnnotationTypeQualifierResolver$extractMutability$1(Object obj) {
        super(1, obj, C5442.class, "extractMutability", "extractMutability(Ljava/lang/Object;)Lorg/jetbrains/kotlin/load/java/typeEnhancement/WithMigrationStatus;", 0);
    }

    @Override // p068.InterfaceC7387
    public final C7760 invoke(Object obj) {
        MutabilityQualifier mutabilityQualifier;
        obj.getClass();
        C5442 c5442 = (C5442) this.receiver;
        LinkedHashMap linkedHashMap = C5442.f13813;
        C5519 c5519M9780 = c5442.m9780(obj);
        if (c5519M9780 == null) {
            return null;
        }
        if (AbstractC5448.f13850.contains(c5519M9780)) {
            mutabilityQualifier = MutabilityQualifier.READ_ONLY;
        } else {
            if (!AbstractC5448.f13852.contains(c5519M9780)) {
                return null;
            }
            mutabilityQualifier = MutabilityQualifier.MUTABLE;
        }
        ReportLevel reportLevel = (ReportLevel) ((C1850) c5442.f13815.f22589).invoke(c5519M9780);
        if (reportLevel.isIgnore() || reportLevel.isWarning()) {
            return null;
        }
        return new C7760(mutabilityQualifier, reportLevel.isWarning());
    }
}
