package org.luckypray.dexkit.query.matchers;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nClassMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassMatcher.kt\norg/luckypray/dexkit/query/matchers/ClassMatcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1160:1\n1547#2:1161\n1618#2,3:1162\n1547#2:1169\n1618#2,3:1170\n1547#2:1178\n1618#2,3:1179\n1547#2:1182\n1618#2,3:1183\n1547#2:1186\n1618#2,3:1187\n1547#2:1190\n1618#2,3:1191\n11328#3:1165\n11663#3,3:1166\n11328#3:1173\n11663#3,3:1174\n1#4:1177\n*S KotlinDebug\n*F\n+ 1 ClassMatcher.kt\norg/luckypray/dexkit/query/matchers/ClassMatcher\n*L\n797#1:1161\n797#1:1162,3\n825#1:1169\n825#1:1170,3\n1147#1:1178\n1147#1:1179,3\n1149#1:1182\n1149#1:1183,3\n1151#1:1186\n1151#1:1187,3\n1153#1:1190\n1153#1:1191,3\n813#1:1165\n813#1:1166,3\n837#1:1173\n837#1:1174,3\n*E\n"})
@kotlin.Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010!\n\u0002\b\u001e\u0018\u0000 ¦\u00012\u00020\u00012\u00020\u0002:\u0002¦\u0001B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0015\b\u0016\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\u0003\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0003\u0010\nJ\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u000e\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u000fJ+\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00192\b\b\u0002\u0010\u0011\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u0017\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u001c\u0010\u0014J\u0015\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0000¢\u0006\u0004\b\"\u0010\u001dJ+\u0010\"\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\"\u0010\u0014J\u0015\u0010$\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0019¢\u0006\u0004\b$\u0010%J\u0015\u0010$\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b$\u0010(J\u0015\u0010$\u001a\u00020\u00002\u0006\u0010'\u001a\u00020)¢\u0006\u0004\b$\u0010*J!\u0010$\u001a\u00020\u00002\b\b\u0002\u0010+\u001a\u00020\u00192\b\b\u0002\u0010,\u001a\u00020\u0019¢\u0006\u0004\b$\u0010-J\u0015\u0010/\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b/\u00100J\u0015\u00103\u001a\u00020\u00002\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\u0015\u00105\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0019¢\u0006\u0004\b5\u0010%J\u0015\u00105\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b5\u0010(J\u0015\u00105\u001a\u00020\u00002\u0006\u0010'\u001a\u00020)¢\u0006\u0004\b5\u0010*J!\u00105\u001a\u00020\u00002\b\b\u0002\u0010+\u001a\u00020\u00192\b\b\u0002\u0010,\u001a\u00020\u0019¢\u0006\u0004\b5\u0010-J\u0015\u00107\u001a\u00020\u00002\u0006\u00107\u001a\u000206¢\u0006\u0004\b7\u00108J\u0015\u0010;\u001a\u00020\u00002\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<J+\u0010>\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b>\u0010\u0014J+\u0010@\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b@\u0010\u0014J\u0019\u0010@\u001a\u00020\u00002\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b@\u0010AJ\u0015\u0010B\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0019¢\u0006\u0004\bB\u0010%J\u0015\u0010B\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&¢\u0006\u0004\bB\u0010(J\u0015\u0010B\u001a\u00020\u00002\u0006\u0010'\u001a\u00020)¢\u0006\u0004\bB\u0010*J!\u0010B\u001a\u00020\u00002\b\b\u0002\u0010+\u001a\u00020\u00192\b\b\u0002\u0010,\u001a\u00020\u0019¢\u0006\u0004\bB\u0010-J\u0015\u0010D\u001a\u00020\u00002\u0006\u0010D\u001a\u00020C¢\u0006\u0004\bD\u0010EJ\u0015\u0010H\u001a\u00020\u00002\u0006\u0010G\u001a\u00020F¢\u0006\u0004\bH\u0010IJ\u0015\u0010J\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0019¢\u0006\u0004\bJ\u0010%J\u0015\u0010J\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&¢\u0006\u0004\bJ\u0010(J\u0015\u0010J\u001a\u00020\u00002\u0006\u0010'\u001a\u00020)¢\u0006\u0004\bJ\u0010*J!\u0010J\u001a\u00020\u00002\b\b\u0002\u0010+\u001a\u00020\u00192\b\b\u0002\u0010,\u001a\u00020\u0019¢\u0006\u0004\bJ\u0010-J\u0015\u0010L\u001a\u00020\u00002\u0006\u0010L\u001a\u00020K¢\u0006\u0004\bL\u0010MJ1\u0010L\u001a\u00020\u00002\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\b0N2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\bL\u0010OJ!\u0010L\u001a\u00020\u00002\u0012\u0010L\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0P\"\u00020\b¢\u0006\u0004\bL\u0010QJ\u001b\u0010R\u001a\u00020\u00002\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\b0N¢\u0006\u0004\bR\u0010SJ!\u0010R\u001a\u00020\u00002\u0012\u0010L\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0P\"\u00020\b¢\u0006\u0004\bR\u0010QJ\u0015\u0010U\u001a\u00020\u00002\u0006\u0010T\u001a\u00020\f¢\u0006\u0004\bU\u0010\u000fJ+\u0010U\u001a\u00020\u00002\u0006\u0010T\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\bU\u0010\u0014J\u0015\u0010V\u001a\u00020\u00002\u0006\u0010T\u001a\u00020\b¢\u0006\u0004\bV\u0010\u000bJ\u001b\u0010X\u001a\u00020\u00002\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00000N¢\u0006\u0004\bX\u0010SJ!\u0010X\u001a\u00020\u00002\u0012\u0010W\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000P\"\u00020\u0000¢\u0006\u0004\bX\u0010YJ\u0015\u0010Z\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000¢\u0006\u0004\bZ\u0010\u001dJ\u001b\u0010[\u001a\u00020\u00002\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00000N¢\u0006\u0004\b[\u0010SJ!\u0010[\u001a\u00020\u00002\u0012\u0010W\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000P\"\u00020\u0000¢\u0006\u0004\b[\u0010YJ\u0015\u0010\\\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b\\\u0010\u001dJ\u001b\u0010]\u001a\u00020\u00002\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00000N¢\u0006\u0004\b]\u0010SJ!\u0010]\u001a\u00020\u00002\u0012\u0010W\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000P\"\u00020\u0000¢\u0006\u0004\b]\u0010YJ\u0015\u0010^\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b^\u0010\u001dJ\u0015\u0010_\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b_\u0010\u001dJ&\u0010\u001c\u001a\u00020\u00002\u0017\u0010c\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020a0`¢\u0006\u0002\bb¢\u0006\u0004\b\u001c\u0010dJ&\u0010\u001f\u001a\u00020\u00002\u0017\u0010c\u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020a0`¢\u0006\u0002\bb¢\u0006\u0004\b\u001f\u0010dJ&\u0010\"\u001a\u00020\u00002\u0017\u0010c\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020a0`¢\u0006\u0002\bb¢\u0006\u0004\b\"\u0010dJ&\u0010/\u001a\u00020\u00002\u0017\u0010c\u001a\u0013\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020a0`¢\u0006\u0002\bb¢\u0006\u0004\b/\u0010dJ&\u00103\u001a\u00020\u00002\u0017\u0010c\u001a\u0013\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020a0`¢\u0006\u0002\bb¢\u0006\u0004\b3\u0010dJ&\u00107\u001a\u00020\u00002\u0017\u0010c\u001a\u0013\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020a0`¢\u0006\u0002\bb¢\u0006\u0004\b7\u0010dJ&\u0010;\u001a\u00020\u00002\u0017\u0010c\u001a\u0013\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020a0`¢\u0006\u0002\bb¢\u0006\u0004\b;\u0010dJ&\u0010D\u001a\u00020\u00002\u0017\u0010c\u001a\u0013\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020a0`¢\u0006\u0002\bb¢\u0006\u0004\bD\u0010dJ&\u0010H\u001a\u00020\u00002\u0017\u0010c\u001a\u0013\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020a0`¢\u0006\u0002\bb¢\u0006\u0004\bH\u0010dJ&\u0010L\u001a\u00020\u00002\u0017\u0010c\u001a\u0013\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020a0`¢\u0006\u0002\bb¢\u0006\u0004\bL\u0010dJ&\u0010X\u001a\u00020\u00002\u0017\u0010c\u001a\u0013\u0012\u0004\u0012\u00020e\u0012\u0004\u0012\u00020a0`¢\u0006\u0002\bb¢\u0006\u0004\bX\u0010dJ&\u0010Z\u001a\u00020\u00002\u0017\u0010c\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020a0`¢\u0006\u0002\bb¢\u0006\u0004\bZ\u0010dJ&\u0010[\u001a\u00020\u00002\u0017\u0010c\u001a\u0013\u0012\u0004\u0012\u00020e\u0012\u0004\u0012\u00020a0`¢\u0006\u0002\bb¢\u0006\u0004\b[\u0010dJ&\u0010\\\u001a\u00020\u00002\u0017\u0010c\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020a0`¢\u0006\u0002\bb¢\u0006\u0004\b\\\u0010dJ&\u0010]\u001a\u00020\u00002\u0017\u0010c\u001a\u0013\u0012\u0004\u0012\u00020e\u0012\u0004\u0012\u00020a0`¢\u0006\u0002\bb¢\u0006\u0004\b]\u0010dJ&\u0010^\u001a\u00020\u00002\u0017\u0010c\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020a0`¢\u0006\u0002\bb¢\u0006\u0004\b^\u0010dJ&\u0010_\u001a\u00020\u00002\u0017\u0010c\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020a0`¢\u0006\u0002\bb¢\u0006\u0004\b_\u0010dJ\u0017\u0010h\u001a\u00020\u00192\u0006\u0010g\u001a\u00020fH\u0014¢\u0006\u0004\bh\u0010iR(\u0010k\u001a\u0004\u0018\u00010\f2\b\u0010j\u001a\u0004\u0018\u00010\f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR(\u0010o\u001a\u0004\u0018\u00010\f2\b\u0010j\u001a\u0004\u0018\u00010\f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bo\u0010l\u001a\u0004\bp\u0010nR(\u0010q\u001a\u0004\u0018\u00010\u00162\b\u0010j\u001a\u0004\u0018\u00010\u00168\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010tR(\u0010u\u001a\u0004\u0018\u00010\u00002\b\u0010j\u001a\u0004\u0018\u00010\u00008\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010xR(\u0010y\u001a\u0004\u0018\u00010\u001e2\b\u0010j\u001a\u0004\u0018\u00010\u001e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\b{\u0010|R)\u0010}\u001a\u0004\u0018\u00010.2\b\u0010j\u001a\u0004\u0018\u00010.8\u0006@BX\u0086\u000e¢\u0006\r\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R-\u0010\u0081\u0001\u001a\u0004\u0018\u0001062\b\u0010j\u001a\u0004\u0018\u0001068\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R-\u0010\u0085\u0001\u001a\u0004\u0018\u00010C2\b\u0010j\u001a\u0004\u0018\u00010C8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R;\u0010\u008a\u0001\u001a\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u0089\u00012\u000f\u0010j\u001a\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u0089\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R;\u0010\u008e\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0089\u00012\u000f\u0010j\u001a\u000b\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0089\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u008e\u0001\u0010\u008b\u0001\u001a\u0006\b\u008f\u0001\u0010\u008d\u0001R;\u0010\u0090\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0089\u00012\u000f\u0010j\u001a\u000b\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0089\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0090\u0001\u0010\u008b\u0001\u001a\u0006\b\u0091\u0001\u0010\u008d\u0001R;\u0010\u0092\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0089\u00012\u000f\u0010j\u001a\u000b\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0089\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0092\u0001\u0010\u008b\u0001\u001a\u0006\b\u0093\u0001\u0010\u008d\u0001R(\u0010\t\u001a\u00020\b2\u0007\u0010\u0094\u0001\u001a\u00020\b8G@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0005\b\u0097\u0001\u0010\nR(\u0010\u000e\u001a\u00020\b2\u0007\u0010\u0094\u0001\u001a\u00020\b8G@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u0098\u0001\u0010\u0096\u0001\"\u0005\b\u0099\u0001\u0010\nR(\u0010\u0015\u001a\u00020\b2\u0007\u0010\u0094\u0001\u001a\u00020\b8G@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u009a\u0001\u0010\u0096\u0001\"\u0005\b\u009b\u0001\u0010\nR)\u0010\u0017\u001a\u00020\u00192\u0007\u0010\u0094\u0001\u001a\u00020\u00198G@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R(\u0010\u001c\u001a\u00020\b2\u0007\u0010\u0094\u0001\u001a\u00020\b8G@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b \u0001\u0010\u0096\u0001\"\u0005\b¡\u0001\u0010\nR5\u0010L\u001a\b\u0012\u0004\u0012\u00020\b0N2\r\u0010\u0094\u0001\u001a\b\u0012\u0004\u0012\u00020\b0N8G@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0006\b¤\u0001\u0010¥\u0001¨\u0006§\u0001"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "Lorg/luckypray/dexkit/query/base/BaseMatcher;", "Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;", "<init>", "()V", "Ljava/lang/Class;", "clazz", "(Ljava/lang/Class;)V", "", "descriptor", "(Ljava/lang/String;)V", "(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "matcher", "source", "(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "Lorg/luckypray/dexkit/query/enums/StringMatchType;", "matchType", "", "ignoreCase", "(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "className", "Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;", "modifiers", "(Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "", "Lorg/luckypray/dexkit/query/enums/MatchType;", "(ILorg/luckypray/dexkit/query/enums/MatchType;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "superClass", "(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;", "interfaces", "(Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "interfaceMatcher", "addInterface", "count", "interfaceCount", "(I)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "Lorg/luckypray/dexkit/query/matchers/base/IntRange;", "range", "(Lorg/luckypray/dexkit/query/matchers/base/IntRange;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "LYue/ۥ۠ۥۣۨ;", "(LYue/ۥ۠ۥۣۨ;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "min", "max", "(II)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;", "annotations", "(Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;", "annotationMatcher", "addAnnotation", "(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "annotationCount", "Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;", "fields", "(Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "fieldMatcher", "addField", "(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "fieldName", "addFieldForName", "typeName", "addFieldForType", "(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "fieldCount", "Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;", "methods", "(Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;", "methodMatcher", "addMethod", "(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "methodCount", "Lorg/luckypray/dexkit/query/StringMatcherList;", "usingStrings", "(Lorg/luckypray/dexkit/query/StringMatcherList;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "", "(Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "", "([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "usingEqStrings", "(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "usingString", "addUsingString", "addEqString", "matchers", "allOf", "([Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "addAllOf", "anyOf", "addAnyOf", "noneOf", "addNoneOf", "not", "Lkotlin/Function1;", "LYue/ۥۣۢ۠ۤ;", "LYue/ۥ۠ۡۥۧ;", "init", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "Lorg/luckypray/dexkit/query/ClassMatcherList;", "Lcom/google/flatbuffers/FlatBufferBuilder;", "fbb", "innerBuild", "(Lcom/google/flatbuffers/FlatBufferBuilder;)I", "<set-?>", "sourceMatcher", "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "getSourceMatcher", "()Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "classNameMatcher", "getClassNameMatcher", "modifiersMatcher", "Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;", "getModifiersMatcher", "()Lorg/luckypray/dexkit/query/matchers/base/AccessFlagsMatcher;", "superClassMatcher", "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "getSuperClassMatcher", "()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "interfacesMatcher", "Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;", "getInterfacesMatcher", "()Lorg/luckypray/dexkit/query/matchers/InterfacesMatcher;", "annotationsMatcher", "Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;", "getAnnotationsMatcher", "()Lorg/luckypray/dexkit/query/matchers/AnnotationsMatcher;", "fieldsMatcher", "Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;", "getFieldsMatcher", "()Lorg/luckypray/dexkit/query/matchers/FieldsMatcher;", "methodsMatcher", "Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;", "getMethodsMatcher", "()Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;", "", "usingStringsMatcher", "Ljava/util/List;", "getUsingStringsMatcher", "()Ljava/util/List;", "allOfMatchers", "getAllOfMatchers", "anyOfMatchers", "getAnyOfMatchers", "noneOfMatchers", "getNoneOfMatchers", "value", "getDescriptor", "()Ljava/lang/String;", "setDescriptor", "getSource", "setSource", "getClassName", "setClassName", "getModifiers", "()I", "setModifiers", "(I)V", "getSuperClass", "setSuperClass", "getUsingStrings", "()Ljava/util/Collection;", "setUsingStrings", "(Ljava/util/Collection;)V", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class ClassMatcher extends org.luckypray.dexkit.query.base.BaseMatcher implements org.luckypray.dexkit.query.base.IAnnotationEncodeValue {

    @Yue.InterfaceC4418
    public static final org.luckypray.dexkit.query.matchers.ClassMatcher.Companion Companion = null;

    @Yue.InterfaceC4543
    private java.util.List<org.luckypray.dexkit.query.matchers.ClassMatcher> allOfMatchers;

    @Yue.InterfaceC4543
    private org.luckypray.dexkit.query.matchers.AnnotationsMatcher annotationsMatcher;

    @Yue.InterfaceC4543
    private java.util.List<org.luckypray.dexkit.query.matchers.ClassMatcher> anyOfMatchers;

    @Yue.InterfaceC4543
    private org.luckypray.dexkit.query.matchers.base.StringMatcher classNameMatcher;

    @Yue.InterfaceC4543
    private org.luckypray.dexkit.query.matchers.FieldsMatcher fieldsMatcher;

    @Yue.InterfaceC4543
    private org.luckypray.dexkit.query.matchers.InterfacesMatcher interfacesMatcher;

    @Yue.InterfaceC4543
    private org.luckypray.dexkit.query.matchers.MethodsMatcher methodsMatcher;

    @Yue.InterfaceC4543
    private org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher modifiersMatcher;

    @Yue.InterfaceC4543
    private java.util.List<org.luckypray.dexkit.query.matchers.ClassMatcher> noneOfMatchers;

    @Yue.InterfaceC4543
    private org.luckypray.dexkit.query.matchers.base.StringMatcher sourceMatcher;

    @Yue.InterfaceC4543
    private org.luckypray.dexkit.query.matchers.ClassMatcher superClassMatcher;

    @Yue.InterfaceC4543
    private java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> usingStringsMatcher;

    @Yue.InterfaceC4201(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0014\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/ClassMatcher$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "clazz", "Ljava/lang/Class;", "descriptor", "", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
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
        public final org.luckypray.dexkit.query.matchers.ClassMatcher create() {
                r1 = this;
                org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
                r0.<init>()
                return r0
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        public final org.luckypray.dexkit.query.matchers.ClassMatcher create(@Yue.InterfaceC4418 java.lang.Class<?> r2) {
                r1 = this;
                java.lang.String r0 = "clazz"
                Yue.C3329.m13906(r2, r0)
                org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
                r0.<init>(r2)
                return r0
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        public final org.luckypray.dexkit.query.matchers.ClassMatcher create(@Yue.InterfaceC4418 java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "descriptor"
                Yue.C3329.m13906(r2, r0)
                org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
                r0.<init>(r2)
                return r0
        }
    }

    static {
            org.luckypray.dexkit.query.matchers.ClassMatcher$Companion r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.query.matchers.ClassMatcher.Companion = r0
            return
    }

    public ClassMatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    public ClassMatcher(@Yue.InterfaceC4418 java.lang.Class<?> r8) {
            r7 = this;
            java.lang.String r0 = "clazz"
            Yue.C3329.m13906(r8, r0)
            r7.<init>()
            java.lang.String r2 = org.luckypray.dexkit.util.DexSignUtil.getClassDescriptor(r8)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            className$default(r1, r2, r3, r4, r5, r6)
            return
    }

    public ClassMatcher(@Yue.InterfaceC4418 java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "descriptor"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.descriptor(r2)
            return
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher addFieldForName$default(org.luckypray.dexkit.query.matchers.ClassMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r0.addFieldForName(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher addFieldForType$default(org.luckypray.dexkit.query.matchers.ClassMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r0.addFieldForType(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher addInterface$default(org.luckypray.dexkit.query.matchers.ClassMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r0.addInterface(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher addUsingString$default(org.luckypray.dexkit.query.matchers.ClassMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Contains
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r0.addUsingString(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher annotationCount$default(org.luckypray.dexkit.query.matchers.ClassMatcher r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            r2 = 2147483647(0x7fffffff, float:NaN)
        Lc:
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r0.annotationCount(r1, r2)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher className$default(org.luckypray.dexkit.query.matchers.ClassMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r0.className(r1, r2, r3)
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.query.matchers.ClassMatcher create() {
            org.luckypray.dexkit.query.matchers.ClassMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.ClassMatcher.Companion
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r0.create()
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.query.matchers.ClassMatcher create(@Yue.InterfaceC4418 java.lang.Class<?> r1) {
            org.luckypray.dexkit.query.matchers.ClassMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.ClassMatcher.Companion
            org.luckypray.dexkit.query.matchers.ClassMatcher r1 = r0.create(r1)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.query.matchers.ClassMatcher create(@Yue.InterfaceC4418 java.lang.String r1) {
            org.luckypray.dexkit.query.matchers.ClassMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.ClassMatcher.Companion
            org.luckypray.dexkit.query.matchers.ClassMatcher r1 = r0.create(r1)
            return r1
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher fieldCount$default(org.luckypray.dexkit.query.matchers.ClassMatcher r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            r2 = 2147483647(0x7fffffff, float:NaN)
        Lc:
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r0.fieldCount(r1, r2)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher interfaceCount$default(org.luckypray.dexkit.query.matchers.ClassMatcher r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            r2 = 2147483647(0x7fffffff, float:NaN)
        Lc:
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r0.interfaceCount(r1, r2)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher methodCount$default(org.luckypray.dexkit.query.matchers.ClassMatcher r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            r2 = 2147483647(0x7fffffff, float:NaN)
        Lc:
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r0.methodCount(r1, r2)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher modifiers$default(org.luckypray.dexkit.query.matchers.ClassMatcher r0, int r1, org.luckypray.dexkit.query.enums.MatchType r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            org.luckypray.dexkit.query.enums.MatchType r2 = org.luckypray.dexkit.query.enums.MatchType.Contains
        L6:
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r0.modifiers(r1, r2)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher source$default(org.luckypray.dexkit.query.matchers.ClassMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r0.source(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher superClass$default(org.luckypray.dexkit.query.matchers.ClassMatcher r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r0.superClass(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher usingStrings$default(org.luckypray.dexkit.query.matchers.ClassMatcher r0, java.util.Collection r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Contains
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r0.usingStrings(r1, r2, r3)
            return r0
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher addAllOf(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addAllOf(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.ClassMatcher addAllOf(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.ClassMatcher r2) {
            r1 = this;
            java.lang.String r0 = "matcher"
            Yue.C3329.m13906(r2, r0)
            java.util.List<org.luckypray.dexkit.query.matchers.ClassMatcher> r0 = r1.allOfMatchers
            if (r0 != 0) goto Le
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Le:
            r1.allOfMatchers = r0
            Yue.C3329.m13903(r0)
            r0.add(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher addAnnotation(Yue.InterfaceC2825 r2) {
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
    public final org.luckypray.dexkit.query.matchers.ClassMatcher addAnnotation(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.AnnotationMatcher r2) {
            r1 = this;
            java.lang.String r0 = "annotationMatcher"
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

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher addAnyOf(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addAnyOf(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.ClassMatcher addAnyOf(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.ClassMatcher r2) {
            r1 = this;
            java.lang.String r0 = "matcher"
            Yue.C3329.m13906(r2, r0)
            java.util.List<org.luckypray.dexkit.query.matchers.ClassMatcher> r0 = r1.anyOfMatchers
            if (r0 != 0) goto Le
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Le:
            r1.anyOfMatchers = r0
            Yue.C3329.m13903(r0)
            r0.add(r2)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.ClassMatcher addEqString(@Yue.InterfaceC4418 java.lang.String r5) {
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

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher addField(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addField(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.ClassMatcher addField(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.FieldMatcher r2) {
            r1 = this;
            java.lang.String r0 = "fieldMatcher"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.FieldsMatcher r0 = r1.fieldsMatcher
            if (r0 != 0) goto Le
            org.luckypray.dexkit.query.matchers.FieldsMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldsMatcher
            r0.<init>()
        Le:
            r1.fieldsMatcher = r0
            Yue.C3329.m13903(r0)
            r0.add(r2)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.ClassMatcher addFieldForName(@Yue.InterfaceC4418 java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "fieldName"
            Yue.C3329.m13906(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.ClassMatcher r8 = addFieldForName$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.ClassMatcher addFieldForName(@Yue.InterfaceC4418 java.lang.String r8, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r9) {
            r7 = this;
            java.lang.String r0 = "fieldName"
            Yue.C3329.m13906(r8, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            org.luckypray.dexkit.query.matchers.ClassMatcher r8 = addFieldForName$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.ClassMatcher addFieldForName(@Yue.InterfaceC4418 java.lang.String r3, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r4, boolean r5) {
            r2 = this;
            java.lang.String r0 = "fieldName"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r4, r0)
            org.luckypray.dexkit.query.matchers.FieldsMatcher r0 = r2.fieldsMatcher
            if (r0 != 0) goto L13
            org.luckypray.dexkit.query.matchers.FieldsMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldsMatcher
            r0.<init>()
        L13:
            r2.fieldsMatcher = r0
            Yue.C3329.m13903(r0)
            org.luckypray.dexkit.query.matchers.FieldMatcher r1 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r1.<init>()
            org.luckypray.dexkit.query.matchers.FieldMatcher r3 = r1.name(r3, r4, r5)
            r0.add(r3)
            return r2
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.ClassMatcher addFieldForType(@Yue.InterfaceC4418 java.lang.Class<?> r3) {
            r2 = this;
            java.lang.String r0 = "clazz"
            Yue.C3329.m13906(r3, r0)
            org.luckypray.dexkit.query.matchers.FieldsMatcher r0 = r2.fieldsMatcher
            if (r0 != 0) goto Le
            org.luckypray.dexkit.query.matchers.FieldsMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldsMatcher
            r0.<init>()
        Le:
            r2.fieldsMatcher = r0
            Yue.C3329.m13903(r0)
            org.luckypray.dexkit.query.matchers.FieldMatcher r1 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r1.<init>()
            org.luckypray.dexkit.query.matchers.FieldMatcher r3 = r1.type(r3)
            r0.add(r3)
            return r2
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.ClassMatcher addFieldForType(@Yue.InterfaceC4418 java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "typeName"
            Yue.C3329.m13906(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.ClassMatcher r8 = addFieldForType$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.ClassMatcher addFieldForType(@Yue.InterfaceC4418 java.lang.String r8, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r9) {
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
            org.luckypray.dexkit.query.matchers.ClassMatcher r8 = addFieldForType$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.ClassMatcher addFieldForType(@Yue.InterfaceC4418 java.lang.String r3, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r4, boolean r5) {
            r2 = this;
            java.lang.String r0 = "typeName"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r4, r0)
            org.luckypray.dexkit.query.matchers.FieldsMatcher r0 = r2.fieldsMatcher
            if (r0 != 0) goto L13
            org.luckypray.dexkit.query.matchers.FieldsMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldsMatcher
            r0.<init>()
        L13:
            r2.fieldsMatcher = r0
            Yue.C3329.m13903(r0)
            org.luckypray.dexkit.query.matchers.FieldMatcher r1 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r1.<init>()
            org.luckypray.dexkit.query.matchers.FieldMatcher r3 = r1.type(r3, r4, r5)
            r0.add(r3)
            return r2
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher addInterface(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addInterface(r0)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.ClassMatcher addInterface(@Yue.InterfaceC4418 java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "className"
            Yue.C3329.m13906(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.ClassMatcher r8 = addInterface$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.ClassMatcher addInterface(@Yue.InterfaceC4418 java.lang.String r8, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r9) {
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
            org.luckypray.dexkit.query.matchers.ClassMatcher r8 = addInterface$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.ClassMatcher addInterface(@Yue.InterfaceC4418 java.lang.String r3, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r4, boolean r5) {
            r2 = this;
            java.lang.String r0 = "className"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r4, r0)
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r0 = r2.interfacesMatcher
            if (r0 != 0) goto L13
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r0 = new org.luckypray.dexkit.query.matchers.InterfacesMatcher
            r0.<init>()
        L13:
            r2.interfacesMatcher = r0
            Yue.C3329.m13903(r0)
            org.luckypray.dexkit.query.matchers.ClassMatcher r1 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r1.<init>()
            org.luckypray.dexkit.query.matchers.ClassMatcher r3 = r1.className(r3, r4, r5)
            r0.add(r3)
            return r2
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.ClassMatcher addInterface(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.ClassMatcher r2) {
            r1 = this;
            java.lang.String r0 = "interfaceMatcher"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r0 = r1.interfacesMatcher
            if (r0 != 0) goto Le
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r0 = new org.luckypray.dexkit.query.matchers.InterfacesMatcher
            r0.<init>()
        Le:
            r1.interfacesMatcher = r0
            Yue.C3329.m13903(r0)
            r0.add(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher addMethod(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addMethod(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.ClassMatcher addMethod(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.MethodMatcher r2) {
            r1 = this;
            java.lang.String r0 = "methodMatcher"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = r1.methodsMatcher
            if (r0 != 0) goto Le
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r0.<init>()
        Le:
            r1.methodsMatcher = r0
            Yue.C3329.m13903(r0)
            r0.add(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher addNoneOf(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.addNoneOf(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.ClassMatcher addNoneOf(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.ClassMatcher r2) {
            r1 = this;
            java.lang.String r0 = "matcher"
            Yue.C3329.m13906(r2, r0)
            java.util.List<org.luckypray.dexkit.query.matchers.ClassMatcher> r0 = r1.noneOfMatchers
            if (r0 != 0) goto Le
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Le:
            r1.noneOfMatchers = r0
            Yue.C3329.m13903(r0)
            r0.add(r2)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.ClassMatcher addUsingString(@Yue.InterfaceC4418 java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "usingString"
            Yue.C3329.m13906(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.ClassMatcher r8 = addUsingString$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.ClassMatcher addUsingString(@Yue.InterfaceC4418 java.lang.String r8, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r9) {
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
            org.luckypray.dexkit.query.matchers.ClassMatcher r8 = addUsingString$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.ClassMatcher addUsingString(@Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r3, boolean r4) {
            r1 = this;
            java.lang.String r0 = "usingString"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r3, r0)
            org.luckypray.dexkit.query.matchers.base.StringMatcher r0 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r0.<init>(r2, r3, r4)
            r1.addUsingString(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.ClassMatcher addUsingString(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.base.StringMatcher r2) {
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

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher allOf(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.ClassMatcherList r0 = new org.luckypray.dexkit.query.ClassMatcherList
            r0.<init>()
            r2.invoke(r0)
            r1.allOf(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.ClassMatcher allOf(@Yue.InterfaceC4418 java.util.Collection<org.luckypray.dexkit.query.matchers.ClassMatcher> r3) {
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
    public final org.luckypray.dexkit.query.matchers.ClassMatcher allOf(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.ClassMatcher... r2) {
            r1 = this;
            java.lang.String r0 = "matchers"
            Yue.C3329.m13906(r2, r0)
            java.util.List r2 = Yue.C0586.m2116(r2)
            r1.allOf(r2)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.ClassMatcher annotationCount(int r2) {
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
    public final org.luckypray.dexkit.query.matchers.ClassMatcher annotationCount(int r2, int r3) {
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
    public final org.luckypray.dexkit.query.matchers.ClassMatcher annotationCount(@Yue.InterfaceC4418 Yue.C3279 r2) {
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
    public final org.luckypray.dexkit.query.matchers.ClassMatcher annotationCount(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.base.IntRange r2) {
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

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher annotations(Yue.InterfaceC2825 r2) {
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
    public final org.luckypray.dexkit.query.matchers.ClassMatcher annotations(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.AnnotationsMatcher r2) {
            r1 = this;
            java.lang.String r0 = "annotations"
            Yue.C3329.m13906(r2, r0)
            r1.annotationsMatcher = r2
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher anyOf(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.ClassMatcherList r0 = new org.luckypray.dexkit.query.ClassMatcherList
            r0.<init>()
            r2.invoke(r0)
            r1.anyOf(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.ClassMatcher anyOf(@Yue.InterfaceC4418 java.util.Collection<org.luckypray.dexkit.query.matchers.ClassMatcher> r3) {
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
    public final org.luckypray.dexkit.query.matchers.ClassMatcher anyOf(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.ClassMatcher... r2) {
            r1 = this;
            java.lang.String r0 = "matchers"
            Yue.C3329.m13906(r2, r0)
            java.util.List r2 = Yue.C0586.m2116(r2)
            r1.anyOf(r2)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.ClassMatcher className(@Yue.InterfaceC4418 java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "className"
            Yue.C3329.m13906(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.ClassMatcher r8 = className$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.ClassMatcher className(@Yue.InterfaceC4418 java.lang.String r8, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r9) {
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
            org.luckypray.dexkit.query.matchers.ClassMatcher r8 = className$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.ClassMatcher className(@Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r3, boolean r4) {
            r1 = this;
            java.lang.String r0 = "className"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r3, r0)
            org.luckypray.dexkit.query.matchers.base.StringMatcher r0 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r0.<init>(r2, r3, r4)
            r1.classNameMatcher = r0
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.ClassMatcher className(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.base.StringMatcher r2) {
            r1 = this;
            java.lang.String r0 = "matcher"
            Yue.C3329.m13906(r2, r0)
            r1.classNameMatcher = r2
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.ClassMatcher descriptor(@Yue.InterfaceC4418 java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "descriptor"
            Yue.C3329.m13906(r8, r0)
            org.luckypray.dexkit.wrap.DexClass r0 = new org.luckypray.dexkit.wrap.DexClass
            r0.<init>(r8)
            java.lang.String r2 = r0.getTypeName()
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            className$default(r1, r2, r3, r4, r5, r6)
            return r7
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.ClassMatcher fieldCount(int r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.FieldsMatcher r0 = r1.fieldsMatcher
            if (r0 != 0) goto L9
            org.luckypray.dexkit.query.matchers.FieldsMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldsMatcher
            r0.<init>()
        L9:
            r1.fieldsMatcher = r0
            Yue.C3329.m13903(r0)
            r0.count(r2)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.ClassMatcher fieldCount(int r2, int r3) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.FieldsMatcher r0 = r1.fieldsMatcher
            if (r0 != 0) goto L9
            org.luckypray.dexkit.query.matchers.FieldsMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldsMatcher
            r0.<init>()
        L9:
            r1.fieldsMatcher = r0
            Yue.C3329.m13903(r0)
            r0.count(r2, r3)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.ClassMatcher fieldCount(@Yue.InterfaceC4418 Yue.C3279 r2) {
            r1 = this;
            java.lang.String r0 = "range"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.FieldsMatcher r0 = r1.fieldsMatcher
            if (r0 != 0) goto Le
            org.luckypray.dexkit.query.matchers.FieldsMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldsMatcher
            r0.<init>()
        Le:
            r1.fieldsMatcher = r0
            Yue.C3329.m13903(r0)
            r0.count(r2)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.ClassMatcher fieldCount(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.base.IntRange r2) {
            r1 = this;
            java.lang.String r0 = "range"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.FieldsMatcher r0 = r1.fieldsMatcher
            if (r0 != 0) goto Le
            org.luckypray.dexkit.query.matchers.FieldsMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldsMatcher
            r0.<init>()
        Le:
            r1.fieldsMatcher = r0
            Yue.C3329.m13903(r0)
            r0.count(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher fields(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.FieldsMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldsMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.fields(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.ClassMatcher fields(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.FieldsMatcher r2) {
            r1 = this;
            java.lang.String r0 = "fields"
            Yue.C3329.m13906(r2, r0)
            r1.fieldsMatcher = r2
            return r1
    }

    @Yue.InterfaceC4543
    public final java.util.List<org.luckypray.dexkit.query.matchers.ClassMatcher> getAllOfMatchers() {
            r1 = this;
            java.util.List<org.luckypray.dexkit.query.matchers.ClassMatcher> r0 = r1.allOfMatchers
            return r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.query.matchers.AnnotationsMatcher getAnnotationsMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.AnnotationsMatcher r0 = r1.annotationsMatcher
            return r0
    }

    @Yue.InterfaceC4543
    public final java.util.List<org.luckypray.dexkit.query.matchers.ClassMatcher> getAnyOfMatchers() {
            r1 = this;
            java.util.List<org.luckypray.dexkit.query.matchers.ClassMatcher> r0 = r1.anyOfMatchers
            return r0
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Property can only be written.")
    public final /* synthetic */ java.lang.String getClassName() {
            r3 = this;
            Yue.ۥۡۢۥ۟ r0 = new Yue.ۥۡۢۥ۟
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.query.matchers.base.StringMatcher getClassNameMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.StringMatcher r0 = r1.classNameMatcher
            return r0
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
    public final org.luckypray.dexkit.query.matchers.FieldsMatcher getFieldsMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.FieldsMatcher r0 = r1.fieldsMatcher
            return r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.query.matchers.InterfacesMatcher getInterfacesMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r0 = r1.interfacesMatcher
            return r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.query.matchers.MethodsMatcher getMethodsMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = r1.methodsMatcher
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

    @Yue.InterfaceC4543
    public final java.util.List<org.luckypray.dexkit.query.matchers.ClassMatcher> getNoneOfMatchers() {
            r1 = this;
            java.util.List<org.luckypray.dexkit.query.matchers.ClassMatcher> r0 = r1.noneOfMatchers
            return r0
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Property can only be written.")
    public final /* synthetic */ java.lang.String getSource() {
            r3 = this;
            Yue.ۥۡۢۥ۟ r0 = new Yue.ۥۡۢۥ۟
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.query.matchers.base.StringMatcher getSourceMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.StringMatcher r0 = r1.sourceMatcher
            return r0
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Property can only be written.")
    public final /* synthetic */ java.lang.String getSuperClass() {
            r3 = this;
            Yue.ۥۡۢۥ۟ r0 = new Yue.ۥۡۢۥ۟
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.query.matchers.ClassMatcher getSuperClassMatcher() {
            r1 = this;
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = r1.superClassMatcher
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
    public int innerBuild(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r19) {
            r18 = this;
            r0 = r18
            r15 = r19
            java.lang.String r1 = "fbb"
            Yue.C3329.m13906(r15, r1)
            org.luckypray.dexkit.schema.-ClassMatcher$Companion r1 = org.luckypray.dexkit.schema.ClassMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.StringMatcher r2 = r0.sourceMatcher
            if (r2 == 0) goto L15
            int r2 = r2.build$dexkit_android_release(r15)
            r4 = r2
            goto L16
        L15:
            r4 = 0
        L16:
            org.luckypray.dexkit.query.matchers.base.StringMatcher r2 = r0.classNameMatcher
            if (r2 == 0) goto L20
            int r2 = r2.build$dexkit_android_release(r15)
            r5 = r2
            goto L21
        L20:
            r5 = 0
        L21:
            org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher r2 = r0.modifiersMatcher
            if (r2 == 0) goto L2b
            int r2 = r2.build$dexkit_android_release(r15)
            r6 = r2
            goto L2c
        L2b:
            r6 = 0
        L2c:
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = r0.superClassMatcher
            if (r2 == 0) goto L36
            int r2 = r2.build$dexkit_android_release(r15)
            r7 = r2
            goto L37
        L36:
            r7 = 0
        L37:
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r2 = r0.interfacesMatcher
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
            org.luckypray.dexkit.query.matchers.FieldsMatcher r2 = r0.fieldsMatcher
            if (r2 == 0) goto L57
            int r2 = r2.build$dexkit_android_release(r15)
            r10 = r2
            goto L58
        L57:
            r10 = 0
        L58:
            org.luckypray.dexkit.query.matchers.MethodsMatcher r2 = r0.methodsMatcher
            if (r2 == 0) goto L62
            int r2 = r2.build$dexkit_android_release(r15)
            r11 = r2
            goto L63
        L62:
            r11 = 0
        L63:
            java.util.List<org.luckypray.dexkit.query.matchers.base.StringMatcher> r2 = r0.usingStringsMatcher
            r12 = 10
            if (r2 == 0) goto L9a
            java.util.ArrayList r13 = new java.util.ArrayList
            int r14 = Yue.C1210.m6231(r2, r12)
            r13.<init>(r14)
            java.util.Iterator r2 = r2.iterator()
        L76:
            boolean r14 = r2.hasNext()
            if (r14 == 0) goto L8e
            java.lang.Object r14 = r2.next()
            org.luckypray.dexkit.query.matchers.base.StringMatcher r14 = (org.luckypray.dexkit.query.matchers.base.StringMatcher) r14
            int r14 = r14.build$dexkit_android_release(r15)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r13.add(r14)
            goto L76
        L8e:
            int[] r2 = Yue.C1219.m6536(r13)
            if (r2 == 0) goto L9a
            int r2 = r15.createVectorOfTables(r2)
            r13 = r2
            goto L9b
        L9a:
            r13 = 0
        L9b:
            java.util.List<org.luckypray.dexkit.query.matchers.ClassMatcher> r2 = r0.allOfMatchers
            if (r2 == 0) goto Ld0
            java.util.ArrayList r14 = new java.util.ArrayList
            int r3 = Yue.C1210.m6231(r2, r12)
            r14.<init>(r3)
            java.util.Iterator r2 = r2.iterator()
        Lac:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lc4
            java.lang.Object r3 = r2.next()
            org.luckypray.dexkit.query.matchers.ClassMatcher r3 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r3
            int r3 = r3.build$dexkit_android_release(r15)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r14.add(r3)
            goto Lac
        Lc4:
            int[] r2 = Yue.C1219.m6536(r14)
            if (r2 == 0) goto Ld0
            int r2 = r15.createVectorOfTables(r2)
            r14 = r2
            goto Ld1
        Ld0:
            r14 = 0
        Ld1:
            java.util.List<org.luckypray.dexkit.query.matchers.ClassMatcher> r2 = r0.anyOfMatchers
            if (r2 == 0) goto L108
            java.util.ArrayList r3 = new java.util.ArrayList
            r17 = r14
            int r14 = Yue.C1210.m6231(r2, r12)
            r3.<init>(r14)
            java.util.Iterator r2 = r2.iterator()
        Le4:
            boolean r14 = r2.hasNext()
            if (r14 == 0) goto Lfc
            java.lang.Object r14 = r2.next()
            org.luckypray.dexkit.query.matchers.ClassMatcher r14 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r14
            int r14 = r14.build$dexkit_android_release(r15)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r3.add(r14)
            goto Le4
        Lfc:
            int[] r2 = Yue.C1219.m6536(r3)
            if (r2 == 0) goto L10a
            int r2 = r15.createVectorOfTables(r2)
            r14 = r2
            goto L10b
        L108:
            r17 = r14
        L10a:
            r14 = 0
        L10b:
            java.util.List<org.luckypray.dexkit.query.matchers.ClassMatcher> r2 = r0.noneOfMatchers
            if (r2 == 0) goto L141
            java.util.ArrayList r3 = new java.util.ArrayList
            int r12 = Yue.C1210.m6231(r2, r12)
            r3.<init>(r12)
            java.util.Iterator r2 = r2.iterator()
        L11c:
            boolean r12 = r2.hasNext()
            if (r12 == 0) goto L134
            java.lang.Object r12 = r2.next()
            org.luckypray.dexkit.query.matchers.ClassMatcher r12 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r12
            int r12 = r12.build$dexkit_android_release(r15)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r3.add(r12)
            goto L11c
        L134:
            int[] r2 = Yue.C1219.m6536(r3)
            if (r2 == 0) goto L141
            int r2 = r15.createVectorOfTables(r2)
            r16 = r2
            goto L143
        L141:
            r16 = 0
        L143:
            r2 = r19
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r13
            r12 = r17
            r13 = r14
            r14 = r16
            int r1 = r1.createClassMatcher(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r15.finish(r1)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.ClassMatcher interfaceCount(int r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r0 = r1.interfacesMatcher
            if (r0 != 0) goto L9
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r0 = new org.luckypray.dexkit.query.matchers.InterfacesMatcher
            r0.<init>()
        L9:
            r1.interfacesMatcher = r0
            Yue.C3329.m13903(r0)
            r0.count(r2)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.ClassMatcher interfaceCount(int r2, int r3) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r0 = r1.interfacesMatcher
            if (r0 != 0) goto L9
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r0 = new org.luckypray.dexkit.query.matchers.InterfacesMatcher
            r0.<init>()
        L9:
            r1.interfacesMatcher = r0
            Yue.C3329.m13903(r0)
            r0.count(r2, r3)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.ClassMatcher interfaceCount(@Yue.InterfaceC4418 Yue.C3279 r2) {
            r1 = this;
            java.lang.String r0 = "range"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r0 = r1.interfacesMatcher
            if (r0 != 0) goto Le
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r0 = new org.luckypray.dexkit.query.matchers.InterfacesMatcher
            r0.<init>()
        Le:
            r1.interfacesMatcher = r0
            Yue.C3329.m13903(r0)
            r0.count(r2)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.ClassMatcher interfaceCount(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.base.IntRange r2) {
            r1 = this;
            java.lang.String r0 = "range"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r0 = r1.interfacesMatcher
            if (r0 != 0) goto Le
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r0 = new org.luckypray.dexkit.query.matchers.InterfacesMatcher
            r0.<init>()
        Le:
            r1.interfacesMatcher = r0
            Yue.C3329.m13903(r0)
            r0.count(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher interfaces(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.InterfacesMatcher r0 = new org.luckypray.dexkit.query.matchers.InterfacesMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.interfaces(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.ClassMatcher interfaces(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.InterfacesMatcher r2) {
            r1 = this;
            java.lang.String r0 = "interfaces"
            Yue.C3329.m13906(r2, r0)
            r1.interfacesMatcher = r2
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.ClassMatcher methodCount(int r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = r1.methodsMatcher
            if (r0 != 0) goto L9
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r0.<init>()
        L9:
            r1.methodsMatcher = r0
            Yue.C3329.m13903(r0)
            r0.count(r2)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.ClassMatcher methodCount(int r2, int r3) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = r1.methodsMatcher
            if (r0 != 0) goto L9
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r0.<init>()
        L9:
            r1.methodsMatcher = r0
            Yue.C3329.m13903(r0)
            r0.count(r2, r3)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.ClassMatcher methodCount(@Yue.InterfaceC4418 Yue.C3279 r2) {
            r1 = this;
            java.lang.String r0 = "range"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = r1.methodsMatcher
            if (r0 != 0) goto Le
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r0.<init>()
        Le:
            r1.methodsMatcher = r0
            Yue.C3329.m13903(r0)
            r0.count(r2)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.ClassMatcher methodCount(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.base.IntRange r2) {
            r1 = this;
            java.lang.String r0 = "range"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = r1.methodsMatcher
            if (r0 != 0) goto Le
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r0.<init>()
        Le:
            r1.methodsMatcher = r0
            Yue.C3329.m13903(r0)
            r0.count(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher methods(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.MethodsMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodsMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.methods(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.ClassMatcher methods(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.MethodsMatcher r2) {
            r1 = this;
            java.lang.String r0 = "methods"
            Yue.C3329.m13906(r2, r0)
            r1.methodsMatcher = r2
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.ClassMatcher modifiers(int r3) {
            r2 = this;
            r0 = 0
            r1 = 2
            org.luckypray.dexkit.query.matchers.ClassMatcher r3 = modifiers$default(r2, r3, r0, r1, r0)
            return r3
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.ClassMatcher modifiers(int r2, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.MatchType r3) {
            r1 = this;
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r3, r0)
            org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher r0 = new org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher
            r0.<init>(r2, r3)
            r1.modifiersMatcher = r0
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.ClassMatcher modifiers(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.base.AccessFlagsMatcher r2) {
            r1 = this;
            java.lang.String r0 = "matcher"
            Yue.C3329.m13906(r2, r0)
            r1.modifiersMatcher = r2
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher noneOf(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.ClassMatcherList r0 = new org.luckypray.dexkit.query.ClassMatcherList
            r0.<init>()
            r2.invoke(r0)
            r1.noneOf(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.ClassMatcher noneOf(@Yue.InterfaceC4418 java.util.Collection<org.luckypray.dexkit.query.matchers.ClassMatcher> r3) {
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
    public final org.luckypray.dexkit.query.matchers.ClassMatcher noneOf(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.ClassMatcher... r2) {
            r1 = this;
            java.lang.String r0 = "matchers"
            Yue.C3329.m13906(r2, r0)
            java.util.List r2 = Yue.C0586.m2116(r2)
            r1.noneOf(r2)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher not(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.not(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.ClassMatcher not(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.ClassMatcher r2) {
            r1 = this;
            java.lang.String r0 = "matcher"
            Yue.C3329.m13906(r2, r0)
            r1.addNoneOf(r2)
            return r1
    }

    public final /* synthetic */ void setClassName(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            className$default(r1, r2, r3, r4, r5, r6)
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

    public final /* synthetic */ void setSource(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            source$default(r1, r2, r3, r4, r5, r6)
            return
    }

    public final void setSuperClass(@Yue.InterfaceC4418 java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            superClass$default(r1, r2, r3, r4, r5, r6)
            return
    }

    public final void setUsingStrings(@Yue.InterfaceC4418 java.util.Collection<java.lang.String> r8) {
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
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.ClassMatcher source(@Yue.InterfaceC4418 java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "source"
            Yue.C3329.m13906(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.ClassMatcher r8 = source$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.ClassMatcher source(@Yue.InterfaceC4418 java.lang.String r8, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r9) {
            r7 = this;
            java.lang.String r0 = "source"
            Yue.C3329.m13906(r8, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            org.luckypray.dexkit.query.matchers.ClassMatcher r8 = source$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.ClassMatcher source(@Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r3, boolean r4) {
            r1 = this;
            java.lang.String r0 = "source"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r3, r0)
            org.luckypray.dexkit.query.matchers.base.StringMatcher r0 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r0.<init>(r2, r3, r4)
            r1.sourceMatcher = r0
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.ClassMatcher source(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.base.StringMatcher r2) {
            r1 = this;
            java.lang.String r0 = "matcher"
            Yue.C3329.m13906(r2, r0)
            r1.sourceMatcher = r2
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher superClass(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.superClass(r0)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.ClassMatcher superClass(@Yue.InterfaceC4418 java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "className"
            Yue.C3329.m13906(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.ClassMatcher r8 = superClass$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.ClassMatcher superClass(@Yue.InterfaceC4418 java.lang.String r8, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r9) {
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
            org.luckypray.dexkit.query.matchers.ClassMatcher r8 = superClass$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.ClassMatcher superClass(@Yue.InterfaceC4418 java.lang.String r3, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r4, boolean r5) {
            r2 = this;
            java.lang.String r0 = "className"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r4, r0)
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r0.<init>()
            org.luckypray.dexkit.query.matchers.base.StringMatcher r1 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r1.<init>(r3, r4, r5)
            org.luckypray.dexkit.query.matchers.ClassMatcher r3 = r0.className(r1)
            r2.superClassMatcher = r3
            return r2
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.ClassMatcher superClass(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.ClassMatcher r2) {
            r1 = this;
            java.lang.String r0 = "superClass"
            Yue.C3329.m13906(r2, r0)
            r1.superClassMatcher = r2
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.ClassMatcher usingEqStrings(@Yue.InterfaceC4418 java.util.Collection<java.lang.String> r6) {
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
    public final org.luckypray.dexkit.query.matchers.ClassMatcher usingEqStrings(@Yue.InterfaceC4418 java.lang.String... r8) {
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

    public final /* synthetic */ org.luckypray.dexkit.query.matchers.ClassMatcher usingStrings(Yue.InterfaceC2825 r2) {
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
    public final org.luckypray.dexkit.query.matchers.ClassMatcher usingStrings(@Yue.InterfaceC4418 java.util.Collection<java.lang.String> r8) {
            r7 = this;
            java.lang.String r0 = "usingStrings"
            Yue.C3329.m13906(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.matchers.ClassMatcher r8 = usingStrings$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.ClassMatcher usingStrings(@Yue.InterfaceC4418 java.util.Collection<java.lang.String> r8, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r9) {
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
            org.luckypray.dexkit.query.matchers.ClassMatcher r8 = usingStrings$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.matchers.ClassMatcher usingStrings(@Yue.InterfaceC4418 java.util.Collection<java.lang.String> r4, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r5, boolean r6) {
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
    public final org.luckypray.dexkit.query.matchers.ClassMatcher usingStrings(@Yue.InterfaceC4418 org.luckypray.dexkit.query.StringMatcherList r2) {
            r1 = this;
            java.lang.String r0 = "usingStrings"
            Yue.C3329.m13906(r2, r0)
            r1.usingStringsMatcher = r2
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.ClassMatcher usingStrings(@Yue.InterfaceC4418 java.lang.String... r11) {
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
