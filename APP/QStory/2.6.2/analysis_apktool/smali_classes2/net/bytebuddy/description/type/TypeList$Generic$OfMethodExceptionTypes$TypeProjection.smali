.class Lnet/bytebuddy/description/type/TypeList$Generic$OfMethodExceptionTypes$TypeProjection;
.super Lnet/bytebuddy/description/type/TypeDescription$Generic$LazyProjection$WithEagerNavigation$OfAnnotatedElement;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/type/TypeList$Generic$OfMethodExceptionTypes;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "TypeProjection"
.end annotation


# instance fields
.field private final erasure:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private final index:I

.field private final method:Ljava/lang/reflect/Method;

.field private transient synthetic resolved:Lnet/bytebuddy/description/type/TypeDescription$Generic;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;I[Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Method;",
            "I[",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$LazyProjection$WithEagerNavigation$OfAnnotatedElement;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/description/type/TypeList$Generic$OfMethodExceptionTypes$TypeProjection;->method:Ljava/lang/reflect/Method;

    .line 5
    .line 6
    iput p2, p0, Lnet/bytebuddy/description/type/TypeList$Generic$OfMethodExceptionTypes$TypeProjection;->index:I

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/description/type/TypeList$Generic$OfMethodExceptionTypes$TypeProjection;->erasure:[Ljava/lang/Class;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public asErasure()Lnet/bytebuddy/description/type/TypeDescription;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/description/type/TypeList$Generic$OfMethodExceptionTypes$TypeProjection;->erasure:[Ljava/lang/Class;

    .line 2
    .line 3
    iget p0, p0, Lnet/bytebuddy/description/type/TypeList$Generic$OfMethodExceptionTypes$TypeProjection;->index:I

    .line 4
    .line 5
    aget-object p0, v0, p0

    .line 6
    .line 7
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public getAnnotationReader()Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader$Delegator$ForLoadedExecutableExceptionType;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/description/type/TypeList$Generic$OfMethodExceptionTypes$TypeProjection;->method:Ljava/lang/reflect/Method;

    .line 4
    .line 5
    iget p0, p0, Lnet/bytebuddy/description/type/TypeList$Generic$OfMethodExceptionTypes$TypeProjection;->index:I

    .line 6
    .line 7
    invoke-direct {v0, v1, p0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader$Delegator$ForLoadedExecutableExceptionType;-><init>(Ljava/lang/reflect/AccessibleObject;I)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public resolve()Lnet/bytebuddy/description/type/TypeDescription$Generic;
    .locals 3
    .annotation runtime Lnet/bytebuddy/build/CachedReturnPlugin$Enhance;
        value = "resolved"
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/description/type/TypeList$Generic$OfMethodExceptionTypes$TypeProjection;->resolved:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    iget-object v0, p0, Lnet/bytebuddy/description/type/TypeList$Generic$OfMethodExceptionTypes$TypeProjection;->method:Ljava/lang/reflect/Method;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getGenericExceptionTypes()[Ljava/lang/reflect/Type;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Lnet/bytebuddy/description/type/TypeList$Generic$OfMethodExceptionTypes$TypeProjection;->erasure:[Ljava/lang/Class;

    .line 14
    .line 15
    array-length v1, v1

    .line 16
    array-length v2, v0

    .line 17
    if-ne v1, v2, :cond_1

    .line 18
    .line 19
    iget v1, p0, Lnet/bytebuddy/description/type/TypeList$Generic$OfMethodExceptionTypes$TypeProjection;->index:I

    .line 20
    .line 21
    aget-object v0, v0, v1

    .line 22
    .line 23
    invoke-virtual {p0}, Lnet/bytebuddy/description/type/TypeList$Generic$OfMethodExceptionTypes$TypeProjection;->getAnnotationReader()Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-static {v0, v1}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->describeOrNull(Ljava/lang/reflect/Type;Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-virtual {p0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$AbstractBase;->asRawType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    :goto_0
    if-nez v0, :cond_2

    .line 37
    .line 38
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeList$Generic$OfMethodExceptionTypes$TypeProjection;->resolved:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 39
    .line 40
    return-object p0

    .line 41
    :cond_2
    iput-object v0, p0, Lnet/bytebuddy/description/type/TypeList$Generic$OfMethodExceptionTypes$TypeProjection;->resolved:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 42
    .line 43
    return-object v0
.end method
