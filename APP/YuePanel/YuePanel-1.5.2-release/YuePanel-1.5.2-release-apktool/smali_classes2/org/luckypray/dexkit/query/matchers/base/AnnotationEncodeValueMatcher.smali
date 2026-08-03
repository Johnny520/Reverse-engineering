.class public final Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/luckypray/dexkit/query/base/QueryComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ac\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0004\n\u0002\u0008\u0003\n\u0002\u0010\u0005\n\u0002\u0008\u0002\n\u0002\u0010\n\n\u0002\u0008\u0002\n\u0002\u0010\u000c\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0018\u0000 J2\u00020\u0001:\u0001JB\t\u0008\u0016\u00a2\u0006\u0004\u0008\u0002\u0010\u0003B\u0019\u0008\u0012\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0002\u0010\u0008J\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u001c\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u001f\u00a2\u0006\u0004\u0008 \u0010!J\u0015\u0010#\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\"\u00a2\u0006\u0004\u0008#\u0010$J+\u0010#\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020%2\u0008\u0008\u0002\u0010\'\u001a\u00020&2\u0008\u0008\u0002\u0010)\u001a\u00020(H\u0007\u00a2\u0006\u0004\u0008#\u0010*J\u0015\u0010,\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020+\u00a2\u0006\u0004\u0008,\u0010-J\u0015\u0010/\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020.\u00a2\u0006\u0004\u0008/\u00100J\u0015\u00102\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u000201\u00a2\u0006\u0004\u00082\u00103J\u0015\u00105\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u000204\u00a2\u0006\u0004\u00085\u00106J\u0015\u00108\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u000207\u00a2\u0006\u0004\u00088\u00109J\r\u0010:\u001a\u00020\u0000\u00a2\u0006\u0004\u0008:\u0010;J\u0015\u0010<\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020(\u00a2\u0006\u0004\u0008<\u0010=J&\u0010,\u001a\u00020\u00002\u0017\u0010A\u001a\u0013\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020?0>\u00a2\u0006\u0002\u0008@\u00a2\u0006\u0004\u0008,\u0010BJ&\u0010/\u001a\u00020\u00002\u0017\u0010A\u001a\u0013\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020?0>\u00a2\u0006\u0002\u0008@\u00a2\u0006\u0004\u0008/\u0010BJ&\u00102\u001a\u00020\u00002\u0017\u0010A\u001a\u0013\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020?0>\u00a2\u0006\u0002\u0008@\u00a2\u0006\u0004\u00082\u0010BJ&\u00105\u001a\u00020\u00002\u0017\u0010A\u001a\u0013\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020?0>\u00a2\u0006\u0002\u0008@\u00a2\u0006\u0004\u00085\u0010BJ&\u00108\u001a\u00020\u00002\u0017\u0010A\u001a\u0013\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020?0>\u00a2\u0006\u0002\u0008@\u00a2\u0006\u0004\u00088\u0010BR(\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0010C\u001a\u0004\u0018\u00010\u00048\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010D\u001a\u0004\u0008E\u0010FR(\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010C\u001a\u0004\u0018\u00010\u00068\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010G\u001a\u0004\u0008H\u0010I\u00a8\u0006K"
    }
    d2 = {
        "Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;",
        "Lorg/luckypray/dexkit/query/base/QueryComponent;",
        "<init>",
        "()V",
        "Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;",
        "value",
        "Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;",
        "type",
        "(Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;)V",
        "",
        "number",
        "numberValue",
        "(Ljava/lang/Number;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;",
        "",
        "byteValue",
        "(B)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;",
        "",
        "shortValue",
        "(S)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;",
        "",
        "charValue",
        "(C)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;",
        "",
        "intValue",
        "(I)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;",
        "",
        "longValue",
        "(J)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;",
        "",
        "floatValue",
        "(F)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;",
        "",
        "doubleValue",
        "(D)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;",
        "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;",
        "stringValue",
        "(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;",
        "",
        "Lorg/luckypray/dexkit/query/enums/StringMatchType;",
        "matchType",
        "",
        "ignoreCase",
        "(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;",
        "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;",
        "classValue",
        "(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;",
        "Lorg/luckypray/dexkit/query/matchers/MethodMatcher;",
        "methodValue",
        "(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;",
        "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;",
        "enumValue",
        "(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;",
        "Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;",
        "arrayValue",
        "(Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;",
        "Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;",
        "annotationValue",
        "(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;",
        "nullValue",
        "()Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;",
        "boolValue",
        "(Z)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;",
        "Lkotlin/Function1;",
        "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
        "LYue/\u06e5\u06e0\u06e1\u06e5\u06e7;",
        "init",
        "(LYue/\u06e5\u06e0\u06e3\u06e1\u06df;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;",
        "<set-?>",
        "Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;",
        "getValue",
        "()Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;",
        "Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;",
        "getType",
        "()Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;",
        "Companion",
        "dexkit-android_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# static fields
.field public static final Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# instance fields
.field private type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field private value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private constructor <init>(Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    .line 5
    iput-object p2, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    return-void
.end method

.method public synthetic constructor <init>(Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;LYue/ۥ۟ۨۥۢ;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>(Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;)V

    return-void
.end method

.method public static final create(Ljava/lang/Number;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1
    .param p0    # Ljava/lang/Number;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->create(Ljava/lang/Number;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static final createAnnotation(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1
    .param p0    # Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createAnnotation(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static final createArray(Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1
    .param p0    # Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createArray(Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static final createBoolean(Z)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createBoolean(Z)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static final createByte(B)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createByte(B)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static final createChar(C)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createChar(C)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static final createClass(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1
    .param p0    # Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createClass(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static final createDouble(D)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    invoke-virtual {v0, p0, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createDouble(D)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static final createEnum(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1
    .param p0    # Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createEnum(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static final createFloat(F)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createFloat(F)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static final createInt(I)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createInt(I)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static final createLong(J)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    invoke-virtual {v0, p0, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createLong(J)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static final createMethod(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1
    .param p0    # Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createMethod(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static final createNull()Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    invoke-virtual {v0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createNull()Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    move-result-object v0

    return-object v0
.end method

.method public static final createShort(S)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createShort(S)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static final createString(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡۡ;
    .end annotation

    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createString(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static final createString(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Lorg/luckypray/dexkit/query/enums/StringMatchType;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡۡ;
    .end annotation

    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .line 2
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    invoke-virtual {v0, p0, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createString(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static final createString(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Lorg/luckypray/dexkit/query/enums/StringMatchType;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡۡ;
    .end annotation

    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .line 3
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    invoke-virtual {v0, p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createString(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static final createString(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1
    .param p0    # Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .line 4
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createString(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic stringValue$default(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    sget-object p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Contains:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->stringValue(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final synthetic annotationValue(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1

    const-string v0, "init"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;-><init>()V

    invoke-interface {p1, v0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->annotationValue(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    return-object p0
.end method

.method public final annotationValue(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1
    .param p1    # Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    .line 2
    sget-object p1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->AnnotationValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    return-object p0
.end method

.method public final synthetic arrayValue(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1

    const-string v0, "init"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;-><init>()V

    invoke-interface {p1, v0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->arrayValue(Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    return-object p0
.end method

.method public final arrayValue(Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1
    .param p1    # Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    .line 2
    sget-object p1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->ArrayValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    return-object p0
.end method

.method public final boolValue(Z)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/EncodeValueBoolean;

    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/query/matchers/EncodeValueBoolean;-><init>(Z)V

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    sget-object p1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->BoolValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    return-object p0
.end method

.method public final byteValue(B)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/EncodeValueByte;

    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/query/matchers/EncodeValueByte;-><init>(B)V

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    sget-object p1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->ByteValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    return-object p0
.end method

.method public final charValue(C)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/EncodeValueChar;

    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/query/matchers/EncodeValueChar;-><init>(C)V

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    sget-object p1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->CharValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    return-object p0
.end method

.method public final synthetic classValue(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1

    const-string v0, "init"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;-><init>()V

    invoke-interface {p1, v0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->classValue(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    return-object p0
.end method

.method public final classValue(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1
    .param p1    # Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    .line 2
    sget-object p1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->TypeValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    return-object p0
.end method

.method public final doubleValue(D)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/EncodeValueDouble;

    invoke-direct {v0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/EncodeValueDouble;-><init>(D)V

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    sget-object p1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->DoubleValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    return-object p0
.end method

.method public final synthetic enumValue(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1

    const-string v0, "init"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    invoke-interface {p1, v0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->enumValue(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    return-object p0
.end method

.method public final enumValue(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1
    .param p1    # Lorg/luckypray/dexkit/query/matchers/FieldMatcher;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    .line 2
    sget-object p1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->EnumValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    return-object p0
.end method

.method public final floatValue(F)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/EncodeValueFloat;

    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/query/matchers/EncodeValueFloat;-><init>(F)V

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    sget-object p1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->FloatValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    return-object p0
.end method

.method public final getType()Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    return-object v0
.end method

.method public final getValue()Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    return-object v0
.end method

.method public final intValue(I)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/EncodeValueInt;

    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/query/matchers/EncodeValueInt;-><init>(I)V

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    sget-object p1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->IntValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    return-object p0
.end method

.method public final longValue(J)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/EncodeValueLong;

    invoke-direct {v0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/EncodeValueLong;-><init>(J)V

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    sget-object p1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->LongValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    return-object p0
.end method

.method public final synthetic methodValue(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1

    const-string v0, "init"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;-><init>()V

    invoke-interface {p1, v0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->methodValue(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    return-object p0
.end method

.method public final methodValue(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1
    .param p1    # Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    .line 2
    sget-object p1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->MethodValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    return-object p0
.end method

.method public final nullValue()Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/EncodeValueNull;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/EncodeValueNull;-><init>()V

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    sget-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->NullValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    return-object p0
.end method

.method public final numberValue(Ljava/lang/Number;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 2
    .param p1    # Ljava/lang/Number;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "number"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Ljava/lang/Byte;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Number;->byteValue()B

    move-result p1

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->byteValue(B)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    goto :goto_0

    :cond_0
    instance-of v0, p1, Ljava/lang/Short;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/Number;->shortValue()S

    move-result p1

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->shortValue(S)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    goto :goto_0

    :cond_1
    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->intValue(I)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    goto :goto_0

    :cond_2
    instance-of v0, p1, Ljava/lang/Long;

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->longValue(J)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    goto :goto_0

    :cond_3
    instance-of v0, p1, Ljava/lang/Float;

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->floatValue(F)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    goto :goto_0

    :cond_4
    instance-of v0, p1, Ljava/lang/Double;

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->doubleValue(D)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    :cond_5
    :goto_0
    return-object p0
.end method

.method public final shortValue(S)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/EncodeValueShort;

    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/query/matchers/EncodeValueShort;-><init>(S)V

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    sget-object p1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->ShortValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    return-object p0
.end method

.method public final stringValue(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡۡ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .line 1
    const-string v0, "value"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->stringValue$default(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    move-result-object p1

    return-object p1
.end method

.method public final stringValue(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Lorg/luckypray/dexkit/query/enums/StringMatchType;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡۡ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .line 2
    const-string v0, "value"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->stringValue$default(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    move-result-object p1

    return-object p1
.end method

.method public final stringValue(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Lorg/luckypray/dexkit/query/enums/StringMatchType;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡۡ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchType"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    invoke-direct {v0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V

    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    .line 6
    sget-object p1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->StringValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    return-object p0
.end method

.method public final stringValue(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1
    .param p1    # Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    .line 4
    sget-object p1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->StringValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    return-object p0
.end method
