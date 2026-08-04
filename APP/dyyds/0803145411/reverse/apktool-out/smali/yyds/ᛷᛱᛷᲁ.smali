.class public final Lyyds/ᛷᛱᛷᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛸᛷᲀᛵ;
.implements Lyyds/ᲈᲁᛸᲀ;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I

.field public final ᲇᲈᛵᛷ:Landroid/content/res/Resources;


# direct methods
.method public synthetic constructor <init>(Landroid/content/res/Resources;I)V
    .locals 0

    .line 1
    iput p2, p0, Lyyds/ᛷᛱᛷᲁ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᛷᛱᛷᲁ;->ᲇᲈᛵᛷ:Landroid/content/res/Resources;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public ᛲᛲᲈᲈ(Lyyds/ᛳᛷᲀᛴ;)Lyyds/ᛴᛷᛷ;
    .locals 3

    .line 1
    iget v0, p0, Lyyds/ᛷᛱᛷᲁ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    const-class v1, Landroid/net/Uri;

    .line 4
    .line 5
    iget-object p0, p0, Lyyds/ᛷᛱᛷᲁ;->ᲇᲈᛵᛷ:Landroid/content/res/Resources;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, Lyyds/ᲇᛷᛵᛸ;

    .line 11
    .line 12
    sget-object v0, Lyyds/ᛸᛳᛶ;->ᛵᛸᛸᛷ:Lyyds/ᛸᛳᛶ;

    .line 13
    .line 14
    invoke-direct {p1, p0, v0}, Lyyds/ᲇᛷᛵᛸ;-><init>(Landroid/content/res/Resources;Lyyds/ᛴᛷᛷ;)V

    .line 15
    .line 16
    .line 17
    return-object p1

    .line 18
    :pswitch_0
    new-instance v0, Lyyds/ᲇᛷᛵᛸ;

    .line 19
    .line 20
    const-class v2, Ljava/io/InputStream;

    .line 21
    .line 22
    invoke-virtual {p1, v1, v2}, Lyyds/ᛳᛷᲀᛴ;->ᛷᛲᲈᛱ(Ljava/lang/Class;Ljava/lang/Class;)Lyyds/ᛴᛷᛷ;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-direct {v0, p0, p1}, Lyyds/ᲇᛷᛵᛸ;-><init>(Landroid/content/res/Resources;Lyyds/ᛴᛷᛷ;)V

    .line 27
    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_1
    new-instance v0, Lyyds/ᲇᛷᛵᛸ;

    .line 31
    .line 32
    const-class v2, Landroid/content/res/AssetFileDescriptor;

    .line 33
    .line 34
    invoke-virtual {p1, v1, v2}, Lyyds/ᛳᛷᲀᛴ;->ᛷᛲᲈᛱ(Ljava/lang/Class;Ljava/lang/Class;)Lyyds/ᛴᛷᛷ;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-direct {v0, p0, p1}, Lyyds/ᲇᛷᛵᛸ;-><init>(Landroid/content/res/Resources;Lyyds/ᛴᛷᛷ;)V

    .line 39
    .line 40
    .line 41
    return-object v0

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public ᲇᲇᲇᛱ(Lyyds/ᲁᛱᛸᛵ;Lyyds/ᛴᛳᲀᲈ;)Lyyds/ᲁᛱᛸᛵ;
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    new-instance p2, Lyyds/ᛳᛸᛵᲈ;

    .line 6
    .line 7
    iget-object p0, p0, Lyyds/ᛷᛱᛷᲁ;->ᲇᲈᛵᛷ:Landroid/content/res/Resources;

    .line 8
    .line 9
    invoke-direct {p2, p0, p1}, Lyyds/ᛳᛸᛵᲈ;-><init>(Landroid/content/res/Resources;Lyyds/ᲁᛱᛸᛵ;)V

    .line 10
    .line 11
    .line 12
    return-object p2
.end method
