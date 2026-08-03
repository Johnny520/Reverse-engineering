.class public final Lqi;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LR0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lzi;


# direct methods
.method public synthetic constructor <init>(Lzi;I)V
    .locals 0

    iput p2, p0, Lqi;->a:I

    iput-object p1, p0, Lqi;->b:Lzi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 4

    iget v0, p0, Lqi;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, LQ0;

    iget-object v0, p0, Lqi;->b:Lzi;

    iget-object v1, v0, Lzi;->D:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwi;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, v1, Lwi;->a:Ljava/lang/String;

    iget-object v0, v0, Lzi;->c:Lqs;

    invoke-virtual {v0, v1}, Lqs;->o(Ljava/lang/String;)Lhi;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    iget v1, p1, LQ0;->a:I

    iget-object p1, p1, LQ0;->b:Landroid/content/Intent;

    const/4 v1, 0x2

    invoke-static {v1}, Lzi;->G(I)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lhi;->toString()Ljava/lang/String;

    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_2
    :goto_0
    return-void

    :pswitch_0
    check-cast p1, LQ0;

    iget-object v0, p0, Lqi;->b:Lzi;

    iget-object v1, v0, Lzi;->D:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pollLast()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwi;

    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    iget-object v1, v1, Lwi;->a:Ljava/lang/String;

    iget-object v0, v0, Lzi;->c:Lqs;

    invoke-virtual {v0, v1}, Lqs;->o(Ljava/lang/String;)Lhi;

    move-result-object v0

    if-nez v0, :cond_4

    goto :goto_1

    :cond_4
    iget v1, p1, LQ0;->a:I

    iget-object p1, p1, LQ0;->b:Landroid/content/Intent;

    const/4 v1, 0x2

    invoke-static {v1}, Lzi;->G(I)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {v0}, Lhi;->toString()Ljava/lang/String;

    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_5
    :goto_1
    return-void

    :pswitch_1
    check-cast p1, Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/String;

    invoke-interface {v0, v2}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-array p1, p1, [I

    move v2, v1

    :goto_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_7

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_6

    move v3, v1

    goto :goto_3

    :cond_6
    const/4 v3, -0x1

    :goto_3
    aput v3, p1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_7
    iget-object p1, p0, Lqi;->b:Lzi;

    iget-object v0, p1, Lzi;->D:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwi;

    if-nez v0, :cond_8

    goto :goto_4

    :cond_8
    iget-object v0, v0, Lwi;->a:Ljava/lang/String;

    iget-object p1, p1, Lzi;->c:Lqs;

    invoke-virtual {p1, v0}, Lqs;->o(Ljava/lang/String;)Lhi;

    :goto_4
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
