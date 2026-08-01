.class public final Lgl;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final δ:Lgl;

.field public static final ε:Lgl;

.field public static final ζ:Lgl;

.field public static final η:Lgl;


# instance fields
.field public final α:Z

.field public final β:Z

.field public final γ:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lgl;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1, v1, v1}, Lgl;-><init>(ZZZ)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lgl;->δ:Lgl;

    .line 8
    .line 9
    new-instance v0, Lgl;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-direct {v0, v1, v1, v2}, Lgl;-><init>(ZZZ)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lgl;->ε:Lgl;

    .line 16
    .line 17
    new-instance v0, Lgl;

    .line 18
    .line 19
    invoke-direct {v0, v2, v1, v1}, Lgl;-><init>(ZZZ)V

    .line 20
    .line 21
    .line 22
    sput-object v0, Lgl;->ζ:Lgl;

    .line 23
    .line 24
    new-instance v0, Lgl;

    .line 25
    .line 26
    invoke-direct {v0, v2, v2, v1}, Lgl;-><init>(ZZZ)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lgl;->η:Lgl;

    .line 30
    .line 31
    return-void
.end method

.method public constructor <init>(ZZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lgl;->α:Z

    .line 5
    .line 6
    iput-boolean p2, p0, Lgl;->β:Z

    .line 7
    .line 8
    iput-boolean p3, p0, Lgl;->γ:Z

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Lgl;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lgl;

    .line 10
    .line 11
    iget-boolean v0, p0, Lgl;->α:Z

    .line 12
    .line 13
    iget-boolean v1, p1, Lgl;->α:Z

    .line 14
    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    iget-boolean v0, p0, Lgl;->β:Z

    .line 19
    .line 20
    iget-boolean v1, p1, Lgl;->β:Z

    .line 21
    .line 22
    if-eq v0, v1, :cond_3

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_3
    iget-boolean p0, p0, Lgl;->γ:Z

    .line 26
    .line 27
    iget-boolean p1, p1, Lgl;->γ:Z

    .line 28
    .line 29
    if-eq p0, p1, :cond_4

    .line 30
    .line 31
    :goto_0
    const/4 p0, 0x0

    .line 32
    return p0

    .line 33
    :cond_4
    :goto_1
    const/4 p0, 0x1

    .line 34
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-boolean v0, p0, Lgl;->α:Z

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-boolean v2, p0, Lgl;->β:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Llz1;->γ(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean p0, p0, Lgl;->γ:Z

    .line 17
    .line 18
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    add-int/2addr p0, v0

    .line 23
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Channels(visibility="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-boolean v1, p0, Lgl;->α:Z

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", alpha="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-boolean v1, p0, Lgl;->β:Z

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", color="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ")"

    .line 29
    .line 30
    iget-boolean p0, p0, Lgl;->γ:Z

    .line 31
    .line 32
    invoke-static {v0, p0, v1}, Llz1;->σ(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method
