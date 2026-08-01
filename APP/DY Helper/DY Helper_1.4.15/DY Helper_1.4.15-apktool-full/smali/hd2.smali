.class public final Lhd2;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ltn;
.implements Lfr0;


# instance fields
.field public final ε:Landroidx/compose/ui/platform/AndroidComposeView;

.field public final ζ:Lzn;

.field public η:Z

.field public θ:Ljr0;

.field public ι:Le80;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/platform/AndroidComposeView;Lzn;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lhd2;->ε:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 5
    .line 6
    iput-object p2, p0, Lhd2;->ζ:Lzn;

    .line 7
    .line 8
    sget-object p1, Lcn;->α:Lan;

    .line 9
    .line 10
    iput-object p1, p0, Lhd2;->ι:Le80;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final α()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lhd2;->η:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lhd2;->η:Z

    .line 7
    .line 8
    iget-object v0, p0, Lhd2;->ε:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getView()Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const v1, 0x7f09038f

    .line 15
    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lhd2;->θ:Ljr0;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljr0;->ζ(Lgr0;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    iput-object v2, p0, Lhd2;->θ:Ljr0;

    .line 29
    .line 30
    :cond_1
    iget-object p0, p0, Lhd2;->ζ:Lzn;

    .line 31
    .line 32
    invoke-virtual {p0}, Lzn;->μ()V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final β(Le80;)V
    .locals 2

    .line 1
    new-instance v0, Li3;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-direct {v0, p0, v1, p1}, Li3;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Lhd2;->ε:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/AndroidComposeView;->setOnReadyForComposition(La80;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final κ(Lhr0;Lbr0;)V
    .locals 0

    .line 1
    sget-object p1, Lbr0;->ON_DESTROY:Lbr0;

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lhd2;->α()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    sget-object p1, Lbr0;->ON_CREATE:Lbr0;

    .line 10
    .line 11
    if-ne p2, p1, :cond_1

    .line 12
    .line 13
    iget-boolean p1, p0, Lhd2;->η:Z

    .line 14
    .line 15
    if-nez p1, :cond_1

    .line 16
    .line 17
    iget-object p1, p0, Lhd2;->ι:Le80;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lhd2;->β(Le80;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    return-void
.end method
