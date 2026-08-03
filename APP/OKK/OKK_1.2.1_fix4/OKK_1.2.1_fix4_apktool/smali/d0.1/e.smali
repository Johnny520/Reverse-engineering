.class public final synthetic Ld0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP0/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/app/Activity;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Lb0/s;Lb0/a;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    iput v0, p0, Ld0/e;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld0/e;->b:Landroid/app/Activity;

    iput-object p2, p0, Ld0/e;->d:Ljava/lang/Object;

    iput-object p3, p0, Ld0/e;->e:Ljava/lang/Object;

    iput-object p4, p0, Ld0/e;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/widget/EditText;Landroid/widget/TextView;Landroid/app/Activity;Landroid/app/Dialog;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Ld0/e;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld0/e;->d:Ljava/lang/Object;

    iput-object p2, p0, Ld0/e;->e:Ljava/lang/Object;

    iput-object p3, p0, Ld0/e;->b:Landroid/app/Activity;

    iput-object p4, p0, Ld0/e;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lf0/I;Lf0/I;Lf0/I;Landroid/app/Activity;)V
    .locals 1

    .line 3
    const/4 v0, 0x2

    iput v0, p0, Ld0/e;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld0/e;->d:Ljava/lang/Object;

    iput-object p2, p0, Ld0/e;->e:Ljava/lang/Object;

    iput-object p3, p0, Ld0/e;->c:Ljava/lang/Object;

    iput-object p4, p0, Ld0/e;->b:Landroid/app/Activity;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/ArrayList;Landroid/app/Activity;Landroid/app/Dialog;Ld0/c;)V
    .locals 1

    .line 4
    const/4 v0, 0x1

    iput v0, p0, Ld0/e;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld0/e;->d:Ljava/lang/Object;

    iput-object p2, p0, Ld0/e;->b:Landroid/app/Activity;

    iput-object p3, p0, Ld0/e;->c:Ljava/lang/Object;

    iput-object p4, p0, Ld0/e;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    const-string v1, "$dialog"

    const-string v2, "$activity"

    const/4 v3, 0x0

    const-string v4, "$host"

    const/4 v5, 0x0

    sget-object v6, LD0/l;->a:LD0/l;

    iget-object v7, v0, Ld0/e;->e:Ljava/lang/Object;

    iget-object v8, v0, Ld0/e;->d:Ljava/lang/Object;

    iget-object v9, v0, Ld0/e;->c:Ljava/lang/Object;

    iget-object v10, v0, Ld0/e;->b:Landroid/app/Activity;

    iget v11, v0, Ld0/e;->a:I

    packed-switch v11, :pswitch_data_0

    invoke-static {v10, v4}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v9, Ljava/lang/String;

    const-string v1, "$hookSum"

    invoke-static {v9, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "=== OKK \u8bca\u65ad\u62a5\u544a ===\nModule: v1.2.1\n"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    check-cast v8, Lb0/s;

    if-eqz v8, :cond_0

    invoke-virtual {v8}, Lb0/s;->a()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v3

    :goto_0
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "WeChat: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0xa

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    check-cast v7, Lb0/a;

    if-eqz v7, :cond_1

    invoke-virtual {v7}, Lb0/a;->e()Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_1
    move-object v4, v3

    :goto_1
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v7, "Report: "

    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v4, "Hooks: "

    invoke-virtual {v4, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "\n\n--- \u65e5\u5fd7\u7247\u6bb5 ---\n"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v4, Lcom/abc/core/hooks/ModuleLog;->INSTANCE:Lcom/abc/core/hooks/ModuleLog;

    const/16 v5, 0x12c

    invoke-virtual {v4, v5}, Lcom/abc/core/hooks/ModuleLog;->text(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "toString(...)"

    invoke-static {v1, v2}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "clipboard"

    invoke-virtual {v10, v2}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    instance-of v4, v2, Landroid/content/ClipboardManager;

    if-eqz v4, :cond_2

    move-object v3, v2

    check-cast v3, Landroid/content/ClipboardManager;

    :cond_2
    if-eqz v3, :cond_3

    const-string v2, "OKK-diag"

    invoke-static {v2, v1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    :cond_3
    sget-object v1, Lf0/V;->a:Lf0/V;

    const-string v1, "\u8bca\u65ad\u4fe1\u606f\u5df2\u590d\u5236"

    invoke-static {v10, v1}, Lf0/V;->z(Landroid/content/Context;Ljava/lang/String;)V

    return-object v6

    :pswitch_0
    check-cast v8, Lf0/I;

    const-string v1, "$owner"

    invoke-static {v8, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Lf0/I;

    const-string v1, "$admin"

    invoke-static {v7, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v9, Lf0/I;

    const-string v1, "$member"

    invoke-static {v9, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v10, v4}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lc0/h1;->a:Lc0/h1;

    iget-object v1, v8, Lf0/I;->b:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_4

    const-string v1, "\u7fa4\u4e3b"

    :cond_4
    new-instance v2, LD0/e;

    const-string v3, "member_title_owner"

    invoke-direct {v2, v3, v1}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v1, v7, Lf0/I;->b:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_5

    const-string v1, "\u7ba1\u7406\u5458"

    :cond_5
    new-instance v3, LD0/e;

    const-string v4, "member_title_admin"

    invoke-direct {v3, v4, v1}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v1, v9, Lf0/I;->b:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_6

    const-string v1, "\u6210\u5458"

    :cond_6
    new-instance v4, LD0/e;

    const-string v7, "member_title_member"

    invoke-direct {v4, v7, v1}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, v3, v4}, [LD0/e;

    move-result-object v1

    invoke-static {v1}, LE0/x;->h0([LD0/e;)Ljava/util/Map;

    move-result-object v1

    invoke-static {v5}, Lc0/h1;->i(Z)V

    sget-object v2, Lc0/h1;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->putAll(Ljava/util/Map;)V

    invoke-static {v5}, Lc0/h1;->b(Z)V

    sget-object v1, Lf0/V;->a:Lf0/V;

    const-string v1, "\u5df2\u4fdd\u5b58\u7fa4\u5934\u8854\u6587\u6848"

    invoke-static {v10, v1}, Lf0/V;->z(Landroid/content/Context;Ljava/lang/String;)V

    return-object v6

    :pswitch_1
    check-cast v8, Ljava/util/List;

    const-string v3, "$selected"

    invoke-static {v8, v3}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v10, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v9, Landroid/app/Dialog;

    invoke-static {v9, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, LP0/a;

    const-string v1, "$onDone"

    invoke-static {v7, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_7

    const-string v1, "\u81f3\u5c11\u4fdd\u7559 1 \u4e2a\u5feb\u6377"

    invoke-static {v10, v1, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    goto :goto_2

    :cond_7
    invoke-static {v8}, LE0/l;->y0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, LE0/l;->o0(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x3

    invoke-static {v2, v1}, LE0/l;->u0(ILjava/util/Collection;)Ljava/util/List;

    move-result-object v11

    sget-object v1, Lc0/h1;->a:Lc0/h1;

    new-instance v15, Lc0/A;

    const/16 v2, 0x9

    invoke-direct {v15, v2}, Lc0/A;-><init>(I)V

    const/4 v14, 0x0

    const/16 v16, 0x1e

    const-string v12, ","

    const/4 v13, 0x0

    invoke-static/range {v11 .. v16}, LE0/l;->r0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LP0/l;I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    const-string v4, "home_drawer_shortcuts"

    invoke-virtual {v1, v4, v2, v3}, Lc0/h1;->f(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "\u5df2\u4fdd\u5b58 "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " \u4e2a\u5feb\u6377"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v10, v1, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    invoke-virtual {v9}, Landroid/app/Dialog;->dismiss()V

    invoke-interface {v7}, LP0/a;->invoke()Ljava/lang/Object;

    :goto_2
    return-object v6

    :pswitch_2
    check-cast v8, Landroid/widget/EditText;

    const-string v4, "$input"

    invoke-static {v8, v4}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Landroid/widget/TextView;

    const-string v4, "$target"

    invoke-static {v7, v4}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v10, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v9, Landroid/app/Dialog;

    invoke-static {v9, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v8}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    :cond_8
    if-nez v3, :cond_9

    const-string v3, ""

    :cond_9
    invoke-static {v3}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v2

    const-string v3, "OKK \u5feb\u6377\u9762\u677f"

    if-eqz v2, :cond_a

    move-object v1, v3

    :cond_a
    sget-object v2, Lc0/h1;->a:Lc0/h1;

    invoke-static {v1}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_b

    goto :goto_3

    :cond_b
    move-object v3, v2

    :goto_3
    const-string v2, "home_drawer_signature"

    invoke-static {v2, v3}, Lc0/h1;->h(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "home_drawer_signature_tip_shown"

    const-string v3, "true"

    invoke-static {v2, v3}, Lc0/h1;->h(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v7, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const-string v1, "\u7b7e\u540d\u5df2\u4fdd\u5b58"

    invoke-static {v10, v1, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    invoke-virtual {v9}, Landroid/app/Dialog;->dismiss()V

    return-object v6

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
