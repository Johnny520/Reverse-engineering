.class public final Ll7/h;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final c:[Ll7/h;


# instance fields
.field public final a:I

.field public final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, Ll7/h;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const-string v2, "public"

    .line 5
    .line 6
    invoke-direct {v0, v1, v2}, Ll7/h;-><init>(ILjava/lang/String;)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Ll7/h;

    .line 10
    .line 11
    const/4 v2, 0x2

    .line 12
    const-string v3, "system"

    .line 13
    .line 14
    invoke-direct {v1, v2, v3}, Ll7/h;-><init>(ILjava/lang/String;)V

    .line 15
    .line 16
    .line 17
    new-instance v2, Ll7/h;

    .line 18
    .line 19
    const/4 v3, 0x4

    .line 20
    const-string v4, "vendor"

    .line 21
    .line 22
    invoke-direct {v2, v3, v4}, Ll7/h;-><init>(ILjava/lang/String;)V

    .line 23
    .line 24
    .line 25
    new-instance v3, Ll7/h;

    .line 26
    .line 27
    const/16 v4, 0x8

    .line 28
    .line 29
    const-string v5, "product"

    .line 30
    .line 31
    invoke-direct {v3, v4, v5}, Ll7/h;-><init>(ILjava/lang/String;)V

    .line 32
    .line 33
    .line 34
    new-instance v4, Ll7/h;

    .line 35
    .line 36
    const/16 v5, 0x10

    .line 37
    .line 38
    const-string v6, "signature"

    .line 39
    .line 40
    invoke-direct {v4, v5, v6}, Ll7/h;-><init>(ILjava/lang/String;)V

    .line 41
    .line 42
    .line 43
    new-instance v5, Ll7/h;

    .line 44
    .line 45
    const/16 v6, 0x20

    .line 46
    .line 47
    const-string v7, "odm"

    .line 48
    .line 49
    invoke-direct {v5, v6, v7}, Ll7/h;-><init>(ILjava/lang/String;)V

    .line 50
    .line 51
    .line 52
    new-instance v6, Ll7/h;

    .line 53
    .line 54
    const/16 v7, 0x40

    .line 55
    .line 56
    const-string v8, "oem"

    .line 57
    .line 58
    invoke-direct {v6, v7, v8}, Ll7/h;-><init>(ILjava/lang/String;)V

    .line 59
    .line 60
    .line 61
    new-instance v7, Ll7/h;

    .line 62
    .line 63
    const/16 v8, 0x80

    .line 64
    .line 65
    const-string v9, "actor"

    .line 66
    .line 67
    invoke-direct {v7, v8, v9}, Ll7/h;-><init>(ILjava/lang/String;)V

    .line 68
    .line 69
    .line 70
    new-instance v8, Ll7/h;

    .line 71
    .line 72
    const/16 v9, 0x100

    .line 73
    .line 74
    const-string v10, "config"

    .line 75
    .line 76
    invoke-direct {v8, v9, v10}, Ll7/h;-><init>(ILjava/lang/String;)V

    .line 77
    .line 78
    .line 79
    filled-new-array/range {v0 .. v8}, [Ll7/h;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    sput-object v0, Ll7/h;->c:[Ll7/h;

    .line 84
    .line 85
    new-instance v1, Ljava/util/HashMap;

    .line 86
    .line 87
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 88
    .line 89
    .line 90
    const/4 v2, 0x0

    .line 91
    :goto_0
    const/16 v3, 0x9

    .line 92
    .line 93
    if-ge v2, v3, :cond_0

    .line 94
    .line 95
    aget-object v3, v0, v2

    .line 96
    .line 97
    iget-object v4, v3, Ll7/h;->b:Ljava/lang/String;

    .line 98
    .line 99
    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    add-int/lit8 v2, v2, 0x1

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_0
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Ll7/h;->a:I

    .line 5
    .line 6
    iput-object p2, p0, Ll7/h;->b:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method
