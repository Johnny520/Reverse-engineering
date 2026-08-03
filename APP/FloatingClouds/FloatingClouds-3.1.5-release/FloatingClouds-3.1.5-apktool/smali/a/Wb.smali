.class public final La/Wb;
.super La/u9;
.source "SourceFile"

# interfaces
.implements La/s7;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Landroidx/activity/OnBackPressedDispatcher;


# direct methods
.method public synthetic constructor <init>(Landroidx/activity/OnBackPressedDispatcher;I)V
    .locals 0

    iput p2, p0, La/Wb;->b:I

    iput-object p1, p0, La/Wb;->c:Landroidx/activity/OnBackPressedDispatcher;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, La/u9;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 5

    iget v0, p0, La/Wb;->b:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La/Wb;->c:Landroidx/activity/OnBackPressedDispatcher;

    invoke-virtual {v0}, Landroidx/activity/OnBackPressedDispatcher;->b()V

    sget-object v0, La/Wf;->a:La/Wf;

    return-object v0

    :pswitch_0
    iget-object v0, p0, La/Wb;->c:Landroidx/activity/OnBackPressedDispatcher;

    iget-object v1, v0, Landroidx/activity/OnBackPressedDispatcher;->c:La/Ub;

    const/4 v2, 0x0

    if-nez v1, :cond_2

    iget-object v1, v0, Landroidx/activity/OnBackPressedDispatcher;->b:La/F1;

    invoke-virtual {v1}, La/x;->size()I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/util/AbstractList;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, La/Ub;

    iget-boolean v4, v4, La/Ub;->a:Z

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_1
    move-object v3, v2

    :goto_0
    move-object v1, v3

    check-cast v1, La/Ub;

    :cond_2
    iput-object v2, v0, Landroidx/activity/OnBackPressedDispatcher;->c:La/Ub;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, La/Ub;->a()V

    :cond_3
    sget-object v0, La/Wf;->a:La/Wf;

    return-object v0

    :pswitch_1
    iget-object v0, p0, La/Wb;->c:Landroidx/activity/OnBackPressedDispatcher;

    invoke-virtual {v0}, Landroidx/activity/OnBackPressedDispatcher;->b()V

    sget-object v0, La/Wf;->a:La/Wf;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
