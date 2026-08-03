.class public final LYue/ۥ۠ۤۧۧ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۤۧۧ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LYue/ۥ۟ۨۥۢ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LYue/ۥ۠ۤۧۧ$ۥ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ(LYue/ۥۡۦۤۧ;)Ljava/util/List;
    .locals 6
    .param p1    # LYue/ۥۡۦۤۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e6\u06e4\u06e7;",
            ")",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e0\u06e4\u06e2\u06e1;",
            ">;"
        }
    .end annotation

    const-string v0, "request"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYue/ۥۡۦۤۧ;->ۥ۟۟۟ۤ()LYue/ۥ۠ۤۢۢ;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v0}, LYue/ۥ۠ۤۢۢ;->size()I

    move-result v2

    add-int/lit8 v2, v2, 0x4

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v2, LYue/ۥ۠ۤۢۡ;

    sget-object v3, LYue/ۥ۠ۤۢۡ;->ۥ۟۟۟ۦ:LYue/ۥۣ۟ۥۤ;

    invoke-virtual {p1}, LYue/ۥۡۦۤۧ;->ۥ۟۟۟ۧ()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, LYue/ۥ۠ۤۢۡ;-><init>(LYue/ۥۣ۟ۥۤ;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, LYue/ۥ۠ۤۢۡ;

    sget-object v3, LYue/ۥ۠ۤۢۡ;->ۥ۟۟۟ۧ:LYue/ۥۣ۟ۥۤ;

    sget-object v4, LYue/ۥۡۦۥ۠;->ۥ:LYue/ۥۡۦۥ۠;

    invoke-virtual {p1}, LYue/ۥۡۦۤۧ;->ۥ۟۟۠۠()LYue/ۥ۠ۤۨۥ;

    move-result-object v5

    invoke-virtual {v4, v5}, LYue/ۥۡۦۥ۠;->ۥ۟۟(LYue/ۥ۠ۤۨۥ;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, LYue/ۥ۠ۤۢۡ;-><init>(LYue/ۥۣ۟ۥۤ;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v2, "Host"

    invoke-virtual {p1, v2}, LYue/ۥۡۦۤۧ;->ۥۣ۟۟۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    new-instance v3, LYue/ۥ۠ۤۢۡ;

    sget-object v4, LYue/ۥ۠ۤۢۡ;->ۥ۟۟۠:LYue/ۥۣ۟ۥۤ;

    invoke-direct {v3, v4, v2}, LYue/ۥ۠ۤۢۡ;-><init>(LYue/ۥۣ۟ۥۤ;Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    new-instance v2, LYue/ۥ۠ۤۢۡ;

    sget-object v3, LYue/ۥ۠ۤۢۡ;->ۥ۟۟۟ۨ:LYue/ۥۣ۟ۥۤ;

    invoke-virtual {p1}, LYue/ۥۡۦۤۧ;->ۥ۟۟۠۠()LYue/ۥ۠ۤۨۥ;

    move-result-object p1

    invoke-virtual {p1}, LYue/ۥ۠ۤۨۥ;->ۥۣ۟۟۠()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, v3, p1}, LYue/ۥ۠ۤۢۡ;-><init>(LYue/ۥۣ۟ۥۤ;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, LYue/ۥ۠ۤۢۢ;->size()I

    move-result p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_3

    invoke-virtual {v0, v2}, LYue/ۥ۠ۤۢۢ;->ۥ۟۟۟۠(I)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v5, "US"

    invoke-static {v4, v5}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "this as java.lang.String).toLowerCase(locale)"

    invoke-static {v3, v4}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LYue/ۥ۠ۤۧۧ;->ۥ۟۟۟ۤ()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const-string v4, "te"

    invoke-static {v3, v4}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v0, v2}, LYue/ۥ۠ۤۢۢ;->ۥ۟۟۟ۧ(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, "trailers"

    invoke-static {v4, v5}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    :cond_1
    new-instance v4, LYue/ۥ۠ۤۢۡ;

    invoke-virtual {v0, v2}, LYue/ۥ۠ۤۢۢ;->ۥ۟۟۟ۧ(I)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v3, v5}, LYue/ۥ۠ۤۢۡ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    return-object v1
.end method

.method public final ۥ۟(LYue/ۥ۠ۤۢۢ;LYue/ۥۡۥۣۧ;)LYue/ۥۡۦۧ$ۥ;
    .locals 7
    .param p1    # LYue/ۥ۠ۤۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۡۥۣۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "headerBlock"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "protocol"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥ۠ۤۢۢ$ۥ;

    invoke-direct {v0}, LYue/ۥ۠ۤۢۢ$ۥ;-><init>()V

    invoke-virtual {p1}, LYue/ۥ۠ۤۢۢ;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_2

    invoke-virtual {p1, v3}, LYue/ۥ۠ۤۢۢ;->ۥ۟۟۟۠(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v3}, LYue/ۥ۠ۤۢۢ;->ۥ۟۟۟ۧ(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, ":status"

    invoke-static {v4, v6}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    sget-object v2, LYue/ۥۢ۠۠۟;->ۥ۟۟۟:LYue/ۥۢ۠۠۟$ۥ;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "HTTP/1.1 "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, LYue/ۥۢ۠۠۟$ۥ;->ۥ۟(Ljava/lang/String;)LYue/ۥۢ۠۠۟;

    move-result-object v2

    goto :goto_1

    :cond_0
    invoke-static {}, LYue/ۥ۠ۤۧۧ;->ۥ۟۟۟ۥ()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    invoke-virtual {v0, v4, v5}, LYue/ۥ۠ۤۢۢ$ۥ;->ۥ۟۟۟ۡ(Ljava/lang/String;Ljava/lang/String;)LYue/ۥ۠ۤۢۢ$ۥ;

    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    if-eqz v2, :cond_3

    new-instance p1, LYue/ۥۡۦۧ$ۥ;

    invoke-direct {p1}, LYue/ۥۡۦۧ$ۥ;-><init>()V

    invoke-virtual {p1, p2}, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟ۡ۠(LYue/ۥۡۥۣۧ;)LYue/ۥۡۦۧ$ۥ;

    move-result-object p1

    iget p2, v2, LYue/ۥۢ۠۠۟;->ۥ۟:I

    invoke-virtual {p1, p2}, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟ۡ(I)LYue/ۥۡۦۧ$ۥ;

    move-result-object p1

    iget-object p2, v2, LYue/ۥۢ۠۠۟;->ۥ۟۟:Ljava/lang/String;

    invoke-virtual {p1, p2}, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۠ۨ(Ljava/lang/String;)LYue/ۥۡۦۧ$ۥ;

    move-result-object p1

    invoke-virtual {v0}, LYue/ۥ۠ۤۢۢ$ۥ;->ۥۣ۟۟۟()LYue/ۥ۠ۤۢۢ;

    move-result-object p2

    invoke-virtual {p1, p2}, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۠ۦ(LYue/ۥ۠ۤۢۢ;)LYue/ۥۡۦۧ$ۥ;

    move-result-object p1

    return-object p1

    :cond_3
    new-instance p1, Ljava/net/ProtocolException;

    const-string p2, "Expected \':status\' header not present"

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
