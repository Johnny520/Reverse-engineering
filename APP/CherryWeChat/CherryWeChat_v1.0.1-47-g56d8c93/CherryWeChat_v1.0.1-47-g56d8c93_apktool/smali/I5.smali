.class public final LI5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lsw;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LI5;->a:I

    iput-object p2, p0, LI5;->b:Ljava/lang/Object;

    iput-object p3, p0, LI5;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/res/Resources;Lsw;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LI5;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LI5;->c:Ljava/lang/Object;

    .line 4
    iput-object p2, p0, LI5;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;IILvt;)Lpw;
    .locals 11

    iget v0, p0, LI5;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/io/InputStream;

    instance-of v0, p1, Ldv;

    if-eqz v0, :cond_0

    check-cast p1, Ldv;

    const/4 v0, 0x0

    move v1, v0

    goto :goto_0

    :cond_0
    new-instance v0, Ldv;

    iget-object v1, p0, LI5;->c:Ljava/lang/Object;

    check-cast v1, Lzp;

    invoke-direct {v0, p1, v1}, Ldv;-><init>(Ljava/io/InputStream;Lzp;)V

    const/4 p1, 0x1

    move v1, p1

    move-object p1, v0

    :goto_0
    sget-object v2, Lvg;->c:Ljava/util/ArrayDeque;

    monitor-enter v2

    :try_start_0
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvg;

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    if-nez v0, :cond_1

    new-instance v0, Lvg;

    invoke-direct {v0}, Ljava/io/InputStream;-><init>()V

    :cond_1
    move-object v3, v0

    iput-object p1, v3, Lvg;->a:Ldv;

    new-instance v0, Lvq;

    invoke-direct {v0, v3}, Lvq;-><init>(Lvg;)V

    new-instance v9, LGy;

    const/4 v4, 0x2

    invoke-direct {v9, v4, p1, v3}, LGy;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 v10, 0x0

    :try_start_1
    iget-object v4, p0, LI5;->b:Ljava/lang/Object;

    check-cast v4, Lte;

    new-instance v5, Lw4;

    iget-object v6, v4, Lte;->d:Ljava/util/ArrayList;

    iget-object v7, v4, Lte;->c:Lzp;

    invoke-direct {v5, v0, v6, v7}, Lw4;-><init>(Lvq;Ljava/util/ArrayList;Lzp;)V

    move v6, p2

    move v7, p3

    move-object v8, p4

    invoke-virtual/range {v4 .. v9}, Lte;->a(Lw4;IILvt;Lse;)LO5;

    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    iput-object v10, v3, Lvg;->b:Ljava/io/IOException;

    iput-object v10, v3, Lvg;->a:Ldv;

    monitor-enter v2

    :try_start_2
    invoke-virtual {v2, v3}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Ldv;->f()V

    :cond_2
    return-object p2

    :catchall_0
    move-exception v0

    move-object p1, v0

    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1

    :catchall_1
    move-exception v0

    move-object p2, v0

    iput-object v10, v3, Lvg;->b:Ljava/io/IOException;

    iput-object v10, v3, Lvg;->a:Ldv;

    sget-object p3, Lvg;->c:Ljava/util/ArrayDeque;

    monitor-enter p3

    :try_start_4
    invoke-virtual {p3, v3}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    monitor-exit p3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    if-eqz v1, :cond_3

    invoke-virtual {p1}, Ldv;->f()V

    :cond_3
    throw p2

    :catchall_2
    move-exception v0

    move-object p1, v0

    :try_start_5
    monitor-exit p3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    throw p1

    :catchall_3
    move-exception v0

    move-object p1, v0

    :try_start_6
    monitor-exit v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    throw p1

    :pswitch_0
    move v6, p2

    move v7, p3

    move-object v8, p4

    check-cast p1, Landroid/net/Uri;

    iget-object p2, p0, LI5;->b:Ljava/lang/Object;

    check-cast p2, Luw;

    invoke-virtual {p2, p1, v8}, Luw;->c(Landroid/net/Uri;Lvt;)Lpw;

    move-result-object p1

    if-nez p1, :cond_4

    const/4 p1, 0x0

    goto :goto_1

    :cond_4
    check-cast p1, LBj;

    invoke-virtual {p1}, LBj;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/drawable/Drawable;

    iget-object p2, p0, LI5;->c:Ljava/lang/Object;

    check-cast p2, LN5;

    invoke-static {p2, p1, v6, v7}, LDc;->e(LN5;Landroid/graphics/drawable/Drawable;II)LO5;

    move-result-object p1

    :goto_1
    return-object p1

    :pswitch_1
    move v6, p2

    move v7, p3

    move-object v8, p4

    iget-object p2, p0, LI5;->b:Ljava/lang/Object;

    check-cast p2, Lsw;

    invoke-interface {p2, p1, v6, v7, v8}, Lsw;->a(Ljava/lang/Object;IILvt;)Lpw;

    move-result-object p1

    iget-object p2, p0, LI5;->c:Ljava/lang/Object;

    check-cast p2, Landroid/content/res/Resources;

    if-nez p1, :cond_5

    const/4 p1, 0x0

    goto :goto_2

    :cond_5
    new-instance p3, LO5;

    invoke-direct {p3, p2, p1}, LO5;-><init>(Landroid/content/res/Resources;Lpw;)V

    move-object p1, p3

    :goto_2
    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Ljava/lang/Object;Lvt;)Z
    .locals 1

    iget v0, p0, LI5;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/io/InputStream;

    const/4 p1, 0x1

    return p1

    :pswitch_0
    check-cast p1, Landroid/net/Uri;

    const-string p2, "android.resource"

    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :pswitch_1
    iget-object v0, p0, LI5;->b:Ljava/lang/Object;

    check-cast v0, Lsw;

    invoke-interface {v0, p1, p2}, Lsw;->b(Ljava/lang/Object;Lvt;)Z

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
