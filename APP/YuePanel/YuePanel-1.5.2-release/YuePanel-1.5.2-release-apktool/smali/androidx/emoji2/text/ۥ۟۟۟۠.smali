.class public final Landroidx/emoji2/text/ۥ۟۟۟۠;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥ۟۠ۧۦ;
.end annotation

.annotation build LYue/ۥۡۦۥۣ;
    value = 0x13
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/emoji2/text/ۥ۟۟۟۠$ۥ;
    }
.end annotation


# static fields
.field public static final ۥ۟۟۟۟:I = 0x400

.field public static final ۥ۟۟۟۠:Ljava/lang/String; = "EmojiCompat.MetadataRepo.create"


# instance fields
.field public final ۥ:LYue/ۥۡۡ۠ۦ;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field

.field public final ۥ۟:[C
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field

.field public final ۥ۟۟:Landroidx/emoji2/text/ۥ۟۟۟۠$ۥ;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field

.field public final ۥ۟۟۟:Landroid/graphics/Typeface;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/graphics/Typeface;LYue/ۥۡۡ۠ۦ;)V
    .locals 1
    .param p1    # Landroid/graphics/Typeface;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # LYue/ۥۡۡ۠ۦ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/emoji2/text/ۥ۟۟۟۠;->ۥ۟۟۟:Landroid/graphics/Typeface;

    iput-object p2, p0, Landroidx/emoji2/text/ۥ۟۟۟۠;->ۥ:LYue/ۥۡۡ۠ۦ;

    new-instance p1, Landroidx/emoji2/text/ۥ۟۟۟۠$ۥ;

    const/16 v0, 0x400

    invoke-direct {p1, v0}, Landroidx/emoji2/text/ۥ۟۟۟۠$ۥ;-><init>(I)V

    iput-object p1, p0, Landroidx/emoji2/text/ۥ۟۟۟۠;->ۥ۟۟:Landroidx/emoji2/text/ۥ۟۟۟۠$ۥ;

    invoke-virtual {p2}, LYue/ۥۡۡ۠ۦ;->ۥ۟۟ۢ()I

    move-result p1

    mul-int/lit8 p1, p1, 0x2

    new-array p1, p1, [C

    iput-object p1, p0, Landroidx/emoji2/text/ۥ۟۟۟۠;->ۥ۟:[C

    invoke-virtual {p0, p2}, Landroidx/emoji2/text/ۥ۟۟۟۠;->ۥ(LYue/ۥۡۡ۠ۦ;)V

    return-void
.end method

.method public static ۥ۟(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroidx/emoji2/text/ۥ۟۟۟۠;
    .locals 2
    .param p0    # Landroid/content/res/AssetManager;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    :try_start_0
    const-string v0, "EmojiCompat.MetadataRepo.create"

    invoke-static {v0}, LYue/ۥۢۢ۟ۡ;->ۥ۟(Ljava/lang/String;)V

    invoke-static {p0, p1}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v0

    new-instance v1, Landroidx/emoji2/text/ۥ۟۟۟۠;

    invoke-static {p0, p1}, LYue/ۥۡۡ۠ۧ;->ۥ۟(Landroid/content/res/AssetManager;Ljava/lang/String;)LYue/ۥۡۡ۠ۦ;

    move-result-object p0

    invoke-direct {v1, v0, p0}, Landroidx/emoji2/text/ۥ۟۟۟۠;-><init>(Landroid/graphics/Typeface;LYue/ۥۡۡ۠ۦ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, LYue/ۥۢۢ۟ۡ;->ۥ۟۟۟()V

    return-object v1

    :catchall_0
    move-exception p0

    invoke-static {}, LYue/ۥۢۢ۟ۡ;->ۥ۟۟۟()V

    throw p0
.end method

.method public static ۥ۟۟(Landroid/graphics/Typeface;)Landroidx/emoji2/text/ۥ۟۟۟۠;
    .locals 2
    .param p0    # Landroid/graphics/Typeface;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۧ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    :try_start_0
    const-string v0, "EmojiCompat.MetadataRepo.create"

    invoke-static {v0}, LYue/ۥۢۢ۟ۡ;->ۥ۟(Ljava/lang/String;)V

    new-instance v0, Landroidx/emoji2/text/ۥ۟۟۟۠;

    new-instance v1, LYue/ۥۡۡ۠ۦ;

    invoke-direct {v1}, LYue/ۥۡۡ۠ۦ;-><init>()V

    invoke-direct {v0, p0, v1}, Landroidx/emoji2/text/ۥ۟۟۟۠;-><init>(Landroid/graphics/Typeface;LYue/ۥۡۡ۠ۦ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, LYue/ۥۢۢ۟ۡ;->ۥ۟۟۟()V

    return-object v0

    :catchall_0
    move-exception p0

    invoke-static {}, LYue/ۥۢۢ۟ۡ;->ۥ۟۟۟()V

    throw p0
.end method

.method public static ۥ۟۟۟(Landroid/graphics/Typeface;Ljava/io/InputStream;)Landroidx/emoji2/text/ۥ۟۟۟۠;
    .locals 1
    .param p0    # Landroid/graphics/Typeface;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Ljava/io/InputStream;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    :try_start_0
    const-string v0, "EmojiCompat.MetadataRepo.create"

    invoke-static {v0}, LYue/ۥۢۢ۟ۡ;->ۥ۟(Ljava/lang/String;)V

    new-instance v0, Landroidx/emoji2/text/ۥ۟۟۟۠;

    invoke-static {p1}, LYue/ۥۡۡ۠ۧ;->ۥ۟۟(Ljava/io/InputStream;)LYue/ۥۡۡ۠ۦ;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Landroidx/emoji2/text/ۥ۟۟۟۠;-><init>(Landroid/graphics/Typeface;LYue/ۥۡۡ۠ۦ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, LYue/ۥۢۢ۟ۡ;->ۥ۟۟۟()V

    return-object v0

    :catchall_0
    move-exception p0

    invoke-static {}, LYue/ۥۢۢ۟ۡ;->ۥ۟۟۟()V

    throw p0
.end method

.method public static ۥ۟۟۟۟(Landroid/graphics/Typeface;Ljava/nio/ByteBuffer;)Landroidx/emoji2/text/ۥ۟۟۟۠;
    .locals 1
    .param p0    # Landroid/graphics/Typeface;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Ljava/nio/ByteBuffer;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    :try_start_0
    const-string v0, "EmojiCompat.MetadataRepo.create"

    invoke-static {v0}, LYue/ۥۢۢ۟ۡ;->ۥ۟(Ljava/lang/String;)V

    new-instance v0, Landroidx/emoji2/text/ۥ۟۟۟۠;

    invoke-static {p1}, LYue/ۥۡۡ۠ۧ;->ۥ۟۟۟(Ljava/nio/ByteBuffer;)LYue/ۥۡۡ۠ۦ;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Landroidx/emoji2/text/ۥ۟۟۟۠;-><init>(Landroid/graphics/Typeface;LYue/ۥۡۡ۠ۦ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, LYue/ۥۢۢ۟ۡ;->ۥ۟۟۟()V

    return-object v0

    :catchall_0
    move-exception p0

    invoke-static {}, LYue/ۥۢۢ۟ۡ;->ۥ۟۟۟()V

    throw p0
.end method


# virtual methods
.method public final ۥ(LYue/ۥۡۡ۠ۦ;)V
    .locals 5

    invoke-virtual {p1}, LYue/ۥۡۡ۠ۦ;->ۥ۟۟ۢ()I

    move-result p1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_0

    new-instance v1, LYue/ۥۢۢۤۥ;

    invoke-direct {v1, p0, v0}, LYue/ۥۢۢۤۥ;-><init>(Landroidx/emoji2/text/ۥ۟۟۟۠;I)V

    invoke-virtual {v1}, LYue/ۥۢۢۤۥ;->ۥ۟۟۟ۡ()I

    move-result v2

    iget-object v3, p0, Landroidx/emoji2/text/ۥ۟۟۟۠;->ۥ۟:[C

    mul-int/lit8 v4, v0, 0x2

    invoke-static {v2, v3, v4}, Ljava/lang/Character;->toChars(I[CI)I

    invoke-virtual {p0, v1}, Landroidx/emoji2/text/ۥ۟۟۟۠;->ۥ۟۟۟ۥ(LYue/ۥۢۢۤۥ;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public ۥ۟۟۟۠()[C
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟۟۠;->ۥ۟:[C

    return-object v0
.end method

.method public ۥ۟۟۟ۡ()LYue/ۥۡۡ۠ۦ;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟۟۠;->ۥ:LYue/ۥۡۡ۠ۦ;

    return-object v0
.end method

.method public ۥ۟۟۟ۢ()I
    .locals 1
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟۟۠;->ۥ:LYue/ۥۡۡ۠ۦ;

    invoke-virtual {v0}, LYue/ۥۡۡ۠ۦ;->ۥ۟۟ۢۦ()I

    move-result v0

    return v0
.end method

.method public ۥۣ۟۟۟()Landroidx/emoji2/text/ۥ۟۟۟۠$ۥ;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟۟۠;->ۥ۟۟:Landroidx/emoji2/text/ۥ۟۟۟۠$ۥ;

    return-object v0
.end method

.method public ۥ۟۟۟ۤ()Landroid/graphics/Typeface;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟۟۠;->ۥ۟۟۟:Landroid/graphics/Typeface;

    return-object v0
.end method

.method public ۥ۟۟۟ۥ(LYue/ۥۢۢۤۥ;)V
    .locals 4
    .param p1    # LYue/ۥۢۢۤۥ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    .annotation build LYue/ۥۢۥ۟ۥ;
    .end annotation

    const-string v0, "emoji metadata cannot be null"

    invoke-static {p1, v0}, LYue/ۥۡۤۧ;->ۥ۟۟۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, LYue/ۥۢۢۤۥ;->ۥ۟۟()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-lez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    const-string v3, "invalid metadata codepoint length"

    invoke-static {v0, v3}, LYue/ۥۡۤۧ;->ۥ۟(ZLjava/lang/Object;)V

    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟۟۠;->ۥ۟۟:Landroidx/emoji2/text/ۥ۟۟۟۠$ۥ;

    invoke-virtual {p1}, LYue/ۥۢۢۤۥ;->ۥ۟۟()I

    move-result v3

    sub-int/2addr v3, v2

    invoke-virtual {v0, p1, v1, v3}, Landroidx/emoji2/text/ۥ۟۟۟۠$ۥ;->ۥ۟۟(LYue/ۥۢۢۤۥ;II)V

    return-void
.end method
