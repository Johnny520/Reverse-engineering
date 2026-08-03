.class public final synthetic LYue/ۥۣ۟ۤۢ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt\n+ 2 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,479:1\n80#2,11:480\n80#2,11:491\n80#2,11:502\n80#2,11:513\n103#2:524\n80#2,6:525\n104#2:531\n90#2:532\n105#2:533\n86#2,4:534\n80#2,11:538\n103#2:549\n80#2,6:550\n104#2,2:556\n90#2:558\n86#2,4:559\n80#2,11:563\n80#2,11:574\n80#2,11:585\n103#2:596\n80#2,6:597\n104#2,2:603\n90#2:605\n86#2,4:606\n103#2:610\n80#2,6:611\n104#2,2:617\n90#2:619\n86#2,4:620\n103#2:624\n80#2,6:625\n104#2,2:631\n90#2:633\n86#2,4:634\n103#2:638\n80#2,6:639\n104#2,2:645\n90#2:647\n86#2,4:648\n103#2:652\n80#2,6:653\n104#2,2:659\n90#2:661\n86#2,4:662\n80#2,11:666\n103#2:677\n80#2,6:678\n104#2,2:684\n90#2:686\n86#2,4:687\n80#2,11:691\n80#2,11:702\n80#2,11:713\n*S KotlinDebug\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt\n*L\n34#1:480,11\n49#1:491,11\n63#1:502,11\n73#1:513,11\n84#1:524\n84#1:525,6\n84#1:531\n84#1:532\n84#1:533\n84#1:534,4\n95#1:538,11\n110#1:549\n110#1:550,6\n110#1:556,2\n110#1:558\n110#1:559,4\n121#1:563,11\n134#1:574,11\n147#1:585,11\n232#1:596\n232#1:597,6\n232#1:603,2\n232#1:605\n232#1:606,4\n241#1:610\n241#1:611,6\n241#1:617,2\n241#1:619\n241#1:620,4\n277#1:624\n277#1:625,6\n277#1:631,2\n277#1:633\n277#1:634,4\n285#1:638\n285#1:639,6\n285#1:645,2\n285#1:647\n285#1:648,4\n298#1:652\n298#1:653,6\n298#1:659,2\n298#1:661\n298#1:662,4\n403#1:666,11\n411#1:677\n411#1:678,6\n411#1:684,2\n411#1:686\n411#1:687,4\n418#1:691,11\n432#1:702,11\n446#1:713,11\n*E\n"
.end annotation


