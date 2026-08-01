.class public final synthetic Lb81;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic ε:Ld81;

.field public final synthetic ζ:I


# direct methods
.method public synthetic constructor <init>(Ld81;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb81;->ε:Ld81;

    .line 5
    .line 6
    iput p2, p0, Lb81;->ζ:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 0

    .line 1
    iget-object p1, p0, Lb81;->ε:Ld81;

    .line 2
    .line 3
    iget p0, p0, Lb81;->ζ:I

    .line 4
    .line 5
    invoke-virtual {p1, p0}, Ld81;->δ(I)V

    .line 6
    .line 7
    .line 8
    const/4 p0, 0x1

    .line 9
    return p0
.end method
