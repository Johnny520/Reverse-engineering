.class public LYue/ۥۢ۟ۡۢ;
.super LYue/ۥ۠۟ۧۦ;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x13
.end annotation


# instance fields
.field public ۥ۟۟:Landroid/content/Context;

.field public ۥ۟۟۟:Landroid/net/Uri;


# direct methods
.method public constructor <init>(LYue/ۥ۠۟ۧۦ;Landroid/content/Context;Landroid/net/Uri;)V
    .locals 0
    .param p1    # LYue/ۥ۠۟ۧۦ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    invoke-direct {p0, p1}, LYue/ۥ۠۟ۧۦ;-><init>(LYue/ۥ۠۟ۧۦ;)V

    iput-object p2, p0, LYue/ۥۢ۟ۡۢ;->ۥ۟۟:Landroid/content/Context;

    iput-object p3, p0, LYue/ۥۢ۟ۡۢ;->ۥ۟۟۟:Landroid/net/Uri;

    return-void
.end method


# virtual methods
.method public ۥ()Z
    .locals 2

    iget-object v0, p0, LYue/ۥۢ۟ۡۢ;->ۥ۟۟:Landroid/content/Context;

    iget-object v1, p0, LYue/ۥۢ۟ۡۢ;->ۥ۟۟۟:Landroid/net/Uri;

    invoke-static {v0, v1}, LYue/ۥ۠۟ۧۨ;->ۥ(Landroid/content/Context;Landroid/net/Uri;)Z

    move-result v0

    return v0
.end method

.method public ۥ۟()Z
    .locals 2

    iget-object v0, p0, LYue/ۥۢ۟ۡۢ;->ۥ۟۟:Landroid/content/Context;

    iget-object v1, p0, LYue/ۥۢ۟ۡۢ;->ۥ۟۟۟:Landroid/net/Uri;

    invoke-static {v0, v1}, LYue/ۥ۠۟ۧۨ;->ۥ۟(Landroid/content/Context;Landroid/net/Uri;)Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟(Ljava/lang/String;)LYue/ۥ۠۟ۧۦ;
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public ۥ۟۟۟(Ljava/lang/String;Ljava/lang/String;)LYue/ۥ۠۟ۧۦ;
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public ۥ۟۟۟۟()Z
    .locals 2

    :try_start_0
    iget-object v0, p0, LYue/ۥۢ۟ۡۢ;->ۥ۟۟:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, LYue/ۥۢ۟ۡۢ;->ۥ۟۟۟:Landroid/net/Uri;

    invoke-static {v0, v1}, Landroid/provider/DocumentsContract;->deleteDocument(Landroid/content/ContentResolver;Landroid/net/Uri;)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    const/4 v0, 0x0

    return v0
.end method

.method public ۥ۟۟۟۠()Z
    .locals 2

    iget-object v0, p0, LYue/ۥۢ۟ۡۢ;->ۥ۟۟:Landroid/content/Context;

    iget-object v1, p0, LYue/ۥۢ۟ۡۢ;->ۥ۟۟۟:Landroid/net/Uri;

    invoke-static {v0, v1}, LYue/ۥ۠۟ۧۨ;->ۥ۟۟۟(Landroid/content/Context;Landroid/net/Uri;)Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟ۥ()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۢ۟ۡۢ;->ۥ۟۟:Landroid/content/Context;

    iget-object v1, p0, LYue/ۥۢ۟ۡۢ;->ۥ۟۟۟:Landroid/net/Uri;

    invoke-static {v0, v1}, LYue/ۥ۠۟ۧۨ;->ۥ۟۟۟۠(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟ۧ()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۢ۟ۡۢ;->ۥ۟۟:Landroid/content/Context;

    iget-object v1, p0, LYue/ۥۢ۟ۡۢ;->ۥ۟۟۟:Landroid/net/Uri;

    invoke-static {v0, v1}, LYue/ۥ۠۟ۧۨ;->ۥ۟۟۟ۢ(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟ۨ()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, LYue/ۥۢ۟ۡۢ;->ۥ۟۟۟:Landroid/net/Uri;

    return-object v0
.end method

.method public ۥ۟۟۠()Z
    .locals 2

    iget-object v0, p0, LYue/ۥۢ۟ۡۢ;->ۥ۟۟:Landroid/content/Context;

    iget-object v1, p0, LYue/ۥۢ۟ۡۢ;->ۥ۟۟۟:Landroid/net/Uri;

    invoke-static {v0, v1}, LYue/ۥ۠۟ۧۨ;->ۥۣ۟۟۟(Landroid/content/Context;Landroid/net/Uri;)Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟۠۠()Z
    .locals 2

    iget-object v0, p0, LYue/ۥۢ۟ۡۢ;->ۥ۟۟:Landroid/content/Context;

    iget-object v1, p0, LYue/ۥۢ۟ۡۢ;->ۥ۟۟۟:Landroid/net/Uri;

    invoke-static {v0, v1}, LYue/ۥ۠۟ۧۨ;->ۥ۟۟۟ۤ(Landroid/content/Context;Landroid/net/Uri;)Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟۠ۡ()Z
    .locals 2

    iget-object v0, p0, LYue/ۥۢ۟ۡۢ;->ۥ۟۟:Landroid/content/Context;

    iget-object v1, p0, LYue/ۥۢ۟ۡۢ;->ۥ۟۟۟:Landroid/net/Uri;

    invoke-static {v0, v1}, LYue/ۥ۠۟ۧۨ;->ۥ۟۟۟ۥ(Landroid/content/Context;Landroid/net/Uri;)Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟۠ۢ()J
    .locals 2

    iget-object v0, p0, LYue/ۥۢ۟ۡۢ;->ۥ۟۟:Landroid/content/Context;

    iget-object v1, p0, LYue/ۥۢ۟ۡۢ;->ۥ۟۟۟:Landroid/net/Uri;

    invoke-static {v0, v1}, LYue/ۥ۠۟ۧۨ;->ۥ۟۟۟ۦ(Landroid/content/Context;Landroid/net/Uri;)J

    move-result-wide v0

    return-wide v0
.end method

.method public ۥۣ۟۟۠()J
    .locals 2

    iget-object v0, p0, LYue/ۥۢ۟ۡۢ;->ۥ۟۟:Landroid/content/Context;

    iget-object v1, p0, LYue/ۥۢ۟ۡۢ;->ۥ۟۟۟:Landroid/net/Uri;

    invoke-static {v0, v1}, LYue/ۥ۠۟ۧۨ;->ۥ۟۟۟ۧ(Landroid/content/Context;Landroid/net/Uri;)J

    move-result-wide v0

    return-wide v0
.end method

.method public ۥ۟۟۠ۤ()[LYue/ۥ۠۟ۧۦ;
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public ۥ۟۟۠ۥ(Ljava/lang/String;)Z
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method
