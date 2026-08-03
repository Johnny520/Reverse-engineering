.class public final Lbc/m;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lud/g;


# direct methods
.method public constructor <init>(Lud/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbc/m;->a:Lud/g;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-eq p0, p1, :cond_1

    .line 2
    .line 3
    instance-of v0, p1, Lbc/m;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p1, Lbc/m;

    .line 8
    .line 9
    iget-object p1, p1, Lbc/m;->a:Lud/g;

    .line 10
    .line 11
    iget-object v0, p0, Lbc/m;->a:Lud/g;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lud/g;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    return p1

    .line 22
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 23
    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lbc/m;->a:Lud/g;

    .line 2
    .line 3
    iget-object v0, v0, Lud/g;->l:Lod/c;

    .line 4
    .line 5
    invoke-virtual {v0}, Lod/c;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lbc/m;->a:Lud/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Lud/g;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
