.class public final synthetic LW0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LUn;


# instance fields
.field public final synthetic a:Lc1;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:LR0;

.field public final synthetic d:LT0;


# direct methods
.method public synthetic constructor <init>(Lc1;Ljava/lang/String;LR0;LT0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LW0;->a:Lc1;

    iput-object p2, p0, LW0;->b:Ljava/lang/String;

    iput-object p3, p0, LW0;->c:LR0;

    iput-object p4, p0, LW0;->d:LT0;

    return-void
.end method


# virtual methods
.method public final onStateChanged(LYn;LOn;)V
    .locals 5

    iget-object p1, p0, LW0;->a:Lc1;

    iget-object v0, p1, Lc1;->e:Ljava/util/LinkedHashMap;

    sget-object v1, LOn;->ON_START:LOn;

    iget-object v2, p0, LW0;->b:Ljava/lang/String;

    if-ne v1, p2, :cond_1

    iget-object p2, p1, Lc1;->g:Landroid/os/Bundle;

    iget-object p1, p1, Lc1;->f:Ljava/util/LinkedHashMap;

    new-instance v1, LX0;

    iget-object v3, p0, LW0;->d:LT0;

    iget-object v4, p0, LW0;->c:LR0;

    invoke-direct {v1, v3, v4}, LX0;-><init>(LT0;LR0;)V

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v4, v0}, LR0;->a(Ljava/lang/Object;)V

    :cond_0
    invoke-static {p2, v2}, LPj;->m(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LQ0;

    if-eqz p1, :cond_3

    invoke-virtual {p2, v2}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    iget p2, p1, LQ0;->a:I

    iget-object p1, p1, LQ0;->b:Landroid/content/Intent;

    invoke-virtual {v3, p1, p2}, LT0;->c(Landroid/content/Intent;I)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v4, p1}, LR0;->a(Ljava/lang/Object;)V

    return-void

    :cond_1
    sget-object v1, LOn;->ON_STOP:LOn;

    if-ne v1, p2, :cond_2

    invoke-interface {v0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_2
    sget-object v0, LOn;->ON_DESTROY:LOn;

    if-ne v0, p2, :cond_3

    invoke-virtual {p1, v2}, Lc1;->e(Ljava/lang/String;)V

    :cond_3
    return-void
.end method
