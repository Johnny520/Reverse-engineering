.class public final LvB;
.super LfG;
.source ""


# instance fields
.field public final synthetic g:I

.field public h:Z

.field public i:I

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LHE;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LvB;->g:I

    const/16 v0, 0x15

    .line 4
    invoke-direct {p0, v0}, LfG;-><init>(I)V

    .line 5
    iput-object p1, p0, LvB;->j:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 6
    iput-boolean p1, p0, LvB;->h:Z

    .line 7
    iput p1, p0, LvB;->i:I

    return-void
.end method

.method public constructor <init>(LwB;I)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LvB;->g:I

    const/16 v0, 0x15

    .line 1
    invoke-direct {p0, v0}, LfG;-><init>(I)V

    .line 2
    iput-object p1, p0, LvB;->j:Ljava/lang/Object;

    iput p2, p0, LvB;->i:I

    const/4 p1, 0x0

    .line 3
    iput-boolean p1, p0, LvB;->h:Z

    return-void
.end method


# virtual methods
.method public final C()V
    .locals 2

    iget v0, p0, LvB;->g:I

    packed-switch v0, :pswitch_data_0

    iget-boolean v0, p0, LvB;->h:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, LvB;->h:Z

    iget-object v0, p0, LvB;->j:Ljava/lang/Object;

    check-cast v0, LHE;

    iget-object v0, v0, LHE;->d:LIE;

    if-eqz v0, :cond_1

    invoke-interface {v0}, LIE;->C()V

    :cond_1
    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p0, LvB;->j:Ljava/lang/Object;

    check-cast v0, LwB;

    iget-object v0, v0, LwB;->a:Landroidx/appcompat/widget/Toolbar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c()V
    .locals 3

    iget v0, p0, LvB;->g:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, LvB;->i:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LvB;->i:I

    iget-object v1, p0, LvB;->j:Ljava/lang/Object;

    check-cast v1, LHE;

    iget-object v2, v1, LHE;->a:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ne v0, v2, :cond_1

    iget-object v0, v1, LHE;->d:LIE;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LIE;->c()V

    :cond_0
    const/4 v0, 0x0

    iput v0, p0, LvB;->i:I

    iput-boolean v0, p0, LvB;->h:Z

    iput-boolean v0, v1, LHE;->e:Z

    :cond_1
    return-void

    :pswitch_0
    iget-boolean v0, p0, LvB;->h:Z

    if-nez v0, :cond_2

    iget-object v0, p0, LvB;->j:Ljava/lang/Object;

    check-cast v0, LwB;

    iget-object v0, v0, LwB;->a:Landroidx/appcompat/widget/Toolbar;

    iget v1, p0, LvB;->i:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public d()V
    .locals 1

    iget v0, p0, LvB;->g:I

    packed-switch v0, :pswitch_data_0

    return-void

    :pswitch_0
    const/4 v0, 0x1

    iput-boolean v0, p0, LvB;->h:Z

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
