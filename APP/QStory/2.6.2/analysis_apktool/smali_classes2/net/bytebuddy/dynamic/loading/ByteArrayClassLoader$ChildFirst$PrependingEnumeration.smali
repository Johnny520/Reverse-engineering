.class public Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$ChildFirst$PrependingEnumeration;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/util/Enumeration;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$ChildFirst;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "PrependingEnumeration"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Enumeration<",
        "Ljava/net/URL;",
        ">;"
    }
.end annotation


# instance fields
.field private final enumeration:Ljava/util/Enumeration;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Enumeration<",
            "Ljava/net/URL;",
            ">;"
        }
    .end annotation
.end field

.field private nextElement:Ljava/net/URL;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/net/URL;Ljava/util/Enumeration;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/URL;",
            "Ljava/util/Enumeration<",
            "Ljava/net/URL;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$ChildFirst$PrependingEnumeration;->nextElement:Ljava/net/URL;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$ChildFirst$PrependingEnumeration;->enumeration:Ljava/util/Enumeration;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public hasMoreElements()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$ChildFirst$PrependingEnumeration;->nextElement:Ljava/net/URL;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$ChildFirst$PrependingEnumeration;->enumeration:Ljava/util/Enumeration;

    .line 6
    .line 7
    invoke-interface {p0}, Ljava/util/Enumeration;->hasMoreElements()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public bridge synthetic nextElement()Ljava/lang/Object;
    .locals 0

    .line 43
    invoke-virtual {p0}, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$ChildFirst$PrependingEnumeration;->nextElement()Ljava/net/URL;

    move-result-object p0

    return-object p0
.end method

.method public nextElement()Ljava/net/URL;
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$ChildFirst$PrependingEnumeration;->nextElement:Ljava/net/URL;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$ChildFirst$PrependingEnumeration;->enumeration:Ljava/util/Enumeration;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    :try_start_0
    iget-object v0, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$ChildFirst$PrependingEnumeration;->nextElement:Ljava/net/URL;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    iget-object v1, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$ChildFirst$PrependingEnumeration;->enumeration:Ljava/util/Enumeration;

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Ljava/net/URL;

    .line 22
    .line 23
    iput-object v1, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$ChildFirst$PrependingEnumeration;->nextElement:Ljava/net/URL;

    .line 24
    .line 25
    return-object v0

    .line 26
    :catchall_0
    move-exception v0

    .line 27
    iget-object v1, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$ChildFirst$PrependingEnumeration;->enumeration:Ljava/util/Enumeration;

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Ljava/net/URL;

    .line 34
    .line 35
    iput-object v1, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$ChildFirst$PrependingEnumeration;->nextElement:Ljava/net/URL;

    .line 36
    .line 37
    throw v0

    .line 38
    :cond_0
    invoke-static {}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏()V

    .line 39
    .line 40
    .line 41
    const/4 p0, 0x0

    .line 42
    return-object p0
.end method
