.class public final Landroidx/emoji2/text/ۥ۟۟$ۥ۟;
.super Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x13
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/emoji2/text/ۥ۟۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df"
.end annotation


# instance fields
.field public volatile ۥ۟:Landroidx/emoji2/text/ۥ۟۟۟;

.field public volatile ۥ۟۟:Landroidx/emoji2/text/ۥ۟۟۟۠;


# direct methods
.method public constructor <init>(Landroidx/emoji2/text/ۥ۟۟;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟;-><init>(Landroidx/emoji2/text/ۥ۟۟;)V

    return-void
.end method


# virtual methods
.method public ۥ()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟$ۥ۟;->ۥ۟۟:Landroidx/emoji2/text/ۥ۟۟۟۠;

    invoke-virtual {v0}, Landroidx/emoji2/text/ۥ۟۟۟۠;->ۥ۟۟۟ۡ()LYue/ۥۡۡ۠ۦ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥۡۡ۠ۦ;->ۥ۟۟ۢۡ()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    return-object v0
.end method

.method public ۥ۟(Ljava/lang/CharSequence;I)I
    .locals 1
    .param p1    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟$ۥ۟;->ۥ۟:Landroidx/emoji2/text/ۥ۟۟۟;

    invoke-virtual {v0, p1, p2}, Landroidx/emoji2/text/ۥ۟۟۟;->ۥ۟(Ljava/lang/CharSequence;I)I

    move-result p1

    return p1
.end method

.method public ۥ۟۟(Ljava/lang/CharSequence;I)I
    .locals 1

    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟$ۥ۟;->ۥ۟:Landroidx/emoji2/text/ۥ۟۟۟;

    invoke-virtual {v0, p1, p2}, Landroidx/emoji2/text/ۥ۟۟۟;->ۥ۟۟۟(Ljava/lang/CharSequence;I)I

    move-result p1

    return p1
.end method

.method public ۥ۟۟۟(Ljava/lang/CharSequence;I)I
    .locals 1
    .param p1    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟$ۥ۟;->ۥ۟:Landroidx/emoji2/text/ۥ۟۟۟;

    invoke-virtual {v0, p1, p2}, Landroidx/emoji2/text/ۥ۟۟۟;->ۥ۟۟۟۟(Ljava/lang/CharSequence;I)I

    move-result p1

    return p1
.end method

.method public ۥ۟۟۟۟(Ljava/lang/CharSequence;)Z
    .locals 1
    .param p1    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟$ۥ۟;->ۥ۟:Landroidx/emoji2/text/ۥ۟۟۟;

    invoke-virtual {v0, p1}, Landroidx/emoji2/text/ۥ۟۟۟;->ۥ۟۟(Ljava/lang/CharSequence;)I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public ۥ۟۟۟۠(Ljava/lang/CharSequence;I)Z
    .locals 1
    .param p1    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟$ۥ۟;->ۥ۟:Landroidx/emoji2/text/ۥ۟۟۟;

    invoke-virtual {v0, p1, p2}, Landroidx/emoji2/text/ۥ۟۟۟;->ۥ۟۟۟(Ljava/lang/CharSequence;I)I

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    return p2
.end method

.method public ۥ۟۟۟ۡ()V
    .locals 2

    :try_start_0
    new-instance v0, Landroidx/emoji2/text/ۥ۟۟$ۥ۟$ۥ;

    invoke-direct {v0, p0}, Landroidx/emoji2/text/ۥ۟۟$ۥ۟$ۥ;-><init>(Landroidx/emoji2/text/ۥ۟۟$ۥ۟;)V

    iget-object v1, p0, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟;->ۥ:Landroidx/emoji2/text/ۥ۟۟;

    iget-object v1, v1, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟۟۠:Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۤ;

    invoke-interface {v1, v0}, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۤ;->ۥ(Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۥ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟;->ۥ:Landroidx/emoji2/text/ۥ۟۟;

    invoke-virtual {v1, v0}, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟۠ۥ(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public ۥ۟۟۟ۢ(Ljava/lang/CharSequence;IIIZ)Ljava/lang/CharSequence;
    .locals 6
    .param p1    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟$ۥ۟;->ۥ۟:Landroidx/emoji2/text/ۥ۟۟۟;

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Landroidx/emoji2/text/ۥ۟۟۟;->ۥ۟۟۟ۦ(Ljava/lang/CharSequence;IIIZ)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method

.method public ۥۣ۟۟۟(Landroid/view/inputmethod/EditorInfo;)V
    .locals 3
    .param p1    # Landroid/view/inputmethod/EditorInfo;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p1, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    iget-object v1, p0, Landroidx/emoji2/text/ۥ۟۟$ۥ۟;->ۥ۟۟:Landroidx/emoji2/text/ۥ۟۟۟۠;

    invoke-virtual {v1}, Landroidx/emoji2/text/ۥ۟۟۟۠;->ۥ۟۟۟ۢ()I

    move-result v1

    const-string v2, "android.support.text.emoji.emojiCompat_metadataVersion"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    iget-object p1, p1, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟;->ۥ:Landroidx/emoji2/text/ۥ۟۟;

    iget-boolean v0, v0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟۟ۢ:Z

    const-string v1, "android.support.text.emoji.emojiCompat_replaceAll"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    return-void
.end method

.method public ۥ۟۟۟ۤ(Landroidx/emoji2/text/ۥ۟۟۟۠;)V
    .locals 9
    .param p1    # Landroidx/emoji2/text/ۥ۟۟۟۠;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    if-nez p1, :cond_0

    iget-object p1, p0, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟;->ۥ:Landroidx/emoji2/text/ۥ۟۟;

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "metadataRepo cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟۠ۥ(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    iput-object p1, p0, Landroidx/emoji2/text/ۥ۟۟$ۥ۟;->ۥ۟۟:Landroidx/emoji2/text/ۥ۟۟۟۠;

    new-instance p1, Landroidx/emoji2/text/ۥ۟۟۟;

    iget-object v3, p0, Landroidx/emoji2/text/ۥ۟۟$ۥ۟;->ۥ۟۟:Landroidx/emoji2/text/ۥ۟۟۟۠;

    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟;->ۥ:Landroidx/emoji2/text/ۥ۟۟;

    invoke-static {v0}, Landroidx/emoji2/text/ۥ۟۟;->ۥ(Landroidx/emoji2/text/ۥ۟۟;)Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۧ;

    move-result-object v4

    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟;->ۥ:Landroidx/emoji2/text/ۥ۟۟;

    invoke-static {v0}, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟(Landroidx/emoji2/text/ۥ۟۟;)Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟۠;

    move-result-object v5

    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟;->ۥ:Landroidx/emoji2/text/ۥ۟۟;

    iget-boolean v6, v0, Landroidx/emoji2/text/ۥ۟۟;->ۥۣ۟۟۟:Z

    iget-object v7, v0, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟۟ۤ:[I

    invoke-static {}, LYue/ۥ۠۠ۦۢ;->ۥ()Ljava/util/Set;

    move-result-object v8

    move-object v2, p1

    invoke-direct/range {v2 .. v8}, Landroidx/emoji2/text/ۥ۟۟۟;-><init>(Landroidx/emoji2/text/ۥ۟۟۟۠;Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۧ;Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟۠;Z[ILjava/util/Set;)V

    iput-object p1, p0, Landroidx/emoji2/text/ۥ۟۟$ۥ۟;->ۥ۟:Landroidx/emoji2/text/ۥ۟۟۟;

    iget-object p1, p0, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟;->ۥ:Landroidx/emoji2/text/ۥ۟۟;

    invoke-virtual {p1}, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟۠ۦ()V

    return-void
.end method
