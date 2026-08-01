.class public Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/agent/builder/AgentBuilder$Default;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Transformation"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation$TransformerIterator;,
        Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation$DifferentialMatcher;,
        Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation$SimpleMatcher;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field private static final NONE:[B
    .annotation runtime Lnet/bytebuddy/utility/nullability/AlwaysNull;
    .end annotation
.end field


# instance fields
.field private final matcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

.field private final terminal:Z

.field private final transformers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Ljava/util/List;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer;",
            ">;Z)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation;->matcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation;->transformers:Ljava/util/List;

    .line 7
    .line 8
    iput-boolean p3, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation;->terminal:Z

    .line 9
    .line 10
    return-void
.end method

.method public static synthetic access$1700()[B
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation;->NONE:[B

    .line 2
    .line 3
    return-object v0
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
    iget-boolean v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation;->terminal:Z

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation;

    .line 23
    .line 24
    iget-boolean v3, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation;->terminal:Z

    .line 25
    .line 26
    if-eq v2, v3, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation;->matcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    .line 30
    .line 31
    iget-object v3, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation;->matcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

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
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation;->transformers:Ljava/util/List;

    .line 41
    .line 42
    iget-object p1, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation;->transformers:Ljava/util/List;

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

.method public getMatcher()Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation;->matcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    .line 2
    .line 3
    return-object p0
.end method

.method public getTransformers()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation;->transformers:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
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
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation;->matcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    add-int/2addr v2, v0

    .line 19
    mul-int/2addr v2, v1

    .line 20
    iget-object v0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation;->transformers:Ljava/util/List;

    .line 21
    .line 22
    invoke-static {v0, v2, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世哲兰(Ljava/util/List;II)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-boolean p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation;->terminal:Z

    .line 27
    .line 28
    add-int/2addr v0, p0

    .line 29
    return v0
.end method

.method public isTerminal()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation;->terminal:Z

    .line 2
    .line 3
    return p0
.end method
