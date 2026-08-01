.class public final Ld2;
.super Lv01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lv01;"
    }
.end annotation


# instance fields
.field public final synthetic α:Le2;


# direct methods
.method public constructor <init>(Le2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ld2;->α:Le2;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    const/4 p0, 0x0

    .line 6
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Ld2;->α:Le2;

    .line 2
    .line 3
    iget-object p0, p0, Le2;->α:Lmv;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final δ()Lq01;
    .locals 0

    .line 1
    iget-object p0, p0, Ld2;->α:Le2;

    .line 2
    .line 3
    iget-object p0, p0, Le2;->α:Lmv;

    .line 4
    .line 5
    return-object p0
.end method

.method public final bridge synthetic ε(Lq01;)V
    .locals 0

    .line 1
    check-cast p1, Lmv;

    .line 2
    .line 3
    return-void
.end method
