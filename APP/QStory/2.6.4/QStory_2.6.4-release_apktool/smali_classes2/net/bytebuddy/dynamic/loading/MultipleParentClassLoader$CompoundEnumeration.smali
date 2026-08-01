.class public Lnet/bytebuddy/dynamic/loading/MultipleParentClassLoader$CompoundEnumeration;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/util/Enumeration;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/loading/MultipleParentClassLoader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CompoundEnumeration"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Enumeration<",
        "Ljava/net/URL;",
        ">;"
    }
.end annotation


# static fields
.field private static final FIRST:I


# instance fields
.field private current:Ljava/util/Enumeration;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Enumeration<",
            "Ljava/net/URL;",
            ">;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/UnknownNull;
    .end annotation
.end field

.field private final enumerations:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/util/Enumeration<",
            "Ljava/net/URL;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/util/Enumeration<",
            "Ljava/net/URL;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/dynamic/loading/MultipleParentClassLoader$CompoundEnumeration;->enumerations:Ljava/util/List;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public hasMoreElements()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/dynamic/loading/MultipleParentClassLoader$CompoundEnumeration;->current:Ljava/util/Enumeration;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    iget-object v0, p0, Lnet/bytebuddy/dynamic/loading/MultipleParentClassLoader$CompoundEnumeration;->enumerations:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, Lnet/bytebuddy/dynamic/loading/MultipleParentClassLoader$CompoundEnumeration;->enumerations:Ljava/util/List;

    .line 23
    .line 24
    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Ljava/util/Enumeration;

    .line 29
    .line 30
    iput-object v0, p0, Lnet/bytebuddy/dynamic/loading/MultipleParentClassLoader$CompoundEnumeration;->current:Ljava/util/Enumeration;

    .line 31
    .line 32
    invoke-virtual {p0}, Lnet/bytebuddy/dynamic/loading/MultipleParentClassLoader$CompoundEnumeration;->hasMoreElements()Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    return p0

    .line 37
    :cond_1
    return v1
.end method

.method public bridge synthetic nextElement()Ljava/lang/Object;
    .locals 0

    .line 21
    invoke-virtual {p0}, Lnet/bytebuddy/dynamic/loading/MultipleParentClassLoader$CompoundEnumeration;->nextElement()Ljava/net/URL;

    move-result-object p0

    return-object p0
.end method

.method public nextElement()Ljava/net/URL;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/dynamic/loading/MultipleParentClassLoader$CompoundEnumeration;->hasMoreElements()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/MultipleParentClassLoader$CompoundEnumeration;->current:Ljava/util/Enumeration;

    .line 8
    .line 9
    invoke-interface {p0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Ljava/net/URL;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    invoke-static {}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏()V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0
.end method
