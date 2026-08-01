.class public final Lbu;
.super Lσ;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final η:Ljava/util/Iterator;

.field public final θ:La80;

.field public final ι:Ljava/util/HashSet;


# direct methods
.method public constructor <init>(Ljava/util/Iterator;La80;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lbu;->η:Ljava/util/Iterator;

    .line 8
    .line 9
    iput-object p2, p0, Lbu;->θ:La80;

    .line 10
    .line 11
    new-instance p1, Ljava/util/HashSet;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lbu;->ι:Ljava/util/HashSet;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final α()V
    .locals 3

    .line 1
    :cond_0
    iget-object v0, p0, Lbu;->η:Ljava/util/Iterator;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Lbu;->θ:La80;

    .line 14
    .line 15
    invoke-interface {v1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget-object v2, p0, Lbu;->ι:Ljava/util/HashSet;

    .line 20
    .line 21
    invoke-virtual {v2, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    iput-object v0, p0, Lσ;->ζ:Ljava/lang/Object;

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    iput v0, p0, Lσ;->ε:I

    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    const/4 v0, 0x2

    .line 34
    iput v0, p0, Lσ;->ε:I

    .line 35
    .line 36
    return-void
.end method
