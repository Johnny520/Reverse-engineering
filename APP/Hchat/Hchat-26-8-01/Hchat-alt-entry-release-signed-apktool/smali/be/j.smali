.class public final synthetic Lbe/j;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic a:Lbe/i;

.field public final synthetic b:Lud/r;

.field public final synthetic c:Lud/r;

.field public final synthetic d:Lqd/j;

.field public final synthetic e:Lod/c;


# direct methods
.method public synthetic constructor <init>(Lbe/l;Lbe/i;Lud/r;Lud/r;Lqd/j;Lod/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lbe/j;->a:Lbe/i;

    .line 5
    .line 6
    iput-object p3, p0, Lbe/j;->b:Lud/r;

    .line 7
    .line 8
    iput-object p4, p0, Lbe/j;->c:Lud/r;

    .line 9
    .line 10
    iput-object p5, p0, Lbe/j;->d:Lqd/j;

    .line 11
    .line 12
    iput-object p6, p0, Lbe/j;->e:Lod/c;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, Lud/p;

    .line 2
    .line 3
    iget-object v0, p1, Lud/p;->k:Lpd/k;

    .line 4
    .line 5
    sget-object v1, Lpd/k;->M:Lpd/k;

    .line 6
    .line 7
    if-ne v0, v1, :cond_2

    .line 8
    .line 9
    iget-object v0, p0, Lbe/j;->a:Lbe/i;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lbe/i;->test(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    iget-object v0, p0, Lbe/j;->b:Lud/r;

    .line 18
    .line 19
    iget-object v1, p0, Lbe/j;->c:Lud/r;

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    iget-object v2, v1, Lud/r;->l:Lud/e;

    .line 24
    .line 25
    iget-object v2, v2, Lud/e;->k:Lud/u;

    .line 26
    .line 27
    iget-object v3, p0, Lbe/j;->d:Lqd/j;

    .line 28
    .line 29
    invoke-static {v2, v3}, Lod/a;->e(Lud/u;Lqd/j;)Lod/a;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    sget-object v5, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 34
    .line 35
    sget-object v6, Lqd/j;->b:Lqd/g;

    .line 36
    .line 37
    new-instance v6, Lqd/a;

    .line 38
    .line 39
    invoke-direct {v6, v3}, Lqd/a;-><init>(Lqd/j;)V

    .line 40
    .line 41
    .line 42
    const-string v3, "values"

    .line 43
    .line 44
    invoke-static {v2, v4, v3, v5, v6}, Lod/d;->b(Lud/u;Lod/a;Ljava/lang/String;Ljava/util/List;Lqd/j;)Lod/d;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    iget-object v2, v0, Lud/r;->k:Lod/d;

    .line 50
    .line 51
    :goto_0
    new-instance v3, Lpd/n;

    .line 52
    .line 53
    const/4 v4, 0x1

    .line 54
    const/4 v5, 0x0

    .line 55
    invoke-direct {v3, v2, v4, v5}, Lpd/n;-><init>(Lod/d;II)V

    .line 56
    .line 57
    .line 58
    iget-object p1, p1, Lud/p;->l:Lqd/r;

    .line 59
    .line 60
    invoke-virtual {v3, p1}, Lud/p;->d0(Lqd/r;)V

    .line 61
    .line 62
    .line 63
    if-nez v0, :cond_1

    .line 64
    .line 65
    sget-object p1, Lmd/a;->y:Lmd/a;

    .line 66
    .line 67
    invoke-virtual {v3, p1}, Lmd/e;->w(Lmd/a;)V

    .line 68
    .line 69
    .line 70
    :cond_1
    iget-object p1, p0, Lbe/j;->e:Lod/c;

    .line 71
    .line 72
    iget-object p1, p1, Lod/c;->h:Ljava/lang/String;

    .line 73
    .line 74
    new-instance v0, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    const-string v2, "Replace access to removed values field ("

    .line 77
    .line 78
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string p1, ") with \'values()\' method"

    .line 85
    .line 86
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-virtual {v1, p1}, Lnd/b0;->I(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    return-object v3

    .line 97
    :cond_2
    const/4 p1, 0x0

    .line 98
    return-object p1
.end method
