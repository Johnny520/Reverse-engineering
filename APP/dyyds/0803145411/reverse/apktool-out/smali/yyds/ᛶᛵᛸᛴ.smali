.class public final Lyyds/ᛶᛵᛸᛴ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛳᲇᛶᲀ;


# instance fields
.field public ᛲᛴᛳᛲ:Ljava/lang/Object;

.field public final ᲀᛲᛳᲀ:Ljava/lang/String;

.field public final synthetic ᲇᲇᲇᛱ:I

.field public final ᲇᲈᛵᛷ:Landroid/content/res/AssetManager;


# direct methods
.method public constructor <init>(Landroid/content/res/AssetManager;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, Lyyds/ᛶᛵᛸᛴ;->ᲇᲇᲇᛱ:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lyyds/ᛶᛵᛸᛴ;->ᲇᲈᛵᛷ:Landroid/content/res/AssetManager;

    .line 7
    .line 8
    iput-object p2, p0, Lyyds/ᛶᛵᛸᛴ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 0

    .line 1
    return-void
.end method

.method public final ᛲᲈᲁ()Ljava/lang/Class;
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᛶᛵᛸᛴ;->ᲇᲇᲇᛱ:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-class p0, Ljava/io/InputStream;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    const-class p0, Landroid/content/res/AssetFileDescriptor;

    .line 10
    .line 11
    return-object p0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final ᛵᛸᛸᛷ()V
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᛶᛵᛸᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    :try_start_0
    iget p0, p0, Lyyds/ᛶᛵᛸᛴ;->ᲇᲇᲇᛱ:I

    .line 7
    .line 8
    packed-switch p0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast v0, Ljava/io/InputStream;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :pswitch_0
    check-cast v0, Landroid/content/res/AssetFileDescriptor;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    .line 22
    :catch_0
    :goto_0
    return-void

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final ᲇᲇᲇᛱ()I
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final ᲇᲈᛵᛷ(Lyyds/ᛲᛲᲀᲈ;Lyyds/ᛲᛳᛴ;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object p1, p0, Lyyds/ᛶᛵᛸᛴ;->ᲇᲈᛵᛷ:Landroid/content/res/AssetManager;

    .line 2
    .line 3
    iget-object v0, p0, Lyyds/ᛶᛵᛸᛴ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 4
    .line 5
    iget v1, p0, Lyyds/ᛶᛵᛸᛴ;->ᲇᲇᲇᛱ:I

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, v0}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    goto :goto_0

    .line 15
    :pswitch_0
    invoke-virtual {p1, v0}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    :goto_0
    iput-object p1, p0, Lyyds/ᛶᛵᛸᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 20
    .line 21
    invoke-interface {p2, p1}, Lyyds/ᛲᛳᛴ;->ᛲᛴᛳᛲ(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :catch_0
    move-exception p0

    .line 26
    const/4 p1, 0x3

    .line 27
    const-string v0, "AssetPathFetcher"

    .line 28
    .line 29
    invoke-static {v0, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    const-string p1, "Failed to load data from asset manager"

    .line 36
    .line 37
    invoke-static {v0, p1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-interface {p2, p0}, Lyyds/ᛲᛳᛴ;->ᲀᛲᛳᲀ(Ljava/lang/Exception;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