# direct methods
.method public static final synthetic ۥ(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 4
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Binary compatibility"
    .end annotation

    instance-of v0, p1, LYue/ۥۣ۟ۤۢ$ۥ;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LYue/ۥۣ۟ۤۢ$ۥ;

    iget v1, v0, LYue/ۥۣ۟ۤۢ$ۥ;->ۥ۟۟۠ۥ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥۣ۟ۤۢ$ۥ;->ۥ۟۟۠ۥ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥۣ۟ۤۢ$ۥ;

    invoke-direct {v0, p1}, LYue/ۥۣ۟ۤۢ$ۥ;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p1, v0, LYue/ۥۣ۟ۤۢ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥۣ۟ۤۢ$ۥ;->ۥ۟۟۠ۥ:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LYue/ۥۣ۟ۤۢ$ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast p0, LYue/ۥۡۦۡۡ;

    :try_start_0
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    :try_start_1
    invoke-interface {p0}, LYue/ۥۡۦۡۡ;->iterator()LYue/ۥ۟ۤۡۧ;

    move-result-object p1

    iput-object p0, v0, LYue/ۥۣ۟ۤۢ$ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput v3, v0, LYue/ۥۣ۟ۤۢ$ۥ;->ۥ۟۟۠ۥ:I

    invoke-interface {p1, v0}, LYue/ۥ۟ۤۡۧ;->ۥ۟(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    const/4 v0, 0x0

    invoke-static {p0, v0}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    return-object p1

    :goto_2
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {p0, p1}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static final ۥ۟(LYue/ۥۡۦۡۡ;)LYue/ۥۣ۠ۡ۟;
    .locals 1
    .param p0    # LYue/ۥۡۦۡۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۡۥۤ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e6\u06e1\u06e1<",
            "*>;)",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "Ljava/lang/Throwable;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;"
        }
    .end annotation

    new-instance v0, LYue/ۥۣ۟ۤۢ$ۥ۟;

    invoke-direct {v0, p0}, LYue/ۥۣ۟ۤۢ$ۥ۟;-><init>(LYue/ۥۡۦۡۡ;)V

    return-object v0
.end method

.method public static final varargs ۥ۟۟([LYue/ۥۡۦۡۡ;)LYue/ۥۣ۠ۡ۟;
    .locals 1
    .param p0    # [LYue/ۥۡۦۡۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۡۥۤ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "LYue/\u06e5\u06e1\u06e6\u06e1\u06e1<",
            "*>;)",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "Ljava/lang/Throwable;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;"
        }
    .end annotation

    new-instance v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟;

    invoke-direct {v0, p0}, LYue/ۥۣ۟ۤۢ$ۥ۟۟;-><init>([LYue/ۥۡۦۡۡ;)V

    return-object v0
.end method

.method public static final synthetic ۥ۟۟۟(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 6
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Binary compatibility"
    .end annotation

    instance-of v0, p1, LYue/ۥۣ۟ۤۢ$ۥ۟۟۟;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۟;

    iget v1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۟;->ۥ۟۟۠ۧ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۟;->ۥ۟۟۠ۧ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۟;

    invoke-direct {v0, p1}, LYue/ۥۣ۟ۤۢ$ۥ۟۟۟;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۟;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۟;->ۥ۟۟۠ۧ:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۟;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    check-cast p0, LYue/ۥ۟ۤۡۧ;

    iget-object v2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast v2, LYue/ۥۡۦۡۡ;

    iget-object v4, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۟;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast v4, LYue/ۥۡۦۢۥ$ۥ۟۟۟۠;

    :try_start_0
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p0

    goto :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    new-instance p1, LYue/ۥۡۦۢۥ$ۥ۟۟۟۠;

    invoke-direct {p1}, LYue/ۥۡۦۢۥ$ۥ۟۟۟۠;-><init>()V

    :try_start_1
    invoke-interface {p0}, LYue/ۥۡۦۡۡ;->iterator()LYue/ۥ۟ۤۡۧ;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    move-object v4, p1

    move-object p1, p0

    move-object p0, v2

    :goto_1
    :try_start_2
    iput-object v4, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۟;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput-object p1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput-object p0, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۟;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    iput v3, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۟;->ۥ۟۟۠ۧ:I

    invoke-interface {p0, v0}, LYue/ۥ۟ۤۡۧ;->ۥ۟(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-ne v2, v1, :cond_3

    return-object v1

    :cond_3
    move-object v5, v2

    move-object v2, p1

    move-object p1, v5

    :goto_2
    :try_start_3
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-interface {p0}, LYue/ۥ۟ۤۡۧ;->next()Ljava/lang/Object;

    iget p1, v4, LYue/ۥۡۦۢۥ$ۥ۟۟۟۠;->ۥۣ۟۟۠:I

    add-int/2addr p1, v3

    iput p1, v4, LYue/ۥۡۦۢۥ$ۥ۟۟۟۠;->ۥۣ۟۟۠:I

    move-object p1, v2

    goto :goto_1

    :cond_4
    sget-object p0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    const/4 p0, 0x0

    invoke-static {v2, p0}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    iget p0, v4, LYue/ۥۡۦۢۥ$ۥ۟۟۟۠;->ۥۣ۟۟۠:I

    invoke-static {p0}, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟۠(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :catchall_1
    move-exception p0

    move-object v2, p1

    goto :goto_3

    :catchall_2
    move-exception p1

    move-object v2, p0

    move-object p0, p1

    :goto_3
    :try_start_4
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :catchall_3
    move-exception p1

    invoke-static {v2, p0}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static final synthetic ۥ۟۟۟۟(LYue/ۥۡۦۡۡ;)LYue/ۥۡۦۡۡ;
    .locals 3
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Binary compatibility"
    .end annotation

    new-instance v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۟۟;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥۣ۟ۤۢ$ۥ۟۟۟۟;-><init>(LYue/ۥ۟ۧۤۢ;)V

    const/4 v2, 0x1

    invoke-static {p0, v1, v0, v2, v1}, LYue/ۥ۟ۤۢ۠;->ۥ۟۟۟ۦ(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠ۢۢ;ILjava/lang/Object;)LYue/ۥۡۦۡۡ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۟۠(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠ۢۢ;)LYue/ۥۡۦۡۡ;
    .locals 8
    .param p0    # LYue/ۥۡۦۡۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۠ۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۡۥۤ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            "K:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e6\u06e1\u06e1<",
            "+TE;>;",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-TE;-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TK;>;+",
            "Ljava/lang/Object;",
            ">;)",
            "LYue/\u06e5\u06e1\u06e6\u06e1\u06e1<",
            "TE;>;"
        }
    .end annotation

    sget-object v0, LYue/ۥۣ۠ۦ;->ۥۣ۟۟۠:LYue/ۥۣ۠ۦ;

    invoke-static {p0}, LYue/ۥ۟ۤۢ۠;->ۥ۟۟۟ۡ(LYue/ۥۡۦۡۡ;)LYue/ۥۣ۠ۡ۟;

    move-result-object v4

    new-instance v5, LYue/ۥۣ۟ۤۢ$ۥ۟۟۟۠;

    const/4 v1, 0x0

    invoke-direct {v5, p0, p2, v1}, LYue/ۥۣ۟ۤۢ$ۥ۟۟۟۠;-><init>(LYue/ۥۡۦۡۡ;LYue/ۥۣ۠ۢۢ;LYue/ۥ۟ۧۤۢ;)V

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p1

    invoke-static/range {v0 .. v7}, LYue/ۥۡۥۡۢ;->ۥ۟۟۟ۡ(LYue/ۥ۟ۧۧۥ;LYue/ۥ۟ۧۦۥ;ILYue/ۥ۟ۧۨ;LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۢۢ;ILjava/lang/Object;)LYue/ۥۡۦۡۡ;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۥ۟۟۟ۡ(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠ۢۢ;ILjava/lang/Object;)LYue/ۥۡۦۡۡ;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    invoke-static {}, LYue/ۥ۠۟ۢۦ;->ۥ۟۟۟ۡ()LYue/ۥ۟ۧۦۨ;

    move-result-object p1

    :cond_0
    invoke-static {p0, p1, p2}, LYue/ۥ۟ۤۢ۠;->ۥ۟۟۟ۥ(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠ۢۢ;)LYue/ۥۡۦۡۡ;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic ۥ۟۟۟ۢ(LYue/ۥۡۦۡۡ;ILYue/ۥ۟ۧۦۥ;)LYue/ۥۡۦۡۡ;
    .locals 8
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Binary compatibility"
    .end annotation

    sget-object v0, LYue/ۥۣ۠ۦ;->ۥۣ۟۟۠:LYue/ۥۣ۠ۦ;

    invoke-static {p0}, LYue/ۥ۟ۤۢ۠;->ۥ۟۟۟ۡ(LYue/ۥۡۦۡۡ;)LYue/ۥۣ۠ۡ۟;

    move-result-object v4

    new-instance v5, LYue/ۥۣ۟ۤۢ$ۥ۟۟۟ۡ;

    const/4 v1, 0x0

    invoke-direct {v5, p1, p0, v1}, LYue/ۥۣ۟ۤۢ$ۥ۟۟۟ۡ;-><init>(ILYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۤۢ;)V

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p2

    invoke-static/range {v0 .. v7}, LYue/ۥۡۥۡۢ;->ۥ۟۟۟ۡ(LYue/ۥ۟ۧۧۥ;LYue/ۥ۟ۧۦۥ;ILYue/ۥ۟ۧۨ;LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۢۢ;ILjava/lang/Object;)LYue/ۥۡۦۡۡ;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۥۣ۟۟۟(LYue/ۥۡۦۡۡ;ILYue/ۥ۟ۧۦۥ;ILjava/lang/Object;)LYue/ۥۡۦۡۡ;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    invoke-static {}, LYue/ۥ۠۟ۢۦ;->ۥ۟۟۟ۡ()LYue/ۥ۟ۧۦۨ;

    move-result-object p2

    :cond_0
    invoke-static {p0, p1, p2}, LYue/ۥ۟ۤۢ۠;->ۥ۟۟۟ۧ(LYue/ۥۡۦۡۡ;ILYue/ۥ۟ۧۦۥ;)LYue/ۥۡۦۡۡ;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic ۥ۟۟۟ۤ(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠ۢۢ;)LYue/ۥۡۦۡۡ;
    .locals 8
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Binary compatibility"
    .end annotation

    sget-object v0, LYue/ۥۣ۠ۦ;->ۥۣ۟۟۠:LYue/ۥۣ۠ۦ;

    invoke-static {p0}, LYue/ۥ۟ۤۢ۠;->ۥ۟۟۟ۡ(LYue/ۥۡۦۡۡ;)LYue/ۥۣ۠ۡ۟;

    move-result-object v4

    new-instance v5, LYue/ۥۣ۟ۤۢ$ۥ۟۟۟ۢ;

    const/4 v1, 0x0

    invoke-direct {v5, p0, p2, v1}, LYue/ۥۣ۟ۤۢ$ۥ۟۟۟ۢ;-><init>(LYue/ۥۡۦۡۡ;LYue/ۥۣ۠ۢۢ;LYue/ۥ۟ۧۤۢ;)V

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p1

    invoke-static/range {v0 .. v7}, LYue/ۥۡۥۡۢ;->ۥ۟۟۟ۡ(LYue/ۥ۟ۧۧۥ;LYue/ۥ۟ۧۦۥ;ILYue/ۥ۟ۧۨ;LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۢۢ;ILjava/lang/Object;)LYue/ۥۡۦۡۡ;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۥ۟۟۟ۥ(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠ۢۢ;ILjava/lang/Object;)LYue/ۥۡۦۡۡ;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    invoke-static {}, LYue/ۥ۠۟ۢۦ;->ۥ۟۟۟ۡ()LYue/ۥ۟ۧۦۨ;

    move-result-object p1

    :cond_0
    invoke-static {p0, p1, p2}, LYue/ۥ۟ۤۢ۠;->ۥ۟۟۠(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠ۢۢ;)LYue/ۥۡۦۡۡ;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic ۥ۟۟۟ۦ(LYue/ۥۡۦۡۡ;ILYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 9
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Binary compatibility"
    .end annotation

    instance-of v0, p2, LYue/ۥۣ۟ۤۢ$ۥۣ۟۟۟;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LYue/ۥۣ۟ۤۢ$ۥۣ۟۟۟;

    iget v1, v0, LYue/ۥۣ۟ۤۢ$ۥۣ۟۟۟;->ۥ۟۟۠ۨ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥۣ۟ۤۢ$ۥۣ۟۟۟;->ۥ۟۟۠ۨ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥۣ۟ۤۢ$ۥۣ۟۟۟;

    invoke-direct {v0, p2}, LYue/ۥۣ۟ۤۢ$ۥۣ۟۟۟;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p2, v0, LYue/ۥۣ۟ۤۢ$ۥۣ۟۟۟;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥۣ۟ۤۢ$ۥۣ۟۟۟;->ۥ۟۟۠ۨ:I

    const/16 v3, 0x2e

    const-string v4, "ReceiveChannel doesn\'t contain element at index "

    const/4 v5, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v5, :cond_1

    iget p0, v0, LYue/ۥۣ۟ۤۢ$ۥۣ۟۟۟;->ۥ۟۟۠ۤ:I

    iget p1, v0, LYue/ۥۣ۟ۤۢ$ۥۣ۟۟۟;->ۥۣ۟۟۠:I

    iget-object v2, v0, LYue/ۥۣ۟ۤۢ$ۥۣ۟۟۟;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    check-cast v2, LYue/ۥ۟ۤۡۧ;

    iget-object v6, v0, LYue/ۥۣ۟ۤۢ$ۥۣ۟۟۟;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    check-cast v6, LYue/ۥۡۦۡۡ;

    :try_start_0
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p0

    goto/16 :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    if-ltz p1, :cond_6

    :try_start_1
    invoke-interface {p0}, LYue/ۥۡۦۡۡ;->iterator()LYue/ۥ۟ۤۡۧ;

    move-result-object p2

    const/4 v2, 0x0

    :goto_1
    iput-object p0, v0, LYue/ۥۣ۟ۤۢ$ۥۣ۟۟۟;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    iput-object p2, v0, LYue/ۥۣ۟ۤۢ$ۥۣ۟۟۟;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    iput p1, v0, LYue/ۥۣ۟ۤۢ$ۥۣ۟۟۟;->ۥۣ۟۟۠:I

    iput v2, v0, LYue/ۥۣ۟ۤۢ$ۥۣ۟۟۟;->ۥ۟۟۠ۤ:I

    iput v5, v0, LYue/ۥۣ۟ۤۢ$ۥۣ۟۟۟;->ۥ۟۟۠ۨ:I

    invoke-interface {p2, v0}, LYue/ۥ۟ۤۡۧ;->ۥ۟(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v6, v1, :cond_3

    return-object v1

    :cond_3
    move-object v8, v6

    move-object v6, p0

    move p0, v2

    move-object v2, p2

    move-object p2, v8

    :goto_2
    :try_start_2
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-interface {v2}, LYue/ۥ۟ۤۡۧ;->next()Ljava/lang/Object;

    move-result-object p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    add-int/lit8 v7, p0, 0x1

    if-ne p1, p0, :cond_4

    const/4 p0, 0x0

    invoke-static {v6, p0}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    return-object p2

    :cond_4
    move-object p2, v2

    move-object p0, v6

    move v2, v7

    goto :goto_1

    :cond_5
    :try_start_3
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_1
    move-exception p1

    move-object v6, p0

    move-object p0, p1

    goto :goto_3

    :cond_6
    :try_start_4
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_3
    :try_start_5
    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception p1

    invoke-static {v6, p0}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static final synthetic ۥ۟۟۟ۧ(LYue/ۥۡۦۡۡ;ILYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 8
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Binary compatibility"
    .end annotation

    instance-of v0, p2, LYue/ۥۣ۟ۤۢ$ۥ۟۟۟ۤ;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۟ۤ;

    iget v1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۟ۤ;->ۥ۟۟۠ۨ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۟ۤ;->ۥ۟۟۠ۨ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۟ۤ;

    invoke-direct {v0, p2}, LYue/ۥۣ۟ۤۢ$ۥ۟۟۟ۤ;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۟ۤ;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۟ۤ;->ۥ۟۟۠ۨ:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget p0, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۟ۤ;->ۥ۟۟۠ۤ:I

    iget p1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۟ۤ;->ۥۣ۟۟۠:I

    iget-object v2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۟ۤ;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    check-cast v2, LYue/ۥ۟ۤۡۧ;

    iget-object v5, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۟ۤ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    check-cast v5, LYue/ۥۡۦۡۡ;

    :try_start_0
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v7, v2

    move v2, p0

    move-object p0, v5

    move-object v5, v0

    move-object v0, v7

    goto :goto_2

    :catchall_0
    move-exception p0

    goto :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    if-gez p1, :cond_3

    invoke-static {p0, v4}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    return-object v4

    :cond_3
    :try_start_1
    invoke-interface {p0}, LYue/ۥۡۦۡۡ;->iterator()LYue/ۥ۟ۤۡۧ;

    move-result-object p2

    const/4 v2, 0x0

    :goto_1
    iput-object p0, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۟ۤ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    iput-object p2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۟ۤ;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    iput p1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۟ۤ;->ۥۣ۟۟۠:I

    iput v2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۟ۤ;->ۥ۟۟۠ۤ:I

    iput v3, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۟ۤ;->ۥ۟۟۠ۨ:I

    invoke-interface {p2, v0}, LYue/ۥ۟ۤۡۧ;->ۥ۟(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_4

    return-object v1

    :cond_4
    move-object v7, v0

    move-object v0, p2

    move-object p2, v5

    move-object v5, v7

    :goto_2
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-interface {v0}, LYue/ۥ۟ۤۡۧ;->next()Ljava/lang/Object;

    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    add-int/lit8 v6, v2, 0x1

    if-ne p1, v2, :cond_5

    invoke-static {p0, v4}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    return-object p2

    :cond_5
    move-object p2, v0

    move-object v0, v5

    move v2, v6

    goto :goto_1

    :catchall_1
    move-exception p1

    move-object v5, p0

    move-object p0, p1

    goto :goto_3

    :cond_6
    invoke-static {p0, v4}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    return-object v4

    :goto_3
    :try_start_2
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :catchall_2
    move-exception p1

    invoke-static {v5, p0}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static final ۥ۟۟۟ۨ(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠ۢۢ;)LYue/ۥۡۦۡۡ;
    .locals 8
    .param p0    # LYue/ۥۡۦۡۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۠ۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۡۥۤ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e6\u06e1\u06e1<",
            "+TE;>;",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-TE;-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "Ljava/lang/Boolean;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "LYue/\u06e5\u06e1\u06e6\u06e1\u06e1<",
            "TE;>;"
        }
    .end annotation

    sget-object v0, LYue/ۥۣ۠ۦ;->ۥۣ۟۟۠:LYue/ۥۣ۠ۦ;

    invoke-static {p0}, LYue/ۥ۟ۤۢ۠;->ۥ۟۟۟ۡ(LYue/ۥۡۦۡۡ;)LYue/ۥۣ۠ۡ۟;

    move-result-object v4

    new-instance v5, LYue/ۥۣ۟ۤۢ$ۥ۟۟۟ۥ;

    const/4 v1, 0x0

    invoke-direct {v5, p0, p2, v1}, LYue/ۥۣ۟ۤۢ$ۥ۟۟۟ۥ;-><init>(LYue/ۥۡۦۡۡ;LYue/ۥۣ۠ۢۢ;LYue/ۥ۟ۧۤۢ;)V

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p1

    invoke-static/range {v0 .. v7}, LYue/ۥۡۥۡۢ;->ۥ۟۟۟ۡ(LYue/ۥ۟ۧۧۥ;LYue/ۥ۟ۧۦۥ;ILYue/ۥ۟ۧۨ;LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۢۢ;ILjava/lang/Object;)LYue/ۥۡۦۡۡ;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۥ۟۟۠(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠ۢۢ;ILjava/lang/Object;)LYue/ۥۡۦۡۡ;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    invoke-static {}, LYue/ۥ۠۟ۢۦ;->ۥ۟۟۟ۡ()LYue/ۥ۟ۧۦۨ;

    move-result-object p1

    :cond_0
    invoke-static {p0, p1, p2}, LYue/ۥ۟ۤۢ۠;->ۥ۟۟۠ۢ(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠ۢۢ;)LYue/ۥۡۦۡۡ;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic ۥ۟۟۠۟(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠ۢۤ;)LYue/ۥۡۦۡۡ;
    .locals 8
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Binary compatibility"
    .end annotation

    sget-object v0, LYue/ۥۣ۠ۦ;->ۥۣ۟۟۠:LYue/ۥۣ۠ۦ;

    invoke-static {p0}, LYue/ۥ۟ۤۢ۠;->ۥ۟۟۟ۡ(LYue/ۥۡۦۡۡ;)LYue/ۥۣ۠ۡ۟;

    move-result-object v4

    new-instance v5, LYue/ۥۣ۟ۤۢ$ۥ۟۟۟ۦ;

    const/4 v1, 0x0

    invoke-direct {v5, p0, p2, v1}, LYue/ۥۣ۟ۤۢ$ۥ۟۟۟ۦ;-><init>(LYue/ۥۡۦۡۡ;LYue/ۥۣ۠ۢۤ;LYue/ۥ۟ۧۤۢ;)V

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p1

    invoke-static/range {v0 .. v7}, LYue/ۥۡۥۡۢ;->ۥ۟۟۟ۡ(LYue/ۥ۟ۧۧۥ;LYue/ۥ۟ۧۦۥ;ILYue/ۥ۟ۧۨ;LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۢۢ;ILjava/lang/Object;)LYue/ۥۡۦۡۡ;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۥ۟۟۠۠(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠ۢۤ;ILjava/lang/Object;)LYue/ۥۡۦۡۡ;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    invoke-static {}, LYue/ۥ۠۟ۢۦ;->ۥ۟۟۟ۡ()LYue/ۥ۟ۧۦۨ;

    move-result-object p1

    :cond_0
    invoke-static {p0, p1, p2}, LYue/ۥ۟ۤۢ۠;->ۥ۟۟۠ۤ(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠ۢۤ;)LYue/ۥۡۦۡۡ;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic ۥ۟۟۠ۡ(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠ۢۢ;)LYue/ۥۡۦۡۡ;
    .locals 2
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Binary compatibility"
    .end annotation

    new-instance v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۟ۧ;

    const/4 v1, 0x0

    invoke-direct {v0, p2, v1}, LYue/ۥۣ۟ۤۢ$ۥ۟۟۟ۧ;-><init>(LYue/ۥۣ۠ۢۢ;LYue/ۥ۟ۧۤۢ;)V

    invoke-static {p0, p1, v0}, LYue/ۥ۟ۤۢ۠;->ۥ۟۟۠ۢ(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠ۢۢ;)LYue/ۥۡۦۡۡ;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۥ۟۟۠ۢ(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠ۢۢ;ILjava/lang/Object;)LYue/ۥۡۦۡۡ;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    invoke-static {}, LYue/ۥ۠۟ۢۦ;->ۥ۟۟۟ۡ()LYue/ۥ۟ۧۦۨ;

    move-result-object p1

    :cond_0
    invoke-static {p0, p1, p2}, LYue/ۥ۟ۤۢ۠;->ۥ۟۟۠ۦ(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠ۢۢ;)LYue/ۥۡۦۡۡ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥۣ۟۟۠(LYue/ۥۡۦۡۡ;)LYue/ۥۡۦۡۡ;
    .locals 3
    .param p0    # LYue/ۥۡۦۡۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۡۥۤ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e6\u06e1\u06e1<",
            "+TE;>;)",
            "LYue/\u06e5\u06e1\u06e6\u06e1\u06e1<",
            "TE;>;"
        }
    .end annotation

    new-instance v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۟ۨ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥۣ۟ۤۢ$ۥ۟۟۟ۨ;-><init>(LYue/ۥ۟ۧۤۢ;)V

    const/4 v2, 0x1

    invoke-static {p0, v1, v0, v2, v1}, LYue/ۥ۟ۤۢ۠;->ۥۣ۟۟۠(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠ۢۢ;ILjava/lang/Object;)LYue/ۥۡۦۡۡ;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic ۥ۟۟۠ۤ(LYue/ۥۡۦۡۡ;LYue/ۥۡۨۡ۠;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 6
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Binary compatibility"
    .end annotation

    instance-of v0, p2, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠۟;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠۟;

    iget v1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠۟;->ۥ۟۟۠ۧ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠۟;->ۥ۟۟۠ۧ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠۟;

    invoke-direct {v0, p2}, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠۟;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠۟;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠۟;->ۥ۟۟۠ۧ:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠۟;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    check-cast p0, LYue/ۥ۟ۤۡۧ;

    iget-object p1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast p1, LYue/ۥۡۦۡۡ;

    iget-object v2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠۟;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast v2, LYue/ۥۡۨۡ۠;

    :try_start_0
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object p2, p0

    move-object p0, p1

    move-object p1, v2

    goto :goto_2

    :catchall_0
    move-exception p0

    goto/16 :goto_4

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p0, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠۟;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    check-cast p0, LYue/ۥ۟ۤۡۧ;

    iget-object p1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast p1, LYue/ۥۡۦۡۡ;

    iget-object v2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠۟;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast v2, LYue/ۥۡۨۡ۠;

    :try_start_1
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v5, v0

    move-object v0, p0

    move-object p0, p1

    move-object p1, v2

    :goto_1
    move-object v2, v5

    goto :goto_3

    :cond_3
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    :try_start_2
    invoke-interface {p0}, LYue/ۥۡۦۡۡ;->iterator()LYue/ۥ۟ۤۡۧ;

    move-result-object p2

    :goto_2
    iput-object p1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠۟;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput-object p0, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput-object p2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠۟;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    iput v4, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠۟;->ۥ۟۟۠ۧ:I

    invoke-interface {p2, v0}, LYue/ۥ۟ۤۡۧ;->ۥ۟(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    return-object v1

    :cond_4
    move-object v5, v0

    move-object v0, p2

    move-object p2, v2

    goto :goto_1

    :goto_3
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-interface {v0}, LYue/ۥ۟ۤۡۧ;->next()Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_5

    iput-object p1, v2, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠۟;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput-object p0, v2, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput-object v0, v2, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠۟;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    iput v3, v2, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠۟;->ۥ۟۟۠ۧ:I

    invoke-interface {p1, p2, v2}, LYue/ۥۡۨۡ۠;->ۥ۟۟۟۠(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    return-object v1

    :catchall_1
    move-exception p1

    move-object v5, p1

    move-object p1, p0

    move-object p0, v5

    goto :goto_4

    :cond_5
    move-object p2, v0

    move-object v0, v2

    goto :goto_2

    :cond_6
    sget-object p2, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    const/4 p2, 0x0

    invoke-static {p0, p2}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    return-object p1

    :goto_4
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    move-exception p2

    invoke-static {p1, p0}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public static final synthetic ۥ۟۟۠ۥ(LYue/ۥۡۦۡۡ;Ljava/util/Collection;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 5
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Binary compatibility"
    .end annotation

    instance-of v0, p2, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠;

    iget v1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠;->ۥ۟۟۠ۧ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠;->ۥ۟۟۠ۧ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠;

    invoke-direct {v0, p2}, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠;->ۥ۟۟۠ۧ:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    check-cast p0, LYue/ۥ۟ۤۡۧ;

    iget-object p1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast p1, LYue/ۥۡۦۡۡ;

    iget-object v2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast v2, Ljava/util/Collection;

    :try_start_0
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p0

    goto :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    :try_start_1
    invoke-interface {p0}, LYue/ۥۡۦۡۡ;->iterator()LYue/ۥ۟ۤۡۧ;

    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v4, p1

    move-object p1, p0

    move-object p0, p2

    move-object p2, v4

    :goto_1
    :try_start_2
    iput-object p2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput-object p1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput-object p0, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    iput v3, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠;->ۥ۟۟۠ۧ:I

    invoke-interface {p0, v0}, LYue/ۥ۟ۤۡۧ;->ۥ۟(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_3

    return-object v1

    :cond_3
    move-object v4, v2

    move-object v2, p2

    move-object p2, v4

    :goto_2
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-interface {p0}, LYue/ۥ۟ۤۡۧ;->next()Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_4

    invoke-interface {v2, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_4
    move-object p2, v2

    goto :goto_1

    :cond_5
    sget-object p0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/4 p0, 0x0

    invoke-static {p1, p0}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    return-object v2

    :catchall_1
    move-exception p1

    move-object v4, p1

    move-object p1, p0

    move-object p0, v4

    :goto_3
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    move-exception p2

    invoke-static {p1, p0}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public static final synthetic ۥ۟۟۠ۦ(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 5
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Binary compatibility"
    .end annotation

    instance-of v0, p1, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠۠;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠۠;

    iget v1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠۠;->ۥ۟۟۠ۦ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠۠;->ۥ۟۟۠ۦ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠۠;

    invoke-direct {v0, p1}, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠۠;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠۠;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠۠;->ۥ۟۟۠ۦ:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠۠;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast p0, LYue/ۥ۟ۤۡۧ;

    iget-object v0, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠۠;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast v0, LYue/ۥۡۦۡۡ;

    :try_start_0
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    :try_start_1
    invoke-interface {p0}, LYue/ۥۡۦۡۡ;->iterator()LYue/ۥ۟ۤۡۧ;

    move-result-object p1

    iput-object p0, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠۠;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput-object p1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠۠;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput v3, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠۠;->ۥ۟۟۠ۦ:I

    invoke-interface {p1, v0}, LYue/ۥ۟ۤۡۧ;->ۥ۟(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v4, v0

    move-object v0, p0

    move-object p0, p1

    move-object p1, v4

    :goto_1
    :try_start_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-interface {p0}, LYue/ۥ۟ۤۡۧ;->next()Ljava/lang/Object;

    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/4 p1, 0x0

    invoke-static {v0, p1}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    return-object p0

    :cond_4
    :try_start_3
    new-instance p0, Ljava/util/NoSuchElementException;

    const-string p1, "ReceiveChannel is empty."

    invoke-direct {p0, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_1
    move-exception p1

    move-object v0, p0

    move-object p0, p1

    :goto_2
    :try_start_4
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception p1

    invoke-static {v0, p0}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static final synthetic ۥ۟۟۠ۧ(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 5
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Binary compatibility"
    .end annotation

    instance-of v0, p1, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۡ;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۡ;

    iget v1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۡ;->ۥ۟۟۠ۦ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۡ;->ۥ۟۟۠ۦ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۡ;

    invoke-direct {v0, p1}, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۡ;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۡ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۡ;->ۥ۟۟۠ۦ:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۡ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast p0, LYue/ۥ۟ۤۡۧ;

    iget-object v0, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۡ;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast v0, LYue/ۥۡۦۡۡ;

    :try_start_0
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    :try_start_1
    invoke-interface {p0}, LYue/ۥۡۦۡۡ;->iterator()LYue/ۥ۟ۤۡۧ;

    move-result-object p1

    iput-object p0, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۡ;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput-object p1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۡ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput v3, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۡ;->ۥ۟۟۠ۦ:I

    invoke-interface {p1, v0}, LYue/ۥ۟ۤۡۧ;->ۥ۟(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v4, v0

    move-object v0, p0

    move-object p0, p1

    move-object p1, v4

    :goto_1
    :try_start_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/4 v1, 0x0

    if-nez p1, :cond_4

    invoke-static {v0, v1}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    return-object v1

    :cond_4
    :try_start_3
    invoke-interface {p0}, LYue/ۥ۟ۤۡۧ;->next()Ljava/lang/Object;

    move-result-object p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-static {v0, v1}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    return-object p0

    :catchall_1
    move-exception p1

    move-object v0, p0

    move-object p0, p1

    :goto_2
    :try_start_4
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception p1

    invoke-static {v0, p0}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static final synthetic ۥ۟۟۠ۨ(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠ۢۢ;)LYue/ۥۡۦۡۡ;
    .locals 8
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Binary compatibility"
    .end annotation

    sget-object v0, LYue/ۥۣ۠ۦ;->ۥۣ۟۟۠:LYue/ۥۣ۠ۦ;

    invoke-static {p0}, LYue/ۥ۟ۤۢ۠;->ۥ۟۟۟ۡ(LYue/ۥۡۦۡۡ;)LYue/ۥۣ۠ۡ۟;

    move-result-object v4

    new-instance v5, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۢ;

    const/4 v1, 0x0

    invoke-direct {v5, p0, p2, v1}, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۢ;-><init>(LYue/ۥۡۦۡۡ;LYue/ۥۣ۠ۢۢ;LYue/ۥ۟ۧۤۢ;)V

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p1

    invoke-static/range {v0 .. v7}, LYue/ۥۡۥۡۢ;->ۥ۟۟۟ۡ(LYue/ۥ۟ۧۧۥ;LYue/ۥ۟ۧۦۥ;ILYue/ۥ۟ۧۨ;LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۢۢ;ILjava/lang/Object;)LYue/ۥۡۦۡۡ;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۥ۟۟ۡ(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠ۢۢ;ILjava/lang/Object;)LYue/ۥۡۦۡۡ;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    invoke-static {}, LYue/ۥ۠۟ۢۦ;->ۥ۟۟۟ۡ()LYue/ۥ۟ۧۦۨ;

    move-result-object p1

    :cond_0
    invoke-static {p0, p1, p2}, LYue/ۥ۟ۤۢ۠;->ۥ۟۟ۡۢ(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠ۢۢ;)LYue/ۥۡۦۡۡ;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic ۥ۟۟ۡ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 7
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Binary compatibility"
    .end annotation

    instance-of v0, p2, LYue/ۥۣ۟ۤۢ$ۥۣ۟۟۠;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LYue/ۥۣ۟ۤۢ$ۥۣ۟۟۠;

    iget v1, v0, LYue/ۥۣ۟ۤۢ$ۥۣ۟۟۠;->ۥ۟۟۠ۨ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥۣ۟ۤۢ$ۥۣ۟۟۠;->ۥ۟۟۠ۨ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥۣ۟ۤۢ$ۥۣ۟۟۠;

    invoke-direct {v0, p2}, LYue/ۥۣ۟ۤۢ$ۥۣ۟۟۠;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p2, v0, LYue/ۥۣ۟ۤۢ$ۥۣ۟۟۠;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥۣ۟ۤۢ$ۥۣ۟۟۠;->ۥ۟۟۠ۨ:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LYue/ۥۣ۟ۤۢ$ۥۣ۟۟۠;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    check-cast p0, LYue/ۥ۟ۤۡۧ;

    iget-object p1, v0, LYue/ۥۣ۟ۤۢ$ۥۣ۟۟۠;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    check-cast p1, LYue/ۥۡۦۡۡ;

    iget-object v2, v0, LYue/ۥۣ۟ۤۢ$ۥۣ۟۟۠;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast v2, LYue/ۥۡۦۢۥ$ۥ۟۟۟۠;

    iget-object v4, v0, LYue/ۥۣ۟ۤۢ$ۥۣ۟۟۠;->ۥۣ۟۟۠:Ljava/lang/Object;

    :try_start_0
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p0

    goto/16 :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    new-instance p2, LYue/ۥۡۦۢۥ$ۥ۟۟۟۠;

    invoke-direct {p2}, LYue/ۥۡۦۢۥ$ۥ۟۟۟۠;-><init>()V

    :try_start_1
    invoke-interface {p0}, LYue/ۥۡۦۡۡ;->iterator()LYue/ۥ۟ۤۡۧ;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v6, p1

    move-object p1, p0

    move-object p0, v2

    move-object v2, p2

    move-object p2, v6

    :goto_1
    :try_start_2
    iput-object p2, v0, LYue/ۥۣ۟ۤۢ$ۥۣ۟۟۠;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput-object v2, v0, LYue/ۥۣ۟ۤۢ$ۥۣ۟۟۠;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput-object p1, v0, LYue/ۥۣ۟ۤۢ$ۥۣ۟۟۠;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    iput-object p0, v0, LYue/ۥۣ۟ۤۢ$ۥۣ۟۟۠;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    iput v3, v0, LYue/ۥۣ۟ۤۢ$ۥۣ۟۟۠;->ۥ۟۟۠ۨ:I

    invoke-interface {p0, v0}, LYue/ۥ۟ۤۡۧ;->ۥ۟(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_3

    return-object v1

    :cond_3
    move-object v6, v4

    move-object v4, p2

    move-object p2, v6

    :goto_2
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    const/4 v5, 0x0

    if-eqz p2, :cond_5

    invoke-interface {p0}, LYue/ۥ۟ۤۡۧ;->next()Ljava/lang/Object;

    move-result-object p2

    invoke-static {v4, p2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    iget p0, v2, LYue/ۥۡۦۢۥ$ۥ۟۟۟۠;->ۥۣ۟۟۠:I

    invoke-static {p0}, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟۠(I)Ljava/lang/Integer;

    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-static {p1, v5}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    return-object p0

    :cond_4
    :try_start_3
    iget p2, v2, LYue/ۥۡۦۢۥ$ۥ۟۟۟۠;->ۥۣ۟۟۠:I

    add-int/2addr p2, v3

    iput p2, v2, LYue/ۥۡۦۢۥ$ۥ۟۟۟۠;->ۥۣ۟۟۠:I

    move-object p2, v4

    goto :goto_1

    :cond_5
    sget-object p0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-static {p1, v5}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    const/4 p0, -0x1

    invoke-static {p0}, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟۠(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :catchall_1
    move-exception p1

    move-object v6, p1

    move-object p1, p0

    move-object p0, v6

    :goto_3
    :try_start_4
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception p2

    invoke-static {p1, p0}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public static final synthetic ۥ۟۟ۡ۠(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 6
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Binary compatibility"
    .end annotation

    instance-of v0, p1, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۤ;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۤ;

    iget v1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۤ;->ۥ۟۟۠ۧ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۤ;->ۥ۟۟۠ۧ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۤ;

    invoke-direct {v0, p1}, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۤ;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۤ;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۤ;->ۥ۟۟۠ۧ:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۤ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    iget-object v2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۤ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast v2, LYue/ۥ۟ۤۡۧ;

    iget-object v4, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۤ;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast v4, LYue/ۥۡۦۡۡ;

    :try_start_0
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p0

    move-object v2, v4

    goto/16 :goto_4

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p0, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۤ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast p0, LYue/ۥ۟ۤۡۧ;

    iget-object v2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۤ;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast v2, LYue/ۥۡۦۡۡ;

    :try_start_1
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p0

    goto/16 :goto_4

    :cond_3
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    :try_start_2
    invoke-interface {p0}, LYue/ۥۡۦۡۡ;->iterator()LYue/ۥ۟ۤۡۧ;

    move-result-object p1

    iput-object p0, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۤ;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput-object p1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۤ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput v4, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۤ;->ۥ۟۟۠ۧ:I

    invoke-interface {p1, v0}, LYue/ۥ۟ۤۡۧ;->ۥ۟(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-ne v2, v1, :cond_4

    return-object v1

    :cond_4
    move-object v5, v2

    move-object v2, p0

    move-object p0, p1

    move-object p1, v5

    :goto_1
    :try_start_3
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-interface {p0}, LYue/ۥ۟ۤۡۧ;->next()Ljava/lang/Object;

    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move-object v5, v2

    move-object v2, p0

    move-object p0, v5

    :goto_2
    :try_start_4
    iput-object p0, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۤ;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput-object v2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۤ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput-object p1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۤ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    iput v3, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۤ;->ۥ۟۟۠ۧ:I

    invoke-interface {v2, v0}, LYue/ۥ۟ۤۡۧ;->ۥ۟(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    if-ne v4, v1, :cond_5

    return-object v1

    :cond_5
    move-object v5, v4

    move-object v4, p0

    move-object p0, p1

    move-object p1, v5

    :goto_3
    :try_start_5
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-interface {v2}, LYue/ۥ۟ۤۡۧ;->next()Ljava/lang/Object;

    move-result-object p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    move-object p0, v4

    goto :goto_2

    :cond_6
    const/4 p1, 0x0

    invoke-static {v4, p1}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    return-object p0

    :catchall_2
    move-exception p1

    move-object v2, p0

    move-object p0, p1

    goto :goto_4

    :cond_7
    :try_start_6
    new-instance p0, Ljava/util/NoSuchElementException;

    const-string p1, "ReceiveChannel is empty."

    invoke-direct {p0, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :goto_4
    :try_start_7
    throw p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    :catchall_3
    move-exception p1

    invoke-static {v2, p0}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static final synthetic ۥ۟۟ۡۡ(LYue/ۥۡۦۡۡ;Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 7
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Binary compatibility"
    .end annotation

    instance-of v0, p2, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۥ;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۥ;

    iget v1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۥ;->ۥ۟۟ۡ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۥ;->ۥ۟۟ۡ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۥ;

    invoke-direct {v0, p2}, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۥ;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۥ;->ۥ۟۟۠ۨ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۥ;->ۥ۟۟ۡ:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۥ;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    check-cast p0, LYue/ۥ۟ۤۡۧ;

    iget-object p1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۥ;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    check-cast p1, LYue/ۥۡۦۡۡ;

    iget-object v2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۥ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    check-cast v2, LYue/ۥۡۦۢۥ$ۥ۟۟۟۠;

    iget-object v4, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast v4, LYue/ۥۡۦۢۥ$ۥ۟۟۟۠;

    iget-object v5, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    :try_start_0
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p0

    goto/16 :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    new-instance p2, LYue/ۥۡۦۢۥ$ۥ۟۟۟۠;

    invoke-direct {p2}, LYue/ۥۡۦۢۥ$ۥ۟۟۟۠;-><init>()V

    const/4 v2, -0x1

    iput v2, p2, LYue/ۥۡۦۢۥ$ۥ۟۟۟۠;->ۥۣ۟۟۠:I

    new-instance v2, LYue/ۥۡۦۢۥ$ۥ۟۟۟۠;

    invoke-direct {v2}, LYue/ۥۡۦۢۥ$ۥ۟۟۟۠;-><init>()V

    :try_start_1
    invoke-interface {p0}, LYue/ۥۡۦۡۡ;->iterator()LYue/ۥ۟ۤۡۧ;

    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v6, p1

    move-object p1, p0

    move-object p0, v4

    move-object v4, p2

    move-object p2, v6

    :goto_1
    :try_start_2
    iput-object p2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput-object v4, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput-object v2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۥ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    iput-object p1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۥ;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    iput-object p0, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۥ;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    iput v3, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۥ;->ۥ۟۟ۡ:I

    invoke-interface {p0, v0}, LYue/ۥ۟ۤۡۧ;->ۥ۟(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_3

    return-object v1

    :cond_3
    move-object v6, v5

    move-object v5, p2

    move-object p2, v6

    :goto_2
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-interface {p0}, LYue/ۥ۟ۤۡۧ;->next()Ljava/lang/Object;

    move-result-object p2

    invoke-static {v5, p2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    iget p2, v2, LYue/ۥۡۦۢۥ$ۥ۟۟۟۠;->ۥۣ۟۟۠:I

    iput p2, v4, LYue/ۥۡۦۢۥ$ۥ۟۟۟۠;->ۥۣ۟۟۠:I

    :cond_4
    iget p2, v2, LYue/ۥۡۦۢۥ$ۥ۟۟۟۠;->ۥۣ۟۟۠:I

    add-int/2addr p2, v3

    iput p2, v2, LYue/ۥۡۦۢۥ$ۥ۟۟۟۠;->ۥۣ۟۟۠:I

    move-object p2, v5

    goto :goto_1

    :cond_5
    sget-object p0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/4 p0, 0x0

    invoke-static {p1, p0}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    iget p0, v4, LYue/ۥۡۦۢۥ$ۥ۟۟۟۠;->ۥۣ۟۟۠:I

    invoke-static {p0}, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟۠(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :catchall_1
    move-exception p1

    move-object v6, p1

    move-object p1, p0

    move-object p0, v6

    :goto_3
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    move-exception p2

    invoke-static {p1, p0}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public static final synthetic ۥ۟۟ۡۢ(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 7
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Binary compatibility"
    .end annotation

    instance-of v0, p1, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۦ;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۦ;

    iget v1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۦ;->ۥ۟۟۠ۧ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۦ;->ۥ۟۟۠ۧ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۦ;

    invoke-direct {v0, p1}, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۦ;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۦ;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۦ;->ۥ۟۟۠ۧ:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۦ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    iget-object v2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۦ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast v2, LYue/ۥ۟ۤۡۧ;

    iget-object v4, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۦ;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast v4, LYue/ۥۡۦۡۡ;

    :try_start_0
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p0

    move-object v2, v4

    goto/16 :goto_4

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p0, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۦ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast p0, LYue/ۥ۟ۤۡۧ;

    iget-object v2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۦ;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast v2, LYue/ۥۡۦۡۡ;

    :try_start_1
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p0

    goto :goto_4

    :cond_3
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    :try_start_2
    invoke-interface {p0}, LYue/ۥۡۦۡۡ;->iterator()LYue/ۥ۟ۤۡۧ;

    move-result-object p1

    iput-object p0, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۦ;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput-object p1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۦ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput v4, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۦ;->ۥ۟۟۠ۧ:I

    invoke-interface {p1, v0}, LYue/ۥ۟ۤۡۧ;->ۥ۟(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-ne v2, v1, :cond_4

    return-object v1

    :cond_4
    move-object v6, v2

    move-object v2, p0

    move-object p0, p1

    move-object p1, v6

    :goto_1
    :try_start_3
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-nez p1, :cond_5

    invoke-static {v2, v5}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    return-object v5

    :cond_5
    :try_start_4
    invoke-interface {p0}, LYue/ۥ۟ۤۡۧ;->next()Ljava/lang/Object;

    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    move-object v6, v2

    move-object v2, p0

    move-object p0, v6

    :goto_2
    :try_start_5
    iput-object p0, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۦ;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput-object v2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۦ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput-object p1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۦ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    iput v3, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۦ;->ۥ۟۟۠ۧ:I

    invoke-interface {v2, v0}, LYue/ۥ۟ۤۡۧ;->ۥ۟(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    if-ne v4, v1, :cond_6

    return-object v1

    :cond_6
    move-object v6, v4

    move-object v4, p0

    move-object p0, p1

    move-object p1, v6

    :goto_3
    :try_start_6
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-interface {v2}, LYue/ۥ۟ۤۡۧ;->next()Ljava/lang/Object;

    move-result-object p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    move-object p0, v4

    goto :goto_2

    :cond_7
    invoke-static {v4, v5}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    return-object p0

    :catchall_2
    move-exception p1

    move-object v2, p0

    move-object p0, p1

    :goto_4
    :try_start_7
    throw p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    :catchall_3
    move-exception p1

    invoke-static {v2, p0}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static final ۥۣ۟۟ۡ(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠ۢۢ;)LYue/ۥۡۦۡۡ;
    .locals 8
    .param p0    # LYue/ۥۡۦۡۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۠ۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۡۥۤ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e6\u06e1\u06e1<",
            "+TE;>;",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-TE;-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;)",
            "LYue/\u06e5\u06e1\u06e6\u06e1\u06e1<",
            "TR;>;"
        }
    .end annotation

    sget-object v0, LYue/ۥۣ۠ۦ;->ۥۣ۟۟۠:LYue/ۥۣ۠ۦ;

    invoke-static {p0}, LYue/ۥ۟ۤۢ۠;->ۥ۟۟۟ۡ(LYue/ۥۡۦۡۡ;)LYue/ۥۣ۠ۡ۟;

    move-result-object v4

    new-instance v5, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۧ;

    const/4 v1, 0x0

    invoke-direct {v5, p0, p2, v1}, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۧ;-><init>(LYue/ۥۡۦۡۡ;LYue/ۥۣ۠ۢۢ;LYue/ۥ۟ۧۤۢ;)V

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p1

    invoke-static/range {v0 .. v7}, LYue/ۥۡۥۡۢ;->ۥ۟۟۟ۡ(LYue/ۥ۟ۧۧۥ;LYue/ۥ۟ۧۦۥ;ILYue/ۥ۟ۧۨ;LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۢۢ;ILjava/lang/Object;)LYue/ۥۡۦۡۡ;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۥ۟۟ۡۤ(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠ۢۢ;ILjava/lang/Object;)LYue/ۥۡۦۡۡ;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    invoke-static {}, LYue/ۥ۠۟ۢۦ;->ۥ۟۟۟ۡ()LYue/ۥ۟ۧۦۨ;

    move-result-object p1

    :cond_0
    invoke-static {p0, p1, p2}, LYue/ۥ۟ۤۢ۠;->ۥ۟۟ۡۨ(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠ۢۢ;)LYue/ۥۡۦۡۡ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟ۡۥ(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠ۢۤ;)LYue/ۥۡۦۡۡ;
    .locals 8
    .param p0    # LYue/ۥۡۦۡۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۠ۢۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۡۥۤ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e6\u06e1\u06e1<",
            "+TE;>;",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e4<",
            "-",
            "Ljava/lang/Integer;",
            "-TE;-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;)",
            "LYue/\u06e5\u06e1\u06e6\u06e1\u06e1<",
            "TR;>;"
        }
    .end annotation

    sget-object v0, LYue/ۥۣ۠ۦ;->ۥۣ۟۟۠:LYue/ۥۣ۠ۦ;

    invoke-static {p0}, LYue/ۥ۟ۤۢ۠;->ۥ۟۟۟ۡ(LYue/ۥۡۦۡۡ;)LYue/ۥۣ۠ۡ۟;

    move-result-object v4

    new-instance v5, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۨ;

    const/4 v1, 0x0

    invoke-direct {v5, p0, p2, v1}, LYue/ۥۣ۟ۤۢ$ۥ۟۟۠ۨ;-><init>(LYue/ۥۡۦۡۡ;LYue/ۥۣ۠ۢۤ;LYue/ۥ۟ۧۤۢ;)V

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p1

    invoke-static/range {v0 .. v7}, LYue/ۥۡۥۡۢ;->ۥ۟۟۟ۡ(LYue/ۥ۟ۧۧۥ;LYue/ۥ۟ۧۦۥ;ILYue/ۥ۟ۧۨ;LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۢۢ;ILjava/lang/Object;)LYue/ۥۡۦۡۡ;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۥ۟۟ۡۦ(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠ۢۤ;ILjava/lang/Object;)LYue/ۥۡۦۡۡ;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    invoke-static {}, LYue/ۥ۠۟ۢۦ;->ۥ۟۟۟ۡ()LYue/ۥ۟ۧۦۨ;

    move-result-object p1

    :cond_0
    invoke-static {p0, p1, p2}, LYue/ۥ۟ۤۢ۠;->ۥ۟۟ۢ۟(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠ۢۤ;)LYue/ۥۡۦۡۡ;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic ۥ۟۟ۡۧ(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠ۢۤ;)LYue/ۥۡۦۡۡ;
    .locals 0
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Binary compatibility"
    .end annotation

    invoke-static {p0, p1, p2}, LYue/ۥ۟ۤۢ۠;->ۥ۟۟ۢ۟(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠ۢۤ;)LYue/ۥۡۦۡۡ;

    move-result-object p0

    invoke-static {p0}, LYue/ۥ۟ۤۢ۠;->ۥ۟۟۠ۨ(LYue/ۥۡۦۡۡ;)LYue/ۥۡۦۡۡ;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۥ۟۟ۡۨ(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠ۢۤ;ILjava/lang/Object;)LYue/ۥۡۦۡۡ;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    invoke-static {}, LYue/ۥ۠۟ۢۦ;->ۥ۟۟۟ۡ()LYue/ۥ۟ۧۦۨ;

    move-result-object p1

    :cond_0
    invoke-static {p0, p1, p2}, LYue/ۥ۟ۤۢ۠;->ۥ۟۟ۢۡ(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠ۢۤ;)LYue/ۥۡۦۡۡ;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic ۥ۟۟ۢ(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠ۢۢ;)LYue/ۥۡۦۡۡ;
    .locals 0
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Binary compatibility"
    .end annotation

    invoke-static {p0, p1, p2}, LYue/ۥ۟ۤۢ۠;->ۥ۟۟ۡۨ(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠ۢۢ;)LYue/ۥۡۦۡۡ;

    move-result-object p0

    invoke-static {p0}, LYue/ۥ۟ۤۢ۠;->ۥ۟۟۠ۨ(LYue/ۥۡۦۡۡ;)LYue/ۥۡۦۡۡ;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۥ۟۟ۢ۟(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠ۢۢ;ILjava/lang/Object;)LYue/ۥۡۦۡۡ;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    invoke-static {}, LYue/ۥ۠۟ۢۦ;->ۥ۟۟۟ۡ()LYue/ۥ۟ۧۦۨ;

    move-result-object p1

    :cond_0
    invoke-static {p0, p1, p2}, LYue/ۥ۟ۤۢ۠;->ۥۣ۟۟ۢ(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠ۢۢ;)LYue/ۥۡۦۡۡ;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic ۥ۟۟ۢ۠(LYue/ۥۡۦۡۡ;Ljava/util/Comparator;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 8
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Binary compatibility"
    .end annotation

    instance-of v0, p2, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ;

    iget v1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ;->ۥ۟۟۠ۨ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ;->ۥ۟۟۠ۨ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ;

    invoke-direct {v0, p2}, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ;->ۥ۟۟۠ۨ:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    iget-object p1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    check-cast p1, LYue/ۥ۟ۤۡۧ;

    iget-object v2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast v2, LYue/ۥۡۦۡۡ;

    iget-object v4, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast v4, Ljava/util/Comparator;

    :try_start_0
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v7, v0

    move-object v0, p0

    move-object p0, v2

    :goto_1
    move-object v2, v7

    goto/16 :goto_4

    :catchall_0
    move-exception p0

    move-object p1, v2

    goto/16 :goto_6

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p0, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    check-cast p0, LYue/ۥ۟ۤۡۧ;

    iget-object p1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast p1, LYue/ۥۡۦۡۡ;

    iget-object v2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast v2, Ljava/util/Comparator;

    :try_start_1
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p0

    goto/16 :goto_6

    :cond_3
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    :try_start_2
    invoke-interface {p0}, LYue/ۥۡۦۡۡ;->iterator()LYue/ۥ۟ۤۡۧ;

    move-result-object p2

    iput-object p1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput-object p0, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput-object p2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    iput v4, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ;->ۥ۟۟۠ۨ:I

    invoke-interface {p2, v0}, LYue/ۥ۟ۤۡۧ;->ۥ۟(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-ne v2, v1, :cond_4

    return-object v1

    :cond_4
    move-object v7, p1

    move-object p1, p0

    move-object p0, p2

    move-object p2, v2

    move-object v2, v7

    :goto_2
    :try_start_3
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-nez p2, :cond_5

    invoke-static {p1, v5}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    return-object v5

    :cond_5
    :try_start_4
    invoke-interface {p0}, LYue/ۥ۟ۤۡۧ;->next()Ljava/lang/Object;

    move-result-object p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    move-object v4, v2

    move-object v7, p1

    move-object p1, p0

    move-object p0, v7

    :goto_3
    :try_start_5
    iput-object v4, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput-object p0, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput-object p1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    iput-object p2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    iput v3, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ;->ۥ۟۟۠ۨ:I

    invoke-interface {p1, v0}, LYue/ۥ۟ۤۡۧ;->ۥ۟(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_6

    return-object v1

    :cond_6
    move-object v7, v0

    move-object v0, p2

    move-object p2, v2

    goto :goto_1

    :goto_4
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_8

    invoke-interface {p1}, LYue/ۥ۟ۤۡۧ;->next()Ljava/lang/Object;

    move-result-object p2

    invoke-interface {v4, v0, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v6
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    if-gez v6, :cond_7

    :goto_5
    move-object v0, v2

    goto :goto_3

    :cond_7
    move-object p2, v0

    goto :goto_5

    :catchall_2
    move-exception p1

    move-object v7, p1

    move-object p1, p0

    move-object p0, v7

    goto :goto_6

    :cond_8
    invoke-static {p0, v5}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    return-object v0

    :goto_6
    :try_start_6
    throw p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :catchall_3
    move-exception p2

    invoke-static {p1, p0}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public static final synthetic ۥ۟۟ۢۡ(LYue/ۥۡۦۡۡ;Ljava/util/Comparator;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 8
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Binary compatibility"
    .end annotation

    instance-of v0, p2, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ۟;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ۟;

    iget v1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ۟;->ۥ۟۟۠ۨ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ۟;->ۥ۟۟۠ۨ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ۟;

    invoke-direct {v0, p2}, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ۟;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ۟;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ۟;->ۥ۟۟۠ۨ:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ۟;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    iget-object p1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ۟;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    check-cast p1, LYue/ۥ۟ۤۡۧ;

    iget-object v2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast v2, LYue/ۥۡۦۡۡ;

    iget-object v4, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ۟;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast v4, Ljava/util/Comparator;

    :try_start_0
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v7, v0

    move-object v0, p0

    move-object p0, v2

    :goto_1
    move-object v2, v7

    goto/16 :goto_4

    :catchall_0
    move-exception p0

    move-object p1, v2

    goto/16 :goto_6

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p0, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ۟;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    check-cast p0, LYue/ۥ۟ۤۡۧ;

    iget-object p1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast p1, LYue/ۥۡۦۡۡ;

    iget-object v2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ۟;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast v2, Ljava/util/Comparator;

    :try_start_1
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p0

    goto/16 :goto_6

    :cond_3
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    :try_start_2
    invoke-interface {p0}, LYue/ۥۡۦۡۡ;->iterator()LYue/ۥ۟ۤۡۧ;

    move-result-object p2

    iput-object p1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ۟;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput-object p0, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput-object p2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ۟;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    iput v4, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ۟;->ۥ۟۟۠ۨ:I

    invoke-interface {p2, v0}, LYue/ۥ۟ۤۡۧ;->ۥ۟(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-ne v2, v1, :cond_4

    return-object v1

    :cond_4
    move-object v7, p1

    move-object p1, p0

    move-object p0, p2

    move-object p2, v2

    move-object v2, v7

    :goto_2
    :try_start_3
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-nez p2, :cond_5

    invoke-static {p1, v5}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    return-object v5

    :cond_5
    :try_start_4
    invoke-interface {p0}, LYue/ۥ۟ۤۡۧ;->next()Ljava/lang/Object;

    move-result-object p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    move-object v4, v2

    move-object v7, p1

    move-object p1, p0

    move-object p0, v7

    :goto_3
    :try_start_5
    iput-object v4, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ۟;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput-object p0, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput-object p1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ۟;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    iput-object p2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ۟;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    iput v3, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ۟;->ۥ۟۟۠ۨ:I

    invoke-interface {p1, v0}, LYue/ۥ۟ۤۡۧ;->ۥ۟(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_6

    return-object v1

    :cond_6
    move-object v7, v0

    move-object v0, p2

    move-object p2, v2

    goto :goto_1

    :goto_4
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_8

    invoke-interface {p1}, LYue/ۥ۟ۤۡۧ;->next()Ljava/lang/Object;

    move-result-object p2

    invoke-interface {v4, v0, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v6
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    if-lez v6, :cond_7

    :goto_5
    move-object v0, v2

    goto :goto_3

    :cond_7
    move-object p2, v0

    goto :goto_5

    :catchall_2
    move-exception p1

    move-object v7, p1

    move-object p1, p0

    move-object p0, v7

    goto :goto_6

    :cond_8
    invoke-static {p0, v5}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    return-object v0

    :goto_6
    :try_start_6
    throw p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :catchall_3
    move-exception p2

    invoke-static {p1, p0}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public static final synthetic ۥ۟۟ۢۢ(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 4
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Binary compatibility"
    .end annotation

    instance-of v0, p1, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ۠;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ۠;

    iget v1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ۠;->ۥ۟۟۠ۥ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ۠;->ۥ۟۟۠ۥ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ۠;

    invoke-direct {v0, p1}, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ۠;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ۠;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ۠;->ۥ۟۟۠ۥ:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ۠;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast p0, LYue/ۥۡۦۡۡ;

    :try_start_0
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    :try_start_1
    invoke-interface {p0}, LYue/ۥۡۦۡۡ;->iterator()LYue/ۥ۟ۤۡۧ;

    move-result-object p1

    iput-object p0, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ۠;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput v3, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡ۠;->ۥ۟۟۠ۥ:I

    invoke-interface {p1, v0}, LYue/ۥ۟ۤۡۧ;->ۥ۟(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    xor-int/2addr p1, v3

    invoke-static {p1}, LYue/ۥۣ۟ۢ۟;->ۥ(Z)Ljava/lang/Boolean;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v0, 0x0

    invoke-static {p0, v0}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    return-object p1

    :goto_2
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {p0, p1}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static final synthetic ۥۣ۟۟ۢ(LYue/ۥۡۦۡۡ;)LYue/ۥۡۦۡۡ;
    .locals 3
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Left for binary compatibility"
    .end annotation

    new-instance v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۡ;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۡ;-><init>(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۤۢ;)V

    const/4 v2, 0x1

    invoke-static {p0, v1, v0, v2, v1}, LYue/ۥ۟ۤۢ۠;->ۥ۟۟ۢ(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠ۢۢ;ILjava/lang/Object;)LYue/ۥۡۦۡۡ;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic ۥ۟۟ۢۤ(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 6
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Binary compatibility"
    .end annotation

    instance-of v0, p1, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۢ;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۢ;

    iget v1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۢ;->ۥ۟۟۠ۦ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۢ;->ۥ۟۟۠ۦ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۢ;

    invoke-direct {v0, p1}, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۢ;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۢ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۢ;->ۥ۟۟۠ۦ:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۢ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iget-object v0, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۢ;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast v0, LYue/ۥۡۦۡۡ;

    :try_start_0
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p0

    move-object v2, v0

    goto/16 :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p0, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۢ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast p0, LYue/ۥ۟ۤۡۧ;

    iget-object v2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۢ;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast v2, LYue/ۥۡۦۡۡ;

    :try_start_1
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p0

    goto :goto_3

    :cond_3
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    :try_start_2
    invoke-interface {p0}, LYue/ۥۡۦۡۡ;->iterator()LYue/ۥ۟ۤۡۧ;

    move-result-object p1

    iput-object p0, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۢ;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput-object p1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۢ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput v4, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۢ;->ۥ۟۟۠ۦ:I

    invoke-interface {p1, v0}, LYue/ۥ۟ۤۡۧ;->ۥ۟(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-ne v2, v1, :cond_4

    return-object v1

    :cond_4
    move-object v5, v2

    move-object v2, p0

    move-object p0, p1

    move-object p1, v5

    :goto_1
    :try_start_3
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-interface {p0}, LYue/ۥ۟ۤۡۧ;->next()Ljava/lang/Object;

    move-result-object p1

    iput-object v2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۢ;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput-object p1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۢ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput v3, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۢ;->ۥ۟۟۠ۦ:I

    invoke-interface {p0, v0}, LYue/ۥ۟ۤۡۧ;->ۥ۟(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-ne p0, v1, :cond_5

    return-object v1

    :cond_5
    move-object v0, v2

    move-object v5, p1

    move-object p1, p0

    move-object p0, v5

    :goto_2
    :try_start_4
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-nez p1, :cond_6

    const/4 p1, 0x0

    invoke-static {v0, p1}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    return-object p0

    :cond_6
    :try_start_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "ReceiveChannel has more than one element."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :cond_7
    :try_start_6
    new-instance p0, Ljava/util/NoSuchElementException;

    const-string p1, "ReceiveChannel is empty."

    invoke-direct {p0, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :catchall_2
    move-exception p1

    move-object v2, p0

    move-object p0, p1

    :goto_3
    :try_start_7
    throw p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    :catchall_3
    move-exception p1

    invoke-static {v2, p0}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static final synthetic ۥ۟۟ۢۥ(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 7
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Binary compatibility"
    .end annotation

    instance-of v0, p1, LYue/ۥۣ۟ۤۢ$ۥۣ۟۟ۡ;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LYue/ۥۣ۟ۤۢ$ۥۣ۟۟ۡ;

    iget v1, v0, LYue/ۥۣ۟ۤۢ$ۥۣ۟۟ۡ;->ۥ۟۟۠ۦ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥۣ۟ۤۢ$ۥۣ۟۟ۡ;->ۥ۟۟۠ۦ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥۣ۟ۤۢ$ۥۣ۟۟ۡ;

    invoke-direct {v0, p1}, LYue/ۥۣ۟ۤۢ$ۥۣ۟۟ۡ;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p1, v0, LYue/ۥۣ۟ۤۢ$ۥۣ۟۟ۡ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥۣ۟ۤۢ$ۥۣ۟۟ۡ;->ۥ۟۟۠ۦ:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LYue/ۥۣ۟ۤۢ$ۥۣ۟۟ۡ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iget-object v0, v0, LYue/ۥۣ۟ۤۢ$ۥۣ۟۟ۡ;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast v0, LYue/ۥۡۦۡۡ;

    :try_start_0
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p0

    move-object v2, v0

    goto/16 :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p0, v0, LYue/ۥۣ۟ۤۢ$ۥۣ۟۟ۡ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast p0, LYue/ۥ۟ۤۡۧ;

    iget-object v2, v0, LYue/ۥۣ۟ۤۢ$ۥۣ۟۟ۡ;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast v2, LYue/ۥۡۦۡۡ;

    :try_start_1
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p0

    goto :goto_3

    :cond_3
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    :try_start_2
    invoke-interface {p0}, LYue/ۥۡۦۡۡ;->iterator()LYue/ۥ۟ۤۡۧ;

    move-result-object p1

    iput-object p0, v0, LYue/ۥۣ۟ۤۢ$ۥۣ۟۟ۡ;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput-object p1, v0, LYue/ۥۣ۟ۤۢ$ۥۣ۟۟ۡ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput v4, v0, LYue/ۥۣ۟ۤۢ$ۥۣ۟۟ۡ;->ۥ۟۟۠ۦ:I

    invoke-interface {p1, v0}, LYue/ۥ۟ۤۡۧ;->ۥ۟(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-ne v2, v1, :cond_4

    return-object v1

    :cond_4
    move-object v6, v2

    move-object v2, p0

    move-object p0, p1

    move-object p1, v6

    :goto_1
    :try_start_3
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-nez p1, :cond_5

    invoke-static {v2, v5}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    return-object v5

    :cond_5
    :try_start_4
    invoke-interface {p0}, LYue/ۥ۟ۤۡۧ;->next()Ljava/lang/Object;

    move-result-object p1

    iput-object v2, v0, LYue/ۥۣ۟ۤۢ$ۥۣ۟۟ۡ;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput-object p1, v0, LYue/ۥۣ۟ۤۢ$ۥۣ۟۟ۡ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput v3, v0, LYue/ۥۣ۟ۤۢ$ۥۣ۟۟ۡ;->ۥ۟۟۠ۦ:I

    invoke-interface {p0, v0}, LYue/ۥ۟ۤۡۧ;->ۥ۟(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    if-ne p0, v1, :cond_6

    return-object v1

    :cond_6
    move-object v0, v2

    move-object v6, p1

    move-object p1, p0

    move-object p0, v6

    :goto_2
    :try_start_5
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-eqz p1, :cond_7

    invoke-static {v0, v5}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    return-object v5

    :cond_7
    invoke-static {v0, v5}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    return-object p0

    :catchall_2
    move-exception p1

    move-object v2, p0

    move-object p0, p1

    :goto_3
    :try_start_6
    throw p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :catchall_3
    move-exception p1

    invoke-static {v2, p0}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static final synthetic ۥ۟۟ۢۦ(LYue/ۥۡۦۡۡ;ILYue/ۥ۟ۧۦۥ;)LYue/ۥۡۦۡۡ;
    .locals 8
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Binary compatibility"
    .end annotation

    sget-object v0, LYue/ۥۣ۠ۦ;->ۥۣ۟۟۠:LYue/ۥۣ۠ۦ;

    invoke-static {p0}, LYue/ۥ۟ۤۢ۠;->ۥ۟۟۟ۡ(LYue/ۥۡۦۡۡ;)LYue/ۥۣ۠ۡ۟;

    move-result-object v4

    new-instance v5, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۤ;

    const/4 v1, 0x0

    invoke-direct {v5, p1, p0, v1}, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۤ;-><init>(ILYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۤۢ;)V

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p2

    invoke-static/range {v0 .. v7}, LYue/ۥۡۥۡۢ;->ۥ۟۟۟ۡ(LYue/ۥ۟ۧۧۥ;LYue/ۥ۟ۧۦۥ;ILYue/ۥ۟ۧۨ;LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۢۢ;ILjava/lang/Object;)LYue/ۥۡۦۡۡ;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۥ۟۟ۢۧ(LYue/ۥۡۦۡۡ;ILYue/ۥ۟ۧۦۥ;ILjava/lang/Object;)LYue/ۥۡۦۡۡ;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    invoke-static {}, LYue/ۥ۠۟ۢۦ;->ۥ۟۟۟ۡ()LYue/ۥ۟ۧۦۨ;

    move-result-object p2

    :cond_0
    invoke-static {p0, p1, p2}, LYue/ۥ۟ۤۢ۠;->ۥۣۣ۟۟(LYue/ۥۡۦۡۡ;ILYue/ۥ۟ۧۦۥ;)LYue/ۥۡۦۡۡ;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic ۥ۟۟ۢۨ(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠ۢۢ;)LYue/ۥۡۦۡۡ;
    .locals 8
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Binary compatibility"
    .end annotation

    sget-object v0, LYue/ۥۣ۠ۦ;->ۥۣ۟۟۠:LYue/ۥۣ۠ۦ;

    invoke-static {p0}, LYue/ۥ۟ۤۢ۠;->ۥ۟۟۟ۡ(LYue/ۥۡۦۡۡ;)LYue/ۥۣ۠ۡ۟;

    move-result-object v4

    new-instance v5, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۥ;

    const/4 v1, 0x0

    invoke-direct {v5, p0, p2, v1}, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۥ;-><init>(LYue/ۥۡۦۡۡ;LYue/ۥۣ۠ۢۢ;LYue/ۥ۟ۧۤۢ;)V

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p1

    invoke-static/range {v0 .. v7}, LYue/ۥۡۥۡۢ;->ۥ۟۟۟ۡ(LYue/ۥ۟ۧۧۥ;LYue/ۥ۟ۧۦۥ;ILYue/ۥ۟ۧۨ;LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۢۢ;ILjava/lang/Object;)LYue/ۥۡۦۡۡ;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۥۣ۟۟(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠ۢۢ;ILjava/lang/Object;)LYue/ۥۡۦۡۡ;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    invoke-static {}, LYue/ۥ۠۟ۢۦ;->ۥ۟۟۟ۡ()LYue/ۥ۟ۧۦۨ;

    move-result-object p1

    :cond_0
    invoke-static {p0, p1, p2}, LYue/ۥ۟ۤۢ۠;->ۥۣ۟۟ۥ(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠ۢۢ;)LYue/ۥۡۦۡۡ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥۣ۟۟۟(LYue/ۥۡۦۡۡ;LYue/ۥۡۨۡ۠;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 6
    .param p0    # LYue/ۥۡۦۡۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۡۨۡ۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation build LYue/ۥۡۥۤ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            "C::",
            "LYue/\u06e5\u06e1\u06e8\u06e1\u06e0<",
            "-TE;>;>(",
            "LYue/\u06e5\u06e1\u06e6\u06e1\u06e1<",
            "+TE;>;TC;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TC;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۦ;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۦ;

    iget v1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۦ;->ۥ۟۟۠ۧ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۦ;->ۥ۟۟۠ۧ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۦ;

    invoke-direct {v0, p2}, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۦ;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۦ;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۦ;->ۥ۟۟۠ۧ:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v4, :cond_3

    if-ne v2, v3, :cond_2

    iget-object p0, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۦ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    check-cast p0, LYue/ۥ۟ۤۡۧ;

    iget-object p1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۦ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast p1, LYue/ۥۡۦۡۡ;

    iget-object v2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۦ;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast v2, LYue/ۥۡۨۡ۠;

    :try_start_0
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    move-object p2, p0

    move-object p0, p1

    move-object p1, v2

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_3

    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    iget-object p0, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۦ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    check-cast p0, LYue/ۥ۟ۤۡۧ;

    iget-object p1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۦ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast p1, LYue/ۥۡۦۡۡ;

    iget-object v2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۦ;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast v2, LYue/ۥۡۨۡ۠;

    :try_start_1
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :cond_4
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    :try_start_2
    invoke-interface {p0}, LYue/ۥۡۦۡۡ;->iterator()LYue/ۥ۟ۤۡۧ;

    move-result-object p2

    :goto_1
    iput-object p1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۦ;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput-object p0, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۦ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput-object p2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۦ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    iput v4, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۦ;->ۥ۟۟۠ۧ:I

    invoke-interface {p2, v0}, LYue/ۥ۟ۤۡۧ;->ۥ۟(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-ne v2, v1, :cond_5

    return-object v1

    :cond_5
    move-object v5, p1

    move-object p1, p0

    move-object p0, p2

    move-object p2, v2

    move-object v2, v5

    :goto_2
    :try_start_3
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-interface {p0}, LYue/ۥ۟ۤۡۧ;->next()Ljava/lang/Object;

    move-result-object p2

    iput-object v2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۦ;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput-object p1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۦ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput-object p0, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۦ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    iput v3, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۦ;->ۥ۟۟۠ۧ:I

    invoke-interface {v2, p2, v0}, LYue/ۥۡۨۡ۠;->ۥ۟۟۟۠(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_1

    return-object v1

    :cond_6
    sget-object p0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    const/4 p0, 0x0

    invoke-static {p1, p0}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    return-object v2

    :catchall_1
    move-exception p1

    move-object v5, p1

    move-object p1, p0

    move-object p0, v5

    :goto_3
    :try_start_4
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception p2

    invoke-static {p1, p0}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public static final ۥۣ۟۟۠(LYue/ۥۡۦۡۡ;Ljava/util/Collection;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 5
    .param p0    # LYue/ۥۡۦۡۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Ljava/util/Collection;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation build LYue/ۥۡۥۤ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            "C::",
            "Ljava/util/Collection<",
            "-TE;>;>(",
            "LYue/\u06e5\u06e1\u06e6\u06e1\u06e1<",
            "+TE;>;TC;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TC;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۧ;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۧ;

    iget v1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۧ;->ۥ۟۟۠ۧ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۧ;->ۥ۟۟۠ۧ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۧ;

    invoke-direct {v0, p2}, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۧ;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۧ;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۧ;->ۥ۟۟۠ۧ:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۧ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    check-cast p0, LYue/ۥ۟ۤۡۧ;

    iget-object p1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۧ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast p1, LYue/ۥۡۦۡۡ;

    iget-object v2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۧ;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast v2, Ljava/util/Collection;

    :try_start_0
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p0

    goto :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    :try_start_1
    invoke-interface {p0}, LYue/ۥۡۦۡۡ;->iterator()LYue/ۥ۟ۤۡۧ;

    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v4, p1

    move-object p1, p0

    move-object p0, p2

    move-object p2, v4

    :goto_1
    :try_start_2
    iput-object p2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۧ;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput-object p1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۧ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput-object p0, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۧ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    iput v3, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۧ;->ۥ۟۟۠ۧ:I

    invoke-interface {p0, v0}, LYue/ۥ۟ۤۡۧ;->ۥ۟(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_3

    return-object v1

    :cond_3
    move-object v4, v2

    move-object v2, p2

    move-object p2, v4

    :goto_2
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p0}, LYue/ۥ۟ۤۡۧ;->next()Ljava/lang/Object;

    move-result-object p2

    invoke-interface {v2, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object p2, v2

    goto :goto_1

    :cond_4
    sget-object p0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/4 p0, 0x0

    invoke-static {p1, p0}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    return-object v2

    :catchall_1
    move-exception p1

    move-object v4, p1

    move-object p1, p0

    move-object p0, v4

    :goto_3
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    move-exception p2

    invoke-static {p1, p0}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public static final synthetic ۥۣ۟۟ۡ(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Binary compatibility"
    .end annotation

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-static {p0, v0, p1}, LYue/ۥ۟ۤۢ۠;->ۥ۟۟ۤ۠(LYue/ۥۡۦۡۡ;Ljava/util/Map;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥۣ۟۟ۢ(LYue/ۥۡۦۡۡ;Ljava/util/Map;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 6
    .param p0    # LYue/ۥۡۦۡۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Ljava/util/Map;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation build LYue/ۥۡۥۤ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            "M::",
            "Ljava/util/Map<",
            "-TK;-TV;>;>(",
            "LYue/\u06e5\u06e1\u06e6\u06e1\u06e1<",
            "+",
            "LYue/\u06e5\u06e1\u06e3\u06e6\u06e0<",
            "+TK;+TV;>;>;TM;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TM;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۨ;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۨ;

    iget v1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۨ;->ۥ۟۟۠ۧ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۨ;->ۥ۟۟۠ۧ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۨ;

    invoke-direct {v0, p2}, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۨ;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۨ;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۨ;->ۥ۟۟۠ۧ:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۨ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    check-cast p0, LYue/ۥ۟ۤۡۧ;

    iget-object p1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۨ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast p1, LYue/ۥۡۦۡۡ;

    iget-object v2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۨ;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast v2, Ljava/util/Map;

    :try_start_0
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p0

    goto :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    :try_start_1
    invoke-interface {p0}, LYue/ۥۡۦۡۡ;->iterator()LYue/ۥ۟ۤۡۧ;

    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v5, p1

    move-object p1, p0

    move-object p0, p2

    move-object p2, v5

    :goto_1
    :try_start_2
    iput-object p2, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۨ;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput-object p1, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۨ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput-object p0, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۨ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    iput v3, v0, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۡۨ;->ۥ۟۟۠ۧ:I

    invoke-interface {p0, v0}, LYue/ۥ۟ۤۡۧ;->ۥ۟(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_3

    return-object v1

    :cond_3
    move-object v5, v2

    move-object v2, p2

    move-object p2, v5

    :goto_2
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p0}, LYue/ۥ۟ۤۡۧ;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LYue/ۥۣۡۦ۠;

    invoke-virtual {p2}, LYue/ۥۣۡۦ۠;->ۥ۟۟۟۟()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p2}, LYue/ۥۣۡۦ۠;->ۥ۟۟۟۠()Ljava/lang/Object;

    move-result-object p2

    invoke-interface {v2, v4, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object p2, v2

    goto :goto_1

    :cond_4
    sget-object p0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/4 p0, 0x0

    invoke-static {p1, p0}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    return-object v2

    :catchall_1
    move-exception p1

    move-object v5, p1

    move-object p1, p0

    move-object p0, v5

    :goto_3
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    move-exception p2

    invoke-static {p1, p0}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public static final synthetic ۥۣۣ۟۟(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Binary compatibility"
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p0, v0, p1}, LYue/ۥ۟ۤۢ۠;->ۥۣ۟۟ۨ(LYue/ۥۡۦۡۡ;Ljava/util/Collection;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥۣ۟۟ۤ(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 1
    .param p0    # LYue/ۥۡۦۡۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation build LYue/ۥۡۥۤ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e6\u06e1\u06e1<",
            "+TE;>;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "Ljava/util/Set<",
            "TE;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-static {p0, v0, p1}, LYue/ۥ۟ۤۢ۠;->ۥۣ۟۟ۨ(LYue/ۥۡۦۡۡ;Ljava/util/Collection;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic ۥۣ۟۟ۥ(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 0
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Binary compatibility"
    .end annotation

    invoke-static {p0, p1}, LYue/ۥ۟ۤۢ۠;->ۥ۟۟ۤۢ(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic ۥۣ۟۟ۦ(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۦۥ;)LYue/ۥۡۦۡۡ;
    .locals 8
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Binary compatibility"
    .end annotation

    sget-object v0, LYue/ۥۣ۠ۦ;->ۥۣ۟۟۠:LYue/ۥۣ۠ۦ;

    invoke-static {p0}, LYue/ۥ۟ۤۢ۠;->ۥ۟۟۟ۡ(LYue/ۥۡۦۡۡ;)LYue/ۥۣ۠ۡ۟;

    move-result-object v4

    new-instance v5, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۢ;

    const/4 v1, 0x0

    invoke-direct {v5, p0, v1}, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۢ;-><init>(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۤۢ;)V

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p1

    invoke-static/range {v0 .. v7}, LYue/ۥۡۥۡۢ;->ۥ۟۟۟ۡ(LYue/ۥ۟ۧۧۥ;LYue/ۥ۟ۧۦۥ;ILYue/ۥ۟ۧۨ;LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۢۢ;ILjava/lang/Object;)LYue/ۥۡۦۡۡ;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۥۣ۟۟ۧ(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۦۥ;ILjava/lang/Object;)LYue/ۥۡۦۡۡ;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    invoke-static {}, LYue/ۥ۠۟ۢۦ;->ۥ۟۟۟ۡ()LYue/ۥ۟ۧۦۨ;

    move-result-object p1

    :cond_0
    invoke-static {p0, p1}, LYue/ۥ۟ۤۢ۠;->ۥ۟۟ۤۥ(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۦۥ;)LYue/ۥۡۦۡۡ;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic ۥۣ۟۟ۨ(LYue/ۥۡۦۡۡ;LYue/ۥۡۦۡۡ;)LYue/ۥۡۦۡۡ;
    .locals 6
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Binary compatibility"
    .end annotation

    sget-object v3, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۢ۟;->ۥۣ۟۟۠:LYue/ۥۣ۟ۤۢ$ۥ۟۟ۢ۟;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v5}, LYue/ۥ۟ۤۢ۠;->ۥ۟۟ۥ(LYue/ۥۡۦۡۡ;LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠ۢۢ;ILjava/lang/Object;)LYue/ۥۡۦۡۡ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟ۤ(LYue/ۥۡۦۡۡ;LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠ۢۢ;)LYue/ۥۡۦۡۡ;
    .locals 8
    .param p0    # LYue/ۥۡۦۡۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۡۦۡۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥۣ۠ۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۡۥۤ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e6\u06e1\u06e1<",
            "+TE;>;",
            "LYue/\u06e5\u06e1\u06e6\u06e1\u06e1<",
            "+TR;>;",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-TE;-TR;+TV;>;)",
            "LYue/\u06e5\u06e1\u06e6\u06e1\u06e1<",
            "TV;>;"
        }
    .end annotation

    sget-object v0, LYue/ۥۣ۠ۦ;->ۥۣ۟۟۠:LYue/ۥۣ۠ۦ;

    const/4 v1, 0x2

    new-array v1, v1, [LYue/ۥۡۦۡۡ;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v1}, LYue/ۥ۟ۤۢ۠;->ۥ۟۟۟ۢ([LYue/ۥۡۦۡۡ;)LYue/ۥۣ۠ۡ۟;

    move-result-object v4

    new-instance v5, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۢ۠;

    const/4 v1, 0x0

    invoke-direct {v5, p1, p0, p3, v1}, LYue/ۥۣ۟ۤۢ$ۥ۟۟ۢ۠;-><init>(LYue/ۥۡۦۡۡ;LYue/ۥۡۦۡۡ;LYue/ۥۣ۠ۢۢ;LYue/ۥ۟ۧۤۢ;)V

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p2

    invoke-static/range {v0 .. v7}, LYue/ۥۡۥۡۢ;->ۥ۟۟۟ۡ(LYue/ۥ۟ۧۧۥ;LYue/ۥ۟ۧۦۥ;ILYue/ۥ۟ۧۨ;LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۢۢ;ILjava/lang/Object;)LYue/ۥۡۦۡۡ;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۥ۟۟ۤ۟(LYue/ۥۡۦۡۡ;LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠ۢۢ;ILjava/lang/Object;)LYue/ۥۡۦۡۡ;
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    invoke-static {}, LYue/ۥ۠۟ۢۦ;->ۥ۟۟۟ۡ()LYue/ۥ۟ۧۦۨ;

    move-result-object p2

    :cond_0
    invoke-static {p0, p1, p2, p3}, LYue/ۥ۟ۤۢ۠;->ۥ۟۟ۤۨ(LYue/ۥۡۦۡۡ;LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠ۢۢ;)LYue/ۥۡۦۡۡ;

    move-result-object p0

    return-object p0
.end method
