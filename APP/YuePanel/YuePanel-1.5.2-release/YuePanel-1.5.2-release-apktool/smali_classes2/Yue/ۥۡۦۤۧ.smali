.class public final LYue/ۥۡۦۤۧ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Request.kt\nokhttp3/Request\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,298:1\n1864#2,3:299\n*S KotlinDebug\n*F\n+ 1 Request.kt\nokhttp3/Request\n*L\n119#1:299,3\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡۦۤۧ$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Request.kt\nokhttp3/Request\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,298:1\n1864#2,3:299\n*S KotlinDebug\n*F\n+ 1 Request.kt\nokhttp3/Request\n*L\n119#1:299,3\n*E\n"
.end annotation


# instance fields
.field public final ۥ:LYue/ۥ۠ۤۨۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟:Ljava/lang/String;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟:LYue/ۥ۠ۤۢۢ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۟:LYue/ۥۡۦۥ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public final ۥ۟۟۟۟:Ljava/util/Map;
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

.field public ۥ۟۟۟۠:LYue/ۥۣ۟ۦ۟;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥ۠ۤۨۥ;Ljava/lang/String;LYue/ۥ۠ۤۢۢ;LYue/ۥۡۦۥ;Ljava/util/Map;)V
    .locals 1
    .param p1    # LYue/ۥ۠ۤۨۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥ۠ۤۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p4    # LYue/ۥۡۦۥ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p5    # Ljava/util/Map;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e4\u06e8\u06e5;",
            "Ljava/lang/String;",
            "LYue/\u06e5\u06e0\u06e4\u06e2\u06e2;",
            "LYue/\u06e5\u06e1\u06e6\u06e5;",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "url"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "method"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headers"

    invoke-static {p3, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tags"

    invoke-static {p5, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۡۦۤۧ;->ۥ:LYue/ۥ۠ۤۨۥ;

    iput-object p2, p0, LYue/ۥۡۦۤۧ;->ۥ۟:Ljava/lang/String;

    iput-object p3, p0, LYue/ۥۡۦۤۧ;->ۥ۟۟:LYue/ۥ۠ۤۢۢ;

    iput-object p4, p0, LYue/ۥۡۦۤۧ;->ۥ۟۟۟:LYue/ۥۡۦۥ;

    iput-object p5, p0, LYue/ۥۡۦۤۧ;->ۥ۟۟۟۟:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 6
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Request{method="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥۡۦۤۧ;->ۥ۟:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥۡۦۤۧ;->ۥ:LYue/ۥ۠ۤۨۥ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥۡۦۤۧ;->ۥ۟۟:LYue/ۥ۠ۤۢۢ;

    invoke-virtual {v1}, LYue/ۥ۠ۤۢۢ;->size()I

    move-result v1

    if-eqz v1, :cond_3

    const-string v1, ", headers=["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥۡۦۤۧ;->ۥ۟۟:LYue/ۥ۠ۤۢۢ;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v4, v2, 0x1

    if-gez v2, :cond_0

    invoke-static {}, LYue/ۥ۟ۥۣۡ;->ۥۣ۟۟۟()V

    :cond_0
    check-cast v3, LYue/ۥۣۡۦ۠;

    invoke-virtual {v3}, LYue/ۥۣۡۦ۠;->ۥ()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v3}, LYue/ۥۣۡۦ۠;->ۥ۟()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-lez v2, :cond_1

    const-string v2, ", "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x3a

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move v2, v4

    goto :goto_0

    :cond_2
    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_3
    iget-object v1, p0, LYue/ۥۡۦۤۧ;->ۥ۟۟۟۟:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_4

    const-string v1, ", tags="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥۡۦۤۧ;->ۥ۟۟۟۟:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_4
    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final ۥ()LYue/ۥۡۦۥ;
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to val"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "body"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "-deprecated_body"
    .end annotation

    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦۤۧ;->ۥ۟۟۟:LYue/ۥۡۦۥ;

    return-object v0
.end method

.method public final ۥ۟()LYue/ۥۣ۟ۦ۟;
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to val"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "cacheControl"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "-deprecated_cacheControl"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-virtual {p0}, LYue/ۥۡۦۤۧ;->ۥ۟۟۟ۡ()LYue/ۥۣ۟ۦ۟;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ۟۟()LYue/ۥ۠ۤۢۢ;
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to val"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "headers"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "-deprecated_headers"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦۤۧ;->ۥ۟۟:LYue/ۥ۠ۤۢۢ;

    return-object v0
.end method

.method public final ۥ۟۟۟()Ljava/lang/String;
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to val"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "method"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "-deprecated_method"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦۤۧ;->ۥ۟:Ljava/lang/String;

    return-object v0
.end method

.method public final ۥ۟۟۟۟()LYue/ۥ۠ۤۨۥ;
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to val"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "url"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "-deprecated_url"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦۤۧ;->ۥ:LYue/ۥ۠ۤۨۥ;

    return-object v0
.end method

.method public final ۥ۟۟۟۠()LYue/ۥۡۦۥ;
    .locals 1
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "body"
    .end annotation

    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦۤۧ;->ۥ۟۟۟:LYue/ۥۡۦۥ;

    return-object v0
.end method

.method public final ۥ۟۟۟ۡ()LYue/ۥۣ۟ۦ۟;
    .locals 2
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "cacheControl"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦۤۧ;->ۥ۟۟۟۠:LYue/ۥۣ۟ۦ۟;

    if-nez v0, :cond_0

    sget-object v0, LYue/ۥۣ۟ۦ۟;->ۥ۟۟۟ۨ:LYue/ۥۣ۟ۦ۟$ۥ۟;

    iget-object v1, p0, LYue/ۥۡۦۤۧ;->ۥ۟۟:LYue/ۥ۠ۤۢۢ;

    invoke-virtual {v0, v1}, LYue/ۥۣ۟ۦ۟$ۥ۟;->ۥ۟۟(LYue/ۥ۠ۤۢۢ;)LYue/ۥۣ۟ۦ۟;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۡۦۤۧ;->ۥ۟۟۟۠:LYue/ۥۣ۟ۦ۟;

    :cond_0
    return-object v0
.end method

.method public final ۥ۟۟۟ۢ()Ljava/util/Map;
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

    iget-object v0, p0, LYue/ۥۡۦۤۧ;->ۥ۟۟۟۟:Ljava/util/Map;

    return-object v0
.end method

.method public final ۥۣ۟۟۟(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    const-string v0, "name"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۡۦۤۧ;->ۥ۟۟:LYue/ۥ۠ۤۢۢ;

    invoke-virtual {v0, p1}, LYue/ۥ۠ۤۢۢ;->ۥ۟۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟۟ۤ()LYue/ۥ۠ۤۢۢ;
    .locals 1
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "headers"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦۤۧ;->ۥ۟۟:LYue/ۥ۠ۤۢۢ;

    return-object v0
.end method

.method public final ۥ۟۟۟ۥ(Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "name"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۡۦۤۧ;->ۥ۟۟:LYue/ۥ۠ۤۢۢ;

    invoke-virtual {v0, p1}, LYue/ۥ۠ۤۢۢ;->ۥ۟۟۟ۨ(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟۟ۦ()Z
    .locals 1

    iget-object v0, p0, LYue/ۥۡۦۤۧ;->ۥ:LYue/ۥ۠ۤۨۥ;

    invoke-virtual {v0}, LYue/ۥ۠ۤۨۥ;->ۥ۟۟ۡۥ()Z

    move-result v0

    return v0
.end method

.method public final ۥ۟۟۟ۧ()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "method"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦۤۧ;->ۥ۟:Ljava/lang/String;

    return-object v0
.end method

.method public final ۥ۟۟۟ۨ()LYue/ۥۡۦۤۧ$ۥ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, LYue/ۥۡۦۤۧ$ۥ;

    invoke-direct {v0, p0}, LYue/ۥۡۦۤۧ$ۥ;-><init>(LYue/ۥۡۦۤۧ;)V

    return-object v0
.end method

.method public final ۥ۟۟۠()Ljava/lang/Object;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    const-class v0, Ljava/lang/Object;

    invoke-virtual {p0, v0}, LYue/ۥۡۦۤۧ;->ۥ۟۟۠۟(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ۟۟۠۟(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Class;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "+TT;>;)TT;"
        }
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۡۦۤۧ;->ۥ۟۟۟۟:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟۠۠()LYue/ۥ۠ۤۨۥ;
    .locals 1
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "url"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦۤۧ;->ۥ:LYue/ۥ۠ۤۨۥ;

    return-object v0
.end method
