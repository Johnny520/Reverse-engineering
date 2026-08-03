.class public final Lc0/y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/List;

.field public static volatile b:J

.field public static volatile c:Z

.field public static volatile d:Z

.field public static volatile e:Z

.field public static volatile f:Z

.field public static volatile g:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const-string v0, "\u53d1\u73b0"

    const-string v1, "\u6211"

    const-string v2, "\u5fae\u4fe1"

    const-string v3, "\u901a\u8baf\u5f55"

    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LE0/m;->h0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lc0/y;->a:Ljava/util/List;

    const/4 v1, 0x1

    sput-boolean v1, Lc0/y;->e:Z

    sput-boolean v1, Lc0/y;->f:Z

    sput-object v0, Lc0/y;->g:Ljava/util/List;

    return-void
.end method

.method public static a(J)V
    .locals 5

    sget-wide v0, Lc0/y;->b:J

    sub-long v0, p0, v0

    const-wide/16 v2, 0x320

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    sget-wide v0, Lc0/y;->b:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    return-void

    :cond_0
    sput-wide p0, Lc0/y;->b:J

    sget-object p0, Lc0/h1;->a:Lc0/h1;

    const-string p0, "bottom_tab_hide_title"

    const/4 p1, 0x0

    invoke-static {p0, p1}, Lc0/h1;->c(Ljava/lang/String;Z)Z

    move-result p0

    sput-boolean p0, Lc0/y;->c:Z

    const-string p0, "bottom_tab_floating"

    invoke-static {p0, p1}, Lc0/h1;->c(Ljava/lang/String;Z)Z

    move-result p0

    sput-boolean p0, Lc0/y;->d:Z

    const-string p0, "bottom_tab_floating_labels"

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lc0/h1;->c(Ljava/lang/String;Z)Z

    move-result p0

    sput-boolean p0, Lc0/y;->e:Z

    const-string p0, "bottom_tab_floating_badge"

    invoke-static {p0, v0}, Lc0/h1;->c(Ljava/lang/String;Z)Z

    move-result p0

    sput-boolean p0, Lc0/y;->f:Z

    sget-object p0, Lc0/y;->a:Ljava/util/List;

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "bottom_tab_title_chats"

    invoke-static {v2, v1}, Lc0/h1;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Ljava/lang/String;

    :cond_1
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    const-string v2, "bottom_tab_title_contacts"

    invoke-static {v2, p1}, Lc0/h1;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    :cond_2
    const/4 v0, 0x2

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, "bottom_tab_title_discover"

    invoke-static {v3, v2}, Lc0/h1;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    :cond_3
    const/4 v0, 0x3

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v4, "bottom_tab_title_me"

    invoke-static {v4, v3}, Lc0/h1;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Ljava/lang/String;

    :cond_4
    filled-new-array {v1, p1, v2, v3}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, LE0/m;->h0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    sput-object p0, Lc0/y;->g:Ljava/util/List;

    return-void
.end method

.method public static b()Z
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lc0/y;->a(J)V

    sget-boolean v0, Lc0/y;->d:Z

    return v0
.end method

.method public static c()Ljava/util/List;
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lc0/y;->a(J)V

    sget-object v0, Lc0/y;->g:Ljava/util/List;

    return-object v0
.end method

.method public static d()Z
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lc0/y;->a(J)V

    sget-boolean v0, Lc0/y;->d:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    sget-boolean v0, Lc0/y;->c:Z

    :goto_0
    return v0
.end method
