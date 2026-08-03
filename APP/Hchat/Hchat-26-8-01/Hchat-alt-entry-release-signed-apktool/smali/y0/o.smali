.class public interface abstract Ly0/o;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# virtual methods
.method public abstract a(Lfg/l;)Z
.end method

.method public abstract b(Lfg/p;Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public d(Ly0/o;)Ly0/o;
    .locals 1

    .line 1
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Ly0/i;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Ly0/i;-><init>(Ly0/o;Ly0/o;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
