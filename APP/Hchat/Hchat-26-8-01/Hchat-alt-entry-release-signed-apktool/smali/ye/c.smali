.class public final synthetic Lye/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic a:Lud/e;

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(Lud/e;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lye/c;->a:Lud/e;

    .line 5
    .line 6
    iput-boolean p2, p0, Lye/c;->b:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Ljava/lang/String;

    .line 2
    .line 3
    iget-object v0, p0, Lye/c;->a:Lud/e;

    .line 4
    .line 5
    iget-object v1, v0, Lud/e;->k:Lud/u;

    .line 6
    .line 7
    iget-object v0, v0, Lud/e;->m:Lod/a;

    .line 8
    .line 9
    invoke-virtual {v0}, Lod/a;->q()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v2, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v0, "$"

    .line 22
    .line 23
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-static {p1}, Lqd/j;->x(Ljava/lang/String;)Lqd/j;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-static {v1, p1}, Lod/a;->e(Lud/u;Lqd/j;)Lod/a;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {v1, p1}, Lud/u;->f(Lod/a;)Lud/e;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    if-eqz v0, :cond_0

    .line 46
    .line 47
    new-instance p1, Lye/e;

    .line 48
    .line 49
    invoke-direct {p1, v0}, Lye/e;-><init>(Lud/e;)V

    .line 50
    .line 51
    .line 52
    iget-object v0, v0, Lud/e;->u:Ljava/util/List;

    .line 53
    .line 54
    new-instance v1, Lye/b;

    .line 55
    .line 56
    const/4 v2, 0x1

    .line 57
    invoke-direct {v1, p1, v2}, Lye/b;-><init>(Lye/e;I)V

    .line 58
    .line 59
    .line 60
    invoke-interface {v0, v1}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 61
    .line 62
    .line 63
    return-object p1

    .line 64
    :cond_0
    const/16 v0, 0x19

    .line 65
    .line 66
    invoke-static {v1, p1, v0}, Lud/e;->T(Lud/u;Lod/a;I)Lud/e;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iget-boolean v0, p0, Lye/c;->b:Z

    .line 71
    .line 72
    if-eqz v0, :cond_1

    .line 73
    .line 74
    const-string v0, "Added by JADX"

    .line 75
    .line 76
    invoke-virtual {p1, v0}, Lnd/b0;->J(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    :cond_1
    new-instance v0, Lye/e;

    .line 80
    .line 81
    invoke-direct {v0, p1}, Lye/e;-><init>(Lud/e;)V

    .line 82
    .line 83
    .line 84
    return-object v0
.end method
