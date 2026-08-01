.class public Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice$LazyDynamicType;
.super Lnet/bytebuddy/dynamic/DynamicType$AbstractBase;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "LazyDynamicType"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

.field private final typeDescription:Lnet/bytebuddy/description/type/TypeDescription;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/ClassFileLocator;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/dynamic/DynamicType$AbstractBase;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice$LazyDynamicType;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice$LazyDynamicType;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Lnet/bytebuddy/dynamic/DynamicType$AbstractBase;->equals(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    const/4 v0, 0x1

    .line 10
    if-ne p0, p1, :cond_1

    .line 11
    .line 12
    return v0

    .line 13
    :cond_1
    if-nez p1, :cond_2

    .line 14
    .line 15
    return v1

    .line 16
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    if-eq v2, v3, :cond_3

    .line 25
    .line 26
    return v1

    .line 27
    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice$LazyDynamicType;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 28
    .line 29
    check-cast p1, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice$LazyDynamicType;

    .line 30
    .line 31
    iget-object v3, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice$LazyDynamicType;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

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
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice$LazyDynamicType;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 41
    .line 42
    iget-object p1, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice$LazyDynamicType;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-nez p0, :cond_5

    .line 49
    .line 50
    return v1

    .line 51
    :cond_5
    return v0
.end method

.method public getAuxiliaries()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/dynamic/DynamicType;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public getBytes()[B
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice$LazyDynamicType;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice$LazyDynamicType;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 4
    .line 5
    invoke-interface {v1}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v0, v1}, Lnet/bytebuddy/dynamic/ClassFileLocator;->locate(Ljava/lang/String;)Lnet/bytebuddy/dynamic/ClassFileLocator$Resolution;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0}, Lnet/bytebuddy/dynamic/ClassFileLocator$Resolution;->resolve()[B

    .line 14
    .line 15
    .line 16
    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    return-object p0

    .line 18
    :catch_0
    move-exception v0

    .line 19
    const-string v1, "Failed to resolve class file for "

    .line 20
    .line 21
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice$LazyDynamicType;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 22
    .line 23
    invoke-static {v1, p0, v0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    return-object p0
.end method

.method public getLoadedTypeInitializer()Lnet/bytebuddy/implementation/LoadedTypeInitializer;
    .locals 0

    .line 1
    sget-object p0, Lnet/bytebuddy/implementation/LoadedTypeInitializer$NoOp;->INSTANCE:Lnet/bytebuddy/implementation/LoadedTypeInitializer$NoOp;

    .line 2
    .line 3
    return-object p0
.end method

.method public getTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice$LazyDynamicType;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    invoke-super {p0}, Lnet/bytebuddy/dynamic/DynamicType$AbstractBase;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x1f

    .line 6
    .line 7
    mul-int/2addr v0, v1

    .line 8
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice$LazyDynamicType;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 9
    .line 10
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(Lnet/bytebuddy/description/type/TypeDescription;II)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForAdvice$LazyDynamicType;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    add-int/2addr p0, v0

    .line 21
    return p0
.end method
