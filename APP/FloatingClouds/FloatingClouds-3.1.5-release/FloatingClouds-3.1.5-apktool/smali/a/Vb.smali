.class public final La/Vb;
.super La/u9;
.source "SourceFile"

# interfaces
.implements La/D7;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Landroidx/activity/OnBackPressedDispatcher;


# direct methods
.method public synthetic constructor <init>(Landroidx/activity/OnBackPressedDispatcher;I)V
    .locals 0

    iput p2, p0, La/Vb;->b:I

    iput-object p1, p0, La/Vb;->c:Landroidx/activity/OnBackPressedDispatcher;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, La/u9;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, La/Vb;->b:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, La/R1;

    const-string v0, "backEvent"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, La/Vb;->c:Landroidx/activity/OnBackPressedDispatcher;

    iget-object v1, v0, Landroidx/activity/OnBackPressedDispatcher;->c:La/Ub;

    if-nez v1, :cond_2

    iget-object v0, v0, Landroidx/activity/OnBackPressedDispatcher;->b:La/F1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v1, v0, La/F1;->c:I

    invoke-virtual {v0, v1}, Ljava/util/AbstractList;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, La/Ub;

    iget-boolean v2, v2, La/Ub;->a:Z

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, La/Ub;

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {v1, p1}, La/Ub;->c(La/R1;)V

    :cond_3
    sget-object p1, La/Wf;->a:La/Wf;

    return-object p1

    :pswitch_0
    check-cast p1, La/R1;

    const-string v0, "backEvent"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, La/Vb;->c:Landroidx/activity/OnBackPressedDispatcher;

    iget-object v1, v0, Landroidx/activity/OnBackPressedDispatcher;->b:La/F1;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v2, v1, La/F1;->c:I

    invoke-virtual {v1, v2}, Ljava/util/AbstractList;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v1

    :cond_4
    invoke-interface {v1}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, La/Ub;

    iget-boolean v3, v3, La/Ub;->a:Z

    if-eqz v3, :cond_4

    goto :goto_1

    :cond_5
    const/4 v2, 0x0

    :goto_1
    check-cast v2, La/Ub;

    iput-object v2, v0, Landroidx/activity/OnBackPressedDispatcher;->c:La/Ub;

    if-eqz v2, :cond_6

    invoke-virtual {v2, p1}, La/Ub;->d(La/R1;)V

    :cond_6
    sget-object p1, La/Wf;->a:La/Wf;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
