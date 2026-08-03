.class public final Lr4/f;
.super Lr4/z;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final h:Lv4/i;

.field public i:Lr4/h;


# direct methods
.method public constructor <init>(Lv4/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lr4/z;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr4/f;->h:Lv4/i;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Lr4/f;->i:Lr4/h;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(Lr4/p;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lr4/f;->h:Lv4/i;

    .line 2
    .line 3
    iget-object v0, v0, Lv4/i;->g:Lv4/q;

    .line 4
    .line 5
    iget-object v0, v0, Lv4/q;->k:Lv4/h;

    .line 6
    .line 7
    iget-object v1, p1, Lr4/p;->m:Lr4/g;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object v2, v1, Lr4/g;->h:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, Ljava/util/TreeMap;

    .line 14
    .line 15
    invoke-virtual {v2, v0}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Lr4/h;

    .line 20
    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    iget-object p1, p1, Lr4/p;->o:Lr4/k0;

    .line 24
    .line 25
    new-instance v2, Lr4/h;

    .line 26
    .line 27
    invoke-direct {v2, v0}, Lr4/h;-><init>(Lv4/h;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v2}, Lr4/k0;->k(Lr4/l0;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, v1, Lr4/g;->h:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, Ljava/util/TreeMap;

    .line 36
    .line 37
    invoke-virtual {p1, v0, v2}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    :cond_0
    iput-object v2, p0, Lr4/f;->i:Lr4/h;

    .line 41
    .line 42
    return-void

    .line 43
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    const-string p1, "callSite == null"

    .line 47
    .line 48
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public final b()Lr4/b0;
    .locals 1

    .line 1
    sget-object v0, Lr4/b0;->q:Lr4/b0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()I
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    return v0
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 1
    check-cast p1, Lr4/f;

    .line 2
    .line 3
    iget-object v0, p0, Lr4/f;->h:Lv4/i;

    .line 4
    .line 5
    iget-object p1, p1, Lr4/f;->h:Lv4/i;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lv4/a;->d(Lv4/a;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public final d(Lr4/p;Lz4/d;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lr4/f;->i:Lr4/h;

    .line 2
    .line 3
    invoke-virtual {p1}, Lr4/l0;->f()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {p2}, Lz4/d;->d()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lr4/z;->f()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const/16 v1, 0x20

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Lr4/f;->h:Lv4/i;

    .line 31
    .line 32
    invoke-virtual {v1}, Lv4/i;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const/4 v1, 0x0

    .line 44
    invoke-virtual {p2, v1, v0}, Lz4/d;->b(ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-static {p1}, La/a;->Y0(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const-string v1, "call_site_off: "

    .line 52
    .line 53
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    const/4 v1, 0x4

    .line 58
    invoke-virtual {p2, v1, v0}, Lz4/d;->b(ILjava/lang/String;)V

    .line 59
    .line 60
    .line 61
    :cond_0
    invoke-virtual {p2, p1}, Lz4/d;->k(I)V

    .line 62
    .line 63
    .line 64
    return-void
.end method
