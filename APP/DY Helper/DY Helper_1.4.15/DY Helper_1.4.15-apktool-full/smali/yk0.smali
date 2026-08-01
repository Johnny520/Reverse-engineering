.class public final synthetic Lyk0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ε:Lqm1;

.field public final synthetic ζ:Landroid/widget/TextView;

.field public final synthetic η:Landroid/widget/FrameLayout;

.field public final synthetic θ:Lbl0;

.field public final synthetic ι:I


# direct methods
.method public synthetic constructor <init>(Lqm1;Landroid/widget/TextView;Landroid/widget/FrameLayout;Lbl0;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyk0;->ε:Lqm1;

    .line 5
    .line 6
    iput-object p2, p0, Lyk0;->ζ:Landroid/widget/TextView;

    .line 7
    .line 8
    iput-object p3, p0, Lyk0;->η:Landroid/widget/FrameLayout;

    .line 9
    .line 10
    iput-object p4, p0, Lyk0;->θ:Lbl0;

    .line 11
    .line 12
    iput p5, p0, Lyk0;->ι:I

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lyk0;->ε:Lqm1;

    .line 2
    .line 3
    iget-boolean v0, p1, Lqm1;->ε:Z

    .line 4
    .line 5
    xor-int/lit8 v1, v0, 0x1

    .line 6
    .line 7
    iput-boolean v1, p1, Lqm1;->ε:Z

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    move v0, v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/16 v0, 0x8

    .line 15
    .line 16
    :goto_0
    iget-object v2, p0, Lyk0;->ζ:Landroid/widget/TextView;

    .line 17
    .line 18
    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lyk0;->η:Landroid/widget/FrameLayout;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    check-cast v0, Landroid/widget/ImageView;

    .line 31
    .line 32
    iget-boolean v1, p1, Lqm1;->ε:Z

    .line 33
    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    const v1, 0x3f333333    # 0.7f

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const/high16 v1, 0x3f800000    # 1.0f

    .line 41
    .line 42
    :goto_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 43
    .line 44
    .line 45
    iget v0, p0, Lyk0;->ι:I

    .line 46
    .line 47
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iget-boolean p1, p1, Lqm1;->ε:Z

    .line 52
    .line 53
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    iget-object p0, p0, Lyk0;->θ:Lbl0;

    .line 58
    .line 59
    invoke-virtual {p0, v0, p1}, Lbl0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    return-void
.end method
