.class public abstract LYue/ۥ۠۟ۧۦ;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ۥ۟:Ljava/lang/String; = "DocumentFile"


# instance fields
.field public final ۥ:LYue/ۥ۠۟ۧۦ;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥ۠۟ۧۦ;)V
    .locals 0
    .param p1    # LYue/ۥ۠۟ۧۦ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۠۟ۧۦ;->ۥ:LYue/ۥ۠۟ۧۦ;

    return-void
.end method

.method public static ۥ۟۟۟ۢ(Ljava/io/File;)LYue/ۥ۠۟ۧۦ;
    .locals 2
    .param p0    # Ljava/io/File;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    new-instance v0, LYue/ۥۡۦ۟۟;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, LYue/ۥۡۦ۟۟;-><init>(LYue/ۥ۠۟ۧۦ;Ljava/io/File;)V

    return-object v0
.end method

.method public static ۥۣ۟۟۟(Landroid/content/Context;Landroid/net/Uri;)LYue/ۥ۠۟ۧۦ;
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Landroid/net/Uri;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    new-instance v0, LYue/ۥۢ۟ۡۢ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0, p1}, LYue/ۥۢ۟ۡۢ;-><init>(LYue/ۥ۠۟ۧۦ;Landroid/content/Context;Landroid/net/Uri;)V

    return-object v0
.end method

.method public static ۥ۟۟۟ۤ(Landroid/content/Context;Landroid/net/Uri;)LYue/ۥ۠۟ۧۦ;
    .locals 3
    .param p0    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Landroid/net/Uri;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    invoke-static {p1}, Landroid/provider/DocumentsContract;->getTreeDocumentId(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, p1}, Landroid/provider/DocumentsContract;->isDocumentUri(Landroid/content/Context;Landroid/net/Uri;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p1}, Landroid/provider/DocumentsContract;->getDocumentId(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v0

    :cond_0
    new-instance v1, LYue/ۥۢۢۡۨ;

    const/4 v2, 0x0

    invoke-static {p1, v0}, Landroid/provider/DocumentsContract;->buildDocumentUriUsingTree(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-direct {v1, v2, p0, p1}, LYue/ۥۢۢۡۨ;-><init>(LYue/ۥ۠۟ۧۦ;Landroid/content/Context;Landroid/net/Uri;)V

    return-object v1
.end method

.method public static ۥ۟۟۠۟(Landroid/content/Context;Landroid/net/Uri;)Z
    .locals 0
    .param p0    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Landroid/net/Uri;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    invoke-static {p0, p1}, Landroid/provider/DocumentsContract;->isDocumentUri(Landroid/content/Context;Landroid/net/Uri;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public abstract ۥ()Z
.end method

.method public abstract ۥ۟()Z
.end method

.method public abstract ۥ۟۟(Ljava/lang/String;)LYue/ۥ۠۟ۧۦ;
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end method

.method public abstract ۥ۟۟۟(Ljava/lang/String;Ljava/lang/String;)LYue/ۥ۠۟ۧۦ;
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end method

.method public abstract ۥ۟۟۟۟()Z
.end method

.method public abstract ۥ۟۟۟۠()Z
.end method

.method public ۥ۟۟۟ۡ(Ljava/lang/String;)LYue/ۥ۠۟ۧۦ;
    .locals 5
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۠۟ۧۦ;->ۥ۟۟۠ۤ()[LYue/ۥ۠۟ۧۦ;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, LYue/ۥ۠۟ۧۦ;->ۥ۟۟۟ۥ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public abstract ۥ۟۟۟ۥ()Ljava/lang/String;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end method

.method public ۥ۟۟۟ۦ()LYue/ۥ۠۟ۧۦ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠۟ۧۦ;->ۥ:LYue/ۥ۠۟ۧۦ;

    return-object v0
.end method

.method public abstract ۥ۟۟۟ۧ()Ljava/lang/String;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end method

.method public abstract ۥ۟۟۟ۨ()Landroid/net/Uri;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end method

.method public abstract ۥ۟۟۠()Z
.end method

.method public abstract ۥ۟۟۠۠()Z
.end method

.method public abstract ۥ۟۟۠ۡ()Z
.end method

.method public abstract ۥ۟۟۠ۢ()J
.end method

.method public abstract ۥۣ۟۟۠()J
.end method

.method public abstract ۥ۟۟۠ۤ()[LYue/ۥ۠۟ۧۦ;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end method

.method public abstract ۥ۟۟۠ۥ(Ljava/lang/String;)Z
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
.end method
