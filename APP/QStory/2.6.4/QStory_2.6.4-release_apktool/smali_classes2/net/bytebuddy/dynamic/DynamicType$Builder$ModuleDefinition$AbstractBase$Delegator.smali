.class public abstract Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$AbstractBase$Delegator;
.super Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$AbstractBase;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$AbstractBase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Delegator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$AbstractBase<",
        "TV;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$AbstractBase;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public export(Ljava/lang/String;I)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition<",
            "TV;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$AbstractBase$Delegator;->materialize()Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p1, p2}, Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;->export(Ljava/lang/String;I)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public mainClass(Ljava/lang/String;)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition<",
            "TV;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$AbstractBase$Delegator;->materialize()Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p1}, Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;->mainClass(Ljava/lang/String;)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public abstract materialize()Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition<",
            "TV;>;"
        }
    .end annotation
.end method

.method public bridge synthetic materialize()Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$AbstractBase$Delegator;->materialize()Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public open(Ljava/lang/String;I)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition<",
            "TV;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$AbstractBase$Delegator;->materialize()Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p1, p2}, Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;->open(Ljava/lang/String;I)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public packages(Ljava/util/Collection;)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition<",
            "TV;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$AbstractBase$Delegator;->materialize()Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p1}, Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;->packages(Ljava/util/Collection;)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public provides(Ljava/lang/String;Ljava/util/Collection;)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition<",
            "TV;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$AbstractBase$Delegator;->materialize()Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p1, p2}, Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;->provides(Ljava/lang/String;Ljava/util/Collection;)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public require(Ljava/lang/String;I)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$RequiresDefinition;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$RequiresDefinition<",
            "TV;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$AbstractBase$Delegator;->materialize()Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p1, p2}, Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;->require(Ljava/lang/String;I)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$RequiresDefinition;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public uses(Ljava/util/Collection;)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition<",
            "TV;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$AbstractBase$Delegator;->materialize()Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p1}, Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;->uses(Ljava/util/Collection;)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public version(Ljava/lang/String;)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition<",
            "TV;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$AbstractBase$Delegator;->materialize()Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p1}, Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;->version(Ljava/lang/String;)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method
