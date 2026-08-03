.class public LYue/ۥۡۦۤۧ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Request.kt\nokhttp3/Request$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,298:1\n1#2:299\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۦۤۧ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Request.kt\nokhttp3/Request$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,298:1\n1#2:299\n*E\n"
.end annotation


# instance fields
.field public ۥ:LYue/ۥ۠ۤۨۥ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public ۥ۟:Ljava/lang/String;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public ۥ۟۟:LYue/ۥ۠ۤۢۢ$ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public ۥ۟۟۟:LYue/ۥۡۦۥ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public ۥ۟۟۟۟:Ljava/util/Map;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, LYue/ۥۡۦۤۧ$ۥ;->ۥ۟۟۟۟:Ljava/util/Map;

    .line 3
    const-string v0, "GET"

    iput-object v0, p0, LYue/ۥۡۦۤۧ$ۥ;->ۥ۟:Ljava/lang/String;

    .line 4
    new-instance v0, LYue/ۥ۠ۤۢۢ$ۥ;

    invoke-direct {v0}, LYue/ۥ۠ۤۢۢ$ۥ;-><init>()V

    iput-object v0, p0, LYue/ۥۡۦۤۧ$ۥ;->ۥ۟۟:LYue/ۥ۠ۤۢۢ$ۥ;

    return-void
.end method

