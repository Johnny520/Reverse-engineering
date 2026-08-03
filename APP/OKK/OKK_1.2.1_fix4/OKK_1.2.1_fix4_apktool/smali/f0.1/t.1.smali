.class public final synthetic Lf0/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP0/a;


# instance fields
.field public final synthetic a:Lf0/I;

.field public final synthetic b:Lf0/I;

.field public final synthetic c:Lf0/I;

.field public final synthetic d:Lf0/I;

.field public final synthetic e:Lf0/I;

.field public final synthetic f:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Lf0/I;Lf0/I;Lf0/I;Lf0/I;Lf0/I;Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf0/t;->a:Lf0/I;

    iput-object p2, p0, Lf0/t;->b:Lf0/I;

    iput-object p3, p0, Lf0/t;->c:Lf0/I;

    iput-object p4, p0, Lf0/t;->d:Lf0/I;

    iput-object p5, p0, Lf0/t;->e:Lf0/I;

    iput-object p6, p0, Lf0/t;->f:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lf0/t;->a:Lf0/I;

    iget-object v1, p0, Lf0/t;->b:Lf0/I;

    iget-object v2, p0, Lf0/t;->c:Lf0/I;

    iget-object v3, p0, Lf0/t;->d:Lf0/I;

    iget-object v4, p0, Lf0/t;->e:Lf0/I;

    iget-object v5, p0, Lf0/t;->f:Landroid/app/Activity;

    const-string v6, "$template"

    invoke-static {v0, v6}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "$pattern"

    invoke-static {v1, v6}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "$size"

    invoke-static {v2, v6}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "$light"

    invoke-static {v3, v6}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "$dark"

    invoke-static {v4, v6}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "$host"

    invoke-static {v5, v6}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, Lc0/h1;->a:Lc0/h1;

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

    move-result v6

    if-eqz v6, :cond_0

    const-string v0, "${time} ${relativeTime}"

    :cond_0
    new-instance v6, LD0/e;

    const-string v7, "detail_template"

    invoke-direct {v6, v7, v0}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, v1, Lf0/I;->b:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v0, "MM-dd HH:mm:ss"

    :cond_1
    new-instance v1, LD0/e;

    const-string v7, "detail_time_pattern"

    invoke-direct {v1, v7, v0}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, v2, Lf0/I;->b:Landroid/widget/EditText;

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

    if-eqz v2, :cond_2

    const-string v0, "12"

    :cond_2
    new-instance v2, LD0/e;

    const-string v7, "detail_text_size"

    invoke-direct {v2, v7, v0}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, v3, Lf0/I;->b:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_3

    const-string v0, "#E6000000"

    :cond_3
    new-instance v3, LD0/e;

    const-string v7, "detail_text_color_light"

    invoke-direct {v3, v7, v0}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, v4, Lf0/I;->b:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_4

    const-string v0, "#CCFFFFFF"

    :cond_4
    new-instance v4, LD0/e;

    const-string v7, "detail_text_color_dark"

    invoke-direct {v4, v7, v0}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v6, v1, v2, v3, v4}, [LD0/e;

    move-result-object v0

    invoke-static {v0}, LE0/x;->h0([LD0/e;)Ljava/util/Map;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Lc0/h1;->i(Z)V

    sget-object v2, Lc0/h1;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->putAll(Ljava/util/Map;)V

    invoke-static {v1}, Lc0/h1;->b(Z)V

    sget-object v0, Lc0/S0;->b:Lc0/T0;

    const-wide/16 v0, 0x0

    sput-wide v0, Lc0/S0;->a:J

    new-instance v0, Lc0/T0;

    invoke-direct {v0}, Lc0/T0;-><init>()V

    sput-object v0, Lc0/S0;->b:Lc0/T0;

    sget-object v0, Lf0/V;->a:Lf0/V;

    const-string v0, "\u5df2\u4fdd\u5b58\u6d88\u606f\u65f6\u95f4\u8bbe\u7f6e"

    invoke-static {v5, v0}, Lf0/V;->z(Landroid/content/Context;Ljava/lang/String;)V

    sget-object v0, LD0/l;->a:LD0/l;

    return-object v0
.end method
