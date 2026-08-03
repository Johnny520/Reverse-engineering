.class public final synthetic Lc0/N;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroid/view/View;

.field public final synthetic b:J

.field public final synthetic c:I

.field public final synthetic d:Z

.field public final synthetic e:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;JIZLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc0/N;->a:Landroid/view/View;

    iput-wide p2, p0, Lc0/N;->b:J

    iput p4, p0, Lc0/N;->c:I

    iput-boolean p5, p0, Lc0/N;->d:Z

    iput-object p6, p0, Lc0/N;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    iget-object v7, p0, Lc0/N;->a:Landroid/view/View;

    const-string v0, "$bubble"

    invoke-static {v7, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, Lc0/N;->e:Ljava/lang/String;

    const-string v0, "$messageContent"

    invoke-static {v3, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f090011

    invoke-virtual {v7, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Long;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Long;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iget-wide v4, p0, Lc0/N;->b:J

    cmp-long v0, v0, v4

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    const v0, 0x7f090012

    invoke-virtual {v7, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Integer;

    if-eqz v1, :cond_3

    check-cast v0, Ljava/lang/Integer;

    goto :goto_1

    :cond_3
    move-object v0, v2

    :goto_1
    if-nez v0, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget v6, p0, Lc0/N;->c:I

    if-eq v0, v6, :cond_5

    goto :goto_2

    :cond_5
    const v0, 0x7f090010

    invoke-virtual {v7, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Boolean;

    if-eqz v1, :cond_6

    move-object v2, v0

    check-cast v2, Ljava/lang/Boolean;

    :cond_6
    iget-boolean v8, p0, Lc0/N;->d:Z

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v2, v0}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_2

    :cond_7
    sget-object v0, Lc0/a0;->a:Lc0/a0;

    const/4 v9, 0x0

    move-object v0, v7

    move v1, v8

    move v2, v6

    move v6, v9

    invoke-static/range {v0 .. v6}, Lc0/a0;->e0(Landroid/view/View;ZILjava/lang/String;JZ)V

    invoke-static {v7, v8}, Lc0/a0;->h(Landroid/view/View;Z)V

    :goto_2
    return-void
.end method
