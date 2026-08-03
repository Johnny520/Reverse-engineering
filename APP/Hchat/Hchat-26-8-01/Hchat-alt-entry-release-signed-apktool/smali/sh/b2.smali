.class public final synthetic Lsh/b2;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lv1/b1;

.field public final synthetic i:J

.field public final synthetic j:Lv1/b1;

.field public final synthetic k:Lv1/b1;

.field public final synthetic l:Lv1/b1;


# direct methods
.method public synthetic constructor <init>(ILv1/b1;JLv1/b1;Lv1/b1;Lv1/b1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lsh/b2;->g:I

    .line 5
    .line 6
    iput-object p2, p0, Lsh/b2;->h:Lv1/b1;

    .line 7
    .line 8
    iput-wide p3, p0, Lsh/b2;->i:J

    .line 9
    .line 10
    iput-object p5, p0, Lsh/b2;->j:Lv1/b1;

    .line 11
    .line 12
    iput-object p6, p0, Lsh/b2;->k:Lv1/b1;

    .line 13
    .line 14
    iput-object p7, p0, Lsh/b2;->l:Lv1/b1;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    check-cast p1, Lv1/a1;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lsh/b2;->g:I

    .line 7
    .line 8
    div-int/lit8 v0, v0, 0x2

    .line 9
    .line 10
    iget-object v1, p0, Lsh/b2;->h:Lv1/b1;

    .line 11
    .line 12
    iget v2, v1, Lv1/b1;->h:I

    .line 13
    .line 14
    div-int/lit8 v2, v2, 0x2

    .line 15
    .line 16
    sub-int v2, v0, v2

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-static {p1, v1, v3, v2}, Lv1/a1;->E(Lv1/a1;Lv1/b1;II)V

    .line 20
    .line 21
    .line 22
    iget-wide v4, p0, Lsh/b2;->i:J

    .line 23
    .line 24
    invoke-static {v4, v5}, Lu2/a;->h(J)I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    iget-object v6, p0, Lsh/b2;->j:Lv1/b1;

    .line 29
    .line 30
    iget v7, v6, Lv1/b1;->g:I

    .line 31
    .line 32
    sub-int/2addr v2, v7

    .line 33
    div-int/lit8 v2, v2, 0x2

    .line 34
    .line 35
    iget v1, v1, Lv1/b1;->g:I

    .line 36
    .line 37
    iget-object v8, p0, Lsh/b2;->k:Lv1/b1;

    .line 38
    .line 39
    if-ge v2, v1, :cond_0

    .line 40
    .line 41
    sub-int/2addr v1, v2

    .line 42
    :goto_0
    add-int/2addr v2, v1

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    add-int/2addr v7, v2

    .line 45
    invoke-static {v4, v5}, Lu2/a;->h(J)I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    iget v9, v8, Lv1/b1;->g:I

    .line 50
    .line 51
    sub-int/2addr v1, v9

    .line 52
    if-le v7, v1, :cond_1

    .line 53
    .line 54
    invoke-static {v4, v5}, Lu2/a;->h(J)I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    iget v7, v8, Lv1/b1;->g:I

    .line 59
    .line 60
    sub-int/2addr v1, v7

    .line 61
    iget v7, v6, Lv1/b1;->g:I

    .line 62
    .line 63
    add-int/2addr v7, v2

    .line 64
    sub-int/2addr v1, v7

    .line 65
    goto :goto_0

    .line 66
    :cond_1
    :goto_1
    iget v1, v6, Lv1/b1;->h:I

    .line 67
    .line 68
    div-int/lit8 v1, v1, 0x2

    .line 69
    .line 70
    sub-int v1, v0, v1

    .line 71
    .line 72
    invoke-static {p1, v6, v2, v1}, Lv1/a1;->E(Lv1/a1;Lv1/b1;II)V

    .line 73
    .line 74
    .line 75
    invoke-static {v4, v5}, Lu2/a;->h(J)I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    iget v2, v8, Lv1/b1;->g:I

    .line 80
    .line 81
    sub-int/2addr v1, v2

    .line 82
    iget v2, v8, Lv1/b1;->h:I

    .line 83
    .line 84
    div-int/lit8 v2, v2, 0x2

    .line 85
    .line 86
    sub-int/2addr v0, v2

    .line 87
    invoke-static {p1, v8, v1, v0}, Lv1/a1;->E(Lv1/a1;Lv1/b1;II)V

    .line 88
    .line 89
    .line 90
    iget-object v0, p0, Lsh/b2;->l:Lv1/b1;

    .line 91
    .line 92
    invoke-static {p1, v0, v3, v3}, Lv1/a1;->E(Lv1/a1;Lv1/b1;II)V

    .line 93
    .line 94
    .line 95
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 96
    .line 97
    return-object p1
.end method
