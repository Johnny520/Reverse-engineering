.class public abstract Lrs;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field public static final a:Lo31;

.field public static final b:Lo31;

.field public static final c:Lo31;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const/high16 v1, 0x43c80000    # 400.0f

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x5

    .line 6
    invoke-static {v0, v1, v2, v3}, Ls91;->O(FFLjava/lang/Object;I)Lo31;

    .line 7
    .line 8
    .line 9
    move-result-object v4

    .line 10
    sput-object v4, Lrs;->a:Lo31;

    .line 11
    .line 12
    invoke-static {v0, v1, v2, v3}, Ls91;->O(FFLjava/lang/Object;I)Lo31;

    .line 13
    .line 14
    .line 15
    sget-object v2, Lxc1;->a:Ljava/util/Map;

    .line 16
    .line 17
    new-instance v2, Lw20;

    .line 18
    .line 19
    const-wide v3, 0x100000001L

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    invoke-direct {v2, v3, v4}, Lw20;-><init>(J)V

    .line 25
    .line 26
    .line 27
    const/4 v5, 0x1

    .line 28
    invoke-static {v0, v1, v2, v5}, Ls91;->O(FFLjava/lang/Object;I)Lo31;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    sput-object v2, Lrs;->b:Lo31;

    .line 33
    .line 34
    new-instance v2, Ld30;

    .line 35
    .line 36
    invoke-direct {v2, v3, v4}, Ld30;-><init>(J)V

    .line 37
    .line 38
    .line 39
    invoke-static {v0, v1, v2, v5}, Ls91;->O(FFLjava/lang/Object;I)Lo31;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    sput-object v0, Lrs;->c:Lo31;

    .line 44
    .line 45
    return-void
.end method

.method public static a()Lvs;
    .locals 6

    .line 1
    sget-object v0, Lxc1;->a:Ljava/util/Map;

    .line 2
    .line 3
    new-instance v0, Ld30;

    .line 4
    .line 5
    const-wide v1, 0x100000001L

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1, v2}, Ld30;-><init>(J)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    const/high16 v2, 0x43c80000    # 400.0f

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    invoke-static {v1, v2, v0, v3}, Ls91;->O(FFLjava/lang/Object;I)Lo31;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sget-object v1, Ln2;->p:Lga;

    .line 22
    .line 23
    sget-object v2, Ln2;->n:Lga;

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Lga;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    sget-object v1, Ln2;->f:Lha;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {v1, v1}, Lga;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    sget-object v1, Ln2;->l:Lha;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    sget-object v1, Ln2;->i:Lha;

    .line 44
    .line 45
    :goto_0
    new-instance v2, Lb71;

    .line 46
    .line 47
    invoke-direct {v2, v3, v3}, Lb71;-><init>(II)V

    .line 48
    .line 49
    .line 50
    new-instance v3, Lvs;

    .line 51
    .line 52
    new-instance v4, Lc91;

    .line 53
    .line 54
    new-instance v5, Lkd;

    .line 55
    .line 56
    invoke-direct {v5, v1, v2, v0}, Lkd;-><init>(Lha;Lsw;Lo31;)V

    .line 57
    .line 58
    .line 59
    const/16 v0, 0x7b

    .line 60
    .line 61
    const/4 v1, 0x0

    .line 62
    invoke-direct {v4, v1, v5, v1, v0}, Lc91;-><init>(Lo30;Lkd;Ljava/util/LinkedHashMap;I)V

    .line 63
    .line 64
    .line 65
    invoke-direct {v3, v4}, Lvs;-><init>(Lc91;)V

    .line 66
    .line 67
    .line 68
    return-object v3
.end method

.method public static b()Ljt;
    .locals 6

    .line 1
    sget-object v0, Lxc1;->a:Ljava/util/Map;

    .line 2
    .line 3
    new-instance v0, Ld30;

    .line 4
    .line 5
    const-wide v1, 0x100000001L

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1, v2}, Ld30;-><init>(J)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    const/high16 v2, 0x43c80000    # 400.0f

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    invoke-static {v1, v2, v0, v3}, Ls91;->O(FFLjava/lang/Object;I)Lo31;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sget-object v1, Ln2;->p:Lga;

    .line 22
    .line 23
    sget-object v2, Ln2;->n:Lga;

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Lga;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    sget-object v1, Ln2;->f:Lha;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {v1, v1}, Lga;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    sget-object v1, Ln2;->l:Lha;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    sget-object v1, Ln2;->i:Lha;

    .line 44
    .line 45
    :goto_0
    new-instance v2, Lb71;

    .line 46
    .line 47
    const/4 v4, 0x2

    .line 48
    invoke-direct {v2, v3, v4}, Lb71;-><init>(II)V

    .line 49
    .line 50
    .line 51
    new-instance v3, Ljt;

    .line 52
    .line 53
    new-instance v4, Lc91;

    .line 54
    .line 55
    new-instance v5, Lkd;

    .line 56
    .line 57
    invoke-direct {v5, v1, v2, v0}, Lkd;-><init>(Lha;Lsw;Lo31;)V

    .line 58
    .line 59
    .line 60
    const/16 v0, 0x7b

    .line 61
    .line 62
    const/4 v1, 0x0

    .line 63
    invoke-direct {v4, v1, v5, v1, v0}, Lc91;-><init>(Lo30;Lkd;Ljava/util/LinkedHashMap;I)V

    .line 64
    .line 65
    .line 66
    invoke-direct {v3, v4}, Ljt;-><init>(Lc91;)V

    .line 67
    .line 68
    .line 69
    return-object v3
.end method
