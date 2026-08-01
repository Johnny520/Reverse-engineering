.class public Lnet/bytebuddy/pool/TypePool$CacheProvider$Discriminating;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/pool/TypePool$CacheProvider;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/pool/TypePool$CacheProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Discriminating"
.end annotation


# instance fields
.field private final matched:Lnet/bytebuddy/pool/TypePool$CacheProvider;

.field private final matcher:Lnet/bytebuddy/matcher/ElementMatcher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final unmatched:Lnet/bytebuddy/pool/TypePool$CacheProvider;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/pool/TypePool$CacheProvider;Lnet/bytebuddy/pool/TypePool$CacheProvider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "Ljava/lang/String;",
            ">;",
            "Lnet/bytebuddy/pool/TypePool$CacheProvider;",
            "Lnet/bytebuddy/pool/TypePool$CacheProvider;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$CacheProvider$Discriminating;->matcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/pool/TypePool$CacheProvider$Discriminating;->matched:Lnet/bytebuddy/pool/TypePool$CacheProvider;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/pool/TypePool$CacheProvider$Discriminating;->unmatched:Lnet/bytebuddy/pool/TypePool$CacheProvider;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public clear()V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lnet/bytebuddy/pool/TypePool$CacheProvider$Discriminating;->unmatched:Lnet/bytebuddy/pool/TypePool$CacheProvider;

    .line 2
    .line 3
    invoke-interface {v0}, Lnet/bytebuddy/pool/TypePool$CacheProvider;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$CacheProvider$Discriminating;->matched:Lnet/bytebuddy/pool/TypePool$CacheProvider;

    .line 7
    .line 8
    invoke-interface {p0}, Lnet/bytebuddy/pool/TypePool$CacheProvider;->clear()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception v0

    .line 13
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$CacheProvider$Discriminating;->matched:Lnet/bytebuddy/pool/TypePool$CacheProvider;

    .line 14
    .line 15
    invoke-interface {p0}, Lnet/bytebuddy/pool/TypePool$CacheProvider;->clear()V

    .line 16
    .line 17
    .line 18
    throw v0
.end method

.method public find(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;
    .locals 1
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/pool/TypePool$CacheProvider$Discriminating;->matcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lnet/bytebuddy/matcher/ElementMatcher;->matches(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$CacheProvider$Discriminating;->matched:Lnet/bytebuddy/pool/TypePool$CacheProvider;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$CacheProvider$Discriminating;->unmatched:Lnet/bytebuddy/pool/TypePool$CacheProvider;

    .line 13
    .line 14
    :goto_0
    invoke-interface {p0, p1}, Lnet/bytebuddy/pool/TypePool$CacheProvider;->find(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public register(Ljava/lang/String;Lnet/bytebuddy/pool/TypePool$Resolution;)Lnet/bytebuddy/pool/TypePool$Resolution;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/pool/TypePool$CacheProvider$Discriminating;->matcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lnet/bytebuddy/matcher/ElementMatcher;->matches(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$CacheProvider$Discriminating;->matched:Lnet/bytebuddy/pool/TypePool$CacheProvider;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$CacheProvider$Discriminating;->unmatched:Lnet/bytebuddy/pool/TypePool$CacheProvider;

    .line 13
    .line 14
    :goto_0
    invoke-interface {p0, p1, p2}, Lnet/bytebuddy/pool/TypePool$CacheProvider;->register(Ljava/lang/String;Lnet/bytebuddy/pool/TypePool$Resolution;)Lnet/bytebuddy/pool/TypePool$Resolution;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method
