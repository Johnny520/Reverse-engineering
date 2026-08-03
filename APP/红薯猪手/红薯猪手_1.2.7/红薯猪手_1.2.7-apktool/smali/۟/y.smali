.class public final synthetic L۟/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements L۟/h8$d;
.implements Lcom/skyhand/hookhand/dialog/view/SwitchButton$d;


# instance fields
.field public final synthetic ۥ:I

.field public final synthetic ۥ۟:Ljava/lang/Object;

.field public final synthetic ۥ۟۟:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p3, p0, L۟/y;->ۥ:I

    iput-object p1, p0, L۟/y;->ۥ۟:Ljava/lang/Object;

    iput-object p2, p0, L۟/y;->ۥ۟۟:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ(Z)V
    .locals 5

    .line 1
    iget-object v0, p0, L۟/y;->ۥ۟:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, L۟/p0;

    .line 4
    .line 5
    iget-object v1, p0, L۟/y;->ۥ۟۟:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, L۟/n1;

    .line 8
    .line 9
    sget v2, L۟/n1;->ۥ۟۟:I

    .line 10
    .line 11
    const/4 v2, 0x5

    .line 12
    new-array v2, v2, [B

    .line 13
    .line 14
    fill-array-data v2, :array_0

    .line 15
    .line 16
    .line 17
    const/4 v3, 0x6

    .line 18
    new-array v4, v3, [B

    .line 19
    .line 20
    fill-array-data v4, :array_1

    .line 21
    .line 22
    .line 23
    invoke-static {v2, v4}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-static {v2, v0}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    new-array v2, v3, [B

    .line 31
    .line 32
    fill-array-data v2, :array_2

    .line 33
    .line 34
    .line 35
    new-array v3, v3, [B

    .line 36
    .line 37
    fill-array-data v3, :array_3

    .line 38
    .line 39
    .line 40
    invoke-static {v2, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-static {v2, v1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    iput-object v2, v0, L۟/p0;->ۥ۟ۧ:Ljava/lang/Boolean;

    .line 52
    .line 53
    iget-object v0, v0, L۟/p0;->ۥ۟ۨ:L۟/g3;

    .line 54
    .line 55
    if-eqz v0, :cond_0

    .line 56
    .line 57
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-interface {v0, p1}, L۟/g3;->ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    :cond_0
    iget-object p1, v1, L۟/n1;->ۥ۟:L۟/f3;

    .line 65
    .line 66
    if-eqz p1, :cond_1

    .line 67
    .line 68
    invoke-interface {p1}, L۟/f3;->ۥ()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    :cond_1
    return-void

    .line 72
    nop

    .line 73
    :array_0
    .array-data 1
        0x1ft
        0x23t
        -0x3ft
        -0x3dt
        -0x54t
    .end array-data

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    nop

    .line 81
    :array_1
    .array-data 1
        0x3bt
        0x4at
        -0x4bt
        -0x5at
        -0x3ft
        0x46t
    .end array-data

    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    nop

    .line 89
    :array_2
    .array-data 1
        -0x7t
        0x28t
        -0x18t
        -0x64t
        -0x73t
        0x42t
    .end array-data

    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    nop

    .line 97
    :array_3
    .array-data 1
        -0x73t
        0x40t
        -0x7ft
        -0x11t
        -0x57t
        0x72t
    .end array-data
.end method
