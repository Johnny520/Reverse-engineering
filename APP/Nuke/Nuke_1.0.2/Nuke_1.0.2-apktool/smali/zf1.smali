.class public abstract Lzf1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public a:Lyf1;

.field public b:Ljava/lang/String;

.field public final c:Ljava/util/LinkedHashSet;

.field public final d:Ljava/util/LinkedHashSet;

.field public final e:Ljava/util/LinkedHashSet;

.field public final f:Ljava/util/LinkedHashSet;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lzf1;->c:Ljava/util/LinkedHashSet;

    .line 10
    .line 11
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lzf1;->d:Ljava/util/LinkedHashSet;

    .line 17
    .line 18
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lzf1;->e:Ljava/util/LinkedHashSet;

    .line 24
    .line 25
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lzf1;->f:Ljava/util/LinkedHashSet;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public a()Ljava/util/Map;
    .locals 11

    .line 1
    iget-object v0, p0, Lzf1;->b:Ljava/lang/String;

    .line 2
    .line 3
    new-instance v1, Low1;

    .line 4
    .line 5
    const-string v2, "name"

    .line 6
    .line 7
    invoke-direct {v1, v2, v0}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    new-instance v2, Low1;

    .line 11
    .line 12
    const-string v0, "nameCondition"

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-direct {v2, v0, v3}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    move-object v0, v3

    .line 19
    new-instance v3, Low1;

    .line 20
    .line 21
    const-string v4, "modifiers"

    .line 22
    .line 23
    iget-object v5, p0, Lzf1;->c:Ljava/util/LinkedHashSet;

    .line 24
    .line 25
    invoke-direct {v3, v4, v5}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    new-instance v4, Low1;

    .line 29
    .line 30
    const-string v5, "modifiersNot"

    .line 31
    .line 32
    iget-object v6, p0, Lzf1;->d:Ljava/util/LinkedHashSet;

    .line 33
    .line 34
    invoke-direct {v4, v5, v6}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    new-instance v5, Low1;

    .line 38
    .line 39
    const-string v6, "modifiersCondition"

    .line 40
    .line 41
    invoke-direct {v5, v6, v0}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    new-instance v6, Low1;

    .line 45
    .line 46
    const-string v7, "isSynthetic"

    .line 47
    .line 48
    invoke-direct {v6, v7, v0}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    new-instance v7, Low1;

    .line 52
    .line 53
    const-string v8, "isSyntheticNot"

    .line 54
    .line 55
    invoke-direct {v7, v8, v0}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    new-instance v8, Low1;

    .line 59
    .line 60
    const-string v9, "annotations"

    .line 61
    .line 62
    iget-object v10, p0, Lzf1;->e:Ljava/util/LinkedHashSet;

    .line 63
    .line 64
    invoke-direct {v8, v9, v10}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    new-instance v9, Low1;

    .line 68
    .line 69
    const-string v10, "annotationsNot"

    .line 70
    .line 71
    iget-object p0, p0, Lzf1;->f:Ljava/util/LinkedHashSet;

    .line 72
    .line 73
    invoke-direct {v9, v10, p0}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    new-instance v10, Low1;

    .line 77
    .line 78
    const-string p0, "genericString"

    .line 79
    .line 80
    invoke-direct {v10, p0, v0}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    filled-new-array/range {v1 .. v10}, [Low1;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-static {p0}, Lwe1;->q0([Low1;)Ljava/util/Map;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    return-object p0
.end method

.method public final b()V
    .locals 1

    .line 1
    iget-object p0, p0, Lzf1;->a:Lyf1;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lyf1;->c:Z

    .line 7
    .line 8
    :cond_0
    return-void
.end method
