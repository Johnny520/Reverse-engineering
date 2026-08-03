.class public final Lz7/q;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public g:Ljava/lang/Object;


# direct methods
.method public static a(Ljava/lang/Object;)Ljava/util/Iterator;
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Lz7/h;->g:Lz7/h;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Lz7/q;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p0, v0, Lz7/q;->g:Ljava/lang/Object;

    .line 12
    .line 13
    return-object v0
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lz7/q;->g:Ljava/lang/Object;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lz7/q;->g:Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-object v1, p0, Lz7/q;->g:Ljava/lang/Object;

    .line 5
    .line 6
    return-object v0
.end method
