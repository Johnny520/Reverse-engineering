.class public final Lv4/z;
.super Lv4/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final i:Lv4/z;


# instance fields
.field public final g:Lv4/c0;

.field public final h:Lv4/c0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lv4/z;

    .line 2
    .line 3
    new-instance v1, Lv4/c0;

    .line 4
    .line 5
    const-string v2, "TYPE"

    .line 6
    .line 7
    invoke-direct {v1, v2}, Lv4/c0;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    new-instance v2, Lv4/c0;

    .line 11
    .line 12
    const-string v3, "Ljava/lang/Class;"

    .line 13
    .line 14
    invoke-direct {v2, v3}, Lv4/c0;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1, v2}, Lv4/z;-><init>(Lv4/c0;Lv4/c0;)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lv4/z;->i:Lv4/z;

    .line 21
    .line 22
    return-void
.end method

.method public constructor <init>(Lv4/c0;Lv4/c0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_1

    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    iput-object p1, p0, Lv4/z;->g:Lv4/c0;

    .line 9
    .line 10
    iput-object p2, p0, Lv4/z;->h:Lv4/c0;

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string p1, "descriptor == null"

    .line 14
    .line 15
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    throw p1

    .line 20
    :cond_1
    const-string p1, "name == null"

    .line 21
    .line 22
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    throw p1
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lv4/z;->g:Lv4/c0;

    .line 7
    .line 8
    invoke-virtual {v1}, Lv4/c0;->a()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const/16 v1, 0x3a

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lv4/z;->h:Lv4/c0;

    .line 21
    .line 22
    invoke-virtual {v1}, Lv4/c0;->a()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    return-object v0
.end method

.method public final e(Lv4/a;)I
    .locals 2

    .line 1
    check-cast p1, Lv4/z;

    .line 2
    .line 3
    iget-object v0, p0, Lv4/z;->g:Lv4/c0;

    .line 4
    .line 5
    iget-object v1, p1, Lv4/z;->g:Lv4/c0;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lv4/a;->d(Lv4/a;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return v0

    .line 14
    :cond_0
    iget-object v0, p0, Lv4/z;->h:Lv4/c0;

    .line 15
    .line 16
    iget-object p1, p1, Lv4/z;->h:Lv4/c0;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lv4/a;->d(Lv4/a;)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Lv4/z;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    check-cast p1, Lv4/z;

    .line 8
    .line 9
    iget-object v0, p0, Lv4/z;->g:Lv4/c0;

    .line 10
    .line 11
    iget-object v2, p1, Lv4/z;->g:Lv4/c0;

    .line 12
    .line 13
    invoke-virtual {v0, v2}, Lv4/c0;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Lv4/z;->h:Lv4/c0;

    .line 20
    .line 21
    iget-object p1, p1, Lv4/z;->h:Lv4/c0;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Lv4/c0;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    const/4 p1, 0x1

    .line 30
    return p1

    .line 31
    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lv4/z;->g:Lv4/c0;

    .line 2
    .line 3
    iget-object v0, v0, Lv4/c0;->g:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    iget-object v1, p0, Lv4/z;->h:Lv4/c0;

    .line 12
    .line 13
    iget-object v1, v1, Lv4/c0;->g:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    xor-int/2addr v0, v1

    .line 20
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
    const-string v0, "nat"

    .line 2
    .line 3
    return-object v0
.end method

.method public final k()Lw4/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lv4/z;->h:Lv4/c0;

    .line 2
    .line 3
    iget-object v0, v0, Lv4/c0;->g:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0}, Lw4/c;->m(Ljava/lang/String;)Lw4/c;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "nat{"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lv4/z;->a()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const/16 v1, 0x7d

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0
.end method
