.class public final Lyn1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public α:Li5;

.field public β:Lzj1;

.field public γ:I

.field public δ:Ljava/lang/String;

.field public ε:Lqc0;

.field public ζ:Luc0;

.field public η:Lbo1;

.field public θ:Llx1;

.field public ι:Lzn1;

.field public κ:Lzn1;

.field public λ:Lzn1;

.field public μ:J

.field public ν:J

.field public ξ:Lzz;

.field public ο:Lp52;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lyn1;->γ:I

    .line 6
    .line 7
    sget-object v0, Lbo1;->ε:Lao1;

    .line 8
    .line 9
    iput-object v0, p0, Lyn1;->η:Lbo1;

    .line 10
    .line 11
    sget-object v0, Lp52;->δ:Lzz1;

    .line 12
    .line 13
    iput-object v0, p0, Lyn1;->ο:Lp52;

    .line 14
    .line 15
    new-instance v0, Luc0;

    .line 16
    .line 17
    invoke-direct {v0}, Luc0;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lyn1;->ζ:Luc0;

    .line 21
    .line 22
    return-void
.end method

.method public static β(Ljava/lang/String;Lzn1;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    iget-object v0, p1, Lzn1;->ν:Lzn1;

    .line 4
    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    iget-object v0, p1, Lzn1;->ξ:Lzn1;

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object p1, p1, Lzn1;->ο:Lzn1;

    .line 12
    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const-string p1, ".priorResponse != null"

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {p0}, Lγ;->δ(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    const-string p1, ".cacheResponse != null"

    .line 27
    .line 28
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {p0}, Lγ;->δ(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_2
    const-string p1, ".networkResponse != null"

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-static {p0}, Lγ;->δ(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    :cond_3
    :goto_0
    return-void
.end method


# virtual methods
.method public final α()Lzn1;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v4, v0, Lyn1;->γ:I

    .line 4
    .line 5
    if-ltz v4, :cond_3

    .line 6
    .line 7
    iget-object v1, v0, Lyn1;->α:Li5;

    .line 8
    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    iget-object v2, v0, Lyn1;->β:Lzj1;

    .line 12
    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    iget-object v3, v0, Lyn1;->δ:Ljava/lang/String;

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    iget-object v5, v0, Lyn1;->ε:Lqc0;

    .line 20
    .line 21
    iget-object v6, v0, Lyn1;->ζ:Luc0;

    .line 22
    .line 23
    invoke-virtual {v6}, Luc0;->α()Lvc0;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    iget-object v7, v0, Lyn1;->η:Lbo1;

    .line 28
    .line 29
    iget-object v8, v0, Lyn1;->θ:Llx1;

    .line 30
    .line 31
    iget-object v9, v0, Lyn1;->ι:Lzn1;

    .line 32
    .line 33
    iget-object v10, v0, Lyn1;->κ:Lzn1;

    .line 34
    .line 35
    iget-object v11, v0, Lyn1;->λ:Lzn1;

    .line 36
    .line 37
    iget-wide v12, v0, Lyn1;->μ:J

    .line 38
    .line 39
    iget-wide v14, v0, Lyn1;->ν:J

    .line 40
    .line 41
    move-object/from16 v16, v1

    .line 42
    .line 43
    iget-object v1, v0, Lyn1;->ξ:Lzz;

    .line 44
    .line 45
    iget-object v0, v0, Lyn1;->ο:Lp52;

    .line 46
    .line 47
    move-object/from16 v17, v0

    .line 48
    .line 49
    new-instance v0, Lzn1;

    .line 50
    .line 51
    move-object/from16 v18, v16

    .line 52
    .line 53
    move-object/from16 v16, v1

    .line 54
    .line 55
    move-object/from16 v1, v18

    .line 56
    .line 57
    invoke-direct/range {v0 .. v17}, Lzn1;-><init>(Li5;Lzj1;Ljava/lang/String;ILqc0;Lvc0;Lbo1;Llx1;Lzn1;Lzn1;Lzn1;JJLzz;Lp52;)V

    .line 58
    .line 59
    .line 60
    return-object v0

    .line 61
    :cond_0
    const-string v0, "message == null"

    .line 62
    .line 63
    invoke-static {v0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const/4 v0, 0x0

    .line 67
    return-object v0

    .line 68
    :cond_1
    const-string v0, "protocol == null"

    .line 69
    .line 70
    invoke-static {v0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const/4 v0, 0x0

    .line 74
    return-object v0

    .line 75
    :cond_2
    const-string v0, "request == null"

    .line 76
    .line 77
    invoke-static {v0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    const/4 v0, 0x0

    .line 81
    return-object v0

    .line 82
    :cond_3
    const-string v1, "code < 0: "

    .line 83
    .line 84
    iget v0, v0, Lyn1;->γ:I

    .line 85
    .line 86
    invoke-static {v1, v0}, Lql1;->ε(Ljava/lang/String;I)V

    .line 87
    .line 88
    .line 89
    const/4 v0, 0x0

    .line 90
    return-object v0
.end method
