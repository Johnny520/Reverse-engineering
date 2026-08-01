.class public final Lbl1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public α:Lzn;

.field public β:I

.field public γ:Lq80;

.field public δ:Le80;

.field public ε:I

.field public ζ:Lu11;

.field public η:Lb21;


# direct methods
.method public constructor <init>(Lzn;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbl1;->α:Lzn;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final α()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lbl1;->α:Lzn;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-object p0, p0, Lbl1;->γ:Lq80;

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Lq80;->α()Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move p0, v1

    .line 16
    :goto_0
    if-eqz p0, :cond_1

    .line 17
    .line 18
    const/4 p0, 0x1

    .line 19
    return p0

    .line 20
    :cond_1
    return v1
.end method

.method public final β(Ljava/lang/Object;)Lsn0;
    .locals 1

    .line 1
    iget-object v0, p0, Lbl1;->α:Lzn;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0, p0, p1}, Lzn;->σ(Lbl1;Ljava/lang/Object;)Lsn0;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    return-object p0

    .line 13
    :cond_1
    :goto_0
    sget-object p0, Lsn0;->ε:Lsn0;

    .line 14
    .line 15
    return-object p0
.end method

.method public final γ()V
    .locals 2

    .line 1
    iget-object v0, p0, Lbl1;->α:Lzn;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    iput-boolean v1, v0, Lzn;->τ:Z

    .line 7
    .line 8
    iget-object v0, v0, Lzn;->χ:Ln;

    .line 9
    .line 10
    invoke-virtual {v0}, Ln;->ρ()V

    .line 11
    .line 12
    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Lbl1;->α:Lzn;

    .line 15
    .line 16
    iput-object v0, p0, Lbl1;->ζ:Lu11;

    .line 17
    .line 18
    iput-object v0, p0, Lbl1;->η:Lb21;

    .line 19
    .line 20
    iput-object v0, p0, Lbl1;->δ:Le80;

    .line 21
    .line 22
    return-void
.end method

.method public final δ(Z)V
    .locals 1

    .line 1
    iget v0, p0, Lbl1;->β:I

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    or-int/lit8 p1, v0, 0x20

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    and-int/lit8 p1, v0, -0x21

    .line 9
    .line 10
    :goto_0
    iput p1, p0, Lbl1;->β:I

    .line 11
    .line 12
    return-void
.end method