.method public constructor <init>(LYue/ۥۡۦۤۧ;)V
    .locals 1
    .param p1    # LYue/ۥۡۦۤۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "request"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, LYue/ۥۡۦۤۧ$ۥ;->ۥ۟۟۟۟:Ljava/util/Map;

    .line 7
    invoke-virtual {p1}, LYue/ۥۡۦۤۧ;->ۥ۟۟۠۠()LYue/ۥ۠ۤۨۥ;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۡۦۤۧ$ۥ;->ۥ:LYue/ۥ۠ۤۨۥ;

    .line 8
    invoke-virtual {p1}, LYue/ۥۡۦۤۧ;->ۥ۟۟۟ۧ()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۡۦۤۧ$ۥ;->ۥ۟:Ljava/lang/String;

    .line 9
    invoke-virtual {p1}, LYue/ۥۡۦۤۧ;->ۥ۟۟۟۠()LYue/ۥۡۦۥ;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۡۦۤۧ$ۥ;->ۥ۟۟۟:LYue/ۥۡۦۥ;

    .line 10
    invoke-virtual {p1}, LYue/ۥۡۦۤۧ;->ۥ۟۟۟ۢ()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 11
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p1}, LYue/ۥۡۦۤۧ;->ۥ۟۟۟ۢ()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۠ۨۧۧ;->ۥ۟۟ۦۥ(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    .line 13
    :goto_0
    iput-object v0, p0, LYue/ۥۡۦۤۧ$ۥ;->ۥ۟۟۟۟:Ljava/util/Map;

    .line 14
    invoke-virtual {p1}, LYue/ۥۡۦۤۧ;->ۥ۟۟۟ۤ()LYue/ۥ۠ۤۢۢ;

    move-result-object p1

    invoke-virtual {p1}, LYue/ۥ۠ۤۢۢ;->ۥۣ۟۟۟()LYue/ۥ۠ۤۢۢ$ۥ;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۡۦۤۧ$ۥ;->ۥ۟۟:LYue/ۥ۠ۤۢۢ$ۥ;

    return-void
.end method

.method public static synthetic ۥ۟۟۟۠(LYue/ۥۡۦۤۧ$ۥ;LYue/ۥۡۦۥ;ILjava/lang/Object;)LYue/ۥۡۦۤۧ$ۥ;
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    sget-object p1, LYue/ۥۣۢۥ۟;->ۥ۟۟۟:LYue/ۥۡۦۥ;

    :cond_0
    invoke-virtual {p0, p1}, LYue/ۥۡۦۤۧ$ۥ;->ۥ۟۟۟۟(LYue/ۥۡۦۥ;)LYue/ۥۡۦۤۧ$ۥ;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: delete"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public ۥ(Ljava/lang/String;Ljava/lang/String;)LYue/ۥۡۦۤۧ$ۥ;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "name"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۡۦۤۧ$ۥ;->ۥ۟۟:LYue/ۥ۠ۤۢۢ$ۥ;

    invoke-virtual {v0, p1, p2}, LYue/ۥ۠ۤۢۢ$ۥ;->ۥ۟(Ljava/lang/String;Ljava/lang/String;)LYue/ۥ۠ۤۢۢ$ۥ;

    return-object p0
.end method

.method public ۥ۟()LYue/ۥۡۦۤۧ;
    .locals 7
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v1, p0, LYue/ۥۡۦۤۧ$ۥ;->ۥ:LYue/ۥ۠ۤۨۥ;

    if-eqz v1, :cond_0

    iget-object v2, p0, LYue/ۥۡۦۤۧ$ۥ;->ۥ۟:Ljava/lang/String;

    iget-object v0, p0, LYue/ۥۡۦۤۧ$ۥ;->ۥ۟۟:LYue/ۥ۠ۤۢۢ$ۥ;

    invoke-virtual {v0}, LYue/ۥ۠ۤۢۢ$ۥ;->ۥۣ۟۟۟()LYue/ۥ۠ۤۢۢ;

    move-result-object v3

    iget-object v4, p0, LYue/ۥۡۦۤۧ$ۥ;->ۥ۟۟۟:LYue/ۥۡۦۥ;

    iget-object v0, p0, LYue/ۥۡۦۤۧ$ۥ;->ۥ۟۟۟۟:Ljava/util/Map;

    invoke-static {v0}, LYue/ۥۣۢۥ۟;->ۥ۟۟ۤ۠(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v5

    new-instance v6, LYue/ۥۡۦۤۧ;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LYue/ۥۡۦۤۧ;-><init>(LYue/ۥ۠ۤۨۥ;Ljava/lang/String;LYue/ۥ۠ۤۢۢ;LYue/ۥۡۦۥ;Ljava/util/Map;)V

    return-object v6

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "url == null"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ۥ۟۟(LYue/ۥۣ۟ۦ۟;)LYue/ۥۡۦۤۧ$ۥ;
    .locals 2
    .param p1    # LYue/ۥۣ۟ۦ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "cacheControl"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYue/ۥۣ۟ۦ۟;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const-string v1, "Cache-Control"

    if-nez v0, :cond_0

    invoke-virtual {p0, v1}, LYue/ۥۡۦۤۧ$ۥ;->ۥۣ۟۟۠(Ljava/lang/String;)LYue/ۥۡۦۤۧ$ۥ;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v1, p1}, LYue/ۥۡۦۤۧ$ۥ;->ۥ۟۟۟ۨ(Ljava/lang/String;Ljava/lang/String;)LYue/ۥۡۦۤۧ$ۥ;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final ۥ۟۟۟()LYue/ۥۡۦۤۧ$ۥ;
    .locals 2
    .annotation build LYue/ۥ۠ۦۡۡ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, LYue/ۥۡۦۤۧ$ۥ;->ۥ۟۟۟۠(LYue/ۥۡۦۤۧ$ۥ;LYue/ۥۡۦۥ;ILjava/lang/Object;)LYue/ۥۡۦۤۧ$ۥ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟۟(LYue/ۥۡۦۥ;)LYue/ۥۡۦۤۧ$ۥ;
    .locals 1
    .param p1    # LYue/ۥۡۦۥ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡۡ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "DELETE"

    invoke-virtual {p0, v0, p1}, LYue/ۥۡۦۤۧ$ۥ;->ۥ۟۟۠۟(Ljava/lang/String;LYue/ۥۡۦۥ;)LYue/ۥۡۦۤۧ$ۥ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟ۡ()LYue/ۥۡۦۤۧ$ۥ;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "GET"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, LYue/ۥۡۦۤۧ$ۥ;->ۥ۟۟۠۟(Ljava/lang/String;LYue/ۥۡۦۥ;)LYue/ۥۡۦۤۧ$ۥ;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ۟۟۟ۢ()LYue/ۥۡۦۥ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦۤۧ$ۥ;->ۥ۟۟۟:LYue/ۥۡۦۥ;

    return-object v0
.end method

.method public final ۥۣ۟۟۟()LYue/ۥ۠ۤۢۢ$ۥ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦۤۧ$ۥ;->ۥ۟۟:LYue/ۥ۠ۤۢۢ$ۥ;

    return-object v0
.end method

.method public final ۥ۟۟۟ۤ()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦۤۧ$ۥ;->ۥ۟:Ljava/lang/String;

    return-object v0
.end method

.method public final ۥ۟۟۟ۥ()Ljava/util/Map;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦۤۧ$ۥ;->ۥ۟۟۟۟:Ljava/util/Map;

    return-object v0
.end method

.method public final ۥ۟۟۟ۦ()LYue/ۥ۠ۤۨۥ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦۤۧ$ۥ;->ۥ:LYue/ۥ۠ۤۨۥ;

    return-object v0
.end method

.method public ۥ۟۟۟ۧ()LYue/ۥۡۦۤۧ$ۥ;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "HEAD"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, LYue/ۥۡۦۤۧ$ۥ;->ۥ۟۟۠۟(Ljava/lang/String;LYue/ۥۡۦۥ;)LYue/ۥۡۦۤۧ$ۥ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟ۨ(Ljava/lang/String;Ljava/lang/String;)LYue/ۥۡۦۤۧ$ۥ;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "name"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۡۦۤۧ$ۥ;->ۥ۟۟:LYue/ۥ۠ۤۢۢ$ۥ;

    invoke-virtual {v0, p1, p2}, LYue/ۥ۠ۤۢۢ$ۥ;->ۥ۟۟۟ۧ(Ljava/lang/String;Ljava/lang/String;)LYue/ۥ۠ۤۢۢ$ۥ;

    return-object p0
.end method

.method public ۥ۟۟۠(LYue/ۥ۠ۤۢۢ;)LYue/ۥۡۦۤۧ$ۥ;
    .locals 1
    .param p1    # LYue/ۥ۠ۤۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "headers"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYue/ۥ۠ۤۢۢ;->ۥۣ۟۟۟()LYue/ۥ۠ۤۢۢ$ۥ;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۡۦۤۧ$ۥ;->ۥ۟۟:LYue/ۥ۠ۤۢۢ$ۥ;

    return-object p0
.end method

.method public ۥ۟۟۠۟(Ljava/lang/String;LYue/ۥۡۦۥ;)LYue/ۥۡۦۤۧ$ۥ;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۡۦۥ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "method"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_3

    const-string v0, "method "

    if-nez p2, :cond_1

    invoke-static {p1}, LYue/ۥۣ۠ۤۨ;->ۥ۟۟۟۟(Ljava/lang/String;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " must have a request body."

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    invoke-static {p1}, LYue/ۥۣ۠ۤۨ;->ۥ۟(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    :goto_0
    iput-object p1, p0, LYue/ۥۡۦۤۧ$ۥ;->ۥ۟:Ljava/lang/String;

    iput-object p2, p0, LYue/ۥۡۦۤۧ$ۥ;->ۥ۟۟۟:LYue/ۥۡۦۥ;

    return-object p0

    :cond_2
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " must not have a request body."

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "method.isEmpty() == true"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥ۟۟۠۠(LYue/ۥۡۦۥ;)LYue/ۥۡۦۤۧ$ۥ;
    .locals 1
    .param p1    # LYue/ۥۡۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "body"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "PATCH"

    invoke-virtual {p0, v0, p1}, LYue/ۥۡۦۤۧ$ۥ;->ۥ۟۟۠۟(Ljava/lang/String;LYue/ۥۡۦۥ;)LYue/ۥۡۦۤۧ$ۥ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۠ۡ(LYue/ۥۡۦۥ;)LYue/ۥۡۦۤۧ$ۥ;
    .locals 1
    .param p1    # LYue/ۥۡۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "body"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "POST"

    invoke-virtual {p0, v0, p1}, LYue/ۥۡۦۤۧ$ۥ;->ۥ۟۟۠۟(Ljava/lang/String;LYue/ۥۡۦۥ;)LYue/ۥۡۦۤۧ$ۥ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۠ۢ(LYue/ۥۡۦۥ;)LYue/ۥۡۦۤۧ$ۥ;
    .locals 1
    .param p1    # LYue/ۥۡۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "body"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "PUT"

    invoke-virtual {p0, v0, p1}, LYue/ۥۡۦۤۧ$ۥ;->ۥ۟۟۠۟(Ljava/lang/String;LYue/ۥۡۦۥ;)LYue/ۥۡۦۤۧ$ۥ;

    move-result-object p1

    return-object p1
.end method

.method public ۥۣ۟۟۠(Ljava/lang/String;)LYue/ۥۡۦۤۧ$ۥ;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "name"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۡۦۤۧ$ۥ;->ۥ۟۟:LYue/ۥ۠ۤۢۢ$ۥ;

    invoke-virtual {v0, p1}, LYue/ۥ۠ۤۢۢ$ۥ;->ۥ۟۟۟ۦ(Ljava/lang/String;)LYue/ۥ۠ۤۢۢ$ۥ;

    return-object p0
.end method

.method public final ۥ۟۟۠ۤ(LYue/ۥۡۦۥ;)V
    .locals 0
    .param p1    # LYue/ۥۡۦۥ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    iput-object p1, p0, LYue/ۥۡۦۤۧ$ۥ;->ۥ۟۟۟:LYue/ۥۡۦۥ;

    return-void
.end method

.method public final ۥ۟۟۠ۥ(LYue/ۥ۠ۤۢۢ$ۥ;)V
    .locals 1
    .param p1    # LYue/ۥ۠ۤۢۢ$ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LYue/ۥۡۦۤۧ$ۥ;->ۥ۟۟:LYue/ۥ۠ۤۢۢ$ۥ;

    return-void
.end method

.method public final ۥ۟۟۠ۦ(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LYue/ۥۡۦۤۧ$ۥ;->ۥ۟:Ljava/lang/String;

    return-void
.end method

.method public final ۥ۟۟۠ۧ(Ljava/util/Map;)V
    .locals 1
    .param p1    # Ljava/util/Map;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LYue/ۥۡۦۤۧ$ۥ;->ۥ۟۟۟۟:Ljava/util/Map;

    return-void
.end method

.method public final ۥ۟۟۠ۨ(LYue/ۥ۠ۤۨۥ;)V
    .locals 0
    .param p1    # LYue/ۥ۠ۤۨۥ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    iput-object p1, p0, LYue/ۥۡۦۤۧ$ۥ;->ۥ:LYue/ۥ۠ۤۨۥ;

    return-void
.end method

.method public ۥ۟۟ۡ(Ljava/lang/Class;Ljava/lang/Object;)LYue/ۥۡۦۤۧ$ۥ;
    .locals 1
    .param p1    # Ljava/lang/Class;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "-TT;>;TT;)",
            "LYue/\u06e5\u06e1\u06e6\u06e4\u06e7$\u06e5;"
        }
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_0

    iget-object p2, p0, LYue/ۥۡۦۤۧ$ۥ;->ۥ۟۟۟۟:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget-object v0, p0, LYue/ۥۡۦۤۧ$ۥ;->ۥ۟۟۟۟:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, LYue/ۥۡۦۤۧ$ۥ;->ۥ۟۟۟۟:Ljava/util/Map;

    :cond_1
    iget-object v0, p0, LYue/ۥۡۦۤۧ$ۥ;->ۥ۟۟۟۟:Ljava/util/Map;

    invoke-virtual {p1, p2}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    return-object p0
.end method

.method public ۥ۟۟ۡ۟(Ljava/lang/Object;)LYue/ۥۡۦۤۧ$ۥ;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-class v0, Ljava/lang/Object;

    invoke-virtual {p0, v0, p1}, LYue/ۥۡۦۤۧ$ۥ;->ۥ۟۟ۡ(Ljava/lang/Class;Ljava/lang/Object;)LYue/ۥۡۦۤۧ$ۥ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟ۡ۠(LYue/ۥ۠ۤۨۥ;)LYue/ۥۡۦۤۧ$ۥ;
    .locals 1
    .param p1    # LYue/ۥ۠ۤۨۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "url"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LYue/ۥۡۦۤۧ$ۥ;->ۥ:LYue/ۥ۠ۤۨۥ;

    return-object p0
.end method

.method public ۥ۟۟ۡۡ(Ljava/lang/String;)LYue/ۥۡۦۤۧ$ۥ;
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "url"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ws:"

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, LYue/ۥۢ۠ۢۤ;->ۥ۟۠ۤۡ(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    const-string v2, "this as java.lang.String).substring(startIndex)"

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "http:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x3

    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string v0, "wss:"

    invoke-static {p1, v0, v1}, LYue/ۥۢ۠ۢۤ;->ۥ۟۠ۤۡ(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "https:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x4

    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_1
    :goto_0
    sget-object v0, LYue/ۥ۠ۤۨۥ;->ۥ۟۟۟ۥ:LYue/ۥ۠ۤۨۥ$ۥ۟;

    invoke-virtual {v0, p1}, LYue/ۥ۠ۤۨۥ$ۥ۟;->ۥ۟۟۟ۢ(Ljava/lang/String;)LYue/ۥ۠ۤۨۥ;

    move-result-object p1

    invoke-virtual {p0, p1}, LYue/ۥۡۦۤۧ$ۥ;->ۥ۟۟ۡ۠(LYue/ۥ۠ۤۨۥ;)LYue/ۥۡۦۤۧ$ۥ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟ۡۢ(Ljava/net/URL;)LYue/ۥۡۦۤۧ$ۥ;
    .locals 2
    .param p1    # Ljava/net/URL;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "url"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LYue/ۥ۠ۤۨۥ;->ۥ۟۟۟ۥ:LYue/ۥ۠ۤۨۥ$ۥ۟;

    invoke-virtual {p1}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "url.toString()"

    invoke-static {p1, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, LYue/ۥ۠ۤۨۥ$ۥ۟;->ۥ۟۟۟ۢ(Ljava/lang/String;)LYue/ۥ۠ۤۨۥ;

    move-result-object p1

    invoke-virtual {p0, p1}, LYue/ۥۡۦۤۧ$ۥ;->ۥ۟۟ۡ۠(LYue/ۥ۠ۤۨۥ;)LYue/ۥۡۦۤۧ$ۥ;

    move-result-object p1

    return-object p1
.end method
