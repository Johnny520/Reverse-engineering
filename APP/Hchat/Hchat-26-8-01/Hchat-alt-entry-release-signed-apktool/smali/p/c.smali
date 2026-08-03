.class public final Lp/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lp/g;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lp/c;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static final c(ILjava/lang/String;)Lp/b;
    .locals 1

    .line 1
    sget-object v0, Lp/s1;->v:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    new-instance v0, Lp/b;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Lp/b;-><init>(ILjava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public static final d(ILjava/lang/String;)Lp/o1;
    .locals 2

    .line 1
    sget-object p0, Lp/s1;->v:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    new-instance p0, Lp/o1;

    .line 4
    .line 5
    new-instance v0, Lp/k0;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, v1, v1, v1, v1}, Lp/k0;-><init>(IIII)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, v0, p1}, Lp/o1;-><init>(Lp/k0;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-object p0
.end method

.method public static e(Li0/h0;)Lp/s1;
    .locals 4

    .line 1
    sget-object v0, Ly1/i0;->f:Li0/m2;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/view/View;

    .line 8
    .line 9
    invoke-static {v0}, Lp/c;->f(Landroid/view/View;)Lp/s1;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p0, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-virtual {p0, v0}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    or-int/2addr v2, v3

    .line 22
    invoke-virtual {p0}, Li0/h0;->P()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    if-nez v2, :cond_0

    .line 27
    .line 28
    sget-object v2, Li0/l;->a:Li0/e;

    .line 29
    .line 30
    if-ne v3, v2, :cond_1

    .line 31
    .line 32
    :cond_0
    new-instance v3, Lm/b;

    .line 33
    .line 34
    const/4 v2, 0x7

    .line 35
    invoke-direct {v3, v1, v2, v0}, Lm/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    check-cast v3, Lfg/l;

    .line 42
    .line 43
    invoke-static {v1, v3, p0}, Li0/r;->c(Ljava/lang/Object;Lfg/l;Li0/h0;)V

    .line 44
    .line 45
    .line 46
    return-object v1
.end method

.method public static f(Landroid/view/View;)Lp/s1;
    .locals 2

    .line 1
    sget-object v0, Lp/s1;->v:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {v0, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    new-instance v1, Lp/s1;

    .line 11
    .line 12
    invoke-direct {v1, p0}, Lp/s1;-><init>(Landroid/view/View;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p0, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception p0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    :goto_0
    check-cast v1, Lp/s1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    monitor-exit v0

    .line 24
    return-object v1

    .line 25
    :goto_1
    monitor-exit v0

    .line 26
    throw p0
.end method


# virtual methods
.method public b(Lv1/p0;I[ILu2/m;[I)V
    .locals 0

    .line 1
    iget p1, p0, Lp/c;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object p1, Lu2/m;->g:Lu2/m;

    .line 7
    .line 8
    if-ne p4, p1, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-static {p3, p5, p1}, Lp/j;->b([I[IZ)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p1, 0x1

    .line 16
    invoke-static {p2, p3, p5, p1}, Lp/j;->c(I[I[IZ)V

    .line 17
    .line 18
    .line 19
    :goto_0
    return-void

    .line 20
    :pswitch_0
    sget-object p1, Lu2/m;->g:Lu2/m;

    .line 21
    .line 22
    if-ne p4, p1, :cond_1

    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    invoke-static {p2, p3, p5, p1}, Lp/j;->c(I[I[IZ)V

    .line 26
    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    const/4 p1, 0x1

    .line 30
    invoke-static {p3, p5, p1}, Lp/j;->b([I[IZ)V

    .line 31
    .line 32
    .line 33
    :goto_1
    return-void

    .line 34
    :pswitch_1
    const/4 p1, 0x0

    .line 35
    invoke-static {p2, p3, p5, p1}, Lp/j;->c(I[I[IZ)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_2
    const/4 p1, 0x0

    .line 40
    invoke-static {p3, p5, p1}, Lp/j;->b([I[IZ)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Lp/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    const-string v0, "Arrangement#Start"

    .line 12
    .line 13
    return-object v0

    .line 14
    :pswitch_1
    const-string v0, "Arrangement#End"

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_2
    const-string v0, "AbsoluteArrangement#Right"

    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_3
    const-string v0, "AbsoluteArrangement#Left"

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
