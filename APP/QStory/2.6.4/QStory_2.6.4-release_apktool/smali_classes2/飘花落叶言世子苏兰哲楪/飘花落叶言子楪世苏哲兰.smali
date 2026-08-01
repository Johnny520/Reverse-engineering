.class public final L飘花落叶言世子苏兰哲楪/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;


# static fields
.field public static final 飘花落叶言子楪哲苏兰世:L飘花落叶言世子苏兰哲楪/飘花落叶言子楪世苏哲兰;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, L飘花落叶言世子苏兰哲楪/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言世子苏兰哲楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:L飘花落叶言世子苏兰哲楪/飘花落叶言子楪世苏哲兰;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final getContext()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v0, "This continuation is already complete"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string p1, "This continuation is already complete"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "This continuation is already complete"

    .line 2
    .line 3
    return-object p0
.end method
