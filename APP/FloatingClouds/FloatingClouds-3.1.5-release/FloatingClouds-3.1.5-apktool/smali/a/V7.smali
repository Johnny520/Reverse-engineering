.class public final synthetic La/V7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/D7;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:La/Rc;

.field public final synthetic c:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(La/Rc;Landroid/app/Activity;I)V
    .locals 0

    iput p3, p0, La/V7;->a:I

    iput-object p1, p0, La/V7;->b:La/Rc;

    iput-object p2, p0, La/V7;->c:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, La/V7;->a:I

    check-cast p1, Landroid/view/View;

    packed-switch v0, :pswitch_data_0

    const-string v0, "v"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const/4 v1, -0x1

    if-le v0, v1, :cond_0

    iget-object v0, p0, La/V7;->b:La/Rc;

    iget v1, v0, La/Rc;->a:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, La/Rc;->a:I

    new-instance v0, La/W7;

    iget-object v1, p0, La/V7;->c:Landroid/app/Activity;

    const/4 v2, 0x1

    invoke-direct {v0, p1, v1, v2}, La/W7;-><init>(Landroid/view/View;Landroid/app/Activity;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    :cond_0
    sget-object p1, La/Wf;->a:La/Wf;

    return-object p1

    :pswitch_0
    const-string v0, "v"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const/4 v1, -0x1

    if-le v0, v1, :cond_1

    iget-object v0, p0, La/V7;->b:La/Rc;

    iget v1, v0, La/Rc;->a:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, La/Rc;->a:I

    new-instance v0, La/W7;

    iget-object v1, p0, La/V7;->c:Landroid/app/Activity;

    const/4 v2, 0x0

    invoke-direct {v0, p1, v1, v2}, La/W7;-><init>(Landroid/view/View;Landroid/app/Activity;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    :cond_1
    sget-object p1, La/Wf;->a:La/Wf;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
