.class public final Lsd/a;
.super Lpd/t;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final o:I


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 1
    sget-object v0, Lpd/k;->Z:Lpd/k;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {p0, v0, v1}, Lud/p;-><init>(Lpd/k;I)V

    .line 5
    .line 6
    .line 7
    iput p1, p0, Lsd/a;->o:I

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final O()Lud/p;
    .locals 2

    .line 1
    new-instance v0, Lsd/a;

    .line 2
    .line 3
    iget v1, p0, Lsd/a;->o:I

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lsd/a;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lud/p;->P(Lud/p;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lud/p;->k()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lsd/a;->o:I

    .line 6
    .line 7
    invoke-static {v1}, Lxe/m;->d(I)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {p0}, Lud/p;->M()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const-string v3, " -> "

    .line 16
    .line 17
    invoke-static {v0, v3, v1, v2}, Lwb/en;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0
.end method
