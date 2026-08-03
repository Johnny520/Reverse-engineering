.class public final synthetic Lf0/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP0/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p4, p0, Lf0/v;->a:I

    iput-object p1, p0, Lf0/v;->b:Ljava/lang/Object;

    iput-object p2, p0, Lf0/v;->c:Ljava/lang/Object;

    iput-object p3, p0, Lf0/v;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 13

    const/4 v0, 0x0

    const-string v1, "$lon"

    const-string v2, "$lat"

    const-string v3, "$host"

    sget-object v4, LD0/l;->a:LD0/l;

    iget-object v5, p0, Lf0/v;->d:Ljava/lang/Object;

    iget-object v6, p0, Lf0/v;->c:Ljava/lang/Object;

    iget-object v7, p0, Lf0/v;->b:Ljava/lang/Object;

    iget v8, p0, Lf0/v;->a:I

    packed-switch v8, :pswitch_data_0

    check-cast v7, Lf0/G;

    const-string v1, "$cat"

    invoke-static {v7, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Ljava/util/List;

    const-string v1, "$sections"

    invoke-static {v6, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Ljava/util/Map;

    const-string v1, "$countLabels"

    invoke-static {v5, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, LD0/e;

    iget-object v6, v6, LD0/e;->a:Ljava/lang/Object;

    if-ne v6, v7, :cond_0

    goto :goto_0

    :cond_1
    move-object v2, v3

    :goto_0
    check-cast v2, LD0/e;

    if-eqz v2, :cond_9

    iget-object v1, v2, LD0/e;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    if-nez v1, :cond_2

    goto :goto_4

    :cond_2
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_2

    :cond_3
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lf0/H;

    sget-object v8, Lc0/h1;->a:Lc0/h1;

    iget-object v8, v6, Lf0/H;->c:Ljava/lang/String;

    iget-boolean v6, v6, Lf0/H;->d:Z

    invoke-static {v8, v6}, Lc0/h1;->c(Ljava/lang/String;Z)Z

    move-result v6

    if-eqz v6, :cond_4

    add-int/lit8 v0, v0, 0x1

    if-ltz v0, :cond_5

    goto :goto_1

    :cond_5
    invoke-static {}, LE0/m;->i0()V

    throw v3

    :cond_6
    :goto_2
    invoke-interface {v5, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    if-nez v2, :cond_7

    goto :goto_4

    :cond_7
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, " / "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " \u5df2\u5f00\u542f"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-lez v0, :cond_8

    sget v0, Lf0/V;->j:I

    goto :goto_3

    :cond_8
    sget v0, Lf0/V;->h:I

    :goto_3
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_9
    :goto_4
    return-object v4

    :pswitch_0
    move-object v0, v7

    check-cast v0, Landroid/app/Activity;

    invoke-static {v0, v3}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Lf0/I;

    invoke-static {v6, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Lf0/I;

    invoke-static {v5, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lc0/L1;->a:Lc0/L1;

    invoke-virtual {v1, v0}, Lc0/L1;->b(Landroid/content/Context;)LD0/e;

    move-result-object v1

    iget-object v2, v6, Lf0/I;->b:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, LW0/p;->y0(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v2

    if-eqz v2, :cond_a

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    :goto_5
    move-wide v6, v2

    goto :goto_6

    :cond_a
    iget-object v2, v1, LD0/e;->a:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v2

    goto :goto_5

    :goto_6
    iget-object v2, v5, Lf0/I;->b:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, LW0/p;->y0(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v2

    if-eqz v2, :cond_b

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    :goto_7
    move-wide v8, v1

    goto :goto_8

    :cond_b
    iget-object v1, v1, LD0/e;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v1

    goto :goto_7

    :goto_8
    const/4 v5, 0x1

    const/4 v11, 0x0

    move-object v10, v0

    invoke-static/range {v5 .. v11}, Lc0/L1;->i(ZDDLandroid/content/Context;Z)V

    sget-object v1, Lf0/V;->a:Lf0/V;

    const-string v1, "\u5df2\u4fdd\u5b58\u5750\u6807\u5e76\u6fc0\u6d3b"

    invoke-static {v0, v1}, Lf0/V;->z(Landroid/content/Context;Ljava/lang/String;)V

    return-object v4

    :pswitch_1
    move-object v12, v7

    check-cast v12, Landroid/app/Activity;

    invoke-static {v12, v3}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Lf0/I;

    invoke-static {v6, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Lf0/I;

    invoke-static {v5, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lf0/V;->a:Lf0/V;

    sget-object v1, Lc0/L1;->a:Lc0/L1;

    invoke-virtual {v1, v12}, Lc0/L1;->b(Landroid/content/Context;)LD0/e;

    move-result-object v1

    iget-object v2, v6, Lf0/I;->b:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, LW0/p;->y0(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v3

    if-eqz v3, :cond_c

    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v6

    goto :goto_9

    :cond_c
    iget-object v3, v1, LD0/e;->a:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v6

    :goto_9
    iget-object v3, v5, Lf0/I;->b:Landroid/widget/EditText;

    invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, LW0/p;->y0(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v5

    if-eqz v5, :cond_d

    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v8

    goto :goto_a

    :cond_d
    iget-object v1, v1, LD0/e;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v8

    :goto_a
    const/4 v5, 0x1

    const/4 v11, 0x0

    move-object v10, v12

    invoke-static/range {v5 .. v11}, Lc0/L1;->i(ZDDLandroid/content/Context;Z)V

    :try_start_0
    const-string v1, "com.tencent.mm.plugin.location.ui.RedirectUI"

    invoke-virtual {v12}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v5

    invoke-static {v1, v0, v5}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v1

    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5, v12, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "map_view_type"

    const/16 v6, 0x8

    invoke-virtual {v5, v1, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    move-result-object v1

    const v5, 0xac07

    invoke-virtual {v12, v1, v5}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    const-string v1, "\u8bf7\u5728\u5730\u56fe\u4e0a\u9009\u62e9\u4f4d\u7f6e"

    invoke-static {v12, v1}, Lf0/V;->z(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v12}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-eqz v1, :cond_e

    goto :goto_b

    :cond_e
    invoke-virtual {v12}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    new-instance v5, Lf0/x;

    invoke-direct {v5, v2, v3, v12, v0}, Lf0/x;-><init>(Landroid/widget/EditText;Landroid/widget/EditText;Landroid/app/Activity;I)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v1, v5, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_b
    move-object v0, v4

    goto :goto_c

    :catchall_0
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_c
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_10

    sget-object v0, Lc0/L1;->a:Lc0/L1;

    const-string v0, "ts="

    new-instance v1, Ljava/io/File;

    const-string v2, "/storage/emulated/0/Android/media/com.tencent.mm/OKK"

    const-string v3, "map_pick_request"

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_1
    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v3

    if-eqz v3, :cond_f

    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    goto :goto_d

    :catchall_1
    move-exception v0

    goto :goto_e

    :cond_f
    :goto_d
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, "\n"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v3, LW0/a;->a:Ljava/nio/charset/Charset;

    invoke-static {v1, v0, v3}, LN0/k;->j0(Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_f

    :goto_e
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :goto_f
    :try_start_2
    new-instance v0, Ljava/io/File;

    const-string v1, "map_pick_result"

    invoke-direct {v0, v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->delete()Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_10

    :catchall_2
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :goto_10
    const-string v0, "\u5df2\u53d1\u9001\u9009\u70b9\u8bf7\u6c42\uff0c\u8bf7\u5728\u5fae\u4fe1\u4e2d\u786e\u8ba4"

    invoke-static {v12, v0}, Lf0/V;->z(Landroid/content/Context;Ljava/lang/String;)V

    :cond_10
    return-object v4

    :pswitch_2
    check-cast v7, Landroid/app/Activity;

    invoke-static {v7, v3}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Lf0/I;

    invoke-static {v6, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Lf0/I;

    invoke-static {v5, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lc0/L1;->a:Lc0/L1;

    invoke-static {v7}, Lc0/L1;->h(Landroid/content/Context;)LD0/e;

    move-result-object v0

    sget-object v1, Lf0/V;->a:Lf0/V;

    if-nez v0, :cond_11

    const-string v0, "\u65e0\u6cd5\u83b7\u53d6\u5f53\u524d\u4f4d\u7f6e\uff0c\u8bf7\u5f00\u542f\u7cfb\u7edf\u5b9a\u4f4d\u6743\u9650"

    invoke-static {v7, v0}, Lf0/V;->z(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_11

    :cond_11
    iget-object v1, v0, LD0/e;->a:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v1

    invoke-static {v1, v2}, Lc0/L1;->c(D)Ljava/lang/String;

    move-result-object v1

    iget-object v2, v6, Lf0/I;->b:Landroid/widget/EditText;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, v0, LD0/e;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Lc0/L1;->c(D)Ljava/lang/String;

    move-result-object v0

    iget-object v1, v5, Lf0/I;->b:Landroid/widget/EditText;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const-string v0, "\u5df2\u81ea\u52a8\u586b\u5165"

    invoke-static {v7, v0}, Lf0/V;->z(Landroid/content/Context;Ljava/lang/String;)V

    :goto_11
    return-object v4

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
