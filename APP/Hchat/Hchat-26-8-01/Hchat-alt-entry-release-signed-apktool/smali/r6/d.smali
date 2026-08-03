.class public abstract Lr6/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public a:Lr6/c;

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
    iput-object v0, p0, Lr6/d;->c:Ljava/util/LinkedHashSet;

    .line 10
    .line 11
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lr6/d;->d:Ljava/util/LinkedHashSet;

    .line 17
    .line 18
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lr6/d;->e:Ljava/util/LinkedHashSet;

    .line 24
    .line 25
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lr6/d;->f:Ljava/util/LinkedHashSet;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public a()Ljava/util/Map;
    .locals 12

    .line 1
    iget-object v0, p0, Lr6/d;->b:Ljava/lang/String;

    .line 2
    .line 3
    new-instance v1, Lsf/e;

    .line 4
    .line 5
    const-string v2, "name"

    .line 6
    .line 7
    invoke-direct {v1, v2, v0}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    new-instance v2, Lsf/e;

    .line 11
    .line 12
    const-string v0, "nameCondition"

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-direct {v2, v0, v3}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    move-object v0, v3

    .line 19
    new-instance v3, Lsf/e;

    .line 20
    .line 21
    const-string v4, "modifiers"

    .line 22
    .line 23
    iget-object v5, p0, Lr6/d;->c:Ljava/util/LinkedHashSet;

    .line 24
    .line 25
    invoke-direct {v3, v4, v5}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    new-instance v4, Lsf/e;

    .line 29
    .line 30
    const-string v5, "modifiersNot"

    .line 31
    .line 32
    iget-object v6, p0, Lr6/d;->d:Ljava/util/LinkedHashSet;

    .line 33
    .line 34
    invoke-direct {v4, v5, v6}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    new-instance v5, Lsf/e;

    .line 38
    .line 39
    const-string v6, "modifiersCondition"

    .line 40
    .line 41
    invoke-direct {v5, v6, v0}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    new-instance v6, Lsf/e;

    .line 45
    .line 46
    const-string v7, "isSynthetic"

    .line 47
    .line 48
    invoke-direct {v6, v7, v0}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    new-instance v7, Lsf/e;

    .line 52
    .line 53
    const-string v8, "isSyntheticNot"

    .line 54
    .line 55
    invoke-direct {v7, v8, v0}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    new-instance v8, Lsf/e;

    .line 59
    .line 60
    const-string v9, "annotations"

    .line 61
    .line 62
    iget-object v10, p0, Lr6/d;->e:Ljava/util/LinkedHashSet;

    .line 63
    .line 64
    invoke-direct {v8, v9, v10}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    new-instance v9, Lsf/e;

    .line 68
    .line 69
    const-string v10, "annotationsNot"

    .line 70
    .line 71
    iget-object v11, p0, Lr6/d;->f:Ljava/util/LinkedHashSet;

    .line 72
    .line 73
    invoke-direct {v9, v10, v11}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    new-instance v10, Lsf/e;

    .line 77
    .line 78
    const-string v11, "genericString"

    .line 79
    .line 80
    invoke-direct {v10, v11, v0}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    filled-new-array/range {v1 .. v10}, [Lsf/e;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-static {v0}, Ltf/y;->b0([Lsf/e;)Ljava/util/Map;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    return-object v0
.end method
