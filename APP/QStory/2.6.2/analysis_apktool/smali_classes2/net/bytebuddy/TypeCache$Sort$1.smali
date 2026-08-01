.class final enum Lnet/bytebuddy/TypeCache$Sort$1;
.super Lnet/bytebuddy/TypeCache$Sort;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/TypeCache$Sort;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4009
    name = null
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lnet/bytebuddy/TypeCache$Sort;-><init>(Ljava/lang/String;ILnet/bytebuddy/TypeCache$1;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public bridge synthetic wrap(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0

    .line 7
    invoke-virtual {p0, p1}, Lnet/bytebuddy/TypeCache$Sort$1;->wrap(Ljava/lang/Class;)Ljava/lang/ref/Reference;

    move-result-object p0

    return-object p0
.end method

.method public wrap(Ljava/lang/Class;)Ljava/lang/ref/Reference;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/ref/Reference<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    .line 1
    new-instance p0, Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method
