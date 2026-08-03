.class public final LJ5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lzw;
.implements Lbs;


# instance fields
.field public final synthetic a:I

.field public final b:Landroid/content/res/Resources;


# direct methods
.method public synthetic constructor <init>(Landroid/content/res/Resources;I)V
    .locals 0

    iput p2, p0, LJ5;->a:I

    iput-object p1, p0, LJ5;->b:Landroid/content/res/Resources;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public i(Lpw;Lvt;)Lpw;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance p2, LO5;

    iget-object v0, p0, LJ5;->b:Landroid/content/res/Resources;

    invoke-direct {p2, v0, p1}, LO5;-><init>(Landroid/content/res/Resources;Lpw;)V

    return-object p2
.end method

.method public p(Lqs;)Las;
    .locals 3

    iget v0, p0, LJ5;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance p1, LV4;

    iget-object v0, p0, LJ5;->b:Landroid/content/res/Resources;

    sget-object v1, LUC;->b:LUC;

    invoke-direct {p1, v0, v1}, LV4;-><init>(Landroid/content/res/Resources;Las;)V

    return-object p1

    :pswitch_0
    new-instance v0, LV4;

    const-class v1, Landroid/net/Uri;

    const-class v2, Ljava/io/InputStream;

    invoke-virtual {p1, v1, v2}, Lqs;->j(Ljava/lang/Class;Ljava/lang/Class;)Las;

    move-result-object p1

    iget-object v1, p0, LJ5;->b:Landroid/content/res/Resources;

    invoke-direct {v0, v1, p1}, LV4;-><init>(Landroid/content/res/Resources;Las;)V

    return-object v0

    :pswitch_1
    new-instance v0, LV4;

    const-class v1, Landroid/net/Uri;

    const-class v2, Landroid/content/res/AssetFileDescriptor;

    invoke-virtual {p1, v1, v2}, Lqs;->j(Ljava/lang/Class;Ljava/lang/Class;)Las;

    move-result-object p1

    iget-object v1, p0, LJ5;->b:Landroid/content/res/Resources;

    invoke-direct {v0, v1, p1}, LV4;-><init>(Landroid/content/res/Resources;Las;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
