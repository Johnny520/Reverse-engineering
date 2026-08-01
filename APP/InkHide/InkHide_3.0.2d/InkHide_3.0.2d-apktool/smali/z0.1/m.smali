.class public final Lz0/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public b:Landroid/view/View$OnClickListener;

.field public c:Landroid/view/View$OnClickListener;

.field public d:LM0/a;

.field public e:I

.field public f:I

.field public g:J


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 8

    .line 1
    const-string v0, "v"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    iget v2, p0, Lz0/m;->f:I

    .line 11
    .line 12
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    iget-wide v3, p0, Lz0/m;->g:J

    .line 17
    .line 18
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    filled-new-array {v2, v3, v4}, [Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-static {v2}, Li0/a;->a([Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-wide v2, p0, Lz0/m;->g:J

    .line 34
    .line 35
    const-wide/16 v4, 0x0

    .line 36
    .line 37
    cmp-long v2, v2, v4

    .line 38
    .line 39
    if-nez v2, :cond_0

    .line 40
    .line 41
    iput-wide v0, p0, Lz0/m;->g:J

    .line 42
    .line 43
    :cond_0
    iget-wide v2, p0, Lz0/m;->g:J

    .line 44
    .line 45
    sub-long v2, v0, v2

    .line 46
    .line 47
    iget v6, p0, Lz0/m;->e:I

    .line 48
    .line 49
    int-to-long v6, v6

    .line 50
    cmp-long v2, v2, v6

    .line 51
    .line 52
    const/4 v3, 0x0

    .line 53
    if-gez v2, :cond_1

    .line 54
    .line 55
    iget v2, p0, Lz0/m;->f:I

    .line 56
    .line 57
    add-int/lit8 v2, v2, 0x1

    .line 58
    .line 59
    iput v2, p0, Lz0/m;->f:I

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    iput v3, p0, Lz0/m;->f:I

    .line 63
    .line 64
    :goto_0
    iput-wide v0, p0, Lz0/m;->g:J

    .line 65
    .line 66
    iget v0, p0, Lz0/m;->f:I

    .line 67
    .line 68
    iget-object v1, p0, Lz0/m;->d:LM0/a;

    .line 69
    .line 70
    invoke-interface {v1}, LM0/a;->b()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    check-cast v1, Ljava/lang/Number;

    .line 75
    .line 76
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-le v0, v1, :cond_2

    .line 81
    .line 82
    iput v3, p0, Lz0/m;->f:I

    .line 83
    .line 84
    iput-wide v4, p0, Lz0/m;->g:J

    .line 85
    .line 86
    iget-object v0, p0, Lz0/m;->c:Landroid/view/View$OnClickListener;

    .line 87
    .line 88
    invoke-interface {v0, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    .line 89
    .line 90
    .line 91
    :cond_2
    iget-object v0, p0, Lz0/m;->b:Landroid/view/View$OnClickListener;

    .line 92
    .line 93
    if-eqz v0, :cond_3

    .line 94
    .line 95
    invoke-interface {v0, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    .line 96
    .line 97
    .line 98
    :cond_3
    return-void
.end method
