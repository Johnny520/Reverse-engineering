.class public final Lpl;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Li00;Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lpl;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lpl;->b:Ljava/lang/Object;

    iput-object p2, p0, Lpl;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lql;Landroidx/fragment/app/a;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lpl;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpl;->c:Ljava/lang/Object;

    iput-object p2, p0, Lpl;->b:Ljava/lang/Object;

    return-void
.end method

.method private final a(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 2

    .line 1
    iget v0, p0, Lpl;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "ZA==\n"

    .line 7
    .line 8
    const-string v1, "ElH1bmmP0/k=\n"

    .line 9
    .line 10
    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-object p1, p0, Lpl;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, Landroidx/fragment/app/a;

    .line 21
    .line 22
    iget-object v0, p1, Landroidx/fragment/app/a;->c:Lml;

    .line 23
    .line 24
    invoke-virtual {p1}, Landroidx/fragment/app/a;->k()V

    .line 25
    .line 26
    .line 27
    iget-object p1, v0, Lml;->E:Landroid/view/View;

    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, Landroid/view/ViewGroup;

    .line 34
    .line 35
    iget-object v0, p0, Lpl;->c:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Lql;

    .line 38
    .line 39
    iget-object v0, v0, Lql;->a:Lyl;

    .line 40
    .line 41
    invoke-virtual {v0}, Lyl;->y()Lvh;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {p1, v0}, Lcg;->f(Landroid/view/ViewGroup;Lvh;)Lcg;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p1}, Lcg;->e()V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 2

    .line 1
    iget v0, p0, Lpl;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "3w==\n"

    .line 7
    .line 8
    const-string v1, "qZwR1n1Fv/g=\n"

    .line 9
    .line 10
    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Lpl;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p1, Li00;

    .line 20
    .line 21
    iget-object p1, p1, Li00;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p1, Landroid/animation/ValueAnimator;

    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->cancel()V

    .line 28
    .line 29
    .line 30
    :cond_0
    iget-object p1, p0, Lpl;->c:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p1, Landroid/view/View;

    .line 33
    .line 34
    const v0, 0x7e090005

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    instance-of v0, p1, Lh40;

    .line 42
    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    check-cast p1, Lh40;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    const/4 p1, 0x0

    .line 49
    :goto_0
    if-eqz p1, :cond_2

    .line 50
    .line 51
    invoke-virtual {p1}, Lh40;->c()V

    .line 52
    .line 53
    .line 54
    :cond_2
    :pswitch_0
    return-void

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
