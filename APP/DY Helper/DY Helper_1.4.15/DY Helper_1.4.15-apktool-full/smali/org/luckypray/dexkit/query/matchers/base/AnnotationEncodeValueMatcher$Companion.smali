.class public final Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lzq;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic createString$default(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
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
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createString(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Number;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 5
    .line 6
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;->numberValue(Ljava/lang/Number;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final createAnnotation(Lorg/luckypray/dexkit/query/matchers/AnnotationMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->AnnotationValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 5
    .line 6
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p1, p0, v1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>(Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;Lzq;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final createArray(Lorg/luckypray/dexkit/query/matchers/AnnotationEncodeArrayMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->ArrayValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 5
    .line 6
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p1, p0, v1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>(Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;Lzq;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final createBoolean(Z)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 2

    .line 1
    sget-object p0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->BoolValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 2
    .line 3
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 4
    .line 5
    new-instance v1, Lorg/luckypray/dexkit/query/matchers/EncodeValueBoolean;

    .line 6
    .line 7
    invoke-direct {v1, p1}, Lorg/luckypray/dexkit/query/matchers/EncodeValueBoolean;-><init>(Z)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-direct {v0, v1, p0, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>(Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;Lzq;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public final createByte(B)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 2

    .line 1
    sget-object p0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->ByteValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 2
    .line 3
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 4
    .line 5
    new-instance v1, Lorg/luckypray/dexkit/query/matchers/EncodeValueByte;

    .line 6
    .line 7
    invoke-direct {v1, p1}, Lorg/luckypray/dexkit/query/matchers/EncodeValueByte;-><init>(B)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-direct {v0, v1, p0, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>(Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;Lzq;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public final createChar(C)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 2

    .line 1
    sget-object p0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->CharValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 2
    .line 3
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 4
    .line 5
    new-instance v1, Lorg/luckypray/dexkit/query/matchers/EncodeValueChar;

    .line 6
    .line 7
    invoke-direct {v1, p1}, Lorg/luckypray/dexkit/query/matchers/EncodeValueChar;-><init>(C)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-direct {v0, v1, p0, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>(Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;Lzq;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public final createClass(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->TypeValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 5
    .line 6
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p1, p0, v1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>(Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;Lzq;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final createDouble(D)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 2

    .line 1
    sget-object p0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->DoubleValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 2
    .line 3
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 4
    .line 5
    new-instance v1, Lorg/luckypray/dexkit/query/matchers/EncodeValueDouble;

    .line 6
    .line 7
    invoke-direct {v1, p1, p2}, Lorg/luckypray/dexkit/query/matchers/EncodeValueDouble;-><init>(D)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-direct {v0, v1, p0, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>(Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;Lzq;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public final createEnum(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->EnumValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 5
    .line 6
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p1, p0, v1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>(Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;Lzq;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final createFloat(F)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 2

    .line 1
    sget-object p0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->FloatValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 2
    .line 3
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 4
    .line 5
    new-instance v1, Lorg/luckypray/dexkit/query/matchers/EncodeValueFloat;

    .line 6
    .line 7
    invoke-direct {v1, p1}, Lorg/luckypray/dexkit/query/matchers/EncodeValueFloat;-><init>(F)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-direct {v0, v1, p0, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>(Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;Lzq;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public final createInt(I)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 2

    .line 1
    sget-object p0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->IntValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 2
    .line 3
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 4
    .line 5
    new-instance v1, Lorg/luckypray/dexkit/query/matchers/EncodeValueInt;

    .line 6
    .line 7
    invoke-direct {v1, p1}, Lorg/luckypray/dexkit/query/matchers/EncodeValueInt;-><init>(I)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-direct {v0, v1, p0, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>(Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;Lzq;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public final createLong(J)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 2

    .line 1
    sget-object p0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->LongValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 2
    .line 3
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 4
    .line 5
    new-instance v1, Lorg/luckypray/dexkit/query/matchers/EncodeValueLong;

    .line 6
    .line 7
    invoke-direct {v1, p1, p2}, Lorg/luckypray/dexkit/query/matchers/EncodeValueLong;-><init>(J)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-direct {v0, v1, p0, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>(Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;Lzq;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public final createMethod(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->MethodValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 5
    .line 6
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p1, p0, v1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>(Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;Lzq;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final createNull()Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 3

    .line 1
    sget-object p0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->NullValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 2
    .line 3
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 4
    .line 5
    new-instance v1, Lorg/luckypray/dexkit/query/matchers/EncodeValueNull;

    .line 6
    .line 7
    invoke-direct {v1}, Lorg/luckypray/dexkit/query/matchers/EncodeValueNull;-><init>()V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v0, v1, p0, v2}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>(Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;Lzq;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public final createShort(S)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 2

    .line 1
    sget-object p0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->ShortValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 2
    .line 3
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 4
    .line 5
    new-instance v1, Lorg/luckypray/dexkit/query/matchers/EncodeValueShort;

    .line 6
    .line 7
    invoke-direct {v1, p1}, Lorg/luckypray/dexkit/query/matchers/EncodeValueShort;-><init>(S)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-direct {v0, v1, p0, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>(Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;Lzq;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public final createString(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 6

    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createString$default(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    move-result-object p0

    return-object p0
.end method

.method public final createString(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 6

    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;->createString$default(Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher$Companion;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    move-result-object p0

    return-object p0
.end method

.method public final createString(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object p0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->StringValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 8
    .line 9
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    .line 10
    .line 11
    new-instance v1, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;

    .line 12
    .line 13
    invoke-direct {v1, p1, p2, p3}, Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    invoke-direct {v0, v1, p0, p1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>(Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;Lzq;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public final createString(Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;)Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    sget-object p0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->StringValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 23
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, v1}, Lorg/luckypray/dexkit/query/matchers/base/AnnotationEncodeValueMatcher;-><init>(Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;Lzq;)V

    return-object v0
.end method
