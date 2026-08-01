.class public final Lio/ktor/server/engine/飘花落叶言子楪哲兰世苏;
.super Lio/ktor/util/pipeline/飘花落叶言子楪世哲苏兰;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子世楪苏哲兰:Lio/ktor/util/pipeline/飘花落叶言子楪世兰哲苏;

.field public static final 飘花落叶言子楪兰哲苏世:Lio/ktor/util/pipeline/飘花落叶言子楪世兰哲苏;


# instance fields
.field public final 飘花落叶言子楪兰哲世苏:Lio/ktor/server/response/飘花落叶言子楪世苏兰哲;

.field public final 飘花落叶言子楪兰苏世哲:Z

.field public final 飘花落叶言子楪兰苏哲世:Lio/ktor/server/request/飘花落叶言子楪世苏兰哲;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lio/ktor/util/pipeline/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    const-string v1, "before"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lio/ktor/util/pipeline/飘花落叶言子楪世兰哲苏;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lio/ktor/server/engine/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪兰哲苏世:Lio/ktor/util/pipeline/飘花落叶言子楪世兰哲苏;

    .line 9
    .line 10
    new-instance v0, Lio/ktor/util/pipeline/飘花落叶言子楪世兰哲苏;

    .line 11
    .line 12
    const-string v1, "call"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lio/ktor/util/pipeline/飘花落叶言子楪世兰哲苏;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lio/ktor/server/engine/飘花落叶言子楪哲兰世苏;->飘花落叶言子世楪苏哲兰:Lio/ktor/util/pipeline/飘花落叶言子楪世兰哲苏;

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(Z)V
    .locals 2

    .line 1
    sget-object v0, Lio/ktor/server/engine/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪兰哲苏世:Lio/ktor/util/pipeline/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    sget-object v1, Lio/ktor/server/engine/飘花落叶言子楪哲兰世苏;->飘花落叶言子世楪苏哲兰:Lio/ktor/util/pipeline/飘花落叶言子楪世兰哲苏;

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Lio/ktor/util/pipeline/飘花落叶言子楪世兰哲苏;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-direct {p0, v0}, Lio/ktor/util/pipeline/飘花落叶言子楪世哲苏兰;-><init>([Lio/ktor/util/pipeline/飘花落叶言子楪世兰哲苏;)V

    .line 10
    .line 11
    .line 12
    iput-boolean p1, p0, Lio/ktor/server/engine/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪兰苏世哲:Z

    .line 13
    .line 14
    new-instance v0, Lio/ktor/server/request/飘花落叶言子楪世苏兰哲;

    .line 15
    .line 16
    invoke-direct {v0, p1}, Lio/ktor/server/request/飘花落叶言子楪世苏兰哲;-><init>(Z)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lio/ktor/server/engine/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪兰苏哲世:Lio/ktor/server/request/飘花落叶言子楪世苏兰哲;

    .line 20
    .line 21
    new-instance v0, Lio/ktor/server/response/飘花落叶言子楪世苏兰哲;

    .line 22
    .line 23
    invoke-direct {v0, p1}, Lio/ktor/server/response/飘花落叶言子楪世苏兰哲;-><init>(Z)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lio/ktor/server/engine/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪兰哲世苏:Lio/ktor/server/response/飘花落叶言子楪世苏兰哲;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪苏哲世兰()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lio/ktor/server/engine/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪兰苏世哲:Z

    .line 2
    .line 3
    return p0
.end method
