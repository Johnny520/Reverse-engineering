.class public Lnet/bytebuddy/description/method/MethodList$ForLoadedMethods;
.super Lnet/bytebuddy/description/method/MethodList$AbstractBase;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/method/MethodList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForLoadedMethods"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnet/bytebuddy/description/method/MethodList$AbstractBase<",
        "Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;",
        ">;"
    }
.end annotation


# instance fields
.field private final constructors:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Ljava/lang/reflect/Constructor<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final methods:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Ljava/lang/reflect/Method;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-static {}, Lnet/bytebuddy/utility/GraalImageCode;->getCurrent()Lnet/bytebuddy/utility/GraalImageCode;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v2, Lnet/bytebuddy/utility/ConstructorComparator;->INSTANCE:Lnet/bytebuddy/utility/ConstructorComparator;

    .line 10
    .line 11
    invoke-virtual {v0, v1, v2}, Lnet/bytebuddy/utility/GraalImageCode;->sorted([Ljava/lang/Object;Ljava/util/Comparator;)[Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, [Ljava/lang/reflect/Constructor;

    .line 16
    .line 17
    invoke-static {}, Lnet/bytebuddy/utility/GraalImageCode;->getCurrent()Lnet/bytebuddy/utility/GraalImageCode;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    sget-object v2, Lnet/bytebuddy/utility/MethodComparator;->INSTANCE:Lnet/bytebuddy/utility/MethodComparator;

    .line 26
    .line 27
    invoke-virtual {v1, p1, v2}, Lnet/bytebuddy/utility/GraalImageCode;->sorted([Ljava/lang/Object;Ljava/util/Comparator;)[Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, [Ljava/lang/reflect/Method;

    .line 32
    .line 33
    invoke-direct {p0, v0, p1}, Lnet/bytebuddy/description/method/MethodList$ForLoadedMethods;-><init>([Ljava/lang/reflect/Constructor;[Ljava/lang/reflect/Method;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/reflect/Constructor<",
            "*>;>;",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/reflect/Method;",
            ">;)V"
        }
    .end annotation

    .line 38
    invoke-direct {p0}, Lnet/bytebuddy/description/method/MethodList$AbstractBase;-><init>()V

    .line 39
    iput-object p1, p0, Lnet/bytebuddy/description/method/MethodList$ForLoadedMethods;->constructors:Ljava/util/List;

    .line 40
    iput-object p2, p0, Lnet/bytebuddy/description/method/MethodList$ForLoadedMethods;->methods:Ljava/util/List;

    return-void
.end method

.method public constructor <init>([Ljava/lang/reflect/Constructor;[Ljava/lang/reflect/Method;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/reflect/Constructor<",
            "*>;[",
            "Ljava/lang/reflect/Method;",
            ")V"
        }
    .end annotation

    .line 37
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/description/method/MethodList$ForLoadedMethods;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    .line 44
    invoke-virtual {p0, p1}, Lnet/bytebuddy/description/method/MethodList$ForLoadedMethods;->get(I)Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    move-result-object p0

    return-object p0
.end method

.method public get(I)Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/description/method/MethodList$ForLoadedMethods;->constructors:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-ge p1, v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;

    .line 10
    .line 11
    iget-object p0, p0, Lnet/bytebuddy/description/method/MethodList$ForLoadedMethods;->constructors:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Ljava/lang/reflect/Constructor;

    .line 18
    .line 19
    invoke-direct {v0, p0}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;-><init>(Ljava/lang/reflect/Constructor;)V

    .line 20
    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_0
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;

    .line 24
    .line 25
    iget-object v1, p0, Lnet/bytebuddy/description/method/MethodList$ForLoadedMethods;->methods:Ljava/util/List;

    .line 26
    .line 27
    iget-object p0, p0, Lnet/bytebuddy/description/method/MethodList$ForLoadedMethods;->constructors:Ljava/util/List;

    .line 28
    .line 29
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    sub-int/2addr p1, p0

    .line 34
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, Ljava/lang/reflect/Method;

    .line 39
    .line 40
    invoke-direct {v0, p0}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;-><init>(Ljava/lang/reflect/Method;)V

    .line 41
    .line 42
    .line 43
    return-object v0
.end method

.method public size()I
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/description/method/MethodList$ForLoadedMethods;->constructors:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object p0, p0, Lnet/bytebuddy/description/method/MethodList$ForLoadedMethods;->methods:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    add-int/2addr p0, v0

    .line 14
    return p0
.end method
