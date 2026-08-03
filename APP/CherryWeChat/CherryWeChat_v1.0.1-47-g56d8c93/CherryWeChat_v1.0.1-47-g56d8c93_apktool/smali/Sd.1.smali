.class public final LSd;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lbs;
.implements Lof;
.implements LXj;


# instance fields
.field public final synthetic a:I

.field public final b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, LSd;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, LSd;->b:Landroid/content/Context;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 1
    iput p2, p0, LSd;->a:I

    iput-object p1, p0, LSd;->b:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcr;)V
    .locals 8

    new-instance v7, LXa;

    const-string v0, "EmojiCompatInitializer"

    invoke-direct {v7, v0}, LXa;-><init>(Ljava/lang/String;)V

    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v6, Ljava/util/concurrent/LinkedBlockingDeque;

    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingDeque;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x1

    const-wide/16 v3, 0xf

    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    new-instance v1, Lr8;

    const/4 v2, 0x3

    invoke-direct {v1, p0, p1, v0, v2}, Lr8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public get()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LSd;->b:Landroid/content/Context;

    const-string v1, "connectivity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    return-object v0
.end method

.method public p(Lqs;)Las;
    .locals 3

    iget v0, p0, LSd;->a:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    new-instance v0, LV4;

    const-class v1, Ljava/lang/Integer;

    const-class v2, Ljava/io/InputStream;

    invoke-virtual {p1, v1, v2}, Lqs;->j(Ljava/lang/Class;Ljava/lang/Class;)Las;

    move-result-object p1

    iget-object v1, p0, LSd;->b:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, LV4;-><init>(Landroid/content/Context;Las;)V

    return-object v0

    :pswitch_1
    new-instance v0, LV4;

    const-class v1, Ljava/lang/Integer;

    const-class v2, Landroid/content/res/AssetFileDescriptor;

    invoke-virtual {p1, v1, v2}, Lqs;->j(Ljava/lang/Class;Ljava/lang/Class;)Las;

    move-result-object p1

    iget-object v1, p0, LSd;->b:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, LV4;-><init>(Landroid/content/Context;Las;)V

    return-object v0

    :pswitch_2
    new-instance p1, Ler;

    iget-object v0, p0, LSd;->b:Landroid/content/Context;

    const/4 v1, 0x2

    invoke-direct {p1, v0, v1}, Ler;-><init>(Landroid/content/Context;I)V

    return-object p1

    :pswitch_3
    new-instance p1, Ler;

    iget-object v0, p0, LSd;->b:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-direct {p1, v0, v1}, Ler;-><init>(Landroid/content/Context;I)V

    return-object p1

    :pswitch_4
    new-instance p1, Ler;

    iget-object v0, p0, LSd;->b:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Ler;-><init>(Landroid/content/Context;I)V

    return-object p1

    :pswitch_5
    new-instance p1, LV4;

    iget-object v0, p0, LSd;->b:Landroid/content/Context;

    invoke-direct {p1, v0, p0}, LV4;-><init>(Landroid/content/Context;LSd;)V

    return-object p1

    :pswitch_6
    new-instance p1, LV4;

    iget-object v0, p0, LSd;->b:Landroid/content/Context;

    invoke-direct {p1, v0, p0}, LV4;-><init>(Landroid/content/Context;LSd;)V

    return-object p1

    :pswitch_7
    new-instance p1, LV4;

    iget-object v0, p0, LSd;->b:Landroid/content/Context;

    invoke-direct {p1, v0, p0}, LV4;-><init>(Landroid/content/Context;LSd;)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_0
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
