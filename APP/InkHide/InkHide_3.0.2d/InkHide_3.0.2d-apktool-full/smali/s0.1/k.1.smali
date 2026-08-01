.class public final Ls0/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ls0/l;


# direct methods
.method public synthetic constructor <init>(Ls0/l;I)V
    .locals 0

    .line 1
    iput p2, p0, Ls0/k;->a:I

    iput-object p1, p0, Ls0/k;->b:Ls0/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 1
    iget v0, p0, Ls0/k;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ls0/i;

    .line 7
    .line 8
    iget-object p1, p1, Ls0/i;->a:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v0, p0, Ls0/k;->b:Ls0/l;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Ls0/l;->f(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    const/4 v0, 0x1

    .line 20
    const/4 v1, 0x0

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    :goto_0
    check-cast p2, Ls0/i;

    .line 33
    .line 34
    iget-object p2, p2, Ls0/i;->a:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {p2}, Ls0/l;->f(Ljava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    if-eqz p2, :cond_1

    .line 41
    .line 42
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    :goto_1
    invoke-static {p1, p2}, LD/h;->h(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    return p1

    .line 56
    :pswitch_0
    check-cast p1, Ls0/i;

    .line 57
    .line 58
    iget-object p1, p1, Ls0/i;->a:Ljava/lang/String;

    .line 59
    .line 60
    iget-object v0, p0, Ls0/k;->b:Ls0/l;

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-static {p1}, Ls0/l;->f(Ljava/lang/String;)Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    const/4 v0, 0x1

    .line 70
    const/4 v1, 0x0

    .line 71
    if-eqz p1, :cond_2

    .line 72
    .line 73
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    goto :goto_2

    .line 78
    :cond_2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    :goto_2
    check-cast p2, Ls0/i;

    .line 83
    .line 84
    iget-object p2, p2, Ls0/i;->a:Ljava/lang/String;

    .line 85
    .line 86
    invoke-static {p2}, Ls0/l;->f(Ljava/lang/String;)Z

    .line 87
    .line 88
    .line 89
    move-result p2

    .line 90
    if-eqz p2, :cond_3

    .line 91
    .line 92
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    goto :goto_3

    .line 97
    :cond_3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    :goto_3
    invoke-static {p1, p2}, LD/h;->h(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    return p1

    .line 106
    nop

    .line 107
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
