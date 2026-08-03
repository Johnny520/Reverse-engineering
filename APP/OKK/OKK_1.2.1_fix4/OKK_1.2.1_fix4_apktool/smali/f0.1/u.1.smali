.class public final synthetic Lf0/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP0/a;


# instance fields
.field public final synthetic a:Lf0/I;

.field public final synthetic b:Lf0/I;

.field public final synthetic c:Lf0/I;

.field public final synthetic d:Lf0/I;

.field public final synthetic e:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Lf0/I;Lf0/I;Lf0/I;Lf0/I;Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf0/u;->a:Lf0/I;

    iput-object p2, p0, Lf0/u;->b:Lf0/I;

    iput-object p3, p0, Lf0/u;->c:Lf0/I;

    iput-object p4, p0, Lf0/u;->d:Lf0/I;

    iput-object p5, p0, Lf0/u;->e:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lf0/u;->a:Lf0/I;

    iget-object v1, p0, Lf0/u;->b:Lf0/I;

    iget-object v2, p0, Lf0/u;->c:Lf0/I;

    iget-object v3, p0, Lf0/u;->d:Lf0/I;

    iget-object v4, p0, Lf0/u;->e:Landroid/app/Activity;

    const-string v5, "$chats"

    invoke-static {v0, v5}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "$contacts"

    invoke-static {v1, v5}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "$discover"

    invoke-static {v2, v5}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "$me"

    invoke-static {v3, v5}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "$host"

    invoke-static {v4, v5}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Lf0/I;->b:Landroid/widget/EditText;

    const-string v5, "\u5fae\u4fe1"

    const-string v6, "bottom_tab_title_chats"

    invoke-static {v6, v0, v5}, Lf0/V;->s(Ljava/lang/String;Landroid/widget/EditText;Ljava/lang/String;)V

    iget-object v0, v1, Lf0/I;->b:Landroid/widget/EditText;

    const-string v1, "\u901a\u8baf\u5f55"

    const-string v5, "bottom_tab_title_contacts"

    invoke-static {v5, v0, v1}, Lf0/V;->s(Ljava/lang/String;Landroid/widget/EditText;Ljava/lang/String;)V

    iget-object v0, v2, Lf0/I;->b:Landroid/widget/EditText;

    const-string v1, "\u53d1\u73b0"

    const-string v2, "bottom_tab_title_discover"

    invoke-static {v2, v0, v1}, Lf0/V;->s(Ljava/lang/String;Landroid/widget/EditText;Ljava/lang/String;)V

    iget-object v0, v3, Lf0/I;->b:Landroid/widget/EditText;

    const-string v1, "\u6211"

    const-string v2, "bottom_tab_title_me"

    invoke-static {v2, v0, v1}, Lf0/V;->s(Ljava/lang/String;Landroid/widget/EditText;Ljava/lang/String;)V

    :try_start_0
    sget-object v0, Lc0/y;->a:Ljava/util/List;

    const-wide/16 v0, 0x0

    sput-wide v0, Lc0/y;->b:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :goto_0
    sget-object v0, Lf0/V;->a:Lf0/V;

    const-string v0, "\u5df2\u4fdd\u5b58\uff0c\u91cd\u542f\u5fae\u4fe1\u751f\u6548"

    invoke-static {v4, v0}, Lf0/V;->z(Landroid/content/Context;Ljava/lang/String;)V

    sget-object v0, LD0/l;->a:LD0/l;

    return-object v0
.end method
