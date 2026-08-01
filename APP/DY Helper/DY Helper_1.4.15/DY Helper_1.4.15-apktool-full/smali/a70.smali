.class public final La70;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lz60;


# instance fields
.field public final α:I

.field public final synthetic β:Lb70;


# direct methods
.method public constructor <init>(Lb70;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La70;->β:Lb70;

    .line 5
    .line 6
    iput p2, p0, La70;->α:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final α(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z
    .locals 4

    .line 1
    iget-object v0, p0, La70;->β:Lb70;

    .line 2
    .line 3
    iget-object v1, v0, Lb70;->ψ:Ln60;

    .line 4
    .line 5
    iget p0, p0, La70;->α:I

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    if-gez p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Ln60;->ζ()Lb70;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v2, -0x1

    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-virtual {v1, v2, v3}, Lb70;->Ο(II)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    return v3

    .line 24
    :cond_0
    const/4 v1, 0x1

    .line 25
    invoke-virtual {v0, p1, p2, p0, v1}, Lb70;->Π(Ljava/util/ArrayList;Ljava/util/ArrayList;II)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    return p0
.end method
