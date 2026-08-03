package org.luckypray.dexkit.query.matchers;

import Yue.C3404;
import Yue.C3881;
import Yue.C3888;
import Yue.C4335;
import Yue.C5458;
import Yue.C5499;
import Yue.C6398;
import Yue.EnumC0393;
import Yue.InterfaceC4372;
import Yue.InterfaceC5124;
import Yue.InterfaceC5573;
import Yue.InterfaceC5578;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import Yue.InterfaceC7507;
import com.google.flatbuffers.FlatBufferBuilder;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.query.FieldMatcherList;
import org.luckypray.dexkit.query.base.BaseMatcher;
import org.luckypray.dexkit.query.base.IAnnotationEncodeValue;
import org.luckypray.dexkit.query.enums.MatchType;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher;
import org.luckypray.dexkit.query.matchers.base.IntRange;
import org.luckypray.dexkit.query.matchers.base.StringMatcher;
import org.luckypray.dexkit.schema.FieldMatcher;
import org.luckypray.dexkit.util.DexSignUtil;
import org.luckypray.dexkit.wrap.DexField;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nFieldMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FieldMatcher.kt\norg/luckypray/dexkit/query/matchers/FieldMatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,762:1\n1#2:763\n1547#3:764\n1618#3,3:765\n1547#3:768\n1618#3,3:769\n1547#3:772\n1618#3,3:773\n*S KotlinDebug\n*F\n+ 1 FieldMatcher.kt\norg/luckypray/dexkit/query/matchers/FieldMatcher\n*L\n751#1:764\n751#1:765,3\n753#1:768\n753#1:769,3\n755#1:772\n755#1:773,3\n*E\n"})
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010!\n\u0002\b\u0018\u0018\u0000 \u0088\u00012\u00020\u00012\u00020\u0002:\u0002\u0088\u0001B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0003\u0010\nJ\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\r\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00172\b\b\u0002\u0010\u0010\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u0015\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001b\u001a\u00020\u00002\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001d¢\u0006\u0004\b\u001b\u0010\u001fJ+\u0010\u001b\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u001b\u0010\u0013J\u0015\u0010!\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u001a¢\u0006\u0004\b!\u0010\u001cJ\u0019\u0010!\u001a\u00020\u00002\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001d¢\u0006\u0004\b!\u0010\u001fJ+\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b!\u0010\u0013J\u0015\u0010$\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0015\u0010+\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0017¢\u0006\u0004\b+\u0010,J\u0015\u0010+\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b+\u0010/J\u0015\u0010+\u001a\u00020\u00002\u0006\u0010.\u001a\u000200¢\u0006\u0004\b+\u00101J!\u0010+\u001a\u00020\u00002\b\b\u0002\u00102\u001a\u00020\u00172\b\b\u0002\u00103\u001a\u00020\u0017¢\u0006\u0004\b+\u00104J\u0015\u00106\u001a\u00020\u00002\u0006\u00106\u001a\u000205¢\u0006\u0004\b6\u00107J\u0015\u0010:\u001a\u00020\u00002\u0006\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;J\u0015\u0010:\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\b¢\u0006\u0004\b:\u0010\u000bJ\u0015\u0010=\u001a\u00020\u00002\u0006\u0010=\u001a\u000205¢\u0006\u0004\b=\u00107J\u0015\u0010?\u001a\u00020\u00002\u0006\u0010>\u001a\u000208¢\u0006\u0004\b?\u0010;J\u0015\u0010?\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\b¢\u0006\u0004\b?\u0010\u000bJ\u001b\u0010B\u001a\u00020\u00002\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00000@¢\u0006\u0004\bB\u0010CJ!\u0010B\u001a\u00020\u00002\u0012\u0010A\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000D\"\u00020\u0000¢\u0006\u0004\bB\u0010EJ\u0015\u0010G\u001a\u00020\u00002\u0006\u0010F\u001a\u00020\u0000¢\u0006\u0004\bG\u0010HJ\u001b\u0010I\u001a\u00020\u00002\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00000@¢\u0006\u0004\bI\u0010CJ!\u0010I\u001a\u00020\u00002\u0012\u0010A\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000D\"\u00020\u0000¢\u0006\u0004\bI\u0010EJ\u0015\u0010J\u001a\u00020\u00002\u0006\u0010F\u001a\u00020\u0000¢\u0006\u0004\bJ\u0010HJ\u001b\u0010K\u001a\u00020\u00002\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00000@¢\u0006\u0004\bK\u0010CJ!\u0010K\u001a\u00020\u00002\u0012\u0010A\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000D\"\u00020\u0000¢\u0006\u0004\bK\u0010EJ\u0015\u0010L\u001a\u00020\u00002\u0006\u0010F\u001a\u00020\u0000¢\u0006\u0004\bL\u0010HJ\u0015\u0010M\u001a\u00020\u00002\u0006\u0010F\u001a\u00020\u0000¢\u0006\u0004\bM\u0010HJ&\u0010\u001b\u001a\u00020\u00002\u0017\u0010Q\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020O0N¢\u0006\u0002\bP¢\u0006\u0004\b\u001b\u0010RJ&\u0010!\u001a\u00020\u00002\u0017\u0010Q\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020O0N¢\u0006\u0002\bP¢\u0006\u0004\b!\u0010RJ&\u0010$\u001a\u00020\u00002\u0017\u0010Q\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020O0N¢\u0006\u0002\bP¢\u0006\u0004\b$\u0010RJ&\u0010(\u001a\u00020\u00002\u0017\u0010Q\u001a\u0013\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020O0N¢\u0006\u0002\bP¢\u0006\u0004\b(\u0010RJ&\u00106\u001a\u00020\u00002\u0017\u0010Q\u001a\u0013\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020O0N¢\u0006\u0002\bP¢\u0006\u0004\b6\u0010RJ&\u0010:\u001a\u00020\u00002\u0017\u0010Q\u001a\u0013\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020O0N¢\u0006\u0002\bP¢\u0006\u0004\b:\u0010RJ&\u0010=\u001a\u00020\u00002\u0017\u0010Q\u001a\u0013\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020O0N¢\u0006\u0002\bP¢\u0006\u0004\b=\u0010RJ&\u0010?\u001a\u00020\u00002\u0017\u0010Q\u001a\u0013\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020O0N¢\u0006\u0002\bP¢\u0006\u0004\b?\u0010RJ&\u0010B\u001a\u00020\u00002\u0017\u0010Q\u001a\u0013\u0012\u0004\u0012\u00020S\u0012\u0004\u0012\u00020O0N¢\u0006\u0002\bP¢\u0006\u0004\bB\u0010RJ&\u0010G\u001a\u00020\u00002\u0017\u0010Q\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020O0N¢\u0006\u0002\bP¢\u0006\u0004\bG\u0010RJ&\u0010I\u001a\u00020\u00002\u0017\u0010Q\u001a\u0013\u0012\u0004\u0012\u00020S\u0012\u0004\u0012\u00020O0N¢\u0006\u0002\bP¢\u0006\u0004\bI\u0010RJ&\u0010J\u001a\u00020\u00002\u0017\u0010Q\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020O0N¢\u0006\u0002\bP¢\u0006\u0004\bJ\u0010RJ&\u0010K\u001a\u00020\u00002\u0017\u0010Q\u001a\u0013\u0012\u0004\u0012\u00020S\u0012\u0004\u0012\u00020O0N¢\u0006\u0002\bP¢\u0006\u0004\bK\u0010RJ&\u0010L\u001a\u00020\u00002\u0017\u0010Q\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020O0N¢\u0006\u0002\bP¢\u0006\u0004\bL\u0010RJ&\u0010M\u001a\u00020\u00002\u0017\u0010Q\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020O0N¢\u0006\u0002\bP¢\u0006\u0004\bM\u0010RJ\u0017\u0010V\u001a\u00020\u00172\u0006\u0010U\u001a\u00020TH\u0014¢\u0006\u0004\bV\u0010WR(\u0010Y\u001a\u0004\u0018\u00010\f2\b\u0010X\u001a\u0004\u0018\u00010\f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R(\u0010]\u001a\u0004\u0018\u00010\u00142\b\u0010X\u001a\u0004\u0018\u00010\u00148\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R(\u0010a\u001a\u0004\u0018\u00010\u001a2\b\u0010X\u001a\u0004\u0018\u00010\u001a8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR(\u0010e\u001a\u0004\u0018\u00010\u001a2\b\u0010X\u001a\u0004\u0018\u00010\u001a8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\be\u0010b\u001a\u0004\bf\u0010dR(\u0010g\u001a\u0004\u0018\u00010#2\b\u0010X\u001a\u0004\u0018\u00010#8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR(\u0010k\u001a\u0004\u0018\u0001052\b\u0010X\u001a\u0004\u0018\u0001058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR(\u0010o\u001a\u0004\u0018\u0001052\b\u0010X\u001a\u0004\u0018\u0001058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bo\u0010l\u001a\u0004\bp\u0010nR4\u0010r\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010q2\u000e\u0010X\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010q8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010uR4\u0010v\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010q2\u000e\u0010X\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010q8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bv\u0010s\u001a\u0004\bw\u0010uR4\u0010x\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010q2\u000e\u0010X\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010q8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bx\u0010s\u001a\u0004\by\u0010uR$\u0010\t\u001a\u00020\b2\u0006\u0010z\u001a\u00020\b8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b{\u0010|\"\u0004\b}\u0010\nR$\u0010\r\u001a\u00020\b2\u0006\u0010z\u001a\u00020\b8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b~\u0010|\"\u0004\b\u007f\u0010\nR(\u0010\u0015\u001a\u00020\u00172\u0006\u0010z\u001a\u00020\u00178G@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R&\u0010\u001b\u001a\u00020\b2\u0006\u0010z\u001a\u00020\b8G@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0084\u0001\u0010|\"\u0005\b\u0085\u0001\u0010\nR&\u0010!\u001a\u00020\b2\u0006\u0010z\u001a\u00020\b8G@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0086\u0001\u0010|\"\u0005\b\u0087\u0001\u0010\n¨\u0006\u0089\u0001"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "Lorg/luckypray/dexkit/query/base/BaseMatcher;", "Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "Ljava/lang/reflect/Field;", "field", "(Ljava/lang/reflect/Field;)V", "", "descriptor", "(Ljava/lang/String;)V", "(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "name", "(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "Lorg/luckypray/dexkit/query/enums/StringMatchType;", "matchType", "", "ignoreCase", "(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;", "modifiers", "(Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "", "Lorg/luckypray/dexkit/query/enums/MatchType;", "(ILorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "declaredClass", "(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "Ljava/lang/Class;", "clazz", "(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "className", "type", "typeName", "Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;", "annotations", "(Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "annotation", "addAnnotation", "(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "count", "annotationCount", "(I)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "range", "(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "LYue/ۥ۠ۥۣۨ;", "(LYue/ۥ۠ۥۣۨ;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "min", "max", "(II)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;", "readMethods", "(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "readMethod", "addReadMethod", "(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "methodDescriptor", "writeMethods", "writeMethod", "addWriteMethod", "", "matchers", "allOf", "(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "", "([Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "matcher", "addAllOf", "(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "anyOf", "addAnyOf", "noneOf", "addNoneOf", "not", "Lkotlin/Function1;", "LYue/ۥۣۢ۠ۤ;", "LYue/ۥ۠ۡۥۧ;", "init", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "Lorg/luckypray/dexkit/query/FieldMatcherList;", "Lcom/google/flatbuffers/FlatBufferBuilder;", "fbb", "innerBuild", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "<set-?>", "nameMatcher", "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "getNameMatcher", "()Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "modifiersMatcher", "Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;", "getModifiersMatcher", "()Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;", "classMatcher", "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "getClassMatcher", "()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "typeMatcher", "getTypeMatcher", "annotationsMatcher", "Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;", "getAnnotationsMatcher", "()Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;", "getMethodsMatcher", "Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;", "getGetMethodsMatcher", "()Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;", "putMethodsMatcher", "getPutMethodsMatcher", "", "allOfMatchers", "Ljava/util/List;", "getAllOfMatchers", "()Ljava/util/List;", "anyOfMatchers", "getAnyOfMatchers", "noneOfMatchers", "getNoneOfMatchers", "value", "getDescriptor", "()Ljava/lang/String;", "setDescriptor", "getName", "setName", "getModifiers", "()I", "setModifiers", "(I)V", "getDeclaredClass", "setDeclaredClass", "getType", "setType", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class FieldMatcher extends BaseMatcher implements IAnnotationEncodeValue {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @InterfaceC6399
    public static final Companion INSTANCE = new Companion(null);

    @InterfaceC6489
    private List<FieldMatcher> allOfMatchers;

    @InterfaceC6489
    private AnnotationsMatcher annotationsMatcher;

    @InterfaceC6489
    private List<FieldMatcher> anyOfMatchers;

    @InterfaceC6489
    private ClassMatcher classMatcher;

    @InterfaceC6489
    private MethodsMatcher getMethodsMatcher;

    @InterfaceC6489
    private AccessFlagsMatcher modifiersMatcher;

    @InterfaceC6489
    private StringMatcher nameMatcher;

    @InterfaceC6489
    private List<FieldMatcher> noneOfMatchers;

    @InterfaceC6489
    private MethodsMatcher putMethodsMatcher;

    @InterfaceC6489
    private ClassMatcher typeMatcher;

    @InterfaceC6211(m2698d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, m2699d2 = {"Lorg/luckypray/dexkit/query/matchers/FieldMatcher$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "field", "Ljava/lang/reflect/Field;", "descriptor", "", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.query.matchers.FieldMatcher.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6399
        @InterfaceC5578
        public final FieldMatcher create() {
            return new FieldMatcher();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @InterfaceC6399
        @InterfaceC5578
        public final FieldMatcher create(@InterfaceC6399 Field field) {
            C5499.m17103(field, "field");
            return new FieldMatcher(field);
        }

        @InterfaceC6399
        @InterfaceC5578
        public final FieldMatcher create(@InterfaceC6399 String str) {
            C5499.m17103(str, "descriptor");
            return new FieldMatcher(str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldMatcher() {
    }

    public static /* synthetic */ FieldMatcher annotationCount$default(FieldMatcher fieldMatcher, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return fieldMatcher.annotationCount(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5578
    public static final FieldMatcher create() {
        return INSTANCE.create();
    }

    public static /* synthetic */ FieldMatcher declaredClass$default(FieldMatcher fieldMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return fieldMatcher.declaredClass(str, stringMatchType, z);
    }

    public static /* synthetic */ FieldMatcher modifiers$default(FieldMatcher fieldMatcher, int i, MatchType matchType, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            matchType = MatchType.Contains;
        }
        return fieldMatcher.modifiers(i, matchType);
    }

    public static /* synthetic */ FieldMatcher name$default(FieldMatcher fieldMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return fieldMatcher.name(str, stringMatchType, z);
    }

    public static /* synthetic */ FieldMatcher type$default(FieldMatcher fieldMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return fieldMatcher.type(str, stringMatchType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final FieldMatcher addAllOf(@InterfaceC6399 FieldMatcher matcher) {
        C5499.m17103(matcher, "matcher");
        List<FieldMatcher> arrayList = this.allOfMatchers;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.allOfMatchers = arrayList;
        C5499.m17100(arrayList);
        arrayList.add(matcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final FieldMatcher addAnnotation(@InterfaceC6399 AnnotationMatcher annotation) {
        C5499.m17103(annotation, "annotation");
        AnnotationsMatcher annotationsMatcher = this.annotationsMatcher;
        if (annotationsMatcher == null) {
            annotationsMatcher = new AnnotationsMatcher();
        }
        this.annotationsMatcher = annotationsMatcher;
        C5499.m17100(annotationsMatcher);
        annotationsMatcher.add(annotation);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final FieldMatcher addAnyOf(@InterfaceC6399 FieldMatcher matcher) {
        C5499.m17103(matcher, "matcher");
        List<FieldMatcher> arrayList = this.anyOfMatchers;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.anyOfMatchers = arrayList;
        C5499.m17100(arrayList);
        arrayList.add(matcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final FieldMatcher addNoneOf(@InterfaceC6399 FieldMatcher matcher) {
        C5499.m17103(matcher, "matcher");
        List<FieldMatcher> arrayList = this.noneOfMatchers;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.noneOfMatchers = arrayList;
        C5499.m17100(arrayList);
        arrayList.add(matcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final FieldMatcher addReadMethod(@InterfaceC6399 MethodMatcher readMethod) {
        C5499.m17103(readMethod, "readMethod");
        MethodsMatcher methodsMatcher = this.getMethodsMatcher;
        if (methodsMatcher == null) {
            methodsMatcher = new MethodsMatcher();
        }
        this.getMethodsMatcher = methodsMatcher;
        C5499.m17100(methodsMatcher);
        methodsMatcher.add(readMethod);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final FieldMatcher addWriteMethod(@InterfaceC6399 MethodMatcher writeMethod) {
        C5499.m17103(writeMethod, "writeMethod");
        MethodsMatcher methodsMatcher = this.putMethodsMatcher;
        if (methodsMatcher == null) {
            methodsMatcher = new MethodsMatcher();
        }
        this.putMethodsMatcher = methodsMatcher;
        C5499.m17100(methodsMatcher);
        methodsMatcher.add(writeMethod);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final FieldMatcher allOf(@InterfaceC6399 Collection<FieldMatcher> matchers) {
        C5499.m17103(matchers, "matchers");
        if (!(!matchers.isEmpty())) {
            matchers = null;
        }
        this.allOfMatchers = matchers != null ? C3888.m11065(matchers) : null;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final FieldMatcher annotationCount(int count) {
        AnnotationsMatcher annotationsMatcher = this.annotationsMatcher;
        if (annotationsMatcher == null) {
            annotationsMatcher = new AnnotationsMatcher();
        }
        this.annotationsMatcher = annotationsMatcher;
        C5499.m17100(annotationsMatcher);
        annotationsMatcher.setCount(count);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final FieldMatcher annotations(@InterfaceC6399 AnnotationsMatcher annotations) {
        C5499.m17103(annotations, "annotations");
        this.annotationsMatcher = annotations;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final FieldMatcher anyOf(@InterfaceC6399 Collection<FieldMatcher> matchers) {
        C5499.m17103(matchers, "matchers");
        if (!(!matchers.isEmpty())) {
            matchers = null;
        }
        this.anyOfMatchers = matchers != null ? C3888.m11065(matchers) : null;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5573
    public final FieldMatcher declaredClass(@InterfaceC6399 String str) {
        C5499.m17103(str, "className");
        return declaredClass$default(this, str, null, false, 6, null);
    }

    @InterfaceC6399
    public final FieldMatcher descriptor(@InterfaceC6399 String descriptor) {
        C5499.m17103(descriptor, "descriptor");
        DexField dexField = new DexField(descriptor);
        name$default(this, dexField.getName(), null, false, 6, null);
        declaredClass$default(this, dexField.getClassName(), null, false, 6, null);
        type$default(this, dexField.getTypeName(), null, false, 6, null);
        return this;
    }

    @InterfaceC6489
    public final List<FieldMatcher> getAllOfMatchers() {
        return this.allOfMatchers;
    }

    @InterfaceC6489
    public final AnnotationsMatcher getAnnotationsMatcher() {
        return this.annotationsMatcher;
    }

    @InterfaceC6489
    public final List<FieldMatcher> getAnyOfMatchers() {
        return this.anyOfMatchers;
    }

    @InterfaceC6489
    public final ClassMatcher getClassMatcher() {
        return this.classMatcher;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "Property can only be written.")
    public final /* synthetic */ String getDeclaredClass() {
        throw new C6398(null, 1, null);
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "Property can only be written.")
    public final /* synthetic */ String getDescriptor() {
        throw new C6398(null, 1, null);
    }

    @InterfaceC6489
    public final MethodsMatcher getGetMethodsMatcher() {
        return this.getMethodsMatcher;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "Property can only be written.")
    public final /* synthetic */ int getModifiers() {
        throw new C6398(null, 1, null);
    }

    @InterfaceC6489
    public final AccessFlagsMatcher getModifiersMatcher() {
        return this.modifiersMatcher;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "Property can only be written.")
    public final /* synthetic */ String getName() {
        throw new C6398(null, 1, null);
    }

    @InterfaceC6489
    public final StringMatcher getNameMatcher() {
        return this.nameMatcher;
    }

    @InterfaceC6489
    public final List<FieldMatcher> getNoneOfMatchers() {
        return this.noneOfMatchers;
    }

    @InterfaceC6489
    public final MethodsMatcher getPutMethodsMatcher() {
        return this.putMethodsMatcher;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "Property can only be written.")
    public final /* synthetic */ String getType() {
        throw new C6398(null, 1, null);
    }

    @InterfaceC6489
    public final ClassMatcher getTypeMatcher() {
        return this.typeMatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c0  */
    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int innerBuild(@InterfaceC6399 FlatBufferBuilder fbb) {
        int iCreateVectorOfTables;
        int iCreateVectorOfTables2;
        C5499.m17103(fbb, "fbb");
        FieldMatcher.Companion companion = org.luckypray.dexkit.schema.FieldMatcher.INSTANCE;
        StringMatcher stringMatcher = this.nameMatcher;
        int iCreateVectorOfTables3 = 0;
        int iBuild$dexkit_android_release = stringMatcher != null ? stringMatcher.build$dexkit_android_release(fbb) : 0;
        AccessFlagsMatcher accessFlagsMatcher = this.modifiersMatcher;
        int iBuild$dexkit_android_release2 = accessFlagsMatcher != null ? accessFlagsMatcher.build$dexkit_android_release(fbb) : 0;
        ClassMatcher classMatcher = this.classMatcher;
        int iBuild$dexkit_android_release3 = classMatcher != null ? classMatcher.build$dexkit_android_release(fbb) : 0;
        ClassMatcher classMatcher2 = this.typeMatcher;
        int iBuild$dexkit_android_release4 = classMatcher2 != null ? classMatcher2.build$dexkit_android_release(fbb) : 0;
        AnnotationsMatcher annotationsMatcher = this.annotationsMatcher;
        int iBuild$dexkit_android_release5 = annotationsMatcher != null ? annotationsMatcher.build$dexkit_android_release(fbb) : 0;
        MethodsMatcher methodsMatcher = this.getMethodsMatcher;
        int iBuild$dexkit_android_release6 = methodsMatcher != null ? methodsMatcher.build$dexkit_android_release(fbb) : 0;
        MethodsMatcher methodsMatcher2 = this.putMethodsMatcher;
        int iBuild$dexkit_android_release7 = methodsMatcher2 != null ? methodsMatcher2.build$dexkit_android_release(fbb) : 0;
        List<FieldMatcher> list = this.allOfMatchers;
        if (list != null) {
            ArrayList arrayList = new ArrayList(C3881.m10756(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((FieldMatcher) it.next()).build$dexkit_android_release(fbb)));
            }
            int[] iArrM11061 = C3888.m11061(arrayList);
            iCreateVectorOfTables = iArrM11061 != null ? fbb.createVectorOfTables(iArrM11061) : 0;
        }
        List<FieldMatcher> list2 = this.anyOfMatchers;
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList(C3881.m10756(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(((FieldMatcher) it2.next()).build$dexkit_android_release(fbb)));
            }
            int[] iArrM110612 = C3888.m11061(arrayList2);
            iCreateVectorOfTables2 = iArrM110612 != null ? fbb.createVectorOfTables(iArrM110612) : 0;
        }
        List<FieldMatcher> list3 = this.noneOfMatchers;
        if (list3 != null) {
            ArrayList arrayList3 = new ArrayList(C3881.m10756(list3, 10));
            Iterator<T> it3 = list3.iterator();
            while (it3.hasNext()) {
                arrayList3.add(Integer.valueOf(((FieldMatcher) it3.next()).build$dexkit_android_release(fbb)));
            }
            int[] iArrM110613 = C3888.m11061(arrayList3);
            if (iArrM110613 != null) {
                iCreateVectorOfTables3 = fbb.createVectorOfTables(iArrM110613);
            }
        }
        int iCreateFieldMatcher = companion.createFieldMatcher(fbb, iBuild$dexkit_android_release, iBuild$dexkit_android_release2, iBuild$dexkit_android_release3, iBuild$dexkit_android_release4, iBuild$dexkit_android_release5, iBuild$dexkit_android_release6, iBuild$dexkit_android_release7, iCreateVectorOfTables, iCreateVectorOfTables2, iCreateVectorOfTables3);
        fbb.finish(iCreateFieldMatcher);
        return iCreateFieldMatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5573
    public final FieldMatcher modifiers(int i) {
        return modifiers$default(this, i, null, 2, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5573
    public final FieldMatcher name(@InterfaceC6399 String str) {
        C5499.m17103(str, "name");
        return name$default(this, str, null, false, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final FieldMatcher noneOf(@InterfaceC6399 Collection<FieldMatcher> matchers) {
        C5499.m17103(matchers, "matchers");
        if (!(!matchers.isEmpty())) {
            matchers = null;
        }
        this.noneOfMatchers = matchers != null ? C3888.m11065(matchers) : null;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final FieldMatcher not(@InterfaceC6399 FieldMatcher matcher) {
        C5499.m17103(matcher, "matcher");
        addNoneOf(matcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final FieldMatcher readMethods(@InterfaceC6399 MethodsMatcher readMethods) {
        C5499.m17103(readMethods, "readMethods");
        this.getMethodsMatcher = readMethods;
        return this;
    }

    public final /* synthetic */ void setDeclaredClass(String str) {
        C5499.m17103(str, "value");
        declaredClass$default(this, str, null, false, 6, null);
    }

    public final /* synthetic */ void setDescriptor(String str) {
        C5499.m17103(str, "value");
        descriptor(str);
    }

    public final /* synthetic */ void setModifiers(int i) {
        modifiers$default(this, i, null, 2, null);
    }

    public final /* synthetic */ void setName(String str) {
        C5499.m17103(str, "value");
        name$default(this, str, null, false, 6, null);
    }

    public final /* synthetic */ void setType(String str) {
        C5499.m17103(str, "value");
        type$default(this, str, null, false, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5573
    public final FieldMatcher type(@InterfaceC6399 String str) {
        C5499.m17103(str, "typeName");
        return type$default(this, str, null, false, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final FieldMatcher writeMethods(@InterfaceC6399 MethodsMatcher writeMethods) {
        C5499.m17103(writeMethods, "writeMethods");
        this.putMethodsMatcher = writeMethods;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public FieldMatcher(@InterfaceC6399 Field field) {
        C5499.m17103(field, "field");
        descriptor(DexSignUtil.getFieldDescriptor(field));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5578
    public static final FieldMatcher create(@InterfaceC6399 String str) {
        return INSTANCE.create(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    public final FieldMatcher allOf(@InterfaceC6399 FieldMatcher... matchers) {
        C5499.m17103(matchers, "matchers");
        allOf(C3404.m7069(matchers));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final /* synthetic */ FieldMatcher annotations(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        AnnotationsMatcher annotationsMatcher = new AnnotationsMatcher();
        init.invoke(annotationsMatcher);
        annotations(annotationsMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    public final FieldMatcher anyOf(@InterfaceC6399 FieldMatcher... matchers) {
        C5499.m17103(matchers, "matchers");
        anyOf(C3404.m7069(matchers));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5573
    public final FieldMatcher declaredClass(@InterfaceC6399 String str, @InterfaceC6399 StringMatchType stringMatchType) {
        C5499.m17103(str, "className");
        C5499.m17103(stringMatchType, "matchType");
        return declaredClass$default(this, str, stringMatchType, false, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    public final FieldMatcher modifiers(@InterfaceC6399 AccessFlagsMatcher modifiers) {
        C5499.m17103(modifiers, "modifiers");
        this.modifiersMatcher = modifiers;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5573
    public final FieldMatcher name(@InterfaceC6399 String str, @InterfaceC6399 StringMatchType stringMatchType) {
        C5499.m17103(str, "name");
        C5499.m17103(stringMatchType, "matchType");
        return name$default(this, str, stringMatchType, false, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    public final FieldMatcher noneOf(@InterfaceC6399 FieldMatcher... matchers) {
        C5499.m17103(matchers, "matchers");
        noneOf(C3404.m7069(matchers));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final /* synthetic */ FieldMatcher not(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        FieldMatcher fieldMatcher = new FieldMatcher();
        init.invoke(fieldMatcher);
        not(fieldMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final /* synthetic */ FieldMatcher readMethods(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        MethodsMatcher methodsMatcher = new MethodsMatcher();
        init.invoke(methodsMatcher);
        readMethods(methodsMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5573
    public final FieldMatcher type(@InterfaceC6399 String str, @InterfaceC6399 StringMatchType stringMatchType) {
        C5499.m17103(str, "typeName");
        C5499.m17103(stringMatchType, "matchType");
        return type$default(this, str, stringMatchType, false, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final /* synthetic */ FieldMatcher writeMethods(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        MethodsMatcher methodsMatcher = new MethodsMatcher();
        init.invoke(methodsMatcher);
        writeMethods(methodsMatcher);
        return this;
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final FieldMatcher create(@InterfaceC6399 Field field) {
        return INSTANCE.create(field);
    }

    public final /* synthetic */ FieldMatcher addAllOf(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        FieldMatcher fieldMatcher = new FieldMatcher();
        init.invoke(fieldMatcher);
        addAllOf(fieldMatcher);
        return this;
    }

    public final /* synthetic */ FieldMatcher addAnnotation(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        AnnotationMatcher annotationMatcher = new AnnotationMatcher();
        init.invoke(annotationMatcher);
        addAnnotation(annotationMatcher);
        return this;
    }

    public final /* synthetic */ FieldMatcher addAnyOf(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        FieldMatcher fieldMatcher = new FieldMatcher();
        init.invoke(fieldMatcher);
        addAnyOf(fieldMatcher);
        return this;
    }

    public final /* synthetic */ FieldMatcher addNoneOf(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        FieldMatcher fieldMatcher = new FieldMatcher();
        init.invoke(fieldMatcher);
        addNoneOf(fieldMatcher);
        return this;
    }

    @InterfaceC6399
    public final FieldMatcher addReadMethod(@InterfaceC6399 String methodDescriptor) {
        C5499.m17103(methodDescriptor, "methodDescriptor");
        MethodsMatcher methodsMatcher = this.getMethodsMatcher;
        if (methodsMatcher == null) {
            methodsMatcher = new MethodsMatcher();
        }
        this.getMethodsMatcher = methodsMatcher;
        C5499.m17100(methodsMatcher);
        methodsMatcher.add(new MethodMatcher(methodDescriptor));
        return this;
    }

    @InterfaceC6399
    public final FieldMatcher addWriteMethod(@InterfaceC6399 String methodDescriptor) {
        C5499.m17103(methodDescriptor, "methodDescriptor");
        MethodsMatcher methodsMatcher = this.putMethodsMatcher;
        if (methodsMatcher == null) {
            methodsMatcher = new MethodsMatcher();
        }
        this.putMethodsMatcher = methodsMatcher;
        C5499.m17100(methodsMatcher);
        methodsMatcher.add(new MethodMatcher(methodDescriptor));
        return this;
    }

    public final /* synthetic */ FieldMatcher allOf(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        FieldMatcherList fieldMatcherList = new FieldMatcherList();
        init.invoke(fieldMatcherList);
        allOf(fieldMatcherList);
        return this;
    }

    @InterfaceC6399
    public final FieldMatcher annotationCount(@InterfaceC6399 IntRange range) {
        C5499.m17103(range, "range");
        AnnotationsMatcher annotationsMatcher = this.annotationsMatcher;
        if (annotationsMatcher == null) {
            annotationsMatcher = new AnnotationsMatcher();
        }
        this.annotationsMatcher = annotationsMatcher;
        C5499.m17100(annotationsMatcher);
        annotationsMatcher.count(range);
        return this;
    }

    public final /* synthetic */ FieldMatcher anyOf(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        FieldMatcherList fieldMatcherList = new FieldMatcherList();
        init.invoke(fieldMatcherList);
        anyOf(fieldMatcherList);
        return this;
    }

    @InterfaceC6399
    public final FieldMatcher declaredClass(@InterfaceC6399 ClassMatcher declaredClass) {
        C5499.m17103(declaredClass, "declaredClass");
        this.classMatcher = declaredClass;
        return this;
    }

    @InterfaceC6399
    @InterfaceC5573
    public final FieldMatcher modifiers(int modifiers, @InterfaceC6399 MatchType matchType) {
        C5499.m17103(matchType, "matchType");
        this.modifiersMatcher = new AccessFlagsMatcher(modifiers, matchType);
        return this;
    }

    @InterfaceC6399
    public final FieldMatcher name(@InterfaceC6399 StringMatcher name) {
        C5499.m17103(name, "name");
        this.nameMatcher = name;
        return this;
    }

    public final /* synthetic */ FieldMatcher noneOf(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        FieldMatcherList fieldMatcherList = new FieldMatcherList();
        init.invoke(fieldMatcherList);
        noneOf(fieldMatcherList);
        return this;
    }

    @InterfaceC6399
    public final FieldMatcher type(@InterfaceC6399 ClassMatcher type) {
        C5499.m17103(type, "type");
        this.typeMatcher = type;
        return this;
    }

    public FieldMatcher(@InterfaceC6399 String str) {
        C5499.m17103(str, "descriptor");
        descriptor(str);
    }

    @InterfaceC6399
    public final FieldMatcher declaredClass(@InterfaceC6399 Class<?> clazz) {
        C5499.m17103(clazz, "clazz");
        this.classMatcher = ClassMatcher.className$default(new ClassMatcher(), DexSignUtil.getTypeName(clazz), null, false, 6, null);
        return this;
    }

    @InterfaceC6399
    @InterfaceC5573
    public final FieldMatcher name(@InterfaceC6399 String name, @InterfaceC6399 StringMatchType matchType, boolean ignoreCase) {
        C5499.m17103(name, "name");
        C5499.m17103(matchType, "matchType");
        this.nameMatcher = new StringMatcher(name, matchType, ignoreCase);
        return this;
    }

    @InterfaceC6399
    public final FieldMatcher type(@InterfaceC6399 Class<?> clazz) {
        C5499.m17103(clazz, "clazz");
        this.typeMatcher = ClassMatcher.className$default(new ClassMatcher(), DexSignUtil.getTypeName(clazz), null, false, 6, null);
        return this;
    }

    public final /* synthetic */ FieldMatcher addReadMethod(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        MethodMatcher methodMatcher = new MethodMatcher();
        init.invoke(methodMatcher);
        addReadMethod(methodMatcher);
        return this;
    }

    public final /* synthetic */ FieldMatcher addWriteMethod(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        MethodMatcher methodMatcher = new MethodMatcher();
        init.invoke(methodMatcher);
        addWriteMethod(methodMatcher);
        return this;
    }

    @InterfaceC6399
    public final FieldMatcher annotationCount(@InterfaceC6399 C5458 range) {
        C5499.m17103(range, "range");
        AnnotationsMatcher annotationsMatcher = this.annotationsMatcher;
        if (annotationsMatcher == null) {
            annotationsMatcher = new AnnotationsMatcher();
        }
        this.annotationsMatcher = annotationsMatcher;
        C5499.m17100(annotationsMatcher);
        annotationsMatcher.count(range);
        return this;
    }

    @InterfaceC6399
    @InterfaceC5573
    public final FieldMatcher declaredClass(@InterfaceC6399 String className, @InterfaceC6399 StringMatchType matchType, boolean ignoreCase) {
        C5499.m17103(className, "className");
        C5499.m17103(matchType, "matchType");
        this.classMatcher = new ClassMatcher().className(className, matchType, ignoreCase);
        return this;
    }

    @InterfaceC6399
    @InterfaceC5573
    public final FieldMatcher type(@InterfaceC6399 String typeName, @InterfaceC6399 StringMatchType matchType, boolean ignoreCase) {
        C5499.m17103(typeName, "typeName");
        C5499.m17103(matchType, "matchType");
        this.typeMatcher = new ClassMatcher().className(typeName, matchType, ignoreCase);
        return this;
    }

    public final /* synthetic */ FieldMatcher declaredClass(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        ClassMatcher classMatcher = new ClassMatcher();
        init.invoke(classMatcher);
        declaredClass(classMatcher);
        return this;
    }

    public final /* synthetic */ FieldMatcher type(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        ClassMatcher classMatcher = new ClassMatcher();
        init.invoke(classMatcher);
        type(classMatcher);
        return this;
    }

    @InterfaceC6399
    public final FieldMatcher annotationCount(int min, int max) {
        AnnotationsMatcher annotationsMatcher = this.annotationsMatcher;
        if (annotationsMatcher == null) {
            annotationsMatcher = new AnnotationsMatcher();
        }
        this.annotationsMatcher = annotationsMatcher;
        C5499.m17100(annotationsMatcher);
        annotationsMatcher.count(min, max);
        return this;
    }
}
