.class public final Lbr1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lx81;


# instance fields
.field public final ε:I

.field public final ζ:Ljava/util/List;


# direct methods
.method public constructor <init>(ILjava/util/ArrayList;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lbr1;->ε:I

    .line 5
    .line 6
    iput-object p2, p0, Lbr1;->ζ:Ljava/util/List;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final χ()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lbr1;->ζ:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
