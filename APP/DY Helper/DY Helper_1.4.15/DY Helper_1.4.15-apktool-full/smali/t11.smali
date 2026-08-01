.class public final Lt11;
.super Lcx0;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Loo0;


# instance fields
.field public final θ:Lka1;

.field public ι:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lka1;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p2, v0, p3}, Lcx0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Lt11;->θ:Lka1;

    .line 6
    .line 7
    iput-object p3, p0, Lt11;->ι:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final getValue()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lt11;->ι:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public final setValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lt11;->ι:Ljava/lang/Object;

    .line 2
    .line 3
    iput-object p1, p0, Lt11;->ι:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v1, p0, Lt11;->θ:Lka1;

    .line 6
    .line 7
    iget-object v1, v1, Lka1;->ε:Lia1;

    .line 8
    .line 9
    iget-object v2, v1, Lia1;->θ:Lfa1;

    .line 10
    .line 11
    iget-object p0, p0, Lcx0;->ζ:Ljava/lang/Object;

    .line 12
    .line 13
    invoke-virtual {v2, p0}, Lfa1;->containsKey(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-nez v3, :cond_0

    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_0
    iget-boolean v3, v1, Lha1;->η:Z

    .line 21
    .line 22
    if-eqz v3, :cond_3

    .line 23
    .line 24
    if-eqz v3, :cond_2

    .line 25
    .line 26
    iget-object v3, v1, Lha1;->ε:[La62;

    .line 27
    .line 28
    iget v4, v1, Lha1;->ζ:I

    .line 29
    .line 30
    aget-object v3, v3, v4

    .line 31
    .line 32
    iget-object v4, v3, La62;->ε:[Ljava/lang/Object;

    .line 33
    .line 34
    iget v3, v3, La62;->η:I

    .line 35
    .line 36
    aget-object v3, v4, v3

    .line 37
    .line 38
    invoke-virtual {v2, p0, p1}, Lfa1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    const/4 p0, 0x0

    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    goto :goto_0

    .line 49
    :cond_1
    move p1, p0

    .line 50
    :goto_0
    iget-object v4, v2, Lfa1;->ζ:Lz52;

    .line 51
    .line 52
    invoke-virtual {v1, p1, v4, v3, p0}, Lia1;->γ(ILz52;Ljava/lang/Object;I)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    invoke-static {}, Lγ;->ο()V

    .line 57
    .line 58
    .line 59
    const/4 p0, 0x0

    .line 60
    return-object p0

    .line 61
    :cond_3
    invoke-virtual {v2, p0, p1}, Lfa1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    :goto_1
    iget p0, v2, Lfa1;->θ:I

    .line 65
    .line 66
    iput p0, v1, Lia1;->λ:I

    .line 67
    .line 68
    return-object v0
.end method
