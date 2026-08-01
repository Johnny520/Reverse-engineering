.class public abstract Lxc1;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field public static final a:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lkl;->y:Lq91;

    .line 8
    .line 9
    new-instance v2, Luo0;

    .line 10
    .line 11
    invoke-direct {v2, v1, v0}, Luo0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    sget-object v1, Lkl;->E:Lq91;

    .line 15
    .line 16
    new-instance v3, Luo0;

    .line 17
    .line 18
    invoke-direct {v3, v1, v0}, Luo0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    sget-object v1, Lkl;->D:Lq91;

    .line 22
    .line 23
    new-instance v4, Luo0;

    .line 24
    .line 25
    invoke-direct {v4, v1, v0}, Luo0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    sget-object v1, Lkl;->x:Lq91;

    .line 29
    .line 30
    const v5, 0x3c23d70a    # 0.01f

    .line 31
    .line 32
    .line 33
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    move-object v6, v5

    .line 38
    new-instance v5, Luo0;

    .line 39
    .line 40
    invoke-direct {v5, v1, v6}, Luo0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    sget-object v1, Lkl;->F:Lq91;

    .line 44
    .line 45
    new-instance v6, Luo0;

    .line 46
    .line 47
    invoke-direct {v6, v1, v0}, Luo0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    sget-object v1, Lkl;->B:Lq91;

    .line 51
    .line 52
    new-instance v7, Luo0;

    .line 53
    .line 54
    invoke-direct {v7, v1, v0}, Luo0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    sget-object v1, Lkl;->C:Lq91;

    .line 58
    .line 59
    new-instance v8, Luo0;

    .line 60
    .line 61
    invoke-direct {v8, v1, v0}, Luo0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    sget-object v0, Lkl;->z:Lq91;

    .line 65
    .line 66
    const v1, 0x3ecccccd    # 0.4f

    .line 67
    .line 68
    .line 69
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    new-instance v9, Luo0;

    .line 74
    .line 75
    invoke-direct {v9, v0, v1}, Luo0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    sget-object v0, Lkl;->A:Lq91;

    .line 79
    .line 80
    new-instance v10, Luo0;

    .line 81
    .line 82
    invoke-direct {v10, v0, v1}, Luo0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    filled-new-array/range {v2 .. v10}, [Luo0;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 90
    .line 91
    const/16 v2, 0x9

    .line 92
    .line 93
    invoke-static {v2}, Lmd0;->x(I)I

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    invoke-direct {v1, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 98
    .line 99
    .line 100
    invoke-static {v1, v0}, Lmd0;->y(Ljava/util/HashMap;[Luo0;)V

    .line 101
    .line 102
    .line 103
    sput-object v1, Lxc1;->a:Ljava/util/Map;

    .line 104
    .line 105
    return-void
.end method
