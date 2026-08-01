.class public Lnet/bytebuddy/description/type/TypeDefinition$SuperClassIterator;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/type/TypeDefinition;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SuperClassIterator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "Lnet/bytebuddy/description/type/TypeDefinition;",
        ">;"
    }
.end annotation


# instance fields
.field private nextClass:Lnet/bytebuddy/description/type/TypeDefinition;
    .annotation runtime Lnet/bytebuddy/utility/nullability/UnknownNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDefinition;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/description/type/TypeDefinition$SuperClassIterator;->nextClass:Lnet/bytebuddy/description/type/TypeDefinition;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDefinition$SuperClassIterator;->nextClass:Lnet/bytebuddy/description/type/TypeDefinition;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 0

    .line 33
    invoke-virtual {p0}, Lnet/bytebuddy/description/type/TypeDefinition$SuperClassIterator;->next()Lnet/bytebuddy/description/type/TypeDefinition;

    move-result-object p0

    return-object p0
.end method

.method public next()Lnet/bytebuddy/description/type/TypeDefinition;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/description/type/TypeDefinition$SuperClassIterator;->hasNext()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    :try_start_0
    iget-object v0, p0, Lnet/bytebuddy/description/type/TypeDefinition$SuperClassIterator;->nextClass:Lnet/bytebuddy/description/type/TypeDefinition;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDefinition;->getSuperClass()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iput-object v1, p0, Lnet/bytebuddy/description/type/TypeDefinition$SuperClassIterator;->nextClass:Lnet/bytebuddy/description/type/TypeDefinition;

    .line 14
    .line 15
    return-object v0

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    iget-object v1, p0, Lnet/bytebuddy/description/type/TypeDefinition$SuperClassIterator;->nextClass:Lnet/bytebuddy/description/type/TypeDefinition;

    .line 18
    .line 19
    invoke-interface {v1}, Lnet/bytebuddy/description/type/TypeDefinition;->getSuperClass()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iput-object v1, p0, Lnet/bytebuddy/description/type/TypeDefinition$SuperClassIterator;->nextClass:Lnet/bytebuddy/description/type/TypeDefinition;

    .line 24
    .line 25
    throw v0

    .line 26
    :cond_0
    const-string p0, "End of type hierarchy"

    .line 27
    .line 28
    invoke-static {p0}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    return-object p0
.end method

.method public remove()V
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "remove"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method
