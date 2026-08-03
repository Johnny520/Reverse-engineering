.class public final Lv7/j;
.super Lv7/k;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final i:[Lv7/j;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, Lv7/j;

    .line 2
    .line 3
    const-string v1, "ldpi"

    .line 4
    .line 5
    const/16 v2, 0x78

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lv7/k;-><init>(Ljava/lang/String;I)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lv7/j;

    .line 11
    .line 12
    const-string v2, "mdpi"

    .line 13
    .line 14
    const/16 v3, 0xa0

    .line 15
    .line 16
    invoke-direct {v1, v2, v3}, Lv7/k;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    new-instance v2, Lv7/j;

    .line 20
    .line 21
    const-string v3, "tvdpi"

    .line 22
    .line 23
    const/16 v4, 0xd5

    .line 24
    .line 25
    invoke-direct {v2, v3, v4}, Lv7/k;-><init>(Ljava/lang/String;I)V

    .line 26
    .line 27
    .line 28
    new-instance v3, Lv7/j;

    .line 29
    .line 30
    const-string v4, "hdpi"

    .line 31
    .line 32
    const/16 v5, 0xf0

    .line 33
    .line 34
    invoke-direct {v3, v4, v5}, Lv7/k;-><init>(Ljava/lang/String;I)V

    .line 35
    .line 36
    .line 37
    new-instance v4, Lv7/j;

    .line 38
    .line 39
    const-string v5, "xhdpi"

    .line 40
    .line 41
    const/16 v6, 0x140

    .line 42
    .line 43
    invoke-direct {v4, v5, v6}, Lv7/k;-><init>(Ljava/lang/String;I)V

    .line 44
    .line 45
    .line 46
    new-instance v5, Lv7/j;

    .line 47
    .line 48
    const-string v6, "xxhdpi"

    .line 49
    .line 50
    const/16 v7, 0x1e0

    .line 51
    .line 52
    invoke-direct {v5, v6, v7}, Lv7/k;-><init>(Ljava/lang/String;I)V

    .line 53
    .line 54
    .line 55
    new-instance v6, Lv7/j;

    .line 56
    .line 57
    const-string v7, "xxxhdpi"

    .line 58
    .line 59
    const/16 v8, 0x280

    .line 60
    .line 61
    invoke-direct {v6, v7, v8}, Lv7/k;-><init>(Ljava/lang/String;I)V

    .line 62
    .line 63
    .line 64
    new-instance v7, Lv7/j;

    .line 65
    .line 66
    const-string v8, "anydpi"

    .line 67
    .line 68
    const v9, 0xfffe

    .line 69
    .line 70
    .line 71
    invoke-direct {v7, v8, v9}, Lv7/k;-><init>(Ljava/lang/String;I)V

    .line 72
    .line 73
    .line 74
    new-instance v8, Lv7/j;

    .line 75
    .line 76
    const-string v9, "nodpi"

    .line 77
    .line 78
    const v10, 0xffff

    .line 79
    .line 80
    .line 81
    invoke-direct {v8, v9, v10}, Lv7/k;-><init>(Ljava/lang/String;I)V

    .line 82
    .line 83
    .line 84
    filled-new-array/range {v0 .. v8}, [Lv7/j;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    sput-object v0, Lv7/j;->i:[Lv7/j;

    .line 89
    .line 90
    return-void
.end method
