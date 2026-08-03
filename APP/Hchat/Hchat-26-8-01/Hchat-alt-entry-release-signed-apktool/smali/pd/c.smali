.class public final Lpd/c;
.super Lud/p;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final o:Lqd/j;


# direct methods
.method public constructor <init>(Lqd/j;)V
    .locals 2

    .line 1
    sget-object v0, Lpd/k;->i:Lpd/k;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {p0, v0, v1}, Lud/p;-><init>(Lpd/k;I)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lpd/c;->o:Lqd/j;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final O()Lud/p;
    .locals 2

    .line 1
    new-instance v0, Lpd/c;

    .line 2
    .line 3
    iget-object v1, p0, Lpd/c;->o:Lqd/j;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lpd/c;-><init>(Lqd/j;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lud/p;->P(Lud/p;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public final Y(Lud/p;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    instance-of v0, p1, Lpd/c;

    .line 6
    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    invoke-super {p0, p1}, Lud/p;->Y(Lud/p;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    check-cast p1, Lpd/c;

    .line 17
    .line 18
    iget-object v0, p0, Lpd/c;->o:Lqd/j;

    .line 19
    .line 20
    iget-object p1, p1, Lpd/c;->o:Lqd/j;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Lqd/j;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    return p1

    .line 27
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 28
    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    invoke-super {p0}, Lud/p;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lpd/c;->o:Lqd/j;

    .line 6
    .line 7
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, " "

    .line 12
    .line 13
    const-string v3, ".class"

    .line 14
    .line 15
    invoke-static {v0, v2, v1, v3}, Lwb/en;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
.end method
