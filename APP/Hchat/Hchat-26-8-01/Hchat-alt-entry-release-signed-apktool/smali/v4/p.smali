.class public final Lv4/p;
.super Lv4/e;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public k:Lv4/y;


# virtual methods
.method public final j()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "ifaceMethod"

    .line 2
    .line 3
    return-object v0
.end method

.method public final l()Lv4/y;
    .locals 3

    .line 1
    iget-object v0, p0, Lv4/p;->k:Lv4/y;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lv4/y;

    .line 6
    .line 7
    iget-object v1, p0, Lv4/w;->g:Lv4/d0;

    .line 8
    .line 9
    iget-object v2, p0, Lv4/w;->h:Lv4/z;

    .line 10
    .line 11
    invoke-direct {v0, v1, v2}, Lv4/e;-><init>(Lv4/d0;Lv4/z;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lv4/p;->k:Lv4/y;

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lv4/p;->k:Lv4/y;

    .line 17
    .line 18
    return-object v0
.end method
