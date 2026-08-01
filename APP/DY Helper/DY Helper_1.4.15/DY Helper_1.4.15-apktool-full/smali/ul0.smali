.class public final Lul0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Lb1;

.field public β:I

.field public γ:Z

.field public final δ:Landroid/view/GestureDetector;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lb1;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lul0;->α:Lb1;

    .line 5
    .line 6
    const/4 p2, 0x0

    .line 7
    iput p2, p0, Lul0;->β:I

    .line 8
    .line 9
    new-instance p2, Landroid/view/GestureDetector;

    .line 10
    .line 11
    new-instance v0, Ltl0;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Ltl0;-><init>(Lul0;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p2, p1, v0}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    .line 17
    .line 18
    .line 19
    iput-object p2, p0, Lul0;->δ:Landroid/view/GestureDetector;

    .line 20
    .line 21
    return-void
.end method
