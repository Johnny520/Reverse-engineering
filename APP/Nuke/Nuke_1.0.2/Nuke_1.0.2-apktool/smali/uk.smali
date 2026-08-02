.class public final Luk;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Ln92;
.implements Lkh1;


# instance fields
.field public final synthetic h:I

.field public final i:Landroid/content/res/Resources;


# direct methods
.method public synthetic constructor <init>(Landroid/content/res/Resources;I)V
    .locals 0

    .line 1
    iput p2, p0, Luk;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Luk;->i:Landroid/content/res/Resources;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public i(Ld92;Lov1;)Ld92;
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
    new-instance p2, Lal;

    .line 6
    .line 7
    iget-object p0, p0, Luk;->i:Landroid/content/res/Resources;

    .line 8
    .line 9
    invoke-direct {p2, p0, p1}, Lal;-><init>(Landroid/content/res/Resources;Ld92;)V

    .line 10
    .line 11
    .line 12
    return-object p2
.end method

.method public q(Lkj1;)Ljh1;
    .locals 3

    .line 1
    iget v0, p0, Luk;->h:I

    .line 2
    .line 3
    const-class v1, Landroid/net/Uri;

    .line 4
    .line 5
    iget-object p0, p0, Luk;->i:Landroid/content/res/Resources;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, Ltg;

    .line 11
    .line 12
    sget-object v0, Lb83;->b:Lb83;

    .line 13
    .line 14
    invoke-direct {p1, p0, v0}, Ltg;-><init>(Landroid/content/res/Resources;Ljh1;)V

    .line 15
    .line 16
    .line 17
    return-object p1

    .line 18
    :pswitch_0
    new-instance v0, Ltg;

    .line 19
    .line 20
    const-class v2, Ljava/io/InputStream;

    .line 21
    .line 22
    invoke-virtual {p1, v1, v2}, Lkj1;->g(Ljava/lang/Class;Ljava/lang/Class;)Ljh1;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-direct {v0, p0, p1}, Ltg;-><init>(Landroid/content/res/Resources;Ljh1;)V

    .line 27
    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_1
    new-instance v0, Ltg;

    .line 31
    .line 32
    const-class v2, Landroid/content/res/AssetFileDescriptor;

    .line 33
    .line 34
    invoke-virtual {p1, v1, v2}, Lkj1;->g(Ljava/lang/Class;Ljava/lang/Class;)Ljh1;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-direct {v0, p0, p1}, Ltg;-><init>(Landroid/content/res/Resources;Ljh1;)V

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
