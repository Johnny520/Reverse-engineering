.class Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$Filtering$FilteringIterator;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$Filtering;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "FilteringIterator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "Lnet/bytebuddy/build/Plugin$Engine$Source$Element;",
        ">;"
    }
.end annotation


# instance fields
.field private current:Lnet/bytebuddy/build/Plugin$Engine$Source$Element;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private final iterator:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "Lnet/bytebuddy/build/Plugin$Engine$Source$Element;",
            ">;"
        }
    .end annotation
.end field

.field private final matcher:Lnet/bytebuddy/matcher/ElementMatcher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "Lnet/bytebuddy/build/Plugin$Engine$Source$Element;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ljava/util/Iterator;Lnet/bytebuddy/matcher/ElementMatcher;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Iterator<",
            "Lnet/bytebuddy/build/Plugin$Engine$Source$Element;",
            ">;",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "Lnet/bytebuddy/build/Plugin$Engine$Source$Element;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$Filtering$FilteringIterator;->iterator:Ljava/util/Iterator;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$Filtering$FilteringIterator;->matcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 7
    .line 8
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lnet/bytebuddy/build/Plugin$Engine$Source$Element;

    .line 19
    .line 20
    invoke-interface {p2, v0}, Lnet/bytebuddy/matcher/ElementMatcher;->matches(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    iput-object v0, p0, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$Filtering$FilteringIterator;->current:Lnet/bytebuddy/build/Plugin$Engine$Source$Element;

    .line 27
    .line 28
    :cond_1
    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/Iterator;Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/build/Plugin$1;)V
    .locals 0

    .line 29
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$Filtering$FilteringIterator;-><init>(Ljava/util/Iterator;Lnet/bytebuddy/matcher/ElementMatcher;)V

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$Filtering$FilteringIterator;->current:Lnet/bytebuddy/build/Plugin$Engine$Source$Element;

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

    .line 40
    invoke-virtual {p0}, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$Filtering$FilteringIterator;->next()Lnet/bytebuddy/build/Plugin$Engine$Source$Element;

    move-result-object p0

    return-object p0
.end method

.method public next()Lnet/bytebuddy/build/Plugin$Engine$Source$Element;
    .locals 3

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$Filtering$FilteringIterator;->current:Lnet/bytebuddy/build/Plugin$Engine$Source$Element;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    iput-object v1, p0, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$Filtering$FilteringIterator;->current:Lnet/bytebuddy/build/Plugin$Engine$Source$Element;

    .line 7
    .line 8
    :cond_0
    iget-object v1, p0, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$Filtering$FilteringIterator;->iterator:Ljava/util/Iterator;

    .line 9
    .line 10
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    iget-object v1, p0, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$Filtering$FilteringIterator;->iterator:Ljava/util/Iterator;

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lnet/bytebuddy/build/Plugin$Engine$Source$Element;

    .line 23
    .line 24
    iget-object v2, p0, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$Filtering$FilteringIterator;->matcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 25
    .line 26
    invoke-interface {v2, v1}, Lnet/bytebuddy/matcher/ElementMatcher;->matches(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    iput-object v1, p0, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$Filtering$FilteringIterator;->current:Lnet/bytebuddy/build/Plugin$Engine$Source$Element;

    .line 33
    .line 34
    :cond_1
    return-object v0

    .line 35
    :cond_2
    invoke-static {}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏()V

    .line 36
    .line 37
    .line 38
    const/4 p0, 0x0

    .line 39
    return-object p0
.end method

.method public remove()V
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$Filtering$FilteringIterator;->iterator:Ljava/util/Iterator;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Iterator;->remove()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
