.class public final Lw/p0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final b:Lw/p0;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lw/p0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x7f

    .line 5
    .line 6
    invoke-direct {v0, v1, v2}, Lw/p0;-><init>(II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lw/p0;->b:Lw/p0;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x4

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput p1, p0, Lw/p0;->a:I

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(Z)Ln2/j;
    .locals 7

    .line 1
    new-instance v0, Ln2/j;

    .line 2
    .line 3
    new-instance v1, Ln2/k;

    .line 4
    .line 5
    iget v2, p0, Lw/p0;->a:I

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ln2/k;-><init>(I)V

    .line 8
    .line 9
    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    :cond_0
    const/4 v3, 0x1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    iget v1, v1, Ln2/k;->a:I

    .line 17
    .line 18
    move v4, v1

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    move v4, v3

    .line 21
    :goto_0
    sget-object v6, Lp2/b;->i:Lp2/b;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    move v5, v3

    .line 25
    move v1, p1

    .line 26
    invoke-direct/range {v0 .. v6}, Ln2/j;-><init>(ZIZIILp2/b;)V

    .line 27
    .line 28
    .line 29
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, Lw/p0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, Lw/p0;

    .line 10
    .line 11
    iget v0, p0, Lw/p0;->a:I

    .line 12
    .line 13
    iget p1, p1, Lw/p0;->a:I

    .line 14
    .line 15
    if-ne v0, p1, :cond_2

    .line 16
    .line 17
    :goto_0
    const/4 p1, 0x1

    .line 18
    return p1

    .line 19
    :cond_2
    :goto_1
    const/4 p1, 0x0

    .line 20
    return p1
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    const/4 v0, -0x1

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    mul-int/lit16 v1, v1, 0x3c1

    .line 7
    .line 8
    iget v2, p0, Lw/p0;->a:I

    .line 9
    .line 10
    const/16 v3, 0x1f

    .line 11
    .line 12
    invoke-static {v2, v1, v3}, Leh/a;->e(III)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/16 v2, 0x745f

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Leh/a;->e(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "KeyboardOptions(capitalization="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v1, "Unspecified"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v2, ", autoCorrectEnabled=null, keyboardType="

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget v2, p0, Lw/p0;->a:I

    .line 19
    .line 20
    invoke-static {v2}, Ln2/k;->a(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v2, ", imeAction="

    .line 28
    .line 29
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v1, ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)"

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    return-object v0
.end method
