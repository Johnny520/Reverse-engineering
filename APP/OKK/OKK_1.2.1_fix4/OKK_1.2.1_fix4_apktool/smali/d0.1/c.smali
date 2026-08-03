.class public final synthetic Ld0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP0/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;I)V
    .locals 0

    iput p2, p0, Ld0/c;->a:I

    iput-object p1, p0, Ld0/c;->b:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    const/16 v0, 0x9

    const-string v1, "theme_wallpaper_enabled"

    const/4 v2, 0x1

    const-string v3, "\u8bbe\u7f6e\u5165\u53e3\u672a\u5c31\u7eea"

    const-string v4, "$host"

    const/4 v5, 0x0

    const-string v6, "$activity"

    iget v7, p0, Ld0/c;->a:I

    packed-switch v7, :pswitch_data_0

    iget-object v0, p0, Ld0/c;->b:Landroid/app/Activity;

    invoke-static {v0, v4}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lc0/a0;->a:Lc0/a0;

    invoke-static {v0, v2}, Lc0/a0;->j0(Landroid/app/Activity;Z)V

    sget-object v0, LD0/l;->a:LD0/l;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ld0/c;->b:Landroid/app/Activity;

    invoke-static {v0, v4}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lc0/a0;->a:Lc0/a0;

    invoke-static {v0, v5}, Lc0/a0;->j0(Landroid/app/Activity;Z)V

    sget-object v0, LD0/l;->a:LD0/l;

    return-object v0

    :pswitch_1
    iget-object v0, p0, Ld0/c;->b:Landroid/app/Activity;

    invoke-static {v0, v4}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lc0/B1;->a:Lc0/B1;

    const-wide/16 v3, 0x0

    sput-wide v3, Lc0/B1;->c:J

    invoke-static {v2}, Lc0/B1;->g(Z)V

    sget-object v3, Lc0/h1;->a:Lc0/h1;

    invoke-virtual {v3, v1, v2, v5}, Lc0/h1;->g(Ljava/lang/String;ZZ)V

    sget-object v1, Lc0/G1;->a:Ljava/lang/Object;

    invoke-static {v0}, Lc0/G1;->x(Landroid/app/Activity;)V

    invoke-static {}, Lc0/G1;->j()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lf0/V;->a:Lf0/V;

    invoke-static {v0, v1}, Lf0/V;->z(Landroid/content/Context;Ljava/lang/String;)V

    sget-object v0, LD0/l;->a:LD0/l;

    return-object v0

    :pswitch_2
    iget-object v0, p0, Ld0/c;->b:Landroid/app/Activity;

    invoke-static {v0, v4}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lc0/B1;->a:Lc0/B1;

    :try_start_0
    new-instance v3, Ljava/io/File;

    const-string v4, "/storage/emulated/0/Android/media/com.tencent.mm/OKK"

    const-string v6, "theme_wallpaper.jpg"

    invoke-direct {v3, v4, v6}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->delete()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v3

    invoke-static {v3}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :goto_0
    sget-object v3, Lc0/h1;->a:Lc0/h1;

    const-string v4, "theme_wallpaper_path"

    const-string v6, ""

    invoke-virtual {v3, v4, v6, v2}, Lc0/h1;->f(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    const-string v7, "theme_wallpaper_updated"

    invoke-virtual {v3, v7, v4, v2}, Lc0/h1;->f(Ljava/lang/String;Ljava/lang/String;Z)V

    sput-object v6, Lc0/B1;->f:Ljava/lang/String;

    sput-object v4, Lc0/B1;->g:Ljava/lang/String;

    const/4 v4, 0x0

    sput-object v4, Lc0/B1;->h:Landroid/graphics/Bitmap;

    sput-object v6, Lc0/B1;->i:Ljava/lang/String;

    sput-object v6, Lc0/B1;->j:Ljava/lang/String;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v6

    sput-wide v6, Lc0/B1;->c:J

    invoke-static {}, Lc0/B1;->f()V

    sget-object v4, Lc0/B1;->a:Lc0/B1;

    invoke-virtual {v3, v1, v5, v2}, Lc0/h1;->g(Ljava/lang/String;ZZ)V

    sput-boolean v5, Lc0/B1;->d:Z

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    sput-wide v1, Lc0/B1;->c:J

    invoke-static {}, Lc0/B1;->f()V

    sget-object v1, Lc0/G1;->a:Ljava/lang/Object;

    invoke-static {}, Lc0/G1;->w()V

    sget-object v1, Lf0/V;->a:Lf0/V;

    const-string v1, "\u5df2\u6e05\u9664\u58c1\u7eb8\uff0c\u6062\u590d\u9ed8\u8ba4"

    invoke-static {v0, v1}, Lf0/V;->z(Landroid/content/Context;Ljava/lang/String;)V

    sget-object v0, LD0/l;->a:LD0/l;

    return-object v0

    :pswitch_3
    sget-object v0, LD0/l;->a:LD0/l;

    iget-object v1, p0, Ld0/c;->b:Landroid/app/Activity;

    invoke-static {v1, v4}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lc0/J1;->a:Lc0/J1;

    sget-object v2, Lc0/G1;->a:Ljava/lang/Object;

    invoke-static {v1}, Lc0/G1;->x(Landroid/app/Activity;)V

    invoke-static {}, Lc0/G1;->z()Landroid/app/Activity;

    move-result-object v2

    if-nez v2, :cond_0

    move-object v2, v1

    :cond_0
    new-instance v3, Landroid/content/Intent;

    const-string v4, "android.intent.action.GET_CONTENT"

    invoke-direct {v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v4, "image/*"

    invoke-virtual {v3, v4}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    const-string v4, "android.intent.category.OPENABLE"

    invoke-virtual {v3, v4}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    const v4, 0xa0c11

    :try_start_1
    const-string v5, "\u9009\u62e9\u58c1\u7eb8"

    invoke-static {v3, v5}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v5

    invoke-virtual {v2, v5, v4}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v2, v0

    goto :goto_1

    :catchall_1
    move-exception v2

    invoke-static {v2}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v2

    :goto_1
    invoke-static {v2}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_1

    :try_start_2
    invoke-virtual {v1, v3, v4}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception v2

    invoke-static {v2}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :cond_1
    :goto_2
    sget-object v2, Lf0/V;->a:Lf0/V;

    const-string v2, "\u9009\u62e9\u5b8c\u6210\u540e\u70b9\u300c\u5e94\u7528\u58c1\u7eb8\u300d"

    invoke-static {v1, v2}, Lf0/V;->z(Landroid/content/Context;Ljava/lang/String;)V

    return-object v0

    :pswitch_4
    iget-object v0, p0, Ld0/c;->b:Landroid/app/Activity;

    invoke-static {v0, v4}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lc0/e0;->a:Lc0/e0;

    const-string v1, "/storage/emulated/0/Android/media/com.tencent.mm/OKK/download"

    invoke-static {v1}, Lc0/e0;->d(Ljava/lang/String;)V

    sget-object v1, Lf0/V;->a:Lf0/V;

    const-string v1, "\u5df2\u6062\u590d\u9ed8\u8ba4\uff1a/storage/emulated/0/Android/media/com.tencent.mm/OKK/download"

    invoke-static {v0, v1}, Lf0/V;->z(Landroid/content/Context;Ljava/lang/String;)V

    sget-object v0, LD0/l;->a:LD0/l;

    return-object v0

    :pswitch_5
    sget-object v0, LD0/l;->a:LD0/l;

    iget-object v1, p0, Ld0/c;->b:Landroid/app/Activity;

    invoke-static {v1, v4}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Landroid/content/Intent;

    const-string v3, "android.intent.action.OPEN_DOCUMENT_TREE"

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x3

    invoke-virtual {v2, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const v3, 0xa0d20

    :try_start_3
    invoke-virtual {v1, v2, v3}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    move-object v2, v0

    goto :goto_3

    :catchall_3
    move-exception v2

    invoke-static {v2}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v2

    :goto_3
    invoke-static {v2}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_2

    sget-object v2, Lf0/V;->a:Lf0/V;

    const-string v2, "\u65e0\u6cd5\u6253\u5f00\u76ee\u5f55\u9009\u62e9\u5668"

    invoke-static {v1, v2}, Lf0/V;->z(Landroid/content/Context;Ljava/lang/String;)V

    :cond_2
    return-object v0

    :pswitch_6
    iget-object v0, p0, Ld0/c;->b:Landroid/app/Activity;

    invoke-static {v0, v6}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ld0/c;

    const/4 v2, 0x7

    invoke-direct {v1, v0, v2}, Ld0/c;-><init>(Landroid/app/Activity;I)V

    invoke-static {v0, v1}, LU/S;->R(Landroid/app/Activity;LP0/a;)V

    sget-object v0, LD0/l;->a:LD0/l;

    return-object v0

    :pswitch_7
    iget-object v0, p0, Ld0/c;->b:Landroid/app/Activity;

    invoke-static {v0, v6}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ld0/c;

    const/4 v2, 0x5

    invoke-direct {v1, v0, v2}, Ld0/c;-><init>(Landroid/app/Activity;I)V

    invoke-static {v0, v1}, LU/S;->R(Landroid/app/Activity;LP0/a;)V

    sget-object v0, LD0/l;->a:LD0/l;

    return-object v0

    :pswitch_8
    iget-object v0, p0, Ld0/c;->b:Landroid/app/Activity;

    invoke-static {v0, v6}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, LU/S;->k:LP0/l;

    if-eqz v1, :cond_3

    invoke-interface {v1, v0}, LP0/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_3
    invoke-static {v0, v3, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :goto_4
    sget-object v0, LD0/l;->a:LD0/l;

    return-object v0

    :pswitch_9
    iget-object v0, p0, Ld0/c;->b:Landroid/app/Activity;

    invoke-static {v0, v6}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, LU/S;->o:LP0/l;

    if-eqz v1, :cond_4

    invoke-interface {v1, v0}, LP0/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    :cond_4
    invoke-static {v0, v3, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :goto_5
    sget-object v0, LD0/l;->a:LD0/l;

    return-object v0

    :pswitch_a
    iget-object v0, p0, Ld0/c;->b:Landroid/app/Activity;

    invoke-static {v0, v6}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, LU/S;->n:LP0/l;

    if-eqz v1, :cond_5

    invoke-interface {v1, v0}, LP0/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_6

    :cond_5
    invoke-static {v0, v3, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :goto_6
    sget-object v0, LD0/l;->a:LD0/l;

    return-object v0

    :pswitch_b
    iget-object v0, p0, Ld0/c;->b:Landroid/app/Activity;

    invoke-static {v0, v6}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, LU/S;->l:LP0/l;

    if-eqz v1, :cond_6

    invoke-interface {v1, v0}, LP0/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_7

    :cond_6
    invoke-static {v0, v3, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :goto_7
    sget-object v0, LD0/l;->a:LD0/l;

    return-object v0

    :pswitch_c
    iget-object v1, p0, Ld0/c;->b:Landroid/app/Activity;

    invoke-static {v1, v6}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5}, LU/S;->n(Z)V

    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_7

    new-instance v3, Lc0/v;

    invoke-direct {v3, v1, v0}, Lc0/v;-><init>(Landroid/app/Activity;I)V

    invoke-virtual {v2, v3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_7
    sget-object v0, LD0/l;->a:LD0/l;

    return-object v0

    :pswitch_d
    sget-object v0, LD0/l;->a:LD0/l;

    iget-object v1, p0, Ld0/c;->b:Landroid/app/Activity;

    invoke-static {v1, v6}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "https://t.me/OKK_Group"

    :try_start_4
    new-instance v3, Landroid/content/Intent;

    const-string v4, "android.intent.action.VIEW"

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v3, v4, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    const/high16 v2, 0x10000000

    invoke-virtual {v3, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    move-object v2, v0

    goto :goto_8

    :catchall_4
    move-exception v2

    invoke-static {v2}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v2

    :goto_8
    invoke-static {v2}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_8

    const-string v2, "\u65e0\u6cd5\u6253\u5f00\u94fe\u63a5"

    invoke-static {v1, v2, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    :cond_8
    return-object v0

    :pswitch_e
    iget-object v0, p0, Ld0/c;->b:Landroid/app/Activity;

    invoke-static {v0, v6}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, LU/S;->m:LP0/l;

    if-eqz v1, :cond_9

    invoke-interface {v1, v0}, LP0/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_9

    :cond_9
    invoke-static {v0, v3, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :goto_9
    sget-object v0, LD0/l;->a:LD0/l;

    return-object v0

    :pswitch_f
    iget-object v0, p0, Ld0/c;->b:Landroid/app/Activity;

    invoke-static {v0, v6}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ld0/c;

    const/16 v2, 0x8

    invoke-direct {v1, v0, v2}, Ld0/c;-><init>(Landroid/app/Activity;I)V

    invoke-static {v0, v1}, LU/S;->R(Landroid/app/Activity;LP0/a;)V

    sget-object v0, LD0/l;->a:LD0/l;

    return-object v0

    :pswitch_10
    iget-object v0, p0, Ld0/c;->b:Landroid/app/Activity;

    invoke-static {v0, v6}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ld0/c;

    const/4 v2, 0x4

    invoke-direct {v1, v0, v2}, Ld0/c;-><init>(Landroid/app/Activity;I)V

    invoke-static {v0, v1}, LU/S;->R(Landroid/app/Activity;LP0/a;)V

    sget-object v0, LD0/l;->a:LD0/l;

    return-object v0

    :pswitch_11
    iget-object v1, p0, Ld0/c;->b:Landroid/app/Activity;

    invoke-static {v1, v6}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ld0/c;

    invoke-direct {v2, v1, v0}, Ld0/c;-><init>(Landroid/app/Activity;I)V

    invoke-static {v1, v2}, LU/S;->R(Landroid/app/Activity;LP0/a;)V

    sget-object v0, LD0/l;->a:LD0/l;

    return-object v0

    :pswitch_12
    iget-object v0, p0, Ld0/c;->b:Landroid/app/Activity;

    invoke-static {v0, v6}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ld0/c;

    const/16 v2, 0xa

    invoke-direct {v1, v0, v2}, Ld0/c;-><init>(Landroid/app/Activity;I)V

    invoke-static {v0, v1}, LU/S;->R(Landroid/app/Activity;LP0/a;)V

    sget-object v0, LD0/l;->a:LD0/l;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
