.class public final Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Lorg/luckypray/dexkit/query/base/QueryComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;


# instance fields
.field private type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

.field private value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;-><init>(Lr2;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private constructor <init>(Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    .line 5
    .line 6
    iput-object p2, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;Lr2;)V
    .locals 0

    .line 10
    invoke-direct {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>(Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;)V

    return-void
.end method

.method public static final create(Ljava/lang/Number;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->create(Ljava/lang/Number;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static final createAnnotation(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createAnnotation(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static final createArray(Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createArray(Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static final createBoolean(Z)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createBoolean(Z)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static final createByte(B)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createByte(B)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static final createChar(C)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createChar(C)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static final createClass(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createClass(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static final createDouble(D)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createDouble(D)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static final createEnum(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createEnum(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static final createFloat(F)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createFloat(F)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static final createInt(I)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createInt(I)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static final createLong(J)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createLong(J)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static final createMethod(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createMethod(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static final createNull()Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createNull()Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static final createShort(S)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createShort(S)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static final createString(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createString(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static final createString(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1

    .line 8
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    invoke-virtual {v0, p0, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createString(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static final createString(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1

    .line 9
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    invoke-virtual {v0, p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createString(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static final createString(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1

    .line 10
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createString(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic stringValue$default(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x2

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    sget-object p2, Lorg/luckypray/dexkit/query/enums/StringMatchType;->Contains:Lorg/luckypray/dexkit/query/enums/StringMatchType;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    const/4 p3, 0x0

    .line 12
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->stringValue(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method


# virtual methods
.method public final annotationValue(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    .line 17
    sget-object p1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->AnnotationValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    return-object p0
.end method

.method public final synthetic annotationValue(Lu5;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;

    .line 5
    .line 6
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-interface {p1, v0}, Lu5;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->annotationValue(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public final arrayValue(Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    .line 17
    sget-object p1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->ArrayValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    return-object p0
.end method

.method public final synthetic arrayValue(Lu5;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;

    .line 5
    .line 6
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-interface {p1, v0}, Lu5;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->arrayValue(Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public final boolValue(Z)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/EncodeValueBoolean;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/query/matchers/EncodeValueBoolean;-><init>(Z)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    .line 7
    .line 8
    sget-object p1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->BoolValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 9
    .line 10
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 11
    .line 12
    return-object p0
.end method

.method public final byteValue(B)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/EncodeValueByte;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/query/matchers/EncodeValueByte;-><init>(B)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    .line 7
    .line 8
    sget-object p1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->ByteValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 9
    .line 10
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 11
    .line 12
    return-object p0
.end method

.method public final charValue(C)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/EncodeValueChar;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/query/matchers/EncodeValueChar;-><init>(C)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    .line 7
    .line 8
    sget-object p1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->CharValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 9
    .line 10
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 11
    .line 12
    return-object p0
.end method

.method public final classValue(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    .line 17
    sget-object p1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->TypeValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    return-object p0
.end method

.method public final synthetic classValue(Lu5;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 5
    .line 6
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-interface {p1, v0}, Lu5;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->classValue(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public final doubleValue(D)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/EncodeValueDouble;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/EncodeValueDouble;-><init>(D)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    .line 7
    .line 8
    sget-object p1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->DoubleValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 9
    .line 10
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 11
    .line 12
    return-object p0
.end method

.method public final enumValue(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    .line 17
    sget-object p1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->EnumValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    return-object p0
.end method

.method public final synthetic enumValue(Lu5;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 5
    .line 6
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-interface {p1, v0}, Lu5;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->enumValue(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public final floatValue(F)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/EncodeValueFloat;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/query/matchers/EncodeValueFloat;-><init>(F)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    .line 7
    .line 8
    sget-object p1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->FloatValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 9
    .line 10
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 11
    .line 12
    return-object p0
.end method

.method public final getType()Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getValue()Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    .line 2
    .line 3
    return-object p0
.end method

.method public final intValue(I)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/EncodeValueInt;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/query/matchers/EncodeValueInt;-><init>(I)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    .line 7
    .line 8
    sget-object p1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->IntValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 9
    .line 10
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 11
    .line 12
    return-object p0
.end method

.method public final longValue(J)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/EncodeValueLong;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/EncodeValueLong;-><init>(J)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    .line 7
    .line 8
    sget-object p1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->LongValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 9
    .line 10
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 11
    .line 12
    return-object p0
.end method

.method public final methodValue(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    .line 17
    sget-object p1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->MethodValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    return-object p0
.end method

.method public final synthetic methodValue(Lu5;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 5
    .line 6
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-interface {p1, v0}, Lu5;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->methodValue(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public final nullValue()Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/EncodeValueNull;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/EncodeValueNull;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    .line 7
    .line 8
    sget-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->NullValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 9
    .line 10
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 11
    .line 12
    return-object p0
.end method

.method public final numberValue(Ljava/lang/Number;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, Ljava/lang/Byte;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Number;->byteValue()B

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->byteValue(B)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 13
    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    instance-of v0, p1, Ljava/lang/Short;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Number;->shortValue()S

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->shortValue(S)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 25
    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_1
    instance-of v0, p1, Ljava/lang/Integer;

    .line 29
    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->intValue(I)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 37
    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_2
    instance-of v0, p1, Ljava/lang/Long;

    .line 41
    .line 42
    if-eqz v0, :cond_3

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 45
    .line 46
    .line 47
    move-result-wide v0

    .line 48
    invoke-virtual {p0, v0, v1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->longValue(J)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 49
    .line 50
    .line 51
    return-object p0

    .line 52
    :cond_3
    instance-of v0, p1, Ljava/lang/Float;

    .line 53
    .line 54
    if-eqz v0, :cond_4

    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->floatValue(F)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 61
    .line 62
    .line 63
    return-object p0

    .line 64
    :cond_4
    instance-of v0, p1, Ljava/lang/Double;

    .line 65
    .line 66
    if-eqz v0, :cond_5

    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 69
    .line 70
    .line 71
    move-result-wide v0

    .line 72
    invoke-virtual {p0, v0, v1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->doubleValue(D)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 73
    .line 74
    .line 75
    :cond_5
    return-object p0
.end method

.method public final shortValue(S)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/EncodeValueShort;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/query/matchers/EncodeValueShort;-><init>(S)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    .line 7
    .line 8
    sget-object p1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->ShortValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 9
    .line 10
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 11
    .line 12
    return-object p0
.end method

.method public final stringValue(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 6

    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->stringValue$default(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    move-result-object p0

    return-object p0
.end method

.method public final stringValue(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 6

    .line 19
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->stringValue$default(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    move-result-object p0

    return-object p0
.end method

.method public final stringValue(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    .line 8
    .line 9
    invoke-direct {v0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    .line 13
    .line 14
    sget-object p1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->StringValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 15
    .line 16
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 17
    .line 18
    return-object p0
.end method

.method public final stringValue(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;

    .line 21
    sget-object p1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->StringValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    return-object p0
.end method
