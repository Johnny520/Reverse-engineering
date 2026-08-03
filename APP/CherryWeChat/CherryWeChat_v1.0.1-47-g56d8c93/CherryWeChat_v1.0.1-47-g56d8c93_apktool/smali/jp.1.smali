.class public final Ljp;
.super LVk;
.source ""


# static fields
.field public static final b:Ljp;

.field public static final c:Ljp;

.field public static final d:Ljp;

.field public static final e:Ljp;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Ljp;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljp;-><init>(I)V

    sput-object v0, Ljp;->b:Ljp;

    new-instance v0, Ljp;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljp;-><init>(I)V

    sput-object v0, Ljp;->c:Ljp;

    new-instance v0, Ljp;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljp;-><init>(I)V

    sput-object v0, Ljp;->d:Ljp;

    new-instance v0, Ljp;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ljp;-><init>(I)V

    sput-object v0, Ljp;->e:Ljp;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Ljp;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(Landroid/view/ViewGroup;I)V
    .locals 10

    sget v0, LTB;->h:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget-object v1, LXA;->a:Ljava/util/HashMap;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-wide v3, -0x2bdb8fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    new-instance v4, LEt;

    invoke-direct {v4, v2, v3}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-wide v5, -0x2bc5cfffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    new-instance v5, LEt;

    invoke-direct {v5, v2, v3}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v2, 0x2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-wide v6, -0x2bc03fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    new-instance v6, LEt;

    invoke-direct {v6, v2, v3}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v2, 0x3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-wide v7, -0x2bc22fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    new-instance v7, LEt;

    invoke-direct {v7, v2, v3}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v2, 0x4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-wide v8, -0x2bcc2fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    new-instance v8, LEt;

    invoke-direct {v8, v2, v3}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v4, v5, v6, v7, v8}, [LEt;

    move-result-object v2

    invoke-static {v2}, Luq;->L([LEt;)Ljava/util/Map;

    move-result-object v2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_0

    sget v2, LTB;->f:I

    invoke-virtual {p0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    if-eqz p0, :cond_0

    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    const-wide p0, -0x2af0fffff835L

    invoke-static {p0, p1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lhw;->a(ILjava/lang/String;)I

    move-result p0

    if-eqz p0, :cond_1

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 10

    iget v0, p0, Ljp;->a:I

    const/4 v1, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x0

    const-wide v4, -0x20df5fffff835L

    packed-switch v0, :pswitch_data_0

    const-wide v0, -0x1d7dbfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    new-instance v1, LiG;

    sget v2, LgG;->a:I

    invoke-static {v0}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-direct {v1, v0}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v2, -0x1d7f8fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, LiG;->f(Ljava/lang/String;)V

    new-instance v0, LMx;

    const/16 v2, 0x14

    invoke-direct {v0, v2}, LMx;-><init>(I)V

    invoke-virtual {v1, v0}, LiG;->a(Lfj;)V

    return-void

    :pswitch_0
    const-wide v6, -0x53befffff835L

    :try_start_0
    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    new-instance v6, LiG;

    sget v7, LgG;->a:I

    invoke-static {v0}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-direct {v6, v0}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v7, -0x5272fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, LiG;->f(Ljava/lang/String;)V

    new-instance v0, LMx;

    invoke-direct {v0, v2}, LMx;-><init>(I)V

    invoke-virtual {v6, v0}, LiG;->a(Lfj;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    sget v0, LgG;->a:I

    const/16 v2, 0xba4

    if-lt v0, v2, :cond_0

    const-wide v6, -0x527bfffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    new-instance v2, LiG;

    invoke-static {v0}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-direct {v2, v0}, LiG;-><init>(Ljava/lang/Object;)V

    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v3, v0, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v0}, LiG;->g([Ljava/lang/Object;)V

    new-instance v0, LMx;

    invoke-direct {v0, v1}, LMx;-><init>(I)V

    invoke-virtual {v2, v0}, LiG;->a(Lfj;)V

    :cond_0
    return-void

    :pswitch_1
    sget-object v0, LcG;->a:Ljava/util/LinkedHashMap;

    const-wide v4, -0x215ecfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LbG;

    if-eqz v6, :cond_1

    iget-object v6, v6, LbG;->a:Ljava/lang/Object;

    goto :goto_0

    :cond_1
    move-object v6, v3

    :goto_0
    instance-of v7, v6, Ljava/lang/Class;

    if-eqz v7, :cond_2

    check-cast v6, Ljava/lang/Class;

    goto :goto_1

    :cond_2
    move-object v6, v3

    :goto_1
    new-instance v7, LiG;

    invoke-direct {v7, v6}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v8, -0x2adffffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v7, v6}, LiG;->f(Ljava/lang/String;)V

    new-instance v6, LTp;

    const/4 v8, 0x1

    invoke-direct {v6, v8}, LTp;-><init>(I)V

    invoke-virtual {v7, v6}, LiG;->a(Lfj;)V

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LbG;

    if-eqz v0, :cond_3

    iget-object v0, v0, LbG;->a:Ljava/lang/Object;

    goto :goto_2

    :cond_3
    move-object v0, v3

    :goto_2
    instance-of v4, v0, Ljava/lang/Class;

    if-eqz v4, :cond_4

    move-object v3, v0

    check-cast v3, Ljava/lang/Class;

    :cond_4
    new-instance v0, LiG;

    invoke-direct {v0, v3}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v3, -0x2ae8fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, LiG;->f(Ljava/lang/String;)V

    new-instance v3, LTp;

    invoke-direct {v3, v2}, LTp;-><init>(I)V

    new-instance v2, LTp;

    invoke-direct {v2, v1}, LTp;-><init>(I)V

    const-wide v4, -0x20c2afffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    const-wide v4, -0x20c31fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    iput-object v3, v0, LiG;->h:Lfj;

    iput-object v2, v0, LiG;->i:Lfj;

    invoke-virtual {v0}, LiG;->j()V

    return-void

    :pswitch_2
    const-wide v0, -0x2bd7fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    new-instance v1, LiG;

    sget v2, LgG;->a:I

    invoke-static {v0}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-direct {v1, v0}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v2, -0x2bf4fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, LiG;->f(Ljava/lang/String;)V

    new-instance v0, LOb;

    const/16 v2, 0x19

    invoke-direct {v0, v2}, LOb;-><init>(I)V

    invoke-virtual {v1, v0}, LiG;->a(Lfj;)V

    const-wide v0, -0x2bfdfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    new-instance v1, LiG;

    invoke-static {v0}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-direct {v1, v0}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v2, -0x2b9afffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, LiG;->f(Ljava/lang/String;)V

    new-instance v0, LOb;

    const/16 v2, 0x1a

    invoke-direct {v0, v2}, LOb;-><init>(I)V

    invoke-virtual {v1, v0}, LiG;->a(Lfj;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b()Ljava/lang/String;
    .locals 2

    iget v0, p0, Ljp;->a:I

    packed-switch v0, :pswitch_data_0

    const-wide v0, -0x1d7cffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    const-wide v0, -0x53aefffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_1
    const-wide v0, -0x2ad1fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_2
    const-wide v0, -0x2bcdfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
