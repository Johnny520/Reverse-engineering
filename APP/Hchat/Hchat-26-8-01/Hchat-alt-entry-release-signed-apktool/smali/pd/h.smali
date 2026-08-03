.class public Lpd/h;
.super Lpd/t;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final o:I


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 1
    sget-object v0, Lpd/k;->q:Lpd/k;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {p0, v0, p1, v1}, Lpd/h;-><init>(Lpd/k;II)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public constructor <init>(Lpd/k;II)V
    .locals 0

    .line 8
    invoke-direct {p0, p1, p3}, Lud/p;-><init>(Lpd/k;I)V

    .line 9
    iput p2, p0, Lpd/h;->o:I

    return-void
.end method


# virtual methods
.method public O()Lud/p;
    .locals 2

    .line 1
    new-instance v0, Lpd/h;

    .line 2
    .line 3
    iget v1, p0, Lpd/h;->o:I

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lpd/h;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lud/p;->P(Lud/p;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public k0()I
    .locals 1

    .line 1
    iget v0, p0, Lpd/h;->o:I

    .line 2
    .line 3
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-super {p0}, Lud/p;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lpd/h;->o:I

    .line 6
    .line 7
    invoke-static {v1}, Lxe/m;->d(I)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "-> "

    .line 12
    .line 13
    invoke-static {v0, v2, v1}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method
