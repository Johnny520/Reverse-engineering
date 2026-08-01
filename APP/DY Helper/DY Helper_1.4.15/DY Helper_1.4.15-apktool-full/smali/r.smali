.class public final Lr;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Landroid/view/ContextThemeWrapper;

.field public final β:Landroid/view/LayoutInflater;

.field public γ:Landroid/graphics/drawable/Drawable;

.field public δ:Ljava/lang/CharSequence;

.field public ε:Landroid/view/View;

.field public ζ:Ljz0;

.field public η:Ljava/lang/Object;

.field public θ:Landroid/content/DialogInterface$OnClickListener;

.field public ι:Z

.field public κ:I


# direct methods
.method public constructor <init>(Landroid/view/ContextThemeWrapper;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lr;->κ:I

    .line 6
    .line 7
    iput-object p1, p0, Lr;->α:Landroid/view/ContextThemeWrapper;

    .line 8
    .line 9
    const-string v0, "layout_inflater"

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Landroid/view/LayoutInflater;

    .line 16
    .line 17
    iput-object p1, p0, Lr;->β:Landroid/view/LayoutInflater;

    .line 18
    .line 19
    return-void
.end method
