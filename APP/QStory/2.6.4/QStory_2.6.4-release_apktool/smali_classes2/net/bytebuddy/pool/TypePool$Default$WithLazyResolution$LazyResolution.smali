.class public Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazyResolution;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/pool/TypePool$Resolution;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "LazyResolution"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
    includeSyntheticFields = true
.end annotation


# instance fields
.field private final name:Ljava/lang/String;

.field final synthetic this$0:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazyResolution;->this$0:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazyResolution;->name:Ljava/lang/String;

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
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazyResolution;->name:Ljava/lang/String;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazyResolution;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazyResolution;->name:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_3

    .line 31
    .line 32
    return v1

    .line 33
    :cond_3
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazyResolution;->this$0:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;

    .line 34
    .line 35
    iget-object p1, p1, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazyResolution;->this$0:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-nez p0, :cond_4

    .line 42
    .line 43
    return v1

    .line 44
    :cond_4
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
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazyResolution;->name:Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {v0, v1, v2}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazyResolution;->this$0:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;

    .line 19
    .line 20
    invoke-virtual {p0}, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    add-int/2addr p0, v0

    .line 25
    return p0
.end method

.method public isResolved()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazyResolution;->this$0:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazyResolution;->name:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;->doResolve(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-interface {p0}, Lnet/bytebuddy/pool/TypePool$Resolution;->isResolved()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public resolve()Lnet/bytebuddy/description/type/TypeDescription;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazyTypeDescription;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazyResolution;->this$0:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;

    .line 4
    .line 5
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazyResolution;->name:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0}, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$LazyTypeDescription;-><init>(Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method
