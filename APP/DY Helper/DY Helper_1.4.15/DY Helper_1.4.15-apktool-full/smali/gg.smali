.class public final synthetic Lgg;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:Landroid/view/View;

.field public final synthetic ζ:I

.field public final synthetic η:Ljava/lang/String;

.field public final synthetic θ:Ljava/lang/String;

.field public final synthetic ι:Z


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;ILjava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lgg;->ε:Landroid/view/View;

    .line 5
    .line 6
    iput p2, p0, Lgg;->ζ:I

    .line 7
    .line 8
    iput-object p3, p0, Lgg;->η:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lgg;->θ:Ljava/lang/String;

    .line 11
    .line 12
    iput-boolean p5, p0, Lgg;->ι:Z

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget-boolean v5, p0, Lgg;->ι:Z

    .line 2
    .line 3
    sget-object v0, Lug;->α:Ltg;

    .line 4
    .line 5
    iget-object v1, p0, Lgg;->ε:Landroid/view/View;

    .line 6
    .line 7
    iget v2, p0, Lgg;->ζ:I

    .line 8
    .line 9
    iget-object v3, p0, Lgg;->η:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v4, p0, Lgg;->θ:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual/range {v0 .. v5}, Ltg;->в(Landroid/view/View;ILjava/lang/String;Ljava/lang/String;Z)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
