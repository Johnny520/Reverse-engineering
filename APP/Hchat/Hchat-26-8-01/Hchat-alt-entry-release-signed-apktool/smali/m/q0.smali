.class public final Lm/q0;
.super Lx1/x0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lx1/x0;"
    }
.end annotation


# static fields
.field public static final d:Li2/z;


# instance fields
.field public final a:Lm/n;

.field public final b:Lfg/q;

.field public final c:Lfg/q;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Li2/z;

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    invoke-direct {v0, v1}, Li2/z;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lm/q0;->d:Li2/z;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Lm/n;Lfg/q;Lfg/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm/q0;->a:Lm/n;

    .line 5
    .line 6
    iput-object p2, p0, Lm/q0;->b:Lfg/q;

    .line 7
    .line 8
    iput-object p3, p0, Lm/q0;->c:Lfg/q;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    if-nez p1, :cond_1

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_1
    const-class v1, Lm/q0;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    if-eq v1, v2, :cond_2

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_2
    check-cast p1, Lm/q0;

    .line 18
    .line 19
    iget-object v1, p0, Lm/q0;->a:Lm/n;

    .line 20
    .line 21
    iget-object v2, p1, Lm/q0;->a:Lm/n;

    .line 22
    .line 23
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_3

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_3
    iget-object v1, p0, Lm/q0;->b:Lfg/q;

    .line 31
    .line 32
    iget-object v2, p1, Lm/q0;->b:Lfg/q;

    .line 33
    .line 34
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_4

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_4
    iget-object v1, p0, Lm/q0;->c:Lfg/q;

    .line 42
    .line 43
    iget-object p1, p1, Lm/q0;->c:Lfg/q;

    .line 44
    .line 45
    invoke-static {v1, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-nez p1, :cond_5

    .line 50
    .line 51
    :goto_0
    const/4 p1, 0x0

    .line 52
    return p1

    .line 53
    :cond_5
    return v0
.end method

.method public final f()Ly0/n;
    .locals 5

    .line 1
    new-instance v0, Lm/t0;

    .line 2
    .line 3
    sget-object v1, Lm/q0;->d:Li2/z;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    sget-object v4, Lm/p1;->h:Lm/p1;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3, v4}, Lm/p0;-><init>(Lfg/l;ZLn/k;Lm/p1;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lm/q0;->a:Lm/n;

    .line 13
    .line 14
    iput-object v1, v0, Lm/t0;->P:Lm/n;

    .line 15
    .line 16
    iput-object v4, v0, Lm/t0;->Q:Lm/p1;

    .line 17
    .line 18
    iget-object v1, p0, Lm/q0;->b:Lfg/q;

    .line 19
    .line 20
    iput-object v1, v0, Lm/t0;->R:Lfg/q;

    .line 21
    .line 22
    iget-object v1, p0, Lm/q0;->c:Lfg/q;

    .line 23
    .line 24
    iput-object v1, v0, Lm/t0;->S:Lfg/q;

    .line 25
    .line 26
    return-object v0
.end method

.method public final g(Ly0/n;)V
    .locals 6

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Lm/t0;

    .line 3
    .line 4
    iget-object p1, v0, Lm/t0;->P:Lm/n;

    .line 5
    .line 6
    iget-object v1, p0, Lm/q0;->a:Lm/n;

    .line 7
    .line 8
    invoke-static {p1, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    const/4 v2, 0x1

    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    iput-object v1, v0, Lm/t0;->P:Lm/n;

    .line 16
    .line 17
    move p1, v2

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    :goto_0
    iget-object v1, v0, Lm/t0;->Q:Lm/p1;

    .line 21
    .line 22
    sget-object v4, Lm/p1;->h:Lm/p1;

    .line 23
    .line 24
    if-eq v1, v4, :cond_1

    .line 25
    .line 26
    iput-object v4, v0, Lm/t0;->Q:Lm/p1;

    .line 27
    .line 28
    move v5, v2

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move v5, p1

    .line 31
    :goto_1
    iget-object p1, p0, Lm/q0;->b:Lfg/q;

    .line 32
    .line 33
    iput-object p1, v0, Lm/t0;->R:Lfg/q;

    .line 34
    .line 35
    iget-object p1, p0, Lm/q0;->c:Lfg/q;

    .line 36
    .line 37
    iput-object p1, v0, Lm/t0;->S:Lfg/q;

    .line 38
    .line 39
    sget-object v1, Lm/q0;->d:Li2/z;

    .line 40
    .line 41
    const/4 v2, 0x1

    .line 42
    const/4 v3, 0x0

    .line 43
    invoke-virtual/range {v0 .. v5}, Lm/p0;->E1(Lfg/l;ZLn/k;Lm/p1;Z)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lm/q0;->a:Lm/n;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    sget-object v2, Lm/p1;->h:Lm/p1;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    const/4 v0, 0x1

    .line 19
    const/16 v3, 0x3c1

    .line 20
    .line 21
    invoke-static {v2, v3, v0}, Leh/a;->h(IIZ)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-static {v0, v1, v2}, Leh/a;->h(IIZ)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-object v3, p0, Lm/q0;->b:Lfg/q;

    .line 31
    .line 32
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    add-int/2addr v3, v0

    .line 37
    mul-int/2addr v3, v1

    .line 38
    iget-object v0, p0, Lm/q0;->c:Lfg/q;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    add-int/2addr v0, v3

    .line 45
    mul-int/2addr v0, v1

    .line 46
    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    add-int/2addr v1, v0

    .line 51
    return v1
.end method
