package org.luckypray.dexkit.query.matchers;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nMethodMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MethodMatcher.kt\norg/luckypray/dexkit/query/matchers/MethodMatcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1501:1\n1849#2:1502\n1850#2:1504\n1547#2:1509\n1618#2,3:1510\n1547#2:1517\n1618#2,3:1518\n1547#2:1525\n1618#2,3:1526\n1547#2:1533\n1618#2,3:1534\n1547#2:1537\n1618#2,3:1538\n1547#2:1541\n1618#2,3:1542\n1547#2:1545\n1618#2,3:1546\n1547#2:1549\n1618#2,3:1550\n1547#2:1553\n1618#2,3:1554\n1547#2:1557\n1618#2,3:1558\n1#3:1503\n13536#4,2:1505\n13536#4,2:1507\n11328#4:1513\n11663#4,3:1514\n11328#4:1521\n11663#4,3:1522\n11328#4:1529\n11663#4,3:1530\n*S KotlinDebug\n*F\n+ 1 MethodMatcher.kt\norg/luckypray/dexkit/query/matchers/MethodMatcher\n*L\n533#1:1502\n533#1:1504\n878#1:1509\n878#1:1510,3\n906#1:1517\n906#1:1518,3\n1067#1:1525\n1067#1:1526,3\n1479#1:1533\n1479#1:1534,3\n1481#1:1537\n1481#1:1538,3\n1483#1:1541\n1483#1:1542,3\n1485#1:1545\n1485#1:1546,3\n1490#1:1549\n1490#1:1550,3\n1492#1:1553\n1492#1:1554,3\n1494#1:1557\n1494#1:1558,3\n566#1:1505,2\n586#1:1507,2\n894#1:1513\n894#1:1514,3\n918#1:1521\n918#1:1522,3\n1082#1:1529\n1082#1:1530,3\n*E\n"})
@kotlin.Metadata(d1 = {"\u0000\u008c\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b-\u0018\u0000 Û\u00012\u00020\u00012\u00020\u0002:\u0002Û\u0001B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007B\u0015\b\u0016\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\u0003\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0003\u0010\rJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0010\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u001a2\b\b\u0002\u0010\u0013\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u0018\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\u001e\u001a\u00020\u00002\n\u0010!\u001a\u0006\u0012\u0002\b\u00030 ¢\u0006\u0004\b\u001e\u0010\"J+\u0010\u001e\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u001e\u0010\u0016J\u0015\u0010%\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u000b¢\u0006\u0004\b%\u0010\u000eJ\u0015\u0010'\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u001d¢\u0006\u0004\b'\u0010\u001fJ\u0019\u0010'\u001a\u00020\u00002\n\u0010!\u001a\u0006\u0012\u0002\b\u00030 ¢\u0006\u0004\b'\u0010\"J+\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b'\u0010\u0016J\u0015\u0010*\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b*\u0010+J\u001d\u0010-\u001a\u00020\u00002\u000e\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0,¢\u0006\u0004\b-\u0010.J\r\u0010-\u001a\u00020\u0000¢\u0006\u0004\b-\u0010/J%\u0010-\u001a\u00020\u00002\u0016\u0010-\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b00\"\u0004\u0018\u00010\u000b¢\u0006\u0004\b-\u00101J-\u0010-\u001a\u00020\u00002\u001e\u0010-\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0002\b\u0003\u0018\u00010 00\"\b\u0012\u0002\b\u0003\u0018\u00010 ¢\u0006\u0004\b-\u00102J-\u00104\u001a\u00020\u00002\b\u00103\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b4\u0010\u0016J\u001b\u00104\u001a\u00020\u00002\f\u00103\u001a\b\u0012\u0002\b\u0003\u0018\u00010 ¢\u0006\u0004\b4\u0010\"J\u0017\u00104\u001a\u00020\u00002\b\u0010&\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b4\u0010\u001fJ\u0015\u00106\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u001a¢\u0006\u0004\b6\u00107J\u0015\u00106\u001a\u00020\u00002\u0006\u00109\u001a\u000208¢\u0006\u0004\b6\u0010:J\u0015\u00106\u001a\u00020\u00002\u0006\u00109\u001a\u00020;¢\u0006\u0004\b6\u0010<J!\u00106\u001a\u00020\u00002\b\b\u0002\u0010=\u001a\u00020\u001a2\b\b\u0002\u0010>\u001a\u00020\u001a¢\u0006\u0004\b6\u0010?J\u0015\u0010A\u001a\u00020\u00002\u0006\u0010A\u001a\u00020@¢\u0006\u0004\bA\u0010BJ\u0015\u0010E\u001a\u00020\u00002\u0006\u0010D\u001a\u00020C¢\u0006\u0004\bE\u0010FJ\u0015\u0010G\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u001a¢\u0006\u0004\bG\u00107J\u0015\u0010G\u001a\u00020\u00002\u0006\u00109\u001a\u000208¢\u0006\u0004\bG\u0010:J\u0015\u0010G\u001a\u00020\u00002\u0006\u00109\u001a\u00020;¢\u0006\u0004\bG\u0010<J!\u0010G\u001a\u00020\u00002\b\b\u0002\u0010=\u001a\u00020\u001a2\b\b\u0002\u0010>\u001a\u00020\u001a¢\u0006\u0004\bG\u0010?J\u0015\u0010I\u001a\u00020\u00002\u0006\u0010I\u001a\u00020H¢\u0006\u0004\bI\u0010JJ3\u0010I\u001a\u00020\u00002\f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u001a0,2\b\b\u0002\u0010\u0013\u001a\u00020K2\n\b\u0002\u0010L\u001a\u0004\u0018\u000108H\u0007¢\u0006\u0004\bI\u0010MJ3\u0010N\u001a\u00020\u00002\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u000b0,2\b\b\u0002\u0010\u0013\u001a\u00020K2\n\b\u0002\u0010L\u001a\u0004\u0018\u000108H\u0007¢\u0006\u0004\bN\u0010MJ\u0015\u0010P\u001a\u00020\u00002\u0006\u0010P\u001a\u00020O¢\u0006\u0004\bP\u0010QJ1\u0010P\u001a\u00020\u00002\f\u0010P\u001a\b\u0012\u0004\u0012\u00020\u000b0,2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\bP\u0010RJ!\u0010P\u001a\u00020\u00002\u0012\u0010P\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b00\"\u00020\u000b¢\u0006\u0004\bP\u00101J\u001b\u0010S\u001a\u00020\u00002\f\u0010P\u001a\b\u0012\u0004\u0012\u00020\u000b0,¢\u0006\u0004\bS\u0010.J!\u0010S\u001a\u00020\u00002\u0012\u0010P\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b00\"\u00020\u000b¢\u0006\u0004\bS\u00101J\u0015\u0010U\u001a\u00020\u00002\u0006\u0010T\u001a\u00020\u000f¢\u0006\u0004\bU\u0010\u0011J+\u0010U\u001a\u00020\u00002\u0006\u0010T\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\bU\u0010\u0016J\u0015\u0010V\u001a\u00020\u00002\u0006\u0010T\u001a\u00020\u000b¢\u0006\u0004\bV\u0010\u000eJ\u001b\u0010X\u001a\u00020\u00002\f\u0010X\u001a\b\u0012\u0004\u0012\u00020W0,¢\u0006\u0004\bX\u0010.J\u0015\u0010Z\u001a\u00020\u00002\u0006\u0010Y\u001a\u00020W¢\u0006\u0004\bZ\u0010[J!\u0010Z\u001a\u00020\u00002\u0006\u0010Y\u001a\u00020\\2\b\b\u0002\u0010^\u001a\u00020]H\u0007¢\u0006\u0004\bZ\u0010_J!\u0010Z\u001a\u00020\u00002\u0006\u0010`\u001a\u00020\u000b2\b\b\u0002\u0010^\u001a\u00020]H\u0007¢\u0006\u0004\bZ\u0010aJ\u0015\u0010c\u001a\u00020\u00002\u0006\u0010c\u001a\u00020b¢\u0006\u0004\bc\u0010dJ\u001b\u0010c\u001a\u00020\u00002\f\u0010c\u001a\b\u0012\u0004\u0012\u00020e0,¢\u0006\u0004\bc\u0010.J!\u0010c\u001a\u00020\u00002\u0012\u0010c\u001a\n\u0012\u0006\b\u0001\u0012\u00020e00\"\u00020e¢\u0006\u0004\bc\u0010fJ\u0015\u0010h\u001a\u00020\u00002\u0006\u0010g\u001a\u00020e¢\u0006\u0004\bh\u0010iJ\u0015\u0010k\u001a\u00020\u00002\u0006\u0010k\u001a\u00020j¢\u0006\u0004\bk\u0010lJ\u0015\u0010n\u001a\u00020\u00002\u0006\u0010m\u001a\u00020\u0000¢\u0006\u0004\bn\u0010oJ\u0015\u0010n\u001a\u00020\u00002\u0006\u0010p\u001a\u00020\u000b¢\u0006\u0004\bn\u0010\u000eJ\u0015\u0010q\u001a\u00020\u00002\u0006\u0010q\u001a\u00020j¢\u0006\u0004\bq\u0010lJ\u0015\u0010s\u001a\u00020\u00002\u0006\u0010r\u001a\u00020\u0000¢\u0006\u0004\bs\u0010oJ\u0015\u0010s\u001a\u00020\u00002\u0006\u0010p\u001a\u00020\u000b¢\u0006\u0004\bs\u0010\u000eJ\u001b\u0010u\u001a\u00020\u00002\f\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00000,¢\u0006\u0004\bu\u0010.J!\u0010u\u001a\u00020\u00002\u0012\u0010t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000000\"\u00020\u0000¢\u0006\u0004\bu\u0010vJ\u0015\u0010x\u001a\u00020\u00002\u0006\u0010w\u001a\u00020\u0000¢\u0006\u0004\bx\u0010oJ\u001b\u0010y\u001a\u00020\u00002\f\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00000,¢\u0006\u0004\by\u0010.J!\u0010y\u001a\u00020\u00002\u0012\u0010t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000000\"\u00020\u0000¢\u0006\u0004\by\u0010vJ\u0015\u0010z\u001a\u00020\u00002\u0006\u0010w\u001a\u00020\u0000¢\u0006\u0004\bz\u0010oJ\u001b\u0010{\u001a\u00020\u00002\f\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00000,¢\u0006\u0004\b{\u0010.J!\u0010{\u001a\u00020\u00002\u0012\u0010t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000000\"\u00020\u0000¢\u0006\u0004\b{\u0010vJ\u0015\u0010|\u001a\u00020\u00002\u0006\u0010w\u001a\u00020\u0000¢\u0006\u0004\b|\u0010oJ\u0015\u0010}\u001a\u00020\u00002\u0006\u0010w\u001a\u00020\u0000¢\u0006\u0004\b}\u0010oJ)\u0010\u001e\u001a\u00020\u00002\u0019\u0010\u0081\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u007f0~¢\u0006\u0003\b\u0080\u0001¢\u0006\u0005\b\u001e\u0010\u0082\u0001J)\u0010'\u001a\u00020\u00002\u0019\u0010\u0081\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u007f0~¢\u0006\u0003\b\u0080\u0001¢\u0006\u0005\b'\u0010\u0082\u0001J)\u0010*\u001a\u00020\u00002\u0019\u0010\u0081\u0001\u001a\u0014\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u007f0~¢\u0006\u0003\b\u0080\u0001¢\u0006\u0005\b*\u0010\u0082\u0001J)\u00104\u001a\u00020\u00002\u0019\u0010\u0081\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u007f0~¢\u0006\u0003\b\u0080\u0001¢\u0006\u0005\b4\u0010\u0082\u0001J)\u0010A\u001a\u00020\u00002\u0019\u0010\u0081\u0001\u001a\u0014\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u007f0~¢\u0006\u0003\b\u0080\u0001¢\u0006\u0005\bA\u0010\u0082\u0001J)\u0010E\u001a\u00020\u00002\u0019\u0010\u0081\u0001\u001a\u0014\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u007f0~¢\u0006\u0003\b\u0080\u0001¢\u0006\u0005\bE\u0010\u0082\u0001J)\u0010P\u001a\u00020\u00002\u0019\u0010\u0081\u0001\u001a\u0014\u0012\u0004\u0012\u00020O\u0012\u0004\u0012\u00020\u007f0~¢\u0006\u0003\b\u0080\u0001¢\u0006\u0005\bP\u0010\u0082\u0001J*\u0010X\u001a\u00020\u00002\u001a\u0010\u0081\u0001\u001a\u0015\u0012\u0005\u0012\u00030\u0083\u0001\u0012\u0004\u0012\u00020\u007f0~¢\u0006\u0003\b\u0080\u0001¢\u0006\u0005\bX\u0010\u0082\u0001J)\u0010Z\u001a\u00020\u00002\u0019\u0010\u0081\u0001\u001a\u0014\u0012\u0004\u0012\u00020W\u0012\u0004\u0012\u00020\u007f0~¢\u0006\u0003\b\u0080\u0001¢\u0006\u0005\bZ\u0010\u0082\u0001J)\u0010c\u001a\u00020\u00002\u0019\u0010\u0081\u0001\u001a\u0014\u0012\u0004\u0012\u00020b\u0012\u0004\u0012\u00020\u007f0~¢\u0006\u0003\b\u0080\u0001¢\u0006\u0005\bc\u0010\u0082\u0001J)\u0010k\u001a\u00020\u00002\u0019\u0010\u0081\u0001\u001a\u0014\u0012\u0004\u0012\u00020j\u0012\u0004\u0012\u00020\u007f0~¢\u0006\u0003\b\u0080\u0001¢\u0006\u0005\bk\u0010\u0082\u0001J)\u0010n\u001a\u00020\u00002\u0019\u0010\u0081\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u007f0~¢\u0006\u0003\b\u0080\u0001¢\u0006\u0005\bn\u0010\u0082\u0001J)\u0010q\u001a\u00020\u00002\u0019\u0010\u0081\u0001\u001a\u0014\u0012\u0004\u0012\u00020j\u0012\u0004\u0012\u00020\u007f0~¢\u0006\u0003\b\u0080\u0001¢\u0006\u0005\bq\u0010\u0082\u0001J)\u0010s\u001a\u00020\u00002\u0019\u0010\u0081\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u007f0~¢\u0006\u0003\b\u0080\u0001¢\u0006\u0005\bs\u0010\u0082\u0001J*\u0010u\u001a\u00020\u00002\u001a\u0010\u0081\u0001\u001a\u0015\u0012\u0005\u0012\u00030\u0084\u0001\u0012\u0004\u0012\u00020\u007f0~¢\u0006\u0003\b\u0080\u0001¢\u0006\u0005\bu\u0010\u0082\u0001J)\u0010x\u001a\u00020\u00002\u0019\u0010\u0081\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u007f0~¢\u0006\u0003\b\u0080\u0001¢\u0006\u0005\bx\u0010\u0082\u0001J*\u0010y\u001a\u00020\u00002\u001a\u0010\u0081\u0001\u001a\u0015\u0012\u0005\u0012\u00030\u0084\u0001\u0012\u0004\u0012\u00020\u007f0~¢\u0006\u0003\b\u0080\u0001¢\u0006\u0005\by\u0010\u0082\u0001J)\u0010z\u001a\u00020\u00002\u0019\u0010\u0081\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u007f0~¢\u0006\u0003\b\u0080\u0001¢\u0006\u0005\bz\u0010\u0082\u0001J*\u0010{\u001a\u00020\u00002\u001a\u0010\u0081\u0001\u001a\u0015\u0012\u0005\u0012\u00030\u0084\u0001\u0012\u0004\u0012\u00020\u007f0~¢\u0006\u0003\b\u0080\u0001¢\u0006\u0005\b{\u0010\u0082\u0001J)\u0010|\u001a\u00020\u00002\u0019\u0010\u0081\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u007f0~¢\u0006\u0003\b\u0080\u0001¢\u0006\u0005\b|\u0010\u0082\u0001J)\u0010}\u001a\u00020\u00002\u0019\u0010\u0081\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u007f0~¢\u0006\u0003\b\u0080\u0001¢\u0006\u0005\b}\u0010\u0082\u0001J\u001c\u0010\u0087\u0001\u001a\u00020\u001a2\b\u0010\u0086\u0001\u001a\u00030\u0085\u0001H\u0014¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001R.\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u000f2\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u000f8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R.\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u00172\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u00178\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R.\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u001d2\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u001d8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R.\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u000b2\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u000b8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R.\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u001d2\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u001d8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u009a\u0001\u0010\u0093\u0001\u001a\u0006\b\u009b\u0001\u0010\u0095\u0001R.\u0010\u009c\u0001\u001a\u0004\u0018\u00010)2\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010)8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R.\u0010 \u0001\u001a\u0004\u0018\u00010@2\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010@8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b \u0001\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001R.\u0010¤\u0001\u001a\u0004\u0018\u00010H2\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010H8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001R<\u0010©\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u000f\u0018\u00010¨\u00012\u0010\u0010\u0089\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u000f\u0018\u00010¨\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b©\u0001\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001R<\u0010\u00ad\u0001\u001a\u000b\u0012\u0004\u0012\u00020W\u0018\u00010¨\u00012\u0010\u0010\u0089\u0001\u001a\u000b\u0012\u0004\u0012\u00020W\u0018\u00010¨\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u00ad\u0001\u0010ª\u0001\u001a\u0006\b®\u0001\u0010¬\u0001R>\u0010°\u0001\u001a\f\u0012\u0005\u0012\u00030¯\u0001\u0018\u00010¨\u00012\u0011\u0010\u0089\u0001\u001a\f\u0012\u0005\u0012\u00030¯\u0001\u0018\u00010¨\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b°\u0001\u0010ª\u0001\u001a\u0006\b±\u0001\u0010¬\u0001R.\u0010²\u0001\u001a\u0004\u0018\u00010j2\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010j8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b²\u0001\u0010³\u0001\u001a\u0006\b´\u0001\u0010µ\u0001R.\u0010¶\u0001\u001a\u0004\u0018\u00010j2\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010j8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b¶\u0001\u0010³\u0001\u001a\u0006\b·\u0001\u0010µ\u0001R<\u0010¸\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0000\u0018\u00010¨\u00012\u0010\u0010\u0089\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0000\u0018\u00010¨\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b¸\u0001\u0010ª\u0001\u001a\u0006\b¹\u0001\u0010¬\u0001R<\u0010º\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0000\u0018\u00010¨\u00012\u0010\u0010\u0089\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0000\u0018\u00010¨\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\bº\u0001\u0010ª\u0001\u001a\u0006\b»\u0001\u0010¬\u0001R<\u0010¼\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0000\u0018\u00010¨\u00012\u0010\u0010\u0089\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0000\u0018\u00010¨\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b¼\u0001\u0010ª\u0001\u001a\u0006\b½\u0001\u0010¬\u0001R(\u0010\f\u001a\u00020\u000b2\u0007\u0010¾\u0001\u001a\u00020\u000b8G@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b¿\u0001\u0010\u0099\u0001\"\u0005\bÀ\u0001\u0010\rR(\u0010\u0010\u001a\u00020\u000b2\u0007\u0010¾\u0001\u001a\u00020\u000b8G@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\bÁ\u0001\u0010\u0099\u0001\"\u0005\bÂ\u0001\u0010\rR)\u0010\u0018\u001a\u00020\u001a2\u0007\u0010¾\u0001\u001a\u00020\u001a8G@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÃ\u0001\u0010Ä\u0001\"\u0006\bÅ\u0001\u0010Æ\u0001R(\u0010\u001e\u001a\u00020\u000b2\u0007\u0010¾\u0001\u001a\u00020\u000b8G@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\bÇ\u0001\u0010\u0099\u0001\"\u0005\bÈ\u0001\u0010\rR(\u0010%\u001a\u00020\u000b2\u0007\u0010¾\u0001\u001a\u00020\u000b8G@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\bÉ\u0001\u0010\u0099\u0001\"\u0005\bÊ\u0001\u0010\rR(\u0010'\u001a\u00020\u000b2\u0007\u0010¾\u0001\u001a\u00020\u000b8G@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\bË\u0001\u0010\u0099\u0001\"\u0005\bÌ\u0001\u0010\rR9\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0,2\u000f\u0010¾\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0,8G@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÍ\u0001\u0010Î\u0001\"\u0006\bÏ\u0001\u0010Ð\u0001R)\u00106\u001a\u00020\u001a2\u0007\u0010¾\u0001\u001a\u00020\u001a8G@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÑ\u0001\u0010Ä\u0001\"\u0006\bÒ\u0001\u0010Æ\u0001R5\u0010I\u001a\b\u0012\u0004\u0012\u00020\u001a0,2\r\u0010¾\u0001\u001a\b\u0012\u0004\u0012\u00020\u001a0,8G@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÓ\u0001\u0010Î\u0001\"\u0006\bÔ\u0001\u0010Ð\u0001R5\u0010N\u001a\b\u0012\u0004\u0012\u00020\u000b0,2\r\u0010¾\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0,8G@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÕ\u0001\u0010Î\u0001\"\u0006\bÖ\u0001\u0010Ð\u0001R5\u0010c\u001a\b\u0012\u0004\u0012\u00020e0,2\r\u0010¾\u0001\u001a\b\u0012\u0004\u0012\u00020e0,8G@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b×\u0001\u0010Î\u0001\"\u0006\bØ\u0001\u0010Ð\u0001R5\u0010P\u001a\b\u0012\u0004\u0012\u00020\u000b0,2\r\u0010¾\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0,8G@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÙ\u0001\u0010Î\u0001\"\u0006\bÚ\u0001\u0010Ð\u0001¨\u0006Ü\u0001"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "Lorg/luckypray/dexkit/query/base/BaseMatcher;", "Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;", "<init>", "()V", "Ljava/lang/reflect/Method;", "method", "(Ljava/lang/reflect/Method;)V", "Ljava/lang/reflect/Constructor;", "constructor", "(Ljava/lang/reflect/Constructor;)V", "", "descriptor", "(Ljava/lang/String;)V", "(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "name", "(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "Lorg/luckypray/dexkit/query/enums/StringMatchType;", "matchType", "", "ignoreCase", "(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;", "modifiers", "(Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "", "Lorg/luckypray/dexkit/query/enums/MatchType;", "(ILorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "declaredClass", "(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "Ljava/lang/Class;", "clazz", "(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "className", "shorty", "protoShorty", "type", "returnType", "typeName", "Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;", "params", "(Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "", "paramTypes", "(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "", "([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "([Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "paramType", "addParamType", "count", "paramCount", "(I)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "range", "(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "LYue/ۥ۠ۥۣۨ;", "(LYue/ۥ۠ۥۣۨ;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "min", "max", "(II)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;", "annotations", "(Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "annotation", "addAnnotation", "(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "annotationCount", "Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;", "opCodes", "(Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;", "opCodeSize", "(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "opNames", "Lorg/luckypray/dexkit/query/StringMatcherList;", "usingStrings", "(Lorg/luckypray/dexkit/query/StringMatcherList;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "usingEqStrings", "usingString", "addUsingString", "addEqString", "Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;", "usingFields", "usingField", "addUsingField", "(Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "Lorg/luckypray/dexkit/query/enums/UsingType;", "usingType", "(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;Lorg/luckypray/dexkit/query/enums/UsingType;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "fieldDescriptor", "(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/UsingType;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;", "usingNumbers", "(Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "", "([Ljava/lang/Number;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "usingNumber", "addUsingNumber", "(Ljava/lang/Number;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;", "invokeMethods", "(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "invokeMethod", "addInvoke", "(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "methodDescriptor", "callerMethods", "callerMethod", "addCaller", "matchers", "allOf", "([Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "matcher", "addAllOf", "anyOf", "addAnyOf", "noneOf", "addNoneOf", "not", "Lkotlin/Function1;", "LYue/ۥۣۢ۠ۤ;", "LYue/ۥ۠ۡۥۧ;", "init", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "Lorg/luckypray/dexkit/query/UsingFieldMatcherList;", "Lorg/luckypray/dexkit/query/MethodMatcherList;", "Lcom/google/flatbuffers/FlatBufferBuilder;", "fbb", "innerBuild", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "<set-?>", "nameMatcher", "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "getNameMatcher", "()Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "modifiersMatcher", "Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;", "getModifiersMatcher", "()Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;", "classMatcher", "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "getClassMatcher", "()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "protoShortyMatcher", "Ljava/lang/String;", "getProtoShortyMatcher", "()Ljava/lang/String;", "returnTypeMatcher", "getReturnTypeMatcher", "paramsMatcher", "Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;", "getParamsMatcher", "()Lorg/luckypray/dexkit/query/matchers/ParametersMatcher;", "annotationsMatcher", "Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;", "getAnnotationsMatcher", "()Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;", "opCodesMatcher", "Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;", "getOpCodesMatcher", "()Lorg/luckypray/dexkit/query/matchers/base/OpCodesMatcher;", "", "usingStringsMatcher", "Ljava/util/List;", "getUsingStringsMatcher", "()Ljava/util/List;", "usingFieldsMatcher", "getUsingFieldsMatcher", "Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;", "usingNumbersMatcher", "getUsingNumbersMatcher", "invokeMethodsMatcher", "Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;", "getInvokeMethodsMatcher", "()Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;", "callerMethodsMatcher", "getCallerMethodsMatcher", "allOfMatchers", "getAllOfMatchers", "anyOfMatchers", "getAnyOfMatchers", "noneOfMatchers", "getNoneOfMatchers", "value", "getDescriptor", "setDescriptor", "getName", "setName", "getModifiers", "()I", "setModifiers", "(I)V", "getDeclaredClass", "setDeclaredClass", "getProtoShorty", "setProtoShorty", "getReturnType", "setReturnType", "getParamTypes", "()Ljava/util/Collection;", "setParamTypes", "(Ljava/util/Collection;)V", "getParamCount", "setParamCount", "getOpCodes", "setOpCodes", "getOpNames", "setOpNames", "getUsingNumbers", "setUsingNumbers", "getUsingStrings", "setUsingStrings", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class MethodMatcher extends org.luckypray.dexkit.query.base.BaseMatcher implements org.luckypray.dexkit.query.base.IAnnotationEncodeValue {

    @Yue.InterfaceC4418
    public static final org.luckypray.dexkit.query.matchers.MethodMatcher.Companion Companion = null;

    @Yue.InterfaceC4543
    private java.util.List<org.luckypray.dexkit.query.matchers.MethodMatcher> allOfMatchers;

    @Yue.InterfaceC4543
    private org.luckypray.dexkit.query.matchers.AnnotationsMatcher annotationsMatcher;

    @Yue.InterfaceC4543
    private java.util.List<org.luckypray.dexkit.query.matchers.MethodMatcher> anyOfMatchers;

    @Yue.InterfaceC4543
    private org.luckypray.dexkit.query.matchers.MethodsMatcher callerMethodsMatcher;

    @Yue.InterfaceC4543
    private org.luckypray.dexkit.query.matchers.ClassMatcher classMatcher;

    @Yue.InterfaceC4543
    private org.luckypray.dexkit.query.matchers.MethodsMatcher invokeMethodsMatcher;

    @Yue.InterfaceC4543
    private org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher modifiersMatcher;

    @Yue.InterfaceC4543
    private org.luckypray.dexkit.query.matchers.base.StringMatcher nameMatcher;

    @Yue.InterfaceC4543
    private java.util.List<org.luckypray.dexkit.query.matchers.MethodMatcher> noneOfMatchers;

    @Yue.InterfaceC4543
    private org.luckypray.dexkit.query.matchers.base.OpCodesMatcher opCodesMatcher;

    @Yue.InterfaceC4543
    private org.luckypray.dexkit.query.matchers.ParametersMatcher paramsMatcher;

    @Yue.InterfaceC4543
    private java.lang.String protoShortyMatcher;

    @Yue.InterfaceC4543
    private org.luckypray.dexkit.query.matchers.ClassMatcher returnTypeMatcher;

    @Yue.InterfaceC4543
    private java.util.List<org.luckypray.dexkit.query.matchers.UsingFieldMatcher> usingFieldsMatcher;

    @Yue.InterfaceC4543
    private java.util.List<org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher> usingNumbersMatcher;

    @Yue.InterfaceC4543
    private java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> usingStringsMatcher;

    @Yue.InterfaceC4201(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0014\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/MethodMatcher$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "constructor", "Ljava/lang/reflect/Constructor;", "method", "Ljava/lang/reflect/Method;", "descriptor", "", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        public final org.luckypray.dexkit.query.matchers.MethodMatcher create() {
                r1 = this;
                org.luckypray.dexkit.query.matchers.MethodMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodMatcher
                r0.<init>()
                return r0
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        public final org.luckypray.dexkit.query.matchers.MethodMatcher create(@Yue.InterfaceC4418 java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "descriptor"
                Yue.C3329.m13906(r2, r0)
                org.luckypray.dexkit.query.matchers.MethodMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodMatcher
                r0.<init>(r2)
                return r0
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        public final org.luckypray.dexkit.query.matchers.MethodMatcher create(@Yue.InterfaceC4418 java.lang.reflect.Constructor<?> r2) {
                r1 = this;
                java.lang.String r0 = "constructor"
                Yue.C3329.m13906(r2, r0)
                org.luckypray.dexkit.query.matchers.MethodMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodMatcher
                r0.<init>(r2)
                return r0
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        public final org.luckypray.dexkit.query.matchers.MethodMatcher create(@Yue.InterfaceC4418 java.lang.reflect.Method r2) {
                r1 = this;
                java.lang.String r0 = "method"
                Yue.C3329.m13906(r2, r0)
                org.luckypray.dexkit.query.matchers.MethodMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodMatcher
                r0.<init>(r2)
                return r0
        }
    }

    static {
            org.luckypray.dexkit.query.matchers.MethodMatcher$Companion r0 = new org.luckypray.dexkit.query.matchers.MethodMatcher$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.query.matchers.MethodMatcher.Companion = r0
            return
    }

    public MethodMatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    public MethodMatcher(@Yue.InterfaceC4418 java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "descriptor"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.descriptor(r2)
            return
    }

    public MethodMatcher(@Yue.InterfaceC4418 java.lang.reflect.Constructor<?> r2) {
            r1 = this;
            java.lang.String r0 = "constructor"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            java.lang.String r2 = org.luckypray.dexkit.util.DexSignUtil.getDescriptor(r2)
            r1.descriptor(r2)
            return
    }

    public MethodMatcher(@Yue.InterfaceC4418 java.lang.reflect.Method r2) {
            r1 = this;
            java.lang.String r0 = "method"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            java.lang.String r2 = org.luckypray.dexkit.util.DexSignUtil.getDescriptor(r2)
            r1.descriptor(r2)
            return
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher addParamType$default(org.luckypray.dexkit.query.matchers.MethodMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = r0.addParamType(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher addUsingField$default(org.luckypray.dexkit.query.matchers.MethodMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.UsingType r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            org.luckypray.dexkit.query.enums.UsingType r2 = org.luckypray.dexkit.query.enums.UsingType.Any
        L6:
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = r0.addUsingField(r1, r2)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher addUsingField$default(org.luckypray.dexkit.query.matchers.MethodMatcher r0, org.luckypray.dexkit.query.matchers.FieldMatcher r1, org.luckypray.dexkit.query.enums.UsingType r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            org.luckypray.dexkit.query.enums.UsingType r2 = org.luckypray.dexkit.query.enums.UsingType.Any
        L6:
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = r0.addUsingField(r1, r2)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher addUsingString$default(org.luckypray.dexkit.query.matchers.MethodMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Contains
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = r0.addUsingString(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher annotationCount$default(org.luckypray.dexkit.query.matchers.MethodMatcher r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            r2 = 2147483647(0x7fffffff, float:NaN)
        Lc:
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = r0.annotationCount(r1, r2)
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.query.matchers.MethodMatcher create() {
            org.luckypray.dexkit.query.matchers.MethodMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.MethodMatcher.Companion
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = r0.create()
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.query.matchers.MethodMatcher create(@Yue.InterfaceC4418 java.lang.String r1) {
            org.luckypray.dexkit.query.matchers.MethodMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.MethodMatcher.Companion
            org.luckypray.dexkit.query.matchers.MethodMatcher r1 = r0.create(r1)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.query.matchers.MethodMatcher create(@Yue.InterfaceC4418 java.lang.reflect.Constructor<?> r1) {
            org.luckypray.dexkit.query.matchers.MethodMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.MethodMatcher.Companion
            org.luckypray.dexkit.query.matchers.MethodMatcher r1 = r0.create(r1)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.query.matchers.MethodMatcher create(@Yue.InterfaceC4418 java.lang.reflect.Method r1) {
            org.luckypray.dexkit.query.matchers.MethodMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.MethodMatcher.Companion
            org.luckypray.dexkit.query.matchers.MethodMatcher r1 = r0.create(r1)
            return r1
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher declaredClass$default(org.luckypray.dexkit.query.matchers.MethodMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = r0.declaredClass(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher modifiers$default(org.luckypray.dexkit.query.matchers.MethodMatcher r0, int r1, org.luckypray.dexkit.query.enums.MatchType r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            org.luckypray.dexkit.query.enums.MatchType r2 = org.luckypray.dexkit.query.enums.MatchType.Contains
        L6:
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = r0.modifiers(r1, r2)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher name$default(org.luckypray.dexkit.query.matchers.MethodMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = r0.name(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher opCodes$default(org.luckypray.dexkit.query.matchers.MethodMatcher r0, java.util.Collection r1, org.luckypray.dexkit.query.enums.OpCodeMatchType r2, org.luckypray.dexkit.query.matchers.base.IntRange r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.OpCodeMatchType r2 = org.luckypray.dexkit.query.enums.OpCodeMatchType.Contains
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = r0.opCodes(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher opNames$default(org.luckypray.dexkit.query.matchers.MethodMatcher r0, java.util.Collection r1, org.luckypray.dexkit.query.enums.OpCodeMatchType r2, org.luckypray.dexkit.query.matchers.base.IntRange r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.OpCodeMatchType r2 = org.luckypray.dexkit.query.enums.OpCodeMatchType.Contains
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = r0.opNames(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher paramCount$default(org.luckypray.dexkit.query.matchers.MethodMatcher r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            r2 = 2147483647(0x7fffffff, float:NaN)
        Lc:
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = r0.paramCount(r1, r2)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher returnType$default(org.luckypray.dexkit.query.matchers.MethodMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = r0.returnType(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher usingStrings$default(org.luckypray.dexkit.query.matchers.MethodMatcher r0, java.util.Collection r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Contains
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = r0.usingStrings(r1, r2, r3)
            return r0
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher addAllOf(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addAllOf(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodMatcher addAllOf(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.MethodMatcher r2) {
            r1 = this;
            java.lang.String r0 = "matcher"
            Yue.C3329.m13906(r2, r0)
            java.util.List<org.luckypray.dexkit.query.matchers.MethodMatcher> r0 = r1.allOfMatchers
            if (r0 != 0) goto Le
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Le:
            r1.allOfMatchers = r0
            Yue.C3329.m13903(r0)
            r0.add(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher addAnnotation(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.AnnotationMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addAnnotation(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodMatcher addAnnotation(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.AnnotationMatcher r2) {
            r1 = this;
            java.lang.String r0 = "annotation"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = r1.annotationsMatcher
            if (r0 != 0) goto Le
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationsMatcher
            r0.<init>()
        Le:
            r1.annotationsMatcher = r0
            Yue.C3329.m13903(r0)
            r0.add(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher addAnyOf(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addAnyOf(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodMatcher addAnyOf(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.MethodMatcher r2) {
            r1 = this;
            java.lang.String r0 = "matcher"
            Yue.C3329.m13906(r2, r0)
            java.util.List<org.luckypray.dexkit.query.matchers.MethodMatcher> r0 = r1.anyOfMatchers
            if (r0 != 0) goto Le
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Le:
            r1.anyOfMatchers = r0
            Yue.C3329.m13903(r0)
            r0.add(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher addCaller(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addCaller(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodMatcher addCaller(@Yue.InterfaceC4418 java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "methodDescriptor"
            Yue.C3329.m13906(r3, r0)
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = r2.callerMethodsMatcher
            if (r0 != 0) goto Le
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r0.<init>()
        Le:
            r2.callerMethodsMatcher = r0
            Yue.C3329.m13903(r0)
            org.luckypray.dexkit.query.matchers.MethodMatcher r1 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r1.<init>(r3)
            r0.add(r1)
            return r2
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodMatcher addCaller(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.MethodMatcher r2) {
            r1 = this;
            java.lang.String r0 = "callerMethod"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = r1.callerMethodsMatcher
            if (r0 != 0) goto Le
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r0.<init>()
        Le:
            r1.callerMethodsMatcher = r0
            Yue.C3329.m13903(r0)
            r0.add(r2)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodMatcher addEqString(@Yue.InterfaceC4418 java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "usingString"
            Yue.C3329.m13906(r5, r0)
            java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> r0 = r4.usingStringsMatcher
            if (r0 != 0) goto Le
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Le:
            r4.usingStringsMatcher = r0
            Yue.C3329.m13903(r0)
            org.luckypray.dexkit.query.matchers.base.StringMatcher r1 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
            r3 = 0
            r1.<init>(r5, r2, r3)
            r0.add(r1)
            return r4
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher addInvoke(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addInvoke(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodMatcher addInvoke(@Yue.InterfaceC4418 java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "methodDescriptor"
            Yue.C3329.m13906(r3, r0)
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = r2.invokeMethodsMatcher
            if (r0 != 0) goto Le
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r0.<init>()
        Le:
            r2.invokeMethodsMatcher = r0
            Yue.C3329.m13903(r0)
            org.luckypray.dexkit.query.matchers.MethodMatcher r1 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r1.<init>(r3)
            r0.add(r1)
            return r2
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodMatcher addInvoke(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.MethodMatcher r2) {
            r1 = this;
            java.lang.String r0 = "invokeMethod"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = r1.invokeMethodsMatcher
            if (r0 != 0) goto Le
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r0.<init>()
        Le:
            r1.invokeMethodsMatcher = r0
            Yue.C3329.m13903(r0)
            r0.add(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher addNoneOf(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addNoneOf(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodMatcher addNoneOf(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.MethodMatcher r2) {
            r1 = this;
            java.lang.String r0 = "matcher"
            Yue.C3329.m13906(r2, r0)
            java.util.List<org.luckypray.dexkit.query.matchers.MethodMatcher> r0 = r1.noneOfMatchers
            if (r0 != 0) goto Le
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Le:
            r1.noneOfMatchers = r0
            Yue.C3329.m13903(r0)
            r0.add(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher addParamType(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addParamType(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodMatcher addParamType(@Yue.InterfaceC4543 java.lang.Class<?> r3) {
            r2 = this;
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = r2.paramsMatcher
            if (r0 != 0) goto L9
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = new org.luckypray.dexkit.query.matchers.ParametersMatcher
            r0.<init>()
        L9:
            r2.paramsMatcher = r0
            Yue.C3329.m13903(r0)
            if (r3 == 0) goto L1a
            org.luckypray.dexkit.query.matchers.ParameterMatcher r1 = new org.luckypray.dexkit.query.matchers.ParameterMatcher
            r1.<init>()
            org.luckypray.dexkit.query.matchers.ParameterMatcher r3 = r1.type(r3)
            goto L1b
        L1a:
            r3 = 0
        L1b:
            r0.add(r3)
            return r2
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.MethodMatcher addParamType(@Yue.InterfaceC4543 java.lang.String r7) {
            r6 = this;
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            org.luckypray.dexkit.query.matchers.MethodMatcher r7 = addParamType$default(r0, r1, r2, r3, r4, r5)
            return r7
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.MethodMatcher addParamType(@Yue.InterfaceC4543 java.lang.String r8, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r9) {
            r7 = this;
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            org.luckypray.dexkit.query.matchers.MethodMatcher r8 = addParamType$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.MethodMatcher addParamType(@Yue.InterfaceC4543 java.lang.String r3, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r4, boolean r5) {
            r2 = this;
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r4, r0)
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = r2.paramsMatcher
            if (r0 != 0) goto Le
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = new org.luckypray.dexkit.query.matchers.ParametersMatcher
            r0.<init>()
        Le:
            r2.paramsMatcher = r0
            Yue.C3329.m13903(r0)
            if (r3 == 0) goto L1f
            org.luckypray.dexkit.query.matchers.ParameterMatcher r1 = new org.luckypray.dexkit.query.matchers.ParameterMatcher
            r1.<init>()
            org.luckypray.dexkit.query.matchers.ParameterMatcher r3 = r1.type(r3, r4, r5)
            goto L20
        L1f:
            r3 = 0
        L20:
            r0.add(r3)
            return r2
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodMatcher addParamType(@Yue.InterfaceC4543 org.luckypray.dexkit.query.matchers.ClassMatcher r3) {
            r2 = this;
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = r2.paramsMatcher
            if (r0 != 0) goto L9
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = new org.luckypray.dexkit.query.matchers.ParametersMatcher
            r0.<init>()
        L9:
            r2.paramsMatcher = r0
            Yue.C3329.m13903(r0)
            if (r3 == 0) goto L1a
            org.luckypray.dexkit.query.matchers.ParameterMatcher r1 = new org.luckypray.dexkit.query.matchers.ParameterMatcher
            r1.<init>()
            org.luckypray.dexkit.query.matchers.ParameterMatcher r3 = r1.type(r3)
            goto L1b
        L1a:
            r3 = 0
        L1b:
            r0.add(r3)
            return r2
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher addUsingField(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = new org.luckypray.dexkit.query.matchers.UsingFieldMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addUsingField(r0)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.MethodMatcher addUsingField(@Yue.InterfaceC4418 java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "fieldDescriptor"
            Yue.C3329.m13906(r3, r0)
            r0 = 0
            r1 = 2
            org.luckypray.dexkit.query.matchers.MethodMatcher r3 = addUsingField$default(r2, r3, r0, r1, r0)
            return r3
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.MethodMatcher addUsingField(@Yue.InterfaceC4418 java.lang.String r4, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.UsingType r5) {
            r3 = this;
            java.lang.String r0 = "fieldDescriptor"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "usingType"
            Yue.C3329.m13906(r5, r0)
            java.util.List<org.luckypray.dexkit.query.matchers.UsingFieldMatcher> r0 = r3.usingFieldsMatcher
            if (r0 != 0) goto L13
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L13:
            r3.usingFieldsMatcher = r0
            Yue.C3329.m13903(r0)
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r1 = new org.luckypray.dexkit.query.matchers.UsingFieldMatcher
            r1.<init>()
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r2.<init>(r4)
            r1.field(r2)
            r1.usingType(r5)
            r0.add(r1)
            return r3
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.MethodMatcher addUsingField(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.FieldMatcher r3) {
            r2 = this;
            java.lang.String r0 = "usingField"
            Yue.C3329.m13906(r3, r0)
            r0 = 0
            r1 = 2
            org.luckypray.dexkit.query.matchers.MethodMatcher r3 = addUsingField$default(r2, r3, r0, r1, r0)
            return r3
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.MethodMatcher addUsingField(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.FieldMatcher r3, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.UsingType r4) {
            r2 = this;
            java.lang.String r0 = "usingField"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "usingType"
            Yue.C3329.m13906(r4, r0)
            java.util.List<org.luckypray.dexkit.query.matchers.UsingFieldMatcher> r0 = r2.usingFieldsMatcher
            if (r0 != 0) goto L13
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L13:
            r2.usingFieldsMatcher = r0
            Yue.C3329.m13903(r0)
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r1 = new org.luckypray.dexkit.query.matchers.UsingFieldMatcher
            r1.<init>()
            r1.field(r3)
            r1.usingType(r4)
            r0.add(r1)
            return r2
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodMatcher addUsingField(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.UsingFieldMatcher r2) {
            r1 = this;
            java.lang.String r0 = "usingField"
            Yue.C3329.m13906(r2, r0)
            java.util.List<org.luckypray.dexkit.query.matchers.UsingFieldMatcher> r0 = r1.usingFieldsMatcher
            if (r0 != 0) goto Le
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Le:
            r1.usingFieldsMatcher = r0
            Yue.C3329.m13903(r0)
            r0.add(r2)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodMatcher addUsingNumber(@Yue.InterfaceC4418 java.lang.Number r3) {
            r2 = this;
            java.lang.String r0 = "usingNumber"
            Yue.C3329.m13906(r3, r0)
            java.util.List<org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher> r0 = r2.usingNumbersMatcher
            if (r0 != 0) goto Le
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Le:
            r2.usingNumbersMatcher = r0
            Yue.C3329.m13903(r0)
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r1 = new org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher
            r1.<init>()
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r3 = r1.value(r3)
            r0.add(r3)
            return r2
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.MethodMatcher addUsingString(@Yue.InterfaceC4418 java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "usingString"
            Yue.C3329.m13906(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.MethodMatcher r8 = addUsingString$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.MethodMatcher addUsingString(@Yue.InterfaceC4418 java.lang.String r8, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r9) {
            r7 = this;
            java.lang.String r0 = "usingString"
            Yue.C3329.m13906(r8, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            org.luckypray.dexkit.query.matchers.MethodMatcher r8 = addUsingString$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.MethodMatcher addUsingString(@Yue.InterfaceC4418 java.lang.String r3, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r4, boolean r5) {
            r2 = this;
            java.lang.String r0 = "usingString"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r4, r0)
            java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> r0 = r2.usingStringsMatcher
            if (r0 != 0) goto L13
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L13:
            r2.usingStringsMatcher = r0
            Yue.C3329.m13903(r0)
            org.luckypray.dexkit.query.matchers.base.StringMatcher r1 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r1.<init>(r3, r4, r5)
            r0.add(r1)
            return r2
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodMatcher addUsingString(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.base.StringMatcher r2) {
            r1 = this;
            java.lang.String r0 = "usingString"
            Yue.C3329.m13906(r2, r0)
            java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> r0 = r1.usingStringsMatcher
            if (r0 != 0) goto Le
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Le:
            r1.usingStringsMatcher = r0
            Yue.C3329.m13903(r0)
            r0.add(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher allOf(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.MethodMatcherList r0 = new org.luckypray.dexkit.query.MethodMatcherList
            r0.<init>()
            r2.invoke(r0)
            r1.allOf(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodMatcher allOf(@Yue.InterfaceC4418 java.util.Collection<org.luckypray.dexkit.query.matchers.MethodMatcher> r3) {
            r2 = this;
            java.lang.String r0 = "matchers"
            Yue.C3329.m13906(r3, r0)
            boolean r0 = r3.isEmpty()
            r0 = r0 ^ 1
            r1 = 0
            if (r0 == 0) goto Lf
            goto L10
        Lf:
            r3 = r1
        L10:
            if (r3 == 0) goto L16
            java.util.List r1 = Yue.C1219.m6540(r3)
        L16:
            r2.allOfMatchers = r1
            return r2
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodMatcher allOf(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.MethodMatcher... r2) {
            r1 = this;
            java.lang.String r0 = "matchers"
            Yue.C3329.m13906(r2, r0)
            java.util.List r2 = Yue.C0586.m2116(r2)
            r1.allOf(r2)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodMatcher annotationCount(int r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = r1.annotationsMatcher
            if (r0 != 0) goto L9
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationsMatcher
            r0.<init>()
        L9:
            r1.annotationsMatcher = r0
            Yue.C3329.m13903(r0)
            r0.count(r2)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodMatcher annotationCount(int r2, int r3) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = r1.annotationsMatcher
            if (r0 != 0) goto L9
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationsMatcher
            r0.<init>()
        L9:
            r1.annotationsMatcher = r0
            Yue.C3329.m13903(r0)
            r0.count(r2, r3)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodMatcher annotationCount(@Yue.InterfaceC4418 Yue.C3279 r2) {
            r1 = this;
            java.lang.String r0 = "range"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = r1.annotationsMatcher
            if (r0 != 0) goto Le
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationsMatcher
            r0.<init>()
        Le:
            r1.annotationsMatcher = r0
            Yue.C3329.m13903(r0)
            r0.count(r2)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodMatcher annotationCount(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.base.IntRange r2) {
            r1 = this;
            java.lang.String r0 = "range"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = r1.annotationsMatcher
            if (r0 != 0) goto Le
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationsMatcher
            r0.<init>()
        Le:
            r1.annotationsMatcher = r0
            Yue.C3329.m13903(r0)
            r0.count(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher annotations(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = new org.luckypray.dexkit.query.matchers.AnnotationsMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.annotations(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodMatcher annotations(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.AnnotationsMatcher r2) {
            r1 = this;
            java.lang.String r0 = "annotations"
            Yue.C3329.m13906(r2, r0)
            r1.annotationsMatcher = r2
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher anyOf(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.MethodMatcherList r0 = new org.luckypray.dexkit.query.MethodMatcherList
            r0.<init>()
            r2.invoke(r0)
            r1.anyOf(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodMatcher anyOf(@Yue.InterfaceC4418 java.util.Collection<org.luckypray.dexkit.query.matchers.MethodMatcher> r3) {
            r2 = this;
            java.lang.String r0 = "matchers"
            Yue.C3329.m13906(r3, r0)
            boolean r0 = r3.isEmpty()
            r0 = r0 ^ 1
            r1 = 0
            if (r0 == 0) goto Lf
            goto L10
        Lf:
            r3 = r1
        L10:
            if (r3 == 0) goto L16
            java.util.List r1 = Yue.C1219.m6540(r3)
        L16:
            r2.anyOfMatchers = r1
            return r2
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodMatcher anyOf(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.MethodMatcher... r2) {
            r1 = this;
            java.lang.String r0 = "matchers"
            Yue.C3329.m13906(r2, r0)
            java.util.List r2 = Yue.C0586.m2116(r2)
            r1.anyOf(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher callerMethods(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.callerMethods(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodMatcher callerMethods(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.MethodsMatcher r2) {
            r1 = this;
            java.lang.String r0 = "callerMethods"
            Yue.C3329.m13906(r2, r0)
            r1.callerMethodsMatcher = r2
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher declaredClass(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.declaredClass(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodMatcher declaredClass(@Yue.InterfaceC4418 java.lang.Class<?> r8) {
            r7 = this;
            java.lang.String r0 = "clazz"
            Yue.C3329.m13906(r8, r0)
            org.luckypray.dexkit.query.matchers.ClassMatcher r1 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r1.<init>()
            java.lang.String r2 = org.luckypray.dexkit.util.DexSignUtil.getTypeName(r8)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            org.luckypray.dexkit.query.matchers.ClassMatcher r8 = org.luckypray.dexkit.query.matchers.ClassMatcher.className$default(r1, r2, r3, r4, r5, r6)
            r7.classMatcher = r8
            return r7
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.MethodMatcher declaredClass(@Yue.InterfaceC4418 java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "className"
            Yue.C3329.m13906(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.MethodMatcher r8 = declaredClass$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.MethodMatcher declaredClass(@Yue.InterfaceC4418 java.lang.String r8, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r9) {
            r7 = this;
            java.lang.String r0 = "className"
            Yue.C3329.m13906(r8, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            org.luckypray.dexkit.query.matchers.MethodMatcher r8 = declaredClass$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.MethodMatcher declaredClass(@Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r3, boolean r4) {
            r1 = this;
            java.lang.String r0 = "className"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r3, r0)
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r0.<init>()
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = r0.className(r2, r3, r4)
            r1.classMatcher = r2
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodMatcher declaredClass(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.ClassMatcher r2) {
            r1 = this;
            java.lang.String r0 = "declaredClass"
            Yue.C3329.m13906(r2, r0)
            r1.classMatcher = r2
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodMatcher descriptor(@Yue.InterfaceC4418 java.lang.String r14) {
            r13 = this;
            java.lang.String r0 = "descriptor"
            Yue.C3329.m13906(r14, r0)
            org.luckypray.dexkit.wrap.DexMethod r0 = new org.luckypray.dexkit.wrap.DexMethod
            r0.<init>(r14)
            java.lang.String r2 = r0.getName()
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r13
            name$default(r1, r2, r3, r4, r5, r6)
            java.lang.String r8 = r0.getClassName()
            r11 = 6
            r12 = 0
            r9 = 0
            r10 = 0
            r7 = r13
            declaredClass$default(r7, r8, r9, r10, r11, r12)
            java.lang.String r2 = r0.getReturnTypeName()
            returnType$default(r1, r2, r3, r4, r5, r6)
            java.util.List r14 = r0.getParamTypeNames()
            r13.paramTypes(r14)
            return r13
    }

    @Yue.InterfaceC4543
    public final java.util.List<org.luckypray.dexkit.query.matchers.MethodMatcher> getAllOfMatchers() {
            r1 = this;
            java.util.List<org.luckypray.dexkit.query.matchers.MethodMatcher> r0 = r1.allOfMatchers
            return r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.query.matchers.AnnotationsMatcher getAnnotationsMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = r1.annotationsMatcher
            return r0
    }

    @Yue.InterfaceC4543
    public final java.util.List<org.luckypray.dexkit.query.matchers.MethodMatcher> getAnyOfMatchers() {
            r1 = this;
            java.util.List<org.luckypray.dexkit.query.matchers.MethodMatcher> r0 = r1.anyOfMatchers
            return r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.query.matchers.MethodsMatcher getCallerMethodsMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = r1.callerMethodsMatcher
            return r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.query.matchers.ClassMatcher getClassMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r1.classMatcher
            return r0
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Property can only be written.")
    public final /* synthetic */ java.lang.String getDeclaredClass() {
            r3 = this;
            Yue.ۥۡۢۥ۟ r0 = new Yue.ۥۡۢۥ۟
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Property can only be written.")
    public final /* synthetic */ java.lang.String getDescriptor() {
            r3 = this;
            Yue.ۥۡۢۥ۟ r0 = new Yue.ۥۡۢۥ۟
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.query.matchers.MethodsMatcher getInvokeMethodsMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = r1.invokeMethodsMatcher
            return r0
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Property can only be written.")
    public final /* synthetic */ int getModifiers() {
            r3 = this;
            Yue.ۥۡۢۥ۟ r0 = new Yue.ۥۡۢۥ۟
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher getModifiersMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher r0 = r1.modifiersMatcher
            return r0
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Property can only be written.")
    public final /* synthetic */ java.lang.String getName() {
            r3 = this;
            Yue.ۥۡۢۥ۟ r0 = new Yue.ۥۡۢۥ۟
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.query.matchers.base.StringMatcher getNameMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.StringMatcher r0 = r1.nameMatcher
            return r0
    }

    @Yue.InterfaceC4543
    public final java.util.List<org.luckypray.dexkit.query.matchers.MethodMatcher> getNoneOfMatchers() {
            r1 = this;
            java.util.List<org.luckypray.dexkit.query.matchers.MethodMatcher> r0 = r1.noneOfMatchers
            return r0
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Property can only be written.")
    public final /* synthetic */ java.util.Collection getOpCodes() {
            r3 = this;
            Yue.ۥۡۢۥ۟ r0 = new Yue.ۥۡۢۥ۟
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.query.matchers.base.OpCodesMatcher getOpCodesMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = r1.opCodesMatcher
            return r0
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Property can only be written.")
    public final /* synthetic */ java.util.Collection getOpNames() {
            r3 = this;
            Yue.ۥۡۢۥ۟ r0 = new Yue.ۥۡۢۥ۟
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Property can only be written.")
    public final /* synthetic */ int getParamCount() {
            r3 = this;
            Yue.ۥۡۢۥ۟ r0 = new Yue.ۥۡۢۥ۟
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Property can only be written.")
    public final /* synthetic */ java.util.Collection getParamTypes() {
            r3 = this;
            Yue.ۥۡۢۥ۟ r0 = new Yue.ۥۡۢۥ۟
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.query.matchers.ParametersMatcher getParamsMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = r1.paramsMatcher
            return r0
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Property can only be written.")
    public final /* synthetic */ java.lang.String getProtoShorty() {
            r3 = this;
            Yue.ۥۡۢۥ۟ r0 = new Yue.ۥۡۢۥ۟
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    @Yue.InterfaceC4543
    public final java.lang.String getProtoShortyMatcher() {
            r1 = this;
            java.lang.String r0 = r1.protoShortyMatcher
            return r0
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Property can only be written.")
    public final /* synthetic */ java.lang.String getReturnType() {
            r3 = this;
            Yue.ۥۡۢۥ۟ r0 = new Yue.ۥۡۢۥ۟
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.query.matchers.ClassMatcher getReturnTypeMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r1.returnTypeMatcher
            return r0
    }

    @Yue.InterfaceC4543
    public final java.util.List<org.luckypray.dexkit.query.matchers.UsingFieldMatcher> getUsingFieldsMatcher() {
            r1 = this;
            java.util.List<org.luckypray.dexkit.query.matchers.UsingFieldMatcher> r0 = r1.usingFieldsMatcher
            return r0
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Property can only be written.")
    public final /* synthetic */ java.util.Collection getUsingNumbers() {
            r3 = this;
            Yue.ۥۡۢۥ۟ r0 = new Yue.ۥۡۢۥ۟
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    @Yue.InterfaceC4543
    public final java.util.List<org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher> getUsingNumbersMatcher() {
            r1 = this;
            java.util.List<org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher> r0 = r1.usingNumbersMatcher
            return r0
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Property can only be written.")
    public final /* synthetic */ java.util.Collection getUsingStrings() {
            r3 = this;
            Yue.ۥۡۢۥ۟ r0 = new Yue.ۥۡۢۥ۟
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    @Yue.InterfaceC4543
    public final java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> getUsingStringsMatcher() {
            r1 = this;
            java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> r0 = r1.usingStringsMatcher
            return r0
    }

    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r27) {
            r26 = this;
            r0 = r26
            r15 = r27
            java.lang.String r1 = "fbb"
            Yue.C3329.m13906(r15, r1)
            org.luckypray.dexkit.schema.-MethodMatcher$Companion r1 = org.luckypray.dexkit.schema.MethodMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.StringMatcher r2 = r0.nameMatcher
            if (r2 == 0) goto L15
            int r2 = r2.build$dexkit_android_release(r15)
            r4 = r2
            goto L16
        L15:
            r4 = 0
        L16:
            org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher r2 = r0.modifiersMatcher
            if (r2 == 0) goto L20
            int r2 = r2.build$dexkit_android_release(r15)
            r5 = r2
            goto L21
        L20:
            r5 = 0
        L21:
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = r0.classMatcher
            if (r2 == 0) goto L2b
            int r2 = r2.build$dexkit_android_release(r15)
            r6 = r2
            goto L2c
        L2b:
            r6 = 0
        L2c:
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = r0.returnTypeMatcher
            if (r2 == 0) goto L36
            int r2 = r2.build$dexkit_android_release(r15)
            r7 = r2
            goto L37
        L36:
            r7 = 0
        L37:
            org.luckypray.dexkit.query.matchers.ParametersMatcher r2 = r0.paramsMatcher
            if (r2 == 0) goto L41
            int r2 = r2.build$dexkit_android_release(r15)
            r8 = r2
            goto L42
        L41:
            r8 = 0
        L42:
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r2 = r0.annotationsMatcher
            if (r2 == 0) goto L4c
            int r2 = r2.build$dexkit_android_release(r15)
            r9 = r2
            goto L4d
        L4c:
            r9 = 0
        L4d:
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r2 = r0.opCodesMatcher
            if (r2 == 0) goto L57
            int r2 = r2.build$dexkit_android_release(r15)
            r10 = r2
            goto L58
        L57:
            r10 = 0
        L58:
            java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> r2 = r0.usingStringsMatcher
            r11 = 10
            if (r2 == 0) goto L8f
            java.util.ArrayList r12 = new java.util.ArrayList
            int r13 = Yue.C1210.m6231(r2, r11)
            r12.<init>(r13)
            java.util.Iterator r2 = r2.iterator()
        L6b:
            boolean r13 = r2.hasNext()
            if (r13 == 0) goto L83
            java.lang.Object r13 = r2.next()
            org.luckypray.dexkit.query.matchers.base.StringMatcher r13 = (org.luckypray.dexkit.query.matchers.base.StringMatcher) r13
            int r13 = r13.build$dexkit_android_release(r15)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12.add(r13)
            goto L6b
        L83:
            int[] r2 = Yue.C1219.m6536(r12)
            if (r2 == 0) goto L8f
            int r2 = r15.createVectorOfTables(r2)
            r12 = r2
            goto L90
        L8f:
            r12 = 0
        L90:
            java.util.List<org.luckypray.dexkit.query.matchers.UsingFieldMatcher> r2 = r0.usingFieldsMatcher
            if (r2 == 0) goto Lc5
            java.util.ArrayList r13 = new java.util.ArrayList
            int r14 = Yue.C1210.m6231(r2, r11)
            r13.<init>(r14)
            java.util.Iterator r2 = r2.iterator()
        La1:
            boolean r14 = r2.hasNext()
            if (r14 == 0) goto Lb9
            java.lang.Object r14 = r2.next()
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r14 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r14
            int r14 = r14.build$dexkit_android_release(r15)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r13.add(r14)
            goto La1
        Lb9:
            int[] r2 = Yue.C1219.m6536(r13)
            if (r2 == 0) goto Lc5
            int r2 = r15.createVectorOfTables(r2)
            r13 = r2
            goto Lc6
        Lc5:
            r13 = 0
        Lc6:
            java.util.List<org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher> r2 = r0.usingNumbersMatcher
            if (r2 == 0) goto L102
            java.util.ArrayList r14 = new java.util.ArrayList
            int r3 = Yue.C1210.m6231(r2, r11)
            r14.<init>(r3)
            java.util.Iterator r2 = r2.iterator()
        Ld7:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lf6
            java.lang.Object r3 = r2.next()
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r3 = (org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher) r3
            org.luckypray.dexkit.query.enums.NumberEncodeValueType r3 = r3.getType()
            Yue.C3329.m13903(r3)
            byte r3 = r3.m30791getValuew2LRezQ()
            Yue.ۥۢۢۥۥ r3 = Yue.C6517.m24793(r3)
            r14.add(r3)
            goto Ld7
        Lf6:
            byte[] r2 = Yue.C6524.m24881(r14)
            org.luckypray.dexkit.schema.-MethodMatcher$Companion r3 = org.luckypray.dexkit.schema.MethodMatcher.Companion
            int r2 = r3.m30845createUsingNumbersTypeVectorVUfvBY(r15, r2)
            r14 = r2
            goto L103
        L102:
            r14 = 0
        L103:
            java.util.List<org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher> r2 = r0.usingNumbersMatcher
            if (r2 == 0) goto L149
            java.util.ArrayList r3 = new java.util.ArrayList
            r17 = r14
            int r14 = Yue.C1210.m6231(r2, r11)
            r3.<init>(r14)
            java.util.Iterator r2 = r2.iterator()
        L116:
            boolean r14 = r2.hasNext()
            if (r14 == 0) goto L13b
            java.lang.Object r14 = r2.next()
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r14 = (org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher) r14
            org.luckypray.dexkit.query.base.INumberEncodeValue r14 = r14.getValue()
            java.lang.String r11 = "null cannot be cast to non-null type org.luckypray.dexkit.query.base.BaseMatcher"
            Yue.C3329.m13904(r14, r11)
            org.luckypray.dexkit.query.base.BaseMatcher r14 = (org.luckypray.dexkit.query.base.BaseMatcher) r14
            int r11 = r14.build$dexkit_android_release(r15)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r3.add(r11)
            r11 = 10
            goto L116
        L13b:
            int[] r2 = Yue.C1219.m6536(r3)
            if (r2 == 0) goto L14b
            org.luckypray.dexkit.schema.-MethodMatcher$Companion r3 = org.luckypray.dexkit.schema.MethodMatcher.Companion
            int r2 = r3.createUsingNumbersVector(r15, r2)
            r14 = r2
            goto L14c
        L149:
            r17 = r14
        L14b:
            r14 = 0
        L14c:
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = r0.invokeMethodsMatcher
            if (r2 == 0) goto L157
            int r2 = r2.build$dexkit_android_release(r15)
            r19 = r2
            goto L159
        L157:
            r19 = 0
        L159:
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = r0.callerMethodsMatcher
            if (r2 == 0) goto L164
            int r2 = r2.build$dexkit_android_release(r15)
            r20 = r2
            goto L166
        L164:
            r20 = 0
        L166:
            java.lang.String r2 = r0.protoShortyMatcher
            if (r2 == 0) goto L171
            int r2 = r15.createString(r2)
            r21 = r2
            goto L173
        L171:
            r21 = 0
        L173:
            java.util.List<org.luckypray.dexkit.query.matchers.MethodMatcher> r2 = r0.allOfMatchers
            if (r2 == 0) goto L1ad
            java.util.ArrayList r3 = new java.util.ArrayList
            r22 = r14
            r11 = 10
            int r14 = Yue.C1210.m6231(r2, r11)
            r3.<init>(r14)
            java.util.Iterator r2 = r2.iterator()
        L188:
            boolean r11 = r2.hasNext()
            if (r11 == 0) goto L1a0
            java.lang.Object r11 = r2.next()
            org.luckypray.dexkit.query.matchers.MethodMatcher r11 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r11
            int r11 = r11.build$dexkit_android_release(r15)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r3.add(r11)
            goto L188
        L1a0:
            int[] r2 = Yue.C1219.m6536(r3)
            if (r2 == 0) goto L1af
            int r2 = r15.createVectorOfTables(r2)
            r23 = r2
            goto L1b1
        L1ad:
            r22 = r14
        L1af:
            r23 = 0
        L1b1:
            java.util.List<org.luckypray.dexkit.query.matchers.MethodMatcher> r2 = r0.anyOfMatchers
            if (r2 == 0) goto L1e9
            java.util.ArrayList r3 = new java.util.ArrayList
            r11 = 10
            int r14 = Yue.C1210.m6231(r2, r11)
            r3.<init>(r14)
            java.util.Iterator r2 = r2.iterator()
        L1c4:
            boolean r11 = r2.hasNext()
            if (r11 == 0) goto L1dc
            java.lang.Object r11 = r2.next()
            org.luckypray.dexkit.query.matchers.MethodMatcher r11 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r11
            int r11 = r11.build$dexkit_android_release(r15)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r3.add(r11)
            goto L1c4
        L1dc:
            int[] r2 = Yue.C1219.m6536(r3)
            if (r2 == 0) goto L1e9
            int r2 = r15.createVectorOfTables(r2)
            r24 = r2
            goto L1eb
        L1e9:
            r24 = 0
        L1eb:
            java.util.List<org.luckypray.dexkit.query.matchers.MethodMatcher> r2 = r0.noneOfMatchers
            if (r2 == 0) goto L223
            java.util.ArrayList r3 = new java.util.ArrayList
            r11 = 10
            int r11 = Yue.C1210.m6231(r2, r11)
            r3.<init>(r11)
            java.util.Iterator r2 = r2.iterator()
        L1fe:
            boolean r11 = r2.hasNext()
            if (r11 == 0) goto L216
            java.lang.Object r11 = r2.next()
            org.luckypray.dexkit.query.matchers.MethodMatcher r11 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r11
            int r11 = r11.build$dexkit_android_release(r15)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r3.add(r11)
            goto L1fe
        L216:
            int[] r2 = Yue.C1219.m6536(r3)
            if (r2 == 0) goto L223
            int r2 = r15.createVectorOfTables(r2)
            r25 = r2
            goto L225
        L223:
            r25 = 0
        L225:
            r2 = r27
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r12
            r11 = r13
            r12 = r17
            r13 = r22
            r14 = r19
            r0 = r15
            r15 = r20
            r16 = r21
            r17 = r23
            r18 = r24
            r19 = r25
            int r1 = r1.createMethodMatcher(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r0.finish(r1)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher invokeMethods(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.invokeMethods(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodMatcher invokeMethods(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.MethodsMatcher r2) {
            r1 = this;
            java.lang.String r0 = "invokeMethods"
            Yue.C3329.m13906(r2, r0)
            r1.invokeMethodsMatcher = r2
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.MethodMatcher modifiers(int r3) {
            r2 = this;
            r0 = 0
            r1 = 2
            org.luckypray.dexkit.query.matchers.MethodMatcher r3 = modifiers$default(r2, r3, r0, r1, r0)
            return r3
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.MethodMatcher modifiers(int r2, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.MatchType r3) {
            r1 = this;
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r3, r0)
            org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher
            r0.<init>(r2, r3)
            r1.modifiersMatcher = r0
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodMatcher modifiers(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher r2) {
            r1 = this;
            java.lang.String r0 = "modifiers"
            Yue.C3329.m13906(r2, r0)
            r1.modifiersMatcher = r2
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.MethodMatcher name(@Yue.InterfaceC4418 java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "name"
            Yue.C3329.m13906(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.MethodMatcher r8 = name$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.MethodMatcher name(@Yue.InterfaceC4418 java.lang.String r8, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r9) {
            r7 = this;
            java.lang.String r0 = "name"
            Yue.C3329.m13906(r8, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            org.luckypray.dexkit.query.matchers.MethodMatcher r8 = name$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.MethodMatcher name(@Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r3, boolean r4) {
            r1 = this;
            java.lang.String r0 = "name"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r3, r0)
            org.luckypray.dexkit.query.matchers.base.StringMatcher r0 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r0.<init>(r2, r3, r4)
            r1.nameMatcher = r0
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodMatcher name(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.base.StringMatcher r2) {
            r1 = this;
            java.lang.String r0 = "name"
            Yue.C3329.m13906(r2, r0)
            r1.nameMatcher = r2
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher noneOf(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.MethodMatcherList r0 = new org.luckypray.dexkit.query.MethodMatcherList
            r0.<init>()
            r2.invoke(r0)
            r1.noneOf(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodMatcher noneOf(@Yue.InterfaceC4418 java.util.Collection<org.luckypray.dexkit.query.matchers.MethodMatcher> r3) {
            r2 = this;
            java.lang.String r0 = "matchers"
            Yue.C3329.m13906(r3, r0)
            boolean r0 = r3.isEmpty()
            r0 = r0 ^ 1
            r1 = 0
            if (r0 == 0) goto Lf
            goto L10
        Lf:
            r3 = r1
        L10:
            if (r3 == 0) goto L16
            java.util.List r1 = Yue.C1219.m6540(r3)
        L16:
            r2.noneOfMatchers = r1
            return r2
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodMatcher noneOf(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.MethodMatcher... r2) {
            r1 = this;
            java.lang.String r0 = "matchers"
            Yue.C3329.m13906(r2, r0)
            java.util.List r2 = Yue.C0586.m2116(r2)
            r1.noneOf(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher not(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.not(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodMatcher not(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.MethodMatcher r2) {
            r1 = this;
            java.lang.String r0 = "matcher"
            Yue.C3329.m13906(r2, r0)
            r1.addNoneOf(r2)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.MethodMatcher opCodes(@Yue.InterfaceC4418 java.util.Collection<java.lang.Integer> r8) {
            r7 = this;
            java.lang.String r0 = "opCodes"
            Yue.C3329.m13906(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.MethodMatcher r8 = opCodes$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.MethodMatcher opCodes(@Yue.InterfaceC4418 java.util.Collection<java.lang.Integer> r8, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.OpCodeMatchType r9) {
            r7 = this;
            java.lang.String r0 = "opCodes"
            Yue.C3329.m13906(r8, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            org.luckypray.dexkit.query.matchers.MethodMatcher r8 = opCodes$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.MethodMatcher opCodes(@Yue.InterfaceC4418 java.util.Collection<java.lang.Integer> r2, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.OpCodeMatchType r3, @Yue.InterfaceC4543 org.luckypray.dexkit.query.matchers.base.IntRange r4) {
            r1 = this;
            java.lang.String r0 = "opCodes"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r3, r0)
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r0 = new org.luckypray.dexkit.query.matchers.base.OpCodesMatcher
            r0.<init>(r2, r3, r4)
            r1.opCodesMatcher = r0
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodMatcher opCodes(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r2) {
            r1 = this;
            java.lang.String r0 = "opCodes"
            Yue.C3329.m13906(r2, r0)
            r1.opCodesMatcher = r2
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.MethodMatcher opNames(@Yue.InterfaceC4418 java.util.Collection<java.lang.String> r8) {
            r7 = this;
            java.lang.String r0 = "opNames"
            Yue.C3329.m13906(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.MethodMatcher r8 = opNames$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.MethodMatcher opNames(@Yue.InterfaceC4418 java.util.Collection<java.lang.String> r8, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.OpCodeMatchType r9) {
            r7 = this;
            java.lang.String r0 = "opNames"
            Yue.C3329.m13906(r8, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            org.luckypray.dexkit.query.matchers.MethodMatcher r8 = opNames$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.MethodMatcher opNames(@Yue.InterfaceC4418 java.util.Collection<java.lang.String> r2, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.OpCodeMatchType r3, @Yue.InterfaceC4543 org.luckypray.dexkit.query.matchers.base.IntRange r4) {
            r1 = this;
            java.lang.String r0 = "opNames"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r3, r0)
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.OpCodesMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.OpCodesMatcher r2 = r0.createForOpNames(r2, r3, r4)
            r1.opCodesMatcher = r2
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodMatcher paramCount(int r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = r1.paramsMatcher
            if (r0 != 0) goto Ld
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = new org.luckypray.dexkit.query.matchers.ParametersMatcher
            r0.<init>()
            r1.paramsMatcher = r0
            Yue.ۥۣۢ۠ۤ r0 = Yue.C6593.f23016
        Ld:
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = r1.paramsMatcher
            Yue.C3329.m13903(r0)
            r0.count(r2)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodMatcher paramCount(int r2, int r3) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = r1.paramsMatcher
            if (r0 != 0) goto Ld
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = new org.luckypray.dexkit.query.matchers.ParametersMatcher
            r0.<init>()
            r1.paramsMatcher = r0
            Yue.ۥۣۢ۠ۤ r0 = Yue.C6593.f23016
        Ld:
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = r1.paramsMatcher
            Yue.C3329.m13903(r0)
            r0.count(r2, r3)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodMatcher paramCount(@Yue.InterfaceC4418 Yue.C3279 r2) {
            r1 = this;
            java.lang.String r0 = "range"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = r1.paramsMatcher
            if (r0 != 0) goto L12
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = new org.luckypray.dexkit.query.matchers.ParametersMatcher
            r0.<init>()
            r1.paramsMatcher = r0
            Yue.ۥۣۢ۠ۤ r0 = Yue.C6593.f23016
        L12:
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = r1.paramsMatcher
            Yue.C3329.m13903(r0)
            r0.count(r2)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodMatcher paramCount(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.base.IntRange r2) {
            r1 = this;
            java.lang.String r0 = "range"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = r1.paramsMatcher
            if (r0 != 0) goto L12
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = new org.luckypray.dexkit.query.matchers.ParametersMatcher
            r0.<init>()
            r1.paramsMatcher = r0
            Yue.ۥۣۢ۠ۤ r0 = Yue.C6593.f23016
        L12:
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = r1.paramsMatcher
            Yue.C3329.m13903(r0)
            r0.count(r2)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodMatcher paramTypes() {
            r2 = this;
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = new org.luckypray.dexkit.query.matchers.ParametersMatcher
            r0.<init>()
            java.util.List r1 = Yue.C1208.m6210()
            r0.params(r1)
            r2.paramsMatcher = r0
            return r2
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodMatcher paramTypes(@Yue.InterfaceC4418 java.util.Collection<java.lang.String> r9) {
            r8 = this;
            java.lang.String r0 = "paramTypes"
            Yue.C3329.m13906(r9, r0)
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = new org.luckypray.dexkit.query.matchers.ParametersMatcher
            r0.<init>()
            java.util.List r1 = Yue.C1208.m6210()
            r0.params(r1)
            java.util.Iterator r9 = r9.iterator()
        L15:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L37
            java.lang.Object r1 = r9.next()
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L32
            org.luckypray.dexkit.query.matchers.ParameterMatcher r2 = new org.luckypray.dexkit.query.matchers.ParameterMatcher
            r2.<init>()
            r6 = 6
            r7 = 0
            r4 = 0
            r5 = 0
            org.luckypray.dexkit.query.matchers.ParameterMatcher r1 = org.luckypray.dexkit.query.matchers.ParameterMatcher.type$default(r2, r3, r4, r5, r6, r7)
            goto L33
        L32:
            r1 = 0
        L33:
            r0.add(r1)
            goto L15
        L37:
            r8.paramsMatcher = r0
            return r8
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodMatcher paramTypes(@Yue.InterfaceC4418 java.lang.Class<?>... r6) {
            r5 = this;
            java.lang.String r0 = "paramTypes"
            Yue.C3329.m13906(r6, r0)
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = new org.luckypray.dexkit.query.matchers.ParametersMatcher
            r0.<init>()
            java.util.List r1 = Yue.C1208.m6210()
            r0.params(r1)
            int r1 = r6.length
            r2 = 0
        L13:
            if (r2 >= r1) goto L2a
            r3 = r6[r2]
            if (r3 == 0) goto L23
            org.luckypray.dexkit.query.matchers.ParameterMatcher r4 = new org.luckypray.dexkit.query.matchers.ParameterMatcher
            r4.<init>()
            org.luckypray.dexkit.query.matchers.ParameterMatcher r3 = r4.type(r3)
            goto L24
        L23:
            r3 = 0
        L24:
            r0.add(r3)
            int r2 = r2 + 1
            goto L13
        L2a:
            r5.paramsMatcher = r0
            return r5
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodMatcher paramTypes(@Yue.InterfaceC4418 java.lang.String... r10) {
            r9 = this;
            java.lang.String r0 = "paramTypes"
            Yue.C3329.m13906(r10, r0)
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = new org.luckypray.dexkit.query.matchers.ParametersMatcher
            r0.<init>()
            java.util.List r1 = Yue.C1208.m6210()
            r0.params(r1)
            int r1 = r10.length
            r2 = 0
        L13:
            if (r2 >= r1) goto L2e
            r4 = r10[r2]
            if (r4 == 0) goto L27
            org.luckypray.dexkit.query.matchers.ParameterMatcher r3 = new org.luckypray.dexkit.query.matchers.ParameterMatcher
            r3.<init>()
            r7 = 6
            r8 = 0
            r5 = 0
            r6 = 0
            org.luckypray.dexkit.query.matchers.ParameterMatcher r3 = org.luckypray.dexkit.query.matchers.ParameterMatcher.type$default(r3, r4, r5, r6, r7, r8)
            goto L28
        L27:
            r3 = 0
        L28:
            r0.add(r3)
            int r2 = r2 + 1
            goto L13
        L2e:
            r9.paramsMatcher = r0
            return r9
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher params(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.ParametersMatcher r0 = new org.luckypray.dexkit.query.matchers.ParametersMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.params(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodMatcher params(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.ParametersMatcher r2) {
            r1 = this;
            java.lang.String r0 = "params"
            Yue.C3329.m13906(r2, r0)
            r1.paramsMatcher = r2
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodMatcher protoShorty(@Yue.InterfaceC4418 java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "shorty"
            Yue.C3329.m13906(r2, r0)
            r1.protoShortyMatcher = r2
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher returnType(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.returnType(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodMatcher returnType(@Yue.InterfaceC4418 java.lang.Class<?> r8) {
            r7 = this;
            java.lang.String r0 = "clazz"
            Yue.C3329.m13906(r8, r0)
            org.luckypray.dexkit.query.matchers.ClassMatcher r1 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r1.<init>()
            java.lang.String r2 = org.luckypray.dexkit.util.DexSignUtil.getTypeName(r8)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            org.luckypray.dexkit.query.matchers.ClassMatcher r8 = org.luckypray.dexkit.query.matchers.ClassMatcher.className$default(r1, r2, r3, r4, r5, r6)
            r7.returnTypeMatcher = r8
            return r7
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.MethodMatcher returnType(@Yue.InterfaceC4418 java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "typeName"
            Yue.C3329.m13906(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.MethodMatcher r8 = returnType$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.MethodMatcher returnType(@Yue.InterfaceC4418 java.lang.String r8, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r9) {
            r7 = this;
            java.lang.String r0 = "typeName"
            Yue.C3329.m13906(r8, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            org.luckypray.dexkit.query.matchers.MethodMatcher r8 = returnType$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.MethodMatcher returnType(@Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r3, boolean r4) {
            r1 = this;
            java.lang.String r0 = "typeName"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r3, r0)
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r0.<init>()
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = r0.className(r2, r3, r4)
            r1.returnTypeMatcher = r2
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodMatcher returnType(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.ClassMatcher r2) {
            r1 = this;
            java.lang.String r0 = "type"
            Yue.C3329.m13906(r2, r0)
            r1.returnTypeMatcher = r2
            return r1
    }

    public final /* synthetic */ void setDeclaredClass(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            declaredClass$default(r1, r2, r3, r4, r5, r6)
            return
    }

    public final /* synthetic */ void setDescriptor(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r2, r0)
            r1.descriptor(r2)
            return
    }

    public final /* synthetic */ void setModifiers(int r3) {
            r2 = this;
            r0 = 0
            r1 = 2
            modifiers$default(r2, r3, r0, r1, r0)
            return
    }

    public final /* synthetic */ void setName(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            name$default(r1, r2, r3, r4, r5, r6)
            return
    }

    public final void setOpCodes(@Yue.InterfaceC4418 java.util.Collection<java.lang.Integer> r8) {
            r7 = this;
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            opCodes$default(r1, r2, r3, r4, r5, r6)
            return
    }

    public final void setOpNames(@Yue.InterfaceC4418 java.util.Collection<java.lang.String> r8) {
            r7 = this;
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            opNames$default(r1, r2, r3, r4, r5, r6)
            return
    }

    public final /* synthetic */ void setParamCount(int r1) {
            r0 = this;
            r0.paramCount(r1)
            return
    }

    public final /* synthetic */ void setParamTypes(java.util.Collection r2) {
            r1 = this;
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r2, r0)
            r1.paramTypes(r2)
            return
    }

    public final /* synthetic */ void setProtoShorty(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r2, r0)
            r1.protoShorty(r2)
            return
    }

    public final /* synthetic */ void setReturnType(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            returnType$default(r1, r2, r3, r4, r5, r6)
            return
    }

    public final void setUsingNumbers(@Yue.InterfaceC4418 java.util.Collection<? extends java.lang.Number> r2) {
            r1 = this;
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r2, r0)
            r1.usingNumbers(r2)
            return
    }

    public final /* synthetic */ void setUsingStrings(java.util.Collection r8) {
            r7 = this;
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            usingStrings$default(r1, r2, r3, r4, r5, r6)
            return
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodMatcher usingEqStrings(@Yue.InterfaceC4418 java.util.Collection<java.lang.String> r6) {
            r5 = this;
            java.lang.String r0 = "usingStrings"
            Yue.C3329.m13906(r6, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = Yue.C1210.m6231(r6, r1)
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L14:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r6.next()
            java.lang.String r1 = (java.lang.String) r1
            org.luckypray.dexkit.query.matchers.base.StringMatcher r2 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            org.luckypray.dexkit.query.enums.StringMatchType r3 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
            r4 = 0
            r2.<init>(r1, r3, r4)
            r0.add(r2)
            goto L14
        L2c:
            java.util.List r6 = Yue.C1219.m6540(r0)
            r5.usingStringsMatcher = r6
            return r5
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodMatcher usingEqStrings(@Yue.InterfaceC4418 java.lang.String... r8) {
            r7 = this;
            java.lang.String r0 = "usingStrings"
            Yue.C3329.m13906(r8, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r8.length
            r0.<init>(r1)
            int r1 = r8.length
            r2 = 0
            r3 = r2
        Le:
            if (r3 >= r1) goto L1f
            r4 = r8[r3]
            org.luckypray.dexkit.query.matchers.base.StringMatcher r5 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            org.luckypray.dexkit.query.enums.StringMatchType r6 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
            r5.<init>(r4, r6, r2)
            r0.add(r5)
            int r3 = r3 + 1
            goto Le
        L1f:
            java.util.List r8 = Yue.C1219.m6540(r0)
            r7.usingStringsMatcher = r8
            return r7
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher usingFields(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.UsingFieldMatcherList r0 = new org.luckypray.dexkit.query.UsingFieldMatcherList
            r0.<init>()
            r2.invoke(r0)
            r1.usingFields(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodMatcher usingFields(@Yue.InterfaceC4418 java.util.Collection<org.luckypray.dexkit.query.matchers.UsingFieldMatcher> r2) {
            r1 = this;
            java.lang.String r0 = "usingFields"
            Yue.C3329.m13906(r2, r0)
            java.util.List r2 = Yue.C1219.m6540(r2)
            r1.usingFieldsMatcher = r2
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher usingNumbers(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.NumberEncodeValueMatcherList r0 = new org.luckypray.dexkit.query.NumberEncodeValueMatcherList
            r0.<init>()
            r2.invoke(r0)
            r1.usingNumbers(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodMatcher usingNumbers(@Yue.InterfaceC4418 java.util.Collection<? extends java.lang.Number> r4) {
            r3 = this;
            java.lang.String r0 = "usingNumbers"
            Yue.C3329.m13906(r4, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = Yue.C1210.m6231(r4, r1)
            r0.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        L14:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r4.next()
            java.lang.Number r1 = (java.lang.Number) r1
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r2 = new org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher
            r2.<init>()
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r1 = r2.value(r1)
            r0.add(r1)
            goto L14
        L2d:
            java.util.List r4 = Yue.C1219.m6540(r0)
            r3.usingNumbersMatcher = r4
            return r3
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodMatcher usingNumbers(@Yue.InterfaceC4418 org.luckypray.dexkit.query.NumberEncodeValueMatcherList r2) {
            r1 = this;
            java.lang.String r0 = "usingNumbers"
            Yue.C3329.m13906(r2, r0)
            r1.usingNumbersMatcher = r2
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodMatcher usingNumbers(@Yue.InterfaceC4418 java.lang.Number... r6) {
            r5 = this;
            java.lang.String r0 = "usingNumbers"
            Yue.C3329.m13906(r6, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.length
            r0.<init>(r1)
            int r1 = r6.length
            r2 = 0
        Ld:
            if (r2 >= r1) goto L20
            r3 = r6[r2]
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r4 = new org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher
            r4.<init>()
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r3 = r4.value(r3)
            r0.add(r3)
            int r2 = r2 + 1
            goto Ld
        L20:
            java.util.List r6 = Yue.C1219.m6540(r0)
            r5.usingNumbersMatcher = r6
            return r5
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.MethodMatcher usingStrings(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.StringMatcherList r0 = new org.luckypray.dexkit.query.StringMatcherList
            r0.<init>()
            r2.invoke(r0)
            r1.usingStrings(r0)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.MethodMatcher usingStrings(@Yue.InterfaceC4418 java.util.Collection<java.lang.String> r8) {
            r7 = this;
            java.lang.String r0 = "usingStrings"
            Yue.C3329.m13906(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.MethodMatcher r8 = usingStrings$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.MethodMatcher usingStrings(@Yue.InterfaceC4418 java.util.Collection<java.lang.String> r8, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r9) {
            r7 = this;
            java.lang.String r0 = "usingStrings"
            Yue.C3329.m13906(r8, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            org.luckypray.dexkit.query.matchers.MethodMatcher r8 = usingStrings$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.MethodMatcher usingStrings(@Yue.InterfaceC4418 java.util.Collection<java.lang.String> r4, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r5, boolean r6) {
            r3 = this;
            java.lang.String r0 = "usingStrings"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r5, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = Yue.C1210.m6231(r4, r1)
            r0.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        L19:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            org.luckypray.dexkit.query.matchers.base.StringMatcher r2 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r2.<init>(r1, r5, r6)
            r0.add(r2)
            goto L19
        L2e:
            java.util.List r4 = Yue.C1219.m6540(r0)
            r3.usingStringsMatcher = r4
            return r3
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodMatcher usingStrings(@Yue.InterfaceC4418 org.luckypray.dexkit.query.StringMatcherList r2) {
            r1 = this;
            java.lang.String r0 = "usingStrings"
            Yue.C3329.m13906(r2, r0)
            r1.usingStringsMatcher = r2
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.MethodMatcher usingStrings(@Yue.InterfaceC4418 java.lang.String... r11) {
            r10 = this;
            java.lang.String r0 = "usingStrings"
            Yue.C3329.m13906(r11, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r11.length
            r0.<init>(r1)
            int r1 = r11.length
            r2 = 0
        Ld:
            if (r2 >= r1) goto L21
            r4 = r11[r2]
            org.luckypray.dexkit.query.matchers.base.StringMatcher r9 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r7 = 6
            r8 = 0
            r5 = 0
            r6 = 0
            r3 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            r0.add(r9)
            int r2 = r2 + 1
            goto Ld
        L21:
            java.util.List r11 = Yue.C1219.m6540(r0)
            r10.usingStringsMatcher = r11
            return r10
    }
}
