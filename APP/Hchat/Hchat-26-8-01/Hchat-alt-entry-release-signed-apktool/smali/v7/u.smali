.class public final Lv7/u;
.super Lv7/k;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final i:[Lv7/u;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lv7/u;

    .line 2
    .line 3
    const-string v1, "small"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v0, v1, v2}, Lv7/k;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Lv7/u;

    .line 10
    .line 11
    const-string v2, "normal"

    .line 12
    .line 13
    const/4 v3, 0x2

    .line 14
    invoke-direct {v1, v2, v3}, Lv7/k;-><init>(Ljava/lang/String;I)V

    .line 15
    .line 16
    .line 17
    new-instance v2, Lv7/u;

    .line 18
    .line 19
    const-string v3, "large"

    .line 20
    .line 21
    const/4 v4, 0x3

    .line 22
    invoke-direct {v2, v3, v4}, Lv7/k;-><init>(Ljava/lang/String;I)V

    .line 23
    .line 24
    .line 25
    new-instance v3, Lv7/u;

    .line 26
    .line 27
    const-string v4, "xlarge"

    .line 28
    .line 29
    const/4 v5, 0x4

    .line 30
    invoke-direct {v3, v4, v5}, Lv7/k;-><init>(Ljava/lang/String;I)V

    .line 31
    .line 32
    .line 33
    filled-new-array {v0, v1, v2, v3}, [Lv7/u;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    sput-object v0, Lv7/u;->i:[Lv7/u;

    .line 38
    .line 39
    return-void
.end method
