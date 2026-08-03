.class public final Lv7/v;
.super Lv7/k;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final i:[Lv7/v;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lv7/v;

    .line 2
    .line 3
    const-string v1, "notouch"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v0, v1, v2}, Lv7/k;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Lv7/v;

    .line 10
    .line 11
    const-string v2, "stylus"

    .line 12
    .line 13
    const/4 v3, 0x2

    .line 14
    invoke-direct {v1, v2, v3}, Lv7/k;-><init>(Ljava/lang/String;I)V

    .line 15
    .line 16
    .line 17
    new-instance v2, Lv7/v;

    .line 18
    .line 19
    const-string v3, "finger"

    .line 20
    .line 21
    const/4 v4, 0x3

    .line 22
    invoke-direct {v2, v3, v4}, Lv7/k;-><init>(Ljava/lang/String;I)V

    .line 23
    .line 24
    .line 25
    filled-new-array {v0, v1, v2}, [Lv7/v;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sput-object v0, Lv7/v;->i:[Lv7/v;

    .line 30
    .line 31
    return-void
.end method
