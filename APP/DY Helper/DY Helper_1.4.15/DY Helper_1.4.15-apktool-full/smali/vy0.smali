.class public final synthetic Lvy0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ldz0;

.field public final synthetic η:Landroid/widget/TextView;

.field public final synthetic θ:Landroid/widget/Button;

.field public final synthetic ι:Landroid/widget/Button;

.field public final synthetic κ:Landroid/widget/TextView;


# direct methods
.method public synthetic constructor <init>(ILdz0;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lvy0;->ε:I

    .line 5
    .line 6
    iput-object p2, p0, Lvy0;->ζ:Ldz0;

    .line 7
    .line 8
    iput-object p5, p0, Lvy0;->η:Landroid/widget/TextView;

    .line 9
    .line 10
    iput-object p3, p0, Lvy0;->θ:Landroid/widget/Button;

    .line 11
    .line 12
    iput-object p4, p0, Lvy0;->ι:Landroid/widget/Button;

    .line 13
    .line 14
    iput-object p6, p0, Lvy0;->κ:Landroid/widget/TextView;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    .line 1
    iget-object v3, p0, Lvy0;->ι:Landroid/widget/Button;

    .line 2
    .line 3
    iget-object v5, p0, Lvy0;->κ:Landroid/widget/TextView;

    .line 4
    .line 5
    iget v0, p0, Lvy0;->ε:I

    .line 6
    .line 7
    iget-object v1, p0, Lvy0;->ζ:Ldz0;

    .line 8
    .line 9
    iget-object v2, p0, Lvy0;->θ:Landroid/widget/Button;

    .line 10
    .line 11
    iget-object v4, p0, Lvy0;->η:Landroid/widget/TextView;

    .line 12
    .line 13
    invoke-static/range {v0 .. v5}, Ldz0;->λ(ILdz0;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
