package org.luckypray.dexkit.query.matchers;

import Yue.C3404;
import Yue.C3880;
import Yue.C3881;
import Yue.C3888;
import Yue.C4335;
import Yue.C5458;
import Yue.C5499;
import Yue.C6398;
import Yue.C8048;
import Yue.C8053;
import Yue.C8107;
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
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.query.MethodMatcherList;
import org.luckypray.dexkit.query.NumberEncodeValueMatcherList;
import org.luckypray.dexkit.query.StringMatcherList;
import org.luckypray.dexkit.query.UsingFieldMatcherList;
import org.luckypray.dexkit.query.base.BaseMatcher;
import org.luckypray.dexkit.query.base.IAnnotationEncodeValue;
import org.luckypray.dexkit.query.enums.MatchType;
import org.luckypray.dexkit.query.enums.NumberEncodeValueType;
import org.luckypray.dexkit.query.enums.OpCodeMatchType;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.enums.UsingType;
import org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher;
import org.luckypray.dexkit.query.matchers.base.IntRange;
import org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher;
import org.luckypray.dexkit.query.matchers.base.OpCodesMatcher;
import org.luckypray.dexkit.query.matchers.base.StringMatcher;
import org.luckypray.dexkit.schema.MethodMatcher;
import org.luckypray.dexkit.util.DexSignUtil;
import org.luckypray.dexkit.wrap.DexMethod;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nMethodMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MethodMatcher.kt\norg/luckypray/dexkit/query/matchers/MethodMatcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1501:1\n1849#2:1502\n1850#2:1504\n1547#2:1509\n1618#2,3:1510\n1547#2:1517\n1618#2,3:1518\n1547#2:1525\n1618#2,3:1526\n1547#2:1533\n1618#2,3:1534\n1547#2:1537\n1618#2,3:1538\n1547#2:1541\n1618#2,3:1542\n1547#2:1545\n1618#2,3:1546\n1547#2:1549\n1618#2,3:1550\n1547#2:1553\n1618#2,3:1554\n1547#2:1557\n1618#2,3:1558\n1#3:1503\n13536#4,2:1505\n13536#4,2:1507\n11328#4:1513\n11663#4,3:1514\n11328#4:1521\n11663#4,3:1522\n11328#4:1529\n11663#4,3:1530\n*S KotlinDebug\n*F\n+ 1 MethodMatcher.kt\norg/luckypray/dexkit/query/matchers/MethodMatcher\n*L\n533#1:1502\n533#1:1504\n878#1:1509\n878#1:1510,3\n906#1:1517\n906#1:1518,3\n1067#1:1525\n1067#1:1526,3\n1479#1:1533\n1479#1:1534,3\n1481#1:1537\n1481#1:1538,3\n1483#1:1541\n1483#1:1542,3\n1485#1:1545\n1485#1:1546,3\n1490#1:1549\n1490#1:1550,3\n1492#1:1553\n1492#1:1554,3\n1494#1:1557\n1494#1:1558,3\n566#1:1505,2\n586#1:1507,2\n894#1:1513\n894#1:1514,3\n918#1:1521\n918#1:1522,3\n1082#1:1529\n1082#1:1530,3\n*E\n"})
@Metadata(d1 = {"\u0000\u008c\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b-\u0018\u0000 Û\u00012\u00020\u00012\u00020\u0002:\u0002Û\u0001B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007B\u0015\b\u0016\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\u0003\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0003\u0010\rJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0010\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u001a2\b\b\u0002\u0010\u0013\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u0018\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\u001e\u001a\u00020\u00002\n\u0010!\u001a\u0006\u0012\u0002\b\u00030 ¢\u0006\u0004\b\u001e\u0010\"J+\u0010\u001e\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u001e\u0010\u0016J\u0015\u0010%\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u000b¢\u0006\u0004\b%\u0010\u000eJ\u0015\u0010'\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u001d¢\u0006\u0004\b'\u0010\u001fJ\u0019\u0010'\u001a\u00020\u00002\n\u0010!\u001a\u0006\u0012\u0002\b\u00030 ¢\u0006\u0004\b'\u0010\"J+\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b'\u0010\u0016J\u0015\u0010*\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b*\u0010+J\u001d\u0010-\u001a\u00020\u00002\u000e\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0,¢\u0006\u0004\b-\u0010.J\r\u0010-\u001a\u00020\u0000¢\u0006\u0004\b-\u0010/J%\u0010-\u001a\u00020\u00002\u0016\u0010-\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b00\"\u0004\u0018\u00010\u000b¢\u0006\u0004\b-\u00101J-\u0010-\u001a\u00020\u00002\u001e\u0010-\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0002\b\u0003\u0018\u00010 00\"\b\u0012\u0002\b\u0003\u0018\u00010 ¢\u0006\u0004\b-\u00102J-\u00104\u001a\u00020\u00002\b\u00103\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b4\u0010\u0016J\u001b\u00104\u001a\u00020\u00002\f\u00103\u001a\b\u0012\u0002\b\u0003\u0018\u00010 ¢\u0006\u0004\b4\u0010\"J\u0017\u00104\u001a\u00020\u00002\b\u0010&\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b4\u0010\u001fJ\u0015\u00106\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u001a¢\u0006\u0004\b6\u00107J\u0015\u00106\u001a\u00020\u00002\u0006\u00109\u001a\u000208¢\u0006\u0004\b6\u0010:J\u0015\u00106\u001a\u00020\u00002\u0006\u00109\u001a\u00020;¢\u0006\u0004\b6\u0010<J!\u00106\u001a\u00020\u00002\b\b\u0002\u0010=\u001a\u00020\u001a2\b\b\u0002\u0010>\u001a\u00020\u001a¢\u0006\u0004\b6\u0010?J\u0015\u0010A\u001a\u00020\u00002\u0006\u0010A\u001a\u00020@¢\u0006\u0004\bA\u0010BJ\u0015\u0010E\u001a\u00020\u00002\u0006\u0010D\u001a\u00020C¢\u0006\u0004\bE\u0010FJ\u0015\u0010G\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u001a¢\u0006\u0004\bG\u00107J\u0015\u0010G\u001a\u00020\u00002\u0006\u00109\u001a\u000208¢\u0006\u0004\bG\u0010:J\u0015\u0010G\u001a\u00020\u00002\u0006\u00109\u001a\u00020;¢\u0006\u0004\bG\u0010<J!\u0010G\u001a\u00020\u00002\b\b\u0002\u0010=\u001a\u00020\u001a2\b\b\u0002\u0010>\u001a\u00020\u001a¢\u0006\u0004\bG\u0010?J\u0015\u0010I\u001a\u00020\u00002\u0006\u0010I\u001a\u00020H¢\u0006\u0004\bI\u0010JJ3\u0010I\u001a\u00020\u00002\f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u001a0,2\b\b\u0002\u0010\u0013\u001a\u00020K2\n\b\u0002\u0010L\u001a\u0004\u0018\u000108H\u0007¢\u0006\u0004\bI\u0010MJ3\u0010N\u001a\u00020\u00002\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u000b0,2\b\b\u0002\u0010\u0013\u001a\u00020K2\n\b\u0002\u0010L\u001a\u0004\u0018\u000108H\u0007¢\u0006\u0004\bN\u0010MJ\u0015\u0010P\u001a\u00020\u00002\u0006\u0010P\u001a\u00020O¢\u0006\u0004\bP\u0010QJ1\u0010P\u001a\u00020\u00002\f\u0010P\u001a\b\u0012\u0004\u0012\u00020\u000b0,2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\bP\u0010RJ!\u0010P\u001a\u00020\u00002\u0012\u0010P\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b00\"\u00020\u000b¢\u0006\u0004\bP\u00101J\u001b\u0010S\u001a\u00020\u00002\f\u0010P\u001a\b\u0012\u0004\u0012\u00020\u000b0,¢\u0006\u0004\bS\u0010.J!\u0010S\u001a\u00020\u00002\u0012\u0010P\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b00\"\u00020\u000b¢\u0006\u0004\bS\u00101J\u0015\u0010U\u001a\u00020\u00002\u0006\u0010T\u001a\u00020\u000f¢\u0006\u0004\bU\u0010\u0011J+\u0010U\u001a\u00020\u00002\u0006\u0010T\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\bU\u0010\u0016J\u0015\u0010V\u001a\u00020\u00002\u0006\u0010T\u001a\u00020\u000b¢\u0006\u0004\bV\u0010\u000eJ\u001b\u0010X\u001a\u00020\u00002\f\u0010X\u001a\b\u0012\u0004\u0012\u00020W0,¢\u0006\u0004\bX\u0010.J\u0015\u0010Z\u001a\u00020\u00002\u0006\u0010Y\u001a\u00020W¢\u0006\u0004\bZ\u0010[J!\u0010Z\u001a\u00020\u00002\u0006\u0010Y\u001a\u00020\\2\b\b\u0002\u0010^\u001a\u00020]H\u0007¢\u0006\u0004\bZ\u0010_J!\u0010Z\u001a\u00020\u00002\u0006\u0010`\u001a\u00020\u000b2\b\b\u0002\u0010^\u001a\u00020]H\u0007¢\u0006\u0004\bZ\u0010aJ\u0015\u0010c\u001a\u00020\u00002\u0006\u0010c\u001a\u00020b¢\u0006\u0004\bc\u0010dJ\u001b\u0010c\u001a\u00020\u00002\f\u0010c\u001a\b\u0012\u0004\u0012\u00020e0,¢\u0006\u0004\bc\u0010.J!\u0010c\u001a\u00020\u00002\u0012\u0010c\u001a\n\u0012\u0006\b\u0001\u0012\u00020e00\"\u00020e¢\u0006\u0004\bc\u0010fJ\u0015\u0010h\u001a\u00020\u00002\u0006\u0010g\u001a\u00020e¢\u0006\u0004\bh\u0010iJ\u0015\u0010k\u001a\u00020\u00002\u0006\u0010k\u001a\u00020j¢\u0006\u0004\bk\u0010lJ\u0015\u0010n\u001a\u00020\u00002\u0006\u0010m\u001a\u00020\u0000¢\u0006\u0004\bn\u0010oJ\u0015\u0010n\u001a\u00020\u00002\u0006\u0010p\u001a\u00020\u000b¢\u0006\u0004\bn\u0010\u000eJ\u0015\u0010q\u001a\u00020\u00002\u0006\u0010q\u001a\u00020j¢\u0006\u0004\bq\u0010lJ\u0015\u0010s\u001a\u00020\u00002\u0006\u0010r\u001a\u00020\u0000¢\u0006\u0004\bs\u0010oJ\u0015\u0010s\u001a\u00020\u00002\u0006\u0010p\u001a\u00020\u000b¢\u0006\u0004\bs\u0010\u000eJ\u001b\u0010u\u001a\u00020\u00002\f\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00000,¢\u0006\u0004\bu\u0010.J!\u0010u\u001a\u00020\u00002\u0012\u0010t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000000\"\u00020\u0000¢\u0006\u0004\bu\u0010vJ\u0015\u0010x\u001a\u00020\u00002\u0006\u0010w\u001a\u00020\u0000¢\u0006\u0004\bx\u0010oJ\u001b\u0010y\u001a\u00020\u00002\f\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00000,¢\u0006\u0004\by\u0010.J!\u0010y\u001a\u00020\u00002\u0012\u0010t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000000\"\u00020\u0000¢\u0006\u0004\by\u0010vJ\u0015\u0010z\u001a\u00020\u00002\u0006\u0010w\u001a\u00020\u0000¢\u0006\u0004\bz\u0010oJ\u001b\u0010{\u001a\u00020\u00002\f\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00000,¢\u0006\u0004\b{\u0010.J!\u0010{\u001a\u00020\u00002\u0012\u0010t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000000\"\u00020\u0000¢\u0006\u0004\b{\u0010vJ\u0015\u0010|\u001a\u00020\u00002\u0006\u0010w\u001a\u00020\u0000¢\u0006\u0004\b|\u0010oJ\u0015\u0010}\u001a\u00020\u00002\u0006\u0010w\u001a\u00020\u0000¢\u0006\u0004\b}\u0010oJ)\u0010\u001e\u001a\u00020\u00002\u0019\u0010\u0081\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u007f0~¢\u0006\u0003\b\u0080\u0001¢\u0006\u0005\b\u001e\u0010\u0082\u0001J)\u0010'\u001a\u00020\u00002\u0019\u0010\u0081\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u007f0~¢\u0006\u0003\b\u0080\u0001¢\u0006\u0005\b'\u0010\u0082\u0001J)\u0010*\u001a\u00020\u00002\u0019\u0010\u0081\u0001\u001a\u0014\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u007f0~¢\u0006\u0003\b\u0080\u0001¢\u0006\u0005\b*\u0010\u0082\u0001J)\u00104\u001a\u00020\u00002\u0019\u0010\u0081\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u007f0~¢\u0006\u0003\b\u0080\u0001¢\u0006\u0005\b4\u0010\u0082\u0001J)\u0010A\u001a\u00020\u00002\u0019\u0010\u0081\u0001\u001a\u0014\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u007f0~¢\u0006\u0003\b\u0080\u0001¢\u0006\u0005\bA\u0010\u0082\u0001J)\u0010E\u001a\u00020\u00002\u0019\u0010\u0081\u0001\u001a\u0014\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u007f0~¢\u0006\u0003\b\u0080\u0001¢\u0006\u0005\bE\u0010\u0082\u0001J)\u0010P\u001a\u00020\u00002\u0019\u0010\u0081\u0001\u001a\u0014\u0012\u0004\u0012\u00020O\u0012\u0004\u0012\u00020\u007f0~¢\u0006\u0003\b\u0080\u0001¢\u0006\u0005\bP\u0010\u0082\u0001J*\u0010X\u001a\u00020\u00002\u001a\u0010\u0081\u0001\u001a\u0015\u0012\u0005\u0012\u00030\u0083\u0001\u0012\u0004\u0012\u00020\u007f0~¢\u0006\u0003\b\u0080\u0001¢\u0006\u0005\bX\u0010\u0082\u0001J)\u0010Z\u001a\u00020\u00002\u0019\u0010\u0081\u0001\u001a\u0014\u0012\u0004\u0012\u00020W\u0012\u0004\u0012\u00020\u007f0~¢\u0006\u0003\b\u0080\u0001¢\u0006\u0005\bZ\u0010\u0082\u0001J)\u0010c\u001a\u00020\u00002\u0019\u0010\u0081\u0001\u001a\u0014\u0012\u0004\u0012\u00020b\u0012\u0004\u0012\u00020\u007f0~¢\u0006\u0003\b\u0080\u0001¢\u0006\u0005\bc\u0010\u0082\u0001J)\u0010k\u001a\u00020\u00002\u0019\u0010\u0081\u0001\u001a\u0014\u0012\u0004\u0012\u00020j\u0012\u0004\u0012\u00020\u007f0~¢\u0006\u0003\b\u0080\u0001¢\u0006\u0005\bk\u0010\u0082\u0001J)\u0010n\u001a\u00020\u00002\u0019\u0010\u0081\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u007f0~¢\u0006\u0003\b\u0080\u0001¢\u0006\u0005\bn\u0010\u0082\u0001J)\u0010q\u001a\u00020\u00002\u0019\u0010\u0081\u0001\u001a\u0014\u0012\u0004\u0012\u00020j\u0012\u0004\u0012\u00020\u007f0~¢\u0006\u0003\b\u0080\u0001¢\u0006\u0005\bq\u0010\u0082\u0001J)\u0010s\u001a\u00020\u00002\u0019\u0010\u0081\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u007f0~¢\u0006\u0003\b\u0080\u0001¢\u0006\u0005\bs\u0010\u0082\u0001J*\u0010u\u001a\u00020\u00002\u001a\u0010\u0081\u0001\u001a\u0015\u0012\u0005\u0012\u00030\u0084\u0001\u0012\u0004\u0012\u00020\u007f0~¢\u0006\u0003\b\u0080\u0001¢\u0006\u0005\bu\u0010\u0082\u0001J)\u0010x\u001a\u00020\u00002\u0019\u0010\u0081\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u007f0~¢\u0006\u0003\b\u0080\u0001¢\u0006\u0005\bx\u0010\u0082\u0001J*\u0010y\u001a\u00020\u00002\u001a\u0010\u0081\u0001\u001a\u0015\u0012\u0005\u0012\u00030\u0084\u0001\u0012\u0004\u0012\u00020\u007f0~¢\u0006\u0003\b\u0080\u0001¢\u0006\u0005\by\u0010\u0082\u0001J)\u0010z\u001a\u00020\u00002\u0019\u0010\u0081\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u007f0~¢\u0006\u0003\b\u0080\u0001¢\u0006\u0005\bz\u0010\u0082\u0001J*\u0010{\u001a\u00020\u00002\u001a\u0010\u0081\u0001\u001a\u0015\u0012\u0005\u0012\u00030\u0084\u0001\u0012\u0004\u0012\u00020\u007f0~¢\u0006\u0003\b\u0080\u0001¢\u0006\u0005\b{\u0010\u0082\u0001J)\u0010|\u001a\u00020\u00002\u0019\u0010\u0081\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u007f0~¢\u0006\u0003\b\u0080\u0001¢\u0006\u0005\b|\u0010\u0082\u0001J)\u0010}\u001a\u00020\u00002\u0019\u0010\u0081\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u007f0~¢\u0006\u0003\b\u0080\u0001¢\u0006\u0005\b}\u0010\u0082\u0001J\u001c\u0010\u0087\u0001\u001a\u00020\u001a2\b\u0010\u0086\u0001\u001a\u00030\u0085\u0001H\u0014¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001R.\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u000f2\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u000f8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R.\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u00172\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u00178\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R.\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u001d2\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u001d8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R.\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u000b2\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u000b8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R.\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u001d2\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u001d8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u009a\u0001\u0010\u0093\u0001\u001a\u0006\b\u009b\u0001\u0010\u0095\u0001R.\u0010\u009c\u0001\u001a\u0004\u0018\u00010)2\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010)8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R.\u0010 \u0001\u001a\u0004\u0018\u00010@2\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010@8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b \u0001\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001R.\u0010¤\u0001\u001a\u0004\u0018\u00010H2\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010H8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001R<\u0010©\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u000f\u0018\u00010¨\u00012\u0010\u0010\u0089\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u000f\u0018\u00010¨\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b©\u0001\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001R<\u0010\u00ad\u0001\u001a\u000b\u0012\u0004\u0012\u00020W\u0018\u00010¨\u00012\u0010\u0010\u0089\u0001\u001a\u000b\u0012\u0004\u0012\u00020W\u0018\u00010¨\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u00ad\u0001\u0010ª\u0001\u001a\u0006\b®\u0001\u0010¬\u0001R>\u0010°\u0001\u001a\f\u0012\u0005\u0012\u00030¯\u0001\u0018\u00010¨\u00012\u0011\u0010\u0089\u0001\u001a\f\u0012\u0005\u0012\u00030¯\u0001\u0018\u00010¨\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b°\u0001\u0010ª\u0001\u001a\u0006\b±\u0001\u0010¬\u0001R.\u0010²\u0001\u001a\u0004\u0018\u00010j2\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010j8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b²\u0001\u0010³\u0001\u001a\u0006\b´\u0001\u0010µ\u0001R.\u0010¶\u0001\u001a\u0004\u0018\u00010j2\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010j8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b¶\u0001\u0010³\u0001\u001a\u0006\b·\u0001\u0010µ\u0001R<\u0010¸\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0000\u0018\u00010¨\u00012\u0010\u0010\u0089\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0000\u0018\u00010¨\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b¸\u0001\u0010ª\u0001\u001a\u0006\b¹\u0001\u0010¬\u0001R<\u0010º\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0000\u0018\u00010¨\u00012\u0010\u0010\u0089\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0000\u0018\u00010¨\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\bº\u0001\u0010ª\u0001\u001a\u0006\b»\u0001\u0010¬\u0001R<\u0010¼\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0000\u0018\u00010¨\u00012\u0010\u0010\u0089\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0000\u0018\u00010¨\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b¼\u0001\u0010ª\u0001\u001a\u0006\b½\u0001\u0010¬\u0001R(\u0010\f\u001a\u00020\u000b2\u0007\u0010¾\u0001\u001a\u00020\u000b8G@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b¿\u0001\u0010\u0099\u0001\"\u0005\bÀ\u0001\u0010\rR(\u0010\u0010\u001a\u00020\u000b2\u0007\u0010¾\u0001\u001a\u00020\u000b8G@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\bÁ\u0001\u0010\u0099\u0001\"\u0005\bÂ\u0001\u0010\rR)\u0010\u0018\u001a\u00020\u001a2\u0007\u0010¾\u0001\u001a\u00020\u001a8G@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÃ\u0001\u0010Ä\u0001\"\u0006\bÅ\u0001\u0010Æ\u0001R(\u0010\u001e\u001a\u00020\u000b2\u0007\u0010¾\u0001\u001a\u00020\u000b8G@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\bÇ\u0001\u0010\u0099\u0001\"\u0005\bÈ\u0001\u0010\rR(\u0010%\u001a\u00020\u000b2\u0007\u0010¾\u0001\u001a\u00020\u000b8G@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\bÉ\u0001\u0010\u0099\u0001\"\u0005\bÊ\u0001\u0010\rR(\u0010'\u001a\u00020\u000b2\u0007\u0010¾\u0001\u001a\u00020\u000b8G@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\bË\u0001\u0010\u0099\u0001\"\u0005\bÌ\u0001\u0010\rR9\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0,2\u000f\u0010¾\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0,8G@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÍ\u0001\u0010Î\u0001\"\u0006\bÏ\u0001\u0010Ð\u0001R)\u00106\u001a\u00020\u001a2\u0007\u0010¾\u0001\u001a\u00020\u001a8G@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÑ\u0001\u0010Ä\u0001\"\u0006\bÒ\u0001\u0010Æ\u0001R5\u0010I\u001a\b\u0012\u0004\u0012\u00020\u001a0,2\r\u0010¾\u0001\u001a\b\u0012\u0004\u0012\u00020\u001a0,8G@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÓ\u0001\u0010Î\u0001\"\u0006\bÔ\u0001\u0010Ð\u0001R5\u0010N\u001a\b\u0012\u0004\u0012\u00020\u000b0,2\r\u0010¾\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0,8G@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÕ\u0001\u0010Î\u0001\"\u0006\bÖ\u0001\u0010Ð\u0001R5\u0010c\u001a\b\u0012\u0004\u0012\u00020e0,2\r\u0010¾\u0001\u001a\b\u0012\u0004\u0012\u00020e0,8G@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b×\u0001\u0010Î\u0001\"\u0006\bØ\u0001\u0010Ð\u0001R5\u0010P\u001a\b\u0012\u0004\u0012\u00020\u000b0,2\r\u0010¾\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0,8G@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÙ\u0001\u0010Î\u0001\"\u0006\bÚ\u0001\u0010Ð\u0001¨\u0006Ü\u0001"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "Lorg/luckypray/dexkit/query/base/BaseMatcher;", "Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "Ljava/lang/reflect/Method;", "method", "(Ljava/lang/reflect/Method;)V", "Ljava/lang/reflect/Constructor;", "constructor", "(Ljava/lang/reflect/Constructor;)V", "", "descriptor", "(Ljava/lang/String;)V", "(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "name", "(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "Lorg/luckypray/dexkit/query/enums/StringMatchType;", "matchType", "", "ignoreCase", "(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;", "modifiers", "(Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "", "Lorg/luckypray/dexkit/query/enums/MatchType;", "(ILorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "declaredClass", "(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "Ljava/lang/Class;", "clazz", "(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "className", "shorty", "protoShorty", "type", "returnType", "typeName", "Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;", "params", "(Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "", "paramTypes", "(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "", "([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "([Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "paramType", "addParamType", "count", "paramCount", "(I)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "range", "(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "LYue/ۥ۠ۥۣۨ;", "(LYue/ۥ۠ۥۣۨ;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "min", "max", "(II)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;", "annotations", "(Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "annotation", "addAnnotation", "(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "annotationCount", "Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;", "opCodes", "(Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;", "opCodeSize", "(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "opNames", "Lorg/luckypray/dexkit/query/StringMatcherList;", "usingStrings", "(Lorg/luckypray/dexkit/query/StringMatcherList;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "usingEqStrings", "usingString", "addUsingString", "addEqString", "Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;", "usingFields", "usingField", "addUsingField", "(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "Lorg/luckypray/dexkit/query/enums/UsingType;", "usingType", "(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;Lorg/luckypray/dexkit/query/enums/UsingType;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "fieldDescriptor", "(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/UsingType;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;", "usingNumbers", "(Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "", "([Ljava/lang/Number;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "usingNumber", "addUsingNumber", "(Ljava/lang/Number;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;", "invokeMethods", "(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "invokeMethod", "addInvoke", "(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "methodDescriptor", "callerMethods", "callerMethod", "addCaller", "matchers", "allOf", "([Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "matcher", "addAllOf", "anyOf", "addAnyOf", "noneOf", "addNoneOf", "not", "Lkotlin/Function1;", "LYue/ۥۣۢ۠ۤ;", "LYue/ۥ۠ۡۥۧ;", "init", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "Lorg/luckypray/dexkit/query/UsingFieldMatcherList;", "Lorg/luckypray/dexkit/query/MethodMatcherList;", "Lcom/google/flatbuffers/FlatBufferBuilder;", "fbb", "innerBuild", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "<set-?>", "nameMatcher", "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "getNameMatcher", "()Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "modifiersMatcher", "Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;", "getModifiersMatcher", "()Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;", "classMatcher", "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "getClassMatcher", "()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "protoShortyMatcher", "Ljava/lang/String;", "getProtoShortyMatcher", "()Ljava/lang/String;", "returnTypeMatcher", "getReturnTypeMatcher", "paramsMatcher", "Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;", "getParamsMatcher", "()Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;", "annotationsMatcher", "Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;", "getAnnotationsMatcher", "()Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;", "opCodesMatcher", "Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;", "getOpCodesMatcher", "()Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;", "", "usingStringsMatcher", "Ljava/util/List;", "getUsingStringsMatcher", "()Ljava/util/List;", "usingFieldsMatcher", "getUsingFieldsMatcher", "Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;", "usingNumbersMatcher", "getUsingNumbersMatcher", "invokeMethodsMatcher", "Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;", "getInvokeMethodsMatcher", "()Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;", "callerMethodsMatcher", "getCallerMethodsMatcher", "allOfMatchers", "getAllOfMatchers", "anyOfMatchers", "getAnyOfMatchers", "noneOfMatchers", "getNoneOfMatchers", "value", "getDescriptor", "setDescriptor", "getName", "setName", "getModifiers", "()I", "setModifiers", "(I)V", "getDeclaredClass", "setDeclaredClass", "getProtoShorty", "setProtoShorty", "getReturnType", "setReturnType", "getParamTypes", "()Ljava/util/Collection;", "setParamTypes", "(Ljava/util/Collection;)V", "getParamCount", "setParamCount", "getOpCodes", "setOpCodes", "getOpNames", "setOpNames", "getUsingNumbers", "setUsingNumbers", "getUsingStrings", "setUsingStrings", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class MethodMatcher extends BaseMatcher implements IAnnotationEncodeValue {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @InterfaceC6399
    public static final Companion INSTANCE = new Companion(null);

    @InterfaceC6489
    private List<MethodMatcher> allOfMatchers;

    @InterfaceC6489
    private AnnotationsMatcher annotationsMatcher;

    @InterfaceC6489
    private List<MethodMatcher> anyOfMatchers;

    @InterfaceC6489
    private MethodsMatcher callerMethodsMatcher;

    @InterfaceC6489
    private ClassMatcher classMatcher;

    @InterfaceC6489
    private MethodsMatcher invokeMethodsMatcher;

    @InterfaceC6489
    private AccessFlagsMatcher modifiersMatcher;

    @InterfaceC6489
    private StringMatcher nameMatcher;

    @InterfaceC6489
    private List<MethodMatcher> noneOfMatchers;

    @InterfaceC6489
    private OpCodesMatcher opCodesMatcher;

    @InterfaceC6489
    private ParametersMatcher paramsMatcher;

    @InterfaceC6489
    private String protoShortyMatcher;

    @InterfaceC6489
    private ClassMatcher returnTypeMatcher;

    @InterfaceC6489
    private List<UsingFieldMatcher> usingFieldsMatcher;

    @InterfaceC6489
    private List<NumberEncodeValueMatcher> usingNumbersMatcher;

    @InterfaceC6489
    private List<StringMatcher> usingStringsMatcher;

    @InterfaceC6211(m2698d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0014\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, m2699d2 = {"Lorg/luckypray/dexkit/query/matchers/MethodMatcher$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "constructor", "Ljava/lang/reflect/Constructor;", "method", "Ljava/lang/reflect/Method;", "descriptor", "", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.query.matchers.MethodMatcher.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6399
        @InterfaceC5578
        public final MethodMatcher create() {
            return new MethodMatcher();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @InterfaceC6399
        @InterfaceC5578
        public final MethodMatcher create(@InterfaceC6399 Method method) {
            C5499.m17103(method, "method");
            return new MethodMatcher(method);
        }

        @InterfaceC6399
        @InterfaceC5578
        public final MethodMatcher create(@InterfaceC6399 Constructor<?> constructor) {
            C5499.m17103(constructor, "constructor");
            return new MethodMatcher(constructor);
        }

        @InterfaceC6399
        @InterfaceC5578
        public final MethodMatcher create(@InterfaceC6399 String str) {
            C5499.m17103(str, "descriptor");
            return new MethodMatcher(str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MethodMatcher() {
    }

    public static /* synthetic */ MethodMatcher addParamType$default(MethodMatcher methodMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return methodMatcher.addParamType(str, stringMatchType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ MethodMatcher addUsingField$default(MethodMatcher methodMatcher, FieldMatcher fieldMatcher, UsingType usingType, int i, Object obj) {
        if ((i & 2) != 0) {
            usingType = UsingType.Any;
        }
        return methodMatcher.addUsingField(fieldMatcher, usingType);
    }

    public static /* synthetic */ MethodMatcher addUsingString$default(MethodMatcher methodMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Contains;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return methodMatcher.addUsingString(str, stringMatchType, z);
    }

    public static /* synthetic */ MethodMatcher annotationCount$default(MethodMatcher methodMatcher, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return methodMatcher.annotationCount(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5578
    public static final MethodMatcher create() {
        return INSTANCE.create();
    }

    public static /* synthetic */ MethodMatcher declaredClass$default(MethodMatcher methodMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return methodMatcher.declaredClass(str, stringMatchType, z);
    }

    public static /* synthetic */ MethodMatcher modifiers$default(MethodMatcher methodMatcher, int i, MatchType matchType, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            matchType = MatchType.Contains;
        }
        return methodMatcher.modifiers(i, matchType);
    }

    public static /* synthetic */ MethodMatcher name$default(MethodMatcher methodMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return methodMatcher.name(str, stringMatchType, z);
    }

    public static /* synthetic */ MethodMatcher opCodes$default(MethodMatcher methodMatcher, Collection collection, OpCodeMatchType opCodeMatchType, IntRange intRange, int i, Object obj) {
        if ((i & 2) != 0) {
            opCodeMatchType = OpCodeMatchType.Contains;
        }
        if ((i & 4) != 0) {
            intRange = null;
        }
        return methodMatcher.opCodes(collection, opCodeMatchType, intRange);
    }

    public static /* synthetic */ MethodMatcher opNames$default(MethodMatcher methodMatcher, Collection collection, OpCodeMatchType opCodeMatchType, IntRange intRange, int i, Object obj) {
        if ((i & 2) != 0) {
            opCodeMatchType = OpCodeMatchType.Contains;
        }
        if ((i & 4) != 0) {
            intRange = null;
        }
        return methodMatcher.opNames(collection, opCodeMatchType, intRange);
    }

    public static /* synthetic */ MethodMatcher paramCount$default(MethodMatcher methodMatcher, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return methodMatcher.paramCount(i, i2);
    }

    public static /* synthetic */ MethodMatcher returnType$default(MethodMatcher methodMatcher, String str, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Equals;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return methodMatcher.returnType(str, stringMatchType, z);
    }

    public static /* synthetic */ MethodMatcher usingStrings$default(MethodMatcher methodMatcher, Collection collection, StringMatchType stringMatchType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            stringMatchType = StringMatchType.Contains;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return methodMatcher.usingStrings(collection, stringMatchType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final MethodMatcher addAllOf(@InterfaceC6399 MethodMatcher matcher) {
        C5499.m17103(matcher, "matcher");
        List<MethodMatcher> arrayList = this.allOfMatchers;
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
    public final MethodMatcher addAnnotation(@InterfaceC6399 AnnotationMatcher annotation) {
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
    public final MethodMatcher addAnyOf(@InterfaceC6399 MethodMatcher matcher) {
        C5499.m17103(matcher, "matcher");
        List<MethodMatcher> arrayList = this.anyOfMatchers;
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
    public final MethodMatcher addCaller(@InterfaceC6399 MethodMatcher callerMethod) {
        C5499.m17103(callerMethod, "callerMethod");
        MethodsMatcher methodsMatcher = this.callerMethodsMatcher;
        if (methodsMatcher == null) {
            methodsMatcher = new MethodsMatcher();
        }
        this.callerMethodsMatcher = methodsMatcher;
        C5499.m17100(methodsMatcher);
        methodsMatcher.add(callerMethod);
        return this;
    }

    @InterfaceC6399
    public final MethodMatcher addEqString(@InterfaceC6399 String usingString) {
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
    public final MethodMatcher addInvoke(@InterfaceC6399 MethodMatcher invokeMethod) {
        C5499.m17103(invokeMethod, "invokeMethod");
        MethodsMatcher methodsMatcher = this.invokeMethodsMatcher;
        if (methodsMatcher == null) {
            methodsMatcher = new MethodsMatcher();
        }
        this.invokeMethodsMatcher = methodsMatcher;
        C5499.m17100(methodsMatcher);
        methodsMatcher.add(invokeMethod);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final MethodMatcher addNoneOf(@InterfaceC6399 MethodMatcher matcher) {
        C5499.m17103(matcher, "matcher");
        List<MethodMatcher> arrayList = this.noneOfMatchers;
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
    public final MethodMatcher addParamType(@InterfaceC6489 String str) {
        return addParamType$default(this, str, null, false, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5573
    public final MethodMatcher addUsingField(@InterfaceC6399 String str) {
        C5499.m17103(str, "fieldDescriptor");
        return addUsingField$default(this, str, (UsingType) null, 2, (Object) null);
    }

    @InterfaceC6399
    public final MethodMatcher addUsingNumber(@InterfaceC6399 Number usingNumber) {
        C5499.m17103(usingNumber, "usingNumber");
        List<NumberEncodeValueMatcher> arrayList = this.usingNumbersMatcher;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.usingNumbersMatcher = arrayList;
        C5499.m17100(arrayList);
        arrayList.add(new NumberEncodeValueMatcher().value(usingNumber));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5573
    public final MethodMatcher addUsingString(@InterfaceC6399 String str) {
        C5499.m17103(str, "usingString");
        return addUsingString$default(this, str, null, false, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final MethodMatcher allOf(@InterfaceC6399 Collection<MethodMatcher> matchers) {
        C5499.m17103(matchers, "matchers");
        if (!(!matchers.isEmpty())) {
            matchers = null;
        }
        this.allOfMatchers = matchers != null ? C3888.m11065(matchers) : null;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final MethodMatcher annotationCount(int count) {
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
    public final MethodMatcher annotations(@InterfaceC6399 AnnotationsMatcher annotations) {
        C5499.m17103(annotations, "annotations");
        this.annotationsMatcher = annotations;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final MethodMatcher anyOf(@InterfaceC6399 Collection<MethodMatcher> matchers) {
        C5499.m17103(matchers, "matchers");
        if (!(!matchers.isEmpty())) {
            matchers = null;
        }
        this.anyOfMatchers = matchers != null ? C3888.m11065(matchers) : null;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final MethodMatcher callerMethods(@InterfaceC6399 MethodsMatcher callerMethods) {
        C5499.m17103(callerMethods, "callerMethods");
        this.callerMethodsMatcher = callerMethods;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5573
    public final MethodMatcher declaredClass(@InterfaceC6399 String str) {
        C5499.m17103(str, "className");
        return declaredClass$default(this, str, null, false, 6, null);
    }

    @InterfaceC6399
    public final MethodMatcher descriptor(@InterfaceC6399 String descriptor) {
        C5499.m17103(descriptor, "descriptor");
        DexMethod dexMethod = new DexMethod(descriptor);
        name$default(this, dexMethod.getName(), null, false, 6, null);
        declaredClass$default(this, dexMethod.getClassName(), null, false, 6, null);
        returnType$default(this, dexMethod.getReturnTypeName(), null, false, 6, null);
        paramTypes(dexMethod.getParamTypeNames());
        return this;
    }

    @InterfaceC6489
    public final List<MethodMatcher> getAllOfMatchers() {
        return this.allOfMatchers;
    }

    @InterfaceC6489
    public final AnnotationsMatcher getAnnotationsMatcher() {
        return this.annotationsMatcher;
    }

    @InterfaceC6489
    public final List<MethodMatcher> getAnyOfMatchers() {
        return this.anyOfMatchers;
    }

    @InterfaceC6489
    public final MethodsMatcher getCallerMethodsMatcher() {
        return this.callerMethodsMatcher;
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
    public final MethodsMatcher getInvokeMethodsMatcher() {
        return this.invokeMethodsMatcher;
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
    public final List<MethodMatcher> getNoneOfMatchers() {
        return this.noneOfMatchers;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "Property can only be written.")
    public final /* synthetic */ Collection getOpCodes() {
        throw new C6398(null, 1, null);
    }

    @InterfaceC6489
    public final OpCodesMatcher getOpCodesMatcher() {
        return this.opCodesMatcher;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "Property can only be written.")
    public final /* synthetic */ Collection getOpNames() {
        throw new C6398(null, 1, null);
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "Property can only be written.")
    public final /* synthetic */ int getParamCount() {
        throw new C6398(null, 1, null);
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "Property can only be written.")
    public final /* synthetic */ Collection getParamTypes() {
        throw new C6398(null, 1, null);
    }

    @InterfaceC6489
    public final ParametersMatcher getParamsMatcher() {
        return this.paramsMatcher;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "Property can only be written.")
    public final /* synthetic */ String getProtoShorty() {
        throw new C6398(null, 1, null);
    }

    @InterfaceC6489
    public final String getProtoShortyMatcher() {
        return this.protoShortyMatcher;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "Property can only be written.")
    public final /* synthetic */ String getReturnType() {
        throw new C6398(null, 1, null);
    }

    @InterfaceC6489
    public final ClassMatcher getReturnTypeMatcher() {
        return this.returnTypeMatcher;
    }

    @InterfaceC6489
    public final List<UsingFieldMatcher> getUsingFieldsMatcher() {
        return this.usingFieldsMatcher;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "Property can only be written.")
    public final /* synthetic */ Collection getUsingNumbers() {
        throw new C6398(null, 1, null);
    }

    @InterfaceC6489
    public final List<NumberEncodeValueMatcher> getUsingNumbersMatcher() {
        return this.usingNumbersMatcher;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "Property can only be written.")
    public final /* synthetic */ Collection getUsingStrings() {
        throw new C6398(null, 1, null);
    }

    @InterfaceC6489
    public final List<StringMatcher> getUsingStringsMatcher() {
        return this.usingStringsMatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b5  */
    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int innerBuild(@InterfaceC6399 FlatBufferBuilder fbb) {
        int iCreateVectorOfTables;
        int iCreateVectorOfTables2;
        int iM31206createUsingNumbersTypeVectorVUfvBY;
        int i;
        List<MethodMatcher> list;
        int i2;
        List<MethodMatcher> list2;
        int iCreateVectorOfTables3;
        List<MethodMatcher> list3;
        int iCreateVectorOfTables4;
        C5499.m17103(fbb, "fbb");
        MethodMatcher.Companion companion = org.luckypray.dexkit.schema.MethodMatcher.INSTANCE;
        StringMatcher stringMatcher = this.nameMatcher;
        int iBuild$dexkit_android_release = stringMatcher != null ? stringMatcher.build$dexkit_android_release(fbb) : 0;
        AccessFlagsMatcher accessFlagsMatcher = this.modifiersMatcher;
        int iBuild$dexkit_android_release2 = accessFlagsMatcher != null ? accessFlagsMatcher.build$dexkit_android_release(fbb) : 0;
        ClassMatcher classMatcher = this.classMatcher;
        int iBuild$dexkit_android_release3 = classMatcher != null ? classMatcher.build$dexkit_android_release(fbb) : 0;
        ClassMatcher classMatcher2 = this.returnTypeMatcher;
        int iBuild$dexkit_android_release4 = classMatcher2 != null ? classMatcher2.build$dexkit_android_release(fbb) : 0;
        ParametersMatcher parametersMatcher = this.paramsMatcher;
        int iBuild$dexkit_android_release5 = parametersMatcher != null ? parametersMatcher.build$dexkit_android_release(fbb) : 0;
        AnnotationsMatcher annotationsMatcher = this.annotationsMatcher;
        int iBuild$dexkit_android_release6 = annotationsMatcher != null ? annotationsMatcher.build$dexkit_android_release(fbb) : 0;
        OpCodesMatcher opCodesMatcher = this.opCodesMatcher;
        int iBuild$dexkit_android_release7 = opCodesMatcher != null ? opCodesMatcher.build$dexkit_android_release(fbb) : 0;
        List<StringMatcher> list4 = this.usingStringsMatcher;
        if (list4 != null) {
            ArrayList arrayList = new ArrayList(C3881.m10756(list4, 10));
            Iterator<T> it = list4.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((StringMatcher) it.next()).build$dexkit_android_release(fbb)));
            }
            int[] iArrM11061 = C3888.m11061(arrayList);
            iCreateVectorOfTables = iArrM11061 != null ? fbb.createVectorOfTables(iArrM11061) : 0;
        }
        List<UsingFieldMatcher> list5 = this.usingFieldsMatcher;
        if (list5 != null) {
            ArrayList arrayList2 = new ArrayList(C3881.m10756(list5, 10));
            Iterator<T> it2 = list5.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(((UsingFieldMatcher) it2.next()).build$dexkit_android_release(fbb)));
            }
            int[] iArrM110612 = C3888.m11061(arrayList2);
            iCreateVectorOfTables2 = iArrM110612 != null ? fbb.createVectorOfTables(iArrM110612) : 0;
        }
        List<NumberEncodeValueMatcher> list6 = this.usingNumbersMatcher;
        if (list6 != null) {
            ArrayList arrayList3 = new ArrayList(C3881.m10756(list6, 10));
            Iterator<T> it3 = list6.iterator();
            while (it3.hasNext()) {
                NumberEncodeValueType type = ((NumberEncodeValueMatcher) it3.next()).getType();
                C5499.m17100(type);
                arrayList3.add(C8048.m26188(type.getValue()));
            }
            iM31206createUsingNumbersTypeVectorVUfvBY = org.luckypray.dexkit.schema.MethodMatcher.INSTANCE.m31206createUsingNumbersTypeVectorVUfvBY(fbb, C8053.m26267(arrayList3));
        } else {
            iM31206createUsingNumbersTypeVectorVUfvBY = 0;
        }
        List<NumberEncodeValueMatcher> list7 = this.usingNumbersMatcher;
        if (list7 != null) {
            i = iM31206createUsingNumbersTypeVectorVUfvBY;
            ArrayList arrayList4 = new ArrayList(C3881.m10756(list7, 10));
            Iterator<T> it4 = list7.iterator();
            while (it4.hasNext()) {
                Object value = ((NumberEncodeValueMatcher) it4.next()).getValue();
                C5499.m17101(value, "null cannot be cast to non-null type org.luckypray.dexkit.query.base.BaseMatcher");
                arrayList4.add(Integer.valueOf(((BaseMatcher) value).build$dexkit_android_release(fbb)));
            }
            int[] iArrM110613 = C3888.m11061(arrayList4);
            int iCreateUsingNumbersVector = iArrM110613 != null ? org.luckypray.dexkit.schema.MethodMatcher.INSTANCE.createUsingNumbersVector(fbb, iArrM110613) : 0;
            MethodsMatcher methodsMatcher = this.invokeMethodsMatcher;
            int iBuild$dexkit_android_release8 = methodsMatcher == null ? methodsMatcher.build$dexkit_android_release(fbb) : 0;
            MethodsMatcher methodsMatcher2 = this.callerMethodsMatcher;
            int iBuild$dexkit_android_release9 = methodsMatcher2 == null ? methodsMatcher2.build$dexkit_android_release(fbb) : 0;
            String str = this.protoShortyMatcher;
            int iCreateString = str == null ? fbb.createString(str) : 0;
            list = this.allOfMatchers;
            if (list == null) {
                i2 = iCreateUsingNumbersVector;
                ArrayList arrayList5 = new ArrayList(C3881.m10756(list, 10));
                Iterator<T> it5 = list.iterator();
                while (it5.hasNext()) {
                    arrayList5.add(Integer.valueOf(((MethodMatcher) it5.next()).build$dexkit_android_release(fbb)));
                }
                int[] iArrM110614 = C3888.m11061(arrayList5);
                int iCreateVectorOfTables5 = iArrM110614 != null ? fbb.createVectorOfTables(iArrM110614) : 0;
                list2 = this.anyOfMatchers;
                if (list2 != null) {
                    ArrayList arrayList6 = new ArrayList(C3881.m10756(list2, 10));
                    Iterator<T> it6 = list2.iterator();
                    while (it6.hasNext()) {
                        arrayList6.add(Integer.valueOf(((MethodMatcher) it6.next()).build$dexkit_android_release(fbb)));
                    }
                    int[] iArrM110615 = C3888.m11061(arrayList6);
                    iCreateVectorOfTables3 = iArrM110615 != null ? fbb.createVectorOfTables(iArrM110615) : 0;
                }
                list3 = this.noneOfMatchers;
                if (list3 != null) {
                    ArrayList arrayList7 = new ArrayList(C3881.m10756(list3, 10));
                    Iterator<T> it7 = list3.iterator();
                    while (it7.hasNext()) {
                        arrayList7.add(Integer.valueOf(((MethodMatcher) it7.next()).build$dexkit_android_release(fbb)));
                    }
                    int[] iArrM110616 = C3888.m11061(arrayList7);
                    iCreateVectorOfTables4 = iArrM110616 != null ? fbb.createVectorOfTables(iArrM110616) : 0;
                }
                int iCreateMethodMatcher = companion.createMethodMatcher(fbb, iBuild$dexkit_android_release, iBuild$dexkit_android_release2, iBuild$dexkit_android_release3, iBuild$dexkit_android_release4, iBuild$dexkit_android_release5, iBuild$dexkit_android_release6, iBuild$dexkit_android_release7, iCreateVectorOfTables, iCreateVectorOfTables2, i, i2, iBuild$dexkit_android_release8, iBuild$dexkit_android_release9, iCreateString, iCreateVectorOfTables5, iCreateVectorOfTables3, iCreateVectorOfTables4);
                fbb.finish(iCreateMethodMatcher);
                return iCreateMethodMatcher;
            }
            i2 = iCreateUsingNumbersVector;
            list2 = this.anyOfMatchers;
            if (list2 != null) {
            }
            list3 = this.noneOfMatchers;
            if (list3 != null) {
            }
            int iCreateMethodMatcher2 = companion.createMethodMatcher(fbb, iBuild$dexkit_android_release, iBuild$dexkit_android_release2, iBuild$dexkit_android_release3, iBuild$dexkit_android_release4, iBuild$dexkit_android_release5, iBuild$dexkit_android_release6, iBuild$dexkit_android_release7, iCreateVectorOfTables, iCreateVectorOfTables2, i, i2, iBuild$dexkit_android_release8, iBuild$dexkit_android_release9, iCreateString, iCreateVectorOfTables5, iCreateVectorOfTables3, iCreateVectorOfTables4);
            fbb.finish(iCreateMethodMatcher2);
            return iCreateMethodMatcher2;
        }
        i = iM31206createUsingNumbersTypeVectorVUfvBY;
        MethodsMatcher methodsMatcher3 = this.invokeMethodsMatcher;
        if (methodsMatcher3 == null) {
        }
        MethodsMatcher methodsMatcher22 = this.callerMethodsMatcher;
        if (methodsMatcher22 == null) {
        }
        String str2 = this.protoShortyMatcher;
        if (str2 == null) {
        }
        list = this.allOfMatchers;
        if (list == null) {
        }
        list2 = this.anyOfMatchers;
        if (list2 != null) {
        }
        list3 = this.noneOfMatchers;
        if (list3 != null) {
        }
        int iCreateMethodMatcher22 = companion.createMethodMatcher(fbb, iBuild$dexkit_android_release, iBuild$dexkit_android_release2, iBuild$dexkit_android_release3, iBuild$dexkit_android_release4, iBuild$dexkit_android_release5, iBuild$dexkit_android_release6, iBuild$dexkit_android_release7, iCreateVectorOfTables, iCreateVectorOfTables2, i, i2, iBuild$dexkit_android_release8, iBuild$dexkit_android_release9, iCreateString, iCreateVectorOfTables5, iCreateVectorOfTables3, iCreateVectorOfTables4);
        fbb.finish(iCreateMethodMatcher22);
        return iCreateMethodMatcher22;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final MethodMatcher invokeMethods(@InterfaceC6399 MethodsMatcher invokeMethods) {
        C5499.m17103(invokeMethods, "invokeMethods");
        this.invokeMethodsMatcher = invokeMethods;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5573
    public final MethodMatcher modifiers(int i) {
        return modifiers$default(this, i, null, 2, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5573
    public final MethodMatcher name(@InterfaceC6399 String str) {
        C5499.m17103(str, "name");
        return name$default(this, str, null, false, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final MethodMatcher noneOf(@InterfaceC6399 Collection<MethodMatcher> matchers) {
        C5499.m17103(matchers, "matchers");
        if (!(!matchers.isEmpty())) {
            matchers = null;
        }
        this.noneOfMatchers = matchers != null ? C3888.m11065(matchers) : null;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final MethodMatcher not(@InterfaceC6399 MethodMatcher matcher) {
        C5499.m17103(matcher, "matcher");
        addNoneOf(matcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5573
    public final MethodMatcher opCodes(@InterfaceC6399 Collection<Integer> collection) {
        C5499.m17103(collection, "opCodes");
        return opCodes$default(this, collection, null, null, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5573
    public final MethodMatcher opNames(@InterfaceC6399 Collection<String> collection) {
        C5499.m17103(collection, "opNames");
        return opNames$default(this, collection, null, null, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: setParamCount(I)V */
    @InterfaceC6399
    /* JADX INFO: renamed from: paramCount, reason: merged with bridge method [inline-methods] */
    public final MethodMatcher setParamCount(int count) {
        if (this.paramsMatcher == null) {
            this.paramsMatcher = new ParametersMatcher();
            C8107 c8107 = C8107.f3222;
        }
        ParametersMatcher parametersMatcher = this.paramsMatcher;
        C5499.m17100(parametersMatcher);
        parametersMatcher.setCount(count);
        return this;
    }

    /* JADX DEBUG: Class process forced to load method for inline: org.luckypray.dexkit.query.matchers.ParameterMatcher.type$default(org.luckypray.dexkit.query.matchers.ParameterMatcher, java.lang.String, org.luckypray.dexkit.query.enums.StringMatchType, boolean, int, java.lang.Object):org.luckypray.dexkit.query.matchers.ParameterMatcher */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final MethodMatcher paramTypes(@InterfaceC6399 Collection<String> paramTypes) {
        C5499.m17103(paramTypes, "paramTypes");
        ParametersMatcher parametersMatcher = new ParametersMatcher();
        parametersMatcher.params(C3880.m10735());
        for (String str : paramTypes) {
            parametersMatcher.add(str != null ? ParameterMatcher.type$default(new ParameterMatcher(), str, null, false, 6, null) : null);
        }
        this.paramsMatcher = parametersMatcher;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final MethodMatcher params(@InterfaceC6399 ParametersMatcher params) {
        C5499.m17103(params, "params");
        this.paramsMatcher = params;
        return this;
    }

    @InterfaceC6399
    public final MethodMatcher protoShorty(@InterfaceC6399 String shorty) {
        C5499.m17103(shorty, "shorty");
        this.protoShortyMatcher = shorty;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5573
    public final MethodMatcher returnType(@InterfaceC6399 String str) {
        C5499.m17103(str, "typeName");
        return returnType$default(this, str, null, false, 6, null);
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

    public final void setOpCodes(@InterfaceC6399 Collection<Integer> collection) {
        C5499.m17103(collection, "value");
        opCodes$default(this, collection, null, null, 6, null);
    }

    public final void setOpNames(@InterfaceC6399 Collection<String> collection) {
        C5499.m17103(collection, "value");
        opNames$default(this, collection, null, null, 6, null);
    }

    public final /* synthetic */ void setParamTypes(Collection collection) {
        C5499.m17103(collection, "value");
        paramTypes((Collection<String>) collection);
    }

    public final /* synthetic */ void setProtoShorty(String str) {
        C5499.m17103(str, "value");
        protoShorty(str);
    }

    public final /* synthetic */ void setReturnType(String str) {
        C5499.m17103(str, "value");
        returnType$default(this, str, null, false, 6, null);
    }

    public final void setUsingNumbers(@InterfaceC6399 Collection<? extends Number> collection) {
        C5499.m17103(collection, "value");
        usingNumbers(collection);
    }

    public final /* synthetic */ void setUsingStrings(Collection collection) {
        C5499.m17103(collection, "value");
        usingStrings$default(this, collection, null, false, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final MethodMatcher usingEqStrings(@InterfaceC6399 Collection<String> usingStrings) {
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
    public final MethodMatcher usingFields(@InterfaceC6399 Collection<UsingFieldMatcher> usingFields) {
        C5499.m17103(usingFields, "usingFields");
        this.usingFieldsMatcher = C3888.m11065(usingFields);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final MethodMatcher usingNumbers(@InterfaceC6399 NumberEncodeValueMatcherList usingNumbers) {
        C5499.m17103(usingNumbers, "usingNumbers");
        this.usingNumbersMatcher = usingNumbers;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5573
    public final MethodMatcher usingStrings(@InterfaceC6399 Collection<String> collection) {
        C5499.m17103(collection, "usingStrings");
        return usingStrings$default(this, collection, null, false, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public MethodMatcher(@InterfaceC6399 Method method) {
        C5499.m17103(method, "method");
        descriptor(DexSignUtil.getDescriptor(method));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static /* synthetic */ MethodMatcher addUsingField$default(MethodMatcher methodMatcher, String str, UsingType usingType, int i, Object obj) {
        if ((i & 2) != 0) {
            usingType = UsingType.Any;
        }
        return methodMatcher.addUsingField(str, usingType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5578
    public static final MethodMatcher create(@InterfaceC6399 String str) {
        return INSTANCE.create(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5573
    public final MethodMatcher addParamType(@InterfaceC6489 String str, @InterfaceC6399 StringMatchType stringMatchType) {
        C5499.m17103(stringMatchType, "matchType");
        return addParamType$default(this, str, stringMatchType, false, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5573
    public final MethodMatcher addUsingField(@InterfaceC6399 FieldMatcher fieldMatcher) {
        C5499.m17103(fieldMatcher, "usingField");
        return addUsingField$default(this, fieldMatcher, (UsingType) null, 2, (Object) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5573
    public final MethodMatcher addUsingString(@InterfaceC6399 String str, @InterfaceC6399 StringMatchType stringMatchType) {
        C5499.m17103(str, "usingString");
        C5499.m17103(stringMatchType, "matchType");
        return addUsingString$default(this, str, stringMatchType, false, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    public final MethodMatcher allOf(@InterfaceC6399 MethodMatcher... matchers) {
        C5499.m17103(matchers, "matchers");
        allOf(C3404.m7069(matchers));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final /* synthetic */ MethodMatcher annotations(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        AnnotationsMatcher annotationsMatcher = new AnnotationsMatcher();
        init.invoke(annotationsMatcher);
        annotations(annotationsMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    public final MethodMatcher anyOf(@InterfaceC6399 MethodMatcher... matchers) {
        C5499.m17103(matchers, "matchers");
        anyOf(C3404.m7069(matchers));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final /* synthetic */ MethodMatcher callerMethods(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        MethodsMatcher methodsMatcher = new MethodsMatcher();
        init.invoke(methodsMatcher);
        callerMethods(methodsMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5573
    public final MethodMatcher declaredClass(@InterfaceC6399 String str, @InterfaceC6399 StringMatchType stringMatchType) {
        C5499.m17103(str, "className");
        C5499.m17103(stringMatchType, "matchType");
        return declaredClass$default(this, str, stringMatchType, false, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final /* synthetic */ MethodMatcher invokeMethods(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        MethodsMatcher methodsMatcher = new MethodsMatcher();
        init.invoke(methodsMatcher);
        invokeMethods(methodsMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    public final MethodMatcher modifiers(@InterfaceC6399 AccessFlagsMatcher modifiers) {
        C5499.m17103(modifiers, "modifiers");
        this.modifiersMatcher = modifiers;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5573
    public final MethodMatcher name(@InterfaceC6399 String str, @InterfaceC6399 StringMatchType stringMatchType) {
        C5499.m17103(str, "name");
        C5499.m17103(stringMatchType, "matchType");
        return name$default(this, str, stringMatchType, false, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    public final MethodMatcher noneOf(@InterfaceC6399 MethodMatcher... matchers) {
        C5499.m17103(matchers, "matchers");
        noneOf(C3404.m7069(matchers));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final /* synthetic */ MethodMatcher not(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        MethodMatcher methodMatcher = new MethodMatcher();
        init.invoke(methodMatcher);
        not(methodMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5573
    public final MethodMatcher opCodes(@InterfaceC6399 Collection<Integer> collection, @InterfaceC6399 OpCodeMatchType opCodeMatchType) {
        C5499.m17103(collection, "opCodes");
        C5499.m17103(opCodeMatchType, "matchType");
        return opCodes$default(this, collection, opCodeMatchType, null, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5573
    public final MethodMatcher opNames(@InterfaceC6399 Collection<String> collection, @InterfaceC6399 OpCodeMatchType opCodeMatchType) {
        C5499.m17103(collection, "opNames");
        C5499.m17103(opCodeMatchType, "matchType");
        return opNames$default(this, collection, opCodeMatchType, null, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final /* synthetic */ MethodMatcher params(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        ParametersMatcher parametersMatcher = new ParametersMatcher();
        init.invoke(parametersMatcher);
        params(parametersMatcher);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5573
    public final MethodMatcher returnType(@InterfaceC6399 String str, @InterfaceC6399 StringMatchType stringMatchType) {
        C5499.m17103(str, "typeName");
        C5499.m17103(stringMatchType, "matchType");
        return returnType$default(this, str, stringMatchType, false, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final /* synthetic */ MethodMatcher usingFields(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        UsingFieldMatcherList usingFieldMatcherList = new UsingFieldMatcherList();
        init.invoke(usingFieldMatcherList);
        usingFields(usingFieldMatcherList);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final /* synthetic */ MethodMatcher usingNumbers(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        NumberEncodeValueMatcherList numberEncodeValueMatcherList = new NumberEncodeValueMatcherList();
        init.invoke(numberEncodeValueMatcherList);
        usingNumbers(numberEncodeValueMatcherList);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5573
    public final MethodMatcher usingStrings(@InterfaceC6399 Collection<String> collection, @InterfaceC6399 StringMatchType stringMatchType) {
        C5499.m17103(collection, "usingStrings");
        C5499.m17103(stringMatchType, "matchType");
        return usingStrings$default(this, collection, stringMatchType, false, 4, null);
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final MethodMatcher create(@InterfaceC6399 Constructor<?> constructor) {
        return INSTANCE.create(constructor);
    }

    public final /* synthetic */ MethodMatcher addAllOf(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        MethodMatcher methodMatcher = new MethodMatcher();
        init.invoke(methodMatcher);
        addAllOf(methodMatcher);
        return this;
    }

    public final /* synthetic */ MethodMatcher addAnnotation(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        AnnotationMatcher annotationMatcher = new AnnotationMatcher();
        init.invoke(annotationMatcher);
        addAnnotation(annotationMatcher);
        return this;
    }

    public final /* synthetic */ MethodMatcher addAnyOf(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        MethodMatcher methodMatcher = new MethodMatcher();
        init.invoke(methodMatcher);
        addAnyOf(methodMatcher);
        return this;
    }

    @InterfaceC6399
    public final MethodMatcher addCaller(@InterfaceC6399 String methodDescriptor) {
        C5499.m17103(methodDescriptor, "methodDescriptor");
        MethodsMatcher methodsMatcher = this.callerMethodsMatcher;
        if (methodsMatcher == null) {
            methodsMatcher = new MethodsMatcher();
        }
        this.callerMethodsMatcher = methodsMatcher;
        C5499.m17100(methodsMatcher);
        methodsMatcher.add(new MethodMatcher(methodDescriptor));
        return this;
    }

    @InterfaceC6399
    public final MethodMatcher addInvoke(@InterfaceC6399 String methodDescriptor) {
        C5499.m17103(methodDescriptor, "methodDescriptor");
        MethodsMatcher methodsMatcher = this.invokeMethodsMatcher;
        if (methodsMatcher == null) {
            methodsMatcher = new MethodsMatcher();
        }
        this.invokeMethodsMatcher = methodsMatcher;
        C5499.m17100(methodsMatcher);
        methodsMatcher.add(new MethodMatcher(methodDescriptor));
        return this;
    }

    public final /* synthetic */ MethodMatcher addNoneOf(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        MethodMatcher methodMatcher = new MethodMatcher();
        init.invoke(methodMatcher);
        addNoneOf(methodMatcher);
        return this;
    }

    @InterfaceC6399
    @InterfaceC5573
    public final MethodMatcher addParamType(@InterfaceC6489 String paramType, @InterfaceC6399 StringMatchType matchType, boolean ignoreCase) {
        C5499.m17103(matchType, "matchType");
        ParametersMatcher parametersMatcher = this.paramsMatcher;
        if (parametersMatcher == null) {
            parametersMatcher = new ParametersMatcher();
        }
        this.paramsMatcher = parametersMatcher;
        C5499.m17100(parametersMatcher);
        parametersMatcher.add(paramType != null ? new ParameterMatcher().type(paramType, matchType, ignoreCase) : null);
        return this;
    }

    @InterfaceC6399
    public final MethodMatcher addUsingField(@InterfaceC6399 UsingFieldMatcher usingField) {
        C5499.m17103(usingField, "usingField");
        List<UsingFieldMatcher> arrayList = this.usingFieldsMatcher;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.usingFieldsMatcher = arrayList;
        C5499.m17100(arrayList);
        arrayList.add(usingField);
        return this;
    }

    @InterfaceC6399
    public final MethodMatcher addUsingString(@InterfaceC6399 StringMatcher usingString) {
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

    public final /* synthetic */ MethodMatcher allOf(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        MethodMatcherList methodMatcherList = new MethodMatcherList();
        init.invoke(methodMatcherList);
        allOf(methodMatcherList);
        return this;
    }

    @InterfaceC6399
    public final MethodMatcher annotationCount(@InterfaceC6399 IntRange range) {
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

    public final /* synthetic */ MethodMatcher anyOf(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        MethodMatcherList methodMatcherList = new MethodMatcherList();
        init.invoke(methodMatcherList);
        anyOf(methodMatcherList);
        return this;
    }

    @InterfaceC6399
    public final MethodMatcher declaredClass(@InterfaceC6399 ClassMatcher declaredClass) {
        C5499.m17103(declaredClass, "declaredClass");
        this.classMatcher = declaredClass;
        return this;
    }

    @InterfaceC6399
    @InterfaceC5573
    public final MethodMatcher modifiers(int modifiers, @InterfaceC6399 MatchType matchType) {
        C5499.m17103(matchType, "matchType");
        this.modifiersMatcher = new AccessFlagsMatcher(modifiers, matchType);
        return this;
    }

    @InterfaceC6399
    public final MethodMatcher name(@InterfaceC6399 StringMatcher name) {
        C5499.m17103(name, "name");
        this.nameMatcher = name;
        return this;
    }

    public final /* synthetic */ MethodMatcher noneOf(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        MethodMatcherList methodMatcherList = new MethodMatcherList();
        init.invoke(methodMatcherList);
        noneOf(methodMatcherList);
        return this;
    }

    @InterfaceC6399
    public final MethodMatcher opCodes(@InterfaceC6399 OpCodesMatcher opCodes) {
        C5499.m17103(opCodes, "opCodes");
        this.opCodesMatcher = opCodes;
        return this;
    }

    @InterfaceC6399
    @InterfaceC5573
    public final MethodMatcher opNames(@InterfaceC6399 Collection<String> opNames, @InterfaceC6399 OpCodeMatchType matchType, @InterfaceC6489 IntRange opCodeSize) {
        C5499.m17103(opNames, "opNames");
        C5499.m17103(matchType, "matchType");
        this.opCodesMatcher = OpCodesMatcher.INSTANCE.createForOpNames(opNames, matchType, opCodeSize);
        return this;
    }

    @InterfaceC6399
    public final MethodMatcher paramCount(@InterfaceC6399 IntRange range) {
        C5499.m17103(range, "range");
        if (this.paramsMatcher == null) {
            this.paramsMatcher = new ParametersMatcher();
            C8107 c8107 = C8107.f3222;
        }
        ParametersMatcher parametersMatcher = this.paramsMatcher;
        C5499.m17100(parametersMatcher);
        parametersMatcher.count(range);
        return this;
    }

    @InterfaceC6399
    public final MethodMatcher returnType(@InterfaceC6399 ClassMatcher type) {
        C5499.m17103(type, "type");
        this.returnTypeMatcher = type;
        return this;
    }

    @InterfaceC6399
    public final MethodMatcher usingNumbers(@InterfaceC6399 Collection<? extends Number> usingNumbers) {
        C5499.m17103(usingNumbers, "usingNumbers");
        ArrayList arrayList = new ArrayList(C3881.m10756(usingNumbers, 10));
        Iterator<T> it = usingNumbers.iterator();
        while (it.hasNext()) {
            arrayList.add(new NumberEncodeValueMatcher().value((Number) it.next()));
        }
        this.usingNumbersMatcher = C3888.m11065(arrayList);
        return this;
    }

    @InterfaceC6399
    public final MethodMatcher usingStrings(@InterfaceC6399 StringMatcherList usingStrings) {
        C5499.m17103(usingStrings, "usingStrings");
        this.usingStringsMatcher = usingStrings;
        return this;
    }

    public MethodMatcher(@InterfaceC6399 Constructor<?> constructor) {
        C5499.m17103(constructor, "constructor");
        descriptor(DexSignUtil.getDescriptor(constructor));
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final MethodMatcher create(@InterfaceC6399 Method method) {
        return INSTANCE.create(method);
    }

    @InterfaceC6399
    public final MethodMatcher declaredClass(@InterfaceC6399 Class<?> clazz) {
        C5499.m17103(clazz, "clazz");
        this.classMatcher = ClassMatcher.className$default(new ClassMatcher(), DexSignUtil.getTypeName(clazz), null, false, 6, null);
        return this;
    }

    @InterfaceC6399
    @InterfaceC5573
    public final MethodMatcher name(@InterfaceC6399 String name, @InterfaceC6399 StringMatchType matchType, boolean ignoreCase) {
        C5499.m17103(name, "name");
        C5499.m17103(matchType, "matchType");
        this.nameMatcher = new StringMatcher(name, matchType, ignoreCase);
        return this;
    }

    @InterfaceC6399
    @InterfaceC5573
    public final MethodMatcher opCodes(@InterfaceC6399 Collection<Integer> opCodes, @InterfaceC6399 OpCodeMatchType matchType, @InterfaceC6489 IntRange opCodeSize) {
        C5499.m17103(opCodes, "opCodes");
        C5499.m17103(matchType, "matchType");
        this.opCodesMatcher = new OpCodesMatcher(opCodes, matchType, opCodeSize);
        return this;
    }

    @InterfaceC6399
    public final MethodMatcher returnType(@InterfaceC6399 Class<?> clazz) {
        C5499.m17103(clazz, "clazz");
        this.returnTypeMatcher = ClassMatcher.className$default(new ClassMatcher(), DexSignUtil.getTypeName(clazz), null, false, 6, null);
        return this;
    }

    public final /* synthetic */ MethodMatcher usingStrings(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        StringMatcherList stringMatcherList = new StringMatcherList();
        init.invoke(stringMatcherList);
        usingStrings(stringMatcherList);
        return this;
    }

    public final /* synthetic */ MethodMatcher addCaller(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        MethodMatcher methodMatcher = new MethodMatcher();
        init.invoke(methodMatcher);
        addCaller(methodMatcher);
        return this;
    }

    public final /* synthetic */ MethodMatcher addInvoke(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        MethodMatcher methodMatcher = new MethodMatcher();
        init.invoke(methodMatcher);
        addInvoke(methodMatcher);
        return this;
    }

    @InterfaceC6399
    public final MethodMatcher addParamType(@InterfaceC6489 Class<?> paramType) {
        ParametersMatcher parametersMatcher = this.paramsMatcher;
        if (parametersMatcher == null) {
            parametersMatcher = new ParametersMatcher();
        }
        this.paramsMatcher = parametersMatcher;
        C5499.m17100(parametersMatcher);
        parametersMatcher.add(paramType != null ? new ParameterMatcher().type(paramType) : null);
        return this;
    }

    @InterfaceC6399
    @InterfaceC5573
    public final MethodMatcher addUsingField(@InterfaceC6399 FieldMatcher usingField, @InterfaceC6399 UsingType usingType) {
        C5499.m17103(usingField, "usingField");
        C5499.m17103(usingType, "usingType");
        List<UsingFieldMatcher> arrayList = this.usingFieldsMatcher;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.usingFieldsMatcher = arrayList;
        C5499.m17100(arrayList);
        UsingFieldMatcher usingFieldMatcher = new UsingFieldMatcher();
        usingFieldMatcher.field(usingField);
        usingFieldMatcher.usingType(usingType);
        arrayList.add(usingFieldMatcher);
        return this;
    }

    @InterfaceC6399
    @InterfaceC5573
    public final MethodMatcher addUsingString(@InterfaceC6399 String usingString, @InterfaceC6399 StringMatchType matchType, boolean ignoreCase) {
        C5499.m17103(usingString, "usingString");
        C5499.m17103(matchType, "matchType");
        List<StringMatcher> arrayList = this.usingStringsMatcher;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.usingStringsMatcher = arrayList;
        C5499.m17100(arrayList);
        arrayList.add(new StringMatcher(usingString, matchType, ignoreCase));
        return this;
    }

    @InterfaceC6399
    public final MethodMatcher annotationCount(@InterfaceC6399 C5458 range) {
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
    public final MethodMatcher declaredClass(@InterfaceC6399 String className, @InterfaceC6399 StringMatchType matchType, boolean ignoreCase) {
        C5499.m17103(className, "className");
        C5499.m17103(matchType, "matchType");
        this.classMatcher = new ClassMatcher().className(className, matchType, ignoreCase);
        return this;
    }

    @InterfaceC6399
    public final MethodMatcher paramCount(@InterfaceC6399 C5458 range) {
        C5499.m17103(range, "range");
        if (this.paramsMatcher == null) {
            this.paramsMatcher = new ParametersMatcher();
            C8107 c8107 = C8107.f3222;
        }
        ParametersMatcher parametersMatcher = this.paramsMatcher;
        C5499.m17100(parametersMatcher);
        parametersMatcher.count(range);
        return this;
    }

    @InterfaceC6399
    @InterfaceC5573
    public final MethodMatcher returnType(@InterfaceC6399 String typeName, @InterfaceC6399 StringMatchType matchType, boolean ignoreCase) {
        C5499.m17103(typeName, "typeName");
        C5499.m17103(matchType, "matchType");
        this.returnTypeMatcher = new ClassMatcher().className(typeName, matchType, ignoreCase);
        return this;
    }

    @InterfaceC6399
    @InterfaceC5573
    public final MethodMatcher usingStrings(@InterfaceC6399 Collection<String> usingStrings, @InterfaceC6399 StringMatchType matchType, boolean ignoreCase) {
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

    public MethodMatcher(@InterfaceC6399 String str) {
        C5499.m17103(str, "descriptor");
        descriptor(str);
    }

    public final /* synthetic */ MethodMatcher declaredClass(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        ClassMatcher classMatcher = new ClassMatcher();
        init.invoke(classMatcher);
        declaredClass(classMatcher);
        return this;
    }

    @InterfaceC6399
    public final MethodMatcher paramTypes() {
        ParametersMatcher parametersMatcher = new ParametersMatcher();
        parametersMatcher.params(C3880.m10735());
        this.paramsMatcher = parametersMatcher;
        return this;
    }

    public final /* synthetic */ MethodMatcher returnType(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        ClassMatcher classMatcher = new ClassMatcher();
        init.invoke(classMatcher);
        returnType(classMatcher);
        return this;
    }

    @InterfaceC6399
    public final MethodMatcher addParamType(@InterfaceC6489 ClassMatcher type) {
        ParametersMatcher parametersMatcher = this.paramsMatcher;
        if (parametersMatcher == null) {
            parametersMatcher = new ParametersMatcher();
        }
        this.paramsMatcher = parametersMatcher;
        C5499.m17100(parametersMatcher);
        parametersMatcher.add(type != null ? new ParameterMatcher().type(type) : null);
        return this;
    }

    @InterfaceC6399
    public final MethodMatcher annotationCount(int min, int max) {
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
    public final MethodMatcher paramCount(int min, int max) {
        if (this.paramsMatcher == null) {
            this.paramsMatcher = new ParametersMatcher();
            C8107 c8107 = C8107.f3222;
        }
        ParametersMatcher parametersMatcher = this.paramsMatcher;
        C5499.m17100(parametersMatcher);
        parametersMatcher.count(min, max);
        return this;
    }

    @InterfaceC6399
    public final MethodMatcher usingEqStrings(@InterfaceC6399 String... usingStrings) {
        C5499.m17103(usingStrings, "usingStrings");
        ArrayList arrayList = new ArrayList(usingStrings.length);
        for (String str : usingStrings) {
            arrayList.add(new StringMatcher(str, StringMatchType.Equals, false));
        }
        this.usingStringsMatcher = C3888.m11065(arrayList);
        return this;
    }

    public final /* synthetic */ MethodMatcher addParamType(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        ClassMatcher classMatcher = new ClassMatcher();
        init.invoke(classMatcher);
        addParamType(classMatcher);
        return this;
    }

    @InterfaceC6399
    public final MethodMatcher paramTypes(@InterfaceC6399 String... paramTypes) {
        C5499.m17103(paramTypes, "paramTypes");
        ParametersMatcher parametersMatcher = new ParametersMatcher();
        parametersMatcher.params(C3880.m10735());
        int length = paramTypes.length;
        for (int i = 0; i < length; i++) {
            String str = paramTypes[i];
            parametersMatcher.add(str != null ? ParameterMatcher.type$default(new ParameterMatcher(), str, null, false, 6, null) : null);
        }
        this.paramsMatcher = parametersMatcher;
        return this;
    }

    @InterfaceC6399
    public final MethodMatcher usingNumbers(@InterfaceC6399 Number... usingNumbers) {
        C5499.m17103(usingNumbers, "usingNumbers");
        ArrayList arrayList = new ArrayList(usingNumbers.length);
        for (Number number : usingNumbers) {
            arrayList.add(new NumberEncodeValueMatcher().value(number));
        }
        this.usingNumbersMatcher = C3888.m11065(arrayList);
        return this;
    }

    @InterfaceC6399
    @InterfaceC5573
    public final MethodMatcher addUsingField(@InterfaceC6399 String fieldDescriptor, @InterfaceC6399 UsingType usingType) {
        C5499.m17103(fieldDescriptor, "fieldDescriptor");
        C5499.m17103(usingType, "usingType");
        List<UsingFieldMatcher> arrayList = this.usingFieldsMatcher;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.usingFieldsMatcher = arrayList;
        C5499.m17100(arrayList);
        UsingFieldMatcher usingFieldMatcher = new UsingFieldMatcher();
        usingFieldMatcher.field(new FieldMatcher(fieldDescriptor));
        usingFieldMatcher.usingType(usingType);
        arrayList.add(usingFieldMatcher);
        return this;
    }

    @InterfaceC6399
    public final MethodMatcher usingStrings(@InterfaceC6399 String... usingStrings) {
        C5499.m17103(usingStrings, "usingStrings");
        ArrayList arrayList = new ArrayList(usingStrings.length);
        for (String str : usingStrings) {
            arrayList.add(new StringMatcher(str, null, false, 6, null));
        }
        this.usingStringsMatcher = C3888.m11065(arrayList);
        return this;
    }

    @InterfaceC6399
    public final MethodMatcher paramTypes(@InterfaceC6399 Class<?>... paramTypes) {
        C5499.m17103(paramTypes, "paramTypes");
        ParametersMatcher parametersMatcher = new ParametersMatcher();
        parametersMatcher.params(C3880.m10735());
        int length = paramTypes.length;
        for (int i = 0; i < length; i++) {
            Class<?> cls = paramTypes[i];
            parametersMatcher.add(cls != null ? new ParameterMatcher().type(cls) : null);
        }
        this.paramsMatcher = parametersMatcher;
        return this;
    }

    public final /* synthetic */ MethodMatcher addUsingField(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        UsingFieldMatcher usingFieldMatcher = new UsingFieldMatcher();
        init.invoke(usingFieldMatcher);
        addUsingField(usingFieldMatcher);
        return this;
    }
}
