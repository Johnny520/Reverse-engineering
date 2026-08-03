.class public final synthetic LJa;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lpt;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lki;


# direct methods
.method public synthetic constructor <init>(Lki;I)V
    .locals 0

    iput p2, p0, LJa;->a:I

    iput-object p1, p0, LJa;->b:Lki;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 11

    iget v0, p0, LJa;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LJa;->b:Lki;

    check-cast v0, Lc3;

    iget-object v0, v0, Lki;->u:LD2;

    iget-object v0, v0, LD2;->b:Ljava/lang/Object;

    check-cast v0, Lji;

    iget-object v1, v0, Lji;->o:LAi;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v0, v2}, Lzi;->b(Lji;LTB;Lhi;)V

    return-void

    :pswitch_0
    iget-object v0, p0, LJa;->b:Lki;

    invoke-virtual {v0}, LTa;->getSavedStateRegistry()Lhx;

    move-result-object v1

    const-string v2, "android:support:activity-result"

    invoke-virtual {v1, v2}, Lhx;->a(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_6

    iget-object v0, v0, LTa;->j:LQa;

    iget-object v2, v0, Lc1;->b:Ljava/util/LinkedHashMap;

    iget-object v3, v0, Lc1;->a:Ljava/util/LinkedHashMap;

    iget-object v4, v0, Lc1;->g:Landroid/os/Bundle;

    const-string v5, "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS"

    invoke-virtual {v1, v5}, Landroid/os/Bundle;->getIntegerArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v5

    const-string v6, "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS"

    invoke-virtual {v1, v6}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v6

    if-eqz v6, :cond_6

    if-nez v5, :cond_0

    goto :goto_2

    :cond_0
    const-string v7, "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS"

    invoke-virtual {v1, v7}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v7

    if-eqz v7, :cond_1

    iget-object v8, v0, Lc1;->d:Ljava/util/ArrayList;

    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_1
    const-string v7, "KEY_COMPONENT_ACTIVITY_PENDING_RESULT"

    invoke-virtual {v1, v7}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v4, v1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    :cond_2
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v1, :cond_6

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-interface {v2, v8}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5

    invoke-interface {v2, v8}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Integer;

    invoke-virtual {v4, v8}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_5

    instance-of v8, v3, LMm;

    if-eqz v8, :cond_4

    instance-of v8, v3, LOm;

    if-eqz v8, :cond_3

    goto :goto_1

    :cond_3
    const-string v0, "kotlin.collections.MutableMap"

    invoke-static {v0, v3}, LTB;->I(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v0, 0x0

    throw v0

    :cond_4
    :goto_1
    invoke-interface {v3, v9}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v3, v10, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    iget-object v10, v0, Lc1;->b:Ljava/util/LinkedHashMap;

    invoke-interface {v10, v9, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_6
    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
