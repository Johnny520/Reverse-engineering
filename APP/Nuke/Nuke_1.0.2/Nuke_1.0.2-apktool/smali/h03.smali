.class public final Lh03;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public a:Ld61;

.field public b:Le70;

.field public c:Lxl0;

.field public d:Lm13;

.field public e:Ljava/lang/Object;

.field public final f:Lnx1;

.field public g:J


# direct methods
.method public constructor <init>(Ld61;Le70;Lxl0;Lm13;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh03;->a:Ld61;

    .line 5
    .line 6
    iput-object p2, p0, Lh03;->b:Le70;

    .line 7
    .line 8
    iput-object p3, p0, Lh03;->c:Lxl0;

    .line 9
    .line 10
    iput-object p4, p0, Lh03;->d:Lm13;

    .line 11
    .line 12
    iput-object p5, p0, Lh03;->e:Ljava/lang/Object;

    .line 13
    .line 14
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-static {p1}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Lh03;->f:Lnx1;

    .line 21
    .line 22
    iget-object p1, p0, Lh03;->c:Lxl0;

    .line 23
    .line 24
    iget-object p2, p0, Lh03;->d:Lm13;

    .line 25
    .line 26
    iget-object p3, p0, Lh03;->b:Le70;

    .line 27
    .line 28
    invoke-static {p2, p3, p1}, Llz2;->b(Lm13;Le70;Lxl0;)J

    .line 29
    .line 30
    .line 31
    move-result-wide p1

    .line 32
    iput-wide p1, p0, Lh03;->g:J

    .line 33
    .line 34
    return-void
.end method

.method public static a(Lh03;Ld61;Le70;Lm13;I)V
    .locals 3

    .line 1
    and-int/lit8 v0, p4, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lh03;->a:Ld61;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 v0, p4, 0x2

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Lh03;->b:Le70;

    .line 12
    .line 13
    :cond_1
    iget-object v0, p0, Lh03;->c:Lxl0;

    .line 14
    .line 15
    and-int/lit8 p4, p4, 0x8

    .line 16
    .line 17
    if-eqz p4, :cond_2

    .line 18
    .line 19
    iget-object p3, p0, Lh03;->d:Lm13;

    .line 20
    .line 21
    :cond_2
    iget-object p4, p0, Lh03;->e:Ljava/lang/Object;

    .line 22
    .line 23
    iget-object v1, p0, Lh03;->a:Ld61;

    .line 24
    .line 25
    iget-object v2, p0, Lh03;->f:Lnx1;

    .line 26
    .line 27
    if-ne p1, v1, :cond_5

    .line 28
    .line 29
    iget-object v1, p0, Lh03;->b:Le70;

    .line 30
    .line 31
    invoke-static {p2, v1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_5

    .line 36
    .line 37
    iget-object v1, p0, Lh03;->c:Lxl0;

    .line 38
    .line 39
    invoke-static {v0, v1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_5

    .line 44
    .line 45
    iget-object v1, p0, Lh03;->d:Lm13;

    .line 46
    .line 47
    invoke-static {p3, v1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-nez v1, :cond_3

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_3
    iget-object p1, p0, Lh03;->e:Ljava/lang/Object;

    .line 55
    .line 56
    invoke-static {p4, p1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-nez p1, :cond_4

    .line 61
    .line 62
    iput-object p4, p0, Lh03;->e:Ljava/lang/Object;

    .line 63
    .line 64
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 65
    .line 66
    invoke-virtual {v2, p0}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    :cond_4
    return-void

    .line 70
    :cond_5
    :goto_0
    iput-object p1, p0, Lh03;->a:Ld61;

    .line 71
    .line 72
    iput-object p2, p0, Lh03;->b:Le70;

    .line 73
    .line 74
    iput-object v0, p0, Lh03;->c:Lxl0;

    .line 75
    .line 76
    iput-object p3, p0, Lh03;->d:Lm13;

    .line 77
    .line 78
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 79
    .line 80
    invoke-virtual {v2, p0}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    return-void
.end method
