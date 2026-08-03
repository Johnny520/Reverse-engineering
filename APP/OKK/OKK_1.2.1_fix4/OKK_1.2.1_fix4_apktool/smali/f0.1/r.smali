.class public final synthetic Lf0/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP0/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lf0/I;

.field public final synthetic c:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Lf0/I;Landroid/app/Activity;I)V
    .locals 0

    iput p3, p0, Lf0/r;->a:I

    iput-object p1, p0, Lf0/r;->b:Lf0/I;

    iput-object p2, p0, Lf0/r;->c:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    const/4 v0, 0x3

    const-wide/16 v1, 0x0

    const-string v3, "input_stats_template"

    const-string v4, "\u4eca\u65e5\u5df2\u53d1${totalMsg}\u6761"

    const-string v5, "$template"

    const/4 v6, 0x0

    const-string v7, "$host"

    iget v8, p0, Lf0/r;->a:I

    packed-switch v8, :pswitch_data_0

    iget-object v0, p0, Lf0/r;->b:Lf0/I;

    const-string v1, "$tpl"

    invoke-static {v0, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lf0/r;->c:Landroid/app/Activity;

    invoke-static {v1, v7}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lc0/h1;->a:Lc0/h1;

    iget-object v0, v0, Lf0/I;->b:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v0, "{name}\u64a4\u56de\u4e86\u4e00\u6761\u6d88\u606f"

    :cond_0
    const-string v3, "anti_revoke_notice_text"

    invoke-virtual {v2, v3, v0, v6}, Lc0/h1;->f(Ljava/lang/String;Ljava/lang/String;Z)V

    sget-object v0, Lf0/V;->a:Lf0/V;

    const-string v0, "\u5df2\u4fdd\u5b58\u6a21\u677f"

    invoke-static {v1, v0}, Lf0/V;->z(Landroid/content/Context;Ljava/lang/String;)V

    sget-object v0, LD0/l;->a:LD0/l;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lf0/r;->b:Lf0/I;

    const-string v1, "$color"

    invoke-static {v0, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lf0/r;->c:Landroid/app/Activity;

    invoke-static {v1, v7}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Lf0/I;->b:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v0, "#9E9E9E"

    :cond_1
    sget-object v2, Lc0/h1;->a:Lc0/h1;

    const-string v3, "real_name_tail_color"

    invoke-virtual {v2, v3, v0, v6}, Lc0/h1;->f(Ljava/lang/String;Ljava/lang/String;Z)V

    sget-object v0, Lf0/V;->a:Lf0/V;

    const-string v0, "\u5df2\u4fdd\u5b58\u5b9e\u540d\u989c\u8272"

    invoke-static {v1, v0}, Lf0/V;->z(Landroid/content/Context;Ljava/lang/String;)V

    sget-object v0, LD0/l;->a:LD0/l;

    return-object v0

    :pswitch_1
    iget-object v8, p0, Lf0/r;->b:Lf0/I;

    invoke-static {v8, v5}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, p0, Lf0/r;->c:Landroid/app/Activity;

    invoke-static {v5, v7}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v7, v8, Lf0/I;->b:Landroid/widget/EditText;

    invoke-virtual {v7}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_2

    goto :goto_0

    :cond_2
    move-object v4, v7

    :goto_0
    sget-object v7, Lc0/h1;->a:Lc0/h1;

    invoke-virtual {v7, v3, v4, v6}, Lc0/h1;->f(Ljava/lang/String;Ljava/lang/String;Z)V

    sget-object v3, Lc0/I0;->a:Lc0/I0;

    sget-object v3, Lc0/F0;->b:Lc0/J0;

    sput-wide v1, Lc0/F0;->a:J

    new-instance v1, Lc0/J0;

    invoke-direct {v1}, Lc0/J0;-><init>()V

    sput-object v1, Lc0/F0;->b:Lc0/J0;

    sget-object v1, Lc0/I0;->h:Landroid/view/View;

    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    new-instance v2, LD/u;

    invoke-direct {v2, v1, v0}, LD/u;-><init>(Landroid/view/View;I)V

    invoke-virtual {v1, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :goto_1
    sget-object v0, Lf0/V;->a:Lf0/V;

    const-string v0, "\u5df2\u4fdd\u5b58\u8f93\u5165\u6846\u63d0\u793a"

    invoke-static {v5, v0}, Lf0/V;->z(Landroid/content/Context;Ljava/lang/String;)V

    sget-object v0, LD0/l;->a:LD0/l;

    return-object v0

    :pswitch_2
    iget-object v8, p0, Lf0/r;->b:Lf0/I;

    invoke-static {v8, v5}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, p0, Lf0/r;->c:Landroid/app/Activity;

    invoke-static {v5, v7}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v7, v8, Lf0/I;->b:Landroid/widget/EditText;

    invoke-virtual {v7}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_4

    goto :goto_2

    :cond_4
    move-object v4, v7

    :goto_2
    sget-object v7, Lc0/h1;->a:Lc0/h1;

    invoke-virtual {v7, v3, v4, v6}, Lc0/h1;->f(Ljava/lang/String;Ljava/lang/String;Z)V

    sget-object v3, Lc0/I0;->a:Lc0/I0;

    sget-object v3, Lc0/F0;->b:Lc0/J0;

    sput-wide v1, Lc0/F0;->a:J

    new-instance v1, Lc0/J0;

    invoke-direct {v1}, Lc0/J0;-><init>()V

    sput-object v1, Lc0/F0;->b:Lc0/J0;

    sget-object v1, Lc0/I0;->h:Landroid/view/View;

    if-nez v1, :cond_5

    goto :goto_3

    :cond_5
    new-instance v2, LD/u;

    invoke-direct {v2, v1, v0}, LD/u;-><init>(Landroid/view/View;I)V

    invoke-virtual {v1, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :goto_3
    sget-object v0, Lf0/V;->a:Lf0/V;

    const-string v0, "\u5df2\u586b\u5165\u5e76\u4fdd\u5b58"

    invoke-static {v5, v0}, Lf0/V;->z(Landroid/content/Context;Ljava/lang/String;)V

    sget-object v0, LD0/l;->a:LD0/l;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
