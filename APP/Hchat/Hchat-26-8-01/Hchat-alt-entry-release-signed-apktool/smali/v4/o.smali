.class public final Lv4/o;
.super Lv4/s;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final h:[Lv4/o;

.field public static final i:Lv4/o;

.field public static final j:Lv4/o;

.field public static final k:Lv4/o;

.field public static final l:Lv4/o;

.field public static final m:Lv4/o;

.field public static final n:Lv4/o;

.field public static final o:Lv4/o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x1ff

    .line 2
    .line 3
    new-array v0, v0, [Lv4/o;

    .line 4
    .line 5
    sput-object v0, Lv4/o;->h:[Lv4/o;

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    invoke-static {v0}, Lv4/o;->o(I)Lv4/o;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, Lv4/o;->i:Lv4/o;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-static {v0}, Lv4/o;->o(I)Lv4/o;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lv4/o;->j:Lv4/o;

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    invoke-static {v0}, Lv4/o;->o(I)Lv4/o;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sput-object v0, Lv4/o;->k:Lv4/o;

    .line 27
    .line 28
    const/4 v0, 0x2

    .line 29
    invoke-static {v0}, Lv4/o;->o(I)Lv4/o;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, Lv4/o;->l:Lv4/o;

    .line 34
    .line 35
    const/4 v0, 0x3

    .line 36
    invoke-static {v0}, Lv4/o;->o(I)Lv4/o;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    sput-object v0, Lv4/o;->m:Lv4/o;

    .line 41
    .line 42
    const/4 v0, 0x4

    .line 43
    invoke-static {v0}, Lv4/o;->o(I)Lv4/o;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sput-object v0, Lv4/o;->n:Lv4/o;

    .line 48
    .line 49
    const/4 v0, 0x5

    .line 50
    invoke-static {v0}, Lv4/o;->o(I)Lv4/o;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    sput-object v0, Lv4/o;->o:Lv4/o;

    .line 55
    .line 56
    return-void
.end method

.method public static o(I)Lv4/o;
    .locals 4

    .line 1
    const v0, 0x7fffffff

    .line 2
    .line 3
    .line 4
    and-int/2addr v0, p0

    .line 5
    sget-object v1, Lv4/o;->h:[Lv4/o;

    .line 6
    .line 7
    array-length v2, v1

    .line 8
    rem-int/2addr v0, v2

    .line 9
    aget-object v2, v1, v0

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    iget v3, v2, Lv4/s;->g:I

    .line 14
    .line 15
    if-ne v3, p0, :cond_0

    .line 16
    .line 17
    return-object v2

    .line 18
    :cond_0
    new-instance v2, Lv4/o;

    .line 19
    .line 20
    invoke-direct {v2, p0}, Lv4/s;-><init>(I)V

    .line 21
    .line 22
    .line 23
    aput-object v2, v1, v0

    .line 24
    .line 25
    return-object v2
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Lv4/s;->g:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final getType()Lw4/c;
    .locals 1

    .line 1
    sget-object v0, Lw4/c;->t:Lw4/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "int"

    .line 2
    .line 3
    return-object v0
.end method

.method public final n()I
    .locals 1

    .line 1
    iget v0, p0, Lv4/s;->g:I

    .line 2
    .line 3
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "int{0x"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lv4/s;->g:I

    .line 9
    .line 10
    invoke-static {v1}, La/a;->Y0(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v2, " / "

    .line 18
    .line 19
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const/16 v1, 0x7d

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    return-object v0
.end method
