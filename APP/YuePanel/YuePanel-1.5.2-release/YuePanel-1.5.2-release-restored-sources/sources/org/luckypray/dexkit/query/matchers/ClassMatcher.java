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
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.query.ClassMatcherList;
import org.luckypray.dexkit.query.StringMatcherList;
import org.luckypray.dexkit.query.base.BaseMatcher;
import org.luckypray.dexkit.query.base.IAnnotationEncodeValue;
import org.luckypray.dexkit.query.enums.MatchType;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher;
import org.luckypray.dexkit.query.matchers.base.IntRange;
import org.luckypray.dexkit.query.matchers.base.StringMatcher;
import org.luckypray.dexkit.schema.ClassMatcher;
import org.luckypray.dexkit.util.DexSignUtil;
import org.luckypray.dexkit.wrap.DexClass;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nClassMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassMatcher.kt\norg/luckypray/dexkit/query/matchers/ClassMatcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1160:1\n1547#2:1161\n1618#2,3:1162\n1547#2:1169\n1618#2,3:1170\n1547#2:1178\n1618#2,3:1179\n1547#2:1182\n1618#2,3:1183\n1547#2:1186\n1618#2,3:1187\n1547#2:1190\n1618#2,3:1191\n11328#3:1165\n11663#3,3:1166\n11328#3:1173\n11663#3,3:1174\n1#4:1177\n*S KotlinDebug\n*F\n+ 1 ClassMatcher.kt\norg/luckypray/dexkit/query/matchers/ClassMatcher\n*L\n797#1:1161\n797#1:1162,3\n825#1:1169\n825#1:1170,3\n1147#1:1178\n1147#1:1179,3\n1149#1:1182\n1149#1:1183,3\n1151#1:1186\n1151#1:1187,3\n1153#1:1190\n1153#1:1191,3\n813#1:1165\n813#1:1166,3\n837#1:1173\n837#1:1174,3\n*E\n"})
@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010!\n\u0002\b\u001e\u0018\u0000 ¦\u00012\u00020\u00012\u00020\u0002:\u0002¦\u0001B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0015\b\u0016\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\u0003\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0003\u0010\nJ\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u000e\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u000fJ+\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00192\b\b\u0002\u0010\u0011\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u0017\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u001c\u0010\u0014J\u0015\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0000¢\u0006\u0004\b\"\u0010\u001dJ+\u0010\"\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\"\u0010\u0014J\u0015\u0010$\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0019¢\u0006\u0004\b$\u0010%J\u0015\u0010$\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b$\u0010(J\u0015\u0010$\u001a\u00020\u00002\u0006\u0010'\u001a\u00020)¢\u0006\u0004\b$\u0010*J!\u0010$\u001a\u00020\u00002\b\b\u0002\u0010+\u001a\u00020\u00192\b\b\u0002\u0010,\u001a\u00020\u0019¢\u0006\u0004\b$\u0010-J\u0015\u0010/\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b/\u00100J\u0015\u00103\u001a\u00020\u00002\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\u0015\u00105\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0019¢\u0006\u0004\b5\u0010%J\u0015\u00105\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b5\u0010(J\u0015\u00105\u001a\u00020\u00002\u0006\u0010'\u001a\u00020)¢\u0006\u0004\b5\u0010*J!\u00105\u001a\u00020\u00002\b\b\u0002\u0010+\u001a\u00020\u00192\b\b\u0002\u0010,\u001a\u00020\u0019¢\u0006\u0004\b5\u0010-J\u0015\u00107\u001a\u00020\u00002\u0006\u00107\u001a\u000206¢\u0006\u0004\b7\u00108J\u0015\u0010;\u001a\u00020\u00002\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<J+\u0010>\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b>\u0010\u0014J+\u0010@\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b@\u0010\u0014J\u0019\u0010@\u001a\u00020\u00002\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b@\u0010AJ\u0015\u0010B\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0019¢\u0006\u0004\bB\u0010%J\u0015\u0010B\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&¢\u0006\u0004\bB\u0010(J\u0015\u0010B\u001a\u00020\u00002\u0006\u0010'\u001a\u00020)¢\u0006\u0004\bB\u0010*J!\u0010B\u001a\u00020\u00002\b\b\u0002\u0010+\u001a\u00020\u00192\b\b\u0002\u0010,\u001a\u00020\u0019¢\u0006\u0004\bB\u0010-J\u0015\u0010D\u001a\u00020\u00002\u0006\u0010D\u001a\u00020C¢\u0006\u0004\bD\u0010EJ\u0015\u0010H\u001a\u00020\u00002\u0006\u0010G\u001a\u00020F¢\u0006\u0004\bH\u0010IJ\u0015\u0010J\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0019¢\u0006\u0004\bJ\u0010%J\u0015\u0010J\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&¢\u0006\u0004\bJ\u0010(J\u0015\u0010J\u001a\u00020\u00002\u0006\u0010'\u001a\u00020)¢\u0006\u0004\bJ\u0010*J!\u0010J\u001a\u00020\u00002\b\b\u0002\u0010+\u001a\u00020\u00192\b\b\u0002\u0010,\u001a\u00020\u0019¢\u0006\u0004\bJ\u0010-J\u0015\u0010L\u001a\u00020\u00002\u0006\u0010L\u001a\u00020K¢\u0006\u0004\bL\u0010MJ1\u0010L\u001a\u00020\u00002\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\b0N2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\bL\u0010OJ!\u0010L\u001a\u00020\u00002\u0012\u0010L\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0P\"\u00020\b¢\u0006\u0004\bL\u0010QJ\u001b\u0010R\u001a\u00020\u00002\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\b0N¢\u0006\u0004\bR\u0010SJ!\u0010R\u001a\u00020\u00002\u0012\u0010L\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0P\"\u00020\b¢\u0006\u0004\bR\u0010QJ\u0015\u0010U\u001a\u00020\u00002\u0006\u0010T\u001a\u00020\f¢\u0006\u0004\bU\u0010\u000fJ+\u0010U\u001a\u00020\u00002\u0006\u0010T\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\bU\u0010\u0014J\u0015\u0010V\u001a\u00020\u00002\u0006\u0010T\u001a\u00020\b¢\u0006\u0004\bV\u0010\u000bJ\u001b\u0010X\u001a\u00020\u00002\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00000N¢\u0006\u0004\bX\u0010SJ!\u0010X\u001a\u00020\u00002\u0012\u0010W\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000P\"\u00020\u0000¢\u0006\u0004\bX\u0010YJ\u0015\u0010Z\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000¢\u0006\u0004\bZ\u0010\u001dJ\u001b\u0010[\u001a\u00020\u00002\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00000N¢\u0006\u0004\b[\u0010SJ!\u0010[\u001a\u00020\u00002\u0012\u0010W\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000P\"\u00020\u0000¢\u0006\u0004\b[\u0010YJ\u0015\u0010\\\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b\\\u0010\u001dJ\u001b\u0010]\u001a\u00020\u00002\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00000N¢\u0006\u0004\b]\u0010SJ!\u0010]\u001a\u00020\u00002\u0012\u0010W\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000P\"\u00020\u0000¢\u0006\u0004\b]\u0010YJ\u0015\u0010^\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b^\u0010\u001dJ\u0015\u0010_\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b_\u0010\u001dJ&\u0010\u001c\u001a\u00020\u00002\u0017\u0010c\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020a0`¢\u0006\u0002\bb¢\u0006\u0004\b\u001c\u0010dJ&\u0010\u001f\u001a\u00020\u00002\u0017\u0010c\u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020a0`¢\u0006\u0002\bb¢\u0006\u0004\b\u001f\u0010dJ&\u0010\"\u001a\u00020\u00002\u0017\u0010c\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020a0`¢\u0006\u0002\bb¢\u0006\u0004\b\"\u0010dJ&\u0010/\u001a\u00020\u00002\u0017\u0010c\u001a\u0013\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020a0`¢\u0006\u0002\bb¢\u0006\u0004\b/\u0010dJ&\u00103\u001a\u00020\u00002\u0017\u0010c\u001a\u0013\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020a0`¢\u0006\u0002\bb¢\u0006\u0004\b3\u0010dJ&\u00107\u001a\u00020\u00002\u0017\u0010c\u001a\u0013\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020a0`¢\u0006\u0002\bb¢\u0006\u0004\b7\u0010dJ&\u0010;\u001a\u00020\u00002\u0017\u0010c\u001a\u0013\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020a0`¢\u0006\u0002\bb¢\u0006\u0004\b;\u0010dJ&\u0010D\u001a\u00020\u00002\u0017\u0010c\u001a\u0013\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020a0`¢\u0006\u0002\bb¢\u0006\u0004\bD\u0010dJ&\u0010H\u001a\u00020\u00002\u0017\u0010c\u001a\u0013\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020a0`¢\u0006\u0002\bb¢\u0006\u0004\bH\u0010dJ&\u0010L\u001a\u00020\u00002\u0017\u0010c\u001a\u0013\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020a0`¢\u0006\u0002\bb¢\u0006\u0004\bL\u0010dJ&\u0010X\u001a\u00020\u00002\u0017\u0010c\u001a\u0013\u0012\u0004\u0012\u00020e\u0012\u0004\u0012\u00020a0`¢\u0006\u0002\bb¢\u0006\u0004\bX\u0010dJ&\u0010Z\u001a\u00020\u00002\u0017\u0010c\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020a0`¢\u0006\u0002\bb¢\u0006\u0004\bZ\u0010dJ&\u0010[\u001a\u00020\u00002\u0017\u0010c\u001a\u0013\u0012\u0004\u0012\u00020e\u0012\u0004\u0012\u00020a0`¢\u0006\u0002\bb¢\u0006\u0004\b[\u0010dJ&\u0010\\\u001a\u00020\u00002\u0017\u0010c\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020a0`¢\u0006\u0002\bb¢\u0006\u0004\b\\\u0010dJ&\u0010]\u001a\u00020\u00002\u0017\u0010c\u001a\u0013\u0012\u0004\u0012\u00020e\u0012\u0004\u0012\u00020a0`¢\u0006\u0002\bb¢\u0006\u0004\b]\u0010dJ&\u0010^\u001a\u00020\u00002\u0017\u0010c\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020a0`¢\u0006\u0002\bb¢\u0006\u0004\b^\u0010dJ&\u0010_\u001a\u00020\u00002\u0017\u0010c\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020a0`¢\u0006\u0002\bb¢\u0006\u0004\b_\u0010dJ\u0017\u0010h\u001a\u00020\u00192\u0006\u0010g\u001a\u00020fH\u0014¢\u0006\u0004\bh\u0010iR(\u0010k\u001a\u0004\u0018\u00010\f2\b\u0010j\u001a\u0004\u0018\u00010\f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR(\u0010o\u001a\u0004\u0018\u00010\f2\b\u0010j\u001a\u0004\u0018\u00010\f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bo\u0010l\u001a\u0004\bp\u0010nR(\u0010q\u001a\u0004\u0018\u00010\u00162\b\u0010j\u001a\u0004\u0018\u00010\u00168\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010tR(\u0010u\u001a\u0004\u0018\u00010\u00002\b\u0010j\u001a\u0004\u0018\u00010\u00008\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010xR(\u0010y\u001a\u0004\u0018\u00010\u001e2\b\u0010j\u001a\u0004\u0018\u00010\u001e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\b{\u0010|R)\u0010}\u001a\u0004\u0018\u00010.2\b\u0010j\u001a\u0004\u0018\u00010.8\u0006@BX\u0086\u000e¢\u0006\r\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R-\u0010\u0081\u0001\u001a\u0004\u0018\u0001062\b\u0010j\u001a\u0004\u0018\u0001068\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R-\u0010\u0085\u0001\u001a\u0004\u0018\u00010C2\b\u0010j\u001a\u0004\u0018\u00010C8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R;\u0010\u008a\u0001\u001a\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u0089\u00012\u000f\u0010j\u001a\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u0089\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R;\u0010\u008e\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0089\u00012\u000f\u0010j\u001a\u000b\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0089\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u008e\u0001\u0010\u008b\u0001\u001a\u0006\b\u008f\u0001\u0010\u008d\u0001R;\u0010\u0090\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0089\u00012\u000f\u0010j\u001a\u000b\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0089\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0090\u0001\u0010\u008b\u0001\u001a\u0006\b\u0091\u0001\u0010\u008d\u0001R;\u0010\u0092\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0089\u00012\u000f\u0010j\u001a\u000b\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0089\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0092\u0001\u0010\u008b\u0001\u001a\u0006\b\u0093\u0001\u0010\u008d\u0001R(\u0010\t\u001a\u00020\b2\u0007\u0010\u0094\u0001\u001a\u00020\b8G@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0005\b\u0097\u0001\u0010\nR(\u0010\u000e\u001a\u00020\b2\u0007\u0010\u0094\u0001\u001a\u00020\b8G@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u0098\u0001\u0010\u0096\u0001\"\u0005\b\u0099\u0001\u0010\nR(\u0010\u0015\u001a\u00020\b2\u0007\u0010\u0094\u0001\u001a\u00020\b8G@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u009a\u0001\u0010\u0096\u0001\"\u0005\b\u009b\u0001\u0010\nR)\u0010\u0017\u001a\u00020\u00192\u0007\u0010\u0094\u0001\u001a\u00020\u00198G@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R(\u0010\u001c\u001a\u00020\b2\u0007\u0010\u0094\u0001\u001a\u00020\b8G@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b \u0001\u0010\u0096\u0001\"\u0005\b¡\u0001\u0010\nR5\u0010L\u001a\b\u0012\u0004\u0012\u00020\b0N2\r\u0010\u0094\u0001\u001a\b\u0012\u0004\u0012\u00020\b0N8G@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0006\b¤\u0001\u0010¥\u0001¨\u0006§\u0001"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "Lorg/luckypray/dexkit/query/base/BaseMatcher;", "Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "Ljava/lang/Class;", "clazz", "(Ljava/lang/Class;)V", "", "descriptor", "(Ljava/lang/String;)V", "(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "matcher", "source", "(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "Lorg/luckypray/dexkit/query/enums/StringMatchType;", "matchType", "", "ignoreCase", "(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "className", "Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;", "modifiers", "(Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "", "Lorg/luckypray/dexkit/query/enums/MatchType;", "(ILorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "superClass", "(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;", "interfaces", "(Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "interfaceMatcher", "addInterface", "count", "interfaceCount", "(I)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "range", "(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "LYue/ۥ۠ۥۣۨ;", "(LYue/ۥ۠ۥۣۨ;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "min", "max", "(II)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;", "annotations", "(Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "annotationMatcher", "addAnnotation", "(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "annotationCount", "Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;", "fields", "(Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "fieldMatcher", "addField", "(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "fieldName", "addFieldForName", "typeName", "addFieldForType", "(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "fieldCount", "Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;", "methods", "(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "methodMatcher", "addMethod", "(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "methodCount", "Lorg/luckypray/dexkit/query/StringMatcherList;", "usingStrings", "(Lorg/luckypray/dexkit/query/StringMatcherList;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "", "(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "", "([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "usingEqStrings", "(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "usingString", "addUsingString", "addEqString", "matchers", "allOf", "([Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "addAllOf", "anyOf", "addAnyOf", "noneOf", "addNoneOf", "not", "Lkotlin/Function1;", "LYue/ۥۣۢ۠ۤ;", "LYue/ۥ۠ۡۥۧ;", "init", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "Lorg/luckypray/dexkit/query/ClassMatcherList;", "Lcom/google/flatbuffers/FlatBufferBuilder;", "fbb", "innerBuild", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "<set-?>", "sourceMatcher", "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "getSourceMatcher", "()Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "classNameMatcher", "getClassNameMatcher", "modifiersMatcher", "Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;", "getModifiersMatcher", "()Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;", "superClassMatcher", "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "getSuperClassMatcher", "()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "interfacesMatcher", "Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;", "getInterfacesMatcher", "()Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;", "annotationsMatcher", "Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;", "getAnnotationsMatcher", "()Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;", "fieldsMatcher", "Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;", "getFieldsMatcher", "()Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;", "methodsMatcher", "Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;", "getMethodsMatcher", "()Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;", "", "usingStringsMatcher", "Ljava/util/List;", "getUsingStringsMatcher", "()Ljava/util/List;", "allOfMatchers", "getAllOfMatchers", "anyOfMatchers", "getAnyOfMatchers", "noneOfMatchers", "getNoneOfMatchers", "value", "getDescriptor", "()Ljava/lang/String;", "setDescriptor", "getSource", "setSource", "getClassName", "setClassName", "getModifiers", "()I", "setModifiers", "(I)V", "getSuperClass", "setSuperClass", "getUsingStrings", "()Ljava/util/Collection;", "setUsingStrings", "(Ljava/util/Collection;)V", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class ClassMatcher extends BaseMatcher implements IAnnotationEncodeValue {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @InterfaceC6399
    public static final Companion INSTANCE = new Companion(null);

    @InterfaceC6489
    private List<ClassMatcher> allOfMatchers;

    @InterfaceC6489
    private AnnotationsMatcher annotationsMatcher;

    @InterfaceC6489
    private List<ClassMatcher> anyOfMatchers;

    @InterfaceC6489
    private StringMatcher classNameMatcher;

    @InterfaceC6489
    private FieldsMatcher fieldsMatcher;

    @InterfaceC6489
    private InterfacesMatcher interfacesMatcher;

    @InterfaceC6489
    private MethodsMatcher methodsMatcher;

    @InterfaceC6489
    private AccessFlagsMatcher modifiersMatcher;

    @InterfaceC6489
    private List<ClassMatcher> noneOfMatchers;

    @InterfaceC6489
    private StringMatcher sourceMatcher;

    @InterfaceC6489
    private ClassMatcher superClassMatcher;

    @InterfaceC6489
    private List<StringMatcher> usingStringsMatcher;

    @InterfaceC6211(m2698d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0014\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, m2699d2 = {"Lorg/luckypray/dexkit/query/matchers/ClassMatcher$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "clazz", "Ljava/lang/Class;", "descriptor", "", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.query.matchers.ClassMatcher.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6399
        @InterfaceC5578
        public final ClassMatcher create() {
            return new ClassMatcher();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @InterfaceC6399
        @InterfaceC5578
        public final ClassMatcher create(@InterfaceC6399 Class<?> cls) {
            C5499.m17103(cls, "clazz");
            return new ClassMatcher(cls);
        }

        @InterfaceC6399
        @InterfaceC5578
        public final ClassMatcher create(@InterfaceC6399 String str) {
            C5499.m17103(str, "descriptor");
            return new ClassMatcher(str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ClassMatcher() {
    }

    public static /* synthetic */ ClassMatcher addFieldForName$default(ClassMatcher classMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return classMatcher.addFieldForName(str, stringMatchType, z);
    }

    public static /* synthetic */ ClassMatcher addFieldForType$default(ClassMatcher classMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return classMatcher.addFieldForType(str, stringMatchType, z);
    }

    public static /* synthetic */ ClassMatcher addInterface$default(ClassMatcher classMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return classMatcher.addInterface(str, stringMatchType, z);
    }

    public static /* synthetic */ ClassMatcher addUsingString$default(ClassMatcher classMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Contains;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return classMatcher.addUsingString(str, stringMatchType, z);
    }

    public static /* synthetic */ ClassMatcher annotationCount$default(ClassMatcher classMatcher, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return classMatcher.annotationCount(i, i2);
    }

    public static /* synthetic */ ClassMatcher className$default(ClassMatcher classMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return classMatcher.className(str, stringMatchType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5578
    public static final ClassMatcher create() {
        return INSTANCE.create();
    }

    public static /* synthetic */ ClassMatcher fieldCount$default(ClassMatcher classMatcher, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return classMatcher.fieldCount(i, i2);
    }

    public static /* synthetic */ ClassMatcher interfaceCount$default(ClassMatcher classMatcher, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return classMatcher.interfaceCount(i, i2);
    }

    public static /* synthetic */ ClassMatcher methodCount$default(ClassMatcher classMatcher, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return classMatcher.methodCount(i, i2);
    }

    public static /* synthetic */ ClassMatcher modifiers$default(ClassMatcher classMatcher, int i, MatchType matchType, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            matchType = MatchType.Contains;
        }
        return classMatcher.modifiers(i, matchType);
    }

    public static /* synthetic */ ClassMatcher source$default(ClassMatcher classMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return classMatcher.source(str, stringMatchType, z);
    }

    public static /* synthetic */ ClassMatcher superClass$default(ClassMatcher classMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return classMatcher.superClass(str, stringMatchType, z);
    }

    public static /* synthetic */ ClassMatcher usingStrings$default(ClassMatcher classMatcher, Collection collection, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Contains;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return classMatcher.usingStrings(collection, stringMatchType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final ClassMatcher addAllOf(@InterfaceC6399 ClassMatcher matcher) {
        C5499.m17103(matcher, "matcher");
        List<ClassMatcher> arrayList = this.allOfMatchers;
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
    public final ClassMatcher addAnnotation(@InterfaceC6399 AnnotationMatcher annotationMatcher) {
        C5499.m17103(annotationMatcher, "annotationMatcher");
        AnnotationsMatcher annotationsMatcher = this.annotationsMatcher;
        if (annotationsMatcher == null) {
            annotationsMatcher = new AnnotationsMatcher();
        }
        this.annotationsMatcher = annotationsMatcher;
        C5499.m17100(annotationsMatcher);
        annotationsMatcher.add(annotationMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final ClassMatcher addAnyOf(@InterfaceC6399 ClassMatcher matcher) {
        C5499.m17103(matcher, "matcher");
        List<ClassMatcher> arrayList = this.anyOfMatchers;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.anyOfMatchers = arrayList;
        C5499.m17100(arrayList);
        arrayList.add(matcher);
        return this;
    }

    @InterfaceC6399
    public final ClassMatcher addEqString(@InterfaceC6399 String usingString) {
        C5499.m17103(usingString, "usingString");
        List<StringMatcher> arrayList = this.usingStringsMatcher;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.usingStringsMatcher = arrayList;
        C5499.m17100(arrayList);
        arrayList.add(new StringMatcher(usingString, StringMatchType.Equals, false));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final ClassMatcher addField(@InterfaceC6399 FieldMatcher fieldMatcher) {
        C5499.m17103(fieldMatcher, "fieldMatcher");
        FieldsMatcher fieldsMatcher = this.fieldsMatcher;
        if (fieldsMatcher == null) {
            fieldsMatcher = new FieldsMatcher();
        }
        this.fieldsMatcher = fieldsMatcher;
        C5499.m17100(fieldsMatcher);
        fieldsMatcher.add(fieldMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5573
    public final ClassMatcher addFieldForName(@InterfaceC6399 String str) {
        C5499.m17103(str, "fieldName");
        return addFieldForName$default(this, str, null, false, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5573
    public final ClassMatcher addFieldForType(@InterfaceC6399 String str) {
        C5499.m17103(str, "typeName");
        return addFieldForType$default(this, str, null, false, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5573
    public final ClassMatcher addInterface(@InterfaceC6399 String str) {
        C5499.m17103(str, "className");
        return addInterface$default(this, str, null, false, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final ClassMatcher addMethod(@InterfaceC6399 MethodMatcher methodMatcher) {
        C5499.m17103(methodMatcher, "methodMatcher");
        MethodsMatcher methodsMatcher = this.methodsMatcher;
        if (methodsMatcher == null) {
            methodsMatcher = new MethodsMatcher();
        }
        this.methodsMatcher = methodsMatcher;
        C5499.m17100(methodsMatcher);
        methodsMatcher.add(methodMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final ClassMatcher addNoneOf(@InterfaceC6399 ClassMatcher matcher) {
        C5499.m17103(matcher, "matcher");
        List<ClassMatcher> arrayList = this.noneOfMatchers;
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
    @InterfaceC5573
    public final ClassMatcher addUsingString(@InterfaceC6399 String str) {
        C5499.m17103(str, "usingString");
        return addUsingString$default(this, str, null, false, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final ClassMatcher allOf(@InterfaceC6399 Collection<ClassMatcher> matchers) {
        C5499.m17103(matchers, "matchers");
        if (!(!matchers.isEmpty())) {
            matchers = null;
        }
        this.allOfMatchers = matchers != null ? C3888.m11065(matchers) : null;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final ClassMatcher annotationCount(int count) {
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
    public final ClassMatcher annotations(@InterfaceC6399 AnnotationsMatcher annotations) {
        C5499.m17103(annotations, "annotations");
        this.annotationsMatcher = annotations;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final ClassMatcher anyOf(@InterfaceC6399 Collection<ClassMatcher> matchers) {
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
    public final ClassMatcher className(@InterfaceC6399 String str) {
        C5499.m17103(str, "className");
        return className$default(this, str, null, false, 6, null);
    }

    @InterfaceC6399
    public final ClassMatcher descriptor(@InterfaceC6399 String descriptor) {
        C5499.m17103(descriptor, "descriptor");
        className$default(this, new DexClass(descriptor).getTypeName(), null, false, 6, null);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final ClassMatcher fieldCount(int count) {
        FieldsMatcher fieldsMatcher = this.fieldsMatcher;
        if (fieldsMatcher == null) {
            fieldsMatcher = new FieldsMatcher();
        }
        this.fieldsMatcher = fieldsMatcher;
        C5499.m17100(fieldsMatcher);
        fieldsMatcher.setCount(count);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final ClassMatcher fields(@InterfaceC6399 FieldsMatcher fields) {
        C5499.m17103(fields, "fields");
        this.fieldsMatcher = fields;
        return this;
    }

    @InterfaceC6489
    public final List<ClassMatcher> getAllOfMatchers() {
        return this.allOfMatchers;
    }

    @InterfaceC6489
    public final AnnotationsMatcher getAnnotationsMatcher() {
        return this.annotationsMatcher;
    }

    @InterfaceC6489
    public final List<ClassMatcher> getAnyOfMatchers() {
        return this.anyOfMatchers;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC4372(level = EnumC0393.f8971, message = "Property can only be written.")
    public final /* synthetic */ String getClassName() {
        throw new C6398(null, 1, 0 == true ? 1 : 0);
    }

    @InterfaceC6489
    public final StringMatcher getClassNameMatcher() {
        return this.classNameMatcher;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC4372(level = EnumC0393.f8971, message = "Property can only be written.")
    public final /* synthetic */ String getDescriptor() {
        throw new C6398(null, 1, 0 == true ? 1 : 0);
    }

    @InterfaceC6489
    public final FieldsMatcher getFieldsMatcher() {
        return this.fieldsMatcher;
    }

    @InterfaceC6489
    public final InterfacesMatcher getInterfacesMatcher() {
        return this.interfacesMatcher;
    }

    @InterfaceC6489
    public final MethodsMatcher getMethodsMatcher() {
        return this.methodsMatcher;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC4372(level = EnumC0393.f8971, message = "Property can only be written.")
    public final /* synthetic */ int getModifiers() {
        throw new C6398(null, 1, 0 == true ? 1 : 0);
    }

    @InterfaceC6489
    public final AccessFlagsMatcher getModifiersMatcher() {
        return this.modifiersMatcher;
    }

    @InterfaceC6489
    public final List<ClassMatcher> getNoneOfMatchers() {
        return this.noneOfMatchers;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC4372(level = EnumC0393.f8971, message = "Property can only be written.")
    public final /* synthetic */ String getSource() {
        throw new C6398(null, 1, 0 == true ? 1 : 0);
    }

    @InterfaceC6489
    public final StringMatcher getSourceMatcher() {
        return this.sourceMatcher;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC4372(level = EnumC0393.f8971, message = "Property can only be written.")
    public final /* synthetic */ String getSuperClass() {
        throw new C6398(null, 1, 0 == true ? 1 : 0);
    }

    @InterfaceC6489
    public final ClassMatcher getSuperClassMatcher() {
        return this.superClassMatcher;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC4372(level = EnumC0393.f8971, message = "Property can only be written.")
    public final /* synthetic */ Collection getUsingStrings() {
        throw new C6398(null, 1, 0 == true ? 1 : 0);
    }

    @InterfaceC6489
    public final List<StringMatcher> getUsingStringsMatcher() {
        return this.usingStringsMatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0141  */
    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int innerBuild(@InterfaceC6399 FlatBufferBuilder fbb) {
        int iCreateVectorOfTables;
        int iCreateVectorOfTables2;
        int i;
        List<ClassMatcher> list;
        int iCreateVectorOfTables3;
        C5499.m17103(fbb, "fbb");
        ClassMatcher.Companion companion = org.luckypray.dexkit.schema.ClassMatcher.INSTANCE;
        StringMatcher stringMatcher = this.sourceMatcher;
        int iBuild$dexkit_android_release = stringMatcher != null ? stringMatcher.build$dexkit_android_release(fbb) : 0;
        StringMatcher stringMatcher2 = this.classNameMatcher;
        int iBuild$dexkit_android_release2 = stringMatcher2 != null ? stringMatcher2.build$dexkit_android_release(fbb) : 0;
        AccessFlagsMatcher accessFlagsMatcher = this.modifiersMatcher;
        int iBuild$dexkit_android_release3 = accessFlagsMatcher != null ? accessFlagsMatcher.build$dexkit_android_release(fbb) : 0;
        ClassMatcher classMatcher = this.superClassMatcher;
        int iBuild$dexkit_android_release4 = classMatcher != null ? classMatcher.build$dexkit_android_release(fbb) : 0;
        InterfacesMatcher interfacesMatcher = this.interfacesMatcher;
        int iBuild$dexkit_android_release5 = interfacesMatcher != null ? interfacesMatcher.build$dexkit_android_release(fbb) : 0;
        AnnotationsMatcher annotationsMatcher = this.annotationsMatcher;
        int iBuild$dexkit_android_release6 = annotationsMatcher != null ? annotationsMatcher.build$dexkit_android_release(fbb) : 0;
        FieldsMatcher fieldsMatcher = this.fieldsMatcher;
        int iBuild$dexkit_android_release7 = fieldsMatcher != null ? fieldsMatcher.build$dexkit_android_release(fbb) : 0;
        MethodsMatcher methodsMatcher = this.methodsMatcher;
        int iBuild$dexkit_android_release8 = methodsMatcher != null ? methodsMatcher.build$dexkit_android_release(fbb) : 0;
        List<StringMatcher> list2 = this.usingStringsMatcher;
        if (list2 != null) {
            ArrayList arrayList = new ArrayList(C3881.m10756(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((StringMatcher) it.next()).build$dexkit_android_release(fbb)));
            }
            int[] iArrM11061 = C3888.m11061(arrayList);
            iCreateVectorOfTables = iArrM11061 != null ? fbb.createVectorOfTables(iArrM11061) : 0;
        }
        List<ClassMatcher> list3 = this.allOfMatchers;
        if (list3 != null) {
            ArrayList arrayList2 = new ArrayList(C3881.m10756(list3, 10));
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(((ClassMatcher) it2.next()).build$dexkit_android_release(fbb)));
            }
            int[] iArrM110612 = C3888.m11061(arrayList2);
            iCreateVectorOfTables2 = iArrM110612 != null ? fbb.createVectorOfTables(iArrM110612) : 0;
        }
        List<ClassMatcher> list4 = this.anyOfMatchers;
        if (list4 != null) {
            i = iCreateVectorOfTables2;
            ArrayList arrayList3 = new ArrayList(C3881.m10756(list4, 10));
            Iterator<T> it3 = list4.iterator();
            while (it3.hasNext()) {
                arrayList3.add(Integer.valueOf(((ClassMatcher) it3.next()).build$dexkit_android_release(fbb)));
            }
            int[] iArrM110613 = C3888.m11061(arrayList3);
            int iCreateVectorOfTables4 = iArrM110613 != null ? fbb.createVectorOfTables(iArrM110613) : 0;
            list = this.noneOfMatchers;
            if (list == null) {
                ArrayList arrayList4 = new ArrayList(C3881.m10756(list, 10));
                Iterator<T> it4 = list.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(Integer.valueOf(((ClassMatcher) it4.next()).build$dexkit_android_release(fbb)));
                }
                int[] iArrM110614 = C3888.m11061(arrayList4);
                iCreateVectorOfTables3 = iArrM110614 != null ? fbb.createVectorOfTables(iArrM110614) : 0;
            }
            int iCreateClassMatcher = companion.createClassMatcher(fbb, iBuild$dexkit_android_release, iBuild$dexkit_android_release2, iBuild$dexkit_android_release3, iBuild$dexkit_android_release4, iBuild$dexkit_android_release5, iBuild$dexkit_android_release6, iBuild$dexkit_android_release7, iBuild$dexkit_android_release8, iCreateVectorOfTables, i, iCreateVectorOfTables4, iCreateVectorOfTables3);
            fbb.finish(iCreateClassMatcher);
            return iCreateClassMatcher;
        }
        i = iCreateVectorOfTables2;
        list = this.noneOfMatchers;
        if (list == null) {
        }
        int iCreateClassMatcher2 = companion.createClassMatcher(fbb, iBuild$dexkit_android_release, iBuild$dexkit_android_release2, iBuild$dexkit_android_release3, iBuild$dexkit_android_release4, iBuild$dexkit_android_release5, iBuild$dexkit_android_release6, iBuild$dexkit_android_release7, iBuild$dexkit_android_release8, iCreateVectorOfTables, i, iCreateVectorOfTables4, iCreateVectorOfTables3);
        fbb.finish(iCreateClassMatcher2);
        return iCreateClassMatcher2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final ClassMatcher interfaceCount(int count) {
        InterfacesMatcher interfacesMatcher = this.interfacesMatcher;
        if (interfacesMatcher == null) {
            interfacesMatcher = new InterfacesMatcher();
        }
        this.interfacesMatcher = interfacesMatcher;
        C5499.m17100(interfacesMatcher);
        interfacesMatcher.setCount(count);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final ClassMatcher interfaces(@InterfaceC6399 InterfacesMatcher interfaces) {
        C5499.m17103(interfaces, "interfaces");
        this.interfacesMatcher = interfaces;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final ClassMatcher methodCount(int count) {
        MethodsMatcher methodsMatcher = this.methodsMatcher;
        if (methodsMatcher == null) {
            methodsMatcher = new MethodsMatcher();
        }
        this.methodsMatcher = methodsMatcher;
        C5499.m17100(methodsMatcher);
        methodsMatcher.setCount(count);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final ClassMatcher methods(@InterfaceC6399 MethodsMatcher methods) {
        C5499.m17103(methods, "methods");
        this.methodsMatcher = methods;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5573
    public final ClassMatcher modifiers(int i) {
        return modifiers$default(this, i, null, 2, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final ClassMatcher noneOf(@InterfaceC6399 Collection<ClassMatcher> matchers) {
        C5499.m17103(matchers, "matchers");
        if (!(!matchers.isEmpty())) {
            matchers = null;
        }
        this.noneOfMatchers = matchers != null ? C3888.m11065(matchers) : null;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final ClassMatcher not(@InterfaceC6399 ClassMatcher matcher) {
        C5499.m17103(matcher, "matcher");
        addNoneOf(matcher);
        return this;
    }

    public final /* synthetic */ void setClassName(String str) {
        C5499.m17103(str, "value");
        className$default(this, str, null, false, 6, null);
    }

    public final /* synthetic */ void setDescriptor(String str) {
        C5499.m17103(str, "value");
        descriptor(str);
    }

    public final /* synthetic */ void setModifiers(int i) {
        modifiers$default(this, i, null, 2, null);
    }

    public final /* synthetic */ void setSource(String str) {
        C5499.m17103(str, "value");
        source$default(this, str, null, false, 6, null);
    }

    public final void setSuperClass(@InterfaceC6399 String str) {
        C5499.m17103(str, "value");
        superClass$default(this, str, null, false, 6, null);
    }

    public final void setUsingStrings(@InterfaceC6399 Collection<String> collection) {
        C5499.m17103(collection, "value");
        usingStrings$default(this, collection, null, false, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5573
    public final ClassMatcher source(@InterfaceC6399 String str) {
        C5499.m17103(str, "source");
        return source$default(this, str, null, false, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5573
    public final ClassMatcher superClass(@InterfaceC6399 String str) {
        C5499.m17103(str, "className");
        return superClass$default(this, str, null, false, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final ClassMatcher usingEqStrings(@InterfaceC6399 Collection<String> usingStrings) {
        C5499.m17103(usingStrings, "usingStrings");
        ArrayList arrayList = new ArrayList(C3881.m10756(usingStrings, 10));
        Iterator<T> it = usingStrings.iterator();
        while (it.hasNext()) {
            arrayList.add(new StringMatcher((String) it.next(), StringMatchType.Equals, false));
        }
        this.usingStringsMatcher = C3888.m11065(arrayList);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5573
    public final ClassMatcher usingStrings(@InterfaceC6399 Collection<String> collection) {
        C5499.m17103(collection, "usingStrings");
        return usingStrings$default(this, collection, null, false, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public ClassMatcher(@InterfaceC6399 Class<?> cls) {
        C5499.m17103(cls, "clazz");
        className$default(this, DexSignUtil.getClassDescriptor(cls), null, false, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5578
    public static final ClassMatcher create(@InterfaceC6399 Class<?> cls) {
        return INSTANCE.create(cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5573
    public final ClassMatcher addFieldForName(@InterfaceC6399 String str, @InterfaceC6399 StringMatchType stringMatchType) {
        C5499.m17103(str, "fieldName");
        C5499.m17103(stringMatchType, "matchType");
        return addFieldForName$default(this, str, stringMatchType, false, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5573
    public final ClassMatcher addFieldForType(@InterfaceC6399 String str, @InterfaceC6399 StringMatchType stringMatchType) {
        C5499.m17103(str, "typeName");
        C5499.m17103(stringMatchType, "matchType");
        return addFieldForType$default(this, str, stringMatchType, false, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5573
    public final ClassMatcher addInterface(@InterfaceC6399 String str, @InterfaceC6399 StringMatchType stringMatchType) {
        C5499.m17103(str, "className");
        C5499.m17103(stringMatchType, "matchType");
        return addInterface$default(this, str, stringMatchType, false, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5573
    public final ClassMatcher addUsingString(@InterfaceC6399 String str, @InterfaceC6399 StringMatchType stringMatchType) {
        C5499.m17103(str, "usingString");
        C5499.m17103(stringMatchType, "matchType");
        return addUsingString$default(this, str, stringMatchType, false, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    public final ClassMatcher allOf(@InterfaceC6399 ClassMatcher... matchers) {
        C5499.m17103(matchers, "matchers");
        allOf(C3404.m7069(matchers));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final /* synthetic */ ClassMatcher annotations(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        AnnotationsMatcher annotationsMatcher = new AnnotationsMatcher();
        init.invoke(annotationsMatcher);
        annotations(annotationsMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    public final ClassMatcher anyOf(@InterfaceC6399 ClassMatcher... matchers) {
        C5499.m17103(matchers, "matchers");
        anyOf(C3404.m7069(matchers));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5573
    public final ClassMatcher className(@InterfaceC6399 String str, @InterfaceC6399 StringMatchType stringMatchType) {
        C5499.m17103(str, "className");
        C5499.m17103(stringMatchType, "matchType");
        return className$default(this, str, stringMatchType, false, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final /* synthetic */ ClassMatcher fields(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        FieldsMatcher fieldsMatcher = new FieldsMatcher();
        init.invoke(fieldsMatcher);
        fields(fieldsMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final /* synthetic */ ClassMatcher interfaces(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        InterfacesMatcher interfacesMatcher = new InterfacesMatcher();
        init.invoke(interfacesMatcher);
        interfaces(interfacesMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final /* synthetic */ ClassMatcher methods(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        MethodsMatcher methodsMatcher = new MethodsMatcher();
        init.invoke(methodsMatcher);
        methods(methodsMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    public final ClassMatcher modifiers(@InterfaceC6399 AccessFlagsMatcher matcher) {
        C5499.m17103(matcher, "matcher");
        this.modifiersMatcher = matcher;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    public final ClassMatcher noneOf(@InterfaceC6399 ClassMatcher... matchers) {
        C5499.m17103(matchers, "matchers");
        noneOf(C3404.m7069(matchers));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final /* synthetic */ ClassMatcher not(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        ClassMatcher classMatcher = new ClassMatcher();
        init.invoke(classMatcher);
        not(classMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5573
    public final ClassMatcher source(@InterfaceC6399 String str, @InterfaceC6399 StringMatchType stringMatchType) {
        C5499.m17103(str, "source");
        C5499.m17103(stringMatchType, "matchType");
        return source$default(this, str, stringMatchType, false, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5573
    public final ClassMatcher superClass(@InterfaceC6399 String str, @InterfaceC6399 StringMatchType stringMatchType) {
        C5499.m17103(str, "className");
        C5499.m17103(stringMatchType, "matchType");
        return superClass$default(this, str, stringMatchType, false, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5573
    public final ClassMatcher usingStrings(@InterfaceC6399 Collection<String> collection, @InterfaceC6399 StringMatchType stringMatchType) {
        C5499.m17103(collection, "usingStrings");
        C5499.m17103(stringMatchType, "matchType");
        return usingStrings$default(this, collection, stringMatchType, false, 4, null);
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final ClassMatcher create(@InterfaceC6399 String str) {
        return INSTANCE.create(str);
    }

    public final /* synthetic */ ClassMatcher addAllOf(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        ClassMatcher classMatcher = new ClassMatcher();
        init.invoke(classMatcher);
        addAllOf(classMatcher);
        return this;
    }

    public final /* synthetic */ ClassMatcher addAnnotation(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        AnnotationMatcher annotationMatcher = new AnnotationMatcher();
        init.invoke(annotationMatcher);
        addAnnotation(annotationMatcher);
        return this;
    }

    public final /* synthetic */ ClassMatcher addAnyOf(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        ClassMatcher classMatcher = new ClassMatcher();
        init.invoke(classMatcher);
        addAnyOf(classMatcher);
        return this;
    }

    public final /* synthetic */ ClassMatcher addField(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        FieldMatcher fieldMatcher = new FieldMatcher();
        init.invoke(fieldMatcher);
        addField(fieldMatcher);
        return this;
    }

    @InterfaceC6399
    @InterfaceC5573
    public final ClassMatcher addFieldForName(@InterfaceC6399 String fieldName, @InterfaceC6399 StringMatchType matchType, boolean ignoreCase) {
        C5499.m17103(fieldName, "fieldName");
        C5499.m17103(matchType, "matchType");
        FieldsMatcher fieldsMatcher = this.fieldsMatcher;
        if (fieldsMatcher == null) {
            fieldsMatcher = new FieldsMatcher();
        }
        this.fieldsMatcher = fieldsMatcher;
        C5499.m17100(fieldsMatcher);
        fieldsMatcher.add(new FieldMatcher().name(fieldName, matchType, ignoreCase));
        return this;
    }

    @InterfaceC6399
    @InterfaceC5573
    public final ClassMatcher addFieldForType(@InterfaceC6399 String typeName, @InterfaceC6399 StringMatchType matchType, boolean ignoreCase) {
        C5499.m17103(typeName, "typeName");
        C5499.m17103(matchType, "matchType");
        FieldsMatcher fieldsMatcher = this.fieldsMatcher;
        if (fieldsMatcher == null) {
            fieldsMatcher = new FieldsMatcher();
        }
        this.fieldsMatcher = fieldsMatcher;
        C5499.m17100(fieldsMatcher);
        fieldsMatcher.add(new FieldMatcher().type(typeName, matchType, ignoreCase));
        return this;
    }

    @InterfaceC6399
    public final ClassMatcher addInterface(@InterfaceC6399 ClassMatcher interfaceMatcher) {
        C5499.m17103(interfaceMatcher, "interfaceMatcher");
        InterfacesMatcher interfacesMatcher = this.interfacesMatcher;
        if (interfacesMatcher == null) {
            interfacesMatcher = new InterfacesMatcher();
        }
        this.interfacesMatcher = interfacesMatcher;
        C5499.m17100(interfacesMatcher);
        interfacesMatcher.add(interfaceMatcher);
        return this;
    }

    public final /* synthetic */ ClassMatcher addMethod(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        MethodMatcher methodMatcher = new MethodMatcher();
        init.invoke(methodMatcher);
        addMethod(methodMatcher);
        return this;
    }

    public final /* synthetic */ ClassMatcher addNoneOf(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        ClassMatcher classMatcher = new ClassMatcher();
        init.invoke(classMatcher);
        addNoneOf(classMatcher);
        return this;
    }

    @InterfaceC6399
    public final ClassMatcher addUsingString(@InterfaceC6399 StringMatcher usingString) {
        C5499.m17103(usingString, "usingString");
        List<StringMatcher> arrayList = this.usingStringsMatcher;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.usingStringsMatcher = arrayList;
        C5499.m17100(arrayList);
        arrayList.add(usingString);
        return this;
    }

    public final /* synthetic */ ClassMatcher allOf(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        ClassMatcherList classMatcherList = new ClassMatcherList();
        init.invoke(classMatcherList);
        allOf(classMatcherList);
        return this;
    }

    @InterfaceC6399
    public final ClassMatcher annotationCount(@InterfaceC6399 IntRange range) {
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

    public final /* synthetic */ ClassMatcher anyOf(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        ClassMatcherList classMatcherList = new ClassMatcherList();
        init.invoke(classMatcherList);
        anyOf(classMatcherList);
        return this;
    }

    @InterfaceC6399
    public final ClassMatcher className(@InterfaceC6399 StringMatcher matcher) {
        C5499.m17103(matcher, "matcher");
        this.classNameMatcher = matcher;
        return this;
    }

    @InterfaceC6399
    public final ClassMatcher fieldCount(@InterfaceC6399 IntRange range) {
        C5499.m17103(range, "range");
        FieldsMatcher fieldsMatcher = this.fieldsMatcher;
        if (fieldsMatcher == null) {
            fieldsMatcher = new FieldsMatcher();
        }
        this.fieldsMatcher = fieldsMatcher;
        C5499.m17100(fieldsMatcher);
        fieldsMatcher.count(range);
        return this;
    }

    @InterfaceC6399
    public final ClassMatcher interfaceCount(@InterfaceC6399 IntRange range) {
        C5499.m17103(range, "range");
        InterfacesMatcher interfacesMatcher = this.interfacesMatcher;
        if (interfacesMatcher == null) {
            interfacesMatcher = new InterfacesMatcher();
        }
        this.interfacesMatcher = interfacesMatcher;
        C5499.m17100(interfacesMatcher);
        interfacesMatcher.count(range);
        return this;
    }

    @InterfaceC6399
    public final ClassMatcher methodCount(@InterfaceC6399 IntRange range) {
        C5499.m17103(range, "range");
        MethodsMatcher methodsMatcher = this.methodsMatcher;
        if (methodsMatcher == null) {
            methodsMatcher = new MethodsMatcher();
        }
        this.methodsMatcher = methodsMatcher;
        C5499.m17100(methodsMatcher);
        methodsMatcher.count(range);
        return this;
    }

    @InterfaceC6399
    @InterfaceC5573
    public final ClassMatcher modifiers(int modifiers, @InterfaceC6399 MatchType matchType) {
        C5499.m17103(matchType, "matchType");
        this.modifiersMatcher = new AccessFlagsMatcher(modifiers, matchType);
        return this;
    }

    public final /* synthetic */ ClassMatcher noneOf(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        ClassMatcherList classMatcherList = new ClassMatcherList();
        init.invoke(classMatcherList);
        noneOf(classMatcherList);
        return this;
    }

    @InterfaceC6399
    public final ClassMatcher source(@InterfaceC6399 StringMatcher matcher) {
        C5499.m17103(matcher, "matcher");
        this.sourceMatcher = matcher;
        return this;
    }

    @InterfaceC6399
    public final ClassMatcher superClass(@InterfaceC6399 ClassMatcher superClass) {
        C5499.m17103(superClass, "superClass");
        this.superClassMatcher = superClass;
        return this;
    }

    @InterfaceC6399
    public final ClassMatcher usingStrings(@InterfaceC6399 StringMatcherList usingStrings) {
        C5499.m17103(usingStrings, "usingStrings");
        this.usingStringsMatcher = usingStrings;
        return this;
    }

    public ClassMatcher(@InterfaceC6399 String str) {
        C5499.m17103(str, "descriptor");
        descriptor(str);
    }

    @InterfaceC6399
    @InterfaceC5573
    public final ClassMatcher className(@InterfaceC6399 String className, @InterfaceC6399 StringMatchType matchType, boolean ignoreCase) {
        C5499.m17103(className, "className");
        C5499.m17103(matchType, "matchType");
        this.classNameMatcher = new StringMatcher(className, matchType, ignoreCase);
        return this;
    }

    @InterfaceC6399
    @InterfaceC5573
    public final ClassMatcher source(@InterfaceC6399 String source, @InterfaceC6399 StringMatchType matchType, boolean ignoreCase) {
        C5499.m17103(source, "source");
        C5499.m17103(matchType, "matchType");
        this.sourceMatcher = new StringMatcher(source, matchType, ignoreCase);
        return this;
    }

    @InterfaceC6399
    @InterfaceC5573
    public final ClassMatcher superClass(@InterfaceC6399 String className, @InterfaceC6399 StringMatchType matchType, boolean ignoreCase) {
        C5499.m17103(className, "className");
        C5499.m17103(matchType, "matchType");
        this.superClassMatcher = new ClassMatcher().className(new StringMatcher(className, matchType, ignoreCase));
        return this;
    }

    public final /* synthetic */ ClassMatcher usingStrings(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        StringMatcherList stringMatcherList = new StringMatcherList();
        init.invoke(stringMatcherList);
        usingStrings(stringMatcherList);
        return this;
    }

    @InterfaceC6399
    public final ClassMatcher addFieldForType(@InterfaceC6399 Class<?> clazz) {
        C5499.m17103(clazz, "clazz");
        FieldsMatcher fieldsMatcher = this.fieldsMatcher;
        if (fieldsMatcher == null) {
            fieldsMatcher = new FieldsMatcher();
        }
        this.fieldsMatcher = fieldsMatcher;
        C5499.m17100(fieldsMatcher);
        fieldsMatcher.add(new FieldMatcher().type(clazz));
        return this;
    }

    @InterfaceC6399
    @InterfaceC5573
    public final ClassMatcher addInterface(@InterfaceC6399 String className, @InterfaceC6399 StringMatchType matchType, boolean ignoreCase) {
        C5499.m17103(className, "className");
        C5499.m17103(matchType, "matchType");
        InterfacesMatcher interfacesMatcher = this.interfacesMatcher;
        if (interfacesMatcher == null) {
            interfacesMatcher = new InterfacesMatcher();
        }
        this.interfacesMatcher = interfacesMatcher;
        C5499.m17100(interfacesMatcher);
        interfacesMatcher.add(new ClassMatcher().className(className, matchType, ignoreCase));
        return this;
    }

    @InterfaceC6399
    @InterfaceC5573
    public final ClassMatcher addUsingString(@InterfaceC6399 String usingString, @InterfaceC6399 StringMatchType matchType, boolean ignoreCase) {
        C5499.m17103(usingString, "usingString");
        C5499.m17103(matchType, "matchType");
        addUsingString(new StringMatcher(usingString, matchType, ignoreCase));
        return this;
    }

    @InterfaceC6399
    public final ClassMatcher annotationCount(@InterfaceC6399 C5458 range) {
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
    public final ClassMatcher fieldCount(@InterfaceC6399 C5458 range) {
        C5499.m17103(range, "range");
        FieldsMatcher fieldsMatcher = this.fieldsMatcher;
        if (fieldsMatcher == null) {
            fieldsMatcher = new FieldsMatcher();
        }
        this.fieldsMatcher = fieldsMatcher;
        C5499.m17100(fieldsMatcher);
        fieldsMatcher.count(range);
        return this;
    }

    @InterfaceC6399
    public final ClassMatcher interfaceCount(@InterfaceC6399 C5458 range) {
        C5499.m17103(range, "range");
        InterfacesMatcher interfacesMatcher = this.interfacesMatcher;
        if (interfacesMatcher == null) {
            interfacesMatcher = new InterfacesMatcher();
        }
        this.interfacesMatcher = interfacesMatcher;
        C5499.m17100(interfacesMatcher);
        interfacesMatcher.count(range);
        return this;
    }

    @InterfaceC6399
    public final ClassMatcher methodCount(@InterfaceC6399 C5458 range) {
        C5499.m17103(range, "range");
        MethodsMatcher methodsMatcher = this.methodsMatcher;
        if (methodsMatcher == null) {
            methodsMatcher = new MethodsMatcher();
        }
        this.methodsMatcher = methodsMatcher;
        C5499.m17100(methodsMatcher);
        methodsMatcher.count(range);
        return this;
    }

    public final /* synthetic */ ClassMatcher superClass(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        ClassMatcher classMatcher = new ClassMatcher();
        init.invoke(classMatcher);
        superClass(classMatcher);
        return this;
    }

    @InterfaceC6399
    @InterfaceC5573
    public final ClassMatcher usingStrings(@InterfaceC6399 Collection<String> usingStrings, @InterfaceC6399 StringMatchType matchType, boolean ignoreCase) {
        C5499.m17103(usingStrings, "usingStrings");
        C5499.m17103(matchType, "matchType");
        ArrayList arrayList = new ArrayList(C3881.m10756(usingStrings, 10));
        Iterator<T> it = usingStrings.iterator();
        while (it.hasNext()) {
            arrayList.add(new StringMatcher((String) it.next(), matchType, ignoreCase));
        }
        this.usingStringsMatcher = C3888.m11065(arrayList);
        return this;
    }

    public final /* synthetic */ ClassMatcher addInterface(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        ClassMatcher classMatcher = new ClassMatcher();
        init.invoke(classMatcher);
        addInterface(classMatcher);
        return this;
    }

    @InterfaceC6399
    public final ClassMatcher annotationCount(int min, int max) {
        AnnotationsMatcher annotationsMatcher = this.annotationsMatcher;
        if (annotationsMatcher == null) {
            annotationsMatcher = new AnnotationsMatcher();
        }
        this.annotationsMatcher = annotationsMatcher;
        C5499.m17100(annotationsMatcher);
        annotationsMatcher.count(min, max);
        return this;
    }

    @InterfaceC6399
    public final ClassMatcher fieldCount(int min, int max) {
        FieldsMatcher fieldsMatcher = this.fieldsMatcher;
        if (fieldsMatcher == null) {
            fieldsMatcher = new FieldsMatcher();
        }
        this.fieldsMatcher = fieldsMatcher;
        C5499.m17100(fieldsMatcher);
        fieldsMatcher.count(min, max);
        return this;
    }

    @InterfaceC6399
    public final ClassMatcher interfaceCount(int min, int max) {
        InterfacesMatcher interfacesMatcher = this.interfacesMatcher;
        if (interfacesMatcher == null) {
            interfacesMatcher = new InterfacesMatcher();
        }
        this.interfacesMatcher = interfacesMatcher;
        C5499.m17100(interfacesMatcher);
        interfacesMatcher.count(min, max);
        return this;
    }

    @InterfaceC6399
    public final ClassMatcher methodCount(int min, int max) {
        MethodsMatcher methodsMatcher = this.methodsMatcher;
        if (methodsMatcher == null) {
            methodsMatcher = new MethodsMatcher();
        }
        this.methodsMatcher = methodsMatcher;
        C5499.m17100(methodsMatcher);
        methodsMatcher.count(min, max);
        return this;
    }

    @InterfaceC6399
    public final ClassMatcher usingEqStrings(@InterfaceC6399 String... usingStrings) {
        C5499.m17103(usingStrings, "usingStrings");
        ArrayList arrayList = new ArrayList(usingStrings.length);
        for (String str : usingStrings) {
            arrayList.add(new StringMatcher(str, StringMatchType.Equals, false));
        }
        this.usingStringsMatcher = C3888.m11065(arrayList);
        return this;
    }

    @InterfaceC6399
    public final ClassMatcher usingStrings(@InterfaceC6399 String... usingStrings) {
        C5499.m17103(usingStrings, "usingStrings");
        ArrayList arrayList = new ArrayList(usingStrings.length);
        for (String str : usingStrings) {
            arrayList.add(new StringMatcher(str, null, false, 6, null));
        }
        this.usingStringsMatcher = C3888.m11065(arrayList);
        return this;
    }
}
