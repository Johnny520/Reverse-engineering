.class public final synthetic Li9;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# instance fields
.field public final synthetic α:I

.field public final synthetic β:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Li9;->α:I

    .line 2
    .line 3
    iput-object p2, p0, Li9;->β:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onShow(Landroid/content/DialogInterface;)V
    .locals 1

    .line 1
    iget v0, p0, Li9;->α:I

    .line 2
    .line 3
    iget-object p0, p0, Li9;->β:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;

    .line 9
    .line 10
    invoke-static {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;->η(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAddDialog;Landroid/content/DialogInterface;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    check-cast p0, Landroid/app/Activity;

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    invoke-static {p0, p1}, Ldd1;->δ(Landroid/app/Activity;Z)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_1
    check-cast p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;

    .line 22
    .line 23
    invoke-static {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;->γ(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkAddDialog;Landroid/content/DialogInterface;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :pswitch_2
    check-cast p0, Lη;

    .line 28
    .line 29
    :try_start_0
    invoke-virtual {p0}, Lη;->invoke()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    sget-object p0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    new-instance p1, Leo1;

    .line 37
    .line 38
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    move-object p0, p1

    .line 42
    :goto_0
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    if-eqz p0, :cond_0

    .line 47
    .line 48
    const-string p1, "r24de9f070d18b34b"

    .line 49
    .line 50
    const-string v0, "\u516c\u544a\u5f39\u7a97\u5c55\u793a \u56de\u8c03\u6267\u884c\u5931\u8d25"

    .line 51
    .line 52
    invoke-static {p1, v0, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    :cond_0
    return-void

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
