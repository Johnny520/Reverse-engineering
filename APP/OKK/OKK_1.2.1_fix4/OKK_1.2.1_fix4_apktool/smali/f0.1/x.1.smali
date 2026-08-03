.class public final synthetic Lf0/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroid/widget/EditText;

.field public final synthetic b:Landroid/widget/EditText;

.field public final synthetic c:Landroid/app/Activity;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Landroid/widget/EditText;Landroid/widget/EditText;Landroid/app/Activity;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf0/x;->a:Landroid/widget/EditText;

    iput-object p2, p0, Lf0/x;->b:Landroid/widget/EditText;

    iput-object p3, p0, Lf0/x;->c:Landroid/app/Activity;

    iput p4, p0, Lf0/x;->d:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 14

    const/4 v0, 0x1

    iget-object v1, p0, Lf0/x;->a:Landroid/widget/EditText;

    const-string v2, "$latIn"

    invoke-static {v1, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lf0/x;->b:Landroid/widget/EditText;

    const-string v3, "$lonIn"

    invoke-static {v2, v3}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, Lf0/x;->c:Landroid/app/Activity;

    const-string v4, "$host"

    invoke-static {v3, v4}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Lc0/L1;->a:Lc0/L1;

    const-string v4, "substring(...)"

    new-instance v5, Ljava/io/File;

    const-string v6, "/storage/emulated/0/Android/media/com.tencent.mm/OKK"

    const-string v7, "map_pick_result"

    invoke-direct {v5, v6, v7}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/io/File;->isFile()Z

    move-result v6

    const/4 v7, 0x0

    if-nez v6, :cond_0

    goto/16 :goto_2

    :cond_0
    :try_start_0
    sget-object v6, LW0/a;->a:Ljava/nio/charset/Charset;

    invoke-static {v5, v6}, LN0/k;->i0(Ljava/io/File;Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, LW0/j;->S0(Ljava/lang/CharSequence;)LV0/f;

    move-result-object v6

    new-instance v8, Lc0/A;

    const/16 v9, 0x1a

    invoke-direct {v8, v9}, Lc0/A;-><init>(I)V

    new-instance v9, LV0/f;

    invoke-direct {v9, v6, v8}, LV0/f;-><init>(LV0/h;LP0/l;)V

    new-instance v6, Lc0/A;

    const/16 v8, 0x1b

    invoke-direct {v6, v8}, Lc0/A;-><init>(I)V

    new-instance v8, LV0/e;

    invoke-direct {v8, v9, v0, v6}, LV0/e;-><init>(LV0/h;ZLP0/l;)V

    new-instance v6, Ljava/util/LinkedHashMap;

    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v9, LV0/d;

    invoke-direct {v9, v8}, LV0/d;-><init>(LV0/e;)V

    :goto_0
    invoke-virtual {v9}, LV0/d;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-virtual {v9}, LV0/d;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    const/4 v10, 0x6

    const/16 v11, 0x3d

    const/4 v12, 0x0

    invoke-static {v8, v11, v12, v12, v10}, LW0/j;->O0(Ljava/lang/CharSequence;CIZI)I

    move-result v10

    invoke-virtual {v8, v12, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v4}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/2addr v10, v0

    invoke-virtual {v8, v10}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v4}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v6, v11, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v4

    invoke-static {v4}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v6

    :cond_1
    instance-of v4, v6, LD0/f;

    if-eqz v4, :cond_2

    move-object v6, v7

    :cond_2
    check-cast v6, Ljava/util/Map;

    if-nez v6, :cond_3

    goto :goto_2

    :cond_3
    const-string v4, "lat"

    invoke-interface {v6, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    if-eqz v4, :cond_4

    invoke-static {v4}, LW0/p;->y0(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v8

    const-string v10, "lon"

    invoke-interface {v6, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    if-eqz v6, :cond_4

    invoke-static {v6}, LW0/p;->y0(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v6

    if-eqz v6, :cond_4

    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v10

    const-wide v12, -0x3fa9800000000000L    # -90.0

    cmpg-double v12, v12, v8

    if-gtz v12, :cond_4

    const-wide v12, 0x4056800000000000L    # 90.0

    cmpg-double v8, v8, v12

    if-gtz v8, :cond_4

    const-wide v8, -0x3f99800000000000L    # -180.0

    cmpg-double v8, v8, v10

    if-gtz v8, :cond_4

    const-wide v8, 0x4066800000000000L    # 180.0

    cmpg-double v8, v10, v8

    if-gtz v8, :cond_4

    :try_start_1
    invoke-virtual {v5}, Ljava/io/File;->delete()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v5

    invoke-static {v5}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :goto_1
    new-instance v7, LD0/e;

    invoke-direct {v7, v4, v6}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_4
    :goto_2
    sget-object v4, Lf0/V;->a:Lf0/V;

    if-eqz v7, :cond_5

    iget-object v0, v7, LD0/e;->a:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v5

    iget-object v0, v7, LD0/e;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v7

    sget-object v0, Lc0/L1;->a:Lc0/L1;

    invoke-static {v5, v6}, Lc0/L1;->c(D)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {v7, v8}, Lc0/L1;->c(D)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v4, 0x1

    const/4 v10, 0x0

    move-object v9, v3

    invoke-static/range {v4 .. v10}, Lc0/L1;->i(ZDDLandroid/content/Context;Z)V

    const-string v0, "\u9009\u70b9\u6210\u529f"

    invoke-static {v3, v0}, Lf0/V;->z(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_3

    :cond_5
    iget v4, p0, Lf0/x;->d:I

    add-int/2addr v4, v0

    const/16 v0, 0x28

    if-gt v4, v0, :cond_7

    invoke-virtual {v3}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_3

    :cond_6
    invoke-virtual {v3}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    new-instance v5, Lf0/x;

    invoke-direct {v5, v1, v2, v3, v4}, Lf0/x;-><init>(Landroid/widget/EditText;Landroid/widget/EditText;Landroid/app/Activity;I)V

    const-wide/16 v1, 0x1f4

    invoke-virtual {v0, v5, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_7
    :goto_3
    return-void
.end method
