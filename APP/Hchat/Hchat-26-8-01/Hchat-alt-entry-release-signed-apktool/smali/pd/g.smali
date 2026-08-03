.class public final Lpd/g;
.super Lud/p;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final o:Lqd/j;


# direct methods
.method public constructor <init>(ILqd/j;)V
    .locals 1

    .line 1
    sget-object v0, Lpd/k;->F:Lpd/k;

    .line 2
    .line 3
    invoke-direct {p0, v0, p1}, Lud/p;-><init>(Lpd/k;I)V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lpd/g;->o:Lqd/j;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final O()Lud/p;
    .locals 3

    .line 1
    new-instance v0, Lpd/g;

    .line 2
    .line 3
    iget-object v1, p0, Lud/p;->m:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, p0, Lpd/g;->o:Lqd/j;

    .line 10
    .line 11
    invoke-direct {v0, v1, v2}, Lpd/g;-><init>(ILqd/j;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lud/p;->P(Lud/p;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final Y(Lud/p;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lpd/g;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_2

    .line 9
    .line 10
    invoke-super {p0, p1}, Lud/p;->Y(Lud/p;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    check-cast p1, Lpd/g;

    .line 18
    .line 19
    iget-object v1, p0, Lpd/g;->o:Lqd/j;

    .line 20
    .line 21
    iget-object p1, p1, Lpd/g;->o:Lqd/j;

    .line 22
    .line 23
    if-ne v1, p1, :cond_2

    .line 24
    .line 25
    return v0

    .line 26
    :cond_2
    :goto_0
    return v2
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-super {p0}, Lud/p;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lpd/g;->o:Lqd/j;

    .line 6
    .line 7
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, " elemType: "

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
