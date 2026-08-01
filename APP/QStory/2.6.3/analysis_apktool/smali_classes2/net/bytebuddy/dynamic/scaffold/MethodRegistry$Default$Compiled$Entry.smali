.class public Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled$Entry;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Entry"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final attributeAppender:Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender;

.field private final bridgeMethod:Z

.field private final bridgeTypes:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lnet/bytebuddy/description/method/MethodDescription$TypeToken;",
            ">;"
        }
    .end annotation
.end field

.field private final handler:Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Handler$Compiled;

.field private final methodDescription:Lnet/bytebuddy/description/method/MethodDescription;

.field private final visibility:Lnet/bytebuddy/description/modifier/Visibility;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Handler$Compiled;Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender;Lnet/bytebuddy/description/method/MethodDescription;Ljava/util/Set;Lnet/bytebuddy/description/modifier/Visibility;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Handler$Compiled;",
            "Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender;",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            "Ljava/util/Set<",
            "Lnet/bytebuddy/description/method/MethodDescription$TypeToken;",
            ">;",
            "Lnet/bytebuddy/description/modifier/Visibility;",
            "Z)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled$Entry;->handler:Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Handler$Compiled;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled$Entry;->attributeAppender:Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled$Entry;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription;

    .line 9
    .line 10
    iput-object p4, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled$Entry;->bridgeTypes:Ljava/util/Set;

    .line 11
    .line 12
    iput-object p5, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled$Entry;->visibility:Lnet/bytebuddy/description/modifier/Visibility;

    .line 13
    .line 14
    iput-boolean p6, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled$Entry;->bridgeMethod:Z

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public bind(Lnet/bytebuddy/description/type/TypeDescription;Z)Lnet/bytebuddy/dynamic/scaffold/TypeWriter$MethodPool$Record;
    .locals 4

    .line 1
    iget-boolean v0, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled$Entry;->bridgeMethod:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    new-instance p1, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$MethodPool$Record$ForNonImplementedMethod;

    .line 8
    .line 9
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled$Entry;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription;

    .line 10
    .line 11
    invoke-direct {p1, p0}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$MethodPool$Record$ForNonImplementedMethod;-><init>(Lnet/bytebuddy/description/method/MethodDescription;)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_0
    iget-object v0, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled$Entry;->handler:Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Handler$Compiled;

    .line 16
    .line 17
    iget-object v1, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled$Entry;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription;

    .line 18
    .line 19
    iget-object v2, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled$Entry;->attributeAppender:Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender;

    .line 20
    .line 21
    iget-object v3, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled$Entry;->visibility:Lnet/bytebuddy/description/modifier/Visibility;

    .line 22
    .line 23
    invoke-interface {v0, v1, v2, v3}, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Handler$Compiled;->assemble(Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender;Lnet/bytebuddy/description/modifier/Visibility;)Lnet/bytebuddy/dynamic/scaffold/TypeWriter$MethodPool$Record;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz p2, :cond_1

    .line 28
    .line 29
    iget-object p2, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled$Entry;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription;

    .line 30
    .line 31
    iget-object v1, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled$Entry;->bridgeTypes:Ljava/util/Set;

    .line 32
    .line 33
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled$Entry;->attributeAppender:Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender;

    .line 34
    .line 35
    invoke-static {v0, p1, p2, v1, p0}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$MethodPool$Record$AccessBridgeWrapper;->of(Lnet/bytebuddy/dynamic/scaffold/TypeWriter$MethodPool$Record;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Ljava/util/Set;Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender;)Lnet/bytebuddy/dynamic/scaffold/TypeWriter$MethodPool$Record;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :cond_1
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-nez p1, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-eq v2, v3, :cond_2

    .line 18
    .line 19
    return v1

    .line 20
    :cond_2
    iget-boolean v2, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled$Entry;->bridgeMethod:Z

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled$Entry;

    .line 23
    .line 24
    iget-boolean v3, p1, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled$Entry;->bridgeMethod:Z

    .line 25
    .line 26
    if-eq v2, v3, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled$Entry;->visibility:Lnet/bytebuddy/description/modifier/Visibility;

    .line 30
    .line 31
    iget-object v3, p1, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled$Entry;->visibility:Lnet/bytebuddy/description/modifier/Visibility;

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_4

    .line 38
    .line 39
    return v1

    .line 40
    :cond_4
    iget-object v2, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled$Entry;->handler:Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Handler$Compiled;

    .line 41
    .line 42
    iget-object v3, p1, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled$Entry;->handler:Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Handler$Compiled;

    .line 43
    .line 44
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-nez v2, :cond_5

    .line 49
    .line 50
    return v1

    .line 51
    :cond_5
    iget-object v2, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled$Entry;->attributeAppender:Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender;

    .line 52
    .line 53
    iget-object v3, p1, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled$Entry;->attributeAppender:Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender;

    .line 54
    .line 55
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-nez v2, :cond_6

    .line 60
    .line 61
    return v1

    .line 62
    :cond_6
    iget-object v2, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled$Entry;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription;

    .line 63
    .line 64
    iget-object v3, p1, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled$Entry;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription;

    .line 65
    .line 66
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-nez v2, :cond_7

    .line 71
    .line 72
    return v1

    .line 73
    :cond_7
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled$Entry;->bridgeTypes:Ljava/util/Set;

    .line 74
    .line 75
    iget-object p1, p1, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled$Entry;->bridgeTypes:Ljava/util/Set;

    .line 76
    .line 77
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    if-nez p0, :cond_8

    .line 82
    .line 83
    return v1

    .line 84
    :cond_8
    return v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v1, 0x1f

    .line 10
    .line 11
    mul-int/2addr v0, v1

    .line 12
    iget-object v2, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled$Entry;->handler:Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Handler$Compiled;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    add-int/2addr v2, v0

    .line 19
    mul-int/2addr v2, v1

    .line 20
    iget-object v0, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled$Entry;->attributeAppender:Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    add-int/2addr v0, v2

    .line 27
    mul-int/2addr v0, v1

    .line 28
    iget-object v2, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled$Entry;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription;

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Lnet/bytebuddy/description/method/MethodDescription;II)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled$Entry;->bridgeTypes:Ljava/util/Set;

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    add-int/2addr v2, v0

    .line 41
    mul-int/2addr v2, v1

    .line 42
    iget-object v0, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled$Entry;->visibility:Lnet/bytebuddy/description/modifier/Visibility;

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    add-int/2addr v0, v2

    .line 49
    mul-int/2addr v0, v1

    .line 50
    iget-boolean p0, p0, Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Default$Compiled$Entry;->bridgeMethod:Z

    .line 51
    .line 52
    add-int/2addr v0, p0

    .line 53
    return v0
.end method
