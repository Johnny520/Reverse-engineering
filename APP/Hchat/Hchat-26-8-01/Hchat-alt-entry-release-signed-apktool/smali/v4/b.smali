.class public final Lv4/b;
.super Lv4/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final g:Lt4/a;


# direct methods
.method public constructor <init>(Lt4/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lz4/j;->k()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lv4/b;->g:Lt4/a;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lv4/b;->g:Lt4/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lt4/a;->a()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final e(Lv4/a;)I
    .locals 1

    .line 1
    check-cast p1, Lv4/b;

    .line 2
    .line 3
    iget-object p1, p1, Lv4/b;->g:Lt4/a;

    .line 4
    .line 5
    iget-object v0, p0, Lv4/b;->g:Lt4/a;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lt4/a;->m(Lt4/a;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lv4/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_0
    check-cast p1, Lv4/b;

    .line 8
    .line 9
    iget-object p1, p1, Lv4/b;->g:Lt4/a;

    .line 10
    .line 11
    iget-object v0, p0, Lv4/b;->g:Lt4/a;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lt4/a;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lv4/b;->g:Lt4/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lt4/a;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final i()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final j()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "annotation"

    .line 2
    .line 3
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lv4/b;->g:Lt4/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lt4/a;->a()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
