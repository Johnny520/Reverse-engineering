.class public final Lyyds/ᛲᛸᛶᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲁᛱᛸᛵ;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I

.field public final ᲇᲈᛵᛷ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 15
    iput p1, p0, Lyyds/ᛲᛸᛶᛵ;->ᲀᛲᛳᲀ:I

    iput-object p2, p0, Lyyds/ᛲᛸᛶᛵ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lyyds/ᛲᛸᛶᛵ;->ᲀᛲᛳᲀ:I

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    const-string v0, "Argument must not be null"

    invoke-static {p1, v0}, Lyyds/ᛲᛳᲁ;->ᲇᲈᛵᛷ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    iput-object p1, p0, Lyyds/ᛲᛸᛶᛵ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>([B)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lyyds/ᛲᛸᛶᛵ;->ᲀᛲᛳᲀ:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    const-string v0, "Argument must not be null"

    .line 8
    .line 9
    invoke-static {p1, v0}, Lyyds/ᛲᛳᲁ;->ᲇᲈᛵᛷ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lyyds/ᛲᛸᛶᛵ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 13
    .line 14
    return-void
.end method

.method private final ᛲᲈᲁ()V
    .locals 0

    .line 1
    return-void
.end method

.method private final ᲀᛲᛳᲀ()V
    .locals 0

    .line 1
    return-void
.end method

.method private final ᲇᲇᲇᛱ()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᛲᛸᛶᛵ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᛲᛸᛶᛵ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Landroid/graphics/Bitmap;

    .line 9
    .line 10
    :pswitch_0
    return-object p0

    .line 11
    :pswitch_1
    check-cast p0, [B

    .line 12
    .line 13
    return-object p0

    .line 14
    :pswitch_2
    check-cast p0, Landroid/graphics/drawable/AnimatedImageDrawable;

    .line 15
    .line 16
    return-object p0

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ᛲᛴᛳᛲ()V
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᛲᛸᛶᛵ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    return-void

    .line 7
    :pswitch_1
    iget-object p0, p0, Lyyds/ᛲᛸᛶᛵ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Landroid/graphics/drawable/AnimatedImageDrawable;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/graphics/drawable/AnimatedImageDrawable;->stop()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/graphics/drawable/AnimatedImageDrawable;->clearAnimationCallbacks()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final ᛵᛸᛸᛷ()I
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᛲᛸᛶᛵ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᛲᛸᛶᛵ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Landroid/graphics/Bitmap;

    .line 9
    .line 10
    invoke-static {p0}, Lyyds/ᛱᛷᲈᛲ;->ᲇᲇᲇᛱ(Landroid/graphics/Bitmap;)I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0

    .line 15
    :pswitch_0
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :pswitch_1
    check-cast p0, [B

    .line 18
    .line 19
    array-length p0, p0

    .line 20
    return p0

    .line 21
    :pswitch_2
    check-cast p0, Landroid/graphics/drawable/AnimatedImageDrawable;

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/graphics/drawable/AnimatedImageDrawable;->getIntrinsicWidth()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-virtual {p0}, Landroid/graphics/drawable/AnimatedImageDrawable;->getIntrinsicHeight()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    mul-int/2addr p0, v0

    .line 32
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 33
    .line 34
    invoke-static {v0}, Lyyds/ᛱᛷᲈᛲ;->ᛶᛷᛲᲁ(Landroid/graphics/Bitmap$Config;)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    mul-int/2addr v0, p0

    .line 39
    mul-int/lit8 v0, v0, 0x2

    .line 40
    .line 41
    return v0

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ᲇᲈᛵᛷ()Ljava/lang/Class;
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᛲᛸᛶᛵ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-class p0, Landroid/graphics/Bitmap;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    iget-object p0, p0, Lyyds/ᛲᛸᛶᛵ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :pswitch_1
    const-class p0, [B

    .line 17
    .line 18
    return-object p0

    .line 19
    :pswitch_2
    const-class p0, Landroid/graphics/drawable/Drawable;

    .line 20
    .line 21
    return-object p0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
