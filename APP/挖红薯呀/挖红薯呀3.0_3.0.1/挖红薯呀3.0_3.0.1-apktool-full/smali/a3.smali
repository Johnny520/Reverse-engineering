.class public final La3;
.super Lk9;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lvu;


# instance fields
.field public final d:Lx1;

.field public final e:La01;

.field public final f:Lw3;

.field public final g:Lut0;

.field public final h:Ljava/lang/String;

.field public final i:Landroid/view/autofill/AutofillId;

.field public final j:Lvg0;

.field public k:Z


# direct methods
.method public constructor <init>(Lx1;La01;Lw3;Lut0;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La3;->d:Lx1;

    .line 5
    .line 6
    iput-object p2, p0, La3;->e:La01;

    .line 7
    .line 8
    iput-object p3, p0, La3;->f:Lw3;

    .line 9
    .line 10
    iput-object p4, p0, La3;->g:Lut0;

    .line 11
    .line 12
    iput-object p5, p0, La3;->h:Ljava/lang/String;

    .line 13
    .line 14
    new-instance p1, Landroid/graphics/Rect;

    .line 15
    .line 16
    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    invoke-virtual {p3, p1}, Landroid/view/View;->setImportantForAutofill(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p3}, Landroid/view/View;->getAutofillId()Landroid/view/autofill/AutofillId;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    iput-object p1, p0, La3;->i:Landroid/view/autofill/AutofillId;

    .line 30
    .line 31
    new-instance p1, Lvg0;

    .line 32
    .line 33
    invoke-direct {p1}, Lvg0;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, La3;->j:Lvg0;

    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    const-string p0, "Required value was null."

    .line 40
    .line 41
    invoke-static {p0}, Lt1;->g(Ljava/lang/String;)Lsg;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    throw p0
.end method


# virtual methods
.method public final d(Ldv;Ldv;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-static {p1}, Lpf1;->Q(Lrm;)Lb60;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    invoke-virtual {p1}, Lb60;->x()Lsz0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v0, v0, Lsz0;->d:Ljh0;

    .line 16
    .line 17
    sget-object v1, Lrz0;->g:Le01;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljh0;->b(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    sget-object v1, Lrz0;->h:Le01;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljh0;->b(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    :cond_0
    iget p1, p1, Lb60;->e:I

    .line 34
    .line 35
    iget-object v0, p0, La3;->d:Lx1;

    .line 36
    .line 37
    iget-object v0, v0, Lx1;->e:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, Landroid/view/autofill/AutofillManager;

    .line 40
    .line 41
    iget-object v1, p0, La3;->f:Lw3;

    .line 42
    .line 43
    invoke-virtual {v0, v1, p1}, Landroid/view/autofill/AutofillManager;->notifyViewExited(Landroid/view/View;I)V

    .line 44
    .line 45
    .line 46
    :cond_1
    if-eqz p2, :cond_4

    .line 47
    .line 48
    invoke-static {p2}, Lpf1;->Q(Lrm;)Lb60;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-eqz p1, :cond_4

    .line 53
    .line 54
    invoke-virtual {p1}, Lb60;->x()Lsz0;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    if-eqz p2, :cond_4

    .line 59
    .line 60
    iget-object p2, p2, Lsz0;->d:Ljh0;

    .line 61
    .line 62
    sget-object v0, Lrz0;->g:Le01;

    .line 63
    .line 64
    invoke-virtual {p2, v0}, Ljh0;->b(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-nez v0, :cond_3

    .line 69
    .line 70
    sget-object v0, Lrz0;->h:Le01;

    .line 71
    .line 72
    invoke-virtual {p2, v0}, Ljh0;->b(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    if-eqz p2, :cond_2

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_2
    return-void

    .line 80
    :cond_3
    :goto_0
    iget p1, p1, Lb60;->e:I

    .line 81
    .line 82
    iget-object p2, p0, La3;->g:Lut0;

    .line 83
    .line 84
    iget-object p2, p2, Lut0;->a:Lu5;

    .line 85
    .line 86
    new-instance v0, Lz2;

    .line 87
    .line 88
    invoke-direct {v0, p0, p1}, Lz2;-><init>(La3;I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p2, p1, v0}, Lu5;->h(ILyw;)V

    .line 92
    .line 93
    .line 94
    :cond_4
    return-void
.end method
