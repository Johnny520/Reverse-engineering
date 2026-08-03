.class public final Lb6/i;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lw5/a;


# instance fields
.field public final g:S


# direct methods
.method public constructor <init>(S)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-short p1, p0, Lb6/i;->g:S

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 2

    .line 1
    check-cast p1, Lw5/a;

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    invoke-interface {p1}, Lw5/a;->h()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    return v0

    .line 15
    :cond_0
    check-cast p1, Lb6/i;

    .line 16
    .line 17
    iget-short p1, p1, Lb6/i;->g:S

    .line 18
    .line 19
    iget-short v0, p0, Lb6/i;->g:S

    .line 20
    .line 21
    invoke-static {v0, p1}, Ljava/lang/Short;->compare(SS)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lb6/i;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, Lb6/i;

    .line 7
    .line 8
    iget-short p1, p1, Lb6/i;->g:S

    .line 9
    .line 10
    iget-short v0, p0, Lb6/i;->g:S

    .line 11
    .line 12
    if-ne v0, p1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    return p1

    .line 16
    :cond_0
    return v1
.end method

.method public final h()I
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    return v0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-short v0, p0, Lb6/i;->g:S

    .line 2
    .line 3
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/io/StringWriter;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    new-instance v1, Lq5/a;

    .line 7
    .line 8
    invoke-direct {v1, v0}, Lq5/a;-><init>(Ljava/io/Writer;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, p0}, Lq5/a;->g(Lw5/a;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0

    .line 19
    :catch_0
    const-string v0, "Unexpected IOException"

    .line 20
    .line 21
    invoke-static {v0}, Lj8/o;->f(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    return-object v0
.end method
